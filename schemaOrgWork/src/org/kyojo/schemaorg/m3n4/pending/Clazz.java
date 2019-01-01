package org.kyojo.schemaorg.m3n4.pending;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateRating;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.CivicStructure;
import org.kyojo.schemaorg.m3n4.core.Clazz.Comment;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n4.core.Clazz.Event;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishment;
import org.kyojo.schemaorg.m3n4.core.Clazz.Intangible;
import org.kyojo.schemaorg.m3n4.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaorg.m3n4.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n4.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.Rating;
import org.kyojo.schemaorg.m3n4.core.Clazz.Review;
import org.kyojo.schemaorg.m3n4.core.Clazz.Role;
import org.kyojo.schemaorg.m3n4.core.Clazz.Series;
import org.kyojo.schemaorg.m3n4.core.Clazz.Service;
import org.kyojo.schemaorg.m3n4.core.Clazz.StructuredValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.TradeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TransferAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n4.core.Container.Amount;
import org.kyojo.schemaorg.m3n4.core.Container.ContactPoint;
import org.kyojo.schemaorg.m3n4.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n4.core.Container.TouristType;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.pending.Container;

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
	public interface AMRadioChannel extends NativeValueText, RadioChannel, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ActionAccessSpecification")
	@SchemaOrgLabel("ActionAccessSpecification")
	@SchemaOrgComment(""
			+ "A set of requirements that a must be fulfilled in order to perform an Action.")
	@CamelizedName("actionAccessSpecification")
	@ConstantizedName("ACTION_ACCESS_SPECIFICATION")
	public interface ActionAccessSpecification extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/availabilityEnds">http://schema.org/availabilityEnds</a>
		 */
		public Container.AvailabilityEnds getAvailabilityEnds();
		public void setAvailabilityEnds(Container.AvailabilityEnds availabilityEnds);

		/**
		 * @see <a href="http://schema.org/availabilityStarts">http://schema.org/availabilityStarts</a>
		 */
		public Container.AvailabilityStarts getAvailabilityStarts();
		public void setAvailabilityStarts(Container.AvailabilityStarts availabilityStarts);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Container.Category getCategory();
		public void setCategory(Container.Category category);

		/**
		 * @see <a href="http://schema.org/eligibleRegion">http://schema.org/eligibleRegion</a>
		 */
		public Container.EligibleRegion getEligibleRegion();
		public void setEligibleRegion(Container.EligibleRegion eligibleRegion);

		/**
		 * @see <a href="http://schema.org/expectsAcceptanceOf">http://schema.org/expectsAcceptanceOf</a>
		 */
		public Container.ExpectsAcceptanceOf getExpectsAcceptanceOf();
		public void setExpectsAcceptanceOf(Container.ExpectsAcceptanceOf expectsAcceptanceOf);

		/**
		 * @see <a href="http://schema.org/requiresSubscription">http://schema.org/requiresSubscription</a>
		 */
		public Container.RequiresSubscription getRequiresSubscription();
		public void setRequiresSubscription(Container.RequiresSubscription requiresSubscription);

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
	public interface AdvertiserContentArticle extends Article, NativeValueText, SchemaOrgClass {

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
	public interface AnalysisNewsArticle extends NativeValueText, NewsArticle, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AskPublicNewsArticle")
	@SchemaOrgLabel("AskPublicNewsArticle")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a>"
			+ " expressing an open call by a <a class=\"localLink\""
			+ " href=\"http://schema.org/NewsMediaOrganization\">NewsMediaOrganization</a>"
			+ " asking the public for input, insights, clarifications, anecdotes,"
			+ " documentation, etc., on an issue, for reporting purposes.")
	@CamelizedName("askPublicNewsArticle")
	@ConstantizedName("ASK_PUBLIC_NEWS_ARTICLE")
	public interface AskPublicNewsArticle extends NativeValueText, NewsArticle, SchemaOrgClass {

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
	public interface BackgroundNewsArticle extends NativeValueText, NewsArticle, SchemaOrgClass {

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
	public interface BedType extends NativeValueText, QualitativeValue, SchemaOrgClass {

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
	public interface BroadcastFrequencySpecification extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/broadcastFrequencyValue">http://schema.org/broadcastFrequencyValue</a>
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
	public interface BrokerageAccount extends InvestmentOrDeposit, NativeValueText, SchemaOrgClass {

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
	public interface CategoryCode extends DefinedTerm, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/codeValue">http://schema.org/codeValue</a>
		 */
		public Container.CodeValue getCodeValue();
		public void setCodeValue(Container.CodeValue codeValue);

		/**
		 * @see <a href="http://schema.org/inCodeSet">http://schema.org/inCodeSet</a>
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
	public interface CategoryCodeSet extends DefinedTermSet, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/hasCategoryCode">http://schema.org/hasCategoryCode</a>
		 */
		public Container.HasCategoryCode getHasCategoryCode();
		public void setHasCategoryCode(Container.HasCategoryCode hasCategoryCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Claim")
	@SchemaOrgLabel("Claim")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/Claim\">Claim</a> in"
			+ " Schema.org represents a specific, factually-oriented claim that could be the <a"
			+ " class=\"localLink\" href=\"http://schema.org/itemReviewed\">itemReviewed</a> in"
			+ " a <a class=\"localLink\""
			+ " href=\"http://schema.org/ClaimReview\">ClaimReview</a>. The content of a claim"
			+ " can be summarized with the <a class=\"localLink\""
			+ " href=\"http://schema.org/text\">text</a> property. Variations on well known"
			+ " claims can have their common identity indicated via <a class=\"localLink\""
			+ " href=\"http://schema.org/sameAs\">sameAs</a> links, and summarized with a <a"
			+ " class=\"localLink\" href=\"http://schema.org/name\">name</a>. Ideally, a <a"
			+ " class=\"localLink\" href=\"http://schema.org/Claim\">Claim</a> description"
			+ " includes enough contextual information to minimize the risk of ambiguity or"
			+ " inclarity. In practice, many claims are better understood in the context in"
			+ " which they appear or the interpretations provided by claim"
			+ " reviews.<br/><br/>\n\nBeyond <a class=\"localLink\""
			+ " href=\"http://schema.org/ClaimReview\">ClaimReview</a>, the Claim type can be"
			+ " associated with related creative works - for example a <a class=\"localLink\""
			+ " href=\"http://schema.org/ScholaryArticle\">ScholaryArticle</a> or <a"
			+ " class=\"localLink\" href=\"http://schema.org/Question\">Question</a> might be"
			+ " <a class=\"localLink\" href=\"http://schema.org/about\">about</a> some <a"
			+ " class=\"localLink\" href=\"http://schema.org/Claim\">Claim</a>.<br/><br/>\n\nAt"
			+ " this time, Schema.org does not define any types of relationship between claims."
			+ " This is a natural area for future exploration.")
	@CamelizedName("claim")
	@ConstantizedName("CLAIM")
	public interface Claim extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/appearance">http://schema.org/appearance</a>
		 */
		public Container.Appearance getAppearance();
		public void setAppearance(Container.Appearance appearance);

		/**
		 * @see <a href="http://schema.org/firstAppearance">http://schema.org/firstAppearance</a>
		 */
		public Container.FirstAppearance getFirstAppearance();
		public void setFirstAppearance(Container.FirstAppearance firstAppearance);

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
			+ " feed.<br/><br/>\n\nThis is the equivalent of Atom's element as defined in Feed"
			+ " Paging and Archiving <a href=\"https://tools.ietf.org/html/rfc5005\">RFC"
			+ " 5005</a>, For example (and as defined for Atom), when using data from a feed"
			+ " that represents a collection of items that varies over time (e.g. \"Top Twenty"
			+ " Records\") there is no need to have newer entries mixed in alongside older,"
			+ " obsolete entries. By marking this feed as a CompleteDataFeed, old entries can"
			+ " be safely discarded when the feed is refreshed, since we can assume the feed"
			+ " has provided descriptions for all current items.")
	@CamelizedName("completeDataFeed")
	@ConstantizedName("COMPLETE_DATA_FEED")
	public interface CompleteDataFeed extends DataFeed, NativeValueText, SchemaOrgClass {

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
	public interface Consortium extends NativeValueText, Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CorrectionComment")
	@SchemaOrgLabel("CorrectionComment")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/comment\">comment</a> that"
			+ " corrects <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a>.")
	@CamelizedName("correctionComment")
	@ConstantizedName("CORRECTION_COMMENT")
	public interface CorrectionComment extends Comment, NativeValueText, SchemaOrgClass {

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
	public interface CriticReview extends NativeValueText, Review, SchemaOrgClass {

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
	public interface CssSelectorType extends NativeValueText, SchemaOrgClass, Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DefinedTerm")
	@SchemaOrgLabel("DefinedTerm")
	@SchemaOrgComment(""
			+ "A word, name, acronym, phrase, etc. with a formal definition. Often used in the"
			+ " context of category or subject classification, glossaries or dictionaries,"
			+ " product or creative work types, etc. Use the name property for the term being"
			+ " defined, use termCode if the term has an alpha-numeric code allocated, use"
			+ " description to provide the definition of the term.")
	@CamelizedName("definedTerm")
	@ConstantizedName("DEFINED_TERM")
	public interface DefinedTerm extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/inDefinedTermSet">http://schema.org/inDefinedTermSet</a>
		 */
		public Container.InDefinedTermSet getInDefinedTermSet();
		public void setInDefinedTermSet(Container.InDefinedTermSet inDefinedTermSet);

		/**
		 * @see <a href="http://schema.org/termCode">http://schema.org/termCode</a>
		 */
		public Container.TermCode getTermCode();
		public void setTermCode(Container.TermCode termCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DefinedTermSet")
	@SchemaOrgLabel("DefinedTermSet")
	@SchemaOrgComment(""
			+ "A set of defined terms for example a set of categories or a classification"
			+ " scheme, a glossary, dictionary or enumeration.")
	@CamelizedName("definedTermSet")
	@ConstantizedName("DEFINED_TERM_SET")
	public interface DefinedTermSet extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/hasDefinedTerm">http://schema.org/hasDefinedTerm</a>
		 */
		public Container.HasDefinedTerm getHasDefinedTerm();
		public void setHasDefinedTerm(Container.HasDefinedTerm hasDefinedTerm);

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
	public interface Distillery extends FoodEstablishment, NativeValueText, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmployerAggregateRating")
	@SchemaOrgLabel("EmployerAggregateRating")
	@SchemaOrgComment(""
			+ "An aggregate rating of an Organization related to its role as an employer.")
	@CamelizedName("employerAggregateRating")
	@ConstantizedName("EMPLOYER_AGGREGATE_RATING")
	public interface EmployerAggregateRating extends AggregateRating, NativeValueText, SchemaOrgClass {

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
	public interface EmployerReview extends NativeValueText, Review, SchemaOrgClass {

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
			+ " href=\"http://schema.org/Action\">Action</a>.<br/><br/>\n\nAn <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/EndorsementRating\">EndorsementRating</a> may be part"
			+ " of a numeric scale or organized system, but this is not required: having an"
			+ " explicit type for indicating a positive,\n  endorsement rating is particularly"
			+ " useful in the absence of numeric scales as it helps consumers understand that"
			+ " the rating is broadly positive.")
	@CamelizedName("endorsementRating")
	@ConstantizedName("ENDORSEMENT_RATING")
	public interface EndorsementRating extends NativeValueText, Rating, SchemaOrgClass {

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
			+ " href=\"http://schema.org/superEvent\">superEvent</a> property.<br/><br/>\n\nAn"
			+ " EventSeries is a collection of events that share some unifying characteristic."
			+ " For example, \"The Olympic Games\" is a series, which\nis repeated regularly."
			+ " The \"2012 London Olympics\" can be presented both as an <a class=\"localLink\""
			+ " href=\"http://schema.org/Event\">Event</a> in the series \"Olympic Games\", and"
			+ " as an\n<a class=\"localLink\""
			+ " href=\"http://schema.org/EventSeries\">EventSeries</a> that included a number"
			+ " of sporting competitions as Events.<br/><br/>\n\nThe nature of the association"
			+ " between the events in an <a class=\"localLink\""
			+ " href=\"http://schema.org/EventSeries\">EventSeries</a> can vary, but typical"
			+ " examples could\ninclude a thematic event series (e.g. topical meetups or"
			+ " classes), or a series of regular events that share a location, attendee group"
			+ " and/or organizers.<br/><br/>\n\nEventSeries has been defined as a kind of Event"
			+ " to make it easy for publishers to use it in an Event context without\nworrying"
			+ " about which kinds of series are really event-like enough to call an Event. In"
			+ " general an EventSeries\nmay seem more Event-like when the period of time is"
			+ " compact and when aspects such as location are fixed, but\nit may also sometimes"
			+ " prove useful to describe a longer-term series as an Event.")
	@CamelizedName("eventSeries")
	@ConstantizedName("EVENT_SERIES")
	public interface EventSeries extends Event, NativeValueText, SchemaOrgClass, Series {

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
	public interface ExchangeRateSpecification extends NativeValueText, SchemaOrgClass, StructuredValue {

		/**
		 * @see <a href="http://schema.org/currency">http://schema.org/currency</a>
		 */
		public Container.Currency getCurrency();
		public void setCurrency(Container.Currency currency);

		/**
		 * @see <a href="http://schema.org/currentExchangeRate">http://schema.org/currentExchangeRate</a>
		 */
		public Container.CurrentExchangeRate getCurrentExchangeRate();
		public void setCurrentExchangeRate(Container.CurrentExchangeRate currentExchangeRate);

		/**
		 * @see <a href="http://schema.org/exchangeRateSpread">http://schema.org/exchangeRateSpread</a>
		 */
		public Container.ExchangeRateSpread getExchangeRateSpread();
		public void setExchangeRateSpread(Container.ExchangeRateSpread exchangeRateSpread);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FAQPage")
	@SchemaOrgLabel("FAQPage")
	@SchemaOrgComment(""
			+ "A <a class=\"localLink\" href=\"http://schema.org/FAQPage\">FAQPage</a> is a <a"
			+ " class=\"localLink\" href=\"http://schema.org/WebPage\">WebPage</a> presenting"
			+ " one or more \"<a href=\"https://en.wikipedia.org/wiki/FAQ\">Frequently asked"
			+ " questions</a>\" (see also <a class=\"localLink\""
			+ " href=\"http://schema.org/QAPage\">QAPage</a>).")
	@CamelizedName("faqPage")
	@ConstantizedName("FAQ_PAGE")
	public interface FAQPage extends NativeValueText, SchemaOrgClass, WebPage {

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
	public interface FMRadioChannel extends NativeValueText, RadioChannel, SchemaOrgClass {

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
	public interface GeospatialGeometry extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/geospatiallyContains">http://schema.org/geospatiallyContains</a>
		 */
		public Container.GeospatiallyContains getGeospatiallyContains();
		public void setGeospatiallyContains(Container.GeospatiallyContains geospatiallyContains);

		/**
		 * @see <a href="http://schema.org/geospatiallyCoveredBy">http://schema.org/geospatiallyCoveredBy</a>
		 */
		public Container.GeospatiallyCoveredBy getGeospatiallyCoveredBy();
		public void setGeospatiallyCoveredBy(Container.GeospatiallyCoveredBy geospatiallyCoveredBy);

		/**
		 * @see <a href="http://schema.org/geospatiallyCovers">http://schema.org/geospatiallyCovers</a>
		 */
		public Container.GeospatiallyCovers getGeospatiallyCovers();
		public void setGeospatiallyCovers(Container.GeospatiallyCovers geospatiallyCovers);

		/**
		 * @see <a href="http://schema.org/geospatiallyCrosses">http://schema.org/geospatiallyCrosses</a>
		 */
		public Container.GeospatiallyCrosses getGeospatiallyCrosses();
		public void setGeospatiallyCrosses(Container.GeospatiallyCrosses geospatiallyCrosses);

		/**
		 * @see <a href="http://schema.org/geospatiallyDisjoint">http://schema.org/geospatiallyDisjoint</a>
		 */
		public Container.GeospatiallyDisjoint getGeospatiallyDisjoint();
		public void setGeospatiallyDisjoint(Container.GeospatiallyDisjoint geospatiallyDisjoint);

		/**
		 * @see <a href="http://schema.org/geospatiallyEquals">http://schema.org/geospatiallyEquals</a>
		 */
		public Container.GeospatiallyEquals getGeospatiallyEquals();
		public void setGeospatiallyEquals(Container.GeospatiallyEquals geospatiallyEquals);

		/**
		 * @see <a href="http://schema.org/geospatiallyIntersects">http://schema.org/geospatiallyIntersects</a>
		 */
		public Container.GeospatiallyIntersects getGeospatiallyIntersects();
		public void setGeospatiallyIntersects(Container.GeospatiallyIntersects geospatiallyIntersects);

		/**
		 * @see <a href="http://schema.org/geospatiallyOverlaps">http://schema.org/geospatiallyOverlaps</a>
		 */
		public Container.GeospatiallyOverlaps getGeospatiallyOverlaps();
		public void setGeospatiallyOverlaps(Container.GeospatiallyOverlaps geospatiallyOverlaps);

		/**
		 * @see <a href="http://schema.org/geospatiallyTouches">http://schema.org/geospatiallyTouches</a>
		 */
		public Container.GeospatiallyTouches getGeospatiallyTouches();
		public void setGeospatiallyTouches(Container.GeospatiallyTouches geospatiallyTouches);

		/**
		 * @see <a href="http://schema.org/geospatiallyWithin">http://schema.org/geospatiallyWithin</a>
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
	public interface HealthInsurancePlan extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/benefitsSummaryUrl">http://schema.org/benefitsSummaryUrl</a>
		 */
		public Container.BenefitsSummaryUrl getBenefitsSummaryUrl();
		public void setBenefitsSummaryUrl(Container.BenefitsSummaryUrl benefitsSummaryUrl);

		/**
		 * @see <a href="http://schema.org/contactPoint">http://schema.org/contactPoint</a>
		 */
		public ContactPoint getContactPoint();
		public void setContactPoint(ContactPoint contactPoint);

		/**
		 * @see <a href="http://schema.org/healthPlanDrugOption">http://schema.org/healthPlanDrugOption</a>
		 */
		public Container.HealthPlanDrugOption getHealthPlanDrugOption();
		public void setHealthPlanDrugOption(Container.HealthPlanDrugOption healthPlanDrugOption);

		/**
		 * @see <a href="http://schema.org/healthPlanDrugTier">http://schema.org/healthPlanDrugTier</a>
		 */
		public Container.HealthPlanDrugTier getHealthPlanDrugTier();
		public void setHealthPlanDrugTier(Container.HealthPlanDrugTier healthPlanDrugTier);

		/**
		 * @see <a href="http://schema.org/healthPlanId">http://schema.org/healthPlanId</a>
		 */
		public Container.HealthPlanId getHealthPlanId();
		public void setHealthPlanId(Container.HealthPlanId healthPlanId);

		/**
		 * @see <a href="http://schema.org/healthPlanMarketingUrl">http://schema.org/healthPlanMarketingUrl</a>
		 */
		public Container.HealthPlanMarketingUrl getHealthPlanMarketingUrl();
		public void setHealthPlanMarketingUrl(Container.HealthPlanMarketingUrl healthPlanMarketingUrl);

		/**
		 * @see <a href="http://schema.org/includesHealthPlanFormulary">http://schema.org/includesHealthPlanFormulary</a>
		 */
		public Container.IncludesHealthPlanFormulary getIncludesHealthPlanFormulary();
		public void setIncludesHealthPlanFormulary(Container.IncludesHealthPlanFormulary includesHealthPlanFormulary);

		/**
		 * @see <a href="http://schema.org/includesHealthPlanNetwork">http://schema.org/includesHealthPlanNetwork</a>
		 */
		public Container.IncludesHealthPlanNetwork getIncludesHealthPlanNetwork();
		public void setIncludesHealthPlanNetwork(Container.IncludesHealthPlanNetwork includesHealthPlanNetwork);

		/**
		 * @see <a href="http://schema.org/usesHealthPlanIdStandard">http://schema.org/usesHealthPlanIdStandard</a>
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
	public interface HealthPlanCostSharingSpecification extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/healthPlanCoinsuranceOption">http://schema.org/healthPlanCoinsuranceOption</a>
		 */
		public Container.HealthPlanCoinsuranceOption getHealthPlanCoinsuranceOption();
		public void setHealthPlanCoinsuranceOption(Container.HealthPlanCoinsuranceOption healthPlanCoinsuranceOption);

		/**
		 * @see <a href="http://schema.org/healthPlanCoinsuranceRate">http://schema.org/healthPlanCoinsuranceRate</a>
		 */
		public Container.HealthPlanCoinsuranceRate getHealthPlanCoinsuranceRate();
		public void setHealthPlanCoinsuranceRate(Container.HealthPlanCoinsuranceRate healthPlanCoinsuranceRate);

		/**
		 * @see <a href="http://schema.org/healthPlanCopay">http://schema.org/healthPlanCopay</a>
		 */
		public Container.HealthPlanCopay getHealthPlanCopay();
		public void setHealthPlanCopay(Container.HealthPlanCopay healthPlanCopay);

		/**
		 * @see <a href="http://schema.org/healthPlanCopayOption">http://schema.org/healthPlanCopayOption</a>
		 */
		public Container.HealthPlanCopayOption getHealthPlanCopayOption();
		public void setHealthPlanCopayOption(Container.HealthPlanCopayOption healthPlanCopayOption);

		/**
		 * @see <a href="http://schema.org/healthPlanPharmacyCategory">http://schema.org/healthPlanPharmacyCategory</a>
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
	public interface HealthPlanFormulary extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/healthPlanCostSharing">http://schema.org/healthPlanCostSharing</a>
		 */
		public Container.HealthPlanCostSharing getHealthPlanCostSharing();
		public void setHealthPlanCostSharing(Container.HealthPlanCostSharing healthPlanCostSharing);

		/**
		 * @see <a href="http://schema.org/healthPlanDrugTier">http://schema.org/healthPlanDrugTier</a>
		 */
		public Container.HealthPlanDrugTier getHealthPlanDrugTier();
		public void setHealthPlanDrugTier(Container.HealthPlanDrugTier healthPlanDrugTier);

		/**
		 * @see <a href="http://schema.org/offersPrescriptionByMail">http://schema.org/offersPrescriptionByMail</a>
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
	public interface HealthPlanNetwork extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/healthPlanCostSharing">http://schema.org/healthPlanCostSharing</a>
		 */
		public Container.HealthPlanCostSharing getHealthPlanCostSharing();
		public void setHealthPlanCostSharing(Container.HealthPlanCostSharing healthPlanCostSharing);

		/**
		 * @see <a href="http://schema.org/healthPlanNetworkId">http://schema.org/healthPlanNetworkId</a>
		 */
		public Container.HealthPlanNetworkId getHealthPlanNetworkId();
		public void setHealthPlanNetworkId(Container.HealthPlanNetworkId healthPlanNetworkId);

		/**
		 * @see <a href="http://schema.org/healthPlanNetworkTier">http://schema.org/healthPlanNetworkTier</a>
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
	public interface InvestmentFund extends InvestmentOrDeposit, NativeValueText, SchemaOrgClass {

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
	public interface LegalForceStatus extends Enumeration, NativeValueText, SchemaOrgClass {

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
	public interface LegalValueLevel extends Enumeration, NativeValueText, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Legislation")
	@SchemaOrgLabel("Legislation")
	@SchemaOrgComment(""
			+ "A legal document such as an act, decree, bill, etc. (enforceable or not) or a"
			+ " component of a legal act (like an article).")
	@CamelizedName("legislation")
	@ConstantizedName("LEGISLATION")
	public interface Legislation extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/legislationApplies">http://schema.org/legislationApplies</a>
		 */
		public Container.LegislationApplies getLegislationApplies();
		public void setLegislationApplies(Container.LegislationApplies legislationApplies);

		/**
		 * @see <a href="http://schema.org/legislationChanges">http://schema.org/legislationChanges</a>
		 */
		public Container.LegislationChanges getLegislationChanges();
		public void setLegislationChanges(Container.LegislationChanges legislationChanges);

		/**
		 * @see <a href="http://schema.org/legislationConsolidates">http://schema.org/legislationConsolidates</a>
		 */
		public Container.LegislationConsolidates getLegislationConsolidates();
		public void setLegislationConsolidates(Container.LegislationConsolidates legislationConsolidates);

		/**
		 * @see <a href="http://schema.org/legislationDate">http://schema.org/legislationDate</a>
		 */
		public Container.LegislationDate getLegislationDate();
		public void setLegislationDate(Container.LegislationDate legislationDate);

		/**
		 * @see <a href="http://schema.org/legislationDateVersion">http://schema.org/legislationDateVersion</a>
		 */
		public Container.LegislationDateVersion getLegislationDateVersion();
		public void setLegislationDateVersion(Container.LegislationDateVersion legislationDateVersion);

		/**
		 * @see <a href="http://schema.org/legislationIdentifier">http://schema.org/legislationIdentifier</a>
		 */
		public Container.LegislationIdentifier getLegislationIdentifier();
		public void setLegislationIdentifier(Container.LegislationIdentifier legislationIdentifier);

		/**
		 * @see <a href="http://schema.org/legislationJurisdiction">http://schema.org/legislationJurisdiction</a>
		 */
		public Container.LegislationJurisdiction getLegislationJurisdiction();
		public void setLegislationJurisdiction(Container.LegislationJurisdiction legislationJurisdiction);

		/**
		 * @see <a href="http://schema.org/legislationLegalForce">http://schema.org/legislationLegalForce</a>
		 */
		public Container.LegislationLegalForce getLegislationLegalForce();
		public void setLegislationLegalForce(Container.LegislationLegalForce legislationLegalForce);

		/**
		 * @see <a href="http://schema.org/legislationPassedBy">http://schema.org/legislationPassedBy</a>
		 */
		public Container.LegislationPassedBy getLegislationPassedBy();
		public void setLegislationPassedBy(Container.LegislationPassedBy legislationPassedBy);

		/**
		 * @see <a href="http://schema.org/legislationResponsible">http://schema.org/legislationResponsible</a>
		 */
		public Container.LegislationResponsible getLegislationResponsible();
		public void setLegislationResponsible(Container.LegislationResponsible legislationResponsible);

		/**
		 * @see <a href="http://schema.org/legislationTransposes">http://schema.org/legislationTransposes</a>
		 */
		public Container.LegislationTransposes getLegislationTransposes();
		public void setLegislationTransposes(Container.LegislationTransposes legislationTransposes);

		/**
		 * @see <a href="http://schema.org/legislationType">http://schema.org/legislationType</a>
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
	public interface LegislationObject extends Legislation, MediaObject, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/legislationLegalValue">http://schema.org/legislationLegalValue</a>
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
	public interface LibrarySystem extends NativeValueText, Organization, SchemaOrgClass {

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
	public interface LinkRole extends NativeValueText, Role, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/inLanguage">http://schema.org/inLanguage</a>
		 */
		public InLanguage getInLanguage();
		public void setInLanguage(InLanguage inLanguage);

		/**
		 * @see <a href="http://schema.org/linkRelationship">http://schema.org/linkRelationship</a>
		 */
		public Container.LinkRelationship getLinkRelationship();
		public void setLinkRelationship(Container.LinkRelationship linkRelationship);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MediaSubscription")
	@SchemaOrgLabel("MediaSubscription")
	@SchemaOrgComment(""
			+ "A subscription which allows a user to access media including audio, video,"
			+ " books, etc.")
	@CamelizedName("mediaSubscription")
	@ConstantizedName("MEDIA_SUBSCRIPTION")
	public interface MediaSubscription extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/authenticator">http://schema.org/authenticator</a>
		 */
		public Container.Authenticator getAuthenticator();
		public void setAuthenticator(Container.Authenticator authenticator);

		/**
		 * @see <a href="http://schema.org/expectsAcceptanceOf">http://schema.org/expectsAcceptanceOf</a>
		 */
		public Container.ExpectsAcceptanceOf getExpectsAcceptanceOf();
		public void setExpectsAcceptanceOf(Container.ExpectsAcceptanceOf expectsAcceptanceOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MonetaryAmountDistribution")
	@SchemaOrgLabel("MonetaryAmountDistribution")
	@SchemaOrgComment(""
			+ "A statistical distribution of monetary amounts.")
	@CamelizedName("monetaryAmountDistribution")
	@ConstantizedName("MONETARY_AMOUNT_DISTRIBUTION")
	public interface MonetaryAmountDistribution extends NativeValueText, QuantitativeValue, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/currency">http://schema.org/currency</a>
		 */
		public Container.Currency getCurrency();
		public void setCurrency(Container.Currency currency);

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
	public interface MoneyTransfer extends NativeValueText, SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/amount">http://schema.org/amount</a>
		 */
		public Amount getAmount();
		public void setAmount(Amount amount);

		/**
		 * @see <a href="http://schema.org/beneficiaryBank">http://schema.org/beneficiaryBank</a>
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
	public interface MortgageLoan extends LoanOrCredit, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/domiciledMortgage">http://schema.org/domiciledMortgage</a>
		 */
		public Container.DomiciledMortgage getDomiciledMortgage();
		public void setDomiciledMortgage(Container.DomiciledMortgage domiciledMortgage);

		/**
		 * @see <a href="http://schema.org/loanMortgageMandateAmount">http://schema.org/loanMortgageMandateAmount</a>
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
	public interface NewsMediaOrganization extends NativeValueText, Organization, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/actionableFeedbackPolicy">http://schema.org/actionableFeedbackPolicy</a>
		 */
		public Container.ActionableFeedbackPolicy getActionableFeedbackPolicy();
		public void setActionableFeedbackPolicy(Container.ActionableFeedbackPolicy actionableFeedbackPolicy);

		/**
		 * @see <a href="http://schema.org/correctionsPolicy">http://schema.org/correctionsPolicy</a>
		 */
		public Container.CorrectionsPolicy getCorrectionsPolicy();
		public void setCorrectionsPolicy(Container.CorrectionsPolicy correctionsPolicy);

		/**
		 * @see <a href="http://schema.org/diversityPolicy">http://schema.org/diversityPolicy</a>
		 */
		public Container.DiversityPolicy getDiversityPolicy();
		public void setDiversityPolicy(Container.DiversityPolicy diversityPolicy);

		/**
		 * @see <a href="http://schema.org/diversityStaffingReport">http://schema.org/diversityStaffingReport</a>
		 */
		public Container.DiversityStaffingReport getDiversityStaffingReport();
		public void setDiversityStaffingReport(Container.DiversityStaffingReport diversityStaffingReport);

		/**
		 * @see <a href="http://schema.org/ethicsPolicy">http://schema.org/ethicsPolicy</a>
		 */
		public Container.EthicsPolicy getEthicsPolicy();
		public void setEthicsPolicy(Container.EthicsPolicy ethicsPolicy);

		/**
		 * @see <a href="http://schema.org/masthead">http://schema.org/masthead</a>
		 */
		public Container.Masthead getMasthead();
		public void setMasthead(Container.Masthead masthead);

		/**
		 * @see <a href="http://schema.org/missionCoveragePrioritiesPolicy">http://schema.org/missionCoveragePrioritiesPolicy</a>
		 */
		public Container.MissionCoveragePrioritiesPolicy getMissionCoveragePrioritiesPolicy();
		public void setMissionCoveragePrioritiesPolicy(Container.MissionCoveragePrioritiesPolicy missionCoveragePrioritiesPolicy);

		/**
		 * @see <a href="http://schema.org/noBylinesPolicy">http://schema.org/noBylinesPolicy</a>
		 */
		public Container.NoBylinesPolicy getNoBylinesPolicy();
		public void setNoBylinesPolicy(Container.NoBylinesPolicy noBylinesPolicy);

		/**
		 * @see <a href="http://schema.org/ownershipFundingInfo">http://schema.org/ownershipFundingInfo</a>
		 */
		public Container.OwnershipFundingInfo getOwnershipFundingInfo();
		public void setOwnershipFundingInfo(Container.OwnershipFundingInfo ownershipFundingInfo);

		/**
		 * @see <a href="http://schema.org/unnamedSourcesPolicy">http://schema.org/unnamedSourcesPolicy</a>
		 */
		public Container.UnnamedSourcesPolicy getUnnamedSourcesPolicy();
		public void setUnnamedSourcesPolicy(Container.UnnamedSourcesPolicy unnamedSourcesPolicy);

		/**
		 * @see <a href="http://schema.org/verificationFactCheckingPolicy">http://schema.org/verificationFactCheckingPolicy</a>
		 */
		public Container.VerificationFactCheckingPolicy getVerificationFactCheckingPolicy();
		public void setVerificationFactCheckingPolicy(Container.VerificationFactCheckingPolicy verificationFactCheckingPolicy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Occupation")
	@SchemaOrgLabel("Occupation")
	@SchemaOrgComment(""
			+ "A profession, may involve prolonged training and/or a formal qualification.")
	@CamelizedName("occupation")
	@ConstantizedName("OCCUPATION")
	public interface Occupation extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/educationRequirements">http://schema.org/educationRequirements</a>
		 */
		public Container.EducationRequirements getEducationRequirements();
		public void setEducationRequirements(Container.EducationRequirements educationRequirements);

		/**
		 * @see <a href="http://schema.org/estimatedSalary">http://schema.org/estimatedSalary</a>
		 */
		public Container.EstimatedSalary getEstimatedSalary();
		public void setEstimatedSalary(Container.EstimatedSalary estimatedSalary);

		/**
		 * @see <a href="http://schema.org/experienceRequirements">http://schema.org/experienceRequirements</a>
		 */
		public Container.ExperienceRequirements getExperienceRequirements();
		public void setExperienceRequirements(Container.ExperienceRequirements experienceRequirements);

		/**
		 * @see <a href="http://schema.org/occupationLocation">http://schema.org/occupationLocation</a>
		 */
		public Container.OccupationLocation getOccupationLocation();
		public void setOccupationLocation(Container.OccupationLocation occupationLocation);

		/**
		 * @see <a href="http://schema.org/occupationalCategory">http://schema.org/occupationalCategory</a>
		 */
		public Container.OccupationalCategory getOccupationalCategory();
		public void setOccupationalCategory(Container.OccupationalCategory occupationalCategory);

		/**
		 * @see <a href="http://schema.org/qualifications">http://schema.org/qualifications</a>
		 */
		public Container.Qualifications getQualifications();
		public void setQualifications(Container.Qualifications qualifications);

		/**
		 * @see <a href="http://schema.org/responsibilities">http://schema.org/responsibilities</a>
		 */
		public Container.Responsibilities getResponsibilities();
		public void setResponsibilities(Container.Responsibilities responsibilities);

		/**
		 * @see <a href="http://schema.org/skills">http://schema.org/skills</a>
		 */
		public Container.Skills getSkills();
		public void setSkills(Container.Skills skills);

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
	public interface OpinionNewsArticle extends NativeValueText, NewsArticle, SchemaOrgClass {

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
	public interface PreOrderAction extends NativeValueText, SchemaOrgClass, TradeAction {

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
	public interface PublicToilet extends CivicStructure, NativeValueText, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/QuantitativeValueDistribution")
	@SchemaOrgLabel("QuantitativeValueDistribution")
	@SchemaOrgComment("A statistical distribution of values.")
	@CamelizedName("quantitativeValueDistribution")
	@ConstantizedName("QUANTITATIVE_VALUE_DISTRIBUTION")
	public interface QuantitativeValueDistribution extends NativeValueText, QuantitativeValue, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/median">http://schema.org/median</a>
		 */
		public Container.Median getMedian();
		public void setMedian(Container.Median median);

		/**
		 * @see <a href="http://schema.org/percentile10">http://schema.org/percentile10</a>
		 */
		public Container.Percentile10 getPercentile10();
		public void setPercentile10(Container.Percentile10 percentile10);

		/**
		 * @see <a href="http://schema.org/percentile25">http://schema.org/percentile25</a>
		 */
		public Container.Percentile25 getPercentile25();
		public void setPercentile25(Container.Percentile25 percentile25);

		/**
		 * @see <a href="http://schema.org/percentile75">http://schema.org/percentile75</a>
		 */
		public Container.Percentile75 getPercentile75();
		public void setPercentile75(Container.Percentile75 percentile75);

		/**
		 * @see <a href="http://schema.org/percentile90">http://schema.org/percentile90</a>
		 */
		public Container.Percentile90 getPercentile90();
		public void setPercentile90(Container.Percentile90 percentile90);

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
	public interface Quotation extends CreativeWork, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/spokenByCharacter">http://schema.org/spokenByCharacter</a>
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
	public interface RepaymentSpecification extends NativeValueText, SchemaOrgClass, StructuredValue {

		/**
		 * @see <a href="http://schema.org/downPayment">http://schema.org/downPayment</a>
		 */
		public Container.DownPayment getDownPayment();
		public void setDownPayment(Container.DownPayment downPayment);

		/**
		 * @see <a href="http://schema.org/earlyPrepaymentPenalty">http://schema.org/earlyPrepaymentPenalty</a>
		 */
		public Container.EarlyPrepaymentPenalty getEarlyPrepaymentPenalty();
		public void setEarlyPrepaymentPenalty(Container.EarlyPrepaymentPenalty earlyPrepaymentPenalty);

		/**
		 * @see <a href="http://schema.org/loanPaymentAmount">http://schema.org/loanPaymentAmount</a>
		 */
		public Container.LoanPaymentAmount getLoanPaymentAmount();
		public void setLoanPaymentAmount(Container.LoanPaymentAmount loanPaymentAmount);

		/**
		 * @see <a href="http://schema.org/loanPaymentFrequency">http://schema.org/loanPaymentFrequency</a>
		 */
		public Container.LoanPaymentFrequency getLoanPaymentFrequency();
		public void setLoanPaymentFrequency(Container.LoanPaymentFrequency loanPaymentFrequency);

		/**
		 * @see <a href="http://schema.org/numberOfLoanPayments">http://schema.org/numberOfLoanPayments</a>
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
			+ " conventions.<br/><br/>\n\nIn practice many news publishers produce a wide"
			+ " variety of article types, many of which might be considered a <a"
			+ " class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a> but"
			+ " not a <a class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a>. For"
			+ " example, opinion pieces, reviews, analysis, sponsored or satirical articles, or"
			+ " articles that combine several of these elements.<br/><br/>\n\nThe <a"
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
			+ " typically expressed elsewhere.<br/><br/>\n\nA <a class=\"localLink\""
			+ " href=\"http://schema.org/ReportageNewsArticle\">ReportageNewsArticle</a> which"
			+ " goes deeper into analysis can also be marked with an additional type of <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/AnalysisNewsArticle\">AnalysisNewsArticle</a>.")
	@CamelizedName("reportageNewsArticle")
	@ConstantizedName("REPORTAGE_NEWS_ARTICLE")
	public interface ReportageNewsArticle extends NativeValueText, NewsArticle, SchemaOrgClass {

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
	public interface ReviewNewsArticle extends CriticReview, NativeValueText, NewsArticle, SchemaOrgClass {

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
	public interface SatiricalArticle extends Article, NativeValueText, SchemaOrgClass {

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
	public interface Schedule extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/byDay">http://schema.org/byDay</a>
		 */
		public Container.ByDay getByDay();
		public void setByDay(Container.ByDay byDay);

		/**
		 * @see <a href="http://schema.org/byMonth">http://schema.org/byMonth</a>
		 */
		public Container.ByMonth getByMonth();
		public void setByMonth(Container.ByMonth byMonth);

		/**
		 * @see <a href="http://schema.org/byMonthDay">http://schema.org/byMonthDay</a>
		 */
		public Container.ByMonthDay getByMonthDay();
		public void setByMonthDay(Container.ByMonthDay byMonthDay);

		/**
		 * @see <a href="http://schema.org/eventSchedule">http://schema.org/eventSchedule</a>
		 */
		public Container.EventSchedule getEventSchedule();
		public void setEventSchedule(Container.EventSchedule eventSchedule);

		/**
		 * @see <a href="http://schema.org/exceptDate">http://schema.org/exceptDate</a>
		 */
		public Container.ExceptDate getExceptDate();
		public void setExceptDate(Container.ExceptDate exceptDate);

		/**
		 * @see <a href="http://schema.org/repeatCount">http://schema.org/repeatCount</a>
		 */
		public Container.RepeatCount getRepeatCount();
		public void setRepeatCount(Container.RepeatCount repeatCount);

		/**
		 * @see <a href="http://schema.org/repeatFrequency">http://schema.org/repeatFrequency</a>
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
	public interface SpeakableSpecification extends Intangible, NativeValueText, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/cssSelector">http://schema.org/cssSelector</a>
		 */
		public Container.CssSelector getCssSelector();
		public void setCssSelector(Container.CssSelector cssSelector);

		/**
		 * @see <a href="http://schema.org/xpath">http://schema.org/xpath</a>
		 */
		public Container.Xpath getXpath();
		public void setXpath(Container.Xpath xpath);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TouristDestination")
	@SchemaOrgLabel("TouristDestination")
	@SchemaOrgComment(""
			+ "A tourist destination. In principle any <a class=\"localLink\""
			+ " href=\"http://schema.org/Place\">Place</a> can be a <a class=\"localLink\""
			+ " href=\"http://schema.org/TouristDestination\">TouristDestination</a> from a <a"
			+ " class=\"localLink\" href=\"http://schema.org/City\">City</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Region\">Region</a> or <a"
			+ " class=\"localLink\" href=\"http://schema.org/Country\">Country</a> to an <a"
			+ " class=\"localLink\" href=\"http://schema.org/AmusementPark\">AmusementPark</a>"
			+ " or <a class=\"localLink\" href=\"http://schema.org/Hotel\">Hotel</a>. This Type"
			+ " can be used on its own to describe a general <a class=\"localLink\""
			+ " href=\"http://schema.org/TourstDestination\">TourstDestination</a>, or be used"
			+ " as an <a class=\"localLink\""
			+ " href=\"http://schema.org/additionalType\">additionalType</a> to add tourist"
			+ " relevant properties to any other <a class=\"localLink\""
			+ " href=\"http://schema.org/Place\">Place</a>.  A <a class=\"localLink\""
			+ " href=\"http://schema.org/TouristDestination\">TouristDestination</a> is defined"
			+ " as a <a class=\"localLink\" href=\"http://schema.org/Place\">Place</a> that"
			+ " contains, or is colocated with, one or more <a class=\"localLink\""
			+ " href=\"http://schema.org/TourstAttractions\">TourstAttractions</a>, often"
			+ " linked by a similar theme or interest to a particular <a class=\"localLink\""
			+ " href=\"http://schema.org/touristType\">touristType</a>. The <a"
			+ " href=\"http://www2.unwto.org/\">UNWTO</a> defines Destination (main destination"
			+ " of a tourism trip) as the place visited that is central to the decision to take"
			+ " the trip.\n  (See examples below).")
	@CamelizedName("touristDestination")
	@ConstantizedName("TOURIST_DESTINATION")
	public interface TouristDestination extends NativeValueText, Place, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/includesAttraction">http://schema.org/includesAttraction</a>
		 */
		public Container.IncludesAttraction getIncludesAttraction();
		public void setIncludesAttraction(Container.IncludesAttraction includesAttraction);

		/**
		 * @see <a href="http://schema.org/touristType">http://schema.org/touristType</a>
		 */
		public TouristType getTouristType();
		public void setTouristType(TouristType touristType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TouristTrip")
	@SchemaOrgLabel("TouristTrip")
	@SchemaOrgComment(""
			+ "A tourist trip. A created itinerary of visits to one or more places of interest"
			+ " (<a class=\"localLink\""
			+ " href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>/<a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/TouristDestination\">TouristDestination</a>) often"
			+ " linked by a similar theme, geographic area, or interest to a particular <a"
			+ " class=\"localLink\" href=\"http://schema.org/touristType\">touristType</a>. The"
			+ " <a href=\"http://www2.unwto.org/\">UNWTO</a> defines tourism trip as the Trip"
			+ " taken by visitors.\n  (See examples below).")
	@CamelizedName("touristTrip")
	@ConstantizedName("TOURIST_TRIP")
	public interface TouristTrip extends NativeValueText, SchemaOrgClass, Trip {

		/**
		 * @see <a href="http://schema.org/touristType">http://schema.org/touristType</a>
		 */
		public TouristType getTouristType();
		public void setTouristType(TouristType touristType);

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
	public interface UserReview extends NativeValueText, Review, SchemaOrgClass {

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
	public interface WebAPI extends NativeValueText, SchemaOrgClass, Service {

		/**
		 * @see <a href="http://schema.org/documentation">http://schema.org/documentation</a>
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
	public interface WorkersUnion extends NativeValueText, Organization, SchemaOrgClass {

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
	public interface XPathType extends NativeValueText, SchemaOrgClass, Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
