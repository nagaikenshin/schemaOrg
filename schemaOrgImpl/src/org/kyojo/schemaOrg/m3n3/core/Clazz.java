package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SchemaOrgClass;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;
import org.kyojo.schemaOrg.m3n3.auto.Container.AccelerationTime;
import org.kyojo.schemaOrg.m3n3.auto.Container.AcrissCode;
import org.kyojo.schemaOrg.m3n3.auto.Container.BodyType;
import org.kyojo.schemaOrg.m3n3.auto.Container.EmissionsCO2;
import org.kyojo.schemaOrg.m3n3.auto.Container.EngineDisplacement;
import org.kyojo.schemaOrg.m3n3.auto.Container.EnginePower;
import org.kyojo.schemaOrg.m3n3.auto.Container.EngineType;
import org.kyojo.schemaOrg.m3n3.auto.Container.FuelCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaOrg.m3n3.auto.Container.ModelDate;
import org.kyojo.schemaOrg.m3n3.auto.Container.Payload;
import org.kyojo.schemaOrg.m3n3.auto.Container.RoofLoad;
import org.kyojo.schemaOrg.m3n3.auto.Container.SeatingCapacity;
import org.kyojo.schemaOrg.m3n3.auto.Container.Speed;
import org.kyojo.schemaOrg.m3n3.auto.Container.TongueWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.Torque;
import org.kyojo.schemaOrg.m3n3.auto.Container.TrailerWeight;
import org.kyojo.schemaOrg.m3n3.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaOrg.m3n3.auto.Container.WeightTotal;
import org.kyojo.schemaOrg.m3n3.auto.Container.Wheelbase;
import org.kyojo.schemaOrg.m3n3.bib.Container.Abridged;
import org.kyojo.schemaOrg.m3n3.bib.Container.Artist;
import org.kyojo.schemaOrg.m3n3.bib.Container.Colorist;
import org.kyojo.schemaOrg.m3n3.bib.Container.Inker;
import org.kyojo.schemaOrg.m3n3.bib.Container.Letterer;
import org.kyojo.schemaOrg.m3n3.bib.Container.Penciler;
import org.kyojo.schemaOrg.m3n3.bib.Container.PublishedBy;
import org.kyojo.schemaOrg.m3n3.bib.Container.PublisherImprint;
import org.kyojo.schemaOrg.m3n3.bib.Container.TranslationOfWork;
import org.kyojo.schemaOrg.m3n3.bib.Container.WorkTranslation;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableService;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diet;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExercisePlan;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseRelatedDiet;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseType;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HospitalAffiliation;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicalSpecialty;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Purpose;
import org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy;
import org.kyojo.schemaOrg.m3n3.pending.Container.AccountMinimumInflow;
import org.kyojo.schemaOrg.m3n3.pending.Container.AccountOverdraftLimit;
import org.kyojo.schemaOrg.m3n3.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.BankAccountType;
import org.kyojo.schemaOrg.m3n3.pending.Container.BroadcastFrequency;
import org.kyojo.schemaOrg.m3n3.pending.Container.CashBack;
import org.kyojo.schemaOrg.m3n3.pending.Container.ContactlessPayment;
import org.kyojo.schemaOrg.m3n3.pending.Container.ContentReferenceTime;
import org.kyojo.schemaOrg.m3n3.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.DiversityPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.EducationalCredentialAwarded;
import org.kyojo.schemaOrg.m3n3.pending.Container.EstimatedSalary;
import org.kyojo.schemaOrg.m3n3.pending.Container.EthicsPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.FloorLimit;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyContains;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCoveredBy;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyDisjoint;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyEquals;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyTouches;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyWithin;
import org.kyojo.schemaOrg.m3n3.pending.Container.GracePeriod;
import org.kyojo.schemaOrg.m3n3.pending.Container.HasBroadcastChannel;
import org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanNetworkId;
import org.kyojo.schemaOrg.m3n3.pending.Container.IsAcceptingNewPatients;
import org.kyojo.schemaOrg.m3n3.pending.Container.LoanRepaymentForm;
import org.kyojo.schemaOrg.m3n3.pending.Container.LoanType;
import org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique;
import org.kyojo.schemaOrg.m3n3.pending.Container.MenuAddOn;
import org.kyojo.schemaOrg.m3n3.pending.Container.MonthlyMinimumRepaymentAmount;
import org.kyojo.schemaOrg.m3n3.pending.Container.RecourseLoan;
import org.kyojo.schemaOrg.m3n3.pending.Container.RenegotiableLoan;
import org.kyojo.schemaOrg.m3n3.pending.Container.Speakable;
import org.kyojo.schemaOrg.m3n3.pending.Container.TermsOfService;
import org.kyojo.schemaOrg.m3n3.pending.Container.UnnamedSourcesPolicy;
import org.kyojo.schemaOrg.m3n3.pending.Container.VariableMeasured;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
@CamelizedName("clazz")
@ConstantizedName("CLAZZ")
public interface Clazz extends SchemaOrgClass {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/APIReference")
	@SchemaOrgLabel("APIReference")
	@SchemaOrgComment(""
			+ "Reference documentation for application programming interfaces (APIs).")
	@CamelizedName("apiReference")
	@ConstantizedName("API_REFERENCE")
	public interface APIReference extends SchemaOrgClass, TechArticle {

		/**
		 * uri: http://schema.org/assemblyVersion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AssemblyVersion
		 */
		public Container.AssemblyVersion getAssemblyVersion();
		public void setAssemblyVersion(Container.AssemblyVersion assemblyVersion);

		/**
		 * uri: http://schema.org/executableLibraryName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExecutableLibraryName
		 */
		public Container.ExecutableLibraryName getExecutableLibraryName();
		public void setExecutableLibraryName(Container.ExecutableLibraryName executableLibraryName);

		/**
		 * uri: http://schema.org/programmingModel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProgrammingModel
		 */
		public Container.ProgrammingModel getProgrammingModel();
		public void setProgrammingModel(Container.ProgrammingModel programmingModel);

		/**
		 * uri: http://schema.org/targetPlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetPlatform
		 */
		public Container.TargetPlatform getTargetPlatform();
		public void setTargetPlatform(Container.TargetPlatform targetPlatform);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AboutPage")
	@SchemaOrgLabel("AboutPage")
	@SchemaOrgComment("Web page type: About page.")
	@CamelizedName("aboutPage")
	@ConstantizedName("ABOUT_PAGE")
	public interface AboutPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AcceptAction")
	@SchemaOrgLabel("AcceptAction")
	@SchemaOrgComment(""
			+ "<p>The act of committing to/adopting an object.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RejectAction\">RejectAction</a>: The antonym of"
			+ " AcceptAction.</li>\n</ul>\n")
	@CamelizedName("acceptAction")
	@ConstantizedName("ACCEPT_ACTION")
	public interface AcceptAction extends AllocateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Accommodation")
	@SchemaOrgLabel("Accommodation")
	@SchemaOrgComment(""
			+ "An accommodation is a place that can accommodate human beings, e.g. a hotel"
			+ " room, a camping pitch, or a meeting room. Many accommodations are for overnight"
			+ " stays, but this is not a mandatory requirement.\nFor more specific types of"
			+ " accommodations not defined in schema.org, one can use additionalType with"
			+ " external vocabularies.\n<br /><br />\nSee also the <a"
			+ " href=\"/docs/hotels.html\">dedicated document on the use of schema.org for"
			+ " marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("accommodation")
	@ConstantizedName("ACCOMMODATION")
	public interface Accommodation extends Place, SchemaOrgClass {

		/**
		 * uri: http://schema.org/amenityFeature
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * uri: http://schema.org/floorSize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FloorSize
		 */
		public Container.FloorSize getFloorSize();
		public void setFloorSize(Container.FloorSize floorSize);

		/**
		 * uri: http://schema.org/numberOfRooms
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfRooms
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * uri: http://schema.org/permittedUsage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PermittedUsage
		 */
		public Container.PermittedUsage getPermittedUsage();
		public void setPermittedUsage(Container.PermittedUsage permittedUsage);

		/**
		 * uri: http://schema.org/petsAllowed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PetsAllowed
		 */
		public Container.PetsAllowed getPetsAllowed();
		public void setPetsAllowed(Container.PetsAllowed petsAllowed);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AccountingService")
	@SchemaOrgLabel("AccountingService")
	@SchemaOrgComment(""
			+ "Accountancy business.</p>\n\n<p>As a <a class=\"localLink\""
			+ " href=\"http://schema.org/LocalBusiness\">LocalBusiness</a> it can be described"
			+ " as a <a class=\"localLink\" href=\"http://schema.org/provider\">provider</a> of"
			+ " one or more <a class=\"localLink\""
			+ " href=\"http://schema.org/Service\">Service</a>(s).")
	@CamelizedName("accountingService")
	@ConstantizedName("ACCOUNTING_SERVICE")
	public interface AccountingService extends FinancialService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AchieveAction")
	@SchemaOrgLabel("AchieveAction")
	@SchemaOrgComment(""
			+ "The act of accomplishing something via previous efforts. It is an instantaneous"
			+ " action rather than an ongoing process.")
	@CamelizedName("achieveAction")
	@ConstantizedName("ACHIEVE_ACTION")
	public interface AchieveAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Action")
	@SchemaOrgLabel("Action")
	@SchemaOrgComment(""
			+ "An action performed by a direct agent and indirect participants upon a direct"
			+ " object. Optionally happens at a location with the help of an inanimate"
			+ " instrument. The execution of the action may produce a result. Specific action"
			+ " sub-type documentation specifies the exact expectation of each"
			+ " argument/role.</p>\n\n<p>See also <a"
			+ " href=\"http://blog.schema.org/2014/04/announcing-schemaorg-actions.html\">blog"
			+ " post</a> and <a href=\"http://schema.org/docs/actions.html\">Actions overview"
			+ " document</a>.")
	@CamelizedName("action")
	@ConstantizedName("ACTION")
	public interface Action extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/actionStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ActionStatus
		 */
		public Container.ActionStatus getActionStatus();
		public void setActionStatus(Container.ActionStatus actionStatus);

		/**
		 * uri: http://schema.org/agent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Agent
		 */
		public Container.Agent getAgent();
		public void setAgent(Container.Agent agent);

		/**
		 * uri: http://schema.org/endTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndTime
		 */
		public Container.EndTime getEndTime();
		public void setEndTime(Container.EndTime endTime);

		/**
		 * uri: http://schema.org/error
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Error
		 */
		public Container.Error getError();
		public void setError(Container.Error error);

		/**
		 * uri: http://schema.org/instrument
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Instrument
		 */
		public Container.Instrument getInstrument();
		public void setInstrument(Container.Instrument instrument);

		/**
		 * uri: http://schema.org/location
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Location
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * uri: http://schema.org/object
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Object
		 */
		public Container.Object getObject();
		public void setObject(Container.Object object);

		/**
		 * uri: http://schema.org/participant
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Participant
		 */
		public Container.Participant getParticipant();
		public void setParticipant(Container.Participant participant);

		/**
		 * uri: http://schema.org/result
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Result
		 */
		public Container.Result getResult();
		public void setResult(Container.Result result);

		/**
		 * uri: http://schema.org/startTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartTime
		 */
		public Container.StartTime getStartTime();
		public void setStartTime(Container.StartTime startTime);

		/**
		 * uri: http://schema.org/target
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Target
		 */
		public Container.Target getTarget();
		public void setTarget(Container.Target target);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ActionStatusType")
	@SchemaOrgLabel("ActionStatusType")
	@SchemaOrgComment("The status of an Action.")
	@CamelizedName("actionStatusType")
	@ConstantizedName("ACTION_STATUS_TYPE")
	public interface ActionStatusType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ActivateAction")
	@SchemaOrgLabel("ActivateAction")
	@SchemaOrgComment(""
			+ "The act of starting or activating a device or application (e.g. starting a timer"
			+ " or turning on a flashlight).")
	@CamelizedName("activateAction")
	@ConstantizedName("ACTIVATE_ACTION")
	public interface ActivateAction extends ControlAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AddAction")
	@SchemaOrgLabel("AddAction")
	@SchemaOrgComment(""
			+ "The act of editing by adding an object to a collection.")
	@CamelizedName("addAction")
	@ConstantizedName("ADD_ACTION")
	public interface AddAction extends SchemaOrgClass, UpdateAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AdministrativeArea")
	@SchemaOrgLabel("AdministrativeArea")
	@SchemaOrgComment(""
			+ "A geographical region, typically under the jurisdiction of a particular"
			+ " government.")
	@CamelizedName("administrativeArea")
	@ConstantizedName("ADMINISTRATIVE_AREA")
	public interface AdministrativeArea extends Place, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AdultEntertainment")
	@SchemaOrgLabel("AdultEntertainment")
	@SchemaOrgComment("An adult entertainment establishment.")
	@CamelizedName("adultEntertainment")
	@ConstantizedName("ADULT_ENTERTAINMENT")
	public interface AdultEntertainment extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AggregateOffer")
	@SchemaOrgLabel("AggregateOffer")
	@SchemaOrgComment(""
			+ "When a single product is associated with multiple offers (for example, the same"
			+ " pair of shoes is offered by different merchants), then AggregateOffer can be"
			+ " used.")
	@CamelizedName("aggregateOffer")
	@ConstantizedName("AGGREGATE_OFFER")
	public interface AggregateOffer extends Offer, SchemaOrgClass {

		/**
		 * uri: http://schema.org/highPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HighPrice
		 */
		public Container.HighPrice getHighPrice();
		public void setHighPrice(Container.HighPrice highPrice);

		/**
		 * uri: http://schema.org/lowPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LowPrice
		 */
		public Container.LowPrice getLowPrice();
		public void setLowPrice(Container.LowPrice lowPrice);

		/**
		 * uri: http://schema.org/offerCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OfferCount
		 */
		public Container.OfferCount getOfferCount();
		public void setOfferCount(Container.OfferCount offerCount);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AggregateRating")
	@SchemaOrgLabel("AggregateRating")
	@SchemaOrgComment(""
			+ "The average rating based on multiple ratings or reviews.")
	@CamelizedName("aggregateRating")
	@ConstantizedName("AGGREGATE_RATING")
	public interface AggregateRating extends Rating, SchemaOrgClass {

		/**
		 * uri: http://schema.org/itemReviewed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemReviewed
		 */
		public Container.ItemReviewed getItemReviewed();
		public void setItemReviewed(Container.ItemReviewed itemReviewed);

		/**
		 * uri: http://schema.org/ratingCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RatingCount
		 */
		public Container.RatingCount getRatingCount();
		public void setRatingCount(Container.RatingCount ratingCount);

		/**
		 * uri: http://schema.org/reviewCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReviewCount
		 */
		public Container.ReviewCount getReviewCount();
		public void setReviewCount(Container.ReviewCount reviewCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AgreeAction")
	@SchemaOrgLabel("AgreeAction")
	@SchemaOrgComment(""
			+ "The act of expressing a consistency of opinion with the object. An agent agrees"
			+ " to/about an object (a proposition, topic or theme) with participants.")
	@CamelizedName("agreeAction")
	@ConstantizedName("AGREE_ACTION")
	public interface AgreeAction extends ReactAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Airline")
	@SchemaOrgLabel("Airline")
	@SchemaOrgComment(""
			+ "An organization that provides flights for passengers.")
	@CamelizedName("airline")
	@ConstantizedName("AIRLINE")
	public interface Airline extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/boardingPolicy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BoardingPolicy
		 */
		public Container.BoardingPolicy getBoardingPolicy();
		public void setBoardingPolicy(Container.BoardingPolicy boardingPolicy);

		/**
		 * uri: http://schema.org/iataCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IataCode
		 */
		public Container.IataCode getIataCode();
		public void setIataCode(Container.IataCode iataCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Airport")
	@SchemaOrgLabel("Airport")
	@SchemaOrgComment("An airport.")
	@CamelizedName("airport")
	@ConstantizedName("AIRPORT")
	public interface Airport extends CivicStructure, SchemaOrgClass {

		/**
		 * uri: http://schema.org/iataCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IataCode
		 */
		public Container.IataCode getIataCode();
		public void setIataCode(Container.IataCode iataCode);

		/**
		 * uri: http://schema.org/icaoCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IcaoCode
		 */
		public Container.IcaoCode getIcaoCode();
		public void setIcaoCode(Container.IcaoCode icaoCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AlignmentObject")
	@SchemaOrgLabel("AlignmentObject")
	@SchemaOrgComment(""
			+ "An intangible item that describes an alignment between a learning resource and a"
			+ " node in an educational framework.")
	@CamelizedName("alignmentObject")
	@ConstantizedName("ALIGNMENT_OBJECT")
	public interface AlignmentObject extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/alignmentType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlignmentType
		 */
		public Container.AlignmentType getAlignmentType();
		public void setAlignmentType(Container.AlignmentType alignmentType);

		/**
		 * uri: http://schema.org/educationalFramework
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EducationalFramework
		 */
		public Container.EducationalFramework getEducationalFramework();
		public void setEducationalFramework(Container.EducationalFramework educationalFramework);

		/**
		 * uri: http://schema.org/targetDescription
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetDescription
		 */
		public Container.TargetDescription getTargetDescription();
		public void setTargetDescription(Container.TargetDescription targetDescription);

		/**
		 * uri: http://schema.org/targetName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetName
		 */
		public Container.TargetName getTargetName();
		public void setTargetName(Container.TargetName targetName);

		/**
		 * uri: http://schema.org/targetUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetUrl
		 */
		public Container.TargetUrl getTargetUrl();
		public void setTargetUrl(Container.TargetUrl targetUrl);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AllocateAction")
	@SchemaOrgLabel("AllocateAction")
	@SchemaOrgComment(""
			+ "The act of organizing tasks/objects/events by associating resources to it.")
	@CamelizedName("allocateAction")
	@ConstantizedName("ALLOCATE_ACTION")
	public interface AllocateAction extends OrganizeAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/purpose
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Purpose
		 */
		public Purpose getPurpose();
		public void setPurpose(Purpose purpose);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AmusementPark")
	@SchemaOrgLabel("AmusementPark")
	@SchemaOrgComment("An amusement park.")
	@CamelizedName("amusementPark")
	@ConstantizedName("AMUSEMENT_PARK")
	public interface AmusementPark extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AnimalShelter")
	@SchemaOrgLabel("AnimalShelter")
	@SchemaOrgComment("Animal shelter.")
	@CamelizedName("animalShelter")
	@ConstantizedName("ANIMAL_SHELTER")
	public interface AnimalShelter extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Answer")
	@SchemaOrgLabel("Answer")
	@SchemaOrgComment(""
			+ "An answer offered to a question; perhaps correct, perhaps opinionated or wrong.")
	@CamelizedName("answer")
	@ConstantizedName("ANSWER")
	public interface Answer extends Comment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Apartment")
	@SchemaOrgLabel("Apartment")
	@SchemaOrgComment(""
			+ "An apartment (in American English) or flat (in British English) is a"
			+ " self-contained housing unit (a type of residential real estate) that occupies"
			+ " only part of a building (Source: Wikipedia, the free encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/Apartment\">http://en.wikipedia.org/wiki/Apartment</a>).")
	@CamelizedName("apartment")
	@ConstantizedName("APARTMENT")
	public interface Apartment extends Accommodation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberOfRooms
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfRooms
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * uri: http://schema.org/occupancy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Occupancy
		 */
		public Container.Occupancy getOccupancy();
		public void setOccupancy(Container.Occupancy occupancy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ApartmentComplex")
	@SchemaOrgLabel("ApartmentComplex")
	@SchemaOrgComment("Residence type: Apartment complex.")
	@CamelizedName("apartmentComplex")
	@ConstantizedName("APARTMENT_COMPLEX")
	public interface ApartmentComplex extends Residence, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AppendAction")
	@SchemaOrgLabel("AppendAction")
	@SchemaOrgComment(""
			+ "The act of inserting at the end if an ordered collection.")
	@CamelizedName("appendAction")
	@ConstantizedName("APPEND_ACTION")
	public interface AppendAction extends InsertAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ApplyAction")
	@SchemaOrgLabel("ApplyAction")
	@SchemaOrgComment(""
			+ "<p>The act of registering to an organization/service without the guarantee to"
			+ " receive it.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: Unlike"
			+ " RegisterAction, ApplyAction has no guarantees that the application will be"
			+ " accepted.</li>\n</ul>\n")
	@CamelizedName("applyAction")
	@ConstantizedName("APPLY_ACTION")
	public interface ApplyAction extends OrganizeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Aquarium")
	@SchemaOrgLabel("Aquarium")
	@SchemaOrgComment("Aquarium.")
	@CamelizedName("aquarium")
	@ConstantizedName("AQUARIUM")
	public interface Aquarium extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ArriveAction")
	@SchemaOrgLabel("ArriveAction")
	@SchemaOrgComment(""
			+ "The act of arriving at a place. An agent arrives at a destination from a"
			+ " fromLocation, optionally with participants.")
	@CamelizedName("arriveAction")
	@ConstantizedName("ARRIVE_ACTION")
	public interface ArriveAction extends MoveAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ArtGallery")
	@SchemaOrgLabel("ArtGallery")
	@SchemaOrgComment("An art gallery.")
	@CamelizedName("artGallery")
	@ConstantizedName("ART_GALLERY")
	public interface ArtGallery extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Article")
	@SchemaOrgLabel("Article")
	@SchemaOrgComment(""
			+ "An article, such as a news article or piece of investigative report. Newspapers"
			+ " and magazines have articles of many different types and this is intended to"
			+ " cover them all.</p>\n\n<p>See also <a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog"
			+ " post</a>.")
	@CamelizedName("article")
	@ConstantizedName("ARTICLE")
	public interface Article extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/articleBody
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArticleBody
		 */
		public Container.ArticleBody getArticleBody();
		public void setArticleBody(Container.ArticleBody articleBody);

		/**
		 * uri: http://schema.org/articleSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArticleSection
		 */
		public Container.ArticleSection getArticleSection();
		public void setArticleSection(Container.ArticleSection articleSection);

		/**
		 * uri: http://schema.org/pageEnd
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageEnd
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * uri: http://schema.org/pageStart
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageStart
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * uri: http://schema.org/pagination
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Pagination
		 */
		public Container.Pagination getPagination();
		public void setPagination(Container.Pagination pagination);

		/**
		 * uri: http://schema.org/speakable
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Speakable
		 */
		public Speakable getSpeakable();
		public void setSpeakable(Speakable speakable);

		/**
		 * uri: http://schema.org/wordCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WordCount
		 */
		public Container.WordCount getWordCount();
		public void setWordCount(Container.WordCount wordCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AskAction")
	@SchemaOrgLabel("AskAction")
	@SchemaOrgComment(""
			+ "<p>The act of posing a question / favor to someone.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ReplyAction\">ReplyAction</a>: Appears generally as a"
			+ " response to AskAction.</li>\n</ul>\n")
	@CamelizedName("askAction")
	@ConstantizedName("ASK_ACTION")
	public interface AskAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/question
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Question
		 */
		public Container.Question getQuestion();
		public void setQuestion(Container.Question question);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AssessAction")
	@SchemaOrgLabel("AssessAction")
	@SchemaOrgComment(""
			+ "The act of forming one's opinion, reaction or sentiment.")
	@CamelizedName("assessAction")
	@ConstantizedName("ASSESS_ACTION")
	public interface AssessAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AssignAction")
	@SchemaOrgLabel("AssignAction")
	@SchemaOrgComment(""
			+ "The act of allocating an action/event/task to some destination (someone or"
			+ " something).")
	@CamelizedName("assignAction")
	@ConstantizedName("ASSIGN_ACTION")
	public interface AssignAction extends AllocateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Attorney")
	@SchemaOrgLabel("Attorney")
	@SchemaOrgComment(""
			+ "Professional service: Attorney. </p>\n\n<p>This type is deprecated - <a"
			+ " class=\"localLink\" href=\"http://schema.org/LegalService\">LegalService</a> is"
			+ " more inclusive and less ambiguous.")
	@CamelizedName("attorney")
	@ConstantizedName("ATTORNEY")
	public interface Attorney extends LegalService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Audience")
	@SchemaOrgLabel("Audience")
	@SchemaOrgComment(""
			+ "Intended audience for an item, i.e. the group for whom the item was created.")
	@CamelizedName("audience")
	@ConstantizedName("AUDIENCE")
	public interface Audience extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/audienceType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AudienceType
		 */
		public Container.AudienceType getAudienceType();
		public void setAudienceType(Container.AudienceType audienceType);

		/**
		 * uri: http://schema.org/geographicArea
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GeographicArea
		 */
		public Container.GeographicArea getGeographicArea();
		public void setGeographicArea(Container.GeographicArea geographicArea);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AudioObject")
	@SchemaOrgLabel("AudioObject")
	@SchemaOrgComment("An audio file.")
	@CamelizedName("audioObject")
	@ConstantizedName("AUDIO_OBJECT")
	public interface AudioObject extends MediaObject, SchemaOrgClass {

		/**
		 * uri: http://schema.org/transcript
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Transcript
		 */
		public Container.Transcript getTranscript();
		public void setTranscript(Container.Transcript transcript);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AuthorizeAction")
	@SchemaOrgLabel("AuthorizeAction")
	@SchemaOrgComment(""
			+ "The act of granting permission to an object.")
	@CamelizedName("authorizeAction")
	@ConstantizedName("AUTHORIZE_ACTION")
	public interface AuthorizeAction extends AllocateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoBodyShop")
	@SchemaOrgLabel("AutoBodyShop")
	@SchemaOrgComment("Auto body shop.")
	@CamelizedName("autoBodyShop")
	@ConstantizedName("AUTO_BODY_SHOP")
	public interface AutoBodyShop extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoDealer")
	@SchemaOrgLabel("AutoDealer")
	@SchemaOrgComment("An car dealership.")
	@CamelizedName("autoDealer")
	@ConstantizedName("AUTO_DEALER")
	public interface AutoDealer extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoPartsStore")
	@SchemaOrgLabel("AutoPartsStore")
	@SchemaOrgComment("An auto parts store.")
	@CamelizedName("autoPartsStore")
	@ConstantizedName("AUTO_PARTS_STORE")
	public interface AutoPartsStore extends AutomotiveBusiness, SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoRental")
	@SchemaOrgLabel("AutoRental")
	@SchemaOrgComment("A car rental business.")
	@CamelizedName("autoRental")
	@ConstantizedName("AUTO_RENTAL")
	public interface AutoRental extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoRepair")
	@SchemaOrgLabel("AutoRepair")
	@SchemaOrgComment("Car repair business.")
	@CamelizedName("autoRepair")
	@ConstantizedName("AUTO_REPAIR")
	public interface AutoRepair extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutoWash")
	@SchemaOrgLabel("AutoWash")
	@SchemaOrgComment("A car wash business.")
	@CamelizedName("autoWash")
	@ConstantizedName("AUTO_WASH")
	public interface AutoWash extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutomatedTeller")
	@SchemaOrgLabel("AutomatedTeller")
	@SchemaOrgComment("ATM/cash machine.")
	@CamelizedName("automatedTeller")
	@ConstantizedName("AUTOMATED_TELLER")
	public interface AutomatedTeller extends FinancialService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AutomotiveBusiness")
	@SchemaOrgLabel("AutomotiveBusiness")
	@SchemaOrgComment("Car repair, sales, or parts.")
	@CamelizedName("automotiveBusiness")
	@ConstantizedName("AUTOMOTIVE_BUSINESS")
	public interface AutomotiveBusiness extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Bakery")
	@SchemaOrgLabel("Bakery")
	@SchemaOrgComment("A bakery.")
	@CamelizedName("bakery")
	@ConstantizedName("BAKERY")
	public interface Bakery extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BankAccount")
	@SchemaOrgLabel("BankAccount")
	@SchemaOrgComment(""
			+ "A product or service offered by a bank whereby one may deposit, withdraw or"
			+ " transfer money and in some cases be paid interest.")
	@CamelizedName("bankAccount")
	@ConstantizedName("BANK_ACCOUNT")
	public interface BankAccount extends FinancialProduct, SchemaOrgClass {

		/**
		 * uri: http://schema.org/accountMinimumInflow
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.AccountMinimumInflow
		 */
		public AccountMinimumInflow getAccountMinimumInflow();
		public void setAccountMinimumInflow(AccountMinimumInflow accountMinimumInflow);

		/**
		 * uri: http://schema.org/accountOverdraftLimit
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.AccountOverdraftLimit
		 */
		public AccountOverdraftLimit getAccountOverdraftLimit();
		public void setAccountOverdraftLimit(AccountOverdraftLimit accountOverdraftLimit);

		/**
		 * uri: http://schema.org/bankAccountType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BankAccountType
		 */
		public BankAccountType getBankAccountType();
		public void setBankAccountType(BankAccountType bankAccountType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BankOrCreditUnion")
	@SchemaOrgLabel("BankOrCreditUnion")
	@SchemaOrgComment("Bank or credit union.")
	@CamelizedName("bankOrCreditUnion")
	@ConstantizedName("BANK_OR_CREDIT_UNION")
	public interface BankOrCreditUnion extends FinancialService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BarOrPub")
	@SchemaOrgLabel("BarOrPub")
	@SchemaOrgComment("A bar or pub.")
	@CamelizedName("barOrPub")
	@ConstantizedName("BAR_OR_PUB")
	public interface BarOrPub extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Barcode")
	@SchemaOrgLabel("Barcode")
	@SchemaOrgComment(""
			+ "An image of a visual machine-readable code such as a barcode or QR code.")
	@CamelizedName("barcode")
	@ConstantizedName("BARCODE")
	public interface Barcode extends ImageObject, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Beach")
	@SchemaOrgLabel("Beach")
	@SchemaOrgComment("Beach.")
	@CamelizedName("beach")
	@ConstantizedName("BEACH")
	public interface Beach extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BeautySalon")
	@SchemaOrgLabel("BeautySalon")
	@SchemaOrgComment("Beauty salon.")
	@CamelizedName("beautySalon")
	@ConstantizedName("BEAUTY_SALON")
	public interface BeautySalon extends HealthAndBeautyBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BedAndBreakfast")
	@SchemaOrgLabel("BedAndBreakfast")
	@SchemaOrgComment(""
			+ "Bed and breakfast.\n<br /><br />\nSee also the <a"
			+ " href=\"/docs/hotels.html\">dedicated document on the use of schema.org for"
			+ " marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("bedAndBreakfast")
	@ConstantizedName("BED_AND_BREAKFAST")
	public interface BedAndBreakfast extends LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BedDetails")
	@SchemaOrgLabel("BedDetails")
	@SchemaOrgComment(""
			+ "An entity holding detailed information about the available bed types, e.g. the"
			+ " quantity of twin beds for a hotel room. For the single case of just one bed of"
			+ " a certain type, you can use bed directly with a text. See also <a"
			+ " class=\"localLink\" href=\"http://schema.org/BedType\">BedType</a> (under"
			+ " development).")
	@CamelizedName("bedDetails")
	@ConstantizedName("BED_DETAILS")
	public interface BedDetails extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberOfBeds
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfBeds
		 */
		public Container.NumberOfBeds getNumberOfBeds();
		public void setNumberOfBeds(Container.NumberOfBeds numberOfBeds);

		/**
		 * uri: http://schema.org/typeOfBed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TypeOfBed
		 */
		public Container.TypeOfBed getTypeOfBed();
		public void setTypeOfBed(Container.TypeOfBed typeOfBed);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BefriendAction")
	@SchemaOrgLabel("BefriendAction")
	@SchemaOrgComment(""
			+ "<p>The act of forming a personal connection with someone (object)"
			+ " mutually/bidirectionally/symmetrically.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FollowAction\">FollowAction</a>: Unlike FollowAction,"
			+ " BefriendAction implies that the connection is reciprocal.</li>\n</ul>\n")
	@CamelizedName("befriendAction")
	@ConstantizedName("BEFRIEND_ACTION")
	public interface BefriendAction extends InteractAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BikeStore")
	@SchemaOrgLabel("BikeStore")
	@SchemaOrgComment("A bike store.")
	@CamelizedName("bikeStore")
	@ConstantizedName("BIKE_STORE")
	public interface BikeStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Blog")
	@SchemaOrgLabel("Blog")
	@SchemaOrgComment("A blog.")
	@CamelizedName("blog")
	@ConstantizedName("BLOG")
	public interface Blog extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/blogPost
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BlogPost
		 */
		public Container.BlogPost getBlogPost();
		public void setBlogPost(Container.BlogPost blogPost);

		/**
		 * uri: http://schema.org/issn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Issn
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BlogPosting")
	@SchemaOrgLabel("BlogPosting")
	@SchemaOrgComment("A blog post.")
	@CamelizedName("blogPosting")
	@ConstantizedName("BLOG_POSTING")
	public interface BlogPosting extends SchemaOrgClass, SocialMediaPosting {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BoardingPolicyType")
	@SchemaOrgLabel("BoardingPolicyType")
	@SchemaOrgComment(""
			+ "A type of boarding policy used by an airline.")
	@CamelizedName("boardingPolicyType")
	@ConstantizedName("BOARDING_POLICY_TYPE")
	public interface BoardingPolicyType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BodyOfWater")
	@SchemaOrgLabel("BodyOfWater")
	@SchemaOrgComment(""
			+ "A body of water, such as a sea, ocean, or lake.")
	@CamelizedName("bodyOfWater")
	@ConstantizedName("BODY_OF_WATER")
	public interface BodyOfWater extends Landform, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Book")
	@SchemaOrgLabel("Book")
	@SchemaOrgComment("A book.")
	@CamelizedName("book")
	@ConstantizedName("BOOK")
	public interface Book extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/abridged
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Abridged
		 */
		public Abridged getAbridged();
		public void setAbridged(Abridged abridged);

		/**
		 * uri: http://schema.org/bookEdition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BookEdition
		 */
		public Container.BookEdition getBookEdition();
		public void setBookEdition(Container.BookEdition bookEdition);

		/**
		 * uri: http://schema.org/bookFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BookFormat
		 */
		public Container.BookFormat getBookFormat();
		public void setBookFormat(Container.BookFormat bookFormat);

		/**
		 * uri: http://schema.org/illustrator
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Illustrator
		 */
		public Container.Illustrator getIllustrator();
		public void setIllustrator(Container.Illustrator illustrator);

		/**
		 * uri: http://schema.org/isbn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Isbn
		 */
		public Container.Isbn getIsbn();
		public void setIsbn(Container.Isbn isbn);

		/**
		 * uri: http://schema.org/numberOfPages
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPages
		 */
		public Container.NumberOfPages getNumberOfPages();
		public void setNumberOfPages(Container.NumberOfPages numberOfPages);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BookFormatType")
	@SchemaOrgLabel("BookFormatType")
	@SchemaOrgComment("The publication format of the book.")
	@CamelizedName("bookFormatType")
	@ConstantizedName("BOOK_FORMAT_TYPE")
	public interface BookFormatType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BookSeries")
	@SchemaOrgLabel("BookSeries")
	@SchemaOrgComment(""
			+ "A series of books. Included books can be indicated with the hasPart property.")
	@CamelizedName("bookSeries")
	@ConstantizedName("BOOK_SERIES")
	public interface BookSeries extends CreativeWorkSeries, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BookStore")
	@SchemaOrgLabel("BookStore")
	@SchemaOrgComment("A bookstore.")
	@CamelizedName("bookStore")
	@ConstantizedName("BOOK_STORE")
	public interface BookStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BookmarkAction")
	@SchemaOrgLabel("BookmarkAction")
	@SchemaOrgComment(""
			+ "An agent bookmarks/flags/labels/tags/marks an object.")
	@CamelizedName("bookmarkAction")
	@ConstantizedName("BOOKMARK_ACTION")
	public interface BookmarkAction extends OrganizeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BorrowAction")
	@SchemaOrgLabel("BorrowAction")
	@SchemaOrgComment(""
			+ "<p>The act of obtaining an object under an agreement to return it at a later"
			+ " date. Reciprocal of LendAction.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/LendAction\">LendAction</a>:"
			+ " Reciprocal of BorrowAction.</li>\n</ul>\n")
	@CamelizedName("borrowAction")
	@ConstantizedName("BORROW_ACTION")
	public interface BorrowAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/lender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Lender
		 */
		public Container.Lender getLender();
		public void setLender(Container.Lender lender);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BowlingAlley")
	@SchemaOrgLabel("BowlingAlley")
	@SchemaOrgComment("A bowling alley.")
	@CamelizedName("bowlingAlley")
	@ConstantizedName("BOWLING_ALLEY")
	public interface BowlingAlley extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Brand")
	@SchemaOrgLabel("Brand")
	@SchemaOrgComment(""
			+ "A brand is a name used by an organization or business person for labeling a"
			+ " product, product group, or similar.")
	@CamelizedName("brand")
	@ConstantizedName("BRAND")
	public interface Brand extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/logo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Logo
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BreadcrumbList")
	@SchemaOrgLabel("BreadcrumbList")
	@SchemaOrgComment(""
			+ "A BreadcrumbList is an ItemList consisting of a chain of linked Web pages,"
			+ " typically described using at least their URL and their name, and typically"
			+ " ending with the current page.</p>\n\n<p>The <a class=\"localLink\""
			+ " href=\"http://schema.org/position\">position</a> property is used to"
			+ " reconstruct the order of the items in a BreadcrumbList The convention is that a"
			+ " breadcrumb list has an <a class=\"localLink\""
			+ " href=\"http://schema.org/itemListOrder\">itemListOrder</a> of <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/ItemListOrderAscending\">ItemListOrderAscending</a>"
			+ " (lower values listed first), and that the first items in this list correspond"
			+ " to the \"top\" or beginning of the breadcrumb trail, e.g. with a site or"
			+ " section homepage. The specific values of 'position' are not assigned meaning"
			+ " for a BreadcrumbList, but they should be integers, e.g. beginning with '1' for"
			+ " the first item in the list.")
	@CamelizedName("breadcrumbList")
	@ConstantizedName("BREADCRUMB_LIST")
	public interface BreadcrumbList extends ItemList, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Brewery")
	@SchemaOrgLabel("Brewery")
	@SchemaOrgComment("Brewery.")
	@CamelizedName("brewery")
	@ConstantizedName("BREWERY")
	public interface Brewery extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Bridge")
	@SchemaOrgLabel("Bridge")
	@SchemaOrgComment("A bridge.")
	@CamelizedName("bridge")
	@ConstantizedName("BRIDGE")
	public interface Bridge extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BroadcastChannel")
	@SchemaOrgLabel("BroadcastChannel")
	@SchemaOrgComment(""
			+ "A unique instance of a BroadcastService on a CableOrSatelliteService lineup.")
	@CamelizedName("broadcastChannel")
	@ConstantizedName("BROADCAST_CHANNEL")
	public interface BroadcastChannel extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/broadcastChannelId
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastChannelId
		 */
		public Container.BroadcastChannelId getBroadcastChannelId();
		public void setBroadcastChannelId(Container.BroadcastChannelId broadcastChannelId);

		/**
		 * uri: http://schema.org/broadcastFrequency
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BroadcastFrequency
		 */
		public BroadcastFrequency getBroadcastFrequency();
		public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency);

		/**
		 * uri: http://schema.org/broadcastServiceTier
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastServiceTier
		 */
		public Container.BroadcastServiceTier getBroadcastServiceTier();
		public void setBroadcastServiceTier(Container.BroadcastServiceTier broadcastServiceTier);

		/**
		 * uri: http://schema.org/genre
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Genre
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * uri: http://schema.org/inBroadcastLineup
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InBroadcastLineup
		 */
		public Container.InBroadcastLineup getInBroadcastLineup();
		public void setInBroadcastLineup(Container.InBroadcastLineup inBroadcastLineup);

		/**
		 * uri: http://schema.org/providesBroadcastService
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProvidesBroadcastService
		 */
		public Container.ProvidesBroadcastService getProvidesBroadcastService();
		public void setProvidesBroadcastService(Container.ProvidesBroadcastService providesBroadcastService);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BroadcastEvent")
	@SchemaOrgLabel("BroadcastEvent")
	@SchemaOrgComment(""
			+ "An over the air or online broadcast event.")
	@CamelizedName("broadcastEvent")
	@ConstantizedName("BROADCAST_EVENT")
	public interface BroadcastEvent extends PublicationEvent, SchemaOrgClass {

		/**
		 * uri: http://schema.org/broadcastOfEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastOfEvent
		 */
		public Container.BroadcastOfEvent getBroadcastOfEvent();
		public void setBroadcastOfEvent(Container.BroadcastOfEvent broadcastOfEvent);

		/**
		 * uri: http://schema.org/isLiveBroadcast
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsLiveBroadcast
		 */
		public Container.IsLiveBroadcast getIsLiveBroadcast();
		public void setIsLiveBroadcast(Container.IsLiveBroadcast isLiveBroadcast);

		/**
		 * uri: http://schema.org/videoFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VideoFormat
		 */
		public Container.VideoFormat getVideoFormat();
		public void setVideoFormat(Container.VideoFormat videoFormat);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BroadcastService")
	@SchemaOrgLabel("BroadcastService")
	@SchemaOrgComment(""
			+ "A delivery service through which content is provided via broadcast over the air"
			+ " or online.")
	@CamelizedName("broadcastService")
	@ConstantizedName("BROADCAST_SERVICE")
	public interface BroadcastService extends SchemaOrgClass, Service {

		/**
		 * uri: http://schema.org/broadcastAffiliateOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastAffiliateOf
		 */
		public Container.BroadcastAffiliateOf getBroadcastAffiliateOf();
		public void setBroadcastAffiliateOf(Container.BroadcastAffiliateOf broadcastAffiliateOf);

		/**
		 * uri: http://schema.org/broadcastDisplayName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastDisplayName
		 */
		public Container.BroadcastDisplayName getBroadcastDisplayName();
		public void setBroadcastDisplayName(Container.BroadcastDisplayName broadcastDisplayName);

		/**
		 * uri: http://schema.org/broadcastFrequency
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.BroadcastFrequency
		 */
		public BroadcastFrequency getBroadcastFrequency();
		public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency);

		/**
		 * uri: http://schema.org/broadcastTimezone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BroadcastTimezone
		 */
		public Container.BroadcastTimezone getBroadcastTimezone();
		public void setBroadcastTimezone(Container.BroadcastTimezone broadcastTimezone);

		/**
		 * uri: http://schema.org/broadcaster
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Broadcaster
		 */
		public Container.Broadcaster getBroadcaster();
		public void setBroadcaster(Container.Broadcaster broadcaster);

		/**
		 * uri: http://schema.org/hasBroadcastChannel
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HasBroadcastChannel
		 */
		public HasBroadcastChannel getHasBroadcastChannel();
		public void setHasBroadcastChannel(HasBroadcastChannel hasBroadcastChannel);

		/**
		 * uri: http://schema.org/parentService
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ParentService
		 */
		public Container.ParentService getParentService();
		public void setParentService(Container.ParentService parentService);

		/**
		 * uri: http://schema.org/videoFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VideoFormat
		 */
		public Container.VideoFormat getVideoFormat();
		public void setVideoFormat(Container.VideoFormat videoFormat);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BuddhistTemple")
	@SchemaOrgLabel("BuddhistTemple")
	@SchemaOrgComment("A Buddhist temple.")
	@CamelizedName("buddhistTemple")
	@ConstantizedName("BUDDHIST_TEMPLE")
	public interface BuddhistTemple extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusReservation")
	@SchemaOrgLabel("BusReservation")
	@SchemaOrgComment(""
			+ "A reservation for bus travel. </p>\n\n<p>Note: This type is for information"
			+ " about actual reservations, e.g. in confirmation emails or HTML pages with"
			+ " individual confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("busReservation")
	@ConstantizedName("BUS_RESERVATION")
	public interface BusReservation extends Reservation, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusStation")
	@SchemaOrgLabel("BusStation")
	@SchemaOrgComment("A bus station.")
	@CamelizedName("busStation")
	@ConstantizedName("BUS_STATION")
	public interface BusStation extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusStop")
	@SchemaOrgLabel("BusStop")
	@SchemaOrgComment("A bus stop.")
	@CamelizedName("busStop")
	@ConstantizedName("BUS_STOP")
	public interface BusStop extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusTrip")
	@SchemaOrgLabel("BusTrip")
	@SchemaOrgComment("A trip on a commercial bus line.")
	@CamelizedName("busTrip")
	@ConstantizedName("BUS_TRIP")
	public interface BusTrip extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/arrivalBusStop
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalBusStop
		 */
		public Container.ArrivalBusStop getArrivalBusStop();
		public void setArrivalBusStop(Container.ArrivalBusStop arrivalBusStop);

		/**
		 * uri: http://schema.org/arrivalTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTime
		 */
		public Container.ArrivalTime getArrivalTime();
		public void setArrivalTime(Container.ArrivalTime arrivalTime);

		/**
		 * uri: http://schema.org/busName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BusName
		 */
		public Container.BusName getBusName();
		public void setBusName(Container.BusName busName);

		/**
		 * uri: http://schema.org/busNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BusNumber
		 */
		public Container.BusNumber getBusNumber();
		public void setBusNumber(Container.BusNumber busNumber);

		/**
		 * uri: http://schema.org/departureBusStop
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureBusStop
		 */
		public Container.DepartureBusStop getDepartureBusStop();
		public void setDepartureBusStop(Container.DepartureBusStop departureBusStop);

		/**
		 * uri: http://schema.org/departureTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureTime
		 */
		public Container.DepartureTime getDepartureTime();
		public void setDepartureTime(Container.DepartureTime departureTime);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusinessAudience")
	@SchemaOrgLabel("BusinessAudience")
	@SchemaOrgComment(""
			+ "A set of characteristics belonging to businesses, e.g. who compose an item's"
			+ " target audience.")
	@CamelizedName("businessAudience")
	@ConstantizedName("BUSINESS_AUDIENCE")
	public interface BusinessAudience extends Audience, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberOfEmployees
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEmployees
		 */
		public Container.NumberOfEmployees getNumberOfEmployees();
		public void setNumberOfEmployees(Container.NumberOfEmployees numberOfEmployees);

		/**
		 * uri: http://schema.org/yearlyRevenue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.YearlyRevenue
		 */
		public Container.YearlyRevenue getYearlyRevenue();
		public void setYearlyRevenue(Container.YearlyRevenue yearlyRevenue);

		/**
		 * uri: http://schema.org/yearsInOperation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.YearsInOperation
		 */
		public Container.YearsInOperation getYearsInOperation();
		public void setYearsInOperation(Container.YearsInOperation yearsInOperation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusinessEntityType")
	@SchemaOrgLabel("BusinessEntityType")
	@SchemaOrgComment(""
			+ "<p>A business entity type is a conceptual entity representing the legal form,"
			+ " the size, the main line of business, the position in the value chain, or any"
			+ " combination thereof, of an organization or business person.</p>\n\n<p>Commonly"
			+ " used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#Business</li>\n<li>http://purl.org/goodrelations/v1#Enduser</li>\n<li>http://purl.org/goodrelations/v1#PublicInstitution</li>\n<li>http://purl.org/goodrelations/v1#Reseller</li>\n</ul>\n")
	@CamelizedName("businessEntityType")
	@ConstantizedName("BUSINESS_ENTITY_TYPE")
	public interface BusinessEntityType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusinessEvent")
	@SchemaOrgLabel("BusinessEvent")
	@SchemaOrgComment("Event type: Business event.")
	@CamelizedName("businessEvent")
	@ConstantizedName("BUSINESS_EVENT")
	public interface BusinessEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BusinessFunction")
	@SchemaOrgLabel("BusinessFunction")
	@SchemaOrgComment(""
			+ "<p>The business function specifies the type of activity or access (i.e., the"
			+ " bundle of rights) offered by the organization or business person through the"
			+ " offer. Typical are sell, rental or lease, maintenance or repair, manufacture /"
			+ " produce, recycle / dispose, engineering / construction, or installation."
			+ " Proprietary specifications of access rights are also instances of this"
			+ " class.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#ConstructionInstallation</li>\n<li>http://purl.org/goodrelations/v1#Dispose</li>\n<li>http://purl.org/goodrelations/v1#LeaseOut</li>\n<li>http://purl.org/goodrelations/v1#Maintain</li>\n<li>http://purl.org/goodrelations/v1#ProvideService</li>\n<li>http://purl.org/goodrelations/v1#Repair</li>\n<li>http://purl.org/goodrelations/v1#Sell</li>\n<li>http://purl.org/goodrelations/v1#Buy</li>\n</ul>\n")
	@CamelizedName("businessFunction")
	@ConstantizedName("BUSINESS_FUNCTION")
	public interface BusinessFunction extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BuyAction")
	@SchemaOrgLabel("BuyAction")
	@SchemaOrgComment(""
			+ "The act of giving money to a seller in exchange for goods or services rendered."
			+ " An agent buys an object, product, or service from a seller for a price."
			+ " Reciprocal of SellAction.")
	@CamelizedName("buyAction")
	@ConstantizedName("BUY_ACTION")
	public interface BuyAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/seller
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seller
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CableOrSatelliteService")
	@SchemaOrgLabel("CableOrSatelliteService")
	@SchemaOrgComment(""
			+ "A service which provides access to media programming like TV or radio. Access"
			+ " may be via cable or satellite.")
	@CamelizedName("cableOrSatelliteService")
	@ConstantizedName("CABLE_OR_SATELLITE_SERVICE")
	public interface CableOrSatelliteService extends SchemaOrgClass, Service {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CafeOrCoffeeShop")
	@SchemaOrgLabel("CafeOrCoffeeShop")
	@SchemaOrgComment("A cafe or coffee shop.")
	@CamelizedName("cafeOrCoffeeShop")
	@ConstantizedName("CAFE_OR_COFFEE_SHOP")
	public interface CafeOrCoffeeShop extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Campground")
	@SchemaOrgLabel("Campground")
	@SchemaOrgComment(""
			+ "A camping site, campsite, or campground is a place used for overnight stay in"
			+ " the outdoors. In British English a campsite is an area, usually divided into a"
			+ " number of pitches, where people can camp overnight using tents or camper vans"
			+ " or caravans; this British English use of the word is synonymous with the"
			+ " American English expression campground. In American English the term campsite"
			+ " generally means an area where an individual, family, group, or military unit"
			+ " can pitch a tent or parks a camper; a campground may contain many campsites"
			+ " (Source: Wikipedia, the free encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/Campsite\">http://en.wikipedia.org/wiki/Campsite</a>).\n<br"
			+ " /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the"
			+ " use of schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("campground")
	@ConstantizedName("CAMPGROUND")
	public interface Campground extends CivicStructure, LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CampingPitch")
	@SchemaOrgLabel("CampingPitch")
	@SchemaOrgComment(""
			+ "A camping pitch is an individual place for overnight stay in the outdoors,"
			+ " typically being part of a larger camping site.\n<br /><br />\nSee also the <a"
			+ " href=\"/docs/hotels.html\">dedicated document on the use of schema.org for"
			+ " marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("campingPitch")
	@ConstantizedName("CAMPING_PITCH")
	public interface CampingPitch extends Accommodation, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Canal")
	@SchemaOrgLabel("Canal")
	@SchemaOrgComment("A canal, like the Panama Canal.")
	@CamelizedName("canal")
	@ConstantizedName("CANAL")
	public interface Canal extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CancelAction")
	@SchemaOrgLabel("CancelAction")
	@SchemaOrgComment(""
			+ "<p>The act of asserting that a future event/action is no longer going to"
			+ " happen.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ConfirmAction\">ConfirmAction</a>: The antonym of"
			+ " CancelAction.</li>\n</ul>\n")
	@CamelizedName("cancelAction")
	@ConstantizedName("CANCEL_ACTION")
	public interface CancelAction extends PlanAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Car")
	@SchemaOrgLabel("Car")
	@SchemaOrgComment(""
			+ "A car is a wheeled, self-powered motor vehicle used for transportation.")
	@CamelizedName("car")
	@ConstantizedName("CAR")
	public interface Car extends SchemaOrgClass, Vehicle {

		/**
		 * uri: http://schema.org/acrissCode
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.AcrissCode
		 */
		public AcrissCode getAcrissCode();
		public void setAcrissCode(AcrissCode acrissCode);

		/**
		 * uri: http://schema.org/roofLoad
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.RoofLoad
		 */
		public RoofLoad getRoofLoad();
		public void setRoofLoad(RoofLoad roofLoad);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Casino")
	@SchemaOrgLabel("Casino")
	@SchemaOrgComment("A casino.")
	@CamelizedName("casino")
	@ConstantizedName("CASINO")
	public interface Casino extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CatholicChurch")
	@SchemaOrgLabel("CatholicChurch")
	@SchemaOrgComment("A Catholic church.")
	@CamelizedName("catholicChurch")
	@ConstantizedName("CATHOLIC_CHURCH")
	public interface CatholicChurch extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Cemetery")
	@SchemaOrgLabel("Cemetery")
	@SchemaOrgComment("A graveyard.")
	@CamelizedName("cemetery")
	@ConstantizedName("CEMETERY")
	public interface Cemetery extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CheckAction")
	@SchemaOrgLabel("CheckAction")
	@SchemaOrgComment(""
			+ "An agent inspects, determines, investigates, inquires, or examines an object's"
			+ " accuracy, quality, condition, or state.")
	@CamelizedName("checkAction")
	@ConstantizedName("CHECK_ACTION")
	public interface CheckAction extends FindAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CheckInAction")
	@SchemaOrgLabel("CheckInAction")
	@SchemaOrgComment(""
			+ "<p>The act of an agent communicating (service provider, social media, etc) their"
			+ " arrival by registering/confirming for a previously reserved service (e.g."
			+ " flight check in) or at a place (e.g. hotel), possibly resulting in a result"
			+ " (boarding pass, etc).</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/CheckOutAction\">CheckOutAction</a>: The antonym of"
			+ " CheckInAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ArriveAction\">ArriveAction</a>: Unlike ArriveAction,"
			+ " CheckInAction implies that the agent is informing/confirming the start of a"
			+ " previously reserved service.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ConfirmAction\">ConfirmAction</a>: Unlike"
			+ " ConfirmAction, CheckInAction implies that the agent is informing/confirming the"
			+ " <em>start</em> of a previously reserved service rather than its"
			+ " validity/existence.</li>\n</ul>\n")
	@CamelizedName("checkInAction")
	@ConstantizedName("CHECK_IN_ACTION")
	public interface CheckInAction extends CommunicateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CheckOutAction")
	@SchemaOrgLabel("CheckOutAction")
	@SchemaOrgComment(""
			+ "<p>The act of an agent communicating (service provider, social media, etc) their"
			+ " departure of a previously reserved service (e.g. flight check in) or place"
			+ " (e.g. hotel).</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/CheckInAction\">CheckInAction</a>:"
			+ " The antonym of CheckOutAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/DepartAction\">DepartAction</a>: Unlike DepartAction,"
			+ " CheckOutAction implies that the agent is informing/confirming the end of a"
			+ " previously reserved service.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/CancelAction\">CancelAction</a>: Unlike CancelAction,"
			+ " CheckOutAction implies that the agent is informing/confirming the end of a"
			+ " previously reserved service.</li>\n</ul>\n")
	@CamelizedName("checkOutAction")
	@ConstantizedName("CHECK_OUT_ACTION")
	public interface CheckOutAction extends CommunicateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CheckoutPage")
	@SchemaOrgLabel("CheckoutPage")
	@SchemaOrgComment("Web page type: Checkout page.")
	@CamelizedName("checkoutPage")
	@ConstantizedName("CHECKOUT_PAGE")
	public interface CheckoutPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ChildCare")
	@SchemaOrgLabel("ChildCare")
	@SchemaOrgComment("A Childcare center.")
	@CamelizedName("childCare")
	@ConstantizedName("CHILD_CARE")
	public interface ChildCare extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ChildrensEvent")
	@SchemaOrgLabel("ChildrensEvent")
	@SchemaOrgComment("Event type: Children's event.")
	@CamelizedName("childrensEvent")
	@ConstantizedName("CHILDRENS_EVENT")
	public interface ChildrensEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ChooseAction")
	@SchemaOrgLabel("ChooseAction")
	@SchemaOrgComment(""
			+ "The act of expressing a preference from a set of options or a large or unbounded"
			+ " set of choices/options.")
	@CamelizedName("chooseAction")
	@ConstantizedName("CHOOSE_ACTION")
	public interface ChooseAction extends AssessAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actionOption
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ActionOption
		 */
		public Container.ActionOption getActionOption();
		public void setActionOption(Container.ActionOption actionOption);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Church")
	@SchemaOrgLabel("Church")
	@SchemaOrgComment("A church.")
	@CamelizedName("church")
	@ConstantizedName("CHURCH")
	public interface Church extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/City")
	@SchemaOrgLabel("City")
	@SchemaOrgComment("A city or town.")
	@CamelizedName("city")
	@ConstantizedName("CITY")
	public interface City extends AdministrativeArea, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CityHall")
	@SchemaOrgLabel("CityHall")
	@SchemaOrgComment("A city hall.")
	@CamelizedName("cityHall")
	@ConstantizedName("CITY_HALL")
	public interface CityHall extends GovernmentBuilding, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CivicStructure")
	@SchemaOrgLabel("CivicStructure")
	@SchemaOrgComment(""
			+ "A public structure, such as a town hall or concert hall.")
	@CamelizedName("civicStructure")
	@ConstantizedName("CIVIC_STRUCTURE")
	public interface CivicStructure extends Place, SchemaOrgClass {

		/**
		 * uri: http://schema.org/openingHours
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OpeningHours
		 */
		public Container.OpeningHours getOpeningHours();
		public void setOpeningHours(Container.OpeningHours openingHours);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ClaimReview")
	@SchemaOrgLabel("ClaimReview")
	@SchemaOrgComment(""
			+ "A fact-checking review of claims made (or reported) in some creative work"
			+ " (referenced via itemReviewed).")
	@CamelizedName("claimReview")
	@ConstantizedName("CLAIM_REVIEW")
	public interface ClaimReview extends Review, SchemaOrgClass {

		/**
		 * uri: http://schema.org/claimReviewed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ClaimReviewed
		 */
		public Container.ClaimReviewed getClaimReviewed();
		public void setClaimReviewed(Container.ClaimReviewed claimReviewed);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Clip")
	@SchemaOrgLabel("Clip")
	@SchemaOrgComment(""
			+ "A short TV or radio program or a segment/part of a program.")
	@CamelizedName("clip")
	@ConstantizedName("CLIP")
	public interface Clip extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/clipNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ClipNumber
		 */
		public Container.ClipNumber getClipNumber();
		public void setClipNumber(Container.ClipNumber clipNumber);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/partOfEpisode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfEpisode
		 */
		public Container.PartOfEpisode getPartOfEpisode();
		public void setPartOfEpisode(Container.PartOfEpisode partOfEpisode);

		/**
		 * uri: http://schema.org/partOfSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeason
		 */
		public Container.PartOfSeason getPartOfSeason();
		public void setPartOfSeason(Container.PartOfSeason partOfSeason);

		/**
		 * uri: http://schema.org/partOfSeries
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeries
		 */
		public Container.PartOfSeries getPartOfSeries();
		public void setPartOfSeries(Container.PartOfSeries partOfSeries);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ClothingStore")
	@SchemaOrgLabel("ClothingStore")
	@SchemaOrgComment("A clothing store.")
	@CamelizedName("clothingStore")
	@ConstantizedName("CLOTHING_STORE")
	public interface ClothingStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CollectionPage")
	@SchemaOrgLabel("CollectionPage")
	@SchemaOrgComment("Web page type: Collection page.")
	@CamelizedName("collectionPage")
	@ConstantizedName("COLLECTION_PAGE")
	public interface CollectionPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CollegeOrUniversity")
	@SchemaOrgLabel("CollegeOrUniversity")
	@SchemaOrgComment(""
			+ "A college, university, or other third-level educational institution.")
	@CamelizedName("collegeOrUniversity")
	@ConstantizedName("COLLEGE_OR_UNIVERSITY")
	public interface CollegeOrUniversity extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComedyClub")
	@SchemaOrgLabel("ComedyClub")
	@SchemaOrgComment("A comedy club.")
	@CamelizedName("comedyClub")
	@ConstantizedName("COMEDY_CLUB")
	public interface ComedyClub extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComedyEvent")
	@SchemaOrgLabel("ComedyEvent")
	@SchemaOrgComment("Event type: Comedy event.")
	@CamelizedName("comedyEvent")
	@ConstantizedName("COMEDY_EVENT")
	public interface ComedyEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Comment")
	@SchemaOrgLabel("Comment")
	@SchemaOrgComment(""
			+ "A comment on an item - for example, a comment on a blog post. The comment's"
			+ " content is expressed via the <a class=\"localLink\""
			+ " href=\"http://schema.org/text\">text</a> property, and its topic via <a"
			+ " class=\"localLink\" href=\"http://schema.org/about\">about</a>, properties"
			+ " shared with all CreativeWorks.")
	@CamelizedName("comment")
	@ConstantizedName("COMMENT")
	public interface Comment extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/downvoteCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DownvoteCount
		 */
		public Container.DownvoteCount getDownvoteCount();
		public void setDownvoteCount(Container.DownvoteCount downvoteCount);

		/**
		 * uri: http://schema.org/parentItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ParentItem
		 */
		public Container.ParentItem getParentItem();
		public void setParentItem(Container.ParentItem parentItem);

		/**
		 * uri: http://schema.org/upvoteCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UpvoteCount
		 */
		public Container.UpvoteCount getUpvoteCount();
		public void setUpvoteCount(Container.UpvoteCount upvoteCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CommentAction")
	@SchemaOrgLabel("CommentAction")
	@SchemaOrgComment(""
			+ "The act of generating a comment about a subject.")
	@CamelizedName("commentAction")
	@ConstantizedName("COMMENT_ACTION")
	public interface CommentAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/resultComment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ResultComment
		 */
		public Container.ResultComment getResultComment();
		public void setResultComment(Container.ResultComment resultComment);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CommunicateAction")
	@SchemaOrgLabel("CommunicateAction")
	@SchemaOrgComment(""
			+ "The act of conveying information to another person via a communication medium"
			+ " (instrument) such as speech, email, or telephone conversation.")
	@CamelizedName("communicateAction")
	@ConstantizedName("COMMUNICATE_ACTION")
	public interface CommunicateAction extends InteractAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/about
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.About
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * uri: http://schema.org/inLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InLanguage
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CompoundPriceSpecification")
	@SchemaOrgLabel("CompoundPriceSpecification")
	@SchemaOrgComment(""
			+ "A compound price specification is one that bundles multiple prices that all"
			+ " apply in combination for different dimensions of consumption. Use the name"
			+ " property of the attached unit price specification for indicating the dimension"
			+ " of a price component (e.g. \"electricity\" or \"final cleaning\").")
	@CamelizedName("compoundPriceSpecification")
	@ConstantizedName("COMPOUND_PRICE_SPECIFICATION")
	public interface CompoundPriceSpecification extends PriceSpecification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/priceComponent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceComponent
		 */
		public Container.PriceComponent getPriceComponent();
		public void setPriceComponent(Container.PriceComponent priceComponent);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComputerLanguage")
	@SchemaOrgLabel("ComputerLanguage")
	@SchemaOrgComment(""
			+ "This type covers computer programming languages such as Scheme and Lisp, as well"
			+ " as other language-like computer representations. Natural languages are best"
			+ " represented with the <a class=\"localLink\""
			+ " href=\"http://schema.org/Language\">Language</a> type.")
	@CamelizedName("computerLanguage")
	@ConstantizedName("COMPUTER_LANGUAGE")
	public interface ComputerLanguage extends Intangible, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ComputerStore")
	@SchemaOrgLabel("ComputerStore")
	@SchemaOrgComment("A computer store.")
	@CamelizedName("computerStore")
	@ConstantizedName("COMPUTER_STORE")
	public interface ComputerStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ConfirmAction")
	@SchemaOrgLabel("ConfirmAction")
	@SchemaOrgComment(""
			+ "<p>The act of notifying someone that a future event/action is going to happen as"
			+ " expected.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/CancelAction\">CancelAction</a>: The antonym of"
			+ " ConfirmAction.</li>\n</ul>\n")
	@CamelizedName("confirmAction")
	@ConstantizedName("CONFIRM_ACTION")
	public interface ConfirmAction extends InformAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ConsumeAction")
	@SchemaOrgLabel("ConsumeAction")
	@SchemaOrgComment(""
			+ "The act of ingesting information/resources/food.")
	@CamelizedName("consumeAction")
	@ConstantizedName("CONSUME_ACTION")
	public interface ConsumeAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/expectsAcceptanceOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExpectsAcceptanceOf
		 */
		public Container.ExpectsAcceptanceOf getExpectsAcceptanceOf();
		public void setExpectsAcceptanceOf(Container.ExpectsAcceptanceOf expectsAcceptanceOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ContactPage")
	@SchemaOrgLabel("ContactPage")
	@SchemaOrgComment("Web page type: Contact page.")
	@CamelizedName("contactPage")
	@ConstantizedName("CONTACT_PAGE")
	public interface ContactPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ContactPoint")
	@SchemaOrgLabel("ContactPoint")
	@SchemaOrgComment(""
			+ "A contact point&#x2014;for example, a Customer Complaints department.")
	@CamelizedName("contactPoint")
	@ConstantizedName("CONTACT_POINT")
	public interface ContactPoint extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/availableLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableLanguage
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * uri: http://schema.org/contactOption
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContactOption
		 */
		public Container.ContactOption getContactOption();
		public void setContactOption(Container.ContactOption contactOption);

		/**
		 * uri: http://schema.org/contactType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContactType
		 */
		public Container.ContactType getContactType();
		public void setContactType(Container.ContactType contactType);

		/**
		 * uri: http://schema.org/email
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Email
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * uri: http://schema.org/faxNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * uri: http://schema.org/hoursAvailable
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HoursAvailable
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * uri: http://schema.org/productSupported
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductSupported
		 */
		public Container.ProductSupported getProductSupported();
		public void setProductSupported(Container.ProductSupported productSupported);

		/**
		 * uri: http://schema.org/telephone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Telephone
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ContactPointOption")
	@SchemaOrgLabel("ContactPointOption")
	@SchemaOrgComment(""
			+ "Enumerated options related to a ContactPoint.")
	@CamelizedName("contactPointOption")
	@ConstantizedName("CONTACT_POINT_OPTION")
	public interface ContactPointOption extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Continent")
	@SchemaOrgLabel("Continent")
	@SchemaOrgComment(""
			+ "One of the continents (for example, Europe or Africa).")
	@CamelizedName("continent")
	@ConstantizedName("CONTINENT")
	public interface Continent extends Landform, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ControlAction")
	@SchemaOrgLabel("ControlAction")
	@SchemaOrgComment(""
			+ "An agent controls a device or application.")
	@CamelizedName("controlAction")
	@ConstantizedName("CONTROL_ACTION")
	public interface ControlAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ConvenienceStore")
	@SchemaOrgLabel("ConvenienceStore")
	@SchemaOrgComment("A convenience store.")
	@CamelizedName("convenienceStore")
	@ConstantizedName("CONVENIENCE_STORE")
	public interface ConvenienceStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Conversation")
	@SchemaOrgLabel("Conversation")
	@SchemaOrgComment(""
			+ "One or more messages between organizations or people on a particular topic."
			+ " Individual messages can be linked to the conversation with isPartOf or hasPart"
			+ " properties.")
	@CamelizedName("conversation")
	@ConstantizedName("CONVERSATION")
	public interface Conversation extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CookAction")
	@SchemaOrgLabel("CookAction")
	@SchemaOrgComment("The act of producing/preparing food.")
	@CamelizedName("cookAction")
	@ConstantizedName("COOK_ACTION")
	public interface CookAction extends CreateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/foodEstablishment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FoodEstablishment
		 */
		public Container.FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(Container.FoodEstablishment foodEstablishment);

		/**
		 * uri: http://schema.org/foodEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FoodEvent
		 */
		public Container.FoodEvent getFoodEvent();
		public void setFoodEvent(Container.FoodEvent foodEvent);

		/**
		 * uri: http://schema.org/recipe
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipe
		 */
		public Container.Recipe getRecipe();
		public void setRecipe(Container.Recipe recipe);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Corporation")
	@SchemaOrgLabel("Corporation")
	@SchemaOrgComment("Organization: A business corporation.")
	@CamelizedName("corporation")
	@ConstantizedName("CORPORATION")
	public interface Corporation extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/tickerSymbol
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TickerSymbol
		 */
		public Container.TickerSymbol getTickerSymbol();
		public void setTickerSymbol(Container.TickerSymbol tickerSymbol);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Country")
	@SchemaOrgLabel("Country")
	@SchemaOrgComment("A country.")
	@CamelizedName("country")
	@ConstantizedName("COUNTRY")
	public interface Country extends AdministrativeArea, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Course")
	@SchemaOrgLabel("Course")
	@SchemaOrgComment(""
			+ "A description of an educational course which may be offered as distinct"
			+ " instances at which take place at different times or take place at different"
			+ " locations, or be offered through different media or modes of study. An"
			+ " educational course is a sequence of one or more educational events and/or"
			+ " creative works which aims to build knowledge, competence or ability of"
			+ " learners.")
	@CamelizedName("course")
	@ConstantizedName("COURSE")
	public interface Course extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/courseCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CourseCode
		 */
		public Container.CourseCode getCourseCode();
		public void setCourseCode(Container.CourseCode courseCode);

		/**
		 * uri: http://schema.org/coursePrerequisites
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CoursePrerequisites
		 */
		public Container.CoursePrerequisites getCoursePrerequisites();
		public void setCoursePrerequisites(Container.CoursePrerequisites coursePrerequisites);

		/**
		 * uri: http://schema.org/educationalCredentialAwarded
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EducationalCredentialAwarded
		 */
		public EducationalCredentialAwarded getEducationalCredentialAwarded();
		public void setEducationalCredentialAwarded(EducationalCredentialAwarded educationalCredentialAwarded);

		/**
		 * uri: http://schema.org/hasCourseInstance
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasCourseInstance
		 */
		public Container.HasCourseInstance getHasCourseInstance();
		public void setHasCourseInstance(Container.HasCourseInstance hasCourseInstance);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CourseInstance")
	@SchemaOrgLabel("CourseInstance")
	@SchemaOrgComment(""
			+ "An instance of a <a class=\"localLink\""
			+ " href=\"http://schema.org/Course\">Course</a> which is distinct from other"
			+ " instances because it is offered at a different time or location or through"
			+ " different media or modes of study or to a specific section of students.")
	@CamelizedName("courseInstance")
	@ConstantizedName("COURSE_INSTANCE")
	public interface CourseInstance extends Event, SchemaOrgClass {

		/**
		 * uri: http://schema.org/courseMode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CourseMode
		 */
		public Container.CourseMode getCourseMode();
		public void setCourseMode(Container.CourseMode courseMode);

		/**
		 * uri: http://schema.org/instructor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Instructor
		 */
		public Container.Instructor getInstructor();
		public void setInstructor(Container.Instructor instructor);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Courthouse")
	@SchemaOrgLabel("Courthouse")
	@SchemaOrgComment("A courthouse.")
	@CamelizedName("courthouse")
	@ConstantizedName("COURTHOUSE")
	public interface Courthouse extends GovernmentBuilding, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CreateAction")
	@SchemaOrgLabel("CreateAction")
	@SchemaOrgComment(""
			+ "The act of deliberately creating/producing/generating/building a result out of"
			+ " the agent.")
	@CamelizedName("createAction")
	@ConstantizedName("CREATE_ACTION")
	public interface CreateAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CreativeWork")
	@SchemaOrgLabel("CreativeWork")
	@SchemaOrgComment(""
			+ "The most generic kind of creative work, including books, movies, photographs,"
			+ " software programs, etc.")
	@CamelizedName("creativeWork")
	@ConstantizedName("CREATIVE_WORK")
	public interface CreativeWork extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/about
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.About
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * uri: http://schema.org/accessMode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessMode
		 */
		public Container.AccessMode getAccessMode();
		public void setAccessMode(Container.AccessMode accessMode);

		/**
		 * uri: http://schema.org/accessModeSufficient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessModeSufficient
		 */
		public Container.AccessModeSufficient getAccessModeSufficient();
		public void setAccessModeSufficient(Container.AccessModeSufficient accessModeSufficient);

		/**
		 * uri: http://schema.org/accessibilityAPI
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityAPI
		 */
		public Container.AccessibilityAPI getAccessibilityAPI();
		public void setAccessibilityAPI(Container.AccessibilityAPI accessibilityAPI);

		/**
		 * uri: http://schema.org/accessibilityControl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityControl
		 */
		public Container.AccessibilityControl getAccessibilityControl();
		public void setAccessibilityControl(Container.AccessibilityControl accessibilityControl);

		/**
		 * uri: http://schema.org/accessibilityFeature
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityFeature
		 */
		public Container.AccessibilityFeature getAccessibilityFeature();
		public void setAccessibilityFeature(Container.AccessibilityFeature accessibilityFeature);

		/**
		 * uri: http://schema.org/accessibilityHazard
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessibilityHazard
		 */
		public Container.AccessibilityHazard getAccessibilityHazard();
		public void setAccessibilityHazard(Container.AccessibilityHazard accessibilityHazard);

		/**
		 * uri: http://schema.org/accessibilitySummary
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessibilitySummary
		 */
		public Container.AccessibilitySummary getAccessibilitySummary();
		public void setAccessibilitySummary(Container.AccessibilitySummary accessibilitySummary);

		/**
		 * uri: http://schema.org/accountablePerson
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccountablePerson
		 */
		public Container.AccountablePerson getAccountablePerson();
		public void setAccountablePerson(Container.AccountablePerson accountablePerson);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/alternativeHeadline
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlternativeHeadline
		 */
		public Container.AlternativeHeadline getAlternativeHeadline();
		public void setAlternativeHeadline(Container.AlternativeHeadline alternativeHeadline);

		/**
		 * uri: http://schema.org/associatedMedia
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AssociatedMedia
		 */
		public Container.AssociatedMedia getAssociatedMedia();
		public void setAssociatedMedia(Container.AssociatedMedia associatedMedia);

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/audio
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audio
		 */
		public Container.Audio getAudio();
		public void setAudio(Container.Audio audio);

		/**
		 * uri: http://schema.org/author
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Author
		 */
		public Container.Author getAuthor();
		public void setAuthor(Container.Author author);

		/**
		 * uri: http://schema.org/award
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Award
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * uri: http://schema.org/character
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Character
		 */
		public Container.Character getCharacter();
		public void setCharacter(Container.Character character);

		/**
		 * uri: http://schema.org/citation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Citation
		 */
		public Container.Citation getCitation();
		public void setCitation(Container.Citation citation);

		/**
		 * uri: http://schema.org/comment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Comment
		 */
		public Container.Comment getComment();
		public void setComment(Container.Comment comment);

		/**
		 * uri: http://schema.org/commentCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CommentCount
		 */
		public Container.CommentCount getCommentCount();
		public void setCommentCount(Container.CommentCount commentCount);

		/**
		 * uri: http://schema.org/contentLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContentLocation
		 */
		public Container.ContentLocation getContentLocation();
		public void setContentLocation(Container.ContentLocation contentLocation);

		/**
		 * uri: http://schema.org/contentRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContentRating
		 */
		public Container.ContentRating getContentRating();
		public void setContentRating(Container.ContentRating contentRating);

		/**
		 * uri: http://schema.org/contentReferenceTime
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ContentReferenceTime
		 */
		public ContentReferenceTime getContentReferenceTime();
		public void setContentReferenceTime(ContentReferenceTime contentReferenceTime);

		/**
		 * uri: http://schema.org/contributor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Contributor
		 */
		public Container.Contributor getContributor();
		public void setContributor(Container.Contributor contributor);

		/**
		 * uri: http://schema.org/copyrightHolder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CopyrightHolder
		 */
		public Container.CopyrightHolder getCopyrightHolder();
		public void setCopyrightHolder(Container.CopyrightHolder copyrightHolder);

		/**
		 * uri: http://schema.org/copyrightYear
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CopyrightYear
		 */
		public Container.CopyrightYear getCopyrightYear();
		public void setCopyrightYear(Container.CopyrightYear copyrightYear);

		/**
		 * uri: http://schema.org/creator
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Creator
		 */
		public Container.Creator getCreator();
		public void setCreator(Container.Creator creator);

		/**
		 * uri: http://schema.org/dateCreated
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateCreated
		 */
		public Container.DateCreated getDateCreated();
		public void setDateCreated(Container.DateCreated dateCreated);

		/**
		 * uri: http://schema.org/dateModified
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateModified
		 */
		public Container.DateModified getDateModified();
		public void setDateModified(Container.DateModified dateModified);

		/**
		 * uri: http://schema.org/datePublished
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DatePublished
		 */
		public Container.DatePublished getDatePublished();
		public void setDatePublished(Container.DatePublished datePublished);

		/**
		 * uri: http://schema.org/discussionUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DiscussionUrl
		 */
		public Container.DiscussionUrl getDiscussionUrl();
		public void setDiscussionUrl(Container.DiscussionUrl discussionUrl);

		/**
		 * uri: http://schema.org/editor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Editor
		 */
		public Container.Editor getEditor();
		public void setEditor(Container.Editor editor);

		/**
		 * uri: http://schema.org/educationalAlignment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EducationalAlignment
		 */
		public Container.EducationalAlignment getEducationalAlignment();
		public void setEducationalAlignment(Container.EducationalAlignment educationalAlignment);

		/**
		 * uri: http://schema.org/educationalUse
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EducationalUse
		 */
		public Container.EducationalUse getEducationalUse();
		public void setEducationalUse(Container.EducationalUse educationalUse);

		/**
		 * uri: http://schema.org/encoding
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Encoding
		 */
		public Container.Encoding getEncoding();
		public void setEncoding(Container.Encoding encoding);

		/**
		 * uri: http://schema.org/exampleOfWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExampleOfWork
		 */
		public Container.ExampleOfWork getExampleOfWork();
		public void setExampleOfWork(Container.ExampleOfWork exampleOfWork);

		/**
		 * uri: http://schema.org/expires
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Expires
		 */
		public Container.Expires getExpires();
		public void setExpires(Container.Expires expires);

		/**
		 * uri: http://schema.org/fileFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FileFormat
		 */
		public Container.FileFormat getFileFormat();
		public void setFileFormat(Container.FileFormat fileFormat);

		/**
		 * uri: http://schema.org/funder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Funder
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * uri: http://schema.org/genre
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Genre
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * uri: http://schema.org/hasPart
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasPart
		 */
		public Container.HasPart getHasPart();
		public void setHasPart(Container.HasPart hasPart);

		/**
		 * uri: http://schema.org/headline
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Headline
		 */
		public Container.Headline getHeadline();
		public void setHeadline(Container.Headline headline);

		/**
		 * uri: http://schema.org/inLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InLanguage
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * uri: http://schema.org/interactionStatistic
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InteractionStatistic
		 */
		public Container.InteractionStatistic getInteractionStatistic();
		public void setInteractionStatistic(Container.InteractionStatistic interactionStatistic);

		/**
		 * uri: http://schema.org/interactivityType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InteractivityType
		 */
		public Container.InteractivityType getInteractivityType();
		public void setInteractivityType(Container.InteractivityType interactivityType);

		/**
		 * uri: http://schema.org/isAccessibleForFree
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * uri: http://schema.org/isBasedOn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsBasedOn
		 */
		public Container.IsBasedOn getIsBasedOn();
		public void setIsBasedOn(Container.IsBasedOn isBasedOn);

		/**
		 * uri: http://schema.org/isFamilyFriendly
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsFamilyFriendly
		 */
		public Container.IsFamilyFriendly getIsFamilyFriendly();
		public void setIsFamilyFriendly(Container.IsFamilyFriendly isFamilyFriendly);

		/**
		 * uri: http://schema.org/isPartOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsPartOf
		 */
		public Container.IsPartOf getIsPartOf();
		public void setIsPartOf(Container.IsPartOf isPartOf);

		/**
		 * uri: http://schema.org/keywords
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Keywords
		 */
		public Container.Keywords getKeywords();
		public void setKeywords(Container.Keywords keywords);

		/**
		 * uri: http://schema.org/learningResourceType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LearningResourceType
		 */
		public Container.LearningResourceType getLearningResourceType();
		public void setLearningResourceType(Container.LearningResourceType learningResourceType);

		/**
		 * uri: http://schema.org/license
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.License
		 */
		public Container.License getLicense();
		public void setLicense(Container.License license);

		/**
		 * uri: http://schema.org/locationCreated
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LocationCreated
		 */
		public Container.LocationCreated getLocationCreated();
		public void setLocationCreated(Container.LocationCreated locationCreated);

		/**
		 * uri: http://schema.org/mainEntity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MainEntity
		 */
		public Container.MainEntity getMainEntity();
		public void setMainEntity(Container.MainEntity mainEntity);

		/**
		 * uri: http://schema.org/material
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Material
		 */
		public Container.Material getMaterial();
		public void setMaterial(Container.Material material);

		/**
		 * uri: http://schema.org/mentions
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Mentions
		 */
		public Container.Mentions getMentions();
		public void setMentions(Container.Mentions mentions);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * uri: http://schema.org/position
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Position
		 */
		public Container.Position getPosition();
		public void setPosition(Container.Position position);

		/**
		 * uri: http://schema.org/producer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Producer
		 */
		public Container.Producer getProducer();
		public void setProducer(Container.Producer producer);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/publication
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Publication
		 */
		public Container.Publication getPublication();
		public void setPublication(Container.Publication publication);

		/**
		 * uri: http://schema.org/publisher
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Publisher
		 */
		public Container.Publisher getPublisher();
		public void setPublisher(Container.Publisher publisher);

		/**
		 * uri: http://schema.org/publisherImprint
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.PublisherImprint
		 */
		public PublisherImprint getPublisherImprint();
		public void setPublisherImprint(PublisherImprint publisherImprint);

		/**
		 * uri: http://schema.org/publishingPrinciples
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * uri: http://schema.org/recordedAt
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecordedAt
		 */
		public Container.RecordedAt getRecordedAt();
		public void setRecordedAt(Container.RecordedAt recordedAt);

		/**
		 * uri: http://schema.org/releasedEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReleasedEvent
		 */
		public Container.ReleasedEvent getReleasedEvent();
		public void setReleasedEvent(Container.ReleasedEvent releasedEvent);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/schemaVersion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SchemaVersion
		 */
		public Container.SchemaVersion getSchemaVersion();
		public void setSchemaVersion(Container.SchemaVersion schemaVersion);

		/**
		 * uri: http://schema.org/sourceOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SourceOrganization
		 */
		public Container.SourceOrganization getSourceOrganization();
		public void setSourceOrganization(Container.SourceOrganization sourceOrganization);

		/**
		 * uri: http://schema.org/spatialCoverage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SpatialCoverage
		 */
		public Container.SpatialCoverage getSpatialCoverage();
		public void setSpatialCoverage(Container.SpatialCoverage spatialCoverage);

		/**
		 * uri: http://schema.org/sponsor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sponsor
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * uri: http://schema.org/temporalCoverage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TemporalCoverage
		 */
		public Container.TemporalCoverage getTemporalCoverage();
		public void setTemporalCoverage(Container.TemporalCoverage temporalCoverage);

		/**
		 * uri: http://schema.org/text
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Text
		 */
		public Container.Text getText();
		public void setText(Container.Text text);

		/**
		 * uri: http://schema.org/thumbnailUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ThumbnailUrl
		 */
		public Container.ThumbnailUrl getThumbnailUrl();
		public void setThumbnailUrl(Container.ThumbnailUrl thumbnailUrl);

		/**
		 * uri: http://schema.org/timeRequired
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TimeRequired
		 */
		public Container.TimeRequired getTimeRequired();
		public void setTimeRequired(Container.TimeRequired timeRequired);

		/**
		 * uri: http://schema.org/translationOfWork
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.TranslationOfWork
		 */
		public TranslationOfWork getTranslationOfWork();
		public void setTranslationOfWork(TranslationOfWork translationOfWork);

		/**
		 * uri: http://schema.org/translator
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Translator
		 */
		public Container.Translator getTranslator();
		public void setTranslator(Container.Translator translator);

		/**
		 * uri: http://schema.org/typicalAgeRange
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TypicalAgeRange
		 */
		public Container.TypicalAgeRange getTypicalAgeRange();
		public void setTypicalAgeRange(Container.TypicalAgeRange typicalAgeRange);

		/**
		 * uri: http://schema.org/version
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Version
		 */
		public Container.Version getVersion();
		public void setVersion(Container.Version version);

		/**
		 * uri: http://schema.org/video
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Video
		 */
		public Container.Video getVideo();
		public void setVideo(Container.Video video);

		/**
		 * uri: http://schema.org/workExample
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkExample
		 */
		public Container.WorkExample getWorkExample();
		public void setWorkExample(Container.WorkExample workExample);

		/**
		 * uri: http://schema.org/workTranslation
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.WorkTranslation
		 */
		public WorkTranslation getWorkTranslation();
		public void setWorkTranslation(WorkTranslation workTranslation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CreativeWorkSeason")
	@SchemaOrgLabel("CreativeWorkSeason")
	@SchemaOrgComment(""
			+ "A media season e.g. tv, radio, video game etc.")
	@CamelizedName("creativeWorkSeason")
	@ConstantizedName("CREATIVE_WORK_SEASON")
	public interface CreativeWorkSeason extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/endDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndDate
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * uri: http://schema.org/episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Episode
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * uri: http://schema.org/numberOfEpisodes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEpisodes
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * uri: http://schema.org/partOfSeries
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeries
		 */
		public Container.PartOfSeries getPartOfSeries();
		public void setPartOfSeries(Container.PartOfSeries partOfSeries);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/seasonNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SeasonNumber
		 */
		public Container.SeasonNumber getSeasonNumber();
		public void setSeasonNumber(Container.SeasonNumber seasonNumber);

		/**
		 * uri: http://schema.org/startDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartDate
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CreativeWorkSeries")
	@SchemaOrgLabel("CreativeWorkSeries")
	@SchemaOrgComment(""
			+ "A CreativeWorkSeries in schema.org is a group of related items, typically but"
			+ " not necessarily of the same kind. CreativeWorkSeries are usually organized into"
			+ " some order, often chronological. Unlike <a class=\"localLink\""
			+ " href=\"http://schema.org/ItemList\">ItemList</a> which is a general purpose"
			+ " data structure for lists of things, the emphasis with CreativeWorkSeries is on"
			+ " published materials (written e.g. books and periodicals, or media such as tv,"
			+ " radio and games).</p>\n\n<p>Specific subtypes are available for describing <a"
			+ " class=\"localLink\" href=\"http://schema.org/TVSeries\">TVSeries</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/RadioSeries\">RadioSeries</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/MovieSeries\">MovieSeries</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/BookSeries\">BookSeries</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Periodical\">Periodical</a> and <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/VideoGameSeries\">VideoGameSeries</a>. In each case,"
			+ " the <a class=\"localLink\" href=\"http://schema.org/hasPart\">hasPart</a> / <a"
			+ " class=\"localLink\" href=\"http://schema.org/isPartOf\">isPartOf</a> properties"
			+ " can be used to relate the CreativeWorkSeries to its parts. The general"
			+ " CreativeWorkSeries type serves largely just to organize these more specific and"
			+ " practical subtypes.</p>\n\n<p>It is common for properties applicable to an item"
			+ " from the series to be usefully applied to the containing group. Schema.org"
			+ " attempts to anticipate some of these cases, but publishers should be free to"
			+ " apply properties of the series parts to the series as a whole wherever they"
			+ " seem appropriate.")
	@CamelizedName("creativeWorkSeries")
	@ConstantizedName("CREATIVE_WORK_SERIES")
	public interface CreativeWorkSeries extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/endDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndDate
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * uri: http://schema.org/issn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Issn
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		/**
		 * uri: http://schema.org/startDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartDate
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CreditCard")
	@SchemaOrgLabel("CreditCard")
	@SchemaOrgComment(""
			+ "<p>A card payment method of a particular brand or name.  Used to mark up a"
			+ " particular payment method and/or the financial product/service that supplies"
			+ " the card account.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#AmericanExpress</li>\n<li>http://purl.org/goodrelations/v1#DinersClub</li>\n<li>http://purl.org/goodrelations/v1#Discover</li>\n<li>http://purl.org/goodrelations/v1#JCB</li>\n<li>http://purl.org/goodrelations/v1#MasterCard</li>\n<li>http://purl.org/goodrelations/v1#VISA</li>\n</ul>\n")
	@CamelizedName("creditCard")
	@ConstantizedName("CREDIT_CARD")
	public interface CreditCard extends LoanOrCredit, PaymentCard, SchemaOrgClass {

		/**
		 * uri: http://schema.org/monthlyMinimumRepaymentAmount
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MonthlyMinimumRepaymentAmount
		 */
		public MonthlyMinimumRepaymentAmount getMonthlyMinimumRepaymentAmount();
		public void setMonthlyMinimumRepaymentAmount(MonthlyMinimumRepaymentAmount monthlyMinimumRepaymentAmount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Crematorium")
	@SchemaOrgLabel("Crematorium")
	@SchemaOrgComment("A crematorium.")
	@CamelizedName("crematorium")
	@ConstantizedName("CREMATORIUM")
	public interface Crematorium extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CurrencyConversionService")
	@SchemaOrgLabel("CurrencyConversionService")
	@SchemaOrgComment(""
			+ "A service to convert funds from one currency to another currency.")
	@CamelizedName("currencyConversionService")
	@ConstantizedName("CURRENCY_CONVERSION_SERVICE")
	public interface CurrencyConversionService extends FinancialProduct, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DanceEvent")
	@SchemaOrgLabel("DanceEvent")
	@SchemaOrgComment("Event type: A social dance.")
	@CamelizedName("danceEvent")
	@ConstantizedName("DANCE_EVENT")
	public interface DanceEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DanceGroup")
	@SchemaOrgLabel("DanceGroup")
	@SchemaOrgComment(""
			+ "A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.")
	@CamelizedName("danceGroup")
	@ConstantizedName("DANCE_GROUP")
	public interface DanceGroup extends PerformingGroup, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DataCatalog")
	@SchemaOrgLabel("DataCatalog")
	@SchemaOrgComment("A collection of datasets.")
	@CamelizedName("dataCatalog")
	@ConstantizedName("DATA_CATALOG")
	public interface DataCatalog extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dataset
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Dataset
		 */
		public Container.Dataset getDataset();
		public void setDataset(Container.Dataset dataset);

		/**
		 * uri: http://schema.org/measurementTechnique
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DataDownload")
	@SchemaOrgLabel("DataDownload")
	@SchemaOrgComment("A dataset in downloadable form.")
	@CamelizedName("dataDownload")
	@ConstantizedName("DATA_DOWNLOAD")
	public interface DataDownload extends MediaObject, SchemaOrgClass {

		/**
		 * uri: http://schema.org/measurementTechnique
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DataFeed")
	@SchemaOrgLabel("DataFeed")
	@SchemaOrgComment(""
			+ "A single feed providing structured information about one or more entities or"
			+ " topics.")
	@CamelizedName("dataFeed")
	@ConstantizedName("DATA_FEED")
	public interface DataFeed extends Dataset, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dataFeedElement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DataFeedElement
		 */
		public Container.DataFeedElement getDataFeedElement();
		public void setDataFeedElement(Container.DataFeedElement dataFeedElement);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DataFeedItem")
	@SchemaOrgLabel("DataFeedItem")
	@SchemaOrgComment(""
			+ "A single item within a larger data feed.")
	@CamelizedName("dataFeedItem")
	@ConstantizedName("DATA_FEED_ITEM")
	public interface DataFeedItem extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dateCreated
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateCreated
		 */
		public Container.DateCreated getDateCreated();
		public void setDateCreated(Container.DateCreated dateCreated);

		/**
		 * uri: http://schema.org/dateDeleted
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateDeleted
		 */
		public Container.DateDeleted getDateDeleted();
		public void setDateDeleted(Container.DateDeleted dateDeleted);

		/**
		 * uri: http://schema.org/dateModified
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateModified
		 */
		public Container.DateModified getDateModified();
		public void setDateModified(Container.DateModified dateModified);

		/**
		 * uri: http://schema.org/item
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Item
		 */
		public Container.Item getItem();
		public void setItem(Container.Item item);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DataType")
	@SchemaOrgLabel("DataType")
	@SchemaOrgComment(""
			+ "The basic data types such as Integers, Strings, etc.")
	@CamelizedName("dataType")
	@ConstantizedName("DATA_TYPE")
	public interface DataType extends SchemaOrgClass {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Dataset")
	@SchemaOrgLabel("Dataset")
	@SchemaOrgComment(""
			+ "A body of structured information describing some topic(s) of interest.")
	@CamelizedName("dataset")
	@ConstantizedName("DATASET")
	public interface Dataset extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/distribution
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Distribution
		 */
		public Container.Distribution getDistribution();
		public void setDistribution(Container.Distribution distribution);

		/**
		 * uri: http://schema.org/includedInDataCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IncludedInDataCatalog
		 */
		public Container.IncludedInDataCatalog getIncludedInDataCatalog();
		public void setIncludedInDataCatalog(Container.IncludedInDataCatalog includedInDataCatalog);

		/**
		 * uri: http://schema.org/issn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Issn
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		/**
		 * uri: http://schema.org/measurementTechnique
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		/**
		 * uri: http://schema.org/variableMeasured
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.VariableMeasured
		 */
		public VariableMeasured getVariableMeasured();
		public void setVariableMeasured(VariableMeasured variableMeasured);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DayOfWeek")
	@SchemaOrgLabel("DayOfWeek")
	@SchemaOrgComment(""
			+ "The day of the week, e.g. used to specify to which day the opening hours of an"
			+ " OpeningHoursSpecification refer.</p>\n\n<p>Originally, URLs from <a"
			+ " href=\"http://purl.org/goodrelations/v1\">GoodRelations</a> were used (for <a"
			+ " class=\"localLink\" href=\"http://schema.org/Monday\">Monday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Tuesday\">Tuesday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Wednesday\">Wednesday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Thursday\">Thursday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Friday\">Friday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Saturday\">Saturday</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Sunday\">Sunday</a> plus a special"
			+ " entry for <a class=\"localLink\""
			+ " href=\"http://schema.org/PublicHolidays\">PublicHolidays</a>); these have now"
			+ " been integrated directly into schema.org.")
	@CamelizedName("dayOfWeek")
	@ConstantizedName("DAY_OF_WEEK")
	public interface DayOfWeek extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DaySpa")
	@SchemaOrgLabel("DaySpa")
	@SchemaOrgComment("A day spa.")
	@CamelizedName("daySpa")
	@ConstantizedName("DAY_SPA")
	public interface DaySpa extends HealthAndBeautyBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DeactivateAction")
	@SchemaOrgLabel("DeactivateAction")
	@SchemaOrgComment(""
			+ "The act of stopping or deactivating a device or application (e.g. stopping a"
			+ " timer or turning off a flashlight).")
	@CamelizedName("deactivateAction")
	@ConstantizedName("DEACTIVATE_ACTION")
	public interface DeactivateAction extends ControlAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DefenceEstablishment")
	@SchemaOrgLabel("DefenceEstablishment")
	@SchemaOrgComment(""
			+ "A defence establishment, such as an army or navy base.")
	@CamelizedName("defenceEstablishment")
	@ConstantizedName("DEFENCE_ESTABLISHMENT")
	public interface DefenceEstablishment extends GovernmentBuilding, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DeleteAction")
	@SchemaOrgLabel("DeleteAction")
	@SchemaOrgComment(""
			+ "The act of editing a recipient by removing one of its objects.")
	@CamelizedName("deleteAction")
	@ConstantizedName("DELETE_ACTION")
	public interface DeleteAction extends SchemaOrgClass, UpdateAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DeliveryChargeSpecification")
	@SchemaOrgLabel("DeliveryChargeSpecification")
	@SchemaOrgComment(""
			+ "The price for the delivery of an offer using a particular delivery method.")
	@CamelizedName("deliveryChargeSpecification")
	@ConstantizedName("DELIVERY_CHARGE_SPECIFICATION")
	public interface DeliveryChargeSpecification extends PriceSpecification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/appliesToDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AppliesToDeliveryMethod
		 */
		public Container.AppliesToDeliveryMethod getAppliesToDeliveryMethod();
		public void setAppliesToDeliveryMethod(Container.AppliesToDeliveryMethod appliesToDeliveryMethod);

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/eligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleRegion
		 */
		public Container.EligibleRegion getEligibleRegion();
		public void setEligibleRegion(Container.EligibleRegion eligibleRegion);

		/**
		 * uri: http://schema.org/ineligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IneligibleRegion
		 */
		public Container.IneligibleRegion getIneligibleRegion();
		public void setIneligibleRegion(Container.IneligibleRegion ineligibleRegion);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DeliveryEvent")
	@SchemaOrgLabel("DeliveryEvent")
	@SchemaOrgComment(""
			+ "An event involving the delivery of an item.")
	@CamelizedName("deliveryEvent")
	@ConstantizedName("DELIVERY_EVENT")
	public interface DeliveryEvent extends Event, SchemaOrgClass {

		/**
		 * uri: http://schema.org/accessCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccessCode
		 */
		public Container.AccessCode getAccessCode();
		public void setAccessCode(Container.AccessCode accessCode);

		/**
		 * uri: http://schema.org/availableFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableFrom
		 */
		public Container.AvailableFrom getAvailableFrom();
		public void setAvailableFrom(Container.AvailableFrom availableFrom);

		/**
		 * uri: http://schema.org/availableThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableThrough
		 */
		public Container.AvailableThrough getAvailableThrough();
		public void setAvailableThrough(Container.AvailableThrough availableThrough);

		/**
		 * uri: http://schema.org/hasDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasDeliveryMethod
		 */
		public Container.HasDeliveryMethod getHasDeliveryMethod();
		public void setHasDeliveryMethod(Container.HasDeliveryMethod hasDeliveryMethod);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DeliveryMethod")
	@SchemaOrgLabel("DeliveryMethod")
	@SchemaOrgComment(""
			+ "<p>A delivery method is a standardized procedure for transferring the product or"
			+ " service to the destination of fulfillment chosen by the customer. Delivery"
			+ " methods are characterized by the means of transportation used, and by the"
			+ " organization or group that is the contracting party for the sending"
			+ " organization or person.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#DeliveryModeDirectDownload</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeFreight</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeMail</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeOwnFleet</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModePickUp</li>\n<li>http://purl.org/goodrelations/v1#DHL</li>\n<li>http://purl.org/goodrelations/v1#FederalExpress</li>\n<li>http://purl.org/goodrelations/v1#UPS</li>\n</ul>\n")
	@CamelizedName("deliveryMethod")
	@ConstantizedName("DELIVERY_METHOD")
	public interface DeliveryMethod extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Demand")
	@SchemaOrgLabel("Demand")
	@SchemaOrgComment(""
			+ "A demand entity represents the public, not necessarily binding, not necessarily"
			+ " exclusive, announcement by an organization or person to seek a certain type of"
			+ " goods or services. For describing demand using this type, the very same"
			+ " properties used for Offer apply.")
	@CamelizedName("demand")
	@ConstantizedName("DEMAND")
	public interface Demand extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/acceptedPaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcceptedPaymentMethod
		 */
		public Container.AcceptedPaymentMethod getAcceptedPaymentMethod();
		public void setAcceptedPaymentMethod(Container.AcceptedPaymentMethod acceptedPaymentMethod);

		/**
		 * uri: http://schema.org/advanceBookingRequirement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdvanceBookingRequirement
		 */
		public Container.AdvanceBookingRequirement getAdvanceBookingRequirement();
		public void setAdvanceBookingRequirement(Container.AdvanceBookingRequirement advanceBookingRequirement);

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/availability
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Availability
		 */
		public Container.Availability getAvailability();
		public void setAvailability(Container.Availability availability);

		/**
		 * uri: http://schema.org/availabilityEnds
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityEnds
		 */
		public Container.AvailabilityEnds getAvailabilityEnds();
		public void setAvailabilityEnds(Container.AvailabilityEnds availabilityEnds);

		/**
		 * uri: http://schema.org/availabilityStarts
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityStarts
		 */
		public Container.AvailabilityStarts getAvailabilityStarts();
		public void setAvailabilityStarts(Container.AvailabilityStarts availabilityStarts);

		/**
		 * uri: http://schema.org/availableAtOrFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableAtOrFrom
		 */
		public Container.AvailableAtOrFrom getAvailableAtOrFrom();
		public void setAvailableAtOrFrom(Container.AvailableAtOrFrom availableAtOrFrom);

		/**
		 * uri: http://schema.org/availableDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableDeliveryMethod
		 */
		public Container.AvailableDeliveryMethod getAvailableDeliveryMethod();
		public void setAvailableDeliveryMethod(Container.AvailableDeliveryMethod availableDeliveryMethod);

		/**
		 * uri: http://schema.org/businessFunction
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BusinessFunction
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * uri: http://schema.org/deliveryLeadTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryLeadTime
		 */
		public Container.DeliveryLeadTime getDeliveryLeadTime();
		public void setDeliveryLeadTime(Container.DeliveryLeadTime deliveryLeadTime);

		/**
		 * uri: http://schema.org/eligibleCustomerType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleCustomerType
		 */
		public Container.EligibleCustomerType getEligibleCustomerType();
		public void setEligibleCustomerType(Container.EligibleCustomerType eligibleCustomerType);

		/**
		 * uri: http://schema.org/eligibleDuration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleDuration
		 */
		public Container.EligibleDuration getEligibleDuration();
		public void setEligibleDuration(Container.EligibleDuration eligibleDuration);

		/**
		 * uri: http://schema.org/eligibleQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleQuantity
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * uri: http://schema.org/eligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleRegion
		 */
		public Container.EligibleRegion getEligibleRegion();
		public void setEligibleRegion(Container.EligibleRegion eligibleRegion);

		/**
		 * uri: http://schema.org/eligibleTransactionVolume
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleTransactionVolume
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * uri: http://schema.org/gtin12
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin12
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * uri: http://schema.org/gtin13
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin13
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * uri: http://schema.org/gtin14
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin14
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * uri: http://schema.org/gtin8
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin8
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * uri: http://schema.org/includesObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IncludesObject
		 */
		public Container.IncludesObject getIncludesObject();
		public void setIncludesObject(Container.IncludesObject includesObject);

		/**
		 * uri: http://schema.org/ineligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IneligibleRegion
		 */
		public Container.IneligibleRegion getIneligibleRegion();
		public void setIneligibleRegion(Container.IneligibleRegion ineligibleRegion);

		/**
		 * uri: http://schema.org/inventoryLevel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InventoryLevel
		 */
		public Container.InventoryLevel getInventoryLevel();
		public void setInventoryLevel(Container.InventoryLevel inventoryLevel);

		/**
		 * uri: http://schema.org/itemCondition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemCondition
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * uri: http://schema.org/itemOffered
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemOffered
		 */
		public Container.ItemOffered getItemOffered();
		public void setItemOffered(Container.ItemOffered itemOffered);

		/**
		 * uri: http://schema.org/mpn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Mpn
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * uri: http://schema.org/priceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification
		 */
		public Container.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Container.PriceSpecification priceSpecification);

		/**
		 * uri: http://schema.org/seller
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seller
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * uri: http://schema.org/serialNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SerialNumber
		 */
		public Container.SerialNumber getSerialNumber();
		public void setSerialNumber(Container.SerialNumber serialNumber);

		/**
		 * uri: http://schema.org/sku
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sku
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * uri: http://schema.org/warranty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Warranty
		 */
		public Container.Warranty getWarranty();
		public void setWarranty(Container.Warranty warranty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Dentist")
	@SchemaOrgLabel("Dentist")
	@SchemaOrgComment("A dentist.")
	@CamelizedName("dentist")
	@ConstantizedName("DENTIST")
	public interface Dentist extends LocalBusiness, MedicalBusiness, MedicalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DepartAction")
	@SchemaOrgLabel("DepartAction")
	@SchemaOrgComment(""
			+ "The act of  departing from a place. An agent departs from an fromLocation for a"
			+ " destination, optionally with participants.")
	@CamelizedName("departAction")
	@ConstantizedName("DEPART_ACTION")
	public interface DepartAction extends MoveAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DepartmentStore")
	@SchemaOrgLabel("DepartmentStore")
	@SchemaOrgComment("A department store.")
	@CamelizedName("departmentStore")
	@ConstantizedName("DEPARTMENT_STORE")
	public interface DepartmentStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DepositAccount")
	@SchemaOrgLabel("DepositAccount")
	@SchemaOrgComment(""
			+ "A type of Bank Account with a main purpose of depositing funds to gain interest"
			+ " or other benefits.")
	@CamelizedName("depositAccount")
	@ConstantizedName("DEPOSIT_ACCOUNT")
	public interface DepositAccount extends BankAccount, InvestmentOrDeposit, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DigitalDocument")
	@SchemaOrgLabel("DigitalDocument")
	@SchemaOrgComment("An electronic file or document.")
	@CamelizedName("digitalDocument")
	@ConstantizedName("DIGITAL_DOCUMENT")
	public interface DigitalDocument extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hasDigitalDocumentPermission
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasDigitalDocumentPermission
		 */
		public Container.HasDigitalDocumentPermission getHasDigitalDocumentPermission();
		public void setHasDigitalDocumentPermission(Container.HasDigitalDocumentPermission hasDigitalDocumentPermission);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DigitalDocumentPermission")
	@SchemaOrgLabel("DigitalDocumentPermission")
	@SchemaOrgComment(""
			+ "A permission for a particular person or group to access a particular file.")
	@CamelizedName("digitalDocumentPermission")
	@ConstantizedName("DIGITAL_DOCUMENT_PERMISSION")
	public interface DigitalDocumentPermission extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/grantee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Grantee
		 */
		public Container.Grantee getGrantee();
		public void setGrantee(Container.Grantee grantee);

		/**
		 * uri: http://schema.org/permissionType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PermissionType
		 */
		public Container.PermissionType getPermissionType();
		public void setPermissionType(Container.PermissionType permissionType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DigitalDocumentPermissionType")
	@SchemaOrgLabel("DigitalDocumentPermissionType")
	@SchemaOrgComment(""
			+ "A type of permission which can be granted for accessing a digital document.")
	@CamelizedName("digitalDocumentPermissionType")
	@ConstantizedName("DIGITAL_DOCUMENT_PERMISSION_TYPE")
	public interface DigitalDocumentPermissionType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DisagreeAction")
	@SchemaOrgLabel("DisagreeAction")
	@SchemaOrgComment(""
			+ "The act of expressing a difference of opinion with the object. An agent"
			+ " disagrees to/about an object (a proposition, topic or theme) with participants.")
	@CamelizedName("disagreeAction")
	@ConstantizedName("DISAGREE_ACTION")
	public interface DisagreeAction extends ReactAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DiscoverAction")
	@SchemaOrgLabel("DiscoverAction")
	@SchemaOrgComment(""
			+ "The act of discovering/finding an object.")
	@CamelizedName("discoverAction")
	@ConstantizedName("DISCOVER_ACTION")
	public interface DiscoverAction extends FindAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DiscussionForumPosting")
	@SchemaOrgLabel("DiscussionForumPosting")
	@SchemaOrgComment("A posting to a discussion forum.")
	@CamelizedName("discussionForumPosting")
	@ConstantizedName("DISCUSSION_FORUM_POSTING")
	public interface DiscussionForumPosting extends SchemaOrgClass, SocialMediaPosting {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DislikeAction")
	@SchemaOrgLabel("DislikeAction")
	@SchemaOrgComment(""
			+ "The act of expressing a negative sentiment about the object. An agent dislikes"
			+ " an object (a proposition, topic or theme) with participants.")
	@CamelizedName("dislikeAction")
	@ConstantizedName("DISLIKE_ACTION")
	public interface DislikeAction extends ReactAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Distance")
	@SchemaOrgLabel("Distance")
	@SchemaOrgComment(""
			+ "Properties that take Distances as values are of the form '&lt;Number&gt;"
			+ " &lt;Length unit of measure&gt;'. E.g., '7 ft'.")
	@CamelizedName("distance")
	@ConstantizedName("DISTANCE")
	public interface Distance extends Quantity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DonateAction")
	@SchemaOrgLabel("DonateAction")
	@SchemaOrgComment(""
			+ "The act of providing goods, services, or money without compensation, often for"
			+ " philanthropic reasons.")
	@CamelizedName("donateAction")
	@ConstantizedName("DONATE_ACTION")
	public interface DonateAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DownloadAction")
	@SchemaOrgLabel("DownloadAction")
	@SchemaOrgComment("The act of downloading an object.")
	@CamelizedName("downloadAction")
	@ConstantizedName("DOWNLOAD_ACTION")
	public interface DownloadAction extends SchemaOrgClass, TransferAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrawAction")
	@SchemaOrgLabel("DrawAction")
	@SchemaOrgComment(""
			+ "The act of producing a visual/graphical representation of an object, typically"
			+ " with a pen/pencil and paper as instruments.")
	@CamelizedName("drawAction")
	@ConstantizedName("DRAW_ACTION")
	public interface DrawAction extends CreateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DrinkAction")
	@SchemaOrgLabel("DrinkAction")
	@SchemaOrgComment("The act of swallowing liquids.")
	@CamelizedName("drinkAction")
	@ConstantizedName("DRINK_ACTION")
	public interface DrinkAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DriveWheelConfigurationValue")
	@SchemaOrgLabel("DriveWheelConfigurationValue")
	@SchemaOrgComment(""
			+ "A value indicating which roadwheels will receive torque.")
	@CamelizedName("driveWheelConfigurationValue")
	@ConstantizedName("DRIVE_WHEEL_CONFIGURATION_VALUE")
	public interface DriveWheelConfigurationValue extends QualitativeValue, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DryCleaningOrLaundry")
	@SchemaOrgLabel("DryCleaningOrLaundry")
	@SchemaOrgComment("A dry-cleaning business.")
	@CamelizedName("dryCleaningOrLaundry")
	@ConstantizedName("DRY_CLEANING_OR_LAUNDRY")
	public interface DryCleaningOrLaundry extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Duration")
	@SchemaOrgLabel("Duration")
	@SchemaOrgComment(""
			+ "Quantity: Duration (use <a href=\"http://en.wikipedia.org/wiki/ISO_8601\">ISO"
			+ " 8601 duration format</a>).")
	@CamelizedName("duration")
	@ConstantizedName("DURATION")
	public interface Duration extends Quantity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EatAction")
	@SchemaOrgLabel("EatAction")
	@SchemaOrgComment("The act of swallowing solid objects.")
	@CamelizedName("eatAction")
	@ConstantizedName("EAT_ACTION")
	public interface EatAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EducationEvent")
	@SchemaOrgLabel("EducationEvent")
	@SchemaOrgComment("Event type: Education event.")
	@CamelizedName("educationEvent")
	@ConstantizedName("EDUCATION_EVENT")
	public interface EducationEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EducationalAudience")
	@SchemaOrgLabel("EducationalAudience")
	@SchemaOrgComment("An EducationalAudience.")
	@CamelizedName("educationalAudience")
	@ConstantizedName("EDUCATIONAL_AUDIENCE")
	public interface EducationalAudience extends Audience, SchemaOrgClass {

		/**
		 * uri: http://schema.org/educationalRole
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EducationalRole
		 */
		public Container.EducationalRole getEducationalRole();
		public void setEducationalRole(Container.EducationalRole educationalRole);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EducationalOrganization")
	@SchemaOrgLabel("EducationalOrganization")
	@SchemaOrgComment("An educational organization.")
	@CamelizedName("educationalOrganization")
	@ConstantizedName("EDUCATIONAL_ORGANIZATION")
	public interface EducationalOrganization extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/alumni
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Alumni
		 */
		public Container.Alumni getAlumni();
		public void setAlumni(Container.Alumni alumni);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Electrician")
	@SchemaOrgLabel("Electrician")
	@SchemaOrgComment("An electrician.")
	@CamelizedName("electrician")
	@ConstantizedName("ELECTRICIAN")
	public interface Electrician extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ElectronicsStore")
	@SchemaOrgLabel("ElectronicsStore")
	@SchemaOrgComment("An electronics store.")
	@CamelizedName("electronicsStore")
	@ConstantizedName("ELECTRONICS_STORE")
	public interface ElectronicsStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ElementarySchool")
	@SchemaOrgLabel("ElementarySchool")
	@SchemaOrgComment("An elementary school.")
	@CamelizedName("elementarySchool")
	@ConstantizedName("ELEMENTARY_SCHOOL")
	public interface ElementarySchool extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmailMessage")
	@SchemaOrgLabel("EmailMessage")
	@SchemaOrgComment("An email message.")
	@CamelizedName("emailMessage")
	@ConstantizedName("EMAIL_MESSAGE")
	public interface EmailMessage extends Message, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Embassy")
	@SchemaOrgLabel("Embassy")
	@SchemaOrgComment("An embassy.")
	@CamelizedName("embassy")
	@ConstantizedName("EMBASSY")
	public interface Embassy extends GovernmentBuilding, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmergencyService")
	@SchemaOrgLabel("EmergencyService")
	@SchemaOrgComment(""
			+ "An emergency service, such as a fire station or ER.")
	@CamelizedName("emergencyService")
	@ConstantizedName("EMERGENCY_SERVICE")
	public interface EmergencyService extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmployeeRole")
	@SchemaOrgLabel("EmployeeRole")
	@SchemaOrgComment(""
			+ "A subclass of OrganizationRole used to describe employee relationships.")
	@CamelizedName("employeeRole")
	@ConstantizedName("EMPLOYEE_ROLE")
	public interface EmployeeRole extends OrganizationRole, SchemaOrgClass {

		/**
		 * uri: http://schema.org/baseSalary
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BaseSalary
		 */
		public Container.BaseSalary getBaseSalary();
		public void setBaseSalary(Container.BaseSalary baseSalary);

		/**
		 * uri: http://schema.org/salaryCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SalaryCurrency
		 */
		public Container.SalaryCurrency getSalaryCurrency();
		public void setSalaryCurrency(Container.SalaryCurrency salaryCurrency);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EmploymentAgency")
	@SchemaOrgLabel("EmploymentAgency")
	@SchemaOrgComment("An employment agency.")
	@CamelizedName("employmentAgency")
	@ConstantizedName("EMPLOYMENT_AGENCY")
	public interface EmploymentAgency extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EndorseAction")
	@SchemaOrgLabel("EndorseAction")
	@SchemaOrgComment(""
			+ "An agent approves/certifies/likes/supports/sanction an object.")
	@CamelizedName("endorseAction")
	@ConstantizedName("ENDORSE_ACTION")
	public interface EndorseAction extends ReactAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/endorsee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Endorsee
		 */
		public Container.Endorsee getEndorsee();
		public void setEndorsee(Container.Endorsee endorsee);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Energy")
	@SchemaOrgLabel("Energy")
	@SchemaOrgComment(""
			+ "Properties that take Energy as values are of the form '&lt;Number&gt; &lt;Energy"
			+ " unit of measure&gt;'.")
	@CamelizedName("energy")
	@ConstantizedName("ENERGY")
	public interface Energy extends Quantity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EngineSpecification")
	@SchemaOrgLabel("EngineSpecification")
	@SchemaOrgComment(""
			+ "Information about the engine of the vehicle. A vehicle can have multiple engines"
			+ " represented by multiple engine specification entities.")
	@CamelizedName("engineSpecification")
	@ConstantizedName("ENGINE_SPECIFICATION")
	public interface EngineSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/engineDisplacement
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.EngineDisplacement
		 */
		public EngineDisplacement getEngineDisplacement();
		public void setEngineDisplacement(EngineDisplacement engineDisplacement);

		/**
		 * uri: http://schema.org/enginePower
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.EnginePower
		 */
		public EnginePower getEnginePower();
		public void setEnginePower(EnginePower enginePower);

		/**
		 * uri: http://schema.org/engineType
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.EngineType
		 */
		public EngineType getEngineType();
		public void setEngineType(EngineType engineType);

		/**
		 * uri: http://schema.org/fuelType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FuelType
		 */
		public Container.FuelType getFuelType();
		public void setFuelType(Container.FuelType fuelType);

		/**
		 * uri: http://schema.org/torque
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.Torque
		 */
		public Torque getTorque();
		public void setTorque(Torque torque);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EntertainmentBusiness")
	@SchemaOrgLabel("EntertainmentBusiness")
	@SchemaOrgComment("A business providing entertainment.")
	@CamelizedName("entertainmentBusiness")
	@ConstantizedName("ENTERTAINMENT_BUSINESS")
	public interface EntertainmentBusiness extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EntryPoint")
	@SchemaOrgLabel("EntryPoint")
	@SchemaOrgComment(""
			+ "An entry point, within some Web-based protocol.")
	@CamelizedName("entryPoint")
	@ConstantizedName("ENTRY_POINT")
	public interface EntryPoint extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actionApplication
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ActionApplication
		 */
		public Container.ActionApplication getActionApplication();
		public void setActionApplication(Container.ActionApplication actionApplication);

		/**
		 * uri: http://schema.org/actionPlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ActionPlatform
		 */
		public Container.ActionPlatform getActionPlatform();
		public void setActionPlatform(Container.ActionPlatform actionPlatform);

		/**
		 * uri: http://schema.org/contentType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContentType
		 */
		public Container.ContentType getContentType();
		public void setContentType(Container.ContentType contentType);

		/**
		 * uri: http://schema.org/encodingType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EncodingType
		 */
		public Container.EncodingType getEncodingType();
		public void setEncodingType(Container.EncodingType encodingType);

		/**
		 * uri: http://schema.org/httpMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HttpMethod
		 */
		public Container.HttpMethod getHttpMethod();
		public void setHttpMethod(Container.HttpMethod httpMethod);

		/**
		 * uri: http://schema.org/urlTemplate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UrlTemplate
		 */
		public Container.UrlTemplate getUrlTemplate();
		public void setUrlTemplate(Container.UrlTemplate urlTemplate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Enumeration")
	@SchemaOrgLabel("Enumeration")
	@SchemaOrgComment(""
			+ "Lists or enumerations—for example, a list of cuisines or music genres, etc.")
	@CamelizedName("enumeration")
	@ConstantizedName("ENUMERATION")
	public interface Enumeration extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/supersededBy
		 * class: org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy
		 */
		public SupersededBy getSupersededBy();
		public void setSupersededBy(SupersededBy supersededBy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Episode")
	@SchemaOrgLabel("Episode")
	@SchemaOrgComment(""
			+ "A media episode (e.g. TV, radio, video game) which can be part of a series or"
			+ " season.")
	@CamelizedName("episode")
	@ConstantizedName("EPISODE")
	public interface Episode extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/episodeNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EpisodeNumber
		 */
		public Container.EpisodeNumber getEpisodeNumber();
		public void setEpisodeNumber(Container.EpisodeNumber episodeNumber);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/partOfSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeason
		 */
		public Container.PartOfSeason getPartOfSeason();
		public void setPartOfSeason(Container.PartOfSeason partOfSeason);

		/**
		 * uri: http://schema.org/partOfSeries
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfSeries
		 */
		public Container.PartOfSeries getPartOfSeries();
		public void setPartOfSeries(Container.PartOfSeries partOfSeries);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Event")
	@SchemaOrgLabel("Event")
	@SchemaOrgComment(""
			+ "An event happening at a certain time and location, such as a concert, lecture,"
			+ " or festival. Ticketing information may be added via the <a class=\"localLink\""
			+ " href=\"http://schema.org/offers\">offers</a> property. Repeated events may be"
			+ " structured as separate Event objects.")
	@CamelizedName("event")
	@ConstantizedName("EVENT")
	public interface Event extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/about
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.About
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/attendee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Attendee
		 */
		public Container.Attendee getAttendee();
		public void setAttendee(Container.Attendee attendee);

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/composer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Composer
		 */
		public Container.Composer getComposer();
		public void setComposer(Container.Composer composer);

		/**
		 * uri: http://schema.org/contributor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Contributor
		 */
		public Container.Contributor getContributor();
		public void setContributor(Container.Contributor contributor);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/doorTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DoorTime
		 */
		public Container.DoorTime getDoorTime();
		public void setDoorTime(Container.DoorTime doorTime);

		/**
		 * uri: http://schema.org/duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duration
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * uri: http://schema.org/endDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndDate
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * uri: http://schema.org/eventStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EventStatus
		 */
		public Container.EventStatus getEventStatus();
		public void setEventStatus(Container.EventStatus eventStatus);

		/**
		 * uri: http://schema.org/funder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Funder
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * uri: http://schema.org/inLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InLanguage
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * uri: http://schema.org/isAccessibleForFree
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * uri: http://schema.org/location
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Location
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * uri: http://schema.org/maximumAttendeeCapacity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity
		 */
		public Container.MaximumAttendeeCapacity getMaximumAttendeeCapacity();
		public void setMaximumAttendeeCapacity(Container.MaximumAttendeeCapacity maximumAttendeeCapacity);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * uri: http://schema.org/organizer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Organizer
		 */
		public Container.Organizer getOrganizer();
		public void setOrganizer(Container.Organizer organizer);

		/**
		 * uri: http://schema.org/performer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Performer
		 */
		public Container.Performer getPerformer();
		public void setPerformer(Container.Performer performer);

		/**
		 * uri: http://schema.org/previousStartDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PreviousStartDate
		 */
		public Container.PreviousStartDate getPreviousStartDate();
		public void setPreviousStartDate(Container.PreviousStartDate previousStartDate);

		/**
		 * uri: http://schema.org/recordedIn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecordedIn
		 */
		public Container.RecordedIn getRecordedIn();
		public void setRecordedIn(Container.RecordedIn recordedIn);

		/**
		 * uri: http://schema.org/remainingAttendeeCapacity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RemainingAttendeeCapacity
		 */
		public Container.RemainingAttendeeCapacity getRemainingAttendeeCapacity();
		public void setRemainingAttendeeCapacity(Container.RemainingAttendeeCapacity remainingAttendeeCapacity);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/sponsor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sponsor
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * uri: http://schema.org/startDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartDate
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		/**
		 * uri: http://schema.org/subEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubEvent
		 */
		public Container.SubEvent getSubEvent();
		public void setSubEvent(Container.SubEvent subEvent);

		/**
		 * uri: http://schema.org/superEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuperEvent
		 */
		public Container.SuperEvent getSuperEvent();
		public void setSuperEvent(Container.SuperEvent superEvent);

		/**
		 * uri: http://schema.org/translator
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Translator
		 */
		public Container.Translator getTranslator();
		public void setTranslator(Container.Translator translator);

		/**
		 * uri: http://schema.org/typicalAgeRange
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TypicalAgeRange
		 */
		public Container.TypicalAgeRange getTypicalAgeRange();
		public void setTypicalAgeRange(Container.TypicalAgeRange typicalAgeRange);

		/**
		 * uri: http://schema.org/workFeatured
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkFeatured
		 */
		public Container.WorkFeatured getWorkFeatured();
		public void setWorkFeatured(Container.WorkFeatured workFeatured);

		/**
		 * uri: http://schema.org/workPerformed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkPerformed
		 */
		public Container.WorkPerformed getWorkPerformed();
		public void setWorkPerformed(Container.WorkPerformed workPerformed);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventReservation")
	@SchemaOrgLabel("EventReservation")
	@SchemaOrgComment(""
			+ "A reservation for an event like a concert, sporting event, or"
			+ " lecture.</p>\n\n<p>Note: This type is for information about actual"
			+ " reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("eventReservation")
	@ConstantizedName("EVENT_RESERVATION")
	public interface EventReservation extends Reservation, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventStatusType")
	@SchemaOrgLabel("EventStatusType")
	@SchemaOrgComment(""
			+ "EventStatusType is an enumeration type whose instances represent several states"
			+ " that an Event may be in.")
	@CamelizedName("eventStatusType")
	@ConstantizedName("EVENT_STATUS_TYPE")
	public interface EventStatusType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventVenue")
	@SchemaOrgLabel("EventVenue")
	@SchemaOrgComment("An event venue.")
	@CamelizedName("eventVenue")
	@ConstantizedName("EVENT_VENUE")
	public interface EventVenue extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ExerciseAction")
	@SchemaOrgLabel("ExerciseAction")
	@SchemaOrgComment(""
			+ "The act of participating in exertive activity for the purposes of improving"
			+ " health and fitness.")
	@CamelizedName("exerciseAction")
	@ConstantizedName("EXERCISE_ACTION")
	public interface ExerciseAction extends PlayAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/diet
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Diet
		 */
		public Diet getDiet();
		public void setDiet(Diet diet);

		/**
		 * uri: http://schema.org/distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Distance
		 */
		public Container.Distance getDistance();
		public void setDistance(Container.Distance distance);

		/**
		 * uri: http://schema.org/exerciseCourse
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExerciseCourse
		 */
		public Container.ExerciseCourse getExerciseCourse();
		public void setExerciseCourse(Container.ExerciseCourse exerciseCourse);

		/**
		 * uri: http://schema.org/exercisePlan
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExercisePlan
		 */
		public ExercisePlan getExercisePlan();
		public void setExercisePlan(ExercisePlan exercisePlan);

		/**
		 * uri: http://schema.org/exerciseRelatedDiet
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseRelatedDiet
		 */
		public ExerciseRelatedDiet getExerciseRelatedDiet();
		public void setExerciseRelatedDiet(ExerciseRelatedDiet exerciseRelatedDiet);

		/**
		 * uri: http://schema.org/exerciseType
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ExerciseType
		 */
		public ExerciseType getExerciseType();
		public void setExerciseType(ExerciseType exerciseType);

		/**
		 * uri: http://schema.org/fromLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FromLocation
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * uri: http://schema.org/opponent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Opponent
		 */
		public Container.Opponent getOpponent();
		public void setOpponent(Container.Opponent opponent);

		/**
		 * uri: http://schema.org/sportsActivityLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SportsActivityLocation
		 */
		public Container.SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(Container.SportsActivityLocation sportsActivityLocation);

		/**
		 * uri: http://schema.org/sportsEvent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SportsEvent
		 */
		public Container.SportsEvent getSportsEvent();
		public void setSportsEvent(Container.SportsEvent sportsEvent);

		/**
		 * uri: http://schema.org/sportsTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SportsTeam
		 */
		public Container.SportsTeam getSportsTeam();
		public void setSportsTeam(Container.SportsTeam sportsTeam);

		/**
		 * uri: http://schema.org/toLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ToLocation
		 */
		public Container.ToLocation getToLocation();
		public void setToLocation(Container.ToLocation toLocation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ExerciseGym")
	@SchemaOrgLabel("ExerciseGym")
	@SchemaOrgComment("A gym.")
	@CamelizedName("exerciseGym")
	@ConstantizedName("EXERCISE_GYM")
	public interface ExerciseGym extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ExhibitionEvent")
	@SchemaOrgLabel("ExhibitionEvent")
	@SchemaOrgComment(""
			+ "Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ...")
	@CamelizedName("exhibitionEvent")
	@ConstantizedName("EXHIBITION_EVENT")
	public interface ExhibitionEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FastFoodRestaurant")
	@SchemaOrgLabel("FastFoodRestaurant")
	@SchemaOrgComment("A fast-food restaurant.")
	@CamelizedName("fastFoodRestaurant")
	@ConstantizedName("FAST_FOOD_RESTAURANT")
	public interface FastFoodRestaurant extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Festival")
	@SchemaOrgLabel("Festival")
	@SchemaOrgComment("Event type: Festival.")
	@CamelizedName("festival")
	@ConstantizedName("FESTIVAL")
	public interface Festival extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FilmAction")
	@SchemaOrgLabel("FilmAction")
	@SchemaOrgComment(""
			+ "The act of capturing sound and moving images on film, video, or digitally.")
	@CamelizedName("filmAction")
	@ConstantizedName("FILM_ACTION")
	public interface FilmAction extends CreateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FinancialProduct")
	@SchemaOrgLabel("FinancialProduct")
	@SchemaOrgComment(""
			+ "A product provided to consumers and businesses by financial institutions such as"
			+ " banks, insurance companies, brokerage firms, consumer finance companies, and"
			+ " investment companies which comprise the financial services industry.")
	@CamelizedName("financialProduct")
	@ConstantizedName("FINANCIAL_PRODUCT")
	public interface FinancialProduct extends SchemaOrgClass, Service {

		/**
		 * uri: http://schema.org/annualPercentageRate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AnnualPercentageRate
		 */
		public Container.AnnualPercentageRate getAnnualPercentageRate();
		public void setAnnualPercentageRate(Container.AnnualPercentageRate annualPercentageRate);

		/**
		 * uri: http://schema.org/feesAndCommissionsSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FeesAndCommissionsSpecification
		 */
		public Container.FeesAndCommissionsSpecification getFeesAndCommissionsSpecification();
		public void setFeesAndCommissionsSpecification(Container.FeesAndCommissionsSpecification feesAndCommissionsSpecification);

		/**
		 * uri: http://schema.org/interestRate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InterestRate
		 */
		public Container.InterestRate getInterestRate();
		public void setInterestRate(Container.InterestRate interestRate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FinancialService")
	@SchemaOrgLabel("FinancialService")
	@SchemaOrgComment("Financial services business.")
	@CamelizedName("financialService")
	@ConstantizedName("FINANCIAL_SERVICE")
	public interface FinancialService extends LocalBusiness, SchemaOrgClass {

		/**
		 * uri: http://schema.org/feesAndCommissionsSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FeesAndCommissionsSpecification
		 */
		public Container.FeesAndCommissionsSpecification getFeesAndCommissionsSpecification();
		public void setFeesAndCommissionsSpecification(Container.FeesAndCommissionsSpecification feesAndCommissionsSpecification);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FindAction")
	@SchemaOrgLabel("FindAction")
	@SchemaOrgComment(""
			+ "<p>The act of finding an object.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/SearchAction\">SearchAction</a>:"
			+ " FindAction is generally lead by a SearchAction, but not"
			+ " necessarily.</li>\n</ul>\n")
	@CamelizedName("findAction")
	@ConstantizedName("FIND_ACTION")
	public interface FindAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FireStation")
	@SchemaOrgLabel("FireStation")
	@SchemaOrgComment("A fire station. With firemen.")
	@CamelizedName("fireStation")
	@ConstantizedName("FIRE_STATION")
	public interface FireStation extends CivicStructure, EmergencyService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Flight")
	@SchemaOrgLabel("Flight")
	@SchemaOrgComment("An airline flight.")
	@CamelizedName("flight")
	@ConstantizedName("FLIGHT")
	public interface Flight extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/aircraft
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Aircraft
		 */
		public Container.Aircraft getAircraft();
		public void setAircraft(Container.Aircraft aircraft);

		/**
		 * uri: http://schema.org/arrivalAirport
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalAirport
		 */
		public Container.ArrivalAirport getArrivalAirport();
		public void setArrivalAirport(Container.ArrivalAirport arrivalAirport);

		/**
		 * uri: http://schema.org/arrivalGate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalGate
		 */
		public Container.ArrivalGate getArrivalGate();
		public void setArrivalGate(Container.ArrivalGate arrivalGate);

		/**
		 * uri: http://schema.org/arrivalTerminal
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTerminal
		 */
		public Container.ArrivalTerminal getArrivalTerminal();
		public void setArrivalTerminal(Container.ArrivalTerminal arrivalTerminal);

		/**
		 * uri: http://schema.org/arrivalTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTime
		 */
		public Container.ArrivalTime getArrivalTime();
		public void setArrivalTime(Container.ArrivalTime arrivalTime);

		/**
		 * uri: http://schema.org/boardingPolicy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BoardingPolicy
		 */
		public Container.BoardingPolicy getBoardingPolicy();
		public void setBoardingPolicy(Container.BoardingPolicy boardingPolicy);

		/**
		 * uri: http://schema.org/departureAirport
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureAirport
		 */
		public Container.DepartureAirport getDepartureAirport();
		public void setDepartureAirport(Container.DepartureAirport departureAirport);

		/**
		 * uri: http://schema.org/departureGate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureGate
		 */
		public Container.DepartureGate getDepartureGate();
		public void setDepartureGate(Container.DepartureGate departureGate);

		/**
		 * uri: http://schema.org/departureTerminal
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureTerminal
		 */
		public Container.DepartureTerminal getDepartureTerminal();
		public void setDepartureTerminal(Container.DepartureTerminal departureTerminal);

		/**
		 * uri: http://schema.org/departureTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureTime
		 */
		public Container.DepartureTime getDepartureTime();
		public void setDepartureTime(Container.DepartureTime departureTime);

		/**
		 * uri: http://schema.org/estimatedFlightDuration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EstimatedFlightDuration
		 */
		public Container.EstimatedFlightDuration getEstimatedFlightDuration();
		public void setEstimatedFlightDuration(Container.EstimatedFlightDuration estimatedFlightDuration);

		/**
		 * uri: http://schema.org/flightDistance
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FlightDistance
		 */
		public Container.FlightDistance getFlightDistance();
		public void setFlightDistance(Container.FlightDistance flightDistance);

		/**
		 * uri: http://schema.org/flightNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FlightNumber
		 */
		public Container.FlightNumber getFlightNumber();
		public void setFlightNumber(Container.FlightNumber flightNumber);

		/**
		 * uri: http://schema.org/mealService
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MealService
		 */
		public Container.MealService getMealService();
		public void setMealService(Container.MealService mealService);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/seller
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seller
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * uri: http://schema.org/webCheckinTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WebCheckinTime
		 */
		public Container.WebCheckinTime getWebCheckinTime();
		public void setWebCheckinTime(Container.WebCheckinTime webCheckinTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FlightReservation")
	@SchemaOrgLabel("FlightReservation")
	@SchemaOrgComment(""
			+ "A reservation for air travel.</p>\n\n<p>Note: This type is for information about"
			+ " actual reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("flightReservation")
	@ConstantizedName("FLIGHT_RESERVATION")
	public interface FlightReservation extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/boardingGroup
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BoardingGroup
		 */
		public Container.BoardingGroup getBoardingGroup();
		public void setBoardingGroup(Container.BoardingGroup boardingGroup);

		/**
		 * uri: http://schema.org/passengerPriorityStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PassengerPriorityStatus
		 */
		public Container.PassengerPriorityStatus getPassengerPriorityStatus();
		public void setPassengerPriorityStatus(Container.PassengerPriorityStatus passengerPriorityStatus);

		/**
		 * uri: http://schema.org/passengerSequenceNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PassengerSequenceNumber
		 */
		public Container.PassengerSequenceNumber getPassengerSequenceNumber();
		public void setPassengerSequenceNumber(Container.PassengerSequenceNumber passengerSequenceNumber);

		/**
		 * uri: http://schema.org/securityScreening
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SecurityScreening
		 */
		public Container.SecurityScreening getSecurityScreening();
		public void setSecurityScreening(Container.SecurityScreening securityScreening);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Float")
	@SchemaOrgLabel("Float")
	@SchemaOrgComment("Data type: Floating number.")
	@CamelizedName("float")
	@ConstantizedName("FLOAT")
	public interface Float extends DataType, SchemaOrgClass {

		public Double getD0uble();
		public void setD0uble(Double d0uble);
		public Double getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Florist")
	@SchemaOrgLabel("Florist")
	@SchemaOrgComment("A florist.")
	@CamelizedName("florist")
	@ConstantizedName("FLORIST")
	public interface Florist extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FollowAction")
	@SchemaOrgLabel("FollowAction")
	@SchemaOrgComment(""
			+ "<p>The act of forming a personal connection with someone/something (object)"
			+ " unidirectionally/asymmetrically to get updates polled from.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/BefriendAction\">BefriendAction</a>: Unlike"
			+ " BefriendAction, FollowAction implies that the connection is <em>not</em>"
			+ " necessarily reciprocal.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SubscribeAction\">SubscribeAction</a>: Unlike"
			+ " SubscribeAction, FollowAction implies that the follower acts as an active agent"
			+ " constantly/actively polling for updates.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: Unlike"
			+ " RegisterAction, FollowAction implies that the agent is interested in continuing"
			+ " receiving updates from the object.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/JoinAction\">JoinAction</a>: Unlike JoinAction,"
			+ " FollowAction implies that the agent is interested in getting updates from the"
			+ " object.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/TrackAction\">TrackAction</a>: Unlike TrackAction,"
			+ " FollowAction refers to the polling of updates of all aspects of animate objects"
			+ " rather than the location of inanimate objects (e.g. you track a package, but"
			+ " you don't follow it).</li>\n</ul>\n")
	@CamelizedName("followAction")
	@ConstantizedName("FOLLOW_ACTION")
	public interface FollowAction extends InteractAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/followee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Followee
		 */
		public Container.Followee getFollowee();
		public void setFollowee(Container.Followee followee);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FoodEstablishment")
	@SchemaOrgLabel("FoodEstablishment")
	@SchemaOrgComment("A food-related business.")
	@CamelizedName("foodEstablishment")
	@ConstantizedName("FOOD_ESTABLISHMENT")
	public interface FoodEstablishment extends LocalBusiness, SchemaOrgClass {

		/**
		 * uri: http://schema.org/acceptsReservations
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcceptsReservations
		 */
		public Container.AcceptsReservations getAcceptsReservations();
		public void setAcceptsReservations(Container.AcceptsReservations acceptsReservations);

		/**
		 * uri: http://schema.org/hasMenu
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMenu
		 */
		public Container.HasMenu getHasMenu();
		public void setHasMenu(Container.HasMenu hasMenu);

		/**
		 * uri: http://schema.org/servesCuisine
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServesCuisine
		 */
		public Container.ServesCuisine getServesCuisine();
		public void setServesCuisine(Container.ServesCuisine servesCuisine);

		/**
		 * uri: http://schema.org/starRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StarRating
		 */
		public Container.StarRating getStarRating();
		public void setStarRating(Container.StarRating starRating);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FoodEstablishmentReservation")
	@SchemaOrgLabel("FoodEstablishmentReservation")
	@SchemaOrgComment(""
			+ "A reservation to dine at a food-related business.Note: This type is for"
			+ " information about actual reservations, e.g. in confirmation emails or HTML"
			+ " pages with individual confirmations of reservations.")
	@CamelizedName("foodEstablishmentReservation")
	@ConstantizedName("FOOD_ESTABLISHMENT_RESERVATION")
	public interface FoodEstablishmentReservation extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/endTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndTime
		 */
		public Container.EndTime getEndTime();
		public void setEndTime(Container.EndTime endTime);

		/**
		 * uri: http://schema.org/partySize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartySize
		 */
		public Container.PartySize getPartySize();
		public void setPartySize(Container.PartySize partySize);

		/**
		 * uri: http://schema.org/startTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartTime
		 */
		public Container.StartTime getStartTime();
		public void setStartTime(Container.StartTime startTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FoodEvent")
	@SchemaOrgLabel("FoodEvent")
	@SchemaOrgComment("Event type: Food event.")
	@CamelizedName("foodEvent")
	@ConstantizedName("FOOD_EVENT")
	public interface FoodEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FoodService")
	@SchemaOrgLabel("FoodService")
	@SchemaOrgComment(""
			+ "A food service, like breakfast, lunch, or dinner.")
	@CamelizedName("foodService")
	@ConstantizedName("FOOD_SERVICE")
	public interface FoodService extends SchemaOrgClass, Service {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/FurnitureStore")
	@SchemaOrgLabel("FurnitureStore")
	@SchemaOrgComment("A furniture store.")
	@CamelizedName("furnitureStore")
	@ConstantizedName("FURNITURE_STORE")
	public interface FurnitureStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Game")
	@SchemaOrgLabel("Game")
	@SchemaOrgComment(""
			+ "The Game type represents things which are games. These are typically"
			+ " rule-governed recreational activities, e.g. role-playing games in which players"
			+ " assume the role of characters in a fictional setting.")
	@CamelizedName("game")
	@ConstantizedName("GAME")
	public interface Game extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/characterAttribute
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CharacterAttribute
		 */
		public Container.CharacterAttribute getCharacterAttribute();
		public void setCharacterAttribute(Container.CharacterAttribute characterAttribute);

		/**
		 * uri: http://schema.org/gameItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameItem
		 */
		public Container.GameItem getGameItem();
		public void setGameItem(Container.GameItem gameItem);

		/**
		 * uri: http://schema.org/gameLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameLocation
		 */
		public Container.GameLocation getGameLocation();
		public void setGameLocation(Container.GameLocation gameLocation);

		/**
		 * uri: http://schema.org/numberOfPlayers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPlayers
		 */
		public Container.NumberOfPlayers getNumberOfPlayers();
		public void setNumberOfPlayers(Container.NumberOfPlayers numberOfPlayers);

		/**
		 * uri: http://schema.org/quest
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Quest
		 */
		public Container.Quest getQuest();
		public void setQuest(Container.Quest quest);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GamePlayMode")
	@SchemaOrgLabel("GamePlayMode")
	@SchemaOrgComment(""
			+ "Indicates whether this game is multi-player, co-op or single-player.")
	@CamelizedName("gamePlayMode")
	@ConstantizedName("GAME_PLAY_MODE")
	public interface GamePlayMode extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GameServer")
	@SchemaOrgLabel("GameServer")
	@SchemaOrgComment(""
			+ "Server that provides game interaction in a multiplayer game.")
	@CamelizedName("gameServer")
	@ConstantizedName("GAME_SERVER")
	public interface GameServer extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/game
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Game
		 */
		public Container.Game getGame();
		public void setGame(Container.Game game);

		/**
		 * uri: http://schema.org/playersOnline
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PlayersOnline
		 */
		public Container.PlayersOnline getPlayersOnline();
		public void setPlayersOnline(Container.PlayersOnline playersOnline);

		/**
		 * uri: http://schema.org/serverStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServerStatus
		 */
		public Container.ServerStatus getServerStatus();
		public void setServerStatus(Container.ServerStatus serverStatus);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GameServerStatus")
	@SchemaOrgLabel("GameServerStatus")
	@SchemaOrgComment("Status of a game server.")
	@CamelizedName("gameServerStatus")
	@ConstantizedName("GAME_SERVER_STATUS")
	public interface GameServerStatus extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GardenStore")
	@SchemaOrgLabel("GardenStore")
	@SchemaOrgComment("A garden store.")
	@CamelizedName("gardenStore")
	@ConstantizedName("GARDEN_STORE")
	public interface GardenStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GasStation")
	@SchemaOrgLabel("GasStation")
	@SchemaOrgComment("A gas station.")
	@CamelizedName("gasStation")
	@ConstantizedName("GAS_STATION")
	public interface GasStation extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GatedResidenceCommunity")
	@SchemaOrgLabel("GatedResidenceCommunity")
	@SchemaOrgComment("Residence type: Gated community.")
	@CamelizedName("gatedResidenceCommunity")
	@ConstantizedName("GATED_RESIDENCE_COMMUNITY")
	public interface GatedResidenceCommunity extends Residence, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GenderType")
	@SchemaOrgLabel("GenderType")
	@SchemaOrgComment("An enumeration of genders.")
	@CamelizedName("genderType")
	@ConstantizedName("GENDER_TYPE")
	public interface GenderType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GeneralContractor")
	@SchemaOrgLabel("GeneralContractor")
	@SchemaOrgComment("A general contractor.")
	@CamelizedName("generalContractor")
	@ConstantizedName("GENERAL_CONTRACTOR")
	public interface GeneralContractor extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GeoCircle")
	@SchemaOrgLabel("GeoCircle")
	@SchemaOrgComment(""
			+ "A GeoCircle is a GeoShape representing a circular geographic area. As it is a"
			+ " GeoShape\n          it provides the simple textual property 'circle', but also"
			+ " allows the combination of postalCode alongside geoRadius.\n          The center"
			+ " of the circle can be indicated via the 'geoMidpoint' property, or more"
			+ " approximately using 'address', 'postalCode'.")
	@CamelizedName("geoCircle")
	@ConstantizedName("GEO_CIRCLE")
	public interface GeoCircle extends GeoShape, SchemaOrgClass {

		/**
		 * uri: http://schema.org/geoMidpoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GeoMidpoint
		 */
		public Container.GeoMidpoint getGeoMidpoint();
		public void setGeoMidpoint(Container.GeoMidpoint geoMidpoint);

		/**
		 * uri: http://schema.org/geoRadius
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GeoRadius
		 */
		public Container.GeoRadius getGeoRadius();
		public void setGeoRadius(Container.GeoRadius geoRadius);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GeoCoordinates")
	@SchemaOrgLabel("GeoCoordinates")
	@SchemaOrgComment(""
			+ "The geographic coordinates of a place or event.")
	@CamelizedName("geoCoordinates")
	@ConstantizedName("GEO_COORDINATES")
	public interface GeoCoordinates extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/address
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Address
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * uri: http://schema.org/addressCountry
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddressCountry
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * uri: http://schema.org/elevation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Elevation
		 */
		public Container.Elevation getElevation();
		public void setElevation(Container.Elevation elevation);

		/**
		 * uri: http://schema.org/latitude
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Latitude
		 */
		public Container.Latitude getLatitude();
		public void setLatitude(Container.Latitude latitude);

		/**
		 * uri: http://schema.org/longitude
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Longitude
		 */
		public Container.Longitude getLongitude();
		public void setLongitude(Container.Longitude longitude);

		/**
		 * uri: http://schema.org/postalCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PostalCode
		 */
		public Container.PostalCode getPostalCode();
		public void setPostalCode(Container.PostalCode postalCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GeoShape")
	@SchemaOrgLabel("GeoShape")
	@SchemaOrgComment(""
			+ "The geographic shape of a place. A GeoShape can be described using several"
			+ " properties whose values are based on latitude/longitude pairs. Either"
			+ " whitespace or commas can be used to separate latitude and longitude; whitespace"
			+ " should be used when writing a list of several such points.")
	@CamelizedName("geoShape")
	@ConstantizedName("GEO_SHAPE")
	public interface GeoShape extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/address
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Address
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * uri: http://schema.org/addressCountry
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddressCountry
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * uri: http://schema.org/box
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Box
		 */
		public Container.Box getBox();
		public void setBox(Container.Box box);

		/**
		 * uri: http://schema.org/circle
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Circle
		 */
		public Container.Circle getCircle();
		public void setCircle(Container.Circle circle);

		/**
		 * uri: http://schema.org/elevation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Elevation
		 */
		public Container.Elevation getElevation();
		public void setElevation(Container.Elevation elevation);

		/**
		 * uri: http://schema.org/line
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Line
		 */
		public Container.Line getLine();
		public void setLine(Container.Line line);

		/**
		 * uri: http://schema.org/polygon
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Polygon
		 */
		public Container.Polygon getPolygon();
		public void setPolygon(Container.Polygon polygon);

		/**
		 * uri: http://schema.org/postalCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PostalCode
		 */
		public Container.PostalCode getPostalCode();
		public void setPostalCode(Container.PostalCode postalCode);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GiveAction")
	@SchemaOrgLabel("GiveAction")
	@SchemaOrgComment(""
			+ "<p>The act of transferring ownership of an object to a destination. Reciprocal"
			+ " of TakeAction.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/TakeAction\">TakeAction</a>:"
			+ " Reciprocal of GiveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SendAction\">SendAction</a>: Unlike SendAction,"
			+ " GiveAction implies that ownership is being transferred (e.g. I may send my"
			+ " laptop to you, but that doesn't mean I'm giving it to you).</li>\n</ul>\n")
	@CamelizedName("giveAction")
	@ConstantizedName("GIVE_ACTION")
	public interface GiveAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GolfCourse")
	@SchemaOrgLabel("GolfCourse")
	@SchemaOrgComment("A golf course.")
	@CamelizedName("golfCourse")
	@ConstantizedName("GOLF_COURSE")
	public interface GolfCourse extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GovernmentBuilding")
	@SchemaOrgLabel("GovernmentBuilding")
	@SchemaOrgComment("A government building.")
	@CamelizedName("governmentBuilding")
	@ConstantizedName("GOVERNMENT_BUILDING")
	public interface GovernmentBuilding extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GovernmentOffice")
	@SchemaOrgLabel("GovernmentOffice")
	@SchemaOrgComment(""
			+ "A government office&#x2014;for example, an IRS or DMV office.")
	@CamelizedName("governmentOffice")
	@ConstantizedName("GOVERNMENT_OFFICE")
	public interface GovernmentOffice extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GovernmentOrganization")
	@SchemaOrgLabel("GovernmentOrganization")
	@SchemaOrgComment("A governmental organization or agency.")
	@CamelizedName("governmentOrganization")
	@ConstantizedName("GOVERNMENT_ORGANIZATION")
	public interface GovernmentOrganization extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GovernmentPermit")
	@SchemaOrgLabel("GovernmentPermit")
	@SchemaOrgComment("A permit issued by a government agency.")
	@CamelizedName("governmentPermit")
	@ConstantizedName("GOVERNMENT_PERMIT")
	public interface GovernmentPermit extends Permit, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GovernmentService")
	@SchemaOrgLabel("GovernmentService")
	@SchemaOrgComment(""
			+ "A service provided by a government organization, e.g. food stamps, veterans"
			+ " benefits, etc.")
	@CamelizedName("governmentService")
	@ConstantizedName("GOVERNMENT_SERVICE")
	public interface GovernmentService extends SchemaOrgClass, Service {

		/**
		 * uri: http://schema.org/serviceOperator
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceOperator
		 */
		public Container.ServiceOperator getServiceOperator();
		public void setServiceOperator(Container.ServiceOperator serviceOperator);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/GroceryStore")
	@SchemaOrgLabel("GroceryStore")
	@SchemaOrgComment("A grocery store.")
	@CamelizedName("groceryStore")
	@ConstantizedName("GROCERY_STORE")
	public interface GroceryStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HVACBusiness")
	@SchemaOrgLabel("HVACBusiness")
	@SchemaOrgComment(""
			+ "A business that provide Heating, Ventilation and Air Conditioning services.")
	@CamelizedName("hvacBusiness")
	@ConstantizedName("HVAC_BUSINESS")
	public interface HVACBusiness extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HairSalon")
	@SchemaOrgLabel("HairSalon")
	@SchemaOrgComment("A hair salon.")
	@CamelizedName("hairSalon")
	@ConstantizedName("HAIR_SALON")
	public interface HairSalon extends HealthAndBeautyBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HardwareStore")
	@SchemaOrgLabel("HardwareStore")
	@SchemaOrgComment("A hardware store.")
	@CamelizedName("hardwareStore")
	@ConstantizedName("HARDWARE_STORE")
	public interface HardwareStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthAndBeautyBusiness")
	@SchemaOrgLabel("HealthAndBeautyBusiness")
	@SchemaOrgComment("Health and beauty.")
	@CamelizedName("healthAndBeautyBusiness")
	@ConstantizedName("HEALTH_AND_BEAUTY_BUSINESS")
	public interface HealthAndBeautyBusiness extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HealthClub")
	@SchemaOrgLabel("HealthClub")
	@SchemaOrgComment("A health club.")
	@CamelizedName("healthClub")
	@ConstantizedName("HEALTH_CLUB")
	public interface HealthClub extends HealthAndBeautyBusiness, SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HighSchool")
	@SchemaOrgLabel("HighSchool")
	@SchemaOrgComment("A high school.")
	@CamelizedName("highSchool")
	@ConstantizedName("HIGH_SCHOOL")
	public interface HighSchool extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HinduTemple")
	@SchemaOrgLabel("HinduTemple")
	@SchemaOrgComment("A Hindu temple.")
	@CamelizedName("hinduTemple")
	@ConstantizedName("HINDU_TEMPLE")
	public interface HinduTemple extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HobbyShop")
	@SchemaOrgLabel("HobbyShop")
	@SchemaOrgComment(""
			+ "A store that sells materials useful or necessary for various hobbies.")
	@CamelizedName("hobbyShop")
	@ConstantizedName("HOBBY_SHOP")
	public interface HobbyShop extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HomeAndConstructionBusiness")
	@SchemaOrgLabel("HomeAndConstructionBusiness")
	@SchemaOrgComment(""
			+ "A construction business.</p>\n\n<p>A HomeAndConstructionBusiness is a <a"
			+ " class=\"localLink\" href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>"
			+ " that provides services around homes and buildings.</p>\n\n<p>As a <a"
			+ " class=\"localLink\" href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>"
			+ " it can be described as a <a class=\"localLink\""
			+ " href=\"http://schema.org/provider\">provider</a> of one or more <a"
			+ " class=\"localLink\" href=\"http://schema.org/Service\">Service</a>(s).")
	@CamelizedName("homeAndConstructionBusiness")
	@ConstantizedName("HOME_AND_CONSTRUCTION_BUSINESS")
	public interface HomeAndConstructionBusiness extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HomeGoodsStore")
	@SchemaOrgLabel("HomeGoodsStore")
	@SchemaOrgComment("A home goods store.")
	@CamelizedName("homeGoodsStore")
	@ConstantizedName("HOME_GOODS_STORE")
	public interface HomeGoodsStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Hospital")
	@SchemaOrgLabel("Hospital")
	@SchemaOrgComment("A hospital.")
	@CamelizedName("hospital")
	@ConstantizedName("HOSPITAL")
	public interface Hospital extends CivicStructure, EmergencyService, MedicalOrganization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableService
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableService
		 */
		public AvailableService getAvailableService();
		public void setAvailableService(AvailableService availableService);

		/**
		 * uri: http://schema.org/medicalSpecialty
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicalSpecialty
		 */
		public MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Hostel")
	@SchemaOrgLabel("Hostel")
	@SchemaOrgComment(""
			+ "A hostel - cheap accommodation, often in shared dormitories.\n<br /><br />\nSee"
			+ " also the <a href=\"/docs/hotels.html\">dedicated document on the use of"
			+ " schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("hostel")
	@ConstantizedName("HOSTEL")
	public interface Hostel extends LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Hotel")
	@SchemaOrgLabel("Hotel")
	@SchemaOrgComment(""
			+ "A hotel is an establishment that provides lodging paid on a short-term basis"
			+ " (Source: Wikipedia, the free encyclopedia, see"
			+ " http://en.wikipedia.org/wiki/Hotel).\n<br /><br />\nSee also the <a"
			+ " href=\"/docs/hotels.html\">dedicated document on the use of schema.org for"
			+ " marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("hotel")
	@ConstantizedName("HOTEL")
	public interface Hotel extends LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HotelRoom")
	@SchemaOrgLabel("HotelRoom")
	@SchemaOrgComment(""
			+ "A hotel room is a single room in a hotel.\n<br /><br />\nSee also the <a"
			+ " href=\"/docs/hotels.html\">dedicated document on the use of schema.org for"
			+ " marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("hotelRoom")
	@ConstantizedName("HOTEL_ROOM")
	public interface HotelRoom extends Room, SchemaOrgClass {

		/**
		 * uri: http://schema.org/bed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Bed
		 */
		public Container.Bed getBed();
		public void setBed(Container.Bed bed);

		/**
		 * uri: http://schema.org/occupancy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Occupancy
		 */
		public Container.Occupancy getOccupancy();
		public void setOccupancy(Container.Occupancy occupancy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/House")
	@SchemaOrgLabel("House")
	@SchemaOrgComment(""
			+ "A house is a building or structure that has the ability to be occupied for"
			+ " habitation by humans or other creatures (Source: Wikipedia, the free"
			+ " encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/House\">http://en.wikipedia.org/wiki/House</a>).")
	@CamelizedName("house")
	@ConstantizedName("HOUSE")
	public interface House extends Accommodation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberOfRooms
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfRooms
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HousePainter")
	@SchemaOrgLabel("HousePainter")
	@SchemaOrgComment("A house painting service.")
	@CamelizedName("housePainter")
	@ConstantizedName("HOUSE_PAINTER")
	public interface HousePainter extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowTo")
	@SchemaOrgLabel("HowTo")
	@SchemaOrgComment(""
			+ "Instructions that explain how to achieve a result by performing a sequence of"
			+ " steps.")
	@CamelizedName("howTo")
	@ConstantizedName("HOW_TO")
	public interface HowTo extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/estimatedCost
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EstimatedCost
		 */
		public Container.EstimatedCost getEstimatedCost();
		public void setEstimatedCost(Container.EstimatedCost estimatedCost);

		/**
		 * uri: http://schema.org/performTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PerformTime
		 */
		public Container.PerformTime getPerformTime();
		public void setPerformTime(Container.PerformTime performTime);

		/**
		 * uri: http://schema.org/prepTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrepTime
		 */
		public Container.PrepTime getPrepTime();
		public void setPrepTime(Container.PrepTime prepTime);

		/**
		 * uri: http://schema.org/steps
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Steps
		 */
		public Container.Steps getSteps();
		public void setSteps(Container.Steps steps);

		/**
		 * uri: http://schema.org/supply
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Supply
		 */
		public Container.Supply getSupply();
		public void setSupply(Container.Supply supply);

		/**
		 * uri: http://schema.org/tool
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Tool
		 */
		public Container.Tool getTool();
		public void setTool(Container.Tool tool);

		/**
		 * uri: http://schema.org/totalTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TotalTime
		 */
		public Container.TotalTime getTotalTime();
		public void setTotalTime(Container.TotalTime totalTime);

		/**
		 * uri: http://schema.org/yield
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Yield
		 */
		public Container.Yield getYield();
		public void setYield(Container.Yield yield);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToDirection")
	@SchemaOrgLabel("HowToDirection")
	@SchemaOrgComment(""
			+ "A direction indicating a single action to do in the instructions for how to"
			+ " achieve a result.")
	@CamelizedName("howToDirection")
	@ConstantizedName("HOW_TO_DIRECTION")
	public interface HowToDirection extends ListItem, SchemaOrgClass {

		/**
		 * uri: http://schema.org/afterMedia
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AfterMedia
		 */
		public Container.AfterMedia getAfterMedia();
		public void setAfterMedia(Container.AfterMedia afterMedia);

		/**
		 * uri: http://schema.org/beforeMedia
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BeforeMedia
		 */
		public Container.BeforeMedia getBeforeMedia();
		public void setBeforeMedia(Container.BeforeMedia beforeMedia);

		/**
		 * uri: http://schema.org/duringMedia
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DuringMedia
		 */
		public Container.DuringMedia getDuringMedia();
		public void setDuringMedia(Container.DuringMedia duringMedia);

		/**
		 * uri: http://schema.org/performTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PerformTime
		 */
		public Container.PerformTime getPerformTime();
		public void setPerformTime(Container.PerformTime performTime);

		/**
		 * uri: http://schema.org/prepTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrepTime
		 */
		public Container.PrepTime getPrepTime();
		public void setPrepTime(Container.PrepTime prepTime);

		/**
		 * uri: http://schema.org/supply
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Supply
		 */
		public Container.Supply getSupply();
		public void setSupply(Container.Supply supply);

		/**
		 * uri: http://schema.org/tool
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Tool
		 */
		public Container.Tool getTool();
		public void setTool(Container.Tool tool);

		/**
		 * uri: http://schema.org/totalTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TotalTime
		 */
		public Container.TotalTime getTotalTime();
		public void setTotalTime(Container.TotalTime totalTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToItem")
	@SchemaOrgLabel("HowToItem")
	@SchemaOrgComment(""
			+ "An item used as either a tool or supply when performing the instructions for how"
			+ " to to achieve a result.")
	@CamelizedName("howToItem")
	@ConstantizedName("HOW_TO_ITEM")
	public interface HowToItem extends ListItem, SchemaOrgClass {

		/**
		 * uri: http://schema.org/requiredQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiredQuantity
		 */
		public Container.RequiredQuantity getRequiredQuantity();
		public void setRequiredQuantity(Container.RequiredQuantity requiredQuantity);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToSection")
	@SchemaOrgLabel("HowToSection")
	@SchemaOrgComment(""
			+ "A sub-grouping of steps in the instructions for how to achieve a result (e.g."
			+ " steps for making a pie crust within a pie recipe).")
	@CamelizedName("howToSection")
	@ConstantizedName("HOW_TO_SECTION")
	public interface HowToSection extends ItemList, SchemaOrgClass {

		/**
		 * uri: http://schema.org/steps
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Steps
		 */
		public Container.Steps getSteps();
		public void setSteps(Container.Steps steps);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToStep")
	@SchemaOrgLabel("HowToStep")
	@SchemaOrgComment(""
			+ "A step in the instructions for how to achieve a result. It is an ordered list"
			+ " with HowToDirection and/or HowToTip items.")
	@CamelizedName("howToStep")
	@ConstantizedName("HOW_TO_STEP")
	public interface HowToStep extends ItemList, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToSupply")
	@SchemaOrgLabel("HowToSupply")
	@SchemaOrgComment(""
			+ "A supply consumed when performing the instructions for how to achieve a result.")
	@CamelizedName("howToSupply")
	@ConstantizedName("HOW_TO_SUPPLY")
	public interface HowToSupply extends HowToItem, SchemaOrgClass {

		/**
		 * uri: http://schema.org/estimatedCost
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EstimatedCost
		 */
		public Container.EstimatedCost getEstimatedCost();
		public void setEstimatedCost(Container.EstimatedCost estimatedCost);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToTip")
	@SchemaOrgLabel("HowToTip")
	@SchemaOrgComment(""
			+ "An explanation in the instructions for how to achieve a result. It provides"
			+ " supplementary information about a technique, supply, author's preference, etc."
			+ " It can explain what could be done, or what should not be done, but doesn't"
			+ " specify what should be done (see HowToDirection).")
	@CamelizedName("howToTip")
	@ConstantizedName("HOW_TO_TIP")
	public interface HowToTip extends ListItem, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/HowToTool")
	@SchemaOrgLabel("HowToTool")
	@SchemaOrgComment(""
			+ "A tool used (but not consumed) when performing instructions for how to achieve a"
			+ " result.")
	@CamelizedName("howToTool")
	@ConstantizedName("HOW_TO_TOOL")
	public interface HowToTool extends HowToItem, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/IceCreamShop")
	@SchemaOrgLabel("IceCreamShop")
	@SchemaOrgComment("An ice cream shop.")
	@CamelizedName("iceCreamShop")
	@ConstantizedName("ICE_CREAM_SHOP")
	public interface IceCreamShop extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/IgnoreAction")
	@SchemaOrgLabel("IgnoreAction")
	@SchemaOrgComment(""
			+ "The act of intentionally disregarding the object. An agent ignores an object.")
	@CamelizedName("ignoreAction")
	@ConstantizedName("IGNORE_ACTION")
	public interface IgnoreAction extends AssessAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ImageGallery")
	@SchemaOrgLabel("ImageGallery")
	@SchemaOrgComment("Web page type: Image gallery page.")
	@CamelizedName("imageGallery")
	@ConstantizedName("IMAGE_GALLERY")
	public interface ImageGallery extends CollectionPage, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ImageObject")
	@SchemaOrgLabel("ImageObject")
	@SchemaOrgComment("An image file.")
	@CamelizedName("imageObject")
	@ConstantizedName("IMAGE_OBJECT")
	public interface ImageObject extends MediaObject, SchemaOrgClass {

		/**
		 * uri: http://schema.org/caption
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Caption
		 */
		public Container.Caption getCaption();
		public void setCaption(Container.Caption caption);

		/**
		 * uri: http://schema.org/exifData
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExifData
		 */
		public Container.ExifData getExifData();
		public void setExifData(Container.ExifData exifData);

		/**
		 * uri: http://schema.org/representativeOfPage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RepresentativeOfPage
		 */
		public Container.RepresentativeOfPage getRepresentativeOfPage();
		public void setRepresentativeOfPage(Container.RepresentativeOfPage representativeOfPage);

		/**
		 * uri: http://schema.org/thumbnail
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Thumbnail
		 */
		public Container.Thumbnail getThumbnail();
		public void setThumbnail(Container.Thumbnail thumbnail);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/IndividualProduct")
	@SchemaOrgLabel("IndividualProduct")
	@SchemaOrgComment(""
			+ "A single, identifiable product instance (e.g. a laptop with a particular serial"
			+ " number).")
	@CamelizedName("individualProduct")
	@ConstantizedName("INDIVIDUAL_PRODUCT")
	public interface IndividualProduct extends Product, SchemaOrgClass {

		/**
		 * uri: http://schema.org/serialNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SerialNumber
		 */
		public Container.SerialNumber getSerialNumber();
		public void setSerialNumber(Container.SerialNumber serialNumber);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InformAction")
	@SchemaOrgLabel("InformAction")
	@SchemaOrgComment(""
			+ "The act of notifying someone of information pertinent to them, with no"
			+ " expectation of a response.")
	@CamelizedName("informAction")
	@ConstantizedName("INFORM_ACTION")
	public interface InformAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InsertAction")
	@SchemaOrgLabel("InsertAction")
	@SchemaOrgComment(""
			+ "The act of adding at a specific location in an ordered collection.")
	@CamelizedName("insertAction")
	@ConstantizedName("INSERT_ACTION")
	public interface InsertAction extends AddAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/toLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ToLocation
		 */
		public Container.ToLocation getToLocation();
		public void setToLocation(Container.ToLocation toLocation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InstallAction")
	@SchemaOrgLabel("InstallAction")
	@SchemaOrgComment("The act of installing an application.")
	@CamelizedName("installAction")
	@ConstantizedName("INSTALL_ACTION")
	public interface InstallAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InsuranceAgency")
	@SchemaOrgLabel("InsuranceAgency")
	@SchemaOrgComment("An Insurance agency.")
	@CamelizedName("insuranceAgency")
	@ConstantizedName("INSURANCE_AGENCY")
	public interface InsuranceAgency extends FinancialService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Intangible")
	@SchemaOrgLabel("Intangible")
	@SchemaOrgComment(""
			+ "A utility class that serves as the umbrella for a number of 'intangible' things"
			+ " such as quantities, structured values, etc.")
	@CamelizedName("intangible")
	@ConstantizedName("INTANGIBLE")
	public interface Intangible extends SchemaOrgClass, Thing {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Integer")
	@SchemaOrgLabel("Integer")
	@SchemaOrgComment("Data type: Integer.")
	@CamelizedName("integer")
	@ConstantizedName("INTEGER")
	public interface Integer extends DataType, SchemaOrgClass {

		public Long getL0ng();
		public void setL0ng(Long l0ng);
		public Long getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InteractAction")
	@SchemaOrgLabel("InteractAction")
	@SchemaOrgComment(""
			+ "The act of interacting with another person or organization.")
	@CamelizedName("interactAction")
	@ConstantizedName("INTERACT_ACTION")
	public interface InteractAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InteractionCounter")
	@SchemaOrgLabel("InteractionCounter")
	@SchemaOrgComment(""
			+ "A summary of how users have interacted with this CreativeWork. In most cases,"
			+ " authors will use a subtype to specify the specific type of interaction.")
	@CamelizedName("interactionCounter")
	@ConstantizedName("INTERACTION_COUNTER")
	public interface InteractionCounter extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/interactionService
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InteractionService
		 */
		public Container.InteractionService getInteractionService();
		public void setInteractionService(Container.InteractionService interactionService);

		/**
		 * uri: http://schema.org/interactionType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InteractionType
		 */
		public Container.InteractionType getInteractionType();
		public void setInteractionType(Container.InteractionType interactionType);

		/**
		 * uri: http://schema.org/userInteractionCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UserInteractionCount
		 */
		public Container.UserInteractionCount getUserInteractionCount();
		public void setUserInteractionCount(Container.UserInteractionCount userInteractionCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InternetCafe")
	@SchemaOrgLabel("InternetCafe")
	@SchemaOrgComment("An internet cafe.")
	@CamelizedName("internetCafe")
	@ConstantizedName("INTERNET_CAFE")
	public interface InternetCafe extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InvestmentOrDeposit")
	@SchemaOrgLabel("InvestmentOrDeposit")
	@SchemaOrgComment(""
			+ "A type of financial product that typically requires the client to transfer funds"
			+ " to a financial service in return for potential beneficial financial return.")
	@CamelizedName("investmentOrDeposit")
	@ConstantizedName("INVESTMENT_OR_DEPOSIT")
	public interface InvestmentOrDeposit extends FinancialProduct, SchemaOrgClass {

		/**
		 * uri: http://schema.org/amount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Amount
		 */
		public Container.Amount getAmount();
		public void setAmount(Container.Amount amount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/InviteAction")
	@SchemaOrgLabel("InviteAction")
	@SchemaOrgComment(""
			+ "The act of asking someone to attend an event. Reciprocal of RsvpAction.")
	@CamelizedName("inviteAction")
	@ConstantizedName("INVITE_ACTION")
	public interface InviteAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Invoice")
	@SchemaOrgLabel("Invoice")
	@SchemaOrgComment(""
			+ "A statement of the money due for goods or services; a bill.")
	@CamelizedName("invoice")
	@ConstantizedName("INVOICE")
	public interface Invoice extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/accountId
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AccountId
		 */
		public Container.AccountId getAccountId();
		public void setAccountId(Container.AccountId accountId);

		/**
		 * uri: http://schema.org/billingPeriod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BillingPeriod
		 */
		public Container.BillingPeriod getBillingPeriod();
		public void setBillingPeriod(Container.BillingPeriod billingPeriod);

		/**
		 * uri: http://schema.org/broker
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Broker
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Container.Category getCategory();
		public void setCategory(Container.Category category);

		/**
		 * uri: http://schema.org/confirmationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ConfirmationNumber
		 */
		public Container.ConfirmationNumber getConfirmationNumber();
		public void setConfirmationNumber(Container.ConfirmationNumber confirmationNumber);

		/**
		 * uri: http://schema.org/customer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Customer
		 */
		public Container.Customer getCustomer();
		public void setCustomer(Container.Customer customer);

		/**
		 * uri: http://schema.org/minimumPaymentDue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinimumPaymentDue
		 */
		public Container.MinimumPaymentDue getMinimumPaymentDue();
		public void setMinimumPaymentDue(Container.MinimumPaymentDue minimumPaymentDue);

		/**
		 * uri: http://schema.org/paymentDueDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentDueDate
		 */
		public Container.PaymentDueDate getPaymentDueDate();
		public void setPaymentDueDate(Container.PaymentDueDate paymentDueDate);

		/**
		 * uri: http://schema.org/paymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentMethod
		 */
		public Container.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Container.PaymentMethod paymentMethod);

		/**
		 * uri: http://schema.org/paymentMethodId
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentMethodId
		 */
		public Container.PaymentMethodId getPaymentMethodId();
		public void setPaymentMethodId(Container.PaymentMethodId paymentMethodId);

		/**
		 * uri: http://schema.org/paymentStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentStatus
		 */
		public Container.PaymentStatus getPaymentStatus();
		public void setPaymentStatus(Container.PaymentStatus paymentStatus);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/referencesOrder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReferencesOrder
		 */
		public Container.ReferencesOrder getReferencesOrder();
		public void setReferencesOrder(Container.ReferencesOrder referencesOrder);

		/**
		 * uri: http://schema.org/scheduledPaymentDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ScheduledPaymentDate
		 */
		public Container.ScheduledPaymentDate getScheduledPaymentDate();
		public void setScheduledPaymentDate(Container.ScheduledPaymentDate scheduledPaymentDate);

		/**
		 * uri: http://schema.org/totalPaymentDue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TotalPaymentDue
		 */
		public Container.TotalPaymentDue getTotalPaymentDue();
		public void setTotalPaymentDue(Container.TotalPaymentDue totalPaymentDue);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemAvailability")
	@SchemaOrgLabel("ItemAvailability")
	@SchemaOrgComment(""
			+ "A list of possible product availability options.")
	@CamelizedName("itemAvailability")
	@ConstantizedName("ITEM_AVAILABILITY")
	public interface ItemAvailability extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemList")
	@SchemaOrgLabel("ItemList")
	@SchemaOrgComment(""
			+ "A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen,"
			+ " or Top 100 Party Songs. Not to be confused with HTML lists, which are often"
			+ " used only for formatting.")
	@CamelizedName("itemList")
	@ConstantizedName("ITEM_LIST")
	public interface ItemList extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/itemListElement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemListElement
		 */
		public Container.ItemListElement getItemListElement();
		public void setItemListElement(Container.ItemListElement itemListElement);

		/**
		 * uri: http://schema.org/itemListOrder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemListOrder
		 */
		public Container.ItemListOrder getItemListOrder();
		public void setItemListOrder(Container.ItemListOrder itemListOrder);

		/**
		 * uri: http://schema.org/numberOfItems
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfItems
		 */
		public Container.NumberOfItems getNumberOfItems();
		public void setNumberOfItems(Container.NumberOfItems numberOfItems);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemListOrderType")
	@SchemaOrgLabel("ItemListOrderType")
	@SchemaOrgComment(""
			+ "Enumerated for values for itemListOrder for indicating how an ordered ItemList"
			+ " is organized.")
	@CamelizedName("itemListOrderType")
	@ConstantizedName("ITEM_LIST_ORDER_TYPE")
	public interface ItemListOrderType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ItemPage")
	@SchemaOrgLabel("ItemPage")
	@SchemaOrgComment(""
			+ "A page devoted to a single item, such as a particular product or hotel.")
	@CamelizedName("itemPage")
	@ConstantizedName("ITEM_PAGE")
	public interface ItemPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/JewelryStore")
	@SchemaOrgLabel("JewelryStore")
	@SchemaOrgComment("A jewelry store.")
	@CamelizedName("jewelryStore")
	@ConstantizedName("JEWELRY_STORE")
	public interface JewelryStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/JobPosting")
	@SchemaOrgLabel("JobPosting")
	@SchemaOrgComment(""
			+ "A listing that describes a job opening in a certain organization.")
	@CamelizedName("jobPosting")
	@ConstantizedName("JOB_POSTING")
	public interface JobPosting extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/baseSalary
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BaseSalary
		 */
		public Container.BaseSalary getBaseSalary();
		public void setBaseSalary(Container.BaseSalary baseSalary);

		/**
		 * uri: http://schema.org/datePosted
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DatePosted
		 */
		public Container.DatePosted getDatePosted();
		public void setDatePosted(Container.DatePosted datePosted);

		/**
		 * uri: http://schema.org/educationRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EducationRequirements
		 */
		public Container.EducationRequirements getEducationRequirements();
		public void setEducationRequirements(Container.EducationRequirements educationRequirements);

		/**
		 * uri: http://schema.org/employmentType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EmploymentType
		 */
		public Container.EmploymentType getEmploymentType();
		public void setEmploymentType(Container.EmploymentType employmentType);

		/**
		 * uri: http://schema.org/estimatedSalary
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EstimatedSalary
		 */
		public EstimatedSalary getEstimatedSalary();
		public void setEstimatedSalary(EstimatedSalary estimatedSalary);

		/**
		 * uri: http://schema.org/experienceRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExperienceRequirements
		 */
		public Container.ExperienceRequirements getExperienceRequirements();
		public void setExperienceRequirements(Container.ExperienceRequirements experienceRequirements);

		/**
		 * uri: http://schema.org/hiringOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HiringOrganization
		 */
		public Container.HiringOrganization getHiringOrganization();
		public void setHiringOrganization(Container.HiringOrganization hiringOrganization);

		/**
		 * uri: http://schema.org/incentiveCompensation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IncentiveCompensation
		 */
		public Container.IncentiveCompensation getIncentiveCompensation();
		public void setIncentiveCompensation(Container.IncentiveCompensation incentiveCompensation);

		/**
		 * uri: http://schema.org/industry
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Industry
		 */
		public Container.Industry getIndustry();
		public void setIndustry(Container.Industry industry);

		/**
		 * uri: http://schema.org/jobBenefits
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.JobBenefits
		 */
		public Container.JobBenefits getJobBenefits();
		public void setJobBenefits(Container.JobBenefits jobBenefits);

		/**
		 * uri: http://schema.org/jobLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.JobLocation
		 */
		public Container.JobLocation getJobLocation();
		public void setJobLocation(Container.JobLocation jobLocation);

		/**
		 * uri: http://schema.org/occupationalCategory
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OccupationalCategory
		 */
		public Container.OccupationalCategory getOccupationalCategory();
		public void setOccupationalCategory(Container.OccupationalCategory occupationalCategory);

		/**
		 * uri: http://schema.org/qualifications
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Qualifications
		 */
		public Container.Qualifications getQualifications();
		public void setQualifications(Container.Qualifications qualifications);

		/**
		 * uri: http://schema.org/responsibilities
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Responsibilities
		 */
		public Container.Responsibilities getResponsibilities();
		public void setResponsibilities(Container.Responsibilities responsibilities);

		/**
		 * uri: http://schema.org/salaryCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SalaryCurrency
		 */
		public Container.SalaryCurrency getSalaryCurrency();
		public void setSalaryCurrency(Container.SalaryCurrency salaryCurrency);

		/**
		 * uri: http://schema.org/skills
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Skills
		 */
		public Container.Skills getSkills();
		public void setSkills(Container.Skills skills);

		/**
		 * uri: http://schema.org/specialCommitments
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SpecialCommitments
		 */
		public Container.SpecialCommitments getSpecialCommitments();
		public void setSpecialCommitments(Container.SpecialCommitments specialCommitments);

		/**
		 * uri: http://schema.org/title
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Title
		 */
		public Container.Title getTitle();
		public void setTitle(Container.Title title);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * uri: http://schema.org/workHours
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkHours
		 */
		public Container.WorkHours getWorkHours();
		public void setWorkHours(Container.WorkHours workHours);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/JoinAction")
	@SchemaOrgLabel("JoinAction")
	@SchemaOrgComment(""
			+ "<p>An agent joins an event/group with participants/friends at a"
			+ " location.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: Unlike"
			+ " RegisterAction, JoinAction refers to joining a group/team of"
			+ " people.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SubscribeAction\">SubscribeAction</a>: Unlike"
			+ " SubscribeAction, JoinAction does not imply that you'll be receiving"
			+ " updates.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FollowAction\">FollowAction</a>: Unlike FollowAction,"
			+ " JoinAction does not imply that you'll be polling for updates.</li>\n</ul>\n")
	@CamelizedName("joinAction")
	@ConstantizedName("JOIN_ACTION")
	public interface JoinAction extends InteractAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LakeBodyOfWater")
	@SchemaOrgLabel("LakeBodyOfWater")
	@SchemaOrgComment("A lake (for example, Lake Pontrachain).")
	@CamelizedName("lakeBodyOfWater")
	@ConstantizedName("LAKE_BODY_OF_WATER")
	public interface LakeBodyOfWater extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Landform")
	@SchemaOrgLabel("Landform")
	@SchemaOrgComment(""
			+ "A landform or physical feature.  Landform elements include mountains, plains,"
			+ " lakes, rivers, seascape and oceanic waterbody interface features such as bays,"
			+ " peninsulas, seas and so forth, including sub-aqueous terrain features such as"
			+ " submersed mountain ranges, volcanoes, and the great ocean basins.")
	@CamelizedName("landform")
	@ConstantizedName("LANDFORM")
	public interface Landform extends Place, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LandmarksOrHistoricalBuildings")
	@SchemaOrgLabel("LandmarksOrHistoricalBuildings")
	@SchemaOrgComment("An historical landmark or building.")
	@CamelizedName("landmarksOrHistoricalBuildings")
	@ConstantizedName("LANDMARKS_OR_HISTORICAL_BUILDINGS")
	public interface LandmarksOrHistoricalBuildings extends Place, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Language")
	@SchemaOrgLabel("Language")
	@SchemaOrgComment(""
			+ "Natural languages such as Spanish, Tamil, Hindi, English, etc. Formal language"
			+ " code tags expressed in <a"
			+ " href=\"https://en.wikipedia.org/wiki/IETF_language_tag\">BCP 47</a> can be used"
			+ " via the <a class=\"localLink\""
			+ " href=\"http://schema.org/alternateName\">alternateName</a> property. The"
			+ " Language type previously also covered programming languages such as Scheme and"
			+ " Lisp, which are now best represented using <a class=\"localLink\""
			+ " href=\"http://schema.org/ComputerLanguage\">ComputerLanguage</a>.")
	@CamelizedName("language")
	@ConstantizedName("LANGUAGE")
	public interface Language extends Intangible, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LeaveAction")
	@SchemaOrgLabel("LeaveAction")
	@SchemaOrgComment(""
			+ "<p>An agent leaves an event / group with participants/friends at a"
			+ " location.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/JoinAction\">JoinAction</a>: The antonym of"
			+ " LeaveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/UnRegisterAction\">UnRegisterAction</a>: Unlike"
			+ " UnRegisterAction, LeaveAction implies leaving a group/team of people rather"
			+ " than a service.</li>\n</ul>\n")
	@CamelizedName("leaveAction")
	@ConstantizedName("LEAVE_ACTION")
	public interface LeaveAction extends InteractAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LegalService")
	@SchemaOrgLabel("LegalService")
	@SchemaOrgComment(""
			+ "A LegalService is a business that provides legally-oriented services, advice and"
			+ " representation, e.g. law firms.</p>\n\n<p>As a <a class=\"localLink\""
			+ " href=\"http://schema.org/LocalBusiness\">LocalBusiness</a> it can be described"
			+ " as a <a class=\"localLink\" href=\"http://schema.org/provider\">provider</a> of"
			+ " one or more <a class=\"localLink\""
			+ " href=\"http://schema.org/Service\">Service</a>(s).")
	@CamelizedName("legalService")
	@ConstantizedName("LEGAL_SERVICE")
	public interface LegalService extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LegislativeBuilding")
	@SchemaOrgLabel("LegislativeBuilding")
	@SchemaOrgComment(""
			+ "A legislative building&#x2014;for example, the state capitol.")
	@CamelizedName("legislativeBuilding")
	@ConstantizedName("LEGISLATIVE_BUILDING")
	public interface LegislativeBuilding extends GovernmentBuilding, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LendAction")
	@SchemaOrgLabel("LendAction")
	@SchemaOrgComment(""
			+ "<p>The act of providing an object under an agreement that it will be returned at"
			+ " a later date. Reciprocal of BorrowAction.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/BorrowAction\">BorrowAction</a>: Reciprocal of"
			+ " LendAction.</li>\n</ul>\n")
	@CamelizedName("lendAction")
	@ConstantizedName("LEND_ACTION")
	public interface LendAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/borrower
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Borrower
		 */
		public Container.Borrower getBorrower();
		public void setBorrower(Container.Borrower borrower);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Library")
	@SchemaOrgLabel("Library")
	@SchemaOrgComment("A library.")
	@CamelizedName("library")
	@ConstantizedName("LIBRARY")
	public interface Library extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LikeAction")
	@SchemaOrgLabel("LikeAction")
	@SchemaOrgComment(""
			+ "The act of expressing a positive sentiment about the object. An agent likes an"
			+ " object (a proposition, topic or theme) with participants.")
	@CamelizedName("likeAction")
	@ConstantizedName("LIKE_ACTION")
	public interface LikeAction extends ReactAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LiquorStore")
	@SchemaOrgLabel("LiquorStore")
	@SchemaOrgComment(""
			+ "A shop that sells alcoholic drinks such as wine, beer, whisky and other spirits.")
	@CamelizedName("liquorStore")
	@ConstantizedName("LIQUOR_STORE")
	public interface LiquorStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ListItem")
	@SchemaOrgLabel("ListItem")
	@SchemaOrgComment(""
			+ "An list item, e.g. a step in a checklist or how-to description.")
	@CamelizedName("listItem")
	@ConstantizedName("LIST_ITEM")
	public interface ListItem extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/item
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Item
		 */
		public Container.Item getItem();
		public void setItem(Container.Item item);

		/**
		 * uri: http://schema.org/nextItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NextItem
		 */
		public Container.NextItem getNextItem();
		public void setNextItem(Container.NextItem nextItem);

		/**
		 * uri: http://schema.org/position
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Position
		 */
		public Container.Position getPosition();
		public void setPosition(Container.Position position);

		/**
		 * uri: http://schema.org/previousItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PreviousItem
		 */
		public Container.PreviousItem getPreviousItem();
		public void setPreviousItem(Container.PreviousItem previousItem);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ListenAction")
	@SchemaOrgLabel("ListenAction")
	@SchemaOrgComment("The act of consuming audio content.")
	@CamelizedName("listenAction")
	@ConstantizedName("LISTEN_ACTION")
	public interface ListenAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LiteraryEvent")
	@SchemaOrgLabel("LiteraryEvent")
	@SchemaOrgComment("Event type: Literary event.")
	@CamelizedName("literaryEvent")
	@ConstantizedName("LITERARY_EVENT")
	public interface LiteraryEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LiveBlogPosting")
	@SchemaOrgLabel("LiveBlogPosting")
	@SchemaOrgComment(""
			+ "A blog post intended to provide a rolling textual coverage of an ongoing event"
			+ " through continuous updates.")
	@CamelizedName("liveBlogPosting")
	@ConstantizedName("LIVE_BLOG_POSTING")
	public interface LiveBlogPosting extends BlogPosting, SchemaOrgClass {

		/**
		 * uri: http://schema.org/coverageEndTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CoverageEndTime
		 */
		public Container.CoverageEndTime getCoverageEndTime();
		public void setCoverageEndTime(Container.CoverageEndTime coverageEndTime);

		/**
		 * uri: http://schema.org/coverageStartTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CoverageStartTime
		 */
		public Container.CoverageStartTime getCoverageStartTime();
		public void setCoverageStartTime(Container.CoverageStartTime coverageStartTime);

		/**
		 * uri: http://schema.org/liveBlogUpdate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LiveBlogUpdate
		 */
		public Container.LiveBlogUpdate getLiveBlogUpdate();
		public void setLiveBlogUpdate(Container.LiveBlogUpdate liveBlogUpdate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LoanOrCredit")
	@SchemaOrgLabel("LoanOrCredit")
	@SchemaOrgComment(""
			+ "A financial product for the loaning of an amount of money under agreed terms and"
			+ " charges.")
	@CamelizedName("loanOrCredit")
	@ConstantizedName("LOAN_OR_CREDIT")
	public interface LoanOrCredit extends FinancialProduct, SchemaOrgClass {

		/**
		 * uri: http://schema.org/amount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Amount
		 */
		public Container.Amount getAmount();
		public void setAmount(Container.Amount amount);

		/**
		 * uri: http://schema.org/currency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Currency
		 */
		public Container.Currency getCurrency();
		public void setCurrency(Container.Currency currency);

		/**
		 * uri: http://schema.org/gracePeriod
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GracePeriod
		 */
		public GracePeriod getGracePeriod();
		public void setGracePeriod(GracePeriod gracePeriod);

		/**
		 * uri: http://schema.org/loanRepaymentForm
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LoanRepaymentForm
		 */
		public LoanRepaymentForm getLoanRepaymentForm();
		public void setLoanRepaymentForm(LoanRepaymentForm loanRepaymentForm);

		/**
		 * uri: http://schema.org/loanTerm
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LoanTerm
		 */
		public Container.LoanTerm getLoanTerm();
		public void setLoanTerm(Container.LoanTerm loanTerm);

		/**
		 * uri: http://schema.org/loanType
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.LoanType
		 */
		public LoanType getLoanType();
		public void setLoanType(LoanType loanType);

		/**
		 * uri: http://schema.org/recourseLoan
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.RecourseLoan
		 */
		public RecourseLoan getRecourseLoan();
		public void setRecourseLoan(RecourseLoan recourseLoan);

		/**
		 * uri: http://schema.org/renegotiableLoan
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.RenegotiableLoan
		 */
		public RenegotiableLoan getRenegotiableLoan();
		public void setRenegotiableLoan(RenegotiableLoan renegotiableLoan);

		/**
		 * uri: http://schema.org/requiredCollateral
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiredCollateral
		 */
		public Container.RequiredCollateral getRequiredCollateral();
		public void setRequiredCollateral(Container.RequiredCollateral requiredCollateral);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LocalBusiness")
	@SchemaOrgLabel("LocalBusiness")
	@SchemaOrgComment(""
			+ "A particular physical business or branch of an organization. Examples of"
			+ " LocalBusiness include a restaurant, a particular branch of a restaurant chain,"
			+ " a branch of a bank, a medical practice, a club, a bowling alley, etc.")
	@CamelizedName("localBusiness")
	@ConstantizedName("LOCAL_BUSINESS")
	public interface LocalBusiness extends Organization, Place, SchemaOrgClass {

		/**
		 * uri: http://schema.org/currenciesAccepted
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CurrenciesAccepted
		 */
		public Container.CurrenciesAccepted getCurrenciesAccepted();
		public void setCurrenciesAccepted(Container.CurrenciesAccepted currenciesAccepted);

		/**
		 * uri: http://schema.org/openingHours
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OpeningHours
		 */
		public Container.OpeningHours getOpeningHours();
		public void setOpeningHours(Container.OpeningHours openingHours);

		/**
		 * uri: http://schema.org/paymentAccepted
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentAccepted
		 */
		public Container.PaymentAccepted getPaymentAccepted();
		public void setPaymentAccepted(Container.PaymentAccepted paymentAccepted);

		/**
		 * uri: http://schema.org/priceRange
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceRange
		 */
		public Container.PriceRange getPriceRange();
		public void setPriceRange(Container.PriceRange priceRange);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LocationFeatureSpecification")
	@SchemaOrgLabel("LocationFeatureSpecification")
	@SchemaOrgComment(""
			+ "Specifies a location feature by providing a structured value representing a"
			+ " feature of an accommodation as a property-value pair of varying degrees of"
			+ " formality.")
	@CamelizedName("locationFeatureSpecification")
	@ConstantizedName("LOCATION_FEATURE_SPECIFICATION")
	public interface LocationFeatureSpecification extends PropertyValue, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hoursAvailable
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HoursAvailable
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LockerDelivery")
	@SchemaOrgLabel("LockerDelivery")
	@SchemaOrgComment(""
			+ "A DeliveryMethod in which an item is made available via locker.")
	@CamelizedName("lockerDelivery")
	@ConstantizedName("LOCKER_DELIVERY")
	public interface LockerDelivery extends DeliveryMethod, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Locksmith")
	@SchemaOrgLabel("Locksmith")
	@SchemaOrgComment("A locksmith.")
	@CamelizedName("locksmith")
	@ConstantizedName("LOCKSMITH")
	public interface Locksmith extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LodgingBusiness")
	@SchemaOrgLabel("LodgingBusiness")
	@SchemaOrgComment(""
			+ "A lodging business, such as a motel, hotel, or inn.")
	@CamelizedName("lodgingBusiness")
	@ConstantizedName("LODGING_BUSINESS")
	public interface LodgingBusiness extends LocalBusiness, SchemaOrgClass {

		/**
		 * uri: http://schema.org/amenityFeature
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/availableLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableLanguage
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * uri: http://schema.org/checkinTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheckinTime
		 */
		public Container.CheckinTime getCheckinTime();
		public void setCheckinTime(Container.CheckinTime checkinTime);

		/**
		 * uri: http://schema.org/checkoutTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheckoutTime
		 */
		public Container.CheckoutTime getCheckoutTime();
		public void setCheckoutTime(Container.CheckoutTime checkoutTime);

		/**
		 * uri: http://schema.org/petsAllowed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PetsAllowed
		 */
		public Container.PetsAllowed getPetsAllowed();
		public void setPetsAllowed(Container.PetsAllowed petsAllowed);

		/**
		 * uri: http://schema.org/starRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StarRating
		 */
		public Container.StarRating getStarRating();
		public void setStarRating(Container.StarRating starRating);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LodgingReservation")
	@SchemaOrgLabel("LodgingReservation")
	@SchemaOrgComment(""
			+ "A reservation for lodging at a hotel, motel, inn, etc.</p>\n\n<p>Note: This type"
			+ " is for information about actual reservations, e.g. in confirmation emails or"
			+ " HTML pages with individual confirmations of reservations.")
	@CamelizedName("lodgingReservation")
	@ConstantizedName("LODGING_RESERVATION")
	public interface LodgingReservation extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/checkinTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheckinTime
		 */
		public Container.CheckinTime getCheckinTime();
		public void setCheckinTime(Container.CheckinTime checkinTime);

		/**
		 * uri: http://schema.org/checkoutTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheckoutTime
		 */
		public Container.CheckoutTime getCheckoutTime();
		public void setCheckoutTime(Container.CheckoutTime checkoutTime);

		/**
		 * uri: http://schema.org/lodgingUnitDescription
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LodgingUnitDescription
		 */
		public Container.LodgingUnitDescription getLodgingUnitDescription();
		public void setLodgingUnitDescription(Container.LodgingUnitDescription lodgingUnitDescription);

		/**
		 * uri: http://schema.org/lodgingUnitType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LodgingUnitType
		 */
		public Container.LodgingUnitType getLodgingUnitType();
		public void setLodgingUnitType(Container.LodgingUnitType lodgingUnitType);

		/**
		 * uri: http://schema.org/numAdults
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumAdults
		 */
		public Container.NumAdults getNumAdults();
		public void setNumAdults(Container.NumAdults numAdults);

		/**
		 * uri: http://schema.org/numChildren
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumChildren
		 */
		public Container.NumChildren getNumChildren();
		public void setNumChildren(Container.NumChildren numChildren);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LoseAction")
	@SchemaOrgLabel("LoseAction")
	@SchemaOrgComment(""
			+ "The act of being defeated in a competitive activity.")
	@CamelizedName("loseAction")
	@ConstantizedName("LOSE_ACTION")
	public interface LoseAction extends AchieveAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/winner
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Winner
		 */
		public Container.Winner getWinner();
		public void setWinner(Container.Winner winner);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Map")
	@SchemaOrgLabel("Map")
	@SchemaOrgComment("A map.")
	@CamelizedName("map")
	@ConstantizedName("MAP")
	public interface Map extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/mapType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MapType
		 */
		public Container.MapType getMapType();
		public void setMapType(Container.MapType mapType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MapCategoryType")
	@SchemaOrgLabel("MapCategoryType")
	@SchemaOrgComment("An enumeration of several kinds of Map.")
	@CamelizedName("mapCategoryType")
	@ConstantizedName("MAP_CATEGORY_TYPE")
	public interface MapCategoryType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MarryAction")
	@SchemaOrgLabel("MarryAction")
	@SchemaOrgComment("The act of marrying a person.")
	@CamelizedName("marryAction")
	@ConstantizedName("MARRY_ACTION")
	public interface MarryAction extends InteractAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Mass")
	@SchemaOrgLabel("Mass")
	@SchemaOrgComment(""
			+ "Properties that take Mass as values are of the form '&lt;Number&gt; &lt;Mass"
			+ " unit of measure&gt;'. E.g., '7 kg'.")
	@CamelizedName("mass")
	@ConstantizedName("MASS")
	public interface Mass extends Quantity, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MediaObject")
	@SchemaOrgLabel("MediaObject")
	@SchemaOrgComment(""
			+ "A media object, such as an image, video, or audio object embedded in a web page"
			+ " or a downloadable dataset i.e. DataDownload. Note that a creative work may have"
			+ " many media objects associated with it on the same web page. For example, a page"
			+ " about a single song (MusicRecording) may have a music video (VideoObject), and"
			+ " a high and low bandwidth audio stream (2 AudioObject's).")
	@CamelizedName("mediaObject")
	@ConstantizedName("MEDIA_OBJECT")
	public interface MediaObject extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/associatedArticle
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AssociatedArticle
		 */
		public Container.AssociatedArticle getAssociatedArticle();
		public void setAssociatedArticle(Container.AssociatedArticle associatedArticle);

		/**
		 * uri: http://schema.org/bitrate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Bitrate
		 */
		public Container.Bitrate getBitrate();
		public void setBitrate(Container.Bitrate bitrate);

		/**
		 * uri: http://schema.org/contentSize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContentSize
		 */
		public Container.ContentSize getContentSize();
		public void setContentSize(Container.ContentSize contentSize);

		/**
		 * uri: http://schema.org/contentUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContentUrl
		 */
		public Container.ContentUrl getContentUrl();
		public void setContentUrl(Container.ContentUrl contentUrl);

		/**
		 * uri: http://schema.org/duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duration
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * uri: http://schema.org/embedUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EmbedUrl
		 */
		public Container.EmbedUrl getEmbedUrl();
		public void setEmbedUrl(Container.EmbedUrl embedUrl);

		/**
		 * uri: http://schema.org/encodesCreativeWork
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EncodesCreativeWork
		 */
		public Container.EncodesCreativeWork getEncodesCreativeWork();
		public void setEncodesCreativeWork(Container.EncodesCreativeWork encodesCreativeWork);

		/**
		 * uri: http://schema.org/encodingFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EncodingFormat
		 */
		public Container.EncodingFormat getEncodingFormat();
		public void setEncodingFormat(Container.EncodingFormat encodingFormat);

		/**
		 * uri: http://schema.org/height
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Height
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * uri: http://schema.org/playerType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PlayerType
		 */
		public Container.PlayerType getPlayerType();
		public void setPlayerType(Container.PlayerType playerType);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/regionsAllowed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RegionsAllowed
		 */
		public Container.RegionsAllowed getRegionsAllowed();
		public void setRegionsAllowed(Container.RegionsAllowed regionsAllowed);

		/**
		 * uri: http://schema.org/requiresSubscription
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiresSubscription
		 */
		public Container.RequiresSubscription getRequiresSubscription();
		public void setRequiresSubscription(Container.RequiresSubscription requiresSubscription);

		/**
		 * uri: http://schema.org/uploadDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UploadDate
		 */
		public Container.UploadDate getUploadDate();
		public void setUploadDate(Container.UploadDate uploadDate);

		/**
		 * uri: http://schema.org/width
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Width
		 */
		public Container.Width getWidth();
		public void setWidth(Container.Width width);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MedicalOrganization")
	@SchemaOrgLabel("MedicalOrganization")
	@SchemaOrgComment(""
			+ "A medical organization (physical or not), such as hospital, institution or"
			+ " clinic.")
	@CamelizedName("medicalOrganization")
	@ConstantizedName("MEDICAL_ORGANIZATION")
	public interface MedicalOrganization extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthPlanNetworkId
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.HealthPlanNetworkId
		 */
		public HealthPlanNetworkId getHealthPlanNetworkId();
		public void setHealthPlanNetworkId(HealthPlanNetworkId healthPlanNetworkId);

		/**
		 * uri: http://schema.org/isAcceptingNewPatients
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.IsAcceptingNewPatients
		 */
		public IsAcceptingNewPatients getIsAcceptingNewPatients();
		public void setIsAcceptingNewPatients(IsAcceptingNewPatients isAcceptingNewPatients);

		/**
		 * uri: http://schema.org/medicalSpecialty
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicalSpecialty
		 */
		public MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MeetingRoom")
	@SchemaOrgLabel("MeetingRoom")
	@SchemaOrgComment(""
			+ "A meeting room, conference room, or conference hall is a room provided for"
			+ " singular events such as business conferences and meetings (Source: Wikipedia,"
			+ " the free encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/Conference_hall\">http://en.wikipedia.org/wiki/Conference_hall</a>).\n<br"
			+ " /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the"
			+ " use of schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("meetingRoom")
	@ConstantizedName("MEETING_ROOM")
	public interface MeetingRoom extends Room, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MensClothingStore")
	@SchemaOrgLabel("MensClothingStore")
	@SchemaOrgComment("A men's clothing store.")
	@CamelizedName("mensClothingStore")
	@ConstantizedName("MENS_CLOTHING_STORE")
	public interface MensClothingStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Menu")
	@SchemaOrgLabel("Menu")
	@SchemaOrgComment(""
			+ "A structured representation of food or drink items available from a"
			+ " FoodEstablishment.")
	@CamelizedName("menu")
	@ConstantizedName("MENU")
	public interface Menu extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hasMenuItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMenuItem
		 */
		public Container.HasMenuItem getHasMenuItem();
		public void setHasMenuItem(Container.HasMenuItem hasMenuItem);

		/**
		 * uri: http://schema.org/hasMenuSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMenuSection
		 */
		public Container.HasMenuSection getHasMenuSection();
		public void setHasMenuSection(Container.HasMenuSection hasMenuSection);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MenuItem")
	@SchemaOrgLabel("MenuItem")
	@SchemaOrgComment(""
			+ "A food or drink item listed in a menu or menu section.")
	@CamelizedName("menuItem")
	@ConstantizedName("MENU_ITEM")
	public interface MenuItem extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/menuAddOn
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MenuAddOn
		 */
		public MenuAddOn getMenuAddOn();
		public void setMenuAddOn(MenuAddOn menuAddOn);

		/**
		 * uri: http://schema.org/nutrition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Nutrition
		 */
		public Container.Nutrition getNutrition();
		public void setNutrition(Container.Nutrition nutrition);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * uri: http://schema.org/suitableForDiet
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuitableForDiet
		 */
		public Container.SuitableForDiet getSuitableForDiet();
		public void setSuitableForDiet(Container.SuitableForDiet suitableForDiet);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MenuSection")
	@SchemaOrgLabel("MenuSection")
	@SchemaOrgComment(""
			+ "A sub-grouping of food or drink items in a menu. E.g. courses (such as 'Dinner',"
			+ " 'Breakfast', etc.), specific type of dishes (such as 'Meat', 'Vegan', 'Drinks',"
			+ " etc.), or some other classification made by the menu provider.")
	@CamelizedName("menuSection")
	@ConstantizedName("MENU_SECTION")
	public interface MenuSection extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hasMenuItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMenuItem
		 */
		public Container.HasMenuItem getHasMenuItem();
		public void setHasMenuItem(Container.HasMenuItem hasMenuItem);

		/**
		 * uri: http://schema.org/hasMenuSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMenuSection
		 */
		public Container.HasMenuSection getHasMenuSection();
		public void setHasMenuSection(Container.HasMenuSection hasMenuSection);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Message")
	@SchemaOrgLabel("Message")
	@SchemaOrgComment(""
			+ "A single message from a sender to one or more organizations or people.")
	@CamelizedName("message")
	@ConstantizedName("MESSAGE")
	public interface Message extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/bccRecipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BccRecipient
		 */
		public Container.BccRecipient getBccRecipient();
		public void setBccRecipient(Container.BccRecipient bccRecipient);

		/**
		 * uri: http://schema.org/ccRecipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CcRecipient
		 */
		public Container.CcRecipient getCcRecipient();
		public void setCcRecipient(Container.CcRecipient ccRecipient);

		/**
		 * uri: http://schema.org/dateRead
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateRead
		 */
		public Container.DateRead getDateRead();
		public void setDateRead(Container.DateRead dateRead);

		/**
		 * uri: http://schema.org/dateReceived
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateReceived
		 */
		public Container.DateReceived getDateReceived();
		public void setDateReceived(Container.DateReceived dateReceived);

		/**
		 * uri: http://schema.org/dateSent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateSent
		 */
		public Container.DateSent getDateSent();
		public void setDateSent(Container.DateSent dateSent);

		/**
		 * uri: http://schema.org/messageAttachment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MessageAttachment
		 */
		public Container.MessageAttachment getMessageAttachment();
		public void setMessageAttachment(Container.MessageAttachment messageAttachment);

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		/**
		 * uri: http://schema.org/sender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sender
		 */
		public Container.Sender getSender();
		public void setSender(Container.Sender sender);

		/**
		 * uri: http://schema.org/toRecipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ToRecipient
		 */
		public Container.ToRecipient getToRecipient();
		public void setToRecipient(Container.ToRecipient toRecipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MiddleSchool")
	@SchemaOrgLabel("MiddleSchool")
	@SchemaOrgComment(""
			+ "A middle school (typically for children aged around 11-14, although this varies"
			+ " somewhat).")
	@CamelizedName("middleSchool")
	@ConstantizedName("MIDDLE_SCHOOL")
	public interface MiddleSchool extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MobileApplication")
	@SchemaOrgLabel("MobileApplication")
	@SchemaOrgComment(""
			+ "A software application designed specifically to work well on a mobile device"
			+ " such as a telephone.")
	@CamelizedName("mobileApplication")
	@ConstantizedName("MOBILE_APPLICATION")
	public interface MobileApplication extends SchemaOrgClass, SoftwareApplication {

		/**
		 * uri: http://schema.org/carrierRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CarrierRequirements
		 */
		public Container.CarrierRequirements getCarrierRequirements();
		public void setCarrierRequirements(Container.CarrierRequirements carrierRequirements);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MobilePhoneStore")
	@SchemaOrgLabel("MobilePhoneStore")
	@SchemaOrgComment(""
			+ "A store that sells mobile phones and related accessories.")
	@CamelizedName("mobilePhoneStore")
	@ConstantizedName("MOBILE_PHONE_STORE")
	public interface MobilePhoneStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MonetaryAmount")
	@SchemaOrgLabel("MonetaryAmount")
	@SchemaOrgComment(""
			+ "A monetary value or range. This type can be used to describe an amount of money"
			+ " such as $50 USD, or a range as in describing a bank account being suitable for"
			+ " a balance between £1,000 and £1,000,000 GBP, or the value of a salary, etc. It"
			+ " is recommended to use <a class=\"localLink\""
			+ " href=\"http://schema.org/PriceSpecification\">PriceSpecification</a> Types to"
			+ " describe the price of an Offer, Invoice, etc.")
	@CamelizedName("monetaryAmount")
	@ConstantizedName("MONETARY_AMOUNT")
	public interface MonetaryAmount extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/currency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Currency
		 */
		public Container.Currency getCurrency();
		public void setCurrency(Container.Currency currency);

		/**
		 * uri: http://schema.org/maxValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaxValue
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * uri: http://schema.org/minValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinValue
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * uri: http://schema.org/value
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Value
		 */
		public Container.Value getValue();
		public void setValue(Container.Value value);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Mosque")
	@SchemaOrgLabel("Mosque")
	@SchemaOrgComment("A mosque.")
	@CamelizedName("mosque")
	@ConstantizedName("MOSQUE")
	public interface Mosque extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Motel")
	@SchemaOrgLabel("Motel")
	@SchemaOrgComment(""
			+ "A motel.\n<br /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated"
			+ " document on the use of schema.org for marking up hotels and other forms of"
			+ " accommodations</a>.")
	@CamelizedName("motel")
	@ConstantizedName("MOTEL")
	public interface Motel extends LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MotorcycleDealer")
	@SchemaOrgLabel("MotorcycleDealer")
	@SchemaOrgComment("A motorcycle dealer.")
	@CamelizedName("motorcycleDealer")
	@ConstantizedName("MOTORCYCLE_DEALER")
	public interface MotorcycleDealer extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MotorcycleRepair")
	@SchemaOrgLabel("MotorcycleRepair")
	@SchemaOrgComment("A motorcycle repair shop.")
	@CamelizedName("motorcycleRepair")
	@ConstantizedName("MOTORCYCLE_REPAIR")
	public interface MotorcycleRepair extends AutomotiveBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Mountain")
	@SchemaOrgLabel("Mountain")
	@SchemaOrgComment(""
			+ "A mountain, like Mount Whitney or Mount Everest.")
	@CamelizedName("mountain")
	@ConstantizedName("MOUNTAIN")
	public interface Mountain extends Landform, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MoveAction")
	@SchemaOrgLabel("MoveAction")
	@SchemaOrgComment(""
			+ "<p>The act of an agent relocating to a place.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/TransferAction\">TransferAction</a>: Unlike"
			+ " TransferAction, the subject of the move is a living Person or Organization"
			+ " rather than an inanimate object.</li>\n</ul>\n")
	@CamelizedName("moveAction")
	@ConstantizedName("MOVE_ACTION")
	public interface MoveAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/fromLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FromLocation
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * uri: http://schema.org/toLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ToLocation
		 */
		public Container.ToLocation getToLocation();
		public void setToLocation(Container.ToLocation toLocation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Movie")
	@SchemaOrgLabel("Movie")
	@SchemaOrgComment("A movie.")
	@CamelizedName("movie")
	@ConstantizedName("MOVIE")
	public interface Movie extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/countryOfOrigin
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountryOfOrigin
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duration
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/subtitleLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubtitleLanguage
		 */
		public Container.SubtitleLanguage getSubtitleLanguage();
		public void setSubtitleLanguage(Container.SubtitleLanguage subtitleLanguage);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MovieClip")
	@SchemaOrgLabel("MovieClip")
	@SchemaOrgComment("A short segment/part of a movie.")
	@CamelizedName("movieClip")
	@ConstantizedName("MOVIE_CLIP")
	public interface MovieClip extends Clip, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MovieRentalStore")
	@SchemaOrgLabel("MovieRentalStore")
	@SchemaOrgComment("A movie rental store.")
	@CamelizedName("movieRentalStore")
	@ConstantizedName("MOVIE_RENTAL_STORE")
	public interface MovieRentalStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MovieSeries")
	@SchemaOrgLabel("MovieSeries")
	@SchemaOrgComment(""
			+ "A series of movies. Included movies can be indicated with the hasPart property.")
	@CamelizedName("movieSeries")
	@ConstantizedName("MOVIE_SERIES")
	public interface MovieSeries extends CreativeWorkSeries, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MovieTheater")
	@SchemaOrgLabel("MovieTheater")
	@SchemaOrgComment("A movie theater.")
	@CamelizedName("movieTheater")
	@ConstantizedName("MOVIE_THEATER")
	public interface MovieTheater extends CivicStructure, EntertainmentBusiness, SchemaOrgClass {

		/**
		 * uri: http://schema.org/screenCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ScreenCount
		 */
		public Container.ScreenCount getScreenCount();
		public void setScreenCount(Container.ScreenCount screenCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MovingCompany")
	@SchemaOrgLabel("MovingCompany")
	@SchemaOrgComment("A moving company.")
	@CamelizedName("movingCompany")
	@ConstantizedName("MOVING_COMPANY")
	public interface MovingCompany extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Museum")
	@SchemaOrgLabel("Museum")
	@SchemaOrgComment("A museum.")
	@CamelizedName("museum")
	@ConstantizedName("MUSEUM")
	public interface Museum extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicAlbum")
	@SchemaOrgLabel("MusicAlbum")
	@SchemaOrgComment("A collection of music tracks.")
	@CamelizedName("musicAlbum")
	@ConstantizedName("MUSIC_ALBUM")
	public interface MusicAlbum extends MusicPlaylist, SchemaOrgClass {

		/**
		 * uri: http://schema.org/albumProductionType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlbumProductionType
		 */
		public Container.AlbumProductionType getAlbumProductionType();
		public void setAlbumProductionType(Container.AlbumProductionType albumProductionType);

		/**
		 * uri: http://schema.org/albumRelease
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlbumRelease
		 */
		public Container.AlbumRelease getAlbumRelease();
		public void setAlbumRelease(Container.AlbumRelease albumRelease);

		/**
		 * uri: http://schema.org/albumReleaseType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlbumReleaseType
		 */
		public Container.AlbumReleaseType getAlbumReleaseType();
		public void setAlbumReleaseType(Container.AlbumReleaseType albumReleaseType);

		/**
		 * uri: http://schema.org/byArtist
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ByArtist
		 */
		public Container.ByArtist getByArtist();
		public void setByArtist(Container.ByArtist byArtist);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicAlbumProductionType")
	@SchemaOrgLabel("MusicAlbumProductionType")
	@SchemaOrgComment(""
			+ "Classification of the album by it's type of content: soundtrack, live album,"
			+ " studio album, etc.")
	@CamelizedName("musicAlbumProductionType")
	@ConstantizedName("MUSIC_ALBUM_PRODUCTION_TYPE")
	public interface MusicAlbumProductionType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicAlbumReleaseType")
	@SchemaOrgLabel("MusicAlbumReleaseType")
	@SchemaOrgComment(""
			+ "The kind of release which this album is: single, EP or album.")
	@CamelizedName("musicAlbumReleaseType")
	@ConstantizedName("MUSIC_ALBUM_RELEASE_TYPE")
	public interface MusicAlbumReleaseType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicComposition")
	@SchemaOrgLabel("MusicComposition")
	@SchemaOrgComment("A musical composition.")
	@CamelizedName("musicComposition")
	@ConstantizedName("MUSIC_COMPOSITION")
	public interface MusicComposition extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/composer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Composer
		 */
		public Container.Composer getComposer();
		public void setComposer(Container.Composer composer);

		/**
		 * uri: http://schema.org/firstPerformance
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FirstPerformance
		 */
		public Container.FirstPerformance getFirstPerformance();
		public void setFirstPerformance(Container.FirstPerformance firstPerformance);

		/**
		 * uri: http://schema.org/includedComposition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IncludedComposition
		 */
		public Container.IncludedComposition getIncludedComposition();
		public void setIncludedComposition(Container.IncludedComposition includedComposition);

		/**
		 * uri: http://schema.org/iswcCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IswcCode
		 */
		public Container.IswcCode getIswcCode();
		public void setIswcCode(Container.IswcCode iswcCode);

		/**
		 * uri: http://schema.org/lyricist
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Lyricist
		 */
		public Container.Lyricist getLyricist();
		public void setLyricist(Container.Lyricist lyricist);

		/**
		 * uri: http://schema.org/lyrics
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Lyrics
		 */
		public Container.Lyrics getLyrics();
		public void setLyrics(Container.Lyrics lyrics);

		/**
		 * uri: http://schema.org/musicArrangement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicArrangement
		 */
		public Container.MusicArrangement getMusicArrangement();
		public void setMusicArrangement(Container.MusicArrangement musicArrangement);

		/**
		 * uri: http://schema.org/musicCompositionForm
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicCompositionForm
		 */
		public Container.MusicCompositionForm getMusicCompositionForm();
		public void setMusicCompositionForm(Container.MusicCompositionForm musicCompositionForm);

		/**
		 * uri: http://schema.org/musicalKey
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicalKey
		 */
		public Container.MusicalKey getMusicalKey();
		public void setMusicalKey(Container.MusicalKey musicalKey);

		/**
		 * uri: http://schema.org/recordedAs
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecordedAs
		 */
		public Container.RecordedAs getRecordedAs();
		public void setRecordedAs(Container.RecordedAs recordedAs);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicEvent")
	@SchemaOrgLabel("MusicEvent")
	@SchemaOrgComment("Event type: Music event.")
	@CamelizedName("musicEvent")
	@ConstantizedName("MUSIC_EVENT")
	public interface MusicEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicGroup")
	@SchemaOrgLabel("MusicGroup")
	@SchemaOrgComment(""
			+ "A musical group, such as a band, an orchestra, or a choir. Can also be a solo"
			+ " musician.")
	@CamelizedName("musicGroup")
	@ConstantizedName("MUSIC_GROUP")
	public interface MusicGroup extends PerformingGroup, SchemaOrgClass {

		/**
		 * uri: http://schema.org/album
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Album
		 */
		public Container.Album getAlbum();
		public void setAlbum(Container.Album album);

		/**
		 * uri: http://schema.org/genre
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Genre
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * uri: http://schema.org/track
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Track
		 */
		public Container.Track getTrack();
		public void setTrack(Container.Track track);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicPlaylist")
	@SchemaOrgLabel("MusicPlaylist")
	@SchemaOrgComment(""
			+ "A collection of music tracks in playlist form.")
	@CamelizedName("musicPlaylist")
	@ConstantizedName("MUSIC_PLAYLIST")
	public interface MusicPlaylist extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numTracks
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumTracks
		 */
		public Container.NumTracks getNumTracks();
		public void setNumTracks(Container.NumTracks numTracks);

		/**
		 * uri: http://schema.org/track
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Track
		 */
		public Container.Track getTrack();
		public void setTrack(Container.Track track);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicRecording")
	@SchemaOrgLabel("MusicRecording")
	@SchemaOrgComment(""
			+ "A music recording (track), usually a single song.")
	@CamelizedName("musicRecording")
	@ConstantizedName("MUSIC_RECORDING")
	public interface MusicRecording extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/byArtist
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ByArtist
		 */
		public Container.ByArtist getByArtist();
		public void setByArtist(Container.ByArtist byArtist);

		/**
		 * uri: http://schema.org/duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duration
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * uri: http://schema.org/inAlbum
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InAlbum
		 */
		public Container.InAlbum getInAlbum();
		public void setInAlbum(Container.InAlbum inAlbum);

		/**
		 * uri: http://schema.org/inPlaylist
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InPlaylist
		 */
		public Container.InPlaylist getInPlaylist();
		public void setInPlaylist(Container.InPlaylist inPlaylist);

		/**
		 * uri: http://schema.org/isrcCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsrcCode
		 */
		public Container.IsrcCode getIsrcCode();
		public void setIsrcCode(Container.IsrcCode isrcCode);

		/**
		 * uri: http://schema.org/recordingOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecordingOf
		 */
		public Container.RecordingOf getRecordingOf();
		public void setRecordingOf(Container.RecordingOf recordingOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicRelease")
	@SchemaOrgLabel("MusicRelease")
	@SchemaOrgComment(""
			+ "A MusicRelease is a specific release of a music album.")
	@CamelizedName("musicRelease")
	@ConstantizedName("MUSIC_RELEASE")
	public interface MusicRelease extends MusicPlaylist, SchemaOrgClass {

		/**
		 * uri: http://schema.org/catalogNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CatalogNumber
		 */
		public Container.CatalogNumber getCatalogNumber();
		public void setCatalogNumber(Container.CatalogNumber catalogNumber);

		/**
		 * uri: http://schema.org/creditedTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CreditedTo
		 */
		public Container.CreditedTo getCreditedTo();
		public void setCreditedTo(Container.CreditedTo creditedTo);

		/**
		 * uri: http://schema.org/duration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duration
		 */
		public Container.Duration getDuration();
		public void setDuration(Container.Duration duration);

		/**
		 * uri: http://schema.org/musicReleaseFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicReleaseFormat
		 */
		public Container.MusicReleaseFormat getMusicReleaseFormat();
		public void setMusicReleaseFormat(Container.MusicReleaseFormat musicReleaseFormat);

		/**
		 * uri: http://schema.org/recordLabel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecordLabel
		 */
		public Container.RecordLabel getRecordLabel();
		public void setRecordLabel(Container.RecordLabel recordLabel);

		/**
		 * uri: http://schema.org/releaseOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReleaseOf
		 */
		public Container.ReleaseOf getReleaseOf();
		public void setReleaseOf(Container.ReleaseOf releaseOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicReleaseFormatType")
	@SchemaOrgLabel("MusicReleaseFormatType")
	@SchemaOrgComment(""
			+ "Format of this release (the type of recording media used, ie. compact disc,"
			+ " digital media, LP, etc.).")
	@CamelizedName("musicReleaseFormatType")
	@ConstantizedName("MUSIC_RELEASE_FORMAT_TYPE")
	public interface MusicReleaseFormatType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicStore")
	@SchemaOrgLabel("MusicStore")
	@SchemaOrgComment("A music store.")
	@CamelizedName("musicStore")
	@ConstantizedName("MUSIC_STORE")
	public interface MusicStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicVenue")
	@SchemaOrgLabel("MusicVenue")
	@SchemaOrgComment("A music venue.")
	@CamelizedName("musicVenue")
	@ConstantizedName("MUSIC_VENUE")
	public interface MusicVenue extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MusicVideoObject")
	@SchemaOrgLabel("MusicVideoObject")
	@SchemaOrgComment("A music video file.")
	@CamelizedName("musicVideoObject")
	@ConstantizedName("MUSIC_VIDEO_OBJECT")
	public interface MusicVideoObject extends MediaObject, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NGO")
	@SchemaOrgLabel("NGO")
	@SchemaOrgComment(""
			+ "Organization: Non-governmental Organization.")
	@CamelizedName("ngo")
	@ConstantizedName("NGO")
	public interface NGO extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NailSalon")
	@SchemaOrgLabel("NailSalon")
	@SchemaOrgComment("A nail salon.")
	@CamelizedName("nailSalon")
	@ConstantizedName("NAIL_SALON")
	public interface NailSalon extends HealthAndBeautyBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NewsArticle")
	@SchemaOrgLabel("NewsArticle")
	@SchemaOrgComment(""
			+ "A NewsArticle is an article whose content reports news, or provides background"
			+ " context and supporting materials for understanding the news.</p>\n\n<p>A more"
			+ " detailed overview of <a href=\"/docs/news.html\">schema.org News markup</a> is"
			+ " also available.")
	@CamelizedName("newsArticle")
	@ConstantizedName("NEWS_ARTICLE")
	public interface NewsArticle extends Article, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dateline
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Dateline
		 */
		public Container.Dateline getDateline();
		public void setDateline(Container.Dateline dateline);

		/**
		 * uri: http://schema.org/printColumn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrintColumn
		 */
		public Container.PrintColumn getPrintColumn();
		public void setPrintColumn(Container.PrintColumn printColumn);

		/**
		 * uri: http://schema.org/printEdition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrintEdition
		 */
		public Container.PrintEdition getPrintEdition();
		public void setPrintEdition(Container.PrintEdition printEdition);

		/**
		 * uri: http://schema.org/printPage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrintPage
		 */
		public Container.PrintPage getPrintPage();
		public void setPrintPage(Container.PrintPage printPage);

		/**
		 * uri: http://schema.org/printSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrintSection
		 */
		public Container.PrintSection getPrintSection();
		public void setPrintSection(Container.PrintSection printSection);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NightClub")
	@SchemaOrgLabel("NightClub")
	@SchemaOrgComment("A nightclub or discotheque.")
	@CamelizedName("nightClub")
	@ConstantizedName("NIGHT_CLUB")
	public interface NightClub extends EntertainmentBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Notary")
	@SchemaOrgLabel("Notary")
	@SchemaOrgComment("A notary.")
	@CamelizedName("notary")
	@ConstantizedName("NOTARY")
	public interface Notary extends LegalService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NoteDigitalDocument")
	@SchemaOrgLabel("NoteDigitalDocument")
	@SchemaOrgComment(""
			+ "A file containing a note, primarily for the author.")
	@CamelizedName("noteDigitalDocument")
	@ConstantizedName("NOTE_DIGITAL_DOCUMENT")
	public interface NoteDigitalDocument extends DigitalDocument, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/NutritionInformation")
	@SchemaOrgLabel("NutritionInformation")
	@SchemaOrgComment(""
			+ "Nutritional information about the recipe.")
	@CamelizedName("nutritionInformation")
	@ConstantizedName("NUTRITION_INFORMATION")
	public interface NutritionInformation extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/calories
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Calories
		 */
		public Container.Calories getCalories();
		public void setCalories(Container.Calories calories);

		/**
		 * uri: http://schema.org/carbohydrateContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CarbohydrateContent
		 */
		public Container.CarbohydrateContent getCarbohydrateContent();
		public void setCarbohydrateContent(Container.CarbohydrateContent carbohydrateContent);

		/**
		 * uri: http://schema.org/cholesterolContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CholesterolContent
		 */
		public Container.CholesterolContent getCholesterolContent();
		public void setCholesterolContent(Container.CholesterolContent cholesterolContent);

		/**
		 * uri: http://schema.org/fatContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FatContent
		 */
		public Container.FatContent getFatContent();
		public void setFatContent(Container.FatContent fatContent);

		/**
		 * uri: http://schema.org/fiberContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FiberContent
		 */
		public Container.FiberContent getFiberContent();
		public void setFiberContent(Container.FiberContent fiberContent);

		/**
		 * uri: http://schema.org/proteinContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProteinContent
		 */
		public Container.ProteinContent getProteinContent();
		public void setProteinContent(Container.ProteinContent proteinContent);

		/**
		 * uri: http://schema.org/saturatedFatContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SaturatedFatContent
		 */
		public Container.SaturatedFatContent getSaturatedFatContent();
		public void setSaturatedFatContent(Container.SaturatedFatContent saturatedFatContent);

		/**
		 * uri: http://schema.org/servingSize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServingSize
		 */
		public Container.ServingSize getServingSize();
		public void setServingSize(Container.ServingSize servingSize);

		/**
		 * uri: http://schema.org/sodiumContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SodiumContent
		 */
		public Container.SodiumContent getSodiumContent();
		public void setSodiumContent(Container.SodiumContent sodiumContent);

		/**
		 * uri: http://schema.org/sugarContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SugarContent
		 */
		public Container.SugarContent getSugarContent();
		public void setSugarContent(Container.SugarContent sugarContent);

		/**
		 * uri: http://schema.org/transFatContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TransFatContent
		 */
		public Container.TransFatContent getTransFatContent();
		public void setTransFatContent(Container.TransFatContent transFatContent);

		/**
		 * uri: http://schema.org/unsaturatedFatContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnsaturatedFatContent
		 */
		public Container.UnsaturatedFatContent getUnsaturatedFatContent();
		public void setUnsaturatedFatContent(Container.UnsaturatedFatContent unsaturatedFatContent);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OceanBodyOfWater")
	@SchemaOrgLabel("OceanBodyOfWater")
	@SchemaOrgComment("An ocean (for example, the Pacific).")
	@CamelizedName("oceanBodyOfWater")
	@ConstantizedName("OCEAN_BODY_OF_WATER")
	public interface OceanBodyOfWater extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Offer")
	@SchemaOrgLabel("Offer")
	@SchemaOrgComment(""
			+ "An offer to transfer some rights to an item or to provide a service — for"
			+ " example, an offer to sell tickets to an event, to rent the DVD of a movie, to"
			+ " stream a TV show over the internet, to repair a motorcycle, or to loan a"
			+ " book.</p>\n\n<p>For <a"
			+ " href=\"http://www.gs1.org/barcodes/technical/idkeys/gtin\">GTIN</a>-related"
			+ " fields, see <a"
			+ " href=\"http://www.gs1.org/barcodes/support/check_digit_calculator\">Check Digit"
			+ " calculator</a> and <a"
			+ " href=\"http://www.gs1us.org/resources/standards/gtin-validation-guide\">validation"
			+ " guide</a> from <a href=\"http://www.gs1.org/\">GS1</a>.")
	@CamelizedName("offer")
	@ConstantizedName("OFFER")
	public interface Offer extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/acceptedPaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcceptedPaymentMethod
		 */
		public Container.AcceptedPaymentMethod getAcceptedPaymentMethod();
		public void setAcceptedPaymentMethod(Container.AcceptedPaymentMethod acceptedPaymentMethod);

		/**
		 * uri: http://schema.org/addOn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddOn
		 */
		public Container.AddOn getAddOn();
		public void setAddOn(Container.AddOn addOn);

		/**
		 * uri: http://schema.org/advanceBookingRequirement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdvanceBookingRequirement
		 */
		public Container.AdvanceBookingRequirement getAdvanceBookingRequirement();
		public void setAdvanceBookingRequirement(Container.AdvanceBookingRequirement advanceBookingRequirement);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/availability
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Availability
		 */
		public Container.Availability getAvailability();
		public void setAvailability(Container.Availability availability);

		/**
		 * uri: http://schema.org/availabilityEnds
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityEnds
		 */
		public Container.AvailabilityEnds getAvailabilityEnds();
		public void setAvailabilityEnds(Container.AvailabilityEnds availabilityEnds);

		/**
		 * uri: http://schema.org/availabilityStarts
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityStarts
		 */
		public Container.AvailabilityStarts getAvailabilityStarts();
		public void setAvailabilityStarts(Container.AvailabilityStarts availabilityStarts);

		/**
		 * uri: http://schema.org/availableAtOrFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableAtOrFrom
		 */
		public Container.AvailableAtOrFrom getAvailableAtOrFrom();
		public void setAvailableAtOrFrom(Container.AvailableAtOrFrom availableAtOrFrom);

		/**
		 * uri: http://schema.org/availableDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableDeliveryMethod
		 */
		public Container.AvailableDeliveryMethod getAvailableDeliveryMethod();
		public void setAvailableDeliveryMethod(Container.AvailableDeliveryMethod availableDeliveryMethod);

		/**
		 * uri: http://schema.org/businessFunction
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BusinessFunction
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Container.Category getCategory();
		public void setCategory(Container.Category category);

		/**
		 * uri: http://schema.org/deliveryLeadTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryLeadTime
		 */
		public Container.DeliveryLeadTime getDeliveryLeadTime();
		public void setDeliveryLeadTime(Container.DeliveryLeadTime deliveryLeadTime);

		/**
		 * uri: http://schema.org/eligibleCustomerType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleCustomerType
		 */
		public Container.EligibleCustomerType getEligibleCustomerType();
		public void setEligibleCustomerType(Container.EligibleCustomerType eligibleCustomerType);

		/**
		 * uri: http://schema.org/eligibleDuration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleDuration
		 */
		public Container.EligibleDuration getEligibleDuration();
		public void setEligibleDuration(Container.EligibleDuration eligibleDuration);

		/**
		 * uri: http://schema.org/eligibleQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleQuantity
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * uri: http://schema.org/eligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleRegion
		 */
		public Container.EligibleRegion getEligibleRegion();
		public void setEligibleRegion(Container.EligibleRegion eligibleRegion);

		/**
		 * uri: http://schema.org/eligibleTransactionVolume
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleTransactionVolume
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * uri: http://schema.org/gtin12
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin12
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * uri: http://schema.org/gtin13
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin13
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * uri: http://schema.org/gtin14
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin14
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * uri: http://schema.org/gtin8
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin8
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * uri: http://schema.org/includesObject
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IncludesObject
		 */
		public Container.IncludesObject getIncludesObject();
		public void setIncludesObject(Container.IncludesObject includesObject);

		/**
		 * uri: http://schema.org/ineligibleRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IneligibleRegion
		 */
		public Container.IneligibleRegion getIneligibleRegion();
		public void setIneligibleRegion(Container.IneligibleRegion ineligibleRegion);

		/**
		 * uri: http://schema.org/inventoryLevel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InventoryLevel
		 */
		public Container.InventoryLevel getInventoryLevel();
		public void setInventoryLevel(Container.InventoryLevel inventoryLevel);

		/**
		 * uri: http://schema.org/itemCondition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemCondition
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * uri: http://schema.org/itemOffered
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemOffered
		 */
		public Container.ItemOffered getItemOffered();
		public void setItemOffered(Container.ItemOffered itemOffered);

		/**
		 * uri: http://schema.org/mpn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Mpn
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * uri: http://schema.org/offeredBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OfferedBy
		 */
		public Container.OfferedBy getOfferedBy();
		public void setOfferedBy(Container.OfferedBy offeredBy);

		/**
		 * uri: http://schema.org/price
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Price
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * uri: http://schema.org/priceCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * uri: http://schema.org/priceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification
		 */
		public Container.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Container.PriceSpecification priceSpecification);

		/**
		 * uri: http://schema.org/priceValidUntil
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceValidUntil
		 */
		public Container.PriceValidUntil getPriceValidUntil();
		public void setPriceValidUntil(Container.PriceValidUntil priceValidUntil);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/seller
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seller
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * uri: http://schema.org/serialNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SerialNumber
		 */
		public Container.SerialNumber getSerialNumber();
		public void setSerialNumber(Container.SerialNumber serialNumber);

		/**
		 * uri: http://schema.org/sku
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sku
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * uri: http://schema.org/warranty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Warranty
		 */
		public Container.Warranty getWarranty();
		public void setWarranty(Container.Warranty warranty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfferCatalog")
	@SchemaOrgLabel("OfferCatalog")
	@SchemaOrgComment(""
			+ "An OfferCatalog is an ItemList that contains related Offers and/or further"
			+ " OfferCatalogs that are offeredBy the same provider.")
	@CamelizedName("offerCatalog")
	@ConstantizedName("OFFER_CATALOG")
	public interface OfferCatalog extends ItemList, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfferItemCondition")
	@SchemaOrgLabel("OfferItemCondition")
	@SchemaOrgComment(""
			+ "A list of possible conditions for the item.")
	@CamelizedName("offerItemCondition")
	@ConstantizedName("OFFER_ITEM_CONDITION")
	public interface OfferItemCondition extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfficeEquipmentStore")
	@SchemaOrgLabel("OfficeEquipmentStore")
	@SchemaOrgComment("An office equipment store.")
	@CamelizedName("officeEquipmentStore")
	@ConstantizedName("OFFICE_EQUIPMENT_STORE")
	public interface OfficeEquipmentStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OnDemandEvent")
	@SchemaOrgLabel("OnDemandEvent")
	@SchemaOrgComment(""
			+ "A publication event e.g. catch-up TV or radio podcast, during which a program is"
			+ " available on-demand.")
	@CamelizedName("onDemandEvent")
	@ConstantizedName("ON_DEMAND_EVENT")
	public interface OnDemandEvent extends PublicationEvent, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OpeningHoursSpecification")
	@SchemaOrgLabel("OpeningHoursSpecification")
	@SchemaOrgComment(""
			+ "A structured value providing information about the opening hours of a place or a"
			+ " certain service inside a place.</p>\n\n<p>The place is <strong>open</strong> if"
			+ " the <a class=\"localLink\" href=\"http://schema.org/opens\">opens</a> property"
			+ " is specified, and <strong>closed</strong> otherwise.</p>\n\n<p>If the value for"
			+ " the <a class=\"localLink\" href=\"http://schema.org/closes\">closes</a>"
			+ " property is less than the value for the <a class=\"localLink\""
			+ " href=\"http://schema.org/opens\">opens</a> property then the hour range is"
			+ " assumed to span over the next day.")
	@CamelizedName("openingHoursSpecification")
	@ConstantizedName("OPENING_HOURS_SPECIFICATION")
	public interface OpeningHoursSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/closes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Closes
		 */
		public Container.Closes getCloses();
		public void setCloses(Container.Closes closes);

		/**
		 * uri: http://schema.org/dayOfWeek
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DayOfWeek
		 */
		public Container.DayOfWeek getDayOfWeek();
		public void setDayOfWeek(Container.DayOfWeek dayOfWeek);

		/**
		 * uri: http://schema.org/opens
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Opens
		 */
		public Container.Opens getOpens();
		public void setOpens(Container.Opens opens);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Order")
	@SchemaOrgLabel("Order")
	@SchemaOrgComment(""
			+ "An order is a confirmation of a transaction (a receipt), which can contain"
			+ " multiple line items, each represented by an Offer that has been accepted by the"
			+ " customer.")
	@CamelizedName("order")
	@ConstantizedName("ORDER")
	public interface Order extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/acceptedOffer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcceptedOffer
		 */
		public Container.AcceptedOffer getAcceptedOffer();
		public void setAcceptedOffer(Container.AcceptedOffer acceptedOffer);

		/**
		 * uri: http://schema.org/billingAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BillingAddress
		 */
		public Container.BillingAddress getBillingAddress();
		public void setBillingAddress(Container.BillingAddress billingAddress);

		/**
		 * uri: http://schema.org/broker
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Broker
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * uri: http://schema.org/confirmationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ConfirmationNumber
		 */
		public Container.ConfirmationNumber getConfirmationNumber();
		public void setConfirmationNumber(Container.ConfirmationNumber confirmationNumber);

		/**
		 * uri: http://schema.org/customer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Customer
		 */
		public Container.Customer getCustomer();
		public void setCustomer(Container.Customer customer);

		/**
		 * uri: http://schema.org/discount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Discount
		 */
		public Container.Discount getDiscount();
		public void setDiscount(Container.Discount discount);

		/**
		 * uri: http://schema.org/discountCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DiscountCode
		 */
		public Container.DiscountCode getDiscountCode();
		public void setDiscountCode(Container.DiscountCode discountCode);

		/**
		 * uri: http://schema.org/discountCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DiscountCurrency
		 */
		public Container.DiscountCurrency getDiscountCurrency();
		public void setDiscountCurrency(Container.DiscountCurrency discountCurrency);

		/**
		 * uri: http://schema.org/isGift
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsGift
		 */
		public Container.IsGift getIsGift();
		public void setIsGift(Container.IsGift isGift);

		/**
		 * uri: http://schema.org/orderDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderDate
		 */
		public Container.OrderDate getOrderDate();
		public void setOrderDate(Container.OrderDate orderDate);

		/**
		 * uri: http://schema.org/orderDelivery
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderDelivery
		 */
		public Container.OrderDelivery getOrderDelivery();
		public void setOrderDelivery(Container.OrderDelivery orderDelivery);

		/**
		 * uri: http://schema.org/orderNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderNumber
		 */
		public Container.OrderNumber getOrderNumber();
		public void setOrderNumber(Container.OrderNumber orderNumber);

		/**
		 * uri: http://schema.org/orderStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderStatus
		 */
		public Container.OrderStatus getOrderStatus();
		public void setOrderStatus(Container.OrderStatus orderStatus);

		/**
		 * uri: http://schema.org/orderedItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderedItem
		 */
		public Container.OrderedItem getOrderedItem();
		public void setOrderedItem(Container.OrderedItem orderedItem);

		/**
		 * uri: http://schema.org/partOfInvoice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfInvoice
		 */
		public Container.PartOfInvoice getPartOfInvoice();
		public void setPartOfInvoice(Container.PartOfInvoice partOfInvoice);

		/**
		 * uri: http://schema.org/paymentDueDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentDueDate
		 */
		public Container.PaymentDueDate getPaymentDueDate();
		public void setPaymentDueDate(Container.PaymentDueDate paymentDueDate);

		/**
		 * uri: http://schema.org/paymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentMethod
		 */
		public Container.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Container.PaymentMethod paymentMethod);

		/**
		 * uri: http://schema.org/paymentMethodId
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentMethodId
		 */
		public Container.PaymentMethodId getPaymentMethodId();
		public void setPaymentMethodId(Container.PaymentMethodId paymentMethodId);

		/**
		 * uri: http://schema.org/paymentUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PaymentUrl
		 */
		public Container.PaymentUrl getPaymentUrl();
		public void setPaymentUrl(Container.PaymentUrl paymentUrl);

		/**
		 * uri: http://schema.org/seller
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seller
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderAction")
	@SchemaOrgLabel("OrderAction")
	@SchemaOrgComment(""
			+ "An agent orders an object/product/service to be delivered/sent.")
	@CamelizedName("orderAction")
	@ConstantizedName("ORDER_ACTION")
	public interface OrderAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/deliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryMethod
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderItem")
	@SchemaOrgLabel("OrderItem")
	@SchemaOrgComment(""
			+ "An order item is a line of an order. It includes the quantity and shipping"
			+ " details of a bought offer.")
	@CamelizedName("orderItem")
	@ConstantizedName("ORDER_ITEM")
	public interface OrderItem extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/orderDelivery
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderDelivery
		 */
		public Container.OrderDelivery getOrderDelivery();
		public void setOrderDelivery(Container.OrderDelivery orderDelivery);

		/**
		 * uri: http://schema.org/orderItemNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderItemNumber
		 */
		public Container.OrderItemNumber getOrderItemNumber();
		public void setOrderItemNumber(Container.OrderItemNumber orderItemNumber);

		/**
		 * uri: http://schema.org/orderItemStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderItemStatus
		 */
		public Container.OrderItemStatus getOrderItemStatus();
		public void setOrderItemStatus(Container.OrderItemStatus orderItemStatus);

		/**
		 * uri: http://schema.org/orderQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderQuantity
		 */
		public Container.OrderQuantity getOrderQuantity();
		public void setOrderQuantity(Container.OrderQuantity orderQuantity);

		/**
		 * uri: http://schema.org/orderedItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OrderedItem
		 */
		public Container.OrderedItem getOrderedItem();
		public void setOrderedItem(Container.OrderedItem orderedItem);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderStatus")
	@SchemaOrgLabel("OrderStatus")
	@SchemaOrgComment("Enumerated status values for Order.")
	@CamelizedName("orderStatus")
	@ConstantizedName("ORDER_STATUS")
	public interface OrderStatus extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Organization")
	@SchemaOrgLabel("Organization")
	@SchemaOrgComment(""
			+ "An organization such as a school, NGO, corporation, club, etc.")
	@CamelizedName("organization")
	@ConstantizedName("ORGANIZATION")
	public interface Organization extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/actionableFeedbackPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ActionableFeedbackPolicy
		 */
		public ActionableFeedbackPolicy getActionableFeedbackPolicy();
		public void setActionableFeedbackPolicy(ActionableFeedbackPolicy actionableFeedbackPolicy);

		/**
		 * uri: http://schema.org/address
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Address
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/alumni
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Alumni
		 */
		public Container.Alumni getAlumni();
		public void setAlumni(Container.Alumni alumni);

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/award
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Award
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * uri: http://schema.org/brand
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Brand
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * uri: http://schema.org/contactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContactPoint
		 */
		public Container.ContactPoint getContactPoint();
		public void setContactPoint(Container.ContactPoint contactPoint);

		/**
		 * uri: http://schema.org/correctionsPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CorrectionsPolicy
		 */
		public CorrectionsPolicy getCorrectionsPolicy();
		public void setCorrectionsPolicy(CorrectionsPolicy correctionsPolicy);

		/**
		 * uri: http://schema.org/department
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Department
		 */
		public Container.Department getDepartment();
		public void setDepartment(Container.Department department);

		/**
		 * uri: http://schema.org/dissolutionDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DissolutionDate
		 */
		public Container.DissolutionDate getDissolutionDate();
		public void setDissolutionDate(Container.DissolutionDate dissolutionDate);

		/**
		 * uri: http://schema.org/diversityPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.DiversityPolicy
		 */
		public DiversityPolicy getDiversityPolicy();
		public void setDiversityPolicy(DiversityPolicy diversityPolicy);

		/**
		 * uri: http://schema.org/duns
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duns
		 */
		public Container.Duns getDuns();
		public void setDuns(Container.Duns duns);

		/**
		 * uri: http://schema.org/email
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Email
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * uri: http://schema.org/employee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Employee
		 */
		public Container.Employee getEmployee();
		public void setEmployee(Container.Employee employee);

		/**
		 * uri: http://schema.org/ethicsPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.EthicsPolicy
		 */
		public EthicsPolicy getEthicsPolicy();
		public void setEthicsPolicy(EthicsPolicy ethicsPolicy);

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		/**
		 * uri: http://schema.org/faxNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * uri: http://schema.org/founder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Founder
		 */
		public Container.Founder getFounder();
		public void setFounder(Container.Founder founder);

		/**
		 * uri: http://schema.org/foundingDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FoundingDate
		 */
		public Container.FoundingDate getFoundingDate();
		public void setFoundingDate(Container.FoundingDate foundingDate);

		/**
		 * uri: http://schema.org/foundingLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FoundingLocation
		 */
		public Container.FoundingLocation getFoundingLocation();
		public void setFoundingLocation(Container.FoundingLocation foundingLocation);

		/**
		 * uri: http://schema.org/funder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Funder
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * uri: http://schema.org/globalLocationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * uri: http://schema.org/hasOfferCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasOfferCatalog
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * uri: http://schema.org/hasPOS
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasPOS
		 */
		public Container.HasPOS getHasPOS();
		public void setHasPOS(Container.HasPOS hasPOS);

		/**
		 * uri: http://schema.org/isicV4
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsicV4
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * uri: http://schema.org/legalName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LegalName
		 */
		public Container.LegalName getLegalName();
		public void setLegalName(Container.LegalName legalName);

		/**
		 * uri: http://schema.org/leiCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LeiCode
		 */
		public Container.LeiCode getLeiCode();
		public void setLeiCode(Container.LeiCode leiCode);

		/**
		 * uri: http://schema.org/location
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Location
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * uri: http://schema.org/logo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Logo
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * uri: http://schema.org/makesOffer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MakesOffer
		 */
		public Container.MakesOffer getMakesOffer();
		public void setMakesOffer(Container.MakesOffer makesOffer);

		/**
		 * uri: http://schema.org/member
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Member
		 */
		public Container.Member getMember();
		public void setMember(Container.Member member);

		/**
		 * uri: http://schema.org/memberOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MemberOf
		 */
		public Container.MemberOf getMemberOf();
		public void setMemberOf(Container.MemberOf memberOf);

		/**
		 * uri: http://schema.org/naics
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Naics
		 */
		public Container.Naics getNaics();
		public void setNaics(Container.Naics naics);

		/**
		 * uri: http://schema.org/numberOfEmployees
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEmployees
		 */
		public Container.NumberOfEmployees getNumberOfEmployees();
		public void setNumberOfEmployees(Container.NumberOfEmployees numberOfEmployees);

		/**
		 * uri: http://schema.org/owns
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Owns
		 */
		public Container.Owns getOwns();
		public void setOwns(Container.Owns owns);

		/**
		 * uri: http://schema.org/parentOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ParentOrganization
		 */
		public Container.ParentOrganization getParentOrganization();
		public void setParentOrganization(Container.ParentOrganization parentOrganization);

		/**
		 * uri: http://schema.org/publishingPrinciples
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/seeks
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seeks
		 */
		public Container.Seeks getSeeks();
		public void setSeeks(Container.Seeks seeks);

		/**
		 * uri: http://schema.org/sponsor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sponsor
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * uri: http://schema.org/subOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubOrganization
		 */
		public Container.SubOrganization getSubOrganization();
		public void setSubOrganization(Container.SubOrganization subOrganization);

		/**
		 * uri: http://schema.org/taxID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TaxID
		 */
		public Container.TaxID getTaxID();
		public void setTaxID(Container.TaxID taxID);

		/**
		 * uri: http://schema.org/telephone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Telephone
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		/**
		 * uri: http://schema.org/unnamedSourcesPolicy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.UnnamedSourcesPolicy
		 */
		public UnnamedSourcesPolicy getUnnamedSourcesPolicy();
		public void setUnnamedSourcesPolicy(UnnamedSourcesPolicy unnamedSourcesPolicy);

		/**
		 * uri: http://schema.org/vatID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VatID
		 */
		public Container.VatID getVatID();
		public void setVatID(Container.VatID vatID);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrganizationRole")
	@SchemaOrgLabel("OrganizationRole")
	@SchemaOrgComment(""
			+ "A subclass of Role used to describe roles within organizations.")
	@CamelizedName("organizationRole")
	@ConstantizedName("ORGANIZATION_ROLE")
	public interface OrganizationRole extends Role, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberedPosition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberedPosition
		 */
		public Container.NumberedPosition getNumberedPosition();
		public void setNumberedPosition(Container.NumberedPosition numberedPosition);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrganizeAction")
	@SchemaOrgLabel("OrganizeAction")
	@SchemaOrgComment(""
			+ "The act of manipulating/administering/supervising/controlling one or more"
			+ " objects.")
	@CamelizedName("organizeAction")
	@ConstantizedName("ORGANIZE_ACTION")
	public interface OrganizeAction extends Action, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OutletStore")
	@SchemaOrgLabel("OutletStore")
	@SchemaOrgComment("An outlet store.")
	@CamelizedName("outletStore")
	@ConstantizedName("OUTLET_STORE")
	public interface OutletStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OwnershipInfo")
	@SchemaOrgLabel("OwnershipInfo")
	@SchemaOrgComment(""
			+ "A structured value providing information about when a certain organization or"
			+ " person owned a certain product.")
	@CamelizedName("ownershipInfo")
	@ConstantizedName("OWNERSHIP_INFO")
	public interface OwnershipInfo extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/acquiredFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcquiredFrom
		 */
		public Container.AcquiredFrom getAcquiredFrom();
		public void setAcquiredFrom(Container.AcquiredFrom acquiredFrom);

		/**
		 * uri: http://schema.org/ownedFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OwnedFrom
		 */
		public Container.OwnedFrom getOwnedFrom();
		public void setOwnedFrom(Container.OwnedFrom ownedFrom);

		/**
		 * uri: http://schema.org/ownedThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OwnedThrough
		 */
		public Container.OwnedThrough getOwnedThrough();
		public void setOwnedThrough(Container.OwnedThrough ownedThrough);

		/**
		 * uri: http://schema.org/typeOfGood
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TypeOfGood
		 */
		public Container.TypeOfGood getTypeOfGood();
		public void setTypeOfGood(Container.TypeOfGood typeOfGood);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaintAction")
	@SchemaOrgLabel("PaintAction")
	@SchemaOrgComment(""
			+ "The act of producing a painting, typically with paint and canvas as instruments.")
	@CamelizedName("paintAction")
	@ConstantizedName("PAINT_ACTION")
	public interface PaintAction extends CreateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Painting")
	@SchemaOrgLabel("Painting")
	@SchemaOrgComment("A painting.")
	@CamelizedName("painting")
	@ConstantizedName("PAINTING")
	public interface Painting extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ParcelDelivery")
	@SchemaOrgLabel("ParcelDelivery")
	@SchemaOrgComment(""
			+ "The delivery of a parcel either via the postal service or a commercial service.")
	@CamelizedName("parcelDelivery")
	@ConstantizedName("PARCEL_DELIVERY")
	public interface ParcelDelivery extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/deliveryAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryAddress
		 */
		public Container.DeliveryAddress getDeliveryAddress();
		public void setDeliveryAddress(Container.DeliveryAddress deliveryAddress);

		/**
		 * uri: http://schema.org/deliveryStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryStatus
		 */
		public Container.DeliveryStatus getDeliveryStatus();
		public void setDeliveryStatus(Container.DeliveryStatus deliveryStatus);

		/**
		 * uri: http://schema.org/expectedArrivalFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExpectedArrivalFrom
		 */
		public Container.ExpectedArrivalFrom getExpectedArrivalFrom();
		public void setExpectedArrivalFrom(Container.ExpectedArrivalFrom expectedArrivalFrom);

		/**
		 * uri: http://schema.org/expectedArrivalUntil
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ExpectedArrivalUntil
		 */
		public Container.ExpectedArrivalUntil getExpectedArrivalUntil();
		public void setExpectedArrivalUntil(Container.ExpectedArrivalUntil expectedArrivalUntil);

		/**
		 * uri: http://schema.org/hasDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasDeliveryMethod
		 */
		public Container.HasDeliveryMethod getHasDeliveryMethod();
		public void setHasDeliveryMethod(Container.HasDeliveryMethod hasDeliveryMethod);

		/**
		 * uri: http://schema.org/itemShipped
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemShipped
		 */
		public Container.ItemShipped getItemShipped();
		public void setItemShipped(Container.ItemShipped itemShipped);

		/**
		 * uri: http://schema.org/originAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OriginAddress
		 */
		public Container.OriginAddress getOriginAddress();
		public void setOriginAddress(Container.OriginAddress originAddress);

		/**
		 * uri: http://schema.org/partOfOrder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartOfOrder
		 */
		public Container.PartOfOrder getPartOfOrder();
		public void setPartOfOrder(Container.PartOfOrder partOfOrder);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/trackingNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TrackingNumber
		 */
		public Container.TrackingNumber getTrackingNumber();
		public void setTrackingNumber(Container.TrackingNumber trackingNumber);

		/**
		 * uri: http://schema.org/trackingUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TrackingUrl
		 */
		public Container.TrackingUrl getTrackingUrl();
		public void setTrackingUrl(Container.TrackingUrl trackingUrl);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ParcelService")
	@SchemaOrgLabel("ParcelService")
	@SchemaOrgComment(""
			+ "<p>A private parcel service as the delivery mode available for a certain"
			+ " offer.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#DHL</li>\n<li>http://purl.org/goodrelations/v1#FederalExpress</li>\n<li>http://purl.org/goodrelations/v1#UPS</li>\n</ul>\n")
	@CamelizedName("parcelService")
	@ConstantizedName("PARCEL_SERVICE")
	public interface ParcelService extends DeliveryMethod, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ParentAudience")
	@SchemaOrgLabel("ParentAudience")
	@SchemaOrgComment(""
			+ "A set of characteristics describing parents, who can be interested in viewing"
			+ " some content.")
	@CamelizedName("parentAudience")
	@ConstantizedName("PARENT_AUDIENCE")
	public interface ParentAudience extends PeopleAudience, SchemaOrgClass {

		/**
		 * uri: http://schema.org/childMaxAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ChildMaxAge
		 */
		public Container.ChildMaxAge getChildMaxAge();
		public void setChildMaxAge(Container.ChildMaxAge childMaxAge);

		/**
		 * uri: http://schema.org/childMinAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ChildMinAge
		 */
		public Container.ChildMinAge getChildMinAge();
		public void setChildMinAge(Container.ChildMinAge childMinAge);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Park")
	@SchemaOrgLabel("Park")
	@SchemaOrgComment("A park.")
	@CamelizedName("park")
	@ConstantizedName("PARK")
	public interface Park extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ParkingFacility")
	@SchemaOrgLabel("ParkingFacility")
	@SchemaOrgComment(""
			+ "A parking lot or other parking facility.")
	@CamelizedName("parkingFacility")
	@ConstantizedName("PARKING_FACILITY")
	public interface ParkingFacility extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PawnShop")
	@SchemaOrgLabel("PawnShop")
	@SchemaOrgComment(""
			+ "A shop that will buy, or lend money against the security of, personal"
			+ " possessions.")
	@CamelizedName("pawnShop")
	@ConstantizedName("PAWN_SHOP")
	public interface PawnShop extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PayAction")
	@SchemaOrgLabel("PayAction")
	@SchemaOrgComment("An agent pays a price to a participant.")
	@CamelizedName("payAction")
	@ConstantizedName("PAY_ACTION")
	public interface PayAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/purpose
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Purpose
		 */
		public Purpose getPurpose();
		public void setPurpose(Purpose purpose);

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentCard")
	@SchemaOrgLabel("PaymentCard")
	@SchemaOrgComment(""
			+ "A payment method using a credit, debit, store or other card to associate the"
			+ " payment with an account.")
	@CamelizedName("paymentCard")
	@ConstantizedName("PAYMENT_CARD")
	public interface PaymentCard extends FinancialProduct, PaymentMethod, SchemaOrgClass {

		/**
		 * uri: http://schema.org/cashBack
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.CashBack
		 */
		public CashBack getCashBack();
		public void setCashBack(CashBack cashBack);

		/**
		 * uri: http://schema.org/contactlessPayment
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.ContactlessPayment
		 */
		public ContactlessPayment getContactlessPayment();
		public void setContactlessPayment(ContactlessPayment contactlessPayment);

		/**
		 * uri: http://schema.org/floorLimit
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.FloorLimit
		 */
		public FloorLimit getFloorLimit();
		public void setFloorLimit(FloorLimit floorLimit);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentChargeSpecification")
	@SchemaOrgLabel("PaymentChargeSpecification")
	@SchemaOrgComment(""
			+ "The costs of settling the payment using a particular payment method.")
	@CamelizedName("paymentChargeSpecification")
	@ConstantizedName("PAYMENT_CHARGE_SPECIFICATION")
	public interface PaymentChargeSpecification extends PriceSpecification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/appliesToDeliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AppliesToDeliveryMethod
		 */
		public Container.AppliesToDeliveryMethod getAppliesToDeliveryMethod();
		public void setAppliesToDeliveryMethod(Container.AppliesToDeliveryMethod appliesToDeliveryMethod);

		/**
		 * uri: http://schema.org/appliesToPaymentMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AppliesToPaymentMethod
		 */
		public Container.AppliesToPaymentMethod getAppliesToPaymentMethod();
		public void setAppliesToPaymentMethod(Container.AppliesToPaymentMethod appliesToPaymentMethod);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentMethod")
	@SchemaOrgLabel("PaymentMethod")
	@SchemaOrgComment(""
			+ "<p>A payment method is a standardized procedure for transferring the monetary"
			+ " amount for a purchase. Payment methods are characterized by the legal and"
			+ " technical structures used, and by the organization or group carrying out the"
			+ " transaction.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#ByBankTransferInAdvance</li>\n<li>http://purl.org/goodrelations/v1#ByInvoice</li>\n<li>http://purl.org/goodrelations/v1#Cash</li>\n<li>http://purl.org/goodrelations/v1#CheckInAdvance</li>\n<li>http://purl.org/goodrelations/v1#COD</li>\n<li>http://purl.org/goodrelations/v1#DirectDebit</li>\n<li>http://purl.org/goodrelations/v1#GoogleCheckout</li>\n<li>http://purl.org/goodrelations/v1#PayPal</li>\n<li>http://purl.org/goodrelations/v1#PaySwarm</li>\n</ul>\n")
	@CamelizedName("paymentMethod")
	@ConstantizedName("PAYMENT_METHOD")
	public interface PaymentMethod extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentService")
	@SchemaOrgLabel("PaymentService")
	@SchemaOrgComment(""
			+ "A Service to transfer funds from a person or organization to a beneficiary"
			+ " person or organization.")
	@CamelizedName("paymentService")
	@ConstantizedName("PAYMENT_SERVICE")
	public interface PaymentService extends FinancialProduct, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentStatusType")
	@SchemaOrgLabel("PaymentStatusType")
	@SchemaOrgComment(""
			+ "A specific payment status. For example, PaymentDue, PaymentComplete, etc.")
	@CamelizedName("paymentStatusType")
	@ConstantizedName("PAYMENT_STATUS_TYPE")
	public interface PaymentStatusType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PeopleAudience")
	@SchemaOrgLabel("PeopleAudience")
	@SchemaOrgComment(""
			+ "A set of characteristics belonging to people, e.g. who compose an item's target"
			+ " audience.")
	@CamelizedName("peopleAudience")
	@ConstantizedName("PEOPLE_AUDIENCE")
	public interface PeopleAudience extends Audience, SchemaOrgClass {

		/**
		 * uri: http://schema.org/healthCondition
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition
		 */
		public HealthCondition getHealthCondition();
		public void setHealthCondition(HealthCondition healthCondition);

		/**
		 * uri: http://schema.org/requiredGender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiredGender
		 */
		public Container.RequiredGender getRequiredGender();
		public void setRequiredGender(Container.RequiredGender requiredGender);

		/**
		 * uri: http://schema.org/requiredMaxAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiredMaxAge
		 */
		public Container.RequiredMaxAge getRequiredMaxAge();
		public void setRequiredMaxAge(Container.RequiredMaxAge requiredMaxAge);

		/**
		 * uri: http://schema.org/requiredMinAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RequiredMinAge
		 */
		public Container.RequiredMinAge getRequiredMinAge();
		public void setRequiredMinAge(Container.RequiredMinAge requiredMinAge);

		/**
		 * uri: http://schema.org/suggestedGender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuggestedGender
		 */
		public Container.SuggestedGender getSuggestedGender();
		public void setSuggestedGender(Container.SuggestedGender suggestedGender);

		/**
		 * uri: http://schema.org/suggestedMaxAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuggestedMaxAge
		 */
		public Container.SuggestedMaxAge getSuggestedMaxAge();
		public void setSuggestedMaxAge(Container.SuggestedMaxAge suggestedMaxAge);

		/**
		 * uri: http://schema.org/suggestedMinAge
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuggestedMinAge
		 */
		public Container.SuggestedMinAge getSuggestedMinAge();
		public void setSuggestedMinAge(Container.SuggestedMinAge suggestedMinAge);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PerformAction")
	@SchemaOrgLabel("PerformAction")
	@SchemaOrgComment(""
			+ "The act of participating in performance arts.")
	@CamelizedName("performAction")
	@ConstantizedName("PERFORM_ACTION")
	public interface PerformAction extends PlayAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/entertainmentBusiness
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EntertainmentBusiness
		 */
		public Container.EntertainmentBusiness getEntertainmentBusiness();
		public void setEntertainmentBusiness(Container.EntertainmentBusiness entertainmentBusiness);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PerformanceRole")
	@SchemaOrgLabel("PerformanceRole")
	@SchemaOrgComment(""
			+ "A PerformanceRole is a Role that some entity places with regard to a theatrical"
			+ " performance, e.g. in a Movie, TVSeries etc.")
	@CamelizedName("performanceRole")
	@ConstantizedName("PERFORMANCE_ROLE")
	public interface PerformanceRole extends Role, SchemaOrgClass {

		/**
		 * uri: http://schema.org/characterName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CharacterName
		 */
		public Container.CharacterName getCharacterName();
		public void setCharacterName(Container.CharacterName characterName);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PerformingArtsTheater")
	@SchemaOrgLabel("PerformingArtsTheater")
	@SchemaOrgComment(""
			+ "A theater or other performing art center.")
	@CamelizedName("performingArtsTheater")
	@ConstantizedName("PERFORMING_ARTS_THEATER")
	public interface PerformingArtsTheater extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PerformingGroup")
	@SchemaOrgLabel("PerformingGroup")
	@SchemaOrgComment(""
			+ "A performance group, such as a band, an orchestra, or a circus.")
	@CamelizedName("performingGroup")
	@ConstantizedName("PERFORMING_GROUP")
	public interface PerformingGroup extends Organization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Periodical")
	@SchemaOrgLabel("Periodical")
	@SchemaOrgComment(""
			+ "A publication in any medium issued in successive parts bearing numerical or"
			+ " chronological designations and intended, such as a magazine, scholarly journal,"
			+ " or newspaper to continue indefinitely.</p>\n\n<p>See also <a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog"
			+ " post</a>.")
	@CamelizedName("periodical")
	@ConstantizedName("PERIODICAL")
	public interface Periodical extends CreativeWorkSeries, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Permit")
	@SchemaOrgLabel("Permit")
	@SchemaOrgComment(""
			+ "A permit issued by an organization, e.g. a parking pass.")
	@CamelizedName("permit")
	@ConstantizedName("PERMIT")
	public interface Permit extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/issuedBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IssuedBy
		 */
		public Container.IssuedBy getIssuedBy();
		public void setIssuedBy(Container.IssuedBy issuedBy);

		/**
		 * uri: http://schema.org/issuedThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IssuedThrough
		 */
		public Container.IssuedThrough getIssuedThrough();
		public void setIssuedThrough(Container.IssuedThrough issuedThrough);

		/**
		 * uri: http://schema.org/permitAudience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PermitAudience
		 */
		public Container.PermitAudience getPermitAudience();
		public void setPermitAudience(Container.PermitAudience permitAudience);

		/**
		 * uri: http://schema.org/validFor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFor
		 */
		public Container.ValidFor getValidFor();
		public void setValidFor(Container.ValidFor validFor);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validIn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidIn
		 */
		public Container.ValidIn getValidIn();
		public void setValidIn(Container.ValidIn validIn);

		/**
		 * uri: http://schema.org/validUntil
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidUntil
		 */
		public Container.ValidUntil getValidUntil();
		public void setValidUntil(Container.ValidUntil validUntil);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Person")
	@SchemaOrgLabel("Person")
	@SchemaOrgComment(""
			+ "A person (alive, dead, undead, or fictional).")
	@CamelizedName("person")
	@ConstantizedName("PERSON")
	public interface Person extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/additionalName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalName
		 */
		public Container.AdditionalName getAdditionalName();
		public void setAdditionalName(Container.AdditionalName additionalName);

		/**
		 * uri: http://schema.org/address
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Address
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * uri: http://schema.org/affiliation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Affiliation
		 */
		public Container.Affiliation getAffiliation();
		public void setAffiliation(Container.Affiliation affiliation);

		/**
		 * uri: http://schema.org/alumniOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlumniOf
		 */
		public Container.AlumniOf getAlumniOf();
		public void setAlumniOf(Container.AlumniOf alumniOf);

		/**
		 * uri: http://schema.org/award
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Award
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * uri: http://schema.org/birthDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BirthDate
		 */
		public Container.BirthDate getBirthDate();
		public void setBirthDate(Container.BirthDate birthDate);

		/**
		 * uri: http://schema.org/birthPlace
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BirthPlace
		 */
		public Container.BirthPlace getBirthPlace();
		public void setBirthPlace(Container.BirthPlace birthPlace);

		/**
		 * uri: http://schema.org/brand
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Brand
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * uri: http://schema.org/children
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Children
		 */
		public Container.Children getChildren();
		public void setChildren(Container.Children children);

		/**
		 * uri: http://schema.org/colleague
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Colleague
		 */
		public Container.Colleague getColleague();
		public void setColleague(Container.Colleague colleague);

		/**
		 * uri: http://schema.org/contactPoint
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContactPoint
		 */
		public Container.ContactPoint getContactPoint();
		public void setContactPoint(Container.ContactPoint contactPoint);

		/**
		 * uri: http://schema.org/deathDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeathDate
		 */
		public Container.DeathDate getDeathDate();
		public void setDeathDate(Container.DeathDate deathDate);

		/**
		 * uri: http://schema.org/deathPlace
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeathPlace
		 */
		public Container.DeathPlace getDeathPlace();
		public void setDeathPlace(Container.DeathPlace deathPlace);

		/**
		 * uri: http://schema.org/duns
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Duns
		 */
		public Container.Duns getDuns();
		public void setDuns(Container.Duns duns);

		/**
		 * uri: http://schema.org/email
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Email
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * uri: http://schema.org/familyName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FamilyName
		 */
		public Container.FamilyName getFamilyName();
		public void setFamilyName(Container.FamilyName familyName);

		/**
		 * uri: http://kyojo.org/schemaSpl/familyNameRuby
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FamilyNameRuby
		 */
		public Container.FamilyNameRuby getFamilyNameRuby();
		public void setFamilyNameRuby(Container.FamilyNameRuby familyNameRuby);

		/**
		 * uri: http://schema.org/faxNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * uri: http://schema.org/follows
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Follows
		 */
		public Container.Follows getFollows();
		public void setFollows(Container.Follows follows);

		/**
		 * uri: http://schema.org/funder
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Funder
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * uri: http://schema.org/gender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gender
		 */
		public Container.Gender getGender();
		public void setGender(Container.Gender gender);

		/**
		 * uri: http://schema.org/givenName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GivenName
		 */
		public Container.GivenName getGivenName();
		public void setGivenName(Container.GivenName givenName);

		/**
		 * uri: http://kyojo.org/schemaSpl/givenNameRuby
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GivenNameRuby
		 */
		public Container.GivenNameRuby getGivenNameRuby();
		public void setGivenNameRuby(Container.GivenNameRuby givenNameRuby);

		/**
		 * uri: http://schema.org/globalLocationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * uri: http://schema.org/hasOfferCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasOfferCatalog
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * uri: http://schema.org/hasPOS
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasPOS
		 */
		public Container.HasPOS getHasPOS();
		public void setHasPOS(Container.HasPOS hasPOS);

		/**
		 * uri: http://schema.org/height
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Height
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * uri: http://schema.org/homeLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HomeLocation
		 */
		public Container.HomeLocation getHomeLocation();
		public void setHomeLocation(Container.HomeLocation homeLocation);

		/**
		 * uri: http://schema.org/honorificPrefix
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HonorificPrefix
		 */
		public Container.HonorificPrefix getHonorificPrefix();
		public void setHonorificPrefix(Container.HonorificPrefix honorificPrefix);

		/**
		 * uri: http://schema.org/honorificSuffix
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HonorificSuffix
		 */
		public Container.HonorificSuffix getHonorificSuffix();
		public void setHonorificSuffix(Container.HonorificSuffix honorificSuffix);

		/**
		 * uri: http://schema.org/isicV4
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsicV4
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * uri: http://schema.org/jobTitle
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.JobTitle
		 */
		public Container.JobTitle getJobTitle();
		public void setJobTitle(Container.JobTitle jobTitle);

		/**
		 * uri: http://schema.org/knows
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Knows
		 */
		public Container.Knows getKnows();
		public void setKnows(Container.Knows knows);

		/**
		 * uri: http://schema.org/makesOffer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MakesOffer
		 */
		public Container.MakesOffer getMakesOffer();
		public void setMakesOffer(Container.MakesOffer makesOffer);

		/**
		 * uri: http://schema.org/memberOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MemberOf
		 */
		public Container.MemberOf getMemberOf();
		public void setMemberOf(Container.MemberOf memberOf);

		/**
		 * uri: http://schema.org/naics
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Naics
		 */
		public Container.Naics getNaics();
		public void setNaics(Container.Naics naics);

		/**
		 * uri: http://schema.org/nationality
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Nationality
		 */
		public Container.Nationality getNationality();
		public void setNationality(Container.Nationality nationality);

		/**
		 * uri: http://schema.org/netWorth
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NetWorth
		 */
		public Container.NetWorth getNetWorth();
		public void setNetWorth(Container.NetWorth netWorth);

		/**
		 * uri: http://schema.org/owns
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Owns
		 */
		public Container.Owns getOwns();
		public void setOwns(Container.Owns owns);

		/**
		 * uri: http://schema.org/parent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Parent
		 */
		public Container.Parent getParent();
		public void setParent(Container.Parent parent);

		/**
		 * uri: http://schema.org/performerIn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PerformerIn
		 */
		public Container.PerformerIn getPerformerIn();
		public void setPerformerIn(Container.PerformerIn performerIn);

		/**
		 * uri: http://schema.org/publishingPrinciples
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PublishingPrinciples
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * uri: http://schema.org/relatedTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RelatedTo
		 */
		public Container.RelatedTo getRelatedTo();
		public void setRelatedTo(Container.RelatedTo relatedTo);

		/**
		 * uri: http://schema.org/seeks
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Seeks
		 */
		public Container.Seeks getSeeks();
		public void setSeeks(Container.Seeks seeks);

		/**
		 * uri: http://schema.org/sibling
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sibling
		 */
		public Container.Sibling getSibling();
		public void setSibling(Container.Sibling sibling);

		/**
		 * uri: http://schema.org/sponsor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sponsor
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * uri: http://schema.org/spouse
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Spouse
		 */
		public Container.Spouse getSpouse();
		public void setSpouse(Container.Spouse spouse);

		/**
		 * uri: http://schema.org/taxID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TaxID
		 */
		public Container.TaxID getTaxID();
		public void setTaxID(Container.TaxID taxID);

		/**
		 * uri: http://schema.org/telephone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Telephone
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		/**
		 * uri: http://schema.org/vatID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VatID
		 */
		public Container.VatID getVatID();
		public void setVatID(Container.VatID vatID);

		/**
		 * uri: http://schema.org/weight
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Weight
		 */
		public Container.Weight getWeight();
		public void setWeight(Container.Weight weight);

		/**
		 * uri: http://schema.org/workLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkLocation
		 */
		public Container.WorkLocation getWorkLocation();
		public void setWorkLocation(Container.WorkLocation workLocation);

		/**
		 * uri: http://schema.org/worksFor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorksFor
		 */
		public Container.WorksFor getWorksFor();
		public void setWorksFor(Container.WorksFor worksFor);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PetStore")
	@SchemaOrgLabel("PetStore")
	@SchemaOrgComment("A pet store.")
	@CamelizedName("petStore")
	@ConstantizedName("PET_STORE")
	public interface PetStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Pharmacy")
	@SchemaOrgLabel("Pharmacy")
	@SchemaOrgComment("A pharmacy or drugstore.")
	@CamelizedName("pharmacy")
	@ConstantizedName("PHARMACY")
	public interface Pharmacy extends MedicalBusiness, MedicalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Photograph")
	@SchemaOrgLabel("Photograph")
	@SchemaOrgComment("A photograph.")
	@CamelizedName("photograph")
	@ConstantizedName("PHOTOGRAPH")
	public interface Photograph extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PhotographAction")
	@SchemaOrgLabel("PhotographAction")
	@SchemaOrgComment(""
			+ "The act of capturing still images of objects using a camera.")
	@CamelizedName("photographAction")
	@ConstantizedName("PHOTOGRAPH_ACTION")
	public interface PhotographAction extends CreateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Physician")
	@SchemaOrgLabel("Physician")
	@SchemaOrgComment("A doctor's office.")
	@CamelizedName("physician")
	@ConstantizedName("PHYSICIAN")
	public interface Physician extends MedicalBusiness, MedicalOrganization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableService
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableService
		 */
		public AvailableService getAvailableService();
		public void setAvailableService(AvailableService availableService);

		/**
		 * uri: http://schema.org/hospitalAffiliation
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HospitalAffiliation
		 */
		public HospitalAffiliation getHospitalAffiliation();
		public void setHospitalAffiliation(HospitalAffiliation hospitalAffiliation);

		/**
		 * uri: http://schema.org/medicalSpecialty
		 * class: org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicalSpecialty
		 */
		public MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Place")
	@SchemaOrgLabel("Place")
	@SchemaOrgComment(""
			+ "Entities that have a somewhat fixed, physical extension.")
	@CamelizedName("place")
	@ConstantizedName("PLACE")
	public interface Place extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/additionalProperty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * uri: http://schema.org/address
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Address
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/amenityFeature
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * uri: http://schema.org/branchCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BranchCode
		 */
		public Container.BranchCode getBranchCode();
		public void setBranchCode(Container.BranchCode branchCode);

		/**
		 * uri: http://schema.org/containedInPlace
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContainedInPlace
		 */
		public Container.ContainedInPlace getContainedInPlace();
		public void setContainedInPlace(Container.ContainedInPlace containedInPlace);

		/**
		 * uri: http://schema.org/containsPlace
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContainsPlace
		 */
		public Container.ContainsPlace getContainsPlace();
		public void setContainsPlace(Container.ContainsPlace containsPlace);

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		/**
		 * uri: http://schema.org/faxNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FaxNumber
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * uri: http://schema.org/geo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Geo
		 */
		public Container.Geo getGeo();
		public void setGeo(Container.Geo geo);

		/**
		 * uri: http://schema.org/geospatiallyContains
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyContains
		 */
		public GeospatiallyContains getGeospatiallyContains();
		public void setGeospatiallyContains(GeospatiallyContains geospatiallyContains);

		/**
		 * uri: http://schema.org/geospatiallyCoveredBy
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCoveredBy
		 */
		public GeospatiallyCoveredBy getGeospatiallyCoveredBy();
		public void setGeospatiallyCoveredBy(GeospatiallyCoveredBy geospatiallyCoveredBy);

		/**
		 * uri: http://schema.org/geospatiallyCovers
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCovers
		 */
		public GeospatiallyCovers getGeospatiallyCovers();
		public void setGeospatiallyCovers(GeospatiallyCovers geospatiallyCovers);

		/**
		 * uri: http://schema.org/geospatiallyCrosses
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCrosses
		 */
		public GeospatiallyCrosses getGeospatiallyCrosses();
		public void setGeospatiallyCrosses(GeospatiallyCrosses geospatiallyCrosses);

		/**
		 * uri: http://schema.org/geospatiallyDisjoint
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyDisjoint
		 */
		public GeospatiallyDisjoint getGeospatiallyDisjoint();
		public void setGeospatiallyDisjoint(GeospatiallyDisjoint geospatiallyDisjoint);

		/**
		 * uri: http://schema.org/geospatiallyEquals
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyEquals
		 */
		public GeospatiallyEquals getGeospatiallyEquals();
		public void setGeospatiallyEquals(GeospatiallyEquals geospatiallyEquals);

		/**
		 * uri: http://schema.org/geospatiallyIntersects
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyIntersects
		 */
		public GeospatiallyIntersects getGeospatiallyIntersects();
		public void setGeospatiallyIntersects(GeospatiallyIntersects geospatiallyIntersects);

		/**
		 * uri: http://schema.org/geospatiallyOverlaps
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyOverlaps
		 */
		public GeospatiallyOverlaps getGeospatiallyOverlaps();
		public void setGeospatiallyOverlaps(GeospatiallyOverlaps geospatiallyOverlaps);

		/**
		 * uri: http://schema.org/geospatiallyTouches
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyTouches
		 */
		public GeospatiallyTouches getGeospatiallyTouches();
		public void setGeospatiallyTouches(GeospatiallyTouches geospatiallyTouches);

		/**
		 * uri: http://schema.org/geospatiallyWithin
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyWithin
		 */
		public GeospatiallyWithin getGeospatiallyWithin();
		public void setGeospatiallyWithin(GeospatiallyWithin geospatiallyWithin);

		/**
		 * uri: http://schema.org/globalLocationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * uri: http://schema.org/hasMap
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasMap
		 */
		public Container.HasMap getHasMap();
		public void setHasMap(Container.HasMap hasMap);

		/**
		 * uri: http://schema.org/isAccessibleForFree
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * uri: http://schema.org/isicV4
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsicV4
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * uri: http://schema.org/logo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Logo
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * uri: http://schema.org/maximumAttendeeCapacity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity
		 */
		public Container.MaximumAttendeeCapacity getMaximumAttendeeCapacity();
		public void setMaximumAttendeeCapacity(Container.MaximumAttendeeCapacity maximumAttendeeCapacity);

		/**
		 * uri: http://schema.org/openingHoursSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OpeningHoursSpecification
		 */
		public Container.OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(Container.OpeningHoursSpecification openingHoursSpecification);

		/**
		 * uri: http://schema.org/photo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Photo
		 */
		public Container.Photo getPhoto();
		public void setPhoto(Container.Photo photo);

		/**
		 * uri: http://schema.org/publicAccess
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PublicAccess
		 */
		public Container.PublicAccess getPublicAccess();
		public void setPublicAccess(Container.PublicAccess publicAccess);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/smokingAllowed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SmokingAllowed
		 */
		public Container.SmokingAllowed getSmokingAllowed();
		public void setSmokingAllowed(Container.SmokingAllowed smokingAllowed);

		/**
		 * uri: http://schema.org/specialOpeningHoursSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SpecialOpeningHoursSpecification
		 */
		public Container.SpecialOpeningHoursSpecification getSpecialOpeningHoursSpecification();
		public void setSpecialOpeningHoursSpecification(Container.SpecialOpeningHoursSpecification specialOpeningHoursSpecification);

		/**
		 * uri: http://schema.org/telephone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Telephone
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PlaceOfWorship")
	@SchemaOrgLabel("PlaceOfWorship")
	@SchemaOrgComment(""
			+ "Place of worship, such as a church, synagogue, or mosque.")
	@CamelizedName("placeOfWorship")
	@ConstantizedName("PLACE_OF_WORSHIP")
	public interface PlaceOfWorship extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PlanAction")
	@SchemaOrgLabel("PlanAction")
	@SchemaOrgComment(""
			+ "The act of planning the execution of an event/task/action/reservation/plan to a"
			+ " future date.")
	@CamelizedName("planAction")
	@ConstantizedName("PLAN_ACTION")
	public interface PlanAction extends OrganizeAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/scheduledTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ScheduledTime
		 */
		public Container.ScheduledTime getScheduledTime();
		public void setScheduledTime(Container.ScheduledTime scheduledTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PlayAction")
	@SchemaOrgLabel("PlayAction")
	@SchemaOrgComment(""
			+ "<p>The act of playing/exercising/training/performing for enjoyment, leisure,"
			+ " recreation, Competition or exercise.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ListenAction\">ListenAction</a>: Unlike ListenAction"
			+ " (which is under ConsumeAction), PlayAction refers to performing for an audience"
			+ " or at an event, rather than consuming music.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/WatchAction\">WatchAction</a>: Unlike WatchAction"
			+ " (which is under ConsumeAction), PlayAction refers to showing/displaying for an"
			+ " audience or at an event, rather than consuming visual content.</li>\n</ul>\n")
	@CamelizedName("playAction")
	@ConstantizedName("PLAY_ACTION")
	public interface PlayAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/event
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Event
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Playground")
	@SchemaOrgLabel("Playground")
	@SchemaOrgComment("A playground.")
	@CamelizedName("playground")
	@ConstantizedName("PLAYGROUND")
	public interface Playground extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Plumber")
	@SchemaOrgLabel("Plumber")
	@SchemaOrgComment("A plumbing service.")
	@CamelizedName("plumber")
	@ConstantizedName("PLUMBER")
	public interface Plumber extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PoliceStation")
	@SchemaOrgLabel("PoliceStation")
	@SchemaOrgComment("A police station.")
	@CamelizedName("policeStation")
	@ConstantizedName("POLICE_STATION")
	public interface PoliceStation extends CivicStructure, EmergencyService, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Pond")
	@SchemaOrgLabel("Pond")
	@SchemaOrgComment("A pond.")
	@CamelizedName("pond")
	@ConstantizedName("POND")
	public interface Pond extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PostOffice")
	@SchemaOrgLabel("PostOffice")
	@SchemaOrgComment("A post office.")
	@CamelizedName("postOffice")
	@ConstantizedName("POST_OFFICE")
	public interface PostOffice extends GovernmentOffice, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PostalAddress")
	@SchemaOrgLabel("PostalAddress")
	@SchemaOrgComment("The mailing address.")
	@CamelizedName("postalAddress")
	@ConstantizedName("POSTAL_ADDRESS")
	public interface PostalAddress extends ContactPoint, SchemaOrgClass {

		/**
		 * uri: http://schema.org/addressCountry
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddressCountry
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * uri: http://schema.org/addressLocality
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddressLocality
		 */
		public Container.AddressLocality getAddressLocality();
		public void setAddressLocality(Container.AddressLocality addressLocality);

		/**
		 * uri: http://schema.org/addressRegion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AddressRegion
		 */
		public Container.AddressRegion getAddressRegion();
		public void setAddressRegion(Container.AddressRegion addressRegion);

		/**
		 * uri: http://kyojo.org/schemaSpl/buildingAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BuildingAddress
		 */
		public Container.BuildingAddress getBuildingAddress();
		public void setBuildingAddress(Container.BuildingAddress buildingAddress);

		/**
		 * uri: http://schema.org/postOfficeBoxNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PostOfficeBoxNumber
		 */
		public Container.PostOfficeBoxNumber getPostOfficeBoxNumber();
		public void setPostOfficeBoxNumber(Container.PostOfficeBoxNumber postOfficeBoxNumber);

		/**
		 * uri: http://schema.org/postalCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PostalCode
		 */
		public Container.PostalCode getPostalCode();
		public void setPostalCode(Container.PostalCode postalCode);

		/**
		 * uri: http://schema.org/streetAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StreetAddress
		 */
		public Container.StreetAddress getStreetAddress();
		public void setStreetAddress(Container.StreetAddress streetAddress);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PrependAction")
	@SchemaOrgLabel("PrependAction")
	@SchemaOrgComment(""
			+ "The act of inserting at the beginning if an ordered collection.")
	@CamelizedName("prependAction")
	@ConstantizedName("PREPEND_ACTION")
	public interface PrependAction extends InsertAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Preschool")
	@SchemaOrgLabel("Preschool")
	@SchemaOrgComment("A preschool.")
	@CamelizedName("preschool")
	@ConstantizedName("PRESCHOOL")
	public interface Preschool extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PresentationDigitalDocument")
	@SchemaOrgLabel("PresentationDigitalDocument")
	@SchemaOrgComment(""
			+ "A file containing slides or used for a presentation.")
	@CamelizedName("presentationDigitalDocument")
	@ConstantizedName("PRESENTATION_DIGITAL_DOCUMENT")
	public interface PresentationDigitalDocument extends DigitalDocument, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PriceSpecification")
	@SchemaOrgLabel("PriceSpecification")
	@SchemaOrgComment(""
			+ "A structured value representing a price or price range. Typically, only the"
			+ " subclasses of this type are used for markup. It is recommended to use <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/MonetaryAmount\">MonetaryAmount</a> to describe"
			+ " independent amounts of money such as a salary, credit card limits, etc.")
	@CamelizedName("priceSpecification")
	@ConstantizedName("PRICE_SPECIFICATION")
	public interface PriceSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/eligibleQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleQuantity
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * uri: http://schema.org/eligibleTransactionVolume
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EligibleTransactionVolume
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * uri: http://schema.org/maxPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaxPrice
		 */
		public Container.MaxPrice getMaxPrice();
		public void setMaxPrice(Container.MaxPrice maxPrice);

		/**
		 * uri: http://schema.org/minPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinPrice
		 */
		public Container.MinPrice getMinPrice();
		public void setMinPrice(Container.MinPrice minPrice);

		/**
		 * uri: http://schema.org/price
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Price
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * uri: http://schema.org/priceCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * uri: http://schema.org/validFrom
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * uri: http://schema.org/validThrough
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * uri: http://schema.org/valueAddedTaxIncluded
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueAddedTaxIncluded
		 */
		public Container.ValueAddedTaxIncluded getValueAddedTaxIncluded();
		public void setValueAddedTaxIncluded(Container.ValueAddedTaxIncluded valueAddedTaxIncluded);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Product")
	@SchemaOrgLabel("Product")
	@SchemaOrgComment(""
			+ "Any offered product or service. For example: a pair of shoes; a concert ticket;"
			+ " the rental of a car; a haircut; or an episode of a TV show streamed online.")
	@CamelizedName("product")
	@ConstantizedName("PRODUCT")
	public interface Product extends SchemaOrgClass, Thing {

		/**
		 * uri: http://schema.org/additionalProperty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/award
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Award
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * uri: http://schema.org/brand
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Brand
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Container.Category getCategory();
		public void setCategory(Container.Category category);

		/**
		 * uri: http://schema.org/color
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Color
		 */
		public Container.Color getColor();
		public void setColor(Container.Color color);

		/**
		 * uri: http://schema.org/depth
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Depth
		 */
		public Container.Depth getDepth();
		public void setDepth(Container.Depth depth);

		/**
		 * uri: http://schema.org/gtin12
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin12
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * uri: http://schema.org/gtin13
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin13
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * uri: http://schema.org/gtin14
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin14
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * uri: http://schema.org/gtin8
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Gtin8
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * uri: http://schema.org/height
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Height
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * uri: http://schema.org/isAccessoryOrSparePartFor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsAccessoryOrSparePartFor
		 */
		public Container.IsAccessoryOrSparePartFor getIsAccessoryOrSparePartFor();
		public void setIsAccessoryOrSparePartFor(Container.IsAccessoryOrSparePartFor isAccessoryOrSparePartFor);

		/**
		 * uri: http://schema.org/isConsumableFor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsConsumableFor
		 */
		public Container.IsConsumableFor getIsConsumableFor();
		public void setIsConsumableFor(Container.IsConsumableFor isConsumableFor);

		/**
		 * uri: http://schema.org/isRelatedTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsRelatedTo
		 */
		public Container.IsRelatedTo getIsRelatedTo();
		public void setIsRelatedTo(Container.IsRelatedTo isRelatedTo);

		/**
		 * uri: http://schema.org/isSimilarTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsSimilarTo
		 */
		public Container.IsSimilarTo getIsSimilarTo();
		public void setIsSimilarTo(Container.IsSimilarTo isSimilarTo);

		/**
		 * uri: http://schema.org/itemCondition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemCondition
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * uri: http://schema.org/logo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Logo
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * uri: http://schema.org/manufacturer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer
		 */
		public Container.Manufacturer getManufacturer();
		public void setManufacturer(Container.Manufacturer manufacturer);

		/**
		 * uri: http://schema.org/material
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Material
		 */
		public Container.Material getMaterial();
		public void setMaterial(Container.Material material);

		/**
		 * uri: http://schema.org/model
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Model
		 */
		public Container.Model getModel();
		public void setModel(Container.Model model);

		/**
		 * uri: http://schema.org/mpn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Mpn
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * uri: http://schema.org/productID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductID
		 */
		public Container.ProductID getProductID();
		public void setProductID(Container.ProductID productID);

		/**
		 * uri: http://schema.org/productionDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionDate
		 */
		public Container.ProductionDate getProductionDate();
		public void setProductionDate(Container.ProductionDate productionDate);

		/**
		 * uri: http://schema.org/purchaseDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PurchaseDate
		 */
		public Container.PurchaseDate getPurchaseDate();
		public void setPurchaseDate(Container.PurchaseDate purchaseDate);

		/**
		 * uri: http://schema.org/releaseDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReleaseDate
		 */
		public Container.ReleaseDate getReleaseDate();
		public void setReleaseDate(Container.ReleaseDate releaseDate);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/sku
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sku
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * uri: http://schema.org/weight
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Weight
		 */
		public Container.Weight getWeight();
		public void setWeight(Container.Weight weight);

		/**
		 * uri: http://schema.org/width
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Width
		 */
		public Container.Width getWidth();
		public void setWidth(Container.Width width);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ProductModel")
	@SchemaOrgLabel("ProductModel")
	@SchemaOrgComment(""
			+ "A datasheet or vendor specification of a product (in the sense of a prototypical"
			+ " description).")
	@CamelizedName("productModel")
	@ConstantizedName("PRODUCT_MODEL")
	public interface ProductModel extends Product, SchemaOrgClass {

		/**
		 * uri: http://schema.org/isVariantOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsVariantOf
		 */
		public Container.IsVariantOf getIsVariantOf();
		public void setIsVariantOf(Container.IsVariantOf isVariantOf);

		/**
		 * uri: http://schema.org/predecessorOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PredecessorOf
		 */
		public Container.PredecessorOf getPredecessorOf();
		public void setPredecessorOf(Container.PredecessorOf predecessorOf);

		/**
		 * uri: http://schema.org/successorOf
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuccessorOf
		 */
		public Container.SuccessorOf getSuccessorOf();
		public void setSuccessorOf(Container.SuccessorOf successorOf);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ProfessionalService")
	@SchemaOrgLabel("ProfessionalService")
	@SchemaOrgComment(""
			+ "Original definition: \"provider of professional services.\"</p>\n\n<p>The"
			+ " general <a class=\"localLink\""
			+ " href=\"http://schema.org/ProfessionalService\">ProfessionalService</a> type for"
			+ " local businesses was deprecated due to confusion with <a class=\"localLink\""
			+ " href=\"http://schema.org/Service\">Service</a>. For reference, the types that"
			+ " it included were: <a class=\"localLink\""
			+ " href=\"http://schema.org/Dentist\">Dentist</a>,\n        <a class=\"localLink\""
			+ " href=\"http://schema.org/AccountingService\">AccountingService</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Attorney\">Attorney</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Notary\">Notary</a>, as well as"
			+ " types for several kinds of <a class=\"localLink\""
			+ " href=\"http://schema.org/HomeAndConstructionBusiness\">HomeAndConstructionBusiness</a>:"
			+ " <a class=\"localLink\" href=\"http://schema.org/Electrician\">Electrician</a>,"
			+ " <a class=\"localLink\""
			+ " href=\"http://schema.org/GeneralContractor\">GeneralContractor</a>,\n        <a"
			+ " class=\"localLink\" href=\"http://schema.org/HousePainter\">HousePainter</a>,"
			+ " <a class=\"localLink\" href=\"http://schema.org/Locksmith\">Locksmith</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/Plumber\">Plumber</a>, <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/RoofingContractor\">RoofingContractor</a>. <a"
			+ " class=\"localLink\" href=\"http://schema.org/LegalService\">LegalService</a>"
			+ " was introduced as a more inclusive supertype of <a class=\"localLink\""
			+ " href=\"http://schema.org/Attorney\">Attorney</a>.")
	@CamelizedName("professionalService")
	@ConstantizedName("PROFESSIONAL_SERVICE")
	public interface ProfessionalService extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ProfilePage")
	@SchemaOrgLabel("ProfilePage")
	@SchemaOrgComment("Web page type: Profile page.")
	@CamelizedName("profilePage")
	@ConstantizedName("PROFILE_PAGE")
	public interface ProfilePage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ProgramMembership")
	@SchemaOrgLabel("ProgramMembership")
	@SchemaOrgComment(""
			+ "Used to describe membership in a loyalty programs (e.g. \"StarAliance\"),"
			+ " traveler clubs (e.g. \"AAA\"), purchase clubs (\"Safeway Club\"), etc.")
	@CamelizedName("programMembership")
	@ConstantizedName("PROGRAM_MEMBERSHIP")
	public interface ProgramMembership extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/hostingOrganization
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HostingOrganization
		 */
		public Container.HostingOrganization getHostingOrganization();
		public void setHostingOrganization(Container.HostingOrganization hostingOrganization);

		/**
		 * uri: http://schema.org/member
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Member
		 */
		public Container.Member getMember();
		public void setMember(Container.Member member);

		/**
		 * uri: http://schema.org/membershipNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MembershipNumber
		 */
		public Container.MembershipNumber getMembershipNumber();
		public void setMembershipNumber(Container.MembershipNumber membershipNumber);

		/**
		 * uri: http://schema.org/programName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProgramName
		 */
		public Container.ProgramName getProgramName();
		public void setProgramName(Container.ProgramName programName);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PropertyValue")
	@SchemaOrgLabel("PropertyValue")
	@SchemaOrgComment(""
			+ "A property-value pair, e.g. representing a feature of a product or place. Use"
			+ " the 'name' property for the name of the property. If there is an additional"
			+ " human-readable version of the value, put that into the 'description'"
			+ " property.</p>\n\n<p>Always use specific schema.org properties when a) they"
			+ " exist and b) you can populate them. Using PropertyValue as a substitute will"
			+ " typically not trigger the same effect as using the original, specific property.")
	@CamelizedName("propertyValue")
	@ConstantizedName("PROPERTY_VALUE")
	public interface PropertyValue extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/maxValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaxValue
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * uri: http://schema.org/measurementTechnique
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.MeasurementTechnique
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		/**
		 * uri: http://schema.org/minValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinValue
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * uri: http://schema.org/propertyID
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PropertyID
		 */
		public Container.PropertyID getPropertyID();
		public void setPropertyID(Container.PropertyID propertyID);

		/**
		 * uri: http://schema.org/unitCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitCode
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * uri: http://schema.org/unitText
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitText
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		/**
		 * uri: http://schema.org/value
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Value
		 */
		public Container.Value getValue();
		public void setValue(Container.Value value);

		/**
		 * uri: http://schema.org/valueReference
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueReference
		 */
		public Container.ValueReference getValueReference();
		public void setValueReference(Container.ValueReference valueReference);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PropertyValueSpecification")
	@SchemaOrgLabel("PropertyValueSpecification")
	@SchemaOrgComment("A Property value specification.")
	@CamelizedName("propertyValueSpecification")
	@ConstantizedName("PROPERTY_VALUE_SPECIFICATION")
	public interface PropertyValueSpecification extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/defaultValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DefaultValue
		 */
		public Container.DefaultValue getDefaultValue();
		public void setDefaultValue(Container.DefaultValue defaultValue);

		/**
		 * uri: http://schema.org/maxValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaxValue
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * uri: http://schema.org/minValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinValue
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * uri: http://schema.org/multipleValues
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MultipleValues
		 */
		public Container.MultipleValues getMultipleValues();
		public void setMultipleValues(Container.MultipleValues multipleValues);

		/**
		 * uri: http://schema.org/readonlyValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReadonlyValue
		 */
		public Container.ReadonlyValue getReadonlyValue();
		public void setReadonlyValue(Container.ReadonlyValue readonlyValue);

		/**
		 * uri: http://schema.org/stepValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StepValue
		 */
		public Container.StepValue getStepValue();
		public void setStepValue(Container.StepValue stepValue);

		/**
		 * uri: http://schema.org/valueMaxLength
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueMaxLength
		 */
		public Container.ValueMaxLength getValueMaxLength();
		public void setValueMaxLength(Container.ValueMaxLength valueMaxLength);

		/**
		 * uri: http://schema.org/valueMinLength
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueMinLength
		 */
		public Container.ValueMinLength getValueMinLength();
		public void setValueMinLength(Container.ValueMinLength valueMinLength);

		/**
		 * uri: http://schema.org/valueName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueName
		 */
		public Container.ValueName getValueName();
		public void setValueName(Container.ValueName valueName);

		/**
		 * uri: http://schema.org/valuePattern
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValuePattern
		 */
		public Container.ValuePattern getValuePattern();
		public void setValuePattern(Container.ValuePattern valuePattern);

		/**
		 * uri: http://schema.org/valueRequired
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueRequired
		 */
		public Container.ValueRequired getValueRequired();
		public void setValueRequired(Container.ValueRequired valueRequired);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicSwimmingPool")
	@SchemaOrgLabel("PublicSwimmingPool")
	@SchemaOrgComment("A public swimming pool.")
	@CamelizedName("publicSwimmingPool")
	@ConstantizedName("PUBLIC_SWIMMING_POOL")
	public interface PublicSwimmingPool extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicationEvent")
	@SchemaOrgLabel("PublicationEvent")
	@SchemaOrgComment(""
			+ "A PublicationEvent corresponds indifferently to the event of publication for a"
			+ " CreativeWork of any type e.g. a broadcast event, an on-demand event, a"
			+ " book/journal publication via a variety of delivery media.")
	@CamelizedName("publicationEvent")
	@ConstantizedName("PUBLICATION_EVENT")
	public interface PublicationEvent extends Event, SchemaOrgClass {

		/**
		 * uri: http://schema.org/isAccessibleForFree
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * uri: http://schema.org/publishedBy
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.PublishedBy
		 */
		public PublishedBy getPublishedBy();
		public void setPublishedBy(PublishedBy publishedBy);

		/**
		 * uri: http://schema.org/publishedOn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PublishedOn
		 */
		public Container.PublishedOn getPublishedOn();
		public void setPublishedOn(Container.PublishedOn publishedOn);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicationIssue")
	@SchemaOrgLabel("PublicationIssue")
	@SchemaOrgComment(""
			+ "A part of a successively published publication such as a periodical or"
			+ " publication volume, often numbered, usually containing a grouping of works such"
			+ " as articles.</p>\n\n<p><a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog"
			+ " post</a>.")
	@CamelizedName("publicationIssue")
	@ConstantizedName("PUBLICATION_ISSUE")
	public interface PublicationIssue extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/issueNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IssueNumber
		 */
		public Container.IssueNumber getIssueNumber();
		public void setIssueNumber(Container.IssueNumber issueNumber);

		/**
		 * uri: http://schema.org/pageEnd
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageEnd
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * uri: http://schema.org/pageStart
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageStart
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * uri: http://schema.org/pagination
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Pagination
		 */
		public Container.Pagination getPagination();
		public void setPagination(Container.Pagination pagination);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PublicationVolume")
	@SchemaOrgLabel("PublicationVolume")
	@SchemaOrgComment(""
			+ "<p>A part of a successively published publication such as a periodical or"
			+ " multi-volume work, often numbered. It may represent a time span, such as a"
			+ " year.</p>\n\n<pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\"&gt;blog"
			+ " post&lt;/a&gt;.\n</code></pre>\n")
	@CamelizedName("publicationVolume")
	@ConstantizedName("PUBLICATION_VOLUME")
	public interface PublicationVolume extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/pageEnd
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageEnd
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * uri: http://schema.org/pageStart
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PageStart
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * uri: http://schema.org/pagination
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Pagination
		 */
		public Container.Pagination getPagination();
		public void setPagination(Container.Pagination pagination);

		/**
		 * uri: http://schema.org/volumeNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VolumeNumber
		 */
		public Container.VolumeNumber getVolumeNumber();
		public void setVolumeNumber(Container.VolumeNumber volumeNumber);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/QAPage")
	@SchemaOrgLabel("QAPage")
	@SchemaOrgComment(""
			+ "A QAPage is a WebPage focussed on a specific Question and its Answer(s), e.g. in"
			+ " a question answering site or documenting Frequently Asked Questions (FAQs).")
	@CamelizedName("qaPage")
	@ConstantizedName("QA_PAGE")
	public interface QAPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/QualitativeValue")
	@SchemaOrgLabel("QualitativeValue")
	@SchemaOrgComment(""
			+ "A predefined value for a product characteristic, e.g. the power cord plug type"
			+ " 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.")
	@CamelizedName("qualitativeValue")
	@ConstantizedName("QUALITATIVE_VALUE")
	public interface QualitativeValue extends Enumeration, SchemaOrgClass {

		/**
		 * uri: http://schema.org/additionalProperty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * uri: http://schema.org/equal
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Equal
		 */
		public Container.Equal getEqual();
		public void setEqual(Container.Equal equal);

		/**
		 * uri: http://schema.org/greater
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Greater
		 */
		public Container.Greater getGreater();
		public void setGreater(Container.Greater greater);

		/**
		 * uri: http://schema.org/greaterOrEqual
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GreaterOrEqual
		 */
		public Container.GreaterOrEqual getGreaterOrEqual();
		public void setGreaterOrEqual(Container.GreaterOrEqual greaterOrEqual);

		/**
		 * uri: http://schema.org/lesser
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Lesser
		 */
		public Container.Lesser getLesser();
		public void setLesser(Container.Lesser lesser);

		/**
		 * uri: http://schema.org/lesserOrEqual
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LesserOrEqual
		 */
		public Container.LesserOrEqual getLesserOrEqual();
		public void setLesserOrEqual(Container.LesserOrEqual lesserOrEqual);

		/**
		 * uri: http://schema.org/nonEqual
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NonEqual
		 */
		public Container.NonEqual getNonEqual();
		public void setNonEqual(Container.NonEqual nonEqual);

		/**
		 * uri: http://schema.org/valueReference
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueReference
		 */
		public Container.ValueReference getValueReference();
		public void setValueReference(Container.ValueReference valueReference);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/QuantitativeValue")
	@SchemaOrgLabel("QuantitativeValue")
	@SchemaOrgComment(""
			+ "A point value or interval for product characteristics and other purposes.")
	@CamelizedName("quantitativeValue")
	@ConstantizedName("QUANTITATIVE_VALUE")
	public interface QuantitativeValue extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/additionalProperty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalProperty
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * uri: http://schema.org/maxValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MaxValue
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * uri: http://schema.org/minValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MinValue
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * uri: http://schema.org/unitCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitCode
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * uri: http://schema.org/unitText
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitText
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		/**
		 * uri: http://schema.org/value
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Value
		 */
		public Container.Value getValue();
		public void setValue(Container.Value value);

		/**
		 * uri: http://schema.org/valueReference
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ValueReference
		 */
		public Container.ValueReference getValueReference();
		public void setValueReference(Container.ValueReference valueReference);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Quantity")
	@SchemaOrgLabel("Quantity")
	@SchemaOrgComment(""
			+ "Quantities such as distance, time, mass, weight, etc. Particular instances of"
			+ " say Mass are entities like '3 Kg' or '4 milligrams'.")
	@CamelizedName("quantity")
	@ConstantizedName("QUANTITY")
	public interface Quantity extends Intangible, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Question")
	@SchemaOrgLabel("Question")
	@SchemaOrgComment(""
			+ "A specific question - e.g. from a user seeking answers online, or collected in a"
			+ " Frequently Asked Questions (FAQ) document.")
	@CamelizedName("question")
	@ConstantizedName("QUESTION")
	public interface Question extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/acceptedAnswer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AcceptedAnswer
		 */
		public Container.AcceptedAnswer getAcceptedAnswer();
		public void setAcceptedAnswer(Container.AcceptedAnswer acceptedAnswer);

		/**
		 * uri: http://schema.org/answerCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AnswerCount
		 */
		public Container.AnswerCount getAnswerCount();
		public void setAnswerCount(Container.AnswerCount answerCount);

		/**
		 * uri: http://schema.org/downvoteCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DownvoteCount
		 */
		public Container.DownvoteCount getDownvoteCount();
		public void setDownvoteCount(Container.DownvoteCount downvoteCount);

		/**
		 * uri: http://schema.org/suggestedAnswer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuggestedAnswer
		 */
		public Container.SuggestedAnswer getSuggestedAnswer();
		public void setSuggestedAnswer(Container.SuggestedAnswer suggestedAnswer);

		/**
		 * uri: http://schema.org/upvoteCount
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UpvoteCount
		 */
		public Container.UpvoteCount getUpvoteCount();
		public void setUpvoteCount(Container.UpvoteCount upvoteCount);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/QuoteAction")
	@SchemaOrgLabel("QuoteAction")
	@SchemaOrgComment(""
			+ "An agent quotes/estimates/appraises an object/product/service with a price at a"
			+ " location/store.")
	@CamelizedName("quoteAction")
	@ConstantizedName("QUOTE_ACTION")
	public interface QuoteAction extends SchemaOrgClass, TradeAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RVPark")
	@SchemaOrgLabel("RVPark")
	@SchemaOrgComment(""
			+ "A place offering space for \"Recreational Vehicles\", Caravans, mobile homes and"
			+ " the like.")
	@CamelizedName("rvPark")
	@ConstantizedName("RV_PARK")
	public interface RVPark extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioChannel")
	@SchemaOrgLabel("RadioChannel")
	@SchemaOrgComment(""
			+ "A unique instance of a radio BroadcastService on a CableOrSatelliteService"
			+ " lineup.")
	@CamelizedName("radioChannel")
	@ConstantizedName("RADIO_CHANNEL")
	public interface RadioChannel extends BroadcastChannel, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioClip")
	@SchemaOrgLabel("RadioClip")
	@SchemaOrgComment(""
			+ "A short radio program or a segment/part of a radio program.")
	@CamelizedName("radioClip")
	@ConstantizedName("RADIO_CLIP")
	public interface RadioClip extends Clip, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioEpisode")
	@SchemaOrgLabel("RadioEpisode")
	@SchemaOrgComment(""
			+ "A radio episode which can be part of a series or season.")
	@CamelizedName("radioEpisode")
	@ConstantizedName("RADIO_EPISODE")
	public interface RadioEpisode extends Episode, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioSeason")
	@SchemaOrgLabel("RadioSeason")
	@SchemaOrgComment(""
			+ "Season dedicated to radio broadcast and associated online delivery.")
	@CamelizedName("radioSeason")
	@ConstantizedName("RADIO_SEASON")
	public interface RadioSeason extends CreativeWorkSeason, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioSeries")
	@SchemaOrgLabel("RadioSeries")
	@SchemaOrgComment(""
			+ "CreativeWorkSeries dedicated to radio broadcast and associated online delivery.")
	@CamelizedName("radioSeries")
	@ConstantizedName("RADIO_SERIES")
	public interface RadioSeries extends CreativeWorkSeries, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/containsSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContainsSeason
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Episode
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/numberOfEpisodes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEpisodes
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * uri: http://schema.org/numberOfSeasons
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfSeasons
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RadioStation")
	@SchemaOrgLabel("RadioStation")
	@SchemaOrgComment("A radio station.")
	@CamelizedName("radioStation")
	@ConstantizedName("RADIO_STATION")
	public interface RadioStation extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Rating")
	@SchemaOrgLabel("Rating")
	@SchemaOrgComment(""
			+ "A rating is an evaluation on a numeric scale, such as 1 to 5 stars.")
	@CamelizedName("rating")
	@ConstantizedName("RATING")
	public interface Rating extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/author
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Author
		 */
		public Container.Author getAuthor();
		public void setAuthor(Container.Author author);

		/**
		 * uri: http://schema.org/bestRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BestRating
		 */
		public Container.BestRating getBestRating();
		public void setBestRating(Container.BestRating bestRating);

		/**
		 * uri: http://schema.org/ratingValue
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RatingValue
		 */
		public Container.RatingValue getRatingValue();
		public void setRatingValue(Container.RatingValue ratingValue);

		/**
		 * uri: http://schema.org/worstRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorstRating
		 */
		public Container.WorstRating getWorstRating();
		public void setWorstRating(Container.WorstRating worstRating);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReactAction")
	@SchemaOrgLabel("ReactAction")
	@SchemaOrgComment(""
			+ "The act of responding instinctively and emotionally to an object, expressing a"
			+ " sentiment.")
	@CamelizedName("reactAction")
	@ConstantizedName("REACT_ACTION")
	public interface ReactAction extends AssessAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReadAction")
	@SchemaOrgLabel("ReadAction")
	@SchemaOrgComment("The act of consuming written content.")
	@CamelizedName("readAction")
	@ConstantizedName("READ_ACTION")
	public interface ReadAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RealEstateAgent")
	@SchemaOrgLabel("RealEstateAgent")
	@SchemaOrgComment("A real-estate agent.")
	@CamelizedName("realEstateAgent")
	@ConstantizedName("REAL_ESTATE_AGENT")
	public interface RealEstateAgent extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReceiveAction")
	@SchemaOrgLabel("ReceiveAction")
	@SchemaOrgComment(""
			+ "<p>The act of physically/electronically taking delivery of an object thathas"
			+ " been transferred from an origin to a destination. Reciprocal of"
			+ " SendAction.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SendAction\">SendAction</a>: The reciprocal of"
			+ " ReceiveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/TakeAction\">TakeAction</a>: Unlike TakeAction,"
			+ " ReceiveAction does not imply that the ownership has been transfered (e.g. I can"
			+ " receive a package, but it does not mean the package is now mine).</li>\n</ul>\n")
	@CamelizedName("receiveAction")
	@ConstantizedName("RECEIVE_ACTION")
	public interface ReceiveAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/deliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryMethod
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		/**
		 * uri: http://schema.org/sender
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sender
		 */
		public Container.Sender getSender();
		public void setSender(Container.Sender sender);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Recipe")
	@SchemaOrgLabel("Recipe")
	@SchemaOrgComment(""
			+ "A recipe. For dietary restrictions covered by the recipe, a few common"
			+ " restrictions are enumerated via <a class=\"localLink\""
			+ " href=\"http://schema.org/suitableForDiet\">suitableForDiet</a>. The <a"
			+ " class=\"localLink\" href=\"http://schema.org/keywords\">keywords</a> property"
			+ " can also be used to add more detail.")
	@CamelizedName("recipe")
	@ConstantizedName("RECIPE")
	public interface Recipe extends HowTo, SchemaOrgClass {

		/**
		 * uri: http://schema.org/cookTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CookTime
		 */
		public Container.CookTime getCookTime();
		public void setCookTime(Container.CookTime cookTime);

		/**
		 * uri: http://schema.org/cookingMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CookingMethod
		 */
		public Container.CookingMethod getCookingMethod();
		public void setCookingMethod(Container.CookingMethod cookingMethod);

		/**
		 * uri: http://schema.org/nutrition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Nutrition
		 */
		public Container.Nutrition getNutrition();
		public void setNutrition(Container.Nutrition nutrition);

		/**
		 * uri: http://schema.org/recipeCategory
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecipeCategory
		 */
		public Container.RecipeCategory getRecipeCategory();
		public void setRecipeCategory(Container.RecipeCategory recipeCategory);

		/**
		 * uri: http://schema.org/recipeCuisine
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecipeCuisine
		 */
		public Container.RecipeCuisine getRecipeCuisine();
		public void setRecipeCuisine(Container.RecipeCuisine recipeCuisine);

		/**
		 * uri: http://schema.org/recipeIngredient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecipeIngredient
		 */
		public Container.RecipeIngredient getRecipeIngredient();
		public void setRecipeIngredient(Container.RecipeIngredient recipeIngredient);

		/**
		 * uri: http://schema.org/recipeInstructions
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecipeInstructions
		 */
		public Container.RecipeInstructions getRecipeInstructions();
		public void setRecipeInstructions(Container.RecipeInstructions recipeInstructions);

		/**
		 * uri: http://schema.org/recipeYield
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RecipeYield
		 */
		public Container.RecipeYield getRecipeYield();
		public void setRecipeYield(Container.RecipeYield recipeYield);

		/**
		 * uri: http://schema.org/suitableForDiet
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SuitableForDiet
		 */
		public Container.SuitableForDiet getSuitableForDiet();
		public void setSuitableForDiet(Container.SuitableForDiet suitableForDiet);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RecyclingCenter")
	@SchemaOrgLabel("RecyclingCenter")
	@SchemaOrgComment("A recycling center.")
	@CamelizedName("recyclingCenter")
	@ConstantizedName("RECYCLING_CENTER")
	public interface RecyclingCenter extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RegisterAction")
	@SchemaOrgLabel("RegisterAction")
	@SchemaOrgComment(""
			+ "<p>The act of registering to be a user of a service, product or web"
			+ " page.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/JoinAction\">JoinAction</a>: Unlike JoinAction,"
			+ " RegisterAction implies you are registering to be a user of a service,"
			+ " <em>not</em> a group/team of people.</li>\n<li>[FollowAction]]: Unlike"
			+ " FollowAction, RegisterAction doesn't imply that the agent is expecting to poll"
			+ " for updates from the object.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SubscribeAction\">SubscribeAction</a>: Unlike"
			+ " SubscribeAction, RegisterAction doesn't imply that the agent is expecting"
			+ " updates from the object.</li>\n</ul>\n")
	@CamelizedName("registerAction")
	@ConstantizedName("REGISTER_ACTION")
	public interface RegisterAction extends InteractAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RejectAction")
	@SchemaOrgLabel("RejectAction")
	@SchemaOrgComment(""
			+ "<p>The act of rejecting to/adopting an object.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/AcceptAction\">AcceptAction</a>: The antonym of"
			+ " RejectAction.</li>\n</ul>\n")
	@CamelizedName("rejectAction")
	@ConstantizedName("REJECT_ACTION")
	public interface RejectAction extends AllocateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RentAction")
	@SchemaOrgLabel("RentAction")
	@SchemaOrgComment(""
			+ "The act of giving money in return for temporary use, but not ownership, of an"
			+ " object such as a vehicle or property. For example, an agent rents a property"
			+ " from a landlord in exchange for a periodic payment.")
	@CamelizedName("rentAction")
	@ConstantizedName("RENT_ACTION")
	public interface RentAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/landlord
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Landlord
		 */
		public Container.Landlord getLandlord();
		public void setLandlord(Container.Landlord landlord);

		/**
		 * uri: http://schema.org/realEstateAgent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RealEstateAgent
		 */
		public Container.RealEstateAgent getRealEstateAgent();
		public void setRealEstateAgent(Container.RealEstateAgent realEstateAgent);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RentalCarReservation")
	@SchemaOrgLabel("RentalCarReservation")
	@SchemaOrgComment(""
			+ "A reservation for a rental car.</p>\n\n<p>Note: This type is for information"
			+ " about actual reservations, e.g. in confirmation emails or HTML pages with"
			+ " individual confirmations of reservations.")
	@CamelizedName("rentalCarReservation")
	@ConstantizedName("RENTAL_CAR_RESERVATION")
	public interface RentalCarReservation extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dropoffLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DropoffLocation
		 */
		public Container.DropoffLocation getDropoffLocation();
		public void setDropoffLocation(Container.DropoffLocation dropoffLocation);

		/**
		 * uri: http://schema.org/dropoffTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DropoffTime
		 */
		public Container.DropoffTime getDropoffTime();
		public void setDropoffTime(Container.DropoffTime dropoffTime);

		/**
		 * uri: http://schema.org/pickupLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PickupLocation
		 */
		public Container.PickupLocation getPickupLocation();
		public void setPickupLocation(Container.PickupLocation pickupLocation);

		/**
		 * uri: http://schema.org/pickupTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PickupTime
		 */
		public Container.PickupTime getPickupTime();
		public void setPickupTime(Container.PickupTime pickupTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReplaceAction")
	@SchemaOrgLabel("ReplaceAction")
	@SchemaOrgComment(""
			+ "The act of editing a recipient by replacing an old object with a new object.")
	@CamelizedName("replaceAction")
	@ConstantizedName("REPLACE_ACTION")
	public interface ReplaceAction extends SchemaOrgClass, UpdateAction {

		/**
		 * uri: http://schema.org/replacee
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Replacee
		 */
		public Container.Replacee getReplacee();
		public void setReplacee(Container.Replacee replacee);

		/**
		 * uri: http://schema.org/replacer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Replacer
		 */
		public Container.Replacer getReplacer();
		public void setReplacer(Container.Replacer replacer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReplyAction")
	@SchemaOrgLabel("ReplyAction")
	@SchemaOrgComment(""
			+ "<p>The act of responding to a question/message asked/sent by the object. Related"
			+ " to <a class=\"localLink\""
			+ " href=\"http://schema.org/AskAction\">AskAction</a></p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/AskAction\">AskAction</a>: Appears generally as an"
			+ " origin of a ReplyAction.</li>\n</ul>\n")
	@CamelizedName("replyAction")
	@ConstantizedName("REPLY_ACTION")
	public interface ReplyAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/resultComment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ResultComment
		 */
		public Container.ResultComment getResultComment();
		public void setResultComment(Container.ResultComment resultComment);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Report")
	@SchemaOrgLabel("Report")
	@SchemaOrgComment(""
			+ "A Report generated by governmental or non-governmental organization.")
	@CamelizedName("report")
	@ConstantizedName("REPORT")
	public interface Report extends Article, SchemaOrgClass {

		/**
		 * uri: http://schema.org/reportNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReportNumber
		 */
		public Container.ReportNumber getReportNumber();
		public void setReportNumber(Container.ReportNumber reportNumber);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Reservation")
	@SchemaOrgLabel("Reservation")
	@SchemaOrgComment(""
			+ "Describes a reservation for travel, dining or an event. Some reservations"
			+ " require tickets. </p>\n\n<p>Note: This type is for information about actual"
			+ " reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, restaurant reservations,"
			+ " flights, or rental cars, use <a class=\"localLink\""
			+ " href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("reservation")
	@ConstantizedName("RESERVATION")
	public interface Reservation extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/bookingTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BookingTime
		 */
		public Container.BookingTime getBookingTime();
		public void setBookingTime(Container.BookingTime bookingTime);

		/**
		 * uri: http://schema.org/broker
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Broker
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * uri: http://schema.org/modifiedTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ModifiedTime
		 */
		public Container.ModifiedTime getModifiedTime();
		public void setModifiedTime(Container.ModifiedTime modifiedTime);

		/**
		 * uri: http://schema.org/priceCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * uri: http://schema.org/programMembershipUsed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProgramMembershipUsed
		 */
		public Container.ProgramMembershipUsed getProgramMembershipUsed();
		public void setProgramMembershipUsed(Container.ProgramMembershipUsed programMembershipUsed);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/reservationFor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReservationFor
		 */
		public Container.ReservationFor getReservationFor();
		public void setReservationFor(Container.ReservationFor reservationFor);

		/**
		 * uri: http://schema.org/reservationId
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReservationId
		 */
		public Container.ReservationId getReservationId();
		public void setReservationId(Container.ReservationId reservationId);

		/**
		 * uri: http://schema.org/reservationStatus
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReservationStatus
		 */
		public Container.ReservationStatus getReservationStatus();
		public void setReservationStatus(Container.ReservationStatus reservationStatus);

		/**
		 * uri: http://schema.org/reservedTicket
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReservedTicket
		 */
		public Container.ReservedTicket getReservedTicket();
		public void setReservedTicket(Container.ReservedTicket reservedTicket);

		/**
		 * uri: http://schema.org/totalPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TotalPrice
		 */
		public Container.TotalPrice getTotalPrice();
		public void setTotalPrice(Container.TotalPrice totalPrice);

		/**
		 * uri: http://schema.org/underName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnderName
		 */
		public Container.UnderName getUnderName();
		public void setUnderName(Container.UnderName underName);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationPackage")
	@SchemaOrgLabel("ReservationPackage")
	@SchemaOrgComment(""
			+ "A group of multiple reservations with common values for all sub-reservations.")
	@CamelizedName("reservationPackage")
	@ConstantizedName("RESERVATION_PACKAGE")
	public interface ReservationPackage extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/subReservation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubReservation
		 */
		public Container.SubReservation getSubReservation();
		public void setSubReservation(Container.SubReservation subReservation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReservationStatusType")
	@SchemaOrgLabel("ReservationStatusType")
	@SchemaOrgComment(""
			+ "Enumerated status values for Reservation.")
	@CamelizedName("reservationStatusType")
	@ConstantizedName("RESERVATION_STATUS_TYPE")
	public interface ReservationStatusType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReserveAction")
	@SchemaOrgLabel("ReserveAction")
	@SchemaOrgComment(""
			+ "<p>Reserving a concrete object.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/ScheduleAction\">ScheduleAction</a></a>: Unlike"
			+ " ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel)"
			+ " towards a time slot / spatial allocation.</li>\n</ul>\n")
	@CamelizedName("reserveAction")
	@ConstantizedName("RESERVE_ACTION")
	public interface ReserveAction extends PlanAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Reservoir")
	@SchemaOrgLabel("Reservoir")
	@SchemaOrgComment(""
			+ "A reservoir of water, typically an artificially created lake, like the Lake"
			+ " Kariba reservoir.")
	@CamelizedName("reservoir")
	@ConstantizedName("RESERVOIR")
	public interface Reservoir extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Residence")
	@SchemaOrgLabel("Residence")
	@SchemaOrgComment("The place where a person lives.")
	@CamelizedName("residence")
	@ConstantizedName("RESIDENCE")
	public interface Residence extends Place, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Resort")
	@SchemaOrgLabel("Resort")
	@SchemaOrgComment(""
			+ "A resort is a place used for relaxation or recreation, attracting visitors for"
			+ " holidays or vacations. Resorts are places, towns or sometimes commercial"
			+ " establishment operated by a single company (Source: Wikipedia, the free"
			+ " encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/Resort\">http://en.wikipedia.org/wiki/Resort</a>).\n<br"
			+ " /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the"
			+ " use of schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("resort")
	@ConstantizedName("RESORT")
	public interface Resort extends LodgingBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Restaurant")
	@SchemaOrgLabel("Restaurant")
	@SchemaOrgComment("A restaurant.")
	@CamelizedName("restaurant")
	@ConstantizedName("RESTAURANT")
	public interface Restaurant extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RestrictedDiet")
	@SchemaOrgLabel("RestrictedDiet")
	@SchemaOrgComment(""
			+ "A diet restricted to certain foods or preparations for cultural, religious,"
			+ " health or lifestyle reasons.")
	@CamelizedName("restrictedDiet")
	@ConstantizedName("RESTRICTED_DIET")
	public interface RestrictedDiet extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ResumeAction")
	@SchemaOrgLabel("ResumeAction")
	@SchemaOrgComment(""
			+ "The act of resuming a device or application which was formerly paused (e.g."
			+ " resume music playback or resume a timer).")
	@CamelizedName("resumeAction")
	@ConstantizedName("RESUME_ACTION")
	public interface ResumeAction extends ControlAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReturnAction")
	@SchemaOrgLabel("ReturnAction")
	@SchemaOrgComment(""
			+ "The act of returning to the origin that which was previously received (concrete"
			+ " objects) or taken (ownership).")
	@CamelizedName("returnAction")
	@ConstantizedName("RETURN_ACTION")
	public interface ReturnAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Review")
	@SchemaOrgLabel("Review")
	@SchemaOrgComment(""
			+ "A review of an item - for example, of a restaurant, movie, or store.")
	@CamelizedName("review")
	@ConstantizedName("REVIEW")
	public interface Review extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/itemReviewed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ItemReviewed
		 */
		public Container.ItemReviewed getItemReviewed();
		public void setItemReviewed(Container.ItemReviewed itemReviewed);

		/**
		 * uri: http://schema.org/reviewBody
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReviewBody
		 */
		public Container.ReviewBody getReviewBody();
		public void setReviewBody(Container.ReviewBody reviewBody);

		/**
		 * uri: http://schema.org/reviewRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReviewRating
		 */
		public Container.ReviewRating getReviewRating();
		public void setReviewRating(Container.ReviewRating reviewRating);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ReviewAction")
	@SchemaOrgLabel("ReviewAction")
	@SchemaOrgComment(""
			+ "The act of producing a balanced opinion about the object for an audience. An"
			+ " agent reviews an object with participants resulting in a review.")
	@CamelizedName("reviewAction")
	@ConstantizedName("REVIEW_ACTION")
	public interface ReviewAction extends AssessAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/resultReview
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ResultReview
		 */
		public Container.ResultReview getResultReview();
		public void setResultReview(Container.ResultReview resultReview);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RiverBodyOfWater")
	@SchemaOrgLabel("RiverBodyOfWater")
	@SchemaOrgComment(""
			+ "A river (for example, the broad majestic Shannon).")
	@CamelizedName("riverBodyOfWater")
	@ConstantizedName("RIVER_BODY_OF_WATER")
	public interface RiverBodyOfWater extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Role")
	@SchemaOrgLabel("Role")
	@SchemaOrgComment(""
			+ "Represents additional information about a relationship or property. For example"
			+ " a Role can be used to say that a 'member' role linking some SportsTeam to a"
			+ " player occurred during a particular time period. Or that a Person's 'actor'"
			+ " role in a Movie was for some particular characterName. Such properties can be"
			+ " attached to a Role entity, which is then associated with the main entities"
			+ " using ordinary properties like 'member' or 'actor'.</p>\n\n<p>See also <a"
			+ " href=\"http://blog.schema.org/2014/06/introducing-role.html\">blog post</a>.")
	@CamelizedName("role")
	@ConstantizedName("ROLE")
	public interface Role extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/endDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.EndDate
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * uri: http://schema.org/roleName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RoleName
		 */
		public Container.RoleName getRoleName();
		public void setRoleName(Container.RoleName roleName);

		/**
		 * uri: http://schema.org/startDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StartDate
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RoofingContractor")
	@SchemaOrgLabel("RoofingContractor")
	@SchemaOrgComment("A roofing contractor.")
	@CamelizedName("roofingContractor")
	@ConstantizedName("ROOFING_CONTRACTOR")
	public interface RoofingContractor extends HomeAndConstructionBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Room")
	@SchemaOrgLabel("Room")
	@SchemaOrgComment(""
			+ "A room is a distinguishable space within a structure, usually separated from"
			+ " other spaces by interior walls. (Source: Wikipedia, the free encyclopedia, see"
			+ " <a"
			+ " href=\"http://en.wikipedia.org/wiki/Room\">http://en.wikipedia.org/wiki/Room</a>).\n<br"
			+ " /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the"
			+ " use of schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("room")
	@ConstantizedName("ROOM")
	public interface Room extends Accommodation, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RsvpAction")
	@SchemaOrgLabel("RsvpAction")
	@SchemaOrgComment(""
			+ "The act of notifying an event organizer as to whether you expect to attend the"
			+ " event.")
	@CamelizedName("rsvpAction")
	@ConstantizedName("RSVP_ACTION")
	public interface RsvpAction extends InformAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/additionalNumberOfGuests
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalNumberOfGuests
		 */
		public Container.AdditionalNumberOfGuests getAdditionalNumberOfGuests();
		public void setAdditionalNumberOfGuests(Container.AdditionalNumberOfGuests additionalNumberOfGuests);

		/**
		 * uri: http://schema.org/comment
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Comment
		 */
		public Container.Comment getComment();
		public void setComment(Container.Comment comment);

		/**
		 * uri: http://schema.org/rsvpResponse
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RsvpResponse
		 */
		public Container.RsvpResponse getRsvpResponse();
		public void setRsvpResponse(Container.RsvpResponse rsvpResponse);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RsvpResponseType")
	@SchemaOrgLabel("RsvpResponseType")
	@SchemaOrgComment(""
			+ "RsvpResponseType is an enumeration type whose instances represent responding to"
			+ " an RSVP request.")
	@CamelizedName("rsvpResponseType")
	@ConstantizedName("RSVP_RESPONSE_TYPE")
	public interface RsvpResponseType extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SaleEvent")
	@SchemaOrgLabel("SaleEvent")
	@SchemaOrgComment("Event type: Sales event.")
	@CamelizedName("saleEvent")
	@ConstantizedName("SALE_EVENT")
	public interface SaleEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ScheduleAction")
	@SchemaOrgLabel("ScheduleAction")
	@SchemaOrgComment(""
			+ "<p>Scheduling future actions, events, or tasks.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ReserveAction\">ReserveAction</a>: Unlike"
			+ " ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task,"
			+ " etc) towards a time slot / spatial allocation.</li>\n</ul>\n")
	@CamelizedName("scheduleAction")
	@ConstantizedName("SCHEDULE_ACTION")
	public interface ScheduleAction extends PlanAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ScholarlyArticle")
	@SchemaOrgLabel("ScholarlyArticle")
	@SchemaOrgComment("A scholarly article.")
	@CamelizedName("scholarlyArticle")
	@ConstantizedName("SCHOLARLY_ARTICLE")
	public interface ScholarlyArticle extends Article, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/School")
	@SchemaOrgLabel("School")
	@SchemaOrgComment("A school.")
	@CamelizedName("school")
	@ConstantizedName("SCHOOL")
	public interface School extends EducationalOrganization, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ScreeningEvent")
	@SchemaOrgLabel("ScreeningEvent")
	@SchemaOrgComment("A screening of a movie or other video.")
	@CamelizedName("screeningEvent")
	@ConstantizedName("SCREENING_EVENT")
	public interface ScreeningEvent extends Event, SchemaOrgClass {

		/**
		 * uri: http://schema.org/subtitleLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubtitleLanguage
		 */
		public Container.SubtitleLanguage getSubtitleLanguage();
		public void setSubtitleLanguage(Container.SubtitleLanguage subtitleLanguage);

		/**
		 * uri: http://schema.org/videoFormat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VideoFormat
		 */
		public Container.VideoFormat getVideoFormat();
		public void setVideoFormat(Container.VideoFormat videoFormat);

		/**
		 * uri: http://schema.org/workPresented
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WorkPresented
		 */
		public Container.WorkPresented getWorkPresented();
		public void setWorkPresented(Container.WorkPresented workPresented);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Sculpture")
	@SchemaOrgLabel("Sculpture")
	@SchemaOrgComment("A piece of sculpture.")
	@CamelizedName("sculpture")
	@ConstantizedName("SCULPTURE")
	public interface Sculpture extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SeaBodyOfWater")
	@SchemaOrgLabel("SeaBodyOfWater")
	@SchemaOrgComment("A sea (for example, the Caspian sea).")
	@CamelizedName("seaBodyOfWater")
	@ConstantizedName("SEA_BODY_OF_WATER")
	public interface SeaBodyOfWater extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SearchAction")
	@SchemaOrgLabel("SearchAction")
	@SchemaOrgComment(""
			+ "<p>The act of searching for an object.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FindAction\">FindAction</a>: SearchAction generally"
			+ " leads to a FindAction, but not necessarily.</li>\n</ul>\n")
	@CamelizedName("searchAction")
	@ConstantizedName("SEARCH_ACTION")
	public interface SearchAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/query
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Query
		 */
		public Container.Query getQuery();
		public void setQuery(Container.Query query);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SearchResultsPage")
	@SchemaOrgLabel("SearchResultsPage")
	@SchemaOrgComment("Web page type: Search results page.")
	@CamelizedName("searchResultsPage")
	@ConstantizedName("SEARCH_RESULTS_PAGE")
	public interface SearchResultsPage extends SchemaOrgClass, WebPage {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Seat")
	@SchemaOrgLabel("Seat")
	@SchemaOrgComment(""
			+ "Used to describe a seat, such as a reserved seat in an event reservation.")
	@CamelizedName("seat")
	@ConstantizedName("SEAT")
	public interface Seat extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/seatNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SeatNumber
		 */
		public Container.SeatNumber getSeatNumber();
		public void setSeatNumber(Container.SeatNumber seatNumber);

		/**
		 * uri: http://schema.org/seatRow
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SeatRow
		 */
		public Container.SeatRow getSeatRow();
		public void setSeatRow(Container.SeatRow seatRow);

		/**
		 * uri: http://schema.org/seatSection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SeatSection
		 */
		public Container.SeatSection getSeatSection();
		public void setSeatSection(Container.SeatSection seatSection);

		/**
		 * uri: http://schema.org/seatingType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SeatingType
		 */
		public Container.SeatingType getSeatingType();
		public void setSeatingType(Container.SeatingType seatingType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SelfStorage")
	@SchemaOrgLabel("SelfStorage")
	@SchemaOrgComment("A self-storage facility.")
	@CamelizedName("selfStorage")
	@ConstantizedName("SELF_STORAGE")
	public interface SelfStorage extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SellAction")
	@SchemaOrgLabel("SellAction")
	@SchemaOrgComment(""
			+ "The act of taking money from a buyer in exchange for goods or services rendered."
			+ " An agent sells an object, product, or service to a buyer for a price."
			+ " Reciprocal of BuyAction.")
	@CamelizedName("sellAction")
	@ConstantizedName("SELL_ACTION")
	public interface SellAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/buyer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Buyer
		 */
		public Container.Buyer getBuyer();
		public void setBuyer(Container.Buyer buyer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SendAction")
	@SchemaOrgLabel("SendAction")
	@SchemaOrgComment(""
			+ "<p>The act of physically/electronically dispatching an object for transfer from"
			+ " an origin to a destination.Related actions:</p>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/ReceiveAction\">ReceiveAction</a>:"
			+ " The reciprocal of SendAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/GiveAction\">GiveAction</a>: Unlike GiveAction,"
			+ " SendAction does not imply the transfer of ownership (e.g. I can send you my"
			+ " laptop, but I'm not necessarily giving it to you).</li>\n</ul>\n")
	@CamelizedName("sendAction")
	@ConstantizedName("SEND_ACTION")
	public interface SendAction extends SchemaOrgClass, TransferAction {

		/**
		 * uri: http://schema.org/deliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryMethod
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Series")
	@SchemaOrgLabel("Series")
	@SchemaOrgComment(""
			+ "A Series in schema.org is a group of related items, typically but not"
			+ " necessarily of the same kind.")
	@CamelizedName("series")
	@ConstantizedName("SERIES")
	public interface Series extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Service")
	@SchemaOrgLabel("Service")
	@SchemaOrgComment(""
			+ "A service provided by an organization, e.g. delivery service, print services,"
			+ " etc.")
	@CamelizedName("service")
	@ConstantizedName("SERVICE")
	public interface Service extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/aggregateRating
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * uri: http://schema.org/areaServed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AreaServed
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * uri: http://schema.org/audience
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Audience
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * uri: http://schema.org/availableChannel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableChannel
		 */
		public Container.AvailableChannel getAvailableChannel();
		public void setAvailableChannel(Container.AvailableChannel availableChannel);

		/**
		 * uri: http://schema.org/award
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Award
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * uri: http://schema.org/brand
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Brand
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * uri: http://schema.org/broker
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Broker
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * uri: http://schema.org/category
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Category
		 */
		public Container.Category getCategory();
		public void setCategory(Container.Category category);

		/**
		 * uri: http://schema.org/hasOfferCatalog
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HasOfferCatalog
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * uri: http://schema.org/hoursAvailable
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HoursAvailable
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * uri: http://schema.org/isRelatedTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsRelatedTo
		 */
		public Container.IsRelatedTo getIsRelatedTo();
		public void setIsRelatedTo(Container.IsRelatedTo isRelatedTo);

		/**
		 * uri: http://schema.org/isSimilarTo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IsSimilarTo
		 */
		public Container.IsSimilarTo getIsSimilarTo();
		public void setIsSimilarTo(Container.IsSimilarTo isSimilarTo);

		/**
		 * uri: http://schema.org/logo
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Logo
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * uri: http://schema.org/offers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Offers
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/providerMobility
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProviderMobility
		 */
		public Container.ProviderMobility getProviderMobility();
		public void setProviderMobility(Container.ProviderMobility providerMobility);

		/**
		 * uri: http://schema.org/review
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Review
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * uri: http://schema.org/serviceOutput
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceOutput
		 */
		public Container.ServiceOutput getServiceOutput();
		public void setServiceOutput(Container.ServiceOutput serviceOutput);

		/**
		 * uri: http://schema.org/serviceType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceType
		 */
		public Container.ServiceType getServiceType();
		public void setServiceType(Container.ServiceType serviceType);

		/**
		 * uri: http://schema.org/termsOfService
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.TermsOfService
		 */
		public TermsOfService getTermsOfService();
		public void setTermsOfService(TermsOfService termsOfService);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ServiceChannel")
	@SchemaOrgLabel("ServiceChannel")
	@SchemaOrgComment(""
			+ "A means for accessing a service, e.g. a government office location, web site, or"
			+ " phone number.")
	@CamelizedName("serviceChannel")
	@ConstantizedName("SERVICE_CHANNEL")
	public interface ServiceChannel extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableLanguage
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * uri: http://schema.org/processingTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProcessingTime
		 */
		public Container.ProcessingTime getProcessingTime();
		public void setProcessingTime(Container.ProcessingTime processingTime);

		/**
		 * uri: http://schema.org/providesService
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProvidesService
		 */
		public Container.ProvidesService getProvidesService();
		public void setProvidesService(Container.ProvidesService providesService);

		/**
		 * uri: http://schema.org/serviceLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceLocation
		 */
		public Container.ServiceLocation getServiceLocation();
		public void setServiceLocation(Container.ServiceLocation serviceLocation);

		/**
		 * uri: http://schema.org/servicePhone
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServicePhone
		 */
		public Container.ServicePhone getServicePhone();
		public void setServicePhone(Container.ServicePhone servicePhone);

		/**
		 * uri: http://schema.org/servicePostalAddress
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServicePostalAddress
		 */
		public Container.ServicePostalAddress getServicePostalAddress();
		public void setServicePostalAddress(Container.ServicePostalAddress servicePostalAddress);

		/**
		 * uri: http://schema.org/serviceSmsNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceSmsNumber
		 */
		public Container.ServiceSmsNumber getServiceSmsNumber();
		public void setServiceSmsNumber(Container.ServiceSmsNumber serviceSmsNumber);

		/**
		 * uri: http://schema.org/serviceUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ServiceUrl
		 */
		public Container.ServiceUrl getServiceUrl();
		public void setServiceUrl(Container.ServiceUrl serviceUrl);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ShareAction")
	@SchemaOrgLabel("ShareAction")
	@SchemaOrgComment(""
			+ "The act of distributing content to people for their amusement or edification.")
	@CamelizedName("shareAction")
	@ConstantizedName("SHARE_ACTION")
	public interface ShareAction extends CommunicateAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ShoeStore")
	@SchemaOrgLabel("ShoeStore")
	@SchemaOrgComment("A shoe store.")
	@CamelizedName("shoeStore")
	@ConstantizedName("SHOE_STORE")
	public interface ShoeStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ShoppingCenter")
	@SchemaOrgLabel("ShoppingCenter")
	@SchemaOrgComment("A shopping center or mall.")
	@CamelizedName("shoppingCenter")
	@ConstantizedName("SHOPPING_CENTER")
	public interface ShoppingCenter extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SingleFamilyResidence")
	@SchemaOrgLabel("SingleFamilyResidence")
	@SchemaOrgComment("Residence type: Single-family home.")
	@CamelizedName("singleFamilyResidence")
	@ConstantizedName("SINGLE_FAMILY_RESIDENCE")
	public interface SingleFamilyResidence extends House, SchemaOrgClass {

		/**
		 * uri: http://schema.org/numberOfRooms
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfRooms
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * uri: http://schema.org/occupancy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Occupancy
		 */
		public Container.Occupancy getOccupancy();
		public void setOccupancy(Container.Occupancy occupancy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SiteNavigationElement")
	@SchemaOrgLabel("SiteNavigationElement")
	@SchemaOrgComment("A navigation element of the page.")
	@CamelizedName("siteNavigationElement")
	@ConstantizedName("SITE_NAVIGATION_ELEMENT")
	public interface SiteNavigationElement extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SkiResort")
	@SchemaOrgLabel("SkiResort")
	@SchemaOrgComment("A ski resort.")
	@CamelizedName("skiResort")
	@ConstantizedName("SKI_RESORT")
	public interface SkiResort extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SocialEvent")
	@SchemaOrgLabel("SocialEvent")
	@SchemaOrgComment("Event type: Social event.")
	@CamelizedName("socialEvent")
	@ConstantizedName("SOCIAL_EVENT")
	public interface SocialEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SocialMediaPosting")
	@SchemaOrgLabel("SocialMediaPosting")
	@SchemaOrgComment(""
			+ "A post to a social media platform, including blog posts, tweets, Facebook posts,"
			+ " etc.")
	@CamelizedName("socialMediaPosting")
	@ConstantizedName("SOCIAL_MEDIA_POSTING")
	public interface SocialMediaPosting extends Article, SchemaOrgClass {

		/**
		 * uri: http://schema.org/sharedContent
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SharedContent
		 */
		public Container.SharedContent getSharedContent();
		public void setSharedContent(Container.SharedContent sharedContent);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SoftwareApplication")
	@SchemaOrgLabel("SoftwareApplication")
	@SchemaOrgComment("A software application.")
	@CamelizedName("softwareApplication")
	@ConstantizedName("SOFTWARE_APPLICATION")
	public interface SoftwareApplication extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/applicationCategory
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ApplicationCategory
		 */
		public Container.ApplicationCategory getApplicationCategory();
		public void setApplicationCategory(Container.ApplicationCategory applicationCategory);

		/**
		 * uri: http://schema.org/applicationSubCategory
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ApplicationSubCategory
		 */
		public Container.ApplicationSubCategory getApplicationSubCategory();
		public void setApplicationSubCategory(Container.ApplicationSubCategory applicationSubCategory);

		/**
		 * uri: http://schema.org/applicationSuite
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ApplicationSuite
		 */
		public Container.ApplicationSuite getApplicationSuite();
		public void setApplicationSuite(Container.ApplicationSuite applicationSuite);

		/**
		 * uri: http://schema.org/availableOnDevice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableOnDevice
		 */
		public Container.AvailableOnDevice getAvailableOnDevice();
		public void setAvailableOnDevice(Container.AvailableOnDevice availableOnDevice);

		/**
		 * uri: http://schema.org/countriesNotSupported
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountriesNotSupported
		 */
		public Container.CountriesNotSupported getCountriesNotSupported();
		public void setCountriesNotSupported(Container.CountriesNotSupported countriesNotSupported);

		/**
		 * uri: http://schema.org/countriesSupported
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountriesSupported
		 */
		public Container.CountriesSupported getCountriesSupported();
		public void setCountriesSupported(Container.CountriesSupported countriesSupported);

		/**
		 * uri: http://schema.org/downloadUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DownloadUrl
		 */
		public Container.DownloadUrl getDownloadUrl();
		public void setDownloadUrl(Container.DownloadUrl downloadUrl);

		/**
		 * uri: http://schema.org/featureList
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FeatureList
		 */
		public Container.FeatureList getFeatureList();
		public void setFeatureList(Container.FeatureList featureList);

		/**
		 * uri: http://schema.org/fileSize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FileSize
		 */
		public Container.FileSize getFileSize();
		public void setFileSize(Container.FileSize fileSize);

		/**
		 * uri: http://schema.org/installUrl
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InstallUrl
		 */
		public Container.InstallUrl getInstallUrl();
		public void setInstallUrl(Container.InstallUrl installUrl);

		/**
		 * uri: http://schema.org/memoryRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MemoryRequirements
		 */
		public Container.MemoryRequirements getMemoryRequirements();
		public void setMemoryRequirements(Container.MemoryRequirements memoryRequirements);

		/**
		 * uri: http://schema.org/operatingSystem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.OperatingSystem
		 */
		public Container.OperatingSystem getOperatingSystem();
		public void setOperatingSystem(Container.OperatingSystem operatingSystem);

		/**
		 * uri: http://schema.org/permissions
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Permissions
		 */
		public Container.Permissions getPermissions();
		public void setPermissions(Container.Permissions permissions);

		/**
		 * uri: http://schema.org/processorRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProcessorRequirements
		 */
		public Container.ProcessorRequirements getProcessorRequirements();
		public void setProcessorRequirements(Container.ProcessorRequirements processorRequirements);

		/**
		 * uri: http://schema.org/releaseNotes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReleaseNotes
		 */
		public Container.ReleaseNotes getReleaseNotes();
		public void setReleaseNotes(Container.ReleaseNotes releaseNotes);

		/**
		 * uri: http://schema.org/screenshot
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Screenshot
		 */
		public Container.Screenshot getScreenshot();
		public void setScreenshot(Container.Screenshot screenshot);

		/**
		 * uri: http://schema.org/softwareAddOn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SoftwareAddOn
		 */
		public Container.SoftwareAddOn getSoftwareAddOn();
		public void setSoftwareAddOn(Container.SoftwareAddOn softwareAddOn);

		/**
		 * uri: http://schema.org/softwareHelp
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SoftwareHelp
		 */
		public Container.SoftwareHelp getSoftwareHelp();
		public void setSoftwareHelp(Container.SoftwareHelp softwareHelp);

		/**
		 * uri: http://schema.org/softwareRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SoftwareRequirements
		 */
		public Container.SoftwareRequirements getSoftwareRequirements();
		public void setSoftwareRequirements(Container.SoftwareRequirements softwareRequirements);

		/**
		 * uri: http://schema.org/softwareVersion
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SoftwareVersion
		 */
		public Container.SoftwareVersion getSoftwareVersion();
		public void setSoftwareVersion(Container.SoftwareVersion softwareVersion);

		/**
		 * uri: http://schema.org/storageRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.StorageRequirements
		 */
		public Container.StorageRequirements getStorageRequirements();
		public void setStorageRequirements(Container.StorageRequirements storageRequirements);

		/**
		 * uri: http://schema.org/supportingData
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SupportingData
		 */
		public Container.SupportingData getSupportingData();
		public void setSupportingData(Container.SupportingData supportingData);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SoftwareSourceCode")
	@SchemaOrgLabel("SoftwareSourceCode")
	@SchemaOrgComment(""
			+ "Computer programming source code. Example: Full (compile ready) solutions, code"
			+ " snippet samples, scripts, templates.")
	@CamelizedName("softwareSourceCode")
	@ConstantizedName("SOFTWARE_SOURCE_CODE")
	public interface SoftwareSourceCode extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/codeRepository
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CodeRepository
		 */
		public Container.CodeRepository getCodeRepository();
		public void setCodeRepository(Container.CodeRepository codeRepository);

		/**
		 * uri: http://schema.org/codeSampleType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CodeSampleType
		 */
		public Container.CodeSampleType getCodeSampleType();
		public void setCodeSampleType(Container.CodeSampleType codeSampleType);

		/**
		 * uri: http://schema.org/programmingLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProgrammingLanguage
		 */
		public Container.ProgrammingLanguage getProgrammingLanguage();
		public void setProgrammingLanguage(Container.ProgrammingLanguage programmingLanguage);

		/**
		 * uri: http://schema.org/runtimePlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RuntimePlatform
		 */
		public Container.RuntimePlatform getRuntimePlatform();
		public void setRuntimePlatform(Container.RuntimePlatform runtimePlatform);

		/**
		 * uri: http://schema.org/targetProduct
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetProduct
		 */
		public Container.TargetProduct getTargetProduct();
		public void setTargetProduct(Container.TargetProduct targetProduct);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SomeProducts")
	@SchemaOrgLabel("SomeProducts")
	@SchemaOrgComment(""
			+ "A placeholder for multiple similar products of the same kind.")
	@CamelizedName("someProducts")
	@ConstantizedName("SOME_PRODUCTS")
	public interface SomeProducts extends Product, SchemaOrgClass {

		/**
		 * uri: http://schema.org/inventoryLevel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InventoryLevel
		 */
		public Container.InventoryLevel getInventoryLevel();
		public void setInventoryLevel(Container.InventoryLevel inventoryLevel);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Specialty")
	@SchemaOrgLabel("Specialty")
	@SchemaOrgComment(""
			+ "Any branch of a field in which people typically develop specific expertise,"
			+ " usually after significant study, time, and effort.")
	@CamelizedName("specialty")
	@ConstantizedName("SPECIALTY")
	public interface Specialty extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportingGoodsStore")
	@SchemaOrgLabel("SportingGoodsStore")
	@SchemaOrgComment("A sporting goods store.")
	@CamelizedName("sportingGoodsStore")
	@ConstantizedName("SPORTING_GOODS_STORE")
	public interface SportingGoodsStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportsActivityLocation")
	@SchemaOrgLabel("SportsActivityLocation")
	@SchemaOrgComment(""
			+ "A sports location, such as a playing field.")
	@CamelizedName("sportsActivityLocation")
	@ConstantizedName("SPORTS_ACTIVITY_LOCATION")
	public interface SportsActivityLocation extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportsClub")
	@SchemaOrgLabel("SportsClub")
	@SchemaOrgComment("A sports club.")
	@CamelizedName("sportsClub")
	@ConstantizedName("SPORTS_CLUB")
	public interface SportsClub extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportsEvent")
	@SchemaOrgLabel("SportsEvent")
	@SchemaOrgComment("Event type: Sports event.")
	@CamelizedName("sportsEvent")
	@ConstantizedName("SPORTS_EVENT")
	public interface SportsEvent extends Event, SchemaOrgClass {

		/**
		 * uri: http://schema.org/awayTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AwayTeam
		 */
		public Container.AwayTeam getAwayTeam();
		public void setAwayTeam(Container.AwayTeam awayTeam);

		/**
		 * uri: http://schema.org/competitor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Competitor
		 */
		public Container.Competitor getCompetitor();
		public void setCompetitor(Container.Competitor competitor);

		/**
		 * uri: http://schema.org/homeTeam
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.HomeTeam
		 */
		public Container.HomeTeam getHomeTeam();
		public void setHomeTeam(Container.HomeTeam homeTeam);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportsOrganization")
	@SchemaOrgLabel("SportsOrganization")
	@SchemaOrgComment(""
			+ "Represents the collection of all sports organizations, including sports teams,"
			+ " governing bodies, and sports associations.")
	@CamelizedName("sportsOrganization")
	@ConstantizedName("SPORTS_ORGANIZATION")
	public interface SportsOrganization extends Organization, SchemaOrgClass {

		/**
		 * uri: http://schema.org/sport
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Sport
		 */
		public Container.Sport getSport();
		public void setSport(Container.Sport sport);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SportsTeam")
	@SchemaOrgLabel("SportsTeam")
	@SchemaOrgComment("Organization: Sports team.")
	@CamelizedName("sportsTeam")
	@ConstantizedName("SPORTS_TEAM")
	public interface SportsTeam extends SchemaOrgClass, SportsOrganization {

		/**
		 * uri: http://schema.org/athlete
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Athlete
		 */
		public Container.Athlete getAthlete();
		public void setAthlete(Container.Athlete athlete);

		/**
		 * uri: http://schema.org/coach
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Coach
		 */
		public Container.Coach getCoach();
		public void setCoach(Container.Coach coach);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SpreadsheetDigitalDocument")
	@SchemaOrgLabel("SpreadsheetDigitalDocument")
	@SchemaOrgComment("A spreadsheet file.")
	@CamelizedName("spreadsheetDigitalDocument")
	@ConstantizedName("SPREADSHEET_DIGITAL_DOCUMENT")
	public interface SpreadsheetDigitalDocument extends DigitalDocument, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/StadiumOrArena")
	@SchemaOrgLabel("StadiumOrArena")
	@SchemaOrgComment("A stadium.")
	@CamelizedName("stadiumOrArena")
	@ConstantizedName("STADIUM_OR_ARENA")
	public interface StadiumOrArena extends CivicStructure, SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/State")
	@SchemaOrgLabel("State")
	@SchemaOrgComment("A state or province of a country.")
	@CamelizedName("state")
	@ConstantizedName("STATE")
	public interface State extends AdministrativeArea, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SteeringPositionValue")
	@SchemaOrgLabel("SteeringPositionValue")
	@SchemaOrgComment("A value indicating a steering position.")
	@CamelizedName("steeringPositionValue")
	@ConstantizedName("STEERING_POSITION_VALUE")
	public interface SteeringPositionValue extends QualitativeValue, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Store")
	@SchemaOrgLabel("Store")
	@SchemaOrgComment("A retail good store.")
	@CamelizedName("store")
	@ConstantizedName("STORE")
	public interface Store extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/StructuredValue")
	@SchemaOrgLabel("StructuredValue")
	@SchemaOrgComment(""
			+ "Structured values are used when the value of a property has a more complex"
			+ " structure than simply being a textual value or a reference to another thing.")
	@CamelizedName("structuredValue")
	@ConstantizedName("STRUCTURED_VALUE")
	public interface StructuredValue extends Intangible, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SubscribeAction")
	@SchemaOrgLabel("SubscribeAction")
	@SchemaOrgComment(""
			+ "<p>The act of forming a personal connection with someone/something (object)"
			+ " unidirectionally/asymmetrically to get updates pushed to.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FollowAction\">FollowAction</a>: Unlike FollowAction,"
			+ " SubscribeAction implies that the subscriber acts as a passive agent being"
			+ " constantly/actively pushed for updates.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: Unlike"
			+ " RegisterAction, SubscribeAction implies that the agent is interested in"
			+ " continuing receiving updates from the object.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/JoinAction\">JoinAction</a>: Unlike JoinAction,"
			+ " SubscribeAction implies that the agent is interested in continuing receiving"
			+ " updates from the object.</li>\n</ul>\n")
	@CamelizedName("subscribeAction")
	@ConstantizedName("SUBSCRIBE_ACTION")
	public interface SubscribeAction extends InteractAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SubwayStation")
	@SchemaOrgLabel("SubwayStation")
	@SchemaOrgComment("A subway station.")
	@CamelizedName("subwayStation")
	@ConstantizedName("SUBWAY_STATION")
	public interface SubwayStation extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Suite")
	@SchemaOrgLabel("Suite")
	@SchemaOrgComment(""
			+ "A suite in a hotel or other public accommodation, denotes a class of luxury"
			+ " accommodations, the key feature of which is multiple rooms (Source: Wikipedia,"
			+ " the free encyclopedia, see <a"
			+ " href=\"http://en.wikipedia.org/wiki/Suite_(hotel)\">http://en.wikipedia.org/wiki/Suite_(hotel)</a>).\n<br"
			+ " /><br />\nSee also the <a href=\"/docs/hotels.html\">dedicated document on the"
			+ " use of schema.org for marking up hotels and other forms of accommodations</a>.")
	@CamelizedName("suite")
	@ConstantizedName("SUITE")
	public interface Suite extends Accommodation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/bed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Bed
		 */
		public Container.Bed getBed();
		public void setBed(Container.Bed bed);

		/**
		 * uri: http://schema.org/numberOfRooms
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfRooms
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * uri: http://schema.org/occupancy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Occupancy
		 */
		public Container.Occupancy getOccupancy();
		public void setOccupancy(Container.Occupancy occupancy);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SuspendAction")
	@SchemaOrgLabel("SuspendAction")
	@SchemaOrgComment(""
			+ "The act of momentarily pausing a device or application (e.g. pause music"
			+ " playback or pause a timer).")
	@CamelizedName("suspendAction")
	@ConstantizedName("SUSPEND_ACTION")
	public interface SuspendAction extends ControlAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Synagogue")
	@SchemaOrgLabel("Synagogue")
	@SchemaOrgComment("A synagogue.")
	@CamelizedName("synagogue")
	@ConstantizedName("SYNAGOGUE")
	public interface Synagogue extends PlaceOfWorship, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TVClip")
	@SchemaOrgLabel("TVClip")
	@SchemaOrgComment(""
			+ "A short TV program or a segment/part of a TV program.")
	@CamelizedName("tvClip")
	@ConstantizedName("TV_CLIP")
	public interface TVClip extends Clip, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TVEpisode")
	@SchemaOrgLabel("TVEpisode")
	@SchemaOrgComment(""
			+ "A TV episode which can be part of a series or season.")
	@CamelizedName("tvEpisode")
	@ConstantizedName("TV_EPISODE")
	public interface TVEpisode extends Episode, SchemaOrgClass {

		/**
		 * uri: http://schema.org/countryOfOrigin
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountryOfOrigin
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * uri: http://schema.org/subtitleLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SubtitleLanguage
		 */
		public Container.SubtitleLanguage getSubtitleLanguage();
		public void setSubtitleLanguage(Container.SubtitleLanguage subtitleLanguage);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TVSeason")
	@SchemaOrgLabel("TVSeason")
	@SchemaOrgComment(""
			+ "Season dedicated to TV broadcast and associated online delivery.")
	@CamelizedName("tvSeason")
	@ConstantizedName("TV_SEASON")
	public interface TVSeason extends CreativeWork, CreativeWorkSeason, SchemaOrgClass {

		/**
		 * uri: http://schema.org/countryOfOrigin
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountryOfOrigin
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TVSeries")
	@SchemaOrgLabel("TVSeries")
	@SchemaOrgComment(""
			+ "CreativeWorkSeries dedicated to TV broadcast and associated online delivery.")
	@CamelizedName("tvSeries")
	@ConstantizedName("TV_SERIES")
	public interface TVSeries extends CreativeWork, CreativeWorkSeries, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/containsSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContainsSeason
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * uri: http://schema.org/countryOfOrigin
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CountryOfOrigin
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Episode
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/numberOfEpisodes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEpisodes
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * uri: http://schema.org/numberOfSeasons
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfSeasons
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Table")
	@SchemaOrgLabel("Table")
	@SchemaOrgComment("A table on a Web page.")
	@CamelizedName("table")
	@ConstantizedName("TABLE")
	public interface Table extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TakeAction")
	@SchemaOrgLabel("TakeAction")
	@SchemaOrgComment(""
			+ "<p>The act of gaining ownership of an object from an origin. Reciprocal of"
			+ " GiveAction.</p>\n\n<p>Related actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/GiveAction\">GiveAction</a>: The reciprocal of"
			+ " TakeAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ReceiveAction\">ReceiveAction</a>: Unlike"
			+ " ReceiveAction, TakeAction implies that ownership has been"
			+ " transfered.</li>\n</ul>\n")
	@CamelizedName("takeAction")
	@ConstantizedName("TAKE_ACTION")
	public interface TakeAction extends SchemaOrgClass, TransferAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TattooParlor")
	@SchemaOrgLabel("TattooParlor")
	@SchemaOrgComment("A tattoo parlor.")
	@CamelizedName("tattooParlor")
	@ConstantizedName("TATTOO_PARLOR")
	public interface TattooParlor extends HealthAndBeautyBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TaxiReservation")
	@SchemaOrgLabel("TaxiReservation")
	@SchemaOrgComment(""
			+ "A reservation for a taxi.</p>\n\n<p>Note: This type is for information about"
			+ " actual reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("taxiReservation")
	@ConstantizedName("TAXI_RESERVATION")
	public interface TaxiReservation extends Reservation, SchemaOrgClass {

		/**
		 * uri: http://schema.org/partySize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PartySize
		 */
		public Container.PartySize getPartySize();
		public void setPartySize(Container.PartySize partySize);

		/**
		 * uri: http://schema.org/pickupLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PickupLocation
		 */
		public Container.PickupLocation getPickupLocation();
		public void setPickupLocation(Container.PickupLocation pickupLocation);

		/**
		 * uri: http://schema.org/pickupTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PickupTime
		 */
		public Container.PickupTime getPickupTime();
		public void setPickupTime(Container.PickupTime pickupTime);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TaxiService")
	@SchemaOrgLabel("TaxiService")
	@SchemaOrgComment(""
			+ "A service for a vehicle for hire with a driver for local travel. Fares are"
			+ " usually calculated based on distance traveled.")
	@CamelizedName("taxiService")
	@ConstantizedName("TAXI_SERVICE")
	public interface TaxiService extends SchemaOrgClass, Service {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TaxiStand")
	@SchemaOrgLabel("TaxiStand")
	@SchemaOrgComment("A taxi stand.")
	@CamelizedName("taxiStand")
	@ConstantizedName("TAXI_STAND")
	public interface TaxiStand extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TechArticle")
	@SchemaOrgLabel("TechArticle")
	@SchemaOrgComment(""
			+ "A technical article - Example: How-to (task) topics, step-by-step, procedural"
			+ " troubleshooting, specifications, etc.")
	@CamelizedName("techArticle")
	@ConstantizedName("TECH_ARTICLE")
	public interface TechArticle extends Article, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dependencies
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Dependencies
		 */
		public Container.Dependencies getDependencies();
		public void setDependencies(Container.Dependencies dependencies);

		/**
		 * uri: http://schema.org/proficiencyLevel
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProficiencyLevel
		 */
		public Container.ProficiencyLevel getProficiencyLevel();
		public void setProficiencyLevel(Container.ProficiencyLevel proficiencyLevel);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TelevisionChannel")
	@SchemaOrgLabel("TelevisionChannel")
	@SchemaOrgComment(""
			+ "A unique instance of a television BroadcastService on a CableOrSatelliteService"
			+ " lineup.")
	@CamelizedName("televisionChannel")
	@ConstantizedName("TELEVISION_CHANNEL")
	public interface TelevisionChannel extends BroadcastChannel, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TelevisionStation")
	@SchemaOrgLabel("TelevisionStation")
	@SchemaOrgComment("A television station.")
	@CamelizedName("televisionStation")
	@ConstantizedName("TELEVISION_STATION")
	public interface TelevisionStation extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TennisComplex")
	@SchemaOrgLabel("TennisComplex")
	@SchemaOrgComment("A tennis complex.")
	@CamelizedName("tennisComplex")
	@ConstantizedName("TENNIS_COMPLEX")
	public interface TennisComplex extends SchemaOrgClass, SportsActivityLocation {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TextDigitalDocument")
	@SchemaOrgLabel("TextDigitalDocument")
	@SchemaOrgComment("A file composed primarily of text.")
	@CamelizedName("textDigitalDocument")
	@ConstantizedName("TEXT_DIGITAL_DOCUMENT")
	public interface TextDigitalDocument extends DigitalDocument, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TheaterEvent")
	@SchemaOrgLabel("TheaterEvent")
	@SchemaOrgComment("Event type: Theater performance.")
	@CamelizedName("theaterEvent")
	@ConstantizedName("THEATER_EVENT")
	public interface TheaterEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TheaterGroup")
	@SchemaOrgLabel("TheaterGroup")
	@SchemaOrgComment(""
			+ "A theater group or company, for example, the Royal Shakespeare Company or Druid"
			+ " Theatre.")
	@CamelizedName("theaterGroup")
	@ConstantizedName("THEATER_GROUP")
	public interface TheaterGroup extends PerformingGroup, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Thing")
	@SchemaOrgLabel("Thing")
	@SchemaOrgComment("The most generic type of item.")
	@CamelizedName("thing")
	@ConstantizedName("THING")
	public interface Thing extends SchemaOrgClass {

		/**
		 * uri: http://schema.org/additionalType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType
		 */
		public Container.AdditionalType getAdditionalType();
		public void setAdditionalType(Container.AdditionalType additionalType);

		/**
		 * uri: http://schema.org/alternateName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AlternateName
		 */
		public Container.AlternateName getAlternateName();
		public void setAlternateName(Container.AlternateName alternateName);

		/**
		 * uri: http://schema.org/description
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Description
		 */
		public Container.Description getDescription();
		public void setDescription(Container.Description description);

		/**
		 * uri: http://schema.org/disambiguatingDescription
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription
		 */
		public Container.DisambiguatingDescription getDisambiguatingDescription();
		public void setDisambiguatingDescription(Container.DisambiguatingDescription disambiguatingDescription);

		/**
		 * uri: http://schema.org/identifier
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Identifier
		 */
		public Container.Identifier getIdentifier();
		public void setIdentifier(Container.Identifier identifier);

		/**
		 * uri: http://schema.org/image
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Image
		 */
		public Container.Image getImage();
		public void setImage(Container.Image image);

		/**
		 * uri: http://schema.org/mainEntityOfPage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage
		 */
		public Container.MainEntityOfPage getMainEntityOfPage();
		public void setMainEntityOfPage(Container.MainEntityOfPage mainEntityOfPage);

		/**
		 * uri: http://schema.org/name
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Name
		 */
		public Container.Name getName();
		public void setName(Container.Name name);

		/**
		 * uri: http://kyojo.org/schemaSpl/nameFuzzy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy
		 */
		public Container.NameFuzzy getNameFuzzy();
		public void setNameFuzzy(Container.NameFuzzy nameFuzzy);

		/**
		 * uri: http://kyojo.org/schemaSpl/nameRuby
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NameRuby
		 */
		public Container.NameRuby getNameRuby();
		public void setNameRuby(Container.NameRuby nameRuby);

		/**
		 * uri: http://schema.org/potentialAction
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction
		 */
		public Container.PotentialAction getPotentialAction();
		public void setPotentialAction(Container.PotentialAction potentialAction);

		/**
		 * uri: http://schema.org/sameAs
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SameAs
		 */
		public Container.SameAs getSameAs();
		public void setSameAs(Container.SameAs sameAs);

		/**
		 * uri: http://schema.org/url
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Url
		 */
		public Container.Url getUrl();
		public void setUrl(Container.Url url);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Ticket")
	@SchemaOrgLabel("Ticket")
	@SchemaOrgComment(""
			+ "Used to describe a ticket to an event, a flight, a bus ride, etc.")
	@CamelizedName("ticket")
	@ConstantizedName("TICKET")
	public interface Ticket extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/dateIssued
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateIssued
		 */
		public Container.DateIssued getDateIssued();
		public void setDateIssued(Container.DateIssued dateIssued);

		/**
		 * uri: http://schema.org/issuedBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.IssuedBy
		 */
		public Container.IssuedBy getIssuedBy();
		public void setIssuedBy(Container.IssuedBy issuedBy);

		/**
		 * uri: http://schema.org/priceCurrency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * uri: http://schema.org/ticketNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TicketNumber
		 */
		public Container.TicketNumber getTicketNumber();
		public void setTicketNumber(Container.TicketNumber ticketNumber);

		/**
		 * uri: http://schema.org/ticketToken
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TicketToken
		 */
		public Container.TicketToken getTicketToken();
		public void setTicketToken(Container.TicketToken ticketToken);

		/**
		 * uri: http://schema.org/ticketedSeat
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TicketedSeat
		 */
		public Container.TicketedSeat getTicketedSeat();
		public void setTicketedSeat(Container.TicketedSeat ticketedSeat);

		/**
		 * uri: http://schema.org/totalPrice
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TotalPrice
		 */
		public Container.TotalPrice getTotalPrice();
		public void setTotalPrice(Container.TotalPrice totalPrice);

		/**
		 * uri: http://schema.org/underName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnderName
		 */
		public Container.UnderName getUnderName();
		public void setUnderName(Container.UnderName underName);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TieAction")
	@SchemaOrgLabel("TieAction")
	@SchemaOrgComment(""
			+ "The act of reaching a draw in a competitive activity.")
	@CamelizedName("tieAction")
	@ConstantizedName("TIE_ACTION")
	public interface TieAction extends AchieveAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TipAction")
	@SchemaOrgLabel("TipAction")
	@SchemaOrgComment(""
			+ "The act of giving money voluntarily to a beneficiary in recognition of services"
			+ " rendered.")
	@CamelizedName("tipAction")
	@ConstantizedName("TIP_ACTION")
	public interface TipAction extends SchemaOrgClass, TradeAction {

		/**
		 * uri: http://schema.org/recipient
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Recipient
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TireShop")
	@SchemaOrgLabel("TireShop")
	@SchemaOrgComment("A tire shop.")
	@CamelizedName("tireShop")
	@ConstantizedName("TIRE_SHOP")
	public interface TireShop extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TouristAttraction")
	@SchemaOrgLabel("TouristAttraction")
	@SchemaOrgComment(""
			+ "A tourist attraction.  In principle any Thing can be a <a class=\"localLink\""
			+ " href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, from a <a"
			+ " class=\"localLink\" href=\"http://schema.org/Mountain\">Mountain</a> and <a"
			+ " class=\"localLink\""
			+ " href=\"http://schema.org/LandmarksOrHistoricalBuildings\">LandmarksOrHistoricalBuildings</a>"
			+ " to a <a class=\"localLink\""
			+ " href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>.  This Type can be"
			+ " used on its own to describe a general <a class=\"localLink\""
			+ " href=\"http://schema.org/TourstAttraction\">TourstAttraction</a>, or be used as"
			+ " an <a class=\"localLink\""
			+ " href=\"http://schema.org/additionalType\">additionalType</a> to add tourist"
			+ " attraction properties to any other type.  (See examples below)")
	@CamelizedName("touristAttraction")
	@ConstantizedName("TOURIST_ATTRACTION")
	public interface TouristAttraction extends Place, SchemaOrgClass {

		/**
		 * uri: http://schema.org/availableLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AvailableLanguage
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * uri: http://schema.org/touristType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TouristType
		 */
		public Container.TouristType getTouristType();
		public void setTouristType(Container.TouristType touristType);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TouristInformationCenter")
	@SchemaOrgLabel("TouristInformationCenter")
	@SchemaOrgComment("A tourist information center.")
	@CamelizedName("touristInformationCenter")
	@ConstantizedName("TOURIST_INFORMATION_CENTER")
	public interface TouristInformationCenter extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ToyStore")
	@SchemaOrgLabel("ToyStore")
	@SchemaOrgComment("A toy store.")
	@CamelizedName("toyStore")
	@ConstantizedName("TOY_STORE")
	public interface ToyStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TrackAction")
	@SchemaOrgLabel("TrackAction")
	@SchemaOrgComment(""
			+ "<p>An agent tracks an object for updates.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FollowAction\">FollowAction</a>: Unlike FollowAction,"
			+ " TrackAction refers to the interest on the location of innanimates"
			+ " objects.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SubscribeAction\">SubscribeAction</a>: Unlike"
			+ " SubscribeAction, TrackAction refers to  the interest on the location of"
			+ " innanimate objects.</li>\n</ul>\n")
	@CamelizedName("trackAction")
	@ConstantizedName("TRACK_ACTION")
	public interface TrackAction extends FindAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/deliveryMethod
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeliveryMethod
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TradeAction")
	@SchemaOrgLabel("TradeAction")
	@SchemaOrgComment(""
			+ "The act of participating in an exchange of goods and services for monetary"
			+ " compensation. An agent trades an object, product or service with a participant"
			+ " in exchange for a one time or periodic payment.")
	@CamelizedName("tradeAction")
	@ConstantizedName("TRADE_ACTION")
	public interface TradeAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/price
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Price
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * uri: http://schema.org/priceSpecification
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification
		 */
		public Container.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Container.PriceSpecification priceSpecification);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TrainReservation")
	@SchemaOrgLabel("TrainReservation")
	@SchemaOrgComment(""
			+ "A reservation for train travel.</p>\n\n<p>Note: This type is for information"
			+ " about actual reservations, e.g. in confirmation emails or HTML pages with"
			+ " individual confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("trainReservation")
	@ConstantizedName("TRAIN_RESERVATION")
	public interface TrainReservation extends Reservation, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TrainStation")
	@SchemaOrgLabel("TrainStation")
	@SchemaOrgComment("A train station.")
	@CamelizedName("trainStation")
	@ConstantizedName("TRAIN_STATION")
	public interface TrainStation extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TrainTrip")
	@SchemaOrgLabel("TrainTrip")
	@SchemaOrgComment("A trip on a commercial train line.")
	@CamelizedName("trainTrip")
	@ConstantizedName("TRAIN_TRIP")
	public interface TrainTrip extends Intangible, SchemaOrgClass {

		/**
		 * uri: http://schema.org/arrivalPlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalPlatform
		 */
		public Container.ArrivalPlatform getArrivalPlatform();
		public void setArrivalPlatform(Container.ArrivalPlatform arrivalPlatform);

		/**
		 * uri: http://schema.org/arrivalStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalStation
		 */
		public Container.ArrivalStation getArrivalStation();
		public void setArrivalStation(Container.ArrivalStation arrivalStation);

		/**
		 * uri: http://schema.org/arrivalTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArrivalTime
		 */
		public Container.ArrivalTime getArrivalTime();
		public void setArrivalTime(Container.ArrivalTime arrivalTime);

		/**
		 * uri: http://schema.org/departurePlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DeparturePlatform
		 */
		public Container.DeparturePlatform getDeparturePlatform();
		public void setDeparturePlatform(Container.DeparturePlatform departurePlatform);

		/**
		 * uri: http://schema.org/departureStation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureStation
		 */
		public Container.DepartureStation getDepartureStation();
		public void setDepartureStation(Container.DepartureStation departureStation);

		/**
		 * uri: http://schema.org/departureTime
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DepartureTime
		 */
		public Container.DepartureTime getDepartureTime();
		public void setDepartureTime(Container.DepartureTime departureTime);

		/**
		 * uri: http://schema.org/provider
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Provider
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * uri: http://schema.org/trainName
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TrainName
		 */
		public Container.TrainName getTrainName();
		public void setTrainName(Container.TrainName trainName);

		/**
		 * uri: http://schema.org/trainNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TrainNumber
		 */
		public Container.TrainNumber getTrainNumber();
		public void setTrainNumber(Container.TrainNumber trainNumber);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TransferAction")
	@SchemaOrgLabel("TransferAction")
	@SchemaOrgComment(""
			+ "The act of transferring/moving (abstract or concrete) animate or inanimate"
			+ " objects from one place to another.")
	@CamelizedName("transferAction")
	@ConstantizedName("TRANSFER_ACTION")
	public interface TransferAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/fromLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FromLocation
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * uri: http://schema.org/toLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ToLocation
		 */
		public Container.ToLocation getToLocation();
		public void setToLocation(Container.ToLocation toLocation);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TravelAction")
	@SchemaOrgLabel("TravelAction")
	@SchemaOrgComment(""
			+ "The act of traveling from an fromLocation to a destination by a specified mode"
			+ " of transport, optionally with participants.")
	@CamelizedName("travelAction")
	@ConstantizedName("TRAVEL_ACTION")
	public interface TravelAction extends MoveAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/distance
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Distance
		 */
		public Container.Distance getDistance();
		public void setDistance(Container.Distance distance);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TravelAgency")
	@SchemaOrgLabel("TravelAgency")
	@SchemaOrgComment("A travel agency.")
	@CamelizedName("travelAgency")
	@ConstantizedName("TRAVEL_AGENCY")
	public interface TravelAgency extends LocalBusiness, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/TypeAndQuantityNode")
	@SchemaOrgLabel("TypeAndQuantityNode")
	@SchemaOrgComment(""
			+ "A structured value indicating the quantity, unit of measurement, and business"
			+ " function of goods included in a bundle offer.")
	@CamelizedName("typeAndQuantityNode")
	@ConstantizedName("TYPE_AND_QUANTITY_NODE")
	public interface TypeAndQuantityNode extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/amountOfThisGood
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.AmountOfThisGood
		 */
		public Container.AmountOfThisGood getAmountOfThisGood();
		public void setAmountOfThisGood(Container.AmountOfThisGood amountOfThisGood);

		/**
		 * uri: http://schema.org/businessFunction
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BusinessFunction
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * uri: http://schema.org/typeOfGood
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TypeOfGood
		 */
		public Container.TypeOfGood getTypeOfGood();
		public void setTypeOfGood(Container.TypeOfGood typeOfGood);

		/**
		 * uri: http://schema.org/unitCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitCode
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * uri: http://schema.org/unitText
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitText
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/URL")
	@SchemaOrgLabel("URL")
	@SchemaOrgComment("Data type: URL.")
	@CamelizedName("url")
	@ConstantizedName("URL")
	public interface URL extends SchemaOrgClass, Text {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UnRegisterAction")
	@SchemaOrgLabel("UnRegisterAction")
	@SchemaOrgComment(""
			+ "<p>The act of un-registering from a service.</p>\n\n<p>Related"
			+ " actions:</p>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: antonym of"
			+ " UnRegisterAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/Leave\">Leave</a>: Unlike LeaveAction,"
			+ " UnRegisterAction implies that you are unregistering from a service you werer"
			+ " previously registered, rather than leaving a team/group of"
			+ " people.</li>\n</ul>\n")
	@CamelizedName("unRegisterAction")
	@ConstantizedName("UN_REGISTER_ACTION")
	public interface UnRegisterAction extends InteractAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UnitPriceSpecification")
	@SchemaOrgLabel("UnitPriceSpecification")
	@SchemaOrgComment(""
			+ "The price asked for a given offer by the respective organization or person.")
	@CamelizedName("unitPriceSpecification")
	@ConstantizedName("UNIT_PRICE_SPECIFICATION")
	public interface UnitPriceSpecification extends PriceSpecification, SchemaOrgClass {

		/**
		 * uri: http://schema.org/billingIncrement
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BillingIncrement
		 */
		public Container.BillingIncrement getBillingIncrement();
		public void setBillingIncrement(Container.BillingIncrement billingIncrement);

		/**
		 * uri: http://schema.org/priceType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PriceType
		 */
		public Container.PriceType getPriceType();
		public void setPriceType(Container.PriceType priceType);

		/**
		 * uri: http://schema.org/referenceQuantity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReferenceQuantity
		 */
		public Container.ReferenceQuantity getReferenceQuantity();
		public void setReferenceQuantity(Container.ReferenceQuantity referenceQuantity);

		/**
		 * uri: http://schema.org/unitCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitCode
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * uri: http://schema.org/unitText
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.UnitText
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UpdateAction")
	@SchemaOrgLabel("UpdateAction")
	@SchemaOrgComment(""
			+ "The act of managing by changing/editing the state of the object.")
	@CamelizedName("updateAction")
	@ConstantizedName("UPDATE_ACTION")
	public interface UpdateAction extends Action, SchemaOrgClass {

		/**
		 * uri: http://schema.org/targetCollection
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.TargetCollection
		 */
		public Container.TargetCollection getTargetCollection();
		public void setTargetCollection(Container.TargetCollection targetCollection);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/UseAction")
	@SchemaOrgLabel("UseAction")
	@SchemaOrgComment(""
			+ "The act of applying an object to its intended purpose.")
	@CamelizedName("useAction")
	@ConstantizedName("USE_ACTION")
	public interface UseAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Vehicle")
	@SchemaOrgLabel("Vehicle")
	@SchemaOrgComment(""
			+ "A vehicle is a device that is designed or used to transport people or cargo over"
			+ " land, water, air, or through space.")
	@CamelizedName("vehicle")
	@ConstantizedName("VEHICLE")
	public interface Vehicle extends Product, SchemaOrgClass {

		/**
		 * uri: http://schema.org/accelerationTime
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.AccelerationTime
		 */
		public AccelerationTime getAccelerationTime();
		public void setAccelerationTime(AccelerationTime accelerationTime);

		/**
		 * uri: http://schema.org/bodyType
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.BodyType
		 */
		public BodyType getBodyType();
		public void setBodyType(BodyType bodyType);

		/**
		 * uri: http://schema.org/cargoVolume
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CargoVolume
		 */
		public Container.CargoVolume getCargoVolume();
		public void setCargoVolume(Container.CargoVolume cargoVolume);

		/**
		 * uri: http://schema.org/dateVehicleFirstRegistered
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DateVehicleFirstRegistered
		 */
		public Container.DateVehicleFirstRegistered getDateVehicleFirstRegistered();
		public void setDateVehicleFirstRegistered(Container.DateVehicleFirstRegistered dateVehicleFirstRegistered);

		/**
		 * uri: http://schema.org/driveWheelConfiguration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DriveWheelConfiguration
		 */
		public Container.DriveWheelConfiguration getDriveWheelConfiguration();
		public void setDriveWheelConfiguration(Container.DriveWheelConfiguration driveWheelConfiguration);

		/**
		 * uri: http://schema.org/emissionsCO2
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.EmissionsCO2
		 */
		public EmissionsCO2 getEmissionsCO2();
		public void setEmissionsCO2(EmissionsCO2 emissionsCO2);

		/**
		 * uri: http://schema.org/fuelCapacity
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.FuelCapacity
		 */
		public FuelCapacity getFuelCapacity();
		public void setFuelCapacity(FuelCapacity fuelCapacity);

		/**
		 * uri: http://schema.org/fuelConsumption
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FuelConsumption
		 */
		public Container.FuelConsumption getFuelConsumption();
		public void setFuelConsumption(Container.FuelConsumption fuelConsumption);

		/**
		 * uri: http://schema.org/fuelEfficiency
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FuelEfficiency
		 */
		public Container.FuelEfficiency getFuelEfficiency();
		public void setFuelEfficiency(Container.FuelEfficiency fuelEfficiency);

		/**
		 * uri: http://schema.org/fuelType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.FuelType
		 */
		public Container.FuelType getFuelType();
		public void setFuelType(Container.FuelType fuelType);

		/**
		 * uri: http://schema.org/knownVehicleDamages
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.KnownVehicleDamages
		 */
		public Container.KnownVehicleDamages getKnownVehicleDamages();
		public void setKnownVehicleDamages(Container.KnownVehicleDamages knownVehicleDamages);

		/**
		 * uri: http://schema.org/meetsEmissionStandard
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.MeetsEmissionStandard
		 */
		public MeetsEmissionStandard getMeetsEmissionStandard();
		public void setMeetsEmissionStandard(MeetsEmissionStandard meetsEmissionStandard);

		/**
		 * uri: http://schema.org/mileageFromOdometer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MileageFromOdometer
		 */
		public Container.MileageFromOdometer getMileageFromOdometer();
		public void setMileageFromOdometer(Container.MileageFromOdometer mileageFromOdometer);

		/**
		 * uri: http://schema.org/modelDate
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.ModelDate
		 */
		public ModelDate getModelDate();
		public void setModelDate(ModelDate modelDate);

		/**
		 * uri: http://schema.org/numberOfAirbags
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAirbags
		 */
		public Container.NumberOfAirbags getNumberOfAirbags();
		public void setNumberOfAirbags(Container.NumberOfAirbags numberOfAirbags);

		/**
		 * uri: http://schema.org/numberOfAxles
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAxles
		 */
		public Container.NumberOfAxles getNumberOfAxles();
		public void setNumberOfAxles(Container.NumberOfAxles numberOfAxles);

		/**
		 * uri: http://schema.org/numberOfDoors
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfDoors
		 */
		public Container.NumberOfDoors getNumberOfDoors();
		public void setNumberOfDoors(Container.NumberOfDoors numberOfDoors);

		/**
		 * uri: http://schema.org/numberOfForwardGears
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfForwardGears
		 */
		public Container.NumberOfForwardGears getNumberOfForwardGears();
		public void setNumberOfForwardGears(Container.NumberOfForwardGears numberOfForwardGears);

		/**
		 * uri: http://schema.org/numberOfPreviousOwners
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPreviousOwners
		 */
		public Container.NumberOfPreviousOwners getNumberOfPreviousOwners();
		public void setNumberOfPreviousOwners(Container.NumberOfPreviousOwners numberOfPreviousOwners);

		/**
		 * uri: http://schema.org/payload
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.Payload
		 */
		public Payload getPayload();
		public void setPayload(Payload payload);

		/**
		 * uri: http://schema.org/productionDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionDate
		 */
		public Container.ProductionDate getProductionDate();
		public void setProductionDate(Container.ProductionDate productionDate);

		/**
		 * uri: http://schema.org/purchaseDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PurchaseDate
		 */
		public Container.PurchaseDate getPurchaseDate();
		public void setPurchaseDate(Container.PurchaseDate purchaseDate);

		/**
		 * uri: http://schema.org/seatingCapacity
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.SeatingCapacity
		 */
		public SeatingCapacity getSeatingCapacity();
		public void setSeatingCapacity(SeatingCapacity seatingCapacity);

		/**
		 * uri: http://schema.org/speed
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.Speed
		 */
		public Speed getSpeed();
		public void setSpeed(Speed speed);

		/**
		 * uri: http://schema.org/steeringPosition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SteeringPosition
		 */
		public Container.SteeringPosition getSteeringPosition();
		public void setSteeringPosition(Container.SteeringPosition steeringPosition);

		/**
		 * uri: http://schema.org/tongueWeight
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.TongueWeight
		 */
		public TongueWeight getTongueWeight();
		public void setTongueWeight(TongueWeight tongueWeight);

		/**
		 * uri: http://schema.org/trailerWeight
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.TrailerWeight
		 */
		public TrailerWeight getTrailerWeight();
		public void setTrailerWeight(TrailerWeight trailerWeight);

		/**
		 * uri: http://schema.org/vehicleConfiguration
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleConfiguration
		 */
		public Container.VehicleConfiguration getVehicleConfiguration();
		public void setVehicleConfiguration(Container.VehicleConfiguration vehicleConfiguration);

		/**
		 * uri: http://schema.org/vehicleEngine
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleEngine
		 */
		public Container.VehicleEngine getVehicleEngine();
		public void setVehicleEngine(Container.VehicleEngine vehicleEngine);

		/**
		 * uri: http://schema.org/vehicleIdentificationNumber
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleIdentificationNumber
		 */
		public Container.VehicleIdentificationNumber getVehicleIdentificationNumber();
		public void setVehicleIdentificationNumber(Container.VehicleIdentificationNumber vehicleIdentificationNumber);

		/**
		 * uri: http://schema.org/vehicleInteriorColor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleInteriorColor
		 */
		public Container.VehicleInteriorColor getVehicleInteriorColor();
		public void setVehicleInteriorColor(Container.VehicleInteriorColor vehicleInteriorColor);

		/**
		 * uri: http://schema.org/vehicleInteriorType
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleInteriorType
		 */
		public Container.VehicleInteriorType getVehicleInteriorType();
		public void setVehicleInteriorType(Container.VehicleInteriorType vehicleInteriorType);

		/**
		 * uri: http://schema.org/vehicleModelDate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleModelDate
		 */
		public Container.VehicleModelDate getVehicleModelDate();
		public void setVehicleModelDate(Container.VehicleModelDate vehicleModelDate);

		/**
		 * uri: http://schema.org/vehicleSeatingCapacity
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleSeatingCapacity
		 */
		public Container.VehicleSeatingCapacity getVehicleSeatingCapacity();
		public void setVehicleSeatingCapacity(Container.VehicleSeatingCapacity vehicleSeatingCapacity);

		/**
		 * uri: http://schema.org/vehicleSpecialUsage
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.VehicleSpecialUsage
		 */
		public VehicleSpecialUsage getVehicleSpecialUsage();
		public void setVehicleSpecialUsage(VehicleSpecialUsage vehicleSpecialUsage);

		/**
		 * uri: http://schema.org/vehicleTransmission
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VehicleTransmission
		 */
		public Container.VehicleTransmission getVehicleTransmission();
		public void setVehicleTransmission(Container.VehicleTransmission vehicleTransmission);

		/**
		 * uri: http://schema.org/weightTotal
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.WeightTotal
		 */
		public WeightTotal getWeightTotal();
		public void setWeightTotal(WeightTotal weightTotal);

		/**
		 * uri: http://schema.org/wheelbase
		 * class: org.kyojo.schemaOrg.m3n3.auto.Container.Wheelbase
		 */
		public Wheelbase getWheelbase();
		public void setWheelbase(Wheelbase wheelbase);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VideoGallery")
	@SchemaOrgLabel("VideoGallery")
	@SchemaOrgComment("Web page type: Video gallery page.")
	@CamelizedName("videoGallery")
	@ConstantizedName("VIDEO_GALLERY")
	public interface VideoGallery extends CollectionPage, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VideoGame")
	@SchemaOrgLabel("VideoGame")
	@SchemaOrgComment(""
			+ "A video game is an electronic game that involves human interaction with a user"
			+ " interface to generate visual feedback on a video device.")
	@CamelizedName("videoGame")
	@ConstantizedName("VIDEO_GAME")
	public interface VideoGame extends Game, SchemaOrgClass, SoftwareApplication {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/cheatCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheatCode
		 */
		public Container.CheatCode getCheatCode();
		public void setCheatCode(Container.CheatCode cheatCode);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/gamePlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GamePlatform
		 */
		public Container.GamePlatform getGamePlatform();
		public void setGamePlatform(Container.GamePlatform gamePlatform);

		/**
		 * uri: http://schema.org/gameServer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameServer
		 */
		public Container.GameServer getGameServer();
		public void setGameServer(Container.GameServer gameServer);

		/**
		 * uri: http://schema.org/gameTip
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameTip
		 */
		public Container.GameTip getGameTip();
		public void setGameTip(Container.GameTip gameTip);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/playMode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PlayMode
		 */
		public Container.PlayMode getPlayMode();
		public void setPlayMode(Container.PlayMode playMode);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VideoGameClip")
	@SchemaOrgLabel("VideoGameClip")
	@SchemaOrgComment("A short segment/part of a video game.")
	@CamelizedName("videoGameClip")
	@ConstantizedName("VIDEO_GAME_CLIP")
	public interface VideoGameClip extends Clip, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VideoGameSeries")
	@SchemaOrgLabel("VideoGameSeries")
	@SchemaOrgComment("A video game series.")
	@CamelizedName("videoGameSeries")
	@ConstantizedName("VIDEO_GAME_SERIES")
	public interface VideoGameSeries extends CreativeWorkSeries, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/characterAttribute
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CharacterAttribute
		 */
		public Container.CharacterAttribute getCharacterAttribute();
		public void setCharacterAttribute(Container.CharacterAttribute characterAttribute);

		/**
		 * uri: http://schema.org/cheatCode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.CheatCode
		 */
		public Container.CheatCode getCheatCode();
		public void setCheatCode(Container.CheatCode cheatCode);

		/**
		 * uri: http://schema.org/containsSeason
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ContainsSeason
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/episode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Episode
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * uri: http://schema.org/gameItem
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameItem
		 */
		public Container.GameItem getGameItem();
		public void setGameItem(Container.GameItem gameItem);

		/**
		 * uri: http://schema.org/gameLocation
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GameLocation
		 */
		public Container.GameLocation getGameLocation();
		public void setGameLocation(Container.GameLocation gameLocation);

		/**
		 * uri: http://schema.org/gamePlatform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.GamePlatform
		 */
		public Container.GamePlatform getGamePlatform();
		public void setGamePlatform(Container.GamePlatform gamePlatform);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/numberOfEpisodes
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfEpisodes
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * uri: http://schema.org/numberOfPlayers
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfPlayers
		 */
		public Container.NumberOfPlayers getNumberOfPlayers();
		public void setNumberOfPlayers(Container.NumberOfPlayers numberOfPlayers);

		/**
		 * uri: http://schema.org/numberOfSeasons
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.NumberOfSeasons
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * uri: http://schema.org/playMode
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PlayMode
		 */
		public Container.PlayMode getPlayMode();
		public void setPlayMode(Container.PlayMode playMode);

		/**
		 * uri: http://schema.org/productionCompany
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ProductionCompany
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * uri: http://schema.org/quest
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Quest
		 */
		public Container.Quest getQuest();
		public void setQuest(Container.Quest quest);

		/**
		 * uri: http://schema.org/trailer
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Trailer
		 */
		public Container.Trailer getTrailer();
		public void setTrailer(Container.Trailer trailer);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VideoObject")
	@SchemaOrgLabel("VideoObject")
	@SchemaOrgComment("A video file.")
	@CamelizedName("videoObject")
	@ConstantizedName("VIDEO_OBJECT")
	public interface VideoObject extends MediaObject, SchemaOrgClass {

		/**
		 * uri: http://schema.org/actor
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Actor
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * uri: http://schema.org/caption
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Caption
		 */
		public Container.Caption getCaption();
		public void setCaption(Container.Caption caption);

		/**
		 * uri: http://schema.org/director
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Director
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * uri: http://schema.org/musicBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MusicBy
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * uri: http://schema.org/thumbnail
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Thumbnail
		 */
		public Container.Thumbnail getThumbnail();
		public void setThumbnail(Container.Thumbnail thumbnail);

		/**
		 * uri: http://schema.org/transcript
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Transcript
		 */
		public Container.Transcript getTranscript();
		public void setTranscript(Container.Transcript transcript);

		/**
		 * uri: http://schema.org/videoFrameSize
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VideoFrameSize
		 */
		public Container.VideoFrameSize getVideoFrameSize();
		public void setVideoFrameSize(Container.VideoFrameSize videoFrameSize);

		/**
		 * uri: http://schema.org/videoQuality
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.VideoQuality
		 */
		public Container.VideoQuality getVideoQuality();
		public void setVideoQuality(Container.VideoQuality videoQuality);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/ViewAction")
	@SchemaOrgLabel("ViewAction")
	@SchemaOrgComment(""
			+ "The act of consuming static visual content.")
	@CamelizedName("viewAction")
	@ConstantizedName("VIEW_ACTION")
	public interface ViewAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VisualArtsEvent")
	@SchemaOrgLabel("VisualArtsEvent")
	@SchemaOrgComment("Event type: Visual arts event.")
	@CamelizedName("visualArtsEvent")
	@ConstantizedName("VISUAL_ARTS_EVENT")
	public interface VisualArtsEvent extends Event, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VisualArtwork")
	@SchemaOrgLabel("VisualArtwork")
	@SchemaOrgComment(""
			+ "A work of art that is primarily visual in character.")
	@CamelizedName("visualArtwork")
	@ConstantizedName("VISUAL_ARTWORK")
	public interface VisualArtwork extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/artEdition
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArtEdition
		 */
		public Container.ArtEdition getArtEdition();
		public void setArtEdition(Container.ArtEdition artEdition);

		/**
		 * uri: http://schema.org/artMedium
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArtMedium
		 */
		public Container.ArtMedium getArtMedium();
		public void setArtMedium(Container.ArtMedium artMedium);

		/**
		 * uri: http://schema.org/artform
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Artform
		 */
		public Container.Artform getArtform();
		public void setArtform(Container.Artform artform);

		/**
		 * uri: http://schema.org/artist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Artist
		 */
		public Artist getArtist();
		public void setArtist(Artist artist);

		/**
		 * uri: http://schema.org/artworkSurface
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ArtworkSurface
		 */
		public Container.ArtworkSurface getArtworkSurface();
		public void setArtworkSurface(Container.ArtworkSurface artworkSurface);

		/**
		 * uri: http://schema.org/colorist
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Colorist
		 */
		public Colorist getColorist();
		public void setColorist(Colorist colorist);

		/**
		 * uri: http://schema.org/depth
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Depth
		 */
		public Container.Depth getDepth();
		public void setDepth(Container.Depth depth);

		/**
		 * uri: http://schema.org/height
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Height
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * uri: http://schema.org/inker
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Inker
		 */
		public Inker getInker();
		public void setInker(Inker inker);

		/**
		 * uri: http://schema.org/letterer
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Letterer
		 */
		public Letterer getLetterer();
		public void setLetterer(Letterer letterer);

		/**
		 * uri: http://schema.org/penciler
		 * class: org.kyojo.schemaOrg.m3n3.bib.Container.Penciler
		 */
		public Penciler getPenciler();
		public void setPenciler(Penciler penciler);

		/**
		 * uri: http://schema.org/width
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Width
		 */
		public Container.Width getWidth();
		public void setWidth(Container.Width width);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Volcano")
	@SchemaOrgLabel("Volcano")
	@SchemaOrgComment("A volcano, like Fuji san.")
	@CamelizedName("volcano")
	@ConstantizedName("VOLCANO")
	public interface Volcano extends Landform, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VoteAction")
	@SchemaOrgLabel("VoteAction")
	@SchemaOrgComment(""
			+ "The act of expressing a preference from a fixed/finite/structured set of"
			+ " choices/options.")
	@CamelizedName("voteAction")
	@ConstantizedName("VOTE_ACTION")
	public interface VoteAction extends ChooseAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/candidate
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Candidate
		 */
		public Container.Candidate getCandidate();
		public void setCandidate(Container.Candidate candidate);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WPAdBlock")
	@SchemaOrgLabel("WPAdBlock")
	@SchemaOrgComment("An advertising section of the page.")
	@CamelizedName("wpAdBlock")
	@ConstantizedName("WP_AD_BLOCK")
	public interface WPAdBlock extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WPFooter")
	@SchemaOrgLabel("WPFooter")
	@SchemaOrgComment("The footer section of the page.")
	@CamelizedName("wpFooter")
	@ConstantizedName("WP_FOOTER")
	public interface WPFooter extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WPHeader")
	@SchemaOrgLabel("WPHeader")
	@SchemaOrgComment("The header section of the page.")
	@CamelizedName("wpHeader")
	@ConstantizedName("WP_HEADER")
	public interface WPHeader extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WPSideBar")
	@SchemaOrgLabel("WPSideBar")
	@SchemaOrgComment("A sidebar section of the page.")
	@CamelizedName("wpSideBar")
	@ConstantizedName("WP_SIDE_BAR")
	public interface WPSideBar extends SchemaOrgClass, WebPageElement {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WantAction")
	@SchemaOrgLabel("WantAction")
	@SchemaOrgComment(""
			+ "The act of expressing a desire about the object. An agent wants an object.")
	@CamelizedName("wantAction")
	@ConstantizedName("WANT_ACTION")
	public interface WantAction extends ReactAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WarrantyPromise")
	@SchemaOrgLabel("WarrantyPromise")
	@SchemaOrgComment(""
			+ "A structured value representing the duration and scope of services that will be"
			+ " provided to a customer free of charge in case of a defect or malfunction of a"
			+ " product.")
	@CamelizedName("warrantyPromise")
	@ConstantizedName("WARRANTY_PROMISE")
	public interface WarrantyPromise extends SchemaOrgClass, StructuredValue {

		/**
		 * uri: http://schema.org/durationOfWarranty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.DurationOfWarranty
		 */
		public Container.DurationOfWarranty getDurationOfWarranty();
		public void setDurationOfWarranty(Container.DurationOfWarranty durationOfWarranty);

		/**
		 * uri: http://schema.org/warrantyScope
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.WarrantyScope
		 */
		public Container.WarrantyScope getWarrantyScope();
		public void setWarrantyScope(Container.WarrantyScope warrantyScope);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WarrantyScope")
	@SchemaOrgLabel("WarrantyScope")
	@SchemaOrgComment(""
			+ "<p>A range of of services that will be provided to a customer free of charge in"
			+ " case of a defect or malfunction of a product.</p>\n\n<p>Commonly used"
			+ " values:</p>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#Labor-BringIn</li>\n<li>http://purl.org/goodrelations/v1#PartsAndLabor-BringIn</li>\n<li>http://purl.org/goodrelations/v1#PartsAndLabor-PickUp</li>\n</ul>\n")
	@CamelizedName("warrantyScope")
	@ConstantizedName("WARRANTY_SCOPE")
	public interface WarrantyScope extends Enumeration, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WatchAction")
	@SchemaOrgLabel("WatchAction")
	@SchemaOrgComment(""
			+ "The act of consuming dynamic/moving visual content.")
	@CamelizedName("watchAction")
	@ConstantizedName("WATCH_ACTION")
	public interface WatchAction extends ConsumeAction, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Waterfall")
	@SchemaOrgLabel("Waterfall")
	@SchemaOrgComment("A waterfall, like Niagara.")
	@CamelizedName("waterfall")
	@ConstantizedName("WATERFALL")
	public interface Waterfall extends BodyOfWater, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WearAction")
	@SchemaOrgLabel("WearAction")
	@SchemaOrgComment(""
			+ "The act of dressing oneself in clothing.")
	@CamelizedName("wearAction")
	@ConstantizedName("WEAR_ACTION")
	public interface WearAction extends SchemaOrgClass, UseAction {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WebApplication")
	@SchemaOrgLabel("WebApplication")
	@SchemaOrgComment("Web applications.")
	@CamelizedName("webApplication")
	@ConstantizedName("WEB_APPLICATION")
	public interface WebApplication extends SchemaOrgClass, SoftwareApplication {

		/**
		 * uri: http://schema.org/browserRequirements
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.BrowserRequirements
		 */
		public Container.BrowserRequirements getBrowserRequirements();
		public void setBrowserRequirements(Container.BrowserRequirements browserRequirements);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WebPage")
	@SchemaOrgLabel("WebPage")
	@SchemaOrgComment(""
			+ "A web page. Every web page is implicitly assumed to be declared to be of type"
			+ " WebPage, so the various properties about that webpage, such as"
			+ " <code>breadcrumb</code> may be used. We recommend explicit declaration if these"
			+ " properties are specified, but if they are found outside of an itemscope, they"
			+ " will be assumed to be about the page.")
	@CamelizedName("webPage")
	@ConstantizedName("WEB_PAGE")
	public interface WebPage extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/breadcrumb
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Breadcrumb
		 */
		public Container.Breadcrumb getBreadcrumb();
		public void setBreadcrumb(Container.Breadcrumb breadcrumb);

		/**
		 * uri: http://schema.org/lastReviewed
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.LastReviewed
		 */
		public Container.LastReviewed getLastReviewed();
		public void setLastReviewed(Container.LastReviewed lastReviewed);

		/**
		 * uri: http://schema.org/mainContentOfPage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.MainContentOfPage
		 */
		public Container.MainContentOfPage getMainContentOfPage();
		public void setMainContentOfPage(Container.MainContentOfPage mainContentOfPage);

		/**
		 * uri: http://schema.org/primaryImageOfPage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.PrimaryImageOfPage
		 */
		public Container.PrimaryImageOfPage getPrimaryImageOfPage();
		public void setPrimaryImageOfPage(Container.PrimaryImageOfPage primaryImageOfPage);

		/**
		 * uri: http://schema.org/relatedLink
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.RelatedLink
		 */
		public Container.RelatedLink getRelatedLink();
		public void setRelatedLink(Container.RelatedLink relatedLink);

		/**
		 * uri: http://schema.org/reviewedBy
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.ReviewedBy
		 */
		public Container.ReviewedBy getReviewedBy();
		public void setReviewedBy(Container.ReviewedBy reviewedBy);

		/**
		 * uri: http://schema.org/significantLink
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.SignificantLink
		 */
		public Container.SignificantLink getSignificantLink();
		public void setSignificantLink(Container.SignificantLink significantLink);

		/**
		 * uri: http://schema.org/speakable
		 * class: org.kyojo.schemaOrg.m3n3.pending.Container.Speakable
		 */
		public Speakable getSpeakable();
		public void setSpeakable(Speakable speakable);

		/**
		 * uri: http://schema.org/specialty
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Specialty
		 */
		public Container.Specialty getSpecialty();
		public void setSpecialty(Container.Specialty specialty);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WebPageElement")
	@SchemaOrgLabel("WebPageElement")
	@SchemaOrgComment(""
			+ "A web page element, like a table or an image.")
	@CamelizedName("webPageElement")
	@ConstantizedName("WEB_PAGE_ELEMENT")
	public interface WebPageElement extends CreativeWork, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WebSite")
	@SchemaOrgLabel("WebSite")
	@SchemaOrgComment(""
			+ "A WebSite is a set of related web pages and other items typically served from a"
			+ " single web domain and accessible via URLs.")
	@CamelizedName("webSite")
	@ConstantizedName("WEB_SITE")
	public interface WebSite extends CreativeWork, SchemaOrgClass {

		/**
		 * uri: http://schema.org/issn
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Issn
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WholesaleStore")
	@SchemaOrgLabel("WholesaleStore")
	@SchemaOrgComment("A wholesale store.")
	@CamelizedName("wholesaleStore")
	@ConstantizedName("WHOLESALE_STORE")
	public interface WholesaleStore extends SchemaOrgClass, Store {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WinAction")
	@SchemaOrgLabel("WinAction")
	@SchemaOrgComment(""
			+ "The act of achieving victory in a competitive activity.")
	@CamelizedName("winAction")
	@ConstantizedName("WIN_ACTION")
	public interface WinAction extends AchieveAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/loser
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.Loser
		 */
		public Container.Loser getLoser();
		public void setLoser(Container.Loser loser);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Winery")
	@SchemaOrgLabel("Winery")
	@SchemaOrgComment("A winery.")
	@CamelizedName("winery")
	@ConstantizedName("WINERY")
	public interface Winery extends FoodEstablishment, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/WriteAction")
	@SchemaOrgLabel("WriteAction")
	@SchemaOrgComment(""
			+ "The act of authoring written creative content.")
	@CamelizedName("writeAction")
	@ConstantizedName("WRITE_ACTION")
	public interface WriteAction extends CreateAction, SchemaOrgClass {

		/**
		 * uri: http://schema.org/inLanguage
		 * class: org.kyojo.schemaOrg.m3n3.core.Container.InLanguage
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Zoo")
	@SchemaOrgLabel("Zoo")
	@SchemaOrgComment("A zoo.")
	@CamelizedName("zoo")
	@ConstantizedName("ZOO")
	public interface Zoo extends CivicStructure, SchemaOrgClass {

		public String getString();
		public void setString(String string);
		public String getNativeValue();

	}

}
