package org.kyojo.schemaOrg.m3n3.core;

import java.util.List;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgProperty;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.BedType;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/about")
	@SchemaOrgLabel("about")
	@SchemaOrgComment("The subject matter of the content.")
	@CamelizedName("about")
	@ConstantizedName("ABOUT")
	public interface About extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acceptedAnswer")
	@SchemaOrgLabel("acceptedAnswer")
	@SchemaOrgComment(""
			+ "The answer that has been accepted as best, typically on a Question/Answer site."
			+ " Sites vary in their selection mechanisms, e.g. drawing on community opinion"
			+ " and/or the view of the Question author.")
	@CamelizedName("acceptedAnswer")
	@ConstantizedName("ACCEPTED_ANSWER")
	public interface AcceptedAnswer extends SchemaOrgProperty, SuggestedAnswer {

		/**
		 * uri: http://schema.org/Answer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Answer
		 */
		public Clazz.Answer getAnswer();
		public void setAnswer(Clazz.Answer answer);
		public List<Clazz.Answer> getAnswerList();
		public void setAnswerList(List<Clazz.Answer> answerList);
		public boolean hasAnswer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acceptedOffer")
	@SchemaOrgLabel("acceptedOffer")
	@SchemaOrgComment(""
			+ "The offer(s) -- e.g., product, quantity and price combinations -- included in"
			+ " the order.")
	@CamelizedName("acceptedOffer")
	@ConstantizedName("ACCEPTED_OFFER")
	public interface AcceptedOffer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Offer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Offer
		 */
		public Clazz.Offer getOffer();
		public void setOffer(Clazz.Offer offer);
		public List<Clazz.Offer> getOfferList();
		public void setOfferList(List<Clazz.Offer> offerList);
		public boolean hasOffer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acceptedPaymentMethod")
	@SchemaOrgLabel("acceptedPaymentMethod")
	@SchemaOrgComment(""
			+ "The payment method(s) accepted by seller for this offer.")
	@CamelizedName("acceptedPaymentMethod")
	@ConstantizedName("ACCEPTED_PAYMENT_METHOD")
	public interface AcceptedPaymentMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/LoanOrCredit
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.LoanOrCredit
		 */
		public Clazz.LoanOrCredit getLoanOrCredit();
		public void setLoanOrCredit(Clazz.LoanOrCredit loanOrCredit);
		public List<Clazz.LoanOrCredit> getLoanOrCreditList();
		public void setLoanOrCreditList(List<Clazz.LoanOrCredit> loanOrCreditList);
		public boolean hasLoanOrCredit();

		/**
		 * uri: http://schema.org/PaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentMethod
		 */
		public Clazz.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Clazz.PaymentMethod paymentMethod);
		public List<Clazz.PaymentMethod> getPaymentMethodList();
		public void setPaymentMethodList(List<Clazz.PaymentMethod> paymentMethodList);
		public boolean hasPaymentMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acceptsReservations")
	@SchemaOrgLabel("acceptsReservations")
	@SchemaOrgComment(""
			+ "Indicates whether a FoodEstablishment accepts reservations. Values can be"
			+ " Boolean, an URL at which reservations can be made or (for backwards"
			+ " compatibility) the strings <code>Yes</code> or <code>No</code>.")
	@CamelizedName("acceptsReservations")
	@ConstantizedName("ACCEPTS_RESERVATIONS")
	public interface AcceptsReservations extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessCode")
	@SchemaOrgLabel("accessCode")
	@SchemaOrgComment(""
			+ "Password, PIN, or access code needed for delivery (e.g. from a locker).")
	@CamelizedName("accessCode")
	@ConstantizedName("ACCESS_CODE")
	public interface AccessCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessMode")
	@SchemaOrgLabel("accessMode")
	@SchemaOrgComment(""
			+ "The human sensory perceptual system or cognitive faculty through which a person"
			+ " may process or perceive information. Expected values include: auditory,"
			+ " tactile, textual, visual, colorDependent, chartOnVisual, chemOnVisual,"
			+ " diagramOnVisual, mathOnVisual, musicOnVisual, textOnVisual.")
	@CamelizedName("accessMode")
	@ConstantizedName("ACCESS_MODE")
	public interface AccessMode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessModeSufficient")
	@SchemaOrgLabel("accessModeSufficient")
	@SchemaOrgComment(""
			+ "A list of single or combined accessModes that are sufficient to understand all"
			+ " the intellectual content of a resource. Expected values include:  auditory,"
			+ " tactile, textual, visual.")
	@CamelizedName("accessModeSufficient")
	@ConstantizedName("ACCESS_MODE_SUFFICIENT")
	public interface AccessModeSufficient extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessibilityAPI")
	@SchemaOrgLabel("accessibilityAPI")
	@SchemaOrgComment(""
			+ "Indicates that the resource is compatible with the referenced accessibility API"
			+ " (<a href=\"http://www.w3.org/wiki/WebSchemas/Accessibility\">WebSchemas wiki"
			+ " lists possible values</a>).")
	@CamelizedName("accessibilityAPI")
	@ConstantizedName("ACCESSIBILITY_API")
	public interface AccessibilityAPI extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessibilityControl")
	@SchemaOrgLabel("accessibilityControl")
	@SchemaOrgComment(""
			+ "Identifies input methods that are sufficient to fully control the described"
			+ " resource (<a"
			+ " href=\"http://www.w3.org/wiki/WebSchemas/Accessibility\">WebSchemas wiki lists"
			+ " possible values</a>).")
	@CamelizedName("accessibilityControl")
	@ConstantizedName("ACCESSIBILITY_CONTROL")
	public interface AccessibilityControl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessibilityFeature")
	@SchemaOrgLabel("accessibilityFeature")
	@SchemaOrgComment(""
			+ "Content features of the resource, such as accessible media, alternatives and"
			+ " supported enhancements for accessibility (<a"
			+ " href=\"http://www.w3.org/wiki/WebSchemas/Accessibility\">WebSchemas wiki lists"
			+ " possible values</a>).")
	@CamelizedName("accessibilityFeature")
	@ConstantizedName("ACCESSIBILITY_FEATURE")
	public interface AccessibilityFeature extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessibilityHazard")
	@SchemaOrgLabel("accessibilityHazard")
	@SchemaOrgComment(""
			+ "A characteristic of the described resource that is physiologically dangerous to"
			+ " some users. Related to WCAG 2.0 guideline 2.3 (<a"
			+ " href=\"http://www.w3.org/wiki/WebSchemas/Accessibility\">WebSchemas wiki lists"
			+ " possible values</a>).")
	@CamelizedName("accessibilityHazard")
	@ConstantizedName("ACCESSIBILITY_HAZARD")
	public interface AccessibilityHazard extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accessibilitySummary")
	@SchemaOrgLabel("accessibilitySummary")
	@SchemaOrgComment(""
			+ "A human-readable summary of specific accessibility features or deficiencies,"
			+ " consistent with the other accessibility metadata but expressing subtleties such"
			+ " as \"short descriptions are present but long descriptions will be needed for"
			+ " non-visual users\" or \"short descriptions are present and no long descriptions"
			+ " are needed.\"")
	@CamelizedName("accessibilitySummary")
	@ConstantizedName("ACCESSIBILITY_SUMMARY")
	public interface AccessibilitySummary extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accountId")
	@SchemaOrgLabel("accountId")
	@SchemaOrgComment(""
			+ "The identifier for the account the payment will be applied to.")
	@CamelizedName("accountId")
	@ConstantizedName("ACCOUNT_ID")
	public interface AccountId extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/accountablePerson")
	@SchemaOrgLabel("accountablePerson")
	@SchemaOrgComment(""
			+ "Specifies the Person that is legally accountable for the CreativeWork.")
	@CamelizedName("accountablePerson")
	@ConstantizedName("ACCOUNTABLE_PERSON")
	public interface AccountablePerson extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/acquiredFrom")
	@SchemaOrgLabel("acquiredFrom")
	@SchemaOrgComment(""
			+ "The organization or person from which the product was acquired.")
	@CamelizedName("acquiredFrom")
	@ConstantizedName("ACQUIRED_FROM")
	public interface AcquiredFrom extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionApplication")
	@SchemaOrgLabel("actionApplication")
	@SchemaOrgComment(""
			+ "An application that can complete the request.")
	@CamelizedName("actionApplication")
	@ConstantizedName("ACTION_APPLICATION")
	public interface ActionApplication extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SoftwareApplication
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareApplication
		 */
		public Clazz.SoftwareApplication getSoftwareApplication();
		public void setSoftwareApplication(Clazz.SoftwareApplication softwareApplication);
		public List<Clazz.SoftwareApplication> getSoftwareApplicationList();
		public void setSoftwareApplicationList(List<Clazz.SoftwareApplication> softwareApplicationList);
		public boolean hasSoftwareApplication();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionOption")
	@SchemaOrgLabel("actionOption")
	@SchemaOrgComment(""
			+ "A sub property of object. The options subject to this action.")
	@CamelizedName("actionOption")
	@ConstantizedName("ACTION_OPTION")
	public interface ActionOption extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionPlatform")
	@SchemaOrgLabel("actionPlatform")
	@SchemaOrgComment(""
			+ "The high level platform(s) where the Action can be performed for the given URL."
			+ " To specify a specific application or operating system instance, use"
			+ " actionApplication.")
	@CamelizedName("actionPlatform")
	@ConstantizedName("ACTION_PLATFORM")
	public interface ActionPlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actionStatus")
	@SchemaOrgLabel("actionStatus")
	@SchemaOrgComment(""
			+ "Indicates the current disposition of the Action.")
	@CamelizedName("actionStatus")
	@ConstantizedName("ACTION_STATUS")
	public interface ActionStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ActionStatusType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ActionStatusType
		 */
		public Clazz.ActionStatusType getActionStatusType();
		public void setActionStatusType(Clazz.ActionStatusType actionStatusType);
		public List<Clazz.ActionStatusType> getActionStatusTypeList();
		public void setActionStatusTypeList(List<Clazz.ActionStatusType> actionStatusTypeList);
		public boolean hasActionStatusType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/actor")
	@SchemaOrgLabel("actor")
	@SchemaOrgComment(""
			+ "An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can"
			+ " be associated with individual items or with a series, episode, clip.")
	@CamelizedName("actor")
	@ConstantizedName("ACTOR")
	public interface Actor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/addOn")
	@SchemaOrgLabel("addOn")
	@SchemaOrgComment(""
			+ "An additional offer that can only be obtained in combination with the first base"
			+ " offer (e.g. supplements and extensions that are available for a surcharge).")
	@CamelizedName("addOn")
	@ConstantizedName("ADD_ON")
	public interface AddOn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Offer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Offer
		 */
		public Clazz.Offer getOffer();
		public void setOffer(Clazz.Offer offer);
		public List<Clazz.Offer> getOfferList();
		public void setOfferList(List<Clazz.Offer> offerList);
		public boolean hasOffer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalName")
	@SchemaOrgLabel("additionalName")
	@SchemaOrgComment(""
			+ "An additional name for a Person, can be used for a middle name.")
	@CamelizedName("additionalName")
	@ConstantizedName("ADDITIONAL_NAME")
	public interface AdditionalName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalNumberOfGuests")
	@SchemaOrgLabel("additionalNumberOfGuests")
	@SchemaOrgComment(""
			+ "If responding yes, the number of guests who will attend in addition to the"
			+ " invitee.")
	@CamelizedName("additionalNumberOfGuests")
	@ConstantizedName("ADDITIONAL_NUMBER_OF_GUESTS")
	public interface AdditionalNumberOfGuests extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalProperty")
	@SchemaOrgLabel("additionalProperty")
	@SchemaOrgComment(""
			+ "A property-value pair representing an additional characteristics of the"
			+ " entitity, e.g. a product feature or another characteristic for which there is"
			+ " no matching property in schema.org.</p>\n\n<p>Note: Publishers should be aware"
			+ " that applications designed to use specific schema.org properties (e.g."
			+ " http://schema.org/width, http://schema.org/color, http://schema.org/gtin13,"
			+ " ...) will typically expect such data to be provided using those properties,"
			+ " rather than using the generic property/value mechanism.")
	@CamelizedName("additionalProperty")
	@ConstantizedName("ADDITIONAL_PROPERTY")
	public interface AdditionalProperty extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PropertyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue
		 */
		public Clazz.PropertyValue getPropertyValue();
		public void setPropertyValue(Clazz.PropertyValue propertyValue);
		public List<Clazz.PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<Clazz.PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalType")
	@SchemaOrgLabel("additionalType")
	@SchemaOrgComment(""
			+ "An additional type for the item, typically used for adding more specific types"
			+ " from external vocabularies in microdata syntax. This is a relationship between"
			+ " something and a class that the thing is in. In RDFa syntax, it is better to use"
			+ " the native RDFa syntax - the 'typeof' attribute - for multiple types."
			+ " Schema.org tools may have only weaker understanding of extra types, in"
			+ " particular those defined externally.")
	@CamelizedName("additionalType")
	@ConstantizedName("ADDITIONAL_TYPE")
	public interface AdditionalType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/address")
	@SchemaOrgLabel("address")
	@SchemaOrgComment("Physical address of the item.")
	@CamelizedName("address")
	@ConstantizedName("ADDRESS")
	public interface Address extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/addressCountry")
	@SchemaOrgLabel("addressCountry")
	@SchemaOrgComment(""
			+ "The country. For example, USA. You can also provide the two-letter <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_3166-1\">ISO 3166-1 alpha-2 country"
			+ " code</a>.")
	@CamelizedName("addressCountry")
	@ConstantizedName("ADDRESS_COUNTRY")
	public interface AddressCountry extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Country
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Country
		 */
		public Clazz.Country getCountry();
		public void setCountry(Clazz.Country country);
		public List<Clazz.Country> getCountryList();
		public void setCountryList(List<Clazz.Country> countryList);
		public boolean hasCountry();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/addressLocality")
	@SchemaOrgLabel("addressLocality")
	@SchemaOrgComment(""
			+ "The locality. For example, Mountain View.")
	@CamelizedName("addressLocality")
	@ConstantizedName("ADDRESS_LOCALITY")
	public interface AddressLocality extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/addressRegion")
	@SchemaOrgLabel("addressRegion")
	@SchemaOrgComment("The region. For example, CA.")
	@CamelizedName("addressRegion")
	@ConstantizedName("ADDRESS_REGION")
	public interface AddressRegion extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/advanceBookingRequirement")
	@SchemaOrgLabel("advanceBookingRequirement")
	@SchemaOrgComment(""
			+ "The amount of time that is required between accepting the offer and the actual"
			+ " usage of the resource or service.")
	@CamelizedName("advanceBookingRequirement")
	@ConstantizedName("ADVANCE_BOOKING_REQUIREMENT")
	public interface AdvanceBookingRequirement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/affiliation")
	@SchemaOrgLabel("affiliation")
	@SchemaOrgComment(""
			+ "An organization that this person is affiliated with. For example, a"
			+ " school/university, a club, or a team.")
	@CamelizedName("affiliation")
	@ConstantizedName("AFFILIATION")
	public interface Affiliation extends MemberOf, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/afterMedia")
	@SchemaOrgLabel("afterMedia")
	@SchemaOrgComment(""
			+ "A media object representing the circumstances after performing this direction.")
	@CamelizedName("afterMedia")
	@ConstantizedName("AFTER_MEDIA")
	public interface AfterMedia extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MediaObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject
		 */
		public Clazz.MediaObject getMediaObject();
		public void setMediaObject(Clazz.MediaObject mediaObject);
		public List<Clazz.MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<Clazz.MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/agent")
	@SchemaOrgLabel("agent")
	@SchemaOrgComment(""
			+ "The direct performer or driver of the action (animate or inanimate). e.g."
			+ " <em>John</em> wrote a book.")
	@CamelizedName("agent")
	@ConstantizedName("AGENT")
	public interface Agent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/aggregateRating")
	@SchemaOrgLabel("aggregateRating")
	@SchemaOrgComment(""
			+ "The overall rating, based on a collection of reviews or ratings, of the item.")
	@CamelizedName("aggregateRating")
	@ConstantizedName("AGGREGATE_RATING")
	public interface AggregateRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/AggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AggregateRating
		 */
		public Clazz.AggregateRating getAggregateRating();
		public void setAggregateRating(Clazz.AggregateRating aggregateRating);
		public List<Clazz.AggregateRating> getAggregateRatingList();
		public void setAggregateRatingList(List<Clazz.AggregateRating> aggregateRatingList);
		public boolean hasAggregateRating();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/aircraft")
	@SchemaOrgLabel("aircraft")
	@SchemaOrgComment(""
			+ "The kind of aircraft (e.g., \"Boeing 747\").")
	@CamelizedName("aircraft")
	@ConstantizedName("AIRCRAFT")
	public interface Aircraft extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Vehicle
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Vehicle
		 */
		public Clazz.Vehicle getVehicle();
		public void setVehicle(Clazz.Vehicle vehicle);
		public List<Clazz.Vehicle> getVehicleList();
		public void setVehicleList(List<Clazz.Vehicle> vehicleList);
		public boolean hasVehicle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/album")
	@SchemaOrgLabel("album")
	@SchemaOrgComment("A music album.")
	@CamelizedName("album")
	@ConstantizedName("ALBUM")
	public interface Album extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicAlbum
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbum
		 */
		public Clazz.MusicAlbum getMusicAlbum();
		public void setMusicAlbum(Clazz.MusicAlbum musicAlbum);
		public List<Clazz.MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<Clazz.MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/albumProductionType")
	@SchemaOrgLabel("albumProductionType")
	@SchemaOrgComment(""
			+ "Classification of the album by it's type of content: soundtrack, live album,"
			+ " studio album, etc.")
	@CamelizedName("albumProductionType")
	@ConstantizedName("ALBUM_PRODUCTION_TYPE")
	public interface AlbumProductionType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicAlbumProductionType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbumProductionType
		 */
		public Clazz.MusicAlbumProductionType getMusicAlbumProductionType();
		public void setMusicAlbumProductionType(Clazz.MusicAlbumProductionType musicAlbumProductionType);
		public List<Clazz.MusicAlbumProductionType> getMusicAlbumProductionTypeList();
		public void setMusicAlbumProductionTypeList(List<Clazz.MusicAlbumProductionType> musicAlbumProductionTypeList);
		public boolean hasMusicAlbumProductionType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/albumRelease")
	@SchemaOrgLabel("albumRelease")
	@SchemaOrgComment("A release of this album.")
	@CamelizedName("albumRelease")
	@ConstantizedName("ALBUM_RELEASE")
	public interface AlbumRelease extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicRelease
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicRelease
		 */
		public Clazz.MusicRelease getMusicRelease();
		public void setMusicRelease(Clazz.MusicRelease musicRelease);
		public List<Clazz.MusicRelease> getMusicReleaseList();
		public void setMusicReleaseList(List<Clazz.MusicRelease> musicReleaseList);
		public boolean hasMusicRelease();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/albumReleaseType")
	@SchemaOrgLabel("albumReleaseType")
	@SchemaOrgComment(""
			+ "The kind of release which this album is: single, EP or album.")
	@CamelizedName("albumReleaseType")
	@ConstantizedName("ALBUM_RELEASE_TYPE")
	public interface AlbumReleaseType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicAlbumReleaseType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbumReleaseType
		 */
		public Clazz.MusicAlbumReleaseType getMusicAlbumReleaseType();
		public void setMusicAlbumReleaseType(Clazz.MusicAlbumReleaseType musicAlbumReleaseType);
		public List<Clazz.MusicAlbumReleaseType> getMusicAlbumReleaseTypeList();
		public void setMusicAlbumReleaseTypeList(List<Clazz.MusicAlbumReleaseType> musicAlbumReleaseTypeList);
		public boolean hasMusicAlbumReleaseType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alignmentType")
	@SchemaOrgLabel("alignmentType")
	@SchemaOrgComment(""
			+ "A category of alignment between the learning resource and the framework node."
			+ " Recommended values include: 'assesses', 'teaches', 'requires',"
			+ " 'textComplexity', 'readingLevel', 'educationalSubject', and 'educationalLevel'.")
	@CamelizedName("alignmentType")
	@ConstantizedName("ALIGNMENT_TYPE")
	public interface AlignmentType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alternateName")
	@SchemaOrgLabel("alternateName")
	@SchemaOrgComment("An alias for the item.")
	@CamelizedName("alternateName")
	@ConstantizedName("ALTERNATE_NAME")
	public interface AlternateName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alternativeHeadline")
	@SchemaOrgLabel("alternativeHeadline")
	@SchemaOrgComment("A secondary title of the CreativeWork.")
	@CamelizedName("alternativeHeadline")
	@ConstantizedName("ALTERNATIVE_HEADLINE")
	public interface AlternativeHeadline extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alumni")
	@SchemaOrgLabel("alumni")
	@SchemaOrgComment("Alumni of an organization.")
	@CamelizedName("alumni")
	@ConstantizedName("ALUMNI")
	public interface Alumni extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alumniOf")
	@SchemaOrgLabel("alumniOf")
	@SchemaOrgComment(""
			+ "An organization that the person is an alumni of.")
	@CamelizedName("alumniOf")
	@ConstantizedName("ALUMNI_OF")
	public interface AlumniOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/EducationalOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.EducationalOrganization
		 */
		public Clazz.EducationalOrganization getEducationalOrganization();
		public void setEducationalOrganization(Clazz.EducationalOrganization educationalOrganization);
		public List<Clazz.EducationalOrganization> getEducationalOrganizationList();
		public void setEducationalOrganizationList(List<Clazz.EducationalOrganization> educationalOrganizationList);
		public boolean hasEducationalOrganization();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/amenityFeature")
	@SchemaOrgLabel("amenityFeature")
	@SchemaOrgComment(""
			+ "An amenity feature (e.g. a characteristic or service) of the Accommodation. This"
			+ " generic property does not make a statement about whether the feature is"
			+ " included in an offer for the main accommodation or available at extra costs.")
	@CamelizedName("amenityFeature")
	@ConstantizedName("AMENITY_FEATURE")
	public interface AmenityFeature extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/LocationFeatureSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.LocationFeatureSpecification
		 */
		public Clazz.LocationFeatureSpecification getLocationFeatureSpecification();
		public void setLocationFeatureSpecification(Clazz.LocationFeatureSpecification locationFeatureSpecification);
		public List<Clazz.LocationFeatureSpecification> getLocationFeatureSpecificationList();
		public void setLocationFeatureSpecificationList(List<Clazz.LocationFeatureSpecification> locationFeatureSpecificationList);
		public boolean hasLocationFeatureSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/amount")
	@SchemaOrgLabel("amount")
	@SchemaOrgComment("The amount of money.")
	@CamelizedName("amount")
	@ConstantizedName("AMOUNT")
	public interface Amount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/amountOfThisGood")
	@SchemaOrgLabel("amountOfThisGood")
	@SchemaOrgComment(""
			+ "The quantity of the goods included in the offer.")
	@CamelizedName("amountOfThisGood")
	@ConstantizedName("AMOUNT_OF_THIS_GOOD")
	public interface AmountOfThisGood extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/annualPercentageRate")
	@SchemaOrgLabel("annualPercentageRate")
	@SchemaOrgComment(""
			+ "The annual rate that is charged for borrowing (or made by investing), expressed"
			+ " as a single percentage number that represents the actual yearly cost of funds"
			+ " over the term of a loan. This includes any fees or additional costs associated"
			+ " with the transaction.")
	@CamelizedName("annualPercentageRate")
	@ConstantizedName("ANNUAL_PERCENTAGE_RATE")
	public interface AnnualPercentageRate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/answerCount")
	@SchemaOrgLabel("answerCount")
	@SchemaOrgComment(""
			+ "The number of answers this question has received.")
	@CamelizedName("answerCount")
	@ConstantizedName("ANSWER_COUNT")
	public interface AnswerCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/applicationCategory")
	@SchemaOrgLabel("applicationCategory")
	@SchemaOrgComment(""
			+ "Type of software application, e.g. 'Game, Multimedia'.")
	@CamelizedName("applicationCategory")
	@ConstantizedName("APPLICATION_CATEGORY")
	public interface ApplicationCategory extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/applicationSubCategory")
	@SchemaOrgLabel("applicationSubCategory")
	@SchemaOrgComment(""
			+ "Subcategory of the application, e.g. 'Arcade Game'.")
	@CamelizedName("applicationSubCategory")
	@ConstantizedName("APPLICATION_SUB_CATEGORY")
	public interface ApplicationSubCategory extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/applicationSuite")
	@SchemaOrgLabel("applicationSuite")
	@SchemaOrgComment(""
			+ "The name of the application suite to which the application belongs (e.g. Excel"
			+ " belongs to Office).")
	@CamelizedName("applicationSuite")
	@ConstantizedName("APPLICATION_SUITE")
	public interface ApplicationSuite extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/appliesToDeliveryMethod")
	@SchemaOrgLabel("appliesToDeliveryMethod")
	@SchemaOrgComment(""
			+ "The delivery method(s) to which the delivery charge or payment charge"
			+ " specification applies.")
	@CamelizedName("appliesToDeliveryMethod")
	@ConstantizedName("APPLIES_TO_DELIVERY_METHOD")
	public interface AppliesToDeliveryMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryMethod
		 */
		public Clazz.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Clazz.DeliveryMethod deliveryMethod);
		public List<Clazz.DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<Clazz.DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/appliesToPaymentMethod")
	@SchemaOrgLabel("appliesToPaymentMethod")
	@SchemaOrgComment(""
			+ "The payment method(s) to which the payment charge specification applies.")
	@CamelizedName("appliesToPaymentMethod")
	@ConstantizedName("APPLIES_TO_PAYMENT_METHOD")
	public interface AppliesToPaymentMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentMethod
		 */
		public Clazz.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Clazz.PaymentMethod paymentMethod);
		public List<Clazz.PaymentMethod> getPaymentMethodList();
		public void setPaymentMethodList(List<Clazz.PaymentMethod> paymentMethodList);
		public boolean hasPaymentMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/areaServed")
	@SchemaOrgLabel("areaServed")
	@SchemaOrgComment(""
			+ "The geographic area where a service or offered item is provided.")
	@CamelizedName("areaServed")
	@ConstantizedName("AREA_SERVED")
	public interface AreaServed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/AdministrativeArea
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AdministrativeArea
		 */
		public Clazz.AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(Clazz.AdministrativeArea administrativeArea);
		public List<Clazz.AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<Clazz.AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		/**
		 * uri: http://schema.org/GeoShape
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoShape
		 */
		public Clazz.GeoShape getGeoShape();
		public void setGeoShape(Clazz.GeoShape geoShape);
		public List<Clazz.GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<Clazz.GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalAirport")
	@SchemaOrgLabel("arrivalAirport")
	@SchemaOrgComment(""
			+ "The airport where the flight terminates.")
	@CamelizedName("arrivalAirport")
	@ConstantizedName("ARRIVAL_AIRPORT")
	public interface ArrivalAirport extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Airport
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Airport
		 */
		public Clazz.Airport getAirport();
		public void setAirport(Clazz.Airport airport);
		public List<Clazz.Airport> getAirportList();
		public void setAirportList(List<Clazz.Airport> airportList);
		public boolean hasAirport();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalBusStop")
	@SchemaOrgLabel("arrivalBusStop")
	@SchemaOrgComment(""
			+ "The stop or station from which the bus arrives.")
	@CamelizedName("arrivalBusStop")
	@ConstantizedName("ARRIVAL_BUS_STOP")
	public interface ArrivalBusStop extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BusStop
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusStop
		 */
		public Clazz.BusStop getBusStop();
		public void setBusStop(Clazz.BusStop busStop);
		public List<Clazz.BusStop> getBusStopList();
		public void setBusStopList(List<Clazz.BusStop> busStopList);
		public boolean hasBusStop();

		/**
		 * uri: http://schema.org/BusStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusStation
		 */
		public Clazz.BusStation getBusStation();
		public void setBusStation(Clazz.BusStation busStation);
		public List<Clazz.BusStation> getBusStationList();
		public void setBusStationList(List<Clazz.BusStation> busStationList);
		public boolean hasBusStation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalGate")
	@SchemaOrgLabel("arrivalGate")
	@SchemaOrgComment(""
			+ "Identifier of the flight's arrival gate.")
	@CamelizedName("arrivalGate")
	@ConstantizedName("ARRIVAL_GATE")
	public interface ArrivalGate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalPlatform")
	@SchemaOrgLabel("arrivalPlatform")
	@SchemaOrgComment("The platform where the train arrives.")
	@CamelizedName("arrivalPlatform")
	@ConstantizedName("ARRIVAL_PLATFORM")
	public interface ArrivalPlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalStation")
	@SchemaOrgLabel("arrivalStation")
	@SchemaOrgComment("The station where the train trip ends.")
	@CamelizedName("arrivalStation")
	@ConstantizedName("ARRIVAL_STATION")
	public interface ArrivalStation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/TrainStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.TrainStation
		 */
		public Clazz.TrainStation getTrainStation();
		public void setTrainStation(Clazz.TrainStation trainStation);
		public List<Clazz.TrainStation> getTrainStationList();
		public void setTrainStationList(List<Clazz.TrainStation> trainStationList);
		public boolean hasTrainStation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalTerminal")
	@SchemaOrgLabel("arrivalTerminal")
	@SchemaOrgComment(""
			+ "Identifier of the flight's arrival terminal.")
	@CamelizedName("arrivalTerminal")
	@ConstantizedName("ARRIVAL_TERMINAL")
	public interface ArrivalTerminal extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arrivalTime")
	@SchemaOrgLabel("arrivalTime")
	@SchemaOrgComment("The expected arrival time.")
	@CamelizedName("arrivalTime")
	@ConstantizedName("ARRIVAL_TIME")
	public interface ArrivalTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/artEdition")
	@SchemaOrgLabel("artEdition")
	@SchemaOrgComment(""
			+ "The number of copies when multiple copies of a piece of artwork are produced -"
			+ " e.g. for a limited edition of 20 prints, 'artEdition' refers to the total"
			+ " number of copies (in this example \"20\").")
	@CamelizedName("artEdition")
	@ConstantizedName("ART_EDITION")
	public interface ArtEdition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/artMedium")
	@SchemaOrgLabel("artMedium")
	@SchemaOrgComment(""
			+ "The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble,"
			+ " Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil,"
			+ " Mixed Media, etc.)")
	@CamelizedName("artMedium")
	@ConstantizedName("ART_MEDIUM")
	public interface ArtMedium extends Material, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/artform")
	@SchemaOrgLabel("artform")
	@SchemaOrgComment(""
			+ "e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.")
	@CamelizedName("artform")
	@ConstantizedName("ARTFORM")
	public interface Artform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/articleBody")
	@SchemaOrgLabel("articleBody")
	@SchemaOrgComment("The actual body of the article.")
	@CamelizedName("articleBody")
	@ConstantizedName("ARTICLE_BODY")
	public interface ArticleBody extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/articleSection")
	@SchemaOrgLabel("articleSection")
	@SchemaOrgComment(""
			+ "Articles may belong to one or more 'sections' in a magazine or newspaper, such"
			+ " as Sports, Lifestyle, etc.")
	@CamelizedName("articleSection")
	@ConstantizedName("ARTICLE_SECTION")
	public interface ArticleSection extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/artworkSurface")
	@SchemaOrgLabel("artworkSurface")
	@SchemaOrgComment(""
			+ "The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc.")
	@CamelizedName("artworkSurface")
	@ConstantizedName("ARTWORK_SURFACE")
	public interface ArtworkSurface extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/assemblyVersion")
	@SchemaOrgLabel("assemblyVersion")
	@SchemaOrgComment(""
			+ "Associated product/technology version. e.g., .NET Framework 4.5.")
	@CamelizedName("assemblyVersion")
	@ConstantizedName("ASSEMBLY_VERSION")
	public interface AssemblyVersion extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedArticle")
	@SchemaOrgLabel("associatedArticle")
	@SchemaOrgComment(""
			+ "A NewsArticle associated with the Media Object.")
	@CamelizedName("associatedArticle")
	@ConstantizedName("ASSOCIATED_ARTICLE")
	public interface AssociatedArticle extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/NewsArticle
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.NewsArticle
		 */
		public Clazz.NewsArticle getNewsArticle();
		public void setNewsArticle(Clazz.NewsArticle newsArticle);
		public List<Clazz.NewsArticle> getNewsArticleList();
		public void setNewsArticleList(List<Clazz.NewsArticle> newsArticleList);
		public boolean hasNewsArticle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedMedia")
	@SchemaOrgLabel("associatedMedia")
	@SchemaOrgComment(""
			+ "A media object that encodes this CreativeWork. This property is a synonym for"
			+ " encoding.")
	@CamelizedName("associatedMedia")
	@ConstantizedName("ASSOCIATED_MEDIA")
	public interface AssociatedMedia extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MediaObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject
		 */
		public Clazz.MediaObject getMediaObject();
		public void setMediaObject(Clazz.MediaObject mediaObject);
		public List<Clazz.MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<Clazz.MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/athlete")
	@SchemaOrgLabel("athlete")
	@SchemaOrgComment(""
			+ "A person that acts as performing member of a sports team; a player as opposed to"
			+ " a coach.")
	@CamelizedName("athlete")
	@ConstantizedName("ATHLETE")
	public interface Athlete extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/attendee")
	@SchemaOrgLabel("attendee")
	@SchemaOrgComment(""
			+ "A person or organization attending the event.")
	@CamelizedName("attendee")
	@ConstantizedName("ATTENDEE")
	public interface Attendee extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/audience")
	@SchemaOrgLabel("audience")
	@SchemaOrgComment(""
			+ "An intended audience, i.e. a group for whom something was created.")
	@CamelizedName("audience")
	@ConstantizedName("AUDIENCE")
	public interface Audience extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/audienceType")
	@SchemaOrgLabel("audienceType")
	@SchemaOrgComment(""
			+ "The target group associated with a given audience (e.g. veterans, car owners,"
			+ " musicians, etc.).")
	@CamelizedName("audienceType")
	@ConstantizedName("AUDIENCE_TYPE")
	public interface AudienceType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/audio")
	@SchemaOrgLabel("audio")
	@SchemaOrgComment("An embedded audio object.")
	@CamelizedName("audio")
	@ConstantizedName("AUDIO")
	public interface Audio extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/AudioObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AudioObject
		 */
		public Clazz.AudioObject getAudioObject();
		public void setAudioObject(Clazz.AudioObject audioObject);
		public List<Clazz.AudioObject> getAudioObjectList();
		public void setAudioObjectList(List<Clazz.AudioObject> audioObjectList);
		public boolean hasAudioObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/author")
	@SchemaOrgLabel("author")
	@SchemaOrgComment(""
			+ "The author of this content or rating. Please note that author is special in that"
			+ " HTML 5 provides a special mechanism for indicating authorship via the rel tag."
			+ " That is equivalent to this and may be used interchangeably.")
	@CamelizedName("author")
	@ConstantizedName("AUTHOR")
	public interface Author extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availability")
	@SchemaOrgLabel("availability")
	@SchemaOrgComment(""
			+ "The availability of this item&#x2014;for example In stock, Out of stock,"
			+ " Pre-order, etc.")
	@CamelizedName("availability")
	@ConstantizedName("AVAILABILITY")
	public interface Availability extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ItemAvailability
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ItemAvailability
		 */
		public Clazz.ItemAvailability getItemAvailability();
		public void setItemAvailability(Clazz.ItemAvailability itemAvailability);
		public List<Clazz.ItemAvailability> getItemAvailabilityList();
		public void setItemAvailabilityList(List<Clazz.ItemAvailability> itemAvailabilityList);
		public boolean hasItemAvailability();

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
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
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
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableAtOrFrom")
	@SchemaOrgLabel("availableAtOrFrom")
	@SchemaOrgComment(""
			+ "The place(s) from which the offer can be obtained (e.g. store locations).")
	@CamelizedName("availableAtOrFrom")
	@ConstantizedName("AVAILABLE_AT_OR_FROM")
	public interface AvailableAtOrFrom extends AreaServed, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableChannel")
	@SchemaOrgLabel("availableChannel")
	@SchemaOrgComment(""
			+ "A means of accessing the service (e.g. a phone bank, a web site, a location,"
			+ " etc.).")
	@CamelizedName("availableChannel")
	@ConstantizedName("AVAILABLE_CHANNEL")
	public interface AvailableChannel extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ServiceChannel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ServiceChannel
		 */
		public Clazz.ServiceChannel getServiceChannel();
		public void setServiceChannel(Clazz.ServiceChannel serviceChannel);
		public List<Clazz.ServiceChannel> getServiceChannelList();
		public void setServiceChannelList(List<Clazz.ServiceChannel> serviceChannelList);
		public boolean hasServiceChannel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableDeliveryMethod")
	@SchemaOrgLabel("availableDeliveryMethod")
	@SchemaOrgComment(""
			+ "The delivery method(s) available for this offer.")
	@CamelizedName("availableDeliveryMethod")
	@ConstantizedName("AVAILABLE_DELIVERY_METHOD")
	public interface AvailableDeliveryMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryMethod
		 */
		public Clazz.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Clazz.DeliveryMethod deliveryMethod);
		public List<Clazz.DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<Clazz.DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableFrom")
	@SchemaOrgLabel("availableFrom")
	@SchemaOrgComment(""
			+ "When the item is available for pickup from the store, locker, etc.")
	@CamelizedName("availableFrom")
	@ConstantizedName("AVAILABLE_FROM")
	public interface AvailableFrom extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableLanguage")
	@SchemaOrgLabel("availableLanguage")
	@SchemaOrgComment(""
			+ "A language someone may use with or at the item, service or place. Please use one"
			+ " of the language codes from the <a"
			+ " href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>. See also <a"
			+ " class=\"localLink\" href=\"http://schema.org/inLanguage\">inLanguage</a>")
	@CamelizedName("availableLanguage")
	@ConstantizedName("AVAILABLE_LANGUAGE")
	public interface AvailableLanguage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Language
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Language
		 */
		public Clazz.Language getLanguage();
		public void setLanguage(Clazz.Language language);
		public List<Clazz.Language> getLanguageList();
		public void setLanguageList(List<Clazz.Language> languageList);
		public boolean hasLanguage();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableOnDevice")
	@SchemaOrgLabel("availableOnDevice")
	@SchemaOrgComment(""
			+ "Device required to run the application. Used in cases where a specific"
			+ " make/model is required to run the application.")
	@CamelizedName("availableOnDevice")
	@ConstantizedName("AVAILABLE_ON_DEVICE")
	public interface AvailableOnDevice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableThrough")
	@SchemaOrgLabel("availableThrough")
	@SchemaOrgComment(""
			+ "After this date, the item will no longer be available for pickup.")
	@CamelizedName("availableThrough")
	@ConstantizedName("AVAILABLE_THROUGH")
	public interface AvailableThrough extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/award")
	@SchemaOrgLabel("award")
	@SchemaOrgComment("An award won by or for this item.")
	@CamelizedName("award")
	@ConstantizedName("AWARD")
	public interface Award extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/awayTeam")
	@SchemaOrgLabel("awayTeam")
	@SchemaOrgComment("The away team in a sports event.")
	@CamelizedName("awayTeam")
	@ConstantizedName("AWAY_TEAM")
	public interface AwayTeam extends Competitor, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/SportsTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsTeam
		 */
		public Clazz.SportsTeam getSportsTeam();
		public void setSportsTeam(Clazz.SportsTeam sportsTeam);
		public List<Clazz.SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<Clazz.SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/baseSalary")
	@SchemaOrgLabel("baseSalary")
	@SchemaOrgComment(""
			+ "The base salary of the job or of an employee in an EmployeeRole.")
	@CamelizedName("baseSalary")
	@ConstantizedName("BASE_SALARY")
	public interface BaseSalary extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bccRecipient")
	@SchemaOrgLabel("bccRecipient")
	@SchemaOrgComment(""
			+ "A sub property of recipient. The recipient blind copied on a message.")
	@CamelizedName("bccRecipient")
	@ConstantizedName("BCC_RECIPIENT")
	public interface BccRecipient extends Recipient, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bed")
	@SchemaOrgLabel("bed")
	@SchemaOrgComment(""
			+ "The type of bed or beds included in the accommodation. For the single case of"
			+ " just one bed of a certain type, you use bed directly with a text.\n      If you"
			+ " want to indicate the quantity of a certain kind of bed, use an instance of"
			+ " BedDetails. For more detailed information, use the amenityFeature property.")
	@CamelizedName("bed")
	@ConstantizedName("BED")
	public interface Bed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/BedDetails
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BedDetails
		 */
		public Clazz.BedDetails getBedDetails();
		public void setBedDetails(Clazz.BedDetails bedDetails);
		public List<Clazz.BedDetails> getBedDetailsList();
		public void setBedDetailsList(List<Clazz.BedDetails> bedDetailsList);
		public boolean hasBedDetails();

		/**
		 * uri: http://schema.org/BedType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.BedType
		 */
		public BedType getBedType();
		public void setBedType(BedType bedType);
		public List<BedType> getBedTypeList();
		public void setBedTypeList(List<BedType> bedTypeList);
		public boolean hasBedType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/beforeMedia")
	@SchemaOrgLabel("beforeMedia")
	@SchemaOrgComment(""
			+ "A media object representing the circumstances before performing this direction.")
	@CamelizedName("beforeMedia")
	@ConstantizedName("BEFORE_MEDIA")
	public interface BeforeMedia extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MediaObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject
		 */
		public Clazz.MediaObject getMediaObject();
		public void setMediaObject(Clazz.MediaObject mediaObject);
		public List<Clazz.MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<Clazz.MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bestRating")
	@SchemaOrgLabel("bestRating")
	@SchemaOrgComment(""
			+ "The highest value allowed in this rating system. If bestRating is omitted, 5 is"
			+ " assumed.")
	@CamelizedName("bestRating")
	@ConstantizedName("BEST_RATING")
	public interface BestRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/billingAddress")
	@SchemaOrgLabel("billingAddress")
	@SchemaOrgComment("The billing address for the order.")
	@CamelizedName("billingAddress")
	@ConstantizedName("BILLING_ADDRESS")
	public interface BillingAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/billingIncrement")
	@SchemaOrgLabel("billingIncrement")
	@SchemaOrgComment(""
			+ "This property specifies the minimal quantity and rounding increment that will be"
			+ " the basis for the billing. The unit of measurement is specified by the unitCode"
			+ " property.")
	@CamelizedName("billingIncrement")
	@ConstantizedName("BILLING_INCREMENT")
	public interface BillingIncrement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/billingPeriod")
	@SchemaOrgLabel("billingPeriod")
	@SchemaOrgComment(""
			+ "The time interval used to compute the invoice.")
	@CamelizedName("billingPeriod")
	@ConstantizedName("BILLING_PERIOD")
	public interface BillingPeriod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/birthDate")
	@SchemaOrgLabel("birthDate")
	@SchemaOrgComment("Date of birth.")
	@CamelizedName("birthDate")
	@ConstantizedName("BIRTH_DATE")
	public interface BirthDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/birthPlace")
	@SchemaOrgLabel("birthPlace")
	@SchemaOrgComment("The place where the person was born.")
	@CamelizedName("birthPlace")
	@ConstantizedName("BIRTH_PLACE")
	public interface BirthPlace extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bitrate")
	@SchemaOrgLabel("bitrate")
	@SchemaOrgComment("The bitrate of the media object.")
	@CamelizedName("bitrate")
	@ConstantizedName("BITRATE")
	public interface Bitrate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/blogPost")
	@SchemaOrgLabel("blogPost")
	@SchemaOrgComment("A posting that is part of this blog.")
	@CamelizedName("blogPost")
	@ConstantizedName("BLOG_POST")
	public interface BlogPost extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BlogPosting
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BlogPosting
		 */
		public Clazz.BlogPosting getBlogPosting();
		public void setBlogPosting(Clazz.BlogPosting blogPosting);
		public List<Clazz.BlogPosting> getBlogPostingList();
		public void setBlogPostingList(List<Clazz.BlogPosting> blogPostingList);
		public boolean hasBlogPosting();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/boardingGroup")
	@SchemaOrgLabel("boardingGroup")
	@SchemaOrgComment(""
			+ "The airline-specific indicator of boarding order / preference.")
	@CamelizedName("boardingGroup")
	@ConstantizedName("BOARDING_GROUP")
	public interface BoardingGroup extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/boardingPolicy")
	@SchemaOrgLabel("boardingPolicy")
	@SchemaOrgComment(""
			+ "The type of boarding policy used by the airline (e.g. zone-based or"
			+ " group-based).")
	@CamelizedName("boardingPolicy")
	@ConstantizedName("BOARDING_POLICY")
	public interface BoardingPolicy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BoardingPolicyType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BoardingPolicyType
		 */
		public Clazz.BoardingPolicyType getBoardingPolicyType();
		public void setBoardingPolicyType(Clazz.BoardingPolicyType boardingPolicyType);
		public List<Clazz.BoardingPolicyType> getBoardingPolicyTypeList();
		public void setBoardingPolicyTypeList(List<Clazz.BoardingPolicyType> boardingPolicyTypeList);
		public boolean hasBoardingPolicyType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bookEdition")
	@SchemaOrgLabel("bookEdition")
	@SchemaOrgComment("The edition of the book.")
	@CamelizedName("bookEdition")
	@ConstantizedName("BOOK_EDITION")
	public interface BookEdition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bookFormat")
	@SchemaOrgLabel("bookFormat")
	@SchemaOrgComment("The format of the book.")
	@CamelizedName("bookFormat")
	@ConstantizedName("BOOK_FORMAT")
	public interface BookFormat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BookFormatType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BookFormatType
		 */
		public Clazz.BookFormatType getBookFormatType();
		public void setBookFormatType(Clazz.BookFormatType bookFormatType);
		public List<Clazz.BookFormatType> getBookFormatTypeList();
		public void setBookFormatTypeList(List<Clazz.BookFormatType> bookFormatTypeList);
		public boolean hasBookFormatType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bookingTime")
	@SchemaOrgLabel("bookingTime")
	@SchemaOrgComment(""
			+ "The date and time the reservation was booked.")
	@CamelizedName("bookingTime")
	@ConstantizedName("BOOKING_TIME")
	public interface BookingTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/borrower")
	@SchemaOrgLabel("borrower")
	@SchemaOrgComment(""
			+ "A sub property of participant. The person that borrows the object being lent.")
	@CamelizedName("borrower")
	@ConstantizedName("BORROWER")
	public interface Borrower extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/box")
	@SchemaOrgLabel("box")
	@SchemaOrgComment(""
			+ "A box is the area enclosed by the rectangle formed by two points. The first"
			+ " point is the lower corner, the second point is the upper corner. A box is"
			+ " expressed as two points separated by a space character.")
	@CamelizedName("box")
	@ConstantizedName("BOX")
	public interface Box extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/branchCode")
	@SchemaOrgLabel("branchCode")
	@SchemaOrgComment(""
			+ "A short textual code (also called \"store code\") that uniquely identifies a"
			+ " place of business. The code is typically assigned by the parentOrganization and"
			+ " used in structured URLs.</p>\n\n<p>For example, in the URL"
			+ " http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code \"3047\" is a"
			+ " branchCode for a particular branch.")
	@CamelizedName("branchCode")
	@ConstantizedName("BRANCH_CODE")
	public interface BranchCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/brand")
	@SchemaOrgLabel("brand")
	@SchemaOrgComment(""
			+ "The brand(s) associated with a product or service, or the brand(s) maintained by"
			+ " an organization or business person.")
	@CamelizedName("brand")
	@ConstantizedName("BRAND")
	public interface Brand extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Brand
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Brand
		 */
		public Clazz.Brand getBrand();
		public void setBrand(Clazz.Brand brand);
		public List<Clazz.Brand> getBrandList();
		public void setBrandList(List<Clazz.Brand> brandList);
		public boolean hasBrand();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/breadcrumb")
	@SchemaOrgLabel("breadcrumb")
	@SchemaOrgComment(""
			+ "A set of links that can help a user understand and navigate a website hierarchy.")
	@CamelizedName("breadcrumb")
	@ConstantizedName("BREADCRUMB")
	public interface Breadcrumb extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/BreadcrumbList
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BreadcrumbList
		 */
		public Clazz.BreadcrumbList getBreadcrumbList();
		public void setBreadcrumbList(Clazz.BreadcrumbList breadcrumbList);
		public List<Clazz.BreadcrumbList> getBreadcrumbListList();
		public void setBreadcrumbListList(List<Clazz.BreadcrumbList> breadcrumbListList);
		public boolean hasBreadcrumbList();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastAffiliateOf")
	@SchemaOrgLabel("broadcastAffiliateOf")
	@SchemaOrgComment(""
			+ "The media network(s) whose content is broadcast on this station.")
	@CamelizedName("broadcastAffiliateOf")
	@ConstantizedName("BROADCAST_AFFILIATE_OF")
	public interface BroadcastAffiliateOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastChannelId")
	@SchemaOrgLabel("broadcastChannelId")
	@SchemaOrgComment(""
			+ "The unique address by which the BroadcastService can be identified in a provider"
			+ " lineup. In US, this is typically a number.")
	@CamelizedName("broadcastChannelId")
	@ConstantizedName("BROADCAST_CHANNEL_ID")
	public interface BroadcastChannelId extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastDisplayName")
	@SchemaOrgLabel("broadcastDisplayName")
	@SchemaOrgComment(""
			+ "The name displayed in the channel guide. For many US affiliates, it is the"
			+ " network name.")
	@CamelizedName("broadcastDisplayName")
	@ConstantizedName("BROADCAST_DISPLAY_NAME")
	public interface BroadcastDisplayName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastOfEvent")
	@SchemaOrgLabel("broadcastOfEvent")
	@SchemaOrgComment(""
			+ "The event being broadcast such as a sporting event or awards ceremony.")
	@CamelizedName("broadcastOfEvent")
	@ConstantizedName("BROADCAST_OF_EVENT")
	public interface BroadcastOfEvent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastServiceTier")
	@SchemaOrgLabel("broadcastServiceTier")
	@SchemaOrgComment(""
			+ "The type of service required to have access to the channel (e.g. Standard or"
			+ " Premium).")
	@CamelizedName("broadcastServiceTier")
	@ConstantizedName("BROADCAST_SERVICE_TIER")
	public interface BroadcastServiceTier extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcastTimezone")
	@SchemaOrgLabel("broadcastTimezone")
	@SchemaOrgComment(""
			+ "The timezone in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601"
			+ " format</a> for which the service bases its broadcasts")
	@CamelizedName("broadcastTimezone")
	@ConstantizedName("BROADCAST_TIMEZONE")
	public interface BroadcastTimezone extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broadcaster")
	@SchemaOrgLabel("broadcaster")
	@SchemaOrgComment(""
			+ "The organization owning or operating the broadcast service.")
	@CamelizedName("broadcaster")
	@ConstantizedName("BROADCASTER")
	public interface Broadcaster extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/broker")
	@SchemaOrgLabel("broker")
	@SchemaOrgComment(""
			+ "An entity that arranges for an exchange between a buyer and a seller.  In most"
			+ " cases a broker never acquires or releases ownership of a product or service"
			+ " involved in an exchange.  If it is not clear whether an entity is a broker,"
			+ " seller, or buyer, the latter two terms are preferred.")
	@CamelizedName("broker")
	@ConstantizedName("BROKER")
	public interface Broker extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/browserRequirements")
	@SchemaOrgLabel("browserRequirements")
	@SchemaOrgComment(""
			+ "Specifies browser requirements in human-readable text. For example, 'requires"
			+ " HTML5 support'.")
	@CamelizedName("browserRequirements")
	@ConstantizedName("BROWSER_REQUIREMENTS")
	public interface BrowserRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://kyojo.org/schemaSpl/buildingAddress")
	@SchemaOrgLabel("buildingAddress")
	@SchemaOrgComment("The building address.")
	@CamelizedName("buildingAddress")
	@ConstantizedName("BUILDING_ADDRESS")
	public interface BuildingAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/busName")
	@SchemaOrgLabel("busName")
	@SchemaOrgComment(""
			+ "The name of the bus (e.g. Bolt Express).")
	@CamelizedName("busName")
	@ConstantizedName("BUS_NAME")
	public interface BusName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/busNumber")
	@SchemaOrgLabel("busNumber")
	@SchemaOrgComment("The unique identifier for the bus.")
	@CamelizedName("busNumber")
	@ConstantizedName("BUS_NUMBER")
	public interface BusNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/businessFunction")
	@SchemaOrgLabel("businessFunction")
	@SchemaOrgComment(""
			+ "The business function (e.g. sell, lease, repair, dispose) of the offer or"
			+ " component of a bundle (TypeAndQuantityNode). The default is"
			+ " http://purl.org/goodrelations/v1#Sell.")
	@CamelizedName("businessFunction")
	@ConstantizedName("BUSINESS_FUNCTION")
	public interface BusinessFunction extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BusinessFunction
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessFunction
		 */
		public Clazz.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Clazz.BusinessFunction businessFunction);
		public List<Clazz.BusinessFunction> getBusinessFunctionList();
		public void setBusinessFunctionList(List<Clazz.BusinessFunction> businessFunctionList);
		public boolean hasBusinessFunction();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/buyer")
	@SchemaOrgLabel("buyer")
	@SchemaOrgComment(""
			+ "A sub property of participant. The participant/person/organization that bought"
			+ " the object.")
	@CamelizedName("buyer")
	@ConstantizedName("BUYER")
	public interface Buyer extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/byArtist")
	@SchemaOrgLabel("byArtist")
	@SchemaOrgComment(""
			+ "The artist that performed this album or recording.")
	@CamelizedName("byArtist")
	@ConstantizedName("BY_ARTIST")
	public interface ByArtist extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicGroup
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicGroup
		 */
		public Clazz.MusicGroup getMusicGroup();
		public void setMusicGroup(Clazz.MusicGroup musicGroup);
		public List<Clazz.MusicGroup> getMusicGroupList();
		public void setMusicGroupList(List<Clazz.MusicGroup> musicGroupList);
		public boolean hasMusicGroup();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/calories")
	@SchemaOrgLabel("calories")
	@SchemaOrgComment("The number of calories.")
	@CamelizedName("calories")
	@ConstantizedName("CALORIES")
	public interface Calories extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Energy
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Energy
		 */
		public Clazz.Energy getEnergy();
		public void setEnergy(Clazz.Energy energy);
		public List<Clazz.Energy> getEnergyList();
		public void setEnergyList(List<Clazz.Energy> energyList);
		public boolean hasEnergy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/candidate")
	@SchemaOrgLabel("candidate")
	@SchemaOrgComment(""
			+ "A sub property of object. The candidate subject of this action.")
	@CamelizedName("candidate")
	@ConstantizedName("CANDIDATE")
	public interface Candidate extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/caption")
	@SchemaOrgLabel("caption")
	@SchemaOrgComment("The caption for this object.")
	@CamelizedName("caption")
	@ConstantizedName("CAPTION")
	public interface Caption extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/carbohydrateContent")
	@SchemaOrgLabel("carbohydrateContent")
	@SchemaOrgComment("The number of grams of carbohydrates.")
	@CamelizedName("carbohydrateContent")
	@ConstantizedName("CARBOHYDRATE_CONTENT")
	public interface CarbohydrateContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cargoVolume")
	@SchemaOrgLabel("cargoVolume")
	@SchemaOrgComment(""
			+ "The available volume for cargo or luggage. For automobiles, this is usually the"
			+ " trunk volume.</p>\n\n<p>Typical unit code(s): LTR for liters, FTQ for cubic"
			+ " foot/feet</p>\n\n<p>Note: You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/minValue\">minValue</a> and <a class=\"localLink\""
			+ " href=\"http://schema.org/maxValue\">maxValue</a> to indicate ranges.")
	@CamelizedName("cargoVolume")
	@ConstantizedName("CARGO_VOLUME")
	public interface CargoVolume extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/carrierRequirements")
	@SchemaOrgLabel("carrierRequirements")
	@SchemaOrgComment(""
			+ "Specifies specific carrier(s) requirements for the application (e.g. an"
			+ " application may only work on a specific carrier network).")
	@CamelizedName("carrierRequirements")
	@ConstantizedName("CARRIER_REQUIREMENTS")
	public interface CarrierRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/catalogNumber")
	@SchemaOrgLabel("catalogNumber")
	@SchemaOrgComment("The catalog number for the release.")
	@CamelizedName("catalogNumber")
	@ConstantizedName("CATALOG_NUMBER")
	public interface CatalogNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

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
		 * uri: http://schema.org/PhysicalActivityCategory
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PhysicalActivityCategory
		 */
		public PhysicalActivityCategory getPhysicalActivityCategory();
		public void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory);
		public List<PhysicalActivityCategory> getPhysicalActivityCategoryList();
		public void setPhysicalActivityCategoryList(List<PhysicalActivityCategory> physicalActivityCategoryList);
		public boolean hasPhysicalActivityCategory();

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ccRecipient")
	@SchemaOrgLabel("ccRecipient")
	@SchemaOrgComment(""
			+ "A sub property of recipient. The recipient copied on a message.")
	@CamelizedName("ccRecipient")
	@ConstantizedName("CC_RECIPIENT")
	public interface CcRecipient extends Recipient, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/character")
	@SchemaOrgLabel("character")
	@SchemaOrgComment(""
			+ "Fictional person connected with a creative work.")
	@CamelizedName("character")
	@ConstantizedName("CHARACTER")
	public interface Character extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/characterAttribute")
	@SchemaOrgLabel("characterAttribute")
	@SchemaOrgComment(""
			+ "A piece of data that represents a particular aspect of a fictional character"
			+ " (skill, power, character points, advantage, disadvantage).")
	@CamelizedName("characterAttribute")
	@ConstantizedName("CHARACTER_ATTRIBUTE")
	public interface CharacterAttribute extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/characterName")
	@SchemaOrgLabel("characterName")
	@SchemaOrgComment(""
			+ "The name of a character played in some acting or performing role, i.e. in a"
			+ " PerformanceRole.")
	@CamelizedName("characterName")
	@ConstantizedName("CHARACTER_NAME")
	public interface CharacterName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cheatCode")
	@SchemaOrgLabel("cheatCode")
	@SchemaOrgComment("Cheat codes to the game.")
	@CamelizedName("cheatCode")
	@ConstantizedName("CHEAT_CODE")
	public interface CheatCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/checkinTime")
	@SchemaOrgLabel("checkinTime")
	@SchemaOrgComment(""
			+ "The earliest someone may check into a lodging establishment.")
	@CamelizedName("checkinTime")
	@ConstantizedName("CHECKIN_TIME")
	public interface CheckinTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/checkoutTime")
	@SchemaOrgLabel("checkoutTime")
	@SchemaOrgComment(""
			+ "The latest someone may check out of a lodging establishment.")
	@CamelizedName("checkoutTime")
	@ConstantizedName("CHECKOUT_TIME")
	public interface CheckoutTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/childMaxAge")
	@SchemaOrgLabel("childMaxAge")
	@SchemaOrgComment("Maximal age of the child.")
	@CamelizedName("childMaxAge")
	@ConstantizedName("CHILD_MAX_AGE")
	public interface ChildMaxAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/childMinAge")
	@SchemaOrgLabel("childMinAge")
	@SchemaOrgComment("Minimal age of the child.")
	@CamelizedName("childMinAge")
	@ConstantizedName("CHILD_MIN_AGE")
	public interface ChildMinAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/children")
	@SchemaOrgLabel("children")
	@SchemaOrgComment("A child of the person.")
	@CamelizedName("children")
	@ConstantizedName("CHILDREN")
	public interface Children extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cholesterolContent")
	@SchemaOrgLabel("cholesterolContent")
	@SchemaOrgComment(""
			+ "The number of milligrams of cholesterol.")
	@CamelizedName("cholesterolContent")
	@ConstantizedName("CHOLESTEROL_CONTENT")
	public interface CholesterolContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/circle")
	@SchemaOrgLabel("circle")
	@SchemaOrgComment(""
			+ "A circle is the circular region of a specified radius centered at a specified"
			+ " latitude and longitude. A circle is expressed as a pair followed by a radius in"
			+ " meters.")
	@CamelizedName("circle")
	@ConstantizedName("CIRCLE")
	public interface Circle extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/citation")
	@SchemaOrgLabel("citation")
	@SchemaOrgComment(""
			+ "A citation or reference to another creative work, such as another publication,"
			+ " web page, scholarly article, etc.")
	@CamelizedName("citation")
	@ConstantizedName("CITATION")
	public interface Citation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/claimReviewed")
	@SchemaOrgLabel("claimReviewed")
	@SchemaOrgComment(""
			+ "A short summary of the specific claims reviewed in a ClaimReview.")
	@CamelizedName("claimReviewed")
	@ConstantizedName("CLAIM_REVIEWED")
	public interface ClaimReviewed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/clipNumber")
	@SchemaOrgLabel("clipNumber")
	@SchemaOrgComment(""
			+ "Position of the clip within an ordered group of clips.")
	@CamelizedName("clipNumber")
	@ConstantizedName("CLIP_NUMBER")
	public interface ClipNumber extends Position, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/closes")
	@SchemaOrgLabel("closes")
	@SchemaOrgComment(""
			+ "The closing hour of the place or service on the given day(s) of the week.")
	@CamelizedName("closes")
	@ConstantizedName("CLOSES")
	public interface Closes extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Time
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Time
		 */
		public DataType.Time getTime();
		public void setTime(DataType.Time time);
		public List<DataType.Time> getTimeList();
		public void setTimeList(List<DataType.Time> timeList);
		public boolean hasTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/coach")
	@SchemaOrgLabel("coach")
	@SchemaOrgComment(""
			+ "A person that acts in a coaching role for a sports team.")
	@CamelizedName("coach")
	@ConstantizedName("COACH")
	public interface Coach extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/codeRepository")
	@SchemaOrgLabel("codeRepository")
	@SchemaOrgComment(""
			+ "Link to the repository where the un-compiled, human readable code and related"
			+ " code is located (SVN, github, CodePlex).")
	@CamelizedName("codeRepository")
	@ConstantizedName("CODE_REPOSITORY")
	public interface CodeRepository extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/codeSampleType")
	@SchemaOrgLabel("codeSampleType")
	@SchemaOrgComment(""
			+ "What type of code sample: full (compile ready) solution, code snippet, inline"
			+ " code, scripts, template.")
	@CamelizedName("codeSampleType")
	@ConstantizedName("CODE_SAMPLE_TYPE")
	public interface CodeSampleType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/colleague")
	@SchemaOrgLabel("colleague")
	@SchemaOrgComment("A colleague of the person.")
	@CamelizedName("colleague")
	@ConstantizedName("COLLEAGUE")
	public interface Colleague extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/color")
	@SchemaOrgLabel("color")
	@SchemaOrgComment("The color of the product.")
	@CamelizedName("color")
	@ConstantizedName("COLOR")
	public interface Color extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/comment")
	@SchemaOrgLabel("comment")
	@SchemaOrgComment("Comments, typically from users.")
	@CamelizedName("comment")
	@ConstantizedName("COMMENT")
	public interface Comment extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Comment
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Comment
		 */
		public Clazz.Comment getComment();
		public void setComment(Clazz.Comment comment);
		public List<Clazz.Comment> getCommentList();
		public void setCommentList(List<Clazz.Comment> commentList);
		public boolean hasComment();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/commentCount")
	@SchemaOrgLabel("commentCount")
	@SchemaOrgComment(""
			+ "The number of comments this CreativeWork (e.g. Article, Question or Answer) has"
			+ " received. This is most applicable to works published in Web sites with"
			+ " commenting system; additional comments may exist elsewhere.")
	@CamelizedName("commentCount")
	@ConstantizedName("COMMENT_COUNT")
	public interface CommentCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/commentText")
	@SchemaOrgLabel("commentText")
	@SchemaOrgComment("The text of the UserComment.")
	@CamelizedName("commentText")
	@ConstantizedName("COMMENT_TEXT")
	public interface CommentText extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/commentTime")
	@SchemaOrgLabel("commentTime")
	@SchemaOrgComment(""
			+ "The time at which the UserComment was made.")
	@CamelizedName("commentTime")
	@ConstantizedName("COMMENT_TIME")
	public interface CommentTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/competitor")
	@SchemaOrgLabel("competitor")
	@SchemaOrgComment("A competitor in a sports event.")
	@CamelizedName("competitor")
	@ConstantizedName("COMPETITOR")
	public interface Competitor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/SportsTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsTeam
		 */
		public Clazz.SportsTeam getSportsTeam();
		public void setSportsTeam(Clazz.SportsTeam sportsTeam);
		public List<Clazz.SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<Clazz.SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/composer")
	@SchemaOrgLabel("composer")
	@SchemaOrgComment(""
			+ "The person or organization who wrote a composition, or who is the composer of a"
			+ " work performed at some event.")
	@CamelizedName("composer")
	@ConstantizedName("COMPOSER")
	public interface Composer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/confirmationNumber")
	@SchemaOrgLabel("confirmationNumber")
	@SchemaOrgComment(""
			+ "A number that confirms the given order or payment has been received.")
	@CamelizedName("confirmationNumber")
	@ConstantizedName("CONFIRMATION_NUMBER")
	public interface ConfirmationNumber extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contactOption")
	@SchemaOrgLabel("contactOption")
	@SchemaOrgComment(""
			+ "An option available on this contact point (e.g. a toll-free number or support"
			+ " for hearing-impaired callers).")
	@CamelizedName("contactOption")
	@ConstantizedName("CONTACT_OPTION")
	public interface ContactOption extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPointOption
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPointOption
		 */
		public Clazz.ContactPointOption getContactPointOption();
		public void setContactPointOption(Clazz.ContactPointOption contactPointOption);
		public List<Clazz.ContactPointOption> getContactPointOptionList();
		public void setContactPointOptionList(List<Clazz.ContactPointOption> contactPointOptionList);
		public boolean hasContactPointOption();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contactPoint")
	@SchemaOrgLabel("contactPoint")
	@SchemaOrgComment(""
			+ "A contact point for a person or organization.")
	@CamelizedName("contactPoint")
	@ConstantizedName("CONTACT_POINT")
	public interface ContactPoint extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contactType")
	@SchemaOrgLabel("contactType")
	@SchemaOrgComment(""
			+ "A person or organization can have different contact points, for different"
			+ " purposes. For example, a sales contact point, a PR contact point and so on."
			+ " This property is used to specify the kind of contact point.")
	@CamelizedName("contactType")
	@ConstantizedName("CONTACT_TYPE")
	public interface ContactType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/containedInPlace")
	@SchemaOrgLabel("containedInPlace")
	@SchemaOrgComment(""
			+ "The basic containment relation between a place and one that contains it.")
	@CamelizedName("containedInPlace")
	@ConstantizedName("CONTAINED_IN_PLACE")
	public interface ContainedInPlace extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/containsPlace")
	@SchemaOrgLabel("containsPlace")
	@SchemaOrgComment(""
			+ "The basic containment relation between a place and another that it contains.")
	@CamelizedName("containsPlace")
	@ConstantizedName("CONTAINS_PLACE")
	public interface ContainsPlace extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/containsSeason")
	@SchemaOrgLabel("containsSeason")
	@SchemaOrgComment(""
			+ "A season that is part of the media series.")
	@CamelizedName("containsSeason")
	@ConstantizedName("CONTAINS_SEASON")
	public interface ContainsSeason extends HasPart, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWorkSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeason
		 */
		public Clazz.CreativeWorkSeason getCreativeWorkSeason();
		public void setCreativeWorkSeason(Clazz.CreativeWorkSeason creativeWorkSeason);
		public List<Clazz.CreativeWorkSeason> getCreativeWorkSeasonList();
		public void setCreativeWorkSeasonList(List<Clazz.CreativeWorkSeason> creativeWorkSeasonList);
		public boolean hasCreativeWorkSeason();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentLocation")
	@SchemaOrgLabel("contentLocation")
	@SchemaOrgComment(""
			+ "The location depicted or described in the content. For example, the location in"
			+ " a photograph or painting.")
	@CamelizedName("contentLocation")
	@ConstantizedName("CONTENT_LOCATION")
	public interface ContentLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentRating")
	@SchemaOrgLabel("contentRating")
	@SchemaOrgComment(""
			+ "Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.")
	@CamelizedName("contentRating")
	@ConstantizedName("CONTENT_RATING")
	public interface ContentRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentSize")
	@SchemaOrgLabel("contentSize")
	@SchemaOrgComment("File size in (mega/kilo) bytes.")
	@CamelizedName("contentSize")
	@ConstantizedName("CONTENT_SIZE")
	public interface ContentSize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentType")
	@SchemaOrgLabel("contentType")
	@SchemaOrgComment(""
			+ "The supported content type(s) for an EntryPoint response.")
	@CamelizedName("contentType")
	@ConstantizedName("CONTENT_TYPE")
	public interface ContentType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contentUrl")
	@SchemaOrgLabel("contentUrl")
	@SchemaOrgComment(""
			+ "Actual bytes of the media object, for example the image file or video file.")
	@CamelizedName("contentUrl")
	@ConstantizedName("CONTENT_URL")
	public interface ContentUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contributor")
	@SchemaOrgLabel("contributor")
	@SchemaOrgComment(""
			+ "A secondary contributor to the CreativeWork or Event.")
	@CamelizedName("contributor")
	@ConstantizedName("CONTRIBUTOR")
	public interface Contributor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cookTime")
	@SchemaOrgLabel("cookTime")
	@SchemaOrgComment(""
			+ "The time it takes to actually cook the dish, in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 duration format</a>.")
	@CamelizedName("cookTime")
	@ConstantizedName("COOK_TIME")
	public interface CookTime extends PerformTime, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/cookingMethod")
	@SchemaOrgLabel("cookingMethod")
	@SchemaOrgComment(""
			+ "The method of cooking, such as Frying, Steaming, ...")
	@CamelizedName("cookingMethod")
	@ConstantizedName("COOKING_METHOD")
	public interface CookingMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/copyrightHolder")
	@SchemaOrgLabel("copyrightHolder")
	@SchemaOrgComment(""
			+ "The party holding the legal copyright to the CreativeWork.")
	@CamelizedName("copyrightHolder")
	@ConstantizedName("COPYRIGHT_HOLDER")
	public interface CopyrightHolder extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/copyrightYear")
	@SchemaOrgLabel("copyrightYear")
	@SchemaOrgComment(""
			+ "The year during which the claimed copyright for the CreativeWork was first"
			+ " asserted.")
	@CamelizedName("copyrightYear")
	@ConstantizedName("COPYRIGHT_YEAR")
	public interface CopyrightYear extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/countriesNotSupported")
	@SchemaOrgLabel("countriesNotSupported")
	@SchemaOrgComment(""
			+ "Countries for which the application is not supported. You can also provide the"
			+ " two-letter ISO 3166-1 alpha-2 country code.")
	@CamelizedName("countriesNotSupported")
	@ConstantizedName("COUNTRIES_NOT_SUPPORTED")
	public interface CountriesNotSupported extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/countriesSupported")
	@SchemaOrgLabel("countriesSupported")
	@SchemaOrgComment(""
			+ "Countries for which the application is supported. You can also provide the"
			+ " two-letter ISO 3166-1 alpha-2 country code.")
	@CamelizedName("countriesSupported")
	@ConstantizedName("COUNTRIES_SUPPORTED")
	public interface CountriesSupported extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/countryOfOrigin")
	@SchemaOrgLabel("countryOfOrigin")
	@SchemaOrgComment(""
			+ "The country of the principal offices of the production company or individual"
			+ " responsible for the movie or program.")
	@CamelizedName("countryOfOrigin")
	@ConstantizedName("COUNTRY_OF_ORIGIN")
	public interface CountryOfOrigin extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Country
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Country
		 */
		public Clazz.Country getCountry();
		public void setCountry(Clazz.Country country);
		public List<Clazz.Country> getCountryList();
		public void setCountryList(List<Clazz.Country> countryList);
		public boolean hasCountry();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/courseCode")
	@SchemaOrgLabel("courseCode")
	@SchemaOrgComment(""
			+ "The identifier for the <a class=\"localLink\""
			+ " href=\"http://schema.org/Course\">Course</a> used by the course <a"
			+ " class=\"localLink\" href=\"http://schema.org/provider\">provider</a> (e.g."
			+ " CS101 or 6.001).")
	@CamelizedName("courseCode")
	@ConstantizedName("COURSE_CODE")
	public interface CourseCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/courseMode")
	@SchemaOrgLabel("courseMode")
	@SchemaOrgComment(""
			+ "The medium or means of delivery of the course instance or the mode of study,"
			+ " either as a text label (e.g. \"online\", \"onsite\" or \"blended\";"
			+ " \"synchronous\" or \"asynchronous\"; \"full-time\" or \"part-time\") or as a"
			+ " URL reference to a term from a controlled vocabulary (e.g."
			+ " https://ceds.ed.gov/element/001311#Asynchronous ).")
	@CamelizedName("courseMode")
	@ConstantizedName("COURSE_MODE")
	public interface CourseMode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/coursePrerequisites")
	@SchemaOrgLabel("coursePrerequisites")
	@SchemaOrgComment(""
			+ "Requirements for taking the Course. May be completion of another <a"
			+ " class=\"localLink\" href=\"http://schema.org/Course\">Course</a> or a textual"
			+ " description like \"permission of instructor\". Requirements may be a"
			+ " pre-requisite competency, referenced using <a class=\"localLink\""
			+ " href=\"http://schema.org/AlignmentObject\">AlignmentObject</a>.")
	@CamelizedName("coursePrerequisites")
	@ConstantizedName("COURSE_PREREQUISITES")
	public interface CoursePrerequisites extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/AlignmentObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AlignmentObject
		 */
		public Clazz.AlignmentObject getAlignmentObject();
		public void setAlignmentObject(Clazz.AlignmentObject alignmentObject);
		public List<Clazz.AlignmentObject> getAlignmentObjectList();
		public void setAlignmentObjectList(List<Clazz.AlignmentObject> alignmentObjectList);
		public boolean hasAlignmentObject();

		/**
		 * uri: http://schema.org/Course
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Course
		 */
		public Clazz.Course getCourse();
		public void setCourse(Clazz.Course course);
		public List<Clazz.Course> getCourseList();
		public void setCourseList(List<Clazz.Course> courseList);
		public boolean hasCourse();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/coverageEndTime")
	@SchemaOrgLabel("coverageEndTime")
	@SchemaOrgComment(""
			+ "The time when the live blog will stop covering the Event. Note that coverage may"
			+ " continue after the Event concludes.")
	@CamelizedName("coverageEndTime")
	@ConstantizedName("COVERAGE_END_TIME")
	public interface CoverageEndTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/coverageStartTime")
	@SchemaOrgLabel("coverageStartTime")
	@SchemaOrgComment(""
			+ "The time when the live blog will begin covering the Event. Note that coverage"
			+ " may begin before the Event's start time. The LiveBlogPosting may also be"
			+ " created before coverage begins.")
	@CamelizedName("coverageStartTime")
	@ConstantizedName("COVERAGE_START_TIME")
	public interface CoverageStartTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/creator")
	@SchemaOrgLabel("creator")
	@SchemaOrgComment(""
			+ "The creator/author of this CreativeWork. This is the same as the Author property"
			+ " for CreativeWork.")
	@CamelizedName("creator")
	@ConstantizedName("CREATOR")
	public interface Creator extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/creditedTo")
	@SchemaOrgLabel("creditedTo")
	@SchemaOrgComment(""
			+ "The group the release is credited to if different than the byArtist. For"
			+ " example, Red and Blue is credited to \"Stefani Germanotta Band\", but by Lady"
			+ " Gaga.")
	@CamelizedName("creditedTo")
	@ConstantizedName("CREDITED_TO")
	public interface CreditedTo extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/currenciesAccepted")
	@SchemaOrgLabel("currenciesAccepted")
	@SchemaOrgComment(""
			+ "The currency accepted (in <a href=\"http://en.wikipedia.org/wiki/ISO_4217\">ISO"
			+ " 4217 currency format</a>).")
	@CamelizedName("currenciesAccepted")
	@ConstantizedName("CURRENCIES_ACCEPTED")
	public interface CurrenciesAccepted extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/currency")
	@SchemaOrgLabel("currency")
	@SchemaOrgComment(""
			+ "The currency in which the monetary amount is expressed (in 3-letter <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_4217\">ISO 4217</a> format).")
	@CamelizedName("currency")
	@ConstantizedName("CURRENCY")
	public interface Currency extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/customer")
	@SchemaOrgLabel("customer")
	@SchemaOrgComment(""
			+ "Party placing the order or paying the invoice.")
	@CamelizedName("customer")
	@ConstantizedName("CUSTOMER")
	public interface Customer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dataFeedElement")
	@SchemaOrgLabel("dataFeedElement")
	@SchemaOrgComment(""
			+ "An item within in a data feed. Data feeds may have many elements.")
	@CamelizedName("dataFeedElement")
	@ConstantizedName("DATA_FEED_ELEMENT")
	public interface DataFeedElement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/DataFeedItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DataFeedItem
		 */
		public Clazz.DataFeedItem getDataFeedItem();
		public void setDataFeedItem(Clazz.DataFeedItem dataFeedItem);
		public List<Clazz.DataFeedItem> getDataFeedItemList();
		public void setDataFeedItemList(List<Clazz.DataFeedItem> dataFeedItemList);
		public boolean hasDataFeedItem();

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dataset")
	@SchemaOrgLabel("dataset")
	@SchemaOrgComment("A dataset contained in this catalog.")
	@CamelizedName("dataset")
	@ConstantizedName("DATASET")
	public interface Dataset extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Dataset
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Dataset
		 */
		public Clazz.Dataset getDataset();
		public void setDataset(Clazz.Dataset dataset);
		public List<Clazz.Dataset> getDatasetList();
		public void setDatasetList(List<Clazz.Dataset> datasetList);
		public boolean hasDataset();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateCreated")
	@SchemaOrgLabel("dateCreated")
	@SchemaOrgComment(""
			+ "The date on which the CreativeWork was created or the item was added to a"
			+ " DataFeed.")
	@CamelizedName("dateCreated")
	@ConstantizedName("DATE_CREATED")
	public interface DateCreated extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateDeleted")
	@SchemaOrgLabel("dateDeleted")
	@SchemaOrgComment(""
			+ "The datetime the item was removed from the DataFeed.")
	@CamelizedName("dateDeleted")
	@ConstantizedName("DATE_DELETED")
	public interface DateDeleted extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateIssued")
	@SchemaOrgLabel("dateIssued")
	@SchemaOrgComment("The date the ticket was issued.")
	@CamelizedName("dateIssued")
	@ConstantizedName("DATE_ISSUED")
	public interface DateIssued extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateModified")
	@SchemaOrgLabel("dateModified")
	@SchemaOrgComment(""
			+ "The date on which the CreativeWork was most recently modified or when the item's"
			+ " entry was modified within a DataFeed.")
	@CamelizedName("dateModified")
	@ConstantizedName("DATE_MODIFIED")
	public interface DateModified extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/datePosted")
	@SchemaOrgLabel("datePosted")
	@SchemaOrgComment("Publication date for the job posting.")
	@CamelizedName("datePosted")
	@ConstantizedName("DATE_POSTED")
	public interface DatePosted extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/datePublished")
	@SchemaOrgLabel("datePublished")
	@SchemaOrgComment("Date of first broadcast/publication.")
	@CamelizedName("datePublished")
	@ConstantizedName("DATE_PUBLISHED")
	public interface DatePublished extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateRead")
	@SchemaOrgLabel("dateRead")
	@SchemaOrgComment(""
			+ "The date/time at which the message has been read by the recipient if a single"
			+ " recipient exists.")
	@CamelizedName("dateRead")
	@ConstantizedName("DATE_READ")
	public interface DateRead extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateReceived")
	@SchemaOrgLabel("dateReceived")
	@SchemaOrgComment(""
			+ "The date/time the message was received if a single recipient exists.")
	@CamelizedName("dateReceived")
	@ConstantizedName("DATE_RECEIVED")
	public interface DateReceived extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateSent")
	@SchemaOrgLabel("dateSent")
	@SchemaOrgComment(""
			+ "The date/time at which the message was sent.")
	@CamelizedName("dateSent")
	@ConstantizedName("DATE_SENT")
	public interface DateSent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateVehicleFirstRegistered")
	@SchemaOrgLabel("dateVehicleFirstRegistered")
	@SchemaOrgComment(""
			+ "The date of the first registration of the vehicle with the respective public"
			+ " authorities.")
	@CamelizedName("dateVehicleFirstRegistered")
	@ConstantizedName("DATE_VEHICLE_FIRST_REGISTERED")
	public interface DateVehicleFirstRegistered extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dateline")
	@SchemaOrgLabel("dateline")
	@SchemaOrgComment(""
			+ "A <a href=\"https://en.wikipedia.org/wiki/Dateline\">dateline</a> is a brief"
			+ " piece of text included in news articles that describes where and when the story"
			+ " was written or filed though the date is often omitted. Sometimes only a"
			+ " placename is provided.")
	@CamelizedName("dateline")
	@ConstantizedName("DATELINE")
	public interface Dateline extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dayOfWeek")
	@SchemaOrgLabel("dayOfWeek")
	@SchemaOrgComment(""
			+ "The day of the week for which these opening hours are valid.")
	@CamelizedName("dayOfWeek")
	@ConstantizedName("DAY_OF_WEEK")
	public interface DayOfWeek extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DayOfWeek
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DayOfWeek
		 */
		public Clazz.DayOfWeek getDayOfWeek();
		public void setDayOfWeek(Clazz.DayOfWeek dayOfWeek);
		public List<Clazz.DayOfWeek> getDayOfWeekList();
		public void setDayOfWeekList(List<Clazz.DayOfWeek> dayOfWeekList);
		public boolean hasDayOfWeek();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deathDate")
	@SchemaOrgLabel("deathDate")
	@SchemaOrgComment("Date of death.")
	@CamelizedName("deathDate")
	@ConstantizedName("DEATH_DATE")
	public interface DeathDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deathPlace")
	@SchemaOrgLabel("deathPlace")
	@SchemaOrgComment("The place where the person died.")
	@CamelizedName("deathPlace")
	@ConstantizedName("DEATH_PLACE")
	public interface DeathPlace extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/defaultValue")
	@SchemaOrgLabel("defaultValue")
	@SchemaOrgComment(""
			+ "The default value of the input.  For properties that expect a literal, the"
			+ " default is a literal value, for properties that expect an object, it's an ID"
			+ " reference to one of the current values.")
	@CamelizedName("defaultValue")
	@ConstantizedName("DEFAULT_VALUE")
	public interface DefaultValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deliveryAddress")
	@SchemaOrgLabel("deliveryAddress")
	@SchemaOrgComment("Destination address.")
	@CamelizedName("deliveryAddress")
	@ConstantizedName("DELIVERY_ADDRESS")
	public interface DeliveryAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deliveryLeadTime")
	@SchemaOrgLabel("deliveryLeadTime")
	@SchemaOrgComment(""
			+ "The typical delay between the receipt of the order and the goods either leaving"
			+ " the warehouse or being prepared for pickup, in case the delivery method is on"
			+ " site pickup.")
	@CamelizedName("deliveryLeadTime")
	@ConstantizedName("DELIVERY_LEAD_TIME")
	public interface DeliveryLeadTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deliveryMethod")
	@SchemaOrgLabel("deliveryMethod")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The method of delivery.")
	@CamelizedName("deliveryMethod")
	@ConstantizedName("DELIVERY_METHOD")
	public interface DeliveryMethod extends Instrument, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryMethod
		 */
		public Clazz.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Clazz.DeliveryMethod deliveryMethod);
		public List<Clazz.DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<Clazz.DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/deliveryStatus")
	@SchemaOrgLabel("deliveryStatus")
	@SchemaOrgComment(""
			+ "New entry added as the package passes through each leg of its journey (from"
			+ " shipment to final delivery).")
	@CamelizedName("deliveryStatus")
	@ConstantizedName("DELIVERY_STATUS")
	public interface DeliveryStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DeliveryEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryEvent
		 */
		public Clazz.DeliveryEvent getDeliveryEvent();
		public void setDeliveryEvent(Clazz.DeliveryEvent deliveryEvent);
		public List<Clazz.DeliveryEvent> getDeliveryEventList();
		public void setDeliveryEventList(List<Clazz.DeliveryEvent> deliveryEventList);
		public boolean hasDeliveryEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/department")
	@SchemaOrgLabel("department")
	@SchemaOrgComment(""
			+ "A relationship between an organization and a department of that organization,"
			+ " also described as an organization (allowing different urls, logos, opening"
			+ " hours). For example: a store with a pharmacy, or a bakery with a cafe.")
	@CamelizedName("department")
	@ConstantizedName("DEPARTMENT")
	public interface Department extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureAirport")
	@SchemaOrgLabel("departureAirport")
	@SchemaOrgComment(""
			+ "The airport where the flight originates.")
	@CamelizedName("departureAirport")
	@ConstantizedName("DEPARTURE_AIRPORT")
	public interface DepartureAirport extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Airport
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Airport
		 */
		public Clazz.Airport getAirport();
		public void setAirport(Clazz.Airport airport);
		public List<Clazz.Airport> getAirportList();
		public void setAirportList(List<Clazz.Airport> airportList);
		public boolean hasAirport();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureBusStop")
	@SchemaOrgLabel("departureBusStop")
	@SchemaOrgComment(""
			+ "The stop or station from which the bus departs.")
	@CamelizedName("departureBusStop")
	@ConstantizedName("DEPARTURE_BUS_STOP")
	public interface DepartureBusStop extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BusStop
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusStop
		 */
		public Clazz.BusStop getBusStop();
		public void setBusStop(Clazz.BusStop busStop);
		public List<Clazz.BusStop> getBusStopList();
		public void setBusStopList(List<Clazz.BusStop> busStopList);
		public boolean hasBusStop();

		/**
		 * uri: http://schema.org/BusStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusStation
		 */
		public Clazz.BusStation getBusStation();
		public void setBusStation(Clazz.BusStation busStation);
		public List<Clazz.BusStation> getBusStationList();
		public void setBusStationList(List<Clazz.BusStation> busStationList);
		public boolean hasBusStation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureGate")
	@SchemaOrgLabel("departureGate")
	@SchemaOrgComment(""
			+ "Identifier of the flight's departure gate.")
	@CamelizedName("departureGate")
	@ConstantizedName("DEPARTURE_GATE")
	public interface DepartureGate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departurePlatform")
	@SchemaOrgLabel("departurePlatform")
	@SchemaOrgComment(""
			+ "The platform from which the train departs.")
	@CamelizedName("departurePlatform")
	@ConstantizedName("DEPARTURE_PLATFORM")
	public interface DeparturePlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureStation")
	@SchemaOrgLabel("departureStation")
	@SchemaOrgComment(""
			+ "The station from which the train departs.")
	@CamelizedName("departureStation")
	@ConstantizedName("DEPARTURE_STATION")
	public interface DepartureStation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/TrainStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.TrainStation
		 */
		public Clazz.TrainStation getTrainStation();
		public void setTrainStation(Clazz.TrainStation trainStation);
		public List<Clazz.TrainStation> getTrainStationList();
		public void setTrainStationList(List<Clazz.TrainStation> trainStationList);
		public boolean hasTrainStation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureTerminal")
	@SchemaOrgLabel("departureTerminal")
	@SchemaOrgComment(""
			+ "Identifier of the flight's departure terminal.")
	@CamelizedName("departureTerminal")
	@ConstantizedName("DEPARTURE_TERMINAL")
	public interface DepartureTerminal extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/departureTime")
	@SchemaOrgLabel("departureTime")
	@SchemaOrgComment("The expected departure time.")
	@CamelizedName("departureTime")
	@ConstantizedName("DEPARTURE_TIME")
	public interface DepartureTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dependencies")
	@SchemaOrgLabel("dependencies")
	@SchemaOrgComment(""
			+ "Prerequisites needed to fulfill steps in article.")
	@CamelizedName("dependencies")
	@ConstantizedName("DEPENDENCIES")
	public interface Dependencies extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/depth")
	@SchemaOrgLabel("depth")
	@SchemaOrgComment("The depth of the item.")
	@CamelizedName("depth")
	@ConstantizedName("DEPTH")
	public interface Depth extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/description")
	@SchemaOrgLabel("description")
	@SchemaOrgComment("A description of the item.")
	@CamelizedName("description")
	@ConstantizedName("DESCRIPTION")
	public interface Description extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/director")
	@SchemaOrgLabel("director")
	@SchemaOrgComment(""
			+ "A director of e.g. tv, radio, movie, video gaming etc. content, or of an event."
			+ " Directors can be associated with individual items or with a series, episode,"
			+ " clip.")
	@CamelizedName("director")
	@ConstantizedName("DIRECTOR")
	public interface Director extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/disambiguatingDescription")
	@SchemaOrgLabel("disambiguatingDescription")
	@SchemaOrgComment(""
			+ "A sub property of description. A short description of the item used to"
			+ " disambiguate from other, similar items. Information from other properties (in"
			+ " particular, name) may be necessary for the description to be useful for"
			+ " disambiguation.")
	@CamelizedName("disambiguatingDescription")
	@ConstantizedName("DISAMBIGUATING_DESCRIPTION")
	public interface DisambiguatingDescription extends Description, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/discount")
	@SchemaOrgLabel("discount")
	@SchemaOrgComment("Any discount applied (to an Order).")
	@CamelizedName("discount")
	@ConstantizedName("DISCOUNT")
	public interface Discount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/discountCode")
	@SchemaOrgLabel("discountCode")
	@SchemaOrgComment("Code used to redeem a discount.")
	@CamelizedName("discountCode")
	@ConstantizedName("DISCOUNT_CODE")
	public interface DiscountCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/discountCurrency")
	@SchemaOrgLabel("discountCurrency")
	@SchemaOrgComment(""
			+ "The currency (in 3-letter ISO 4217 format) of the discount.")
	@CamelizedName("discountCurrency")
	@ConstantizedName("DISCOUNT_CURRENCY")
	public interface DiscountCurrency extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/discusses")
	@SchemaOrgLabel("discusses")
	@SchemaOrgComment(""
			+ "Specifies the CreativeWork associated with the UserComment.")
	@CamelizedName("discusses")
	@ConstantizedName("DISCUSSES")
	public interface Discusses extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/discussionUrl")
	@SchemaOrgLabel("discussionUrl")
	@SchemaOrgComment(""
			+ "A link to the page containing the comments of the CreativeWork.")
	@CamelizedName("discussionUrl")
	@ConstantizedName("DISCUSSION_URL")
	public interface DiscussionUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dissolutionDate")
	@SchemaOrgLabel("dissolutionDate")
	@SchemaOrgComment(""
			+ "The date that this organization was dissolved.")
	@CamelizedName("dissolutionDate")
	@ConstantizedName("DISSOLUTION_DATE")
	public interface DissolutionDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/distance")
	@SchemaOrgLabel("distance")
	@SchemaOrgComment(""
			+ "The distance travelled, e.g. exercising or travelling.")
	@CamelizedName("distance")
	@ConstantizedName("DISTANCE")
	public interface Distance extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/distribution")
	@SchemaOrgLabel("distribution")
	@SchemaOrgComment(""
			+ "A downloadable form of this dataset, at a specific location, in a specific"
			+ " format.")
	@CamelizedName("distribution")
	@ConstantizedName("DISTRIBUTION")
	public interface Distribution extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DataDownload
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DataDownload
		 */
		public Clazz.DataDownload getDataDownload();
		public void setDataDownload(Clazz.DataDownload dataDownload);
		public List<Clazz.DataDownload> getDataDownloadList();
		public void setDataDownloadList(List<Clazz.DataDownload> dataDownloadList);
		public boolean hasDataDownload();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/doorTime")
	@SchemaOrgLabel("doorTime")
	@SchemaOrgComment("The time admission will commence.")
	@CamelizedName("doorTime")
	@ConstantizedName("DOOR_TIME")
	public interface DoorTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/downloadUrl")
	@SchemaOrgLabel("downloadUrl")
	@SchemaOrgComment(""
			+ "If the file can be downloaded, URL to download the binary.")
	@CamelizedName("downloadUrl")
	@ConstantizedName("DOWNLOAD_URL")
	public interface DownloadUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/downvoteCount")
	@SchemaOrgLabel("downvoteCount")
	@SchemaOrgComment(""
			+ "The number of downvotes this question, answer or comment has received from the"
			+ " community.")
	@CamelizedName("downvoteCount")
	@ConstantizedName("DOWNVOTE_COUNT")
	public interface DownvoteCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/driveWheelConfiguration")
	@SchemaOrgLabel("driveWheelConfiguration")
	@SchemaOrgComment(""
			+ "The drive wheel configuration, i.e. which roadwheels will receive torque from"
			+ " the vehicle's engine via the drivetrain.")
	@CamelizedName("driveWheelConfiguration")
	@ConstantizedName("DRIVE_WHEEL_CONFIGURATION")
	public interface DriveWheelConfiguration extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/DriveWheelConfigurationValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DriveWheelConfigurationValue
		 */
		public Clazz.DriveWheelConfigurationValue getDriveWheelConfigurationValue();
		public void setDriveWheelConfigurationValue(Clazz.DriveWheelConfigurationValue driveWheelConfigurationValue);
		public List<Clazz.DriveWheelConfigurationValue> getDriveWheelConfigurationValueList();
		public void setDriveWheelConfigurationValueList(List<Clazz.DriveWheelConfigurationValue> driveWheelConfigurationValueList);
		public boolean hasDriveWheelConfigurationValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dropoffLocation")
	@SchemaOrgLabel("dropoffLocation")
	@SchemaOrgComment("Where a rental car can be dropped off.")
	@CamelizedName("dropoffLocation")
	@ConstantizedName("DROPOFF_LOCATION")
	public interface DropoffLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dropoffTime")
	@SchemaOrgLabel("dropoffTime")
	@SchemaOrgComment("When a rental car can be dropped off.")
	@CamelizedName("dropoffTime")
	@ConstantizedName("DROPOFF_TIME")
	public interface DropoffTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/duns")
	@SchemaOrgLabel("duns")
	@SchemaOrgComment(""
			+ "The Dun &amp; Bradstreet DUNS number for identifying an organization or business"
			+ " person.")
	@CamelizedName("duns")
	@ConstantizedName("DUNS")
	public interface Duns extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

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
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/durationOfWarranty")
	@SchemaOrgLabel("durationOfWarranty")
	@SchemaOrgComment(""
			+ "The duration of the warranty promise. Common unitCode values are ANN for year,"
			+ " MON for months, or DAY for days.")
	@CamelizedName("durationOfWarranty")
	@ConstantizedName("DURATION_OF_WARRANTY")
	public interface DurationOfWarranty extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/duringMedia")
	@SchemaOrgLabel("duringMedia")
	@SchemaOrgComment(""
			+ "A media object representing the circumstances while performing this direction.")
	@CamelizedName("duringMedia")
	@ConstantizedName("DURING_MEDIA")
	public interface DuringMedia extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MediaObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject
		 */
		public Clazz.MediaObject getMediaObject();
		public void setMediaObject(Clazz.MediaObject mediaObject);
		public List<Clazz.MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<Clazz.MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/editor")
	@SchemaOrgLabel("editor")
	@SchemaOrgComment(""
			+ "Specifies the Person who edited the CreativeWork.")
	@CamelizedName("editor")
	@ConstantizedName("EDITOR")
	public interface Editor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/educationalAlignment")
	@SchemaOrgLabel("educationalAlignment")
	@SchemaOrgComment(""
			+ "An alignment to an established educational framework.")
	@CamelizedName("educationalAlignment")
	@ConstantizedName("EDUCATIONAL_ALIGNMENT")
	public interface EducationalAlignment extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/AlignmentObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AlignmentObject
		 */
		public Clazz.AlignmentObject getAlignmentObject();
		public void setAlignmentObject(Clazz.AlignmentObject alignmentObject);
		public List<Clazz.AlignmentObject> getAlignmentObjectList();
		public void setAlignmentObjectList(List<Clazz.AlignmentObject> alignmentObjectList);
		public boolean hasAlignmentObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/educationalFramework")
	@SchemaOrgLabel("educationalFramework")
	@SchemaOrgComment(""
			+ "The framework to which the resource being described is aligned.")
	@CamelizedName("educationalFramework")
	@ConstantizedName("EDUCATIONAL_FRAMEWORK")
	public interface EducationalFramework extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/educationalRole")
	@SchemaOrgLabel("educationalRole")
	@SchemaOrgComment(""
			+ "An educationalRole of an EducationalAudience.")
	@CamelizedName("educationalRole")
	@ConstantizedName("EDUCATIONAL_ROLE")
	public interface EducationalRole extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/educationalUse")
	@SchemaOrgLabel("educationalUse")
	@SchemaOrgComment(""
			+ "The purpose of a work in the context of education; for example, 'assignment',"
			+ " 'group work'.")
	@CamelizedName("educationalUse")
	@ConstantizedName("EDUCATIONAL_USE")
	public interface EducationalUse extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/elevation")
	@SchemaOrgLabel("elevation")
	@SchemaOrgComment(""
			+ "The elevation of a location (<a"
			+ " href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>).")
	@CamelizedName("elevation")
	@ConstantizedName("ELEVATION")
	public interface Elevation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eligibleCustomerType")
	@SchemaOrgLabel("eligibleCustomerType")
	@SchemaOrgComment(""
			+ "The type(s) of customers for which the given offer is valid.")
	@CamelizedName("eligibleCustomerType")
	@ConstantizedName("ELIGIBLE_CUSTOMER_TYPE")
	public interface EligibleCustomerType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BusinessEntityType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BusinessEntityType
		 */
		public Clazz.BusinessEntityType getBusinessEntityType();
		public void setBusinessEntityType(Clazz.BusinessEntityType businessEntityType);
		public List<Clazz.BusinessEntityType> getBusinessEntityTypeList();
		public void setBusinessEntityTypeList(List<Clazz.BusinessEntityType> businessEntityTypeList);
		public boolean hasBusinessEntityType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eligibleDuration")
	@SchemaOrgLabel("eligibleDuration")
	@SchemaOrgComment(""
			+ "The duration for which the given offer is valid.")
	@CamelizedName("eligibleDuration")
	@ConstantizedName("ELIGIBLE_DURATION")
	public interface EligibleDuration extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eligibleQuantity")
	@SchemaOrgLabel("eligibleQuantity")
	@SchemaOrgComment(""
			+ "The interval and unit of measurement of ordering quantities for which the offer"
			+ " or price specification is valid. This allows e.g. specifying that a certain"
			+ " freight charge is valid only for a certain quantity.")
	@CamelizedName("eligibleQuantity")
	@ConstantizedName("ELIGIBLE_QUANTITY")
	public interface EligibleQuantity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eligibleRegion")
	@SchemaOrgLabel("eligibleRegion")
	@SchemaOrgComment(""
			+ "The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the"
			+ " GeoShape for the geo-political region(s) for which the offer or delivery charge"
			+ " specification is valid.</p>\n\n<p>See also <a class=\"localLink\""
			+ " href=\"http://schema.org/ineligibleRegion\">ineligibleRegion</a>.")
	@CamelizedName("eligibleRegion")
	@ConstantizedName("ELIGIBLE_REGION")
	public interface EligibleRegion extends AreaServed, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GeoShape
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoShape
		 */
		public Clazz.GeoShape getGeoShape();
		public void setGeoShape(Clazz.GeoShape geoShape);
		public List<Clazz.GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<Clazz.GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eligibleTransactionVolume")
	@SchemaOrgLabel("eligibleTransactionVolume")
	@SchemaOrgComment(""
			+ "The transaction volume, in a monetary unit, for which the offer or price"
			+ " specification is valid, e.g. for indicating a minimal purchasing volume, to"
			+ " express free shipping above a certain order volume, or to limit the acceptance"
			+ " of credit cards to purchases to a certain minimal amount.")
	@CamelizedName("eligibleTransactionVolume")
	@ConstantizedName("ELIGIBLE_TRANSACTION_VOLUME")
	public interface EligibleTransactionVolume extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/email")
	@SchemaOrgLabel("email")
	@SchemaOrgComment("Email address.")
	@CamelizedName("email")
	@ConstantizedName("EMAIL")
	public interface Email extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/embedUrl")
	@SchemaOrgLabel("embedUrl")
	@SchemaOrgComment(""
			+ "A URL pointing to a player for a specific video. In general, this is the"
			+ " information in the <code>src</code> element of an <code>embed</code> tag and"
			+ " should not be the same as the content of the <code>loc</code> tag.")
	@CamelizedName("embedUrl")
	@ConstantizedName("EMBED_URL")
	public interface EmbedUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/employee")
	@SchemaOrgLabel("employee")
	@SchemaOrgComment("Someone working for this organization.")
	@CamelizedName("employee")
	@ConstantizedName("EMPLOYEE")
	public interface Employee extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/employmentType")
	@SchemaOrgLabel("employmentType")
	@SchemaOrgComment(""
			+ "Type of employment (e.g. full-time, part-time, contract, temporary, seasonal,"
			+ " internship).")
	@CamelizedName("employmentType")
	@ConstantizedName("EMPLOYMENT_TYPE")
	public interface EmploymentType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/encodesCreativeWork")
	@SchemaOrgLabel("encodesCreativeWork")
	@SchemaOrgComment(""
			+ "The CreativeWork encoded by this media object.")
	@CamelizedName("encodesCreativeWork")
	@ConstantizedName("ENCODES_CREATIVE_WORK")
	public interface EncodesCreativeWork extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/encoding")
	@SchemaOrgLabel("encoding")
	@SchemaOrgComment(""
			+ "A media object that encodes this CreativeWork. This property is a synonym for"
			+ " associatedMedia.")
	@CamelizedName("encoding")
	@ConstantizedName("ENCODING")
	public interface Encoding extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MediaObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MediaObject
		 */
		public Clazz.MediaObject getMediaObject();
		public void setMediaObject(Clazz.MediaObject mediaObject);
		public List<Clazz.MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<Clazz.MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/encodingFormat")
	@SchemaOrgLabel("encodingFormat")
	@SchemaOrgComment("mp3, mpeg4, etc.")
	@CamelizedName("encodingFormat")
	@ConstantizedName("ENCODING_FORMAT")
	public interface EncodingFormat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/encodingType")
	@SchemaOrgLabel("encodingType")
	@SchemaOrgComment(""
			+ "The supported encoding type(s) for an EntryPoint request.")
	@CamelizedName("encodingType")
	@ConstantizedName("ENCODING_TYPE")
	public interface EncodingType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/endDate")
	@SchemaOrgLabel("endDate")
	@SchemaOrgComment(""
			+ "The end date and time of the item (in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>).")
	@CamelizedName("endDate")
	@ConstantizedName("END_DATE")
	public interface EndDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/endTime")
	@SchemaOrgLabel("endTime")
	@SchemaOrgComment(""
			+ "The endTime of something. For a reserved event or service (e.g."
			+ " FoodEstablishmentReservation), the time that it is expected to end. For actions"
			+ " that span a period of time, when the action was performed. e.g. John wrote a"
			+ " book from January to <em>December</em>.</p>\n\n<p>Note that Event uses"
			+ " startDate/endDate instead of startTime/endTime, even when describing dates with"
			+ " times. This situation may be clarified in future revisions.")
	@CamelizedName("endTime")
	@ConstantizedName("END_TIME")
	public interface EndTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/endorsee")
	@SchemaOrgLabel("endorsee")
	@SchemaOrgComment(""
			+ "A sub property of participant. The person/organization being supported.")
	@CamelizedName("endorsee")
	@ConstantizedName("ENDORSEE")
	public interface Endorsee extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/entertainmentBusiness")
	@SchemaOrgLabel("entertainmentBusiness")
	@SchemaOrgComment(""
			+ "A sub property of location. The entertainment business where the action"
			+ " occurred.")
	@CamelizedName("entertainmentBusiness")
	@ConstantizedName("ENTERTAINMENT_BUSINESS")
	public interface EntertainmentBusiness extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/EntertainmentBusiness
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.EntertainmentBusiness
		 */
		public Clazz.EntertainmentBusiness getEntertainmentBusiness();
		public void setEntertainmentBusiness(Clazz.EntertainmentBusiness entertainmentBusiness);
		public List<Clazz.EntertainmentBusiness> getEntertainmentBusinessList();
		public void setEntertainmentBusinessList(List<Clazz.EntertainmentBusiness> entertainmentBusinessList);
		public boolean hasEntertainmentBusiness();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/episode")
	@SchemaOrgLabel("episode")
	@SchemaOrgComment(""
			+ "An episode of a tv, radio or game media within a series or season.")
	@CamelizedName("episode")
	@ConstantizedName("EPISODE")
	public interface Episode extends HasPart, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Episode
		 */
		public Clazz.Episode getEpisode();
		public void setEpisode(Clazz.Episode episode);
		public List<Clazz.Episode> getEpisodeList();
		public void setEpisodeList(List<Clazz.Episode> episodeList);
		public boolean hasEpisode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/episodeNumber")
	@SchemaOrgLabel("episodeNumber")
	@SchemaOrgComment(""
			+ "Position of the episode within an ordered group of episodes.")
	@CamelizedName("episodeNumber")
	@ConstantizedName("EPISODE_NUMBER")
	public interface EpisodeNumber extends Position, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/equal")
	@SchemaOrgLabel("equal")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is"
			+ " equal to the object.")
	@CamelizedName("equal")
	@ConstantizedName("EQUAL")
	public interface Equal extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/error")
	@SchemaOrgLabel("error")
	@SchemaOrgComment(""
			+ "For failed actions, more information on the cause of the failure.")
	@CamelizedName("error")
	@ConstantizedName("ERROR")
	public interface Error extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/estimatedCost")
	@SchemaOrgLabel("estimatedCost")
	@SchemaOrgComment(""
			+ "The estimated cost of the supply or supplies consumed when performing"
			+ " instructions.")
	@CamelizedName("estimatedCost")
	@ConstantizedName("ESTIMATED_COST")
	public interface EstimatedCost extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/estimatedFlightDuration")
	@SchemaOrgLabel("estimatedFlightDuration")
	@SchemaOrgComment(""
			+ "The estimated time the flight will take.")
	@CamelizedName("estimatedFlightDuration")
	@ConstantizedName("ESTIMATED_FLIGHT_DURATION")
	public interface EstimatedFlightDuration extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/event")
	@SchemaOrgLabel("event")
	@SchemaOrgComment(""
			+ "Upcoming or past event associated with this place, organization, or action.")
	@CamelizedName("event")
	@ConstantizedName("EVENT")
	public interface Event extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/eventStatus")
	@SchemaOrgLabel("eventStatus")
	@SchemaOrgComment(""
			+ "An eventStatus of an event represents its status; particularly useful when an"
			+ " event is cancelled or rescheduled.")
	@CamelizedName("eventStatus")
	@ConstantizedName("EVENT_STATUS")
	public interface EventStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/EventStatusType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.EventStatusType
		 */
		public Clazz.EventStatusType getEventStatusType();
		public void setEventStatusType(Clazz.EventStatusType eventStatusType);
		public List<Clazz.EventStatusType> getEventStatusTypeList();
		public void setEventStatusTypeList(List<Clazz.EventStatusType> eventStatusTypeList);
		public boolean hasEventStatusType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exampleOfWork")
	@SchemaOrgLabel("exampleOfWork")
	@SchemaOrgComment(""
			+ "A creative work that this work is an example/instance/realization/derivation of.")
	@CamelizedName("exampleOfWork")
	@ConstantizedName("EXAMPLE_OF_WORK")
	public interface ExampleOfWork extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/executableLibraryName")
	@SchemaOrgLabel("executableLibraryName")
	@SchemaOrgComment(""
			+ "Library file name e.g., mscorlib.dll, system.web.dll.")
	@CamelizedName("executableLibraryName")
	@ConstantizedName("EXECUTABLE_LIBRARY_NAME")
	public interface ExecutableLibraryName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exerciseCourse")
	@SchemaOrgLabel("exerciseCourse")
	@SchemaOrgComment(""
			+ "A sub property of location. The course where this action was taken.")
	@CamelizedName("exerciseCourse")
	@ConstantizedName("EXERCISE_COURSE")
	public interface ExerciseCourse extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exifData")
	@SchemaOrgLabel("exifData")
	@SchemaOrgComment("exif data for this object.")
	@CamelizedName("exifData")
	@ConstantizedName("EXIF_DATA")
	public interface ExifData extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/PropertyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue
		 */
		public Clazz.PropertyValue getPropertyValue();
		public void setPropertyValue(Clazz.PropertyValue propertyValue);
		public List<Clazz.PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<Clazz.PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/expectedArrivalFrom")
	@SchemaOrgLabel("expectedArrivalFrom")
	@SchemaOrgComment(""
			+ "The earliest date the package may arrive.")
	@CamelizedName("expectedArrivalFrom")
	@ConstantizedName("EXPECTED_ARRIVAL_FROM")
	public interface ExpectedArrivalFrom extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/expectedArrivalUntil")
	@SchemaOrgLabel("expectedArrivalUntil")
	@SchemaOrgComment("The latest date the package may arrive.")
	@CamelizedName("expectedArrivalUntil")
	@ConstantizedName("EXPECTED_ARRIVAL_UNTIL")
	public interface ExpectedArrivalUntil extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

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
		 * uri: http://schema.org/Offer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Offer
		 */
		public Clazz.Offer getOffer();
		public void setOffer(Clazz.Offer offer);
		public List<Clazz.Offer> getOfferList();
		public void setOfferList(List<Clazz.Offer> offerList);
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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/expires")
	@SchemaOrgLabel("expires")
	@SchemaOrgComment(""
			+ "Date the content expires and is no longer useful or available. For example a <a"
			+ " class=\"localLink\" href=\"http://schema.org/VideoObject\">VideoObject</a> or"
			+ " <a class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a>"
			+ " whose availability or relevance is time-limited, or a <a class=\"localLink\""
			+ " href=\"http://schema.org/ClaimReview\">ClaimReview</a> fact check whose"
			+ " publisher wants to indicate that it may no longer be relevant (or helpful to"
			+ " highlight) after some date.")
	@CamelizedName("expires")
	@ConstantizedName("EXPIRES")
	public interface Expires extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/familyName")
	@SchemaOrgLabel("familyName")
	@SchemaOrgComment(""
			+ "Family name. In the U.S., the last name of an Person. This can be used along"
			+ " with givenName instead of the name property.")
	@CamelizedName("familyName")
	@ConstantizedName("FAMILY_NAME")
	public interface FamilyName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://kyojo.org/schemaSpl/familyNameRuby")
	@SchemaOrgLabel("familyNameRuby")
	@SchemaOrgComment(""
			+ "Family name. Japanese furigana and things like that.")
	@CamelizedName("familyNameRuby")
	@ConstantizedName("FAMILY_NAME_RUBY")
	public interface FamilyNameRuby extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fatContent")
	@SchemaOrgLabel("fatContent")
	@SchemaOrgComment("The number of grams of fat.")
	@CamelizedName("fatContent")
	@ConstantizedName("FAT_CONTENT")
	public interface FatContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/faxNumber")
	@SchemaOrgLabel("faxNumber")
	@SchemaOrgComment("The fax number.")
	@CamelizedName("faxNumber")
	@ConstantizedName("FAX_NUMBER")
	public interface FaxNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/featureList")
	@SchemaOrgLabel("featureList")
	@SchemaOrgComment(""
			+ "Features or modules provided by this application (and possibly required by other"
			+ " applications).")
	@CamelizedName("featureList")
	@ConstantizedName("FEATURE_LIST")
	public interface FeatureList extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/feesAndCommissionsSpecification")
	@SchemaOrgLabel("feesAndCommissionsSpecification")
	@SchemaOrgComment(""
			+ "Description of fees, commissions, and other terms applied either to a class of"
			+ " financial product, or by a financial service organization.")
	@CamelizedName("feesAndCommissionsSpecification")
	@ConstantizedName("FEES_AND_COMMISSIONS_SPECIFICATION")
	public interface FeesAndCommissionsSpecification extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fiberContent")
	@SchemaOrgLabel("fiberContent")
	@SchemaOrgComment("The number of grams of fiber.")
	@CamelizedName("fiberContent")
	@ConstantizedName("FIBER_CONTENT")
	public interface FiberContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fileFormat")
	@SchemaOrgLabel("fileFormat")
	@SchemaOrgComment(""
			+ "Media type, typically MIME format (see <a"
			+ " href=\"http://www.iana.org/assignments/media-types/media-types.xhtml\">IANA"
			+ " site</a>) of the content e.g. application/zip of a SoftwareApplication binary."
			+ " In cases where a CreativeWork has several media type representations,"
			+ " 'encoding' can be used to indicate each MediaObject alongside particular"
			+ " fileFormat information. Unregistered or niche file formats can be indicated"
			+ " instead via the most appropriate URL, e.g. defining Web page or a Wikipedia"
			+ " entry.")
	@CamelizedName("fileFormat")
	@ConstantizedName("FILE_FORMAT")
	public interface FileFormat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fileSize")
	@SchemaOrgLabel("fileSize")
	@SchemaOrgComment(""
			+ "Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB"
			+ " etc.), KB will be assumed.")
	@CamelizedName("fileSize")
	@ConstantizedName("FILE_SIZE")
	public interface FileSize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/firstPerformance")
	@SchemaOrgLabel("firstPerformance")
	@SchemaOrgComment(""
			+ "The date and place the work was first performed.")
	@CamelizedName("firstPerformance")
	@ConstantizedName("FIRST_PERFORMANCE")
	public interface FirstPerformance extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/flightDistance")
	@SchemaOrgLabel("flightDistance")
	@SchemaOrgComment("The distance of the flight.")
	@CamelizedName("flightDistance")
	@ConstantizedName("FLIGHT_DISTANCE")
	public interface FlightDistance extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/flightNumber")
	@SchemaOrgLabel("flightNumber")
	@SchemaOrgComment(""
			+ "The unique identifier for a flight including the airline IATA code. For example,"
			+ " if describing United flight 110, where the IATA code for United is 'UA', the"
			+ " flightNumber is 'UA110'.")
	@CamelizedName("flightNumber")
	@ConstantizedName("FLIGHT_NUMBER")
	public interface FlightNumber extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/floorSize")
	@SchemaOrgLabel("floorSize")
	@SchemaOrgComment(""
			+ "The size of the accommodation, e.g. in square meter or squarefoot.\nTypical unit"
			+ " code(s): MTK for square meter, FTK for square foot, or YDK for square yard")
	@CamelizedName("floorSize")
	@ConstantizedName("FLOOR_SIZE")
	public interface FloorSize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/followee")
	@SchemaOrgLabel("followee")
	@SchemaOrgComment(""
			+ "A sub property of object. The person or organization being followed.")
	@CamelizedName("followee")
	@ConstantizedName("FOLLOWEE")
	public interface Followee extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/follows")
	@SchemaOrgLabel("follows")
	@SchemaOrgComment(""
			+ "The most generic uni-directional social relation.")
	@CamelizedName("follows")
	@ConstantizedName("FOLLOWS")
	public interface Follows extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/foodEstablishment")
	@SchemaOrgLabel("foodEstablishment")
	@SchemaOrgComment(""
			+ "A sub property of location. The specific food establishment where the action"
			+ " occurred.")
	@CamelizedName("foodEstablishment")
	@ConstantizedName("FOOD_ESTABLISHMENT")
	public interface FoodEstablishment extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/FoodEstablishment
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.FoodEstablishment
		 */
		public Clazz.FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(Clazz.FoodEstablishment foodEstablishment);
		public List<Clazz.FoodEstablishment> getFoodEstablishmentList();
		public void setFoodEstablishmentList(List<Clazz.FoodEstablishment> foodEstablishmentList);
		public boolean hasFoodEstablishment();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/foodEvent")
	@SchemaOrgLabel("foodEvent")
	@SchemaOrgComment(""
			+ "A sub property of location. The specific food event where the action occurred.")
	@CamelizedName("foodEvent")
	@ConstantizedName("FOOD_EVENT")
	public interface FoodEvent extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/FoodEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.FoodEvent
		 */
		public Clazz.FoodEvent getFoodEvent();
		public void setFoodEvent(Clazz.FoodEvent foodEvent);
		public List<Clazz.FoodEvent> getFoodEventList();
		public void setFoodEventList(List<Clazz.FoodEvent> foodEventList);
		public boolean hasFoodEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/founder")
	@SchemaOrgLabel("founder")
	@SchemaOrgComment("A person who founded this organization.")
	@CamelizedName("founder")
	@ConstantizedName("FOUNDER")
	public interface Founder extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/foundingDate")
	@SchemaOrgLabel("foundingDate")
	@SchemaOrgComment(""
			+ "The date that this organization was founded.")
	@CamelizedName("foundingDate")
	@ConstantizedName("FOUNDING_DATE")
	public interface FoundingDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/foundingLocation")
	@SchemaOrgLabel("foundingLocation")
	@SchemaOrgComment(""
			+ "The place where the Organization was founded.")
	@CamelizedName("foundingLocation")
	@ConstantizedName("FOUNDING_LOCATION")
	public interface FoundingLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fromLocation")
	@SchemaOrgLabel("fromLocation")
	@SchemaOrgComment(""
			+ "A sub property of location. The original location of the object or the agent"
			+ " before the action.")
	@CamelizedName("fromLocation")
	@ConstantizedName("FROM_LOCATION")
	public interface FromLocation extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fuelConsumption")
	@SchemaOrgLabel("fuelConsumption")
	@SchemaOrgComment(""
			+ "<p>The amount of fuel consumed for traveling a particular distance or temporal"
			+ " duration with the given vehicle (e.g. liters per 100 km).</p>\n\n<ul>\n<li>Note"
			+ " 1: There are unfortunately no standard unit codes for liters per 100 km.  Use"
			+ " <a class=\"localLink\" href=\"http://schema.org/unitText\">unitText</a> to"
			+ " indicate the unit of measurement, e.g. L/100 km.</li>\n<li>Note 2: There are"
			+ " two ways of indicating the fuel consumption, <a class=\"localLink\""
			+ " href=\"http://schema.org/fuelConsumption\">fuelConsumption</a> (e.g. 8 liters"
			+ " per 100 km) and <a class=\"localLink\""
			+ " href=\"http://schema.org/fuelEfficiency\">fuelEfficiency</a> (e.g. 30 miles per"
			+ " gallon). They are reciprocal.</li>\n<li>Note 3: Often, the absolute value is"
			+ " useful only when related to driving speed (\"at 80 km/h\") or usage pattern"
			+ " (\"city traffic\"). You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> to link the value"
			+ " for the fuel consumption to another value.</li>\n</ul>\n")
	@CamelizedName("fuelConsumption")
	@ConstantizedName("FUEL_CONSUMPTION")
	public interface FuelConsumption extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fuelEfficiency")
	@SchemaOrgLabel("fuelEfficiency")
	@SchemaOrgComment(""
			+ "<p>The distance traveled per unit of fuel used; most commonly miles per gallon"
			+ " (mpg) or kilometers per liter (km/L).</p>\n\n<ul>\n<li>Note 1: There are"
			+ " unfortunately no standard unit codes for miles per gallon or kilometers per"
			+ " liter. Use <a class=\"localLink\""
			+ " href=\"http://schema.org/unitText\">unitText</a> to indicate the unit of"
			+ " measurement, e.g. mpg or km/L.</li>\n<li>Note 2: There are two ways of"
			+ " indicating the fuel consumption, <a class=\"localLink\""
			+ " href=\"http://schema.org/fuelConsumption\">fuelConsumption</a> (e.g. 8 liters"
			+ " per 100 km) and <a class=\"localLink\""
			+ " href=\"http://schema.org/fuelEfficiency\">fuelEfficiency</a> (e.g. 30 miles per"
			+ " gallon). They are reciprocal.</li>\n<li>Note 3: Often, the absolute value is"
			+ " useful only when related to driving speed (\"at 80 km/h\") or usage pattern"
			+ " (\"city traffic\"). You can use <a class=\"localLink\""
			+ " href=\"http://schema.org/valueReference\">valueReference</a> to link the value"
			+ " for the fuel economy to another value.</li>\n</ul>\n")
	@CamelizedName("fuelEfficiency")
	@ConstantizedName("FUEL_EFFICIENCY")
	public interface FuelEfficiency extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/fuelType")
	@SchemaOrgLabel("fuelType")
	@SchemaOrgComment(""
			+ "The type of fuel suitable for the engine or engines of the vehicle. If the"
			+ " vehicle has only one engine, this property can be attached directly to the"
			+ " vehicle.")
	@CamelizedName("fuelType")
	@ConstantizedName("FUEL_TYPE")
	public interface FuelType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/funder")
	@SchemaOrgLabel("funder")
	@SchemaOrgComment(""
			+ "A person or organization that supports (sponsors) something through some kind of"
			+ " financial contribution.")
	@CamelizedName("funder")
	@ConstantizedName("FUNDER")
	public interface Funder extends SchemaOrgProperty, Sponsor {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/game")
	@SchemaOrgLabel("game")
	@SchemaOrgComment(""
			+ "Video game which is played on this server.")
	@CamelizedName("game")
	@ConstantizedName("GAME")
	public interface Game extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/VideoGame
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.VideoGame
		 */
		public Clazz.VideoGame getVideoGame();
		public void setVideoGame(Clazz.VideoGame videoGame);
		public List<Clazz.VideoGame> getVideoGameList();
		public void setVideoGameList(List<Clazz.VideoGame> videoGameList);
		public boolean hasVideoGame();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gameItem")
	@SchemaOrgLabel("gameItem")
	@SchemaOrgComment(""
			+ "An item is an object within the game world that can be collected by a player or,"
			+ " occasionally, a non-player character.")
	@CamelizedName("gameItem")
	@ConstantizedName("GAME_ITEM")
	public interface GameItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gameLocation")
	@SchemaOrgLabel("gameLocation")
	@SchemaOrgComment(""
			+ "Real or fictional location of the game (or part of game).")
	@CamelizedName("gameLocation")
	@ConstantizedName("GAME_LOCATION")
	public interface GameLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gamePlatform")
	@SchemaOrgLabel("gamePlatform")
	@SchemaOrgComment(""
			+ "The electronic systems used to play <a"
			+ " href=\"http://en.wikipedia.org/wiki/Category:Video_game_platforms\">video"
			+ " games</a>.")
	@CamelizedName("gamePlatform")
	@ConstantizedName("GAME_PLATFORM")
	public interface GamePlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gameServer")
	@SchemaOrgLabel("gameServer")
	@SchemaOrgComment(""
			+ "The server on which  it is possible to play the game.")
	@CamelizedName("gameServer")
	@ConstantizedName("GAME_SERVER")
	public interface GameServer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GameServer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GameServer
		 */
		public Clazz.GameServer getGameServer();
		public void setGameServer(Clazz.GameServer gameServer);
		public List<Clazz.GameServer> getGameServerList();
		public void setGameServerList(List<Clazz.GameServer> gameServerList);
		public boolean hasGameServer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gameTip")
	@SchemaOrgLabel("gameTip")
	@SchemaOrgComment("Links to tips, tactics, etc.")
	@CamelizedName("gameTip")
	@ConstantizedName("GAME_TIP")
	public interface GameTip extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gender")
	@SchemaOrgLabel("gender")
	@SchemaOrgComment(""
			+ "Gender of the person. While http://schema.org/Male and http://schema.org/Female"
			+ " may be used, text strings are also acceptable for people who do not identify as"
			+ " a binary gender.")
	@CamelizedName("gender")
	@ConstantizedName("GENDER")
	public interface Gender extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/GenderType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GenderType
		 */
		public Clazz.GenderType getGenderType();
		public void setGenderType(Clazz.GenderType genderType);
		public List<Clazz.GenderType> getGenderTypeList();
		public void setGenderTypeList(List<Clazz.GenderType> genderTypeList);
		public boolean hasGenderType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/genre")
	@SchemaOrgLabel("genre")
	@SchemaOrgComment(""
			+ "Genre of the creative work, broadcast channel or group.")
	@CamelizedName("genre")
	@ConstantizedName("GENRE")
	public interface Genre extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geo")
	@SchemaOrgLabel("geo")
	@SchemaOrgComment("The geo coordinates of the place.")
	@CamelizedName("geo")
	@ConstantizedName("GEO")
	public interface Geo extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GeoShape
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoShape
		 */
		public Clazz.GeoShape getGeoShape();
		public void setGeoShape(Clazz.GeoShape geoShape);
		public List<Clazz.GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<Clazz.GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * uri: http://schema.org/GeoCoordinates
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoCoordinates
		 */
		public Clazz.GeoCoordinates getGeoCoordinates();
		public void setGeoCoordinates(Clazz.GeoCoordinates geoCoordinates);
		public List<Clazz.GeoCoordinates> getGeoCoordinatesList();
		public void setGeoCoordinatesList(List<Clazz.GeoCoordinates> geoCoordinatesList);
		public boolean hasGeoCoordinates();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geoMidpoint")
	@SchemaOrgLabel("geoMidpoint")
	@SchemaOrgComment(""
			+ "Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.")
	@CamelizedName("geoMidpoint")
	@ConstantizedName("GEO_MIDPOINT")
	public interface GeoMidpoint extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GeoCoordinates
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoCoordinates
		 */
		public Clazz.GeoCoordinates getGeoCoordinates();
		public void setGeoCoordinates(Clazz.GeoCoordinates geoCoordinates);
		public List<Clazz.GeoCoordinates> getGeoCoordinatesList();
		public void setGeoCoordinatesList(List<Clazz.GeoCoordinates> geoCoordinatesList);
		public boolean hasGeoCoordinates();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geoRadius")
	@SchemaOrgLabel("geoRadius")
	@SchemaOrgComment(""
			+ "Indicates the approximate radius of a GeoCircle (metres unless indicated"
			+ " otherwise via Distance notation).")
	@CamelizedName("geoRadius")
	@ConstantizedName("GEO_RADIUS")
	public interface GeoRadius extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/geographicArea")
	@SchemaOrgLabel("geographicArea")
	@SchemaOrgComment(""
			+ "The geographic area associated with the audience.")
	@CamelizedName("geographicArea")
	@ConstantizedName("GEOGRAPHIC_AREA")
	public interface GeographicArea extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/AdministrativeArea
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AdministrativeArea
		 */
		public Clazz.AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(Clazz.AdministrativeArea administrativeArea);
		public List<Clazz.AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<Clazz.AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/givenName")
	@SchemaOrgLabel("givenName")
	@SchemaOrgComment(""
			+ "Given name. In the U.S., the first name of a Person. This can be used along with"
			+ " familyName instead of the name property.")
	@CamelizedName("givenName")
	@ConstantizedName("GIVEN_NAME")
	public interface GivenName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://kyojo.org/schemaSpl/givenNameRuby")
	@SchemaOrgLabel("givenNameRuby")
	@SchemaOrgComment(""
			+ "Given name. Japanese furigana and things like that.")
	@CamelizedName("givenNameRuby")
	@ConstantizedName("GIVEN_NAME_RUBY")
	public interface GivenNameRuby extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/globalLocationNumber")
	@SchemaOrgLabel("globalLocationNumber")
	@SchemaOrgComment(""
			+ "The <a href=\"http://www.gs1.org/gln\">Global Location Number</a> (GLN,"
			+ " sometimes also referred to as International Location Number or ILN) of the"
			+ " respective organization, person, or place. The GLN is a 13-digit number used to"
			+ " identify parties and physical locations.")
	@CamelizedName("globalLocationNumber")
	@ConstantizedName("GLOBAL_LOCATION_NUMBER")
	public interface GlobalLocationNumber extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/grantee")
	@SchemaOrgLabel("grantee")
	@SchemaOrgComment(""
			+ "The person, organization, contact point, or audience that has been granted this"
			+ " permission.")
	@CamelizedName("grantee")
	@ConstantizedName("GRANTEE")
	public interface Grantee extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/greater")
	@SchemaOrgLabel("greater")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is"
			+ " greater than the object.")
	@CamelizedName("greater")
	@ConstantizedName("GREATER")
	public interface Greater extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/greaterOrEqual")
	@SchemaOrgLabel("greaterOrEqual")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is"
			+ " greater than or equal to the object.")
	@CamelizedName("greaterOrEqual")
	@ConstantizedName("GREATER_OR_EQUAL")
	public interface GreaterOrEqual extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gtin12")
	@SchemaOrgLabel("gtin12")
	@SchemaOrgComment(""
			+ "The <a href=\"http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx\">GTIN-12</a>"
			+ " code of the product, or the product to which the offer refers. The GTIN-12 is"
			+ " the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item"
			+ " Reference, and Check Digit used to identify trade items. See <a"
			+ " href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1 GTIN Summary</a>"
			+ " for more details.")
	@CamelizedName("gtin12")
	@ConstantizedName("GTIN12")
	public interface Gtin12 extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gtin13")
	@SchemaOrgLabel("gtin13")
	@SchemaOrgComment(""
			+ "The <a href=\"http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx\">GTIN-13</a>"
			+ " code of the product, or the product to which the offer refers. This is"
			+ " equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can"
			+ " be converted into a GTIN-13 code by simply adding a preceeding zero. See <a"
			+ " href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1 GTIN Summary</a>"
			+ " for more details.")
	@CamelizedName("gtin13")
	@ConstantizedName("GTIN13")
	public interface Gtin13 extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gtin14")
	@SchemaOrgLabel("gtin14")
	@SchemaOrgComment(""
			+ "The <a href=\"http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx\">GTIN-14</a>"
			+ " code of the product, or the product to which the offer refers. See <a"
			+ " href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1 GTIN Summary</a>"
			+ " for more details.")
	@CamelizedName("gtin14")
	@ConstantizedName("GTIN14")
	public interface Gtin14 extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/gtin8")
	@SchemaOrgLabel("gtin8")
	@SchemaOrgComment(""
			+ "The <a href=\"http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx\">GTIN-8</a>"
			+ " code of the product, or the product to which the offer refers. This code is"
			+ " also known as EAN/UCC-8 or 8-digit EAN. See <a"
			+ " href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GS1 GTIN Summary</a>"
			+ " for more details.")
	@CamelizedName("gtin8")
	@ConstantizedName("GTIN8")
	public interface Gtin8 extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasCourseInstance")
	@SchemaOrgLabel("hasCourseInstance")
	@SchemaOrgComment(""
			+ "An offering of the course at a specific time and place or through specific media"
			+ " or mode of study or to a specific section of students.")
	@CamelizedName("hasCourseInstance")
	@ConstantizedName("HAS_COURSE_INSTANCE")
	public interface HasCourseInstance extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CourseInstance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CourseInstance
		 */
		public Clazz.CourseInstance getCourseInstance();
		public void setCourseInstance(Clazz.CourseInstance courseInstance);
		public List<Clazz.CourseInstance> getCourseInstanceList();
		public void setCourseInstanceList(List<Clazz.CourseInstance> courseInstanceList);
		public boolean hasCourseInstance();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasDeliveryMethod")
	@SchemaOrgLabel("hasDeliveryMethod")
	@SchemaOrgComment("Method used for delivery or shipping.")
	@CamelizedName("hasDeliveryMethod")
	@ConstantizedName("HAS_DELIVERY_METHOD")
	public interface HasDeliveryMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryMethod
		 */
		public Clazz.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Clazz.DeliveryMethod deliveryMethod);
		public List<Clazz.DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<Clazz.DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasDigitalDocumentPermission")
	@SchemaOrgLabel("hasDigitalDocumentPermission")
	@SchemaOrgComment(""
			+ "A permission related to the access to this document (e.g. permission to read or"
			+ " write an electronic document). For a public document, specify a grantee with an"
			+ " Audience with audienceType equal to \"public\".")
	@CamelizedName("hasDigitalDocumentPermission")
	@ConstantizedName("HAS_DIGITAL_DOCUMENT_PERMISSION")
	public interface HasDigitalDocumentPermission extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DigitalDocumentPermission
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DigitalDocumentPermission
		 */
		public Clazz.DigitalDocumentPermission getDigitalDocumentPermission();
		public void setDigitalDocumentPermission(Clazz.DigitalDocumentPermission digitalDocumentPermission);
		public List<Clazz.DigitalDocumentPermission> getDigitalDocumentPermissionList();
		public void setDigitalDocumentPermissionList(List<Clazz.DigitalDocumentPermission> digitalDocumentPermissionList);
		public boolean hasDigitalDocumentPermission();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasMap")
	@SchemaOrgLabel("hasMap")
	@SchemaOrgComment("A URL to a map of the place.")
	@CamelizedName("hasMap")
	@ConstantizedName("HAS_MAP")
	public interface HasMap extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Map
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Map
		 */
		public Clazz.Map getMap();
		public void setMap(Clazz.Map map);
		public List<Clazz.Map> getMapList();
		public void setMapList(List<Clazz.Map> mapList);
		public boolean hasMap();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasMenu")
	@SchemaOrgLabel("hasMenu")
	@SchemaOrgComment(""
			+ "Either the actual menu as a structured representation, as text, or a URL of the"
			+ " menu.")
	@CamelizedName("hasMenu")
	@ConstantizedName("HAS_MENU")
	public interface HasMenu extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Menu
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Menu
		 */
		public Clazz.Menu getMenu();
		public void setMenu(Clazz.Menu menu);
		public List<Clazz.Menu> getMenuList();
		public void setMenuList(List<Clazz.Menu> menuList);
		public boolean hasMenu();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasMenuItem")
	@SchemaOrgLabel("hasMenuItem")
	@SchemaOrgComment(""
			+ "A food or drink item contained in a menu or menu section.")
	@CamelizedName("hasMenuItem")
	@ConstantizedName("HAS_MENU_ITEM")
	public interface HasMenuItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MenuItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MenuItem
		 */
		public Clazz.MenuItem getMenuItem();
		public void setMenuItem(Clazz.MenuItem menuItem);
		public List<Clazz.MenuItem> getMenuItemList();
		public void setMenuItemList(List<Clazz.MenuItem> menuItemList);
		public boolean hasMenuItem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasMenuSection")
	@SchemaOrgLabel("hasMenuSection")
	@SchemaOrgComment(""
			+ "A subgrouping of the menu (by dishes, course, serving time period, etc.).")
	@CamelizedName("hasMenuSection")
	@ConstantizedName("HAS_MENU_SECTION")
	public interface HasMenuSection extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MenuSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MenuSection
		 */
		public Clazz.MenuSection getMenuSection();
		public void setMenuSection(Clazz.MenuSection menuSection);
		public List<Clazz.MenuSection> getMenuSectionList();
		public void setMenuSectionList(List<Clazz.MenuSection> menuSectionList);
		public boolean hasMenuSection();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasOfferCatalog")
	@SchemaOrgLabel("hasOfferCatalog")
	@SchemaOrgComment(""
			+ "Indicates an OfferCatalog listing for this Organization, Person, or Service.")
	@CamelizedName("hasOfferCatalog")
	@ConstantizedName("HAS_OFFER_CATALOG")
	public interface HasOfferCatalog extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OfferCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OfferCatalog
		 */
		public Clazz.OfferCatalog getOfferCatalog();
		public void setOfferCatalog(Clazz.OfferCatalog offerCatalog);
		public List<Clazz.OfferCatalog> getOfferCatalogList();
		public void setOfferCatalogList(List<Clazz.OfferCatalog> offerCatalogList);
		public boolean hasOfferCatalog();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasPOS")
	@SchemaOrgLabel("hasPOS")
	@SchemaOrgComment(""
			+ "Points-of-Sales operated by the organization or person.")
	@CamelizedName("hasPOS")
	@ConstantizedName("HAS_POS")
	public interface HasPOS extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hasPart")
	@SchemaOrgLabel("hasPart")
	@SchemaOrgComment(""
			+ "Indicates a CreativeWork that is (in some sense) a part of this CreativeWork.")
	@CamelizedName("hasPart")
	@ConstantizedName("HAS_PART")
	public interface HasPart extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/headline")
	@SchemaOrgLabel("headline")
	@SchemaOrgComment("Headline of the article.")
	@CamelizedName("headline")
	@ConstantizedName("HEADLINE")
	public interface Headline extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/height")
	@SchemaOrgLabel("height")
	@SchemaOrgComment("The height of the item.")
	@CamelizedName("height")
	@ConstantizedName("HEIGHT")
	public interface Height extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/highPrice")
	@SchemaOrgLabel("highPrice")
	@SchemaOrgComment(""
			+ "The highest price of all offers available.")
	@CamelizedName("highPrice")
	@ConstantizedName("HIGH_PRICE")
	public interface HighPrice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hiringOrganization")
	@SchemaOrgLabel("hiringOrganization")
	@SchemaOrgComment("Organization offering the job position.")
	@CamelizedName("hiringOrganization")
	@ConstantizedName("HIRING_ORGANIZATION")
	public interface HiringOrganization extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/homeLocation")
	@SchemaOrgLabel("homeLocation")
	@SchemaOrgComment(""
			+ "A contact location for a person's residence.")
	@CamelizedName("homeLocation")
	@ConstantizedName("HOME_LOCATION")
	public interface HomeLocation extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/homeTeam")
	@SchemaOrgLabel("homeTeam")
	@SchemaOrgComment("The home team in a sports event.")
	@CamelizedName("homeTeam")
	@ConstantizedName("HOME_TEAM")
	public interface HomeTeam extends Competitor, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SportsTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsTeam
		 */
		public Clazz.SportsTeam getSportsTeam();
		public void setSportsTeam(Clazz.SportsTeam sportsTeam);
		public List<Clazz.SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<Clazz.SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/honorificPrefix")
	@SchemaOrgLabel("honorificPrefix")
	@SchemaOrgComment(""
			+ "An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.")
	@CamelizedName("honorificPrefix")
	@ConstantizedName("HONORIFIC_PREFIX")
	public interface HonorificPrefix extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/honorificSuffix")
	@SchemaOrgLabel("honorificSuffix")
	@SchemaOrgComment(""
			+ "An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.")
	@CamelizedName("honorificSuffix")
	@ConstantizedName("HONORIFIC_SUFFIX")
	public interface HonorificSuffix extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hostingOrganization")
	@SchemaOrgLabel("hostingOrganization")
	@SchemaOrgComment(""
			+ "The organization (airline, travelers' club, etc.) the membership is made with.")
	@CamelizedName("hostingOrganization")
	@ConstantizedName("HOSTING_ORGANIZATION")
	public interface HostingOrganization extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hoursAvailable")
	@SchemaOrgLabel("hoursAvailable")
	@SchemaOrgComment(""
			+ "The hours during which this service or contact is available.")
	@CamelizedName("hoursAvailable")
	@ConstantizedName("HOURS_AVAILABLE")
	public interface HoursAvailable extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OpeningHoursSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OpeningHoursSpecification
		 */
		public Clazz.OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(Clazz.OpeningHoursSpecification openingHoursSpecification);
		public List<Clazz.OpeningHoursSpecification> getOpeningHoursSpecificationList();
		public void setOpeningHoursSpecificationList(List<Clazz.OpeningHoursSpecification> openingHoursSpecificationList);
		public boolean hasOpeningHoursSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/httpMethod")
	@SchemaOrgLabel("httpMethod")
	@SchemaOrgComment(""
			+ "An HTTP method that specifies the appropriate HTTP method for a request to an"
			+ " HTTP EntryPoint. Values are capitalized strings as used in HTTP.")
	@CamelizedName("httpMethod")
	@ConstantizedName("HTTP_METHOD")
	public interface HttpMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/iataCode")
	@SchemaOrgLabel("iataCode")
	@SchemaOrgComment(""
			+ "IATA identifier for an airline or airport.")
	@CamelizedName("iataCode")
	@ConstantizedName("IATA_CODE")
	public interface IataCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/icaoCode")
	@SchemaOrgLabel("icaoCode")
	@SchemaOrgComment("ICAO identifier for an airport.")
	@CamelizedName("icaoCode")
	@ConstantizedName("ICAO_CODE")
	public interface IcaoCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/identifier")
	@SchemaOrgLabel("identifier")
	@SchemaOrgComment(""
			+ "The identifier property represents any kind of identifier for any kind of <a"
			+ " class=\"localLink\" href=\"http://schema.org/Thing\">Thing</a>, such as ISBNs,"
			+ " GTIN codes, UUIDs etc. Schema.org provides dedicated properties for"
			+ " representing many of these, either as textual strings or as URL (URI) links."
			+ " See <a href=\"/docs/datamodel.html#identifierBg\">background notes</a> for more"
			+ " details.")
	@CamelizedName("identifier")
	@ConstantizedName("IDENTIFIER")
	public interface Identifier extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PropertyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue
		 */
		public Clazz.PropertyValue getPropertyValue();
		public void setPropertyValue(Clazz.PropertyValue propertyValue);
		public List<Clazz.PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<Clazz.PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/illustrator")
	@SchemaOrgLabel("illustrator")
	@SchemaOrgComment("The illustrator of the book.")
	@CamelizedName("illustrator")
	@ConstantizedName("ILLUSTRATOR")
	public interface Illustrator extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/image")
	@SchemaOrgLabel("image")
	@SchemaOrgComment(""
			+ "An image of the item. This can be a <a class=\"localLink\""
			+ " href=\"http://schema.org/URL\">URL</a> or a fully described <a"
			+ " class=\"localLink\" href=\"http://schema.org/ImageObject\">ImageObject</a>.")
	@CamelizedName("image")
	@ConstantizedName("IMAGE")
	public interface Image extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inAlbum")
	@SchemaOrgLabel("inAlbum")
	@SchemaOrgComment(""
			+ "The album to which this recording belongs.")
	@CamelizedName("inAlbum")
	@ConstantizedName("IN_ALBUM")
	public interface InAlbum extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicAlbum
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbum
		 */
		public Clazz.MusicAlbum getMusicAlbum();
		public void setMusicAlbum(Clazz.MusicAlbum musicAlbum);
		public List<Clazz.MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<Clazz.MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inBroadcastLineup")
	@SchemaOrgLabel("inBroadcastLineup")
	@SchemaOrgComment(""
			+ "The CableOrSatelliteService offering the channel.")
	@CamelizedName("inBroadcastLineup")
	@ConstantizedName("IN_BROADCAST_LINEUP")
	public interface InBroadcastLineup extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CableOrSatelliteService
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CableOrSatelliteService
		 */
		public Clazz.CableOrSatelliteService getCableOrSatelliteService();
		public void setCableOrSatelliteService(Clazz.CableOrSatelliteService cableOrSatelliteService);
		public List<Clazz.CableOrSatelliteService> getCableOrSatelliteServiceList();
		public void setCableOrSatelliteServiceList(List<Clazz.CableOrSatelliteService> cableOrSatelliteServiceList);
		public boolean hasCableOrSatelliteService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inLanguage")
	@SchemaOrgLabel("inLanguage")
	@SchemaOrgComment(""
			+ "The language of the content or performance or used in an action. Please use one"
			+ " of the language codes from the <a"
			+ " href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard</a>. See also <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/availableLanguage\">availableLanguage</a>.")
	@CamelizedName("inLanguage")
	@ConstantizedName("IN_LANGUAGE")
	public interface InLanguage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Language
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Language
		 */
		public Clazz.Language getLanguage();
		public void setLanguage(Clazz.Language language);
		public List<Clazz.Language> getLanguageList();
		public void setLanguageList(List<Clazz.Language> languageList);
		public boolean hasLanguage();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inPlaylist")
	@SchemaOrgLabel("inPlaylist")
	@SchemaOrgComment(""
			+ "The playlist to which this recording belongs.")
	@CamelizedName("inPlaylist")
	@ConstantizedName("IN_PLAYLIST")
	public interface InPlaylist extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicPlaylist
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicPlaylist
		 */
		public Clazz.MusicPlaylist getMusicPlaylist();
		public void setMusicPlaylist(Clazz.MusicPlaylist musicPlaylist);
		public List<Clazz.MusicPlaylist> getMusicPlaylistList();
		public void setMusicPlaylistList(List<Clazz.MusicPlaylist> musicPlaylistList);
		public boolean hasMusicPlaylist();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/incentiveCompensation")
	@SchemaOrgLabel("incentiveCompensation")
	@SchemaOrgComment(""
			+ "Description of bonus and commission compensation aspects of the job.")
	@CamelizedName("incentiveCompensation")
	@ConstantizedName("INCENTIVE_COMPENSATION")
	public interface IncentiveCompensation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includedComposition")
	@SchemaOrgLabel("includedComposition")
	@SchemaOrgComment(""
			+ "Smaller compositions included in this work (e.g. a movement in a symphony).")
	@CamelizedName("includedComposition")
	@ConstantizedName("INCLUDED_COMPOSITION")
	public interface IncludedComposition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicComposition
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicComposition
		 */
		public Clazz.MusicComposition getMusicComposition();
		public void setMusicComposition(Clazz.MusicComposition musicComposition);
		public List<Clazz.MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<Clazz.MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includedInDataCatalog")
	@SchemaOrgLabel("includedInDataCatalog")
	@SchemaOrgComment(""
			+ "A data catalog which contains this dataset.")
	@CamelizedName("includedInDataCatalog")
	@ConstantizedName("INCLUDED_IN_DATA_CATALOG")
	public interface IncludedInDataCatalog extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DataCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DataCatalog
		 */
		public Clazz.DataCatalog getDataCatalog();
		public void setDataCatalog(Clazz.DataCatalog dataCatalog);
		public List<Clazz.DataCatalog> getDataCatalogList();
		public void setDataCatalogList(List<Clazz.DataCatalog> dataCatalogList);
		public boolean hasDataCatalog();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includesObject")
	@SchemaOrgLabel("includesObject")
	@SchemaOrgComment(""
			+ "This links to a node or nodes indicating the exact quantity of the products"
			+ " included in the offer.")
	@CamelizedName("includesObject")
	@ConstantizedName("INCLUDES_OBJECT")
	public interface IncludesObject extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/TypeAndQuantityNode
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.TypeAndQuantityNode
		 */
		public Clazz.TypeAndQuantityNode getTypeAndQuantityNode();
		public void setTypeAndQuantityNode(Clazz.TypeAndQuantityNode typeAndQuantityNode);
		public List<Clazz.TypeAndQuantityNode> getTypeAndQuantityNodeList();
		public void setTypeAndQuantityNodeList(List<Clazz.TypeAndQuantityNode> typeAndQuantityNodeList);
		public boolean hasTypeAndQuantityNode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/industry")
	@SchemaOrgLabel("industry")
	@SchemaOrgComment(""
			+ "The industry associated with the job position.")
	@CamelizedName("industry")
	@ConstantizedName("INDUSTRY")
	public interface Industry extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ineligibleRegion")
	@SchemaOrgLabel("ineligibleRegion")
	@SchemaOrgComment(""
			+ "The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the"
			+ " GeoShape for the geo-political region(s) for which the offer or delivery charge"
			+ " specification is not valid, e.g. a region where the transaction is not"
			+ " allowed.</p>\n\n<p>See also <a class=\"localLink\""
			+ " href=\"http://schema.org/eligibleRegion\">eligibleRegion</a>.")
	@CamelizedName("ineligibleRegion")
	@ConstantizedName("INELIGIBLE_REGION")
	public interface IneligibleRegion extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/GeoShape
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GeoShape
		 */
		public Clazz.GeoShape getGeoShape();
		public void setGeoShape(Clazz.GeoShape geoShape);
		public List<Clazz.GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<Clazz.GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/installUrl")
	@SchemaOrgLabel("installUrl")
	@SchemaOrgComment(""
			+ "URL at which the app may be installed, if different from the URL of the item.")
	@CamelizedName("installUrl")
	@ConstantizedName("INSTALL_URL")
	public interface InstallUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/instructor")
	@SchemaOrgLabel("instructor")
	@SchemaOrgComment(""
			+ "A person assigned to instruct or provide instructional assistance for the <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/CourseInstance\">CourseInstance</a>.")
	@CamelizedName("instructor")
	@ConstantizedName("INSTRUCTOR")
	public interface Instructor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/instrument")
	@SchemaOrgLabel("instrument")
	@SchemaOrgComment(""
			+ "The object that helped the agent perform the action. e.g. John wrote a book with"
			+ " <em>a pen</em>.")
	@CamelizedName("instrument")
	@ConstantizedName("INSTRUMENT")
	public interface Instrument extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactionService")
	@SchemaOrgLabel("interactionService")
	@SchemaOrgComment(""
			+ "The WebSite or SoftwareApplication where the interactions took place.")
	@CamelizedName("interactionService")
	@ConstantizedName("INTERACTION_SERVICE")
	public interface InteractionService extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SoftwareApplication
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareApplication
		 */
		public Clazz.SoftwareApplication getSoftwareApplication();
		public void setSoftwareApplication(Clazz.SoftwareApplication softwareApplication);
		public List<Clazz.SoftwareApplication> getSoftwareApplicationList();
		public void setSoftwareApplicationList(List<Clazz.SoftwareApplication> softwareApplicationList);
		public boolean hasSoftwareApplication();

		/**
		 * uri: http://schema.org/WebSite
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.WebSite
		 */
		public Clazz.WebSite getWebSite();
		public void setWebSite(Clazz.WebSite webSite);
		public List<Clazz.WebSite> getWebSiteList();
		public void setWebSiteList(List<Clazz.WebSite> webSiteList);
		public boolean hasWebSite();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactionStatistic")
	@SchemaOrgLabel("interactionStatistic")
	@SchemaOrgComment(""
			+ "The number of interactions for the CreativeWork using the WebSite or"
			+ " SoftwareApplication. The most specific child type of InteractionCounter should"
			+ " be used.")
	@CamelizedName("interactionStatistic")
	@ConstantizedName("INTERACTION_STATISTIC")
	public interface InteractionStatistic extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/InteractionCounter
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.InteractionCounter
		 */
		public Clazz.InteractionCounter getInteractionCounter();
		public void setInteractionCounter(Clazz.InteractionCounter interactionCounter);
		public List<Clazz.InteractionCounter> getInteractionCounterList();
		public void setInteractionCounterList(List<Clazz.InteractionCounter> interactionCounterList);
		public boolean hasInteractionCounter();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactionType")
	@SchemaOrgLabel("interactionType")
	@SchemaOrgComment(""
			+ "The Action representing the type of interaction. For up votes, +1s, etc. use <a"
			+ " class=\"localLink\" href=\"http://schema.org/LikeAction\">LikeAction</a>. For"
			+ " down votes use <a class=\"localLink\""
			+ " href=\"http://schema.org/DislikeAction\">DislikeAction</a>. Otherwise, use the"
			+ " most specific Action.")
	@CamelizedName("interactionType")
	@ConstantizedName("INTERACTION_TYPE")
	public interface InteractionType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Action
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Action
		 */
		public Clazz.Action getAction();
		public void setAction(Clazz.Action action);
		public List<Clazz.Action> getActionList();
		public void setActionList(List<Clazz.Action> actionList);
		public boolean hasAction();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactivityType")
	@SchemaOrgLabel("interactivityType")
	@SchemaOrgComment(""
			+ "The predominant mode of learning supported by the learning resource. Acceptable"
			+ " values are 'active', 'expositive', or 'mixed'.")
	@CamelizedName("interactivityType")
	@ConstantizedName("INTERACTIVITY_TYPE")
	public interface InteractivityType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interestRate")
	@SchemaOrgLabel("interestRate")
	@SchemaOrgComment(""
			+ "The interest rate, charged or paid, applicable to the financial product. Note:"
			+ " This is different from the calculated annualPercentageRate.")
	@CamelizedName("interestRate")
	@ConstantizedName("INTEREST_RATE")
	public interface InterestRate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inventoryLevel")
	@SchemaOrgLabel("inventoryLevel")
	@SchemaOrgComment(""
			+ "The current approximate inventory level for the item or items.")
	@CamelizedName("inventoryLevel")
	@ConstantizedName("INVENTORY_LEVEL")
	public interface InventoryLevel extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isAccessibleForFree")
	@SchemaOrgLabel("isAccessibleForFree")
	@SchemaOrgComment(""
			+ "A flag to signal that the item, event, or place is accessible for free.")
	@CamelizedName("isAccessibleForFree")
	@ConstantizedName("IS_ACCESSIBLE_FOR_FREE")
	public interface IsAccessibleForFree extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isAccessoryOrSparePartFor")
	@SchemaOrgLabel("isAccessoryOrSparePartFor")
	@SchemaOrgComment(""
			+ "A pointer to another product (or multiple products) for which this product is an"
			+ " accessory or spare part.")
	@CamelizedName("isAccessoryOrSparePartFor")
	@ConstantizedName("IS_ACCESSORY_OR_SPARE_PART_FOR")
	public interface IsAccessoryOrSparePartFor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isBasedOn")
	@SchemaOrgLabel("isBasedOn")
	@SchemaOrgComment(""
			+ "A resource that was used in the creation of this resource. This term can be"
			+ " repeated for multiple sources. For example,"
			+ " http://example.com/great-multiplication-intro.html.")
	@CamelizedName("isBasedOn")
	@ConstantizedName("IS_BASED_ON")
	public interface IsBasedOn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isConsumableFor")
	@SchemaOrgLabel("isConsumableFor")
	@SchemaOrgComment(""
			+ "A pointer to another product (or multiple products) for which this product is a"
			+ " consumable.")
	@CamelizedName("isConsumableFor")
	@ConstantizedName("IS_CONSUMABLE_FOR")
	public interface IsConsumableFor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isFamilyFriendly")
	@SchemaOrgLabel("isFamilyFriendly")
	@SchemaOrgComment(""
			+ "Indicates whether this content is family friendly.")
	@CamelizedName("isFamilyFriendly")
	@ConstantizedName("IS_FAMILY_FRIENDLY")
	public interface IsFamilyFriendly extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isGift")
	@SchemaOrgLabel("isGift")
	@SchemaOrgComment(""
			+ "Was the offer accepted as a gift for someone other than the buyer.")
	@CamelizedName("isGift")
	@ConstantizedName("IS_GIFT")
	public interface IsGift extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isLiveBroadcast")
	@SchemaOrgLabel("isLiveBroadcast")
	@SchemaOrgComment(""
			+ "True is the broadcast is of a live event.")
	@CamelizedName("isLiveBroadcast")
	@ConstantizedName("IS_LIVE_BROADCAST")
	public interface IsLiveBroadcast extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isPartOf")
	@SchemaOrgLabel("isPartOf")
	@SchemaOrgComment(""
			+ "Indicates a CreativeWork that this CreativeWork is (in some sense) part of.")
	@CamelizedName("isPartOf")
	@ConstantizedName("IS_PART_OF")
	public interface IsPartOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isRelatedTo")
	@SchemaOrgLabel("isRelatedTo")
	@SchemaOrgComment(""
			+ "A pointer to another, somehow related product (or multiple products).")
	@CamelizedName("isRelatedTo")
	@ConstantizedName("IS_RELATED_TO")
	public interface IsRelatedTo extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isSimilarTo")
	@SchemaOrgLabel("isSimilarTo")
	@SchemaOrgComment(""
			+ "A pointer to another, functionally similar product (or multiple products).")
	@CamelizedName("isSimilarTo")
	@ConstantizedName("IS_SIMILAR_TO")
	public interface IsSimilarTo extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isVariantOf")
	@SchemaOrgLabel("isVariantOf")
	@SchemaOrgComment(""
			+ "A pointer to a base product from which this product is a variant. It is safe to"
			+ " infer that the variant inherits all product features from the base model,"
			+ " unless defined locally. This is not transitive.")
	@CamelizedName("isVariantOf")
	@ConstantizedName("IS_VARIANT_OF")
	public interface IsVariantOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ProductModel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProductModel
		 */
		public Clazz.ProductModel getProductModel();
		public void setProductModel(Clazz.ProductModel productModel);
		public List<Clazz.ProductModel> getProductModelList();
		public void setProductModelList(List<Clazz.ProductModel> productModelList);
		public boolean hasProductModel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isbn")
	@SchemaOrgLabel("isbn")
	@SchemaOrgComment("The ISBN of the book.")
	@CamelizedName("isbn")
	@ConstantizedName("ISBN")
	public interface Isbn extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isicV4")
	@SchemaOrgLabel("isicV4")
	@SchemaOrgComment(""
			+ "The International Standard of Industrial Classification of All Economic"
			+ " Activities (ISIC), Revision 4 code for a particular organization, business"
			+ " person, or place.")
	@CamelizedName("isicV4")
	@ConstantizedName("ISIC_V4")
	public interface IsicV4 extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isrcCode")
	@SchemaOrgLabel("isrcCode")
	@SchemaOrgComment(""
			+ "The International Standard Recording Code for the recording.")
	@CamelizedName("isrcCode")
	@ConstantizedName("ISRC_CODE")
	public interface IsrcCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/issn")
	@SchemaOrgLabel("issn")
	@SchemaOrgComment(""
			+ "The International Standard Serial Number (ISSN) that identifies this serial"
			+ " publication. You can repeat this property to identify different formats of, or"
			+ " the linking ISSN (ISSN-L) for, this serial publication.")
	@CamelizedName("issn")
	@ConstantizedName("ISSN")
	public interface Issn extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/issueNumber")
	@SchemaOrgLabel("issueNumber")
	@SchemaOrgComment(""
			+ "Identifies the issue of publication; for example, \"iii\" or \"2\".")
	@CamelizedName("issueNumber")
	@ConstantizedName("ISSUE_NUMBER")
	public interface IssueNumber extends Position, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/issuedBy")
	@SchemaOrgLabel("issuedBy")
	@SchemaOrgComment(""
			+ "The organization issuing the ticket or permit.")
	@CamelizedName("issuedBy")
	@ConstantizedName("ISSUED_BY")
	public interface IssuedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/issuedThrough")
	@SchemaOrgLabel("issuedThrough")
	@SchemaOrgComment(""
			+ "The service through with the permit was granted.")
	@CamelizedName("issuedThrough")
	@ConstantizedName("ISSUED_THROUGH")
	public interface IssuedThrough extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/iswcCode")
	@SchemaOrgLabel("iswcCode")
	@SchemaOrgComment(""
			+ "The International Standard Musical Work Code for the composition.")
	@CamelizedName("iswcCode")
	@ConstantizedName("ISWC_CODE")
	public interface IswcCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/item")
	@SchemaOrgLabel("item")
	@SchemaOrgComment(""
			+ "An entity represented by an entry in a list or data feed (e.g. an 'artist' in a"
			+ " list of 'artists')’.")
	@CamelizedName("item")
	@ConstantizedName("ITEM")
	public interface Item extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemCondition")
	@SchemaOrgLabel("itemCondition")
	@SchemaOrgComment(""
			+ "A predefined value from OfferItemCondition or a textual description of the"
			+ " condition of the product or service, or the products or services included in"
			+ " the offer.")
	@CamelizedName("itemCondition")
	@ConstantizedName("ITEM_CONDITION")
	public interface ItemCondition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OfferItemCondition
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OfferItemCondition
		 */
		public Clazz.OfferItemCondition getOfferItemCondition();
		public void setOfferItemCondition(Clazz.OfferItemCondition offerItemCondition);
		public List<Clazz.OfferItemCondition> getOfferItemConditionList();
		public void setOfferItemConditionList(List<Clazz.OfferItemCondition> offerItemConditionList);
		public boolean hasOfferItemCondition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemListElement")
	@SchemaOrgLabel("itemListElement")
	@SchemaOrgComment(""
			+ "For itemListElement values, you can use simple strings (e.g. \"Peter\","
			+ " \"Paul\", \"Mary\"), existing entities, or use ListItem.</p>\n\n<p>Text values"
			+ " are best if the elements in the list are plain strings. Existing entities are"
			+ " best for a simple, unordered list of existing things in your data. ListItem is"
			+ " used with ordered lists when you want to provide additional context about the"
			+ " element in that list or when the same item might be in different places in"
			+ " different lists.</p>\n\n<p>Note: The order of elements in your mark-up is not"
			+ " sufficient for indicating the order or elements.  Use ListItem with a"
			+ " 'position' property in such cases.")
	@CamelizedName("itemListElement")
	@ConstantizedName("ITEM_LIST_ELEMENT")
	public interface ItemListElement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ListItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ListItem
		 */
		public Clazz.ListItem getListItem();
		public void setListItem(Clazz.ListItem listItem);
		public List<Clazz.ListItem> getListItemList();
		public void setListItemList(List<Clazz.ListItem> listItemList);
		public boolean hasListItem();

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemListOrder")
	@SchemaOrgLabel("itemListOrder")
	@SchemaOrgComment(""
			+ "Type of ordering (e.g. Ascending, Descending, Unordered).")
	@CamelizedName("itemListOrder")
	@ConstantizedName("ITEM_LIST_ORDER")
	public interface ItemListOrder extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ItemListOrderType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ItemListOrderType
		 */
		public Clazz.ItemListOrderType getItemListOrderType();
		public void setItemListOrderType(Clazz.ItemListOrderType itemListOrderType);
		public List<Clazz.ItemListOrderType> getItemListOrderTypeList();
		public void setItemListOrderTypeList(List<Clazz.ItemListOrderType> itemListOrderTypeList);
		public boolean hasItemListOrderType();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemOffered")
	@SchemaOrgLabel("itemOffered")
	@SchemaOrgComment("The item being offered.")
	@CamelizedName("itemOffered")
	@ConstantizedName("ITEM_OFFERED")
	public interface ItemOffered extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemReviewed")
	@SchemaOrgLabel("itemReviewed")
	@SchemaOrgComment("The item that is being reviewed/rated.")
	@CamelizedName("itemReviewed")
	@ConstantizedName("ITEM_REVIEWED")
	public interface ItemReviewed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/itemShipped")
	@SchemaOrgLabel("itemShipped")
	@SchemaOrgComment("Item(s) being shipped.")
	@CamelizedName("itemShipped")
	@ConstantizedName("ITEM_SHIPPED")
	public interface ItemShipped extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/jobBenefits")
	@SchemaOrgLabel("jobBenefits")
	@SchemaOrgComment(""
			+ "Description of benefits associated with the job.")
	@CamelizedName("jobBenefits")
	@ConstantizedName("JOB_BENEFITS")
	public interface JobBenefits extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/jobLocation")
	@SchemaOrgLabel("jobLocation")
	@SchemaOrgComment(""
			+ "A (typically single) geographic location associated with the job position.")
	@CamelizedName("jobLocation")
	@ConstantizedName("JOB_LOCATION")
	public interface JobLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/jobTitle")
	@SchemaOrgLabel("jobTitle")
	@SchemaOrgComment(""
			+ "The job title of the person (for example, Financial Manager).")
	@CamelizedName("jobTitle")
	@ConstantizedName("JOB_TITLE")
	public interface JobTitle extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/keywords")
	@SchemaOrgLabel("keywords")
	@SchemaOrgComment(""
			+ "Keywords or tags used to describe this content. Multiple entries in a keywords"
			+ " list are typically delimited by commas.")
	@CamelizedName("keywords")
	@ConstantizedName("KEYWORDS")
	public interface Keywords extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/knownVehicleDamages")
	@SchemaOrgLabel("knownVehicleDamages")
	@SchemaOrgComment(""
			+ "A textual description of known damages, both repaired and unrepaired.")
	@CamelizedName("knownVehicleDamages")
	@ConstantizedName("KNOWN_VEHICLE_DAMAGES")
	public interface KnownVehicleDamages extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/knows")
	@SchemaOrgLabel("knows")
	@SchemaOrgComment(""
			+ "The most generic bi-directional social/work relation.")
	@CamelizedName("knows")
	@ConstantizedName("KNOWS")
	public interface Knows extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/landlord")
	@SchemaOrgLabel("landlord")
	@SchemaOrgComment(""
			+ "A sub property of participant. The owner of the real estate property.")
	@CamelizedName("landlord")
	@ConstantizedName("LANDLORD")
	public interface Landlord extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lastReviewed")
	@SchemaOrgLabel("lastReviewed")
	@SchemaOrgComment(""
			+ "Date on which the content on this web page was last reviewed for accuracy and/or"
			+ " completeness.")
	@CamelizedName("lastReviewed")
	@ConstantizedName("LAST_REVIEWED")
	public interface LastReviewed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/latitude")
	@SchemaOrgLabel("latitude")
	@SchemaOrgComment(""
			+ "The latitude of a location. For example <code>37.42242</code> (<a"
			+ " href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>).")
	@CamelizedName("latitude")
	@ConstantizedName("LATITUDE")
	public interface Latitude extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/learningResourceType")
	@SchemaOrgLabel("learningResourceType")
	@SchemaOrgComment(""
			+ "The predominant type or kind characterizing the learning resource. For example,"
			+ " 'presentation', 'handout'.")
	@CamelizedName("learningResourceType")
	@ConstantizedName("LEARNING_RESOURCE_TYPE")
	public interface LearningResourceType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/legalName")
	@SchemaOrgLabel("legalName")
	@SchemaOrgComment(""
			+ "The official name of the organization, e.g. the registered company name.")
	@CamelizedName("legalName")
	@ConstantizedName("LEGAL_NAME")
	public interface LegalName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/leiCode")
	@SchemaOrgLabel("leiCode")
	@SchemaOrgComment(""
			+ "An organization identifier that uniquely identifies a legal entity as defined in"
			+ " ISO 17442.")
	@CamelizedName("leiCode")
	@ConstantizedName("LEI_CODE")
	public interface LeiCode extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lender")
	@SchemaOrgLabel("lender")
	@SchemaOrgComment(""
			+ "A sub property of participant. The person that lends the object being borrowed.")
	@CamelizedName("lender")
	@ConstantizedName("LENDER")
	public interface Lender extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lesser")
	@SchemaOrgLabel("lesser")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is"
			+ " lesser than the object.")
	@CamelizedName("lesser")
	@ConstantizedName("LESSER")
	public interface Lesser extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lesserOrEqual")
	@SchemaOrgLabel("lesserOrEqual")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is"
			+ " lesser than or equal to the object.")
	@CamelizedName("lesserOrEqual")
	@ConstantizedName("LESSER_OR_EQUAL")
	public interface LesserOrEqual extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/license")
	@SchemaOrgLabel("license")
	@SchemaOrgComment(""
			+ "A license document that applies to this content, typically indicated by URL.")
	@CamelizedName("license")
	@ConstantizedName("LICENSE")
	public interface License extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/line")
	@SchemaOrgLabel("line")
	@SchemaOrgComment(""
			+ "A line is a point-to-point path consisting of two or more points. A line is"
			+ " expressed as a series of two or more point objects separated by space.")
	@CamelizedName("line")
	@ConstantizedName("LINE")
	public interface Line extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/liveBlogUpdate")
	@SchemaOrgLabel("liveBlogUpdate")
	@SchemaOrgComment("An update to the LiveBlog.")
	@CamelizedName("liveBlogUpdate")
	@ConstantizedName("LIVE_BLOG_UPDATE")
	public interface LiveBlogUpdate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BlogPosting
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BlogPosting
		 */
		public Clazz.BlogPosting getBlogPosting();
		public void setBlogPosting(Clazz.BlogPosting blogPosting);
		public List<Clazz.BlogPosting> getBlogPostingList();
		public void setBlogPostingList(List<Clazz.BlogPosting> blogPostingList);
		public boolean hasBlogPosting();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/loanTerm")
	@SchemaOrgLabel("loanTerm")
	@SchemaOrgComment(""
			+ "The duration of the loan or credit agreement.")
	@CamelizedName("loanTerm")
	@ConstantizedName("LOAN_TERM")
	public interface LoanTerm extends Duration, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/location")
	@SchemaOrgLabel("location")
	@SchemaOrgComment(""
			+ "The location of for example where the event is happening, an organization is"
			+ " located, or where an action takes place.")
	@CamelizedName("location")
	@ConstantizedName("LOCATION")
	public interface Location extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/locationCreated")
	@SchemaOrgLabel("locationCreated")
	@SchemaOrgComment(""
			+ "The location where the CreativeWork was created, which may not be the same as"
			+ " the location depicted in the CreativeWork.")
	@CamelizedName("locationCreated")
	@ConstantizedName("LOCATION_CREATED")
	public interface LocationCreated extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lodgingUnitDescription")
	@SchemaOrgLabel("lodgingUnitDescription")
	@SchemaOrgComment("A full description of the lodging unit.")
	@CamelizedName("lodgingUnitDescription")
	@ConstantizedName("LODGING_UNIT_DESCRIPTION")
	public interface LodgingUnitDescription extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lodgingUnitType")
	@SchemaOrgLabel("lodgingUnitType")
	@SchemaOrgComment(""
			+ "Textual description of the unit type (including suite vs. room, size of bed,"
			+ " etc.).")
	@CamelizedName("lodgingUnitType")
	@ConstantizedName("LODGING_UNIT_TYPE")
	public interface LodgingUnitType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/logo")
	@SchemaOrgLabel("logo")
	@SchemaOrgComment("An associated logo.")
	@CamelizedName("logo")
	@ConstantizedName("LOGO")
	public interface Logo extends Image, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/longitude")
	@SchemaOrgLabel("longitude")
	@SchemaOrgComment(""
			+ "The longitude of a location. For example <code>-122.08585</code> (<a"
			+ " href=\"https://en.wikipedia.org/wiki/World_Geodetic_System\">WGS 84</a>).")
	@CamelizedName("longitude")
	@ConstantizedName("LONGITUDE")
	public interface Longitude extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/loser")
	@SchemaOrgLabel("loser")
	@SchemaOrgComment(""
			+ "A sub property of participant. The loser of the action.")
	@CamelizedName("loser")
	@ConstantizedName("LOSER")
	public interface Loser extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lowPrice")
	@SchemaOrgLabel("lowPrice")
	@SchemaOrgComment(""
			+ "The lowest price of all offers available.")
	@CamelizedName("lowPrice")
	@ConstantizedName("LOW_PRICE")
	public interface LowPrice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lyricist")
	@SchemaOrgLabel("lyricist")
	@SchemaOrgComment("The person who wrote the words.")
	@CamelizedName("lyricist")
	@ConstantizedName("LYRICIST")
	public interface Lyricist extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/lyrics")
	@SchemaOrgLabel("lyrics")
	@SchemaOrgComment("The words in the song.")
	@CamelizedName("lyrics")
	@ConstantizedName("LYRICS")
	public interface Lyrics extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mainContentOfPage")
	@SchemaOrgLabel("mainContentOfPage")
	@SchemaOrgComment(""
			+ "Indicates if this web page element is the main subject of the page.")
	@CamelizedName("mainContentOfPage")
	@ConstantizedName("MAIN_CONTENT_OF_PAGE")
	public interface MainContentOfPage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/WebPageElement
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.WebPageElement
		 */
		public Clazz.WebPageElement getWebPageElement();
		public void setWebPageElement(Clazz.WebPageElement webPageElement);
		public List<Clazz.WebPageElement> getWebPageElementList();
		public void setWebPageElementList(List<Clazz.WebPageElement> webPageElementList);
		public boolean hasWebPageElement();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mainEntity")
	@SchemaOrgLabel("mainEntity")
	@SchemaOrgComment(""
			+ "Indicates the primary entity described in some page or other CreativeWork.")
	@CamelizedName("mainEntity")
	@ConstantizedName("MAIN_ENTITY")
	public interface MainEntity extends About, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mainEntityOfPage")
	@SchemaOrgLabel("mainEntityOfPage")
	@SchemaOrgComment(""
			+ "Indicates a page (or other CreativeWork) for which this thing is the main entity"
			+ " being described. See <a"
			+ " href=\"/docs/datamodel.html#mainEntityBackground\">background notes</a> for"
			+ " details.")
	@CamelizedName("mainEntityOfPage")
	@ConstantizedName("MAIN_ENTITY_OF_PAGE")
	public interface MainEntityOfPage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/makesOffer")
	@SchemaOrgLabel("makesOffer")
	@SchemaOrgComment(""
			+ "A pointer to products or services offered by the organization or person.")
	@CamelizedName("makesOffer")
	@ConstantizedName("MAKES_OFFER")
	public interface MakesOffer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Offer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Offer
		 */
		public Clazz.Offer getOffer();
		public void setOffer(Clazz.Offer offer);
		public List<Clazz.Offer> getOfferList();
		public void setOfferList(List<Clazz.Offer> offerList);
		public boolean hasOffer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/manufacturer")
	@SchemaOrgLabel("manufacturer")
	@SchemaOrgComment("The manufacturer of the product.")
	@CamelizedName("manufacturer")
	@ConstantizedName("MANUFACTURER")
	public interface Manufacturer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mapType")
	@SchemaOrgLabel("mapType")
	@SchemaOrgComment(""
			+ "Indicates the kind of Map, from the MapCategoryType Enumeration.")
	@CamelizedName("mapType")
	@ConstantizedName("MAP_TYPE")
	public interface MapType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MapCategoryType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MapCategoryType
		 */
		public Clazz.MapCategoryType getMapCategoryType();
		public void setMapCategoryType(Clazz.MapCategoryType mapCategoryType);
		public List<Clazz.MapCategoryType> getMapCategoryTypeList();
		public void setMapCategoryTypeList(List<Clazz.MapCategoryType> mapCategoryTypeList);
		public boolean hasMapCategoryType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/material")
	@SchemaOrgLabel("material")
	@SchemaOrgComment(""
			+ "A material that something is made from, e.g. leather, wool, cotton, paper.")
	@CamelizedName("material")
	@ConstantizedName("MATERIAL")
	public interface Material extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/maxPrice")
	@SchemaOrgLabel("maxPrice")
	@SchemaOrgComment(""
			+ "The highest price if the price is a range.")
	@CamelizedName("maxPrice")
	@ConstantizedName("MAX_PRICE")
	public interface MaxPrice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/maxValue")
	@SchemaOrgLabel("maxValue")
	@SchemaOrgComment(""
			+ "The upper value of some characteristic or property.")
	@CamelizedName("maxValue")
	@ConstantizedName("MAX_VALUE")
	public interface MaxValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/maximumAttendeeCapacity")
	@SchemaOrgLabel("maximumAttendeeCapacity")
	@SchemaOrgComment(""
			+ "The total number of individuals that may attend an event or venue.")
	@CamelizedName("maximumAttendeeCapacity")
	@ConstantizedName("MAXIMUM_ATTENDEE_CAPACITY")
	public interface MaximumAttendeeCapacity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mealService")
	@SchemaOrgLabel("mealService")
	@SchemaOrgComment(""
			+ "Description of the meals that will be provided or available for purchase.")
	@CamelizedName("mealService")
	@ConstantizedName("MEAL_SERVICE")
	public interface MealService extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/member")
	@SchemaOrgLabel("member")
	@SchemaOrgComment(""
			+ "A member of an Organization or a ProgramMembership. Organizations can be members"
			+ " of organizations; ProgramMembership is typically for individuals.")
	@CamelizedName("member")
	@ConstantizedName("MEMBER")
	public interface Member extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/memberOf")
	@SchemaOrgLabel("memberOf")
	@SchemaOrgComment(""
			+ "An Organization (or ProgramMembership) to which this Person or Organization"
			+ " belongs.")
	@CamelizedName("memberOf")
	@ConstantizedName("MEMBER_OF")
	public interface MemberOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/ProgramMembership
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProgramMembership
		 */
		public Clazz.ProgramMembership getProgramMembership();
		public void setProgramMembership(Clazz.ProgramMembership programMembership);
		public List<Clazz.ProgramMembership> getProgramMembershipList();
		public void setProgramMembershipList(List<Clazz.ProgramMembership> programMembershipList);
		public boolean hasProgramMembership();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/membershipNumber")
	@SchemaOrgLabel("membershipNumber")
	@SchemaOrgComment("A unique identifier for the membership.")
	@CamelizedName("membershipNumber")
	@ConstantizedName("MEMBERSHIP_NUMBER")
	public interface MembershipNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/memoryRequirements")
	@SchemaOrgLabel("memoryRequirements")
	@SchemaOrgComment("Minimum memory requirements.")
	@CamelizedName("memoryRequirements")
	@ConstantizedName("MEMORY_REQUIREMENTS")
	public interface MemoryRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mentions")
	@SchemaOrgLabel("mentions")
	@SchemaOrgComment(""
			+ "Indicates that the CreativeWork contains a reference to, but is not necessarily"
			+ " about a concept.")
	@CamelizedName("mentions")
	@ConstantizedName("MENTIONS")
	public interface Mentions extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/messageAttachment")
	@SchemaOrgLabel("messageAttachment")
	@SchemaOrgComment("A CreativeWork attached to the message.")
	@CamelizedName("messageAttachment")
	@ConstantizedName("MESSAGE_ATTACHMENT")
	public interface MessageAttachment extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mileageFromOdometer")
	@SchemaOrgLabel("mileageFromOdometer")
	@SchemaOrgComment(""
			+ "The total distance travelled by the particular vehicle since its initial"
			+ " production, as read from its odometer.</p>\n\n<p>Typical unit code(s): KMT for"
			+ " kilometers, SMI for statute miles")
	@CamelizedName("mileageFromOdometer")
	@ConstantizedName("MILEAGE_FROM_ODOMETER")
	public interface MileageFromOdometer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/minPrice")
	@SchemaOrgLabel("minPrice")
	@SchemaOrgComment(""
			+ "The lowest price if the price is a range.")
	@CamelizedName("minPrice")
	@ConstantizedName("MIN_PRICE")
	public interface MinPrice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/minValue")
	@SchemaOrgLabel("minValue")
	@SchemaOrgComment(""
			+ "The lower value of some characteristic or property.")
	@CamelizedName("minValue")
	@ConstantizedName("MIN_VALUE")
	public interface MinValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/minimumPaymentDue")
	@SchemaOrgLabel("minimumPaymentDue")
	@SchemaOrgComment(""
			+ "The minimum payment required at this time.")
	@CamelizedName("minimumPaymentDue")
	@ConstantizedName("MINIMUM_PAYMENT_DUE")
	public interface MinimumPaymentDue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/model")
	@SchemaOrgLabel("model")
	@SchemaOrgComment(""
			+ "The model of the product. Use with the URL of a ProductModel or a textual"
			+ " representation of the model identifier. The URL of the ProductModel can be from"
			+ " an external source. It is recommended to additionally provide strong product"
			+ " identifiers via the gtin8/gtin13/gtin14 and mpn properties.")
	@CamelizedName("model")
	@ConstantizedName("MODEL")
	public interface Model extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ProductModel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProductModel
		 */
		public Clazz.ProductModel getProductModel();
		public void setProductModel(Clazz.ProductModel productModel);
		public List<Clazz.ProductModel> getProductModelList();
		public void setProductModelList(List<Clazz.ProductModel> productModelList);
		public boolean hasProductModel();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/modifiedTime")
	@SchemaOrgLabel("modifiedTime")
	@SchemaOrgComment(""
			+ "The date and time the reservation was modified.")
	@CamelizedName("modifiedTime")
	@ConstantizedName("MODIFIED_TIME")
	public interface ModifiedTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mpn")
	@SchemaOrgLabel("mpn")
	@SchemaOrgComment(""
			+ "The Manufacturer Part Number (MPN) of the product, or the product to which the"
			+ " offer refers.")
	@CamelizedName("mpn")
	@ConstantizedName("MPN")
	public interface Mpn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/multipleValues")
	@SchemaOrgLabel("multipleValues")
	@SchemaOrgComment(""
			+ "Whether multiple values are allowed for the property.  Default is false.")
	@CamelizedName("multipleValues")
	@ConstantizedName("MULTIPLE_VALUES")
	public interface MultipleValues extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/musicArrangement")
	@SchemaOrgLabel("musicArrangement")
	@SchemaOrgComment(""
			+ "An arrangement derived from the composition.")
	@CamelizedName("musicArrangement")
	@ConstantizedName("MUSIC_ARRANGEMENT")
	public interface MusicArrangement extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicComposition
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicComposition
		 */
		public Clazz.MusicComposition getMusicComposition();
		public void setMusicComposition(Clazz.MusicComposition musicComposition);
		public List<Clazz.MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<Clazz.MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/musicBy")
	@SchemaOrgLabel("musicBy")
	@SchemaOrgComment("The composer of the soundtrack.")
	@CamelizedName("musicBy")
	@ConstantizedName("MUSIC_BY")
	public interface MusicBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicGroup
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicGroup
		 */
		public Clazz.MusicGroup getMusicGroup();
		public void setMusicGroup(Clazz.MusicGroup musicGroup);
		public List<Clazz.MusicGroup> getMusicGroupList();
		public void setMusicGroupList(List<Clazz.MusicGroup> musicGroupList);
		public boolean hasMusicGroup();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/musicCompositionForm")
	@SchemaOrgLabel("musicCompositionForm")
	@SchemaOrgComment(""
			+ "The type of composition (e.g. overture, sonata, symphony, etc.).")
	@CamelizedName("musicCompositionForm")
	@ConstantizedName("MUSIC_COMPOSITION_FORM")
	public interface MusicCompositionForm extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/musicReleaseFormat")
	@SchemaOrgLabel("musicReleaseFormat")
	@SchemaOrgComment(""
			+ "Format of this release (the type of recording media used, ie. compact disc,"
			+ " digital media, LP, etc.).")
	@CamelizedName("musicReleaseFormat")
	@ConstantizedName("MUSIC_RELEASE_FORMAT")
	public interface MusicReleaseFormat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicReleaseFormatType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicReleaseFormatType
		 */
		public Clazz.MusicReleaseFormatType getMusicReleaseFormatType();
		public void setMusicReleaseFormatType(Clazz.MusicReleaseFormatType musicReleaseFormatType);
		public List<Clazz.MusicReleaseFormatType> getMusicReleaseFormatTypeList();
		public void setMusicReleaseFormatTypeList(List<Clazz.MusicReleaseFormatType> musicReleaseFormatTypeList);
		public boolean hasMusicReleaseFormatType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/musicalKey")
	@SchemaOrgLabel("musicalKey")
	@SchemaOrgComment(""
			+ "The key, mode, or scale this composition uses.")
	@CamelizedName("musicalKey")
	@ConstantizedName("MUSICAL_KEY")
	public interface MusicalKey extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/naics")
	@SchemaOrgLabel("naics")
	@SchemaOrgComment(""
			+ "The North American Industry Classification System (NAICS) code for a particular"
			+ " organization or business person.")
	@CamelizedName("naics")
	@ConstantizedName("NAICS")
	public interface Naics extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/name")
	@SchemaOrgLabel("name")
	@SchemaOrgComment("The name of the item.")
	@CamelizedName("name")
	@ConstantizedName("NAME")
	public interface Name extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://kyojo.org/schemaSpl/nameFuzzy")
	@SchemaOrgLabel("nameFuzzy")
	@SchemaOrgComment(""
			+ "The normalized name. Variant characters, the space between given and family"
			+ " name, etc.")
	@CamelizedName("nameFuzzy")
	@ConstantizedName("NAME_FUZZY")
	public interface NameFuzzy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://kyojo.org/schemaSpl/nameRuby")
	@SchemaOrgLabel("nameRuby")
	@SchemaOrgComment(""
			+ "Japanese furigana name and things like that.")
	@CamelizedName("nameRuby")
	@ConstantizedName("NAME_RUBY")
	public interface NameRuby extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nationality")
	@SchemaOrgLabel("nationality")
	@SchemaOrgComment("Nationality of the person.")
	@CamelizedName("nationality")
	@ConstantizedName("NATIONALITY")
	public interface Nationality extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Country
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Country
		 */
		public Clazz.Country getCountry();
		public void setCountry(Clazz.Country country);
		public List<Clazz.Country> getCountryList();
		public void setCountryList(List<Clazz.Country> countryList);
		public boolean hasCountry();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/netWorth")
	@SchemaOrgLabel("netWorth")
	@SchemaOrgComment(""
			+ "The total financial value of the person as calculated by subtracting assets from"
			+ " liabilities.")
	@CamelizedName("netWorth")
	@ConstantizedName("NET_WORTH")
	public interface NetWorth extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nextItem")
	@SchemaOrgLabel("nextItem")
	@SchemaOrgComment(""
			+ "A link to the ListItem that follows the current one.")
	@CamelizedName("nextItem")
	@ConstantizedName("NEXT_ITEM")
	public interface NextItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ListItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ListItem
		 */
		public Clazz.ListItem getListItem();
		public void setListItem(Clazz.ListItem listItem);
		public List<Clazz.ListItem> getListItemList();
		public void setListItemList(List<Clazz.ListItem> listItemList);
		public boolean hasListItem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nonEqual")
	@SchemaOrgLabel("nonEqual")
	@SchemaOrgComment(""
			+ "This ordering relation for qualitative values indicates that the subject is not"
			+ " equal to the object.")
	@CamelizedName("nonEqual")
	@ConstantizedName("NON_EQUAL")
	public interface NonEqual extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numAdults")
	@SchemaOrgLabel("numAdults")
	@SchemaOrgComment(""
			+ "The number of adults staying in the unit.")
	@CamelizedName("numAdults")
	@ConstantizedName("NUM_ADULTS")
	public interface NumAdults extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numChildren")
	@SchemaOrgLabel("numChildren")
	@SchemaOrgComment(""
			+ "The number of children staying in the unit.")
	@CamelizedName("numChildren")
	@ConstantizedName("NUM_CHILDREN")
	public interface NumChildren extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numTracks")
	@SchemaOrgLabel("numTracks")
	@SchemaOrgComment(""
			+ "The number of tracks in this album or playlist.")
	@CamelizedName("numTracks")
	@ConstantizedName("NUM_TRACKS")
	public interface NumTracks extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfAirbags")
	@SchemaOrgLabel("numberOfAirbags")
	@SchemaOrgComment(""
			+ "The number or type of airbags in the vehicle.")
	@CamelizedName("numberOfAirbags")
	@ConstantizedName("NUMBER_OF_AIRBAGS")
	public interface NumberOfAirbags extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfAxles")
	@SchemaOrgLabel("numberOfAxles")
	@SchemaOrgComment(""
			+ "The number of axles.</p>\n\n<p>Typical unit code(s): C62")
	@CamelizedName("numberOfAxles")
	@ConstantizedName("NUMBER_OF_AXLES")
	public interface NumberOfAxles extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfBeds")
	@SchemaOrgLabel("numberOfBeds")
	@SchemaOrgComment(""
			+ "The quantity of the given bed type available in the HotelRoom, Suite, House, or"
			+ " Apartment.")
	@CamelizedName("numberOfBeds")
	@ConstantizedName("NUMBER_OF_BEDS")
	public interface NumberOfBeds extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfDoors")
	@SchemaOrgLabel("numberOfDoors")
	@SchemaOrgComment(""
			+ "The number of doors.</p>\n\n<p>Typical unit code(s): C62")
	@CamelizedName("numberOfDoors")
	@ConstantizedName("NUMBER_OF_DOORS")
	public interface NumberOfDoors extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfEmployees")
	@SchemaOrgLabel("numberOfEmployees")
	@SchemaOrgComment(""
			+ "The number of employees in an organization e.g. business.")
	@CamelizedName("numberOfEmployees")
	@ConstantizedName("NUMBER_OF_EMPLOYEES")
	public interface NumberOfEmployees extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfEpisodes")
	@SchemaOrgLabel("numberOfEpisodes")
	@SchemaOrgComment(""
			+ "The number of episodes in this season or series.")
	@CamelizedName("numberOfEpisodes")
	@ConstantizedName("NUMBER_OF_EPISODES")
	public interface NumberOfEpisodes extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfForwardGears")
	@SchemaOrgLabel("numberOfForwardGears")
	@SchemaOrgComment(""
			+ "The total number of forward gears available for the transmission system of the"
			+ " vehicle.</p>\n\n<p>Typical unit code(s): C62")
	@CamelizedName("numberOfForwardGears")
	@ConstantizedName("NUMBER_OF_FORWARD_GEARS")
	public interface NumberOfForwardGears extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfItems")
	@SchemaOrgLabel("numberOfItems")
	@SchemaOrgComment(""
			+ "The number of items in an ItemList. Note that some descriptions might not fully"
			+ " describe all items in a list (e.g., multi-page pagination); in such cases, the"
			+ " numberOfItems would be for the entire list.")
	@CamelizedName("numberOfItems")
	@ConstantizedName("NUMBER_OF_ITEMS")
	public interface NumberOfItems extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfPages")
	@SchemaOrgLabel("numberOfPages")
	@SchemaOrgComment("The number of pages in the book.")
	@CamelizedName("numberOfPages")
	@ConstantizedName("NUMBER_OF_PAGES")
	public interface NumberOfPages extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfPlayers")
	@SchemaOrgLabel("numberOfPlayers")
	@SchemaOrgComment(""
			+ "Indicate how many people can play this game (minimum, maximum, or range).")
	@CamelizedName("numberOfPlayers")
	@ConstantizedName("NUMBER_OF_PLAYERS")
	public interface NumberOfPlayers extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfPreviousOwners")
	@SchemaOrgLabel("numberOfPreviousOwners")
	@SchemaOrgComment(""
			+ "The number of owners of the vehicle, including the current"
			+ " one.</p>\n\n<p>Typical unit code(s): C62")
	@CamelizedName("numberOfPreviousOwners")
	@ConstantizedName("NUMBER_OF_PREVIOUS_OWNERS")
	public interface NumberOfPreviousOwners extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfRooms")
	@SchemaOrgLabel("numberOfRooms")
	@SchemaOrgComment(""
			+ "The number of rooms (excluding bathrooms and closets) of the acccommodation or"
			+ " lodging business.\nTypical unit code(s): ROM for room or C62 for no unit. The"
			+ " type of room can be put in the unitText property of the QuantitativeValue.")
	@CamelizedName("numberOfRooms")
	@ConstantizedName("NUMBER_OF_ROOMS")
	public interface NumberOfRooms extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberOfSeasons")
	@SchemaOrgLabel("numberOfSeasons")
	@SchemaOrgComment("The number of seasons in this series.")
	@CamelizedName("numberOfSeasons")
	@ConstantizedName("NUMBER_OF_SEASONS")
	public interface NumberOfSeasons extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/numberedPosition")
	@SchemaOrgLabel("numberedPosition")
	@SchemaOrgComment(""
			+ "A number associated with a role in an organization, for example, the number on"
			+ " an athlete's jersey.")
	@CamelizedName("numberedPosition")
	@ConstantizedName("NUMBERED_POSITION")
	public interface NumberedPosition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nutrition")
	@SchemaOrgLabel("nutrition")
	@SchemaOrgComment(""
			+ "Nutrition information about the recipe or menu item.")
	@CamelizedName("nutrition")
	@ConstantizedName("NUTRITION")
	public interface Nutrition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/NutritionInformation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.NutritionInformation
		 */
		public Clazz.NutritionInformation getNutritionInformation();
		public void setNutritionInformation(Clazz.NutritionInformation nutritionInformation);
		public List<Clazz.NutritionInformation> getNutritionInformationList();
		public void setNutritionInformationList(List<Clazz.NutritionInformation> nutritionInformationList);
		public boolean hasNutritionInformation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/object")
	@SchemaOrgLabel("object")
	@SchemaOrgComment(""
			+ "The object upon which the action is carried out, whose state is kept intact or"
			+ " changed. Also known as the semantic roles patient, affected or undergoer (which"
			+ " change their state) or theme (which doesn't). e.g. John read <em>a book</em>.")
	@CamelizedName("object")
	@ConstantizedName("OBJECT")
	public interface Object extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/occupancy")
	@SchemaOrgLabel("occupancy")
	@SchemaOrgComment(""
			+ "The allowed total occupancy for the accommodation in persons (including infants"
			+ " etc). For individual accommodations, this is not necessarily the legal maximum"
			+ " but defines the permitted usage as per the contractual agreement (e.g. a double"
			+ " room used by a single person).\nTypical unit code(s): C62 for person")
	@CamelizedName("occupancy")
	@ConstantizedName("OCCUPANCY")
	public interface Occupancy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/offerCount")
	@SchemaOrgLabel("offerCount")
	@SchemaOrgComment("The number of offers for the product.")
	@CamelizedName("offerCount")
	@ConstantizedName("OFFER_COUNT")
	public interface OfferCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/offeredBy")
	@SchemaOrgLabel("offeredBy")
	@SchemaOrgComment(""
			+ "A pointer to the organization or person making the offer.")
	@CamelizedName("offeredBy")
	@ConstantizedName("OFFERED_BY")
	public interface OfferedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/offers")
	@SchemaOrgLabel("offers")
	@SchemaOrgComment(""
			+ "An offer to provide this item&#x2014;for example, an offer to sell a product,"
			+ " rent the DVD of a movie, perform a service, or give away tickets to an event.")
	@CamelizedName("offers")
	@ConstantizedName("OFFERS")
	public interface Offers extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Offer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Offer
		 */
		public Clazz.Offer getOffer();
		public void setOffer(Clazz.Offer offer);
		public List<Clazz.Offer> getOfferList();
		public void setOfferList(List<Clazz.Offer> offerList);
		public boolean hasOffer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/openingHours")
	@SchemaOrgLabel("openingHours")
	@SchemaOrgComment(""
			+ "<p>The general opening hours for a business. Opening hours can be specified as a"
			+ " weekly time range, starting with days, then times per day. Multiple days can be"
			+ " listed with commas ',' separating each day. Day or time ranges are specified"
			+ " using a hyphen '-'.</p>\n\n<ul>\n<li>Days are specified using the following"
			+ " two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>,"
			+ " <code>Th</code>, <code>Fr</code>, <code>Sa</code>,"
			+ " <code>Su</code>.</li>\n<li>Times are specified using 24:00 time. For example,"
			+ " 3pm is specified as <code>15:00</code>. </li>\n<li>Here is an example:"
			+ " <code>&lt;time itemprop=\"openingHours\" datetime=&quot;Tu,Th"
			+ " 16:00-20:00&quot;&gt;Tuesdays and Thursdays"
			+ " 4-8pm&lt;/time&gt;</code>.</li>\n<li>If a business is open 7 days a week, then"
			+ " it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot;"
			+ " datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all"
			+ " day&lt;/time&gt;</code>.</li>\n</ul>\n")
	@CamelizedName("openingHours")
	@ConstantizedName("OPENING_HOURS")
	public interface OpeningHours extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/openingHoursSpecification")
	@SchemaOrgLabel("openingHoursSpecification")
	@SchemaOrgComment("The opening hours of a certain place.")
	@CamelizedName("openingHoursSpecification")
	@ConstantizedName("OPENING_HOURS_SPECIFICATION")
	public interface OpeningHoursSpecification extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OpeningHoursSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OpeningHoursSpecification
		 */
		public Clazz.OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(Clazz.OpeningHoursSpecification openingHoursSpecification);
		public List<Clazz.OpeningHoursSpecification> getOpeningHoursSpecificationList();
		public void setOpeningHoursSpecificationList(List<Clazz.OpeningHoursSpecification> openingHoursSpecificationList);
		public boolean hasOpeningHoursSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/opens")
	@SchemaOrgLabel("opens")
	@SchemaOrgComment(""
			+ "The opening hour of the place or service on the given day(s) of the week.")
	@CamelizedName("opens")
	@ConstantizedName("OPENS")
	public interface Opens extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Time
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Time
		 */
		public DataType.Time getTime();
		public void setTime(DataType.Time time);
		public List<DataType.Time> getTimeList();
		public void setTimeList(List<DataType.Time> timeList);
		public boolean hasTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/operatingSystem")
	@SchemaOrgLabel("operatingSystem")
	@SchemaOrgComment(""
			+ "Operating systems supported (Windows 7, OSX 10.6, Android 1.6).")
	@CamelizedName("operatingSystem")
	@ConstantizedName("OPERATING_SYSTEM")
	public interface OperatingSystem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/opponent")
	@SchemaOrgLabel("opponent")
	@SchemaOrgComment(""
			+ "A sub property of participant. The opponent on this action.")
	@CamelizedName("opponent")
	@ConstantizedName("OPPONENT")
	public interface Opponent extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderDate")
	@SchemaOrgLabel("orderDate")
	@SchemaOrgComment("Date order was placed.")
	@CamelizedName("orderDate")
	@ConstantizedName("ORDER_DATE")
	public interface OrderDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderDelivery")
	@SchemaOrgLabel("orderDelivery")
	@SchemaOrgComment(""
			+ "The delivery of the parcel related to this order or order item.")
	@CamelizedName("orderDelivery")
	@ConstantizedName("ORDER_DELIVERY")
	public interface OrderDelivery extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ParcelDelivery
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ParcelDelivery
		 */
		public Clazz.ParcelDelivery getParcelDelivery();
		public void setParcelDelivery(Clazz.ParcelDelivery parcelDelivery);
		public List<Clazz.ParcelDelivery> getParcelDeliveryList();
		public void setParcelDeliveryList(List<Clazz.ParcelDelivery> parcelDeliveryList);
		public boolean hasParcelDelivery();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderItemNumber")
	@SchemaOrgLabel("orderItemNumber")
	@SchemaOrgComment("The identifier of the order item.")
	@CamelizedName("orderItemNumber")
	@ConstantizedName("ORDER_ITEM_NUMBER")
	public interface OrderItemNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderItemStatus")
	@SchemaOrgLabel("orderItemStatus")
	@SchemaOrgComment("The current status of the order item.")
	@CamelizedName("orderItemStatus")
	@ConstantizedName("ORDER_ITEM_STATUS")
	public interface OrderItemStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OrderStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OrderStatus
		 */
		public Clazz.OrderStatus getOrderStatus();
		public void setOrderStatus(Clazz.OrderStatus orderStatus);
		public List<Clazz.OrderStatus> getOrderStatusList();
		public void setOrderStatusList(List<Clazz.OrderStatus> orderStatusList);
		public boolean hasOrderStatus();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderNumber")
	@SchemaOrgLabel("orderNumber")
	@SchemaOrgComment("The identifier of the transaction.")
	@CamelizedName("orderNumber")
	@ConstantizedName("ORDER_NUMBER")
	public interface OrderNumber extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderQuantity")
	@SchemaOrgLabel("orderQuantity")
	@SchemaOrgComment(""
			+ "The number of the item ordered. If the property is not set, assume the quantity"
			+ " is one.")
	@CamelizedName("orderQuantity")
	@ConstantizedName("ORDER_QUANTITY")
	public interface OrderQuantity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderStatus")
	@SchemaOrgLabel("orderStatus")
	@SchemaOrgComment("The current status of the order.")
	@CamelizedName("orderStatus")
	@ConstantizedName("ORDER_STATUS")
	public interface OrderStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OrderStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OrderStatus
		 */
		public Clazz.OrderStatus getOrderStatus();
		public void setOrderStatus(Clazz.OrderStatus orderStatus);
		public List<Clazz.OrderStatus> getOrderStatusList();
		public void setOrderStatusList(List<Clazz.OrderStatus> orderStatusList);
		public boolean hasOrderStatus();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/orderedItem")
	@SchemaOrgLabel("orderedItem")
	@SchemaOrgComment("The item ordered.")
	@CamelizedName("orderedItem")
	@ConstantizedName("ORDERED_ITEM")
	public interface OrderedItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		/**
		 * uri: http://schema.org/OrderItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OrderItem
		 */
		public Clazz.OrderItem getOrderItem();
		public void setOrderItem(Clazz.OrderItem orderItem);
		public List<Clazz.OrderItem> getOrderItemList();
		public void setOrderItemList(List<Clazz.OrderItem> orderItemList);
		public boolean hasOrderItem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/organizer")
	@SchemaOrgLabel("organizer")
	@SchemaOrgComment("An organizer of an Event.")
	@CamelizedName("organizer")
	@ConstantizedName("ORGANIZER")
	public interface Organizer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/originAddress")
	@SchemaOrgLabel("originAddress")
	@SchemaOrgComment("Shipper's address.")
	@CamelizedName("originAddress")
	@ConstantizedName("ORIGIN_ADDRESS")
	public interface OriginAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ownedFrom")
	@SchemaOrgLabel("ownedFrom")
	@SchemaOrgComment(""
			+ "The date and time of obtaining the product.")
	@CamelizedName("ownedFrom")
	@ConstantizedName("OWNED_FROM")
	public interface OwnedFrom extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ownedThrough")
	@SchemaOrgLabel("ownedThrough")
	@SchemaOrgComment(""
			+ "The date and time of giving up ownership on the product.")
	@CamelizedName("ownedThrough")
	@ConstantizedName("OWNED_THROUGH")
	public interface OwnedThrough extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/owns")
	@SchemaOrgLabel("owns")
	@SchemaOrgComment(""
			+ "Products owned by the organization or person.")
	@CamelizedName("owns")
	@ConstantizedName("OWNS")
	public interface Owns extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OwnershipInfo
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OwnershipInfo
		 */
		public Clazz.OwnershipInfo getOwnershipInfo();
		public void setOwnershipInfo(Clazz.OwnershipInfo ownershipInfo);
		public List<Clazz.OwnershipInfo> getOwnershipInfoList();
		public void setOwnershipInfoList(List<Clazz.OwnershipInfo> ownershipInfoList);
		public boolean hasOwnershipInfo();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pageEnd")
	@SchemaOrgLabel("pageEnd")
	@SchemaOrgComment(""
			+ "The page on which the work ends; for example \"138\" or \"xvi\".")
	@CamelizedName("pageEnd")
	@ConstantizedName("PAGE_END")
	public interface PageEnd extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pageStart")
	@SchemaOrgLabel("pageStart")
	@SchemaOrgComment(""
			+ "The page on which the work starts; for example \"135\" or \"xiii\".")
	@CamelizedName("pageStart")
	@ConstantizedName("PAGE_START")
	public interface PageStart extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pagination")
	@SchemaOrgLabel("pagination")
	@SchemaOrgComment(""
			+ "Any description of pages that is not separated into pageStart and pageEnd; for"
			+ " example, \"1-6, 9, 55\" or \"10-12, 46-49\".")
	@CamelizedName("pagination")
	@ConstantizedName("PAGINATION")
	public interface Pagination extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/parent")
	@SchemaOrgLabel("parent")
	@SchemaOrgComment("A parent of this person.")
	@CamelizedName("parent")
	@ConstantizedName("PARENT")
	public interface Parent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/parentItem")
	@SchemaOrgLabel("parentItem")
	@SchemaOrgComment(""
			+ "The parent of a question, answer or item in general.")
	@CamelizedName("parentItem")
	@ConstantizedName("PARENT_ITEM")
	public interface ParentItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Question
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Question
		 */
		public Clazz.Question getQuestion();
		public void setQuestion(Clazz.Question question);
		public List<Clazz.Question> getQuestionList();
		public void setQuestionList(List<Clazz.Question> questionList);
		public boolean hasQuestion();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/parentOrganization")
	@SchemaOrgLabel("parentOrganization")
	@SchemaOrgComment(""
			+ "The larger organization that this organization is a <a class=\"localLink\""
			+ " href=\"http://schema.org/subOrganization\">subOrganization</a> of, if any.")
	@CamelizedName("parentOrganization")
	@ConstantizedName("PARENT_ORGANIZATION")
	public interface ParentOrganization extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/parentService")
	@SchemaOrgLabel("parentService")
	@SchemaOrgComment(""
			+ "A broadcast service to which the broadcast service may belong to such as"
			+ " regional variations of a national channel.")
	@CamelizedName("parentService")
	@ConstantizedName("PARENT_SERVICE")
	public interface ParentService extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BroadcastService
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastService
		 */
		public Clazz.BroadcastService getBroadcastService();
		public void setBroadcastService(Clazz.BroadcastService broadcastService);
		public List<Clazz.BroadcastService> getBroadcastServiceList();
		public void setBroadcastServiceList(List<Clazz.BroadcastService> broadcastServiceList);
		public boolean hasBroadcastService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfEpisode")
	@SchemaOrgLabel("partOfEpisode")
	@SchemaOrgComment("The episode to which this clip belongs.")
	@CamelizedName("partOfEpisode")
	@ConstantizedName("PART_OF_EPISODE")
	public interface PartOfEpisode extends IsPartOf, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Episode
		 */
		public Clazz.Episode getEpisode();
		public void setEpisode(Clazz.Episode episode);
		public List<Clazz.Episode> getEpisodeList();
		public void setEpisodeList(List<Clazz.Episode> episodeList);
		public boolean hasEpisode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfInvoice")
	@SchemaOrgLabel("partOfInvoice")
	@SchemaOrgComment(""
			+ "The order is being paid as part of the referenced Invoice.")
	@CamelizedName("partOfInvoice")
	@ConstantizedName("PART_OF_INVOICE")
	public interface PartOfInvoice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Invoice
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Invoice
		 */
		public Clazz.Invoice getInvoice();
		public void setInvoice(Clazz.Invoice invoice);
		public List<Clazz.Invoice> getInvoiceList();
		public void setInvoiceList(List<Clazz.Invoice> invoiceList);
		public boolean hasInvoice();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfOrder")
	@SchemaOrgLabel("partOfOrder")
	@SchemaOrgComment(""
			+ "The overall order the items in this delivery were included in.")
	@CamelizedName("partOfOrder")
	@ConstantizedName("PART_OF_ORDER")
	public interface PartOfOrder extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Order
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Order
		 */
		public Clazz.Order getOrder();
		public void setOrder(Clazz.Order order);
		public List<Clazz.Order> getOrderList();
		public void setOrderList(List<Clazz.Order> orderList);
		public boolean hasOrder();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfSeason")
	@SchemaOrgLabel("partOfSeason")
	@SchemaOrgComment(""
			+ "The season to which this episode belongs.")
	@CamelizedName("partOfSeason")
	@ConstantizedName("PART_OF_SEASON")
	public interface PartOfSeason extends IsPartOf, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWorkSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeason
		 */
		public Clazz.CreativeWorkSeason getCreativeWorkSeason();
		public void setCreativeWorkSeason(Clazz.CreativeWorkSeason creativeWorkSeason);
		public List<Clazz.CreativeWorkSeason> getCreativeWorkSeasonList();
		public void setCreativeWorkSeasonList(List<Clazz.CreativeWorkSeason> creativeWorkSeasonList);
		public boolean hasCreativeWorkSeason();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partOfSeries")
	@SchemaOrgLabel("partOfSeries")
	@SchemaOrgComment(""
			+ "The series to which this episode or season belongs.")
	@CamelizedName("partOfSeries")
	@ConstantizedName("PART_OF_SERIES")
	public interface PartOfSeries extends IsPartOf, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWorkSeries
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeries
		 */
		public Clazz.CreativeWorkSeries getCreativeWorkSeries();
		public void setCreativeWorkSeries(Clazz.CreativeWorkSeries creativeWorkSeries);
		public List<Clazz.CreativeWorkSeries> getCreativeWorkSeriesList();
		public void setCreativeWorkSeriesList(List<Clazz.CreativeWorkSeries> creativeWorkSeriesList);
		public boolean hasCreativeWorkSeries();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/participant")
	@SchemaOrgLabel("participant")
	@SchemaOrgComment(""
			+ "Other co-agents that participated in the action indirectly. e.g. John wrote a"
			+ " book with <em>Steve</em>.")
	@CamelizedName("participant")
	@ConstantizedName("PARTICIPANT")
	public interface Participant extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/partySize")
	@SchemaOrgLabel("partySize")
	@SchemaOrgComment(""
			+ "Number of people the reservation should accommodate.")
	@CamelizedName("partySize")
	@ConstantizedName("PARTY_SIZE")
	public interface PartySize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/passengerPriorityStatus")
	@SchemaOrgLabel("passengerPriorityStatus")
	@SchemaOrgComment(""
			+ "The priority status assigned to a passenger for security or boarding (e.g."
			+ " FastTrack or Priority).")
	@CamelizedName("passengerPriorityStatus")
	@ConstantizedName("PASSENGER_PRIORITY_STATUS")
	public interface PassengerPriorityStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/passengerSequenceNumber")
	@SchemaOrgLabel("passengerSequenceNumber")
	@SchemaOrgComment(""
			+ "The passenger's sequence number as assigned by the airline.")
	@CamelizedName("passengerSequenceNumber")
	@ConstantizedName("PASSENGER_SEQUENCE_NUMBER")
	public interface PassengerSequenceNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentAccepted")
	@SchemaOrgLabel("paymentAccepted")
	@SchemaOrgComment("Cash, credit card, etc.")
	@CamelizedName("paymentAccepted")
	@ConstantizedName("PAYMENT_ACCEPTED")
	public interface PaymentAccepted extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentDueDate")
	@SchemaOrgLabel("paymentDueDate")
	@SchemaOrgComment("The date that payment is due.")
	@CamelizedName("paymentDueDate")
	@ConstantizedName("PAYMENT_DUE_DATE")
	public interface PaymentDueDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentMethod")
	@SchemaOrgLabel("paymentMethod")
	@SchemaOrgComment(""
			+ "The name of the credit card or other method of payment for the order.")
	@CamelizedName("paymentMethod")
	@ConstantizedName("PAYMENT_METHOD")
	public interface PaymentMethod extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentMethod
		 */
		public Clazz.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Clazz.PaymentMethod paymentMethod);
		public List<Clazz.PaymentMethod> getPaymentMethodList();
		public void setPaymentMethodList(List<Clazz.PaymentMethod> paymentMethodList);
		public boolean hasPaymentMethod();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentMethodId")
	@SchemaOrgLabel("paymentMethodId")
	@SchemaOrgComment(""
			+ "An identifier for the method of payment used (e.g. the last 4 digits of the"
			+ " credit card).")
	@CamelizedName("paymentMethodId")
	@ConstantizedName("PAYMENT_METHOD_ID")
	public interface PaymentMethodId extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentStatus")
	@SchemaOrgLabel("paymentStatus")
	@SchemaOrgComment(""
			+ "The status of payment; whether the invoice has been paid or not.")
	@CamelizedName("paymentStatus")
	@ConstantizedName("PAYMENT_STATUS")
	public interface PaymentStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/PaymentStatusType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentStatusType
		 */
		public Clazz.PaymentStatusType getPaymentStatusType();
		public void setPaymentStatusType(Clazz.PaymentStatusType paymentStatusType);
		public List<Clazz.PaymentStatusType> getPaymentStatusTypeList();
		public void setPaymentStatusTypeList(List<Clazz.PaymentStatusType> paymentStatusTypeList);
		public boolean hasPaymentStatusType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/paymentUrl")
	@SchemaOrgLabel("paymentUrl")
	@SchemaOrgComment("The URL for sending a payment.")
	@CamelizedName("paymentUrl")
	@ConstantizedName("PAYMENT_URL")
	public interface PaymentUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/performTime")
	@SchemaOrgLabel("performTime")
	@SchemaOrgComment(""
			+ "The length of time it takes to perform instructions or a direction (not"
			+ " including time to prepare the supplies), in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 duration format</a>.")
	@CamelizedName("performTime")
	@ConstantizedName("PERFORM_TIME")
	public interface PerformTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/performer")
	@SchemaOrgLabel("performer")
	@SchemaOrgComment(""
			+ "A performer at the event&#x2014;for example, a presenter, musician, musical"
			+ " group or actor.")
	@CamelizedName("performer")
	@ConstantizedName("PERFORMER")
	public interface Performer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/performerIn")
	@SchemaOrgLabel("performerIn")
	@SchemaOrgComment(""
			+ "Event that this person is a performer or participant in.")
	@CamelizedName("performerIn")
	@ConstantizedName("PERFORMER_IN")
	public interface PerformerIn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/permissionType")
	@SchemaOrgLabel("permissionType")
	@SchemaOrgComment(""
			+ "The type of permission granted the person, organization, or audience.")
	@CamelizedName("permissionType")
	@ConstantizedName("PERMISSION_TYPE")
	public interface PermissionType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DigitalDocumentPermissionType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DigitalDocumentPermissionType
		 */
		public Clazz.DigitalDocumentPermissionType getDigitalDocumentPermissionType();
		public void setDigitalDocumentPermissionType(Clazz.DigitalDocumentPermissionType digitalDocumentPermissionType);
		public List<Clazz.DigitalDocumentPermissionType> getDigitalDocumentPermissionTypeList();
		public void setDigitalDocumentPermissionTypeList(List<Clazz.DigitalDocumentPermissionType> digitalDocumentPermissionTypeList);
		public boolean hasDigitalDocumentPermissionType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/permissions")
	@SchemaOrgLabel("permissions")
	@SchemaOrgComment(""
			+ "Permission(s) required to run the app (for example, a mobile app may require"
			+ " full internet access or may run only on wifi).")
	@CamelizedName("permissions")
	@ConstantizedName("PERMISSIONS")
	public interface Permissions extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/permitAudience")
	@SchemaOrgLabel("permitAudience")
	@SchemaOrgComment("The target audience for this permit.")
	@CamelizedName("permitAudience")
	@ConstantizedName("PERMIT_AUDIENCE")
	public interface PermitAudience extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/permittedUsage")
	@SchemaOrgLabel("permittedUsage")
	@SchemaOrgComment(""
			+ "Indications regarding the permitted usage of the accommodation.")
	@CamelizedName("permittedUsage")
	@ConstantizedName("PERMITTED_USAGE")
	public interface PermittedUsage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/petsAllowed")
	@SchemaOrgLabel("petsAllowed")
	@SchemaOrgComment(""
			+ "Indicates whether pets are allowed to enter the accommodation or lodging"
			+ " business. More detailed information can be put in a text value.")
	@CamelizedName("petsAllowed")
	@ConstantizedName("PETS_ALLOWED")
	public interface PetsAllowed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/photo")
	@SchemaOrgLabel("photo")
	@SchemaOrgComment("A photograph of this place.")
	@CamelizedName("photo")
	@ConstantizedName("PHOTO")
	public interface Photo extends Image, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Photograph
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Photograph
		 */
		public Clazz.Photograph getPhotograph();
		public void setPhotograph(Clazz.Photograph photograph);
		public List<Clazz.Photograph> getPhotographList();
		public void setPhotographList(List<Clazz.Photograph> photographList);
		public boolean hasPhotograph();

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pickupLocation")
	@SchemaOrgLabel("pickupLocation")
	@SchemaOrgComment(""
			+ "Where a taxi will pick up a passenger or a rental car can be picked up.")
	@CamelizedName("pickupLocation")
	@ConstantizedName("PICKUP_LOCATION")
	public interface PickupLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pickupTime")
	@SchemaOrgLabel("pickupTime")
	@SchemaOrgComment(""
			+ "When a taxi will pickup a passenger or a rental car can be picked up.")
	@CamelizedName("pickupTime")
	@ConstantizedName("PICKUP_TIME")
	public interface PickupTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/playMode")
	@SchemaOrgLabel("playMode")
	@SchemaOrgComment(""
			+ "Indicates whether this game is multi-player, co-op or single-player.  The game"
			+ " can be marked as multi-player, co-op and single-player at the same time.")
	@CamelizedName("playMode")
	@ConstantizedName("PLAY_MODE")
	public interface PlayMode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GamePlayMode
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GamePlayMode
		 */
		public Clazz.GamePlayMode getGamePlayMode();
		public void setGamePlayMode(Clazz.GamePlayMode gamePlayMode);
		public List<Clazz.GamePlayMode> getGamePlayModeList();
		public void setGamePlayModeList(List<Clazz.GamePlayMode> gamePlayModeList);
		public boolean hasGamePlayMode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/playerType")
	@SchemaOrgLabel("playerType")
	@SchemaOrgComment(""
			+ "Player type required&#x2014;for example, Flash or Silverlight.")
	@CamelizedName("playerType")
	@ConstantizedName("PLAYER_TYPE")
	public interface PlayerType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/playersOnline")
	@SchemaOrgLabel("playersOnline")
	@SchemaOrgComment("Number of players on the server.")
	@CamelizedName("playersOnline")
	@ConstantizedName("PLAYERS_ONLINE")
	public interface PlayersOnline extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/polygon")
	@SchemaOrgLabel("polygon")
	@SchemaOrgComment(""
			+ "A polygon is the area enclosed by a point-to-point path for which the starting"
			+ " and ending points are the same. A polygon is expressed as a series of four or"
			+ " more space delimited points where the first and final points are identical.")
	@CamelizedName("polygon")
	@ConstantizedName("POLYGON")
	public interface Polygon extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/position")
	@SchemaOrgLabel("position")
	@SchemaOrgComment(""
			+ "The position of an item in a series or sequence of items.")
	@CamelizedName("position")
	@ConstantizedName("POSITION")
	public interface Position extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/postOfficeBoxNumber")
	@SchemaOrgLabel("postOfficeBoxNumber")
	@SchemaOrgComment(""
			+ "The post office box number for PO box addresses.")
	@CamelizedName("postOfficeBoxNumber")
	@ConstantizedName("POST_OFFICE_BOX_NUMBER")
	public interface PostOfficeBoxNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/postalCode")
	@SchemaOrgLabel("postalCode")
	@SchemaOrgComment("The postal code. For example, 94043.")
	@CamelizedName("postalCode")
	@ConstantizedName("POSTAL_CODE")
	public interface PostalCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/potentialAction")
	@SchemaOrgLabel("potentialAction")
	@SchemaOrgComment(""
			+ "Indicates a potential Action, which describes an idealized action in which this"
			+ " thing would play an 'object' role.")
	@CamelizedName("potentialAction")
	@ConstantizedName("POTENTIAL_ACTION")
	public interface PotentialAction extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Action
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Action
		 */
		public Clazz.Action getAction();
		public void setAction(Clazz.Action action);
		public List<Clazz.Action> getActionList();
		public void setActionList(List<Clazz.Action> actionList);
		public boolean hasAction();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/predecessorOf")
	@SchemaOrgLabel("predecessorOf")
	@SchemaOrgComment(""
			+ "A pointer from a previous, often discontinued variant of the product to its"
			+ " newer variant.")
	@CamelizedName("predecessorOf")
	@ConstantizedName("PREDECESSOR_OF")
	public interface PredecessorOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ProductModel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProductModel
		 */
		public Clazz.ProductModel getProductModel();
		public void setProductModel(Clazz.ProductModel productModel);
		public List<Clazz.ProductModel> getProductModelList();
		public void setProductModelList(List<Clazz.ProductModel> productModelList);
		public boolean hasProductModel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/prepTime")
	@SchemaOrgLabel("prepTime")
	@SchemaOrgComment(""
			+ "The length of time it takes to prepare the items to be used in instructions or a"
			+ " direction, in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601"
			+ " duration format</a>.")
	@CamelizedName("prepTime")
	@ConstantizedName("PREP_TIME")
	public interface PrepTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/previousItem")
	@SchemaOrgLabel("previousItem")
	@SchemaOrgComment(""
			+ "A link to the ListItem that preceeds the current one.")
	@CamelizedName("previousItem")
	@ConstantizedName("PREVIOUS_ITEM")
	public interface PreviousItem extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ListItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ListItem
		 */
		public Clazz.ListItem getListItem();
		public void setListItem(Clazz.ListItem listItem);
		public List<Clazz.ListItem> getListItemList();
		public void setListItemList(List<Clazz.ListItem> listItemList);
		public boolean hasListItem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/previousStartDate")
	@SchemaOrgLabel("previousStartDate")
	@SchemaOrgComment(""
			+ "Used in conjunction with eventStatus for rescheduled or cancelled events. This"
			+ " property contains the previously scheduled start date. For rescheduled events,"
			+ " the startDate property should be used for the newly scheduled start date. In"
			+ " the (rare) case of an event that has been postponed and rescheduled multiple"
			+ " times, this field may be repeated.")
	@CamelizedName("previousStartDate")
	@ConstantizedName("PREVIOUS_START_DATE")
	public interface PreviousStartDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/price")
	@SchemaOrgLabel("price")
	@SchemaOrgComment(""
			+ "<p>The offer price of a product, or of a price component when attached to"
			+ " PriceSpecification and its subtypes.</p>\n\n<p>Usage"
			+ " guidelines:</p>\n\n<ul>\n<li>Use the <a class=\"localLink\""
			+ " href=\"http://schema.org/priceCurrency\">priceCurrency</a> property (with <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_4217#Active_codes\">ISO 4217 codes</a>"
			+ " e.g. \"USD\") instead of\n  including <a"
			+ " href=\"http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign\">ambiguous"
			+ " symbols</a> such as '$' in the value.</li>\n<li>Use '.' (Unicode 'FULL STOP'"
			+ " (U+002E)) rather than ',' to indicate a decimal point. Avoid using these"
			+ " symbols as a readability separator.</li>\n<li>Note that both <a"
			+ " href=\"http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute\">RDFa</a>"
			+ " and Microdata syntax allow the use of a \"content=\" attribute for publishing"
			+ " simple machine-readable values alongside more human-friendly"
			+ " formatting.</li>\n<li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030)"
			+ " to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode"
			+ " symbols.</li>\n</ul>\n")
	@CamelizedName("price")
	@ConstantizedName("PRICE")
	public interface Price extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceComponent")
	@SchemaOrgLabel("priceComponent")
	@SchemaOrgComment(""
			+ "This property links to all <a class=\"localLink\""
			+ " href=\"http://schema.org/UnitPriceSpecification\">UnitPriceSpecification</a>"
			+ " nodes that apply in parallel for the <a class=\"localLink\""
			+ " href=\"http://schema.org/CompoundPriceSpecification\">CompoundPriceSpecification</a>"
			+ " node.")
	@CamelizedName("priceComponent")
	@ConstantizedName("PRICE_COMPONENT")
	public interface PriceComponent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/UnitPriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.UnitPriceSpecification
		 */
		public Clazz.UnitPriceSpecification getUnitPriceSpecification();
		public void setUnitPriceSpecification(Clazz.UnitPriceSpecification unitPriceSpecification);
		public List<Clazz.UnitPriceSpecification> getUnitPriceSpecificationList();
		public void setUnitPriceSpecificationList(List<Clazz.UnitPriceSpecification> unitPriceSpecificationList);
		public boolean hasUnitPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceCurrency")
	@SchemaOrgLabel("priceCurrency")
	@SchemaOrgComment(""
			+ "The currency (in 3-letter ISO 4217 format) of the price or a price component,"
			+ " when attached to <a class=\"localLink\""
			+ " href=\"http://schema.org/PriceSpecification\">PriceSpecification</a> and its"
			+ " subtypes.")
	@CamelizedName("priceCurrency")
	@ConstantizedName("PRICE_CURRENCY")
	public interface PriceCurrency extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceRange")
	@SchemaOrgLabel("priceRange")
	@SchemaOrgComment(""
			+ "The price range of the business, for example <code>$$$</code>.")
	@CamelizedName("priceRange")
	@ConstantizedName("PRICE_RANGE")
	public interface PriceRange extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceSpecification")
	@SchemaOrgLabel("priceSpecification")
	@SchemaOrgComment(""
			+ "One or more detailed price specifications, indicating the unit price and"
			+ " delivery or payment charges.")
	@CamelizedName("priceSpecification")
	@ConstantizedName("PRICE_SPECIFICATION")
	public interface PriceSpecification extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceType")
	@SchemaOrgLabel("priceType")
	@SchemaOrgComment(""
			+ "A short text or acronym indicating multiple price specifications for the same"
			+ " offer, e.g. SRP for the suggested retail price or INVOICE for the invoice"
			+ " price, mostly used in the car industry.")
	@CamelizedName("priceType")
	@ConstantizedName("PRICE_TYPE")
	public interface PriceType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/priceValidUntil")
	@SchemaOrgLabel("priceValidUntil")
	@SchemaOrgComment(""
			+ "The date after which the price is no longer available.")
	@CamelizedName("priceValidUntil")
	@ConstantizedName("PRICE_VALID_UNTIL")
	public interface PriceValidUntil extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/primaryImageOfPage")
	@SchemaOrgLabel("primaryImageOfPage")
	@SchemaOrgComment("Indicates the main image on the page.")
	@CamelizedName("primaryImageOfPage")
	@ConstantizedName("PRIMARY_IMAGE_OF_PAGE")
	public interface PrimaryImageOfPage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/printColumn")
	@SchemaOrgLabel("printColumn")
	@SchemaOrgComment(""
			+ "The number of the column in which the NewsArticle appears in the print edition.")
	@CamelizedName("printColumn")
	@ConstantizedName("PRINT_COLUMN")
	public interface PrintColumn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/printEdition")
	@SchemaOrgLabel("printEdition")
	@SchemaOrgComment(""
			+ "The edition of the print product in which the NewsArticle appears.")
	@CamelizedName("printEdition")
	@ConstantizedName("PRINT_EDITION")
	public interface PrintEdition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/printPage")
	@SchemaOrgLabel("printPage")
	@SchemaOrgComment(""
			+ "If this NewsArticle appears in print, this field indicates the name of the page"
			+ " on which the article is found. Please note that this field is intended for the"
			+ " exact page name (e.g. A5, B18).")
	@CamelizedName("printPage")
	@ConstantizedName("PRINT_PAGE")
	public interface PrintPage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/printSection")
	@SchemaOrgLabel("printSection")
	@SchemaOrgComment(""
			+ "If this NewsArticle appears in print, this field indicates the print section in"
			+ " which the article appeared.")
	@CamelizedName("printSection")
	@ConstantizedName("PRINT_SECTION")
	public interface PrintSection extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/processingTime")
	@SchemaOrgLabel("processingTime")
	@SchemaOrgComment(""
			+ "Estimated processing time for the service using this channel.")
	@CamelizedName("processingTime")
	@ConstantizedName("PROCESSING_TIME")
	public interface ProcessingTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/processorRequirements")
	@SchemaOrgLabel("processorRequirements")
	@SchemaOrgComment(""
			+ "Processor architecture required to run the application (e.g. IA64).")
	@CamelizedName("processorRequirements")
	@ConstantizedName("PROCESSOR_REQUIREMENTS")
	public interface ProcessorRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/producer")
	@SchemaOrgLabel("producer")
	@SchemaOrgComment(""
			+ "The person or organization who produced the work (e.g. music album, movie,"
			+ " tv/radio series etc.).")
	@CamelizedName("producer")
	@ConstantizedName("PRODUCER")
	public interface Producer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/productID")
	@SchemaOrgLabel("productID")
	@SchemaOrgComment(""
			+ "The product identifier, such as ISBN. For example: <code>meta"
			+ " itemprop=\"productID\" content=\"isbn:123-456-789\"</code>.")
	@CamelizedName("productID")
	@ConstantizedName("PRODUCT_ID")
	public interface ProductID extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/productSupported")
	@SchemaOrgLabel("productSupported")
	@SchemaOrgComment(""
			+ "The product or service this support contact point is related to (such as product"
			+ " support for a particular product line). This can be a specific product or"
			+ " product line (e.g. \"iPhone\") or a general category of products or services"
			+ " (e.g. \"smartphones\").")
	@CamelizedName("productSupported")
	@ConstantizedName("PRODUCT_SUPPORTED")
	public interface ProductSupported extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/productionCompany")
	@SchemaOrgLabel("productionCompany")
	@SchemaOrgComment(""
			+ "The production company or studio responsible for the item e.g. series, video"
			+ " game, episode etc.")
	@CamelizedName("productionCompany")
	@ConstantizedName("PRODUCTION_COMPANY")
	public interface ProductionCompany extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/productionDate")
	@SchemaOrgLabel("productionDate")
	@SchemaOrgComment(""
			+ "The date of production of the item, e.g. vehicle.")
	@CamelizedName("productionDate")
	@ConstantizedName("PRODUCTION_DATE")
	public interface ProductionDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/proficiencyLevel")
	@SchemaOrgLabel("proficiencyLevel")
	@SchemaOrgComment(""
			+ "Proficiency needed for this content; expected values: 'Beginner', 'Expert'.")
	@CamelizedName("proficiencyLevel")
	@ConstantizedName("PROFICIENCY_LEVEL")
	public interface ProficiencyLevel extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/programMembershipUsed")
	@SchemaOrgLabel("programMembershipUsed")
	@SchemaOrgComment(""
			+ "Any membership in a frequent flyer, hotel loyalty program, etc. being applied to"
			+ " the reservation.")
	@CamelizedName("programMembershipUsed")
	@ConstantizedName("PROGRAM_MEMBERSHIP_USED")
	public interface ProgramMembershipUsed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ProgramMembership
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProgramMembership
		 */
		public Clazz.ProgramMembership getProgramMembership();
		public void setProgramMembership(Clazz.ProgramMembership programMembership);
		public List<Clazz.ProgramMembership> getProgramMembershipList();
		public void setProgramMembershipList(List<Clazz.ProgramMembership> programMembershipList);
		public boolean hasProgramMembership();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/programName")
	@SchemaOrgLabel("programName")
	@SchemaOrgComment("The program providing the membership.")
	@CamelizedName("programName")
	@ConstantizedName("PROGRAM_NAME")
	public interface ProgramName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/programmingLanguage")
	@SchemaOrgLabel("programmingLanguage")
	@SchemaOrgComment("The computer programming language.")
	@CamelizedName("programmingLanguage")
	@ConstantizedName("PROGRAMMING_LANGUAGE")
	public interface ProgrammingLanguage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/ComputerLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ComputerLanguage
		 */
		public Clazz.ComputerLanguage getComputerLanguage();
		public void setComputerLanguage(Clazz.ComputerLanguage computerLanguage);
		public List<Clazz.ComputerLanguage> getComputerLanguageList();
		public void setComputerLanguageList(List<Clazz.ComputerLanguage> computerLanguageList);
		public boolean hasComputerLanguage();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/programmingModel")
	@SchemaOrgLabel("programmingModel")
	@SchemaOrgComment(""
			+ "Indicates whether API is managed or unmanaged.")
	@CamelizedName("programmingModel")
	@ConstantizedName("PROGRAMMING_MODEL")
	public interface ProgrammingModel extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/propertyID")
	@SchemaOrgLabel("propertyID")
	@SchemaOrgComment(""
			+ "A commonly used identifier for the characteristic represented by the property,"
			+ " e.g. a manufacturer or a standard code for a property. propertyID can be\n(1) a"
			+ " prefixed string, mainly meant to be used with standards for product properties;"
			+ " (2) a site-specific, non-prefixed string (e.g. the primary key of the property"
			+ " or the vendor-specific id of the property), or (3)\na URL indicating the type"
			+ " of the property, either pointing to an external vocabulary, or a Web resource"
			+ " that describes the property (e.g. a glossary entry).\nStandards bodies should"
			+ " promote a standard prefix for the identifiers of properties from their"
			+ " standards.")
	@CamelizedName("propertyID")
	@ConstantizedName("PROPERTY_ID")
	public interface PropertyID extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/proteinContent")
	@SchemaOrgLabel("proteinContent")
	@SchemaOrgComment("The number of grams of protein.")
	@CamelizedName("proteinContent")
	@ConstantizedName("PROTEIN_CONTENT")
	public interface ProteinContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/provider")
	@SchemaOrgLabel("provider")
	@SchemaOrgComment(""
			+ "The service provider, service operator, or service performer; the goods"
			+ " producer. Another party (a seller) may offer those services or goods on behalf"
			+ " of the provider. A provider may also serve as the seller.")
	@CamelizedName("provider")
	@ConstantizedName("PROVIDER")
	public interface Provider extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/providerMobility")
	@SchemaOrgLabel("providerMobility")
	@SchemaOrgComment(""
			+ "Indicates the mobility of a provided service (e.g. 'static', 'dynamic').")
	@CamelizedName("providerMobility")
	@ConstantizedName("PROVIDER_MOBILITY")
	public interface ProviderMobility extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/providesBroadcastService")
	@SchemaOrgLabel("providesBroadcastService")
	@SchemaOrgComment(""
			+ "The BroadcastService offered on this channel.")
	@CamelizedName("providesBroadcastService")
	@ConstantizedName("PROVIDES_BROADCAST_SERVICE")
	public interface ProvidesBroadcastService extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BroadcastService
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastService
		 */
		public Clazz.BroadcastService getBroadcastService();
		public void setBroadcastService(Clazz.BroadcastService broadcastService);
		public List<Clazz.BroadcastService> getBroadcastServiceList();
		public void setBroadcastServiceList(List<Clazz.BroadcastService> broadcastServiceList);
		public boolean hasBroadcastService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/providesService")
	@SchemaOrgLabel("providesService")
	@SchemaOrgComment("The service provided by this channel.")
	@CamelizedName("providesService")
	@ConstantizedName("PROVIDES_SERVICE")
	public interface ProvidesService extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publicAccess")
	@SchemaOrgLabel("publicAccess")
	@SchemaOrgComment(""
			+ "A flag to signal that the <a class=\"localLink\""
			+ " href=\"http://schema.org/Place\">Place</a> is open to public visitors.  If this"
			+ " property is omitted there is no assumed default boolean value")
	@CamelizedName("publicAccess")
	@ConstantizedName("PUBLIC_ACCESS")
	public interface PublicAccess extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publication")
	@SchemaOrgLabel("publication")
	@SchemaOrgComment(""
			+ "A publication event associated with the item.")
	@CamelizedName("publication")
	@ConstantizedName("PUBLICATION")
	public interface Publication extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PublicationEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationEvent
		 */
		public Clazz.PublicationEvent getPublicationEvent();
		public void setPublicationEvent(Clazz.PublicationEvent publicationEvent);
		public List<Clazz.PublicationEvent> getPublicationEventList();
		public void setPublicationEventList(List<Clazz.PublicationEvent> publicationEventList);
		public boolean hasPublicationEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publishedOn")
	@SchemaOrgLabel("publishedOn")
	@SchemaOrgComment(""
			+ "A broadcast service associated with the publication event.")
	@CamelizedName("publishedOn")
	@ConstantizedName("PUBLISHED_ON")
	public interface PublishedOn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BroadcastService
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastService
		 */
		public Clazz.BroadcastService getBroadcastService();
		public void setBroadcastService(Clazz.BroadcastService broadcastService);
		public List<Clazz.BroadcastService> getBroadcastServiceList();
		public void setBroadcastServiceList(List<Clazz.BroadcastService> broadcastServiceList);
		public boolean hasBroadcastService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publisher")
	@SchemaOrgLabel("publisher")
	@SchemaOrgComment("The publisher of the creative work.")
	@CamelizedName("publisher")
	@ConstantizedName("PUBLISHER")
	public interface Publisher extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/publishingPrinciples")
	@SchemaOrgLabel("publishingPrinciples")
	@SchemaOrgComment(""
			+ "The publishingPrinciples property indicates (typically via <a"
			+ " class=\"localLink\" href=\"http://schema.org/URL\">URL</a>) a document"
			+ " describing the editorial principles of an <a class=\"localLink\""
			+ " href=\"http://schema.org/Organization\">Organization</a> (or individual e.g. a"
			+ " <a class=\"localLink\" href=\"http://schema.org/Person\">Person</a> writing a"
			+ " blog) that relate to their activities as a publisher, e.g. ethics or diversity"
			+ " policies. When applied to a <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a> (e.g. <a"
			+ " class=\"localLink\" href=\"http://schema.org/NewsArticle\">NewsArticle</a>) the"
			+ " principles are those of the party primarily responsible for the creation of the"
			+ " <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWork\">CreativeWork</a>.</p>\n\n<p>While such"
			+ " policies are most typically expressed in natural language, sometimes related"
			+ " information (e.g. indicating a <a class=\"localLink\""
			+ " href=\"http://schema.org/funder\">funder</a>) can be expressed using schema.org"
			+ " terminology.")
	@CamelizedName("publishingPrinciples")
	@ConstantizedName("PUBLISHING_PRINCIPLES")
	public interface PublishingPrinciples extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/purchaseDate")
	@SchemaOrgLabel("purchaseDate")
	@SchemaOrgComment(""
			+ "The date the item e.g. vehicle was purchased by the current owner.")
	@CamelizedName("purchaseDate")
	@ConstantizedName("PURCHASE_DATE")
	public interface PurchaseDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/query")
	@SchemaOrgLabel("query")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The query used on this action.")
	@CamelizedName("query")
	@ConstantizedName("QUERY")
	public interface Query extends Instrument, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/quest")
	@SchemaOrgLabel("quest")
	@SchemaOrgComment(""
			+ "The task that a player-controlled character, or group of characters may complete"
			+ " in order to gain a reward.")
	@CamelizedName("quest")
	@ConstantizedName("QUEST")
	public interface Quest extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/question")
	@SchemaOrgLabel("question")
	@SchemaOrgComment("A sub property of object. A question.")
	@CamelizedName("question")
	@ConstantizedName("QUESTION")
	public interface Question extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Question
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Question
		 */
		public Clazz.Question getQuestion();
		public void setQuestion(Clazz.Question question);
		public List<Clazz.Question> getQuestionList();
		public void setQuestionList(List<Clazz.Question> questionList);
		public boolean hasQuestion();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ratingCount")
	@SchemaOrgLabel("ratingCount")
	@SchemaOrgComment("The count of total number of ratings.")
	@CamelizedName("ratingCount")
	@ConstantizedName("RATING_COUNT")
	public interface RatingCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ratingValue")
	@SchemaOrgLabel("ratingValue")
	@SchemaOrgComment("The rating for the content.")
	@CamelizedName("ratingValue")
	@ConstantizedName("RATING_VALUE")
	public interface RatingValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/readonlyValue")
	@SchemaOrgLabel("readonlyValue")
	@SchemaOrgComment(""
			+ "Whether or not a property is mutable.  Default is false. Specifying this for a"
			+ " property that also has a value makes it act similar to a \"hidden\" input in an"
			+ " HTML form.")
	@CamelizedName("readonlyValue")
	@ConstantizedName("READONLY_VALUE")
	public interface ReadonlyValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/realEstateAgent")
	@SchemaOrgLabel("realEstateAgent")
	@SchemaOrgComment(""
			+ "A sub property of participant. The real estate agent involved in the action.")
	@CamelizedName("realEstateAgent")
	@ConstantizedName("REAL_ESTATE_AGENT")
	public interface RealEstateAgent extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/RealEstateAgent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.RealEstateAgent
		 */
		public Clazz.RealEstateAgent getRealEstateAgent();
		public void setRealEstateAgent(Clazz.RealEstateAgent realEstateAgent);
		public List<Clazz.RealEstateAgent> getRealEstateAgentList();
		public void setRealEstateAgentList(List<Clazz.RealEstateAgent> realEstateAgentList);
		public boolean hasRealEstateAgent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipe")
	@SchemaOrgLabel("recipe")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The recipe/instructions used to perform the"
			+ " action.")
	@CamelizedName("recipe")
	@ConstantizedName("RECIPE")
	public interface Recipe extends Instrument, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Recipe
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Recipe
		 */
		public Clazz.Recipe getRecipe();
		public void setRecipe(Clazz.Recipe recipe);
		public List<Clazz.Recipe> getRecipeList();
		public void setRecipeList(List<Clazz.Recipe> recipeList);
		public boolean hasRecipe();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipeCategory")
	@SchemaOrgLabel("recipeCategory")
	@SchemaOrgComment(""
			+ "The category of the recipe—for example, appetizer, entree, etc.")
	@CamelizedName("recipeCategory")
	@ConstantizedName("RECIPE_CATEGORY")
	public interface RecipeCategory extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipeCuisine")
	@SchemaOrgLabel("recipeCuisine")
	@SchemaOrgComment(""
			+ "The cuisine of the recipe (for example, French or Ethiopian).")
	@CamelizedName("recipeCuisine")
	@ConstantizedName("RECIPE_CUISINE")
	public interface RecipeCuisine extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipeIngredient")
	@SchemaOrgLabel("recipeIngredient")
	@SchemaOrgComment(""
			+ "A single ingredient used in the recipe, e.g. sugar, flour or garlic.")
	@CamelizedName("recipeIngredient")
	@ConstantizedName("RECIPE_INGREDIENT")
	public interface RecipeIngredient extends SchemaOrgProperty, Supply {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipeInstructions")
	@SchemaOrgLabel("recipeInstructions")
	@SchemaOrgComment(""
			+ "A step in making the recipe, in the form of a single item (document, video,"
			+ " etc.) or an ordered list with HowToStep and/or HowToSection items.")
	@CamelizedName("recipeInstructions")
	@ConstantizedName("RECIPE_INSTRUCTIONS")
	public interface RecipeInstructions extends SchemaOrgProperty, Steps {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * uri: http://schema.org/ItemList
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ItemList
		 */
		public Clazz.ItemList getItemList();
		public void setItemList(Clazz.ItemList itemList);
		public List<Clazz.ItemList> getItemListList();
		public void setItemListList(List<Clazz.ItemList> itemListList);
		public boolean hasItemList();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipeYield")
	@SchemaOrgLabel("recipeYield")
	@SchemaOrgComment(""
			+ "The quantity produced by the recipe (for example, number of people served,"
			+ " number of servings, etc).")
	@CamelizedName("recipeYield")
	@ConstantizedName("RECIPE_YIELD")
	public interface RecipeYield extends SchemaOrgProperty, Yield {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recipient")
	@SchemaOrgLabel("recipient")
	@SchemaOrgComment(""
			+ "A sub property of participant. The participant who is at the receiving end of"
			+ " the action.")
	@CamelizedName("recipient")
	@ConstantizedName("RECIPIENT")
	public interface Recipient extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recordLabel")
	@SchemaOrgLabel("recordLabel")
	@SchemaOrgComment("The label that issued the release.")
	@CamelizedName("recordLabel")
	@ConstantizedName("RECORD_LABEL")
	public interface RecordLabel extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recordedAs")
	@SchemaOrgLabel("recordedAs")
	@SchemaOrgComment("An audio recording of the work.")
	@CamelizedName("recordedAs")
	@ConstantizedName("RECORDED_AS")
	public interface RecordedAs extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicRecording
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicRecording
		 */
		public Clazz.MusicRecording getMusicRecording();
		public void setMusicRecording(Clazz.MusicRecording musicRecording);
		public List<Clazz.MusicRecording> getMusicRecordingList();
		public void setMusicRecordingList(List<Clazz.MusicRecording> musicRecordingList);
		public boolean hasMusicRecording();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recordedAt")
	@SchemaOrgLabel("recordedAt")
	@SchemaOrgComment(""
			+ "The Event where the CreativeWork was recorded. The CreativeWork may capture all"
			+ " or part of the event.")
	@CamelizedName("recordedAt")
	@ConstantizedName("RECORDED_AT")
	public interface RecordedAt extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recordedIn")
	@SchemaOrgLabel("recordedIn")
	@SchemaOrgComment(""
			+ "The CreativeWork that captured all or part of this Event.")
	@CamelizedName("recordedIn")
	@ConstantizedName("RECORDED_IN")
	public interface RecordedIn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recordingOf")
	@SchemaOrgLabel("recordingOf")
	@SchemaOrgComment(""
			+ "The composition this track is a recording of.")
	@CamelizedName("recordingOf")
	@ConstantizedName("RECORDING_OF")
	public interface RecordingOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicComposition
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicComposition
		 */
		public Clazz.MusicComposition getMusicComposition();
		public void setMusicComposition(Clazz.MusicComposition musicComposition);
		public List<Clazz.MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<Clazz.MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/referenceQuantity")
	@SchemaOrgLabel("referenceQuantity")
	@SchemaOrgComment(""
			+ "The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh"
			+ " of electricity. This property is a replacement for unitOfMeasurement for the"
			+ " advanced cases where the price does not relate to a standard unit.")
	@CamelizedName("referenceQuantity")
	@ConstantizedName("REFERENCE_QUANTITY")
	public interface ReferenceQuantity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/referencesOrder")
	@SchemaOrgLabel("referencesOrder")
	@SchemaOrgComment(""
			+ "The Order(s) related to this Invoice. One or more Orders may be combined into a"
			+ " single Invoice.")
	@CamelizedName("referencesOrder")
	@ConstantizedName("REFERENCES_ORDER")
	public interface ReferencesOrder extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Order
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Order
		 */
		public Clazz.Order getOrder();
		public void setOrder(Clazz.Order order);
		public List<Clazz.Order> getOrderList();
		public void setOrderList(List<Clazz.Order> orderList);
		public boolean hasOrder();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/regionsAllowed")
	@SchemaOrgLabel("regionsAllowed")
	@SchemaOrgComment(""
			+ "The regions where the media is allowed. If not specified, then it's assumed to"
			+ " be allowed everywhere. Specify the countries in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_3166\">ISO 3166 format</a>.")
	@CamelizedName("regionsAllowed")
	@ConstantizedName("REGIONS_ALLOWED")
	public interface RegionsAllowed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedLink")
	@SchemaOrgLabel("relatedLink")
	@SchemaOrgComment(""
			+ "A link related to this web page, for example to other related web pages.")
	@CamelizedName("relatedLink")
	@ConstantizedName("RELATED_LINK")
	public interface RelatedLink extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedTo")
	@SchemaOrgLabel("relatedTo")
	@SchemaOrgComment("The most generic familial relation.")
	@CamelizedName("relatedTo")
	@ConstantizedName("RELATED_TO")
	public interface RelatedTo extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/releaseDate")
	@SchemaOrgLabel("releaseDate")
	@SchemaOrgComment(""
			+ "The release date of a product or product model. This can be used to distinguish"
			+ " the exact variant of a product.")
	@CamelizedName("releaseDate")
	@ConstantizedName("RELEASE_DATE")
	public interface ReleaseDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/releaseNotes")
	@SchemaOrgLabel("releaseNotes")
	@SchemaOrgComment(""
			+ "Description of what changed in this version.")
	@CamelizedName("releaseNotes")
	@ConstantizedName("RELEASE_NOTES")
	public interface ReleaseNotes extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/releaseOf")
	@SchemaOrgLabel("releaseOf")
	@SchemaOrgComment("The album this is a release of.")
	@CamelizedName("releaseOf")
	@ConstantizedName("RELEASE_OF")
	public interface ReleaseOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicAlbum
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicAlbum
		 */
		public Clazz.MusicAlbum getMusicAlbum();
		public void setMusicAlbum(Clazz.MusicAlbum musicAlbum);
		public List<Clazz.MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<Clazz.MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/releasedEvent")
	@SchemaOrgLabel("releasedEvent")
	@SchemaOrgComment(""
			+ "The place and time the release was issued, expressed as a PublicationEvent.")
	@CamelizedName("releasedEvent")
	@ConstantizedName("RELEASED_EVENT")
	public interface ReleasedEvent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PublicationEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PublicationEvent
		 */
		public Clazz.PublicationEvent getPublicationEvent();
		public void setPublicationEvent(Clazz.PublicationEvent publicationEvent);
		public List<Clazz.PublicationEvent> getPublicationEventList();
		public void setPublicationEventList(List<Clazz.PublicationEvent> publicationEventList);
		public boolean hasPublicationEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/remainingAttendeeCapacity")
	@SchemaOrgLabel("remainingAttendeeCapacity")
	@SchemaOrgComment(""
			+ "The number of attendee places for an event that remain unallocated.")
	@CamelizedName("remainingAttendeeCapacity")
	@ConstantizedName("REMAINING_ATTENDEE_CAPACITY")
	public interface RemainingAttendeeCapacity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/replacee")
	@SchemaOrgLabel("replacee")
	@SchemaOrgComment(""
			+ "A sub property of object. The object that is being replaced.")
	@CamelizedName("replacee")
	@ConstantizedName("REPLACEE")
	public interface Replacee extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/replacer")
	@SchemaOrgLabel("replacer")
	@SchemaOrgComment(""
			+ "A sub property of object. The object that replaces.")
	@CamelizedName("replacer")
	@ConstantizedName("REPLACER")
	public interface Replacer extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/replyToUrl")
	@SchemaOrgLabel("replyToUrl")
	@SchemaOrgComment(""
			+ "The URL at which a reply may be posted to the specified UserComment.")
	@CamelizedName("replyToUrl")
	@ConstantizedName("REPLY_TO_URL")
	public interface ReplyToUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reportNumber")
	@SchemaOrgLabel("reportNumber")
	@SchemaOrgComment(""
			+ "The number or other unique designator assigned to a Report by the publishing"
			+ " organization.")
	@CamelizedName("reportNumber")
	@ConstantizedName("REPORT_NUMBER")
	public interface ReportNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/representativeOfPage")
	@SchemaOrgLabel("representativeOfPage")
	@SchemaOrgComment(""
			+ "Indicates whether this image is representative of the content of the page.")
	@CamelizedName("representativeOfPage")
	@ConstantizedName("REPRESENTATIVE_OF_PAGE")
	public interface RepresentativeOfPage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/requiredCollateral")
	@SchemaOrgLabel("requiredCollateral")
	@SchemaOrgComment(""
			+ "Assets required to secure loan or credit repayments. It may take form of third"
			+ " party pledge, goods, financial instruments (cash, securities, etc.)")
	@CamelizedName("requiredCollateral")
	@ConstantizedName("REQUIRED_COLLATERAL")
	public interface RequiredCollateral extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/requiredGender")
	@SchemaOrgLabel("requiredGender")
	@SchemaOrgComment("Audiences defined by a person's gender.")
	@CamelizedName("requiredGender")
	@ConstantizedName("REQUIRED_GENDER")
	public interface RequiredGender extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/requiredMaxAge")
	@SchemaOrgLabel("requiredMaxAge")
	@SchemaOrgComment(""
			+ "Audiences defined by a person's maximum age.")
	@CamelizedName("requiredMaxAge")
	@ConstantizedName("REQUIRED_MAX_AGE")
	public interface RequiredMaxAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/requiredMinAge")
	@SchemaOrgLabel("requiredMinAge")
	@SchemaOrgComment(""
			+ "Audiences defined by a person's minimum age.")
	@CamelizedName("requiredMinAge")
	@ConstantizedName("REQUIRED_MIN_AGE")
	public interface RequiredMinAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/requiredQuantity")
	@SchemaOrgLabel("requiredQuantity")
	@SchemaOrgComment("The required quantity of the item(s).")
	@CamelizedName("requiredQuantity")
	@ConstantizedName("REQUIRED_QUANTITY")
	public interface RequiredQuantity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

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
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reservationFor")
	@SchemaOrgLabel("reservationFor")
	@SchemaOrgComment(""
			+ "The thing -- flight, event, restaurant,etc. being reserved.")
	@CamelizedName("reservationFor")
	@ConstantizedName("RESERVATION_FOR")
	public interface ReservationFor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reservationId")
	@SchemaOrgLabel("reservationId")
	@SchemaOrgComment(""
			+ "A unique identifier for the reservation.")
	@CamelizedName("reservationId")
	@ConstantizedName("RESERVATION_ID")
	public interface ReservationId extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reservationStatus")
	@SchemaOrgLabel("reservationStatus")
	@SchemaOrgComment("The current status of the reservation.")
	@CamelizedName("reservationStatus")
	@ConstantizedName("RESERVATION_STATUS")
	public interface ReservationStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ReservationStatusType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ReservationStatusType
		 */
		public Clazz.ReservationStatusType getReservationStatusType();
		public void setReservationStatusType(Clazz.ReservationStatusType reservationStatusType);
		public List<Clazz.ReservationStatusType> getReservationStatusTypeList();
		public void setReservationStatusTypeList(List<Clazz.ReservationStatusType> reservationStatusTypeList);
		public boolean hasReservationStatusType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reservedTicket")
	@SchemaOrgLabel("reservedTicket")
	@SchemaOrgComment(""
			+ "A ticket associated with the reservation.")
	@CamelizedName("reservedTicket")
	@ConstantizedName("RESERVED_TICKET")
	public interface ReservedTicket extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Ticket
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Ticket
		 */
		public Clazz.Ticket getTicket();
		public void setTicket(Clazz.Ticket ticket);
		public List<Clazz.Ticket> getTicketList();
		public void setTicketList(List<Clazz.Ticket> ticketList);
		public boolean hasTicket();

		public String getNativeValue();

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/result")
	@SchemaOrgLabel("result")
	@SchemaOrgComment(""
			+ "The result produced in the action. e.g. John wrote <em>a book</em>.")
	@CamelizedName("result")
	@ConstantizedName("RESULT")
	public interface Result extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/resultComment")
	@SchemaOrgLabel("resultComment")
	@SchemaOrgComment(""
			+ "A sub property of result. The Comment created or sent as a result of this"
			+ " action.")
	@CamelizedName("resultComment")
	@ConstantizedName("RESULT_COMMENT")
	public interface ResultComment extends Result, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Comment
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Comment
		 */
		public Clazz.Comment getComment();
		public void setComment(Clazz.Comment comment);
		public List<Clazz.Comment> getCommentList();
		public void setCommentList(List<Clazz.Comment> commentList);
		public boolean hasComment();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/resultReview")
	@SchemaOrgLabel("resultReview")
	@SchemaOrgComment(""
			+ "A sub property of result. The review that resulted in the performing of the"
			+ " action.")
	@CamelizedName("resultReview")
	@ConstantizedName("RESULT_REVIEW")
	public interface ResultReview extends Result, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Review
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Review
		 */
		public Clazz.Review getReview();
		public void setReview(Clazz.Review review);
		public List<Clazz.Review> getReviewList();
		public void setReviewList(List<Clazz.Review> reviewList);
		public boolean hasReview();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/review")
	@SchemaOrgLabel("review")
	@SchemaOrgComment("A review of the item.")
	@CamelizedName("review")
	@ConstantizedName("REVIEW")
	public interface Review extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Review
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Review
		 */
		public Clazz.Review getReview();
		public void setReview(Clazz.Review review);
		public List<Clazz.Review> getReviewList();
		public void setReviewList(List<Clazz.Review> reviewList);
		public boolean hasReview();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reviewBody")
	@SchemaOrgLabel("reviewBody")
	@SchemaOrgComment("The actual body of the review.")
	@CamelizedName("reviewBody")
	@ConstantizedName("REVIEW_BODY")
	public interface ReviewBody extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reviewCount")
	@SchemaOrgLabel("reviewCount")
	@SchemaOrgComment("The count of total number of reviews.")
	@CamelizedName("reviewCount")
	@ConstantizedName("REVIEW_COUNT")
	public interface ReviewCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reviewRating")
	@SchemaOrgLabel("reviewRating")
	@SchemaOrgComment(""
			+ "The rating given in this review. Note that reviews can themselves be rated. The"
			+ " <code>reviewRating</code> applies to rating given by the review. The <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/aggregateRating\">aggregateRating</a> property applies"
			+ " to the review itself, as a creative work.")
	@CamelizedName("reviewRating")
	@ConstantizedName("REVIEW_RATING")
	public interface ReviewRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Rating
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Rating
		 */
		public Clazz.Rating getRating();
		public void setRating(Clazz.Rating rating);
		public List<Clazz.Rating> getRatingList();
		public void setRatingList(List<Clazz.Rating> ratingList);
		public boolean hasRating();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/reviewedBy")
	@SchemaOrgLabel("reviewedBy")
	@SchemaOrgComment(""
			+ "People or organizations that have reviewed the content on this web page for"
			+ " accuracy and/or completeness.")
	@CamelizedName("reviewedBy")
	@ConstantizedName("REVIEWED_BY")
	public interface ReviewedBy extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/roleName")
	@SchemaOrgLabel("roleName")
	@SchemaOrgComment(""
			+ "A role played, performed or filled by a person or organization. For example, the"
			+ " team of creators for a comic book might fill the roles named 'inker',"
			+ " 'penciller', and 'letterer'; or an athlete in a SportsTeam might play in the"
			+ " position named 'Quarterback'.")
	@CamelizedName("roleName")
	@ConstantizedName("ROLE_NAME")
	public interface RoleName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/rsvpResponse")
	@SchemaOrgLabel("rsvpResponse")
	@SchemaOrgComment(""
			+ "The response (yes, no, maybe) to the RSVP.")
	@CamelizedName("rsvpResponse")
	@ConstantizedName("RSVP_RESPONSE")
	public interface RsvpResponse extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/RsvpResponseType
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.RsvpResponseType
		 */
		public Clazz.RsvpResponseType getRsvpResponseType();
		public void setRsvpResponseType(Clazz.RsvpResponseType rsvpResponseType);
		public List<Clazz.RsvpResponseType> getRsvpResponseTypeList();
		public void setRsvpResponseTypeList(List<Clazz.RsvpResponseType> rsvpResponseTypeList);
		public boolean hasRsvpResponseType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/runtimePlatform")
	@SchemaOrgLabel("runtimePlatform")
	@SchemaOrgComment(""
			+ "Runtime platform or script interpreter dependencies (Example - Java v1,"
			+ " Python2.3, .Net Framework 3.0).")
	@CamelizedName("runtimePlatform")
	@ConstantizedName("RUNTIME_PLATFORM")
	public interface RuntimePlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/salaryCurrency")
	@SchemaOrgLabel("salaryCurrency")
	@SchemaOrgComment(""
			+ "The currency (coded using <a href=\"http://en.wikipedia.org/wiki/ISO_4217\">ISO"
			+ " 4217</a> ) used for the main salary information in this job posting or for this"
			+ " employee.")
	@CamelizedName("salaryCurrency")
	@ConstantizedName("SALARY_CURRENCY")
	public interface SalaryCurrency extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sameAs")
	@SchemaOrgLabel("sameAs")
	@SchemaOrgComment(""
			+ "URL of a reference Web page that unambiguously indicates the item's identity."
			+ " E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.")
	@CamelizedName("sameAs")
	@ConstantizedName("SAME_AS")
	public interface SameAs extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/saturatedFatContent")
	@SchemaOrgLabel("saturatedFatContent")
	@SchemaOrgComment("The number of grams of saturated fat.")
	@CamelizedName("saturatedFatContent")
	@ConstantizedName("SATURATED_FAT_CONTENT")
	public interface SaturatedFatContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/scheduledPaymentDate")
	@SchemaOrgLabel("scheduledPaymentDate")
	@SchemaOrgComment(""
			+ "The date the invoice is scheduled to be paid.")
	@CamelizedName("scheduledPaymentDate")
	@ConstantizedName("SCHEDULED_PAYMENT_DATE")
	public interface ScheduledPaymentDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/scheduledTime")
	@SchemaOrgLabel("scheduledTime")
	@SchemaOrgComment("The time the object is scheduled to.")
	@CamelizedName("scheduledTime")
	@ConstantizedName("SCHEDULED_TIME")
	public interface ScheduledTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/schemaVersion")
	@SchemaOrgLabel("schemaVersion")
	@SchemaOrgComment(""
			+ "Indicates (by URL or string) a particular version of a schema used in some"
			+ " CreativeWork. For example, a document could declare a schemaVersion using an"
			+ " URL such as http://schema.org/version/2.0/ if precise indication of schema"
			+ " version was required by some application.")
	@CamelizedName("schemaVersion")
	@ConstantizedName("SCHEMA_VERSION")
	public interface SchemaVersion extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/screenCount")
	@SchemaOrgLabel("screenCount")
	@SchemaOrgComment(""
			+ "The number of screens in the movie theater.")
	@CamelizedName("screenCount")
	@ConstantizedName("SCREEN_COUNT")
	public interface ScreenCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/screenshot")
	@SchemaOrgLabel("screenshot")
	@SchemaOrgComment(""
			+ "A link to a screenshot image of the app.")
	@CamelizedName("screenshot")
	@ConstantizedName("SCREENSHOT")
	public interface Screenshot extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seasonNumber")
	@SchemaOrgLabel("seasonNumber")
	@SchemaOrgComment(""
			+ "Position of the season within an ordered group of seasons.")
	@CamelizedName("seasonNumber")
	@ConstantizedName("SEASON_NUMBER")
	public interface SeasonNumber extends Position, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seatNumber")
	@SchemaOrgLabel("seatNumber")
	@SchemaOrgComment(""
			+ "The location of the reserved seat (e.g., 27).")
	@CamelizedName("seatNumber")
	@ConstantizedName("SEAT_NUMBER")
	public interface SeatNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seatRow")
	@SchemaOrgLabel("seatRow")
	@SchemaOrgComment(""
			+ "The row location of the reserved seat (e.g., B).")
	@CamelizedName("seatRow")
	@ConstantizedName("SEAT_ROW")
	public interface SeatRow extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seatSection")
	@SchemaOrgLabel("seatSection")
	@SchemaOrgComment(""
			+ "The section location of the reserved seat (e.g. Orchestra).")
	@CamelizedName("seatSection")
	@ConstantizedName("SEAT_SECTION")
	public interface SeatSection extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seatingType")
	@SchemaOrgLabel("seatingType")
	@SchemaOrgComment("The type/class of the seat.")
	@CamelizedName("seatingType")
	@ConstantizedName("SEATING_TYPE")
	public interface SeatingType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/securityScreening")
	@SchemaOrgLabel("securityScreening")
	@SchemaOrgComment(""
			+ "The type of security screening the passenger is subject to.")
	@CamelizedName("securityScreening")
	@ConstantizedName("SECURITY_SCREENING")
	public interface SecurityScreening extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seeks")
	@SchemaOrgLabel("seeks")
	@SchemaOrgComment(""
			+ "A pointer to products or services sought by the organization or person (demand).")
	@CamelizedName("seeks")
	@ConstantizedName("SEEKS")
	public interface Seeks extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Demand
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Demand
		 */
		public Clazz.Demand getDemand();
		public void setDemand(Clazz.Demand demand);
		public List<Clazz.Demand> getDemandList();
		public void setDemandList(List<Clazz.Demand> demandList);
		public boolean hasDemand();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seller")
	@SchemaOrgLabel("seller")
	@SchemaOrgComment(""
			+ "An entity which offers (sells / leases / lends / loans) the services / goods.  A"
			+ " seller may also be a provider.")
	@CamelizedName("seller")
	@ConstantizedName("SELLER")
	public interface Seller extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sender")
	@SchemaOrgLabel("sender")
	@SchemaOrgComment(""
			+ "A sub property of participant. The participant who is at the sending end of the"
			+ " action.")
	@CamelizedName("sender")
	@ConstantizedName("SENDER")
	public interface Sender extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serialNumber")
	@SchemaOrgLabel("serialNumber")
	@SchemaOrgComment(""
			+ "The serial number or any alphanumeric identifier of a particular product. When"
			+ " attached to an offer, it is a shortcut for the serial number of the product"
			+ " included in the offer.")
	@CamelizedName("serialNumber")
	@ConstantizedName("SERIAL_NUMBER")
	public interface SerialNumber extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serverStatus")
	@SchemaOrgLabel("serverStatus")
	@SchemaOrgComment("Status of a game server.")
	@CamelizedName("serverStatus")
	@ConstantizedName("SERVER_STATUS")
	public interface ServerStatus extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/GameServerStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.GameServerStatus
		 */
		public Clazz.GameServerStatus getGameServerStatus();
		public void setGameServerStatus(Clazz.GameServerStatus gameServerStatus);
		public List<Clazz.GameServerStatus> getGameServerStatusList();
		public void setGameServerStatusList(List<Clazz.GameServerStatus> gameServerStatusList);
		public boolean hasGameServerStatus();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/servesCuisine")
	@SchemaOrgLabel("servesCuisine")
	@SchemaOrgComment("The cuisine of the restaurant.")
	@CamelizedName("servesCuisine")
	@ConstantizedName("SERVES_CUISINE")
	public interface ServesCuisine extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceLocation")
	@SchemaOrgLabel("serviceLocation")
	@SchemaOrgComment(""
			+ "The location (e.g. civic structure, local business, etc.) where a person can go"
			+ " to access the service.")
	@CamelizedName("serviceLocation")
	@ConstantizedName("SERVICE_LOCATION")
	public interface ServiceLocation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceOperator")
	@SchemaOrgLabel("serviceOperator")
	@SchemaOrgComment(""
			+ "The operating organization, if different from the provider.  This enables the"
			+ " representation of services that are provided by an organization, but operated"
			+ " by another organization like a subcontractor.")
	@CamelizedName("serviceOperator")
	@ConstantizedName("SERVICE_OPERATOR")
	public interface ServiceOperator extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceOutput")
	@SchemaOrgLabel("serviceOutput")
	@SchemaOrgComment(""
			+ "The tangible thing generated by the service, e.g. a passport, permit, etc.")
	@CamelizedName("serviceOutput")
	@ConstantizedName("SERVICE_OUTPUT")
	public interface ServiceOutput extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/servicePhone")
	@SchemaOrgLabel("servicePhone")
	@SchemaOrgComment(""
			+ "The phone number to use to access the service.")
	@CamelizedName("servicePhone")
	@ConstantizedName("SERVICE_PHONE")
	public interface ServicePhone extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/servicePostalAddress")
	@SchemaOrgLabel("servicePostalAddress")
	@SchemaOrgComment(""
			+ "The address for accessing the service by mail.")
	@CamelizedName("servicePostalAddress")
	@ConstantizedName("SERVICE_POSTAL_ADDRESS")
	public interface ServicePostalAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/PostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PostalAddress
		 */
		public Clazz.PostalAddress getPostalAddress();
		public void setPostalAddress(Clazz.PostalAddress postalAddress);
		public List<Clazz.PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<Clazz.PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceSmsNumber")
	@SchemaOrgLabel("serviceSmsNumber")
	@SchemaOrgComment(""
			+ "The number to access the service by text message.")
	@CamelizedName("serviceSmsNumber")
	@ConstantizedName("SERVICE_SMS_NUMBER")
	public interface ServiceSmsNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceType")
	@SchemaOrgLabel("serviceType")
	@SchemaOrgComment(""
			+ "The type of service being offered, e.g. veterans' benefits, emergency relief,"
			+ " etc.")
	@CamelizedName("serviceType")
	@ConstantizedName("SERVICE_TYPE")
	public interface ServiceType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/serviceUrl")
	@SchemaOrgLabel("serviceUrl")
	@SchemaOrgComment("The website to access the service.")
	@CamelizedName("serviceUrl")
	@ConstantizedName("SERVICE_URL")
	public interface ServiceUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/servingSize")
	@SchemaOrgLabel("servingSize")
	@SchemaOrgComment(""
			+ "The serving size, in terms of the number of volume or mass.")
	@CamelizedName("servingSize")
	@ConstantizedName("SERVING_SIZE")
	public interface ServingSize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sharedContent")
	@SchemaOrgLabel("sharedContent")
	@SchemaOrgComment(""
			+ "A CreativeWork such as an image, video, or audio clip shared as part of this"
			+ " posting.")
	@CamelizedName("sharedContent")
	@ConstantizedName("SHARED_CONTENT")
	public interface SharedContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sibling")
	@SchemaOrgLabel("sibling")
	@SchemaOrgComment("A sibling of the person.")
	@CamelizedName("sibling")
	@ConstantizedName("SIBLING")
	public interface Sibling extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/significantLink")
	@SchemaOrgLabel("significantLink")
	@SchemaOrgComment(""
			+ "One of the more significant URLs on the page. Typically, these are the"
			+ " non-navigation links that are clicked on the most.")
	@CamelizedName("significantLink")
	@ConstantizedName("SIGNIFICANT_LINK")
	public interface SignificantLink extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

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
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sku")
	@SchemaOrgLabel("sku")
	@SchemaOrgComment(""
			+ "The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product"
			+ " or service, or the product to which the offer refers.")
	@CamelizedName("sku")
	@ConstantizedName("SKU")
	public interface Sku extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/smokingAllowed")
	@SchemaOrgLabel("smokingAllowed")
	@SchemaOrgComment(""
			+ "Indicates whether it is allowed to smoke in the place, e.g. in the restaurant,"
			+ " hotel or hotel room.")
	@CamelizedName("smokingAllowed")
	@ConstantizedName("SMOKING_ALLOWED")
	public interface SmokingAllowed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sodiumContent")
	@SchemaOrgLabel("sodiumContent")
	@SchemaOrgComment("The number of milligrams of sodium.")
	@CamelizedName("sodiumContent")
	@ConstantizedName("SODIUM_CONTENT")
	public interface SodiumContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/softwareAddOn")
	@SchemaOrgLabel("softwareAddOn")
	@SchemaOrgComment(""
			+ "Additional content for a software application.")
	@CamelizedName("softwareAddOn")
	@ConstantizedName("SOFTWARE_ADD_ON")
	public interface SoftwareAddOn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SoftwareApplication
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareApplication
		 */
		public Clazz.SoftwareApplication getSoftwareApplication();
		public void setSoftwareApplication(Clazz.SoftwareApplication softwareApplication);
		public List<Clazz.SoftwareApplication> getSoftwareApplicationList();
		public void setSoftwareApplicationList(List<Clazz.SoftwareApplication> softwareApplicationList);
		public boolean hasSoftwareApplication();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/softwareHelp")
	@SchemaOrgLabel("softwareHelp")
	@SchemaOrgComment("Software application help.")
	@CamelizedName("softwareHelp")
	@ConstantizedName("SOFTWARE_HELP")
	public interface SoftwareHelp extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/softwareRequirements")
	@SchemaOrgLabel("softwareRequirements")
	@SchemaOrgComment(""
			+ "Component dependency requirements for application. This includes runtime"
			+ " environments and shared libraries that are not included in the application"
			+ " distribution package, but required to run the application (Examples: DirectX,"
			+ " Java or .NET runtime).")
	@CamelizedName("softwareRequirements")
	@ConstantizedName("SOFTWARE_REQUIREMENTS")
	public interface SoftwareRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/softwareVersion")
	@SchemaOrgLabel("softwareVersion")
	@SchemaOrgComment("Version of the software instance.")
	@CamelizedName("softwareVersion")
	@ConstantizedName("SOFTWARE_VERSION")
	public interface SoftwareVersion extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sourceOrganization")
	@SchemaOrgLabel("sourceOrganization")
	@SchemaOrgComment(""
			+ "The Organization on whose behalf the creator was working.")
	@CamelizedName("sourceOrganization")
	@ConstantizedName("SOURCE_ORGANIZATION")
	public interface SourceOrganization extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/spatialCoverage")
	@SchemaOrgLabel("spatialCoverage")
	@SchemaOrgComment(""
			+ "The spatialCoverage of a CreativeWork indicates the place(s) which are the focus"
			+ " of the content. It is a subproperty of\n      contentLocation intended"
			+ " primarily for more technical and detailed materials. For example with a"
			+ " Dataset, it indicates\n      areas that the dataset describes: a dataset of New"
			+ " York weather would have spatialCoverage which was the place: the state of New"
			+ " York.")
	@CamelizedName("spatialCoverage")
	@ConstantizedName("SPATIAL_COVERAGE")
	public interface SpatialCoverage extends ContentLocation, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/specialCommitments")
	@SchemaOrgLabel("specialCommitments")
	@SchemaOrgComment(""
			+ "Any special commitments associated with this job posting. Valid entries include"
			+ " VeteranCommit, MilitarySpouseCommit, etc.")
	@CamelizedName("specialCommitments")
	@ConstantizedName("SPECIAL_COMMITMENTS")
	public interface SpecialCommitments extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/specialOpeningHoursSpecification")
	@SchemaOrgLabel("specialOpeningHoursSpecification")
	@SchemaOrgComment(""
			+ "The special opening hours of a certain place.</p>\n\n<p>Use this to explicitly"
			+ " override general opening hours brought in scope by <a class=\"localLink\""
			+ " href=\"http://schema.org/openingHoursSpecification\">openingHoursSpecification</a>"
			+ " or <a class=\"localLink\""
			+ " href=\"http://schema.org/openingHours\">openingHours</a>.")
	@CamelizedName("specialOpeningHoursSpecification")
	@ConstantizedName("SPECIAL_OPENING_HOURS_SPECIFICATION")
	public interface SpecialOpeningHoursSpecification extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/OpeningHoursSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.OpeningHoursSpecification
		 */
		public Clazz.OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(Clazz.OpeningHoursSpecification openingHoursSpecification);
		public List<Clazz.OpeningHoursSpecification> getOpeningHoursSpecificationList();
		public void setOpeningHoursSpecificationList(List<Clazz.OpeningHoursSpecification> openingHoursSpecificationList);
		public boolean hasOpeningHoursSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/specialty")
	@SchemaOrgLabel("specialty")
	@SchemaOrgComment(""
			+ "One of the domain specialities to which this web page's content applies.")
	@CamelizedName("specialty")
	@ConstantizedName("SPECIALTY")
	public interface Specialty extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Specialty
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Specialty
		 */
		public Clazz.Specialty getSpecialty();
		public void setSpecialty(Clazz.Specialty specialty);
		public List<Clazz.Specialty> getSpecialtyList();
		public void setSpecialtyList(List<Clazz.Specialty> specialtyList);
		public boolean hasSpecialty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sponsor")
	@SchemaOrgLabel("sponsor")
	@SchemaOrgComment(""
			+ "A person or organization that supports a thing through a pledge, promise, or"
			+ " financial contribution. e.g. a sponsor of a Medical Study or a corporate"
			+ " sponsor of an event.")
	@CamelizedName("sponsor")
	@ConstantizedName("SPONSOR")
	public interface Sponsor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sport")
	@SchemaOrgLabel("sport")
	@SchemaOrgComment("A type of sport (e.g. Baseball).")
	@CamelizedName("sport")
	@ConstantizedName("SPORT")
	public interface Sport extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sportsActivityLocation")
	@SchemaOrgLabel("sportsActivityLocation")
	@SchemaOrgComment(""
			+ "A sub property of location. The sports activity location where this action"
			+ " occurred.")
	@CamelizedName("sportsActivityLocation")
	@ConstantizedName("SPORTS_ACTIVITY_LOCATION")
	public interface SportsActivityLocation extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SportsActivityLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsActivityLocation
		 */
		public Clazz.SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(Clazz.SportsActivityLocation sportsActivityLocation);
		public List<Clazz.SportsActivityLocation> getSportsActivityLocationList();
		public void setSportsActivityLocationList(List<Clazz.SportsActivityLocation> sportsActivityLocationList);
		public boolean hasSportsActivityLocation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sportsEvent")
	@SchemaOrgLabel("sportsEvent")
	@SchemaOrgComment(""
			+ "A sub property of location. The sports event where this action occurred.")
	@CamelizedName("sportsEvent")
	@ConstantizedName("SPORTS_EVENT")
	public interface SportsEvent extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SportsEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsEvent
		 */
		public Clazz.SportsEvent getSportsEvent();
		public void setSportsEvent(Clazz.SportsEvent sportsEvent);
		public List<Clazz.SportsEvent> getSportsEventList();
		public void setSportsEventList(List<Clazz.SportsEvent> sportsEventList);
		public boolean hasSportsEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sportsTeam")
	@SchemaOrgLabel("sportsTeam")
	@SchemaOrgComment(""
			+ "A sub property of participant. The sports team that participated on this action.")
	@CamelizedName("sportsTeam")
	@ConstantizedName("SPORTS_TEAM")
	public interface SportsTeam extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SportsTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SportsTeam
		 */
		public Clazz.SportsTeam getSportsTeam();
		public void setSportsTeam(Clazz.SportsTeam sportsTeam);
		public List<Clazz.SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<Clazz.SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/spouse")
	@SchemaOrgLabel("spouse")
	@SchemaOrgComment("The person's spouse.")
	@CamelizedName("spouse")
	@ConstantizedName("SPOUSE")
	public interface Spouse extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/starRating")
	@SchemaOrgLabel("starRating")
	@SchemaOrgComment(""
			+ "An official rating for a lodging business or food establishment, e.g. from"
			+ " national associations or standards bodies. Use the author property to indicate"
			+ " the rating organization, e.g. as an Organization with name such as (e.g."
			+ " HOTREC, DEHOGA, WHR, or Hotelstars).")
	@CamelizedName("starRating")
	@ConstantizedName("STAR_RATING")
	public interface StarRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Rating
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Rating
		 */
		public Clazz.Rating getRating();
		public void setRating(Clazz.Rating rating);
		public List<Clazz.Rating> getRatingList();
		public void setRatingList(List<Clazz.Rating> ratingList);
		public boolean hasRating();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/startDate")
	@SchemaOrgLabel("startDate")
	@SchemaOrgComment(""
			+ "The start date and time of the item (in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 date format</a>).")
	@CamelizedName("startDate")
	@ConstantizedName("START_DATE")
	public interface StartDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/startTime")
	@SchemaOrgLabel("startTime")
	@SchemaOrgComment(""
			+ "The startTime of something. For a reserved event or service (e.g."
			+ " FoodEstablishmentReservation), the time that it is expected to start. For"
			+ " actions that span a period of time, when the action was performed. e.g. John"
			+ " wrote a book from <em>January</em> to December.</p>\n\n<p>Note that Event uses"
			+ " startDate/endDate instead of startTime/endTime, even when describing dates with"
			+ " times. This situation may be clarified in future revisions.")
	@CamelizedName("startTime")
	@ConstantizedName("START_TIME")
	public interface StartTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/steeringPosition")
	@SchemaOrgLabel("steeringPosition")
	@SchemaOrgComment(""
			+ "The position of the steering wheel or similar device (mostly for cars).")
	@CamelizedName("steeringPosition")
	@ConstantizedName("STEERING_POSITION")
	public interface SteeringPosition extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SteeringPositionValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SteeringPositionValue
		 */
		public Clazz.SteeringPositionValue getSteeringPositionValue();
		public void setSteeringPositionValue(Clazz.SteeringPositionValue steeringPositionValue);
		public List<Clazz.SteeringPositionValue> getSteeringPositionValueList();
		public void setSteeringPositionValueList(List<Clazz.SteeringPositionValue> steeringPositionValueList);
		public boolean hasSteeringPositionValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/stepValue")
	@SchemaOrgLabel("stepValue")
	@SchemaOrgComment(""
			+ "The stepValue attribute indicates the granularity that is expected (and"
			+ " required) of the value in a PropertyValueSpecification.")
	@CamelizedName("stepValue")
	@ConstantizedName("STEP_VALUE")
	public interface StepValue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/steps")
	@SchemaOrgLabel("steps")
	@SchemaOrgComment(""
			+ "The steps in the form of a single item (text, document, video, etc.) or an"
			+ " ordered list with HowToStep and/or HowToSection items.")
	@CamelizedName("steps")
	@ConstantizedName("STEPS")
	public interface Steps extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * uri: http://schema.org/ItemList
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ItemList
		 */
		public Clazz.ItemList getItemList();
		public void setItemList(Clazz.ItemList itemList);
		public List<Clazz.ItemList> getItemListList();
		public void setItemListList(List<Clazz.ItemList> itemListList);
		public boolean hasItemList();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/storageRequirements")
	@SchemaOrgLabel("storageRequirements")
	@SchemaOrgComment(""
			+ "Storage requirements (free space required).")
	@CamelizedName("storageRequirements")
	@ConstantizedName("STORAGE_REQUIREMENTS")
	public interface StorageRequirements extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/streetAddress")
	@SchemaOrgLabel("streetAddress")
	@SchemaOrgComment(""
			+ "The street address. For example, 1600 Amphitheatre Pkwy.")
	@CamelizedName("streetAddress")
	@ConstantizedName("STREET_ADDRESS")
	public interface StreetAddress extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subEvent")
	@SchemaOrgLabel("subEvent")
	@SchemaOrgComment(""
			+ "An Event that is part of this event. For example, a conference event includes"
			+ " many presentations, each of which is a subEvent of the conference.")
	@CamelizedName("subEvent")
	@ConstantizedName("SUB_EVENT")
	public interface SubEvent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subOrganization")
	@SchemaOrgLabel("subOrganization")
	@SchemaOrgComment(""
			+ "A relationship between two organizations where the first includes the second,"
			+ " e.g., as a subsidiary. See also: the more specific 'department' property.")
	@CamelizedName("subOrganization")
	@ConstantizedName("SUB_ORGANIZATION")
	public interface SubOrganization extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subReservation")
	@SchemaOrgLabel("subReservation")
	@SchemaOrgComment(""
			+ "The individual reservations included in the package. Typically a repeated"
			+ " property.")
	@CamelizedName("subReservation")
	@ConstantizedName("SUB_RESERVATION")
	public interface SubReservation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Reservation
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Reservation
		 */
		public Clazz.Reservation getReservation();
		public void setReservation(Clazz.Reservation reservation);
		public List<Clazz.Reservation> getReservationList();
		public void setReservationList(List<Clazz.Reservation> reservationList);
		public boolean hasReservation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subtitleLanguage")
	@SchemaOrgLabel("subtitleLanguage")
	@SchemaOrgComment(""
			+ "Languages in which subtitles/captions are available, in <a"
			+ " href=\"http://tools.ietf.org/html/bcp47\">IETF BCP 47 standard format</a>.")
	@CamelizedName("subtitleLanguage")
	@ConstantizedName("SUBTITLE_LANGUAGE")
	public interface SubtitleLanguage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Language
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Language
		 */
		public Clazz.Language getLanguage();
		public void setLanguage(Clazz.Language language);
		public List<Clazz.Language> getLanguageList();
		public void setLanguageList(List<Clazz.Language> languageList);
		public boolean hasLanguage();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/successorOf")
	@SchemaOrgLabel("successorOf")
	@SchemaOrgComment(""
			+ "A pointer from a newer variant of a product  to its previous, often discontinued"
			+ " predecessor.")
	@CamelizedName("successorOf")
	@ConstantizedName("SUCCESSOR_OF")
	public interface SuccessorOf extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ProductModel
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ProductModel
		 */
		public Clazz.ProductModel getProductModel();
		public void setProductModel(Clazz.ProductModel productModel);
		public List<Clazz.ProductModel> getProductModelList();
		public void setProductModelList(List<Clazz.ProductModel> productModelList);
		public boolean hasProductModel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sugarContent")
	@SchemaOrgLabel("sugarContent")
	@SchemaOrgComment("The number of grams of sugar.")
	@CamelizedName("sugarContent")
	@ConstantizedName("SUGAR_CONTENT")
	public interface SugarContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/suggestedAnswer")
	@SchemaOrgLabel("suggestedAnswer")
	@SchemaOrgComment(""
			+ "An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a"
			+ " Question/Answer site.")
	@CamelizedName("suggestedAnswer")
	@ConstantizedName("SUGGESTED_ANSWER")
	public interface SuggestedAnswer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Answer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Answer
		 */
		public Clazz.Answer getAnswer();
		public void setAnswer(Clazz.Answer answer);
		public List<Clazz.Answer> getAnswerList();
		public void setAnswerList(List<Clazz.Answer> answerList);
		public boolean hasAnswer();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/suggestedGender")
	@SchemaOrgLabel("suggestedGender")
	@SchemaOrgComment("The gender of the person or audience.")
	@CamelizedName("suggestedGender")
	@ConstantizedName("SUGGESTED_GENDER")
	public interface SuggestedGender extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/suggestedMaxAge")
	@SchemaOrgLabel("suggestedMaxAge")
	@SchemaOrgComment(""
			+ "Maximal age recommended for viewing content.")
	@CamelizedName("suggestedMaxAge")
	@ConstantizedName("SUGGESTED_MAX_AGE")
	public interface SuggestedMaxAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/suggestedMinAge")
	@SchemaOrgLabel("suggestedMinAge")
	@SchemaOrgComment(""
			+ "Minimal age recommended for viewing content.")
	@CamelizedName("suggestedMinAge")
	@ConstantizedName("SUGGESTED_MIN_AGE")
	public interface SuggestedMinAge extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/suitableForDiet")
	@SchemaOrgLabel("suitableForDiet")
	@SchemaOrgComment(""
			+ "Indicates a dietary restriction or guideline for which this recipe or menu item"
			+ " is suitable, e.g. diabetic, halal etc.")
	@CamelizedName("suitableForDiet")
	@ConstantizedName("SUITABLE_FOR_DIET")
	public interface SuitableForDiet extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/RestrictedDiet
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.RestrictedDiet
		 */
		public Clazz.RestrictedDiet getRestrictedDiet();
		public void setRestrictedDiet(Clazz.RestrictedDiet restrictedDiet);
		public List<Clazz.RestrictedDiet> getRestrictedDietList();
		public void setRestrictedDietList(List<Clazz.RestrictedDiet> restrictedDietList);
		public boolean hasRestrictedDiet();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/superEvent")
	@SchemaOrgLabel("superEvent")
	@SchemaOrgComment(""
			+ "An event that this event is a part of. For example, a collection of individual"
			+ " music performances might each have a music festival as their superEvent.")
	@CamelizedName("superEvent")
	@ConstantizedName("SUPER_EVENT")
	public interface SuperEvent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Event
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Event
		 */
		public Clazz.Event getEvent();
		public void setEvent(Clazz.Event event);
		public List<Clazz.Event> getEventList();
		public void setEventList(List<Clazz.Event> eventList);
		public boolean hasEvent();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/supply")
	@SchemaOrgLabel("supply")
	@SchemaOrgComment(""
			+ "A sub-property of instrument. A supply consumed when performing instructions or"
			+ " a direction.")
	@CamelizedName("supply")
	@ConstantizedName("SUPPLY")
	public interface Supply extends Instrument, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/HowToSupply
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.HowToSupply
		 */
		public Clazz.HowToSupply getHowToSupply();
		public void setHowToSupply(Clazz.HowToSupply howToSupply);
		public List<Clazz.HowToSupply> getHowToSupplyList();
		public void setHowToSupplyList(List<Clazz.HowToSupply> howToSupplyList);
		public boolean hasHowToSupply();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/supportingData")
	@SchemaOrgLabel("supportingData")
	@SchemaOrgComment(""
			+ "Supporting data for a SoftwareApplication.")
	@CamelizedName("supportingData")
	@ConstantizedName("SUPPORTING_DATA")
	public interface SupportingData extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DataFeed
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.DataFeed
		 */
		public Clazz.DataFeed getDataFeed();
		public void setDataFeed(Clazz.DataFeed dataFeed);
		public List<Clazz.DataFeed> getDataFeedList();
		public void setDataFeedList(List<Clazz.DataFeed> dataFeedList);
		public boolean hasDataFeed();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/target")
	@SchemaOrgLabel("target")
	@SchemaOrgComment(""
			+ "Indicates a target EntryPoint for an Action.")
	@CamelizedName("target")
	@ConstantizedName("TARGET")
	public interface Target extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/EntryPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.EntryPoint
		 */
		public Clazz.EntryPoint getEntryPoint();
		public void setEntryPoint(Clazz.EntryPoint entryPoint);
		public List<Clazz.EntryPoint> getEntryPointList();
		public void setEntryPointList(List<Clazz.EntryPoint> entryPointList);
		public boolean hasEntryPoint();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetCollection")
	@SchemaOrgLabel("targetCollection")
	@SchemaOrgComment(""
			+ "A sub property of object. The collection target of the action.")
	@CamelizedName("targetCollection")
	@ConstantizedName("TARGET_COLLECTION")
	public interface TargetCollection extends Object, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Thing
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Thing
		 */
		public Clazz.Thing getThing();
		public void setThing(Clazz.Thing thing);
		public List<Clazz.Thing> getThingList();
		public void setThingList(List<Clazz.Thing> thingList);
		public boolean hasThing();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetDescription")
	@SchemaOrgLabel("targetDescription")
	@SchemaOrgComment(""
			+ "The description of a node in an established educational framework.")
	@CamelizedName("targetDescription")
	@ConstantizedName("TARGET_DESCRIPTION")
	public interface TargetDescription extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetName")
	@SchemaOrgLabel("targetName")
	@SchemaOrgComment(""
			+ "The name of a node in an established educational framework.")
	@CamelizedName("targetName")
	@ConstantizedName("TARGET_NAME")
	public interface TargetName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetPlatform")
	@SchemaOrgLabel("targetPlatform")
	@SchemaOrgComment(""
			+ "Type of app development: phone, Metro style, desktop, XBox, etc.")
	@CamelizedName("targetPlatform")
	@ConstantizedName("TARGET_PLATFORM")
	public interface TargetPlatform extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetProduct")
	@SchemaOrgLabel("targetProduct")
	@SchemaOrgComment(""
			+ "Target Operating System / Product to which the code applies.  If applies to"
			+ " several versions, just the product name can be used.")
	@CamelizedName("targetProduct")
	@ConstantizedName("TARGET_PRODUCT")
	public interface TargetProduct extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/SoftwareApplication
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.SoftwareApplication
		 */
		public Clazz.SoftwareApplication getSoftwareApplication();
		public void setSoftwareApplication(Clazz.SoftwareApplication softwareApplication);
		public List<Clazz.SoftwareApplication> getSoftwareApplicationList();
		public void setSoftwareApplicationList(List<Clazz.SoftwareApplication> softwareApplicationList);
		public boolean hasSoftwareApplication();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetUrl")
	@SchemaOrgLabel("targetUrl")
	@SchemaOrgComment(""
			+ "The URL of a node in an established educational framework.")
	@CamelizedName("targetUrl")
	@ConstantizedName("TARGET_URL")
	public interface TargetUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/taxID")
	@SchemaOrgLabel("taxID")
	@SchemaOrgComment(""
			+ "The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the"
			+ " CIF/NIF in Spain.")
	@CamelizedName("taxID")
	@ConstantizedName("TAX_ID")
	public interface TaxID extends Identifier, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/telephone")
	@SchemaOrgLabel("telephone")
	@SchemaOrgComment("The telephone number.")
	@CamelizedName("telephone")
	@ConstantizedName("TELEPHONE")
	public interface Telephone extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/temporalCoverage")
	@SchemaOrgLabel("temporalCoverage")
	@SchemaOrgComment(""
			+ "The temporalCoverage of a CreativeWork indicates the period that the content"
			+ " applies to, i.e. that it describes, either as a DateTime or as a textual string"
			+ " indicating a time period in <a"
			+ " href=\"https://en.wikipedia.org/wiki/ISO_8601#Time_intervals\">ISO 8601 time"
			+ " interval format</a>. In\n      the case of a Dataset it will typically indicate"
			+ " the relevant time period in a precise notation (e.g. for a 2011 census dataset,"
			+ " the year 2011 would be written \"2011/2012\"). Other forms of content e.g."
			+ " ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their"
			+ " temporalCoverage in broader terms - textually or via well-known URL.\n     "
			+ " Written works such as books may sometimes have precise temporal coverage too,"
			+ " e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format"
			+ " format via \"1939/1945\".")
	@CamelizedName("temporalCoverage")
	@ConstantizedName("TEMPORAL_COVERAGE")
	public interface TemporalCoverage extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/text")
	@SchemaOrgLabel("text")
	@SchemaOrgComment(""
			+ "The textual content of this CreativeWork.")
	@CamelizedName("text")
	@ConstantizedName("TEXT")
	public interface Text extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/thumbnail")
	@SchemaOrgLabel("thumbnail")
	@SchemaOrgComment("Thumbnail image for an image or video.")
	@CamelizedName("thumbnail")
	@ConstantizedName("THUMBNAIL")
	public interface Thumbnail extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ImageObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject
		 */
		public Clazz.ImageObject getImageObject();
		public void setImageObject(Clazz.ImageObject imageObject);
		public List<Clazz.ImageObject> getImageObjectList();
		public void setImageObjectList(List<Clazz.ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/thumbnailUrl")
	@SchemaOrgLabel("thumbnailUrl")
	@SchemaOrgComment(""
			+ "A thumbnail image relevant to the Thing.")
	@CamelizedName("thumbnailUrl")
	@ConstantizedName("THUMBNAIL_URL")
	public interface ThumbnailUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tickerSymbol")
	@SchemaOrgLabel("tickerSymbol")
	@SchemaOrgComment(""
			+ "The exchange traded instrument associated with a Corporation object. The"
			+ " tickerSymbol is expressed as an exchange and an instrument name separated by a"
			+ " space character. For the exchange component of the tickerSymbol attribute, we"
			+ " reccommend using the controlled vocaulary of Market Identifier Codes (MIC)"
			+ " specified in ISO15022.")
	@CamelizedName("tickerSymbol")
	@ConstantizedName("TICKER_SYMBOL")
	public interface TickerSymbol extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ticketNumber")
	@SchemaOrgLabel("ticketNumber")
	@SchemaOrgComment("The unique identifier for the ticket.")
	@CamelizedName("ticketNumber")
	@ConstantizedName("TICKET_NUMBER")
	public interface TicketNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ticketToken")
	@SchemaOrgLabel("ticketToken")
	@SchemaOrgComment(""
			+ "Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.")
	@CamelizedName("ticketToken")
	@ConstantizedName("TICKET_TOKEN")
	public interface TicketToken extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ticketedSeat")
	@SchemaOrgLabel("ticketedSeat")
	@SchemaOrgComment("The seat associated with the ticket.")
	@CamelizedName("ticketedSeat")
	@ConstantizedName("TICKETED_SEAT")
	public interface TicketedSeat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Seat
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Seat
		 */
		public Clazz.Seat getSeat();
		public void setSeat(Clazz.Seat seat);
		public List<Clazz.Seat> getSeatList();
		public void setSeatList(List<Clazz.Seat> seatList);
		public boolean hasSeat();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/timeRequired")
	@SchemaOrgLabel("timeRequired")
	@SchemaOrgComment(""
			+ "Approximate or typical time it takes to work with or through this learning"
			+ " resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.")
	@CamelizedName("timeRequired")
	@ConstantizedName("TIME_REQUIRED")
	public interface TimeRequired extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/title")
	@SchemaOrgLabel("title")
	@SchemaOrgComment("The title of the job.")
	@CamelizedName("title")
	@ConstantizedName("TITLE")
	public interface Title extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/toLocation")
	@SchemaOrgLabel("toLocation")
	@SchemaOrgComment(""
			+ "A sub property of location. The final location of the object or the agent after"
			+ " the action.")
	@CamelizedName("toLocation")
	@ConstantizedName("TO_LOCATION")
	public interface ToLocation extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/toRecipient")
	@SchemaOrgLabel("toRecipient")
	@SchemaOrgComment(""
			+ "A sub property of recipient. The recipient who was directly sent the message.")
	@CamelizedName("toRecipient")
	@ConstantizedName("TO_RECIPIENT")
	public interface ToRecipient extends Recipient, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tool")
	@SchemaOrgLabel("tool")
	@SchemaOrgComment(""
			+ "A sub property of instrument. An object used (but not consumed) when performing"
			+ " instructions or a direction.")
	@CamelizedName("tool")
	@ConstantizedName("TOOL")
	public interface Tool extends Instrument, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/HowToTool
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.HowToTool
		 */
		public Clazz.HowToTool getHowToTool();
		public void setHowToTool(Clazz.HowToTool howToTool);
		public List<Clazz.HowToTool> getHowToToolList();
		public void setHowToToolList(List<Clazz.HowToTool> howToToolList);
		public boolean hasHowToTool();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/totalPaymentDue")
	@SchemaOrgLabel("totalPaymentDue")
	@SchemaOrgComment("The total amount due.")
	@CamelizedName("totalPaymentDue")
	@ConstantizedName("TOTAL_PAYMENT_DUE")
	public interface TotalPaymentDue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MonetaryAmount
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MonetaryAmount
		 */
		public Clazz.MonetaryAmount getMonetaryAmount();
		public void setMonetaryAmount(Clazz.MonetaryAmount monetaryAmount);
		public List<Clazz.MonetaryAmount> getMonetaryAmountList();
		public void setMonetaryAmountList(List<Clazz.MonetaryAmount> monetaryAmountList);
		public boolean hasMonetaryAmount();

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/totalPrice")
	@SchemaOrgLabel("totalPrice")
	@SchemaOrgComment(""
			+ "The total price for the reservation or ticket, including applicable taxes,"
			+ " shipping, etc.")
	@CamelizedName("totalPrice")
	@ConstantizedName("TOTAL_PRICE")
	public interface TotalPrice extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/PriceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PriceSpecification
		 */
		public Clazz.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Clazz.PriceSpecification priceSpecification);
		public List<Clazz.PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<Clazz.PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/totalTime")
	@SchemaOrgLabel("totalTime")
	@SchemaOrgComment(""
			+ "The total time required to perform instructions or a direction (including time"
			+ " to prepare the supplies), in <a"
			+ " href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO 8601 duration format</a>.")
	@CamelizedName("totalTime")
	@ConstantizedName("TOTAL_TIME")
	public interface TotalTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/touristType")
	@SchemaOrgLabel("touristType")
	@SchemaOrgComment(""
			+ "Attraction suitable for type(s) of tourist. eg. Children, visitors from a"
			+ " particular country, etc.")
	@CamelizedName("touristType")
	@ConstantizedName("TOURIST_TYPE")
	public interface TouristType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Audience
		 */
		public Clazz.Audience getAudience();
		public void setAudience(Clazz.Audience audience);
		public List<Clazz.Audience> getAudienceList();
		public void setAudienceList(List<Clazz.Audience> audienceList);
		public boolean hasAudience();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/track")
	@SchemaOrgLabel("track")
	@SchemaOrgComment(""
			+ "A music recording (track)&#x2014;usually a single song. If an ItemList is given,"
			+ " the list should contain items of type MusicRecording.")
	@CamelizedName("track")
	@ConstantizedName("TRACK")
	public interface Track extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/MusicRecording
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.MusicRecording
		 */
		public Clazz.MusicRecording getMusicRecording();
		public void setMusicRecording(Clazz.MusicRecording musicRecording);
		public List<Clazz.MusicRecording> getMusicRecordingList();
		public void setMusicRecordingList(List<Clazz.MusicRecording> musicRecordingList);
		public boolean hasMusicRecording();

		/**
		 * uri: http://schema.org/ItemList
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ItemList
		 */
		public Clazz.ItemList getItemList();
		public void setItemList(Clazz.ItemList itemList);
		public List<Clazz.ItemList> getItemListList();
		public void setItemListList(List<Clazz.ItemList> itemListList);
		public boolean hasItemList();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trackingNumber")
	@SchemaOrgLabel("trackingNumber")
	@SchemaOrgComment("Shipper tracking number.")
	@CamelizedName("trackingNumber")
	@ConstantizedName("TRACKING_NUMBER")
	public interface TrackingNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trackingUrl")
	@SchemaOrgLabel("trackingUrl")
	@SchemaOrgComment("Tracking url for the parcel delivery.")
	@CamelizedName("trackingUrl")
	@ConstantizedName("TRACKING_URL")
	public interface TrackingUrl extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trailer")
	@SchemaOrgLabel("trailer")
	@SchemaOrgComment(""
			+ "The trailer of a movie or tv/radio series, season, episode, etc.")
	@CamelizedName("trailer")
	@ConstantizedName("TRAILER")
	public interface Trailer extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/VideoObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.VideoObject
		 */
		public Clazz.VideoObject getVideoObject();
		public void setVideoObject(Clazz.VideoObject videoObject);
		public List<Clazz.VideoObject> getVideoObjectList();
		public void setVideoObjectList(List<Clazz.VideoObject> videoObjectList);
		public boolean hasVideoObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trainName")
	@SchemaOrgLabel("trainName")
	@SchemaOrgComment(""
			+ "The name of the train (e.g. The Orient Express).")
	@CamelizedName("trainName")
	@ConstantizedName("TRAIN_NAME")
	public interface TrainName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/trainNumber")
	@SchemaOrgLabel("trainNumber")
	@SchemaOrgComment("The unique identifier for the train.")
	@CamelizedName("trainNumber")
	@ConstantizedName("TRAIN_NUMBER")
	public interface TrainNumber extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/transFatContent")
	@SchemaOrgLabel("transFatContent")
	@SchemaOrgComment("The number of grams of trans fat.")
	@CamelizedName("transFatContent")
	@ConstantizedName("TRANS_FAT_CONTENT")
	public interface TransFatContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/transcript")
	@SchemaOrgLabel("transcript")
	@SchemaOrgComment(""
			+ "If this MediaObject is an AudioObject or VideoObject, the transcript of that"
			+ " object.")
	@CamelizedName("transcript")
	@ConstantizedName("TRANSCRIPT")
	public interface Transcript extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/translator")
	@SchemaOrgLabel("translator")
	@SchemaOrgComment(""
			+ "Organization or person who adapts a creative work to different languages,"
			+ " regional differences and technical requirements of a target market, or that"
			+ " translates during some event.")
	@CamelizedName("translator")
	@ConstantizedName("TRANSLATOR")
	public interface Translator extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/typeOfBed")
	@SchemaOrgLabel("typeOfBed")
	@SchemaOrgComment(""
			+ "The type of bed to which the BedDetail refers, i.e. the type of bed available in"
			+ " the quantity indicated by quantity.")
	@CamelizedName("typeOfBed")
	@ConstantizedName("TYPE_OF_BED")
	public interface TypeOfBed extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/BedType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Clazz.BedType
		 */
		public BedType getBedType();
		public void setBedType(BedType bedType);
		public List<BedType> getBedTypeList();
		public void setBedTypeList(List<BedType> bedTypeList);
		public boolean hasBedType();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/typeOfGood")
	@SchemaOrgLabel("typeOfGood")
	@SchemaOrgComment(""
			+ "The product that this structured value is referring to.")
	@CamelizedName("typeOfGood")
	@ConstantizedName("TYPE_OF_GOOD")
	public interface TypeOfGood extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Product
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Product
		 */
		public Clazz.Product getProduct();
		public void setProduct(Clazz.Product product);
		public List<Clazz.Product> getProductList();
		public void setProductList(List<Clazz.Product> productList);
		public boolean hasProduct();

		/**
		 * uri: http://schema.org/Service
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Service
		 */
		public Clazz.Service getService();
		public void setService(Clazz.Service service);
		public List<Clazz.Service> getServiceList();
		public void setServiceList(List<Clazz.Service> serviceList);
		public boolean hasService();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/typicalAgeRange")
	@SchemaOrgLabel("typicalAgeRange")
	@SchemaOrgComment(""
			+ "The typical expected age range, e.g. '7-9', '11-'.")
	@CamelizedName("typicalAgeRange")
	@ConstantizedName("TYPICAL_AGE_RANGE")
	public interface TypicalAgeRange extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/underName")
	@SchemaOrgLabel("underName")
	@SchemaOrgComment(""
			+ "The person or organization the reservation or ticket is for.")
	@CamelizedName("underName")
	@ConstantizedName("UNDER_NAME")
	public interface UnderName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/unitCode")
	@SchemaOrgLabel("unitCode")
	@SchemaOrgComment(""
			+ "The unit of measurement given using the UN/CEFACT Common Code (3 characters) or"
			+ " a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix"
			+ " followed by a colon.")
	@CamelizedName("unitCode")
	@ConstantizedName("UNIT_CODE")
	public interface UnitCode extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/unitText")
	@SchemaOrgLabel("unitText")
	@SchemaOrgComment(""
			+ "A string or text indicating the unit of measurement. Useful if you cannot"
			+ " provide a standard unit code for\n<a href='unitCode'>unitCode</a>.")
	@CamelizedName("unitText")
	@ConstantizedName("UNIT_TEXT")
	public interface UnitText extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/unsaturatedFatContent")
	@SchemaOrgLabel("unsaturatedFatContent")
	@SchemaOrgComment("The number of grams of unsaturated fat.")
	@CamelizedName("unsaturatedFatContent")
	@ConstantizedName("UNSATURATED_FAT_CONTENT")
	public interface UnsaturatedFatContent extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Mass
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Mass
		 */
		public Clazz.Mass getMass();
		public void setMass(Clazz.Mass mass);
		public List<Clazz.Mass> getMassList();
		public void setMassList(List<Clazz.Mass> massList);
		public boolean hasMass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/uploadDate")
	@SchemaOrgLabel("uploadDate")
	@SchemaOrgComment(""
			+ "Date when this media object was uploaded to this site.")
	@CamelizedName("uploadDate")
	@ConstantizedName("UPLOAD_DATE")
	public interface UploadDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/upvoteCount")
	@SchemaOrgLabel("upvoteCount")
	@SchemaOrgComment(""
			+ "The number of upvotes this question, answer or comment has received from the"
			+ " community.")
	@CamelizedName("upvoteCount")
	@ConstantizedName("UPVOTE_COUNT")
	public interface UpvoteCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/url")
	@SchemaOrgLabel("url")
	@SchemaOrgComment("URL of the item.")
	@CamelizedName("url")
	@ConstantizedName("URL")
	public interface Url extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/urlTemplate")
	@SchemaOrgLabel("urlTemplate")
	@SchemaOrgComment(""
			+ "An url template (RFC6570) that will be used to construct the target of the"
			+ " execution of the action.")
	@CamelizedName("urlTemplate")
	@ConstantizedName("URL_TEMPLATE")
	public interface UrlTemplate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/userInteractionCount")
	@SchemaOrgLabel("userInteractionCount")
	@SchemaOrgComment(""
			+ "The number of interactions for the CreativeWork using the WebSite or"
			+ " SoftwareApplication.")
	@CamelizedName("userInteractionCount")
	@ConstantizedName("USER_INTERACTION_COUNT")
	public interface UserInteractionCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/validFor")
	@SchemaOrgLabel("validFor")
	@SchemaOrgComment("The time validity of the permit.")
	@CamelizedName("validFor")
	@ConstantizedName("VALID_FOR")
	public interface ValidFor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Duration
		 */
		public Clazz.Duration getDuration();
		public void setDuration(Clazz.Duration duration);
		public List<Clazz.Duration> getDurationList();
		public void setDurationList(List<Clazz.Duration> durationList);
		public boolean hasDuration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/validFrom")
	@SchemaOrgLabel("validFrom")
	@SchemaOrgComment("The date when the item becomes valid.")
	@CamelizedName("validFrom")
	@ConstantizedName("VALID_FROM")
	public interface ValidFrom extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/validIn")
	@SchemaOrgLabel("validIn")
	@SchemaOrgComment(""
			+ "The geographic area where the permit is valid.")
	@CamelizedName("validIn")
	@ConstantizedName("VALID_IN")
	public interface ValidIn extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/AdministrativeArea
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.AdministrativeArea
		 */
		public Clazz.AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(Clazz.AdministrativeArea administrativeArea);
		public List<Clazz.AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<Clazz.AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/validThrough")
	@SchemaOrgLabel("validThrough")
	@SchemaOrgComment(""
			+ "The date after when the item is not valid. For example the end of an offer,"
			+ " salary period, or a period of opening hours.")
	@CamelizedName("validThrough")
	@ConstantizedName("VALID_THROUGH")
	public interface ValidThrough extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/validUntil")
	@SchemaOrgLabel("validUntil")
	@SchemaOrgComment(""
			+ "The date when the item is no longer valid.")
	@CamelizedName("validUntil")
	@ConstantizedName("VALID_UNTIL")
	public interface ValidUntil extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/value")
	@SchemaOrgLabel("value")
	@SchemaOrgComment(""
			+ "<p>The value of the quantitative value or property value"
			+ " node.</p>\n\n<ul>\n<li>For <a class=\"localLink\""
			+ " href=\"http://schema.org/QuantitativeValue\">QuantitativeValue</a> and <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/MonetaryAmount\">MonetaryAmount</a>, the recommended"
			+ " type for values is 'Number'.</li>\n<li>For <a class=\"localLink\""
			+ " href=\"http://schema.org/PropertyValue\">PropertyValue</a>, it can be 'Text;',"
			+ " 'Number', 'Boolean', or 'StructuredValue'.</li>\n</ul>\n")
	@CamelizedName("value")
	@ConstantizedName("VALUE")
	public interface Value extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/StructuredValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.StructuredValue
		 */
		public Clazz.StructuredValue getStructuredValue();
		public void setStructuredValue(Clazz.StructuredValue structuredValue);
		public List<Clazz.StructuredValue> getStructuredValueList();
		public void setStructuredValueList(List<Clazz.StructuredValue> structuredValueList);
		public boolean hasStructuredValue();

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueAddedTaxIncluded")
	@SchemaOrgLabel("valueAddedTaxIncluded")
	@SchemaOrgComment(""
			+ "Specifies whether the applicable value-added tax (VAT) is included in the price"
			+ " specification or not.")
	@CamelizedName("valueAddedTaxIncluded")
	@ConstantizedName("VALUE_ADDED_TAX_INCLUDED")
	public interface ValueAddedTaxIncluded extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueMaxLength")
	@SchemaOrgLabel("valueMaxLength")
	@SchemaOrgComment(""
			+ "Specifies the allowed range for number of characters in a literal value.")
	@CamelizedName("valueMaxLength")
	@ConstantizedName("VALUE_MAX_LENGTH")
	public interface ValueMaxLength extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueMinLength")
	@SchemaOrgLabel("valueMinLength")
	@SchemaOrgComment(""
			+ "Specifies the minimum allowed range for number of characters in a literal value.")
	@CamelizedName("valueMinLength")
	@ConstantizedName("VALUE_MIN_LENGTH")
	public interface ValueMinLength extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueName")
	@SchemaOrgLabel("valueName")
	@SchemaOrgComment(""
			+ "Indicates the name of the PropertyValueSpecification to be used in URL templates"
			+ " and form encoding in a manner analogous to HTML's input@name.")
	@CamelizedName("valueName")
	@ConstantizedName("VALUE_NAME")
	public interface ValueName extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valuePattern")
	@SchemaOrgLabel("valuePattern")
	@SchemaOrgComment(""
			+ "Specifies a regular expression for testing literal values according to the HTML"
			+ " spec.")
	@CamelizedName("valuePattern")
	@ConstantizedName("VALUE_PATTERN")
	public interface ValuePattern extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueReference")
	@SchemaOrgLabel("valueReference")
	@SchemaOrgComment(""
			+ "A pointer to a secondary value that provides additional information on the"
			+ " original value, e.g. a reference temperature.")
	@CamelizedName("valueReference")
	@ConstantizedName("VALUE_REFERENCE")
	public interface ValueReference extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * uri: http://schema.org/PropertyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.PropertyValue
		 */
		public Clazz.PropertyValue getPropertyValue();
		public void setPropertyValue(Clazz.PropertyValue propertyValue);
		public List<Clazz.PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<Clazz.PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

		/**
		 * uri: http://schema.org/StructuredValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.StructuredValue
		 */
		public Clazz.StructuredValue getStructuredValue();
		public void setStructuredValue(Clazz.StructuredValue structuredValue);
		public List<Clazz.StructuredValue> getStructuredValueList();
		public void setStructuredValueList(List<Clazz.StructuredValue> structuredValueList);
		public boolean hasStructuredValue();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Enumeration
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Enumeration
		 */
		public Clazz.Enumeration getEnumeration();
		public void setEnumeration(Clazz.Enumeration enumeration);
		public List<Clazz.Enumeration> getEnumerationList();
		public void setEnumerationList(List<Clazz.Enumeration> enumerationList);
		public boolean hasEnumeration();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/valueRequired")
	@SchemaOrgLabel("valueRequired")
	@SchemaOrgComment(""
			+ "Whether the property must be filled in to complete the action.  Default is"
			+ " false.")
	@CamelizedName("valueRequired")
	@ConstantizedName("VALUE_REQUIRED")
	public interface ValueRequired extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Boolean
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Boolean
		 */
		public DataType.Boolean getB00lean();
		public void setB00lean(DataType.Boolean b00lean);
		public List<DataType.Boolean> getB00leanList();
		public void setB00leanList(List<DataType.Boolean> b00leanList);
		public boolean hasB00lean();

		public java.lang.Boolean getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vatID")
	@SchemaOrgLabel("vatID")
	@SchemaOrgComment(""
			+ "The Value-added Tax ID of the organization or person.")
	@CamelizedName("vatID")
	@ConstantizedName("VAT_ID")
	public interface VatID extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleConfiguration")
	@SchemaOrgLabel("vehicleConfiguration")
	@SchemaOrgComment(""
			+ "A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST"
			+ " 2.5 MT 225 hp' or 'limited edition'.")
	@CamelizedName("vehicleConfiguration")
	@ConstantizedName("VEHICLE_CONFIGURATION")
	public interface VehicleConfiguration extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleEngine")
	@SchemaOrgLabel("vehicleEngine")
	@SchemaOrgComment(""
			+ "Information about the engine or engines of the vehicle.")
	@CamelizedName("vehicleEngine")
	@ConstantizedName("VEHICLE_ENGINE")
	public interface VehicleEngine extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/EngineSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.EngineSpecification
		 */
		public Clazz.EngineSpecification getEngineSpecification();
		public void setEngineSpecification(Clazz.EngineSpecification engineSpecification);
		public List<Clazz.EngineSpecification> getEngineSpecificationList();
		public void setEngineSpecificationList(List<Clazz.EngineSpecification> engineSpecificationList);
		public boolean hasEngineSpecification();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleIdentificationNumber")
	@SchemaOrgLabel("vehicleIdentificationNumber")
	@SchemaOrgComment(""
			+ "The Vehicle Identification Number (VIN) is a unique serial number used by the"
			+ " automotive industry to identify individual motor vehicles.")
	@CamelizedName("vehicleIdentificationNumber")
	@ConstantizedName("VEHICLE_IDENTIFICATION_NUMBER")
	public interface VehicleIdentificationNumber extends SchemaOrgProperty, SerialNumber {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleInteriorColor")
	@SchemaOrgLabel("vehicleInteriorColor")
	@SchemaOrgComment(""
			+ "The color or color combination of the interior of the vehicle.")
	@CamelizedName("vehicleInteriorColor")
	@ConstantizedName("VEHICLE_INTERIOR_COLOR")
	public interface VehicleInteriorColor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleInteriorType")
	@SchemaOrgLabel("vehicleInteriorType")
	@SchemaOrgComment(""
			+ "The type or material of the interior of the vehicle (e.g. synthetic fabric,"
			+ " leather, wood, etc.). While most interior types are characterized by the"
			+ " material used, an interior type can also be based on vehicle usage or target"
			+ " audience.")
	@CamelizedName("vehicleInteriorType")
	@ConstantizedName("VEHICLE_INTERIOR_TYPE")
	public interface VehicleInteriorType extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleModelDate")
	@SchemaOrgLabel("vehicleModelDate")
	@SchemaOrgComment(""
			+ "The release date of a vehicle model (often used to differentiate versions of the"
			+ " same make and model).")
	@CamelizedName("vehicleModelDate")
	@ConstantizedName("VEHICLE_MODEL_DATE")
	public interface VehicleModelDate extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Date
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Date
		 */
		public DataType.Date getDate();
		public void setDate(DataType.Date date);
		public List<DataType.Date> getDateList();
		public void setDateList(List<DataType.Date> dateList);
		public boolean hasDate();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleSeatingCapacity")
	@SchemaOrgLabel("vehicleSeatingCapacity")
	@SchemaOrgComment(""
			+ "The number of passengers that can be seated in the vehicle, both in terms of the"
			+ " physical space available, and in terms of limitations set by"
			+ " law.</p>\n\n<p>Typical unit code(s): C62 for persons.")
	@CamelizedName("vehicleSeatingCapacity")
	@ConstantizedName("VEHICLE_SEATING_CAPACITY")
	public interface VehicleSeatingCapacity extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/vehicleTransmission")
	@SchemaOrgLabel("vehicleTransmission")
	@SchemaOrgComment(""
			+ "The type of component used for transmitting the power from a rotating power"
			+ " source to the wheels or other relevant component(s) (\"gearbox\" for cars).")
	@CamelizedName("vehicleTransmission")
	@ConstantizedName("VEHICLE_TRANSMISSION")
	public interface VehicleTransmission extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/URL
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.URL
		 */
		public Clazz.URL getURL();
		public void setURL(Clazz.URL url);
		public List<Clazz.URL> getURLList();
		public void setURLList(List<Clazz.URL> urlList);
		public boolean hasURL();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/QualitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QualitativeValue
		 */
		public Clazz.QualitativeValue getQualitativeValue();
		public void setQualitativeValue(Clazz.QualitativeValue qualitativeValue);
		public List<Clazz.QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<Clazz.QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/version")
	@SchemaOrgLabel("version")
	@SchemaOrgComment(""
			+ "The version of the CreativeWork embodied by a specified resource.")
	@CamelizedName("version")
	@ConstantizedName("VERSION")
	public interface Version extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/video")
	@SchemaOrgLabel("video")
	@SchemaOrgComment("An embedded video object.")
	@CamelizedName("video")
	@ConstantizedName("VIDEO")
	public interface Video extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/VideoObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.VideoObject
		 */
		public Clazz.VideoObject getVideoObject();
		public void setVideoObject(Clazz.VideoObject videoObject);
		public List<Clazz.VideoObject> getVideoObjectList();
		public void setVideoObjectList(List<Clazz.VideoObject> videoObjectList);
		public boolean hasVideoObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/videoFormat")
	@SchemaOrgLabel("videoFormat")
	@SchemaOrgComment(""
			+ "The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).")
	@CamelizedName("videoFormat")
	@ConstantizedName("VIDEO_FORMAT")
	public interface VideoFormat extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/videoFrameSize")
	@SchemaOrgLabel("videoFrameSize")
	@SchemaOrgComment("The frame size of the video.")
	@CamelizedName("videoFrameSize")
	@ConstantizedName("VIDEO_FRAME_SIZE")
	public interface VideoFrameSize extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/videoQuality")
	@SchemaOrgLabel("videoQuality")
	@SchemaOrgComment("The quality of the video.")
	@CamelizedName("videoQuality")
	@ConstantizedName("VIDEO_QUALITY")
	public interface VideoQuality extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/volumeNumber")
	@SchemaOrgLabel("volumeNumber")
	@SchemaOrgComment(""
			+ "Identifies the volume of publication or multi-part work; for example, \"iii\" or"
			+ " \"2\".")
	@CamelizedName("volumeNumber")
	@ConstantizedName("VOLUME_NUMBER")
	public interface VolumeNumber extends Position, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/warranty")
	@SchemaOrgLabel("warranty")
	@SchemaOrgComment(""
			+ "The warranty promise(s) included in the offer.")
	@CamelizedName("warranty")
	@ConstantizedName("WARRANTY")
	public interface Warranty extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/WarrantyPromise
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.WarrantyPromise
		 */
		public Clazz.WarrantyPromise getWarrantyPromise();
		public void setWarrantyPromise(Clazz.WarrantyPromise warrantyPromise);
		public List<Clazz.WarrantyPromise> getWarrantyPromiseList();
		public void setWarrantyPromiseList(List<Clazz.WarrantyPromise> warrantyPromiseList);
		public boolean hasWarrantyPromise();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/warrantyScope")
	@SchemaOrgLabel("warrantyScope")
	@SchemaOrgComment("The scope of the warranty promise.")
	@CamelizedName("warrantyScope")
	@ConstantizedName("WARRANTY_SCOPE")
	public interface WarrantyScope extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/WarrantyScope
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.WarrantyScope
		 */
		public Clazz.WarrantyScope getWarrantyScope();
		public void setWarrantyScope(Clazz.WarrantyScope warrantyScope);
		public List<Clazz.WarrantyScope> getWarrantyScopeList();
		public void setWarrantyScopeList(List<Clazz.WarrantyScope> warrantyScopeList);
		public boolean hasWarrantyScope();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/webCheckinTime")
	@SchemaOrgLabel("webCheckinTime")
	@SchemaOrgComment(""
			+ "The time when a passenger can check into the flight online.")
	@CamelizedName("webCheckinTime")
	@ConstantizedName("WEB_CHECKIN_TIME")
	public interface WebCheckinTime extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/DateTime
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.DateTime
		 */
		public DataType.DateTime getDateTime();
		public void setDateTime(DataType.DateTime dateTime);
		public List<DataType.DateTime> getDateTimeList();
		public void setDateTimeList(List<DataType.DateTime> dateTimeList);
		public boolean hasDateTime();

		public java.util.Date getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/weight")
	@SchemaOrgLabel("weight")
	@SchemaOrgComment("The weight of the product or person.")
	@CamelizedName("weight")
	@ConstantizedName("WEIGHT")
	public interface Weight extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/width")
	@SchemaOrgLabel("width")
	@SchemaOrgComment("The width of the item.")
	@CamelizedName("width")
	@ConstantizedName("WIDTH")
	public interface Width extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Distance
		 */
		public Clazz.Distance getDistance();
		public void setDistance(Clazz.Distance distance);
		public List<Clazz.Distance> getDistanceList();
		public void setDistanceList(List<Clazz.Distance> distanceList);
		public boolean hasDistance();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/winner")
	@SchemaOrgLabel("winner")
	@SchemaOrgComment(""
			+ "A sub property of participant. The winner of the action.")
	@CamelizedName("winner")
	@ConstantizedName("WINNER")
	public interface Winner extends Participant, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Person
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Person
		 */
		public Clazz.Person getPerson();
		public void setPerson(Clazz.Person person);
		public List<Clazz.Person> getPersonList();
		public void setPersonList(List<Clazz.Person> personList);
		public boolean hasPerson();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/wordCount")
	@SchemaOrgLabel("wordCount")
	@SchemaOrgComment(""
			+ "The number of words in the text of the Article.")
	@CamelizedName("wordCount")
	@ConstantizedName("WORD_COUNT")
	public interface WordCount extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Integer
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Integer
		 */
		public Clazz.Integer getInteger();
		public void setInteger(Clazz.Integer integer);
		public List<Clazz.Integer> getIntegerList();
		public void setIntegerList(List<Clazz.Integer> integerList);
		public boolean hasInteger();

		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workExample")
	@SchemaOrgLabel("workExample")
	@SchemaOrgComment(""
			+ "Example/instance/realization/derivation of the concept of this creative work."
			+ " eg. The paperback edition, first edition, or eBook.")
	@CamelizedName("workExample")
	@ConstantizedName("WORK_EXAMPLE")
	public interface WorkExample extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workFeatured")
	@SchemaOrgLabel("workFeatured")
	@SchemaOrgComment(""
			+ "A work featured in some event, e.g. exhibited in an ExhibitionEvent.\n      "
			+ " Specific subproperties are available for workPerformed (e.g. a play), or a"
			+ " workPresented (a Movie at a ScreeningEvent).")
	@CamelizedName("workFeatured")
	@ConstantizedName("WORK_FEATURED")
	public interface WorkFeatured extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workHours")
	@SchemaOrgLabel("workHours")
	@SchemaOrgComment(""
			+ "The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).")
	@CamelizedName("workHours")
	@ConstantizedName("WORK_HOURS")
	public interface WorkHours extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workLocation")
	@SchemaOrgLabel("workLocation")
	@SchemaOrgComment(""
			+ "A contact location for a person's place of work.")
	@CamelizedName("workLocation")
	@ConstantizedName("WORK_LOCATION")
	public interface WorkLocation extends Location, SchemaOrgProperty {

		/**
		 * uri: http://schema.org/ContactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint
		 */
		public Clazz.ContactPoint getContactPoint();
		public void setContactPoint(Clazz.ContactPoint contactPoint);
		public List<Clazz.ContactPoint> getContactPointList();
		public void setContactPointList(List<Clazz.ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * uri: http://schema.org/Place
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Place
		 */
		public Clazz.Place getPlace();
		public void setPlace(Clazz.Place place);
		public List<Clazz.Place> getPlaceList();
		public void setPlaceList(List<Clazz.Place> placeList);
		public boolean hasPlace();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workPerformed")
	@SchemaOrgLabel("workPerformed")
	@SchemaOrgComment(""
			+ "A work performed in some event, for example a play performed in a TheaterEvent.")
	@CamelizedName("workPerformed")
	@ConstantizedName("WORK_PERFORMED")
	public interface WorkPerformed extends SchemaOrgProperty, WorkFeatured {

		/**
		 * uri: http://schema.org/CreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork
		 */
		public Clazz.CreativeWork getCreativeWork();
		public void setCreativeWork(Clazz.CreativeWork creativeWork);
		public List<Clazz.CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<Clazz.CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/workPresented")
	@SchemaOrgLabel("workPresented")
	@SchemaOrgComment("The movie presented during this event.")
	@CamelizedName("workPresented")
	@ConstantizedName("WORK_PRESENTED")
	public interface WorkPresented extends SchemaOrgProperty, WorkFeatured {

		/**
		 * uri: http://schema.org/Movie
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Movie
		 */
		public Clazz.Movie getMovie();
		public void setMovie(Clazz.Movie movie);
		public List<Clazz.Movie> getMovieList();
		public void setMovieList(List<Clazz.Movie> movieList);
		public boolean hasMovie();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/worksFor")
	@SchemaOrgLabel("worksFor")
	@SchemaOrgComment(""
			+ "Organizations that the person works for.")
	@CamelizedName("worksFor")
	@ConstantizedName("WORKS_FOR")
	public interface WorksFor extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Organization
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.Organization
		 */
		public Clazz.Organization getOrganization();
		public void setOrganization(Clazz.Organization organization);
		public List<Clazz.Organization> getOrganizationList();
		public void setOrganizationList(List<Clazz.Organization> organizationList);
		public boolean hasOrganization();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/worstRating")
	@SchemaOrgLabel("worstRating")
	@SchemaOrgComment(""
			+ "The lowest value allowed in this rating system. If worstRating is omitted, 1 is"
			+ " assumed.")
	@CamelizedName("worstRating")
	@ConstantizedName("WORST_RATING")
	public interface WorstRating extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		/**
		 * uri: http://schema.org/Number
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Number
		 */
		public DataType.Number getNumber();
		public void setNumber(DataType.Number number);
		public List<DataType.Number> getNumberList();
		public void setNumberList(List<DataType.Number> numberList);
		public boolean hasNumber();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/yearlyRevenue")
	@SchemaOrgLabel("yearlyRevenue")
	@SchemaOrgComment(""
			+ "The size of the business in annual revenue.")
	@CamelizedName("yearlyRevenue")
	@ConstantizedName("YEARLY_REVENUE")
	public interface YearlyRevenue extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/yearsInOperation")
	@SchemaOrgLabel("yearsInOperation")
	@SchemaOrgComment("The age of the business.")
	@CamelizedName("yearsInOperation")
	@ConstantizedName("YEARS_IN_OPERATION")
	public interface YearsInOperation extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/yield")
	@SchemaOrgLabel("yield")
	@SchemaOrgComment(""
			+ "The quantity that results by performing instructions. For example, a paper"
			+ " airplane, 10 personalized candles.")
	@CamelizedName("yield")
	@ConstantizedName("YIELD")
	public interface Yield extends SchemaOrgProperty {

		/**
		 * uri: http://schema.org/QuantitativeValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Clazz.QuantitativeValue
		 */
		public Clazz.QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(Clazz.QuantitativeValue quantitativeValue);
		public List<Clazz.QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<Clazz.QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * uri: http://schema.org/Text
		 * class: org.kyojo.schemaOrg.m3n3.core.DataType.Text
		 */
		public DataType.Text getText();
		public void setText(DataType.Text text);
		public List<DataType.Text> getTextList();
		public void setTextList(List<DataType.Text> textList);
		public boolean hasText();

		public String getNativeValue();

	}

}
