package org.kyojo.schemaOrg.m3n3.pending;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SchemaOrgClass;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Article;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CivicStructure;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DataFeed;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Event;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FoodEstablishment;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Intangible;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LoanOrCredit;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject;
import org.kyojo.schemaOrg.m3n3.core.Clazz.NewsArticle;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Organization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RadioChannel;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Rating;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Review;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Role;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Service;
import org.kyojo.schemaOrg.m3n3.core.Clazz.StructuredValue;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TradeAction;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TransferAction;
import org.kyojo.schemaOrg.m3n3.core.Container.Amount;
import org.kyojo.schemaOrg.m3n3.core.Container.ContactPoint;
import org.kyojo.schemaOrg.m3n3.core.Container.Currency;
import org.kyojo.schemaOrg.m3n3.core.Container.InLanguage;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.pending.Container;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AMRadioChannel")
	@SchemaOrgLabel("AMRadioChannel")
	@SchemaOrgComment("A radio channel that uses AM.")
	@CamelizedName("amRadioChannel")
	@ConstantizedName("AM_RADIO_CHANNEL")
	public interface AMRadioChannel extends RadioChannel, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AdvertiserContentArticle")
	@SchemaOrgLabel("AdvertiserContentArticle")
	@SchemaOrgComment(""
			+ "An <a class=\"localLink\" href=\"http://schema.org/Article\">Article</a> that an"
			+ " external entity has paid to place or to produce to its specifications. Includes"
			+ " <a href=\"https://en.wikipedia.org/wiki/Advertorial\">advertorials</a>,"
			+ " sponsored content, native advertising and other paid content.")
	@CamelizedName("advertiserContentArticle")
	@ConstantizedName("ADVERTISER_CONTENT_ARTICLE")
	public interface AdvertiserContentArticle extends Article, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AnalysisNewsArticle")
	@SchemaOrgLabel("AnalysisNewsArticle")
	@SchemaOrgComment(""
			+ "An AnalysisNewsArticle is a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a> that, while based on"
			+ " factual reporting, incorporates the expertise of the author/producer, offering"
			+ " interpretations and conclusions.")
	@CamelizedName("analysisNewsArticle")
	@ConstantizedName("ANALYSIS_NEWS_ARTICLE")
	public interface AnalysisNewsArticle extends NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BackgroundNewsArticle")
	@SchemaOrgLabel("BackgroundNewsArticle")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a>"
			+ " providing historical context, definition and detail on a specific topic (aka"
			+ " \"explainer\" or \"backgrounder\"). For example, an in-depth article or"
			+ " frequently-asked-questions (<a"
			+ " href=\"https://en.wikipedia.org/wiki/FAQ\">FAQ</a>) document on topics such as"
			+ " Climate Change or the European Union. Other kinds of background material from a"
			+ " non-news setting are often described using <a class=\"localLink\""
			+ " href=\"http://schema.org/Book\">Book</a> or <a class=\"localLink\""
			+ " href=\"http://schema.org/Article\">Article</a>, in particular <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/ScholarlyArticle\">ScholarlyArticle</a>. See also <a"
			+ " class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a> for"
			+ " related vocabulary from a learning/education perspective.")
	@CamelizedName("backgroundNewsArticle")
	@ConstantizedName("BACKGROUND_NEWS_ARTICLE")
	public interface BackgroundNewsArticle extends NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BedType")
	@SchemaOrgLabel("BedType")
	@SchemaOrgComment(""
			+ "A type of bed. This is used for indicating the bed or beds available in an"
			+ " accommodation.")
	@CamelizedName("bedType")
	@ConstantizedName("BED_TYPE")
	public interface BedType extends QualitativeValue, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BroadcastFrequencySpecification")
	@SchemaOrgLabel("BroadcastFrequencySpecification")
	@SchemaOrgComment(""
			+ "The frequency in MHz and the modulation used for a particular BroadcastService.")
	@CamelizedName("broadcastFrequencySpecification")
	@ConstantizedName("BROADCAST_FREQUENCY_SPECIFICATION")
	public interface BroadcastFrequencySpecification extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/broadcastFrequencyValue
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BroadcastFrequencyValue
		 */
		public Container.BroadcastFrequencyValue getBroadcastFrequencyValue();
		public void setBroadcastFrequencyValue(Container.BroadcastFrequencyValue broadcastFrequencyValue);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BrokerageAccount")
	@SchemaOrgLabel("BrokerageAccount")
	@SchemaOrgComment(""
			+ "An account that allows an investor to deposit funds and place investment orders"
			+ " with a licensed broker or brokerage firm.")
	@CamelizedName("brokerageAccount")
	@ConstantizedName("BROKERAGE_ACCOUNT")
	public interface BrokerageAccount extends InvestmentOrDeposit, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CategoryCode")
	@SchemaOrgLabel("CategoryCode")
	@SchemaOrgComment("A Category Code.")
	@CamelizedName("categoryCode")
	@ConstantizedName("CATEGORY_CODE")
	public interface CategoryCode extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/codeValue
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CodeValue
		 */
		public Container.CodeValue getCodeValue();
		public void setCodeValue(Container.CodeValue codeValue);

		/**
		 * uri: http://schema.org/inCodeSet
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.InCodeSet
		 */
		public Container.InCodeSet getInCodeSet();
		public void setInCodeSet(Container.InCodeSet inCodeSet);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CategoryCodeSet")
	@SchemaOrgLabel("CategoryCodeSet")
	@SchemaOrgComment("A set of Category Code values.")
	@CamelizedName("categoryCodeSet")
	@ConstantizedName("CATEGORY_CODE_SET")
	public interface CategoryCodeSet extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hasCategoryCode
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HasCategoryCode
		 */
		public Container.HasCategoryCode getHasCategoryCode();
		public void setHasCategoryCode(Container.HasCategoryCode hasCategoryCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CompleteDataFeed")
	@SchemaOrgLabel("CompleteDataFeed")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/CompleteDataFeed\">CompleteDataFeed</a> is a <a"
			+ " class=\"localLink\" href=\"http://schema.org/DataFeed\">DataFeed</a> whose"
			+ " standard representation includes content for every item currently in the"
			+ " feed.</p>\n\n<p>This is the equivalent of Atom's element as defined in Feed"
			+ " Paging and Archiving <a href=\"https://tools.ietf.org/html/rfc5005\">RFC"
			+ " 5005</a>, For example (and as defined for Atom), when using data from a feed"
			+ " that represents a collection of items that varies over time (e.g. \"Top Twenty"
			+ " Records\") there is no need to have newer entries mixed in alongside older,"
			+ " obsolete entries. By marking this feed as a CompleteDataFeed, old entries can"
			+ " be safely discarded when the feed is refreshed, since we can assume the feed"
			+ " has provided descriptions for all current items.")
	@CamelizedName("completeDataFeed")
	@ConstantizedName("COMPLETE_DATA_FEED")
	public interface CompleteDataFeed extends DataFeed, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Consortium")
	@SchemaOrgLabel("Consortium")
	@SchemaOrgComment(""
			+ "A Consortium is a membership <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> whose members are"
			+ " typically Organizations.")
	@CamelizedName("consortium")
	@ConstantizedName("CONSORTIUM")
	public interface Consortium extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CriticReview")
	@SchemaOrgLabel("CriticReview")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/CriticReview\">CriticReview</a> is a more specialized"
			+ " form of Review written or published by a source that is recognized for its"
			+ " reviewing activities. These can include online columns, travel and food guides,"
			+ " TV and radio shows, blogs and other independent Web sites. <a"
			+ " class=\"localLink\" href=\"http://schema.org/CriticReview\">CriticReview</a>s"
			+ " are typically more in-depth and professionally written. For simpler, casually"
			+ " written user/visitor/viewer/customer reviews, it is more appropriate to use the"
			+ " <a class=\"localLink\" href=\"http://schema.org/UserReview\">UserReview</a>"
			+ " type. Review aggregator sites such as Metacritic already separate out the"
			+ " site's user reviews from selected critic reviews that originate from"
			+ " third-party sources.")
	@CamelizedName("criticReview")
	@ConstantizedName("CRITIC_REVIEW")
	public interface CriticReview extends Review, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CssSelectorType")
	@SchemaOrgLabel("CssSelectorType")
	@SchemaOrgComment("Text representing a CSS selector.")
	@CamelizedName("cssSelectorType")
	@ConstantizedName("CSS_SELECTOR_TYPE")
	public interface CssSelectorType extends SchemaOrgClass, Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Distillery")
	@SchemaOrgLabel("Distillery")
	@SchemaOrgComment("A distillery.")
	@CamelizedName("distillery")
	@ConstantizedName("DISTILLERY")
	public interface Distillery extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmployerReview")
	@SchemaOrgLabel("EmployerReview")
	@SchemaOrgComment(""
			+ "An <a class=\"localLink\""
			+ " href=\"http://schema.org/EmployerReview\">EmployerReview</a> is a review of an"
			+ " <a class=\"localLink\" href=\"http://schema.org/Organization\">Organization</a>"
			+ " regarding its role as an employer, written by a current or former employee of"
			+ " that organization.")
	@CamelizedName("employerReview")
	@ConstantizedName("EMPLOYER_REVIEW")
	public interface EmployerReview extends Review, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EndorsementRating")
	@SchemaOrgLabel("EndorsementRating")
	@SchemaOrgComment(""
			+ "An EndorsementRating is a rating that expresses some level of endorsement, for"
			+ " example inclusion in a \"critic's pick\" blog, a\n  \"Like\" or \"+1\" on a"
			+ " social network. It can be considered the <a class=\"localLink\""
			+ " href=\"http://schema.org/result\">result</a> of an <a class=\"localLink\""
			+ " href=\"http://schema.org/EndorseAction\">EndorseAction</a> in which the <a"
			+ " class=\"localLink\" href=\"http://schema.org/object\">object</a> of the action"
			+ " is rated positively by\n  some <a class=\"localLink\""
			+ " href=\"http://schema.org/agent\">agent</a>. As is common elsewhere in"
			+ " schema.org, it is sometimes more useful to describe the results of such an"
			+ " action without explicitly describing the <a class=\"localLink\""
			+ " href=\"http://schema.org/Action\">Action</a>.</p>\n\n<p>An <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/EndorsementRating\">EndorsementRating</a> may be part"
			+ " of a numeric scale or organized system, but this is not required: having an"
			+ " explicit type for indicating a positive,\n  endorsement rating is particularly"
			+ " useful in the absence of numeric scales as it helps consumers understand that"
			+ " the rating is broadly positive.")
	@CamelizedName("endorsementRating")
	@ConstantizedName("ENDORSEMENT_RATING")
	public interface EndorsementRating extends Rating, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventSeries")
	@SchemaOrgLabel("EventSeries")
	@SchemaOrgComment(""
			+ "A series of <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>s."
			+ " Included events can relate with the series using the <a class=\"localLink\""
			+ " href=\"http://schema.org/superEvent\">superEvent</a> property.</p>\n\n<p>An"
			+ " EventSeries is a collection of events that share some unifying characteristic."
			+ " For example, \"The Olympic Games\" is a series, which\nis repeated regularly."
			+ " The \"2012 London Olympics\" can be presented both as an <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> in the series \"Olympic Games\", and"
			+ " as an\n<a class=\"localLink\""
			+ " href=\"http://schema.org/EventSeries\">EventSeries</a> that included a number"
			+ " of sporting competitions as Events.</p>\n\n<p>The nature of the association"
			+ " between the events in an <a class=\"localLink\""
			+ " href=\"http://schema.org/EventSeries\">EventSeries</a> can vary, but typical"
			+ " examples could\ninclude a thematic event series (e.g. topical meetups or"
			+ " classes), or a series of regular events that share a location, attendee group"
			+ " and/or organizers.</p>\n\n<p>EventSeries has been defined as a kind of Event to"
			+ " make it easy for publishers to use it in an Event context without\nworrying"
			+ " about which kinds of series are really event-like enough to call an Event. In"
			+ " general an EventSeries\nmay seem more Event-like when the period of time is"
			+ " compact and when aspects such as location are fixed, but\nit may also sometimes"
			+ " prove useful to describe a longer-term series as an Event.")
	@CamelizedName("eventSeries")
	@ConstantizedName("EVENT_SERIES")
	public interface EventSeries extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ExchangeRateSpecification")
	@SchemaOrgLabel("ExchangeRateSpecification")
	@SchemaOrgComment(""
			+ "A structured value representing exchange rate.")
	@CamelizedName("exchangeRateSpecification")
	@ConstantizedName("EXCHANGE_RATE_SPECIFICATION")
	public interface ExchangeRateSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/currency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Currency
		 */
		public Currency getCurrency();
		public void setCurrency(Currency currency);

		/**
		 * uri: http://schema.org/currentExchangeRate
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CurrentExchangeRate
		 */
		public Container.CurrentExchangeRate getCurrentExchangeRate();
		public void setCurrentExchangeRate(Container.CurrentExchangeRate currentExchangeRate);

		/**
		 * uri: http://schema.org/exchangeRateSpread
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ExchangeRateSpread
		 */
		public Container.ExchangeRateSpread getExchangeRateSpread();
		public void setExchangeRateSpread(Container.ExchangeRateSpread exchangeRateSpread);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FMRadioChannel")
	@SchemaOrgLabel("FMRadioChannel")
	@SchemaOrgComment("A radio channel that uses FM.")
	@CamelizedName("fmRadioChannel")
	@ConstantizedName("FM_RADIO_CHANNEL")
	public interface FMRadioChannel extends RadioChannel, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GeospatialGeometry")
	@SchemaOrgLabel("GeospatialGeometry")
	@SchemaOrgComment(""
			+ "(Eventually to be defined as) a supertype of GeoShape designed to accommodate"
			+ " definitions from Geo-Spatial best practices.")
	@CamelizedName("geospatialGeometry")
	@ConstantizedName("GEOSPATIAL_GEOMETRY")
	public interface GeospatialGeometry extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/geospatiallyContains
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyContains
		 */
		public Container.GeospatiallyContains getGeospatiallyContains();
		public void setGeospatiallyContains(Container.GeospatiallyContains geospatiallyContains);

		/**
		 * uri: http://schema.org/geospatiallyCoveredBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCoveredBy
		 */
		public Container.GeospatiallyCoveredBy getGeospatiallyCoveredBy();
		public void setGeospatiallyCoveredBy(Container.GeospatiallyCoveredBy geospatiallyCoveredBy);

		/**
		 * uri: http://schema.org/geospatiallyCovers
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCovers
		 */
		public Container.GeospatiallyCovers getGeospatiallyCovers();
		public void setGeospatiallyCovers(Container.GeospatiallyCovers geospatiallyCovers);

		/**
		 * uri: http://schema.org/geospatiallyCrosses
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCrosses
		 */
		public Container.GeospatiallyCrosses getGeospatiallyCrosses();
		public void setGeospatiallyCrosses(Container.GeospatiallyCrosses geospatiallyCrosses);

		/**
		 * uri: http://schema.org/geospatiallyDisjoint
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyDisjoint
		 */
		public Container.GeospatiallyDisjoint getGeospatiallyDisjoint();
		public void setGeospatiallyDisjoint(Container.GeospatiallyDisjoint geospatiallyDisjoint);

		/**
		 * uri: http://schema.org/geospatiallyEquals
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyEquals
		 */
		public Container.GeospatiallyEquals getGeospatiallyEquals();
		public void setGeospatiallyEquals(Container.GeospatiallyEquals geospatiallyEquals);

		/**
		 * uri: http://schema.org/geospatiallyIntersects
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyIntersects
		 */
		public Container.GeospatiallyIntersects getGeospatiallyIntersects();
		public void setGeospatiallyIntersects(Container.GeospatiallyIntersects geospatiallyIntersects);

		/**
		 * uri: http://schema.org/geospatiallyOverlaps
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyOverlaps
		 */
		public Container.GeospatiallyOverlaps getGeospatiallyOverlaps();
		public void setGeospatiallyOverlaps(Container.GeospatiallyOverlaps geospatiallyOverlaps);

		/**
		 * uri: http://schema.org/geospatiallyTouches
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyTouches
		 */
		public Container.GeospatiallyTouches getGeospatiallyTouches();
		public void setGeospatiallyTouches(Container.GeospatiallyTouches geospatiallyTouches);

		/**
		 * uri: http://schema.org/geospatiallyWithin
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyWithin
		 */
		public Container.GeospatiallyWithin getGeospatiallyWithin();
		public void setGeospatiallyWithin(Container.GeospatiallyWithin geospatiallyWithin);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthInsurancePlan")
	@SchemaOrgLabel("HealthInsurancePlan")
	@SchemaOrgComment(""
			+ "A US-style health insurance plan, including PPOs, EPOs, and HMOs.")
	@CamelizedName("healthInsurancePlan")
	@ConstantizedName("HEALTH_INSURANCE_PLAN")
	public interface HealthInsurancePlan extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/benefitsSummaryUrl
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BenefitsSummaryUrl
		 */
		public Container.BenefitsSummaryUrl getBenefitsSummaryUrl();
		public void setBenefitsSummaryUrl(Container.BenefitsSummaryUrl benefitsSummaryUrl);

		/**
		 * uri: http://schema.org/contactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContactPoint
		 */
		public ContactPoint getContactPoint();
		public void setContactPoint(ContactPoint contactPoint);

		/**
		 * uri: http://schema.org/healthPlanDrugOption
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanDrugOption
		 */
		public Container.HealthPlanDrugOption getHealthPlanDrugOption();
		public void setHealthPlanDrugOption(Container.HealthPlanDrugOption healthPlanDrugOption);

		/**
		 * uri: http://schema.org/healthPlanDrugTier
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanDrugTier
		 */
		public Container.HealthPlanDrugTier getHealthPlanDrugTier();
		public void setHealthPlanDrugTier(Container.HealthPlanDrugTier healthPlanDrugTier);

		/**
		 * uri: http://schema.org/healthPlanId
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanId
		 */
		public Container.HealthPlanId getHealthPlanId();
		public void setHealthPlanId(Container.HealthPlanId healthPlanId);

		/**
		 * uri: http://schema.org/healthPlanMarketingUrl
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanMarketingUrl
		 */
		public Container.HealthPlanMarketingUrl getHealthPlanMarketingUrl();
		public void setHealthPlanMarketingUrl(Container.HealthPlanMarketingUrl healthPlanMarketingUrl);

		/**
		 * uri: http://schema.org/includesHealthPlanFormulary
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.IncludesHealthPlanFormulary
		 */
		public Container.IncludesHealthPlanFormulary getIncludesHealthPlanFormulary();
		public void setIncludesHealthPlanFormulary(Container.IncludesHealthPlanFormulary includesHealthPlanFormulary);

		/**
		 * uri: http://schema.org/includesHealthPlanNetwork
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.IncludesHealthPlanNetwork
		 */
		public Container.IncludesHealthPlanNetwork getIncludesHealthPlanNetwork();
		public void setIncludesHealthPlanNetwork(Container.IncludesHealthPlanNetwork includesHealthPlanNetwork);

		/**
		 * uri: http://schema.org/usesHealthPlanIdStandard
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.UsesHealthPlanIdStandard
		 */
		public Container.UsesHealthPlanIdStandard getUsesHealthPlanIdStandard();
		public void setUsesHealthPlanIdStandard(Container.UsesHealthPlanIdStandard usesHealthPlanIdStandard);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthPlanCostSharingSpecification")
	@SchemaOrgLabel("HealthPlanCostSharingSpecification")
	@SchemaOrgComment(""
			+ "A description of costs to the patient under a given network or formulary.")
	@CamelizedName("healthPlanCostSharingSpecification")
	@ConstantizedName("HEALTH_PLAN_COST_SHARING_SPECIFICATION")
	public interface HealthPlanCostSharingSpecification extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthPlanCoinsuranceOption
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCoinsuranceOption
		 */
		public Container.HealthPlanCoinsuranceOption getHealthPlanCoinsuranceOption();
		public void setHealthPlanCoinsuranceOption(Container.HealthPlanCoinsuranceOption healthPlanCoinsuranceOption);

		/**
		 * uri: http://schema.org/healthPlanCoinsuranceRate
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCoinsuranceRate
		 */
		public Container.HealthPlanCoinsuranceRate getHealthPlanCoinsuranceRate();
		public void setHealthPlanCoinsuranceRate(Container.HealthPlanCoinsuranceRate healthPlanCoinsuranceRate);

		/**
		 * uri: http://schema.org/healthPlanCopay
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCopay
		 */
		public Container.HealthPlanCopay getHealthPlanCopay();
		public void setHealthPlanCopay(Container.HealthPlanCopay healthPlanCopay);

		/**
		 * uri: http://schema.org/healthPlanCopayOption
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCopayOption
		 */
		public Container.HealthPlanCopayOption getHealthPlanCopayOption();
		public void setHealthPlanCopayOption(Container.HealthPlanCopayOption healthPlanCopayOption);

		/**
		 * uri: http://schema.org/healthPlanPharmacyCategory
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanPharmacyCategory
		 */
		public Container.HealthPlanPharmacyCategory getHealthPlanPharmacyCategory();
		public void setHealthPlanPharmacyCategory(Container.HealthPlanPharmacyCategory healthPlanPharmacyCategory);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthPlanFormulary")
	@SchemaOrgLabel("HealthPlanFormulary")
	@SchemaOrgComment(""
			+ "For a given health insurance plan, the specification for costs and coverage of"
			+ " prescription drugs.")
	@CamelizedName("healthPlanFormulary")
	@ConstantizedName("HEALTH_PLAN_FORMULARY")
	public interface HealthPlanFormulary extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthPlanCostSharing
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCostSharing
		 */
		public Container.HealthPlanCostSharing getHealthPlanCostSharing();
		public void setHealthPlanCostSharing(Container.HealthPlanCostSharing healthPlanCostSharing);

		/**
		 * uri: http://schema.org/healthPlanDrugTier
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanDrugTier
		 */
		public Container.HealthPlanDrugTier getHealthPlanDrugTier();
		public void setHealthPlanDrugTier(Container.HealthPlanDrugTier healthPlanDrugTier);

		/**
		 * uri: http://schema.org/offersPrescriptionByMail
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.OffersPrescriptionByMail
		 */
		public Container.OffersPrescriptionByMail getOffersPrescriptionByMail();
		public void setOffersPrescriptionByMail(Container.OffersPrescriptionByMail offersPrescriptionByMail);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthPlanNetwork")
	@SchemaOrgLabel("HealthPlanNetwork")
	@SchemaOrgComment(""
			+ "A US-style health insurance plan network.")
	@CamelizedName("healthPlanNetwork")
	@ConstantizedName("HEALTH_PLAN_NETWORK")
	public interface HealthPlanNetwork extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthPlanCostSharing
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanCostSharing
		 */
		public Container.HealthPlanCostSharing getHealthPlanCostSharing();
		public void setHealthPlanCostSharing(Container.HealthPlanCostSharing healthPlanCostSharing);

		/**
		 * uri: http://schema.org/healthPlanNetworkId
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanNetworkId
		 */
		public Container.HealthPlanNetworkId getHealthPlanNetworkId();
		public void setHealthPlanNetworkId(Container.HealthPlanNetworkId healthPlanNetworkId);

		/**
		 * uri: http://schema.org/healthPlanNetworkTier
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanNetworkTier
		 */
		public Container.HealthPlanNetworkTier getHealthPlanNetworkTier();
		public void setHealthPlanNetworkTier(Container.HealthPlanNetworkTier healthPlanNetworkTier);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InvestmentFund")
	@SchemaOrgLabel("InvestmentFund")
	@SchemaOrgComment(""
			+ "A company or fund that gathers capital from a number of investors to create a"
			+ " pool of money that is then re-invested into stocks, bonds and other assets.")
	@CamelizedName("investmentFund")
	@ConstantizedName("INVESTMENT_FUND")
	public interface InvestmentFund extends InvestmentOrDeposit, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LegalForceStatus")
	@SchemaOrgLabel("LegalForceStatus")
	@SchemaOrgComment(""
			+ "A list of possible statuses for the legal force of a legislation.")
	@CamelizedName("legalForceStatus")
	@ConstantizedName("LEGAL_FORCE_STATUS")
	public interface LegalForceStatus extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LegalValueLevel")
	@SchemaOrgLabel("LegalValueLevel")
	@SchemaOrgComment(""
			+ "A list of possible levels for the legal validity of a legislation.")
	@CamelizedName("legalValueLevel")
	@ConstantizedName("LEGAL_VALUE_LEVEL")
	public interface LegalValueLevel extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Legislation")
	@SchemaOrgLabel("Legislation")
	@SchemaOrgComment(""
			+ "A legal act (enforceable or not) or a component of a legal act (like an"
			+ " article).")
	@CamelizedName("legislation")
	@ConstantizedName("LEGISLATION")
	public interface Legislation extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/legislationAppliedBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationAppliedBy
		 */
		public Container.LegislationAppliedBy getLegislationAppliedBy();
		public void setLegislationAppliedBy(Container.LegislationAppliedBy legislationAppliedBy);

		/**
		 * uri: http://schema.org/legislationApplies
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationApplies
		 */
		public Container.LegislationApplies getLegislationApplies();
		public void setLegislationApplies(Container.LegislationApplies legislationApplies);

		/**
		 * uri: http://schema.org/legislationChangedBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationChangedBy
		 */
		public Container.LegislationChangedBy getLegislationChangedBy();
		public void setLegislationChangedBy(Container.LegislationChangedBy legislationChangedBy);

		/**
		 * uri: http://schema.org/legislationChanges
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationChanges
		 */
		public Container.LegislationChanges getLegislationChanges();
		public void setLegislationChanges(Container.LegislationChanges legislationChanges);

		/**
		 * uri: http://schema.org/legislationConsolidatedBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationConsolidatedBy
		 */
		public Container.LegislationConsolidatedBy getLegislationConsolidatedBy();
		public void setLegislationConsolidatedBy(Container.LegislationConsolidatedBy legislationConsolidatedBy);

		/**
		 * uri: http://schema.org/legislationConsolidates
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationConsolidates
		 */
		public Container.LegislationConsolidates getLegislationConsolidates();
		public void setLegislationConsolidates(Container.LegislationConsolidates legislationConsolidates);

		/**
		 * uri: http://schema.org/legislationDate
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationDate
		 */
		public Container.LegislationDate getLegislationDate();
		public void setLegislationDate(Container.LegislationDate legislationDate);

		/**
		 * uri: http://schema.org/legislationDateVersion
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationDateVersion
		 */
		public Container.LegislationDateVersion getLegislationDateVersion();
		public void setLegislationDateVersion(Container.LegislationDateVersion legislationDateVersion);

		/**
		 * uri: http://schema.org/legislationIdentifier
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationIdentifier
		 */
		public Container.LegislationIdentifier getLegislationIdentifier();
		public void setLegislationIdentifier(Container.LegislationIdentifier legislationIdentifier);

		/**
		 * uri: http://schema.org/legislationLegalForce
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationLegalForce
		 */
		public Container.LegislationLegalForce getLegislationLegalForce();
		public void setLegislationLegalForce(Container.LegislationLegalForce legislationLegalForce);

		/**
		 * uri: http://schema.org/legislationPassedBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationPassedBy
		 */
		public Container.LegislationPassedBy getLegislationPassedBy();
		public void setLegislationPassedBy(Container.LegislationPassedBy legislationPassedBy);

		/**
		 * uri: http://schema.org/legislationResponsible
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationResponsible
		 */
		public Container.LegislationResponsible getLegislationResponsible();
		public void setLegislationResponsible(Container.LegislationResponsible legislationResponsible);

		/**
		 * uri: http://schema.org/legislationTransposedBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationTransposedBy
		 */
		public Container.LegislationTransposedBy getLegislationTransposedBy();
		public void setLegislationTransposedBy(Container.LegislationTransposedBy legislationTransposedBy);

		/**
		 * uri: http://schema.org/legislationTransposes
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationTransposes
		 */
		public Container.LegislationTransposes getLegislationTransposes();
		public void setLegislationTransposes(Container.LegislationTransposes legislationTransposes);

		/**
		 * uri: http://schema.org/legislationType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationType
		 */
		public Container.LegislationType getLegislationType();
		public void setLegislationType(Container.LegislationType legislationType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LegislationObject")
	@SchemaOrgLabel("LegislationObject")
	@SchemaOrgComment(""
			+ "A specific object or file containing a Legislation. Note that the same"
			+ " Legislation can be published in multiple files. For example, a digitally signed"
			+ " PDF, a plain PDF and an HTML version.")
	@CamelizedName("legislationObject")
	@ConstantizedName("LEGISLATION_OBJECT")
	public interface LegislationObject extends Legislation, MediaObject, SchemaOrgClass {

		/**
		 * uri: http://schema.org/legislationLegalValue
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LegislationLegalValue
		 */
		public Container.LegislationLegalValue getLegislationLegalValue();
		public void setLegislationLegalValue(Container.LegislationLegalValue legislationLegalValue);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LibrarySystem")
	@SchemaOrgLabel("LibrarySystem")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\""
			+ " href=\"http://schema.org/LibrarySystem\">LibrarySystem</a> is a collaborative"
			+ " system amongst several libraries.")
	@CamelizedName("librarySystem")
	@ConstantizedName("LIBRARY_SYSTEM")
	public interface LibrarySystem extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LinkRole")
	@SchemaOrgLabel("LinkRole")
	@SchemaOrgComment(""
			+ "A Role that represents a Web link e.g. as expressed via the 'url' property. Its"
			+ " linkRelationship property can indicate URL-based and plain textual link types"
			+ " e.g. those in IANA link registry or others such as 'amphtml'. This structure"
			+ " provides a placeholder where details from HTML's link element can be"
			+ " represented outside of HTML, e.g. in JSON-LD feeds.")
	@CamelizedName("linkRole")
	@ConstantizedName("LINK_ROLE")
	public interface LinkRole extends Role, SchemaOrgClass {

		/**
		 * uri: http://schema.org/inLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InLanguage
		 */
		public InLanguage getInLanguage();
		public void setInLanguage(InLanguage inLanguage);

		/**
		 * uri: http://schema.org/linkRelationship
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LinkRelationship
		 */
		public Container.LinkRelationship getLinkRelationship();
		public void setLinkRelationship(Container.LinkRelationship linkRelationship);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MoneyTransfer")
	@SchemaOrgLabel("MoneyTransfer")
	@SchemaOrgComment(""
			+ "The act of transferring money from one place to another place. This may occur"
			+ " electronically or physically.")
	@CamelizedName("moneyTransfer")
	@ConstantizedName("MONEY_TRANSFER")
	public interface MoneyTransfer extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/amount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Amount
		 */
		public Amount getAmount();
		public void setAmount(Amount amount);

		/**
		 * uri: http://schema.org/beneficiaryBank
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BeneficiaryBank
		 */
		public Container.BeneficiaryBank getBeneficiaryBank();
		public void setBeneficiaryBank(Container.BeneficiaryBank beneficiaryBank);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MortgageLoan")
	@SchemaOrgLabel("MortgageLoan")
	@SchemaOrgComment(""
			+ "A loan in which property or real estate is used as collateral. (A loan"
			+ " securitized against some real estate.)")
	@CamelizedName("mortgageLoan")
	@ConstantizedName("MORTGAGE_LOAN")
	public interface MortgageLoan extends LoanOrCredit, SchemaOrgClass {

		/**
		 * uri: http://schema.org/domiciledMortgage
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.DomiciledMortgage
		 */
		public Container.DomiciledMortgage getDomiciledMortgage();
		public void setDomiciledMortgage(Container.DomiciledMortgage domiciledMortgage);

		/**
		 * uri: http://schema.org/loanMortgageMandateAmount
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LoanMortgageMandateAmount
		 */
		public Container.LoanMortgageMandateAmount getLoanMortgageMandateAmount();
		public void setLoanMortgageMandateAmount(Container.LoanMortgageMandateAmount loanMortgageMandateAmount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NewsMediaOrganization")
	@SchemaOrgLabel("NewsMediaOrganization")
	@SchemaOrgComment(""
			+ "A News/Media organization such as a newspaper or TV station.")
	@CamelizedName("newsMediaOrganization")
	@ConstantizedName("NEWS_MEDIA_ORGANIZATION")
	public interface NewsMediaOrganization extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actionableFeedbackPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ActionableFeedbackPolicy
		 */
		public Container.ActionableFeedbackPolicy getActionableFeedbackPolicy();
		public void setActionableFeedbackPolicy(Container.ActionableFeedbackPolicy actionableFeedbackPolicy);

		/**
		 * uri: http://schema.org/correctionsPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CorrectionsPolicy
		 */
		public Container.CorrectionsPolicy getCorrectionsPolicy();
		public void setCorrectionsPolicy(Container.CorrectionsPolicy correctionsPolicy);

		/**
		 * uri: http://schema.org/diversityPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.DiversityPolicy
		 */
		public Container.DiversityPolicy getDiversityPolicy();
		public void setDiversityPolicy(Container.DiversityPolicy diversityPolicy);

		/**
		 * uri: http://schema.org/ethicsPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EthicsPolicy
		 */
		public Container.EthicsPolicy getEthicsPolicy();
		public void setEthicsPolicy(Container.EthicsPolicy ethicsPolicy);

		/**
		 * uri: http://schema.org/masthead
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Masthead
		 */
		public Container.Masthead getMasthead();
		public void setMasthead(Container.Masthead masthead);

		/**
		 * uri: http://schema.org/missionCoveragePrioritiesPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MissionCoveragePrioritiesPolicy
		 */
		public Container.MissionCoveragePrioritiesPolicy getMissionCoveragePrioritiesPolicy();
		public void setMissionCoveragePrioritiesPolicy(Container.MissionCoveragePrioritiesPolicy missionCoveragePrioritiesPolicy);

		/**
		 * uri: http://schema.org/unnamedSourcesPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.UnnamedSourcesPolicy
		 */
		public Container.UnnamedSourcesPolicy getUnnamedSourcesPolicy();
		public void setUnnamedSourcesPolicy(Container.UnnamedSourcesPolicy unnamedSourcesPolicy);

		/**
		 * uri: http://schema.org/verificationFactCheckingPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.VerificationFactCheckingPolicy
		 */
		public Container.VerificationFactCheckingPolicy getVerificationFactCheckingPolicy();
		public void setVerificationFactCheckingPolicy(Container.VerificationFactCheckingPolicy verificationFactCheckingPolicy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OpinionNewsArticle")
	@SchemaOrgLabel("OpinionNewsArticle")
	@SchemaOrgComment(""
			+ "An <a class=\"localLink\""
			+ " href=\"http://schema.org/OpinionNewsArticle\">OpinionNewsArticle</a> is a <a"
			+ " class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a> that"
			+ " primarily expresses opinions rather than journalistic reporting of news and"
			+ " events. For example, a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a> consisting of a column"
			+ " or <a class=\"localLink\" href=\"http://schema.org/Blog\">Blog</a>/<a"
			+ " class=\"localLink\" href=\"http://schema.org/BlogPosting\">BlogPosting</a>"
			+ " entry in the Opinions section of a news publication.")
	@CamelizedName("opinionNewsArticle")
	@ConstantizedName("OPINION_NEWS_ARTICLE")
	public interface OpinionNewsArticle extends NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PreOrderAction")
	@SchemaOrgLabel("PreOrderAction")
	@SchemaOrgComment(""
			+ "An agent orders a (not yet released) object/product/service to be"
			+ " delivered/sent.")
	@CamelizedName("preOrderAction")
	@ConstantizedName("PRE_ORDER_ACTION")
	public interface PreOrderAction extends SchemaOrgClass, TradeAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicToilet")
	@SchemaOrgLabel("PublicToilet")
	@SchemaOrgComment(""
			+ "A public toilet is a room or small building containing one or more toilets (and"
			+ " possibly also urinals) which is available for use by the general public, or by"
			+ " customers or employees of certain businesses.")
	@CamelizedName("publicToilet")
	@ConstantizedName("PUBLIC_TOILET")
	public interface PublicToilet extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Quotation")
	@SchemaOrgLabel("Quotation")
	@SchemaOrgComment(""
			+ "A quotation. Often but not necessarily from some written work, attributable to a"
			+ " real world author and - if associated with a fictional character - to any"
			+ " fictional Person. Use <a class=\"localLink\""
			+ " href=\"http://schema.org/isBasedOn\">isBasedOn</a> to link to source/origin."
			+ " The <a class=\"localLink\" href=\"http://schema.org/recordedIn\">recordedIn</a>"
			+ " property can be used to reference a Quotation from an <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a>.")
	@CamelizedName("quotation")
	@ConstantizedName("QUOTATION")
	public interface Quotation extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/spokenByCharacter
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.SpokenByCharacter
		 */
		public Container.SpokenByCharacter getSpokenByCharacter();
		public void setSpokenByCharacter(Container.SpokenByCharacter spokenByCharacter);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RepaymentSpecification")
	@SchemaOrgLabel("RepaymentSpecification")
	@SchemaOrgComment(""
			+ "A structured value representing repayment.")
	@CamelizedName("repaymentSpecification")
	@ConstantizedName("REPAYMENT_SPECIFICATION")
	public interface RepaymentSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/downPayment
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.DownPayment
		 */
		public Container.DownPayment getDownPayment();
		public void setDownPayment(Container.DownPayment downPayment);

		/**
		 * uri: http://schema.org/earlyPrepaymentPenalty
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EarlyPrepaymentPenalty
		 */
		public Container.EarlyPrepaymentPenalty getEarlyPrepaymentPenalty();
		public void setEarlyPrepaymentPenalty(Container.EarlyPrepaymentPenalty earlyPrepaymentPenalty);

		/**
		 * uri: http://schema.org/loanPaymentAmount
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LoanPaymentAmount
		 */
		public Container.LoanPaymentAmount getLoanPaymentAmount();
		public void setLoanPaymentAmount(Container.LoanPaymentAmount loanPaymentAmount);

		/**
		 * uri: http://schema.org/loanPaymentFrequency
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LoanPaymentFrequency
		 */
		public Container.LoanPaymentFrequency getLoanPaymentFrequency();
		public void setLoanPaymentFrequency(Container.LoanPaymentFrequency loanPaymentFrequency);

		/**
		 * uri: http://schema.org/numberOfLoanPayments
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.NumberOfLoanPayments
		 */
		public Container.NumberOfLoanPayments getNumberOfLoanPayments();
		public void setNumberOfLoanPayments(Container.NumberOfLoanPayments numberOfLoanPayments);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReportageNewsArticle")
	@SchemaOrgLabel("ReportageNewsArticle")
	@SchemaOrgComment(""
			+ "The <a class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a> type"
			+ " is a subtype of <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a> representing\n news"
			+ " articles which are the result of journalistic news reporting"
			+ " conventions.</p>\n\n<p>In practice many news publishers produce a wide variety"
			+ " of article types, many of which might be considered a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a> but not a <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a>. For"
			+ " example, opinion pieces, reviews, analysis, sponsored or satirical articles, or"
			+ " articles that combine several of these elements.</p>\n\n<p>The <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a> type"
			+ " is based on a stricter ideal for \"news\" as a work of journalism, with"
			+ " articles based on factual information either observed or verified by the"
			+ " author, or reported and verified from knowledgeable sources.  This often"
			+ " includes perspectives from multiple viewpoints on a particular issue"
			+ " (distinguishing news reports from public relations or propaganda).  News"
			+ " reports in the <a class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a> sense"
			+ " de-emphasize the opinion of the author, with commentary and value judgements"
			+ " typically expressed elsewhere.</p>\n\n<p>A <a class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a> which"
			+ " goes deeper into analysis can also be marked with an additional type of <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/AnalysisNewsArticle\">AnalysisNewsArticle</a>.")
	@CamelizedName("reportageNewsArticle")
	@ConstantizedName("REPORTAGE_NEWS_ARTICLE")
	public interface ReportageNewsArticle extends NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReviewNewsArticle")
	@SchemaOrgLabel("ReviewNewsArticle")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a>"
			+ " and <a class=\"localLink\""
			+ " href=\"http://schema.org/CriticReview\">CriticReview</a> providing a"
			+ " professional critic's assessment of a service, product, performance, or"
			+ " artistic or literary work.")
	@CamelizedName("reviewNewsArticle")
	@ConstantizedName("REVIEW_NEWS_ARTICLE")
	public interface ReviewNewsArticle extends CriticReview, NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SatiricalArticle")
	@SchemaOrgLabel("SatiricalArticle")
	@SchemaOrgComment(""
			+ "An <a class=\"localLink\" href=\"http://schema.org/Article\">Article</a> whose"
			+ " content is primarily <a"
			+ " href=\"https://en.wikipedia.org/wiki/Satire\">[satirical]</a> in nature, i.e."
			+ " unlikely to be literally true. A satirical article is sometimes but not"
			+ " necessarily also a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsArticle\">NewsArticle</a>. <a class=\"localLink\""
			+ " href=\"http://schema.org/ScholarlyArticle\">ScholarlyArticle</a>s are also"
			+ " sometimes satirized.")
	@CamelizedName("satiricalArticle")
	@ConstantizedName("SATIRICAL_ARTICLE")
	public interface SatiricalArticle extends Article, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Schedule")
	@SchemaOrgLabel("Schedule")
	@SchemaOrgComment(""
			+ "A schedule defines a repeating time period used to describe a regularly"
			+ " occurring <a class=\"localLink\" href=\"http://schema.org/Event\">Event</a>. At"
			+ " a minimum a schedule will specify <a class=\"localLink\""
			+ " href=\"http://schema.org/repeatFrequency\">repeatFrequency</a> which describes"
			+ " the interval between occurences of the event. Additional information can be"
			+ " provided to specify the schedule more precisely. \n      This includes"
			+ " identifying the day(s) of the week or month when the recurring event will take"
			+ " place, in addition to its start and end time. Schedules may also\n      have"
			+ " start and end dates to indicate when they are active, e.g. to define a limited"
			+ " calendar of events.")
	@CamelizedName("schedule")
	@ConstantizedName("SCHEDULE")
	public interface Schedule extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/byDay
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ByDay
		 */
		public Container.ByDay getByDay();
		public void setByDay(Container.ByDay byDay);

		/**
		 * uri: http://schema.org/byMonth
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ByMonth
		 */
		public Container.ByMonth getByMonth();
		public void setByMonth(Container.ByMonth byMonth);

		/**
		 * uri: http://schema.org/byMonthDay
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ByMonthDay
		 */
		public Container.ByMonthDay getByMonthDay();
		public void setByMonthDay(Container.ByMonthDay byMonthDay);

		/**
		 * uri: http://schema.org/eventSchedule
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EventSchedule
		 */
		public Container.EventSchedule getEventSchedule();
		public void setEventSchedule(Container.EventSchedule eventSchedule);

		/**
		 * uri: http://schema.org/exceptDate
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ExceptDate
		 */
		public Container.ExceptDate getExceptDate();
		public void setExceptDate(Container.ExceptDate exceptDate);

		/**
		 * uri: http://schema.org/repeatCount
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.RepeatCount
		 */
		public Container.RepeatCount getRepeatCount();
		public void setRepeatCount(Container.RepeatCount repeatCount);

		/**
		 * uri: http://schema.org/repeatFrequency
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.RepeatFrequency
		 */
		public Container.RepeatFrequency getRepeatFrequency();
		public void setRepeatFrequency(Container.RepeatFrequency repeatFrequency);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SpeakableSpecification")
	@SchemaOrgLabel("SpeakableSpecification")
	@SchemaOrgComment(""
			+ "A SpeakableSpecification indicates (typically via <a class=\"localLink\""
			+ " href=\"http://schema.org/xpath\">xpath</a> or <a class=\"localLink\""
			+ " href=\"http://schema.org/cssSelector\">cssSelector</a>) sections of a document"
			+ " that are highlighted as particularly <a class=\"localLink\""
			+ " href=\"http://schema.org/speakable\">speakable</a>. Instances of this type are"
			+ " expected to be used primarily as values of the <a class=\"localLink\""
			+ " href=\"http://schema.org/speakable\">speakable</a> property.")
	@CamelizedName("speakableSpecification")
	@ConstantizedName("SPEAKABLE_SPECIFICATION")
	public interface SpeakableSpecification extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/cssSelector
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CssSelector
		 */
		public Container.CssSelector getCssSelector();
		public void setCssSelector(Container.CssSelector cssSelector);

		/**
		 * uri: http://schema.org/xpath
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Xpath
		 */
		public Container.Xpath getXpath();
		public void setXpath(Container.Xpath xpath);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UserReview")
	@SchemaOrgLabel("UserReview")
	@SchemaOrgComment(""
			+ "A review created by an end-user (e.g. consumer, purchaser, attendee etc.), in"
			+ " contrast with <a class=\"localLink\""
			+ " href=\"http://schema.org/CriticReview\">CriticReview</a>.")
	@CamelizedName("userReview")
	@ConstantizedName("USER_REVIEW")
	public interface UserReview extends Review, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WebAPI")
	@SchemaOrgLabel("WebAPI")
	@SchemaOrgComment(""
			+ "An application programming interface accessible over Web/Internet technologies.")
	@CamelizedName("webAPI")
	@ConstantizedName("WEB_API")
	public interface WebAPI extends SchemaOrgClass, Service {

		/**
		 * uri: http://schema.org/documentation
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Documentation
		 */
		public Container.Documentation getDocumentation();
		public void setDocumentation(Container.Documentation documentation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WorkersUnion")
	@SchemaOrgLabel("WorkersUnion")
	@SchemaOrgComment(""
			+ "A Workers Union (also known as a Labor Union, Labour Union, or Trade Union) is"
			+ " an organization that promotes the interests of its worker members by"
			+ " collectively bargaining with management, organizing, and political lobbying.")
	@CamelizedName("workersUnion")
	@ConstantizedName("WORKERS_UNION")
	public interface WorkersUnion extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/XPathType")
	@SchemaOrgLabel("XPathType")
	@SchemaOrgComment(""
			+ "Text representing an XPath (typically but not necessarily version 1.0).")
	@CamelizedName("xPathType")
	@ConstantizedName("X_PATH_TYPE")
	public interface XPathType extends SchemaOrgClass, Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
