package org.kyojo.schemaorg.m3n4.pending;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n4.core.Clazz.Event;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Clazz.Language;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n4.core.Clazz.Offer;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristAttraction;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n4.core.Container.Creator;
import org.kyojo.schemaorg.m3n4.core.Container.DateCreated;
import org.kyojo.schemaorg.m3n4.core.Container.Genre;
import org.kyojo.schemaorg.m3n4.core.Container.HasPart;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.IsPartOf;
import org.kyojo.schemaorg.m3n4.core.Container.PublishingPrinciples;
import org.kyojo.schemaorg.m3n4.core.Container.SpatialCoverage;
import org.kyojo.schemaorg.m3n4.core.Container.WorkExample;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.DataType.Date;
import org.kyojo.schemaorg.m3n4.core.DataType.DateTime;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Frequency;
import org.kyojo.schemaorg.m3n4.pending.Clazz;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accountMinimumInflow")
	@SchemaOrgLabel("accountMinimumInflow")
	@SchemaOrgComment(""
			+ "A minimum amount that has to be paid in every month.")
	@CamelizedName("accountMinimumInflow")
	@ConstantizedName("ACCOUNT_MINIMUM_INFLOW")
	public interface AccountMinimumInflow extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accountOverdraftLimit")
	@SchemaOrgLabel("accountOverdraftLimit")
	@SchemaOrgComment(""
			+ "An overdraft is an extension of credit from a lending institution when an"
			+ " account reaches zero. An overdraft allows the individual to continue"
			+ " withdrawing money even if the account has no funds in it. Basically the bank"
			+ " allows people to borrow a set amount of money.")
	@CamelizedName("accountOverdraftLimit")
	@ConstantizedName("ACCOUNT_OVERDRAFT_LIMIT")
	public interface AccountOverdraftLimit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionAccessibilityRequirement")
	@SchemaOrgLabel("actionAccessibilityRequirement")
	@SchemaOrgComment(""
			+ "A set of requirements that a must be fulfilled in order to perform an Action. If"
			+ " more than one value is specied, fulfilling one set of requirements will allow"
			+ " the Action to be performed.")
	@CamelizedName("actionAccessibilityRequirement")
	@ConstantizedName("ACTION_ACCESSIBILITY_REQUIREMENT")
	public interface ActionAccessibilityRequirement extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ActionAccessSpecification">http://schema.org/ActionAccessSpecification</a>
		 */
		public Clazz.ActionAccessSpecification getActionAccessSpecification();
		public void setActionAccessSpecification(Clazz.ActionAccessSpecification actionAccessSpecification);
		public List<Clazz.ActionAccessSpecification> getActionAccessSpecificationList();
		public void setActionAccessSpecificationList(List<Clazz.ActionAccessSpecification> actionAccessSpecificationList);
		public boolean hasActionAccessSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionableFeedbackPolicy")
	@SchemaOrgLabel("actionableFeedbackPolicy")
	@SchemaOrgComment(""
			+ "For a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a> or"
			+ " other news-related <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a>, a statement about"
			+ " public engagement activities (for news media, the newsroom’s), including"
			+ " involving the public - digitally or otherwise -- in coverage decisions,"
			+ " reporting and activities after publication.")
	@CamelizedName("actionableFeedbackPolicy")
	@ConstantizedName("ACTIONABLE_FEEDBACK_POLICY")
	public interface ActionableFeedbackPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/appearance")
	@SchemaOrgLabel("appearance")
	@SchemaOrgComment(""
			+ "Indicates an occurence of a <a class=\"localLink\""
			+ " href=\"http://schema.org/Claim\">Claim</a> in some <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a>.")
	@CamelizedName("appearance")
	@ConstantizedName("APPEARANCE")
	public interface Appearance extends SchemaOrgProperty, WorkExample {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/authenticator")
	@SchemaOrgLabel("authenticator")
	@SchemaOrgComment(""
			+ "The Organization responsible for authenticating the user's subscription. For"
			+ " example, many media apps require a cable/satellite provider to authenticate"
			+ " your subscription before playing media.")
	@CamelizedName("authenticator")
	@ConstantizedName("AUTHENTICATOR")
	public interface Authenticator extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availabilityEnds")
	@SchemaOrgLabel("availabilityEnds")
	@SchemaOrgComment(""
			+ "The end of the availability of the product or service included in the offer.")
	@CamelizedName("availabilityEnds")
	@ConstantizedName("AVAILABILITY_ENDS")
	public interface AvailabilityEnds extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DateTime">http://schema.org/DateTime</a>
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availabilityStarts")
	@SchemaOrgLabel("availabilityStarts")
	@SchemaOrgComment(""
			+ "The beginning of the availability of the product or service included in the"
			+ " offer.")
	@CamelizedName("availabilityStarts")
	@ConstantizedName("AVAILABILITY_STARTS")
	public interface AvailabilityStarts extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DateTime">http://schema.org/DateTime</a>
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/backstory")
	@SchemaOrgLabel("backstory")
	@SchemaOrgComment(""
			+ "For an <a class=\"localLink\" href=\"http://schema.org/Article\">Article</a>,"
			+ " typically a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a>, the backstory property"
			+ " provides a textual summary giving a brief explanation of why and how an article"
			+ " was created. In a journalistic setting this could include information about"
			+ " reporting process, methods, interviews, data sources, etc.")
	@CamelizedName("backstory")
	@ConstantizedName("BACKSTORY")
	public interface Backstory extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/bankAccountType")
	@SchemaOrgLabel("bankAccountType")
	@SchemaOrgComment("The type of a bank account.")
	@CamelizedName("bankAccountType")
	@ConstantizedName("BANK_ACCOUNT_TYPE")
	public interface BankAccountType extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/beneficiaryBank")
	@SchemaOrgLabel("beneficiaryBank")
	@SchemaOrgComment(""
			+ "A bank or bank’s branch, financial institution or international financial"
			+ " institution operating the beneficiary’s bank account or releasing funds for the"
			+ " beneficiary")
	@CamelizedName("beneficiaryBank")
	@ConstantizedName("BENEFICIARY_BANK")
	public interface BeneficiaryBank extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BankOrCreditUnion">http://schema.org/BankOrCreditUnion</a>
		 */
		public BankOrCreditUnion getBankOrCreditUnion();
		public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion);
		public List<BankOrCreditUnion> getBankOrCreditUnionList();
		public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList);
		public boolean hasBankOrCreditUnion();

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
	@SchemaOrgURI("http://schema.org/benefitsSummaryUrl")
	@SchemaOrgLabel("benefitsSummaryUrl")
	@SchemaOrgComment(""
			+ "The URL that goes directly to the summary of benefits and coverage for the"
			+ " specific standard plan or plan variation.")
	@CamelizedName("benefitsSummaryUrl")
	@ConstantizedName("BENEFITS_SUMMARY_URL")
	public interface BenefitsSummaryUrl extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/broadcastFrequency")
	@SchemaOrgLabel("broadcastFrequency")
	@SchemaOrgComment(""
			+ "The frequency used for over-the-air broadcasts. Numeric values or simple ranges"
			+ " e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and"
			+ " FM radio channels, e.g. \"87 FM\".")
	@CamelizedName("broadcastFrequency")
	@ConstantizedName("BROADCAST_FREQUENCY")
	public interface BroadcastFrequency extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BroadcastFrequencySpecification">http://schema.org/BroadcastFrequencySpecification</a>
		 */
		public Clazz.BroadcastFrequencySpecification getBroadcastFrequencySpecification();
		public void setBroadcastFrequencySpecification(Clazz.BroadcastFrequencySpecification broadcastFrequencySpecification);
		public List<Clazz.BroadcastFrequencySpecification> getBroadcastFrequencySpecificationList();
		public void setBroadcastFrequencySpecificationList(List<Clazz.BroadcastFrequencySpecification> broadcastFrequencySpecificationList);
		public boolean hasBroadcastFrequencySpecification();

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
	@SchemaOrgURI("http://schema.org/broadcastFrequencyValue")
	@SchemaOrgLabel("broadcastFrequencyValue")
	@SchemaOrgComment(""
			+ "The frequency in MHz for a particular broadcast.")
	@CamelizedName("broadcastFrequencyValue")
	@ConstantizedName("BROADCAST_FREQUENCY_VALUE")
	public interface BroadcastFrequencyValue extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/byDay")
	@SchemaOrgLabel("byDay")
	@SchemaOrgComment(""
			+ "Defines the day(s) of the week on which a recurring <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> takes place")
	@CamelizedName("byDay")
	@ConstantizedName("BY_DAY")
	public interface ByDay extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DayOfWeek">http://schema.org/DayOfWeek</a>
		 */
		public DayOfWeek getDayOfWeek();
		public void setDayOfWeek(DayOfWeek dayOfWeek);
		public List<DayOfWeek> getDayOfWeekList();
		public void setDayOfWeekList(List<DayOfWeek> dayOfWeekList);
		public boolean hasDayOfWeek();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/byMonth")
	@SchemaOrgLabel("byMonth")
	@SchemaOrgComment(""
			+ "Defines the month(s) of the year on which a recurring <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> takes place. Specified as an <a"
			+ " class=\"localLink\" href=\"http://schema.org/Integer\">Integer</a> between"
			+ " 1-12. January is 1.")
	@CamelizedName("byMonth")
	@ConstantizedName("BY_MONTH")
	public interface ByMonth extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Integer">http://schema.org/Integer</a>
		 */
		public Integer getInteger();
		public void setInteger(Integer integer);
		public List<Integer> getIntegerList();
		public void setIntegerList(List<Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/byMonthDay")
	@SchemaOrgLabel("byMonthDay")
	@SchemaOrgComment(""
			+ "Defines the day(s) of the month on which a recurring <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> takes place. Specified as an <a"
			+ " class=\"localLink\" href=\"http://schema.org/Integer\">Integer</a> between"
			+ " 1-31.")
	@CamelizedName("byMonthDay")
	@ConstantizedName("BY_MONTH_DAY")
	public interface ByMonthDay extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Integer">http://schema.org/Integer</a>
		 */
		public Integer getInteger();
		public void setInteger(Integer integer);
		public List<Integer> getIntegerList();
		public void setIntegerList(List<Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cashBack")
	@SchemaOrgLabel("cashBack")
	@SchemaOrgComment(""
			+ "A cardholder benefit that pays the cardholder a small percentage of their net"
			+ " expenditures.")
	@CamelizedName("cashBack")
	@ConstantizedName("CASH_BACK")
	public interface CashBack extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

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
	@SchemaOrgURI("http://schema.org/category")
	@SchemaOrgLabel("category")
	@SchemaOrgComment(""
			+ "A category for the item. Greater signs or slashes can be used to informally"
			+ " indicate a category hierarchy.")
	@CamelizedName("category")
	@ConstantizedName("CATEGORY")
	public interface Category extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/PhysicalActivityCategory">http://schema.org/PhysicalActivityCategory</a>
		 */
		public PhysicalActivityCategory getPhysicalActivityCategory();
		public void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory);
		public List<PhysicalActivityCategory> getPhysicalActivityCategoryList();
		public void setPhysicalActivityCategoryList(List<PhysicalActivityCategory> physicalActivityCategoryList);
		public boolean hasPhysicalActivityCategory();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/Thing">http://schema.org/Thing</a>
		 */
		public Thing getThing();
		public void setThing(Thing thing);
		public List<Thing> getThingList();
		public void setThingList(List<Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/codeValue")
	@SchemaOrgLabel("codeValue")
	@SchemaOrgComment(""
			+ "A short textual code that uniquely identifies the value.")
	@CamelizedName("codeValue")
	@ConstantizedName("CODE_VALUE")
	public interface CodeValue extends SchemaOrgProperty, TermCode {

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
	@SchemaOrgURI("http://schema.org/contactlessPayment")
	@SchemaOrgLabel("contactlessPayment")
	@SchemaOrgComment(""
			+ "A secure method for consumers to purchase products or services via debit, credit"
			+ " or smartcards by using RFID or NFC technology.")
	@CamelizedName("contactlessPayment")
	@ConstantizedName("CONTACTLESS_PAYMENT")
	public interface ContactlessPayment extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentReferenceTime")
	@SchemaOrgLabel("contentReferenceTime")
	@SchemaOrgComment(""
			+ "The specific time described by a creative work, for works (e.g. articles, video"
			+ " objects etc.) that emphasise a particular moment within an Event.")
	@CamelizedName("contentReferenceTime")
	@ConstantizedName("CONTENT_REFERENCE_TIME")
	public interface ContentReferenceTime extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DateTime">http://schema.org/DateTime</a>
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/correction")
	@SchemaOrgLabel("correction")
	@SchemaOrgComment(""
			+ "Indicates a correction to a <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a>, either via a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/CorrectionComment\">CorrectionComment</a>, textually"
			+ " or in another document.")
	@CamelizedName("correction")
	@ConstantizedName("CORRECTION")
	public interface Correction extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CorrectionComment">http://schema.org/CorrectionComment</a>
		 */
		public Clazz.CorrectionComment getCorrectionComment();
		public void setCorrectionComment(Clazz.CorrectionComment correctionComment);
		public List<Clazz.CorrectionComment> getCorrectionCommentList();
		public void setCorrectionCommentList(List<Clazz.CorrectionComment> correctionCommentList);
		public boolean hasCorrectionComment();

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
	@SchemaOrgURI("http://schema.org/correctionsPolicy")
	@SchemaOrgLabel("correctionsPolicy")
	@SchemaOrgComment(""
			+ "For an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> (e.g. <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>), a"
			+ " statement describing (in news media, the newsroom’s) disclosure and correction"
			+ " policy for errors.")
	@CamelizedName("correctionsPolicy")
	@ConstantizedName("CORRECTIONS_POLICY")
	public interface CorrectionsPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/cssSelector")
	@SchemaOrgLabel("cssSelector")
	@SchemaOrgComment(""
			+ "A CSS selector, e.g. of a <a class=\"localLink\""
			+ " href=\"http://schema.org/SpeakableSpecification\">SpeakableSpecification</a> or"
			+ " <a class=\"localLink\""
			+ " href=\"http://schema.org/WebPageElement\">WebPageElement</a>. In the latter"
			+ " case, multiple matches within a page can constitute a single conceptual \"Web"
			+ " page element\".")
	@CamelizedName("cssSelector")
	@ConstantizedName("CSS_SELECTOR")
	public interface CssSelector extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CssSelectorType">http://schema.org/CssSelectorType</a>
		 */
		public Clazz.CssSelectorType getCssSelectorType();
		public void setCssSelectorType(Clazz.CssSelectorType cssSelectorType);
		public List<Clazz.CssSelectorType> getCssSelectorTypeList();
		public void setCssSelectorTypeList(List<Clazz.CssSelectorType> cssSelectorTypeList);
		public boolean hasCssSelectorType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/currency")
	@SchemaOrgLabel("currency")
	@SchemaOrgComment(""
			+ "The currency in which the monetary amount is expressed.<br/><br/>\n\nUse"
			+ " standard formats: <a href=\"http://en.wikipedia.org/wiki/ISO_4217\">ISO 4217"
			+ " currency format</a> e.g. \"USD\"; <a"
			+ " href=\"https://en.wikipedia.org/wiki/List_of_cryptocurrencies\">Ticker"
			+ " symbol</a> for cryptocurrencies e.g. \"BTC\"; well known names for <a"
			+ " href=\"https://en.wikipedia.org/wiki/Local_exchange_trading_system\">Local"
			+ " Exchange Tradings Systems</a> (LETS) and other currency types e.g. \"Ithaca"
			+ " HOUR\".")
	@CamelizedName("currency")
	@ConstantizedName("CURRENCY")
	public interface Currency extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/currentExchangeRate")
	@SchemaOrgLabel("currentExchangeRate")
	@SchemaOrgComment("The current price of a currency.")
	@CamelizedName("currentExchangeRate")
	@ConstantizedName("CURRENT_EXCHANGE_RATE")
	public interface CurrentExchangeRate extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/UnitPriceSpecification">http://schema.org/UnitPriceSpecification</a>
		 */
		public UnitPriceSpecification getUnitPriceSpecification();
		public void setUnitPriceSpecification(UnitPriceSpecification unitPriceSpecification);
		public List<UnitPriceSpecification> getUnitPriceSpecificationList();
		public void setUnitPriceSpecificationList(List<UnitPriceSpecification> unitPriceSpecificationList);
		public boolean hasUnitPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diversityPolicy")
	@SchemaOrgLabel("diversityPolicy")
	@SchemaOrgComment(""
			+ "Statement on diversity policy by an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> e.g. a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>. For"
			+ " a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>, a"
			+ " statement describing the newsroom’s diversity policy on both staffing and"
			+ " sources, typically providing staffing data.")
	@CamelizedName("diversityPolicy")
	@ConstantizedName("DIVERSITY_POLICY")
	public interface DiversityPolicy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/diversityStaffingReport")
	@SchemaOrgLabel("diversityStaffingReport")
	@SchemaOrgComment(""
			+ "For an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> (often but not"
			+ " necessarily a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>), a"
			+ " report on staffing diversity issues. In a news context this might be for"
			+ " example ASNE or RTDNA (US) reports, or self-reported.")
	@CamelizedName("diversityStaffingReport")
	@ConstantizedName("DIVERSITY_STAFFING_REPORT")
	public interface DiversityStaffingReport extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Article">http://schema.org/Article</a>
		 */
		public Article getArticle();
		public void setArticle(Article article);
		public List<Article> getArticleList();
		public void setArticleList(List<Article> articleList);
		public boolean hasArticle();

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
	@SchemaOrgURI("http://schema.org/documentation")
	@SchemaOrgLabel("documentation")
	@SchemaOrgComment(""
			+ "Further documentation describing the Web API in more detail.")
	@CamelizedName("documentation")
	@ConstantizedName("DOCUMENTATION")
	public interface Documentation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/domiciledMortgage")
	@SchemaOrgLabel("domiciledMortgage")
	@SchemaOrgComment(""
			+ "Whether borrower is a resident of the jurisdiction where the property is"
			+ " located.")
	@CamelizedName("domiciledMortgage")
	@ConstantizedName("DOMICILED_MORTGAGE")
	public interface DomiciledMortgage extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/downPayment")
	@SchemaOrgLabel("downPayment")
	@SchemaOrgComment(""
			+ "a type of payment made in cash during the onset of the purchase of an expensive"
			+ " good/service. The payment typically represents only a percentage of the full"
			+ " purchase price.")
	@CamelizedName("downPayment")
	@ConstantizedName("DOWN_PAYMENT")
	public interface DownPayment extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
	@SchemaOrgURI("http://schema.org/duration")
	@SchemaOrgLabel("duration")
	@SchemaOrgComment(""
			+ "The duration of the item (movie, audio recording, event, etc.) in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>.")
	@CamelizedName("duration")
	@ConstantizedName("DURATION")
	public interface Duration extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.core.Clazz.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.core.Clazz.Duration duration);
		public List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> getDurationList();
		public void setDurationList(List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/earlyPrepaymentPenalty")
	@SchemaOrgLabel("earlyPrepaymentPenalty")
	@SchemaOrgComment(""
			+ "The amount to be paid as a penalty in the event of early payment of the loan.")
	@CamelizedName("earlyPrepaymentPenalty")
	@ConstantizedName("EARLY_PREPAYMENT_PENALTY")
	public interface EarlyPrepaymentPenalty extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/educationRequirements")
	@SchemaOrgLabel("educationRequirements")
	@SchemaOrgComment(""
			+ "Educational background needed for the position.")
	@CamelizedName("educationRequirements")
	@ConstantizedName("EDUCATION_REQUIREMENTS")
	public interface EducationRequirements extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/educationalCredentialAwarded")
	@SchemaOrgLabel("educationalCredentialAwarded")
	@SchemaOrgComment(""
			+ "A description of the qualification, award, certificate, diploma or other"
			+ " educational credential awarded as a consequence of successful completion of"
			+ " this course.")
	@CamelizedName("educationalCredentialAwarded")
	@ConstantizedName("EDUCATIONAL_CREDENTIAL_AWARDED")
	public interface EducationalCredentialAwarded extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/eligibleRegion")
	@SchemaOrgLabel("eligibleRegion")
	@SchemaOrgComment(""
			+ "The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the"
			+ " GeoShape for the geo-political region(s) for which the offer or delivery charge"
			+ " specification is valid.<br/><br/>\n\nSee also <a class=\"localLink\""
			+ " href=\"http://schema.org/ineligibleRegion\">ineligibleRegion</a>.")
	@CamelizedName("eligibleRegion")
	@ConstantizedName("ELIGIBLE_REGION")
	public interface EligibleRegion extends AreaServed, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeoShape">http://schema.org/GeoShape</a>
		 */
		public GeoShape getGeoShape();
		public void setGeoShape(GeoShape geoShape);
		public List<GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

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
	@SchemaOrgURI("http://schema.org/estimatedSalary")
	@SchemaOrgLabel("estimatedSalary")
	@SchemaOrgComment(""
			+ "The estimated salary for this occupation in the given occupationLocation.")
	@CamelizedName("estimatedSalary")
	@ConstantizedName("ESTIMATED_SALARY")
	public interface EstimatedSalary extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		/**
		 * @see <a href="http://schema.org/MonetaryAmountDistribution">http://schema.org/MonetaryAmountDistribution</a>
		 */
		public Clazz.MonetaryAmountDistribution getMonetaryAmountDistribution();
		public void setMonetaryAmountDistribution(Clazz.MonetaryAmountDistribution monetaryAmountDistribution);
		public List<Clazz.MonetaryAmountDistribution> getMonetaryAmountDistributionList();
		public void setMonetaryAmountDistributionList(List<Clazz.MonetaryAmountDistribution> monetaryAmountDistributionList);
		public boolean hasMonetaryAmountDistribution();

		/**
		 * @see <a href="http://schema.org/Number">http://schema.org/Number</a>
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * @see <a href="http://schema.org/PriceSpecification">http://schema.org/PriceSpecification</a>
		 */
		public PriceSpecification getPriceSpecification();
		public void setPriceSpecification(PriceSpecification priceSpecification);
		public List<PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ethicsPolicy")
	@SchemaOrgLabel("ethicsPolicy")
	@SchemaOrgComment(""
			+ "Statement about ethics policy, e.g. of a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>"
			+ " regarding journalistic and publishing practices, or of a <a class=\"localLink\""
			+ " href=\"http://schema.org/Restaurant\">Restaurant</a>, a page describing food"
			+ " source policies. In the case of a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>, an"
			+ " ethicsPolicy is typically a statement describing the personal, organizational,"
			+ " and corporate standards of behavior expected by the organization.")
	@CamelizedName("ethicsPolicy")
	@ConstantizedName("ETHICS_POLICY")
	public interface EthicsPolicy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/eventSchedule")
	@SchemaOrgLabel("eventSchedule")
	@SchemaOrgComment(""
			+ "Associates an <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>"
			+ " with a <a class=\"localLink\" href=\"http://schema.org/Schedule\">Schedule</a>."
			+ " There are circumstances where it is preferable to share a schedule for a series"
			+ " of\n      repeating events rather than data on the individual events"
			+ " themselves. For example, a website or application might prefer to publish a"
			+ " schedule for a weekly\n      gym class rather than provide data on every event."
			+ " A schedule could be processed by applications to add forthcoming events to a"
			+ " calendar. An <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>"
			+ " that\n      is associated with a <a class=\"localLink\""
			+ " href=\"http://schema.org/Schedule\">Schedule</a> using this property should not"
			+ " have <a class=\"localLink\" href=\"http://schema.org/startDate\">startDate</a>"
			+ " or <a class=\"localLink\" href=\"http://schema.org/endDate\">endDate</a>"
			+ " properties. These are instead defined within the associated\n      <a"
			+ " class=\"localLink\" href=\"http://schema.org/Schedule\">Schedule</a>, this"
			+ " avoids any ambiguity for clients using the data. The propery might have"
			+ " repeated values to specify different schedules, e.g. for different months\n    "
			+ "  or seasons.")
	@CamelizedName("eventSchedule")
	@ConstantizedName("EVENT_SCHEDULE")
	public interface EventSchedule extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.core.Clazz.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.core.Clazz.Duration duration);
		public List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> getDurationList();
		public void setDurationList(List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exceptDate")
	@SchemaOrgLabel("exceptDate")
	@SchemaOrgComment(""
			+ "Defines a <a class=\"localLink\" href=\"http://schema.org/Date\">Date</a> or <a"
			+ " class=\"localLink\" href=\"http://schema.org/DateTime\">DateTime</a> during"
			+ " which a scheduled <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> will not take place. The property"
			+ " allows exceptions to\n      a <a class=\"localLink\""
			+ " href=\"http://schema.org/Schedule\">Schedule</a> to be specified. If an"
			+ " exception is specified as a <a class=\"localLink\""
			+ " href=\"http://schema.org/DateTime\">DateTime</a> then only the event that would"
			+ " have started at that specific date and time\n      should be excluded from the"
			+ " schedule. If an exception is specified as a <a class=\"localLink\""
			+ " href=\"http://schema.org/Date\">Date</a> then any event that is scheduled for"
			+ " that 24 hour period should be\n      excluded from the schedule. This allows a"
			+ " whole day to be excluded from the schedule without having to itemise every"
			+ " scheduled event.")
	@CamelizedName("exceptDate")
	@ConstantizedName("EXCEPT_DATE")
	public interface ExceptDate extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Date">http://schema.org/Date</a>
		 */
		public Date getDate();
		public void setDate(Date date);
		public List<Date> getDateList();
		public void setDateList(List<Date> dateList);
		public boolean hasDate();

		/**
		 * @see <a href="http://schema.org/DateTime">http://schema.org/DateTime</a>
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exchangeRateSpread")
	@SchemaOrgLabel("exchangeRateSpread")
	@SchemaOrgComment(""
			+ "The difference between the price at which a broker or other intermediary buys"
			+ " and sells foreign currency.")
	@CamelizedName("exchangeRateSpread")
	@ConstantizedName("EXCHANGE_RATE_SPREAD")
	public interface ExchangeRateSpread extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
	@SchemaOrgURI("http://schema.org/expectsAcceptanceOf")
	@SchemaOrgLabel("expectsAcceptanceOf")
	@SchemaOrgComment(""
			+ "An Offer which must be accepted before the user can perform the Action. For"
			+ " example, the user may need to buy a movie before being able to watch it.")
	@CamelizedName("expectsAcceptanceOf")
	@ConstantizedName("EXPECTS_ACCEPTANCE_OF")
	public interface ExpectsAcceptanceOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Offer">http://schema.org/Offer</a>
		 */
		public Offer getOffer();
		public void setOffer(Offer offer);
		public List<Offer> getOfferList();
		public void setOfferList(List<Offer> offerList);
		public boolean hasOffer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/experienceRequirements")
	@SchemaOrgLabel("experienceRequirements")
	@SchemaOrgComment(""
			+ "Description of skills and experience needed for the position.")
	@CamelizedName("experienceRequirements")
	@ConstantizedName("EXPERIENCE_REQUIREMENTS")
	public interface ExperienceRequirements extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/firstAppearance")
	@SchemaOrgLabel("firstAppearance")
	@SchemaOrgComment(""
			+ "Indicates the first known occurence of a <a class=\"localLink\""
			+ " href=\"http://schema.org/Claim\">Claim</a> in some <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a>.")
	@CamelizedName("firstAppearance")
	@ConstantizedName("FIRST_APPEARANCE")
	public interface FirstAppearance extends SchemaOrgProperty, WorkExample {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/floorLimit")
	@SchemaOrgLabel("floorLimit")
	@SchemaOrgComment(""
			+ "A floor limit is the amount of money above which credit card transactions must"
			+ " be authorized.")
	@CamelizedName("floorLimit")
	@ConstantizedName("FLOOR_LIMIT")
	public interface FloorLimit extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyContains")
	@SchemaOrgLabel("geospatiallyContains")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a containing geometry to a contained geometry. \"a contains b iff no"
			+ " points of b lie in the exterior of a, and at least one point of the interior of"
			+ " b lies in the interior of a\". As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyContains")
	@ConstantizedName("GEOSPATIALLY_CONTAINS")
	public interface GeospatiallyContains extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyCoveredBy")
	@SchemaOrgLabel("geospatiallyCoveredBy")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a geometry to another that covers it. As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyCoveredBy")
	@ConstantizedName("GEOSPATIALLY_COVERED_BY")
	public interface GeospatiallyCoveredBy extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyCovers")
	@SchemaOrgLabel("geospatiallyCovers")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a covering geometry to a covered geometry. \"Every point of b is a"
			+ " point of (the interior or boundary of) a\". As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyCovers")
	@ConstantizedName("GEOSPATIALLY_COVERS")
	public interface GeospatiallyCovers extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyCrosses")
	@SchemaOrgLabel("geospatiallyCrosses")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a geometry to another that crosses it: \"a crosses b: they have some"
			+ " but not all interior points in common, and the dimension of the intersection is"
			+ " less than that of at least one of them\". As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyCrosses")
	@ConstantizedName("GEOSPATIALLY_CROSSES")
	public interface GeospatiallyCrosses extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyDisjoint")
	@SchemaOrgLabel("geospatiallyDisjoint")
	@SchemaOrgComment(""
			+ "Represents spatial relations in which two geometries (or the places they"
			+ " represent) are topologically disjoint: they have no point in common. They form"
			+ " a set of disconnected geometries.\" (a symmetric relationship, as defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>)")
	@CamelizedName("geospatiallyDisjoint")
	@ConstantizedName("GEOSPATIALLY_DISJOINT")
	public interface GeospatiallyDisjoint extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyEquals")
	@SchemaOrgLabel("geospatiallyEquals")
	@SchemaOrgComment(""
			+ "Represents spatial relations in which two geometries (or the places they"
			+ " represent) are topologically equal, as defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>. \"Two geometries are"
			+ " topologically equal if their interiors intersect and no part of the interior or"
			+ " boundary of one geometry intersects the exterior of the other\" (a symmetric"
			+ " relationship)")
	@CamelizedName("geospatiallyEquals")
	@ConstantizedName("GEOSPATIALLY_EQUALS")
	public interface GeospatiallyEquals extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyIntersects")
	@SchemaOrgLabel("geospatiallyIntersects")
	@SchemaOrgComment(""
			+ "Represents spatial relations in which two geometries (or the places they"
			+ " represent) have at least one point in common. As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyIntersects")
	@ConstantizedName("GEOSPATIALLY_INTERSECTS")
	public interface GeospatiallyIntersects extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyOverlaps")
	@SchemaOrgLabel("geospatiallyOverlaps")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a geometry to another that geospatially overlaps it, i.e. they have"
			+ " some but not all points in common. As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyOverlaps")
	@ConstantizedName("GEOSPATIALLY_OVERLAPS")
	public interface GeospatiallyOverlaps extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyTouches")
	@SchemaOrgLabel("geospatiallyTouches")
	@SchemaOrgComment(""
			+ "Represents spatial relations in which two geometries (or the places they"
			+ " represent) touch: they have at least one boundary point in common, but no"
			+ " interior points.\" (a symmetric relationship, as defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a> )")
	@CamelizedName("geospatiallyTouches")
	@ConstantizedName("GEOSPATIALLY_TOUCHES")
	public interface GeospatiallyTouches extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geospatiallyWithin")
	@SchemaOrgLabel("geospatiallyWithin")
	@SchemaOrgComment(""
			+ "Represents a relationship between two geometries (or the places they represent),"
			+ " relating a geometry to one that contains it, i.e. it is inside (i.e. within)"
			+ " its interior. As defined in <a"
			+ " href=\"https://en.wikipedia.org/wiki/DE-9IM\">DE-9IM</a>.")
	@CamelizedName("geospatiallyWithin")
	@ConstantizedName("GEOSPATIALLY_WITHIN")
	public interface GeospatiallyWithin extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gracePeriod")
	@SchemaOrgLabel("gracePeriod")
	@SchemaOrgComment(""
			+ "The period of time after any due date that the borrower has to fulfil its"
			+ " obligations before a default (failure to pay) is deemed to have occurred.")
	@CamelizedName("gracePeriod")
	@ConstantizedName("GRACE_PERIOD")
	public interface GracePeriod extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.core.Clazz.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.core.Clazz.Duration duration);
		public List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> getDurationList();
		public void setDurationList(List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasBroadcastChannel")
	@SchemaOrgLabel("hasBroadcastChannel")
	@SchemaOrgComment(""
			+ "A broadcast channel of a broadcast service.")
	@CamelizedName("hasBroadcastChannel")
	@ConstantizedName("HAS_BROADCAST_CHANNEL")
	public interface HasBroadcastChannel extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BroadcastChannel">http://schema.org/BroadcastChannel</a>
		 */
		public BroadcastChannel getBroadcastChannel();
		public void setBroadcastChannel(BroadcastChannel broadcastChannel);
		public List<BroadcastChannel> getBroadcastChannelList();
		public void setBroadcastChannelList(List<BroadcastChannel> broadcastChannelList);
		public boolean hasBroadcastChannel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasCategoryCode")
	@SchemaOrgLabel("hasCategoryCode")
	@SchemaOrgComment(""
			+ "A Category code contained in this code set.")
	@CamelizedName("hasCategoryCode")
	@ConstantizedName("HAS_CATEGORY_CODE")
	public interface HasCategoryCode extends HasDefinedTerm, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CategoryCode">http://schema.org/CategoryCode</a>
		 */
		public Clazz.CategoryCode getCategoryCode();
		public void setCategoryCode(Clazz.CategoryCode categoryCode);
		public List<Clazz.CategoryCode> getCategoryCodeList();
		public void setCategoryCodeList(List<Clazz.CategoryCode> categoryCodeList);
		public boolean hasCategoryCode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasDefinedTerm")
	@SchemaOrgLabel("hasDefinedTerm")
	@SchemaOrgComment(""
			+ "A Defined Term contained in this term set.")
	@CamelizedName("hasDefinedTerm")
	@ConstantizedName("HAS_DEFINED_TERM")
	public interface HasDefinedTerm extends HasPart, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DefinedTerm">http://schema.org/DefinedTerm</a>
		 */
		public Clazz.DefinedTerm getDefinedTerm();
		public void setDefinedTerm(Clazz.DefinedTerm definedTerm);
		public List<Clazz.DefinedTerm> getDefinedTermList();
		public void setDefinedTermList(List<Clazz.DefinedTerm> definedTermList);
		public boolean hasDefinedTerm();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasOccupation")
	@SchemaOrgLabel("hasOccupation")
	@SchemaOrgComment(""
			+ "The Person's occupation. For past professions, use Role for expressing dates.")
	@CamelizedName("hasOccupation")
	@ConstantizedName("HAS_OCCUPATION")
	public interface HasOccupation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Occupation">http://schema.org/Occupation</a>
		 */
		public Clazz.Occupation getOccupation();
		public void setOccupation(Clazz.Occupation occupation);
		public List<Clazz.Occupation> getOccupationList();
		public void setOccupationList(List<Clazz.Occupation> occupationList);
		public boolean hasOccupation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/healthPlanCoinsuranceOption")
	@SchemaOrgLabel("healthPlanCoinsuranceOption")
	@SchemaOrgComment(""
			+ "Whether the coinsurance applies before or after deductible, etc. TODO: Is this a"
			+ " closed set?")
	@CamelizedName("healthPlanCoinsuranceOption")
	@ConstantizedName("HEALTH_PLAN_COINSURANCE_OPTION")
	public interface HealthPlanCoinsuranceOption extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanCoinsuranceRate")
	@SchemaOrgLabel("healthPlanCoinsuranceRate")
	@SchemaOrgComment(""
			+ "Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.")
	@CamelizedName("healthPlanCoinsuranceRate")
	@ConstantizedName("HEALTH_PLAN_COINSURANCE_RATE")
	public interface HealthPlanCoinsuranceRate extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanCopay")
	@SchemaOrgLabel("healthPlanCopay")
	@SchemaOrgComment("Whether The copay amount.")
	@CamelizedName("healthPlanCopay")
	@ConstantizedName("HEALTH_PLAN_COPAY")
	public interface HealthPlanCopay extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/PriceSpecification">http://schema.org/PriceSpecification</a>
		 */
		public PriceSpecification getPriceSpecification();
		public void setPriceSpecification(PriceSpecification priceSpecification);
		public List<PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/healthPlanCopayOption")
	@SchemaOrgLabel("healthPlanCopayOption")
	@SchemaOrgComment(""
			+ "Whether the copay is before or after deductible, etc. TODO: Is this a closed"
			+ " set?")
	@CamelizedName("healthPlanCopayOption")
	@ConstantizedName("HEALTH_PLAN_COPAY_OPTION")
	public interface HealthPlanCopayOption extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanCostSharing")
	@SchemaOrgLabel("healthPlanCostSharing")
	@SchemaOrgComment(""
			+ "Whether The costs to the patient for services under this network or formulary.")
	@CamelizedName("healthPlanCostSharing")
	@ConstantizedName("HEALTH_PLAN_COST_SHARING")
	public interface HealthPlanCostSharing extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/healthPlanDrugOption")
	@SchemaOrgLabel("healthPlanDrugOption")
	@SchemaOrgComment("TODO.")
	@CamelizedName("healthPlanDrugOption")
	@ConstantizedName("HEALTH_PLAN_DRUG_OPTION")
	public interface HealthPlanDrugOption extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanDrugTier")
	@SchemaOrgLabel("healthPlanDrugTier")
	@SchemaOrgComment(""
			+ "The tier(s) of drugs offered by this formulary or insurance plan.")
	@CamelizedName("healthPlanDrugTier")
	@ConstantizedName("HEALTH_PLAN_DRUG_TIER")
	public interface HealthPlanDrugTier extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanId")
	@SchemaOrgLabel("healthPlanId")
	@SchemaOrgComment(""
			+ "The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even"
			+ " across different markets.)")
	@CamelizedName("healthPlanId")
	@ConstantizedName("HEALTH_PLAN_ID")
	public interface HealthPlanId extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanMarketingUrl")
	@SchemaOrgLabel("healthPlanMarketingUrl")
	@SchemaOrgComment(""
			+ "The URL that goes directly to the plan brochure for the specific standard plan"
			+ " or plan variation.")
	@CamelizedName("healthPlanMarketingUrl")
	@ConstantizedName("HEALTH_PLAN_MARKETING_URL")
	public interface HealthPlanMarketingUrl extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanNetworkId")
	@SchemaOrgLabel("healthPlanNetworkId")
	@SchemaOrgComment(""
			+ "Name or unique ID of network. (Networks are often reused across different"
			+ " insurance plans).")
	@CamelizedName("healthPlanNetworkId")
	@ConstantizedName("HEALTH_PLAN_NETWORK_ID")
	public interface HealthPlanNetworkId extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanNetworkTier")
	@SchemaOrgLabel("healthPlanNetworkTier")
	@SchemaOrgComment("The tier(s) for this network.")
	@CamelizedName("healthPlanNetworkTier")
	@ConstantizedName("HEALTH_PLAN_NETWORK_TIER")
	public interface HealthPlanNetworkTier extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanPharmacyCategory")
	@SchemaOrgLabel("healthPlanPharmacyCategory")
	@SchemaOrgComment(""
			+ "The category or type of pharmacy associated with this cost sharing.")
	@CamelizedName("healthPlanPharmacyCategory")
	@ConstantizedName("HEALTH_PLAN_PHARMACY_CATEGORY")
	public interface HealthPlanPharmacyCategory extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/inCodeSet")
	@SchemaOrgLabel("inCodeSet")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/CategoryCodeSet\">CategoryCodeSet</a> that contains"
			+ " this catagory code.")
	@CamelizedName("inCodeSet")
	@ConstantizedName("IN_CODE_SET")
	public interface InCodeSet extends InDefinedTermSet, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CategoryCodeSet">http://schema.org/CategoryCodeSet</a>
		 */
		public Clazz.CategoryCodeSet getCategoryCodeSet();
		public void setCategoryCodeSet(Clazz.CategoryCodeSet categoryCodeSet);
		public List<Clazz.CategoryCodeSet> getCategoryCodeSetList();
		public void setCategoryCodeSetList(List<Clazz.CategoryCodeSet> categoryCodeSetList);
		public boolean hasCategoryCodeSet();

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
	@SchemaOrgURI("http://schema.org/inDefinedTermSet")
	@SchemaOrgLabel("inDefinedTermSet")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/DefinedTermSet\">DefinedTermSet</a> that contains this"
			+ " term.")
	@CamelizedName("inDefinedTermSet")
	@ConstantizedName("IN_DEFINED_TERM_SET")
	public interface InDefinedTermSet extends IsPartOf, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DefinedTermSet">http://schema.org/DefinedTermSet</a>
		 */
		public Clazz.DefinedTermSet getDefinedTermSet();
		public void setDefinedTermSet(Clazz.DefinedTermSet definedTermSet);
		public List<Clazz.DefinedTermSet> getDefinedTermSetList();
		public void setDefinedTermSetList(List<Clazz.DefinedTermSet> definedTermSetList);
		public boolean hasDefinedTermSet();

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
	@SchemaOrgURI("http://schema.org/includedInHealthInsurancePlan")
	@SchemaOrgLabel("includedInHealthInsurancePlan")
	@SchemaOrgComment(""
			+ "The insurance plans that cover this drug.")
	@CamelizedName("includedInHealthInsurancePlan")
	@ConstantizedName("INCLUDED_IN_HEALTH_INSURANCE_PLAN")
	public interface IncludedInHealthInsurancePlan extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/HealthInsurancePlan">http://schema.org/HealthInsurancePlan</a>
		 */
		public Clazz.HealthInsurancePlan getHealthInsurancePlan();
		public void setHealthInsurancePlan(Clazz.HealthInsurancePlan healthInsurancePlan);
		public List<Clazz.HealthInsurancePlan> getHealthInsurancePlanList();
		public void setHealthInsurancePlanList(List<Clazz.HealthInsurancePlan> healthInsurancePlanList);
		public boolean hasHealthInsurancePlan();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includesAttraction")
	@SchemaOrgLabel("includesAttraction")
	@SchemaOrgComment("Attraction located at destination.")
	@CamelizedName("includesAttraction")
	@ConstantizedName("INCLUDES_ATTRACTION")
	public interface IncludesAttraction extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/TouristAttraction">http://schema.org/TouristAttraction</a>
		 */
		public TouristAttraction getTouristAttraction();
		public void setTouristAttraction(TouristAttraction touristAttraction);
		public List<TouristAttraction> getTouristAttractionList();
		public void setTouristAttractionList(List<TouristAttraction> touristAttractionList);
		public boolean hasTouristAttraction();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includesHealthPlanFormulary")
	@SchemaOrgLabel("includesHealthPlanFormulary")
	@SchemaOrgComment("Formularies covered by this plan.")
	@CamelizedName("includesHealthPlanFormulary")
	@ConstantizedName("INCLUDES_HEALTH_PLAN_FORMULARY")
	public interface IncludesHealthPlanFormulary extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/HealthPlanFormulary">http://schema.org/HealthPlanFormulary</a>
		 */
		public Clazz.HealthPlanFormulary getHealthPlanFormulary();
		public void setHealthPlanFormulary(Clazz.HealthPlanFormulary healthPlanFormulary);
		public List<Clazz.HealthPlanFormulary> getHealthPlanFormularyList();
		public void setHealthPlanFormularyList(List<Clazz.HealthPlanFormulary> healthPlanFormularyList);
		public boolean hasHealthPlanFormulary();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includesHealthPlanNetwork")
	@SchemaOrgLabel("includesHealthPlanNetwork")
	@SchemaOrgComment("Networks covered by this plan.")
	@CamelizedName("includesHealthPlanNetwork")
	@ConstantizedName("INCLUDES_HEALTH_PLAN_NETWORK")
	public interface IncludesHealthPlanNetwork extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/HealthPlanNetwork">http://schema.org/HealthPlanNetwork</a>
		 */
		public Clazz.HealthPlanNetwork getHealthPlanNetwork();
		public void setHealthPlanNetwork(Clazz.HealthPlanNetwork healthPlanNetwork);
		public List<Clazz.HealthPlanNetwork> getHealthPlanNetworkList();
		public void setHealthPlanNetworkList(List<Clazz.HealthPlanNetwork> healthPlanNetworkList);
		public boolean hasHealthPlanNetwork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isAcceptingNewPatients")
	@SchemaOrgLabel("isAcceptingNewPatients")
	@SchemaOrgComment(""
			+ "Whether the provider is accepting new patients.")
	@CamelizedName("isAcceptingNewPatients")
	@ConstantizedName("IS_ACCEPTING_NEW_PATIENTS")
	public interface IsAcceptingNewPatients extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itinerary")
	@SchemaOrgLabel("itinerary")
	@SchemaOrgComment(""
			+ "Destination(s) ( <a class=\"localLink\""
			+ " href=\"http://schema.org/Place\">Place</a> ) that make up a trip. For a trip"
			+ " where destination order is important use <a class=\"localLink\""
			+ " href=\"http://schema.org/ItemList\">ItemList</a> to specify that order (see"
			+ " examples).")
	@CamelizedName("itinerary")
	@ConstantizedName("ITINERARY")
	public interface Itinerary extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ItemList">http://schema.org/ItemList</a>
		 */
		public ItemList getItemList();
		public void setItemList(ItemList itemList);
		public List<ItemList> getItemListList();
		public void setItemListList(List<ItemList> itemListList);
		public boolean hasItemList();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/knowsAbout")
	@SchemaOrgLabel("knowsAbout")
	@SchemaOrgComment(""
			+ "Of a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, and"
			+ " less typically of an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a>, to indicate a topic"
			+ " that is known about - suggesting possible expertise but not implying it. We do"
			+ " not distinguish skill levels here, or yet relate this to educational content,"
			+ " events, objectives or <a class=\"localLink\""
			+ " href=\"http://schema.org/JobPosting\">JobPosting</a> descriptions.")
	@CamelizedName("knowsAbout")
	@ConstantizedName("KNOWS_ABOUT")
	public interface KnowsAbout extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/Thing">http://schema.org/Thing</a>
		 */
		public Thing getThing();
		public void setThing(Thing thing);
		public List<Thing> getThingList();
		public void setThingList(List<Thing> thingList);
		public boolean hasThing();

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
	@SchemaOrgURI("http://schema.org/knowsLanguage")
	@SchemaOrgLabel("knowsLanguage")
	@SchemaOrgComment(""
			+ "Of a <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a>, and"
			+ " less typically of an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a>, to indicate a known"
			+ " language. We do not distinguish skill levels or"
			+ " reading/writing/speaking/signing here. Use language codes from the <a"
			+ " href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>.")
	@CamelizedName("knowsLanguage")
	@ConstantizedName("KNOWS_LANGUAGE")
	public interface KnowsLanguage extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Language">http://schema.org/Language</a>
		 */
		public Language getLanguage();
		public void setLanguage(Language language);
		public List<Language> getLanguageList();
		public void setLanguageList(List<Language> languageList);
		public boolean hasLanguage();

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
	@SchemaOrgURI("http://schema.org/legislationApplies")
	@SchemaOrgLabel("legislationApplies")
	@SchemaOrgComment(""
			+ "Indicates that this legislation (or part of a legislation) somehow transfers"
			+ " another legislation in a different legislative context. This is an informative"
			+ " link, and it has no legal value. For legally-binding links of transposition,"
			+ " use the <a href=\"/legislationTransposes\">legislationTransposes</a> property."
			+ " For example an informative consolidated law of a European Union's member state"
			+ " \"applies\" the consolidated version of the European Directive implemented in"
			+ " it.")
	@CamelizedName("legislationApplies")
	@ConstantizedName("LEGISLATION_APPLIES")
	public interface LegislationApplies extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Legislation">http://schema.org/Legislation</a>
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationChanges")
	@SchemaOrgLabel("legislationChanges")
	@SchemaOrgComment(""
			+ "Another legislation that this legislation changes. This encompasses the notions"
			+ " of amendment, replacement, correction, repeal, or other types of change. This"
			+ " may be a direct change (textual or non-textual amendment) or a consequential or"
			+ " indirect change. The property is to be used to express the existence of a"
			+ " change relationship between two acts rather than the existence of a"
			+ " consolidated version of the text that shows the result of the change. For"
			+ " consolidation relationships, use the <a"
			+ " href=\"/legislationConsolidates\">legislationConsolidates</a> property.")
	@CamelizedName("legislationChanges")
	@ConstantizedName("LEGISLATION_CHANGES")
	public interface LegislationChanges extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Legislation">http://schema.org/Legislation</a>
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationConsolidates")
	@SchemaOrgLabel("legislationConsolidates")
	@SchemaOrgComment(""
			+ "Indicates another legislation taken into account in this consolidated"
			+ " legislation (which is usually the product of an editorial process that revises"
			+ " the legislation). This property should be used multiple times to refer to both"
			+ " the original version or the previous consolidated version, and to the"
			+ " legislations making the change.")
	@CamelizedName("legislationConsolidates")
	@ConstantizedName("LEGISLATION_CONSOLIDATES")
	public interface LegislationConsolidates extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Legislation">http://schema.org/Legislation</a>
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationDate")
	@SchemaOrgLabel("legislationDate")
	@SchemaOrgComment(""
			+ "The date of adoption or signature of the legislation. This is the date at which"
			+ " the text is officially aknowledged to be a legislation, even though it might"
			+ " not even be published or in force.")
	@CamelizedName("legislationDate")
	@ConstantizedName("LEGISLATION_DATE")
	public interface LegislationDate extends DateCreated, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/legislationDateVersion")
	@SchemaOrgLabel("legislationDateVersion")
	@SchemaOrgComment(""
			+ "The point-in-time at which the provided description of the legislation is valid"
			+ " (e.g. : when looking at the law on the 2016-04-07 (= dateVersion), I get the"
			+ " consolidation of 2015-04-12 of the \"National Insurance Contributions Act"
			+ " 2015\")")
	@CamelizedName("legislationDateVersion")
	@ConstantizedName("LEGISLATION_DATE_VERSION")
	public interface LegislationDateVersion extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/legislationIdentifier")
	@SchemaOrgLabel("legislationIdentifier")
	@SchemaOrgComment(""
			+ "An identifier for the legislation. This can be either a string-based identifier,"
			+ " like the CELEX at EU level or the NOR in France, or a web-based, URL/URI"
			+ " identifier, like an ELI (European Legislation Identifier) or an URN-Lex.")
	@CamelizedName("legislationIdentifier")
	@ConstantizedName("LEGISLATION_IDENTIFIER")
	public interface LegislationIdentifier extends Identifier, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/legislationJurisdiction")
	@SchemaOrgLabel("legislationJurisdiction")
	@SchemaOrgComment(""
			+ "The jurisdiction from which the legislation originates.")
	@CamelizedName("legislationJurisdiction")
	@ConstantizedName("LEGISLATION_JURISDICTION")
	public interface LegislationJurisdiction extends SchemaOrgProperty, SpatialCoverage {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

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
	@SchemaOrgURI("http://schema.org/legislationLegalForce")
	@SchemaOrgLabel("legislationLegalForce")
	@SchemaOrgComment(""
			+ "Whether the legislation is currently in force, not in force, or partially in"
			+ " force.")
	@CamelizedName("legislationLegalForce")
	@ConstantizedName("LEGISLATION_LEGAL_FORCE")
	public interface LegislationLegalForce extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/LegalForceStatus">http://schema.org/LegalForceStatus</a>
		 */
		public Clazz.LegalForceStatus getLegalForceStatus();
		public void setLegalForceStatus(Clazz.LegalForceStatus legalForceStatus);
		public List<Clazz.LegalForceStatus> getLegalForceStatusList();
		public void setLegalForceStatusList(List<Clazz.LegalForceStatus> legalForceStatusList);
		public boolean hasLegalForceStatus();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationLegalValue")
	@SchemaOrgLabel("legislationLegalValue")
	@SchemaOrgComment(""
			+ "The legal value of this legislation file. The same legislation can be written in"
			+ " multiple files with different legal values. Typically a digitally signed PDF"
			+ " have a \"stronger\" legal value than the HTML file of the same act.")
	@CamelizedName("legislationLegalValue")
	@ConstantizedName("LEGISLATION_LEGAL_VALUE")
	public interface LegislationLegalValue extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/LegalValueLevel">http://schema.org/LegalValueLevel</a>
		 */
		public Clazz.LegalValueLevel getLegalValueLevel();
		public void setLegalValueLevel(Clazz.LegalValueLevel legalValueLevel);
		public List<Clazz.LegalValueLevel> getLegalValueLevelList();
		public void setLegalValueLevelList(List<Clazz.LegalValueLevel> legalValueLevelList);
		public boolean hasLegalValueLevel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationPassedBy")
	@SchemaOrgLabel("legislationPassedBy")
	@SchemaOrgComment(""
			+ "The person or organization that originally passed or made the law : typically"
			+ " parliament (for primary legislation) or government (for secondary legislation)."
			+ " This indicates the \"legal author\" of the law, as opposed to its physical"
			+ " author.")
	@CamelizedName("legislationPassedBy")
	@ConstantizedName("LEGISLATION_PASSED_BY")
	public interface LegislationPassedBy extends Creator, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationResponsible")
	@SchemaOrgLabel("legislationResponsible")
	@SchemaOrgComment(""
			+ "An individual or organization that has some kind of responsibility for the"
			+ " legislation. Typically the ministry who is/was in charge of elaborating the"
			+ " legislation, or the adressee for potential questions about the legislation once"
			+ " it is published.")
	@CamelizedName("legislationResponsible")
	@ConstantizedName("LEGISLATION_RESPONSIBLE")
	public interface LegislationResponsible extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationTransposes")
	@SchemaOrgLabel("legislationTransposes")
	@SchemaOrgComment(""
			+ "Indicates that this legislation (or part of legislation) fulfills the objectives"
			+ " set by another legislation, by passing appropriate implementation measures."
			+ " Typically, some legislations of European Union's member states or regions"
			+ " transpose European Directives. This indicates a legally binding link between"
			+ " the 2 legislations.")
	@CamelizedName("legislationTransposes")
	@ConstantizedName("LEGISLATION_TRANSPOSES")
	public interface LegislationTransposes extends LegislationApplies, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Legislation">http://schema.org/Legislation</a>
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationType")
	@SchemaOrgLabel("legislationType")
	@SchemaOrgComment(""
			+ "The type of the legislation. Examples of values are \"law\", \"act\","
			+ " \"directive\", \"decree\", \"regulation\", \"statutory instrument\", \"loi"
			+ " organique\", \"règlement grand-ducal\", etc., depending on the country.")
	@CamelizedName("legislationType")
	@ConstantizedName("LEGISLATION_TYPE")
	public interface LegislationType extends Genre, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CategoryCode">http://schema.org/CategoryCode</a>
		 */
		public Clazz.CategoryCode getCategoryCode();
		public void setCategoryCode(Clazz.CategoryCode categoryCode);
		public List<Clazz.CategoryCode> getCategoryCodeList();
		public void setCategoryCodeList(List<Clazz.CategoryCode> categoryCodeList);
		public boolean hasCategoryCode();

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
	@SchemaOrgURI("http://schema.org/linkRelationship")
	@SchemaOrgLabel("linkRelationship")
	@SchemaOrgComment(""
			+ "Indicates the relationship type of a Web link.")
	@CamelizedName("linkRelationship")
	@ConstantizedName("LINK_RELATIONSHIP")
	public interface LinkRelationship extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/loanMortgageMandateAmount")
	@SchemaOrgLabel("loanMortgageMandateAmount")
	@SchemaOrgComment(""
			+ "Amount of mortgage mandate that can be converted into a proper mortgage at a"
			+ " later stage.")
	@CamelizedName("loanMortgageMandateAmount")
	@ConstantizedName("LOAN_MORTGAGE_MANDATE_AMOUNT")
	public interface LoanMortgageMandateAmount extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/loanPaymentAmount")
	@SchemaOrgLabel("loanPaymentAmount")
	@SchemaOrgComment(""
			+ "The amount of money to pay in a single payment.")
	@CamelizedName("loanPaymentAmount")
	@ConstantizedName("LOAN_PAYMENT_AMOUNT")
	public interface LoanPaymentAmount extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/loanPaymentFrequency")
	@SchemaOrgLabel("loanPaymentFrequency")
	@SchemaOrgComment(""
			+ "Frequency of payments due, i.e. number of months between payments. This is"
			+ " defined as a frequency, i.e. the reciprocal of a period of time.")
	@CamelizedName("loanPaymentFrequency")
	@ConstantizedName("LOAN_PAYMENT_FREQUENCY")
	public interface LoanPaymentFrequency extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/loanRepaymentForm")
	@SchemaOrgLabel("loanRepaymentForm")
	@SchemaOrgComment(""
			+ "A form of paying back money previously borrowed from a lender. Repayment usually"
			+ " takes the form of periodic payments that normally include part principal plus"
			+ " interest in each payment.")
	@CamelizedName("loanRepaymentForm")
	@ConstantizedName("LOAN_REPAYMENT_FORM")
	public interface LoanRepaymentForm extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/RepaymentSpecification">http://schema.org/RepaymentSpecification</a>
		 */
		public Clazz.RepaymentSpecification getRepaymentSpecification();
		public void setRepaymentSpecification(Clazz.RepaymentSpecification repaymentSpecification);
		public List<Clazz.RepaymentSpecification> getRepaymentSpecificationList();
		public void setRepaymentSpecificationList(List<Clazz.RepaymentSpecification> repaymentSpecificationList);
		public boolean hasRepaymentSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/loanType")
	@SchemaOrgLabel("loanType")
	@SchemaOrgComment("The type of a loan or credit.")
	@CamelizedName("loanType")
	@ConstantizedName("LOAN_TYPE")
	public interface LoanType extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/masthead")
	@SchemaOrgLabel("masthead")
	@SchemaOrgComment(""
			+ "For a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>, a"
			+ " link to the masthead page or a page listing top editorial management.")
	@CamelizedName("masthead")
	@ConstantizedName("MASTHEAD")
	public interface Masthead extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/measurementTechnique")
	@SchemaOrgLabel("measurementTechnique")
	@SchemaOrgComment(""
			+ "A technique or technology used in a <a class=\"localLink\""
			+ " href=\"http://schema.org/Dataset\">Dataset</a> (or <a class=\"localLink\""
			+ " href=\"http://schema.org/DataDownload\">DataDownload</a>, <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/DataCatalog\">DataCatalog</a>),\ncorresponding to the"
			+ " method used for measuring the corresponding variable(s) (described using <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a>). This is"
			+ " oriented towards scientific and scholarly dataset publication but may have"
			+ " broader applicability; it is not intended as a full representation of"
			+ " measurement, but rather as a high level summary for dataset"
			+ " discovery.<br/><br/>\n\nFor example, if <a class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> is: molecule"
			+ " concentration, <a class=\"localLink\""
			+ " href=\"http://schema.org/measurementTechnique\">measurementTechnique</a> could"
			+ " be: \"mass spectrometry\" or \"nmr spectroscopy\" or \"colorimetry\" or"
			+ " \"immunofluorescence\".<br/><br/>\n\nIf the <a class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> is"
			+ " \"depression rating\", the <a class=\"localLink\""
			+ " href=\"http://schema.org/measurementTechnique\">measurementTechnique</a> could"
			+ " be \"Zung Scale\" or \"HAM-D\" or \"Beck Depression"
			+ " Inventory\".<br/><br/>\n\nIf there are several <a class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> properties"
			+ " recorded for some given data object, use a <a class=\"localLink\""
			+ " href=\"http://schema.org/PropertyValue\">PropertyValue</a> for each <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> and attach the"
			+ " corresponding <a class=\"localLink\""
			+ " href=\"http://schema.org/measurementTechnique\">measurementTechnique</a>.")
	@CamelizedName("measurementTechnique")
	@ConstantizedName("MEASUREMENT_TECHNIQUE")
	public interface MeasurementTechnique extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/median")
	@SchemaOrgLabel("median")
	@SchemaOrgComment("The median value.")
	@CamelizedName("median")
	@ConstantizedName("MEDIAN")
	public interface Median extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/menuAddOn")
	@SchemaOrgLabel("menuAddOn")
	@SchemaOrgComment(""
			+ "Additional menu item(s) such as a side dish of salad or side order of fries that"
			+ " can be added to this menu item. Additionally it can be a menu section"
			+ " containing allowed add-on menu items for this menu item.")
	@CamelizedName("menuAddOn")
	@ConstantizedName("MENU_ADD_ON")
	public interface MenuAddOn extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MenuItem">http://schema.org/MenuItem</a>
		 */
		public MenuItem getMenuItem();
		public void setMenuItem(MenuItem menuItem);
		public List<MenuItem> getMenuItemList();
		public void setMenuItemList(List<MenuItem> menuItemList);
		public boolean hasMenuItem();

		/**
		 * @see <a href="http://schema.org/MenuSection">http://schema.org/MenuSection</a>
		 */
		public MenuSection getMenuSection();
		public void setMenuSection(MenuSection menuSection);
		public List<MenuSection> getMenuSectionList();
		public void setMenuSectionList(List<MenuSection> menuSectionList);
		public boolean hasMenuSection();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/missionCoveragePrioritiesPolicy")
	@SchemaOrgLabel("missionCoveragePrioritiesPolicy")
	@SchemaOrgComment(""
			+ "For a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>, a"
			+ " statement on coverage priorities, including any public agenda or stance on"
			+ " issues.")
	@CamelizedName("missionCoveragePrioritiesPolicy")
	@ConstantizedName("MISSION_COVERAGE_PRIORITIES_POLICY")
	public interface MissionCoveragePrioritiesPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/monthlyMinimumRepaymentAmount")
	@SchemaOrgLabel("monthlyMinimumRepaymentAmount")
	@SchemaOrgComment(""
			+ "The minimum payment is the lowest amount of money that one is required to pay on"
			+ " a credit card statement each month.")
	@CamelizedName("monthlyMinimumRepaymentAmount")
	@ConstantizedName("MONTHLY_MINIMUM_REPAYMENT_AMOUNT")
	public interface MonthlyMinimumRepaymentAmount extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MonetaryAmount">http://schema.org/MonetaryAmount</a>
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
	@SchemaOrgURI("http://schema.org/noBylinesPolicy")
	@SchemaOrgLabel("noBylinesPolicy")
	@SchemaOrgComment(""
			+ "For a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a> or"
			+ " other news-related <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a>, a statement"
			+ " explaining when authors of articles are not named in bylines.")
	@CamelizedName("noBylinesPolicy")
	@ConstantizedName("NO_BYLINES_POLICY")
	public interface NoBylinesPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/numberOfLoanPayments")
	@SchemaOrgLabel("numberOfLoanPayments")
	@SchemaOrgComment(""
			+ "The number of payments contractually required at origination to repay the loan."
			+ " For monthly paying loans this is the number of months from the contractual"
			+ " first payment date to the maturity date.")
	@CamelizedName("numberOfLoanPayments")
	@ConstantizedName("NUMBER_OF_LOAN_PAYMENTS")
	public interface NumberOfLoanPayments extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/occupationLocation")
	@SchemaOrgLabel("occupationLocation")
	@SchemaOrgComment(""
			+ "The region/country for which this occupational description is appropriate. Note"
			+ " that educational requirements and qualifications can vary between"
			+ " jurisdictions.")
	@CamelizedName("occupationLocation")
	@ConstantizedName("OCCUPATION_LOCATION")
	public interface OccupationLocation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/occupationalCategory")
	@SchemaOrgLabel("occupationalCategory")
	@SchemaOrgComment(""
			+ "Category or categories describing the job. Use BLS O*NET-SOC taxonomy:"
			+ " http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and"
			+ " formal code, with the property repeated for each applicable value.")
	@CamelizedName("occupationalCategory")
	@ConstantizedName("OCCUPATIONAL_CATEGORY")
	public interface OccupationalCategory extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/offersPrescriptionByMail")
	@SchemaOrgLabel("offersPrescriptionByMail")
	@SchemaOrgComment(""
			+ "Whether prescriptions can be delivered by mail.")
	@CamelizedName("offersPrescriptionByMail")
	@ConstantizedName("OFFERS_PRESCRIPTION_BY_MAIL")
	public interface OffersPrescriptionByMail extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ownershipFundingInfo")
	@SchemaOrgLabel("ownershipFundingInfo")
	@SchemaOrgComment(""
			+ "For an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> (often but not"
			+ " necessarily a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>), a"
			+ " description of organizational ownership structure; funding and grants. In a"
			+ " news/media setting, this is with particular reference to editorial"
			+ " independence.   Note that the <a class=\"localLink\""
			+ " href=\"http://schema.org/funder\">funder</a> is also available and can be used"
			+ " to make basic funder information machine-readable.")
	@CamelizedName("ownershipFundingInfo")
	@ConstantizedName("OWNERSHIP_FUNDING_INFO")
	public interface OwnershipFundingInfo extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AboutPage">http://schema.org/AboutPage</a>
		 */
		public AboutPage getAboutPage();
		public void setAboutPage(AboutPage aboutPage);
		public List<AboutPage> getAboutPageList();
		public void setAboutPageList(List<AboutPage> aboutPageList);
		public boolean hasAboutPage();

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/percentile10")
	@SchemaOrgLabel("percentile10")
	@SchemaOrgComment("The 10th percentile value.")
	@CamelizedName("percentile10")
	@ConstantizedName("PERCENTILE10")
	public interface Percentile10 extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/percentile25")
	@SchemaOrgLabel("percentile25")
	@SchemaOrgComment("The 25th percentile value.")
	@CamelizedName("percentile25")
	@ConstantizedName("PERCENTILE25")
	public interface Percentile25 extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/percentile75")
	@SchemaOrgLabel("percentile75")
	@SchemaOrgComment("The 75th percentile value.")
	@CamelizedName("percentile75")
	@ConstantizedName("PERCENTILE75")
	public interface Percentile75 extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/percentile90")
	@SchemaOrgLabel("percentile90")
	@SchemaOrgComment("The 90th percentile value.")
	@CamelizedName("percentile90")
	@ConstantizedName("PERCENTILE90")
	public interface Percentile90 extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/qualifications")
	@SchemaOrgLabel("qualifications")
	@SchemaOrgComment(""
			+ "Specific qualifications required for this role.")
	@CamelizedName("qualifications")
	@ConstantizedName("QUALIFICATIONS")
	public interface Qualifications extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/recourseLoan")
	@SchemaOrgLabel("recourseLoan")
	@SchemaOrgComment(""
			+ "The only way you get the money back in the event of default is the security."
			+ " Recourse is where you still have the opportunity to go back to the borrower for"
			+ " the rest of the money.")
	@CamelizedName("recourseLoan")
	@ConstantizedName("RECOURSE_LOAN")
	public interface RecourseLoan extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relevantOccupation")
	@SchemaOrgLabel("relevantOccupation")
	@SchemaOrgComment("The Occupation for the JobPosting.")
	@CamelizedName("relevantOccupation")
	@ConstantizedName("RELEVANT_OCCUPATION")
	public interface RelevantOccupation extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Occupation">http://schema.org/Occupation</a>
		 */
		public Clazz.Occupation getOccupation();
		public void setOccupation(Clazz.Occupation occupation);
		public List<Clazz.Occupation> getOccupationList();
		public void setOccupationList(List<Clazz.Occupation> occupationList);
		public boolean hasOccupation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/renegotiableLoan")
	@SchemaOrgLabel("renegotiableLoan")
	@SchemaOrgComment(""
			+ "Whether the terms for payment of interest can be renegotiated during the life of"
			+ " the loan.")
	@CamelizedName("renegotiableLoan")
	@ConstantizedName("RENEGOTIABLE_LOAN")
	public interface RenegotiableLoan extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/repeatCount")
	@SchemaOrgLabel("repeatCount")
	@SchemaOrgComment(""
			+ "Defines the number of times a recurring <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> will take place")
	@CamelizedName("repeatCount")
	@ConstantizedName("REPEAT_COUNT")
	public interface RepeatCount extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Integer">http://schema.org/Integer</a>
		 */
		public Integer getInteger();
		public void setInteger(Integer integer);
		public List<Integer> getIntegerList();
		public void setIntegerList(List<Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/repeatFrequency")
	@SchemaOrgLabel("repeatFrequency")
	@SchemaOrgComment(""
			+ "Defines the frequency at which <a class=\"localLink\""
			+ " href=\"http://schema.org/Events\">Events</a> will occur according to a schedule"
			+ " <a class=\"localLink\" href=\"http://schema.org/Schedule\">Schedule</a>. The"
			+ " intervals between\n      events should be defined as a <a class=\"localLink\""
			+ " href=\"http://schema.org/Duration\">Duration</a> of time.")
	@CamelizedName("repeatFrequency")
	@ConstantizedName("REPEAT_FREQUENCY")
	public interface RepeatFrequency extends Frequency, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.core.Clazz.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.core.Clazz.Duration duration);
		public List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> getDurationList();
		public void setDurationList(List<org.kyojo.schemaorg.m3n4.core.Clazz.Duration> durationList);
		public boolean hasDuration();

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
	@SchemaOrgURI("http://schema.org/requiresSubscription")
	@SchemaOrgLabel("requiresSubscription")
	@SchemaOrgComment(""
			+ "Indicates if use of the media require a subscription  (either paid or free)."
			+ " Allowed values are <code>true</code> or <code>false</code> (note that an"
			+ " earlier version had 'yes', 'no').")
	@CamelizedName("requiresSubscription")
	@ConstantizedName("REQUIRES_SUBSCRIPTION")
	public interface RequiresSubscription extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Boolean">http://schema.org/Boolean</a>
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		/**
		 * @see <a href="http://schema.org/MediaSubscription">http://schema.org/MediaSubscription</a>
		 */
		public Clazz.MediaSubscription getMediaSubscription();
		public void setMediaSubscription(Clazz.MediaSubscription mediaSubscription);
		public List<Clazz.MediaSubscription> getMediaSubscriptionList();
		public void setMediaSubscriptionList(List<Clazz.MediaSubscription> mediaSubscriptionList);
		public boolean hasMediaSubscription();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/responsibilities")
	@SchemaOrgLabel("responsibilities")
	@SchemaOrgComment(""
			+ "Responsibilities associated with this role.")
	@CamelizedName("responsibilities")
	@ConstantizedName("RESPONSIBILITIES")
	public interface Responsibilities extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/reviewAspect")
	@SchemaOrgLabel("reviewAspect")
	@SchemaOrgComment(""
			+ "This Review or Rating is relevant to this part or facet of the itemReviewed.")
	@CamelizedName("reviewAspect")
	@ConstantizedName("REVIEW_ASPECT")
	public interface ReviewAspect extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/rxcui")
	@SchemaOrgLabel("rxcui")
	@SchemaOrgComment("The RxCUI drug identifier from RXNORM.")
	@CamelizedName("rxcui")
	@ConstantizedName("RXCUI")
	public interface Rxcui extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/sdDatePublished")
	@SchemaOrgLabel("sdDatePublished")
	@SchemaOrgComment(""
			+ "Indicates the date on which the current structured data was generated /"
			+ " published. Typically used alongside <a class=\"localLink\""
			+ " href=\"http://schema.org/sdPublisher\">sdPublisher</a>")
	@CamelizedName("sdDatePublished")
	@ConstantizedName("SD_DATE_PUBLISHED")
	public interface SdDatePublished extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/sdLicense")
	@SchemaOrgLabel("sdLicense")
	@SchemaOrgComment(""
			+ "A license document that applies to this structured data, typically indicated by"
			+ " URL.")
	@CamelizedName("sdLicense")
	@ConstantizedName("SD_LICENSE")
	public interface SdLicense extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/sdPublisher")
	@SchemaOrgLabel("sdPublisher")
	@SchemaOrgComment(""
			+ "Indicates the party responsible for generating and publishing the current"
			+ " structured data markup, typically in cases where the structured data is derived"
			+ " automatically from existing published content but published on a different"
			+ " site. For example, student projects and open data initiatives often re-publish"
			+ " existing content with more explicitly structured metadata. The\n<a"
			+ " class=\"localLink\" href=\"http://schema.org/sdPublisher\">sdPublisher</a>"
			+ " property helps make such practices more explicit.")
	@CamelizedName("sdPublisher")
	@ConstantizedName("SD_PUBLISHER")
	public interface SdPublisher extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/skills")
	@SchemaOrgLabel("skills")
	@SchemaOrgComment("Skills required to fulfill this role.")
	@CamelizedName("skills")
	@ConstantizedName("SKILLS")
	public interface Skills extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/speakable")
	@SchemaOrgLabel("speakable")
	@SchemaOrgComment(""
			+ "Indicates sections of a Web page that are particularly 'speakable' in the sense"
			+ " of being highlighted as being especially appropriate for text-to-speech"
			+ " conversion. Other sections of a page may also be usefully spoken in particular"
			+ " circumstances; the 'speakable' property serves to indicate the parts most"
			+ " likely to be generally useful for speech.<br/><br/>\n\nThe <em>speakable</em>"
			+ " property can be repeated an arbitrary number of times, with three kinds of"
			+ " possible 'content-locator' values:<br/><br/>\n\n1.) <em>id-value</em> URL"
			+ " references - uses <em>id-value</em> of an element in the page being annotated."
			+ " The simplest use of <em>speakable</em> has (potentially relative) URL values,"
			+ " referencing identified sections of the document concerned.<br/><br/>\n\n2.) CSS"
			+ " Selectors - addresses content in the annotated page, eg. via class attribute."
			+ " Use the <a class=\"localLink\""
			+ " href=\"http://schema.org/cssSelector\">cssSelector</a>"
			+ " property.<br/><br/>\n\n3.)  XPaths - addresses content via XPaths (assuming an"
			+ " XML view of the content). Use the <a class=\"localLink\""
			+ " href=\"http://schema.org/xpath\">xpath</a> property.<br/><br/>\n\nFor more"
			+ " sophisticated markup of speakable sections beyond simple ID references, either"
			+ " CSS selectors or XPath expressions to pick out document section(s) as"
			+ " speakable. For this\nwe define a supporting type, <a class=\"localLink\""
			+ " href=\"http://schema.org/SpeakableSpecification\">SpeakableSpecification</a> "
			+ " which is defined to be a possible value of the <em>speakable</em> property.")
	@CamelizedName("speakable")
	@ConstantizedName("SPEAKABLE")
	public interface Speakable extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/SpeakableSpecification">http://schema.org/SpeakableSpecification</a>
		 */
		public Clazz.SpeakableSpecification getSpeakableSpecification();
		public void setSpeakableSpecification(Clazz.SpeakableSpecification speakableSpecification);
		public List<Clazz.SpeakableSpecification> getSpeakableSpecificationList();
		public void setSpeakableSpecificationList(List<Clazz.SpeakableSpecification> speakableSpecificationList);
		public boolean hasSpeakableSpecification();

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
	@SchemaOrgURI("http://schema.org/spokenByCharacter")
	@SchemaOrgLabel("spokenByCharacter")
	@SchemaOrgComment(""
			+ "The (e.g. fictional) character, Person or Organization to whom the quotation is"
			+ " attributed within the containing CreativeWork.")
	@CamelizedName("spokenByCharacter")
	@ConstantizedName("SPOKEN_BY_CHARACTER")
	public interface SpokenByCharacter extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subjectOf")
	@SchemaOrgLabel("subjectOf")
	@SchemaOrgComment(""
			+ "A CreativeWork or Event about this Thing..")
	@CamelizedName("subjectOf")
	@ConstantizedName("SUBJECT_OF")
	public interface SubjectOf extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * @see <a href="http://schema.org/Event">http://schema.org/Event</a>
		 */
		public Event getEvent();
		public void setEvent(Event event);
		public List<Event> getEventList();
		public void setEventList(List<Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/termCode")
	@SchemaOrgLabel("termCode")
	@SchemaOrgComment(""
			+ "A code that identifies this <a class=\"localLink\""
			+ " href=\"http://schema.org/DefinedTerm\">DefinedTerm</a> within a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/DefinedTermSet\">DefinedTermSet</a>")
	@CamelizedName("termCode")
	@ConstantizedName("TERM_CODE")
	public interface TermCode extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/termsOfService")
	@SchemaOrgLabel("termsOfService")
	@SchemaOrgComment(""
			+ "Human-readable terms of service documentation.")
	@CamelizedName("termsOfService")
	@ConstantizedName("TERMS_OF_SERVICE")
	public interface TermsOfService extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/unnamedSourcesPolicy")
	@SchemaOrgLabel("unnamedSourcesPolicy")
	@SchemaOrgComment(""
			+ "For an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> (typically a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>), a"
			+ " statement about policy on use of unnamed sources and the decision process"
			+ " required.")
	@CamelizedName("unnamedSourcesPolicy")
	@ConstantizedName("UNNAMED_SOURCES_POLICY")
	public interface UnnamedSourcesPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/usesHealthPlanIdStandard")
	@SchemaOrgLabel("usesHealthPlanIdStandard")
	@SchemaOrgComment(""
			+ "The standard for interpreting thePlan ID. The preferred is \"HIOS\". See the"
			+ " Centers for Medicare &amp; Medicaid Services for more details.")
	@CamelizedName("usesHealthPlanIdStandard")
	@ConstantizedName("USES_HEALTH_PLAN_ID_STANDARD")
	public interface UsesHealthPlanIdStandard extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/variableMeasured")
	@SchemaOrgLabel("variableMeasured")
	@SchemaOrgComment(""
			+ "The variableMeasured property can indicate (repeated as necessary) the "
			+ " variables that are measured in some dataset, either described as text or as"
			+ " pairs of identifier and description using PropertyValue.")
	@CamelizedName("variableMeasured")
	@ConstantizedName("VARIABLE_MEASURED")
	public interface VariableMeasured extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/PropertyValue">http://schema.org/PropertyValue</a>
		 */
		public PropertyValue getPropertyValue();
		public void setPropertyValue(PropertyValue propertyValue);
		public List<PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

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
	@SchemaOrgURI("http://schema.org/verificationFactCheckingPolicy")
	@SchemaOrgLabel("verificationFactCheckingPolicy")
	@SchemaOrgComment(""
			+ "Disclosure about verification and fact-checking processes for a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a> or"
			+ " other fact-checking <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a>.")
	@CamelizedName("verificationFactCheckingPolicy")
	@ConstantizedName("VERIFICATION_FACT_CHECKING_POLICY")
	public interface VerificationFactCheckingPolicy extends PublishingPrinciples, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/xpath")
	@SchemaOrgLabel("xpath")
	@SchemaOrgComment(""
			+ "An XPath, e.g. of a <a class=\"localLink\""
			+ " href=\"http://schema.org/SpeakableSpecification\">SpeakableSpecification</a> or"
			+ " <a class=\"localLink\""
			+ " href=\"http://schema.org/WebPageElement\">WebPageElement</a>. In the latter"
			+ " case, multiple matches within a page can constitute a single conceptual \"Web"
			+ " page element\".")
	@CamelizedName("xpath")
	@ConstantizedName("XPATH")
	public interface Xpath extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/XPathType">http://schema.org/XPathType</a>
		 */
		public Clazz.XPathType getXPathType();
		public void setXPathType(Clazz.XPathType xPathType);
		public List<Clazz.XPathType> getXPathTypeList();
		public void setXPathTypeList(List<Clazz.XPathType> xPathTypeList);
		public boolean hasXPathType();

		public String getNativeValue();

	}

}
