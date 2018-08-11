package org.kyojo.schemaOrg;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.DataType;

public enum NativeValueDataType {

	TEXT("text", String.class, DataType.Text.class),
	DATE_TIME("dateTime", OffsetDateTime.class, DataType.DateTime.class),
	DATE("date", LocalDate.class, DataType.Date.class),
	TIME("time", LocalTime.class, DataType.Time.class),
	FLOAT("fl0at", Double.class, Clazz.Float.class),
	INTEGER("integer", Long.class, Clazz.Integer.class),
	NUMBER("number", BigDecimal.class, DataType.Number.class),
	BOOLEAN("b00lean", Boolean.class, DataType.Boolean.class);

	private final String suffix;
	private final Class<?> nativeValueClass;
	private final Class<?> dataTypeClass;

	private NativeValueDataType(final String suffix,
			final Class<?> nativeValueClass, Class<?> dataTypeClass) {
		this.suffix = suffix;
		this.nativeValueClass = nativeValueClass;
		this.dataTypeClass = dataTypeClass;
	}

	public String getSuffix() {
		return suffix;
	}

	public Class<?> getNativeValueClass() {
		return nativeValueClass;
	}

	public Class<?> getDataTypeClass() {
		return dataTypeClass;
	}

	public static NativeValueDataType getEnumByDataTypeClass(final Class<?> cls) {
		final NativeValueDataType[] nvdts = values();
		for(final NativeValueDataType nvdt : nvdts) {
			if(nvdt.getDataTypeClass().isAssignableFrom(cls)) {
				return nvdt;
			}
		}
		return null;
	}

	public static String dataTypeToString(Object dt, NativeValueDataType nvdt) {
		if(dt == null) return "";

		switch(nvdt) {
		case TEXT:
			DataType.Text text = (DataType.Text)dt;
			if(text.getString() == null) {
				return "";
			} else {
				return text.getString();
			}
		case DATE_TIME:
			DataType.DateTime dateTime = (DataType.DateTime)dt;
			if(dateTime.getDateTime() == null) {
				return "";
			} else {
				DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
				return dateTime.getDateTime().format(ymdhmszDtf);
			}
		case DATE:
			DataType.Date date = (DataType.Date)dt;
			if(date.getDate() == null) {
				return "";
			} else {
				DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				return date.getDate().format(ymdDtf);
			}
		case TIME:
			DataType.Time time = (DataType.Time)dt;
			if(time.getTime() == null) {
				return "";
			} else {
				DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				return time.getTime().format(hmsDtf);
			}
		case FLOAT:
			Clazz.Float fl0at = (Clazz.Float)dt;
			if(fl0at.getD0uble() == null) {
				return "";
			} else {
				return fl0at.getD0uble().toString();
			}
		case INTEGER:
			Clazz.Integer integer = (Clazz.Integer)dt;
			if(integer.getL0ng() == null) {
				return "";
			} else {
				return integer.getL0ng().toString();
			}
		case NUMBER:
			DataType.Number number = (DataType.Number)dt;
			if(number.getNumber() == null) {
				return "";
			} else {
				return number.getNumber().toString();
			}
		case BOOLEAN:
			DataType.Boolean b00lean = (DataType.Boolean)dt;
			if(b00lean.getB00lean() == null) {
				return "";
			} else {
				return b00lean.getB00lean().toString();
			}
		default:
			return "";
		}
	}

}
