package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/DayOfWeek")
@CamelizedName("dayOfWeek")
@ConstantizedName("DAY_OF_WEEK")
public interface DayOfWeek extends Clazz.DayOfWeek {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Friday")
	@SchemaOrgLabel("Friday")
	@SchemaOrgComment(""
			+ "The day of the week between Thursday and Saturday.")
	@CamelizedName("friday")
	@ConstantizedName("FRIDAY")
	@SampleValue("5")
	public interface Friday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Monday")
	@SchemaOrgLabel("Monday")
	@SchemaOrgComment(""
			+ "The day of the week between Sunday and Tuesday.")
	@CamelizedName("monday")
	@ConstantizedName("MONDAY")
	@SampleValue("1")
	public interface Monday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicHolidays")
	@SchemaOrgLabel("PublicHolidays")
	@SchemaOrgComment(""
			+ "This stands for any day that is a public holiday; it is a placeholder for all"
			+ " official public holidays in some particular location. While not technically a"
			+ " \"day of the week\", it can be used with <a class=\"localLink\""
			+ " href=\"http://schema.org/OpeningHoursSpecification\">OpeningHoursSpecification</a>."
			+ " In the context of an opening hours specification it can be used to indicate"
			+ " opening hours on public holidays, overriding general opening hours for the day"
			+ " of the week on which a public holiday occurs.")
	@CamelizedName("publicHolidays")
	@ConstantizedName("PUBLIC_HOLIDAYS")
	@SampleValue("7")
	public interface PublicHolidays extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Saturday")
	@SchemaOrgLabel("Saturday")
	@SchemaOrgComment(""
			+ "The day of the week between Friday and Sunday.")
	@CamelizedName("saturday")
	@ConstantizedName("SATURDAY")
	@SampleValue("6")
	public interface Saturday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Sunday")
	@SchemaOrgLabel("Sunday")
	@SchemaOrgComment(""
			+ "The day of the week between Saturday and Monday.")
	@CamelizedName("sunday")
	@ConstantizedName("SUNDAY")
	@SampleValue("0")
	public interface Sunday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Thursday")
	@SchemaOrgLabel("Thursday")
	@SchemaOrgComment(""
			+ "The day of the week between Wednesday and Friday.")
	@CamelizedName("thursday")
	@ConstantizedName("THURSDAY")
	@SampleValue("4")
	public interface Thursday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Tuesday")
	@SchemaOrgLabel("Tuesday")
	@SchemaOrgComment(""
			+ "The day of the week between Monday and Wednesday.")
	@CamelizedName("tuesday")
	@ConstantizedName("TUESDAY")
	@SampleValue("2")
	public interface Tuesday extends DayOfWeek {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Wednesday")
	@SchemaOrgLabel("Wednesday")
	@SchemaOrgComment(""
			+ "The day of the week between Tuesday and Thursday.")
	@CamelizedName("wednesday")
	@ConstantizedName("WEDNESDAY")
	@SampleValue("3")
	public interface Wednesday extends DayOfWeek {

	}

}
