package org.kyojo.schemaorg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

public interface ConsistentDataType {

	public interface Boolean {

		public java.lang.Boolean getB00lean();
		public void setB00lean(java.lang.Boolean b00lean);
		public java.lang.Boolean getNativeValue();

	}

	public interface Date {

		public LocalDate getDate();
		public void setDate(LocalDate date);
		public java.sql.Date getNativeValue();

	}

	public interface DateTime {

		public OffsetDateTime getDateTime();
		public void setDateTime(OffsetDateTime dateTime);
		public java.util.Date getNativeValue();

	}

	public interface Number {

		public java.math.BigDecimal getNumber();
		public void setNumber(java.math.BigDecimal number);
		public java.math.BigDecimal getNativeValue();

	}

	public interface Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	public interface Time {

		public LocalTime getTime();
		public void setTime(LocalTime time);
		public java.sql.Time getNativeValue();

	}

	public interface Float {

		public Double getD0uble();
		public void setD0uble(Double d0uble);
		public Double getNativeValue();

	}

	public interface Integer {

		public Long getL0ng();
		public void setL0ng(Long l0ng);
		public Long getNativeValue();

	}

	public interface URL extends Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
