package org.kyojo.schemaorg.m3n5.auto;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueDate;
import org.kyojo.schemaorg.NativeValueNumber;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n5.auto.Clazz;
import org.kyojo.schemaorg.m3n5.core.Clazz.Float;
import org.kyojo.schemaorg.m3n5.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n5.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.DataType.Date;
import org.kyojo.schemaorg.m3n5.core.DataType.Number;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accelerationTime")
	@SchemaOrgLabel("accelerationTime")
	@SchemaOrgComment(""
			+ "The time needed to accelerate the vehicle from a given start velocity to a given"
			+ " target velocity.<br/><br/>\n\nTypical unit code(s): SEC for"
			+ " seconds<br/><br/>\n\n<ul>\n<li>Note: There are unfortunately no standard unit"
			+ " codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use \"SEC\" for"
			+ " seconds and indicate the velocities in the <a class=\"localLink\""
			+ " href=\"http://schema.org/name\">name</a> of the <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a>, or use <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> with a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> of 0..60 mph"
			+ " or 0..100 km/h to specify the reference speeds.</li>\n</ul>\n")
	@CamelizedName("accelerationTime")
	@ConstantizedName("ACCELERATION_TIME")
	public interface AccelerationTime extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
	public interface AcrissCode extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
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
	public interface BodyType extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

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
	public interface EmissionsCO2 extends NativeValueNumber, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Float">http://schema.org/Float</a>
		 */
		public Float getFl0at();
		public void setFl0at(Float fl0at);
		public List<Float> getFl0atList();
		public void setFl0atList(List<Float> fl0atList);
		public boolean hasFl0at();

		/**
		 * @see <a href="http://schema.org/Integer">http://schema.org/Integer</a>
		 */
		public Integer getInteger();
		public void setInteger(Integer integer);
		public List<Integer> getIntegerList();
		public void setIntegerList(List<Integer> integerList);
		public boolean hasInteger();

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
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
			+ " combustion engine in a single movement. <br/><br/>\n\nTypical unit code(s): CMQ"
			+ " for cubic centimeter, LTR for liters, INQ for cubic inches\n* Note 1: You can"
			+ " link to information about how the given value has been determined using the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> property.\n* Note"
			+ " 2: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.")
	@CamelizedName("engineDisplacement")
	@ConstantizedName("ENGINE_DISPLACEMENT")
	public interface EngineDisplacement extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The power of the vehicle's engine.\n    Typical unit code(s): KWT for kilowatt,"
			+ " BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875"
			+ " W)<br/><br/>\n\n<ul>\n<li>Note 1: There are many different ways of measuring an"
			+ " engine's power. For an overview, see  <a"
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
	public interface EnginePower extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
	public interface EngineType extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
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
			+ " all storage of the same type.<br/><br/>\n\nTypical unit code(s): LTR for"
			+ " liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours"
			+ " (for electrical vehicles).")
	@CamelizedName("fuelCapacity")
	@ConstantizedName("FUEL_CAPACITY")
	public interface FuelCapacity extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
	public interface MeetsEmissionStandard extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/URL">http://schema.org/URL</a>
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

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
	public interface ModelDate extends NativeValueDate, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Date">http://schema.org/Date</a>
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
			+ "The permitted weight of passengers and cargo, EXCLUDING the weight of the empty"
			+ " vehicle.<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for"
			+ " pound<br/><br/>\n\n<ul>\n<li>Note 1: Many databases specify the permitted TOTAL"
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
	public interface Payload extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The permitted total weight of cargo and installations (e.g. a roof rack) on top"
			+ " of the vehicle.<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for"
			+ " pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate additional information in"
			+ " the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a"
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
	public interface RoofLoad extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ " law.<br/><br/>\n\nTypical unit code(s): C62 for persons")
	@CamelizedName("seatingCapacity")
	@ConstantizedName("SEATING_CAPACITY")
	public interface SeatingCapacity extends NativeValueNumber, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Float">http://schema.org/Float</a>
		 */
		public Float getFl0at();
		public void setFl0at(Float fl0at);
		public List<Float> getFl0atList();
		public void setFl0atList(List<Float> fl0atList);
		public boolean hasFl0at();

		/**
		 * @see <a href="http://schema.org/Integer">http://schema.org/Integer</a>
		 */
		public Integer getInteger();
		public void setInteger(Integer integer);
		public List<Integer> getIntegerList();
		public void setIntegerList(List<Integer> integerList);
		public boolean hasInteger();

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/speed")
	@SchemaOrgLabel("speed")
	@SchemaOrgComment(""
			+ "The speed range of the vehicle. If the vehicle is powered by an engine, the"
			+ " upper limit of the speed range (indicated by <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> should be the maximum speed"
			+ " achievable under regular conditions.<br/><br/>\n\nTypical unit code(s): KMH for"
			+ " km/h, HM for mile per hour (0.447 04 m/s), KNT for knot<br/><br/>\n\n*Note 1:"
			+ " Use <a class=\"localLink\" href=\"http://schema.org/minValue\">minValue</a> and"
			+ " <a class=\"localLink\" href=\"http://schema.org/maxValue\">maxValue</a> to"
			+ " indicate the range. Typically, the minimal value is zero.\n* Note 2: There are"
			+ " many different ways of measuring the speed range. You can link to information"
			+ " about how the given value has been determined using the <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> property.")
	@CamelizedName("speed")
	@ConstantizedName("SPEED")
	public interface Speed extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The permitted vertical load (TWR) of a trailer attached to the vehicle. Also"
			+ " referred to as Tongue Load Rating (TLR) or Vertical Load Rating"
			+ " (VLR)<br/><br/>\n\nTypical unit code(s): KGM for kilogram, LBR for"
			+ " pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate additional information in"
			+ " the <a class=\"localLink\" href=\"http://schema.org/name\">name</a> of the <a"
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
	public interface TongueWeight extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The torque (turning force) of the vehicle's engine.<br/><br/>\n\nTypical unit"
			+ " code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for"
			+ " pound-force per inch<br/><br/>\n\n<ul>\n<li>Note 1: You can link to information"
			+ " about how the given value has been determined (e.g. reference RPM) using the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a>"
			+ " property.</li>\n<li>Note 2: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate"
			+ " ranges.</li>\n</ul>\n")
	@CamelizedName("torque")
	@ConstantizedName("TORQUE")
	public interface Torque extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The permitted weight of a trailer attached to the vehicle.<br/><br/>\n\nTypical"
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
	public interface TrailerWeight extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
	public interface VehicleSpecialUsage extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CarUsageType">http://schema.org/CarUsageType</a>
		 */
		public Clazz.CarUsageType getCarUsageType();
		public void setCarUsageType(Clazz.CarUsageType carUsageType);
		public List<Clazz.CarUsageType> getCarUsageTypeList();
		public void setCarUsageTypeList(List<Clazz.CarUsageType> carUsageTypeList);
		public boolean hasCarUsageType();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/weightTotal")
	@SchemaOrgLabel("weightTotal")
	@SchemaOrgComment(""
			+ "The permitted total weight of the loaded vehicle, including passengers and cargo"
			+ " and the weight of the empty vehicle.<br/><br/>\n\nTypical unit code(s): KGM for"
			+ " kilogram, LBR for pound<br/><br/>\n\n<ul>\n<li>Note 1: You can indicate"
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
	public interface WeightTotal extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
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
			+ "The distance between the centers of the front and rear"
			+ " wheels.<br/><br/>\n\nTypical unit code(s): CMT for centimeters, MTR for meters,"
			+ " INH for inches, FOT for foot/feet")
	@CamelizedName("wheelbase")
	@ConstantizedName("WHEELBASE")
	public interface Wheelbase extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

}
