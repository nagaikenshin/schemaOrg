package org.kyojo.schemaorg;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This is the enum for providing schemaOrg data type mappings to Java native classes.
 */
public enum NativeValueDataType {

	TEXT("text", String.class,
			ConsistentDataType.Text.class,
			org.kyojo.schemaorg.m3n3.core.DataType.Text.class),
	DATE_TIME("dateTime", OffsetDateTime.class,
			ConsistentDataType.DateTime.class,
			org.kyojo.schemaorg.m3n3.core.DataType.DateTime.class),
	DATE("date", LocalDate.class,
			ConsistentDataType.Date.class,
			org.kyojo.schemaorg.m3n3.core.DataType.Date.class),
	TIME("time", LocalTime.class,
			ConsistentDataType.Time.class,
			org.kyojo.schemaorg.m3n3.core.DataType.Time.class),
	FLOAT("fl0at", Double.class,
			ConsistentDataType.Float.class,
			org.kyojo.schemaorg.m3n3.core.Clazz.Float.class),
	INTEGER("integer", Long.class,
			ConsistentDataType.Integer.class,
			org.kyojo.schemaorg.m3n3.core.Clazz.Integer.class),
	NUMBER("number", BigDecimal.class,
			ConsistentDataType.Number.class,
			org.kyojo.schemaorg.m3n3.core.DataType.Number.class),
	BOOLEAN("b00lean", Boolean.class,
			ConsistentDataType.Boolean.class,
			org.kyojo.schemaorg.m3n3.core.DataType.Boolean.class);

	private final String suffix;
	private final Class<?> nativeValueClass;
	private final Class<?> curDataTypeClass;
	private final Class<?> prvDataTypeClass;

	private NativeValueDataType(final String suffix, final Class<?> nativeValueClass,
			Class<?> curDataTypeClass, Class<?> prvDataTypeClass) {
		this.suffix = suffix;
		this.nativeValueClass = nativeValueClass;
		this.curDataTypeClass = curDataTypeClass;
		this.prvDataTypeClass = prvDataTypeClass;
	}

	public String getSuffix() {
		return suffix;
	}

	public Class<?> getNativeValueClass() {
		return nativeValueClass;
	}

	public Class<?> getCurDataTypeClass() {
		return curDataTypeClass;
	}

	public Class<?> getPrvDataTypeClass() {
		return prvDataTypeClass;
	}

	public static NativeValueDataType getEnumByDataTypeClass(final Class<?> cls) {
		final NativeValueDataType[] nvdts = values();
		for(final NativeValueDataType nvdt : nvdts) {
			if(nvdt.getCurDataTypeClass().isAssignableFrom(cls)) {
				return nvdt;
			} else if(nvdt.getPrvDataTypeClass().isAssignableFrom(cls)) {
				return nvdt;
			}
		}
		return null;
	}

