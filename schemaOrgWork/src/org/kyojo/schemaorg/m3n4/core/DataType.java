package org.kyojo.schemaorg.m3n4.core;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DataType")
@CamelizedName("dataType")
@ConstantizedName("DATA_TYPE")
public interface DataType extends Clazz.DataType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Boolean")
	@SchemaOrgLabel("Boolean")
	@SchemaOrgComment("Boolean: True or False.")
	@CamelizedName("boolean")
	@ConstantizedName("BOOLEAN")
	@SampleValue("1")
	public interface Boolean extends DataType {

		public java.lang.Boolean getB00lean();
		public void setB00lean(java.lang.Boolean b00lean);
		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Date")
	@SchemaOrgLabel("Date")
	@SchemaOrgComment(""
			+ "A date value in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date"
			+ " format</a>.")
	@CamelizedName("date")
	@ConstantizedName("DATE")
	@SampleValue("2")
	public interface Date extends DataType {

		public LocalDate getDate();
		public void setDate(LocalDate date);
		public java.sql.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DateTime")
	@SchemaOrgLabel("DateTime")
	@SchemaOrgComment(""
			+ "A combination of date and time of day in the form"
			+ " [-]CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm] (see Chapter 5.4 of ISO 8601).")
	@CamelizedName("dateTime")
	@ConstantizedName("DATE_TIME")
	@SampleValue("3")
	public interface DateTime extends DataType {

		public OffsetDateTime getDateTime();
		public void setDateTime(OffsetDateTime dateTime);
		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Number")
	@SchemaOrgLabel("Number")
	@SchemaOrgComment("Data type: Number.")
	@CamelizedName("number")
	@ConstantizedName("NUMBER")
	@SampleValue("4")
	public interface Number extends DataType {

		public java.math.BigDecimal getNumber();
		public void setNumber(java.math.BigDecimal number);
		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Text")
	@SchemaOrgLabel("Text")
	@SchemaOrgComment("Data type: Text.")
	@CamelizedName("text")
	@ConstantizedName("TEXT")
	@SampleValue("5")
	public interface Text extends DataType {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Time")
	@SchemaOrgLabel("Time")
	@SchemaOrgComment(""
			+ "A point in time recurring on multiple days in the form hh:mm:ss[Z|(+|-)hh:mm]"
			+ " (see <a href=\"http://www.w3.org/TR/xmlschema-2/#time\">XML schema for"
			+ " details</a>).")
	@CamelizedName("time")
	@ConstantizedName("TIME")
	@SampleValue("6")
	public interface Time extends DataType {

		public LocalTime getTime();
		public void setTime(LocalTime time);
		public java.sql.Time getNativeValue();

	}

}
