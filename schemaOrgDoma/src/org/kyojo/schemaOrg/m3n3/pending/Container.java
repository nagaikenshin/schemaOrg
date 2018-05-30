package org.kyojo.schemaOrg.m3n3.pending;

import java.util.List;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgProperty;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastChannel;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DayOfWeek;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Duration;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Integer;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MenuItem;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MenuSection;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Organization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Person;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Place;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.URL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Creator;
import org.kyojo.schemaOrg.m3n3.core.Container.DateCreated;
import org.kyojo.schemaOrg.m3n3.core.Container.Genre;
import org.kyojo.schemaOrg.m3n3.core.Container.HasPart;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.IsPartOf;
import org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples;
import org.kyojo.schemaOrg.m3n3.core.DataType.Boolean;
import org.kyojo.schemaOrg.m3n3.core.DataType.Date;
import org.kyojo.schemaOrg.m3n3.core.DataType.DateTime;
import org.kyojo.schemaOrg.m3n3.core.DataType.Number;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Frequency;
import org.kyojo.schemaOrg.m3n3.pending.Clazz;

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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
		 * uri: http://schema.org/BankOrCreditUnion
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BankOrCreditUnion
		 */
		public BankOrCreditUnion getBankOrCreditUnion();
		public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion);
		public List<BankOrCreditUnion> getBankOrCreditUnionList();
		public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList);
		public boolean hasBankOrCreditUnion();

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
	@SchemaOrgURI("http://schema.org/benefitsSummaryUrl")
	@SchemaOrgLabel("benefitsSummaryUrl")
	@SchemaOrgComment(""
			+ "The URL that goes directly to the summary of benefits and coverage for the"
			+ " specific standard plan or plan variation.")
	@CamelizedName("benefitsSummaryUrl")
	@ConstantizedName("BENEFITS_SUMMARY_URL")
	public interface BenefitsSummaryUrl extends SchemaOrgProperty {

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/BroadcastFrequencySpecification
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.BroadcastFrequencySpecification
		 */
		public Clazz.BroadcastFrequencySpecification getBroadcastFrequencySpecification();
		public void setBroadcastFrequencySpecification(Clazz.BroadcastFrequencySpecification broadcastFrequencySpecification);
		public List<Clazz.BroadcastFrequencySpecification> getBroadcastFrequencySpecificationList();
		public void setBroadcastFrequencySpecificationList(List<Clazz.BroadcastFrequencySpecification> broadcastFrequencySpecificationList);
		public boolean hasBroadcastFrequencySpecification();

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
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
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
		 * uri: http://schema.org/DayOfWeek
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DayOfWeek
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
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
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
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

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
	@SchemaOrgURI("http://schema.org/codeValue")
	@SchemaOrgLabel("codeValue")
	@SchemaOrgComment(""
			+ "A short textual code that uniquely identifies the value.")
	@CamelizedName("codeValue")
	@ConstantizedName("CODE_VALUE")
	public interface CodeValue extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/contactlessPayment")
	@SchemaOrgLabel("contactlessPayment")
	@SchemaOrgComment(""
			+ "A secure method for consumers to purchase products or services via debit, credit"
			+ " or smartcards by using RFID or NFC technology.")
	@CamelizedName("contactlessPayment")
	@ConstantizedName("CONTACTLESS_PAYMENT")
	public interface ContactlessPayment extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
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
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

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
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/cssSelector")
	@SchemaOrgLabel("cssSelector")
	@SchemaOrgComment("A CSS selector.")
	@CamelizedName("cssSelector")
	@ConstantizedName("CSS_SELECTOR")
	public interface CssSelector extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CssSelectorType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.CssSelectorType
		 */
		public Clazz.CssSelectorType getCssSelectorType();
		public void setCssSelectorType(Clazz.CssSelectorType cssSelectorType);
		public List<Clazz.CssSelectorType> getCssSelectorTypeList();
		public void setCssSelectorTypeList(List<Clazz.CssSelectorType> cssSelectorTypeList);
		public boolean hasCssSelectorType();

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
		 * uri: http://schema.org/UnitPriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.UnitPriceSpecification
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
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/documentation")
	@SchemaOrgLabel("documentation")
	@SchemaOrgComment(""
			+ "Further documentation describing the Web API in more detail.")
	@CamelizedName("documentation")
	@ConstantizedName("DOCUMENTATION")
	public interface Documentation extends SchemaOrgProperty {

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
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
	@SchemaOrgURI("http://schema.org/earlyPrepaymentPenalty")
	@SchemaOrgLabel("earlyPrepaymentPenalty")
	@SchemaOrgComment(""
			+ "The amount to be paid as a penalty in the event of early payment of the loan.")
	@CamelizedName("earlyPrepaymentPenalty")
	@ConstantizedName("EARLY_PREPAYMENT_PENALTY")
	public interface EarlyPrepaymentPenalty extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/estimatedSalary")
	@SchemaOrgLabel("estimatedSalary")
	@SchemaOrgComment(""
			+ "A property describing the estimated salary for a job posting based on a variety"
			+ " of variables including, but not limited to industry, job title, and location."
			+ " The estimated salary is usually computed by outside organizations and therefore"
			+ " the hiring organization is not bound to this estimated salary.")
	@CamelizedName("estimatedSalary")
	@ConstantizedName("ESTIMATED_SALARY")
	public interface EstimatedSalary extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
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
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
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
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DateTime getDateTime();
		public void setDateTime(DateTime dateTime);
		public List<DateTime> getDateTimeList();
		public void setDateTimeList(List<DateTime> dateTimeList);
		public boolean hasDateTime();

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
	@SchemaOrgURI("http://schema.org/exchangeRate")
	@SchemaOrgLabel("exchangeRate")
	@SchemaOrgComment(""
			+ "The price of a currency in terms of another currency.")
	@CamelizedName("exchangeRate")
	@ConstantizedName("EXCHANGE_RATE")
	public interface ExchangeRate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/UnitPriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.UnitPriceSpecification
		 */
		public UnitPriceSpecification getUnitPriceSpecification();
		public void setUnitPriceSpecification(UnitPriceSpecification unitPriceSpecification);
		public List<UnitPriceSpecification> getUnitPriceSpecificationList();
		public void setUnitPriceSpecificationList(List<UnitPriceSpecification> unitPriceSpecificationList);
		public boolean hasUnitPriceSpecification();

		/**
		 * uri: http://schema.org/ExchangeRateSpecification
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.ExchangeRateSpecification
		 */
		public Clazz.ExchangeRateSpecification getExchangeRateSpecification();
		public void setExchangeRateSpecification(Clazz.ExchangeRateSpecification exchangeRateSpecification);
		public List<Clazz.ExchangeRateSpecification> getExchangeRateSpecificationList();
		public void setExchangeRateSpecificationList(List<Clazz.ExchangeRateSpecification> exchangeRateSpecificationList);
		public boolean hasExchangeRateSpecification();

		public String getNativeValue();

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
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public Number getNumber();
		public void setNumber(Number number);
		public List<Number> getNumberList();
		public void setNumberList(List<Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public java.math.BigDecimal getNativeValue();

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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

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
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

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
		 * uri: http://schema.org/GeospatialGeometry
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.GeospatialGeometry
		 */
		public Clazz.GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(Clazz.GeospatialGeometry geospatialGeometry);
		public List<Clazz.GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<Clazz.GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
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
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
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
		 * uri: http://schema.org/BroadcastChannel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastChannel
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
	public interface HasCategoryCode extends HasPart, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CategoryCode
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCode
		 */
		public Clazz.CategoryCode getCategoryCode();
		public void setCategoryCode(Clazz.CategoryCode categoryCode);
		public List<Clazz.CategoryCode> getCategoryCodeList();
		public void setCategoryCodeList(List<Clazz.CategoryCode> categoryCodeList);
		public boolean hasCategoryCode();

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
	@SchemaOrgURI("http://schema.org/healthPlanCoinsuranceRate")
	@SchemaOrgLabel("healthPlanCoinsuranceRate")
	@SchemaOrgComment(""
			+ "Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.")
	@CamelizedName("healthPlanCoinsuranceRate")
	@ConstantizedName("HEALTH_PLAN_COINSURANCE_RATE")
	public interface HealthPlanCoinsuranceRate extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanCopay")
	@SchemaOrgLabel("healthPlanCopay")
	@SchemaOrgComment("Whether The copay amount.")
	@CamelizedName("healthPlanCopay")
	@ConstantizedName("HEALTH_PLAN_COPAY")
	public interface HealthPlanCopay extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
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
	@SchemaOrgURI("http://schema.org/healthPlanCostSharing")
	@SchemaOrgLabel("healthPlanCostSharing")
	@SchemaOrgComment(""
			+ "Whether The costs to the patient for services under this network or formulary.")
	@CamelizedName("healthPlanCostSharing")
	@ConstantizedName("HEALTH_PLAN_COST_SHARING")
	public interface HealthPlanCostSharing extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
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
	@SchemaOrgURI("http://schema.org/healthPlanDrugTier")
	@SchemaOrgLabel("healthPlanDrugTier")
	@SchemaOrgComment(""
			+ "The tier(s) of drugs offered by this formulary or insurance plan.")
	@CamelizedName("healthPlanDrugTier")
	@ConstantizedName("HEALTH_PLAN_DRUG_TIER")
	public interface HealthPlanDrugTier extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanId")
	@SchemaOrgLabel("healthPlanId")
	@SchemaOrgComment(""
			+ "The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even"
			+ " across different markets.)")
	@CamelizedName("healthPlanId")
	@ConstantizedName("HEALTH_PLAN_ID")
	public interface HealthPlanId extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanMarketingUrl")
	@SchemaOrgLabel("healthPlanMarketingUrl")
	@SchemaOrgComment(""
			+ "The URL that goes directly to the plan brochure for the specific standard plan"
			+ " or plan variation.")
	@CamelizedName("healthPlanMarketingUrl")
	@ConstantizedName("HEALTH_PLAN_MARKETING_URL")
	public interface HealthPlanMarketingUrl extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanNetworkId")
	@SchemaOrgLabel("healthPlanNetworkId")
	@SchemaOrgComment(""
			+ "Name or unique ID of network. (Networks are often reused across different"
			+ " insurance plans).")
	@CamelizedName("healthPlanNetworkId")
	@ConstantizedName("HEALTH_PLAN_NETWORK_ID")
	public interface HealthPlanNetworkId extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanNetworkTier")
	@SchemaOrgLabel("healthPlanNetworkTier")
	@SchemaOrgComment("The tier(s) for this network.")
	@CamelizedName("healthPlanNetworkTier")
	@ConstantizedName("HEALTH_PLAN_NETWORK_TIER")
	public interface HealthPlanNetworkTier extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/healthPlanPharmacyCategory")
	@SchemaOrgLabel("healthPlanPharmacyCategory")
	@SchemaOrgComment(""
			+ "The category or type of pharmacy associated with this cost sharing.")
	@CamelizedName("healthPlanPharmacyCategory")
	@ConstantizedName("HEALTH_PLAN_PHARMACY_CATEGORY")
	public interface HealthPlanPharmacyCategory extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/inCodeSet")
	@SchemaOrgLabel("inCodeSet")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/CategoryCodeSet\">CategoryCodeSet</a> that contains"
			+ " this catagory code.")
	@CamelizedName("inCodeSet")
	@ConstantizedName("IN_CODE_SET")
	public interface InCodeSet extends IsPartOf, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CategoryCodeSet
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCodeSet
		 */
		public Clazz.CategoryCodeSet getCategoryCodeSet();
		public void setCategoryCodeSet(Clazz.CategoryCodeSet categoryCodeSet);
		public List<Clazz.CategoryCodeSet> getCategoryCodeSetList();
		public void setCategoryCodeSetList(List<Clazz.CategoryCodeSet> categoryCodeSetList);
		public boolean hasCategoryCodeSet();

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
	@SchemaOrgURI("http://schema.org/includedInHealthInsurancePlan")
	@SchemaOrgLabel("includedInHealthInsurancePlan")
	@SchemaOrgComment(""
			+ "The insurance plans that cover this drug.")
	@CamelizedName("includedInHealthInsurancePlan")
	@ConstantizedName("INCLUDED_IN_HEALTH_INSURANCE_PLAN")
	public interface IncludedInHealthInsurancePlan extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/HealthInsurancePlan
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthInsurancePlan
		 */
		public Clazz.HealthInsurancePlan getHealthInsurancePlan();
		public void setHealthInsurancePlan(Clazz.HealthInsurancePlan healthInsurancePlan);
		public List<Clazz.HealthInsurancePlan> getHealthInsurancePlanList();
		public void setHealthInsurancePlanList(List<Clazz.HealthInsurancePlan> healthInsurancePlanList);
		public boolean hasHealthInsurancePlan();

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
		 * uri: http://schema.org/HealthPlanFormulary
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthPlanFormulary
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
		 * uri: http://schema.org/HealthPlanNetwork
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthPlanNetwork
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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationAppliedBy")
	@SchemaOrgLabel("legislationAppliedBy")
	@SchemaOrgComment(""
			+ "Indicates that this legislation (or part of a legislation) is somehow transfered"
			+ " by another legislation in a different legislative context. This is an"
			+ " informative link, and it has no legal value. For legally-binding links of"
			+ " transposition, use the property <a"
			+ " href=\"/legislationTransposedBy\">legislationTransposedBy</a>. For example the"
			+ " informative consolidated version of the European Directive is somehow \"applied"
			+ " by\" an informative consolidated law in a European Union's member state.")
	@CamelizedName("legislationAppliedBy")
	@ConstantizedName("LEGISLATION_APPLIED_BY")
	public interface LegislationAppliedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

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
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationChangedBy")
	@SchemaOrgLabel("legislationChangedBy")
	@SchemaOrgComment(""
			+ "Another legislation that changes this legislation. This encompasses the notions"
			+ " of amendment, replacement, correction, repeal, or other types of change. This"
			+ " may be a direct change (textual or non-textual amendment) or a consequential or"
			+ " indirect change. The property is to be used to express the existence of a"
			+ " change relationship between two acts rather than the existence of a"
			+ " consolidated version of the text that shows the result of the change. For"
			+ " consolidation relationships, use the <a"
			+ " href=\"/legislationConsolidatedBy\">legislationConsolidatedBy</a> property.")
	@CamelizedName("legislationChangedBy")
	@ConstantizedName("LEGISLATION_CHANGED_BY")
	public interface LegislationChangedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
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
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationConsolidatedBy")
	@SchemaOrgLabel("legislationConsolidatedBy")
	@SchemaOrgComment(""
			+ "Indicates a consolidated legislation (which is usually the product of an"
			+ " editorial process that revises the legislation) that take into account this"
			+ " legislation.")
	@CamelizedName("legislationConsolidatedBy")
	@ConstantizedName("LEGISLATION_CONSOLIDATED_BY")
	public interface LegislationConsolidatedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
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
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
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
	@SchemaOrgURI("http://schema.org/legislationIdentifier")
	@SchemaOrgLabel("legislationIdentifier")
	@SchemaOrgComment(""
			+ "An identifier for the legislation. For example the CELEX at EU level, the NOR in"
			+ " France, or the ELI (European Legislation Identifier).")
	@CamelizedName("legislationIdentifier")
	@ConstantizedName("LEGISLATION_IDENTIFIER")
	public interface LegislationIdentifier extends Identifier, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/legislationLegalForce")
	@SchemaOrgLabel("legislationLegalForce")
	@SchemaOrgComment(""
			+ "Whether the legislation is currently in force, not in force, or partially in"
			+ " force.")
	@CamelizedName("legislationLegalForce")
	@ConstantizedName("LEGISLATION_LEGAL_FORCE")
	public interface LegislationLegalForce extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/LegalForceStatus
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.LegalForceStatus
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
		 * uri: http://schema.org/LegalValueLevel
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.LegalValueLevel
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
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
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
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legislationTransposedBy")
	@SchemaOrgLabel("legislationTransposedBy")
	@SchemaOrgComment(""
			+ "Indicates that the objectives set by this legislation (or part of legislation)"
			+ " are fulfilled by another legislation who passed appropriate implementation"
			+ " measures. Typically, European Directives are transposed by the legislations of"
			+ " European Union's member states or regions. This indicates a legally binding"
			+ " link between the 2 legislations.")
	@CamelizedName("legislationTransposedBy")
	@ConstantizedName("LEGISLATION_TRANSPOSED_BY")
	public interface LegislationTransposedBy extends LegislationAppliedBy, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
		 */
		public Clazz.Legislation getLegislation();
		public void setLegislation(Clazz.Legislation legislation);
		public List<Clazz.Legislation> getLegislationList();
		public void setLegislationList(List<Clazz.Legislation> legislationList);
		public boolean hasLegislation();

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
		 * uri: http://schema.org/Legislation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.Legislation
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
		 * uri: http://schema.org/CategoryCode
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.CategoryCode
		 */
		public Clazz.CategoryCode getCategoryCode();
		public void setCategoryCode(Clazz.CategoryCode categoryCode);
		public List<Clazz.CategoryCode> getCategoryCodeList();
		public void setCategoryCodeList(List<Clazz.CategoryCode> categoryCodeList);
		public boolean hasCategoryCode();

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
	@SchemaOrgURI("http://schema.org/linkRelationship")
	@SchemaOrgLabel("linkRelationship")
	@SchemaOrgComment(""
			+ "Indicates the relationship type of a Web link.")
	@CamelizedName("linkRelationship")
	@ConstantizedName("LINK_RELATIONSHIP")
	public interface LinkRelationship extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/loanMortgageMandateAmount")
	@SchemaOrgLabel("loanMortgageMandateAmount")
	@SchemaOrgComment(""
			+ "Amount of mortgage mandate that can be converted into a proper mortgage at a"
			+ " later stage.")
	@CamelizedName("loanMortgageMandateAmount")
	@ConstantizedName("LOAN_MORTGAGE_MANDATE_AMOUNT")
	public interface LoanMortgageMandateAmount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
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
		 * uri: http://schema.org/RepaymentSpecification
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.RepaymentSpecification
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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

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
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
			+ " discovery.</p>\n\n<p>For example, if <a class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> is: molecule"
			+ " concentration, <a class=\"localLink\""
			+ " href=\"http://schema.org/measurementTechnique\">measurementTechnique</a> could"
			+ " be: \"mass spectrometry\" or \"nmr spectroscopy\" or \"colorimetry\" or"
			+ " \"immunofluorescence\".</p>\n\n<p>If the <a class=\"localLink\""
			+ " href=\"http://schema.org/variableMeasured\">variableMeasured</a> is"
			+ " \"depression rating\", the <a class=\"localLink\""
			+ " href=\"http://schema.org/measurementTechnique\">measurementTechnique</a> could"
			+ " be \"Zung Scale\" or \"HAM-D\" or \"Beck Depression Inventory\".</p>\n\n<p>If"
			+ " there are several <a class=\"localLink\""
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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

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
		 * uri: http://schema.org/MenuSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MenuSection
		 */
		public MenuSection getMenuSection();
		public void setMenuSection(MenuSection menuSection);
		public List<MenuSection> getMenuSectionList();
		public void setMenuSectionList(List<MenuSection> menuSectionList);
		public boolean hasMenuSection();

		/**
		 * uri: http://schema.org/MenuItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MenuItem
		 */
		public MenuItem getMenuItem();
		public void setMenuItem(MenuItem menuItem);
		public List<MenuItem> getMenuItemList();
		public void setMenuItemList(List<MenuItem> menuItemList);
		public boolean hasMenuItem();

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
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(MonetaryAmount monetaryAmount);
		public List<MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

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
	@SchemaOrgURI("http://schema.org/offersPrescriptionByMail")
	@SchemaOrgLabel("offersPrescriptionByMail")
	@SchemaOrgComment(""
			+ "Whether prescriptions can be delivered by mail.")
	@CamelizedName("offersPrescriptionByMail")
	@ConstantizedName("OFFERS_PRESCRIPTION_BY_MAIL")
	public interface OffersPrescriptionByMail extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public Boolean getB00lean();
		public void setB00lean(Boolean b00lean);
		public List<Boolean> getB00leanList();
		public void setB00leanList(List<Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
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
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
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
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
		public boolean hasDuration();

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
	@SchemaOrgURI("http://schema.org/rxcui")
	@SchemaOrgLabel("rxcui")
	@SchemaOrgComment("The RxCUI drug identifier from RXNORM.")
	@CamelizedName("rxcui")
	@ConstantizedName("RXCUI")
	public interface Rxcui extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/speakable")
	@SchemaOrgLabel("speakable")
	@SchemaOrgComment(""
			+ "Indicates sections of a Web page that are particularly 'speakable' in the sense"
			+ " of being highlighted as being especially appropriate for text-to-speech"
			+ " conversion. Other sections of a page may also be usefully spoken in particular"
			+ " circumstances; the 'speakable' property serves to indicate the parts most"
			+ " likely to be generally useful for speech.</p>\n\n<p>The <em>speakable</em>"
			+ " property can be repeated an arbitrary number of times, with three kinds of"
			+ " possible 'content-locator' values:</p>\n\n<p>1.) <em>id-value</em> URL"
			+ " references - uses <em>id-value</em> of an element in the page being annotated."
			+ " The simplest use of <em>speakable</em> has (potentially relative) URL values,"
			+ " referencing identified sections of the document concerned.</p>\n\n<p>2.) CSS"
			+ " Selectors - addresses content in the annotated page, eg. via class attribute."
			+ " Use the <a class=\"localLink\""
			+ " href=\"http://schema.org/cssSelector\">cssSelector</a> property.</p>\n\n<p>3.) "
			+ " XPaths - addresses content via XPaths (assuming an XML view of the content)."
			+ " Use the <a class=\"localLink\" href=\"http://schema.org/xpath\">xpath</a>"
			+ " property.</p>\n\n<p>For more sophisticated markup of speakable sections beyond"
			+ " simple ID references, either CSS selectors or XPath expressions to pick out"
			+ " document section(s) as speakable. For this\nwe define a supporting type, <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/SpeakableSpecification\">SpeakableSpecification</a> "
			+ " which is defined to be a possible value of the <em>speakable</em> property.")
	@CamelizedName("speakable")
	@ConstantizedName("SPEAKABLE")
	public interface Speakable extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SpeakableSpecification
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.SpeakableSpecification
		 */
		public Clazz.SpeakableSpecification getSpeakableSpecification();
		public void setSpeakableSpecification(Clazz.SpeakableSpecification speakableSpecification);
		public List<Clazz.SpeakableSpecification> getSpeakableSpecificationList();
		public void setSpeakableSpecificationList(List<Clazz.SpeakableSpecification> speakableSpecificationList);
		public boolean hasSpeakableSpecification();

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
	@SchemaOrgURI("http://schema.org/spokenByCharacter")
	@SchemaOrgLabel("spokenByCharacter")
	@SchemaOrgComment(""
			+ "The (e.g. fictional) character, Person or Organization to whom the quotation is"
			+ " attributed within the containing CreativeWork.")
	@CamelizedName("spokenByCharacter")
	@ConstantizedName("SPOKEN_BY_CHARACTER")
	public interface SpokenByCharacter extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

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
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public URL getURL();
		public void setURL(URL url);
		public List<URL> getURLList();
		public void setURLList(List<URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
		 * uri: http://schema.org/PropertyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue
		 */
		public PropertyValue getPropertyValue();
		public void setPropertyValue(PropertyValue propertyValue);
		public List<PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

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
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

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
	@SchemaOrgURI("http://schema.org/xpath")
	@SchemaOrgLabel("xpath")
	@SchemaOrgComment("An XPath.")
	@CamelizedName("xpath")
	@ConstantizedName("XPATH")
	public interface Xpath extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/XPathType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.XPathType
		 */
		public Clazz.XPathType getXPathType();
		public void setXPathType(Clazz.XPathType xPathType);
		public List<Clazz.XPathType> getXPathTypeList();
		public void setXPathTypeList(List<Clazz.XPathType> xPathTypeList);
		public boolean hasXPathType();

		public String getNativeValue();

	}

}
