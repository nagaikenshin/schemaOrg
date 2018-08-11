import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.SampleValue;

public class GenerateImpl {

	private static String basePath = "..";
	private static String defDPath = basePath + "/schemaOrgWork/src/";
	private static String implDPath = basePath + "/schemaOrgImpl/src/";
	private static String sqlDPath = basePath + "/sql/m3n3/";
	private static String domaDPath = basePath + "/schemaOrgDoma/src/";
	private static String domaConvDPath = basePath + "/schemaOrgDomaConv/src/";
	private static String gsonDPath = basePath + "/schemaOrgGson/src/";
	private static String pkg1Base = "org.kyojo.schemaOrg";
	private static String pkg2Base = pkg1Base + ".m3n3";
	private static Pattern cfpt = Pattern.compile("(org/kyojo/schemaOrg/m3n3)/(\\w+)/(\\w+)\\.java$");
	private static Pattern expt = Pattern.compile("^(" + pkg2Base.replaceAll("\\.", "\\\\.") + "\\.\\w+)\\.");

	public static void main(String[] args) {
		File pd = new File(defDPath);
		Map<String, ImplData> implDataMap = new HashMap<String, ImplData>();
		try {
			// 古いソースファイルを削除
			File implDir = new File(implDPath);
			FileUtils.deleteDirectory(implDir);
			implDir.mkdir();
			File sqlDir = new File(sqlDPath);
			FileUtils.deleteDirectory(sqlDir);
			sqlDir.mkdir();
			File domaDir = new File(domaDPath);
			FileUtils.deleteDirectory(domaDir);
			domaDir.mkdir();
			File domaConvDir = new File(domaConvDPath);
			FileUtils.deleteDirectory(domaConvDir);
			domaConvDir.mkdir();
			File gsonDir = new File(gsonDPath);
			FileUtils.deleteDirectory(gsonDir);
			gsonDir.mkdir();

			// intarfaceをコピー
			File defDir = new File(defDPath);
			for(File f : defDir.listFiles()) {
				if(f.isDirectory()) {
					File tgtImplDir = new File(implDir, f.getName());
					FileUtils.copyDirectory(f, tgtImplDir);
					File tgtDomaDir = new File(domaDir, f.getName());
					FileUtils.copyDirectory(f, tgtDomaDir);
				}
			}

			retrieve(pd, implDataMap);

			List<String> domaConvNameList = new ArrayList<>();
			List<String> gsonTypeNameList = new ArrayList<>();
			Map<String, String> gsonTypeNameMap = new HashMap<>();
			for(ImplData implData : implDataMap.values()) {
				outputImpl(implData);
				domaConvNameList.addAll(implData.domaConvNameSet);
				gsonTypeNameMap.putAll(implData.gsonTypeNameMap);
				for(String gsonTypeName : implData.gsonTypeNameMap.keySet()) {
					gsonTypeNameList.add(gsonTypeName);
				}
			}

			PrintWriter pw = null;
			try {
				StringBuilder domaFPath = new StringBuilder(domaConvDPath);
				domaFPath.append(pkg2Base.replaceAll("\\.", "/"));
				domaFPath.append(File.separator);
				domaFPath.append("doma");
				domaFPath.append(File.separator);
				domaFPath.append("DomainConvertersProvider.java");
				StringBuilder domaPkg = new StringBuilder(pkg2Base);
				domaPkg.append(".doma");
				Collections.sort(domaConvNameList);

				File cf = new File(domaFPath.toString());
				File cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", domaPkg.toString());
				pw.println();
				pw.println("import org.seasar.doma.DomainConverters;");
				pw.println();
				pw.println("@DomainConverters({");
				for(int idx = 0; idx < domaConvNameList.size(); idx++) {
					pw.printf("	%s.class%s\n", domaConvNameList.get(idx), idx < domaConvNameList.size() - 1 ? "," : "");
				}
				pw.println("})");
				pw.println("public class DomainConvertersProvider {");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				StringBuilder gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("GsonTypeAdapters.properties");
				StringBuilder gsonPkg = new StringBuilder(pkg2Base);
				gsonPkg.append(".gson");
				gsonTypeNameMap.put("java.lang.Boolean", gsonPkg.toString() + ".BooleanDeserializer");
				gsonTypeNameList.add("java.lang.Boolean");
				gsonTypeNameMap.put("java.util.Date", gsonPkg.toString() + ".DateTimeDeserializer");
				gsonTypeNameList.add("java.util.Date");
				gsonTypeNameMap.put("java.sql.Date", gsonPkg.toString() + ".DateDeserializer");
				gsonTypeNameList.add("java.sql.Date");
				gsonTypeNameMap.put("java.sql.Time", gsonPkg.toString() + ".TimeDeserializer");
				gsonTypeNameList.add("java.sql.Time");
				gsonTypeNameMap.put("java.time.OffsetDateTime", gsonPkg.toString() + ".OffsetDateTimeDeserializer");
				gsonTypeNameList.add("java.time.OffsetDateTime");
				gsonTypeNameMap.put("java.time.LocalDate", gsonPkg.toString() + ".LocalDateDeserializer");
				gsonTypeNameList.add("java.time.LocalDate");
				gsonTypeNameMap.put("java.time.LocalTime", gsonPkg.toString() + ".LocalTimeDeserializer");
				gsonTypeNameList.add("java.time.LocalTime");
				Collections.sort(gsonTypeNameList);

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				for(String gsonTypeName : gsonTypeNameList) {
					pw.printf("%s=%s\n", gsonTypeName, gsonTypeNameMap.get(gsonTypeName));
				}

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("BooleanDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class BooleanDeserializer implements JsonDeserializer<Boolean> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\") || jsonElement.getAsString().equals(\"0\")");
				pw.println("				|| jsonElement.getAsString().equals(\"false\") || jsonElement.getAsString().equals(\"FALSE\")) {");
				pw.println("			return false;");
				pw.println("		}");
				pw.println("");
				pw.println("		return true;");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("DateTimeDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import java.text.ParseException;");
				pw.println("import java.text.SimpleDateFormat;");
				pw.println("import java.util.Date;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class DateTimeDeserializer implements JsonDeserializer<Date> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		SimpleDateFormat sdf = new SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss\");");
				pw.println("		try {");
				pw.println("			return sdf.parse(jsonElement.getAsString());");
				pw.println("		} catch(ParseException pe1) {");
				pw.println("			sdf = new SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ssXXX\");");
				pw.println("			try {");
				pw.println("				return sdf.parse(jsonElement.getAsString());");
				pw.println("			} catch(ParseException pe2) {");
				pw.println("				sdf = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");");
				pw.println("				try {");
				pw.println("					return sdf.parse(jsonElement.getAsString());");
				pw.println("				} catch(ParseException pe3) {");
				pw.println("					sdf = new SimpleDateFormat(\"yyyy-MM-dd\");");
				pw.println("					try {");
				pw.println("						return sdf.parse(jsonElement.getAsString());");
				pw.println("					} catch(ParseException pe4) {");
				pw.println("						return null;");
				pw.println("					}");
				pw.println("				}");
				pw.println("			}");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("DateDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class DateDeserializer implements JsonDeserializer<java.sql.Date> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public java.sql.Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		try {");
				pw.println("			return java.sql.Date.valueOf(jsonElement.getAsString());");
				pw.println("		} catch(IllegalArgumentException iae) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("TimeDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class TimeDeserializer implements JsonDeserializer<java.sql.Time> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public java.sql.Time deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		try {");
				pw.println("			return java.sql.Time.valueOf(jsonElement.getAsString());");
				pw.println("		} catch(IllegalArgumentException iae) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("OffsetDateTimeDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import java.text.ParseException;");
				pw.println("import java.text.SimpleDateFormat;");
				pw.println("import java.time.OffsetDateTime;");
				pw.println("import java.time.ZoneId;");
				pw.println("import java.time.format.DateTimeFormatter;");
				pw.println("import java.time.format.DateTimeParseException;");
				pw.println("import java.util.Date;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class OffsetDateTimeDeserializer implements JsonDeserializer<OffsetDateTime> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public OffsetDateTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(\"yyyy-MM-dd'T'HH:mm:ssXXX\");");
				pw.println("		try {");
				pw.println("			return OffsetDateTime.parse(jsonElement.getAsString(), dtf);");
				pw.println("		} catch(DateTimeParseException dtpe1) {");
				pw.println("			SimpleDateFormat sdf = new SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss\");");
				pw.println("			try {");
				pw.println("				Date date = sdf.parse(jsonElement.getAsString());");
				pw.println("				return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());");
				pw.println("			} catch(ParseException pe1) {");
				pw.println("				sdf = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");");
				pw.println("				try {");
				pw.println("					Date date = sdf.parse(jsonElement.getAsString());");
				pw.println("					return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());");
				pw.println("				} catch(ParseException pe2) {");
				pw.println("					sdf = new SimpleDateFormat(\"yyyy-MM-dd'T'HH:mm:ss'Z'\");");
				pw.println("					try {");
				pw.println("						Date date = sdf.parse(jsonElement.getAsString());");
				pw.println("						return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.of(\"UTC\"));");
				pw.println("					} catch(ParseException pe3) {");
				pw.println("						sdf = new SimpleDateFormat(\"yyyy-MM-dd\");");
				pw.println("						try {");
				pw.println("							Date date = sdf.parse(jsonElement.getAsString());");
				pw.println("							return OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());");
				pw.println("						} catch(ParseException pe4) {");
				pw.println("							return null;");
				pw.println("						}");
				pw.println("					}");
				pw.println("				}");
				pw.println("			}");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("LocalDateDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import java.time.LocalDate;");
				pw.println("import java.time.format.DateTimeFormatter;");
				pw.println("import java.time.format.DateTimeParseException;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class LocalDateDeserializer implements JsonDeserializer<LocalDate> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(\"yyyy-MM-dd\");");
				pw.println("		try {");
				pw.println("			return LocalDate.parse(jsonElement.getAsString(), dtf);");
				pw.println("		} catch(DateTimeParseException dtpe1) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;

				//--
				gsonFPath = new StringBuilder(gsonDPath);
				gsonFPath.append(pkg2Base.replaceAll("\\.", "/"));
				gsonFPath.append(File.separator);
				gsonFPath.append("gson");
				gsonFPath.append(File.separator);
				gsonFPath.append("LocalTimeDeserializer.java");

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import java.time.LocalTime;");
				pw.println("import java.time.format.DateTimeFormatter;");
				pw.println("import java.time.format.DateTimeParseException;");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("");
				pw.println("public class LocalTimeDeserializer implements JsonDeserializer<LocalTime> {");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public LocalTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)");
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonNull() || jsonElement.getAsString().equals(\"\")) {");
				pw.println("			return null;");
				pw.println("		}");
				pw.println("");
				pw.println("		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(\"HH:mm:ss\");");
				pw.println("		try {");
				pw.println("			return LocalTime.parse(jsonElement.getAsString(), dtf);");
				pw.println("		} catch(DateTimeParseException dtpe1) {");
				pw.println("			dtf = DateTimeFormatter.ofPattern(\"HH:mm\");");
				pw.println("			try {");
				pw.println("				return LocalTime.parse(jsonElement.getAsString(), dtf);");
				pw.println("			} catch(DateTimeParseException dtpe2) {");
				pw.println("				return null;");
				pw.println("			}");
				pw.println("		}");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;
			} catch(IOException ioe) {
				ioe.printStackTrace();
				System.exit(1);
			} finally {
				if(pw != null) {
					pw.close();
					pw = null;
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void retrieve(File pd, Map<String, ImplData> implDataMap)
			throws IOException, ClassNotFoundException {
		File[] fl = pd.listFiles();
		for(File f: fl) {
			if(f.canRead()) {
				if(f.isDirectory()) {
					retrieve(f, implDataMap);
				} else {
					processFile(f, implDataMap);
				}
			}
		}
	}

	private static void processFile(File inFile, Map<String, ImplData> implDataMap)
			throws IOException, ClassNotFoundException {
		String tgtStr = inFile.getCanonicalPath().replaceAll(Pattern.quote(File.separator), "/");
		Matcher cfmc = cfpt.matcher(tgtStr);
		if(!cfmc.find()) {
			return;
		}

		String pkg = cfmc.group(1).replaceAll("/", ".");
		String extension = cfmc.group(2);
		String type = cfmc.group(3);
		String typeName = pkg + "." + extension + "." + type;
		Class<?> cls = GenerateImpl.class.getClassLoader().loadClass(typeName);
		String typePkg = pkg + "." + extension;
		System.out.println(cls.getName());

		String orgType = type;
		if((type.equals("Clazz") || type.equals("Container"))
				|| (orgType.equals("DataType") || orgType.equals("Container"))) {
			type = "Impl";
			typeName = pkg + "." + extension + "." + type;
		}

		Class<?>[] ics = cls.getClasses();
		for(Class<?> ic : ics) {
			System.out.println(ic.getName());
			if(ic.isInterface()) {
				// インターフェースの情報取得
				ImplData implData = null;
				String implSmplName = ic.getAnnotation(ConstantizedName.class).value();
				String implName = typePkg + "." + StringUtils.uncapitalize(type)
						+ "." + implSmplName;
				if((orgType.equals("Clazz") || orgType.equals("Container"))
						|| (orgType.equals("DataType") || orgType.equals("Container"))) {
					if(implDataMap.containsKey(implName)) {
						implData = implDataMap.get(implName);
						implData.orgTypes.add(orgType);
					}
				}
				if(implData == null) {
					implData = new ImplData();
					implData.extension = extension;
					implData.typePkg = typePkg;
					implData.type = type;
					implData.typeName = typeName;
					implData.orgTypes.add(orgType);
					implData.icSmplName = ic.getSimpleName();
					implData.icSmplCml = ic.getAnnotation(CamelizedName.class).value();
					implData.implName = implName;
					implData.implSmplName = implSmplName;
					implDataMap.put(implName, implData);
				}

				Lib.retrieveInterfaces(ic, implData, 0, -1);
			}
		}
	}

	private static void outputImpl(ImplData implData) {
		String extension = implData.extension;
		String typePkg = implData.typePkg;
		String type = implData.type;
		String typeName = implData.typeName;
		Set<String> orgTypes = implData.orgTypes;
		String icSmplName = implData.icSmplName;
		// String icSmplCml = implData.icSmplCml;
		String implSmplName = implData.implSmplName;
		Map<String, Method[]> gsMap = implData.gsMap;
		Map<String, Method> oMap = implData.oMap;
		Map<String, Class<?>> pMap = implData.pMap;
		Map<String, String> ntvAtMap = implData.ntvAtMap;

		// Listのメソッド優先で残す
		Set<String> withLists = new HashSet<>();
		for(Map.Entry<String, Method[]> ent : gsMap.entrySet()) {
			if(gsMap.containsKey(ent.getKey() + "list")) {
				Method[] sms = ent.getValue();
				Method[] lms = gsMap.get(ent.getKey() + "list");
				if(sms[0].getDeclaringClass().equals(lms[0].getDeclaringClass())) {
					withLists.add(ent.getKey());
				} else {
					// オーバーロードで重複するもの
					// CreativeWorkのCommentとReviewのみ -> 個別対応
					// System.out.println("single method: " + sms[0]);
					// System.out.println("list method: " + lms[0]);
				}
			}
		}
		for(String key : withLists) {
			gsMap.remove(key);
		}

		List<String> gsNameList = new ArrayList<>();
		for(Map.Entry<String, Class<?>> ent : pMap.entrySet()) {
			if(ent.getKey().equals("seq") || ent.getKey().equals("refSeq") || ent.getKey().equals("refAcr")
					|| ent.getKey().equals("createdAt") || ent.getKey().equals("createdBy")
					|| ent.getKey().equals("updatedAt") || ent.getKey().equals("updatedBy")
					|| ent.getKey().equals("expiredAt") || ent.getKey().equals("expiredBy")) {
				// gsNameListには入れない
				continue;
			}
			gsNameList.add(ent.getValue().getSimpleName());
		}
		Collections.sort(gsNameList);

		// 入出力パス等
		String[] pes = typeName.split("\\.");
		StringBuilder javaFPath = new StringBuilder(implDPath);
		StringBuilder implPkg = new StringBuilder();
		for(int pei = 0; pei < pes.length - 1; pei++) {
			javaFPath.append(pes[pei]);
			javaFPath.append(File.separator);
			implPkg.append(pes[pei]);
			implPkg.append(".");
		}
		javaFPath.append(StringUtils.uncapitalize(type));
		javaFPath.append(File.separator);
		javaFPath.append(implSmplName);
		javaFPath.append(".java");
		System.out.println(javaFPath.toString());
		implPkg.append(StringUtils.uncapitalize(type));

		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			// java出力ファイルオープン
			File cf = new File(javaFPath.toString());
			File cd = cf.getParentFile();
			if(!cd.exists()) {
				cd.mkdirs();
			}
			pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
			pw.printf("package %s;\n", implPkg.toString());
			pw.println();

			// インポート文の作成
			List<String> imptList = new ArrayList<String>();
			imptList.add(pkg1Base + ".SimpleJsonBuilder");
			if(gsMap.containsKey("name")) {
				imptList.add(pkg2Base + ".core.impl.NAME");
				// imptList.add(pkgBase + ".core.dataType.TEXT");
				imptList.add(pkg2Base + ".core.impl.TEXT");
			} else if(gsMap.containsKey("text")) {
				if(!extension.equals("core") || !orgTypes.contains("Container")
						|| !icSmplName.equals("Text")) {
					// imptList.add(pkgBase + ".core.dataType.TEXT");
					imptList.add(pkg2Base + ".core.impl.TEXT");
				}
			}
			boolean hasList = false;
			String pre = "";
			if((extension.equals("core") && orgTypes.contains("Container")
						&& (icSmplName.equals("Url") || icSmplName.equals("URL")))
					|| (extension.equals("pending") && orgTypes.contains("Container")
							&& (icSmplName.equals("CssSelectorType") || icSmplName.equals("XPathType")))) {
				// [個別対応]
				imptList.add(typePkg + ".Clazz");
				imptList.add(typePkg + ".Container");
			} else {
				for(Class<?> p : pMap.values()) {
					if(p.getName().startsWith("java.lang")) {
						continue;
					}
					imptList.add(p.getName().replace("$", "."));
				}
			}
			// if(extension.equals("core") && orgTypes.contains("Container")
			//		&& (icSmplName.equals("Category"))) {
			//	imptList.add(pkgBase + ".healthLifesci.impl.PHYSICAL_ACTIVITY_CATEGORY");
			// } else if(extension.equals("core") && orgTypes.contains("Container")
			//		&& (icSmplName.equals("TypeOfBed"))) {
			//	imptList.add(pkgBase + ".pending.impl.BED_TYPE");
			// }
			for(Method[] gsMtds : gsMap.values()) {
				Method gm = gsMtds[0];
				if(gm.getReturnType().equals(List.class)) {
					hasList = true;
				}
			}
			for(String orgType : orgTypes) {
				imptList.add(typePkg + "." + orgType);
			}
			if(oMap.containsKey("value")) {
				imptList.add(SampleValue.class.getName());
			}

			// String等のネイティブ型でget/setできるように
			int ntvGSIfcCase = 0;
			String ntvGSIfcSmpl = null;
			String ntvGSIfcCml = null;
			String ntvGSIfcImpl = null;
			String ntvGSNtvSmpl = null;
			String ntvGSNtvName = null;
			String ntvGSNtvCml = null;
			String ntvGSIfcExt = null;
			ntvGSIfcExt = pkg2Base + ".core";
			if(gsNameList.size() == 0 || (extension.equals("core")
			// if(!gsMap.containsKey("seq") || extension.equals("core")
			// if(extension.equals("core")
						&& (orgTypes.contains("DataType") || (orgTypes.contains("Clazz")
								&& (icSmplName.equals("DataType") || icSmplName.equals("Float")
									|| icSmplName.equals("Integer") || icSmplName.equals("URL")))))
					|| (extension.equals("pending")
						&& (icSmplName.equals("CssSelectorType") || icSmplName.equals("XPathType")))) {
				ntvGSIfcCase = 9;
				ntvAtMap.put(typeName + "." + icSmplName, "");
			} else if(gsMap.containsKey("name")) {
				if(!extension.equals("core")) {
					imptList.add(pkg2Base + ".core.impl.NAME");
				}
				imptList.add(pkg2Base + ".core.DataType");
				ntvGSIfcCase = 1;
				ntvGSIfcSmpl = "Name";
				ntvGSIfcCml = "name";
				ntvGSIfcImpl = "NAME";
				ntvGSNtvSmpl = "String";
				ntvGSNtvName = ntvGSNtvSmpl;
				ntvGSNtvCml = "string";
			} else if(gsMap.containsKey("organizationList".toLowerCase())) {
				imptList.add(pkg2Base + ".core.Container.Name");
				if(!extension.equals("core")) {
					imptList.add(pkg2Base + ".core.impl.ORGANIZATION");
				}
				ntvGSIfcCase = 3;
				ntvGSIfcSmpl = "Organization";
				ntvGSIfcCml = "organization";
				ntvGSIfcImpl = "ORGANIZATION";
				ntvGSNtvSmpl = "String";
				ntvGSNtvName = ntvGSNtvSmpl;
				ntvGSNtvCml = "string";
			} else if(gsMap.containsKey("personList".toLowerCase())) {
				imptList.add(pkg2Base + ".core.Container.Name");
				if(!extension.equals("core")) {
					imptList.add(pkg2Base + ".core.impl.PERSON");
				}
				ntvGSIfcCase = 3;
				ntvGSIfcSmpl = "Person";
				ntvGSIfcCml = "person";
				ntvGSIfcImpl = "PERSON";
				ntvGSNtvSmpl = "String";
				ntvGSNtvName = ntvGSNtvSmpl;
				ntvGSNtvCml = "string";
			} else {
				// 一般のクラスはこの順番でJavaネイティブ型を決定
				List<String> gsNameList2 = new ArrayList<>();
				if(gsMap.containsKey("textlist")) {
					gsNameList2.add("String");
				} else if(gsMap.containsKey("urllist")) {
					gsNameList2.add("String");
				} else if(gsMap.containsKey("datetimelist")) {
					gsNameList2.add("OffsetDateTime");
				} else if(gsMap.containsKey("datelist")) {
					gsNameList2.add("LocalDate");
				} else if(gsMap.containsKey("timelist")) {
					gsNameList2.add("LocalTime");
				} else if(gsMap.containsKey("integerlist")) {
					gsNameList2.add("Long");
				} else if(gsMap.containsKey("fl0atlist")) {
					gsNameList2.add("Double");
				} else if(gsMap.containsKey("numberlist")) {
					gsNameList2.add("Number");
				} else if(gsMap.containsKey("b00leanlist")) {
					gsNameList2.add("Boolean");
				} else {
					gsNameList2 = gsNameList;
				}

				for(String gsName : gsNameList2) {
					if(gsName.equals("Boolean")) {
						gsName = "B00lean";
					} else if(gsName.equals("Class")) {
						gsName = "Clazz";
					} else if(gsName.equals("Double")) {
						gsName = "D0uble";
					} else if(gsName.equals("Long")) {
						gsName = "L0ng";
					}
					if(gsMap.containsKey(gsName.toLowerCase() + "list")) {
						Method sm = gsMap.get(gsName.toLowerCase() + "list")[1];
						ParameterizedType gType = (ParameterizedType)sm.getGenericParameterTypes()[0];
						Type[] aTypes = gType.getActualTypeArguments();
						Class<?> smc = pMap.get(aTypes[0].getTypeName());
						ImplData implData2 = new ImplData();
						Lib.retrieveInterfaces(smc, implData2, 0, 0);
						for(Map.Entry<String, Class<?>> ent2 : implData2.pMap.entrySet()) {
							if(ent2.getKey().endsWith("core.Container$Name")) {
								String implSmplName2 = null;
								if(ent2.getValue().getAnnotation(ConstantizedName.class) == null) {
									System.out.println("No constantizedName: " + ent2.getValue().getName());
									System.exit(1);
								} else {
									implSmplName2 = smc.getAnnotation(ConstantizedName.class).value().toString();
								}
								imptList.add(pkg2Base + ".core.Container.Name");
								Matcher exmc = expt.matcher(smc.getName());
								exmc.find();
								ntvGSIfcExt = exmc.group(1);
								if(!implSmplName2.equals("URL")) {
									if(!ent2.getValue().getName().startsWith(pkg2Base + "." + extension)) {
										imptList.add(ntvGSIfcExt + ".impl." + implSmplName2);
									}
								}
								ntvGSIfcCase = 3;
								if(implSmplName2.equals("CLASS")) {
									ntvGSIfcSmpl = "Class";
									ntvGSIfcCml = "clazz";
									ntvGSIfcImpl = "CLASS";
									ntvGSNtvSmpl = "String";
									ntvGSNtvName = ntvGSNtvSmpl;
									ntvGSNtvCml = "string";
								} else if(implSmplName2.equals("URL")) {
									ntvGSIfcSmpl = "URL";
									ntvGSIfcCml = "url";
									ntvGSIfcImpl = pkg2Base + ".core.impl.URL";
									ntvGSNtvSmpl = "String";
									ntvGSNtvName = ntvGSNtvSmpl;
									ntvGSNtvCml = "string";
								} else {
									ntvGSIfcSmpl = smc.getSimpleName();
									ntvGSIfcCml = smc.getAnnotation(CamelizedName.class).value().toString();
									ntvGSIfcImpl = implSmplName2;
									ntvGSNtvSmpl = "String";
									ntvGSNtvName = ntvGSNtvSmpl;
									ntvGSNtvCml = "string";
								}
								break;
							}
							if(ntvGSIfcCase > 0) {
								break;
							}
						}
					}
				}
			}
			if(ntvGSIfcCase == 0) {
				if(gsMap.containsKey("textList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Text";
					ntvGSIfcCml = "text";
					ntvGSIfcImpl = "TEXT";
					ntvGSNtvSmpl = "String";
					ntvGSNtvName = ntvGSNtvSmpl;
					ntvGSNtvCml = "string";
				} else if(gsMap.containsKey("urlList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "URL";
					ntvGSIfcCml = "url";
					ntvGSIfcImpl = pkg2Base + ".core.impl.URL";
					ntvGSNtvSmpl = "String";
					ntvGSNtvName = ntvGSNtvSmpl;
					ntvGSNtvCml = "string";
				} else if(gsMap.containsKey("cssSelectorTypeList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "CssSelectorType";
					ntvGSIfcCml = "cssSelectorType";
					ntvGSIfcImpl = "CSS_SELECTOR_TYPE";
					ntvGSNtvSmpl = "String";
					ntvGSNtvName = ntvGSNtvSmpl;
					ntvGSNtvCml = "string";
				} else if(gsMap.containsKey("xPathTypeList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "XPathType";
					ntvGSIfcCml = "xPathType";
					ntvGSIfcImpl = "X_PATH_TYPE";
					ntvGSNtvSmpl = "String";
					ntvGSNtvName = ntvGSNtvSmpl;
					ntvGSNtvCml = "string";
				// } else if(gsMap.containsKey("b00leanList".toLowerCase())) {
				} else if(gsMap.containsKey("numberList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Number";
					ntvGSIfcCml = "number";
					ntvGSIfcImpl = "NUMBER";
					ntvGSNtvSmpl = "BigDecimal";
					ntvGSNtvName = "java.math.BigDecimal";
					ntvGSNtvCml = "number";
				} else if(gsMap.containsKey("fl0atList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Float";
					ntvGSIfcCml = "fl0at";
					ntvGSIfcImpl = "FLOAT";
					ntvGSNtvSmpl = "D0uble";
					ntvGSNtvName = "Double";
					ntvGSNtvCml = "d0uble";
				} else if(gsMap.containsKey("integerList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Integer";
					ntvGSIfcCml = "integer";
					ntvGSIfcImpl = "INTEGER";
					ntvGSNtvSmpl = "L0ng";
					ntvGSNtvName = "Long";
					ntvGSNtvCml = "l0ng";
				} else if(gsMap.containsKey("b00leanList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Boolean";
					ntvGSIfcCml = "b00lean";
					ntvGSIfcImpl = "BOOLEAN";
					ntvGSNtvSmpl = "B00lean";
					ntvGSNtvName = "java.lang.Boolean";
					ntvGSNtvCml = "b00lean";
				} else if(gsMap.containsKey("dateTimeList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "DateTime";
					ntvGSIfcCml = "dateTime";
					ntvGSIfcImpl = "DATE_TIME";
					ntvGSNtvSmpl = "OffsetDateTime";
					ntvGSNtvName = "java.time.OffsetDateTime";
					ntvGSNtvCml = "dateTime";
				} else if(gsMap.containsKey("dateList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Date";
					ntvGSIfcCml = "date";
					ntvGSIfcImpl = "DATE";
					ntvGSNtvSmpl = "LocalDate";
					ntvGSNtvName = "java.time.LocalDate";
					ntvGSNtvCml = "date";
				} else if(gsMap.containsKey("timeList".toLowerCase())) {
					ntvGSIfcCase = 2;
					ntvGSIfcSmpl = "Time";
					ntvGSIfcCml = "time";
					ntvGSIfcImpl = "TIME";
					ntvGSNtvSmpl = "LocalTime";
					ntvGSNtvName = "java.time.LocalTime";
					ntvGSNtvCml = "time";
				}
			}

			if(!extension.equals("core")) {
				if(gsMap.containsKey("b00lean") || gsMap.containsKey("b00leanlist")) {
					imptList.add(pkg2Base + ".core.impl.BOOLEAN");
				}
				if(gsMap.containsKey("text") || gsMap.containsKey("textlist")) {
					imptList.add(pkg2Base + ".core.impl.TEXT");
				}
				if(gsMap.containsKey("datetime") || gsMap.containsKey("datetimelist")) {
					imptList.add(pkg2Base + ".core.impl.DATE_TIME");
				}
				if(gsMap.containsKey("date") || gsMap.containsKey("datelist")) {
					imptList.add(pkg2Base + ".core.impl.DATE");
				}
				if(gsMap.containsKey("time") || gsMap.containsKey("timelist")) {
					imptList.add(pkg2Base + ".core.impl.TIME");
				}
				if(gsMap.containsKey("integer") || gsMap.containsKey("integerlist")) {
					imptList.add(pkg2Base + ".core.impl.INTEGER");
				}
				if(gsMap.containsKey("fl0at") || gsMap.containsKey("fl0atlist")) {
					imptList.add(pkg2Base + ".core.impl.FLOAT");
				}
				if(gsMap.containsKey("number") || gsMap.containsKey("numberlist")) {
					imptList.add(pkg2Base + ".core.impl.NUMBER");
				}
			}

			Collections.sort(imptList);
			if(hasList|| gsMap.containsKey("name")) {
				pw.println("import java.util.ArrayList;");
				pw.println("import java.util.List;");
				pw.println();
			}
			Set<String> alrdImptSet = new HashSet<String>();
			Set<String> sameIfcSet = new HashSet<String>();
			for(String orgType : orgTypes) {
				String sameIfc = typePkg + "." + orgType + "." + icSmplName;
				sameIfcSet.add(sameIfc);
			}
			for(String imptName : imptList) {
				if(!alrdImptSet.contains(imptName)
						&& !imptName.startsWith("java.lang.")
						&& !imptName.equals("java.util.Date")
						&& !imptName.equals("java.math.BigDecimal")
						&& !sameIfcSet.contains(imptName)) {
					pw.printf("import %s;\n", imptName);
				}
				alrdImptSet.add(imptName);
			}
			pw.println();

			// クラス宣言
			List<String> orgTypeList = new ArrayList<String>();
			if(icSmplName.equals("Url") || icSmplName.equals("URL")) {
				orgTypeList.add("Clazz.URL");
				orgTypeList.add("Container.Url");
			} else {
				for(String orgType : orgTypes) {
					orgTypeList.add(orgType + "." + icSmplName);
				}
			}
			Collections.sort(orgTypeList);
			pw.printf("public class %s implements %s {\n", implSmplName,
					StringUtils.join(orgTypeList, ", "));
			pw.println();
			// long uid = ObjectStreamClass.lookup(ic).getSerialVersionUID();
			pw.printf("	private static final long serialVersionUID = %dL;\n", 1);
			pw.println();

			if(extension.equals("core") && orgTypes.contains("DataType")) {
				// [個別対応]
				if (icSmplName.equals("Boolean")) {
					pre = "java.lang.";
				} else if(icSmplName.equals("Number")) {
					pre = "java.math.";
				} else if(icSmplName.equals("Date")
						|| icSmplName.equals("DateTime")
						|| icSmplName.equals("Time")) {
					// pre = "java.time.";
				}
			}

			if(gsMap.containsKey("seq")) {
				pw.println("	public Long seq;");
				pw.println("	public Long refSeq;");
				pw.println("	public String refAcr;");
				pw.println("	public java.util.Date createdAt;");
				pw.println("	public Long createdBy;");
				pw.println("	public java.util.Date updatedAt;");
				pw.println("	public Long updatedBy;");
				pw.println("	public java.util.Date expiredAt;");
				pw.println("	public Long expiredBy;");
			}

			Set<String> alrdPrpSet = new HashSet<String>();
			for(String gsName : gsNameList) {
				// if(alrdPrpSet.contains(gsName.toLowerCase())) {
				//	continue;
				// }

				if(gsName.equals("Boolean")) {
					gsName = "B00lean";
				} else if(gsName.equals("Double")) {
					gsName = "D0uble";
				} else if(gsName.equals("Long")) {
					gsName = "L0ng";
				} else if(gsName.equals("Class")) {
					gsName = "Clazz";
				}
				System.out.println(icSmplName + ", " + gsName);

				if(extension.equals("core") && orgTypes.contains("Clazz")
						&& (icSmplName.equals("Integer")
							|| icSmplName.equals("Float"))
						&& gsName.equals("Number")) {
					// [個別対応]
					alrdPrpSet.add(gsName.toLowerCase());
					continue;
				}

				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Number")
						&& gsName.equals("BigDecimal")) {
					gsName = "Number";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("DateTime")
						&& gsName.equals("OffsetDateTime")) {
					gsName = "DateTime";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Date")
						&& gsName.equals("LocalDate")) {
					gsName = "Date";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Time")
						&& gsName.equals("LocalTime")) {
					gsName = "Time";
				}

				if(gsMap.containsKey(gsName.toLowerCase())
						&& !alrdPrpSet.contains(gsName.toLowerCase())) {
					Method sm = gsMap.get(gsName.toLowerCase())[1];
					Parameter smp = sm.getParameters()[0];
					Type smt = smp.getType();
					Class<?> smc = pMap.get(smt.getTypeName());
					String pre2 = pre;
					if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
						pre2 = "Container.";
					}
					pw.printf("	public %s%s %s;\n", pre2, smc.getSimpleName(), smp.getName());
					alrdPrpSet.add(gsName.toLowerCase());
				} else if(gsMap.containsKey(gsName.toLowerCase() + "list")) {
					Method sm = gsMap.get(gsName.toLowerCase() + "list")[1];
					Parameter smp = sm.getParameters()[0];
					ParameterizedType gType = (ParameterizedType)sm.getGenericParameterTypes()[0];
					Type[] aTypes = gType.getActualTypeArguments();
					Class<?> smc = pMap.get(aTypes[0].getTypeName());
					String pre2 = pre;
					if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
						pre2 = "Clazz.";
					} else if(orgTypes.contains("DataType") && icSmplName.equals("Text")) {
						pre2 = "DataType.";
					}
					pw.printf("	public List<%s%s> %s;\n", pre2, smc.getSimpleName(), smp.getName());
					alrdPrpSet.add(gsName.toLowerCase() + "list");
				} else {
					System.out.println("method " + gsName + " not found in "
							+ typeName + "," + icSmplName + ". (100)");
					System.exit(1);
				}
			}
			if(pMap.size() > 0 || gsMap.containsKey("seq")) {
				pw.println();
			}

			// 引数なしコンストラクタ
			pw.printf("	public %s() {\n", implSmplName);
			pw.println("	}");
			pw.println();

			if(gsMap.containsKey("seq")) {
				if(extension.equals("core") && orgTypes.contains("Clazz")
						&& icSmplName.equals("Integer")) {
					// IntegerはLong型が被るので追加しない
				} else {
					pw.printf("	public %s(Long seq) {\n", implSmplName);
					pw.println("		setSeq(seq);");
					pw.println("	}");
					pw.println();
				}
			}

			switch(ntvGSIfcCase) {
			case 1:
				pw.printf("	public %s(String string) {\n", implSmplName);
				pw.println("		setName(new NAME(new TEXT(string)));");
				pw.println("	}");
				pw.println();
				pw.println("	@Override");
				pw.println("	public String getString() {");
				pw.println("		if(name == null) return null;");
				pw.println();
				pw.println("		List<DataType.Text> textList = name.getTextList();");
				pw.println("		if(textList == null || textList.size() == 0 || textList.get(0) == null) {");
				pw.println("			return null;");
				pw.println("		} else {");
				pw.println("			return textList.get(0).getString();");
				pw.println("		}");
				pw.println("	}");
				pw.println();
				pw.println("	@Override");
				pw.println("	public void setString(String string) {");
				pw.println("		if(name == null) name = new NAME();");
				pw.println();
				pw.println("		List<DataType.Text> textList = name.getTextList();");
				pw.println("		if(textList == null) {");
				pw.println("			textList = new ArrayList<DataType.Text>();");
				pw.println("			name.setTextList(textList);");
				pw.println("		}");
				pw.println("		if(textList.size() == 0) {");
				pw.println("			textList.add(new TEXT(string));");
				pw.println("		} else {");
				pw.println("			textList.set(0, new TEXT(string));");
				pw.println("		}");
				pw.println("	}");
				pw.println();
				break;
			case 2:
			case 3:
				if(!implSmplName.equals("TEXT")
						&& !((ntvGSNtvSmpl.equals("String") && gsMap.containsKey("textlist"))
								|| (ntvGSNtvSmpl.equals("B00lean") && gsMap.containsKey("b00leanlist"))
								|| (ntvGSNtvSmpl.equals("BigDecimal") && gsMap.containsKey("numberlist"))
								|| (ntvGSNtvSmpl.equals("D0uble") && gsMap.containsKey("fl0atlist"))
								|| (ntvGSNtvSmpl.equals("L0ng") && gsMap.containsKey("integerlist"))
								|| (ntvGSNtvSmpl.equals("OffsetDateTime") && gsMap.containsKey("datetimelist"))
								|| (ntvGSNtvSmpl.equals("LocalDate") && gsMap.containsKey("datelist"))
								|| (ntvGSNtvSmpl.equals("LocalTime") && gsMap.containsKey("timelist")))) {
					pw.printf("	public %s(%s %s) {\n", implSmplName, ntvGSNtvName, ntvGSNtvCml);
					pw.printf("		this(new %s(%s));\n", ntvGSIfcImpl, ntvGSNtvCml);
					pw.println("	}");
					pw.println();
					if(ntvGSIfcCase == 2) {
						String smplName = ntvGSNtvSmpl;
						if(ntvGSNtvSmpl.equals("Boolean")) {
							smplName = "B00lean";
						} else if(ntvGSNtvSmpl.equals("Double")) {
							smplName = "D0uble";
						} else if(ntvGSNtvSmpl.equals("Long")) {
							smplName = "L0ng";
						} else if(ntvGSNtvSmpl.equals("BigDecimal")) {
							smplName = "Number";
						} else if(ntvGSNtvSmpl.equals("OffsetDateTime")) {
							smplName = "DateTime";
						} else if(ntvGSNtvSmpl.equals("LocalDate")) {
							smplName = "Date";
						} else if(ntvGSNtvSmpl.equals("LocalTime")) {
							smplName = "Time";
						}
						if(!implSmplName.equals("TEXT")) {
							pw.printf("	public %s get%s() {\n", ntvGSNtvName, smplName);
							pw.printf("		if(%sList == null || %sList.size() == 0 || %sList.get(0) == null) {\n",
									ntvGSIfcCml, ntvGSIfcCml, ntvGSIfcCml);
							pw.println("			return null;");
							pw.println("		} else {");
							pw.printf("			return %sList.get(0).get%s();\n", ntvGSIfcCml, smplName);
							pw.println("		}");
							pw.println("	}");
							pw.println("");
							pw.printf("	public void set%s(%s %s) {\n", smplName, ntvGSNtvName, ntvGSNtvCml);
							pw.printf("		if(%sList == null) {\n", ntvGSIfcCml);
							pw.printf("			%sList = new ArrayList<%s>();\n", ntvGSIfcCml, ntvGSIfcSmpl);
							pw.println("		}");
							pw.printf("		if(%sList.size() == 0) {\n", ntvGSIfcCml);
							pw.printf("			%sList.add(new %s(%s));\n", ntvGSIfcCml, ntvGSIfcImpl, ntvGSNtvCml);
							pw.println("		} else {");
							pw.printf("			%sList.set(0, new %s(%s));\n", ntvGSIfcCml, ntvGSIfcImpl, ntvGSNtvCml);
							pw.println("		}");
							pw.println("	}");
							pw.println("");
						}
					} else {
						pw.printf("	public %s get%s() {\n", ntvGSNtvName, ntvGSNtvSmpl);
						pw.printf("		if(%sList == null || %sList.size() == 0 || %sList.get(0) == null) {\n",
								ntvGSIfcCml, ntvGSIfcCml, ntvGSIfcCml);
						pw.println("			return null;");
						pw.println("		} else {");
						pw.printf("			Name name = %sList.get(0).getName();\n", ntvGSIfcCml, ntvGSNtvSmpl);
						pw.println("			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {");
						pw.println("				return null;");
						pw.println("			} else {");
						pw.println("				return name.getTextList().get(0).getString();");
						pw.println("			}");
						pw.println("		}");
						pw.println("	}");
						pw.println("");
						pw.printf("	public void set%s(%s %s) {\n", ntvGSNtvSmpl, ntvGSNtvName, ntvGSNtvCml);
						pw.printf("		if(%sList == null) {\n", ntvGSIfcCml);
						pw.printf("			%sList = new ArrayList<%s>();\n", ntvGSIfcCml, ntvGSIfcSmpl);
						pw.println("		}");
						pw.printf("		if(%sList.size() == 0) {\n", ntvGSIfcCml);
						pw.printf("			%sList.add(new %s(%s));\n", ntvGSIfcCml, ntvGSIfcImpl, ntvGSNtvCml);
						pw.println("		} else {");
						pw.printf("			%sList.set(0, new %s(%s));\n", ntvGSIfcCml, ntvGSIfcImpl, ntvGSNtvCml);
						pw.println("		}");
						pw.println("	}");
						pw.println("");
					}
				}
				break;
			default:
				break;
			}

			alrdPrpSet = new HashSet<String>();
			for(String gsName : gsNameList) {
				// if(alrdPrpSet.contains(gsName.toLowerCase())) {
				//	continue;
				// }

				if(gsName.equals("Boolean")) {
					gsName = "B00lean";
				} else if(gsName.equals("Double")) {
					gsName = "D0uble";
				} else if(gsName.equals("Long")) {
					gsName = "L0ng";
				} else if(gsName.equals("Class")) {
					gsName = "Clazz";
				}

				if(extension.equals("core") && orgTypes.contains("Clazz")
						&& (icSmplName.equals("Integer")
							|| icSmplName.equals("Float"))
						&& gsName.equals("Number")) {
					// [個別対応]
					alrdPrpSet.add(gsName.toLowerCase());
					continue;
				}

				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Number")
						&& gsName.equals("BigDecimal")) {
					gsName = "Number";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("DateTime")
						&& gsName.equals("OffsetDateTime")) {
					gsName = "DateTime";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Date")
						&& gsName.equals("LocalDate")) {
					gsName = "Date";
				}
				if(extension.equals("core") && orgTypes.contains("DataType")
						&& icSmplName.equals("Time")
						&& gsName.equals("LocalTime")) {
					gsName = "Time";
				}

				if(gsMap.containsKey(gsName.toLowerCase())
						&& !alrdPrpSet.contains(gsName.toLowerCase())) {
					Method sm = gsMap.get(gsName.toLowerCase())[1];
					Parameter smp = sm.getParameters()[0];
					Type smt = smp.getType();
					Class<?> smc = pMap.get(smt.getTypeName());
					String smplName = smc.getSimpleName();
					if(smplName.equals("Boolean")) {
						smplName = "B00lean";
					} else if(smplName.equals("Class")) {
						smplName = "Clazz";
					} else if(smplName.equals("Double")) {
						smplName = "D0uble";
					} else if(smplName.equals("Long")) {
						smplName = "L0ng";
					} else if(smplName.equals("BigDecimal")) {
						smplName = "Number";
					} else if(smplName.equals("OffsetDateTime")) {
						pw.printf("	public %s(java.util.Date dateTime) {\n", implSmplName);
						pw.println("		if(dateTime != null) {");
						pw.printf("			setDateTime(OffsetDateTime.ofInstant(dateTime.toInstant(), java.time.ZoneId.systemDefault()));\n");
						pw.println("		}");
						pw.println("	}");
						pw.println();
						smplName = "DateTime";
					} else if(smplName.equals("LocalDate")) {
						pw.printf("	public %s(java.util.Date date) {\n", implSmplName);
						pw.println("		if(date != null) {");
						pw.printf("			setDate(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate());\n");
						pw.println("		}");
						pw.println("	}");
						pw.println();
						smplName = "Date";
					} else if(smplName.equals("LocalTime")) {
						pw.printf("	public %s(java.util.Date time) {\n", implSmplName);
						pw.println("		if(time != null) {");
						pw.printf("			setTime(java.time.LocalDateTime.ofInstant(time.toInstant(), java.time.ZoneId.systemDefault()).toLocalTime());\n");
						pw.println("		}");
						pw.println("	}");
						pw.println();
						smplName = "Time";
					}

					String pre2 = pre;
					if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
						pre2 = "Container.";
					}
					pw.printf("	public %s(%s%s %s) {\n", implSmplName,
							pre2, smc.getSimpleName(), smp.getName());
					pw.printf("		set%s(%s);\n", smplName, smp.getName());
					pw.println("	}");
					pw.println();
					if(implSmplName.equals("TEXT") && smc.getSimpleName().equals("String")) {
						// [個別対応]
						pw.println("	public String getString() {");
						pw.println("		if(string != null) {");
						pw.println("			return string;");
						pw.println("		} else if(textList != null && textList.size() > 0 && textList.get(0) != null) {");
						pw.println("			return textList.get(0).getString();");
						pw.println("		} else {");
						pw.println("			return null;");
						pw.println("		}");
						pw.println("	}");
						pw.println();
					} else if(!(implSmplName.equals("COMMENT") && smc.getSimpleName().equals("Comment"))
							&& !(implSmplName.equals("REVIEW") && smc.getSimpleName().equals("Review"))) {
						// [個別対応]
						pw.println("	@Override");
						pw.printf("	public %s%s get%s() {\n", pre2,
								smc.getSimpleName(), smplName);
						pw.printf("		return %s;\n", smp.getName());
						pw.println("	}");
						pw.println();
					}
					pw.println("	@Override");
					pw.printf("	public void set%s(%s%s %s) {\n", smplName,
							pre2, smc.getSimpleName(), smp.getName());
					pw.printf("		this.%s = %s;\n", smp.getName(), smp.getName());
					pw.println("	}");
					pw.println();
					alrdPrpSet.add(gsName.toLowerCase());
				} else if(gsMap.containsKey(gsName.toLowerCase() + "list")) {
					Method sm = gsMap.get(gsName.toLowerCase() + "list")[1];
					Parameter smp = sm.getParameters()[0];
					ParameterizedType gType = (ParameterizedType)sm.getGenericParameterTypes()[0];
					Type[] aTypes = gType.getActualTypeArguments();
					Class<?> smc = pMap.get(aTypes[0].getTypeName());

					String smplName = smc.getSimpleName();
					if(smplName.equals("Text")) {
						if(!gsMap.containsKey("name") && !implSmplName.equals("TEXT")) {
							pw.printf("	public %s(String string) {\n", implSmplName);
							pw.printf("		this(new TEXT(string));\n");
							pw.println("	}");
							pw.println();
						}
					} else if(smplName.equals("Number")) {
						pw.printf("	public %s(java.math.BigDecimal number) {\n", implSmplName);
						pw.printf("		this(new NUMBER(number));\n");
						pw.println("	}");
						pw.println();
					} else if(smplName.equals("Float")) {
						pw.printf("	public %s(Double d0uble) {\n", implSmplName);
						pw.printf("		this(new FLOAT(d0uble));\n");
						pw.println("	}");
						pw.println();
						// smplName = "D0uble";
					} else if(smplName.equals("Integer")) {
						pw.printf("	public %s(Long l0ng) {\n", implSmplName);
						pw.printf("		this(new INTEGER(l0ng));\n");
						pw.println("	}");
						pw.println();
						// smplName = "L0ng";
					} else if(smplName.equals("Boolean")) {
						pw.printf("	public %s(java.lang.Boolean b00lean) {\n", implSmplName);
						pw.printf("		this(new BOOLEAN(b00lean));\n");
						pw.println("	}");
						pw.println();
						smplName = "B00lean";
					} else if(smplName.equals("DateTime")) {
						pw.printf("	public %s(java.util.Date dateTime) {\n", implSmplName);
						pw.printf("		this(new DATE_TIME(dateTime));\n");
						pw.println("	}");
						pw.println();
						pw.printf("	public %s(java.time.OffsetDateTime dateTime) {\n", implSmplName);
						pw.printf("		this(new DATE_TIME(dateTime));\n");
						pw.println("	}");
						pw.println();
					} else if(smplName.equals("Date")) {
						if(!gsMap.containsKey("datetimelist")) {
							pw.printf("	public %s(java.util.Date date) {\n", implSmplName);
							pw.printf("		this(new DATE(date));\n");
							pw.println("	}");
							pw.println();
						}
						pw.printf("	public %s(java.time.LocalDate date) {\n", implSmplName);
						pw.printf("		this(new DATE(date));\n");
						pw.println("	}");
						pw.println();
					} else if(smplName.equals("Time")) {
						if(!gsMap.containsKey("datetimelist")) {
							pw.printf("	public %s(java.util.Date time) {\n", implSmplName);
							pw.printf("		this(new TIME(time));\n");
							pw.println("	}");
							pw.println();
						}
						pw.printf("	public %s(java.time.LocalTime time) {\n", implSmplName);
						pw.printf("		this(new TIME(time));\n");
						pw.println("	}");
						pw.println();
					} else if(smplName.equals("Class")) {
						smplName = "Clazz";
					}
					String pre2 = pre;
					if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
						pre2 = "Clazz.";
					} else if(orgTypes.contains("DataType") && icSmplName.equals("Text")) {
						pre2 = "DataType.";
					}
					String noListName = smp.getName().substring(0, smp.getName().length() - 4);
					pw.printf("	public %s(%s%s %s) {\n", implSmplName,
							pre2, smc.getSimpleName(), noListName);
					pw.printf("		%s = new ArrayList<%s%s>();\n",
							smp.getName(), pre2, smc.getSimpleName());
					pw.printf("		%s.add(%s);\n", smp.getName(), noListName);
					pw.println("	}");
					pw.println();
					pw.println("	@Override");
					if(!(implSmplName.equals("COMMENT") && smc.getSimpleName().equals("Comment"))
							&& !(implSmplName.equals("REVIEW") && smc.getSimpleName().equals("Review"))
							&& !(implSmplName.equals("TEXT") && smc.getSimpleName().equals("Text"))) {
						pw.printf("	public %s%s get%s() {\n", pre2,
								smc.getSimpleName(), smplName);
						pw.printf("		if(%s != null && %s.size() > 0) {\n",
								smp.getName(), smp.getName());
						pw.printf("			return %s.get(0);\n", smp.getName());
						pw.println("		} else {");
						pw.println("			return null;");
						pw.println("		}");
						pw.println("	}");
					} else {
						// [個別対応]
						pw.printf("	public %s get%s() {\n", implSmplName, smplName);
						pw.printf("		%s%s cls = null;\n", pre2, smc.getSimpleName());
						pw.printf("		if(%s != null && %s.size() > 0) {\n",
								smp.getName(), smp.getName());
						pw.printf("			cls = %s.get(0);\n", smp.getName());
						pw.println("		}");
						if(implSmplName.equals("TEXT")) {
							pw.println("		if(cls == null && string == null) {");
							pw.println("			return null;");
							pw.println("		}");
							pw.println("");
							pw.printf("		%s impl = new %s(string);\n", implSmplName, implSmplName);
							pw.println("		if(cls != null) {");
							pw.println("			impl.copy(cls);");
							pw.println("		}");
						} else {
							pw.printf("		Container.%s ctn = %s;\n", smc.getSimpleName(),
									smp.getName().substring(0, smp.getName().length() - 4));
							pw.println("		if(cls == null && ctn == null) {");
							pw.println("			return null;");
							pw.println("		}");
							pw.println("");
							pw.printf("		%s impl = new %s();\n", implSmplName, implSmplName);
							pw.println("		if(cls != null) {");
							pw.println("			impl.copy(cls);");
							pw.println("		}");
							pw.println("		if(ctn != null) {");
							pw.println("			impl.copy(ctn);");
							pw.println("		}");
						}
						pw.println("		return impl;");
						pw.println("	}");
					}
					pw.println();
					pw.println("	@Override");
					pw.printf("	public void set%s(%s%s %s) {\n", smplName,
							pre2, smc.getSimpleName(), noListName);
					pw.printf("		if(%s == null) {\n", smp.getName());
					pw.printf("			%s = new ArrayList<>();\n", smp.getName());
					pw.println("		}");
					pw.printf("		if(%s.size() == 0) {\n", smp.getName());
					pw.printf("			%s.add(%s);\n", smp.getName(), noListName);
					pw.println("		} else {");
					pw.printf("			%s.set(0, %s);\n", smp.getName(), noListName);
					pw.println("		}");
					pw.println("	}");
					pw.println();
					pw.println("	@Override");
					pw.printf("	public List<%s%s> get%sList() {\n", pre2,
							smc.getSimpleName(), smplName);
					pw.printf("		return %s;\n", smp.getName());
					pw.println("	}");
					pw.println();
					pw.println("	@Override");
					pw.printf("	public void set%sList(List<%s%s> %s) {\n", smplName,
							pre2, smc.getSimpleName(), smp.getName());
					pw.printf("		this.%s = %s;\n", smp.getName(), smp.getName());
					pw.println("	}");
					pw.println();
					pw.println("	@Override");
					if(!(implSmplName.equals("COMMENT") && smc.getSimpleName().equals("Comment"))
							&& !(implSmplName.equals("REVIEW") && smc.getSimpleName().equals("Review"))
							&& !(implSmplName.equals("TEXT") && smc.getSimpleName().equals("Text"))) {
						pw.printf("	public boolean has%s() {\n", smplName);
						pw.printf("		return %s != null && %s.size() > 0 && %s.get(0) != null;\n",
								smp.getName(), smp.getName(), smp.getName());
						pw.println("	}");
					} else {
						// [個別対応]
						pw.printf("	public boolean has%s() {\n", smplName);
						pw.printf("		return (%s != null && %s.size() > 0 && %s.get(0) != null)\n",
								smp.getName(), smp.getName(), smp.getName());
						pw.printf("				|| %s != null;\n",
								implSmplName.equals("TEXT") ? "string" :
									smp.getName().substring(0, smp.getName().length() - 4));
						pw.println("	}");
					}
					pw.println();
					alrdPrpSet.add(gsName.toLowerCase() + "list");
				} else {
					System.out.println("method " + gsName + " not found in "
							+ typeName + "," + icSmplName + ". (200)");
					System.exit(1);
				}
			}

			if(pMap.size() > 1
					&& !(extension.equals("core") && orgTypes.contains("Clazz")
						&& (icSmplName.equals("Integer")
							|| icSmplName.equals("Float")))) {
				List<String> prmStrs = new ArrayList<String>();
				List<String> setMtds = new ArrayList<String>();
				List<String> setMtdClss = new ArrayList<String>();
				List<String> setMtdCtns = new ArrayList<String>();
				if(gsMap.containsKey("seq")) {
					prmStrs.add("Long seq");
					setMtds.add("		setSeq(seq);");
					prmStrs.add("Long refSeq");
					setMtds.add("		setRefSeq(refSeq);");
					prmStrs.add("String refAcr");
					setMtds.add("		setRefAcr(refAcr);");
					prmStrs.add("java.util.Date createdAt");
					setMtds.add("		setCreatedAt(createdAt);");
					prmStrs.add("Long createdBy");
					setMtds.add("		setCreatedBy(createdBy);");
					prmStrs.add("java.util.Date updatedAt");
					setMtds.add("		setUpdatedAt(updatedAt);");
					prmStrs.add("Long updatedBy");
					setMtds.add("		setUpdatedBy(updatedBy);");
					prmStrs.add("java.util.Date expiredAt");
					setMtds.add("		setExpiredAt(expiredAt);");
					prmStrs.add("Long expiredBy");
					setMtds.add("		setExpiredBy(expiredBy);");

					setMtdClss.add("		setSeq(org.getSeq());");
					setMtdClss.add("		setRefSeq(org.getRefSeq());");
					setMtdClss.add("		setRefAcr(org.getRefAcr());");
					setMtdClss.add("		setCreatedAt(org.getCreatedAt());");
					setMtdClss.add("		setCreatedBy(org.getCreatedBy());");
					setMtdClss.add("		setUpdatedAt(org.getUpdatedAt());");
					setMtdClss.add("		setUpdatedBy(org.getUpdatedBy());");
					setMtdClss.add("		setExpiredAt(org.getExpiredAt());");
					setMtdClss.add("		setExpiredBy(org.getExpiredBy());");
				}

				alrdPrpSet = new HashSet<String>();
				for(String gsName : gsNameList) {
					// if(alrdPrpSet.contains(gsName.toLowerCase())) {
					//	continue;
					// }

					if(gsName.equals("Boolean")) {
						gsName = "B00lean";
					} else if(gsName.equals("Double")) {
						gsName = "D0uble";
					} else if(gsName.equals("Long")) {
						gsName = "L0ng";
					} else if(gsName.equals("Class")) {
						gsName = "Clazz";
					}

					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Number")
							&& gsName.equals("BigDecimal")) {
						gsName = "Number";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("DateTime")
							&& gsName.equals("OffsetDateTime")) {
						gsName = "DateTime";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Date")
							&& gsName.equals("LocalDate")) {
						gsName = "Date";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Time")
							&& gsName.equals("LocalTime")) {
						gsName = "Time";
					}

					if(gsMap.containsKey(gsName.toLowerCase())
							&& !alrdPrpSet.contains(gsName.toLowerCase())) {
						Method sm = gsMap.get(gsName.toLowerCase())[1];
						Parameter smp = sm.getParameters()[0];
						Type smt = smp.getType();
						Class<?> smc = pMap.get(smt.getTypeName());
						String smplName = smc.getSimpleName();
						if(smplName.equals("Boolean")) {
							smplName = "B00lean";
						} else if(smplName.equals("Class")) {
							smplName = "Clazz";
						} else if(smplName.equals("Double")) {
							smplName = "D0uble";
						} else if(smplName.equals("Long")) {
							smplName = "L0ng";
						} else if(smplName.equals("BigDecimal")) {
							smplName = "Number";
						} else if(smplName.equals("OffsetDateTime")) {
							smplName = "DateTime";
						} else if(smplName.equals("LocalDate")) {
							smplName = "Date";
						} else if(smplName.equals("LocalTime")) {
							smplName = "Time";
						}
						String pre2 = pre;
						if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
							pre2 = "Container.";
						}
						StringBuilder sb = new StringBuilder();
						sb.append(pre2);
						sb.append(smc.getSimpleName());
						sb.append(" ");
						sb.append(smp.getName());
						prmStrs.add(sb.toString());
						sb = new StringBuilder();
						sb.append("		set");
						sb.append(smplName);
						sb.append("(");
						sb.append(smp.getName());
						sb.append(");");
						setMtds.add(sb.toString());
						sb = new StringBuilder();
						sb.append("		set");
						sb.append(smplName);
						sb.append("(org.get");
						sb.append(smplName);
						sb.append("());");
						setMtdClss.add(sb.toString());
						alrdPrpSet.add(gsName.toLowerCase());
					} else if(gsMap.containsKey(gsName.toLowerCase() + "list")) {
						Method sm = gsMap.get(gsName.toLowerCase() + "list")[1];
						Parameter smp = sm.getParameters()[0];
						ParameterizedType gType = (ParameterizedType)sm.getGenericParameterTypes()[0];
						Type[] aTypes = gType.getActualTypeArguments();
						Class<?> smc = pMap.get(aTypes[0].getTypeName());
						String smplName = smc.getSimpleName();
						if(smplName.equals("Boolean")) {
							smplName = "B00lean";
						} else if(smplName.equals("Class")) {
							smplName = "Clazz";
						} else if(smplName.equals("Double")) {
							smplName = "D0uble";
						} else if(smplName.equals("Long")) {
							smplName = "L0ng";
						} else if(smplName.equals("BigDecimal")) {
							smplName = "Number";
						} else if(smplName.equals("OffsetDateTime")) {
							smplName = "DateTime";
						} else if(smplName.equals("LocalDate")) {
							smplName = "Date";
						} else if(smplName.equals("LocalTime")) {
							smplName = "Time";
						}
						String pre2 = pre;
						if(smc.getSimpleName().equals(icSmplName) && !orgTypes.contains("DataType")) {
							pre2 = "Clazz.";
						} else if(orgTypes.contains("DataType") && icSmplName.equals("Text")) {
							pre2 = "DataType.";
						}
						StringBuilder sb = new StringBuilder();
						sb.append("List<");
						sb.append(pre2);
						sb.append(smc.getSimpleName());
						sb.append("> ");
						sb.append(smp.getName());
						sb.append("");
						prmStrs.add(sb.toString());
						sb = new StringBuilder();
						sb.append("		set");
						sb.append(smplName);
						sb.append("List(");
						sb.append(smp.getName());
						sb.append(");");
						setMtds.add(sb.toString());
						sb = new StringBuilder();
						sb.append("		set");
						sb.append(smplName);
						sb.append("List(org.get");
						sb.append(smplName);
						sb.append("List());");
						setMtdCtns.add(sb.toString());
						alrdPrpSet.add(gsName.toLowerCase() + "list");
					} else {
						System.out.println("method " + gsName + " not found in "
								+ typeName + "," + icSmplName + ". (300)");
						System.exit(1);
					}
				}

				if(prmStrs.size() > 1) {
					pw.printf("	public %s(%s) {\n", implSmplName, String.join(",\n\t\t\t", prmStrs));
				} else {
					pw.printf("	public %s(%s) {\n", implSmplName, prmStrs.get(0));
				}
				for(String setMtd : setMtds) {
					pw.println(setMtd);
				}
				pw.println("	}");
				pw.println();

				for(String orgType : orgTypeList) {
					if(orgType.startsWith("Container.") && setMtdCtns.size() > 0) {
						pw.printf("	public void copy(%s org) {\n", orgType);
						for(String setMtd : setMtdCtns) {
							pw.println(setMtd);
						}
						pw.println("	}");
						pw.println();
					} else if(setMtdClss.size() > 0) {
						pw.printf("	public void copy(%s org) {\n", orgType);
						for(String setMtd : setMtdClss) {
							pw.println(setMtd);
						}
						pw.println("	}");
						pw.println();
					}
				}
			}

			switch(ntvGSIfcCase) {
			case 1:
				pw.println("	@Override");
				pw.println("	public String getNativeValue() {");
				pw.println("		return getString();");
				pw.println("	}");
				pw.println();
				break;
			case 2:
				String smplName = ntvGSNtvSmpl;
				if(ntvGSNtvSmpl.equals("B00lean")) {
					// smplName = "B00lean";
				} else if(ntvGSNtvSmpl.equals("D0uble")) {
					// smplName = "D0uble";
				} else if(ntvGSNtvSmpl.equals("L0ng")) {
					// smplName = "L0ng";
				} else if(ntvGSNtvSmpl.equals("BigDecimal")) {
					smplName = "Number";
				} else if(ntvGSNtvSmpl.equals("OffsetDateTime")) {
					smplName = "DateTime";
				} else if(ntvGSNtvSmpl.equals("LocalDate")) {
					smplName = "Date";
				} else if(ntvGSNtvSmpl.equals("LocalTime")) {
					smplName = "Time";
				}

				if(ntvGSNtvSmpl.equals("OffsetDateTime")) {
					pw.println("	@Override");
					pw.printf("	public java.util.Date getNativeValue() {\n");
					pw.printf("		if(getDateTime() == null) return null;\n");
					pw.printf("		return getDateTime().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("LocalDate")) {
					pw.println("	@Override");
					pw.printf("	public java.sql.Date getNativeValue() {\n");
					pw.printf("		if(getDate() == null) return null;\n");
					pw.printf("		return getDate().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("LocalTime")) {
					pw.println("	@Override");
					pw.printf("	public java.sql.Time getNativeValue() {\n");
					pw.printf("		if(getTime() == null) return null;\n");
					pw.printf("		return getTime().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("String")) {
					if(ntvGSIfcSmpl.equals("URL")
							|| ntvGSIfcSmpl.equals("CssSelectorType") || ntvGSIfcSmpl.equals("XPathType")) {
						pw.println("	@Override");
						pw.printf("	public String getNativeValue() {\n");
						pw.printf("		if(get%s() == null) return null;\n", ntvGSIfcSmpl);
						pw.printf("		return get%s().getNativeValue();\n", ntvGSIfcSmpl);
						pw.println("	}");
						pw.println();
					} else {
						pw.println("	@Override");
						pw.printf("	public String getNativeValue() {\n");
						pw.printf("		if(getText() == null) return null;\n");
						pw.printf("		return getText().getNativeValue();\n");
						// pw.printf("		return getString();\n");
						pw.println("	}");
						pw.println();
					}
				} else if(ntvGSNtvSmpl.equals("L0ng")) {
					pw.println("	@Override");
					pw.printf("	public Long getNativeValue() {\n");
					pw.printf("		if(getInteger() == null) return null;\n");
					pw.printf("		return getInteger().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("D0uble")) {
					pw.println("	@Override");
					pw.printf("	public Double getNativeValue() {\n");
					pw.printf("		if(getFl0at() == null) return null;\n");
					pw.printf("		return getFl0at().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("BigDecimal")) {
					pw.println("	@Override");
					pw.printf("	public java.math.BigDecimal getNativeValue() {\n");
					pw.printf("		if(getNumber() == null) return null;\n");
					pw.printf("		return getNumber().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else if(ntvGSNtvSmpl.equals("B00lean")) {
					pw.println("	@Override");
					pw.printf("	public java.lang.Boolean getNativeValue() {\n");
					pw.printf("		if(getB00lean() == null) return null;\n");
					pw.printf("		return getB00lean().getNativeValue();\n");
					pw.println("	}");
					pw.println();
				} else {
					pw.println("	@Override");
					pw.printf("	public %s getNativeValue() {\n", ntvGSNtvName);
					pw.printf("		return get%s();\n", smplName);
					pw.println("	}");
					pw.println();
				}
				break;
			case 3:
				pw.println("	@Override");
				pw.printf("	public %s getNativeValue() {\n", ntvGSNtvName);
				pw.printf("		return get%s();\n", ntvGSNtvSmpl);
				pw.println("	}");
				pw.println();
				break;
			default:
				if(extension.equals("core")) {
					if(orgTypes.contains("DataType") || orgTypes.contains("Clazz")) {
						if(icSmplName.equals("Text") || icSmplName.equals("URL")) {
							pw.println("	@Override");
							pw.printf("	public String getNativeValue() {\n");
							pw.printf("		return getString();\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Boolean")) {
							pw.println("	@Override");
							pw.printf("	public java.lang.Boolean getNativeValue() {\n");
							pw.printf("		return getB00lean();\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Float")) {
							pw.println("	@Override");
							pw.printf("	public Double getNativeValue() {\n");
							pw.printf("		return getD0uble();\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Integer")) {
							pw.println("	@Override");
							pw.printf("	public Long getNativeValue() {\n");
							pw.printf("		return getL0ng();\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Number")) {
							pw.println("	@Override");
							pw.printf("	public java.math.BigDecimal getNativeValue() {\n");
							pw.printf("		return getNumber();\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("DateTime")) {
							pw.println("	@Override");
							pw.printf("	public java.util.Date getNativeValue() {\n");
							pw.printf("		if(getDateTime() == null) return null;\n");
							pw.printf("		return java.util.Date.from(getDateTime().toInstant());\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Date")) {
							pw.println("	@Override");
							pw.printf("	public java.sql.Date getNativeValue() {\n");
							pw.printf("		if(getDate() == null) return null;\n");
							pw.printf("		return java.sql.Date.valueOf(getDate());\n");
							pw.println("	}");
							pw.println();
						} else if(icSmplName.equals("Time")) {
							pw.println("	@Override");
							pw.printf("	public java.sql.Time getNativeValue() {\n");
							pw.printf("		if(getTime() == null) return null;\n");
							pw.printf("		return java.sql.Time.valueOf(getTime());\n");
							pw.println("	}");
							pw.println();
						}
					}
				} else if(extension.equals("pending")) {
					if(orgTypes.contains("DataType") || orgTypes.contains("Clazz")) {
						if(icSmplName.equals("CssSelectorType") || icSmplName.equals("XPathType")) {
							pw.println("	@Override");
							pw.printf("	public String getNativeValue() {\n");
							pw.printf("		return getString();\n");
							pw.println("	}");
							pw.println();
						}
					}
				}
				break;
			}

			if(oMap.containsKey("value")) {
				pw.println("	@Override");
				pw.println("	public String value() {");
				String type2 = type;
				if(type.equals("Impl")) {
					if(orgTypes.contains("Clazz")) {
						type2 = "Clazz";
					} else if(orgTypes.contains("DataType")) {
						type2 = "DataType";
					}
				}
				pw.printf("		return %s.%s.class.getAnnotation(SampleValue.class).value();\n",
						type2, icSmplName);
				pw.println("	}");
				pw.println();
			}

			if(gsMap.containsKey("seq")) {
				pw.println("	@Override");
				pw.println("	public Long getSeq() {");
				pw.println("		return seq;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setSeq(Long seq) {");
				pw.println("		this.seq = seq;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Long getRefSeq() {");
				pw.println("		return refSeq;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setRefSeq(Long refSeq) {");
				pw.println("		this.refSeq = refSeq;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public String getRefAcr() {");
				pw.println("		return refAcr;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setRefAcr(String refAcr) {");
				pw.println("		this.refAcr = refAcr;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public java.util.Date getCreatedAt() {");
				pw.println("		return createdAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setCreatedAt(java.util.Date createdAt) {");
				pw.println("		this.createdAt = createdAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Long getCreatedBy() {");
				pw.println("		return createdBy;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setCreatedBy(Long createdBy) {");
				pw.println("		this.createdBy = createdBy;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public java.util.Date getUpdatedAt() {");
				pw.println("		return updatedAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setUpdatedAt(java.util.Date updatedAt) {");
				pw.println("		this.updatedAt = updatedAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Long getUpdatedBy() {");
				pw.println("		return updatedBy;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setUpdatedBy(Long updatedBy) {");
				pw.println("		this.updatedBy = updatedBy;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public java.util.Date getExpiredAt() {");
				pw.println("		return expiredAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setExpiredAt(java.util.Date expiredAt) {");
				pw.println("		this.expiredAt = expiredAt;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public Long getExpiredBy() {");
				pw.println("		return expiredBy;");
				pw.println("	}");
				pw.println("");
				pw.println("	@Override");
				pw.println("	public void setExpiredBy(Long expiredBy) {");
				pw.println("		this.expiredBy = expiredBy;");
				pw.println("	}");
				pw.println("");
			}

			pw.println("	@Override");
			pw.println("	public String toString() {");
			pw.println("		return SimpleJsonBuilder.toJson(this);");
			pw.println("	}");
			pw.println();

			pw.println("}");
			pw.close();
			pw = null;

			if(gsMap.containsKey("seq")) {
				// sql出力
				StringBuilder sqlFPath = new StringBuilder(sqlDPath);
				sqlFPath.append("scm_");
				sqlFPath.append(implSmplName.toLowerCase());
				sqlFPath.append(".sql");
				cf = new File(sqlFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
				pw.printf("CREATE TABLE scm_%s(\n", implSmplName.toLowerCase());
				pw.printf(" seq BIGINT AUTO_INCREMENT PRIMARY KEY,\n");
				alrdPrpSet = new HashSet<String>();
				for(String gsName : gsNameList) {
					if(gsName.equals("Boolean")) {
						gsName = "B00lean";
					} else if(gsName.equals("Double")) {
						gsName = "D0uble";
					} else if(gsName.equals("Long")) {
						gsName = "L0ng";
					} else if(gsName.equals("Class")) {
						gsName = "Clazz";
					}

					if(extension.equals("core") && orgTypes.contains("Clazz")
							&& (icSmplName.equals("Integer")
								|| icSmplName.equals("Float"))
							&& gsName.equals("Number")) {
						// [個別対応]
						alrdPrpSet.add(gsName.toLowerCase());
						continue;
					}

					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Number")
							&& gsName.equals("BigDecimal")) {
						gsName = "Number";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("DateTime")
							&& gsName.equals("OffsetDateTime")) {
						gsName = "DateTime";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Date")
							&& gsName.equals("LocalDate")) {
						gsName = "Date";
					}
					if(extension.equals("core") && orgTypes.contains("DataType")
							&& icSmplName.equals("Time")
							&& gsName.equals("LocalTime")) {
						gsName = "Time";
					}

					if(gsMap.containsKey(gsName.toLowerCase())
							&& !alrdPrpSet.contains(gsName.toLowerCase())) {
						Method sm = gsMap.get(gsName.toLowerCase())[1];
						Parameter smp = sm.getParameters()[0];
						Type smt = smp.getType();
						Class<?> smc = pMap.get(smt.getTypeName());
						pw.printf("\n");
						pw.println(" /**");
						pw.println("  * type:  " + smc.getName());
						ImplData implData2 = new ImplData();
						Lib.retrieveInterfaces(smc, implData2, 0, 0);
						String lbl = "param: ";
						List<String> pList = new ArrayList<>();
						for(String key : implData2.pMap.keySet()) {
							pList.add(key);
						}
						Collections.sort(pList);
						for(String key : pList) {
							pw.printf("  * %s%s\n", lbl, implData2.pMap.get(key).getName());
							lbl = "       ";
						}
						pw.println("  */");
						if(smc.getAnnotation(ConstantizedName.class) == null) {
							if(smc.getName().equals("java.lang.String")) {
								pw.println(" string VARCHAR(100) NULL");
							} else if(smc.getName().equals("java.lang.Boolean")) {
								pw.println(" b00lean BIT NULL");
							} else if(smc.getName().equals("java.lang.Long")) {
								pw.println(" l0ng BIGINT NULL");
							} else if(smc.getName().equals("java.lang.Double")) {
								pw.println(" d0uble DOUBLE NULL");
							} else if(smc.getName().equals("java.math.BigDecimal")) {
								pw.println(" number NUMERIC(27,9) NULL");
							} else if(smc.getName().equals("java.util.Date")) {
								pw.println(" date DATETIME NULL");
							}
						} else {
							String colName = smc.getAnnotation(ConstantizedName.class).value().toLowerCase();
							pw.printf(" %s VARCHAR(100) NULL,\n", colName);
						}
						alrdPrpSet.add(gsName.toLowerCase());
					} else if(gsMap.containsKey(gsName.toLowerCase() + "list")) {
						alrdPrpSet.add(gsName.toLowerCase() + "list");
					} else {
						System.out.println("method " + gsName + " not found in "
								+ typeName + "," + icSmplName + ". (500)");
						System.exit(1);
					}
				}

				pw.printf("\n");
				pw.printf(" ref_seq BIGINT NULL,\n");
				pw.printf(" ref_acr VARCHAR(100) NULL,\n");
				pw.printf(" created_at TIMESTAMP NULL,\n");
				pw.printf(" created_by BIGINT NULL,\n");
				pw.printf(" updated_at TIMESTAMP NULL,\n");
				pw.printf(" updated_by BIGINT NULL\n");
				pw.printf(" expired_at TIMESTAMP NULL,\n");
				pw.printf(" expired_by BIGINT NULL\n");
				pw.printf("\n);");
				pw.close();
				pw = null;
			}

			// Domaファイル出力
			StringBuilder domaFPath = new StringBuilder(domaDPath);
			StringBuilder domaPkg = new StringBuilder();
			for(int pei = 0; pei < pes.length - 1; pei++) {
				domaFPath.append(pes[pei]);
				domaFPath.append(File.separator);
				domaPkg.append(pes[pei]);
				domaPkg.append(".");
			}
			domaFPath.append(StringUtils.uncapitalize(type));
			domaFPath.append(File.separator);
			domaFPath.append(implSmplName);
			domaFPath.append(".java");
			System.out.println(domaFPath.toString());
			domaPkg.append(StringUtils.uncapitalize(type));

			cf = new File(domaFPath.toString());
			cd = cf.getParentFile();
			if(!cd.exists()) {
				cd.mkdirs();
			}
			pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));
			br = new BufferedReader(new FileReader(new File(javaFPath.toString())));
			String line;
			int lcnt = 0;
			while((line = br.readLine()) != null) {
				lcnt++;

				if(lcnt == 1) {
					pw.printf("package %s;\n", domaPkg.toString());
				} else {
					if(ntvGSIfcCase > 0 && ntvGSIfcCase < 9) {
						if(!implSmplName.equals("QUANTITATIVE_VALUE")
								&& !implSmplName.equals("MONETARY_AMOUNT")
								&& !implSmplName.equals("PROPERTY_VALUE")
								&& !implSmplName.equals("LOCATION_FEATURE_SPECIFICATION")) {
							if(line.startsWith("public class")) {
								// pw.println("import org.seasar.doma.Domain;");
								// pw.println("import org.seasar.doma.Entity;");
								// pw.println("import org.seasar.doma.jdbc.entity.NamingType;");
								if(hasList) {
									pw.println("import org.seasar.doma.Transient;");
								}
								pw.println();
								// pw.println("@Entity(naming = NamingType.SNAKE_UPPER_CASE)");
								// pw.printf("@Domain(valueType = %s.class)\n", ntvGSNtvName);
							}

							if(line.startsWith("	public List") && line.endsWith(";")) {
								pw.println("	@Transient");
							}
						}
					}

					pw.println(line);
				}
			}

			pw.close();
			pw = null;

			if(ntvGSIfcCase > 0 && ntvGSIfcCase < 9) {
				// Doma converterファイル出力
				for(String orgType : orgTypes) {
					String[] pes2 = typePkg.split("\\.");
					StringBuilder domaConvFPath = new StringBuilder(domaConvDPath);
					StringBuilder domaConvPkg = new StringBuilder();
					for(int pei = 0; pei < pes2.length; pei++) {
						domaConvFPath.append(pes2[pei]);
						domaConvFPath.append(File.separator);
						domaConvPkg.append(pes2[pei]);
						domaConvPkg.append(".");
						if(pei == pes2.length - 2) {
							domaConvFPath.append("doma");
							domaConvFPath.append(File.separator);
							domaConvPkg.append("doma");
							domaConvPkg.append(".");
						}
					}
					domaConvFPath.append(StringUtils.uncapitalize(orgType));
					domaConvFPath.append(File.separator);
					domaConvFPath.append(icSmplName);
					domaConvFPath.append("Converter.java");
					System.out.println(domaConvFPath.toString());
					domaConvPkg.append(StringUtils.uncapitalize(orgType));

					cf = new File(domaConvFPath.toString());
					cd = cf.getParentFile();
					if(!cd.exists()) {
						cd.mkdirs();
					}
					pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));

					pw.printf("package %s;\n", domaConvPkg.toString());
					pw.println("");
					String ntvGSNtvSmpl2 = ntvGSNtvSmpl;
					if(ntvGSNtvSmpl.equals("B00lean")) {
						ntvGSNtvSmpl2 = "Boolean";
					} else if(ntvGSNtvSmpl.equals("D0uble")) {
						ntvGSNtvSmpl2 = "Double";
					} else if(ntvGSNtvSmpl.equals("L0ng")) {
						ntvGSNtvSmpl2 = "Long";
					} else if(ntvGSNtvSmpl.equals("Date")) {
						pw.println("import java.util.Date;");
					} else if(ntvGSNtvSmpl.equals("BigDecimal")) {
						pw.println("import java.math.BigDecimal;");
					} else if(ntvGSNtvSmpl.equals("OffsetDateTime")) {
						pw.println("import java.util.Date;");
						ntvGSNtvSmpl2 = "Date";
					} else if(ntvGSNtvSmpl.equals("LocalDate")) {
						pw.println("import java.sql.Date;");
						ntvGSNtvSmpl2 = "Date";
					} else if(ntvGSNtvSmpl.equals("LocalTime")) {
						pw.println("import java.sql.Time;");
						ntvGSNtvSmpl2 = "Time";
					}
					// pw.println("import java.util.List;");
					// pw.println("");
					pw.println("import org.seasar.doma.ExternalDomain;");
					pw.println("import org.seasar.doma.jdbc.domain.DomainConverter;");
					pw.println("");
					pre = "";
					if(orgType.equals("Container")) {
						switch(ntvGSIfcCase) {
						case 1:
						case 3:
							// pw.printf("import %s.core.Container.Name;\n", pkgBase);
							// pw.printf("import %s.core.DataType.Text;\n", pkgBase);
							if(ntvGSIfcCase == 1) {
								// pw.printf("import %s.%s.Clazz;\n", pkgBase, extension);
							} else {
								// pw.printf("import %s.Clazz;\n", ntvGSIfcExt);
							}
							// pre = "Clazz";
							break;
						case 2:
							if(ntvGSIfcSmpl.equals("URL")
									|| ntvGSIfcSmpl.equals("CssSelectorType") || ntvGSIfcSmpl.equals("XPathType")
									|| ntvGSIfcSmpl.equals("Float") || ntvGSIfcSmpl.equals("Integer")) {
								// pre = "Clazz";
							} else {
								// pre = "DataType";
							}
							// pw.printf("import %s.core.%s;\n", pkgBase, pre);
							break;
						default:
							break;
						}
					} else {
						// pw.printf("import %s.core.Container.Name;\n", pkgBase);
						// pw.printf("import %s.core.DataType.Text;\n", pkgBase);
					}
					pw.printf("import %s.%s;\n", implPkg.toString(), implSmplName);
					String pre2 = "";
					// if(orgType.equals("Clazz") && icSmplName.matches("^[A-Z]+$")) {
					if(icSmplName.matches("^[A-Z]+$")) {
						pw.printf("import %s.%s;\n", typePkg, orgType);
						pre2 = orgType + ".";
					} else {
						pw.printf("import %s.%s.%s;\n", typePkg, orgType, icSmplName);
					}
					pw.println("");
					pw.println("@ExternalDomain");
					pw.printf("public class %sConverter implements DomainConverter<%s%s, %s> {\n",
							icSmplName, pre2, icSmplName, ntvGSNtvSmpl2);
					pw.println("");
					pw.println("	@Override");
					pw.printf("	public %s fromDomainToValue(%s%s domain) {\n",
							ntvGSNtvSmpl2, pre2, icSmplName);
					if(ntvGSNtvSmpl.equals("OffsetDateTime")) {
						pw.println("		return domain.getNativeValue();");
					} else if(ntvGSNtvSmpl.equals("LocalDate")) {
						pw.println("		if(domain != null && domain.getDateList() != null && domain.getDateList().size() > 0) {");
						pw.println("			return Date.valueOf(domain.getDateList().get(0).getDate());");
						pw.println("		} else {");
						pw.println("			return null;");
						pw.println("		}");
					} else if(ntvGSNtvSmpl.equals("LocalTime")) {
						pw.println("		if(domain != null && domain.getTimeList() != null && domain.getTimeList().size() > 0) {");
						pw.println("			return Time.valueOf(domain.getTimeList().get(0).getTime());");
						pw.println("		} else {");
						pw.println("			return null;");
						pw.println("		}");
					} else {
						pw.println("		return domain.getNativeValue();");
					}
					pw.println("	}");
					pw.println("");
					pw.println("	@Override");
					pw.printf("	public %s%s fromValueToDomain(%s value) {\n",
							pre2, icSmplName, ntvGSNtvSmpl2);
					pw.printf("		return new %s(value);\n", implSmplName);
					pw.println("	}");
					pw.println("");
					pw.println("}");

					pw.close();
					pw = null;
					implData.domaConvNameSet.add(domaConvPkg.toString() + "." + icSmplName + "Converter");
				}
			}

			// Gson
			for(String orgType : orgTypes) {
				String icSmplName2 = icSmplName;
				if(extension.equals("core") && orgType.equals("Container") && icSmplName.equals("URL")) {
					icSmplName2 = "Url";
				}

				String[] pes2 = typePkg.split("\\.");
				StringBuilder gsonFPath = new StringBuilder(gsonDPath);
				StringBuilder gsonPkg = new StringBuilder();
				for(int pei = 0; pei < pes2.length; pei++) {
					gsonFPath.append(pes2[pei]);
					gsonFPath.append(File.separator);
					gsonPkg.append(pes2[pei]);
					gsonPkg.append(".");
					if(pei == pes2.length - 2) {
						gsonFPath.append("gson");
						gsonFPath.append(File.separator);
						gsonPkg.append("gson");
						gsonPkg.append(".");
					}
				}
				gsonFPath.append(StringUtils.uncapitalize(orgType));
				gsonFPath.append(File.separator);
				gsonFPath.append(icSmplName2);
				gsonFPath.append("Deserializer.java");
				System.out.println(gsonFPath.toString());
				gsonPkg.append(StringUtils.uncapitalize(orgType));

				cf = new File(gsonFPath.toString());
				cd = cf.getParentFile();
				if(!cd.exists()) {
					cd.mkdirs();
				}
				pw = new PrintWriter(new BufferedWriter(new FileWriter(cf)));

				pw.printf("package %s;\n", gsonPkg.toString());
				pw.println("");
				pw.println("import java.lang.reflect.Field;");
				pw.println("import java.lang.reflect.ParameterizedType;");
				pw.println("import java.lang.reflect.Type;");
				pw.println("import java.util.ArrayList;");
				pw.println("import java.util.HashMap;");
				pw.println("import java.util.List;");
				pw.println("import java.util.Map.Entry;");
				pw.println("");
				pw.println("import org.kyojo.gson.JsonDeserializationContext;");
				pw.println("import org.kyojo.gson.JsonDeserializer;");
				pw.println("import org.kyojo.gson.JsonElement;");
				pw.println("import org.kyojo.gson.JsonObject;");
				pw.println("import org.kyojo.gson.JsonParseException;");
				pw.println("import org.kyojo.gson.reflect.TypeToken;");
				pw.printf("import %s.%s;\n", implPkg.toString(), implSmplName);
				String pre2 = "";
				if(icSmplName2.matches("^[A-Z]+$")
						|| (extension.equals("core") && orgType.equals("Clazz") && icSmplName.equals("Float"))
						|| (extension.equals("meta") && orgType.equals("Clazz") && icSmplName.equals("Class"))) {
					pw.printf("import %s.%s;\n", typePkg, orgType);
					pre2 = orgType + ".";
				} else {
					pw.printf("import %s.%s.%s;\n", typePkg, orgType, icSmplName2);
				}
				pw.println("");
				pw.printf("public class %sDeserializer implements JsonDeserializer<%s%s> {\n",
						icSmplName2, pre2, icSmplName2);
				pw.println("");
				pw.println("	@Override");
				pw.printf("	public %s%s deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)\n",
						pre2, icSmplName2);
				pw.println("			throws JsonParseException {");
				pw.println("		if(jsonElement.isJsonPrimitive()) {");
				if(extension.equals("core") && orgType.equals("Clazz") && icSmplName.equals("DataType")
						|| extension.equals("core") && orgType.equals("B00lean") ) {
					pw.printf("			return new %s();\n", implSmplName);
				} else if((ntvGSNtvSmpl != null && (ntvGSNtvSmpl.equals("Date")
							|| ntvGSNtvSmpl.equals("OffsetDateTime") || ntvGSNtvSmpl.equals("LocalDate") || ntvGSNtvSmpl.equals("LocalTime")))
						|| (extension.equals("core") && (orgTypes.contains("DataType")
								&& (icSmplName.equals("Date") || icSmplName.equals("DateTime") || icSmplName.equals("Time"))))) {
					if((ntvGSNtvSmpl != null && ntvGSNtvSmpl.equals("OffsetDateTime")) || icSmplName.equals("DateTime")) {
						pw.println("			java.time.OffsetDateTime dateTime = context.deserialize(jsonElement, java.time.OffsetDateTime.class);");
						pw.printf("			return new %s(dateTime);\n", implSmplName);
					} else if((ntvGSNtvSmpl != null && ntvGSNtvSmpl.equals("LocalDate")) || icSmplName.equals("Date")) {
						pw.println("			java.time.LocalDate date = context.deserialize(jsonElement, java.time.LocalDate.class);");
						pw.printf("			return new %s(date);\n", implSmplName);
					} else if((ntvGSNtvSmpl != null && ntvGSNtvSmpl.equals("LocalTime")) || icSmplName.equals("Time")) {
						pw.println("			java.time.LocalTime time = context.deserialize(jsonElement, java.time.LocalTime.class);");
						pw.printf("			return new %s(time);\n", implSmplName);
					} else {
						pw.println("			java.util.Date date = context.deserialize(jsonElement, java.util.Date.class);");
						pw.printf("			return new %s(date);\n", implSmplName);
					}
				} else if((extension.equals("core") && (orgTypes.contains("DataType") || (orgTypes.contains("Clazz")
								&& (icSmplName.equals("Float") || icSmplName.equals("Integer") || icSmplName.equals("URL")))))
							|| (extension.equals("pending") && orgTypes.contains("Clazz")
								&& (icSmplName.equals("CssSelectorType") || icSmplName.equals("XPathType")))) {
					if(icSmplName.equals("Float") || icSmplName.equals("Integer") || icSmplName.equals("Number")) {
						pw.printf("			try {\n");
					}
					if(icSmplName.equals("Boolean")) {
						pw.printf("			return new %s(jsonElement.getAsBoolean());\n", implSmplName);
					} else if(icSmplName.equals("Float")) {
						pw.printf("				return new %s(jsonElement.getAsDouble());\n", implSmplName);
					} else if(icSmplName.equals("Integer")) {
						pw.printf("				return new %s(jsonElement.getAsLong());\n", implSmplName);
					} else if(icSmplName.equals("Number")) {
						pw.printf("				return new %s(jsonElement.getAsBigDecimal());\n", implSmplName);
					} else {
						pw.printf("			return new %s(jsonElement.getAsString());\n", implSmplName);
					}
					if(icSmplName.equals("Float") || icSmplName.equals("Integer") || icSmplName.equals("Number")) {
						pw.printf("			} catch(NumberFormatException nfe) {\n");
						pw.printf("				return null;\n");
						pw.printf("			}\n");
					}
				} else {
					String ntvGSNtvSmpl2 = ntvGSNtvSmpl;
					if(ntvGSNtvSmpl.equals("B00lean")) {
						ntvGSNtvSmpl2 = "Boolean";
						pw.printf("			return new %s(jsonElement.getAs%s());\n", implSmplName, ntvGSNtvSmpl2);
					} else if(ntvGSNtvSmpl.equals("D0uble") || ntvGSNtvSmpl.equals("L0ng")){
						if(ntvGSNtvSmpl.equals("D0uble")) {
							ntvGSNtvSmpl2 = "Double";
						} else if(ntvGSNtvSmpl.equals("L0ng")) {
							ntvGSNtvSmpl2 = "Long";
						}
						pw.printf("			try {\n");
						pw.printf("				return new %s(jsonElement.getAs%s());\n", implSmplName, ntvGSNtvSmpl2);
						pw.printf("			} catch(NumberFormatException nfe) {\n");
						pw.printf("				return null;\n");
						pw.printf("			}\n");
					} else {
						pw.printf("			return new %s(jsonElement.getAs%s());\n", implSmplName, ntvGSNtvSmpl2);
					}
				}
				pw.println("		}");
				pw.println("");
				pw.println("		JsonObject jsonObject = jsonElement.getAsJsonObject();");
				pw.printf("		%s%s obj = new %s();\n", pre2, icSmplName2, implSmplName);
				pw.println("		HashMap<String, Field> fldMap = new HashMap<>();");
				pw.printf("		Field[] flds = %s.class.getFields();\n", implSmplName);
				pw.println("		for(Field fld : flds) {");
				pw.println("			fldMap.put(fld.getName(), fld);");
				pw.println("		}");
				pw.println("		for(Entry<String, JsonElement> ent : jsonObject.entrySet()) {");
				pw.println("			if(fldMap.containsKey(ent.getKey())) {");
				pw.println("				Field fld = fldMap.get(ent.getKey());");
				pw.println("				JsonElement elm = ent.getValue();");
				pw.println("				try {");
				pw.println("					if(fld.getType().equals(List.class)) {");
				pw.println("						ParameterizedType gType = (ParameterizedType)fld.getGenericType();");
				pw.println("						Type[] aTypes = gType.getActualTypeArguments();");
				pw.println("						Type listType = TypeToken.getParameterized(ArrayList.class, (Class<?>)aTypes[0]).getType();");
				pw.println("						List<?> list = context.deserialize(elm, listType);");
				pw.println("						fld.set(obj, list);");
				pw.println("					} else {");
				pw.println("						Object val = context.deserialize(elm, fld.getType());");
				pw.println("						fld.set(obj, val);");
				pw.println("					}");
				pw.println("				} catch(IllegalArgumentException iae) {");
				pw.println("					throw new JsonParseException(iae);");
				pw.println("				} catch(IllegalAccessException iae) {");
				pw.println("					throw new JsonParseException(iae);");
				pw.println("				}");
				pw.println("			}");
				pw.println("		}");
				pw.println("");
				pw.println("		return obj;");
				pw.println("	}");
				pw.println("");
				pw.println("}");

				pw.close();
				pw = null;
				implData.gsonTypeNameMap.put(typePkg + "." + orgType + "$" + icSmplName2,
						gsonPkg.toString() + "." + icSmplName2 + "Deserializer");
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.exit(1);
		} finally {
			if(pw != null) {
				pw.close();
				pw = null;
			}
			if(br != null) {
				try {
					br.close();
				} catch(IOException ioe) {}
				br = null;
			}
		}

	}
}
