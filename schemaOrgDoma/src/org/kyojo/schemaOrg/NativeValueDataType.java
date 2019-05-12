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

	TEXT("text", String.class, ConsistentDataType.Text.class),
	DATE_TIME("dateTime", OffsetDateTime.class,
			ConsistentDataType.DateTime.class),
	DATE("date", LocalDate.class,
			ConsistentDataType.Date.class),
	TIME("time", LocalTime.class,
			ConsistentDataType.Time.class),
	FLOAT("fl0at", Double.class,
			ConsistentDataType.Float.class),
	INTEGER("integer", Long.class,
			ConsistentDataType.Integer.class),
	NUMBER("number", BigDecimal.class,
			ConsistentDataType.Number.class),
	BOOLEAN("b00lean", Boolean.class,
			ConsistentDataType.Boolean.class);

	private final String suffix;
	private final Class<?> nativeValueClass;
	private final Class<?> dataTypeClass;

	private NativeValueDataType(final String suffix, final Class<?> nativeValueClass,
			Class<?> dataTypeClass) {
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
			if(dt instanceof ConsistentDataType.Text) {
				ConsistentDataType.Text text = (ConsistentDataType.Text)dt;
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
			} else {
				return "";
			}
		default:
			return "";
		}
	}

}
