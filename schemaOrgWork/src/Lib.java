import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

public class Lib {

	public static void retrieveInterfaces(Class<?> cls, ImplData implData, int gi, int gm)
			throws ClassNotFoundException {
		Map<String, Method[]> gsMap = implData.gsMap;
		Map<String, Method> oMap = implData.oMap;
		Map<String, Class<?>> pMap = implData.pMap;
		List<String> ifcTree = implData.ifcTree;

		// インデントをつけてデバッグ出力
		String sps = StringUtils.repeat(" ", gi);
		System.out.println(sps + cls.getName());
		ifcTree.add(sps + cls.getName());

		Method[] mtds = cls.getMethods();
		for(Method mtd : mtds) {
			// System.out.println(sps + "  " + mtd.getName());
			String mname = mtd.getName();
			if(mname.startsWith("get")) {
				String pname = mname.substring(3).toLowerCase();
				if(gsMap.containsKey(pname)) {
					Method[] ms = gsMap.get(pname);
					if(ms[0] == null) {
						ms[0] = mtd;
						addPropertyList(cls, mtd, pMap);
					} else if(ms[0].getReturnType().equals(mtd.getReturnType())) {
					} else {
						// System.out.println("odd returnType. (" + mname + ")");
						// System.exit(1);
					}
				} else {
					addPropertyList(cls, mtd, pMap);
					gsMap.put(pname, new Method[] { mtd, null });
				}
			} else if(mname.startsWith("set")) {
				String pname = mname.substring(3).toLowerCase();
				if(gsMap.containsKey(pname)) {
					Method[] ms = gsMap.get(pname);
					ms[1] = mtd;
				} else {
					gsMap.put(pname, new Method[] { null, mtd });
				}
			} else {
				oMap.put(mname, mtd);
			}
		}

		if(gm < 0 || gi < gm) {
			Class<?>[] ifcs = cls.getInterfaces();
			for(Class<?> ifc : ifcs) {
				retrieveInterfaces(ifc, implData, gi + 1, gm);
			}
		}
	}

	private static void addPropertyList(Class<?> cls, Method mtd,
			Map<String, Class<?>> pMap) throws ClassNotFoundException {
		if((!Text.class.isAssignableFrom(cls)
				&& (mtd.getName().equals("getString") || mtd.getName().equals("setString")))
			|| mtd.getName().equals("getNativeValue")) {
		} else if(mtd.getName().equals("getNativeValue")) {
		} else if(mtd.getName().equals("getSeq")) {
			pMap.put("seq", Long.class);
		} else if(mtd.getName().equals("getRefSeq")) {
			pMap.put("refSeq", Long.class);
		} else if(mtd.getName().equals("getRefAcr")) {
			pMap.put("refAcr", String.class);
		} else if(mtd.getName().equals("getCreatedAt")) {
			pMap.put("createdAt", java.util.Date.class);
		} else if(mtd.getName().equals("getCreatedBy")) {
			pMap.put("createdBy", Long.class);
		} else if(mtd.getName().equals("getUpdatedAt")) {
			pMap.put("updatedAt", java.util.Date.class);
		} else if(mtd.getName().equals("getUpdatedBy")) {
			pMap.put("updatedBy", Long.class);
		} else if(mtd.getName().equals("getExpiredAt")) {
			pMap.put("expiredAt", java.util.Date.class);
		} else if(mtd.getName().equals("getExpiredBy")) {
			pMap.put("expiredBy", Long.class);
		} else if(mtd.getReturnType().getSimpleName().equals("List")) {
			Type type = mtd.getGenericReturnType();
			System.out.println(type.toString());
			ParameterizedType gType = (ParameterizedType)type;
			Type[] aTypes = gType.getActualTypeArguments();
			Class<?> rtnCls = (Class<?>)aTypes[0];
			pMap.put(rtnCls.getName(), rtnCls);
		} else {
			Class<?> rtnCls = mtd.getReturnType();
			pMap.put(rtnCls.getName(), rtnCls);
		}
	}

}