	public static String dataTypeToString(Object dt, NativeValueDataType nvdt) {
		if(dt == null) return "";

		switch(nvdt) {
		case TEXT:
			if(dt instanceof ConsistentDataType.Text) {
				ConsistentDataType.Text text = (ConsistentDataType.Text)dt;
				if(text.getString() == null) {
					return "";
				} else {
					return text.getString();
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.Text) {
				org.kyojo.schemaorg.m3n3.core.DataType.Text text = (org.kyojo.schemaorg.m3n3.core.DataType.Text)dt;
				if(text.getString() == null) {
					return "";
				} else {
					return text.getString();
				}
			} else {
				return "";
			}
		case DATE_TIME:
			if(dt instanceof ConsistentDataType.DateTime) {
				ConsistentDataType.DateTime dateTime = (ConsistentDataType.DateTime)dt;
				if(dateTime.getDateTime() == null) {
					return "";
				} else {
					DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
					return dateTime.getDateTime().format(ymdhmszDtf);
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.DateTime) {
				org.kyojo.schemaorg.m3n3.core.DataType.DateTime dateTime = (org.kyojo.schemaorg.m3n3.core.DataType.DateTime)dt;
				if(dateTime.getDateTime() == null) {
					return "";
				} else {
					DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
					return dateTime.getDateTime().format(ymdhmszDtf);
				}
			} else {
				return "";
			}
		case DATE:
			if(dt instanceof ConsistentDataType.Date) {
				ConsistentDataType.Date date = (ConsistentDataType.Date)dt;
				if(date.getDate() == null) {
					return "";
				} else {
					DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					return date.getDate().format(ymdDtf);
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.Date) {
				org.kyojo.schemaorg.m3n3.core.DataType.Date date = (org.kyojo.schemaorg.m3n3.core.DataType.Date)dt;
				if(date.getDate() == null) {
					return "";
				} else {
					DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					return date.getDate().format(ymdDtf);
				}
			} else {
				return "";
			}
		case TIME:
			if(dt instanceof ConsistentDataType.Time) {
				ConsistentDataType.Time time = (ConsistentDataType.Time)dt;
				if(time.getTime() == null) {
					return "";
				} else {
					DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					return time.getTime().format(hmsDtf);
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.Time) {
				org.kyojo.schemaorg.m3n3.core.DataType.Time time = (org.kyojo.schemaorg.m3n3.core.DataType.Time)dt;
				if(time.getTime() == null) {
					return "";
				} else {
					DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					return time.getTime().format(hmsDtf);
				}
			} else {
				return "";
			}
		case FLOAT:
			if(dt instanceof ConsistentDataType.Float) {
				ConsistentDataType.Float fl0at = (ConsistentDataType.Float)dt;
				if(fl0at.getD0uble() == null) {
					return "";
				} else {
					return fl0at.getD0uble().toString();
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.Clazz.Float) {
				org.kyojo.schemaorg.m3n3.core.Clazz.Float fl0at = (org.kyojo.schemaorg.m3n3.core.Clazz.Float)dt;
				if(fl0at.getD0uble() == null) {
					return "";
				} else {
					return fl0at.getD0uble().toString();
				}
			} else {
				return "";
			}
		case INTEGER:
			if(dt instanceof ConsistentDataType.Integer) {
				ConsistentDataType.Integer integer = (ConsistentDataType.Integer)dt;
				if(integer.getL0ng() == null) {
					return "";
				} else {
					return integer.getL0ng().toString();
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.Clazz.Integer) {
				org.kyojo.schemaorg.m3n3.core.Clazz.Integer integer = (org.kyojo.schemaorg.m3n3.core.Clazz.Integer)dt;
				if(integer.getL0ng() == null) {
					return "";
				} else {
					return integer.getL0ng().toString();
				}
			} else {
				return "";
			}
		case NUMBER:
			if(dt instanceof ConsistentDataType.Number) {
				ConsistentDataType.Number number = (ConsistentDataType.Number)dt;
				if(number.getNumber() == null) {
					return "";
				} else {
					return number.getNumber().toString();
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.Number) {
				org.kyojo.schemaorg.m3n3.core.DataType.Number number = (org.kyojo.schemaorg.m3n3.core.DataType.Number)dt;
				if(number.getNumber() == null) {
					return "";
				} else {
					return number.getNumber().toString();
				}
			} else {
				return "";
			}
		case BOOLEAN:
			if(dt instanceof ConsistentDataType.Boolean) {
				ConsistentDataType.Boolean b00lean = (ConsistentDataType.Boolean)dt;
				if(b00lean.getB00lean() == null) {
					return "";
				} else {
					return b00lean.getB00lean().toString();
				}
			} else if(dt instanceof org.kyojo.schemaorg.m3n3.core.DataType.Boolean) {
				org.kyojo.schemaorg.m3n3.core.DataType.Boolean b00lean = (org.kyojo.schemaorg.m3n3.core.DataType.Boolean)dt;
				if(b00lean.getB00lean() == null) {
					return "";
				} else {
					return b00lean.getB00lean().toString();
				}
			} else {
				return "";
			}
		default:
			return "";
		}
	}

}
