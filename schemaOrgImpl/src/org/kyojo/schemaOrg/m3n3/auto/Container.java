package org.kyojo.schemaOrg.m3n3.auto;

import java.util.List;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgProperty;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.auto.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.URL;
import org.kyojo.schemaOrg.m3n3.core.DataType.Date;
import org.kyojo.schemaOrg.m3n3.core.DataType.Number;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accelerationTime")
	@SchemaOrgLabel("accelerationTime")
	@SchemaOrgComment(""
			+ "<p>The time needed to accelerate the vehicle from a given start velocity to a"
			+ " given target velocity.</p>\n\n<p>Typical unit code(s): SEC for"
			+ " seconds</p>\n\n<ul>\n<li>Note: There are unfortunately no standard unit codes"
			+ " for seconds/0..100 km/h or seconds/0..60 mph. Simply use \"SEC\" for seconds"
			+ " and indicate the velocities in the <a class=\"localLink\""
			+ " href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>, or use <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> with a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> of 0..60 mph"
			+ " or 0..100 km/h to specify the reference speeds.</li>\n</ul>\n")
	@CamelizedName("accelerationTime")
	@ConstantizedName("ACCELERATION_TIME")
	public interface AccelerationTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acrissCode")
	@SchemaOrgLabel("acrissCode")
	@SchemaOrgComment(""
			+ "The ACRISS Car Classification Code is a code used by many car rental companies,"
			+ " for classifying vehicles. ACRISS stands for Association of Car Rental Industry"
			+ " Systems and Standards.")
	@CamelizedName("acrissCode")
	@ConstantizedName("ACRISS_CODE")
	public interface AcrissCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bodyType")
	@SchemaOrgLabel("bodyType")
	@SchemaOrgComment(""
			+ "Indicates the design and body style of the vehicle (e.g. station wagon,"
			+ " hatchback, etc.).")
	@CamelizedName("bodyType")
	@ConstantizedName("BODY_TYPE")
	public interface BodyType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/emissionsCO2")
	@SchemaOrgLabel("emissionsCO2")
	@SchemaOrgComment(""
			+ "The CO2 emissions in g/km. When used in combination with a QuantitativeValue,"
			+ " put \"g/km\" into the unitText property of that value, since there is no"
			+ " UN/CEFACT Common Code for \"g/km\".")
	@CamelizedName("emissionsCO2")
	@ConstantizedName("EMISSIONS_CO2")
	public interface EmissionsCO2 extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/engineDisplacement")
	@SchemaOrgLabel("engineDisplacement")
	@SchemaOrgComment(""
			+ "The volume swept by all of the pistons inside the cylinders of an internal"
			+ " combustion engine in a single movement. </p>\n\n<p>Typical unit code(s): CMQ"
			+ " for cubic centimeter, LTR for liters, INQ for cubic inches\n* Note 1: You can"
			+ " link to information about how the given value has been determined using the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> property.\n* Note"
			+ " 2: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.")
	@CamelizedName("engineDisplacement")
	@ConstantizedName("ENGINE_DISPLACEMENT")
	public interface EngineDisplacement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/enginePower")
	@SchemaOrgLabel("enginePower")
	@SchemaOrgComment(""
			+ "<p>The power of the vehicle's engine.\n    Typical unit code(s): KWT for"
			+ " kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS ="
			+ " 735,49875 W)</p>\n\n<ul>\n<li>Note 1: There are many different ways of"
			+ " measuring an engine's power. For an overview, see  <a"
			+ " href=\"http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes\">http://en.wikipedia.org/wiki/Horsepower#Engine<em>power</em>test_codes</a>.</li>\n<li>Note"
			+ " 2: You can link to information about how the given value has been determined"
			+ " using the <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>"
			+ " property.</li>\n<li>Note 3: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("enginePower")
	@ConstantizedName("ENGINE_POWER")
	public interface EnginePower extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/engineType")
	@SchemaOrgLabel("engineType")
	@SchemaOrgComment(""
			+ "The type of engine or engines powering the vehicle.")
	@CamelizedName("engineType")
	@ConstantizedName("ENGINE_TYPE")
	public interface EngineType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fuelCapacity")
	@SchemaOrgLabel("fuelCapacity")
	@SchemaOrgComment(""
			+ "The capacity of the fuel tank or in the case of electric cars, the battery. If"
			+ " there are multiple components for storage, this should indicate the total of"
			+ " all storage of the same type.</p>\n\n<p>Typical unit code(s): LTR for liters,"
			+ " GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for"
			+ " electrical vehicles).")
	@CamelizedName("fuelCapacity")
	@ConstantizedName("FUEL_CAPACITY")
	public interface FuelCapacity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/meetsEmissionStandard")
	@SchemaOrgLabel("meetsEmissionStandard")
	@SchemaOrgComment(""
			+ "Indicates that the vehicle meets the respective emission standard.")
	@CamelizedName("meetsEmissionStandard")
	@ConstantizedName("MEETS_EMISSION_STANDARD")
	public interface MeetsEmissionStandard extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/modelDate")
	@SchemaOrgLabel("modelDate")
	@SchemaOrgComment(""
			+ "The release date of a vehicle model (often used to differentiate versions of the"
			+ " same make and model).")
	@CamelizedName("modelDate")
	@ConstantizedName("MODEL_DATE")
	public interface ModelDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public Date getDate();
		public void setDate(Date date);
		public List<Date> getDateList();
		public void setDateList(List<Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/payload")
	@SchemaOrgLabel("payload")
	@SchemaOrgComment(""
			+ "<p>The permitted weight of passengers and cargo, EXCLUDING the weight of the"
			+ " empty vehicle.</p>\n\n<p>Typical unit code(s): KGM for kilogram, LBR for"
			+ " pound</p>\n\n<ul>\n<li>Note 1: Many databases specify the permitted TOTAL"
			+ " weight instead, which is the sum of <a class=\"localLink\""
			+ " href=\"http://schema.org/weight\">weight</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/payload\">payload</a></li>\n<li>Note 2: You can"
			+ " indicate additional information in the <a class=\"localLink\""
			+ " href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>"
			+ " node.</li>\n<li>Note 3: You may also link to a <a class=\"localLink\""
			+ " href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that"
			+ " provides additional information using <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 4:"
			+ " Note that you can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("payload")
	@ConstantizedName("PAYLOAD")
	public interface Payload extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/roofLoad")
	@SchemaOrgLabel("roofLoad")
	@SchemaOrgComment(""
			+ "<p>The permitted total weight of cargo and installations (e.g. a roof rack) on"
			+ " top of the vehicle.</p>\n\n<p>Typical unit code(s): KGM for kilogram, LBR for"
			+ " pound</p>\n\n<ul>\n<li>Note 1: You can indicate additional information in the"
			+ " <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>"
			+ " node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\""
			+ " href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that"
			+ " provides additional information using <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a></li>\n<li>Note 3:"
			+ " Note that you can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("roofLoad")
	@ConstantizedName("ROOF_LOAD")
	public interface RoofLoad extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seatingCapacity")
	@SchemaOrgLabel("seatingCapacity")
	@SchemaOrgComment(""
			+ "The number of persons that can be seated (e.g. in a vehicle), both in terms of"
			+ " the physical space available, and in terms of limitations set by"
			+ " law.</p>\n\n<p>Typical unit code(s): C62 for persons")
	@CamelizedName("seatingCapacity")
	@ConstantizedName("SEATING_CAPACITY")
	public interface SeatingCapacity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/speed")
	@SchemaOrgLabel("speed")
	@SchemaOrgComment(""
			+ "The speed range of the vehicle. If the vehicle is powered by an engine, the"
			+ " upper limit of the speed range (indicated by <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> should be the maximum speed"
			+ " achievable under regular conditions.</p>\n\n<p>Typical unit code(s): KMH for"
			+ " km/h, HM for mile per hour (0.447 04 m/s), KNT for knot</p>\n\n<p>*Note 1: Use"
			+ " <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and <a"
			+ " class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to"
			+ " indicate the range. Typically, the minimal value is zero.\n* Note 2: There are"
			+ " many different ways of measuring the speed range. You can link to information"
			+ " about how the given value has been determined using the <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> property.")
	@CamelizedName("speed")
	@ConstantizedName("SPEED")
	public interface Speed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tongueWeight")
	@SchemaOrgLabel("tongueWeight")
	@SchemaOrgComment(""
			+ "<p>The permitted vertical load (TWR) of a trailer attached to the vehicle. Also"
			+ " referred to as Tongue Load Rating (TLR) or Vertical Load Rating"
			+ " (VLR)</p>\n\n<p>Typical unit code(s): KGM for kilogram, LBR for"
			+ " pound</p>\n\n<ul>\n<li>Note 1: You can indicate additional information in the"
			+ " <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>"
			+ " node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\""
			+ " href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that"
			+ " provides additional information using <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 3:"
			+ " Note that you can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("tongueWeight")
	@ConstantizedName("TONGUE_WEIGHT")
	public interface TongueWeight extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/torque")
	@SchemaOrgLabel("torque")
	@SchemaOrgComment(""
			+ "<p>The torque (turning force) of the vehicle's engine.</p>\n\n<p>Typical unit"
			+ " code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for"
			+ " pound-force per inch</p>\n\n<ul>\n<li>Note 1: You can link to information about"
			+ " how the given value has been determined (e.g. reference RPM) using the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>"
			+ " property.</li>\n<li>Note 2: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("torque")
	@ConstantizedName("TORQUE")
	public interface Torque extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trailerWeight")
	@SchemaOrgLabel("trailerWeight")
	@SchemaOrgComment(""
			+ "The permitted weight of a trailer attached to the vehicle.</p>\n\n<p>Typical"
			+ " unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate"
			+ " additional information in the <a class=\"localLink\""
			+ " href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> node.\n*"
			+ " Note 2: You may also link to a <a class=\"localLink\""
			+ " href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that"
			+ " provides additional information using <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>.\n* Note 3: Note"
			+ " that you can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.")
	@CamelizedName("trailerWeight")
	@ConstantizedName("TRAILER_WEIGHT")
	public interface TrailerWeight extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleSpecialUsage")
	@SchemaOrgLabel("vehicleSpecialUsage")
	@SchemaOrgComment(""
			+ "Indicates whether the vehicle has been used for special purposes, like"
			+ " commercial rental, driving school, or as a taxi. The legislation in many"
			+ " countries requires this information to be revealed when offering a car for"
			+ " sale.")
	@CamelizedName("vehicleSpecialUsage")
	@ConstantizedName("VEHICLE_SPECIAL_USAGE")
	public interface VehicleSpecialUsage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/CarUsageType
		 * class: org.kyojo.schemaOrg.m3n3.auto.Clazz.CarUsageType
		 */
		public Clazz.CarUsageType getCarUsageType();
		public void setCarUsageType(Clazz.CarUsageType carUsageType);
		public List<Clazz.CarUsageType> getCarUsageTypeList();
		public void setCarUsageTypeList(List<Clazz.CarUsageType> carUsageTypeList);
		public boolean hasCarUsageType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/weightTotal")
	@SchemaOrgLabel("weightTotal")
	@SchemaOrgComment(""
			+ "<p>The permitted total weight of the loaded vehicle, including passengers and"
			+ " cargo and the weight of the empty vehicle.</p>\n\n<p>Typical unit code(s): KGM"
			+ " for kilogram, LBR for pound</p>\n\n<ul>\n<li>Note 1: You can indicate"
			+ " additional information in the <a class=\"localLink\""
			+ " href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>"
			+ " node.</li>\n<li>Note 2: You may also link to a <a class=\"localLink\""
			+ " href=\"http://schema.org/QualitativeValue\">QualitativeValue</a> node that"
			+ " provides additional information using <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>.</li>\n<li>Note 3:"
			+ " Note that you can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("weightTotal")
	@ConstantizedName("WEIGHT_TOTAL")
	public interface WeightTotal extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/wheelbase")
	@SchemaOrgLabel("wheelbase")
	@SchemaOrgComment(""
			+ "The distance between the centers of the front and rear wheels.</p>\n\n<p>Typical"
			+ " unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for"
			+ " foot/feet")
	@CamelizedName("wheelbase")
	@ConstantizedName("WHEELBASE")
	public interface Wheelbase extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

}
