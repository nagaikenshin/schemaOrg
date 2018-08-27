package org.kyojo.schemaorg.m3n4.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgClass;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.auto.Container.AccelerationTime;
import org.kyojo.schemaorg.m3n4.auto.Container.AcrissCode;
import org.kyojo.schemaorg.m3n4.auto.Container.BodyType;
import org.kyojo.schemaorg.m3n4.auto.Container.EmissionsCO2;
import org.kyojo.schemaorg.m3n4.auto.Container.EngineDisplacement;
import org.kyojo.schemaorg.m3n4.auto.Container.EnginePower;
import org.kyojo.schemaorg.m3n4.auto.Container.EngineType;
import org.kyojo.schemaorg.m3n4.auto.Container.FuelCapacity;
import org.kyojo.schemaorg.m3n4.auto.Container.MeetsEmissionStandard;
import org.kyojo.schemaorg.m3n4.auto.Container.ModelDate;
import org.kyojo.schemaorg.m3n4.auto.Container.Payload;
import org.kyojo.schemaorg.m3n4.auto.Container.RoofLoad;
import org.kyojo.schemaorg.m3n4.auto.Container.SeatingCapacity;
import org.kyojo.schemaorg.m3n4.auto.Container.Speed;
import org.kyojo.schemaorg.m3n4.auto.Container.TongueWeight;
import org.kyojo.schemaorg.m3n4.auto.Container.Torque;
import org.kyojo.schemaorg.m3n4.auto.Container.TrailerWeight;
import org.kyojo.schemaorg.m3n4.auto.Container.VehicleSpecialUsage;
import org.kyojo.schemaorg.m3n4.auto.Container.WeightTotal;
import org.kyojo.schemaorg.m3n4.auto.Container.Wheelbase;
import org.kyojo.schemaorg.m3n4.bib.Container.Abridged;
import org.kyojo.schemaorg.m3n4.bib.Container.Artist;
import org.kyojo.schemaorg.m3n4.bib.Container.Colorist;
import org.kyojo.schemaorg.m3n4.bib.Container.Inker;
import org.kyojo.schemaorg.m3n4.bib.Container.Letterer;
import org.kyojo.schemaorg.m3n4.bib.Container.Penciler;
import org.kyojo.schemaorg.m3n4.bib.Container.PublishedBy;
import org.kyojo.schemaorg.m3n4.bib.Container.PublisherImprint;
import org.kyojo.schemaorg.m3n4.bib.Container.TranslationOfWork;
import org.kyojo.schemaorg.m3n4.bib.Container.WorkTranslation;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AvailableService;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseRelatedDiet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseType;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HospitalAffiliation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MedicalSpecialty;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Purpose;
import org.kyojo.schemaorg.m3n4.meta.Container.SupersededBy;
import org.kyojo.schemaorg.m3n4.pending.Container.AccountMinimumInflow;
import org.kyojo.schemaorg.m3n4.pending.Container.AccountOverdraftLimit;
import org.kyojo.schemaorg.m3n4.pending.Container.ActionAccessibilityRequirement;
import org.kyojo.schemaorg.m3n4.pending.Container.ActionableFeedbackPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.AvailabilityEnds;
import org.kyojo.schemaorg.m3n4.pending.Container.AvailabilityStarts;
import org.kyojo.schemaorg.m3n4.pending.Container.Backstory;
import org.kyojo.schemaorg.m3n4.pending.Container.BankAccountType;
import org.kyojo.schemaorg.m3n4.pending.Container.BroadcastFrequency;
import org.kyojo.schemaorg.m3n4.pending.Container.CashBack;
import org.kyojo.schemaorg.m3n4.pending.Container.Category;
import org.kyojo.schemaorg.m3n4.pending.Container.ContactlessPayment;
import org.kyojo.schemaorg.m3n4.pending.Container.ContentReferenceTime;
import org.kyojo.schemaorg.m3n4.pending.Container.Correction;
import org.kyojo.schemaorg.m3n4.pending.Container.CorrectionsPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.CssSelector;
import org.kyojo.schemaorg.m3n4.pending.Container.Currency;
import org.kyojo.schemaorg.m3n4.pending.Container.DiversityPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.DiversityStaffingReport;
import org.kyojo.schemaorg.m3n4.pending.Container.EducationRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.EducationalCredentialAwarded;
import org.kyojo.schemaorg.m3n4.pending.Container.EligibleRegion;
import org.kyojo.schemaorg.m3n4.pending.Container.EstimatedSalary;
import org.kyojo.schemaorg.m3n4.pending.Container.EthicsPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.ExpectsAcceptanceOf;
import org.kyojo.schemaorg.m3n4.pending.Container.ExperienceRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.FloorLimit;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyContains;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCoveredBy;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCovers;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCrosses;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyDisjoint;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyEquals;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyIntersects;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyOverlaps;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyTouches;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyWithin;
import org.kyojo.schemaorg.m3n4.pending.Container.GracePeriod;
import org.kyojo.schemaorg.m3n4.pending.Container.HasBroadcastChannel;
import org.kyojo.schemaorg.m3n4.pending.Container.HasOccupation;
import org.kyojo.schemaorg.m3n4.pending.Container.HealthPlanNetworkId;
import org.kyojo.schemaorg.m3n4.pending.Container.IsAcceptingNewPatients;
import org.kyojo.schemaorg.m3n4.pending.Container.Itinerary;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsAbout;
import org.kyojo.schemaorg.m3n4.pending.Container.KnowsLanguage;
import org.kyojo.schemaorg.m3n4.pending.Container.LoanRepaymentForm;
import org.kyojo.schemaorg.m3n4.pending.Container.LoanType;
import org.kyojo.schemaorg.m3n4.pending.Container.MeasurementTechnique;
import org.kyojo.schemaorg.m3n4.pending.Container.MenuAddOn;
import org.kyojo.schemaorg.m3n4.pending.Container.MonthlyMinimumRepaymentAmount;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationalCategory;
import org.kyojo.schemaorg.m3n4.pending.Container.OwnershipFundingInfo;
import org.kyojo.schemaorg.m3n4.pending.Container.Qualifications;
import org.kyojo.schemaorg.m3n4.pending.Container.RecourseLoan;
import org.kyojo.schemaorg.m3n4.pending.Container.RelevantOccupation;
import org.kyojo.schemaorg.m3n4.pending.Container.RenegotiableLoan;
import org.kyojo.schemaorg.m3n4.pending.Container.RequiresSubscription;
import org.kyojo.schemaorg.m3n4.pending.Container.Responsibilities;
import org.kyojo.schemaorg.m3n4.pending.Container.ReviewAspect;
import org.kyojo.schemaorg.m3n4.pending.Container.SdDatePublished;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;
import org.kyojo.schemaorg.m3n4.pending.Container.SdPublisher;
import org.kyojo.schemaorg.m3n4.pending.Container.Skills;
import org.kyojo.schemaorg.m3n4.pending.Container.Speakable;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;
import org.kyojo.schemaorg.m3n4.pending.Container.TermsOfService;
import org.kyojo.schemaorg.m3n4.pending.Container.UnnamedSourcesPolicy;
import org.kyojo.schemaorg.m3n4.pending.Container.VariableMeasured;
import org.kyojo.schemaorg.m3n4.pending.Container.Xpath;

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
		 * @see <a href="http://schema.org/assemblyVersion">http://schema.org/assemblyVersion</a>
		 */
		public Container.AssemblyVersion getAssemblyVersion();
		public void setAssemblyVersion(Container.AssemblyVersion assemblyVersion);

		/**
		 * @see <a href="http://schema.org/executableLibraryName">http://schema.org/executableLibraryName</a>
		 */
		public Container.ExecutableLibraryName getExecutableLibraryName();
		public void setExecutableLibraryName(Container.ExecutableLibraryName executableLibraryName);

		/**
		 * @see <a href="http://schema.org/programmingModel">http://schema.org/programmingModel</a>
		 */
		public Container.ProgrammingModel getProgrammingModel();
		public void setProgrammingModel(Container.ProgrammingModel programmingModel);

		/**
		 * @see <a href="http://schema.org/targetPlatform">http://schema.org/targetPlatform</a>
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
			+ "The act of committing to/adopting an object.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/amenityFeature">http://schema.org/amenityFeature</a>
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * @see <a href="http://schema.org/floorSize">http://schema.org/floorSize</a>
		 */
		public Container.FloorSize getFloorSize();
		public void setFloorSize(Container.FloorSize floorSize);

		/**
		 * @see <a href="http://schema.org/numberOfRooms">http://schema.org/numberOfRooms</a>
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * @see <a href="http://schema.org/permittedUsage">http://schema.org/permittedUsage</a>
		 */
		public Container.PermittedUsage getPermittedUsage();
		public void setPermittedUsage(Container.PermittedUsage permittedUsage);

		/**
		 * @see <a href="http://schema.org/petsAllowed">http://schema.org/petsAllowed</a>
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
			+ "Accountancy business.<br/><br/>\n\nAs a <a class=\"localLink\""
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
			+ " argument/role.<br/><br/>\n\nSee also <a"
			+ " href=\"http://blog.schema.org/2014/04/announcing-schemaorg-actions.html\">blog"
			+ " post</a> and <a href=\"http://schema.org/docs/actions.html\">Actions overview"
			+ " document</a>.")
	@CamelizedName("action")
	@ConstantizedName("ACTION")
	public interface Action extends SchemaOrgClass, Thing {

		/**
		 * @see <a href="http://schema.org/actionStatus">http://schema.org/actionStatus</a>
		 */
		public Container.ActionStatus getActionStatus();
		public void setActionStatus(Container.ActionStatus actionStatus);

		/**
		 * @see <a href="http://schema.org/agent">http://schema.org/agent</a>
		 */
		public Container.Agent getAgent();
		public void setAgent(Container.Agent agent);

		/**
		 * @see <a href="http://schema.org/endTime">http://schema.org/endTime</a>
		 */
		public Container.EndTime getEndTime();
		public void setEndTime(Container.EndTime endTime);

		/**
		 * @see <a href="http://schema.org/error">http://schema.org/error</a>
		 */
		public Container.Error getError();
		public void setError(Container.Error error);

		/**
		 * @see <a href="http://schema.org/instrument">http://schema.org/instrument</a>
		 */
		public Container.Instrument getInstrument();
		public void setInstrument(Container.Instrument instrument);

		/**
		 * @see <a href="http://schema.org/location">http://schema.org/location</a>
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * @see <a href="http://schema.org/object">http://schema.org/object</a>
		 */
		public Container.Object getObject();
		public void setObject(Container.Object object);

		/**
		 * @see <a href="http://schema.org/participant">http://schema.org/participant</a>
		 */
		public Container.Participant getParticipant();
		public void setParticipant(Container.Participant participant);

		/**
		 * @see <a href="http://schema.org/result">http://schema.org/result</a>
		 */
		public Container.Result getResult();
		public void setResult(Container.Result result);

		/**
		 * @see <a href="http://schema.org/startTime">http://schema.org/startTime</a>
		 */
		public Container.StartTime getStartTime();
		public void setStartTime(Container.StartTime startTime);

		/**
		 * @see <a href="http://schema.org/target">http://schema.org/target</a>
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
		 * @see <a href="http://schema.org/highPrice">http://schema.org/highPrice</a>
		 */
		public Container.HighPrice getHighPrice();
		public void setHighPrice(Container.HighPrice highPrice);

		/**
		 * @see <a href="http://schema.org/lowPrice">http://schema.org/lowPrice</a>
		 */
		public Container.LowPrice getLowPrice();
		public void setLowPrice(Container.LowPrice lowPrice);

		/**
		 * @see <a href="http://schema.org/offerCount">http://schema.org/offerCount</a>
		 */
		public Container.OfferCount getOfferCount();
		public void setOfferCount(Container.OfferCount offerCount);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
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
		 * @see <a href="http://schema.org/itemReviewed">http://schema.org/itemReviewed</a>
		 */
		public Container.ItemReviewed getItemReviewed();
		public void setItemReviewed(Container.ItemReviewed itemReviewed);

		/**
		 * @see <a href="http://schema.org/ratingCount">http://schema.org/ratingCount</a>
		 */
		public Container.RatingCount getRatingCount();
		public void setRatingCount(Container.RatingCount ratingCount);

		/**
		 * @see <a href="http://schema.org/reviewCount">http://schema.org/reviewCount</a>
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
		 * @see <a href="http://schema.org/boardingPolicy">http://schema.org/boardingPolicy</a>
		 */
		public Container.BoardingPolicy getBoardingPolicy();
		public void setBoardingPolicy(Container.BoardingPolicy boardingPolicy);

		/**
		 * @see <a href="http://schema.org/iataCode">http://schema.org/iataCode</a>
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
		 * @see <a href="http://schema.org/iataCode">http://schema.org/iataCode</a>
		 */
		public Container.IataCode getIataCode();
		public void setIataCode(Container.IataCode iataCode);

		/**
		 * @see <a href="http://schema.org/icaoCode">http://schema.org/icaoCode</a>
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
		 * @see <a href="http://schema.org/alignmentType">http://schema.org/alignmentType</a>
		 */
		public Container.AlignmentType getAlignmentType();
		public void setAlignmentType(Container.AlignmentType alignmentType);

		/**
		 * @see <a href="http://schema.org/educationalFramework">http://schema.org/educationalFramework</a>
		 */
		public Container.EducationalFramework getEducationalFramework();
		public void setEducationalFramework(Container.EducationalFramework educationalFramework);

		/**
		 * @see <a href="http://schema.org/targetDescription">http://schema.org/targetDescription</a>
		 */
		public Container.TargetDescription getTargetDescription();
		public void setTargetDescription(Container.TargetDescription targetDescription);

		/**
		 * @see <a href="http://schema.org/targetName">http://schema.org/targetName</a>
		 */
		public Container.TargetName getTargetName();
		public void setTargetName(Container.TargetName targetName);

		/**
		 * @see <a href="http://schema.org/targetUrl">http://schema.org/targetUrl</a>
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
		 * @see <a href="http://schema.org/purpose">http://schema.org/purpose</a>
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
		 * @see <a href="http://schema.org/numberOfRooms">http://schema.org/numberOfRooms</a>
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * @see <a href="http://schema.org/occupancy">http://schema.org/occupancy</a>
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
			+ "The act of registering to an organization/service without the guarantee to"
			+ " receive it.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\""
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
			+ " cover them all.<br/><br/>\n\nSee also <a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog"
			+ " post</a>.")
	@CamelizedName("article")
	@ConstantizedName("ARTICLE")
	public interface Article extends CreativeWork, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/articleBody">http://schema.org/articleBody</a>
		 */
		public Container.ArticleBody getArticleBody();
		public void setArticleBody(Container.ArticleBody articleBody);

		/**
		 * @see <a href="http://schema.org/articleSection">http://schema.org/articleSection</a>
		 */
		public Container.ArticleSection getArticleSection();
		public void setArticleSection(Container.ArticleSection articleSection);

		/**
		 * @see <a href="http://schema.org/backstory">http://schema.org/backstory</a>
		 */
		public Backstory getBackstory();
		public void setBackstory(Backstory backstory);

		/**
		 * @see <a href="http://schema.org/pageEnd">http://schema.org/pageEnd</a>
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * @see <a href="http://schema.org/pageStart">http://schema.org/pageStart</a>
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * @see <a href="http://schema.org/pagination">http://schema.org/pagination</a>
		 */
		public Container.Pagination getPagination();
		public void setPagination(Container.Pagination pagination);

		/**
		 * @see <a href="http://schema.org/speakable">http://schema.org/speakable</a>
		 */
		public Speakable getSpeakable();
		public void setSpeakable(Speakable speakable);

		/**
		 * @see <a href="http://schema.org/wordCount">http://schema.org/wordCount</a>
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
			+ "The act of posing a question / favor to someone.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/ReplyAction\">ReplyAction</a>: Appears generally as a"
			+ " response to AskAction.</li>\n</ul>\n")
	@CamelizedName("askAction")
	@ConstantizedName("ASK_ACTION")
	public interface AskAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/question">http://schema.org/question</a>
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
			+ "Professional service: Attorney. <br/><br/>\n\nThis type is deprecated - <a"
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
		 * @see <a href="http://schema.org/audienceType">http://schema.org/audienceType</a>
		 */
		public Container.AudienceType getAudienceType();
		public void setAudienceType(Container.AudienceType audienceType);

		/**
		 * @see <a href="http://schema.org/geographicArea">http://schema.org/geographicArea</a>
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
		 * @see <a href="http://schema.org/transcript">http://schema.org/transcript</a>
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
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/accountMinimumInflow">http://schema.org/accountMinimumInflow</a>
		 */
		public AccountMinimumInflow getAccountMinimumInflow();
		public void setAccountMinimumInflow(AccountMinimumInflow accountMinimumInflow);

		/**
		 * @see <a href="http://schema.org/accountOverdraftLimit">http://schema.org/accountOverdraftLimit</a>
		 */
		public AccountOverdraftLimit getAccountOverdraftLimit();
		public void setAccountOverdraftLimit(AccountOverdraftLimit accountOverdraftLimit);

		/**
		 * @see <a href="http://schema.org/bankAccountType">http://schema.org/bankAccountType</a>
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
		 * @see <a href="http://schema.org/numberOfBeds">http://schema.org/numberOfBeds</a>
		 */
		public Container.NumberOfBeds getNumberOfBeds();
		public void setNumberOfBeds(Container.NumberOfBeds numberOfBeds);

		/**
		 * @see <a href="http://schema.org/typeOfBed">http://schema.org/typeOfBed</a>
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
			+ "The act of forming a personal connection with someone (object)"
			+ " mutually/bidirectionally/symmetrically.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/blogPost">http://schema.org/blogPost</a>
		 */
		public Container.BlogPost getBlogPost();
		public void setBlogPost(Container.BlogPost blogPost);

		/**
		 * @see <a href="http://schema.org/issn">http://schema.org/issn</a>
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
		 * @see <a href="http://schema.org/abridged">http://schema.org/abridged</a>
		 */
		public Abridged getAbridged();
		public void setAbridged(Abridged abridged);

		/**
		 * @see <a href="http://schema.org/bookEdition">http://schema.org/bookEdition</a>
		 */
		public Container.BookEdition getBookEdition();
		public void setBookEdition(Container.BookEdition bookEdition);

		/**
		 * @see <a href="http://schema.org/bookFormat">http://schema.org/bookFormat</a>
		 */
		public Container.BookFormat getBookFormat();
		public void setBookFormat(Container.BookFormat bookFormat);

		/**
		 * @see <a href="http://schema.org/illustrator">http://schema.org/illustrator</a>
		 */
		public Container.Illustrator getIllustrator();
		public void setIllustrator(Container.Illustrator illustrator);

		/**
		 * @see <a href="http://schema.org/isbn">http://schema.org/isbn</a>
		 */
		public Container.Isbn getIsbn();
		public void setIsbn(Container.Isbn isbn);

		/**
		 * @see <a href="http://schema.org/numberOfPages">http://schema.org/numberOfPages</a>
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
			+ "The act of obtaining an object under an agreement to return it at a later date."
			+ " Reciprocal of LendAction.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/LendAction\">LendAction</a>: Reciprocal of"
			+ " BorrowAction.</li>\n</ul>\n")
	@CamelizedName("borrowAction")
	@ConstantizedName("BORROW_ACTION")
	public interface BorrowAction extends SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/lender">http://schema.org/lender</a>
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
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/logo">http://schema.org/logo</a>
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
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
			+ " ending with the current page.<br/><br/>\n\nThe <a class=\"localLink\""
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
		 * @see <a href="http://schema.org/broadcastChannelId">http://schema.org/broadcastChannelId</a>
		 */
		public Container.BroadcastChannelId getBroadcastChannelId();
		public void setBroadcastChannelId(Container.BroadcastChannelId broadcastChannelId);

		/**
		 * @see <a href="http://schema.org/broadcastFrequency">http://schema.org/broadcastFrequency</a>
		 */
		public BroadcastFrequency getBroadcastFrequency();
		public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency);

		/**
		 * @see <a href="http://schema.org/broadcastServiceTier">http://schema.org/broadcastServiceTier</a>
		 */
		public Container.BroadcastServiceTier getBroadcastServiceTier();
		public void setBroadcastServiceTier(Container.BroadcastServiceTier broadcastServiceTier);

		/**
		 * @see <a href="http://schema.org/genre">http://schema.org/genre</a>
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * @see <a href="http://schema.org/inBroadcastLineup">http://schema.org/inBroadcastLineup</a>
		 */
		public Container.InBroadcastLineup getInBroadcastLineup();
		public void setInBroadcastLineup(Container.InBroadcastLineup inBroadcastLineup);

		/**
		 * @see <a href="http://schema.org/providesBroadcastService">http://schema.org/providesBroadcastService</a>
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
		 * @see <a href="http://schema.org/broadcastOfEvent">http://schema.org/broadcastOfEvent</a>
		 */
		public Container.BroadcastOfEvent getBroadcastOfEvent();
		public void setBroadcastOfEvent(Container.BroadcastOfEvent broadcastOfEvent);

		/**
		 * @see <a href="http://schema.org/isLiveBroadcast">http://schema.org/isLiveBroadcast</a>
		 */
		public Container.IsLiveBroadcast getIsLiveBroadcast();
		public void setIsLiveBroadcast(Container.IsLiveBroadcast isLiveBroadcast);

		/**
		 * @see <a href="http://schema.org/videoFormat">http://schema.org/videoFormat</a>
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
		 * @see <a href="http://schema.org/broadcastAffiliateOf">http://schema.org/broadcastAffiliateOf</a>
		 */
		public Container.BroadcastAffiliateOf getBroadcastAffiliateOf();
		public void setBroadcastAffiliateOf(Container.BroadcastAffiliateOf broadcastAffiliateOf);

		/**
		 * @see <a href="http://schema.org/broadcastDisplayName">http://schema.org/broadcastDisplayName</a>
		 */
		public Container.BroadcastDisplayName getBroadcastDisplayName();
		public void setBroadcastDisplayName(Container.BroadcastDisplayName broadcastDisplayName);

		/**
		 * @see <a href="http://schema.org/broadcastFrequency">http://schema.org/broadcastFrequency</a>
		 */
		public BroadcastFrequency getBroadcastFrequency();
		public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency);

		/**
		 * @see <a href="http://schema.org/broadcastTimezone">http://schema.org/broadcastTimezone</a>
		 */
		public Container.BroadcastTimezone getBroadcastTimezone();
		public void setBroadcastTimezone(Container.BroadcastTimezone broadcastTimezone);

		/**
		 * @see <a href="http://schema.org/broadcaster">http://schema.org/broadcaster</a>
		 */
		public Container.Broadcaster getBroadcaster();
		public void setBroadcaster(Container.Broadcaster broadcaster);

		/**
		 * @see <a href="http://schema.org/hasBroadcastChannel">http://schema.org/hasBroadcastChannel</a>
		 */
		public HasBroadcastChannel getHasBroadcastChannel();
		public void setHasBroadcastChannel(HasBroadcastChannel hasBroadcastChannel);

		/**
		 * @see <a href="http://schema.org/parentService">http://schema.org/parentService</a>
		 */
		public Container.ParentService getParentService();
		public void setParentService(Container.ParentService parentService);

		/**
		 * @see <a href="http://schema.org/videoFormat">http://schema.org/videoFormat</a>
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
			+ "A reservation for bus travel. <br/><br/>\n\nNote: This type is for information"
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
	public interface BusTrip extends SchemaOrgClass, Trip {

		/**
		 * @see <a href="http://schema.org/arrivalBusStop">http://schema.org/arrivalBusStop</a>
		 */
		public Container.ArrivalBusStop getArrivalBusStop();
		public void setArrivalBusStop(Container.ArrivalBusStop arrivalBusStop);

		/**
		 * @see <a href="http://schema.org/busName">http://schema.org/busName</a>
		 */
		public Container.BusName getBusName();
		public void setBusName(Container.BusName busName);

		/**
		 * @see <a href="http://schema.org/busNumber">http://schema.org/busNumber</a>
		 */
		public Container.BusNumber getBusNumber();
		public void setBusNumber(Container.BusNumber busNumber);

		/**
		 * @see <a href="http://schema.org/departureBusStop">http://schema.org/departureBusStop</a>
		 */
		public Container.DepartureBusStop getDepartureBusStop();
		public void setDepartureBusStop(Container.DepartureBusStop departureBusStop);

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
		 * @see <a href="http://schema.org/numberOfEmployees">http://schema.org/numberOfEmployees</a>
		 */
		public Container.NumberOfEmployees getNumberOfEmployees();
		public void setNumberOfEmployees(Container.NumberOfEmployees numberOfEmployees);

		/**
		 * @see <a href="http://schema.org/yearlyRevenue">http://schema.org/yearlyRevenue</a>
		 */
		public Container.YearlyRevenue getYearlyRevenue();
		public void setYearlyRevenue(Container.YearlyRevenue yearlyRevenue);

		/**
		 * @see <a href="http://schema.org/yearsInOperation">http://schema.org/yearsInOperation</a>
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
			+ "A business entity type is a conceptual entity representing the legal form, the"
			+ " size, the main line of business, the position in the value chain, or any"
			+ " combination thereof, of an organization or business"
			+ " person.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#Business</li>\n<li>http://purl.org/goodrelations/v1#Enduser</li>\n<li>http://purl.org/goodrelations/v1#PublicInstitution</li>\n<li>http://purl.org/goodrelations/v1#Reseller</li>\n</ul>\n")
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
			+ "The business function specifies the type of activity or access (i.e., the bundle"
			+ " of rights) offered by the organization or business person through the offer."
			+ " Typical are sell, rental or lease, maintenance or repair, manufacture /"
			+ " produce, recycle / dispose, engineering / construction, or installation."
			+ " Proprietary specifications of access rights are also instances of this"
			+ " class.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#ConstructionInstallation</li>\n<li>http://purl.org/goodrelations/v1#Dispose</li>\n<li>http://purl.org/goodrelations/v1#LeaseOut</li>\n<li>http://purl.org/goodrelations/v1#Maintain</li>\n<li>http://purl.org/goodrelations/v1#ProvideService</li>\n<li>http://purl.org/goodrelations/v1#Repair</li>\n<li>http://purl.org/goodrelations/v1#Sell</li>\n<li>http://purl.org/goodrelations/v1#Buy</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/seller">http://schema.org/seller</a>
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
			+ "The act of asserting that a future event/action is no longer going to"
			+ " happen.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/ConfirmAction\">ConfirmAction</a>:"
			+ " The antonym of CancelAction.</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/acrissCode">http://schema.org/acrissCode</a>
		 */
		public AcrissCode getAcrissCode();
		public void setAcrissCode(AcrissCode acrissCode);

		/**
		 * @see <a href="http://schema.org/roofLoad">http://schema.org/roofLoad</a>
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
			+ "The act of an agent communicating (service provider, social media, etc) their"
			+ " arrival by registering/confirming for a previously reserved service (e.g."
			+ " flight check in) or at a place (e.g. hotel), possibly resulting in a result"
			+ " (boarding pass, etc).<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
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
			+ "The act of an agent communicating (service provider, social media, etc) their"
			+ " departure of a previously reserved service (e.g. flight check in) or place"
			+ " (e.g. hotel).<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
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
		 * @see <a href="http://schema.org/actionOption">http://schema.org/actionOption</a>
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
		 * @see <a href="http://schema.org/openingHours">http://schema.org/openingHours</a>
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
		 * @see <a href="http://schema.org/claimReviewed">http://schema.org/claimReviewed</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/clipNumber">http://schema.org/clipNumber</a>
		 */
		public Container.ClipNumber getClipNumber();
		public void setClipNumber(Container.ClipNumber clipNumber);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/partOfEpisode">http://schema.org/partOfEpisode</a>
		 */
		public Container.PartOfEpisode getPartOfEpisode();
		public void setPartOfEpisode(Container.PartOfEpisode partOfEpisode);

		/**
		 * @see <a href="http://schema.org/partOfSeason">http://schema.org/partOfSeason</a>
		 */
		public Container.PartOfSeason getPartOfSeason();
		public void setPartOfSeason(Container.PartOfSeason partOfSeason);

		/**
		 * @see <a href="http://schema.org/partOfSeries">http://schema.org/partOfSeries</a>
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
		 * @see <a href="http://schema.org/downvoteCount">http://schema.org/downvoteCount</a>
		 */
		public Container.DownvoteCount getDownvoteCount();
		public void setDownvoteCount(Container.DownvoteCount downvoteCount);

		/**
		 * @see <a href="http://schema.org/parentItem">http://schema.org/parentItem</a>
		 */
		public Container.ParentItem getParentItem();
		public void setParentItem(Container.ParentItem parentItem);

		/**
		 * @see <a href="http://schema.org/upvoteCount">http://schema.org/upvoteCount</a>
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
		 * @see <a href="http://schema.org/resultComment">http://schema.org/resultComment</a>
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
		 * @see <a href="http://schema.org/about">http://schema.org/about</a>
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * @see <a href="http://schema.org/inLanguage">http://schema.org/inLanguage</a>
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/priceComponent">http://schema.org/priceComponent</a>
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
			+ "The act of notifying someone that a future event/action is going to happen as"
			+ " expected.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/CancelAction\">CancelAction</a>:"
			+ " The antonym of ConfirmAction.</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/actionAccessibilityRequirement">http://schema.org/actionAccessibilityRequirement</a>
		 */
		public ActionAccessibilityRequirement getActionAccessibilityRequirement();
		public void setActionAccessibilityRequirement(ActionAccessibilityRequirement actionAccessibilityRequirement);

		/**
		 * @see <a href="http://schema.org/expectsAcceptanceOf">http://schema.org/expectsAcceptanceOf</a>
		 */
		public ExpectsAcceptanceOf getExpectsAcceptanceOf();
		public void setExpectsAcceptanceOf(ExpectsAcceptanceOf expectsAcceptanceOf);

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
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/availableLanguage">http://schema.org/availableLanguage</a>
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * @see <a href="http://schema.org/contactOption">http://schema.org/contactOption</a>
		 */
		public Container.ContactOption getContactOption();
		public void setContactOption(Container.ContactOption contactOption);

		/**
		 * @see <a href="http://schema.org/contactType">http://schema.org/contactType</a>
		 */
		public Container.ContactType getContactType();
		public void setContactType(Container.ContactType contactType);

		/**
		 * @see <a href="http://schema.org/email">http://schema.org/email</a>
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * @see <a href="http://schema.org/faxNumber">http://schema.org/faxNumber</a>
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * @see <a href="http://schema.org/hoursAvailable">http://schema.org/hoursAvailable</a>
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * @see <a href="http://schema.org/productSupported">http://schema.org/productSupported</a>
		 */
		public Container.ProductSupported getProductSupported();
		public void setProductSupported(Container.ProductSupported productSupported);

		/**
		 * @see <a href="http://schema.org/telephone">http://schema.org/telephone</a>
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
		 * @see <a href="http://schema.org/foodEstablishment">http://schema.org/foodEstablishment</a>
		 */
		public Container.FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(Container.FoodEstablishment foodEstablishment);

		/**
		 * @see <a href="http://schema.org/foodEvent">http://schema.org/foodEvent</a>
		 */
		public Container.FoodEvent getFoodEvent();
		public void setFoodEvent(Container.FoodEvent foodEvent);

		/**
		 * @see <a href="http://schema.org/recipe">http://schema.org/recipe</a>
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
		 * @see <a href="http://schema.org/tickerSymbol">http://schema.org/tickerSymbol</a>
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
		 * @see <a href="http://schema.org/courseCode">http://schema.org/courseCode</a>
		 */
		public Container.CourseCode getCourseCode();
		public void setCourseCode(Container.CourseCode courseCode);

		/**
		 * @see <a href="http://schema.org/coursePrerequisites">http://schema.org/coursePrerequisites</a>
		 */
		public Container.CoursePrerequisites getCoursePrerequisites();
		public void setCoursePrerequisites(Container.CoursePrerequisites coursePrerequisites);

		/**
		 * @see <a href="http://schema.org/educationalCredentialAwarded">http://schema.org/educationalCredentialAwarded</a>
		 */
		public EducationalCredentialAwarded getEducationalCredentialAwarded();
		public void setEducationalCredentialAwarded(EducationalCredentialAwarded educationalCredentialAwarded);

		/**
		 * @see <a href="http://schema.org/hasCourseInstance">http://schema.org/hasCourseInstance</a>
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
		 * @see <a href="http://schema.org/courseMode">http://schema.org/courseMode</a>
		 */
		public Container.CourseMode getCourseMode();
		public void setCourseMode(Container.CourseMode courseMode);

		/**
		 * @see <a href="http://schema.org/instructor">http://schema.org/instructor</a>
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
		 * @see <a href="http://schema.org/about">http://schema.org/about</a>
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * @see <a href="http://schema.org/accessMode">http://schema.org/accessMode</a>
		 */
		public Container.AccessMode getAccessMode();
		public void setAccessMode(Container.AccessMode accessMode);

		/**
		 * @see <a href="http://schema.org/accessModeSufficient">http://schema.org/accessModeSufficient</a>
		 */
		public Container.AccessModeSufficient getAccessModeSufficient();
		public void setAccessModeSufficient(Container.AccessModeSufficient accessModeSufficient);

		/**
		 * @see <a href="http://schema.org/accessibilityAPI">http://schema.org/accessibilityAPI</a>
		 */
		public Container.AccessibilityAPI getAccessibilityAPI();
		public void setAccessibilityAPI(Container.AccessibilityAPI accessibilityAPI);

		/**
		 * @see <a href="http://schema.org/accessibilityControl">http://schema.org/accessibilityControl</a>
		 */
		public Container.AccessibilityControl getAccessibilityControl();
		public void setAccessibilityControl(Container.AccessibilityControl accessibilityControl);

		/**
		 * @see <a href="http://schema.org/accessibilityFeature">http://schema.org/accessibilityFeature</a>
		 */
		public Container.AccessibilityFeature getAccessibilityFeature();
		public void setAccessibilityFeature(Container.AccessibilityFeature accessibilityFeature);

		/**
		 * @see <a href="http://schema.org/accessibilityHazard">http://schema.org/accessibilityHazard</a>
		 */
		public Container.AccessibilityHazard getAccessibilityHazard();
		public void setAccessibilityHazard(Container.AccessibilityHazard accessibilityHazard);

		/**
		 * @see <a href="http://schema.org/accessibilitySummary">http://schema.org/accessibilitySummary</a>
		 */
		public Container.AccessibilitySummary getAccessibilitySummary();
		public void setAccessibilitySummary(Container.AccessibilitySummary accessibilitySummary);

		/**
		 * @see <a href="http://schema.org/accountablePerson">http://schema.org/accountablePerson</a>
		 */
		public Container.AccountablePerson getAccountablePerson();
		public void setAccountablePerson(Container.AccountablePerson accountablePerson);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/alternativeHeadline">http://schema.org/alternativeHeadline</a>
		 */
		public Container.AlternativeHeadline getAlternativeHeadline();
		public void setAlternativeHeadline(Container.AlternativeHeadline alternativeHeadline);

		/**
		 * @see <a href="http://schema.org/associatedMedia">http://schema.org/associatedMedia</a>
		 */
		public Container.AssociatedMedia getAssociatedMedia();
		public void setAssociatedMedia(Container.AssociatedMedia associatedMedia);

		/**
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/audio">http://schema.org/audio</a>
		 */
		public Container.Audio getAudio();
		public void setAudio(Container.Audio audio);

		/**
		 * @see <a href="http://schema.org/author">http://schema.org/author</a>
		 */
		public Container.Author getAuthor();
		public void setAuthor(Container.Author author);

		/**
		 * @see <a href="http://schema.org/award">http://schema.org/award</a>
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * @see <a href="http://schema.org/character">http://schema.org/character</a>
		 */
		public Container.Character getCharacter();
		public void setCharacter(Container.Character character);

		/**
		 * @see <a href="http://schema.org/citation">http://schema.org/citation</a>
		 */
		public Container.Citation getCitation();
		public void setCitation(Container.Citation citation);

		/**
		 * @see <a href="http://schema.org/comment">http://schema.org/comment</a>
		 */
		public Container.Comment getComment();
		public void setComment(Container.Comment comment);

		/**
		 * @see <a href="http://schema.org/commentCount">http://schema.org/commentCount</a>
		 */
		public Container.CommentCount getCommentCount();
		public void setCommentCount(Container.CommentCount commentCount);

		/**
		 * @see <a href="http://schema.org/contentLocation">http://schema.org/contentLocation</a>
		 */
		public Container.ContentLocation getContentLocation();
		public void setContentLocation(Container.ContentLocation contentLocation);

		/**
		 * @see <a href="http://schema.org/contentRating">http://schema.org/contentRating</a>
		 */
		public Container.ContentRating getContentRating();
		public void setContentRating(Container.ContentRating contentRating);

		/**
		 * @see <a href="http://schema.org/contentReferenceTime">http://schema.org/contentReferenceTime</a>
		 */
		public ContentReferenceTime getContentReferenceTime();
		public void setContentReferenceTime(ContentReferenceTime contentReferenceTime);

		/**
		 * @see <a href="http://schema.org/contributor">http://schema.org/contributor</a>
		 */
		public Container.Contributor getContributor();
		public void setContributor(Container.Contributor contributor);

		/**
		 * @see <a href="http://schema.org/copyrightHolder">http://schema.org/copyrightHolder</a>
		 */
		public Container.CopyrightHolder getCopyrightHolder();
		public void setCopyrightHolder(Container.CopyrightHolder copyrightHolder);

		/**
		 * @see <a href="http://schema.org/copyrightYear">http://schema.org/copyrightYear</a>
		 */
		public Container.CopyrightYear getCopyrightYear();
		public void setCopyrightYear(Container.CopyrightYear copyrightYear);

		/**
		 * @see <a href="http://schema.org/correction">http://schema.org/correction</a>
		 */
		public Correction getCorrection();
		public void setCorrection(Correction correction);

		/**
		 * @see <a href="http://schema.org/creator">http://schema.org/creator</a>
		 */
		public Container.Creator getCreator();
		public void setCreator(Container.Creator creator);

		/**
		 * @see <a href="http://schema.org/dateCreated">http://schema.org/dateCreated</a>
		 */
		public Container.DateCreated getDateCreated();
		public void setDateCreated(Container.DateCreated dateCreated);

		/**
		 * @see <a href="http://schema.org/dateModified">http://schema.org/dateModified</a>
		 */
		public Container.DateModified getDateModified();
		public void setDateModified(Container.DateModified dateModified);

		/**
		 * @see <a href="http://schema.org/datePublished">http://schema.org/datePublished</a>
		 */
		public Container.DatePublished getDatePublished();
		public void setDatePublished(Container.DatePublished datePublished);

		/**
		 * @see <a href="http://schema.org/discussionUrl">http://schema.org/discussionUrl</a>
		 */
		public Container.DiscussionUrl getDiscussionUrl();
		public void setDiscussionUrl(Container.DiscussionUrl discussionUrl);

		/**
		 * @see <a href="http://schema.org/editor">http://schema.org/editor</a>
		 */
		public Container.Editor getEditor();
		public void setEditor(Container.Editor editor);

		/**
		 * @see <a href="http://schema.org/educationalAlignment">http://schema.org/educationalAlignment</a>
		 */
		public Container.EducationalAlignment getEducationalAlignment();
		public void setEducationalAlignment(Container.EducationalAlignment educationalAlignment);

		/**
		 * @see <a href="http://schema.org/educationalUse">http://schema.org/educationalUse</a>
		 */
		public Container.EducationalUse getEducationalUse();
		public void setEducationalUse(Container.EducationalUse educationalUse);

		/**
		 * @see <a href="http://schema.org/encoding">http://schema.org/encoding</a>
		 */
		public Container.Encoding getEncoding();
		public void setEncoding(Container.Encoding encoding);

		/**
		 * @see <a href="http://schema.org/encodingFormat">http://schema.org/encodingFormat</a>
		 */
		public Container.EncodingFormat getEncodingFormat();
		public void setEncodingFormat(Container.EncodingFormat encodingFormat);

		/**
		 * @see <a href="http://schema.org/exampleOfWork">http://schema.org/exampleOfWork</a>
		 */
		public Container.ExampleOfWork getExampleOfWork();
		public void setExampleOfWork(Container.ExampleOfWork exampleOfWork);

		/**
		 * @see <a href="http://schema.org/expires">http://schema.org/expires</a>
		 */
		public Container.Expires getExpires();
		public void setExpires(Container.Expires expires);

		/**
		 * @see <a href="http://schema.org/funder">http://schema.org/funder</a>
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * @see <a href="http://schema.org/genre">http://schema.org/genre</a>
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * @see <a href="http://schema.org/hasPart">http://schema.org/hasPart</a>
		 */
		public Container.HasPart getHasPart();
		public void setHasPart(Container.HasPart hasPart);

		/**
		 * @see <a href="http://schema.org/headline">http://schema.org/headline</a>
		 */
		public Container.Headline getHeadline();
		public void setHeadline(Container.Headline headline);

		/**
		 * @see <a href="http://schema.org/inLanguage">http://schema.org/inLanguage</a>
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * @see <a href="http://schema.org/interactionStatistic">http://schema.org/interactionStatistic</a>
		 */
		public Container.InteractionStatistic getInteractionStatistic();
		public void setInteractionStatistic(Container.InteractionStatistic interactionStatistic);

		/**
		 * @see <a href="http://schema.org/interactivityType">http://schema.org/interactivityType</a>
		 */
		public Container.InteractivityType getInteractivityType();
		public void setInteractivityType(Container.InteractivityType interactivityType);

		/**
		 * @see <a href="http://schema.org/isAccessibleForFree">http://schema.org/isAccessibleForFree</a>
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * @see <a href="http://schema.org/isBasedOn">http://schema.org/isBasedOn</a>
		 */
		public Container.IsBasedOn getIsBasedOn();
		public void setIsBasedOn(Container.IsBasedOn isBasedOn);

		/**
		 * @see <a href="http://schema.org/isFamilyFriendly">http://schema.org/isFamilyFriendly</a>
		 */
		public Container.IsFamilyFriendly getIsFamilyFriendly();
		public void setIsFamilyFriendly(Container.IsFamilyFriendly isFamilyFriendly);

		/**
		 * @see <a href="http://schema.org/isPartOf">http://schema.org/isPartOf</a>
		 */
		public Container.IsPartOf getIsPartOf();
		public void setIsPartOf(Container.IsPartOf isPartOf);

		/**
		 * @see <a href="http://schema.org/keywords">http://schema.org/keywords</a>
		 */
		public Container.Keywords getKeywords();
		public void setKeywords(Container.Keywords keywords);

		/**
		 * @see <a href="http://schema.org/learningResourceType">http://schema.org/learningResourceType</a>
		 */
		public Container.LearningResourceType getLearningResourceType();
		public void setLearningResourceType(Container.LearningResourceType learningResourceType);

		/**
		 * @see <a href="http://schema.org/license">http://schema.org/license</a>
		 */
		public Container.License getLicense();
		public void setLicense(Container.License license);

		/**
		 * @see <a href="http://schema.org/locationCreated">http://schema.org/locationCreated</a>
		 */
		public Container.LocationCreated getLocationCreated();
		public void setLocationCreated(Container.LocationCreated locationCreated);

		/**
		 * @see <a href="http://schema.org/mainEntity">http://schema.org/mainEntity</a>
		 */
		public Container.MainEntity getMainEntity();
		public void setMainEntity(Container.MainEntity mainEntity);

		/**
		 * @see <a href="http://schema.org/material">http://schema.org/material</a>
		 */
		public Container.Material getMaterial();
		public void setMaterial(Container.Material material);

		/**
		 * @see <a href="http://schema.org/mentions">http://schema.org/mentions</a>
		 */
		public Container.Mentions getMentions();
		public void setMentions(Container.Mentions mentions);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/position">http://schema.org/position</a>
		 */
		public Container.Position getPosition();
		public void setPosition(Container.Position position);

		/**
		 * @see <a href="http://schema.org/producer">http://schema.org/producer</a>
		 */
		public Container.Producer getProducer();
		public void setProducer(Container.Producer producer);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * @see <a href="http://schema.org/publication">http://schema.org/publication</a>
		 */
		public Container.Publication getPublication();
		public void setPublication(Container.Publication publication);

		/**
		 * @see <a href="http://schema.org/publisher">http://schema.org/publisher</a>
		 */
		public Container.Publisher getPublisher();
		public void setPublisher(Container.Publisher publisher);

		/**
		 * @see <a href="http://schema.org/publisherImprint">http://schema.org/publisherImprint</a>
		 */
		public PublisherImprint getPublisherImprint();
		public void setPublisherImprint(PublisherImprint publisherImprint);

		/**
		 * @see <a href="http://schema.org/publishingPrinciples">http://schema.org/publishingPrinciples</a>
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * @see <a href="http://schema.org/recordedAt">http://schema.org/recordedAt</a>
		 */
		public Container.RecordedAt getRecordedAt();
		public void setRecordedAt(Container.RecordedAt recordedAt);

		/**
		 * @see <a href="http://schema.org/releasedEvent">http://schema.org/releasedEvent</a>
		 */
		public Container.ReleasedEvent getReleasedEvent();
		public void setReleasedEvent(Container.ReleasedEvent releasedEvent);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/schemaVersion">http://schema.org/schemaVersion</a>
		 */
		public Container.SchemaVersion getSchemaVersion();
		public void setSchemaVersion(Container.SchemaVersion schemaVersion);

		/**
		 * @see <a href="http://schema.org/sdDatePublished">http://schema.org/sdDatePublished</a>
		 */
		public SdDatePublished getSdDatePublished();
		public void setSdDatePublished(SdDatePublished sdDatePublished);

		/**
		 * @see <a href="http://schema.org/sdLicense">http://schema.org/sdLicense</a>
		 */
		public SdLicense getSdLicense();
		public void setSdLicense(SdLicense sdLicense);

		/**
		 * @see <a href="http://schema.org/sdPublisher">http://schema.org/sdPublisher</a>
		 */
		public SdPublisher getSdPublisher();
		public void setSdPublisher(SdPublisher sdPublisher);

		/**
		 * @see <a href="http://schema.org/sourceOrganization">http://schema.org/sourceOrganization</a>
		 */
		public Container.SourceOrganization getSourceOrganization();
		public void setSourceOrganization(Container.SourceOrganization sourceOrganization);

		/**
		 * @see <a href="http://schema.org/spatialCoverage">http://schema.org/spatialCoverage</a>
		 */
		public Container.SpatialCoverage getSpatialCoverage();
		public void setSpatialCoverage(Container.SpatialCoverage spatialCoverage);

		/**
		 * @see <a href="http://schema.org/sponsor">http://schema.org/sponsor</a>
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * @see <a href="http://schema.org/temporalCoverage">http://schema.org/temporalCoverage</a>
		 */
		public Container.TemporalCoverage getTemporalCoverage();
		public void setTemporalCoverage(Container.TemporalCoverage temporalCoverage);

		/**
		 * @see <a href="http://schema.org/text">http://schema.org/text</a>
		 */
		public Container.Text getText();
		public void setText(Container.Text text);

		/**
		 * @see <a href="http://schema.org/thumbnailUrl">http://schema.org/thumbnailUrl</a>
		 */
		public Container.ThumbnailUrl getThumbnailUrl();
		public void setThumbnailUrl(Container.ThumbnailUrl thumbnailUrl);

		/**
		 * @see <a href="http://schema.org/timeRequired">http://schema.org/timeRequired</a>
		 */
		public Container.TimeRequired getTimeRequired();
		public void setTimeRequired(Container.TimeRequired timeRequired);

		/**
		 * @see <a href="http://schema.org/translationOfWork">http://schema.org/translationOfWork</a>
		 */
		public TranslationOfWork getTranslationOfWork();
		public void setTranslationOfWork(TranslationOfWork translationOfWork);

		/**
		 * @see <a href="http://schema.org/translator">http://schema.org/translator</a>
		 */
		public Container.Translator getTranslator();
		public void setTranslator(Container.Translator translator);

		/**
		 * @see <a href="http://schema.org/typicalAgeRange">http://schema.org/typicalAgeRange</a>
		 */
		public Container.TypicalAgeRange getTypicalAgeRange();
		public void setTypicalAgeRange(Container.TypicalAgeRange typicalAgeRange);

		/**
		 * @see <a href="http://schema.org/version">http://schema.org/version</a>
		 */
		public Container.Version getVersion();
		public void setVersion(Container.Version version);

		/**
		 * @see <a href="http://schema.org/video">http://schema.org/video</a>
		 */
		public Container.Video getVideo();
		public void setVideo(Container.Video video);

		/**
		 * @see <a href="http://schema.org/workExample">http://schema.org/workExample</a>
		 */
		public Container.WorkExample getWorkExample();
		public void setWorkExample(Container.WorkExample workExample);

		/**
		 * @see <a href="http://schema.org/workTranslation">http://schema.org/workTranslation</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/endDate">http://schema.org/endDate</a>
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * @see <a href="http://schema.org/episode">http://schema.org/episode</a>
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * @see <a href="http://schema.org/numberOfEpisodes">http://schema.org/numberOfEpisodes</a>
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * @see <a href="http://schema.org/partOfSeries">http://schema.org/partOfSeries</a>
		 */
		public Container.PartOfSeries getPartOfSeries();
		public void setPartOfSeries(Container.PartOfSeries partOfSeries);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/seasonNumber">http://schema.org/seasonNumber</a>
		 */
		public Container.SeasonNumber getSeasonNumber();
		public void setSeasonNumber(Container.SeasonNumber seasonNumber);

		/**
		 * @see <a href="http://schema.org/startDate">http://schema.org/startDate</a>
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
			+ " radio and games).<br/><br/>\n\nSpecific subtypes are available for describing"
			+ " <a class=\"localLink\" href=\"http://schema.org/TVSeries\">TVSeries</a>, <a"
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
			+ " practical subtypes.<br/><br/>\n\nIt is common for properties applicable to an"
			+ " item from the series to be usefully applied to the containing group. Schema.org"
			+ " attempts to anticipate some of these cases, but publishers should be free to"
			+ " apply properties of the series parts to the series as a whole wherever they"
			+ " seem appropriate.")
	@CamelizedName("creativeWorkSeries")
	@ConstantizedName("CREATIVE_WORK_SERIES")
	public interface CreativeWorkSeries extends CreativeWork, SchemaOrgClass, Series {

		/**
		 * @see <a href="http://schema.org/endDate">http://schema.org/endDate</a>
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * @see <a href="http://schema.org/issn">http://schema.org/issn</a>
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		/**
		 * @see <a href="http://schema.org/startDate">http://schema.org/startDate</a>
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
			+ "A card payment method of a particular brand or name.  Used to mark up a"
			+ " particular payment method and/or the financial product/service that supplies"
			+ " the card account.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#AmericanExpress</li>\n<li>http://purl.org/goodrelations/v1#DinersClub</li>\n<li>http://purl.org/goodrelations/v1#Discover</li>\n<li>http://purl.org/goodrelations/v1#JCB</li>\n<li>http://purl.org/goodrelations/v1#MasterCard</li>\n<li>http://purl.org/goodrelations/v1#VISA</li>\n</ul>\n")
	@CamelizedName("creditCard")
	@ConstantizedName("CREDIT_CARD")
	public interface CreditCard extends LoanOrCredit, PaymentCard, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/monthlyMinimumRepaymentAmount">http://schema.org/monthlyMinimumRepaymentAmount</a>
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
		 * @see <a href="http://schema.org/dataset">http://schema.org/dataset</a>
		 */
		public Container.Dataset getDataset();
		public void setDataset(Container.Dataset dataset);

		/**
		 * @see <a href="http://schema.org/measurementTechnique">http://schema.org/measurementTechnique</a>
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
		 * @see <a href="http://schema.org/measurementTechnique">http://schema.org/measurementTechnique</a>
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
		 * @see <a href="http://schema.org/dataFeedElement">http://schema.org/dataFeedElement</a>
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
		 * @see <a href="http://schema.org/dateCreated">http://schema.org/dateCreated</a>
		 */
		public Container.DateCreated getDateCreated();
		public void setDateCreated(Container.DateCreated dateCreated);

		/**
		 * @see <a href="http://schema.org/dateDeleted">http://schema.org/dateDeleted</a>
		 */
		public Container.DateDeleted getDateDeleted();
		public void setDateDeleted(Container.DateDeleted dateDeleted);

		/**
		 * @see <a href="http://schema.org/dateModified">http://schema.org/dateModified</a>
		 */
		public Container.DateModified getDateModified();
		public void setDateModified(Container.DateModified dateModified);

		/**
		 * @see <a href="http://schema.org/item">http://schema.org/item</a>
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
		 * @see <a href="http://schema.org/distribution">http://schema.org/distribution</a>
		 */
		public Container.Distribution getDistribution();
		public void setDistribution(Container.Distribution distribution);

		/**
		 * @see <a href="http://schema.org/includedInDataCatalog">http://schema.org/includedInDataCatalog</a>
		 */
		public Container.IncludedInDataCatalog getIncludedInDataCatalog();
		public void setIncludedInDataCatalog(Container.IncludedInDataCatalog includedInDataCatalog);

		/**
		 * @see <a href="http://schema.org/issn">http://schema.org/issn</a>
		 */
		public Container.Issn getIssn();
		public void setIssn(Container.Issn issn);

		/**
		 * @see <a href="http://schema.org/measurementTechnique">http://schema.org/measurementTechnique</a>
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		/**
		 * @see <a href="http://schema.org/variableMeasured">http://schema.org/variableMeasured</a>
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
			+ " OpeningHoursSpecification refer.<br/><br/>\n\nOriginally, URLs from <a"
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
		 * @see <a href="http://schema.org/appliesToDeliveryMethod">http://schema.org/appliesToDeliveryMethod</a>
		 */
		public Container.AppliesToDeliveryMethod getAppliesToDeliveryMethod();
		public void setAppliesToDeliveryMethod(Container.AppliesToDeliveryMethod appliesToDeliveryMethod);

		/**
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/eligibleRegion">http://schema.org/eligibleRegion</a>
		 */
		public EligibleRegion getEligibleRegion();
		public void setEligibleRegion(EligibleRegion eligibleRegion);

		/**
		 * @see <a href="http://schema.org/ineligibleRegion">http://schema.org/ineligibleRegion</a>
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
		 * @see <a href="http://schema.org/accessCode">http://schema.org/accessCode</a>
		 */
		public Container.AccessCode getAccessCode();
		public void setAccessCode(Container.AccessCode accessCode);

		/**
		 * @see <a href="http://schema.org/availableFrom">http://schema.org/availableFrom</a>
		 */
		public Container.AvailableFrom getAvailableFrom();
		public void setAvailableFrom(Container.AvailableFrom availableFrom);

		/**
		 * @see <a href="http://schema.org/availableThrough">http://schema.org/availableThrough</a>
		 */
		public Container.AvailableThrough getAvailableThrough();
		public void setAvailableThrough(Container.AvailableThrough availableThrough);

		/**
		 * @see <a href="http://schema.org/hasDeliveryMethod">http://schema.org/hasDeliveryMethod</a>
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
			+ "A delivery method is a standardized procedure for transferring the product or"
			+ " service to the destination of fulfillment chosen by the customer. Delivery"
			+ " methods are characterized by the means of transportation used, and by the"
			+ " organization or group that is the contracting party for the sending"
			+ " organization or person.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#DeliveryModeDirectDownload</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeFreight</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeMail</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModeOwnFleet</li>\n<li>http://purl.org/goodrelations/v1#DeliveryModePickUp</li>\n<li>http://purl.org/goodrelations/v1#DHL</li>\n<li>http://purl.org/goodrelations/v1#FederalExpress</li>\n<li>http://purl.org/goodrelations/v1#UPS</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/acceptedPaymentMethod">http://schema.org/acceptedPaymentMethod</a>
		 */
		public Container.AcceptedPaymentMethod getAcceptedPaymentMethod();
		public void setAcceptedPaymentMethod(Container.AcceptedPaymentMethod acceptedPaymentMethod);

		/**
		 * @see <a href="http://schema.org/advanceBookingRequirement">http://schema.org/advanceBookingRequirement</a>
		 */
		public Container.AdvanceBookingRequirement getAdvanceBookingRequirement();
		public void setAdvanceBookingRequirement(Container.AdvanceBookingRequirement advanceBookingRequirement);

		/**
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/availability">http://schema.org/availability</a>
		 */
		public Container.Availability getAvailability();
		public void setAvailability(Container.Availability availability);

		/**
		 * @see <a href="http://schema.org/availabilityEnds">http://schema.org/availabilityEnds</a>
		 */
		public AvailabilityEnds getAvailabilityEnds();
		public void setAvailabilityEnds(AvailabilityEnds availabilityEnds);

		/**
		 * @see <a href="http://schema.org/availabilityStarts">http://schema.org/availabilityStarts</a>
		 */
		public AvailabilityStarts getAvailabilityStarts();
		public void setAvailabilityStarts(AvailabilityStarts availabilityStarts);

		/**
		 * @see <a href="http://schema.org/availableAtOrFrom">http://schema.org/availableAtOrFrom</a>
		 */
		public Container.AvailableAtOrFrom getAvailableAtOrFrom();
		public void setAvailableAtOrFrom(Container.AvailableAtOrFrom availableAtOrFrom);

		/**
		 * @see <a href="http://schema.org/availableDeliveryMethod">http://schema.org/availableDeliveryMethod</a>
		 */
		public Container.AvailableDeliveryMethod getAvailableDeliveryMethod();
		public void setAvailableDeliveryMethod(Container.AvailableDeliveryMethod availableDeliveryMethod);

		/**
		 * @see <a href="http://schema.org/businessFunction">http://schema.org/businessFunction</a>
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * @see <a href="http://schema.org/deliveryLeadTime">http://schema.org/deliveryLeadTime</a>
		 */
		public Container.DeliveryLeadTime getDeliveryLeadTime();
		public void setDeliveryLeadTime(Container.DeliveryLeadTime deliveryLeadTime);

		/**
		 * @see <a href="http://schema.org/eligibleCustomerType">http://schema.org/eligibleCustomerType</a>
		 */
		public Container.EligibleCustomerType getEligibleCustomerType();
		public void setEligibleCustomerType(Container.EligibleCustomerType eligibleCustomerType);

		/**
		 * @see <a href="http://schema.org/eligibleDuration">http://schema.org/eligibleDuration</a>
		 */
		public Container.EligibleDuration getEligibleDuration();
		public void setEligibleDuration(Container.EligibleDuration eligibleDuration);

		/**
		 * @see <a href="http://schema.org/eligibleQuantity">http://schema.org/eligibleQuantity</a>
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * @see <a href="http://schema.org/eligibleRegion">http://schema.org/eligibleRegion</a>
		 */
		public EligibleRegion getEligibleRegion();
		public void setEligibleRegion(EligibleRegion eligibleRegion);

		/**
		 * @see <a href="http://schema.org/eligibleTransactionVolume">http://schema.org/eligibleTransactionVolume</a>
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * @see <a href="http://schema.org/gtin12">http://schema.org/gtin12</a>
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * @see <a href="http://schema.org/gtin13">http://schema.org/gtin13</a>
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * @see <a href="http://schema.org/gtin14">http://schema.org/gtin14</a>
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * @see <a href="http://schema.org/gtin8">http://schema.org/gtin8</a>
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * @see <a href="http://schema.org/includesObject">http://schema.org/includesObject</a>
		 */
		public Container.IncludesObject getIncludesObject();
		public void setIncludesObject(Container.IncludesObject includesObject);

		/**
		 * @see <a href="http://schema.org/ineligibleRegion">http://schema.org/ineligibleRegion</a>
		 */
		public Container.IneligibleRegion getIneligibleRegion();
		public void setIneligibleRegion(Container.IneligibleRegion ineligibleRegion);

		/**
		 * @see <a href="http://schema.org/inventoryLevel">http://schema.org/inventoryLevel</a>
		 */
		public Container.InventoryLevel getInventoryLevel();
		public void setInventoryLevel(Container.InventoryLevel inventoryLevel);

		/**
		 * @see <a href="http://schema.org/itemCondition">http://schema.org/itemCondition</a>
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * @see <a href="http://schema.org/itemOffered">http://schema.org/itemOffered</a>
		 */
		public Container.ItemOffered getItemOffered();
		public void setItemOffered(Container.ItemOffered itemOffered);

		/**
		 * @see <a href="http://schema.org/mpn">http://schema.org/mpn</a>
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * @see <a href="http://schema.org/priceSpecification">http://schema.org/priceSpecification</a>
		 */
		public Container.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Container.PriceSpecification priceSpecification);

		/**
		 * @see <a href="http://schema.org/seller">http://schema.org/seller</a>
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * @see <a href="http://schema.org/serialNumber">http://schema.org/serialNumber</a>
		 */
		public Container.SerialNumber getSerialNumber();
		public void setSerialNumber(Container.SerialNumber serialNumber);

		/**
		 * @see <a href="http://schema.org/sku">http://schema.org/sku</a>
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * @see <a href="http://schema.org/warranty">http://schema.org/warranty</a>
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
		 * @see <a href="http://schema.org/hasDigitalDocumentPermission">http://schema.org/hasDigitalDocumentPermission</a>
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
		 * @see <a href="http://schema.org/grantee">http://schema.org/grantee</a>
		 */
		public Container.Grantee getGrantee();
		public void setGrantee(Container.Grantee grantee);

		/**
		 * @see <a href="http://schema.org/permissionType">http://schema.org/permissionType</a>
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
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/educationalRole">http://schema.org/educationalRole</a>
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
		 * @see <a href="http://schema.org/alumni">http://schema.org/alumni</a>
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
		 * @see <a href="http://schema.org/baseSalary">http://schema.org/baseSalary</a>
		 */
		public Container.BaseSalary getBaseSalary();
		public void setBaseSalary(Container.BaseSalary baseSalary);

		/**
		 * @see <a href="http://schema.org/salaryCurrency">http://schema.org/salaryCurrency</a>
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
		 * @see <a href="http://schema.org/endorsee">http://schema.org/endorsee</a>
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
		 * @see <a href="http://schema.org/engineDisplacement">http://schema.org/engineDisplacement</a>
		 */
		public EngineDisplacement getEngineDisplacement();
		public void setEngineDisplacement(EngineDisplacement engineDisplacement);

		/**
		 * @see <a href="http://schema.org/enginePower">http://schema.org/enginePower</a>
		 */
		public EnginePower getEnginePower();
		public void setEnginePower(EnginePower enginePower);

		/**
		 * @see <a href="http://schema.org/engineType">http://schema.org/engineType</a>
		 */
		public EngineType getEngineType();
		public void setEngineType(EngineType engineType);

		/**
		 * @see <a href="http://schema.org/fuelType">http://schema.org/fuelType</a>
		 */
		public Container.FuelType getFuelType();
		public void setFuelType(Container.FuelType fuelType);

		/**
		 * @see <a href="http://schema.org/torque">http://schema.org/torque</a>
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
		 * @see <a href="http://schema.org/actionApplication">http://schema.org/actionApplication</a>
		 */
		public Container.ActionApplication getActionApplication();
		public void setActionApplication(Container.ActionApplication actionApplication);

		/**
		 * @see <a href="http://schema.org/actionPlatform">http://schema.org/actionPlatform</a>
		 */
		public Container.ActionPlatform getActionPlatform();
		public void setActionPlatform(Container.ActionPlatform actionPlatform);

		/**
		 * @see <a href="http://schema.org/contentType">http://schema.org/contentType</a>
		 */
		public Container.ContentType getContentType();
		public void setContentType(Container.ContentType contentType);

		/**
		 * @see <a href="http://schema.org/encodingType">http://schema.org/encodingType</a>
		 */
		public Container.EncodingType getEncodingType();
		public void setEncodingType(Container.EncodingType encodingType);

		/**
		 * @see <a href="http://schema.org/httpMethod">http://schema.org/httpMethod</a>
		 */
		public Container.HttpMethod getHttpMethod();
		public void setHttpMethod(Container.HttpMethod httpMethod);

		/**
		 * @see <a href="http://schema.org/urlTemplate">http://schema.org/urlTemplate</a>
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
		 * @see <a href="http://schema.org/supersededBy">http://schema.org/supersededBy</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/episodeNumber">http://schema.org/episodeNumber</a>
		 */
		public Container.EpisodeNumber getEpisodeNumber();
		public void setEpisodeNumber(Container.EpisodeNumber episodeNumber);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/partOfSeason">http://schema.org/partOfSeason</a>
		 */
		public Container.PartOfSeason getPartOfSeason();
		public void setPartOfSeason(Container.PartOfSeason partOfSeason);

		/**
		 * @see <a href="http://schema.org/partOfSeries">http://schema.org/partOfSeries</a>
		 */
		public Container.PartOfSeries getPartOfSeries();
		public void setPartOfSeries(Container.PartOfSeries partOfSeries);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/about">http://schema.org/about</a>
		 */
		public Container.About getAbout();
		public void setAbout(Container.About about);

		/**
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/attendee">http://schema.org/attendee</a>
		 */
		public Container.Attendee getAttendee();
		public void setAttendee(Container.Attendee attendee);

		/**
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/composer">http://schema.org/composer</a>
		 */
		public Container.Composer getComposer();
		public void setComposer(Container.Composer composer);

		/**
		 * @see <a href="http://schema.org/contributor">http://schema.org/contributor</a>
		 */
		public Container.Contributor getContributor();
		public void setContributor(Container.Contributor contributor);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/doorTime">http://schema.org/doorTime</a>
		 */
		public Container.DoorTime getDoorTime();
		public void setDoorTime(Container.DoorTime doorTime);

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.pending.Container.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.pending.Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/endDate">http://schema.org/endDate</a>
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * @see <a href="http://schema.org/eventStatus">http://schema.org/eventStatus</a>
		 */
		public Container.EventStatus getEventStatus();
		public void setEventStatus(Container.EventStatus eventStatus);

		/**
		 * @see <a href="http://schema.org/funder">http://schema.org/funder</a>
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * @see <a href="http://schema.org/inLanguage">http://schema.org/inLanguage</a>
		 */
		public Container.InLanguage getInLanguage();
		public void setInLanguage(Container.InLanguage inLanguage);

		/**
		 * @see <a href="http://schema.org/isAccessibleForFree">http://schema.org/isAccessibleForFree</a>
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * @see <a href="http://schema.org/location">http://schema.org/location</a>
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * @see <a href="http://schema.org/maximumAttendeeCapacity">http://schema.org/maximumAttendeeCapacity</a>
		 */
		public Container.MaximumAttendeeCapacity getMaximumAttendeeCapacity();
		public void setMaximumAttendeeCapacity(Container.MaximumAttendeeCapacity maximumAttendeeCapacity);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/organizer">http://schema.org/organizer</a>
		 */
		public Container.Organizer getOrganizer();
		public void setOrganizer(Container.Organizer organizer);

		/**
		 * @see <a href="http://schema.org/performer">http://schema.org/performer</a>
		 */
		public Container.Performer getPerformer();
		public void setPerformer(Container.Performer performer);

		/**
		 * @see <a href="http://schema.org/previousStartDate">http://schema.org/previousStartDate</a>
		 */
		public Container.PreviousStartDate getPreviousStartDate();
		public void setPreviousStartDate(Container.PreviousStartDate previousStartDate);

		/**
		 * @see <a href="http://schema.org/recordedIn">http://schema.org/recordedIn</a>
		 */
		public Container.RecordedIn getRecordedIn();
		public void setRecordedIn(Container.RecordedIn recordedIn);

		/**
		 * @see <a href="http://schema.org/remainingAttendeeCapacity">http://schema.org/remainingAttendeeCapacity</a>
		 */
		public Container.RemainingAttendeeCapacity getRemainingAttendeeCapacity();
		public void setRemainingAttendeeCapacity(Container.RemainingAttendeeCapacity remainingAttendeeCapacity);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/sponsor">http://schema.org/sponsor</a>
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * @see <a href="http://schema.org/startDate">http://schema.org/startDate</a>
		 */
		public Container.StartDate getStartDate();
		public void setStartDate(Container.StartDate startDate);

		/**
		 * @see <a href="http://schema.org/subEvent">http://schema.org/subEvent</a>
		 */
		public Container.SubEvent getSubEvent();
		public void setSubEvent(Container.SubEvent subEvent);

		/**
		 * @see <a href="http://schema.org/superEvent">http://schema.org/superEvent</a>
		 */
		public Container.SuperEvent getSuperEvent();
		public void setSuperEvent(Container.SuperEvent superEvent);

		/**
		 * @see <a href="http://schema.org/translator">http://schema.org/translator</a>
		 */
		public Container.Translator getTranslator();
		public void setTranslator(Container.Translator translator);

		/**
		 * @see <a href="http://schema.org/typicalAgeRange">http://schema.org/typicalAgeRange</a>
		 */
		public Container.TypicalAgeRange getTypicalAgeRange();
		public void setTypicalAgeRange(Container.TypicalAgeRange typicalAgeRange);

		/**
		 * @see <a href="http://schema.org/workFeatured">http://schema.org/workFeatured</a>
		 */
		public Container.WorkFeatured getWorkFeatured();
		public void setWorkFeatured(Container.WorkFeatured workFeatured);

		/**
		 * @see <a href="http://schema.org/workPerformed">http://schema.org/workPerformed</a>
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
			+ " lecture.<br/><br/>\n\nNote: This type is for information about actual"
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
		 * @see <a href="http://schema.org/diet">http://schema.org/diet</a>
		 */
		public Diet getDiet();
		public void setDiet(Diet diet);

		/**
		 * @see <a href="http://schema.org/distance">http://schema.org/distance</a>
		 */
		public Container.Distance getDistance();
		public void setDistance(Container.Distance distance);

		/**
		 * @see <a href="http://schema.org/exerciseCourse">http://schema.org/exerciseCourse</a>
		 */
		public Container.ExerciseCourse getExerciseCourse();
		public void setExerciseCourse(Container.ExerciseCourse exerciseCourse);

		/**
		 * @see <a href="http://schema.org/exercisePlan">http://schema.org/exercisePlan</a>
		 */
		public ExercisePlan getExercisePlan();
		public void setExercisePlan(ExercisePlan exercisePlan);

		/**
		 * @see <a href="http://schema.org/exerciseRelatedDiet">http://schema.org/exerciseRelatedDiet</a>
		 */
		public ExerciseRelatedDiet getExerciseRelatedDiet();
		public void setExerciseRelatedDiet(ExerciseRelatedDiet exerciseRelatedDiet);

		/**
		 * @see <a href="http://schema.org/exerciseType">http://schema.org/exerciseType</a>
		 */
		public ExerciseType getExerciseType();
		public void setExerciseType(ExerciseType exerciseType);

		/**
		 * @see <a href="http://schema.org/fromLocation">http://schema.org/fromLocation</a>
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * @see <a href="http://schema.org/opponent">http://schema.org/opponent</a>
		 */
		public Container.Opponent getOpponent();
		public void setOpponent(Container.Opponent opponent);

		/**
		 * @see <a href="http://schema.org/sportsActivityLocation">http://schema.org/sportsActivityLocation</a>
		 */
		public Container.SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(Container.SportsActivityLocation sportsActivityLocation);

		/**
		 * @see <a href="http://schema.org/sportsEvent">http://schema.org/sportsEvent</a>
		 */
		public Container.SportsEvent getSportsEvent();
		public void setSportsEvent(Container.SportsEvent sportsEvent);

		/**
		 * @see <a href="http://schema.org/sportsTeam">http://schema.org/sportsTeam</a>
		 */
		public Container.SportsTeam getSportsTeam();
		public void setSportsTeam(Container.SportsTeam sportsTeam);

		/**
		 * @see <a href="http://schema.org/toLocation">http://schema.org/toLocation</a>
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
		 * @see <a href="http://schema.org/annualPercentageRate">http://schema.org/annualPercentageRate</a>
		 */
		public Container.AnnualPercentageRate getAnnualPercentageRate();
		public void setAnnualPercentageRate(Container.AnnualPercentageRate annualPercentageRate);

		/**
		 * @see <a href="http://schema.org/feesAndCommissionsSpecification">http://schema.org/feesAndCommissionsSpecification</a>
		 */
		public Container.FeesAndCommissionsSpecification getFeesAndCommissionsSpecification();
		public void setFeesAndCommissionsSpecification(Container.FeesAndCommissionsSpecification feesAndCommissionsSpecification);

		/**
		 * @see <a href="http://schema.org/interestRate">http://schema.org/interestRate</a>
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
		 * @see <a href="http://schema.org/feesAndCommissionsSpecification">http://schema.org/feesAndCommissionsSpecification</a>
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
			+ "The act of finding an object.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SearchAction\">SearchAction</a>: FindAction is"
			+ " generally lead by a SearchAction, but not necessarily.</li>\n</ul>\n")
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
	public interface Flight extends SchemaOrgClass, Trip {

		/**
		 * @see <a href="http://schema.org/aircraft">http://schema.org/aircraft</a>
		 */
		public Container.Aircraft getAircraft();
		public void setAircraft(Container.Aircraft aircraft);

		/**
		 * @see <a href="http://schema.org/arrivalAirport">http://schema.org/arrivalAirport</a>
		 */
		public Container.ArrivalAirport getArrivalAirport();
		public void setArrivalAirport(Container.ArrivalAirport arrivalAirport);

		/**
		 * @see <a href="http://schema.org/arrivalGate">http://schema.org/arrivalGate</a>
		 */
		public Container.ArrivalGate getArrivalGate();
		public void setArrivalGate(Container.ArrivalGate arrivalGate);

		/**
		 * @see <a href="http://schema.org/arrivalTerminal">http://schema.org/arrivalTerminal</a>
		 */
		public Container.ArrivalTerminal getArrivalTerminal();
		public void setArrivalTerminal(Container.ArrivalTerminal arrivalTerminal);

		/**
		 * @see <a href="http://schema.org/boardingPolicy">http://schema.org/boardingPolicy</a>
		 */
		public Container.BoardingPolicy getBoardingPolicy();
		public void setBoardingPolicy(Container.BoardingPolicy boardingPolicy);

		/**
		 * @see <a href="http://schema.org/departureAirport">http://schema.org/departureAirport</a>
		 */
		public Container.DepartureAirport getDepartureAirport();
		public void setDepartureAirport(Container.DepartureAirport departureAirport);

		/**
		 * @see <a href="http://schema.org/departureGate">http://schema.org/departureGate</a>
		 */
		public Container.DepartureGate getDepartureGate();
		public void setDepartureGate(Container.DepartureGate departureGate);

		/**
		 * @see <a href="http://schema.org/departureTerminal">http://schema.org/departureTerminal</a>
		 */
		public Container.DepartureTerminal getDepartureTerminal();
		public void setDepartureTerminal(Container.DepartureTerminal departureTerminal);

		/**
		 * @see <a href="http://schema.org/estimatedFlightDuration">http://schema.org/estimatedFlightDuration</a>
		 */
		public Container.EstimatedFlightDuration getEstimatedFlightDuration();
		public void setEstimatedFlightDuration(Container.EstimatedFlightDuration estimatedFlightDuration);

		/**
		 * @see <a href="http://schema.org/flightDistance">http://schema.org/flightDistance</a>
		 */
		public Container.FlightDistance getFlightDistance();
		public void setFlightDistance(Container.FlightDistance flightDistance);

		/**
		 * @see <a href="http://schema.org/flightNumber">http://schema.org/flightNumber</a>
		 */
		public Container.FlightNumber getFlightNumber();
		public void setFlightNumber(Container.FlightNumber flightNumber);

		/**
		 * @see <a href="http://schema.org/mealService">http://schema.org/mealService</a>
		 */
		public Container.MealService getMealService();
		public void setMealService(Container.MealService mealService);

		/**
		 * @see <a href="http://schema.org/seller">http://schema.org/seller</a>
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * @see <a href="http://schema.org/webCheckinTime">http://schema.org/webCheckinTime</a>
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
			+ "A reservation for air travel.<br/><br/>\n\nNote: This type is for information"
			+ " about actual reservations, e.g. in confirmation emails or HTML pages with"
			+ " individual confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("flightReservation")
	@ConstantizedName("FLIGHT_RESERVATION")
	public interface FlightReservation extends Reservation, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/boardingGroup">http://schema.org/boardingGroup</a>
		 */
		public Container.BoardingGroup getBoardingGroup();
		public void setBoardingGroup(Container.BoardingGroup boardingGroup);

		/**
		 * @see <a href="http://schema.org/passengerPriorityStatus">http://schema.org/passengerPriorityStatus</a>
		 */
		public Container.PassengerPriorityStatus getPassengerPriorityStatus();
		public void setPassengerPriorityStatus(Container.PassengerPriorityStatus passengerPriorityStatus);

		/**
		 * @see <a href="http://schema.org/passengerSequenceNumber">http://schema.org/passengerSequenceNumber</a>
		 */
		public Container.PassengerSequenceNumber getPassengerSequenceNumber();
		public void setPassengerSequenceNumber(Container.PassengerSequenceNumber passengerSequenceNumber);

		/**
		 * @see <a href="http://schema.org/securityScreening">http://schema.org/securityScreening</a>
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
			+ "The act of forming a personal connection with someone/something (object)"
			+ " unidirectionally/asymmetrically to get updates polled"
			+ " from.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\""
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
		 * @see <a href="http://schema.org/followee">http://schema.org/followee</a>
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
		 * @see <a href="http://schema.org/acceptsReservations">http://schema.org/acceptsReservations</a>
		 */
		public Container.AcceptsReservations getAcceptsReservations();
		public void setAcceptsReservations(Container.AcceptsReservations acceptsReservations);

		/**
		 * @see <a href="http://schema.org/hasMenu">http://schema.org/hasMenu</a>
		 */
		public Container.HasMenu getHasMenu();
		public void setHasMenu(Container.HasMenu hasMenu);

		/**
		 * @see <a href="http://schema.org/servesCuisine">http://schema.org/servesCuisine</a>
		 */
		public Container.ServesCuisine getServesCuisine();
		public void setServesCuisine(Container.ServesCuisine servesCuisine);

		/**
		 * @see <a href="http://schema.org/starRating">http://schema.org/starRating</a>
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
			+ "A reservation to dine at a food-related business.<br/><br/>\n\nNote: This type"
			+ " is for information about actual reservations, e.g. in confirmation emails or"
			+ " HTML pages with individual confirmations of reservations.")
	@CamelizedName("foodEstablishmentReservation")
	@ConstantizedName("FOOD_ESTABLISHMENT_RESERVATION")
	public interface FoodEstablishmentReservation extends Reservation, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/endTime">http://schema.org/endTime</a>
		 */
		public Container.EndTime getEndTime();
		public void setEndTime(Container.EndTime endTime);

		/**
		 * @see <a href="http://schema.org/partySize">http://schema.org/partySize</a>
		 */
		public Container.PartySize getPartySize();
		public void setPartySize(Container.PartySize partySize);

		/**
		 * @see <a href="http://schema.org/startTime">http://schema.org/startTime</a>
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
		 * @see <a href="http://schema.org/characterAttribute">http://schema.org/characterAttribute</a>
		 */
		public Container.CharacterAttribute getCharacterAttribute();
		public void setCharacterAttribute(Container.CharacterAttribute characterAttribute);

		/**
		 * @see <a href="http://schema.org/gameItem">http://schema.org/gameItem</a>
		 */
		public Container.GameItem getGameItem();
		public void setGameItem(Container.GameItem gameItem);

		/**
		 * @see <a href="http://schema.org/gameLocation">http://schema.org/gameLocation</a>
		 */
		public Container.GameLocation getGameLocation();
		public void setGameLocation(Container.GameLocation gameLocation);

		/**
		 * @see <a href="http://schema.org/numberOfPlayers">http://schema.org/numberOfPlayers</a>
		 */
		public Container.NumberOfPlayers getNumberOfPlayers();
		public void setNumberOfPlayers(Container.NumberOfPlayers numberOfPlayers);

		/**
		 * @see <a href="http://schema.org/quest">http://schema.org/quest</a>
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
		 * @see <a href="http://schema.org/game">http://schema.org/game</a>
		 */
		public Container.Game getGame();
		public void setGame(Container.Game game);

		/**
		 * @see <a href="http://schema.org/playersOnline">http://schema.org/playersOnline</a>
		 */
		public Container.PlayersOnline getPlayersOnline();
		public void setPlayersOnline(Container.PlayersOnline playersOnline);

		/**
		 * @see <a href="http://schema.org/serverStatus">http://schema.org/serverStatus</a>
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
		 * @see <a href="http://schema.org/geoMidpoint">http://schema.org/geoMidpoint</a>
		 */
		public Container.GeoMidpoint getGeoMidpoint();
		public void setGeoMidpoint(Container.GeoMidpoint geoMidpoint);

		/**
		 * @see <a href="http://schema.org/geoRadius">http://schema.org/geoRadius</a>
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
		 * @see <a href="http://schema.org/address">http://schema.org/address</a>
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * @see <a href="http://schema.org/addressCountry">http://schema.org/addressCountry</a>
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * @see <a href="http://schema.org/elevation">http://schema.org/elevation</a>
		 */
		public Container.Elevation getElevation();
		public void setElevation(Container.Elevation elevation);

		/**
		 * @see <a href="http://schema.org/latitude">http://schema.org/latitude</a>
		 */
		public Container.Latitude getLatitude();
		public void setLatitude(Container.Latitude latitude);

		/**
		 * @see <a href="http://schema.org/longitude">http://schema.org/longitude</a>
		 */
		public Container.Longitude getLongitude();
		public void setLongitude(Container.Longitude longitude);

		/**
		 * @see <a href="http://schema.org/postalCode">http://schema.org/postalCode</a>
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
		 * @see <a href="http://schema.org/address">http://schema.org/address</a>
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * @see <a href="http://schema.org/addressCountry">http://schema.org/addressCountry</a>
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * @see <a href="http://schema.org/box">http://schema.org/box</a>
		 */
		public Container.Box getBox();
		public void setBox(Container.Box box);

		/**
		 * @see <a href="http://schema.org/circle">http://schema.org/circle</a>
		 */
		public Container.Circle getCircle();
		public void setCircle(Container.Circle circle);

		/**
		 * @see <a href="http://schema.org/elevation">http://schema.org/elevation</a>
		 */
		public Container.Elevation getElevation();
		public void setElevation(Container.Elevation elevation);

		/**
		 * @see <a href="http://schema.org/line">http://schema.org/line</a>
		 */
		public Container.Line getLine();
		public void setLine(Container.Line line);

		/**
		 * @see <a href="http://schema.org/polygon">http://schema.org/polygon</a>
		 */
		public Container.Polygon getPolygon();
		public void setPolygon(Container.Polygon polygon);

		/**
		 * @see <a href="http://schema.org/postalCode">http://schema.org/postalCode</a>
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
			+ "The act of transferring ownership of an object to a destination. Reciprocal of"
			+ " TakeAction.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/TakeAction\">TakeAction</a>:"
			+ " Reciprocal of GiveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/SendAction\">SendAction</a>: Unlike SendAction,"
			+ " GiveAction implies that ownership is being transferred (e.g. I may send my"
			+ " laptop to you, but that doesn't mean I'm giving it to you).</li>\n</ul>\n")
	@CamelizedName("giveAction")
	@ConstantizedName("GIVE_ACTION")
	public interface GiveAction extends SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/serviceOperator">http://schema.org/serviceOperator</a>
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
			+ "A construction business.<br/><br/>\n\nA HomeAndConstructionBusiness is a <a"
			+ " class=\"localLink\" href=\"http://schema.org/LocalBusiness\">LocalBusiness</a>"
			+ " that provides services around homes and buildings.<br/><br/>\n\nAs a <a"
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
		 * @see <a href="http://schema.org/availableService">http://schema.org/availableService</a>
		 */
		public AvailableService getAvailableService();
		public void setAvailableService(AvailableService availableService);

		/**
		 * @see <a href="http://schema.org/medicalSpecialty">http://schema.org/medicalSpecialty</a>
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
		 * @see <a href="http://schema.org/bed">http://schema.org/bed</a>
		 */
		public Container.Bed getBed();
		public void setBed(Container.Bed bed);

		/**
		 * @see <a href="http://schema.org/occupancy">http://schema.org/occupancy</a>
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
		 * @see <a href="http://schema.org/numberOfRooms">http://schema.org/numberOfRooms</a>
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
		 * @see <a href="http://schema.org/estimatedCost">http://schema.org/estimatedCost</a>
		 */
		public Container.EstimatedCost getEstimatedCost();
		public void setEstimatedCost(Container.EstimatedCost estimatedCost);

		/**
		 * @see <a href="http://schema.org/performTime">http://schema.org/performTime</a>
		 */
		public Container.PerformTime getPerformTime();
		public void setPerformTime(Container.PerformTime performTime);

		/**
		 * @see <a href="http://schema.org/prepTime">http://schema.org/prepTime</a>
		 */
		public Container.PrepTime getPrepTime();
		public void setPrepTime(Container.PrepTime prepTime);

		/**
		 * @see <a href="http://schema.org/step">http://schema.org/step</a>
		 */
		public Container.Step getStep();
		public void setStep(Container.Step step);

		/**
		 * @see <a href="http://schema.org/supply">http://schema.org/supply</a>
		 */
		public Container.Supply getSupply();
		public void setSupply(Container.Supply supply);

		/**
		 * @see <a href="http://schema.org/tool">http://schema.org/tool</a>
		 */
		public Container.Tool getTool();
		public void setTool(Container.Tool tool);

		/**
		 * @see <a href="http://schema.org/totalTime">http://schema.org/totalTime</a>
		 */
		public Container.TotalTime getTotalTime();
		public void setTotalTime(Container.TotalTime totalTime);

		/**
		 * @see <a href="http://schema.org/yield">http://schema.org/yield</a>
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
	public interface HowToDirection extends CreativeWork, ListItem, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/afterMedia">http://schema.org/afterMedia</a>
		 */
		public Container.AfterMedia getAfterMedia();
		public void setAfterMedia(Container.AfterMedia afterMedia);

		/**
		 * @see <a href="http://schema.org/beforeMedia">http://schema.org/beforeMedia</a>
		 */
		public Container.BeforeMedia getBeforeMedia();
		public void setBeforeMedia(Container.BeforeMedia beforeMedia);

		/**
		 * @see <a href="http://schema.org/duringMedia">http://schema.org/duringMedia</a>
		 */
		public Container.DuringMedia getDuringMedia();
		public void setDuringMedia(Container.DuringMedia duringMedia);

		/**
		 * @see <a href="http://schema.org/performTime">http://schema.org/performTime</a>
		 */
		public Container.PerformTime getPerformTime();
		public void setPerformTime(Container.PerformTime performTime);

		/**
		 * @see <a href="http://schema.org/prepTime">http://schema.org/prepTime</a>
		 */
		public Container.PrepTime getPrepTime();
		public void setPrepTime(Container.PrepTime prepTime);

		/**
		 * @see <a href="http://schema.org/supply">http://schema.org/supply</a>
		 */
		public Container.Supply getSupply();
		public void setSupply(Container.Supply supply);

		/**
		 * @see <a href="http://schema.org/tool">http://schema.org/tool</a>
		 */
		public Container.Tool getTool();
		public void setTool(Container.Tool tool);

		/**
		 * @see <a href="http://schema.org/totalTime">http://schema.org/totalTime</a>
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
		 * @see <a href="http://schema.org/requiredQuantity">http://schema.org/requiredQuantity</a>
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
	public interface HowToSection extends CreativeWork, ItemList, ListItem, SchemaOrgClass {

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
	public interface HowToStep extends CreativeWork, ItemList, ListItem, SchemaOrgClass {

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
		 * @see <a href="http://schema.org/estimatedCost">http://schema.org/estimatedCost</a>
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
	public interface HowToTip extends CreativeWork, ListItem, SchemaOrgClass {

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
		 * @see <a href="http://schema.org/caption">http://schema.org/caption</a>
		 */
		public Container.Caption getCaption();
		public void setCaption(Container.Caption caption);

		/**
		 * @see <a href="http://schema.org/exifData">http://schema.org/exifData</a>
		 */
		public Container.ExifData getExifData();
		public void setExifData(Container.ExifData exifData);

		/**
		 * @see <a href="http://schema.org/representativeOfPage">http://schema.org/representativeOfPage</a>
		 */
		public Container.RepresentativeOfPage getRepresentativeOfPage();
		public void setRepresentativeOfPage(Container.RepresentativeOfPage representativeOfPage);

		/**
		 * @see <a href="http://schema.org/thumbnail">http://schema.org/thumbnail</a>
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
		 * @see <a href="http://schema.org/serialNumber">http://schema.org/serialNumber</a>
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
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
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
		 * @see <a href="http://schema.org/toLocation">http://schema.org/toLocation</a>
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
		 * @see <a href="http://schema.org/interactionService">http://schema.org/interactionService</a>
		 */
		public Container.InteractionService getInteractionService();
		public void setInteractionService(Container.InteractionService interactionService);

		/**
		 * @see <a href="http://schema.org/interactionType">http://schema.org/interactionType</a>
		 */
		public Container.InteractionType getInteractionType();
		public void setInteractionType(Container.InteractionType interactionType);

		/**
		 * @see <a href="http://schema.org/userInteractionCount">http://schema.org/userInteractionCount</a>
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
		 * @see <a href="http://schema.org/amount">http://schema.org/amount</a>
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
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
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
		 * @see <a href="http://schema.org/accountId">http://schema.org/accountId</a>
		 */
		public Container.AccountId getAccountId();
		public void setAccountId(Container.AccountId accountId);

		/**
		 * @see <a href="http://schema.org/billingPeriod">http://schema.org/billingPeriod</a>
		 */
		public Container.BillingPeriod getBillingPeriod();
		public void setBillingPeriod(Container.BillingPeriod billingPeriod);

		/**
		 * @see <a href="http://schema.org/broker">http://schema.org/broker</a>
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * @see <a href="http://schema.org/confirmationNumber">http://schema.org/confirmationNumber</a>
		 */
		public Container.ConfirmationNumber getConfirmationNumber();
		public void setConfirmationNumber(Container.ConfirmationNumber confirmationNumber);

		/**
		 * @see <a href="http://schema.org/customer">http://schema.org/customer</a>
		 */
		public Container.Customer getCustomer();
		public void setCustomer(Container.Customer customer);

		/**
		 * @see <a href="http://schema.org/minimumPaymentDue">http://schema.org/minimumPaymentDue</a>
		 */
		public Container.MinimumPaymentDue getMinimumPaymentDue();
		public void setMinimumPaymentDue(Container.MinimumPaymentDue minimumPaymentDue);

		/**
		 * @see <a href="http://schema.org/paymentDueDate">http://schema.org/paymentDueDate</a>
		 */
		public Container.PaymentDueDate getPaymentDueDate();
		public void setPaymentDueDate(Container.PaymentDueDate paymentDueDate);

		/**
		 * @see <a href="http://schema.org/paymentMethod">http://schema.org/paymentMethod</a>
		 */
		public Container.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Container.PaymentMethod paymentMethod);

		/**
		 * @see <a href="http://schema.org/paymentMethodId">http://schema.org/paymentMethodId</a>
		 */
		public Container.PaymentMethodId getPaymentMethodId();
		public void setPaymentMethodId(Container.PaymentMethodId paymentMethodId);

		/**
		 * @see <a href="http://schema.org/paymentStatus">http://schema.org/paymentStatus</a>
		 */
		public Container.PaymentStatus getPaymentStatus();
		public void setPaymentStatus(Container.PaymentStatus paymentStatus);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * @see <a href="http://schema.org/referencesOrder">http://schema.org/referencesOrder</a>
		 */
		public Container.ReferencesOrder getReferencesOrder();
		public void setReferencesOrder(Container.ReferencesOrder referencesOrder);

		/**
		 * @see <a href="http://schema.org/scheduledPaymentDate">http://schema.org/scheduledPaymentDate</a>
		 */
		public Container.ScheduledPaymentDate getScheduledPaymentDate();
		public void setScheduledPaymentDate(Container.ScheduledPaymentDate scheduledPaymentDate);

		/**
		 * @see <a href="http://schema.org/totalPaymentDue">http://schema.org/totalPaymentDue</a>
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
		 * @see <a href="http://schema.org/itemListElement">http://schema.org/itemListElement</a>
		 */
		public Container.ItemListElement getItemListElement();
		public void setItemListElement(Container.ItemListElement itemListElement);

		/**
		 * @see <a href="http://schema.org/itemListOrder">http://schema.org/itemListOrder</a>
		 */
		public Container.ItemListOrder getItemListOrder();
		public void setItemListOrder(Container.ItemListOrder itemListOrder);

		/**
		 * @see <a href="http://schema.org/numberOfItems">http://schema.org/numberOfItems</a>
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
		 * @see <a href="http://schema.org/baseSalary">http://schema.org/baseSalary</a>
		 */
		public Container.BaseSalary getBaseSalary();
		public void setBaseSalary(Container.BaseSalary baseSalary);

		/**
		 * @see <a href="http://schema.org/datePosted">http://schema.org/datePosted</a>
		 */
		public Container.DatePosted getDatePosted();
		public void setDatePosted(Container.DatePosted datePosted);

		/**
		 * @see <a href="http://schema.org/educationRequirements">http://schema.org/educationRequirements</a>
		 */
		public EducationRequirements getEducationRequirements();
		public void setEducationRequirements(EducationRequirements educationRequirements);

		/**
		 * @see <a href="http://schema.org/employmentType">http://schema.org/employmentType</a>
		 */
		public Container.EmploymentType getEmploymentType();
		public void setEmploymentType(Container.EmploymentType employmentType);

		/**
		 * @see <a href="http://schema.org/estimatedSalary">http://schema.org/estimatedSalary</a>
		 */
		public EstimatedSalary getEstimatedSalary();
		public void setEstimatedSalary(EstimatedSalary estimatedSalary);

		/**
		 * @see <a href="http://schema.org/experienceRequirements">http://schema.org/experienceRequirements</a>
		 */
		public ExperienceRequirements getExperienceRequirements();
		public void setExperienceRequirements(ExperienceRequirements experienceRequirements);

		/**
		 * @see <a href="http://schema.org/hiringOrganization">http://schema.org/hiringOrganization</a>
		 */
		public Container.HiringOrganization getHiringOrganization();
		public void setHiringOrganization(Container.HiringOrganization hiringOrganization);

		/**
		 * @see <a href="http://schema.org/incentiveCompensation">http://schema.org/incentiveCompensation</a>
		 */
		public Container.IncentiveCompensation getIncentiveCompensation();
		public void setIncentiveCompensation(Container.IncentiveCompensation incentiveCompensation);

		/**
		 * @see <a href="http://schema.org/industry">http://schema.org/industry</a>
		 */
		public Container.Industry getIndustry();
		public void setIndustry(Container.Industry industry);

		/**
		 * @see <a href="http://schema.org/jobBenefits">http://schema.org/jobBenefits</a>
		 */
		public Container.JobBenefits getJobBenefits();
		public void setJobBenefits(Container.JobBenefits jobBenefits);

		/**
		 * @see <a href="http://schema.org/jobLocation">http://schema.org/jobLocation</a>
		 */
		public Container.JobLocation getJobLocation();
		public void setJobLocation(Container.JobLocation jobLocation);

		/**
		 * @see <a href="http://schema.org/occupationalCategory">http://schema.org/occupationalCategory</a>
		 */
		public OccupationalCategory getOccupationalCategory();
		public void setOccupationalCategory(OccupationalCategory occupationalCategory);

		/**
		 * @see <a href="http://schema.org/qualifications">http://schema.org/qualifications</a>
		 */
		public Qualifications getQualifications();
		public void setQualifications(Qualifications qualifications);

		/**
		 * @see <a href="http://schema.org/relevantOccupation">http://schema.org/relevantOccupation</a>
		 */
		public RelevantOccupation getRelevantOccupation();
		public void setRelevantOccupation(RelevantOccupation relevantOccupation);

		/**
		 * @see <a href="http://schema.org/responsibilities">http://schema.org/responsibilities</a>
		 */
		public Responsibilities getResponsibilities();
		public void setResponsibilities(Responsibilities responsibilities);

		/**
		 * @see <a href="http://schema.org/salaryCurrency">http://schema.org/salaryCurrency</a>
		 */
		public Container.SalaryCurrency getSalaryCurrency();
		public void setSalaryCurrency(Container.SalaryCurrency salaryCurrency);

		/**
		 * @see <a href="http://schema.org/skills">http://schema.org/skills</a>
		 */
		public Skills getSkills();
		public void setSkills(Skills skills);

		/**
		 * @see <a href="http://schema.org/specialCommitments">http://schema.org/specialCommitments</a>
		 */
		public Container.SpecialCommitments getSpecialCommitments();
		public void setSpecialCommitments(Container.SpecialCommitments specialCommitments);

		/**
		 * @see <a href="http://schema.org/title">http://schema.org/title</a>
		 */
		public Container.Title getTitle();
		public void setTitle(Container.Title title);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * @see <a href="http://schema.org/workHours">http://schema.org/workHours</a>
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
			+ "An agent joins an event/group with participants/friends at a"
			+ " location.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\""
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
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
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
			+ "An agent leaves an event / group with participants/friends at a"
			+ " location.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/JoinAction\">JoinAction</a>: The"
			+ " antonym of LeaveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/UnRegisterAction\">UnRegisterAction</a>: Unlike"
			+ " UnRegisterAction, LeaveAction implies leaving a group/team of people rather"
			+ " than a service.</li>\n</ul>\n")
	@CamelizedName("leaveAction")
	@ConstantizedName("LEAVE_ACTION")
	public interface LeaveAction extends InteractAction, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
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
			+ " representation, e.g. law firms.<br/><br/>\n\nAs a <a class=\"localLink\""
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
			+ "The act of providing an object under an agreement that it will be returned at a"
			+ " later date. Reciprocal of BorrowAction.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/BorrowAction\">BorrowAction</a>: Reciprocal of"
			+ " LendAction.</li>\n</ul>\n")
	@CamelizedName("lendAction")
	@ConstantizedName("LEND_ACTION")
	public interface LendAction extends SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/borrower">http://schema.org/borrower</a>
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
		 * @see <a href="http://schema.org/item">http://schema.org/item</a>
		 */
		public Container.Item getItem();
		public void setItem(Container.Item item);

		/**
		 * @see <a href="http://schema.org/nextItem">http://schema.org/nextItem</a>
		 */
		public Container.NextItem getNextItem();
		public void setNextItem(Container.NextItem nextItem);

		/**
		 * @see <a href="http://schema.org/position">http://schema.org/position</a>
		 */
		public Container.Position getPosition();
		public void setPosition(Container.Position position);

		/**
		 * @see <a href="http://schema.org/previousItem">http://schema.org/previousItem</a>
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
		 * @see <a href="http://schema.org/coverageEndTime">http://schema.org/coverageEndTime</a>
		 */
		public Container.CoverageEndTime getCoverageEndTime();
		public void setCoverageEndTime(Container.CoverageEndTime coverageEndTime);

		/**
		 * @see <a href="http://schema.org/coverageStartTime">http://schema.org/coverageStartTime</a>
		 */
		public Container.CoverageStartTime getCoverageStartTime();
		public void setCoverageStartTime(Container.CoverageStartTime coverageStartTime);

		/**
		 * @see <a href="http://schema.org/liveBlogUpdate">http://schema.org/liveBlogUpdate</a>
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
		 * @see <a href="http://schema.org/amount">http://schema.org/amount</a>
		 */
		public Container.Amount getAmount();
		public void setAmount(Container.Amount amount);

		/**
		 * @see <a href="http://schema.org/currency">http://schema.org/currency</a>
		 */
		public Currency getCurrency();
		public void setCurrency(Currency currency);

		/**
		 * @see <a href="http://schema.org/gracePeriod">http://schema.org/gracePeriod</a>
		 */
		public GracePeriod getGracePeriod();
		public void setGracePeriod(GracePeriod gracePeriod);

		/**
		 * @see <a href="http://schema.org/loanRepaymentForm">http://schema.org/loanRepaymentForm</a>
		 */
		public LoanRepaymentForm getLoanRepaymentForm();
		public void setLoanRepaymentForm(LoanRepaymentForm loanRepaymentForm);

		/**
		 * @see <a href="http://schema.org/loanTerm">http://schema.org/loanTerm</a>
		 */
		public Container.LoanTerm getLoanTerm();
		public void setLoanTerm(Container.LoanTerm loanTerm);

		/**
		 * @see <a href="http://schema.org/loanType">http://schema.org/loanType</a>
		 */
		public LoanType getLoanType();
		public void setLoanType(LoanType loanType);

		/**
		 * @see <a href="http://schema.org/recourseLoan">http://schema.org/recourseLoan</a>
		 */
		public RecourseLoan getRecourseLoan();
		public void setRecourseLoan(RecourseLoan recourseLoan);

		/**
		 * @see <a href="http://schema.org/renegotiableLoan">http://schema.org/renegotiableLoan</a>
		 */
		public RenegotiableLoan getRenegotiableLoan();
		public void setRenegotiableLoan(RenegotiableLoan renegotiableLoan);

		/**
		 * @see <a href="http://schema.org/requiredCollateral">http://schema.org/requiredCollateral</a>
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
		 * @see <a href="http://schema.org/currenciesAccepted">http://schema.org/currenciesAccepted</a>
		 */
		public Container.CurrenciesAccepted getCurrenciesAccepted();
		public void setCurrenciesAccepted(Container.CurrenciesAccepted currenciesAccepted);

		/**
		 * @see <a href="http://schema.org/openingHours">http://schema.org/openingHours</a>
		 */
		public Container.OpeningHours getOpeningHours();
		public void setOpeningHours(Container.OpeningHours openingHours);

		/**
		 * @see <a href="http://schema.org/paymentAccepted">http://schema.org/paymentAccepted</a>
		 */
		public Container.PaymentAccepted getPaymentAccepted();
		public void setPaymentAccepted(Container.PaymentAccepted paymentAccepted);

		/**
		 * @see <a href="http://schema.org/priceRange">http://schema.org/priceRange</a>
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
		 * @see <a href="http://schema.org/hoursAvailable">http://schema.org/hoursAvailable</a>
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
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
		 * @see <a href="http://schema.org/amenityFeature">http://schema.org/amenityFeature</a>
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/availableLanguage">http://schema.org/availableLanguage</a>
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * @see <a href="http://schema.org/checkinTime">http://schema.org/checkinTime</a>
		 */
		public Container.CheckinTime getCheckinTime();
		public void setCheckinTime(Container.CheckinTime checkinTime);

		/**
		 * @see <a href="http://schema.org/checkoutTime">http://schema.org/checkoutTime</a>
		 */
		public Container.CheckoutTime getCheckoutTime();
		public void setCheckoutTime(Container.CheckoutTime checkoutTime);

		/**
		 * @see <a href="http://schema.org/petsAllowed">http://schema.org/petsAllowed</a>
		 */
		public Container.PetsAllowed getPetsAllowed();
		public void setPetsAllowed(Container.PetsAllowed petsAllowed);

		/**
		 * @see <a href="http://schema.org/starRating">http://schema.org/starRating</a>
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
			+ "A reservation for lodging at a hotel, motel, inn, etc.<br/><br/>\n\nNote: This"
			+ " type is for information about actual reservations, e.g. in confirmation emails"
			+ " or HTML pages with individual confirmations of reservations.")
	@CamelizedName("lodgingReservation")
	@ConstantizedName("LODGING_RESERVATION")
	public interface LodgingReservation extends Reservation, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/checkinTime">http://schema.org/checkinTime</a>
		 */
		public Container.CheckinTime getCheckinTime();
		public void setCheckinTime(Container.CheckinTime checkinTime);

		/**
		 * @see <a href="http://schema.org/checkoutTime">http://schema.org/checkoutTime</a>
		 */
		public Container.CheckoutTime getCheckoutTime();
		public void setCheckoutTime(Container.CheckoutTime checkoutTime);

		/**
		 * @see <a href="http://schema.org/lodgingUnitDescription">http://schema.org/lodgingUnitDescription</a>
		 */
		public Container.LodgingUnitDescription getLodgingUnitDescription();
		public void setLodgingUnitDescription(Container.LodgingUnitDescription lodgingUnitDescription);

		/**
		 * @see <a href="http://schema.org/lodgingUnitType">http://schema.org/lodgingUnitType</a>
		 */
		public Container.LodgingUnitType getLodgingUnitType();
		public void setLodgingUnitType(Container.LodgingUnitType lodgingUnitType);

		/**
		 * @see <a href="http://schema.org/numAdults">http://schema.org/numAdults</a>
		 */
		public Container.NumAdults getNumAdults();
		public void setNumAdults(Container.NumAdults numAdults);

		/**
		 * @see <a href="http://schema.org/numChildren">http://schema.org/numChildren</a>
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
		 * @see <a href="http://schema.org/winner">http://schema.org/winner</a>
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
		 * @see <a href="http://schema.org/mapType">http://schema.org/mapType</a>
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
		 * @see <a href="http://schema.org/associatedArticle">http://schema.org/associatedArticle</a>
		 */
		public Container.AssociatedArticle getAssociatedArticle();
		public void setAssociatedArticle(Container.AssociatedArticle associatedArticle);

		/**
		 * @see <a href="http://schema.org/bitrate">http://schema.org/bitrate</a>
		 */
		public Container.Bitrate getBitrate();
		public void setBitrate(Container.Bitrate bitrate);

		/**
		 * @see <a href="http://schema.org/contentSize">http://schema.org/contentSize</a>
		 */
		public Container.ContentSize getContentSize();
		public void setContentSize(Container.ContentSize contentSize);

		/**
		 * @see <a href="http://schema.org/contentUrl">http://schema.org/contentUrl</a>
		 */
		public Container.ContentUrl getContentUrl();
		public void setContentUrl(Container.ContentUrl contentUrl);

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.pending.Container.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.pending.Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/embedUrl">http://schema.org/embedUrl</a>
		 */
		public Container.EmbedUrl getEmbedUrl();
		public void setEmbedUrl(Container.EmbedUrl embedUrl);

		/**
		 * @see <a href="http://schema.org/encodesCreativeWork">http://schema.org/encodesCreativeWork</a>
		 */
		public Container.EncodesCreativeWork getEncodesCreativeWork();
		public void setEncodesCreativeWork(Container.EncodesCreativeWork encodesCreativeWork);

		/**
		 * @see <a href="http://schema.org/encodingFormat">http://schema.org/encodingFormat</a>
		 */
		public Container.EncodingFormat getEncodingFormat();
		public void setEncodingFormat(Container.EncodingFormat encodingFormat);

		/**
		 * @see <a href="http://schema.org/height">http://schema.org/height</a>
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * @see <a href="http://schema.org/playerType">http://schema.org/playerType</a>
		 */
		public Container.PlayerType getPlayerType();
		public void setPlayerType(Container.PlayerType playerType);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/regionsAllowed">http://schema.org/regionsAllowed</a>
		 */
		public Container.RegionsAllowed getRegionsAllowed();
		public void setRegionsAllowed(Container.RegionsAllowed regionsAllowed);

		/**
		 * @see <a href="http://schema.org/requiresSubscription">http://schema.org/requiresSubscription</a>
		 */
		public RequiresSubscription getRequiresSubscription();
		public void setRequiresSubscription(RequiresSubscription requiresSubscription);

		/**
		 * @see <a href="http://schema.org/uploadDate">http://schema.org/uploadDate</a>
		 */
		public Container.UploadDate getUploadDate();
		public void setUploadDate(Container.UploadDate uploadDate);

		/**
		 * @see <a href="http://schema.org/width">http://schema.org/width</a>
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
		 * @see <a href="http://schema.org/healthPlanNetworkId">http://schema.org/healthPlanNetworkId</a>
		 */
		public HealthPlanNetworkId getHealthPlanNetworkId();
		public void setHealthPlanNetworkId(HealthPlanNetworkId healthPlanNetworkId);

		/**
		 * @see <a href="http://schema.org/isAcceptingNewPatients">http://schema.org/isAcceptingNewPatients</a>
		 */
		public IsAcceptingNewPatients getIsAcceptingNewPatients();
		public void setIsAcceptingNewPatients(IsAcceptingNewPatients isAcceptingNewPatients);

		/**
		 * @see <a href="http://schema.org/medicalSpecialty">http://schema.org/medicalSpecialty</a>
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
		 * @see <a href="http://schema.org/hasMenuItem">http://schema.org/hasMenuItem</a>
		 */
		public Container.HasMenuItem getHasMenuItem();
		public void setHasMenuItem(Container.HasMenuItem hasMenuItem);

		/**
		 * @see <a href="http://schema.org/hasMenuSection">http://schema.org/hasMenuSection</a>
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
		 * @see <a href="http://schema.org/menuAddOn">http://schema.org/menuAddOn</a>
		 */
		public MenuAddOn getMenuAddOn();
		public void setMenuAddOn(MenuAddOn menuAddOn);

		/**
		 * @see <a href="http://schema.org/nutrition">http://schema.org/nutrition</a>
		 */
		public Container.Nutrition getNutrition();
		public void setNutrition(Container.Nutrition nutrition);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/suitableForDiet">http://schema.org/suitableForDiet</a>
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
		 * @see <a href="http://schema.org/hasMenuItem">http://schema.org/hasMenuItem</a>
		 */
		public Container.HasMenuItem getHasMenuItem();
		public void setHasMenuItem(Container.HasMenuItem hasMenuItem);

		/**
		 * @see <a href="http://schema.org/hasMenuSection">http://schema.org/hasMenuSection</a>
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
		 * @see <a href="http://schema.org/bccRecipient">http://schema.org/bccRecipient</a>
		 */
		public Container.BccRecipient getBccRecipient();
		public void setBccRecipient(Container.BccRecipient bccRecipient);

		/**
		 * @see <a href="http://schema.org/ccRecipient">http://schema.org/ccRecipient</a>
		 */
		public Container.CcRecipient getCcRecipient();
		public void setCcRecipient(Container.CcRecipient ccRecipient);

		/**
		 * @see <a href="http://schema.org/dateRead">http://schema.org/dateRead</a>
		 */
		public Container.DateRead getDateRead();
		public void setDateRead(Container.DateRead dateRead);

		/**
		 * @see <a href="http://schema.org/dateReceived">http://schema.org/dateReceived</a>
		 */
		public Container.DateReceived getDateReceived();
		public void setDateReceived(Container.DateReceived dateReceived);

		/**
		 * @see <a href="http://schema.org/dateSent">http://schema.org/dateSent</a>
		 */
		public Container.DateSent getDateSent();
		public void setDateSent(Container.DateSent dateSent);

		/**
		 * @see <a href="http://schema.org/messageAttachment">http://schema.org/messageAttachment</a>
		 */
		public Container.MessageAttachment getMessageAttachment();
		public void setMessageAttachment(Container.MessageAttachment messageAttachment);

		/**
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
		 */
		public Container.Recipient getRecipient();
		public void setRecipient(Container.Recipient recipient);

		/**
		 * @see <a href="http://schema.org/sender">http://schema.org/sender</a>
		 */
		public Container.Sender getSender();
		public void setSender(Container.Sender sender);

		/**
		 * @see <a href="http://schema.org/toRecipient">http://schema.org/toRecipient</a>
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
		 * @see <a href="http://schema.org/carrierRequirements">http://schema.org/carrierRequirements</a>
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
		 * @see <a href="http://schema.org/currency">http://schema.org/currency</a>
		 */
		public Currency getCurrency();
		public void setCurrency(Currency currency);

		/**
		 * @see <a href="http://schema.org/maxValue">http://schema.org/maxValue</a>
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * @see <a href="http://schema.org/minValue">http://schema.org/minValue</a>
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * @see <a href="http://schema.org/value">http://schema.org/value</a>
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
			+ "The act of an agent relocating to a place.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/TransferAction\">TransferAction</a>: Unlike"
			+ " TransferAction, the subject of the move is a living Person or Organization"
			+ " rather than an inanimate object.</li>\n</ul>\n")
	@CamelizedName("moveAction")
	@ConstantizedName("MOVE_ACTION")
	public interface MoveAction extends Action, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/fromLocation">http://schema.org/fromLocation</a>
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * @see <a href="http://schema.org/toLocation">http://schema.org/toLocation</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/countryOfOrigin">http://schema.org/countryOfOrigin</a>
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.pending.Container.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.pending.Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/subtitleLanguage">http://schema.org/subtitleLanguage</a>
		 */
		public Container.SubtitleLanguage getSubtitleLanguage();
		public void setSubtitleLanguage(Container.SubtitleLanguage subtitleLanguage);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/screenCount">http://schema.org/screenCount</a>
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
		 * @see <a href="http://schema.org/albumProductionType">http://schema.org/albumProductionType</a>
		 */
		public Container.AlbumProductionType getAlbumProductionType();
		public void setAlbumProductionType(Container.AlbumProductionType albumProductionType);

		/**
		 * @see <a href="http://schema.org/albumRelease">http://schema.org/albumRelease</a>
		 */
		public Container.AlbumRelease getAlbumRelease();
		public void setAlbumRelease(Container.AlbumRelease albumRelease);

		/**
		 * @see <a href="http://schema.org/albumReleaseType">http://schema.org/albumReleaseType</a>
		 */
		public Container.AlbumReleaseType getAlbumReleaseType();
		public void setAlbumReleaseType(Container.AlbumReleaseType albumReleaseType);

		/**
		 * @see <a href="http://schema.org/byArtist">http://schema.org/byArtist</a>
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
		 * @see <a href="http://schema.org/composer">http://schema.org/composer</a>
		 */
		public Container.Composer getComposer();
		public void setComposer(Container.Composer composer);

		/**
		 * @see <a href="http://schema.org/firstPerformance">http://schema.org/firstPerformance</a>
		 */
		public Container.FirstPerformance getFirstPerformance();
		public void setFirstPerformance(Container.FirstPerformance firstPerformance);

		/**
		 * @see <a href="http://schema.org/includedComposition">http://schema.org/includedComposition</a>
		 */
		public Container.IncludedComposition getIncludedComposition();
		public void setIncludedComposition(Container.IncludedComposition includedComposition);

		/**
		 * @see <a href="http://schema.org/iswcCode">http://schema.org/iswcCode</a>
		 */
		public Container.IswcCode getIswcCode();
		public void setIswcCode(Container.IswcCode iswcCode);

		/**
		 * @see <a href="http://schema.org/lyricist">http://schema.org/lyricist</a>
		 */
		public Container.Lyricist getLyricist();
		public void setLyricist(Container.Lyricist lyricist);

		/**
		 * @see <a href="http://schema.org/lyrics">http://schema.org/lyrics</a>
		 */
		public Container.Lyrics getLyrics();
		public void setLyrics(Container.Lyrics lyrics);

		/**
		 * @see <a href="http://schema.org/musicArrangement">http://schema.org/musicArrangement</a>
		 */
		public Container.MusicArrangement getMusicArrangement();
		public void setMusicArrangement(Container.MusicArrangement musicArrangement);

		/**
		 * @see <a href="http://schema.org/musicCompositionForm">http://schema.org/musicCompositionForm</a>
		 */
		public Container.MusicCompositionForm getMusicCompositionForm();
		public void setMusicCompositionForm(Container.MusicCompositionForm musicCompositionForm);

		/**
		 * @see <a href="http://schema.org/musicalKey">http://schema.org/musicalKey</a>
		 */
		public Container.MusicalKey getMusicalKey();
		public void setMusicalKey(Container.MusicalKey musicalKey);

		/**
		 * @see <a href="http://schema.org/recordedAs">http://schema.org/recordedAs</a>
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
		 * @see <a href="http://schema.org/album">http://schema.org/album</a>
		 */
		public Container.Album getAlbum();
		public void setAlbum(Container.Album album);

		/**
		 * @see <a href="http://schema.org/genre">http://schema.org/genre</a>
		 */
		public Container.Genre getGenre();
		public void setGenre(Container.Genre genre);

		/**
		 * @see <a href="http://schema.org/track">http://schema.org/track</a>
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
		 * @see <a href="http://schema.org/numTracks">http://schema.org/numTracks</a>
		 */
		public Container.NumTracks getNumTracks();
		public void setNumTracks(Container.NumTracks numTracks);

		/**
		 * @see <a href="http://schema.org/track">http://schema.org/track</a>
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
		 * @see <a href="http://schema.org/byArtist">http://schema.org/byArtist</a>
		 */
		public Container.ByArtist getByArtist();
		public void setByArtist(Container.ByArtist byArtist);

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.pending.Container.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.pending.Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/inAlbum">http://schema.org/inAlbum</a>
		 */
		public Container.InAlbum getInAlbum();
		public void setInAlbum(Container.InAlbum inAlbum);

		/**
		 * @see <a href="http://schema.org/inPlaylist">http://schema.org/inPlaylist</a>
		 */
		public Container.InPlaylist getInPlaylist();
		public void setInPlaylist(Container.InPlaylist inPlaylist);

		/**
		 * @see <a href="http://schema.org/isrcCode">http://schema.org/isrcCode</a>
		 */
		public Container.IsrcCode getIsrcCode();
		public void setIsrcCode(Container.IsrcCode isrcCode);

		/**
		 * @see <a href="http://schema.org/recordingOf">http://schema.org/recordingOf</a>
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
		 * @see <a href="http://schema.org/catalogNumber">http://schema.org/catalogNumber</a>
		 */
		public Container.CatalogNumber getCatalogNumber();
		public void setCatalogNumber(Container.CatalogNumber catalogNumber);

		/**
		 * @see <a href="http://schema.org/creditedTo">http://schema.org/creditedTo</a>
		 */
		public Container.CreditedTo getCreditedTo();
		public void setCreditedTo(Container.CreditedTo creditedTo);

		/**
		 * @see <a href="http://schema.org/duration">http://schema.org/duration</a>
		 */
		public org.kyojo.schemaorg.m3n4.pending.Container.Duration getDuration();
		public void setDuration(org.kyojo.schemaorg.m3n4.pending.Container.Duration duration);

		/**
		 * @see <a href="http://schema.org/musicReleaseFormat">http://schema.org/musicReleaseFormat</a>
		 */
		public Container.MusicReleaseFormat getMusicReleaseFormat();
		public void setMusicReleaseFormat(Container.MusicReleaseFormat musicReleaseFormat);

		/**
		 * @see <a href="http://schema.org/recordLabel">http://schema.org/recordLabel</a>
		 */
		public Container.RecordLabel getRecordLabel();
		public void setRecordLabel(Container.RecordLabel recordLabel);

		/**
		 * @see <a href="http://schema.org/releaseOf">http://schema.org/releaseOf</a>
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
			+ " context and supporting materials for understanding the news.<br/><br/>\n\nA"
			+ " more detailed overview of <a href=\"/docs/news.html\">schema.org News"
			+ " markup</a> is also available.")
	@CamelizedName("newsArticle")
	@ConstantizedName("NEWS_ARTICLE")
	public interface NewsArticle extends Article, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/dateline">http://schema.org/dateline</a>
		 */
		public Container.Dateline getDateline();
		public void setDateline(Container.Dateline dateline);

		/**
		 * @see <a href="http://schema.org/printColumn">http://schema.org/printColumn</a>
		 */
		public Container.PrintColumn getPrintColumn();
		public void setPrintColumn(Container.PrintColumn printColumn);

		/**
		 * @see <a href="http://schema.org/printEdition">http://schema.org/printEdition</a>
		 */
		public Container.PrintEdition getPrintEdition();
		public void setPrintEdition(Container.PrintEdition printEdition);

		/**
		 * @see <a href="http://schema.org/printPage">http://schema.org/printPage</a>
		 */
		public Container.PrintPage getPrintPage();
		public void setPrintPage(Container.PrintPage printPage);

		/**
		 * @see <a href="http://schema.org/printSection">http://schema.org/printSection</a>
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
		 * @see <a href="http://schema.org/calories">http://schema.org/calories</a>
		 */
		public Container.Calories getCalories();
		public void setCalories(Container.Calories calories);

		/**
		 * @see <a href="http://schema.org/carbohydrateContent">http://schema.org/carbohydrateContent</a>
		 */
		public Container.CarbohydrateContent getCarbohydrateContent();
		public void setCarbohydrateContent(Container.CarbohydrateContent carbohydrateContent);

		/**
		 * @see <a href="http://schema.org/cholesterolContent">http://schema.org/cholesterolContent</a>
		 */
		public Container.CholesterolContent getCholesterolContent();
		public void setCholesterolContent(Container.CholesterolContent cholesterolContent);

		/**
		 * @see <a href="http://schema.org/fatContent">http://schema.org/fatContent</a>
		 */
		public Container.FatContent getFatContent();
		public void setFatContent(Container.FatContent fatContent);

		/**
		 * @see <a href="http://schema.org/fiberContent">http://schema.org/fiberContent</a>
		 */
		public Container.FiberContent getFiberContent();
		public void setFiberContent(Container.FiberContent fiberContent);

		/**
		 * @see <a href="http://schema.org/proteinContent">http://schema.org/proteinContent</a>
		 */
		public Container.ProteinContent getProteinContent();
		public void setProteinContent(Container.ProteinContent proteinContent);

		/**
		 * @see <a href="http://schema.org/saturatedFatContent">http://schema.org/saturatedFatContent</a>
		 */
		public Container.SaturatedFatContent getSaturatedFatContent();
		public void setSaturatedFatContent(Container.SaturatedFatContent saturatedFatContent);

		/**
		 * @see <a href="http://schema.org/servingSize">http://schema.org/servingSize</a>
		 */
		public Container.ServingSize getServingSize();
		public void setServingSize(Container.ServingSize servingSize);

		/**
		 * @see <a href="http://schema.org/sodiumContent">http://schema.org/sodiumContent</a>
		 */
		public Container.SodiumContent getSodiumContent();
		public void setSodiumContent(Container.SodiumContent sodiumContent);

		/**
		 * @see <a href="http://schema.org/sugarContent">http://schema.org/sugarContent</a>
		 */
		public Container.SugarContent getSugarContent();
		public void setSugarContent(Container.SugarContent sugarContent);

		/**
		 * @see <a href="http://schema.org/transFatContent">http://schema.org/transFatContent</a>
		 */
		public Container.TransFatContent getTransFatContent();
		public void setTransFatContent(Container.TransFatContent transFatContent);

		/**
		 * @see <a href="http://schema.org/unsaturatedFatContent">http://schema.org/unsaturatedFatContent</a>
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
			+ " book.<br/><br/>\n\nFor <a"
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
		 * @see <a href="http://schema.org/acceptedPaymentMethod">http://schema.org/acceptedPaymentMethod</a>
		 */
		public Container.AcceptedPaymentMethod getAcceptedPaymentMethod();
		public void setAcceptedPaymentMethod(Container.AcceptedPaymentMethod acceptedPaymentMethod);

		/**
		 * @see <a href="http://schema.org/addOn">http://schema.org/addOn</a>
		 */
		public Container.AddOn getAddOn();
		public void setAddOn(Container.AddOn addOn);

		/**
		 * @see <a href="http://schema.org/advanceBookingRequirement">http://schema.org/advanceBookingRequirement</a>
		 */
		public Container.AdvanceBookingRequirement getAdvanceBookingRequirement();
		public void setAdvanceBookingRequirement(Container.AdvanceBookingRequirement advanceBookingRequirement);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/availability">http://schema.org/availability</a>
		 */
		public Container.Availability getAvailability();
		public void setAvailability(Container.Availability availability);

		/**
		 * @see <a href="http://schema.org/availabilityEnds">http://schema.org/availabilityEnds</a>
		 */
		public AvailabilityEnds getAvailabilityEnds();
		public void setAvailabilityEnds(AvailabilityEnds availabilityEnds);

		/**
		 * @see <a href="http://schema.org/availabilityStarts">http://schema.org/availabilityStarts</a>
		 */
		public AvailabilityStarts getAvailabilityStarts();
		public void setAvailabilityStarts(AvailabilityStarts availabilityStarts);

		/**
		 * @see <a href="http://schema.org/availableAtOrFrom">http://schema.org/availableAtOrFrom</a>
		 */
		public Container.AvailableAtOrFrom getAvailableAtOrFrom();
		public void setAvailableAtOrFrom(Container.AvailableAtOrFrom availableAtOrFrom);

		/**
		 * @see <a href="http://schema.org/availableDeliveryMethod">http://schema.org/availableDeliveryMethod</a>
		 */
		public Container.AvailableDeliveryMethod getAvailableDeliveryMethod();
		public void setAvailableDeliveryMethod(Container.AvailableDeliveryMethod availableDeliveryMethod);

		/**
		 * @see <a href="http://schema.org/businessFunction">http://schema.org/businessFunction</a>
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * @see <a href="http://schema.org/deliveryLeadTime">http://schema.org/deliveryLeadTime</a>
		 */
		public Container.DeliveryLeadTime getDeliveryLeadTime();
		public void setDeliveryLeadTime(Container.DeliveryLeadTime deliveryLeadTime);

		/**
		 * @see <a href="http://schema.org/eligibleCustomerType">http://schema.org/eligibleCustomerType</a>
		 */
		public Container.EligibleCustomerType getEligibleCustomerType();
		public void setEligibleCustomerType(Container.EligibleCustomerType eligibleCustomerType);

		/**
		 * @see <a href="http://schema.org/eligibleDuration">http://schema.org/eligibleDuration</a>
		 */
		public Container.EligibleDuration getEligibleDuration();
		public void setEligibleDuration(Container.EligibleDuration eligibleDuration);

		/**
		 * @see <a href="http://schema.org/eligibleQuantity">http://schema.org/eligibleQuantity</a>
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * @see <a href="http://schema.org/eligibleRegion">http://schema.org/eligibleRegion</a>
		 */
		public EligibleRegion getEligibleRegion();
		public void setEligibleRegion(EligibleRegion eligibleRegion);

		/**
		 * @see <a href="http://schema.org/eligibleTransactionVolume">http://schema.org/eligibleTransactionVolume</a>
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * @see <a href="http://schema.org/gtin12">http://schema.org/gtin12</a>
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * @see <a href="http://schema.org/gtin13">http://schema.org/gtin13</a>
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * @see <a href="http://schema.org/gtin14">http://schema.org/gtin14</a>
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * @see <a href="http://schema.org/gtin8">http://schema.org/gtin8</a>
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * @see <a href="http://schema.org/includesObject">http://schema.org/includesObject</a>
		 */
		public Container.IncludesObject getIncludesObject();
		public void setIncludesObject(Container.IncludesObject includesObject);

		/**
		 * @see <a href="http://schema.org/ineligibleRegion">http://schema.org/ineligibleRegion</a>
		 */
		public Container.IneligibleRegion getIneligibleRegion();
		public void setIneligibleRegion(Container.IneligibleRegion ineligibleRegion);

		/**
		 * @see <a href="http://schema.org/inventoryLevel">http://schema.org/inventoryLevel</a>
		 */
		public Container.InventoryLevel getInventoryLevel();
		public void setInventoryLevel(Container.InventoryLevel inventoryLevel);

		/**
		 * @see <a href="http://schema.org/itemCondition">http://schema.org/itemCondition</a>
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * @see <a href="http://schema.org/itemOffered">http://schema.org/itemOffered</a>
		 */
		public Container.ItemOffered getItemOffered();
		public void setItemOffered(Container.ItemOffered itemOffered);

		/**
		 * @see <a href="http://schema.org/mpn">http://schema.org/mpn</a>
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * @see <a href="http://schema.org/offeredBy">http://schema.org/offeredBy</a>
		 */
		public Container.OfferedBy getOfferedBy();
		public void setOfferedBy(Container.OfferedBy offeredBy);

		/**
		 * @see <a href="http://schema.org/price">http://schema.org/price</a>
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * @see <a href="http://schema.org/priceCurrency">http://schema.org/priceCurrency</a>
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * @see <a href="http://schema.org/priceSpecification">http://schema.org/priceSpecification</a>
		 */
		public Container.PriceSpecification getPriceSpecification();
		public void setPriceSpecification(Container.PriceSpecification priceSpecification);

		/**
		 * @see <a href="http://schema.org/priceValidUntil">http://schema.org/priceValidUntil</a>
		 */
		public Container.PriceValidUntil getPriceValidUntil();
		public void setPriceValidUntil(Container.PriceValidUntil priceValidUntil);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/seller">http://schema.org/seller</a>
		 */
		public Container.Seller getSeller();
		public void setSeller(Container.Seller seller);

		/**
		 * @see <a href="http://schema.org/serialNumber">http://schema.org/serialNumber</a>
		 */
		public Container.SerialNumber getSerialNumber();
		public void setSerialNumber(Container.SerialNumber serialNumber);

		/**
		 * @see <a href="http://schema.org/sku">http://schema.org/sku</a>
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * @see <a href="http://schema.org/warranty">http://schema.org/warranty</a>
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
			+ " certain service inside a place.<br/><br/>\n\nThe place is <strong>open</strong>"
			+ " if the <a class=\"localLink\" href=\"http://schema.org/opens\">opens</a>"
			+ " property is specified, and <strong>closed</strong> otherwise.<br/><br/>\n\nIf"
			+ " the value for the <a class=\"localLink\""
			+ " href=\"http://schema.org/closes\">closes</a> property is less than the value"
			+ " for the <a class=\"localLink\" href=\"http://schema.org/opens\">opens</a>"
			+ " property then the hour range is assumed to span over the next day.")
	@CamelizedName("openingHoursSpecification")
	@ConstantizedName("OPENING_HOURS_SPECIFICATION")
	public interface OpeningHoursSpecification extends SchemaOrgClass, StructuredValue {

		/**
		 * @see <a href="http://schema.org/closes">http://schema.org/closes</a>
		 */
		public Container.Closes getCloses();
		public void setCloses(Container.Closes closes);

		/**
		 * @see <a href="http://schema.org/dayOfWeek">http://schema.org/dayOfWeek</a>
		 */
		public Container.DayOfWeek getDayOfWeek();
		public void setDayOfWeek(Container.DayOfWeek dayOfWeek);

		/**
		 * @see <a href="http://schema.org/opens">http://schema.org/opens</a>
		 */
		public Container.Opens getOpens();
		public void setOpens(Container.Opens opens);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
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
		 * @see <a href="http://schema.org/acceptedOffer">http://schema.org/acceptedOffer</a>
		 */
		public Container.AcceptedOffer getAcceptedOffer();
		public void setAcceptedOffer(Container.AcceptedOffer acceptedOffer);

		/**
		 * @see <a href="http://schema.org/billingAddress">http://schema.org/billingAddress</a>
		 */
		public Container.BillingAddress getBillingAddress();
		public void setBillingAddress(Container.BillingAddress billingAddress);

		/**
		 * @see <a href="http://schema.org/broker">http://schema.org/broker</a>
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * @see <a href="http://schema.org/confirmationNumber">http://schema.org/confirmationNumber</a>
		 */
		public Container.ConfirmationNumber getConfirmationNumber();
		public void setConfirmationNumber(Container.ConfirmationNumber confirmationNumber);

		/**
		 * @see <a href="http://schema.org/customer">http://schema.org/customer</a>
		 */
		public Container.Customer getCustomer();
		public void setCustomer(Container.Customer customer);

		/**
		 * @see <a href="http://schema.org/discount">http://schema.org/discount</a>
		 */
		public Container.Discount getDiscount();
		public void setDiscount(Container.Discount discount);

		/**
		 * @see <a href="http://schema.org/discountCode">http://schema.org/discountCode</a>
		 */
		public Container.DiscountCode getDiscountCode();
		public void setDiscountCode(Container.DiscountCode discountCode);

		/**
		 * @see <a href="http://schema.org/discountCurrency">http://schema.org/discountCurrency</a>
		 */
		public Container.DiscountCurrency getDiscountCurrency();
		public void setDiscountCurrency(Container.DiscountCurrency discountCurrency);

		/**
		 * @see <a href="http://schema.org/isGift">http://schema.org/isGift</a>
		 */
		public Container.IsGift getIsGift();
		public void setIsGift(Container.IsGift isGift);

		/**
		 * @see <a href="http://schema.org/orderDate">http://schema.org/orderDate</a>
		 */
		public Container.OrderDate getOrderDate();
		public void setOrderDate(Container.OrderDate orderDate);

		/**
		 * @see <a href="http://schema.org/orderDelivery">http://schema.org/orderDelivery</a>
		 */
		public Container.OrderDelivery getOrderDelivery();
		public void setOrderDelivery(Container.OrderDelivery orderDelivery);

		/**
		 * @see <a href="http://schema.org/orderNumber">http://schema.org/orderNumber</a>
		 */
		public Container.OrderNumber getOrderNumber();
		public void setOrderNumber(Container.OrderNumber orderNumber);

		/**
		 * @see <a href="http://schema.org/orderStatus">http://schema.org/orderStatus</a>
		 */
		public Container.OrderStatus getOrderStatus();
		public void setOrderStatus(Container.OrderStatus orderStatus);

		/**
		 * @see <a href="http://schema.org/orderedItem">http://schema.org/orderedItem</a>
		 */
		public Container.OrderedItem getOrderedItem();
		public void setOrderedItem(Container.OrderedItem orderedItem);

		/**
		 * @see <a href="http://schema.org/partOfInvoice">http://schema.org/partOfInvoice</a>
		 */
		public Container.PartOfInvoice getPartOfInvoice();
		public void setPartOfInvoice(Container.PartOfInvoice partOfInvoice);

		/**
		 * @see <a href="http://schema.org/paymentDueDate">http://schema.org/paymentDueDate</a>
		 */
		public Container.PaymentDueDate getPaymentDueDate();
		public void setPaymentDueDate(Container.PaymentDueDate paymentDueDate);

		/**
		 * @see <a href="http://schema.org/paymentMethod">http://schema.org/paymentMethod</a>
		 */
		public Container.PaymentMethod getPaymentMethod();
		public void setPaymentMethod(Container.PaymentMethod paymentMethod);

		/**
		 * @see <a href="http://schema.org/paymentMethodId">http://schema.org/paymentMethodId</a>
		 */
		public Container.PaymentMethodId getPaymentMethodId();
		public void setPaymentMethodId(Container.PaymentMethodId paymentMethodId);

		/**
		 * @see <a href="http://schema.org/paymentUrl">http://schema.org/paymentUrl</a>
		 */
		public Container.PaymentUrl getPaymentUrl();
		public void setPaymentUrl(Container.PaymentUrl paymentUrl);

		/**
		 * @see <a href="http://schema.org/seller">http://schema.org/seller</a>
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
		 * @see <a href="http://schema.org/deliveryMethod">http://schema.org/deliveryMethod</a>
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
		 * @see <a href="http://schema.org/orderDelivery">http://schema.org/orderDelivery</a>
		 */
		public Container.OrderDelivery getOrderDelivery();
		public void setOrderDelivery(Container.OrderDelivery orderDelivery);

		/**
		 * @see <a href="http://schema.org/orderItemNumber">http://schema.org/orderItemNumber</a>
		 */
		public Container.OrderItemNumber getOrderItemNumber();
		public void setOrderItemNumber(Container.OrderItemNumber orderItemNumber);

		/**
		 * @see <a href="http://schema.org/orderItemStatus">http://schema.org/orderItemStatus</a>
		 */
		public Container.OrderItemStatus getOrderItemStatus();
		public void setOrderItemStatus(Container.OrderItemStatus orderItemStatus);

		/**
		 * @see <a href="http://schema.org/orderQuantity">http://schema.org/orderQuantity</a>
		 */
		public Container.OrderQuantity getOrderQuantity();
		public void setOrderQuantity(Container.OrderQuantity orderQuantity);

		/**
		 * @see <a href="http://schema.org/orderedItem">http://schema.org/orderedItem</a>
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
		 * @see <a href="http://schema.org/actionableFeedbackPolicy">http://schema.org/actionableFeedbackPolicy</a>
		 */
		public ActionableFeedbackPolicy getActionableFeedbackPolicy();
		public void setActionableFeedbackPolicy(ActionableFeedbackPolicy actionableFeedbackPolicy);

		/**
		 * @see <a href="http://schema.org/address">http://schema.org/address</a>
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/alumni">http://schema.org/alumni</a>
		 */
		public Container.Alumni getAlumni();
		public void setAlumni(Container.Alumni alumni);

		/**
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/award">http://schema.org/award</a>
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * @see <a href="http://schema.org/brand">http://schema.org/brand</a>
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * @see <a href="http://schema.org/contactPoint">http://schema.org/contactPoint</a>
		 */
		public Container.ContactPoint getContactPoint();
		public void setContactPoint(Container.ContactPoint contactPoint);

		/**
		 * @see <a href="http://schema.org/correctionsPolicy">http://schema.org/correctionsPolicy</a>
		 */
		public CorrectionsPolicy getCorrectionsPolicy();
		public void setCorrectionsPolicy(CorrectionsPolicy correctionsPolicy);

		/**
		 * @see <a href="http://schema.org/department">http://schema.org/department</a>
		 */
		public Container.Department getDepartment();
		public void setDepartment(Container.Department department);

		/**
		 * @see <a href="http://schema.org/dissolutionDate">http://schema.org/dissolutionDate</a>
		 */
		public Container.DissolutionDate getDissolutionDate();
		public void setDissolutionDate(Container.DissolutionDate dissolutionDate);

		/**
		 * @see <a href="http://schema.org/diversityPolicy">http://schema.org/diversityPolicy</a>
		 */
		public DiversityPolicy getDiversityPolicy();
		public void setDiversityPolicy(DiversityPolicy diversityPolicy);

		/**
		 * @see <a href="http://schema.org/diversityStaffingReport">http://schema.org/diversityStaffingReport</a>
		 */
		public DiversityStaffingReport getDiversityStaffingReport();
		public void setDiversityStaffingReport(DiversityStaffingReport diversityStaffingReport);

		/**
		 * @see <a href="http://schema.org/duns">http://schema.org/duns</a>
		 */
		public Container.Duns getDuns();
		public void setDuns(Container.Duns duns);

		/**
		 * @see <a href="http://schema.org/email">http://schema.org/email</a>
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * @see <a href="http://schema.org/employee">http://schema.org/employee</a>
		 */
		public Container.Employee getEmployee();
		public void setEmployee(Container.Employee employee);

		/**
		 * @see <a href="http://schema.org/ethicsPolicy">http://schema.org/ethicsPolicy</a>
		 */
		public EthicsPolicy getEthicsPolicy();
		public void setEthicsPolicy(EthicsPolicy ethicsPolicy);

		/**
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		/**
		 * @see <a href="http://schema.org/faxNumber">http://schema.org/faxNumber</a>
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * @see <a href="http://schema.org/founder">http://schema.org/founder</a>
		 */
		public Container.Founder getFounder();
		public void setFounder(Container.Founder founder);

		/**
		 * @see <a href="http://schema.org/foundingDate">http://schema.org/foundingDate</a>
		 */
		public Container.FoundingDate getFoundingDate();
		public void setFoundingDate(Container.FoundingDate foundingDate);

		/**
		 * @see <a href="http://schema.org/foundingLocation">http://schema.org/foundingLocation</a>
		 */
		public Container.FoundingLocation getFoundingLocation();
		public void setFoundingLocation(Container.FoundingLocation foundingLocation);

		/**
		 * @see <a href="http://schema.org/funder">http://schema.org/funder</a>
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * @see <a href="http://schema.org/globalLocationNumber">http://schema.org/globalLocationNumber</a>
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * @see <a href="http://schema.org/hasOfferCatalog">http://schema.org/hasOfferCatalog</a>
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * @see <a href="http://schema.org/hasPOS">http://schema.org/hasPOS</a>
		 */
		public Container.HasPOS getHasPOS();
		public void setHasPOS(Container.HasPOS hasPOS);

		/**
		 * @see <a href="http://schema.org/isicV4">http://schema.org/isicV4</a>
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * @see <a href="http://schema.org/knowsAbout">http://schema.org/knowsAbout</a>
		 */
		public KnowsAbout getKnowsAbout();
		public void setKnowsAbout(KnowsAbout knowsAbout);

		/**
		 * @see <a href="http://schema.org/knowsLanguage">http://schema.org/knowsLanguage</a>
		 */
		public KnowsLanguage getKnowsLanguage();
		public void setKnowsLanguage(KnowsLanguage knowsLanguage);

		/**
		 * @see <a href="http://schema.org/legalName">http://schema.org/legalName</a>
		 */
		public Container.LegalName getLegalName();
		public void setLegalName(Container.LegalName legalName);

		/**
		 * @see <a href="http://schema.org/leiCode">http://schema.org/leiCode</a>
		 */
		public Container.LeiCode getLeiCode();
		public void setLeiCode(Container.LeiCode leiCode);

		/**
		 * @see <a href="http://schema.org/location">http://schema.org/location</a>
		 */
		public Container.Location getLocation();
		public void setLocation(Container.Location location);

		/**
		 * @see <a href="http://schema.org/logo">http://schema.org/logo</a>
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * @see <a href="http://schema.org/makesOffer">http://schema.org/makesOffer</a>
		 */
		public Container.MakesOffer getMakesOffer();
		public void setMakesOffer(Container.MakesOffer makesOffer);

		/**
		 * @see <a href="http://schema.org/member">http://schema.org/member</a>
		 */
		public Container.Member getMember();
		public void setMember(Container.Member member);

		/**
		 * @see <a href="http://schema.org/memberOf">http://schema.org/memberOf</a>
		 */
		public Container.MemberOf getMemberOf();
		public void setMemberOf(Container.MemberOf memberOf);

		/**
		 * @see <a href="http://schema.org/naics">http://schema.org/naics</a>
		 */
		public Container.Naics getNaics();
		public void setNaics(Container.Naics naics);

		/**
		 * @see <a href="http://schema.org/numberOfEmployees">http://schema.org/numberOfEmployees</a>
		 */
		public Container.NumberOfEmployees getNumberOfEmployees();
		public void setNumberOfEmployees(Container.NumberOfEmployees numberOfEmployees);

		/**
		 * @see <a href="http://schema.org/ownershipFundingInfo">http://schema.org/ownershipFundingInfo</a>
		 */
		public OwnershipFundingInfo getOwnershipFundingInfo();
		public void setOwnershipFundingInfo(OwnershipFundingInfo ownershipFundingInfo);

		/**
		 * @see <a href="http://schema.org/owns">http://schema.org/owns</a>
		 */
		public Container.Owns getOwns();
		public void setOwns(Container.Owns owns);

		/**
		 * @see <a href="http://schema.org/parentOrganization">http://schema.org/parentOrganization</a>
		 */
		public Container.ParentOrganization getParentOrganization();
		public void setParentOrganization(Container.ParentOrganization parentOrganization);

		/**
		 * @see <a href="http://schema.org/publishingPrinciples">http://schema.org/publishingPrinciples</a>
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/seeks">http://schema.org/seeks</a>
		 */
		public Container.Seeks getSeeks();
		public void setSeeks(Container.Seeks seeks);

		/**
		 * @see <a href="http://schema.org/sponsor">http://schema.org/sponsor</a>
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * @see <a href="http://schema.org/subOrganization">http://schema.org/subOrganization</a>
		 */
		public Container.SubOrganization getSubOrganization();
		public void setSubOrganization(Container.SubOrganization subOrganization);

		/**
		 * @see <a href="http://schema.org/taxID">http://schema.org/taxID</a>
		 */
		public Container.TaxID getTaxID();
		public void setTaxID(Container.TaxID taxID);

		/**
		 * @see <a href="http://schema.org/telephone">http://schema.org/telephone</a>
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		/**
		 * @see <a href="http://schema.org/unnamedSourcesPolicy">http://schema.org/unnamedSourcesPolicy</a>
		 */
		public UnnamedSourcesPolicy getUnnamedSourcesPolicy();
		public void setUnnamedSourcesPolicy(UnnamedSourcesPolicy unnamedSourcesPolicy);

		/**
		 * @see <a href="http://schema.org/vatID">http://schema.org/vatID</a>
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
		 * @see <a href="http://schema.org/numberedPosition">http://schema.org/numberedPosition</a>
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
		 * @see <a href="http://schema.org/acquiredFrom">http://schema.org/acquiredFrom</a>
		 */
		public Container.AcquiredFrom getAcquiredFrom();
		public void setAcquiredFrom(Container.AcquiredFrom acquiredFrom);

		/**
		 * @see <a href="http://schema.org/ownedFrom">http://schema.org/ownedFrom</a>
		 */
		public Container.OwnedFrom getOwnedFrom();
		public void setOwnedFrom(Container.OwnedFrom ownedFrom);

		/**
		 * @see <a href="http://schema.org/ownedThrough">http://schema.org/ownedThrough</a>
		 */
		public Container.OwnedThrough getOwnedThrough();
		public void setOwnedThrough(Container.OwnedThrough ownedThrough);

		/**
		 * @see <a href="http://schema.org/typeOfGood">http://schema.org/typeOfGood</a>
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
		 * @see <a href="http://schema.org/deliveryAddress">http://schema.org/deliveryAddress</a>
		 */
		public Container.DeliveryAddress getDeliveryAddress();
		public void setDeliveryAddress(Container.DeliveryAddress deliveryAddress);

		/**
		 * @see <a href="http://schema.org/deliveryStatus">http://schema.org/deliveryStatus</a>
		 */
		public Container.DeliveryStatus getDeliveryStatus();
		public void setDeliveryStatus(Container.DeliveryStatus deliveryStatus);

		/**
		 * @see <a href="http://schema.org/expectedArrivalFrom">http://schema.org/expectedArrivalFrom</a>
		 */
		public Container.ExpectedArrivalFrom getExpectedArrivalFrom();
		public void setExpectedArrivalFrom(Container.ExpectedArrivalFrom expectedArrivalFrom);

		/**
		 * @see <a href="http://schema.org/expectedArrivalUntil">http://schema.org/expectedArrivalUntil</a>
		 */
		public Container.ExpectedArrivalUntil getExpectedArrivalUntil();
		public void setExpectedArrivalUntil(Container.ExpectedArrivalUntil expectedArrivalUntil);

		/**
		 * @see <a href="http://schema.org/hasDeliveryMethod">http://schema.org/hasDeliveryMethod</a>
		 */
		public Container.HasDeliveryMethod getHasDeliveryMethod();
		public void setHasDeliveryMethod(Container.HasDeliveryMethod hasDeliveryMethod);

		/**
		 * @see <a href="http://schema.org/itemShipped">http://schema.org/itemShipped</a>
		 */
		public Container.ItemShipped getItemShipped();
		public void setItemShipped(Container.ItemShipped itemShipped);

		/**
		 * @see <a href="http://schema.org/originAddress">http://schema.org/originAddress</a>
		 */
		public Container.OriginAddress getOriginAddress();
		public void setOriginAddress(Container.OriginAddress originAddress);

		/**
		 * @see <a href="http://schema.org/partOfOrder">http://schema.org/partOfOrder</a>
		 */
		public Container.PartOfOrder getPartOfOrder();
		public void setPartOfOrder(Container.PartOfOrder partOfOrder);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * @see <a href="http://schema.org/trackingNumber">http://schema.org/trackingNumber</a>
		 */
		public Container.TrackingNumber getTrackingNumber();
		public void setTrackingNumber(Container.TrackingNumber trackingNumber);

		/**
		 * @see <a href="http://schema.org/trackingUrl">http://schema.org/trackingUrl</a>
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
			+ "A private parcel service as the delivery mode available for a certain"
			+ " offer.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#DHL</li>\n<li>http://purl.org/goodrelations/v1#FederalExpress</li>\n<li>http://purl.org/goodrelations/v1#UPS</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/childMaxAge">http://schema.org/childMaxAge</a>
		 */
		public Container.ChildMaxAge getChildMaxAge();
		public void setChildMaxAge(Container.ChildMaxAge childMaxAge);

		/**
		 * @see <a href="http://schema.org/childMinAge">http://schema.org/childMinAge</a>
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
		 * @see <a href="http://schema.org/purpose">http://schema.org/purpose</a>
		 */
		public Purpose getPurpose();
		public void setPurpose(Purpose purpose);

		/**
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/cashBack">http://schema.org/cashBack</a>
		 */
		public CashBack getCashBack();
		public void setCashBack(CashBack cashBack);

		/**
		 * @see <a href="http://schema.org/contactlessPayment">http://schema.org/contactlessPayment</a>
		 */
		public ContactlessPayment getContactlessPayment();
		public void setContactlessPayment(ContactlessPayment contactlessPayment);

		/**
		 * @see <a href="http://schema.org/floorLimit">http://schema.org/floorLimit</a>
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
		 * @see <a href="http://schema.org/appliesToDeliveryMethod">http://schema.org/appliesToDeliveryMethod</a>
		 */
		public Container.AppliesToDeliveryMethod getAppliesToDeliveryMethod();
		public void setAppliesToDeliveryMethod(Container.AppliesToDeliveryMethod appliesToDeliveryMethod);

		/**
		 * @see <a href="http://schema.org/appliesToPaymentMethod">http://schema.org/appliesToPaymentMethod</a>
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
			+ "A payment method is a standardized procedure for transferring the monetary"
			+ " amount for a purchase. Payment methods are characterized by the legal and"
			+ " technical structures used, and by the organization or group carrying out the"
			+ " transaction.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#ByBankTransferInAdvance</li>\n<li>http://purl.org/goodrelations/v1#ByInvoice</li>\n<li>http://purl.org/goodrelations/v1#Cash</li>\n<li>http://purl.org/goodrelations/v1#CheckInAdvance</li>\n<li>http://purl.org/goodrelations/v1#COD</li>\n<li>http://purl.org/goodrelations/v1#DirectDebit</li>\n<li>http://purl.org/goodrelations/v1#GoogleCheckout</li>\n<li>http://purl.org/goodrelations/v1#PayPal</li>\n<li>http://purl.org/goodrelations/v1#PaySwarm</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/healthCondition">http://schema.org/healthCondition</a>
		 */
		public HealthCondition getHealthCondition();
		public void setHealthCondition(HealthCondition healthCondition);

		/**
		 * @see <a href="http://schema.org/requiredGender">http://schema.org/requiredGender</a>
		 */
		public Container.RequiredGender getRequiredGender();
		public void setRequiredGender(Container.RequiredGender requiredGender);

		/**
		 * @see <a href="http://schema.org/requiredMaxAge">http://schema.org/requiredMaxAge</a>
		 */
		public Container.RequiredMaxAge getRequiredMaxAge();
		public void setRequiredMaxAge(Container.RequiredMaxAge requiredMaxAge);

		/**
		 * @see <a href="http://schema.org/requiredMinAge">http://schema.org/requiredMinAge</a>
		 */
		public Container.RequiredMinAge getRequiredMinAge();
		public void setRequiredMinAge(Container.RequiredMinAge requiredMinAge);

		/**
		 * @see <a href="http://schema.org/suggestedGender">http://schema.org/suggestedGender</a>
		 */
		public Container.SuggestedGender getSuggestedGender();
		public void setSuggestedGender(Container.SuggestedGender suggestedGender);

		/**
		 * @see <a href="http://schema.org/suggestedMaxAge">http://schema.org/suggestedMaxAge</a>
		 */
		public Container.SuggestedMaxAge getSuggestedMaxAge();
		public void setSuggestedMaxAge(Container.SuggestedMaxAge suggestedMaxAge);

		/**
		 * @see <a href="http://schema.org/suggestedMinAge">http://schema.org/suggestedMinAge</a>
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
		 * @see <a href="http://schema.org/entertainmentBusiness">http://schema.org/entertainmentBusiness</a>
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
		 * @see <a href="http://schema.org/characterName">http://schema.org/characterName</a>
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
			+ " or newspaper to continue indefinitely.<br/><br/>\n\nSee also <a"
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
		 * @see <a href="http://schema.org/issuedBy">http://schema.org/issuedBy</a>
		 */
		public Container.IssuedBy getIssuedBy();
		public void setIssuedBy(Container.IssuedBy issuedBy);

		/**
		 * @see <a href="http://schema.org/issuedThrough">http://schema.org/issuedThrough</a>
		 */
		public Container.IssuedThrough getIssuedThrough();
		public void setIssuedThrough(Container.IssuedThrough issuedThrough);

		/**
		 * @see <a href="http://schema.org/permitAudience">http://schema.org/permitAudience</a>
		 */
		public Container.PermitAudience getPermitAudience();
		public void setPermitAudience(Container.PermitAudience permitAudience);

		/**
		 * @see <a href="http://schema.org/validFor">http://schema.org/validFor</a>
		 */
		public Container.ValidFor getValidFor();
		public void setValidFor(Container.ValidFor validFor);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validIn">http://schema.org/validIn</a>
		 */
		public Container.ValidIn getValidIn();
		public void setValidIn(Container.ValidIn validIn);

		/**
		 * @see <a href="http://schema.org/validUntil">http://schema.org/validUntil</a>
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
		 * @see <a href="http://schema.org/additionalName">http://schema.org/additionalName</a>
		 */
		public Container.AdditionalName getAdditionalName();
		public void setAdditionalName(Container.AdditionalName additionalName);

		/**
		 * @see <a href="http://schema.org/address">http://schema.org/address</a>
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * @see <a href="http://schema.org/affiliation">http://schema.org/affiliation</a>
		 */
		public Container.Affiliation getAffiliation();
		public void setAffiliation(Container.Affiliation affiliation);

		/**
		 * @see <a href="http://schema.org/alumniOf">http://schema.org/alumniOf</a>
		 */
		public Container.AlumniOf getAlumniOf();
		public void setAlumniOf(Container.AlumniOf alumniOf);

		/**
		 * @see <a href="http://schema.org/award">http://schema.org/award</a>
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * @see <a href="http://schema.org/birthDate">http://schema.org/birthDate</a>
		 */
		public Container.BirthDate getBirthDate();
		public void setBirthDate(Container.BirthDate birthDate);

		/**
		 * @see <a href="http://schema.org/birthPlace">http://schema.org/birthPlace</a>
		 */
		public Container.BirthPlace getBirthPlace();
		public void setBirthPlace(Container.BirthPlace birthPlace);

		/**
		 * @see <a href="http://schema.org/brand">http://schema.org/brand</a>
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * @see <a href="http://schema.org/children">http://schema.org/children</a>
		 */
		public Container.Children getChildren();
		public void setChildren(Container.Children children);

		/**
		 * @see <a href="http://schema.org/colleague">http://schema.org/colleague</a>
		 */
		public Container.Colleague getColleague();
		public void setColleague(Container.Colleague colleague);

		/**
		 * @see <a href="http://schema.org/contactPoint">http://schema.org/contactPoint</a>
		 */
		public Container.ContactPoint getContactPoint();
		public void setContactPoint(Container.ContactPoint contactPoint);

		/**
		 * @see <a href="http://schema.org/deathDate">http://schema.org/deathDate</a>
		 */
		public Container.DeathDate getDeathDate();
		public void setDeathDate(Container.DeathDate deathDate);

		/**
		 * @see <a href="http://schema.org/deathPlace">http://schema.org/deathPlace</a>
		 */
		public Container.DeathPlace getDeathPlace();
		public void setDeathPlace(Container.DeathPlace deathPlace);

		/**
		 * @see <a href="http://schema.org/duns">http://schema.org/duns</a>
		 */
		public Container.Duns getDuns();
		public void setDuns(Container.Duns duns);

		/**
		 * @see <a href="http://schema.org/email">http://schema.org/email</a>
		 */
		public Container.Email getEmail();
		public void setEmail(Container.Email email);

		/**
		 * @see <a href="http://schema.org/familyName">http://schema.org/familyName</a>
		 */
		public Container.FamilyName getFamilyName();
		public void setFamilyName(Container.FamilyName familyName);

		/**
		 * @see <a href="http://kyojo.org/schemaSpl/familyNameRuby">http://kyojo.org/schemaSpl/familyNameRuby</a>
		 */
		public Container.FamilyNameRuby getFamilyNameRuby();
		public void setFamilyNameRuby(Container.FamilyNameRuby familyNameRuby);

		/**
		 * @see <a href="http://schema.org/faxNumber">http://schema.org/faxNumber</a>
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * @see <a href="http://schema.org/follows">http://schema.org/follows</a>
		 */
		public Container.Follows getFollows();
		public void setFollows(Container.Follows follows);

		/**
		 * @see <a href="http://schema.org/funder">http://schema.org/funder</a>
		 */
		public Container.Funder getFunder();
		public void setFunder(Container.Funder funder);

		/**
		 * @see <a href="http://schema.org/gender">http://schema.org/gender</a>
		 */
		public Container.Gender getGender();
		public void setGender(Container.Gender gender);

		/**
		 * @see <a href="http://schema.org/givenName">http://schema.org/givenName</a>
		 */
		public Container.GivenName getGivenName();
		public void setGivenName(Container.GivenName givenName);

		/**
		 * @see <a href="http://kyojo.org/schemaSpl/givenNameRuby">http://kyojo.org/schemaSpl/givenNameRuby</a>
		 */
		public Container.GivenNameRuby getGivenNameRuby();
		public void setGivenNameRuby(Container.GivenNameRuby givenNameRuby);

		/**
		 * @see <a href="http://schema.org/globalLocationNumber">http://schema.org/globalLocationNumber</a>
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * @see <a href="http://schema.org/hasOccupation">http://schema.org/hasOccupation</a>
		 */
		public HasOccupation getHasOccupation();
		public void setHasOccupation(HasOccupation hasOccupation);

		/**
		 * @see <a href="http://schema.org/hasOfferCatalog">http://schema.org/hasOfferCatalog</a>
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * @see <a href="http://schema.org/hasPOS">http://schema.org/hasPOS</a>
		 */
		public Container.HasPOS getHasPOS();
		public void setHasPOS(Container.HasPOS hasPOS);

		/**
		 * @see <a href="http://schema.org/height">http://schema.org/height</a>
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * @see <a href="http://schema.org/homeLocation">http://schema.org/homeLocation</a>
		 */
		public Container.HomeLocation getHomeLocation();
		public void setHomeLocation(Container.HomeLocation homeLocation);

		/**
		 * @see <a href="http://schema.org/honorificPrefix">http://schema.org/honorificPrefix</a>
		 */
		public Container.HonorificPrefix getHonorificPrefix();
		public void setHonorificPrefix(Container.HonorificPrefix honorificPrefix);

		/**
		 * @see <a href="http://schema.org/honorificSuffix">http://schema.org/honorificSuffix</a>
		 */
		public Container.HonorificSuffix getHonorificSuffix();
		public void setHonorificSuffix(Container.HonorificSuffix honorificSuffix);

		/**
		 * @see <a href="http://schema.org/isicV4">http://schema.org/isicV4</a>
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * @see <a href="http://schema.org/jobTitle">http://schema.org/jobTitle</a>
		 */
		public Container.JobTitle getJobTitle();
		public void setJobTitle(Container.JobTitle jobTitle);

		/**
		 * @see <a href="http://schema.org/knows">http://schema.org/knows</a>
		 */
		public Container.Knows getKnows();
		public void setKnows(Container.Knows knows);

		/**
		 * @see <a href="http://schema.org/knowsAbout">http://schema.org/knowsAbout</a>
		 */
		public KnowsAbout getKnowsAbout();
		public void setKnowsAbout(KnowsAbout knowsAbout);

		/**
		 * @see <a href="http://schema.org/knowsLanguage">http://schema.org/knowsLanguage</a>
		 */
		public KnowsLanguage getKnowsLanguage();
		public void setKnowsLanguage(KnowsLanguage knowsLanguage);

		/**
		 * @see <a href="http://schema.org/makesOffer">http://schema.org/makesOffer</a>
		 */
		public Container.MakesOffer getMakesOffer();
		public void setMakesOffer(Container.MakesOffer makesOffer);

		/**
		 * @see <a href="http://schema.org/memberOf">http://schema.org/memberOf</a>
		 */
		public Container.MemberOf getMemberOf();
		public void setMemberOf(Container.MemberOf memberOf);

		/**
		 * @see <a href="http://schema.org/naics">http://schema.org/naics</a>
		 */
		public Container.Naics getNaics();
		public void setNaics(Container.Naics naics);

		/**
		 * @see <a href="http://schema.org/nationality">http://schema.org/nationality</a>
		 */
		public Container.Nationality getNationality();
		public void setNationality(Container.Nationality nationality);

		/**
		 * @see <a href="http://schema.org/netWorth">http://schema.org/netWorth</a>
		 */
		public Container.NetWorth getNetWorth();
		public void setNetWorth(Container.NetWorth netWorth);

		/**
		 * @see <a href="http://schema.org/owns">http://schema.org/owns</a>
		 */
		public Container.Owns getOwns();
		public void setOwns(Container.Owns owns);

		/**
		 * @see <a href="http://schema.org/parent">http://schema.org/parent</a>
		 */
		public Container.Parent getParent();
		public void setParent(Container.Parent parent);

		/**
		 * @see <a href="http://schema.org/performerIn">http://schema.org/performerIn</a>
		 */
		public Container.PerformerIn getPerformerIn();
		public void setPerformerIn(Container.PerformerIn performerIn);

		/**
		 * @see <a href="http://schema.org/publishingPrinciples">http://schema.org/publishingPrinciples</a>
		 */
		public Container.PublishingPrinciples getPublishingPrinciples();
		public void setPublishingPrinciples(Container.PublishingPrinciples publishingPrinciples);

		/**
		 * @see <a href="http://schema.org/relatedTo">http://schema.org/relatedTo</a>
		 */
		public Container.RelatedTo getRelatedTo();
		public void setRelatedTo(Container.RelatedTo relatedTo);

		/**
		 * @see <a href="http://schema.org/seeks">http://schema.org/seeks</a>
		 */
		public Container.Seeks getSeeks();
		public void setSeeks(Container.Seeks seeks);

		/**
		 * @see <a href="http://schema.org/sibling">http://schema.org/sibling</a>
		 */
		public Container.Sibling getSibling();
		public void setSibling(Container.Sibling sibling);

		/**
		 * @see <a href="http://schema.org/sponsor">http://schema.org/sponsor</a>
		 */
		public Container.Sponsor getSponsor();
		public void setSponsor(Container.Sponsor sponsor);

		/**
		 * @see <a href="http://schema.org/spouse">http://schema.org/spouse</a>
		 */
		public Container.Spouse getSpouse();
		public void setSpouse(Container.Spouse spouse);

		/**
		 * @see <a href="http://schema.org/taxID">http://schema.org/taxID</a>
		 */
		public Container.TaxID getTaxID();
		public void setTaxID(Container.TaxID taxID);

		/**
		 * @see <a href="http://schema.org/telephone">http://schema.org/telephone</a>
		 */
		public Container.Telephone getTelephone();
		public void setTelephone(Container.Telephone telephone);

		/**
		 * @see <a href="http://schema.org/vatID">http://schema.org/vatID</a>
		 */
		public Container.VatID getVatID();
		public void setVatID(Container.VatID vatID);

		/**
		 * @see <a href="http://schema.org/weight">http://schema.org/weight</a>
		 */
		public Container.Weight getWeight();
		public void setWeight(Container.Weight weight);

		/**
		 * @see <a href="http://schema.org/workLocation">http://schema.org/workLocation</a>
		 */
		public Container.WorkLocation getWorkLocation();
		public void setWorkLocation(Container.WorkLocation workLocation);

		/**
		 * @see <a href="http://schema.org/worksFor">http://schema.org/worksFor</a>
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
		 * @see <a href="http://schema.org/availableService">http://schema.org/availableService</a>
		 */
		public AvailableService getAvailableService();
		public void setAvailableService(AvailableService availableService);

		/**
		 * @see <a href="http://schema.org/hospitalAffiliation">http://schema.org/hospitalAffiliation</a>
		 */
		public HospitalAffiliation getHospitalAffiliation();
		public void setHospitalAffiliation(HospitalAffiliation hospitalAffiliation);

		/**
		 * @see <a href="http://schema.org/medicalSpecialty">http://schema.org/medicalSpecialty</a>
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
		 * @see <a href="http://schema.org/additionalProperty">http://schema.org/additionalProperty</a>
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * @see <a href="http://schema.org/address">http://schema.org/address</a>
		 */
		public Container.Address getAddress();
		public void setAddress(Container.Address address);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/amenityFeature">http://schema.org/amenityFeature</a>
		 */
		public Container.AmenityFeature getAmenityFeature();
		public void setAmenityFeature(Container.AmenityFeature amenityFeature);

		/**
		 * @see <a href="http://schema.org/branchCode">http://schema.org/branchCode</a>
		 */
		public Container.BranchCode getBranchCode();
		public void setBranchCode(Container.BranchCode branchCode);

		/**
		 * @see <a href="http://schema.org/containedInPlace">http://schema.org/containedInPlace</a>
		 */
		public Container.ContainedInPlace getContainedInPlace();
		public void setContainedInPlace(Container.ContainedInPlace containedInPlace);

		/**
		 * @see <a href="http://schema.org/containsPlace">http://schema.org/containsPlace</a>
		 */
		public Container.ContainsPlace getContainsPlace();
		public void setContainsPlace(Container.ContainsPlace containsPlace);

		/**
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
		 */
		public Container.Event getEvent();
		public void setEvent(Container.Event event);

		/**
		 * @see <a href="http://schema.org/faxNumber">http://schema.org/faxNumber</a>
		 */
		public Container.FaxNumber getFaxNumber();
		public void setFaxNumber(Container.FaxNumber faxNumber);

		/**
		 * @see <a href="http://schema.org/geo">http://schema.org/geo</a>
		 */
		public Container.Geo getGeo();
		public void setGeo(Container.Geo geo);

		/**
		 * @see <a href="http://schema.org/geospatiallyContains">http://schema.org/geospatiallyContains</a>
		 */
		public GeospatiallyContains getGeospatiallyContains();
		public void setGeospatiallyContains(GeospatiallyContains geospatiallyContains);

		/**
		 * @see <a href="http://schema.org/geospatiallyCoveredBy">http://schema.org/geospatiallyCoveredBy</a>
		 */
		public GeospatiallyCoveredBy getGeospatiallyCoveredBy();
		public void setGeospatiallyCoveredBy(GeospatiallyCoveredBy geospatiallyCoveredBy);

		/**
		 * @see <a href="http://schema.org/geospatiallyCovers">http://schema.org/geospatiallyCovers</a>
		 */
		public GeospatiallyCovers getGeospatiallyCovers();
		public void setGeospatiallyCovers(GeospatiallyCovers geospatiallyCovers);

		/**
		 * @see <a href="http://schema.org/geospatiallyCrosses">http://schema.org/geospatiallyCrosses</a>
		 */
		public GeospatiallyCrosses getGeospatiallyCrosses();
		public void setGeospatiallyCrosses(GeospatiallyCrosses geospatiallyCrosses);

		/**
		 * @see <a href="http://schema.org/geospatiallyDisjoint">http://schema.org/geospatiallyDisjoint</a>
		 */
		public GeospatiallyDisjoint getGeospatiallyDisjoint();
		public void setGeospatiallyDisjoint(GeospatiallyDisjoint geospatiallyDisjoint);

		/**
		 * @see <a href="http://schema.org/geospatiallyEquals">http://schema.org/geospatiallyEquals</a>
		 */
		public GeospatiallyEquals getGeospatiallyEquals();
		public void setGeospatiallyEquals(GeospatiallyEquals geospatiallyEquals);

		/**
		 * @see <a href="http://schema.org/geospatiallyIntersects">http://schema.org/geospatiallyIntersects</a>
		 */
		public GeospatiallyIntersects getGeospatiallyIntersects();
		public void setGeospatiallyIntersects(GeospatiallyIntersects geospatiallyIntersects);

		/**
		 * @see <a href="http://schema.org/geospatiallyOverlaps">http://schema.org/geospatiallyOverlaps</a>
		 */
		public GeospatiallyOverlaps getGeospatiallyOverlaps();
		public void setGeospatiallyOverlaps(GeospatiallyOverlaps geospatiallyOverlaps);

		/**
		 * @see <a href="http://schema.org/geospatiallyTouches">http://schema.org/geospatiallyTouches</a>
		 */
		public GeospatiallyTouches getGeospatiallyTouches();
		public void setGeospatiallyTouches(GeospatiallyTouches geospatiallyTouches);

		/**
		 * @see <a href="http://schema.org/geospatiallyWithin">http://schema.org/geospatiallyWithin</a>
		 */
		public GeospatiallyWithin getGeospatiallyWithin();
		public void setGeospatiallyWithin(GeospatiallyWithin geospatiallyWithin);

		/**
		 * @see <a href="http://schema.org/globalLocationNumber">http://schema.org/globalLocationNumber</a>
		 */
		public Container.GlobalLocationNumber getGlobalLocationNumber();
		public void setGlobalLocationNumber(Container.GlobalLocationNumber globalLocationNumber);

		/**
		 * @see <a href="http://schema.org/hasMap">http://schema.org/hasMap</a>
		 */
		public Container.HasMap getHasMap();
		public void setHasMap(Container.HasMap hasMap);

		/**
		 * @see <a href="http://schema.org/isAccessibleForFree">http://schema.org/isAccessibleForFree</a>
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * @see <a href="http://schema.org/isicV4">http://schema.org/isicV4</a>
		 */
		public Container.IsicV4 getIsicV4();
		public void setIsicV4(Container.IsicV4 isicV4);

		/**
		 * @see <a href="http://schema.org/logo">http://schema.org/logo</a>
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * @see <a href="http://schema.org/maximumAttendeeCapacity">http://schema.org/maximumAttendeeCapacity</a>
		 */
		public Container.MaximumAttendeeCapacity getMaximumAttendeeCapacity();
		public void setMaximumAttendeeCapacity(Container.MaximumAttendeeCapacity maximumAttendeeCapacity);

		/**
		 * @see <a href="http://schema.org/openingHoursSpecification">http://schema.org/openingHoursSpecification</a>
		 */
		public Container.OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(Container.OpeningHoursSpecification openingHoursSpecification);

		/**
		 * @see <a href="http://schema.org/photo">http://schema.org/photo</a>
		 */
		public Container.Photo getPhoto();
		public void setPhoto(Container.Photo photo);

		/**
		 * @see <a href="http://schema.org/publicAccess">http://schema.org/publicAccess</a>
		 */
		public Container.PublicAccess getPublicAccess();
		public void setPublicAccess(Container.PublicAccess publicAccess);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/smokingAllowed">http://schema.org/smokingAllowed</a>
		 */
		public Container.SmokingAllowed getSmokingAllowed();
		public void setSmokingAllowed(Container.SmokingAllowed smokingAllowed);

		/**
		 * @see <a href="http://schema.org/specialOpeningHoursSpecification">http://schema.org/specialOpeningHoursSpecification</a>
		 */
		public Container.SpecialOpeningHoursSpecification getSpecialOpeningHoursSpecification();
		public void setSpecialOpeningHoursSpecification(Container.SpecialOpeningHoursSpecification specialOpeningHoursSpecification);

		/**
		 * @see <a href="http://schema.org/telephone">http://schema.org/telephone</a>
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
		 * @see <a href="http://schema.org/scheduledTime">http://schema.org/scheduledTime</a>
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
			+ "The act of playing/exercising/training/performing for enjoyment, leisure,"
			+ " recreation, Competition or exercise.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/event">http://schema.org/event</a>
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
		 * @see <a href="http://schema.org/addressCountry">http://schema.org/addressCountry</a>
		 */
		public Container.AddressCountry getAddressCountry();
		public void setAddressCountry(Container.AddressCountry addressCountry);

		/**
		 * @see <a href="http://schema.org/addressLocality">http://schema.org/addressLocality</a>
		 */
		public Container.AddressLocality getAddressLocality();
		public void setAddressLocality(Container.AddressLocality addressLocality);

		/**
		 * @see <a href="http://schema.org/addressRegion">http://schema.org/addressRegion</a>
		 */
		public Container.AddressRegion getAddressRegion();
		public void setAddressRegion(Container.AddressRegion addressRegion);

		/**
		 * @see <a href="http://kyojo.org/schemaSpl/buildingAddress">http://kyojo.org/schemaSpl/buildingAddress</a>
		 */
		public Container.BuildingAddress getBuildingAddress();
		public void setBuildingAddress(Container.BuildingAddress buildingAddress);

		/**
		 * @see <a href="http://schema.org/postOfficeBoxNumber">http://schema.org/postOfficeBoxNumber</a>
		 */
		public Container.PostOfficeBoxNumber getPostOfficeBoxNumber();
		public void setPostOfficeBoxNumber(Container.PostOfficeBoxNumber postOfficeBoxNumber);

		/**
		 * @see <a href="http://schema.org/postalCode">http://schema.org/postalCode</a>
		 */
		public Container.PostalCode getPostalCode();
		public void setPostalCode(Container.PostalCode postalCode);

		/**
		 * @see <a href="http://schema.org/streetAddress">http://schema.org/streetAddress</a>
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
		 * @see <a href="http://schema.org/eligibleQuantity">http://schema.org/eligibleQuantity</a>
		 */
		public Container.EligibleQuantity getEligibleQuantity();
		public void setEligibleQuantity(Container.EligibleQuantity eligibleQuantity);

		/**
		 * @see <a href="http://schema.org/eligibleTransactionVolume">http://schema.org/eligibleTransactionVolume</a>
		 */
		public Container.EligibleTransactionVolume getEligibleTransactionVolume();
		public void setEligibleTransactionVolume(Container.EligibleTransactionVolume eligibleTransactionVolume);

		/**
		 * @see <a href="http://schema.org/maxPrice">http://schema.org/maxPrice</a>
		 */
		public Container.MaxPrice getMaxPrice();
		public void setMaxPrice(Container.MaxPrice maxPrice);

		/**
		 * @see <a href="http://schema.org/minPrice">http://schema.org/minPrice</a>
		 */
		public Container.MinPrice getMinPrice();
		public void setMinPrice(Container.MinPrice minPrice);

		/**
		 * @see <a href="http://schema.org/price">http://schema.org/price</a>
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * @see <a href="http://schema.org/priceCurrency">http://schema.org/priceCurrency</a>
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * @see <a href="http://schema.org/validFrom">http://schema.org/validFrom</a>
		 */
		public Container.ValidFrom getValidFrom();
		public void setValidFrom(Container.ValidFrom validFrom);

		/**
		 * @see <a href="http://schema.org/validThrough">http://schema.org/validThrough</a>
		 */
		public Container.ValidThrough getValidThrough();
		public void setValidThrough(Container.ValidThrough validThrough);

		/**
		 * @see <a href="http://schema.org/valueAddedTaxIncluded">http://schema.org/valueAddedTaxIncluded</a>
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
		 * @see <a href="http://schema.org/additionalProperty">http://schema.org/additionalProperty</a>
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/award">http://schema.org/award</a>
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * @see <a href="http://schema.org/brand">http://schema.org/brand</a>
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * @see <a href="http://schema.org/color">http://schema.org/color</a>
		 */
		public Container.Color getColor();
		public void setColor(Container.Color color);

		/**
		 * @see <a href="http://schema.org/depth">http://schema.org/depth</a>
		 */
		public Container.Depth getDepth();
		public void setDepth(Container.Depth depth);

		/**
		 * @see <a href="http://schema.org/gtin12">http://schema.org/gtin12</a>
		 */
		public Container.Gtin12 getGtin12();
		public void setGtin12(Container.Gtin12 gtin12);

		/**
		 * @see <a href="http://schema.org/gtin13">http://schema.org/gtin13</a>
		 */
		public Container.Gtin13 getGtin13();
		public void setGtin13(Container.Gtin13 gtin13);

		/**
		 * @see <a href="http://schema.org/gtin14">http://schema.org/gtin14</a>
		 */
		public Container.Gtin14 getGtin14();
		public void setGtin14(Container.Gtin14 gtin14);

		/**
		 * @see <a href="http://schema.org/gtin8">http://schema.org/gtin8</a>
		 */
		public Container.Gtin8 getGtin8();
		public void setGtin8(Container.Gtin8 gtin8);

		/**
		 * @see <a href="http://schema.org/height">http://schema.org/height</a>
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * @see <a href="http://schema.org/isAccessoryOrSparePartFor">http://schema.org/isAccessoryOrSparePartFor</a>
		 */
		public Container.IsAccessoryOrSparePartFor getIsAccessoryOrSparePartFor();
		public void setIsAccessoryOrSparePartFor(Container.IsAccessoryOrSparePartFor isAccessoryOrSparePartFor);

		/**
		 * @see <a href="http://schema.org/isConsumableFor">http://schema.org/isConsumableFor</a>
		 */
		public Container.IsConsumableFor getIsConsumableFor();
		public void setIsConsumableFor(Container.IsConsumableFor isConsumableFor);

		/**
		 * @see <a href="http://schema.org/isRelatedTo">http://schema.org/isRelatedTo</a>
		 */
		public Container.IsRelatedTo getIsRelatedTo();
		public void setIsRelatedTo(Container.IsRelatedTo isRelatedTo);

		/**
		 * @see <a href="http://schema.org/isSimilarTo">http://schema.org/isSimilarTo</a>
		 */
		public Container.IsSimilarTo getIsSimilarTo();
		public void setIsSimilarTo(Container.IsSimilarTo isSimilarTo);

		/**
		 * @see <a href="http://schema.org/itemCondition">http://schema.org/itemCondition</a>
		 */
		public Container.ItemCondition getItemCondition();
		public void setItemCondition(Container.ItemCondition itemCondition);

		/**
		 * @see <a href="http://schema.org/logo">http://schema.org/logo</a>
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * @see <a href="http://schema.org/manufacturer">http://schema.org/manufacturer</a>
		 */
		public Container.Manufacturer getManufacturer();
		public void setManufacturer(Container.Manufacturer manufacturer);

		/**
		 * @see <a href="http://schema.org/material">http://schema.org/material</a>
		 */
		public Container.Material getMaterial();
		public void setMaterial(Container.Material material);

		/**
		 * @see <a href="http://schema.org/model">http://schema.org/model</a>
		 */
		public Container.Model getModel();
		public void setModel(Container.Model model);

		/**
		 * @see <a href="http://schema.org/mpn">http://schema.org/mpn</a>
		 */
		public Container.Mpn getMpn();
		public void setMpn(Container.Mpn mpn);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/productID">http://schema.org/productID</a>
		 */
		public Container.ProductID getProductID();
		public void setProductID(Container.ProductID productID);

		/**
		 * @see <a href="http://schema.org/productionDate">http://schema.org/productionDate</a>
		 */
		public Container.ProductionDate getProductionDate();
		public void setProductionDate(Container.ProductionDate productionDate);

		/**
		 * @see <a href="http://schema.org/purchaseDate">http://schema.org/purchaseDate</a>
		 */
		public Container.PurchaseDate getPurchaseDate();
		public void setPurchaseDate(Container.PurchaseDate purchaseDate);

		/**
		 * @see <a href="http://schema.org/releaseDate">http://schema.org/releaseDate</a>
		 */
		public Container.ReleaseDate getReleaseDate();
		public void setReleaseDate(Container.ReleaseDate releaseDate);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/sku">http://schema.org/sku</a>
		 */
		public Container.Sku getSku();
		public void setSku(Container.Sku sku);

		/**
		 * @see <a href="http://schema.org/weight">http://schema.org/weight</a>
		 */
		public Container.Weight getWeight();
		public void setWeight(Container.Weight weight);

		/**
		 * @see <a href="http://schema.org/width">http://schema.org/width</a>
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
		 * @see <a href="http://schema.org/isVariantOf">http://schema.org/isVariantOf</a>
		 */
		public Container.IsVariantOf getIsVariantOf();
		public void setIsVariantOf(Container.IsVariantOf isVariantOf);

		/**
		 * @see <a href="http://schema.org/predecessorOf">http://schema.org/predecessorOf</a>
		 */
		public Container.PredecessorOf getPredecessorOf();
		public void setPredecessorOf(Container.PredecessorOf predecessorOf);

		/**
		 * @see <a href="http://schema.org/successorOf">http://schema.org/successorOf</a>
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
			+ "Original definition: \"provider of professional services.\"<br/><br/>\n\nThe"
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
		 * @see <a href="http://schema.org/hostingOrganization">http://schema.org/hostingOrganization</a>
		 */
		public Container.HostingOrganization getHostingOrganization();
		public void setHostingOrganization(Container.HostingOrganization hostingOrganization);

		/**
		 * @see <a href="http://schema.org/member">http://schema.org/member</a>
		 */
		public Container.Member getMember();
		public void setMember(Container.Member member);

		/**
		 * @see <a href="http://schema.org/membershipNumber">http://schema.org/membershipNumber</a>
		 */
		public Container.MembershipNumber getMembershipNumber();
		public void setMembershipNumber(Container.MembershipNumber membershipNumber);

		/**
		 * @see <a href="http://schema.org/programName">http://schema.org/programName</a>
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
			+ " property.<br/><br/>\n\nAlways use specific schema.org properties when a) they"
			+ " exist and b) you can populate them. Using PropertyValue as a substitute will"
			+ " typically not trigger the same effect as using the original, specific property.")
	@CamelizedName("propertyValue")
	@ConstantizedName("PROPERTY_VALUE")
	public interface PropertyValue extends SchemaOrgClass, StructuredValue {

		/**
		 * @see <a href="http://schema.org/maxValue">http://schema.org/maxValue</a>
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * @see <a href="http://schema.org/measurementTechnique">http://schema.org/measurementTechnique</a>
		 */
		public MeasurementTechnique getMeasurementTechnique();
		public void setMeasurementTechnique(MeasurementTechnique measurementTechnique);

		/**
		 * @see <a href="http://schema.org/minValue">http://schema.org/minValue</a>
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * @see <a href="http://schema.org/propertyID">http://schema.org/propertyID</a>
		 */
		public Container.PropertyID getPropertyID();
		public void setPropertyID(Container.PropertyID propertyID);

		/**
		 * @see <a href="http://schema.org/unitCode">http://schema.org/unitCode</a>
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * @see <a href="http://schema.org/unitText">http://schema.org/unitText</a>
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		/**
		 * @see <a href="http://schema.org/value">http://schema.org/value</a>
		 */
		public Container.Value getValue();
		public void setValue(Container.Value value);

		/**
		 * @see <a href="http://schema.org/valueReference">http://schema.org/valueReference</a>
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
		 * @see <a href="http://schema.org/defaultValue">http://schema.org/defaultValue</a>
		 */
		public Container.DefaultValue getDefaultValue();
		public void setDefaultValue(Container.DefaultValue defaultValue);

		/**
		 * @see <a href="http://schema.org/maxValue">http://schema.org/maxValue</a>
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * @see <a href="http://schema.org/minValue">http://schema.org/minValue</a>
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * @see <a href="http://schema.org/multipleValues">http://schema.org/multipleValues</a>
		 */
		public Container.MultipleValues getMultipleValues();
		public void setMultipleValues(Container.MultipleValues multipleValues);

		/**
		 * @see <a href="http://schema.org/readonlyValue">http://schema.org/readonlyValue</a>
		 */
		public Container.ReadonlyValue getReadonlyValue();
		public void setReadonlyValue(Container.ReadonlyValue readonlyValue);

		/**
		 * @see <a href="http://schema.org/stepValue">http://schema.org/stepValue</a>
		 */
		public Container.StepValue getStepValue();
		public void setStepValue(Container.StepValue stepValue);

		/**
		 * @see <a href="http://schema.org/valueMaxLength">http://schema.org/valueMaxLength</a>
		 */
		public Container.ValueMaxLength getValueMaxLength();
		public void setValueMaxLength(Container.ValueMaxLength valueMaxLength);

		/**
		 * @see <a href="http://schema.org/valueMinLength">http://schema.org/valueMinLength</a>
		 */
		public Container.ValueMinLength getValueMinLength();
		public void setValueMinLength(Container.ValueMinLength valueMinLength);

		/**
		 * @see <a href="http://schema.org/valueName">http://schema.org/valueName</a>
		 */
		public Container.ValueName getValueName();
		public void setValueName(Container.ValueName valueName);

		/**
		 * @see <a href="http://schema.org/valuePattern">http://schema.org/valuePattern</a>
		 */
		public Container.ValuePattern getValuePattern();
		public void setValuePattern(Container.ValuePattern valuePattern);

		/**
		 * @see <a href="http://schema.org/valueRequired">http://schema.org/valueRequired</a>
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
		 * @see <a href="http://schema.org/isAccessibleForFree">http://schema.org/isAccessibleForFree</a>
		 */
		public Container.IsAccessibleForFree getIsAccessibleForFree();
		public void setIsAccessibleForFree(Container.IsAccessibleForFree isAccessibleForFree);

		/**
		 * @see <a href="http://schema.org/publishedBy">http://schema.org/publishedBy</a>
		 */
		public PublishedBy getPublishedBy();
		public void setPublishedBy(PublishedBy publishedBy);

		/**
		 * @see <a href="http://schema.org/publishedOn">http://schema.org/publishedOn</a>
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
			+ " as articles.<br/><br/>\n\n<a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\">blog"
			+ " post</a>.")
	@CamelizedName("publicationIssue")
	@ConstantizedName("PUBLICATION_ISSUE")
	public interface PublicationIssue extends CreativeWork, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/issueNumber">http://schema.org/issueNumber</a>
		 */
		public Container.IssueNumber getIssueNumber();
		public void setIssueNumber(Container.IssueNumber issueNumber);

		/**
		 * @see <a href="http://schema.org/pageEnd">http://schema.org/pageEnd</a>
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * @see <a href="http://schema.org/pageStart">http://schema.org/pageStart</a>
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * @see <a href="http://schema.org/pagination">http://schema.org/pagination</a>
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
			+ "A part of a successively published publication such as a periodical or"
			+ " multi-volume work, often numbered. It may represent a time span, such as a"
			+ " year.<br/><br/>\n\n<pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a"
			+ " href=\"http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html\"&gt;blog"
			+ " post&lt;/a&gt;.\n</code></pre>\n")
	@CamelizedName("publicationVolume")
	@ConstantizedName("PUBLICATION_VOLUME")
	public interface PublicationVolume extends CreativeWork, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/pageEnd">http://schema.org/pageEnd</a>
		 */
		public Container.PageEnd getPageEnd();
		public void setPageEnd(Container.PageEnd pageEnd);

		/**
		 * @see <a href="http://schema.org/pageStart">http://schema.org/pageStart</a>
		 */
		public Container.PageStart getPageStart();
		public void setPageStart(Container.PageStart pageStart);

		/**
		 * @see <a href="http://schema.org/pagination">http://schema.org/pagination</a>
		 */
		public Container.Pagination getPagination();
		public void setPagination(Container.Pagination pagination);

		/**
		 * @see <a href="http://schema.org/volumeNumber">http://schema.org/volumeNumber</a>
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
		 * @see <a href="http://schema.org/additionalProperty">http://schema.org/additionalProperty</a>
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * @see <a href="http://schema.org/equal">http://schema.org/equal</a>
		 */
		public Container.Equal getEqual();
		public void setEqual(Container.Equal equal);

		/**
		 * @see <a href="http://schema.org/greater">http://schema.org/greater</a>
		 */
		public Container.Greater getGreater();
		public void setGreater(Container.Greater greater);

		/**
		 * @see <a href="http://schema.org/greaterOrEqual">http://schema.org/greaterOrEqual</a>
		 */
		public Container.GreaterOrEqual getGreaterOrEqual();
		public void setGreaterOrEqual(Container.GreaterOrEqual greaterOrEqual);

		/**
		 * @see <a href="http://schema.org/lesser">http://schema.org/lesser</a>
		 */
		public Container.Lesser getLesser();
		public void setLesser(Container.Lesser lesser);

		/**
		 * @see <a href="http://schema.org/lesserOrEqual">http://schema.org/lesserOrEqual</a>
		 */
		public Container.LesserOrEqual getLesserOrEqual();
		public void setLesserOrEqual(Container.LesserOrEqual lesserOrEqual);

		/**
		 * @see <a href="http://schema.org/nonEqual">http://schema.org/nonEqual</a>
		 */
		public Container.NonEqual getNonEqual();
		public void setNonEqual(Container.NonEqual nonEqual);

		/**
		 * @see <a href="http://schema.org/valueReference">http://schema.org/valueReference</a>
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
		 * @see <a href="http://schema.org/additionalProperty">http://schema.org/additionalProperty</a>
		 */
		public Container.AdditionalProperty getAdditionalProperty();
		public void setAdditionalProperty(Container.AdditionalProperty additionalProperty);

		/**
		 * @see <a href="http://schema.org/maxValue">http://schema.org/maxValue</a>
		 */
		public Container.MaxValue getMaxValue();
		public void setMaxValue(Container.MaxValue maxValue);

		/**
		 * @see <a href="http://schema.org/minValue">http://schema.org/minValue</a>
		 */
		public Container.MinValue getMinValue();
		public void setMinValue(Container.MinValue minValue);

		/**
		 * @see <a href="http://schema.org/unitCode">http://schema.org/unitCode</a>
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * @see <a href="http://schema.org/unitText">http://schema.org/unitText</a>
		 */
		public Container.UnitText getUnitText();
		public void setUnitText(Container.UnitText unitText);

		/**
		 * @see <a href="http://schema.org/value">http://schema.org/value</a>
		 */
		public Container.Value getValue();
		public void setValue(Container.Value value);

		/**
		 * @see <a href="http://schema.org/valueReference">http://schema.org/valueReference</a>
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
		 * @see <a href="http://schema.org/acceptedAnswer">http://schema.org/acceptedAnswer</a>
		 */
		public Container.AcceptedAnswer getAcceptedAnswer();
		public void setAcceptedAnswer(Container.AcceptedAnswer acceptedAnswer);

		/**
		 * @see <a href="http://schema.org/answerCount">http://schema.org/answerCount</a>
		 */
		public Container.AnswerCount getAnswerCount();
		public void setAnswerCount(Container.AnswerCount answerCount);

		/**
		 * @see <a href="http://schema.org/downvoteCount">http://schema.org/downvoteCount</a>
		 */
		public Container.DownvoteCount getDownvoteCount();
		public void setDownvoteCount(Container.DownvoteCount downvoteCount);

		/**
		 * @see <a href="http://schema.org/suggestedAnswer">http://schema.org/suggestedAnswer</a>
		 */
		public Container.SuggestedAnswer getSuggestedAnswer();
		public void setSuggestedAnswer(Container.SuggestedAnswer suggestedAnswer);

		/**
		 * @see <a href="http://schema.org/upvoteCount">http://schema.org/upvoteCount</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/containsSeason">http://schema.org/containsSeason</a>
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/episode">http://schema.org/episode</a>
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/numberOfEpisodes">http://schema.org/numberOfEpisodes</a>
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * @see <a href="http://schema.org/numberOfSeasons">http://schema.org/numberOfSeasons</a>
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/author">http://schema.org/author</a>
		 */
		public Container.Author getAuthor();
		public void setAuthor(Container.Author author);

		/**
		 * @see <a href="http://schema.org/bestRating">http://schema.org/bestRating</a>
		 */
		public Container.BestRating getBestRating();
		public void setBestRating(Container.BestRating bestRating);

		/**
		 * @see <a href="http://schema.org/ratingValue">http://schema.org/ratingValue</a>
		 */
		public Container.RatingValue getRatingValue();
		public void setRatingValue(Container.RatingValue ratingValue);

		/**
		 * @see <a href="http://schema.org/reviewAspect">http://schema.org/reviewAspect</a>
		 */
		public ReviewAspect getReviewAspect();
		public void setReviewAspect(ReviewAspect reviewAspect);

		/**
		 * @see <a href="http://schema.org/worstRating">http://schema.org/worstRating</a>
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
			+ "The act of physically/electronically taking delivery of an object thathas been"
			+ " transferred from an origin to a destination. Reciprocal of"
			+ " SendAction.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/SendAction\">SendAction</a>: The"
			+ " reciprocal of ReceiveAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/TakeAction\">TakeAction</a>: Unlike TakeAction,"
			+ " ReceiveAction does not imply that the ownership has been transfered (e.g. I can"
			+ " receive a package, but it does not mean the package is now mine).</li>\n</ul>\n")
	@CamelizedName("receiveAction")
	@ConstantizedName("RECEIVE_ACTION")
	public interface ReceiveAction extends SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/deliveryMethod">http://schema.org/deliveryMethod</a>
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		/**
		 * @see <a href="http://schema.org/sender">http://schema.org/sender</a>
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
		 * @see <a href="http://schema.org/cookTime">http://schema.org/cookTime</a>
		 */
		public Container.CookTime getCookTime();
		public void setCookTime(Container.CookTime cookTime);

		/**
		 * @see <a href="http://schema.org/cookingMethod">http://schema.org/cookingMethod</a>
		 */
		public Container.CookingMethod getCookingMethod();
		public void setCookingMethod(Container.CookingMethod cookingMethod);

		/**
		 * @see <a href="http://schema.org/nutrition">http://schema.org/nutrition</a>
		 */
		public Container.Nutrition getNutrition();
		public void setNutrition(Container.Nutrition nutrition);

		/**
		 * @see <a href="http://schema.org/recipeCategory">http://schema.org/recipeCategory</a>
		 */
		public Container.RecipeCategory getRecipeCategory();
		public void setRecipeCategory(Container.RecipeCategory recipeCategory);

		/**
		 * @see <a href="http://schema.org/recipeCuisine">http://schema.org/recipeCuisine</a>
		 */
		public Container.RecipeCuisine getRecipeCuisine();
		public void setRecipeCuisine(Container.RecipeCuisine recipeCuisine);

		/**
		 * @see <a href="http://schema.org/recipeIngredient">http://schema.org/recipeIngredient</a>
		 */
		public Container.RecipeIngredient getRecipeIngredient();
		public void setRecipeIngredient(Container.RecipeIngredient recipeIngredient);

		/**
		 * @see <a href="http://schema.org/recipeInstructions">http://schema.org/recipeInstructions</a>
		 */
		public Container.RecipeInstructions getRecipeInstructions();
		public void setRecipeInstructions(Container.RecipeInstructions recipeInstructions);

		/**
		 * @see <a href="http://schema.org/recipeYield">http://schema.org/recipeYield</a>
		 */
		public Container.RecipeYield getRecipeYield();
		public void setRecipeYield(Container.RecipeYield recipeYield);

		/**
		 * @see <a href="http://schema.org/suitableForDiet">http://schema.org/suitableForDiet</a>
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
			+ "The act of registering to be a user of a service, product or web"
			+ " page.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/JoinAction\">JoinAction</a>:"
			+ " Unlike JoinAction, RegisterAction implies you are registering to be a user of a"
			+ " service, <em>not</em> a group/team of people.</li>\n<li>[FollowAction]]: Unlike"
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
			+ "The act of rejecting to/adopting an object.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/landlord">http://schema.org/landlord</a>
		 */
		public Container.Landlord getLandlord();
		public void setLandlord(Container.Landlord landlord);

		/**
		 * @see <a href="http://schema.org/realEstateAgent">http://schema.org/realEstateAgent</a>
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
			+ "A reservation for a rental car.<br/><br/>\n\nNote: This type is for information"
			+ " about actual reservations, e.g. in confirmation emails or HTML pages with"
			+ " individual confirmations of reservations.")
	@CamelizedName("rentalCarReservation")
	@ConstantizedName("RENTAL_CAR_RESERVATION")
	public interface RentalCarReservation extends Reservation, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/dropoffLocation">http://schema.org/dropoffLocation</a>
		 */
		public Container.DropoffLocation getDropoffLocation();
		public void setDropoffLocation(Container.DropoffLocation dropoffLocation);

		/**
		 * @see <a href="http://schema.org/dropoffTime">http://schema.org/dropoffTime</a>
		 */
		public Container.DropoffTime getDropoffTime();
		public void setDropoffTime(Container.DropoffTime dropoffTime);

		/**
		 * @see <a href="http://schema.org/pickupLocation">http://schema.org/pickupLocation</a>
		 */
		public Container.PickupLocation getPickupLocation();
		public void setPickupLocation(Container.PickupLocation pickupLocation);

		/**
		 * @see <a href="http://schema.org/pickupTime">http://schema.org/pickupTime</a>
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
		 * @see <a href="http://schema.org/replacee">http://schema.org/replacee</a>
		 */
		public Container.Replacee getReplacee();
		public void setReplacee(Container.Replacee replacee);

		/**
		 * @see <a href="http://schema.org/replacer">http://schema.org/replacer</a>
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
			+ "The act of responding to a question/message asked/sent by the object. Related to"
			+ " <a class=\"localLink\""
			+ " href=\"http://schema.org/AskAction\">AskAction</a><br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/AskAction\">AskAction</a>: Appears generally as an"
			+ " origin of a ReplyAction.</li>\n</ul>\n")
	@CamelizedName("replyAction")
	@ConstantizedName("REPLY_ACTION")
	public interface ReplyAction extends CommunicateAction, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/resultComment">http://schema.org/resultComment</a>
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
		 * @see <a href="http://schema.org/reportNumber">http://schema.org/reportNumber</a>
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
			+ " require tickets. <br/><br/>\n\nNote: This type is for information about actual"
			+ " reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, restaurant reservations,"
			+ " flights, or rental cars, use <a class=\"localLink\""
			+ " href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("reservation")
	@ConstantizedName("RESERVATION")
	public interface Reservation extends Intangible, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/bookingTime">http://schema.org/bookingTime</a>
		 */
		public Container.BookingTime getBookingTime();
		public void setBookingTime(Container.BookingTime bookingTime);

		/**
		 * @see <a href="http://schema.org/broker">http://schema.org/broker</a>
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * @see <a href="http://schema.org/modifiedTime">http://schema.org/modifiedTime</a>
		 */
		public Container.ModifiedTime getModifiedTime();
		public void setModifiedTime(Container.ModifiedTime modifiedTime);

		/**
		 * @see <a href="http://schema.org/priceCurrency">http://schema.org/priceCurrency</a>
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * @see <a href="http://schema.org/programMembershipUsed">http://schema.org/programMembershipUsed</a>
		 */
		public Container.ProgramMembershipUsed getProgramMembershipUsed();
		public void setProgramMembershipUsed(Container.ProgramMembershipUsed programMembershipUsed);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * @see <a href="http://schema.org/reservationFor">http://schema.org/reservationFor</a>
		 */
		public Container.ReservationFor getReservationFor();
		public void setReservationFor(Container.ReservationFor reservationFor);

		/**
		 * @see <a href="http://schema.org/reservationId">http://schema.org/reservationId</a>
		 */
		public Container.ReservationId getReservationId();
		public void setReservationId(Container.ReservationId reservationId);

		/**
		 * @see <a href="http://schema.org/reservationStatus">http://schema.org/reservationStatus</a>
		 */
		public Container.ReservationStatus getReservationStatus();
		public void setReservationStatus(Container.ReservationStatus reservationStatus);

		/**
		 * @see <a href="http://schema.org/reservedTicket">http://schema.org/reservedTicket</a>
		 */
		public Container.ReservedTicket getReservedTicket();
		public void setReservedTicket(Container.ReservedTicket reservedTicket);

		/**
		 * @see <a href="http://schema.org/totalPrice">http://schema.org/totalPrice</a>
		 */
		public Container.TotalPrice getTotalPrice();
		public void setTotalPrice(Container.TotalPrice totalPrice);

		/**
		 * @see <a href="http://schema.org/underName">http://schema.org/underName</a>
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
		 * @see <a href="http://schema.org/subReservation">http://schema.org/subReservation</a>
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
			+ "Reserving a concrete object.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
		 * @see <a href="http://schema.org/itemReviewed">http://schema.org/itemReviewed</a>
		 */
		public Container.ItemReviewed getItemReviewed();
		public void setItemReviewed(Container.ItemReviewed itemReviewed);

		/**
		 * @see <a href="http://schema.org/reviewAspect">http://schema.org/reviewAspect</a>
		 */
		public ReviewAspect getReviewAspect();
		public void setReviewAspect(ReviewAspect reviewAspect);

		/**
		 * @see <a href="http://schema.org/reviewBody">http://schema.org/reviewBody</a>
		 */
		public Container.ReviewBody getReviewBody();
		public void setReviewBody(Container.ReviewBody reviewBody);

		/**
		 * @see <a href="http://schema.org/reviewRating">http://schema.org/reviewRating</a>
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
		 * @see <a href="http://schema.org/resultReview">http://schema.org/resultReview</a>
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
			+ " using ordinary properties like 'member' or 'actor'.<br/><br/>\n\nSee also <a"
			+ " href=\"http://blog.schema.org/2014/06/introducing-role.html\">blog post</a>.")
	@CamelizedName("role")
	@ConstantizedName("ROLE")
	public interface Role extends Intangible, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/endDate">http://schema.org/endDate</a>
		 */
		public Container.EndDate getEndDate();
		public void setEndDate(Container.EndDate endDate);

		/**
		 * @see <a href="http://schema.org/roleName">http://schema.org/roleName</a>
		 */
		public Container.RoleName getRoleName();
		public void setRoleName(Container.RoleName roleName);

		/**
		 * @see <a href="http://schema.org/startDate">http://schema.org/startDate</a>
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
		 * @see <a href="http://schema.org/additionalNumberOfGuests">http://schema.org/additionalNumberOfGuests</a>
		 */
		public Container.AdditionalNumberOfGuests getAdditionalNumberOfGuests();
		public void setAdditionalNumberOfGuests(Container.AdditionalNumberOfGuests additionalNumberOfGuests);

		/**
		 * @see <a href="http://schema.org/comment">http://schema.org/comment</a>
		 */
		public Container.Comment getComment();
		public void setComment(Container.Comment comment);

		/**
		 * @see <a href="http://schema.org/rsvpResponse">http://schema.org/rsvpResponse</a>
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
			+ "Scheduling future actions, events, or tasks.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/subtitleLanguage">http://schema.org/subtitleLanguage</a>
		 */
		public Container.SubtitleLanguage getSubtitleLanguage();
		public void setSubtitleLanguage(Container.SubtitleLanguage subtitleLanguage);

		/**
		 * @see <a href="http://schema.org/videoFormat">http://schema.org/videoFormat</a>
		 */
		public Container.VideoFormat getVideoFormat();
		public void setVideoFormat(Container.VideoFormat videoFormat);

		/**
		 * @see <a href="http://schema.org/workPresented">http://schema.org/workPresented</a>
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
			+ "The act of searching for an object.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/FindAction\">FindAction</a>: SearchAction generally"
			+ " leads to a FindAction, but not necessarily.</li>\n</ul>\n")
	@CamelizedName("searchAction")
	@ConstantizedName("SEARCH_ACTION")
	public interface SearchAction extends Action, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/query">http://schema.org/query</a>
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
		 * @see <a href="http://schema.org/seatNumber">http://schema.org/seatNumber</a>
		 */
		public Container.SeatNumber getSeatNumber();
		public void setSeatNumber(Container.SeatNumber seatNumber);

		/**
		 * @see <a href="http://schema.org/seatRow">http://schema.org/seatRow</a>
		 */
		public Container.SeatRow getSeatRow();
		public void setSeatRow(Container.SeatRow seatRow);

		/**
		 * @see <a href="http://schema.org/seatSection">http://schema.org/seatSection</a>
		 */
		public Container.SeatSection getSeatSection();
		public void setSeatSection(Container.SeatSection seatSection);

		/**
		 * @see <a href="http://schema.org/seatingType">http://schema.org/seatingType</a>
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
		 * @see <a href="http://schema.org/buyer">http://schema.org/buyer</a>
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
			+ "The act of physically/electronically dispatching an object for transfer from an"
			+ " origin to a destination.Related actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/ReceiveAction\">ReceiveAction</a>:"
			+ " The reciprocal of SendAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/GiveAction\">GiveAction</a>: Unlike GiveAction,"
			+ " SendAction does not imply the transfer of ownership (e.g. I can send you my"
			+ " laptop, but I'm not necessarily giving it to you).</li>\n</ul>\n")
	@CamelizedName("sendAction")
	@ConstantizedName("SEND_ACTION")
	public interface SendAction extends SchemaOrgClass, TransferAction {

		/**
		 * @see <a href="http://schema.org/deliveryMethod">http://schema.org/deliveryMethod</a>
		 */
		public Container.DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(Container.DeliveryMethod deliveryMethod);

		/**
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
			+ " necessarily of the same kind. See also <a class=\"localLink\""
			+ " href=\"http://schema.org/CreativeWorkSeries\">CreativeWorkSeries</a>, <a"
			+ " class=\"localLink\" href=\"http://schema.org/EventSeries\">EventSeries</a>.")
	@CamelizedName("series")
	@ConstantizedName("SERIES")
	public interface Series extends Intangible, SchemaOrgClass {

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
		 * @see <a href="http://schema.org/aggregateRating">http://schema.org/aggregateRating</a>
		 */
		public Container.AggregateRating getAggregateRating();
		public void setAggregateRating(Container.AggregateRating aggregateRating);

		/**
		 * @see <a href="http://schema.org/areaServed">http://schema.org/areaServed</a>
		 */
		public Container.AreaServed getAreaServed();
		public void setAreaServed(Container.AreaServed areaServed);

		/**
		 * @see <a href="http://schema.org/audience">http://schema.org/audience</a>
		 */
		public Container.Audience getAudience();
		public void setAudience(Container.Audience audience);

		/**
		 * @see <a href="http://schema.org/availableChannel">http://schema.org/availableChannel</a>
		 */
		public Container.AvailableChannel getAvailableChannel();
		public void setAvailableChannel(Container.AvailableChannel availableChannel);

		/**
		 * @see <a href="http://schema.org/award">http://schema.org/award</a>
		 */
		public Container.Award getAward();
		public void setAward(Container.Award award);

		/**
		 * @see <a href="http://schema.org/brand">http://schema.org/brand</a>
		 */
		public Container.Brand getBrand();
		public void setBrand(Container.Brand brand);

		/**
		 * @see <a href="http://schema.org/broker">http://schema.org/broker</a>
		 */
		public Container.Broker getBroker();
		public void setBroker(Container.Broker broker);

		/**
		 * @see <a href="http://schema.org/category">http://schema.org/category</a>
		 */
		public Category getCategory();
		public void setCategory(Category category);

		/**
		 * @see <a href="http://schema.org/hasOfferCatalog">http://schema.org/hasOfferCatalog</a>
		 */
		public Container.HasOfferCatalog getHasOfferCatalog();
		public void setHasOfferCatalog(Container.HasOfferCatalog hasOfferCatalog);

		/**
		 * @see <a href="http://schema.org/hoursAvailable">http://schema.org/hoursAvailable</a>
		 */
		public Container.HoursAvailable getHoursAvailable();
		public void setHoursAvailable(Container.HoursAvailable hoursAvailable);

		/**
		 * @see <a href="http://schema.org/isRelatedTo">http://schema.org/isRelatedTo</a>
		 */
		public Container.IsRelatedTo getIsRelatedTo();
		public void setIsRelatedTo(Container.IsRelatedTo isRelatedTo);

		/**
		 * @see <a href="http://schema.org/isSimilarTo">http://schema.org/isSimilarTo</a>
		 */
		public Container.IsSimilarTo getIsSimilarTo();
		public void setIsSimilarTo(Container.IsSimilarTo isSimilarTo);

		/**
		 * @see <a href="http://schema.org/logo">http://schema.org/logo</a>
		 */
		public Container.Logo getLogo();
		public void setLogo(Container.Logo logo);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

		/**
		 * @see <a href="http://schema.org/providerMobility">http://schema.org/providerMobility</a>
		 */
		public Container.ProviderMobility getProviderMobility();
		public void setProviderMobility(Container.ProviderMobility providerMobility);

		/**
		 * @see <a href="http://schema.org/review">http://schema.org/review</a>
		 */
		public Container.Review getReview();
		public void setReview(Container.Review review);

		/**
		 * @see <a href="http://schema.org/serviceOutput">http://schema.org/serviceOutput</a>
		 */
		public Container.ServiceOutput getServiceOutput();
		public void setServiceOutput(Container.ServiceOutput serviceOutput);

		/**
		 * @see <a href="http://schema.org/serviceType">http://schema.org/serviceType</a>
		 */
		public Container.ServiceType getServiceType();
		public void setServiceType(Container.ServiceType serviceType);

		/**
		 * @see <a href="http://schema.org/termsOfService">http://schema.org/termsOfService</a>
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
		 * @see <a href="http://schema.org/availableLanguage">http://schema.org/availableLanguage</a>
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * @see <a href="http://schema.org/processingTime">http://schema.org/processingTime</a>
		 */
		public Container.ProcessingTime getProcessingTime();
		public void setProcessingTime(Container.ProcessingTime processingTime);

		/**
		 * @see <a href="http://schema.org/providesService">http://schema.org/providesService</a>
		 */
		public Container.ProvidesService getProvidesService();
		public void setProvidesService(Container.ProvidesService providesService);

		/**
		 * @see <a href="http://schema.org/serviceLocation">http://schema.org/serviceLocation</a>
		 */
		public Container.ServiceLocation getServiceLocation();
		public void setServiceLocation(Container.ServiceLocation serviceLocation);

		/**
		 * @see <a href="http://schema.org/servicePhone">http://schema.org/servicePhone</a>
		 */
		public Container.ServicePhone getServicePhone();
		public void setServicePhone(Container.ServicePhone servicePhone);

		/**
		 * @see <a href="http://schema.org/servicePostalAddress">http://schema.org/servicePostalAddress</a>
		 */
		public Container.ServicePostalAddress getServicePostalAddress();
		public void setServicePostalAddress(Container.ServicePostalAddress servicePostalAddress);

		/**
		 * @see <a href="http://schema.org/serviceSmsNumber">http://schema.org/serviceSmsNumber</a>
		 */
		public Container.ServiceSmsNumber getServiceSmsNumber();
		public void setServiceSmsNumber(Container.ServiceSmsNumber serviceSmsNumber);

		/**
		 * @see <a href="http://schema.org/serviceUrl">http://schema.org/serviceUrl</a>
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
		 * @see <a href="http://schema.org/numberOfRooms">http://schema.org/numberOfRooms</a>
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * @see <a href="http://schema.org/occupancy">http://schema.org/occupancy</a>
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
		 * @see <a href="http://schema.org/sharedContent">http://schema.org/sharedContent</a>
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
		 * @see <a href="http://schema.org/applicationCategory">http://schema.org/applicationCategory</a>
		 */
		public Container.ApplicationCategory getApplicationCategory();
		public void setApplicationCategory(Container.ApplicationCategory applicationCategory);

		/**
		 * @see <a href="http://schema.org/applicationSubCategory">http://schema.org/applicationSubCategory</a>
		 */
		public Container.ApplicationSubCategory getApplicationSubCategory();
		public void setApplicationSubCategory(Container.ApplicationSubCategory applicationSubCategory);

		/**
		 * @see <a href="http://schema.org/applicationSuite">http://schema.org/applicationSuite</a>
		 */
		public Container.ApplicationSuite getApplicationSuite();
		public void setApplicationSuite(Container.ApplicationSuite applicationSuite);

		/**
		 * @see <a href="http://schema.org/availableOnDevice">http://schema.org/availableOnDevice</a>
		 */
		public Container.AvailableOnDevice getAvailableOnDevice();
		public void setAvailableOnDevice(Container.AvailableOnDevice availableOnDevice);

		/**
		 * @see <a href="http://schema.org/countriesNotSupported">http://schema.org/countriesNotSupported</a>
		 */
		public Container.CountriesNotSupported getCountriesNotSupported();
		public void setCountriesNotSupported(Container.CountriesNotSupported countriesNotSupported);

		/**
		 * @see <a href="http://schema.org/countriesSupported">http://schema.org/countriesSupported</a>
		 */
		public Container.CountriesSupported getCountriesSupported();
		public void setCountriesSupported(Container.CountriesSupported countriesSupported);

		/**
		 * @see <a href="http://schema.org/downloadUrl">http://schema.org/downloadUrl</a>
		 */
		public Container.DownloadUrl getDownloadUrl();
		public void setDownloadUrl(Container.DownloadUrl downloadUrl);

		/**
		 * @see <a href="http://schema.org/featureList">http://schema.org/featureList</a>
		 */
		public Container.FeatureList getFeatureList();
		public void setFeatureList(Container.FeatureList featureList);

		/**
		 * @see <a href="http://schema.org/fileSize">http://schema.org/fileSize</a>
		 */
		public Container.FileSize getFileSize();
		public void setFileSize(Container.FileSize fileSize);

		/**
		 * @see <a href="http://schema.org/installUrl">http://schema.org/installUrl</a>
		 */
		public Container.InstallUrl getInstallUrl();
		public void setInstallUrl(Container.InstallUrl installUrl);

		/**
		 * @see <a href="http://schema.org/memoryRequirements">http://schema.org/memoryRequirements</a>
		 */
		public Container.MemoryRequirements getMemoryRequirements();
		public void setMemoryRequirements(Container.MemoryRequirements memoryRequirements);

		/**
		 * @see <a href="http://schema.org/operatingSystem">http://schema.org/operatingSystem</a>
		 */
		public Container.OperatingSystem getOperatingSystem();
		public void setOperatingSystem(Container.OperatingSystem operatingSystem);

		/**
		 * @see <a href="http://schema.org/permissions">http://schema.org/permissions</a>
		 */
		public Container.Permissions getPermissions();
		public void setPermissions(Container.Permissions permissions);

		/**
		 * @see <a href="http://schema.org/processorRequirements">http://schema.org/processorRequirements</a>
		 */
		public Container.ProcessorRequirements getProcessorRequirements();
		public void setProcessorRequirements(Container.ProcessorRequirements processorRequirements);

		/**
		 * @see <a href="http://schema.org/releaseNotes">http://schema.org/releaseNotes</a>
		 */
		public Container.ReleaseNotes getReleaseNotes();
		public void setReleaseNotes(Container.ReleaseNotes releaseNotes);

		/**
		 * @see <a href="http://schema.org/screenshot">http://schema.org/screenshot</a>
		 */
		public Container.Screenshot getScreenshot();
		public void setScreenshot(Container.Screenshot screenshot);

		/**
		 * @see <a href="http://schema.org/softwareAddOn">http://schema.org/softwareAddOn</a>
		 */
		public Container.SoftwareAddOn getSoftwareAddOn();
		public void setSoftwareAddOn(Container.SoftwareAddOn softwareAddOn);

		/**
		 * @see <a href="http://schema.org/softwareHelp">http://schema.org/softwareHelp</a>
		 */
		public Container.SoftwareHelp getSoftwareHelp();
		public void setSoftwareHelp(Container.SoftwareHelp softwareHelp);

		/**
		 * @see <a href="http://schema.org/softwareRequirements">http://schema.org/softwareRequirements</a>
		 */
		public Container.SoftwareRequirements getSoftwareRequirements();
		public void setSoftwareRequirements(Container.SoftwareRequirements softwareRequirements);

		/**
		 * @see <a href="http://schema.org/softwareVersion">http://schema.org/softwareVersion</a>
		 */
		public Container.SoftwareVersion getSoftwareVersion();
		public void setSoftwareVersion(Container.SoftwareVersion softwareVersion);

		/**
		 * @see <a href="http://schema.org/storageRequirements">http://schema.org/storageRequirements</a>
		 */
		public Container.StorageRequirements getStorageRequirements();
		public void setStorageRequirements(Container.StorageRequirements storageRequirements);

		/**
		 * @see <a href="http://schema.org/supportingData">http://schema.org/supportingData</a>
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
		 * @see <a href="http://schema.org/codeRepository">http://schema.org/codeRepository</a>
		 */
		public Container.CodeRepository getCodeRepository();
		public void setCodeRepository(Container.CodeRepository codeRepository);

		/**
		 * @see <a href="http://schema.org/codeSampleType">http://schema.org/codeSampleType</a>
		 */
		public Container.CodeSampleType getCodeSampleType();
		public void setCodeSampleType(Container.CodeSampleType codeSampleType);

		/**
		 * @see <a href="http://schema.org/programmingLanguage">http://schema.org/programmingLanguage</a>
		 */
		public Container.ProgrammingLanguage getProgrammingLanguage();
		public void setProgrammingLanguage(Container.ProgrammingLanguage programmingLanguage);

		/**
		 * @see <a href="http://schema.org/runtimePlatform">http://schema.org/runtimePlatform</a>
		 */
		public Container.RuntimePlatform getRuntimePlatform();
		public void setRuntimePlatform(Container.RuntimePlatform runtimePlatform);

		/**
		 * @see <a href="http://schema.org/targetProduct">http://schema.org/targetProduct</a>
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
		 * @see <a href="http://schema.org/inventoryLevel">http://schema.org/inventoryLevel</a>
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
		 * @see <a href="http://schema.org/awayTeam">http://schema.org/awayTeam</a>
		 */
		public Container.AwayTeam getAwayTeam();
		public void setAwayTeam(Container.AwayTeam awayTeam);

		/**
		 * @see <a href="http://schema.org/competitor">http://schema.org/competitor</a>
		 */
		public Container.Competitor getCompetitor();
		public void setCompetitor(Container.Competitor competitor);

		/**
		 * @see <a href="http://schema.org/homeTeam">http://schema.org/homeTeam</a>
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
		 * @see <a href="http://schema.org/sport">http://schema.org/sport</a>
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
		 * @see <a href="http://schema.org/athlete">http://schema.org/athlete</a>
		 */
		public Container.Athlete getAthlete();
		public void setAthlete(Container.Athlete athlete);

		/**
		 * @see <a href="http://schema.org/coach">http://schema.org/coach</a>
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
			+ "The act of forming a personal connection with someone/something (object)"
			+ " unidirectionally/asymmetrically to get updates pushed to.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/bed">http://schema.org/bed</a>
		 */
		public Container.Bed getBed();
		public void setBed(Container.Bed bed);

		/**
		 * @see <a href="http://schema.org/numberOfRooms">http://schema.org/numberOfRooms</a>
		 */
		public Container.NumberOfRooms getNumberOfRooms();
		public void setNumberOfRooms(Container.NumberOfRooms numberOfRooms);

		/**
		 * @see <a href="http://schema.org/occupancy">http://schema.org/occupancy</a>
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
		 * @see <a href="http://schema.org/countryOfOrigin">http://schema.org/countryOfOrigin</a>
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * @see <a href="http://schema.org/subtitleLanguage">http://schema.org/subtitleLanguage</a>
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
		 * @see <a href="http://schema.org/countryOfOrigin">http://schema.org/countryOfOrigin</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/containsSeason">http://schema.org/containsSeason</a>
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * @see <a href="http://schema.org/countryOfOrigin">http://schema.org/countryOfOrigin</a>
		 */
		public Container.CountryOfOrigin getCountryOfOrigin();
		public void setCountryOfOrigin(Container.CountryOfOrigin countryOfOrigin);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/episode">http://schema.org/episode</a>
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/numberOfEpisodes">http://schema.org/numberOfEpisodes</a>
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * @see <a href="http://schema.org/numberOfSeasons">http://schema.org/numberOfSeasons</a>
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
			+ "The act of gaining ownership of an object from an origin. Reciprocal of"
			+ " GiveAction.<br/><br/>\n\nRelated actions:<br/><br/>\n\n<ul>\n<li><a"
			+ " class=\"localLink\" href=\"http://schema.org/GiveAction\">GiveAction</a>: The"
			+ " reciprocal of TakeAction.</li>\n<li><a class=\"localLink\""
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
			+ "A reservation for a taxi.<br/><br/>\n\nNote: This type is for information about"
			+ " actual reservations, e.g. in confirmation emails or HTML pages with individual"
			+ " confirmations of reservations. For offers of tickets, use <a"
			+ " class=\"localLink\" href=\"http://schema.org/Offer\">Offer</a>.")
	@CamelizedName("taxiReservation")
	@ConstantizedName("TAXI_RESERVATION")
	public interface TaxiReservation extends Reservation, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/partySize">http://schema.org/partySize</a>
		 */
		public Container.PartySize getPartySize();
		public void setPartySize(Container.PartySize partySize);

		/**
		 * @see <a href="http://schema.org/pickupLocation">http://schema.org/pickupLocation</a>
		 */
		public Container.PickupLocation getPickupLocation();
		public void setPickupLocation(Container.PickupLocation pickupLocation);

		/**
		 * @see <a href="http://schema.org/pickupTime">http://schema.org/pickupTime</a>
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
		 * @see <a href="http://schema.org/dependencies">http://schema.org/dependencies</a>
		 */
		public Container.Dependencies getDependencies();
		public void setDependencies(Container.Dependencies dependencies);

		/**
		 * @see <a href="http://schema.org/proficiencyLevel">http://schema.org/proficiencyLevel</a>
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
		 * @see <a href="http://schema.org/additionalType">http://schema.org/additionalType</a>
		 */
		public Container.AdditionalType getAdditionalType();
		public void setAdditionalType(Container.AdditionalType additionalType);

		/**
		 * @see <a href="http://schema.org/alternateName">http://schema.org/alternateName</a>
		 */
		public Container.AlternateName getAlternateName();
		public void setAlternateName(Container.AlternateName alternateName);

		/**
		 * @see <a href="http://schema.org/description">http://schema.org/description</a>
		 */
		public Container.Description getDescription();
		public void setDescription(Container.Description description);

		/**
		 * @see <a href="http://schema.org/disambiguatingDescription">http://schema.org/disambiguatingDescription</a>
		 */
		public Container.DisambiguatingDescription getDisambiguatingDescription();
		public void setDisambiguatingDescription(Container.DisambiguatingDescription disambiguatingDescription);

		/**
		 * @see <a href="http://schema.org/identifier">http://schema.org/identifier</a>
		 */
		public Container.Identifier getIdentifier();
		public void setIdentifier(Container.Identifier identifier);

		/**
		 * @see <a href="http://schema.org/image">http://schema.org/image</a>
		 */
		public Container.Image getImage();
		public void setImage(Container.Image image);

		/**
		 * @see <a href="http://schema.org/mainEntityOfPage">http://schema.org/mainEntityOfPage</a>
		 */
		public Container.MainEntityOfPage getMainEntityOfPage();
		public void setMainEntityOfPage(Container.MainEntityOfPage mainEntityOfPage);

		/**
		 * @see <a href="http://schema.org/name">http://schema.org/name</a>
		 */
		public Container.Name getName();
		public void setName(Container.Name name);

		/**
		 * @see <a href="http://kyojo.org/schemaSpl/nameFuzzy">http://kyojo.org/schemaSpl/nameFuzzy</a>
		 */
		public Container.NameFuzzy getNameFuzzy();
		public void setNameFuzzy(Container.NameFuzzy nameFuzzy);

		/**
		 * @see <a href="http://kyojo.org/schemaSpl/nameRuby">http://kyojo.org/schemaSpl/nameRuby</a>
		 */
		public Container.NameRuby getNameRuby();
		public void setNameRuby(Container.NameRuby nameRuby);

		/**
		 * @see <a href="http://schema.org/potentialAction">http://schema.org/potentialAction</a>
		 */
		public Container.PotentialAction getPotentialAction();
		public void setPotentialAction(Container.PotentialAction potentialAction);

		/**
		 * @see <a href="http://schema.org/sameAs">http://schema.org/sameAs</a>
		 */
		public Container.SameAs getSameAs();
		public void setSameAs(Container.SameAs sameAs);

		/**
		 * @see <a href="http://schema.org/subjectOf">http://schema.org/subjectOf</a>
		 */
		public SubjectOf getSubjectOf();
		public void setSubjectOf(SubjectOf subjectOf);

		/**
		 * @see <a href="http://schema.org/url">http://schema.org/url</a>
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
		 * @see <a href="http://schema.org/dateIssued">http://schema.org/dateIssued</a>
		 */
		public Container.DateIssued getDateIssued();
		public void setDateIssued(Container.DateIssued dateIssued);

		/**
		 * @see <a href="http://schema.org/issuedBy">http://schema.org/issuedBy</a>
		 */
		public Container.IssuedBy getIssuedBy();
		public void setIssuedBy(Container.IssuedBy issuedBy);

		/**
		 * @see <a href="http://schema.org/priceCurrency">http://schema.org/priceCurrency</a>
		 */
		public Container.PriceCurrency getPriceCurrency();
		public void setPriceCurrency(Container.PriceCurrency priceCurrency);

		/**
		 * @see <a href="http://schema.org/ticketNumber">http://schema.org/ticketNumber</a>
		 */
		public Container.TicketNumber getTicketNumber();
		public void setTicketNumber(Container.TicketNumber ticketNumber);

		/**
		 * @see <a href="http://schema.org/ticketToken">http://schema.org/ticketToken</a>
		 */
		public Container.TicketToken getTicketToken();
		public void setTicketToken(Container.TicketToken ticketToken);

		/**
		 * @see <a href="http://schema.org/ticketedSeat">http://schema.org/ticketedSeat</a>
		 */
		public Container.TicketedSeat getTicketedSeat();
		public void setTicketedSeat(Container.TicketedSeat ticketedSeat);

		/**
		 * @see <a href="http://schema.org/totalPrice">http://schema.org/totalPrice</a>
		 */
		public Container.TotalPrice getTotalPrice();
		public void setTotalPrice(Container.TotalPrice totalPrice);

		/**
		 * @see <a href="http://schema.org/underName">http://schema.org/underName</a>
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
		 * @see <a href="http://schema.org/recipient">http://schema.org/recipient</a>
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
			+ " href=\"http://schema.org/TouristAttraction\">TouristAttraction</a>, or be used"
			+ " as an <a class=\"localLink\""
			+ " href=\"http://schema.org/additionalType\">additionalType</a> to add tourist"
			+ " attraction properties to any other type.  (See examples below)")
	@CamelizedName("touristAttraction")
	@ConstantizedName("TOURIST_ATTRACTION")
	public interface TouristAttraction extends Place, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/availableLanguage">http://schema.org/availableLanguage</a>
		 */
		public Container.AvailableLanguage getAvailableLanguage();
		public void setAvailableLanguage(Container.AvailableLanguage availableLanguage);

		/**
		 * @see <a href="http://schema.org/touristType">http://schema.org/touristType</a>
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
			+ "An agent tracks an object for updates.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
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
		 * @see <a href="http://schema.org/deliveryMethod">http://schema.org/deliveryMethod</a>
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
		 * @see <a href="http://schema.org/price">http://schema.org/price</a>
		 */
		public Container.Price getPrice();
		public void setPrice(Container.Price price);

		/**
		 * @see <a href="http://schema.org/priceSpecification">http://schema.org/priceSpecification</a>
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
			+ "A reservation for train travel.<br/><br/>\n\nNote: This type is for information"
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
	public interface TrainTrip extends SchemaOrgClass, Trip {

		/**
		 * @see <a href="http://schema.org/arrivalPlatform">http://schema.org/arrivalPlatform</a>
		 */
		public Container.ArrivalPlatform getArrivalPlatform();
		public void setArrivalPlatform(Container.ArrivalPlatform arrivalPlatform);

		/**
		 * @see <a href="http://schema.org/arrivalStation">http://schema.org/arrivalStation</a>
		 */
		public Container.ArrivalStation getArrivalStation();
		public void setArrivalStation(Container.ArrivalStation arrivalStation);

		/**
		 * @see <a href="http://schema.org/departurePlatform">http://schema.org/departurePlatform</a>
		 */
		public Container.DeparturePlatform getDeparturePlatform();
		public void setDeparturePlatform(Container.DeparturePlatform departurePlatform);

		/**
		 * @see <a href="http://schema.org/departureStation">http://schema.org/departureStation</a>
		 */
		public Container.DepartureStation getDepartureStation();
		public void setDepartureStation(Container.DepartureStation departureStation);

		/**
		 * @see <a href="http://schema.org/trainName">http://schema.org/trainName</a>
		 */
		public Container.TrainName getTrainName();
		public void setTrainName(Container.TrainName trainName);

		/**
		 * @see <a href="http://schema.org/trainNumber">http://schema.org/trainNumber</a>
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
		 * @see <a href="http://schema.org/fromLocation">http://schema.org/fromLocation</a>
		 */
		public Container.FromLocation getFromLocation();
		public void setFromLocation(Container.FromLocation fromLocation);

		/**
		 * @see <a href="http://schema.org/toLocation">http://schema.org/toLocation</a>
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
		 * @see <a href="http://schema.org/distance">http://schema.org/distance</a>
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
	@SchemaOrgURI("http://schema.org/Trip")
	@SchemaOrgLabel("Trip")
	@SchemaOrgComment(""
			+ "A trip or journey. An itinerary of visits to one or more places.")
	@CamelizedName("trip")
	@ConstantizedName("TRIP")
	public interface Trip extends Intangible, SchemaOrgClass {

		/**
		 * @see <a href="http://schema.org/arrivalTime">http://schema.org/arrivalTime</a>
		 */
		public Container.ArrivalTime getArrivalTime();
		public void setArrivalTime(Container.ArrivalTime arrivalTime);

		/**
		 * @see <a href="http://schema.org/departureTime">http://schema.org/departureTime</a>
		 */
		public Container.DepartureTime getDepartureTime();
		public void setDepartureTime(Container.DepartureTime departureTime);

		/**
		 * @see <a href="http://schema.org/hasPart">http://schema.org/hasPart</a>
		 */
		public Container.HasPart getHasPart();
		public void setHasPart(Container.HasPart hasPart);

		/**
		 * @see <a href="http://schema.org/isPartOf">http://schema.org/isPartOf</a>
		 */
		public Container.IsPartOf getIsPartOf();
		public void setIsPartOf(Container.IsPartOf isPartOf);

		/**
		 * @see <a href="http://schema.org/itinerary">http://schema.org/itinerary</a>
		 */
		public Itinerary getItinerary();
		public void setItinerary(Itinerary itinerary);

		/**
		 * @see <a href="http://schema.org/offers">http://schema.org/offers</a>
		 */
		public Container.Offers getOffers();
		public void setOffers(Container.Offers offers);

		/**
		 * @see <a href="http://schema.org/provider">http://schema.org/provider</a>
		 */
		public Container.Provider getProvider();
		public void setProvider(Container.Provider provider);

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
		 * @see <a href="http://schema.org/amountOfThisGood">http://schema.org/amountOfThisGood</a>
		 */
		public Container.AmountOfThisGood getAmountOfThisGood();
		public void setAmountOfThisGood(Container.AmountOfThisGood amountOfThisGood);

		/**
		 * @see <a href="http://schema.org/businessFunction">http://schema.org/businessFunction</a>
		 */
		public Container.BusinessFunction getBusinessFunction();
		public void setBusinessFunction(Container.BusinessFunction businessFunction);

		/**
		 * @see <a href="http://schema.org/typeOfGood">http://schema.org/typeOfGood</a>
		 */
		public Container.TypeOfGood getTypeOfGood();
		public void setTypeOfGood(Container.TypeOfGood typeOfGood);

		/**
		 * @see <a href="http://schema.org/unitCode">http://schema.org/unitCode</a>
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * @see <a href="http://schema.org/unitText">http://schema.org/unitText</a>
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
			+ "The act of un-registering from a service.<br/><br/>\n\nRelated"
			+ " actions:<br/><br/>\n\n<ul>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/RegisterAction\">RegisterAction</a>: antonym of"
			+ " UnRegisterAction.</li>\n<li><a class=\"localLink\""
			+ " href=\"http://schema.org/LeaveAction\">LeaveAction</a>: Unlike LeaveAction,"
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
		 * @see <a href="http://schema.org/billingIncrement">http://schema.org/billingIncrement</a>
		 */
		public Container.BillingIncrement getBillingIncrement();
		public void setBillingIncrement(Container.BillingIncrement billingIncrement);

		/**
		 * @see <a href="http://schema.org/priceType">http://schema.org/priceType</a>
		 */
		public Container.PriceType getPriceType();
		public void setPriceType(Container.PriceType priceType);

		/**
		 * @see <a href="http://schema.org/referenceQuantity">http://schema.org/referenceQuantity</a>
		 */
		public Container.ReferenceQuantity getReferenceQuantity();
		public void setReferenceQuantity(Container.ReferenceQuantity referenceQuantity);

		/**
		 * @see <a href="http://schema.org/unitCode">http://schema.org/unitCode</a>
		 */
		public Container.UnitCode getUnitCode();
		public void setUnitCode(Container.UnitCode unitCode);

		/**
		 * @see <a href="http://schema.org/unitText">http://schema.org/unitText</a>
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
		 * @see <a href="http://schema.org/targetCollection">http://schema.org/targetCollection</a>
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
		 * @see <a href="http://schema.org/accelerationTime">http://schema.org/accelerationTime</a>
		 */
		public AccelerationTime getAccelerationTime();
		public void setAccelerationTime(AccelerationTime accelerationTime);

		/**
		 * @see <a href="http://schema.org/bodyType">http://schema.org/bodyType</a>
		 */
		public BodyType getBodyType();
		public void setBodyType(BodyType bodyType);

		/**
		 * @see <a href="http://schema.org/cargoVolume">http://schema.org/cargoVolume</a>
		 */
		public Container.CargoVolume getCargoVolume();
		public void setCargoVolume(Container.CargoVolume cargoVolume);

		/**
		 * @see <a href="http://schema.org/dateVehicleFirstRegistered">http://schema.org/dateVehicleFirstRegistered</a>
		 */
		public Container.DateVehicleFirstRegistered getDateVehicleFirstRegistered();
		public void setDateVehicleFirstRegistered(Container.DateVehicleFirstRegistered dateVehicleFirstRegistered);

		/**
		 * @see <a href="http://schema.org/driveWheelConfiguration">http://schema.org/driveWheelConfiguration</a>
		 */
		public Container.DriveWheelConfiguration getDriveWheelConfiguration();
		public void setDriveWheelConfiguration(Container.DriveWheelConfiguration driveWheelConfiguration);

		/**
		 * @see <a href="http://schema.org/emissionsCO2">http://schema.org/emissionsCO2</a>
		 */
		public EmissionsCO2 getEmissionsCO2();
		public void setEmissionsCO2(EmissionsCO2 emissionsCO2);

		/**
		 * @see <a href="http://schema.org/fuelCapacity">http://schema.org/fuelCapacity</a>
		 */
		public FuelCapacity getFuelCapacity();
		public void setFuelCapacity(FuelCapacity fuelCapacity);

		/**
		 * @see <a href="http://schema.org/fuelConsumption">http://schema.org/fuelConsumption</a>
		 */
		public Container.FuelConsumption getFuelConsumption();
		public void setFuelConsumption(Container.FuelConsumption fuelConsumption);

		/**
		 * @see <a href="http://schema.org/fuelEfficiency">http://schema.org/fuelEfficiency</a>
		 */
		public Container.FuelEfficiency getFuelEfficiency();
		public void setFuelEfficiency(Container.FuelEfficiency fuelEfficiency);

		/**
		 * @see <a href="http://schema.org/fuelType">http://schema.org/fuelType</a>
		 */
		public Container.FuelType getFuelType();
		public void setFuelType(Container.FuelType fuelType);

		/**
		 * @see <a href="http://schema.org/knownVehicleDamages">http://schema.org/knownVehicleDamages</a>
		 */
		public Container.KnownVehicleDamages getKnownVehicleDamages();
		public void setKnownVehicleDamages(Container.KnownVehicleDamages knownVehicleDamages);

		/**
		 * @see <a href="http://schema.org/meetsEmissionStandard">http://schema.org/meetsEmissionStandard</a>
		 */
		public MeetsEmissionStandard getMeetsEmissionStandard();
		public void setMeetsEmissionStandard(MeetsEmissionStandard meetsEmissionStandard);

		/**
		 * @see <a href="http://schema.org/mileageFromOdometer">http://schema.org/mileageFromOdometer</a>
		 */
		public Container.MileageFromOdometer getMileageFromOdometer();
		public void setMileageFromOdometer(Container.MileageFromOdometer mileageFromOdometer);

		/**
		 * @see <a href="http://schema.org/modelDate">http://schema.org/modelDate</a>
		 */
		public ModelDate getModelDate();
		public void setModelDate(ModelDate modelDate);

		/**
		 * @see <a href="http://schema.org/numberOfAirbags">http://schema.org/numberOfAirbags</a>
		 */
		public Container.NumberOfAirbags getNumberOfAirbags();
		public void setNumberOfAirbags(Container.NumberOfAirbags numberOfAirbags);

		/**
		 * @see <a href="http://schema.org/numberOfAxles">http://schema.org/numberOfAxles</a>
		 */
		public Container.NumberOfAxles getNumberOfAxles();
		public void setNumberOfAxles(Container.NumberOfAxles numberOfAxles);

		/**
		 * @see <a href="http://schema.org/numberOfDoors">http://schema.org/numberOfDoors</a>
		 */
		public Container.NumberOfDoors getNumberOfDoors();
		public void setNumberOfDoors(Container.NumberOfDoors numberOfDoors);

		/**
		 * @see <a href="http://schema.org/numberOfForwardGears">http://schema.org/numberOfForwardGears</a>
		 */
		public Container.NumberOfForwardGears getNumberOfForwardGears();
		public void setNumberOfForwardGears(Container.NumberOfForwardGears numberOfForwardGears);

		/**
		 * @see <a href="http://schema.org/numberOfPreviousOwners">http://schema.org/numberOfPreviousOwners</a>
		 */
		public Container.NumberOfPreviousOwners getNumberOfPreviousOwners();
		public void setNumberOfPreviousOwners(Container.NumberOfPreviousOwners numberOfPreviousOwners);

		/**
		 * @see <a href="http://schema.org/payload">http://schema.org/payload</a>
		 */
		public Payload getPayload();
		public void setPayload(Payload payload);

		/**
		 * @see <a href="http://schema.org/productionDate">http://schema.org/productionDate</a>
		 */
		public Container.ProductionDate getProductionDate();
		public void setProductionDate(Container.ProductionDate productionDate);

		/**
		 * @see <a href="http://schema.org/purchaseDate">http://schema.org/purchaseDate</a>
		 */
		public Container.PurchaseDate getPurchaseDate();
		public void setPurchaseDate(Container.PurchaseDate purchaseDate);

		/**
		 * @see <a href="http://schema.org/seatingCapacity">http://schema.org/seatingCapacity</a>
		 */
		public SeatingCapacity getSeatingCapacity();
		public void setSeatingCapacity(SeatingCapacity seatingCapacity);

		/**
		 * @see <a href="http://schema.org/speed">http://schema.org/speed</a>
		 */
		public Speed getSpeed();
		public void setSpeed(Speed speed);

		/**
		 * @see <a href="http://schema.org/steeringPosition">http://schema.org/steeringPosition</a>
		 */
		public Container.SteeringPosition getSteeringPosition();
		public void setSteeringPosition(Container.SteeringPosition steeringPosition);

		/**
		 * @see <a href="http://schema.org/tongueWeight">http://schema.org/tongueWeight</a>
		 */
		public TongueWeight getTongueWeight();
		public void setTongueWeight(TongueWeight tongueWeight);

		/**
		 * @see <a href="http://schema.org/trailerWeight">http://schema.org/trailerWeight</a>
		 */
		public TrailerWeight getTrailerWeight();
		public void setTrailerWeight(TrailerWeight trailerWeight);

		/**
		 * @see <a href="http://schema.org/vehicleConfiguration">http://schema.org/vehicleConfiguration</a>
		 */
		public Container.VehicleConfiguration getVehicleConfiguration();
		public void setVehicleConfiguration(Container.VehicleConfiguration vehicleConfiguration);

		/**
		 * @see <a href="http://schema.org/vehicleEngine">http://schema.org/vehicleEngine</a>
		 */
		public Container.VehicleEngine getVehicleEngine();
		public void setVehicleEngine(Container.VehicleEngine vehicleEngine);

		/**
		 * @see <a href="http://schema.org/vehicleIdentificationNumber">http://schema.org/vehicleIdentificationNumber</a>
		 */
		public Container.VehicleIdentificationNumber getVehicleIdentificationNumber();
		public void setVehicleIdentificationNumber(Container.VehicleIdentificationNumber vehicleIdentificationNumber);

		/**
		 * @see <a href="http://schema.org/vehicleInteriorColor">http://schema.org/vehicleInteriorColor</a>
		 */
		public Container.VehicleInteriorColor getVehicleInteriorColor();
		public void setVehicleInteriorColor(Container.VehicleInteriorColor vehicleInteriorColor);

		/**
		 * @see <a href="http://schema.org/vehicleInteriorType">http://schema.org/vehicleInteriorType</a>
		 */
		public Container.VehicleInteriorType getVehicleInteriorType();
		public void setVehicleInteriorType(Container.VehicleInteriorType vehicleInteriorType);

		/**
		 * @see <a href="http://schema.org/vehicleModelDate">http://schema.org/vehicleModelDate</a>
		 */
		public Container.VehicleModelDate getVehicleModelDate();
		public void setVehicleModelDate(Container.VehicleModelDate vehicleModelDate);

		/**
		 * @see <a href="http://schema.org/vehicleSeatingCapacity">http://schema.org/vehicleSeatingCapacity</a>
		 */
		public Container.VehicleSeatingCapacity getVehicleSeatingCapacity();
		public void setVehicleSeatingCapacity(Container.VehicleSeatingCapacity vehicleSeatingCapacity);

		/**
		 * @see <a href="http://schema.org/vehicleSpecialUsage">http://schema.org/vehicleSpecialUsage</a>
		 */
		public VehicleSpecialUsage getVehicleSpecialUsage();
		public void setVehicleSpecialUsage(VehicleSpecialUsage vehicleSpecialUsage);

		/**
		 * @see <a href="http://schema.org/vehicleTransmission">http://schema.org/vehicleTransmission</a>
		 */
		public Container.VehicleTransmission getVehicleTransmission();
		public void setVehicleTransmission(Container.VehicleTransmission vehicleTransmission);

		/**
		 * @see <a href="http://schema.org/weightTotal">http://schema.org/weightTotal</a>
		 */
		public WeightTotal getWeightTotal();
		public void setWeightTotal(WeightTotal weightTotal);

		/**
		 * @see <a href="http://schema.org/wheelbase">http://schema.org/wheelbase</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/cheatCode">http://schema.org/cheatCode</a>
		 */
		public Container.CheatCode getCheatCode();
		public void setCheatCode(Container.CheatCode cheatCode);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/gamePlatform">http://schema.org/gamePlatform</a>
		 */
		public Container.GamePlatform getGamePlatform();
		public void setGamePlatform(Container.GamePlatform gamePlatform);

		/**
		 * @see <a href="http://schema.org/gameServer">http://schema.org/gameServer</a>
		 */
		public Container.GameServer getGameServer();
		public void setGameServer(Container.GameServer gameServer);

		/**
		 * @see <a href="http://schema.org/gameTip">http://schema.org/gameTip</a>
		 */
		public Container.GameTip getGameTip();
		public void setGameTip(Container.GameTip gameTip);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/playMode">http://schema.org/playMode</a>
		 */
		public Container.PlayMode getPlayMode();
		public void setPlayMode(Container.PlayMode playMode);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/characterAttribute">http://schema.org/characterAttribute</a>
		 */
		public Container.CharacterAttribute getCharacterAttribute();
		public void setCharacterAttribute(Container.CharacterAttribute characterAttribute);

		/**
		 * @see <a href="http://schema.org/cheatCode">http://schema.org/cheatCode</a>
		 */
		public Container.CheatCode getCheatCode();
		public void setCheatCode(Container.CheatCode cheatCode);

		/**
		 * @see <a href="http://schema.org/containsSeason">http://schema.org/containsSeason</a>
		 */
		public Container.ContainsSeason getContainsSeason();
		public void setContainsSeason(Container.ContainsSeason containsSeason);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/episode">http://schema.org/episode</a>
		 */
		public Container.Episode getEpisode();
		public void setEpisode(Container.Episode episode);

		/**
		 * @see <a href="http://schema.org/gameItem">http://schema.org/gameItem</a>
		 */
		public Container.GameItem getGameItem();
		public void setGameItem(Container.GameItem gameItem);

		/**
		 * @see <a href="http://schema.org/gameLocation">http://schema.org/gameLocation</a>
		 */
		public Container.GameLocation getGameLocation();
		public void setGameLocation(Container.GameLocation gameLocation);

		/**
		 * @see <a href="http://schema.org/gamePlatform">http://schema.org/gamePlatform</a>
		 */
		public Container.GamePlatform getGamePlatform();
		public void setGamePlatform(Container.GamePlatform gamePlatform);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/numberOfEpisodes">http://schema.org/numberOfEpisodes</a>
		 */
		public Container.NumberOfEpisodes getNumberOfEpisodes();
		public void setNumberOfEpisodes(Container.NumberOfEpisodes numberOfEpisodes);

		/**
		 * @see <a href="http://schema.org/numberOfPlayers">http://schema.org/numberOfPlayers</a>
		 */
		public Container.NumberOfPlayers getNumberOfPlayers();
		public void setNumberOfPlayers(Container.NumberOfPlayers numberOfPlayers);

		/**
		 * @see <a href="http://schema.org/numberOfSeasons">http://schema.org/numberOfSeasons</a>
		 */
		public Container.NumberOfSeasons getNumberOfSeasons();
		public void setNumberOfSeasons(Container.NumberOfSeasons numberOfSeasons);

		/**
		 * @see <a href="http://schema.org/playMode">http://schema.org/playMode</a>
		 */
		public Container.PlayMode getPlayMode();
		public void setPlayMode(Container.PlayMode playMode);

		/**
		 * @see <a href="http://schema.org/productionCompany">http://schema.org/productionCompany</a>
		 */
		public Container.ProductionCompany getProductionCompany();
		public void setProductionCompany(Container.ProductionCompany productionCompany);

		/**
		 * @see <a href="http://schema.org/quest">http://schema.org/quest</a>
		 */
		public Container.Quest getQuest();
		public void setQuest(Container.Quest quest);

		/**
		 * @see <a href="http://schema.org/trailer">http://schema.org/trailer</a>
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
		 * @see <a href="http://schema.org/actor">http://schema.org/actor</a>
		 */
		public Container.Actor getActor();
		public void setActor(Container.Actor actor);

		/**
		 * @see <a href="http://schema.org/caption">http://schema.org/caption</a>
		 */
		public Container.Caption getCaption();
		public void setCaption(Container.Caption caption);

		/**
		 * @see <a href="http://schema.org/director">http://schema.org/director</a>
		 */
		public Container.Director getDirector();
		public void setDirector(Container.Director director);

		/**
		 * @see <a href="http://schema.org/musicBy">http://schema.org/musicBy</a>
		 */
		public Container.MusicBy getMusicBy();
		public void setMusicBy(Container.MusicBy musicBy);

		/**
		 * @see <a href="http://schema.org/thumbnail">http://schema.org/thumbnail</a>
		 */
		public Container.Thumbnail getThumbnail();
		public void setThumbnail(Container.Thumbnail thumbnail);

		/**
		 * @see <a href="http://schema.org/transcript">http://schema.org/transcript</a>
		 */
		public Container.Transcript getTranscript();
		public void setTranscript(Container.Transcript transcript);

		/**
		 * @see <a href="http://schema.org/videoFrameSize">http://schema.org/videoFrameSize</a>
		 */
		public Container.VideoFrameSize getVideoFrameSize();
		public void setVideoFrameSize(Container.VideoFrameSize videoFrameSize);

		/**
		 * @see <a href="http://schema.org/videoQuality">http://schema.org/videoQuality</a>
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
		 * @see <a href="http://schema.org/artEdition">http://schema.org/artEdition</a>
		 */
		public Container.ArtEdition getArtEdition();
		public void setArtEdition(Container.ArtEdition artEdition);

		/**
		 * @see <a href="http://schema.org/artMedium">http://schema.org/artMedium</a>
		 */
		public Container.ArtMedium getArtMedium();
		public void setArtMedium(Container.ArtMedium artMedium);

		/**
		 * @see <a href="http://schema.org/artform">http://schema.org/artform</a>
		 */
		public Container.Artform getArtform();
		public void setArtform(Container.Artform artform);

		/**
		 * @see <a href="http://schema.org/artist">http://schema.org/artist</a>
		 */
		public Artist getArtist();
		public void setArtist(Artist artist);

		/**
		 * @see <a href="http://schema.org/artworkSurface">http://schema.org/artworkSurface</a>
		 */
		public Container.ArtworkSurface getArtworkSurface();
		public void setArtworkSurface(Container.ArtworkSurface artworkSurface);

		/**
		 * @see <a href="http://schema.org/colorist">http://schema.org/colorist</a>
		 */
		public Colorist getColorist();
		public void setColorist(Colorist colorist);

		/**
		 * @see <a href="http://schema.org/depth">http://schema.org/depth</a>
		 */
		public Container.Depth getDepth();
		public void setDepth(Container.Depth depth);

		/**
		 * @see <a href="http://schema.org/height">http://schema.org/height</a>
		 */
		public Container.Height getHeight();
		public void setHeight(Container.Height height);

		/**
		 * @see <a href="http://schema.org/inker">http://schema.org/inker</a>
		 */
		public Inker getInker();
		public void setInker(Inker inker);

		/**
		 * @see <a href="http://schema.org/letterer">http://schema.org/letterer</a>
		 */
		public Letterer getLetterer();
		public void setLetterer(Letterer letterer);

		/**
		 * @see <a href="http://schema.org/penciler">http://schema.org/penciler</a>
		 */
		public Penciler getPenciler();
		public void setPenciler(Penciler penciler);

		/**
		 * @see <a href="http://schema.org/width">http://schema.org/width</a>
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
		 * @see <a href="http://schema.org/candidate">http://schema.org/candidate</a>
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
		 * @see <a href="http://schema.org/durationOfWarranty">http://schema.org/durationOfWarranty</a>
		 */
		public Container.DurationOfWarranty getDurationOfWarranty();
		public void setDurationOfWarranty(Container.DurationOfWarranty durationOfWarranty);

		/**
		 * @see <a href="http://schema.org/warrantyScope">http://schema.org/warrantyScope</a>
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
			+ "A range of of services that will be provided to a customer free of charge in"
			+ " case of a defect or malfunction of a product.<br/><br/>\n\nCommonly used"
			+ " values:<br/><br/>\n\n<ul>\n<li>http://purl.org/goodrelations/v1#Labor-BringIn</li>\n<li>http://purl.org/goodrelations/v1#PartsAndLabor-BringIn</li>\n<li>http://purl.org/goodrelations/v1#PartsAndLabor-PickUp</li>\n</ul>\n")
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
		 * @see <a href="http://schema.org/browserRequirements">http://schema.org/browserRequirements</a>
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
		 * @see <a href="http://schema.org/breadcrumb">http://schema.org/breadcrumb</a>
		 */
		public Container.Breadcrumb getBreadcrumb();
		public void setBreadcrumb(Container.Breadcrumb breadcrumb);

		/**
		 * @see <a href="http://schema.org/lastReviewed">http://schema.org/lastReviewed</a>
		 */
		public Container.LastReviewed getLastReviewed();
		public void setLastReviewed(Container.LastReviewed lastReviewed);

		/**
		 * @see <a href="http://schema.org/mainContentOfPage">http://schema.org/mainContentOfPage</a>
		 */
		public Container.MainContentOfPage getMainContentOfPage();
		public void setMainContentOfPage(Container.MainContentOfPage mainContentOfPage);

		/**
		 * @see <a href="http://schema.org/primaryImageOfPage">http://schema.org/primaryImageOfPage</a>
		 */
		public Container.PrimaryImageOfPage getPrimaryImageOfPage();
		public void setPrimaryImageOfPage(Container.PrimaryImageOfPage primaryImageOfPage);

		/**
		 * @see <a href="http://schema.org/relatedLink">http://schema.org/relatedLink</a>
		 */
		public Container.RelatedLink getRelatedLink();
		public void setRelatedLink(Container.RelatedLink relatedLink);

		/**
		 * @see <a href="http://schema.org/reviewedBy">http://schema.org/reviewedBy</a>
		 */
		public Container.ReviewedBy getReviewedBy();
		public void setReviewedBy(Container.ReviewedBy reviewedBy);

		/**
		 * @see <a href="http://schema.org/significantLink">http://schema.org/significantLink</a>
		 */
		public Container.SignificantLink getSignificantLink();
		public void setSignificantLink(Container.SignificantLink significantLink);

		/**
		 * @see <a href="http://schema.org/speakable">http://schema.org/speakable</a>
		 */
		public Speakable getSpeakable();
		public void setSpeakable(Speakable speakable);

		/**
		 * @see <a href="http://schema.org/specialty">http://schema.org/specialty</a>
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

		/**
		 * @see <a href="http://schema.org/cssSelector">http://schema.org/cssSelector</a>
		 */
		public CssSelector getCssSelector();
		public void setCssSelector(CssSelector cssSelector);

		/**
		 * @see <a href="http://schema.org/xpath">http://schema.org/xpath</a>
		 */
		public Xpath getXpath();
		public void setXpath(Xpath xpath);

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
		 * @see <a href="http://schema.org/issn">http://schema.org/issn</a>
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
		 * @see <a href="http://schema.org/loser">http://schema.org/loser</a>
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
		 * @see <a href="http://schema.org/inLanguage">http://schema.org/inLanguage</a>
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
