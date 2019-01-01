package org.kyojo.schemaorg.m3n4.healthLifesci;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueBoolean;
import org.kyojo.schemaorg.NativeValueDate;
import org.kyojo.schemaorg.NativeValueNumber;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.auto.Clazz.BusOrCoach;
import org.kyojo.schemaorg.m3n4.auto.Clazz.CarUsageType;
import org.kyojo.schemaorg.m3n4.auto.Clazz.Motorcycle;
import org.kyojo.schemaorg.m3n4.auto.Clazz.MotorizedBicycle;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Atlas;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Chapter;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Collection;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicCoverArt;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicIssue;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicSeries;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicStory;
import org.kyojo.schemaorg.m3n4.bib.Clazz.CoverArt;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Newspaper;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Thesis;
import org.kyojo.schemaorg.m3n4.core.Clazz.APIReference;
import org.kyojo.schemaorg.m3n4.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.AcceptAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Accommodation;
import org.kyojo.schemaorg.m3n4.core.Clazz.AccountingService;
import org.kyojo.schemaorg.m3n4.core.Clazz.AchieveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ActionStatusType;
import org.kyojo.schemaorg.m3n4.core.Clazz.ActivateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AddAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdultEntertainment;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateOffer;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateRating;
import org.kyojo.schemaorg.m3n4.core.Clazz.AgreeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Airline;
import org.kyojo.schemaorg.m3n4.core.Clazz.Airport;
import org.kyojo.schemaorg.m3n4.core.Clazz.AlignmentObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.AllocateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AmusementPark;
import org.kyojo.schemaorg.m3n4.core.Clazz.AnimalShelter;
import org.kyojo.schemaorg.m3n4.core.Clazz.Answer;
import org.kyojo.schemaorg.m3n4.core.Clazz.Apartment;
import org.kyojo.schemaorg.m3n4.core.Clazz.ApartmentComplex;
import org.kyojo.schemaorg.m3n4.core.Clazz.AppendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ApplyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Aquarium;
import org.kyojo.schemaorg.m3n4.core.Clazz.ArriveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ArtGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.AskAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssessAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssignAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Attorney;
import org.kyojo.schemaorg.m3n4.core.Clazz.Audience;
import org.kyojo.schemaorg.m3n4.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.AuthorizeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoBodyShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoDealer;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoPartsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoRental;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoRepair;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoWash;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomatedTeller;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomotiveBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Bakery;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankAccount;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaorg.m3n4.core.Clazz.BarOrPub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n4.core.Clazz.Beach;
import org.kyojo.schemaorg.m3n4.core.Clazz.BeautySalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedAndBreakfast;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedDetails;
import org.kyojo.schemaorg.m3n4.core.Clazz.BefriendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BikeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Blog;
import org.kyojo.schemaorg.m3n4.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.BoardingPolicyType;
import org.kyojo.schemaorg.m3n4.core.Clazz.BodyOfWater;
import org.kyojo.schemaorg.m3n4.core.Clazz.Book;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookFormatType;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookmarkAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BorrowAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BowlingAlley;
import org.kyojo.schemaorg.m3n4.core.Clazz.Brand;
import org.kyojo.schemaorg.m3n4.core.Clazz.BreadcrumbList;
import org.kyojo.schemaorg.m3n4.core.Clazz.Brewery;
import org.kyojo.schemaorg.m3n4.core.Clazz.Bridge;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastService;
import org.kyojo.schemaorg.m3n4.core.Clazz.BuddhistTemple;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusStop;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusTrip;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEntityType;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessFunction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BuyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CableOrSatelliteService;
import org.kyojo.schemaorg.m3n4.core.Clazz.CafeOrCoffeeShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.Campground;
import org.kyojo.schemaorg.m3n4.core.Clazz.CampingPitch;
import org.kyojo.schemaorg.m3n4.core.Clazz.Canal;
import org.kyojo.schemaorg.m3n4.core.Clazz.CancelAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Car;
import org.kyojo.schemaorg.m3n4.core.Clazz.Casino;
import org.kyojo.schemaorg.m3n4.core.Clazz.CatholicChurch;
import org.kyojo.schemaorg.m3n4.core.Clazz.Cemetery;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckInAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckOutAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckoutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildCare;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildrensEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChooseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Church;
import org.kyojo.schemaorg.m3n4.core.Clazz.City;
import org.kyojo.schemaorg.m3n4.core.Clazz.CityHall;
import org.kyojo.schemaorg.m3n4.core.Clazz.CivicStructure;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClaimReview;
import org.kyojo.schemaorg.m3n4.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollectionPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollegeOrUniversity;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.Comment;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommentAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommunicateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerLanguage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConfirmAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConsumeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPoint;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPointOption;
import org.kyojo.schemaorg.m3n4.core.Clazz.Continent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ControlAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConvenienceStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Conversation;
import org.kyojo.schemaorg.m3n4.core.Clazz.CookAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Corporation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Country;
import org.kyojo.schemaorg.m3n4.core.Clazz.Course;
import org.kyojo.schemaorg.m3n4.core.Clazz.CourseInstance;
import org.kyojo.schemaorg.m3n4.core.Clazz.Courthouse;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n4.core.Clazz.Crematorium;
import org.kyojo.schemaorg.m3n4.core.Clazz.CurrencyConversionService;
import org.kyojo.schemaorg.m3n4.core.Clazz.DanceEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.DanceGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataCatalog;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataDownload;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeedItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dataset;
import org.kyojo.schemaorg.m3n4.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n4.core.Clazz.DaySpa;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeactivateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DefenceEstablishment;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeleteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryMethod;
import org.kyojo.schemaorg.m3n4.core.Clazz.Demand;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dentist;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepositAccount;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocumentPermission;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocumentPermissionType;
import org.kyojo.schemaorg.m3n4.core.Clazz.DisagreeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscoverAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscussionForumPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.DislikeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Distance;
import org.kyojo.schemaorg.m3n4.core.Clazz.DonateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DownloadAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DrawAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DrinkAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DriveWheelConfigurationValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.DryCleaningOrLaundry;
import org.kyojo.schemaorg.m3n4.core.Clazz.Duration;
import org.kyojo.schemaorg.m3n4.core.Clazz.EatAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Electrician;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElectronicsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElementarySchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmailMessage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Embassy;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmergencyService;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmployeeRole;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmploymentAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.EndorseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Energy;
import org.kyojo.schemaorg.m3n4.core.Clazz.EngineSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.EntertainmentBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.EntryPoint;
import org.kyojo.schemaorg.m3n4.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n4.core.Clazz.Episode;
import org.kyojo.schemaorg.m3n4.core.Clazz.Event;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventVenue;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseGym;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExhibitionEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.FastFoodRestaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.Festival;
import org.kyojo.schemaorg.m3n4.core.Clazz.FilmAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FinancialProduct;
import org.kyojo.schemaorg.m3n4.core.Clazz.FinancialService;
import org.kyojo.schemaorg.m3n4.core.Clazz.FindAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FireStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Flight;
import org.kyojo.schemaorg.m3n4.core.Clazz.FlightReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Float;
import org.kyojo.schemaorg.m3n4.core.Clazz.Florist;
import org.kyojo.schemaorg.m3n4.core.Clazz.FollowAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishment;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishmentReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodService;
import org.kyojo.schemaorg.m3n4.core.Clazz.FurnitureStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Game;
import org.kyojo.schemaorg.m3n4.core.Clazz.GamePlayMode;
import org.kyojo.schemaorg.m3n4.core.Clazz.GameServer;
import org.kyojo.schemaorg.m3n4.core.Clazz.GameServerStatus;
import org.kyojo.schemaorg.m3n4.core.Clazz.GardenStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.GasStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.GatedResidenceCommunity;
import org.kyojo.schemaorg.m3n4.core.Clazz.GenderType;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeneralContractor;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoCircle;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoCoordinates;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n4.core.Clazz.GiveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.GolfCourse;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentBuilding;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentOffice;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentPermit;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentService;
import org.kyojo.schemaorg.m3n4.core.Clazz.GroceryStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.HVACBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HairSalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.HardwareStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthAndBeautyBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.HighSchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.HinduTemple;
import org.kyojo.schemaorg.m3n4.core.Clazz.HobbyShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeAndConstructionBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeGoodsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hospital;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hostel;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hotel;
import org.kyojo.schemaorg.m3n4.core.Clazz.HotelRoom;
import org.kyojo.schemaorg.m3n4.core.Clazz.House;
import org.kyojo.schemaorg.m3n4.core.Clazz.HousePainter;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowTo;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToDirection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSupply;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToTip;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToTool;
import org.kyojo.schemaorg.m3n4.core.Clazz.IceCreamShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.IgnoreAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.IndividualProduct;
import org.kyojo.schemaorg.m3n4.core.Clazz.InformAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsertAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InstallAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsuranceAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.Intangible;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.InteractAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InteractionCounter;
import org.kyojo.schemaorg.m3n4.core.Clazz.InternetCafe;
import org.kyojo.schemaorg.m3n4.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaorg.m3n4.core.Clazz.InviteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Invoice;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemAvailability;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemListOrderType;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.JewelryStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.JobPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.JoinAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LakeBodyOfWater;
import org.kyojo.schemaorg.m3n4.core.Clazz.Landform;
import org.kyojo.schemaorg.m3n4.core.Clazz.LandmarksOrHistoricalBuildings;
import org.kyojo.schemaorg.m3n4.core.Clazz.Language;
import org.kyojo.schemaorg.m3n4.core.Clazz.LeaveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegislativeBuilding;
import org.kyojo.schemaorg.m3n4.core.Clazz.LendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Library;
import org.kyojo.schemaorg.m3n4.core.Clazz.LikeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiquorStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListenAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiteraryEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocalBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.LockerDelivery;
import org.kyojo.schemaorg.m3n4.core.Clazz.Locksmith;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.LoseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Map;
import org.kyojo.schemaorg.m3n4.core.Clazz.MapCategoryType;
import org.kyojo.schemaorg.m3n4.core.Clazz.MarryAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Mass;
import org.kyojo.schemaorg.m3n4.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.MedicalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.MeetingRoom;
import org.kyojo.schemaorg.m3n4.core.Clazz.MensClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Menu;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.Message;
import org.kyojo.schemaorg.m3n4.core.Clazz.MiddleSchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobilePhoneStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n4.core.Clazz.Mosque;
import org.kyojo.schemaorg.m3n4.core.Clazz.Motel;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleDealer;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleRepair;
import org.kyojo.schemaorg.m3n4.core.Clazz.Mountain;
import org.kyojo.schemaorg.m3n4.core.Clazz.MoveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieRentalStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieTheater;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovingCompany;
import org.kyojo.schemaorg.m3n4.core.Clazz.Museum;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbumProductionType;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbumReleaseType;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicComposition;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicPlaylist;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRelease;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicReleaseFormatType;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicVenue;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicVideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.NGO;
import org.kyojo.schemaorg.m3n4.core.Clazz.NailSalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.NightClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Notary;
import org.kyojo.schemaorg.m3n4.core.Clazz.NoteDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.NutritionInformation;
import org.kyojo.schemaorg.m3n4.core.Clazz.OceanBodyOfWater;
import org.kyojo.schemaorg.m3n4.core.Clazz.Offer;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfferCatalog;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfferItemCondition;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfficeEquipmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.OnDemandEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.Order;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderItem;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderStatus;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrganizationRole;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrganizeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.OutletStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaintAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Painting;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParcelDelivery;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParcelService;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParentAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.Park;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParkingFacility;
import org.kyojo.schemaorg.m3n4.core.Clazz.PawnShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.PayAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentService;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentStatusType;
import org.kyojo.schemaorg.m3n4.core.Clazz.PeopleAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformanceRole;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingArtsTheater;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.Periodical;
import org.kyojo.schemaorg.m3n4.core.Clazz.Permit;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.PetStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Pharmacy;
import org.kyojo.schemaorg.m3n4.core.Clazz.Photograph;
import org.kyojo.schemaorg.m3n4.core.Clazz.PhotographAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Physician;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlaceOfWorship;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlanAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlayAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Playground;
import org.kyojo.schemaorg.m3n4.core.Clazz.Plumber;
import org.kyojo.schemaorg.m3n4.core.Clazz.PoliceStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Pond;
import org.kyojo.schemaorg.m3n4.core.Clazz.PostOffice;
import org.kyojo.schemaorg.m3n4.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n4.core.Clazz.PrependAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Preschool;
import org.kyojo.schemaorg.m3n4.core.Clazz.PresentationDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.Product;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfessionalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfilePage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProgramMembership;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValueSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicSwimmingPool;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationVolume;
import org.kyojo.schemaorg.m3n4.core.Clazz.QAPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.Quantity;
import org.kyojo.schemaorg.m3n4.core.Clazz.Question;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuoteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RVPark;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Rating;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReactAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReadAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RealEstateAgent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReceiveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Recipe;
import org.kyojo.schemaorg.m3n4.core.Clazz.RecyclingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.RegisterAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RejectAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RentAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RentalCarReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReplaceAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReplyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Report;
import org.kyojo.schemaorg.m3n4.core.Clazz.Reservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReservationPackage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReservationStatusType;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReserveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Reservoir;
import org.kyojo.schemaorg.m3n4.core.Clazz.Residence;
import org.kyojo.schemaorg.m3n4.core.Clazz.Resort;
import org.kyojo.schemaorg.m3n4.core.Clazz.Restaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.RestrictedDiet;
import org.kyojo.schemaorg.m3n4.core.Clazz.ResumeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReturnAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Review;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReviewAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RiverBodyOfWater;
import org.kyojo.schemaorg.m3n4.core.Clazz.Role;
import org.kyojo.schemaorg.m3n4.core.Clazz.RoofingContractor;
import org.kyojo.schemaorg.m3n4.core.Clazz.Room;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpResponseType;
import org.kyojo.schemaorg.m3n4.core.Clazz.SaleEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScheduleAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.School;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScreeningEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.Sculpture;
import org.kyojo.schemaorg.m3n4.core.Clazz.SeaBodyOfWater;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchResultsPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Seat;
import org.kyojo.schemaorg.m3n4.core.Clazz.SelfStorage;
import org.kyojo.schemaorg.m3n4.core.Clazz.SellAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Series;
import org.kyojo.schemaorg.m3n4.core.Clazz.Service;
import org.kyojo.schemaorg.m3n4.core.Clazz.ServiceChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShareAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoppingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.SingleFamilyResidence;
import org.kyojo.schemaorg.m3n4.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.SkiResort;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialMediaPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareSourceCode;
import org.kyojo.schemaorg.m3n4.core.Clazz.SomeProducts;
import org.kyojo.schemaorg.m3n4.core.Clazz.Specialty;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportingGoodsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsActivityLocation;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsTeam;
import org.kyojo.schemaorg.m3n4.core.Clazz.SpreadsheetDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.StadiumOrArena;
import org.kyojo.schemaorg.m3n4.core.Clazz.State;
import org.kyojo.schemaorg.m3n4.core.Clazz.SteeringPositionValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.Store;
import org.kyojo.schemaorg.m3n4.core.Clazz.StructuredValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.SubscribeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SubwayStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Suite;
import org.kyojo.schemaorg.m3n4.core.Clazz.SuspendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Synagogue;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.Table;
import org.kyojo.schemaorg.m3n4.core.Clazz.TakeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TattooParlor;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiService;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiStand;
import org.kyojo.schemaorg.m3n4.core.Clazz.TechArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TennisComplex;
import org.kyojo.schemaorg.m3n4.core.Clazz.TextDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n4.core.Clazz.Ticket;
import org.kyojo.schemaorg.m3n4.core.Clazz.TieAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TipAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TireShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristAttraction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristInformationCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.ToyStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrackAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TradeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainTrip;
import org.kyojo.schemaorg.m3n4.core.Clazz.TransferAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TravelAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TravelAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Clazz.TypeAndQuantityNode;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnRegisterAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.UpdateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.UseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Vehicle;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.ViewAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtsEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtwork;
import org.kyojo.schemaorg.m3n4.core.Clazz.Volcano;
import org.kyojo.schemaorg.m3n4.core.Clazz.VoteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPHeader;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPSideBar;
import org.kyojo.schemaorg.m3n4.core.Clazz.WantAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WarrantyPromise;
import org.kyojo.schemaorg.m3n4.core.Clazz.WarrantyScope;
import org.kyojo.schemaorg.m3n4.core.Clazz.WatchAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Waterfall;
import org.kyojo.schemaorg.m3n4.core.Clazz.WearAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebSite;
import org.kyojo.schemaorg.m3n4.core.Clazz.WholesaleStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.WinAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Winery;
import org.kyojo.schemaorg.m3n4.core.Clazz.WriteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Zoo;
import org.kyojo.schemaorg.m3n4.core.Container.Instrument;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.DataType.Date;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalProcedureType.SurgicalProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.CommunityHealth;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Dermatology;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.DietNutrition;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Emergency;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Geriatric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Gynecologic;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Midwifery;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Nursing;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Obstetric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Oncologic;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Optometric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Otolaryngologic;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Pediatric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Physiotherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PlasticSurgery;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Podiatric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PrimaryCare;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.Psychiatric;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.PublicHealth;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.RespiratoryTherapy;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Class;
import org.kyojo.schemaorg.m3n4.meta.Clazz.Property;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AMRadioChannel;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ActionAccessSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AdvertiserContentArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BedType;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BroadcastFrequencySpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BrokerageAccount;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCode;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCodeSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Claim;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CompleteDataFeed;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Consortium;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CriticReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTerm;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTermSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Distillery;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerAggregateRating;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EndorsementRating;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EventSeries;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ExchangeRateSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FAQPage;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FMRadioChannel;
import org.kyojo.schemaorg.m3n4.pending.Clazz.GeospatialGeometry;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthInsurancePlan;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanCostSharingSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanFormulary;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanNetwork;
import org.kyojo.schemaorg.m3n4.pending.Clazz.InvestmentFund;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegalValueLevel;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Legislation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegislationObject;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LibrarySystem;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LinkRole;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MediaSubscription;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MoneyTransfer;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MortgageLoan;
import org.kyojo.schemaorg.m3n4.pending.Clazz.NewsMediaOrganization;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Occupation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.PreOrderAction;
import org.kyojo.schemaorg.m3n4.pending.Clazz.PublicToilet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.QuantitativeValueDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Quotation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.RepaymentSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReviewNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.SatiricalArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Schedule;
import org.kyojo.schemaorg.m3n4.pending.Clazz.SpeakableSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.TouristDestination;
import org.kyojo.schemaorg.m3n4.pending.Clazz.TouristTrip;
import org.kyojo.schemaorg.m3n4.pending.Clazz.UserReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WebAPI;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WorkersUnion;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/action")
	@SchemaOrgLabel("action")
	@SchemaOrgComment(""
			+ "Obsolete term for <a class=\"localLink\""
			+ " href=\"http://schema.org/muscleAction\">muscleAction</a>. Not to be confused"
			+ " with <a class=\"localLink\""
			+ " href=\"http://schema.org/potentialAction\">potentialAction</a>.")
	@CamelizedName("action")
	@ConstantizedName("ACTION")
	public interface Action extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/activeIngredient")
	@SchemaOrgLabel("activeIngredient")
	@SchemaOrgComment(""
			+ "An active ingredient, typically chemical compounds and/or biologic substances.")
	@CamelizedName("activeIngredient")
	@ConstantizedName("ACTIVE_INGREDIENT")
	public interface ActiveIngredient extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/activityDuration")
	@SchemaOrgLabel("activityDuration")
	@SchemaOrgComment(""
			+ "Length of time to engage in the activity.")
	@CamelizedName("activityDuration")
	@ConstantizedName("ACTIVITY_DURATION")
	public interface ActivityDuration extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
		public boolean hasDuration();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/activityFrequency")
	@SchemaOrgLabel("activityFrequency")
	@SchemaOrgComment(""
			+ "How often one should engage in the activity.")
	@CamelizedName("activityFrequency")
	@ConstantizedName("ACTIVITY_FREQUENCY")
	public interface ActivityFrequency extends NativeValueText, SchemaOrgProperty {

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/additionalVariable")
	@SchemaOrgLabel("additionalVariable")
	@SchemaOrgComment(""
			+ "Any additional component of the exercise prescription that may need to be"
			+ " articulated to the patient. This may include the order of exercises, the number"
			+ " of repetitions of movement, quantitative distance, progressions over time, etc.")
	@CamelizedName("additionalVariable")
	@ConstantizedName("ADDITIONAL_VARIABLE")
	public interface AdditionalVariable extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/administrationRoute")
	@SchemaOrgLabel("administrationRoute")
	@SchemaOrgComment(""
			+ "A route by which this drug may be administered, e.g. 'oral'.")
	@CamelizedName("administrationRoute")
	@ConstantizedName("ADMINISTRATION_ROUTE")
	public interface AdministrationRoute extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/adverseOutcome")
	@SchemaOrgLabel("adverseOutcome")
	@SchemaOrgComment(""
			+ "A possible complication and/or side effect of this therapy. If it is known that"
			+ " an adverse outcome is serious (resulting in death, disability, or permanent"
			+ " damage; requiring hospitalization; or is otherwise life-threatening or requires"
			+ " immediate medical attention), tag it as a seriouseAdverseOutcome instead.")
	@CamelizedName("adverseOutcome")
	@ConstantizedName("ADVERSE_OUTCOME")
	public interface AdverseOutcome extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/affectedBy")
	@SchemaOrgLabel("affectedBy")
	@SchemaOrgComment("Drugs that affect the test's results.")
	@CamelizedName("affectedBy")
	@ConstantizedName("AFFECTED_BY")
	public interface AffectedBy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/alcoholWarning")
	@SchemaOrgLabel("alcoholWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to consumption of"
			+ " alcohol while taking this drug.")
	@CamelizedName("alcoholWarning")
	@ConstantizedName("ALCOHOL_WARNING")
	public interface AlcoholWarning extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/algorithm")
	@SchemaOrgLabel("algorithm")
	@SchemaOrgComment(""
			+ "The algorithm or rules to follow to compute the score.")
	@CamelizedName("algorithm")
	@ConstantizedName("ALGORITHM")
	public interface Algorithm extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/antagonist")
	@SchemaOrgLabel("antagonist")
	@SchemaOrgComment(""
			+ "The muscle whose action counteracts the specified muscle.")
	@CamelizedName("antagonist")
	@ConstantizedName("ANTAGONIST")
	public interface Antagonist extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/applicableLocation")
	@SchemaOrgLabel("applicableLocation")
	@SchemaOrgComment(""
			+ "The location in which the status applies.")
	@CamelizedName("applicableLocation")
	@ConstantizedName("APPLICABLE_LOCATION")
	public interface ApplicableLocation extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		/**
		 * @see <a href="http://schema.org/City">http://schema.org/City</a>
		 */
		public City getCity();
		public void setCity(City city);
		public List<City> getCityList();
		public void setCityList(List<City> cityList);
		public boolean hasCity();

		/**
		 * @see <a href="http://schema.org/Country">http://schema.org/Country</a>
		 */
		public Country getCountry();
		public void setCountry(Country country);
		public List<Country> getCountryList();
		public void setCountryList(List<Country> countryList);
		public boolean hasCountry();

		/**
		 * @see <a href="http://schema.org/State">http://schema.org/State</a>
		 */
		public State getState();
		public void setState(State state);
		public List<State> getStateList();
		public void setStateList(List<State> stateList);
		public boolean hasState();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/arterialBranch")
	@SchemaOrgLabel("arterialBranch")
	@SchemaOrgComment(""
			+ "The branches that comprise the arterial structure.")
	@CamelizedName("arterialBranch")
	@ConstantizedName("ARTERIAL_BRANCH")
	public interface ArterialBranch extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedAnatomy")
	@SchemaOrgLabel("associatedAnatomy")
	@SchemaOrgComment(""
			+ "The anatomy of the underlying organ system or structures associated with this"
			+ " entity.")
	@CamelizedName("associatedAnatomy")
	@ConstantizedName("ASSOCIATED_ANATOMY")
	public interface AssociatedAnatomy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/associatedPathophysiology")
	@SchemaOrgLabel("associatedPathophysiology")
	@SchemaOrgComment(""
			+ "If applicable, a description of the pathophysiology associated with the"
			+ " anatomical system, including potential abnormal changes in the mechanical,"
			+ " physical, and biochemical functions of the system.")
	@CamelizedName("associatedPathophysiology")
	@ConstantizedName("ASSOCIATED_PATHOPHYSIOLOGY")
	public interface AssociatedPathophysiology extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/availableIn")
	@SchemaOrgLabel("availableIn")
	@SchemaOrgComment(""
			+ "The location in which the strength is available.")
	@CamelizedName("availableIn")
	@ConstantizedName("AVAILABLE_IN")
	public interface AvailableIn extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		/**
		 * @see <a href="http://schema.org/City">http://schema.org/City</a>
		 */
		public City getCity();
		public void setCity(City city);
		public List<City> getCityList();
		public void setCityList(List<City> cityList);
		public boolean hasCity();

		/**
		 * @see <a href="http://schema.org/Country">http://schema.org/Country</a>
		 */
		public Country getCountry();
		public void setCountry(Country country);
		public List<Country> getCountryList();
		public void setCountryList(List<Country> countryList);
		public boolean hasCountry();

		/**
		 * @see <a href="http://schema.org/State">http://schema.org/State</a>
		 */
		public State getState();
		public void setState(State state);
		public List<State> getStateList();
		public void setStateList(List<State> stateList);
		public boolean hasState();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableService")
	@SchemaOrgLabel("availableService")
	@SchemaOrgComment(""
			+ "A medical service available from this provider.")
	@CamelizedName("availableService")
	@ConstantizedName("AVAILABLE_SERVICE")
	public interface AvailableService extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableStrength")
	@SchemaOrgLabel("availableStrength")
	@SchemaOrgComment(""
			+ "An available dosage strength for the drug.")
	@CamelizedName("availableStrength")
	@ConstantizedName("AVAILABLE_STRENGTH")
	public interface AvailableStrength extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/availableTest")
	@SchemaOrgLabel("availableTest")
	@SchemaOrgComment(""
			+ "A diagnostic test or procedure offered by this lab.")
	@CamelizedName("availableTest")
	@ConstantizedName("AVAILABLE_TEST")
	public interface AvailableTest extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/background")
	@SchemaOrgLabel("background")
	@SchemaOrgComment(""
			+ "Descriptive information establishing a historical perspective on the supplement."
			+ " May include the rationale for the name, the population where the supplement"
			+ " first came to prominence, etc.")
	@CamelizedName("background")
	@ConstantizedName("BACKGROUND")
	public interface Background extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/biomechnicalClass")
	@SchemaOrgLabel("biomechnicalClass")
	@SchemaOrgComment(""
			+ "The biomechanical properties of the bone.")
	@CamelizedName("biomechnicalClass")
	@ConstantizedName("BIOMECHNICAL_CLASS")
	public interface BiomechnicalClass extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/bloodSupply")
	@SchemaOrgLabel("bloodSupply")
	@SchemaOrgComment(""
			+ "The blood vessel that carries blood from the heart to the muscle.")
	@CamelizedName("bloodSupply")
	@ConstantizedName("BLOOD_SUPPLY")
	public interface BloodSupply extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/bodyLocation")
	@SchemaOrgLabel("bodyLocation")
	@SchemaOrgComment(""
			+ "Location in the body of the anatomical structure.")
	@CamelizedName("bodyLocation")
	@ConstantizedName("BODY_LOCATION")
	public interface BodyLocation extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/breastfeedingWarning")
	@SchemaOrgLabel("breastfeedingWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to this drug's use by"
			+ " breastfeeding mothers.")
	@CamelizedName("breastfeedingWarning")
	@ConstantizedName("BREASTFEEDING_WARNING")
	public interface BreastfeedingWarning extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/cause")
	@SchemaOrgLabel("cause")
	@SchemaOrgComment(""
			+ "Specifying a cause of something in general. e.g in medicine , one of the"
			+ " causative agent(s) that are most directly responsible for the pathophysiologic"
			+ " process that eventually results in the occurrence.")
	@CamelizedName("cause")
	@ConstantizedName("CAUSE")
	public interface Cause extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/causeOf")
	@SchemaOrgLabel("causeOf")
	@SchemaOrgComment(""
			+ "The condition, complication, symptom, sign, etc. caused.")
	@CamelizedName("causeOf")
	@ConstantizedName("CAUSE_OF")
	public interface CauseOf extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/clinicalPharmacology")
	@SchemaOrgLabel("clinicalPharmacology")
	@SchemaOrgComment(""
			+ "Description of the absorption and elimination of drugs, including their"
			+ " concentration (pharmacokinetics, pK) and biological effects (pharmacodynamics,"
			+ " pD).")
	@CamelizedName("clinicalPharmacology")
	@ConstantizedName("CLINICAL_PHARMACOLOGY")
	public interface ClinicalPharmacology extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/code")
	@SchemaOrgLabel("code")
	@SchemaOrgComment(""
			+ "A medical code for the entity, taken from a controlled vocabulary or ontology"
			+ " such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.")
	@CamelizedName("code")
	@ConstantizedName("CODE")
	public interface Code extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/codingSystem")
	@SchemaOrgLabel("codingSystem")
	@SchemaOrgComment("The coding system, e.g. 'ICD-10'.")
	@CamelizedName("codingSystem")
	@ConstantizedName("CODING_SYSTEM")
	public interface CodingSystem extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/comprisedOf")
	@SchemaOrgLabel("comprisedOf")
	@SchemaOrgComment(""
			+ "Specifying something physically contained by something else. Typically used here"
			+ " for the underlying anatomical structures, such as organs, that comprise the"
			+ " anatomical system.")
	@CamelizedName("comprisedOf")
	@ConstantizedName("COMPRISED_OF")
	public interface ComprisedOf extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/connectedTo")
	@SchemaOrgLabel("connectedTo")
	@SchemaOrgComment(""
			+ "Other anatomical structures to which this structure is connected.")
	@CamelizedName("connectedTo")
	@ConstantizedName("CONNECTED_TO")
	public interface ConnectedTo extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/contraindication")
	@SchemaOrgLabel("contraindication")
	@SchemaOrgComment("A contraindication for this therapy.")
	@CamelizedName("contraindication")
	@ConstantizedName("CONTRAINDICATION")
	public interface Contraindication extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

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
	@SchemaOrgURI("http://schema.org/cost")
	@SchemaOrgLabel("cost")
	@SchemaOrgComment(""
			+ "Cost per unit of the drug, as reported by the source being tagged.")
	@CamelizedName("cost")
	@ConstantizedName("COST")
	public interface Cost extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public Clazz.DrugCost getDrugCost();
		public void setDrugCost(Clazz.DrugCost drugCost);
		public List<Clazz.DrugCost> getDrugCostList();
		public void setDrugCostList(List<Clazz.DrugCost> drugCostList);
		public boolean hasDrugCost();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costCategory")
	@SchemaOrgLabel("costCategory")
	@SchemaOrgComment(""
			+ "The category of cost, such as wholesale, retail, reimbursement cap, etc.")
	@CamelizedName("costCategory")
	@ConstantizedName("COST_CATEGORY")
	public interface CostCategory extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public Clazz.DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(Clazz.DrugCostCategory drugCostCategory);
		public List<Clazz.DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<Clazz.DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/costCurrency")
	@SchemaOrgLabel("costCurrency")
	@SchemaOrgComment(""
			+ "The currency (in 3-letter of the drug cost. See:"
			+ " http://en.wikipedia.org/wiki/ISO_4217")
	@CamelizedName("costCurrency")
	@ConstantizedName("COST_CURRENCY")
	public interface CostCurrency extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/costOrigin")
	@SchemaOrgLabel("costOrigin")
	@SchemaOrgComment(""
			+ "Additional details to capture the origin of the cost data. For example,"
			+ " 'Medicare Part B'.")
	@CamelizedName("costOrigin")
	@ConstantizedName("COST_ORIGIN")
	public interface CostOrigin extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/costPerUnit")
	@SchemaOrgLabel("costPerUnit")
	@SchemaOrgComment("The cost per unit of the drug.")
	@CamelizedName("costPerUnit")
	@ConstantizedName("COST_PER_UNIT")
	public interface CostPerUnit extends NativeValueText, SchemaOrgProperty {

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diagnosis")
	@SchemaOrgLabel("diagnosis")
	@SchemaOrgComment(""
			+ "One or more alternative conditions considered in the differential diagnosis"
			+ " process as output of a diagnosis process.")
	@CamelizedName("diagnosis")
	@ConstantizedName("DIAGNOSIS")
	public interface Diagnosis extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diagram")
	@SchemaOrgLabel("diagram")
	@SchemaOrgComment(""
			+ "An image containing a diagram that illustrates the structure and/or its"
			+ " component substructures and/or connections with other structures.")
	@CamelizedName("diagram")
	@ConstantizedName("DIAGRAM")
	public interface Diagram extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Barcode">http://schema.org/Barcode</a>
		 */
		public Barcode getBarcode();
		public void setBarcode(Barcode barcode);
		public List<Barcode> getBarcodeList();
		public void setBarcodeList(List<Barcode> barcodeList);
		public boolean hasBarcode();

		/**
		 * @see <a href="http://schema.org/ImageObject">http://schema.org/ImageObject</a>
		 */
		public ImageObject getImageObject();
		public void setImageObject(ImageObject imageObject);
		public List<ImageObject> getImageObjectList();
		public void setImageObjectList(List<ImageObject> imageObjectList);
		public boolean hasImageObject();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/diet")
	@SchemaOrgLabel("diet")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The diet used in this action.")
	@CamelizedName("diet")
	@ConstantizedName("DIET")
	public interface Diet extends Instrument, NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dietFeatures")
	@SchemaOrgLabel("dietFeatures")
	@SchemaOrgComment(""
			+ "Nutritional information specific to the dietary plan. May include dietary"
			+ " recommendations on what foods to avoid, what foods to consume, and specific"
			+ " alterations/deviations from the USDA or other regulatory body's approved"
			+ " dietary guidelines.")
	@CamelizedName("dietFeatures")
	@ConstantizedName("DIET_FEATURES")
	public interface DietFeatures extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/differentialDiagnosis")
	@SchemaOrgLabel("differentialDiagnosis")
	@SchemaOrgComment(""
			+ "One of a set of differential diagnoses for the condition. Specifically, a"
			+ " closely-related or competing diagnosis typically considered later in the"
			+ " cognitive process whereby this medical condition is distinguished from others"
			+ " most likely responsible for a similar collection of signs and symptoms to reach"
			+ " the most parsimonious diagnosis or diagnoses in a patient.")
	@CamelizedName("differentialDiagnosis")
	@ConstantizedName("DIFFERENTIAL_DIAGNOSIS")
	public interface DifferentialDiagnosis extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/distinguishingSign")
	@SchemaOrgLabel("distinguishingSign")
	@SchemaOrgComment(""
			+ "One of a set of signs and symptoms that can be used to distinguish this"
			+ " diagnosis from others in the differential diagnosis.")
	@CamelizedName("distinguishingSign")
	@ConstantizedName("DISTINGUISHING_SIGN")
	public interface DistinguishingSign extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/dosageForm")
	@SchemaOrgLabel("dosageForm")
	@SchemaOrgComment(""
			+ "A dosage form in which this drug/supplement is available, e.g. 'tablet',"
			+ " 'suspension', 'injection'.")
	@CamelizedName("dosageForm")
	@ConstantizedName("DOSAGE_FORM")
	public interface DosageForm extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/doseSchedule")
	@SchemaOrgLabel("doseSchedule")
	@SchemaOrgComment(""
			+ "A dosing schedule for the drug for a given population, either observed,"
			+ " recommended, or maximum dose based on the type used.")
	@CamelizedName("doseSchedule")
	@ConstantizedName("DOSE_SCHEDULE")
	public interface DoseSchedule extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/doseUnit")
	@SchemaOrgLabel("doseUnit")
	@SchemaOrgComment("The unit of the dose, e.g. 'mg'.")
	@CamelizedName("doseUnit")
	@ConstantizedName("DOSE_UNIT")
	public interface DoseUnit extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/doseValue")
	@SchemaOrgLabel("doseValue")
	@SchemaOrgComment("The value of the dose, e.g. 500.")
	@CamelizedName("doseValue")
	@ConstantizedName("DOSE_VALUE")
	public interface DoseValue extends NativeValueNumber, SchemaOrgProperty {

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
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drainsTo")
	@SchemaOrgLabel("drainsTo")
	@SchemaOrgComment(""
			+ "The vasculature that the vein drains into.")
	@CamelizedName("drainsTo")
	@ConstantizedName("DRAINS_TO")
	public interface DrainsTo extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drug")
	@SchemaOrgLabel("drug")
	@SchemaOrgComment(""
			+ "Specifying a drug or medicine used in a medication procedure")
	@CamelizedName("drug")
	@ConstantizedName("DRUG")
	public interface Drug extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drugClass")
	@SchemaOrgLabel("drugClass")
	@SchemaOrgComment(""
			+ "The class of drug this belongs to (e.g., statins).")
	@CamelizedName("drugClass")
	@ConstantizedName("DRUG_CLASS")
	public interface DrugClass extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public Clazz.DrugClass getDrugClass();
		public void setDrugClass(Clazz.DrugClass drugClass);
		public List<Clazz.DrugClass> getDrugClassList();
		public void setDrugClassList(List<Clazz.DrugClass> drugClassList);
		public boolean hasDrugClass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/drugUnit")
	@SchemaOrgLabel("drugUnit")
	@SchemaOrgComment(""
			+ "The unit in which the drug is measured, e.g. '5 mg tablet'.")
	@CamelizedName("drugUnit")
	@ConstantizedName("DRUG_UNIT")
	public interface DrugUnit extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/duplicateTherapy")
	@SchemaOrgLabel("duplicateTherapy")
	@SchemaOrgComment(""
			+ "A therapy that duplicates or overlaps this one.")
	@CamelizedName("duplicateTherapy")
	@ConstantizedName("DUPLICATE_THERAPY")
	public interface DuplicateTherapy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/endorsers")
	@SchemaOrgLabel("endorsers")
	@SchemaOrgComment(""
			+ "People or organizations that endorse the plan.")
	@CamelizedName("endorsers")
	@ConstantizedName("ENDORSERS")
	public interface Endorsers extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AccountingService">http://schema.org/AccountingService</a>
		 */
		public AccountingService getAccountingService();
		public void setAccountingService(AccountingService accountingService);
		public List<AccountingService> getAccountingServiceList();
		public void setAccountingServiceList(List<AccountingService> accountingServiceList);
		public boolean hasAccountingService();

		/**
		 * @see <a href="http://schema.org/AdultEntertainment">http://schema.org/AdultEntertainment</a>
		 */
		public AdultEntertainment getAdultEntertainment();
		public void setAdultEntertainment(AdultEntertainment adultEntertainment);
		public List<AdultEntertainment> getAdultEntertainmentList();
		public void setAdultEntertainmentList(List<AdultEntertainment> adultEntertainmentList);
		public boolean hasAdultEntertainment();

		/**
		 * @see <a href="http://schema.org/Airline">http://schema.org/Airline</a>
		 */
		public Airline getAirline();
		public void setAirline(Airline airline);
		public List<Airline> getAirlineList();
		public void setAirlineList(List<Airline> airlineList);
		public boolean hasAirline();

		/**
		 * @see <a href="http://schema.org/AmusementPark">http://schema.org/AmusementPark</a>
		 */
		public AmusementPark getAmusementPark();
		public void setAmusementPark(AmusementPark amusementPark);
		public List<AmusementPark> getAmusementParkList();
		public void setAmusementParkList(List<AmusementPark> amusementParkList);
		public boolean hasAmusementPark();

		/**
		 * @see <a href="http://schema.org/AnimalShelter">http://schema.org/AnimalShelter</a>
		 */
		public AnimalShelter getAnimalShelter();
		public void setAnimalShelter(AnimalShelter animalShelter);
		public List<AnimalShelter> getAnimalShelterList();
		public void setAnimalShelterList(List<AnimalShelter> animalShelterList);
		public boolean hasAnimalShelter();

		/**
		 * @see <a href="http://schema.org/ArtGallery">http://schema.org/ArtGallery</a>
		 */
		public ArtGallery getArtGallery();
		public void setArtGallery(ArtGallery artGallery);
		public List<ArtGallery> getArtGalleryList();
		public void setArtGalleryList(List<ArtGallery> artGalleryList);
		public boolean hasArtGallery();

		/**
		 * @see <a href="http://schema.org/Attorney">http://schema.org/Attorney</a>
		 */
		public Attorney getAttorney();
		public void setAttorney(Attorney attorney);
		public List<Attorney> getAttorneyList();
		public void setAttorneyList(List<Attorney> attorneyList);
		public boolean hasAttorney();

		/**
		 * @see <a href="http://schema.org/AutoBodyShop">http://schema.org/AutoBodyShop</a>
		 */
		public AutoBodyShop getAutoBodyShop();
		public void setAutoBodyShop(AutoBodyShop autoBodyShop);
		public List<AutoBodyShop> getAutoBodyShopList();
		public void setAutoBodyShopList(List<AutoBodyShop> autoBodyShopList);
		public boolean hasAutoBodyShop();

		/**
		 * @see <a href="http://schema.org/AutoDealer">http://schema.org/AutoDealer</a>
		 */
		public AutoDealer getAutoDealer();
		public void setAutoDealer(AutoDealer autoDealer);
		public List<AutoDealer> getAutoDealerList();
		public void setAutoDealerList(List<AutoDealer> autoDealerList);
		public boolean hasAutoDealer();

		/**
		 * @see <a href="http://schema.org/AutoPartsStore">http://schema.org/AutoPartsStore</a>
		 */
		public AutoPartsStore getAutoPartsStore();
		public void setAutoPartsStore(AutoPartsStore autoPartsStore);
		public List<AutoPartsStore> getAutoPartsStoreList();
		public void setAutoPartsStoreList(List<AutoPartsStore> autoPartsStoreList);
		public boolean hasAutoPartsStore();

		/**
		 * @see <a href="http://schema.org/AutoRental">http://schema.org/AutoRental</a>
		 */
		public AutoRental getAutoRental();
		public void setAutoRental(AutoRental autoRental);
		public List<AutoRental> getAutoRentalList();
		public void setAutoRentalList(List<AutoRental> autoRentalList);
		public boolean hasAutoRental();

		/**
		 * @see <a href="http://schema.org/AutoRepair">http://schema.org/AutoRepair</a>
		 */
		public AutoRepair getAutoRepair();
		public void setAutoRepair(AutoRepair autoRepair);
		public List<AutoRepair> getAutoRepairList();
		public void setAutoRepairList(List<AutoRepair> autoRepairList);
		public boolean hasAutoRepair();

		/**
		 * @see <a href="http://schema.org/AutoWash">http://schema.org/AutoWash</a>
		 */
		public AutoWash getAutoWash();
		public void setAutoWash(AutoWash autoWash);
		public List<AutoWash> getAutoWashList();
		public void setAutoWashList(List<AutoWash> autoWashList);
		public boolean hasAutoWash();

		/**
		 * @see <a href="http://schema.org/AutomatedTeller">http://schema.org/AutomatedTeller</a>
		 */
		public AutomatedTeller getAutomatedTeller();
		public void setAutomatedTeller(AutomatedTeller automatedTeller);
		public List<AutomatedTeller> getAutomatedTellerList();
		public void setAutomatedTellerList(List<AutomatedTeller> automatedTellerList);
		public boolean hasAutomatedTeller();

		/**
		 * @see <a href="http://schema.org/AutomotiveBusiness">http://schema.org/AutomotiveBusiness</a>
		 */
		public AutomotiveBusiness getAutomotiveBusiness();
		public void setAutomotiveBusiness(AutomotiveBusiness automotiveBusiness);
		public List<AutomotiveBusiness> getAutomotiveBusinessList();
		public void setAutomotiveBusinessList(List<AutomotiveBusiness> automotiveBusinessList);
		public boolean hasAutomotiveBusiness();

		/**
		 * @see <a href="http://schema.org/Bakery">http://schema.org/Bakery</a>
		 */
		public Bakery getBakery();
		public void setBakery(Bakery bakery);
		public List<Bakery> getBakeryList();
		public void setBakeryList(List<Bakery> bakeryList);
		public boolean hasBakery();

		/**
		 * @see <a href="http://schema.org/BankOrCreditUnion">http://schema.org/BankOrCreditUnion</a>
		 */
		public BankOrCreditUnion getBankOrCreditUnion();
		public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion);
		public List<BankOrCreditUnion> getBankOrCreditUnionList();
		public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList);
		public boolean hasBankOrCreditUnion();

		/**
		 * @see <a href="http://schema.org/BarOrPub">http://schema.org/BarOrPub</a>
		 */
		public BarOrPub getBarOrPub();
		public void setBarOrPub(BarOrPub barOrPub);
		public List<BarOrPub> getBarOrPubList();
		public void setBarOrPubList(List<BarOrPub> barOrPubList);
		public boolean hasBarOrPub();

		/**
		 * @see <a href="http://schema.org/BeautySalon">http://schema.org/BeautySalon</a>
		 */
		public BeautySalon getBeautySalon();
		public void setBeautySalon(BeautySalon beautySalon);
		public List<BeautySalon> getBeautySalonList();
		public void setBeautySalonList(List<BeautySalon> beautySalonList);
		public boolean hasBeautySalon();

		/**
		 * @see <a href="http://schema.org/BedAndBreakfast">http://schema.org/BedAndBreakfast</a>
		 */
		public BedAndBreakfast getBedAndBreakfast();
		public void setBedAndBreakfast(BedAndBreakfast bedAndBreakfast);
		public List<BedAndBreakfast> getBedAndBreakfastList();
		public void setBedAndBreakfastList(List<BedAndBreakfast> bedAndBreakfastList);
		public boolean hasBedAndBreakfast();

		/**
		 * @see <a href="http://schema.org/BikeStore">http://schema.org/BikeStore</a>
		 */
		public BikeStore getBikeStore();
		public void setBikeStore(BikeStore bikeStore);
		public List<BikeStore> getBikeStoreList();
		public void setBikeStoreList(List<BikeStore> bikeStoreList);
		public boolean hasBikeStore();

		/**
		 * @see <a href="http://schema.org/BookStore">http://schema.org/BookStore</a>
		 */
		public BookStore getBookStore();
		public void setBookStore(BookStore bookStore);
		public List<BookStore> getBookStoreList();
		public void setBookStoreList(List<BookStore> bookStoreList);
		public boolean hasBookStore();

		/**
		 * @see <a href="http://schema.org/BowlingAlley">http://schema.org/BowlingAlley</a>
		 */
		public BowlingAlley getBowlingAlley();
		public void setBowlingAlley(BowlingAlley bowlingAlley);
		public List<BowlingAlley> getBowlingAlleyList();
		public void setBowlingAlleyList(List<BowlingAlley> bowlingAlleyList);
		public boolean hasBowlingAlley();

		/**
		 * @see <a href="http://schema.org/Brewery">http://schema.org/Brewery</a>
		 */
		public Brewery getBrewery();
		public void setBrewery(Brewery brewery);
		public List<Brewery> getBreweryList();
		public void setBreweryList(List<Brewery> breweryList);
		public boolean hasBrewery();

		/**
		 * @see <a href="http://schema.org/CafeOrCoffeeShop">http://schema.org/CafeOrCoffeeShop</a>
		 */
		public CafeOrCoffeeShop getCafeOrCoffeeShop();
		public void setCafeOrCoffeeShop(CafeOrCoffeeShop cafeOrCoffeeShop);
		public List<CafeOrCoffeeShop> getCafeOrCoffeeShopList();
		public void setCafeOrCoffeeShopList(List<CafeOrCoffeeShop> cafeOrCoffeeShopList);
		public boolean hasCafeOrCoffeeShop();

		/**
		 * @see <a href="http://schema.org/Campground">http://schema.org/Campground</a>
		 */
		public Campground getCampground();
		public void setCampground(Campground campground);
		public List<Campground> getCampgroundList();
		public void setCampgroundList(List<Campground> campgroundList);
		public boolean hasCampground();

		/**
		 * @see <a href="http://schema.org/Casino">http://schema.org/Casino</a>
		 */
		public Casino getCasino();
		public void setCasino(Casino casino);
		public List<Casino> getCasinoList();
		public void setCasinoList(List<Casino> casinoList);
		public boolean hasCasino();

		/**
		 * @see <a href="http://schema.org/ChildCare">http://schema.org/ChildCare</a>
		 */
		public ChildCare getChildCare();
		public void setChildCare(ChildCare childCare);
		public List<ChildCare> getChildCareList();
		public void setChildCareList(List<ChildCare> childCareList);
		public boolean hasChildCare();

		/**
		 * @see <a href="http://schema.org/ClothingStore">http://schema.org/ClothingStore</a>
		 */
		public ClothingStore getClothingStore();
		public void setClothingStore(ClothingStore clothingStore);
		public List<ClothingStore> getClothingStoreList();
		public void setClothingStoreList(List<ClothingStore> clothingStoreList);
		public boolean hasClothingStore();

		/**
		 * @see <a href="http://schema.org/CollegeOrUniversity">http://schema.org/CollegeOrUniversity</a>
		 */
		public CollegeOrUniversity getCollegeOrUniversity();
		public void setCollegeOrUniversity(CollegeOrUniversity collegeOrUniversity);
		public List<CollegeOrUniversity> getCollegeOrUniversityList();
		public void setCollegeOrUniversityList(List<CollegeOrUniversity> collegeOrUniversityList);
		public boolean hasCollegeOrUniversity();

		/**
		 * @see <a href="http://schema.org/ComedyClub">http://schema.org/ComedyClub</a>
		 */
		public ComedyClub getComedyClub();
		public void setComedyClub(ComedyClub comedyClub);
		public List<ComedyClub> getComedyClubList();
		public void setComedyClubList(List<ComedyClub> comedyClubList);
		public boolean hasComedyClub();

		/**
		 * @see <a href="http://schema.org/CommunityHealth">http://schema.org/CommunityHealth</a>
		 */
		public CommunityHealth getCommunityHealth();
		public void setCommunityHealth(CommunityHealth communityHealth);
		public List<CommunityHealth> getCommunityHealthList();
		public void setCommunityHealthList(List<CommunityHealth> communityHealthList);
		public boolean hasCommunityHealth();

		/**
		 * @see <a href="http://schema.org/ComputerStore">http://schema.org/ComputerStore</a>
		 */
		public ComputerStore getComputerStore();
		public void setComputerStore(ComputerStore computerStore);
		public List<ComputerStore> getComputerStoreList();
		public void setComputerStoreList(List<ComputerStore> computerStoreList);
		public boolean hasComputerStore();

		/**
		 * @see <a href="http://schema.org/Consortium">http://schema.org/Consortium</a>
		 */
		public Consortium getConsortium();
		public void setConsortium(Consortium consortium);
		public List<Consortium> getConsortiumList();
		public void setConsortiumList(List<Consortium> consortiumList);
		public boolean hasConsortium();

		/**
		 * @see <a href="http://schema.org/ConvenienceStore">http://schema.org/ConvenienceStore</a>
		 */
		public ConvenienceStore getConvenienceStore();
		public void setConvenienceStore(ConvenienceStore convenienceStore);
		public List<ConvenienceStore> getConvenienceStoreList();
		public void setConvenienceStoreList(List<ConvenienceStore> convenienceStoreList);
		public boolean hasConvenienceStore();

		/**
		 * @see <a href="http://schema.org/Corporation">http://schema.org/Corporation</a>
		 */
		public Corporation getCorporation();
		public void setCorporation(Corporation corporation);
		public List<Corporation> getCorporationList();
		public void setCorporationList(List<Corporation> corporationList);
		public boolean hasCorporation();

		/**
		 * @see <a href="http://schema.org/DanceGroup">http://schema.org/DanceGroup</a>
		 */
		public DanceGroup getDanceGroup();
		public void setDanceGroup(DanceGroup danceGroup);
		public List<DanceGroup> getDanceGroupList();
		public void setDanceGroupList(List<DanceGroup> danceGroupList);
		public boolean hasDanceGroup();

		/**
		 * @see <a href="http://schema.org/DaySpa">http://schema.org/DaySpa</a>
		 */
		public DaySpa getDaySpa();
		public void setDaySpa(DaySpa daySpa);
		public List<DaySpa> getDaySpaList();
		public void setDaySpaList(List<DaySpa> daySpaList);
		public boolean hasDaySpa();

		/**
		 * @see <a href="http://schema.org/Dentist">http://schema.org/Dentist</a>
		 */
		public Dentist getDentist();
		public void setDentist(Dentist dentist);
		public List<Dentist> getDentistList();
		public void setDentistList(List<Dentist> dentistList);
		public boolean hasDentist();

		/**
		 * @see <a href="http://schema.org/DepartmentStore">http://schema.org/DepartmentStore</a>
		 */
		public DepartmentStore getDepartmentStore();
		public void setDepartmentStore(DepartmentStore departmentStore);
		public List<DepartmentStore> getDepartmentStoreList();
		public void setDepartmentStoreList(List<DepartmentStore> departmentStoreList);
		public boolean hasDepartmentStore();

		/**
		 * @see <a href="http://schema.org/Dermatology">http://schema.org/Dermatology</a>
		 */
		public Dermatology getDermatology();
		public void setDermatology(Dermatology dermatology);
		public List<Dermatology> getDermatologyList();
		public void setDermatologyList(List<Dermatology> dermatologyList);
		public boolean hasDermatology();

		/**
		 * @see <a href="http://schema.org/DiagnosticLab">http://schema.org/DiagnosticLab</a>
		 */
		public Clazz.DiagnosticLab getDiagnosticLab();
		public void setDiagnosticLab(Clazz.DiagnosticLab diagnosticLab);
		public List<Clazz.DiagnosticLab> getDiagnosticLabList();
		public void setDiagnosticLabList(List<Clazz.DiagnosticLab> diagnosticLabList);
		public boolean hasDiagnosticLab();

		/**
		 * @see <a href="http://schema.org/DietNutrition">http://schema.org/DietNutrition</a>
		 */
		public DietNutrition getDietNutrition();
		public void setDietNutrition(DietNutrition dietNutrition);
		public List<DietNutrition> getDietNutritionList();
		public void setDietNutritionList(List<DietNutrition> dietNutritionList);
		public boolean hasDietNutrition();

		/**
		 * @see <a href="http://schema.org/Distillery">http://schema.org/Distillery</a>
		 */
		public Distillery getDistillery();
		public void setDistillery(Distillery distillery);
		public List<Distillery> getDistilleryList();
		public void setDistilleryList(List<Distillery> distilleryList);
		public boolean hasDistillery();

		/**
		 * @see <a href="http://schema.org/DryCleaningOrLaundry">http://schema.org/DryCleaningOrLaundry</a>
		 */
		public DryCleaningOrLaundry getDryCleaningOrLaundry();
		public void setDryCleaningOrLaundry(DryCleaningOrLaundry dryCleaningOrLaundry);
		public List<DryCleaningOrLaundry> getDryCleaningOrLaundryList();
		public void setDryCleaningOrLaundryList(List<DryCleaningOrLaundry> dryCleaningOrLaundryList);
		public boolean hasDryCleaningOrLaundry();

		/**
		 * @see <a href="http://schema.org/EducationalOrganization">http://schema.org/EducationalOrganization</a>
		 */
		public EducationalOrganization getEducationalOrganization();
		public void setEducationalOrganization(EducationalOrganization educationalOrganization);
		public List<EducationalOrganization> getEducationalOrganizationList();
		public void setEducationalOrganizationList(List<EducationalOrganization> educationalOrganizationList);
		public boolean hasEducationalOrganization();

		/**
		 * @see <a href="http://schema.org/Electrician">http://schema.org/Electrician</a>
		 */
		public Electrician getElectrician();
		public void setElectrician(Electrician electrician);
		public List<Electrician> getElectricianList();
		public void setElectricianList(List<Electrician> electricianList);
		public boolean hasElectrician();

		/**
		 * @see <a href="http://schema.org/ElectronicsStore">http://schema.org/ElectronicsStore</a>
		 */
		public ElectronicsStore getElectronicsStore();
		public void setElectronicsStore(ElectronicsStore electronicsStore);
		public List<ElectronicsStore> getElectronicsStoreList();
		public void setElectronicsStoreList(List<ElectronicsStore> electronicsStoreList);
		public boolean hasElectronicsStore();

		/**
		 * @see <a href="http://schema.org/ElementarySchool">http://schema.org/ElementarySchool</a>
		 */
		public ElementarySchool getElementarySchool();
		public void setElementarySchool(ElementarySchool elementarySchool);
		public List<ElementarySchool> getElementarySchoolList();
		public void setElementarySchoolList(List<ElementarySchool> elementarySchoolList);
		public boolean hasElementarySchool();

		/**
		 * @see <a href="http://schema.org/Emergency">http://schema.org/Emergency</a>
		 */
		public Emergency getEmergency();
		public void setEmergency(Emergency emergency);
		public List<Emergency> getEmergencyList();
		public void setEmergencyList(List<Emergency> emergencyList);
		public boolean hasEmergency();

		/**
		 * @see <a href="http://schema.org/EmergencyService">http://schema.org/EmergencyService</a>
		 */
		public EmergencyService getEmergencyService();
		public void setEmergencyService(EmergencyService emergencyService);
		public List<EmergencyService> getEmergencyServiceList();
		public void setEmergencyServiceList(List<EmergencyService> emergencyServiceList);
		public boolean hasEmergencyService();

		/**
		 * @see <a href="http://schema.org/EmploymentAgency">http://schema.org/EmploymentAgency</a>
		 */
		public EmploymentAgency getEmploymentAgency();
		public void setEmploymentAgency(EmploymentAgency employmentAgency);
		public List<EmploymentAgency> getEmploymentAgencyList();
		public void setEmploymentAgencyList(List<EmploymentAgency> employmentAgencyList);
		public boolean hasEmploymentAgency();

		/**
		 * @see <a href="http://schema.org/EntertainmentBusiness">http://schema.org/EntertainmentBusiness</a>
		 */
		public EntertainmentBusiness getEntertainmentBusiness();
		public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness);
		public List<EntertainmentBusiness> getEntertainmentBusinessList();
		public void setEntertainmentBusinessList(List<EntertainmentBusiness> entertainmentBusinessList);
		public boolean hasEntertainmentBusiness();

		/**
		 * @see <a href="http://schema.org/ExerciseGym">http://schema.org/ExerciseGym</a>
		 */
		public ExerciseGym getExerciseGym();
		public void setExerciseGym(ExerciseGym exerciseGym);
		public List<ExerciseGym> getExerciseGymList();
		public void setExerciseGymList(List<ExerciseGym> exerciseGymList);
		public boolean hasExerciseGym();

		/**
		 * @see <a href="http://schema.org/FastFoodRestaurant">http://schema.org/FastFoodRestaurant</a>
		 */
		public FastFoodRestaurant getFastFoodRestaurant();
		public void setFastFoodRestaurant(FastFoodRestaurant fastFoodRestaurant);
		public List<FastFoodRestaurant> getFastFoodRestaurantList();
		public void setFastFoodRestaurantList(List<FastFoodRestaurant> fastFoodRestaurantList);
		public boolean hasFastFoodRestaurant();

		/**
		 * @see <a href="http://schema.org/FinancialService">http://schema.org/FinancialService</a>
		 */
		public FinancialService getFinancialService();
		public void setFinancialService(FinancialService financialService);
		public List<FinancialService> getFinancialServiceList();
		public void setFinancialServiceList(List<FinancialService> financialServiceList);
		public boolean hasFinancialService();

		/**
		 * @see <a href="http://schema.org/FireStation">http://schema.org/FireStation</a>
		 */
		public FireStation getFireStation();
		public void setFireStation(FireStation fireStation);
		public List<FireStation> getFireStationList();
		public void setFireStationList(List<FireStation> fireStationList);
		public boolean hasFireStation();

		/**
		 * @see <a href="http://schema.org/Florist">http://schema.org/Florist</a>
		 */
		public Florist getFlorist();
		public void setFlorist(Florist florist);
		public List<Florist> getFloristList();
		public void setFloristList(List<Florist> floristList);
		public boolean hasFlorist();

		/**
		 * @see <a href="http://schema.org/FoodEstablishment">http://schema.org/FoodEstablishment</a>
		 */
		public FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(FoodEstablishment foodEstablishment);
		public List<FoodEstablishment> getFoodEstablishmentList();
		public void setFoodEstablishmentList(List<FoodEstablishment> foodEstablishmentList);
		public boolean hasFoodEstablishment();

		/**
		 * @see <a href="http://schema.org/FurnitureStore">http://schema.org/FurnitureStore</a>
		 */
		public FurnitureStore getFurnitureStore();
		public void setFurnitureStore(FurnitureStore furnitureStore);
		public List<FurnitureStore> getFurnitureStoreList();
		public void setFurnitureStoreList(List<FurnitureStore> furnitureStoreList);
		public boolean hasFurnitureStore();

		/**
		 * @see <a href="http://schema.org/GardenStore">http://schema.org/GardenStore</a>
		 */
		public GardenStore getGardenStore();
		public void setGardenStore(GardenStore gardenStore);
		public List<GardenStore> getGardenStoreList();
		public void setGardenStoreList(List<GardenStore> gardenStoreList);
		public boolean hasGardenStore();

		/**
		 * @see <a href="http://schema.org/GasStation">http://schema.org/GasStation</a>
		 */
		public GasStation getGasStation();
		public void setGasStation(GasStation gasStation);
		public List<GasStation> getGasStationList();
		public void setGasStationList(List<GasStation> gasStationList);
		public boolean hasGasStation();

		/**
		 * @see <a href="http://schema.org/GeneralContractor">http://schema.org/GeneralContractor</a>
		 */
		public GeneralContractor getGeneralContractor();
		public void setGeneralContractor(GeneralContractor generalContractor);
		public List<GeneralContractor> getGeneralContractorList();
		public void setGeneralContractorList(List<GeneralContractor> generalContractorList);
		public boolean hasGeneralContractor();

		/**
		 * @see <a href="http://schema.org/Geriatric">http://schema.org/Geriatric</a>
		 */
		public Geriatric getGeriatric();
		public void setGeriatric(Geriatric geriatric);
		public List<Geriatric> getGeriatricList();
		public void setGeriatricList(List<Geriatric> geriatricList);
		public boolean hasGeriatric();

		/**
		 * @see <a href="http://schema.org/GolfCourse">http://schema.org/GolfCourse</a>
		 */
		public GolfCourse getGolfCourse();
		public void setGolfCourse(GolfCourse golfCourse);
		public List<GolfCourse> getGolfCourseList();
		public void setGolfCourseList(List<GolfCourse> golfCourseList);
		public boolean hasGolfCourse();

		/**
		 * @see <a href="http://schema.org/GovernmentOffice">http://schema.org/GovernmentOffice</a>
		 */
		public GovernmentOffice getGovernmentOffice();
		public void setGovernmentOffice(GovernmentOffice governmentOffice);
		public List<GovernmentOffice> getGovernmentOfficeList();
		public void setGovernmentOfficeList(List<GovernmentOffice> governmentOfficeList);
		public boolean hasGovernmentOffice();

		/**
		 * @see <a href="http://schema.org/GovernmentOrganization">http://schema.org/GovernmentOrganization</a>
		 */
		public GovernmentOrganization getGovernmentOrganization();
		public void setGovernmentOrganization(GovernmentOrganization governmentOrganization);
		public List<GovernmentOrganization> getGovernmentOrganizationList();
		public void setGovernmentOrganizationList(List<GovernmentOrganization> governmentOrganizationList);
		public boolean hasGovernmentOrganization();

		/**
		 * @see <a href="http://schema.org/GroceryStore">http://schema.org/GroceryStore</a>
		 */
		public GroceryStore getGroceryStore();
		public void setGroceryStore(GroceryStore groceryStore);
		public List<GroceryStore> getGroceryStoreList();
		public void setGroceryStoreList(List<GroceryStore> groceryStoreList);
		public boolean hasGroceryStore();

		/**
		 * @see <a href="http://schema.org/Gynecologic">http://schema.org/Gynecologic</a>
		 */
		public Gynecologic getGynecologic();
		public void setGynecologic(Gynecologic gynecologic);
		public List<Gynecologic> getGynecologicList();
		public void setGynecologicList(List<Gynecologic> gynecologicList);
		public boolean hasGynecologic();

		/**
		 * @see <a href="http://schema.org/HVACBusiness">http://schema.org/HVACBusiness</a>
		 */
		public HVACBusiness getHVACBusiness();
		public void setHVACBusiness(HVACBusiness hvacBusiness);
		public List<HVACBusiness> getHVACBusinessList();
		public void setHVACBusinessList(List<HVACBusiness> hvacBusinessList);
		public boolean hasHVACBusiness();

		/**
		 * @see <a href="http://schema.org/HairSalon">http://schema.org/HairSalon</a>
		 */
		public HairSalon getHairSalon();
		public void setHairSalon(HairSalon hairSalon);
		public List<HairSalon> getHairSalonList();
		public void setHairSalonList(List<HairSalon> hairSalonList);
		public boolean hasHairSalon();

		/**
		 * @see <a href="http://schema.org/HardwareStore">http://schema.org/HardwareStore</a>
		 */
		public HardwareStore getHardwareStore();
		public void setHardwareStore(HardwareStore hardwareStore);
		public List<HardwareStore> getHardwareStoreList();
		public void setHardwareStoreList(List<HardwareStore> hardwareStoreList);
		public boolean hasHardwareStore();

		/**
		 * @see <a href="http://schema.org/HealthAndBeautyBusiness">http://schema.org/HealthAndBeautyBusiness</a>
		 */
		public HealthAndBeautyBusiness getHealthAndBeautyBusiness();
		public void setHealthAndBeautyBusiness(HealthAndBeautyBusiness healthAndBeautyBusiness);
		public List<HealthAndBeautyBusiness> getHealthAndBeautyBusinessList();
		public void setHealthAndBeautyBusinessList(List<HealthAndBeautyBusiness> healthAndBeautyBusinessList);
		public boolean hasHealthAndBeautyBusiness();

		/**
		 * @see <a href="http://schema.org/HealthClub">http://schema.org/HealthClub</a>
		 */
		public HealthClub getHealthClub();
		public void setHealthClub(HealthClub healthClub);
		public List<HealthClub> getHealthClubList();
		public void setHealthClubList(List<HealthClub> healthClubList);
		public boolean hasHealthClub();

		/**
		 * @see <a href="http://schema.org/HighSchool">http://schema.org/HighSchool</a>
		 */
		public HighSchool getHighSchool();
		public void setHighSchool(HighSchool highSchool);
		public List<HighSchool> getHighSchoolList();
		public void setHighSchoolList(List<HighSchool> highSchoolList);
		public boolean hasHighSchool();

		/**
		 * @see <a href="http://schema.org/HobbyShop">http://schema.org/HobbyShop</a>
		 */
		public HobbyShop getHobbyShop();
		public void setHobbyShop(HobbyShop hobbyShop);
		public List<HobbyShop> getHobbyShopList();
		public void setHobbyShopList(List<HobbyShop> hobbyShopList);
		public boolean hasHobbyShop();

		/**
		 * @see <a href="http://schema.org/HomeAndConstructionBusiness">http://schema.org/HomeAndConstructionBusiness</a>
		 */
		public HomeAndConstructionBusiness getHomeAndConstructionBusiness();
		public void setHomeAndConstructionBusiness(HomeAndConstructionBusiness homeAndConstructionBusiness);
		public List<HomeAndConstructionBusiness> getHomeAndConstructionBusinessList();
		public void setHomeAndConstructionBusinessList(List<HomeAndConstructionBusiness> homeAndConstructionBusinessList);
		public boolean hasHomeAndConstructionBusiness();

		/**
		 * @see <a href="http://schema.org/HomeGoodsStore">http://schema.org/HomeGoodsStore</a>
		 */
		public HomeGoodsStore getHomeGoodsStore();
		public void setHomeGoodsStore(HomeGoodsStore homeGoodsStore);
		public List<HomeGoodsStore> getHomeGoodsStoreList();
		public void setHomeGoodsStoreList(List<HomeGoodsStore> homeGoodsStoreList);
		public boolean hasHomeGoodsStore();

		/**
		 * @see <a href="http://schema.org/Hospital">http://schema.org/Hospital</a>
		 */
		public Hospital getHospital();
		public void setHospital(Hospital hospital);
		public List<Hospital> getHospitalList();
		public void setHospitalList(List<Hospital> hospitalList);
		public boolean hasHospital();

		/**
		 * @see <a href="http://schema.org/Hostel">http://schema.org/Hostel</a>
		 */
		public Hostel getHostel();
		public void setHostel(Hostel hostel);
		public List<Hostel> getHostelList();
		public void setHostelList(List<Hostel> hostelList);
		public boolean hasHostel();

		/**
		 * @see <a href="http://schema.org/Hotel">http://schema.org/Hotel</a>
		 */
		public Hotel getHotel();
		public void setHotel(Hotel hotel);
		public List<Hotel> getHotelList();
		public void setHotelList(List<Hotel> hotelList);
		public boolean hasHotel();

		/**
		 * @see <a href="http://schema.org/HousePainter">http://schema.org/HousePainter</a>
		 */
		public HousePainter getHousePainter();
		public void setHousePainter(HousePainter housePainter);
		public List<HousePainter> getHousePainterList();
		public void setHousePainterList(List<HousePainter> housePainterList);
		public boolean hasHousePainter();

		/**
		 * @see <a href="http://schema.org/IceCreamShop">http://schema.org/IceCreamShop</a>
		 */
		public IceCreamShop getIceCreamShop();
		public void setIceCreamShop(IceCreamShop iceCreamShop);
		public List<IceCreamShop> getIceCreamShopList();
		public void setIceCreamShopList(List<IceCreamShop> iceCreamShopList);
		public boolean hasIceCreamShop();

		/**
		 * @see <a href="http://schema.org/InsuranceAgency">http://schema.org/InsuranceAgency</a>
		 */
		public InsuranceAgency getInsuranceAgency();
		public void setInsuranceAgency(InsuranceAgency insuranceAgency);
		public List<InsuranceAgency> getInsuranceAgencyList();
		public void setInsuranceAgencyList(List<InsuranceAgency> insuranceAgencyList);
		public boolean hasInsuranceAgency();

		/**
		 * @see <a href="http://schema.org/InternetCafe">http://schema.org/InternetCafe</a>
		 */
		public InternetCafe getInternetCafe();
		public void setInternetCafe(InternetCafe internetCafe);
		public List<InternetCafe> getInternetCafeList();
		public void setInternetCafeList(List<InternetCafe> internetCafeList);
		public boolean hasInternetCafe();

		/**
		 * @see <a href="http://schema.org/JewelryStore">http://schema.org/JewelryStore</a>
		 */
		public JewelryStore getJewelryStore();
		public void setJewelryStore(JewelryStore jewelryStore);
		public List<JewelryStore> getJewelryStoreList();
		public void setJewelryStoreList(List<JewelryStore> jewelryStoreList);
		public boolean hasJewelryStore();

		/**
		 * @see <a href="http://schema.org/LegalService">http://schema.org/LegalService</a>
		 */
		public LegalService getLegalService();
		public void setLegalService(LegalService legalService);
		public List<LegalService> getLegalServiceList();
		public void setLegalServiceList(List<LegalService> legalServiceList);
		public boolean hasLegalService();

		/**
		 * @see <a href="http://schema.org/Library">http://schema.org/Library</a>
		 */
		public Library getLibrary();
		public void setLibrary(Library library);
		public List<Library> getLibraryList();
		public void setLibraryList(List<Library> libraryList);
		public boolean hasLibrary();

		/**
		 * @see <a href="http://schema.org/LibrarySystem">http://schema.org/LibrarySystem</a>
		 */
		public LibrarySystem getLibrarySystem();
		public void setLibrarySystem(LibrarySystem librarySystem);
		public List<LibrarySystem> getLibrarySystemList();
		public void setLibrarySystemList(List<LibrarySystem> librarySystemList);
		public boolean hasLibrarySystem();

		/**
		 * @see <a href="http://schema.org/LiquorStore">http://schema.org/LiquorStore</a>
		 */
		public LiquorStore getLiquorStore();
		public void setLiquorStore(LiquorStore liquorStore);
		public List<LiquorStore> getLiquorStoreList();
		public void setLiquorStoreList(List<LiquorStore> liquorStoreList);
		public boolean hasLiquorStore();

		/**
		 * @see <a href="http://schema.org/LocalBusiness">http://schema.org/LocalBusiness</a>
		 */
		public LocalBusiness getLocalBusiness();
		public void setLocalBusiness(LocalBusiness localBusiness);
		public List<LocalBusiness> getLocalBusinessList();
		public void setLocalBusinessList(List<LocalBusiness> localBusinessList);
		public boolean hasLocalBusiness();

		/**
		 * @see <a href="http://schema.org/Locksmith">http://schema.org/Locksmith</a>
		 */
		public Locksmith getLocksmith();
		public void setLocksmith(Locksmith locksmith);
		public List<Locksmith> getLocksmithList();
		public void setLocksmithList(List<Locksmith> locksmithList);
		public boolean hasLocksmith();

		/**
		 * @see <a href="http://schema.org/LodgingBusiness">http://schema.org/LodgingBusiness</a>
		 */
		public LodgingBusiness getLodgingBusiness();
		public void setLodgingBusiness(LodgingBusiness lodgingBusiness);
		public List<LodgingBusiness> getLodgingBusinessList();
		public void setLodgingBusinessList(List<LodgingBusiness> lodgingBusinessList);
		public boolean hasLodgingBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalBusiness">http://schema.org/MedicalBusiness</a>
		 */
		public Clazz.MedicalBusiness getMedicalBusiness();
		public void setMedicalBusiness(Clazz.MedicalBusiness medicalBusiness);
		public List<Clazz.MedicalBusiness> getMedicalBusinessList();
		public void setMedicalBusinessList(List<Clazz.MedicalBusiness> medicalBusinessList);
		public boolean hasMedicalBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalClinic">http://schema.org/MedicalClinic</a>
		 */
		public Clazz.MedicalClinic getMedicalClinic();
		public void setMedicalClinic(Clazz.MedicalClinic medicalClinic);
		public List<Clazz.MedicalClinic> getMedicalClinicList();
		public void setMedicalClinicList(List<Clazz.MedicalClinic> medicalClinicList);
		public boolean hasMedicalClinic();

		/**
		 * @see <a href="http://schema.org/MedicalOrganization">http://schema.org/MedicalOrganization</a>
		 */
		public MedicalOrganization getMedicalOrganization();
		public void setMedicalOrganization(MedicalOrganization medicalOrganization);
		public List<MedicalOrganization> getMedicalOrganizationList();
		public void setMedicalOrganizationList(List<MedicalOrganization> medicalOrganizationList);
		public boolean hasMedicalOrganization();

		/**
		 * @see <a href="http://schema.org/MensClothingStore">http://schema.org/MensClothingStore</a>
		 */
		public MensClothingStore getMensClothingStore();
		public void setMensClothingStore(MensClothingStore mensClothingStore);
		public List<MensClothingStore> getMensClothingStoreList();
		public void setMensClothingStoreList(List<MensClothingStore> mensClothingStoreList);
		public boolean hasMensClothingStore();

		/**
		 * @see <a href="http://schema.org/MiddleSchool">http://schema.org/MiddleSchool</a>
		 */
		public MiddleSchool getMiddleSchool();
		public void setMiddleSchool(MiddleSchool middleSchool);
		public List<MiddleSchool> getMiddleSchoolList();
		public void setMiddleSchoolList(List<MiddleSchool> middleSchoolList);
		public boolean hasMiddleSchool();

		/**
		 * @see <a href="http://schema.org/Midwifery">http://schema.org/Midwifery</a>
		 */
		public Midwifery getMidwifery();
		public void setMidwifery(Midwifery midwifery);
		public List<Midwifery> getMidwiferyList();
		public void setMidwiferyList(List<Midwifery> midwiferyList);
		public boolean hasMidwifery();

		/**
		 * @see <a href="http://schema.org/MobilePhoneStore">http://schema.org/MobilePhoneStore</a>
		 */
		public MobilePhoneStore getMobilePhoneStore();
		public void setMobilePhoneStore(MobilePhoneStore mobilePhoneStore);
		public List<MobilePhoneStore> getMobilePhoneStoreList();
		public void setMobilePhoneStoreList(List<MobilePhoneStore> mobilePhoneStoreList);
		public boolean hasMobilePhoneStore();

		/**
		 * @see <a href="http://schema.org/Motel">http://schema.org/Motel</a>
		 */
		public Motel getMotel();
		public void setMotel(Motel motel);
		public List<Motel> getMotelList();
		public void setMotelList(List<Motel> motelList);
		public boolean hasMotel();

		/**
		 * @see <a href="http://schema.org/MotorcycleDealer">http://schema.org/MotorcycleDealer</a>
		 */
		public MotorcycleDealer getMotorcycleDealer();
		public void setMotorcycleDealer(MotorcycleDealer motorcycleDealer);
		public List<MotorcycleDealer> getMotorcycleDealerList();
		public void setMotorcycleDealerList(List<MotorcycleDealer> motorcycleDealerList);
		public boolean hasMotorcycleDealer();

		/**
		 * @see <a href="http://schema.org/MotorcycleRepair">http://schema.org/MotorcycleRepair</a>
		 */
		public MotorcycleRepair getMotorcycleRepair();
		public void setMotorcycleRepair(MotorcycleRepair motorcycleRepair);
		public List<MotorcycleRepair> getMotorcycleRepairList();
		public void setMotorcycleRepairList(List<MotorcycleRepair> motorcycleRepairList);
		public boolean hasMotorcycleRepair();

		/**
		 * @see <a href="http://schema.org/MovieRentalStore">http://schema.org/MovieRentalStore</a>
		 */
		public MovieRentalStore getMovieRentalStore();
		public void setMovieRentalStore(MovieRentalStore movieRentalStore);
		public List<MovieRentalStore> getMovieRentalStoreList();
		public void setMovieRentalStoreList(List<MovieRentalStore> movieRentalStoreList);
		public boolean hasMovieRentalStore();

		/**
		 * @see <a href="http://schema.org/MovieTheater">http://schema.org/MovieTheater</a>
		 */
		public MovieTheater getMovieTheater();
		public void setMovieTheater(MovieTheater movieTheater);
		public List<MovieTheater> getMovieTheaterList();
		public void setMovieTheaterList(List<MovieTheater> movieTheaterList);
		public boolean hasMovieTheater();

		/**
		 * @see <a href="http://schema.org/MovingCompany">http://schema.org/MovingCompany</a>
		 */
		public MovingCompany getMovingCompany();
		public void setMovingCompany(MovingCompany movingCompany);
		public List<MovingCompany> getMovingCompanyList();
		public void setMovingCompanyList(List<MovingCompany> movingCompanyList);
		public boolean hasMovingCompany();

		/**
		 * @see <a href="http://schema.org/MusicGroup">http://schema.org/MusicGroup</a>
		 */
		public MusicGroup getMusicGroup();
		public void setMusicGroup(MusicGroup musicGroup);
		public List<MusicGroup> getMusicGroupList();
		public void setMusicGroupList(List<MusicGroup> musicGroupList);
		public boolean hasMusicGroup();

		/**
		 * @see <a href="http://schema.org/MusicStore">http://schema.org/MusicStore</a>
		 */
		public MusicStore getMusicStore();
		public void setMusicStore(MusicStore musicStore);
		public List<MusicStore> getMusicStoreList();
		public void setMusicStoreList(List<MusicStore> musicStoreList);
		public boolean hasMusicStore();

		/**
		 * @see <a href="http://schema.org/NGO">http://schema.org/NGO</a>
		 */
		public NGO getNGO();
		public void setNGO(NGO ngo);
		public List<NGO> getNGOList();
		public void setNGOList(List<NGO> ngoList);
		public boolean hasNGO();

		/**
		 * @see <a href="http://schema.org/NailSalon">http://schema.org/NailSalon</a>
		 */
		public NailSalon getNailSalon();
		public void setNailSalon(NailSalon nailSalon);
		public List<NailSalon> getNailSalonList();
		public void setNailSalonList(List<NailSalon> nailSalonList);
		public boolean hasNailSalon();

		/**
		 * @see <a href="http://schema.org/NewsMediaOrganization">http://schema.org/NewsMediaOrganization</a>
		 */
		public NewsMediaOrganization getNewsMediaOrganization();
		public void setNewsMediaOrganization(NewsMediaOrganization newsMediaOrganization);
		public List<NewsMediaOrganization> getNewsMediaOrganizationList();
		public void setNewsMediaOrganizationList(List<NewsMediaOrganization> newsMediaOrganizationList);
		public boolean hasNewsMediaOrganization();

		/**
		 * @see <a href="http://schema.org/NightClub">http://schema.org/NightClub</a>
		 */
		public NightClub getNightClub();
		public void setNightClub(NightClub nightClub);
		public List<NightClub> getNightClubList();
		public void setNightClubList(List<NightClub> nightClubList);
		public boolean hasNightClub();

		/**
		 * @see <a href="http://schema.org/Notary">http://schema.org/Notary</a>
		 */
		public Notary getNotary();
		public void setNotary(Notary notary);
		public List<Notary> getNotaryList();
		public void setNotaryList(List<Notary> notaryList);
		public boolean hasNotary();

		/**
		 * @see <a href="http://schema.org/Nursing">http://schema.org/Nursing</a>
		 */
		public Nursing getNursing();
		public void setNursing(Nursing nursing);
		public List<Nursing> getNursingList();
		public void setNursingList(List<Nursing> nursingList);
		public boolean hasNursing();

		/**
		 * @see <a href="http://schema.org/Obstetric">http://schema.org/Obstetric</a>
		 */
		public Obstetric getObstetric();
		public void setObstetric(Obstetric obstetric);
		public List<Obstetric> getObstetricList();
		public void setObstetricList(List<Obstetric> obstetricList);
		public boolean hasObstetric();

		/**
		 * @see <a href="http://schema.org/OfficeEquipmentStore">http://schema.org/OfficeEquipmentStore</a>
		 */
		public OfficeEquipmentStore getOfficeEquipmentStore();
		public void setOfficeEquipmentStore(OfficeEquipmentStore officeEquipmentStore);
		public List<OfficeEquipmentStore> getOfficeEquipmentStoreList();
		public void setOfficeEquipmentStoreList(List<OfficeEquipmentStore> officeEquipmentStoreList);
		public boolean hasOfficeEquipmentStore();

		/**
		 * @see <a href="http://schema.org/Oncologic">http://schema.org/Oncologic</a>
		 */
		public Oncologic getOncologic();
		public void setOncologic(Oncologic oncologic);
		public List<Oncologic> getOncologicList();
		public void setOncologicList(List<Oncologic> oncologicList);
		public boolean hasOncologic();

		/**
		 * @see <a href="http://schema.org/Optician">http://schema.org/Optician</a>
		 */
		public Clazz.Optician getOptician();
		public void setOptician(Clazz.Optician optician);
		public List<Clazz.Optician> getOpticianList();
		public void setOpticianList(List<Clazz.Optician> opticianList);
		public boolean hasOptician();

		/**
		 * @see <a href="http://schema.org/Optometric">http://schema.org/Optometric</a>
		 */
		public Optometric getOptometric();
		public void setOptometric(Optometric optometric);
		public List<Optometric> getOptometricList();
		public void setOptometricList(List<Optometric> optometricList);
		public boolean hasOptometric();

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Otolaryngologic">http://schema.org/Otolaryngologic</a>
		 */
		public Otolaryngologic getOtolaryngologic();
		public void setOtolaryngologic(Otolaryngologic otolaryngologic);
		public List<Otolaryngologic> getOtolaryngologicList();
		public void setOtolaryngologicList(List<Otolaryngologic> otolaryngologicList);
		public boolean hasOtolaryngologic();

		/**
		 * @see <a href="http://schema.org/OutletStore">http://schema.org/OutletStore</a>
		 */
		public OutletStore getOutletStore();
		public void setOutletStore(OutletStore outletStore);
		public List<OutletStore> getOutletStoreList();
		public void setOutletStoreList(List<OutletStore> outletStoreList);
		public boolean hasOutletStore();

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Clazz.Patient getPatient();
		public void setPatient(Clazz.Patient patient);
		public List<Clazz.Patient> getPatientList();
		public void setPatientList(List<Clazz.Patient> patientList);
		public boolean hasPatient();

		/**
		 * @see <a href="http://schema.org/PawnShop">http://schema.org/PawnShop</a>
		 */
		public PawnShop getPawnShop();
		public void setPawnShop(PawnShop pawnShop);
		public List<PawnShop> getPawnShopList();
		public void setPawnShopList(List<PawnShop> pawnShopList);
		public boolean hasPawnShop();

		/**
		 * @see <a href="http://schema.org/Pediatric">http://schema.org/Pediatric</a>
		 */
		public Pediatric getPediatric();
		public void setPediatric(Pediatric pediatric);
		public List<Pediatric> getPediatricList();
		public void setPediatricList(List<Pediatric> pediatricList);
		public boolean hasPediatric();

		/**
		 * @see <a href="http://schema.org/PerformingGroup">http://schema.org/PerformingGroup</a>
		 */
		public PerformingGroup getPerformingGroup();
		public void setPerformingGroup(PerformingGroup performingGroup);
		public List<PerformingGroup> getPerformingGroupList();
		public void setPerformingGroupList(List<PerformingGroup> performingGroupList);
		public boolean hasPerformingGroup();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		/**
		 * @see <a href="http://schema.org/PetStore">http://schema.org/PetStore</a>
		 */
		public PetStore getPetStore();
		public void setPetStore(PetStore petStore);
		public List<PetStore> getPetStoreList();
		public void setPetStoreList(List<PetStore> petStoreList);
		public boolean hasPetStore();

		/**
		 * @see <a href="http://schema.org/Pharmacy">http://schema.org/Pharmacy</a>
		 */
		public Pharmacy getPharmacy();
		public void setPharmacy(Pharmacy pharmacy);
		public List<Pharmacy> getPharmacyList();
		public void setPharmacyList(List<Pharmacy> pharmacyList);
		public boolean hasPharmacy();

		/**
		 * @see <a href="http://schema.org/Physician">http://schema.org/Physician</a>
		 */
		public Physician getPhysician();
		public void setPhysician(Physician physician);
		public List<Physician> getPhysicianList();
		public void setPhysicianList(List<Physician> physicianList);
		public boolean hasPhysician();

		/**
		 * @see <a href="http://schema.org/Physiotherapy">http://schema.org/Physiotherapy</a>
		 */
		public Physiotherapy getPhysiotherapy();
		public void setPhysiotherapy(Physiotherapy physiotherapy);
		public List<Physiotherapy> getPhysiotherapyList();
		public void setPhysiotherapyList(List<Physiotherapy> physiotherapyList);
		public boolean hasPhysiotherapy();

		/**
		 * @see <a href="http://schema.org/PlasticSurgery">http://schema.org/PlasticSurgery</a>
		 */
		public PlasticSurgery getPlasticSurgery();
		public void setPlasticSurgery(PlasticSurgery plasticSurgery);
		public List<PlasticSurgery> getPlasticSurgeryList();
		public void setPlasticSurgeryList(List<PlasticSurgery> plasticSurgeryList);
		public boolean hasPlasticSurgery();

		/**
		 * @see <a href="http://schema.org/Plumber">http://schema.org/Plumber</a>
		 */
		public Plumber getPlumber();
		public void setPlumber(Plumber plumber);
		public List<Plumber> getPlumberList();
		public void setPlumberList(List<Plumber> plumberList);
		public boolean hasPlumber();

		/**
		 * @see <a href="http://schema.org/Podiatric">http://schema.org/Podiatric</a>
		 */
		public Podiatric getPodiatric();
		public void setPodiatric(Podiatric podiatric);
		public List<Podiatric> getPodiatricList();
		public void setPodiatricList(List<Podiatric> podiatricList);
		public boolean hasPodiatric();

		/**
		 * @see <a href="http://schema.org/PoliceStation">http://schema.org/PoliceStation</a>
		 */
		public PoliceStation getPoliceStation();
		public void setPoliceStation(PoliceStation policeStation);
		public List<PoliceStation> getPoliceStationList();
		public void setPoliceStationList(List<PoliceStation> policeStationList);
		public boolean hasPoliceStation();

		/**
		 * @see <a href="http://schema.org/PostOffice">http://schema.org/PostOffice</a>
		 */
		public PostOffice getPostOffice();
		public void setPostOffice(PostOffice postOffice);
		public List<PostOffice> getPostOfficeList();
		public void setPostOfficeList(List<PostOffice> postOfficeList);
		public boolean hasPostOffice();

		/**
		 * @see <a href="http://schema.org/Preschool">http://schema.org/Preschool</a>
		 */
		public Preschool getPreschool();
		public void setPreschool(Preschool preschool);
		public List<Preschool> getPreschoolList();
		public void setPreschoolList(List<Preschool> preschoolList);
		public boolean hasPreschool();

		/**
		 * @see <a href="http://schema.org/PrimaryCare">http://schema.org/PrimaryCare</a>
		 */
		public PrimaryCare getPrimaryCare();
		public void setPrimaryCare(PrimaryCare primaryCare);
		public List<PrimaryCare> getPrimaryCareList();
		public void setPrimaryCareList(List<PrimaryCare> primaryCareList);
		public boolean hasPrimaryCare();

		/**
		 * @see <a href="http://schema.org/ProfessionalService">http://schema.org/ProfessionalService</a>
		 */
		public ProfessionalService getProfessionalService();
		public void setProfessionalService(ProfessionalService professionalService);
		public List<ProfessionalService> getProfessionalServiceList();
		public void setProfessionalServiceList(List<ProfessionalService> professionalServiceList);
		public boolean hasProfessionalService();

		/**
		 * @see <a href="http://schema.org/Psychiatric">http://schema.org/Psychiatric</a>
		 */
		public Psychiatric getPsychiatric();
		public void setPsychiatric(Psychiatric psychiatric);
		public List<Psychiatric> getPsychiatricList();
		public void setPsychiatricList(List<Psychiatric> psychiatricList);
		public boolean hasPsychiatric();

		/**
		 * @see <a href="http://schema.org/PublicHealth">http://schema.org/PublicHealth</a>
		 */
		public PublicHealth getPublicHealth();
		public void setPublicHealth(PublicHealth publicHealth);
		public List<PublicHealth> getPublicHealthList();
		public void setPublicHealthList(List<PublicHealth> publicHealthList);
		public boolean hasPublicHealth();

		/**
		 * @see <a href="http://schema.org/PublicSwimmingPool">http://schema.org/PublicSwimmingPool</a>
		 */
		public PublicSwimmingPool getPublicSwimmingPool();
		public void setPublicSwimmingPool(PublicSwimmingPool publicSwimmingPool);
		public List<PublicSwimmingPool> getPublicSwimmingPoolList();
		public void setPublicSwimmingPoolList(List<PublicSwimmingPool> publicSwimmingPoolList);
		public boolean hasPublicSwimmingPool();

		/**
		 * @see <a href="http://schema.org/RadioStation">http://schema.org/RadioStation</a>
		 */
		public RadioStation getRadioStation();
		public void setRadioStation(RadioStation radioStation);
		public List<RadioStation> getRadioStationList();
		public void setRadioStationList(List<RadioStation> radioStationList);
		public boolean hasRadioStation();

		/**
		 * @see <a href="http://schema.org/RealEstateAgent">http://schema.org/RealEstateAgent</a>
		 */
		public RealEstateAgent getRealEstateAgent();
		public void setRealEstateAgent(RealEstateAgent realEstateAgent);
		public List<RealEstateAgent> getRealEstateAgentList();
		public void setRealEstateAgentList(List<RealEstateAgent> realEstateAgentList);
		public boolean hasRealEstateAgent();

		/**
		 * @see <a href="http://schema.org/RecyclingCenter">http://schema.org/RecyclingCenter</a>
		 */
		public RecyclingCenter getRecyclingCenter();
		public void setRecyclingCenter(RecyclingCenter recyclingCenter);
		public List<RecyclingCenter> getRecyclingCenterList();
		public void setRecyclingCenterList(List<RecyclingCenter> recyclingCenterList);
		public boolean hasRecyclingCenter();

		/**
		 * @see <a href="http://schema.org/Resort">http://schema.org/Resort</a>
		 */
		public Resort getResort();
		public void setResort(Resort resort);
		public List<Resort> getResortList();
		public void setResortList(List<Resort> resortList);
		public boolean hasResort();

		/**
		 * @see <a href="http://schema.org/Restaurant">http://schema.org/Restaurant</a>
		 */
		public Restaurant getRestaurant();
		public void setRestaurant(Restaurant restaurant);
		public List<Restaurant> getRestaurantList();
		public void setRestaurantList(List<Restaurant> restaurantList);
		public boolean hasRestaurant();

		/**
		 * @see <a href="http://schema.org/RoofingContractor">http://schema.org/RoofingContractor</a>
		 */
		public RoofingContractor getRoofingContractor();
		public void setRoofingContractor(RoofingContractor roofingContractor);
		public List<RoofingContractor> getRoofingContractorList();
		public void setRoofingContractorList(List<RoofingContractor> roofingContractorList);
		public boolean hasRoofingContractor();

		/**
		 * @see <a href="http://schema.org/School">http://schema.org/School</a>
		 */
		public School getSchool();
		public void setSchool(School school);
		public List<School> getSchoolList();
		public void setSchoolList(List<School> schoolList);
		public boolean hasSchool();

		/**
		 * @see <a href="http://schema.org/SelfStorage">http://schema.org/SelfStorage</a>
		 */
		public SelfStorage getSelfStorage();
		public void setSelfStorage(SelfStorage selfStorage);
		public List<SelfStorage> getSelfStorageList();
		public void setSelfStorageList(List<SelfStorage> selfStorageList);
		public boolean hasSelfStorage();

		/**
		 * @see <a href="http://schema.org/ShoeStore">http://schema.org/ShoeStore</a>
		 */
		public ShoeStore getShoeStore();
		public void setShoeStore(ShoeStore shoeStore);
		public List<ShoeStore> getShoeStoreList();
		public void setShoeStoreList(List<ShoeStore> shoeStoreList);
		public boolean hasShoeStore();

		/**
		 * @see <a href="http://schema.org/ShoppingCenter">http://schema.org/ShoppingCenter</a>
		 */
		public ShoppingCenter getShoppingCenter();
		public void setShoppingCenter(ShoppingCenter shoppingCenter);
		public List<ShoppingCenter> getShoppingCenterList();
		public void setShoppingCenterList(List<ShoppingCenter> shoppingCenterList);
		public boolean hasShoppingCenter();

		/**
		 * @see <a href="http://schema.org/SkiResort">http://schema.org/SkiResort</a>
		 */
		public SkiResort getSkiResort();
		public void setSkiResort(SkiResort skiResort);
		public List<SkiResort> getSkiResortList();
		public void setSkiResortList(List<SkiResort> skiResortList);
		public boolean hasSkiResort();

		/**
		 * @see <a href="http://schema.org/SportingGoodsStore">http://schema.org/SportingGoodsStore</a>
		 */
		public SportingGoodsStore getSportingGoodsStore();
		public void setSportingGoodsStore(SportingGoodsStore sportingGoodsStore);
		public List<SportingGoodsStore> getSportingGoodsStoreList();
		public void setSportingGoodsStoreList(List<SportingGoodsStore> sportingGoodsStoreList);
		public boolean hasSportingGoodsStore();

		/**
		 * @see <a href="http://schema.org/SportsActivityLocation">http://schema.org/SportsActivityLocation</a>
		 */
		public SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation);
		public List<SportsActivityLocation> getSportsActivityLocationList();
		public void setSportsActivityLocationList(List<SportsActivityLocation> sportsActivityLocationList);
		public boolean hasSportsActivityLocation();

		/**
		 * @see <a href="http://schema.org/SportsClub">http://schema.org/SportsClub</a>
		 */
		public SportsClub getSportsClub();
		public void setSportsClub(SportsClub sportsClub);
		public List<SportsClub> getSportsClubList();
		public void setSportsClubList(List<SportsClub> sportsClubList);
		public boolean hasSportsClub();

		/**
		 * @see <a href="http://schema.org/SportsOrganization">http://schema.org/SportsOrganization</a>
		 */
		public SportsOrganization getSportsOrganization();
		public void setSportsOrganization(SportsOrganization sportsOrganization);
		public List<SportsOrganization> getSportsOrganizationList();
		public void setSportsOrganizationList(List<SportsOrganization> sportsOrganizationList);
		public boolean hasSportsOrganization();

		/**
		 * @see <a href="http://schema.org/SportsTeam">http://schema.org/SportsTeam</a>
		 */
		public SportsTeam getSportsTeam();
		public void setSportsTeam(SportsTeam sportsTeam);
		public List<SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		/**
		 * @see <a href="http://schema.org/StadiumOrArena">http://schema.org/StadiumOrArena</a>
		 */
		public StadiumOrArena getStadiumOrArena();
		public void setStadiumOrArena(StadiumOrArena stadiumOrArena);
		public List<StadiumOrArena> getStadiumOrArenaList();
		public void setStadiumOrArenaList(List<StadiumOrArena> stadiumOrArenaList);
		public boolean hasStadiumOrArena();

		/**
		 * @see <a href="http://schema.org/Store">http://schema.org/Store</a>
		 */
		public Store getStore();
		public void setStore(Store store);
		public List<Store> getStoreList();
		public void setStoreList(List<Store> storeList);
		public boolean hasStore();

		/**
		 * @see <a href="http://schema.org/TattooParlor">http://schema.org/TattooParlor</a>
		 */
		public TattooParlor getTattooParlor();
		public void setTattooParlor(TattooParlor tattooParlor);
		public List<TattooParlor> getTattooParlorList();
		public void setTattooParlorList(List<TattooParlor> tattooParlorList);
		public boolean hasTattooParlor();

		/**
		 * @see <a href="http://schema.org/TelevisionStation">http://schema.org/TelevisionStation</a>
		 */
		public TelevisionStation getTelevisionStation();
		public void setTelevisionStation(TelevisionStation televisionStation);
		public List<TelevisionStation> getTelevisionStationList();
		public void setTelevisionStationList(List<TelevisionStation> televisionStationList);
		public boolean hasTelevisionStation();

		/**
		 * @see <a href="http://schema.org/TennisComplex">http://schema.org/TennisComplex</a>
		 */
		public TennisComplex getTennisComplex();
		public void setTennisComplex(TennisComplex tennisComplex);
		public List<TennisComplex> getTennisComplexList();
		public void setTennisComplexList(List<TennisComplex> tennisComplexList);
		public boolean hasTennisComplex();

		/**
		 * @see <a href="http://schema.org/TheaterGroup">http://schema.org/TheaterGroup</a>
		 */
		public TheaterGroup getTheaterGroup();
		public void setTheaterGroup(TheaterGroup theaterGroup);
		public List<TheaterGroup> getTheaterGroupList();
		public void setTheaterGroupList(List<TheaterGroup> theaterGroupList);
		public boolean hasTheaterGroup();

		/**
		 * @see <a href="http://schema.org/TireShop">http://schema.org/TireShop</a>
		 */
		public TireShop getTireShop();
		public void setTireShop(TireShop tireShop);
		public List<TireShop> getTireShopList();
		public void setTireShopList(List<TireShop> tireShopList);
		public boolean hasTireShop();

		/**
		 * @see <a href="http://schema.org/TouristInformationCenter">http://schema.org/TouristInformationCenter</a>
		 */
		public TouristInformationCenter getTouristInformationCenter();
		public void setTouristInformationCenter(TouristInformationCenter touristInformationCenter);
		public List<TouristInformationCenter> getTouristInformationCenterList();
		public void setTouristInformationCenterList(List<TouristInformationCenter> touristInformationCenterList);
		public boolean hasTouristInformationCenter();

		/**
		 * @see <a href="http://schema.org/ToyStore">http://schema.org/ToyStore</a>
		 */
		public ToyStore getToyStore();
		public void setToyStore(ToyStore toyStore);
		public List<ToyStore> getToyStoreList();
		public void setToyStoreList(List<ToyStore> toyStoreList);
		public boolean hasToyStore();

		/**
		 * @see <a href="http://schema.org/TravelAgency">http://schema.org/TravelAgency</a>
		 */
		public TravelAgency getTravelAgency();
		public void setTravelAgency(TravelAgency travelAgency);
		public List<TravelAgency> getTravelAgencyList();
		public void setTravelAgencyList(List<TravelAgency> travelAgencyList);
		public boolean hasTravelAgency();

		/**
		 * @see <a href="http://schema.org/VeterinaryCare">http://schema.org/VeterinaryCare</a>
		 */
		public Clazz.VeterinaryCare getVeterinaryCare();
		public void setVeterinaryCare(Clazz.VeterinaryCare veterinaryCare);
		public List<Clazz.VeterinaryCare> getVeterinaryCareList();
		public void setVeterinaryCareList(List<Clazz.VeterinaryCare> veterinaryCareList);
		public boolean hasVeterinaryCare();

		/**
		 * @see <a href="http://schema.org/WholesaleStore">http://schema.org/WholesaleStore</a>
		 */
		public WholesaleStore getWholesaleStore();
		public void setWholesaleStore(WholesaleStore wholesaleStore);
		public List<WholesaleStore> getWholesaleStoreList();
		public void setWholesaleStoreList(List<WholesaleStore> wholesaleStoreList);
		public boolean hasWholesaleStore();

		/**
		 * @see <a href="http://schema.org/Winery">http://schema.org/Winery</a>
		 */
		public Winery getWinery();
		public void setWinery(Winery winery);
		public List<Winery> getWineryList();
		public void setWineryList(List<Winery> wineryList);
		public boolean hasWinery();

		/**
		 * @see <a href="http://schema.org/WorkersUnion">http://schema.org/WorkersUnion</a>
		 */
		public WorkersUnion getWorkersUnion();
		public void setWorkersUnion(WorkersUnion workersUnion);
		public List<WorkersUnion> getWorkersUnionList();
		public void setWorkersUnionList(List<WorkersUnion> workersUnionList);
		public boolean hasWorkersUnion();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/epidemiology")
	@SchemaOrgLabel("epidemiology")
	@SchemaOrgComment(""
			+ "The characteristics of associated patients, such as age, gender, race etc.")
	@CamelizedName("epidemiology")
	@ConstantizedName("EPIDEMIOLOGY")
	public interface Epidemiology extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/estimatesRiskOf")
	@SchemaOrgLabel("estimatesRiskOf")
	@SchemaOrgComment(""
			+ "The condition, complication, or symptom whose risk is being estimated.")
	@CamelizedName("estimatesRiskOf")
	@ConstantizedName("ESTIMATES_RISK_OF")
	public interface EstimatesRiskOf extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/evidenceLevel")
	@SchemaOrgLabel("evidenceLevel")
	@SchemaOrgComment(""
			+ "Strength of evidence of the data used to formulate the guideline (enumerated).")
	@CamelizedName("evidenceLevel")
	@ConstantizedName("EVIDENCE_LEVEL")
	public interface EvidenceLevel extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public Clazz.MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(Clazz.MedicalEvidenceLevel medicalEvidenceLevel);
		public List<Clazz.MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<Clazz.MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/evidenceOrigin")
	@SchemaOrgLabel("evidenceOrigin")
	@SchemaOrgComment(""
			+ "Source of the data used to formulate the guidance, e.g. RCT, consensus opinion,"
			+ " etc.")
	@CamelizedName("evidenceOrigin")
	@ConstantizedName("EVIDENCE_ORIGIN")
	public interface EvidenceOrigin extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/exercisePlan")
	@SchemaOrgLabel("exercisePlan")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The exercise plan used on this action.")
	@CamelizedName("exercisePlan")
	@ConstantizedName("EXERCISE_PLAN")
	public interface ExercisePlan extends Instrument, NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exerciseRelatedDiet")
	@SchemaOrgLabel("exerciseRelatedDiet")
	@SchemaOrgComment(""
			+ "A sub property of instrument. The diet used in this action.")
	@CamelizedName("exerciseRelatedDiet")
	@ConstantizedName("EXERCISE_RELATED_DIET")
	public interface ExerciseRelatedDiet extends Instrument, NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/exerciseType")
	@SchemaOrgLabel("exerciseType")
	@SchemaOrgComment(""
			+ "Type(s) of exercise or activity, such as strength training, flexibility"
			+ " training, aerobics, cardiac rehabilitation, etc.")
	@CamelizedName("exerciseType")
	@ConstantizedName("EXERCISE_TYPE")
	public interface ExerciseType extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/expectedPrognosis")
	@SchemaOrgLabel("expectedPrognosis")
	@SchemaOrgComment(""
			+ "The likely outcome in either the short term or long term of the medical"
			+ " condition.")
	@CamelizedName("expectedPrognosis")
	@ConstantizedName("EXPECTED_PROGNOSIS")
	public interface ExpectedPrognosis extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/expertConsiderations")
	@SchemaOrgLabel("expertConsiderations")
	@SchemaOrgComment(""
			+ "Medical expert advice related to the plan.")
	@CamelizedName("expertConsiderations")
	@ConstantizedName("EXPERT_CONSIDERATIONS")
	public interface ExpertConsiderations extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/followup")
	@SchemaOrgLabel("followup")
	@SchemaOrgComment(""
			+ "Typical or recommended followup care after the procedure is performed.")
	@CamelizedName("followup")
	@ConstantizedName("FOLLOWUP")
	public interface Followup extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/foodWarning")
	@SchemaOrgLabel("foodWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to consumption of"
			+ " specific foods while taking this drug.")
	@CamelizedName("foodWarning")
	@ConstantizedName("FOOD_WARNING")
	public interface FoodWarning extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/frequency")
	@SchemaOrgLabel("frequency")
	@SchemaOrgComment(""
			+ "How often the dose is taken, e.g. 'daily'.")
	@CamelizedName("frequency")
	@ConstantizedName("FREQUENCY")
	public interface Frequency extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/function")
	@SchemaOrgLabel("function")
	@SchemaOrgComment("Function of the anatomical structure.")
	@CamelizedName("function")
	@ConstantizedName("FUNCTION")
	public interface Function extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/functionalClass")
	@SchemaOrgLabel("functionalClass")
	@SchemaOrgComment(""
			+ "The degree of mobility the joint allows.")
	@CamelizedName("functionalClass")
	@ConstantizedName("FUNCTIONAL_CLASS")
	public interface FunctionalClass extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/guideline")
	@SchemaOrgLabel("guideline")
	@SchemaOrgComment(""
			+ "A medical guideline related to this entity.")
	@CamelizedName("guideline")
	@ConstantizedName("GUIDELINE")
	public interface Guideline extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/guidelineDate")
	@SchemaOrgLabel("guidelineDate")
	@SchemaOrgComment(""
			+ "Date on which this guideline's recommendation was made.")
	@CamelizedName("guidelineDate")
	@ConstantizedName("GUIDELINE_DATE")
	public interface GuidelineDate extends NativeValueDate, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/guidelineSubject")
	@SchemaOrgLabel("guidelineSubject")
	@SchemaOrgComment(""
			+ "The medical conditions, treatments, etc. that are the subject of the guideline.")
	@CamelizedName("guidelineSubject")
	@ConstantizedName("GUIDELINE_SUBJECT")
	public interface GuidelineSubject extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/healthCondition")
	@SchemaOrgLabel("healthCondition")
	@SchemaOrgComment(""
			+ "Specifying the health condition(s) of a patient, medical study, or other target"
			+ " audience.")
	@CamelizedName("healthCondition")
	@ConstantizedName("HEALTH_CONDITION")
	public interface HealthCondition extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/hospitalAffiliation")
	@SchemaOrgLabel("hospitalAffiliation")
	@SchemaOrgComment(""
			+ "A hospital with which the physician or office is affiliated.")
	@CamelizedName("hospitalAffiliation")
	@ConstantizedName("HOSPITAL_AFFILIATION")
	public interface HospitalAffiliation extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Hospital">http://schema.org/Hospital</a>
		 */
		public Hospital getHospital();
		public void setHospital(Hospital hospital);
		public List<Hospital> getHospitalList();
		public void setHospitalList(List<Hospital> hospitalList);
		public boolean hasHospital();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/howPerformed")
	@SchemaOrgLabel("howPerformed")
	@SchemaOrgComment("How the procedure is performed.")
	@CamelizedName("howPerformed")
	@ConstantizedName("HOW_PERFORMED")
	public interface HowPerformed extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/identifyingExam")
	@SchemaOrgLabel("identifyingExam")
	@SchemaOrgComment(""
			+ "A physical examination that can identify this sign.")
	@CamelizedName("identifyingExam")
	@ConstantizedName("IDENTIFYING_EXAM")
	public interface IdentifyingExam extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/identifyingTest")
	@SchemaOrgLabel("identifyingTest")
	@SchemaOrgComment(""
			+ "A diagnostic test that can identify this sign.")
	@CamelizedName("identifyingTest")
	@ConstantizedName("IDENTIFYING_TEST")
	public interface IdentifyingTest extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/imagingTechnique")
	@SchemaOrgLabel("imagingTechnique")
	@SchemaOrgComment("Imaging technique used.")
	@CamelizedName("imagingTechnique")
	@ConstantizedName("IMAGING_TECHNIQUE")
	public interface ImagingTechnique extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public Clazz.MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(Clazz.MedicalImagingTechnique medicalImagingTechnique);
		public List<Clazz.MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<Clazz.MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/includedRiskFactor")
	@SchemaOrgLabel("includedRiskFactor")
	@SchemaOrgComment(""
			+ "A modifiable or non-modifiable risk factor included in the calculation, e.g."
			+ " age, coexisting condition.")
	@CamelizedName("includedRiskFactor")
	@ConstantizedName("INCLUDED_RISK_FACTOR")
	public interface IncludedRiskFactor extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/increasesRiskOf")
	@SchemaOrgLabel("increasesRiskOf")
	@SchemaOrgComment(""
			+ "The condition, complication, etc. influenced by this factor.")
	@CamelizedName("increasesRiskOf")
	@ConstantizedName("INCREASES_RISK_OF")
	public interface IncreasesRiskOf extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/indication")
	@SchemaOrgLabel("indication")
	@SchemaOrgComment(""
			+ "A factor that indicates use of this therapy for treatment and/or prevention of a"
			+ " condition, symptom, etc. For therapies such as drugs, indications can include"
			+ " both officially-approved indications as well as off-label uses. These can be"
			+ " distinguished by using the ApprovedIndication subtype of MedicalIndication.")
	@CamelizedName("indication")
	@ConstantizedName("INDICATION")
	public interface Indication extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/infectiousAgent")
	@SchemaOrgLabel("infectiousAgent")
	@SchemaOrgComment(""
			+ "The actual infectious agent, such as a specific bacterium.")
	@CamelizedName("infectiousAgent")
	@ConstantizedName("INFECTIOUS_AGENT")
	public interface InfectiousAgent extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/infectiousAgentClass")
	@SchemaOrgLabel("infectiousAgentClass")
	@SchemaOrgComment(""
			+ "The class of infectious agent (bacteria, prion, etc.) that causes the disease.")
	@CamelizedName("infectiousAgentClass")
	@ConstantizedName("INFECTIOUS_AGENT_CLASS")
	public interface InfectiousAgentClass extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public Clazz.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Clazz.InfectiousAgentClass infectiousAgentClass);
		public List<Clazz.InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<Clazz.InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/insertion")
	@SchemaOrgLabel("insertion")
	@SchemaOrgComment(""
			+ "The place of attachment of a muscle, or what the muscle moves.")
	@CamelizedName("insertion")
	@ConstantizedName("INSERTION")
	public interface Insertion extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/intensity")
	@SchemaOrgLabel("intensity")
	@SchemaOrgComment(""
			+ "Quantitative measure gauging the degree of force involved in the exercise, for"
			+ " example, heartbeats per minute. May include the velocity of the movement.")
	@CamelizedName("intensity")
	@ConstantizedName("INTENSITY")
	public interface Intensity extends NativeValueText, SchemaOrgProperty {

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/interactingDrug")
	@SchemaOrgLabel("interactingDrug")
	@SchemaOrgComment(""
			+ "Another drug that is known to interact with this drug in a way that impacts the"
			+ " effect of this drug or causes a risk to the patient. Note: disease interactions"
			+ " are typically captured as contraindications.")
	@CamelizedName("interactingDrug")
	@ConstantizedName("INTERACTING_DRUG")
	public interface InteractingDrug extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/isAvailableGenerically")
	@SchemaOrgLabel("isAvailableGenerically")
	@SchemaOrgComment(""
			+ "True if the drug is available in a generic form (regardless of name).")
	@CamelizedName("isAvailableGenerically")
	@ConstantizedName("IS_AVAILABLE_GENERICALLY")
	public interface IsAvailableGenerically extends NativeValueBoolean, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/isProprietary")
	@SchemaOrgLabel("isProprietary")
	@SchemaOrgComment(""
			+ "True if this item's name is a proprietary/brand name (vs. generic name).")
	@CamelizedName("isProprietary")
	@ConstantizedName("IS_PROPRIETARY")
	public interface IsProprietary extends NativeValueBoolean, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/labelDetails")
	@SchemaOrgLabel("labelDetails")
	@SchemaOrgComment("Link to the drug's label details.")
	@CamelizedName("labelDetails")
	@ConstantizedName("LABEL_DETAILS")
	public interface LabelDetails extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/legalStatus")
	@SchemaOrgLabel("legalStatus")
	@SchemaOrgComment(""
			+ "The drug or supplement's legal status, including any controlled substance"
			+ " schedules that apply.")
	@CamelizedName("legalStatus")
	@ConstantizedName("LEGAL_STATUS")
	public interface LegalStatus extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public Clazz.DrugClass getDrugClass();
		public void setDrugClass(Clazz.DrugClass drugClass);
		public List<Clazz.DrugClass> getDrugClassList();
		public void setDrugClassList(List<Clazz.DrugClass> drugClassList);
		public boolean hasDrugClass();

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public Clazz.DrugCost getDrugCost();
		public void setDrugCost(Clazz.DrugCost drugCost);
		public List<Clazz.DrugCost> getDrugCostList();
		public void setDrugCostList(List<Clazz.DrugCost> drugCostList);
		public boolean hasDrugCost();

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public Clazz.DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(Clazz.DrugCostCategory drugCostCategory);
		public List<Clazz.DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<Clazz.DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public Clazz.DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(Clazz.DrugPregnancyCategory drugPregnancyCategory);
		public List<Clazz.DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<Clazz.DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public Clazz.DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(Clazz.DrugPrescriptionStatus drugPrescriptionStatus);
		public List<Clazz.DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<Clazz.DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public Clazz.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Clazz.InfectiousAgentClass infectiousAgentClass);
		public List<Clazz.InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<Clazz.InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		/**
		 * @see <a href="http://schema.org/MedicalAudience">http://schema.org/MedicalAudience</a>
		 */
		public Clazz.MedicalAudience getMedicalAudience();
		public void setMedicalAudience(Clazz.MedicalAudience medicalAudience);
		public List<Clazz.MedicalAudience> getMedicalAudienceList();
		public void setMedicalAudienceList(List<Clazz.MedicalAudience> medicalAudienceList);
		public boolean hasMedicalAudience();

		/**
		 * @see <a href="http://schema.org/MedicalDevicePurpose">http://schema.org/MedicalDevicePurpose</a>
		 */
		public Clazz.MedicalDevicePurpose getMedicalDevicePurpose();
		public void setMedicalDevicePurpose(Clazz.MedicalDevicePurpose medicalDevicePurpose);
		public List<Clazz.MedicalDevicePurpose> getMedicalDevicePurposeList();
		public void setMedicalDevicePurposeList(List<Clazz.MedicalDevicePurpose> medicalDevicePurposeList);
		public boolean hasMedicalDevicePurpose();

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public Clazz.MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(Clazz.MedicalEnumeration medicalEnumeration);
		public List<Clazz.MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<Clazz.MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public Clazz.MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(Clazz.MedicalEvidenceLevel medicalEvidenceLevel);
		public List<Clazz.MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<Clazz.MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public Clazz.MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(Clazz.MedicalImagingTechnique medicalImagingTechnique);
		public List<Clazz.MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<Clazz.MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public Clazz.MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(Clazz.MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<Clazz.MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<Clazz.MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public Clazz.MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(Clazz.MedicalProcedureType medicalProcedureType);
		public List<Clazz.MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<Clazz.MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public Clazz.MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(Clazz.MedicalStudyStatus medicalStudyStatus);
		public List<Clazz.MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<Clazz.MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public Clazz.MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(Clazz.MedicalTrialDesign medicalTrialDesign);
		public List<Clazz.MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<Clazz.MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public Clazz.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Clazz.MedicineSystem medicineSystem);
		public List<Clazz.MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<Clazz.MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Clazz.Patient getPatient();
		public void setPatient(Clazz.Patient patient);
		public List<Clazz.Patient> getPatientList();
		public void setPatientList(List<Clazz.Patient> patientList);
		public boolean hasPatient();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

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
	@SchemaOrgURI("http://schema.org/maximumIntake")
	@SchemaOrgLabel("maximumIntake")
	@SchemaOrgComment(""
			+ "Recommended intake of this supplement for a given population as defined by a"
			+ " specific recommending authority.")
	@CamelizedName("maximumIntake")
	@ConstantizedName("MAXIMUM_INTAKE")
	public interface MaximumIntake extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/mechanismOfAction")
	@SchemaOrgLabel("mechanismOfAction")
	@SchemaOrgComment(""
			+ "The specific biochemical interaction through which this drug or supplement"
			+ " produces its pharmacological effect.")
	@CamelizedName("mechanismOfAction")
	@ConstantizedName("MECHANISM_OF_ACTION")
	public interface MechanismOfAction extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/medicalSpecialty")
	@SchemaOrgLabel("medicalSpecialty")
	@SchemaOrgComment("A medical specialty of the provider.")
	@CamelizedName("medicalSpecialty")
	@ConstantizedName("MEDICAL_SPECIALTY")
	public interface MedicalSpecialty extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/medicineSystem")
	@SchemaOrgLabel("medicineSystem")
	@SchemaOrgComment(""
			+ "The system of medicine that includes this MedicalEntity, for example"
			+ " 'evidence-based', 'homeopathic', 'chiropractic', etc.")
	@CamelizedName("medicineSystem")
	@ConstantizedName("MEDICINE_SYSTEM")
	public interface MedicineSystem extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public Clazz.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Clazz.MedicineSystem medicineSystem);
		public List<Clazz.MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<Clazz.MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/muscleAction")
	@SchemaOrgLabel("muscleAction")
	@SchemaOrgComment("The movement the muscle generates.")
	@CamelizedName("muscleAction")
	@ConstantizedName("MUSCLE_ACTION")
	public interface MuscleAction extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/naturalProgression")
	@SchemaOrgLabel("naturalProgression")
	@SchemaOrgComment(""
			+ "The expected progression of the condition if it is not treated and allowed to"
			+ " progress naturally.")
	@CamelizedName("naturalProgression")
	@ConstantizedName("NATURAL_PROGRESSION")
	public interface NaturalProgression extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/nerve")
	@SchemaOrgLabel("nerve")
	@SchemaOrgComment(""
			+ "The underlying innervation associated with the muscle.")
	@CamelizedName("nerve")
	@ConstantizedName("NERVE")
	public interface Nerve extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nerveMotor")
	@SchemaOrgLabel("nerveMotor")
	@SchemaOrgComment(""
			+ "The neurological pathway extension that involves muscle control.")
	@CamelizedName("nerveMotor")
	@ConstantizedName("NERVE_MOTOR")
	public interface NerveMotor extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/nonProprietaryName")
	@SchemaOrgLabel("nonProprietaryName")
	@SchemaOrgComment(""
			+ "The generic name of this drug or supplement.")
	@CamelizedName("nonProprietaryName")
	@ConstantizedName("NON_PROPRIETARY_NAME")
	public interface NonProprietaryName extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/normalRange")
	@SchemaOrgLabel("normalRange")
	@SchemaOrgComment(""
			+ "Range of acceptable values for a typical patient, when applicable.")
	@CamelizedName("normalRange")
	@ConstantizedName("NORMAL_RANGE")
	public interface NormalRange extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public Clazz.DrugClass getDrugClass();
		public void setDrugClass(Clazz.DrugClass drugClass);
		public List<Clazz.DrugClass> getDrugClassList();
		public void setDrugClassList(List<Clazz.DrugClass> drugClassList);
		public boolean hasDrugClass();

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public Clazz.DrugCost getDrugCost();
		public void setDrugCost(Clazz.DrugCost drugCost);
		public List<Clazz.DrugCost> getDrugCostList();
		public void setDrugCostList(List<Clazz.DrugCost> drugCostList);
		public boolean hasDrugCost();

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public Clazz.DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(Clazz.DrugCostCategory drugCostCategory);
		public List<Clazz.DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<Clazz.DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public Clazz.DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(Clazz.DrugPregnancyCategory drugPregnancyCategory);
		public List<Clazz.DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<Clazz.DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public Clazz.DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(Clazz.DrugPrescriptionStatus drugPrescriptionStatus);
		public List<Clazz.DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<Clazz.DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public Clazz.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Clazz.InfectiousAgentClass infectiousAgentClass);
		public List<Clazz.InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<Clazz.InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		/**
		 * @see <a href="http://schema.org/MedicalAudience">http://schema.org/MedicalAudience</a>
		 */
		public Clazz.MedicalAudience getMedicalAudience();
		public void setMedicalAudience(Clazz.MedicalAudience medicalAudience);
		public List<Clazz.MedicalAudience> getMedicalAudienceList();
		public void setMedicalAudienceList(List<Clazz.MedicalAudience> medicalAudienceList);
		public boolean hasMedicalAudience();

		/**
		 * @see <a href="http://schema.org/MedicalDevicePurpose">http://schema.org/MedicalDevicePurpose</a>
		 */
		public Clazz.MedicalDevicePurpose getMedicalDevicePurpose();
		public void setMedicalDevicePurpose(Clazz.MedicalDevicePurpose medicalDevicePurpose);
		public List<Clazz.MedicalDevicePurpose> getMedicalDevicePurposeList();
		public void setMedicalDevicePurposeList(List<Clazz.MedicalDevicePurpose> medicalDevicePurposeList);
		public boolean hasMedicalDevicePurpose();

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public Clazz.MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(Clazz.MedicalEnumeration medicalEnumeration);
		public List<Clazz.MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<Clazz.MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public Clazz.MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(Clazz.MedicalEvidenceLevel medicalEvidenceLevel);
		public List<Clazz.MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<Clazz.MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public Clazz.MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(Clazz.MedicalImagingTechnique medicalImagingTechnique);
		public List<Clazz.MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<Clazz.MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public Clazz.MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(Clazz.MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<Clazz.MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<Clazz.MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public Clazz.MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(Clazz.MedicalProcedureType medicalProcedureType);
		public List<Clazz.MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<Clazz.MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public Clazz.MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(Clazz.MedicalStudyStatus medicalStudyStatus);
		public List<Clazz.MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<Clazz.MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public Clazz.MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(Clazz.MedicalTrialDesign medicalTrialDesign);
		public List<Clazz.MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<Clazz.MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public Clazz.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Clazz.MedicineSystem medicineSystem);
		public List<Clazz.MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<Clazz.MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Clazz.Patient getPatient();
		public void setPatient(Clazz.Patient patient);
		public List<Clazz.Patient> getPatientList();
		public void setPatientList(List<Clazz.Patient> patientList);
		public boolean hasPatient();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

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
	@SchemaOrgURI("http://schema.org/origin")
	@SchemaOrgLabel("origin")
	@SchemaOrgComment(""
			+ "The place or point where a muscle arises.")
	@CamelizedName("origin")
	@ConstantizedName("ORIGIN")
	public interface Origin extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/originatesFrom")
	@SchemaOrgLabel("originatesFrom")
	@SchemaOrgComment(""
			+ "The vasculature the lymphatic structure originates, or afferents, from.")
	@CamelizedName("originatesFrom")
	@ConstantizedName("ORIGINATES_FROM")
	public interface OriginatesFrom extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/outcome")
	@SchemaOrgLabel("outcome")
	@SchemaOrgComment(""
			+ "Expected or actual outcomes of the study.")
	@CamelizedName("outcome")
	@ConstantizedName("OUTCOME")
	public interface Outcome extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/overdosage")
	@SchemaOrgLabel("overdosage")
	@SchemaOrgComment(""
			+ "Any information related to overdose on a drug, including signs or symptoms,"
			+ " treatments, contact information for emergency response.")
	@CamelizedName("overdosage")
	@ConstantizedName("OVERDOSAGE")
	public interface Overdosage extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/overview")
	@SchemaOrgLabel("overview")
	@SchemaOrgComment(""
			+ "Descriptive information establishing the overarching theory/philosophy of the"
			+ " plan. May include the rationale for the name, the population where the plan"
			+ " first came to prominence, etc.")
	@CamelizedName("overview")
	@ConstantizedName("OVERVIEW")
	public interface Overview extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/partOfSystem")
	@SchemaOrgLabel("partOfSystem")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that this structure is part of.")
	@CamelizedName("partOfSystem")
	@ConstantizedName("PART_OF_SYSTEM")
	public interface PartOfSystem extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pathophysiology")
	@SchemaOrgLabel("pathophysiology")
	@SchemaOrgComment(""
			+ "Changes in the normal mechanical, physical, and biochemical functions that are"
			+ " associated with this activity or condition.")
	@CamelizedName("pathophysiology")
	@ConstantizedName("PATHOPHYSIOLOGY")
	public interface Pathophysiology extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/phase")
	@SchemaOrgLabel("phase")
	@SchemaOrgComment("The phase of the clinical trial.")
	@CamelizedName("phase")
	@ConstantizedName("PHASE")
	public interface Phase extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/physiologicalBenefits")
	@SchemaOrgLabel("physiologicalBenefits")
	@SchemaOrgComment(""
			+ "Specific physiologic benefits associated to the plan.")
	@CamelizedName("physiologicalBenefits")
	@ConstantizedName("PHYSIOLOGICAL_BENEFITS")
	public interface PhysiologicalBenefits extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/population")
	@SchemaOrgLabel("population")
	@SchemaOrgComment(""
			+ "Any characteristics of the population used in the study, e.g. 'males under 65'.")
	@CamelizedName("population")
	@ConstantizedName("POPULATION")
	public interface Population extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/possibleComplication")
	@SchemaOrgLabel("possibleComplication")
	@SchemaOrgComment(""
			+ "A possible unexpected and unfavorable evolution of a medical condition."
			+ " Complications may include worsening of the signs or symptoms of the disease,"
			+ " extension of the condition to other organ systems, etc.")
	@CamelizedName("possibleComplication")
	@ConstantizedName("POSSIBLE_COMPLICATION")
	public interface PossibleComplication extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/possibleTreatment")
	@SchemaOrgLabel("possibleTreatment")
	@SchemaOrgComment(""
			+ "A possible treatment to address this condition, sign or symptom.")
	@CamelizedName("possibleTreatment")
	@ConstantizedName("POSSIBLE_TREATMENT")
	public interface PossibleTreatment extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/postOp")
	@SchemaOrgLabel("postOp")
	@SchemaOrgComment(""
			+ "A description of the postoperative procedures, care, and/or followups for this"
			+ " device.")
	@CamelizedName("postOp")
	@ConstantizedName("POST_OP")
	public interface PostOp extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/preOp")
	@SchemaOrgLabel("preOp")
	@SchemaOrgComment(""
			+ "A description of the workup, testing, and other preparations required before"
			+ " implanting this device.")
	@CamelizedName("preOp")
	@ConstantizedName("PRE_OP")
	public interface PreOp extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/pregnancyCategory")
	@SchemaOrgLabel("pregnancyCategory")
	@SchemaOrgComment("Pregnancy category of this drug.")
	@CamelizedName("pregnancyCategory")
	@ConstantizedName("PREGNANCY_CATEGORY")
	public interface PregnancyCategory extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public Clazz.DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(Clazz.DrugPregnancyCategory drugPregnancyCategory);
		public List<Clazz.DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<Clazz.DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/pregnancyWarning")
	@SchemaOrgLabel("pregnancyWarning")
	@SchemaOrgComment(""
			+ "Any precaution, guidance, contraindication, etc. related to this drug's use"
			+ " during pregnancy.")
	@CamelizedName("pregnancyWarning")
	@ConstantizedName("PREGNANCY_WARNING")
	public interface PregnancyWarning extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/preparation")
	@SchemaOrgLabel("preparation")
	@SchemaOrgComment(""
			+ "Typical preparation that a patient must undergo before having the procedure"
			+ " performed.")
	@CamelizedName("preparation")
	@ConstantizedName("PREPARATION")
	public interface Preparation extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/Text">http://schema.org/Text</a>
		 */
		public Text getText();
		public void setText(Text text);
		public List<Text> getTextList();
		public void setTextList(List<Text> textList);
		public boolean hasText();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/prescribingInfo")
	@SchemaOrgLabel("prescribingInfo")
	@SchemaOrgComment(""
			+ "Link to prescribing information for the drug.")
	@CamelizedName("prescribingInfo")
	@ConstantizedName("PRESCRIBING_INFO")
	public interface PrescribingInfo extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/prescriptionStatus")
	@SchemaOrgLabel("prescriptionStatus")
	@SchemaOrgComment(""
			+ "Indicates the status of drug prescription eg. local catalogs classifications or"
			+ " whether the drug is available by prescription or over-the-counter, etc.")
	@CamelizedName("prescriptionStatus")
	@ConstantizedName("PRESCRIPTION_STATUS")
	public interface PrescriptionStatus extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public Clazz.DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(Clazz.DrugPrescriptionStatus drugPrescriptionStatus);
		public List<Clazz.DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<Clazz.DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

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
	@SchemaOrgURI("http://schema.org/primaryPrevention")
	@SchemaOrgLabel("primaryPrevention")
	@SchemaOrgComment(""
			+ "A preventative therapy used to prevent an initial occurrence of the medical"
			+ " condition, such as vaccination.")
	@CamelizedName("primaryPrevention")
	@ConstantizedName("PRIMARY_PREVENTION")
	public interface PrimaryPrevention extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/procedure")
	@SchemaOrgLabel("procedure")
	@SchemaOrgComment(""
			+ "A description of the procedure involved in setting up, using, and/or installing"
			+ " the device.")
	@CamelizedName("procedure")
	@ConstantizedName("PROCEDURE")
	public interface Procedure extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/procedureType")
	@SchemaOrgLabel("procedureType")
	@SchemaOrgComment(""
			+ "The type of procedure, for example Surgical, Noninvasive, or Percutaneous.")
	@CamelizedName("procedureType")
	@ConstantizedName("PROCEDURE_TYPE")
	public interface ProcedureType extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public Clazz.MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(Clazz.MedicalProcedureType medicalProcedureType);
		public List<Clazz.MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<Clazz.MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/proprietaryName")
	@SchemaOrgLabel("proprietaryName")
	@SchemaOrgComment(""
			+ "Proprietary name given to the diet plan, typically by its originator or creator.")
	@CamelizedName("proprietaryName")
	@ConstantizedName("PROPRIETARY_NAME")
	public interface ProprietaryName extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/publicationType")
	@SchemaOrgLabel("publicationType")
	@SchemaOrgComment(""
			+ "The type of the medical article, taken from the US NLM MeSH publication type"
			+ " catalog. See also <a href=\"http://www.nlm.nih.gov/mesh/pubtypes.html\">MeSH"
			+ " documentation</a>.")
	@CamelizedName("publicationType")
	@ConstantizedName("PUBLICATION_TYPE")
	public interface PublicationType extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/purpose")
	@SchemaOrgLabel("purpose")
	@SchemaOrgComment(""
			+ "A goal towards an action is taken. Can be concrete or abstract.")
	@CamelizedName("purpose")
	@ConstantizedName("PURPOSE")
	public interface Purpose extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AMRadioChannel">http://schema.org/AMRadioChannel</a>
		 */
		public AMRadioChannel getAMRadioChannel();
		public void setAMRadioChannel(AMRadioChannel amRadioChannel);
		public List<AMRadioChannel> getAMRadioChannelList();
		public void setAMRadioChannelList(List<AMRadioChannel> amRadioChannelList);
		public boolean hasAMRadioChannel();

		/**
		 * @see <a href="http://schema.org/APIReference">http://schema.org/APIReference</a>
		 */
		public APIReference getAPIReference();
		public void setAPIReference(APIReference apiReference);
		public List<APIReference> getAPIReferenceList();
		public void setAPIReferenceList(List<APIReference> apiReferenceList);
		public boolean hasAPIReference();

		/**
		 * @see <a href="http://schema.org/AboutPage">http://schema.org/AboutPage</a>
		 */
		public AboutPage getAboutPage();
		public void setAboutPage(AboutPage aboutPage);
		public List<AboutPage> getAboutPageList();
		public void setAboutPageList(List<AboutPage> aboutPageList);
		public boolean hasAboutPage();

		/**
		 * @see <a href="http://schema.org/AcceptAction">http://schema.org/AcceptAction</a>
		 */
		public AcceptAction getAcceptAction();
		public void setAcceptAction(AcceptAction acceptAction);
		public List<AcceptAction> getAcceptActionList();
		public void setAcceptActionList(List<AcceptAction> acceptActionList);
		public boolean hasAcceptAction();

		/**
		 * @see <a href="http://schema.org/Accommodation">http://schema.org/Accommodation</a>
		 */
		public Accommodation getAccommodation();
		public void setAccommodation(Accommodation accommodation);
		public List<Accommodation> getAccommodationList();
		public void setAccommodationList(List<Accommodation> accommodationList);
		public boolean hasAccommodation();

		/**
		 * @see <a href="http://schema.org/AccountingService">http://schema.org/AccountingService</a>
		 */
		public AccountingService getAccountingService();
		public void setAccountingService(AccountingService accountingService);
		public List<AccountingService> getAccountingServiceList();
		public void setAccountingServiceList(List<AccountingService> accountingServiceList);
		public boolean hasAccountingService();

		/**
		 * @see <a href="http://schema.org/AchieveAction">http://schema.org/AchieveAction</a>
		 */
		public AchieveAction getAchieveAction();
		public void setAchieveAction(AchieveAction achieveAction);
		public List<AchieveAction> getAchieveActionList();
		public void setAchieveActionList(List<AchieveAction> achieveActionList);
		public boolean hasAchieveAction();

		/**
		 * @see <a href="http://schema.org/Action">http://schema.org/Action</a>
		 */
		public org.kyojo.schemaorg.m3n4.core.Clazz.Action getAction();
		public void setAction(org.kyojo.schemaorg.m3n4.core.Clazz.Action action);
		public List<org.kyojo.schemaorg.m3n4.core.Clazz.Action> getActionList();
		public void setActionList(List<org.kyojo.schemaorg.m3n4.core.Clazz.Action> actionList);
		public boolean hasAction();

		/**
		 * @see <a href="http://schema.org/ActionAccessSpecification">http://schema.org/ActionAccessSpecification</a>
		 */
		public ActionAccessSpecification getActionAccessSpecification();
		public void setActionAccessSpecification(ActionAccessSpecification actionAccessSpecification);
		public List<ActionAccessSpecification> getActionAccessSpecificationList();
		public void setActionAccessSpecificationList(List<ActionAccessSpecification> actionAccessSpecificationList);
		public boolean hasActionAccessSpecification();

		/**
		 * @see <a href="http://schema.org/ActionStatusType">http://schema.org/ActionStatusType</a>
		 */
		public ActionStatusType getActionStatusType();
		public void setActionStatusType(ActionStatusType actionStatusType);
		public List<ActionStatusType> getActionStatusTypeList();
		public void setActionStatusTypeList(List<ActionStatusType> actionStatusTypeList);
		public boolean hasActionStatusType();

		/**
		 * @see <a href="http://schema.org/ActivateAction">http://schema.org/ActivateAction</a>
		 */
		public ActivateAction getActivateAction();
		public void setActivateAction(ActivateAction activateAction);
		public List<ActivateAction> getActivateActionList();
		public void setActivateActionList(List<ActivateAction> activateActionList);
		public boolean hasActivateAction();

		/**
		 * @see <a href="http://schema.org/AddAction">http://schema.org/AddAction</a>
		 */
		public AddAction getAddAction();
		public void setAddAction(AddAction addAction);
		public List<AddAction> getAddActionList();
		public void setAddActionList(List<AddAction> addActionList);
		public boolean hasAddAction();

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		/**
		 * @see <a href="http://schema.org/AdultEntertainment">http://schema.org/AdultEntertainment</a>
		 */
		public AdultEntertainment getAdultEntertainment();
		public void setAdultEntertainment(AdultEntertainment adultEntertainment);
		public List<AdultEntertainment> getAdultEntertainmentList();
		public void setAdultEntertainmentList(List<AdultEntertainment> adultEntertainmentList);
		public boolean hasAdultEntertainment();

		/**
		 * @see <a href="http://schema.org/AdvertiserContentArticle">http://schema.org/AdvertiserContentArticle</a>
		 */
		public AdvertiserContentArticle getAdvertiserContentArticle();
		public void setAdvertiserContentArticle(AdvertiserContentArticle advertiserContentArticle);
		public List<AdvertiserContentArticle> getAdvertiserContentArticleList();
		public void setAdvertiserContentArticleList(List<AdvertiserContentArticle> advertiserContentArticleList);
		public boolean hasAdvertiserContentArticle();

		/**
		 * @see <a href="http://schema.org/AggregateOffer">http://schema.org/AggregateOffer</a>
		 */
		public AggregateOffer getAggregateOffer();
		public void setAggregateOffer(AggregateOffer aggregateOffer);
		public List<AggregateOffer> getAggregateOfferList();
		public void setAggregateOfferList(List<AggregateOffer> aggregateOfferList);
		public boolean hasAggregateOffer();

		/**
		 * @see <a href="http://schema.org/AggregateRating">http://schema.org/AggregateRating</a>
		 */
		public AggregateRating getAggregateRating();
		public void setAggregateRating(AggregateRating aggregateRating);
		public List<AggregateRating> getAggregateRatingList();
		public void setAggregateRatingList(List<AggregateRating> aggregateRatingList);
		public boolean hasAggregateRating();

		/**
		 * @see <a href="http://schema.org/AgreeAction">http://schema.org/AgreeAction</a>
		 */
		public AgreeAction getAgreeAction();
		public void setAgreeAction(AgreeAction agreeAction);
		public List<AgreeAction> getAgreeActionList();
		public void setAgreeActionList(List<AgreeAction> agreeActionList);
		public boolean hasAgreeAction();

		/**
		 * @see <a href="http://schema.org/Airline">http://schema.org/Airline</a>
		 */
		public Airline getAirline();
		public void setAirline(Airline airline);
		public List<Airline> getAirlineList();
		public void setAirlineList(List<Airline> airlineList);
		public boolean hasAirline();

		/**
		 * @see <a href="http://schema.org/Airport">http://schema.org/Airport</a>
		 */
		public Airport getAirport();
		public void setAirport(Airport airport);
		public List<Airport> getAirportList();
		public void setAirportList(List<Airport> airportList);
		public boolean hasAirport();

		/**
		 * @see <a href="http://schema.org/AlignmentObject">http://schema.org/AlignmentObject</a>
		 */
		public AlignmentObject getAlignmentObject();
		public void setAlignmentObject(AlignmentObject alignmentObject);
		public List<AlignmentObject> getAlignmentObjectList();
		public void setAlignmentObjectList(List<AlignmentObject> alignmentObjectList);
		public boolean hasAlignmentObject();

		/**
		 * @see <a href="http://schema.org/AllocateAction">http://schema.org/AllocateAction</a>
		 */
		public AllocateAction getAllocateAction();
		public void setAllocateAction(AllocateAction allocateAction);
		public List<AllocateAction> getAllocateActionList();
		public void setAllocateActionList(List<AllocateAction> allocateActionList);
		public boolean hasAllocateAction();

		/**
		 * @see <a href="http://schema.org/AmusementPark">http://schema.org/AmusementPark</a>
		 */
		public AmusementPark getAmusementPark();
		public void setAmusementPark(AmusementPark amusementPark);
		public List<AmusementPark> getAmusementParkList();
		public void setAmusementParkList(List<AmusementPark> amusementParkList);
		public boolean hasAmusementPark();

		/**
		 * @see <a href="http://schema.org/AnalysisNewsArticle">http://schema.org/AnalysisNewsArticle</a>
		 */
		public AnalysisNewsArticle getAnalysisNewsArticle();
		public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle);
		public List<AnalysisNewsArticle> getAnalysisNewsArticleList();
		public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList);
		public boolean hasAnalysisNewsArticle();

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/AnimalShelter">http://schema.org/AnimalShelter</a>
		 */
		public AnimalShelter getAnimalShelter();
		public void setAnimalShelter(AnimalShelter animalShelter);
		public List<AnimalShelter> getAnimalShelterList();
		public void setAnimalShelterList(List<AnimalShelter> animalShelterList);
		public boolean hasAnimalShelter();

		/**
		 * @see <a href="http://schema.org/Answer">http://schema.org/Answer</a>
		 */
		public Answer getAnswer();
		public void setAnswer(Answer answer);
		public List<Answer> getAnswerList();
		public void setAnswerList(List<Answer> answerList);
		public boolean hasAnswer();

		/**
		 * @see <a href="http://schema.org/Apartment">http://schema.org/Apartment</a>
		 */
		public Apartment getApartment();
		public void setApartment(Apartment apartment);
		public List<Apartment> getApartmentList();
		public void setApartmentList(List<Apartment> apartmentList);
		public boolean hasApartment();

		/**
		 * @see <a href="http://schema.org/ApartmentComplex">http://schema.org/ApartmentComplex</a>
		 */
		public ApartmentComplex getApartmentComplex();
		public void setApartmentComplex(ApartmentComplex apartmentComplex);
		public List<ApartmentComplex> getApartmentComplexList();
		public void setApartmentComplexList(List<ApartmentComplex> apartmentComplexList);
		public boolean hasApartmentComplex();

		/**
		 * @see <a href="http://schema.org/AppendAction">http://schema.org/AppendAction</a>
		 */
		public AppendAction getAppendAction();
		public void setAppendAction(AppendAction appendAction);
		public List<AppendAction> getAppendActionList();
		public void setAppendActionList(List<AppendAction> appendActionList);
		public boolean hasAppendAction();

		/**
		 * @see <a href="http://schema.org/ApplyAction">http://schema.org/ApplyAction</a>
		 */
		public ApplyAction getApplyAction();
		public void setApplyAction(ApplyAction applyAction);
		public List<ApplyAction> getApplyActionList();
		public void setApplyActionList(List<ApplyAction> applyActionList);
		public boolean hasApplyAction();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Aquarium">http://schema.org/Aquarium</a>
		 */
		public Aquarium getAquarium();
		public void setAquarium(Aquarium aquarium);
		public List<Aquarium> getAquariumList();
		public void setAquariumList(List<Aquarium> aquariumList);
		public boolean hasAquarium();

		/**
		 * @see <a href="http://schema.org/ArriveAction">http://schema.org/ArriveAction</a>
		 */
		public ArriveAction getArriveAction();
		public void setArriveAction(ArriveAction arriveAction);
		public List<ArriveAction> getArriveActionList();
		public void setArriveActionList(List<ArriveAction> arriveActionList);
		public boolean hasArriveAction();

		/**
		 * @see <a href="http://schema.org/ArtGallery">http://schema.org/ArtGallery</a>
		 */
		public ArtGallery getArtGallery();
		public void setArtGallery(ArtGallery artGallery);
		public List<ArtGallery> getArtGalleryList();
		public void setArtGalleryList(List<ArtGallery> artGalleryList);
		public boolean hasArtGallery();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Article">http://schema.org/Article</a>
		 */
		public Article getArticle();
		public void setArticle(Article article);
		public List<Article> getArticleList();
		public void setArticleList(List<Article> articleList);
		public boolean hasArticle();

		/**
		 * @see <a href="http://schema.org/AskAction">http://schema.org/AskAction</a>
		 */
		public AskAction getAskAction();
		public void setAskAction(AskAction askAction);
		public List<AskAction> getAskActionList();
		public void setAskActionList(List<AskAction> askActionList);
		public boolean hasAskAction();

		/**
		 * @see <a href="http://schema.org/AskPublicNewsArticle">http://schema.org/AskPublicNewsArticle</a>
		 */
		public AskPublicNewsArticle getAskPublicNewsArticle();
		public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle);
		public List<AskPublicNewsArticle> getAskPublicNewsArticleList();
		public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList);
		public boolean hasAskPublicNewsArticle();

		/**
		 * @see <a href="http://schema.org/AssessAction">http://schema.org/AssessAction</a>
		 */
		public AssessAction getAssessAction();
		public void setAssessAction(AssessAction assessAction);
		public List<AssessAction> getAssessActionList();
		public void setAssessActionList(List<AssessAction> assessActionList);
		public boolean hasAssessAction();

		/**
		 * @see <a href="http://schema.org/AssignAction">http://schema.org/AssignAction</a>
		 */
		public AssignAction getAssignAction();
		public void setAssignAction(AssignAction assignAction);
		public List<AssignAction> getAssignActionList();
		public void setAssignActionList(List<AssignAction> assignActionList);
		public boolean hasAssignAction();

		/**
		 * @see <a href="http://schema.org/Atlas">http://schema.org/Atlas</a>
		 */
		public Atlas getAtlas();
		public void setAtlas(Atlas atlas);
		public List<Atlas> getAtlasList();
		public void setAtlasList(List<Atlas> atlasList);
		public boolean hasAtlas();

		/**
		 * @see <a href="http://schema.org/Attorney">http://schema.org/Attorney</a>
		 */
		public Attorney getAttorney();
		public void setAttorney(Attorney attorney);
		public List<Attorney> getAttorneyList();
		public void setAttorneyList(List<Attorney> attorneyList);
		public boolean hasAttorney();

		/**
		 * @see <a href="http://schema.org/Audience">http://schema.org/Audience</a>
		 */
		public Audience getAudience();
		public void setAudience(Audience audience);
		public List<Audience> getAudienceList();
		public void setAudienceList(List<Audience> audienceList);
		public boolean hasAudience();

		/**
		 * @see <a href="http://schema.org/AudioObject">http://schema.org/AudioObject</a>
		 */
		public AudioObject getAudioObject();
		public void setAudioObject(AudioObject audioObject);
		public List<AudioObject> getAudioObjectList();
		public void setAudioObjectList(List<AudioObject> audioObjectList);
		public boolean hasAudioObject();

		/**
		 * @see <a href="http://schema.org/Audiobook">http://schema.org/Audiobook</a>
		 */
		public Audiobook getAudiobook();
		public void setAudiobook(Audiobook audiobook);
		public List<Audiobook> getAudiobookList();
		public void setAudiobookList(List<Audiobook> audiobookList);
		public boolean hasAudiobook();

		/**
		 * @see <a href="http://schema.org/AuthorizeAction">http://schema.org/AuthorizeAction</a>
		 */
		public AuthorizeAction getAuthorizeAction();
		public void setAuthorizeAction(AuthorizeAction authorizeAction);
		public List<AuthorizeAction> getAuthorizeActionList();
		public void setAuthorizeActionList(List<AuthorizeAction> authorizeActionList);
		public boolean hasAuthorizeAction();

		/**
		 * @see <a href="http://schema.org/AutoBodyShop">http://schema.org/AutoBodyShop</a>
		 */
		public AutoBodyShop getAutoBodyShop();
		public void setAutoBodyShop(AutoBodyShop autoBodyShop);
		public List<AutoBodyShop> getAutoBodyShopList();
		public void setAutoBodyShopList(List<AutoBodyShop> autoBodyShopList);
		public boolean hasAutoBodyShop();

		/**
		 * @see <a href="http://schema.org/AutoDealer">http://schema.org/AutoDealer</a>
		 */
		public AutoDealer getAutoDealer();
		public void setAutoDealer(AutoDealer autoDealer);
		public List<AutoDealer> getAutoDealerList();
		public void setAutoDealerList(List<AutoDealer> autoDealerList);
		public boolean hasAutoDealer();

		/**
		 * @see <a href="http://schema.org/AutoPartsStore">http://schema.org/AutoPartsStore</a>
		 */
		public AutoPartsStore getAutoPartsStore();
		public void setAutoPartsStore(AutoPartsStore autoPartsStore);
		public List<AutoPartsStore> getAutoPartsStoreList();
		public void setAutoPartsStoreList(List<AutoPartsStore> autoPartsStoreList);
		public boolean hasAutoPartsStore();

		/**
		 * @see <a href="http://schema.org/AutoRental">http://schema.org/AutoRental</a>
		 */
		public AutoRental getAutoRental();
		public void setAutoRental(AutoRental autoRental);
		public List<AutoRental> getAutoRentalList();
		public void setAutoRentalList(List<AutoRental> autoRentalList);
		public boolean hasAutoRental();

		/**
		 * @see <a href="http://schema.org/AutoRepair">http://schema.org/AutoRepair</a>
		 */
		public AutoRepair getAutoRepair();
		public void setAutoRepair(AutoRepair autoRepair);
		public List<AutoRepair> getAutoRepairList();
		public void setAutoRepairList(List<AutoRepair> autoRepairList);
		public boolean hasAutoRepair();

		/**
		 * @see <a href="http://schema.org/AutoWash">http://schema.org/AutoWash</a>
		 */
		public AutoWash getAutoWash();
		public void setAutoWash(AutoWash autoWash);
		public List<AutoWash> getAutoWashList();
		public void setAutoWashList(List<AutoWash> autoWashList);
		public boolean hasAutoWash();

		/**
		 * @see <a href="http://schema.org/AutomatedTeller">http://schema.org/AutomatedTeller</a>
		 */
		public AutomatedTeller getAutomatedTeller();
		public void setAutomatedTeller(AutomatedTeller automatedTeller);
		public List<AutomatedTeller> getAutomatedTellerList();
		public void setAutomatedTellerList(List<AutomatedTeller> automatedTellerList);
		public boolean hasAutomatedTeller();

		/**
		 * @see <a href="http://schema.org/AutomotiveBusiness">http://schema.org/AutomotiveBusiness</a>
		 */
		public AutomotiveBusiness getAutomotiveBusiness();
		public void setAutomotiveBusiness(AutomotiveBusiness automotiveBusiness);
		public List<AutomotiveBusiness> getAutomotiveBusinessList();
		public void setAutomotiveBusinessList(List<AutomotiveBusiness> automotiveBusinessList);
		public boolean hasAutomotiveBusiness();

		/**
		 * @see <a href="http://schema.org/BackgroundNewsArticle">http://schema.org/BackgroundNewsArticle</a>
		 */
		public BackgroundNewsArticle getBackgroundNewsArticle();
		public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle);
		public List<BackgroundNewsArticle> getBackgroundNewsArticleList();
		public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList);
		public boolean hasBackgroundNewsArticle();

		/**
		 * @see <a href="http://schema.org/Bakery">http://schema.org/Bakery</a>
		 */
		public Bakery getBakery();
		public void setBakery(Bakery bakery);
		public List<Bakery> getBakeryList();
		public void setBakeryList(List<Bakery> bakeryList);
		public boolean hasBakery();

		/**
		 * @see <a href="http://schema.org/BankAccount">http://schema.org/BankAccount</a>
		 */
		public BankAccount getBankAccount();
		public void setBankAccount(BankAccount bankAccount);
		public List<BankAccount> getBankAccountList();
		public void setBankAccountList(List<BankAccount> bankAccountList);
		public boolean hasBankAccount();

		/**
		 * @see <a href="http://schema.org/BankOrCreditUnion">http://schema.org/BankOrCreditUnion</a>
		 */
		public BankOrCreditUnion getBankOrCreditUnion();
		public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion);
		public List<BankOrCreditUnion> getBankOrCreditUnionList();
		public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList);
		public boolean hasBankOrCreditUnion();

		/**
		 * @see <a href="http://schema.org/BarOrPub">http://schema.org/BarOrPub</a>
		 */
		public BarOrPub getBarOrPub();
		public void setBarOrPub(BarOrPub barOrPub);
		public List<BarOrPub> getBarOrPubList();
		public void setBarOrPubList(List<BarOrPub> barOrPubList);
		public boolean hasBarOrPub();

		/**
		 * @see <a href="http://schema.org/Barcode">http://schema.org/Barcode</a>
		 */
		public Barcode getBarcode();
		public void setBarcode(Barcode barcode);
		public List<Barcode> getBarcodeList();
		public void setBarcodeList(List<Barcode> barcodeList);
		public boolean hasBarcode();

		/**
		 * @see <a href="http://schema.org/Beach">http://schema.org/Beach</a>
		 */
		public Beach getBeach();
		public void setBeach(Beach beach);
		public List<Beach> getBeachList();
		public void setBeachList(List<Beach> beachList);
		public boolean hasBeach();

		/**
		 * @see <a href="http://schema.org/BeautySalon">http://schema.org/BeautySalon</a>
		 */
		public BeautySalon getBeautySalon();
		public void setBeautySalon(BeautySalon beautySalon);
		public List<BeautySalon> getBeautySalonList();
		public void setBeautySalonList(List<BeautySalon> beautySalonList);
		public boolean hasBeautySalon();

		/**
		 * @see <a href="http://schema.org/BedAndBreakfast">http://schema.org/BedAndBreakfast</a>
		 */
		public BedAndBreakfast getBedAndBreakfast();
		public void setBedAndBreakfast(BedAndBreakfast bedAndBreakfast);
		public List<BedAndBreakfast> getBedAndBreakfastList();
		public void setBedAndBreakfastList(List<BedAndBreakfast> bedAndBreakfastList);
		public boolean hasBedAndBreakfast();

		/**
		 * @see <a href="http://schema.org/BedDetails">http://schema.org/BedDetails</a>
		 */
		public BedDetails getBedDetails();
		public void setBedDetails(BedDetails bedDetails);
		public List<BedDetails> getBedDetailsList();
		public void setBedDetailsList(List<BedDetails> bedDetailsList);
		public boolean hasBedDetails();

		/**
		 * @see <a href="http://schema.org/BedType">http://schema.org/BedType</a>
		 */
		public BedType getBedType();
		public void setBedType(BedType bedType);
		public List<BedType> getBedTypeList();
		public void setBedTypeList(List<BedType> bedTypeList);
		public boolean hasBedType();

		/**
		 * @see <a href="http://schema.org/BefriendAction">http://schema.org/BefriendAction</a>
		 */
		public BefriendAction getBefriendAction();
		public void setBefriendAction(BefriendAction befriendAction);
		public List<BefriendAction> getBefriendActionList();
		public void setBefriendActionList(List<BefriendAction> befriendActionList);
		public boolean hasBefriendAction();

		/**
		 * @see <a href="http://schema.org/BikeStore">http://schema.org/BikeStore</a>
		 */
		public BikeStore getBikeStore();
		public void setBikeStore(BikeStore bikeStore);
		public List<BikeStore> getBikeStoreList();
		public void setBikeStoreList(List<BikeStore> bikeStoreList);
		public boolean hasBikeStore();

		/**
		 * @see <a href="http://schema.org/Blog">http://schema.org/Blog</a>
		 */
		public Blog getBlog();
		public void setBlog(Blog blog);
		public List<Blog> getBlogList();
		public void setBlogList(List<Blog> blogList);
		public boolean hasBlog();

		/**
		 * @see <a href="http://schema.org/BlogPosting">http://schema.org/BlogPosting</a>
		 */
		public BlogPosting getBlogPosting();
		public void setBlogPosting(BlogPosting blogPosting);
		public List<BlogPosting> getBlogPostingList();
		public void setBlogPostingList(List<BlogPosting> blogPostingList);
		public boolean hasBlogPosting();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/BoardingPolicyType">http://schema.org/BoardingPolicyType</a>
		 */
		public BoardingPolicyType getBoardingPolicyType();
		public void setBoardingPolicyType(BoardingPolicyType boardingPolicyType);
		public List<BoardingPolicyType> getBoardingPolicyTypeList();
		public void setBoardingPolicyTypeList(List<BoardingPolicyType> boardingPolicyTypeList);
		public boolean hasBoardingPolicyType();

		/**
		 * @see <a href="http://schema.org/BodyOfWater">http://schema.org/BodyOfWater</a>
		 */
		public BodyOfWater getBodyOfWater();
		public void setBodyOfWater(BodyOfWater bodyOfWater);
		public List<BodyOfWater> getBodyOfWaterList();
		public void setBodyOfWaterList(List<BodyOfWater> bodyOfWaterList);
		public boolean hasBodyOfWater();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/Book">http://schema.org/Book</a>
		 */
		public Book getBook();
		public void setBook(Book book);
		public List<Book> getBookList();
		public void setBookList(List<Book> bookList);
		public boolean hasBook();

		/**
		 * @see <a href="http://schema.org/BookFormatType">http://schema.org/BookFormatType</a>
		 */
		public BookFormatType getBookFormatType();
		public void setBookFormatType(BookFormatType bookFormatType);
		public List<BookFormatType> getBookFormatTypeList();
		public void setBookFormatTypeList(List<BookFormatType> bookFormatTypeList);
		public boolean hasBookFormatType();

		/**
		 * @see <a href="http://schema.org/BookSeries">http://schema.org/BookSeries</a>
		 */
		public BookSeries getBookSeries();
		public void setBookSeries(BookSeries bookSeries);
		public List<BookSeries> getBookSeriesList();
		public void setBookSeriesList(List<BookSeries> bookSeriesList);
		public boolean hasBookSeries();

		/**
		 * @see <a href="http://schema.org/BookStore">http://schema.org/BookStore</a>
		 */
		public BookStore getBookStore();
		public void setBookStore(BookStore bookStore);
		public List<BookStore> getBookStoreList();
		public void setBookStoreList(List<BookStore> bookStoreList);
		public boolean hasBookStore();

		/**
		 * @see <a href="http://schema.org/BookmarkAction">http://schema.org/BookmarkAction</a>
		 */
		public BookmarkAction getBookmarkAction();
		public void setBookmarkAction(BookmarkAction bookmarkAction);
		public List<BookmarkAction> getBookmarkActionList();
		public void setBookmarkActionList(List<BookmarkAction> bookmarkActionList);
		public boolean hasBookmarkAction();

		/**
		 * @see <a href="http://schema.org/BorrowAction">http://schema.org/BorrowAction</a>
		 */
		public BorrowAction getBorrowAction();
		public void setBorrowAction(BorrowAction borrowAction);
		public List<BorrowAction> getBorrowActionList();
		public void setBorrowActionList(List<BorrowAction> borrowActionList);
		public boolean hasBorrowAction();

		/**
		 * @see <a href="http://schema.org/BowlingAlley">http://schema.org/BowlingAlley</a>
		 */
		public BowlingAlley getBowlingAlley();
		public void setBowlingAlley(BowlingAlley bowlingAlley);
		public List<BowlingAlley> getBowlingAlleyList();
		public void setBowlingAlleyList(List<BowlingAlley> bowlingAlleyList);
		public boolean hasBowlingAlley();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Brand">http://schema.org/Brand</a>
		 */
		public Brand getBrand();
		public void setBrand(Brand brand);
		public List<Brand> getBrandList();
		public void setBrandList(List<Brand> brandList);
		public boolean hasBrand();

		/**
		 * @see <a href="http://schema.org/BreadcrumbList">http://schema.org/BreadcrumbList</a>
		 */
		public BreadcrumbList getBreadcrumbList();
		public void setBreadcrumbList(BreadcrumbList breadcrumbList);
		public List<BreadcrumbList> getBreadcrumbListList();
		public void setBreadcrumbListList(List<BreadcrumbList> breadcrumbListList);
		public boolean hasBreadcrumbList();

		/**
		 * @see <a href="http://schema.org/Brewery">http://schema.org/Brewery</a>
		 */
		public Brewery getBrewery();
		public void setBrewery(Brewery brewery);
		public List<Brewery> getBreweryList();
		public void setBreweryList(List<Brewery> breweryList);
		public boolean hasBrewery();

		/**
		 * @see <a href="http://schema.org/Bridge">http://schema.org/Bridge</a>
		 */
		public Bridge getBridge();
		public void setBridge(Bridge bridge);
		public List<Bridge> getBridgeList();
		public void setBridgeList(List<Bridge> bridgeList);
		public boolean hasBridge();

		/**
		 * @see <a href="http://schema.org/BroadcastChannel">http://schema.org/BroadcastChannel</a>
		 */
		public BroadcastChannel getBroadcastChannel();
		public void setBroadcastChannel(BroadcastChannel broadcastChannel);
		public List<BroadcastChannel> getBroadcastChannelList();
		public void setBroadcastChannelList(List<BroadcastChannel> broadcastChannelList);
		public boolean hasBroadcastChannel();

		/**
		 * @see <a href="http://schema.org/BroadcastEvent">http://schema.org/BroadcastEvent</a>
		 */
		public BroadcastEvent getBroadcastEvent();
		public void setBroadcastEvent(BroadcastEvent broadcastEvent);
		public List<BroadcastEvent> getBroadcastEventList();
		public void setBroadcastEventList(List<BroadcastEvent> broadcastEventList);
		public boolean hasBroadcastEvent();

		/**
		 * @see <a href="http://schema.org/BroadcastFrequencySpecification">http://schema.org/BroadcastFrequencySpecification</a>
		 */
		public BroadcastFrequencySpecification getBroadcastFrequencySpecification();
		public void setBroadcastFrequencySpecification(BroadcastFrequencySpecification broadcastFrequencySpecification);
		public List<BroadcastFrequencySpecification> getBroadcastFrequencySpecificationList();
		public void setBroadcastFrequencySpecificationList(List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList);
		public boolean hasBroadcastFrequencySpecification();

		/**
		 * @see <a href="http://schema.org/BroadcastService">http://schema.org/BroadcastService</a>
		 */
		public BroadcastService getBroadcastService();
		public void setBroadcastService(BroadcastService broadcastService);
		public List<BroadcastService> getBroadcastServiceList();
		public void setBroadcastServiceList(List<BroadcastService> broadcastServiceList);
		public boolean hasBroadcastService();

		/**
		 * @see <a href="http://schema.org/BrokerageAccount">http://schema.org/BrokerageAccount</a>
		 */
		public BrokerageAccount getBrokerageAccount();
		public void setBrokerageAccount(BrokerageAccount brokerageAccount);
		public List<BrokerageAccount> getBrokerageAccountList();
		public void setBrokerageAccountList(List<BrokerageAccount> brokerageAccountList);
		public boolean hasBrokerageAccount();

		/**
		 * @see <a href="http://schema.org/BuddhistTemple">http://schema.org/BuddhistTemple</a>
		 */
		public BuddhistTemple getBuddhistTemple();
		public void setBuddhistTemple(BuddhistTemple buddhistTemple);
		public List<BuddhistTemple> getBuddhistTempleList();
		public void setBuddhistTempleList(List<BuddhistTemple> buddhistTempleList);
		public boolean hasBuddhistTemple();

		/**
		 * @see <a href="http://schema.org/BusOrCoach">http://schema.org/BusOrCoach</a>
		 */
		public BusOrCoach getBusOrCoach();
		public void setBusOrCoach(BusOrCoach busOrCoach);
		public List<BusOrCoach> getBusOrCoachList();
		public void setBusOrCoachList(List<BusOrCoach> busOrCoachList);
		public boolean hasBusOrCoach();

		/**
		 * @see <a href="http://schema.org/BusReservation">http://schema.org/BusReservation</a>
		 */
		public BusReservation getBusReservation();
		public void setBusReservation(BusReservation busReservation);
		public List<BusReservation> getBusReservationList();
		public void setBusReservationList(List<BusReservation> busReservationList);
		public boolean hasBusReservation();

		/**
		 * @see <a href="http://schema.org/BusStation">http://schema.org/BusStation</a>
		 */
		public BusStation getBusStation();
		public void setBusStation(BusStation busStation);
		public List<BusStation> getBusStationList();
		public void setBusStationList(List<BusStation> busStationList);
		public boolean hasBusStation();

		/**
		 * @see <a href="http://schema.org/BusStop">http://schema.org/BusStop</a>
		 */
		public BusStop getBusStop();
		public void setBusStop(BusStop busStop);
		public List<BusStop> getBusStopList();
		public void setBusStopList(List<BusStop> busStopList);
		public boolean hasBusStop();

		/**
		 * @see <a href="http://schema.org/BusTrip">http://schema.org/BusTrip</a>
		 */
		public BusTrip getBusTrip();
		public void setBusTrip(BusTrip busTrip);
		public List<BusTrip> getBusTripList();
		public void setBusTripList(List<BusTrip> busTripList);
		public boolean hasBusTrip();

		/**
		 * @see <a href="http://schema.org/BusinessAudience">http://schema.org/BusinessAudience</a>
		 */
		public BusinessAudience getBusinessAudience();
		public void setBusinessAudience(BusinessAudience businessAudience);
		public List<BusinessAudience> getBusinessAudienceList();
		public void setBusinessAudienceList(List<BusinessAudience> businessAudienceList);
		public boolean hasBusinessAudience();

		/**
		 * @see <a href="http://schema.org/BusinessEntityType">http://schema.org/BusinessEntityType</a>
		 */
		public BusinessEntityType getBusinessEntityType();
		public void setBusinessEntityType(BusinessEntityType businessEntityType);
		public List<BusinessEntityType> getBusinessEntityTypeList();
		public void setBusinessEntityTypeList(List<BusinessEntityType> businessEntityTypeList);
		public boolean hasBusinessEntityType();

		/**
		 * @see <a href="http://schema.org/BusinessEvent">http://schema.org/BusinessEvent</a>
		 */
		public BusinessEvent getBusinessEvent();
		public void setBusinessEvent(BusinessEvent businessEvent);
		public List<BusinessEvent> getBusinessEventList();
		public void setBusinessEventList(List<BusinessEvent> businessEventList);
		public boolean hasBusinessEvent();

		/**
		 * @see <a href="http://schema.org/BusinessFunction">http://schema.org/BusinessFunction</a>
		 */
		public BusinessFunction getBusinessFunction();
		public void setBusinessFunction(BusinessFunction businessFunction);
		public List<BusinessFunction> getBusinessFunctionList();
		public void setBusinessFunctionList(List<BusinessFunction> businessFunctionList);
		public boolean hasBusinessFunction();

		/**
		 * @see <a href="http://schema.org/BuyAction">http://schema.org/BuyAction</a>
		 */
		public BuyAction getBuyAction();
		public void setBuyAction(BuyAction buyAction);
		public List<BuyAction> getBuyActionList();
		public void setBuyActionList(List<BuyAction> buyActionList);
		public boolean hasBuyAction();

		/**
		 * @see <a href="http://schema.org/CableOrSatelliteService">http://schema.org/CableOrSatelliteService</a>
		 */
		public CableOrSatelliteService getCableOrSatelliteService();
		public void setCableOrSatelliteService(CableOrSatelliteService cableOrSatelliteService);
		public List<CableOrSatelliteService> getCableOrSatelliteServiceList();
		public void setCableOrSatelliteServiceList(List<CableOrSatelliteService> cableOrSatelliteServiceList);
		public boolean hasCableOrSatelliteService();

		/**
		 * @see <a href="http://schema.org/CafeOrCoffeeShop">http://schema.org/CafeOrCoffeeShop</a>
		 */
		public CafeOrCoffeeShop getCafeOrCoffeeShop();
		public void setCafeOrCoffeeShop(CafeOrCoffeeShop cafeOrCoffeeShop);
		public List<CafeOrCoffeeShop> getCafeOrCoffeeShopList();
		public void setCafeOrCoffeeShopList(List<CafeOrCoffeeShop> cafeOrCoffeeShopList);
		public boolean hasCafeOrCoffeeShop();

		/**
		 * @see <a href="http://schema.org/Campground">http://schema.org/Campground</a>
		 */
		public Campground getCampground();
		public void setCampground(Campground campground);
		public List<Campground> getCampgroundList();
		public void setCampgroundList(List<Campground> campgroundList);
		public boolean hasCampground();

		/**
		 * @see <a href="http://schema.org/CampingPitch">http://schema.org/CampingPitch</a>
		 */
		public CampingPitch getCampingPitch();
		public void setCampingPitch(CampingPitch campingPitch);
		public List<CampingPitch> getCampingPitchList();
		public void setCampingPitchList(List<CampingPitch> campingPitchList);
		public boolean hasCampingPitch();

		/**
		 * @see <a href="http://schema.org/Canal">http://schema.org/Canal</a>
		 */
		public Canal getCanal();
		public void setCanal(Canal canal);
		public List<Canal> getCanalList();
		public void setCanalList(List<Canal> canalList);
		public boolean hasCanal();

		/**
		 * @see <a href="http://schema.org/CancelAction">http://schema.org/CancelAction</a>
		 */
		public CancelAction getCancelAction();
		public void setCancelAction(CancelAction cancelAction);
		public List<CancelAction> getCancelActionList();
		public void setCancelActionList(List<CancelAction> cancelActionList);
		public boolean hasCancelAction();

		/**
		 * @see <a href="http://schema.org/Car">http://schema.org/Car</a>
		 */
		public Car getCar();
		public void setCar(Car car);
		public List<Car> getCarList();
		public void setCarList(List<Car> carList);
		public boolean hasCar();

		/**
		 * @see <a href="http://schema.org/CarUsageType">http://schema.org/CarUsageType</a>
		 */
		public CarUsageType getCarUsageType();
		public void setCarUsageType(CarUsageType carUsageType);
		public List<CarUsageType> getCarUsageTypeList();
		public void setCarUsageTypeList(List<CarUsageType> carUsageTypeList);
		public boolean hasCarUsageType();

		/**
		 * @see <a href="http://schema.org/Casino">http://schema.org/Casino</a>
		 */
		public Casino getCasino();
		public void setCasino(Casino casino);
		public List<Casino> getCasinoList();
		public void setCasinoList(List<Casino> casinoList);
		public boolean hasCasino();

		/**
		 * @see <a href="http://schema.org/CategoryCode">http://schema.org/CategoryCode</a>
		 */
		public CategoryCode getCategoryCode();
		public void setCategoryCode(CategoryCode categoryCode);
		public List<CategoryCode> getCategoryCodeList();
		public void setCategoryCodeList(List<CategoryCode> categoryCodeList);
		public boolean hasCategoryCode();

		/**
		 * @see <a href="http://schema.org/CategoryCodeSet">http://schema.org/CategoryCodeSet</a>
		 */
		public CategoryCodeSet getCategoryCodeSet();
		public void setCategoryCodeSet(CategoryCodeSet categoryCodeSet);
		public List<CategoryCodeSet> getCategoryCodeSetList();
		public void setCategoryCodeSetList(List<CategoryCodeSet> categoryCodeSetList);
		public boolean hasCategoryCodeSet();

		/**
		 * @see <a href="http://schema.org/CatholicChurch">http://schema.org/CatholicChurch</a>
		 */
		public CatholicChurch getCatholicChurch();
		public void setCatholicChurch(CatholicChurch catholicChurch);
		public List<CatholicChurch> getCatholicChurchList();
		public void setCatholicChurchList(List<CatholicChurch> catholicChurchList);
		public boolean hasCatholicChurch();

		/**
		 * @see <a href="http://schema.org/Cemetery">http://schema.org/Cemetery</a>
		 */
		public Cemetery getCemetery();
		public void setCemetery(Cemetery cemetery);
		public List<Cemetery> getCemeteryList();
		public void setCemeteryList(List<Cemetery> cemeteryList);
		public boolean hasCemetery();

		/**
		 * @see <a href="http://schema.org/Chapter">http://schema.org/Chapter</a>
		 */
		public Chapter getChapter();
		public void setChapter(Chapter chapter);
		public List<Chapter> getChapterList();
		public void setChapterList(List<Chapter> chapterList);
		public boolean hasChapter();

		/**
		 * @see <a href="http://schema.org/CheckAction">http://schema.org/CheckAction</a>
		 */
		public CheckAction getCheckAction();
		public void setCheckAction(CheckAction checkAction);
		public List<CheckAction> getCheckActionList();
		public void setCheckActionList(List<CheckAction> checkActionList);
		public boolean hasCheckAction();

		/**
		 * @see <a href="http://schema.org/CheckInAction">http://schema.org/CheckInAction</a>
		 */
		public CheckInAction getCheckInAction();
		public void setCheckInAction(CheckInAction checkInAction);
		public List<CheckInAction> getCheckInActionList();
		public void setCheckInActionList(List<CheckInAction> checkInActionList);
		public boolean hasCheckInAction();

		/**
		 * @see <a href="http://schema.org/CheckOutAction">http://schema.org/CheckOutAction</a>
		 */
		public CheckOutAction getCheckOutAction();
		public void setCheckOutAction(CheckOutAction checkOutAction);
		public List<CheckOutAction> getCheckOutActionList();
		public void setCheckOutActionList(List<CheckOutAction> checkOutActionList);
		public boolean hasCheckOutAction();

		/**
		 * @see <a href="http://schema.org/CheckoutPage">http://schema.org/CheckoutPage</a>
		 */
		public CheckoutPage getCheckoutPage();
		public void setCheckoutPage(CheckoutPage checkoutPage);
		public List<CheckoutPage> getCheckoutPageList();
		public void setCheckoutPageList(List<CheckoutPage> checkoutPageList);
		public boolean hasCheckoutPage();

		/**
		 * @see <a href="http://schema.org/ChildCare">http://schema.org/ChildCare</a>
		 */
		public ChildCare getChildCare();
		public void setChildCare(ChildCare childCare);
		public List<ChildCare> getChildCareList();
		public void setChildCareList(List<ChildCare> childCareList);
		public boolean hasChildCare();

		/**
		 * @see <a href="http://schema.org/ChildrensEvent">http://schema.org/ChildrensEvent</a>
		 */
		public ChildrensEvent getChildrensEvent();
		public void setChildrensEvent(ChildrensEvent childrensEvent);
		public List<ChildrensEvent> getChildrensEventList();
		public void setChildrensEventList(List<ChildrensEvent> childrensEventList);
		public boolean hasChildrensEvent();

		/**
		 * @see <a href="http://schema.org/ChooseAction">http://schema.org/ChooseAction</a>
		 */
		public ChooseAction getChooseAction();
		public void setChooseAction(ChooseAction chooseAction);
		public List<ChooseAction> getChooseActionList();
		public void setChooseActionList(List<ChooseAction> chooseActionList);
		public boolean hasChooseAction();

		/**
		 * @see <a href="http://schema.org/Church">http://schema.org/Church</a>
		 */
		public Church getChurch();
		public void setChurch(Church church);
		public List<Church> getChurchList();
		public void setChurchList(List<Church> churchList);
		public boolean hasChurch();

		/**
		 * @see <a href="http://schema.org/City">http://schema.org/City</a>
		 */
		public City getCity();
		public void setCity(City city);
		public List<City> getCityList();
		public void setCityList(List<City> cityList);
		public boolean hasCity();

		/**
		 * @see <a href="http://schema.org/CityHall">http://schema.org/CityHall</a>
		 */
		public CityHall getCityHall();
		public void setCityHall(CityHall cityHall);
		public List<CityHall> getCityHallList();
		public void setCityHallList(List<CityHall> cityHallList);
		public boolean hasCityHall();

		/**
		 * @see <a href="http://schema.org/CivicStructure">http://schema.org/CivicStructure</a>
		 */
		public CivicStructure getCivicStructure();
		public void setCivicStructure(CivicStructure civicStructure);
		public List<CivicStructure> getCivicStructureList();
		public void setCivicStructureList(List<CivicStructure> civicStructureList);
		public boolean hasCivicStructure();

		/**
		 * @see <a href="http://schema.org/Claim">http://schema.org/Claim</a>
		 */
		public Claim getClaim();
		public void setClaim(Claim claim);
		public List<Claim> getClaimList();
		public void setClaimList(List<Claim> claimList);
		public boolean hasClaim();

		/**
		 * @see <a href="http://schema.org/ClaimReview">http://schema.org/ClaimReview</a>
		 */
		public ClaimReview getClaimReview();
		public void setClaimReview(ClaimReview claimReview);
		public List<ClaimReview> getClaimReviewList();
		public void setClaimReviewList(List<ClaimReview> claimReviewList);
		public boolean hasClaimReview();

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Class getClazz();
		public void setClazz(Class clazz);
		public List<Class> getClazzList();
		public void setClazzList(List<Class> clazzList);
		public boolean hasClazz();

		/**
		 * @see <a href="http://schema.org/Clip">http://schema.org/Clip</a>
		 */
		public Clip getClip();
		public void setClip(Clip clip);
		public List<Clip> getClipList();
		public void setClipList(List<Clip> clipList);
		public boolean hasClip();

		/**
		 * @see <a href="http://schema.org/ClothingStore">http://schema.org/ClothingStore</a>
		 */
		public ClothingStore getClothingStore();
		public void setClothingStore(ClothingStore clothingStore);
		public List<ClothingStore> getClothingStoreList();
		public void setClothingStoreList(List<ClothingStore> clothingStoreList);
		public boolean hasClothingStore();

		/**
		 * @see <a href="http://schema.org/Collection">http://schema.org/Collection</a>
		 */
		public Collection getCollection();
		public void setCollection(Collection collection);
		public List<Collection> getCollectionList();
		public void setCollectionList(List<Collection> collectionList);
		public boolean hasCollection();

		/**
		 * @see <a href="http://schema.org/CollectionPage">http://schema.org/CollectionPage</a>
		 */
		public CollectionPage getCollectionPage();
		public void setCollectionPage(CollectionPage collectionPage);
		public List<CollectionPage> getCollectionPageList();
		public void setCollectionPageList(List<CollectionPage> collectionPageList);
		public boolean hasCollectionPage();

		/**
		 * @see <a href="http://schema.org/CollegeOrUniversity">http://schema.org/CollegeOrUniversity</a>
		 */
		public CollegeOrUniversity getCollegeOrUniversity();
		public void setCollegeOrUniversity(CollegeOrUniversity collegeOrUniversity);
		public List<CollegeOrUniversity> getCollegeOrUniversityList();
		public void setCollegeOrUniversityList(List<CollegeOrUniversity> collegeOrUniversityList);
		public boolean hasCollegeOrUniversity();

		/**
		 * @see <a href="http://schema.org/ComedyClub">http://schema.org/ComedyClub</a>
		 */
		public ComedyClub getComedyClub();
		public void setComedyClub(ComedyClub comedyClub);
		public List<ComedyClub> getComedyClubList();
		public void setComedyClubList(List<ComedyClub> comedyClubList);
		public boolean hasComedyClub();

		/**
		 * @see <a href="http://schema.org/ComedyEvent">http://schema.org/ComedyEvent</a>
		 */
		public ComedyEvent getComedyEvent();
		public void setComedyEvent(ComedyEvent comedyEvent);
		public List<ComedyEvent> getComedyEventList();
		public void setComedyEventList(List<ComedyEvent> comedyEventList);
		public boolean hasComedyEvent();

		/**
		 * @see <a href="http://schema.org/ComicCoverArt">http://schema.org/ComicCoverArt</a>
		 */
		public ComicCoverArt getComicCoverArt();
		public void setComicCoverArt(ComicCoverArt comicCoverArt);
		public List<ComicCoverArt> getComicCoverArtList();
		public void setComicCoverArtList(List<ComicCoverArt> comicCoverArtList);
		public boolean hasComicCoverArt();

		/**
		 * @see <a href="http://schema.org/ComicIssue">http://schema.org/ComicIssue</a>
		 */
		public ComicIssue getComicIssue();
		public void setComicIssue(ComicIssue comicIssue);
		public List<ComicIssue> getComicIssueList();
		public void setComicIssueList(List<ComicIssue> comicIssueList);
		public boolean hasComicIssue();

		/**
		 * @see <a href="http://schema.org/ComicSeries">http://schema.org/ComicSeries</a>
		 */
		public ComicSeries getComicSeries();
		public void setComicSeries(ComicSeries comicSeries);
		public List<ComicSeries> getComicSeriesList();
		public void setComicSeriesList(List<ComicSeries> comicSeriesList);
		public boolean hasComicSeries();

		/**
		 * @see <a href="http://schema.org/ComicStory">http://schema.org/ComicStory</a>
		 */
		public ComicStory getComicStory();
		public void setComicStory(ComicStory comicStory);
		public List<ComicStory> getComicStoryList();
		public void setComicStoryList(List<ComicStory> comicStoryList);
		public boolean hasComicStory();

		/**
		 * @see <a href="http://schema.org/Comment">http://schema.org/Comment</a>
		 */
		public Comment getComment();
		public void setComment(Comment comment);
		public List<Comment> getCommentList();
		public void setCommentList(List<Comment> commentList);
		public boolean hasComment();

		/**
		 * @see <a href="http://schema.org/CommentAction">http://schema.org/CommentAction</a>
		 */
		public CommentAction getCommentAction();
		public void setCommentAction(CommentAction commentAction);
		public List<CommentAction> getCommentActionList();
		public void setCommentActionList(List<CommentAction> commentActionList);
		public boolean hasCommentAction();

		/**
		 * @see <a href="http://schema.org/CommunicateAction">http://schema.org/CommunicateAction</a>
		 */
		public CommunicateAction getCommunicateAction();
		public void setCommunicateAction(CommunicateAction communicateAction);
		public List<CommunicateAction> getCommunicateActionList();
		public void setCommunicateActionList(List<CommunicateAction> communicateActionList);
		public boolean hasCommunicateAction();

		/**
		 * @see <a href="http://schema.org/CommunityHealth">http://schema.org/CommunityHealth</a>
		 */
		public CommunityHealth getCommunityHealth();
		public void setCommunityHealth(CommunityHealth communityHealth);
		public List<CommunityHealth> getCommunityHealthList();
		public void setCommunityHealthList(List<CommunityHealth> communityHealthList);
		public boolean hasCommunityHealth();

		/**
		 * @see <a href="http://schema.org/CompleteDataFeed">http://schema.org/CompleteDataFeed</a>
		 */
		public CompleteDataFeed getCompleteDataFeed();
		public void setCompleteDataFeed(CompleteDataFeed completeDataFeed);
		public List<CompleteDataFeed> getCompleteDataFeedList();
		public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList);
		public boolean hasCompleteDataFeed();

		/**
		 * @see <a href="http://schema.org/CompoundPriceSpecification">http://schema.org/CompoundPriceSpecification</a>
		 */
		public CompoundPriceSpecification getCompoundPriceSpecification();
		public void setCompoundPriceSpecification(CompoundPriceSpecification compoundPriceSpecification);
		public List<CompoundPriceSpecification> getCompoundPriceSpecificationList();
		public void setCompoundPriceSpecificationList(List<CompoundPriceSpecification> compoundPriceSpecificationList);
		public boolean hasCompoundPriceSpecification();

		/**
		 * @see <a href="http://schema.org/ComputerLanguage">http://schema.org/ComputerLanguage</a>
		 */
		public ComputerLanguage getComputerLanguage();
		public void setComputerLanguage(ComputerLanguage computerLanguage);
		public List<ComputerLanguage> getComputerLanguageList();
		public void setComputerLanguageList(List<ComputerLanguage> computerLanguageList);
		public boolean hasComputerLanguage();

		/**
		 * @see <a href="http://schema.org/ComputerStore">http://schema.org/ComputerStore</a>
		 */
		public ComputerStore getComputerStore();
		public void setComputerStore(ComputerStore computerStore);
		public List<ComputerStore> getComputerStoreList();
		public void setComputerStoreList(List<ComputerStore> computerStoreList);
		public boolean hasComputerStore();

		/**
		 * @see <a href="http://schema.org/ConfirmAction">http://schema.org/ConfirmAction</a>
		 */
		public ConfirmAction getConfirmAction();
		public void setConfirmAction(ConfirmAction confirmAction);
		public List<ConfirmAction> getConfirmActionList();
		public void setConfirmActionList(List<ConfirmAction> confirmActionList);
		public boolean hasConfirmAction();

		/**
		 * @see <a href="http://schema.org/Consortium">http://schema.org/Consortium</a>
		 */
		public Consortium getConsortium();
		public void setConsortium(Consortium consortium);
		public List<Consortium> getConsortiumList();
		public void setConsortiumList(List<Consortium> consortiumList);
		public boolean hasConsortium();

		/**
		 * @see <a href="http://schema.org/ConsumeAction">http://schema.org/ConsumeAction</a>
		 */
		public ConsumeAction getConsumeAction();
		public void setConsumeAction(ConsumeAction consumeAction);
		public List<ConsumeAction> getConsumeActionList();
		public void setConsumeActionList(List<ConsumeAction> consumeActionList);
		public boolean hasConsumeAction();

		/**
		 * @see <a href="http://schema.org/ContactPage">http://schema.org/ContactPage</a>
		 */
		public ContactPage getContactPage();
		public void setContactPage(ContactPage contactPage);
		public List<ContactPage> getContactPageList();
		public void setContactPageList(List<ContactPage> contactPageList);
		public boolean hasContactPage();

		/**
		 * @see <a href="http://schema.org/ContactPoint">http://schema.org/ContactPoint</a>
		 */
		public ContactPoint getContactPoint();
		public void setContactPoint(ContactPoint contactPoint);
		public List<ContactPoint> getContactPointList();
		public void setContactPointList(List<ContactPoint> contactPointList);
		public boolean hasContactPoint();

		/**
		 * @see <a href="http://schema.org/ContactPointOption">http://schema.org/ContactPointOption</a>
		 */
		public ContactPointOption getContactPointOption();
		public void setContactPointOption(ContactPointOption contactPointOption);
		public List<ContactPointOption> getContactPointOptionList();
		public void setContactPointOptionList(List<ContactPointOption> contactPointOptionList);
		public boolean hasContactPointOption();

		/**
		 * @see <a href="http://schema.org/Continent">http://schema.org/Continent</a>
		 */
		public Continent getContinent();
		public void setContinent(Continent continent);
		public List<Continent> getContinentList();
		public void setContinentList(List<Continent> continentList);
		public boolean hasContinent();

		/**
		 * @see <a href="http://schema.org/ControlAction">http://schema.org/ControlAction</a>
		 */
		public ControlAction getControlAction();
		public void setControlAction(ControlAction controlAction);
		public List<ControlAction> getControlActionList();
		public void setControlActionList(List<ControlAction> controlActionList);
		public boolean hasControlAction();

		/**
		 * @see <a href="http://schema.org/ConvenienceStore">http://schema.org/ConvenienceStore</a>
		 */
		public ConvenienceStore getConvenienceStore();
		public void setConvenienceStore(ConvenienceStore convenienceStore);
		public List<ConvenienceStore> getConvenienceStoreList();
		public void setConvenienceStoreList(List<ConvenienceStore> convenienceStoreList);
		public boolean hasConvenienceStore();

		/**
		 * @see <a href="http://schema.org/Conversation">http://schema.org/Conversation</a>
		 */
		public Conversation getConversation();
		public void setConversation(Conversation conversation);
		public List<Conversation> getConversationList();
		public void setConversationList(List<Conversation> conversationList);
		public boolean hasConversation();

		/**
		 * @see <a href="http://schema.org/CookAction">http://schema.org/CookAction</a>
		 */
		public CookAction getCookAction();
		public void setCookAction(CookAction cookAction);
		public List<CookAction> getCookActionList();
		public void setCookActionList(List<CookAction> cookActionList);
		public boolean hasCookAction();

		/**
		 * @see <a href="http://schema.org/Corporation">http://schema.org/Corporation</a>
		 */
		public Corporation getCorporation();
		public void setCorporation(Corporation corporation);
		public List<Corporation> getCorporationList();
		public void setCorporationList(List<Corporation> corporationList);
		public boolean hasCorporation();

		/**
		 * @see <a href="http://schema.org/CorrectionComment">http://schema.org/CorrectionComment</a>
		 */
		public CorrectionComment getCorrectionComment();
		public void setCorrectionComment(CorrectionComment correctionComment);
		public List<CorrectionComment> getCorrectionCommentList();
		public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList);
		public boolean hasCorrectionComment();

		/**
		 * @see <a href="http://schema.org/Country">http://schema.org/Country</a>
		 */
		public Country getCountry();
		public void setCountry(Country country);
		public List<Country> getCountryList();
		public void setCountryList(List<Country> countryList);
		public boolean hasCountry();

		/**
		 * @see <a href="http://schema.org/Course">http://schema.org/Course</a>
		 */
		public Course getCourse();
		public void setCourse(Course course);
		public List<Course> getCourseList();
		public void setCourseList(List<Course> courseList);
		public boolean hasCourse();

		/**
		 * @see <a href="http://schema.org/CourseInstance">http://schema.org/CourseInstance</a>
		 */
		public CourseInstance getCourseInstance();
		public void setCourseInstance(CourseInstance courseInstance);
		public List<CourseInstance> getCourseInstanceList();
		public void setCourseInstanceList(List<CourseInstance> courseInstanceList);
		public boolean hasCourseInstance();

		/**
		 * @see <a href="http://schema.org/Courthouse">http://schema.org/Courthouse</a>
		 */
		public Courthouse getCourthouse();
		public void setCourthouse(Courthouse courthouse);
		public List<Courthouse> getCourthouseList();
		public void setCourthouseList(List<Courthouse> courthouseList);
		public boolean hasCourthouse();

		/**
		 * @see <a href="http://schema.org/CoverArt">http://schema.org/CoverArt</a>
		 */
		public CoverArt getCoverArt();
		public void setCoverArt(CoverArt coverArt);
		public List<CoverArt> getCoverArtList();
		public void setCoverArtList(List<CoverArt> coverArtList);
		public boolean hasCoverArt();

		/**
		 * @see <a href="http://schema.org/CreateAction">http://schema.org/CreateAction</a>
		 */
		public CreateAction getCreateAction();
		public void setCreateAction(CreateAction createAction);
		public List<CreateAction> getCreateActionList();
		public void setCreateActionList(List<CreateAction> createActionList);
		public boolean hasCreateAction();

		/**
		 * @see <a href="http://schema.org/CreativeWork">http://schema.org/CreativeWork</a>
		 */
		public CreativeWork getCreativeWork();
		public void setCreativeWork(CreativeWork creativeWork);
		public List<CreativeWork> getCreativeWorkList();
		public void setCreativeWorkList(List<CreativeWork> creativeWorkList);
		public boolean hasCreativeWork();

		/**
		 * @see <a href="http://schema.org/CreativeWorkSeason">http://schema.org/CreativeWorkSeason</a>
		 */
		public CreativeWorkSeason getCreativeWorkSeason();
		public void setCreativeWorkSeason(CreativeWorkSeason creativeWorkSeason);
		public List<CreativeWorkSeason> getCreativeWorkSeasonList();
		public void setCreativeWorkSeasonList(List<CreativeWorkSeason> creativeWorkSeasonList);
		public boolean hasCreativeWorkSeason();

		/**
		 * @see <a href="http://schema.org/CreativeWorkSeries">http://schema.org/CreativeWorkSeries</a>
		 */
		public CreativeWorkSeries getCreativeWorkSeries();
		public void setCreativeWorkSeries(CreativeWorkSeries creativeWorkSeries);
		public List<CreativeWorkSeries> getCreativeWorkSeriesList();
		public void setCreativeWorkSeriesList(List<CreativeWorkSeries> creativeWorkSeriesList);
		public boolean hasCreativeWorkSeries();

		/**
		 * @see <a href="http://schema.org/CreditCard">http://schema.org/CreditCard</a>
		 */
		public CreditCard getCreditCard();
		public void setCreditCard(CreditCard creditCard);
		public List<CreditCard> getCreditCardList();
		public void setCreditCardList(List<CreditCard> creditCardList);
		public boolean hasCreditCard();

		/**
		 * @see <a href="http://schema.org/Crematorium">http://schema.org/Crematorium</a>
		 */
		public Crematorium getCrematorium();
		public void setCrematorium(Crematorium crematorium);
		public List<Crematorium> getCrematoriumList();
		public void setCrematoriumList(List<Crematorium> crematoriumList);
		public boolean hasCrematorium();

		/**
		 * @see <a href="http://schema.org/CriticReview">http://schema.org/CriticReview</a>
		 */
		public CriticReview getCriticReview();
		public void setCriticReview(CriticReview criticReview);
		public List<CriticReview> getCriticReviewList();
		public void setCriticReviewList(List<CriticReview> criticReviewList);
		public boolean hasCriticReview();

		/**
		 * @see <a href="http://schema.org/CurrencyConversionService">http://schema.org/CurrencyConversionService</a>
		 */
		public CurrencyConversionService getCurrencyConversionService();
		public void setCurrencyConversionService(CurrencyConversionService currencyConversionService);
		public List<CurrencyConversionService> getCurrencyConversionServiceList();
		public void setCurrencyConversionServiceList(List<CurrencyConversionService> currencyConversionServiceList);
		public boolean hasCurrencyConversionService();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DanceEvent">http://schema.org/DanceEvent</a>
		 */
		public DanceEvent getDanceEvent();
		public void setDanceEvent(DanceEvent danceEvent);
		public List<DanceEvent> getDanceEventList();
		public void setDanceEventList(List<DanceEvent> danceEventList);
		public boolean hasDanceEvent();

		/**
		 * @see <a href="http://schema.org/DanceGroup">http://schema.org/DanceGroup</a>
		 */
		public DanceGroup getDanceGroup();
		public void setDanceGroup(DanceGroup danceGroup);
		public List<DanceGroup> getDanceGroupList();
		public void setDanceGroupList(List<DanceGroup> danceGroupList);
		public boolean hasDanceGroup();

		/**
		 * @see <a href="http://schema.org/DataCatalog">http://schema.org/DataCatalog</a>
		 */
		public DataCatalog getDataCatalog();
		public void setDataCatalog(DataCatalog dataCatalog);
		public List<DataCatalog> getDataCatalogList();
		public void setDataCatalogList(List<DataCatalog> dataCatalogList);
		public boolean hasDataCatalog();

		/**
		 * @see <a href="http://schema.org/DataDownload">http://schema.org/DataDownload</a>
		 */
		public DataDownload getDataDownload();
		public void setDataDownload(DataDownload dataDownload);
		public List<DataDownload> getDataDownloadList();
		public void setDataDownloadList(List<DataDownload> dataDownloadList);
		public boolean hasDataDownload();

		/**
		 * @see <a href="http://schema.org/DataFeed">http://schema.org/DataFeed</a>
		 */
		public DataFeed getDataFeed();
		public void setDataFeed(DataFeed dataFeed);
		public List<DataFeed> getDataFeedList();
		public void setDataFeedList(List<DataFeed> dataFeedList);
		public boolean hasDataFeed();

		/**
		 * @see <a href="http://schema.org/DataFeedItem">http://schema.org/DataFeedItem</a>
		 */
		public DataFeedItem getDataFeedItem();
		public void setDataFeedItem(DataFeedItem dataFeedItem);
		public List<DataFeedItem> getDataFeedItemList();
		public void setDataFeedItemList(List<DataFeedItem> dataFeedItemList);
		public boolean hasDataFeedItem();

		/**
		 * @see <a href="http://schema.org/Dataset">http://schema.org/Dataset</a>
		 */
		public Dataset getDataset();
		public void setDataset(Dataset dataset);
		public List<Dataset> getDatasetList();
		public void setDatasetList(List<Dataset> datasetList);
		public boolean hasDataset();

		/**
		 * @see <a href="http://schema.org/DayOfWeek">http://schema.org/DayOfWeek</a>
		 */
		public DayOfWeek getDayOfWeek();
		public void setDayOfWeek(DayOfWeek dayOfWeek);
		public List<DayOfWeek> getDayOfWeekList();
		public void setDayOfWeekList(List<DayOfWeek> dayOfWeekList);
		public boolean hasDayOfWeek();

		/**
		 * @see <a href="http://schema.org/DaySpa">http://schema.org/DaySpa</a>
		 */
		public DaySpa getDaySpa();
		public void setDaySpa(DaySpa daySpa);
		public List<DaySpa> getDaySpaList();
		public void setDaySpaList(List<DaySpa> daySpaList);
		public boolean hasDaySpa();

		/**
		 * @see <a href="http://schema.org/DeactivateAction">http://schema.org/DeactivateAction</a>
		 */
		public DeactivateAction getDeactivateAction();
		public void setDeactivateAction(DeactivateAction deactivateAction);
		public List<DeactivateAction> getDeactivateActionList();
		public void setDeactivateActionList(List<DeactivateAction> deactivateActionList);
		public boolean hasDeactivateAction();

		/**
		 * @see <a href="http://schema.org/DefenceEstablishment">http://schema.org/DefenceEstablishment</a>
		 */
		public DefenceEstablishment getDefenceEstablishment();
		public void setDefenceEstablishment(DefenceEstablishment defenceEstablishment);
		public List<DefenceEstablishment> getDefenceEstablishmentList();
		public void setDefenceEstablishmentList(List<DefenceEstablishment> defenceEstablishmentList);
		public boolean hasDefenceEstablishment();

		/**
		 * @see <a href="http://schema.org/DefinedTerm">http://schema.org/DefinedTerm</a>
		 */
		public DefinedTerm getDefinedTerm();
		public void setDefinedTerm(DefinedTerm definedTerm);
		public List<DefinedTerm> getDefinedTermList();
		public void setDefinedTermList(List<DefinedTerm> definedTermList);
		public boolean hasDefinedTerm();

		/**
		 * @see <a href="http://schema.org/DefinedTermSet">http://schema.org/DefinedTermSet</a>
		 */
		public DefinedTermSet getDefinedTermSet();
		public void setDefinedTermSet(DefinedTermSet definedTermSet);
		public List<DefinedTermSet> getDefinedTermSetList();
		public void setDefinedTermSetList(List<DefinedTermSet> definedTermSetList);
		public boolean hasDefinedTermSet();

		/**
		 * @see <a href="http://schema.org/DeleteAction">http://schema.org/DeleteAction</a>
		 */
		public DeleteAction getDeleteAction();
		public void setDeleteAction(DeleteAction deleteAction);
		public List<DeleteAction> getDeleteActionList();
		public void setDeleteActionList(List<DeleteAction> deleteActionList);
		public boolean hasDeleteAction();

		/**
		 * @see <a href="http://schema.org/DeliveryChargeSpecification">http://schema.org/DeliveryChargeSpecification</a>
		 */
		public DeliveryChargeSpecification getDeliveryChargeSpecification();
		public void setDeliveryChargeSpecification(DeliveryChargeSpecification deliveryChargeSpecification);
		public List<DeliveryChargeSpecification> getDeliveryChargeSpecificationList();
		public void setDeliveryChargeSpecificationList(List<DeliveryChargeSpecification> deliveryChargeSpecificationList);
		public boolean hasDeliveryChargeSpecification();

		/**
		 * @see <a href="http://schema.org/DeliveryEvent">http://schema.org/DeliveryEvent</a>
		 */
		public DeliveryEvent getDeliveryEvent();
		public void setDeliveryEvent(DeliveryEvent deliveryEvent);
		public List<DeliveryEvent> getDeliveryEventList();
		public void setDeliveryEventList(List<DeliveryEvent> deliveryEventList);
		public boolean hasDeliveryEvent();

		/**
		 * @see <a href="http://schema.org/DeliveryMethod">http://schema.org/DeliveryMethod</a>
		 */
		public DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(DeliveryMethod deliveryMethod);
		public List<DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		/**
		 * @see <a href="http://schema.org/Demand">http://schema.org/Demand</a>
		 */
		public Demand getDemand();
		public void setDemand(Demand demand);
		public List<Demand> getDemandList();
		public void setDemandList(List<Demand> demandList);
		public boolean hasDemand();

		/**
		 * @see <a href="http://schema.org/Dentist">http://schema.org/Dentist</a>
		 */
		public Dentist getDentist();
		public void setDentist(Dentist dentist);
		public List<Dentist> getDentistList();
		public void setDentistList(List<Dentist> dentistList);
		public boolean hasDentist();

		/**
		 * @see <a href="http://schema.org/DepartAction">http://schema.org/DepartAction</a>
		 */
		public DepartAction getDepartAction();
		public void setDepartAction(DepartAction departAction);
		public List<DepartAction> getDepartActionList();
		public void setDepartActionList(List<DepartAction> departActionList);
		public boolean hasDepartAction();

		/**
		 * @see <a href="http://schema.org/DepartmentStore">http://schema.org/DepartmentStore</a>
		 */
		public DepartmentStore getDepartmentStore();
		public void setDepartmentStore(DepartmentStore departmentStore);
		public List<DepartmentStore> getDepartmentStoreList();
		public void setDepartmentStoreList(List<DepartmentStore> departmentStoreList);
		public boolean hasDepartmentStore();

		/**
		 * @see <a href="http://schema.org/DepositAccount">http://schema.org/DepositAccount</a>
		 */
		public DepositAccount getDepositAccount();
		public void setDepositAccount(DepositAccount depositAccount);
		public List<DepositAccount> getDepositAccountList();
		public void setDepositAccountList(List<DepositAccount> depositAccountList);
		public boolean hasDepositAccount();

		/**
		 * @see <a href="http://schema.org/Dermatology">http://schema.org/Dermatology</a>
		 */
		public Dermatology getDermatology();
		public void setDermatology(Dermatology dermatology);
		public List<Dermatology> getDermatologyList();
		public void setDermatologyList(List<Dermatology> dermatologyList);
		public boolean hasDermatology();

		/**
		 * @see <a href="http://schema.org/DiagnosticLab">http://schema.org/DiagnosticLab</a>
		 */
		public Clazz.DiagnosticLab getDiagnosticLab();
		public void setDiagnosticLab(Clazz.DiagnosticLab diagnosticLab);
		public List<Clazz.DiagnosticLab> getDiagnosticLabList();
		public void setDiagnosticLabList(List<Clazz.DiagnosticLab> diagnosticLabList);
		public boolean hasDiagnosticLab();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietNutrition">http://schema.org/DietNutrition</a>
		 */
		public DietNutrition getDietNutrition();
		public void setDietNutrition(DietNutrition dietNutrition);
		public List<DietNutrition> getDietNutritionList();
		public void setDietNutritionList(List<DietNutrition> dietNutritionList);
		public boolean hasDietNutrition();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DigitalDocument">http://schema.org/DigitalDocument</a>
		 */
		public DigitalDocument getDigitalDocument();
		public void setDigitalDocument(DigitalDocument digitalDocument);
		public List<DigitalDocument> getDigitalDocumentList();
		public void setDigitalDocumentList(List<DigitalDocument> digitalDocumentList);
		public boolean hasDigitalDocument();

		/**
		 * @see <a href="http://schema.org/DigitalDocumentPermission">http://schema.org/DigitalDocumentPermission</a>
		 */
		public DigitalDocumentPermission getDigitalDocumentPermission();
		public void setDigitalDocumentPermission(DigitalDocumentPermission digitalDocumentPermission);
		public List<DigitalDocumentPermission> getDigitalDocumentPermissionList();
		public void setDigitalDocumentPermissionList(List<DigitalDocumentPermission> digitalDocumentPermissionList);
		public boolean hasDigitalDocumentPermission();

		/**
		 * @see <a href="http://schema.org/DigitalDocumentPermissionType">http://schema.org/DigitalDocumentPermissionType</a>
		 */
		public DigitalDocumentPermissionType getDigitalDocumentPermissionType();
		public void setDigitalDocumentPermissionType(DigitalDocumentPermissionType digitalDocumentPermissionType);
		public List<DigitalDocumentPermissionType> getDigitalDocumentPermissionTypeList();
		public void setDigitalDocumentPermissionTypeList(List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList);
		public boolean hasDigitalDocumentPermissionType();

		/**
		 * @see <a href="http://schema.org/DisagreeAction">http://schema.org/DisagreeAction</a>
		 */
		public DisagreeAction getDisagreeAction();
		public void setDisagreeAction(DisagreeAction disagreeAction);
		public List<DisagreeAction> getDisagreeActionList();
		public void setDisagreeActionList(List<DisagreeAction> disagreeActionList);
		public boolean hasDisagreeAction();

		/**
		 * @see <a href="http://schema.org/DiscoverAction">http://schema.org/DiscoverAction</a>
		 */
		public DiscoverAction getDiscoverAction();
		public void setDiscoverAction(DiscoverAction discoverAction);
		public List<DiscoverAction> getDiscoverActionList();
		public void setDiscoverActionList(List<DiscoverAction> discoverActionList);
		public boolean hasDiscoverAction();

		/**
		 * @see <a href="http://schema.org/DiscussionForumPosting">http://schema.org/DiscussionForumPosting</a>
		 */
		public DiscussionForumPosting getDiscussionForumPosting();
		public void setDiscussionForumPosting(DiscussionForumPosting discussionForumPosting);
		public List<DiscussionForumPosting> getDiscussionForumPostingList();
		public void setDiscussionForumPostingList(List<DiscussionForumPosting> discussionForumPostingList);
		public boolean hasDiscussionForumPosting();

		/**
		 * @see <a href="http://schema.org/DislikeAction">http://schema.org/DislikeAction</a>
		 */
		public DislikeAction getDislikeAction();
		public void setDislikeAction(DislikeAction dislikeAction);
		public List<DislikeAction> getDislikeActionList();
		public void setDislikeActionList(List<DislikeAction> dislikeActionList);
		public boolean hasDislikeAction();

		/**
		 * @see <a href="http://schema.org/Distance">http://schema.org/Distance</a>
		 */
		public Distance getDistance();
		public void setDistance(Distance distance);
		public List<Distance> getDistanceList();
		public void setDistanceList(List<Distance> distanceList);
		public boolean hasDistance();

		/**
		 * @see <a href="http://schema.org/Distillery">http://schema.org/Distillery</a>
		 */
		public Distillery getDistillery();
		public void setDistillery(Distillery distillery);
		public List<Distillery> getDistilleryList();
		public void setDistilleryList(List<Distillery> distilleryList);
		public boolean hasDistillery();

		/**
		 * @see <a href="http://schema.org/DonateAction">http://schema.org/DonateAction</a>
		 */
		public DonateAction getDonateAction();
		public void setDonateAction(DonateAction donateAction);
		public List<DonateAction> getDonateActionList();
		public void setDonateActionList(List<DonateAction> donateActionList);
		public boolean hasDonateAction();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/DownloadAction">http://schema.org/DownloadAction</a>
		 */
		public DownloadAction getDownloadAction();
		public void setDownloadAction(DownloadAction downloadAction);
		public List<DownloadAction> getDownloadActionList();
		public void setDownloadActionList(List<DownloadAction> downloadActionList);
		public boolean hasDownloadAction();

		/**
		 * @see <a href="http://schema.org/DrawAction">http://schema.org/DrawAction</a>
		 */
		public DrawAction getDrawAction();
		public void setDrawAction(DrawAction drawAction);
		public List<DrawAction> getDrawActionList();
		public void setDrawActionList(List<DrawAction> drawActionList);
		public boolean hasDrawAction();

		/**
		 * @see <a href="http://schema.org/DrinkAction">http://schema.org/DrinkAction</a>
		 */
		public DrinkAction getDrinkAction();
		public void setDrinkAction(DrinkAction drinkAction);
		public List<DrinkAction> getDrinkActionList();
		public void setDrinkActionList(List<DrinkAction> drinkActionList);
		public boolean hasDrinkAction();

		/**
		 * @see <a href="http://schema.org/DriveWheelConfigurationValue">http://schema.org/DriveWheelConfigurationValue</a>
		 */
		public DriveWheelConfigurationValue getDriveWheelConfigurationValue();
		public void setDriveWheelConfigurationValue(DriveWheelConfigurationValue driveWheelConfigurationValue);
		public List<DriveWheelConfigurationValue> getDriveWheelConfigurationValueList();
		public void setDriveWheelConfigurationValueList(List<DriveWheelConfigurationValue> driveWheelConfigurationValueList);
		public boolean hasDriveWheelConfigurationValue();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public Clazz.DrugClass getDrugClass();
		public void setDrugClass(Clazz.DrugClass drugClass);
		public List<Clazz.DrugClass> getDrugClassList();
		public void setDrugClassList(List<Clazz.DrugClass> drugClassList);
		public boolean hasDrugClass();

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public Clazz.DrugCost getDrugCost();
		public void setDrugCost(Clazz.DrugCost drugCost);
		public List<Clazz.DrugCost> getDrugCostList();
		public void setDrugCostList(List<Clazz.DrugCost> drugCostList);
		public boolean hasDrugCost();

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public Clazz.DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(Clazz.DrugCostCategory drugCostCategory);
		public List<Clazz.DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<Clazz.DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public Clazz.DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(Clazz.DrugPregnancyCategory drugPregnancyCategory);
		public List<Clazz.DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<Clazz.DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public Clazz.DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(Clazz.DrugPrescriptionStatus drugPrescriptionStatus);
		public List<Clazz.DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<Clazz.DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/DryCleaningOrLaundry">http://schema.org/DryCleaningOrLaundry</a>
		 */
		public DryCleaningOrLaundry getDryCleaningOrLaundry();
		public void setDryCleaningOrLaundry(DryCleaningOrLaundry dryCleaningOrLaundry);
		public List<DryCleaningOrLaundry> getDryCleaningOrLaundryList();
		public void setDryCleaningOrLaundryList(List<DryCleaningOrLaundry> dryCleaningOrLaundryList);
		public boolean hasDryCleaningOrLaundry();

		/**
		 * @see <a href="http://schema.org/Duration">http://schema.org/Duration</a>
		 */
		public Duration getDuration();
		public void setDuration(Duration duration);
		public List<Duration> getDurationList();
		public void setDurationList(List<Duration> durationList);
		public boolean hasDuration();

		/**
		 * @see <a href="http://schema.org/EatAction">http://schema.org/EatAction</a>
		 */
		public EatAction getEatAction();
		public void setEatAction(EatAction eatAction);
		public List<EatAction> getEatActionList();
		public void setEatActionList(List<EatAction> eatActionList);
		public boolean hasEatAction();

		/**
		 * @see <a href="http://schema.org/EducationEvent">http://schema.org/EducationEvent</a>
		 */
		public EducationEvent getEducationEvent();
		public void setEducationEvent(EducationEvent educationEvent);
		public List<EducationEvent> getEducationEventList();
		public void setEducationEventList(List<EducationEvent> educationEventList);
		public boolean hasEducationEvent();

		/**
		 * @see <a href="http://schema.org/EducationalAudience">http://schema.org/EducationalAudience</a>
		 */
		public EducationalAudience getEducationalAudience();
		public void setEducationalAudience(EducationalAudience educationalAudience);
		public List<EducationalAudience> getEducationalAudienceList();
		public void setEducationalAudienceList(List<EducationalAudience> educationalAudienceList);
		public boolean hasEducationalAudience();

		/**
		 * @see <a href="http://schema.org/EducationalOrganization">http://schema.org/EducationalOrganization</a>
		 */
		public EducationalOrganization getEducationalOrganization();
		public void setEducationalOrganization(EducationalOrganization educationalOrganization);
		public List<EducationalOrganization> getEducationalOrganizationList();
		public void setEducationalOrganizationList(List<EducationalOrganization> educationalOrganizationList);
		public boolean hasEducationalOrganization();

		/**
		 * @see <a href="http://schema.org/Electrician">http://schema.org/Electrician</a>
		 */
		public Electrician getElectrician();
		public void setElectrician(Electrician electrician);
		public List<Electrician> getElectricianList();
		public void setElectricianList(List<Electrician> electricianList);
		public boolean hasElectrician();

		/**
		 * @see <a href="http://schema.org/ElectronicsStore">http://schema.org/ElectronicsStore</a>
		 */
		public ElectronicsStore getElectronicsStore();
		public void setElectronicsStore(ElectronicsStore electronicsStore);
		public List<ElectronicsStore> getElectronicsStoreList();
		public void setElectronicsStoreList(List<ElectronicsStore> electronicsStoreList);
		public boolean hasElectronicsStore();

		/**
		 * @see <a href="http://schema.org/ElementarySchool">http://schema.org/ElementarySchool</a>
		 */
		public ElementarySchool getElementarySchool();
		public void setElementarySchool(ElementarySchool elementarySchool);
		public List<ElementarySchool> getElementarySchoolList();
		public void setElementarySchoolList(List<ElementarySchool> elementarySchoolList);
		public boolean hasElementarySchool();

		/**
		 * @see <a href="http://schema.org/EmailMessage">http://schema.org/EmailMessage</a>
		 */
		public EmailMessage getEmailMessage();
		public void setEmailMessage(EmailMessage emailMessage);
		public List<EmailMessage> getEmailMessageList();
		public void setEmailMessageList(List<EmailMessage> emailMessageList);
		public boolean hasEmailMessage();

		/**
		 * @see <a href="http://schema.org/Embassy">http://schema.org/Embassy</a>
		 */
		public Embassy getEmbassy();
		public void setEmbassy(Embassy embassy);
		public List<Embassy> getEmbassyList();
		public void setEmbassyList(List<Embassy> embassyList);
		public boolean hasEmbassy();

		/**
		 * @see <a href="http://schema.org/Emergency">http://schema.org/Emergency</a>
		 */
		public Emergency getEmergency();
		public void setEmergency(Emergency emergency);
		public List<Emergency> getEmergencyList();
		public void setEmergencyList(List<Emergency> emergencyList);
		public boolean hasEmergency();

		/**
		 * @see <a href="http://schema.org/EmergencyService">http://schema.org/EmergencyService</a>
		 */
		public EmergencyService getEmergencyService();
		public void setEmergencyService(EmergencyService emergencyService);
		public List<EmergencyService> getEmergencyServiceList();
		public void setEmergencyServiceList(List<EmergencyService> emergencyServiceList);
		public boolean hasEmergencyService();

		/**
		 * @see <a href="http://schema.org/EmployeeRole">http://schema.org/EmployeeRole</a>
		 */
		public EmployeeRole getEmployeeRole();
		public void setEmployeeRole(EmployeeRole employeeRole);
		public List<EmployeeRole> getEmployeeRoleList();
		public void setEmployeeRoleList(List<EmployeeRole> employeeRoleList);
		public boolean hasEmployeeRole();

		/**
		 * @see <a href="http://schema.org/EmployerAggregateRating">http://schema.org/EmployerAggregateRating</a>
		 */
		public EmployerAggregateRating getEmployerAggregateRating();
		public void setEmployerAggregateRating(EmployerAggregateRating employerAggregateRating);
		public List<EmployerAggregateRating> getEmployerAggregateRatingList();
		public void setEmployerAggregateRatingList(List<EmployerAggregateRating> employerAggregateRatingList);
		public boolean hasEmployerAggregateRating();

		/**
		 * @see <a href="http://schema.org/EmployerReview">http://schema.org/EmployerReview</a>
		 */
		public EmployerReview getEmployerReview();
		public void setEmployerReview(EmployerReview employerReview);
		public List<EmployerReview> getEmployerReviewList();
		public void setEmployerReviewList(List<EmployerReview> employerReviewList);
		public boolean hasEmployerReview();

		/**
		 * @see <a href="http://schema.org/EmploymentAgency">http://schema.org/EmploymentAgency</a>
		 */
		public EmploymentAgency getEmploymentAgency();
		public void setEmploymentAgency(EmploymentAgency employmentAgency);
		public List<EmploymentAgency> getEmploymentAgencyList();
		public void setEmploymentAgencyList(List<EmploymentAgency> employmentAgencyList);
		public boolean hasEmploymentAgency();

		/**
		 * @see <a href="http://schema.org/EndorseAction">http://schema.org/EndorseAction</a>
		 */
		public EndorseAction getEndorseAction();
		public void setEndorseAction(EndorseAction endorseAction);
		public List<EndorseAction> getEndorseActionList();
		public void setEndorseActionList(List<EndorseAction> endorseActionList);
		public boolean hasEndorseAction();

		/**
		 * @see <a href="http://schema.org/EndorsementRating">http://schema.org/EndorsementRating</a>
		 */
		public EndorsementRating getEndorsementRating();
		public void setEndorsementRating(EndorsementRating endorsementRating);
		public List<EndorsementRating> getEndorsementRatingList();
		public void setEndorsementRatingList(List<EndorsementRating> endorsementRatingList);
		public boolean hasEndorsementRating();

		/**
		 * @see <a href="http://schema.org/Energy">http://schema.org/Energy</a>
		 */
		public Energy getEnergy();
		public void setEnergy(Energy energy);
		public List<Energy> getEnergyList();
		public void setEnergyList(List<Energy> energyList);
		public boolean hasEnergy();

		/**
		 * @see <a href="http://schema.org/EngineSpecification">http://schema.org/EngineSpecification</a>
		 */
		public EngineSpecification getEngineSpecification();
		public void setEngineSpecification(EngineSpecification engineSpecification);
		public List<EngineSpecification> getEngineSpecificationList();
		public void setEngineSpecificationList(List<EngineSpecification> engineSpecificationList);
		public boolean hasEngineSpecification();

		/**
		 * @see <a href="http://schema.org/EntertainmentBusiness">http://schema.org/EntertainmentBusiness</a>
		 */
		public EntertainmentBusiness getEntertainmentBusiness();
		public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness);
		public List<EntertainmentBusiness> getEntertainmentBusinessList();
		public void setEntertainmentBusinessList(List<EntertainmentBusiness> entertainmentBusinessList);
		public boolean hasEntertainmentBusiness();

		/**
		 * @see <a href="http://schema.org/EntryPoint">http://schema.org/EntryPoint</a>
		 */
		public EntryPoint getEntryPoint();
		public void setEntryPoint(EntryPoint entryPoint);
		public List<EntryPoint> getEntryPointList();
		public void setEntryPointList(List<EntryPoint> entryPointList);
		public boolean hasEntryPoint();

		/**
		 * @see <a href="http://schema.org/Enumeration">http://schema.org/Enumeration</a>
		 */
		public Enumeration getEnumeration();
		public void setEnumeration(Enumeration enumeration);
		public List<Enumeration> getEnumerationList();
		public void setEnumerationList(List<Enumeration> enumerationList);
		public boolean hasEnumeration();

		/**
		 * @see <a href="http://schema.org/Episode">http://schema.org/Episode</a>
		 */
		public Episode getEpisode();
		public void setEpisode(Episode episode);
		public List<Episode> getEpisodeList();
		public void setEpisodeList(List<Episode> episodeList);
		public boolean hasEpisode();

		/**
		 * @see <a href="http://schema.org/Event">http://schema.org/Event</a>
		 */
		public Event getEvent();
		public void setEvent(Event event);
		public List<Event> getEventList();
		public void setEventList(List<Event> eventList);
		public boolean hasEvent();

		/**
		 * @see <a href="http://schema.org/EventReservation">http://schema.org/EventReservation</a>
		 */
		public EventReservation getEventReservation();
		public void setEventReservation(EventReservation eventReservation);
		public List<EventReservation> getEventReservationList();
		public void setEventReservationList(List<EventReservation> eventReservationList);
		public boolean hasEventReservation();

		/**
		 * @see <a href="http://schema.org/EventSeries">http://schema.org/EventSeries</a>
		 */
		public EventSeries getEventSeries();
		public void setEventSeries(EventSeries eventSeries);
		public List<EventSeries> getEventSeriesList();
		public void setEventSeriesList(List<EventSeries> eventSeriesList);
		public boolean hasEventSeries();

		/**
		 * @see <a href="http://schema.org/EventStatusType">http://schema.org/EventStatusType</a>
		 */
		public EventStatusType getEventStatusType();
		public void setEventStatusType(EventStatusType eventStatusType);
		public List<EventStatusType> getEventStatusTypeList();
		public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList);
		public boolean hasEventStatusType();

		/**
		 * @see <a href="http://schema.org/EventVenue">http://schema.org/EventVenue</a>
		 */
		public EventVenue getEventVenue();
		public void setEventVenue(EventVenue eventVenue);
		public List<EventVenue> getEventVenueList();
		public void setEventVenueList(List<EventVenue> eventVenueList);
		public boolean hasEventVenue();

		/**
		 * @see <a href="http://schema.org/ExchangeRateSpecification">http://schema.org/ExchangeRateSpecification</a>
		 */
		public ExchangeRateSpecification getExchangeRateSpecification();
		public void setExchangeRateSpecification(ExchangeRateSpecification exchangeRateSpecification);
		public List<ExchangeRateSpecification> getExchangeRateSpecificationList();
		public void setExchangeRateSpecificationList(List<ExchangeRateSpecification> exchangeRateSpecificationList);
		public boolean hasExchangeRateSpecification();

		/**
		 * @see <a href="http://schema.org/ExerciseAction">http://schema.org/ExerciseAction</a>
		 */
		public ExerciseAction getExerciseAction();
		public void setExerciseAction(ExerciseAction exerciseAction);
		public List<ExerciseAction> getExerciseActionList();
		public void setExerciseActionList(List<ExerciseAction> exerciseActionList);
		public boolean hasExerciseAction();

		/**
		 * @see <a href="http://schema.org/ExerciseGym">http://schema.org/ExerciseGym</a>
		 */
		public ExerciseGym getExerciseGym();
		public void setExerciseGym(ExerciseGym exerciseGym);
		public List<ExerciseGym> getExerciseGymList();
		public void setExerciseGymList(List<ExerciseGym> exerciseGymList);
		public boolean hasExerciseGym();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ExhibitionEvent">http://schema.org/ExhibitionEvent</a>
		 */
		public ExhibitionEvent getExhibitionEvent();
		public void setExhibitionEvent(ExhibitionEvent exhibitionEvent);
		public List<ExhibitionEvent> getExhibitionEventList();
		public void setExhibitionEventList(List<ExhibitionEvent> exhibitionEventList);
		public boolean hasExhibitionEvent();

		/**
		 * @see <a href="http://schema.org/FAQPage">http://schema.org/FAQPage</a>
		 */
		public FAQPage getFAQPage();
		public void setFAQPage(FAQPage faqPage);
		public List<FAQPage> getFAQPageList();
		public void setFAQPageList(List<FAQPage> faqPageList);
		public boolean hasFAQPage();

		/**
		 * @see <a href="http://schema.org/FMRadioChannel">http://schema.org/FMRadioChannel</a>
		 */
		public FMRadioChannel getFMRadioChannel();
		public void setFMRadioChannel(FMRadioChannel fmRadioChannel);
		public List<FMRadioChannel> getFMRadioChannelList();
		public void setFMRadioChannelList(List<FMRadioChannel> fmRadioChannelList);
		public boolean hasFMRadioChannel();

		/**
		 * @see <a href="http://schema.org/FastFoodRestaurant">http://schema.org/FastFoodRestaurant</a>
		 */
		public FastFoodRestaurant getFastFoodRestaurant();
		public void setFastFoodRestaurant(FastFoodRestaurant fastFoodRestaurant);
		public List<FastFoodRestaurant> getFastFoodRestaurantList();
		public void setFastFoodRestaurantList(List<FastFoodRestaurant> fastFoodRestaurantList);
		public boolean hasFastFoodRestaurant();

		/**
		 * @see <a href="http://schema.org/Festival">http://schema.org/Festival</a>
		 */
		public Festival getFestival();
		public void setFestival(Festival festival);
		public List<Festival> getFestivalList();
		public void setFestivalList(List<Festival> festivalList);
		public boolean hasFestival();

		/**
		 * @see <a href="http://schema.org/FilmAction">http://schema.org/FilmAction</a>
		 */
		public FilmAction getFilmAction();
		public void setFilmAction(FilmAction filmAction);
		public List<FilmAction> getFilmActionList();
		public void setFilmActionList(List<FilmAction> filmActionList);
		public boolean hasFilmAction();

		/**
		 * @see <a href="http://schema.org/FinancialProduct">http://schema.org/FinancialProduct</a>
		 */
		public FinancialProduct getFinancialProduct();
		public void setFinancialProduct(FinancialProduct financialProduct);
		public List<FinancialProduct> getFinancialProductList();
		public void setFinancialProductList(List<FinancialProduct> financialProductList);
		public boolean hasFinancialProduct();

		/**
		 * @see <a href="http://schema.org/FinancialService">http://schema.org/FinancialService</a>
		 */
		public FinancialService getFinancialService();
		public void setFinancialService(FinancialService financialService);
		public List<FinancialService> getFinancialServiceList();
		public void setFinancialServiceList(List<FinancialService> financialServiceList);
		public boolean hasFinancialService();

		/**
		 * @see <a href="http://schema.org/FindAction">http://schema.org/FindAction</a>
		 */
		public FindAction getFindAction();
		public void setFindAction(FindAction findAction);
		public List<FindAction> getFindActionList();
		public void setFindActionList(List<FindAction> findActionList);
		public boolean hasFindAction();

		/**
		 * @see <a href="http://schema.org/FireStation">http://schema.org/FireStation</a>
		 */
		public FireStation getFireStation();
		public void setFireStation(FireStation fireStation);
		public List<FireStation> getFireStationList();
		public void setFireStationList(List<FireStation> fireStationList);
		public boolean hasFireStation();

		/**
		 * @see <a href="http://schema.org/Flight">http://schema.org/Flight</a>
		 */
		public Flight getFlight();
		public void setFlight(Flight flight);
		public List<Flight> getFlightList();
		public void setFlightList(List<Flight> flightList);
		public boolean hasFlight();

		/**
		 * @see <a href="http://schema.org/FlightReservation">http://schema.org/FlightReservation</a>
		 */
		public FlightReservation getFlightReservation();
		public void setFlightReservation(FlightReservation flightReservation);
		public List<FlightReservation> getFlightReservationList();
		public void setFlightReservationList(List<FlightReservation> flightReservationList);
		public boolean hasFlightReservation();

		/**
		 * @see <a href="http://schema.org/Florist">http://schema.org/Florist</a>
		 */
		public Florist getFlorist();
		public void setFlorist(Florist florist);
		public List<Florist> getFloristList();
		public void setFloristList(List<Florist> floristList);
		public boolean hasFlorist();

		/**
		 * @see <a href="http://schema.org/FollowAction">http://schema.org/FollowAction</a>
		 */
		public FollowAction getFollowAction();
		public void setFollowAction(FollowAction followAction);
		public List<FollowAction> getFollowActionList();
		public void setFollowActionList(List<FollowAction> followActionList);
		public boolean hasFollowAction();

		/**
		 * @see <a href="http://schema.org/FoodEstablishment">http://schema.org/FoodEstablishment</a>
		 */
		public FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(FoodEstablishment foodEstablishment);
		public List<FoodEstablishment> getFoodEstablishmentList();
		public void setFoodEstablishmentList(List<FoodEstablishment> foodEstablishmentList);
		public boolean hasFoodEstablishment();

		/**
		 * @see <a href="http://schema.org/FoodEstablishmentReservation">http://schema.org/FoodEstablishmentReservation</a>
		 */
		public FoodEstablishmentReservation getFoodEstablishmentReservation();
		public void setFoodEstablishmentReservation(FoodEstablishmentReservation foodEstablishmentReservation);
		public List<FoodEstablishmentReservation> getFoodEstablishmentReservationList();
		public void setFoodEstablishmentReservationList(List<FoodEstablishmentReservation> foodEstablishmentReservationList);
		public boolean hasFoodEstablishmentReservation();

		/**
		 * @see <a href="http://schema.org/FoodEvent">http://schema.org/FoodEvent</a>
		 */
		public FoodEvent getFoodEvent();
		public void setFoodEvent(FoodEvent foodEvent);
		public List<FoodEvent> getFoodEventList();
		public void setFoodEventList(List<FoodEvent> foodEventList);
		public boolean hasFoodEvent();

		/**
		 * @see <a href="http://schema.org/FoodService">http://schema.org/FoodService</a>
		 */
		public FoodService getFoodService();
		public void setFoodService(FoodService foodService);
		public List<FoodService> getFoodServiceList();
		public void setFoodServiceList(List<FoodService> foodServiceList);
		public boolean hasFoodService();

		/**
		 * @see <a href="http://schema.org/FurnitureStore">http://schema.org/FurnitureStore</a>
		 */
		public FurnitureStore getFurnitureStore();
		public void setFurnitureStore(FurnitureStore furnitureStore);
		public List<FurnitureStore> getFurnitureStoreList();
		public void setFurnitureStoreList(List<FurnitureStore> furnitureStoreList);
		public boolean hasFurnitureStore();

		/**
		 * @see <a href="http://schema.org/Game">http://schema.org/Game</a>
		 */
		public Game getGame();
		public void setGame(Game game);
		public List<Game> getGameList();
		public void setGameList(List<Game> gameList);
		public boolean hasGame();

		/**
		 * @see <a href="http://schema.org/GamePlayMode">http://schema.org/GamePlayMode</a>
		 */
		public GamePlayMode getGamePlayMode();
		public void setGamePlayMode(GamePlayMode gamePlayMode);
		public List<GamePlayMode> getGamePlayModeList();
		public void setGamePlayModeList(List<GamePlayMode> gamePlayModeList);
		public boolean hasGamePlayMode();

		/**
		 * @see <a href="http://schema.org/GameServer">http://schema.org/GameServer</a>
		 */
		public GameServer getGameServer();
		public void setGameServer(GameServer gameServer);
		public List<GameServer> getGameServerList();
		public void setGameServerList(List<GameServer> gameServerList);
		public boolean hasGameServer();

		/**
		 * @see <a href="http://schema.org/GameServerStatus">http://schema.org/GameServerStatus</a>
		 */
		public GameServerStatus getGameServerStatus();
		public void setGameServerStatus(GameServerStatus gameServerStatus);
		public List<GameServerStatus> getGameServerStatusList();
		public void setGameServerStatusList(List<GameServerStatus> gameServerStatusList);
		public boolean hasGameServerStatus();

		/**
		 * @see <a href="http://schema.org/GardenStore">http://schema.org/GardenStore</a>
		 */
		public GardenStore getGardenStore();
		public void setGardenStore(GardenStore gardenStore);
		public List<GardenStore> getGardenStoreList();
		public void setGardenStoreList(List<GardenStore> gardenStoreList);
		public boolean hasGardenStore();

		/**
		 * @see <a href="http://schema.org/GasStation">http://schema.org/GasStation</a>
		 */
		public GasStation getGasStation();
		public void setGasStation(GasStation gasStation);
		public List<GasStation> getGasStationList();
		public void setGasStationList(List<GasStation> gasStationList);
		public boolean hasGasStation();

		/**
		 * @see <a href="http://schema.org/GatedResidenceCommunity">http://schema.org/GatedResidenceCommunity</a>
		 */
		public GatedResidenceCommunity getGatedResidenceCommunity();
		public void setGatedResidenceCommunity(GatedResidenceCommunity gatedResidenceCommunity);
		public List<GatedResidenceCommunity> getGatedResidenceCommunityList();
		public void setGatedResidenceCommunityList(List<GatedResidenceCommunity> gatedResidenceCommunityList);
		public boolean hasGatedResidenceCommunity();

		/**
		 * @see <a href="http://schema.org/GenderType">http://schema.org/GenderType</a>
		 */
		public GenderType getGenderType();
		public void setGenderType(GenderType genderType);
		public List<GenderType> getGenderTypeList();
		public void setGenderTypeList(List<GenderType> genderTypeList);
		public boolean hasGenderType();

		/**
		 * @see <a href="http://schema.org/GeneralContractor">http://schema.org/GeneralContractor</a>
		 */
		public GeneralContractor getGeneralContractor();
		public void setGeneralContractor(GeneralContractor generalContractor);
		public List<GeneralContractor> getGeneralContractorList();
		public void setGeneralContractorList(List<GeneralContractor> generalContractorList);
		public boolean hasGeneralContractor();

		/**
		 * @see <a href="http://schema.org/GeoCircle">http://schema.org/GeoCircle</a>
		 */
		public GeoCircle getGeoCircle();
		public void setGeoCircle(GeoCircle geoCircle);
		public List<GeoCircle> getGeoCircleList();
		public void setGeoCircleList(List<GeoCircle> geoCircleList);
		public boolean hasGeoCircle();

		/**
		 * @see <a href="http://schema.org/GeoCoordinates">http://schema.org/GeoCoordinates</a>
		 */
		public GeoCoordinates getGeoCoordinates();
		public void setGeoCoordinates(GeoCoordinates geoCoordinates);
		public List<GeoCoordinates> getGeoCoordinatesList();
		public void setGeoCoordinatesList(List<GeoCoordinates> geoCoordinatesList);
		public boolean hasGeoCoordinates();

		/**
		 * @see <a href="http://schema.org/GeoShape">http://schema.org/GeoShape</a>
		 */
		public GeoShape getGeoShape();
		public void setGeoShape(GeoShape geoShape);
		public List<GeoShape> getGeoShapeList();
		public void setGeoShapeList(List<GeoShape> geoShapeList);
		public boolean hasGeoShape();

		/**
		 * @see <a href="http://schema.org/GeospatialGeometry">http://schema.org/GeospatialGeometry</a>
		 */
		public GeospatialGeometry getGeospatialGeometry();
		public void setGeospatialGeometry(GeospatialGeometry geospatialGeometry);
		public List<GeospatialGeometry> getGeospatialGeometryList();
		public void setGeospatialGeometryList(List<GeospatialGeometry> geospatialGeometryList);
		public boolean hasGeospatialGeometry();

		/**
		 * @see <a href="http://schema.org/Geriatric">http://schema.org/Geriatric</a>
		 */
		public Geriatric getGeriatric();
		public void setGeriatric(Geriatric geriatric);
		public List<Geriatric> getGeriatricList();
		public void setGeriatricList(List<Geriatric> geriatricList);
		public boolean hasGeriatric();

		/**
		 * @see <a href="http://schema.org/GiveAction">http://schema.org/GiveAction</a>
		 */
		public GiveAction getGiveAction();
		public void setGiveAction(GiveAction giveAction);
		public List<GiveAction> getGiveActionList();
		public void setGiveActionList(List<GiveAction> giveActionList);
		public boolean hasGiveAction();

		/**
		 * @see <a href="http://schema.org/GolfCourse">http://schema.org/GolfCourse</a>
		 */
		public GolfCourse getGolfCourse();
		public void setGolfCourse(GolfCourse golfCourse);
		public List<GolfCourse> getGolfCourseList();
		public void setGolfCourseList(List<GolfCourse> golfCourseList);
		public boolean hasGolfCourse();

		/**
		 * @see <a href="http://schema.org/GovernmentBuilding">http://schema.org/GovernmentBuilding</a>
		 */
		public GovernmentBuilding getGovernmentBuilding();
		public void setGovernmentBuilding(GovernmentBuilding governmentBuilding);
		public List<GovernmentBuilding> getGovernmentBuildingList();
		public void setGovernmentBuildingList(List<GovernmentBuilding> governmentBuildingList);
		public boolean hasGovernmentBuilding();

		/**
		 * @see <a href="http://schema.org/GovernmentOffice">http://schema.org/GovernmentOffice</a>
		 */
		public GovernmentOffice getGovernmentOffice();
		public void setGovernmentOffice(GovernmentOffice governmentOffice);
		public List<GovernmentOffice> getGovernmentOfficeList();
		public void setGovernmentOfficeList(List<GovernmentOffice> governmentOfficeList);
		public boolean hasGovernmentOffice();

		/**
		 * @see <a href="http://schema.org/GovernmentOrganization">http://schema.org/GovernmentOrganization</a>
		 */
		public GovernmentOrganization getGovernmentOrganization();
		public void setGovernmentOrganization(GovernmentOrganization governmentOrganization);
		public List<GovernmentOrganization> getGovernmentOrganizationList();
		public void setGovernmentOrganizationList(List<GovernmentOrganization> governmentOrganizationList);
		public boolean hasGovernmentOrganization();

		/**
		 * @see <a href="http://schema.org/GovernmentPermit">http://schema.org/GovernmentPermit</a>
		 */
		public GovernmentPermit getGovernmentPermit();
		public void setGovernmentPermit(GovernmentPermit governmentPermit);
		public List<GovernmentPermit> getGovernmentPermitList();
		public void setGovernmentPermitList(List<GovernmentPermit> governmentPermitList);
		public boolean hasGovernmentPermit();

		/**
		 * @see <a href="http://schema.org/GovernmentService">http://schema.org/GovernmentService</a>
		 */
		public GovernmentService getGovernmentService();
		public void setGovernmentService(GovernmentService governmentService);
		public List<GovernmentService> getGovernmentServiceList();
		public void setGovernmentServiceList(List<GovernmentService> governmentServiceList);
		public boolean hasGovernmentService();

		/**
		 * @see <a href="http://schema.org/GroceryStore">http://schema.org/GroceryStore</a>
		 */
		public GroceryStore getGroceryStore();
		public void setGroceryStore(GroceryStore groceryStore);
		public List<GroceryStore> getGroceryStoreList();
		public void setGroceryStoreList(List<GroceryStore> groceryStoreList);
		public boolean hasGroceryStore();

		/**
		 * @see <a href="http://schema.org/Gynecologic">http://schema.org/Gynecologic</a>
		 */
		public Gynecologic getGynecologic();
		public void setGynecologic(Gynecologic gynecologic);
		public List<Gynecologic> getGynecologicList();
		public void setGynecologicList(List<Gynecologic> gynecologicList);
		public boolean hasGynecologic();

		/**
		 * @see <a href="http://schema.org/HVACBusiness">http://schema.org/HVACBusiness</a>
		 */
		public HVACBusiness getHVACBusiness();
		public void setHVACBusiness(HVACBusiness hvacBusiness);
		public List<HVACBusiness> getHVACBusinessList();
		public void setHVACBusinessList(List<HVACBusiness> hvacBusinessList);
		public boolean hasHVACBusiness();

		/**
		 * @see <a href="http://schema.org/HairSalon">http://schema.org/HairSalon</a>
		 */
		public HairSalon getHairSalon();
		public void setHairSalon(HairSalon hairSalon);
		public List<HairSalon> getHairSalonList();
		public void setHairSalonList(List<HairSalon> hairSalonList);
		public boolean hasHairSalon();

		/**
		 * @see <a href="http://schema.org/HardwareStore">http://schema.org/HardwareStore</a>
		 */
		public HardwareStore getHardwareStore();
		public void setHardwareStore(HardwareStore hardwareStore);
		public List<HardwareStore> getHardwareStoreList();
		public void setHardwareStoreList(List<HardwareStore> hardwareStoreList);
		public boolean hasHardwareStore();

		/**
		 * @see <a href="http://schema.org/HealthAndBeautyBusiness">http://schema.org/HealthAndBeautyBusiness</a>
		 */
		public HealthAndBeautyBusiness getHealthAndBeautyBusiness();
		public void setHealthAndBeautyBusiness(HealthAndBeautyBusiness healthAndBeautyBusiness);
		public List<HealthAndBeautyBusiness> getHealthAndBeautyBusinessList();
		public void setHealthAndBeautyBusinessList(List<HealthAndBeautyBusiness> healthAndBeautyBusinessList);
		public boolean hasHealthAndBeautyBusiness();

		/**
		 * @see <a href="http://schema.org/HealthClub">http://schema.org/HealthClub</a>
		 */
		public HealthClub getHealthClub();
		public void setHealthClub(HealthClub healthClub);
		public List<HealthClub> getHealthClubList();
		public void setHealthClubList(List<HealthClub> healthClubList);
		public boolean hasHealthClub();

		/**
		 * @see <a href="http://schema.org/HealthInsurancePlan">http://schema.org/HealthInsurancePlan</a>
		 */
		public HealthInsurancePlan getHealthInsurancePlan();
		public void setHealthInsurancePlan(HealthInsurancePlan healthInsurancePlan);
		public List<HealthInsurancePlan> getHealthInsurancePlanList();
		public void setHealthInsurancePlanList(List<HealthInsurancePlan> healthInsurancePlanList);
		public boolean hasHealthInsurancePlan();

		/**
		 * @see <a href="http://schema.org/HealthPlanCostSharingSpecification">http://schema.org/HealthPlanCostSharingSpecification</a>
		 */
		public HealthPlanCostSharingSpecification getHealthPlanCostSharingSpecification();
		public void setHealthPlanCostSharingSpecification(HealthPlanCostSharingSpecification healthPlanCostSharingSpecification);
		public List<HealthPlanCostSharingSpecification> getHealthPlanCostSharingSpecificationList();
		public void setHealthPlanCostSharingSpecificationList(List<HealthPlanCostSharingSpecification> healthPlanCostSharingSpecificationList);
		public boolean hasHealthPlanCostSharingSpecification();

		/**
		 * @see <a href="http://schema.org/HealthPlanFormulary">http://schema.org/HealthPlanFormulary</a>
		 */
		public HealthPlanFormulary getHealthPlanFormulary();
		public void setHealthPlanFormulary(HealthPlanFormulary healthPlanFormulary);
		public List<HealthPlanFormulary> getHealthPlanFormularyList();
		public void setHealthPlanFormularyList(List<HealthPlanFormulary> healthPlanFormularyList);
		public boolean hasHealthPlanFormulary();

		/**
		 * @see <a href="http://schema.org/HealthPlanNetwork">http://schema.org/HealthPlanNetwork</a>
		 */
		public HealthPlanNetwork getHealthPlanNetwork();
		public void setHealthPlanNetwork(HealthPlanNetwork healthPlanNetwork);
		public List<HealthPlanNetwork> getHealthPlanNetworkList();
		public void setHealthPlanNetworkList(List<HealthPlanNetwork> healthPlanNetworkList);
		public boolean hasHealthPlanNetwork();

		/**
		 * @see <a href="http://schema.org/HighSchool">http://schema.org/HighSchool</a>
		 */
		public HighSchool getHighSchool();
		public void setHighSchool(HighSchool highSchool);
		public List<HighSchool> getHighSchoolList();
		public void setHighSchoolList(List<HighSchool> highSchoolList);
		public boolean hasHighSchool();

		/**
		 * @see <a href="http://schema.org/HinduTemple">http://schema.org/HinduTemple</a>
		 */
		public HinduTemple getHinduTemple();
		public void setHinduTemple(HinduTemple hinduTemple);
		public List<HinduTemple> getHinduTempleList();
		public void setHinduTempleList(List<HinduTemple> hinduTempleList);
		public boolean hasHinduTemple();

		/**
		 * @see <a href="http://schema.org/HobbyShop">http://schema.org/HobbyShop</a>
		 */
		public HobbyShop getHobbyShop();
		public void setHobbyShop(HobbyShop hobbyShop);
		public List<HobbyShop> getHobbyShopList();
		public void setHobbyShopList(List<HobbyShop> hobbyShopList);
		public boolean hasHobbyShop();

		/**
		 * @see <a href="http://schema.org/HomeAndConstructionBusiness">http://schema.org/HomeAndConstructionBusiness</a>
		 */
		public HomeAndConstructionBusiness getHomeAndConstructionBusiness();
		public void setHomeAndConstructionBusiness(HomeAndConstructionBusiness homeAndConstructionBusiness);
		public List<HomeAndConstructionBusiness> getHomeAndConstructionBusinessList();
		public void setHomeAndConstructionBusinessList(List<HomeAndConstructionBusiness> homeAndConstructionBusinessList);
		public boolean hasHomeAndConstructionBusiness();

		/**
		 * @see <a href="http://schema.org/HomeGoodsStore">http://schema.org/HomeGoodsStore</a>
		 */
		public HomeGoodsStore getHomeGoodsStore();
		public void setHomeGoodsStore(HomeGoodsStore homeGoodsStore);
		public List<HomeGoodsStore> getHomeGoodsStoreList();
		public void setHomeGoodsStoreList(List<HomeGoodsStore> homeGoodsStoreList);
		public boolean hasHomeGoodsStore();

		/**
		 * @see <a href="http://schema.org/Hospital">http://schema.org/Hospital</a>
		 */
		public Hospital getHospital();
		public void setHospital(Hospital hospital);
		public List<Hospital> getHospitalList();
		public void setHospitalList(List<Hospital> hospitalList);
		public boolean hasHospital();

		/**
		 * @see <a href="http://schema.org/Hostel">http://schema.org/Hostel</a>
		 */
		public Hostel getHostel();
		public void setHostel(Hostel hostel);
		public List<Hostel> getHostelList();
		public void setHostelList(List<Hostel> hostelList);
		public boolean hasHostel();

		/**
		 * @see <a href="http://schema.org/Hotel">http://schema.org/Hotel</a>
		 */
		public Hotel getHotel();
		public void setHotel(Hotel hotel);
		public List<Hotel> getHotelList();
		public void setHotelList(List<Hotel> hotelList);
		public boolean hasHotel();

		/**
		 * @see <a href="http://schema.org/HotelRoom">http://schema.org/HotelRoom</a>
		 */
		public HotelRoom getHotelRoom();
		public void setHotelRoom(HotelRoom hotelRoom);
		public List<HotelRoom> getHotelRoomList();
		public void setHotelRoomList(List<HotelRoom> hotelRoomList);
		public boolean hasHotelRoom();

		/**
		 * @see <a href="http://schema.org/House">http://schema.org/House</a>
		 */
		public House getHouse();
		public void setHouse(House house);
		public List<House> getHouseList();
		public void setHouseList(List<House> houseList);
		public boolean hasHouse();

		/**
		 * @see <a href="http://schema.org/HousePainter">http://schema.org/HousePainter</a>
		 */
		public HousePainter getHousePainter();
		public void setHousePainter(HousePainter housePainter);
		public List<HousePainter> getHousePainterList();
		public void setHousePainterList(List<HousePainter> housePainterList);
		public boolean hasHousePainter();

		/**
		 * @see <a href="http://schema.org/HowTo">http://schema.org/HowTo</a>
		 */
		public HowTo getHowTo();
		public void setHowTo(HowTo howTo);
		public List<HowTo> getHowToList();
		public void setHowToList(List<HowTo> howToList);
		public boolean hasHowTo();

		/**
		 * @see <a href="http://schema.org/HowToDirection">http://schema.org/HowToDirection</a>
		 */
		public HowToDirection getHowToDirection();
		public void setHowToDirection(HowToDirection howToDirection);
		public List<HowToDirection> getHowToDirectionList();
		public void setHowToDirectionList(List<HowToDirection> howToDirectionList);
		public boolean hasHowToDirection();

		/**
		 * @see <a href="http://schema.org/HowToItem">http://schema.org/HowToItem</a>
		 */
		public HowToItem getHowToItem();
		public void setHowToItem(HowToItem howToItem);
		public List<HowToItem> getHowToItemList();
		public void setHowToItemList(List<HowToItem> howToItemList);
		public boolean hasHowToItem();

		/**
		 * @see <a href="http://schema.org/HowToSection">http://schema.org/HowToSection</a>
		 */
		public HowToSection getHowToSection();
		public void setHowToSection(HowToSection howToSection);
		public List<HowToSection> getHowToSectionList();
		public void setHowToSectionList(List<HowToSection> howToSectionList);
		public boolean hasHowToSection();

		/**
		 * @see <a href="http://schema.org/HowToStep">http://schema.org/HowToStep</a>
		 */
		public HowToStep getHowToStep();
		public void setHowToStep(HowToStep howToStep);
		public List<HowToStep> getHowToStepList();
		public void setHowToStepList(List<HowToStep> howToStepList);
		public boolean hasHowToStep();

		/**
		 * @see <a href="http://schema.org/HowToSupply">http://schema.org/HowToSupply</a>
		 */
		public HowToSupply getHowToSupply();
		public void setHowToSupply(HowToSupply howToSupply);
		public List<HowToSupply> getHowToSupplyList();
		public void setHowToSupplyList(List<HowToSupply> howToSupplyList);
		public boolean hasHowToSupply();

		/**
		 * @see <a href="http://schema.org/HowToTip">http://schema.org/HowToTip</a>
		 */
		public HowToTip getHowToTip();
		public void setHowToTip(HowToTip howToTip);
		public List<HowToTip> getHowToTipList();
		public void setHowToTipList(List<HowToTip> howToTipList);
		public boolean hasHowToTip();

		/**
		 * @see <a href="http://schema.org/HowToTool">http://schema.org/HowToTool</a>
		 */
		public HowToTool getHowToTool();
		public void setHowToTool(HowToTool howToTool);
		public List<HowToTool> getHowToToolList();
		public void setHowToToolList(List<HowToTool> howToToolList);
		public boolean hasHowToTool();

		/**
		 * @see <a href="http://schema.org/IceCreamShop">http://schema.org/IceCreamShop</a>
		 */
		public IceCreamShop getIceCreamShop();
		public void setIceCreamShop(IceCreamShop iceCreamShop);
		public List<IceCreamShop> getIceCreamShopList();
		public void setIceCreamShopList(List<IceCreamShop> iceCreamShopList);
		public boolean hasIceCreamShop();

		/**
		 * @see <a href="http://schema.org/IgnoreAction">http://schema.org/IgnoreAction</a>
		 */
		public IgnoreAction getIgnoreAction();
		public void setIgnoreAction(IgnoreAction ignoreAction);
		public List<IgnoreAction> getIgnoreActionList();
		public void setIgnoreActionList(List<IgnoreAction> ignoreActionList);
		public boolean hasIgnoreAction();

		/**
		 * @see <a href="http://schema.org/ImageGallery">http://schema.org/ImageGallery</a>
		 */
		public ImageGallery getImageGallery();
		public void setImageGallery(ImageGallery imageGallery);
		public List<ImageGallery> getImageGalleryList();
		public void setImageGalleryList(List<ImageGallery> imageGalleryList);
		public boolean hasImageGallery();

		/**
		 * @see <a href="http://schema.org/ImageObject">http://schema.org/ImageObject</a>
		 */
		public ImageObject getImageObject();
		public void setImageObject(ImageObject imageObject);
		public List<ImageObject> getImageObjectList();
		public void setImageObjectList(List<ImageObject> imageObjectList);
		public boolean hasImageObject();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/IndividualProduct">http://schema.org/IndividualProduct</a>
		 */
		public IndividualProduct getIndividualProduct();
		public void setIndividualProduct(IndividualProduct individualProduct);
		public List<IndividualProduct> getIndividualProductList();
		public void setIndividualProductList(List<IndividualProduct> individualProductList);
		public boolean hasIndividualProduct();

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public Clazz.InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(Clazz.InfectiousAgentClass infectiousAgentClass);
		public List<Clazz.InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<Clazz.InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/InformAction">http://schema.org/InformAction</a>
		 */
		public InformAction getInformAction();
		public void setInformAction(InformAction informAction);
		public List<InformAction> getInformActionList();
		public void setInformActionList(List<InformAction> informActionList);
		public boolean hasInformAction();

		/**
		 * @see <a href="http://schema.org/InsertAction">http://schema.org/InsertAction</a>
		 */
		public InsertAction getInsertAction();
		public void setInsertAction(InsertAction insertAction);
		public List<InsertAction> getInsertActionList();
		public void setInsertActionList(List<InsertAction> insertActionList);
		public boolean hasInsertAction();

		/**
		 * @see <a href="http://schema.org/InstallAction">http://schema.org/InstallAction</a>
		 */
		public InstallAction getInstallAction();
		public void setInstallAction(InstallAction installAction);
		public List<InstallAction> getInstallActionList();
		public void setInstallActionList(List<InstallAction> installActionList);
		public boolean hasInstallAction();

		/**
		 * @see <a href="http://schema.org/InsuranceAgency">http://schema.org/InsuranceAgency</a>
		 */
		public InsuranceAgency getInsuranceAgency();
		public void setInsuranceAgency(InsuranceAgency insuranceAgency);
		public List<InsuranceAgency> getInsuranceAgencyList();
		public void setInsuranceAgencyList(List<InsuranceAgency> insuranceAgencyList);
		public boolean hasInsuranceAgency();

		/**
		 * @see <a href="http://schema.org/Intangible">http://schema.org/Intangible</a>
		 */
		public Intangible getIntangible();
		public void setIntangible(Intangible intangible);
		public List<Intangible> getIntangibleList();
		public void setIntangibleList(List<Intangible> intangibleList);
		public boolean hasIntangible();

		/**
		 * @see <a href="http://schema.org/InteractAction">http://schema.org/InteractAction</a>
		 */
		public InteractAction getInteractAction();
		public void setInteractAction(InteractAction interactAction);
		public List<InteractAction> getInteractActionList();
		public void setInteractActionList(List<InteractAction> interactActionList);
		public boolean hasInteractAction();

		/**
		 * @see <a href="http://schema.org/InteractionCounter">http://schema.org/InteractionCounter</a>
		 */
		public InteractionCounter getInteractionCounter();
		public void setInteractionCounter(InteractionCounter interactionCounter);
		public List<InteractionCounter> getInteractionCounterList();
		public void setInteractionCounterList(List<InteractionCounter> interactionCounterList);
		public boolean hasInteractionCounter();

		/**
		 * @see <a href="http://schema.org/InternetCafe">http://schema.org/InternetCafe</a>
		 */
		public InternetCafe getInternetCafe();
		public void setInternetCafe(InternetCafe internetCafe);
		public List<InternetCafe> getInternetCafeList();
		public void setInternetCafeList(List<InternetCafe> internetCafeList);
		public boolean hasInternetCafe();

		/**
		 * @see <a href="http://schema.org/InvestmentFund">http://schema.org/InvestmentFund</a>
		 */
		public InvestmentFund getInvestmentFund();
		public void setInvestmentFund(InvestmentFund investmentFund);
		public List<InvestmentFund> getInvestmentFundList();
		public void setInvestmentFundList(List<InvestmentFund> investmentFundList);
		public boolean hasInvestmentFund();

		/**
		 * @see <a href="http://schema.org/InvestmentOrDeposit">http://schema.org/InvestmentOrDeposit</a>
		 */
		public InvestmentOrDeposit getInvestmentOrDeposit();
		public void setInvestmentOrDeposit(InvestmentOrDeposit investmentOrDeposit);
		public List<InvestmentOrDeposit> getInvestmentOrDepositList();
		public void setInvestmentOrDepositList(List<InvestmentOrDeposit> investmentOrDepositList);
		public boolean hasInvestmentOrDeposit();

		/**
		 * @see <a href="http://schema.org/InviteAction">http://schema.org/InviteAction</a>
		 */
		public InviteAction getInviteAction();
		public void setInviteAction(InviteAction inviteAction);
		public List<InviteAction> getInviteActionList();
		public void setInviteActionList(List<InviteAction> inviteActionList);
		public boolean hasInviteAction();

		/**
		 * @see <a href="http://schema.org/Invoice">http://schema.org/Invoice</a>
		 */
		public Invoice getInvoice();
		public void setInvoice(Invoice invoice);
		public List<Invoice> getInvoiceList();
		public void setInvoiceList(List<Invoice> invoiceList);
		public boolean hasInvoice();

		/**
		 * @see <a href="http://schema.org/ItemAvailability">http://schema.org/ItemAvailability</a>
		 */
		public ItemAvailability getItemAvailability();
		public void setItemAvailability(ItemAvailability itemAvailability);
		public List<ItemAvailability> getItemAvailabilityList();
		public void setItemAvailabilityList(List<ItemAvailability> itemAvailabilityList);
		public boolean hasItemAvailability();

		/**
		 * @see <a href="http://schema.org/ItemList">http://schema.org/ItemList</a>
		 */
		public ItemList getItemList();
		public void setItemList(ItemList itemList);
		public List<ItemList> getItemListList();
		public void setItemListList(List<ItemList> itemListList);
		public boolean hasItemList();

		/**
		 * @see <a href="http://schema.org/ItemListOrderType">http://schema.org/ItemListOrderType</a>
		 */
		public ItemListOrderType getItemListOrderType();
		public void setItemListOrderType(ItemListOrderType itemListOrderType);
		public List<ItemListOrderType> getItemListOrderTypeList();
		public void setItemListOrderTypeList(List<ItemListOrderType> itemListOrderTypeList);
		public boolean hasItemListOrderType();

		/**
		 * @see <a href="http://schema.org/ItemPage">http://schema.org/ItemPage</a>
		 */
		public ItemPage getItemPage();
		public void setItemPage(ItemPage itemPage);
		public List<ItemPage> getItemPageList();
		public void setItemPageList(List<ItemPage> itemPageList);
		public boolean hasItemPage();

		/**
		 * @see <a href="http://schema.org/JewelryStore">http://schema.org/JewelryStore</a>
		 */
		public JewelryStore getJewelryStore();
		public void setJewelryStore(JewelryStore jewelryStore);
		public List<JewelryStore> getJewelryStoreList();
		public void setJewelryStoreList(List<JewelryStore> jewelryStoreList);
		public boolean hasJewelryStore();

		/**
		 * @see <a href="http://schema.org/JobPosting">http://schema.org/JobPosting</a>
		 */
		public JobPosting getJobPosting();
		public void setJobPosting(JobPosting jobPosting);
		public List<JobPosting> getJobPostingList();
		public void setJobPostingList(List<JobPosting> jobPostingList);
		public boolean hasJobPosting();

		/**
		 * @see <a href="http://schema.org/JoinAction">http://schema.org/JoinAction</a>
		 */
		public JoinAction getJoinAction();
		public void setJoinAction(JoinAction joinAction);
		public List<JoinAction> getJoinActionList();
		public void setJoinActionList(List<JoinAction> joinActionList);
		public boolean hasJoinAction();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LakeBodyOfWater">http://schema.org/LakeBodyOfWater</a>
		 */
		public LakeBodyOfWater getLakeBodyOfWater();
		public void setLakeBodyOfWater(LakeBodyOfWater lakeBodyOfWater);
		public List<LakeBodyOfWater> getLakeBodyOfWaterList();
		public void setLakeBodyOfWaterList(List<LakeBodyOfWater> lakeBodyOfWaterList);
		public boolean hasLakeBodyOfWater();

		/**
		 * @see <a href="http://schema.org/Landform">http://schema.org/Landform</a>
		 */
		public Landform getLandform();
		public void setLandform(Landform landform);
		public List<Landform> getLandformList();
		public void setLandformList(List<Landform> landformList);
		public boolean hasLandform();

		/**
		 * @see <a href="http://schema.org/LandmarksOrHistoricalBuildings">http://schema.org/LandmarksOrHistoricalBuildings</a>
		 */
		public LandmarksOrHistoricalBuildings getLandmarksOrHistoricalBuildings();
		public void setLandmarksOrHistoricalBuildings(LandmarksOrHistoricalBuildings landmarksOrHistoricalBuildings);
		public List<LandmarksOrHistoricalBuildings> getLandmarksOrHistoricalBuildingsList();
		public void setLandmarksOrHistoricalBuildingsList(List<LandmarksOrHistoricalBuildings> landmarksOrHistoricalBuildingsList);
		public boolean hasLandmarksOrHistoricalBuildings();

		/**
		 * @see <a href="http://schema.org/Language">http://schema.org/Language</a>
		 */
		public Language getLanguage();
		public void setLanguage(Language language);
		public List<Language> getLanguageList();
		public void setLanguageList(List<Language> languageList);
		public boolean hasLanguage();

		/**
		 * @see <a href="http://schema.org/LeaveAction">http://schema.org/LeaveAction</a>
		 */
		public LeaveAction getLeaveAction();
		public void setLeaveAction(LeaveAction leaveAction);
		public List<LeaveAction> getLeaveActionList();
		public void setLeaveActionList(List<LeaveAction> leaveActionList);
		public boolean hasLeaveAction();

		/**
		 * @see <a href="http://schema.org/LegalForceStatus">http://schema.org/LegalForceStatus</a>
		 */
		public LegalForceStatus getLegalForceStatus();
		public void setLegalForceStatus(LegalForceStatus legalForceStatus);
		public List<LegalForceStatus> getLegalForceStatusList();
		public void setLegalForceStatusList(List<LegalForceStatus> legalForceStatusList);
		public boolean hasLegalForceStatus();

		/**
		 * @see <a href="http://schema.org/LegalService">http://schema.org/LegalService</a>
		 */
		public LegalService getLegalService();
		public void setLegalService(LegalService legalService);
		public List<LegalService> getLegalServiceList();
		public void setLegalServiceList(List<LegalService> legalServiceList);
		public boolean hasLegalService();

		/**
		 * @see <a href="http://schema.org/LegalValueLevel">http://schema.org/LegalValueLevel</a>
		 */
		public LegalValueLevel getLegalValueLevel();
		public void setLegalValueLevel(LegalValueLevel legalValueLevel);
		public List<LegalValueLevel> getLegalValueLevelList();
		public void setLegalValueLevelList(List<LegalValueLevel> legalValueLevelList);
		public boolean hasLegalValueLevel();

		/**
		 * @see <a href="http://schema.org/Legislation">http://schema.org/Legislation</a>
		 */
		public Legislation getLegislation();
		public void setLegislation(Legislation legislation);
		public List<Legislation> getLegislationList();
		public void setLegislationList(List<Legislation> legislationList);
		public boolean hasLegislation();

		/**
		 * @see <a href="http://schema.org/LegislationObject">http://schema.org/LegislationObject</a>
		 */
		public LegislationObject getLegislationObject();
		public void setLegislationObject(LegislationObject legislationObject);
		public List<LegislationObject> getLegislationObjectList();
		public void setLegislationObjectList(List<LegislationObject> legislationObjectList);
		public boolean hasLegislationObject();

		/**
		 * @see <a href="http://schema.org/LegislativeBuilding">http://schema.org/LegislativeBuilding</a>
		 */
		public LegislativeBuilding getLegislativeBuilding();
		public void setLegislativeBuilding(LegislativeBuilding legislativeBuilding);
		public List<LegislativeBuilding> getLegislativeBuildingList();
		public void setLegislativeBuildingList(List<LegislativeBuilding> legislativeBuildingList);
		public boolean hasLegislativeBuilding();

		/**
		 * @see <a href="http://schema.org/LendAction">http://schema.org/LendAction</a>
		 */
		public LendAction getLendAction();
		public void setLendAction(LendAction lendAction);
		public List<LendAction> getLendActionList();
		public void setLendActionList(List<LendAction> lendActionList);
		public boolean hasLendAction();

		/**
		 * @see <a href="http://schema.org/Library">http://schema.org/Library</a>
		 */
		public Library getLibrary();
		public void setLibrary(Library library);
		public List<Library> getLibraryList();
		public void setLibraryList(List<Library> libraryList);
		public boolean hasLibrary();

		/**
		 * @see <a href="http://schema.org/LibrarySystem">http://schema.org/LibrarySystem</a>
		 */
		public LibrarySystem getLibrarySystem();
		public void setLibrarySystem(LibrarySystem librarySystem);
		public List<LibrarySystem> getLibrarySystemList();
		public void setLibrarySystemList(List<LibrarySystem> librarySystemList);
		public boolean hasLibrarySystem();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LikeAction">http://schema.org/LikeAction</a>
		 */
		public LikeAction getLikeAction();
		public void setLikeAction(LikeAction likeAction);
		public List<LikeAction> getLikeActionList();
		public void setLikeActionList(List<LikeAction> likeActionList);
		public boolean hasLikeAction();

		/**
		 * @see <a href="http://schema.org/LinkRole">http://schema.org/LinkRole</a>
		 */
		public LinkRole getLinkRole();
		public void setLinkRole(LinkRole linkRole);
		public List<LinkRole> getLinkRoleList();
		public void setLinkRoleList(List<LinkRole> linkRoleList);
		public boolean hasLinkRole();

		/**
		 * @see <a href="http://schema.org/LiquorStore">http://schema.org/LiquorStore</a>
		 */
		public LiquorStore getLiquorStore();
		public void setLiquorStore(LiquorStore liquorStore);
		public List<LiquorStore> getLiquorStoreList();
		public void setLiquorStoreList(List<LiquorStore> liquorStoreList);
		public boolean hasLiquorStore();

		/**
		 * @see <a href="http://schema.org/ListItem">http://schema.org/ListItem</a>
		 */
		public ListItem getListItem();
		public void setListItem(ListItem listItem);
		public List<ListItem> getListItemList();
		public void setListItemList(List<ListItem> listItemList);
		public boolean hasListItem();

		/**
		 * @see <a href="http://schema.org/ListenAction">http://schema.org/ListenAction</a>
		 */
		public ListenAction getListenAction();
		public void setListenAction(ListenAction listenAction);
		public List<ListenAction> getListenActionList();
		public void setListenActionList(List<ListenAction> listenActionList);
		public boolean hasListenAction();

		/**
		 * @see <a href="http://schema.org/LiteraryEvent">http://schema.org/LiteraryEvent</a>
		 */
		public LiteraryEvent getLiteraryEvent();
		public void setLiteraryEvent(LiteraryEvent literaryEvent);
		public List<LiteraryEvent> getLiteraryEventList();
		public void setLiteraryEventList(List<LiteraryEvent> literaryEventList);
		public boolean hasLiteraryEvent();

		/**
		 * @see <a href="http://schema.org/LiveBlogPosting">http://schema.org/LiveBlogPosting</a>
		 */
		public LiveBlogPosting getLiveBlogPosting();
		public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting);
		public List<LiveBlogPosting> getLiveBlogPostingList();
		public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList);
		public boolean hasLiveBlogPosting();

		/**
		 * @see <a href="http://schema.org/LoanOrCredit">http://schema.org/LoanOrCredit</a>
		 */
		public LoanOrCredit getLoanOrCredit();
		public void setLoanOrCredit(LoanOrCredit loanOrCredit);
		public List<LoanOrCredit> getLoanOrCreditList();
		public void setLoanOrCreditList(List<LoanOrCredit> loanOrCreditList);
		public boolean hasLoanOrCredit();

		/**
		 * @see <a href="http://schema.org/LocalBusiness">http://schema.org/LocalBusiness</a>
		 */
		public LocalBusiness getLocalBusiness();
		public void setLocalBusiness(LocalBusiness localBusiness);
		public List<LocalBusiness> getLocalBusinessList();
		public void setLocalBusinessList(List<LocalBusiness> localBusinessList);
		public boolean hasLocalBusiness();

		/**
		 * @see <a href="http://schema.org/LocationFeatureSpecification">http://schema.org/LocationFeatureSpecification</a>
		 */
		public LocationFeatureSpecification getLocationFeatureSpecification();
		public void setLocationFeatureSpecification(LocationFeatureSpecification locationFeatureSpecification);
		public List<LocationFeatureSpecification> getLocationFeatureSpecificationList();
		public void setLocationFeatureSpecificationList(List<LocationFeatureSpecification> locationFeatureSpecificationList);
		public boolean hasLocationFeatureSpecification();

		/**
		 * @see <a href="http://schema.org/LockerDelivery">http://schema.org/LockerDelivery</a>
		 */
		public LockerDelivery getLockerDelivery();
		public void setLockerDelivery(LockerDelivery lockerDelivery);
		public List<LockerDelivery> getLockerDeliveryList();
		public void setLockerDeliveryList(List<LockerDelivery> lockerDeliveryList);
		public boolean hasLockerDelivery();

		/**
		 * @see <a href="http://schema.org/Locksmith">http://schema.org/Locksmith</a>
		 */
		public Locksmith getLocksmith();
		public void setLocksmith(Locksmith locksmith);
		public List<Locksmith> getLocksmithList();
		public void setLocksmithList(List<Locksmith> locksmithList);
		public boolean hasLocksmith();

		/**
		 * @see <a href="http://schema.org/LodgingBusiness">http://schema.org/LodgingBusiness</a>
		 */
		public LodgingBusiness getLodgingBusiness();
		public void setLodgingBusiness(LodgingBusiness lodgingBusiness);
		public List<LodgingBusiness> getLodgingBusinessList();
		public void setLodgingBusinessList(List<LodgingBusiness> lodgingBusinessList);
		public boolean hasLodgingBusiness();

		/**
		 * @see <a href="http://schema.org/LodgingReservation">http://schema.org/LodgingReservation</a>
		 */
		public LodgingReservation getLodgingReservation();
		public void setLodgingReservation(LodgingReservation lodgingReservation);
		public List<LodgingReservation> getLodgingReservationList();
		public void setLodgingReservationList(List<LodgingReservation> lodgingReservationList);
		public boolean hasLodgingReservation();

		/**
		 * @see <a href="http://schema.org/LoseAction">http://schema.org/LoseAction</a>
		 */
		public LoseAction getLoseAction();
		public void setLoseAction(LoseAction loseAction);
		public List<LoseAction> getLoseActionList();
		public void setLoseActionList(List<LoseAction> loseActionList);
		public boolean hasLoseAction();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Map">http://schema.org/Map</a>
		 */
		public Map getMap();
		public void setMap(Map map);
		public List<Map> getMapList();
		public void setMapList(List<Map> mapList);
		public boolean hasMap();

		/**
		 * @see <a href="http://schema.org/MapCategoryType">http://schema.org/MapCategoryType</a>
		 */
		public MapCategoryType getMapCategoryType();
		public void setMapCategoryType(MapCategoryType mapCategoryType);
		public List<MapCategoryType> getMapCategoryTypeList();
		public void setMapCategoryTypeList(List<MapCategoryType> mapCategoryTypeList);
		public boolean hasMapCategoryType();

		/**
		 * @see <a href="http://schema.org/MarryAction">http://schema.org/MarryAction</a>
		 */
		public MarryAction getMarryAction();
		public void setMarryAction(MarryAction marryAction);
		public List<MarryAction> getMarryActionList();
		public void setMarryActionList(List<MarryAction> marryActionList);
		public boolean hasMarryAction();

		/**
		 * @see <a href="http://schema.org/Mass">http://schema.org/Mass</a>
		 */
		public Mass getMass();
		public void setMass(Mass mass);
		public List<Mass> getMassList();
		public void setMassList(List<Mass> massList);
		public boolean hasMass();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MediaObject">http://schema.org/MediaObject</a>
		 */
		public MediaObject getMediaObject();
		public void setMediaObject(MediaObject mediaObject);
		public List<MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		/**
		 * @see <a href="http://schema.org/MediaSubscription">http://schema.org/MediaSubscription</a>
		 */
		public MediaSubscription getMediaSubscription();
		public void setMediaSubscription(MediaSubscription mediaSubscription);
		public List<MediaSubscription> getMediaSubscriptionList();
		public void setMediaSubscriptionList(List<MediaSubscription> mediaSubscriptionList);
		public boolean hasMediaSubscription();

		/**
		 * @see <a href="http://schema.org/MedicalAudience">http://schema.org/MedicalAudience</a>
		 */
		public Clazz.MedicalAudience getMedicalAudience();
		public void setMedicalAudience(Clazz.MedicalAudience medicalAudience);
		public List<Clazz.MedicalAudience> getMedicalAudienceList();
		public void setMedicalAudienceList(List<Clazz.MedicalAudience> medicalAudienceList);
		public boolean hasMedicalAudience();

		/**
		 * @see <a href="http://schema.org/MedicalBusiness">http://schema.org/MedicalBusiness</a>
		 */
		public Clazz.MedicalBusiness getMedicalBusiness();
		public void setMedicalBusiness(Clazz.MedicalBusiness medicalBusiness);
		public List<Clazz.MedicalBusiness> getMedicalBusinessList();
		public void setMedicalBusinessList(List<Clazz.MedicalBusiness> medicalBusinessList);
		public boolean hasMedicalBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalClinic">http://schema.org/MedicalClinic</a>
		 */
		public Clazz.MedicalClinic getMedicalClinic();
		public void setMedicalClinic(Clazz.MedicalClinic medicalClinic);
		public List<Clazz.MedicalClinic> getMedicalClinicList();
		public void setMedicalClinicList(List<Clazz.MedicalClinic> medicalClinicList);
		public boolean hasMedicalClinic();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalDevicePurpose">http://schema.org/MedicalDevicePurpose</a>
		 */
		public Clazz.MedicalDevicePurpose getMedicalDevicePurpose();
		public void setMedicalDevicePurpose(Clazz.MedicalDevicePurpose medicalDevicePurpose);
		public List<Clazz.MedicalDevicePurpose> getMedicalDevicePurposeList();
		public void setMedicalDevicePurposeList(List<Clazz.MedicalDevicePurpose> medicalDevicePurposeList);
		public boolean hasMedicalDevicePurpose();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public Clazz.MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(Clazz.MedicalEnumeration medicalEnumeration);
		public List<Clazz.MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<Clazz.MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public Clazz.MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(Clazz.MedicalEvidenceLevel medicalEvidenceLevel);
		public List<Clazz.MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<Clazz.MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public Clazz.MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(Clazz.MedicalImagingTechnique medicalImagingTechnique);
		public List<Clazz.MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<Clazz.MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public Clazz.MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(Clazz.MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<Clazz.MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<Clazz.MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		/**
		 * @see <a href="http://schema.org/MedicalOrganization">http://schema.org/MedicalOrganization</a>
		 */
		public MedicalOrganization getMedicalOrganization();
		public void setMedicalOrganization(MedicalOrganization medicalOrganization);
		public List<MedicalOrganization> getMedicalOrganizationList();
		public void setMedicalOrganizationList(List<MedicalOrganization> medicalOrganizationList);
		public boolean hasMedicalOrganization();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public Clazz.MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(Clazz.MedicalProcedureType medicalProcedureType);
		public List<Clazz.MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<Clazz.MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalScholarlyArticle">http://schema.org/MedicalScholarlyArticle</a>
		 */
		public Clazz.MedicalScholarlyArticle getMedicalScholarlyArticle();
		public void setMedicalScholarlyArticle(Clazz.MedicalScholarlyArticle medicalScholarlyArticle);
		public List<Clazz.MedicalScholarlyArticle> getMedicalScholarlyArticleList();
		public void setMedicalScholarlyArticleList(List<Clazz.MedicalScholarlyArticle> medicalScholarlyArticleList);
		public boolean hasMedicalScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public Clazz.MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(Clazz.MedicalStudyStatus medicalStudyStatus);
		public List<Clazz.MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<Clazz.MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public Clazz.MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(Clazz.MedicalTrialDesign medicalTrialDesign);
		public List<Clazz.MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<Clazz.MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		/**
		 * @see <a href="http://schema.org/MedicalWebPage">http://schema.org/MedicalWebPage</a>
		 */
		public Clazz.MedicalWebPage getMedicalWebPage();
		public void setMedicalWebPage(Clazz.MedicalWebPage medicalWebPage);
		public List<Clazz.MedicalWebPage> getMedicalWebPageList();
		public void setMedicalWebPageList(List<Clazz.MedicalWebPage> medicalWebPageList);
		public boolean hasMedicalWebPage();

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public Clazz.MedicineSystem getMedicineSystem();
		public void setMedicineSystem(Clazz.MedicineSystem medicineSystem);
		public List<Clazz.MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<Clazz.MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

		/**
		 * @see <a href="http://schema.org/MeetingRoom">http://schema.org/MeetingRoom</a>
		 */
		public MeetingRoom getMeetingRoom();
		public void setMeetingRoom(MeetingRoom meetingRoom);
		public List<MeetingRoom> getMeetingRoomList();
		public void setMeetingRoomList(List<MeetingRoom> meetingRoomList);
		public boolean hasMeetingRoom();

		/**
		 * @see <a href="http://schema.org/MensClothingStore">http://schema.org/MensClothingStore</a>
		 */
		public MensClothingStore getMensClothingStore();
		public void setMensClothingStore(MensClothingStore mensClothingStore);
		public List<MensClothingStore> getMensClothingStoreList();
		public void setMensClothingStoreList(List<MensClothingStore> mensClothingStoreList);
		public boolean hasMensClothingStore();

		/**
		 * @see <a href="http://schema.org/Menu">http://schema.org/Menu</a>
		 */
		public Menu getMenu();
		public void setMenu(Menu menu);
		public List<Menu> getMenuList();
		public void setMenuList(List<Menu> menuList);
		public boolean hasMenu();

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

		/**
		 * @see <a href="http://schema.org/Message">http://schema.org/Message</a>
		 */
		public Message getMessage();
		public void setMessage(Message message);
		public List<Message> getMessageList();
		public void setMessageList(List<Message> messageList);
		public boolean hasMessage();

		/**
		 * @see <a href="http://schema.org/MiddleSchool">http://schema.org/MiddleSchool</a>
		 */
		public MiddleSchool getMiddleSchool();
		public void setMiddleSchool(MiddleSchool middleSchool);
		public List<MiddleSchool> getMiddleSchoolList();
		public void setMiddleSchoolList(List<MiddleSchool> middleSchoolList);
		public boolean hasMiddleSchool();

		/**
		 * @see <a href="http://schema.org/Midwifery">http://schema.org/Midwifery</a>
		 */
		public Midwifery getMidwifery();
		public void setMidwifery(Midwifery midwifery);
		public List<Midwifery> getMidwiferyList();
		public void setMidwiferyList(List<Midwifery> midwiferyList);
		public boolean hasMidwifery();

		/**
		 * @see <a href="http://schema.org/MobileApplication">http://schema.org/MobileApplication</a>
		 */
		public MobileApplication getMobileApplication();
		public void setMobileApplication(MobileApplication mobileApplication);
		public List<MobileApplication> getMobileApplicationList();
		public void setMobileApplicationList(List<MobileApplication> mobileApplicationList);
		public boolean hasMobileApplication();

		/**
		 * @see <a href="http://schema.org/MobilePhoneStore">http://schema.org/MobilePhoneStore</a>
		 */
		public MobilePhoneStore getMobilePhoneStore();
		public void setMobilePhoneStore(MobilePhoneStore mobilePhoneStore);
		public List<MobilePhoneStore> getMobilePhoneStoreList();
		public void setMobilePhoneStoreList(List<MobilePhoneStore> mobilePhoneStoreList);
		public boolean hasMobilePhoneStore();

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
		public MonetaryAmountDistribution getMonetaryAmountDistribution();
		public void setMonetaryAmountDistribution(MonetaryAmountDistribution monetaryAmountDistribution);
		public List<MonetaryAmountDistribution> getMonetaryAmountDistributionList();
		public void setMonetaryAmountDistributionList(List<MonetaryAmountDistribution> monetaryAmountDistributionList);
		public boolean hasMonetaryAmountDistribution();

		/**
		 * @see <a href="http://schema.org/MoneyTransfer">http://schema.org/MoneyTransfer</a>
		 */
		public MoneyTransfer getMoneyTransfer();
		public void setMoneyTransfer(MoneyTransfer moneyTransfer);
		public List<MoneyTransfer> getMoneyTransferList();
		public void setMoneyTransferList(List<MoneyTransfer> moneyTransferList);
		public boolean hasMoneyTransfer();

		/**
		 * @see <a href="http://schema.org/MortgageLoan">http://schema.org/MortgageLoan</a>
		 */
		public MortgageLoan getMortgageLoan();
		public void setMortgageLoan(MortgageLoan mortgageLoan);
		public List<MortgageLoan> getMortgageLoanList();
		public void setMortgageLoanList(List<MortgageLoan> mortgageLoanList);
		public boolean hasMortgageLoan();

		/**
		 * @see <a href="http://schema.org/Mosque">http://schema.org/Mosque</a>
		 */
		public Mosque getMosque();
		public void setMosque(Mosque mosque);
		public List<Mosque> getMosqueList();
		public void setMosqueList(List<Mosque> mosqueList);
		public boolean hasMosque();

		/**
		 * @see <a href="http://schema.org/Motel">http://schema.org/Motel</a>
		 */
		public Motel getMotel();
		public void setMotel(Motel motel);
		public List<Motel> getMotelList();
		public void setMotelList(List<Motel> motelList);
		public boolean hasMotel();

		/**
		 * @see <a href="http://schema.org/Motorcycle">http://schema.org/Motorcycle</a>
		 */
		public Motorcycle getMotorcycle();
		public void setMotorcycle(Motorcycle motorcycle);
		public List<Motorcycle> getMotorcycleList();
		public void setMotorcycleList(List<Motorcycle> motorcycleList);
		public boolean hasMotorcycle();

		/**
		 * @see <a href="http://schema.org/MotorcycleDealer">http://schema.org/MotorcycleDealer</a>
		 */
		public MotorcycleDealer getMotorcycleDealer();
		public void setMotorcycleDealer(MotorcycleDealer motorcycleDealer);
		public List<MotorcycleDealer> getMotorcycleDealerList();
		public void setMotorcycleDealerList(List<MotorcycleDealer> motorcycleDealerList);
		public boolean hasMotorcycleDealer();

		/**
		 * @see <a href="http://schema.org/MotorcycleRepair">http://schema.org/MotorcycleRepair</a>
		 */
		public MotorcycleRepair getMotorcycleRepair();
		public void setMotorcycleRepair(MotorcycleRepair motorcycleRepair);
		public List<MotorcycleRepair> getMotorcycleRepairList();
		public void setMotorcycleRepairList(List<MotorcycleRepair> motorcycleRepairList);
		public boolean hasMotorcycleRepair();

		/**
		 * @see <a href="http://schema.org/MotorizedBicycle">http://schema.org/MotorizedBicycle</a>
		 */
		public MotorizedBicycle getMotorizedBicycle();
		public void setMotorizedBicycle(MotorizedBicycle motorizedBicycle);
		public List<MotorizedBicycle> getMotorizedBicycleList();
		public void setMotorizedBicycleList(List<MotorizedBicycle> motorizedBicycleList);
		public boolean hasMotorizedBicycle();

		/**
		 * @see <a href="http://schema.org/Mountain">http://schema.org/Mountain</a>
		 */
		public Mountain getMountain();
		public void setMountain(Mountain mountain);
		public List<Mountain> getMountainList();
		public void setMountainList(List<Mountain> mountainList);
		public boolean hasMountain();

		/**
		 * @see <a href="http://schema.org/MoveAction">http://schema.org/MoveAction</a>
		 */
		public MoveAction getMoveAction();
		public void setMoveAction(MoveAction moveAction);
		public List<MoveAction> getMoveActionList();
		public void setMoveActionList(List<MoveAction> moveActionList);
		public boolean hasMoveAction();

		/**
		 * @see <a href="http://schema.org/Movie">http://schema.org/Movie</a>
		 */
		public Movie getMovie();
		public void setMovie(Movie movie);
		public List<Movie> getMovieList();
		public void setMovieList(List<Movie> movieList);
		public boolean hasMovie();

		/**
		 * @see <a href="http://schema.org/MovieClip">http://schema.org/MovieClip</a>
		 */
		public MovieClip getMovieClip();
		public void setMovieClip(MovieClip movieClip);
		public List<MovieClip> getMovieClipList();
		public void setMovieClipList(List<MovieClip> movieClipList);
		public boolean hasMovieClip();

		/**
		 * @see <a href="http://schema.org/MovieRentalStore">http://schema.org/MovieRentalStore</a>
		 */
		public MovieRentalStore getMovieRentalStore();
		public void setMovieRentalStore(MovieRentalStore movieRentalStore);
		public List<MovieRentalStore> getMovieRentalStoreList();
		public void setMovieRentalStoreList(List<MovieRentalStore> movieRentalStoreList);
		public boolean hasMovieRentalStore();

		/**
		 * @see <a href="http://schema.org/MovieSeries">http://schema.org/MovieSeries</a>
		 */
		public MovieSeries getMovieSeries();
		public void setMovieSeries(MovieSeries movieSeries);
		public List<MovieSeries> getMovieSeriesList();
		public void setMovieSeriesList(List<MovieSeries> movieSeriesList);
		public boolean hasMovieSeries();

		/**
		 * @see <a href="http://schema.org/MovieTheater">http://schema.org/MovieTheater</a>
		 */
		public MovieTheater getMovieTheater();
		public void setMovieTheater(MovieTheater movieTheater);
		public List<MovieTheater> getMovieTheaterList();
		public void setMovieTheaterList(List<MovieTheater> movieTheaterList);
		public boolean hasMovieTheater();

		/**
		 * @see <a href="http://schema.org/MovingCompany">http://schema.org/MovingCompany</a>
		 */
		public MovingCompany getMovingCompany();
		public void setMovingCompany(MovingCompany movingCompany);
		public List<MovingCompany> getMovingCompanyList();
		public void setMovingCompanyList(List<MovingCompany> movingCompanyList);
		public boolean hasMovingCompany();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Museum">http://schema.org/Museum</a>
		 */
		public Museum getMuseum();
		public void setMuseum(Museum museum);
		public List<Museum> getMuseumList();
		public void setMuseumList(List<Museum> museumList);
		public boolean hasMuseum();

		/**
		 * @see <a href="http://schema.org/MusicAlbum">http://schema.org/MusicAlbum</a>
		 */
		public MusicAlbum getMusicAlbum();
		public void setMusicAlbum(MusicAlbum musicAlbum);
		public List<MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		/**
		 * @see <a href="http://schema.org/MusicAlbumProductionType">http://schema.org/MusicAlbumProductionType</a>
		 */
		public MusicAlbumProductionType getMusicAlbumProductionType();
		public void setMusicAlbumProductionType(MusicAlbumProductionType musicAlbumProductionType);
		public List<MusicAlbumProductionType> getMusicAlbumProductionTypeList();
		public void setMusicAlbumProductionTypeList(List<MusicAlbumProductionType> musicAlbumProductionTypeList);
		public boolean hasMusicAlbumProductionType();

		/**
		 * @see <a href="http://schema.org/MusicAlbumReleaseType">http://schema.org/MusicAlbumReleaseType</a>
		 */
		public MusicAlbumReleaseType getMusicAlbumReleaseType();
		public void setMusicAlbumReleaseType(MusicAlbumReleaseType musicAlbumReleaseType);
		public List<MusicAlbumReleaseType> getMusicAlbumReleaseTypeList();
		public void setMusicAlbumReleaseTypeList(List<MusicAlbumReleaseType> musicAlbumReleaseTypeList);
		public boolean hasMusicAlbumReleaseType();

		/**
		 * @see <a href="http://schema.org/MusicComposition">http://schema.org/MusicComposition</a>
		 */
		public MusicComposition getMusicComposition();
		public void setMusicComposition(MusicComposition musicComposition);
		public List<MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

		/**
		 * @see <a href="http://schema.org/MusicEvent">http://schema.org/MusicEvent</a>
		 */
		public MusicEvent getMusicEvent();
		public void setMusicEvent(MusicEvent musicEvent);
		public List<MusicEvent> getMusicEventList();
		public void setMusicEventList(List<MusicEvent> musicEventList);
		public boolean hasMusicEvent();

		/**
		 * @see <a href="http://schema.org/MusicGroup">http://schema.org/MusicGroup</a>
		 */
		public MusicGroup getMusicGroup();
		public void setMusicGroup(MusicGroup musicGroup);
		public List<MusicGroup> getMusicGroupList();
		public void setMusicGroupList(List<MusicGroup> musicGroupList);
		public boolean hasMusicGroup();

		/**
		 * @see <a href="http://schema.org/MusicPlaylist">http://schema.org/MusicPlaylist</a>
		 */
		public MusicPlaylist getMusicPlaylist();
		public void setMusicPlaylist(MusicPlaylist musicPlaylist);
		public List<MusicPlaylist> getMusicPlaylistList();
		public void setMusicPlaylistList(List<MusicPlaylist> musicPlaylistList);
		public boolean hasMusicPlaylist();

		/**
		 * @see <a href="http://schema.org/MusicRecording">http://schema.org/MusicRecording</a>
		 */
		public MusicRecording getMusicRecording();
		public void setMusicRecording(MusicRecording musicRecording);
		public List<MusicRecording> getMusicRecordingList();
		public void setMusicRecordingList(List<MusicRecording> musicRecordingList);
		public boolean hasMusicRecording();

		/**
		 * @see <a href="http://schema.org/MusicRelease">http://schema.org/MusicRelease</a>
		 */
		public MusicRelease getMusicRelease();
		public void setMusicRelease(MusicRelease musicRelease);
		public List<MusicRelease> getMusicReleaseList();
		public void setMusicReleaseList(List<MusicRelease> musicReleaseList);
		public boolean hasMusicRelease();

		/**
		 * @see <a href="http://schema.org/MusicReleaseFormatType">http://schema.org/MusicReleaseFormatType</a>
		 */
		public MusicReleaseFormatType getMusicReleaseFormatType();
		public void setMusicReleaseFormatType(MusicReleaseFormatType musicReleaseFormatType);
		public List<MusicReleaseFormatType> getMusicReleaseFormatTypeList();
		public void setMusicReleaseFormatTypeList(List<MusicReleaseFormatType> musicReleaseFormatTypeList);
		public boolean hasMusicReleaseFormatType();

		/**
		 * @see <a href="http://schema.org/MusicStore">http://schema.org/MusicStore</a>
		 */
		public MusicStore getMusicStore();
		public void setMusicStore(MusicStore musicStore);
		public List<MusicStore> getMusicStoreList();
		public void setMusicStoreList(List<MusicStore> musicStoreList);
		public boolean hasMusicStore();

		/**
		 * @see <a href="http://schema.org/MusicVenue">http://schema.org/MusicVenue</a>
		 */
		public MusicVenue getMusicVenue();
		public void setMusicVenue(MusicVenue musicVenue);
		public List<MusicVenue> getMusicVenueList();
		public void setMusicVenueList(List<MusicVenue> musicVenueList);
		public boolean hasMusicVenue();

		/**
		 * @see <a href="http://schema.org/MusicVideoObject">http://schema.org/MusicVideoObject</a>
		 */
		public MusicVideoObject getMusicVideoObject();
		public void setMusicVideoObject(MusicVideoObject musicVideoObject);
		public List<MusicVideoObject> getMusicVideoObjectList();
		public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList);
		public boolean hasMusicVideoObject();

		/**
		 * @see <a href="http://schema.org/NGO">http://schema.org/NGO</a>
		 */
		public NGO getNGO();
		public void setNGO(NGO ngo);
		public List<NGO> getNGOList();
		public void setNGOList(List<NGO> ngoList);
		public boolean hasNGO();

		/**
		 * @see <a href="http://schema.org/NailSalon">http://schema.org/NailSalon</a>
		 */
		public NailSalon getNailSalon();
		public void setNailSalon(NailSalon nailSalon);
		public List<NailSalon> getNailSalonList();
		public void setNailSalonList(List<NailSalon> nailSalonList);
		public boolean hasNailSalon();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/NewsArticle">http://schema.org/NewsArticle</a>
		 */
		public NewsArticle getNewsArticle();
		public void setNewsArticle(NewsArticle newsArticle);
		public List<NewsArticle> getNewsArticleList();
		public void setNewsArticleList(List<NewsArticle> newsArticleList);
		public boolean hasNewsArticle();

		/**
		 * @see <a href="http://schema.org/NewsMediaOrganization">http://schema.org/NewsMediaOrganization</a>
		 */
		public NewsMediaOrganization getNewsMediaOrganization();
		public void setNewsMediaOrganization(NewsMediaOrganization newsMediaOrganization);
		public List<NewsMediaOrganization> getNewsMediaOrganizationList();
		public void setNewsMediaOrganizationList(List<NewsMediaOrganization> newsMediaOrganizationList);
		public boolean hasNewsMediaOrganization();

		/**
		 * @see <a href="http://schema.org/Newspaper">http://schema.org/Newspaper</a>
		 */
		public Newspaper getNewspaper();
		public void setNewspaper(Newspaper newspaper);
		public List<Newspaper> getNewspaperList();
		public void setNewspaperList(List<Newspaper> newspaperList);
		public boolean hasNewspaper();

		/**
		 * @see <a href="http://schema.org/NightClub">http://schema.org/NightClub</a>
		 */
		public NightClub getNightClub();
		public void setNightClub(NightClub nightClub);
		public List<NightClub> getNightClubList();
		public void setNightClubList(List<NightClub> nightClubList);
		public boolean hasNightClub();

		/**
		 * @see <a href="http://schema.org/Notary">http://schema.org/Notary</a>
		 */
		public Notary getNotary();
		public void setNotary(Notary notary);
		public List<Notary> getNotaryList();
		public void setNotaryList(List<Notary> notaryList);
		public boolean hasNotary();

		/**
		 * @see <a href="http://schema.org/NoteDigitalDocument">http://schema.org/NoteDigitalDocument</a>
		 */
		public NoteDigitalDocument getNoteDigitalDocument();
		public void setNoteDigitalDocument(NoteDigitalDocument noteDigitalDocument);
		public List<NoteDigitalDocument> getNoteDigitalDocumentList();
		public void setNoteDigitalDocumentList(List<NoteDigitalDocument> noteDigitalDocumentList);
		public boolean hasNoteDigitalDocument();

		/**
		 * @see <a href="http://schema.org/Nursing">http://schema.org/Nursing</a>
		 */
		public Nursing getNursing();
		public void setNursing(Nursing nursing);
		public List<Nursing> getNursingList();
		public void setNursingList(List<Nursing> nursingList);
		public boolean hasNursing();

		/**
		 * @see <a href="http://schema.org/NutritionInformation">http://schema.org/NutritionInformation</a>
		 */
		public NutritionInformation getNutritionInformation();
		public void setNutritionInformation(NutritionInformation nutritionInformation);
		public List<NutritionInformation> getNutritionInformationList();
		public void setNutritionInformationList(List<NutritionInformation> nutritionInformationList);
		public boolean hasNutritionInformation();

		/**
		 * @see <a href="http://schema.org/Obstetric">http://schema.org/Obstetric</a>
		 */
		public Obstetric getObstetric();
		public void setObstetric(Obstetric obstetric);
		public List<Obstetric> getObstetricList();
		public void setObstetricList(List<Obstetric> obstetricList);
		public boolean hasObstetric();

		/**
		 * @see <a href="http://schema.org/Occupation">http://schema.org/Occupation</a>
		 */
		public Occupation getOccupation();
		public void setOccupation(Occupation occupation);
		public List<Occupation> getOccupationList();
		public void setOccupationList(List<Occupation> occupationList);
		public boolean hasOccupation();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/OceanBodyOfWater">http://schema.org/OceanBodyOfWater</a>
		 */
		public OceanBodyOfWater getOceanBodyOfWater();
		public void setOceanBodyOfWater(OceanBodyOfWater oceanBodyOfWater);
		public List<OceanBodyOfWater> getOceanBodyOfWaterList();
		public void setOceanBodyOfWaterList(List<OceanBodyOfWater> oceanBodyOfWaterList);
		public boolean hasOceanBodyOfWater();

		/**
		 * @see <a href="http://schema.org/Offer">http://schema.org/Offer</a>
		 */
		public Offer getOffer();
		public void setOffer(Offer offer);
		public List<Offer> getOfferList();
		public void setOfferList(List<Offer> offerList);
		public boolean hasOffer();

		/**
		 * @see <a href="http://schema.org/OfferCatalog">http://schema.org/OfferCatalog</a>
		 */
		public OfferCatalog getOfferCatalog();
		public void setOfferCatalog(OfferCatalog offerCatalog);
		public List<OfferCatalog> getOfferCatalogList();
		public void setOfferCatalogList(List<OfferCatalog> offerCatalogList);
		public boolean hasOfferCatalog();

		/**
		 * @see <a href="http://schema.org/OfferItemCondition">http://schema.org/OfferItemCondition</a>
		 */
		public OfferItemCondition getOfferItemCondition();
		public void setOfferItemCondition(OfferItemCondition offerItemCondition);
		public List<OfferItemCondition> getOfferItemConditionList();
		public void setOfferItemConditionList(List<OfferItemCondition> offerItemConditionList);
		public boolean hasOfferItemCondition();

		/**
		 * @see <a href="http://schema.org/OfficeEquipmentStore">http://schema.org/OfficeEquipmentStore</a>
		 */
		public OfficeEquipmentStore getOfficeEquipmentStore();
		public void setOfficeEquipmentStore(OfficeEquipmentStore officeEquipmentStore);
		public List<OfficeEquipmentStore> getOfficeEquipmentStoreList();
		public void setOfficeEquipmentStoreList(List<OfficeEquipmentStore> officeEquipmentStoreList);
		public boolean hasOfficeEquipmentStore();

		/**
		 * @see <a href="http://schema.org/OnDemandEvent">http://schema.org/OnDemandEvent</a>
		 */
		public OnDemandEvent getOnDemandEvent();
		public void setOnDemandEvent(OnDemandEvent onDemandEvent);
		public List<OnDemandEvent> getOnDemandEventList();
		public void setOnDemandEventList(List<OnDemandEvent> onDemandEventList);
		public boolean hasOnDemandEvent();

		/**
		 * @see <a href="http://schema.org/Oncologic">http://schema.org/Oncologic</a>
		 */
		public Oncologic getOncologic();
		public void setOncologic(Oncologic oncologic);
		public List<Oncologic> getOncologicList();
		public void setOncologicList(List<Oncologic> oncologicList);
		public boolean hasOncologic();

		/**
		 * @see <a href="http://schema.org/OpeningHoursSpecification">http://schema.org/OpeningHoursSpecification</a>
		 */
		public OpeningHoursSpecification getOpeningHoursSpecification();
		public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification);
		public List<OpeningHoursSpecification> getOpeningHoursSpecificationList();
		public void setOpeningHoursSpecificationList(List<OpeningHoursSpecification> openingHoursSpecificationList);
		public boolean hasOpeningHoursSpecification();

		/**
		 * @see <a href="http://schema.org/OpinionNewsArticle">http://schema.org/OpinionNewsArticle</a>
		 */
		public OpinionNewsArticle getOpinionNewsArticle();
		public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle);
		public List<OpinionNewsArticle> getOpinionNewsArticleList();
		public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList);
		public boolean hasOpinionNewsArticle();

		/**
		 * @see <a href="http://schema.org/Optician">http://schema.org/Optician</a>
		 */
		public Clazz.Optician getOptician();
		public void setOptician(Clazz.Optician optician);
		public List<Clazz.Optician> getOpticianList();
		public void setOpticianList(List<Clazz.Optician> opticianList);
		public boolean hasOptician();

		/**
		 * @see <a href="http://schema.org/Optometric">http://schema.org/Optometric</a>
		 */
		public Optometric getOptometric();
		public void setOptometric(Optometric optometric);
		public List<Optometric> getOptometricList();
		public void setOptometricList(List<Optometric> optometricList);
		public boolean hasOptometric();

		/**
		 * @see <a href="http://schema.org/Order">http://schema.org/Order</a>
		 */
		public Order getOrder();
		public void setOrder(Order order);
		public List<Order> getOrderList();
		public void setOrderList(List<Order> orderList);
		public boolean hasOrder();

		/**
		 * @see <a href="http://schema.org/OrderAction">http://schema.org/OrderAction</a>
		 */
		public OrderAction getOrderAction();
		public void setOrderAction(OrderAction orderAction);
		public List<OrderAction> getOrderActionList();
		public void setOrderActionList(List<OrderAction> orderActionList);
		public boolean hasOrderAction();

		/**
		 * @see <a href="http://schema.org/OrderItem">http://schema.org/OrderItem</a>
		 */
		public OrderItem getOrderItem();
		public void setOrderItem(OrderItem orderItem);
		public List<OrderItem> getOrderItemList();
		public void setOrderItemList(List<OrderItem> orderItemList);
		public boolean hasOrderItem();

		/**
		 * @see <a href="http://schema.org/OrderStatus">http://schema.org/OrderStatus</a>
		 */
		public OrderStatus getOrderStatus();
		public void setOrderStatus(OrderStatus orderStatus);
		public List<OrderStatus> getOrderStatusList();
		public void setOrderStatusList(List<OrderStatus> orderStatusList);
		public boolean hasOrderStatus();

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/OrganizationRole">http://schema.org/OrganizationRole</a>
		 */
		public OrganizationRole getOrganizationRole();
		public void setOrganizationRole(OrganizationRole organizationRole);
		public List<OrganizationRole> getOrganizationRoleList();
		public void setOrganizationRoleList(List<OrganizationRole> organizationRoleList);
		public boolean hasOrganizationRole();

		/**
		 * @see <a href="http://schema.org/OrganizeAction">http://schema.org/OrganizeAction</a>
		 */
		public OrganizeAction getOrganizeAction();
		public void setOrganizeAction(OrganizeAction organizeAction);
		public List<OrganizeAction> getOrganizeActionList();
		public void setOrganizeActionList(List<OrganizeAction> organizeActionList);
		public boolean hasOrganizeAction();

		/**
		 * @see <a href="http://schema.org/Otolaryngologic">http://schema.org/Otolaryngologic</a>
		 */
		public Otolaryngologic getOtolaryngologic();
		public void setOtolaryngologic(Otolaryngologic otolaryngologic);
		public List<Otolaryngologic> getOtolaryngologicList();
		public void setOtolaryngologicList(List<Otolaryngologic> otolaryngologicList);
		public boolean hasOtolaryngologic();

		/**
		 * @see <a href="http://schema.org/OutletStore">http://schema.org/OutletStore</a>
		 */
		public OutletStore getOutletStore();
		public void setOutletStore(OutletStore outletStore);
		public List<OutletStore> getOutletStoreList();
		public void setOutletStoreList(List<OutletStore> outletStoreList);
		public boolean hasOutletStore();

		/**
		 * @see <a href="http://schema.org/OwnershipInfo">http://schema.org/OwnershipInfo</a>
		 */
		public OwnershipInfo getOwnershipInfo();
		public void setOwnershipInfo(OwnershipInfo ownershipInfo);
		public List<OwnershipInfo> getOwnershipInfoList();
		public void setOwnershipInfoList(List<OwnershipInfo> ownershipInfoList);
		public boolean hasOwnershipInfo();

		/**
		 * @see <a href="http://schema.org/PaintAction">http://schema.org/PaintAction</a>
		 */
		public PaintAction getPaintAction();
		public void setPaintAction(PaintAction paintAction);
		public List<PaintAction> getPaintActionList();
		public void setPaintActionList(List<PaintAction> paintActionList);
		public boolean hasPaintAction();

		/**
		 * @see <a href="http://schema.org/Painting">http://schema.org/Painting</a>
		 */
		public Painting getPainting();
		public void setPainting(Painting painting);
		public List<Painting> getPaintingList();
		public void setPaintingList(List<Painting> paintingList);
		public boolean hasPainting();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/ParcelDelivery">http://schema.org/ParcelDelivery</a>
		 */
		public ParcelDelivery getParcelDelivery();
		public void setParcelDelivery(ParcelDelivery parcelDelivery);
		public List<ParcelDelivery> getParcelDeliveryList();
		public void setParcelDeliveryList(List<ParcelDelivery> parcelDeliveryList);
		public boolean hasParcelDelivery();

		/**
		 * @see <a href="http://schema.org/ParcelService">http://schema.org/ParcelService</a>
		 */
		public ParcelService getParcelService();
		public void setParcelService(ParcelService parcelService);
		public List<ParcelService> getParcelServiceList();
		public void setParcelServiceList(List<ParcelService> parcelServiceList);
		public boolean hasParcelService();

		/**
		 * @see <a href="http://schema.org/ParentAudience">http://schema.org/ParentAudience</a>
		 */
		public ParentAudience getParentAudience();
		public void setParentAudience(ParentAudience parentAudience);
		public List<ParentAudience> getParentAudienceList();
		public void setParentAudienceList(List<ParentAudience> parentAudienceList);
		public boolean hasParentAudience();

		/**
		 * @see <a href="http://schema.org/Park">http://schema.org/Park</a>
		 */
		public Park getPark();
		public void setPark(Park park);
		public List<Park> getParkList();
		public void setParkList(List<Park> parkList);
		public boolean hasPark();

		/**
		 * @see <a href="http://schema.org/ParkingFacility">http://schema.org/ParkingFacility</a>
		 */
		public ParkingFacility getParkingFacility();
		public void setParkingFacility(ParkingFacility parkingFacility);
		public List<ParkingFacility> getParkingFacilityList();
		public void setParkingFacilityList(List<ParkingFacility> parkingFacilityList);
		public boolean hasParkingFacility();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Clazz.Patient getPatient();
		public void setPatient(Clazz.Patient patient);
		public List<Clazz.Patient> getPatientList();
		public void setPatientList(List<Clazz.Patient> patientList);
		public boolean hasPatient();

		/**
		 * @see <a href="http://schema.org/PawnShop">http://schema.org/PawnShop</a>
		 */
		public PawnShop getPawnShop();
		public void setPawnShop(PawnShop pawnShop);
		public List<PawnShop> getPawnShopList();
		public void setPawnShopList(List<PawnShop> pawnShopList);
		public boolean hasPawnShop();

		/**
		 * @see <a href="http://schema.org/PayAction">http://schema.org/PayAction</a>
		 */
		public PayAction getPayAction();
		public void setPayAction(PayAction payAction);
		public List<PayAction> getPayActionList();
		public void setPayActionList(List<PayAction> payActionList);
		public boolean hasPayAction();

		/**
		 * @see <a href="http://schema.org/PaymentCard">http://schema.org/PaymentCard</a>
		 */
		public PaymentCard getPaymentCard();
		public void setPaymentCard(PaymentCard paymentCard);
		public List<PaymentCard> getPaymentCardList();
		public void setPaymentCardList(List<PaymentCard> paymentCardList);
		public boolean hasPaymentCard();

		/**
		 * @see <a href="http://schema.org/PaymentChargeSpecification">http://schema.org/PaymentChargeSpecification</a>
		 */
		public PaymentChargeSpecification getPaymentChargeSpecification();
		public void setPaymentChargeSpecification(PaymentChargeSpecification paymentChargeSpecification);
		public List<PaymentChargeSpecification> getPaymentChargeSpecificationList();
		public void setPaymentChargeSpecificationList(List<PaymentChargeSpecification> paymentChargeSpecificationList);
		public boolean hasPaymentChargeSpecification();

		/**
		 * @see <a href="http://schema.org/PaymentMethod">http://schema.org/PaymentMethod</a>
		 */
		public PaymentMethod getPaymentMethod();
		public void setPaymentMethod(PaymentMethod paymentMethod);
		public List<PaymentMethod> getPaymentMethodList();
		public void setPaymentMethodList(List<PaymentMethod> paymentMethodList);
		public boolean hasPaymentMethod();

		/**
		 * @see <a href="http://schema.org/PaymentService">http://schema.org/PaymentService</a>
		 */
		public PaymentService getPaymentService();
		public void setPaymentService(PaymentService paymentService);
		public List<PaymentService> getPaymentServiceList();
		public void setPaymentServiceList(List<PaymentService> paymentServiceList);
		public boolean hasPaymentService();

		/**
		 * @see <a href="http://schema.org/PaymentStatusType">http://schema.org/PaymentStatusType</a>
		 */
		public PaymentStatusType getPaymentStatusType();
		public void setPaymentStatusType(PaymentStatusType paymentStatusType);
		public List<PaymentStatusType> getPaymentStatusTypeList();
		public void setPaymentStatusTypeList(List<PaymentStatusType> paymentStatusTypeList);
		public boolean hasPaymentStatusType();

		/**
		 * @see <a href="http://schema.org/Pediatric">http://schema.org/Pediatric</a>
		 */
		public Pediatric getPediatric();
		public void setPediatric(Pediatric pediatric);
		public List<Pediatric> getPediatricList();
		public void setPediatricList(List<Pediatric> pediatricList);
		public boolean hasPediatric();

		/**
		 * @see <a href="http://schema.org/PeopleAudience">http://schema.org/PeopleAudience</a>
		 */
		public PeopleAudience getPeopleAudience();
		public void setPeopleAudience(PeopleAudience peopleAudience);
		public List<PeopleAudience> getPeopleAudienceList();
		public void setPeopleAudienceList(List<PeopleAudience> peopleAudienceList);
		public boolean hasPeopleAudience();

		/**
		 * @see <a href="http://schema.org/PerformAction">http://schema.org/PerformAction</a>
		 */
		public PerformAction getPerformAction();
		public void setPerformAction(PerformAction performAction);
		public List<PerformAction> getPerformActionList();
		public void setPerformActionList(List<PerformAction> performActionList);
		public boolean hasPerformAction();

		/**
		 * @see <a href="http://schema.org/PerformanceRole">http://schema.org/PerformanceRole</a>
		 */
		public PerformanceRole getPerformanceRole();
		public void setPerformanceRole(PerformanceRole performanceRole);
		public List<PerformanceRole> getPerformanceRoleList();
		public void setPerformanceRoleList(List<PerformanceRole> performanceRoleList);
		public boolean hasPerformanceRole();

		/**
		 * @see <a href="http://schema.org/PerformingArtsTheater">http://schema.org/PerformingArtsTheater</a>
		 */
		public PerformingArtsTheater getPerformingArtsTheater();
		public void setPerformingArtsTheater(PerformingArtsTheater performingArtsTheater);
		public List<PerformingArtsTheater> getPerformingArtsTheaterList();
		public void setPerformingArtsTheaterList(List<PerformingArtsTheater> performingArtsTheaterList);
		public boolean hasPerformingArtsTheater();

		/**
		 * @see <a href="http://schema.org/PerformingGroup">http://schema.org/PerformingGroup</a>
		 */
		public PerformingGroup getPerformingGroup();
		public void setPerformingGroup(PerformingGroup performingGroup);
		public List<PerformingGroup> getPerformingGroupList();
		public void setPerformingGroupList(List<PerformingGroup> performingGroupList);
		public boolean hasPerformingGroup();

		/**
		 * @see <a href="http://schema.org/Periodical">http://schema.org/Periodical</a>
		 */
		public Periodical getPeriodical();
		public void setPeriodical(Periodical periodical);
		public List<Periodical> getPeriodicalList();
		public void setPeriodicalList(List<Periodical> periodicalList);
		public boolean hasPeriodical();

		/**
		 * @see <a href="http://schema.org/Permit">http://schema.org/Permit</a>
		 */
		public Permit getPermit();
		public void setPermit(Permit permit);
		public List<Permit> getPermitList();
		public void setPermitList(List<Permit> permitList);
		public boolean hasPermit();

		/**
		 * @see <a href="http://schema.org/Person">http://schema.org/Person</a>
		 */
		public Person getPerson();
		public void setPerson(Person person);
		public List<Person> getPersonList();
		public void setPersonList(List<Person> personList);
		public boolean hasPerson();

		/**
		 * @see <a href="http://schema.org/PetStore">http://schema.org/PetStore</a>
		 */
		public PetStore getPetStore();
		public void setPetStore(PetStore petStore);
		public List<PetStore> getPetStoreList();
		public void setPetStoreList(List<PetStore> petStoreList);
		public boolean hasPetStore();

		/**
		 * @see <a href="http://schema.org/Pharmacy">http://schema.org/Pharmacy</a>
		 */
		public Pharmacy getPharmacy();
		public void setPharmacy(Pharmacy pharmacy);
		public List<Pharmacy> getPharmacyList();
		public void setPharmacyList(List<Pharmacy> pharmacyList);
		public boolean hasPharmacy();

		/**
		 * @see <a href="http://schema.org/Photograph">http://schema.org/Photograph</a>
		 */
		public Photograph getPhotograph();
		public void setPhotograph(Photograph photograph);
		public List<Photograph> getPhotographList();
		public void setPhotographList(List<Photograph> photographList);
		public boolean hasPhotograph();

		/**
		 * @see <a href="http://schema.org/PhotographAction">http://schema.org/PhotographAction</a>
		 */
		public PhotographAction getPhotographAction();
		public void setPhotographAction(PhotographAction photographAction);
		public List<PhotographAction> getPhotographActionList();
		public void setPhotographActionList(List<PhotographAction> photographActionList);
		public boolean hasPhotographAction();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalActivityCategory">http://schema.org/PhysicalActivityCategory</a>
		 */
		public Clazz.PhysicalActivityCategory getPhysicalActivityCategory();
		public void setPhysicalActivityCategory(Clazz.PhysicalActivityCategory physicalActivityCategory);
		public List<Clazz.PhysicalActivityCategory> getPhysicalActivityCategoryList();
		public void setPhysicalActivityCategoryList(List<Clazz.PhysicalActivityCategory> physicalActivityCategoryList);
		public boolean hasPhysicalActivityCategory();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/Physician">http://schema.org/Physician</a>
		 */
		public Physician getPhysician();
		public void setPhysician(Physician physician);
		public List<Physician> getPhysicianList();
		public void setPhysicianList(List<Physician> physicianList);
		public boolean hasPhysician();

		/**
		 * @see <a href="http://schema.org/Physiotherapy">http://schema.org/Physiotherapy</a>
		 */
		public Physiotherapy getPhysiotherapy();
		public void setPhysiotherapy(Physiotherapy physiotherapy);
		public List<Physiotherapy> getPhysiotherapyList();
		public void setPhysiotherapyList(List<Physiotherapy> physiotherapyList);
		public boolean hasPhysiotherapy();

		/**
		 * @see <a href="http://schema.org/Place">http://schema.org/Place</a>
		 */
		public Place getPlace();
		public void setPlace(Place place);
		public List<Place> getPlaceList();
		public void setPlaceList(List<Place> placeList);
		public boolean hasPlace();

		/**
		 * @see <a href="http://schema.org/PlaceOfWorship">http://schema.org/PlaceOfWorship</a>
		 */
		public PlaceOfWorship getPlaceOfWorship();
		public void setPlaceOfWorship(PlaceOfWorship placeOfWorship);
		public List<PlaceOfWorship> getPlaceOfWorshipList();
		public void setPlaceOfWorshipList(List<PlaceOfWorship> placeOfWorshipList);
		public boolean hasPlaceOfWorship();

		/**
		 * @see <a href="http://schema.org/PlanAction">http://schema.org/PlanAction</a>
		 */
		public PlanAction getPlanAction();
		public void setPlanAction(PlanAction planAction);
		public List<PlanAction> getPlanActionList();
		public void setPlanActionList(List<PlanAction> planActionList);
		public boolean hasPlanAction();

		/**
		 * @see <a href="http://schema.org/PlasticSurgery">http://schema.org/PlasticSurgery</a>
		 */
		public PlasticSurgery getPlasticSurgery();
		public void setPlasticSurgery(PlasticSurgery plasticSurgery);
		public List<PlasticSurgery> getPlasticSurgeryList();
		public void setPlasticSurgeryList(List<PlasticSurgery> plasticSurgeryList);
		public boolean hasPlasticSurgery();

		/**
		 * @see <a href="http://schema.org/PlayAction">http://schema.org/PlayAction</a>
		 */
		public PlayAction getPlayAction();
		public void setPlayAction(PlayAction playAction);
		public List<PlayAction> getPlayActionList();
		public void setPlayActionList(List<PlayAction> playActionList);
		public boolean hasPlayAction();

		/**
		 * @see <a href="http://schema.org/Playground">http://schema.org/Playground</a>
		 */
		public Playground getPlayground();
		public void setPlayground(Playground playground);
		public List<Playground> getPlaygroundList();
		public void setPlaygroundList(List<Playground> playgroundList);
		public boolean hasPlayground();

		/**
		 * @see <a href="http://schema.org/Plumber">http://schema.org/Plumber</a>
		 */
		public Plumber getPlumber();
		public void setPlumber(Plumber plumber);
		public List<Plumber> getPlumberList();
		public void setPlumberList(List<Plumber> plumberList);
		public boolean hasPlumber();

		/**
		 * @see <a href="http://schema.org/Podiatric">http://schema.org/Podiatric</a>
		 */
		public Podiatric getPodiatric();
		public void setPodiatric(Podiatric podiatric);
		public List<Podiatric> getPodiatricList();
		public void setPodiatricList(List<Podiatric> podiatricList);
		public boolean hasPodiatric();

		/**
		 * @see <a href="http://schema.org/PoliceStation">http://schema.org/PoliceStation</a>
		 */
		public PoliceStation getPoliceStation();
		public void setPoliceStation(PoliceStation policeStation);
		public List<PoliceStation> getPoliceStationList();
		public void setPoliceStationList(List<PoliceStation> policeStationList);
		public boolean hasPoliceStation();

		/**
		 * @see <a href="http://schema.org/Pond">http://schema.org/Pond</a>
		 */
		public Pond getPond();
		public void setPond(Pond pond);
		public List<Pond> getPondList();
		public void setPondList(List<Pond> pondList);
		public boolean hasPond();

		/**
		 * @see <a href="http://schema.org/PostOffice">http://schema.org/PostOffice</a>
		 */
		public PostOffice getPostOffice();
		public void setPostOffice(PostOffice postOffice);
		public List<PostOffice> getPostOfficeList();
		public void setPostOfficeList(List<PostOffice> postOfficeList);
		public boolean hasPostOffice();

		/**
		 * @see <a href="http://schema.org/PostalAddress">http://schema.org/PostalAddress</a>
		 */
		public PostalAddress getPostalAddress();
		public void setPostalAddress(PostalAddress postalAddress);
		public List<PostalAddress> getPostalAddressList();
		public void setPostalAddressList(List<PostalAddress> postalAddressList);
		public boolean hasPostalAddress();

		/**
		 * @see <a href="http://schema.org/PreOrderAction">http://schema.org/PreOrderAction</a>
		 */
		public PreOrderAction getPreOrderAction();
		public void setPreOrderAction(PreOrderAction preOrderAction);
		public List<PreOrderAction> getPreOrderActionList();
		public void setPreOrderActionList(List<PreOrderAction> preOrderActionList);
		public boolean hasPreOrderAction();

		/**
		 * @see <a href="http://schema.org/PrependAction">http://schema.org/PrependAction</a>
		 */
		public PrependAction getPrependAction();
		public void setPrependAction(PrependAction prependAction);
		public List<PrependAction> getPrependActionList();
		public void setPrependActionList(List<PrependAction> prependActionList);
		public boolean hasPrependAction();

		/**
		 * @see <a href="http://schema.org/Preschool">http://schema.org/Preschool</a>
		 */
		public Preschool getPreschool();
		public void setPreschool(Preschool preschool);
		public List<Preschool> getPreschoolList();
		public void setPreschoolList(List<Preschool> preschoolList);
		public boolean hasPreschool();

		/**
		 * @see <a href="http://schema.org/PresentationDigitalDocument">http://schema.org/PresentationDigitalDocument</a>
		 */
		public PresentationDigitalDocument getPresentationDigitalDocument();
		public void setPresentationDigitalDocument(PresentationDigitalDocument presentationDigitalDocument);
		public List<PresentationDigitalDocument> getPresentationDigitalDocumentList();
		public void setPresentationDigitalDocumentList(List<PresentationDigitalDocument> presentationDigitalDocumentList);
		public boolean hasPresentationDigitalDocument();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PriceSpecification">http://schema.org/PriceSpecification</a>
		 */
		public PriceSpecification getPriceSpecification();
		public void setPriceSpecification(PriceSpecification priceSpecification);
		public List<PriceSpecification> getPriceSpecificationList();
		public void setPriceSpecificationList(List<PriceSpecification> priceSpecificationList);
		public boolean hasPriceSpecification();

		/**
		 * @see <a href="http://schema.org/PrimaryCare">http://schema.org/PrimaryCare</a>
		 */
		public PrimaryCare getPrimaryCare();
		public void setPrimaryCare(PrimaryCare primaryCare);
		public List<PrimaryCare> getPrimaryCareList();
		public void setPrimaryCareList(List<PrimaryCare> primaryCareList);
		public boolean hasPrimaryCare();

		/**
		 * @see <a href="http://schema.org/Product">http://schema.org/Product</a>
		 */
		public Product getProduct();
		public void setProduct(Product product);
		public List<Product> getProductList();
		public void setProductList(List<Product> productList);
		public boolean hasProduct();

		/**
		 * @see <a href="http://schema.org/ProductModel">http://schema.org/ProductModel</a>
		 */
		public ProductModel getProductModel();
		public void setProductModel(ProductModel productModel);
		public List<ProductModel> getProductModelList();
		public void setProductModelList(List<ProductModel> productModelList);
		public boolean hasProductModel();

		/**
		 * @see <a href="http://schema.org/ProfessionalService">http://schema.org/ProfessionalService</a>
		 */
		public ProfessionalService getProfessionalService();
		public void setProfessionalService(ProfessionalService professionalService);
		public List<ProfessionalService> getProfessionalServiceList();
		public void setProfessionalServiceList(List<ProfessionalService> professionalServiceList);
		public boolean hasProfessionalService();

		/**
		 * @see <a href="http://schema.org/ProfilePage">http://schema.org/ProfilePage</a>
		 */
		public ProfilePage getProfilePage();
		public void setProfilePage(ProfilePage profilePage);
		public List<ProfilePage> getProfilePageList();
		public void setProfilePageList(List<ProfilePage> profilePageList);
		public boolean hasProfilePage();

		/**
		 * @see <a href="http://schema.org/ProgramMembership">http://schema.org/ProgramMembership</a>
		 */
		public ProgramMembership getProgramMembership();
		public void setProgramMembership(ProgramMembership programMembership);
		public List<ProgramMembership> getProgramMembershipList();
		public void setProgramMembershipList(List<ProgramMembership> programMembershipList);
		public boolean hasProgramMembership();

		/**
		 * @see <a href="http://schema.org/Property">http://schema.org/Property</a>
		 */
		public Property getProperty();
		public void setProperty(Property property);
		public List<Property> getPropertyList();
		public void setPropertyList(List<Property> propertyList);
		public boolean hasProperty();

		/**
		 * @see <a href="http://schema.org/PropertyValue">http://schema.org/PropertyValue</a>
		 */
		public PropertyValue getPropertyValue();
		public void setPropertyValue(PropertyValue propertyValue);
		public List<PropertyValue> getPropertyValueList();
		public void setPropertyValueList(List<PropertyValue> propertyValueList);
		public boolean hasPropertyValue();

		/**
		 * @see <a href="http://schema.org/PropertyValueSpecification">http://schema.org/PropertyValueSpecification</a>
		 */
		public PropertyValueSpecification getPropertyValueSpecification();
		public void setPropertyValueSpecification(PropertyValueSpecification propertyValueSpecification);
		public List<PropertyValueSpecification> getPropertyValueSpecificationList();
		public void setPropertyValueSpecificationList(List<PropertyValueSpecification> propertyValueSpecificationList);
		public boolean hasPropertyValueSpecification();

		/**
		 * @see <a href="http://schema.org/Psychiatric">http://schema.org/Psychiatric</a>
		 */
		public Psychiatric getPsychiatric();
		public void setPsychiatric(Psychiatric psychiatric);
		public List<Psychiatric> getPsychiatricList();
		public void setPsychiatricList(List<Psychiatric> psychiatricList);
		public boolean hasPsychiatric();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/PublicHealth">http://schema.org/PublicHealth</a>
		 */
		public PublicHealth getPublicHealth();
		public void setPublicHealth(PublicHealth publicHealth);
		public List<PublicHealth> getPublicHealthList();
		public void setPublicHealthList(List<PublicHealth> publicHealthList);
		public boolean hasPublicHealth();

		/**
		 * @see <a href="http://schema.org/PublicSwimmingPool">http://schema.org/PublicSwimmingPool</a>
		 */
		public PublicSwimmingPool getPublicSwimmingPool();
		public void setPublicSwimmingPool(PublicSwimmingPool publicSwimmingPool);
		public List<PublicSwimmingPool> getPublicSwimmingPoolList();
		public void setPublicSwimmingPoolList(List<PublicSwimmingPool> publicSwimmingPoolList);
		public boolean hasPublicSwimmingPool();

		/**
		 * @see <a href="http://schema.org/PublicToilet">http://schema.org/PublicToilet</a>
		 */
		public PublicToilet getPublicToilet();
		public void setPublicToilet(PublicToilet publicToilet);
		public List<PublicToilet> getPublicToiletList();
		public void setPublicToiletList(List<PublicToilet> publicToiletList);
		public boolean hasPublicToilet();

		/**
		 * @see <a href="http://schema.org/PublicationEvent">http://schema.org/PublicationEvent</a>
		 */
		public PublicationEvent getPublicationEvent();
		public void setPublicationEvent(PublicationEvent publicationEvent);
		public List<PublicationEvent> getPublicationEventList();
		public void setPublicationEventList(List<PublicationEvent> publicationEventList);
		public boolean hasPublicationEvent();

		/**
		 * @see <a href="http://schema.org/PublicationIssue">http://schema.org/PublicationIssue</a>
		 */
		public PublicationIssue getPublicationIssue();
		public void setPublicationIssue(PublicationIssue publicationIssue);
		public List<PublicationIssue> getPublicationIssueList();
		public void setPublicationIssueList(List<PublicationIssue> publicationIssueList);
		public boolean hasPublicationIssue();

		/**
		 * @see <a href="http://schema.org/PublicationVolume">http://schema.org/PublicationVolume</a>
		 */
		public PublicationVolume getPublicationVolume();
		public void setPublicationVolume(PublicationVolume publicationVolume);
		public List<PublicationVolume> getPublicationVolumeList();
		public void setPublicationVolumeList(List<PublicationVolume> publicationVolumeList);
		public boolean hasPublicationVolume();

		/**
		 * @see <a href="http://schema.org/QAPage">http://schema.org/QAPage</a>
		 */
		public QAPage getQAPage();
		public void setQAPage(QAPage qaPage);
		public List<QAPage> getQAPageList();
		public void setQAPageList(List<QAPage> qaPageList);
		public boolean hasQAPage();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>
		 */
		public QuantitativeValue getQuantitativeValue();
		public void setQuantitativeValue(QuantitativeValue quantitativeValue);
		public List<QuantitativeValue> getQuantitativeValueList();
		public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList);
		public boolean hasQuantitativeValue();

		/**
		 * @see <a href="http://schema.org/QuantitativeValueDistribution">http://schema.org/QuantitativeValueDistribution</a>
		 */
		public QuantitativeValueDistribution getQuantitativeValueDistribution();
		public void setQuantitativeValueDistribution(QuantitativeValueDistribution quantitativeValueDistribution);
		public List<QuantitativeValueDistribution> getQuantitativeValueDistributionList();
		public void setQuantitativeValueDistributionList(List<QuantitativeValueDistribution> quantitativeValueDistributionList);
		public boolean hasQuantitativeValueDistribution();

		/**
		 * @see <a href="http://schema.org/Quantity">http://schema.org/Quantity</a>
		 */
		public Quantity getQuantity();
		public void setQuantity(Quantity quantity);
		public List<Quantity> getQuantityList();
		public void setQuantityList(List<Quantity> quantityList);
		public boolean hasQuantity();

		/**
		 * @see <a href="http://schema.org/Question">http://schema.org/Question</a>
		 */
		public Question getQuestion();
		public void setQuestion(Question question);
		public List<Question> getQuestionList();
		public void setQuestionList(List<Question> questionList);
		public boolean hasQuestion();

		/**
		 * @see <a href="http://schema.org/Quotation">http://schema.org/Quotation</a>
		 */
		public Quotation getQuotation();
		public void setQuotation(Quotation quotation);
		public List<Quotation> getQuotationList();
		public void setQuotationList(List<Quotation> quotationList);
		public boolean hasQuotation();

		/**
		 * @see <a href="http://schema.org/QuoteAction">http://schema.org/QuoteAction</a>
		 */
		public QuoteAction getQuoteAction();
		public void setQuoteAction(QuoteAction quoteAction);
		public List<QuoteAction> getQuoteActionList();
		public void setQuoteActionList(List<QuoteAction> quoteActionList);
		public boolean hasQuoteAction();

		/**
		 * @see <a href="http://schema.org/RVPark">http://schema.org/RVPark</a>
		 */
		public RVPark getRVPark();
		public void setRVPark(RVPark rvPark);
		public List<RVPark> getRVParkList();
		public void setRVParkList(List<RVPark> rvParkList);
		public boolean hasRVPark();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RadioChannel">http://schema.org/RadioChannel</a>
		 */
		public RadioChannel getRadioChannel();
		public void setRadioChannel(RadioChannel radioChannel);
		public List<RadioChannel> getRadioChannelList();
		public void setRadioChannelList(List<RadioChannel> radioChannelList);
		public boolean hasRadioChannel();

		/**
		 * @see <a href="http://schema.org/RadioClip">http://schema.org/RadioClip</a>
		 */
		public RadioClip getRadioClip();
		public void setRadioClip(RadioClip radioClip);
		public List<RadioClip> getRadioClipList();
		public void setRadioClipList(List<RadioClip> radioClipList);
		public boolean hasRadioClip();

		/**
		 * @see <a href="http://schema.org/RadioEpisode">http://schema.org/RadioEpisode</a>
		 */
		public RadioEpisode getRadioEpisode();
		public void setRadioEpisode(RadioEpisode radioEpisode);
		public List<RadioEpisode> getRadioEpisodeList();
		public void setRadioEpisodeList(List<RadioEpisode> radioEpisodeList);
		public boolean hasRadioEpisode();

		/**
		 * @see <a href="http://schema.org/RadioSeason">http://schema.org/RadioSeason</a>
		 */
		public RadioSeason getRadioSeason();
		public void setRadioSeason(RadioSeason radioSeason);
		public List<RadioSeason> getRadioSeasonList();
		public void setRadioSeasonList(List<RadioSeason> radioSeasonList);
		public boolean hasRadioSeason();

		/**
		 * @see <a href="http://schema.org/RadioSeries">http://schema.org/RadioSeries</a>
		 */
		public RadioSeries getRadioSeries();
		public void setRadioSeries(RadioSeries radioSeries);
		public List<RadioSeries> getRadioSeriesList();
		public void setRadioSeriesList(List<RadioSeries> radioSeriesList);
		public boolean hasRadioSeries();

		/**
		 * @see <a href="http://schema.org/RadioStation">http://schema.org/RadioStation</a>
		 */
		public RadioStation getRadioStation();
		public void setRadioStation(RadioStation radioStation);
		public List<RadioStation> getRadioStationList();
		public void setRadioStationList(List<RadioStation> radioStationList);
		public boolean hasRadioStation();

		/**
		 * @see <a href="http://schema.org/Rating">http://schema.org/Rating</a>
		 */
		public Rating getRating();
		public void setRating(Rating rating);
		public List<Rating> getRatingList();
		public void setRatingList(List<Rating> ratingList);
		public boolean hasRating();

		/**
		 * @see <a href="http://schema.org/ReactAction">http://schema.org/ReactAction</a>
		 */
		public ReactAction getReactAction();
		public void setReactAction(ReactAction reactAction);
		public List<ReactAction> getReactActionList();
		public void setReactActionList(List<ReactAction> reactActionList);
		public boolean hasReactAction();

		/**
		 * @see <a href="http://schema.org/ReadAction">http://schema.org/ReadAction</a>
		 */
		public ReadAction getReadAction();
		public void setReadAction(ReadAction readAction);
		public List<ReadAction> getReadActionList();
		public void setReadActionList(List<ReadAction> readActionList);
		public boolean hasReadAction();

		/**
		 * @see <a href="http://schema.org/RealEstateAgent">http://schema.org/RealEstateAgent</a>
		 */
		public RealEstateAgent getRealEstateAgent();
		public void setRealEstateAgent(RealEstateAgent realEstateAgent);
		public List<RealEstateAgent> getRealEstateAgentList();
		public void setRealEstateAgentList(List<RealEstateAgent> realEstateAgentList);
		public boolean hasRealEstateAgent();

		/**
		 * @see <a href="http://schema.org/ReceiveAction">http://schema.org/ReceiveAction</a>
		 */
		public ReceiveAction getReceiveAction();
		public void setReceiveAction(ReceiveAction receiveAction);
		public List<ReceiveAction> getReceiveActionList();
		public void setReceiveActionList(List<ReceiveAction> receiveActionList);
		public boolean hasReceiveAction();

		/**
		 * @see <a href="http://schema.org/Recipe">http://schema.org/Recipe</a>
		 */
		public Recipe getRecipe();
		public void setRecipe(Recipe recipe);
		public List<Recipe> getRecipeList();
		public void setRecipeList(List<Recipe> recipeList);
		public boolean hasRecipe();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RecyclingCenter">http://schema.org/RecyclingCenter</a>
		 */
		public RecyclingCenter getRecyclingCenter();
		public void setRecyclingCenter(RecyclingCenter recyclingCenter);
		public List<RecyclingCenter> getRecyclingCenterList();
		public void setRecyclingCenterList(List<RecyclingCenter> recyclingCenterList);
		public boolean hasRecyclingCenter();

		/**
		 * @see <a href="http://schema.org/RegisterAction">http://schema.org/RegisterAction</a>
		 */
		public RegisterAction getRegisterAction();
		public void setRegisterAction(RegisterAction registerAction);
		public List<RegisterAction> getRegisterActionList();
		public void setRegisterActionList(List<RegisterAction> registerActionList);
		public boolean hasRegisterAction();

		/**
		 * @see <a href="http://schema.org/RejectAction">http://schema.org/RejectAction</a>
		 */
		public RejectAction getRejectAction();
		public void setRejectAction(RejectAction rejectAction);
		public List<RejectAction> getRejectActionList();
		public void setRejectActionList(List<RejectAction> rejectActionList);
		public boolean hasRejectAction();

		/**
		 * @see <a href="http://schema.org/RentAction">http://schema.org/RentAction</a>
		 */
		public RentAction getRentAction();
		public void setRentAction(RentAction rentAction);
		public List<RentAction> getRentActionList();
		public void setRentActionList(List<RentAction> rentActionList);
		public boolean hasRentAction();

		/**
		 * @see <a href="http://schema.org/RentalCarReservation">http://schema.org/RentalCarReservation</a>
		 */
		public RentalCarReservation getRentalCarReservation();
		public void setRentalCarReservation(RentalCarReservation rentalCarReservation);
		public List<RentalCarReservation> getRentalCarReservationList();
		public void setRentalCarReservationList(List<RentalCarReservation> rentalCarReservationList);
		public boolean hasRentalCarReservation();

		/**
		 * @see <a href="http://schema.org/RepaymentSpecification">http://schema.org/RepaymentSpecification</a>
		 */
		public RepaymentSpecification getRepaymentSpecification();
		public void setRepaymentSpecification(RepaymentSpecification repaymentSpecification);
		public List<RepaymentSpecification> getRepaymentSpecificationList();
		public void setRepaymentSpecificationList(List<RepaymentSpecification> repaymentSpecificationList);
		public boolean hasRepaymentSpecification();

		/**
		 * @see <a href="http://schema.org/ReplaceAction">http://schema.org/ReplaceAction</a>
		 */
		public ReplaceAction getReplaceAction();
		public void setReplaceAction(ReplaceAction replaceAction);
		public List<ReplaceAction> getReplaceActionList();
		public void setReplaceActionList(List<ReplaceAction> replaceActionList);
		public boolean hasReplaceAction();

		/**
		 * @see <a href="http://schema.org/ReplyAction">http://schema.org/ReplyAction</a>
		 */
		public ReplyAction getReplyAction();
		public void setReplyAction(ReplyAction replyAction);
		public List<ReplyAction> getReplyActionList();
		public void setReplyActionList(List<ReplyAction> replyActionList);
		public boolean hasReplyAction();

		/**
		 * @see <a href="http://schema.org/Report">http://schema.org/Report</a>
		 */
		public Report getReport();
		public void setReport(Report report);
		public List<Report> getReportList();
		public void setReportList(List<Report> reportList);
		public boolean hasReport();

		/**
		 * @see <a href="http://schema.org/ReportageNewsArticle">http://schema.org/ReportageNewsArticle</a>
		 */
		public ReportageNewsArticle getReportageNewsArticle();
		public void setReportageNewsArticle(ReportageNewsArticle reportageNewsArticle);
		public List<ReportageNewsArticle> getReportageNewsArticleList();
		public void setReportageNewsArticleList(List<ReportageNewsArticle> reportageNewsArticleList);
		public boolean hasReportageNewsArticle();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Reservation">http://schema.org/Reservation</a>
		 */
		public Reservation getReservation();
		public void setReservation(Reservation reservation);
		public List<Reservation> getReservationList();
		public void setReservationList(List<Reservation> reservationList);
		public boolean hasReservation();

		/**
		 * @see <a href="http://schema.org/ReservationPackage">http://schema.org/ReservationPackage</a>
		 */
		public ReservationPackage getReservationPackage();
		public void setReservationPackage(ReservationPackage reservationPackage);
		public List<ReservationPackage> getReservationPackageList();
		public void setReservationPackageList(List<ReservationPackage> reservationPackageList);
		public boolean hasReservationPackage();

		/**
		 * @see <a href="http://schema.org/ReservationStatusType">http://schema.org/ReservationStatusType</a>
		 */
		public ReservationStatusType getReservationStatusType();
		public void setReservationStatusType(ReservationStatusType reservationStatusType);
		public List<ReservationStatusType> getReservationStatusTypeList();
		public void setReservationStatusTypeList(List<ReservationStatusType> reservationStatusTypeList);
		public boolean hasReservationStatusType();

		/**
		 * @see <a href="http://schema.org/ReserveAction">http://schema.org/ReserveAction</a>
		 */
		public ReserveAction getReserveAction();
		public void setReserveAction(ReserveAction reserveAction);
		public List<ReserveAction> getReserveActionList();
		public void setReserveActionList(List<ReserveAction> reserveActionList);
		public boolean hasReserveAction();

		/**
		 * @see <a href="http://schema.org/Reservoir">http://schema.org/Reservoir</a>
		 */
		public Reservoir getReservoir();
		public void setReservoir(Reservoir reservoir);
		public List<Reservoir> getReservoirList();
		public void setReservoirList(List<Reservoir> reservoirList);
		public boolean hasReservoir();

		/**
		 * @see <a href="http://schema.org/Residence">http://schema.org/Residence</a>
		 */
		public Residence getResidence();
		public void setResidence(Residence residence);
		public List<Residence> getResidenceList();
		public void setResidenceList(List<Residence> residenceList);
		public boolean hasResidence();

		/**
		 * @see <a href="http://schema.org/Resort">http://schema.org/Resort</a>
		 */
		public Resort getResort();
		public void setResort(Resort resort);
		public List<Resort> getResortList();
		public void setResortList(List<Resort> resortList);
		public boolean hasResort();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Restaurant">http://schema.org/Restaurant</a>
		 */
		public Restaurant getRestaurant();
		public void setRestaurant(Restaurant restaurant);
		public List<Restaurant> getRestaurantList();
		public void setRestaurantList(List<Restaurant> restaurantList);
		public boolean hasRestaurant();

		/**
		 * @see <a href="http://schema.org/RestrictedDiet">http://schema.org/RestrictedDiet</a>
		 */
		public RestrictedDiet getRestrictedDiet();
		public void setRestrictedDiet(RestrictedDiet restrictedDiet);
		public List<RestrictedDiet> getRestrictedDietList();
		public void setRestrictedDietList(List<RestrictedDiet> restrictedDietList);
		public boolean hasRestrictedDiet();

		/**
		 * @see <a href="http://schema.org/ResumeAction">http://schema.org/ResumeAction</a>
		 */
		public ResumeAction getResumeAction();
		public void setResumeAction(ResumeAction resumeAction);
		public List<ResumeAction> getResumeActionList();
		public void setResumeActionList(List<ResumeAction> resumeActionList);
		public boolean hasResumeAction();

		/**
		 * @see <a href="http://schema.org/ReturnAction">http://schema.org/ReturnAction</a>
		 */
		public ReturnAction getReturnAction();
		public void setReturnAction(ReturnAction returnAction);
		public List<ReturnAction> getReturnActionList();
		public void setReturnActionList(List<ReturnAction> returnActionList);
		public boolean hasReturnAction();

		/**
		 * @see <a href="http://schema.org/Review">http://schema.org/Review</a>
		 */
		public Review getReview();
		public void setReview(Review review);
		public List<Review> getReviewList();
		public void setReviewList(List<Review> reviewList);
		public boolean hasReview();

		/**
		 * @see <a href="http://schema.org/ReviewAction">http://schema.org/ReviewAction</a>
		 */
		public ReviewAction getReviewAction();
		public void setReviewAction(ReviewAction reviewAction);
		public List<ReviewAction> getReviewActionList();
		public void setReviewActionList(List<ReviewAction> reviewActionList);
		public boolean hasReviewAction();

		/**
		 * @see <a href="http://schema.org/ReviewNewsArticle">http://schema.org/ReviewNewsArticle</a>
		 */
		public ReviewNewsArticle getReviewNewsArticle();
		public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle);
		public List<ReviewNewsArticle> getReviewNewsArticleList();
		public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList);
		public boolean hasReviewNewsArticle();

		/**
		 * @see <a href="http://schema.org/RiverBodyOfWater">http://schema.org/RiverBodyOfWater</a>
		 */
		public RiverBodyOfWater getRiverBodyOfWater();
		public void setRiverBodyOfWater(RiverBodyOfWater riverBodyOfWater);
		public List<RiverBodyOfWater> getRiverBodyOfWaterList();
		public void setRiverBodyOfWaterList(List<RiverBodyOfWater> riverBodyOfWaterList);
		public boolean hasRiverBodyOfWater();

		/**
		 * @see <a href="http://schema.org/Role">http://schema.org/Role</a>
		 */
		public Role getRole();
		public void setRole(Role role);
		public List<Role> getRoleList();
		public void setRoleList(List<Role> roleList);
		public boolean hasRole();

		/**
		 * @see <a href="http://schema.org/RoofingContractor">http://schema.org/RoofingContractor</a>
		 */
		public RoofingContractor getRoofingContractor();
		public void setRoofingContractor(RoofingContractor roofingContractor);
		public List<RoofingContractor> getRoofingContractorList();
		public void setRoofingContractorList(List<RoofingContractor> roofingContractorList);
		public boolean hasRoofingContractor();

		/**
		 * @see <a href="http://schema.org/Room">http://schema.org/Room</a>
		 */
		public Room getRoom();
		public void setRoom(Room room);
		public List<Room> getRoomList();
		public void setRoomList(List<Room> roomList);
		public boolean hasRoom();

		/**
		 * @see <a href="http://schema.org/RsvpAction">http://schema.org/RsvpAction</a>
		 */
		public RsvpAction getRsvpAction();
		public void setRsvpAction(RsvpAction rsvpAction);
		public List<RsvpAction> getRsvpActionList();
		public void setRsvpActionList(List<RsvpAction> rsvpActionList);
		public boolean hasRsvpAction();

		/**
		 * @see <a href="http://schema.org/RsvpResponseType">http://schema.org/RsvpResponseType</a>
		 */
		public RsvpResponseType getRsvpResponseType();
		public void setRsvpResponseType(RsvpResponseType rsvpResponseType);
		public List<RsvpResponseType> getRsvpResponseTypeList();
		public void setRsvpResponseTypeList(List<RsvpResponseType> rsvpResponseTypeList);
		public boolean hasRsvpResponseType();

		/**
		 * @see <a href="http://schema.org/SaleEvent">http://schema.org/SaleEvent</a>
		 */
		public SaleEvent getSaleEvent();
		public void setSaleEvent(SaleEvent saleEvent);
		public List<SaleEvent> getSaleEventList();
		public void setSaleEventList(List<SaleEvent> saleEventList);
		public boolean hasSaleEvent();

		/**
		 * @see <a href="http://schema.org/SatiricalArticle">http://schema.org/SatiricalArticle</a>
		 */
		public SatiricalArticle getSatiricalArticle();
		public void setSatiricalArticle(SatiricalArticle satiricalArticle);
		public List<SatiricalArticle> getSatiricalArticleList();
		public void setSatiricalArticleList(List<SatiricalArticle> satiricalArticleList);
		public boolean hasSatiricalArticle();

		/**
		 * @see <a href="http://schema.org/Schedule">http://schema.org/Schedule</a>
		 */
		public Schedule getSchedule();
		public void setSchedule(Schedule schedule);
		public List<Schedule> getScheduleList();
		public void setScheduleList(List<Schedule> scheduleList);
		public boolean hasSchedule();

		/**
		 * @see <a href="http://schema.org/ScheduleAction">http://schema.org/ScheduleAction</a>
		 */
		public ScheduleAction getScheduleAction();
		public void setScheduleAction(ScheduleAction scheduleAction);
		public List<ScheduleAction> getScheduleActionList();
		public void setScheduleActionList(List<ScheduleAction> scheduleActionList);
		public boolean hasScheduleAction();

		/**
		 * @see <a href="http://schema.org/ScholarlyArticle">http://schema.org/ScholarlyArticle</a>
		 */
		public ScholarlyArticle getScholarlyArticle();
		public void setScholarlyArticle(ScholarlyArticle scholarlyArticle);
		public List<ScholarlyArticle> getScholarlyArticleList();
		public void setScholarlyArticleList(List<ScholarlyArticle> scholarlyArticleList);
		public boolean hasScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/School">http://schema.org/School</a>
		 */
		public School getSchool();
		public void setSchool(School school);
		public List<School> getSchoolList();
		public void setSchoolList(List<School> schoolList);
		public boolean hasSchool();

		/**
		 * @see <a href="http://schema.org/ScreeningEvent">http://schema.org/ScreeningEvent</a>
		 */
		public ScreeningEvent getScreeningEvent();
		public void setScreeningEvent(ScreeningEvent screeningEvent);
		public List<ScreeningEvent> getScreeningEventList();
		public void setScreeningEventList(List<ScreeningEvent> screeningEventList);
		public boolean hasScreeningEvent();

		/**
		 * @see <a href="http://schema.org/Sculpture">http://schema.org/Sculpture</a>
		 */
		public Sculpture getSculpture();
		public void setSculpture(Sculpture sculpture);
		public List<Sculpture> getSculptureList();
		public void setSculptureList(List<Sculpture> sculptureList);
		public boolean hasSculpture();

		/**
		 * @see <a href="http://schema.org/SeaBodyOfWater">http://schema.org/SeaBodyOfWater</a>
		 */
		public SeaBodyOfWater getSeaBodyOfWater();
		public void setSeaBodyOfWater(SeaBodyOfWater seaBodyOfWater);
		public List<SeaBodyOfWater> getSeaBodyOfWaterList();
		public void setSeaBodyOfWaterList(List<SeaBodyOfWater> seaBodyOfWaterList);
		public boolean hasSeaBodyOfWater();

		/**
		 * @see <a href="http://schema.org/SearchAction">http://schema.org/SearchAction</a>
		 */
		public SearchAction getSearchAction();
		public void setSearchAction(SearchAction searchAction);
		public List<SearchAction> getSearchActionList();
		public void setSearchActionList(List<SearchAction> searchActionList);
		public boolean hasSearchAction();

		/**
		 * @see <a href="http://schema.org/SearchResultsPage">http://schema.org/SearchResultsPage</a>
		 */
		public SearchResultsPage getSearchResultsPage();
		public void setSearchResultsPage(SearchResultsPage searchResultsPage);
		public List<SearchResultsPage> getSearchResultsPageList();
		public void setSearchResultsPageList(List<SearchResultsPage> searchResultsPageList);
		public boolean hasSearchResultsPage();

		/**
		 * @see <a href="http://schema.org/Seat">http://schema.org/Seat</a>
		 */
		public Seat getSeat();
		public void setSeat(Seat seat);
		public List<Seat> getSeatList();
		public void setSeatList(List<Seat> seatList);
		public boolean hasSeat();

		/**
		 * @see <a href="http://schema.org/SelfStorage">http://schema.org/SelfStorage</a>
		 */
		public SelfStorage getSelfStorage();
		public void setSelfStorage(SelfStorage selfStorage);
		public List<SelfStorage> getSelfStorageList();
		public void setSelfStorageList(List<SelfStorage> selfStorageList);
		public boolean hasSelfStorage();

		/**
		 * @see <a href="http://schema.org/SellAction">http://schema.org/SellAction</a>
		 */
		public SellAction getSellAction();
		public void setSellAction(SellAction sellAction);
		public List<SellAction> getSellActionList();
		public void setSellActionList(List<SellAction> sellActionList);
		public boolean hasSellAction();

		/**
		 * @see <a href="http://schema.org/SendAction">http://schema.org/SendAction</a>
		 */
		public SendAction getSendAction();
		public void setSendAction(SendAction sendAction);
		public List<SendAction> getSendActionList();
		public void setSendActionList(List<SendAction> sendActionList);
		public boolean hasSendAction();

		/**
		 * @see <a href="http://schema.org/Series">http://schema.org/Series</a>
		 */
		public Series getSeries();
		public void setSeries(Series series);
		public List<Series> getSeriesList();
		public void setSeriesList(List<Series> seriesList);
		public boolean hasSeries();

		/**
		 * @see <a href="http://schema.org/Service">http://schema.org/Service</a>
		 */
		public Service getService();
		public void setService(Service service);
		public List<Service> getServiceList();
		public void setServiceList(List<Service> serviceList);
		public boolean hasService();

		/**
		 * @see <a href="http://schema.org/ServiceChannel">http://schema.org/ServiceChannel</a>
		 */
		public ServiceChannel getServiceChannel();
		public void setServiceChannel(ServiceChannel serviceChannel);
		public List<ServiceChannel> getServiceChannelList();
		public void setServiceChannelList(List<ServiceChannel> serviceChannelList);
		public boolean hasServiceChannel();

		/**
		 * @see <a href="http://schema.org/ShareAction">http://schema.org/ShareAction</a>
		 */
		public ShareAction getShareAction();
		public void setShareAction(ShareAction shareAction);
		public List<ShareAction> getShareActionList();
		public void setShareActionList(List<ShareAction> shareActionList);
		public boolean hasShareAction();

		/**
		 * @see <a href="http://schema.org/ShoeStore">http://schema.org/ShoeStore</a>
		 */
		public ShoeStore getShoeStore();
		public void setShoeStore(ShoeStore shoeStore);
		public List<ShoeStore> getShoeStoreList();
		public void setShoeStoreList(List<ShoeStore> shoeStoreList);
		public boolean hasShoeStore();

		/**
		 * @see <a href="http://schema.org/ShoppingCenter">http://schema.org/ShoppingCenter</a>
		 */
		public ShoppingCenter getShoppingCenter();
		public void setShoppingCenter(ShoppingCenter shoppingCenter);
		public List<ShoppingCenter> getShoppingCenterList();
		public void setShoppingCenterList(List<ShoppingCenter> shoppingCenterList);
		public boolean hasShoppingCenter();

		/**
		 * @see <a href="http://schema.org/SingleFamilyResidence">http://schema.org/SingleFamilyResidence</a>
		 */
		public SingleFamilyResidence getSingleFamilyResidence();
		public void setSingleFamilyResidence(SingleFamilyResidence singleFamilyResidence);
		public List<SingleFamilyResidence> getSingleFamilyResidenceList();
		public void setSingleFamilyResidenceList(List<SingleFamilyResidence> singleFamilyResidenceList);
		public boolean hasSingleFamilyResidence();

		/**
		 * @see <a href="http://schema.org/SiteNavigationElement">http://schema.org/SiteNavigationElement</a>
		 */
		public SiteNavigationElement getSiteNavigationElement();
		public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement);
		public List<SiteNavigationElement> getSiteNavigationElementList();
		public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList);
		public boolean hasSiteNavigationElement();

		/**
		 * @see <a href="http://schema.org/SkiResort">http://schema.org/SkiResort</a>
		 */
		public SkiResort getSkiResort();
		public void setSkiResort(SkiResort skiResort);
		public List<SkiResort> getSkiResortList();
		public void setSkiResortList(List<SkiResort> skiResortList);
		public boolean hasSkiResort();

		/**
		 * @see <a href="http://schema.org/SocialEvent">http://schema.org/SocialEvent</a>
		 */
		public SocialEvent getSocialEvent();
		public void setSocialEvent(SocialEvent socialEvent);
		public List<SocialEvent> getSocialEventList();
		public void setSocialEventList(List<SocialEvent> socialEventList);
		public boolean hasSocialEvent();

		/**
		 * @see <a href="http://schema.org/SocialMediaPosting">http://schema.org/SocialMediaPosting</a>
		 */
		public SocialMediaPosting getSocialMediaPosting();
		public void setSocialMediaPosting(SocialMediaPosting socialMediaPosting);
		public List<SocialMediaPosting> getSocialMediaPostingList();
		public void setSocialMediaPostingList(List<SocialMediaPosting> socialMediaPostingList);
		public boolean hasSocialMediaPosting();

		/**
		 * @see <a href="http://schema.org/SoftwareApplication">http://schema.org/SoftwareApplication</a>
		 */
		public SoftwareApplication getSoftwareApplication();
		public void setSoftwareApplication(SoftwareApplication softwareApplication);
		public List<SoftwareApplication> getSoftwareApplicationList();
		public void setSoftwareApplicationList(List<SoftwareApplication> softwareApplicationList);
		public boolean hasSoftwareApplication();

		/**
		 * @see <a href="http://schema.org/SoftwareSourceCode">http://schema.org/SoftwareSourceCode</a>
		 */
		public SoftwareSourceCode getSoftwareSourceCode();
		public void setSoftwareSourceCode(SoftwareSourceCode softwareSourceCode);
		public List<SoftwareSourceCode> getSoftwareSourceCodeList();
		public void setSoftwareSourceCodeList(List<SoftwareSourceCode> softwareSourceCodeList);
		public boolean hasSoftwareSourceCode();

		/**
		 * @see <a href="http://schema.org/SomeProducts">http://schema.org/SomeProducts</a>
		 */
		public SomeProducts getSomeProducts();
		public void setSomeProducts(SomeProducts someProducts);
		public List<SomeProducts> getSomeProductsList();
		public void setSomeProductsList(List<SomeProducts> someProductsList);
		public boolean hasSomeProducts();

		/**
		 * @see <a href="http://schema.org/SpeakableSpecification">http://schema.org/SpeakableSpecification</a>
		 */
		public SpeakableSpecification getSpeakableSpecification();
		public void setSpeakableSpecification(SpeakableSpecification speakableSpecification);
		public List<SpeakableSpecification> getSpeakableSpecificationList();
		public void setSpeakableSpecificationList(List<SpeakableSpecification> speakableSpecificationList);
		public boolean hasSpeakableSpecification();

		/**
		 * @see <a href="http://schema.org/Specialty">http://schema.org/Specialty</a>
		 */
		public Specialty getSpecialty();
		public void setSpecialty(Specialty specialty);
		public List<Specialty> getSpecialtyList();
		public void setSpecialtyList(List<Specialty> specialtyList);
		public boolean hasSpecialty();

		/**
		 * @see <a href="http://schema.org/SportingGoodsStore">http://schema.org/SportingGoodsStore</a>
		 */
		public SportingGoodsStore getSportingGoodsStore();
		public void setSportingGoodsStore(SportingGoodsStore sportingGoodsStore);
		public List<SportingGoodsStore> getSportingGoodsStoreList();
		public void setSportingGoodsStoreList(List<SportingGoodsStore> sportingGoodsStoreList);
		public boolean hasSportingGoodsStore();

		/**
		 * @see <a href="http://schema.org/SportsActivityLocation">http://schema.org/SportsActivityLocation</a>
		 */
		public SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation);
		public List<SportsActivityLocation> getSportsActivityLocationList();
		public void setSportsActivityLocationList(List<SportsActivityLocation> sportsActivityLocationList);
		public boolean hasSportsActivityLocation();

		/**
		 * @see <a href="http://schema.org/SportsClub">http://schema.org/SportsClub</a>
		 */
		public SportsClub getSportsClub();
		public void setSportsClub(SportsClub sportsClub);
		public List<SportsClub> getSportsClubList();
		public void setSportsClubList(List<SportsClub> sportsClubList);
		public boolean hasSportsClub();

		/**
		 * @see <a href="http://schema.org/SportsEvent">http://schema.org/SportsEvent</a>
		 */
		public SportsEvent getSportsEvent();
		public void setSportsEvent(SportsEvent sportsEvent);
		public List<SportsEvent> getSportsEventList();
		public void setSportsEventList(List<SportsEvent> sportsEventList);
		public boolean hasSportsEvent();

		/**
		 * @see <a href="http://schema.org/SportsOrganization">http://schema.org/SportsOrganization</a>
		 */
		public SportsOrganization getSportsOrganization();
		public void setSportsOrganization(SportsOrganization sportsOrganization);
		public List<SportsOrganization> getSportsOrganizationList();
		public void setSportsOrganizationList(List<SportsOrganization> sportsOrganizationList);
		public boolean hasSportsOrganization();

		/**
		 * @see <a href="http://schema.org/SportsTeam">http://schema.org/SportsTeam</a>
		 */
		public SportsTeam getSportsTeam();
		public void setSportsTeam(SportsTeam sportsTeam);
		public List<SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		/**
		 * @see <a href="http://schema.org/SpreadsheetDigitalDocument">http://schema.org/SpreadsheetDigitalDocument</a>
		 */
		public SpreadsheetDigitalDocument getSpreadsheetDigitalDocument();
		public void setSpreadsheetDigitalDocument(SpreadsheetDigitalDocument spreadsheetDigitalDocument);
		public List<SpreadsheetDigitalDocument> getSpreadsheetDigitalDocumentList();
		public void setSpreadsheetDigitalDocumentList(List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList);
		public boolean hasSpreadsheetDigitalDocument();

		/**
		 * @see <a href="http://schema.org/StadiumOrArena">http://schema.org/StadiumOrArena</a>
		 */
		public StadiumOrArena getStadiumOrArena();
		public void setStadiumOrArena(StadiumOrArena stadiumOrArena);
		public List<StadiumOrArena> getStadiumOrArenaList();
		public void setStadiumOrArenaList(List<StadiumOrArena> stadiumOrArenaList);
		public boolean hasStadiumOrArena();

		/**
		 * @see <a href="http://schema.org/State">http://schema.org/State</a>
		 */
		public State getState();
		public void setState(State state);
		public List<State> getStateList();
		public void setStateList(List<State> stateList);
		public boolean hasState();

		/**
		 * @see <a href="http://schema.org/SteeringPositionValue">http://schema.org/SteeringPositionValue</a>
		 */
		public SteeringPositionValue getSteeringPositionValue();
		public void setSteeringPositionValue(SteeringPositionValue steeringPositionValue);
		public List<SteeringPositionValue> getSteeringPositionValueList();
		public void setSteeringPositionValueList(List<SteeringPositionValue> steeringPositionValueList);
		public boolean hasSteeringPositionValue();

		/**
		 * @see <a href="http://schema.org/Store">http://schema.org/Store</a>
		 */
		public Store getStore();
		public void setStore(Store store);
		public List<Store> getStoreList();
		public void setStoreList(List<Store> storeList);
		public boolean hasStore();

		/**
		 * @see <a href="http://schema.org/StructuredValue">http://schema.org/StructuredValue</a>
		 */
		public StructuredValue getStructuredValue();
		public void setStructuredValue(StructuredValue structuredValue);
		public List<StructuredValue> getStructuredValueList();
		public void setStructuredValueList(List<StructuredValue> structuredValueList);
		public boolean hasStructuredValue();

		/**
		 * @see <a href="http://schema.org/SubscribeAction">http://schema.org/SubscribeAction</a>
		 */
		public SubscribeAction getSubscribeAction();
		public void setSubscribeAction(SubscribeAction subscribeAction);
		public List<SubscribeAction> getSubscribeActionList();
		public void setSubscribeActionList(List<SubscribeAction> subscribeActionList);
		public boolean hasSubscribeAction();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SubwayStation">http://schema.org/SubwayStation</a>
		 */
		public SubwayStation getSubwayStation();
		public void setSubwayStation(SubwayStation subwayStation);
		public List<SubwayStation> getSubwayStationList();
		public void setSubwayStationList(List<SubwayStation> subwayStationList);
		public boolean hasSubwayStation();

		/**
		 * @see <a href="http://schema.org/Suite">http://schema.org/Suite</a>
		 */
		public Suite getSuite();
		public void setSuite(Suite suite);
		public List<Suite> getSuiteList();
		public void setSuiteList(List<Suite> suiteList);
		public boolean hasSuite();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/SuspendAction">http://schema.org/SuspendAction</a>
		 */
		public SuspendAction getSuspendAction();
		public void setSuspendAction(SuspendAction suspendAction);
		public List<SuspendAction> getSuspendActionList();
		public void setSuspendActionList(List<SuspendAction> suspendActionList);
		public boolean hasSuspendAction();

		/**
		 * @see <a href="http://schema.org/Synagogue">http://schema.org/Synagogue</a>
		 */
		public Synagogue getSynagogue();
		public void setSynagogue(Synagogue synagogue);
		public List<Synagogue> getSynagogueList();
		public void setSynagogueList(List<Synagogue> synagogueList);
		public boolean hasSynagogue();

		/**
		 * @see <a href="http://schema.org/TVClip">http://schema.org/TVClip</a>
		 */
		public TVClip getTVClip();
		public void setTVClip(TVClip tvClip);
		public List<TVClip> getTVClipList();
		public void setTVClipList(List<TVClip> tvClipList);
		public boolean hasTVClip();

		/**
		 * @see <a href="http://schema.org/TVEpisode">http://schema.org/TVEpisode</a>
		 */
		public TVEpisode getTVEpisode();
		public void setTVEpisode(TVEpisode tvEpisode);
		public List<TVEpisode> getTVEpisodeList();
		public void setTVEpisodeList(List<TVEpisode> tvEpisodeList);
		public boolean hasTVEpisode();

		/**
		 * @see <a href="http://schema.org/TVSeason">http://schema.org/TVSeason</a>
		 */
		public TVSeason getTVSeason();
		public void setTVSeason(TVSeason tvSeason);
		public List<TVSeason> getTVSeasonList();
		public void setTVSeasonList(List<TVSeason> tvSeasonList);
		public boolean hasTVSeason();

		/**
		 * @see <a href="http://schema.org/TVSeries">http://schema.org/TVSeries</a>
		 */
		public TVSeries getTVSeries();
		public void setTVSeries(TVSeries tvSeries);
		public List<TVSeries> getTVSeriesList();
		public void setTVSeriesList(List<TVSeries> tvSeriesList);
		public boolean hasTVSeries();

		/**
		 * @see <a href="http://schema.org/Table">http://schema.org/Table</a>
		 */
		public Table getTable();
		public void setTable(Table table);
		public List<Table> getTableList();
		public void setTableList(List<Table> tableList);
		public boolean hasTable();

		/**
		 * @see <a href="http://schema.org/TakeAction">http://schema.org/TakeAction</a>
		 */
		public TakeAction getTakeAction();
		public void setTakeAction(TakeAction takeAction);
		public List<TakeAction> getTakeActionList();
		public void setTakeActionList(List<TakeAction> takeActionList);
		public boolean hasTakeAction();

		/**
		 * @see <a href="http://schema.org/TattooParlor">http://schema.org/TattooParlor</a>
		 */
		public TattooParlor getTattooParlor();
		public void setTattooParlor(TattooParlor tattooParlor);
		public List<TattooParlor> getTattooParlorList();
		public void setTattooParlorList(List<TattooParlor> tattooParlorList);
		public boolean hasTattooParlor();

		/**
		 * @see <a href="http://schema.org/TaxiReservation">http://schema.org/TaxiReservation</a>
		 */
		public TaxiReservation getTaxiReservation();
		public void setTaxiReservation(TaxiReservation taxiReservation);
		public List<TaxiReservation> getTaxiReservationList();
		public void setTaxiReservationList(List<TaxiReservation> taxiReservationList);
		public boolean hasTaxiReservation();

		/**
		 * @see <a href="http://schema.org/TaxiService">http://schema.org/TaxiService</a>
		 */
		public TaxiService getTaxiService();
		public void setTaxiService(TaxiService taxiService);
		public List<TaxiService> getTaxiServiceList();
		public void setTaxiServiceList(List<TaxiService> taxiServiceList);
		public boolean hasTaxiService();

		/**
		 * @see <a href="http://schema.org/TaxiStand">http://schema.org/TaxiStand</a>
		 */
		public TaxiStand getTaxiStand();
		public void setTaxiStand(TaxiStand taxiStand);
		public List<TaxiStand> getTaxiStandList();
		public void setTaxiStandList(List<TaxiStand> taxiStandList);
		public boolean hasTaxiStand();

		/**
		 * @see <a href="http://schema.org/TechArticle">http://schema.org/TechArticle</a>
		 */
		public TechArticle getTechArticle();
		public void setTechArticle(TechArticle techArticle);
		public List<TechArticle> getTechArticleList();
		public void setTechArticleList(List<TechArticle> techArticleList);
		public boolean hasTechArticle();

		/**
		 * @see <a href="http://schema.org/TelevisionChannel">http://schema.org/TelevisionChannel</a>
		 */
		public TelevisionChannel getTelevisionChannel();
		public void setTelevisionChannel(TelevisionChannel televisionChannel);
		public List<TelevisionChannel> getTelevisionChannelList();
		public void setTelevisionChannelList(List<TelevisionChannel> televisionChannelList);
		public boolean hasTelevisionChannel();

		/**
		 * @see <a href="http://schema.org/TelevisionStation">http://schema.org/TelevisionStation</a>
		 */
		public TelevisionStation getTelevisionStation();
		public void setTelevisionStation(TelevisionStation televisionStation);
		public List<TelevisionStation> getTelevisionStationList();
		public void setTelevisionStationList(List<TelevisionStation> televisionStationList);
		public boolean hasTelevisionStation();

		/**
		 * @see <a href="http://schema.org/TennisComplex">http://schema.org/TennisComplex</a>
		 */
		public TennisComplex getTennisComplex();
		public void setTennisComplex(TennisComplex tennisComplex);
		public List<TennisComplex> getTennisComplexList();
		public void setTennisComplexList(List<TennisComplex> tennisComplexList);
		public boolean hasTennisComplex();

		/**
		 * @see <a href="http://schema.org/TextDigitalDocument">http://schema.org/TextDigitalDocument</a>
		 */
		public TextDigitalDocument getTextDigitalDocument();
		public void setTextDigitalDocument(TextDigitalDocument textDigitalDocument);
		public List<TextDigitalDocument> getTextDigitalDocumentList();
		public void setTextDigitalDocumentList(List<TextDigitalDocument> textDigitalDocumentList);
		public boolean hasTextDigitalDocument();

		/**
		 * @see <a href="http://schema.org/TheaterEvent">http://schema.org/TheaterEvent</a>
		 */
		public TheaterEvent getTheaterEvent();
		public void setTheaterEvent(TheaterEvent theaterEvent);
		public List<TheaterEvent> getTheaterEventList();
		public void setTheaterEventList(List<TheaterEvent> theaterEventList);
		public boolean hasTheaterEvent();

		/**
		 * @see <a href="http://schema.org/TheaterGroup">http://schema.org/TheaterGroup</a>
		 */
		public TheaterGroup getTheaterGroup();
		public void setTheaterGroup(TheaterGroup theaterGroup);
		public List<TheaterGroup> getTheaterGroupList();
		public void setTheaterGroupList(List<TheaterGroup> theaterGroupList);
		public boolean hasTheaterGroup();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/Thesis">http://schema.org/Thesis</a>
		 */
		public Thesis getThesis();
		public void setThesis(Thesis thesis);
		public List<Thesis> getThesisList();
		public void setThesisList(List<Thesis> thesisList);
		public boolean hasThesis();

		/**
		 * @see <a href="http://schema.org/Thing">http://schema.org/Thing</a>
		 */
		public Thing getThing();
		public void setThing(Thing thing);
		public List<Thing> getThingList();
		public void setThingList(List<Thing> thingList);
		public boolean hasThing();

		/**
		 * @see <a href="http://schema.org/Ticket">http://schema.org/Ticket</a>
		 */
		public Ticket getTicket();
		public void setTicket(Ticket ticket);
		public List<Ticket> getTicketList();
		public void setTicketList(List<Ticket> ticketList);
		public boolean hasTicket();

		/**
		 * @see <a href="http://schema.org/TieAction">http://schema.org/TieAction</a>
		 */
		public TieAction getTieAction();
		public void setTieAction(TieAction tieAction);
		public List<TieAction> getTieActionList();
		public void setTieActionList(List<TieAction> tieActionList);
		public boolean hasTieAction();

		/**
		 * @see <a href="http://schema.org/TipAction">http://schema.org/TipAction</a>
		 */
		public TipAction getTipAction();
		public void setTipAction(TipAction tipAction);
		public List<TipAction> getTipActionList();
		public void setTipActionList(List<TipAction> tipActionList);
		public boolean hasTipAction();

		/**
		 * @see <a href="http://schema.org/TireShop">http://schema.org/TireShop</a>
		 */
		public TireShop getTireShop();
		public void setTireShop(TireShop tireShop);
		public List<TireShop> getTireShopList();
		public void setTireShopList(List<TireShop> tireShopList);
		public boolean hasTireShop();

		/**
		 * @see <a href="http://schema.org/TouristAttraction">http://schema.org/TouristAttraction</a>
		 */
		public TouristAttraction getTouristAttraction();
		public void setTouristAttraction(TouristAttraction touristAttraction);
		public List<TouristAttraction> getTouristAttractionList();
		public void setTouristAttractionList(List<TouristAttraction> touristAttractionList);
		public boolean hasTouristAttraction();

		/**
		 * @see <a href="http://schema.org/TouristDestination">http://schema.org/TouristDestination</a>
		 */
		public TouristDestination getTouristDestination();
		public void setTouristDestination(TouristDestination touristDestination);
		public List<TouristDestination> getTouristDestinationList();
		public void setTouristDestinationList(List<TouristDestination> touristDestinationList);
		public boolean hasTouristDestination();

		/**
		 * @see <a href="http://schema.org/TouristInformationCenter">http://schema.org/TouristInformationCenter</a>
		 */
		public TouristInformationCenter getTouristInformationCenter();
		public void setTouristInformationCenter(TouristInformationCenter touristInformationCenter);
		public List<TouristInformationCenter> getTouristInformationCenterList();
		public void setTouristInformationCenterList(List<TouristInformationCenter> touristInformationCenterList);
		public boolean hasTouristInformationCenter();

		/**
		 * @see <a href="http://schema.org/TouristTrip">http://schema.org/TouristTrip</a>
		 */
		public TouristTrip getTouristTrip();
		public void setTouristTrip(TouristTrip touristTrip);
		public List<TouristTrip> getTouristTripList();
		public void setTouristTripList(List<TouristTrip> touristTripList);
		public boolean hasTouristTrip();

		/**
		 * @see <a href="http://schema.org/ToyStore">http://schema.org/ToyStore</a>
		 */
		public ToyStore getToyStore();
		public void setToyStore(ToyStore toyStore);
		public List<ToyStore> getToyStoreList();
		public void setToyStoreList(List<ToyStore> toyStoreList);
		public boolean hasToyStore();

		/**
		 * @see <a href="http://schema.org/TrackAction">http://schema.org/TrackAction</a>
		 */
		public TrackAction getTrackAction();
		public void setTrackAction(TrackAction trackAction);
		public List<TrackAction> getTrackActionList();
		public void setTrackActionList(List<TrackAction> trackActionList);
		public boolean hasTrackAction();

		/**
		 * @see <a href="http://schema.org/TradeAction">http://schema.org/TradeAction</a>
		 */
		public TradeAction getTradeAction();
		public void setTradeAction(TradeAction tradeAction);
		public List<TradeAction> getTradeActionList();
		public void setTradeActionList(List<TradeAction> tradeActionList);
		public boolean hasTradeAction();

		/**
		 * @see <a href="http://schema.org/TrainReservation">http://schema.org/TrainReservation</a>
		 */
		public TrainReservation getTrainReservation();
		public void setTrainReservation(TrainReservation trainReservation);
		public List<TrainReservation> getTrainReservationList();
		public void setTrainReservationList(List<TrainReservation> trainReservationList);
		public boolean hasTrainReservation();

		/**
		 * @see <a href="http://schema.org/TrainStation">http://schema.org/TrainStation</a>
		 */
		public TrainStation getTrainStation();
		public void setTrainStation(TrainStation trainStation);
		public List<TrainStation> getTrainStationList();
		public void setTrainStationList(List<TrainStation> trainStationList);
		public boolean hasTrainStation();

		/**
		 * @see <a href="http://schema.org/TrainTrip">http://schema.org/TrainTrip</a>
		 */
		public TrainTrip getTrainTrip();
		public void setTrainTrip(TrainTrip trainTrip);
		public List<TrainTrip> getTrainTripList();
		public void setTrainTripList(List<TrainTrip> trainTripList);
		public boolean hasTrainTrip();

		/**
		 * @see <a href="http://schema.org/TransferAction">http://schema.org/TransferAction</a>
		 */
		public TransferAction getTransferAction();
		public void setTransferAction(TransferAction transferAction);
		public List<TransferAction> getTransferActionList();
		public void setTransferActionList(List<TransferAction> transferActionList);
		public boolean hasTransferAction();

		/**
		 * @see <a href="http://schema.org/TravelAction">http://schema.org/TravelAction</a>
		 */
		public TravelAction getTravelAction();
		public void setTravelAction(TravelAction travelAction);
		public List<TravelAction> getTravelActionList();
		public void setTravelActionList(List<TravelAction> travelActionList);
		public boolean hasTravelAction();

		/**
		 * @see <a href="http://schema.org/TravelAgency">http://schema.org/TravelAgency</a>
		 */
		public TravelAgency getTravelAgency();
		public void setTravelAgency(TravelAgency travelAgency);
		public List<TravelAgency> getTravelAgencyList();
		public void setTravelAgencyList(List<TravelAgency> travelAgencyList);
		public boolean hasTravelAgency();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Trip">http://schema.org/Trip</a>
		 */
		public Trip getTrip();
		public void setTrip(Trip trip);
		public List<Trip> getTripList();
		public void setTripList(List<Trip> tripList);
		public boolean hasTrip();

		/**
		 * @see <a href="http://schema.org/TypeAndQuantityNode">http://schema.org/TypeAndQuantityNode</a>
		 */
		public TypeAndQuantityNode getTypeAndQuantityNode();
		public void setTypeAndQuantityNode(TypeAndQuantityNode typeAndQuantityNode);
		public List<TypeAndQuantityNode> getTypeAndQuantityNodeList();
		public void setTypeAndQuantityNodeList(List<TypeAndQuantityNode> typeAndQuantityNodeList);
		public boolean hasTypeAndQuantityNode();

		/**
		 * @see <a href="http://schema.org/UnRegisterAction">http://schema.org/UnRegisterAction</a>
		 */
		public UnRegisterAction getUnRegisterAction();
		public void setUnRegisterAction(UnRegisterAction unRegisterAction);
		public List<UnRegisterAction> getUnRegisterActionList();
		public void setUnRegisterActionList(List<UnRegisterAction> unRegisterActionList);
		public boolean hasUnRegisterAction();

		/**
		 * @see <a href="http://schema.org/UnitPriceSpecification">http://schema.org/UnitPriceSpecification</a>
		 */
		public UnitPriceSpecification getUnitPriceSpecification();
		public void setUnitPriceSpecification(UnitPriceSpecification unitPriceSpecification);
		public List<UnitPriceSpecification> getUnitPriceSpecificationList();
		public void setUnitPriceSpecificationList(List<UnitPriceSpecification> unitPriceSpecificationList);
		public boolean hasUnitPriceSpecification();

		/**
		 * @see <a href="http://schema.org/UpdateAction">http://schema.org/UpdateAction</a>
		 */
		public UpdateAction getUpdateAction();
		public void setUpdateAction(UpdateAction updateAction);
		public List<UpdateAction> getUpdateActionList();
		public void setUpdateActionList(List<UpdateAction> updateActionList);
		public boolean hasUpdateAction();

		/**
		 * @see <a href="http://schema.org/UseAction">http://schema.org/UseAction</a>
		 */
		public UseAction getUseAction();
		public void setUseAction(UseAction useAction);
		public List<UseAction> getUseActionList();
		public void setUseActionList(List<UseAction> useActionList);
		public boolean hasUseAction();

		/**
		 * @see <a href="http://schema.org/UserReview">http://schema.org/UserReview</a>
		 */
		public UserReview getUserReview();
		public void setUserReview(UserReview userReview);
		public List<UserReview> getUserReviewList();
		public void setUserReviewList(List<UserReview> userReviewList);
		public boolean hasUserReview();

		/**
		 * @see <a href="http://schema.org/Vehicle">http://schema.org/Vehicle</a>
		 */
		public Vehicle getVehicle();
		public void setVehicle(Vehicle vehicle);
		public List<Vehicle> getVehicleList();
		public void setVehicleList(List<Vehicle> vehicleList);
		public boolean hasVehicle();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VeterinaryCare">http://schema.org/VeterinaryCare</a>
		 */
		public Clazz.VeterinaryCare getVeterinaryCare();
		public void setVeterinaryCare(Clazz.VeterinaryCare veterinaryCare);
		public List<Clazz.VeterinaryCare> getVeterinaryCareList();
		public void setVeterinaryCareList(List<Clazz.VeterinaryCare> veterinaryCareList);
		public boolean hasVeterinaryCare();

		/**
		 * @see <a href="http://schema.org/VideoGallery">http://schema.org/VideoGallery</a>
		 */
		public VideoGallery getVideoGallery();
		public void setVideoGallery(VideoGallery videoGallery);
		public List<VideoGallery> getVideoGalleryList();
		public void setVideoGalleryList(List<VideoGallery> videoGalleryList);
		public boolean hasVideoGallery();

		/**
		 * @see <a href="http://schema.org/VideoGame">http://schema.org/VideoGame</a>
		 */
		public VideoGame getVideoGame();
		public void setVideoGame(VideoGame videoGame);
		public List<VideoGame> getVideoGameList();
		public void setVideoGameList(List<VideoGame> videoGameList);
		public boolean hasVideoGame();

		/**
		 * @see <a href="http://schema.org/VideoGameClip">http://schema.org/VideoGameClip</a>
		 */
		public VideoGameClip getVideoGameClip();
		public void setVideoGameClip(VideoGameClip videoGameClip);
		public List<VideoGameClip> getVideoGameClipList();
		public void setVideoGameClipList(List<VideoGameClip> videoGameClipList);
		public boolean hasVideoGameClip();

		/**
		 * @see <a href="http://schema.org/VideoGameSeries">http://schema.org/VideoGameSeries</a>
		 */
		public VideoGameSeries getVideoGameSeries();
		public void setVideoGameSeries(VideoGameSeries videoGameSeries);
		public List<VideoGameSeries> getVideoGameSeriesList();
		public void setVideoGameSeriesList(List<VideoGameSeries> videoGameSeriesList);
		public boolean hasVideoGameSeries();

		/**
		 * @see <a href="http://schema.org/VideoObject">http://schema.org/VideoObject</a>
		 */
		public VideoObject getVideoObject();
		public void setVideoObject(VideoObject videoObject);
		public List<VideoObject> getVideoObjectList();
		public void setVideoObjectList(List<VideoObject> videoObjectList);
		public boolean hasVideoObject();

		/**
		 * @see <a href="http://schema.org/ViewAction">http://schema.org/ViewAction</a>
		 */
		public ViewAction getViewAction();
		public void setViewAction(ViewAction viewAction);
		public List<ViewAction> getViewActionList();
		public void setViewActionList(List<ViewAction> viewActionList);
		public boolean hasViewAction();

		/**
		 * @see <a href="http://schema.org/VisualArtsEvent">http://schema.org/VisualArtsEvent</a>
		 */
		public VisualArtsEvent getVisualArtsEvent();
		public void setVisualArtsEvent(VisualArtsEvent visualArtsEvent);
		public List<VisualArtsEvent> getVisualArtsEventList();
		public void setVisualArtsEventList(List<VisualArtsEvent> visualArtsEventList);
		public boolean hasVisualArtsEvent();

		/**
		 * @see <a href="http://schema.org/VisualArtwork">http://schema.org/VisualArtwork</a>
		 */
		public VisualArtwork getVisualArtwork();
		public void setVisualArtwork(VisualArtwork visualArtwork);
		public List<VisualArtwork> getVisualArtworkList();
		public void setVisualArtworkList(List<VisualArtwork> visualArtworkList);
		public boolean hasVisualArtwork();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		/**
		 * @see <a href="http://schema.org/Volcano">http://schema.org/Volcano</a>
		 */
		public Volcano getVolcano();
		public void setVolcano(Volcano volcano);
		public List<Volcano> getVolcanoList();
		public void setVolcanoList(List<Volcano> volcanoList);
		public boolean hasVolcano();

		/**
		 * @see <a href="http://schema.org/VoteAction">http://schema.org/VoteAction</a>
		 */
		public VoteAction getVoteAction();
		public void setVoteAction(VoteAction voteAction);
		public List<VoteAction> getVoteActionList();
		public void setVoteActionList(List<VoteAction> voteActionList);
		public boolean hasVoteAction();

		/**
		 * @see <a href="http://schema.org/WPAdBlock">http://schema.org/WPAdBlock</a>
		 */
		public WPAdBlock getWPAdBlock();
		public void setWPAdBlock(WPAdBlock wpAdBlock);
		public List<WPAdBlock> getWPAdBlockList();
		public void setWPAdBlockList(List<WPAdBlock> wpAdBlockList);
		public boolean hasWPAdBlock();

		/**
		 * @see <a href="http://schema.org/WPFooter">http://schema.org/WPFooter</a>
		 */
		public WPFooter getWPFooter();
		public void setWPFooter(WPFooter wpFooter);
		public List<WPFooter> getWPFooterList();
		public void setWPFooterList(List<WPFooter> wpFooterList);
		public boolean hasWPFooter();

		/**
		 * @see <a href="http://schema.org/WPHeader">http://schema.org/WPHeader</a>
		 */
		public WPHeader getWPHeader();
		public void setWPHeader(WPHeader wpHeader);
		public List<WPHeader> getWPHeaderList();
		public void setWPHeaderList(List<WPHeader> wpHeaderList);
		public boolean hasWPHeader();

		/**
		 * @see <a href="http://schema.org/WPSideBar">http://schema.org/WPSideBar</a>
		 */
		public WPSideBar getWPSideBar();
		public void setWPSideBar(WPSideBar wpSideBar);
		public List<WPSideBar> getWPSideBarList();
		public void setWPSideBarList(List<WPSideBar> wpSideBarList);
		public boolean hasWPSideBar();

		/**
		 * @see <a href="http://schema.org/WantAction">http://schema.org/WantAction</a>
		 */
		public WantAction getWantAction();
		public void setWantAction(WantAction wantAction);
		public List<WantAction> getWantActionList();
		public void setWantActionList(List<WantAction> wantActionList);
		public boolean hasWantAction();

		/**
		 * @see <a href="http://schema.org/WarrantyPromise">http://schema.org/WarrantyPromise</a>
		 */
		public WarrantyPromise getWarrantyPromise();
		public void setWarrantyPromise(WarrantyPromise warrantyPromise);
		public List<WarrantyPromise> getWarrantyPromiseList();
		public void setWarrantyPromiseList(List<WarrantyPromise> warrantyPromiseList);
		public boolean hasWarrantyPromise();

		/**
		 * @see <a href="http://schema.org/WarrantyScope">http://schema.org/WarrantyScope</a>
		 */
		public WarrantyScope getWarrantyScope();
		public void setWarrantyScope(WarrantyScope warrantyScope);
		public List<WarrantyScope> getWarrantyScopeList();
		public void setWarrantyScopeList(List<WarrantyScope> warrantyScopeList);
		public boolean hasWarrantyScope();

		/**
		 * @see <a href="http://schema.org/WatchAction">http://schema.org/WatchAction</a>
		 */
		public WatchAction getWatchAction();
		public void setWatchAction(WatchAction watchAction);
		public List<WatchAction> getWatchActionList();
		public void setWatchActionList(List<WatchAction> watchActionList);
		public boolean hasWatchAction();

		/**
		 * @see <a href="http://schema.org/Waterfall">http://schema.org/Waterfall</a>
		 */
		public Waterfall getWaterfall();
		public void setWaterfall(Waterfall waterfall);
		public List<Waterfall> getWaterfallList();
		public void setWaterfallList(List<Waterfall> waterfallList);
		public boolean hasWaterfall();

		/**
		 * @see <a href="http://schema.org/WearAction">http://schema.org/WearAction</a>
		 */
		public WearAction getWearAction();
		public void setWearAction(WearAction wearAction);
		public List<WearAction> getWearActionList();
		public void setWearActionList(List<WearAction> wearActionList);
		public boolean hasWearAction();

		/**
		 * @see <a href="http://schema.org/WebAPI">http://schema.org/WebAPI</a>
		 */
		public WebAPI getWebAPI();
		public void setWebAPI(WebAPI webAPI);
		public List<WebAPI> getWebAPIList();
		public void setWebAPIList(List<WebAPI> webAPIList);
		public boolean hasWebAPI();

		/**
		 * @see <a href="http://schema.org/WebApplication">http://schema.org/WebApplication</a>
		 */
		public WebApplication getWebApplication();
		public void setWebApplication(WebApplication webApplication);
		public List<WebApplication> getWebApplicationList();
		public void setWebApplicationList(List<WebApplication> webApplicationList);
		public boolean hasWebApplication();

		/**
		 * @see <a href="http://schema.org/WebPage">http://schema.org/WebPage</a>
		 */
		public WebPage getWebPage();
		public void setWebPage(WebPage webPage);
		public List<WebPage> getWebPageList();
		public void setWebPageList(List<WebPage> webPageList);
		public boolean hasWebPage();

		/**
		 * @see <a href="http://schema.org/WebPageElement">http://schema.org/WebPageElement</a>
		 */
		public WebPageElement getWebPageElement();
		public void setWebPageElement(WebPageElement webPageElement);
		public List<WebPageElement> getWebPageElementList();
		public void setWebPageElementList(List<WebPageElement> webPageElementList);
		public boolean hasWebPageElement();

		/**
		 * @see <a href="http://schema.org/WebSite">http://schema.org/WebSite</a>
		 */
		public WebSite getWebSite();
		public void setWebSite(WebSite webSite);
		public List<WebSite> getWebSiteList();
		public void setWebSiteList(List<WebSite> webSiteList);
		public boolean hasWebSite();

		/**
		 * @see <a href="http://schema.org/WholesaleStore">http://schema.org/WholesaleStore</a>
		 */
		public WholesaleStore getWholesaleStore();
		public void setWholesaleStore(WholesaleStore wholesaleStore);
		public List<WholesaleStore> getWholesaleStoreList();
		public void setWholesaleStoreList(List<WholesaleStore> wholesaleStoreList);
		public boolean hasWholesaleStore();

		/**
		 * @see <a href="http://schema.org/WinAction">http://schema.org/WinAction</a>
		 */
		public WinAction getWinAction();
		public void setWinAction(WinAction winAction);
		public List<WinAction> getWinActionList();
		public void setWinActionList(List<WinAction> winActionList);
		public boolean hasWinAction();

		/**
		 * @see <a href="http://schema.org/Winery">http://schema.org/Winery</a>
		 */
		public Winery getWinery();
		public void setWinery(Winery winery);
		public List<Winery> getWineryList();
		public void setWineryList(List<Winery> wineryList);
		public boolean hasWinery();

		/**
		 * @see <a href="http://schema.org/WorkersUnion">http://schema.org/WorkersUnion</a>
		 */
		public WorkersUnion getWorkersUnion();
		public void setWorkersUnion(WorkersUnion workersUnion);
		public List<WorkersUnion> getWorkersUnionList();
		public void setWorkersUnionList(List<WorkersUnion> workersUnionList);
		public boolean hasWorkersUnion();

		/**
		 * @see <a href="http://schema.org/WriteAction">http://schema.org/WriteAction</a>
		 */
		public WriteAction getWriteAction();
		public void setWriteAction(WriteAction writeAction);
		public List<WriteAction> getWriteActionList();
		public void setWriteActionList(List<WriteAction> writeActionList);
		public boolean hasWriteAction();

		/**
		 * @see <a href="http://schema.org/Zoo">http://schema.org/Zoo</a>
		 */
		public Zoo getZoo();
		public void setZoo(Zoo zoo);
		public List<Zoo> getZooList();
		public void setZooList(List<Zoo> zooList);
		public boolean hasZoo();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recognizingAuthority")
	@SchemaOrgLabel("recognizingAuthority")
	@SchemaOrgComment(""
			+ "If applicable, the organization that officially recognizes this entity as part"
			+ " of its endorsed system of medicine.")
	@CamelizedName("recognizingAuthority")
	@ConstantizedName("RECOGNIZING_AUTHORITY")
	public interface RecognizingAuthority extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AccountingService">http://schema.org/AccountingService</a>
		 */
		public AccountingService getAccountingService();
		public void setAccountingService(AccountingService accountingService);
		public List<AccountingService> getAccountingServiceList();
		public void setAccountingServiceList(List<AccountingService> accountingServiceList);
		public boolean hasAccountingService();

		/**
		 * @see <a href="http://schema.org/AdultEntertainment">http://schema.org/AdultEntertainment</a>
		 */
		public AdultEntertainment getAdultEntertainment();
		public void setAdultEntertainment(AdultEntertainment adultEntertainment);
		public List<AdultEntertainment> getAdultEntertainmentList();
		public void setAdultEntertainmentList(List<AdultEntertainment> adultEntertainmentList);
		public boolean hasAdultEntertainment();

		/**
		 * @see <a href="http://schema.org/Airline">http://schema.org/Airline</a>
		 */
		public Airline getAirline();
		public void setAirline(Airline airline);
		public List<Airline> getAirlineList();
		public void setAirlineList(List<Airline> airlineList);
		public boolean hasAirline();

		/**
		 * @see <a href="http://schema.org/AmusementPark">http://schema.org/AmusementPark</a>
		 */
		public AmusementPark getAmusementPark();
		public void setAmusementPark(AmusementPark amusementPark);
		public List<AmusementPark> getAmusementParkList();
		public void setAmusementParkList(List<AmusementPark> amusementParkList);
		public boolean hasAmusementPark();

		/**
		 * @see <a href="http://schema.org/AnimalShelter">http://schema.org/AnimalShelter</a>
		 */
		public AnimalShelter getAnimalShelter();
		public void setAnimalShelter(AnimalShelter animalShelter);
		public List<AnimalShelter> getAnimalShelterList();
		public void setAnimalShelterList(List<AnimalShelter> animalShelterList);
		public boolean hasAnimalShelter();

		/**
		 * @see <a href="http://schema.org/ArtGallery">http://schema.org/ArtGallery</a>
		 */
		public ArtGallery getArtGallery();
		public void setArtGallery(ArtGallery artGallery);
		public List<ArtGallery> getArtGalleryList();
		public void setArtGalleryList(List<ArtGallery> artGalleryList);
		public boolean hasArtGallery();

		/**
		 * @see <a href="http://schema.org/Attorney">http://schema.org/Attorney</a>
		 */
		public Attorney getAttorney();
		public void setAttorney(Attorney attorney);
		public List<Attorney> getAttorneyList();
		public void setAttorneyList(List<Attorney> attorneyList);
		public boolean hasAttorney();

		/**
		 * @see <a href="http://schema.org/AutoBodyShop">http://schema.org/AutoBodyShop</a>
		 */
		public AutoBodyShop getAutoBodyShop();
		public void setAutoBodyShop(AutoBodyShop autoBodyShop);
		public List<AutoBodyShop> getAutoBodyShopList();
		public void setAutoBodyShopList(List<AutoBodyShop> autoBodyShopList);
		public boolean hasAutoBodyShop();

		/**
		 * @see <a href="http://schema.org/AutoDealer">http://schema.org/AutoDealer</a>
		 */
		public AutoDealer getAutoDealer();
		public void setAutoDealer(AutoDealer autoDealer);
		public List<AutoDealer> getAutoDealerList();
		public void setAutoDealerList(List<AutoDealer> autoDealerList);
		public boolean hasAutoDealer();

		/**
		 * @see <a href="http://schema.org/AutoPartsStore">http://schema.org/AutoPartsStore</a>
		 */
		public AutoPartsStore getAutoPartsStore();
		public void setAutoPartsStore(AutoPartsStore autoPartsStore);
		public List<AutoPartsStore> getAutoPartsStoreList();
		public void setAutoPartsStoreList(List<AutoPartsStore> autoPartsStoreList);
		public boolean hasAutoPartsStore();

		/**
		 * @see <a href="http://schema.org/AutoRental">http://schema.org/AutoRental</a>
		 */
		public AutoRental getAutoRental();
		public void setAutoRental(AutoRental autoRental);
		public List<AutoRental> getAutoRentalList();
		public void setAutoRentalList(List<AutoRental> autoRentalList);
		public boolean hasAutoRental();

		/**
		 * @see <a href="http://schema.org/AutoRepair">http://schema.org/AutoRepair</a>
		 */
		public AutoRepair getAutoRepair();
		public void setAutoRepair(AutoRepair autoRepair);
		public List<AutoRepair> getAutoRepairList();
		public void setAutoRepairList(List<AutoRepair> autoRepairList);
		public boolean hasAutoRepair();

		/**
		 * @see <a href="http://schema.org/AutoWash">http://schema.org/AutoWash</a>
		 */
		public AutoWash getAutoWash();
		public void setAutoWash(AutoWash autoWash);
		public List<AutoWash> getAutoWashList();
		public void setAutoWashList(List<AutoWash> autoWashList);
		public boolean hasAutoWash();

		/**
		 * @see <a href="http://schema.org/AutomatedTeller">http://schema.org/AutomatedTeller</a>
		 */
		public AutomatedTeller getAutomatedTeller();
		public void setAutomatedTeller(AutomatedTeller automatedTeller);
		public List<AutomatedTeller> getAutomatedTellerList();
		public void setAutomatedTellerList(List<AutomatedTeller> automatedTellerList);
		public boolean hasAutomatedTeller();

		/**
		 * @see <a href="http://schema.org/AutomotiveBusiness">http://schema.org/AutomotiveBusiness</a>
		 */
		public AutomotiveBusiness getAutomotiveBusiness();
		public void setAutomotiveBusiness(AutomotiveBusiness automotiveBusiness);
		public List<AutomotiveBusiness> getAutomotiveBusinessList();
		public void setAutomotiveBusinessList(List<AutomotiveBusiness> automotiveBusinessList);
		public boolean hasAutomotiveBusiness();

		/**
		 * @see <a href="http://schema.org/Bakery">http://schema.org/Bakery</a>
		 */
		public Bakery getBakery();
		public void setBakery(Bakery bakery);
		public List<Bakery> getBakeryList();
		public void setBakeryList(List<Bakery> bakeryList);
		public boolean hasBakery();

		/**
		 * @see <a href="http://schema.org/BankOrCreditUnion">http://schema.org/BankOrCreditUnion</a>
		 */
		public BankOrCreditUnion getBankOrCreditUnion();
		public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion);
		public List<BankOrCreditUnion> getBankOrCreditUnionList();
		public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList);
		public boolean hasBankOrCreditUnion();

		/**
		 * @see <a href="http://schema.org/BarOrPub">http://schema.org/BarOrPub</a>
		 */
		public BarOrPub getBarOrPub();
		public void setBarOrPub(BarOrPub barOrPub);
		public List<BarOrPub> getBarOrPubList();
		public void setBarOrPubList(List<BarOrPub> barOrPubList);
		public boolean hasBarOrPub();

		/**
		 * @see <a href="http://schema.org/BeautySalon">http://schema.org/BeautySalon</a>
		 */
		public BeautySalon getBeautySalon();
		public void setBeautySalon(BeautySalon beautySalon);
		public List<BeautySalon> getBeautySalonList();
		public void setBeautySalonList(List<BeautySalon> beautySalonList);
		public boolean hasBeautySalon();

		/**
		 * @see <a href="http://schema.org/BedAndBreakfast">http://schema.org/BedAndBreakfast</a>
		 */
		public BedAndBreakfast getBedAndBreakfast();
		public void setBedAndBreakfast(BedAndBreakfast bedAndBreakfast);
		public List<BedAndBreakfast> getBedAndBreakfastList();
		public void setBedAndBreakfastList(List<BedAndBreakfast> bedAndBreakfastList);
		public boolean hasBedAndBreakfast();

		/**
		 * @see <a href="http://schema.org/BikeStore">http://schema.org/BikeStore</a>
		 */
		public BikeStore getBikeStore();
		public void setBikeStore(BikeStore bikeStore);
		public List<BikeStore> getBikeStoreList();
		public void setBikeStoreList(List<BikeStore> bikeStoreList);
		public boolean hasBikeStore();

		/**
		 * @see <a href="http://schema.org/BookStore">http://schema.org/BookStore</a>
		 */
		public BookStore getBookStore();
		public void setBookStore(BookStore bookStore);
		public List<BookStore> getBookStoreList();
		public void setBookStoreList(List<BookStore> bookStoreList);
		public boolean hasBookStore();

		/**
		 * @see <a href="http://schema.org/BowlingAlley">http://schema.org/BowlingAlley</a>
		 */
		public BowlingAlley getBowlingAlley();
		public void setBowlingAlley(BowlingAlley bowlingAlley);
		public List<BowlingAlley> getBowlingAlleyList();
		public void setBowlingAlleyList(List<BowlingAlley> bowlingAlleyList);
		public boolean hasBowlingAlley();

		/**
		 * @see <a href="http://schema.org/Brewery">http://schema.org/Brewery</a>
		 */
		public Brewery getBrewery();
		public void setBrewery(Brewery brewery);
		public List<Brewery> getBreweryList();
		public void setBreweryList(List<Brewery> breweryList);
		public boolean hasBrewery();

		/**
		 * @see <a href="http://schema.org/CafeOrCoffeeShop">http://schema.org/CafeOrCoffeeShop</a>
		 */
		public CafeOrCoffeeShop getCafeOrCoffeeShop();
		public void setCafeOrCoffeeShop(CafeOrCoffeeShop cafeOrCoffeeShop);
		public List<CafeOrCoffeeShop> getCafeOrCoffeeShopList();
		public void setCafeOrCoffeeShopList(List<CafeOrCoffeeShop> cafeOrCoffeeShopList);
		public boolean hasCafeOrCoffeeShop();

		/**
		 * @see <a href="http://schema.org/Campground">http://schema.org/Campground</a>
		 */
		public Campground getCampground();
		public void setCampground(Campground campground);
		public List<Campground> getCampgroundList();
		public void setCampgroundList(List<Campground> campgroundList);
		public boolean hasCampground();

		/**
		 * @see <a href="http://schema.org/Casino">http://schema.org/Casino</a>
		 */
		public Casino getCasino();
		public void setCasino(Casino casino);
		public List<Casino> getCasinoList();
		public void setCasinoList(List<Casino> casinoList);
		public boolean hasCasino();

		/**
		 * @see <a href="http://schema.org/ChildCare">http://schema.org/ChildCare</a>
		 */
		public ChildCare getChildCare();
		public void setChildCare(ChildCare childCare);
		public List<ChildCare> getChildCareList();
		public void setChildCareList(List<ChildCare> childCareList);
		public boolean hasChildCare();

		/**
		 * @see <a href="http://schema.org/ClothingStore">http://schema.org/ClothingStore</a>
		 */
		public ClothingStore getClothingStore();
		public void setClothingStore(ClothingStore clothingStore);
		public List<ClothingStore> getClothingStoreList();
		public void setClothingStoreList(List<ClothingStore> clothingStoreList);
		public boolean hasClothingStore();

		/**
		 * @see <a href="http://schema.org/CollegeOrUniversity">http://schema.org/CollegeOrUniversity</a>
		 */
		public CollegeOrUniversity getCollegeOrUniversity();
		public void setCollegeOrUniversity(CollegeOrUniversity collegeOrUniversity);
		public List<CollegeOrUniversity> getCollegeOrUniversityList();
		public void setCollegeOrUniversityList(List<CollegeOrUniversity> collegeOrUniversityList);
		public boolean hasCollegeOrUniversity();

		/**
		 * @see <a href="http://schema.org/ComedyClub">http://schema.org/ComedyClub</a>
		 */
		public ComedyClub getComedyClub();
		public void setComedyClub(ComedyClub comedyClub);
		public List<ComedyClub> getComedyClubList();
		public void setComedyClubList(List<ComedyClub> comedyClubList);
		public boolean hasComedyClub();

		/**
		 * @see <a href="http://schema.org/CommunityHealth">http://schema.org/CommunityHealth</a>
		 */
		public CommunityHealth getCommunityHealth();
		public void setCommunityHealth(CommunityHealth communityHealth);
		public List<CommunityHealth> getCommunityHealthList();
		public void setCommunityHealthList(List<CommunityHealth> communityHealthList);
		public boolean hasCommunityHealth();

		/**
		 * @see <a href="http://schema.org/ComputerStore">http://schema.org/ComputerStore</a>
		 */
		public ComputerStore getComputerStore();
		public void setComputerStore(ComputerStore computerStore);
		public List<ComputerStore> getComputerStoreList();
		public void setComputerStoreList(List<ComputerStore> computerStoreList);
		public boolean hasComputerStore();

		/**
		 * @see <a href="http://schema.org/Consortium">http://schema.org/Consortium</a>
		 */
		public Consortium getConsortium();
		public void setConsortium(Consortium consortium);
		public List<Consortium> getConsortiumList();
		public void setConsortiumList(List<Consortium> consortiumList);
		public boolean hasConsortium();

		/**
		 * @see <a href="http://schema.org/ConvenienceStore">http://schema.org/ConvenienceStore</a>
		 */
		public ConvenienceStore getConvenienceStore();
		public void setConvenienceStore(ConvenienceStore convenienceStore);
		public List<ConvenienceStore> getConvenienceStoreList();
		public void setConvenienceStoreList(List<ConvenienceStore> convenienceStoreList);
		public boolean hasConvenienceStore();

		/**
		 * @see <a href="http://schema.org/Corporation">http://schema.org/Corporation</a>
		 */
		public Corporation getCorporation();
		public void setCorporation(Corporation corporation);
		public List<Corporation> getCorporationList();
		public void setCorporationList(List<Corporation> corporationList);
		public boolean hasCorporation();

		/**
		 * @see <a href="http://schema.org/DanceGroup">http://schema.org/DanceGroup</a>
		 */
		public DanceGroup getDanceGroup();
		public void setDanceGroup(DanceGroup danceGroup);
		public List<DanceGroup> getDanceGroupList();
		public void setDanceGroupList(List<DanceGroup> danceGroupList);
		public boolean hasDanceGroup();

		/**
		 * @see <a href="http://schema.org/DaySpa">http://schema.org/DaySpa</a>
		 */
		public DaySpa getDaySpa();
		public void setDaySpa(DaySpa daySpa);
		public List<DaySpa> getDaySpaList();
		public void setDaySpaList(List<DaySpa> daySpaList);
		public boolean hasDaySpa();

		/**
		 * @see <a href="http://schema.org/Dentist">http://schema.org/Dentist</a>
		 */
		public Dentist getDentist();
		public void setDentist(Dentist dentist);
		public List<Dentist> getDentistList();
		public void setDentistList(List<Dentist> dentistList);
		public boolean hasDentist();

		/**
		 * @see <a href="http://schema.org/DepartmentStore">http://schema.org/DepartmentStore</a>
		 */
		public DepartmentStore getDepartmentStore();
		public void setDepartmentStore(DepartmentStore departmentStore);
		public List<DepartmentStore> getDepartmentStoreList();
		public void setDepartmentStoreList(List<DepartmentStore> departmentStoreList);
		public boolean hasDepartmentStore();

		/**
		 * @see <a href="http://schema.org/Dermatology">http://schema.org/Dermatology</a>
		 */
		public Dermatology getDermatology();
		public void setDermatology(Dermatology dermatology);
		public List<Dermatology> getDermatologyList();
		public void setDermatologyList(List<Dermatology> dermatologyList);
		public boolean hasDermatology();

		/**
		 * @see <a href="http://schema.org/DiagnosticLab">http://schema.org/DiagnosticLab</a>
		 */
		public Clazz.DiagnosticLab getDiagnosticLab();
		public void setDiagnosticLab(Clazz.DiagnosticLab diagnosticLab);
		public List<Clazz.DiagnosticLab> getDiagnosticLabList();
		public void setDiagnosticLabList(List<Clazz.DiagnosticLab> diagnosticLabList);
		public boolean hasDiagnosticLab();

		/**
		 * @see <a href="http://schema.org/DietNutrition">http://schema.org/DietNutrition</a>
		 */
		public DietNutrition getDietNutrition();
		public void setDietNutrition(DietNutrition dietNutrition);
		public List<DietNutrition> getDietNutritionList();
		public void setDietNutritionList(List<DietNutrition> dietNutritionList);
		public boolean hasDietNutrition();

		/**
		 * @see <a href="http://schema.org/Distillery">http://schema.org/Distillery</a>
		 */
		public Distillery getDistillery();
		public void setDistillery(Distillery distillery);
		public List<Distillery> getDistilleryList();
		public void setDistilleryList(List<Distillery> distilleryList);
		public boolean hasDistillery();

		/**
		 * @see <a href="http://schema.org/DryCleaningOrLaundry">http://schema.org/DryCleaningOrLaundry</a>
		 */
		public DryCleaningOrLaundry getDryCleaningOrLaundry();
		public void setDryCleaningOrLaundry(DryCleaningOrLaundry dryCleaningOrLaundry);
		public List<DryCleaningOrLaundry> getDryCleaningOrLaundryList();
		public void setDryCleaningOrLaundryList(List<DryCleaningOrLaundry> dryCleaningOrLaundryList);
		public boolean hasDryCleaningOrLaundry();

		/**
		 * @see <a href="http://schema.org/EducationalOrganization">http://schema.org/EducationalOrganization</a>
		 */
		public EducationalOrganization getEducationalOrganization();
		public void setEducationalOrganization(EducationalOrganization educationalOrganization);
		public List<EducationalOrganization> getEducationalOrganizationList();
		public void setEducationalOrganizationList(List<EducationalOrganization> educationalOrganizationList);
		public boolean hasEducationalOrganization();

		/**
		 * @see <a href="http://schema.org/Electrician">http://schema.org/Electrician</a>
		 */
		public Electrician getElectrician();
		public void setElectrician(Electrician electrician);
		public List<Electrician> getElectricianList();
		public void setElectricianList(List<Electrician> electricianList);
		public boolean hasElectrician();

		/**
		 * @see <a href="http://schema.org/ElectronicsStore">http://schema.org/ElectronicsStore</a>
		 */
		public ElectronicsStore getElectronicsStore();
		public void setElectronicsStore(ElectronicsStore electronicsStore);
		public List<ElectronicsStore> getElectronicsStoreList();
		public void setElectronicsStoreList(List<ElectronicsStore> electronicsStoreList);
		public boolean hasElectronicsStore();

		/**
		 * @see <a href="http://schema.org/ElementarySchool">http://schema.org/ElementarySchool</a>
		 */
		public ElementarySchool getElementarySchool();
		public void setElementarySchool(ElementarySchool elementarySchool);
		public List<ElementarySchool> getElementarySchoolList();
		public void setElementarySchoolList(List<ElementarySchool> elementarySchoolList);
		public boolean hasElementarySchool();

		/**
		 * @see <a href="http://schema.org/Emergency">http://schema.org/Emergency</a>
		 */
		public Emergency getEmergency();
		public void setEmergency(Emergency emergency);
		public List<Emergency> getEmergencyList();
		public void setEmergencyList(List<Emergency> emergencyList);
		public boolean hasEmergency();

		/**
		 * @see <a href="http://schema.org/EmergencyService">http://schema.org/EmergencyService</a>
		 */
		public EmergencyService getEmergencyService();
		public void setEmergencyService(EmergencyService emergencyService);
		public List<EmergencyService> getEmergencyServiceList();
		public void setEmergencyServiceList(List<EmergencyService> emergencyServiceList);
		public boolean hasEmergencyService();

		/**
		 * @see <a href="http://schema.org/EmploymentAgency">http://schema.org/EmploymentAgency</a>
		 */
		public EmploymentAgency getEmploymentAgency();
		public void setEmploymentAgency(EmploymentAgency employmentAgency);
		public List<EmploymentAgency> getEmploymentAgencyList();
		public void setEmploymentAgencyList(List<EmploymentAgency> employmentAgencyList);
		public boolean hasEmploymentAgency();

		/**
		 * @see <a href="http://schema.org/EntertainmentBusiness">http://schema.org/EntertainmentBusiness</a>
		 */
		public EntertainmentBusiness getEntertainmentBusiness();
		public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness);
		public List<EntertainmentBusiness> getEntertainmentBusinessList();
		public void setEntertainmentBusinessList(List<EntertainmentBusiness> entertainmentBusinessList);
		public boolean hasEntertainmentBusiness();

		/**
		 * @see <a href="http://schema.org/ExerciseGym">http://schema.org/ExerciseGym</a>
		 */
		public ExerciseGym getExerciseGym();
		public void setExerciseGym(ExerciseGym exerciseGym);
		public List<ExerciseGym> getExerciseGymList();
		public void setExerciseGymList(List<ExerciseGym> exerciseGymList);
		public boolean hasExerciseGym();

		/**
		 * @see <a href="http://schema.org/FastFoodRestaurant">http://schema.org/FastFoodRestaurant</a>
		 */
		public FastFoodRestaurant getFastFoodRestaurant();
		public void setFastFoodRestaurant(FastFoodRestaurant fastFoodRestaurant);
		public List<FastFoodRestaurant> getFastFoodRestaurantList();
		public void setFastFoodRestaurantList(List<FastFoodRestaurant> fastFoodRestaurantList);
		public boolean hasFastFoodRestaurant();

		/**
		 * @see <a href="http://schema.org/FinancialService">http://schema.org/FinancialService</a>
		 */
		public FinancialService getFinancialService();
		public void setFinancialService(FinancialService financialService);
		public List<FinancialService> getFinancialServiceList();
		public void setFinancialServiceList(List<FinancialService> financialServiceList);
		public boolean hasFinancialService();

		/**
		 * @see <a href="http://schema.org/FireStation">http://schema.org/FireStation</a>
		 */
		public FireStation getFireStation();
		public void setFireStation(FireStation fireStation);
		public List<FireStation> getFireStationList();
		public void setFireStationList(List<FireStation> fireStationList);
		public boolean hasFireStation();

		/**
		 * @see <a href="http://schema.org/Florist">http://schema.org/Florist</a>
		 */
		public Florist getFlorist();
		public void setFlorist(Florist florist);
		public List<Florist> getFloristList();
		public void setFloristList(List<Florist> floristList);
		public boolean hasFlorist();

		/**
		 * @see <a href="http://schema.org/FoodEstablishment">http://schema.org/FoodEstablishment</a>
		 */
		public FoodEstablishment getFoodEstablishment();
		public void setFoodEstablishment(FoodEstablishment foodEstablishment);
		public List<FoodEstablishment> getFoodEstablishmentList();
		public void setFoodEstablishmentList(List<FoodEstablishment> foodEstablishmentList);
		public boolean hasFoodEstablishment();

		/**
		 * @see <a href="http://schema.org/FurnitureStore">http://schema.org/FurnitureStore</a>
		 */
		public FurnitureStore getFurnitureStore();
		public void setFurnitureStore(FurnitureStore furnitureStore);
		public List<FurnitureStore> getFurnitureStoreList();
		public void setFurnitureStoreList(List<FurnitureStore> furnitureStoreList);
		public boolean hasFurnitureStore();

		/**
		 * @see <a href="http://schema.org/GardenStore">http://schema.org/GardenStore</a>
		 */
		public GardenStore getGardenStore();
		public void setGardenStore(GardenStore gardenStore);
		public List<GardenStore> getGardenStoreList();
		public void setGardenStoreList(List<GardenStore> gardenStoreList);
		public boolean hasGardenStore();

		/**
		 * @see <a href="http://schema.org/GasStation">http://schema.org/GasStation</a>
		 */
		public GasStation getGasStation();
		public void setGasStation(GasStation gasStation);
		public List<GasStation> getGasStationList();
		public void setGasStationList(List<GasStation> gasStationList);
		public boolean hasGasStation();

		/**
		 * @see <a href="http://schema.org/GeneralContractor">http://schema.org/GeneralContractor</a>
		 */
		public GeneralContractor getGeneralContractor();
		public void setGeneralContractor(GeneralContractor generalContractor);
		public List<GeneralContractor> getGeneralContractorList();
		public void setGeneralContractorList(List<GeneralContractor> generalContractorList);
		public boolean hasGeneralContractor();

		/**
		 * @see <a href="http://schema.org/Geriatric">http://schema.org/Geriatric</a>
		 */
		public Geriatric getGeriatric();
		public void setGeriatric(Geriatric geriatric);
		public List<Geriatric> getGeriatricList();
		public void setGeriatricList(List<Geriatric> geriatricList);
		public boolean hasGeriatric();

		/**
		 * @see <a href="http://schema.org/GolfCourse">http://schema.org/GolfCourse</a>
		 */
		public GolfCourse getGolfCourse();
		public void setGolfCourse(GolfCourse golfCourse);
		public List<GolfCourse> getGolfCourseList();
		public void setGolfCourseList(List<GolfCourse> golfCourseList);
		public boolean hasGolfCourse();

		/**
		 * @see <a href="http://schema.org/GovernmentOffice">http://schema.org/GovernmentOffice</a>
		 */
		public GovernmentOffice getGovernmentOffice();
		public void setGovernmentOffice(GovernmentOffice governmentOffice);
		public List<GovernmentOffice> getGovernmentOfficeList();
		public void setGovernmentOfficeList(List<GovernmentOffice> governmentOfficeList);
		public boolean hasGovernmentOffice();

		/**
		 * @see <a href="http://schema.org/GovernmentOrganization">http://schema.org/GovernmentOrganization</a>
		 */
		public GovernmentOrganization getGovernmentOrganization();
		public void setGovernmentOrganization(GovernmentOrganization governmentOrganization);
		public List<GovernmentOrganization> getGovernmentOrganizationList();
		public void setGovernmentOrganizationList(List<GovernmentOrganization> governmentOrganizationList);
		public boolean hasGovernmentOrganization();

		/**
		 * @see <a href="http://schema.org/GroceryStore">http://schema.org/GroceryStore</a>
		 */
		public GroceryStore getGroceryStore();
		public void setGroceryStore(GroceryStore groceryStore);
		public List<GroceryStore> getGroceryStoreList();
		public void setGroceryStoreList(List<GroceryStore> groceryStoreList);
		public boolean hasGroceryStore();

		/**
		 * @see <a href="http://schema.org/Gynecologic">http://schema.org/Gynecologic</a>
		 */
		public Gynecologic getGynecologic();
		public void setGynecologic(Gynecologic gynecologic);
		public List<Gynecologic> getGynecologicList();
		public void setGynecologicList(List<Gynecologic> gynecologicList);
		public boolean hasGynecologic();

		/**
		 * @see <a href="http://schema.org/HVACBusiness">http://schema.org/HVACBusiness</a>
		 */
		public HVACBusiness getHVACBusiness();
		public void setHVACBusiness(HVACBusiness hvacBusiness);
		public List<HVACBusiness> getHVACBusinessList();
		public void setHVACBusinessList(List<HVACBusiness> hvacBusinessList);
		public boolean hasHVACBusiness();

		/**
		 * @see <a href="http://schema.org/HairSalon">http://schema.org/HairSalon</a>
		 */
		public HairSalon getHairSalon();
		public void setHairSalon(HairSalon hairSalon);
		public List<HairSalon> getHairSalonList();
		public void setHairSalonList(List<HairSalon> hairSalonList);
		public boolean hasHairSalon();

		/**
		 * @see <a href="http://schema.org/HardwareStore">http://schema.org/HardwareStore</a>
		 */
		public HardwareStore getHardwareStore();
		public void setHardwareStore(HardwareStore hardwareStore);
		public List<HardwareStore> getHardwareStoreList();
		public void setHardwareStoreList(List<HardwareStore> hardwareStoreList);
		public boolean hasHardwareStore();

		/**
		 * @see <a href="http://schema.org/HealthAndBeautyBusiness">http://schema.org/HealthAndBeautyBusiness</a>
		 */
		public HealthAndBeautyBusiness getHealthAndBeautyBusiness();
		public void setHealthAndBeautyBusiness(HealthAndBeautyBusiness healthAndBeautyBusiness);
		public List<HealthAndBeautyBusiness> getHealthAndBeautyBusinessList();
		public void setHealthAndBeautyBusinessList(List<HealthAndBeautyBusiness> healthAndBeautyBusinessList);
		public boolean hasHealthAndBeautyBusiness();

		/**
		 * @see <a href="http://schema.org/HealthClub">http://schema.org/HealthClub</a>
		 */
		public HealthClub getHealthClub();
		public void setHealthClub(HealthClub healthClub);
		public List<HealthClub> getHealthClubList();
		public void setHealthClubList(List<HealthClub> healthClubList);
		public boolean hasHealthClub();

		/**
		 * @see <a href="http://schema.org/HighSchool">http://schema.org/HighSchool</a>
		 */
		public HighSchool getHighSchool();
		public void setHighSchool(HighSchool highSchool);
		public List<HighSchool> getHighSchoolList();
		public void setHighSchoolList(List<HighSchool> highSchoolList);
		public boolean hasHighSchool();

		/**
		 * @see <a href="http://schema.org/HobbyShop">http://schema.org/HobbyShop</a>
		 */
		public HobbyShop getHobbyShop();
		public void setHobbyShop(HobbyShop hobbyShop);
		public List<HobbyShop> getHobbyShopList();
		public void setHobbyShopList(List<HobbyShop> hobbyShopList);
		public boolean hasHobbyShop();

		/**
		 * @see <a href="http://schema.org/HomeAndConstructionBusiness">http://schema.org/HomeAndConstructionBusiness</a>
		 */
		public HomeAndConstructionBusiness getHomeAndConstructionBusiness();
		public void setHomeAndConstructionBusiness(HomeAndConstructionBusiness homeAndConstructionBusiness);
		public List<HomeAndConstructionBusiness> getHomeAndConstructionBusinessList();
		public void setHomeAndConstructionBusinessList(List<HomeAndConstructionBusiness> homeAndConstructionBusinessList);
		public boolean hasHomeAndConstructionBusiness();

		/**
		 * @see <a href="http://schema.org/HomeGoodsStore">http://schema.org/HomeGoodsStore</a>
		 */
		public HomeGoodsStore getHomeGoodsStore();
		public void setHomeGoodsStore(HomeGoodsStore homeGoodsStore);
		public List<HomeGoodsStore> getHomeGoodsStoreList();
		public void setHomeGoodsStoreList(List<HomeGoodsStore> homeGoodsStoreList);
		public boolean hasHomeGoodsStore();

		/**
		 * @see <a href="http://schema.org/Hospital">http://schema.org/Hospital</a>
		 */
		public Hospital getHospital();
		public void setHospital(Hospital hospital);
		public List<Hospital> getHospitalList();
		public void setHospitalList(List<Hospital> hospitalList);
		public boolean hasHospital();

		/**
		 * @see <a href="http://schema.org/Hostel">http://schema.org/Hostel</a>
		 */
		public Hostel getHostel();
		public void setHostel(Hostel hostel);
		public List<Hostel> getHostelList();
		public void setHostelList(List<Hostel> hostelList);
		public boolean hasHostel();

		/**
		 * @see <a href="http://schema.org/Hotel">http://schema.org/Hotel</a>
		 */
		public Hotel getHotel();
		public void setHotel(Hotel hotel);
		public List<Hotel> getHotelList();
		public void setHotelList(List<Hotel> hotelList);
		public boolean hasHotel();

		/**
		 * @see <a href="http://schema.org/HousePainter">http://schema.org/HousePainter</a>
		 */
		public HousePainter getHousePainter();
		public void setHousePainter(HousePainter housePainter);
		public List<HousePainter> getHousePainterList();
		public void setHousePainterList(List<HousePainter> housePainterList);
		public boolean hasHousePainter();

		/**
		 * @see <a href="http://schema.org/IceCreamShop">http://schema.org/IceCreamShop</a>
		 */
		public IceCreamShop getIceCreamShop();
		public void setIceCreamShop(IceCreamShop iceCreamShop);
		public List<IceCreamShop> getIceCreamShopList();
		public void setIceCreamShopList(List<IceCreamShop> iceCreamShopList);
		public boolean hasIceCreamShop();

		/**
		 * @see <a href="http://schema.org/InsuranceAgency">http://schema.org/InsuranceAgency</a>
		 */
		public InsuranceAgency getInsuranceAgency();
		public void setInsuranceAgency(InsuranceAgency insuranceAgency);
		public List<InsuranceAgency> getInsuranceAgencyList();
		public void setInsuranceAgencyList(List<InsuranceAgency> insuranceAgencyList);
		public boolean hasInsuranceAgency();

		/**
		 * @see <a href="http://schema.org/InternetCafe">http://schema.org/InternetCafe</a>
		 */
		public InternetCafe getInternetCafe();
		public void setInternetCafe(InternetCafe internetCafe);
		public List<InternetCafe> getInternetCafeList();
		public void setInternetCafeList(List<InternetCafe> internetCafeList);
		public boolean hasInternetCafe();

		/**
		 * @see <a href="http://schema.org/JewelryStore">http://schema.org/JewelryStore</a>
		 */
		public JewelryStore getJewelryStore();
		public void setJewelryStore(JewelryStore jewelryStore);
		public List<JewelryStore> getJewelryStoreList();
		public void setJewelryStoreList(List<JewelryStore> jewelryStoreList);
		public boolean hasJewelryStore();

		/**
		 * @see <a href="http://schema.org/LegalService">http://schema.org/LegalService</a>
		 */
		public LegalService getLegalService();
		public void setLegalService(LegalService legalService);
		public List<LegalService> getLegalServiceList();
		public void setLegalServiceList(List<LegalService> legalServiceList);
		public boolean hasLegalService();

		/**
		 * @see <a href="http://schema.org/Library">http://schema.org/Library</a>
		 */
		public Library getLibrary();
		public void setLibrary(Library library);
		public List<Library> getLibraryList();
		public void setLibraryList(List<Library> libraryList);
		public boolean hasLibrary();

		/**
		 * @see <a href="http://schema.org/LibrarySystem">http://schema.org/LibrarySystem</a>
		 */
		public LibrarySystem getLibrarySystem();
		public void setLibrarySystem(LibrarySystem librarySystem);
		public List<LibrarySystem> getLibrarySystemList();
		public void setLibrarySystemList(List<LibrarySystem> librarySystemList);
		public boolean hasLibrarySystem();

		/**
		 * @see <a href="http://schema.org/LiquorStore">http://schema.org/LiquorStore</a>
		 */
		public LiquorStore getLiquorStore();
		public void setLiquorStore(LiquorStore liquorStore);
		public List<LiquorStore> getLiquorStoreList();
		public void setLiquorStoreList(List<LiquorStore> liquorStoreList);
		public boolean hasLiquorStore();

		/**
		 * @see <a href="http://schema.org/LocalBusiness">http://schema.org/LocalBusiness</a>
		 */
		public LocalBusiness getLocalBusiness();
		public void setLocalBusiness(LocalBusiness localBusiness);
		public List<LocalBusiness> getLocalBusinessList();
		public void setLocalBusinessList(List<LocalBusiness> localBusinessList);
		public boolean hasLocalBusiness();

		/**
		 * @see <a href="http://schema.org/Locksmith">http://schema.org/Locksmith</a>
		 */
		public Locksmith getLocksmith();
		public void setLocksmith(Locksmith locksmith);
		public List<Locksmith> getLocksmithList();
		public void setLocksmithList(List<Locksmith> locksmithList);
		public boolean hasLocksmith();

		/**
		 * @see <a href="http://schema.org/LodgingBusiness">http://schema.org/LodgingBusiness</a>
		 */
		public LodgingBusiness getLodgingBusiness();
		public void setLodgingBusiness(LodgingBusiness lodgingBusiness);
		public List<LodgingBusiness> getLodgingBusinessList();
		public void setLodgingBusinessList(List<LodgingBusiness> lodgingBusinessList);
		public boolean hasLodgingBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalBusiness">http://schema.org/MedicalBusiness</a>
		 */
		public Clazz.MedicalBusiness getMedicalBusiness();
		public void setMedicalBusiness(Clazz.MedicalBusiness medicalBusiness);
		public List<Clazz.MedicalBusiness> getMedicalBusinessList();
		public void setMedicalBusinessList(List<Clazz.MedicalBusiness> medicalBusinessList);
		public boolean hasMedicalBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalClinic">http://schema.org/MedicalClinic</a>
		 */
		public Clazz.MedicalClinic getMedicalClinic();
		public void setMedicalClinic(Clazz.MedicalClinic medicalClinic);
		public List<Clazz.MedicalClinic> getMedicalClinicList();
		public void setMedicalClinicList(List<Clazz.MedicalClinic> medicalClinicList);
		public boolean hasMedicalClinic();

		/**
		 * @see <a href="http://schema.org/MedicalOrganization">http://schema.org/MedicalOrganization</a>
		 */
		public MedicalOrganization getMedicalOrganization();
		public void setMedicalOrganization(MedicalOrganization medicalOrganization);
		public List<MedicalOrganization> getMedicalOrganizationList();
		public void setMedicalOrganizationList(List<MedicalOrganization> medicalOrganizationList);
		public boolean hasMedicalOrganization();

		/**
		 * @see <a href="http://schema.org/MensClothingStore">http://schema.org/MensClothingStore</a>
		 */
		public MensClothingStore getMensClothingStore();
		public void setMensClothingStore(MensClothingStore mensClothingStore);
		public List<MensClothingStore> getMensClothingStoreList();
		public void setMensClothingStoreList(List<MensClothingStore> mensClothingStoreList);
		public boolean hasMensClothingStore();

		/**
		 * @see <a href="http://schema.org/MiddleSchool">http://schema.org/MiddleSchool</a>
		 */
		public MiddleSchool getMiddleSchool();
		public void setMiddleSchool(MiddleSchool middleSchool);
		public List<MiddleSchool> getMiddleSchoolList();
		public void setMiddleSchoolList(List<MiddleSchool> middleSchoolList);
		public boolean hasMiddleSchool();

		/**
		 * @see <a href="http://schema.org/Midwifery">http://schema.org/Midwifery</a>
		 */
		public Midwifery getMidwifery();
		public void setMidwifery(Midwifery midwifery);
		public List<Midwifery> getMidwiferyList();
		public void setMidwiferyList(List<Midwifery> midwiferyList);
		public boolean hasMidwifery();

		/**
		 * @see <a href="http://schema.org/MobilePhoneStore">http://schema.org/MobilePhoneStore</a>
		 */
		public MobilePhoneStore getMobilePhoneStore();
		public void setMobilePhoneStore(MobilePhoneStore mobilePhoneStore);
		public List<MobilePhoneStore> getMobilePhoneStoreList();
		public void setMobilePhoneStoreList(List<MobilePhoneStore> mobilePhoneStoreList);
		public boolean hasMobilePhoneStore();

		/**
		 * @see <a href="http://schema.org/Motel">http://schema.org/Motel</a>
		 */
		public Motel getMotel();
		public void setMotel(Motel motel);
		public List<Motel> getMotelList();
		public void setMotelList(List<Motel> motelList);
		public boolean hasMotel();

		/**
		 * @see <a href="http://schema.org/MotorcycleDealer">http://schema.org/MotorcycleDealer</a>
		 */
		public MotorcycleDealer getMotorcycleDealer();
		public void setMotorcycleDealer(MotorcycleDealer motorcycleDealer);
		public List<MotorcycleDealer> getMotorcycleDealerList();
		public void setMotorcycleDealerList(List<MotorcycleDealer> motorcycleDealerList);
		public boolean hasMotorcycleDealer();

		/**
		 * @see <a href="http://schema.org/MotorcycleRepair">http://schema.org/MotorcycleRepair</a>
		 */
		public MotorcycleRepair getMotorcycleRepair();
		public void setMotorcycleRepair(MotorcycleRepair motorcycleRepair);
		public List<MotorcycleRepair> getMotorcycleRepairList();
		public void setMotorcycleRepairList(List<MotorcycleRepair> motorcycleRepairList);
		public boolean hasMotorcycleRepair();

		/**
		 * @see <a href="http://schema.org/MovieRentalStore">http://schema.org/MovieRentalStore</a>
		 */
		public MovieRentalStore getMovieRentalStore();
		public void setMovieRentalStore(MovieRentalStore movieRentalStore);
		public List<MovieRentalStore> getMovieRentalStoreList();
		public void setMovieRentalStoreList(List<MovieRentalStore> movieRentalStoreList);
		public boolean hasMovieRentalStore();

		/**
		 * @see <a href="http://schema.org/MovieTheater">http://schema.org/MovieTheater</a>
		 */
		public MovieTheater getMovieTheater();
		public void setMovieTheater(MovieTheater movieTheater);
		public List<MovieTheater> getMovieTheaterList();
		public void setMovieTheaterList(List<MovieTheater> movieTheaterList);
		public boolean hasMovieTheater();

		/**
		 * @see <a href="http://schema.org/MovingCompany">http://schema.org/MovingCompany</a>
		 */
		public MovingCompany getMovingCompany();
		public void setMovingCompany(MovingCompany movingCompany);
		public List<MovingCompany> getMovingCompanyList();
		public void setMovingCompanyList(List<MovingCompany> movingCompanyList);
		public boolean hasMovingCompany();

		/**
		 * @see <a href="http://schema.org/MusicGroup">http://schema.org/MusicGroup</a>
		 */
		public MusicGroup getMusicGroup();
		public void setMusicGroup(MusicGroup musicGroup);
		public List<MusicGroup> getMusicGroupList();
		public void setMusicGroupList(List<MusicGroup> musicGroupList);
		public boolean hasMusicGroup();

		/**
		 * @see <a href="http://schema.org/MusicStore">http://schema.org/MusicStore</a>
		 */
		public MusicStore getMusicStore();
		public void setMusicStore(MusicStore musicStore);
		public List<MusicStore> getMusicStoreList();
		public void setMusicStoreList(List<MusicStore> musicStoreList);
		public boolean hasMusicStore();

		/**
		 * @see <a href="http://schema.org/NGO">http://schema.org/NGO</a>
		 */
		public NGO getNGO();
		public void setNGO(NGO ngo);
		public List<NGO> getNGOList();
		public void setNGOList(List<NGO> ngoList);
		public boolean hasNGO();

		/**
		 * @see <a href="http://schema.org/NailSalon">http://schema.org/NailSalon</a>
		 */
		public NailSalon getNailSalon();
		public void setNailSalon(NailSalon nailSalon);
		public List<NailSalon> getNailSalonList();
		public void setNailSalonList(List<NailSalon> nailSalonList);
		public boolean hasNailSalon();

		/**
		 * @see <a href="http://schema.org/NewsMediaOrganization">http://schema.org/NewsMediaOrganization</a>
		 */
		public NewsMediaOrganization getNewsMediaOrganization();
		public void setNewsMediaOrganization(NewsMediaOrganization newsMediaOrganization);
		public List<NewsMediaOrganization> getNewsMediaOrganizationList();
		public void setNewsMediaOrganizationList(List<NewsMediaOrganization> newsMediaOrganizationList);
		public boolean hasNewsMediaOrganization();

		/**
		 * @see <a href="http://schema.org/NightClub">http://schema.org/NightClub</a>
		 */
		public NightClub getNightClub();
		public void setNightClub(NightClub nightClub);
		public List<NightClub> getNightClubList();
		public void setNightClubList(List<NightClub> nightClubList);
		public boolean hasNightClub();

		/**
		 * @see <a href="http://schema.org/Notary">http://schema.org/Notary</a>
		 */
		public Notary getNotary();
		public void setNotary(Notary notary);
		public List<Notary> getNotaryList();
		public void setNotaryList(List<Notary> notaryList);
		public boolean hasNotary();

		/**
		 * @see <a href="http://schema.org/Nursing">http://schema.org/Nursing</a>
		 */
		public Nursing getNursing();
		public void setNursing(Nursing nursing);
		public List<Nursing> getNursingList();
		public void setNursingList(List<Nursing> nursingList);
		public boolean hasNursing();

		/**
		 * @see <a href="http://schema.org/Obstetric">http://schema.org/Obstetric</a>
		 */
		public Obstetric getObstetric();
		public void setObstetric(Obstetric obstetric);
		public List<Obstetric> getObstetricList();
		public void setObstetricList(List<Obstetric> obstetricList);
		public boolean hasObstetric();

		/**
		 * @see <a href="http://schema.org/OfficeEquipmentStore">http://schema.org/OfficeEquipmentStore</a>
		 */
		public OfficeEquipmentStore getOfficeEquipmentStore();
		public void setOfficeEquipmentStore(OfficeEquipmentStore officeEquipmentStore);
		public List<OfficeEquipmentStore> getOfficeEquipmentStoreList();
		public void setOfficeEquipmentStoreList(List<OfficeEquipmentStore> officeEquipmentStoreList);
		public boolean hasOfficeEquipmentStore();

		/**
		 * @see <a href="http://schema.org/Oncologic">http://schema.org/Oncologic</a>
		 */
		public Oncologic getOncologic();
		public void setOncologic(Oncologic oncologic);
		public List<Oncologic> getOncologicList();
		public void setOncologicList(List<Oncologic> oncologicList);
		public boolean hasOncologic();

		/**
		 * @see <a href="http://schema.org/Optician">http://schema.org/Optician</a>
		 */
		public Clazz.Optician getOptician();
		public void setOptician(Clazz.Optician optician);
		public List<Clazz.Optician> getOpticianList();
		public void setOpticianList(List<Clazz.Optician> opticianList);
		public boolean hasOptician();

		/**
		 * @see <a href="http://schema.org/Optometric">http://schema.org/Optometric</a>
		 */
		public Optometric getOptometric();
		public void setOptometric(Optometric optometric);
		public List<Optometric> getOptometricList();
		public void setOptometricList(List<Optometric> optometricList);
		public boolean hasOptometric();

		/**
		 * @see <a href="http://schema.org/Organization">http://schema.org/Organization</a>
		 */
		public Organization getOrganization();
		public void setOrganization(Organization organization);
		public List<Organization> getOrganizationList();
		public void setOrganizationList(List<Organization> organizationList);
		public boolean hasOrganization();

		/**
		 * @see <a href="http://schema.org/Otolaryngologic">http://schema.org/Otolaryngologic</a>
		 */
		public Otolaryngologic getOtolaryngologic();
		public void setOtolaryngologic(Otolaryngologic otolaryngologic);
		public List<Otolaryngologic> getOtolaryngologicList();
		public void setOtolaryngologicList(List<Otolaryngologic> otolaryngologicList);
		public boolean hasOtolaryngologic();

		/**
		 * @see <a href="http://schema.org/OutletStore">http://schema.org/OutletStore</a>
		 */
		public OutletStore getOutletStore();
		public void setOutletStore(OutletStore outletStore);
		public List<OutletStore> getOutletStoreList();
		public void setOutletStoreList(List<OutletStore> outletStoreList);
		public boolean hasOutletStore();

		/**
		 * @see <a href="http://schema.org/PawnShop">http://schema.org/PawnShop</a>
		 */
		public PawnShop getPawnShop();
		public void setPawnShop(PawnShop pawnShop);
		public List<PawnShop> getPawnShopList();
		public void setPawnShopList(List<PawnShop> pawnShopList);
		public boolean hasPawnShop();

		/**
		 * @see <a href="http://schema.org/Pediatric">http://schema.org/Pediatric</a>
		 */
		public Pediatric getPediatric();
		public void setPediatric(Pediatric pediatric);
		public List<Pediatric> getPediatricList();
		public void setPediatricList(List<Pediatric> pediatricList);
		public boolean hasPediatric();

		/**
		 * @see <a href="http://schema.org/PerformingGroup">http://schema.org/PerformingGroup</a>
		 */
		public PerformingGroup getPerformingGroup();
		public void setPerformingGroup(PerformingGroup performingGroup);
		public List<PerformingGroup> getPerformingGroupList();
		public void setPerformingGroupList(List<PerformingGroup> performingGroupList);
		public boolean hasPerformingGroup();

		/**
		 * @see <a href="http://schema.org/PetStore">http://schema.org/PetStore</a>
		 */
		public PetStore getPetStore();
		public void setPetStore(PetStore petStore);
		public List<PetStore> getPetStoreList();
		public void setPetStoreList(List<PetStore> petStoreList);
		public boolean hasPetStore();

		/**
		 * @see <a href="http://schema.org/Pharmacy">http://schema.org/Pharmacy</a>
		 */
		public Pharmacy getPharmacy();
		public void setPharmacy(Pharmacy pharmacy);
		public List<Pharmacy> getPharmacyList();
		public void setPharmacyList(List<Pharmacy> pharmacyList);
		public boolean hasPharmacy();

		/**
		 * @see <a href="http://schema.org/Physician">http://schema.org/Physician</a>
		 */
		public Physician getPhysician();
		public void setPhysician(Physician physician);
		public List<Physician> getPhysicianList();
		public void setPhysicianList(List<Physician> physicianList);
		public boolean hasPhysician();

		/**
		 * @see <a href="http://schema.org/Physiotherapy">http://schema.org/Physiotherapy</a>
		 */
		public Physiotherapy getPhysiotherapy();
		public void setPhysiotherapy(Physiotherapy physiotherapy);
		public List<Physiotherapy> getPhysiotherapyList();
		public void setPhysiotherapyList(List<Physiotherapy> physiotherapyList);
		public boolean hasPhysiotherapy();

		/**
		 * @see <a href="http://schema.org/PlasticSurgery">http://schema.org/PlasticSurgery</a>
		 */
		public PlasticSurgery getPlasticSurgery();
		public void setPlasticSurgery(PlasticSurgery plasticSurgery);
		public List<PlasticSurgery> getPlasticSurgeryList();
		public void setPlasticSurgeryList(List<PlasticSurgery> plasticSurgeryList);
		public boolean hasPlasticSurgery();

		/**
		 * @see <a href="http://schema.org/Plumber">http://schema.org/Plumber</a>
		 */
		public Plumber getPlumber();
		public void setPlumber(Plumber plumber);
		public List<Plumber> getPlumberList();
		public void setPlumberList(List<Plumber> plumberList);
		public boolean hasPlumber();

		/**
		 * @see <a href="http://schema.org/Podiatric">http://schema.org/Podiatric</a>
		 */
		public Podiatric getPodiatric();
		public void setPodiatric(Podiatric podiatric);
		public List<Podiatric> getPodiatricList();
		public void setPodiatricList(List<Podiatric> podiatricList);
		public boolean hasPodiatric();

		/**
		 * @see <a href="http://schema.org/PoliceStation">http://schema.org/PoliceStation</a>
		 */
		public PoliceStation getPoliceStation();
		public void setPoliceStation(PoliceStation policeStation);
		public List<PoliceStation> getPoliceStationList();
		public void setPoliceStationList(List<PoliceStation> policeStationList);
		public boolean hasPoliceStation();

		/**
		 * @see <a href="http://schema.org/PostOffice">http://schema.org/PostOffice</a>
		 */
		public PostOffice getPostOffice();
		public void setPostOffice(PostOffice postOffice);
		public List<PostOffice> getPostOfficeList();
		public void setPostOfficeList(List<PostOffice> postOfficeList);
		public boolean hasPostOffice();

		/**
		 * @see <a href="http://schema.org/Preschool">http://schema.org/Preschool</a>
		 */
		public Preschool getPreschool();
		public void setPreschool(Preschool preschool);
		public List<Preschool> getPreschoolList();
		public void setPreschoolList(List<Preschool> preschoolList);
		public boolean hasPreschool();

		/**
		 * @see <a href="http://schema.org/PrimaryCare">http://schema.org/PrimaryCare</a>
		 */
		public PrimaryCare getPrimaryCare();
		public void setPrimaryCare(PrimaryCare primaryCare);
		public List<PrimaryCare> getPrimaryCareList();
		public void setPrimaryCareList(List<PrimaryCare> primaryCareList);
		public boolean hasPrimaryCare();

		/**
		 * @see <a href="http://schema.org/ProfessionalService">http://schema.org/ProfessionalService</a>
		 */
		public ProfessionalService getProfessionalService();
		public void setProfessionalService(ProfessionalService professionalService);
		public List<ProfessionalService> getProfessionalServiceList();
		public void setProfessionalServiceList(List<ProfessionalService> professionalServiceList);
		public boolean hasProfessionalService();

		/**
		 * @see <a href="http://schema.org/Psychiatric">http://schema.org/Psychiatric</a>
		 */
		public Psychiatric getPsychiatric();
		public void setPsychiatric(Psychiatric psychiatric);
		public List<Psychiatric> getPsychiatricList();
		public void setPsychiatricList(List<Psychiatric> psychiatricList);
		public boolean hasPsychiatric();

		/**
		 * @see <a href="http://schema.org/PublicHealth">http://schema.org/PublicHealth</a>
		 */
		public PublicHealth getPublicHealth();
		public void setPublicHealth(PublicHealth publicHealth);
		public List<PublicHealth> getPublicHealthList();
		public void setPublicHealthList(List<PublicHealth> publicHealthList);
		public boolean hasPublicHealth();

		/**
		 * @see <a href="http://schema.org/PublicSwimmingPool">http://schema.org/PublicSwimmingPool</a>
		 */
		public PublicSwimmingPool getPublicSwimmingPool();
		public void setPublicSwimmingPool(PublicSwimmingPool publicSwimmingPool);
		public List<PublicSwimmingPool> getPublicSwimmingPoolList();
		public void setPublicSwimmingPoolList(List<PublicSwimmingPool> publicSwimmingPoolList);
		public boolean hasPublicSwimmingPool();

		/**
		 * @see <a href="http://schema.org/RadioStation">http://schema.org/RadioStation</a>
		 */
		public RadioStation getRadioStation();
		public void setRadioStation(RadioStation radioStation);
		public List<RadioStation> getRadioStationList();
		public void setRadioStationList(List<RadioStation> radioStationList);
		public boolean hasRadioStation();

		/**
		 * @see <a href="http://schema.org/RealEstateAgent">http://schema.org/RealEstateAgent</a>
		 */
		public RealEstateAgent getRealEstateAgent();
		public void setRealEstateAgent(RealEstateAgent realEstateAgent);
		public List<RealEstateAgent> getRealEstateAgentList();
		public void setRealEstateAgentList(List<RealEstateAgent> realEstateAgentList);
		public boolean hasRealEstateAgent();

		/**
		 * @see <a href="http://schema.org/RecyclingCenter">http://schema.org/RecyclingCenter</a>
		 */
		public RecyclingCenter getRecyclingCenter();
		public void setRecyclingCenter(RecyclingCenter recyclingCenter);
		public List<RecyclingCenter> getRecyclingCenterList();
		public void setRecyclingCenterList(List<RecyclingCenter> recyclingCenterList);
		public boolean hasRecyclingCenter();

		/**
		 * @see <a href="http://schema.org/Resort">http://schema.org/Resort</a>
		 */
		public Resort getResort();
		public void setResort(Resort resort);
		public List<Resort> getResortList();
		public void setResortList(List<Resort> resortList);
		public boolean hasResort();

		/**
		 * @see <a href="http://schema.org/Restaurant">http://schema.org/Restaurant</a>
		 */
		public Restaurant getRestaurant();
		public void setRestaurant(Restaurant restaurant);
		public List<Restaurant> getRestaurantList();
		public void setRestaurantList(List<Restaurant> restaurantList);
		public boolean hasRestaurant();

		/**
		 * @see <a href="http://schema.org/RoofingContractor">http://schema.org/RoofingContractor</a>
		 */
		public RoofingContractor getRoofingContractor();
		public void setRoofingContractor(RoofingContractor roofingContractor);
		public List<RoofingContractor> getRoofingContractorList();
		public void setRoofingContractorList(List<RoofingContractor> roofingContractorList);
		public boolean hasRoofingContractor();

		/**
		 * @see <a href="http://schema.org/School">http://schema.org/School</a>
		 */
		public School getSchool();
		public void setSchool(School school);
		public List<School> getSchoolList();
		public void setSchoolList(List<School> schoolList);
		public boolean hasSchool();

		/**
		 * @see <a href="http://schema.org/SelfStorage">http://schema.org/SelfStorage</a>
		 */
		public SelfStorage getSelfStorage();
		public void setSelfStorage(SelfStorage selfStorage);
		public List<SelfStorage> getSelfStorageList();
		public void setSelfStorageList(List<SelfStorage> selfStorageList);
		public boolean hasSelfStorage();

		/**
		 * @see <a href="http://schema.org/ShoeStore">http://schema.org/ShoeStore</a>
		 */
		public ShoeStore getShoeStore();
		public void setShoeStore(ShoeStore shoeStore);
		public List<ShoeStore> getShoeStoreList();
		public void setShoeStoreList(List<ShoeStore> shoeStoreList);
		public boolean hasShoeStore();

		/**
		 * @see <a href="http://schema.org/ShoppingCenter">http://schema.org/ShoppingCenter</a>
		 */
		public ShoppingCenter getShoppingCenter();
		public void setShoppingCenter(ShoppingCenter shoppingCenter);
		public List<ShoppingCenter> getShoppingCenterList();
		public void setShoppingCenterList(List<ShoppingCenter> shoppingCenterList);
		public boolean hasShoppingCenter();

		/**
		 * @see <a href="http://schema.org/SkiResort">http://schema.org/SkiResort</a>
		 */
		public SkiResort getSkiResort();
		public void setSkiResort(SkiResort skiResort);
		public List<SkiResort> getSkiResortList();
		public void setSkiResortList(List<SkiResort> skiResortList);
		public boolean hasSkiResort();

		/**
		 * @see <a href="http://schema.org/SportingGoodsStore">http://schema.org/SportingGoodsStore</a>
		 */
		public SportingGoodsStore getSportingGoodsStore();
		public void setSportingGoodsStore(SportingGoodsStore sportingGoodsStore);
		public List<SportingGoodsStore> getSportingGoodsStoreList();
		public void setSportingGoodsStoreList(List<SportingGoodsStore> sportingGoodsStoreList);
		public boolean hasSportingGoodsStore();

		/**
		 * @see <a href="http://schema.org/SportsActivityLocation">http://schema.org/SportsActivityLocation</a>
		 */
		public SportsActivityLocation getSportsActivityLocation();
		public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation);
		public List<SportsActivityLocation> getSportsActivityLocationList();
		public void setSportsActivityLocationList(List<SportsActivityLocation> sportsActivityLocationList);
		public boolean hasSportsActivityLocation();

		/**
		 * @see <a href="http://schema.org/SportsClub">http://schema.org/SportsClub</a>
		 */
		public SportsClub getSportsClub();
		public void setSportsClub(SportsClub sportsClub);
		public List<SportsClub> getSportsClubList();
		public void setSportsClubList(List<SportsClub> sportsClubList);
		public boolean hasSportsClub();

		/**
		 * @see <a href="http://schema.org/SportsOrganization">http://schema.org/SportsOrganization</a>
		 */
		public SportsOrganization getSportsOrganization();
		public void setSportsOrganization(SportsOrganization sportsOrganization);
		public List<SportsOrganization> getSportsOrganizationList();
		public void setSportsOrganizationList(List<SportsOrganization> sportsOrganizationList);
		public boolean hasSportsOrganization();

		/**
		 * @see <a href="http://schema.org/SportsTeam">http://schema.org/SportsTeam</a>
		 */
		public SportsTeam getSportsTeam();
		public void setSportsTeam(SportsTeam sportsTeam);
		public List<SportsTeam> getSportsTeamList();
		public void setSportsTeamList(List<SportsTeam> sportsTeamList);
		public boolean hasSportsTeam();

		/**
		 * @see <a href="http://schema.org/StadiumOrArena">http://schema.org/StadiumOrArena</a>
		 */
		public StadiumOrArena getStadiumOrArena();
		public void setStadiumOrArena(StadiumOrArena stadiumOrArena);
		public List<StadiumOrArena> getStadiumOrArenaList();
		public void setStadiumOrArenaList(List<StadiumOrArena> stadiumOrArenaList);
		public boolean hasStadiumOrArena();

		/**
		 * @see <a href="http://schema.org/Store">http://schema.org/Store</a>
		 */
		public Store getStore();
		public void setStore(Store store);
		public List<Store> getStoreList();
		public void setStoreList(List<Store> storeList);
		public boolean hasStore();

		/**
		 * @see <a href="http://schema.org/TattooParlor">http://schema.org/TattooParlor</a>
		 */
		public TattooParlor getTattooParlor();
		public void setTattooParlor(TattooParlor tattooParlor);
		public List<TattooParlor> getTattooParlorList();
		public void setTattooParlorList(List<TattooParlor> tattooParlorList);
		public boolean hasTattooParlor();

		/**
		 * @see <a href="http://schema.org/TelevisionStation">http://schema.org/TelevisionStation</a>
		 */
		public TelevisionStation getTelevisionStation();
		public void setTelevisionStation(TelevisionStation televisionStation);
		public List<TelevisionStation> getTelevisionStationList();
		public void setTelevisionStationList(List<TelevisionStation> televisionStationList);
		public boolean hasTelevisionStation();

		/**
		 * @see <a href="http://schema.org/TennisComplex">http://schema.org/TennisComplex</a>
		 */
		public TennisComplex getTennisComplex();
		public void setTennisComplex(TennisComplex tennisComplex);
		public List<TennisComplex> getTennisComplexList();
		public void setTennisComplexList(List<TennisComplex> tennisComplexList);
		public boolean hasTennisComplex();

		/**
		 * @see <a href="http://schema.org/TheaterGroup">http://schema.org/TheaterGroup</a>
		 */
		public TheaterGroup getTheaterGroup();
		public void setTheaterGroup(TheaterGroup theaterGroup);
		public List<TheaterGroup> getTheaterGroupList();
		public void setTheaterGroupList(List<TheaterGroup> theaterGroupList);
		public boolean hasTheaterGroup();

		/**
		 * @see <a href="http://schema.org/TireShop">http://schema.org/TireShop</a>
		 */
		public TireShop getTireShop();
		public void setTireShop(TireShop tireShop);
		public List<TireShop> getTireShopList();
		public void setTireShopList(List<TireShop> tireShopList);
		public boolean hasTireShop();

		/**
		 * @see <a href="http://schema.org/TouristInformationCenter">http://schema.org/TouristInformationCenter</a>
		 */
		public TouristInformationCenter getTouristInformationCenter();
		public void setTouristInformationCenter(TouristInformationCenter touristInformationCenter);
		public List<TouristInformationCenter> getTouristInformationCenterList();
		public void setTouristInformationCenterList(List<TouristInformationCenter> touristInformationCenterList);
		public boolean hasTouristInformationCenter();

		/**
		 * @see <a href="http://schema.org/ToyStore">http://schema.org/ToyStore</a>
		 */
		public ToyStore getToyStore();
		public void setToyStore(ToyStore toyStore);
		public List<ToyStore> getToyStoreList();
		public void setToyStoreList(List<ToyStore> toyStoreList);
		public boolean hasToyStore();

		/**
		 * @see <a href="http://schema.org/TravelAgency">http://schema.org/TravelAgency</a>
		 */
		public TravelAgency getTravelAgency();
		public void setTravelAgency(TravelAgency travelAgency);
		public List<TravelAgency> getTravelAgencyList();
		public void setTravelAgencyList(List<TravelAgency> travelAgencyList);
		public boolean hasTravelAgency();

		/**
		 * @see <a href="http://schema.org/VeterinaryCare">http://schema.org/VeterinaryCare</a>
		 */
		public Clazz.VeterinaryCare getVeterinaryCare();
		public void setVeterinaryCare(Clazz.VeterinaryCare veterinaryCare);
		public List<Clazz.VeterinaryCare> getVeterinaryCareList();
		public void setVeterinaryCareList(List<Clazz.VeterinaryCare> veterinaryCareList);
		public boolean hasVeterinaryCare();

		/**
		 * @see <a href="http://schema.org/WholesaleStore">http://schema.org/WholesaleStore</a>
		 */
		public WholesaleStore getWholesaleStore();
		public void setWholesaleStore(WholesaleStore wholesaleStore);
		public List<WholesaleStore> getWholesaleStoreList();
		public void setWholesaleStoreList(List<WholesaleStore> wholesaleStoreList);
		public boolean hasWholesaleStore();

		/**
		 * @see <a href="http://schema.org/Winery">http://schema.org/Winery</a>
		 */
		public Winery getWinery();
		public void setWinery(Winery winery);
		public List<Winery> getWineryList();
		public void setWineryList(List<Winery> wineryList);
		public boolean hasWinery();

		/**
		 * @see <a href="http://schema.org/WorkersUnion">http://schema.org/WorkersUnion</a>
		 */
		public WorkersUnion getWorkersUnion();
		public void setWorkersUnion(WorkersUnion workersUnion);
		public List<WorkersUnion> getWorkersUnionList();
		public void setWorkersUnionList(List<WorkersUnion> workersUnionList);
		public boolean hasWorkersUnion();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/recommendationStrength")
	@SchemaOrgLabel("recommendationStrength")
	@SchemaOrgComment(""
			+ "Strength of the guideline's recommendation (e.g. 'class I').")
	@CamelizedName("recommendationStrength")
	@ConstantizedName("RECOMMENDATION_STRENGTH")
	public interface RecommendationStrength extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/recommendedIntake")
	@SchemaOrgLabel("recommendedIntake")
	@SchemaOrgComment(""
			+ "Recommended intake of this supplement for a given population as defined by a"
			+ " specific recommending authority.")
	@CamelizedName("recommendedIntake")
	@ConstantizedName("RECOMMENDED_INTAKE")
	public interface RecommendedIntake extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/regionDrained")
	@SchemaOrgLabel("regionDrained")
	@SchemaOrgComment(""
			+ "The anatomical or organ system drained by this vessel; generally refers to a"
			+ " specific part of an organ.")
	@CamelizedName("regionDrained")
	@ConstantizedName("REGION_DRAINED")
	public interface RegionDrained extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedAnatomy")
	@SchemaOrgLabel("relatedAnatomy")
	@SchemaOrgComment(""
			+ "Anatomical systems or structures that relate to the superficial anatomy.")
	@CamelizedName("relatedAnatomy")
	@ConstantizedName("RELATED_ANATOMY")
	public interface RelatedAnatomy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedCondition")
	@SchemaOrgLabel("relatedCondition")
	@SchemaOrgComment(""
			+ "A medical condition associated with this anatomy.")
	@CamelizedName("relatedCondition")
	@ConstantizedName("RELATED_CONDITION")
	public interface RelatedCondition extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedDrug")
	@SchemaOrgLabel("relatedDrug")
	@SchemaOrgComment(""
			+ "Any other drug related to this one, for example commonly-prescribed"
			+ " alternatives.")
	@CamelizedName("relatedDrug")
	@ConstantizedName("RELATED_DRUG")
	public interface RelatedDrug extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedStructure")
	@SchemaOrgLabel("relatedStructure")
	@SchemaOrgComment(""
			+ "Related anatomical structure(s) that are not part of the system but relate or"
			+ " connect to it, such as vascular bundles associated with an organ system.")
	@CamelizedName("relatedStructure")
	@ConstantizedName("RELATED_STRUCTURE")
	public interface RelatedStructure extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relatedTherapy")
	@SchemaOrgLabel("relatedTherapy")
	@SchemaOrgComment(""
			+ "A medical therapy related to this anatomy.")
	@CamelizedName("relatedTherapy")
	@ConstantizedName("RELATED_THERAPY")
	public interface RelatedTherapy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/relevantSpecialty")
	@SchemaOrgLabel("relevantSpecialty")
	@SchemaOrgComment(""
			+ "If applicable, a medical specialty in which this entity is relevant.")
	@CamelizedName("relevantSpecialty")
	@ConstantizedName("RELEVANT_SPECIALTY")
	public interface RelevantSpecialty extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public Clazz.MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(Clazz.MedicalSpecialty medicalSpecialty);
		public List<Clazz.MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<Clazz.MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/repetitions")
	@SchemaOrgLabel("repetitions")
	@SchemaOrgComment(""
			+ "Number of times one should repeat the activity.")
	@CamelizedName("repetitions")
	@ConstantizedName("REPETITIONS")
	public interface Repetitions extends NativeValueNumber, SchemaOrgProperty {

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
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public java.math.BigDecimal getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/restPeriods")
	@SchemaOrgLabel("restPeriods")
	@SchemaOrgComment(""
			+ "How often one should break from the activity.")
	@CamelizedName("restPeriods")
	@ConstantizedName("REST_PERIODS")
	public interface RestPeriods extends NativeValueText, SchemaOrgProperty {

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/riskFactor")
	@SchemaOrgLabel("riskFactor")
	@SchemaOrgComment(""
			+ "A modifiable or non-modifiable factor that increases the risk of a patient"
			+ " contracting this condition, e.g. age,  coexisting condition.")
	@CamelizedName("riskFactor")
	@ConstantizedName("RISK_FACTOR")
	public interface RiskFactor extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/risks")
	@SchemaOrgLabel("risks")
	@SchemaOrgComment(""
			+ "Specific physiologic risks associated to the diet plan.")
	@CamelizedName("risks")
	@ConstantizedName("RISKS")
	public interface Risks extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/runsTo")
	@SchemaOrgLabel("runsTo")
	@SchemaOrgComment(""
			+ "The vasculature the lymphatic structure runs, or efferents, to.")
	@CamelizedName("runsTo")
	@ConstantizedName("RUNS_TO")
	public interface RunsTo extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/safetyConsideration")
	@SchemaOrgLabel("safetyConsideration")
	@SchemaOrgComment(""
			+ "Any potential safety concern associated with the supplement. May include"
			+ " interactions with other drugs and foods, pregnancy, breastfeeding, known"
			+ " adverse reactions, and documented efficacy of the supplement.")
	@CamelizedName("safetyConsideration")
	@ConstantizedName("SAFETY_CONSIDERATION")
	public interface SafetyConsideration extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/secondaryPrevention")
	@SchemaOrgLabel("secondaryPrevention")
	@SchemaOrgComment(""
			+ "A preventative therapy used to prevent reoccurrence of the medical condition"
			+ " after an initial episode of the condition.")
	@CamelizedName("secondaryPrevention")
	@ConstantizedName("SECONDARY_PREVENTION")
	public interface SecondaryPrevention extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sensoryUnit")
	@SchemaOrgLabel("sensoryUnit")
	@SchemaOrgComment(""
			+ "The neurological pathway extension that inputs and sends information to the"
			+ " brain or spinal cord.")
	@CamelizedName("sensoryUnit")
	@ConstantizedName("SENSORY_UNIT")
	public interface SensoryUnit extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/seriousAdverseOutcome")
	@SchemaOrgLabel("seriousAdverseOutcome")
	@SchemaOrgComment(""
			+ "A possible serious complication and/or serious side effect of this therapy."
			+ " Serious adverse outcomes include those that are life-threatening; result in"
			+ " death, disability, or permanent damage; require hospitalization or prolong"
			+ " existing hospitalization; cause congenital anomalies or birth defects; or"
			+ " jeopardize the patient and may require medical or surgical intervention to"
			+ " prevent one of the outcomes in this definition.")
	@CamelizedName("seriousAdverseOutcome")
	@ConstantizedName("SERIOUS_ADVERSE_OUTCOME")
	public interface SeriousAdverseOutcome extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/signDetected")
	@SchemaOrgLabel("signDetected")
	@SchemaOrgComment("A sign detected by the test.")
	@CamelizedName("signDetected")
	@ConstantizedName("SIGN_DETECTED")
	public interface SignDetected extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/signOrSymptom")
	@SchemaOrgLabel("signOrSymptom")
	@SchemaOrgComment(""
			+ "A sign or symptom of this condition. Signs are objective or physically"
			+ " observable manifestations of the medical condition while symptoms are the"
			+ " subjective experience of the medical condition.")
	@CamelizedName("signOrSymptom")
	@ConstantizedName("SIGN_OR_SYMPTOM")
	public interface SignOrSymptom extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/significance")
	@SchemaOrgLabel("significance")
	@SchemaOrgComment(""
			+ "The significance associated with the superficial anatomy; as an example, how"
			+ " characteristics of the superficial anatomy can suggest underlying medical"
			+ " conditions or courses of treatment.")
	@CamelizedName("significance")
	@ConstantizedName("SIGNIFICANCE")
	public interface Significance extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/source")
	@SchemaOrgLabel("source")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that the artery originates from.")
	@CamelizedName("source")
	@ConstantizedName("SOURCE")
	public interface Source extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/sourcedFrom")
	@SchemaOrgLabel("sourcedFrom")
	@SchemaOrgComment(""
			+ "The neurological pathway that originates the neurons.")
	@CamelizedName("sourcedFrom")
	@ConstantizedName("SOURCED_FROM")
	public interface SourcedFrom extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/stage")
	@SchemaOrgLabel("stage")
	@SchemaOrgComment(""
			+ "The stage of the condition, if applicable.")
	@CamelizedName("stage")
	@ConstantizedName("STAGE")
	public interface Stage extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/stageAsNumber")
	@SchemaOrgLabel("stageAsNumber")
	@SchemaOrgComment(""
			+ "The stage represented as a number, e.g. 3.")
	@CamelizedName("stageAsNumber")
	@ConstantizedName("STAGE_AS_NUMBER")
	public interface StageAsNumber extends NativeValueNumber, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/status")
	@SchemaOrgLabel("status")
	@SchemaOrgComment("The status of the study (enumerated).")
	@CamelizedName("status")
	@ConstantizedName("STATUS")
	public interface Status extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/EventStatusType">http://schema.org/EventStatusType</a>
		 */
		public EventStatusType getEventStatusType();
		public void setEventStatusType(EventStatusType eventStatusType);
		public List<EventStatusType> getEventStatusTypeList();
		public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList);
		public boolean hasEventStatusType();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public Clazz.MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(Clazz.MedicalStudyStatus medicalStudyStatus);
		public List<Clazz.MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<Clazz.MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

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
	@SchemaOrgURI("http://schema.org/strengthUnit")
	@SchemaOrgLabel("strengthUnit")
	@SchemaOrgComment(""
			+ "The units of an active ingredient's strength, e.g. mg.")
	@CamelizedName("strengthUnit")
	@ConstantizedName("STRENGTH_UNIT")
	public interface StrengthUnit extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/strengthValue")
	@SchemaOrgLabel("strengthValue")
	@SchemaOrgComment(""
			+ "The value of an active ingredient's strength, e.g. 325.")
	@CamelizedName("strengthValue")
	@ConstantizedName("STRENGTH_VALUE")
	public interface StrengthValue extends NativeValueNumber, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/structuralClass")
	@SchemaOrgLabel("structuralClass")
	@SchemaOrgComment(""
			+ "The name given to how bone physically connects to each other.")
	@CamelizedName("structuralClass")
	@ConstantizedName("STRUCTURAL_CLASS")
	public interface StructuralClass extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/study")
	@SchemaOrgLabel("study")
	@SchemaOrgComment(""
			+ "A medical study or trial related to this entity.")
	@CamelizedName("study")
	@ConstantizedName("STUDY")
	public interface Study extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studyDesign")
	@SchemaOrgLabel("studyDesign")
	@SchemaOrgComment(""
			+ "Specifics about the observational study design (enumerated).")
	@CamelizedName("studyDesign")
	@ConstantizedName("STUDY_DESIGN")
	public interface StudyDesign extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public Clazz.MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(Clazz.MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<Clazz.MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<Clazz.MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studyLocation")
	@SchemaOrgLabel("studyLocation")
	@SchemaOrgComment(""
			+ "The location in which the study is taking/took place.")
	@CamelizedName("studyLocation")
	@ConstantizedName("STUDY_LOCATION")
	public interface StudyLocation extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AdministrativeArea">http://schema.org/AdministrativeArea</a>
		 */
		public AdministrativeArea getAdministrativeArea();
		public void setAdministrativeArea(AdministrativeArea administrativeArea);
		public List<AdministrativeArea> getAdministrativeAreaList();
		public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList);
		public boolean hasAdministrativeArea();

		/**
		 * @see <a href="http://schema.org/City">http://schema.org/City</a>
		 */
		public City getCity();
		public void setCity(City city);
		public List<City> getCityList();
		public void setCityList(List<City> cityList);
		public boolean hasCity();

		/**
		 * @see <a href="http://schema.org/Country">http://schema.org/Country</a>
		 */
		public Country getCountry();
		public void setCountry(Country country);
		public List<Country> getCountryList();
		public void setCountryList(List<Country> countryList);
		public boolean hasCountry();

		/**
		 * @see <a href="http://schema.org/State">http://schema.org/State</a>
		 */
		public State getState();
		public void setState(State state);
		public List<State> getStateList();
		public void setStateList(List<State> stateList);
		public boolean hasState();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/studySubject")
	@SchemaOrgLabel("studySubject")
	@SchemaOrgComment(""
			+ "A subject of the study, i.e. one of the medical conditions, therapies, devices,"
			+ " drugs, etc. investigated by the study.")
	@CamelizedName("studySubject")
	@ConstantizedName("STUDY_SUBJECT")
	public interface StudySubject extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/AnatomicalSystem">http://schema.org/AnatomicalSystem</a>
		 */
		public Clazz.AnatomicalSystem getAnatomicalSystem();
		public void setAnatomicalSystem(Clazz.AnatomicalSystem anatomicalSystem);
		public List<Clazz.AnatomicalSystem> getAnatomicalSystemList();
		public void setAnatomicalSystemList(List<Clazz.AnatomicalSystem> anatomicalSystemList);
		public boolean hasAnatomicalSystem();

		/**
		 * @see <a href="http://schema.org/ApprovedIndication">http://schema.org/ApprovedIndication</a>
		 */
		public Clazz.ApprovedIndication getApprovedIndication();
		public void setApprovedIndication(Clazz.ApprovedIndication approvedIndication);
		public List<Clazz.ApprovedIndication> getApprovedIndicationList();
		public void setApprovedIndicationList(List<Clazz.ApprovedIndication> approvedIndicationList);
		public boolean hasApprovedIndication();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/DDxElement">http://schema.org/DDxElement</a>
		 */
		public Clazz.DDxElement getDDxElement();
		public void setDDxElement(Clazz.DDxElement ddxElement);
		public List<Clazz.DDxElement> getDDxElementList();
		public void setDDxElementList(List<Clazz.DDxElement> ddxElementList);
		public boolean hasDDxElement();

		/**
		 * @see <a href="http://schema.org/DiagnosticProcedure">http://schema.org/DiagnosticProcedure</a>
		 */
		public Clazz.DiagnosticProcedure getDiagnosticProcedure();
		public void setDiagnosticProcedure(Clazz.DiagnosticProcedure diagnosticProcedure);
		public List<Clazz.DiagnosticProcedure> getDiagnosticProcedureList();
		public void setDiagnosticProcedureList(List<Clazz.DiagnosticProcedure> diagnosticProcedureList);
		public boolean hasDiagnosticProcedure();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Clazz.Diet getDiet();
		public void setDiet(Clazz.Diet diet);
		public List<Clazz.Diet> getDietList();
		public void setDietList(List<Clazz.Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>
		 */
		public Clazz.DietarySupplement getDietarySupplement();
		public void setDietarySupplement(Clazz.DietarySupplement dietarySupplement);
		public List<Clazz.DietarySupplement> getDietarySupplementList();
		public void setDietarySupplementList(List<Clazz.DietarySupplement> dietarySupplementList);
		public boolean hasDietarySupplement();

		/**
		 * @see <a href="http://schema.org/DoseSchedule">http://schema.org/DoseSchedule</a>
		 */
		public Clazz.DoseSchedule getDoseSchedule();
		public void setDoseSchedule(Clazz.DoseSchedule doseSchedule);
		public List<Clazz.DoseSchedule> getDoseScheduleList();
		public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList);
		public boolean hasDoseSchedule();

		/**
		 * @see <a href="http://schema.org/Drug">http://schema.org/Drug</a>
		 */
		public Clazz.Drug getDrug();
		public void setDrug(Clazz.Drug drug);
		public List<Clazz.Drug> getDrugList();
		public void setDrugList(List<Clazz.Drug> drugList);
		public boolean hasDrug();

		/**
		 * @see <a href="http://schema.org/DrugLegalStatus">http://schema.org/DrugLegalStatus</a>
		 */
		public Clazz.DrugLegalStatus getDrugLegalStatus();
		public void setDrugLegalStatus(Clazz.DrugLegalStatus drugLegalStatus);
		public List<Clazz.DrugLegalStatus> getDrugLegalStatusList();
		public void setDrugLegalStatusList(List<Clazz.DrugLegalStatus> drugLegalStatusList);
		public boolean hasDrugLegalStatus();

		/**
		 * @see <a href="http://schema.org/DrugStrength">http://schema.org/DrugStrength</a>
		 */
		public Clazz.DrugStrength getDrugStrength();
		public void setDrugStrength(Clazz.DrugStrength drugStrength);
		public List<Clazz.DrugStrength> getDrugStrengthList();
		public void setDrugStrengthList(List<Clazz.DrugStrength> drugStrengthList);
		public boolean hasDrugStrength();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public Clazz.ExercisePlan getExercisePlan();
		public void setExercisePlan(Clazz.ExercisePlan exercisePlan);
		public List<Clazz.ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<Clazz.ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/LifestyleModification">http://schema.org/LifestyleModification</a>
		 */
		public Clazz.LifestyleModification getLifestyleModification();
		public void setLifestyleModification(Clazz.LifestyleModification lifestyleModification);
		public List<Clazz.LifestyleModification> getLifestyleModificationList();
		public void setLifestyleModificationList(List<Clazz.LifestyleModification> lifestyleModificationList);
		public boolean hasLifestyleModification();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/MaximumDoseSchedule">http://schema.org/MaximumDoseSchedule</a>
		 */
		public Clazz.MaximumDoseSchedule getMaximumDoseSchedule();
		public void setMaximumDoseSchedule(Clazz.MaximumDoseSchedule maximumDoseSchedule);
		public List<Clazz.MaximumDoseSchedule> getMaximumDoseScheduleList();
		public void setMaximumDoseScheduleList(List<Clazz.MaximumDoseSchedule> maximumDoseScheduleList);
		public boolean hasMaximumDoseSchedule();

		/**
		 * @see <a href="http://schema.org/MedicalCause">http://schema.org/MedicalCause</a>
		 */
		public Clazz.MedicalCause getMedicalCause();
		public void setMedicalCause(Clazz.MedicalCause medicalCause);
		public List<Clazz.MedicalCause> getMedicalCauseList();
		public void setMedicalCauseList(List<Clazz.MedicalCause> medicalCauseList);
		public boolean hasMedicalCause();

		/**
		 * @see <a href="http://schema.org/MedicalCode">http://schema.org/MedicalCode</a>
		 */
		public Clazz.MedicalCode getMedicalCode();
		public void setMedicalCode(Clazz.MedicalCode medicalCode);
		public List<Clazz.MedicalCode> getMedicalCodeList();
		public void setMedicalCodeList(List<Clazz.MedicalCode> medicalCodeList);
		public boolean hasMedicalCode();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalConditionStage">http://schema.org/MedicalConditionStage</a>
		 */
		public Clazz.MedicalConditionStage getMedicalConditionStage();
		public void setMedicalConditionStage(Clazz.MedicalConditionStage medicalConditionStage);
		public List<Clazz.MedicalConditionStage> getMedicalConditionStageList();
		public void setMedicalConditionStageList(List<Clazz.MedicalConditionStage> medicalConditionStageList);
		public boolean hasMedicalConditionStage();

		/**
		 * @see <a href="http://schema.org/MedicalContraindication">http://schema.org/MedicalContraindication</a>
		 */
		public Clazz.MedicalContraindication getMedicalContraindication();
		public void setMedicalContraindication(Clazz.MedicalContraindication medicalContraindication);
		public List<Clazz.MedicalContraindication> getMedicalContraindicationList();
		public void setMedicalContraindicationList(List<Clazz.MedicalContraindication> medicalContraindicationList);
		public boolean hasMedicalContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		/**
		 * @see <a href="http://schema.org/MedicalEntity">http://schema.org/MedicalEntity</a>
		 */
		public Clazz.MedicalEntity getMedicalEntity();
		public void setMedicalEntity(Clazz.MedicalEntity medicalEntity);
		public List<Clazz.MedicalEntity> getMedicalEntityList();
		public void setMedicalEntityList(List<Clazz.MedicalEntity> medicalEntityList);
		public boolean hasMedicalEntity();

		/**
		 * @see <a href="http://schema.org/MedicalGuideline">http://schema.org/MedicalGuideline</a>
		 */
		public Clazz.MedicalGuideline getMedicalGuideline();
		public void setMedicalGuideline(Clazz.MedicalGuideline medicalGuideline);
		public List<Clazz.MedicalGuideline> getMedicalGuidelineList();
		public void setMedicalGuidelineList(List<Clazz.MedicalGuideline> medicalGuidelineList);
		public boolean hasMedicalGuideline();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineContraindication">http://schema.org/MedicalGuidelineContraindication</a>
		 */
		public Clazz.MedicalGuidelineContraindication getMedicalGuidelineContraindication();
		public void setMedicalGuidelineContraindication(Clazz.MedicalGuidelineContraindication medicalGuidelineContraindication);
		public List<Clazz.MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList();
		public void setMedicalGuidelineContraindicationList(List<Clazz.MedicalGuidelineContraindication> medicalGuidelineContraindicationList);
		public boolean hasMedicalGuidelineContraindication();

		/**
		 * @see <a href="http://schema.org/MedicalGuidelineRecommendation">http://schema.org/MedicalGuidelineRecommendation</a>
		 */
		public Clazz.MedicalGuidelineRecommendation getMedicalGuidelineRecommendation();
		public void setMedicalGuidelineRecommendation(Clazz.MedicalGuidelineRecommendation medicalGuidelineRecommendation);
		public List<Clazz.MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList();
		public void setMedicalGuidelineRecommendationList(List<Clazz.MedicalGuidelineRecommendation> medicalGuidelineRecommendationList);
		public boolean hasMedicalGuidelineRecommendation();

		/**
		 * @see <a href="http://schema.org/MedicalIndication">http://schema.org/MedicalIndication</a>
		 */
		public Clazz.MedicalIndication getMedicalIndication();
		public void setMedicalIndication(Clazz.MedicalIndication medicalIndication);
		public List<Clazz.MedicalIndication> getMedicalIndicationList();
		public void setMedicalIndicationList(List<Clazz.MedicalIndication> medicalIndicationList);
		public boolean hasMedicalIndication();

		/**
		 * @see <a href="http://schema.org/MedicalIntangible">http://schema.org/MedicalIntangible</a>
		 */
		public Clazz.MedicalIntangible getMedicalIntangible();
		public void setMedicalIntangible(Clazz.MedicalIntangible medicalIntangible);
		public List<Clazz.MedicalIntangible> getMedicalIntangibleList();
		public void setMedicalIntangibleList(List<Clazz.MedicalIntangible> medicalIntangibleList);
		public boolean hasMedicalIntangible();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudy">http://schema.org/MedicalObservationalStudy</a>
		 */
		public Clazz.MedicalObservationalStudy getMedicalObservationalStudy();
		public void setMedicalObservationalStudy(Clazz.MedicalObservationalStudy medicalObservationalStudy);
		public List<Clazz.MedicalObservationalStudy> getMedicalObservationalStudyList();
		public void setMedicalObservationalStudyList(List<Clazz.MedicalObservationalStudy> medicalObservationalStudyList);
		public boolean hasMedicalObservationalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalProcedure">http://schema.org/MedicalProcedure</a>
		 */
		public Clazz.MedicalProcedure getMedicalProcedure();
		public void setMedicalProcedure(Clazz.MedicalProcedure medicalProcedure);
		public List<Clazz.MedicalProcedure> getMedicalProcedureList();
		public void setMedicalProcedureList(List<Clazz.MedicalProcedure> medicalProcedureList);
		public boolean hasMedicalProcedure();

		/**
		 * @see <a href="http://schema.org/MedicalRiskCalculator">http://schema.org/MedicalRiskCalculator</a>
		 */
		public Clazz.MedicalRiskCalculator getMedicalRiskCalculator();
		public void setMedicalRiskCalculator(Clazz.MedicalRiskCalculator medicalRiskCalculator);
		public List<Clazz.MedicalRiskCalculator> getMedicalRiskCalculatorList();
		public void setMedicalRiskCalculatorList(List<Clazz.MedicalRiskCalculator> medicalRiskCalculatorList);
		public boolean hasMedicalRiskCalculator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskEstimator">http://schema.org/MedicalRiskEstimator</a>
		 */
		public Clazz.MedicalRiskEstimator getMedicalRiskEstimator();
		public void setMedicalRiskEstimator(Clazz.MedicalRiskEstimator medicalRiskEstimator);
		public List<Clazz.MedicalRiskEstimator> getMedicalRiskEstimatorList();
		public void setMedicalRiskEstimatorList(List<Clazz.MedicalRiskEstimator> medicalRiskEstimatorList);
		public boolean hasMedicalRiskEstimator();

		/**
		 * @see <a href="http://schema.org/MedicalRiskFactor">http://schema.org/MedicalRiskFactor</a>
		 */
		public Clazz.MedicalRiskFactor getMedicalRiskFactor();
		public void setMedicalRiskFactor(Clazz.MedicalRiskFactor medicalRiskFactor);
		public List<Clazz.MedicalRiskFactor> getMedicalRiskFactorList();
		public void setMedicalRiskFactorList(List<Clazz.MedicalRiskFactor> medicalRiskFactorList);
		public boolean hasMedicalRiskFactor();

		/**
		 * @see <a href="http://schema.org/MedicalRiskScore">http://schema.org/MedicalRiskScore</a>
		 */
		public Clazz.MedicalRiskScore getMedicalRiskScore();
		public void setMedicalRiskScore(Clazz.MedicalRiskScore medicalRiskScore);
		public List<Clazz.MedicalRiskScore> getMedicalRiskScoreList();
		public void setMedicalRiskScoreList(List<Clazz.MedicalRiskScore> medicalRiskScoreList);
		public boolean hasMedicalRiskScore();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalStudy">http://schema.org/MedicalStudy</a>
		 */
		public Clazz.MedicalStudy getMedicalStudy();
		public void setMedicalStudy(Clazz.MedicalStudy medicalStudy);
		public List<Clazz.MedicalStudy> getMedicalStudyList();
		public void setMedicalStudyList(List<Clazz.MedicalStudy> medicalStudyList);
		public boolean hasMedicalStudy();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/MedicalTherapy">http://schema.org/MedicalTherapy</a>
		 */
		public Clazz.MedicalTherapy getMedicalTherapy();
		public void setMedicalTherapy(Clazz.MedicalTherapy medicalTherapy);
		public List<Clazz.MedicalTherapy> getMedicalTherapyList();
		public void setMedicalTherapyList(List<Clazz.MedicalTherapy> medicalTherapyList);
		public boolean hasMedicalTherapy();

		/**
		 * @see <a href="http://schema.org/MedicalTrial">http://schema.org/MedicalTrial</a>
		 */
		public Clazz.MedicalTrial getMedicalTrial();
		public void setMedicalTrial(Clazz.MedicalTrial medicalTrial);
		public List<Clazz.MedicalTrial> getMedicalTrialList();
		public void setMedicalTrialList(List<Clazz.MedicalTrial> medicalTrialList);
		public boolean hasMedicalTrial();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/OccupationalTherapy">http://schema.org/OccupationalTherapy</a>
		 */
		public Clazz.OccupationalTherapy getOccupationalTherapy();
		public void setOccupationalTherapy(Clazz.OccupationalTherapy occupationalTherapy);
		public List<Clazz.OccupationalTherapy> getOccupationalTherapyList();
		public void setOccupationalTherapyList(List<Clazz.OccupationalTherapy> occupationalTherapyList);
		public boolean hasOccupationalTherapy();

		/**
		 * @see <a href="http://schema.org/PalliativeProcedure">http://schema.org/PalliativeProcedure</a>
		 */
		public Clazz.PalliativeProcedure getPalliativeProcedure();
		public void setPalliativeProcedure(Clazz.PalliativeProcedure palliativeProcedure);
		public List<Clazz.PalliativeProcedure> getPalliativeProcedureList();
		public void setPalliativeProcedureList(List<Clazz.PalliativeProcedure> palliativeProcedureList);
		public boolean hasPalliativeProcedure();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		/**
		 * @see <a href="http://schema.org/PhysicalActivity">http://schema.org/PhysicalActivity</a>
		 */
		public Clazz.PhysicalActivity getPhysicalActivity();
		public void setPhysicalActivity(Clazz.PhysicalActivity physicalActivity);
		public List<Clazz.PhysicalActivity> getPhysicalActivityList();
		public void setPhysicalActivityList(List<Clazz.PhysicalActivity> physicalActivityList);
		public boolean hasPhysicalActivity();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public Clazz.PhysicalExam getPhysicalExam();
		public void setPhysicalExam(Clazz.PhysicalExam physicalExam);
		public List<Clazz.PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<Clazz.PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/PhysicalTherapy">http://schema.org/PhysicalTherapy</a>
		 */
		public Clazz.PhysicalTherapy getPhysicalTherapy();
		public void setPhysicalTherapy(Clazz.PhysicalTherapy physicalTherapy);
		public List<Clazz.PhysicalTherapy> getPhysicalTherapyList();
		public void setPhysicalTherapyList(List<Clazz.PhysicalTherapy> physicalTherapyList);
		public boolean hasPhysicalTherapy();

		/**
		 * @see <a href="http://schema.org/PreventionIndication">http://schema.org/PreventionIndication</a>
		 */
		public Clazz.PreventionIndication getPreventionIndication();
		public void setPreventionIndication(Clazz.PreventionIndication preventionIndication);
		public List<Clazz.PreventionIndication> getPreventionIndicationList();
		public void setPreventionIndicationList(List<Clazz.PreventionIndication> preventionIndicationList);
		public boolean hasPreventionIndication();

		/**
		 * @see <a href="http://schema.org/PsychologicalTreatment">http://schema.org/PsychologicalTreatment</a>
		 */
		public Clazz.PsychologicalTreatment getPsychologicalTreatment();
		public void setPsychologicalTreatment(Clazz.PsychologicalTreatment psychologicalTreatment);
		public List<Clazz.PsychologicalTreatment> getPsychologicalTreatmentList();
		public void setPsychologicalTreatmentList(List<Clazz.PsychologicalTreatment> psychologicalTreatmentList);
		public boolean hasPsychologicalTreatment();

		/**
		 * @see <a href="http://schema.org/RadiationTherapy">http://schema.org/RadiationTherapy</a>
		 */
		public Clazz.RadiationTherapy getRadiationTherapy();
		public void setRadiationTherapy(Clazz.RadiationTherapy radiationTherapy);
		public List<Clazz.RadiationTherapy> getRadiationTherapyList();
		public void setRadiationTherapyList(List<Clazz.RadiationTherapy> radiationTherapyList);
		public boolean hasRadiationTherapy();

		/**
		 * @see <a href="http://schema.org/RecommendedDoseSchedule">http://schema.org/RecommendedDoseSchedule</a>
		 */
		public Clazz.RecommendedDoseSchedule getRecommendedDoseSchedule();
		public void setRecommendedDoseSchedule(Clazz.RecommendedDoseSchedule recommendedDoseSchedule);
		public List<Clazz.RecommendedDoseSchedule> getRecommendedDoseScheduleList();
		public void setRecommendedDoseScheduleList(List<Clazz.RecommendedDoseSchedule> recommendedDoseScheduleList);
		public boolean hasRecommendedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/ReportedDoseSchedule">http://schema.org/ReportedDoseSchedule</a>
		 */
		public Clazz.ReportedDoseSchedule getReportedDoseSchedule();
		public void setReportedDoseSchedule(Clazz.ReportedDoseSchedule reportedDoseSchedule);
		public List<Clazz.ReportedDoseSchedule> getReportedDoseScheduleList();
		public void setReportedDoseScheduleList(List<Clazz.ReportedDoseSchedule> reportedDoseScheduleList);
		public boolean hasReportedDoseSchedule();

		/**
		 * @see <a href="http://schema.org/RespiratoryTherapy">http://schema.org/RespiratoryTherapy</a>
		 */
		public RespiratoryTherapy getRespiratoryTherapy();
		public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy);
		public List<RespiratoryTherapy> getRespiratoryTherapyList();
		public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList);
		public boolean hasRespiratoryTherapy();

		/**
		 * @see <a href="http://schema.org/Substance">http://schema.org/Substance</a>
		 */
		public Clazz.Substance getSubstance();
		public void setSubstance(Clazz.Substance substance);
		public List<Clazz.Substance> getSubstanceList();
		public void setSubstanceList(List<Clazz.Substance> substanceList);
		public boolean hasSubstance();

		/**
		 * @see <a href="http://schema.org/SuperficialAnatomy">http://schema.org/SuperficialAnatomy</a>
		 */
		public Clazz.SuperficialAnatomy getSuperficialAnatomy();
		public void setSuperficialAnatomy(Clazz.SuperficialAnatomy superficialAnatomy);
		public List<Clazz.SuperficialAnatomy> getSuperficialAnatomyList();
		public void setSuperficialAnatomyList(List<Clazz.SuperficialAnatomy> superficialAnatomyList);
		public boolean hasSuperficialAnatomy();

		/**
		 * @see <a href="http://schema.org/SurgicalProcedure">http://schema.org/SurgicalProcedure</a>
		 */
		public SurgicalProcedure getSurgicalProcedure();
		public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure);
		public List<SurgicalProcedure> getSurgicalProcedureList();
		public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList);
		public boolean hasSurgicalProcedure();

		/**
		 * @see <a href="http://schema.org/TherapeuticProcedure">http://schema.org/TherapeuticProcedure</a>
		 */
		public Clazz.TherapeuticProcedure getTherapeuticProcedure();
		public void setTherapeuticProcedure(Clazz.TherapeuticProcedure therapeuticProcedure);
		public List<Clazz.TherapeuticProcedure> getTherapeuticProcedureList();
		public void setTherapeuticProcedureList(List<Clazz.TherapeuticProcedure> therapeuticProcedureList);
		public boolean hasTherapeuticProcedure();

		/**
		 * @see <a href="http://schema.org/TreatmentIndication">http://schema.org/TreatmentIndication</a>
		 */
		public Clazz.TreatmentIndication getTreatmentIndication();
		public void setTreatmentIndication(Clazz.TreatmentIndication treatmentIndication);
		public List<Clazz.TreatmentIndication> getTreatmentIndicationList();
		public void setTreatmentIndicationList(List<Clazz.TreatmentIndication> treatmentIndicationList);
		public boolean hasTreatmentIndication();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subStageSuffix")
	@SchemaOrgLabel("subStageSuffix")
	@SchemaOrgComment("The substage, e.g. 'a' for Stage IIIa.")
	@CamelizedName("subStageSuffix")
	@ConstantizedName("SUB_STAGE_SUFFIX")
	public interface SubStageSuffix extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/subStructure")
	@SchemaOrgLabel("subStructure")
	@SchemaOrgComment(""
			+ "Component (sub-)structure(s) that comprise this anatomical structure.")
	@CamelizedName("subStructure")
	@ConstantizedName("SUB_STRUCTURE")
	public interface SubStructure extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subTest")
	@SchemaOrgLabel("subTest")
	@SchemaOrgComment("A component test of the panel.")
	@CamelizedName("subTest")
	@ConstantizedName("SUB_TEST")
	public interface SubTest extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/subtype")
	@SchemaOrgLabel("subtype")
	@SchemaOrgComment(""
			+ "A more specific type of the condition, where applicable, for example 'Type 1"
			+ " Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for Diabetes.")
	@CamelizedName("subtype")
	@ConstantizedName("SUBTYPE")
	public interface Subtype extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/supplyTo")
	@SchemaOrgLabel("supplyTo")
	@SchemaOrgComment(""
			+ "The area to which the artery supplies blood.")
	@CamelizedName("supplyTo")
	@ConstantizedName("SUPPLY_TO")
	public interface SupplyTo extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/targetPopulation")
	@SchemaOrgLabel("targetPopulation")
	@SchemaOrgComment(""
			+ "Characteristics of the population for which this is intended, or which typically"
			+ " uses it, e.g. 'adults'.")
	@CamelizedName("targetPopulation")
	@ConstantizedName("TARGET_POPULATION")
	public interface TargetPopulation extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/tissueSample")
	@SchemaOrgLabel("tissueSample")
	@SchemaOrgComment(""
			+ "The type of tissue sample required for the test.")
	@CamelizedName("tissueSample")
	@ConstantizedName("TISSUE_SAMPLE")
	public interface TissueSample extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/transmissionMethod")
	@SchemaOrgLabel("transmissionMethod")
	@SchemaOrgComment(""
			+ "How the disease spreads, either as a route or vector, for example 'direct"
			+ " contact', 'Aedes aegypti', etc.")
	@CamelizedName("transmissionMethod")
	@ConstantizedName("TRANSMISSION_METHOD")
	public interface TransmissionMethod extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/trialDesign")
	@SchemaOrgLabel("trialDesign")
	@SchemaOrgComment(""
			+ "Specifics about the trial design (enumerated).")
	@CamelizedName("trialDesign")
	@ConstantizedName("TRIAL_DESIGN")
	public interface TrialDesign extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public Clazz.MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(Clazz.MedicalTrialDesign medicalTrialDesign);
		public List<Clazz.MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<Clazz.MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/tributary")
	@SchemaOrgLabel("tributary")
	@SchemaOrgComment(""
			+ "The anatomical or organ system that the vein flows into; a larger structure that"
			+ " the vein connects to.")
	@CamelizedName("tributary")
	@ConstantizedName("TRIBUTARY")
	public interface Tributary extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/AnatomicalStructure">http://schema.org/AnatomicalStructure</a>
		 */
		public Clazz.AnatomicalStructure getAnatomicalStructure();
		public void setAnatomicalStructure(Clazz.AnatomicalStructure anatomicalStructure);
		public List<Clazz.AnatomicalStructure> getAnatomicalStructureList();
		public void setAnatomicalStructureList(List<Clazz.AnatomicalStructure> anatomicalStructureList);
		public boolean hasAnatomicalStructure();

		/**
		 * @see <a href="http://schema.org/Artery">http://schema.org/Artery</a>
		 */
		public Clazz.Artery getArtery();
		public void setArtery(Clazz.Artery artery);
		public List<Clazz.Artery> getArteryList();
		public void setArteryList(List<Clazz.Artery> arteryList);
		public boolean hasArtery();

		/**
		 * @see <a href="http://schema.org/Bone">http://schema.org/Bone</a>
		 */
		public Clazz.Bone getBone();
		public void setBone(Clazz.Bone bone);
		public List<Clazz.Bone> getBoneList();
		public void setBoneList(List<Clazz.Bone> boneList);
		public boolean hasBone();

		/**
		 * @see <a href="http://schema.org/BrainStructure">http://schema.org/BrainStructure</a>
		 */
		public Clazz.BrainStructure getBrainStructure();
		public void setBrainStructure(Clazz.BrainStructure brainStructure);
		public List<Clazz.BrainStructure> getBrainStructureList();
		public void setBrainStructureList(List<Clazz.BrainStructure> brainStructureList);
		public boolean hasBrainStructure();

		/**
		 * @see <a href="http://schema.org/Joint">http://schema.org/Joint</a>
		 */
		public Clazz.Joint getJoint();
		public void setJoint(Clazz.Joint joint);
		public List<Clazz.Joint> getJointList();
		public void setJointList(List<Clazz.Joint> jointList);
		public boolean hasJoint();

		/**
		 * @see <a href="http://schema.org/Ligament">http://schema.org/Ligament</a>
		 */
		public Clazz.Ligament getLigament();
		public void setLigament(Clazz.Ligament ligament);
		public List<Clazz.Ligament> getLigamentList();
		public void setLigamentList(List<Clazz.Ligament> ligamentList);
		public boolean hasLigament();

		/**
		 * @see <a href="http://schema.org/LymphaticVessel">http://schema.org/LymphaticVessel</a>
		 */
		public Clazz.LymphaticVessel getLymphaticVessel();
		public void setLymphaticVessel(Clazz.LymphaticVessel lymphaticVessel);
		public List<Clazz.LymphaticVessel> getLymphaticVesselList();
		public void setLymphaticVesselList(List<Clazz.LymphaticVessel> lymphaticVesselList);
		public boolean hasLymphaticVessel();

		/**
		 * @see <a href="http://schema.org/Muscle">http://schema.org/Muscle</a>
		 */
		public Clazz.Muscle getMuscle();
		public void setMuscle(Clazz.Muscle muscle);
		public List<Clazz.Muscle> getMuscleList();
		public void setMuscleList(List<Clazz.Muscle> muscleList);
		public boolean hasMuscle();

		/**
		 * @see <a href="http://schema.org/Nerve">http://schema.org/Nerve</a>
		 */
		public Clazz.Nerve getNerve();
		public void setNerve(Clazz.Nerve nerve);
		public List<Clazz.Nerve> getNerveList();
		public void setNerveList(List<Clazz.Nerve> nerveList);
		public boolean hasNerve();

		/**
		 * @see <a href="http://schema.org/Vein">http://schema.org/Vein</a>
		 */
		public Clazz.Vein getVein();
		public void setVein(Clazz.Vein vein);
		public List<Clazz.Vein> getVeinList();
		public void setVeinList(List<Clazz.Vein> veinList);
		public boolean hasVein();

		/**
		 * @see <a href="http://schema.org/Vessel">http://schema.org/Vessel</a>
		 */
		public Clazz.Vessel getVessel();
		public void setVessel(Clazz.Vessel vessel);
		public List<Clazz.Vessel> getVesselList();
		public void setVesselList(List<Clazz.Vessel> vesselList);
		public boolean hasVessel();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/typicalTest")
	@SchemaOrgLabel("typicalTest")
	@SchemaOrgComment(""
			+ "A medical test typically performed given this condition.")
	@CamelizedName("typicalTest")
	@ConstantizedName("TYPICAL_TEST")
	public interface TypicalTest extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/BloodTest">http://schema.org/BloodTest</a>
		 */
		public Clazz.BloodTest getBloodTest();
		public void setBloodTest(Clazz.BloodTest bloodTest);
		public List<Clazz.BloodTest> getBloodTestList();
		public void setBloodTestList(List<Clazz.BloodTest> bloodTestList);
		public boolean hasBloodTest();

		/**
		 * @see <a href="http://schema.org/ImagingTest">http://schema.org/ImagingTest</a>
		 */
		public Clazz.ImagingTest getImagingTest();
		public void setImagingTest(Clazz.ImagingTest imagingTest);
		public List<Clazz.ImagingTest> getImagingTestList();
		public void setImagingTestList(List<Clazz.ImagingTest> imagingTestList);
		public boolean hasImagingTest();

		/**
		 * @see <a href="http://schema.org/MedicalTest">http://schema.org/MedicalTest</a>
		 */
		public Clazz.MedicalTest getMedicalTest();
		public void setMedicalTest(Clazz.MedicalTest medicalTest);
		public List<Clazz.MedicalTest> getMedicalTestList();
		public void setMedicalTestList(List<Clazz.MedicalTest> medicalTestList);
		public boolean hasMedicalTest();

		/**
		 * @see <a href="http://schema.org/MedicalTestPanel">http://schema.org/MedicalTestPanel</a>
		 */
		public Clazz.MedicalTestPanel getMedicalTestPanel();
		public void setMedicalTestPanel(Clazz.MedicalTestPanel medicalTestPanel);
		public List<Clazz.MedicalTestPanel> getMedicalTestPanelList();
		public void setMedicalTestPanelList(List<Clazz.MedicalTestPanel> medicalTestPanelList);
		public boolean hasMedicalTestPanel();

		/**
		 * @see <a href="http://schema.org/PathologyTest">http://schema.org/PathologyTest</a>
		 */
		public Clazz.PathologyTest getPathologyTest();
		public void setPathologyTest(Clazz.PathologyTest pathologyTest);
		public List<Clazz.PathologyTest> getPathologyTestList();
		public void setPathologyTestList(List<Clazz.PathologyTest> pathologyTestList);
		public boolean hasPathologyTest();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/usedToDiagnose")
	@SchemaOrgLabel("usedToDiagnose")
	@SchemaOrgComment(""
			+ "A condition the test is used to diagnose.")
	@CamelizedName("usedToDiagnose")
	@ConstantizedName("USED_TO_DIAGNOSE")
	public interface UsedToDiagnose extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>
		 */
		public Clazz.InfectiousDisease getInfectiousDisease();
		public void setInfectiousDisease(Clazz.InfectiousDisease infectiousDisease);
		public List<Clazz.InfectiousDisease> getInfectiousDiseaseList();
		public void setInfectiousDiseaseList(List<Clazz.InfectiousDisease> infectiousDiseaseList);
		public boolean hasInfectiousDisease();

		/**
		 * @see <a href="http://schema.org/MedicalCondition">http://schema.org/MedicalCondition</a>
		 */
		public Clazz.MedicalCondition getMedicalCondition();
		public void setMedicalCondition(Clazz.MedicalCondition medicalCondition);
		public List<Clazz.MedicalCondition> getMedicalConditionList();
		public void setMedicalConditionList(List<Clazz.MedicalCondition> medicalConditionList);
		public boolean hasMedicalCondition();

		/**
		 * @see <a href="http://schema.org/MedicalSign">http://schema.org/MedicalSign</a>
		 */
		public Clazz.MedicalSign getMedicalSign();
		public void setMedicalSign(Clazz.MedicalSign medicalSign);
		public List<Clazz.MedicalSign> getMedicalSignList();
		public void setMedicalSignList(List<Clazz.MedicalSign> medicalSignList);
		public boolean hasMedicalSign();

		/**
		 * @see <a href="http://schema.org/MedicalSignOrSymptom">http://schema.org/MedicalSignOrSymptom</a>
		 */
		public Clazz.MedicalSignOrSymptom getMedicalSignOrSymptom();
		public void setMedicalSignOrSymptom(Clazz.MedicalSignOrSymptom medicalSignOrSymptom);
		public List<Clazz.MedicalSignOrSymptom> getMedicalSignOrSymptomList();
		public void setMedicalSignOrSymptomList(List<Clazz.MedicalSignOrSymptom> medicalSignOrSymptomList);
		public boolean hasMedicalSignOrSymptom();

		/**
		 * @see <a href="http://schema.org/MedicalSymptom">http://schema.org/MedicalSymptom</a>
		 */
		public Clazz.MedicalSymptom getMedicalSymptom();
		public void setMedicalSymptom(Clazz.MedicalSymptom medicalSymptom);
		public List<Clazz.MedicalSymptom> getMedicalSymptomList();
		public void setMedicalSymptomList(List<Clazz.MedicalSymptom> medicalSymptomList);
		public boolean hasMedicalSymptom();

		/**
		 * @see <a href="http://schema.org/VitalSign">http://schema.org/VitalSign</a>
		 */
		public Clazz.VitalSign getVitalSign();
		public void setVitalSign(Clazz.VitalSign vitalSign);
		public List<Clazz.VitalSign> getVitalSignList();
		public void setVitalSignList(List<Clazz.VitalSign> vitalSignList);
		public boolean hasVitalSign();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/usesDevice")
	@SchemaOrgLabel("usesDevice")
	@SchemaOrgComment("Device used to perform the test.")
	@CamelizedName("usesDevice")
	@ConstantizedName("USES_DEVICE")
	public interface UsesDevice extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/MedicalDevice">http://schema.org/MedicalDevice</a>
		 */
		public Clazz.MedicalDevice getMedicalDevice();
		public void setMedicalDevice(Clazz.MedicalDevice medicalDevice);
		public List<Clazz.MedicalDevice> getMedicalDeviceList();
		public void setMedicalDeviceList(List<Clazz.MedicalDevice> medicalDeviceList);
		public boolean hasMedicalDevice();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/warning")
	@SchemaOrgLabel("warning")
	@SchemaOrgComment(""
			+ "Any FDA or other warnings about the drug (text or URL).")
	@CamelizedName("warning")
	@ConstantizedName("WARNING")
	public interface Warning extends NativeValueText, SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/workload")
	@SchemaOrgLabel("workload")
	@SchemaOrgComment(""
			+ "Quantitative measure of the physiologic output of the exercise; also referred to"
			+ " as energy expenditure.")
	@CamelizedName("workload")
	@ConstantizedName("WORKLOAD")
	public interface Workload extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Energy">http://schema.org/Energy</a>
		 */
		public Energy getEnergy();
		public void setEnergy(Energy energy);
		public List<Energy> getEnergyList();
		public void setEnergyList(List<Energy> energyList);
		public boolean hasEnergy();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		public String getNativeValue();

	}

}
