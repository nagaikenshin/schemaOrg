package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
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
import org.kyojo.schemaorg.m3n4.core.Clazz.Action;
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
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ApprovedIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Artery;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BloodTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Bone;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BrainStructure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DDxElement;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticLab;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DietarySupplement;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugClass;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugCost;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugCostCategory;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugLegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugPregnancyCategory;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugStrength;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ImagingTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.InfectiousAgentClass;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.InfectiousDisease;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Joint;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LifestyleModification;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Ligament;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LymphaticVessel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MaximumDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCause;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalClinic;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCode;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCondition;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalConditionStage;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalContraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalDevice;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalDevicePurpose;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEntity;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEnumeration;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEvidenceLevel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineContraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineRecommendation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIntangible;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalObservationalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalObservationalStudyDesign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalProcedureType;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskCalculator;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskEstimator;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskFactor;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskScore;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalScholarlyArticle;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSpecialty;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalStudyStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTestPanel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTrial;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTrialDesign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalWebPage;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicineSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Muscle;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Nerve;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.OccupationalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Optician;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PalliativeProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PathologyTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivity;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PreventionIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PsychologicalTreatment;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RadiationTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RecommendedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ReportedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Substance;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.SuperficialAnatomy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TherapeuticProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TreatmentIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vein;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vessel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VeterinaryCare;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;
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

public class ITEM_REVIEWED implements Container.ItemReviewed {

	private static final long serialVersionUID = 1L;

	public List<AMRadioChannel> amRadioChannelList;
	public List<APIReference> apiReferenceList;
	public List<AboutPage> aboutPageList;
	public List<AcceptAction> acceptActionList;
	public List<Accommodation> accommodationList;
	public List<AccountingService> accountingServiceList;
	public List<AchieveAction> achieveActionList;
	public List<Action> actionList;
	public List<ActionAccessSpecification> actionAccessSpecificationList;
	public List<ActionStatusType> actionStatusTypeList;
	public List<ActivateAction> activateActionList;
	public List<AddAction> addActionList;
	public List<AdministrativeArea> administrativeAreaList;
	public List<AdultEntertainment> adultEntertainmentList;
	public List<AdvertiserContentArticle> advertiserContentArticleList;
	public List<AggregateOffer> aggregateOfferList;
	public List<AggregateRating> aggregateRatingList;
	public List<AgreeAction> agreeActionList;
	public List<Airline> airlineList;
	public List<Airport> airportList;
	public List<AlignmentObject> alignmentObjectList;
	public List<AllocateAction> allocateActionList;
	public List<AmusementPark> amusementParkList;
	public List<AnalysisNewsArticle> analysisNewsArticleList;
	public List<AnatomicalStructure> anatomicalStructureList;
	public List<AnatomicalSystem> anatomicalSystemList;
	public List<AnimalShelter> animalShelterList;
	public List<Answer> answerList;
	public List<Apartment> apartmentList;
	public List<ApartmentComplex> apartmentComplexList;
	public List<AppendAction> appendActionList;
	public List<ApplyAction> applyActionList;
	public List<ApprovedIndication> approvedIndicationList;
	public List<Aquarium> aquariumList;
	public List<ArriveAction> arriveActionList;
	public List<ArtGallery> artGalleryList;
	public List<Artery> arteryList;
	public List<Article> articleList;
	public List<AskAction> askActionList;
	public List<AskPublicNewsArticle> askPublicNewsArticleList;
	public List<AssessAction> assessActionList;
	public List<AssignAction> assignActionList;
	public List<Atlas> atlasList;
	public List<Attorney> attorneyList;
	public List<Audience> audienceList;
	public List<AudioObject> audioObjectList;
	public List<Audiobook> audiobookList;
	public List<AuthorizeAction> authorizeActionList;
	public List<AutoBodyShop> autoBodyShopList;
	public List<AutoDealer> autoDealerList;
	public List<AutoPartsStore> autoPartsStoreList;
	public List<AutoRental> autoRentalList;
	public List<AutoRepair> autoRepairList;
	public List<AutoWash> autoWashList;
	public List<AutomatedTeller> automatedTellerList;
	public List<AutomotiveBusiness> automotiveBusinessList;
	public List<BackgroundNewsArticle> backgroundNewsArticleList;
	public List<Bakery> bakeryList;
	public List<BankAccount> bankAccountList;
	public List<BankOrCreditUnion> bankOrCreditUnionList;
	public List<BarOrPub> barOrPubList;
	public List<Barcode> barcodeList;
	public List<Beach> beachList;
	public List<BeautySalon> beautySalonList;
	public List<BedAndBreakfast> bedAndBreakfastList;
	public List<BedDetails> bedDetailsList;
	public List<BedType> bedTypeList;
	public List<BefriendAction> befriendActionList;
	public List<BikeStore> bikeStoreList;
	public List<Blog> blogList;
	public List<BlogPosting> blogPostingList;
	public List<BloodTest> bloodTestList;
	public List<BoardingPolicyType> boardingPolicyTypeList;
	public List<BodyOfWater> bodyOfWaterList;
	public List<Bone> boneList;
	public List<Book> bookList;
	public List<BookFormatType> bookFormatTypeList;
	public List<BookSeries> bookSeriesList;
	public List<BookStore> bookStoreList;
	public List<BookmarkAction> bookmarkActionList;
	public List<BorrowAction> borrowActionList;
	public List<BowlingAlley> bowlingAlleyList;
	public List<BrainStructure> brainStructureList;
	public List<Brand> brandList;
	public List<BreadcrumbList> breadcrumbListList;
	public List<Brewery> breweryList;
	public List<Bridge> bridgeList;
	public List<BroadcastChannel> broadcastChannelList;
	public List<BroadcastEvent> broadcastEventList;
	public List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList;
	public List<BroadcastService> broadcastServiceList;
	public List<BrokerageAccount> brokerageAccountList;
	public List<BuddhistTemple> buddhistTempleList;
	public List<BusOrCoach> busOrCoachList;
	public List<BusReservation> busReservationList;
	public List<BusStation> busStationList;
	public List<BusStop> busStopList;
	public List<BusTrip> busTripList;
	public List<BusinessAudience> businessAudienceList;
	public List<BusinessEntityType> businessEntityTypeList;
	public List<BusinessEvent> businessEventList;
	public List<BusinessFunction> businessFunctionList;
	public List<BuyAction> buyActionList;
	public List<CableOrSatelliteService> cableOrSatelliteServiceList;
	public List<CafeOrCoffeeShop> cafeOrCoffeeShopList;
	public List<Campground> campgroundList;
	public List<CampingPitch> campingPitchList;
	public List<Canal> canalList;
	public List<CancelAction> cancelActionList;
	public List<Car> carList;
	public List<CarUsageType> carUsageTypeList;
	public List<Casino> casinoList;
	public List<CategoryCode> categoryCodeList;
	public List<CategoryCodeSet> categoryCodeSetList;
	public List<CatholicChurch> catholicChurchList;
	public List<Cemetery> cemeteryList;
	public List<Chapter> chapterList;
	public List<CheckAction> checkActionList;
	public List<CheckInAction> checkInActionList;
	public List<CheckOutAction> checkOutActionList;
	public List<CheckoutPage> checkoutPageList;
	public List<ChildCare> childCareList;
	public List<ChildrensEvent> childrensEventList;
	public List<ChooseAction> chooseActionList;
	public List<Church> churchList;
	public List<City> cityList;
	public List<CityHall> cityHallList;
	public List<CivicStructure> civicStructureList;
	public List<Claim> claimList;
	public List<ClaimReview> claimReviewList;
	public List<Class> clazzList;
	public List<Clip> clipList;
	public List<ClothingStore> clothingStoreList;
	public List<Collection> collectionList;
	public List<CollectionPage> collectionPageList;
	public List<CollegeOrUniversity> collegeOrUniversityList;
	public List<ComedyClub> comedyClubList;
	public List<ComedyEvent> comedyEventList;
	public List<ComicCoverArt> comicCoverArtList;
	public List<ComicIssue> comicIssueList;
	public List<ComicSeries> comicSeriesList;
	public List<ComicStory> comicStoryList;
	public List<Comment> commentList;
	public List<CommentAction> commentActionList;
	public List<CommunicateAction> communicateActionList;
	public List<CommunityHealth> communityHealthList;
	public List<CompleteDataFeed> completeDataFeedList;
	public List<CompoundPriceSpecification> compoundPriceSpecificationList;
	public List<ComputerLanguage> computerLanguageList;
	public List<ComputerStore> computerStoreList;
	public List<ConfirmAction> confirmActionList;
	public List<Consortium> consortiumList;
	public List<ConsumeAction> consumeActionList;
	public List<ContactPage> contactPageList;
	public List<ContactPoint> contactPointList;
	public List<ContactPointOption> contactPointOptionList;
	public List<Continent> continentList;
	public List<ControlAction> controlActionList;
	public List<ConvenienceStore> convenienceStoreList;
	public List<Conversation> conversationList;
	public List<CookAction> cookActionList;
	public List<Corporation> corporationList;
	public List<CorrectionComment> correctionCommentList;
	public List<Country> countryList;
	public List<Course> courseList;
	public List<CourseInstance> courseInstanceList;
	public List<Courthouse> courthouseList;
	public List<CoverArt> coverArtList;
	public List<CreateAction> createActionList;
	public List<CreativeWork> creativeWorkList;
	public List<CreativeWorkSeason> creativeWorkSeasonList;
	public List<CreativeWorkSeries> creativeWorkSeriesList;
	public List<CreditCard> creditCardList;
	public List<Crematorium> crematoriumList;
	public List<CriticReview> criticReviewList;
	public List<CurrencyConversionService> currencyConversionServiceList;
	public List<DDxElement> ddxElementList;
	public List<DanceEvent> danceEventList;
	public List<DanceGroup> danceGroupList;
	public List<DataCatalog> dataCatalogList;
	public List<DataDownload> dataDownloadList;
	public List<DataFeed> dataFeedList;
	public List<DataFeedItem> dataFeedItemList;
	public List<Dataset> datasetList;
	public List<DayOfWeek> dayOfWeekList;
	public List<DaySpa> daySpaList;
	public List<DeactivateAction> deactivateActionList;
	public List<DefenceEstablishment> defenceEstablishmentList;
	public List<DefinedTerm> definedTermList;
	public List<DefinedTermSet> definedTermSetList;
	public List<DeleteAction> deleteActionList;
	public List<DeliveryChargeSpecification> deliveryChargeSpecificationList;
	public List<DeliveryEvent> deliveryEventList;
	public List<DeliveryMethod> deliveryMethodList;
	public List<Demand> demandList;
	public List<Dentist> dentistList;
	public List<DepartAction> departActionList;
	public List<DepartmentStore> departmentStoreList;
	public List<DepositAccount> depositAccountList;
	public List<Dermatology> dermatologyList;
	public List<DiagnosticLab> diagnosticLabList;
	public List<DiagnosticProcedure> diagnosticProcedureList;
	public List<Diet> dietList;
	public List<DietNutrition> dietNutritionList;
	public List<DietarySupplement> dietarySupplementList;
	public List<DigitalDocument> digitalDocumentList;
	public List<DigitalDocumentPermission> digitalDocumentPermissionList;
	public List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList;
	public List<DisagreeAction> disagreeActionList;
	public List<DiscoverAction> discoverActionList;
	public List<DiscussionForumPosting> discussionForumPostingList;
	public List<DislikeAction> dislikeActionList;
	public List<Distance> distanceList;
	public List<Distillery> distilleryList;
	public List<DonateAction> donateActionList;
	public List<DoseSchedule> doseScheduleList;
	public List<DownloadAction> downloadActionList;
	public List<DrawAction> drawActionList;
	public List<DrinkAction> drinkActionList;
	public List<DriveWheelConfigurationValue> driveWheelConfigurationValueList;
	public List<Drug> drugList;
	public List<DrugClass> drugClassList;
	public List<DrugCost> drugCostList;
	public List<DrugCostCategory> drugCostCategoryList;
	public List<DrugLegalStatus> drugLegalStatusList;
	public List<DrugPregnancyCategory> drugPregnancyCategoryList;
	public List<DrugPrescriptionStatus> drugPrescriptionStatusList;
	public List<DrugStrength> drugStrengthList;
	public List<DryCleaningOrLaundry> dryCleaningOrLaundryList;
	public List<Duration> durationList;
	public List<EatAction> eatActionList;
	public List<EducationEvent> educationEventList;
	public List<EducationalAudience> educationalAudienceList;
	public List<EducationalOrganization> educationalOrganizationList;
	public List<Electrician> electricianList;
	public List<ElectronicsStore> electronicsStoreList;
	public List<ElementarySchool> elementarySchoolList;
	public List<EmailMessage> emailMessageList;
	public List<Embassy> embassyList;
	public List<Emergency> emergencyList;
	public List<EmergencyService> emergencyServiceList;
	public List<EmployeeRole> employeeRoleList;
	public List<EmployerAggregateRating> employerAggregateRatingList;
	public List<EmployerReview> employerReviewList;
	public List<EmploymentAgency> employmentAgencyList;
	public List<EndorseAction> endorseActionList;
	public List<EndorsementRating> endorsementRatingList;
	public List<Energy> energyList;
	public List<EngineSpecification> engineSpecificationList;
	public List<EntertainmentBusiness> entertainmentBusinessList;
	public List<EntryPoint> entryPointList;
	public List<Enumeration> enumerationList;
	public List<Episode> episodeList;
	public List<Event> eventList;
	public List<EventReservation> eventReservationList;
	public List<EventSeries> eventSeriesList;
	public List<EventStatusType> eventStatusTypeList;
	public List<EventVenue> eventVenueList;
	public List<ExchangeRateSpecification> exchangeRateSpecificationList;
	public List<ExerciseAction> exerciseActionList;
	public List<ExerciseGym> exerciseGymList;
	public List<ExercisePlan> exercisePlanList;
	public List<ExhibitionEvent> exhibitionEventList;
	public List<FAQPage> faqPageList;
	public List<FMRadioChannel> fmRadioChannelList;
	public List<FastFoodRestaurant> fastFoodRestaurantList;
	public List<Festival> festivalList;
	public List<FilmAction> filmActionList;
	public List<FinancialProduct> financialProductList;
	public List<FinancialService> financialServiceList;
	public List<FindAction> findActionList;
	public List<FireStation> fireStationList;
	public List<Flight> flightList;
	public List<FlightReservation> flightReservationList;
	public List<Florist> floristList;
	public List<FollowAction> followActionList;
	public List<FoodEstablishment> foodEstablishmentList;
	public List<FoodEstablishmentReservation> foodEstablishmentReservationList;
	public List<FoodEvent> foodEventList;
	public List<FoodService> foodServiceList;
	public List<FurnitureStore> furnitureStoreList;
	public List<Game> gameList;
	public List<GamePlayMode> gamePlayModeList;
	public List<GameServer> gameServerList;
	public List<GameServerStatus> gameServerStatusList;
	public List<GardenStore> gardenStoreList;
	public List<GasStation> gasStationList;
	public List<GatedResidenceCommunity> gatedResidenceCommunityList;
	public List<GenderType> genderTypeList;
	public List<GeneralContractor> generalContractorList;
	public List<GeoCircle> geoCircleList;
	public List<GeoCoordinates> geoCoordinatesList;
	public List<GeoShape> geoShapeList;
	public List<GeospatialGeometry> geospatialGeometryList;
	public List<Geriatric> geriatricList;
	public List<GiveAction> giveActionList;
	public List<GolfCourse> golfCourseList;
	public List<GovernmentBuilding> governmentBuildingList;
	public List<GovernmentOffice> governmentOfficeList;
	public List<GovernmentOrganization> governmentOrganizationList;
	public List<GovernmentPermit> governmentPermitList;
	public List<GovernmentService> governmentServiceList;
	public List<GroceryStore> groceryStoreList;
	public List<Gynecologic> gynecologicList;
	public List<HVACBusiness> hvacBusinessList;
	public List<HairSalon> hairSalonList;
	public List<HardwareStore> hardwareStoreList;
	public List<HealthAndBeautyBusiness> healthAndBeautyBusinessList;
	public List<HealthClub> healthClubList;
	public List<HealthInsurancePlan> healthInsurancePlanList;
	public List<HealthPlanCostSharingSpecification> healthPlanCostSharingSpecificationList;
	public List<HealthPlanFormulary> healthPlanFormularyList;
	public List<HealthPlanNetwork> healthPlanNetworkList;
	public List<HighSchool> highSchoolList;
	public List<HinduTemple> hinduTempleList;
	public List<HobbyShop> hobbyShopList;
	public List<HomeAndConstructionBusiness> homeAndConstructionBusinessList;
	public List<HomeGoodsStore> homeGoodsStoreList;
	public List<Hospital> hospitalList;
	public List<Hostel> hostelList;
	public List<Hotel> hotelList;
	public List<HotelRoom> hotelRoomList;
	public List<House> houseList;
	public List<HousePainter> housePainterList;
	public List<HowTo> howToList;
	public List<HowToDirection> howToDirectionList;
	public List<HowToItem> howToItemList;
	public List<HowToSection> howToSectionList;
	public List<HowToStep> howToStepList;
	public List<HowToSupply> howToSupplyList;
	public List<HowToTip> howToTipList;
	public List<HowToTool> howToToolList;
	public List<IceCreamShop> iceCreamShopList;
	public List<IgnoreAction> ignoreActionList;
	public List<ImageGallery> imageGalleryList;
	public List<ImageObject> imageObjectList;
	public List<ImagingTest> imagingTestList;
	public List<IndividualProduct> individualProductList;
	public List<InfectiousAgentClass> infectiousAgentClassList;
	public List<InfectiousDisease> infectiousDiseaseList;
	public List<InformAction> informActionList;
	public List<InsertAction> insertActionList;
	public List<InstallAction> installActionList;
	public List<InsuranceAgency> insuranceAgencyList;
	public List<Intangible> intangibleList;
	public List<InteractAction> interactActionList;
	public List<InteractionCounter> interactionCounterList;
	public List<InternetCafe> internetCafeList;
	public List<InvestmentFund> investmentFundList;
	public List<InvestmentOrDeposit> investmentOrDepositList;
	public List<InviteAction> inviteActionList;
	public List<Invoice> invoiceList;
	public List<ItemAvailability> itemAvailabilityList;
	public List<ItemList> itemListList;
	public List<ItemListOrderType> itemListOrderTypeList;
	public List<ItemPage> itemPageList;
	public List<JewelryStore> jewelryStoreList;
	public List<JobPosting> jobPostingList;
	public List<JoinAction> joinActionList;
	public List<Joint> jointList;
	public List<LakeBodyOfWater> lakeBodyOfWaterList;
	public List<Landform> landformList;
	public List<LandmarksOrHistoricalBuildings> landmarksOrHistoricalBuildingsList;
	public List<Language> languageList;
	public List<LeaveAction> leaveActionList;
	public List<LegalForceStatus> legalForceStatusList;
	public List<LegalService> legalServiceList;
	public List<LegalValueLevel> legalValueLevelList;
	public List<Legislation> legislationList;
	public List<LegislationObject> legislationObjectList;
	public List<LegislativeBuilding> legislativeBuildingList;
	public List<LendAction> lendActionList;
	public List<Library> libraryList;
	public List<LibrarySystem> librarySystemList;
	public List<LifestyleModification> lifestyleModificationList;
	public List<Ligament> ligamentList;
	public List<LikeAction> likeActionList;
	public List<LinkRole> linkRoleList;
	public List<LiquorStore> liquorStoreList;
	public List<ListItem> listItemList;
	public List<ListenAction> listenActionList;
	public List<LiteraryEvent> literaryEventList;
	public List<LiveBlogPosting> liveBlogPostingList;
	public List<LoanOrCredit> loanOrCreditList;
	public List<LocalBusiness> localBusinessList;
	public List<LocationFeatureSpecification> locationFeatureSpecificationList;
	public List<LockerDelivery> lockerDeliveryList;
	public List<Locksmith> locksmithList;
	public List<LodgingBusiness> lodgingBusinessList;
	public List<LodgingReservation> lodgingReservationList;
	public List<LoseAction> loseActionList;
	public List<LymphaticVessel> lymphaticVesselList;
	public List<Map> mapList;
	public List<MapCategoryType> mapCategoryTypeList;
	public List<MarryAction> marryActionList;
	public List<Mass> massList;
	public List<MaximumDoseSchedule> maximumDoseScheduleList;
	public List<MediaObject> mediaObjectList;
	public List<MediaSubscription> mediaSubscriptionList;
	public List<MedicalAudience> medicalAudienceList;
	public List<MedicalBusiness> medicalBusinessList;
	public List<MedicalCause> medicalCauseList;
	public List<MedicalClinic> medicalClinicList;
	public List<MedicalCode> medicalCodeList;
	public List<MedicalCondition> medicalConditionList;
	public List<MedicalConditionStage> medicalConditionStageList;
	public List<MedicalContraindication> medicalContraindicationList;
	public List<MedicalDevice> medicalDeviceList;
	public List<MedicalDevicePurpose> medicalDevicePurposeList;
	public List<MedicalEntity> medicalEntityList;
	public List<MedicalEnumeration> medicalEnumerationList;
	public List<MedicalEvidenceLevel> medicalEvidenceLevelList;
	public List<MedicalGuideline> medicalGuidelineList;
	public List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList;
	public List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList;
	public List<MedicalImagingTechnique> medicalImagingTechniqueList;
	public List<MedicalIndication> medicalIndicationList;
	public List<MedicalIntangible> medicalIntangibleList;
	public List<MedicalObservationalStudy> medicalObservationalStudyList;
	public List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList;
	public List<MedicalOrganization> medicalOrganizationList;
	public List<MedicalProcedure> medicalProcedureList;
	public List<MedicalProcedureType> medicalProcedureTypeList;
	public List<MedicalRiskCalculator> medicalRiskCalculatorList;
	public List<MedicalRiskEstimator> medicalRiskEstimatorList;
	public List<MedicalRiskFactor> medicalRiskFactorList;
	public List<MedicalRiskScore> medicalRiskScoreList;
	public List<MedicalScholarlyArticle> medicalScholarlyArticleList;
	public List<MedicalSign> medicalSignList;
	public List<MedicalSignOrSymptom> medicalSignOrSymptomList;
	public List<MedicalSpecialty> medicalSpecialtyList;
	public List<MedicalStudy> medicalStudyList;
	public List<MedicalStudyStatus> medicalStudyStatusList;
	public List<MedicalSymptom> medicalSymptomList;
	public List<MedicalTest> medicalTestList;
	public List<MedicalTestPanel> medicalTestPanelList;
	public List<MedicalTherapy> medicalTherapyList;
	public List<MedicalTrial> medicalTrialList;
	public List<MedicalTrialDesign> medicalTrialDesignList;
	public List<MedicalWebPage> medicalWebPageList;
	public List<MedicineSystem> medicineSystemList;
	public List<MeetingRoom> meetingRoomList;
	public List<MensClothingStore> mensClothingStoreList;
	public List<Menu> menuList;
	public List<MenuItem> menuItemList;
	public List<MenuSection> menuSectionList;
	public List<Message> messageList;
	public List<MiddleSchool> middleSchoolList;
	public List<Midwifery> midwiferyList;
	public List<MobileApplication> mobileApplicationList;
	public List<MobilePhoneStore> mobilePhoneStoreList;
	public List<MonetaryAmount> monetaryAmountList;
	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;
	public List<MoneyTransfer> moneyTransferList;
	public List<MortgageLoan> mortgageLoanList;
	public List<Mosque> mosqueList;
	public List<Motel> motelList;
	public List<Motorcycle> motorcycleList;
	public List<MotorcycleDealer> motorcycleDealerList;
	public List<MotorcycleRepair> motorcycleRepairList;
	public List<MotorizedBicycle> motorizedBicycleList;
	public List<Mountain> mountainList;
	public List<MoveAction> moveActionList;
	public List<Movie> movieList;
	public List<MovieClip> movieClipList;
	public List<MovieRentalStore> movieRentalStoreList;
	public List<MovieSeries> movieSeriesList;
	public List<MovieTheater> movieTheaterList;
	public List<MovingCompany> movingCompanyList;
	public List<Muscle> muscleList;
	public List<Museum> museumList;
	public List<MusicAlbum> musicAlbumList;
	public List<MusicAlbumProductionType> musicAlbumProductionTypeList;
	public List<MusicAlbumReleaseType> musicAlbumReleaseTypeList;
	public List<MusicComposition> musicCompositionList;
	public List<MusicEvent> musicEventList;
	public List<MusicGroup> musicGroupList;
	public List<MusicPlaylist> musicPlaylistList;
	public List<MusicRecording> musicRecordingList;
	public List<MusicRelease> musicReleaseList;
	public List<MusicReleaseFormatType> musicReleaseFormatTypeList;
	public List<MusicStore> musicStoreList;
	public List<MusicVenue> musicVenueList;
	public List<MusicVideoObject> musicVideoObjectList;
	public List<NGO> ngoList;
	public List<NailSalon> nailSalonList;
	public List<Nerve> nerveList;
	public List<NewsArticle> newsArticleList;
	public List<NewsMediaOrganization> newsMediaOrganizationList;
	public List<Newspaper> newspaperList;
	public List<NightClub> nightClubList;
	public List<Notary> notaryList;
	public List<NoteDigitalDocument> noteDigitalDocumentList;
	public List<Nursing> nursingList;
	public List<NutritionInformation> nutritionInformationList;
	public List<Obstetric> obstetricList;
	public List<Occupation> occupationList;
	public List<OccupationalTherapy> occupationalTherapyList;
	public List<OceanBodyOfWater> oceanBodyOfWaterList;
	public List<Offer> offerList;
	public List<OfferCatalog> offerCatalogList;
	public List<OfferItemCondition> offerItemConditionList;
	public List<OfficeEquipmentStore> officeEquipmentStoreList;
	public List<OnDemandEvent> onDemandEventList;
	public List<Oncologic> oncologicList;
	public List<OpeningHoursSpecification> openingHoursSpecificationList;
	public List<OpinionNewsArticle> opinionNewsArticleList;
	public List<Optician> opticianList;
	public List<Optometric> optometricList;
	public List<Order> orderList;
	public List<OrderAction> orderActionList;
	public List<OrderItem> orderItemList;
	public List<OrderStatus> orderStatusList;
	public List<Organization> organizationList;
	public List<OrganizationRole> organizationRoleList;
	public List<OrganizeAction> organizeActionList;
	public List<Otolaryngologic> otolaryngologicList;
	public List<OutletStore> outletStoreList;
	public List<OwnershipInfo> ownershipInfoList;
	public List<PaintAction> paintActionList;
	public List<Painting> paintingList;
	public List<PalliativeProcedure> palliativeProcedureList;
	public List<ParcelDelivery> parcelDeliveryList;
	public List<ParcelService> parcelServiceList;
	public List<ParentAudience> parentAudienceList;
	public List<Park> parkList;
	public List<ParkingFacility> parkingFacilityList;
	public List<PathologyTest> pathologyTestList;
	public List<Patient> patientList;
	public List<PawnShop> pawnShopList;
	public List<PayAction> payActionList;
	public List<PaymentCard> paymentCardList;
	public List<PaymentChargeSpecification> paymentChargeSpecificationList;
	public List<PaymentMethod> paymentMethodList;
	public List<PaymentService> paymentServiceList;
	public List<PaymentStatusType> paymentStatusTypeList;
	public List<Pediatric> pediatricList;
	public List<PeopleAudience> peopleAudienceList;
	public List<PerformAction> performActionList;
	public List<PerformanceRole> performanceRoleList;
	public List<PerformingArtsTheater> performingArtsTheaterList;
	public List<PerformingGroup> performingGroupList;
	public List<Periodical> periodicalList;
	public List<Permit> permitList;
	public List<Person> personList;
	public List<PetStore> petStoreList;
	public List<Pharmacy> pharmacyList;
	public List<Photograph> photographList;
	public List<PhotographAction> photographActionList;
	public List<PhysicalActivity> physicalActivityList;
	public List<PhysicalActivityCategory> physicalActivityCategoryList;
	public List<PhysicalExam> physicalExamList;
	public List<PhysicalTherapy> physicalTherapyList;
	public List<Physician> physicianList;
	public List<Physiotherapy> physiotherapyList;
	public List<Place> placeList;
	public List<PlaceOfWorship> placeOfWorshipList;
	public List<PlanAction> planActionList;
	public List<PlasticSurgery> plasticSurgeryList;
	public List<PlayAction> playActionList;
	public List<Playground> playgroundList;
	public List<Plumber> plumberList;
	public List<Podiatric> podiatricList;
	public List<PoliceStation> policeStationList;
	public List<Pond> pondList;
	public List<PostOffice> postOfficeList;
	public List<PostalAddress> postalAddressList;
	public List<PreOrderAction> preOrderActionList;
	public List<PrependAction> prependActionList;
	public List<Preschool> preschoolList;
	public List<PresentationDigitalDocument> presentationDigitalDocumentList;
	public List<PreventionIndication> preventionIndicationList;
	public List<PriceSpecification> priceSpecificationList;
	public List<PrimaryCare> primaryCareList;
	public List<Product> productList;
	public List<ProductModel> productModelList;
	public List<ProfessionalService> professionalServiceList;
	public List<ProfilePage> profilePageList;
	public List<ProgramMembership> programMembershipList;
	public List<Property> propertyList;
	public List<PropertyValue> propertyValueList;
	public List<PropertyValueSpecification> propertyValueSpecificationList;
	public List<Psychiatric> psychiatricList;
	public List<PsychologicalTreatment> psychologicalTreatmentList;
	public List<PublicHealth> publicHealthList;
	public List<PublicSwimmingPool> publicSwimmingPoolList;
	public List<PublicToilet> publicToiletList;
	public List<PublicationEvent> publicationEventList;
	public List<PublicationIssue> publicationIssueList;
	public List<PublicationVolume> publicationVolumeList;
	public List<QAPage> qaPageList;
	public List<QualitativeValue> qualitativeValueList;
	public List<QuantitativeValue> quantitativeValueList;
	public List<QuantitativeValueDistribution> quantitativeValueDistributionList;
	public List<Quantity> quantityList;
	public List<Question> questionList;
	public List<Quotation> quotationList;
	public List<QuoteAction> quoteActionList;
	public List<RVPark> rvParkList;
	public List<RadiationTherapy> radiationTherapyList;
	public List<RadioChannel> radioChannelList;
	public List<RadioClip> radioClipList;
	public List<RadioEpisode> radioEpisodeList;
	public List<RadioSeason> radioSeasonList;
	public List<RadioSeries> radioSeriesList;
	public List<RadioStation> radioStationList;
	public List<Rating> ratingList;
	public List<ReactAction> reactActionList;
	public List<ReadAction> readActionList;
	public List<RealEstateAgent> realEstateAgentList;
	public List<ReceiveAction> receiveActionList;
	public List<Recipe> recipeList;
	public List<RecommendedDoseSchedule> recommendedDoseScheduleList;
	public List<RecyclingCenter> recyclingCenterList;
	public List<RegisterAction> registerActionList;
	public List<RejectAction> rejectActionList;
	public List<RentAction> rentActionList;
	public List<RentalCarReservation> rentalCarReservationList;
	public List<RepaymentSpecification> repaymentSpecificationList;
	public List<ReplaceAction> replaceActionList;
	public List<ReplyAction> replyActionList;
	public List<Report> reportList;
	public List<ReportageNewsArticle> reportageNewsArticleList;
	public List<ReportedDoseSchedule> reportedDoseScheduleList;
	public List<Reservation> reservationList;
	public List<ReservationPackage> reservationPackageList;
	public List<ReservationStatusType> reservationStatusTypeList;
	public List<ReserveAction> reserveActionList;
	public List<Reservoir> reservoirList;
	public List<Residence> residenceList;
	public List<Resort> resortList;
	public List<RespiratoryTherapy> respiratoryTherapyList;
	public List<Restaurant> restaurantList;
	public List<RestrictedDiet> restrictedDietList;
	public List<ResumeAction> resumeActionList;
	public List<ReturnAction> returnActionList;
	public List<Review> reviewList;
	public List<ReviewAction> reviewActionList;
	public List<ReviewNewsArticle> reviewNewsArticleList;
	public List<RiverBodyOfWater> riverBodyOfWaterList;
	public List<Role> roleList;
	public List<RoofingContractor> roofingContractorList;
	public List<Room> roomList;
	public List<RsvpAction> rsvpActionList;
	public List<RsvpResponseType> rsvpResponseTypeList;
	public List<SaleEvent> saleEventList;
	public List<SatiricalArticle> satiricalArticleList;
	public List<Schedule> scheduleList;
	public List<ScheduleAction> scheduleActionList;
	public List<ScholarlyArticle> scholarlyArticleList;
	public List<School> schoolList;
	public List<ScreeningEvent> screeningEventList;
	public List<Sculpture> sculptureList;
	public List<SeaBodyOfWater> seaBodyOfWaterList;
	public List<SearchAction> searchActionList;
	public List<SearchResultsPage> searchResultsPageList;
	public List<Seat> seatList;
	public List<SelfStorage> selfStorageList;
	public List<SellAction> sellActionList;
	public List<SendAction> sendActionList;
	public List<Series> seriesList;
	public List<Service> serviceList;
	public List<ServiceChannel> serviceChannelList;
	public List<ShareAction> shareActionList;
	public List<ShoeStore> shoeStoreList;
	public List<ShoppingCenter> shoppingCenterList;
	public List<SingleFamilyResidence> singleFamilyResidenceList;
	public List<SiteNavigationElement> siteNavigationElementList;
	public List<SkiResort> skiResortList;
	public List<SocialEvent> socialEventList;
	public List<SocialMediaPosting> socialMediaPostingList;
	public List<SoftwareApplication> softwareApplicationList;
	public List<SoftwareSourceCode> softwareSourceCodeList;
	public List<SomeProducts> someProductsList;
	public List<SpeakableSpecification> speakableSpecificationList;
	public List<Specialty> specialtyList;
	public List<SportingGoodsStore> sportingGoodsStoreList;
	public List<SportsActivityLocation> sportsActivityLocationList;
	public List<SportsClub> sportsClubList;
	public List<SportsEvent> sportsEventList;
	public List<SportsOrganization> sportsOrganizationList;
	public List<SportsTeam> sportsTeamList;
	public List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList;
	public List<StadiumOrArena> stadiumOrArenaList;
	public List<State> stateList;
	public List<SteeringPositionValue> steeringPositionValueList;
	public List<Store> storeList;
	public List<StructuredValue> structuredValueList;
	public List<SubscribeAction> subscribeActionList;
	public List<Substance> substanceList;
	public List<SubwayStation> subwayStationList;
	public List<Suite> suiteList;
	public List<SuperficialAnatomy> superficialAnatomyList;
	public List<SurgicalProcedure> surgicalProcedureList;
	public List<SuspendAction> suspendActionList;
	public List<Synagogue> synagogueList;
	public List<TVClip> tvClipList;
	public List<TVEpisode> tvEpisodeList;
	public List<TVSeason> tvSeasonList;
	public List<TVSeries> tvSeriesList;
	public List<Table> tableList;
	public List<TakeAction> takeActionList;
	public List<TattooParlor> tattooParlorList;
	public List<TaxiReservation> taxiReservationList;
	public List<TaxiService> taxiServiceList;
	public List<TaxiStand> taxiStandList;
	public List<TechArticle> techArticleList;
	public List<TelevisionChannel> televisionChannelList;
	public List<TelevisionStation> televisionStationList;
	public List<TennisComplex> tennisComplexList;
	public List<TextDigitalDocument> textDigitalDocumentList;
	public List<TheaterEvent> theaterEventList;
	public List<TheaterGroup> theaterGroupList;
	public List<TherapeuticProcedure> therapeuticProcedureList;
	public List<Thesis> thesisList;
	public List<Thing> thingList;
	public List<Ticket> ticketList;
	public List<TieAction> tieActionList;
	public List<TipAction> tipActionList;
	public List<TireShop> tireShopList;
	public List<TouristAttraction> touristAttractionList;
	public List<TouristDestination> touristDestinationList;
	public List<TouristInformationCenter> touristInformationCenterList;
	public List<TouristTrip> touristTripList;
	public List<ToyStore> toyStoreList;
	public List<TrackAction> trackActionList;
	public List<TradeAction> tradeActionList;
	public List<TrainReservation> trainReservationList;
	public List<TrainStation> trainStationList;
	public List<TrainTrip> trainTripList;
	public List<TransferAction> transferActionList;
	public List<TravelAction> travelActionList;
	public List<TravelAgency> travelAgencyList;
	public List<TreatmentIndication> treatmentIndicationList;
	public List<Trip> tripList;
	public List<TypeAndQuantityNode> typeAndQuantityNodeList;
	public List<UnRegisterAction> unRegisterActionList;
	public List<UnitPriceSpecification> unitPriceSpecificationList;
	public List<UpdateAction> updateActionList;
	public List<UseAction> useActionList;
	public List<UserReview> userReviewList;
	public List<Vehicle> vehicleList;
	public List<Vein> veinList;
	public List<Vessel> vesselList;
	public List<VeterinaryCare> veterinaryCareList;
	public List<VideoGallery> videoGalleryList;
	public List<VideoGame> videoGameList;
	public List<VideoGameClip> videoGameClipList;
	public List<VideoGameSeries> videoGameSeriesList;
	public List<VideoObject> videoObjectList;
	public List<ViewAction> viewActionList;
	public List<VisualArtsEvent> visualArtsEventList;
	public List<VisualArtwork> visualArtworkList;
	public List<VitalSign> vitalSignList;
	public List<Volcano> volcanoList;
	public List<VoteAction> voteActionList;
	public List<WPAdBlock> wpAdBlockList;
	public List<WPFooter> wpFooterList;
	public List<WPHeader> wpHeaderList;
	public List<WPSideBar> wpSideBarList;
	public List<WantAction> wantActionList;
	public List<WarrantyPromise> warrantyPromiseList;
	public List<WarrantyScope> warrantyScopeList;
	public List<WatchAction> watchActionList;
	public List<Waterfall> waterfallList;
	public List<WearAction> wearActionList;
	public List<WebAPI> webAPIList;
	public List<WebApplication> webApplicationList;
	public List<WebPage> webPageList;
	public List<WebPageElement> webPageElementList;
	public List<WebSite> webSiteList;
	public List<WholesaleStore> wholesaleStoreList;
	public List<WinAction> winActionList;
	public List<Winery> wineryList;
	public List<WorkersUnion> workersUnionList;
	public List<WriteAction> writeActionList;
	public List<Zoo> zooList;

	public ITEM_REVIEWED() {
	}

	public ITEM_REVIEWED(String string) {
		this(new THING(string));
	}

	public String getString() {
		if(thingList == null || thingList.size() == 0 || thingList.get(0) == null) {
			return null;
		} else {
			Name name = thingList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(thingList == null) {
			thingList = new ArrayList<Thing>();
		}
		if(thingList.size() == 0) {
			thingList.add(new THING(string));
		} else {
			thingList.set(0, new THING(string));
		}
	}

	public ITEM_REVIEWED(AMRadioChannel amRadioChannel) {
		amRadioChannelList = new ArrayList<AMRadioChannel>();
		amRadioChannelList.add(amRadioChannel);
	}

	@Override
	public AMRadioChannel getAMRadioChannel() {
		if(amRadioChannelList != null && amRadioChannelList.size() > 0) {
			return amRadioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAMRadioChannel(AMRadioChannel amRadioChannel) {
		if(amRadioChannelList == null) {
			amRadioChannelList = new ArrayList<>();
		}
		if(amRadioChannelList.size() == 0) {
			amRadioChannelList.add(amRadioChannel);
		} else {
			amRadioChannelList.set(0, amRadioChannel);
		}
	}

	@Override
	public List<AMRadioChannel> getAMRadioChannelList() {
		return amRadioChannelList;
	}

	@Override
	public void setAMRadioChannelList(List<AMRadioChannel> amRadioChannelList) {
		this.amRadioChannelList = amRadioChannelList;
	}

	@Override
	public boolean hasAMRadioChannel() {
		return amRadioChannelList != null && amRadioChannelList.size() > 0 && amRadioChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(APIReference apiReference) {
		apiReferenceList = new ArrayList<APIReference>();
		apiReferenceList.add(apiReference);
	}

	@Override
	public APIReference getAPIReference() {
		if(apiReferenceList != null && apiReferenceList.size() > 0) {
			return apiReferenceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAPIReference(APIReference apiReference) {
		if(apiReferenceList == null) {
			apiReferenceList = new ArrayList<>();
		}
		if(apiReferenceList.size() == 0) {
			apiReferenceList.add(apiReference);
		} else {
			apiReferenceList.set(0, apiReference);
		}
	}

	@Override
	public List<APIReference> getAPIReferenceList() {
		return apiReferenceList;
	}

	@Override
	public void setAPIReferenceList(List<APIReference> apiReferenceList) {
		this.apiReferenceList = apiReferenceList;
	}

	@Override
	public boolean hasAPIReference() {
		return apiReferenceList != null && apiReferenceList.size() > 0 && apiReferenceList.get(0) != null;
	}

	public ITEM_REVIEWED(AboutPage aboutPage) {
		aboutPageList = new ArrayList<AboutPage>();
		aboutPageList.add(aboutPage);
	}

	@Override
	public AboutPage getAboutPage() {
		if(aboutPageList != null && aboutPageList.size() > 0) {
			return aboutPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAboutPage(AboutPage aboutPage) {
		if(aboutPageList == null) {
			aboutPageList = new ArrayList<>();
		}
		if(aboutPageList.size() == 0) {
			aboutPageList.add(aboutPage);
		} else {
			aboutPageList.set(0, aboutPage);
		}
	}

	@Override
	public List<AboutPage> getAboutPageList() {
		return aboutPageList;
	}

	@Override
	public void setAboutPageList(List<AboutPage> aboutPageList) {
		this.aboutPageList = aboutPageList;
	}

	@Override
	public boolean hasAboutPage() {
		return aboutPageList != null && aboutPageList.size() > 0 && aboutPageList.get(0) != null;
	}

	public ITEM_REVIEWED(AcceptAction acceptAction) {
		acceptActionList = new ArrayList<AcceptAction>();
		acceptActionList.add(acceptAction);
	}

	@Override
	public AcceptAction getAcceptAction() {
		if(acceptActionList != null && acceptActionList.size() > 0) {
			return acceptActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAcceptAction(AcceptAction acceptAction) {
		if(acceptActionList == null) {
			acceptActionList = new ArrayList<>();
		}
		if(acceptActionList.size() == 0) {
			acceptActionList.add(acceptAction);
		} else {
			acceptActionList.set(0, acceptAction);
		}
	}

	@Override
	public List<AcceptAction> getAcceptActionList() {
		return acceptActionList;
	}

	@Override
	public void setAcceptActionList(List<AcceptAction> acceptActionList) {
		this.acceptActionList = acceptActionList;
	}

	@Override
	public boolean hasAcceptAction() {
		return acceptActionList != null && acceptActionList.size() > 0 && acceptActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Accommodation accommodation) {
		accommodationList = new ArrayList<Accommodation>();
		accommodationList.add(accommodation);
	}

	@Override
	public Accommodation getAccommodation() {
		if(accommodationList != null && accommodationList.size() > 0) {
			return accommodationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAccommodation(Accommodation accommodation) {
		if(accommodationList == null) {
			accommodationList = new ArrayList<>();
		}
		if(accommodationList.size() == 0) {
			accommodationList.add(accommodation);
		} else {
			accommodationList.set(0, accommodation);
		}
	}

	@Override
	public List<Accommodation> getAccommodationList() {
		return accommodationList;
	}

	@Override
	public void setAccommodationList(List<Accommodation> accommodationList) {
		this.accommodationList = accommodationList;
	}

	@Override
	public boolean hasAccommodation() {
		return accommodationList != null && accommodationList.size() > 0 && accommodationList.get(0) != null;
	}

	public ITEM_REVIEWED(AccountingService accountingService) {
		accountingServiceList = new ArrayList<AccountingService>();
		accountingServiceList.add(accountingService);
	}

	@Override
	public AccountingService getAccountingService() {
		if(accountingServiceList != null && accountingServiceList.size() > 0) {
			return accountingServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAccountingService(AccountingService accountingService) {
		if(accountingServiceList == null) {
			accountingServiceList = new ArrayList<>();
		}
		if(accountingServiceList.size() == 0) {
			accountingServiceList.add(accountingService);
		} else {
			accountingServiceList.set(0, accountingService);
		}
	}

	@Override
	public List<AccountingService> getAccountingServiceList() {
		return accountingServiceList;
	}

	@Override
	public void setAccountingServiceList(List<AccountingService> accountingServiceList) {
		this.accountingServiceList = accountingServiceList;
	}

	@Override
	public boolean hasAccountingService() {
		return accountingServiceList != null && accountingServiceList.size() > 0 && accountingServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(AchieveAction achieveAction) {
		achieveActionList = new ArrayList<AchieveAction>();
		achieveActionList.add(achieveAction);
	}

	@Override
	public AchieveAction getAchieveAction() {
		if(achieveActionList != null && achieveActionList.size() > 0) {
			return achieveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAchieveAction(AchieveAction achieveAction) {
		if(achieveActionList == null) {
			achieveActionList = new ArrayList<>();
		}
		if(achieveActionList.size() == 0) {
			achieveActionList.add(achieveAction);
		} else {
			achieveActionList.set(0, achieveAction);
		}
	}

	@Override
	public List<AchieveAction> getAchieveActionList() {
		return achieveActionList;
	}

	@Override
	public void setAchieveActionList(List<AchieveAction> achieveActionList) {
		this.achieveActionList = achieveActionList;
	}

	@Override
	public boolean hasAchieveAction() {
		return achieveActionList != null && achieveActionList.size() > 0 && achieveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Action action) {
		actionList = new ArrayList<Action>();
		actionList.add(action);
	}

	@Override
	public Action getAction() {
		if(actionList != null && actionList.size() > 0) {
			return actionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAction(Action action) {
		if(actionList == null) {
			actionList = new ArrayList<>();
		}
		if(actionList.size() == 0) {
			actionList.add(action);
		} else {
			actionList.set(0, action);
		}
	}

	@Override
	public List<Action> getActionList() {
		return actionList;
	}

	@Override
	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}

	@Override
	public boolean hasAction() {
		return actionList != null && actionList.size() > 0 && actionList.get(0) != null;
	}

	public ITEM_REVIEWED(ActionAccessSpecification actionAccessSpecification) {
		actionAccessSpecificationList = new ArrayList<ActionAccessSpecification>();
		actionAccessSpecificationList.add(actionAccessSpecification);
	}

	@Override
	public ActionAccessSpecification getActionAccessSpecification() {
		if(actionAccessSpecificationList != null && actionAccessSpecificationList.size() > 0) {
			return actionAccessSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActionAccessSpecification(ActionAccessSpecification actionAccessSpecification) {
		if(actionAccessSpecificationList == null) {
			actionAccessSpecificationList = new ArrayList<>();
		}
		if(actionAccessSpecificationList.size() == 0) {
			actionAccessSpecificationList.add(actionAccessSpecification);
		} else {
			actionAccessSpecificationList.set(0, actionAccessSpecification);
		}
	}

	@Override
	public List<ActionAccessSpecification> getActionAccessSpecificationList() {
		return actionAccessSpecificationList;
	}

	@Override
	public void setActionAccessSpecificationList(List<ActionAccessSpecification> actionAccessSpecificationList) {
		this.actionAccessSpecificationList = actionAccessSpecificationList;
	}

	@Override
	public boolean hasActionAccessSpecification() {
		return actionAccessSpecificationList != null && actionAccessSpecificationList.size() > 0 && actionAccessSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(ActionStatusType actionStatusType) {
		actionStatusTypeList = new ArrayList<ActionStatusType>();
		actionStatusTypeList.add(actionStatusType);
	}

	@Override
	public ActionStatusType getActionStatusType() {
		if(actionStatusTypeList != null && actionStatusTypeList.size() > 0) {
			return actionStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActionStatusType(ActionStatusType actionStatusType) {
		if(actionStatusTypeList == null) {
			actionStatusTypeList = new ArrayList<>();
		}
		if(actionStatusTypeList.size() == 0) {
			actionStatusTypeList.add(actionStatusType);
		} else {
			actionStatusTypeList.set(0, actionStatusType);
		}
	}

	@Override
	public List<ActionStatusType> getActionStatusTypeList() {
		return actionStatusTypeList;
	}

	@Override
	public void setActionStatusTypeList(List<ActionStatusType> actionStatusTypeList) {
		this.actionStatusTypeList = actionStatusTypeList;
	}

	@Override
	public boolean hasActionStatusType() {
		return actionStatusTypeList != null && actionStatusTypeList.size() > 0 && actionStatusTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(ActivateAction activateAction) {
		activateActionList = new ArrayList<ActivateAction>();
		activateActionList.add(activateAction);
	}

	@Override
	public ActivateAction getActivateAction() {
		if(activateActionList != null && activateActionList.size() > 0) {
			return activateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActivateAction(ActivateAction activateAction) {
		if(activateActionList == null) {
			activateActionList = new ArrayList<>();
		}
		if(activateActionList.size() == 0) {
			activateActionList.add(activateAction);
		} else {
			activateActionList.set(0, activateAction);
		}
	}

	@Override
	public List<ActivateAction> getActivateActionList() {
		return activateActionList;
	}

	@Override
	public void setActivateActionList(List<ActivateAction> activateActionList) {
		this.activateActionList = activateActionList;
	}

	@Override
	public boolean hasActivateAction() {
		return activateActionList != null && activateActionList.size() > 0 && activateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AddAction addAction) {
		addActionList = new ArrayList<AddAction>();
		addActionList.add(addAction);
	}

	@Override
	public AddAction getAddAction() {
		if(addActionList != null && addActionList.size() > 0) {
			return addActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAddAction(AddAction addAction) {
		if(addActionList == null) {
			addActionList = new ArrayList<>();
		}
		if(addActionList.size() == 0) {
			addActionList.add(addAction);
		} else {
			addActionList.set(0, addAction);
		}
	}

	@Override
	public List<AddAction> getAddActionList() {
		return addActionList;
	}

	@Override
	public void setAddActionList(List<AddAction> addActionList) {
		this.addActionList = addActionList;
	}

	@Override
	public boolean hasAddAction() {
		return addActionList != null && addActionList.size() > 0 && addActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AdministrativeArea administrativeArea) {
		administrativeAreaList = new ArrayList<AdministrativeArea>();
		administrativeAreaList.add(administrativeArea);
	}

	@Override
	public AdministrativeArea getAdministrativeArea() {
		if(administrativeAreaList != null && administrativeAreaList.size() > 0) {
			return administrativeAreaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdministrativeArea(AdministrativeArea administrativeArea) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(administrativeArea);
		} else {
			administrativeAreaList.set(0, administrativeArea);
		}
	}

	@Override
	public List<AdministrativeArea> getAdministrativeAreaList() {
		return administrativeAreaList;
	}

	@Override
	public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList) {
		this.administrativeAreaList = administrativeAreaList;
	}

	@Override
	public boolean hasAdministrativeArea() {
		return administrativeAreaList != null && administrativeAreaList.size() > 0 && administrativeAreaList.get(0) != null;
	}

	public ITEM_REVIEWED(AdultEntertainment adultEntertainment) {
		adultEntertainmentList = new ArrayList<AdultEntertainment>();
		adultEntertainmentList.add(adultEntertainment);
	}

	@Override
	public AdultEntertainment getAdultEntertainment() {
		if(adultEntertainmentList != null && adultEntertainmentList.size() > 0) {
			return adultEntertainmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdultEntertainment(AdultEntertainment adultEntertainment) {
		if(adultEntertainmentList == null) {
			adultEntertainmentList = new ArrayList<>();
		}
		if(adultEntertainmentList.size() == 0) {
			adultEntertainmentList.add(adultEntertainment);
		} else {
			adultEntertainmentList.set(0, adultEntertainment);
		}
	}

	@Override
	public List<AdultEntertainment> getAdultEntertainmentList() {
		return adultEntertainmentList;
	}

	@Override
	public void setAdultEntertainmentList(List<AdultEntertainment> adultEntertainmentList) {
		this.adultEntertainmentList = adultEntertainmentList;
	}

	@Override
	public boolean hasAdultEntertainment() {
		return adultEntertainmentList != null && adultEntertainmentList.size() > 0 && adultEntertainmentList.get(0) != null;
	}

	public ITEM_REVIEWED(AdvertiserContentArticle advertiserContentArticle) {
		advertiserContentArticleList = new ArrayList<AdvertiserContentArticle>();
		advertiserContentArticleList.add(advertiserContentArticle);
	}

	@Override
	public AdvertiserContentArticle getAdvertiserContentArticle() {
		if(advertiserContentArticleList != null && advertiserContentArticleList.size() > 0) {
			return advertiserContentArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdvertiserContentArticle(AdvertiserContentArticle advertiserContentArticle) {
		if(advertiserContentArticleList == null) {
			advertiserContentArticleList = new ArrayList<>();
		}
		if(advertiserContentArticleList.size() == 0) {
			advertiserContentArticleList.add(advertiserContentArticle);
		} else {
			advertiserContentArticleList.set(0, advertiserContentArticle);
		}
	}

	@Override
	public List<AdvertiserContentArticle> getAdvertiserContentArticleList() {
		return advertiserContentArticleList;
	}

	@Override
	public void setAdvertiserContentArticleList(List<AdvertiserContentArticle> advertiserContentArticleList) {
		this.advertiserContentArticleList = advertiserContentArticleList;
	}

	@Override
	public boolean hasAdvertiserContentArticle() {
		return advertiserContentArticleList != null && advertiserContentArticleList.size() > 0 && advertiserContentArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(AggregateOffer aggregateOffer) {
		aggregateOfferList = new ArrayList<AggregateOffer>();
		aggregateOfferList.add(aggregateOffer);
	}

	@Override
	public AggregateOffer getAggregateOffer() {
		if(aggregateOfferList != null && aggregateOfferList.size() > 0) {
			return aggregateOfferList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAggregateOffer(AggregateOffer aggregateOffer) {
		if(aggregateOfferList == null) {
			aggregateOfferList = new ArrayList<>();
		}
		if(aggregateOfferList.size() == 0) {
			aggregateOfferList.add(aggregateOffer);
		} else {
			aggregateOfferList.set(0, aggregateOffer);
		}
	}

	@Override
	public List<AggregateOffer> getAggregateOfferList() {
		return aggregateOfferList;
	}

	@Override
	public void setAggregateOfferList(List<AggregateOffer> aggregateOfferList) {
		this.aggregateOfferList = aggregateOfferList;
	}

	@Override
	public boolean hasAggregateOffer() {
		return aggregateOfferList != null && aggregateOfferList.size() > 0 && aggregateOfferList.get(0) != null;
	}

	public ITEM_REVIEWED(AggregateRating aggregateRating) {
		aggregateRatingList = new ArrayList<AggregateRating>();
		aggregateRatingList.add(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		if(aggregateRatingList != null && aggregateRatingList.size() > 0) {
			return aggregateRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		if(aggregateRatingList == null) {
			aggregateRatingList = new ArrayList<>();
		}
		if(aggregateRatingList.size() == 0) {
			aggregateRatingList.add(aggregateRating);
		} else {
			aggregateRatingList.set(0, aggregateRating);
		}
	}

	@Override
	public List<AggregateRating> getAggregateRatingList() {
		return aggregateRatingList;
	}

	@Override
	public void setAggregateRatingList(List<AggregateRating> aggregateRatingList) {
		this.aggregateRatingList = aggregateRatingList;
	}

	@Override
	public boolean hasAggregateRating() {
		return aggregateRatingList != null && aggregateRatingList.size() > 0 && aggregateRatingList.get(0) != null;
	}

	public ITEM_REVIEWED(AgreeAction agreeAction) {
		agreeActionList = new ArrayList<AgreeAction>();
		agreeActionList.add(agreeAction);
	}

	@Override
	public AgreeAction getAgreeAction() {
		if(agreeActionList != null && agreeActionList.size() > 0) {
			return agreeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAgreeAction(AgreeAction agreeAction) {
		if(agreeActionList == null) {
			agreeActionList = new ArrayList<>();
		}
		if(agreeActionList.size() == 0) {
			agreeActionList.add(agreeAction);
		} else {
			agreeActionList.set(0, agreeAction);
		}
	}

	@Override
	public List<AgreeAction> getAgreeActionList() {
		return agreeActionList;
	}

	@Override
	public void setAgreeActionList(List<AgreeAction> agreeActionList) {
		this.agreeActionList = agreeActionList;
	}

	@Override
	public boolean hasAgreeAction() {
		return agreeActionList != null && agreeActionList.size() > 0 && agreeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Airline airline) {
		airlineList = new ArrayList<Airline>();
		airlineList.add(airline);
	}

	@Override
	public Airline getAirline() {
		if(airlineList != null && airlineList.size() > 0) {
			return airlineList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAirline(Airline airline) {
		if(airlineList == null) {
			airlineList = new ArrayList<>();
		}
		if(airlineList.size() == 0) {
			airlineList.add(airline);
		} else {
			airlineList.set(0, airline);
		}
	}

	@Override
	public List<Airline> getAirlineList() {
		return airlineList;
	}

	@Override
	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}

	@Override
	public boolean hasAirline() {
		return airlineList != null && airlineList.size() > 0 && airlineList.get(0) != null;
	}

	public ITEM_REVIEWED(Airport airport) {
		airportList = new ArrayList<Airport>();
		airportList.add(airport);
	}

	@Override
	public Airport getAirport() {
		if(airportList != null && airportList.size() > 0) {
			return airportList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAirport(Airport airport) {
		if(airportList == null) {
			airportList = new ArrayList<>();
		}
		if(airportList.size() == 0) {
			airportList.add(airport);
		} else {
			airportList.set(0, airport);
		}
	}

	@Override
	public List<Airport> getAirportList() {
		return airportList;
	}

	@Override
	public void setAirportList(List<Airport> airportList) {
		this.airportList = airportList;
	}

	@Override
	public boolean hasAirport() {
		return airportList != null && airportList.size() > 0 && airportList.get(0) != null;
	}

	public ITEM_REVIEWED(AlignmentObject alignmentObject) {
		alignmentObjectList = new ArrayList<AlignmentObject>();
		alignmentObjectList.add(alignmentObject);
	}

	@Override
	public AlignmentObject getAlignmentObject() {
		if(alignmentObjectList != null && alignmentObjectList.size() > 0) {
			return alignmentObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAlignmentObject(AlignmentObject alignmentObject) {
		if(alignmentObjectList == null) {
			alignmentObjectList = new ArrayList<>();
		}
		if(alignmentObjectList.size() == 0) {
			alignmentObjectList.add(alignmentObject);
		} else {
			alignmentObjectList.set(0, alignmentObject);
		}
	}

	@Override
	public List<AlignmentObject> getAlignmentObjectList() {
		return alignmentObjectList;
	}

	@Override
	public void setAlignmentObjectList(List<AlignmentObject> alignmentObjectList) {
		this.alignmentObjectList = alignmentObjectList;
	}

	@Override
	public boolean hasAlignmentObject() {
		return alignmentObjectList != null && alignmentObjectList.size() > 0 && alignmentObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(AllocateAction allocateAction) {
		allocateActionList = new ArrayList<AllocateAction>();
		allocateActionList.add(allocateAction);
	}

	@Override
	public AllocateAction getAllocateAction() {
		if(allocateActionList != null && allocateActionList.size() > 0) {
			return allocateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAllocateAction(AllocateAction allocateAction) {
		if(allocateActionList == null) {
			allocateActionList = new ArrayList<>();
		}
		if(allocateActionList.size() == 0) {
			allocateActionList.add(allocateAction);
		} else {
			allocateActionList.set(0, allocateAction);
		}
	}

	@Override
	public List<AllocateAction> getAllocateActionList() {
		return allocateActionList;
	}

	@Override
	public void setAllocateActionList(List<AllocateAction> allocateActionList) {
		this.allocateActionList = allocateActionList;
	}

	@Override
	public boolean hasAllocateAction() {
		return allocateActionList != null && allocateActionList.size() > 0 && allocateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AmusementPark amusementPark) {
		amusementParkList = new ArrayList<AmusementPark>();
		amusementParkList.add(amusementPark);
	}

	@Override
	public AmusementPark getAmusementPark() {
		if(amusementParkList != null && amusementParkList.size() > 0) {
			return amusementParkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAmusementPark(AmusementPark amusementPark) {
		if(amusementParkList == null) {
			amusementParkList = new ArrayList<>();
		}
		if(amusementParkList.size() == 0) {
			amusementParkList.add(amusementPark);
		} else {
			amusementParkList.set(0, amusementPark);
		}
	}

	@Override
	public List<AmusementPark> getAmusementParkList() {
		return amusementParkList;
	}

	@Override
	public void setAmusementParkList(List<AmusementPark> amusementParkList) {
		this.amusementParkList = amusementParkList;
	}

	@Override
	public boolean hasAmusementPark() {
		return amusementParkList != null && amusementParkList.size() > 0 && amusementParkList.get(0) != null;
	}

	public ITEM_REVIEWED(AnalysisNewsArticle analysisNewsArticle) {
		analysisNewsArticleList = new ArrayList<AnalysisNewsArticle>();
		analysisNewsArticleList.add(analysisNewsArticle);
	}

	@Override
	public AnalysisNewsArticle getAnalysisNewsArticle() {
		if(analysisNewsArticleList != null && analysisNewsArticleList.size() > 0) {
			return analysisNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle) {
		if(analysisNewsArticleList == null) {
			analysisNewsArticleList = new ArrayList<>();
		}
		if(analysisNewsArticleList.size() == 0) {
			analysisNewsArticleList.add(analysisNewsArticle);
		} else {
			analysisNewsArticleList.set(0, analysisNewsArticle);
		}
	}

	@Override
	public List<AnalysisNewsArticle> getAnalysisNewsArticleList() {
		return analysisNewsArticleList;
	}

	@Override
	public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList) {
		this.analysisNewsArticleList = analysisNewsArticleList;
	}

	@Override
	public boolean hasAnalysisNewsArticle() {
		return analysisNewsArticleList != null && analysisNewsArticleList.size() > 0 && analysisNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(AnatomicalStructure anatomicalStructure) {
		anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		anatomicalStructureList.add(anatomicalStructure);
	}

	@Override
	public AnatomicalStructure getAnatomicalStructure() {
		if(anatomicalStructureList != null && anatomicalStructureList.size() > 0) {
			return anatomicalStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(anatomicalStructure);
		} else {
			anatomicalStructureList.set(0, anatomicalStructure);
		}
	}

	@Override
	public List<AnatomicalStructure> getAnatomicalStructureList() {
		return anatomicalStructureList;
	}

	@Override
	public void setAnatomicalStructureList(List<AnatomicalStructure> anatomicalStructureList) {
		this.anatomicalStructureList = anatomicalStructureList;
	}

	@Override
	public boolean hasAnatomicalStructure() {
		return anatomicalStructureList != null && anatomicalStructureList.size() > 0 && anatomicalStructureList.get(0) != null;
	}

	public ITEM_REVIEWED(AnatomicalSystem anatomicalSystem) {
		anatomicalSystemList = new ArrayList<AnatomicalSystem>();
		anatomicalSystemList.add(anatomicalSystem);
	}

	@Override
	public AnatomicalSystem getAnatomicalSystem() {
		if(anatomicalSystemList != null && anatomicalSystemList.size() > 0) {
			return anatomicalSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) {
		if(anatomicalSystemList == null) {
			anatomicalSystemList = new ArrayList<>();
		}
		if(anatomicalSystemList.size() == 0) {
			anatomicalSystemList.add(anatomicalSystem);
		} else {
			anatomicalSystemList.set(0, anatomicalSystem);
		}
	}

	@Override
	public List<AnatomicalSystem> getAnatomicalSystemList() {
		return anatomicalSystemList;
	}

	@Override
	public void setAnatomicalSystemList(List<AnatomicalSystem> anatomicalSystemList) {
		this.anatomicalSystemList = anatomicalSystemList;
	}

	@Override
	public boolean hasAnatomicalSystem() {
		return anatomicalSystemList != null && anatomicalSystemList.size() > 0 && anatomicalSystemList.get(0) != null;
	}

	public ITEM_REVIEWED(AnimalShelter animalShelter) {
		animalShelterList = new ArrayList<AnimalShelter>();
		animalShelterList.add(animalShelter);
	}

	@Override
	public AnimalShelter getAnimalShelter() {
		if(animalShelterList != null && animalShelterList.size() > 0) {
			return animalShelterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnimalShelter(AnimalShelter animalShelter) {
		if(animalShelterList == null) {
			animalShelterList = new ArrayList<>();
		}
		if(animalShelterList.size() == 0) {
			animalShelterList.add(animalShelter);
		} else {
			animalShelterList.set(0, animalShelter);
		}
	}

	@Override
	public List<AnimalShelter> getAnimalShelterList() {
		return animalShelterList;
	}

	@Override
	public void setAnimalShelterList(List<AnimalShelter> animalShelterList) {
		this.animalShelterList = animalShelterList;
	}

	@Override
	public boolean hasAnimalShelter() {
		return animalShelterList != null && animalShelterList.size() > 0 && animalShelterList.get(0) != null;
	}

	public ITEM_REVIEWED(Answer answer) {
		answerList = new ArrayList<Answer>();
		answerList.add(answer);
	}

	@Override
	public Answer getAnswer() {
		if(answerList != null && answerList.size() > 0) {
			return answerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnswer(Answer answer) {
		if(answerList == null) {
			answerList = new ArrayList<>();
		}
		if(answerList.size() == 0) {
			answerList.add(answer);
		} else {
			answerList.set(0, answer);
		}
	}

	@Override
	public List<Answer> getAnswerList() {
		return answerList;
	}

	@Override
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}

	@Override
	public boolean hasAnswer() {
		return answerList != null && answerList.size() > 0 && answerList.get(0) != null;
	}

	public ITEM_REVIEWED(Apartment apartment) {
		apartmentList = new ArrayList<Apartment>();
		apartmentList.add(apartment);
	}

	@Override
	public Apartment getApartment() {
		if(apartmentList != null && apartmentList.size() > 0) {
			return apartmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApartment(Apartment apartment) {
		if(apartmentList == null) {
			apartmentList = new ArrayList<>();
		}
		if(apartmentList.size() == 0) {
			apartmentList.add(apartment);
		} else {
			apartmentList.set(0, apartment);
		}
	}

	@Override
	public List<Apartment> getApartmentList() {
		return apartmentList;
	}

	@Override
	public void setApartmentList(List<Apartment> apartmentList) {
		this.apartmentList = apartmentList;
	}

	@Override
	public boolean hasApartment() {
		return apartmentList != null && apartmentList.size() > 0 && apartmentList.get(0) != null;
	}

	public ITEM_REVIEWED(ApartmentComplex apartmentComplex) {
		apartmentComplexList = new ArrayList<ApartmentComplex>();
		apartmentComplexList.add(apartmentComplex);
	}

	@Override
	public ApartmentComplex getApartmentComplex() {
		if(apartmentComplexList != null && apartmentComplexList.size() > 0) {
			return apartmentComplexList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApartmentComplex(ApartmentComplex apartmentComplex) {
		if(apartmentComplexList == null) {
			apartmentComplexList = new ArrayList<>();
		}
		if(apartmentComplexList.size() == 0) {
			apartmentComplexList.add(apartmentComplex);
		} else {
			apartmentComplexList.set(0, apartmentComplex);
		}
	}

	@Override
	public List<ApartmentComplex> getApartmentComplexList() {
		return apartmentComplexList;
	}

	@Override
	public void setApartmentComplexList(List<ApartmentComplex> apartmentComplexList) {
		this.apartmentComplexList = apartmentComplexList;
	}

	@Override
	public boolean hasApartmentComplex() {
		return apartmentComplexList != null && apartmentComplexList.size() > 0 && apartmentComplexList.get(0) != null;
	}

	public ITEM_REVIEWED(AppendAction appendAction) {
		appendActionList = new ArrayList<AppendAction>();
		appendActionList.add(appendAction);
	}

	@Override
	public AppendAction getAppendAction() {
		if(appendActionList != null && appendActionList.size() > 0) {
			return appendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAppendAction(AppendAction appendAction) {
		if(appendActionList == null) {
			appendActionList = new ArrayList<>();
		}
		if(appendActionList.size() == 0) {
			appendActionList.add(appendAction);
		} else {
			appendActionList.set(0, appendAction);
		}
	}

	@Override
	public List<AppendAction> getAppendActionList() {
		return appendActionList;
	}

	@Override
	public void setAppendActionList(List<AppendAction> appendActionList) {
		this.appendActionList = appendActionList;
	}

	@Override
	public boolean hasAppendAction() {
		return appendActionList != null && appendActionList.size() > 0 && appendActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ApplyAction applyAction) {
		applyActionList = new ArrayList<ApplyAction>();
		applyActionList.add(applyAction);
	}

	@Override
	public ApplyAction getApplyAction() {
		if(applyActionList != null && applyActionList.size() > 0) {
			return applyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApplyAction(ApplyAction applyAction) {
		if(applyActionList == null) {
			applyActionList = new ArrayList<>();
		}
		if(applyActionList.size() == 0) {
			applyActionList.add(applyAction);
		} else {
			applyActionList.set(0, applyAction);
		}
	}

	@Override
	public List<ApplyAction> getApplyActionList() {
		return applyActionList;
	}

	@Override
	public void setApplyActionList(List<ApplyAction> applyActionList) {
		this.applyActionList = applyActionList;
	}

	@Override
	public boolean hasApplyAction() {
		return applyActionList != null && applyActionList.size() > 0 && applyActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ApprovedIndication approvedIndication) {
		approvedIndicationList = new ArrayList<ApprovedIndication>();
		approvedIndicationList.add(approvedIndication);
	}

	@Override
	public ApprovedIndication getApprovedIndication() {
		if(approvedIndicationList != null && approvedIndicationList.size() > 0) {
			return approvedIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApprovedIndication(ApprovedIndication approvedIndication) {
		if(approvedIndicationList == null) {
			approvedIndicationList = new ArrayList<>();
		}
		if(approvedIndicationList.size() == 0) {
			approvedIndicationList.add(approvedIndication);
		} else {
			approvedIndicationList.set(0, approvedIndication);
		}
	}

	@Override
	public List<ApprovedIndication> getApprovedIndicationList() {
		return approvedIndicationList;
	}

	@Override
	public void setApprovedIndicationList(List<ApprovedIndication> approvedIndicationList) {
		this.approvedIndicationList = approvedIndicationList;
	}

	@Override
	public boolean hasApprovedIndication() {
		return approvedIndicationList != null && approvedIndicationList.size() > 0 && approvedIndicationList.get(0) != null;
	}

	public ITEM_REVIEWED(Aquarium aquarium) {
		aquariumList = new ArrayList<Aquarium>();
		aquariumList.add(aquarium);
	}

	@Override
	public Aquarium getAquarium() {
		if(aquariumList != null && aquariumList.size() > 0) {
			return aquariumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAquarium(Aquarium aquarium) {
		if(aquariumList == null) {
			aquariumList = new ArrayList<>();
		}
		if(aquariumList.size() == 0) {
			aquariumList.add(aquarium);
		} else {
			aquariumList.set(0, aquarium);
		}
	}

	@Override
	public List<Aquarium> getAquariumList() {
		return aquariumList;
	}

	@Override
	public void setAquariumList(List<Aquarium> aquariumList) {
		this.aquariumList = aquariumList;
	}

	@Override
	public boolean hasAquarium() {
		return aquariumList != null && aquariumList.size() > 0 && aquariumList.get(0) != null;
	}

	public ITEM_REVIEWED(ArriveAction arriveAction) {
		arriveActionList = new ArrayList<ArriveAction>();
		arriveActionList.add(arriveAction);
	}

	@Override
	public ArriveAction getArriveAction() {
		if(arriveActionList != null && arriveActionList.size() > 0) {
			return arriveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArriveAction(ArriveAction arriveAction) {
		if(arriveActionList == null) {
			arriveActionList = new ArrayList<>();
		}
		if(arriveActionList.size() == 0) {
			arriveActionList.add(arriveAction);
		} else {
			arriveActionList.set(0, arriveAction);
		}
	}

	@Override
	public List<ArriveAction> getArriveActionList() {
		return arriveActionList;
	}

	@Override
	public void setArriveActionList(List<ArriveAction> arriveActionList) {
		this.arriveActionList = arriveActionList;
	}

	@Override
	public boolean hasArriveAction() {
		return arriveActionList != null && arriveActionList.size() > 0 && arriveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ArtGallery artGallery) {
		artGalleryList = new ArrayList<ArtGallery>();
		artGalleryList.add(artGallery);
	}

	@Override
	public ArtGallery getArtGallery() {
		if(artGalleryList != null && artGalleryList.size() > 0) {
			return artGalleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArtGallery(ArtGallery artGallery) {
		if(artGalleryList == null) {
			artGalleryList = new ArrayList<>();
		}
		if(artGalleryList.size() == 0) {
			artGalleryList.add(artGallery);
		} else {
			artGalleryList.set(0, artGallery);
		}
	}

	@Override
	public List<ArtGallery> getArtGalleryList() {
		return artGalleryList;
	}

	@Override
	public void setArtGalleryList(List<ArtGallery> artGalleryList) {
		this.artGalleryList = artGalleryList;
	}

	@Override
	public boolean hasArtGallery() {
		return artGalleryList != null && artGalleryList.size() > 0 && artGalleryList.get(0) != null;
	}

	public ITEM_REVIEWED(Artery artery) {
		arteryList = new ArrayList<Artery>();
		arteryList.add(artery);
	}

	@Override
	public Artery getArtery() {
		if(arteryList != null && arteryList.size() > 0) {
			return arteryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArtery(Artery artery) {
		if(arteryList == null) {
			arteryList = new ArrayList<>();
		}
		if(arteryList.size() == 0) {
			arteryList.add(artery);
		} else {
			arteryList.set(0, artery);
		}
	}

	@Override
	public List<Artery> getArteryList() {
		return arteryList;
	}

	@Override
	public void setArteryList(List<Artery> arteryList) {
		this.arteryList = arteryList;
	}

	@Override
	public boolean hasArtery() {
		return arteryList != null && arteryList.size() > 0 && arteryList.get(0) != null;
	}

	public ITEM_REVIEWED(Article article) {
		articleList = new ArrayList<Article>();
		articleList.add(article);
	}

	@Override
	public Article getArticle() {
		if(articleList != null && articleList.size() > 0) {
			return articleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArticle(Article article) {
		if(articleList == null) {
			articleList = new ArrayList<>();
		}
		if(articleList.size() == 0) {
			articleList.add(article);
		} else {
			articleList.set(0, article);
		}
	}

	@Override
	public List<Article> getArticleList() {
		return articleList;
	}

	@Override
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	@Override
	public boolean hasArticle() {
		return articleList != null && articleList.size() > 0 && articleList.get(0) != null;
	}

	public ITEM_REVIEWED(AskAction askAction) {
		askActionList = new ArrayList<AskAction>();
		askActionList.add(askAction);
	}

	@Override
	public AskAction getAskAction() {
		if(askActionList != null && askActionList.size() > 0) {
			return askActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAskAction(AskAction askAction) {
		if(askActionList == null) {
			askActionList = new ArrayList<>();
		}
		if(askActionList.size() == 0) {
			askActionList.add(askAction);
		} else {
			askActionList.set(0, askAction);
		}
	}

	@Override
	public List<AskAction> getAskActionList() {
		return askActionList;
	}

	@Override
	public void setAskActionList(List<AskAction> askActionList) {
		this.askActionList = askActionList;
	}

	@Override
	public boolean hasAskAction() {
		return askActionList != null && askActionList.size() > 0 && askActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AskPublicNewsArticle askPublicNewsArticle) {
		askPublicNewsArticleList = new ArrayList<AskPublicNewsArticle>();
		askPublicNewsArticleList.add(askPublicNewsArticle);
	}

	@Override
	public AskPublicNewsArticle getAskPublicNewsArticle() {
		if(askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0) {
			return askPublicNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle) {
		if(askPublicNewsArticleList == null) {
			askPublicNewsArticleList = new ArrayList<>();
		}
		if(askPublicNewsArticleList.size() == 0) {
			askPublicNewsArticleList.add(askPublicNewsArticle);
		} else {
			askPublicNewsArticleList.set(0, askPublicNewsArticle);
		}
	}

	@Override
	public List<AskPublicNewsArticle> getAskPublicNewsArticleList() {
		return askPublicNewsArticleList;
	}

	@Override
	public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList) {
		this.askPublicNewsArticleList = askPublicNewsArticleList;
	}

	@Override
	public boolean hasAskPublicNewsArticle() {
		return askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0 && askPublicNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(AssessAction assessAction) {
		assessActionList = new ArrayList<AssessAction>();
		assessActionList.add(assessAction);
	}

	@Override
	public AssessAction getAssessAction() {
		if(assessActionList != null && assessActionList.size() > 0) {
			return assessActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAssessAction(AssessAction assessAction) {
		if(assessActionList == null) {
			assessActionList = new ArrayList<>();
		}
		if(assessActionList.size() == 0) {
			assessActionList.add(assessAction);
		} else {
			assessActionList.set(0, assessAction);
		}
	}

	@Override
	public List<AssessAction> getAssessActionList() {
		return assessActionList;
	}

	@Override
	public void setAssessActionList(List<AssessAction> assessActionList) {
		this.assessActionList = assessActionList;
	}

	@Override
	public boolean hasAssessAction() {
		return assessActionList != null && assessActionList.size() > 0 && assessActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AssignAction assignAction) {
		assignActionList = new ArrayList<AssignAction>();
		assignActionList.add(assignAction);
	}

	@Override
	public AssignAction getAssignAction() {
		if(assignActionList != null && assignActionList.size() > 0) {
			return assignActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAssignAction(AssignAction assignAction) {
		if(assignActionList == null) {
			assignActionList = new ArrayList<>();
		}
		if(assignActionList.size() == 0) {
			assignActionList.add(assignAction);
		} else {
			assignActionList.set(0, assignAction);
		}
	}

	@Override
	public List<AssignAction> getAssignActionList() {
		return assignActionList;
	}

	@Override
	public void setAssignActionList(List<AssignAction> assignActionList) {
		this.assignActionList = assignActionList;
	}

	@Override
	public boolean hasAssignAction() {
		return assignActionList != null && assignActionList.size() > 0 && assignActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Atlas atlas) {
		atlasList = new ArrayList<Atlas>();
		atlasList.add(atlas);
	}

	@Override
	public Atlas getAtlas() {
		if(atlasList != null && atlasList.size() > 0) {
			return atlasList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAtlas(Atlas atlas) {
		if(atlasList == null) {
			atlasList = new ArrayList<>();
		}
		if(atlasList.size() == 0) {
			atlasList.add(atlas);
		} else {
			atlasList.set(0, atlas);
		}
	}

	@Override
	public List<Atlas> getAtlasList() {
		return atlasList;
	}

	@Override
	public void setAtlasList(List<Atlas> atlasList) {
		this.atlasList = atlasList;
	}

	@Override
	public boolean hasAtlas() {
		return atlasList != null && atlasList.size() > 0 && atlasList.get(0) != null;
	}

	public ITEM_REVIEWED(Attorney attorney) {
		attorneyList = new ArrayList<Attorney>();
		attorneyList.add(attorney);
	}

	@Override
	public Attorney getAttorney() {
		if(attorneyList != null && attorneyList.size() > 0) {
			return attorneyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAttorney(Attorney attorney) {
		if(attorneyList == null) {
			attorneyList = new ArrayList<>();
		}
		if(attorneyList.size() == 0) {
			attorneyList.add(attorney);
		} else {
			attorneyList.set(0, attorney);
		}
	}

	@Override
	public List<Attorney> getAttorneyList() {
		return attorneyList;
	}

	@Override
	public void setAttorneyList(List<Attorney> attorneyList) {
		this.attorneyList = attorneyList;
	}

	@Override
	public boolean hasAttorney() {
		return attorneyList != null && attorneyList.size() > 0 && attorneyList.get(0) != null;
	}

	public ITEM_REVIEWED(Audience audience) {
		audienceList = new ArrayList<Audience>();
		audienceList.add(audience);
	}

	@Override
	public Audience getAudience() {
		if(audienceList != null && audienceList.size() > 0) {
			return audienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudience(Audience audience) {
		if(audienceList == null) {
			audienceList = new ArrayList<>();
		}
		if(audienceList.size() == 0) {
			audienceList.add(audience);
		} else {
			audienceList.set(0, audience);
		}
	}

	@Override
	public List<Audience> getAudienceList() {
		return audienceList;
	}

	@Override
	public void setAudienceList(List<Audience> audienceList) {
		this.audienceList = audienceList;
	}

	@Override
	public boolean hasAudience() {
		return audienceList != null && audienceList.size() > 0 && audienceList.get(0) != null;
	}

	public ITEM_REVIEWED(AudioObject audioObject) {
		audioObjectList = new ArrayList<AudioObject>();
		audioObjectList.add(audioObject);
	}

	@Override
	public AudioObject getAudioObject() {
		if(audioObjectList != null && audioObjectList.size() > 0) {
			return audioObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudioObject(AudioObject audioObject) {
		if(audioObjectList == null) {
			audioObjectList = new ArrayList<>();
		}
		if(audioObjectList.size() == 0) {
			audioObjectList.add(audioObject);
		} else {
			audioObjectList.set(0, audioObject);
		}
	}

	@Override
	public List<AudioObject> getAudioObjectList() {
		return audioObjectList;
	}

	@Override
	public void setAudioObjectList(List<AudioObject> audioObjectList) {
		this.audioObjectList = audioObjectList;
	}

	@Override
	public boolean hasAudioObject() {
		return audioObjectList != null && audioObjectList.size() > 0 && audioObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(Audiobook audiobook) {
		audiobookList = new ArrayList<Audiobook>();
		audiobookList.add(audiobook);
	}

	@Override
	public Audiobook getAudiobook() {
		if(audiobookList != null && audiobookList.size() > 0) {
			return audiobookList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudiobook(Audiobook audiobook) {
		if(audiobookList == null) {
			audiobookList = new ArrayList<>();
		}
		if(audiobookList.size() == 0) {
			audiobookList.add(audiobook);
		} else {
			audiobookList.set(0, audiobook);
		}
	}

	@Override
	public List<Audiobook> getAudiobookList() {
		return audiobookList;
	}

	@Override
	public void setAudiobookList(List<Audiobook> audiobookList) {
		this.audiobookList = audiobookList;
	}

	@Override
	public boolean hasAudiobook() {
		return audiobookList != null && audiobookList.size() > 0 && audiobookList.get(0) != null;
	}

	public ITEM_REVIEWED(AuthorizeAction authorizeAction) {
		authorizeActionList = new ArrayList<AuthorizeAction>();
		authorizeActionList.add(authorizeAction);
	}

	@Override
	public AuthorizeAction getAuthorizeAction() {
		if(authorizeActionList != null && authorizeActionList.size() > 0) {
			return authorizeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAuthorizeAction(AuthorizeAction authorizeAction) {
		if(authorizeActionList == null) {
			authorizeActionList = new ArrayList<>();
		}
		if(authorizeActionList.size() == 0) {
			authorizeActionList.add(authorizeAction);
		} else {
			authorizeActionList.set(0, authorizeAction);
		}
	}

	@Override
	public List<AuthorizeAction> getAuthorizeActionList() {
		return authorizeActionList;
	}

	@Override
	public void setAuthorizeActionList(List<AuthorizeAction> authorizeActionList) {
		this.authorizeActionList = authorizeActionList;
	}

	@Override
	public boolean hasAuthorizeAction() {
		return authorizeActionList != null && authorizeActionList.size() > 0 && authorizeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoBodyShop autoBodyShop) {
		autoBodyShopList = new ArrayList<AutoBodyShop>();
		autoBodyShopList.add(autoBodyShop);
	}

	@Override
	public AutoBodyShop getAutoBodyShop() {
		if(autoBodyShopList != null && autoBodyShopList.size() > 0) {
			return autoBodyShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoBodyShop(AutoBodyShop autoBodyShop) {
		if(autoBodyShopList == null) {
			autoBodyShopList = new ArrayList<>();
		}
		if(autoBodyShopList.size() == 0) {
			autoBodyShopList.add(autoBodyShop);
		} else {
			autoBodyShopList.set(0, autoBodyShop);
		}
	}

	@Override
	public List<AutoBodyShop> getAutoBodyShopList() {
		return autoBodyShopList;
	}

	@Override
	public void setAutoBodyShopList(List<AutoBodyShop> autoBodyShopList) {
		this.autoBodyShopList = autoBodyShopList;
	}

	@Override
	public boolean hasAutoBodyShop() {
		return autoBodyShopList != null && autoBodyShopList.size() > 0 && autoBodyShopList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoDealer autoDealer) {
		autoDealerList = new ArrayList<AutoDealer>();
		autoDealerList.add(autoDealer);
	}

	@Override
	public AutoDealer getAutoDealer() {
		if(autoDealerList != null && autoDealerList.size() > 0) {
			return autoDealerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoDealer(AutoDealer autoDealer) {
		if(autoDealerList == null) {
			autoDealerList = new ArrayList<>();
		}
		if(autoDealerList.size() == 0) {
			autoDealerList.add(autoDealer);
		} else {
			autoDealerList.set(0, autoDealer);
		}
	}

	@Override
	public List<AutoDealer> getAutoDealerList() {
		return autoDealerList;
	}

	@Override
	public void setAutoDealerList(List<AutoDealer> autoDealerList) {
		this.autoDealerList = autoDealerList;
	}

	@Override
	public boolean hasAutoDealer() {
		return autoDealerList != null && autoDealerList.size() > 0 && autoDealerList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoPartsStore autoPartsStore) {
		autoPartsStoreList = new ArrayList<AutoPartsStore>();
		autoPartsStoreList.add(autoPartsStore);
	}

	@Override
	public AutoPartsStore getAutoPartsStore() {
		if(autoPartsStoreList != null && autoPartsStoreList.size() > 0) {
			return autoPartsStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoPartsStore(AutoPartsStore autoPartsStore) {
		if(autoPartsStoreList == null) {
			autoPartsStoreList = new ArrayList<>();
		}
		if(autoPartsStoreList.size() == 0) {
			autoPartsStoreList.add(autoPartsStore);
		} else {
			autoPartsStoreList.set(0, autoPartsStore);
		}
	}

	@Override
	public List<AutoPartsStore> getAutoPartsStoreList() {
		return autoPartsStoreList;
	}

	@Override
	public void setAutoPartsStoreList(List<AutoPartsStore> autoPartsStoreList) {
		this.autoPartsStoreList = autoPartsStoreList;
	}

	@Override
	public boolean hasAutoPartsStore() {
		return autoPartsStoreList != null && autoPartsStoreList.size() > 0 && autoPartsStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoRental autoRental) {
		autoRentalList = new ArrayList<AutoRental>();
		autoRentalList.add(autoRental);
	}

	@Override
	public AutoRental getAutoRental() {
		if(autoRentalList != null && autoRentalList.size() > 0) {
			return autoRentalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoRental(AutoRental autoRental) {
		if(autoRentalList == null) {
			autoRentalList = new ArrayList<>();
		}
		if(autoRentalList.size() == 0) {
			autoRentalList.add(autoRental);
		} else {
			autoRentalList.set(0, autoRental);
		}
	}

	@Override
	public List<AutoRental> getAutoRentalList() {
		return autoRentalList;
	}

	@Override
	public void setAutoRentalList(List<AutoRental> autoRentalList) {
		this.autoRentalList = autoRentalList;
	}

	@Override
	public boolean hasAutoRental() {
		return autoRentalList != null && autoRentalList.size() > 0 && autoRentalList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoRepair autoRepair) {
		autoRepairList = new ArrayList<AutoRepair>();
		autoRepairList.add(autoRepair);
	}

	@Override
	public AutoRepair getAutoRepair() {
		if(autoRepairList != null && autoRepairList.size() > 0) {
			return autoRepairList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoRepair(AutoRepair autoRepair) {
		if(autoRepairList == null) {
			autoRepairList = new ArrayList<>();
		}
		if(autoRepairList.size() == 0) {
			autoRepairList.add(autoRepair);
		} else {
			autoRepairList.set(0, autoRepair);
		}
	}

	@Override
	public List<AutoRepair> getAutoRepairList() {
		return autoRepairList;
	}

	@Override
	public void setAutoRepairList(List<AutoRepair> autoRepairList) {
		this.autoRepairList = autoRepairList;
	}

	@Override
	public boolean hasAutoRepair() {
		return autoRepairList != null && autoRepairList.size() > 0 && autoRepairList.get(0) != null;
	}

	public ITEM_REVIEWED(AutoWash autoWash) {
		autoWashList = new ArrayList<AutoWash>();
		autoWashList.add(autoWash);
	}

	@Override
	public AutoWash getAutoWash() {
		if(autoWashList != null && autoWashList.size() > 0) {
			return autoWashList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutoWash(AutoWash autoWash) {
		if(autoWashList == null) {
			autoWashList = new ArrayList<>();
		}
		if(autoWashList.size() == 0) {
			autoWashList.add(autoWash);
		} else {
			autoWashList.set(0, autoWash);
		}
	}

	@Override
	public List<AutoWash> getAutoWashList() {
		return autoWashList;
	}

	@Override
	public void setAutoWashList(List<AutoWash> autoWashList) {
		this.autoWashList = autoWashList;
	}

	@Override
	public boolean hasAutoWash() {
		return autoWashList != null && autoWashList.size() > 0 && autoWashList.get(0) != null;
	}

	public ITEM_REVIEWED(AutomatedTeller automatedTeller) {
		automatedTellerList = new ArrayList<AutomatedTeller>();
		automatedTellerList.add(automatedTeller);
	}

	@Override
	public AutomatedTeller getAutomatedTeller() {
		if(automatedTellerList != null && automatedTellerList.size() > 0) {
			return automatedTellerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutomatedTeller(AutomatedTeller automatedTeller) {
		if(automatedTellerList == null) {
			automatedTellerList = new ArrayList<>();
		}
		if(automatedTellerList.size() == 0) {
			automatedTellerList.add(automatedTeller);
		} else {
			automatedTellerList.set(0, automatedTeller);
		}
	}

	@Override
	public List<AutomatedTeller> getAutomatedTellerList() {
		return automatedTellerList;
	}

	@Override
	public void setAutomatedTellerList(List<AutomatedTeller> automatedTellerList) {
		this.automatedTellerList = automatedTellerList;
	}

	@Override
	public boolean hasAutomatedTeller() {
		return automatedTellerList != null && automatedTellerList.size() > 0 && automatedTellerList.get(0) != null;
	}

	public ITEM_REVIEWED(AutomotiveBusiness automotiveBusiness) {
		automotiveBusinessList = new ArrayList<AutomotiveBusiness>();
		automotiveBusinessList.add(automotiveBusiness);
	}

	@Override
	public AutomotiveBusiness getAutomotiveBusiness() {
		if(automotiveBusinessList != null && automotiveBusinessList.size() > 0) {
			return automotiveBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAutomotiveBusiness(AutomotiveBusiness automotiveBusiness) {
		if(automotiveBusinessList == null) {
			automotiveBusinessList = new ArrayList<>();
		}
		if(automotiveBusinessList.size() == 0) {
			automotiveBusinessList.add(automotiveBusiness);
		} else {
			automotiveBusinessList.set(0, automotiveBusiness);
		}
	}

	@Override
	public List<AutomotiveBusiness> getAutomotiveBusinessList() {
		return automotiveBusinessList;
	}

	@Override
	public void setAutomotiveBusinessList(List<AutomotiveBusiness> automotiveBusinessList) {
		this.automotiveBusinessList = automotiveBusinessList;
	}

	@Override
	public boolean hasAutomotiveBusiness() {
		return automotiveBusinessList != null && automotiveBusinessList.size() > 0 && automotiveBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(BackgroundNewsArticle backgroundNewsArticle) {
		backgroundNewsArticleList = new ArrayList<BackgroundNewsArticle>();
		backgroundNewsArticleList.add(backgroundNewsArticle);
	}

	@Override
	public BackgroundNewsArticle getBackgroundNewsArticle() {
		if(backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0) {
			return backgroundNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle) {
		if(backgroundNewsArticleList == null) {
			backgroundNewsArticleList = new ArrayList<>();
		}
		if(backgroundNewsArticleList.size() == 0) {
			backgroundNewsArticleList.add(backgroundNewsArticle);
		} else {
			backgroundNewsArticleList.set(0, backgroundNewsArticle);
		}
	}

	@Override
	public List<BackgroundNewsArticle> getBackgroundNewsArticleList() {
		return backgroundNewsArticleList;
	}

	@Override
	public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList) {
		this.backgroundNewsArticleList = backgroundNewsArticleList;
	}

	@Override
	public boolean hasBackgroundNewsArticle() {
		return backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0 && backgroundNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(Bakery bakery) {
		bakeryList = new ArrayList<Bakery>();
		bakeryList.add(bakery);
	}

	@Override
	public Bakery getBakery() {
		if(bakeryList != null && bakeryList.size() > 0) {
			return bakeryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBakery(Bakery bakery) {
		if(bakeryList == null) {
			bakeryList = new ArrayList<>();
		}
		if(bakeryList.size() == 0) {
			bakeryList.add(bakery);
		} else {
			bakeryList.set(0, bakery);
		}
	}

	@Override
	public List<Bakery> getBakeryList() {
		return bakeryList;
	}

	@Override
	public void setBakeryList(List<Bakery> bakeryList) {
		this.bakeryList = bakeryList;
	}

	@Override
	public boolean hasBakery() {
		return bakeryList != null && bakeryList.size() > 0 && bakeryList.get(0) != null;
	}

	public ITEM_REVIEWED(BankAccount bankAccount) {
		bankAccountList = new ArrayList<BankAccount>();
		bankAccountList.add(bankAccount);
	}

	@Override
	public BankAccount getBankAccount() {
		if(bankAccountList != null && bankAccountList.size() > 0) {
			return bankAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {
		if(bankAccountList == null) {
			bankAccountList = new ArrayList<>();
		}
		if(bankAccountList.size() == 0) {
			bankAccountList.add(bankAccount);
		} else {
			bankAccountList.set(0, bankAccount);
		}
	}

	@Override
	public List<BankAccount> getBankAccountList() {
		return bankAccountList;
	}

	@Override
	public void setBankAccountList(List<BankAccount> bankAccountList) {
		this.bankAccountList = bankAccountList;
	}

	@Override
	public boolean hasBankAccount() {
		return bankAccountList != null && bankAccountList.size() > 0 && bankAccountList.get(0) != null;
	}

	public ITEM_REVIEWED(BankOrCreditUnion bankOrCreditUnion) {
		bankOrCreditUnionList = new ArrayList<BankOrCreditUnion>();
		bankOrCreditUnionList.add(bankOrCreditUnion);
	}

	@Override
	public BankOrCreditUnion getBankOrCreditUnion() {
		if(bankOrCreditUnionList != null && bankOrCreditUnionList.size() > 0) {
			return bankOrCreditUnionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBankOrCreditUnion(BankOrCreditUnion bankOrCreditUnion) {
		if(bankOrCreditUnionList == null) {
			bankOrCreditUnionList = new ArrayList<>();
		}
		if(bankOrCreditUnionList.size() == 0) {
			bankOrCreditUnionList.add(bankOrCreditUnion);
		} else {
			bankOrCreditUnionList.set(0, bankOrCreditUnion);
		}
	}

	@Override
	public List<BankOrCreditUnion> getBankOrCreditUnionList() {
		return bankOrCreditUnionList;
	}

	@Override
	public void setBankOrCreditUnionList(List<BankOrCreditUnion> bankOrCreditUnionList) {
		this.bankOrCreditUnionList = bankOrCreditUnionList;
	}

	@Override
	public boolean hasBankOrCreditUnion() {
		return bankOrCreditUnionList != null && bankOrCreditUnionList.size() > 0 && bankOrCreditUnionList.get(0) != null;
	}

	public ITEM_REVIEWED(BarOrPub barOrPub) {
		barOrPubList = new ArrayList<BarOrPub>();
		barOrPubList.add(barOrPub);
	}

	@Override
	public BarOrPub getBarOrPub() {
		if(barOrPubList != null && barOrPubList.size() > 0) {
			return barOrPubList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBarOrPub(BarOrPub barOrPub) {
		if(barOrPubList == null) {
			barOrPubList = new ArrayList<>();
		}
		if(barOrPubList.size() == 0) {
			barOrPubList.add(barOrPub);
		} else {
			barOrPubList.set(0, barOrPub);
		}
	}

	@Override
	public List<BarOrPub> getBarOrPubList() {
		return barOrPubList;
	}

	@Override
	public void setBarOrPubList(List<BarOrPub> barOrPubList) {
		this.barOrPubList = barOrPubList;
	}

	@Override
	public boolean hasBarOrPub() {
		return barOrPubList != null && barOrPubList.size() > 0 && barOrPubList.get(0) != null;
	}

	public ITEM_REVIEWED(Barcode barcode) {
		barcodeList = new ArrayList<Barcode>();
		barcodeList.add(barcode);
	}

	@Override
	public Barcode getBarcode() {
		if(barcodeList != null && barcodeList.size() > 0) {
			return barcodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBarcode(Barcode barcode) {
		if(barcodeList == null) {
			barcodeList = new ArrayList<>();
		}
		if(barcodeList.size() == 0) {
			barcodeList.add(barcode);
		} else {
			barcodeList.set(0, barcode);
		}
	}

	@Override
	public List<Barcode> getBarcodeList() {
		return barcodeList;
	}

	@Override
	public void setBarcodeList(List<Barcode> barcodeList) {
		this.barcodeList = barcodeList;
	}

	@Override
	public boolean hasBarcode() {
		return barcodeList != null && barcodeList.size() > 0 && barcodeList.get(0) != null;
	}

	public ITEM_REVIEWED(Beach beach) {
		beachList = new ArrayList<Beach>();
		beachList.add(beach);
	}

	@Override
	public Beach getBeach() {
		if(beachList != null && beachList.size() > 0) {
			return beachList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBeach(Beach beach) {
		if(beachList == null) {
			beachList = new ArrayList<>();
		}
		if(beachList.size() == 0) {
			beachList.add(beach);
		} else {
			beachList.set(0, beach);
		}
	}

	@Override
	public List<Beach> getBeachList() {
		return beachList;
	}

	@Override
	public void setBeachList(List<Beach> beachList) {
		this.beachList = beachList;
	}

	@Override
	public boolean hasBeach() {
		return beachList != null && beachList.size() > 0 && beachList.get(0) != null;
	}

	public ITEM_REVIEWED(BeautySalon beautySalon) {
		beautySalonList = new ArrayList<BeautySalon>();
		beautySalonList.add(beautySalon);
	}

	@Override
	public BeautySalon getBeautySalon() {
		if(beautySalonList != null && beautySalonList.size() > 0) {
			return beautySalonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBeautySalon(BeautySalon beautySalon) {
		if(beautySalonList == null) {
			beautySalonList = new ArrayList<>();
		}
		if(beautySalonList.size() == 0) {
			beautySalonList.add(beautySalon);
		} else {
			beautySalonList.set(0, beautySalon);
		}
	}

	@Override
	public List<BeautySalon> getBeautySalonList() {
		return beautySalonList;
	}

	@Override
	public void setBeautySalonList(List<BeautySalon> beautySalonList) {
		this.beautySalonList = beautySalonList;
	}

	@Override
	public boolean hasBeautySalon() {
		return beautySalonList != null && beautySalonList.size() > 0 && beautySalonList.get(0) != null;
	}

	public ITEM_REVIEWED(BedAndBreakfast bedAndBreakfast) {
		bedAndBreakfastList = new ArrayList<BedAndBreakfast>();
		bedAndBreakfastList.add(bedAndBreakfast);
	}

	@Override
	public BedAndBreakfast getBedAndBreakfast() {
		if(bedAndBreakfastList != null && bedAndBreakfastList.size() > 0) {
			return bedAndBreakfastList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBedAndBreakfast(BedAndBreakfast bedAndBreakfast) {
		if(bedAndBreakfastList == null) {
			bedAndBreakfastList = new ArrayList<>();
		}
		if(bedAndBreakfastList.size() == 0) {
			bedAndBreakfastList.add(bedAndBreakfast);
		} else {
			bedAndBreakfastList.set(0, bedAndBreakfast);
		}
	}

	@Override
	public List<BedAndBreakfast> getBedAndBreakfastList() {
		return bedAndBreakfastList;
	}

	@Override
	public void setBedAndBreakfastList(List<BedAndBreakfast> bedAndBreakfastList) {
		this.bedAndBreakfastList = bedAndBreakfastList;
	}

	@Override
	public boolean hasBedAndBreakfast() {
		return bedAndBreakfastList != null && bedAndBreakfastList.size() > 0 && bedAndBreakfastList.get(0) != null;
	}

	public ITEM_REVIEWED(BedDetails bedDetails) {
		bedDetailsList = new ArrayList<BedDetails>();
		bedDetailsList.add(bedDetails);
	}

	@Override
	public BedDetails getBedDetails() {
		if(bedDetailsList != null && bedDetailsList.size() > 0) {
			return bedDetailsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBedDetails(BedDetails bedDetails) {
		if(bedDetailsList == null) {
			bedDetailsList = new ArrayList<>();
		}
		if(bedDetailsList.size() == 0) {
			bedDetailsList.add(bedDetails);
		} else {
			bedDetailsList.set(0, bedDetails);
		}
	}

	@Override
	public List<BedDetails> getBedDetailsList() {
		return bedDetailsList;
	}

	@Override
	public void setBedDetailsList(List<BedDetails> bedDetailsList) {
		this.bedDetailsList = bedDetailsList;
	}

	@Override
	public boolean hasBedDetails() {
		return bedDetailsList != null && bedDetailsList.size() > 0 && bedDetailsList.get(0) != null;
	}

	public ITEM_REVIEWED(BedType bedType) {
		bedTypeList = new ArrayList<BedType>();
		bedTypeList.add(bedType);
	}

	@Override
	public BedType getBedType() {
		if(bedTypeList != null && bedTypeList.size() > 0) {
			return bedTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBedType(BedType bedType) {
		if(bedTypeList == null) {
			bedTypeList = new ArrayList<>();
		}
		if(bedTypeList.size() == 0) {
			bedTypeList.add(bedType);
		} else {
			bedTypeList.set(0, bedType);
		}
	}

	@Override
	public List<BedType> getBedTypeList() {
		return bedTypeList;
	}

	@Override
	public void setBedTypeList(List<BedType> bedTypeList) {
		this.bedTypeList = bedTypeList;
	}

	@Override
	public boolean hasBedType() {
		return bedTypeList != null && bedTypeList.size() > 0 && bedTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(BefriendAction befriendAction) {
		befriendActionList = new ArrayList<BefriendAction>();
		befriendActionList.add(befriendAction);
	}

	@Override
	public BefriendAction getBefriendAction() {
		if(befriendActionList != null && befriendActionList.size() > 0) {
			return befriendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBefriendAction(BefriendAction befriendAction) {
		if(befriendActionList == null) {
			befriendActionList = new ArrayList<>();
		}
		if(befriendActionList.size() == 0) {
			befriendActionList.add(befriendAction);
		} else {
			befriendActionList.set(0, befriendAction);
		}
	}

	@Override
	public List<BefriendAction> getBefriendActionList() {
		return befriendActionList;
	}

	@Override
	public void setBefriendActionList(List<BefriendAction> befriendActionList) {
		this.befriendActionList = befriendActionList;
	}

	@Override
	public boolean hasBefriendAction() {
		return befriendActionList != null && befriendActionList.size() > 0 && befriendActionList.get(0) != null;
	}

	public ITEM_REVIEWED(BikeStore bikeStore) {
		bikeStoreList = new ArrayList<BikeStore>();
		bikeStoreList.add(bikeStore);
	}

	@Override
	public BikeStore getBikeStore() {
		if(bikeStoreList != null && bikeStoreList.size() > 0) {
			return bikeStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBikeStore(BikeStore bikeStore) {
		if(bikeStoreList == null) {
			bikeStoreList = new ArrayList<>();
		}
		if(bikeStoreList.size() == 0) {
			bikeStoreList.add(bikeStore);
		} else {
			bikeStoreList.set(0, bikeStore);
		}
	}

	@Override
	public List<BikeStore> getBikeStoreList() {
		return bikeStoreList;
	}

	@Override
	public void setBikeStoreList(List<BikeStore> bikeStoreList) {
		this.bikeStoreList = bikeStoreList;
	}

	@Override
	public boolean hasBikeStore() {
		return bikeStoreList != null && bikeStoreList.size() > 0 && bikeStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Blog blog) {
		blogList = new ArrayList<Blog>();
		blogList.add(blog);
	}

	@Override
	public Blog getBlog() {
		if(blogList != null && blogList.size() > 0) {
			return blogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBlog(Blog blog) {
		if(blogList == null) {
			blogList = new ArrayList<>();
		}
		if(blogList.size() == 0) {
			blogList.add(blog);
		} else {
			blogList.set(0, blog);
		}
	}

	@Override
	public List<Blog> getBlogList() {
		return blogList;
	}

	@Override
	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}

	@Override
	public boolean hasBlog() {
		return blogList != null && blogList.size() > 0 && blogList.get(0) != null;
	}

	public ITEM_REVIEWED(BlogPosting blogPosting) {
		blogPostingList = new ArrayList<BlogPosting>();
		blogPostingList.add(blogPosting);
	}

	@Override
	public BlogPosting getBlogPosting() {
		if(blogPostingList != null && blogPostingList.size() > 0) {
			return blogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBlogPosting(BlogPosting blogPosting) {
		if(blogPostingList == null) {
			blogPostingList = new ArrayList<>();
		}
		if(blogPostingList.size() == 0) {
			blogPostingList.add(blogPosting);
		} else {
			blogPostingList.set(0, blogPosting);
		}
	}

	@Override
	public List<BlogPosting> getBlogPostingList() {
		return blogPostingList;
	}

	@Override
	public void setBlogPostingList(List<BlogPosting> blogPostingList) {
		this.blogPostingList = blogPostingList;
	}

	@Override
	public boolean hasBlogPosting() {
		return blogPostingList != null && blogPostingList.size() > 0 && blogPostingList.get(0) != null;
	}

	public ITEM_REVIEWED(BloodTest bloodTest) {
		bloodTestList = new ArrayList<BloodTest>();
		bloodTestList.add(bloodTest);
	}

	@Override
	public BloodTest getBloodTest() {
		if(bloodTestList != null && bloodTestList.size() > 0) {
			return bloodTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBloodTest(BloodTest bloodTest) {
		if(bloodTestList == null) {
			bloodTestList = new ArrayList<>();
		}
		if(bloodTestList.size() == 0) {
			bloodTestList.add(bloodTest);
		} else {
			bloodTestList.set(0, bloodTest);
		}
	}

	@Override
	public List<BloodTest> getBloodTestList() {
		return bloodTestList;
	}

	@Override
	public void setBloodTestList(List<BloodTest> bloodTestList) {
		this.bloodTestList = bloodTestList;
	}

	@Override
	public boolean hasBloodTest() {
		return bloodTestList != null && bloodTestList.size() > 0 && bloodTestList.get(0) != null;
	}

	public ITEM_REVIEWED(BoardingPolicyType boardingPolicyType) {
		boardingPolicyTypeList = new ArrayList<BoardingPolicyType>();
		boardingPolicyTypeList.add(boardingPolicyType);
	}

	@Override
	public BoardingPolicyType getBoardingPolicyType() {
		if(boardingPolicyTypeList != null && boardingPolicyTypeList.size() > 0) {
			return boardingPolicyTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBoardingPolicyType(BoardingPolicyType boardingPolicyType) {
		if(boardingPolicyTypeList == null) {
			boardingPolicyTypeList = new ArrayList<>();
		}
		if(boardingPolicyTypeList.size() == 0) {
			boardingPolicyTypeList.add(boardingPolicyType);
		} else {
			boardingPolicyTypeList.set(0, boardingPolicyType);
		}
	}

	@Override
	public List<BoardingPolicyType> getBoardingPolicyTypeList() {
		return boardingPolicyTypeList;
	}

	@Override
	public void setBoardingPolicyTypeList(List<BoardingPolicyType> boardingPolicyTypeList) {
		this.boardingPolicyTypeList = boardingPolicyTypeList;
	}

	@Override
	public boolean hasBoardingPolicyType() {
		return boardingPolicyTypeList != null && boardingPolicyTypeList.size() > 0 && boardingPolicyTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(BodyOfWater bodyOfWater) {
		bodyOfWaterList = new ArrayList<BodyOfWater>();
		bodyOfWaterList.add(bodyOfWater);
	}

	@Override
	public BodyOfWater getBodyOfWater() {
		if(bodyOfWaterList != null && bodyOfWaterList.size() > 0) {
			return bodyOfWaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBodyOfWater(BodyOfWater bodyOfWater) {
		if(bodyOfWaterList == null) {
			bodyOfWaterList = new ArrayList<>();
		}
		if(bodyOfWaterList.size() == 0) {
			bodyOfWaterList.add(bodyOfWater);
		} else {
			bodyOfWaterList.set(0, bodyOfWater);
		}
	}

	@Override
	public List<BodyOfWater> getBodyOfWaterList() {
		return bodyOfWaterList;
	}

	@Override
	public void setBodyOfWaterList(List<BodyOfWater> bodyOfWaterList) {
		this.bodyOfWaterList = bodyOfWaterList;
	}

	@Override
	public boolean hasBodyOfWater() {
		return bodyOfWaterList != null && bodyOfWaterList.size() > 0 && bodyOfWaterList.get(0) != null;
	}

	public ITEM_REVIEWED(Bone bone) {
		boneList = new ArrayList<Bone>();
		boneList.add(bone);
	}

	@Override
	public Bone getBone() {
		if(boneList != null && boneList.size() > 0) {
			return boneList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBone(Bone bone) {
		if(boneList == null) {
			boneList = new ArrayList<>();
		}
		if(boneList.size() == 0) {
			boneList.add(bone);
		} else {
			boneList.set(0, bone);
		}
	}

	@Override
	public List<Bone> getBoneList() {
		return boneList;
	}

	@Override
	public void setBoneList(List<Bone> boneList) {
		this.boneList = boneList;
	}

	@Override
	public boolean hasBone() {
		return boneList != null && boneList.size() > 0 && boneList.get(0) != null;
	}

	public ITEM_REVIEWED(Book book) {
		bookList = new ArrayList<Book>();
		bookList.add(book);
	}

	@Override
	public Book getBook() {
		if(bookList != null && bookList.size() > 0) {
			return bookList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBook(Book book) {
		if(bookList == null) {
			bookList = new ArrayList<>();
		}
		if(bookList.size() == 0) {
			bookList.add(book);
		} else {
			bookList.set(0, book);
		}
	}

	@Override
	public List<Book> getBookList() {
		return bookList;
	}

	@Override
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public boolean hasBook() {
		return bookList != null && bookList.size() > 0 && bookList.get(0) != null;
	}

	public ITEM_REVIEWED(BookFormatType bookFormatType) {
		bookFormatTypeList = new ArrayList<BookFormatType>();
		bookFormatTypeList.add(bookFormatType);
	}

	@Override
	public BookFormatType getBookFormatType() {
		if(bookFormatTypeList != null && bookFormatTypeList.size() > 0) {
			return bookFormatTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookFormatType(BookFormatType bookFormatType) {
		if(bookFormatTypeList == null) {
			bookFormatTypeList = new ArrayList<>();
		}
		if(bookFormatTypeList.size() == 0) {
			bookFormatTypeList.add(bookFormatType);
		} else {
			bookFormatTypeList.set(0, bookFormatType);
		}
	}

	@Override
	public List<BookFormatType> getBookFormatTypeList() {
		return bookFormatTypeList;
	}

	@Override
	public void setBookFormatTypeList(List<BookFormatType> bookFormatTypeList) {
		this.bookFormatTypeList = bookFormatTypeList;
	}

	@Override
	public boolean hasBookFormatType() {
		return bookFormatTypeList != null && bookFormatTypeList.size() > 0 && bookFormatTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(BookSeries bookSeries) {
		bookSeriesList = new ArrayList<BookSeries>();
		bookSeriesList.add(bookSeries);
	}

	@Override
	public BookSeries getBookSeries() {
		if(bookSeriesList != null && bookSeriesList.size() > 0) {
			return bookSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookSeries(BookSeries bookSeries) {
		if(bookSeriesList == null) {
			bookSeriesList = new ArrayList<>();
		}
		if(bookSeriesList.size() == 0) {
			bookSeriesList.add(bookSeries);
		} else {
			bookSeriesList.set(0, bookSeries);
		}
	}

	@Override
	public List<BookSeries> getBookSeriesList() {
		return bookSeriesList;
	}

	@Override
	public void setBookSeriesList(List<BookSeries> bookSeriesList) {
		this.bookSeriesList = bookSeriesList;
	}

	@Override
	public boolean hasBookSeries() {
		return bookSeriesList != null && bookSeriesList.size() > 0 && bookSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(BookStore bookStore) {
		bookStoreList = new ArrayList<BookStore>();
		bookStoreList.add(bookStore);
	}

	@Override
	public BookStore getBookStore() {
		if(bookStoreList != null && bookStoreList.size() > 0) {
			return bookStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookStore(BookStore bookStore) {
		if(bookStoreList == null) {
			bookStoreList = new ArrayList<>();
		}
		if(bookStoreList.size() == 0) {
			bookStoreList.add(bookStore);
		} else {
			bookStoreList.set(0, bookStore);
		}
	}

	@Override
	public List<BookStore> getBookStoreList() {
		return bookStoreList;
	}

	@Override
	public void setBookStoreList(List<BookStore> bookStoreList) {
		this.bookStoreList = bookStoreList;
	}

	@Override
	public boolean hasBookStore() {
		return bookStoreList != null && bookStoreList.size() > 0 && bookStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(BookmarkAction bookmarkAction) {
		bookmarkActionList = new ArrayList<BookmarkAction>();
		bookmarkActionList.add(bookmarkAction);
	}

	@Override
	public BookmarkAction getBookmarkAction() {
		if(bookmarkActionList != null && bookmarkActionList.size() > 0) {
			return bookmarkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookmarkAction(BookmarkAction bookmarkAction) {
		if(bookmarkActionList == null) {
			bookmarkActionList = new ArrayList<>();
		}
		if(bookmarkActionList.size() == 0) {
			bookmarkActionList.add(bookmarkAction);
		} else {
			bookmarkActionList.set(0, bookmarkAction);
		}
	}

	@Override
	public List<BookmarkAction> getBookmarkActionList() {
		return bookmarkActionList;
	}

	@Override
	public void setBookmarkActionList(List<BookmarkAction> bookmarkActionList) {
		this.bookmarkActionList = bookmarkActionList;
	}

	@Override
	public boolean hasBookmarkAction() {
		return bookmarkActionList != null && bookmarkActionList.size() > 0 && bookmarkActionList.get(0) != null;
	}

	public ITEM_REVIEWED(BorrowAction borrowAction) {
		borrowActionList = new ArrayList<BorrowAction>();
		borrowActionList.add(borrowAction);
	}

	@Override
	public BorrowAction getBorrowAction() {
		if(borrowActionList != null && borrowActionList.size() > 0) {
			return borrowActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBorrowAction(BorrowAction borrowAction) {
		if(borrowActionList == null) {
			borrowActionList = new ArrayList<>();
		}
		if(borrowActionList.size() == 0) {
			borrowActionList.add(borrowAction);
		} else {
			borrowActionList.set(0, borrowAction);
		}
	}

	@Override
	public List<BorrowAction> getBorrowActionList() {
		return borrowActionList;
	}

	@Override
	public void setBorrowActionList(List<BorrowAction> borrowActionList) {
		this.borrowActionList = borrowActionList;
	}

	@Override
	public boolean hasBorrowAction() {
		return borrowActionList != null && borrowActionList.size() > 0 && borrowActionList.get(0) != null;
	}

	public ITEM_REVIEWED(BowlingAlley bowlingAlley) {
		bowlingAlleyList = new ArrayList<BowlingAlley>();
		bowlingAlleyList.add(bowlingAlley);
	}

	@Override
	public BowlingAlley getBowlingAlley() {
		if(bowlingAlleyList != null && bowlingAlleyList.size() > 0) {
			return bowlingAlleyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBowlingAlley(BowlingAlley bowlingAlley) {
		if(bowlingAlleyList == null) {
			bowlingAlleyList = new ArrayList<>();
		}
		if(bowlingAlleyList.size() == 0) {
			bowlingAlleyList.add(bowlingAlley);
		} else {
			bowlingAlleyList.set(0, bowlingAlley);
		}
	}

	@Override
	public List<BowlingAlley> getBowlingAlleyList() {
		return bowlingAlleyList;
	}

	@Override
	public void setBowlingAlleyList(List<BowlingAlley> bowlingAlleyList) {
		this.bowlingAlleyList = bowlingAlleyList;
	}

	@Override
	public boolean hasBowlingAlley() {
		return bowlingAlleyList != null && bowlingAlleyList.size() > 0 && bowlingAlleyList.get(0) != null;
	}

	public ITEM_REVIEWED(BrainStructure brainStructure) {
		brainStructureList = new ArrayList<BrainStructure>();
		brainStructureList.add(brainStructure);
	}

	@Override
	public BrainStructure getBrainStructure() {
		if(brainStructureList != null && brainStructureList.size() > 0) {
			return brainStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrainStructure(BrainStructure brainStructure) {
		if(brainStructureList == null) {
			brainStructureList = new ArrayList<>();
		}
		if(brainStructureList.size() == 0) {
			brainStructureList.add(brainStructure);
		} else {
			brainStructureList.set(0, brainStructure);
		}
	}

	@Override
	public List<BrainStructure> getBrainStructureList() {
		return brainStructureList;
	}

	@Override
	public void setBrainStructureList(List<BrainStructure> brainStructureList) {
		this.brainStructureList = brainStructureList;
	}

	@Override
	public boolean hasBrainStructure() {
		return brainStructureList != null && brainStructureList.size() > 0 && brainStructureList.get(0) != null;
	}

	public ITEM_REVIEWED(Brand brand) {
		brandList = new ArrayList<Brand>();
		brandList.add(brand);
	}

	@Override
	public Brand getBrand() {
		if(brandList != null && brandList.size() > 0) {
			return brandList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrand(Brand brand) {
		if(brandList == null) {
			brandList = new ArrayList<>();
		}
		if(brandList.size() == 0) {
			brandList.add(brand);
		} else {
			brandList.set(0, brand);
		}
	}

	@Override
	public List<Brand> getBrandList() {
		return brandList;
	}

	@Override
	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}

	@Override
	public boolean hasBrand() {
		return brandList != null && brandList.size() > 0 && brandList.get(0) != null;
	}

	public ITEM_REVIEWED(BreadcrumbList breadcrumbList) {
		breadcrumbListList = new ArrayList<BreadcrumbList>();
		breadcrumbListList.add(breadcrumbList);
	}

	@Override
	public BreadcrumbList getBreadcrumbList() {
		if(breadcrumbListList != null && breadcrumbListList.size() > 0) {
			return breadcrumbListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBreadcrumbList(BreadcrumbList breadcrumbList) {
		if(breadcrumbListList == null) {
			breadcrumbListList = new ArrayList<>();
		}
		if(breadcrumbListList.size() == 0) {
			breadcrumbListList.add(breadcrumbList);
		} else {
			breadcrumbListList.set(0, breadcrumbList);
		}
	}

	@Override
	public List<BreadcrumbList> getBreadcrumbListList() {
		return breadcrumbListList;
	}

	@Override
	public void setBreadcrumbListList(List<BreadcrumbList> breadcrumbListList) {
		this.breadcrumbListList = breadcrumbListList;
	}

	@Override
	public boolean hasBreadcrumbList() {
		return breadcrumbListList != null && breadcrumbListList.size() > 0 && breadcrumbListList.get(0) != null;
	}

	public ITEM_REVIEWED(Brewery brewery) {
		breweryList = new ArrayList<Brewery>();
		breweryList.add(brewery);
	}

	@Override
	public Brewery getBrewery() {
		if(breweryList != null && breweryList.size() > 0) {
			return breweryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrewery(Brewery brewery) {
		if(breweryList == null) {
			breweryList = new ArrayList<>();
		}
		if(breweryList.size() == 0) {
			breweryList.add(brewery);
		} else {
			breweryList.set(0, brewery);
		}
	}

	@Override
	public List<Brewery> getBreweryList() {
		return breweryList;
	}

	@Override
	public void setBreweryList(List<Brewery> breweryList) {
		this.breweryList = breweryList;
	}

	@Override
	public boolean hasBrewery() {
		return breweryList != null && breweryList.size() > 0 && breweryList.get(0) != null;
	}

	public ITEM_REVIEWED(Bridge bridge) {
		bridgeList = new ArrayList<Bridge>();
		bridgeList.add(bridge);
	}

	@Override
	public Bridge getBridge() {
		if(bridgeList != null && bridgeList.size() > 0) {
			return bridgeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBridge(Bridge bridge) {
		if(bridgeList == null) {
			bridgeList = new ArrayList<>();
		}
		if(bridgeList.size() == 0) {
			bridgeList.add(bridge);
		} else {
			bridgeList.set(0, bridge);
		}
	}

	@Override
	public List<Bridge> getBridgeList() {
		return bridgeList;
	}

	@Override
	public void setBridgeList(List<Bridge> bridgeList) {
		this.bridgeList = bridgeList;
	}

	@Override
	public boolean hasBridge() {
		return bridgeList != null && bridgeList.size() > 0 && bridgeList.get(0) != null;
	}

	public ITEM_REVIEWED(BroadcastChannel broadcastChannel) {
		broadcastChannelList = new ArrayList<BroadcastChannel>();
		broadcastChannelList.add(broadcastChannel);
	}

	@Override
	public BroadcastChannel getBroadcastChannel() {
		if(broadcastChannelList != null && broadcastChannelList.size() > 0) {
			return broadcastChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastChannel(BroadcastChannel broadcastChannel) {
		if(broadcastChannelList == null) {
			broadcastChannelList = new ArrayList<>();
		}
		if(broadcastChannelList.size() == 0) {
			broadcastChannelList.add(broadcastChannel);
		} else {
			broadcastChannelList.set(0, broadcastChannel);
		}
	}

	@Override
	public List<BroadcastChannel> getBroadcastChannelList() {
		return broadcastChannelList;
	}

	@Override
	public void setBroadcastChannelList(List<BroadcastChannel> broadcastChannelList) {
		this.broadcastChannelList = broadcastChannelList;
	}

	@Override
	public boolean hasBroadcastChannel() {
		return broadcastChannelList != null && broadcastChannelList.size() > 0 && broadcastChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(BroadcastEvent broadcastEvent) {
		broadcastEventList = new ArrayList<BroadcastEvent>();
		broadcastEventList.add(broadcastEvent);
	}

	@Override
	public BroadcastEvent getBroadcastEvent() {
		if(broadcastEventList != null && broadcastEventList.size() > 0) {
			return broadcastEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastEvent(BroadcastEvent broadcastEvent) {
		if(broadcastEventList == null) {
			broadcastEventList = new ArrayList<>();
		}
		if(broadcastEventList.size() == 0) {
			broadcastEventList.add(broadcastEvent);
		} else {
			broadcastEventList.set(0, broadcastEvent);
		}
	}

	@Override
	public List<BroadcastEvent> getBroadcastEventList() {
		return broadcastEventList;
	}

	@Override
	public void setBroadcastEventList(List<BroadcastEvent> broadcastEventList) {
		this.broadcastEventList = broadcastEventList;
	}

	@Override
	public boolean hasBroadcastEvent() {
		return broadcastEventList != null && broadcastEventList.size() > 0 && broadcastEventList.get(0) != null;
	}

	public ITEM_REVIEWED(BroadcastFrequencySpecification broadcastFrequencySpecification) {
		broadcastFrequencySpecificationList = new ArrayList<BroadcastFrequencySpecification>();
		broadcastFrequencySpecificationList.add(broadcastFrequencySpecification);
	}

	@Override
	public BroadcastFrequencySpecification getBroadcastFrequencySpecification() {
		if(broadcastFrequencySpecificationList != null && broadcastFrequencySpecificationList.size() > 0) {
			return broadcastFrequencySpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastFrequencySpecification(BroadcastFrequencySpecification broadcastFrequencySpecification) {
		if(broadcastFrequencySpecificationList == null) {
			broadcastFrequencySpecificationList = new ArrayList<>();
		}
		if(broadcastFrequencySpecificationList.size() == 0) {
			broadcastFrequencySpecificationList.add(broadcastFrequencySpecification);
		} else {
			broadcastFrequencySpecificationList.set(0, broadcastFrequencySpecification);
		}
	}

	@Override
	public List<BroadcastFrequencySpecification> getBroadcastFrequencySpecificationList() {
		return broadcastFrequencySpecificationList;
	}

	@Override
	public void setBroadcastFrequencySpecificationList(List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList) {
		this.broadcastFrequencySpecificationList = broadcastFrequencySpecificationList;
	}

	@Override
	public boolean hasBroadcastFrequencySpecification() {
		return broadcastFrequencySpecificationList != null && broadcastFrequencySpecificationList.size() > 0 && broadcastFrequencySpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(BroadcastService broadcastService) {
		broadcastServiceList = new ArrayList<BroadcastService>();
		broadcastServiceList.add(broadcastService);
	}

	@Override
	public BroadcastService getBroadcastService() {
		if(broadcastServiceList != null && broadcastServiceList.size() > 0) {
			return broadcastServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastService(BroadcastService broadcastService) {
		if(broadcastServiceList == null) {
			broadcastServiceList = new ArrayList<>();
		}
		if(broadcastServiceList.size() == 0) {
			broadcastServiceList.add(broadcastService);
		} else {
			broadcastServiceList.set(0, broadcastService);
		}
	}

	@Override
	public List<BroadcastService> getBroadcastServiceList() {
		return broadcastServiceList;
	}

	@Override
	public void setBroadcastServiceList(List<BroadcastService> broadcastServiceList) {
		this.broadcastServiceList = broadcastServiceList;
	}

	@Override
	public boolean hasBroadcastService() {
		return broadcastServiceList != null && broadcastServiceList.size() > 0 && broadcastServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(BrokerageAccount brokerageAccount) {
		brokerageAccountList = new ArrayList<BrokerageAccount>();
		brokerageAccountList.add(brokerageAccount);
	}

	@Override
	public BrokerageAccount getBrokerageAccount() {
		if(brokerageAccountList != null && brokerageAccountList.size() > 0) {
			return brokerageAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrokerageAccount(BrokerageAccount brokerageAccount) {
		if(brokerageAccountList == null) {
			brokerageAccountList = new ArrayList<>();
		}
		if(brokerageAccountList.size() == 0) {
			brokerageAccountList.add(brokerageAccount);
		} else {
			brokerageAccountList.set(0, brokerageAccount);
		}
	}

	@Override
	public List<BrokerageAccount> getBrokerageAccountList() {
		return brokerageAccountList;
	}

	@Override
	public void setBrokerageAccountList(List<BrokerageAccount> brokerageAccountList) {
		this.brokerageAccountList = brokerageAccountList;
	}

	@Override
	public boolean hasBrokerageAccount() {
		return brokerageAccountList != null && brokerageAccountList.size() > 0 && brokerageAccountList.get(0) != null;
	}

	public ITEM_REVIEWED(BuddhistTemple buddhistTemple) {
		buddhistTempleList = new ArrayList<BuddhistTemple>();
		buddhistTempleList.add(buddhistTemple);
	}

	@Override
	public BuddhistTemple getBuddhistTemple() {
		if(buddhistTempleList != null && buddhistTempleList.size() > 0) {
			return buddhistTempleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBuddhistTemple(BuddhistTemple buddhistTemple) {
		if(buddhistTempleList == null) {
			buddhistTempleList = new ArrayList<>();
		}
		if(buddhistTempleList.size() == 0) {
			buddhistTempleList.add(buddhistTemple);
		} else {
			buddhistTempleList.set(0, buddhistTemple);
		}
	}

	@Override
	public List<BuddhistTemple> getBuddhistTempleList() {
		return buddhistTempleList;
	}

	@Override
	public void setBuddhistTempleList(List<BuddhistTemple> buddhistTempleList) {
		this.buddhistTempleList = buddhistTempleList;
	}

	@Override
	public boolean hasBuddhistTemple() {
		return buddhistTempleList != null && buddhistTempleList.size() > 0 && buddhistTempleList.get(0) != null;
	}

	public ITEM_REVIEWED(BusOrCoach busOrCoach) {
		busOrCoachList = new ArrayList<BusOrCoach>();
		busOrCoachList.add(busOrCoach);
	}

	@Override
	public BusOrCoach getBusOrCoach() {
		if(busOrCoachList != null && busOrCoachList.size() > 0) {
			return busOrCoachList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusOrCoach(BusOrCoach busOrCoach) {
		if(busOrCoachList == null) {
			busOrCoachList = new ArrayList<>();
		}
		if(busOrCoachList.size() == 0) {
			busOrCoachList.add(busOrCoach);
		} else {
			busOrCoachList.set(0, busOrCoach);
		}
	}

	@Override
	public List<BusOrCoach> getBusOrCoachList() {
		return busOrCoachList;
	}

	@Override
	public void setBusOrCoachList(List<BusOrCoach> busOrCoachList) {
		this.busOrCoachList = busOrCoachList;
	}

	@Override
	public boolean hasBusOrCoach() {
		return busOrCoachList != null && busOrCoachList.size() > 0 && busOrCoachList.get(0) != null;
	}

	public ITEM_REVIEWED(BusReservation busReservation) {
		busReservationList = new ArrayList<BusReservation>();
		busReservationList.add(busReservation);
	}

	@Override
	public BusReservation getBusReservation() {
		if(busReservationList != null && busReservationList.size() > 0) {
			return busReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusReservation(BusReservation busReservation) {
		if(busReservationList == null) {
			busReservationList = new ArrayList<>();
		}
		if(busReservationList.size() == 0) {
			busReservationList.add(busReservation);
		} else {
			busReservationList.set(0, busReservation);
		}
	}

	@Override
	public List<BusReservation> getBusReservationList() {
		return busReservationList;
	}

	@Override
	public void setBusReservationList(List<BusReservation> busReservationList) {
		this.busReservationList = busReservationList;
	}

	@Override
	public boolean hasBusReservation() {
		return busReservationList != null && busReservationList.size() > 0 && busReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(BusStation busStation) {
		busStationList = new ArrayList<BusStation>();
		busStationList.add(busStation);
	}

	@Override
	public BusStation getBusStation() {
		if(busStationList != null && busStationList.size() > 0) {
			return busStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusStation(BusStation busStation) {
		if(busStationList == null) {
			busStationList = new ArrayList<>();
		}
		if(busStationList.size() == 0) {
			busStationList.add(busStation);
		} else {
			busStationList.set(0, busStation);
		}
	}

	@Override
	public List<BusStation> getBusStationList() {
		return busStationList;
	}

	@Override
	public void setBusStationList(List<BusStation> busStationList) {
		this.busStationList = busStationList;
	}

	@Override
	public boolean hasBusStation() {
		return busStationList != null && busStationList.size() > 0 && busStationList.get(0) != null;
	}

	public ITEM_REVIEWED(BusStop busStop) {
		busStopList = new ArrayList<BusStop>();
		busStopList.add(busStop);
	}

	@Override
	public BusStop getBusStop() {
		if(busStopList != null && busStopList.size() > 0) {
			return busStopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusStop(BusStop busStop) {
		if(busStopList == null) {
			busStopList = new ArrayList<>();
		}
		if(busStopList.size() == 0) {
			busStopList.add(busStop);
		} else {
			busStopList.set(0, busStop);
		}
	}

	@Override
	public List<BusStop> getBusStopList() {
		return busStopList;
	}

	@Override
	public void setBusStopList(List<BusStop> busStopList) {
		this.busStopList = busStopList;
	}

	@Override
	public boolean hasBusStop() {
		return busStopList != null && busStopList.size() > 0 && busStopList.get(0) != null;
	}

	public ITEM_REVIEWED(BusTrip busTrip) {
		busTripList = new ArrayList<BusTrip>();
		busTripList.add(busTrip);
	}

	@Override
	public BusTrip getBusTrip() {
		if(busTripList != null && busTripList.size() > 0) {
			return busTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusTrip(BusTrip busTrip) {
		if(busTripList == null) {
			busTripList = new ArrayList<>();
		}
		if(busTripList.size() == 0) {
			busTripList.add(busTrip);
		} else {
			busTripList.set(0, busTrip);
		}
	}

	@Override
	public List<BusTrip> getBusTripList() {
		return busTripList;
	}

	@Override
	public void setBusTripList(List<BusTrip> busTripList) {
		this.busTripList = busTripList;
	}

	@Override
	public boolean hasBusTrip() {
		return busTripList != null && busTripList.size() > 0 && busTripList.get(0) != null;
	}

	public ITEM_REVIEWED(BusinessAudience businessAudience) {
		businessAudienceList = new ArrayList<BusinessAudience>();
		businessAudienceList.add(businessAudience);
	}

	@Override
	public BusinessAudience getBusinessAudience() {
		if(businessAudienceList != null && businessAudienceList.size() > 0) {
			return businessAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessAudience(BusinessAudience businessAudience) {
		if(businessAudienceList == null) {
			businessAudienceList = new ArrayList<>();
		}
		if(businessAudienceList.size() == 0) {
			businessAudienceList.add(businessAudience);
		} else {
			businessAudienceList.set(0, businessAudience);
		}
	}

	@Override
	public List<BusinessAudience> getBusinessAudienceList() {
		return businessAudienceList;
	}

	@Override
	public void setBusinessAudienceList(List<BusinessAudience> businessAudienceList) {
		this.businessAudienceList = businessAudienceList;
	}

	@Override
	public boolean hasBusinessAudience() {
		return businessAudienceList != null && businessAudienceList.size() > 0 && businessAudienceList.get(0) != null;
	}

	public ITEM_REVIEWED(BusinessEntityType businessEntityType) {
		businessEntityTypeList = new ArrayList<BusinessEntityType>();
		businessEntityTypeList.add(businessEntityType);
	}

	@Override
	public BusinessEntityType getBusinessEntityType() {
		if(businessEntityTypeList != null && businessEntityTypeList.size() > 0) {
			return businessEntityTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessEntityType(BusinessEntityType businessEntityType) {
		if(businessEntityTypeList == null) {
			businessEntityTypeList = new ArrayList<>();
		}
		if(businessEntityTypeList.size() == 0) {
			businessEntityTypeList.add(businessEntityType);
		} else {
			businessEntityTypeList.set(0, businessEntityType);
		}
	}

	@Override
	public List<BusinessEntityType> getBusinessEntityTypeList() {
		return businessEntityTypeList;
	}

	@Override
	public void setBusinessEntityTypeList(List<BusinessEntityType> businessEntityTypeList) {
		this.businessEntityTypeList = businessEntityTypeList;
	}

	@Override
	public boolean hasBusinessEntityType() {
		return businessEntityTypeList != null && businessEntityTypeList.size() > 0 && businessEntityTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(BusinessEvent businessEvent) {
		businessEventList = new ArrayList<BusinessEvent>();
		businessEventList.add(businessEvent);
	}

	@Override
	public BusinessEvent getBusinessEvent() {
		if(businessEventList != null && businessEventList.size() > 0) {
			return businessEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessEvent(BusinessEvent businessEvent) {
		if(businessEventList == null) {
			businessEventList = new ArrayList<>();
		}
		if(businessEventList.size() == 0) {
			businessEventList.add(businessEvent);
		} else {
			businessEventList.set(0, businessEvent);
		}
	}

	@Override
	public List<BusinessEvent> getBusinessEventList() {
		return businessEventList;
	}

	@Override
	public void setBusinessEventList(List<BusinessEvent> businessEventList) {
		this.businessEventList = businessEventList;
	}

	@Override
	public boolean hasBusinessEvent() {
		return businessEventList != null && businessEventList.size() > 0 && businessEventList.get(0) != null;
	}

	public ITEM_REVIEWED(BusinessFunction businessFunction) {
		businessFunctionList = new ArrayList<BusinessFunction>();
		businessFunctionList.add(businessFunction);
	}

	@Override
	public BusinessFunction getBusinessFunction() {
		if(businessFunctionList != null && businessFunctionList.size() > 0) {
			return businessFunctionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessFunction(BusinessFunction businessFunction) {
		if(businessFunctionList == null) {
			businessFunctionList = new ArrayList<>();
		}
		if(businessFunctionList.size() == 0) {
			businessFunctionList.add(businessFunction);
		} else {
			businessFunctionList.set(0, businessFunction);
		}
	}

	@Override
	public List<BusinessFunction> getBusinessFunctionList() {
		return businessFunctionList;
	}

	@Override
	public void setBusinessFunctionList(List<BusinessFunction> businessFunctionList) {
		this.businessFunctionList = businessFunctionList;
	}

	@Override
	public boolean hasBusinessFunction() {
		return businessFunctionList != null && businessFunctionList.size() > 0 && businessFunctionList.get(0) != null;
	}

	public ITEM_REVIEWED(BuyAction buyAction) {
		buyActionList = new ArrayList<BuyAction>();
		buyActionList.add(buyAction);
	}

	@Override
	public BuyAction getBuyAction() {
		if(buyActionList != null && buyActionList.size() > 0) {
			return buyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBuyAction(BuyAction buyAction) {
		if(buyActionList == null) {
			buyActionList = new ArrayList<>();
		}
		if(buyActionList.size() == 0) {
			buyActionList.add(buyAction);
		} else {
			buyActionList.set(0, buyAction);
		}
	}

	@Override
	public List<BuyAction> getBuyActionList() {
		return buyActionList;
	}

	@Override
	public void setBuyActionList(List<BuyAction> buyActionList) {
		this.buyActionList = buyActionList;
	}

	@Override
	public boolean hasBuyAction() {
		return buyActionList != null && buyActionList.size() > 0 && buyActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CableOrSatelliteService cableOrSatelliteService) {
		cableOrSatelliteServiceList = new ArrayList<CableOrSatelliteService>();
		cableOrSatelliteServiceList.add(cableOrSatelliteService);
	}

	@Override
	public CableOrSatelliteService getCableOrSatelliteService() {
		if(cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0) {
			return cableOrSatelliteServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCableOrSatelliteService(CableOrSatelliteService cableOrSatelliteService) {
		if(cableOrSatelliteServiceList == null) {
			cableOrSatelliteServiceList = new ArrayList<>();
		}
		if(cableOrSatelliteServiceList.size() == 0) {
			cableOrSatelliteServiceList.add(cableOrSatelliteService);
		} else {
			cableOrSatelliteServiceList.set(0, cableOrSatelliteService);
		}
	}

	@Override
	public List<CableOrSatelliteService> getCableOrSatelliteServiceList() {
		return cableOrSatelliteServiceList;
	}

	@Override
	public void setCableOrSatelliteServiceList(List<CableOrSatelliteService> cableOrSatelliteServiceList) {
		this.cableOrSatelliteServiceList = cableOrSatelliteServiceList;
	}

	@Override
	public boolean hasCableOrSatelliteService() {
		return cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0 && cableOrSatelliteServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(CafeOrCoffeeShop cafeOrCoffeeShop) {
		cafeOrCoffeeShopList = new ArrayList<CafeOrCoffeeShop>();
		cafeOrCoffeeShopList.add(cafeOrCoffeeShop);
	}

	@Override
	public CafeOrCoffeeShop getCafeOrCoffeeShop() {
		if(cafeOrCoffeeShopList != null && cafeOrCoffeeShopList.size() > 0) {
			return cafeOrCoffeeShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCafeOrCoffeeShop(CafeOrCoffeeShop cafeOrCoffeeShop) {
		if(cafeOrCoffeeShopList == null) {
			cafeOrCoffeeShopList = new ArrayList<>();
		}
		if(cafeOrCoffeeShopList.size() == 0) {
			cafeOrCoffeeShopList.add(cafeOrCoffeeShop);
		} else {
			cafeOrCoffeeShopList.set(0, cafeOrCoffeeShop);
		}
	}

	@Override
	public List<CafeOrCoffeeShop> getCafeOrCoffeeShopList() {
		return cafeOrCoffeeShopList;
	}

	@Override
	public void setCafeOrCoffeeShopList(List<CafeOrCoffeeShop> cafeOrCoffeeShopList) {
		this.cafeOrCoffeeShopList = cafeOrCoffeeShopList;
	}

	@Override
	public boolean hasCafeOrCoffeeShop() {
		return cafeOrCoffeeShopList != null && cafeOrCoffeeShopList.size() > 0 && cafeOrCoffeeShopList.get(0) != null;
	}

	public ITEM_REVIEWED(Campground campground) {
		campgroundList = new ArrayList<Campground>();
		campgroundList.add(campground);
	}

	@Override
	public Campground getCampground() {
		if(campgroundList != null && campgroundList.size() > 0) {
			return campgroundList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCampground(Campground campground) {
		if(campgroundList == null) {
			campgroundList = new ArrayList<>();
		}
		if(campgroundList.size() == 0) {
			campgroundList.add(campground);
		} else {
			campgroundList.set(0, campground);
		}
	}

	@Override
	public List<Campground> getCampgroundList() {
		return campgroundList;
	}

	@Override
	public void setCampgroundList(List<Campground> campgroundList) {
		this.campgroundList = campgroundList;
	}

	@Override
	public boolean hasCampground() {
		return campgroundList != null && campgroundList.size() > 0 && campgroundList.get(0) != null;
	}

	public ITEM_REVIEWED(CampingPitch campingPitch) {
		campingPitchList = new ArrayList<CampingPitch>();
		campingPitchList.add(campingPitch);
	}

	@Override
	public CampingPitch getCampingPitch() {
		if(campingPitchList != null && campingPitchList.size() > 0) {
			return campingPitchList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCampingPitch(CampingPitch campingPitch) {
		if(campingPitchList == null) {
			campingPitchList = new ArrayList<>();
		}
		if(campingPitchList.size() == 0) {
			campingPitchList.add(campingPitch);
		} else {
			campingPitchList.set(0, campingPitch);
		}
	}

	@Override
	public List<CampingPitch> getCampingPitchList() {
		return campingPitchList;
	}

	@Override
	public void setCampingPitchList(List<CampingPitch> campingPitchList) {
		this.campingPitchList = campingPitchList;
	}

	@Override
	public boolean hasCampingPitch() {
		return campingPitchList != null && campingPitchList.size() > 0 && campingPitchList.get(0) != null;
	}

	public ITEM_REVIEWED(Canal canal) {
		canalList = new ArrayList<Canal>();
		canalList.add(canal);
	}

	@Override
	public Canal getCanal() {
		if(canalList != null && canalList.size() > 0) {
			return canalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCanal(Canal canal) {
		if(canalList == null) {
			canalList = new ArrayList<>();
		}
		if(canalList.size() == 0) {
			canalList.add(canal);
		} else {
			canalList.set(0, canal);
		}
	}

	@Override
	public List<Canal> getCanalList() {
		return canalList;
	}

	@Override
	public void setCanalList(List<Canal> canalList) {
		this.canalList = canalList;
	}

	@Override
	public boolean hasCanal() {
		return canalList != null && canalList.size() > 0 && canalList.get(0) != null;
	}

	public ITEM_REVIEWED(CancelAction cancelAction) {
		cancelActionList = new ArrayList<CancelAction>();
		cancelActionList.add(cancelAction);
	}

	@Override
	public CancelAction getCancelAction() {
		if(cancelActionList != null && cancelActionList.size() > 0) {
			return cancelActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCancelAction(CancelAction cancelAction) {
		if(cancelActionList == null) {
			cancelActionList = new ArrayList<>();
		}
		if(cancelActionList.size() == 0) {
			cancelActionList.add(cancelAction);
		} else {
			cancelActionList.set(0, cancelAction);
		}
	}

	@Override
	public List<CancelAction> getCancelActionList() {
		return cancelActionList;
	}

	@Override
	public void setCancelActionList(List<CancelAction> cancelActionList) {
		this.cancelActionList = cancelActionList;
	}

	@Override
	public boolean hasCancelAction() {
		return cancelActionList != null && cancelActionList.size() > 0 && cancelActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Car car) {
		carList = new ArrayList<Car>();
		carList.add(car);
	}

	@Override
	public Car getCar() {
		if(carList != null && carList.size() > 0) {
			return carList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCar(Car car) {
		if(carList == null) {
			carList = new ArrayList<>();
		}
		if(carList.size() == 0) {
			carList.add(car);
		} else {
			carList.set(0, car);
		}
	}

	@Override
	public List<Car> getCarList() {
		return carList;
	}

	@Override
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	@Override
	public boolean hasCar() {
		return carList != null && carList.size() > 0 && carList.get(0) != null;
	}

	public ITEM_REVIEWED(CarUsageType carUsageType) {
		carUsageTypeList = new ArrayList<CarUsageType>();
		carUsageTypeList.add(carUsageType);
	}

	@Override
	public CarUsageType getCarUsageType() {
		if(carUsageTypeList != null && carUsageTypeList.size() > 0) {
			return carUsageTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCarUsageType(CarUsageType carUsageType) {
		if(carUsageTypeList == null) {
			carUsageTypeList = new ArrayList<>();
		}
		if(carUsageTypeList.size() == 0) {
			carUsageTypeList.add(carUsageType);
		} else {
			carUsageTypeList.set(0, carUsageType);
		}
	}

	@Override
	public List<CarUsageType> getCarUsageTypeList() {
		return carUsageTypeList;
	}

	@Override
	public void setCarUsageTypeList(List<CarUsageType> carUsageTypeList) {
		this.carUsageTypeList = carUsageTypeList;
	}

	@Override
	public boolean hasCarUsageType() {
		return carUsageTypeList != null && carUsageTypeList.size() > 0 && carUsageTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(Casino casino) {
		casinoList = new ArrayList<Casino>();
		casinoList.add(casino);
	}

	@Override
	public Casino getCasino() {
		if(casinoList != null && casinoList.size() > 0) {
			return casinoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCasino(Casino casino) {
		if(casinoList == null) {
			casinoList = new ArrayList<>();
		}
		if(casinoList.size() == 0) {
			casinoList.add(casino);
		} else {
			casinoList.set(0, casino);
		}
	}

	@Override
	public List<Casino> getCasinoList() {
		return casinoList;
	}

	@Override
	public void setCasinoList(List<Casino> casinoList) {
		this.casinoList = casinoList;
	}

	@Override
	public boolean hasCasino() {
		return casinoList != null && casinoList.size() > 0 && casinoList.get(0) != null;
	}

	public ITEM_REVIEWED(CategoryCode categoryCode) {
		categoryCodeList = new ArrayList<CategoryCode>();
		categoryCodeList.add(categoryCode);
	}

	@Override
	public CategoryCode getCategoryCode() {
		if(categoryCodeList != null && categoryCodeList.size() > 0) {
			return categoryCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCategoryCode(CategoryCode categoryCode) {
		if(categoryCodeList == null) {
			categoryCodeList = new ArrayList<>();
		}
		if(categoryCodeList.size() == 0) {
			categoryCodeList.add(categoryCode);
		} else {
			categoryCodeList.set(0, categoryCode);
		}
	}

	@Override
	public List<CategoryCode> getCategoryCodeList() {
		return categoryCodeList;
	}

	@Override
	public void setCategoryCodeList(List<CategoryCode> categoryCodeList) {
		this.categoryCodeList = categoryCodeList;
	}

	@Override
	public boolean hasCategoryCode() {
		return categoryCodeList != null && categoryCodeList.size() > 0 && categoryCodeList.get(0) != null;
	}

	public ITEM_REVIEWED(CategoryCodeSet categoryCodeSet) {
		categoryCodeSetList = new ArrayList<CategoryCodeSet>();
		categoryCodeSetList.add(categoryCodeSet);
	}

	@Override
	public CategoryCodeSet getCategoryCodeSet() {
		if(categoryCodeSetList != null && categoryCodeSetList.size() > 0) {
			return categoryCodeSetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCategoryCodeSet(CategoryCodeSet categoryCodeSet) {
		if(categoryCodeSetList == null) {
			categoryCodeSetList = new ArrayList<>();
		}
		if(categoryCodeSetList.size() == 0) {
			categoryCodeSetList.add(categoryCodeSet);
		} else {
			categoryCodeSetList.set(0, categoryCodeSet);
		}
	}

	@Override
	public List<CategoryCodeSet> getCategoryCodeSetList() {
		return categoryCodeSetList;
	}

	@Override
	public void setCategoryCodeSetList(List<CategoryCodeSet> categoryCodeSetList) {
		this.categoryCodeSetList = categoryCodeSetList;
	}

	@Override
	public boolean hasCategoryCodeSet() {
		return categoryCodeSetList != null && categoryCodeSetList.size() > 0 && categoryCodeSetList.get(0) != null;
	}

	public ITEM_REVIEWED(CatholicChurch catholicChurch) {
		catholicChurchList = new ArrayList<CatholicChurch>();
		catholicChurchList.add(catholicChurch);
	}

	@Override
	public CatholicChurch getCatholicChurch() {
		if(catholicChurchList != null && catholicChurchList.size() > 0) {
			return catholicChurchList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCatholicChurch(CatholicChurch catholicChurch) {
		if(catholicChurchList == null) {
			catholicChurchList = new ArrayList<>();
		}
		if(catholicChurchList.size() == 0) {
			catholicChurchList.add(catholicChurch);
		} else {
			catholicChurchList.set(0, catholicChurch);
		}
	}

	@Override
	public List<CatholicChurch> getCatholicChurchList() {
		return catholicChurchList;
	}

	@Override
	public void setCatholicChurchList(List<CatholicChurch> catholicChurchList) {
		this.catholicChurchList = catholicChurchList;
	}

	@Override
	public boolean hasCatholicChurch() {
		return catholicChurchList != null && catholicChurchList.size() > 0 && catholicChurchList.get(0) != null;
	}

	public ITEM_REVIEWED(Cemetery cemetery) {
		cemeteryList = new ArrayList<Cemetery>();
		cemeteryList.add(cemetery);
	}

	@Override
	public Cemetery getCemetery() {
		if(cemeteryList != null && cemeteryList.size() > 0) {
			return cemeteryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCemetery(Cemetery cemetery) {
		if(cemeteryList == null) {
			cemeteryList = new ArrayList<>();
		}
		if(cemeteryList.size() == 0) {
			cemeteryList.add(cemetery);
		} else {
			cemeteryList.set(0, cemetery);
		}
	}

	@Override
	public List<Cemetery> getCemeteryList() {
		return cemeteryList;
	}

	@Override
	public void setCemeteryList(List<Cemetery> cemeteryList) {
		this.cemeteryList = cemeteryList;
	}

	@Override
	public boolean hasCemetery() {
		return cemeteryList != null && cemeteryList.size() > 0 && cemeteryList.get(0) != null;
	}

	public ITEM_REVIEWED(Chapter chapter) {
		chapterList = new ArrayList<Chapter>();
		chapterList.add(chapter);
	}

	@Override
	public Chapter getChapter() {
		if(chapterList != null && chapterList.size() > 0) {
			return chapterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChapter(Chapter chapter) {
		if(chapterList == null) {
			chapterList = new ArrayList<>();
		}
		if(chapterList.size() == 0) {
			chapterList.add(chapter);
		} else {
			chapterList.set(0, chapter);
		}
	}

	@Override
	public List<Chapter> getChapterList() {
		return chapterList;
	}

	@Override
	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}

	@Override
	public boolean hasChapter() {
		return chapterList != null && chapterList.size() > 0 && chapterList.get(0) != null;
	}

	public ITEM_REVIEWED(CheckAction checkAction) {
		checkActionList = new ArrayList<CheckAction>();
		checkActionList.add(checkAction);
	}

	@Override
	public CheckAction getCheckAction() {
		if(checkActionList != null && checkActionList.size() > 0) {
			return checkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckAction(CheckAction checkAction) {
		if(checkActionList == null) {
			checkActionList = new ArrayList<>();
		}
		if(checkActionList.size() == 0) {
			checkActionList.add(checkAction);
		} else {
			checkActionList.set(0, checkAction);
		}
	}

	@Override
	public List<CheckAction> getCheckActionList() {
		return checkActionList;
	}

	@Override
	public void setCheckActionList(List<CheckAction> checkActionList) {
		this.checkActionList = checkActionList;
	}

	@Override
	public boolean hasCheckAction() {
		return checkActionList != null && checkActionList.size() > 0 && checkActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CheckInAction checkInAction) {
		checkInActionList = new ArrayList<CheckInAction>();
		checkInActionList.add(checkInAction);
	}

	@Override
	public CheckInAction getCheckInAction() {
		if(checkInActionList != null && checkInActionList.size() > 0) {
			return checkInActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckInAction(CheckInAction checkInAction) {
		if(checkInActionList == null) {
			checkInActionList = new ArrayList<>();
		}
		if(checkInActionList.size() == 0) {
			checkInActionList.add(checkInAction);
		} else {
			checkInActionList.set(0, checkInAction);
		}
	}

	@Override
	public List<CheckInAction> getCheckInActionList() {
		return checkInActionList;
	}

	@Override
	public void setCheckInActionList(List<CheckInAction> checkInActionList) {
		this.checkInActionList = checkInActionList;
	}

	@Override
	public boolean hasCheckInAction() {
		return checkInActionList != null && checkInActionList.size() > 0 && checkInActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CheckOutAction checkOutAction) {
		checkOutActionList = new ArrayList<CheckOutAction>();
		checkOutActionList.add(checkOutAction);
	}

	@Override
	public CheckOutAction getCheckOutAction() {
		if(checkOutActionList != null && checkOutActionList.size() > 0) {
			return checkOutActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckOutAction(CheckOutAction checkOutAction) {
		if(checkOutActionList == null) {
			checkOutActionList = new ArrayList<>();
		}
		if(checkOutActionList.size() == 0) {
			checkOutActionList.add(checkOutAction);
		} else {
			checkOutActionList.set(0, checkOutAction);
		}
	}

	@Override
	public List<CheckOutAction> getCheckOutActionList() {
		return checkOutActionList;
	}

	@Override
	public void setCheckOutActionList(List<CheckOutAction> checkOutActionList) {
		this.checkOutActionList = checkOutActionList;
	}

	@Override
	public boolean hasCheckOutAction() {
		return checkOutActionList != null && checkOutActionList.size() > 0 && checkOutActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CheckoutPage checkoutPage) {
		checkoutPageList = new ArrayList<CheckoutPage>();
		checkoutPageList.add(checkoutPage);
	}

	@Override
	public CheckoutPage getCheckoutPage() {
		if(checkoutPageList != null && checkoutPageList.size() > 0) {
			return checkoutPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckoutPage(CheckoutPage checkoutPage) {
		if(checkoutPageList == null) {
			checkoutPageList = new ArrayList<>();
		}
		if(checkoutPageList.size() == 0) {
			checkoutPageList.add(checkoutPage);
		} else {
			checkoutPageList.set(0, checkoutPage);
		}
	}

	@Override
	public List<CheckoutPage> getCheckoutPageList() {
		return checkoutPageList;
	}

	@Override
	public void setCheckoutPageList(List<CheckoutPage> checkoutPageList) {
		this.checkoutPageList = checkoutPageList;
	}

	@Override
	public boolean hasCheckoutPage() {
		return checkoutPageList != null && checkoutPageList.size() > 0 && checkoutPageList.get(0) != null;
	}

	public ITEM_REVIEWED(ChildCare childCare) {
		childCareList = new ArrayList<ChildCare>();
		childCareList.add(childCare);
	}

	@Override
	public ChildCare getChildCare() {
		if(childCareList != null && childCareList.size() > 0) {
			return childCareList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChildCare(ChildCare childCare) {
		if(childCareList == null) {
			childCareList = new ArrayList<>();
		}
		if(childCareList.size() == 0) {
			childCareList.add(childCare);
		} else {
			childCareList.set(0, childCare);
		}
	}

	@Override
	public List<ChildCare> getChildCareList() {
		return childCareList;
	}

	@Override
	public void setChildCareList(List<ChildCare> childCareList) {
		this.childCareList = childCareList;
	}

	@Override
	public boolean hasChildCare() {
		return childCareList != null && childCareList.size() > 0 && childCareList.get(0) != null;
	}

	public ITEM_REVIEWED(ChildrensEvent childrensEvent) {
		childrensEventList = new ArrayList<ChildrensEvent>();
		childrensEventList.add(childrensEvent);
	}

	@Override
	public ChildrensEvent getChildrensEvent() {
		if(childrensEventList != null && childrensEventList.size() > 0) {
			return childrensEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChildrensEvent(ChildrensEvent childrensEvent) {
		if(childrensEventList == null) {
			childrensEventList = new ArrayList<>();
		}
		if(childrensEventList.size() == 0) {
			childrensEventList.add(childrensEvent);
		} else {
			childrensEventList.set(0, childrensEvent);
		}
	}

	@Override
	public List<ChildrensEvent> getChildrensEventList() {
		return childrensEventList;
	}

	@Override
	public void setChildrensEventList(List<ChildrensEvent> childrensEventList) {
		this.childrensEventList = childrensEventList;
	}

	@Override
	public boolean hasChildrensEvent() {
		return childrensEventList != null && childrensEventList.size() > 0 && childrensEventList.get(0) != null;
	}

	public ITEM_REVIEWED(ChooseAction chooseAction) {
		chooseActionList = new ArrayList<ChooseAction>();
		chooseActionList.add(chooseAction);
	}

	@Override
	public ChooseAction getChooseAction() {
		if(chooseActionList != null && chooseActionList.size() > 0) {
			return chooseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChooseAction(ChooseAction chooseAction) {
		if(chooseActionList == null) {
			chooseActionList = new ArrayList<>();
		}
		if(chooseActionList.size() == 0) {
			chooseActionList.add(chooseAction);
		} else {
			chooseActionList.set(0, chooseAction);
		}
	}

	@Override
	public List<ChooseAction> getChooseActionList() {
		return chooseActionList;
	}

	@Override
	public void setChooseActionList(List<ChooseAction> chooseActionList) {
		this.chooseActionList = chooseActionList;
	}

	@Override
	public boolean hasChooseAction() {
		return chooseActionList != null && chooseActionList.size() > 0 && chooseActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Church church) {
		churchList = new ArrayList<Church>();
		churchList.add(church);
	}

	@Override
	public Church getChurch() {
		if(churchList != null && churchList.size() > 0) {
			return churchList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChurch(Church church) {
		if(churchList == null) {
			churchList = new ArrayList<>();
		}
		if(churchList.size() == 0) {
			churchList.add(church);
		} else {
			churchList.set(0, church);
		}
	}

	@Override
	public List<Church> getChurchList() {
		return churchList;
	}

	@Override
	public void setChurchList(List<Church> churchList) {
		this.churchList = churchList;
	}

	@Override
	public boolean hasChurch() {
		return churchList != null && churchList.size() > 0 && churchList.get(0) != null;
	}

	public ITEM_REVIEWED(City city) {
		cityList = new ArrayList<City>();
		cityList.add(city);
	}

	@Override
	public City getCity() {
		if(cityList != null && cityList.size() > 0) {
			return cityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCity(City city) {
		if(cityList == null) {
			cityList = new ArrayList<>();
		}
		if(cityList.size() == 0) {
			cityList.add(city);
		} else {
			cityList.set(0, city);
		}
	}

	@Override
	public List<City> getCityList() {
		return cityList;
	}

	@Override
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	@Override
	public boolean hasCity() {
		return cityList != null && cityList.size() > 0 && cityList.get(0) != null;
	}

	public ITEM_REVIEWED(CityHall cityHall) {
		cityHallList = new ArrayList<CityHall>();
		cityHallList.add(cityHall);
	}

	@Override
	public CityHall getCityHall() {
		if(cityHallList != null && cityHallList.size() > 0) {
			return cityHallList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCityHall(CityHall cityHall) {
		if(cityHallList == null) {
			cityHallList = new ArrayList<>();
		}
		if(cityHallList.size() == 0) {
			cityHallList.add(cityHall);
		} else {
			cityHallList.set(0, cityHall);
		}
	}

	@Override
	public List<CityHall> getCityHallList() {
		return cityHallList;
	}

	@Override
	public void setCityHallList(List<CityHall> cityHallList) {
		this.cityHallList = cityHallList;
	}

	@Override
	public boolean hasCityHall() {
		return cityHallList != null && cityHallList.size() > 0 && cityHallList.get(0) != null;
	}

	public ITEM_REVIEWED(CivicStructure civicStructure) {
		civicStructureList = new ArrayList<CivicStructure>();
		civicStructureList.add(civicStructure);
	}

	@Override
	public CivicStructure getCivicStructure() {
		if(civicStructureList != null && civicStructureList.size() > 0) {
			return civicStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCivicStructure(CivicStructure civicStructure) {
		if(civicStructureList == null) {
			civicStructureList = new ArrayList<>();
		}
		if(civicStructureList.size() == 0) {
			civicStructureList.add(civicStructure);
		} else {
			civicStructureList.set(0, civicStructure);
		}
	}

	@Override
	public List<CivicStructure> getCivicStructureList() {
		return civicStructureList;
	}

	@Override
	public void setCivicStructureList(List<CivicStructure> civicStructureList) {
		this.civicStructureList = civicStructureList;
	}

	@Override
	public boolean hasCivicStructure() {
		return civicStructureList != null && civicStructureList.size() > 0 && civicStructureList.get(0) != null;
	}

	public ITEM_REVIEWED(Claim claim) {
		claimList = new ArrayList<Claim>();
		claimList.add(claim);
	}

	@Override
	public Claim getClaim() {
		if(claimList != null && claimList.size() > 0) {
			return claimList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClaim(Claim claim) {
		if(claimList == null) {
			claimList = new ArrayList<>();
		}
		if(claimList.size() == 0) {
			claimList.add(claim);
		} else {
			claimList.set(0, claim);
		}
	}

	@Override
	public List<Claim> getClaimList() {
		return claimList;
	}

	@Override
	public void setClaimList(List<Claim> claimList) {
		this.claimList = claimList;
	}

	@Override
	public boolean hasClaim() {
		return claimList != null && claimList.size() > 0 && claimList.get(0) != null;
	}

	public ITEM_REVIEWED(ClaimReview claimReview) {
		claimReviewList = new ArrayList<ClaimReview>();
		claimReviewList.add(claimReview);
	}

	@Override
	public ClaimReview getClaimReview() {
		if(claimReviewList != null && claimReviewList.size() > 0) {
			return claimReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClaimReview(ClaimReview claimReview) {
		if(claimReviewList == null) {
			claimReviewList = new ArrayList<>();
		}
		if(claimReviewList.size() == 0) {
			claimReviewList.add(claimReview);
		} else {
			claimReviewList.set(0, claimReview);
		}
	}

	@Override
	public List<ClaimReview> getClaimReviewList() {
		return claimReviewList;
	}

	@Override
	public void setClaimReviewList(List<ClaimReview> claimReviewList) {
		this.claimReviewList = claimReviewList;
	}

	@Override
	public boolean hasClaimReview() {
		return claimReviewList != null && claimReviewList.size() > 0 && claimReviewList.get(0) != null;
	}

	public ITEM_REVIEWED(Class clazz) {
		clazzList = new ArrayList<Class>();
		clazzList.add(clazz);
	}

	@Override
	public Class getClazz() {
		if(clazzList != null && clazzList.size() > 0) {
			return clazzList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClazz(Class clazz) {
		if(clazzList == null) {
			clazzList = new ArrayList<>();
		}
		if(clazzList.size() == 0) {
			clazzList.add(clazz);
		} else {
			clazzList.set(0, clazz);
		}
	}

	@Override
	public List<Class> getClazzList() {
		return clazzList;
	}

	@Override
	public void setClazzList(List<Class> clazzList) {
		this.clazzList = clazzList;
	}

	@Override
	public boolean hasClazz() {
		return clazzList != null && clazzList.size() > 0 && clazzList.get(0) != null;
	}

	public ITEM_REVIEWED(Clip clip) {
		clipList = new ArrayList<Clip>();
		clipList.add(clip);
	}

	@Override
	public Clip getClip() {
		if(clipList != null && clipList.size() > 0) {
			return clipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClip(Clip clip) {
		if(clipList == null) {
			clipList = new ArrayList<>();
		}
		if(clipList.size() == 0) {
			clipList.add(clip);
		} else {
			clipList.set(0, clip);
		}
	}

	@Override
	public List<Clip> getClipList() {
		return clipList;
	}

	@Override
	public void setClipList(List<Clip> clipList) {
		this.clipList = clipList;
	}

	@Override
	public boolean hasClip() {
		return clipList != null && clipList.size() > 0 && clipList.get(0) != null;
	}

	public ITEM_REVIEWED(ClothingStore clothingStore) {
		clothingStoreList = new ArrayList<ClothingStore>();
		clothingStoreList.add(clothingStore);
	}

	@Override
	public ClothingStore getClothingStore() {
		if(clothingStoreList != null && clothingStoreList.size() > 0) {
			return clothingStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClothingStore(ClothingStore clothingStore) {
		if(clothingStoreList == null) {
			clothingStoreList = new ArrayList<>();
		}
		if(clothingStoreList.size() == 0) {
			clothingStoreList.add(clothingStore);
		} else {
			clothingStoreList.set(0, clothingStore);
		}
	}

	@Override
	public List<ClothingStore> getClothingStoreList() {
		return clothingStoreList;
	}

	@Override
	public void setClothingStoreList(List<ClothingStore> clothingStoreList) {
		this.clothingStoreList = clothingStoreList;
	}

	@Override
	public boolean hasClothingStore() {
		return clothingStoreList != null && clothingStoreList.size() > 0 && clothingStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Collection collection) {
		collectionList = new ArrayList<Collection>();
		collectionList.add(collection);
	}

	@Override
	public Collection getCollection() {
		if(collectionList != null && collectionList.size() > 0) {
			return collectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCollection(Collection collection) {
		if(collectionList == null) {
			collectionList = new ArrayList<>();
		}
		if(collectionList.size() == 0) {
			collectionList.add(collection);
		} else {
			collectionList.set(0, collection);
		}
	}

	@Override
	public List<Collection> getCollectionList() {
		return collectionList;
	}

	@Override
	public void setCollectionList(List<Collection> collectionList) {
		this.collectionList = collectionList;
	}

	@Override
	public boolean hasCollection() {
		return collectionList != null && collectionList.size() > 0 && collectionList.get(0) != null;
	}

	public ITEM_REVIEWED(CollectionPage collectionPage) {
		collectionPageList = new ArrayList<CollectionPage>();
		collectionPageList.add(collectionPage);
	}

	@Override
	public CollectionPage getCollectionPage() {
		if(collectionPageList != null && collectionPageList.size() > 0) {
			return collectionPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCollectionPage(CollectionPage collectionPage) {
		if(collectionPageList == null) {
			collectionPageList = new ArrayList<>();
		}
		if(collectionPageList.size() == 0) {
			collectionPageList.add(collectionPage);
		} else {
			collectionPageList.set(0, collectionPage);
		}
	}

	@Override
	public List<CollectionPage> getCollectionPageList() {
		return collectionPageList;
	}

	@Override
	public void setCollectionPageList(List<CollectionPage> collectionPageList) {
		this.collectionPageList = collectionPageList;
	}

	@Override
	public boolean hasCollectionPage() {
		return collectionPageList != null && collectionPageList.size() > 0 && collectionPageList.get(0) != null;
	}

	public ITEM_REVIEWED(CollegeOrUniversity collegeOrUniversity) {
		collegeOrUniversityList = new ArrayList<CollegeOrUniversity>();
		collegeOrUniversityList.add(collegeOrUniversity);
	}

	@Override
	public CollegeOrUniversity getCollegeOrUniversity() {
		if(collegeOrUniversityList != null && collegeOrUniversityList.size() > 0) {
			return collegeOrUniversityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCollegeOrUniversity(CollegeOrUniversity collegeOrUniversity) {
		if(collegeOrUniversityList == null) {
			collegeOrUniversityList = new ArrayList<>();
		}
		if(collegeOrUniversityList.size() == 0) {
			collegeOrUniversityList.add(collegeOrUniversity);
		} else {
			collegeOrUniversityList.set(0, collegeOrUniversity);
		}
	}

	@Override
	public List<CollegeOrUniversity> getCollegeOrUniversityList() {
		return collegeOrUniversityList;
	}

	@Override
	public void setCollegeOrUniversityList(List<CollegeOrUniversity> collegeOrUniversityList) {
		this.collegeOrUniversityList = collegeOrUniversityList;
	}

	@Override
	public boolean hasCollegeOrUniversity() {
		return collegeOrUniversityList != null && collegeOrUniversityList.size() > 0 && collegeOrUniversityList.get(0) != null;
	}

	public ITEM_REVIEWED(ComedyClub comedyClub) {
		comedyClubList = new ArrayList<ComedyClub>();
		comedyClubList.add(comedyClub);
	}

	@Override
	public ComedyClub getComedyClub() {
		if(comedyClubList != null && comedyClubList.size() > 0) {
			return comedyClubList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComedyClub(ComedyClub comedyClub) {
		if(comedyClubList == null) {
			comedyClubList = new ArrayList<>();
		}
		if(comedyClubList.size() == 0) {
			comedyClubList.add(comedyClub);
		} else {
			comedyClubList.set(0, comedyClub);
		}
	}

	@Override
	public List<ComedyClub> getComedyClubList() {
		return comedyClubList;
	}

	@Override
	public void setComedyClubList(List<ComedyClub> comedyClubList) {
		this.comedyClubList = comedyClubList;
	}

	@Override
	public boolean hasComedyClub() {
		return comedyClubList != null && comedyClubList.size() > 0 && comedyClubList.get(0) != null;
	}

	public ITEM_REVIEWED(ComedyEvent comedyEvent) {
		comedyEventList = new ArrayList<ComedyEvent>();
		comedyEventList.add(comedyEvent);
	}

	@Override
	public ComedyEvent getComedyEvent() {
		if(comedyEventList != null && comedyEventList.size() > 0) {
			return comedyEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComedyEvent(ComedyEvent comedyEvent) {
		if(comedyEventList == null) {
			comedyEventList = new ArrayList<>();
		}
		if(comedyEventList.size() == 0) {
			comedyEventList.add(comedyEvent);
		} else {
			comedyEventList.set(0, comedyEvent);
		}
	}

	@Override
	public List<ComedyEvent> getComedyEventList() {
		return comedyEventList;
	}

	@Override
	public void setComedyEventList(List<ComedyEvent> comedyEventList) {
		this.comedyEventList = comedyEventList;
	}

	@Override
	public boolean hasComedyEvent() {
		return comedyEventList != null && comedyEventList.size() > 0 && comedyEventList.get(0) != null;
	}

	public ITEM_REVIEWED(ComicCoverArt comicCoverArt) {
		comicCoverArtList = new ArrayList<ComicCoverArt>();
		comicCoverArtList.add(comicCoverArt);
	}

	@Override
	public ComicCoverArt getComicCoverArt() {
		if(comicCoverArtList != null && comicCoverArtList.size() > 0) {
			return comicCoverArtList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicCoverArt(ComicCoverArt comicCoverArt) {
		if(comicCoverArtList == null) {
			comicCoverArtList = new ArrayList<>();
		}
		if(comicCoverArtList.size() == 0) {
			comicCoverArtList.add(comicCoverArt);
		} else {
			comicCoverArtList.set(0, comicCoverArt);
		}
	}

	@Override
	public List<ComicCoverArt> getComicCoverArtList() {
		return comicCoverArtList;
	}

	@Override
	public void setComicCoverArtList(List<ComicCoverArt> comicCoverArtList) {
		this.comicCoverArtList = comicCoverArtList;
	}

	@Override
	public boolean hasComicCoverArt() {
		return comicCoverArtList != null && comicCoverArtList.size() > 0 && comicCoverArtList.get(0) != null;
	}

	public ITEM_REVIEWED(ComicIssue comicIssue) {
		comicIssueList = new ArrayList<ComicIssue>();
		comicIssueList.add(comicIssue);
	}

	@Override
	public ComicIssue getComicIssue() {
		if(comicIssueList != null && comicIssueList.size() > 0) {
			return comicIssueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicIssue(ComicIssue comicIssue) {
		if(comicIssueList == null) {
			comicIssueList = new ArrayList<>();
		}
		if(comicIssueList.size() == 0) {
			comicIssueList.add(comicIssue);
		} else {
			comicIssueList.set(0, comicIssue);
		}
	}

	@Override
	public List<ComicIssue> getComicIssueList() {
		return comicIssueList;
	}

	@Override
	public void setComicIssueList(List<ComicIssue> comicIssueList) {
		this.comicIssueList = comicIssueList;
	}

	@Override
	public boolean hasComicIssue() {
		return comicIssueList != null && comicIssueList.size() > 0 && comicIssueList.get(0) != null;
	}

	public ITEM_REVIEWED(ComicSeries comicSeries) {
		comicSeriesList = new ArrayList<ComicSeries>();
		comicSeriesList.add(comicSeries);
	}

	@Override
	public ComicSeries getComicSeries() {
		if(comicSeriesList != null && comicSeriesList.size() > 0) {
			return comicSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicSeries(ComicSeries comicSeries) {
		if(comicSeriesList == null) {
			comicSeriesList = new ArrayList<>();
		}
		if(comicSeriesList.size() == 0) {
			comicSeriesList.add(comicSeries);
		} else {
			comicSeriesList.set(0, comicSeries);
		}
	}

	@Override
	public List<ComicSeries> getComicSeriesList() {
		return comicSeriesList;
	}

	@Override
	public void setComicSeriesList(List<ComicSeries> comicSeriesList) {
		this.comicSeriesList = comicSeriesList;
	}

	@Override
	public boolean hasComicSeries() {
		return comicSeriesList != null && comicSeriesList.size() > 0 && comicSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(ComicStory comicStory) {
		comicStoryList = new ArrayList<ComicStory>();
		comicStoryList.add(comicStory);
	}

	@Override
	public ComicStory getComicStory() {
		if(comicStoryList != null && comicStoryList.size() > 0) {
			return comicStoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComicStory(ComicStory comicStory) {
		if(comicStoryList == null) {
			comicStoryList = new ArrayList<>();
		}
		if(comicStoryList.size() == 0) {
			comicStoryList.add(comicStory);
		} else {
			comicStoryList.set(0, comicStory);
		}
	}

	@Override
	public List<ComicStory> getComicStoryList() {
		return comicStoryList;
	}

	@Override
	public void setComicStoryList(List<ComicStory> comicStoryList) {
		this.comicStoryList = comicStoryList;
	}

	@Override
	public boolean hasComicStory() {
		return comicStoryList != null && comicStoryList.size() > 0 && comicStoryList.get(0) != null;
	}

	public ITEM_REVIEWED(Comment comment) {
		commentList = new ArrayList<Comment>();
		commentList.add(comment);
	}

	@Override
	public Comment getComment() {
		if(commentList != null && commentList.size() > 0) {
			return commentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComment(Comment comment) {
		if(commentList == null) {
			commentList = new ArrayList<>();
		}
		if(commentList.size() == 0) {
			commentList.add(comment);
		} else {
			commentList.set(0, comment);
		}
	}

	@Override
	public List<Comment> getCommentList() {
		return commentList;
	}

	@Override
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public boolean hasComment() {
		return commentList != null && commentList.size() > 0 && commentList.get(0) != null;
	}

	public ITEM_REVIEWED(CommentAction commentAction) {
		commentActionList = new ArrayList<CommentAction>();
		commentActionList.add(commentAction);
	}

	@Override
	public CommentAction getCommentAction() {
		if(commentActionList != null && commentActionList.size() > 0) {
			return commentActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCommentAction(CommentAction commentAction) {
		if(commentActionList == null) {
			commentActionList = new ArrayList<>();
		}
		if(commentActionList.size() == 0) {
			commentActionList.add(commentAction);
		} else {
			commentActionList.set(0, commentAction);
		}
	}

	@Override
	public List<CommentAction> getCommentActionList() {
		return commentActionList;
	}

	@Override
	public void setCommentActionList(List<CommentAction> commentActionList) {
		this.commentActionList = commentActionList;
	}

	@Override
	public boolean hasCommentAction() {
		return commentActionList != null && commentActionList.size() > 0 && commentActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CommunicateAction communicateAction) {
		communicateActionList = new ArrayList<CommunicateAction>();
		communicateActionList.add(communicateAction);
	}

	@Override
	public CommunicateAction getCommunicateAction() {
		if(communicateActionList != null && communicateActionList.size() > 0) {
			return communicateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCommunicateAction(CommunicateAction communicateAction) {
		if(communicateActionList == null) {
			communicateActionList = new ArrayList<>();
		}
		if(communicateActionList.size() == 0) {
			communicateActionList.add(communicateAction);
		} else {
			communicateActionList.set(0, communicateAction);
		}
	}

	@Override
	public List<CommunicateAction> getCommunicateActionList() {
		return communicateActionList;
	}

	@Override
	public void setCommunicateActionList(List<CommunicateAction> communicateActionList) {
		this.communicateActionList = communicateActionList;
	}

	@Override
	public boolean hasCommunicateAction() {
		return communicateActionList != null && communicateActionList.size() > 0 && communicateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CommunityHealth communityHealth) {
		communityHealthList = new ArrayList<CommunityHealth>();
		communityHealthList.add(communityHealth);
	}

	@Override
	public CommunityHealth getCommunityHealth() {
		if(communityHealthList != null && communityHealthList.size() > 0) {
			return communityHealthList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCommunityHealth(CommunityHealth communityHealth) {
		if(communityHealthList == null) {
			communityHealthList = new ArrayList<>();
		}
		if(communityHealthList.size() == 0) {
			communityHealthList.add(communityHealth);
		} else {
			communityHealthList.set(0, communityHealth);
		}
	}

	@Override
	public List<CommunityHealth> getCommunityHealthList() {
		return communityHealthList;
	}

	@Override
	public void setCommunityHealthList(List<CommunityHealth> communityHealthList) {
		this.communityHealthList = communityHealthList;
	}

	@Override
	public boolean hasCommunityHealth() {
		return communityHealthList != null && communityHealthList.size() > 0 && communityHealthList.get(0) != null;
	}

	public ITEM_REVIEWED(CompleteDataFeed completeDataFeed) {
		completeDataFeedList = new ArrayList<CompleteDataFeed>();
		completeDataFeedList.add(completeDataFeed);
	}

	@Override
	public CompleteDataFeed getCompleteDataFeed() {
		if(completeDataFeedList != null && completeDataFeedList.size() > 0) {
			return completeDataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCompleteDataFeed(CompleteDataFeed completeDataFeed) {
		if(completeDataFeedList == null) {
			completeDataFeedList = new ArrayList<>();
		}
		if(completeDataFeedList.size() == 0) {
			completeDataFeedList.add(completeDataFeed);
		} else {
			completeDataFeedList.set(0, completeDataFeed);
		}
	}

	@Override
	public List<CompleteDataFeed> getCompleteDataFeedList() {
		return completeDataFeedList;
	}

	@Override
	public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList) {
		this.completeDataFeedList = completeDataFeedList;
	}

	@Override
	public boolean hasCompleteDataFeed() {
		return completeDataFeedList != null && completeDataFeedList.size() > 0 && completeDataFeedList.get(0) != null;
	}

	public ITEM_REVIEWED(CompoundPriceSpecification compoundPriceSpecification) {
		compoundPriceSpecificationList = new ArrayList<CompoundPriceSpecification>();
		compoundPriceSpecificationList.add(compoundPriceSpecification);
	}

	@Override
	public CompoundPriceSpecification getCompoundPriceSpecification() {
		if(compoundPriceSpecificationList != null && compoundPriceSpecificationList.size() > 0) {
			return compoundPriceSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCompoundPriceSpecification(CompoundPriceSpecification compoundPriceSpecification) {
		if(compoundPriceSpecificationList == null) {
			compoundPriceSpecificationList = new ArrayList<>();
		}
		if(compoundPriceSpecificationList.size() == 0) {
			compoundPriceSpecificationList.add(compoundPriceSpecification);
		} else {
			compoundPriceSpecificationList.set(0, compoundPriceSpecification);
		}
	}

	@Override
	public List<CompoundPriceSpecification> getCompoundPriceSpecificationList() {
		return compoundPriceSpecificationList;
	}

	@Override
	public void setCompoundPriceSpecificationList(List<CompoundPriceSpecification> compoundPriceSpecificationList) {
		this.compoundPriceSpecificationList = compoundPriceSpecificationList;
	}

	@Override
	public boolean hasCompoundPriceSpecification() {
		return compoundPriceSpecificationList != null && compoundPriceSpecificationList.size() > 0 && compoundPriceSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(ComputerLanguage computerLanguage) {
		computerLanguageList = new ArrayList<ComputerLanguage>();
		computerLanguageList.add(computerLanguage);
	}

	@Override
	public ComputerLanguage getComputerLanguage() {
		if(computerLanguageList != null && computerLanguageList.size() > 0) {
			return computerLanguageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComputerLanguage(ComputerLanguage computerLanguage) {
		if(computerLanguageList == null) {
			computerLanguageList = new ArrayList<>();
		}
		if(computerLanguageList.size() == 0) {
			computerLanguageList.add(computerLanguage);
		} else {
			computerLanguageList.set(0, computerLanguage);
		}
	}

	@Override
	public List<ComputerLanguage> getComputerLanguageList() {
		return computerLanguageList;
	}

	@Override
	public void setComputerLanguageList(List<ComputerLanguage> computerLanguageList) {
		this.computerLanguageList = computerLanguageList;
	}

	@Override
	public boolean hasComputerLanguage() {
		return computerLanguageList != null && computerLanguageList.size() > 0 && computerLanguageList.get(0) != null;
	}

	public ITEM_REVIEWED(ComputerStore computerStore) {
		computerStoreList = new ArrayList<ComputerStore>();
		computerStoreList.add(computerStore);
	}

	@Override
	public ComputerStore getComputerStore() {
		if(computerStoreList != null && computerStoreList.size() > 0) {
			return computerStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComputerStore(ComputerStore computerStore) {
		if(computerStoreList == null) {
			computerStoreList = new ArrayList<>();
		}
		if(computerStoreList.size() == 0) {
			computerStoreList.add(computerStore);
		} else {
			computerStoreList.set(0, computerStore);
		}
	}

	@Override
	public List<ComputerStore> getComputerStoreList() {
		return computerStoreList;
	}

	@Override
	public void setComputerStoreList(List<ComputerStore> computerStoreList) {
		this.computerStoreList = computerStoreList;
	}

	@Override
	public boolean hasComputerStore() {
		return computerStoreList != null && computerStoreList.size() > 0 && computerStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(ConfirmAction confirmAction) {
		confirmActionList = new ArrayList<ConfirmAction>();
		confirmActionList.add(confirmAction);
	}

	@Override
	public ConfirmAction getConfirmAction() {
		if(confirmActionList != null && confirmActionList.size() > 0) {
			return confirmActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConfirmAction(ConfirmAction confirmAction) {
		if(confirmActionList == null) {
			confirmActionList = new ArrayList<>();
		}
		if(confirmActionList.size() == 0) {
			confirmActionList.add(confirmAction);
		} else {
			confirmActionList.set(0, confirmAction);
		}
	}

	@Override
	public List<ConfirmAction> getConfirmActionList() {
		return confirmActionList;
	}

	@Override
	public void setConfirmActionList(List<ConfirmAction> confirmActionList) {
		this.confirmActionList = confirmActionList;
	}

	@Override
	public boolean hasConfirmAction() {
		return confirmActionList != null && confirmActionList.size() > 0 && confirmActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Consortium consortium) {
		consortiumList = new ArrayList<Consortium>();
		consortiumList.add(consortium);
	}

	@Override
	public Consortium getConsortium() {
		if(consortiumList != null && consortiumList.size() > 0) {
			return consortiumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConsortium(Consortium consortium) {
		if(consortiumList == null) {
			consortiumList = new ArrayList<>();
		}
		if(consortiumList.size() == 0) {
			consortiumList.add(consortium);
		} else {
			consortiumList.set(0, consortium);
		}
	}

	@Override
	public List<Consortium> getConsortiumList() {
		return consortiumList;
	}

	@Override
	public void setConsortiumList(List<Consortium> consortiumList) {
		this.consortiumList = consortiumList;
	}

	@Override
	public boolean hasConsortium() {
		return consortiumList != null && consortiumList.size() > 0 && consortiumList.get(0) != null;
	}

	public ITEM_REVIEWED(ConsumeAction consumeAction) {
		consumeActionList = new ArrayList<ConsumeAction>();
		consumeActionList.add(consumeAction);
	}

	@Override
	public ConsumeAction getConsumeAction() {
		if(consumeActionList != null && consumeActionList.size() > 0) {
			return consumeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConsumeAction(ConsumeAction consumeAction) {
		if(consumeActionList == null) {
			consumeActionList = new ArrayList<>();
		}
		if(consumeActionList.size() == 0) {
			consumeActionList.add(consumeAction);
		} else {
			consumeActionList.set(0, consumeAction);
		}
	}

	@Override
	public List<ConsumeAction> getConsumeActionList() {
		return consumeActionList;
	}

	@Override
	public void setConsumeActionList(List<ConsumeAction> consumeActionList) {
		this.consumeActionList = consumeActionList;
	}

	@Override
	public boolean hasConsumeAction() {
		return consumeActionList != null && consumeActionList.size() > 0 && consumeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ContactPage contactPage) {
		contactPageList = new ArrayList<ContactPage>();
		contactPageList.add(contactPage);
	}

	@Override
	public ContactPage getContactPage() {
		if(contactPageList != null && contactPageList.size() > 0) {
			return contactPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPage(ContactPage contactPage) {
		if(contactPageList == null) {
			contactPageList = new ArrayList<>();
		}
		if(contactPageList.size() == 0) {
			contactPageList.add(contactPage);
		} else {
			contactPageList.set(0, contactPage);
		}
	}

	@Override
	public List<ContactPage> getContactPageList() {
		return contactPageList;
	}

	@Override
	public void setContactPageList(List<ContactPage> contactPageList) {
		this.contactPageList = contactPageList;
	}

	@Override
	public boolean hasContactPage() {
		return contactPageList != null && contactPageList.size() > 0 && contactPageList.get(0) != null;
	}

	public ITEM_REVIEWED(ContactPoint contactPoint) {
		contactPointList = new ArrayList<ContactPoint>();
		contactPointList.add(contactPoint);
	}

	@Override
	public ContactPoint getContactPoint() {
		if(contactPointList != null && contactPointList.size() > 0) {
			return contactPointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPoint(ContactPoint contactPoint) {
		if(contactPointList == null) {
			contactPointList = new ArrayList<>();
		}
		if(contactPointList.size() == 0) {
			contactPointList.add(contactPoint);
		} else {
			contactPointList.set(0, contactPoint);
		}
	}

	@Override
	public List<ContactPoint> getContactPointList() {
		return contactPointList;
	}

	@Override
	public void setContactPointList(List<ContactPoint> contactPointList) {
		this.contactPointList = contactPointList;
	}

	@Override
	public boolean hasContactPoint() {
		return contactPointList != null && contactPointList.size() > 0 && contactPointList.get(0) != null;
	}

	public ITEM_REVIEWED(ContactPointOption contactPointOption) {
		contactPointOptionList = new ArrayList<ContactPointOption>();
		contactPointOptionList.add(contactPointOption);
	}

	@Override
	public ContactPointOption getContactPointOption() {
		if(contactPointOptionList != null && contactPointOptionList.size() > 0) {
			return contactPointOptionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPointOption(ContactPointOption contactPointOption) {
		if(contactPointOptionList == null) {
			contactPointOptionList = new ArrayList<>();
		}
		if(contactPointOptionList.size() == 0) {
			contactPointOptionList.add(contactPointOption);
		} else {
			contactPointOptionList.set(0, contactPointOption);
		}
	}

	@Override
	public List<ContactPointOption> getContactPointOptionList() {
		return contactPointOptionList;
	}

	@Override
	public void setContactPointOptionList(List<ContactPointOption> contactPointOptionList) {
		this.contactPointOptionList = contactPointOptionList;
	}

	@Override
	public boolean hasContactPointOption() {
		return contactPointOptionList != null && contactPointOptionList.size() > 0 && contactPointOptionList.get(0) != null;
	}

	public ITEM_REVIEWED(Continent continent) {
		continentList = new ArrayList<Continent>();
		continentList.add(continent);
	}

	@Override
	public Continent getContinent() {
		if(continentList != null && continentList.size() > 0) {
			return continentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContinent(Continent continent) {
		if(continentList == null) {
			continentList = new ArrayList<>();
		}
		if(continentList.size() == 0) {
			continentList.add(continent);
		} else {
			continentList.set(0, continent);
		}
	}

	@Override
	public List<Continent> getContinentList() {
		return continentList;
	}

	@Override
	public void setContinentList(List<Continent> continentList) {
		this.continentList = continentList;
	}

	@Override
	public boolean hasContinent() {
		return continentList != null && continentList.size() > 0 && continentList.get(0) != null;
	}

	public ITEM_REVIEWED(ControlAction controlAction) {
		controlActionList = new ArrayList<ControlAction>();
		controlActionList.add(controlAction);
	}

	@Override
	public ControlAction getControlAction() {
		if(controlActionList != null && controlActionList.size() > 0) {
			return controlActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setControlAction(ControlAction controlAction) {
		if(controlActionList == null) {
			controlActionList = new ArrayList<>();
		}
		if(controlActionList.size() == 0) {
			controlActionList.add(controlAction);
		} else {
			controlActionList.set(0, controlAction);
		}
	}

	@Override
	public List<ControlAction> getControlActionList() {
		return controlActionList;
	}

	@Override
	public void setControlActionList(List<ControlAction> controlActionList) {
		this.controlActionList = controlActionList;
	}

	@Override
	public boolean hasControlAction() {
		return controlActionList != null && controlActionList.size() > 0 && controlActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ConvenienceStore convenienceStore) {
		convenienceStoreList = new ArrayList<ConvenienceStore>();
		convenienceStoreList.add(convenienceStore);
	}

	@Override
	public ConvenienceStore getConvenienceStore() {
		if(convenienceStoreList != null && convenienceStoreList.size() > 0) {
			return convenienceStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConvenienceStore(ConvenienceStore convenienceStore) {
		if(convenienceStoreList == null) {
			convenienceStoreList = new ArrayList<>();
		}
		if(convenienceStoreList.size() == 0) {
			convenienceStoreList.add(convenienceStore);
		} else {
			convenienceStoreList.set(0, convenienceStore);
		}
	}

	@Override
	public List<ConvenienceStore> getConvenienceStoreList() {
		return convenienceStoreList;
	}

	@Override
	public void setConvenienceStoreList(List<ConvenienceStore> convenienceStoreList) {
		this.convenienceStoreList = convenienceStoreList;
	}

	@Override
	public boolean hasConvenienceStore() {
		return convenienceStoreList != null && convenienceStoreList.size() > 0 && convenienceStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Conversation conversation) {
		conversationList = new ArrayList<Conversation>();
		conversationList.add(conversation);
	}

	@Override
	public Conversation getConversation() {
		if(conversationList != null && conversationList.size() > 0) {
			return conversationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConversation(Conversation conversation) {
		if(conversationList == null) {
			conversationList = new ArrayList<>();
		}
		if(conversationList.size() == 0) {
			conversationList.add(conversation);
		} else {
			conversationList.set(0, conversation);
		}
	}

	@Override
	public List<Conversation> getConversationList() {
		return conversationList;
	}

	@Override
	public void setConversationList(List<Conversation> conversationList) {
		this.conversationList = conversationList;
	}

	@Override
	public boolean hasConversation() {
		return conversationList != null && conversationList.size() > 0 && conversationList.get(0) != null;
	}

	public ITEM_REVIEWED(CookAction cookAction) {
		cookActionList = new ArrayList<CookAction>();
		cookActionList.add(cookAction);
	}

	@Override
	public CookAction getCookAction() {
		if(cookActionList != null && cookActionList.size() > 0) {
			return cookActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCookAction(CookAction cookAction) {
		if(cookActionList == null) {
			cookActionList = new ArrayList<>();
		}
		if(cookActionList.size() == 0) {
			cookActionList.add(cookAction);
		} else {
			cookActionList.set(0, cookAction);
		}
	}

	@Override
	public List<CookAction> getCookActionList() {
		return cookActionList;
	}

	@Override
	public void setCookActionList(List<CookAction> cookActionList) {
		this.cookActionList = cookActionList;
	}

	@Override
	public boolean hasCookAction() {
		return cookActionList != null && cookActionList.size() > 0 && cookActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Corporation corporation) {
		corporationList = new ArrayList<Corporation>();
		corporationList.add(corporation);
	}

	@Override
	public Corporation getCorporation() {
		if(corporationList != null && corporationList.size() > 0) {
			return corporationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCorporation(Corporation corporation) {
		if(corporationList == null) {
			corporationList = new ArrayList<>();
		}
		if(corporationList.size() == 0) {
			corporationList.add(corporation);
		} else {
			corporationList.set(0, corporation);
		}
	}

	@Override
	public List<Corporation> getCorporationList() {
		return corporationList;
	}

	@Override
	public void setCorporationList(List<Corporation> corporationList) {
		this.corporationList = corporationList;
	}

	@Override
	public boolean hasCorporation() {
		return corporationList != null && corporationList.size() > 0 && corporationList.get(0) != null;
	}

	public ITEM_REVIEWED(CorrectionComment correctionComment) {
		correctionCommentList = new ArrayList<CorrectionComment>();
		correctionCommentList.add(correctionComment);
	}

	@Override
	public CorrectionComment getCorrectionComment() {
		if(correctionCommentList != null && correctionCommentList.size() > 0) {
			return correctionCommentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCorrectionComment(CorrectionComment correctionComment) {
		if(correctionCommentList == null) {
			correctionCommentList = new ArrayList<>();
		}
		if(correctionCommentList.size() == 0) {
			correctionCommentList.add(correctionComment);
		} else {
			correctionCommentList.set(0, correctionComment);
		}
	}

	@Override
	public List<CorrectionComment> getCorrectionCommentList() {
		return correctionCommentList;
	}

	@Override
	public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList) {
		this.correctionCommentList = correctionCommentList;
	}

	@Override
	public boolean hasCorrectionComment() {
		return correctionCommentList != null && correctionCommentList.size() > 0 && correctionCommentList.get(0) != null;
	}

	public ITEM_REVIEWED(Country country) {
		countryList = new ArrayList<Country>();
		countryList.add(country);
	}

	@Override
	public Country getCountry() {
		if(countryList != null && countryList.size() > 0) {
			return countryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCountry(Country country) {
		if(countryList == null) {
			countryList = new ArrayList<>();
		}
		if(countryList.size() == 0) {
			countryList.add(country);
		} else {
			countryList.set(0, country);
		}
	}

	@Override
	public List<Country> getCountryList() {
		return countryList;
	}

	@Override
	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	@Override
	public boolean hasCountry() {
		return countryList != null && countryList.size() > 0 && countryList.get(0) != null;
	}

	public ITEM_REVIEWED(Course course) {
		courseList = new ArrayList<Course>();
		courseList.add(course);
	}

	@Override
	public Course getCourse() {
		if(courseList != null && courseList.size() > 0) {
			return courseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourse(Course course) {
		if(courseList == null) {
			courseList = new ArrayList<>();
		}
		if(courseList.size() == 0) {
			courseList.add(course);
		} else {
			courseList.set(0, course);
		}
	}

	@Override
	public List<Course> getCourseList() {
		return courseList;
	}

	@Override
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public boolean hasCourse() {
		return courseList != null && courseList.size() > 0 && courseList.get(0) != null;
	}

	public ITEM_REVIEWED(CourseInstance courseInstance) {
		courseInstanceList = new ArrayList<CourseInstance>();
		courseInstanceList.add(courseInstance);
	}

	@Override
	public CourseInstance getCourseInstance() {
		if(courseInstanceList != null && courseInstanceList.size() > 0) {
			return courseInstanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourseInstance(CourseInstance courseInstance) {
		if(courseInstanceList == null) {
			courseInstanceList = new ArrayList<>();
		}
		if(courseInstanceList.size() == 0) {
			courseInstanceList.add(courseInstance);
		} else {
			courseInstanceList.set(0, courseInstance);
		}
	}

	@Override
	public List<CourseInstance> getCourseInstanceList() {
		return courseInstanceList;
	}

	@Override
	public void setCourseInstanceList(List<CourseInstance> courseInstanceList) {
		this.courseInstanceList = courseInstanceList;
	}

	@Override
	public boolean hasCourseInstance() {
		return courseInstanceList != null && courseInstanceList.size() > 0 && courseInstanceList.get(0) != null;
	}

	public ITEM_REVIEWED(Courthouse courthouse) {
		courthouseList = new ArrayList<Courthouse>();
		courthouseList.add(courthouse);
	}

	@Override
	public Courthouse getCourthouse() {
		if(courthouseList != null && courthouseList.size() > 0) {
			return courthouseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourthouse(Courthouse courthouse) {
		if(courthouseList == null) {
			courthouseList = new ArrayList<>();
		}
		if(courthouseList.size() == 0) {
			courthouseList.add(courthouse);
		} else {
			courthouseList.set(0, courthouse);
		}
	}

	@Override
	public List<Courthouse> getCourthouseList() {
		return courthouseList;
	}

	@Override
	public void setCourthouseList(List<Courthouse> courthouseList) {
		this.courthouseList = courthouseList;
	}

	@Override
	public boolean hasCourthouse() {
		return courthouseList != null && courthouseList.size() > 0 && courthouseList.get(0) != null;
	}

	public ITEM_REVIEWED(CoverArt coverArt) {
		coverArtList = new ArrayList<CoverArt>();
		coverArtList.add(coverArt);
	}

	@Override
	public CoverArt getCoverArt() {
		if(coverArtList != null && coverArtList.size() > 0) {
			return coverArtList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCoverArt(CoverArt coverArt) {
		if(coverArtList == null) {
			coverArtList = new ArrayList<>();
		}
		if(coverArtList.size() == 0) {
			coverArtList.add(coverArt);
		} else {
			coverArtList.set(0, coverArt);
		}
	}

	@Override
	public List<CoverArt> getCoverArtList() {
		return coverArtList;
	}

	@Override
	public void setCoverArtList(List<CoverArt> coverArtList) {
		this.coverArtList = coverArtList;
	}

	@Override
	public boolean hasCoverArt() {
		return coverArtList != null && coverArtList.size() > 0 && coverArtList.get(0) != null;
	}

	public ITEM_REVIEWED(CreateAction createAction) {
		createActionList = new ArrayList<CreateAction>();
		createActionList.add(createAction);
	}

	@Override
	public CreateAction getCreateAction() {
		if(createActionList != null && createActionList.size() > 0) {
			return createActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreateAction(CreateAction createAction) {
		if(createActionList == null) {
			createActionList = new ArrayList<>();
		}
		if(createActionList.size() == 0) {
			createActionList.add(createAction);
		} else {
			createActionList.set(0, createAction);
		}
	}

	@Override
	public List<CreateAction> getCreateActionList() {
		return createActionList;
	}

	@Override
	public void setCreateActionList(List<CreateAction> createActionList) {
		this.createActionList = createActionList;
	}

	@Override
	public boolean hasCreateAction() {
		return createActionList != null && createActionList.size() > 0 && createActionList.get(0) != null;
	}

	public ITEM_REVIEWED(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public ITEM_REVIEWED(CreativeWorkSeason creativeWorkSeason) {
		creativeWorkSeasonList = new ArrayList<CreativeWorkSeason>();
		creativeWorkSeasonList.add(creativeWorkSeason);
	}

	@Override
	public CreativeWorkSeason getCreativeWorkSeason() {
		if(creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0) {
			return creativeWorkSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWorkSeason(CreativeWorkSeason creativeWorkSeason) {
		if(creativeWorkSeasonList == null) {
			creativeWorkSeasonList = new ArrayList<>();
		}
		if(creativeWorkSeasonList.size() == 0) {
			creativeWorkSeasonList.add(creativeWorkSeason);
		} else {
			creativeWorkSeasonList.set(0, creativeWorkSeason);
		}
	}

	@Override
	public List<CreativeWorkSeason> getCreativeWorkSeasonList() {
		return creativeWorkSeasonList;
	}

	@Override
	public void setCreativeWorkSeasonList(List<CreativeWorkSeason> creativeWorkSeasonList) {
		this.creativeWorkSeasonList = creativeWorkSeasonList;
	}

	@Override
	public boolean hasCreativeWorkSeason() {
		return creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0 && creativeWorkSeasonList.get(0) != null;
	}

	public ITEM_REVIEWED(CreativeWorkSeries creativeWorkSeries) {
		creativeWorkSeriesList = new ArrayList<CreativeWorkSeries>();
		creativeWorkSeriesList.add(creativeWorkSeries);
	}

	@Override
	public CreativeWorkSeries getCreativeWorkSeries() {
		if(creativeWorkSeriesList != null && creativeWorkSeriesList.size() > 0) {
			return creativeWorkSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWorkSeries(CreativeWorkSeries creativeWorkSeries) {
		if(creativeWorkSeriesList == null) {
			creativeWorkSeriesList = new ArrayList<>();
		}
		if(creativeWorkSeriesList.size() == 0) {
			creativeWorkSeriesList.add(creativeWorkSeries);
		} else {
			creativeWorkSeriesList.set(0, creativeWorkSeries);
		}
	}

	@Override
	public List<CreativeWorkSeries> getCreativeWorkSeriesList() {
		return creativeWorkSeriesList;
	}

	@Override
	public void setCreativeWorkSeriesList(List<CreativeWorkSeries> creativeWorkSeriesList) {
		this.creativeWorkSeriesList = creativeWorkSeriesList;
	}

	@Override
	public boolean hasCreativeWorkSeries() {
		return creativeWorkSeriesList != null && creativeWorkSeriesList.size() > 0 && creativeWorkSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(CreditCard creditCard) {
		creditCardList = new ArrayList<CreditCard>();
		creditCardList.add(creditCard);
	}

	@Override
	public CreditCard getCreditCard() {
		if(creditCardList != null && creditCardList.size() > 0) {
			return creditCardList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreditCard(CreditCard creditCard) {
		if(creditCardList == null) {
			creditCardList = new ArrayList<>();
		}
		if(creditCardList.size() == 0) {
			creditCardList.add(creditCard);
		} else {
			creditCardList.set(0, creditCard);
		}
	}

	@Override
	public List<CreditCard> getCreditCardList() {
		return creditCardList;
	}

	@Override
	public void setCreditCardList(List<CreditCard> creditCardList) {
		this.creditCardList = creditCardList;
	}

	@Override
	public boolean hasCreditCard() {
		return creditCardList != null && creditCardList.size() > 0 && creditCardList.get(0) != null;
	}

	public ITEM_REVIEWED(Crematorium crematorium) {
		crematoriumList = new ArrayList<Crematorium>();
		crematoriumList.add(crematorium);
	}

	@Override
	public Crematorium getCrematorium() {
		if(crematoriumList != null && crematoriumList.size() > 0) {
			return crematoriumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCrematorium(Crematorium crematorium) {
		if(crematoriumList == null) {
			crematoriumList = new ArrayList<>();
		}
		if(crematoriumList.size() == 0) {
			crematoriumList.add(crematorium);
		} else {
			crematoriumList.set(0, crematorium);
		}
	}

	@Override
	public List<Crematorium> getCrematoriumList() {
		return crematoriumList;
	}

	@Override
	public void setCrematoriumList(List<Crematorium> crematoriumList) {
		this.crematoriumList = crematoriumList;
	}

	@Override
	public boolean hasCrematorium() {
		return crematoriumList != null && crematoriumList.size() > 0 && crematoriumList.get(0) != null;
	}

	public ITEM_REVIEWED(CriticReview criticReview) {
		criticReviewList = new ArrayList<CriticReview>();
		criticReviewList.add(criticReview);
	}

	@Override
	public CriticReview getCriticReview() {
		if(criticReviewList != null && criticReviewList.size() > 0) {
			return criticReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCriticReview(CriticReview criticReview) {
		if(criticReviewList == null) {
			criticReviewList = new ArrayList<>();
		}
		if(criticReviewList.size() == 0) {
			criticReviewList.add(criticReview);
		} else {
			criticReviewList.set(0, criticReview);
		}
	}

	@Override
	public List<CriticReview> getCriticReviewList() {
		return criticReviewList;
	}

	@Override
	public void setCriticReviewList(List<CriticReview> criticReviewList) {
		this.criticReviewList = criticReviewList;
	}

	@Override
	public boolean hasCriticReview() {
		return criticReviewList != null && criticReviewList.size() > 0 && criticReviewList.get(0) != null;
	}

	public ITEM_REVIEWED(CurrencyConversionService currencyConversionService) {
		currencyConversionServiceList = new ArrayList<CurrencyConversionService>();
		currencyConversionServiceList.add(currencyConversionService);
	}

	@Override
	public CurrencyConversionService getCurrencyConversionService() {
		if(currencyConversionServiceList != null && currencyConversionServiceList.size() > 0) {
			return currencyConversionServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCurrencyConversionService(CurrencyConversionService currencyConversionService) {
		if(currencyConversionServiceList == null) {
			currencyConversionServiceList = new ArrayList<>();
		}
		if(currencyConversionServiceList.size() == 0) {
			currencyConversionServiceList.add(currencyConversionService);
		} else {
			currencyConversionServiceList.set(0, currencyConversionService);
		}
	}

	@Override
	public List<CurrencyConversionService> getCurrencyConversionServiceList() {
		return currencyConversionServiceList;
	}

	@Override
	public void setCurrencyConversionServiceList(List<CurrencyConversionService> currencyConversionServiceList) {
		this.currencyConversionServiceList = currencyConversionServiceList;
	}

	@Override
	public boolean hasCurrencyConversionService() {
		return currencyConversionServiceList != null && currencyConversionServiceList.size() > 0 && currencyConversionServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(DDxElement ddxElement) {
		ddxElementList = new ArrayList<DDxElement>();
		ddxElementList.add(ddxElement);
	}

	@Override
	public DDxElement getDDxElement() {
		if(ddxElementList != null && ddxElementList.size() > 0) {
			return ddxElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDDxElement(DDxElement ddxElement) {
		if(ddxElementList == null) {
			ddxElementList = new ArrayList<>();
		}
		if(ddxElementList.size() == 0) {
			ddxElementList.add(ddxElement);
		} else {
			ddxElementList.set(0, ddxElement);
		}
	}

	@Override
	public List<DDxElement> getDDxElementList() {
		return ddxElementList;
	}

	@Override
	public void setDDxElementList(List<DDxElement> ddxElementList) {
		this.ddxElementList = ddxElementList;
	}

	@Override
	public boolean hasDDxElement() {
		return ddxElementList != null && ddxElementList.size() > 0 && ddxElementList.get(0) != null;
	}

	public ITEM_REVIEWED(DanceEvent danceEvent) {
		danceEventList = new ArrayList<DanceEvent>();
		danceEventList.add(danceEvent);
	}

	@Override
	public DanceEvent getDanceEvent() {
		if(danceEventList != null && danceEventList.size() > 0) {
			return danceEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDanceEvent(DanceEvent danceEvent) {
		if(danceEventList == null) {
			danceEventList = new ArrayList<>();
		}
		if(danceEventList.size() == 0) {
			danceEventList.add(danceEvent);
		} else {
			danceEventList.set(0, danceEvent);
		}
	}

	@Override
	public List<DanceEvent> getDanceEventList() {
		return danceEventList;
	}

	@Override
	public void setDanceEventList(List<DanceEvent> danceEventList) {
		this.danceEventList = danceEventList;
	}

	@Override
	public boolean hasDanceEvent() {
		return danceEventList != null && danceEventList.size() > 0 && danceEventList.get(0) != null;
	}

	public ITEM_REVIEWED(DanceGroup danceGroup) {
		danceGroupList = new ArrayList<DanceGroup>();
		danceGroupList.add(danceGroup);
	}

	@Override
	public DanceGroup getDanceGroup() {
		if(danceGroupList != null && danceGroupList.size() > 0) {
			return danceGroupList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDanceGroup(DanceGroup danceGroup) {
		if(danceGroupList == null) {
			danceGroupList = new ArrayList<>();
		}
		if(danceGroupList.size() == 0) {
			danceGroupList.add(danceGroup);
		} else {
			danceGroupList.set(0, danceGroup);
		}
	}

	@Override
	public List<DanceGroup> getDanceGroupList() {
		return danceGroupList;
	}

	@Override
	public void setDanceGroupList(List<DanceGroup> danceGroupList) {
		this.danceGroupList = danceGroupList;
	}

	@Override
	public boolean hasDanceGroup() {
		return danceGroupList != null && danceGroupList.size() > 0 && danceGroupList.get(0) != null;
	}

	public ITEM_REVIEWED(DataCatalog dataCatalog) {
		dataCatalogList = new ArrayList<DataCatalog>();
		dataCatalogList.add(dataCatalog);
	}

	@Override
	public DataCatalog getDataCatalog() {
		if(dataCatalogList != null && dataCatalogList.size() > 0) {
			return dataCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataCatalog(DataCatalog dataCatalog) {
		if(dataCatalogList == null) {
			dataCatalogList = new ArrayList<>();
		}
		if(dataCatalogList.size() == 0) {
			dataCatalogList.add(dataCatalog);
		} else {
			dataCatalogList.set(0, dataCatalog);
		}
	}

	@Override
	public List<DataCatalog> getDataCatalogList() {
		return dataCatalogList;
	}

	@Override
	public void setDataCatalogList(List<DataCatalog> dataCatalogList) {
		this.dataCatalogList = dataCatalogList;
	}

	@Override
	public boolean hasDataCatalog() {
		return dataCatalogList != null && dataCatalogList.size() > 0 && dataCatalogList.get(0) != null;
	}

	public ITEM_REVIEWED(DataDownload dataDownload) {
		dataDownloadList = new ArrayList<DataDownload>();
		dataDownloadList.add(dataDownload);
	}

	@Override
	public DataDownload getDataDownload() {
		if(dataDownloadList != null && dataDownloadList.size() > 0) {
			return dataDownloadList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataDownload(DataDownload dataDownload) {
		if(dataDownloadList == null) {
			dataDownloadList = new ArrayList<>();
		}
		if(dataDownloadList.size() == 0) {
			dataDownloadList.add(dataDownload);
		} else {
			dataDownloadList.set(0, dataDownload);
		}
	}

	@Override
	public List<DataDownload> getDataDownloadList() {
		return dataDownloadList;
	}

	@Override
	public void setDataDownloadList(List<DataDownload> dataDownloadList) {
		this.dataDownloadList = dataDownloadList;
	}

	@Override
	public boolean hasDataDownload() {
		return dataDownloadList != null && dataDownloadList.size() > 0 && dataDownloadList.get(0) != null;
	}

	public ITEM_REVIEWED(DataFeed dataFeed) {
		dataFeedList = new ArrayList<DataFeed>();
		dataFeedList.add(dataFeed);
	}

	@Override
	public DataFeed getDataFeed() {
		if(dataFeedList != null && dataFeedList.size() > 0) {
			return dataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataFeed(DataFeed dataFeed) {
		if(dataFeedList == null) {
			dataFeedList = new ArrayList<>();
		}
		if(dataFeedList.size() == 0) {
			dataFeedList.add(dataFeed);
		} else {
			dataFeedList.set(0, dataFeed);
		}
	}

	@Override
	public List<DataFeed> getDataFeedList() {
		return dataFeedList;
	}

	@Override
	public void setDataFeedList(List<DataFeed> dataFeedList) {
		this.dataFeedList = dataFeedList;
	}

	@Override
	public boolean hasDataFeed() {
		return dataFeedList != null && dataFeedList.size() > 0 && dataFeedList.get(0) != null;
	}

	public ITEM_REVIEWED(DataFeedItem dataFeedItem) {
		dataFeedItemList = new ArrayList<DataFeedItem>();
		dataFeedItemList.add(dataFeedItem);
	}

	@Override
	public DataFeedItem getDataFeedItem() {
		if(dataFeedItemList != null && dataFeedItemList.size() > 0) {
			return dataFeedItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataFeedItem(DataFeedItem dataFeedItem) {
		if(dataFeedItemList == null) {
			dataFeedItemList = new ArrayList<>();
		}
		if(dataFeedItemList.size() == 0) {
			dataFeedItemList.add(dataFeedItem);
		} else {
			dataFeedItemList.set(0, dataFeedItem);
		}
	}

	@Override
	public List<DataFeedItem> getDataFeedItemList() {
		return dataFeedItemList;
	}

	@Override
	public void setDataFeedItemList(List<DataFeedItem> dataFeedItemList) {
		this.dataFeedItemList = dataFeedItemList;
	}

	@Override
	public boolean hasDataFeedItem() {
		return dataFeedItemList != null && dataFeedItemList.size() > 0 && dataFeedItemList.get(0) != null;
	}

	public ITEM_REVIEWED(Dataset dataset) {
		datasetList = new ArrayList<Dataset>();
		datasetList.add(dataset);
	}

	@Override
	public Dataset getDataset() {
		if(datasetList != null && datasetList.size() > 0) {
			return datasetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataset(Dataset dataset) {
		if(datasetList == null) {
			datasetList = new ArrayList<>();
		}
		if(datasetList.size() == 0) {
			datasetList.add(dataset);
		} else {
			datasetList.set(0, dataset);
		}
	}

	@Override
	public List<Dataset> getDatasetList() {
		return datasetList;
	}

	@Override
	public void setDatasetList(List<Dataset> datasetList) {
		this.datasetList = datasetList;
	}

	@Override
	public boolean hasDataset() {
		return datasetList != null && datasetList.size() > 0 && datasetList.get(0) != null;
	}

	public ITEM_REVIEWED(DayOfWeek dayOfWeek) {
		dayOfWeekList = new ArrayList<DayOfWeek>();
		dayOfWeekList.add(dayOfWeek);
	}

	@Override
	public DayOfWeek getDayOfWeek() {
		if(dayOfWeekList != null && dayOfWeekList.size() > 0) {
			return dayOfWeekList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		if(dayOfWeekList == null) {
			dayOfWeekList = new ArrayList<>();
		}
		if(dayOfWeekList.size() == 0) {
			dayOfWeekList.add(dayOfWeek);
		} else {
			dayOfWeekList.set(0, dayOfWeek);
		}
	}

	@Override
	public List<DayOfWeek> getDayOfWeekList() {
		return dayOfWeekList;
	}

	@Override
	public void setDayOfWeekList(List<DayOfWeek> dayOfWeekList) {
		this.dayOfWeekList = dayOfWeekList;
	}

	@Override
	public boolean hasDayOfWeek() {
		return dayOfWeekList != null && dayOfWeekList.size() > 0 && dayOfWeekList.get(0) != null;
	}

	public ITEM_REVIEWED(DaySpa daySpa) {
		daySpaList = new ArrayList<DaySpa>();
		daySpaList.add(daySpa);
	}

	@Override
	public DaySpa getDaySpa() {
		if(daySpaList != null && daySpaList.size() > 0) {
			return daySpaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDaySpa(DaySpa daySpa) {
		if(daySpaList == null) {
			daySpaList = new ArrayList<>();
		}
		if(daySpaList.size() == 0) {
			daySpaList.add(daySpa);
		} else {
			daySpaList.set(0, daySpa);
		}
	}

	@Override
	public List<DaySpa> getDaySpaList() {
		return daySpaList;
	}

	@Override
	public void setDaySpaList(List<DaySpa> daySpaList) {
		this.daySpaList = daySpaList;
	}

	@Override
	public boolean hasDaySpa() {
		return daySpaList != null && daySpaList.size() > 0 && daySpaList.get(0) != null;
	}

	public ITEM_REVIEWED(DeactivateAction deactivateAction) {
		deactivateActionList = new ArrayList<DeactivateAction>();
		deactivateActionList.add(deactivateAction);
	}

	@Override
	public DeactivateAction getDeactivateAction() {
		if(deactivateActionList != null && deactivateActionList.size() > 0) {
			return deactivateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeactivateAction(DeactivateAction deactivateAction) {
		if(deactivateActionList == null) {
			deactivateActionList = new ArrayList<>();
		}
		if(deactivateActionList.size() == 0) {
			deactivateActionList.add(deactivateAction);
		} else {
			deactivateActionList.set(0, deactivateAction);
		}
	}

	@Override
	public List<DeactivateAction> getDeactivateActionList() {
		return deactivateActionList;
	}

	@Override
	public void setDeactivateActionList(List<DeactivateAction> deactivateActionList) {
		this.deactivateActionList = deactivateActionList;
	}

	@Override
	public boolean hasDeactivateAction() {
		return deactivateActionList != null && deactivateActionList.size() > 0 && deactivateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DefenceEstablishment defenceEstablishment) {
		defenceEstablishmentList = new ArrayList<DefenceEstablishment>();
		defenceEstablishmentList.add(defenceEstablishment);
	}

	@Override
	public DefenceEstablishment getDefenceEstablishment() {
		if(defenceEstablishmentList != null && defenceEstablishmentList.size() > 0) {
			return defenceEstablishmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefenceEstablishment(DefenceEstablishment defenceEstablishment) {
		if(defenceEstablishmentList == null) {
			defenceEstablishmentList = new ArrayList<>();
		}
		if(defenceEstablishmentList.size() == 0) {
			defenceEstablishmentList.add(defenceEstablishment);
		} else {
			defenceEstablishmentList.set(0, defenceEstablishment);
		}
	}

	@Override
	public List<DefenceEstablishment> getDefenceEstablishmentList() {
		return defenceEstablishmentList;
	}

	@Override
	public void setDefenceEstablishmentList(List<DefenceEstablishment> defenceEstablishmentList) {
		this.defenceEstablishmentList = defenceEstablishmentList;
	}

	@Override
	public boolean hasDefenceEstablishment() {
		return defenceEstablishmentList != null && defenceEstablishmentList.size() > 0 && defenceEstablishmentList.get(0) != null;
	}

	public ITEM_REVIEWED(DefinedTerm definedTerm) {
		definedTermList = new ArrayList<DefinedTerm>();
		definedTermList.add(definedTerm);
	}

	@Override
	public DefinedTerm getDefinedTerm() {
		if(definedTermList != null && definedTermList.size() > 0) {
			return definedTermList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTerm(DefinedTerm definedTerm) {
		if(definedTermList == null) {
			definedTermList = new ArrayList<>();
		}
		if(definedTermList.size() == 0) {
			definedTermList.add(definedTerm);
		} else {
			definedTermList.set(0, definedTerm);
		}
	}

	@Override
	public List<DefinedTerm> getDefinedTermList() {
		return definedTermList;
	}

	@Override
	public void setDefinedTermList(List<DefinedTerm> definedTermList) {
		this.definedTermList = definedTermList;
	}

	@Override
	public boolean hasDefinedTerm() {
		return definedTermList != null && definedTermList.size() > 0 && definedTermList.get(0) != null;
	}

	public ITEM_REVIEWED(DefinedTermSet definedTermSet) {
		definedTermSetList = new ArrayList<DefinedTermSet>();
		definedTermSetList.add(definedTermSet);
	}

	@Override
	public DefinedTermSet getDefinedTermSet() {
		if(definedTermSetList != null && definedTermSetList.size() > 0) {
			return definedTermSetList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTermSet(DefinedTermSet definedTermSet) {
		if(definedTermSetList == null) {
			definedTermSetList = new ArrayList<>();
		}
		if(definedTermSetList.size() == 0) {
			definedTermSetList.add(definedTermSet);
		} else {
			definedTermSetList.set(0, definedTermSet);
		}
	}

	@Override
	public List<DefinedTermSet> getDefinedTermSetList() {
		return definedTermSetList;
	}

	@Override
	public void setDefinedTermSetList(List<DefinedTermSet> definedTermSetList) {
		this.definedTermSetList = definedTermSetList;
	}

	@Override
	public boolean hasDefinedTermSet() {
		return definedTermSetList != null && definedTermSetList.size() > 0 && definedTermSetList.get(0) != null;
	}

	public ITEM_REVIEWED(DeleteAction deleteAction) {
		deleteActionList = new ArrayList<DeleteAction>();
		deleteActionList.add(deleteAction);
	}

	@Override
	public DeleteAction getDeleteAction() {
		if(deleteActionList != null && deleteActionList.size() > 0) {
			return deleteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeleteAction(DeleteAction deleteAction) {
		if(deleteActionList == null) {
			deleteActionList = new ArrayList<>();
		}
		if(deleteActionList.size() == 0) {
			deleteActionList.add(deleteAction);
		} else {
			deleteActionList.set(0, deleteAction);
		}
	}

	@Override
	public List<DeleteAction> getDeleteActionList() {
		return deleteActionList;
	}

	@Override
	public void setDeleteActionList(List<DeleteAction> deleteActionList) {
		this.deleteActionList = deleteActionList;
	}

	@Override
	public boolean hasDeleteAction() {
		return deleteActionList != null && deleteActionList.size() > 0 && deleteActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DeliveryChargeSpecification deliveryChargeSpecification) {
		deliveryChargeSpecificationList = new ArrayList<DeliveryChargeSpecification>();
		deliveryChargeSpecificationList.add(deliveryChargeSpecification);
	}

	@Override
	public DeliveryChargeSpecification getDeliveryChargeSpecification() {
		if(deliveryChargeSpecificationList != null && deliveryChargeSpecificationList.size() > 0) {
			return deliveryChargeSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryChargeSpecification(DeliveryChargeSpecification deliveryChargeSpecification) {
		if(deliveryChargeSpecificationList == null) {
			deliveryChargeSpecificationList = new ArrayList<>();
		}
		if(deliveryChargeSpecificationList.size() == 0) {
			deliveryChargeSpecificationList.add(deliveryChargeSpecification);
		} else {
			deliveryChargeSpecificationList.set(0, deliveryChargeSpecification);
		}
	}

	@Override
	public List<DeliveryChargeSpecification> getDeliveryChargeSpecificationList() {
		return deliveryChargeSpecificationList;
	}

	@Override
	public void setDeliveryChargeSpecificationList(List<DeliveryChargeSpecification> deliveryChargeSpecificationList) {
		this.deliveryChargeSpecificationList = deliveryChargeSpecificationList;
	}

	@Override
	public boolean hasDeliveryChargeSpecification() {
		return deliveryChargeSpecificationList != null && deliveryChargeSpecificationList.size() > 0 && deliveryChargeSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(DeliveryEvent deliveryEvent) {
		deliveryEventList = new ArrayList<DeliveryEvent>();
		deliveryEventList.add(deliveryEvent);
	}

	@Override
	public DeliveryEvent getDeliveryEvent() {
		if(deliveryEventList != null && deliveryEventList.size() > 0) {
			return deliveryEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryEvent(DeliveryEvent deliveryEvent) {
		if(deliveryEventList == null) {
			deliveryEventList = new ArrayList<>();
		}
		if(deliveryEventList.size() == 0) {
			deliveryEventList.add(deliveryEvent);
		} else {
			deliveryEventList.set(0, deliveryEvent);
		}
	}

	@Override
	public List<DeliveryEvent> getDeliveryEventList() {
		return deliveryEventList;
	}

	@Override
	public void setDeliveryEventList(List<DeliveryEvent> deliveryEventList) {
		this.deliveryEventList = deliveryEventList;
	}

	@Override
	public boolean hasDeliveryEvent() {
		return deliveryEventList != null && deliveryEventList.size() > 0 && deliveryEventList.get(0) != null;
	}

	public ITEM_REVIEWED(DeliveryMethod deliveryMethod) {
		deliveryMethodList = new ArrayList<DeliveryMethod>();
		deliveryMethodList.add(deliveryMethod);
	}

	@Override
	public DeliveryMethod getDeliveryMethod() {
		if(deliveryMethodList != null && deliveryMethodList.size() > 0) {
			return deliveryMethodList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		if(deliveryMethodList == null) {
			deliveryMethodList = new ArrayList<>();
		}
		if(deliveryMethodList.size() == 0) {
			deliveryMethodList.add(deliveryMethod);
		} else {
			deliveryMethodList.set(0, deliveryMethod);
		}
	}

	@Override
	public List<DeliveryMethod> getDeliveryMethodList() {
		return deliveryMethodList;
	}

	@Override
	public void setDeliveryMethodList(List<DeliveryMethod> deliveryMethodList) {
		this.deliveryMethodList = deliveryMethodList;
	}

	@Override
	public boolean hasDeliveryMethod() {
		return deliveryMethodList != null && deliveryMethodList.size() > 0 && deliveryMethodList.get(0) != null;
	}

	public ITEM_REVIEWED(Demand demand) {
		demandList = new ArrayList<Demand>();
		demandList.add(demand);
	}

	@Override
	public Demand getDemand() {
		if(demandList != null && demandList.size() > 0) {
			return demandList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDemand(Demand demand) {
		if(demandList == null) {
			demandList = new ArrayList<>();
		}
		if(demandList.size() == 0) {
			demandList.add(demand);
		} else {
			demandList.set(0, demand);
		}
	}

	@Override
	public List<Demand> getDemandList() {
		return demandList;
	}

	@Override
	public void setDemandList(List<Demand> demandList) {
		this.demandList = demandList;
	}

	@Override
	public boolean hasDemand() {
		return demandList != null && demandList.size() > 0 && demandList.get(0) != null;
	}

	public ITEM_REVIEWED(Dentist dentist) {
		dentistList = new ArrayList<Dentist>();
		dentistList.add(dentist);
	}

	@Override
	public Dentist getDentist() {
		if(dentistList != null && dentistList.size() > 0) {
			return dentistList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDentist(Dentist dentist) {
		if(dentistList == null) {
			dentistList = new ArrayList<>();
		}
		if(dentistList.size() == 0) {
			dentistList.add(dentist);
		} else {
			dentistList.set(0, dentist);
		}
	}

	@Override
	public List<Dentist> getDentistList() {
		return dentistList;
	}

	@Override
	public void setDentistList(List<Dentist> dentistList) {
		this.dentistList = dentistList;
	}

	@Override
	public boolean hasDentist() {
		return dentistList != null && dentistList.size() > 0 && dentistList.get(0) != null;
	}

	public ITEM_REVIEWED(DepartAction departAction) {
		departActionList = new ArrayList<DepartAction>();
		departActionList.add(departAction);
	}

	@Override
	public DepartAction getDepartAction() {
		if(departActionList != null && departActionList.size() > 0) {
			return departActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDepartAction(DepartAction departAction) {
		if(departActionList == null) {
			departActionList = new ArrayList<>();
		}
		if(departActionList.size() == 0) {
			departActionList.add(departAction);
		} else {
			departActionList.set(0, departAction);
		}
	}

	@Override
	public List<DepartAction> getDepartActionList() {
		return departActionList;
	}

	@Override
	public void setDepartActionList(List<DepartAction> departActionList) {
		this.departActionList = departActionList;
	}

	@Override
	public boolean hasDepartAction() {
		return departActionList != null && departActionList.size() > 0 && departActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DepartmentStore departmentStore) {
		departmentStoreList = new ArrayList<DepartmentStore>();
		departmentStoreList.add(departmentStore);
	}

	@Override
	public DepartmentStore getDepartmentStore() {
		if(departmentStoreList != null && departmentStoreList.size() > 0) {
			return departmentStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDepartmentStore(DepartmentStore departmentStore) {
		if(departmentStoreList == null) {
			departmentStoreList = new ArrayList<>();
		}
		if(departmentStoreList.size() == 0) {
			departmentStoreList.add(departmentStore);
		} else {
			departmentStoreList.set(0, departmentStore);
		}
	}

	@Override
	public List<DepartmentStore> getDepartmentStoreList() {
		return departmentStoreList;
	}

	@Override
	public void setDepartmentStoreList(List<DepartmentStore> departmentStoreList) {
		this.departmentStoreList = departmentStoreList;
	}

	@Override
	public boolean hasDepartmentStore() {
		return departmentStoreList != null && departmentStoreList.size() > 0 && departmentStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(DepositAccount depositAccount) {
		depositAccountList = new ArrayList<DepositAccount>();
		depositAccountList.add(depositAccount);
	}

	@Override
	public DepositAccount getDepositAccount() {
		if(depositAccountList != null && depositAccountList.size() > 0) {
			return depositAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDepositAccount(DepositAccount depositAccount) {
		if(depositAccountList == null) {
			depositAccountList = new ArrayList<>();
		}
		if(depositAccountList.size() == 0) {
			depositAccountList.add(depositAccount);
		} else {
			depositAccountList.set(0, depositAccount);
		}
	}

	@Override
	public List<DepositAccount> getDepositAccountList() {
		return depositAccountList;
	}

	@Override
	public void setDepositAccountList(List<DepositAccount> depositAccountList) {
		this.depositAccountList = depositAccountList;
	}

	@Override
	public boolean hasDepositAccount() {
		return depositAccountList != null && depositAccountList.size() > 0 && depositAccountList.get(0) != null;
	}

	public ITEM_REVIEWED(Dermatology dermatology) {
		dermatologyList = new ArrayList<Dermatology>();
		dermatologyList.add(dermatology);
	}

	@Override
	public Dermatology getDermatology() {
		if(dermatologyList != null && dermatologyList.size() > 0) {
			return dermatologyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDermatology(Dermatology dermatology) {
		if(dermatologyList == null) {
			dermatologyList = new ArrayList<>();
		}
		if(dermatologyList.size() == 0) {
			dermatologyList.add(dermatology);
		} else {
			dermatologyList.set(0, dermatology);
		}
	}

	@Override
	public List<Dermatology> getDermatologyList() {
		return dermatologyList;
	}

	@Override
	public void setDermatologyList(List<Dermatology> dermatologyList) {
		this.dermatologyList = dermatologyList;
	}

	@Override
	public boolean hasDermatology() {
		return dermatologyList != null && dermatologyList.size() > 0 && dermatologyList.get(0) != null;
	}

	public ITEM_REVIEWED(DiagnosticLab diagnosticLab) {
		diagnosticLabList = new ArrayList<DiagnosticLab>();
		diagnosticLabList.add(diagnosticLab);
	}

	@Override
	public DiagnosticLab getDiagnosticLab() {
		if(diagnosticLabList != null && diagnosticLabList.size() > 0) {
			return diagnosticLabList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiagnosticLab(DiagnosticLab diagnosticLab) {
		if(diagnosticLabList == null) {
			diagnosticLabList = new ArrayList<>();
		}
		if(diagnosticLabList.size() == 0) {
			diagnosticLabList.add(diagnosticLab);
		} else {
			diagnosticLabList.set(0, diagnosticLab);
		}
	}

	@Override
	public List<DiagnosticLab> getDiagnosticLabList() {
		return diagnosticLabList;
	}

	@Override
	public void setDiagnosticLabList(List<DiagnosticLab> diagnosticLabList) {
		this.diagnosticLabList = diagnosticLabList;
	}

	@Override
	public boolean hasDiagnosticLab() {
		return diagnosticLabList != null && diagnosticLabList.size() > 0 && diagnosticLabList.get(0) != null;
	}

	public ITEM_REVIEWED(DiagnosticProcedure diagnosticProcedure) {
		diagnosticProcedureList = new ArrayList<DiagnosticProcedure>();
		diagnosticProcedureList.add(diagnosticProcedure);
	}

	@Override
	public DiagnosticProcedure getDiagnosticProcedure() {
		if(diagnosticProcedureList != null && diagnosticProcedureList.size() > 0) {
			return diagnosticProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiagnosticProcedure(DiagnosticProcedure diagnosticProcedure) {
		if(diagnosticProcedureList == null) {
			diagnosticProcedureList = new ArrayList<>();
		}
		if(diagnosticProcedureList.size() == 0) {
			diagnosticProcedureList.add(diagnosticProcedure);
		} else {
			diagnosticProcedureList.set(0, diagnosticProcedure);
		}
	}

	@Override
	public List<DiagnosticProcedure> getDiagnosticProcedureList() {
		return diagnosticProcedureList;
	}

	@Override
	public void setDiagnosticProcedureList(List<DiagnosticProcedure> diagnosticProcedureList) {
		this.diagnosticProcedureList = diagnosticProcedureList;
	}

	@Override
	public boolean hasDiagnosticProcedure() {
		return diagnosticProcedureList != null && diagnosticProcedureList.size() > 0 && diagnosticProcedureList.get(0) != null;
	}

	public ITEM_REVIEWED(Diet diet) {
		dietList = new ArrayList<Diet>();
		dietList.add(diet);
	}

	@Override
	public Diet getDiet() {
		if(dietList != null && dietList.size() > 0) {
			return dietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiet(Diet diet) {
		if(dietList == null) {
			dietList = new ArrayList<>();
		}
		if(dietList.size() == 0) {
			dietList.add(diet);
		} else {
			dietList.set(0, diet);
		}
	}

	@Override
	public List<Diet> getDietList() {
		return dietList;
	}

	@Override
	public void setDietList(List<Diet> dietList) {
		this.dietList = dietList;
	}

	@Override
	public boolean hasDiet() {
		return dietList != null && dietList.size() > 0 && dietList.get(0) != null;
	}

	public ITEM_REVIEWED(DietNutrition dietNutrition) {
		dietNutritionList = new ArrayList<DietNutrition>();
		dietNutritionList.add(dietNutrition);
	}

	@Override
	public DietNutrition getDietNutrition() {
		if(dietNutritionList != null && dietNutritionList.size() > 0) {
			return dietNutritionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDietNutrition(DietNutrition dietNutrition) {
		if(dietNutritionList == null) {
			dietNutritionList = new ArrayList<>();
		}
		if(dietNutritionList.size() == 0) {
			dietNutritionList.add(dietNutrition);
		} else {
			dietNutritionList.set(0, dietNutrition);
		}
	}

	@Override
	public List<DietNutrition> getDietNutritionList() {
		return dietNutritionList;
	}

	@Override
	public void setDietNutritionList(List<DietNutrition> dietNutritionList) {
		this.dietNutritionList = dietNutritionList;
	}

	@Override
	public boolean hasDietNutrition() {
		return dietNutritionList != null && dietNutritionList.size() > 0 && dietNutritionList.get(0) != null;
	}

	public ITEM_REVIEWED(DietarySupplement dietarySupplement) {
		dietarySupplementList = new ArrayList<DietarySupplement>();
		dietarySupplementList.add(dietarySupplement);
	}

	@Override
	public DietarySupplement getDietarySupplement() {
		if(dietarySupplementList != null && dietarySupplementList.size() > 0) {
			return dietarySupplementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDietarySupplement(DietarySupplement dietarySupplement) {
		if(dietarySupplementList == null) {
			dietarySupplementList = new ArrayList<>();
		}
		if(dietarySupplementList.size() == 0) {
			dietarySupplementList.add(dietarySupplement);
		} else {
			dietarySupplementList.set(0, dietarySupplement);
		}
	}

	@Override
	public List<DietarySupplement> getDietarySupplementList() {
		return dietarySupplementList;
	}

	@Override
	public void setDietarySupplementList(List<DietarySupplement> dietarySupplementList) {
		this.dietarySupplementList = dietarySupplementList;
	}

	@Override
	public boolean hasDietarySupplement() {
		return dietarySupplementList != null && dietarySupplementList.size() > 0 && dietarySupplementList.get(0) != null;
	}

	public ITEM_REVIEWED(DigitalDocument digitalDocument) {
		digitalDocumentList = new ArrayList<DigitalDocument>();
		digitalDocumentList.add(digitalDocument);
	}

	@Override
	public DigitalDocument getDigitalDocument() {
		if(digitalDocumentList != null && digitalDocumentList.size() > 0) {
			return digitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocument(DigitalDocument digitalDocument) {
		if(digitalDocumentList == null) {
			digitalDocumentList = new ArrayList<>();
		}
		if(digitalDocumentList.size() == 0) {
			digitalDocumentList.add(digitalDocument);
		} else {
			digitalDocumentList.set(0, digitalDocument);
		}
	}

	@Override
	public List<DigitalDocument> getDigitalDocumentList() {
		return digitalDocumentList;
	}

	@Override
	public void setDigitalDocumentList(List<DigitalDocument> digitalDocumentList) {
		this.digitalDocumentList = digitalDocumentList;
	}

	@Override
	public boolean hasDigitalDocument() {
		return digitalDocumentList != null && digitalDocumentList.size() > 0 && digitalDocumentList.get(0) != null;
	}

	public ITEM_REVIEWED(DigitalDocumentPermission digitalDocumentPermission) {
		digitalDocumentPermissionList = new ArrayList<DigitalDocumentPermission>();
		digitalDocumentPermissionList.add(digitalDocumentPermission);
	}

	@Override
	public DigitalDocumentPermission getDigitalDocumentPermission() {
		if(digitalDocumentPermissionList != null && digitalDocumentPermissionList.size() > 0) {
			return digitalDocumentPermissionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocumentPermission(DigitalDocumentPermission digitalDocumentPermission) {
		if(digitalDocumentPermissionList == null) {
			digitalDocumentPermissionList = new ArrayList<>();
		}
		if(digitalDocumentPermissionList.size() == 0) {
			digitalDocumentPermissionList.add(digitalDocumentPermission);
		} else {
			digitalDocumentPermissionList.set(0, digitalDocumentPermission);
		}
	}

	@Override
	public List<DigitalDocumentPermission> getDigitalDocumentPermissionList() {
		return digitalDocumentPermissionList;
	}

	@Override
	public void setDigitalDocumentPermissionList(List<DigitalDocumentPermission> digitalDocumentPermissionList) {
		this.digitalDocumentPermissionList = digitalDocumentPermissionList;
	}

	@Override
	public boolean hasDigitalDocumentPermission() {
		return digitalDocumentPermissionList != null && digitalDocumentPermissionList.size() > 0 && digitalDocumentPermissionList.get(0) != null;
	}

	public ITEM_REVIEWED(DigitalDocumentPermissionType digitalDocumentPermissionType) {
		digitalDocumentPermissionTypeList = new ArrayList<DigitalDocumentPermissionType>();
		digitalDocumentPermissionTypeList.add(digitalDocumentPermissionType);
	}

	@Override
	public DigitalDocumentPermissionType getDigitalDocumentPermissionType() {
		if(digitalDocumentPermissionTypeList != null && digitalDocumentPermissionTypeList.size() > 0) {
			return digitalDocumentPermissionTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocumentPermissionType(DigitalDocumentPermissionType digitalDocumentPermissionType) {
		if(digitalDocumentPermissionTypeList == null) {
			digitalDocumentPermissionTypeList = new ArrayList<>();
		}
		if(digitalDocumentPermissionTypeList.size() == 0) {
			digitalDocumentPermissionTypeList.add(digitalDocumentPermissionType);
		} else {
			digitalDocumentPermissionTypeList.set(0, digitalDocumentPermissionType);
		}
	}

	@Override
	public List<DigitalDocumentPermissionType> getDigitalDocumentPermissionTypeList() {
		return digitalDocumentPermissionTypeList;
	}

	@Override
	public void setDigitalDocumentPermissionTypeList(List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList) {
		this.digitalDocumentPermissionTypeList = digitalDocumentPermissionTypeList;
	}

	@Override
	public boolean hasDigitalDocumentPermissionType() {
		return digitalDocumentPermissionTypeList != null && digitalDocumentPermissionTypeList.size() > 0 && digitalDocumentPermissionTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(DisagreeAction disagreeAction) {
		disagreeActionList = new ArrayList<DisagreeAction>();
		disagreeActionList.add(disagreeAction);
	}

	@Override
	public DisagreeAction getDisagreeAction() {
		if(disagreeActionList != null && disagreeActionList.size() > 0) {
			return disagreeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDisagreeAction(DisagreeAction disagreeAction) {
		if(disagreeActionList == null) {
			disagreeActionList = new ArrayList<>();
		}
		if(disagreeActionList.size() == 0) {
			disagreeActionList.add(disagreeAction);
		} else {
			disagreeActionList.set(0, disagreeAction);
		}
	}

	@Override
	public List<DisagreeAction> getDisagreeActionList() {
		return disagreeActionList;
	}

	@Override
	public void setDisagreeActionList(List<DisagreeAction> disagreeActionList) {
		this.disagreeActionList = disagreeActionList;
	}

	@Override
	public boolean hasDisagreeAction() {
		return disagreeActionList != null && disagreeActionList.size() > 0 && disagreeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DiscoverAction discoverAction) {
		discoverActionList = new ArrayList<DiscoverAction>();
		discoverActionList.add(discoverAction);
	}

	@Override
	public DiscoverAction getDiscoverAction() {
		if(discoverActionList != null && discoverActionList.size() > 0) {
			return discoverActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiscoverAction(DiscoverAction discoverAction) {
		if(discoverActionList == null) {
			discoverActionList = new ArrayList<>();
		}
		if(discoverActionList.size() == 0) {
			discoverActionList.add(discoverAction);
		} else {
			discoverActionList.set(0, discoverAction);
		}
	}

	@Override
	public List<DiscoverAction> getDiscoverActionList() {
		return discoverActionList;
	}

	@Override
	public void setDiscoverActionList(List<DiscoverAction> discoverActionList) {
		this.discoverActionList = discoverActionList;
	}

	@Override
	public boolean hasDiscoverAction() {
		return discoverActionList != null && discoverActionList.size() > 0 && discoverActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DiscussionForumPosting discussionForumPosting) {
		discussionForumPostingList = new ArrayList<DiscussionForumPosting>();
		discussionForumPostingList.add(discussionForumPosting);
	}

	@Override
	public DiscussionForumPosting getDiscussionForumPosting() {
		if(discussionForumPostingList != null && discussionForumPostingList.size() > 0) {
			return discussionForumPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiscussionForumPosting(DiscussionForumPosting discussionForumPosting) {
		if(discussionForumPostingList == null) {
			discussionForumPostingList = new ArrayList<>();
		}
		if(discussionForumPostingList.size() == 0) {
			discussionForumPostingList.add(discussionForumPosting);
		} else {
			discussionForumPostingList.set(0, discussionForumPosting);
		}
	}

	@Override
	public List<DiscussionForumPosting> getDiscussionForumPostingList() {
		return discussionForumPostingList;
	}

	@Override
	public void setDiscussionForumPostingList(List<DiscussionForumPosting> discussionForumPostingList) {
		this.discussionForumPostingList = discussionForumPostingList;
	}

	@Override
	public boolean hasDiscussionForumPosting() {
		return discussionForumPostingList != null && discussionForumPostingList.size() > 0 && discussionForumPostingList.get(0) != null;
	}

	public ITEM_REVIEWED(DislikeAction dislikeAction) {
		dislikeActionList = new ArrayList<DislikeAction>();
		dislikeActionList.add(dislikeAction);
	}

	@Override
	public DislikeAction getDislikeAction() {
		if(dislikeActionList != null && dislikeActionList.size() > 0) {
			return dislikeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDislikeAction(DislikeAction dislikeAction) {
		if(dislikeActionList == null) {
			dislikeActionList = new ArrayList<>();
		}
		if(dislikeActionList.size() == 0) {
			dislikeActionList.add(dislikeAction);
		} else {
			dislikeActionList.set(0, dislikeAction);
		}
	}

	@Override
	public List<DislikeAction> getDislikeActionList() {
		return dislikeActionList;
	}

	@Override
	public void setDislikeActionList(List<DislikeAction> dislikeActionList) {
		this.dislikeActionList = dislikeActionList;
	}

	@Override
	public boolean hasDislikeAction() {
		return dislikeActionList != null && dislikeActionList.size() > 0 && dislikeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Distance distance) {
		distanceList = new ArrayList<Distance>();
		distanceList.add(distance);
	}

	@Override
	public Distance getDistance() {
		if(distanceList != null && distanceList.size() > 0) {
			return distanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDistance(Distance distance) {
		if(distanceList == null) {
			distanceList = new ArrayList<>();
		}
		if(distanceList.size() == 0) {
			distanceList.add(distance);
		} else {
			distanceList.set(0, distance);
		}
	}

	@Override
	public List<Distance> getDistanceList() {
		return distanceList;
	}

	@Override
	public void setDistanceList(List<Distance> distanceList) {
		this.distanceList = distanceList;
	}

	@Override
	public boolean hasDistance() {
		return distanceList != null && distanceList.size() > 0 && distanceList.get(0) != null;
	}

	public ITEM_REVIEWED(Distillery distillery) {
		distilleryList = new ArrayList<Distillery>();
		distilleryList.add(distillery);
	}

	@Override
	public Distillery getDistillery() {
		if(distilleryList != null && distilleryList.size() > 0) {
			return distilleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDistillery(Distillery distillery) {
		if(distilleryList == null) {
			distilleryList = new ArrayList<>();
		}
		if(distilleryList.size() == 0) {
			distilleryList.add(distillery);
		} else {
			distilleryList.set(0, distillery);
		}
	}

	@Override
	public List<Distillery> getDistilleryList() {
		return distilleryList;
	}

	@Override
	public void setDistilleryList(List<Distillery> distilleryList) {
		this.distilleryList = distilleryList;
	}

	@Override
	public boolean hasDistillery() {
		return distilleryList != null && distilleryList.size() > 0 && distilleryList.get(0) != null;
	}

	public ITEM_REVIEWED(DonateAction donateAction) {
		donateActionList = new ArrayList<DonateAction>();
		donateActionList.add(donateAction);
	}

	@Override
	public DonateAction getDonateAction() {
		if(donateActionList != null && donateActionList.size() > 0) {
			return donateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDonateAction(DonateAction donateAction) {
		if(donateActionList == null) {
			donateActionList = new ArrayList<>();
		}
		if(donateActionList.size() == 0) {
			donateActionList.add(donateAction);
		} else {
			donateActionList.set(0, donateAction);
		}
	}

	@Override
	public List<DonateAction> getDonateActionList() {
		return donateActionList;
	}

	@Override
	public void setDonateActionList(List<DonateAction> donateActionList) {
		this.donateActionList = donateActionList;
	}

	@Override
	public boolean hasDonateAction() {
		return donateActionList != null && donateActionList.size() > 0 && donateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DoseSchedule doseSchedule) {
		doseScheduleList = new ArrayList<DoseSchedule>();
		doseScheduleList.add(doseSchedule);
	}

	@Override
	public DoseSchedule getDoseSchedule() {
		if(doseScheduleList != null && doseScheduleList.size() > 0) {
			return doseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDoseSchedule(DoseSchedule doseSchedule) {
		if(doseScheduleList == null) {
			doseScheduleList = new ArrayList<>();
		}
		if(doseScheduleList.size() == 0) {
			doseScheduleList.add(doseSchedule);
		} else {
			doseScheduleList.set(0, doseSchedule);
		}
	}

	@Override
	public List<DoseSchedule> getDoseScheduleList() {
		return doseScheduleList;
	}

	@Override
	public void setDoseScheduleList(List<DoseSchedule> doseScheduleList) {
		this.doseScheduleList = doseScheduleList;
	}

	@Override
	public boolean hasDoseSchedule() {
		return doseScheduleList != null && doseScheduleList.size() > 0 && doseScheduleList.get(0) != null;
	}

	public ITEM_REVIEWED(DownloadAction downloadAction) {
		downloadActionList = new ArrayList<DownloadAction>();
		downloadActionList.add(downloadAction);
	}

	@Override
	public DownloadAction getDownloadAction() {
		if(downloadActionList != null && downloadActionList.size() > 0) {
			return downloadActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDownloadAction(DownloadAction downloadAction) {
		if(downloadActionList == null) {
			downloadActionList = new ArrayList<>();
		}
		if(downloadActionList.size() == 0) {
			downloadActionList.add(downloadAction);
		} else {
			downloadActionList.set(0, downloadAction);
		}
	}

	@Override
	public List<DownloadAction> getDownloadActionList() {
		return downloadActionList;
	}

	@Override
	public void setDownloadActionList(List<DownloadAction> downloadActionList) {
		this.downloadActionList = downloadActionList;
	}

	@Override
	public boolean hasDownloadAction() {
		return downloadActionList != null && downloadActionList.size() > 0 && downloadActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DrawAction drawAction) {
		drawActionList = new ArrayList<DrawAction>();
		drawActionList.add(drawAction);
	}

	@Override
	public DrawAction getDrawAction() {
		if(drawActionList != null && drawActionList.size() > 0) {
			return drawActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrawAction(DrawAction drawAction) {
		if(drawActionList == null) {
			drawActionList = new ArrayList<>();
		}
		if(drawActionList.size() == 0) {
			drawActionList.add(drawAction);
		} else {
			drawActionList.set(0, drawAction);
		}
	}

	@Override
	public List<DrawAction> getDrawActionList() {
		return drawActionList;
	}

	@Override
	public void setDrawActionList(List<DrawAction> drawActionList) {
		this.drawActionList = drawActionList;
	}

	@Override
	public boolean hasDrawAction() {
		return drawActionList != null && drawActionList.size() > 0 && drawActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DrinkAction drinkAction) {
		drinkActionList = new ArrayList<DrinkAction>();
		drinkActionList.add(drinkAction);
	}

	@Override
	public DrinkAction getDrinkAction() {
		if(drinkActionList != null && drinkActionList.size() > 0) {
			return drinkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrinkAction(DrinkAction drinkAction) {
		if(drinkActionList == null) {
			drinkActionList = new ArrayList<>();
		}
		if(drinkActionList.size() == 0) {
			drinkActionList.add(drinkAction);
		} else {
			drinkActionList.set(0, drinkAction);
		}
	}

	@Override
	public List<DrinkAction> getDrinkActionList() {
		return drinkActionList;
	}

	@Override
	public void setDrinkActionList(List<DrinkAction> drinkActionList) {
		this.drinkActionList = drinkActionList;
	}

	@Override
	public boolean hasDrinkAction() {
		return drinkActionList != null && drinkActionList.size() > 0 && drinkActionList.get(0) != null;
	}

	public ITEM_REVIEWED(DriveWheelConfigurationValue driveWheelConfigurationValue) {
		driveWheelConfigurationValueList = new ArrayList<DriveWheelConfigurationValue>();
		driveWheelConfigurationValueList.add(driveWheelConfigurationValue);
	}

	@Override
	public DriveWheelConfigurationValue getDriveWheelConfigurationValue() {
		if(driveWheelConfigurationValueList != null && driveWheelConfigurationValueList.size() > 0) {
			return driveWheelConfigurationValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDriveWheelConfigurationValue(DriveWheelConfigurationValue driveWheelConfigurationValue) {
		if(driveWheelConfigurationValueList == null) {
			driveWheelConfigurationValueList = new ArrayList<>();
		}
		if(driveWheelConfigurationValueList.size() == 0) {
			driveWheelConfigurationValueList.add(driveWheelConfigurationValue);
		} else {
			driveWheelConfigurationValueList.set(0, driveWheelConfigurationValue);
		}
	}

	@Override
	public List<DriveWheelConfigurationValue> getDriveWheelConfigurationValueList() {
		return driveWheelConfigurationValueList;
	}

	@Override
	public void setDriveWheelConfigurationValueList(List<DriveWheelConfigurationValue> driveWheelConfigurationValueList) {
		this.driveWheelConfigurationValueList = driveWheelConfigurationValueList;
	}

	@Override
	public boolean hasDriveWheelConfigurationValue() {
		return driveWheelConfigurationValueList != null && driveWheelConfigurationValueList.size() > 0 && driveWheelConfigurationValueList.get(0) != null;
	}

	public ITEM_REVIEWED(Drug drug) {
		drugList = new ArrayList<Drug>();
		drugList.add(drug);
	}

	@Override
	public Drug getDrug() {
		if(drugList != null && drugList.size() > 0) {
			return drugList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrug(Drug drug) {
		if(drugList == null) {
			drugList = new ArrayList<>();
		}
		if(drugList.size() == 0) {
			drugList.add(drug);
		} else {
			drugList.set(0, drug);
		}
	}

	@Override
	public List<Drug> getDrugList() {
		return drugList;
	}

	@Override
	public void setDrugList(List<Drug> drugList) {
		this.drugList = drugList;
	}

	@Override
	public boolean hasDrug() {
		return drugList != null && drugList.size() > 0 && drugList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugClass drugClass) {
		drugClassList = new ArrayList<DrugClass>();
		drugClassList.add(drugClass);
	}

	@Override
	public DrugClass getDrugClass() {
		if(drugClassList != null && drugClassList.size() > 0) {
			return drugClassList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugClass(DrugClass drugClass) {
		if(drugClassList == null) {
			drugClassList = new ArrayList<>();
		}
		if(drugClassList.size() == 0) {
			drugClassList.add(drugClass);
		} else {
			drugClassList.set(0, drugClass);
		}
	}

	@Override
	public List<DrugClass> getDrugClassList() {
		return drugClassList;
	}

	@Override
	public void setDrugClassList(List<DrugClass> drugClassList) {
		this.drugClassList = drugClassList;
	}

	@Override
	public boolean hasDrugClass() {
		return drugClassList != null && drugClassList.size() > 0 && drugClassList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugCost drugCost) {
		drugCostList = new ArrayList<DrugCost>();
		drugCostList.add(drugCost);
	}

	@Override
	public DrugCost getDrugCost() {
		if(drugCostList != null && drugCostList.size() > 0) {
			return drugCostList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCost(DrugCost drugCost) {
		if(drugCostList == null) {
			drugCostList = new ArrayList<>();
		}
		if(drugCostList.size() == 0) {
			drugCostList.add(drugCost);
		} else {
			drugCostList.set(0, drugCost);
		}
	}

	@Override
	public List<DrugCost> getDrugCostList() {
		return drugCostList;
	}

	@Override
	public void setDrugCostList(List<DrugCost> drugCostList) {
		this.drugCostList = drugCostList;
	}

	@Override
	public boolean hasDrugCost() {
		return drugCostList != null && drugCostList.size() > 0 && drugCostList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugCostCategory drugCostCategory) {
		drugCostCategoryList = new ArrayList<DrugCostCategory>();
		drugCostCategoryList.add(drugCostCategory);
	}

	@Override
	public DrugCostCategory getDrugCostCategory() {
		if(drugCostCategoryList != null && drugCostCategoryList.size() > 0) {
			return drugCostCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCostCategory(DrugCostCategory drugCostCategory) {
		if(drugCostCategoryList == null) {
			drugCostCategoryList = new ArrayList<>();
		}
		if(drugCostCategoryList.size() == 0) {
			drugCostCategoryList.add(drugCostCategory);
		} else {
			drugCostCategoryList.set(0, drugCostCategory);
		}
	}

	@Override
	public List<DrugCostCategory> getDrugCostCategoryList() {
		return drugCostCategoryList;
	}

	@Override
	public void setDrugCostCategoryList(List<DrugCostCategory> drugCostCategoryList) {
		this.drugCostCategoryList = drugCostCategoryList;
	}

	@Override
	public boolean hasDrugCostCategory() {
		return drugCostCategoryList != null && drugCostCategoryList.size() > 0 && drugCostCategoryList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugLegalStatus drugLegalStatus) {
		drugLegalStatusList = new ArrayList<DrugLegalStatus>();
		drugLegalStatusList.add(drugLegalStatus);
	}

	@Override
	public DrugLegalStatus getDrugLegalStatus() {
		if(drugLegalStatusList != null && drugLegalStatusList.size() > 0) {
			return drugLegalStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugLegalStatus(DrugLegalStatus drugLegalStatus) {
		if(drugLegalStatusList == null) {
			drugLegalStatusList = new ArrayList<>();
		}
		if(drugLegalStatusList.size() == 0) {
			drugLegalStatusList.add(drugLegalStatus);
		} else {
			drugLegalStatusList.set(0, drugLegalStatus);
		}
	}

	@Override
	public List<DrugLegalStatus> getDrugLegalStatusList() {
		return drugLegalStatusList;
	}

	@Override
	public void setDrugLegalStatusList(List<DrugLegalStatus> drugLegalStatusList) {
		this.drugLegalStatusList = drugLegalStatusList;
	}

	@Override
	public boolean hasDrugLegalStatus() {
		return drugLegalStatusList != null && drugLegalStatusList.size() > 0 && drugLegalStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugPregnancyCategory drugPregnancyCategory) {
		drugPregnancyCategoryList = new ArrayList<DrugPregnancyCategory>();
		drugPregnancyCategoryList.add(drugPregnancyCategory);
	}

	@Override
	public DrugPregnancyCategory getDrugPregnancyCategory() {
		if(drugPregnancyCategoryList != null && drugPregnancyCategoryList.size() > 0) {
			return drugPregnancyCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugPregnancyCategory(DrugPregnancyCategory drugPregnancyCategory) {
		if(drugPregnancyCategoryList == null) {
			drugPregnancyCategoryList = new ArrayList<>();
		}
		if(drugPregnancyCategoryList.size() == 0) {
			drugPregnancyCategoryList.add(drugPregnancyCategory);
		} else {
			drugPregnancyCategoryList.set(0, drugPregnancyCategory);
		}
	}

	@Override
	public List<DrugPregnancyCategory> getDrugPregnancyCategoryList() {
		return drugPregnancyCategoryList;
	}

	@Override
	public void setDrugPregnancyCategoryList(List<DrugPregnancyCategory> drugPregnancyCategoryList) {
		this.drugPregnancyCategoryList = drugPregnancyCategoryList;
	}

	@Override
	public boolean hasDrugPregnancyCategory() {
		return drugPregnancyCategoryList != null && drugPregnancyCategoryList.size() > 0 && drugPregnancyCategoryList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugPrescriptionStatus drugPrescriptionStatus) {
		drugPrescriptionStatusList = new ArrayList<DrugPrescriptionStatus>();
		drugPrescriptionStatusList.add(drugPrescriptionStatus);
	}

	@Override
	public DrugPrescriptionStatus getDrugPrescriptionStatus() {
		if(drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0) {
			return drugPrescriptionStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugPrescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus) {
		if(drugPrescriptionStatusList == null) {
			drugPrescriptionStatusList = new ArrayList<>();
		}
		if(drugPrescriptionStatusList.size() == 0) {
			drugPrescriptionStatusList.add(drugPrescriptionStatus);
		} else {
			drugPrescriptionStatusList.set(0, drugPrescriptionStatus);
		}
	}

	@Override
	public List<DrugPrescriptionStatus> getDrugPrescriptionStatusList() {
		return drugPrescriptionStatusList;
	}

	@Override
	public void setDrugPrescriptionStatusList(List<DrugPrescriptionStatus> drugPrescriptionStatusList) {
		this.drugPrescriptionStatusList = drugPrescriptionStatusList;
	}

	@Override
	public boolean hasDrugPrescriptionStatus() {
		return drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0 && drugPrescriptionStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(DrugStrength drugStrength) {
		drugStrengthList = new ArrayList<DrugStrength>();
		drugStrengthList.add(drugStrength);
	}

	@Override
	public DrugStrength getDrugStrength() {
		if(drugStrengthList != null && drugStrengthList.size() > 0) {
			return drugStrengthList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugStrength(DrugStrength drugStrength) {
		if(drugStrengthList == null) {
			drugStrengthList = new ArrayList<>();
		}
		if(drugStrengthList.size() == 0) {
			drugStrengthList.add(drugStrength);
		} else {
			drugStrengthList.set(0, drugStrength);
		}
	}

	@Override
	public List<DrugStrength> getDrugStrengthList() {
		return drugStrengthList;
	}

	@Override
	public void setDrugStrengthList(List<DrugStrength> drugStrengthList) {
		this.drugStrengthList = drugStrengthList;
	}

	@Override
	public boolean hasDrugStrength() {
		return drugStrengthList != null && drugStrengthList.size() > 0 && drugStrengthList.get(0) != null;
	}

	public ITEM_REVIEWED(DryCleaningOrLaundry dryCleaningOrLaundry) {
		dryCleaningOrLaundryList = new ArrayList<DryCleaningOrLaundry>();
		dryCleaningOrLaundryList.add(dryCleaningOrLaundry);
	}

	@Override
	public DryCleaningOrLaundry getDryCleaningOrLaundry() {
		if(dryCleaningOrLaundryList != null && dryCleaningOrLaundryList.size() > 0) {
			return dryCleaningOrLaundryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDryCleaningOrLaundry(DryCleaningOrLaundry dryCleaningOrLaundry) {
		if(dryCleaningOrLaundryList == null) {
			dryCleaningOrLaundryList = new ArrayList<>();
		}
		if(dryCleaningOrLaundryList.size() == 0) {
			dryCleaningOrLaundryList.add(dryCleaningOrLaundry);
		} else {
			dryCleaningOrLaundryList.set(0, dryCleaningOrLaundry);
		}
	}

	@Override
	public List<DryCleaningOrLaundry> getDryCleaningOrLaundryList() {
		return dryCleaningOrLaundryList;
	}

	@Override
	public void setDryCleaningOrLaundryList(List<DryCleaningOrLaundry> dryCleaningOrLaundryList) {
		this.dryCleaningOrLaundryList = dryCleaningOrLaundryList;
	}

	@Override
	public boolean hasDryCleaningOrLaundry() {
		return dryCleaningOrLaundryList != null && dryCleaningOrLaundryList.size() > 0 && dryCleaningOrLaundryList.get(0) != null;
	}

	public ITEM_REVIEWED(Duration duration) {
		durationList = new ArrayList<Duration>();
		durationList.add(duration);
	}

	@Override
	public Duration getDuration() {
		if(durationList != null && durationList.size() > 0) {
			return durationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDuration(Duration duration) {
		if(durationList == null) {
			durationList = new ArrayList<>();
		}
		if(durationList.size() == 0) {
			durationList.add(duration);
		} else {
			durationList.set(0, duration);
		}
	}

	@Override
	public List<Duration> getDurationList() {
		return durationList;
	}

	@Override
	public void setDurationList(List<Duration> durationList) {
		this.durationList = durationList;
	}

	@Override
	public boolean hasDuration() {
		return durationList != null && durationList.size() > 0 && durationList.get(0) != null;
	}

	public ITEM_REVIEWED(EatAction eatAction) {
		eatActionList = new ArrayList<EatAction>();
		eatActionList.add(eatAction);
	}

	@Override
	public EatAction getEatAction() {
		if(eatActionList != null && eatActionList.size() > 0) {
			return eatActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEatAction(EatAction eatAction) {
		if(eatActionList == null) {
			eatActionList = new ArrayList<>();
		}
		if(eatActionList.size() == 0) {
			eatActionList.add(eatAction);
		} else {
			eatActionList.set(0, eatAction);
		}
	}

	@Override
	public List<EatAction> getEatActionList() {
		return eatActionList;
	}

	@Override
	public void setEatActionList(List<EatAction> eatActionList) {
		this.eatActionList = eatActionList;
	}

	@Override
	public boolean hasEatAction() {
		return eatActionList != null && eatActionList.size() > 0 && eatActionList.get(0) != null;
	}

	public ITEM_REVIEWED(EducationEvent educationEvent) {
		educationEventList = new ArrayList<EducationEvent>();
		educationEventList.add(educationEvent);
	}

	@Override
	public EducationEvent getEducationEvent() {
		if(educationEventList != null && educationEventList.size() > 0) {
			return educationEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationEvent(EducationEvent educationEvent) {
		if(educationEventList == null) {
			educationEventList = new ArrayList<>();
		}
		if(educationEventList.size() == 0) {
			educationEventList.add(educationEvent);
		} else {
			educationEventList.set(0, educationEvent);
		}
	}

	@Override
	public List<EducationEvent> getEducationEventList() {
		return educationEventList;
	}

	@Override
	public void setEducationEventList(List<EducationEvent> educationEventList) {
		this.educationEventList = educationEventList;
	}

	@Override
	public boolean hasEducationEvent() {
		return educationEventList != null && educationEventList.size() > 0 && educationEventList.get(0) != null;
	}

	public ITEM_REVIEWED(EducationalAudience educationalAudience) {
		educationalAudienceList = new ArrayList<EducationalAudience>();
		educationalAudienceList.add(educationalAudience);
	}

	@Override
	public EducationalAudience getEducationalAudience() {
		if(educationalAudienceList != null && educationalAudienceList.size() > 0) {
			return educationalAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationalAudience(EducationalAudience educationalAudience) {
		if(educationalAudienceList == null) {
			educationalAudienceList = new ArrayList<>();
		}
		if(educationalAudienceList.size() == 0) {
			educationalAudienceList.add(educationalAudience);
		} else {
			educationalAudienceList.set(0, educationalAudience);
		}
	}

	@Override
	public List<EducationalAudience> getEducationalAudienceList() {
		return educationalAudienceList;
	}

	@Override
	public void setEducationalAudienceList(List<EducationalAudience> educationalAudienceList) {
		this.educationalAudienceList = educationalAudienceList;
	}

	@Override
	public boolean hasEducationalAudience() {
		return educationalAudienceList != null && educationalAudienceList.size() > 0 && educationalAudienceList.get(0) != null;
	}

	public ITEM_REVIEWED(EducationalOrganization educationalOrganization) {
		educationalOrganizationList = new ArrayList<EducationalOrganization>();
		educationalOrganizationList.add(educationalOrganization);
	}

	@Override
	public EducationalOrganization getEducationalOrganization() {
		if(educationalOrganizationList != null && educationalOrganizationList.size() > 0) {
			return educationalOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationalOrganization(EducationalOrganization educationalOrganization) {
		if(educationalOrganizationList == null) {
			educationalOrganizationList = new ArrayList<>();
		}
		if(educationalOrganizationList.size() == 0) {
			educationalOrganizationList.add(educationalOrganization);
		} else {
			educationalOrganizationList.set(0, educationalOrganization);
		}
	}

	@Override
	public List<EducationalOrganization> getEducationalOrganizationList() {
		return educationalOrganizationList;
	}

	@Override
	public void setEducationalOrganizationList(List<EducationalOrganization> educationalOrganizationList) {
		this.educationalOrganizationList = educationalOrganizationList;
	}

	@Override
	public boolean hasEducationalOrganization() {
		return educationalOrganizationList != null && educationalOrganizationList.size() > 0 && educationalOrganizationList.get(0) != null;
	}

	public ITEM_REVIEWED(Electrician electrician) {
		electricianList = new ArrayList<Electrician>();
		electricianList.add(electrician);
	}

	@Override
	public Electrician getElectrician() {
		if(electricianList != null && electricianList.size() > 0) {
			return electricianList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setElectrician(Electrician electrician) {
		if(electricianList == null) {
			electricianList = new ArrayList<>();
		}
		if(electricianList.size() == 0) {
			electricianList.add(electrician);
		} else {
			electricianList.set(0, electrician);
		}
	}

	@Override
	public List<Electrician> getElectricianList() {
		return electricianList;
	}

	@Override
	public void setElectricianList(List<Electrician> electricianList) {
		this.electricianList = electricianList;
	}

	@Override
	public boolean hasElectrician() {
		return electricianList != null && electricianList.size() > 0 && electricianList.get(0) != null;
	}

	public ITEM_REVIEWED(ElectronicsStore electronicsStore) {
		electronicsStoreList = new ArrayList<ElectronicsStore>();
		electronicsStoreList.add(electronicsStore);
	}

	@Override
	public ElectronicsStore getElectronicsStore() {
		if(electronicsStoreList != null && electronicsStoreList.size() > 0) {
			return electronicsStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setElectronicsStore(ElectronicsStore electronicsStore) {
		if(electronicsStoreList == null) {
			electronicsStoreList = new ArrayList<>();
		}
		if(electronicsStoreList.size() == 0) {
			electronicsStoreList.add(electronicsStore);
		} else {
			electronicsStoreList.set(0, electronicsStore);
		}
	}

	@Override
	public List<ElectronicsStore> getElectronicsStoreList() {
		return electronicsStoreList;
	}

	@Override
	public void setElectronicsStoreList(List<ElectronicsStore> electronicsStoreList) {
		this.electronicsStoreList = electronicsStoreList;
	}

	@Override
	public boolean hasElectronicsStore() {
		return electronicsStoreList != null && electronicsStoreList.size() > 0 && electronicsStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(ElementarySchool elementarySchool) {
		elementarySchoolList = new ArrayList<ElementarySchool>();
		elementarySchoolList.add(elementarySchool);
	}

	@Override
	public ElementarySchool getElementarySchool() {
		if(elementarySchoolList != null && elementarySchoolList.size() > 0) {
			return elementarySchoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setElementarySchool(ElementarySchool elementarySchool) {
		if(elementarySchoolList == null) {
			elementarySchoolList = new ArrayList<>();
		}
		if(elementarySchoolList.size() == 0) {
			elementarySchoolList.add(elementarySchool);
		} else {
			elementarySchoolList.set(0, elementarySchool);
		}
	}

	@Override
	public List<ElementarySchool> getElementarySchoolList() {
		return elementarySchoolList;
	}

	@Override
	public void setElementarySchoolList(List<ElementarySchool> elementarySchoolList) {
		this.elementarySchoolList = elementarySchoolList;
	}

	@Override
	public boolean hasElementarySchool() {
		return elementarySchoolList != null && elementarySchoolList.size() > 0 && elementarySchoolList.get(0) != null;
	}

	public ITEM_REVIEWED(EmailMessage emailMessage) {
		emailMessageList = new ArrayList<EmailMessage>();
		emailMessageList.add(emailMessage);
	}

	@Override
	public EmailMessage getEmailMessage() {
		if(emailMessageList != null && emailMessageList.size() > 0) {
			return emailMessageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmailMessage(EmailMessage emailMessage) {
		if(emailMessageList == null) {
			emailMessageList = new ArrayList<>();
		}
		if(emailMessageList.size() == 0) {
			emailMessageList.add(emailMessage);
		} else {
			emailMessageList.set(0, emailMessage);
		}
	}

	@Override
	public List<EmailMessage> getEmailMessageList() {
		return emailMessageList;
	}

	@Override
	public void setEmailMessageList(List<EmailMessage> emailMessageList) {
		this.emailMessageList = emailMessageList;
	}

	@Override
	public boolean hasEmailMessage() {
		return emailMessageList != null && emailMessageList.size() > 0 && emailMessageList.get(0) != null;
	}

	public ITEM_REVIEWED(Embassy embassy) {
		embassyList = new ArrayList<Embassy>();
		embassyList.add(embassy);
	}

	@Override
	public Embassy getEmbassy() {
		if(embassyList != null && embassyList.size() > 0) {
			return embassyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmbassy(Embassy embassy) {
		if(embassyList == null) {
			embassyList = new ArrayList<>();
		}
		if(embassyList.size() == 0) {
			embassyList.add(embassy);
		} else {
			embassyList.set(0, embassy);
		}
	}

	@Override
	public List<Embassy> getEmbassyList() {
		return embassyList;
	}

	@Override
	public void setEmbassyList(List<Embassy> embassyList) {
		this.embassyList = embassyList;
	}

	@Override
	public boolean hasEmbassy() {
		return embassyList != null && embassyList.size() > 0 && embassyList.get(0) != null;
	}

	public ITEM_REVIEWED(Emergency emergency) {
		emergencyList = new ArrayList<Emergency>();
		emergencyList.add(emergency);
	}

	@Override
	public Emergency getEmergency() {
		if(emergencyList != null && emergencyList.size() > 0) {
			return emergencyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmergency(Emergency emergency) {
		if(emergencyList == null) {
			emergencyList = new ArrayList<>();
		}
		if(emergencyList.size() == 0) {
			emergencyList.add(emergency);
		} else {
			emergencyList.set(0, emergency);
		}
	}

	@Override
	public List<Emergency> getEmergencyList() {
		return emergencyList;
	}

	@Override
	public void setEmergencyList(List<Emergency> emergencyList) {
		this.emergencyList = emergencyList;
	}

	@Override
	public boolean hasEmergency() {
		return emergencyList != null && emergencyList.size() > 0 && emergencyList.get(0) != null;
	}

	public ITEM_REVIEWED(EmergencyService emergencyService) {
		emergencyServiceList = new ArrayList<EmergencyService>();
		emergencyServiceList.add(emergencyService);
	}

	@Override
	public EmergencyService getEmergencyService() {
		if(emergencyServiceList != null && emergencyServiceList.size() > 0) {
			return emergencyServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmergencyService(EmergencyService emergencyService) {
		if(emergencyServiceList == null) {
			emergencyServiceList = new ArrayList<>();
		}
		if(emergencyServiceList.size() == 0) {
			emergencyServiceList.add(emergencyService);
		} else {
			emergencyServiceList.set(0, emergencyService);
		}
	}

	@Override
	public List<EmergencyService> getEmergencyServiceList() {
		return emergencyServiceList;
	}

	@Override
	public void setEmergencyServiceList(List<EmergencyService> emergencyServiceList) {
		this.emergencyServiceList = emergencyServiceList;
	}

	@Override
	public boolean hasEmergencyService() {
		return emergencyServiceList != null && emergencyServiceList.size() > 0 && emergencyServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(EmployeeRole employeeRole) {
		employeeRoleList = new ArrayList<EmployeeRole>();
		employeeRoleList.add(employeeRole);
	}

	@Override
	public EmployeeRole getEmployeeRole() {
		if(employeeRoleList != null && employeeRoleList.size() > 0) {
			return employeeRoleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmployeeRole(EmployeeRole employeeRole) {
		if(employeeRoleList == null) {
			employeeRoleList = new ArrayList<>();
		}
		if(employeeRoleList.size() == 0) {
			employeeRoleList.add(employeeRole);
		} else {
			employeeRoleList.set(0, employeeRole);
		}
	}

	@Override
	public List<EmployeeRole> getEmployeeRoleList() {
		return employeeRoleList;
	}

	@Override
	public void setEmployeeRoleList(List<EmployeeRole> employeeRoleList) {
		this.employeeRoleList = employeeRoleList;
	}

	@Override
	public boolean hasEmployeeRole() {
		return employeeRoleList != null && employeeRoleList.size() > 0 && employeeRoleList.get(0) != null;
	}

	public ITEM_REVIEWED(EmployerAggregateRating employerAggregateRating) {
		employerAggregateRatingList = new ArrayList<EmployerAggregateRating>();
		employerAggregateRatingList.add(employerAggregateRating);
	}

	@Override
	public EmployerAggregateRating getEmployerAggregateRating() {
		if(employerAggregateRatingList != null && employerAggregateRatingList.size() > 0) {
			return employerAggregateRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmployerAggregateRating(EmployerAggregateRating employerAggregateRating) {
		if(employerAggregateRatingList == null) {
			employerAggregateRatingList = new ArrayList<>();
		}
		if(employerAggregateRatingList.size() == 0) {
			employerAggregateRatingList.add(employerAggregateRating);
		} else {
			employerAggregateRatingList.set(0, employerAggregateRating);
		}
	}

	@Override
	public List<EmployerAggregateRating> getEmployerAggregateRatingList() {
		return employerAggregateRatingList;
	}

	@Override
	public void setEmployerAggregateRatingList(List<EmployerAggregateRating> employerAggregateRatingList) {
		this.employerAggregateRatingList = employerAggregateRatingList;
	}

	@Override
	public boolean hasEmployerAggregateRating() {
		return employerAggregateRatingList != null && employerAggregateRatingList.size() > 0 && employerAggregateRatingList.get(0) != null;
	}

	public ITEM_REVIEWED(EmployerReview employerReview) {
		employerReviewList = new ArrayList<EmployerReview>();
		employerReviewList.add(employerReview);
	}

	@Override
	public EmployerReview getEmployerReview() {
		if(employerReviewList != null && employerReviewList.size() > 0) {
			return employerReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmployerReview(EmployerReview employerReview) {
		if(employerReviewList == null) {
			employerReviewList = new ArrayList<>();
		}
		if(employerReviewList.size() == 0) {
			employerReviewList.add(employerReview);
		} else {
			employerReviewList.set(0, employerReview);
		}
	}

	@Override
	public List<EmployerReview> getEmployerReviewList() {
		return employerReviewList;
	}

	@Override
	public void setEmployerReviewList(List<EmployerReview> employerReviewList) {
		this.employerReviewList = employerReviewList;
	}

	@Override
	public boolean hasEmployerReview() {
		return employerReviewList != null && employerReviewList.size() > 0 && employerReviewList.get(0) != null;
	}

	public ITEM_REVIEWED(EmploymentAgency employmentAgency) {
		employmentAgencyList = new ArrayList<EmploymentAgency>();
		employmentAgencyList.add(employmentAgency);
	}

	@Override
	public EmploymentAgency getEmploymentAgency() {
		if(employmentAgencyList != null && employmentAgencyList.size() > 0) {
			return employmentAgencyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEmploymentAgency(EmploymentAgency employmentAgency) {
		if(employmentAgencyList == null) {
			employmentAgencyList = new ArrayList<>();
		}
		if(employmentAgencyList.size() == 0) {
			employmentAgencyList.add(employmentAgency);
		} else {
			employmentAgencyList.set(0, employmentAgency);
		}
	}

	@Override
	public List<EmploymentAgency> getEmploymentAgencyList() {
		return employmentAgencyList;
	}

	@Override
	public void setEmploymentAgencyList(List<EmploymentAgency> employmentAgencyList) {
		this.employmentAgencyList = employmentAgencyList;
	}

	@Override
	public boolean hasEmploymentAgency() {
		return employmentAgencyList != null && employmentAgencyList.size() > 0 && employmentAgencyList.get(0) != null;
	}

	public ITEM_REVIEWED(EndorseAction endorseAction) {
		endorseActionList = new ArrayList<EndorseAction>();
		endorseActionList.add(endorseAction);
	}

	@Override
	public EndorseAction getEndorseAction() {
		if(endorseActionList != null && endorseActionList.size() > 0) {
			return endorseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEndorseAction(EndorseAction endorseAction) {
		if(endorseActionList == null) {
			endorseActionList = new ArrayList<>();
		}
		if(endorseActionList.size() == 0) {
			endorseActionList.add(endorseAction);
		} else {
			endorseActionList.set(0, endorseAction);
		}
	}

	@Override
	public List<EndorseAction> getEndorseActionList() {
		return endorseActionList;
	}

	@Override
	public void setEndorseActionList(List<EndorseAction> endorseActionList) {
		this.endorseActionList = endorseActionList;
	}

	@Override
	public boolean hasEndorseAction() {
		return endorseActionList != null && endorseActionList.size() > 0 && endorseActionList.get(0) != null;
	}

	public ITEM_REVIEWED(EndorsementRating endorsementRating) {
		endorsementRatingList = new ArrayList<EndorsementRating>();
		endorsementRatingList.add(endorsementRating);
	}

	@Override
	public EndorsementRating getEndorsementRating() {
		if(endorsementRatingList != null && endorsementRatingList.size() > 0) {
			return endorsementRatingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEndorsementRating(EndorsementRating endorsementRating) {
		if(endorsementRatingList == null) {
			endorsementRatingList = new ArrayList<>();
		}
		if(endorsementRatingList.size() == 0) {
			endorsementRatingList.add(endorsementRating);
		} else {
			endorsementRatingList.set(0, endorsementRating);
		}
	}

	@Override
	public List<EndorsementRating> getEndorsementRatingList() {
		return endorsementRatingList;
	}

	@Override
	public void setEndorsementRatingList(List<EndorsementRating> endorsementRatingList) {
		this.endorsementRatingList = endorsementRatingList;
	}

	@Override
	public boolean hasEndorsementRating() {
		return endorsementRatingList != null && endorsementRatingList.size() > 0 && endorsementRatingList.get(0) != null;
	}

	public ITEM_REVIEWED(Energy energy) {
		energyList = new ArrayList<Energy>();
		energyList.add(energy);
	}

	@Override
	public Energy getEnergy() {
		if(energyList != null && energyList.size() > 0) {
			return energyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEnergy(Energy energy) {
		if(energyList == null) {
			energyList = new ArrayList<>();
		}
		if(energyList.size() == 0) {
			energyList.add(energy);
		} else {
			energyList.set(0, energy);
		}
	}

	@Override
	public List<Energy> getEnergyList() {
		return energyList;
	}

	@Override
	public void setEnergyList(List<Energy> energyList) {
		this.energyList = energyList;
	}

	@Override
	public boolean hasEnergy() {
		return energyList != null && energyList.size() > 0 && energyList.get(0) != null;
	}

	public ITEM_REVIEWED(EngineSpecification engineSpecification) {
		engineSpecificationList = new ArrayList<EngineSpecification>();
		engineSpecificationList.add(engineSpecification);
	}

	@Override
	public EngineSpecification getEngineSpecification() {
		if(engineSpecificationList != null && engineSpecificationList.size() > 0) {
			return engineSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEngineSpecification(EngineSpecification engineSpecification) {
		if(engineSpecificationList == null) {
			engineSpecificationList = new ArrayList<>();
		}
		if(engineSpecificationList.size() == 0) {
			engineSpecificationList.add(engineSpecification);
		} else {
			engineSpecificationList.set(0, engineSpecification);
		}
	}

	@Override
	public List<EngineSpecification> getEngineSpecificationList() {
		return engineSpecificationList;
	}

	@Override
	public void setEngineSpecificationList(List<EngineSpecification> engineSpecificationList) {
		this.engineSpecificationList = engineSpecificationList;
	}

	@Override
	public boolean hasEngineSpecification() {
		return engineSpecificationList != null && engineSpecificationList.size() > 0 && engineSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(EntertainmentBusiness entertainmentBusiness) {
		entertainmentBusinessList = new ArrayList<EntertainmentBusiness>();
		entertainmentBusinessList.add(entertainmentBusiness);
	}

	@Override
	public EntertainmentBusiness getEntertainmentBusiness() {
		if(entertainmentBusinessList != null && entertainmentBusinessList.size() > 0) {
			return entertainmentBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness) {
		if(entertainmentBusinessList == null) {
			entertainmentBusinessList = new ArrayList<>();
		}
		if(entertainmentBusinessList.size() == 0) {
			entertainmentBusinessList.add(entertainmentBusiness);
		} else {
			entertainmentBusinessList.set(0, entertainmentBusiness);
		}
	}

	@Override
	public List<EntertainmentBusiness> getEntertainmentBusinessList() {
		return entertainmentBusinessList;
	}

	@Override
	public void setEntertainmentBusinessList(List<EntertainmentBusiness> entertainmentBusinessList) {
		this.entertainmentBusinessList = entertainmentBusinessList;
	}

	@Override
	public boolean hasEntertainmentBusiness() {
		return entertainmentBusinessList != null && entertainmentBusinessList.size() > 0 && entertainmentBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(EntryPoint entryPoint) {
		entryPointList = new ArrayList<EntryPoint>();
		entryPointList.add(entryPoint);
	}

	@Override
	public EntryPoint getEntryPoint() {
		if(entryPointList != null && entryPointList.size() > 0) {
			return entryPointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEntryPoint(EntryPoint entryPoint) {
		if(entryPointList == null) {
			entryPointList = new ArrayList<>();
		}
		if(entryPointList.size() == 0) {
			entryPointList.add(entryPoint);
		} else {
			entryPointList.set(0, entryPoint);
		}
	}

	@Override
	public List<EntryPoint> getEntryPointList() {
		return entryPointList;
	}

	@Override
	public void setEntryPointList(List<EntryPoint> entryPointList) {
		this.entryPointList = entryPointList;
	}

	@Override
	public boolean hasEntryPoint() {
		return entryPointList != null && entryPointList.size() > 0 && entryPointList.get(0) != null;
	}

	public ITEM_REVIEWED(Enumeration enumeration) {
		enumerationList = new ArrayList<Enumeration>();
		enumerationList.add(enumeration);
	}

	@Override
	public Enumeration getEnumeration() {
		if(enumerationList != null && enumerationList.size() > 0) {
			return enumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEnumeration(Enumeration enumeration) {
		if(enumerationList == null) {
			enumerationList = new ArrayList<>();
		}
		if(enumerationList.size() == 0) {
			enumerationList.add(enumeration);
		} else {
			enumerationList.set(0, enumeration);
		}
	}

	@Override
	public List<Enumeration> getEnumerationList() {
		return enumerationList;
	}

	@Override
	public void setEnumerationList(List<Enumeration> enumerationList) {
		this.enumerationList = enumerationList;
	}

	@Override
	public boolean hasEnumeration() {
		return enumerationList != null && enumerationList.size() > 0 && enumerationList.get(0) != null;
	}

	public ITEM_REVIEWED(Episode episode) {
		episodeList = new ArrayList<Episode>();
		episodeList.add(episode);
	}

	@Override
	public Episode getEpisode() {
		if(episodeList != null && episodeList.size() > 0) {
			return episodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEpisode(Episode episode) {
		if(episodeList == null) {
			episodeList = new ArrayList<>();
		}
		if(episodeList.size() == 0) {
			episodeList.add(episode);
		} else {
			episodeList.set(0, episode);
		}
	}

	@Override
	public List<Episode> getEpisodeList() {
		return episodeList;
	}

	@Override
	public void setEpisodeList(List<Episode> episodeList) {
		this.episodeList = episodeList;
	}

	@Override
	public boolean hasEpisode() {
		return episodeList != null && episodeList.size() > 0 && episodeList.get(0) != null;
	}

	public ITEM_REVIEWED(Event event) {
		eventList = new ArrayList<Event>();
		eventList.add(event);
	}

	@Override
	public Event getEvent() {
		if(eventList != null && eventList.size() > 0) {
			return eventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEvent(Event event) {
		if(eventList == null) {
			eventList = new ArrayList<>();
		}
		if(eventList.size() == 0) {
			eventList.add(event);
		} else {
			eventList.set(0, event);
		}
	}

	@Override
	public List<Event> getEventList() {
		return eventList;
	}

	@Override
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

	@Override
	public boolean hasEvent() {
		return eventList != null && eventList.size() > 0 && eventList.get(0) != null;
	}

	public ITEM_REVIEWED(EventReservation eventReservation) {
		eventReservationList = new ArrayList<EventReservation>();
		eventReservationList.add(eventReservation);
	}

	@Override
	public EventReservation getEventReservation() {
		if(eventReservationList != null && eventReservationList.size() > 0) {
			return eventReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventReservation(EventReservation eventReservation) {
		if(eventReservationList == null) {
			eventReservationList = new ArrayList<>();
		}
		if(eventReservationList.size() == 0) {
			eventReservationList.add(eventReservation);
		} else {
			eventReservationList.set(0, eventReservation);
		}
	}

	@Override
	public List<EventReservation> getEventReservationList() {
		return eventReservationList;
	}

	@Override
	public void setEventReservationList(List<EventReservation> eventReservationList) {
		this.eventReservationList = eventReservationList;
	}

	@Override
	public boolean hasEventReservation() {
		return eventReservationList != null && eventReservationList.size() > 0 && eventReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(EventSeries eventSeries) {
		eventSeriesList = new ArrayList<EventSeries>();
		eventSeriesList.add(eventSeries);
	}

	@Override
	public EventSeries getEventSeries() {
		if(eventSeriesList != null && eventSeriesList.size() > 0) {
			return eventSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventSeries(EventSeries eventSeries) {
		if(eventSeriesList == null) {
			eventSeriesList = new ArrayList<>();
		}
		if(eventSeriesList.size() == 0) {
			eventSeriesList.add(eventSeries);
		} else {
			eventSeriesList.set(0, eventSeries);
		}
	}

	@Override
	public List<EventSeries> getEventSeriesList() {
		return eventSeriesList;
	}

	@Override
	public void setEventSeriesList(List<EventSeries> eventSeriesList) {
		this.eventSeriesList = eventSeriesList;
	}

	@Override
	public boolean hasEventSeries() {
		return eventSeriesList != null && eventSeriesList.size() > 0 && eventSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(EventStatusType eventStatusType) {
		eventStatusTypeList = new ArrayList<EventStatusType>();
		eventStatusTypeList.add(eventStatusType);
	}

	@Override
	public EventStatusType getEventStatusType() {
		if(eventStatusTypeList != null && eventStatusTypeList.size() > 0) {
			return eventStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventStatusType(EventStatusType eventStatusType) {
		if(eventStatusTypeList == null) {
			eventStatusTypeList = new ArrayList<>();
		}
		if(eventStatusTypeList.size() == 0) {
			eventStatusTypeList.add(eventStatusType);
		} else {
			eventStatusTypeList.set(0, eventStatusType);
		}
	}

	@Override
	public List<EventStatusType> getEventStatusTypeList() {
		return eventStatusTypeList;
	}

	@Override
	public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList) {
		this.eventStatusTypeList = eventStatusTypeList;
	}

	@Override
	public boolean hasEventStatusType() {
		return eventStatusTypeList != null && eventStatusTypeList.size() > 0 && eventStatusTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(EventVenue eventVenue) {
		eventVenueList = new ArrayList<EventVenue>();
		eventVenueList.add(eventVenue);
	}

	@Override
	public EventVenue getEventVenue() {
		if(eventVenueList != null && eventVenueList.size() > 0) {
			return eventVenueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventVenue(EventVenue eventVenue) {
		if(eventVenueList == null) {
			eventVenueList = new ArrayList<>();
		}
		if(eventVenueList.size() == 0) {
			eventVenueList.add(eventVenue);
		} else {
			eventVenueList.set(0, eventVenue);
		}
	}

	@Override
	public List<EventVenue> getEventVenueList() {
		return eventVenueList;
	}

	@Override
	public void setEventVenueList(List<EventVenue> eventVenueList) {
		this.eventVenueList = eventVenueList;
	}

	@Override
	public boolean hasEventVenue() {
		return eventVenueList != null && eventVenueList.size() > 0 && eventVenueList.get(0) != null;
	}

	public ITEM_REVIEWED(ExchangeRateSpecification exchangeRateSpecification) {
		exchangeRateSpecificationList = new ArrayList<ExchangeRateSpecification>();
		exchangeRateSpecificationList.add(exchangeRateSpecification);
	}

	@Override
	public ExchangeRateSpecification getExchangeRateSpecification() {
		if(exchangeRateSpecificationList != null && exchangeRateSpecificationList.size() > 0) {
			return exchangeRateSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExchangeRateSpecification(ExchangeRateSpecification exchangeRateSpecification) {
		if(exchangeRateSpecificationList == null) {
			exchangeRateSpecificationList = new ArrayList<>();
		}
		if(exchangeRateSpecificationList.size() == 0) {
			exchangeRateSpecificationList.add(exchangeRateSpecification);
		} else {
			exchangeRateSpecificationList.set(0, exchangeRateSpecification);
		}
	}

	@Override
	public List<ExchangeRateSpecification> getExchangeRateSpecificationList() {
		return exchangeRateSpecificationList;
	}

	@Override
	public void setExchangeRateSpecificationList(List<ExchangeRateSpecification> exchangeRateSpecificationList) {
		this.exchangeRateSpecificationList = exchangeRateSpecificationList;
	}

	@Override
	public boolean hasExchangeRateSpecification() {
		return exchangeRateSpecificationList != null && exchangeRateSpecificationList.size() > 0 && exchangeRateSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(ExerciseAction exerciseAction) {
		exerciseActionList = new ArrayList<ExerciseAction>();
		exerciseActionList.add(exerciseAction);
	}

	@Override
	public ExerciseAction getExerciseAction() {
		if(exerciseActionList != null && exerciseActionList.size() > 0) {
			return exerciseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExerciseAction(ExerciseAction exerciseAction) {
		if(exerciseActionList == null) {
			exerciseActionList = new ArrayList<>();
		}
		if(exerciseActionList.size() == 0) {
			exerciseActionList.add(exerciseAction);
		} else {
			exerciseActionList.set(0, exerciseAction);
		}
	}

	@Override
	public List<ExerciseAction> getExerciseActionList() {
		return exerciseActionList;
	}

	@Override
	public void setExerciseActionList(List<ExerciseAction> exerciseActionList) {
		this.exerciseActionList = exerciseActionList;
	}

	@Override
	public boolean hasExerciseAction() {
		return exerciseActionList != null && exerciseActionList.size() > 0 && exerciseActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ExerciseGym exerciseGym) {
		exerciseGymList = new ArrayList<ExerciseGym>();
		exerciseGymList.add(exerciseGym);
	}

	@Override
	public ExerciseGym getExerciseGym() {
		if(exerciseGymList != null && exerciseGymList.size() > 0) {
			return exerciseGymList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExerciseGym(ExerciseGym exerciseGym) {
		if(exerciseGymList == null) {
			exerciseGymList = new ArrayList<>();
		}
		if(exerciseGymList.size() == 0) {
			exerciseGymList.add(exerciseGym);
		} else {
			exerciseGymList.set(0, exerciseGym);
		}
	}

	@Override
	public List<ExerciseGym> getExerciseGymList() {
		return exerciseGymList;
	}

	@Override
	public void setExerciseGymList(List<ExerciseGym> exerciseGymList) {
		this.exerciseGymList = exerciseGymList;
	}

	@Override
	public boolean hasExerciseGym() {
		return exerciseGymList != null && exerciseGymList.size() > 0 && exerciseGymList.get(0) != null;
	}

	public ITEM_REVIEWED(ExercisePlan exercisePlan) {
		exercisePlanList = new ArrayList<ExercisePlan>();
		exercisePlanList.add(exercisePlan);
	}

	@Override
	public ExercisePlan getExercisePlan() {
		if(exercisePlanList != null && exercisePlanList.size() > 0) {
			return exercisePlanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExercisePlan(ExercisePlan exercisePlan) {
		if(exercisePlanList == null) {
			exercisePlanList = new ArrayList<>();
		}
		if(exercisePlanList.size() == 0) {
			exercisePlanList.add(exercisePlan);
		} else {
			exercisePlanList.set(0, exercisePlan);
		}
	}

	@Override
	public List<ExercisePlan> getExercisePlanList() {
		return exercisePlanList;
	}

	@Override
	public void setExercisePlanList(List<ExercisePlan> exercisePlanList) {
		this.exercisePlanList = exercisePlanList;
	}

	@Override
	public boolean hasExercisePlan() {
		return exercisePlanList != null && exercisePlanList.size() > 0 && exercisePlanList.get(0) != null;
	}

	public ITEM_REVIEWED(ExhibitionEvent exhibitionEvent) {
		exhibitionEventList = new ArrayList<ExhibitionEvent>();
		exhibitionEventList.add(exhibitionEvent);
	}

	@Override
	public ExhibitionEvent getExhibitionEvent() {
		if(exhibitionEventList != null && exhibitionEventList.size() > 0) {
			return exhibitionEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExhibitionEvent(ExhibitionEvent exhibitionEvent) {
		if(exhibitionEventList == null) {
			exhibitionEventList = new ArrayList<>();
		}
		if(exhibitionEventList.size() == 0) {
			exhibitionEventList.add(exhibitionEvent);
		} else {
			exhibitionEventList.set(0, exhibitionEvent);
		}
	}

	@Override
	public List<ExhibitionEvent> getExhibitionEventList() {
		return exhibitionEventList;
	}

	@Override
	public void setExhibitionEventList(List<ExhibitionEvent> exhibitionEventList) {
		this.exhibitionEventList = exhibitionEventList;
	}

	@Override
	public boolean hasExhibitionEvent() {
		return exhibitionEventList != null && exhibitionEventList.size() > 0 && exhibitionEventList.get(0) != null;
	}

	public ITEM_REVIEWED(FAQPage faqPage) {
		faqPageList = new ArrayList<FAQPage>();
		faqPageList.add(faqPage);
	}

	@Override
	public FAQPage getFAQPage() {
		if(faqPageList != null && faqPageList.size() > 0) {
			return faqPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFAQPage(FAQPage faqPage) {
		if(faqPageList == null) {
			faqPageList = new ArrayList<>();
		}
		if(faqPageList.size() == 0) {
			faqPageList.add(faqPage);
		} else {
			faqPageList.set(0, faqPage);
		}
	}

	@Override
	public List<FAQPage> getFAQPageList() {
		return faqPageList;
	}

	@Override
	public void setFAQPageList(List<FAQPage> faqPageList) {
		this.faqPageList = faqPageList;
	}

	@Override
	public boolean hasFAQPage() {
		return faqPageList != null && faqPageList.size() > 0 && faqPageList.get(0) != null;
	}

	public ITEM_REVIEWED(FMRadioChannel fmRadioChannel) {
		fmRadioChannelList = new ArrayList<FMRadioChannel>();
		fmRadioChannelList.add(fmRadioChannel);
	}

	@Override
	public FMRadioChannel getFMRadioChannel() {
		if(fmRadioChannelList != null && fmRadioChannelList.size() > 0) {
			return fmRadioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFMRadioChannel(FMRadioChannel fmRadioChannel) {
		if(fmRadioChannelList == null) {
			fmRadioChannelList = new ArrayList<>();
		}
		if(fmRadioChannelList.size() == 0) {
			fmRadioChannelList.add(fmRadioChannel);
		} else {
			fmRadioChannelList.set(0, fmRadioChannel);
		}
	}

	@Override
	public List<FMRadioChannel> getFMRadioChannelList() {
		return fmRadioChannelList;
	}

	@Override
	public void setFMRadioChannelList(List<FMRadioChannel> fmRadioChannelList) {
		this.fmRadioChannelList = fmRadioChannelList;
	}

	@Override
	public boolean hasFMRadioChannel() {
		return fmRadioChannelList != null && fmRadioChannelList.size() > 0 && fmRadioChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(FastFoodRestaurant fastFoodRestaurant) {
		fastFoodRestaurantList = new ArrayList<FastFoodRestaurant>();
		fastFoodRestaurantList.add(fastFoodRestaurant);
	}

	@Override
	public FastFoodRestaurant getFastFoodRestaurant() {
		if(fastFoodRestaurantList != null && fastFoodRestaurantList.size() > 0) {
			return fastFoodRestaurantList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFastFoodRestaurant(FastFoodRestaurant fastFoodRestaurant) {
		if(fastFoodRestaurantList == null) {
			fastFoodRestaurantList = new ArrayList<>();
		}
		if(fastFoodRestaurantList.size() == 0) {
			fastFoodRestaurantList.add(fastFoodRestaurant);
		} else {
			fastFoodRestaurantList.set(0, fastFoodRestaurant);
		}
	}

	@Override
	public List<FastFoodRestaurant> getFastFoodRestaurantList() {
		return fastFoodRestaurantList;
	}

	@Override
	public void setFastFoodRestaurantList(List<FastFoodRestaurant> fastFoodRestaurantList) {
		this.fastFoodRestaurantList = fastFoodRestaurantList;
	}

	@Override
	public boolean hasFastFoodRestaurant() {
		return fastFoodRestaurantList != null && fastFoodRestaurantList.size() > 0 && fastFoodRestaurantList.get(0) != null;
	}

	public ITEM_REVIEWED(Festival festival) {
		festivalList = new ArrayList<Festival>();
		festivalList.add(festival);
	}

	@Override
	public Festival getFestival() {
		if(festivalList != null && festivalList.size() > 0) {
			return festivalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFestival(Festival festival) {
		if(festivalList == null) {
			festivalList = new ArrayList<>();
		}
		if(festivalList.size() == 0) {
			festivalList.add(festival);
		} else {
			festivalList.set(0, festival);
		}
	}

	@Override
	public List<Festival> getFestivalList() {
		return festivalList;
	}

	@Override
	public void setFestivalList(List<Festival> festivalList) {
		this.festivalList = festivalList;
	}

	@Override
	public boolean hasFestival() {
		return festivalList != null && festivalList.size() > 0 && festivalList.get(0) != null;
	}

	public ITEM_REVIEWED(FilmAction filmAction) {
		filmActionList = new ArrayList<FilmAction>();
		filmActionList.add(filmAction);
	}

	@Override
	public FilmAction getFilmAction() {
		if(filmActionList != null && filmActionList.size() > 0) {
			return filmActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFilmAction(FilmAction filmAction) {
		if(filmActionList == null) {
			filmActionList = new ArrayList<>();
		}
		if(filmActionList.size() == 0) {
			filmActionList.add(filmAction);
		} else {
			filmActionList.set(0, filmAction);
		}
	}

	@Override
	public List<FilmAction> getFilmActionList() {
		return filmActionList;
	}

	@Override
	public void setFilmActionList(List<FilmAction> filmActionList) {
		this.filmActionList = filmActionList;
	}

	@Override
	public boolean hasFilmAction() {
		return filmActionList != null && filmActionList.size() > 0 && filmActionList.get(0) != null;
	}

	public ITEM_REVIEWED(FinancialProduct financialProduct) {
		financialProductList = new ArrayList<FinancialProduct>();
		financialProductList.add(financialProduct);
	}

	@Override
	public FinancialProduct getFinancialProduct() {
		if(financialProductList != null && financialProductList.size() > 0) {
			return financialProductList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFinancialProduct(FinancialProduct financialProduct) {
		if(financialProductList == null) {
			financialProductList = new ArrayList<>();
		}
		if(financialProductList.size() == 0) {
			financialProductList.add(financialProduct);
		} else {
			financialProductList.set(0, financialProduct);
		}
	}

	@Override
	public List<FinancialProduct> getFinancialProductList() {
		return financialProductList;
	}

	@Override
	public void setFinancialProductList(List<FinancialProduct> financialProductList) {
		this.financialProductList = financialProductList;
	}

	@Override
	public boolean hasFinancialProduct() {
		return financialProductList != null && financialProductList.size() > 0 && financialProductList.get(0) != null;
	}

	public ITEM_REVIEWED(FinancialService financialService) {
		financialServiceList = new ArrayList<FinancialService>();
		financialServiceList.add(financialService);
	}

	@Override
	public FinancialService getFinancialService() {
		if(financialServiceList != null && financialServiceList.size() > 0) {
			return financialServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFinancialService(FinancialService financialService) {
		if(financialServiceList == null) {
			financialServiceList = new ArrayList<>();
		}
		if(financialServiceList.size() == 0) {
			financialServiceList.add(financialService);
		} else {
			financialServiceList.set(0, financialService);
		}
	}

	@Override
	public List<FinancialService> getFinancialServiceList() {
		return financialServiceList;
	}

	@Override
	public void setFinancialServiceList(List<FinancialService> financialServiceList) {
		this.financialServiceList = financialServiceList;
	}

	@Override
	public boolean hasFinancialService() {
		return financialServiceList != null && financialServiceList.size() > 0 && financialServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(FindAction findAction) {
		findActionList = new ArrayList<FindAction>();
		findActionList.add(findAction);
	}

	@Override
	public FindAction getFindAction() {
		if(findActionList != null && findActionList.size() > 0) {
			return findActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFindAction(FindAction findAction) {
		if(findActionList == null) {
			findActionList = new ArrayList<>();
		}
		if(findActionList.size() == 0) {
			findActionList.add(findAction);
		} else {
			findActionList.set(0, findAction);
		}
	}

	@Override
	public List<FindAction> getFindActionList() {
		return findActionList;
	}

	@Override
	public void setFindActionList(List<FindAction> findActionList) {
		this.findActionList = findActionList;
	}

	@Override
	public boolean hasFindAction() {
		return findActionList != null && findActionList.size() > 0 && findActionList.get(0) != null;
	}

	public ITEM_REVIEWED(FireStation fireStation) {
		fireStationList = new ArrayList<FireStation>();
		fireStationList.add(fireStation);
	}

	@Override
	public FireStation getFireStation() {
		if(fireStationList != null && fireStationList.size() > 0) {
			return fireStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFireStation(FireStation fireStation) {
		if(fireStationList == null) {
			fireStationList = new ArrayList<>();
		}
		if(fireStationList.size() == 0) {
			fireStationList.add(fireStation);
		} else {
			fireStationList.set(0, fireStation);
		}
	}

	@Override
	public List<FireStation> getFireStationList() {
		return fireStationList;
	}

	@Override
	public void setFireStationList(List<FireStation> fireStationList) {
		this.fireStationList = fireStationList;
	}

	@Override
	public boolean hasFireStation() {
		return fireStationList != null && fireStationList.size() > 0 && fireStationList.get(0) != null;
	}

	public ITEM_REVIEWED(Flight flight) {
		flightList = new ArrayList<Flight>();
		flightList.add(flight);
	}

	@Override
	public Flight getFlight() {
		if(flightList != null && flightList.size() > 0) {
			return flightList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlight(Flight flight) {
		if(flightList == null) {
			flightList = new ArrayList<>();
		}
		if(flightList.size() == 0) {
			flightList.add(flight);
		} else {
			flightList.set(0, flight);
		}
	}

	@Override
	public List<Flight> getFlightList() {
		return flightList;
	}

	@Override
	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}

	@Override
	public boolean hasFlight() {
		return flightList != null && flightList.size() > 0 && flightList.get(0) != null;
	}

	public ITEM_REVIEWED(FlightReservation flightReservation) {
		flightReservationList = new ArrayList<FlightReservation>();
		flightReservationList.add(flightReservation);
	}

	@Override
	public FlightReservation getFlightReservation() {
		if(flightReservationList != null && flightReservationList.size() > 0) {
			return flightReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlightReservation(FlightReservation flightReservation) {
		if(flightReservationList == null) {
			flightReservationList = new ArrayList<>();
		}
		if(flightReservationList.size() == 0) {
			flightReservationList.add(flightReservation);
		} else {
			flightReservationList.set(0, flightReservation);
		}
	}

	@Override
	public List<FlightReservation> getFlightReservationList() {
		return flightReservationList;
	}

	@Override
	public void setFlightReservationList(List<FlightReservation> flightReservationList) {
		this.flightReservationList = flightReservationList;
	}

	@Override
	public boolean hasFlightReservation() {
		return flightReservationList != null && flightReservationList.size() > 0 && flightReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(Florist florist) {
		floristList = new ArrayList<Florist>();
		floristList.add(florist);
	}

	@Override
	public Florist getFlorist() {
		if(floristList != null && floristList.size() > 0) {
			return floristList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlorist(Florist florist) {
		if(floristList == null) {
			floristList = new ArrayList<>();
		}
		if(floristList.size() == 0) {
			floristList.add(florist);
		} else {
			floristList.set(0, florist);
		}
	}

	@Override
	public List<Florist> getFloristList() {
		return floristList;
	}

	@Override
	public void setFloristList(List<Florist> floristList) {
		this.floristList = floristList;
	}

	@Override
	public boolean hasFlorist() {
		return floristList != null && floristList.size() > 0 && floristList.get(0) != null;
	}

	public ITEM_REVIEWED(FollowAction followAction) {
		followActionList = new ArrayList<FollowAction>();
		followActionList.add(followAction);
	}

	@Override
	public FollowAction getFollowAction() {
		if(followActionList != null && followActionList.size() > 0) {
			return followActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFollowAction(FollowAction followAction) {
		if(followActionList == null) {
			followActionList = new ArrayList<>();
		}
		if(followActionList.size() == 0) {
			followActionList.add(followAction);
		} else {
			followActionList.set(0, followAction);
		}
	}

	@Override
	public List<FollowAction> getFollowActionList() {
		return followActionList;
	}

	@Override
	public void setFollowActionList(List<FollowAction> followActionList) {
		this.followActionList = followActionList;
	}

	@Override
	public boolean hasFollowAction() {
		return followActionList != null && followActionList.size() > 0 && followActionList.get(0) != null;
	}

	public ITEM_REVIEWED(FoodEstablishment foodEstablishment) {
		foodEstablishmentList = new ArrayList<FoodEstablishment>();
		foodEstablishmentList.add(foodEstablishment);
	}

	@Override
	public FoodEstablishment getFoodEstablishment() {
		if(foodEstablishmentList != null && foodEstablishmentList.size() > 0) {
			return foodEstablishmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodEstablishment(FoodEstablishment foodEstablishment) {
		if(foodEstablishmentList == null) {
			foodEstablishmentList = new ArrayList<>();
		}
		if(foodEstablishmentList.size() == 0) {
			foodEstablishmentList.add(foodEstablishment);
		} else {
			foodEstablishmentList.set(0, foodEstablishment);
		}
	}

	@Override
	public List<FoodEstablishment> getFoodEstablishmentList() {
		return foodEstablishmentList;
	}

	@Override
	public void setFoodEstablishmentList(List<FoodEstablishment> foodEstablishmentList) {
		this.foodEstablishmentList = foodEstablishmentList;
	}

	@Override
	public boolean hasFoodEstablishment() {
		return foodEstablishmentList != null && foodEstablishmentList.size() > 0 && foodEstablishmentList.get(0) != null;
	}

	public ITEM_REVIEWED(FoodEstablishmentReservation foodEstablishmentReservation) {
		foodEstablishmentReservationList = new ArrayList<FoodEstablishmentReservation>();
		foodEstablishmentReservationList.add(foodEstablishmentReservation);
	}

	@Override
	public FoodEstablishmentReservation getFoodEstablishmentReservation() {
		if(foodEstablishmentReservationList != null && foodEstablishmentReservationList.size() > 0) {
			return foodEstablishmentReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodEstablishmentReservation(FoodEstablishmentReservation foodEstablishmentReservation) {
		if(foodEstablishmentReservationList == null) {
			foodEstablishmentReservationList = new ArrayList<>();
		}
		if(foodEstablishmentReservationList.size() == 0) {
			foodEstablishmentReservationList.add(foodEstablishmentReservation);
		} else {
			foodEstablishmentReservationList.set(0, foodEstablishmentReservation);
		}
	}

	@Override
	public List<FoodEstablishmentReservation> getFoodEstablishmentReservationList() {
		return foodEstablishmentReservationList;
	}

	@Override
	public void setFoodEstablishmentReservationList(List<FoodEstablishmentReservation> foodEstablishmentReservationList) {
		this.foodEstablishmentReservationList = foodEstablishmentReservationList;
	}

	@Override
	public boolean hasFoodEstablishmentReservation() {
		return foodEstablishmentReservationList != null && foodEstablishmentReservationList.size() > 0 && foodEstablishmentReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(FoodEvent foodEvent) {
		foodEventList = new ArrayList<FoodEvent>();
		foodEventList.add(foodEvent);
	}

	@Override
	public FoodEvent getFoodEvent() {
		if(foodEventList != null && foodEventList.size() > 0) {
			return foodEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodEvent(FoodEvent foodEvent) {
		if(foodEventList == null) {
			foodEventList = new ArrayList<>();
		}
		if(foodEventList.size() == 0) {
			foodEventList.add(foodEvent);
		} else {
			foodEventList.set(0, foodEvent);
		}
	}

	@Override
	public List<FoodEvent> getFoodEventList() {
		return foodEventList;
	}

	@Override
	public void setFoodEventList(List<FoodEvent> foodEventList) {
		this.foodEventList = foodEventList;
	}

	@Override
	public boolean hasFoodEvent() {
		return foodEventList != null && foodEventList.size() > 0 && foodEventList.get(0) != null;
	}

	public ITEM_REVIEWED(FoodService foodService) {
		foodServiceList = new ArrayList<FoodService>();
		foodServiceList.add(foodService);
	}

	@Override
	public FoodService getFoodService() {
		if(foodServiceList != null && foodServiceList.size() > 0) {
			return foodServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodService(FoodService foodService) {
		if(foodServiceList == null) {
			foodServiceList = new ArrayList<>();
		}
		if(foodServiceList.size() == 0) {
			foodServiceList.add(foodService);
		} else {
			foodServiceList.set(0, foodService);
		}
	}

	@Override
	public List<FoodService> getFoodServiceList() {
		return foodServiceList;
	}

	@Override
	public void setFoodServiceList(List<FoodService> foodServiceList) {
		this.foodServiceList = foodServiceList;
	}

	@Override
	public boolean hasFoodService() {
		return foodServiceList != null && foodServiceList.size() > 0 && foodServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(FurnitureStore furnitureStore) {
		furnitureStoreList = new ArrayList<FurnitureStore>();
		furnitureStoreList.add(furnitureStore);
	}

	@Override
	public FurnitureStore getFurnitureStore() {
		if(furnitureStoreList != null && furnitureStoreList.size() > 0) {
			return furnitureStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFurnitureStore(FurnitureStore furnitureStore) {
		if(furnitureStoreList == null) {
			furnitureStoreList = new ArrayList<>();
		}
		if(furnitureStoreList.size() == 0) {
			furnitureStoreList.add(furnitureStore);
		} else {
			furnitureStoreList.set(0, furnitureStore);
		}
	}

	@Override
	public List<FurnitureStore> getFurnitureStoreList() {
		return furnitureStoreList;
	}

	@Override
	public void setFurnitureStoreList(List<FurnitureStore> furnitureStoreList) {
		this.furnitureStoreList = furnitureStoreList;
	}

	@Override
	public boolean hasFurnitureStore() {
		return furnitureStoreList != null && furnitureStoreList.size() > 0 && furnitureStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Game game) {
		gameList = new ArrayList<Game>();
		gameList.add(game);
	}

	@Override
	public Game getGame() {
		if(gameList != null && gameList.size() > 0) {
			return gameList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGame(Game game) {
		if(gameList == null) {
			gameList = new ArrayList<>();
		}
		if(gameList.size() == 0) {
			gameList.add(game);
		} else {
			gameList.set(0, game);
		}
	}

	@Override
	public List<Game> getGameList() {
		return gameList;
	}

	@Override
	public void setGameList(List<Game> gameList) {
		this.gameList = gameList;
	}

	@Override
	public boolean hasGame() {
		return gameList != null && gameList.size() > 0 && gameList.get(0) != null;
	}

	public ITEM_REVIEWED(GamePlayMode gamePlayMode) {
		gamePlayModeList = new ArrayList<GamePlayMode>();
		gamePlayModeList.add(gamePlayMode);
	}

	@Override
	public GamePlayMode getGamePlayMode() {
		if(gamePlayModeList != null && gamePlayModeList.size() > 0) {
			return gamePlayModeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGamePlayMode(GamePlayMode gamePlayMode) {
		if(gamePlayModeList == null) {
			gamePlayModeList = new ArrayList<>();
		}
		if(gamePlayModeList.size() == 0) {
			gamePlayModeList.add(gamePlayMode);
		} else {
			gamePlayModeList.set(0, gamePlayMode);
		}
	}

	@Override
	public List<GamePlayMode> getGamePlayModeList() {
		return gamePlayModeList;
	}

	@Override
	public void setGamePlayModeList(List<GamePlayMode> gamePlayModeList) {
		this.gamePlayModeList = gamePlayModeList;
	}

	@Override
	public boolean hasGamePlayMode() {
		return gamePlayModeList != null && gamePlayModeList.size() > 0 && gamePlayModeList.get(0) != null;
	}

	public ITEM_REVIEWED(GameServer gameServer) {
		gameServerList = new ArrayList<GameServer>();
		gameServerList.add(gameServer);
	}

	@Override
	public GameServer getGameServer() {
		if(gameServerList != null && gameServerList.size() > 0) {
			return gameServerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGameServer(GameServer gameServer) {
		if(gameServerList == null) {
			gameServerList = new ArrayList<>();
		}
		if(gameServerList.size() == 0) {
			gameServerList.add(gameServer);
		} else {
			gameServerList.set(0, gameServer);
		}
	}

	@Override
	public List<GameServer> getGameServerList() {
		return gameServerList;
	}

	@Override
	public void setGameServerList(List<GameServer> gameServerList) {
		this.gameServerList = gameServerList;
	}

	@Override
	public boolean hasGameServer() {
		return gameServerList != null && gameServerList.size() > 0 && gameServerList.get(0) != null;
	}

	public ITEM_REVIEWED(GameServerStatus gameServerStatus) {
		gameServerStatusList = new ArrayList<GameServerStatus>();
		gameServerStatusList.add(gameServerStatus);
	}

	@Override
	public GameServerStatus getGameServerStatus() {
		if(gameServerStatusList != null && gameServerStatusList.size() > 0) {
			return gameServerStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGameServerStatus(GameServerStatus gameServerStatus) {
		if(gameServerStatusList == null) {
			gameServerStatusList = new ArrayList<>();
		}
		if(gameServerStatusList.size() == 0) {
			gameServerStatusList.add(gameServerStatus);
		} else {
			gameServerStatusList.set(0, gameServerStatus);
		}
	}

	@Override
	public List<GameServerStatus> getGameServerStatusList() {
		return gameServerStatusList;
	}

	@Override
	public void setGameServerStatusList(List<GameServerStatus> gameServerStatusList) {
		this.gameServerStatusList = gameServerStatusList;
	}

	@Override
	public boolean hasGameServerStatus() {
		return gameServerStatusList != null && gameServerStatusList.size() > 0 && gameServerStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(GardenStore gardenStore) {
		gardenStoreList = new ArrayList<GardenStore>();
		gardenStoreList.add(gardenStore);
	}

	@Override
	public GardenStore getGardenStore() {
		if(gardenStoreList != null && gardenStoreList.size() > 0) {
			return gardenStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGardenStore(GardenStore gardenStore) {
		if(gardenStoreList == null) {
			gardenStoreList = new ArrayList<>();
		}
		if(gardenStoreList.size() == 0) {
			gardenStoreList.add(gardenStore);
		} else {
			gardenStoreList.set(0, gardenStore);
		}
	}

	@Override
	public List<GardenStore> getGardenStoreList() {
		return gardenStoreList;
	}

	@Override
	public void setGardenStoreList(List<GardenStore> gardenStoreList) {
		this.gardenStoreList = gardenStoreList;
	}

	@Override
	public boolean hasGardenStore() {
		return gardenStoreList != null && gardenStoreList.size() > 0 && gardenStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(GasStation gasStation) {
		gasStationList = new ArrayList<GasStation>();
		gasStationList.add(gasStation);
	}

	@Override
	public GasStation getGasStation() {
		if(gasStationList != null && gasStationList.size() > 0) {
			return gasStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGasStation(GasStation gasStation) {
		if(gasStationList == null) {
			gasStationList = new ArrayList<>();
		}
		if(gasStationList.size() == 0) {
			gasStationList.add(gasStation);
		} else {
			gasStationList.set(0, gasStation);
		}
	}

	@Override
	public List<GasStation> getGasStationList() {
		return gasStationList;
	}

	@Override
	public void setGasStationList(List<GasStation> gasStationList) {
		this.gasStationList = gasStationList;
	}

	@Override
	public boolean hasGasStation() {
		return gasStationList != null && gasStationList.size() > 0 && gasStationList.get(0) != null;
	}

	public ITEM_REVIEWED(GatedResidenceCommunity gatedResidenceCommunity) {
		gatedResidenceCommunityList = new ArrayList<GatedResidenceCommunity>();
		gatedResidenceCommunityList.add(gatedResidenceCommunity);
	}

	@Override
	public GatedResidenceCommunity getGatedResidenceCommunity() {
		if(gatedResidenceCommunityList != null && gatedResidenceCommunityList.size() > 0) {
			return gatedResidenceCommunityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGatedResidenceCommunity(GatedResidenceCommunity gatedResidenceCommunity) {
		if(gatedResidenceCommunityList == null) {
			gatedResidenceCommunityList = new ArrayList<>();
		}
		if(gatedResidenceCommunityList.size() == 0) {
			gatedResidenceCommunityList.add(gatedResidenceCommunity);
		} else {
			gatedResidenceCommunityList.set(0, gatedResidenceCommunity);
		}
	}

	@Override
	public List<GatedResidenceCommunity> getGatedResidenceCommunityList() {
		return gatedResidenceCommunityList;
	}

	@Override
	public void setGatedResidenceCommunityList(List<GatedResidenceCommunity> gatedResidenceCommunityList) {
		this.gatedResidenceCommunityList = gatedResidenceCommunityList;
	}

	@Override
	public boolean hasGatedResidenceCommunity() {
		return gatedResidenceCommunityList != null && gatedResidenceCommunityList.size() > 0 && gatedResidenceCommunityList.get(0) != null;
	}

	public ITEM_REVIEWED(GenderType genderType) {
		genderTypeList = new ArrayList<GenderType>();
		genderTypeList.add(genderType);
	}

	@Override
	public GenderType getGenderType() {
		if(genderTypeList != null && genderTypeList.size() > 0) {
			return genderTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGenderType(GenderType genderType) {
		if(genderTypeList == null) {
			genderTypeList = new ArrayList<>();
		}
		if(genderTypeList.size() == 0) {
			genderTypeList.add(genderType);
		} else {
			genderTypeList.set(0, genderType);
		}
	}

	@Override
	public List<GenderType> getGenderTypeList() {
		return genderTypeList;
	}

	@Override
	public void setGenderTypeList(List<GenderType> genderTypeList) {
		this.genderTypeList = genderTypeList;
	}

	@Override
	public boolean hasGenderType() {
		return genderTypeList != null && genderTypeList.size() > 0 && genderTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(GeneralContractor generalContractor) {
		generalContractorList = new ArrayList<GeneralContractor>();
		generalContractorList.add(generalContractor);
	}

	@Override
	public GeneralContractor getGeneralContractor() {
		if(generalContractorList != null && generalContractorList.size() > 0) {
			return generalContractorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeneralContractor(GeneralContractor generalContractor) {
		if(generalContractorList == null) {
			generalContractorList = new ArrayList<>();
		}
		if(generalContractorList.size() == 0) {
			generalContractorList.add(generalContractor);
		} else {
			generalContractorList.set(0, generalContractor);
		}
	}

	@Override
	public List<GeneralContractor> getGeneralContractorList() {
		return generalContractorList;
	}

	@Override
	public void setGeneralContractorList(List<GeneralContractor> generalContractorList) {
		this.generalContractorList = generalContractorList;
	}

	@Override
	public boolean hasGeneralContractor() {
		return generalContractorList != null && generalContractorList.size() > 0 && generalContractorList.get(0) != null;
	}

	public ITEM_REVIEWED(GeoCircle geoCircle) {
		geoCircleList = new ArrayList<GeoCircle>();
		geoCircleList.add(geoCircle);
	}

	@Override
	public GeoCircle getGeoCircle() {
		if(geoCircleList != null && geoCircleList.size() > 0) {
			return geoCircleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoCircle(GeoCircle geoCircle) {
		if(geoCircleList == null) {
			geoCircleList = new ArrayList<>();
		}
		if(geoCircleList.size() == 0) {
			geoCircleList.add(geoCircle);
		} else {
			geoCircleList.set(0, geoCircle);
		}
	}

	@Override
	public List<GeoCircle> getGeoCircleList() {
		return geoCircleList;
	}

	@Override
	public void setGeoCircleList(List<GeoCircle> geoCircleList) {
		this.geoCircleList = geoCircleList;
	}

	@Override
	public boolean hasGeoCircle() {
		return geoCircleList != null && geoCircleList.size() > 0 && geoCircleList.get(0) != null;
	}

	public ITEM_REVIEWED(GeoCoordinates geoCoordinates) {
		geoCoordinatesList = new ArrayList<GeoCoordinates>();
		geoCoordinatesList.add(geoCoordinates);
	}

	@Override
	public GeoCoordinates getGeoCoordinates() {
		if(geoCoordinatesList != null && geoCoordinatesList.size() > 0) {
			return geoCoordinatesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
		if(geoCoordinatesList == null) {
			geoCoordinatesList = new ArrayList<>();
		}
		if(geoCoordinatesList.size() == 0) {
			geoCoordinatesList.add(geoCoordinates);
		} else {
			geoCoordinatesList.set(0, geoCoordinates);
		}
	}

	@Override
	public List<GeoCoordinates> getGeoCoordinatesList() {
		return geoCoordinatesList;
	}

	@Override
	public void setGeoCoordinatesList(List<GeoCoordinates> geoCoordinatesList) {
		this.geoCoordinatesList = geoCoordinatesList;
	}

	@Override
	public boolean hasGeoCoordinates() {
		return geoCoordinatesList != null && geoCoordinatesList.size() > 0 && geoCoordinatesList.get(0) != null;
	}

	public ITEM_REVIEWED(GeoShape geoShape) {
		geoShapeList = new ArrayList<GeoShape>();
		geoShapeList.add(geoShape);
	}

	@Override
	public GeoShape getGeoShape() {
		if(geoShapeList != null && geoShapeList.size() > 0) {
			return geoShapeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoShape(GeoShape geoShape) {
		if(geoShapeList == null) {
			geoShapeList = new ArrayList<>();
		}
		if(geoShapeList.size() == 0) {
			geoShapeList.add(geoShape);
		} else {
			geoShapeList.set(0, geoShape);
		}
	}

	@Override
	public List<GeoShape> getGeoShapeList() {
		return geoShapeList;
	}

	@Override
	public void setGeoShapeList(List<GeoShape> geoShapeList) {
		this.geoShapeList = geoShapeList;
	}

	@Override
	public boolean hasGeoShape() {
		return geoShapeList != null && geoShapeList.size() > 0 && geoShapeList.get(0) != null;
	}

	public ITEM_REVIEWED(GeospatialGeometry geospatialGeometry) {
		geospatialGeometryList = new ArrayList<GeospatialGeometry>();
		geospatialGeometryList.add(geospatialGeometry);
	}

	@Override
	public GeospatialGeometry getGeospatialGeometry() {
		if(geospatialGeometryList != null && geospatialGeometryList.size() > 0) {
			return geospatialGeometryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeospatialGeometry(GeospatialGeometry geospatialGeometry) {
		if(geospatialGeometryList == null) {
			geospatialGeometryList = new ArrayList<>();
		}
		if(geospatialGeometryList.size() == 0) {
			geospatialGeometryList.add(geospatialGeometry);
		} else {
			geospatialGeometryList.set(0, geospatialGeometry);
		}
	}

	@Override
	public List<GeospatialGeometry> getGeospatialGeometryList() {
		return geospatialGeometryList;
	}

	@Override
	public void setGeospatialGeometryList(List<GeospatialGeometry> geospatialGeometryList) {
		this.geospatialGeometryList = geospatialGeometryList;
	}

	@Override
	public boolean hasGeospatialGeometry() {
		return geospatialGeometryList != null && geospatialGeometryList.size() > 0 && geospatialGeometryList.get(0) != null;
	}

	public ITEM_REVIEWED(Geriatric geriatric) {
		geriatricList = new ArrayList<Geriatric>();
		geriatricList.add(geriatric);
	}

	@Override
	public Geriatric getGeriatric() {
		if(geriatricList != null && geriatricList.size() > 0) {
			return geriatricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeriatric(Geriatric geriatric) {
		if(geriatricList == null) {
			geriatricList = new ArrayList<>();
		}
		if(geriatricList.size() == 0) {
			geriatricList.add(geriatric);
		} else {
			geriatricList.set(0, geriatric);
		}
	}

	@Override
	public List<Geriatric> getGeriatricList() {
		return geriatricList;
	}

	@Override
	public void setGeriatricList(List<Geriatric> geriatricList) {
		this.geriatricList = geriatricList;
	}

	@Override
	public boolean hasGeriatric() {
		return geriatricList != null && geriatricList.size() > 0 && geriatricList.get(0) != null;
	}

	public ITEM_REVIEWED(GiveAction giveAction) {
		giveActionList = new ArrayList<GiveAction>();
		giveActionList.add(giveAction);
	}

	@Override
	public GiveAction getGiveAction() {
		if(giveActionList != null && giveActionList.size() > 0) {
			return giveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGiveAction(GiveAction giveAction) {
		if(giveActionList == null) {
			giveActionList = new ArrayList<>();
		}
		if(giveActionList.size() == 0) {
			giveActionList.add(giveAction);
		} else {
			giveActionList.set(0, giveAction);
		}
	}

	@Override
	public List<GiveAction> getGiveActionList() {
		return giveActionList;
	}

	@Override
	public void setGiveActionList(List<GiveAction> giveActionList) {
		this.giveActionList = giveActionList;
	}

	@Override
	public boolean hasGiveAction() {
		return giveActionList != null && giveActionList.size() > 0 && giveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(GolfCourse golfCourse) {
		golfCourseList = new ArrayList<GolfCourse>();
		golfCourseList.add(golfCourse);
	}

	@Override
	public GolfCourse getGolfCourse() {
		if(golfCourseList != null && golfCourseList.size() > 0) {
			return golfCourseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGolfCourse(GolfCourse golfCourse) {
		if(golfCourseList == null) {
			golfCourseList = new ArrayList<>();
		}
		if(golfCourseList.size() == 0) {
			golfCourseList.add(golfCourse);
		} else {
			golfCourseList.set(0, golfCourse);
		}
	}

	@Override
	public List<GolfCourse> getGolfCourseList() {
		return golfCourseList;
	}

	@Override
	public void setGolfCourseList(List<GolfCourse> golfCourseList) {
		this.golfCourseList = golfCourseList;
	}

	@Override
	public boolean hasGolfCourse() {
		return golfCourseList != null && golfCourseList.size() > 0 && golfCourseList.get(0) != null;
	}

	public ITEM_REVIEWED(GovernmentBuilding governmentBuilding) {
		governmentBuildingList = new ArrayList<GovernmentBuilding>();
		governmentBuildingList.add(governmentBuilding);
	}

	@Override
	public GovernmentBuilding getGovernmentBuilding() {
		if(governmentBuildingList != null && governmentBuildingList.size() > 0) {
			return governmentBuildingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentBuilding(GovernmentBuilding governmentBuilding) {
		if(governmentBuildingList == null) {
			governmentBuildingList = new ArrayList<>();
		}
		if(governmentBuildingList.size() == 0) {
			governmentBuildingList.add(governmentBuilding);
		} else {
			governmentBuildingList.set(0, governmentBuilding);
		}
	}

	@Override
	public List<GovernmentBuilding> getGovernmentBuildingList() {
		return governmentBuildingList;
	}

	@Override
	public void setGovernmentBuildingList(List<GovernmentBuilding> governmentBuildingList) {
		this.governmentBuildingList = governmentBuildingList;
	}

	@Override
	public boolean hasGovernmentBuilding() {
		return governmentBuildingList != null && governmentBuildingList.size() > 0 && governmentBuildingList.get(0) != null;
	}

	public ITEM_REVIEWED(GovernmentOffice governmentOffice) {
		governmentOfficeList = new ArrayList<GovernmentOffice>();
		governmentOfficeList.add(governmentOffice);
	}

	@Override
	public GovernmentOffice getGovernmentOffice() {
		if(governmentOfficeList != null && governmentOfficeList.size() > 0) {
			return governmentOfficeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentOffice(GovernmentOffice governmentOffice) {
		if(governmentOfficeList == null) {
			governmentOfficeList = new ArrayList<>();
		}
		if(governmentOfficeList.size() == 0) {
			governmentOfficeList.add(governmentOffice);
		} else {
			governmentOfficeList.set(0, governmentOffice);
		}
	}

	@Override
	public List<GovernmentOffice> getGovernmentOfficeList() {
		return governmentOfficeList;
	}

	@Override
	public void setGovernmentOfficeList(List<GovernmentOffice> governmentOfficeList) {
		this.governmentOfficeList = governmentOfficeList;
	}

	@Override
	public boolean hasGovernmentOffice() {
		return governmentOfficeList != null && governmentOfficeList.size() > 0 && governmentOfficeList.get(0) != null;
	}

	public ITEM_REVIEWED(GovernmentOrganization governmentOrganization) {
		governmentOrganizationList = new ArrayList<GovernmentOrganization>();
		governmentOrganizationList.add(governmentOrganization);
	}

	@Override
	public GovernmentOrganization getGovernmentOrganization() {
		if(governmentOrganizationList != null && governmentOrganizationList.size() > 0) {
			return governmentOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentOrganization(GovernmentOrganization governmentOrganization) {
		if(governmentOrganizationList == null) {
			governmentOrganizationList = new ArrayList<>();
		}
		if(governmentOrganizationList.size() == 0) {
			governmentOrganizationList.add(governmentOrganization);
		} else {
			governmentOrganizationList.set(0, governmentOrganization);
		}
	}

	@Override
	public List<GovernmentOrganization> getGovernmentOrganizationList() {
		return governmentOrganizationList;
	}

	@Override
	public void setGovernmentOrganizationList(List<GovernmentOrganization> governmentOrganizationList) {
		this.governmentOrganizationList = governmentOrganizationList;
	}

	@Override
	public boolean hasGovernmentOrganization() {
		return governmentOrganizationList != null && governmentOrganizationList.size() > 0 && governmentOrganizationList.get(0) != null;
	}

	public ITEM_REVIEWED(GovernmentPermit governmentPermit) {
		governmentPermitList = new ArrayList<GovernmentPermit>();
		governmentPermitList.add(governmentPermit);
	}

	@Override
	public GovernmentPermit getGovernmentPermit() {
		if(governmentPermitList != null && governmentPermitList.size() > 0) {
			return governmentPermitList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentPermit(GovernmentPermit governmentPermit) {
		if(governmentPermitList == null) {
			governmentPermitList = new ArrayList<>();
		}
		if(governmentPermitList.size() == 0) {
			governmentPermitList.add(governmentPermit);
		} else {
			governmentPermitList.set(0, governmentPermit);
		}
	}

	@Override
	public List<GovernmentPermit> getGovernmentPermitList() {
		return governmentPermitList;
	}

	@Override
	public void setGovernmentPermitList(List<GovernmentPermit> governmentPermitList) {
		this.governmentPermitList = governmentPermitList;
	}

	@Override
	public boolean hasGovernmentPermit() {
		return governmentPermitList != null && governmentPermitList.size() > 0 && governmentPermitList.get(0) != null;
	}

	public ITEM_REVIEWED(GovernmentService governmentService) {
		governmentServiceList = new ArrayList<GovernmentService>();
		governmentServiceList.add(governmentService);
	}

	@Override
	public GovernmentService getGovernmentService() {
		if(governmentServiceList != null && governmentServiceList.size() > 0) {
			return governmentServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentService(GovernmentService governmentService) {
		if(governmentServiceList == null) {
			governmentServiceList = new ArrayList<>();
		}
		if(governmentServiceList.size() == 0) {
			governmentServiceList.add(governmentService);
		} else {
			governmentServiceList.set(0, governmentService);
		}
	}

	@Override
	public List<GovernmentService> getGovernmentServiceList() {
		return governmentServiceList;
	}

	@Override
	public void setGovernmentServiceList(List<GovernmentService> governmentServiceList) {
		this.governmentServiceList = governmentServiceList;
	}

	@Override
	public boolean hasGovernmentService() {
		return governmentServiceList != null && governmentServiceList.size() > 0 && governmentServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(GroceryStore groceryStore) {
		groceryStoreList = new ArrayList<GroceryStore>();
		groceryStoreList.add(groceryStore);
	}

	@Override
	public GroceryStore getGroceryStore() {
		if(groceryStoreList != null && groceryStoreList.size() > 0) {
			return groceryStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGroceryStore(GroceryStore groceryStore) {
		if(groceryStoreList == null) {
			groceryStoreList = new ArrayList<>();
		}
		if(groceryStoreList.size() == 0) {
			groceryStoreList.add(groceryStore);
		} else {
			groceryStoreList.set(0, groceryStore);
		}
	}

	@Override
	public List<GroceryStore> getGroceryStoreList() {
		return groceryStoreList;
	}

	@Override
	public void setGroceryStoreList(List<GroceryStore> groceryStoreList) {
		this.groceryStoreList = groceryStoreList;
	}

	@Override
	public boolean hasGroceryStore() {
		return groceryStoreList != null && groceryStoreList.size() > 0 && groceryStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Gynecologic gynecologic) {
		gynecologicList = new ArrayList<Gynecologic>();
		gynecologicList.add(gynecologic);
	}

	@Override
	public Gynecologic getGynecologic() {
		if(gynecologicList != null && gynecologicList.size() > 0) {
			return gynecologicList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGynecologic(Gynecologic gynecologic) {
		if(gynecologicList == null) {
			gynecologicList = new ArrayList<>();
		}
		if(gynecologicList.size() == 0) {
			gynecologicList.add(gynecologic);
		} else {
			gynecologicList.set(0, gynecologic);
		}
	}

	@Override
	public List<Gynecologic> getGynecologicList() {
		return gynecologicList;
	}

	@Override
	public void setGynecologicList(List<Gynecologic> gynecologicList) {
		this.gynecologicList = gynecologicList;
	}

	@Override
	public boolean hasGynecologic() {
		return gynecologicList != null && gynecologicList.size() > 0 && gynecologicList.get(0) != null;
	}

	public ITEM_REVIEWED(HVACBusiness hvacBusiness) {
		hvacBusinessList = new ArrayList<HVACBusiness>();
		hvacBusinessList.add(hvacBusiness);
	}

	@Override
	public HVACBusiness getHVACBusiness() {
		if(hvacBusinessList != null && hvacBusinessList.size() > 0) {
			return hvacBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHVACBusiness(HVACBusiness hvacBusiness) {
		if(hvacBusinessList == null) {
			hvacBusinessList = new ArrayList<>();
		}
		if(hvacBusinessList.size() == 0) {
			hvacBusinessList.add(hvacBusiness);
		} else {
			hvacBusinessList.set(0, hvacBusiness);
		}
	}

	@Override
	public List<HVACBusiness> getHVACBusinessList() {
		return hvacBusinessList;
	}

	@Override
	public void setHVACBusinessList(List<HVACBusiness> hvacBusinessList) {
		this.hvacBusinessList = hvacBusinessList;
	}

	@Override
	public boolean hasHVACBusiness() {
		return hvacBusinessList != null && hvacBusinessList.size() > 0 && hvacBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(HairSalon hairSalon) {
		hairSalonList = new ArrayList<HairSalon>();
		hairSalonList.add(hairSalon);
	}

	@Override
	public HairSalon getHairSalon() {
		if(hairSalonList != null && hairSalonList.size() > 0) {
			return hairSalonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHairSalon(HairSalon hairSalon) {
		if(hairSalonList == null) {
			hairSalonList = new ArrayList<>();
		}
		if(hairSalonList.size() == 0) {
			hairSalonList.add(hairSalon);
		} else {
			hairSalonList.set(0, hairSalon);
		}
	}

	@Override
	public List<HairSalon> getHairSalonList() {
		return hairSalonList;
	}

	@Override
	public void setHairSalonList(List<HairSalon> hairSalonList) {
		this.hairSalonList = hairSalonList;
	}

	@Override
	public boolean hasHairSalon() {
		return hairSalonList != null && hairSalonList.size() > 0 && hairSalonList.get(0) != null;
	}

	public ITEM_REVIEWED(HardwareStore hardwareStore) {
		hardwareStoreList = new ArrayList<HardwareStore>();
		hardwareStoreList.add(hardwareStore);
	}

	@Override
	public HardwareStore getHardwareStore() {
		if(hardwareStoreList != null && hardwareStoreList.size() > 0) {
			return hardwareStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHardwareStore(HardwareStore hardwareStore) {
		if(hardwareStoreList == null) {
			hardwareStoreList = new ArrayList<>();
		}
		if(hardwareStoreList.size() == 0) {
			hardwareStoreList.add(hardwareStore);
		} else {
			hardwareStoreList.set(0, hardwareStore);
		}
	}

	@Override
	public List<HardwareStore> getHardwareStoreList() {
		return hardwareStoreList;
	}

	@Override
	public void setHardwareStoreList(List<HardwareStore> hardwareStoreList) {
		this.hardwareStoreList = hardwareStoreList;
	}

	@Override
	public boolean hasHardwareStore() {
		return hardwareStoreList != null && hardwareStoreList.size() > 0 && hardwareStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthAndBeautyBusiness healthAndBeautyBusiness) {
		healthAndBeautyBusinessList = new ArrayList<HealthAndBeautyBusiness>();
		healthAndBeautyBusinessList.add(healthAndBeautyBusiness);
	}

	@Override
	public HealthAndBeautyBusiness getHealthAndBeautyBusiness() {
		if(healthAndBeautyBusinessList != null && healthAndBeautyBusinessList.size() > 0) {
			return healthAndBeautyBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthAndBeautyBusiness(HealthAndBeautyBusiness healthAndBeautyBusiness) {
		if(healthAndBeautyBusinessList == null) {
			healthAndBeautyBusinessList = new ArrayList<>();
		}
		if(healthAndBeautyBusinessList.size() == 0) {
			healthAndBeautyBusinessList.add(healthAndBeautyBusiness);
		} else {
			healthAndBeautyBusinessList.set(0, healthAndBeautyBusiness);
		}
	}

	@Override
	public List<HealthAndBeautyBusiness> getHealthAndBeautyBusinessList() {
		return healthAndBeautyBusinessList;
	}

	@Override
	public void setHealthAndBeautyBusinessList(List<HealthAndBeautyBusiness> healthAndBeautyBusinessList) {
		this.healthAndBeautyBusinessList = healthAndBeautyBusinessList;
	}

	@Override
	public boolean hasHealthAndBeautyBusiness() {
		return healthAndBeautyBusinessList != null && healthAndBeautyBusinessList.size() > 0 && healthAndBeautyBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthClub healthClub) {
		healthClubList = new ArrayList<HealthClub>();
		healthClubList.add(healthClub);
	}

	@Override
	public HealthClub getHealthClub() {
		if(healthClubList != null && healthClubList.size() > 0) {
			return healthClubList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthClub(HealthClub healthClub) {
		if(healthClubList == null) {
			healthClubList = new ArrayList<>();
		}
		if(healthClubList.size() == 0) {
			healthClubList.add(healthClub);
		} else {
			healthClubList.set(0, healthClub);
		}
	}

	@Override
	public List<HealthClub> getHealthClubList() {
		return healthClubList;
	}

	@Override
	public void setHealthClubList(List<HealthClub> healthClubList) {
		this.healthClubList = healthClubList;
	}

	@Override
	public boolean hasHealthClub() {
		return healthClubList != null && healthClubList.size() > 0 && healthClubList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthInsurancePlan healthInsurancePlan) {
		healthInsurancePlanList = new ArrayList<HealthInsurancePlan>();
		healthInsurancePlanList.add(healthInsurancePlan);
	}

	@Override
	public HealthInsurancePlan getHealthInsurancePlan() {
		if(healthInsurancePlanList != null && healthInsurancePlanList.size() > 0) {
			return healthInsurancePlanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthInsurancePlan(HealthInsurancePlan healthInsurancePlan) {
		if(healthInsurancePlanList == null) {
			healthInsurancePlanList = new ArrayList<>();
		}
		if(healthInsurancePlanList.size() == 0) {
			healthInsurancePlanList.add(healthInsurancePlan);
		} else {
			healthInsurancePlanList.set(0, healthInsurancePlan);
		}
	}

	@Override
	public List<HealthInsurancePlan> getHealthInsurancePlanList() {
		return healthInsurancePlanList;
	}

	@Override
	public void setHealthInsurancePlanList(List<HealthInsurancePlan> healthInsurancePlanList) {
		this.healthInsurancePlanList = healthInsurancePlanList;
	}

	@Override
	public boolean hasHealthInsurancePlan() {
		return healthInsurancePlanList != null && healthInsurancePlanList.size() > 0 && healthInsurancePlanList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthPlanCostSharingSpecification healthPlanCostSharingSpecification) {
		healthPlanCostSharingSpecificationList = new ArrayList<HealthPlanCostSharingSpecification>();
		healthPlanCostSharingSpecificationList.add(healthPlanCostSharingSpecification);
	}

	@Override
	public HealthPlanCostSharingSpecification getHealthPlanCostSharingSpecification() {
		if(healthPlanCostSharingSpecificationList != null && healthPlanCostSharingSpecificationList.size() > 0) {
			return healthPlanCostSharingSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthPlanCostSharingSpecification(HealthPlanCostSharingSpecification healthPlanCostSharingSpecification) {
		if(healthPlanCostSharingSpecificationList == null) {
			healthPlanCostSharingSpecificationList = new ArrayList<>();
		}
		if(healthPlanCostSharingSpecificationList.size() == 0) {
			healthPlanCostSharingSpecificationList.add(healthPlanCostSharingSpecification);
		} else {
			healthPlanCostSharingSpecificationList.set(0, healthPlanCostSharingSpecification);
		}
	}

	@Override
	public List<HealthPlanCostSharingSpecification> getHealthPlanCostSharingSpecificationList() {
		return healthPlanCostSharingSpecificationList;
	}

	@Override
	public void setHealthPlanCostSharingSpecificationList(List<HealthPlanCostSharingSpecification> healthPlanCostSharingSpecificationList) {
		this.healthPlanCostSharingSpecificationList = healthPlanCostSharingSpecificationList;
	}

	@Override
	public boolean hasHealthPlanCostSharingSpecification() {
		return healthPlanCostSharingSpecificationList != null && healthPlanCostSharingSpecificationList.size() > 0 && healthPlanCostSharingSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthPlanFormulary healthPlanFormulary) {
		healthPlanFormularyList = new ArrayList<HealthPlanFormulary>();
		healthPlanFormularyList.add(healthPlanFormulary);
	}

	@Override
	public HealthPlanFormulary getHealthPlanFormulary() {
		if(healthPlanFormularyList != null && healthPlanFormularyList.size() > 0) {
			return healthPlanFormularyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthPlanFormulary(HealthPlanFormulary healthPlanFormulary) {
		if(healthPlanFormularyList == null) {
			healthPlanFormularyList = new ArrayList<>();
		}
		if(healthPlanFormularyList.size() == 0) {
			healthPlanFormularyList.add(healthPlanFormulary);
		} else {
			healthPlanFormularyList.set(0, healthPlanFormulary);
		}
	}

	@Override
	public List<HealthPlanFormulary> getHealthPlanFormularyList() {
		return healthPlanFormularyList;
	}

	@Override
	public void setHealthPlanFormularyList(List<HealthPlanFormulary> healthPlanFormularyList) {
		this.healthPlanFormularyList = healthPlanFormularyList;
	}

	@Override
	public boolean hasHealthPlanFormulary() {
		return healthPlanFormularyList != null && healthPlanFormularyList.size() > 0 && healthPlanFormularyList.get(0) != null;
	}

	public ITEM_REVIEWED(HealthPlanNetwork healthPlanNetwork) {
		healthPlanNetworkList = new ArrayList<HealthPlanNetwork>();
		healthPlanNetworkList.add(healthPlanNetwork);
	}

	@Override
	public HealthPlanNetwork getHealthPlanNetwork() {
		if(healthPlanNetworkList != null && healthPlanNetworkList.size() > 0) {
			return healthPlanNetworkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthPlanNetwork(HealthPlanNetwork healthPlanNetwork) {
		if(healthPlanNetworkList == null) {
			healthPlanNetworkList = new ArrayList<>();
		}
		if(healthPlanNetworkList.size() == 0) {
			healthPlanNetworkList.add(healthPlanNetwork);
		} else {
			healthPlanNetworkList.set(0, healthPlanNetwork);
		}
	}

	@Override
	public List<HealthPlanNetwork> getHealthPlanNetworkList() {
		return healthPlanNetworkList;
	}

	@Override
	public void setHealthPlanNetworkList(List<HealthPlanNetwork> healthPlanNetworkList) {
		this.healthPlanNetworkList = healthPlanNetworkList;
	}

	@Override
	public boolean hasHealthPlanNetwork() {
		return healthPlanNetworkList != null && healthPlanNetworkList.size() > 0 && healthPlanNetworkList.get(0) != null;
	}

	public ITEM_REVIEWED(HighSchool highSchool) {
		highSchoolList = new ArrayList<HighSchool>();
		highSchoolList.add(highSchool);
	}

	@Override
	public HighSchool getHighSchool() {
		if(highSchoolList != null && highSchoolList.size() > 0) {
			return highSchoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHighSchool(HighSchool highSchool) {
		if(highSchoolList == null) {
			highSchoolList = new ArrayList<>();
		}
		if(highSchoolList.size() == 0) {
			highSchoolList.add(highSchool);
		} else {
			highSchoolList.set(0, highSchool);
		}
	}

	@Override
	public List<HighSchool> getHighSchoolList() {
		return highSchoolList;
	}

	@Override
	public void setHighSchoolList(List<HighSchool> highSchoolList) {
		this.highSchoolList = highSchoolList;
	}

	@Override
	public boolean hasHighSchool() {
		return highSchoolList != null && highSchoolList.size() > 0 && highSchoolList.get(0) != null;
	}

	public ITEM_REVIEWED(HinduTemple hinduTemple) {
		hinduTempleList = new ArrayList<HinduTemple>();
		hinduTempleList.add(hinduTemple);
	}

	@Override
	public HinduTemple getHinduTemple() {
		if(hinduTempleList != null && hinduTempleList.size() > 0) {
			return hinduTempleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHinduTemple(HinduTemple hinduTemple) {
		if(hinduTempleList == null) {
			hinduTempleList = new ArrayList<>();
		}
		if(hinduTempleList.size() == 0) {
			hinduTempleList.add(hinduTemple);
		} else {
			hinduTempleList.set(0, hinduTemple);
		}
	}

	@Override
	public List<HinduTemple> getHinduTempleList() {
		return hinduTempleList;
	}

	@Override
	public void setHinduTempleList(List<HinduTemple> hinduTempleList) {
		this.hinduTempleList = hinduTempleList;
	}

	@Override
	public boolean hasHinduTemple() {
		return hinduTempleList != null && hinduTempleList.size() > 0 && hinduTempleList.get(0) != null;
	}

	public ITEM_REVIEWED(HobbyShop hobbyShop) {
		hobbyShopList = new ArrayList<HobbyShop>();
		hobbyShopList.add(hobbyShop);
	}

	@Override
	public HobbyShop getHobbyShop() {
		if(hobbyShopList != null && hobbyShopList.size() > 0) {
			return hobbyShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHobbyShop(HobbyShop hobbyShop) {
		if(hobbyShopList == null) {
			hobbyShopList = new ArrayList<>();
		}
		if(hobbyShopList.size() == 0) {
			hobbyShopList.add(hobbyShop);
		} else {
			hobbyShopList.set(0, hobbyShop);
		}
	}

	@Override
	public List<HobbyShop> getHobbyShopList() {
		return hobbyShopList;
	}

	@Override
	public void setHobbyShopList(List<HobbyShop> hobbyShopList) {
		this.hobbyShopList = hobbyShopList;
	}

	@Override
	public boolean hasHobbyShop() {
		return hobbyShopList != null && hobbyShopList.size() > 0 && hobbyShopList.get(0) != null;
	}

	public ITEM_REVIEWED(HomeAndConstructionBusiness homeAndConstructionBusiness) {
		homeAndConstructionBusinessList = new ArrayList<HomeAndConstructionBusiness>();
		homeAndConstructionBusinessList.add(homeAndConstructionBusiness);
	}

	@Override
	public HomeAndConstructionBusiness getHomeAndConstructionBusiness() {
		if(homeAndConstructionBusinessList != null && homeAndConstructionBusinessList.size() > 0) {
			return homeAndConstructionBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHomeAndConstructionBusiness(HomeAndConstructionBusiness homeAndConstructionBusiness) {
		if(homeAndConstructionBusinessList == null) {
			homeAndConstructionBusinessList = new ArrayList<>();
		}
		if(homeAndConstructionBusinessList.size() == 0) {
			homeAndConstructionBusinessList.add(homeAndConstructionBusiness);
		} else {
			homeAndConstructionBusinessList.set(0, homeAndConstructionBusiness);
		}
	}

	@Override
	public List<HomeAndConstructionBusiness> getHomeAndConstructionBusinessList() {
		return homeAndConstructionBusinessList;
	}

	@Override
	public void setHomeAndConstructionBusinessList(List<HomeAndConstructionBusiness> homeAndConstructionBusinessList) {
		this.homeAndConstructionBusinessList = homeAndConstructionBusinessList;
	}

	@Override
	public boolean hasHomeAndConstructionBusiness() {
		return homeAndConstructionBusinessList != null && homeAndConstructionBusinessList.size() > 0 && homeAndConstructionBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(HomeGoodsStore homeGoodsStore) {
		homeGoodsStoreList = new ArrayList<HomeGoodsStore>();
		homeGoodsStoreList.add(homeGoodsStore);
	}

	@Override
	public HomeGoodsStore getHomeGoodsStore() {
		if(homeGoodsStoreList != null && homeGoodsStoreList.size() > 0) {
			return homeGoodsStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHomeGoodsStore(HomeGoodsStore homeGoodsStore) {
		if(homeGoodsStoreList == null) {
			homeGoodsStoreList = new ArrayList<>();
		}
		if(homeGoodsStoreList.size() == 0) {
			homeGoodsStoreList.add(homeGoodsStore);
		} else {
			homeGoodsStoreList.set(0, homeGoodsStore);
		}
	}

	@Override
	public List<HomeGoodsStore> getHomeGoodsStoreList() {
		return homeGoodsStoreList;
	}

	@Override
	public void setHomeGoodsStoreList(List<HomeGoodsStore> homeGoodsStoreList) {
		this.homeGoodsStoreList = homeGoodsStoreList;
	}

	@Override
	public boolean hasHomeGoodsStore() {
		return homeGoodsStoreList != null && homeGoodsStoreList.size() > 0 && homeGoodsStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Hospital hospital) {
		hospitalList = new ArrayList<Hospital>();
		hospitalList.add(hospital);
	}

	@Override
	public Hospital getHospital() {
		if(hospitalList != null && hospitalList.size() > 0) {
			return hospitalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHospital(Hospital hospital) {
		if(hospitalList == null) {
			hospitalList = new ArrayList<>();
		}
		if(hospitalList.size() == 0) {
			hospitalList.add(hospital);
		} else {
			hospitalList.set(0, hospital);
		}
	}

	@Override
	public List<Hospital> getHospitalList() {
		return hospitalList;
	}

	@Override
	public void setHospitalList(List<Hospital> hospitalList) {
		this.hospitalList = hospitalList;
	}

	@Override
	public boolean hasHospital() {
		return hospitalList != null && hospitalList.size() > 0 && hospitalList.get(0) != null;
	}

	public ITEM_REVIEWED(Hostel hostel) {
		hostelList = new ArrayList<Hostel>();
		hostelList.add(hostel);
	}

	@Override
	public Hostel getHostel() {
		if(hostelList != null && hostelList.size() > 0) {
			return hostelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHostel(Hostel hostel) {
		if(hostelList == null) {
			hostelList = new ArrayList<>();
		}
		if(hostelList.size() == 0) {
			hostelList.add(hostel);
		} else {
			hostelList.set(0, hostel);
		}
	}

	@Override
	public List<Hostel> getHostelList() {
		return hostelList;
	}

	@Override
	public void setHostelList(List<Hostel> hostelList) {
		this.hostelList = hostelList;
	}

	@Override
	public boolean hasHostel() {
		return hostelList != null && hostelList.size() > 0 && hostelList.get(0) != null;
	}

	public ITEM_REVIEWED(Hotel hotel) {
		hotelList = new ArrayList<Hotel>();
		hotelList.add(hotel);
	}

	@Override
	public Hotel getHotel() {
		if(hotelList != null && hotelList.size() > 0) {
			return hotelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHotel(Hotel hotel) {
		if(hotelList == null) {
			hotelList = new ArrayList<>();
		}
		if(hotelList.size() == 0) {
			hotelList.add(hotel);
		} else {
			hotelList.set(0, hotel);
		}
	}

	@Override
	public List<Hotel> getHotelList() {
		return hotelList;
	}

	@Override
	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	@Override
	public boolean hasHotel() {
		return hotelList != null && hotelList.size() > 0 && hotelList.get(0) != null;
	}

	public ITEM_REVIEWED(HotelRoom hotelRoom) {
		hotelRoomList = new ArrayList<HotelRoom>();
		hotelRoomList.add(hotelRoom);
	}

	@Override
	public HotelRoom getHotelRoom() {
		if(hotelRoomList != null && hotelRoomList.size() > 0) {
			return hotelRoomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHotelRoom(HotelRoom hotelRoom) {
		if(hotelRoomList == null) {
			hotelRoomList = new ArrayList<>();
		}
		if(hotelRoomList.size() == 0) {
			hotelRoomList.add(hotelRoom);
		} else {
			hotelRoomList.set(0, hotelRoom);
		}
	}

	@Override
	public List<HotelRoom> getHotelRoomList() {
		return hotelRoomList;
	}

	@Override
	public void setHotelRoomList(List<HotelRoom> hotelRoomList) {
		this.hotelRoomList = hotelRoomList;
	}

	@Override
	public boolean hasHotelRoom() {
		return hotelRoomList != null && hotelRoomList.size() > 0 && hotelRoomList.get(0) != null;
	}

	public ITEM_REVIEWED(House house) {
		houseList = new ArrayList<House>();
		houseList.add(house);
	}

	@Override
	public House getHouse() {
		if(houseList != null && houseList.size() > 0) {
			return houseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHouse(House house) {
		if(houseList == null) {
			houseList = new ArrayList<>();
		}
		if(houseList.size() == 0) {
			houseList.add(house);
		} else {
			houseList.set(0, house);
		}
	}

	@Override
	public List<House> getHouseList() {
		return houseList;
	}

	@Override
	public void setHouseList(List<House> houseList) {
		this.houseList = houseList;
	}

	@Override
	public boolean hasHouse() {
		return houseList != null && houseList.size() > 0 && houseList.get(0) != null;
	}

	public ITEM_REVIEWED(HousePainter housePainter) {
		housePainterList = new ArrayList<HousePainter>();
		housePainterList.add(housePainter);
	}

	@Override
	public HousePainter getHousePainter() {
		if(housePainterList != null && housePainterList.size() > 0) {
			return housePainterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHousePainter(HousePainter housePainter) {
		if(housePainterList == null) {
			housePainterList = new ArrayList<>();
		}
		if(housePainterList.size() == 0) {
			housePainterList.add(housePainter);
		} else {
			housePainterList.set(0, housePainter);
		}
	}

	@Override
	public List<HousePainter> getHousePainterList() {
		return housePainterList;
	}

	@Override
	public void setHousePainterList(List<HousePainter> housePainterList) {
		this.housePainterList = housePainterList;
	}

	@Override
	public boolean hasHousePainter() {
		return housePainterList != null && housePainterList.size() > 0 && housePainterList.get(0) != null;
	}

	public ITEM_REVIEWED(HowTo howTo) {
		howToList = new ArrayList<HowTo>();
		howToList.add(howTo);
	}

	@Override
	public HowTo getHowTo() {
		if(howToList != null && howToList.size() > 0) {
			return howToList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowTo(HowTo howTo) {
		if(howToList == null) {
			howToList = new ArrayList<>();
		}
		if(howToList.size() == 0) {
			howToList.add(howTo);
		} else {
			howToList.set(0, howTo);
		}
	}

	@Override
	public List<HowTo> getHowToList() {
		return howToList;
	}

	@Override
	public void setHowToList(List<HowTo> howToList) {
		this.howToList = howToList;
	}

	@Override
	public boolean hasHowTo() {
		return howToList != null && howToList.size() > 0 && howToList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToDirection howToDirection) {
		howToDirectionList = new ArrayList<HowToDirection>();
		howToDirectionList.add(howToDirection);
	}

	@Override
	public HowToDirection getHowToDirection() {
		if(howToDirectionList != null && howToDirectionList.size() > 0) {
			return howToDirectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToDirection(HowToDirection howToDirection) {
		if(howToDirectionList == null) {
			howToDirectionList = new ArrayList<>();
		}
		if(howToDirectionList.size() == 0) {
			howToDirectionList.add(howToDirection);
		} else {
			howToDirectionList.set(0, howToDirection);
		}
	}

	@Override
	public List<HowToDirection> getHowToDirectionList() {
		return howToDirectionList;
	}

	@Override
	public void setHowToDirectionList(List<HowToDirection> howToDirectionList) {
		this.howToDirectionList = howToDirectionList;
	}

	@Override
	public boolean hasHowToDirection() {
		return howToDirectionList != null && howToDirectionList.size() > 0 && howToDirectionList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToItem howToItem) {
		howToItemList = new ArrayList<HowToItem>();
		howToItemList.add(howToItem);
	}

	@Override
	public HowToItem getHowToItem() {
		if(howToItemList != null && howToItemList.size() > 0) {
			return howToItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToItem(HowToItem howToItem) {
		if(howToItemList == null) {
			howToItemList = new ArrayList<>();
		}
		if(howToItemList.size() == 0) {
			howToItemList.add(howToItem);
		} else {
			howToItemList.set(0, howToItem);
		}
	}

	@Override
	public List<HowToItem> getHowToItemList() {
		return howToItemList;
	}

	@Override
	public void setHowToItemList(List<HowToItem> howToItemList) {
		this.howToItemList = howToItemList;
	}

	@Override
	public boolean hasHowToItem() {
		return howToItemList != null && howToItemList.size() > 0 && howToItemList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToSection howToSection) {
		howToSectionList = new ArrayList<HowToSection>();
		howToSectionList.add(howToSection);
	}

	@Override
	public HowToSection getHowToSection() {
		if(howToSectionList != null && howToSectionList.size() > 0) {
			return howToSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSection(HowToSection howToSection) {
		if(howToSectionList == null) {
			howToSectionList = new ArrayList<>();
		}
		if(howToSectionList.size() == 0) {
			howToSectionList.add(howToSection);
		} else {
			howToSectionList.set(0, howToSection);
		}
	}

	@Override
	public List<HowToSection> getHowToSectionList() {
		return howToSectionList;
	}

	@Override
	public void setHowToSectionList(List<HowToSection> howToSectionList) {
		this.howToSectionList = howToSectionList;
	}

	@Override
	public boolean hasHowToSection() {
		return howToSectionList != null && howToSectionList.size() > 0 && howToSectionList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToStep howToStep) {
		howToStepList = new ArrayList<HowToStep>();
		howToStepList.add(howToStep);
	}

	@Override
	public HowToStep getHowToStep() {
		if(howToStepList != null && howToStepList.size() > 0) {
			return howToStepList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToStep(HowToStep howToStep) {
		if(howToStepList == null) {
			howToStepList = new ArrayList<>();
		}
		if(howToStepList.size() == 0) {
			howToStepList.add(howToStep);
		} else {
			howToStepList.set(0, howToStep);
		}
	}

	@Override
	public List<HowToStep> getHowToStepList() {
		return howToStepList;
	}

	@Override
	public void setHowToStepList(List<HowToStep> howToStepList) {
		this.howToStepList = howToStepList;
	}

	@Override
	public boolean hasHowToStep() {
		return howToStepList != null && howToStepList.size() > 0 && howToStepList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToSupply howToSupply) {
		howToSupplyList = new ArrayList<HowToSupply>();
		howToSupplyList.add(howToSupply);
	}

	@Override
	public HowToSupply getHowToSupply() {
		if(howToSupplyList != null && howToSupplyList.size() > 0) {
			return howToSupplyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSupply(HowToSupply howToSupply) {
		if(howToSupplyList == null) {
			howToSupplyList = new ArrayList<>();
		}
		if(howToSupplyList.size() == 0) {
			howToSupplyList.add(howToSupply);
		} else {
			howToSupplyList.set(0, howToSupply);
		}
	}

	@Override
	public List<HowToSupply> getHowToSupplyList() {
		return howToSupplyList;
	}

	@Override
	public void setHowToSupplyList(List<HowToSupply> howToSupplyList) {
		this.howToSupplyList = howToSupplyList;
	}

	@Override
	public boolean hasHowToSupply() {
		return howToSupplyList != null && howToSupplyList.size() > 0 && howToSupplyList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToTip howToTip) {
		howToTipList = new ArrayList<HowToTip>();
		howToTipList.add(howToTip);
	}

	@Override
	public HowToTip getHowToTip() {
		if(howToTipList != null && howToTipList.size() > 0) {
			return howToTipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTip(HowToTip howToTip) {
		if(howToTipList == null) {
			howToTipList = new ArrayList<>();
		}
		if(howToTipList.size() == 0) {
			howToTipList.add(howToTip);
		} else {
			howToTipList.set(0, howToTip);
		}
	}

	@Override
	public List<HowToTip> getHowToTipList() {
		return howToTipList;
	}

	@Override
	public void setHowToTipList(List<HowToTip> howToTipList) {
		this.howToTipList = howToTipList;
	}

	@Override
	public boolean hasHowToTip() {
		return howToTipList != null && howToTipList.size() > 0 && howToTipList.get(0) != null;
	}

	public ITEM_REVIEWED(HowToTool howToTool) {
		howToToolList = new ArrayList<HowToTool>();
		howToToolList.add(howToTool);
	}

	@Override
	public HowToTool getHowToTool() {
		if(howToToolList != null && howToToolList.size() > 0) {
			return howToToolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTool(HowToTool howToTool) {
		if(howToToolList == null) {
			howToToolList = new ArrayList<>();
		}
		if(howToToolList.size() == 0) {
			howToToolList.add(howToTool);
		} else {
			howToToolList.set(0, howToTool);
		}
	}

	@Override
	public List<HowToTool> getHowToToolList() {
		return howToToolList;
	}

	@Override
	public void setHowToToolList(List<HowToTool> howToToolList) {
		this.howToToolList = howToToolList;
	}

	@Override
	public boolean hasHowToTool() {
		return howToToolList != null && howToToolList.size() > 0 && howToToolList.get(0) != null;
	}

	public ITEM_REVIEWED(IceCreamShop iceCreamShop) {
		iceCreamShopList = new ArrayList<IceCreamShop>();
		iceCreamShopList.add(iceCreamShop);
	}

	@Override
	public IceCreamShop getIceCreamShop() {
		if(iceCreamShopList != null && iceCreamShopList.size() > 0) {
			return iceCreamShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIceCreamShop(IceCreamShop iceCreamShop) {
		if(iceCreamShopList == null) {
			iceCreamShopList = new ArrayList<>();
		}
		if(iceCreamShopList.size() == 0) {
			iceCreamShopList.add(iceCreamShop);
		} else {
			iceCreamShopList.set(0, iceCreamShop);
		}
	}

	@Override
	public List<IceCreamShop> getIceCreamShopList() {
		return iceCreamShopList;
	}

	@Override
	public void setIceCreamShopList(List<IceCreamShop> iceCreamShopList) {
		this.iceCreamShopList = iceCreamShopList;
	}

	@Override
	public boolean hasIceCreamShop() {
		return iceCreamShopList != null && iceCreamShopList.size() > 0 && iceCreamShopList.get(0) != null;
	}

	public ITEM_REVIEWED(IgnoreAction ignoreAction) {
		ignoreActionList = new ArrayList<IgnoreAction>();
		ignoreActionList.add(ignoreAction);
	}

	@Override
	public IgnoreAction getIgnoreAction() {
		if(ignoreActionList != null && ignoreActionList.size() > 0) {
			return ignoreActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIgnoreAction(IgnoreAction ignoreAction) {
		if(ignoreActionList == null) {
			ignoreActionList = new ArrayList<>();
		}
		if(ignoreActionList.size() == 0) {
			ignoreActionList.add(ignoreAction);
		} else {
			ignoreActionList.set(0, ignoreAction);
		}
	}

	@Override
	public List<IgnoreAction> getIgnoreActionList() {
		return ignoreActionList;
	}

	@Override
	public void setIgnoreActionList(List<IgnoreAction> ignoreActionList) {
		this.ignoreActionList = ignoreActionList;
	}

	@Override
	public boolean hasIgnoreAction() {
		return ignoreActionList != null && ignoreActionList.size() > 0 && ignoreActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ImageGallery imageGallery) {
		imageGalleryList = new ArrayList<ImageGallery>();
		imageGalleryList.add(imageGallery);
	}

	@Override
	public ImageGallery getImageGallery() {
		if(imageGalleryList != null && imageGalleryList.size() > 0) {
			return imageGalleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageGallery(ImageGallery imageGallery) {
		if(imageGalleryList == null) {
			imageGalleryList = new ArrayList<>();
		}
		if(imageGalleryList.size() == 0) {
			imageGalleryList.add(imageGallery);
		} else {
			imageGalleryList.set(0, imageGallery);
		}
	}

	@Override
	public List<ImageGallery> getImageGalleryList() {
		return imageGalleryList;
	}

	@Override
	public void setImageGalleryList(List<ImageGallery> imageGalleryList) {
		this.imageGalleryList = imageGalleryList;
	}

	@Override
	public boolean hasImageGallery() {
		return imageGalleryList != null && imageGalleryList.size() > 0 && imageGalleryList.get(0) != null;
	}

	public ITEM_REVIEWED(ImageObject imageObject) {
		imageObjectList = new ArrayList<ImageObject>();
		imageObjectList.add(imageObject);
	}

	@Override
	public ImageObject getImageObject() {
		if(imageObjectList != null && imageObjectList.size() > 0) {
			return imageObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageObject(ImageObject imageObject) {
		if(imageObjectList == null) {
			imageObjectList = new ArrayList<>();
		}
		if(imageObjectList.size() == 0) {
			imageObjectList.add(imageObject);
		} else {
			imageObjectList.set(0, imageObject);
		}
	}

	@Override
	public List<ImageObject> getImageObjectList() {
		return imageObjectList;
	}

	@Override
	public void setImageObjectList(List<ImageObject> imageObjectList) {
		this.imageObjectList = imageObjectList;
	}

	@Override
	public boolean hasImageObject() {
		return imageObjectList != null && imageObjectList.size() > 0 && imageObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(ImagingTest imagingTest) {
		imagingTestList = new ArrayList<ImagingTest>();
		imagingTestList.add(imagingTest);
	}

	@Override
	public ImagingTest getImagingTest() {
		if(imagingTestList != null && imagingTestList.size() > 0) {
			return imagingTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImagingTest(ImagingTest imagingTest) {
		if(imagingTestList == null) {
			imagingTestList = new ArrayList<>();
		}
		if(imagingTestList.size() == 0) {
			imagingTestList.add(imagingTest);
		} else {
			imagingTestList.set(0, imagingTest);
		}
	}

	@Override
	public List<ImagingTest> getImagingTestList() {
		return imagingTestList;
	}

	@Override
	public void setImagingTestList(List<ImagingTest> imagingTestList) {
		this.imagingTestList = imagingTestList;
	}

	@Override
	public boolean hasImagingTest() {
		return imagingTestList != null && imagingTestList.size() > 0 && imagingTestList.get(0) != null;
	}

	public ITEM_REVIEWED(IndividualProduct individualProduct) {
		individualProductList = new ArrayList<IndividualProduct>();
		individualProductList.add(individualProduct);
	}

	@Override
	public IndividualProduct getIndividualProduct() {
		if(individualProductList != null && individualProductList.size() > 0) {
			return individualProductList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIndividualProduct(IndividualProduct individualProduct) {
		if(individualProductList == null) {
			individualProductList = new ArrayList<>();
		}
		if(individualProductList.size() == 0) {
			individualProductList.add(individualProduct);
		} else {
			individualProductList.set(0, individualProduct);
		}
	}

	@Override
	public List<IndividualProduct> getIndividualProductList() {
		return individualProductList;
	}

	@Override
	public void setIndividualProductList(List<IndividualProduct> individualProductList) {
		this.individualProductList = individualProductList;
	}

	@Override
	public boolean hasIndividualProduct() {
		return individualProductList != null && individualProductList.size() > 0 && individualProductList.get(0) != null;
	}

	public ITEM_REVIEWED(InfectiousAgentClass infectiousAgentClass) {
		infectiousAgentClassList = new ArrayList<InfectiousAgentClass>();
		infectiousAgentClassList.add(infectiousAgentClass);
	}

	@Override
	public InfectiousAgentClass getInfectiousAgentClass() {
		if(infectiousAgentClassList != null && infectiousAgentClassList.size() > 0) {
			return infectiousAgentClassList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
		if(infectiousAgentClassList == null) {
			infectiousAgentClassList = new ArrayList<>();
		}
		if(infectiousAgentClassList.size() == 0) {
			infectiousAgentClassList.add(infectiousAgentClass);
		} else {
			infectiousAgentClassList.set(0, infectiousAgentClass);
		}
	}

	@Override
	public List<InfectiousAgentClass> getInfectiousAgentClassList() {
		return infectiousAgentClassList;
	}

	@Override
	public void setInfectiousAgentClassList(List<InfectiousAgentClass> infectiousAgentClassList) {
		this.infectiousAgentClassList = infectiousAgentClassList;
	}

	@Override
	public boolean hasInfectiousAgentClass() {
		return infectiousAgentClassList != null && infectiousAgentClassList.size() > 0 && infectiousAgentClassList.get(0) != null;
	}

	public ITEM_REVIEWED(InfectiousDisease infectiousDisease) {
		infectiousDiseaseList = new ArrayList<InfectiousDisease>();
		infectiousDiseaseList.add(infectiousDisease);
	}

	@Override
	public InfectiousDisease getInfectiousDisease() {
		if(infectiousDiseaseList != null && infectiousDiseaseList.size() > 0) {
			return infectiousDiseaseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInfectiousDisease(InfectiousDisease infectiousDisease) {
		if(infectiousDiseaseList == null) {
			infectiousDiseaseList = new ArrayList<>();
		}
		if(infectiousDiseaseList.size() == 0) {
			infectiousDiseaseList.add(infectiousDisease);
		} else {
			infectiousDiseaseList.set(0, infectiousDisease);
		}
	}

	@Override
	public List<InfectiousDisease> getInfectiousDiseaseList() {
		return infectiousDiseaseList;
	}

	@Override
	public void setInfectiousDiseaseList(List<InfectiousDisease> infectiousDiseaseList) {
		this.infectiousDiseaseList = infectiousDiseaseList;
	}

	@Override
	public boolean hasInfectiousDisease() {
		return infectiousDiseaseList != null && infectiousDiseaseList.size() > 0 && infectiousDiseaseList.get(0) != null;
	}

	public ITEM_REVIEWED(InformAction informAction) {
		informActionList = new ArrayList<InformAction>();
		informActionList.add(informAction);
	}

	@Override
	public InformAction getInformAction() {
		if(informActionList != null && informActionList.size() > 0) {
			return informActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInformAction(InformAction informAction) {
		if(informActionList == null) {
			informActionList = new ArrayList<>();
		}
		if(informActionList.size() == 0) {
			informActionList.add(informAction);
		} else {
			informActionList.set(0, informAction);
		}
	}

	@Override
	public List<InformAction> getInformActionList() {
		return informActionList;
	}

	@Override
	public void setInformActionList(List<InformAction> informActionList) {
		this.informActionList = informActionList;
	}

	@Override
	public boolean hasInformAction() {
		return informActionList != null && informActionList.size() > 0 && informActionList.get(0) != null;
	}

	public ITEM_REVIEWED(InsertAction insertAction) {
		insertActionList = new ArrayList<InsertAction>();
		insertActionList.add(insertAction);
	}

	@Override
	public InsertAction getInsertAction() {
		if(insertActionList != null && insertActionList.size() > 0) {
			return insertActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInsertAction(InsertAction insertAction) {
		if(insertActionList == null) {
			insertActionList = new ArrayList<>();
		}
		if(insertActionList.size() == 0) {
			insertActionList.add(insertAction);
		} else {
			insertActionList.set(0, insertAction);
		}
	}

	@Override
	public List<InsertAction> getInsertActionList() {
		return insertActionList;
	}

	@Override
	public void setInsertActionList(List<InsertAction> insertActionList) {
		this.insertActionList = insertActionList;
	}

	@Override
	public boolean hasInsertAction() {
		return insertActionList != null && insertActionList.size() > 0 && insertActionList.get(0) != null;
	}

	public ITEM_REVIEWED(InstallAction installAction) {
		installActionList = new ArrayList<InstallAction>();
		installActionList.add(installAction);
	}

	@Override
	public InstallAction getInstallAction() {
		if(installActionList != null && installActionList.size() > 0) {
			return installActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInstallAction(InstallAction installAction) {
		if(installActionList == null) {
			installActionList = new ArrayList<>();
		}
		if(installActionList.size() == 0) {
			installActionList.add(installAction);
		} else {
			installActionList.set(0, installAction);
		}
	}

	@Override
	public List<InstallAction> getInstallActionList() {
		return installActionList;
	}

	@Override
	public void setInstallActionList(List<InstallAction> installActionList) {
		this.installActionList = installActionList;
	}

	@Override
	public boolean hasInstallAction() {
		return installActionList != null && installActionList.size() > 0 && installActionList.get(0) != null;
	}

	public ITEM_REVIEWED(InsuranceAgency insuranceAgency) {
		insuranceAgencyList = new ArrayList<InsuranceAgency>();
		insuranceAgencyList.add(insuranceAgency);
	}

	@Override
	public InsuranceAgency getInsuranceAgency() {
		if(insuranceAgencyList != null && insuranceAgencyList.size() > 0) {
			return insuranceAgencyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInsuranceAgency(InsuranceAgency insuranceAgency) {
		if(insuranceAgencyList == null) {
			insuranceAgencyList = new ArrayList<>();
		}
		if(insuranceAgencyList.size() == 0) {
			insuranceAgencyList.add(insuranceAgency);
		} else {
			insuranceAgencyList.set(0, insuranceAgency);
		}
	}

	@Override
	public List<InsuranceAgency> getInsuranceAgencyList() {
		return insuranceAgencyList;
	}

	@Override
	public void setInsuranceAgencyList(List<InsuranceAgency> insuranceAgencyList) {
		this.insuranceAgencyList = insuranceAgencyList;
	}

	@Override
	public boolean hasInsuranceAgency() {
		return insuranceAgencyList != null && insuranceAgencyList.size() > 0 && insuranceAgencyList.get(0) != null;
	}

	public ITEM_REVIEWED(Intangible intangible) {
		intangibleList = new ArrayList<Intangible>();
		intangibleList.add(intangible);
	}

	@Override
	public Intangible getIntangible() {
		if(intangibleList != null && intangibleList.size() > 0) {
			return intangibleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIntangible(Intangible intangible) {
		if(intangibleList == null) {
			intangibleList = new ArrayList<>();
		}
		if(intangibleList.size() == 0) {
			intangibleList.add(intangible);
		} else {
			intangibleList.set(0, intangible);
		}
	}

	@Override
	public List<Intangible> getIntangibleList() {
		return intangibleList;
	}

	@Override
	public void setIntangibleList(List<Intangible> intangibleList) {
		this.intangibleList = intangibleList;
	}

	@Override
	public boolean hasIntangible() {
		return intangibleList != null && intangibleList.size() > 0 && intangibleList.get(0) != null;
	}

	public ITEM_REVIEWED(InteractAction interactAction) {
		interactActionList = new ArrayList<InteractAction>();
		interactActionList.add(interactAction);
	}

	@Override
	public InteractAction getInteractAction() {
		if(interactActionList != null && interactActionList.size() > 0) {
			return interactActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteractAction(InteractAction interactAction) {
		if(interactActionList == null) {
			interactActionList = new ArrayList<>();
		}
		if(interactActionList.size() == 0) {
			interactActionList.add(interactAction);
		} else {
			interactActionList.set(0, interactAction);
		}
	}

	@Override
	public List<InteractAction> getInteractActionList() {
		return interactActionList;
	}

	@Override
	public void setInteractActionList(List<InteractAction> interactActionList) {
		this.interactActionList = interactActionList;
	}

	@Override
	public boolean hasInteractAction() {
		return interactActionList != null && interactActionList.size() > 0 && interactActionList.get(0) != null;
	}

	public ITEM_REVIEWED(InteractionCounter interactionCounter) {
		interactionCounterList = new ArrayList<InteractionCounter>();
		interactionCounterList.add(interactionCounter);
	}

	@Override
	public InteractionCounter getInteractionCounter() {
		if(interactionCounterList != null && interactionCounterList.size() > 0) {
			return interactionCounterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteractionCounter(InteractionCounter interactionCounter) {
		if(interactionCounterList == null) {
			interactionCounterList = new ArrayList<>();
		}
		if(interactionCounterList.size() == 0) {
			interactionCounterList.add(interactionCounter);
		} else {
			interactionCounterList.set(0, interactionCounter);
		}
	}

	@Override
	public List<InteractionCounter> getInteractionCounterList() {
		return interactionCounterList;
	}

	@Override
	public void setInteractionCounterList(List<InteractionCounter> interactionCounterList) {
		this.interactionCounterList = interactionCounterList;
	}

	@Override
	public boolean hasInteractionCounter() {
		return interactionCounterList != null && interactionCounterList.size() > 0 && interactionCounterList.get(0) != null;
	}

	public ITEM_REVIEWED(InternetCafe internetCafe) {
		internetCafeList = new ArrayList<InternetCafe>();
		internetCafeList.add(internetCafe);
	}

	@Override
	public InternetCafe getInternetCafe() {
		if(internetCafeList != null && internetCafeList.size() > 0) {
			return internetCafeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInternetCafe(InternetCafe internetCafe) {
		if(internetCafeList == null) {
			internetCafeList = new ArrayList<>();
		}
		if(internetCafeList.size() == 0) {
			internetCafeList.add(internetCafe);
		} else {
			internetCafeList.set(0, internetCafe);
		}
	}

	@Override
	public List<InternetCafe> getInternetCafeList() {
		return internetCafeList;
	}

	@Override
	public void setInternetCafeList(List<InternetCafe> internetCafeList) {
		this.internetCafeList = internetCafeList;
	}

	@Override
	public boolean hasInternetCafe() {
		return internetCafeList != null && internetCafeList.size() > 0 && internetCafeList.get(0) != null;
	}

	public ITEM_REVIEWED(InvestmentFund investmentFund) {
		investmentFundList = new ArrayList<InvestmentFund>();
		investmentFundList.add(investmentFund);
	}

	@Override
	public InvestmentFund getInvestmentFund() {
		if(investmentFundList != null && investmentFundList.size() > 0) {
			return investmentFundList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvestmentFund(InvestmentFund investmentFund) {
		if(investmentFundList == null) {
			investmentFundList = new ArrayList<>();
		}
		if(investmentFundList.size() == 0) {
			investmentFundList.add(investmentFund);
		} else {
			investmentFundList.set(0, investmentFund);
		}
	}

	@Override
	public List<InvestmentFund> getInvestmentFundList() {
		return investmentFundList;
	}

	@Override
	public void setInvestmentFundList(List<InvestmentFund> investmentFundList) {
		this.investmentFundList = investmentFundList;
	}

	@Override
	public boolean hasInvestmentFund() {
		return investmentFundList != null && investmentFundList.size() > 0 && investmentFundList.get(0) != null;
	}

	public ITEM_REVIEWED(InvestmentOrDeposit investmentOrDeposit) {
		investmentOrDepositList = new ArrayList<InvestmentOrDeposit>();
		investmentOrDepositList.add(investmentOrDeposit);
	}

	@Override
	public InvestmentOrDeposit getInvestmentOrDeposit() {
		if(investmentOrDepositList != null && investmentOrDepositList.size() > 0) {
			return investmentOrDepositList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvestmentOrDeposit(InvestmentOrDeposit investmentOrDeposit) {
		if(investmentOrDepositList == null) {
			investmentOrDepositList = new ArrayList<>();
		}
		if(investmentOrDepositList.size() == 0) {
			investmentOrDepositList.add(investmentOrDeposit);
		} else {
			investmentOrDepositList.set(0, investmentOrDeposit);
		}
	}

	@Override
	public List<InvestmentOrDeposit> getInvestmentOrDepositList() {
		return investmentOrDepositList;
	}

	@Override
	public void setInvestmentOrDepositList(List<InvestmentOrDeposit> investmentOrDepositList) {
		this.investmentOrDepositList = investmentOrDepositList;
	}

	@Override
	public boolean hasInvestmentOrDeposit() {
		return investmentOrDepositList != null && investmentOrDepositList.size() > 0 && investmentOrDepositList.get(0) != null;
	}

	public ITEM_REVIEWED(InviteAction inviteAction) {
		inviteActionList = new ArrayList<InviteAction>();
		inviteActionList.add(inviteAction);
	}

	@Override
	public InviteAction getInviteAction() {
		if(inviteActionList != null && inviteActionList.size() > 0) {
			return inviteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInviteAction(InviteAction inviteAction) {
		if(inviteActionList == null) {
			inviteActionList = new ArrayList<>();
		}
		if(inviteActionList.size() == 0) {
			inviteActionList.add(inviteAction);
		} else {
			inviteActionList.set(0, inviteAction);
		}
	}

	@Override
	public List<InviteAction> getInviteActionList() {
		return inviteActionList;
	}

	@Override
	public void setInviteActionList(List<InviteAction> inviteActionList) {
		this.inviteActionList = inviteActionList;
	}

	@Override
	public boolean hasInviteAction() {
		return inviteActionList != null && inviteActionList.size() > 0 && inviteActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Invoice invoice) {
		invoiceList = new ArrayList<Invoice>();
		invoiceList.add(invoice);
	}

	@Override
	public Invoice getInvoice() {
		if(invoiceList != null && invoiceList.size() > 0) {
			return invoiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvoice(Invoice invoice) {
		if(invoiceList == null) {
			invoiceList = new ArrayList<>();
		}
		if(invoiceList.size() == 0) {
			invoiceList.add(invoice);
		} else {
			invoiceList.set(0, invoice);
		}
	}

	@Override
	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}

	@Override
	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

	@Override
	public boolean hasInvoice() {
		return invoiceList != null && invoiceList.size() > 0 && invoiceList.get(0) != null;
	}

	public ITEM_REVIEWED(ItemAvailability itemAvailability) {
		itemAvailabilityList = new ArrayList<ItemAvailability>();
		itemAvailabilityList.add(itemAvailability);
	}

	@Override
	public ItemAvailability getItemAvailability() {
		if(itemAvailabilityList != null && itemAvailabilityList.size() > 0) {
			return itemAvailabilityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemAvailability(ItemAvailability itemAvailability) {
		if(itemAvailabilityList == null) {
			itemAvailabilityList = new ArrayList<>();
		}
		if(itemAvailabilityList.size() == 0) {
			itemAvailabilityList.add(itemAvailability);
		} else {
			itemAvailabilityList.set(0, itemAvailability);
		}
	}

	@Override
	public List<ItemAvailability> getItemAvailabilityList() {
		return itemAvailabilityList;
	}

	@Override
	public void setItemAvailabilityList(List<ItemAvailability> itemAvailabilityList) {
		this.itemAvailabilityList = itemAvailabilityList;
	}

	@Override
	public boolean hasItemAvailability() {
		return itemAvailabilityList != null && itemAvailabilityList.size() > 0 && itemAvailabilityList.get(0) != null;
	}

	public ITEM_REVIEWED(ItemList itemList) {
		itemListList = new ArrayList<ItemList>();
		itemListList.add(itemList);
	}

	@Override
	public ItemList getItemList() {
		if(itemListList != null && itemListList.size() > 0) {
			return itemListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemList(ItemList itemList) {
		if(itemListList == null) {
			itemListList = new ArrayList<>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(itemList);
		} else {
			itemListList.set(0, itemList);
		}
	}

	@Override
	public List<ItemList> getItemListList() {
		return itemListList;
	}

	@Override
	public void setItemListList(List<ItemList> itemListList) {
		this.itemListList = itemListList;
	}

	@Override
	public boolean hasItemList() {
		return itemListList != null && itemListList.size() > 0 && itemListList.get(0) != null;
	}

	public ITEM_REVIEWED(ItemListOrderType itemListOrderType) {
		itemListOrderTypeList = new ArrayList<ItemListOrderType>();
		itemListOrderTypeList.add(itemListOrderType);
	}

	@Override
	public ItemListOrderType getItemListOrderType() {
		if(itemListOrderTypeList != null && itemListOrderTypeList.size() > 0) {
			return itemListOrderTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemListOrderType(ItemListOrderType itemListOrderType) {
		if(itemListOrderTypeList == null) {
			itemListOrderTypeList = new ArrayList<>();
		}
		if(itemListOrderTypeList.size() == 0) {
			itemListOrderTypeList.add(itemListOrderType);
		} else {
			itemListOrderTypeList.set(0, itemListOrderType);
		}
	}

	@Override
	public List<ItemListOrderType> getItemListOrderTypeList() {
		return itemListOrderTypeList;
	}

	@Override
	public void setItemListOrderTypeList(List<ItemListOrderType> itemListOrderTypeList) {
		this.itemListOrderTypeList = itemListOrderTypeList;
	}

	@Override
	public boolean hasItemListOrderType() {
		return itemListOrderTypeList != null && itemListOrderTypeList.size() > 0 && itemListOrderTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(ItemPage itemPage) {
		itemPageList = new ArrayList<ItemPage>();
		itemPageList.add(itemPage);
	}

	@Override
	public ItemPage getItemPage() {
		if(itemPageList != null && itemPageList.size() > 0) {
			return itemPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemPage(ItemPage itemPage) {
		if(itemPageList == null) {
			itemPageList = new ArrayList<>();
		}
		if(itemPageList.size() == 0) {
			itemPageList.add(itemPage);
		} else {
			itemPageList.set(0, itemPage);
		}
	}

	@Override
	public List<ItemPage> getItemPageList() {
		return itemPageList;
	}

	@Override
	public void setItemPageList(List<ItemPage> itemPageList) {
		this.itemPageList = itemPageList;
	}

	@Override
	public boolean hasItemPage() {
		return itemPageList != null && itemPageList.size() > 0 && itemPageList.get(0) != null;
	}

	public ITEM_REVIEWED(JewelryStore jewelryStore) {
		jewelryStoreList = new ArrayList<JewelryStore>();
		jewelryStoreList.add(jewelryStore);
	}

	@Override
	public JewelryStore getJewelryStore() {
		if(jewelryStoreList != null && jewelryStoreList.size() > 0) {
			return jewelryStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJewelryStore(JewelryStore jewelryStore) {
		if(jewelryStoreList == null) {
			jewelryStoreList = new ArrayList<>();
		}
		if(jewelryStoreList.size() == 0) {
			jewelryStoreList.add(jewelryStore);
		} else {
			jewelryStoreList.set(0, jewelryStore);
		}
	}

	@Override
	public List<JewelryStore> getJewelryStoreList() {
		return jewelryStoreList;
	}

	@Override
	public void setJewelryStoreList(List<JewelryStore> jewelryStoreList) {
		this.jewelryStoreList = jewelryStoreList;
	}

	@Override
	public boolean hasJewelryStore() {
		return jewelryStoreList != null && jewelryStoreList.size() > 0 && jewelryStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(JobPosting jobPosting) {
		jobPostingList = new ArrayList<JobPosting>();
		jobPostingList.add(jobPosting);
	}

	@Override
	public JobPosting getJobPosting() {
		if(jobPostingList != null && jobPostingList.size() > 0) {
			return jobPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJobPosting(JobPosting jobPosting) {
		if(jobPostingList == null) {
			jobPostingList = new ArrayList<>();
		}
		if(jobPostingList.size() == 0) {
			jobPostingList.add(jobPosting);
		} else {
			jobPostingList.set(0, jobPosting);
		}
	}

	@Override
	public List<JobPosting> getJobPostingList() {
		return jobPostingList;
	}

	@Override
	public void setJobPostingList(List<JobPosting> jobPostingList) {
		this.jobPostingList = jobPostingList;
	}

	@Override
	public boolean hasJobPosting() {
		return jobPostingList != null && jobPostingList.size() > 0 && jobPostingList.get(0) != null;
	}

	public ITEM_REVIEWED(JoinAction joinAction) {
		joinActionList = new ArrayList<JoinAction>();
		joinActionList.add(joinAction);
	}

	@Override
	public JoinAction getJoinAction() {
		if(joinActionList != null && joinActionList.size() > 0) {
			return joinActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJoinAction(JoinAction joinAction) {
		if(joinActionList == null) {
			joinActionList = new ArrayList<>();
		}
		if(joinActionList.size() == 0) {
			joinActionList.add(joinAction);
		} else {
			joinActionList.set(0, joinAction);
		}
	}

	@Override
	public List<JoinAction> getJoinActionList() {
		return joinActionList;
	}

	@Override
	public void setJoinActionList(List<JoinAction> joinActionList) {
		this.joinActionList = joinActionList;
	}

	@Override
	public boolean hasJoinAction() {
		return joinActionList != null && joinActionList.size() > 0 && joinActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Joint joint) {
		jointList = new ArrayList<Joint>();
		jointList.add(joint);
	}

	@Override
	public Joint getJoint() {
		if(jointList != null && jointList.size() > 0) {
			return jointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJoint(Joint joint) {
		if(jointList == null) {
			jointList = new ArrayList<>();
		}
		if(jointList.size() == 0) {
			jointList.add(joint);
		} else {
			jointList.set(0, joint);
		}
	}

	@Override
	public List<Joint> getJointList() {
		return jointList;
	}

	@Override
	public void setJointList(List<Joint> jointList) {
		this.jointList = jointList;
	}

	@Override
	public boolean hasJoint() {
		return jointList != null && jointList.size() > 0 && jointList.get(0) != null;
	}

	public ITEM_REVIEWED(LakeBodyOfWater lakeBodyOfWater) {
		lakeBodyOfWaterList = new ArrayList<LakeBodyOfWater>();
		lakeBodyOfWaterList.add(lakeBodyOfWater);
	}

	@Override
	public LakeBodyOfWater getLakeBodyOfWater() {
		if(lakeBodyOfWaterList != null && lakeBodyOfWaterList.size() > 0) {
			return lakeBodyOfWaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLakeBodyOfWater(LakeBodyOfWater lakeBodyOfWater) {
		if(lakeBodyOfWaterList == null) {
			lakeBodyOfWaterList = new ArrayList<>();
		}
		if(lakeBodyOfWaterList.size() == 0) {
			lakeBodyOfWaterList.add(lakeBodyOfWater);
		} else {
			lakeBodyOfWaterList.set(0, lakeBodyOfWater);
		}
	}

	@Override
	public List<LakeBodyOfWater> getLakeBodyOfWaterList() {
		return lakeBodyOfWaterList;
	}

	@Override
	public void setLakeBodyOfWaterList(List<LakeBodyOfWater> lakeBodyOfWaterList) {
		this.lakeBodyOfWaterList = lakeBodyOfWaterList;
	}

	@Override
	public boolean hasLakeBodyOfWater() {
		return lakeBodyOfWaterList != null && lakeBodyOfWaterList.size() > 0 && lakeBodyOfWaterList.get(0) != null;
	}

	public ITEM_REVIEWED(Landform landform) {
		landformList = new ArrayList<Landform>();
		landformList.add(landform);
	}

	@Override
	public Landform getLandform() {
		if(landformList != null && landformList.size() > 0) {
			return landformList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLandform(Landform landform) {
		if(landformList == null) {
			landformList = new ArrayList<>();
		}
		if(landformList.size() == 0) {
			landformList.add(landform);
		} else {
			landformList.set(0, landform);
		}
	}

	@Override
	public List<Landform> getLandformList() {
		return landformList;
	}

	@Override
	public void setLandformList(List<Landform> landformList) {
		this.landformList = landformList;
	}

	@Override
	public boolean hasLandform() {
		return landformList != null && landformList.size() > 0 && landformList.get(0) != null;
	}

	public ITEM_REVIEWED(LandmarksOrHistoricalBuildings landmarksOrHistoricalBuildings) {
		landmarksOrHistoricalBuildingsList = new ArrayList<LandmarksOrHistoricalBuildings>();
		landmarksOrHistoricalBuildingsList.add(landmarksOrHistoricalBuildings);
	}

	@Override
	public LandmarksOrHistoricalBuildings getLandmarksOrHistoricalBuildings() {
		if(landmarksOrHistoricalBuildingsList != null && landmarksOrHistoricalBuildingsList.size() > 0) {
			return landmarksOrHistoricalBuildingsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLandmarksOrHistoricalBuildings(LandmarksOrHistoricalBuildings landmarksOrHistoricalBuildings) {
		if(landmarksOrHistoricalBuildingsList == null) {
			landmarksOrHistoricalBuildingsList = new ArrayList<>();
		}
		if(landmarksOrHistoricalBuildingsList.size() == 0) {
			landmarksOrHistoricalBuildingsList.add(landmarksOrHistoricalBuildings);
		} else {
			landmarksOrHistoricalBuildingsList.set(0, landmarksOrHistoricalBuildings);
		}
	}

	@Override
	public List<LandmarksOrHistoricalBuildings> getLandmarksOrHistoricalBuildingsList() {
		return landmarksOrHistoricalBuildingsList;
	}

	@Override
	public void setLandmarksOrHistoricalBuildingsList(List<LandmarksOrHistoricalBuildings> landmarksOrHistoricalBuildingsList) {
		this.landmarksOrHistoricalBuildingsList = landmarksOrHistoricalBuildingsList;
	}

	@Override
	public boolean hasLandmarksOrHistoricalBuildings() {
		return landmarksOrHistoricalBuildingsList != null && landmarksOrHistoricalBuildingsList.size() > 0 && landmarksOrHistoricalBuildingsList.get(0) != null;
	}

	public ITEM_REVIEWED(Language language) {
		languageList = new ArrayList<Language>();
		languageList.add(language);
	}

	@Override
	public Language getLanguage() {
		if(languageList != null && languageList.size() > 0) {
			return languageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLanguage(Language language) {
		if(languageList == null) {
			languageList = new ArrayList<>();
		}
		if(languageList.size() == 0) {
			languageList.add(language);
		} else {
			languageList.set(0, language);
		}
	}

	@Override
	public List<Language> getLanguageList() {
		return languageList;
	}

	@Override
	public void setLanguageList(List<Language> languageList) {
		this.languageList = languageList;
	}

	@Override
	public boolean hasLanguage() {
		return languageList != null && languageList.size() > 0 && languageList.get(0) != null;
	}

	public ITEM_REVIEWED(LeaveAction leaveAction) {
		leaveActionList = new ArrayList<LeaveAction>();
		leaveActionList.add(leaveAction);
	}

	@Override
	public LeaveAction getLeaveAction() {
		if(leaveActionList != null && leaveActionList.size() > 0) {
			return leaveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLeaveAction(LeaveAction leaveAction) {
		if(leaveActionList == null) {
			leaveActionList = new ArrayList<>();
		}
		if(leaveActionList.size() == 0) {
			leaveActionList.add(leaveAction);
		} else {
			leaveActionList.set(0, leaveAction);
		}
	}

	@Override
	public List<LeaveAction> getLeaveActionList() {
		return leaveActionList;
	}

	@Override
	public void setLeaveActionList(List<LeaveAction> leaveActionList) {
		this.leaveActionList = leaveActionList;
	}

	@Override
	public boolean hasLeaveAction() {
		return leaveActionList != null && leaveActionList.size() > 0 && leaveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(LegalForceStatus legalForceStatus) {
		legalForceStatusList = new ArrayList<LegalForceStatus>();
		legalForceStatusList.add(legalForceStatus);
	}

	@Override
	public LegalForceStatus getLegalForceStatus() {
		if(legalForceStatusList != null && legalForceStatusList.size() > 0) {
			return legalForceStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegalForceStatus(LegalForceStatus legalForceStatus) {
		if(legalForceStatusList == null) {
			legalForceStatusList = new ArrayList<>();
		}
		if(legalForceStatusList.size() == 0) {
			legalForceStatusList.add(legalForceStatus);
		} else {
			legalForceStatusList.set(0, legalForceStatus);
		}
	}

	@Override
	public List<LegalForceStatus> getLegalForceStatusList() {
		return legalForceStatusList;
	}

	@Override
	public void setLegalForceStatusList(List<LegalForceStatus> legalForceStatusList) {
		this.legalForceStatusList = legalForceStatusList;
	}

	@Override
	public boolean hasLegalForceStatus() {
		return legalForceStatusList != null && legalForceStatusList.size() > 0 && legalForceStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(LegalService legalService) {
		legalServiceList = new ArrayList<LegalService>();
		legalServiceList.add(legalService);
	}

	@Override
	public LegalService getLegalService() {
		if(legalServiceList != null && legalServiceList.size() > 0) {
			return legalServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegalService(LegalService legalService) {
		if(legalServiceList == null) {
			legalServiceList = new ArrayList<>();
		}
		if(legalServiceList.size() == 0) {
			legalServiceList.add(legalService);
		} else {
			legalServiceList.set(0, legalService);
		}
	}

	@Override
	public List<LegalService> getLegalServiceList() {
		return legalServiceList;
	}

	@Override
	public void setLegalServiceList(List<LegalService> legalServiceList) {
		this.legalServiceList = legalServiceList;
	}

	@Override
	public boolean hasLegalService() {
		return legalServiceList != null && legalServiceList.size() > 0 && legalServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(LegalValueLevel legalValueLevel) {
		legalValueLevelList = new ArrayList<LegalValueLevel>();
		legalValueLevelList.add(legalValueLevel);
	}

	@Override
	public LegalValueLevel getLegalValueLevel() {
		if(legalValueLevelList != null && legalValueLevelList.size() > 0) {
			return legalValueLevelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegalValueLevel(LegalValueLevel legalValueLevel) {
		if(legalValueLevelList == null) {
			legalValueLevelList = new ArrayList<>();
		}
		if(legalValueLevelList.size() == 0) {
			legalValueLevelList.add(legalValueLevel);
		} else {
			legalValueLevelList.set(0, legalValueLevel);
		}
	}

	@Override
	public List<LegalValueLevel> getLegalValueLevelList() {
		return legalValueLevelList;
	}

	@Override
	public void setLegalValueLevelList(List<LegalValueLevel> legalValueLevelList) {
		this.legalValueLevelList = legalValueLevelList;
	}

	@Override
	public boolean hasLegalValueLevel() {
		return legalValueLevelList != null && legalValueLevelList.size() > 0 && legalValueLevelList.get(0) != null;
	}

	public ITEM_REVIEWED(Legislation legislation) {
		legislationList = new ArrayList<Legislation>();
		legislationList.add(legislation);
	}

	@Override
	public Legislation getLegislation() {
		if(legislationList != null && legislationList.size() > 0) {
			return legislationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislation(Legislation legislation) {
		if(legislationList == null) {
			legislationList = new ArrayList<>();
		}
		if(legislationList.size() == 0) {
			legislationList.add(legislation);
		} else {
			legislationList.set(0, legislation);
		}
	}

	@Override
	public List<Legislation> getLegislationList() {
		return legislationList;
	}

	@Override
	public void setLegislationList(List<Legislation> legislationList) {
		this.legislationList = legislationList;
	}

	@Override
	public boolean hasLegislation() {
		return legislationList != null && legislationList.size() > 0 && legislationList.get(0) != null;
	}

	public ITEM_REVIEWED(LegislationObject legislationObject) {
		legislationObjectList = new ArrayList<LegislationObject>();
		legislationObjectList.add(legislationObject);
	}

	@Override
	public LegislationObject getLegislationObject() {
		if(legislationObjectList != null && legislationObjectList.size() > 0) {
			return legislationObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislationObject(LegislationObject legislationObject) {
		if(legislationObjectList == null) {
			legislationObjectList = new ArrayList<>();
		}
		if(legislationObjectList.size() == 0) {
			legislationObjectList.add(legislationObject);
		} else {
			legislationObjectList.set(0, legislationObject);
		}
	}

	@Override
	public List<LegislationObject> getLegislationObjectList() {
		return legislationObjectList;
	}

	@Override
	public void setLegislationObjectList(List<LegislationObject> legislationObjectList) {
		this.legislationObjectList = legislationObjectList;
	}

	@Override
	public boolean hasLegislationObject() {
		return legislationObjectList != null && legislationObjectList.size() > 0 && legislationObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(LegislativeBuilding legislativeBuilding) {
		legislativeBuildingList = new ArrayList<LegislativeBuilding>();
		legislativeBuildingList.add(legislativeBuilding);
	}

	@Override
	public LegislativeBuilding getLegislativeBuilding() {
		if(legislativeBuildingList != null && legislativeBuildingList.size() > 0) {
			return legislativeBuildingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislativeBuilding(LegislativeBuilding legislativeBuilding) {
		if(legislativeBuildingList == null) {
			legislativeBuildingList = new ArrayList<>();
		}
		if(legislativeBuildingList.size() == 0) {
			legislativeBuildingList.add(legislativeBuilding);
		} else {
			legislativeBuildingList.set(0, legislativeBuilding);
		}
	}

	@Override
	public List<LegislativeBuilding> getLegislativeBuildingList() {
		return legislativeBuildingList;
	}

	@Override
	public void setLegislativeBuildingList(List<LegislativeBuilding> legislativeBuildingList) {
		this.legislativeBuildingList = legislativeBuildingList;
	}

	@Override
	public boolean hasLegislativeBuilding() {
		return legislativeBuildingList != null && legislativeBuildingList.size() > 0 && legislativeBuildingList.get(0) != null;
	}

	public ITEM_REVIEWED(LendAction lendAction) {
		lendActionList = new ArrayList<LendAction>();
		lendActionList.add(lendAction);
	}

	@Override
	public LendAction getLendAction() {
		if(lendActionList != null && lendActionList.size() > 0) {
			return lendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLendAction(LendAction lendAction) {
		if(lendActionList == null) {
			lendActionList = new ArrayList<>();
		}
		if(lendActionList.size() == 0) {
			lendActionList.add(lendAction);
		} else {
			lendActionList.set(0, lendAction);
		}
	}

	@Override
	public List<LendAction> getLendActionList() {
		return lendActionList;
	}

	@Override
	public void setLendActionList(List<LendAction> lendActionList) {
		this.lendActionList = lendActionList;
	}

	@Override
	public boolean hasLendAction() {
		return lendActionList != null && lendActionList.size() > 0 && lendActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Library library) {
		libraryList = new ArrayList<Library>();
		libraryList.add(library);
	}

	@Override
	public Library getLibrary() {
		if(libraryList != null && libraryList.size() > 0) {
			return libraryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLibrary(Library library) {
		if(libraryList == null) {
			libraryList = new ArrayList<>();
		}
		if(libraryList.size() == 0) {
			libraryList.add(library);
		} else {
			libraryList.set(0, library);
		}
	}

	@Override
	public List<Library> getLibraryList() {
		return libraryList;
	}

	@Override
	public void setLibraryList(List<Library> libraryList) {
		this.libraryList = libraryList;
	}

	@Override
	public boolean hasLibrary() {
		return libraryList != null && libraryList.size() > 0 && libraryList.get(0) != null;
	}

	public ITEM_REVIEWED(LibrarySystem librarySystem) {
		librarySystemList = new ArrayList<LibrarySystem>();
		librarySystemList.add(librarySystem);
	}

	@Override
	public LibrarySystem getLibrarySystem() {
		if(librarySystemList != null && librarySystemList.size() > 0) {
			return librarySystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLibrarySystem(LibrarySystem librarySystem) {
		if(librarySystemList == null) {
			librarySystemList = new ArrayList<>();
		}
		if(librarySystemList.size() == 0) {
			librarySystemList.add(librarySystem);
		} else {
			librarySystemList.set(0, librarySystem);
		}
	}

	@Override
	public List<LibrarySystem> getLibrarySystemList() {
		return librarySystemList;
	}

	@Override
	public void setLibrarySystemList(List<LibrarySystem> librarySystemList) {
		this.librarySystemList = librarySystemList;
	}

	@Override
	public boolean hasLibrarySystem() {
		return librarySystemList != null && librarySystemList.size() > 0 && librarySystemList.get(0) != null;
	}

	public ITEM_REVIEWED(LifestyleModification lifestyleModification) {
		lifestyleModificationList = new ArrayList<LifestyleModification>();
		lifestyleModificationList.add(lifestyleModification);
	}

	@Override
	public LifestyleModification getLifestyleModification() {
		if(lifestyleModificationList != null && lifestyleModificationList.size() > 0) {
			return lifestyleModificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLifestyleModification(LifestyleModification lifestyleModification) {
		if(lifestyleModificationList == null) {
			lifestyleModificationList = new ArrayList<>();
		}
		if(lifestyleModificationList.size() == 0) {
			lifestyleModificationList.add(lifestyleModification);
		} else {
			lifestyleModificationList.set(0, lifestyleModification);
		}
	}

	@Override
	public List<LifestyleModification> getLifestyleModificationList() {
		return lifestyleModificationList;
	}

	@Override
	public void setLifestyleModificationList(List<LifestyleModification> lifestyleModificationList) {
		this.lifestyleModificationList = lifestyleModificationList;
	}

	@Override
	public boolean hasLifestyleModification() {
		return lifestyleModificationList != null && lifestyleModificationList.size() > 0 && lifestyleModificationList.get(0) != null;
	}

	public ITEM_REVIEWED(Ligament ligament) {
		ligamentList = new ArrayList<Ligament>();
		ligamentList.add(ligament);
	}

	@Override
	public Ligament getLigament() {
		if(ligamentList != null && ligamentList.size() > 0) {
			return ligamentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLigament(Ligament ligament) {
		if(ligamentList == null) {
			ligamentList = new ArrayList<>();
		}
		if(ligamentList.size() == 0) {
			ligamentList.add(ligament);
		} else {
			ligamentList.set(0, ligament);
		}
	}

	@Override
	public List<Ligament> getLigamentList() {
		return ligamentList;
	}

	@Override
	public void setLigamentList(List<Ligament> ligamentList) {
		this.ligamentList = ligamentList;
	}

	@Override
	public boolean hasLigament() {
		return ligamentList != null && ligamentList.size() > 0 && ligamentList.get(0) != null;
	}

	public ITEM_REVIEWED(LikeAction likeAction) {
		likeActionList = new ArrayList<LikeAction>();
		likeActionList.add(likeAction);
	}

	@Override
	public LikeAction getLikeAction() {
		if(likeActionList != null && likeActionList.size() > 0) {
			return likeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLikeAction(LikeAction likeAction) {
		if(likeActionList == null) {
			likeActionList = new ArrayList<>();
		}
		if(likeActionList.size() == 0) {
			likeActionList.add(likeAction);
		} else {
			likeActionList.set(0, likeAction);
		}
	}

	@Override
	public List<LikeAction> getLikeActionList() {
		return likeActionList;
	}

	@Override
	public void setLikeActionList(List<LikeAction> likeActionList) {
		this.likeActionList = likeActionList;
	}

	@Override
	public boolean hasLikeAction() {
		return likeActionList != null && likeActionList.size() > 0 && likeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(LinkRole linkRole) {
		linkRoleList = new ArrayList<LinkRole>();
		linkRoleList.add(linkRole);
	}

	@Override
	public LinkRole getLinkRole() {
		if(linkRoleList != null && linkRoleList.size() > 0) {
			return linkRoleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLinkRole(LinkRole linkRole) {
		if(linkRoleList == null) {
			linkRoleList = new ArrayList<>();
		}
		if(linkRoleList.size() == 0) {
			linkRoleList.add(linkRole);
		} else {
			linkRoleList.set(0, linkRole);
		}
	}

	@Override
	public List<LinkRole> getLinkRoleList() {
		return linkRoleList;
	}

	@Override
	public void setLinkRoleList(List<LinkRole> linkRoleList) {
		this.linkRoleList = linkRoleList;
	}

	@Override
	public boolean hasLinkRole() {
		return linkRoleList != null && linkRoleList.size() > 0 && linkRoleList.get(0) != null;
	}

	public ITEM_REVIEWED(LiquorStore liquorStore) {
		liquorStoreList = new ArrayList<LiquorStore>();
		liquorStoreList.add(liquorStore);
	}

	@Override
	public LiquorStore getLiquorStore() {
		if(liquorStoreList != null && liquorStoreList.size() > 0) {
			return liquorStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiquorStore(LiquorStore liquorStore) {
		if(liquorStoreList == null) {
			liquorStoreList = new ArrayList<>();
		}
		if(liquorStoreList.size() == 0) {
			liquorStoreList.add(liquorStore);
		} else {
			liquorStoreList.set(0, liquorStore);
		}
	}

	@Override
	public List<LiquorStore> getLiquorStoreList() {
		return liquorStoreList;
	}

	@Override
	public void setLiquorStoreList(List<LiquorStore> liquorStoreList) {
		this.liquorStoreList = liquorStoreList;
	}

	@Override
	public boolean hasLiquorStore() {
		return liquorStoreList != null && liquorStoreList.size() > 0 && liquorStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(ListItem listItem) {
		listItemList = new ArrayList<ListItem>();
		listItemList.add(listItem);
	}

	@Override
	public ListItem getListItem() {
		if(listItemList != null && listItemList.size() > 0) {
			return listItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setListItem(ListItem listItem) {
		if(listItemList == null) {
			listItemList = new ArrayList<>();
		}
		if(listItemList.size() == 0) {
			listItemList.add(listItem);
		} else {
			listItemList.set(0, listItem);
		}
	}

	@Override
	public List<ListItem> getListItemList() {
		return listItemList;
	}

	@Override
	public void setListItemList(List<ListItem> listItemList) {
		this.listItemList = listItemList;
	}

	@Override
	public boolean hasListItem() {
		return listItemList != null && listItemList.size() > 0 && listItemList.get(0) != null;
	}

	public ITEM_REVIEWED(ListenAction listenAction) {
		listenActionList = new ArrayList<ListenAction>();
		listenActionList.add(listenAction);
	}

	@Override
	public ListenAction getListenAction() {
		if(listenActionList != null && listenActionList.size() > 0) {
			return listenActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setListenAction(ListenAction listenAction) {
		if(listenActionList == null) {
			listenActionList = new ArrayList<>();
		}
		if(listenActionList.size() == 0) {
			listenActionList.add(listenAction);
		} else {
			listenActionList.set(0, listenAction);
		}
	}

	@Override
	public List<ListenAction> getListenActionList() {
		return listenActionList;
	}

	@Override
	public void setListenActionList(List<ListenAction> listenActionList) {
		this.listenActionList = listenActionList;
	}

	@Override
	public boolean hasListenAction() {
		return listenActionList != null && listenActionList.size() > 0 && listenActionList.get(0) != null;
	}

	public ITEM_REVIEWED(LiteraryEvent literaryEvent) {
		literaryEventList = new ArrayList<LiteraryEvent>();
		literaryEventList.add(literaryEvent);
	}

	@Override
	public LiteraryEvent getLiteraryEvent() {
		if(literaryEventList != null && literaryEventList.size() > 0) {
			return literaryEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiteraryEvent(LiteraryEvent literaryEvent) {
		if(literaryEventList == null) {
			literaryEventList = new ArrayList<>();
		}
		if(literaryEventList.size() == 0) {
			literaryEventList.add(literaryEvent);
		} else {
			literaryEventList.set(0, literaryEvent);
		}
	}

	@Override
	public List<LiteraryEvent> getLiteraryEventList() {
		return literaryEventList;
	}

	@Override
	public void setLiteraryEventList(List<LiteraryEvent> literaryEventList) {
		this.literaryEventList = literaryEventList;
	}

	@Override
	public boolean hasLiteraryEvent() {
		return literaryEventList != null && literaryEventList.size() > 0 && literaryEventList.get(0) != null;
	}

	public ITEM_REVIEWED(LiveBlogPosting liveBlogPosting) {
		liveBlogPostingList = new ArrayList<LiveBlogPosting>();
		liveBlogPostingList.add(liveBlogPosting);
	}

	@Override
	public LiveBlogPosting getLiveBlogPosting() {
		if(liveBlogPostingList != null && liveBlogPostingList.size() > 0) {
			return liveBlogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting) {
		if(liveBlogPostingList == null) {
			liveBlogPostingList = new ArrayList<>();
		}
		if(liveBlogPostingList.size() == 0) {
			liveBlogPostingList.add(liveBlogPosting);
		} else {
			liveBlogPostingList.set(0, liveBlogPosting);
		}
	}

	@Override
	public List<LiveBlogPosting> getLiveBlogPostingList() {
		return liveBlogPostingList;
	}

	@Override
	public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList) {
		this.liveBlogPostingList = liveBlogPostingList;
	}

	@Override
	public boolean hasLiveBlogPosting() {
		return liveBlogPostingList != null && liveBlogPostingList.size() > 0 && liveBlogPostingList.get(0) != null;
	}

	public ITEM_REVIEWED(LoanOrCredit loanOrCredit) {
		loanOrCreditList = new ArrayList<LoanOrCredit>();
		loanOrCreditList.add(loanOrCredit);
	}

	@Override
	public LoanOrCredit getLoanOrCredit() {
		if(loanOrCreditList != null && loanOrCreditList.size() > 0) {
			return loanOrCreditList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLoanOrCredit(LoanOrCredit loanOrCredit) {
		if(loanOrCreditList == null) {
			loanOrCreditList = new ArrayList<>();
		}
		if(loanOrCreditList.size() == 0) {
			loanOrCreditList.add(loanOrCredit);
		} else {
			loanOrCreditList.set(0, loanOrCredit);
		}
	}

	@Override
	public List<LoanOrCredit> getLoanOrCreditList() {
		return loanOrCreditList;
	}

	@Override
	public void setLoanOrCreditList(List<LoanOrCredit> loanOrCreditList) {
		this.loanOrCreditList = loanOrCreditList;
	}

	@Override
	public boolean hasLoanOrCredit() {
		return loanOrCreditList != null && loanOrCreditList.size() > 0 && loanOrCreditList.get(0) != null;
	}

	public ITEM_REVIEWED(LocalBusiness localBusiness) {
		localBusinessList = new ArrayList<LocalBusiness>();
		localBusinessList.add(localBusiness);
	}

	@Override
	public LocalBusiness getLocalBusiness() {
		if(localBusinessList != null && localBusinessList.size() > 0) {
			return localBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLocalBusiness(LocalBusiness localBusiness) {
		if(localBusinessList == null) {
			localBusinessList = new ArrayList<>();
		}
		if(localBusinessList.size() == 0) {
			localBusinessList.add(localBusiness);
		} else {
			localBusinessList.set(0, localBusiness);
		}
	}

	@Override
	public List<LocalBusiness> getLocalBusinessList() {
		return localBusinessList;
	}

	@Override
	public void setLocalBusinessList(List<LocalBusiness> localBusinessList) {
		this.localBusinessList = localBusinessList;
	}

	@Override
	public boolean hasLocalBusiness() {
		return localBusinessList != null && localBusinessList.size() > 0 && localBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(LocationFeatureSpecification locationFeatureSpecification) {
		locationFeatureSpecificationList = new ArrayList<LocationFeatureSpecification>();
		locationFeatureSpecificationList.add(locationFeatureSpecification);
	}

	@Override
	public LocationFeatureSpecification getLocationFeatureSpecification() {
		if(locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0) {
			return locationFeatureSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLocationFeatureSpecification(LocationFeatureSpecification locationFeatureSpecification) {
		if(locationFeatureSpecificationList == null) {
			locationFeatureSpecificationList = new ArrayList<>();
		}
		if(locationFeatureSpecificationList.size() == 0) {
			locationFeatureSpecificationList.add(locationFeatureSpecification);
		} else {
			locationFeatureSpecificationList.set(0, locationFeatureSpecification);
		}
	}

	@Override
	public List<LocationFeatureSpecification> getLocationFeatureSpecificationList() {
		return locationFeatureSpecificationList;
	}

	@Override
	public void setLocationFeatureSpecificationList(List<LocationFeatureSpecification> locationFeatureSpecificationList) {
		this.locationFeatureSpecificationList = locationFeatureSpecificationList;
	}

	@Override
	public boolean hasLocationFeatureSpecification() {
		return locationFeatureSpecificationList != null && locationFeatureSpecificationList.size() > 0 && locationFeatureSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(LockerDelivery lockerDelivery) {
		lockerDeliveryList = new ArrayList<LockerDelivery>();
		lockerDeliveryList.add(lockerDelivery);
	}

	@Override
	public LockerDelivery getLockerDelivery() {
		if(lockerDeliveryList != null && lockerDeliveryList.size() > 0) {
			return lockerDeliveryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLockerDelivery(LockerDelivery lockerDelivery) {
		if(lockerDeliveryList == null) {
			lockerDeliveryList = new ArrayList<>();
		}
		if(lockerDeliveryList.size() == 0) {
			lockerDeliveryList.add(lockerDelivery);
		} else {
			lockerDeliveryList.set(0, lockerDelivery);
		}
	}

	@Override
	public List<LockerDelivery> getLockerDeliveryList() {
		return lockerDeliveryList;
	}

	@Override
	public void setLockerDeliveryList(List<LockerDelivery> lockerDeliveryList) {
		this.lockerDeliveryList = lockerDeliveryList;
	}

	@Override
	public boolean hasLockerDelivery() {
		return lockerDeliveryList != null && lockerDeliveryList.size() > 0 && lockerDeliveryList.get(0) != null;
	}

	public ITEM_REVIEWED(Locksmith locksmith) {
		locksmithList = new ArrayList<Locksmith>();
		locksmithList.add(locksmith);
	}

	@Override
	public Locksmith getLocksmith() {
		if(locksmithList != null && locksmithList.size() > 0) {
			return locksmithList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLocksmith(Locksmith locksmith) {
		if(locksmithList == null) {
			locksmithList = new ArrayList<>();
		}
		if(locksmithList.size() == 0) {
			locksmithList.add(locksmith);
		} else {
			locksmithList.set(0, locksmith);
		}
	}

	@Override
	public List<Locksmith> getLocksmithList() {
		return locksmithList;
	}

	@Override
	public void setLocksmithList(List<Locksmith> locksmithList) {
		this.locksmithList = locksmithList;
	}

	@Override
	public boolean hasLocksmith() {
		return locksmithList != null && locksmithList.size() > 0 && locksmithList.get(0) != null;
	}

	public ITEM_REVIEWED(LodgingBusiness lodgingBusiness) {
		lodgingBusinessList = new ArrayList<LodgingBusiness>();
		lodgingBusinessList.add(lodgingBusiness);
	}

	@Override
	public LodgingBusiness getLodgingBusiness() {
		if(lodgingBusinessList != null && lodgingBusinessList.size() > 0) {
			return lodgingBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLodgingBusiness(LodgingBusiness lodgingBusiness) {
		if(lodgingBusinessList == null) {
			lodgingBusinessList = new ArrayList<>();
		}
		if(lodgingBusinessList.size() == 0) {
			lodgingBusinessList.add(lodgingBusiness);
		} else {
			lodgingBusinessList.set(0, lodgingBusiness);
		}
	}

	@Override
	public List<LodgingBusiness> getLodgingBusinessList() {
		return lodgingBusinessList;
	}

	@Override
	public void setLodgingBusinessList(List<LodgingBusiness> lodgingBusinessList) {
		this.lodgingBusinessList = lodgingBusinessList;
	}

	@Override
	public boolean hasLodgingBusiness() {
		return lodgingBusinessList != null && lodgingBusinessList.size() > 0 && lodgingBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(LodgingReservation lodgingReservation) {
		lodgingReservationList = new ArrayList<LodgingReservation>();
		lodgingReservationList.add(lodgingReservation);
	}

	@Override
	public LodgingReservation getLodgingReservation() {
		if(lodgingReservationList != null && lodgingReservationList.size() > 0) {
			return lodgingReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLodgingReservation(LodgingReservation lodgingReservation) {
		if(lodgingReservationList == null) {
			lodgingReservationList = new ArrayList<>();
		}
		if(lodgingReservationList.size() == 0) {
			lodgingReservationList.add(lodgingReservation);
		} else {
			lodgingReservationList.set(0, lodgingReservation);
		}
	}

	@Override
	public List<LodgingReservation> getLodgingReservationList() {
		return lodgingReservationList;
	}

	@Override
	public void setLodgingReservationList(List<LodgingReservation> lodgingReservationList) {
		this.lodgingReservationList = lodgingReservationList;
	}

	@Override
	public boolean hasLodgingReservation() {
		return lodgingReservationList != null && lodgingReservationList.size() > 0 && lodgingReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(LoseAction loseAction) {
		loseActionList = new ArrayList<LoseAction>();
		loseActionList.add(loseAction);
	}

	@Override
	public LoseAction getLoseAction() {
		if(loseActionList != null && loseActionList.size() > 0) {
			return loseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLoseAction(LoseAction loseAction) {
		if(loseActionList == null) {
			loseActionList = new ArrayList<>();
		}
		if(loseActionList.size() == 0) {
			loseActionList.add(loseAction);
		} else {
			loseActionList.set(0, loseAction);
		}
	}

	@Override
	public List<LoseAction> getLoseActionList() {
		return loseActionList;
	}

	@Override
	public void setLoseActionList(List<LoseAction> loseActionList) {
		this.loseActionList = loseActionList;
	}

	@Override
	public boolean hasLoseAction() {
		return loseActionList != null && loseActionList.size() > 0 && loseActionList.get(0) != null;
	}

	public ITEM_REVIEWED(LymphaticVessel lymphaticVessel) {
		lymphaticVesselList = new ArrayList<LymphaticVessel>();
		lymphaticVesselList.add(lymphaticVessel);
	}

	@Override
	public LymphaticVessel getLymphaticVessel() {
		if(lymphaticVesselList != null && lymphaticVesselList.size() > 0) {
			return lymphaticVesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLymphaticVessel(LymphaticVessel lymphaticVessel) {
		if(lymphaticVesselList == null) {
			lymphaticVesselList = new ArrayList<>();
		}
		if(lymphaticVesselList.size() == 0) {
			lymphaticVesselList.add(lymphaticVessel);
		} else {
			lymphaticVesselList.set(0, lymphaticVessel);
		}
	}

	@Override
	public List<LymphaticVessel> getLymphaticVesselList() {
		return lymphaticVesselList;
	}

	@Override
	public void setLymphaticVesselList(List<LymphaticVessel> lymphaticVesselList) {
		this.lymphaticVesselList = lymphaticVesselList;
	}

	@Override
	public boolean hasLymphaticVessel() {
		return lymphaticVesselList != null && lymphaticVesselList.size() > 0 && lymphaticVesselList.get(0) != null;
	}

	public ITEM_REVIEWED(Map map) {
		mapList = new ArrayList<Map>();
		mapList.add(map);
	}

	@Override
	public Map getMap() {
		if(mapList != null && mapList.size() > 0) {
			return mapList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMap(Map map) {
		if(mapList == null) {
			mapList = new ArrayList<>();
		}
		if(mapList.size() == 0) {
			mapList.add(map);
		} else {
			mapList.set(0, map);
		}
	}

	@Override
	public List<Map> getMapList() {
		return mapList;
	}

	@Override
	public void setMapList(List<Map> mapList) {
		this.mapList = mapList;
	}

	@Override
	public boolean hasMap() {
		return mapList != null && mapList.size() > 0 && mapList.get(0) != null;
	}

	public ITEM_REVIEWED(MapCategoryType mapCategoryType) {
		mapCategoryTypeList = new ArrayList<MapCategoryType>();
		mapCategoryTypeList.add(mapCategoryType);
	}

	@Override
	public MapCategoryType getMapCategoryType() {
		if(mapCategoryTypeList != null && mapCategoryTypeList.size() > 0) {
			return mapCategoryTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMapCategoryType(MapCategoryType mapCategoryType) {
		if(mapCategoryTypeList == null) {
			mapCategoryTypeList = new ArrayList<>();
		}
		if(mapCategoryTypeList.size() == 0) {
			mapCategoryTypeList.add(mapCategoryType);
		} else {
			mapCategoryTypeList.set(0, mapCategoryType);
		}
	}

	@Override
	public List<MapCategoryType> getMapCategoryTypeList() {
		return mapCategoryTypeList;
	}

	@Override
	public void setMapCategoryTypeList(List<MapCategoryType> mapCategoryTypeList) {
		this.mapCategoryTypeList = mapCategoryTypeList;
	}

	@Override
	public boolean hasMapCategoryType() {
		return mapCategoryTypeList != null && mapCategoryTypeList.size() > 0 && mapCategoryTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(MarryAction marryAction) {
		marryActionList = new ArrayList<MarryAction>();
		marryActionList.add(marryAction);
	}

	@Override
	public MarryAction getMarryAction() {
		if(marryActionList != null && marryActionList.size() > 0) {
			return marryActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMarryAction(MarryAction marryAction) {
		if(marryActionList == null) {
			marryActionList = new ArrayList<>();
		}
		if(marryActionList.size() == 0) {
			marryActionList.add(marryAction);
		} else {
			marryActionList.set(0, marryAction);
		}
	}

	@Override
	public List<MarryAction> getMarryActionList() {
		return marryActionList;
	}

	@Override
	public void setMarryActionList(List<MarryAction> marryActionList) {
		this.marryActionList = marryActionList;
	}

	@Override
	public boolean hasMarryAction() {
		return marryActionList != null && marryActionList.size() > 0 && marryActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Mass mass) {
		massList = new ArrayList<Mass>();
		massList.add(mass);
	}

	@Override
	public Mass getMass() {
		if(massList != null && massList.size() > 0) {
			return massList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMass(Mass mass) {
		if(massList == null) {
			massList = new ArrayList<>();
		}
		if(massList.size() == 0) {
			massList.add(mass);
		} else {
			massList.set(0, mass);
		}
	}

	@Override
	public List<Mass> getMassList() {
		return massList;
	}

	@Override
	public void setMassList(List<Mass> massList) {
		this.massList = massList;
	}

	@Override
	public boolean hasMass() {
		return massList != null && massList.size() > 0 && massList.get(0) != null;
	}

	public ITEM_REVIEWED(MaximumDoseSchedule maximumDoseSchedule) {
		maximumDoseScheduleList = new ArrayList<MaximumDoseSchedule>();
		maximumDoseScheduleList.add(maximumDoseSchedule);
	}

	@Override
	public MaximumDoseSchedule getMaximumDoseSchedule() {
		if(maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0) {
			return maximumDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMaximumDoseSchedule(MaximumDoseSchedule maximumDoseSchedule) {
		if(maximumDoseScheduleList == null) {
			maximumDoseScheduleList = new ArrayList<>();
		}
		if(maximumDoseScheduleList.size() == 0) {
			maximumDoseScheduleList.add(maximumDoseSchedule);
		} else {
			maximumDoseScheduleList.set(0, maximumDoseSchedule);
		}
	}

	@Override
	public List<MaximumDoseSchedule> getMaximumDoseScheduleList() {
		return maximumDoseScheduleList;
	}

	@Override
	public void setMaximumDoseScheduleList(List<MaximumDoseSchedule> maximumDoseScheduleList) {
		this.maximumDoseScheduleList = maximumDoseScheduleList;
	}

	@Override
	public boolean hasMaximumDoseSchedule() {
		return maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0 && maximumDoseScheduleList.get(0) != null;
	}

	public ITEM_REVIEWED(MediaObject mediaObject) {
		mediaObjectList = new ArrayList<MediaObject>();
		mediaObjectList.add(mediaObject);
	}

	@Override
	public MediaObject getMediaObject() {
		if(mediaObjectList != null && mediaObjectList.size() > 0) {
			return mediaObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMediaObject(MediaObject mediaObject) {
		if(mediaObjectList == null) {
			mediaObjectList = new ArrayList<>();
		}
		if(mediaObjectList.size() == 0) {
			mediaObjectList.add(mediaObject);
		} else {
			mediaObjectList.set(0, mediaObject);
		}
	}

	@Override
	public List<MediaObject> getMediaObjectList() {
		return mediaObjectList;
	}

	@Override
	public void setMediaObjectList(List<MediaObject> mediaObjectList) {
		this.mediaObjectList = mediaObjectList;
	}

	@Override
	public boolean hasMediaObject() {
		return mediaObjectList != null && mediaObjectList.size() > 0 && mediaObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(MediaSubscription mediaSubscription) {
		mediaSubscriptionList = new ArrayList<MediaSubscription>();
		mediaSubscriptionList.add(mediaSubscription);
	}

	@Override
	public MediaSubscription getMediaSubscription() {
		if(mediaSubscriptionList != null && mediaSubscriptionList.size() > 0) {
			return mediaSubscriptionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMediaSubscription(MediaSubscription mediaSubscription) {
		if(mediaSubscriptionList == null) {
			mediaSubscriptionList = new ArrayList<>();
		}
		if(mediaSubscriptionList.size() == 0) {
			mediaSubscriptionList.add(mediaSubscription);
		} else {
			mediaSubscriptionList.set(0, mediaSubscription);
		}
	}

	@Override
	public List<MediaSubscription> getMediaSubscriptionList() {
		return mediaSubscriptionList;
	}

	@Override
	public void setMediaSubscriptionList(List<MediaSubscription> mediaSubscriptionList) {
		this.mediaSubscriptionList = mediaSubscriptionList;
	}

	@Override
	public boolean hasMediaSubscription() {
		return mediaSubscriptionList != null && mediaSubscriptionList.size() > 0 && mediaSubscriptionList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalAudience medicalAudience) {
		medicalAudienceList = new ArrayList<MedicalAudience>();
		medicalAudienceList.add(medicalAudience);
	}

	@Override
	public MedicalAudience getMedicalAudience() {
		if(medicalAudienceList != null && medicalAudienceList.size() > 0) {
			return medicalAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalAudience(MedicalAudience medicalAudience) {
		if(medicalAudienceList == null) {
			medicalAudienceList = new ArrayList<>();
		}
		if(medicalAudienceList.size() == 0) {
			medicalAudienceList.add(medicalAudience);
		} else {
			medicalAudienceList.set(0, medicalAudience);
		}
	}

	@Override
	public List<MedicalAudience> getMedicalAudienceList() {
		return medicalAudienceList;
	}

	@Override
	public void setMedicalAudienceList(List<MedicalAudience> medicalAudienceList) {
		this.medicalAudienceList = medicalAudienceList;
	}

	@Override
	public boolean hasMedicalAudience() {
		return medicalAudienceList != null && medicalAudienceList.size() > 0 && medicalAudienceList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalBusiness medicalBusiness) {
		medicalBusinessList = new ArrayList<MedicalBusiness>();
		medicalBusinessList.add(medicalBusiness);
	}

	@Override
	public MedicalBusiness getMedicalBusiness() {
		if(medicalBusinessList != null && medicalBusinessList.size() > 0) {
			return medicalBusinessList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalBusiness(MedicalBusiness medicalBusiness) {
		if(medicalBusinessList == null) {
			medicalBusinessList = new ArrayList<>();
		}
		if(medicalBusinessList.size() == 0) {
			medicalBusinessList.add(medicalBusiness);
		} else {
			medicalBusinessList.set(0, medicalBusiness);
		}
	}

	@Override
	public List<MedicalBusiness> getMedicalBusinessList() {
		return medicalBusinessList;
	}

	@Override
	public void setMedicalBusinessList(List<MedicalBusiness> medicalBusinessList) {
		this.medicalBusinessList = medicalBusinessList;
	}

	@Override
	public boolean hasMedicalBusiness() {
		return medicalBusinessList != null && medicalBusinessList.size() > 0 && medicalBusinessList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalCause medicalCause) {
		medicalCauseList = new ArrayList<MedicalCause>();
		medicalCauseList.add(medicalCause);
	}

	@Override
	public MedicalCause getMedicalCause() {
		if(medicalCauseList != null && medicalCauseList.size() > 0) {
			return medicalCauseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCause(MedicalCause medicalCause) {
		if(medicalCauseList == null) {
			medicalCauseList = new ArrayList<>();
		}
		if(medicalCauseList.size() == 0) {
			medicalCauseList.add(medicalCause);
		} else {
			medicalCauseList.set(0, medicalCause);
		}
	}

	@Override
	public List<MedicalCause> getMedicalCauseList() {
		return medicalCauseList;
	}

	@Override
	public void setMedicalCauseList(List<MedicalCause> medicalCauseList) {
		this.medicalCauseList = medicalCauseList;
	}

	@Override
	public boolean hasMedicalCause() {
		return medicalCauseList != null && medicalCauseList.size() > 0 && medicalCauseList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalClinic medicalClinic) {
		medicalClinicList = new ArrayList<MedicalClinic>();
		medicalClinicList.add(medicalClinic);
	}

	@Override
	public MedicalClinic getMedicalClinic() {
		if(medicalClinicList != null && medicalClinicList.size() > 0) {
			return medicalClinicList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalClinic(MedicalClinic medicalClinic) {
		if(medicalClinicList == null) {
			medicalClinicList = new ArrayList<>();
		}
		if(medicalClinicList.size() == 0) {
			medicalClinicList.add(medicalClinic);
		} else {
			medicalClinicList.set(0, medicalClinic);
		}
	}

	@Override
	public List<MedicalClinic> getMedicalClinicList() {
		return medicalClinicList;
	}

	@Override
	public void setMedicalClinicList(List<MedicalClinic> medicalClinicList) {
		this.medicalClinicList = medicalClinicList;
	}

	@Override
	public boolean hasMedicalClinic() {
		return medicalClinicList != null && medicalClinicList.size() > 0 && medicalClinicList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalCode medicalCode) {
		medicalCodeList = new ArrayList<MedicalCode>();
		medicalCodeList.add(medicalCode);
	}

	@Override
	public MedicalCode getMedicalCode() {
		if(medicalCodeList != null && medicalCodeList.size() > 0) {
			return medicalCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCode(MedicalCode medicalCode) {
		if(medicalCodeList == null) {
			medicalCodeList = new ArrayList<>();
		}
		if(medicalCodeList.size() == 0) {
			medicalCodeList.add(medicalCode);
		} else {
			medicalCodeList.set(0, medicalCode);
		}
	}

	@Override
	public List<MedicalCode> getMedicalCodeList() {
		return medicalCodeList;
	}

	@Override
	public void setMedicalCodeList(List<MedicalCode> medicalCodeList) {
		this.medicalCodeList = medicalCodeList;
	}

	@Override
	public boolean hasMedicalCode() {
		return medicalCodeList != null && medicalCodeList.size() > 0 && medicalCodeList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalCondition medicalCondition) {
		medicalConditionList = new ArrayList<MedicalCondition>();
		medicalConditionList.add(medicalCondition);
	}

	@Override
	public MedicalCondition getMedicalCondition() {
		if(medicalConditionList != null && medicalConditionList.size() > 0) {
			return medicalConditionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCondition(MedicalCondition medicalCondition) {
		if(medicalConditionList == null) {
			medicalConditionList = new ArrayList<>();
		}
		if(medicalConditionList.size() == 0) {
			medicalConditionList.add(medicalCondition);
		} else {
			medicalConditionList.set(0, medicalCondition);
		}
	}

	@Override
	public List<MedicalCondition> getMedicalConditionList() {
		return medicalConditionList;
	}

	@Override
	public void setMedicalConditionList(List<MedicalCondition> medicalConditionList) {
		this.medicalConditionList = medicalConditionList;
	}

	@Override
	public boolean hasMedicalCondition() {
		return medicalConditionList != null && medicalConditionList.size() > 0 && medicalConditionList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalConditionStage medicalConditionStage) {
		medicalConditionStageList = new ArrayList<MedicalConditionStage>();
		medicalConditionStageList.add(medicalConditionStage);
	}

	@Override
	public MedicalConditionStage getMedicalConditionStage() {
		if(medicalConditionStageList != null && medicalConditionStageList.size() > 0) {
			return medicalConditionStageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalConditionStage(MedicalConditionStage medicalConditionStage) {
		if(medicalConditionStageList == null) {
			medicalConditionStageList = new ArrayList<>();
		}
		if(medicalConditionStageList.size() == 0) {
			medicalConditionStageList.add(medicalConditionStage);
		} else {
			medicalConditionStageList.set(0, medicalConditionStage);
		}
	}

	@Override
	public List<MedicalConditionStage> getMedicalConditionStageList() {
		return medicalConditionStageList;
	}

	@Override
	public void setMedicalConditionStageList(List<MedicalConditionStage> medicalConditionStageList) {
		this.medicalConditionStageList = medicalConditionStageList;
	}

	@Override
	public boolean hasMedicalConditionStage() {
		return medicalConditionStageList != null && medicalConditionStageList.size() > 0 && medicalConditionStageList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalContraindication medicalContraindication) {
		medicalContraindicationList = new ArrayList<MedicalContraindication>();
		medicalContraindicationList.add(medicalContraindication);
	}

	@Override
	public MedicalContraindication getMedicalContraindication() {
		if(medicalContraindicationList != null && medicalContraindicationList.size() > 0) {
			return medicalContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalContraindication(MedicalContraindication medicalContraindication) {
		if(medicalContraindicationList == null) {
			medicalContraindicationList = new ArrayList<>();
		}
		if(medicalContraindicationList.size() == 0) {
			medicalContraindicationList.add(medicalContraindication);
		} else {
			medicalContraindicationList.set(0, medicalContraindication);
		}
	}

	@Override
	public List<MedicalContraindication> getMedicalContraindicationList() {
		return medicalContraindicationList;
	}

	@Override
	public void setMedicalContraindicationList(List<MedicalContraindication> medicalContraindicationList) {
		this.medicalContraindicationList = medicalContraindicationList;
	}

	@Override
	public boolean hasMedicalContraindication() {
		return medicalContraindicationList != null && medicalContraindicationList.size() > 0 && medicalContraindicationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalDevice medicalDevice) {
		medicalDeviceList = new ArrayList<MedicalDevice>();
		medicalDeviceList.add(medicalDevice);
	}

	@Override
	public MedicalDevice getMedicalDevice() {
		if(medicalDeviceList != null && medicalDeviceList.size() > 0) {
			return medicalDeviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevice(MedicalDevice medicalDevice) {
		if(medicalDeviceList == null) {
			medicalDeviceList = new ArrayList<>();
		}
		if(medicalDeviceList.size() == 0) {
			medicalDeviceList.add(medicalDevice);
		} else {
			medicalDeviceList.set(0, medicalDevice);
		}
	}

	@Override
	public List<MedicalDevice> getMedicalDeviceList() {
		return medicalDeviceList;
	}

	@Override
	public void setMedicalDeviceList(List<MedicalDevice> medicalDeviceList) {
		this.medicalDeviceList = medicalDeviceList;
	}

	@Override
	public boolean hasMedicalDevice() {
		return medicalDeviceList != null && medicalDeviceList.size() > 0 && medicalDeviceList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalDevicePurpose medicalDevicePurpose) {
		medicalDevicePurposeList = new ArrayList<MedicalDevicePurpose>();
		medicalDevicePurposeList.add(medicalDevicePurpose);
	}

	@Override
	public MedicalDevicePurpose getMedicalDevicePurpose() {
		if(medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0) {
			return medicalDevicePurposeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose) {
		if(medicalDevicePurposeList == null) {
			medicalDevicePurposeList = new ArrayList<>();
		}
		if(medicalDevicePurposeList.size() == 0) {
			medicalDevicePurposeList.add(medicalDevicePurpose);
		} else {
			medicalDevicePurposeList.set(0, medicalDevicePurpose);
		}
	}

	@Override
	public List<MedicalDevicePurpose> getMedicalDevicePurposeList() {
		return medicalDevicePurposeList;
	}

	@Override
	public void setMedicalDevicePurposeList(List<MedicalDevicePurpose> medicalDevicePurposeList) {
		this.medicalDevicePurposeList = medicalDevicePurposeList;
	}

	@Override
	public boolean hasMedicalDevicePurpose() {
		return medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0 && medicalDevicePurposeList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalEntity medicalEntity) {
		medicalEntityList = new ArrayList<MedicalEntity>();
		medicalEntityList.add(medicalEntity);
	}

	@Override
	public MedicalEntity getMedicalEntity() {
		if(medicalEntityList != null && medicalEntityList.size() > 0) {
			return medicalEntityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEntity(MedicalEntity medicalEntity) {
		if(medicalEntityList == null) {
			medicalEntityList = new ArrayList<>();
		}
		if(medicalEntityList.size() == 0) {
			medicalEntityList.add(medicalEntity);
		} else {
			medicalEntityList.set(0, medicalEntity);
		}
	}

	@Override
	public List<MedicalEntity> getMedicalEntityList() {
		return medicalEntityList;
	}

	@Override
	public void setMedicalEntityList(List<MedicalEntity> medicalEntityList) {
		this.medicalEntityList = medicalEntityList;
	}

	@Override
	public boolean hasMedicalEntity() {
		return medicalEntityList != null && medicalEntityList.size() > 0 && medicalEntityList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalEnumeration medicalEnumeration) {
		medicalEnumerationList = new ArrayList<MedicalEnumeration>();
		medicalEnumerationList.add(medicalEnumeration);
	}

	@Override
	public MedicalEnumeration getMedicalEnumeration() {
		if(medicalEnumerationList != null && medicalEnumerationList.size() > 0) {
			return medicalEnumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEnumeration(MedicalEnumeration medicalEnumeration) {
		if(medicalEnumerationList == null) {
			medicalEnumerationList = new ArrayList<>();
		}
		if(medicalEnumerationList.size() == 0) {
			medicalEnumerationList.add(medicalEnumeration);
		} else {
			medicalEnumerationList.set(0, medicalEnumeration);
		}
	}

	@Override
	public List<MedicalEnumeration> getMedicalEnumerationList() {
		return medicalEnumerationList;
	}

	@Override
	public void setMedicalEnumerationList(List<MedicalEnumeration> medicalEnumerationList) {
		this.medicalEnumerationList = medicalEnumerationList;
	}

	@Override
	public boolean hasMedicalEnumeration() {
		return medicalEnumerationList != null && medicalEnumerationList.size() > 0 && medicalEnumerationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalEvidenceLevel medicalEvidenceLevel) {
		medicalEvidenceLevelList = new ArrayList<MedicalEvidenceLevel>();
		medicalEvidenceLevelList.add(medicalEvidenceLevel);
	}

	@Override
	public MedicalEvidenceLevel getMedicalEvidenceLevel() {
		if(medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0) {
			return medicalEvidenceLevelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEvidenceLevel(MedicalEvidenceLevel medicalEvidenceLevel) {
		if(medicalEvidenceLevelList == null) {
			medicalEvidenceLevelList = new ArrayList<>();
		}
		if(medicalEvidenceLevelList.size() == 0) {
			medicalEvidenceLevelList.add(medicalEvidenceLevel);
		} else {
			medicalEvidenceLevelList.set(0, medicalEvidenceLevel);
		}
	}

	@Override
	public List<MedicalEvidenceLevel> getMedicalEvidenceLevelList() {
		return medicalEvidenceLevelList;
	}

	@Override
	public void setMedicalEvidenceLevelList(List<MedicalEvidenceLevel> medicalEvidenceLevelList) {
		this.medicalEvidenceLevelList = medicalEvidenceLevelList;
	}

	@Override
	public boolean hasMedicalEvidenceLevel() {
		return medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0 && medicalEvidenceLevelList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalGuideline medicalGuideline) {
		medicalGuidelineList = new ArrayList<MedicalGuideline>();
		medicalGuidelineList.add(medicalGuideline);
	}

	@Override
	public MedicalGuideline getMedicalGuideline() {
		if(medicalGuidelineList != null && medicalGuidelineList.size() > 0) {
			return medicalGuidelineList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuideline(MedicalGuideline medicalGuideline) {
		if(medicalGuidelineList == null) {
			medicalGuidelineList = new ArrayList<>();
		}
		if(medicalGuidelineList.size() == 0) {
			medicalGuidelineList.add(medicalGuideline);
		} else {
			medicalGuidelineList.set(0, medicalGuideline);
		}
	}

	@Override
	public List<MedicalGuideline> getMedicalGuidelineList() {
		return medicalGuidelineList;
	}

	@Override
	public void setMedicalGuidelineList(List<MedicalGuideline> medicalGuidelineList) {
		this.medicalGuidelineList = medicalGuidelineList;
	}

	@Override
	public boolean hasMedicalGuideline() {
		return medicalGuidelineList != null && medicalGuidelineList.size() > 0 && medicalGuidelineList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		medicalGuidelineContraindicationList = new ArrayList<MedicalGuidelineContraindication>();
		medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
	}

	@Override
	public MedicalGuidelineContraindication getMedicalGuidelineContraindication() {
		if(medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0) {
			return medicalGuidelineContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineContraindication(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		if(medicalGuidelineContraindicationList == null) {
			medicalGuidelineContraindicationList = new ArrayList<>();
		}
		if(medicalGuidelineContraindicationList.size() == 0) {
			medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
		} else {
			medicalGuidelineContraindicationList.set(0, medicalGuidelineContraindication);
		}
	}

	@Override
	public List<MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList() {
		return medicalGuidelineContraindicationList;
	}

	@Override
	public void setMedicalGuidelineContraindicationList(List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList) {
		this.medicalGuidelineContraindicationList = medicalGuidelineContraindicationList;
	}

	@Override
	public boolean hasMedicalGuidelineContraindication() {
		return medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0 && medicalGuidelineContraindicationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		medicalGuidelineRecommendationList = new ArrayList<MedicalGuidelineRecommendation>();
		medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
	}

	@Override
	public MedicalGuidelineRecommendation getMedicalGuidelineRecommendation() {
		if(medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0) {
			return medicalGuidelineRecommendationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineRecommendation(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		if(medicalGuidelineRecommendationList == null) {
			medicalGuidelineRecommendationList = new ArrayList<>();
		}
		if(medicalGuidelineRecommendationList.size() == 0) {
			medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
		} else {
			medicalGuidelineRecommendationList.set(0, medicalGuidelineRecommendation);
		}
	}

	@Override
	public List<MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList() {
		return medicalGuidelineRecommendationList;
	}

	@Override
	public void setMedicalGuidelineRecommendationList(List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList) {
		this.medicalGuidelineRecommendationList = medicalGuidelineRecommendationList;
	}

	@Override
	public boolean hasMedicalGuidelineRecommendation() {
		return medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0 && medicalGuidelineRecommendationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalImagingTechnique medicalImagingTechnique) {
		medicalImagingTechniqueList = new ArrayList<MedicalImagingTechnique>();
		medicalImagingTechniqueList.add(medicalImagingTechnique);
	}

	@Override
	public MedicalImagingTechnique getMedicalImagingTechnique() {
		if(medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0) {
			return medicalImagingTechniqueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalImagingTechnique(MedicalImagingTechnique medicalImagingTechnique) {
		if(medicalImagingTechniqueList == null) {
			medicalImagingTechniqueList = new ArrayList<>();
		}
		if(medicalImagingTechniqueList.size() == 0) {
			medicalImagingTechniqueList.add(medicalImagingTechnique);
		} else {
			medicalImagingTechniqueList.set(0, medicalImagingTechnique);
		}
	}

	@Override
	public List<MedicalImagingTechnique> getMedicalImagingTechniqueList() {
		return medicalImagingTechniqueList;
	}

	@Override
	public void setMedicalImagingTechniqueList(List<MedicalImagingTechnique> medicalImagingTechniqueList) {
		this.medicalImagingTechniqueList = medicalImagingTechniqueList;
	}

	@Override
	public boolean hasMedicalImagingTechnique() {
		return medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0 && medicalImagingTechniqueList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalIndication medicalIndication) {
		medicalIndicationList = new ArrayList<MedicalIndication>();
		medicalIndicationList.add(medicalIndication);
	}

	@Override
	public MedicalIndication getMedicalIndication() {
		if(medicalIndicationList != null && medicalIndicationList.size() > 0) {
			return medicalIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIndication(MedicalIndication medicalIndication) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(medicalIndication);
		} else {
			medicalIndicationList.set(0, medicalIndication);
		}
	}

	@Override
	public List<MedicalIndication> getMedicalIndicationList() {
		return medicalIndicationList;
	}

	@Override
	public void setMedicalIndicationList(List<MedicalIndication> medicalIndicationList) {
		this.medicalIndicationList = medicalIndicationList;
	}

	@Override
	public boolean hasMedicalIndication() {
		return medicalIndicationList != null && medicalIndicationList.size() > 0 && medicalIndicationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalIntangible medicalIntangible) {
		medicalIntangibleList = new ArrayList<MedicalIntangible>();
		medicalIntangibleList.add(medicalIntangible);
	}

	@Override
	public MedicalIntangible getMedicalIntangible() {
		if(medicalIntangibleList != null && medicalIntangibleList.size() > 0) {
			return medicalIntangibleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIntangible(MedicalIntangible medicalIntangible) {
		if(medicalIntangibleList == null) {
			medicalIntangibleList = new ArrayList<>();
		}
		if(medicalIntangibleList.size() == 0) {
			medicalIntangibleList.add(medicalIntangible);
		} else {
			medicalIntangibleList.set(0, medicalIntangible);
		}
	}

	@Override
	public List<MedicalIntangible> getMedicalIntangibleList() {
		return medicalIntangibleList;
	}

	@Override
	public void setMedicalIntangibleList(List<MedicalIntangible> medicalIntangibleList) {
		this.medicalIntangibleList = medicalIntangibleList;
	}

	@Override
	public boolean hasMedicalIntangible() {
		return medicalIntangibleList != null && medicalIntangibleList.size() > 0 && medicalIntangibleList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalObservationalStudy medicalObservationalStudy) {
		medicalObservationalStudyList = new ArrayList<MedicalObservationalStudy>();
		medicalObservationalStudyList.add(medicalObservationalStudy);
	}

	@Override
	public MedicalObservationalStudy getMedicalObservationalStudy() {
		if(medicalObservationalStudyList != null && medicalObservationalStudyList.size() > 0) {
			return medicalObservationalStudyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalObservationalStudy(MedicalObservationalStudy medicalObservationalStudy) {
		if(medicalObservationalStudyList == null) {
			medicalObservationalStudyList = new ArrayList<>();
		}
		if(medicalObservationalStudyList.size() == 0) {
			medicalObservationalStudyList.add(medicalObservationalStudy);
		} else {
			medicalObservationalStudyList.set(0, medicalObservationalStudy);
		}
	}

	@Override
	public List<MedicalObservationalStudy> getMedicalObservationalStudyList() {
		return medicalObservationalStudyList;
	}

	@Override
	public void setMedicalObservationalStudyList(List<MedicalObservationalStudy> medicalObservationalStudyList) {
		this.medicalObservationalStudyList = medicalObservationalStudyList;
	}

	@Override
	public boolean hasMedicalObservationalStudy() {
		return medicalObservationalStudyList != null && medicalObservationalStudyList.size() > 0 && medicalObservationalStudyList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		medicalObservationalStudyDesignList = new ArrayList<MedicalObservationalStudyDesign>();
		medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
	}

	@Override
	public MedicalObservationalStudyDesign getMedicalObservationalStudyDesign() {
		if(medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0) {
			return medicalObservationalStudyDesignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalObservationalStudyDesign(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		if(medicalObservationalStudyDesignList == null) {
			medicalObservationalStudyDesignList = new ArrayList<>();
		}
		if(medicalObservationalStudyDesignList.size() == 0) {
			medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
		} else {
			medicalObservationalStudyDesignList.set(0, medicalObservationalStudyDesign);
		}
	}

	@Override
	public List<MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList() {
		return medicalObservationalStudyDesignList;
	}

	@Override
	public void setMedicalObservationalStudyDesignList(List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList) {
		this.medicalObservationalStudyDesignList = medicalObservationalStudyDesignList;
	}

	@Override
	public boolean hasMedicalObservationalStudyDesign() {
		return medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0 && medicalObservationalStudyDesignList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalOrganization medicalOrganization) {
		medicalOrganizationList = new ArrayList<MedicalOrganization>();
		medicalOrganizationList.add(medicalOrganization);
	}

	@Override
	public MedicalOrganization getMedicalOrganization() {
		if(medicalOrganizationList != null && medicalOrganizationList.size() > 0) {
			return medicalOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalOrganization(MedicalOrganization medicalOrganization) {
		if(medicalOrganizationList == null) {
			medicalOrganizationList = new ArrayList<>();
		}
		if(medicalOrganizationList.size() == 0) {
			medicalOrganizationList.add(medicalOrganization);
		} else {
			medicalOrganizationList.set(0, medicalOrganization);
		}
	}

	@Override
	public List<MedicalOrganization> getMedicalOrganizationList() {
		return medicalOrganizationList;
	}

	@Override
	public void setMedicalOrganizationList(List<MedicalOrganization> medicalOrganizationList) {
		this.medicalOrganizationList = medicalOrganizationList;
	}

	@Override
	public boolean hasMedicalOrganization() {
		return medicalOrganizationList != null && medicalOrganizationList.size() > 0 && medicalOrganizationList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalProcedure medicalProcedure) {
		medicalProcedureList = new ArrayList<MedicalProcedure>();
		medicalProcedureList.add(medicalProcedure);
	}

	@Override
	public MedicalProcedure getMedicalProcedure() {
		if(medicalProcedureList != null && medicalProcedureList.size() > 0) {
			return medicalProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalProcedure(MedicalProcedure medicalProcedure) {
		if(medicalProcedureList == null) {
			medicalProcedureList = new ArrayList<>();
		}
		if(medicalProcedureList.size() == 0) {
			medicalProcedureList.add(medicalProcedure);
		} else {
			medicalProcedureList.set(0, medicalProcedure);
		}
	}

	@Override
	public List<MedicalProcedure> getMedicalProcedureList() {
		return medicalProcedureList;
	}

	@Override
	public void setMedicalProcedureList(List<MedicalProcedure> medicalProcedureList) {
		this.medicalProcedureList = medicalProcedureList;
	}

	@Override
	public boolean hasMedicalProcedure() {
		return medicalProcedureList != null && medicalProcedureList.size() > 0 && medicalProcedureList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalProcedureType medicalProcedureType) {
		medicalProcedureTypeList = new ArrayList<MedicalProcedureType>();
		medicalProcedureTypeList.add(medicalProcedureType);
	}

	@Override
	public MedicalProcedureType getMedicalProcedureType() {
		if(medicalProcedureTypeList != null && medicalProcedureTypeList.size() > 0) {
			return medicalProcedureTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalProcedureType(MedicalProcedureType medicalProcedureType) {
		if(medicalProcedureTypeList == null) {
			medicalProcedureTypeList = new ArrayList<>();
		}
		if(medicalProcedureTypeList.size() == 0) {
			medicalProcedureTypeList.add(medicalProcedureType);
		} else {
			medicalProcedureTypeList.set(0, medicalProcedureType);
		}
	}

	@Override
	public List<MedicalProcedureType> getMedicalProcedureTypeList() {
		return medicalProcedureTypeList;
	}

	@Override
	public void setMedicalProcedureTypeList(List<MedicalProcedureType> medicalProcedureTypeList) {
		this.medicalProcedureTypeList = medicalProcedureTypeList;
	}

	@Override
	public boolean hasMedicalProcedureType() {
		return medicalProcedureTypeList != null && medicalProcedureTypeList.size() > 0 && medicalProcedureTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalRiskCalculator medicalRiskCalculator) {
		medicalRiskCalculatorList = new ArrayList<MedicalRiskCalculator>();
		medicalRiskCalculatorList.add(medicalRiskCalculator);
	}

	@Override
	public MedicalRiskCalculator getMedicalRiskCalculator() {
		if(medicalRiskCalculatorList != null && medicalRiskCalculatorList.size() > 0) {
			return medicalRiskCalculatorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskCalculator(MedicalRiskCalculator medicalRiskCalculator) {
		if(medicalRiskCalculatorList == null) {
			medicalRiskCalculatorList = new ArrayList<>();
		}
		if(medicalRiskCalculatorList.size() == 0) {
			medicalRiskCalculatorList.add(medicalRiskCalculator);
		} else {
			medicalRiskCalculatorList.set(0, medicalRiskCalculator);
		}
	}

	@Override
	public List<MedicalRiskCalculator> getMedicalRiskCalculatorList() {
		return medicalRiskCalculatorList;
	}

	@Override
	public void setMedicalRiskCalculatorList(List<MedicalRiskCalculator> medicalRiskCalculatorList) {
		this.medicalRiskCalculatorList = medicalRiskCalculatorList;
	}

	@Override
	public boolean hasMedicalRiskCalculator() {
		return medicalRiskCalculatorList != null && medicalRiskCalculatorList.size() > 0 && medicalRiskCalculatorList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalRiskEstimator medicalRiskEstimator) {
		medicalRiskEstimatorList = new ArrayList<MedicalRiskEstimator>();
		medicalRiskEstimatorList.add(medicalRiskEstimator);
	}

	@Override
	public MedicalRiskEstimator getMedicalRiskEstimator() {
		if(medicalRiskEstimatorList != null && medicalRiskEstimatorList.size() > 0) {
			return medicalRiskEstimatorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskEstimator(MedicalRiskEstimator medicalRiskEstimator) {
		if(medicalRiskEstimatorList == null) {
			medicalRiskEstimatorList = new ArrayList<>();
		}
		if(medicalRiskEstimatorList.size() == 0) {
			medicalRiskEstimatorList.add(medicalRiskEstimator);
		} else {
			medicalRiskEstimatorList.set(0, medicalRiskEstimator);
		}
	}

	@Override
	public List<MedicalRiskEstimator> getMedicalRiskEstimatorList() {
		return medicalRiskEstimatorList;
	}

	@Override
	public void setMedicalRiskEstimatorList(List<MedicalRiskEstimator> medicalRiskEstimatorList) {
		this.medicalRiskEstimatorList = medicalRiskEstimatorList;
	}

	@Override
	public boolean hasMedicalRiskEstimator() {
		return medicalRiskEstimatorList != null && medicalRiskEstimatorList.size() > 0 && medicalRiskEstimatorList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalRiskFactor medicalRiskFactor) {
		medicalRiskFactorList = new ArrayList<MedicalRiskFactor>();
		medicalRiskFactorList.add(medicalRiskFactor);
	}

	@Override
	public MedicalRiskFactor getMedicalRiskFactor() {
		if(medicalRiskFactorList != null && medicalRiskFactorList.size() > 0) {
			return medicalRiskFactorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskFactor(MedicalRiskFactor medicalRiskFactor) {
		if(medicalRiskFactorList == null) {
			medicalRiskFactorList = new ArrayList<>();
		}
		if(medicalRiskFactorList.size() == 0) {
			medicalRiskFactorList.add(medicalRiskFactor);
		} else {
			medicalRiskFactorList.set(0, medicalRiskFactor);
		}
	}

	@Override
	public List<MedicalRiskFactor> getMedicalRiskFactorList() {
		return medicalRiskFactorList;
	}

	@Override
	public void setMedicalRiskFactorList(List<MedicalRiskFactor> medicalRiskFactorList) {
		this.medicalRiskFactorList = medicalRiskFactorList;
	}

	@Override
	public boolean hasMedicalRiskFactor() {
		return medicalRiskFactorList != null && medicalRiskFactorList.size() > 0 && medicalRiskFactorList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalRiskScore medicalRiskScore) {
		medicalRiskScoreList = new ArrayList<MedicalRiskScore>();
		medicalRiskScoreList.add(medicalRiskScore);
	}

	@Override
	public MedicalRiskScore getMedicalRiskScore() {
		if(medicalRiskScoreList != null && medicalRiskScoreList.size() > 0) {
			return medicalRiskScoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskScore(MedicalRiskScore medicalRiskScore) {
		if(medicalRiskScoreList == null) {
			medicalRiskScoreList = new ArrayList<>();
		}
		if(medicalRiskScoreList.size() == 0) {
			medicalRiskScoreList.add(medicalRiskScore);
		} else {
			medicalRiskScoreList.set(0, medicalRiskScore);
		}
	}

	@Override
	public List<MedicalRiskScore> getMedicalRiskScoreList() {
		return medicalRiskScoreList;
	}

	@Override
	public void setMedicalRiskScoreList(List<MedicalRiskScore> medicalRiskScoreList) {
		this.medicalRiskScoreList = medicalRiskScoreList;
	}

	@Override
	public boolean hasMedicalRiskScore() {
		return medicalRiskScoreList != null && medicalRiskScoreList.size() > 0 && medicalRiskScoreList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalScholarlyArticle medicalScholarlyArticle) {
		medicalScholarlyArticleList = new ArrayList<MedicalScholarlyArticle>();
		medicalScholarlyArticleList.add(medicalScholarlyArticle);
	}

	@Override
	public MedicalScholarlyArticle getMedicalScholarlyArticle() {
		if(medicalScholarlyArticleList != null && medicalScholarlyArticleList.size() > 0) {
			return medicalScholarlyArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalScholarlyArticle(MedicalScholarlyArticle medicalScholarlyArticle) {
		if(medicalScholarlyArticleList == null) {
			medicalScholarlyArticleList = new ArrayList<>();
		}
		if(medicalScholarlyArticleList.size() == 0) {
			medicalScholarlyArticleList.add(medicalScholarlyArticle);
		} else {
			medicalScholarlyArticleList.set(0, medicalScholarlyArticle);
		}
	}

	@Override
	public List<MedicalScholarlyArticle> getMedicalScholarlyArticleList() {
		return medicalScholarlyArticleList;
	}

	@Override
	public void setMedicalScholarlyArticleList(List<MedicalScholarlyArticle> medicalScholarlyArticleList) {
		this.medicalScholarlyArticleList = medicalScholarlyArticleList;
	}

	@Override
	public boolean hasMedicalScholarlyArticle() {
		return medicalScholarlyArticleList != null && medicalScholarlyArticleList.size() > 0 && medicalScholarlyArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalSign medicalSign) {
		medicalSignList = new ArrayList<MedicalSign>();
		medicalSignList.add(medicalSign);
	}

	@Override
	public MedicalSign getMedicalSign() {
		if(medicalSignList != null && medicalSignList.size() > 0) {
			return medicalSignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSign(MedicalSign medicalSign) {
		if(medicalSignList == null) {
			medicalSignList = new ArrayList<>();
		}
		if(medicalSignList.size() == 0) {
			medicalSignList.add(medicalSign);
		} else {
			medicalSignList.set(0, medicalSign);
		}
	}

	@Override
	public List<MedicalSign> getMedicalSignList() {
		return medicalSignList;
	}

	@Override
	public void setMedicalSignList(List<MedicalSign> medicalSignList) {
		this.medicalSignList = medicalSignList;
	}

	@Override
	public boolean hasMedicalSign() {
		return medicalSignList != null && medicalSignList.size() > 0 && medicalSignList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalSignOrSymptom medicalSignOrSymptom) {
		medicalSignOrSymptomList = new ArrayList<MedicalSignOrSymptom>();
		medicalSignOrSymptomList.add(medicalSignOrSymptom);
	}

	@Override
	public MedicalSignOrSymptom getMedicalSignOrSymptom() {
		if(medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0) {
			return medicalSignOrSymptomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSignOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
		if(medicalSignOrSymptomList == null) {
			medicalSignOrSymptomList = new ArrayList<>();
		}
		if(medicalSignOrSymptomList.size() == 0) {
			medicalSignOrSymptomList.add(medicalSignOrSymptom);
		} else {
			medicalSignOrSymptomList.set(0, medicalSignOrSymptom);
		}
	}

	@Override
	public List<MedicalSignOrSymptom> getMedicalSignOrSymptomList() {
		return medicalSignOrSymptomList;
	}

	@Override
	public void setMedicalSignOrSymptomList(List<MedicalSignOrSymptom> medicalSignOrSymptomList) {
		this.medicalSignOrSymptomList = medicalSignOrSymptomList;
	}

	@Override
	public boolean hasMedicalSignOrSymptom() {
		return medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0 && medicalSignOrSymptomList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalSpecialty medicalSpecialty) {
		medicalSpecialtyList = new ArrayList<MedicalSpecialty>();
		medicalSpecialtyList.add(medicalSpecialty);
	}

	@Override
	public MedicalSpecialty getMedicalSpecialty() {
		if(medicalSpecialtyList != null && medicalSpecialtyList.size() > 0) {
			return medicalSpecialtyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		if(medicalSpecialtyList == null) {
			medicalSpecialtyList = new ArrayList<>();
		}
		if(medicalSpecialtyList.size() == 0) {
			medicalSpecialtyList.add(medicalSpecialty);
		} else {
			medicalSpecialtyList.set(0, medicalSpecialty);
		}
	}

	@Override
	public List<MedicalSpecialty> getMedicalSpecialtyList() {
		return medicalSpecialtyList;
	}

	@Override
	public void setMedicalSpecialtyList(List<MedicalSpecialty> medicalSpecialtyList) {
		this.medicalSpecialtyList = medicalSpecialtyList;
	}

	@Override
	public boolean hasMedicalSpecialty() {
		return medicalSpecialtyList != null && medicalSpecialtyList.size() > 0 && medicalSpecialtyList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalStudy medicalStudy) {
		medicalStudyList = new ArrayList<MedicalStudy>();
		medicalStudyList.add(medicalStudy);
	}

	@Override
	public MedicalStudy getMedicalStudy() {
		if(medicalStudyList != null && medicalStudyList.size() > 0) {
			return medicalStudyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalStudy(MedicalStudy medicalStudy) {
		if(medicalStudyList == null) {
			medicalStudyList = new ArrayList<>();
		}
		if(medicalStudyList.size() == 0) {
			medicalStudyList.add(medicalStudy);
		} else {
			medicalStudyList.set(0, medicalStudy);
		}
	}

	@Override
	public List<MedicalStudy> getMedicalStudyList() {
		return medicalStudyList;
	}

	@Override
	public void setMedicalStudyList(List<MedicalStudy> medicalStudyList) {
		this.medicalStudyList = medicalStudyList;
	}

	@Override
	public boolean hasMedicalStudy() {
		return medicalStudyList != null && medicalStudyList.size() > 0 && medicalStudyList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalStudyStatus medicalStudyStatus) {
		medicalStudyStatusList = new ArrayList<MedicalStudyStatus>();
		medicalStudyStatusList.add(medicalStudyStatus);
	}

	@Override
	public MedicalStudyStatus getMedicalStudyStatus() {
		if(medicalStudyStatusList != null && medicalStudyStatusList.size() > 0) {
			return medicalStudyStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalStudyStatus(MedicalStudyStatus medicalStudyStatus) {
		if(medicalStudyStatusList == null) {
			medicalStudyStatusList = new ArrayList<>();
		}
		if(medicalStudyStatusList.size() == 0) {
			medicalStudyStatusList.add(medicalStudyStatus);
		} else {
			medicalStudyStatusList.set(0, medicalStudyStatus);
		}
	}

	@Override
	public List<MedicalStudyStatus> getMedicalStudyStatusList() {
		return medicalStudyStatusList;
	}

	@Override
	public void setMedicalStudyStatusList(List<MedicalStudyStatus> medicalStudyStatusList) {
		this.medicalStudyStatusList = medicalStudyStatusList;
	}

	@Override
	public boolean hasMedicalStudyStatus() {
		return medicalStudyStatusList != null && medicalStudyStatusList.size() > 0 && medicalStudyStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalSymptom medicalSymptom) {
		medicalSymptomList = new ArrayList<MedicalSymptom>();
		medicalSymptomList.add(medicalSymptom);
	}

	@Override
	public MedicalSymptom getMedicalSymptom() {
		if(medicalSymptomList != null && medicalSymptomList.size() > 0) {
			return medicalSymptomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSymptom(MedicalSymptom medicalSymptom) {
		if(medicalSymptomList == null) {
			medicalSymptomList = new ArrayList<>();
		}
		if(medicalSymptomList.size() == 0) {
			medicalSymptomList.add(medicalSymptom);
		} else {
			medicalSymptomList.set(0, medicalSymptom);
		}
	}

	@Override
	public List<MedicalSymptom> getMedicalSymptomList() {
		return medicalSymptomList;
	}

	@Override
	public void setMedicalSymptomList(List<MedicalSymptom> medicalSymptomList) {
		this.medicalSymptomList = medicalSymptomList;
	}

	@Override
	public boolean hasMedicalSymptom() {
		return medicalSymptomList != null && medicalSymptomList.size() > 0 && medicalSymptomList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalTest medicalTest) {
		medicalTestList = new ArrayList<MedicalTest>();
		medicalTestList.add(medicalTest);
	}

	@Override
	public MedicalTest getMedicalTest() {
		if(medicalTestList != null && medicalTestList.size() > 0) {
			return medicalTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTest(MedicalTest medicalTest) {
		if(medicalTestList == null) {
			medicalTestList = new ArrayList<>();
		}
		if(medicalTestList.size() == 0) {
			medicalTestList.add(medicalTest);
		} else {
			medicalTestList.set(0, medicalTest);
		}
	}

	@Override
	public List<MedicalTest> getMedicalTestList() {
		return medicalTestList;
	}

	@Override
	public void setMedicalTestList(List<MedicalTest> medicalTestList) {
		this.medicalTestList = medicalTestList;
	}

	@Override
	public boolean hasMedicalTest() {
		return medicalTestList != null && medicalTestList.size() > 0 && medicalTestList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalTestPanel medicalTestPanel) {
		medicalTestPanelList = new ArrayList<MedicalTestPanel>();
		medicalTestPanelList.add(medicalTestPanel);
	}

	@Override
	public MedicalTestPanel getMedicalTestPanel() {
		if(medicalTestPanelList != null && medicalTestPanelList.size() > 0) {
			return medicalTestPanelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTestPanel(MedicalTestPanel medicalTestPanel) {
		if(medicalTestPanelList == null) {
			medicalTestPanelList = new ArrayList<>();
		}
		if(medicalTestPanelList.size() == 0) {
			medicalTestPanelList.add(medicalTestPanel);
		} else {
			medicalTestPanelList.set(0, medicalTestPanel);
		}
	}

	@Override
	public List<MedicalTestPanel> getMedicalTestPanelList() {
		return medicalTestPanelList;
	}

	@Override
	public void setMedicalTestPanelList(List<MedicalTestPanel> medicalTestPanelList) {
		this.medicalTestPanelList = medicalTestPanelList;
	}

	@Override
	public boolean hasMedicalTestPanel() {
		return medicalTestPanelList != null && medicalTestPanelList.size() > 0 && medicalTestPanelList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalTherapy medicalTherapy) {
		medicalTherapyList = new ArrayList<MedicalTherapy>();
		medicalTherapyList.add(medicalTherapy);
	}

	@Override
	public MedicalTherapy getMedicalTherapy() {
		if(medicalTherapyList != null && medicalTherapyList.size() > 0) {
			return medicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTherapy(MedicalTherapy medicalTherapy) {
		if(medicalTherapyList == null) {
			medicalTherapyList = new ArrayList<>();
		}
		if(medicalTherapyList.size() == 0) {
			medicalTherapyList.add(medicalTherapy);
		} else {
			medicalTherapyList.set(0, medicalTherapy);
		}
	}

	@Override
	public List<MedicalTherapy> getMedicalTherapyList() {
		return medicalTherapyList;
	}

	@Override
	public void setMedicalTherapyList(List<MedicalTherapy> medicalTherapyList) {
		this.medicalTherapyList = medicalTherapyList;
	}

	@Override
	public boolean hasMedicalTherapy() {
		return medicalTherapyList != null && medicalTherapyList.size() > 0 && medicalTherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalTrial medicalTrial) {
		medicalTrialList = new ArrayList<MedicalTrial>();
		medicalTrialList.add(medicalTrial);
	}

	@Override
	public MedicalTrial getMedicalTrial() {
		if(medicalTrialList != null && medicalTrialList.size() > 0) {
			return medicalTrialList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTrial(MedicalTrial medicalTrial) {
		if(medicalTrialList == null) {
			medicalTrialList = new ArrayList<>();
		}
		if(medicalTrialList.size() == 0) {
			medicalTrialList.add(medicalTrial);
		} else {
			medicalTrialList.set(0, medicalTrial);
		}
	}

	@Override
	public List<MedicalTrial> getMedicalTrialList() {
		return medicalTrialList;
	}

	@Override
	public void setMedicalTrialList(List<MedicalTrial> medicalTrialList) {
		this.medicalTrialList = medicalTrialList;
	}

	@Override
	public boolean hasMedicalTrial() {
		return medicalTrialList != null && medicalTrialList.size() > 0 && medicalTrialList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalTrialDesign medicalTrialDesign) {
		medicalTrialDesignList = new ArrayList<MedicalTrialDesign>();
		medicalTrialDesignList.add(medicalTrialDesign);
	}

	@Override
	public MedicalTrialDesign getMedicalTrialDesign() {
		if(medicalTrialDesignList != null && medicalTrialDesignList.size() > 0) {
			return medicalTrialDesignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTrialDesign(MedicalTrialDesign medicalTrialDesign) {
		if(medicalTrialDesignList == null) {
			medicalTrialDesignList = new ArrayList<>();
		}
		if(medicalTrialDesignList.size() == 0) {
			medicalTrialDesignList.add(medicalTrialDesign);
		} else {
			medicalTrialDesignList.set(0, medicalTrialDesign);
		}
	}

	@Override
	public List<MedicalTrialDesign> getMedicalTrialDesignList() {
		return medicalTrialDesignList;
	}

	@Override
	public void setMedicalTrialDesignList(List<MedicalTrialDesign> medicalTrialDesignList) {
		this.medicalTrialDesignList = medicalTrialDesignList;
	}

	@Override
	public boolean hasMedicalTrialDesign() {
		return medicalTrialDesignList != null && medicalTrialDesignList.size() > 0 && medicalTrialDesignList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicalWebPage medicalWebPage) {
		medicalWebPageList = new ArrayList<MedicalWebPage>();
		medicalWebPageList.add(medicalWebPage);
	}

	@Override
	public MedicalWebPage getMedicalWebPage() {
		if(medicalWebPageList != null && medicalWebPageList.size() > 0) {
			return medicalWebPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalWebPage(MedicalWebPage medicalWebPage) {
		if(medicalWebPageList == null) {
			medicalWebPageList = new ArrayList<>();
		}
		if(medicalWebPageList.size() == 0) {
			medicalWebPageList.add(medicalWebPage);
		} else {
			medicalWebPageList.set(0, medicalWebPage);
		}
	}

	@Override
	public List<MedicalWebPage> getMedicalWebPageList() {
		return medicalWebPageList;
	}

	@Override
	public void setMedicalWebPageList(List<MedicalWebPage> medicalWebPageList) {
		this.medicalWebPageList = medicalWebPageList;
	}

	@Override
	public boolean hasMedicalWebPage() {
		return medicalWebPageList != null && medicalWebPageList.size() > 0 && medicalWebPageList.get(0) != null;
	}

	public ITEM_REVIEWED(MedicineSystem medicineSystem) {
		medicineSystemList = new ArrayList<MedicineSystem>();
		medicineSystemList.add(medicineSystem);
	}

	@Override
	public MedicineSystem getMedicineSystem() {
		if(medicineSystemList != null && medicineSystemList.size() > 0) {
			return medicineSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicineSystem(MedicineSystem medicineSystem) {
		if(medicineSystemList == null) {
			medicineSystemList = new ArrayList<>();
		}
		if(medicineSystemList.size() == 0) {
			medicineSystemList.add(medicineSystem);
		} else {
			medicineSystemList.set(0, medicineSystem);
		}
	}

	@Override
	public List<MedicineSystem> getMedicineSystemList() {
		return medicineSystemList;
	}

	@Override
	public void setMedicineSystemList(List<MedicineSystem> medicineSystemList) {
		this.medicineSystemList = medicineSystemList;
	}

	@Override
	public boolean hasMedicineSystem() {
		return medicineSystemList != null && medicineSystemList.size() > 0 && medicineSystemList.get(0) != null;
	}

	public ITEM_REVIEWED(MeetingRoom meetingRoom) {
		meetingRoomList = new ArrayList<MeetingRoom>();
		meetingRoomList.add(meetingRoom);
	}

	@Override
	public MeetingRoom getMeetingRoom() {
		if(meetingRoomList != null && meetingRoomList.size() > 0) {
			return meetingRoomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMeetingRoom(MeetingRoom meetingRoom) {
		if(meetingRoomList == null) {
			meetingRoomList = new ArrayList<>();
		}
		if(meetingRoomList.size() == 0) {
			meetingRoomList.add(meetingRoom);
		} else {
			meetingRoomList.set(0, meetingRoom);
		}
	}

	@Override
	public List<MeetingRoom> getMeetingRoomList() {
		return meetingRoomList;
	}

	@Override
	public void setMeetingRoomList(List<MeetingRoom> meetingRoomList) {
		this.meetingRoomList = meetingRoomList;
	}

	@Override
	public boolean hasMeetingRoom() {
		return meetingRoomList != null && meetingRoomList.size() > 0 && meetingRoomList.get(0) != null;
	}

	public ITEM_REVIEWED(MensClothingStore mensClothingStore) {
		mensClothingStoreList = new ArrayList<MensClothingStore>();
		mensClothingStoreList.add(mensClothingStore);
	}

	@Override
	public MensClothingStore getMensClothingStore() {
		if(mensClothingStoreList != null && mensClothingStoreList.size() > 0) {
			return mensClothingStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMensClothingStore(MensClothingStore mensClothingStore) {
		if(mensClothingStoreList == null) {
			mensClothingStoreList = new ArrayList<>();
		}
		if(mensClothingStoreList.size() == 0) {
			mensClothingStoreList.add(mensClothingStore);
		} else {
			mensClothingStoreList.set(0, mensClothingStore);
		}
	}

	@Override
	public List<MensClothingStore> getMensClothingStoreList() {
		return mensClothingStoreList;
	}

	@Override
	public void setMensClothingStoreList(List<MensClothingStore> mensClothingStoreList) {
		this.mensClothingStoreList = mensClothingStoreList;
	}

	@Override
	public boolean hasMensClothingStore() {
		return mensClothingStoreList != null && mensClothingStoreList.size() > 0 && mensClothingStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Menu menu) {
		menuList = new ArrayList<Menu>();
		menuList.add(menu);
	}

	@Override
	public Menu getMenu() {
		if(menuList != null && menuList.size() > 0) {
			return menuList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenu(Menu menu) {
		if(menuList == null) {
			menuList = new ArrayList<>();
		}
		if(menuList.size() == 0) {
			menuList.add(menu);
		} else {
			menuList.set(0, menu);
		}
	}

	@Override
	public List<Menu> getMenuList() {
		return menuList;
	}

	@Override
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	@Override
	public boolean hasMenu() {
		return menuList != null && menuList.size() > 0 && menuList.get(0) != null;
	}

	public ITEM_REVIEWED(MenuItem menuItem) {
		menuItemList = new ArrayList<MenuItem>();
		menuItemList.add(menuItem);
	}

	@Override
	public MenuItem getMenuItem() {
		if(menuItemList != null && menuItemList.size() > 0) {
			return menuItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenuItem(MenuItem menuItem) {
		if(menuItemList == null) {
			menuItemList = new ArrayList<>();
		}
		if(menuItemList.size() == 0) {
			menuItemList.add(menuItem);
		} else {
			menuItemList.set(0, menuItem);
		}
	}

	@Override
	public List<MenuItem> getMenuItemList() {
		return menuItemList;
	}

	@Override
	public void setMenuItemList(List<MenuItem> menuItemList) {
		this.menuItemList = menuItemList;
	}

	@Override
	public boolean hasMenuItem() {
		return menuItemList != null && menuItemList.size() > 0 && menuItemList.get(0) != null;
	}

	public ITEM_REVIEWED(MenuSection menuSection) {
		menuSectionList = new ArrayList<MenuSection>();
		menuSectionList.add(menuSection);
	}

	@Override
	public MenuSection getMenuSection() {
		if(menuSectionList != null && menuSectionList.size() > 0) {
			return menuSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMenuSection(MenuSection menuSection) {
		if(menuSectionList == null) {
			menuSectionList = new ArrayList<>();
		}
		if(menuSectionList.size() == 0) {
			menuSectionList.add(menuSection);
		} else {
			menuSectionList.set(0, menuSection);
		}
	}

	@Override
	public List<MenuSection> getMenuSectionList() {
		return menuSectionList;
	}

	@Override
	public void setMenuSectionList(List<MenuSection> menuSectionList) {
		this.menuSectionList = menuSectionList;
	}

	@Override
	public boolean hasMenuSection() {
		return menuSectionList != null && menuSectionList.size() > 0 && menuSectionList.get(0) != null;
	}

	public ITEM_REVIEWED(Message message) {
		messageList = new ArrayList<Message>();
		messageList.add(message);
	}

	@Override
	public Message getMessage() {
		if(messageList != null && messageList.size() > 0) {
			return messageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMessage(Message message) {
		if(messageList == null) {
			messageList = new ArrayList<>();
		}
		if(messageList.size() == 0) {
			messageList.add(message);
		} else {
			messageList.set(0, message);
		}
	}

	@Override
	public List<Message> getMessageList() {
		return messageList;
	}

	@Override
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	@Override
	public boolean hasMessage() {
		return messageList != null && messageList.size() > 0 && messageList.get(0) != null;
	}

	public ITEM_REVIEWED(MiddleSchool middleSchool) {
		middleSchoolList = new ArrayList<MiddleSchool>();
		middleSchoolList.add(middleSchool);
	}

	@Override
	public MiddleSchool getMiddleSchool() {
		if(middleSchoolList != null && middleSchoolList.size() > 0) {
			return middleSchoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMiddleSchool(MiddleSchool middleSchool) {
		if(middleSchoolList == null) {
			middleSchoolList = new ArrayList<>();
		}
		if(middleSchoolList.size() == 0) {
			middleSchoolList.add(middleSchool);
		} else {
			middleSchoolList.set(0, middleSchool);
		}
	}

	@Override
	public List<MiddleSchool> getMiddleSchoolList() {
		return middleSchoolList;
	}

	@Override
	public void setMiddleSchoolList(List<MiddleSchool> middleSchoolList) {
		this.middleSchoolList = middleSchoolList;
	}

	@Override
	public boolean hasMiddleSchool() {
		return middleSchoolList != null && middleSchoolList.size() > 0 && middleSchoolList.get(0) != null;
	}

	public ITEM_REVIEWED(Midwifery midwifery) {
		midwiferyList = new ArrayList<Midwifery>();
		midwiferyList.add(midwifery);
	}

	@Override
	public Midwifery getMidwifery() {
		if(midwiferyList != null && midwiferyList.size() > 0) {
			return midwiferyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMidwifery(Midwifery midwifery) {
		if(midwiferyList == null) {
			midwiferyList = new ArrayList<>();
		}
		if(midwiferyList.size() == 0) {
			midwiferyList.add(midwifery);
		} else {
			midwiferyList.set(0, midwifery);
		}
	}

	@Override
	public List<Midwifery> getMidwiferyList() {
		return midwiferyList;
	}

	@Override
	public void setMidwiferyList(List<Midwifery> midwiferyList) {
		this.midwiferyList = midwiferyList;
	}

	@Override
	public boolean hasMidwifery() {
		return midwiferyList != null && midwiferyList.size() > 0 && midwiferyList.get(0) != null;
	}

	public ITEM_REVIEWED(MobileApplication mobileApplication) {
		mobileApplicationList = new ArrayList<MobileApplication>();
		mobileApplicationList.add(mobileApplication);
	}

	@Override
	public MobileApplication getMobileApplication() {
		if(mobileApplicationList != null && mobileApplicationList.size() > 0) {
			return mobileApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMobileApplication(MobileApplication mobileApplication) {
		if(mobileApplicationList == null) {
			mobileApplicationList = new ArrayList<>();
		}
		if(mobileApplicationList.size() == 0) {
			mobileApplicationList.add(mobileApplication);
		} else {
			mobileApplicationList.set(0, mobileApplication);
		}
	}

	@Override
	public List<MobileApplication> getMobileApplicationList() {
		return mobileApplicationList;
	}

	@Override
	public void setMobileApplicationList(List<MobileApplication> mobileApplicationList) {
		this.mobileApplicationList = mobileApplicationList;
	}

	@Override
	public boolean hasMobileApplication() {
		return mobileApplicationList != null && mobileApplicationList.size() > 0 && mobileApplicationList.get(0) != null;
	}

	public ITEM_REVIEWED(MobilePhoneStore mobilePhoneStore) {
		mobilePhoneStoreList = new ArrayList<MobilePhoneStore>();
		mobilePhoneStoreList.add(mobilePhoneStore);
	}

	@Override
	public MobilePhoneStore getMobilePhoneStore() {
		if(mobilePhoneStoreList != null && mobilePhoneStoreList.size() > 0) {
			return mobilePhoneStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMobilePhoneStore(MobilePhoneStore mobilePhoneStore) {
		if(mobilePhoneStoreList == null) {
			mobilePhoneStoreList = new ArrayList<>();
		}
		if(mobilePhoneStoreList.size() == 0) {
			mobilePhoneStoreList.add(mobilePhoneStore);
		} else {
			mobilePhoneStoreList.set(0, mobilePhoneStore);
		}
	}

	@Override
	public List<MobilePhoneStore> getMobilePhoneStoreList() {
		return mobilePhoneStoreList;
	}

	@Override
	public void setMobilePhoneStoreList(List<MobilePhoneStore> mobilePhoneStoreList) {
		this.mobilePhoneStoreList = mobilePhoneStoreList;
	}

	@Override
	public boolean hasMobilePhoneStore() {
		return mobilePhoneStoreList != null && mobilePhoneStoreList.size() > 0 && mobilePhoneStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(MonetaryAmount monetaryAmount) {
		monetaryAmountList = new ArrayList<MonetaryAmount>();
		monetaryAmountList.add(monetaryAmount);
	}

	@Override
	public MonetaryAmount getMonetaryAmount() {
		if(monetaryAmountList != null && monetaryAmountList.size() > 0) {
			return monetaryAmountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMonetaryAmount(MonetaryAmount monetaryAmount) {
		if(monetaryAmountList == null) {
			monetaryAmountList = new ArrayList<>();
		}
		if(monetaryAmountList.size() == 0) {
			monetaryAmountList.add(monetaryAmount);
		} else {
			monetaryAmountList.set(0, monetaryAmount);
		}
	}

	@Override
	public List<MonetaryAmount> getMonetaryAmountList() {
		return monetaryAmountList;
	}

	@Override
	public void setMonetaryAmountList(List<MonetaryAmount> monetaryAmountList) {
		this.monetaryAmountList = monetaryAmountList;
	}

	@Override
	public boolean hasMonetaryAmount() {
		return monetaryAmountList != null && monetaryAmountList.size() > 0 && monetaryAmountList.get(0) != null;
	}

	public ITEM_REVIEWED(MonetaryAmountDistribution monetaryAmountDistribution) {
		monetaryAmountDistributionList = new ArrayList<MonetaryAmountDistribution>();
		monetaryAmountDistributionList.add(monetaryAmountDistribution);
	}

	@Override
	public MonetaryAmountDistribution getMonetaryAmountDistribution() {
		if(monetaryAmountDistributionList != null && monetaryAmountDistributionList.size() > 0) {
			return monetaryAmountDistributionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMonetaryAmountDistribution(MonetaryAmountDistribution monetaryAmountDistribution) {
		if(monetaryAmountDistributionList == null) {
			monetaryAmountDistributionList = new ArrayList<>();
		}
		if(monetaryAmountDistributionList.size() == 0) {
			monetaryAmountDistributionList.add(monetaryAmountDistribution);
		} else {
			monetaryAmountDistributionList.set(0, monetaryAmountDistribution);
		}
	}

	@Override
	public List<MonetaryAmountDistribution> getMonetaryAmountDistributionList() {
		return monetaryAmountDistributionList;
	}

	@Override
	public void setMonetaryAmountDistributionList(List<MonetaryAmountDistribution> monetaryAmountDistributionList) {
		this.monetaryAmountDistributionList = monetaryAmountDistributionList;
	}

	@Override
	public boolean hasMonetaryAmountDistribution() {
		return monetaryAmountDistributionList != null && monetaryAmountDistributionList.size() > 0 && monetaryAmountDistributionList.get(0) != null;
	}

	public ITEM_REVIEWED(MoneyTransfer moneyTransfer) {
		moneyTransferList = new ArrayList<MoneyTransfer>();
		moneyTransferList.add(moneyTransfer);
	}

	@Override
	public MoneyTransfer getMoneyTransfer() {
		if(moneyTransferList != null && moneyTransferList.size() > 0) {
			return moneyTransferList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMoneyTransfer(MoneyTransfer moneyTransfer) {
		if(moneyTransferList == null) {
			moneyTransferList = new ArrayList<>();
		}
		if(moneyTransferList.size() == 0) {
			moneyTransferList.add(moneyTransfer);
		} else {
			moneyTransferList.set(0, moneyTransfer);
		}
	}

	@Override
	public List<MoneyTransfer> getMoneyTransferList() {
		return moneyTransferList;
	}

	@Override
	public void setMoneyTransferList(List<MoneyTransfer> moneyTransferList) {
		this.moneyTransferList = moneyTransferList;
	}

	@Override
	public boolean hasMoneyTransfer() {
		return moneyTransferList != null && moneyTransferList.size() > 0 && moneyTransferList.get(0) != null;
	}

	public ITEM_REVIEWED(MortgageLoan mortgageLoan) {
		mortgageLoanList = new ArrayList<MortgageLoan>();
		mortgageLoanList.add(mortgageLoan);
	}

	@Override
	public MortgageLoan getMortgageLoan() {
		if(mortgageLoanList != null && mortgageLoanList.size() > 0) {
			return mortgageLoanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMortgageLoan(MortgageLoan mortgageLoan) {
		if(mortgageLoanList == null) {
			mortgageLoanList = new ArrayList<>();
		}
		if(mortgageLoanList.size() == 0) {
			mortgageLoanList.add(mortgageLoan);
		} else {
			mortgageLoanList.set(0, mortgageLoan);
		}
	}

	@Override
	public List<MortgageLoan> getMortgageLoanList() {
		return mortgageLoanList;
	}

	@Override
	public void setMortgageLoanList(List<MortgageLoan> mortgageLoanList) {
		this.mortgageLoanList = mortgageLoanList;
	}

	@Override
	public boolean hasMortgageLoan() {
		return mortgageLoanList != null && mortgageLoanList.size() > 0 && mortgageLoanList.get(0) != null;
	}

	public ITEM_REVIEWED(Mosque mosque) {
		mosqueList = new ArrayList<Mosque>();
		mosqueList.add(mosque);
	}

	@Override
	public Mosque getMosque() {
		if(mosqueList != null && mosqueList.size() > 0) {
			return mosqueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMosque(Mosque mosque) {
		if(mosqueList == null) {
			mosqueList = new ArrayList<>();
		}
		if(mosqueList.size() == 0) {
			mosqueList.add(mosque);
		} else {
			mosqueList.set(0, mosque);
		}
	}

	@Override
	public List<Mosque> getMosqueList() {
		return mosqueList;
	}

	@Override
	public void setMosqueList(List<Mosque> mosqueList) {
		this.mosqueList = mosqueList;
	}

	@Override
	public boolean hasMosque() {
		return mosqueList != null && mosqueList.size() > 0 && mosqueList.get(0) != null;
	}

	public ITEM_REVIEWED(Motel motel) {
		motelList = new ArrayList<Motel>();
		motelList.add(motel);
	}

	@Override
	public Motel getMotel() {
		if(motelList != null && motelList.size() > 0) {
			return motelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotel(Motel motel) {
		if(motelList == null) {
			motelList = new ArrayList<>();
		}
		if(motelList.size() == 0) {
			motelList.add(motel);
		} else {
			motelList.set(0, motel);
		}
	}

	@Override
	public List<Motel> getMotelList() {
		return motelList;
	}

	@Override
	public void setMotelList(List<Motel> motelList) {
		this.motelList = motelList;
	}

	@Override
	public boolean hasMotel() {
		return motelList != null && motelList.size() > 0 && motelList.get(0) != null;
	}

	public ITEM_REVIEWED(Motorcycle motorcycle) {
		motorcycleList = new ArrayList<Motorcycle>();
		motorcycleList.add(motorcycle);
	}

	@Override
	public Motorcycle getMotorcycle() {
		if(motorcycleList != null && motorcycleList.size() > 0) {
			return motorcycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorcycle(Motorcycle motorcycle) {
		if(motorcycleList == null) {
			motorcycleList = new ArrayList<>();
		}
		if(motorcycleList.size() == 0) {
			motorcycleList.add(motorcycle);
		} else {
			motorcycleList.set(0, motorcycle);
		}
	}

	@Override
	public List<Motorcycle> getMotorcycleList() {
		return motorcycleList;
	}

	@Override
	public void setMotorcycleList(List<Motorcycle> motorcycleList) {
		this.motorcycleList = motorcycleList;
	}

	@Override
	public boolean hasMotorcycle() {
		return motorcycleList != null && motorcycleList.size() > 0 && motorcycleList.get(0) != null;
	}

	public ITEM_REVIEWED(MotorcycleDealer motorcycleDealer) {
		motorcycleDealerList = new ArrayList<MotorcycleDealer>();
		motorcycleDealerList.add(motorcycleDealer);
	}

	@Override
	public MotorcycleDealer getMotorcycleDealer() {
		if(motorcycleDealerList != null && motorcycleDealerList.size() > 0) {
			return motorcycleDealerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorcycleDealer(MotorcycleDealer motorcycleDealer) {
		if(motorcycleDealerList == null) {
			motorcycleDealerList = new ArrayList<>();
		}
		if(motorcycleDealerList.size() == 0) {
			motorcycleDealerList.add(motorcycleDealer);
		} else {
			motorcycleDealerList.set(0, motorcycleDealer);
		}
	}

	@Override
	public List<MotorcycleDealer> getMotorcycleDealerList() {
		return motorcycleDealerList;
	}

	@Override
	public void setMotorcycleDealerList(List<MotorcycleDealer> motorcycleDealerList) {
		this.motorcycleDealerList = motorcycleDealerList;
	}

	@Override
	public boolean hasMotorcycleDealer() {
		return motorcycleDealerList != null && motorcycleDealerList.size() > 0 && motorcycleDealerList.get(0) != null;
	}

	public ITEM_REVIEWED(MotorcycleRepair motorcycleRepair) {
		motorcycleRepairList = new ArrayList<MotorcycleRepair>();
		motorcycleRepairList.add(motorcycleRepair);
	}

	@Override
	public MotorcycleRepair getMotorcycleRepair() {
		if(motorcycleRepairList != null && motorcycleRepairList.size() > 0) {
			return motorcycleRepairList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorcycleRepair(MotorcycleRepair motorcycleRepair) {
		if(motorcycleRepairList == null) {
			motorcycleRepairList = new ArrayList<>();
		}
		if(motorcycleRepairList.size() == 0) {
			motorcycleRepairList.add(motorcycleRepair);
		} else {
			motorcycleRepairList.set(0, motorcycleRepair);
		}
	}

	@Override
	public List<MotorcycleRepair> getMotorcycleRepairList() {
		return motorcycleRepairList;
	}

	@Override
	public void setMotorcycleRepairList(List<MotorcycleRepair> motorcycleRepairList) {
		this.motorcycleRepairList = motorcycleRepairList;
	}

	@Override
	public boolean hasMotorcycleRepair() {
		return motorcycleRepairList != null && motorcycleRepairList.size() > 0 && motorcycleRepairList.get(0) != null;
	}

	public ITEM_REVIEWED(MotorizedBicycle motorizedBicycle) {
		motorizedBicycleList = new ArrayList<MotorizedBicycle>();
		motorizedBicycleList.add(motorizedBicycle);
	}

	@Override
	public MotorizedBicycle getMotorizedBicycle() {
		if(motorizedBicycleList != null && motorizedBicycleList.size() > 0) {
			return motorizedBicycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorizedBicycle(MotorizedBicycle motorizedBicycle) {
		if(motorizedBicycleList == null) {
			motorizedBicycleList = new ArrayList<>();
		}
		if(motorizedBicycleList.size() == 0) {
			motorizedBicycleList.add(motorizedBicycle);
		} else {
			motorizedBicycleList.set(0, motorizedBicycle);
		}
	}

	@Override
	public List<MotorizedBicycle> getMotorizedBicycleList() {
		return motorizedBicycleList;
	}

	@Override
	public void setMotorizedBicycleList(List<MotorizedBicycle> motorizedBicycleList) {
		this.motorizedBicycleList = motorizedBicycleList;
	}

	@Override
	public boolean hasMotorizedBicycle() {
		return motorizedBicycleList != null && motorizedBicycleList.size() > 0 && motorizedBicycleList.get(0) != null;
	}

	public ITEM_REVIEWED(Mountain mountain) {
		mountainList = new ArrayList<Mountain>();
		mountainList.add(mountain);
	}

	@Override
	public Mountain getMountain() {
		if(mountainList != null && mountainList.size() > 0) {
			return mountainList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMountain(Mountain mountain) {
		if(mountainList == null) {
			mountainList = new ArrayList<>();
		}
		if(mountainList.size() == 0) {
			mountainList.add(mountain);
		} else {
			mountainList.set(0, mountain);
		}
	}

	@Override
	public List<Mountain> getMountainList() {
		return mountainList;
	}

	@Override
	public void setMountainList(List<Mountain> mountainList) {
		this.mountainList = mountainList;
	}

	@Override
	public boolean hasMountain() {
		return mountainList != null && mountainList.size() > 0 && mountainList.get(0) != null;
	}

	public ITEM_REVIEWED(MoveAction moveAction) {
		moveActionList = new ArrayList<MoveAction>();
		moveActionList.add(moveAction);
	}

	@Override
	public MoveAction getMoveAction() {
		if(moveActionList != null && moveActionList.size() > 0) {
			return moveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMoveAction(MoveAction moveAction) {
		if(moveActionList == null) {
			moveActionList = new ArrayList<>();
		}
		if(moveActionList.size() == 0) {
			moveActionList.add(moveAction);
		} else {
			moveActionList.set(0, moveAction);
		}
	}

	@Override
	public List<MoveAction> getMoveActionList() {
		return moveActionList;
	}

	@Override
	public void setMoveActionList(List<MoveAction> moveActionList) {
		this.moveActionList = moveActionList;
	}

	@Override
	public boolean hasMoveAction() {
		return moveActionList != null && moveActionList.size() > 0 && moveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Movie movie) {
		movieList = new ArrayList<Movie>();
		movieList.add(movie);
	}

	@Override
	public Movie getMovie() {
		if(movieList != null && movieList.size() > 0) {
			return movieList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovie(Movie movie) {
		if(movieList == null) {
			movieList = new ArrayList<>();
		}
		if(movieList.size() == 0) {
			movieList.add(movie);
		} else {
			movieList.set(0, movie);
		}
	}

	@Override
	public List<Movie> getMovieList() {
		return movieList;
	}

	@Override
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public boolean hasMovie() {
		return movieList != null && movieList.size() > 0 && movieList.get(0) != null;
	}

	public ITEM_REVIEWED(MovieClip movieClip) {
		movieClipList = new ArrayList<MovieClip>();
		movieClipList.add(movieClip);
	}

	@Override
	public MovieClip getMovieClip() {
		if(movieClipList != null && movieClipList.size() > 0) {
			return movieClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieClip(MovieClip movieClip) {
		if(movieClipList == null) {
			movieClipList = new ArrayList<>();
		}
		if(movieClipList.size() == 0) {
			movieClipList.add(movieClip);
		} else {
			movieClipList.set(0, movieClip);
		}
	}

	@Override
	public List<MovieClip> getMovieClipList() {
		return movieClipList;
	}

	@Override
	public void setMovieClipList(List<MovieClip> movieClipList) {
		this.movieClipList = movieClipList;
	}

	@Override
	public boolean hasMovieClip() {
		return movieClipList != null && movieClipList.size() > 0 && movieClipList.get(0) != null;
	}

	public ITEM_REVIEWED(MovieRentalStore movieRentalStore) {
		movieRentalStoreList = new ArrayList<MovieRentalStore>();
		movieRentalStoreList.add(movieRentalStore);
	}

	@Override
	public MovieRentalStore getMovieRentalStore() {
		if(movieRentalStoreList != null && movieRentalStoreList.size() > 0) {
			return movieRentalStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieRentalStore(MovieRentalStore movieRentalStore) {
		if(movieRentalStoreList == null) {
			movieRentalStoreList = new ArrayList<>();
		}
		if(movieRentalStoreList.size() == 0) {
			movieRentalStoreList.add(movieRentalStore);
		} else {
			movieRentalStoreList.set(0, movieRentalStore);
		}
	}

	@Override
	public List<MovieRentalStore> getMovieRentalStoreList() {
		return movieRentalStoreList;
	}

	@Override
	public void setMovieRentalStoreList(List<MovieRentalStore> movieRentalStoreList) {
		this.movieRentalStoreList = movieRentalStoreList;
	}

	@Override
	public boolean hasMovieRentalStore() {
		return movieRentalStoreList != null && movieRentalStoreList.size() > 0 && movieRentalStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(MovieSeries movieSeries) {
		movieSeriesList = new ArrayList<MovieSeries>();
		movieSeriesList.add(movieSeries);
	}

	@Override
	public MovieSeries getMovieSeries() {
		if(movieSeriesList != null && movieSeriesList.size() > 0) {
			return movieSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieSeries(MovieSeries movieSeries) {
		if(movieSeriesList == null) {
			movieSeriesList = new ArrayList<>();
		}
		if(movieSeriesList.size() == 0) {
			movieSeriesList.add(movieSeries);
		} else {
			movieSeriesList.set(0, movieSeries);
		}
	}

	@Override
	public List<MovieSeries> getMovieSeriesList() {
		return movieSeriesList;
	}

	@Override
	public void setMovieSeriesList(List<MovieSeries> movieSeriesList) {
		this.movieSeriesList = movieSeriesList;
	}

	@Override
	public boolean hasMovieSeries() {
		return movieSeriesList != null && movieSeriesList.size() > 0 && movieSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(MovieTheater movieTheater) {
		movieTheaterList = new ArrayList<MovieTheater>();
		movieTheaterList.add(movieTheater);
	}

	@Override
	public MovieTheater getMovieTheater() {
		if(movieTheaterList != null && movieTheaterList.size() > 0) {
			return movieTheaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieTheater(MovieTheater movieTheater) {
		if(movieTheaterList == null) {
			movieTheaterList = new ArrayList<>();
		}
		if(movieTheaterList.size() == 0) {
			movieTheaterList.add(movieTheater);
		} else {
			movieTheaterList.set(0, movieTheater);
		}
	}

	@Override
	public List<MovieTheater> getMovieTheaterList() {
		return movieTheaterList;
	}

	@Override
	public void setMovieTheaterList(List<MovieTheater> movieTheaterList) {
		this.movieTheaterList = movieTheaterList;
	}

	@Override
	public boolean hasMovieTheater() {
		return movieTheaterList != null && movieTheaterList.size() > 0 && movieTheaterList.get(0) != null;
	}

	public ITEM_REVIEWED(MovingCompany movingCompany) {
		movingCompanyList = new ArrayList<MovingCompany>();
		movingCompanyList.add(movingCompany);
	}

	@Override
	public MovingCompany getMovingCompany() {
		if(movingCompanyList != null && movingCompanyList.size() > 0) {
			return movingCompanyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovingCompany(MovingCompany movingCompany) {
		if(movingCompanyList == null) {
			movingCompanyList = new ArrayList<>();
		}
		if(movingCompanyList.size() == 0) {
			movingCompanyList.add(movingCompany);
		} else {
			movingCompanyList.set(0, movingCompany);
		}
	}

	@Override
	public List<MovingCompany> getMovingCompanyList() {
		return movingCompanyList;
	}

	@Override
	public void setMovingCompanyList(List<MovingCompany> movingCompanyList) {
		this.movingCompanyList = movingCompanyList;
	}

	@Override
	public boolean hasMovingCompany() {
		return movingCompanyList != null && movingCompanyList.size() > 0 && movingCompanyList.get(0) != null;
	}

	public ITEM_REVIEWED(Muscle muscle) {
		muscleList = new ArrayList<Muscle>();
		muscleList.add(muscle);
	}

	@Override
	public Muscle getMuscle() {
		if(muscleList != null && muscleList.size() > 0) {
			return muscleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMuscle(Muscle muscle) {
		if(muscleList == null) {
			muscleList = new ArrayList<>();
		}
		if(muscleList.size() == 0) {
			muscleList.add(muscle);
		} else {
			muscleList.set(0, muscle);
		}
	}

	@Override
	public List<Muscle> getMuscleList() {
		return muscleList;
	}

	@Override
	public void setMuscleList(List<Muscle> muscleList) {
		this.muscleList = muscleList;
	}

	@Override
	public boolean hasMuscle() {
		return muscleList != null && muscleList.size() > 0 && muscleList.get(0) != null;
	}

	public ITEM_REVIEWED(Museum museum) {
		museumList = new ArrayList<Museum>();
		museumList.add(museum);
	}

	@Override
	public Museum getMuseum() {
		if(museumList != null && museumList.size() > 0) {
			return museumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMuseum(Museum museum) {
		if(museumList == null) {
			museumList = new ArrayList<>();
		}
		if(museumList.size() == 0) {
			museumList.add(museum);
		} else {
			museumList.set(0, museum);
		}
	}

	@Override
	public List<Museum> getMuseumList() {
		return museumList;
	}

	@Override
	public void setMuseumList(List<Museum> museumList) {
		this.museumList = museumList;
	}

	@Override
	public boolean hasMuseum() {
		return museumList != null && museumList.size() > 0 && museumList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicAlbum musicAlbum) {
		musicAlbumList = new ArrayList<MusicAlbum>();
		musicAlbumList.add(musicAlbum);
	}

	@Override
	public MusicAlbum getMusicAlbum() {
		if(musicAlbumList != null && musicAlbumList.size() > 0) {
			return musicAlbumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbum(MusicAlbum musicAlbum) {
		if(musicAlbumList == null) {
			musicAlbumList = new ArrayList<>();
		}
		if(musicAlbumList.size() == 0) {
			musicAlbumList.add(musicAlbum);
		} else {
			musicAlbumList.set(0, musicAlbum);
		}
	}

	@Override
	public List<MusicAlbum> getMusicAlbumList() {
		return musicAlbumList;
	}

	@Override
	public void setMusicAlbumList(List<MusicAlbum> musicAlbumList) {
		this.musicAlbumList = musicAlbumList;
	}

	@Override
	public boolean hasMusicAlbum() {
		return musicAlbumList != null && musicAlbumList.size() > 0 && musicAlbumList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicAlbumProductionType musicAlbumProductionType) {
		musicAlbumProductionTypeList = new ArrayList<MusicAlbumProductionType>();
		musicAlbumProductionTypeList.add(musicAlbumProductionType);
	}

	@Override
	public MusicAlbumProductionType getMusicAlbumProductionType() {
		if(musicAlbumProductionTypeList != null && musicAlbumProductionTypeList.size() > 0) {
			return musicAlbumProductionTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbumProductionType(MusicAlbumProductionType musicAlbumProductionType) {
		if(musicAlbumProductionTypeList == null) {
			musicAlbumProductionTypeList = new ArrayList<>();
		}
		if(musicAlbumProductionTypeList.size() == 0) {
			musicAlbumProductionTypeList.add(musicAlbumProductionType);
		} else {
			musicAlbumProductionTypeList.set(0, musicAlbumProductionType);
		}
	}

	@Override
	public List<MusicAlbumProductionType> getMusicAlbumProductionTypeList() {
		return musicAlbumProductionTypeList;
	}

	@Override
	public void setMusicAlbumProductionTypeList(List<MusicAlbumProductionType> musicAlbumProductionTypeList) {
		this.musicAlbumProductionTypeList = musicAlbumProductionTypeList;
	}

	@Override
	public boolean hasMusicAlbumProductionType() {
		return musicAlbumProductionTypeList != null && musicAlbumProductionTypeList.size() > 0 && musicAlbumProductionTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicAlbumReleaseType musicAlbumReleaseType) {
		musicAlbumReleaseTypeList = new ArrayList<MusicAlbumReleaseType>();
		musicAlbumReleaseTypeList.add(musicAlbumReleaseType);
	}

	@Override
	public MusicAlbumReleaseType getMusicAlbumReleaseType() {
		if(musicAlbumReleaseTypeList != null && musicAlbumReleaseTypeList.size() > 0) {
			return musicAlbumReleaseTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbumReleaseType(MusicAlbumReleaseType musicAlbumReleaseType) {
		if(musicAlbumReleaseTypeList == null) {
			musicAlbumReleaseTypeList = new ArrayList<>();
		}
		if(musicAlbumReleaseTypeList.size() == 0) {
			musicAlbumReleaseTypeList.add(musicAlbumReleaseType);
		} else {
			musicAlbumReleaseTypeList.set(0, musicAlbumReleaseType);
		}
	}

	@Override
	public List<MusicAlbumReleaseType> getMusicAlbumReleaseTypeList() {
		return musicAlbumReleaseTypeList;
	}

	@Override
	public void setMusicAlbumReleaseTypeList(List<MusicAlbumReleaseType> musicAlbumReleaseTypeList) {
		this.musicAlbumReleaseTypeList = musicAlbumReleaseTypeList;
	}

	@Override
	public boolean hasMusicAlbumReleaseType() {
		return musicAlbumReleaseTypeList != null && musicAlbumReleaseTypeList.size() > 0 && musicAlbumReleaseTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicComposition musicComposition) {
		musicCompositionList = new ArrayList<MusicComposition>();
		musicCompositionList.add(musicComposition);
	}

	@Override
	public MusicComposition getMusicComposition() {
		if(musicCompositionList != null && musicCompositionList.size() > 0) {
			return musicCompositionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicComposition(MusicComposition musicComposition) {
		if(musicCompositionList == null) {
			musicCompositionList = new ArrayList<>();
		}
		if(musicCompositionList.size() == 0) {
			musicCompositionList.add(musicComposition);
		} else {
			musicCompositionList.set(0, musicComposition);
		}
	}

	@Override
	public List<MusicComposition> getMusicCompositionList() {
		return musicCompositionList;
	}

	@Override
	public void setMusicCompositionList(List<MusicComposition> musicCompositionList) {
		this.musicCompositionList = musicCompositionList;
	}

	@Override
	public boolean hasMusicComposition() {
		return musicCompositionList != null && musicCompositionList.size() > 0 && musicCompositionList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicEvent musicEvent) {
		musicEventList = new ArrayList<MusicEvent>();
		musicEventList.add(musicEvent);
	}

	@Override
	public MusicEvent getMusicEvent() {
		if(musicEventList != null && musicEventList.size() > 0) {
			return musicEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicEvent(MusicEvent musicEvent) {
		if(musicEventList == null) {
			musicEventList = new ArrayList<>();
		}
		if(musicEventList.size() == 0) {
			musicEventList.add(musicEvent);
		} else {
			musicEventList.set(0, musicEvent);
		}
	}

	@Override
	public List<MusicEvent> getMusicEventList() {
		return musicEventList;
	}

	@Override
	public void setMusicEventList(List<MusicEvent> musicEventList) {
		this.musicEventList = musicEventList;
	}

	@Override
	public boolean hasMusicEvent() {
		return musicEventList != null && musicEventList.size() > 0 && musicEventList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicGroup musicGroup) {
		musicGroupList = new ArrayList<MusicGroup>();
		musicGroupList.add(musicGroup);
	}

	@Override
	public MusicGroup getMusicGroup() {
		if(musicGroupList != null && musicGroupList.size() > 0) {
			return musicGroupList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicGroup(MusicGroup musicGroup) {
		if(musicGroupList == null) {
			musicGroupList = new ArrayList<>();
		}
		if(musicGroupList.size() == 0) {
			musicGroupList.add(musicGroup);
		} else {
			musicGroupList.set(0, musicGroup);
		}
	}

	@Override
	public List<MusicGroup> getMusicGroupList() {
		return musicGroupList;
	}

	@Override
	public void setMusicGroupList(List<MusicGroup> musicGroupList) {
		this.musicGroupList = musicGroupList;
	}

	@Override
	public boolean hasMusicGroup() {
		return musicGroupList != null && musicGroupList.size() > 0 && musicGroupList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicPlaylist musicPlaylist) {
		musicPlaylistList = new ArrayList<MusicPlaylist>();
		musicPlaylistList.add(musicPlaylist);
	}

	@Override
	public MusicPlaylist getMusicPlaylist() {
		if(musicPlaylistList != null && musicPlaylistList.size() > 0) {
			return musicPlaylistList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicPlaylist(MusicPlaylist musicPlaylist) {
		if(musicPlaylistList == null) {
			musicPlaylistList = new ArrayList<>();
		}
		if(musicPlaylistList.size() == 0) {
			musicPlaylistList.add(musicPlaylist);
		} else {
			musicPlaylistList.set(0, musicPlaylist);
		}
	}

	@Override
	public List<MusicPlaylist> getMusicPlaylistList() {
		return musicPlaylistList;
	}

	@Override
	public void setMusicPlaylistList(List<MusicPlaylist> musicPlaylistList) {
		this.musicPlaylistList = musicPlaylistList;
	}

	@Override
	public boolean hasMusicPlaylist() {
		return musicPlaylistList != null && musicPlaylistList.size() > 0 && musicPlaylistList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicRecording musicRecording) {
		musicRecordingList = new ArrayList<MusicRecording>();
		musicRecordingList.add(musicRecording);
	}

	@Override
	public MusicRecording getMusicRecording() {
		if(musicRecordingList != null && musicRecordingList.size() > 0) {
			return musicRecordingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRecording(MusicRecording musicRecording) {
		if(musicRecordingList == null) {
			musicRecordingList = new ArrayList<>();
		}
		if(musicRecordingList.size() == 0) {
			musicRecordingList.add(musicRecording);
		} else {
			musicRecordingList.set(0, musicRecording);
		}
	}

	@Override
	public List<MusicRecording> getMusicRecordingList() {
		return musicRecordingList;
	}

	@Override
	public void setMusicRecordingList(List<MusicRecording> musicRecordingList) {
		this.musicRecordingList = musicRecordingList;
	}

	@Override
	public boolean hasMusicRecording() {
		return musicRecordingList != null && musicRecordingList.size() > 0 && musicRecordingList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicRelease musicRelease) {
		musicReleaseList = new ArrayList<MusicRelease>();
		musicReleaseList.add(musicRelease);
	}

	@Override
	public MusicRelease getMusicRelease() {
		if(musicReleaseList != null && musicReleaseList.size() > 0) {
			return musicReleaseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRelease(MusicRelease musicRelease) {
		if(musicReleaseList == null) {
			musicReleaseList = new ArrayList<>();
		}
		if(musicReleaseList.size() == 0) {
			musicReleaseList.add(musicRelease);
		} else {
			musicReleaseList.set(0, musicRelease);
		}
	}

	@Override
	public List<MusicRelease> getMusicReleaseList() {
		return musicReleaseList;
	}

	@Override
	public void setMusicReleaseList(List<MusicRelease> musicReleaseList) {
		this.musicReleaseList = musicReleaseList;
	}

	@Override
	public boolean hasMusicRelease() {
		return musicReleaseList != null && musicReleaseList.size() > 0 && musicReleaseList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicReleaseFormatType musicReleaseFormatType) {
		musicReleaseFormatTypeList = new ArrayList<MusicReleaseFormatType>();
		musicReleaseFormatTypeList.add(musicReleaseFormatType);
	}

	@Override
	public MusicReleaseFormatType getMusicReleaseFormatType() {
		if(musicReleaseFormatTypeList != null && musicReleaseFormatTypeList.size() > 0) {
			return musicReleaseFormatTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicReleaseFormatType(MusicReleaseFormatType musicReleaseFormatType) {
		if(musicReleaseFormatTypeList == null) {
			musicReleaseFormatTypeList = new ArrayList<>();
		}
		if(musicReleaseFormatTypeList.size() == 0) {
			musicReleaseFormatTypeList.add(musicReleaseFormatType);
		} else {
			musicReleaseFormatTypeList.set(0, musicReleaseFormatType);
		}
	}

	@Override
	public List<MusicReleaseFormatType> getMusicReleaseFormatTypeList() {
		return musicReleaseFormatTypeList;
	}

	@Override
	public void setMusicReleaseFormatTypeList(List<MusicReleaseFormatType> musicReleaseFormatTypeList) {
		this.musicReleaseFormatTypeList = musicReleaseFormatTypeList;
	}

	@Override
	public boolean hasMusicReleaseFormatType() {
		return musicReleaseFormatTypeList != null && musicReleaseFormatTypeList.size() > 0 && musicReleaseFormatTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicStore musicStore) {
		musicStoreList = new ArrayList<MusicStore>();
		musicStoreList.add(musicStore);
	}

	@Override
	public MusicStore getMusicStore() {
		if(musicStoreList != null && musicStoreList.size() > 0) {
			return musicStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicStore(MusicStore musicStore) {
		if(musicStoreList == null) {
			musicStoreList = new ArrayList<>();
		}
		if(musicStoreList.size() == 0) {
			musicStoreList.add(musicStore);
		} else {
			musicStoreList.set(0, musicStore);
		}
	}

	@Override
	public List<MusicStore> getMusicStoreList() {
		return musicStoreList;
	}

	@Override
	public void setMusicStoreList(List<MusicStore> musicStoreList) {
		this.musicStoreList = musicStoreList;
	}

	@Override
	public boolean hasMusicStore() {
		return musicStoreList != null && musicStoreList.size() > 0 && musicStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicVenue musicVenue) {
		musicVenueList = new ArrayList<MusicVenue>();
		musicVenueList.add(musicVenue);
	}

	@Override
	public MusicVenue getMusicVenue() {
		if(musicVenueList != null && musicVenueList.size() > 0) {
			return musicVenueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicVenue(MusicVenue musicVenue) {
		if(musicVenueList == null) {
			musicVenueList = new ArrayList<>();
		}
		if(musicVenueList.size() == 0) {
			musicVenueList.add(musicVenue);
		} else {
			musicVenueList.set(0, musicVenue);
		}
	}

	@Override
	public List<MusicVenue> getMusicVenueList() {
		return musicVenueList;
	}

	@Override
	public void setMusicVenueList(List<MusicVenue> musicVenueList) {
		this.musicVenueList = musicVenueList;
	}

	@Override
	public boolean hasMusicVenue() {
		return musicVenueList != null && musicVenueList.size() > 0 && musicVenueList.get(0) != null;
	}

	public ITEM_REVIEWED(MusicVideoObject musicVideoObject) {
		musicVideoObjectList = new ArrayList<MusicVideoObject>();
		musicVideoObjectList.add(musicVideoObject);
	}

	@Override
	public MusicVideoObject getMusicVideoObject() {
		if(musicVideoObjectList != null && musicVideoObjectList.size() > 0) {
			return musicVideoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicVideoObject(MusicVideoObject musicVideoObject) {
		if(musicVideoObjectList == null) {
			musicVideoObjectList = new ArrayList<>();
		}
		if(musicVideoObjectList.size() == 0) {
			musicVideoObjectList.add(musicVideoObject);
		} else {
			musicVideoObjectList.set(0, musicVideoObject);
		}
	}

	@Override
	public List<MusicVideoObject> getMusicVideoObjectList() {
		return musicVideoObjectList;
	}

	@Override
	public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList) {
		this.musicVideoObjectList = musicVideoObjectList;
	}

	@Override
	public boolean hasMusicVideoObject() {
		return musicVideoObjectList != null && musicVideoObjectList.size() > 0 && musicVideoObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(NGO ngo) {
		ngoList = new ArrayList<NGO>();
		ngoList.add(ngo);
	}

	@Override
	public NGO getNGO() {
		if(ngoList != null && ngoList.size() > 0) {
			return ngoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNGO(NGO ngo) {
		if(ngoList == null) {
			ngoList = new ArrayList<>();
		}
		if(ngoList.size() == 0) {
			ngoList.add(ngo);
		} else {
			ngoList.set(0, ngo);
		}
	}

	@Override
	public List<NGO> getNGOList() {
		return ngoList;
	}

	@Override
	public void setNGOList(List<NGO> ngoList) {
		this.ngoList = ngoList;
	}

	@Override
	public boolean hasNGO() {
		return ngoList != null && ngoList.size() > 0 && ngoList.get(0) != null;
	}

	public ITEM_REVIEWED(NailSalon nailSalon) {
		nailSalonList = new ArrayList<NailSalon>();
		nailSalonList.add(nailSalon);
	}

	@Override
	public NailSalon getNailSalon() {
		if(nailSalonList != null && nailSalonList.size() > 0) {
			return nailSalonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNailSalon(NailSalon nailSalon) {
		if(nailSalonList == null) {
			nailSalonList = new ArrayList<>();
		}
		if(nailSalonList.size() == 0) {
			nailSalonList.add(nailSalon);
		} else {
			nailSalonList.set(0, nailSalon);
		}
	}

	@Override
	public List<NailSalon> getNailSalonList() {
		return nailSalonList;
	}

	@Override
	public void setNailSalonList(List<NailSalon> nailSalonList) {
		this.nailSalonList = nailSalonList;
	}

	@Override
	public boolean hasNailSalon() {
		return nailSalonList != null && nailSalonList.size() > 0 && nailSalonList.get(0) != null;
	}

	public ITEM_REVIEWED(Nerve nerve) {
		nerveList = new ArrayList<Nerve>();
		nerveList.add(nerve);
	}

	@Override
	public Nerve getNerve() {
		if(nerveList != null && nerveList.size() > 0) {
			return nerveList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNerve(Nerve nerve) {
		if(nerveList == null) {
			nerveList = new ArrayList<>();
		}
		if(nerveList.size() == 0) {
			nerveList.add(nerve);
		} else {
			nerveList.set(0, nerve);
		}
	}

	@Override
	public List<Nerve> getNerveList() {
		return nerveList;
	}

	@Override
	public void setNerveList(List<Nerve> nerveList) {
		this.nerveList = nerveList;
	}

	@Override
	public boolean hasNerve() {
		return nerveList != null && nerveList.size() > 0 && nerveList.get(0) != null;
	}

	public ITEM_REVIEWED(NewsArticle newsArticle) {
		newsArticleList = new ArrayList<NewsArticle>();
		newsArticleList.add(newsArticle);
	}

	@Override
	public NewsArticle getNewsArticle() {
		if(newsArticleList != null && newsArticleList.size() > 0) {
			return newsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewsArticle(NewsArticle newsArticle) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(newsArticle);
		} else {
			newsArticleList.set(0, newsArticle);
		}
	}

	@Override
	public List<NewsArticle> getNewsArticleList() {
		return newsArticleList;
	}

	@Override
	public void setNewsArticleList(List<NewsArticle> newsArticleList) {
		this.newsArticleList = newsArticleList;
	}

	@Override
	public boolean hasNewsArticle() {
		return newsArticleList != null && newsArticleList.size() > 0 && newsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(NewsMediaOrganization newsMediaOrganization) {
		newsMediaOrganizationList = new ArrayList<NewsMediaOrganization>();
		newsMediaOrganizationList.add(newsMediaOrganization);
	}

	@Override
	public NewsMediaOrganization getNewsMediaOrganization() {
		if(newsMediaOrganizationList != null && newsMediaOrganizationList.size() > 0) {
			return newsMediaOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewsMediaOrganization(NewsMediaOrganization newsMediaOrganization) {
		if(newsMediaOrganizationList == null) {
			newsMediaOrganizationList = new ArrayList<>();
		}
		if(newsMediaOrganizationList.size() == 0) {
			newsMediaOrganizationList.add(newsMediaOrganization);
		} else {
			newsMediaOrganizationList.set(0, newsMediaOrganization);
		}
	}

	@Override
	public List<NewsMediaOrganization> getNewsMediaOrganizationList() {
		return newsMediaOrganizationList;
	}

	@Override
	public void setNewsMediaOrganizationList(List<NewsMediaOrganization> newsMediaOrganizationList) {
		this.newsMediaOrganizationList = newsMediaOrganizationList;
	}

	@Override
	public boolean hasNewsMediaOrganization() {
		return newsMediaOrganizationList != null && newsMediaOrganizationList.size() > 0 && newsMediaOrganizationList.get(0) != null;
	}

	public ITEM_REVIEWED(Newspaper newspaper) {
		newspaperList = new ArrayList<Newspaper>();
		newspaperList.add(newspaper);
	}

	@Override
	public Newspaper getNewspaper() {
		if(newspaperList != null && newspaperList.size() > 0) {
			return newspaperList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewspaper(Newspaper newspaper) {
		if(newspaperList == null) {
			newspaperList = new ArrayList<>();
		}
		if(newspaperList.size() == 0) {
			newspaperList.add(newspaper);
		} else {
			newspaperList.set(0, newspaper);
		}
	}

	@Override
	public List<Newspaper> getNewspaperList() {
		return newspaperList;
	}

	@Override
	public void setNewspaperList(List<Newspaper> newspaperList) {
		this.newspaperList = newspaperList;
	}

	@Override
	public boolean hasNewspaper() {
		return newspaperList != null && newspaperList.size() > 0 && newspaperList.get(0) != null;
	}

	public ITEM_REVIEWED(NightClub nightClub) {
		nightClubList = new ArrayList<NightClub>();
		nightClubList.add(nightClub);
	}

	@Override
	public NightClub getNightClub() {
		if(nightClubList != null && nightClubList.size() > 0) {
			return nightClubList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNightClub(NightClub nightClub) {
		if(nightClubList == null) {
			nightClubList = new ArrayList<>();
		}
		if(nightClubList.size() == 0) {
			nightClubList.add(nightClub);
		} else {
			nightClubList.set(0, nightClub);
		}
	}

	@Override
	public List<NightClub> getNightClubList() {
		return nightClubList;
	}

	@Override
	public void setNightClubList(List<NightClub> nightClubList) {
		this.nightClubList = nightClubList;
	}

	@Override
	public boolean hasNightClub() {
		return nightClubList != null && nightClubList.size() > 0 && nightClubList.get(0) != null;
	}

	public ITEM_REVIEWED(Notary notary) {
		notaryList = new ArrayList<Notary>();
		notaryList.add(notary);
	}

	@Override
	public Notary getNotary() {
		if(notaryList != null && notaryList.size() > 0) {
			return notaryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNotary(Notary notary) {
		if(notaryList == null) {
			notaryList = new ArrayList<>();
		}
		if(notaryList.size() == 0) {
			notaryList.add(notary);
		} else {
			notaryList.set(0, notary);
		}
	}

	@Override
	public List<Notary> getNotaryList() {
		return notaryList;
	}

	@Override
	public void setNotaryList(List<Notary> notaryList) {
		this.notaryList = notaryList;
	}

	@Override
	public boolean hasNotary() {
		return notaryList != null && notaryList.size() > 0 && notaryList.get(0) != null;
	}

	public ITEM_REVIEWED(NoteDigitalDocument noteDigitalDocument) {
		noteDigitalDocumentList = new ArrayList<NoteDigitalDocument>();
		noteDigitalDocumentList.add(noteDigitalDocument);
	}

	@Override
	public NoteDigitalDocument getNoteDigitalDocument() {
		if(noteDigitalDocumentList != null && noteDigitalDocumentList.size() > 0) {
			return noteDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNoteDigitalDocument(NoteDigitalDocument noteDigitalDocument) {
		if(noteDigitalDocumentList == null) {
			noteDigitalDocumentList = new ArrayList<>();
		}
		if(noteDigitalDocumentList.size() == 0) {
			noteDigitalDocumentList.add(noteDigitalDocument);
		} else {
			noteDigitalDocumentList.set(0, noteDigitalDocument);
		}
	}

	@Override
	public List<NoteDigitalDocument> getNoteDigitalDocumentList() {
		return noteDigitalDocumentList;
	}

	@Override
	public void setNoteDigitalDocumentList(List<NoteDigitalDocument> noteDigitalDocumentList) {
		this.noteDigitalDocumentList = noteDigitalDocumentList;
	}

	@Override
	public boolean hasNoteDigitalDocument() {
		return noteDigitalDocumentList != null && noteDigitalDocumentList.size() > 0 && noteDigitalDocumentList.get(0) != null;
	}

	public ITEM_REVIEWED(Nursing nursing) {
		nursingList = new ArrayList<Nursing>();
		nursingList.add(nursing);
	}

	@Override
	public Nursing getNursing() {
		if(nursingList != null && nursingList.size() > 0) {
			return nursingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNursing(Nursing nursing) {
		if(nursingList == null) {
			nursingList = new ArrayList<>();
		}
		if(nursingList.size() == 0) {
			nursingList.add(nursing);
		} else {
			nursingList.set(0, nursing);
		}
	}

	@Override
	public List<Nursing> getNursingList() {
		return nursingList;
	}

	@Override
	public void setNursingList(List<Nursing> nursingList) {
		this.nursingList = nursingList;
	}

	@Override
	public boolean hasNursing() {
		return nursingList != null && nursingList.size() > 0 && nursingList.get(0) != null;
	}

	public ITEM_REVIEWED(NutritionInformation nutritionInformation) {
		nutritionInformationList = new ArrayList<NutritionInformation>();
		nutritionInformationList.add(nutritionInformation);
	}

	@Override
	public NutritionInformation getNutritionInformation() {
		if(nutritionInformationList != null && nutritionInformationList.size() > 0) {
			return nutritionInformationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNutritionInformation(NutritionInformation nutritionInformation) {
		if(nutritionInformationList == null) {
			nutritionInformationList = new ArrayList<>();
		}
		if(nutritionInformationList.size() == 0) {
			nutritionInformationList.add(nutritionInformation);
		} else {
			nutritionInformationList.set(0, nutritionInformation);
		}
	}

	@Override
	public List<NutritionInformation> getNutritionInformationList() {
		return nutritionInformationList;
	}

	@Override
	public void setNutritionInformationList(List<NutritionInformation> nutritionInformationList) {
		this.nutritionInformationList = nutritionInformationList;
	}

	@Override
	public boolean hasNutritionInformation() {
		return nutritionInformationList != null && nutritionInformationList.size() > 0 && nutritionInformationList.get(0) != null;
	}

	public ITEM_REVIEWED(Obstetric obstetric) {
		obstetricList = new ArrayList<Obstetric>();
		obstetricList.add(obstetric);
	}

	@Override
	public Obstetric getObstetric() {
		if(obstetricList != null && obstetricList.size() > 0) {
			return obstetricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setObstetric(Obstetric obstetric) {
		if(obstetricList == null) {
			obstetricList = new ArrayList<>();
		}
		if(obstetricList.size() == 0) {
			obstetricList.add(obstetric);
		} else {
			obstetricList.set(0, obstetric);
		}
	}

	@Override
	public List<Obstetric> getObstetricList() {
		return obstetricList;
	}

	@Override
	public void setObstetricList(List<Obstetric> obstetricList) {
		this.obstetricList = obstetricList;
	}

	@Override
	public boolean hasObstetric() {
		return obstetricList != null && obstetricList.size() > 0 && obstetricList.get(0) != null;
	}

	public ITEM_REVIEWED(Occupation occupation) {
		occupationList = new ArrayList<Occupation>();
		occupationList.add(occupation);
	}

	@Override
	public Occupation getOccupation() {
		if(occupationList != null && occupationList.size() > 0) {
			return occupationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOccupation(Occupation occupation) {
		if(occupationList == null) {
			occupationList = new ArrayList<>();
		}
		if(occupationList.size() == 0) {
			occupationList.add(occupation);
		} else {
			occupationList.set(0, occupation);
		}
	}

	@Override
	public List<Occupation> getOccupationList() {
		return occupationList;
	}

	@Override
	public void setOccupationList(List<Occupation> occupationList) {
		this.occupationList = occupationList;
	}

	@Override
	public boolean hasOccupation() {
		return occupationList != null && occupationList.size() > 0 && occupationList.get(0) != null;
	}

	public ITEM_REVIEWED(OccupationalTherapy occupationalTherapy) {
		occupationalTherapyList = new ArrayList<OccupationalTherapy>();
		occupationalTherapyList.add(occupationalTherapy);
	}

	@Override
	public OccupationalTherapy getOccupationalTherapy() {
		if(occupationalTherapyList != null && occupationalTherapyList.size() > 0) {
			return occupationalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOccupationalTherapy(OccupationalTherapy occupationalTherapy) {
		if(occupationalTherapyList == null) {
			occupationalTherapyList = new ArrayList<>();
		}
		if(occupationalTherapyList.size() == 0) {
			occupationalTherapyList.add(occupationalTherapy);
		} else {
			occupationalTherapyList.set(0, occupationalTherapy);
		}
	}

	@Override
	public List<OccupationalTherapy> getOccupationalTherapyList() {
		return occupationalTherapyList;
	}

	@Override
	public void setOccupationalTherapyList(List<OccupationalTherapy> occupationalTherapyList) {
		this.occupationalTherapyList = occupationalTherapyList;
	}

	@Override
	public boolean hasOccupationalTherapy() {
		return occupationalTherapyList != null && occupationalTherapyList.size() > 0 && occupationalTherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(OceanBodyOfWater oceanBodyOfWater) {
		oceanBodyOfWaterList = new ArrayList<OceanBodyOfWater>();
		oceanBodyOfWaterList.add(oceanBodyOfWater);
	}

	@Override
	public OceanBodyOfWater getOceanBodyOfWater() {
		if(oceanBodyOfWaterList != null && oceanBodyOfWaterList.size() > 0) {
			return oceanBodyOfWaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOceanBodyOfWater(OceanBodyOfWater oceanBodyOfWater) {
		if(oceanBodyOfWaterList == null) {
			oceanBodyOfWaterList = new ArrayList<>();
		}
		if(oceanBodyOfWaterList.size() == 0) {
			oceanBodyOfWaterList.add(oceanBodyOfWater);
		} else {
			oceanBodyOfWaterList.set(0, oceanBodyOfWater);
		}
	}

	@Override
	public List<OceanBodyOfWater> getOceanBodyOfWaterList() {
		return oceanBodyOfWaterList;
	}

	@Override
	public void setOceanBodyOfWaterList(List<OceanBodyOfWater> oceanBodyOfWaterList) {
		this.oceanBodyOfWaterList = oceanBodyOfWaterList;
	}

	@Override
	public boolean hasOceanBodyOfWater() {
		return oceanBodyOfWaterList != null && oceanBodyOfWaterList.size() > 0 && oceanBodyOfWaterList.get(0) != null;
	}

	public ITEM_REVIEWED(Offer offer) {
		offerList = new ArrayList<Offer>();
		offerList.add(offer);
	}

	@Override
	public Offer getOffer() {
		if(offerList != null && offerList.size() > 0) {
			return offerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOffer(Offer offer) {
		if(offerList == null) {
			offerList = new ArrayList<>();
		}
		if(offerList.size() == 0) {
			offerList.add(offer);
		} else {
			offerList.set(0, offer);
		}
	}

	@Override
	public List<Offer> getOfferList() {
		return offerList;
	}

	@Override
	public void setOfferList(List<Offer> offerList) {
		this.offerList = offerList;
	}

	@Override
	public boolean hasOffer() {
		return offerList != null && offerList.size() > 0 && offerList.get(0) != null;
	}

	public ITEM_REVIEWED(OfferCatalog offerCatalog) {
		offerCatalogList = new ArrayList<OfferCatalog>();
		offerCatalogList.add(offerCatalog);
	}

	@Override
	public OfferCatalog getOfferCatalog() {
		if(offerCatalogList != null && offerCatalogList.size() > 0) {
			return offerCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfferCatalog(OfferCatalog offerCatalog) {
		if(offerCatalogList == null) {
			offerCatalogList = new ArrayList<>();
		}
		if(offerCatalogList.size() == 0) {
			offerCatalogList.add(offerCatalog);
		} else {
			offerCatalogList.set(0, offerCatalog);
		}
	}

	@Override
	public List<OfferCatalog> getOfferCatalogList() {
		return offerCatalogList;
	}

	@Override
	public void setOfferCatalogList(List<OfferCatalog> offerCatalogList) {
		this.offerCatalogList = offerCatalogList;
	}

	@Override
	public boolean hasOfferCatalog() {
		return offerCatalogList != null && offerCatalogList.size() > 0 && offerCatalogList.get(0) != null;
	}

	public ITEM_REVIEWED(OfferItemCondition offerItemCondition) {
		offerItemConditionList = new ArrayList<OfferItemCondition>();
		offerItemConditionList.add(offerItemCondition);
	}

	@Override
	public OfferItemCondition getOfferItemCondition() {
		if(offerItemConditionList != null && offerItemConditionList.size() > 0) {
			return offerItemConditionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfferItemCondition(OfferItemCondition offerItemCondition) {
		if(offerItemConditionList == null) {
			offerItemConditionList = new ArrayList<>();
		}
		if(offerItemConditionList.size() == 0) {
			offerItemConditionList.add(offerItemCondition);
		} else {
			offerItemConditionList.set(0, offerItemCondition);
		}
	}

	@Override
	public List<OfferItemCondition> getOfferItemConditionList() {
		return offerItemConditionList;
	}

	@Override
	public void setOfferItemConditionList(List<OfferItemCondition> offerItemConditionList) {
		this.offerItemConditionList = offerItemConditionList;
	}

	@Override
	public boolean hasOfferItemCondition() {
		return offerItemConditionList != null && offerItemConditionList.size() > 0 && offerItemConditionList.get(0) != null;
	}

	public ITEM_REVIEWED(OfficeEquipmentStore officeEquipmentStore) {
		officeEquipmentStoreList = new ArrayList<OfficeEquipmentStore>();
		officeEquipmentStoreList.add(officeEquipmentStore);
	}

	@Override
	public OfficeEquipmentStore getOfficeEquipmentStore() {
		if(officeEquipmentStoreList != null && officeEquipmentStoreList.size() > 0) {
			return officeEquipmentStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfficeEquipmentStore(OfficeEquipmentStore officeEquipmentStore) {
		if(officeEquipmentStoreList == null) {
			officeEquipmentStoreList = new ArrayList<>();
		}
		if(officeEquipmentStoreList.size() == 0) {
			officeEquipmentStoreList.add(officeEquipmentStore);
		} else {
			officeEquipmentStoreList.set(0, officeEquipmentStore);
		}
	}

	@Override
	public List<OfficeEquipmentStore> getOfficeEquipmentStoreList() {
		return officeEquipmentStoreList;
	}

	@Override
	public void setOfficeEquipmentStoreList(List<OfficeEquipmentStore> officeEquipmentStoreList) {
		this.officeEquipmentStoreList = officeEquipmentStoreList;
	}

	@Override
	public boolean hasOfficeEquipmentStore() {
		return officeEquipmentStoreList != null && officeEquipmentStoreList.size() > 0 && officeEquipmentStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(OnDemandEvent onDemandEvent) {
		onDemandEventList = new ArrayList<OnDemandEvent>();
		onDemandEventList.add(onDemandEvent);
	}

	@Override
	public OnDemandEvent getOnDemandEvent() {
		if(onDemandEventList != null && onDemandEventList.size() > 0) {
			return onDemandEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOnDemandEvent(OnDemandEvent onDemandEvent) {
		if(onDemandEventList == null) {
			onDemandEventList = new ArrayList<>();
		}
		if(onDemandEventList.size() == 0) {
			onDemandEventList.add(onDemandEvent);
		} else {
			onDemandEventList.set(0, onDemandEvent);
		}
	}

	@Override
	public List<OnDemandEvent> getOnDemandEventList() {
		return onDemandEventList;
	}

	@Override
	public void setOnDemandEventList(List<OnDemandEvent> onDemandEventList) {
		this.onDemandEventList = onDemandEventList;
	}

	@Override
	public boolean hasOnDemandEvent() {
		return onDemandEventList != null && onDemandEventList.size() > 0 && onDemandEventList.get(0) != null;
	}

	public ITEM_REVIEWED(Oncologic oncologic) {
		oncologicList = new ArrayList<Oncologic>();
		oncologicList.add(oncologic);
	}

	@Override
	public Oncologic getOncologic() {
		if(oncologicList != null && oncologicList.size() > 0) {
			return oncologicList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOncologic(Oncologic oncologic) {
		if(oncologicList == null) {
			oncologicList = new ArrayList<>();
		}
		if(oncologicList.size() == 0) {
			oncologicList.add(oncologic);
		} else {
			oncologicList.set(0, oncologic);
		}
	}

	@Override
	public List<Oncologic> getOncologicList() {
		return oncologicList;
	}

	@Override
	public void setOncologicList(List<Oncologic> oncologicList) {
		this.oncologicList = oncologicList;
	}

	@Override
	public boolean hasOncologic() {
		return oncologicList != null && oncologicList.size() > 0 && oncologicList.get(0) != null;
	}

	public ITEM_REVIEWED(OpeningHoursSpecification openingHoursSpecification) {
		openingHoursSpecificationList = new ArrayList<OpeningHoursSpecification>();
		openingHoursSpecificationList.add(openingHoursSpecification);
	}

	@Override
	public OpeningHoursSpecification getOpeningHoursSpecification() {
		if(openingHoursSpecificationList != null && openingHoursSpecificationList.size() > 0) {
			return openingHoursSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOpeningHoursSpecification(OpeningHoursSpecification openingHoursSpecification) {
		if(openingHoursSpecificationList == null) {
			openingHoursSpecificationList = new ArrayList<>();
		}
		if(openingHoursSpecificationList.size() == 0) {
			openingHoursSpecificationList.add(openingHoursSpecification);
		} else {
			openingHoursSpecificationList.set(0, openingHoursSpecification);
		}
	}

	@Override
	public List<OpeningHoursSpecification> getOpeningHoursSpecificationList() {
		return openingHoursSpecificationList;
	}

	@Override
	public void setOpeningHoursSpecificationList(List<OpeningHoursSpecification> openingHoursSpecificationList) {
		this.openingHoursSpecificationList = openingHoursSpecificationList;
	}

	@Override
	public boolean hasOpeningHoursSpecification() {
		return openingHoursSpecificationList != null && openingHoursSpecificationList.size() > 0 && openingHoursSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(OpinionNewsArticle opinionNewsArticle) {
		opinionNewsArticleList = new ArrayList<OpinionNewsArticle>();
		opinionNewsArticleList.add(opinionNewsArticle);
	}

	@Override
	public OpinionNewsArticle getOpinionNewsArticle() {
		if(opinionNewsArticleList != null && opinionNewsArticleList.size() > 0) {
			return opinionNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle) {
		if(opinionNewsArticleList == null) {
			opinionNewsArticleList = new ArrayList<>();
		}
		if(opinionNewsArticleList.size() == 0) {
			opinionNewsArticleList.add(opinionNewsArticle);
		} else {
			opinionNewsArticleList.set(0, opinionNewsArticle);
		}
	}

	@Override
	public List<OpinionNewsArticle> getOpinionNewsArticleList() {
		return opinionNewsArticleList;
	}

	@Override
	public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList) {
		this.opinionNewsArticleList = opinionNewsArticleList;
	}

	@Override
	public boolean hasOpinionNewsArticle() {
		return opinionNewsArticleList != null && opinionNewsArticleList.size() > 0 && opinionNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(Optician optician) {
		opticianList = new ArrayList<Optician>();
		opticianList.add(optician);
	}

	@Override
	public Optician getOptician() {
		if(opticianList != null && opticianList.size() > 0) {
			return opticianList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOptician(Optician optician) {
		if(opticianList == null) {
			opticianList = new ArrayList<>();
		}
		if(opticianList.size() == 0) {
			opticianList.add(optician);
		} else {
			opticianList.set(0, optician);
		}
	}

	@Override
	public List<Optician> getOpticianList() {
		return opticianList;
	}

	@Override
	public void setOpticianList(List<Optician> opticianList) {
		this.opticianList = opticianList;
	}

	@Override
	public boolean hasOptician() {
		return opticianList != null && opticianList.size() > 0 && opticianList.get(0) != null;
	}

	public ITEM_REVIEWED(Optometric optometric) {
		optometricList = new ArrayList<Optometric>();
		optometricList.add(optometric);
	}

	@Override
	public Optometric getOptometric() {
		if(optometricList != null && optometricList.size() > 0) {
			return optometricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOptometric(Optometric optometric) {
		if(optometricList == null) {
			optometricList = new ArrayList<>();
		}
		if(optometricList.size() == 0) {
			optometricList.add(optometric);
		} else {
			optometricList.set(0, optometric);
		}
	}

	@Override
	public List<Optometric> getOptometricList() {
		return optometricList;
	}

	@Override
	public void setOptometricList(List<Optometric> optometricList) {
		this.optometricList = optometricList;
	}

	@Override
	public boolean hasOptometric() {
		return optometricList != null && optometricList.size() > 0 && optometricList.get(0) != null;
	}

	public ITEM_REVIEWED(Order order) {
		orderList = new ArrayList<Order>();
		orderList.add(order);
	}

	@Override
	public Order getOrder() {
		if(orderList != null && orderList.size() > 0) {
			return orderList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrder(Order order) {
		if(orderList == null) {
			orderList = new ArrayList<>();
		}
		if(orderList.size() == 0) {
			orderList.add(order);
		} else {
			orderList.set(0, order);
		}
	}

	@Override
	public List<Order> getOrderList() {
		return orderList;
	}

	@Override
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public boolean hasOrder() {
		return orderList != null && orderList.size() > 0 && orderList.get(0) != null;
	}

	public ITEM_REVIEWED(OrderAction orderAction) {
		orderActionList = new ArrayList<OrderAction>();
		orderActionList.add(orderAction);
	}

	@Override
	public OrderAction getOrderAction() {
		if(orderActionList != null && orderActionList.size() > 0) {
			return orderActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderAction(OrderAction orderAction) {
		if(orderActionList == null) {
			orderActionList = new ArrayList<>();
		}
		if(orderActionList.size() == 0) {
			orderActionList.add(orderAction);
		} else {
			orderActionList.set(0, orderAction);
		}
	}

	@Override
	public List<OrderAction> getOrderActionList() {
		return orderActionList;
	}

	@Override
	public void setOrderActionList(List<OrderAction> orderActionList) {
		this.orderActionList = orderActionList;
	}

	@Override
	public boolean hasOrderAction() {
		return orderActionList != null && orderActionList.size() > 0 && orderActionList.get(0) != null;
	}

	public ITEM_REVIEWED(OrderItem orderItem) {
		orderItemList = new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
	}

	@Override
	public OrderItem getOrderItem() {
		if(orderItemList != null && orderItemList.size() > 0) {
			return orderItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderItem(OrderItem orderItem) {
		if(orderItemList == null) {
			orderItemList = new ArrayList<>();
		}
		if(orderItemList.size() == 0) {
			orderItemList.add(orderItem);
		} else {
			orderItemList.set(0, orderItem);
		}
	}

	@Override
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	@Override
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public boolean hasOrderItem() {
		return orderItemList != null && orderItemList.size() > 0 && orderItemList.get(0) != null;
	}

	public ITEM_REVIEWED(OrderStatus orderStatus) {
		orderStatusList = new ArrayList<OrderStatus>();
		orderStatusList.add(orderStatus);
	}

	@Override
	public OrderStatus getOrderStatus() {
		if(orderStatusList != null && orderStatusList.size() > 0) {
			return orderStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatusList == null) {
			orderStatusList = new ArrayList<>();
		}
		if(orderStatusList.size() == 0) {
			orderStatusList.add(orderStatus);
		} else {
			orderStatusList.set(0, orderStatus);
		}
	}

	@Override
	public List<OrderStatus> getOrderStatusList() {
		return orderStatusList;
	}

	@Override
	public void setOrderStatusList(List<OrderStatus> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}

	@Override
	public boolean hasOrderStatus() {
		return orderStatusList != null && orderStatusList.size() > 0 && orderStatusList.get(0) != null;
	}

	public ITEM_REVIEWED(Organization organization) {
		organizationList = new ArrayList<Organization>();
		organizationList.add(organization);
	}

	@Override
	public Organization getOrganization() {
		if(organizationList != null && organizationList.size() > 0) {
			return organizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganization(Organization organization) {
		if(organizationList == null) {
			organizationList = new ArrayList<>();
		}
		if(organizationList.size() == 0) {
			organizationList.add(organization);
		} else {
			organizationList.set(0, organization);
		}
	}

	@Override
	public List<Organization> getOrganizationList() {
		return organizationList;
	}

	@Override
	public void setOrganizationList(List<Organization> organizationList) {
		this.organizationList = organizationList;
	}

	@Override
	public boolean hasOrganization() {
		return organizationList != null && organizationList.size() > 0 && organizationList.get(0) != null;
	}

	public ITEM_REVIEWED(OrganizationRole organizationRole) {
		organizationRoleList = new ArrayList<OrganizationRole>();
		organizationRoleList.add(organizationRole);
	}

	@Override
	public OrganizationRole getOrganizationRole() {
		if(organizationRoleList != null && organizationRoleList.size() > 0) {
			return organizationRoleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganizationRole(OrganizationRole organizationRole) {
		if(organizationRoleList == null) {
			organizationRoleList = new ArrayList<>();
		}
		if(organizationRoleList.size() == 0) {
			organizationRoleList.add(organizationRole);
		} else {
			organizationRoleList.set(0, organizationRole);
		}
	}

	@Override
	public List<OrganizationRole> getOrganizationRoleList() {
		return organizationRoleList;
	}

	@Override
	public void setOrganizationRoleList(List<OrganizationRole> organizationRoleList) {
		this.organizationRoleList = organizationRoleList;
	}

	@Override
	public boolean hasOrganizationRole() {
		return organizationRoleList != null && organizationRoleList.size() > 0 && organizationRoleList.get(0) != null;
	}

	public ITEM_REVIEWED(OrganizeAction organizeAction) {
		organizeActionList = new ArrayList<OrganizeAction>();
		organizeActionList.add(organizeAction);
	}

	@Override
	public OrganizeAction getOrganizeAction() {
		if(organizeActionList != null && organizeActionList.size() > 0) {
			return organizeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganizeAction(OrganizeAction organizeAction) {
		if(organizeActionList == null) {
			organizeActionList = new ArrayList<>();
		}
		if(organizeActionList.size() == 0) {
			organizeActionList.add(organizeAction);
		} else {
			organizeActionList.set(0, organizeAction);
		}
	}

	@Override
	public List<OrganizeAction> getOrganizeActionList() {
		return organizeActionList;
	}

	@Override
	public void setOrganizeActionList(List<OrganizeAction> organizeActionList) {
		this.organizeActionList = organizeActionList;
	}

	@Override
	public boolean hasOrganizeAction() {
		return organizeActionList != null && organizeActionList.size() > 0 && organizeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Otolaryngologic otolaryngologic) {
		otolaryngologicList = new ArrayList<Otolaryngologic>();
		otolaryngologicList.add(otolaryngologic);
	}

	@Override
	public Otolaryngologic getOtolaryngologic() {
		if(otolaryngologicList != null && otolaryngologicList.size() > 0) {
			return otolaryngologicList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOtolaryngologic(Otolaryngologic otolaryngologic) {
		if(otolaryngologicList == null) {
			otolaryngologicList = new ArrayList<>();
		}
		if(otolaryngologicList.size() == 0) {
			otolaryngologicList.add(otolaryngologic);
		} else {
			otolaryngologicList.set(0, otolaryngologic);
		}
	}

	@Override
	public List<Otolaryngologic> getOtolaryngologicList() {
		return otolaryngologicList;
	}

	@Override
	public void setOtolaryngologicList(List<Otolaryngologic> otolaryngologicList) {
		this.otolaryngologicList = otolaryngologicList;
	}

	@Override
	public boolean hasOtolaryngologic() {
		return otolaryngologicList != null && otolaryngologicList.size() > 0 && otolaryngologicList.get(0) != null;
	}

	public ITEM_REVIEWED(OutletStore outletStore) {
		outletStoreList = new ArrayList<OutletStore>();
		outletStoreList.add(outletStore);
	}

	@Override
	public OutletStore getOutletStore() {
		if(outletStoreList != null && outletStoreList.size() > 0) {
			return outletStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOutletStore(OutletStore outletStore) {
		if(outletStoreList == null) {
			outletStoreList = new ArrayList<>();
		}
		if(outletStoreList.size() == 0) {
			outletStoreList.add(outletStore);
		} else {
			outletStoreList.set(0, outletStore);
		}
	}

	@Override
	public List<OutletStore> getOutletStoreList() {
		return outletStoreList;
	}

	@Override
	public void setOutletStoreList(List<OutletStore> outletStoreList) {
		this.outletStoreList = outletStoreList;
	}

	@Override
	public boolean hasOutletStore() {
		return outletStoreList != null && outletStoreList.size() > 0 && outletStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(OwnershipInfo ownershipInfo) {
		ownershipInfoList = new ArrayList<OwnershipInfo>();
		ownershipInfoList.add(ownershipInfo);
	}

	@Override
	public OwnershipInfo getOwnershipInfo() {
		if(ownershipInfoList != null && ownershipInfoList.size() > 0) {
			return ownershipInfoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOwnershipInfo(OwnershipInfo ownershipInfo) {
		if(ownershipInfoList == null) {
			ownershipInfoList = new ArrayList<>();
		}
		if(ownershipInfoList.size() == 0) {
			ownershipInfoList.add(ownershipInfo);
		} else {
			ownershipInfoList.set(0, ownershipInfo);
		}
	}

	@Override
	public List<OwnershipInfo> getOwnershipInfoList() {
		return ownershipInfoList;
	}

	@Override
	public void setOwnershipInfoList(List<OwnershipInfo> ownershipInfoList) {
		this.ownershipInfoList = ownershipInfoList;
	}

	@Override
	public boolean hasOwnershipInfo() {
		return ownershipInfoList != null && ownershipInfoList.size() > 0 && ownershipInfoList.get(0) != null;
	}

	public ITEM_REVIEWED(PaintAction paintAction) {
		paintActionList = new ArrayList<PaintAction>();
		paintActionList.add(paintAction);
	}

	@Override
	public PaintAction getPaintAction() {
		if(paintActionList != null && paintActionList.size() > 0) {
			return paintActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaintAction(PaintAction paintAction) {
		if(paintActionList == null) {
			paintActionList = new ArrayList<>();
		}
		if(paintActionList.size() == 0) {
			paintActionList.add(paintAction);
		} else {
			paintActionList.set(0, paintAction);
		}
	}

	@Override
	public List<PaintAction> getPaintActionList() {
		return paintActionList;
	}

	@Override
	public void setPaintActionList(List<PaintAction> paintActionList) {
		this.paintActionList = paintActionList;
	}

	@Override
	public boolean hasPaintAction() {
		return paintActionList != null && paintActionList.size() > 0 && paintActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Painting painting) {
		paintingList = new ArrayList<Painting>();
		paintingList.add(painting);
	}

	@Override
	public Painting getPainting() {
		if(paintingList != null && paintingList.size() > 0) {
			return paintingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPainting(Painting painting) {
		if(paintingList == null) {
			paintingList = new ArrayList<>();
		}
		if(paintingList.size() == 0) {
			paintingList.add(painting);
		} else {
			paintingList.set(0, painting);
		}
	}

	@Override
	public List<Painting> getPaintingList() {
		return paintingList;
	}

	@Override
	public void setPaintingList(List<Painting> paintingList) {
		this.paintingList = paintingList;
	}

	@Override
	public boolean hasPainting() {
		return paintingList != null && paintingList.size() > 0 && paintingList.get(0) != null;
	}

	public ITEM_REVIEWED(PalliativeProcedure palliativeProcedure) {
		palliativeProcedureList = new ArrayList<PalliativeProcedure>();
		palliativeProcedureList.add(palliativeProcedure);
	}

	@Override
	public PalliativeProcedure getPalliativeProcedure() {
		if(palliativeProcedureList != null && palliativeProcedureList.size() > 0) {
			return palliativeProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPalliativeProcedure(PalliativeProcedure palliativeProcedure) {
		if(palliativeProcedureList == null) {
			palliativeProcedureList = new ArrayList<>();
		}
		if(palliativeProcedureList.size() == 0) {
			palliativeProcedureList.add(palliativeProcedure);
		} else {
			palliativeProcedureList.set(0, palliativeProcedure);
		}
	}

	@Override
	public List<PalliativeProcedure> getPalliativeProcedureList() {
		return palliativeProcedureList;
	}

	@Override
	public void setPalliativeProcedureList(List<PalliativeProcedure> palliativeProcedureList) {
		this.palliativeProcedureList = palliativeProcedureList;
	}

	@Override
	public boolean hasPalliativeProcedure() {
		return palliativeProcedureList != null && palliativeProcedureList.size() > 0 && palliativeProcedureList.get(0) != null;
	}

	public ITEM_REVIEWED(ParcelDelivery parcelDelivery) {
		parcelDeliveryList = new ArrayList<ParcelDelivery>();
		parcelDeliveryList.add(parcelDelivery);
	}

	@Override
	public ParcelDelivery getParcelDelivery() {
		if(parcelDeliveryList != null && parcelDeliveryList.size() > 0) {
			return parcelDeliveryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParcelDelivery(ParcelDelivery parcelDelivery) {
		if(parcelDeliveryList == null) {
			parcelDeliveryList = new ArrayList<>();
		}
		if(parcelDeliveryList.size() == 0) {
			parcelDeliveryList.add(parcelDelivery);
		} else {
			parcelDeliveryList.set(0, parcelDelivery);
		}
	}

	@Override
	public List<ParcelDelivery> getParcelDeliveryList() {
		return parcelDeliveryList;
	}

	@Override
	public void setParcelDeliveryList(List<ParcelDelivery> parcelDeliveryList) {
		this.parcelDeliveryList = parcelDeliveryList;
	}

	@Override
	public boolean hasParcelDelivery() {
		return parcelDeliveryList != null && parcelDeliveryList.size() > 0 && parcelDeliveryList.get(0) != null;
	}

	public ITEM_REVIEWED(ParcelService parcelService) {
		parcelServiceList = new ArrayList<ParcelService>();
		parcelServiceList.add(parcelService);
	}

	@Override
	public ParcelService getParcelService() {
		if(parcelServiceList != null && parcelServiceList.size() > 0) {
			return parcelServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParcelService(ParcelService parcelService) {
		if(parcelServiceList == null) {
			parcelServiceList = new ArrayList<>();
		}
		if(parcelServiceList.size() == 0) {
			parcelServiceList.add(parcelService);
		} else {
			parcelServiceList.set(0, parcelService);
		}
	}

	@Override
	public List<ParcelService> getParcelServiceList() {
		return parcelServiceList;
	}

	@Override
	public void setParcelServiceList(List<ParcelService> parcelServiceList) {
		this.parcelServiceList = parcelServiceList;
	}

	@Override
	public boolean hasParcelService() {
		return parcelServiceList != null && parcelServiceList.size() > 0 && parcelServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(ParentAudience parentAudience) {
		parentAudienceList = new ArrayList<ParentAudience>();
		parentAudienceList.add(parentAudience);
	}

	@Override
	public ParentAudience getParentAudience() {
		if(parentAudienceList != null && parentAudienceList.size() > 0) {
			return parentAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParentAudience(ParentAudience parentAudience) {
		if(parentAudienceList == null) {
			parentAudienceList = new ArrayList<>();
		}
		if(parentAudienceList.size() == 0) {
			parentAudienceList.add(parentAudience);
		} else {
			parentAudienceList.set(0, parentAudience);
		}
	}

	@Override
	public List<ParentAudience> getParentAudienceList() {
		return parentAudienceList;
	}

	@Override
	public void setParentAudienceList(List<ParentAudience> parentAudienceList) {
		this.parentAudienceList = parentAudienceList;
	}

	@Override
	public boolean hasParentAudience() {
		return parentAudienceList != null && parentAudienceList.size() > 0 && parentAudienceList.get(0) != null;
	}

	public ITEM_REVIEWED(Park park) {
		parkList = new ArrayList<Park>();
		parkList.add(park);
	}

	@Override
	public Park getPark() {
		if(parkList != null && parkList.size() > 0) {
			return parkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPark(Park park) {
		if(parkList == null) {
			parkList = new ArrayList<>();
		}
		if(parkList.size() == 0) {
			parkList.add(park);
		} else {
			parkList.set(0, park);
		}
	}

	@Override
	public List<Park> getParkList() {
		return parkList;
	}

	@Override
	public void setParkList(List<Park> parkList) {
		this.parkList = parkList;
	}

	@Override
	public boolean hasPark() {
		return parkList != null && parkList.size() > 0 && parkList.get(0) != null;
	}

	public ITEM_REVIEWED(ParkingFacility parkingFacility) {
		parkingFacilityList = new ArrayList<ParkingFacility>();
		parkingFacilityList.add(parkingFacility);
	}

	@Override
	public ParkingFacility getParkingFacility() {
		if(parkingFacilityList != null && parkingFacilityList.size() > 0) {
			return parkingFacilityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParkingFacility(ParkingFacility parkingFacility) {
		if(parkingFacilityList == null) {
			parkingFacilityList = new ArrayList<>();
		}
		if(parkingFacilityList.size() == 0) {
			parkingFacilityList.add(parkingFacility);
		} else {
			parkingFacilityList.set(0, parkingFacility);
		}
	}

	@Override
	public List<ParkingFacility> getParkingFacilityList() {
		return parkingFacilityList;
	}

	@Override
	public void setParkingFacilityList(List<ParkingFacility> parkingFacilityList) {
		this.parkingFacilityList = parkingFacilityList;
	}

	@Override
	public boolean hasParkingFacility() {
		return parkingFacilityList != null && parkingFacilityList.size() > 0 && parkingFacilityList.get(0) != null;
	}

	public ITEM_REVIEWED(PathologyTest pathologyTest) {
		pathologyTestList = new ArrayList<PathologyTest>();
		pathologyTestList.add(pathologyTest);
	}

	@Override
	public PathologyTest getPathologyTest() {
		if(pathologyTestList != null && pathologyTestList.size() > 0) {
			return pathologyTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPathologyTest(PathologyTest pathologyTest) {
		if(pathologyTestList == null) {
			pathologyTestList = new ArrayList<>();
		}
		if(pathologyTestList.size() == 0) {
			pathologyTestList.add(pathologyTest);
		} else {
			pathologyTestList.set(0, pathologyTest);
		}
	}

	@Override
	public List<PathologyTest> getPathologyTestList() {
		return pathologyTestList;
	}

	@Override
	public void setPathologyTestList(List<PathologyTest> pathologyTestList) {
		this.pathologyTestList = pathologyTestList;
	}

	@Override
	public boolean hasPathologyTest() {
		return pathologyTestList != null && pathologyTestList.size() > 0 && pathologyTestList.get(0) != null;
	}

	public ITEM_REVIEWED(Patient patient) {
		patientList = new ArrayList<Patient>();
		patientList.add(patient);
	}

	@Override
	public Patient getPatient() {
		if(patientList != null && patientList.size() > 0) {
			return patientList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPatient(Patient patient) {
		if(patientList == null) {
			patientList = new ArrayList<>();
		}
		if(patientList.size() == 0) {
			patientList.add(patient);
		} else {
			patientList.set(0, patient);
		}
	}

	@Override
	public List<Patient> getPatientList() {
		return patientList;
	}

	@Override
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	@Override
	public boolean hasPatient() {
		return patientList != null && patientList.size() > 0 && patientList.get(0) != null;
	}

	public ITEM_REVIEWED(PawnShop pawnShop) {
		pawnShopList = new ArrayList<PawnShop>();
		pawnShopList.add(pawnShop);
	}

	@Override
	public PawnShop getPawnShop() {
		if(pawnShopList != null && pawnShopList.size() > 0) {
			return pawnShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPawnShop(PawnShop pawnShop) {
		if(pawnShopList == null) {
			pawnShopList = new ArrayList<>();
		}
		if(pawnShopList.size() == 0) {
			pawnShopList.add(pawnShop);
		} else {
			pawnShopList.set(0, pawnShop);
		}
	}

	@Override
	public List<PawnShop> getPawnShopList() {
		return pawnShopList;
	}

	@Override
	public void setPawnShopList(List<PawnShop> pawnShopList) {
		this.pawnShopList = pawnShopList;
	}

	@Override
	public boolean hasPawnShop() {
		return pawnShopList != null && pawnShopList.size() > 0 && pawnShopList.get(0) != null;
	}

	public ITEM_REVIEWED(PayAction payAction) {
		payActionList = new ArrayList<PayAction>();
		payActionList.add(payAction);
	}

	@Override
	public PayAction getPayAction() {
		if(payActionList != null && payActionList.size() > 0) {
			return payActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPayAction(PayAction payAction) {
		if(payActionList == null) {
			payActionList = new ArrayList<>();
		}
		if(payActionList.size() == 0) {
			payActionList.add(payAction);
		} else {
			payActionList.set(0, payAction);
		}
	}

	@Override
	public List<PayAction> getPayActionList() {
		return payActionList;
	}

	@Override
	public void setPayActionList(List<PayAction> payActionList) {
		this.payActionList = payActionList;
	}

	@Override
	public boolean hasPayAction() {
		return payActionList != null && payActionList.size() > 0 && payActionList.get(0) != null;
	}

	public ITEM_REVIEWED(PaymentCard paymentCard) {
		paymentCardList = new ArrayList<PaymentCard>();
		paymentCardList.add(paymentCard);
	}

	@Override
	public PaymentCard getPaymentCard() {
		if(paymentCardList != null && paymentCardList.size() > 0) {
			return paymentCardList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentCard(PaymentCard paymentCard) {
		if(paymentCardList == null) {
			paymentCardList = new ArrayList<>();
		}
		if(paymentCardList.size() == 0) {
			paymentCardList.add(paymentCard);
		} else {
			paymentCardList.set(0, paymentCard);
		}
	}

	@Override
	public List<PaymentCard> getPaymentCardList() {
		return paymentCardList;
	}

	@Override
	public void setPaymentCardList(List<PaymentCard> paymentCardList) {
		this.paymentCardList = paymentCardList;
	}

	@Override
	public boolean hasPaymentCard() {
		return paymentCardList != null && paymentCardList.size() > 0 && paymentCardList.get(0) != null;
	}

	public ITEM_REVIEWED(PaymentChargeSpecification paymentChargeSpecification) {
		paymentChargeSpecificationList = new ArrayList<PaymentChargeSpecification>();
		paymentChargeSpecificationList.add(paymentChargeSpecification);
	}

	@Override
	public PaymentChargeSpecification getPaymentChargeSpecification() {
		if(paymentChargeSpecificationList != null && paymentChargeSpecificationList.size() > 0) {
			return paymentChargeSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentChargeSpecification(PaymentChargeSpecification paymentChargeSpecification) {
		if(paymentChargeSpecificationList == null) {
			paymentChargeSpecificationList = new ArrayList<>();
		}
		if(paymentChargeSpecificationList.size() == 0) {
			paymentChargeSpecificationList.add(paymentChargeSpecification);
		} else {
			paymentChargeSpecificationList.set(0, paymentChargeSpecification);
		}
	}

	@Override
	public List<PaymentChargeSpecification> getPaymentChargeSpecificationList() {
		return paymentChargeSpecificationList;
	}

	@Override
	public void setPaymentChargeSpecificationList(List<PaymentChargeSpecification> paymentChargeSpecificationList) {
		this.paymentChargeSpecificationList = paymentChargeSpecificationList;
	}

	@Override
	public boolean hasPaymentChargeSpecification() {
		return paymentChargeSpecificationList != null && paymentChargeSpecificationList.size() > 0 && paymentChargeSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(PaymentMethod paymentMethod) {
		paymentMethodList = new ArrayList<PaymentMethod>();
		paymentMethodList.add(paymentMethod);
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		if(paymentMethodList != null && paymentMethodList.size() > 0) {
			return paymentMethodList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		if(paymentMethodList == null) {
			paymentMethodList = new ArrayList<>();
		}
		if(paymentMethodList.size() == 0) {
			paymentMethodList.add(paymentMethod);
		} else {
			paymentMethodList.set(0, paymentMethod);
		}
	}

	@Override
	public List<PaymentMethod> getPaymentMethodList() {
		return paymentMethodList;
	}

	@Override
	public void setPaymentMethodList(List<PaymentMethod> paymentMethodList) {
		this.paymentMethodList = paymentMethodList;
	}

	@Override
	public boolean hasPaymentMethod() {
		return paymentMethodList != null && paymentMethodList.size() > 0 && paymentMethodList.get(0) != null;
	}

	public ITEM_REVIEWED(PaymentService paymentService) {
		paymentServiceList = new ArrayList<PaymentService>();
		paymentServiceList.add(paymentService);
	}

	@Override
	public PaymentService getPaymentService() {
		if(paymentServiceList != null && paymentServiceList.size() > 0) {
			return paymentServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentService(PaymentService paymentService) {
		if(paymentServiceList == null) {
			paymentServiceList = new ArrayList<>();
		}
		if(paymentServiceList.size() == 0) {
			paymentServiceList.add(paymentService);
		} else {
			paymentServiceList.set(0, paymentService);
		}
	}

	@Override
	public List<PaymentService> getPaymentServiceList() {
		return paymentServiceList;
	}

	@Override
	public void setPaymentServiceList(List<PaymentService> paymentServiceList) {
		this.paymentServiceList = paymentServiceList;
	}

	@Override
	public boolean hasPaymentService() {
		return paymentServiceList != null && paymentServiceList.size() > 0 && paymentServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(PaymentStatusType paymentStatusType) {
		paymentStatusTypeList = new ArrayList<PaymentStatusType>();
		paymentStatusTypeList.add(paymentStatusType);
	}

	@Override
	public PaymentStatusType getPaymentStatusType() {
		if(paymentStatusTypeList != null && paymentStatusTypeList.size() > 0) {
			return paymentStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentStatusType(PaymentStatusType paymentStatusType) {
		if(paymentStatusTypeList == null) {
			paymentStatusTypeList = new ArrayList<>();
		}
		if(paymentStatusTypeList.size() == 0) {
			paymentStatusTypeList.add(paymentStatusType);
		} else {
			paymentStatusTypeList.set(0, paymentStatusType);
		}
	}

	@Override
	public List<PaymentStatusType> getPaymentStatusTypeList() {
		return paymentStatusTypeList;
	}

	@Override
	public void setPaymentStatusTypeList(List<PaymentStatusType> paymentStatusTypeList) {
		this.paymentStatusTypeList = paymentStatusTypeList;
	}

	@Override
	public boolean hasPaymentStatusType() {
		return paymentStatusTypeList != null && paymentStatusTypeList.size() > 0 && paymentStatusTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(Pediatric pediatric) {
		pediatricList = new ArrayList<Pediatric>();
		pediatricList.add(pediatric);
	}

	@Override
	public Pediatric getPediatric() {
		if(pediatricList != null && pediatricList.size() > 0) {
			return pediatricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPediatric(Pediatric pediatric) {
		if(pediatricList == null) {
			pediatricList = new ArrayList<>();
		}
		if(pediatricList.size() == 0) {
			pediatricList.add(pediatric);
		} else {
			pediatricList.set(0, pediatric);
		}
	}

	@Override
	public List<Pediatric> getPediatricList() {
		return pediatricList;
	}

	@Override
	public void setPediatricList(List<Pediatric> pediatricList) {
		this.pediatricList = pediatricList;
	}

	@Override
	public boolean hasPediatric() {
		return pediatricList != null && pediatricList.size() > 0 && pediatricList.get(0) != null;
	}

	public ITEM_REVIEWED(PeopleAudience peopleAudience) {
		peopleAudienceList = new ArrayList<PeopleAudience>();
		peopleAudienceList.add(peopleAudience);
	}

	@Override
	public PeopleAudience getPeopleAudience() {
		if(peopleAudienceList != null && peopleAudienceList.size() > 0) {
			return peopleAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPeopleAudience(PeopleAudience peopleAudience) {
		if(peopleAudienceList == null) {
			peopleAudienceList = new ArrayList<>();
		}
		if(peopleAudienceList.size() == 0) {
			peopleAudienceList.add(peopleAudience);
		} else {
			peopleAudienceList.set(0, peopleAudience);
		}
	}

	@Override
	public List<PeopleAudience> getPeopleAudienceList() {
		return peopleAudienceList;
	}

	@Override
	public void setPeopleAudienceList(List<PeopleAudience> peopleAudienceList) {
		this.peopleAudienceList = peopleAudienceList;
	}

	@Override
	public boolean hasPeopleAudience() {
		return peopleAudienceList != null && peopleAudienceList.size() > 0 && peopleAudienceList.get(0) != null;
	}

	public ITEM_REVIEWED(PerformAction performAction) {
		performActionList = new ArrayList<PerformAction>();
		performActionList.add(performAction);
	}

	@Override
	public PerformAction getPerformAction() {
		if(performActionList != null && performActionList.size() > 0) {
			return performActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerformAction(PerformAction performAction) {
		if(performActionList == null) {
			performActionList = new ArrayList<>();
		}
		if(performActionList.size() == 0) {
			performActionList.add(performAction);
		} else {
			performActionList.set(0, performAction);
		}
	}

	@Override
	public List<PerformAction> getPerformActionList() {
		return performActionList;
	}

	@Override
	public void setPerformActionList(List<PerformAction> performActionList) {
		this.performActionList = performActionList;
	}

	@Override
	public boolean hasPerformAction() {
		return performActionList != null && performActionList.size() > 0 && performActionList.get(0) != null;
	}

	public ITEM_REVIEWED(PerformanceRole performanceRole) {
		performanceRoleList = new ArrayList<PerformanceRole>();
		performanceRoleList.add(performanceRole);
	}

	@Override
	public PerformanceRole getPerformanceRole() {
		if(performanceRoleList != null && performanceRoleList.size() > 0) {
			return performanceRoleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerformanceRole(PerformanceRole performanceRole) {
		if(performanceRoleList == null) {
			performanceRoleList = new ArrayList<>();
		}
		if(performanceRoleList.size() == 0) {
			performanceRoleList.add(performanceRole);
		} else {
			performanceRoleList.set(0, performanceRole);
		}
	}

	@Override
	public List<PerformanceRole> getPerformanceRoleList() {
		return performanceRoleList;
	}

	@Override
	public void setPerformanceRoleList(List<PerformanceRole> performanceRoleList) {
		this.performanceRoleList = performanceRoleList;
	}

	@Override
	public boolean hasPerformanceRole() {
		return performanceRoleList != null && performanceRoleList.size() > 0 && performanceRoleList.get(0) != null;
	}

	public ITEM_REVIEWED(PerformingArtsTheater performingArtsTheater) {
		performingArtsTheaterList = new ArrayList<PerformingArtsTheater>();
		performingArtsTheaterList.add(performingArtsTheater);
	}

	@Override
	public PerformingArtsTheater getPerformingArtsTheater() {
		if(performingArtsTheaterList != null && performingArtsTheaterList.size() > 0) {
			return performingArtsTheaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerformingArtsTheater(PerformingArtsTheater performingArtsTheater) {
		if(performingArtsTheaterList == null) {
			performingArtsTheaterList = new ArrayList<>();
		}
		if(performingArtsTheaterList.size() == 0) {
			performingArtsTheaterList.add(performingArtsTheater);
		} else {
			performingArtsTheaterList.set(0, performingArtsTheater);
		}
	}

	@Override
	public List<PerformingArtsTheater> getPerformingArtsTheaterList() {
		return performingArtsTheaterList;
	}

	@Override
	public void setPerformingArtsTheaterList(List<PerformingArtsTheater> performingArtsTheaterList) {
		this.performingArtsTheaterList = performingArtsTheaterList;
	}

	@Override
	public boolean hasPerformingArtsTheater() {
		return performingArtsTheaterList != null && performingArtsTheaterList.size() > 0 && performingArtsTheaterList.get(0) != null;
	}

	public ITEM_REVIEWED(PerformingGroup performingGroup) {
		performingGroupList = new ArrayList<PerformingGroup>();
		performingGroupList.add(performingGroup);
	}

	@Override
	public PerformingGroup getPerformingGroup() {
		if(performingGroupList != null && performingGroupList.size() > 0) {
			return performingGroupList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerformingGroup(PerformingGroup performingGroup) {
		if(performingGroupList == null) {
			performingGroupList = new ArrayList<>();
		}
		if(performingGroupList.size() == 0) {
			performingGroupList.add(performingGroup);
		} else {
			performingGroupList.set(0, performingGroup);
		}
	}

	@Override
	public List<PerformingGroup> getPerformingGroupList() {
		return performingGroupList;
	}

	@Override
	public void setPerformingGroupList(List<PerformingGroup> performingGroupList) {
		this.performingGroupList = performingGroupList;
	}

	@Override
	public boolean hasPerformingGroup() {
		return performingGroupList != null && performingGroupList.size() > 0 && performingGroupList.get(0) != null;
	}

	public ITEM_REVIEWED(Periodical periodical) {
		periodicalList = new ArrayList<Periodical>();
		periodicalList.add(periodical);
	}

	@Override
	public Periodical getPeriodical() {
		if(periodicalList != null && periodicalList.size() > 0) {
			return periodicalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPeriodical(Periodical periodical) {
		if(periodicalList == null) {
			periodicalList = new ArrayList<>();
		}
		if(periodicalList.size() == 0) {
			periodicalList.add(periodical);
		} else {
			periodicalList.set(0, periodical);
		}
	}

	@Override
	public List<Periodical> getPeriodicalList() {
		return periodicalList;
	}

	@Override
	public void setPeriodicalList(List<Periodical> periodicalList) {
		this.periodicalList = periodicalList;
	}

	@Override
	public boolean hasPeriodical() {
		return periodicalList != null && periodicalList.size() > 0 && periodicalList.get(0) != null;
	}

	public ITEM_REVIEWED(Permit permit) {
		permitList = new ArrayList<Permit>();
		permitList.add(permit);
	}

	@Override
	public Permit getPermit() {
		if(permitList != null && permitList.size() > 0) {
			return permitList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPermit(Permit permit) {
		if(permitList == null) {
			permitList = new ArrayList<>();
		}
		if(permitList.size() == 0) {
			permitList.add(permit);
		} else {
			permitList.set(0, permit);
		}
	}

	@Override
	public List<Permit> getPermitList() {
		return permitList;
	}

	@Override
	public void setPermitList(List<Permit> permitList) {
		this.permitList = permitList;
	}

	@Override
	public boolean hasPermit() {
		return permitList != null && permitList.size() > 0 && permitList.get(0) != null;
	}

	public ITEM_REVIEWED(Person person) {
		personList = new ArrayList<Person>();
		personList.add(person);
	}

	@Override
	public Person getPerson() {
		if(personList != null && personList.size() > 0) {
			return personList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerson(Person person) {
		if(personList == null) {
			personList = new ArrayList<>();
		}
		if(personList.size() == 0) {
			personList.add(person);
		} else {
			personList.set(0, person);
		}
	}

	@Override
	public List<Person> getPersonList() {
		return personList;
	}

	@Override
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@Override
	public boolean hasPerson() {
		return personList != null && personList.size() > 0 && personList.get(0) != null;
	}

	public ITEM_REVIEWED(PetStore petStore) {
		petStoreList = new ArrayList<PetStore>();
		petStoreList.add(petStore);
	}

	@Override
	public PetStore getPetStore() {
		if(petStoreList != null && petStoreList.size() > 0) {
			return petStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPetStore(PetStore petStore) {
		if(petStoreList == null) {
			petStoreList = new ArrayList<>();
		}
		if(petStoreList.size() == 0) {
			petStoreList.add(petStore);
		} else {
			petStoreList.set(0, petStore);
		}
	}

	@Override
	public List<PetStore> getPetStoreList() {
		return petStoreList;
	}

	@Override
	public void setPetStoreList(List<PetStore> petStoreList) {
		this.petStoreList = petStoreList;
	}

	@Override
	public boolean hasPetStore() {
		return petStoreList != null && petStoreList.size() > 0 && petStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(Pharmacy pharmacy) {
		pharmacyList = new ArrayList<Pharmacy>();
		pharmacyList.add(pharmacy);
	}

	@Override
	public Pharmacy getPharmacy() {
		if(pharmacyList != null && pharmacyList.size() > 0) {
			return pharmacyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPharmacy(Pharmacy pharmacy) {
		if(pharmacyList == null) {
			pharmacyList = new ArrayList<>();
		}
		if(pharmacyList.size() == 0) {
			pharmacyList.add(pharmacy);
		} else {
			pharmacyList.set(0, pharmacy);
		}
	}

	@Override
	public List<Pharmacy> getPharmacyList() {
		return pharmacyList;
	}

	@Override
	public void setPharmacyList(List<Pharmacy> pharmacyList) {
		this.pharmacyList = pharmacyList;
	}

	@Override
	public boolean hasPharmacy() {
		return pharmacyList != null && pharmacyList.size() > 0 && pharmacyList.get(0) != null;
	}

	public ITEM_REVIEWED(Photograph photograph) {
		photographList = new ArrayList<Photograph>();
		photographList.add(photograph);
	}

	@Override
	public Photograph getPhotograph() {
		if(photographList != null && photographList.size() > 0) {
			return photographList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhotograph(Photograph photograph) {
		if(photographList == null) {
			photographList = new ArrayList<>();
		}
		if(photographList.size() == 0) {
			photographList.add(photograph);
		} else {
			photographList.set(0, photograph);
		}
	}

	@Override
	public List<Photograph> getPhotographList() {
		return photographList;
	}

	@Override
	public void setPhotographList(List<Photograph> photographList) {
		this.photographList = photographList;
	}

	@Override
	public boolean hasPhotograph() {
		return photographList != null && photographList.size() > 0 && photographList.get(0) != null;
	}

	public ITEM_REVIEWED(PhotographAction photographAction) {
		photographActionList = new ArrayList<PhotographAction>();
		photographActionList.add(photographAction);
	}

	@Override
	public PhotographAction getPhotographAction() {
		if(photographActionList != null && photographActionList.size() > 0) {
			return photographActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhotographAction(PhotographAction photographAction) {
		if(photographActionList == null) {
			photographActionList = new ArrayList<>();
		}
		if(photographActionList.size() == 0) {
			photographActionList.add(photographAction);
		} else {
			photographActionList.set(0, photographAction);
		}
	}

	@Override
	public List<PhotographAction> getPhotographActionList() {
		return photographActionList;
	}

	@Override
	public void setPhotographActionList(List<PhotographAction> photographActionList) {
		this.photographActionList = photographActionList;
	}

	@Override
	public boolean hasPhotographAction() {
		return photographActionList != null && photographActionList.size() > 0 && photographActionList.get(0) != null;
	}

	public ITEM_REVIEWED(PhysicalActivity physicalActivity) {
		physicalActivityList = new ArrayList<PhysicalActivity>();
		physicalActivityList.add(physicalActivity);
	}

	@Override
	public PhysicalActivity getPhysicalActivity() {
		if(physicalActivityList != null && physicalActivityList.size() > 0) {
			return physicalActivityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalActivity(PhysicalActivity physicalActivity) {
		if(physicalActivityList == null) {
			physicalActivityList = new ArrayList<>();
		}
		if(physicalActivityList.size() == 0) {
			physicalActivityList.add(physicalActivity);
		} else {
			physicalActivityList.set(0, physicalActivity);
		}
	}

	@Override
	public List<PhysicalActivity> getPhysicalActivityList() {
		return physicalActivityList;
	}

	@Override
	public void setPhysicalActivityList(List<PhysicalActivity> physicalActivityList) {
		this.physicalActivityList = physicalActivityList;
	}

	@Override
	public boolean hasPhysicalActivity() {
		return physicalActivityList != null && physicalActivityList.size() > 0 && physicalActivityList.get(0) != null;
	}

	public ITEM_REVIEWED(PhysicalActivityCategory physicalActivityCategory) {
		physicalActivityCategoryList = new ArrayList<PhysicalActivityCategory>();
		physicalActivityCategoryList.add(physicalActivityCategory);
	}

	@Override
	public PhysicalActivityCategory getPhysicalActivityCategory() {
		if(physicalActivityCategoryList != null && physicalActivityCategoryList.size() > 0) {
			return physicalActivityCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory) {
		if(physicalActivityCategoryList == null) {
			physicalActivityCategoryList = new ArrayList<>();
		}
		if(physicalActivityCategoryList.size() == 0) {
			physicalActivityCategoryList.add(physicalActivityCategory);
		} else {
			physicalActivityCategoryList.set(0, physicalActivityCategory);
		}
	}

	@Override
	public List<PhysicalActivityCategory> getPhysicalActivityCategoryList() {
		return physicalActivityCategoryList;
	}

	@Override
	public void setPhysicalActivityCategoryList(List<PhysicalActivityCategory> physicalActivityCategoryList) {
		this.physicalActivityCategoryList = physicalActivityCategoryList;
	}

	@Override
	public boolean hasPhysicalActivityCategory() {
		return physicalActivityCategoryList != null && physicalActivityCategoryList.size() > 0 && physicalActivityCategoryList.get(0) != null;
	}

	public ITEM_REVIEWED(PhysicalExam physicalExam) {
		physicalExamList = new ArrayList<PhysicalExam>();
		physicalExamList.add(physicalExam);
	}

	@Override
	public PhysicalExam getPhysicalExam() {
		if(physicalExamList != null && physicalExamList.size() > 0) {
			return physicalExamList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalExam(PhysicalExam physicalExam) {
		if(physicalExamList == null) {
			physicalExamList = new ArrayList<>();
		}
		if(physicalExamList.size() == 0) {
			physicalExamList.add(physicalExam);
		} else {
			physicalExamList.set(0, physicalExam);
		}
	}

	@Override
	public List<PhysicalExam> getPhysicalExamList() {
		return physicalExamList;
	}

	@Override
	public void setPhysicalExamList(List<PhysicalExam> physicalExamList) {
		this.physicalExamList = physicalExamList;
	}

	@Override
	public boolean hasPhysicalExam() {
		return physicalExamList != null && physicalExamList.size() > 0 && physicalExamList.get(0) != null;
	}

	public ITEM_REVIEWED(PhysicalTherapy physicalTherapy) {
		physicalTherapyList = new ArrayList<PhysicalTherapy>();
		physicalTherapyList.add(physicalTherapy);
	}

	@Override
	public PhysicalTherapy getPhysicalTherapy() {
		if(physicalTherapyList != null && physicalTherapyList.size() > 0) {
			return physicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalTherapy(PhysicalTherapy physicalTherapy) {
		if(physicalTherapyList == null) {
			physicalTherapyList = new ArrayList<>();
		}
		if(physicalTherapyList.size() == 0) {
			physicalTherapyList.add(physicalTherapy);
		} else {
			physicalTherapyList.set(0, physicalTherapy);
		}
	}

	@Override
	public List<PhysicalTherapy> getPhysicalTherapyList() {
		return physicalTherapyList;
	}

	@Override
	public void setPhysicalTherapyList(List<PhysicalTherapy> physicalTherapyList) {
		this.physicalTherapyList = physicalTherapyList;
	}

	@Override
	public boolean hasPhysicalTherapy() {
		return physicalTherapyList != null && physicalTherapyList.size() > 0 && physicalTherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(Physician physician) {
		physicianList = new ArrayList<Physician>();
		physicianList.add(physician);
	}

	@Override
	public Physician getPhysician() {
		if(physicianList != null && physicianList.size() > 0) {
			return physicianList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysician(Physician physician) {
		if(physicianList == null) {
			physicianList = new ArrayList<>();
		}
		if(physicianList.size() == 0) {
			physicianList.add(physician);
		} else {
			physicianList.set(0, physician);
		}
	}

	@Override
	public List<Physician> getPhysicianList() {
		return physicianList;
	}

	@Override
	public void setPhysicianList(List<Physician> physicianList) {
		this.physicianList = physicianList;
	}

	@Override
	public boolean hasPhysician() {
		return physicianList != null && physicianList.size() > 0 && physicianList.get(0) != null;
	}

	public ITEM_REVIEWED(Physiotherapy physiotherapy) {
		physiotherapyList = new ArrayList<Physiotherapy>();
		physiotherapyList.add(physiotherapy);
	}

	@Override
	public Physiotherapy getPhysiotherapy() {
		if(physiotherapyList != null && physiotherapyList.size() > 0) {
			return physiotherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysiotherapy(Physiotherapy physiotherapy) {
		if(physiotherapyList == null) {
			physiotherapyList = new ArrayList<>();
		}
		if(physiotherapyList.size() == 0) {
			physiotherapyList.add(physiotherapy);
		} else {
			physiotherapyList.set(0, physiotherapy);
		}
	}

	@Override
	public List<Physiotherapy> getPhysiotherapyList() {
		return physiotherapyList;
	}

	@Override
	public void setPhysiotherapyList(List<Physiotherapy> physiotherapyList) {
		this.physiotherapyList = physiotherapyList;
	}

	@Override
	public boolean hasPhysiotherapy() {
		return physiotherapyList != null && physiotherapyList.size() > 0 && physiotherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(Place place) {
		placeList = new ArrayList<Place>();
		placeList.add(place);
	}

	@Override
	public Place getPlace() {
		if(placeList != null && placeList.size() > 0) {
			return placeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlace(Place place) {
		if(placeList == null) {
			placeList = new ArrayList<>();
		}
		if(placeList.size() == 0) {
			placeList.add(place);
		} else {
			placeList.set(0, place);
		}
	}

	@Override
	public List<Place> getPlaceList() {
		return placeList;
	}

	@Override
	public void setPlaceList(List<Place> placeList) {
		this.placeList = placeList;
	}

	@Override
	public boolean hasPlace() {
		return placeList != null && placeList.size() > 0 && placeList.get(0) != null;
	}

	public ITEM_REVIEWED(PlaceOfWorship placeOfWorship) {
		placeOfWorshipList = new ArrayList<PlaceOfWorship>();
		placeOfWorshipList.add(placeOfWorship);
	}

	@Override
	public PlaceOfWorship getPlaceOfWorship() {
		if(placeOfWorshipList != null && placeOfWorshipList.size() > 0) {
			return placeOfWorshipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlaceOfWorship(PlaceOfWorship placeOfWorship) {
		if(placeOfWorshipList == null) {
			placeOfWorshipList = new ArrayList<>();
		}
		if(placeOfWorshipList.size() == 0) {
			placeOfWorshipList.add(placeOfWorship);
		} else {
			placeOfWorshipList.set(0, placeOfWorship);
		}
	}

	@Override
	public List<PlaceOfWorship> getPlaceOfWorshipList() {
		return placeOfWorshipList;
	}

	@Override
	public void setPlaceOfWorshipList(List<PlaceOfWorship> placeOfWorshipList) {
		this.placeOfWorshipList = placeOfWorshipList;
	}

	@Override
	public boolean hasPlaceOfWorship() {
		return placeOfWorshipList != null && placeOfWorshipList.size() > 0 && placeOfWorshipList.get(0) != null;
	}

	public ITEM_REVIEWED(PlanAction planAction) {
		planActionList = new ArrayList<PlanAction>();
		planActionList.add(planAction);
	}

	@Override
	public PlanAction getPlanAction() {
		if(planActionList != null && planActionList.size() > 0) {
			return planActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlanAction(PlanAction planAction) {
		if(planActionList == null) {
			planActionList = new ArrayList<>();
		}
		if(planActionList.size() == 0) {
			planActionList.add(planAction);
		} else {
			planActionList.set(0, planAction);
		}
	}

	@Override
	public List<PlanAction> getPlanActionList() {
		return planActionList;
	}

	@Override
	public void setPlanActionList(List<PlanAction> planActionList) {
		this.planActionList = planActionList;
	}

	@Override
	public boolean hasPlanAction() {
		return planActionList != null && planActionList.size() > 0 && planActionList.get(0) != null;
	}

	public ITEM_REVIEWED(PlasticSurgery plasticSurgery) {
		plasticSurgeryList = new ArrayList<PlasticSurgery>();
		plasticSurgeryList.add(plasticSurgery);
	}

	@Override
	public PlasticSurgery getPlasticSurgery() {
		if(plasticSurgeryList != null && plasticSurgeryList.size() > 0) {
			return plasticSurgeryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlasticSurgery(PlasticSurgery plasticSurgery) {
		if(plasticSurgeryList == null) {
			plasticSurgeryList = new ArrayList<>();
		}
		if(plasticSurgeryList.size() == 0) {
			plasticSurgeryList.add(plasticSurgery);
		} else {
			plasticSurgeryList.set(0, plasticSurgery);
		}
	}

	@Override
	public List<PlasticSurgery> getPlasticSurgeryList() {
		return plasticSurgeryList;
	}

	@Override
	public void setPlasticSurgeryList(List<PlasticSurgery> plasticSurgeryList) {
		this.plasticSurgeryList = plasticSurgeryList;
	}

	@Override
	public boolean hasPlasticSurgery() {
		return plasticSurgeryList != null && plasticSurgeryList.size() > 0 && plasticSurgeryList.get(0) != null;
	}

	public ITEM_REVIEWED(PlayAction playAction) {
		playActionList = new ArrayList<PlayAction>();
		playActionList.add(playAction);
	}

	@Override
	public PlayAction getPlayAction() {
		if(playActionList != null && playActionList.size() > 0) {
			return playActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlayAction(PlayAction playAction) {
		if(playActionList == null) {
			playActionList = new ArrayList<>();
		}
		if(playActionList.size() == 0) {
			playActionList.add(playAction);
		} else {
			playActionList.set(0, playAction);
		}
	}

	@Override
	public List<PlayAction> getPlayActionList() {
		return playActionList;
	}

	@Override
	public void setPlayActionList(List<PlayAction> playActionList) {
		this.playActionList = playActionList;
	}

	@Override
	public boolean hasPlayAction() {
		return playActionList != null && playActionList.size() > 0 && playActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Playground playground) {
		playgroundList = new ArrayList<Playground>();
		playgroundList.add(playground);
	}

	@Override
	public Playground getPlayground() {
		if(playgroundList != null && playgroundList.size() > 0) {
			return playgroundList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlayground(Playground playground) {
		if(playgroundList == null) {
			playgroundList = new ArrayList<>();
		}
		if(playgroundList.size() == 0) {
			playgroundList.add(playground);
		} else {
			playgroundList.set(0, playground);
		}
	}

	@Override
	public List<Playground> getPlaygroundList() {
		return playgroundList;
	}

	@Override
	public void setPlaygroundList(List<Playground> playgroundList) {
		this.playgroundList = playgroundList;
	}

	@Override
	public boolean hasPlayground() {
		return playgroundList != null && playgroundList.size() > 0 && playgroundList.get(0) != null;
	}

	public ITEM_REVIEWED(Plumber plumber) {
		plumberList = new ArrayList<Plumber>();
		plumberList.add(plumber);
	}

	@Override
	public Plumber getPlumber() {
		if(plumberList != null && plumberList.size() > 0) {
			return plumberList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlumber(Plumber plumber) {
		if(plumberList == null) {
			plumberList = new ArrayList<>();
		}
		if(plumberList.size() == 0) {
			plumberList.add(plumber);
		} else {
			plumberList.set(0, plumber);
		}
	}

	@Override
	public List<Plumber> getPlumberList() {
		return plumberList;
	}

	@Override
	public void setPlumberList(List<Plumber> plumberList) {
		this.plumberList = plumberList;
	}

	@Override
	public boolean hasPlumber() {
		return plumberList != null && plumberList.size() > 0 && plumberList.get(0) != null;
	}

	public ITEM_REVIEWED(Podiatric podiatric) {
		podiatricList = new ArrayList<Podiatric>();
		podiatricList.add(podiatric);
	}

	@Override
	public Podiatric getPodiatric() {
		if(podiatricList != null && podiatricList.size() > 0) {
			return podiatricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPodiatric(Podiatric podiatric) {
		if(podiatricList == null) {
			podiatricList = new ArrayList<>();
		}
		if(podiatricList.size() == 0) {
			podiatricList.add(podiatric);
		} else {
			podiatricList.set(0, podiatric);
		}
	}

	@Override
	public List<Podiatric> getPodiatricList() {
		return podiatricList;
	}

	@Override
	public void setPodiatricList(List<Podiatric> podiatricList) {
		this.podiatricList = podiatricList;
	}

	@Override
	public boolean hasPodiatric() {
		return podiatricList != null && podiatricList.size() > 0 && podiatricList.get(0) != null;
	}

	public ITEM_REVIEWED(PoliceStation policeStation) {
		policeStationList = new ArrayList<PoliceStation>();
		policeStationList.add(policeStation);
	}

	@Override
	public PoliceStation getPoliceStation() {
		if(policeStationList != null && policeStationList.size() > 0) {
			return policeStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPoliceStation(PoliceStation policeStation) {
		if(policeStationList == null) {
			policeStationList = new ArrayList<>();
		}
		if(policeStationList.size() == 0) {
			policeStationList.add(policeStation);
		} else {
			policeStationList.set(0, policeStation);
		}
	}

	@Override
	public List<PoliceStation> getPoliceStationList() {
		return policeStationList;
	}

	@Override
	public void setPoliceStationList(List<PoliceStation> policeStationList) {
		this.policeStationList = policeStationList;
	}

	@Override
	public boolean hasPoliceStation() {
		return policeStationList != null && policeStationList.size() > 0 && policeStationList.get(0) != null;
	}

	public ITEM_REVIEWED(Pond pond) {
		pondList = new ArrayList<Pond>();
		pondList.add(pond);
	}

	@Override
	public Pond getPond() {
		if(pondList != null && pondList.size() > 0) {
			return pondList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPond(Pond pond) {
		if(pondList == null) {
			pondList = new ArrayList<>();
		}
		if(pondList.size() == 0) {
			pondList.add(pond);
		} else {
			pondList.set(0, pond);
		}
	}

	@Override
	public List<Pond> getPondList() {
		return pondList;
	}

	@Override
	public void setPondList(List<Pond> pondList) {
		this.pondList = pondList;
	}

	@Override
	public boolean hasPond() {
		return pondList != null && pondList.size() > 0 && pondList.get(0) != null;
	}

	public ITEM_REVIEWED(PostOffice postOffice) {
		postOfficeList = new ArrayList<PostOffice>();
		postOfficeList.add(postOffice);
	}

	@Override
	public PostOffice getPostOffice() {
		if(postOfficeList != null && postOfficeList.size() > 0) {
			return postOfficeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPostOffice(PostOffice postOffice) {
		if(postOfficeList == null) {
			postOfficeList = new ArrayList<>();
		}
		if(postOfficeList.size() == 0) {
			postOfficeList.add(postOffice);
		} else {
			postOfficeList.set(0, postOffice);
		}
	}

	@Override
	public List<PostOffice> getPostOfficeList() {
		return postOfficeList;
	}

	@Override
	public void setPostOfficeList(List<PostOffice> postOfficeList) {
		this.postOfficeList = postOfficeList;
	}

	@Override
	public boolean hasPostOffice() {
		return postOfficeList != null && postOfficeList.size() > 0 && postOfficeList.get(0) != null;
	}

	public ITEM_REVIEWED(PostalAddress postalAddress) {
		postalAddressList = new ArrayList<PostalAddress>();
		postalAddressList.add(postalAddress);
	}

	@Override
	public PostalAddress getPostalAddress() {
		if(postalAddressList != null && postalAddressList.size() > 0) {
			return postalAddressList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPostalAddress(PostalAddress postalAddress) {
		if(postalAddressList == null) {
			postalAddressList = new ArrayList<>();
		}
		if(postalAddressList.size() == 0) {
			postalAddressList.add(postalAddress);
		} else {
			postalAddressList.set(0, postalAddress);
		}
	}

	@Override
	public List<PostalAddress> getPostalAddressList() {
		return postalAddressList;
	}

	@Override
	public void setPostalAddressList(List<PostalAddress> postalAddressList) {
		this.postalAddressList = postalAddressList;
	}

	@Override
	public boolean hasPostalAddress() {
		return postalAddressList != null && postalAddressList.size() > 0 && postalAddressList.get(0) != null;
	}

	public ITEM_REVIEWED(PreOrderAction preOrderAction) {
		preOrderActionList = new ArrayList<PreOrderAction>();
		preOrderActionList.add(preOrderAction);
	}

	@Override
	public PreOrderAction getPreOrderAction() {
		if(preOrderActionList != null && preOrderActionList.size() > 0) {
			return preOrderActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreOrderAction(PreOrderAction preOrderAction) {
		if(preOrderActionList == null) {
			preOrderActionList = new ArrayList<>();
		}
		if(preOrderActionList.size() == 0) {
			preOrderActionList.add(preOrderAction);
		} else {
			preOrderActionList.set(0, preOrderAction);
		}
	}

	@Override
	public List<PreOrderAction> getPreOrderActionList() {
		return preOrderActionList;
	}

	@Override
	public void setPreOrderActionList(List<PreOrderAction> preOrderActionList) {
		this.preOrderActionList = preOrderActionList;
	}

	@Override
	public boolean hasPreOrderAction() {
		return preOrderActionList != null && preOrderActionList.size() > 0 && preOrderActionList.get(0) != null;
	}

	public ITEM_REVIEWED(PrependAction prependAction) {
		prependActionList = new ArrayList<PrependAction>();
		prependActionList.add(prependAction);
	}

	@Override
	public PrependAction getPrependAction() {
		if(prependActionList != null && prependActionList.size() > 0) {
			return prependActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPrependAction(PrependAction prependAction) {
		if(prependActionList == null) {
			prependActionList = new ArrayList<>();
		}
		if(prependActionList.size() == 0) {
			prependActionList.add(prependAction);
		} else {
			prependActionList.set(0, prependAction);
		}
	}

	@Override
	public List<PrependAction> getPrependActionList() {
		return prependActionList;
	}

	@Override
	public void setPrependActionList(List<PrependAction> prependActionList) {
		this.prependActionList = prependActionList;
	}

	@Override
	public boolean hasPrependAction() {
		return prependActionList != null && prependActionList.size() > 0 && prependActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Preschool preschool) {
		preschoolList = new ArrayList<Preschool>();
		preschoolList.add(preschool);
	}

	@Override
	public Preschool getPreschool() {
		if(preschoolList != null && preschoolList.size() > 0) {
			return preschoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreschool(Preschool preschool) {
		if(preschoolList == null) {
			preschoolList = new ArrayList<>();
		}
		if(preschoolList.size() == 0) {
			preschoolList.add(preschool);
		} else {
			preschoolList.set(0, preschool);
		}
	}

	@Override
	public List<Preschool> getPreschoolList() {
		return preschoolList;
	}

	@Override
	public void setPreschoolList(List<Preschool> preschoolList) {
		this.preschoolList = preschoolList;
	}

	@Override
	public boolean hasPreschool() {
		return preschoolList != null && preschoolList.size() > 0 && preschoolList.get(0) != null;
	}

	public ITEM_REVIEWED(PresentationDigitalDocument presentationDigitalDocument) {
		presentationDigitalDocumentList = new ArrayList<PresentationDigitalDocument>();
		presentationDigitalDocumentList.add(presentationDigitalDocument);
	}

	@Override
	public PresentationDigitalDocument getPresentationDigitalDocument() {
		if(presentationDigitalDocumentList != null && presentationDigitalDocumentList.size() > 0) {
			return presentationDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPresentationDigitalDocument(PresentationDigitalDocument presentationDigitalDocument) {
		if(presentationDigitalDocumentList == null) {
			presentationDigitalDocumentList = new ArrayList<>();
		}
		if(presentationDigitalDocumentList.size() == 0) {
			presentationDigitalDocumentList.add(presentationDigitalDocument);
		} else {
			presentationDigitalDocumentList.set(0, presentationDigitalDocument);
		}
	}

	@Override
	public List<PresentationDigitalDocument> getPresentationDigitalDocumentList() {
		return presentationDigitalDocumentList;
	}

	@Override
	public void setPresentationDigitalDocumentList(List<PresentationDigitalDocument> presentationDigitalDocumentList) {
		this.presentationDigitalDocumentList = presentationDigitalDocumentList;
	}

	@Override
	public boolean hasPresentationDigitalDocument() {
		return presentationDigitalDocumentList != null && presentationDigitalDocumentList.size() > 0 && presentationDigitalDocumentList.get(0) != null;
	}

	public ITEM_REVIEWED(PreventionIndication preventionIndication) {
		preventionIndicationList = new ArrayList<PreventionIndication>();
		preventionIndicationList.add(preventionIndication);
	}

	@Override
	public PreventionIndication getPreventionIndication() {
		if(preventionIndicationList != null && preventionIndicationList.size() > 0) {
			return preventionIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreventionIndication(PreventionIndication preventionIndication) {
		if(preventionIndicationList == null) {
			preventionIndicationList = new ArrayList<>();
		}
		if(preventionIndicationList.size() == 0) {
			preventionIndicationList.add(preventionIndication);
		} else {
			preventionIndicationList.set(0, preventionIndication);
		}
	}

	@Override
	public List<PreventionIndication> getPreventionIndicationList() {
		return preventionIndicationList;
	}

	@Override
	public void setPreventionIndicationList(List<PreventionIndication> preventionIndicationList) {
		this.preventionIndicationList = preventionIndicationList;
	}

	@Override
	public boolean hasPreventionIndication() {
		return preventionIndicationList != null && preventionIndicationList.size() > 0 && preventionIndicationList.get(0) != null;
	}

	public ITEM_REVIEWED(PriceSpecification priceSpecification) {
		priceSpecificationList = new ArrayList<PriceSpecification>();
		priceSpecificationList.add(priceSpecification);
	}

	@Override
	public PriceSpecification getPriceSpecification() {
		if(priceSpecificationList != null && priceSpecificationList.size() > 0) {
			return priceSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		if(priceSpecificationList == null) {
			priceSpecificationList = new ArrayList<>();
		}
		if(priceSpecificationList.size() == 0) {
			priceSpecificationList.add(priceSpecification);
		} else {
			priceSpecificationList.set(0, priceSpecification);
		}
	}

	@Override
	public List<PriceSpecification> getPriceSpecificationList() {
		return priceSpecificationList;
	}

	@Override
	public void setPriceSpecificationList(List<PriceSpecification> priceSpecificationList) {
		this.priceSpecificationList = priceSpecificationList;
	}

	@Override
	public boolean hasPriceSpecification() {
		return priceSpecificationList != null && priceSpecificationList.size() > 0 && priceSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(PrimaryCare primaryCare) {
		primaryCareList = new ArrayList<PrimaryCare>();
		primaryCareList.add(primaryCare);
	}

	@Override
	public PrimaryCare getPrimaryCare() {
		if(primaryCareList != null && primaryCareList.size() > 0) {
			return primaryCareList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPrimaryCare(PrimaryCare primaryCare) {
		if(primaryCareList == null) {
			primaryCareList = new ArrayList<>();
		}
		if(primaryCareList.size() == 0) {
			primaryCareList.add(primaryCare);
		} else {
			primaryCareList.set(0, primaryCare);
		}
	}

	@Override
	public List<PrimaryCare> getPrimaryCareList() {
		return primaryCareList;
	}

	@Override
	public void setPrimaryCareList(List<PrimaryCare> primaryCareList) {
		this.primaryCareList = primaryCareList;
	}

	@Override
	public boolean hasPrimaryCare() {
		return primaryCareList != null && primaryCareList.size() > 0 && primaryCareList.get(0) != null;
	}

	public ITEM_REVIEWED(Product product) {
		productList = new ArrayList<Product>();
		productList.add(product);
	}

	@Override
	public Product getProduct() {
		if(productList != null && productList.size() > 0) {
			return productList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProduct(Product product) {
		if(productList == null) {
			productList = new ArrayList<>();
		}
		if(productList.size() == 0) {
			productList.add(product);
		} else {
			productList.set(0, product);
		}
	}

	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public boolean hasProduct() {
		return productList != null && productList.size() > 0 && productList.get(0) != null;
	}

	public ITEM_REVIEWED(ProductModel productModel) {
		productModelList = new ArrayList<ProductModel>();
		productModelList.add(productModel);
	}

	@Override
	public ProductModel getProductModel() {
		if(productModelList != null && productModelList.size() > 0) {
			return productModelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProductModel(ProductModel productModel) {
		if(productModelList == null) {
			productModelList = new ArrayList<>();
		}
		if(productModelList.size() == 0) {
			productModelList.add(productModel);
		} else {
			productModelList.set(0, productModel);
		}
	}

	@Override
	public List<ProductModel> getProductModelList() {
		return productModelList;
	}

	@Override
	public void setProductModelList(List<ProductModel> productModelList) {
		this.productModelList = productModelList;
	}

	@Override
	public boolean hasProductModel() {
		return productModelList != null && productModelList.size() > 0 && productModelList.get(0) != null;
	}

	public ITEM_REVIEWED(ProfessionalService professionalService) {
		professionalServiceList = new ArrayList<ProfessionalService>();
		professionalServiceList.add(professionalService);
	}

	@Override
	public ProfessionalService getProfessionalService() {
		if(professionalServiceList != null && professionalServiceList.size() > 0) {
			return professionalServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProfessionalService(ProfessionalService professionalService) {
		if(professionalServiceList == null) {
			professionalServiceList = new ArrayList<>();
		}
		if(professionalServiceList.size() == 0) {
			professionalServiceList.add(professionalService);
		} else {
			professionalServiceList.set(0, professionalService);
		}
	}

	@Override
	public List<ProfessionalService> getProfessionalServiceList() {
		return professionalServiceList;
	}

	@Override
	public void setProfessionalServiceList(List<ProfessionalService> professionalServiceList) {
		this.professionalServiceList = professionalServiceList;
	}

	@Override
	public boolean hasProfessionalService() {
		return professionalServiceList != null && professionalServiceList.size() > 0 && professionalServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(ProfilePage profilePage) {
		profilePageList = new ArrayList<ProfilePage>();
		profilePageList.add(profilePage);
	}

	@Override
	public ProfilePage getProfilePage() {
		if(profilePageList != null && profilePageList.size() > 0) {
			return profilePageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProfilePage(ProfilePage profilePage) {
		if(profilePageList == null) {
			profilePageList = new ArrayList<>();
		}
		if(profilePageList.size() == 0) {
			profilePageList.add(profilePage);
		} else {
			profilePageList.set(0, profilePage);
		}
	}

	@Override
	public List<ProfilePage> getProfilePageList() {
		return profilePageList;
	}

	@Override
	public void setProfilePageList(List<ProfilePage> profilePageList) {
		this.profilePageList = profilePageList;
	}

	@Override
	public boolean hasProfilePage() {
		return profilePageList != null && profilePageList.size() > 0 && profilePageList.get(0) != null;
	}

	public ITEM_REVIEWED(ProgramMembership programMembership) {
		programMembershipList = new ArrayList<ProgramMembership>();
		programMembershipList.add(programMembership);
	}

	@Override
	public ProgramMembership getProgramMembership() {
		if(programMembershipList != null && programMembershipList.size() > 0) {
			return programMembershipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProgramMembership(ProgramMembership programMembership) {
		if(programMembershipList == null) {
			programMembershipList = new ArrayList<>();
		}
		if(programMembershipList.size() == 0) {
			programMembershipList.add(programMembership);
		} else {
			programMembershipList.set(0, programMembership);
		}
	}

	@Override
	public List<ProgramMembership> getProgramMembershipList() {
		return programMembershipList;
	}

	@Override
	public void setProgramMembershipList(List<ProgramMembership> programMembershipList) {
		this.programMembershipList = programMembershipList;
	}

	@Override
	public boolean hasProgramMembership() {
		return programMembershipList != null && programMembershipList.size() > 0 && programMembershipList.get(0) != null;
	}

	public ITEM_REVIEWED(Property property) {
		propertyList = new ArrayList<Property>();
		propertyList.add(property);
	}

	@Override
	public Property getProperty() {
		if(propertyList != null && propertyList.size() > 0) {
			return propertyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProperty(Property property) {
		if(propertyList == null) {
			propertyList = new ArrayList<>();
		}
		if(propertyList.size() == 0) {
			propertyList.add(property);
		} else {
			propertyList.set(0, property);
		}
	}

	@Override
	public List<Property> getPropertyList() {
		return propertyList;
	}

	@Override
	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}

	@Override
	public boolean hasProperty() {
		return propertyList != null && propertyList.size() > 0 && propertyList.get(0) != null;
	}

	public ITEM_REVIEWED(PropertyValue propertyValue) {
		propertyValueList = new ArrayList<PropertyValue>();
		propertyValueList.add(propertyValue);
	}

	@Override
	public PropertyValue getPropertyValue() {
		if(propertyValueList != null && propertyValueList.size() > 0) {
			return propertyValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPropertyValue(PropertyValue propertyValue) {
		if(propertyValueList == null) {
			propertyValueList = new ArrayList<>();
		}
		if(propertyValueList.size() == 0) {
			propertyValueList.add(propertyValue);
		} else {
			propertyValueList.set(0, propertyValue);
		}
	}

	@Override
	public List<PropertyValue> getPropertyValueList() {
		return propertyValueList;
	}

	@Override
	public void setPropertyValueList(List<PropertyValue> propertyValueList) {
		this.propertyValueList = propertyValueList;
	}

	@Override
	public boolean hasPropertyValue() {
		return propertyValueList != null && propertyValueList.size() > 0 && propertyValueList.get(0) != null;
	}

	public ITEM_REVIEWED(PropertyValueSpecification propertyValueSpecification) {
		propertyValueSpecificationList = new ArrayList<PropertyValueSpecification>();
		propertyValueSpecificationList.add(propertyValueSpecification);
	}

	@Override
	public PropertyValueSpecification getPropertyValueSpecification() {
		if(propertyValueSpecificationList != null && propertyValueSpecificationList.size() > 0) {
			return propertyValueSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPropertyValueSpecification(PropertyValueSpecification propertyValueSpecification) {
		if(propertyValueSpecificationList == null) {
			propertyValueSpecificationList = new ArrayList<>();
		}
		if(propertyValueSpecificationList.size() == 0) {
			propertyValueSpecificationList.add(propertyValueSpecification);
		} else {
			propertyValueSpecificationList.set(0, propertyValueSpecification);
		}
	}

	@Override
	public List<PropertyValueSpecification> getPropertyValueSpecificationList() {
		return propertyValueSpecificationList;
	}

	@Override
	public void setPropertyValueSpecificationList(List<PropertyValueSpecification> propertyValueSpecificationList) {
		this.propertyValueSpecificationList = propertyValueSpecificationList;
	}

	@Override
	public boolean hasPropertyValueSpecification() {
		return propertyValueSpecificationList != null && propertyValueSpecificationList.size() > 0 && propertyValueSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(Psychiatric psychiatric) {
		psychiatricList = new ArrayList<Psychiatric>();
		psychiatricList.add(psychiatric);
	}

	@Override
	public Psychiatric getPsychiatric() {
		if(psychiatricList != null && psychiatricList.size() > 0) {
			return psychiatricList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPsychiatric(Psychiatric psychiatric) {
		if(psychiatricList == null) {
			psychiatricList = new ArrayList<>();
		}
		if(psychiatricList.size() == 0) {
			psychiatricList.add(psychiatric);
		} else {
			psychiatricList.set(0, psychiatric);
		}
	}

	@Override
	public List<Psychiatric> getPsychiatricList() {
		return psychiatricList;
	}

	@Override
	public void setPsychiatricList(List<Psychiatric> psychiatricList) {
		this.psychiatricList = psychiatricList;
	}

	@Override
	public boolean hasPsychiatric() {
		return psychiatricList != null && psychiatricList.size() > 0 && psychiatricList.get(0) != null;
	}

	public ITEM_REVIEWED(PsychologicalTreatment psychologicalTreatment) {
		psychologicalTreatmentList = new ArrayList<PsychologicalTreatment>();
		psychologicalTreatmentList.add(psychologicalTreatment);
	}

	@Override
	public PsychologicalTreatment getPsychologicalTreatment() {
		if(psychologicalTreatmentList != null && psychologicalTreatmentList.size() > 0) {
			return psychologicalTreatmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPsychologicalTreatment(PsychologicalTreatment psychologicalTreatment) {
		if(psychologicalTreatmentList == null) {
			psychologicalTreatmentList = new ArrayList<>();
		}
		if(psychologicalTreatmentList.size() == 0) {
			psychologicalTreatmentList.add(psychologicalTreatment);
		} else {
			psychologicalTreatmentList.set(0, psychologicalTreatment);
		}
	}

	@Override
	public List<PsychologicalTreatment> getPsychologicalTreatmentList() {
		return psychologicalTreatmentList;
	}

	@Override
	public void setPsychologicalTreatmentList(List<PsychologicalTreatment> psychologicalTreatmentList) {
		this.psychologicalTreatmentList = psychologicalTreatmentList;
	}

	@Override
	public boolean hasPsychologicalTreatment() {
		return psychologicalTreatmentList != null && psychologicalTreatmentList.size() > 0 && psychologicalTreatmentList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicHealth publicHealth) {
		publicHealthList = new ArrayList<PublicHealth>();
		publicHealthList.add(publicHealth);
	}

	@Override
	public PublicHealth getPublicHealth() {
		if(publicHealthList != null && publicHealthList.size() > 0) {
			return publicHealthList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicHealth(PublicHealth publicHealth) {
		if(publicHealthList == null) {
			publicHealthList = new ArrayList<>();
		}
		if(publicHealthList.size() == 0) {
			publicHealthList.add(publicHealth);
		} else {
			publicHealthList.set(0, publicHealth);
		}
	}

	@Override
	public List<PublicHealth> getPublicHealthList() {
		return publicHealthList;
	}

	@Override
	public void setPublicHealthList(List<PublicHealth> publicHealthList) {
		this.publicHealthList = publicHealthList;
	}

	@Override
	public boolean hasPublicHealth() {
		return publicHealthList != null && publicHealthList.size() > 0 && publicHealthList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicSwimmingPool publicSwimmingPool) {
		publicSwimmingPoolList = new ArrayList<PublicSwimmingPool>();
		publicSwimmingPoolList.add(publicSwimmingPool);
	}

	@Override
	public PublicSwimmingPool getPublicSwimmingPool() {
		if(publicSwimmingPoolList != null && publicSwimmingPoolList.size() > 0) {
			return publicSwimmingPoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicSwimmingPool(PublicSwimmingPool publicSwimmingPool) {
		if(publicSwimmingPoolList == null) {
			publicSwimmingPoolList = new ArrayList<>();
		}
		if(publicSwimmingPoolList.size() == 0) {
			publicSwimmingPoolList.add(publicSwimmingPool);
		} else {
			publicSwimmingPoolList.set(0, publicSwimmingPool);
		}
	}

	@Override
	public List<PublicSwimmingPool> getPublicSwimmingPoolList() {
		return publicSwimmingPoolList;
	}

	@Override
	public void setPublicSwimmingPoolList(List<PublicSwimmingPool> publicSwimmingPoolList) {
		this.publicSwimmingPoolList = publicSwimmingPoolList;
	}

	@Override
	public boolean hasPublicSwimmingPool() {
		return publicSwimmingPoolList != null && publicSwimmingPoolList.size() > 0 && publicSwimmingPoolList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicToilet publicToilet) {
		publicToiletList = new ArrayList<PublicToilet>();
		publicToiletList.add(publicToilet);
	}

	@Override
	public PublicToilet getPublicToilet() {
		if(publicToiletList != null && publicToiletList.size() > 0) {
			return publicToiletList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicToilet(PublicToilet publicToilet) {
		if(publicToiletList == null) {
			publicToiletList = new ArrayList<>();
		}
		if(publicToiletList.size() == 0) {
			publicToiletList.add(publicToilet);
		} else {
			publicToiletList.set(0, publicToilet);
		}
	}

	@Override
	public List<PublicToilet> getPublicToiletList() {
		return publicToiletList;
	}

	@Override
	public void setPublicToiletList(List<PublicToilet> publicToiletList) {
		this.publicToiletList = publicToiletList;
	}

	@Override
	public boolean hasPublicToilet() {
		return publicToiletList != null && publicToiletList.size() > 0 && publicToiletList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicationEvent publicationEvent) {
		publicationEventList = new ArrayList<PublicationEvent>();
		publicationEventList.add(publicationEvent);
	}

	@Override
	public PublicationEvent getPublicationEvent() {
		if(publicationEventList != null && publicationEventList.size() > 0) {
			return publicationEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationEvent(PublicationEvent publicationEvent) {
		if(publicationEventList == null) {
			publicationEventList = new ArrayList<>();
		}
		if(publicationEventList.size() == 0) {
			publicationEventList.add(publicationEvent);
		} else {
			publicationEventList.set(0, publicationEvent);
		}
	}

	@Override
	public List<PublicationEvent> getPublicationEventList() {
		return publicationEventList;
	}

	@Override
	public void setPublicationEventList(List<PublicationEvent> publicationEventList) {
		this.publicationEventList = publicationEventList;
	}

	@Override
	public boolean hasPublicationEvent() {
		return publicationEventList != null && publicationEventList.size() > 0 && publicationEventList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicationIssue publicationIssue) {
		publicationIssueList = new ArrayList<PublicationIssue>();
		publicationIssueList.add(publicationIssue);
	}

	@Override
	public PublicationIssue getPublicationIssue() {
		if(publicationIssueList != null && publicationIssueList.size() > 0) {
			return publicationIssueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationIssue(PublicationIssue publicationIssue) {
		if(publicationIssueList == null) {
			publicationIssueList = new ArrayList<>();
		}
		if(publicationIssueList.size() == 0) {
			publicationIssueList.add(publicationIssue);
		} else {
			publicationIssueList.set(0, publicationIssue);
		}
	}

	@Override
	public List<PublicationIssue> getPublicationIssueList() {
		return publicationIssueList;
	}

	@Override
	public void setPublicationIssueList(List<PublicationIssue> publicationIssueList) {
		this.publicationIssueList = publicationIssueList;
	}

	@Override
	public boolean hasPublicationIssue() {
		return publicationIssueList != null && publicationIssueList.size() > 0 && publicationIssueList.get(0) != null;
	}

	public ITEM_REVIEWED(PublicationVolume publicationVolume) {
		publicationVolumeList = new ArrayList<PublicationVolume>();
		publicationVolumeList.add(publicationVolume);
	}

	@Override
	public PublicationVolume getPublicationVolume() {
		if(publicationVolumeList != null && publicationVolumeList.size() > 0) {
			return publicationVolumeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationVolume(PublicationVolume publicationVolume) {
		if(publicationVolumeList == null) {
			publicationVolumeList = new ArrayList<>();
		}
		if(publicationVolumeList.size() == 0) {
			publicationVolumeList.add(publicationVolume);
		} else {
			publicationVolumeList.set(0, publicationVolume);
		}
	}

	@Override
	public List<PublicationVolume> getPublicationVolumeList() {
		return publicationVolumeList;
	}

	@Override
	public void setPublicationVolumeList(List<PublicationVolume> publicationVolumeList) {
		this.publicationVolumeList = publicationVolumeList;
	}

	@Override
	public boolean hasPublicationVolume() {
		return publicationVolumeList != null && publicationVolumeList.size() > 0 && publicationVolumeList.get(0) != null;
	}

	public ITEM_REVIEWED(QAPage qaPage) {
		qaPageList = new ArrayList<QAPage>();
		qaPageList.add(qaPage);
	}

	@Override
	public QAPage getQAPage() {
		if(qaPageList != null && qaPageList.size() > 0) {
			return qaPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQAPage(QAPage qaPage) {
		if(qaPageList == null) {
			qaPageList = new ArrayList<>();
		}
		if(qaPageList.size() == 0) {
			qaPageList.add(qaPage);
		} else {
			qaPageList.set(0, qaPage);
		}
	}

	@Override
	public List<QAPage> getQAPageList() {
		return qaPageList;
	}

	@Override
	public void setQAPageList(List<QAPage> qaPageList) {
		this.qaPageList = qaPageList;
	}

	@Override
	public boolean hasQAPage() {
		return qaPageList != null && qaPageList.size() > 0 && qaPageList.get(0) != null;
	}

	public ITEM_REVIEWED(QualitativeValue qualitativeValue) {
		qualitativeValueList = new ArrayList<QualitativeValue>();
		qualitativeValueList.add(qualitativeValue);
	}

	@Override
	public QualitativeValue getQualitativeValue() {
		if(qualitativeValueList != null && qualitativeValueList.size() > 0) {
			return qualitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQualitativeValue(QualitativeValue qualitativeValue) {
		if(qualitativeValueList == null) {
			qualitativeValueList = new ArrayList<>();
		}
		if(qualitativeValueList.size() == 0) {
			qualitativeValueList.add(qualitativeValue);
		} else {
			qualitativeValueList.set(0, qualitativeValue);
		}
	}

	@Override
	public List<QualitativeValue> getQualitativeValueList() {
		return qualitativeValueList;
	}

	@Override
	public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList) {
		this.qualitativeValueList = qualitativeValueList;
	}

	@Override
	public boolean hasQualitativeValue() {
		return qualitativeValueList != null && qualitativeValueList.size() > 0 && qualitativeValueList.get(0) != null;
	}

	public ITEM_REVIEWED(QuantitativeValue quantitativeValue) {
		quantitativeValueList = new ArrayList<QuantitativeValue>();
		quantitativeValueList.add(quantitativeValue);
	}

	@Override
	public QuantitativeValue getQuantitativeValue() {
		if(quantitativeValueList != null && quantitativeValueList.size() > 0) {
			return quantitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValue(QuantitativeValue quantitativeValue) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(quantitativeValue);
		} else {
			quantitativeValueList.set(0, quantitativeValue);
		}
	}

	@Override
	public List<QuantitativeValue> getQuantitativeValueList() {
		return quantitativeValueList;
	}

	@Override
	public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList) {
		this.quantitativeValueList = quantitativeValueList;
	}

	@Override
	public boolean hasQuantitativeValue() {
		return quantitativeValueList != null && quantitativeValueList.size() > 0 && quantitativeValueList.get(0) != null;
	}

	public ITEM_REVIEWED(QuantitativeValueDistribution quantitativeValueDistribution) {
		quantitativeValueDistributionList = new ArrayList<QuantitativeValueDistribution>();
		quantitativeValueDistributionList.add(quantitativeValueDistribution);
	}

	@Override
	public QuantitativeValueDistribution getQuantitativeValueDistribution() {
		if(quantitativeValueDistributionList != null && quantitativeValueDistributionList.size() > 0) {
			return quantitativeValueDistributionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValueDistribution(QuantitativeValueDistribution quantitativeValueDistribution) {
		if(quantitativeValueDistributionList == null) {
			quantitativeValueDistributionList = new ArrayList<>();
		}
		if(quantitativeValueDistributionList.size() == 0) {
			quantitativeValueDistributionList.add(quantitativeValueDistribution);
		} else {
			quantitativeValueDistributionList.set(0, quantitativeValueDistribution);
		}
	}

	@Override
	public List<QuantitativeValueDistribution> getQuantitativeValueDistributionList() {
		return quantitativeValueDistributionList;
	}

	@Override
	public void setQuantitativeValueDistributionList(List<QuantitativeValueDistribution> quantitativeValueDistributionList) {
		this.quantitativeValueDistributionList = quantitativeValueDistributionList;
	}

	@Override
	public boolean hasQuantitativeValueDistribution() {
		return quantitativeValueDistributionList != null && quantitativeValueDistributionList.size() > 0 && quantitativeValueDistributionList.get(0) != null;
	}

	public ITEM_REVIEWED(Quantity quantity) {
		quantityList = new ArrayList<Quantity>();
		quantityList.add(quantity);
	}

	@Override
	public Quantity getQuantity() {
		if(quantityList != null && quantityList.size() > 0) {
			return quantityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantity(Quantity quantity) {
		if(quantityList == null) {
			quantityList = new ArrayList<>();
		}
		if(quantityList.size() == 0) {
			quantityList.add(quantity);
		} else {
			quantityList.set(0, quantity);
		}
	}

	@Override
	public List<Quantity> getQuantityList() {
		return quantityList;
	}

	@Override
	public void setQuantityList(List<Quantity> quantityList) {
		this.quantityList = quantityList;
	}

	@Override
	public boolean hasQuantity() {
		return quantityList != null && quantityList.size() > 0 && quantityList.get(0) != null;
	}

	public ITEM_REVIEWED(Question question) {
		questionList = new ArrayList<Question>();
		questionList.add(question);
	}

	@Override
	public Question getQuestion() {
		if(questionList != null && questionList.size() > 0) {
			return questionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuestion(Question question) {
		if(questionList == null) {
			questionList = new ArrayList<>();
		}
		if(questionList.size() == 0) {
			questionList.add(question);
		} else {
			questionList.set(0, question);
		}
	}

	@Override
	public List<Question> getQuestionList() {
		return questionList;
	}

	@Override
	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	@Override
	public boolean hasQuestion() {
		return questionList != null && questionList.size() > 0 && questionList.get(0) != null;
	}

	public ITEM_REVIEWED(Quotation quotation) {
		quotationList = new ArrayList<Quotation>();
		quotationList.add(quotation);
	}

	@Override
	public Quotation getQuotation() {
		if(quotationList != null && quotationList.size() > 0) {
			return quotationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuotation(Quotation quotation) {
		if(quotationList == null) {
			quotationList = new ArrayList<>();
		}
		if(quotationList.size() == 0) {
			quotationList.add(quotation);
		} else {
			quotationList.set(0, quotation);
		}
	}

	@Override
	public List<Quotation> getQuotationList() {
		return quotationList;
	}

	@Override
	public void setQuotationList(List<Quotation> quotationList) {
		this.quotationList = quotationList;
	}

	@Override
	public boolean hasQuotation() {
		return quotationList != null && quotationList.size() > 0 && quotationList.get(0) != null;
	}

	public ITEM_REVIEWED(QuoteAction quoteAction) {
		quoteActionList = new ArrayList<QuoteAction>();
		quoteActionList.add(quoteAction);
	}

	@Override
	public QuoteAction getQuoteAction() {
		if(quoteActionList != null && quoteActionList.size() > 0) {
			return quoteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuoteAction(QuoteAction quoteAction) {
		if(quoteActionList == null) {
			quoteActionList = new ArrayList<>();
		}
		if(quoteActionList.size() == 0) {
			quoteActionList.add(quoteAction);
		} else {
			quoteActionList.set(0, quoteAction);
		}
	}

	@Override
	public List<QuoteAction> getQuoteActionList() {
		return quoteActionList;
	}

	@Override
	public void setQuoteActionList(List<QuoteAction> quoteActionList) {
		this.quoteActionList = quoteActionList;
	}

	@Override
	public boolean hasQuoteAction() {
		return quoteActionList != null && quoteActionList.size() > 0 && quoteActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RVPark rvPark) {
		rvParkList = new ArrayList<RVPark>();
		rvParkList.add(rvPark);
	}

	@Override
	public RVPark getRVPark() {
		if(rvParkList != null && rvParkList.size() > 0) {
			return rvParkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRVPark(RVPark rvPark) {
		if(rvParkList == null) {
			rvParkList = new ArrayList<>();
		}
		if(rvParkList.size() == 0) {
			rvParkList.add(rvPark);
		} else {
			rvParkList.set(0, rvPark);
		}
	}

	@Override
	public List<RVPark> getRVParkList() {
		return rvParkList;
	}

	@Override
	public void setRVParkList(List<RVPark> rvParkList) {
		this.rvParkList = rvParkList;
	}

	@Override
	public boolean hasRVPark() {
		return rvParkList != null && rvParkList.size() > 0 && rvParkList.get(0) != null;
	}

	public ITEM_REVIEWED(RadiationTherapy radiationTherapy) {
		radiationTherapyList = new ArrayList<RadiationTherapy>();
		radiationTherapyList.add(radiationTherapy);
	}

	@Override
	public RadiationTherapy getRadiationTherapy() {
		if(radiationTherapyList != null && radiationTherapyList.size() > 0) {
			return radiationTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadiationTherapy(RadiationTherapy radiationTherapy) {
		if(radiationTherapyList == null) {
			radiationTherapyList = new ArrayList<>();
		}
		if(radiationTherapyList.size() == 0) {
			radiationTherapyList.add(radiationTherapy);
		} else {
			radiationTherapyList.set(0, radiationTherapy);
		}
	}

	@Override
	public List<RadiationTherapy> getRadiationTherapyList() {
		return radiationTherapyList;
	}

	@Override
	public void setRadiationTherapyList(List<RadiationTherapy> radiationTherapyList) {
		this.radiationTherapyList = radiationTherapyList;
	}

	@Override
	public boolean hasRadiationTherapy() {
		return radiationTherapyList != null && radiationTherapyList.size() > 0 && radiationTherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioChannel radioChannel) {
		radioChannelList = new ArrayList<RadioChannel>();
		radioChannelList.add(radioChannel);
	}

	@Override
	public RadioChannel getRadioChannel() {
		if(radioChannelList != null && radioChannelList.size() > 0) {
			return radioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioChannel(RadioChannel radioChannel) {
		if(radioChannelList == null) {
			radioChannelList = new ArrayList<>();
		}
		if(radioChannelList.size() == 0) {
			radioChannelList.add(radioChannel);
		} else {
			radioChannelList.set(0, radioChannel);
		}
	}

	@Override
	public List<RadioChannel> getRadioChannelList() {
		return radioChannelList;
	}

	@Override
	public void setRadioChannelList(List<RadioChannel> radioChannelList) {
		this.radioChannelList = radioChannelList;
	}

	@Override
	public boolean hasRadioChannel() {
		return radioChannelList != null && radioChannelList.size() > 0 && radioChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioClip radioClip) {
		radioClipList = new ArrayList<RadioClip>();
		radioClipList.add(radioClip);
	}

	@Override
	public RadioClip getRadioClip() {
		if(radioClipList != null && radioClipList.size() > 0) {
			return radioClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioClip(RadioClip radioClip) {
		if(radioClipList == null) {
			radioClipList = new ArrayList<>();
		}
		if(radioClipList.size() == 0) {
			radioClipList.add(radioClip);
		} else {
			radioClipList.set(0, radioClip);
		}
	}

	@Override
	public List<RadioClip> getRadioClipList() {
		return radioClipList;
	}

	@Override
	public void setRadioClipList(List<RadioClip> radioClipList) {
		this.radioClipList = radioClipList;
	}

	@Override
	public boolean hasRadioClip() {
		return radioClipList != null && radioClipList.size() > 0 && radioClipList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioEpisode radioEpisode) {
		radioEpisodeList = new ArrayList<RadioEpisode>();
		radioEpisodeList.add(radioEpisode);
	}

	@Override
	public RadioEpisode getRadioEpisode() {
		if(radioEpisodeList != null && radioEpisodeList.size() > 0) {
			return radioEpisodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioEpisode(RadioEpisode radioEpisode) {
		if(radioEpisodeList == null) {
			radioEpisodeList = new ArrayList<>();
		}
		if(radioEpisodeList.size() == 0) {
			radioEpisodeList.add(radioEpisode);
		} else {
			radioEpisodeList.set(0, radioEpisode);
		}
	}

	@Override
	public List<RadioEpisode> getRadioEpisodeList() {
		return radioEpisodeList;
	}

	@Override
	public void setRadioEpisodeList(List<RadioEpisode> radioEpisodeList) {
		this.radioEpisodeList = radioEpisodeList;
	}

	@Override
	public boolean hasRadioEpisode() {
		return radioEpisodeList != null && radioEpisodeList.size() > 0 && radioEpisodeList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioSeason radioSeason) {
		radioSeasonList = new ArrayList<RadioSeason>();
		radioSeasonList.add(radioSeason);
	}

	@Override
	public RadioSeason getRadioSeason() {
		if(radioSeasonList != null && radioSeasonList.size() > 0) {
			return radioSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioSeason(RadioSeason radioSeason) {
		if(radioSeasonList == null) {
			radioSeasonList = new ArrayList<>();
		}
		if(radioSeasonList.size() == 0) {
			radioSeasonList.add(radioSeason);
		} else {
			radioSeasonList.set(0, radioSeason);
		}
	}

	@Override
	public List<RadioSeason> getRadioSeasonList() {
		return radioSeasonList;
	}

	@Override
	public void setRadioSeasonList(List<RadioSeason> radioSeasonList) {
		this.radioSeasonList = radioSeasonList;
	}

	@Override
	public boolean hasRadioSeason() {
		return radioSeasonList != null && radioSeasonList.size() > 0 && radioSeasonList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioSeries radioSeries) {
		radioSeriesList = new ArrayList<RadioSeries>();
		radioSeriesList.add(radioSeries);
	}

	@Override
	public RadioSeries getRadioSeries() {
		if(radioSeriesList != null && radioSeriesList.size() > 0) {
			return radioSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioSeries(RadioSeries radioSeries) {
		if(radioSeriesList == null) {
			radioSeriesList = new ArrayList<>();
		}
		if(radioSeriesList.size() == 0) {
			radioSeriesList.add(radioSeries);
		} else {
			radioSeriesList.set(0, radioSeries);
		}
	}

	@Override
	public List<RadioSeries> getRadioSeriesList() {
		return radioSeriesList;
	}

	@Override
	public void setRadioSeriesList(List<RadioSeries> radioSeriesList) {
		this.radioSeriesList = radioSeriesList;
	}

	@Override
	public boolean hasRadioSeries() {
		return radioSeriesList != null && radioSeriesList.size() > 0 && radioSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(RadioStation radioStation) {
		radioStationList = new ArrayList<RadioStation>();
		radioStationList.add(radioStation);
	}

	@Override
	public RadioStation getRadioStation() {
		if(radioStationList != null && radioStationList.size() > 0) {
			return radioStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioStation(RadioStation radioStation) {
		if(radioStationList == null) {
			radioStationList = new ArrayList<>();
		}
		if(radioStationList.size() == 0) {
			radioStationList.add(radioStation);
		} else {
			radioStationList.set(0, radioStation);
		}
	}

	@Override
	public List<RadioStation> getRadioStationList() {
		return radioStationList;
	}

	@Override
	public void setRadioStationList(List<RadioStation> radioStationList) {
		this.radioStationList = radioStationList;
	}

	@Override
	public boolean hasRadioStation() {
		return radioStationList != null && radioStationList.size() > 0 && radioStationList.get(0) != null;
	}

	public ITEM_REVIEWED(Rating rating) {
		ratingList = new ArrayList<Rating>();
		ratingList.add(rating);
	}

	@Override
	public Rating getRating() {
		if(ratingList != null && ratingList.size() > 0) {
			return ratingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRating(Rating rating) {
		if(ratingList == null) {
			ratingList = new ArrayList<>();
		}
		if(ratingList.size() == 0) {
			ratingList.add(rating);
		} else {
			ratingList.set(0, rating);
		}
	}

	@Override
	public List<Rating> getRatingList() {
		return ratingList;
	}

	@Override
	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}

	@Override
	public boolean hasRating() {
		return ratingList != null && ratingList.size() > 0 && ratingList.get(0) != null;
	}

	public ITEM_REVIEWED(ReactAction reactAction) {
		reactActionList = new ArrayList<ReactAction>();
		reactActionList.add(reactAction);
	}

	@Override
	public ReactAction getReactAction() {
		if(reactActionList != null && reactActionList.size() > 0) {
			return reactActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReactAction(ReactAction reactAction) {
		if(reactActionList == null) {
			reactActionList = new ArrayList<>();
		}
		if(reactActionList.size() == 0) {
			reactActionList.add(reactAction);
		} else {
			reactActionList.set(0, reactAction);
		}
	}

	@Override
	public List<ReactAction> getReactActionList() {
		return reactActionList;
	}

	@Override
	public void setReactActionList(List<ReactAction> reactActionList) {
		this.reactActionList = reactActionList;
	}

	@Override
	public boolean hasReactAction() {
		return reactActionList != null && reactActionList.size() > 0 && reactActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ReadAction readAction) {
		readActionList = new ArrayList<ReadAction>();
		readActionList.add(readAction);
	}

	@Override
	public ReadAction getReadAction() {
		if(readActionList != null && readActionList.size() > 0) {
			return readActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReadAction(ReadAction readAction) {
		if(readActionList == null) {
			readActionList = new ArrayList<>();
		}
		if(readActionList.size() == 0) {
			readActionList.add(readAction);
		} else {
			readActionList.set(0, readAction);
		}
	}

	@Override
	public List<ReadAction> getReadActionList() {
		return readActionList;
	}

	@Override
	public void setReadActionList(List<ReadAction> readActionList) {
		this.readActionList = readActionList;
	}

	@Override
	public boolean hasReadAction() {
		return readActionList != null && readActionList.size() > 0 && readActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RealEstateAgent realEstateAgent) {
		realEstateAgentList = new ArrayList<RealEstateAgent>();
		realEstateAgentList.add(realEstateAgent);
	}

	@Override
	public RealEstateAgent getRealEstateAgent() {
		if(realEstateAgentList != null && realEstateAgentList.size() > 0) {
			return realEstateAgentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		if(realEstateAgentList == null) {
			realEstateAgentList = new ArrayList<>();
		}
		if(realEstateAgentList.size() == 0) {
			realEstateAgentList.add(realEstateAgent);
		} else {
			realEstateAgentList.set(0, realEstateAgent);
		}
	}

	@Override
	public List<RealEstateAgent> getRealEstateAgentList() {
		return realEstateAgentList;
	}

	@Override
	public void setRealEstateAgentList(List<RealEstateAgent> realEstateAgentList) {
		this.realEstateAgentList = realEstateAgentList;
	}

	@Override
	public boolean hasRealEstateAgent() {
		return realEstateAgentList != null && realEstateAgentList.size() > 0 && realEstateAgentList.get(0) != null;
	}

	public ITEM_REVIEWED(ReceiveAction receiveAction) {
		receiveActionList = new ArrayList<ReceiveAction>();
		receiveActionList.add(receiveAction);
	}

	@Override
	public ReceiveAction getReceiveAction() {
		if(receiveActionList != null && receiveActionList.size() > 0) {
			return receiveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReceiveAction(ReceiveAction receiveAction) {
		if(receiveActionList == null) {
			receiveActionList = new ArrayList<>();
		}
		if(receiveActionList.size() == 0) {
			receiveActionList.add(receiveAction);
		} else {
			receiveActionList.set(0, receiveAction);
		}
	}

	@Override
	public List<ReceiveAction> getReceiveActionList() {
		return receiveActionList;
	}

	@Override
	public void setReceiveActionList(List<ReceiveAction> receiveActionList) {
		this.receiveActionList = receiveActionList;
	}

	@Override
	public boolean hasReceiveAction() {
		return receiveActionList != null && receiveActionList.size() > 0 && receiveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Recipe recipe) {
		recipeList = new ArrayList<Recipe>();
		recipeList.add(recipe);
	}

	@Override
	public Recipe getRecipe() {
		if(recipeList != null && recipeList.size() > 0) {
			return recipeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecipe(Recipe recipe) {
		if(recipeList == null) {
			recipeList = new ArrayList<>();
		}
		if(recipeList.size() == 0) {
			recipeList.add(recipe);
		} else {
			recipeList.set(0, recipe);
		}
	}

	@Override
	public List<Recipe> getRecipeList() {
		return recipeList;
	}

	@Override
	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}

	@Override
	public boolean hasRecipe() {
		return recipeList != null && recipeList.size() > 0 && recipeList.get(0) != null;
	}

	public ITEM_REVIEWED(RecommendedDoseSchedule recommendedDoseSchedule) {
		recommendedDoseScheduleList = new ArrayList<RecommendedDoseSchedule>();
		recommendedDoseScheduleList.add(recommendedDoseSchedule);
	}

	@Override
	public RecommendedDoseSchedule getRecommendedDoseSchedule() {
		if(recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0) {
			return recommendedDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecommendedDoseSchedule(RecommendedDoseSchedule recommendedDoseSchedule) {
		if(recommendedDoseScheduleList == null) {
			recommendedDoseScheduleList = new ArrayList<>();
		}
		if(recommendedDoseScheduleList.size() == 0) {
			recommendedDoseScheduleList.add(recommendedDoseSchedule);
		} else {
			recommendedDoseScheduleList.set(0, recommendedDoseSchedule);
		}
	}

	@Override
	public List<RecommendedDoseSchedule> getRecommendedDoseScheduleList() {
		return recommendedDoseScheduleList;
	}

	@Override
	public void setRecommendedDoseScheduleList(List<RecommendedDoseSchedule> recommendedDoseScheduleList) {
		this.recommendedDoseScheduleList = recommendedDoseScheduleList;
	}

	@Override
	public boolean hasRecommendedDoseSchedule() {
		return recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0 && recommendedDoseScheduleList.get(0) != null;
	}

	public ITEM_REVIEWED(RecyclingCenter recyclingCenter) {
		recyclingCenterList = new ArrayList<RecyclingCenter>();
		recyclingCenterList.add(recyclingCenter);
	}

	@Override
	public RecyclingCenter getRecyclingCenter() {
		if(recyclingCenterList != null && recyclingCenterList.size() > 0) {
			return recyclingCenterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecyclingCenter(RecyclingCenter recyclingCenter) {
		if(recyclingCenterList == null) {
			recyclingCenterList = new ArrayList<>();
		}
		if(recyclingCenterList.size() == 0) {
			recyclingCenterList.add(recyclingCenter);
		} else {
			recyclingCenterList.set(0, recyclingCenter);
		}
	}

	@Override
	public List<RecyclingCenter> getRecyclingCenterList() {
		return recyclingCenterList;
	}

	@Override
	public void setRecyclingCenterList(List<RecyclingCenter> recyclingCenterList) {
		this.recyclingCenterList = recyclingCenterList;
	}

	@Override
	public boolean hasRecyclingCenter() {
		return recyclingCenterList != null && recyclingCenterList.size() > 0 && recyclingCenterList.get(0) != null;
	}

	public ITEM_REVIEWED(RegisterAction registerAction) {
		registerActionList = new ArrayList<RegisterAction>();
		registerActionList.add(registerAction);
	}

	@Override
	public RegisterAction getRegisterAction() {
		if(registerActionList != null && registerActionList.size() > 0) {
			return registerActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRegisterAction(RegisterAction registerAction) {
		if(registerActionList == null) {
			registerActionList = new ArrayList<>();
		}
		if(registerActionList.size() == 0) {
			registerActionList.add(registerAction);
		} else {
			registerActionList.set(0, registerAction);
		}
	}

	@Override
	public List<RegisterAction> getRegisterActionList() {
		return registerActionList;
	}

	@Override
	public void setRegisterActionList(List<RegisterAction> registerActionList) {
		this.registerActionList = registerActionList;
	}

	@Override
	public boolean hasRegisterAction() {
		return registerActionList != null && registerActionList.size() > 0 && registerActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RejectAction rejectAction) {
		rejectActionList = new ArrayList<RejectAction>();
		rejectActionList.add(rejectAction);
	}

	@Override
	public RejectAction getRejectAction() {
		if(rejectActionList != null && rejectActionList.size() > 0) {
			return rejectActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRejectAction(RejectAction rejectAction) {
		if(rejectActionList == null) {
			rejectActionList = new ArrayList<>();
		}
		if(rejectActionList.size() == 0) {
			rejectActionList.add(rejectAction);
		} else {
			rejectActionList.set(0, rejectAction);
		}
	}

	@Override
	public List<RejectAction> getRejectActionList() {
		return rejectActionList;
	}

	@Override
	public void setRejectActionList(List<RejectAction> rejectActionList) {
		this.rejectActionList = rejectActionList;
	}

	@Override
	public boolean hasRejectAction() {
		return rejectActionList != null && rejectActionList.size() > 0 && rejectActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RentAction rentAction) {
		rentActionList = new ArrayList<RentAction>();
		rentActionList.add(rentAction);
	}

	@Override
	public RentAction getRentAction() {
		if(rentActionList != null && rentActionList.size() > 0) {
			return rentActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRentAction(RentAction rentAction) {
		if(rentActionList == null) {
			rentActionList = new ArrayList<>();
		}
		if(rentActionList.size() == 0) {
			rentActionList.add(rentAction);
		} else {
			rentActionList.set(0, rentAction);
		}
	}

	@Override
	public List<RentAction> getRentActionList() {
		return rentActionList;
	}

	@Override
	public void setRentActionList(List<RentAction> rentActionList) {
		this.rentActionList = rentActionList;
	}

	@Override
	public boolean hasRentAction() {
		return rentActionList != null && rentActionList.size() > 0 && rentActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RentalCarReservation rentalCarReservation) {
		rentalCarReservationList = new ArrayList<RentalCarReservation>();
		rentalCarReservationList.add(rentalCarReservation);
	}

	@Override
	public RentalCarReservation getRentalCarReservation() {
		if(rentalCarReservationList != null && rentalCarReservationList.size() > 0) {
			return rentalCarReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRentalCarReservation(RentalCarReservation rentalCarReservation) {
		if(rentalCarReservationList == null) {
			rentalCarReservationList = new ArrayList<>();
		}
		if(rentalCarReservationList.size() == 0) {
			rentalCarReservationList.add(rentalCarReservation);
		} else {
			rentalCarReservationList.set(0, rentalCarReservation);
		}
	}

	@Override
	public List<RentalCarReservation> getRentalCarReservationList() {
		return rentalCarReservationList;
	}

	@Override
	public void setRentalCarReservationList(List<RentalCarReservation> rentalCarReservationList) {
		this.rentalCarReservationList = rentalCarReservationList;
	}

	@Override
	public boolean hasRentalCarReservation() {
		return rentalCarReservationList != null && rentalCarReservationList.size() > 0 && rentalCarReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(RepaymentSpecification repaymentSpecification) {
		repaymentSpecificationList = new ArrayList<RepaymentSpecification>();
		repaymentSpecificationList.add(repaymentSpecification);
	}

	@Override
	public RepaymentSpecification getRepaymentSpecification() {
		if(repaymentSpecificationList != null && repaymentSpecificationList.size() > 0) {
			return repaymentSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRepaymentSpecification(RepaymentSpecification repaymentSpecification) {
		if(repaymentSpecificationList == null) {
			repaymentSpecificationList = new ArrayList<>();
		}
		if(repaymentSpecificationList.size() == 0) {
			repaymentSpecificationList.add(repaymentSpecification);
		} else {
			repaymentSpecificationList.set(0, repaymentSpecification);
		}
	}

	@Override
	public List<RepaymentSpecification> getRepaymentSpecificationList() {
		return repaymentSpecificationList;
	}

	@Override
	public void setRepaymentSpecificationList(List<RepaymentSpecification> repaymentSpecificationList) {
		this.repaymentSpecificationList = repaymentSpecificationList;
	}

	@Override
	public boolean hasRepaymentSpecification() {
		return repaymentSpecificationList != null && repaymentSpecificationList.size() > 0 && repaymentSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(ReplaceAction replaceAction) {
		replaceActionList = new ArrayList<ReplaceAction>();
		replaceActionList.add(replaceAction);
	}

	@Override
	public ReplaceAction getReplaceAction() {
		if(replaceActionList != null && replaceActionList.size() > 0) {
			return replaceActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReplaceAction(ReplaceAction replaceAction) {
		if(replaceActionList == null) {
			replaceActionList = new ArrayList<>();
		}
		if(replaceActionList.size() == 0) {
			replaceActionList.add(replaceAction);
		} else {
			replaceActionList.set(0, replaceAction);
		}
	}

	@Override
	public List<ReplaceAction> getReplaceActionList() {
		return replaceActionList;
	}

	@Override
	public void setReplaceActionList(List<ReplaceAction> replaceActionList) {
		this.replaceActionList = replaceActionList;
	}

	@Override
	public boolean hasReplaceAction() {
		return replaceActionList != null && replaceActionList.size() > 0 && replaceActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ReplyAction replyAction) {
		replyActionList = new ArrayList<ReplyAction>();
		replyActionList.add(replyAction);
	}

	@Override
	public ReplyAction getReplyAction() {
		if(replyActionList != null && replyActionList.size() > 0) {
			return replyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReplyAction(ReplyAction replyAction) {
		if(replyActionList == null) {
			replyActionList = new ArrayList<>();
		}
		if(replyActionList.size() == 0) {
			replyActionList.add(replyAction);
		} else {
			replyActionList.set(0, replyAction);
		}
	}

	@Override
	public List<ReplyAction> getReplyActionList() {
		return replyActionList;
	}

	@Override
	public void setReplyActionList(List<ReplyAction> replyActionList) {
		this.replyActionList = replyActionList;
	}

	@Override
	public boolean hasReplyAction() {
		return replyActionList != null && replyActionList.size() > 0 && replyActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Report report) {
		reportList = new ArrayList<Report>();
		reportList.add(report);
	}

	@Override
	public Report getReport() {
		if(reportList != null && reportList.size() > 0) {
			return reportList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReport(Report report) {
		if(reportList == null) {
			reportList = new ArrayList<>();
		}
		if(reportList.size() == 0) {
			reportList.add(report);
		} else {
			reportList.set(0, report);
		}
	}

	@Override
	public List<Report> getReportList() {
		return reportList;
	}

	@Override
	public void setReportList(List<Report> reportList) {
		this.reportList = reportList;
	}

	@Override
	public boolean hasReport() {
		return reportList != null && reportList.size() > 0 && reportList.get(0) != null;
	}

	public ITEM_REVIEWED(ReportageNewsArticle reportageNewsArticle) {
		reportageNewsArticleList = new ArrayList<ReportageNewsArticle>();
		reportageNewsArticleList.add(reportageNewsArticle);
	}

	@Override
	public ReportageNewsArticle getReportageNewsArticle() {
		if(reportageNewsArticleList != null && reportageNewsArticleList.size() > 0) {
			return reportageNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReportageNewsArticle(ReportageNewsArticle reportageNewsArticle) {
		if(reportageNewsArticleList == null) {
			reportageNewsArticleList = new ArrayList<>();
		}
		if(reportageNewsArticleList.size() == 0) {
			reportageNewsArticleList.add(reportageNewsArticle);
		} else {
			reportageNewsArticleList.set(0, reportageNewsArticle);
		}
	}

	@Override
	public List<ReportageNewsArticle> getReportageNewsArticleList() {
		return reportageNewsArticleList;
	}

	@Override
	public void setReportageNewsArticleList(List<ReportageNewsArticle> reportageNewsArticleList) {
		this.reportageNewsArticleList = reportageNewsArticleList;
	}

	@Override
	public boolean hasReportageNewsArticle() {
		return reportageNewsArticleList != null && reportageNewsArticleList.size() > 0 && reportageNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(ReportedDoseSchedule reportedDoseSchedule) {
		reportedDoseScheduleList = new ArrayList<ReportedDoseSchedule>();
		reportedDoseScheduleList.add(reportedDoseSchedule);
	}

	@Override
	public ReportedDoseSchedule getReportedDoseSchedule() {
		if(reportedDoseScheduleList != null && reportedDoseScheduleList.size() > 0) {
			return reportedDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReportedDoseSchedule(ReportedDoseSchedule reportedDoseSchedule) {
		if(reportedDoseScheduleList == null) {
			reportedDoseScheduleList = new ArrayList<>();
		}
		if(reportedDoseScheduleList.size() == 0) {
			reportedDoseScheduleList.add(reportedDoseSchedule);
		} else {
			reportedDoseScheduleList.set(0, reportedDoseSchedule);
		}
	}

	@Override
	public List<ReportedDoseSchedule> getReportedDoseScheduleList() {
		return reportedDoseScheduleList;
	}

	@Override
	public void setReportedDoseScheduleList(List<ReportedDoseSchedule> reportedDoseScheduleList) {
		this.reportedDoseScheduleList = reportedDoseScheduleList;
	}

	@Override
	public boolean hasReportedDoseSchedule() {
		return reportedDoseScheduleList != null && reportedDoseScheduleList.size() > 0 && reportedDoseScheduleList.get(0) != null;
	}

	public ITEM_REVIEWED(Reservation reservation) {
		reservationList = new ArrayList<Reservation>();
		reservationList.add(reservation);
	}

	@Override
	public Reservation getReservation() {
		if(reservationList != null && reservationList.size() > 0) {
			return reservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservation(Reservation reservation) {
		if(reservationList == null) {
			reservationList = new ArrayList<>();
		}
		if(reservationList.size() == 0) {
			reservationList.add(reservation);
		} else {
			reservationList.set(0, reservation);
		}
	}

	@Override
	public List<Reservation> getReservationList() {
		return reservationList;
	}

	@Override
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	@Override
	public boolean hasReservation() {
		return reservationList != null && reservationList.size() > 0 && reservationList.get(0) != null;
	}

	public ITEM_REVIEWED(ReservationPackage reservationPackage) {
		reservationPackageList = new ArrayList<ReservationPackage>();
		reservationPackageList.add(reservationPackage);
	}

	@Override
	public ReservationPackage getReservationPackage() {
		if(reservationPackageList != null && reservationPackageList.size() > 0) {
			return reservationPackageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservationPackage(ReservationPackage reservationPackage) {
		if(reservationPackageList == null) {
			reservationPackageList = new ArrayList<>();
		}
		if(reservationPackageList.size() == 0) {
			reservationPackageList.add(reservationPackage);
		} else {
			reservationPackageList.set(0, reservationPackage);
		}
	}

	@Override
	public List<ReservationPackage> getReservationPackageList() {
		return reservationPackageList;
	}

	@Override
	public void setReservationPackageList(List<ReservationPackage> reservationPackageList) {
		this.reservationPackageList = reservationPackageList;
	}

	@Override
	public boolean hasReservationPackage() {
		return reservationPackageList != null && reservationPackageList.size() > 0 && reservationPackageList.get(0) != null;
	}

	public ITEM_REVIEWED(ReservationStatusType reservationStatusType) {
		reservationStatusTypeList = new ArrayList<ReservationStatusType>();
		reservationStatusTypeList.add(reservationStatusType);
	}

	@Override
	public ReservationStatusType getReservationStatusType() {
		if(reservationStatusTypeList != null && reservationStatusTypeList.size() > 0) {
			return reservationStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservationStatusType(ReservationStatusType reservationStatusType) {
		if(reservationStatusTypeList == null) {
			reservationStatusTypeList = new ArrayList<>();
		}
		if(reservationStatusTypeList.size() == 0) {
			reservationStatusTypeList.add(reservationStatusType);
		} else {
			reservationStatusTypeList.set(0, reservationStatusType);
		}
	}

	@Override
	public List<ReservationStatusType> getReservationStatusTypeList() {
		return reservationStatusTypeList;
	}

	@Override
	public void setReservationStatusTypeList(List<ReservationStatusType> reservationStatusTypeList) {
		this.reservationStatusTypeList = reservationStatusTypeList;
	}

	@Override
	public boolean hasReservationStatusType() {
		return reservationStatusTypeList != null && reservationStatusTypeList.size() > 0 && reservationStatusTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(ReserveAction reserveAction) {
		reserveActionList = new ArrayList<ReserveAction>();
		reserveActionList.add(reserveAction);
	}

	@Override
	public ReserveAction getReserveAction() {
		if(reserveActionList != null && reserveActionList.size() > 0) {
			return reserveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReserveAction(ReserveAction reserveAction) {
		if(reserveActionList == null) {
			reserveActionList = new ArrayList<>();
		}
		if(reserveActionList.size() == 0) {
			reserveActionList.add(reserveAction);
		} else {
			reserveActionList.set(0, reserveAction);
		}
	}

	@Override
	public List<ReserveAction> getReserveActionList() {
		return reserveActionList;
	}

	@Override
	public void setReserveActionList(List<ReserveAction> reserveActionList) {
		this.reserveActionList = reserveActionList;
	}

	@Override
	public boolean hasReserveAction() {
		return reserveActionList != null && reserveActionList.size() > 0 && reserveActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Reservoir reservoir) {
		reservoirList = new ArrayList<Reservoir>();
		reservoirList.add(reservoir);
	}

	@Override
	public Reservoir getReservoir() {
		if(reservoirList != null && reservoirList.size() > 0) {
			return reservoirList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservoir(Reservoir reservoir) {
		if(reservoirList == null) {
			reservoirList = new ArrayList<>();
		}
		if(reservoirList.size() == 0) {
			reservoirList.add(reservoir);
		} else {
			reservoirList.set(0, reservoir);
		}
	}

	@Override
	public List<Reservoir> getReservoirList() {
		return reservoirList;
	}

	@Override
	public void setReservoirList(List<Reservoir> reservoirList) {
		this.reservoirList = reservoirList;
	}

	@Override
	public boolean hasReservoir() {
		return reservoirList != null && reservoirList.size() > 0 && reservoirList.get(0) != null;
	}

	public ITEM_REVIEWED(Residence residence) {
		residenceList = new ArrayList<Residence>();
		residenceList.add(residence);
	}

	@Override
	public Residence getResidence() {
		if(residenceList != null && residenceList.size() > 0) {
			return residenceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setResidence(Residence residence) {
		if(residenceList == null) {
			residenceList = new ArrayList<>();
		}
		if(residenceList.size() == 0) {
			residenceList.add(residence);
		} else {
			residenceList.set(0, residence);
		}
	}

	@Override
	public List<Residence> getResidenceList() {
		return residenceList;
	}

	@Override
	public void setResidenceList(List<Residence> residenceList) {
		this.residenceList = residenceList;
	}

	@Override
	public boolean hasResidence() {
		return residenceList != null && residenceList.size() > 0 && residenceList.get(0) != null;
	}

	public ITEM_REVIEWED(Resort resort) {
		resortList = new ArrayList<Resort>();
		resortList.add(resort);
	}

	@Override
	public Resort getResort() {
		if(resortList != null && resortList.size() > 0) {
			return resortList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setResort(Resort resort) {
		if(resortList == null) {
			resortList = new ArrayList<>();
		}
		if(resortList.size() == 0) {
			resortList.add(resort);
		} else {
			resortList.set(0, resort);
		}
	}

	@Override
	public List<Resort> getResortList() {
		return resortList;
	}

	@Override
	public void setResortList(List<Resort> resortList) {
		this.resortList = resortList;
	}

	@Override
	public boolean hasResort() {
		return resortList != null && resortList.size() > 0 && resortList.get(0) != null;
	}

	public ITEM_REVIEWED(RespiratoryTherapy respiratoryTherapy) {
		respiratoryTherapyList = new ArrayList<RespiratoryTherapy>();
		respiratoryTherapyList.add(respiratoryTherapy);
	}

	@Override
	public RespiratoryTherapy getRespiratoryTherapy() {
		if(respiratoryTherapyList != null && respiratoryTherapyList.size() > 0) {
			return respiratoryTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy) {
		if(respiratoryTherapyList == null) {
			respiratoryTherapyList = new ArrayList<>();
		}
		if(respiratoryTherapyList.size() == 0) {
			respiratoryTherapyList.add(respiratoryTherapy);
		} else {
			respiratoryTherapyList.set(0, respiratoryTherapy);
		}
	}

	@Override
	public List<RespiratoryTherapy> getRespiratoryTherapyList() {
		return respiratoryTherapyList;
	}

	@Override
	public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList) {
		this.respiratoryTherapyList = respiratoryTherapyList;
	}

	@Override
	public boolean hasRespiratoryTherapy() {
		return respiratoryTherapyList != null && respiratoryTherapyList.size() > 0 && respiratoryTherapyList.get(0) != null;
	}

	public ITEM_REVIEWED(Restaurant restaurant) {
		restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(restaurant);
	}

	@Override
	public Restaurant getRestaurant() {
		if(restaurantList != null && restaurantList.size() > 0) {
			return restaurantList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRestaurant(Restaurant restaurant) {
		if(restaurantList == null) {
			restaurantList = new ArrayList<>();
		}
		if(restaurantList.size() == 0) {
			restaurantList.add(restaurant);
		} else {
			restaurantList.set(0, restaurant);
		}
	}

	@Override
	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}

	@Override
	public void setRestaurantList(List<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}

	@Override
	public boolean hasRestaurant() {
		return restaurantList != null && restaurantList.size() > 0 && restaurantList.get(0) != null;
	}

	public ITEM_REVIEWED(RestrictedDiet restrictedDiet) {
		restrictedDietList = new ArrayList<RestrictedDiet>();
		restrictedDietList.add(restrictedDiet);
	}

	@Override
	public RestrictedDiet getRestrictedDiet() {
		if(restrictedDietList != null && restrictedDietList.size() > 0) {
			return restrictedDietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRestrictedDiet(RestrictedDiet restrictedDiet) {
		if(restrictedDietList == null) {
			restrictedDietList = new ArrayList<>();
		}
		if(restrictedDietList.size() == 0) {
			restrictedDietList.add(restrictedDiet);
		} else {
			restrictedDietList.set(0, restrictedDiet);
		}
	}

	@Override
	public List<RestrictedDiet> getRestrictedDietList() {
		return restrictedDietList;
	}

	@Override
	public void setRestrictedDietList(List<RestrictedDiet> restrictedDietList) {
		this.restrictedDietList = restrictedDietList;
	}

	@Override
	public boolean hasRestrictedDiet() {
		return restrictedDietList != null && restrictedDietList.size() > 0 && restrictedDietList.get(0) != null;
	}

	public ITEM_REVIEWED(ResumeAction resumeAction) {
		resumeActionList = new ArrayList<ResumeAction>();
		resumeActionList.add(resumeAction);
	}

	@Override
	public ResumeAction getResumeAction() {
		if(resumeActionList != null && resumeActionList.size() > 0) {
			return resumeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setResumeAction(ResumeAction resumeAction) {
		if(resumeActionList == null) {
			resumeActionList = new ArrayList<>();
		}
		if(resumeActionList.size() == 0) {
			resumeActionList.add(resumeAction);
		} else {
			resumeActionList.set(0, resumeAction);
		}
	}

	@Override
	public List<ResumeAction> getResumeActionList() {
		return resumeActionList;
	}

	@Override
	public void setResumeActionList(List<ResumeAction> resumeActionList) {
		this.resumeActionList = resumeActionList;
	}

	@Override
	public boolean hasResumeAction() {
		return resumeActionList != null && resumeActionList.size() > 0 && resumeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ReturnAction returnAction) {
		returnActionList = new ArrayList<ReturnAction>();
		returnActionList.add(returnAction);
	}

	@Override
	public ReturnAction getReturnAction() {
		if(returnActionList != null && returnActionList.size() > 0) {
			return returnActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReturnAction(ReturnAction returnAction) {
		if(returnActionList == null) {
			returnActionList = new ArrayList<>();
		}
		if(returnActionList.size() == 0) {
			returnActionList.add(returnAction);
		} else {
			returnActionList.set(0, returnAction);
		}
	}

	@Override
	public List<ReturnAction> getReturnActionList() {
		return returnActionList;
	}

	@Override
	public void setReturnActionList(List<ReturnAction> returnActionList) {
		this.returnActionList = returnActionList;
	}

	@Override
	public boolean hasReturnAction() {
		return returnActionList != null && returnActionList.size() > 0 && returnActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Review review) {
		reviewList = new ArrayList<Review>();
		reviewList.add(review);
	}

	@Override
	public Review getReview() {
		if(reviewList != null && reviewList.size() > 0) {
			return reviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReview(Review review) {
		if(reviewList == null) {
			reviewList = new ArrayList<>();
		}
		if(reviewList.size() == 0) {
			reviewList.add(review);
		} else {
			reviewList.set(0, review);
		}
	}

	@Override
	public List<Review> getReviewList() {
		return reviewList;
	}

	@Override
	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	@Override
	public boolean hasReview() {
		return reviewList != null && reviewList.size() > 0 && reviewList.get(0) != null;
	}

	public ITEM_REVIEWED(ReviewAction reviewAction) {
		reviewActionList = new ArrayList<ReviewAction>();
		reviewActionList.add(reviewAction);
	}

	@Override
	public ReviewAction getReviewAction() {
		if(reviewActionList != null && reviewActionList.size() > 0) {
			return reviewActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReviewAction(ReviewAction reviewAction) {
		if(reviewActionList == null) {
			reviewActionList = new ArrayList<>();
		}
		if(reviewActionList.size() == 0) {
			reviewActionList.add(reviewAction);
		} else {
			reviewActionList.set(0, reviewAction);
		}
	}

	@Override
	public List<ReviewAction> getReviewActionList() {
		return reviewActionList;
	}

	@Override
	public void setReviewActionList(List<ReviewAction> reviewActionList) {
		this.reviewActionList = reviewActionList;
	}

	@Override
	public boolean hasReviewAction() {
		return reviewActionList != null && reviewActionList.size() > 0 && reviewActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ReviewNewsArticle reviewNewsArticle) {
		reviewNewsArticleList = new ArrayList<ReviewNewsArticle>();
		reviewNewsArticleList.add(reviewNewsArticle);
	}

	@Override
	public ReviewNewsArticle getReviewNewsArticle() {
		if(reviewNewsArticleList != null && reviewNewsArticleList.size() > 0) {
			return reviewNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle) {
		if(reviewNewsArticleList == null) {
			reviewNewsArticleList = new ArrayList<>();
		}
		if(reviewNewsArticleList.size() == 0) {
			reviewNewsArticleList.add(reviewNewsArticle);
		} else {
			reviewNewsArticleList.set(0, reviewNewsArticle);
		}
	}

	@Override
	public List<ReviewNewsArticle> getReviewNewsArticleList() {
		return reviewNewsArticleList;
	}

	@Override
	public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList) {
		this.reviewNewsArticleList = reviewNewsArticleList;
	}

	@Override
	public boolean hasReviewNewsArticle() {
		return reviewNewsArticleList != null && reviewNewsArticleList.size() > 0 && reviewNewsArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(RiverBodyOfWater riverBodyOfWater) {
		riverBodyOfWaterList = new ArrayList<RiverBodyOfWater>();
		riverBodyOfWaterList.add(riverBodyOfWater);
	}

	@Override
	public RiverBodyOfWater getRiverBodyOfWater() {
		if(riverBodyOfWaterList != null && riverBodyOfWaterList.size() > 0) {
			return riverBodyOfWaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRiverBodyOfWater(RiverBodyOfWater riverBodyOfWater) {
		if(riverBodyOfWaterList == null) {
			riverBodyOfWaterList = new ArrayList<>();
		}
		if(riverBodyOfWaterList.size() == 0) {
			riverBodyOfWaterList.add(riverBodyOfWater);
		} else {
			riverBodyOfWaterList.set(0, riverBodyOfWater);
		}
	}

	@Override
	public List<RiverBodyOfWater> getRiverBodyOfWaterList() {
		return riverBodyOfWaterList;
	}

	@Override
	public void setRiverBodyOfWaterList(List<RiverBodyOfWater> riverBodyOfWaterList) {
		this.riverBodyOfWaterList = riverBodyOfWaterList;
	}

	@Override
	public boolean hasRiverBodyOfWater() {
		return riverBodyOfWaterList != null && riverBodyOfWaterList.size() > 0 && riverBodyOfWaterList.get(0) != null;
	}

	public ITEM_REVIEWED(Role role) {
		roleList = new ArrayList<Role>();
		roleList.add(role);
	}

	@Override
	public Role getRole() {
		if(roleList != null && roleList.size() > 0) {
			return roleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRole(Role role) {
		if(roleList == null) {
			roleList = new ArrayList<>();
		}
		if(roleList.size() == 0) {
			roleList.add(role);
		} else {
			roleList.set(0, role);
		}
	}

	@Override
	public List<Role> getRoleList() {
		return roleList;
	}

	@Override
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public boolean hasRole() {
		return roleList != null && roleList.size() > 0 && roleList.get(0) != null;
	}

	public ITEM_REVIEWED(RoofingContractor roofingContractor) {
		roofingContractorList = new ArrayList<RoofingContractor>();
		roofingContractorList.add(roofingContractor);
	}

	@Override
	public RoofingContractor getRoofingContractor() {
		if(roofingContractorList != null && roofingContractorList.size() > 0) {
			return roofingContractorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRoofingContractor(RoofingContractor roofingContractor) {
		if(roofingContractorList == null) {
			roofingContractorList = new ArrayList<>();
		}
		if(roofingContractorList.size() == 0) {
			roofingContractorList.add(roofingContractor);
		} else {
			roofingContractorList.set(0, roofingContractor);
		}
	}

	@Override
	public List<RoofingContractor> getRoofingContractorList() {
		return roofingContractorList;
	}

	@Override
	public void setRoofingContractorList(List<RoofingContractor> roofingContractorList) {
		this.roofingContractorList = roofingContractorList;
	}

	@Override
	public boolean hasRoofingContractor() {
		return roofingContractorList != null && roofingContractorList.size() > 0 && roofingContractorList.get(0) != null;
	}

	public ITEM_REVIEWED(Room room) {
		roomList = new ArrayList<Room>();
		roomList.add(room);
	}

	@Override
	public Room getRoom() {
		if(roomList != null && roomList.size() > 0) {
			return roomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRoom(Room room) {
		if(roomList == null) {
			roomList = new ArrayList<>();
		}
		if(roomList.size() == 0) {
			roomList.add(room);
		} else {
			roomList.set(0, room);
		}
	}

	@Override
	public List<Room> getRoomList() {
		return roomList;
	}

	@Override
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public boolean hasRoom() {
		return roomList != null && roomList.size() > 0 && roomList.get(0) != null;
	}

	public ITEM_REVIEWED(RsvpAction rsvpAction) {
		rsvpActionList = new ArrayList<RsvpAction>();
		rsvpActionList.add(rsvpAction);
	}

	@Override
	public RsvpAction getRsvpAction() {
		if(rsvpActionList != null && rsvpActionList.size() > 0) {
			return rsvpActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRsvpAction(RsvpAction rsvpAction) {
		if(rsvpActionList == null) {
			rsvpActionList = new ArrayList<>();
		}
		if(rsvpActionList.size() == 0) {
			rsvpActionList.add(rsvpAction);
		} else {
			rsvpActionList.set(0, rsvpAction);
		}
	}

	@Override
	public List<RsvpAction> getRsvpActionList() {
		return rsvpActionList;
	}

	@Override
	public void setRsvpActionList(List<RsvpAction> rsvpActionList) {
		this.rsvpActionList = rsvpActionList;
	}

	@Override
	public boolean hasRsvpAction() {
		return rsvpActionList != null && rsvpActionList.size() > 0 && rsvpActionList.get(0) != null;
	}

	public ITEM_REVIEWED(RsvpResponseType rsvpResponseType) {
		rsvpResponseTypeList = new ArrayList<RsvpResponseType>();
		rsvpResponseTypeList.add(rsvpResponseType);
	}

	@Override
	public RsvpResponseType getRsvpResponseType() {
		if(rsvpResponseTypeList != null && rsvpResponseTypeList.size() > 0) {
			return rsvpResponseTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRsvpResponseType(RsvpResponseType rsvpResponseType) {
		if(rsvpResponseTypeList == null) {
			rsvpResponseTypeList = new ArrayList<>();
		}
		if(rsvpResponseTypeList.size() == 0) {
			rsvpResponseTypeList.add(rsvpResponseType);
		} else {
			rsvpResponseTypeList.set(0, rsvpResponseType);
		}
	}

	@Override
	public List<RsvpResponseType> getRsvpResponseTypeList() {
		return rsvpResponseTypeList;
	}

	@Override
	public void setRsvpResponseTypeList(List<RsvpResponseType> rsvpResponseTypeList) {
		this.rsvpResponseTypeList = rsvpResponseTypeList;
	}

	@Override
	public boolean hasRsvpResponseType() {
		return rsvpResponseTypeList != null && rsvpResponseTypeList.size() > 0 && rsvpResponseTypeList.get(0) != null;
	}

	public ITEM_REVIEWED(SaleEvent saleEvent) {
		saleEventList = new ArrayList<SaleEvent>();
		saleEventList.add(saleEvent);
	}

	@Override
	public SaleEvent getSaleEvent() {
		if(saleEventList != null && saleEventList.size() > 0) {
			return saleEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSaleEvent(SaleEvent saleEvent) {
		if(saleEventList == null) {
			saleEventList = new ArrayList<>();
		}
		if(saleEventList.size() == 0) {
			saleEventList.add(saleEvent);
		} else {
			saleEventList.set(0, saleEvent);
		}
	}

	@Override
	public List<SaleEvent> getSaleEventList() {
		return saleEventList;
	}

	@Override
	public void setSaleEventList(List<SaleEvent> saleEventList) {
		this.saleEventList = saleEventList;
	}

	@Override
	public boolean hasSaleEvent() {
		return saleEventList != null && saleEventList.size() > 0 && saleEventList.get(0) != null;
	}

	public ITEM_REVIEWED(SatiricalArticle satiricalArticle) {
		satiricalArticleList = new ArrayList<SatiricalArticle>();
		satiricalArticleList.add(satiricalArticle);
	}

	@Override
	public SatiricalArticle getSatiricalArticle() {
		if(satiricalArticleList != null && satiricalArticleList.size() > 0) {
			return satiricalArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSatiricalArticle(SatiricalArticle satiricalArticle) {
		if(satiricalArticleList == null) {
			satiricalArticleList = new ArrayList<>();
		}
		if(satiricalArticleList.size() == 0) {
			satiricalArticleList.add(satiricalArticle);
		} else {
			satiricalArticleList.set(0, satiricalArticle);
		}
	}

	@Override
	public List<SatiricalArticle> getSatiricalArticleList() {
		return satiricalArticleList;
	}

	@Override
	public void setSatiricalArticleList(List<SatiricalArticle> satiricalArticleList) {
		this.satiricalArticleList = satiricalArticleList;
	}

	@Override
	public boolean hasSatiricalArticle() {
		return satiricalArticleList != null && satiricalArticleList.size() > 0 && satiricalArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(Schedule schedule) {
		scheduleList = new ArrayList<Schedule>();
		scheduleList.add(schedule);
	}

	@Override
	public Schedule getSchedule() {
		if(scheduleList != null && scheduleList.size() > 0) {
			return scheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSchedule(Schedule schedule) {
		if(scheduleList == null) {
			scheduleList = new ArrayList<>();
		}
		if(scheduleList.size() == 0) {
			scheduleList.add(schedule);
		} else {
			scheduleList.set(0, schedule);
		}
	}

	@Override
	public List<Schedule> getScheduleList() {
		return scheduleList;
	}

	@Override
	public void setScheduleList(List<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
	}

	@Override
	public boolean hasSchedule() {
		return scheduleList != null && scheduleList.size() > 0 && scheduleList.get(0) != null;
	}

	public ITEM_REVIEWED(ScheduleAction scheduleAction) {
		scheduleActionList = new ArrayList<ScheduleAction>();
		scheduleActionList.add(scheduleAction);
	}

	@Override
	public ScheduleAction getScheduleAction() {
		if(scheduleActionList != null && scheduleActionList.size() > 0) {
			return scheduleActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScheduleAction(ScheduleAction scheduleAction) {
		if(scheduleActionList == null) {
			scheduleActionList = new ArrayList<>();
		}
		if(scheduleActionList.size() == 0) {
			scheduleActionList.add(scheduleAction);
		} else {
			scheduleActionList.set(0, scheduleAction);
		}
	}

	@Override
	public List<ScheduleAction> getScheduleActionList() {
		return scheduleActionList;
	}

	@Override
	public void setScheduleActionList(List<ScheduleAction> scheduleActionList) {
		this.scheduleActionList = scheduleActionList;
	}

	@Override
	public boolean hasScheduleAction() {
		return scheduleActionList != null && scheduleActionList.size() > 0 && scheduleActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ScholarlyArticle scholarlyArticle) {
		scholarlyArticleList = new ArrayList<ScholarlyArticle>();
		scholarlyArticleList.add(scholarlyArticle);
	}

	@Override
	public ScholarlyArticle getScholarlyArticle() {
		if(scholarlyArticleList != null && scholarlyArticleList.size() > 0) {
			return scholarlyArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScholarlyArticle(ScholarlyArticle scholarlyArticle) {
		if(scholarlyArticleList == null) {
			scholarlyArticleList = new ArrayList<>();
		}
		if(scholarlyArticleList.size() == 0) {
			scholarlyArticleList.add(scholarlyArticle);
		} else {
			scholarlyArticleList.set(0, scholarlyArticle);
		}
	}

	@Override
	public List<ScholarlyArticle> getScholarlyArticleList() {
		return scholarlyArticleList;
	}

	@Override
	public void setScholarlyArticleList(List<ScholarlyArticle> scholarlyArticleList) {
		this.scholarlyArticleList = scholarlyArticleList;
	}

	@Override
	public boolean hasScholarlyArticle() {
		return scholarlyArticleList != null && scholarlyArticleList.size() > 0 && scholarlyArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(School school) {
		schoolList = new ArrayList<School>();
		schoolList.add(school);
	}

	@Override
	public School getSchool() {
		if(schoolList != null && schoolList.size() > 0) {
			return schoolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSchool(School school) {
		if(schoolList == null) {
			schoolList = new ArrayList<>();
		}
		if(schoolList.size() == 0) {
			schoolList.add(school);
		} else {
			schoolList.set(0, school);
		}
	}

	@Override
	public List<School> getSchoolList() {
		return schoolList;
	}

	@Override
	public void setSchoolList(List<School> schoolList) {
		this.schoolList = schoolList;
	}

	@Override
	public boolean hasSchool() {
		return schoolList != null && schoolList.size() > 0 && schoolList.get(0) != null;
	}

	public ITEM_REVIEWED(ScreeningEvent screeningEvent) {
		screeningEventList = new ArrayList<ScreeningEvent>();
		screeningEventList.add(screeningEvent);
	}

	@Override
	public ScreeningEvent getScreeningEvent() {
		if(screeningEventList != null && screeningEventList.size() > 0) {
			return screeningEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScreeningEvent(ScreeningEvent screeningEvent) {
		if(screeningEventList == null) {
			screeningEventList = new ArrayList<>();
		}
		if(screeningEventList.size() == 0) {
			screeningEventList.add(screeningEvent);
		} else {
			screeningEventList.set(0, screeningEvent);
		}
	}

	@Override
	public List<ScreeningEvent> getScreeningEventList() {
		return screeningEventList;
	}

	@Override
	public void setScreeningEventList(List<ScreeningEvent> screeningEventList) {
		this.screeningEventList = screeningEventList;
	}

	@Override
	public boolean hasScreeningEvent() {
		return screeningEventList != null && screeningEventList.size() > 0 && screeningEventList.get(0) != null;
	}

	public ITEM_REVIEWED(Sculpture sculpture) {
		sculptureList = new ArrayList<Sculpture>();
		sculptureList.add(sculpture);
	}

	@Override
	public Sculpture getSculpture() {
		if(sculptureList != null && sculptureList.size() > 0) {
			return sculptureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSculpture(Sculpture sculpture) {
		if(sculptureList == null) {
			sculptureList = new ArrayList<>();
		}
		if(sculptureList.size() == 0) {
			sculptureList.add(sculpture);
		} else {
			sculptureList.set(0, sculpture);
		}
	}

	@Override
	public List<Sculpture> getSculptureList() {
		return sculptureList;
	}

	@Override
	public void setSculptureList(List<Sculpture> sculptureList) {
		this.sculptureList = sculptureList;
	}

	@Override
	public boolean hasSculpture() {
		return sculptureList != null && sculptureList.size() > 0 && sculptureList.get(0) != null;
	}

	public ITEM_REVIEWED(SeaBodyOfWater seaBodyOfWater) {
		seaBodyOfWaterList = new ArrayList<SeaBodyOfWater>();
		seaBodyOfWaterList.add(seaBodyOfWater);
	}

	@Override
	public SeaBodyOfWater getSeaBodyOfWater() {
		if(seaBodyOfWaterList != null && seaBodyOfWaterList.size() > 0) {
			return seaBodyOfWaterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSeaBodyOfWater(SeaBodyOfWater seaBodyOfWater) {
		if(seaBodyOfWaterList == null) {
			seaBodyOfWaterList = new ArrayList<>();
		}
		if(seaBodyOfWaterList.size() == 0) {
			seaBodyOfWaterList.add(seaBodyOfWater);
		} else {
			seaBodyOfWaterList.set(0, seaBodyOfWater);
		}
	}

	@Override
	public List<SeaBodyOfWater> getSeaBodyOfWaterList() {
		return seaBodyOfWaterList;
	}

	@Override
	public void setSeaBodyOfWaterList(List<SeaBodyOfWater> seaBodyOfWaterList) {
		this.seaBodyOfWaterList = seaBodyOfWaterList;
	}

	@Override
	public boolean hasSeaBodyOfWater() {
		return seaBodyOfWaterList != null && seaBodyOfWaterList.size() > 0 && seaBodyOfWaterList.get(0) != null;
	}

	public ITEM_REVIEWED(SearchAction searchAction) {
		searchActionList = new ArrayList<SearchAction>();
		searchActionList.add(searchAction);
	}

	@Override
	public SearchAction getSearchAction() {
		if(searchActionList != null && searchActionList.size() > 0) {
			return searchActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSearchAction(SearchAction searchAction) {
		if(searchActionList == null) {
			searchActionList = new ArrayList<>();
		}
		if(searchActionList.size() == 0) {
			searchActionList.add(searchAction);
		} else {
			searchActionList.set(0, searchAction);
		}
	}

	@Override
	public List<SearchAction> getSearchActionList() {
		return searchActionList;
	}

	@Override
	public void setSearchActionList(List<SearchAction> searchActionList) {
		this.searchActionList = searchActionList;
	}

	@Override
	public boolean hasSearchAction() {
		return searchActionList != null && searchActionList.size() > 0 && searchActionList.get(0) != null;
	}

	public ITEM_REVIEWED(SearchResultsPage searchResultsPage) {
		searchResultsPageList = new ArrayList<SearchResultsPage>();
		searchResultsPageList.add(searchResultsPage);
	}

	@Override
	public SearchResultsPage getSearchResultsPage() {
		if(searchResultsPageList != null && searchResultsPageList.size() > 0) {
			return searchResultsPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSearchResultsPage(SearchResultsPage searchResultsPage) {
		if(searchResultsPageList == null) {
			searchResultsPageList = new ArrayList<>();
		}
		if(searchResultsPageList.size() == 0) {
			searchResultsPageList.add(searchResultsPage);
		} else {
			searchResultsPageList.set(0, searchResultsPage);
		}
	}

	@Override
	public List<SearchResultsPage> getSearchResultsPageList() {
		return searchResultsPageList;
	}

	@Override
	public void setSearchResultsPageList(List<SearchResultsPage> searchResultsPageList) {
		this.searchResultsPageList = searchResultsPageList;
	}

	@Override
	public boolean hasSearchResultsPage() {
		return searchResultsPageList != null && searchResultsPageList.size() > 0 && searchResultsPageList.get(0) != null;
	}

	public ITEM_REVIEWED(Seat seat) {
		seatList = new ArrayList<Seat>();
		seatList.add(seat);
	}

	@Override
	public Seat getSeat() {
		if(seatList != null && seatList.size() > 0) {
			return seatList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSeat(Seat seat) {
		if(seatList == null) {
			seatList = new ArrayList<>();
		}
		if(seatList.size() == 0) {
			seatList.add(seat);
		} else {
			seatList.set(0, seat);
		}
	}

	@Override
	public List<Seat> getSeatList() {
		return seatList;
	}

	@Override
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	@Override
	public boolean hasSeat() {
		return seatList != null && seatList.size() > 0 && seatList.get(0) != null;
	}

	public ITEM_REVIEWED(SelfStorage selfStorage) {
		selfStorageList = new ArrayList<SelfStorage>();
		selfStorageList.add(selfStorage);
	}

	@Override
	public SelfStorage getSelfStorage() {
		if(selfStorageList != null && selfStorageList.size() > 0) {
			return selfStorageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSelfStorage(SelfStorage selfStorage) {
		if(selfStorageList == null) {
			selfStorageList = new ArrayList<>();
		}
		if(selfStorageList.size() == 0) {
			selfStorageList.add(selfStorage);
		} else {
			selfStorageList.set(0, selfStorage);
		}
	}

	@Override
	public List<SelfStorage> getSelfStorageList() {
		return selfStorageList;
	}

	@Override
	public void setSelfStorageList(List<SelfStorage> selfStorageList) {
		this.selfStorageList = selfStorageList;
	}

	@Override
	public boolean hasSelfStorage() {
		return selfStorageList != null && selfStorageList.size() > 0 && selfStorageList.get(0) != null;
	}

	public ITEM_REVIEWED(SellAction sellAction) {
		sellActionList = new ArrayList<SellAction>();
		sellActionList.add(sellAction);
	}

	@Override
	public SellAction getSellAction() {
		if(sellActionList != null && sellActionList.size() > 0) {
			return sellActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSellAction(SellAction sellAction) {
		if(sellActionList == null) {
			sellActionList = new ArrayList<>();
		}
		if(sellActionList.size() == 0) {
			sellActionList.add(sellAction);
		} else {
			sellActionList.set(0, sellAction);
		}
	}

	@Override
	public List<SellAction> getSellActionList() {
		return sellActionList;
	}

	@Override
	public void setSellActionList(List<SellAction> sellActionList) {
		this.sellActionList = sellActionList;
	}

	@Override
	public boolean hasSellAction() {
		return sellActionList != null && sellActionList.size() > 0 && sellActionList.get(0) != null;
	}

	public ITEM_REVIEWED(SendAction sendAction) {
		sendActionList = new ArrayList<SendAction>();
		sendActionList.add(sendAction);
	}

	@Override
	public SendAction getSendAction() {
		if(sendActionList != null && sendActionList.size() > 0) {
			return sendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSendAction(SendAction sendAction) {
		if(sendActionList == null) {
			sendActionList = new ArrayList<>();
		}
		if(sendActionList.size() == 0) {
			sendActionList.add(sendAction);
		} else {
			sendActionList.set(0, sendAction);
		}
	}

	@Override
	public List<SendAction> getSendActionList() {
		return sendActionList;
	}

	@Override
	public void setSendActionList(List<SendAction> sendActionList) {
		this.sendActionList = sendActionList;
	}

	@Override
	public boolean hasSendAction() {
		return sendActionList != null && sendActionList.size() > 0 && sendActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Series series) {
		seriesList = new ArrayList<Series>();
		seriesList.add(series);
	}

	@Override
	public Series getSeries() {
		if(seriesList != null && seriesList.size() > 0) {
			return seriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSeries(Series series) {
		if(seriesList == null) {
			seriesList = new ArrayList<>();
		}
		if(seriesList.size() == 0) {
			seriesList.add(series);
		} else {
			seriesList.set(0, series);
		}
	}

	@Override
	public List<Series> getSeriesList() {
		return seriesList;
	}

	@Override
	public void setSeriesList(List<Series> seriesList) {
		this.seriesList = seriesList;
	}

	@Override
	public boolean hasSeries() {
		return seriesList != null && seriesList.size() > 0 && seriesList.get(0) != null;
	}

	public ITEM_REVIEWED(Service service) {
		serviceList = new ArrayList<Service>();
		serviceList.add(service);
	}

	@Override
	public Service getService() {
		if(serviceList != null && serviceList.size() > 0) {
			return serviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setService(Service service) {
		if(serviceList == null) {
			serviceList = new ArrayList<>();
		}
		if(serviceList.size() == 0) {
			serviceList.add(service);
		} else {
			serviceList.set(0, service);
		}
	}

	@Override
	public List<Service> getServiceList() {
		return serviceList;
	}

	@Override
	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	@Override
	public boolean hasService() {
		return serviceList != null && serviceList.size() > 0 && serviceList.get(0) != null;
	}

	public ITEM_REVIEWED(ServiceChannel serviceChannel) {
		serviceChannelList = new ArrayList<ServiceChannel>();
		serviceChannelList.add(serviceChannel);
	}

	@Override
	public ServiceChannel getServiceChannel() {
		if(serviceChannelList != null && serviceChannelList.size() > 0) {
			return serviceChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setServiceChannel(ServiceChannel serviceChannel) {
		if(serviceChannelList == null) {
			serviceChannelList = new ArrayList<>();
		}
		if(serviceChannelList.size() == 0) {
			serviceChannelList.add(serviceChannel);
		} else {
			serviceChannelList.set(0, serviceChannel);
		}
	}

	@Override
	public List<ServiceChannel> getServiceChannelList() {
		return serviceChannelList;
	}

	@Override
	public void setServiceChannelList(List<ServiceChannel> serviceChannelList) {
		this.serviceChannelList = serviceChannelList;
	}

	@Override
	public boolean hasServiceChannel() {
		return serviceChannelList != null && serviceChannelList.size() > 0 && serviceChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(ShareAction shareAction) {
		shareActionList = new ArrayList<ShareAction>();
		shareActionList.add(shareAction);
	}

	@Override
	public ShareAction getShareAction() {
		if(shareActionList != null && shareActionList.size() > 0) {
			return shareActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setShareAction(ShareAction shareAction) {
		if(shareActionList == null) {
			shareActionList = new ArrayList<>();
		}
		if(shareActionList.size() == 0) {
			shareActionList.add(shareAction);
		} else {
			shareActionList.set(0, shareAction);
		}
	}

	@Override
	public List<ShareAction> getShareActionList() {
		return shareActionList;
	}

	@Override
	public void setShareActionList(List<ShareAction> shareActionList) {
		this.shareActionList = shareActionList;
	}

	@Override
	public boolean hasShareAction() {
		return shareActionList != null && shareActionList.size() > 0 && shareActionList.get(0) != null;
	}

	public ITEM_REVIEWED(ShoeStore shoeStore) {
		shoeStoreList = new ArrayList<ShoeStore>();
		shoeStoreList.add(shoeStore);
	}

	@Override
	public ShoeStore getShoeStore() {
		if(shoeStoreList != null && shoeStoreList.size() > 0) {
			return shoeStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setShoeStore(ShoeStore shoeStore) {
		if(shoeStoreList == null) {
			shoeStoreList = new ArrayList<>();
		}
		if(shoeStoreList.size() == 0) {
			shoeStoreList.add(shoeStore);
		} else {
			shoeStoreList.set(0, shoeStore);
		}
	}

	@Override
	public List<ShoeStore> getShoeStoreList() {
		return shoeStoreList;
	}

	@Override
	public void setShoeStoreList(List<ShoeStore> shoeStoreList) {
		this.shoeStoreList = shoeStoreList;
	}

	@Override
	public boolean hasShoeStore() {
		return shoeStoreList != null && shoeStoreList.size() > 0 && shoeStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(ShoppingCenter shoppingCenter) {
		shoppingCenterList = new ArrayList<ShoppingCenter>();
		shoppingCenterList.add(shoppingCenter);
	}

	@Override
	public ShoppingCenter getShoppingCenter() {
		if(shoppingCenterList != null && shoppingCenterList.size() > 0) {
			return shoppingCenterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setShoppingCenter(ShoppingCenter shoppingCenter) {
		if(shoppingCenterList == null) {
			shoppingCenterList = new ArrayList<>();
		}
		if(shoppingCenterList.size() == 0) {
			shoppingCenterList.add(shoppingCenter);
		} else {
			shoppingCenterList.set(0, shoppingCenter);
		}
	}

	@Override
	public List<ShoppingCenter> getShoppingCenterList() {
		return shoppingCenterList;
	}

	@Override
	public void setShoppingCenterList(List<ShoppingCenter> shoppingCenterList) {
		this.shoppingCenterList = shoppingCenterList;
	}

	@Override
	public boolean hasShoppingCenter() {
		return shoppingCenterList != null && shoppingCenterList.size() > 0 && shoppingCenterList.get(0) != null;
	}

	public ITEM_REVIEWED(SingleFamilyResidence singleFamilyResidence) {
		singleFamilyResidenceList = new ArrayList<SingleFamilyResidence>();
		singleFamilyResidenceList.add(singleFamilyResidence);
	}

	@Override
	public SingleFamilyResidence getSingleFamilyResidence() {
		if(singleFamilyResidenceList != null && singleFamilyResidenceList.size() > 0) {
			return singleFamilyResidenceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSingleFamilyResidence(SingleFamilyResidence singleFamilyResidence) {
		if(singleFamilyResidenceList == null) {
			singleFamilyResidenceList = new ArrayList<>();
		}
		if(singleFamilyResidenceList.size() == 0) {
			singleFamilyResidenceList.add(singleFamilyResidence);
		} else {
			singleFamilyResidenceList.set(0, singleFamilyResidence);
		}
	}

	@Override
	public List<SingleFamilyResidence> getSingleFamilyResidenceList() {
		return singleFamilyResidenceList;
	}

	@Override
	public void setSingleFamilyResidenceList(List<SingleFamilyResidence> singleFamilyResidenceList) {
		this.singleFamilyResidenceList = singleFamilyResidenceList;
	}

	@Override
	public boolean hasSingleFamilyResidence() {
		return singleFamilyResidenceList != null && singleFamilyResidenceList.size() > 0 && singleFamilyResidenceList.get(0) != null;
	}

	public ITEM_REVIEWED(SiteNavigationElement siteNavigationElement) {
		siteNavigationElementList = new ArrayList<SiteNavigationElement>();
		siteNavigationElementList.add(siteNavigationElement);
	}

	@Override
	public SiteNavigationElement getSiteNavigationElement() {
		if(siteNavigationElementList != null && siteNavigationElementList.size() > 0) {
			return siteNavigationElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement) {
		if(siteNavigationElementList == null) {
			siteNavigationElementList = new ArrayList<>();
		}
		if(siteNavigationElementList.size() == 0) {
			siteNavigationElementList.add(siteNavigationElement);
		} else {
			siteNavigationElementList.set(0, siteNavigationElement);
		}
	}

	@Override
	public List<SiteNavigationElement> getSiteNavigationElementList() {
		return siteNavigationElementList;
	}

	@Override
	public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList) {
		this.siteNavigationElementList = siteNavigationElementList;
	}

	@Override
	public boolean hasSiteNavigationElement() {
		return siteNavigationElementList != null && siteNavigationElementList.size() > 0 && siteNavigationElementList.get(0) != null;
	}

	public ITEM_REVIEWED(SkiResort skiResort) {
		skiResortList = new ArrayList<SkiResort>();
		skiResortList.add(skiResort);
	}

	@Override
	public SkiResort getSkiResort() {
		if(skiResortList != null && skiResortList.size() > 0) {
			return skiResortList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSkiResort(SkiResort skiResort) {
		if(skiResortList == null) {
			skiResortList = new ArrayList<>();
		}
		if(skiResortList.size() == 0) {
			skiResortList.add(skiResort);
		} else {
			skiResortList.set(0, skiResort);
		}
	}

	@Override
	public List<SkiResort> getSkiResortList() {
		return skiResortList;
	}

	@Override
	public void setSkiResortList(List<SkiResort> skiResortList) {
		this.skiResortList = skiResortList;
	}

	@Override
	public boolean hasSkiResort() {
		return skiResortList != null && skiResortList.size() > 0 && skiResortList.get(0) != null;
	}

	public ITEM_REVIEWED(SocialEvent socialEvent) {
		socialEventList = new ArrayList<SocialEvent>();
		socialEventList.add(socialEvent);
	}

	@Override
	public SocialEvent getSocialEvent() {
		if(socialEventList != null && socialEventList.size() > 0) {
			return socialEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSocialEvent(SocialEvent socialEvent) {
		if(socialEventList == null) {
			socialEventList = new ArrayList<>();
		}
		if(socialEventList.size() == 0) {
			socialEventList.add(socialEvent);
		} else {
			socialEventList.set(0, socialEvent);
		}
	}

	@Override
	public List<SocialEvent> getSocialEventList() {
		return socialEventList;
	}

	@Override
	public void setSocialEventList(List<SocialEvent> socialEventList) {
		this.socialEventList = socialEventList;
	}

	@Override
	public boolean hasSocialEvent() {
		return socialEventList != null && socialEventList.size() > 0 && socialEventList.get(0) != null;
	}

	public ITEM_REVIEWED(SocialMediaPosting socialMediaPosting) {
		socialMediaPostingList = new ArrayList<SocialMediaPosting>();
		socialMediaPostingList.add(socialMediaPosting);
	}

	@Override
	public SocialMediaPosting getSocialMediaPosting() {
		if(socialMediaPostingList != null && socialMediaPostingList.size() > 0) {
			return socialMediaPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSocialMediaPosting(SocialMediaPosting socialMediaPosting) {
		if(socialMediaPostingList == null) {
			socialMediaPostingList = new ArrayList<>();
		}
		if(socialMediaPostingList.size() == 0) {
			socialMediaPostingList.add(socialMediaPosting);
		} else {
			socialMediaPostingList.set(0, socialMediaPosting);
		}
	}

	@Override
	public List<SocialMediaPosting> getSocialMediaPostingList() {
		return socialMediaPostingList;
	}

	@Override
	public void setSocialMediaPostingList(List<SocialMediaPosting> socialMediaPostingList) {
		this.socialMediaPostingList = socialMediaPostingList;
	}

	@Override
	public boolean hasSocialMediaPosting() {
		return socialMediaPostingList != null && socialMediaPostingList.size() > 0 && socialMediaPostingList.get(0) != null;
	}

	public ITEM_REVIEWED(SoftwareApplication softwareApplication) {
		softwareApplicationList = new ArrayList<SoftwareApplication>();
		softwareApplicationList.add(softwareApplication);
	}

	@Override
	public SoftwareApplication getSoftwareApplication() {
		if(softwareApplicationList != null && softwareApplicationList.size() > 0) {
			return softwareApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSoftwareApplication(SoftwareApplication softwareApplication) {
		if(softwareApplicationList == null) {
			softwareApplicationList = new ArrayList<>();
		}
		if(softwareApplicationList.size() == 0) {
			softwareApplicationList.add(softwareApplication);
		} else {
			softwareApplicationList.set(0, softwareApplication);
		}
	}

	@Override
	public List<SoftwareApplication> getSoftwareApplicationList() {
		return softwareApplicationList;
	}

	@Override
	public void setSoftwareApplicationList(List<SoftwareApplication> softwareApplicationList) {
		this.softwareApplicationList = softwareApplicationList;
	}

	@Override
	public boolean hasSoftwareApplication() {
		return softwareApplicationList != null && softwareApplicationList.size() > 0 && softwareApplicationList.get(0) != null;
	}

	public ITEM_REVIEWED(SoftwareSourceCode softwareSourceCode) {
		softwareSourceCodeList = new ArrayList<SoftwareSourceCode>();
		softwareSourceCodeList.add(softwareSourceCode);
	}

	@Override
	public SoftwareSourceCode getSoftwareSourceCode() {
		if(softwareSourceCodeList != null && softwareSourceCodeList.size() > 0) {
			return softwareSourceCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSoftwareSourceCode(SoftwareSourceCode softwareSourceCode) {
		if(softwareSourceCodeList == null) {
			softwareSourceCodeList = new ArrayList<>();
		}
		if(softwareSourceCodeList.size() == 0) {
			softwareSourceCodeList.add(softwareSourceCode);
		} else {
			softwareSourceCodeList.set(0, softwareSourceCode);
		}
	}

	@Override
	public List<SoftwareSourceCode> getSoftwareSourceCodeList() {
		return softwareSourceCodeList;
	}

	@Override
	public void setSoftwareSourceCodeList(List<SoftwareSourceCode> softwareSourceCodeList) {
		this.softwareSourceCodeList = softwareSourceCodeList;
	}

	@Override
	public boolean hasSoftwareSourceCode() {
		return softwareSourceCodeList != null && softwareSourceCodeList.size() > 0 && softwareSourceCodeList.get(0) != null;
	}

	public ITEM_REVIEWED(SomeProducts someProducts) {
		someProductsList = new ArrayList<SomeProducts>();
		someProductsList.add(someProducts);
	}

	@Override
	public SomeProducts getSomeProducts() {
		if(someProductsList != null && someProductsList.size() > 0) {
			return someProductsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSomeProducts(SomeProducts someProducts) {
		if(someProductsList == null) {
			someProductsList = new ArrayList<>();
		}
		if(someProductsList.size() == 0) {
			someProductsList.add(someProducts);
		} else {
			someProductsList.set(0, someProducts);
		}
	}

	@Override
	public List<SomeProducts> getSomeProductsList() {
		return someProductsList;
	}

	@Override
	public void setSomeProductsList(List<SomeProducts> someProductsList) {
		this.someProductsList = someProductsList;
	}

	@Override
	public boolean hasSomeProducts() {
		return someProductsList != null && someProductsList.size() > 0 && someProductsList.get(0) != null;
	}

	public ITEM_REVIEWED(SpeakableSpecification speakableSpecification) {
		speakableSpecificationList = new ArrayList<SpeakableSpecification>();
		speakableSpecificationList.add(speakableSpecification);
	}

	@Override
	public SpeakableSpecification getSpeakableSpecification() {
		if(speakableSpecificationList != null && speakableSpecificationList.size() > 0) {
			return speakableSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSpeakableSpecification(SpeakableSpecification speakableSpecification) {
		if(speakableSpecificationList == null) {
			speakableSpecificationList = new ArrayList<>();
		}
		if(speakableSpecificationList.size() == 0) {
			speakableSpecificationList.add(speakableSpecification);
		} else {
			speakableSpecificationList.set(0, speakableSpecification);
		}
	}

	@Override
	public List<SpeakableSpecification> getSpeakableSpecificationList() {
		return speakableSpecificationList;
	}

	@Override
	public void setSpeakableSpecificationList(List<SpeakableSpecification> speakableSpecificationList) {
		this.speakableSpecificationList = speakableSpecificationList;
	}

	@Override
	public boolean hasSpeakableSpecification() {
		return speakableSpecificationList != null && speakableSpecificationList.size() > 0 && speakableSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(Specialty specialty) {
		specialtyList = new ArrayList<Specialty>();
		specialtyList.add(specialty);
	}

	@Override
	public Specialty getSpecialty() {
		if(specialtyList != null && specialtyList.size() > 0) {
			return specialtyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSpecialty(Specialty specialty) {
		if(specialtyList == null) {
			specialtyList = new ArrayList<>();
		}
		if(specialtyList.size() == 0) {
			specialtyList.add(specialty);
		} else {
			specialtyList.set(0, specialty);
		}
	}

	@Override
	public List<Specialty> getSpecialtyList() {
		return specialtyList;
	}

	@Override
	public void setSpecialtyList(List<Specialty> specialtyList) {
		this.specialtyList = specialtyList;
	}

	@Override
	public boolean hasSpecialty() {
		return specialtyList != null && specialtyList.size() > 0 && specialtyList.get(0) != null;
	}

	public ITEM_REVIEWED(SportingGoodsStore sportingGoodsStore) {
		sportingGoodsStoreList = new ArrayList<SportingGoodsStore>();
		sportingGoodsStoreList.add(sportingGoodsStore);
	}

	@Override
	public SportingGoodsStore getSportingGoodsStore() {
		if(sportingGoodsStoreList != null && sportingGoodsStoreList.size() > 0) {
			return sportingGoodsStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportingGoodsStore(SportingGoodsStore sportingGoodsStore) {
		if(sportingGoodsStoreList == null) {
			sportingGoodsStoreList = new ArrayList<>();
		}
		if(sportingGoodsStoreList.size() == 0) {
			sportingGoodsStoreList.add(sportingGoodsStore);
		} else {
			sportingGoodsStoreList.set(0, sportingGoodsStore);
		}
	}

	@Override
	public List<SportingGoodsStore> getSportingGoodsStoreList() {
		return sportingGoodsStoreList;
	}

	@Override
	public void setSportingGoodsStoreList(List<SportingGoodsStore> sportingGoodsStoreList) {
		this.sportingGoodsStoreList = sportingGoodsStoreList;
	}

	@Override
	public boolean hasSportingGoodsStore() {
		return sportingGoodsStoreList != null && sportingGoodsStoreList.size() > 0 && sportingGoodsStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(SportsActivityLocation sportsActivityLocation) {
		sportsActivityLocationList = new ArrayList<SportsActivityLocation>();
		sportsActivityLocationList.add(sportsActivityLocation);
	}

	@Override
	public SportsActivityLocation getSportsActivityLocation() {
		if(sportsActivityLocationList != null && sportsActivityLocationList.size() > 0) {
			return sportsActivityLocationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation) {
		if(sportsActivityLocationList == null) {
			sportsActivityLocationList = new ArrayList<>();
		}
		if(sportsActivityLocationList.size() == 0) {
			sportsActivityLocationList.add(sportsActivityLocation);
		} else {
			sportsActivityLocationList.set(0, sportsActivityLocation);
		}
	}

	@Override
	public List<SportsActivityLocation> getSportsActivityLocationList() {
		return sportsActivityLocationList;
	}

	@Override
	public void setSportsActivityLocationList(List<SportsActivityLocation> sportsActivityLocationList) {
		this.sportsActivityLocationList = sportsActivityLocationList;
	}

	@Override
	public boolean hasSportsActivityLocation() {
		return sportsActivityLocationList != null && sportsActivityLocationList.size() > 0 && sportsActivityLocationList.get(0) != null;
	}

	public ITEM_REVIEWED(SportsClub sportsClub) {
		sportsClubList = new ArrayList<SportsClub>();
		sportsClubList.add(sportsClub);
	}

	@Override
	public SportsClub getSportsClub() {
		if(sportsClubList != null && sportsClubList.size() > 0) {
			return sportsClubList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsClub(SportsClub sportsClub) {
		if(sportsClubList == null) {
			sportsClubList = new ArrayList<>();
		}
		if(sportsClubList.size() == 0) {
			sportsClubList.add(sportsClub);
		} else {
			sportsClubList.set(0, sportsClub);
		}
	}

	@Override
	public List<SportsClub> getSportsClubList() {
		return sportsClubList;
	}

	@Override
	public void setSportsClubList(List<SportsClub> sportsClubList) {
		this.sportsClubList = sportsClubList;
	}

	@Override
	public boolean hasSportsClub() {
		return sportsClubList != null && sportsClubList.size() > 0 && sportsClubList.get(0) != null;
	}

	public ITEM_REVIEWED(SportsEvent sportsEvent) {
		sportsEventList = new ArrayList<SportsEvent>();
		sportsEventList.add(sportsEvent);
	}

	@Override
	public SportsEvent getSportsEvent() {
		if(sportsEventList != null && sportsEventList.size() > 0) {
			return sportsEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsEvent(SportsEvent sportsEvent) {
		if(sportsEventList == null) {
			sportsEventList = new ArrayList<>();
		}
		if(sportsEventList.size() == 0) {
			sportsEventList.add(sportsEvent);
		} else {
			sportsEventList.set(0, sportsEvent);
		}
	}

	@Override
	public List<SportsEvent> getSportsEventList() {
		return sportsEventList;
	}

	@Override
	public void setSportsEventList(List<SportsEvent> sportsEventList) {
		this.sportsEventList = sportsEventList;
	}

	@Override
	public boolean hasSportsEvent() {
		return sportsEventList != null && sportsEventList.size() > 0 && sportsEventList.get(0) != null;
	}

	public ITEM_REVIEWED(SportsOrganization sportsOrganization) {
		sportsOrganizationList = new ArrayList<SportsOrganization>();
		sportsOrganizationList.add(sportsOrganization);
	}

	@Override
	public SportsOrganization getSportsOrganization() {
		if(sportsOrganizationList != null && sportsOrganizationList.size() > 0) {
			return sportsOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsOrganization(SportsOrganization sportsOrganization) {
		if(sportsOrganizationList == null) {
			sportsOrganizationList = new ArrayList<>();
		}
		if(sportsOrganizationList.size() == 0) {
			sportsOrganizationList.add(sportsOrganization);
		} else {
			sportsOrganizationList.set(0, sportsOrganization);
		}
	}

	@Override
	public List<SportsOrganization> getSportsOrganizationList() {
		return sportsOrganizationList;
	}

	@Override
	public void setSportsOrganizationList(List<SportsOrganization> sportsOrganizationList) {
		this.sportsOrganizationList = sportsOrganizationList;
	}

	@Override
	public boolean hasSportsOrganization() {
		return sportsOrganizationList != null && sportsOrganizationList.size() > 0 && sportsOrganizationList.get(0) != null;
	}

	public ITEM_REVIEWED(SportsTeam sportsTeam) {
		sportsTeamList = new ArrayList<SportsTeam>();
		sportsTeamList.add(sportsTeam);
	}

	@Override
	public SportsTeam getSportsTeam() {
		if(sportsTeamList != null && sportsTeamList.size() > 0) {
			return sportsTeamList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsTeam(SportsTeam sportsTeam) {
		if(sportsTeamList == null) {
			sportsTeamList = new ArrayList<>();
		}
		if(sportsTeamList.size() == 0) {
			sportsTeamList.add(sportsTeam);
		} else {
			sportsTeamList.set(0, sportsTeam);
		}
	}

	@Override
	public List<SportsTeam> getSportsTeamList() {
		return sportsTeamList;
	}

	@Override
	public void setSportsTeamList(List<SportsTeam> sportsTeamList) {
		this.sportsTeamList = sportsTeamList;
	}

	@Override
	public boolean hasSportsTeam() {
		return sportsTeamList != null && sportsTeamList.size() > 0 && sportsTeamList.get(0) != null;
	}

	public ITEM_REVIEWED(SpreadsheetDigitalDocument spreadsheetDigitalDocument) {
		spreadsheetDigitalDocumentList = new ArrayList<SpreadsheetDigitalDocument>();
		spreadsheetDigitalDocumentList.add(spreadsheetDigitalDocument);
	}

	@Override
	public SpreadsheetDigitalDocument getSpreadsheetDigitalDocument() {
		if(spreadsheetDigitalDocumentList != null && spreadsheetDigitalDocumentList.size() > 0) {
			return spreadsheetDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSpreadsheetDigitalDocument(SpreadsheetDigitalDocument spreadsheetDigitalDocument) {
		if(spreadsheetDigitalDocumentList == null) {
			spreadsheetDigitalDocumentList = new ArrayList<>();
		}
		if(spreadsheetDigitalDocumentList.size() == 0) {
			spreadsheetDigitalDocumentList.add(spreadsheetDigitalDocument);
		} else {
			spreadsheetDigitalDocumentList.set(0, spreadsheetDigitalDocument);
		}
	}

	@Override
	public List<SpreadsheetDigitalDocument> getSpreadsheetDigitalDocumentList() {
		return spreadsheetDigitalDocumentList;
	}

	@Override
	public void setSpreadsheetDigitalDocumentList(List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList) {
		this.spreadsheetDigitalDocumentList = spreadsheetDigitalDocumentList;
	}

	@Override
	public boolean hasSpreadsheetDigitalDocument() {
		return spreadsheetDigitalDocumentList != null && spreadsheetDigitalDocumentList.size() > 0 && spreadsheetDigitalDocumentList.get(0) != null;
	}

	public ITEM_REVIEWED(StadiumOrArena stadiumOrArena) {
		stadiumOrArenaList = new ArrayList<StadiumOrArena>();
		stadiumOrArenaList.add(stadiumOrArena);
	}

	@Override
	public StadiumOrArena getStadiumOrArena() {
		if(stadiumOrArenaList != null && stadiumOrArenaList.size() > 0) {
			return stadiumOrArenaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setStadiumOrArena(StadiumOrArena stadiumOrArena) {
		if(stadiumOrArenaList == null) {
			stadiumOrArenaList = new ArrayList<>();
		}
		if(stadiumOrArenaList.size() == 0) {
			stadiumOrArenaList.add(stadiumOrArena);
		} else {
			stadiumOrArenaList.set(0, stadiumOrArena);
		}
	}

	@Override
	public List<StadiumOrArena> getStadiumOrArenaList() {
		return stadiumOrArenaList;
	}

	@Override
	public void setStadiumOrArenaList(List<StadiumOrArena> stadiumOrArenaList) {
		this.stadiumOrArenaList = stadiumOrArenaList;
	}

	@Override
	public boolean hasStadiumOrArena() {
		return stadiumOrArenaList != null && stadiumOrArenaList.size() > 0 && stadiumOrArenaList.get(0) != null;
	}

	public ITEM_REVIEWED(State state) {
		stateList = new ArrayList<State>();
		stateList.add(state);
	}

	@Override
	public State getState() {
		if(stateList != null && stateList.size() > 0) {
			return stateList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setState(State state) {
		if(stateList == null) {
			stateList = new ArrayList<>();
		}
		if(stateList.size() == 0) {
			stateList.add(state);
		} else {
			stateList.set(0, state);
		}
	}

	@Override
	public List<State> getStateList() {
		return stateList;
	}

	@Override
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

	@Override
	public boolean hasState() {
		return stateList != null && stateList.size() > 0 && stateList.get(0) != null;
	}

	public ITEM_REVIEWED(SteeringPositionValue steeringPositionValue) {
		steeringPositionValueList = new ArrayList<SteeringPositionValue>();
		steeringPositionValueList.add(steeringPositionValue);
	}

	@Override
	public SteeringPositionValue getSteeringPositionValue() {
		if(steeringPositionValueList != null && steeringPositionValueList.size() > 0) {
			return steeringPositionValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSteeringPositionValue(SteeringPositionValue steeringPositionValue) {
		if(steeringPositionValueList == null) {
			steeringPositionValueList = new ArrayList<>();
		}
		if(steeringPositionValueList.size() == 0) {
			steeringPositionValueList.add(steeringPositionValue);
		} else {
			steeringPositionValueList.set(0, steeringPositionValue);
		}
	}

	@Override
	public List<SteeringPositionValue> getSteeringPositionValueList() {
		return steeringPositionValueList;
	}

	@Override
	public void setSteeringPositionValueList(List<SteeringPositionValue> steeringPositionValueList) {
		this.steeringPositionValueList = steeringPositionValueList;
	}

	@Override
	public boolean hasSteeringPositionValue() {
		return steeringPositionValueList != null && steeringPositionValueList.size() > 0 && steeringPositionValueList.get(0) != null;
	}

	public ITEM_REVIEWED(Store store) {
		storeList = new ArrayList<Store>();
		storeList.add(store);
	}

	@Override
	public Store getStore() {
		if(storeList != null && storeList.size() > 0) {
			return storeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setStore(Store store) {
		if(storeList == null) {
			storeList = new ArrayList<>();
		}
		if(storeList.size() == 0) {
			storeList.add(store);
		} else {
			storeList.set(0, store);
		}
	}

	@Override
	public List<Store> getStoreList() {
		return storeList;
	}

	@Override
	public void setStoreList(List<Store> storeList) {
		this.storeList = storeList;
	}

	@Override
	public boolean hasStore() {
		return storeList != null && storeList.size() > 0 && storeList.get(0) != null;
	}

	public ITEM_REVIEWED(StructuredValue structuredValue) {
		structuredValueList = new ArrayList<StructuredValue>();
		structuredValueList.add(structuredValue);
	}

	@Override
	public StructuredValue getStructuredValue() {
		if(structuredValueList != null && structuredValueList.size() > 0) {
			return structuredValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setStructuredValue(StructuredValue structuredValue) {
		if(structuredValueList == null) {
			structuredValueList = new ArrayList<>();
		}
		if(structuredValueList.size() == 0) {
			structuredValueList.add(structuredValue);
		} else {
			structuredValueList.set(0, structuredValue);
		}
	}

	@Override
	public List<StructuredValue> getStructuredValueList() {
		return structuredValueList;
	}

	@Override
	public void setStructuredValueList(List<StructuredValue> structuredValueList) {
		this.structuredValueList = structuredValueList;
	}

	@Override
	public boolean hasStructuredValue() {
		return structuredValueList != null && structuredValueList.size() > 0 && structuredValueList.get(0) != null;
	}

	public ITEM_REVIEWED(SubscribeAction subscribeAction) {
		subscribeActionList = new ArrayList<SubscribeAction>();
		subscribeActionList.add(subscribeAction);
	}

	@Override
	public SubscribeAction getSubscribeAction() {
		if(subscribeActionList != null && subscribeActionList.size() > 0) {
			return subscribeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSubscribeAction(SubscribeAction subscribeAction) {
		if(subscribeActionList == null) {
			subscribeActionList = new ArrayList<>();
		}
		if(subscribeActionList.size() == 0) {
			subscribeActionList.add(subscribeAction);
		} else {
			subscribeActionList.set(0, subscribeAction);
		}
	}

	@Override
	public List<SubscribeAction> getSubscribeActionList() {
		return subscribeActionList;
	}

	@Override
	public void setSubscribeActionList(List<SubscribeAction> subscribeActionList) {
		this.subscribeActionList = subscribeActionList;
	}

	@Override
	public boolean hasSubscribeAction() {
		return subscribeActionList != null && subscribeActionList.size() > 0 && subscribeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Substance substance) {
		substanceList = new ArrayList<Substance>();
		substanceList.add(substance);
	}

	@Override
	public Substance getSubstance() {
		if(substanceList != null && substanceList.size() > 0) {
			return substanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSubstance(Substance substance) {
		if(substanceList == null) {
			substanceList = new ArrayList<>();
		}
		if(substanceList.size() == 0) {
			substanceList.add(substance);
		} else {
			substanceList.set(0, substance);
		}
	}

	@Override
	public List<Substance> getSubstanceList() {
		return substanceList;
	}

	@Override
	public void setSubstanceList(List<Substance> substanceList) {
		this.substanceList = substanceList;
	}

	@Override
	public boolean hasSubstance() {
		return substanceList != null && substanceList.size() > 0 && substanceList.get(0) != null;
	}

	public ITEM_REVIEWED(SubwayStation subwayStation) {
		subwayStationList = new ArrayList<SubwayStation>();
		subwayStationList.add(subwayStation);
	}

	@Override
	public SubwayStation getSubwayStation() {
		if(subwayStationList != null && subwayStationList.size() > 0) {
			return subwayStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSubwayStation(SubwayStation subwayStation) {
		if(subwayStationList == null) {
			subwayStationList = new ArrayList<>();
		}
		if(subwayStationList.size() == 0) {
			subwayStationList.add(subwayStation);
		} else {
			subwayStationList.set(0, subwayStation);
		}
	}

	@Override
	public List<SubwayStation> getSubwayStationList() {
		return subwayStationList;
	}

	@Override
	public void setSubwayStationList(List<SubwayStation> subwayStationList) {
		this.subwayStationList = subwayStationList;
	}

	@Override
	public boolean hasSubwayStation() {
		return subwayStationList != null && subwayStationList.size() > 0 && subwayStationList.get(0) != null;
	}

	public ITEM_REVIEWED(Suite suite) {
		suiteList = new ArrayList<Suite>();
		suiteList.add(suite);
	}

	@Override
	public Suite getSuite() {
		if(suiteList != null && suiteList.size() > 0) {
			return suiteList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuite(Suite suite) {
		if(suiteList == null) {
			suiteList = new ArrayList<>();
		}
		if(suiteList.size() == 0) {
			suiteList.add(suite);
		} else {
			suiteList.set(0, suite);
		}
	}

	@Override
	public List<Suite> getSuiteList() {
		return suiteList;
	}

	@Override
	public void setSuiteList(List<Suite> suiteList) {
		this.suiteList = suiteList;
	}

	@Override
	public boolean hasSuite() {
		return suiteList != null && suiteList.size() > 0 && suiteList.get(0) != null;
	}

	public ITEM_REVIEWED(SuperficialAnatomy superficialAnatomy) {
		superficialAnatomyList = new ArrayList<SuperficialAnatomy>();
		superficialAnatomyList.add(superficialAnatomy);
	}

	@Override
	public SuperficialAnatomy getSuperficialAnatomy() {
		if(superficialAnatomyList != null && superficialAnatomyList.size() > 0) {
			return superficialAnatomyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuperficialAnatomy(SuperficialAnatomy superficialAnatomy) {
		if(superficialAnatomyList == null) {
			superficialAnatomyList = new ArrayList<>();
		}
		if(superficialAnatomyList.size() == 0) {
			superficialAnatomyList.add(superficialAnatomy);
		} else {
			superficialAnatomyList.set(0, superficialAnatomy);
		}
	}

	@Override
	public List<SuperficialAnatomy> getSuperficialAnatomyList() {
		return superficialAnatomyList;
	}

	@Override
	public void setSuperficialAnatomyList(List<SuperficialAnatomy> superficialAnatomyList) {
		this.superficialAnatomyList = superficialAnatomyList;
	}

	@Override
	public boolean hasSuperficialAnatomy() {
		return superficialAnatomyList != null && superficialAnatomyList.size() > 0 && superficialAnatomyList.get(0) != null;
	}

	public ITEM_REVIEWED(SurgicalProcedure surgicalProcedure) {
		surgicalProcedureList = new ArrayList<SurgicalProcedure>();
		surgicalProcedureList.add(surgicalProcedure);
	}

	@Override
	public SurgicalProcedure getSurgicalProcedure() {
		if(surgicalProcedureList != null && surgicalProcedureList.size() > 0) {
			return surgicalProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure) {
		if(surgicalProcedureList == null) {
			surgicalProcedureList = new ArrayList<>();
		}
		if(surgicalProcedureList.size() == 0) {
			surgicalProcedureList.add(surgicalProcedure);
		} else {
			surgicalProcedureList.set(0, surgicalProcedure);
		}
	}

	@Override
	public List<SurgicalProcedure> getSurgicalProcedureList() {
		return surgicalProcedureList;
	}

	@Override
	public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList) {
		this.surgicalProcedureList = surgicalProcedureList;
	}

	@Override
	public boolean hasSurgicalProcedure() {
		return surgicalProcedureList != null && surgicalProcedureList.size() > 0 && surgicalProcedureList.get(0) != null;
	}

	public ITEM_REVIEWED(SuspendAction suspendAction) {
		suspendActionList = new ArrayList<SuspendAction>();
		suspendActionList.add(suspendAction);
	}

	@Override
	public SuspendAction getSuspendAction() {
		if(suspendActionList != null && suspendActionList.size() > 0) {
			return suspendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuspendAction(SuspendAction suspendAction) {
		if(suspendActionList == null) {
			suspendActionList = new ArrayList<>();
		}
		if(suspendActionList.size() == 0) {
			suspendActionList.add(suspendAction);
		} else {
			suspendActionList.set(0, suspendAction);
		}
	}

	@Override
	public List<SuspendAction> getSuspendActionList() {
		return suspendActionList;
	}

	@Override
	public void setSuspendActionList(List<SuspendAction> suspendActionList) {
		this.suspendActionList = suspendActionList;
	}

	@Override
	public boolean hasSuspendAction() {
		return suspendActionList != null && suspendActionList.size() > 0 && suspendActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Synagogue synagogue) {
		synagogueList = new ArrayList<Synagogue>();
		synagogueList.add(synagogue);
	}

	@Override
	public Synagogue getSynagogue() {
		if(synagogueList != null && synagogueList.size() > 0) {
			return synagogueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSynagogue(Synagogue synagogue) {
		if(synagogueList == null) {
			synagogueList = new ArrayList<>();
		}
		if(synagogueList.size() == 0) {
			synagogueList.add(synagogue);
		} else {
			synagogueList.set(0, synagogue);
		}
	}

	@Override
	public List<Synagogue> getSynagogueList() {
		return synagogueList;
	}

	@Override
	public void setSynagogueList(List<Synagogue> synagogueList) {
		this.synagogueList = synagogueList;
	}

	@Override
	public boolean hasSynagogue() {
		return synagogueList != null && synagogueList.size() > 0 && synagogueList.get(0) != null;
	}

	public ITEM_REVIEWED(TVClip tvClip) {
		tvClipList = new ArrayList<TVClip>();
		tvClipList.add(tvClip);
	}

	@Override
	public TVClip getTVClip() {
		if(tvClipList != null && tvClipList.size() > 0) {
			return tvClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVClip(TVClip tvClip) {
		if(tvClipList == null) {
			tvClipList = new ArrayList<>();
		}
		if(tvClipList.size() == 0) {
			tvClipList.add(tvClip);
		} else {
			tvClipList.set(0, tvClip);
		}
	}

	@Override
	public List<TVClip> getTVClipList() {
		return tvClipList;
	}

	@Override
	public void setTVClipList(List<TVClip> tvClipList) {
		this.tvClipList = tvClipList;
	}

	@Override
	public boolean hasTVClip() {
		return tvClipList != null && tvClipList.size() > 0 && tvClipList.get(0) != null;
	}

	public ITEM_REVIEWED(TVEpisode tvEpisode) {
		tvEpisodeList = new ArrayList<TVEpisode>();
		tvEpisodeList.add(tvEpisode);
	}

	@Override
	public TVEpisode getTVEpisode() {
		if(tvEpisodeList != null && tvEpisodeList.size() > 0) {
			return tvEpisodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVEpisode(TVEpisode tvEpisode) {
		if(tvEpisodeList == null) {
			tvEpisodeList = new ArrayList<>();
		}
		if(tvEpisodeList.size() == 0) {
			tvEpisodeList.add(tvEpisode);
		} else {
			tvEpisodeList.set(0, tvEpisode);
		}
	}

	@Override
	public List<TVEpisode> getTVEpisodeList() {
		return tvEpisodeList;
	}

	@Override
	public void setTVEpisodeList(List<TVEpisode> tvEpisodeList) {
		this.tvEpisodeList = tvEpisodeList;
	}

	@Override
	public boolean hasTVEpisode() {
		return tvEpisodeList != null && tvEpisodeList.size() > 0 && tvEpisodeList.get(0) != null;
	}

	public ITEM_REVIEWED(TVSeason tvSeason) {
		tvSeasonList = new ArrayList<TVSeason>();
		tvSeasonList.add(tvSeason);
	}

	@Override
	public TVSeason getTVSeason() {
		if(tvSeasonList != null && tvSeasonList.size() > 0) {
			return tvSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVSeason(TVSeason tvSeason) {
		if(tvSeasonList == null) {
			tvSeasonList = new ArrayList<>();
		}
		if(tvSeasonList.size() == 0) {
			tvSeasonList.add(tvSeason);
		} else {
			tvSeasonList.set(0, tvSeason);
		}
	}

	@Override
	public List<TVSeason> getTVSeasonList() {
		return tvSeasonList;
	}

	@Override
	public void setTVSeasonList(List<TVSeason> tvSeasonList) {
		this.tvSeasonList = tvSeasonList;
	}

	@Override
	public boolean hasTVSeason() {
		return tvSeasonList != null && tvSeasonList.size() > 0 && tvSeasonList.get(0) != null;
	}

	public ITEM_REVIEWED(TVSeries tvSeries) {
		tvSeriesList = new ArrayList<TVSeries>();
		tvSeriesList.add(tvSeries);
	}

	@Override
	public TVSeries getTVSeries() {
		if(tvSeriesList != null && tvSeriesList.size() > 0) {
			return tvSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVSeries(TVSeries tvSeries) {
		if(tvSeriesList == null) {
			tvSeriesList = new ArrayList<>();
		}
		if(tvSeriesList.size() == 0) {
			tvSeriesList.add(tvSeries);
		} else {
			tvSeriesList.set(0, tvSeries);
		}
	}

	@Override
	public List<TVSeries> getTVSeriesList() {
		return tvSeriesList;
	}

	@Override
	public void setTVSeriesList(List<TVSeries> tvSeriesList) {
		this.tvSeriesList = tvSeriesList;
	}

	@Override
	public boolean hasTVSeries() {
		return tvSeriesList != null && tvSeriesList.size() > 0 && tvSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(Table table) {
		tableList = new ArrayList<Table>();
		tableList.add(table);
	}

	@Override
	public Table getTable() {
		if(tableList != null && tableList.size() > 0) {
			return tableList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTable(Table table) {
		if(tableList == null) {
			tableList = new ArrayList<>();
		}
		if(tableList.size() == 0) {
			tableList.add(table);
		} else {
			tableList.set(0, table);
		}
	}

	@Override
	public List<Table> getTableList() {
		return tableList;
	}

	@Override
	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	@Override
	public boolean hasTable() {
		return tableList != null && tableList.size() > 0 && tableList.get(0) != null;
	}

	public ITEM_REVIEWED(TakeAction takeAction) {
		takeActionList = new ArrayList<TakeAction>();
		takeActionList.add(takeAction);
	}

	@Override
	public TakeAction getTakeAction() {
		if(takeActionList != null && takeActionList.size() > 0) {
			return takeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTakeAction(TakeAction takeAction) {
		if(takeActionList == null) {
			takeActionList = new ArrayList<>();
		}
		if(takeActionList.size() == 0) {
			takeActionList.add(takeAction);
		} else {
			takeActionList.set(0, takeAction);
		}
	}

	@Override
	public List<TakeAction> getTakeActionList() {
		return takeActionList;
	}

	@Override
	public void setTakeActionList(List<TakeAction> takeActionList) {
		this.takeActionList = takeActionList;
	}

	@Override
	public boolean hasTakeAction() {
		return takeActionList != null && takeActionList.size() > 0 && takeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TattooParlor tattooParlor) {
		tattooParlorList = new ArrayList<TattooParlor>();
		tattooParlorList.add(tattooParlor);
	}

	@Override
	public TattooParlor getTattooParlor() {
		if(tattooParlorList != null && tattooParlorList.size() > 0) {
			return tattooParlorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTattooParlor(TattooParlor tattooParlor) {
		if(tattooParlorList == null) {
			tattooParlorList = new ArrayList<>();
		}
		if(tattooParlorList.size() == 0) {
			tattooParlorList.add(tattooParlor);
		} else {
			tattooParlorList.set(0, tattooParlor);
		}
	}

	@Override
	public List<TattooParlor> getTattooParlorList() {
		return tattooParlorList;
	}

	@Override
	public void setTattooParlorList(List<TattooParlor> tattooParlorList) {
		this.tattooParlorList = tattooParlorList;
	}

	@Override
	public boolean hasTattooParlor() {
		return tattooParlorList != null && tattooParlorList.size() > 0 && tattooParlorList.get(0) != null;
	}

	public ITEM_REVIEWED(TaxiReservation taxiReservation) {
		taxiReservationList = new ArrayList<TaxiReservation>();
		taxiReservationList.add(taxiReservation);
	}

	@Override
	public TaxiReservation getTaxiReservation() {
		if(taxiReservationList != null && taxiReservationList.size() > 0) {
			return taxiReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTaxiReservation(TaxiReservation taxiReservation) {
		if(taxiReservationList == null) {
			taxiReservationList = new ArrayList<>();
		}
		if(taxiReservationList.size() == 0) {
			taxiReservationList.add(taxiReservation);
		} else {
			taxiReservationList.set(0, taxiReservation);
		}
	}

	@Override
	public List<TaxiReservation> getTaxiReservationList() {
		return taxiReservationList;
	}

	@Override
	public void setTaxiReservationList(List<TaxiReservation> taxiReservationList) {
		this.taxiReservationList = taxiReservationList;
	}

	@Override
	public boolean hasTaxiReservation() {
		return taxiReservationList != null && taxiReservationList.size() > 0 && taxiReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(TaxiService taxiService) {
		taxiServiceList = new ArrayList<TaxiService>();
		taxiServiceList.add(taxiService);
	}

	@Override
	public TaxiService getTaxiService() {
		if(taxiServiceList != null && taxiServiceList.size() > 0) {
			return taxiServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTaxiService(TaxiService taxiService) {
		if(taxiServiceList == null) {
			taxiServiceList = new ArrayList<>();
		}
		if(taxiServiceList.size() == 0) {
			taxiServiceList.add(taxiService);
		} else {
			taxiServiceList.set(0, taxiService);
		}
	}

	@Override
	public List<TaxiService> getTaxiServiceList() {
		return taxiServiceList;
	}

	@Override
	public void setTaxiServiceList(List<TaxiService> taxiServiceList) {
		this.taxiServiceList = taxiServiceList;
	}

	@Override
	public boolean hasTaxiService() {
		return taxiServiceList != null && taxiServiceList.size() > 0 && taxiServiceList.get(0) != null;
	}

	public ITEM_REVIEWED(TaxiStand taxiStand) {
		taxiStandList = new ArrayList<TaxiStand>();
		taxiStandList.add(taxiStand);
	}

	@Override
	public TaxiStand getTaxiStand() {
		if(taxiStandList != null && taxiStandList.size() > 0) {
			return taxiStandList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTaxiStand(TaxiStand taxiStand) {
		if(taxiStandList == null) {
			taxiStandList = new ArrayList<>();
		}
		if(taxiStandList.size() == 0) {
			taxiStandList.add(taxiStand);
		} else {
			taxiStandList.set(0, taxiStand);
		}
	}

	@Override
	public List<TaxiStand> getTaxiStandList() {
		return taxiStandList;
	}

	@Override
	public void setTaxiStandList(List<TaxiStand> taxiStandList) {
		this.taxiStandList = taxiStandList;
	}

	@Override
	public boolean hasTaxiStand() {
		return taxiStandList != null && taxiStandList.size() > 0 && taxiStandList.get(0) != null;
	}

	public ITEM_REVIEWED(TechArticle techArticle) {
		techArticleList = new ArrayList<TechArticle>();
		techArticleList.add(techArticle);
	}

	@Override
	public TechArticle getTechArticle() {
		if(techArticleList != null && techArticleList.size() > 0) {
			return techArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTechArticle(TechArticle techArticle) {
		if(techArticleList == null) {
			techArticleList = new ArrayList<>();
		}
		if(techArticleList.size() == 0) {
			techArticleList.add(techArticle);
		} else {
			techArticleList.set(0, techArticle);
		}
	}

	@Override
	public List<TechArticle> getTechArticleList() {
		return techArticleList;
	}

	@Override
	public void setTechArticleList(List<TechArticle> techArticleList) {
		this.techArticleList = techArticleList;
	}

	@Override
	public boolean hasTechArticle() {
		return techArticleList != null && techArticleList.size() > 0 && techArticleList.get(0) != null;
	}

	public ITEM_REVIEWED(TelevisionChannel televisionChannel) {
		televisionChannelList = new ArrayList<TelevisionChannel>();
		televisionChannelList.add(televisionChannel);
	}

	@Override
	public TelevisionChannel getTelevisionChannel() {
		if(televisionChannelList != null && televisionChannelList.size() > 0) {
			return televisionChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTelevisionChannel(TelevisionChannel televisionChannel) {
		if(televisionChannelList == null) {
			televisionChannelList = new ArrayList<>();
		}
		if(televisionChannelList.size() == 0) {
			televisionChannelList.add(televisionChannel);
		} else {
			televisionChannelList.set(0, televisionChannel);
		}
	}

	@Override
	public List<TelevisionChannel> getTelevisionChannelList() {
		return televisionChannelList;
	}

	@Override
	public void setTelevisionChannelList(List<TelevisionChannel> televisionChannelList) {
		this.televisionChannelList = televisionChannelList;
	}

	@Override
	public boolean hasTelevisionChannel() {
		return televisionChannelList != null && televisionChannelList.size() > 0 && televisionChannelList.get(0) != null;
	}

	public ITEM_REVIEWED(TelevisionStation televisionStation) {
		televisionStationList = new ArrayList<TelevisionStation>();
		televisionStationList.add(televisionStation);
	}

	@Override
	public TelevisionStation getTelevisionStation() {
		if(televisionStationList != null && televisionStationList.size() > 0) {
			return televisionStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTelevisionStation(TelevisionStation televisionStation) {
		if(televisionStationList == null) {
			televisionStationList = new ArrayList<>();
		}
		if(televisionStationList.size() == 0) {
			televisionStationList.add(televisionStation);
		} else {
			televisionStationList.set(0, televisionStation);
		}
	}

	@Override
	public List<TelevisionStation> getTelevisionStationList() {
		return televisionStationList;
	}

	@Override
	public void setTelevisionStationList(List<TelevisionStation> televisionStationList) {
		this.televisionStationList = televisionStationList;
	}

	@Override
	public boolean hasTelevisionStation() {
		return televisionStationList != null && televisionStationList.size() > 0 && televisionStationList.get(0) != null;
	}

	public ITEM_REVIEWED(TennisComplex tennisComplex) {
		tennisComplexList = new ArrayList<TennisComplex>();
		tennisComplexList.add(tennisComplex);
	}

	@Override
	public TennisComplex getTennisComplex() {
		if(tennisComplexList != null && tennisComplexList.size() > 0) {
			return tennisComplexList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTennisComplex(TennisComplex tennisComplex) {
		if(tennisComplexList == null) {
			tennisComplexList = new ArrayList<>();
		}
		if(tennisComplexList.size() == 0) {
			tennisComplexList.add(tennisComplex);
		} else {
			tennisComplexList.set(0, tennisComplex);
		}
	}

	@Override
	public List<TennisComplex> getTennisComplexList() {
		return tennisComplexList;
	}

	@Override
	public void setTennisComplexList(List<TennisComplex> tennisComplexList) {
		this.tennisComplexList = tennisComplexList;
	}

	@Override
	public boolean hasTennisComplex() {
		return tennisComplexList != null && tennisComplexList.size() > 0 && tennisComplexList.get(0) != null;
	}

	public ITEM_REVIEWED(TextDigitalDocument textDigitalDocument) {
		textDigitalDocumentList = new ArrayList<TextDigitalDocument>();
		textDigitalDocumentList.add(textDigitalDocument);
	}

	@Override
	public TextDigitalDocument getTextDigitalDocument() {
		if(textDigitalDocumentList != null && textDigitalDocumentList.size() > 0) {
			return textDigitalDocumentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTextDigitalDocument(TextDigitalDocument textDigitalDocument) {
		if(textDigitalDocumentList == null) {
			textDigitalDocumentList = new ArrayList<>();
		}
		if(textDigitalDocumentList.size() == 0) {
			textDigitalDocumentList.add(textDigitalDocument);
		} else {
			textDigitalDocumentList.set(0, textDigitalDocument);
		}
	}

	@Override
	public List<TextDigitalDocument> getTextDigitalDocumentList() {
		return textDigitalDocumentList;
	}

	@Override
	public void setTextDigitalDocumentList(List<TextDigitalDocument> textDigitalDocumentList) {
		this.textDigitalDocumentList = textDigitalDocumentList;
	}

	@Override
	public boolean hasTextDigitalDocument() {
		return textDigitalDocumentList != null && textDigitalDocumentList.size() > 0 && textDigitalDocumentList.get(0) != null;
	}

	public ITEM_REVIEWED(TheaterEvent theaterEvent) {
		theaterEventList = new ArrayList<TheaterEvent>();
		theaterEventList.add(theaterEvent);
	}

	@Override
	public TheaterEvent getTheaterEvent() {
		if(theaterEventList != null && theaterEventList.size() > 0) {
			return theaterEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTheaterEvent(TheaterEvent theaterEvent) {
		if(theaterEventList == null) {
			theaterEventList = new ArrayList<>();
		}
		if(theaterEventList.size() == 0) {
			theaterEventList.add(theaterEvent);
		} else {
			theaterEventList.set(0, theaterEvent);
		}
	}

	@Override
	public List<TheaterEvent> getTheaterEventList() {
		return theaterEventList;
	}

	@Override
	public void setTheaterEventList(List<TheaterEvent> theaterEventList) {
		this.theaterEventList = theaterEventList;
	}

	@Override
	public boolean hasTheaterEvent() {
		return theaterEventList != null && theaterEventList.size() > 0 && theaterEventList.get(0) != null;
	}

	public ITEM_REVIEWED(TheaterGroup theaterGroup) {
		theaterGroupList = new ArrayList<TheaterGroup>();
		theaterGroupList.add(theaterGroup);
	}

	@Override
	public TheaterGroup getTheaterGroup() {
		if(theaterGroupList != null && theaterGroupList.size() > 0) {
			return theaterGroupList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTheaterGroup(TheaterGroup theaterGroup) {
		if(theaterGroupList == null) {
			theaterGroupList = new ArrayList<>();
		}
		if(theaterGroupList.size() == 0) {
			theaterGroupList.add(theaterGroup);
		} else {
			theaterGroupList.set(0, theaterGroup);
		}
	}

	@Override
	public List<TheaterGroup> getTheaterGroupList() {
		return theaterGroupList;
	}

	@Override
	public void setTheaterGroupList(List<TheaterGroup> theaterGroupList) {
		this.theaterGroupList = theaterGroupList;
	}

	@Override
	public boolean hasTheaterGroup() {
		return theaterGroupList != null && theaterGroupList.size() > 0 && theaterGroupList.get(0) != null;
	}

	public ITEM_REVIEWED(TherapeuticProcedure therapeuticProcedure) {
		therapeuticProcedureList = new ArrayList<TherapeuticProcedure>();
		therapeuticProcedureList.add(therapeuticProcedure);
	}

	@Override
	public TherapeuticProcedure getTherapeuticProcedure() {
		if(therapeuticProcedureList != null && therapeuticProcedureList.size() > 0) {
			return therapeuticProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTherapeuticProcedure(TherapeuticProcedure therapeuticProcedure) {
		if(therapeuticProcedureList == null) {
			therapeuticProcedureList = new ArrayList<>();
		}
		if(therapeuticProcedureList.size() == 0) {
			therapeuticProcedureList.add(therapeuticProcedure);
		} else {
			therapeuticProcedureList.set(0, therapeuticProcedure);
		}
	}

	@Override
	public List<TherapeuticProcedure> getTherapeuticProcedureList() {
		return therapeuticProcedureList;
	}

	@Override
	public void setTherapeuticProcedureList(List<TherapeuticProcedure> therapeuticProcedureList) {
		this.therapeuticProcedureList = therapeuticProcedureList;
	}

	@Override
	public boolean hasTherapeuticProcedure() {
		return therapeuticProcedureList != null && therapeuticProcedureList.size() > 0 && therapeuticProcedureList.get(0) != null;
	}

	public ITEM_REVIEWED(Thesis thesis) {
		thesisList = new ArrayList<Thesis>();
		thesisList.add(thesis);
	}

	@Override
	public Thesis getThesis() {
		if(thesisList != null && thesisList.size() > 0) {
			return thesisList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThesis(Thesis thesis) {
		if(thesisList == null) {
			thesisList = new ArrayList<>();
		}
		if(thesisList.size() == 0) {
			thesisList.add(thesis);
		} else {
			thesisList.set(0, thesis);
		}
	}

	@Override
	public List<Thesis> getThesisList() {
		return thesisList;
	}

	@Override
	public void setThesisList(List<Thesis> thesisList) {
		this.thesisList = thesisList;
	}

	@Override
	public boolean hasThesis() {
		return thesisList != null && thesisList.size() > 0 && thesisList.get(0) != null;
	}

	public ITEM_REVIEWED(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public ITEM_REVIEWED(Ticket ticket) {
		ticketList = new ArrayList<Ticket>();
		ticketList.add(ticket);
	}

	@Override
	public Ticket getTicket() {
		if(ticketList != null && ticketList.size() > 0) {
			return ticketList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTicket(Ticket ticket) {
		if(ticketList == null) {
			ticketList = new ArrayList<>();
		}
		if(ticketList.size() == 0) {
			ticketList.add(ticket);
		} else {
			ticketList.set(0, ticket);
		}
	}

	@Override
	public List<Ticket> getTicketList() {
		return ticketList;
	}

	@Override
	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	@Override
	public boolean hasTicket() {
		return ticketList != null && ticketList.size() > 0 && ticketList.get(0) != null;
	}

	public ITEM_REVIEWED(TieAction tieAction) {
		tieActionList = new ArrayList<TieAction>();
		tieActionList.add(tieAction);
	}

	@Override
	public TieAction getTieAction() {
		if(tieActionList != null && tieActionList.size() > 0) {
			return tieActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTieAction(TieAction tieAction) {
		if(tieActionList == null) {
			tieActionList = new ArrayList<>();
		}
		if(tieActionList.size() == 0) {
			tieActionList.add(tieAction);
		} else {
			tieActionList.set(0, tieAction);
		}
	}

	@Override
	public List<TieAction> getTieActionList() {
		return tieActionList;
	}

	@Override
	public void setTieActionList(List<TieAction> tieActionList) {
		this.tieActionList = tieActionList;
	}

	@Override
	public boolean hasTieAction() {
		return tieActionList != null && tieActionList.size() > 0 && tieActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TipAction tipAction) {
		tipActionList = new ArrayList<TipAction>();
		tipActionList.add(tipAction);
	}

	@Override
	public TipAction getTipAction() {
		if(tipActionList != null && tipActionList.size() > 0) {
			return tipActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTipAction(TipAction tipAction) {
		if(tipActionList == null) {
			tipActionList = new ArrayList<>();
		}
		if(tipActionList.size() == 0) {
			tipActionList.add(tipAction);
		} else {
			tipActionList.set(0, tipAction);
		}
	}

	@Override
	public List<TipAction> getTipActionList() {
		return tipActionList;
	}

	@Override
	public void setTipActionList(List<TipAction> tipActionList) {
		this.tipActionList = tipActionList;
	}

	@Override
	public boolean hasTipAction() {
		return tipActionList != null && tipActionList.size() > 0 && tipActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TireShop tireShop) {
		tireShopList = new ArrayList<TireShop>();
		tireShopList.add(tireShop);
	}

	@Override
	public TireShop getTireShop() {
		if(tireShopList != null && tireShopList.size() > 0) {
			return tireShopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTireShop(TireShop tireShop) {
		if(tireShopList == null) {
			tireShopList = new ArrayList<>();
		}
		if(tireShopList.size() == 0) {
			tireShopList.add(tireShop);
		} else {
			tireShopList.set(0, tireShop);
		}
	}

	@Override
	public List<TireShop> getTireShopList() {
		return tireShopList;
	}

	@Override
	public void setTireShopList(List<TireShop> tireShopList) {
		this.tireShopList = tireShopList;
	}

	@Override
	public boolean hasTireShop() {
		return tireShopList != null && tireShopList.size() > 0 && tireShopList.get(0) != null;
	}

	public ITEM_REVIEWED(TouristAttraction touristAttraction) {
		touristAttractionList = new ArrayList<TouristAttraction>();
		touristAttractionList.add(touristAttraction);
	}

	@Override
	public TouristAttraction getTouristAttraction() {
		if(touristAttractionList != null && touristAttractionList.size() > 0) {
			return touristAttractionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristAttraction(TouristAttraction touristAttraction) {
		if(touristAttractionList == null) {
			touristAttractionList = new ArrayList<>();
		}
		if(touristAttractionList.size() == 0) {
			touristAttractionList.add(touristAttraction);
		} else {
			touristAttractionList.set(0, touristAttraction);
		}
	}

	@Override
	public List<TouristAttraction> getTouristAttractionList() {
		return touristAttractionList;
	}

	@Override
	public void setTouristAttractionList(List<TouristAttraction> touristAttractionList) {
		this.touristAttractionList = touristAttractionList;
	}

	@Override
	public boolean hasTouristAttraction() {
		return touristAttractionList != null && touristAttractionList.size() > 0 && touristAttractionList.get(0) != null;
	}

	public ITEM_REVIEWED(TouristDestination touristDestination) {
		touristDestinationList = new ArrayList<TouristDestination>();
		touristDestinationList.add(touristDestination);
	}

	@Override
	public TouristDestination getTouristDestination() {
		if(touristDestinationList != null && touristDestinationList.size() > 0) {
			return touristDestinationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristDestination(TouristDestination touristDestination) {
		if(touristDestinationList == null) {
			touristDestinationList = new ArrayList<>();
		}
		if(touristDestinationList.size() == 0) {
			touristDestinationList.add(touristDestination);
		} else {
			touristDestinationList.set(0, touristDestination);
		}
	}

	@Override
	public List<TouristDestination> getTouristDestinationList() {
		return touristDestinationList;
	}

	@Override
	public void setTouristDestinationList(List<TouristDestination> touristDestinationList) {
		this.touristDestinationList = touristDestinationList;
	}

	@Override
	public boolean hasTouristDestination() {
		return touristDestinationList != null && touristDestinationList.size() > 0 && touristDestinationList.get(0) != null;
	}

	public ITEM_REVIEWED(TouristInformationCenter touristInformationCenter) {
		touristInformationCenterList = new ArrayList<TouristInformationCenter>();
		touristInformationCenterList.add(touristInformationCenter);
	}

	@Override
	public TouristInformationCenter getTouristInformationCenter() {
		if(touristInformationCenterList != null && touristInformationCenterList.size() > 0) {
			return touristInformationCenterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristInformationCenter(TouristInformationCenter touristInformationCenter) {
		if(touristInformationCenterList == null) {
			touristInformationCenterList = new ArrayList<>();
		}
		if(touristInformationCenterList.size() == 0) {
			touristInformationCenterList.add(touristInformationCenter);
		} else {
			touristInformationCenterList.set(0, touristInformationCenter);
		}
	}

	@Override
	public List<TouristInformationCenter> getTouristInformationCenterList() {
		return touristInformationCenterList;
	}

	@Override
	public void setTouristInformationCenterList(List<TouristInformationCenter> touristInformationCenterList) {
		this.touristInformationCenterList = touristInformationCenterList;
	}

	@Override
	public boolean hasTouristInformationCenter() {
		return touristInformationCenterList != null && touristInformationCenterList.size() > 0 && touristInformationCenterList.get(0) != null;
	}

	public ITEM_REVIEWED(TouristTrip touristTrip) {
		touristTripList = new ArrayList<TouristTrip>();
		touristTripList.add(touristTrip);
	}

	@Override
	public TouristTrip getTouristTrip() {
		if(touristTripList != null && touristTripList.size() > 0) {
			return touristTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristTrip(TouristTrip touristTrip) {
		if(touristTripList == null) {
			touristTripList = new ArrayList<>();
		}
		if(touristTripList.size() == 0) {
			touristTripList.add(touristTrip);
		} else {
			touristTripList.set(0, touristTrip);
		}
	}

	@Override
	public List<TouristTrip> getTouristTripList() {
		return touristTripList;
	}

	@Override
	public void setTouristTripList(List<TouristTrip> touristTripList) {
		this.touristTripList = touristTripList;
	}

	@Override
	public boolean hasTouristTrip() {
		return touristTripList != null && touristTripList.size() > 0 && touristTripList.get(0) != null;
	}

	public ITEM_REVIEWED(ToyStore toyStore) {
		toyStoreList = new ArrayList<ToyStore>();
		toyStoreList.add(toyStore);
	}

	@Override
	public ToyStore getToyStore() {
		if(toyStoreList != null && toyStoreList.size() > 0) {
			return toyStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setToyStore(ToyStore toyStore) {
		if(toyStoreList == null) {
			toyStoreList = new ArrayList<>();
		}
		if(toyStoreList.size() == 0) {
			toyStoreList.add(toyStore);
		} else {
			toyStoreList.set(0, toyStore);
		}
	}

	@Override
	public List<ToyStore> getToyStoreList() {
		return toyStoreList;
	}

	@Override
	public void setToyStoreList(List<ToyStore> toyStoreList) {
		this.toyStoreList = toyStoreList;
	}

	@Override
	public boolean hasToyStore() {
		return toyStoreList != null && toyStoreList.size() > 0 && toyStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(TrackAction trackAction) {
		trackActionList = new ArrayList<TrackAction>();
		trackActionList.add(trackAction);
	}

	@Override
	public TrackAction getTrackAction() {
		if(trackActionList != null && trackActionList.size() > 0) {
			return trackActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrackAction(TrackAction trackAction) {
		if(trackActionList == null) {
			trackActionList = new ArrayList<>();
		}
		if(trackActionList.size() == 0) {
			trackActionList.add(trackAction);
		} else {
			trackActionList.set(0, trackAction);
		}
	}

	@Override
	public List<TrackAction> getTrackActionList() {
		return trackActionList;
	}

	@Override
	public void setTrackActionList(List<TrackAction> trackActionList) {
		this.trackActionList = trackActionList;
	}

	@Override
	public boolean hasTrackAction() {
		return trackActionList != null && trackActionList.size() > 0 && trackActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TradeAction tradeAction) {
		tradeActionList = new ArrayList<TradeAction>();
		tradeActionList.add(tradeAction);
	}

	@Override
	public TradeAction getTradeAction() {
		if(tradeActionList != null && tradeActionList.size() > 0) {
			return tradeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTradeAction(TradeAction tradeAction) {
		if(tradeActionList == null) {
			tradeActionList = new ArrayList<>();
		}
		if(tradeActionList.size() == 0) {
			tradeActionList.add(tradeAction);
		} else {
			tradeActionList.set(0, tradeAction);
		}
	}

	@Override
	public List<TradeAction> getTradeActionList() {
		return tradeActionList;
	}

	@Override
	public void setTradeActionList(List<TradeAction> tradeActionList) {
		this.tradeActionList = tradeActionList;
	}

	@Override
	public boolean hasTradeAction() {
		return tradeActionList != null && tradeActionList.size() > 0 && tradeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TrainReservation trainReservation) {
		trainReservationList = new ArrayList<TrainReservation>();
		trainReservationList.add(trainReservation);
	}

	@Override
	public TrainReservation getTrainReservation() {
		if(trainReservationList != null && trainReservationList.size() > 0) {
			return trainReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainReservation(TrainReservation trainReservation) {
		if(trainReservationList == null) {
			trainReservationList = new ArrayList<>();
		}
		if(trainReservationList.size() == 0) {
			trainReservationList.add(trainReservation);
		} else {
			trainReservationList.set(0, trainReservation);
		}
	}

	@Override
	public List<TrainReservation> getTrainReservationList() {
		return trainReservationList;
	}

	@Override
	public void setTrainReservationList(List<TrainReservation> trainReservationList) {
		this.trainReservationList = trainReservationList;
	}

	@Override
	public boolean hasTrainReservation() {
		return trainReservationList != null && trainReservationList.size() > 0 && trainReservationList.get(0) != null;
	}

	public ITEM_REVIEWED(TrainStation trainStation) {
		trainStationList = new ArrayList<TrainStation>();
		trainStationList.add(trainStation);
	}

	@Override
	public TrainStation getTrainStation() {
		if(trainStationList != null && trainStationList.size() > 0) {
			return trainStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainStation(TrainStation trainStation) {
		if(trainStationList == null) {
			trainStationList = new ArrayList<>();
		}
		if(trainStationList.size() == 0) {
			trainStationList.add(trainStation);
		} else {
			trainStationList.set(0, trainStation);
		}
	}

	@Override
	public List<TrainStation> getTrainStationList() {
		return trainStationList;
	}

	@Override
	public void setTrainStationList(List<TrainStation> trainStationList) {
		this.trainStationList = trainStationList;
	}

	@Override
	public boolean hasTrainStation() {
		return trainStationList != null && trainStationList.size() > 0 && trainStationList.get(0) != null;
	}

	public ITEM_REVIEWED(TrainTrip trainTrip) {
		trainTripList = new ArrayList<TrainTrip>();
		trainTripList.add(trainTrip);
	}

	@Override
	public TrainTrip getTrainTrip() {
		if(trainTripList != null && trainTripList.size() > 0) {
			return trainTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainTrip(TrainTrip trainTrip) {
		if(trainTripList == null) {
			trainTripList = new ArrayList<>();
		}
		if(trainTripList.size() == 0) {
			trainTripList.add(trainTrip);
		} else {
			trainTripList.set(0, trainTrip);
		}
	}

	@Override
	public List<TrainTrip> getTrainTripList() {
		return trainTripList;
	}

	@Override
	public void setTrainTripList(List<TrainTrip> trainTripList) {
		this.trainTripList = trainTripList;
	}

	@Override
	public boolean hasTrainTrip() {
		return trainTripList != null && trainTripList.size() > 0 && trainTripList.get(0) != null;
	}

	public ITEM_REVIEWED(TransferAction transferAction) {
		transferActionList = new ArrayList<TransferAction>();
		transferActionList.add(transferAction);
	}

	@Override
	public TransferAction getTransferAction() {
		if(transferActionList != null && transferActionList.size() > 0) {
			return transferActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTransferAction(TransferAction transferAction) {
		if(transferActionList == null) {
			transferActionList = new ArrayList<>();
		}
		if(transferActionList.size() == 0) {
			transferActionList.add(transferAction);
		} else {
			transferActionList.set(0, transferAction);
		}
	}

	@Override
	public List<TransferAction> getTransferActionList() {
		return transferActionList;
	}

	@Override
	public void setTransferActionList(List<TransferAction> transferActionList) {
		this.transferActionList = transferActionList;
	}

	@Override
	public boolean hasTransferAction() {
		return transferActionList != null && transferActionList.size() > 0 && transferActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TravelAction travelAction) {
		travelActionList = new ArrayList<TravelAction>();
		travelActionList.add(travelAction);
	}

	@Override
	public TravelAction getTravelAction() {
		if(travelActionList != null && travelActionList.size() > 0) {
			return travelActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTravelAction(TravelAction travelAction) {
		if(travelActionList == null) {
			travelActionList = new ArrayList<>();
		}
		if(travelActionList.size() == 0) {
			travelActionList.add(travelAction);
		} else {
			travelActionList.set(0, travelAction);
		}
	}

	@Override
	public List<TravelAction> getTravelActionList() {
		return travelActionList;
	}

	@Override
	public void setTravelActionList(List<TravelAction> travelActionList) {
		this.travelActionList = travelActionList;
	}

	@Override
	public boolean hasTravelAction() {
		return travelActionList != null && travelActionList.size() > 0 && travelActionList.get(0) != null;
	}

	public ITEM_REVIEWED(TravelAgency travelAgency) {
		travelAgencyList = new ArrayList<TravelAgency>();
		travelAgencyList.add(travelAgency);
	}

	@Override
	public TravelAgency getTravelAgency() {
		if(travelAgencyList != null && travelAgencyList.size() > 0) {
			return travelAgencyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTravelAgency(TravelAgency travelAgency) {
		if(travelAgencyList == null) {
			travelAgencyList = new ArrayList<>();
		}
		if(travelAgencyList.size() == 0) {
			travelAgencyList.add(travelAgency);
		} else {
			travelAgencyList.set(0, travelAgency);
		}
	}

	@Override
	public List<TravelAgency> getTravelAgencyList() {
		return travelAgencyList;
	}

	@Override
	public void setTravelAgencyList(List<TravelAgency> travelAgencyList) {
		this.travelAgencyList = travelAgencyList;
	}

	@Override
	public boolean hasTravelAgency() {
		return travelAgencyList != null && travelAgencyList.size() > 0 && travelAgencyList.get(0) != null;
	}

	public ITEM_REVIEWED(TreatmentIndication treatmentIndication) {
		treatmentIndicationList = new ArrayList<TreatmentIndication>();
		treatmentIndicationList.add(treatmentIndication);
	}

	@Override
	public TreatmentIndication getTreatmentIndication() {
		if(treatmentIndicationList != null && treatmentIndicationList.size() > 0) {
			return treatmentIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTreatmentIndication(TreatmentIndication treatmentIndication) {
		if(treatmentIndicationList == null) {
			treatmentIndicationList = new ArrayList<>();
		}
		if(treatmentIndicationList.size() == 0) {
			treatmentIndicationList.add(treatmentIndication);
		} else {
			treatmentIndicationList.set(0, treatmentIndication);
		}
	}

	@Override
	public List<TreatmentIndication> getTreatmentIndicationList() {
		return treatmentIndicationList;
	}

	@Override
	public void setTreatmentIndicationList(List<TreatmentIndication> treatmentIndicationList) {
		this.treatmentIndicationList = treatmentIndicationList;
	}

	@Override
	public boolean hasTreatmentIndication() {
		return treatmentIndicationList != null && treatmentIndicationList.size() > 0 && treatmentIndicationList.get(0) != null;
	}

	public ITEM_REVIEWED(Trip trip) {
		tripList = new ArrayList<Trip>();
		tripList.add(trip);
	}

	@Override
	public Trip getTrip() {
		if(tripList != null && tripList.size() > 0) {
			return tripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrip(Trip trip) {
		if(tripList == null) {
			tripList = new ArrayList<>();
		}
		if(tripList.size() == 0) {
			tripList.add(trip);
		} else {
			tripList.set(0, trip);
		}
	}

	@Override
	public List<Trip> getTripList() {
		return tripList;
	}

	@Override
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	@Override
	public boolean hasTrip() {
		return tripList != null && tripList.size() > 0 && tripList.get(0) != null;
	}

	public ITEM_REVIEWED(TypeAndQuantityNode typeAndQuantityNode) {
		typeAndQuantityNodeList = new ArrayList<TypeAndQuantityNode>();
		typeAndQuantityNodeList.add(typeAndQuantityNode);
	}

	@Override
	public TypeAndQuantityNode getTypeAndQuantityNode() {
		if(typeAndQuantityNodeList != null && typeAndQuantityNodeList.size() > 0) {
			return typeAndQuantityNodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTypeAndQuantityNode(TypeAndQuantityNode typeAndQuantityNode) {
		if(typeAndQuantityNodeList == null) {
			typeAndQuantityNodeList = new ArrayList<>();
		}
		if(typeAndQuantityNodeList.size() == 0) {
			typeAndQuantityNodeList.add(typeAndQuantityNode);
		} else {
			typeAndQuantityNodeList.set(0, typeAndQuantityNode);
		}
	}

	@Override
	public List<TypeAndQuantityNode> getTypeAndQuantityNodeList() {
		return typeAndQuantityNodeList;
	}

	@Override
	public void setTypeAndQuantityNodeList(List<TypeAndQuantityNode> typeAndQuantityNodeList) {
		this.typeAndQuantityNodeList = typeAndQuantityNodeList;
	}

	@Override
	public boolean hasTypeAndQuantityNode() {
		return typeAndQuantityNodeList != null && typeAndQuantityNodeList.size() > 0 && typeAndQuantityNodeList.get(0) != null;
	}

	public ITEM_REVIEWED(UnRegisterAction unRegisterAction) {
		unRegisterActionList = new ArrayList<UnRegisterAction>();
		unRegisterActionList.add(unRegisterAction);
	}

	@Override
	public UnRegisterAction getUnRegisterAction() {
		if(unRegisterActionList != null && unRegisterActionList.size() > 0) {
			return unRegisterActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUnRegisterAction(UnRegisterAction unRegisterAction) {
		if(unRegisterActionList == null) {
			unRegisterActionList = new ArrayList<>();
		}
		if(unRegisterActionList.size() == 0) {
			unRegisterActionList.add(unRegisterAction);
		} else {
			unRegisterActionList.set(0, unRegisterAction);
		}
	}

	@Override
	public List<UnRegisterAction> getUnRegisterActionList() {
		return unRegisterActionList;
	}

	@Override
	public void setUnRegisterActionList(List<UnRegisterAction> unRegisterActionList) {
		this.unRegisterActionList = unRegisterActionList;
	}

	@Override
	public boolean hasUnRegisterAction() {
		return unRegisterActionList != null && unRegisterActionList.size() > 0 && unRegisterActionList.get(0) != null;
	}

	public ITEM_REVIEWED(UnitPriceSpecification unitPriceSpecification) {
		unitPriceSpecificationList = new ArrayList<UnitPriceSpecification>();
		unitPriceSpecificationList.add(unitPriceSpecification);
	}

	@Override
	public UnitPriceSpecification getUnitPriceSpecification() {
		if(unitPriceSpecificationList != null && unitPriceSpecificationList.size() > 0) {
			return unitPriceSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUnitPriceSpecification(UnitPriceSpecification unitPriceSpecification) {
		if(unitPriceSpecificationList == null) {
			unitPriceSpecificationList = new ArrayList<>();
		}
		if(unitPriceSpecificationList.size() == 0) {
			unitPriceSpecificationList.add(unitPriceSpecification);
		} else {
			unitPriceSpecificationList.set(0, unitPriceSpecification);
		}
	}

	@Override
	public List<UnitPriceSpecification> getUnitPriceSpecificationList() {
		return unitPriceSpecificationList;
	}

	@Override
	public void setUnitPriceSpecificationList(List<UnitPriceSpecification> unitPriceSpecificationList) {
		this.unitPriceSpecificationList = unitPriceSpecificationList;
	}

	@Override
	public boolean hasUnitPriceSpecification() {
		return unitPriceSpecificationList != null && unitPriceSpecificationList.size() > 0 && unitPriceSpecificationList.get(0) != null;
	}

	public ITEM_REVIEWED(UpdateAction updateAction) {
		updateActionList = new ArrayList<UpdateAction>();
		updateActionList.add(updateAction);
	}

	@Override
	public UpdateAction getUpdateAction() {
		if(updateActionList != null && updateActionList.size() > 0) {
			return updateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUpdateAction(UpdateAction updateAction) {
		if(updateActionList == null) {
			updateActionList = new ArrayList<>();
		}
		if(updateActionList.size() == 0) {
			updateActionList.add(updateAction);
		} else {
			updateActionList.set(0, updateAction);
		}
	}

	@Override
	public List<UpdateAction> getUpdateActionList() {
		return updateActionList;
	}

	@Override
	public void setUpdateActionList(List<UpdateAction> updateActionList) {
		this.updateActionList = updateActionList;
	}

	@Override
	public boolean hasUpdateAction() {
		return updateActionList != null && updateActionList.size() > 0 && updateActionList.get(0) != null;
	}

	public ITEM_REVIEWED(UseAction useAction) {
		useActionList = new ArrayList<UseAction>();
		useActionList.add(useAction);
	}

	@Override
	public UseAction getUseAction() {
		if(useActionList != null && useActionList.size() > 0) {
			return useActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUseAction(UseAction useAction) {
		if(useActionList == null) {
			useActionList = new ArrayList<>();
		}
		if(useActionList.size() == 0) {
			useActionList.add(useAction);
		} else {
			useActionList.set(0, useAction);
		}
	}

	@Override
	public List<UseAction> getUseActionList() {
		return useActionList;
	}

	@Override
	public void setUseActionList(List<UseAction> useActionList) {
		this.useActionList = useActionList;
	}

	@Override
	public boolean hasUseAction() {
		return useActionList != null && useActionList.size() > 0 && useActionList.get(0) != null;
	}

	public ITEM_REVIEWED(UserReview userReview) {
		userReviewList = new ArrayList<UserReview>();
		userReviewList.add(userReview);
	}

	@Override
	public UserReview getUserReview() {
		if(userReviewList != null && userReviewList.size() > 0) {
			return userReviewList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUserReview(UserReview userReview) {
		if(userReviewList == null) {
			userReviewList = new ArrayList<>();
		}
		if(userReviewList.size() == 0) {
			userReviewList.add(userReview);
		} else {
			userReviewList.set(0, userReview);
		}
	}

	@Override
	public List<UserReview> getUserReviewList() {
		return userReviewList;
	}

	@Override
	public void setUserReviewList(List<UserReview> userReviewList) {
		this.userReviewList = userReviewList;
	}

	@Override
	public boolean hasUserReview() {
		return userReviewList != null && userReviewList.size() > 0 && userReviewList.get(0) != null;
	}

	public ITEM_REVIEWED(Vehicle vehicle) {
		vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(vehicle);
	}

	@Override
	public Vehicle getVehicle() {
		if(vehicleList != null && vehicleList.size() > 0) {
			return vehicleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVehicle(Vehicle vehicle) {
		if(vehicleList == null) {
			vehicleList = new ArrayList<>();
		}
		if(vehicleList.size() == 0) {
			vehicleList.add(vehicle);
		} else {
			vehicleList.set(0, vehicle);
		}
	}

	@Override
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	@Override
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public boolean hasVehicle() {
		return vehicleList != null && vehicleList.size() > 0 && vehicleList.get(0) != null;
	}

	public ITEM_REVIEWED(Vein vein) {
		veinList = new ArrayList<Vein>();
		veinList.add(vein);
	}

	@Override
	public Vein getVein() {
		if(veinList != null && veinList.size() > 0) {
			return veinList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVein(Vein vein) {
		if(veinList == null) {
			veinList = new ArrayList<>();
		}
		if(veinList.size() == 0) {
			veinList.add(vein);
		} else {
			veinList.set(0, vein);
		}
	}

	@Override
	public List<Vein> getVeinList() {
		return veinList;
	}

	@Override
	public void setVeinList(List<Vein> veinList) {
		this.veinList = veinList;
	}

	@Override
	public boolean hasVein() {
		return veinList != null && veinList.size() > 0 && veinList.get(0) != null;
	}

	public ITEM_REVIEWED(Vessel vessel) {
		vesselList = new ArrayList<Vessel>();
		vesselList.add(vessel);
	}

	@Override
	public Vessel getVessel() {
		if(vesselList != null && vesselList.size() > 0) {
			return vesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVessel(Vessel vessel) {
		if(vesselList == null) {
			vesselList = new ArrayList<>();
		}
		if(vesselList.size() == 0) {
			vesselList.add(vessel);
		} else {
			vesselList.set(0, vessel);
		}
	}

	@Override
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	@Override
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}

	@Override
	public boolean hasVessel() {
		return vesselList != null && vesselList.size() > 0 && vesselList.get(0) != null;
	}

	public ITEM_REVIEWED(VeterinaryCare veterinaryCare) {
		veterinaryCareList = new ArrayList<VeterinaryCare>();
		veterinaryCareList.add(veterinaryCare);
	}

	@Override
	public VeterinaryCare getVeterinaryCare() {
		if(veterinaryCareList != null && veterinaryCareList.size() > 0) {
			return veterinaryCareList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVeterinaryCare(VeterinaryCare veterinaryCare) {
		if(veterinaryCareList == null) {
			veterinaryCareList = new ArrayList<>();
		}
		if(veterinaryCareList.size() == 0) {
			veterinaryCareList.add(veterinaryCare);
		} else {
			veterinaryCareList.set(0, veterinaryCare);
		}
	}

	@Override
	public List<VeterinaryCare> getVeterinaryCareList() {
		return veterinaryCareList;
	}

	@Override
	public void setVeterinaryCareList(List<VeterinaryCare> veterinaryCareList) {
		this.veterinaryCareList = veterinaryCareList;
	}

	@Override
	public boolean hasVeterinaryCare() {
		return veterinaryCareList != null && veterinaryCareList.size() > 0 && veterinaryCareList.get(0) != null;
	}

	public ITEM_REVIEWED(VideoGallery videoGallery) {
		videoGalleryList = new ArrayList<VideoGallery>();
		videoGalleryList.add(videoGallery);
	}

	@Override
	public VideoGallery getVideoGallery() {
		if(videoGalleryList != null && videoGalleryList.size() > 0) {
			return videoGalleryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGallery(VideoGallery videoGallery) {
		if(videoGalleryList == null) {
			videoGalleryList = new ArrayList<>();
		}
		if(videoGalleryList.size() == 0) {
			videoGalleryList.add(videoGallery);
		} else {
			videoGalleryList.set(0, videoGallery);
		}
	}

	@Override
	public List<VideoGallery> getVideoGalleryList() {
		return videoGalleryList;
	}

	@Override
	public void setVideoGalleryList(List<VideoGallery> videoGalleryList) {
		this.videoGalleryList = videoGalleryList;
	}

	@Override
	public boolean hasVideoGallery() {
		return videoGalleryList != null && videoGalleryList.size() > 0 && videoGalleryList.get(0) != null;
	}

	public ITEM_REVIEWED(VideoGame videoGame) {
		videoGameList = new ArrayList<VideoGame>();
		videoGameList.add(videoGame);
	}

	@Override
	public VideoGame getVideoGame() {
		if(videoGameList != null && videoGameList.size() > 0) {
			return videoGameList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGame(VideoGame videoGame) {
		if(videoGameList == null) {
			videoGameList = new ArrayList<>();
		}
		if(videoGameList.size() == 0) {
			videoGameList.add(videoGame);
		} else {
			videoGameList.set(0, videoGame);
		}
	}

	@Override
	public List<VideoGame> getVideoGameList() {
		return videoGameList;
	}

	@Override
	public void setVideoGameList(List<VideoGame> videoGameList) {
		this.videoGameList = videoGameList;
	}

	@Override
	public boolean hasVideoGame() {
		return videoGameList != null && videoGameList.size() > 0 && videoGameList.get(0) != null;
	}

	public ITEM_REVIEWED(VideoGameClip videoGameClip) {
		videoGameClipList = new ArrayList<VideoGameClip>();
		videoGameClipList.add(videoGameClip);
	}

	@Override
	public VideoGameClip getVideoGameClip() {
		if(videoGameClipList != null && videoGameClipList.size() > 0) {
			return videoGameClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGameClip(VideoGameClip videoGameClip) {
		if(videoGameClipList == null) {
			videoGameClipList = new ArrayList<>();
		}
		if(videoGameClipList.size() == 0) {
			videoGameClipList.add(videoGameClip);
		} else {
			videoGameClipList.set(0, videoGameClip);
		}
	}

	@Override
	public List<VideoGameClip> getVideoGameClipList() {
		return videoGameClipList;
	}

	@Override
	public void setVideoGameClipList(List<VideoGameClip> videoGameClipList) {
		this.videoGameClipList = videoGameClipList;
	}

	@Override
	public boolean hasVideoGameClip() {
		return videoGameClipList != null && videoGameClipList.size() > 0 && videoGameClipList.get(0) != null;
	}

	public ITEM_REVIEWED(VideoGameSeries videoGameSeries) {
		videoGameSeriesList = new ArrayList<VideoGameSeries>();
		videoGameSeriesList.add(videoGameSeries);
	}

	@Override
	public VideoGameSeries getVideoGameSeries() {
		if(videoGameSeriesList != null && videoGameSeriesList.size() > 0) {
			return videoGameSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGameSeries(VideoGameSeries videoGameSeries) {
		if(videoGameSeriesList == null) {
			videoGameSeriesList = new ArrayList<>();
		}
		if(videoGameSeriesList.size() == 0) {
			videoGameSeriesList.add(videoGameSeries);
		} else {
			videoGameSeriesList.set(0, videoGameSeries);
		}
	}

	@Override
	public List<VideoGameSeries> getVideoGameSeriesList() {
		return videoGameSeriesList;
	}

	@Override
	public void setVideoGameSeriesList(List<VideoGameSeries> videoGameSeriesList) {
		this.videoGameSeriesList = videoGameSeriesList;
	}

	@Override
	public boolean hasVideoGameSeries() {
		return videoGameSeriesList != null && videoGameSeriesList.size() > 0 && videoGameSeriesList.get(0) != null;
	}

	public ITEM_REVIEWED(VideoObject videoObject) {
		videoObjectList = new ArrayList<VideoObject>();
		videoObjectList.add(videoObject);
	}

	@Override
	public VideoObject getVideoObject() {
		if(videoObjectList != null && videoObjectList.size() > 0) {
			return videoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoObject(VideoObject videoObject) {
		if(videoObjectList == null) {
			videoObjectList = new ArrayList<>();
		}
		if(videoObjectList.size() == 0) {
			videoObjectList.add(videoObject);
		} else {
			videoObjectList.set(0, videoObject);
		}
	}

	@Override
	public List<VideoObject> getVideoObjectList() {
		return videoObjectList;
	}

	@Override
	public void setVideoObjectList(List<VideoObject> videoObjectList) {
		this.videoObjectList = videoObjectList;
	}

	@Override
	public boolean hasVideoObject() {
		return videoObjectList != null && videoObjectList.size() > 0 && videoObjectList.get(0) != null;
	}

	public ITEM_REVIEWED(ViewAction viewAction) {
		viewActionList = new ArrayList<ViewAction>();
		viewActionList.add(viewAction);
	}

	@Override
	public ViewAction getViewAction() {
		if(viewActionList != null && viewActionList.size() > 0) {
			return viewActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setViewAction(ViewAction viewAction) {
		if(viewActionList == null) {
			viewActionList = new ArrayList<>();
		}
		if(viewActionList.size() == 0) {
			viewActionList.add(viewAction);
		} else {
			viewActionList.set(0, viewAction);
		}
	}

	@Override
	public List<ViewAction> getViewActionList() {
		return viewActionList;
	}

	@Override
	public void setViewActionList(List<ViewAction> viewActionList) {
		this.viewActionList = viewActionList;
	}

	@Override
	public boolean hasViewAction() {
		return viewActionList != null && viewActionList.size() > 0 && viewActionList.get(0) != null;
	}

	public ITEM_REVIEWED(VisualArtsEvent visualArtsEvent) {
		visualArtsEventList = new ArrayList<VisualArtsEvent>();
		visualArtsEventList.add(visualArtsEvent);
	}

	@Override
	public VisualArtsEvent getVisualArtsEvent() {
		if(visualArtsEventList != null && visualArtsEventList.size() > 0) {
			return visualArtsEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVisualArtsEvent(VisualArtsEvent visualArtsEvent) {
		if(visualArtsEventList == null) {
			visualArtsEventList = new ArrayList<>();
		}
		if(visualArtsEventList.size() == 0) {
			visualArtsEventList.add(visualArtsEvent);
		} else {
			visualArtsEventList.set(0, visualArtsEvent);
		}
	}

	@Override
	public List<VisualArtsEvent> getVisualArtsEventList() {
		return visualArtsEventList;
	}

	@Override
	public void setVisualArtsEventList(List<VisualArtsEvent> visualArtsEventList) {
		this.visualArtsEventList = visualArtsEventList;
	}

	@Override
	public boolean hasVisualArtsEvent() {
		return visualArtsEventList != null && visualArtsEventList.size() > 0 && visualArtsEventList.get(0) != null;
	}

	public ITEM_REVIEWED(VisualArtwork visualArtwork) {
		visualArtworkList = new ArrayList<VisualArtwork>();
		visualArtworkList.add(visualArtwork);
	}

	@Override
	public VisualArtwork getVisualArtwork() {
		if(visualArtworkList != null && visualArtworkList.size() > 0) {
			return visualArtworkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVisualArtwork(VisualArtwork visualArtwork) {
		if(visualArtworkList == null) {
			visualArtworkList = new ArrayList<>();
		}
		if(visualArtworkList.size() == 0) {
			visualArtworkList.add(visualArtwork);
		} else {
			visualArtworkList.set(0, visualArtwork);
		}
	}

	@Override
	public List<VisualArtwork> getVisualArtworkList() {
		return visualArtworkList;
	}

	@Override
	public void setVisualArtworkList(List<VisualArtwork> visualArtworkList) {
		this.visualArtworkList = visualArtworkList;
	}

	@Override
	public boolean hasVisualArtwork() {
		return visualArtworkList != null && visualArtworkList.size() > 0 && visualArtworkList.get(0) != null;
	}

	public ITEM_REVIEWED(VitalSign vitalSign) {
		vitalSignList = new ArrayList<VitalSign>();
		vitalSignList.add(vitalSign);
	}

	@Override
	public VitalSign getVitalSign() {
		if(vitalSignList != null && vitalSignList.size() > 0) {
			return vitalSignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVitalSign(VitalSign vitalSign) {
		if(vitalSignList == null) {
			vitalSignList = new ArrayList<>();
		}
		if(vitalSignList.size() == 0) {
			vitalSignList.add(vitalSign);
		} else {
			vitalSignList.set(0, vitalSign);
		}
	}

	@Override
	public List<VitalSign> getVitalSignList() {
		return vitalSignList;
	}

	@Override
	public void setVitalSignList(List<VitalSign> vitalSignList) {
		this.vitalSignList = vitalSignList;
	}

	@Override
	public boolean hasVitalSign() {
		return vitalSignList != null && vitalSignList.size() > 0 && vitalSignList.get(0) != null;
	}

	public ITEM_REVIEWED(Volcano volcano) {
		volcanoList = new ArrayList<Volcano>();
		volcanoList.add(volcano);
	}

	@Override
	public Volcano getVolcano() {
		if(volcanoList != null && volcanoList.size() > 0) {
			return volcanoList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVolcano(Volcano volcano) {
		if(volcanoList == null) {
			volcanoList = new ArrayList<>();
		}
		if(volcanoList.size() == 0) {
			volcanoList.add(volcano);
		} else {
			volcanoList.set(0, volcano);
		}
	}

	@Override
	public List<Volcano> getVolcanoList() {
		return volcanoList;
	}

	@Override
	public void setVolcanoList(List<Volcano> volcanoList) {
		this.volcanoList = volcanoList;
	}

	@Override
	public boolean hasVolcano() {
		return volcanoList != null && volcanoList.size() > 0 && volcanoList.get(0) != null;
	}

	public ITEM_REVIEWED(VoteAction voteAction) {
		voteActionList = new ArrayList<VoteAction>();
		voteActionList.add(voteAction);
	}

	@Override
	public VoteAction getVoteAction() {
		if(voteActionList != null && voteActionList.size() > 0) {
			return voteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVoteAction(VoteAction voteAction) {
		if(voteActionList == null) {
			voteActionList = new ArrayList<>();
		}
		if(voteActionList.size() == 0) {
			voteActionList.add(voteAction);
		} else {
			voteActionList.set(0, voteAction);
		}
	}

	@Override
	public List<VoteAction> getVoteActionList() {
		return voteActionList;
	}

	@Override
	public void setVoteActionList(List<VoteAction> voteActionList) {
		this.voteActionList = voteActionList;
	}

	@Override
	public boolean hasVoteAction() {
		return voteActionList != null && voteActionList.size() > 0 && voteActionList.get(0) != null;
	}

	public ITEM_REVIEWED(WPAdBlock wpAdBlock) {
		wpAdBlockList = new ArrayList<WPAdBlock>();
		wpAdBlockList.add(wpAdBlock);
	}

	@Override
	public WPAdBlock getWPAdBlock() {
		if(wpAdBlockList != null && wpAdBlockList.size() > 0) {
			return wpAdBlockList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPAdBlock(WPAdBlock wpAdBlock) {
		if(wpAdBlockList == null) {
			wpAdBlockList = new ArrayList<>();
		}
		if(wpAdBlockList.size() == 0) {
			wpAdBlockList.add(wpAdBlock);
		} else {
			wpAdBlockList.set(0, wpAdBlock);
		}
	}

	@Override
	public List<WPAdBlock> getWPAdBlockList() {
		return wpAdBlockList;
	}

	@Override
	public void setWPAdBlockList(List<WPAdBlock> wpAdBlockList) {
		this.wpAdBlockList = wpAdBlockList;
	}

	@Override
	public boolean hasWPAdBlock() {
		return wpAdBlockList != null && wpAdBlockList.size() > 0 && wpAdBlockList.get(0) != null;
	}

	public ITEM_REVIEWED(WPFooter wpFooter) {
		wpFooterList = new ArrayList<WPFooter>();
		wpFooterList.add(wpFooter);
	}

	@Override
	public WPFooter getWPFooter() {
		if(wpFooterList != null && wpFooterList.size() > 0) {
			return wpFooterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPFooter(WPFooter wpFooter) {
		if(wpFooterList == null) {
			wpFooterList = new ArrayList<>();
		}
		if(wpFooterList.size() == 0) {
			wpFooterList.add(wpFooter);
		} else {
			wpFooterList.set(0, wpFooter);
		}
	}

	@Override
	public List<WPFooter> getWPFooterList() {
		return wpFooterList;
	}

	@Override
	public void setWPFooterList(List<WPFooter> wpFooterList) {
		this.wpFooterList = wpFooterList;
	}

	@Override
	public boolean hasWPFooter() {
		return wpFooterList != null && wpFooterList.size() > 0 && wpFooterList.get(0) != null;
	}

	public ITEM_REVIEWED(WPHeader wpHeader) {
		wpHeaderList = new ArrayList<WPHeader>();
		wpHeaderList.add(wpHeader);
	}

	@Override
	public WPHeader getWPHeader() {
		if(wpHeaderList != null && wpHeaderList.size() > 0) {
			return wpHeaderList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPHeader(WPHeader wpHeader) {
		if(wpHeaderList == null) {
			wpHeaderList = new ArrayList<>();
		}
		if(wpHeaderList.size() == 0) {
			wpHeaderList.add(wpHeader);
		} else {
			wpHeaderList.set(0, wpHeader);
		}
	}

	@Override
	public List<WPHeader> getWPHeaderList() {
		return wpHeaderList;
	}

	@Override
	public void setWPHeaderList(List<WPHeader> wpHeaderList) {
		this.wpHeaderList = wpHeaderList;
	}

	@Override
	public boolean hasWPHeader() {
		return wpHeaderList != null && wpHeaderList.size() > 0 && wpHeaderList.get(0) != null;
	}

	public ITEM_REVIEWED(WPSideBar wpSideBar) {
		wpSideBarList = new ArrayList<WPSideBar>();
		wpSideBarList.add(wpSideBar);
	}

	@Override
	public WPSideBar getWPSideBar() {
		if(wpSideBarList != null && wpSideBarList.size() > 0) {
			return wpSideBarList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWPSideBar(WPSideBar wpSideBar) {
		if(wpSideBarList == null) {
			wpSideBarList = new ArrayList<>();
		}
		if(wpSideBarList.size() == 0) {
			wpSideBarList.add(wpSideBar);
		} else {
			wpSideBarList.set(0, wpSideBar);
		}
	}

	@Override
	public List<WPSideBar> getWPSideBarList() {
		return wpSideBarList;
	}

	@Override
	public void setWPSideBarList(List<WPSideBar> wpSideBarList) {
		this.wpSideBarList = wpSideBarList;
	}

	@Override
	public boolean hasWPSideBar() {
		return wpSideBarList != null && wpSideBarList.size() > 0 && wpSideBarList.get(0) != null;
	}

	public ITEM_REVIEWED(WantAction wantAction) {
		wantActionList = new ArrayList<WantAction>();
		wantActionList.add(wantAction);
	}

	@Override
	public WantAction getWantAction() {
		if(wantActionList != null && wantActionList.size() > 0) {
			return wantActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWantAction(WantAction wantAction) {
		if(wantActionList == null) {
			wantActionList = new ArrayList<>();
		}
		if(wantActionList.size() == 0) {
			wantActionList.add(wantAction);
		} else {
			wantActionList.set(0, wantAction);
		}
	}

	@Override
	public List<WantAction> getWantActionList() {
		return wantActionList;
	}

	@Override
	public void setWantActionList(List<WantAction> wantActionList) {
		this.wantActionList = wantActionList;
	}

	@Override
	public boolean hasWantAction() {
		return wantActionList != null && wantActionList.size() > 0 && wantActionList.get(0) != null;
	}

	public ITEM_REVIEWED(WarrantyPromise warrantyPromise) {
		warrantyPromiseList = new ArrayList<WarrantyPromise>();
		warrantyPromiseList.add(warrantyPromise);
	}

	@Override
	public WarrantyPromise getWarrantyPromise() {
		if(warrantyPromiseList != null && warrantyPromiseList.size() > 0) {
			return warrantyPromiseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWarrantyPromise(WarrantyPromise warrantyPromise) {
		if(warrantyPromiseList == null) {
			warrantyPromiseList = new ArrayList<>();
		}
		if(warrantyPromiseList.size() == 0) {
			warrantyPromiseList.add(warrantyPromise);
		} else {
			warrantyPromiseList.set(0, warrantyPromise);
		}
	}

	@Override
	public List<WarrantyPromise> getWarrantyPromiseList() {
		return warrantyPromiseList;
	}

	@Override
	public void setWarrantyPromiseList(List<WarrantyPromise> warrantyPromiseList) {
		this.warrantyPromiseList = warrantyPromiseList;
	}

	@Override
	public boolean hasWarrantyPromise() {
		return warrantyPromiseList != null && warrantyPromiseList.size() > 0 && warrantyPromiseList.get(0) != null;
	}

	public ITEM_REVIEWED(WarrantyScope warrantyScope) {
		warrantyScopeList = new ArrayList<WarrantyScope>();
		warrantyScopeList.add(warrantyScope);
	}

	@Override
	public WarrantyScope getWarrantyScope() {
		if(warrantyScopeList != null && warrantyScopeList.size() > 0) {
			return warrantyScopeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWarrantyScope(WarrantyScope warrantyScope) {
		if(warrantyScopeList == null) {
			warrantyScopeList = new ArrayList<>();
		}
		if(warrantyScopeList.size() == 0) {
			warrantyScopeList.add(warrantyScope);
		} else {
			warrantyScopeList.set(0, warrantyScope);
		}
	}

	@Override
	public List<WarrantyScope> getWarrantyScopeList() {
		return warrantyScopeList;
	}

	@Override
	public void setWarrantyScopeList(List<WarrantyScope> warrantyScopeList) {
		this.warrantyScopeList = warrantyScopeList;
	}

	@Override
	public boolean hasWarrantyScope() {
		return warrantyScopeList != null && warrantyScopeList.size() > 0 && warrantyScopeList.get(0) != null;
	}

	public ITEM_REVIEWED(WatchAction watchAction) {
		watchActionList = new ArrayList<WatchAction>();
		watchActionList.add(watchAction);
	}

	@Override
	public WatchAction getWatchAction() {
		if(watchActionList != null && watchActionList.size() > 0) {
			return watchActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWatchAction(WatchAction watchAction) {
		if(watchActionList == null) {
			watchActionList = new ArrayList<>();
		}
		if(watchActionList.size() == 0) {
			watchActionList.add(watchAction);
		} else {
			watchActionList.set(0, watchAction);
		}
	}

	@Override
	public List<WatchAction> getWatchActionList() {
		return watchActionList;
	}

	@Override
	public void setWatchActionList(List<WatchAction> watchActionList) {
		this.watchActionList = watchActionList;
	}

	@Override
	public boolean hasWatchAction() {
		return watchActionList != null && watchActionList.size() > 0 && watchActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Waterfall waterfall) {
		waterfallList = new ArrayList<Waterfall>();
		waterfallList.add(waterfall);
	}

	@Override
	public Waterfall getWaterfall() {
		if(waterfallList != null && waterfallList.size() > 0) {
			return waterfallList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWaterfall(Waterfall waterfall) {
		if(waterfallList == null) {
			waterfallList = new ArrayList<>();
		}
		if(waterfallList.size() == 0) {
			waterfallList.add(waterfall);
		} else {
			waterfallList.set(0, waterfall);
		}
	}

	@Override
	public List<Waterfall> getWaterfallList() {
		return waterfallList;
	}

	@Override
	public void setWaterfallList(List<Waterfall> waterfallList) {
		this.waterfallList = waterfallList;
	}

	@Override
	public boolean hasWaterfall() {
		return waterfallList != null && waterfallList.size() > 0 && waterfallList.get(0) != null;
	}

	public ITEM_REVIEWED(WearAction wearAction) {
		wearActionList = new ArrayList<WearAction>();
		wearActionList.add(wearAction);
	}

	@Override
	public WearAction getWearAction() {
		if(wearActionList != null && wearActionList.size() > 0) {
			return wearActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWearAction(WearAction wearAction) {
		if(wearActionList == null) {
			wearActionList = new ArrayList<>();
		}
		if(wearActionList.size() == 0) {
			wearActionList.add(wearAction);
		} else {
			wearActionList.set(0, wearAction);
		}
	}

	@Override
	public List<WearAction> getWearActionList() {
		return wearActionList;
	}

	@Override
	public void setWearActionList(List<WearAction> wearActionList) {
		this.wearActionList = wearActionList;
	}

	@Override
	public boolean hasWearAction() {
		return wearActionList != null && wearActionList.size() > 0 && wearActionList.get(0) != null;
	}

	public ITEM_REVIEWED(WebAPI webAPI) {
		webAPIList = new ArrayList<WebAPI>();
		webAPIList.add(webAPI);
	}

	@Override
	public WebAPI getWebAPI() {
		if(webAPIList != null && webAPIList.size() > 0) {
			return webAPIList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebAPI(WebAPI webAPI) {
		if(webAPIList == null) {
			webAPIList = new ArrayList<>();
		}
		if(webAPIList.size() == 0) {
			webAPIList.add(webAPI);
		} else {
			webAPIList.set(0, webAPI);
		}
	}

	@Override
	public List<WebAPI> getWebAPIList() {
		return webAPIList;
	}

	@Override
	public void setWebAPIList(List<WebAPI> webAPIList) {
		this.webAPIList = webAPIList;
	}

	@Override
	public boolean hasWebAPI() {
		return webAPIList != null && webAPIList.size() > 0 && webAPIList.get(0) != null;
	}

	public ITEM_REVIEWED(WebApplication webApplication) {
		webApplicationList = new ArrayList<WebApplication>();
		webApplicationList.add(webApplication);
	}

	@Override
	public WebApplication getWebApplication() {
		if(webApplicationList != null && webApplicationList.size() > 0) {
			return webApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebApplication(WebApplication webApplication) {
		if(webApplicationList == null) {
			webApplicationList = new ArrayList<>();
		}
		if(webApplicationList.size() == 0) {
			webApplicationList.add(webApplication);
		} else {
			webApplicationList.set(0, webApplication);
		}
	}

	@Override
	public List<WebApplication> getWebApplicationList() {
		return webApplicationList;
	}

	@Override
	public void setWebApplicationList(List<WebApplication> webApplicationList) {
		this.webApplicationList = webApplicationList;
	}

	@Override
	public boolean hasWebApplication() {
		return webApplicationList != null && webApplicationList.size() > 0 && webApplicationList.get(0) != null;
	}

	public ITEM_REVIEWED(WebPage webPage) {
		webPageList = new ArrayList<WebPage>();
		webPageList.add(webPage);
	}

	@Override
	public WebPage getWebPage() {
		if(webPageList != null && webPageList.size() > 0) {
			return webPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPage(WebPage webPage) {
		if(webPageList == null) {
			webPageList = new ArrayList<>();
		}
		if(webPageList.size() == 0) {
			webPageList.add(webPage);
		} else {
			webPageList.set(0, webPage);
		}
	}

	@Override
	public List<WebPage> getWebPageList() {
		return webPageList;
	}

	@Override
	public void setWebPageList(List<WebPage> webPageList) {
		this.webPageList = webPageList;
	}

	@Override
	public boolean hasWebPage() {
		return webPageList != null && webPageList.size() > 0 && webPageList.get(0) != null;
	}

	public ITEM_REVIEWED(WebPageElement webPageElement) {
		webPageElementList = new ArrayList<WebPageElement>();
		webPageElementList.add(webPageElement);
	}

	@Override
	public WebPageElement getWebPageElement() {
		if(webPageElementList != null && webPageElementList.size() > 0) {
			return webPageElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPageElement(WebPageElement webPageElement) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(webPageElement);
		} else {
			webPageElementList.set(0, webPageElement);
		}
	}

	@Override
	public List<WebPageElement> getWebPageElementList() {
		return webPageElementList;
	}

	@Override
	public void setWebPageElementList(List<WebPageElement> webPageElementList) {
		this.webPageElementList = webPageElementList;
	}

	@Override
	public boolean hasWebPageElement() {
		return webPageElementList != null && webPageElementList.size() > 0 && webPageElementList.get(0) != null;
	}

	public ITEM_REVIEWED(WebSite webSite) {
		webSiteList = new ArrayList<WebSite>();
		webSiteList.add(webSite);
	}

	@Override
	public WebSite getWebSite() {
		if(webSiteList != null && webSiteList.size() > 0) {
			return webSiteList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebSite(WebSite webSite) {
		if(webSiteList == null) {
			webSiteList = new ArrayList<>();
		}
		if(webSiteList.size() == 0) {
			webSiteList.add(webSite);
		} else {
			webSiteList.set(0, webSite);
		}
	}

	@Override
	public List<WebSite> getWebSiteList() {
		return webSiteList;
	}

	@Override
	public void setWebSiteList(List<WebSite> webSiteList) {
		this.webSiteList = webSiteList;
	}

	@Override
	public boolean hasWebSite() {
		return webSiteList != null && webSiteList.size() > 0 && webSiteList.get(0) != null;
	}

	public ITEM_REVIEWED(WholesaleStore wholesaleStore) {
		wholesaleStoreList = new ArrayList<WholesaleStore>();
		wholesaleStoreList.add(wholesaleStore);
	}

	@Override
	public WholesaleStore getWholesaleStore() {
		if(wholesaleStoreList != null && wholesaleStoreList.size() > 0) {
			return wholesaleStoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWholesaleStore(WholesaleStore wholesaleStore) {
		if(wholesaleStoreList == null) {
			wholesaleStoreList = new ArrayList<>();
		}
		if(wholesaleStoreList.size() == 0) {
			wholesaleStoreList.add(wholesaleStore);
		} else {
			wholesaleStoreList.set(0, wholesaleStore);
		}
	}

	@Override
	public List<WholesaleStore> getWholesaleStoreList() {
		return wholesaleStoreList;
	}

	@Override
	public void setWholesaleStoreList(List<WholesaleStore> wholesaleStoreList) {
		this.wholesaleStoreList = wholesaleStoreList;
	}

	@Override
	public boolean hasWholesaleStore() {
		return wholesaleStoreList != null && wholesaleStoreList.size() > 0 && wholesaleStoreList.get(0) != null;
	}

	public ITEM_REVIEWED(WinAction winAction) {
		winActionList = new ArrayList<WinAction>();
		winActionList.add(winAction);
	}

	@Override
	public WinAction getWinAction() {
		if(winActionList != null && winActionList.size() > 0) {
			return winActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWinAction(WinAction winAction) {
		if(winActionList == null) {
			winActionList = new ArrayList<>();
		}
		if(winActionList.size() == 0) {
			winActionList.add(winAction);
		} else {
			winActionList.set(0, winAction);
		}
	}

	@Override
	public List<WinAction> getWinActionList() {
		return winActionList;
	}

	@Override
	public void setWinActionList(List<WinAction> winActionList) {
		this.winActionList = winActionList;
	}

	@Override
	public boolean hasWinAction() {
		return winActionList != null && winActionList.size() > 0 && winActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Winery winery) {
		wineryList = new ArrayList<Winery>();
		wineryList.add(winery);
	}

	@Override
	public Winery getWinery() {
		if(wineryList != null && wineryList.size() > 0) {
			return wineryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWinery(Winery winery) {
		if(wineryList == null) {
			wineryList = new ArrayList<>();
		}
		if(wineryList.size() == 0) {
			wineryList.add(winery);
		} else {
			wineryList.set(0, winery);
		}
	}

	@Override
	public List<Winery> getWineryList() {
		return wineryList;
	}

	@Override
	public void setWineryList(List<Winery> wineryList) {
		this.wineryList = wineryList;
	}

	@Override
	public boolean hasWinery() {
		return wineryList != null && wineryList.size() > 0 && wineryList.get(0) != null;
	}

	public ITEM_REVIEWED(WorkersUnion workersUnion) {
		workersUnionList = new ArrayList<WorkersUnion>();
		workersUnionList.add(workersUnion);
	}

	@Override
	public WorkersUnion getWorkersUnion() {
		if(workersUnionList != null && workersUnionList.size() > 0) {
			return workersUnionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWorkersUnion(WorkersUnion workersUnion) {
		if(workersUnionList == null) {
			workersUnionList = new ArrayList<>();
		}
		if(workersUnionList.size() == 0) {
			workersUnionList.add(workersUnion);
		} else {
			workersUnionList.set(0, workersUnion);
		}
	}

	@Override
	public List<WorkersUnion> getWorkersUnionList() {
		return workersUnionList;
	}

	@Override
	public void setWorkersUnionList(List<WorkersUnion> workersUnionList) {
		this.workersUnionList = workersUnionList;
	}

	@Override
	public boolean hasWorkersUnion() {
		return workersUnionList != null && workersUnionList.size() > 0 && workersUnionList.get(0) != null;
	}

	public ITEM_REVIEWED(WriteAction writeAction) {
		writeActionList = new ArrayList<WriteAction>();
		writeActionList.add(writeAction);
	}

	@Override
	public WriteAction getWriteAction() {
		if(writeActionList != null && writeActionList.size() > 0) {
			return writeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWriteAction(WriteAction writeAction) {
		if(writeActionList == null) {
			writeActionList = new ArrayList<>();
		}
		if(writeActionList.size() == 0) {
			writeActionList.add(writeAction);
		} else {
			writeActionList.set(0, writeAction);
		}
	}

	@Override
	public List<WriteAction> getWriteActionList() {
		return writeActionList;
	}

	@Override
	public void setWriteActionList(List<WriteAction> writeActionList) {
		this.writeActionList = writeActionList;
	}

	@Override
	public boolean hasWriteAction() {
		return writeActionList != null && writeActionList.size() > 0 && writeActionList.get(0) != null;
	}

	public ITEM_REVIEWED(Zoo zoo) {
		zooList = new ArrayList<Zoo>();
		zooList.add(zoo);
	}

	@Override
	public Zoo getZoo() {
		if(zooList != null && zooList.size() > 0) {
			return zooList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setZoo(Zoo zoo) {
		if(zooList == null) {
			zooList = new ArrayList<>();
		}
		if(zooList.size() == 0) {
			zooList.add(zoo);
		} else {
			zooList.set(0, zoo);
		}
	}

	@Override
	public List<Zoo> getZooList() {
		return zooList;
	}

	@Override
	public void setZooList(List<Zoo> zooList) {
		this.zooList = zooList;
	}

	@Override
	public boolean hasZoo() {
		return zooList != null && zooList.size() > 0 && zooList.get(0) != null;
	}

	public void copy(Container.ItemReviewed org) {
		setAMRadioChannelList(org.getAMRadioChannelList());
		setAPIReferenceList(org.getAPIReferenceList());
		setAboutPageList(org.getAboutPageList());
		setAcceptActionList(org.getAcceptActionList());
		setAccommodationList(org.getAccommodationList());
		setAccountingServiceList(org.getAccountingServiceList());
		setAchieveActionList(org.getAchieveActionList());
		setActionList(org.getActionList());
		setActionAccessSpecificationList(org.getActionAccessSpecificationList());
		setActionStatusTypeList(org.getActionStatusTypeList());
		setActivateActionList(org.getActivateActionList());
		setAddActionList(org.getAddActionList());
		setAdministrativeAreaList(org.getAdministrativeAreaList());
		setAdultEntertainmentList(org.getAdultEntertainmentList());
		setAdvertiserContentArticleList(org.getAdvertiserContentArticleList());
		setAggregateOfferList(org.getAggregateOfferList());
		setAggregateRatingList(org.getAggregateRatingList());
		setAgreeActionList(org.getAgreeActionList());
		setAirlineList(org.getAirlineList());
		setAirportList(org.getAirportList());
		setAlignmentObjectList(org.getAlignmentObjectList());
		setAllocateActionList(org.getAllocateActionList());
		setAmusementParkList(org.getAmusementParkList());
		setAnalysisNewsArticleList(org.getAnalysisNewsArticleList());
		setAnatomicalStructureList(org.getAnatomicalStructureList());
		setAnatomicalSystemList(org.getAnatomicalSystemList());
		setAnimalShelterList(org.getAnimalShelterList());
		setAnswerList(org.getAnswerList());
		setApartmentList(org.getApartmentList());
		setApartmentComplexList(org.getApartmentComplexList());
		setAppendActionList(org.getAppendActionList());
		setApplyActionList(org.getApplyActionList());
		setApprovedIndicationList(org.getApprovedIndicationList());
		setAquariumList(org.getAquariumList());
		setArriveActionList(org.getArriveActionList());
		setArtGalleryList(org.getArtGalleryList());
		setArteryList(org.getArteryList());
		setArticleList(org.getArticleList());
		setAskActionList(org.getAskActionList());
		setAskPublicNewsArticleList(org.getAskPublicNewsArticleList());
		setAssessActionList(org.getAssessActionList());
		setAssignActionList(org.getAssignActionList());
		setAtlasList(org.getAtlasList());
		setAttorneyList(org.getAttorneyList());
		setAudienceList(org.getAudienceList());
		setAudioObjectList(org.getAudioObjectList());
		setAudiobookList(org.getAudiobookList());
		setAuthorizeActionList(org.getAuthorizeActionList());
		setAutoBodyShopList(org.getAutoBodyShopList());
		setAutoDealerList(org.getAutoDealerList());
		setAutoPartsStoreList(org.getAutoPartsStoreList());
		setAutoRentalList(org.getAutoRentalList());
		setAutoRepairList(org.getAutoRepairList());
		setAutoWashList(org.getAutoWashList());
		setAutomatedTellerList(org.getAutomatedTellerList());
		setAutomotiveBusinessList(org.getAutomotiveBusinessList());
		setBackgroundNewsArticleList(org.getBackgroundNewsArticleList());
		setBakeryList(org.getBakeryList());
		setBankAccountList(org.getBankAccountList());
		setBankOrCreditUnionList(org.getBankOrCreditUnionList());
		setBarOrPubList(org.getBarOrPubList());
		setBarcodeList(org.getBarcodeList());
		setBeachList(org.getBeachList());
		setBeautySalonList(org.getBeautySalonList());
		setBedAndBreakfastList(org.getBedAndBreakfastList());
		setBedDetailsList(org.getBedDetailsList());
		setBedTypeList(org.getBedTypeList());
		setBefriendActionList(org.getBefriendActionList());
		setBikeStoreList(org.getBikeStoreList());
		setBlogList(org.getBlogList());
		setBlogPostingList(org.getBlogPostingList());
		setBloodTestList(org.getBloodTestList());
		setBoardingPolicyTypeList(org.getBoardingPolicyTypeList());
		setBodyOfWaterList(org.getBodyOfWaterList());
		setBoneList(org.getBoneList());
		setBookList(org.getBookList());
		setBookFormatTypeList(org.getBookFormatTypeList());
		setBookSeriesList(org.getBookSeriesList());
		setBookStoreList(org.getBookStoreList());
		setBookmarkActionList(org.getBookmarkActionList());
		setBorrowActionList(org.getBorrowActionList());
		setBowlingAlleyList(org.getBowlingAlleyList());
		setBrainStructureList(org.getBrainStructureList());
		setBrandList(org.getBrandList());
		setBreadcrumbListList(org.getBreadcrumbListList());
		setBreweryList(org.getBreweryList());
		setBridgeList(org.getBridgeList());
		setBroadcastChannelList(org.getBroadcastChannelList());
		setBroadcastEventList(org.getBroadcastEventList());
		setBroadcastFrequencySpecificationList(org.getBroadcastFrequencySpecificationList());
		setBroadcastServiceList(org.getBroadcastServiceList());
		setBrokerageAccountList(org.getBrokerageAccountList());
		setBuddhistTempleList(org.getBuddhistTempleList());
		setBusOrCoachList(org.getBusOrCoachList());
		setBusReservationList(org.getBusReservationList());
		setBusStationList(org.getBusStationList());
		setBusStopList(org.getBusStopList());
		setBusTripList(org.getBusTripList());
		setBusinessAudienceList(org.getBusinessAudienceList());
		setBusinessEntityTypeList(org.getBusinessEntityTypeList());
		setBusinessEventList(org.getBusinessEventList());
		setBusinessFunctionList(org.getBusinessFunctionList());
		setBuyActionList(org.getBuyActionList());
		setCableOrSatelliteServiceList(org.getCableOrSatelliteServiceList());
		setCafeOrCoffeeShopList(org.getCafeOrCoffeeShopList());
		setCampgroundList(org.getCampgroundList());
		setCampingPitchList(org.getCampingPitchList());
		setCanalList(org.getCanalList());
		setCancelActionList(org.getCancelActionList());
		setCarList(org.getCarList());
		setCarUsageTypeList(org.getCarUsageTypeList());
		setCasinoList(org.getCasinoList());
		setCategoryCodeList(org.getCategoryCodeList());
		setCategoryCodeSetList(org.getCategoryCodeSetList());
		setCatholicChurchList(org.getCatholicChurchList());
		setCemeteryList(org.getCemeteryList());
		setChapterList(org.getChapterList());
		setCheckActionList(org.getCheckActionList());
		setCheckInActionList(org.getCheckInActionList());
		setCheckOutActionList(org.getCheckOutActionList());
		setCheckoutPageList(org.getCheckoutPageList());
		setChildCareList(org.getChildCareList());
		setChildrensEventList(org.getChildrensEventList());
		setChooseActionList(org.getChooseActionList());
		setChurchList(org.getChurchList());
		setCityList(org.getCityList());
		setCityHallList(org.getCityHallList());
		setCivicStructureList(org.getCivicStructureList());
		setClaimList(org.getClaimList());
		setClaimReviewList(org.getClaimReviewList());
		setClazzList(org.getClazzList());
		setClipList(org.getClipList());
		setClothingStoreList(org.getClothingStoreList());
		setCollectionList(org.getCollectionList());
		setCollectionPageList(org.getCollectionPageList());
		setCollegeOrUniversityList(org.getCollegeOrUniversityList());
		setComedyClubList(org.getComedyClubList());
		setComedyEventList(org.getComedyEventList());
		setComicCoverArtList(org.getComicCoverArtList());
		setComicIssueList(org.getComicIssueList());
		setComicSeriesList(org.getComicSeriesList());
		setComicStoryList(org.getComicStoryList());
		setCommentList(org.getCommentList());
		setCommentActionList(org.getCommentActionList());
		setCommunicateActionList(org.getCommunicateActionList());
		setCommunityHealthList(org.getCommunityHealthList());
		setCompleteDataFeedList(org.getCompleteDataFeedList());
		setCompoundPriceSpecificationList(org.getCompoundPriceSpecificationList());
		setComputerLanguageList(org.getComputerLanguageList());
		setComputerStoreList(org.getComputerStoreList());
		setConfirmActionList(org.getConfirmActionList());
		setConsortiumList(org.getConsortiumList());
		setConsumeActionList(org.getConsumeActionList());
		setContactPageList(org.getContactPageList());
		setContactPointList(org.getContactPointList());
		setContactPointOptionList(org.getContactPointOptionList());
		setContinentList(org.getContinentList());
		setControlActionList(org.getControlActionList());
		setConvenienceStoreList(org.getConvenienceStoreList());
		setConversationList(org.getConversationList());
		setCookActionList(org.getCookActionList());
		setCorporationList(org.getCorporationList());
		setCorrectionCommentList(org.getCorrectionCommentList());
		setCountryList(org.getCountryList());
		setCourseList(org.getCourseList());
		setCourseInstanceList(org.getCourseInstanceList());
		setCourthouseList(org.getCourthouseList());
		setCoverArtList(org.getCoverArtList());
		setCreateActionList(org.getCreateActionList());
		setCreativeWorkList(org.getCreativeWorkList());
		setCreativeWorkSeasonList(org.getCreativeWorkSeasonList());
		setCreativeWorkSeriesList(org.getCreativeWorkSeriesList());
		setCreditCardList(org.getCreditCardList());
		setCrematoriumList(org.getCrematoriumList());
		setCriticReviewList(org.getCriticReviewList());
		setCurrencyConversionServiceList(org.getCurrencyConversionServiceList());
		setDDxElementList(org.getDDxElementList());
		setDanceEventList(org.getDanceEventList());
		setDanceGroupList(org.getDanceGroupList());
		setDataCatalogList(org.getDataCatalogList());
		setDataDownloadList(org.getDataDownloadList());
		setDataFeedList(org.getDataFeedList());
		setDataFeedItemList(org.getDataFeedItemList());
		setDatasetList(org.getDatasetList());
		setDayOfWeekList(org.getDayOfWeekList());
		setDaySpaList(org.getDaySpaList());
		setDeactivateActionList(org.getDeactivateActionList());
		setDefenceEstablishmentList(org.getDefenceEstablishmentList());
		setDefinedTermList(org.getDefinedTermList());
		setDefinedTermSetList(org.getDefinedTermSetList());
		setDeleteActionList(org.getDeleteActionList());
		setDeliveryChargeSpecificationList(org.getDeliveryChargeSpecificationList());
		setDeliveryEventList(org.getDeliveryEventList());
		setDeliveryMethodList(org.getDeliveryMethodList());
		setDemandList(org.getDemandList());
		setDentistList(org.getDentistList());
		setDepartActionList(org.getDepartActionList());
		setDepartmentStoreList(org.getDepartmentStoreList());
		setDepositAccountList(org.getDepositAccountList());
		setDermatologyList(org.getDermatologyList());
		setDiagnosticLabList(org.getDiagnosticLabList());
		setDiagnosticProcedureList(org.getDiagnosticProcedureList());
		setDietList(org.getDietList());
		setDietNutritionList(org.getDietNutritionList());
		setDietarySupplementList(org.getDietarySupplementList());
		setDigitalDocumentList(org.getDigitalDocumentList());
		setDigitalDocumentPermissionList(org.getDigitalDocumentPermissionList());
		setDigitalDocumentPermissionTypeList(org.getDigitalDocumentPermissionTypeList());
		setDisagreeActionList(org.getDisagreeActionList());
		setDiscoverActionList(org.getDiscoverActionList());
		setDiscussionForumPostingList(org.getDiscussionForumPostingList());
		setDislikeActionList(org.getDislikeActionList());
		setDistanceList(org.getDistanceList());
		setDistilleryList(org.getDistilleryList());
		setDonateActionList(org.getDonateActionList());
		setDoseScheduleList(org.getDoseScheduleList());
		setDownloadActionList(org.getDownloadActionList());
		setDrawActionList(org.getDrawActionList());
		setDrinkActionList(org.getDrinkActionList());
		setDriveWheelConfigurationValueList(org.getDriveWheelConfigurationValueList());
		setDrugList(org.getDrugList());
		setDrugClassList(org.getDrugClassList());
		setDrugCostList(org.getDrugCostList());
		setDrugCostCategoryList(org.getDrugCostCategoryList());
		setDrugLegalStatusList(org.getDrugLegalStatusList());
		setDrugPregnancyCategoryList(org.getDrugPregnancyCategoryList());
		setDrugPrescriptionStatusList(org.getDrugPrescriptionStatusList());
		setDrugStrengthList(org.getDrugStrengthList());
		setDryCleaningOrLaundryList(org.getDryCleaningOrLaundryList());
		setDurationList(org.getDurationList());
		setEatActionList(org.getEatActionList());
		setEducationEventList(org.getEducationEventList());
		setEducationalAudienceList(org.getEducationalAudienceList());
		setEducationalOrganizationList(org.getEducationalOrganizationList());
		setElectricianList(org.getElectricianList());
		setElectronicsStoreList(org.getElectronicsStoreList());
		setElementarySchoolList(org.getElementarySchoolList());
		setEmailMessageList(org.getEmailMessageList());
		setEmbassyList(org.getEmbassyList());
		setEmergencyList(org.getEmergencyList());
		setEmergencyServiceList(org.getEmergencyServiceList());
		setEmployeeRoleList(org.getEmployeeRoleList());
		setEmployerAggregateRatingList(org.getEmployerAggregateRatingList());
		setEmployerReviewList(org.getEmployerReviewList());
		setEmploymentAgencyList(org.getEmploymentAgencyList());
		setEndorseActionList(org.getEndorseActionList());
		setEndorsementRatingList(org.getEndorsementRatingList());
		setEnergyList(org.getEnergyList());
		setEngineSpecificationList(org.getEngineSpecificationList());
		setEntertainmentBusinessList(org.getEntertainmentBusinessList());
		setEntryPointList(org.getEntryPointList());
		setEnumerationList(org.getEnumerationList());
		setEpisodeList(org.getEpisodeList());
		setEventList(org.getEventList());
		setEventReservationList(org.getEventReservationList());
		setEventSeriesList(org.getEventSeriesList());
		setEventStatusTypeList(org.getEventStatusTypeList());
		setEventVenueList(org.getEventVenueList());
		setExchangeRateSpecificationList(org.getExchangeRateSpecificationList());
		setExerciseActionList(org.getExerciseActionList());
		setExerciseGymList(org.getExerciseGymList());
		setExercisePlanList(org.getExercisePlanList());
		setExhibitionEventList(org.getExhibitionEventList());
		setFAQPageList(org.getFAQPageList());
		setFMRadioChannelList(org.getFMRadioChannelList());
		setFastFoodRestaurantList(org.getFastFoodRestaurantList());
		setFestivalList(org.getFestivalList());
		setFilmActionList(org.getFilmActionList());
		setFinancialProductList(org.getFinancialProductList());
		setFinancialServiceList(org.getFinancialServiceList());
		setFindActionList(org.getFindActionList());
		setFireStationList(org.getFireStationList());
		setFlightList(org.getFlightList());
		setFlightReservationList(org.getFlightReservationList());
		setFloristList(org.getFloristList());
		setFollowActionList(org.getFollowActionList());
		setFoodEstablishmentList(org.getFoodEstablishmentList());
		setFoodEstablishmentReservationList(org.getFoodEstablishmentReservationList());
		setFoodEventList(org.getFoodEventList());
		setFoodServiceList(org.getFoodServiceList());
		setFurnitureStoreList(org.getFurnitureStoreList());
		setGameList(org.getGameList());
		setGamePlayModeList(org.getGamePlayModeList());
		setGameServerList(org.getGameServerList());
		setGameServerStatusList(org.getGameServerStatusList());
		setGardenStoreList(org.getGardenStoreList());
		setGasStationList(org.getGasStationList());
		setGatedResidenceCommunityList(org.getGatedResidenceCommunityList());
		setGenderTypeList(org.getGenderTypeList());
		setGeneralContractorList(org.getGeneralContractorList());
		setGeoCircleList(org.getGeoCircleList());
		setGeoCoordinatesList(org.getGeoCoordinatesList());
		setGeoShapeList(org.getGeoShapeList());
		setGeospatialGeometryList(org.getGeospatialGeometryList());
		setGeriatricList(org.getGeriatricList());
		setGiveActionList(org.getGiveActionList());
		setGolfCourseList(org.getGolfCourseList());
		setGovernmentBuildingList(org.getGovernmentBuildingList());
		setGovernmentOfficeList(org.getGovernmentOfficeList());
		setGovernmentOrganizationList(org.getGovernmentOrganizationList());
		setGovernmentPermitList(org.getGovernmentPermitList());
		setGovernmentServiceList(org.getGovernmentServiceList());
		setGroceryStoreList(org.getGroceryStoreList());
		setGynecologicList(org.getGynecologicList());
		setHVACBusinessList(org.getHVACBusinessList());
		setHairSalonList(org.getHairSalonList());
		setHardwareStoreList(org.getHardwareStoreList());
		setHealthAndBeautyBusinessList(org.getHealthAndBeautyBusinessList());
		setHealthClubList(org.getHealthClubList());
		setHealthInsurancePlanList(org.getHealthInsurancePlanList());
		setHealthPlanCostSharingSpecificationList(org.getHealthPlanCostSharingSpecificationList());
		setHealthPlanFormularyList(org.getHealthPlanFormularyList());
		setHealthPlanNetworkList(org.getHealthPlanNetworkList());
		setHighSchoolList(org.getHighSchoolList());
		setHinduTempleList(org.getHinduTempleList());
		setHobbyShopList(org.getHobbyShopList());
		setHomeAndConstructionBusinessList(org.getHomeAndConstructionBusinessList());
		setHomeGoodsStoreList(org.getHomeGoodsStoreList());
		setHospitalList(org.getHospitalList());
		setHostelList(org.getHostelList());
		setHotelList(org.getHotelList());
		setHotelRoomList(org.getHotelRoomList());
		setHouseList(org.getHouseList());
		setHousePainterList(org.getHousePainterList());
		setHowToList(org.getHowToList());
		setHowToDirectionList(org.getHowToDirectionList());
		setHowToItemList(org.getHowToItemList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
		setHowToSupplyList(org.getHowToSupplyList());
		setHowToTipList(org.getHowToTipList());
		setHowToToolList(org.getHowToToolList());
		setIceCreamShopList(org.getIceCreamShopList());
		setIgnoreActionList(org.getIgnoreActionList());
		setImageGalleryList(org.getImageGalleryList());
		setImageObjectList(org.getImageObjectList());
		setImagingTestList(org.getImagingTestList());
		setIndividualProductList(org.getIndividualProductList());
		setInfectiousAgentClassList(org.getInfectiousAgentClassList());
		setInfectiousDiseaseList(org.getInfectiousDiseaseList());
		setInformActionList(org.getInformActionList());
		setInsertActionList(org.getInsertActionList());
		setInstallActionList(org.getInstallActionList());
		setInsuranceAgencyList(org.getInsuranceAgencyList());
		setIntangibleList(org.getIntangibleList());
		setInteractActionList(org.getInteractActionList());
		setInteractionCounterList(org.getInteractionCounterList());
		setInternetCafeList(org.getInternetCafeList());
		setInvestmentFundList(org.getInvestmentFundList());
		setInvestmentOrDepositList(org.getInvestmentOrDepositList());
		setInviteActionList(org.getInviteActionList());
		setInvoiceList(org.getInvoiceList());
		setItemAvailabilityList(org.getItemAvailabilityList());
		setItemListList(org.getItemListList());
		setItemListOrderTypeList(org.getItemListOrderTypeList());
		setItemPageList(org.getItemPageList());
		setJewelryStoreList(org.getJewelryStoreList());
		setJobPostingList(org.getJobPostingList());
		setJoinActionList(org.getJoinActionList());
		setJointList(org.getJointList());
		setLakeBodyOfWaterList(org.getLakeBodyOfWaterList());
		setLandformList(org.getLandformList());
		setLandmarksOrHistoricalBuildingsList(org.getLandmarksOrHistoricalBuildingsList());
		setLanguageList(org.getLanguageList());
		setLeaveActionList(org.getLeaveActionList());
		setLegalForceStatusList(org.getLegalForceStatusList());
		setLegalServiceList(org.getLegalServiceList());
		setLegalValueLevelList(org.getLegalValueLevelList());
		setLegislationList(org.getLegislationList());
		setLegislationObjectList(org.getLegislationObjectList());
		setLegislativeBuildingList(org.getLegislativeBuildingList());
		setLendActionList(org.getLendActionList());
		setLibraryList(org.getLibraryList());
		setLibrarySystemList(org.getLibrarySystemList());
		setLifestyleModificationList(org.getLifestyleModificationList());
		setLigamentList(org.getLigamentList());
		setLikeActionList(org.getLikeActionList());
		setLinkRoleList(org.getLinkRoleList());
		setLiquorStoreList(org.getLiquorStoreList());
		setListItemList(org.getListItemList());
		setListenActionList(org.getListenActionList());
		setLiteraryEventList(org.getLiteraryEventList());
		setLiveBlogPostingList(org.getLiveBlogPostingList());
		setLoanOrCreditList(org.getLoanOrCreditList());
		setLocalBusinessList(org.getLocalBusinessList());
		setLocationFeatureSpecificationList(org.getLocationFeatureSpecificationList());
		setLockerDeliveryList(org.getLockerDeliveryList());
		setLocksmithList(org.getLocksmithList());
		setLodgingBusinessList(org.getLodgingBusinessList());
		setLodgingReservationList(org.getLodgingReservationList());
		setLoseActionList(org.getLoseActionList());
		setLymphaticVesselList(org.getLymphaticVesselList());
		setMapList(org.getMapList());
		setMapCategoryTypeList(org.getMapCategoryTypeList());
		setMarryActionList(org.getMarryActionList());
		setMassList(org.getMassList());
		setMaximumDoseScheduleList(org.getMaximumDoseScheduleList());
		setMediaObjectList(org.getMediaObjectList());
		setMediaSubscriptionList(org.getMediaSubscriptionList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setMedicalBusinessList(org.getMedicalBusinessList());
		setMedicalCauseList(org.getMedicalCauseList());
		setMedicalClinicList(org.getMedicalClinicList());
		setMedicalCodeList(org.getMedicalCodeList());
		setMedicalConditionList(org.getMedicalConditionList());
		setMedicalConditionStageList(org.getMedicalConditionStageList());
		setMedicalContraindicationList(org.getMedicalContraindicationList());
		setMedicalDeviceList(org.getMedicalDeviceList());
		setMedicalDevicePurposeList(org.getMedicalDevicePurposeList());
		setMedicalEntityList(org.getMedicalEntityList());
		setMedicalEnumerationList(org.getMedicalEnumerationList());
		setMedicalEvidenceLevelList(org.getMedicalEvidenceLevelList());
		setMedicalGuidelineList(org.getMedicalGuidelineList());
		setMedicalGuidelineContraindicationList(org.getMedicalGuidelineContraindicationList());
		setMedicalGuidelineRecommendationList(org.getMedicalGuidelineRecommendationList());
		setMedicalImagingTechniqueList(org.getMedicalImagingTechniqueList());
		setMedicalIndicationList(org.getMedicalIndicationList());
		setMedicalIntangibleList(org.getMedicalIntangibleList());
		setMedicalObservationalStudyList(org.getMedicalObservationalStudyList());
		setMedicalObservationalStudyDesignList(org.getMedicalObservationalStudyDesignList());
		setMedicalOrganizationList(org.getMedicalOrganizationList());
		setMedicalProcedureList(org.getMedicalProcedureList());
		setMedicalProcedureTypeList(org.getMedicalProcedureTypeList());
		setMedicalRiskCalculatorList(org.getMedicalRiskCalculatorList());
		setMedicalRiskEstimatorList(org.getMedicalRiskEstimatorList());
		setMedicalRiskFactorList(org.getMedicalRiskFactorList());
		setMedicalRiskScoreList(org.getMedicalRiskScoreList());
		setMedicalScholarlyArticleList(org.getMedicalScholarlyArticleList());
		setMedicalSignList(org.getMedicalSignList());
		setMedicalSignOrSymptomList(org.getMedicalSignOrSymptomList());
		setMedicalSpecialtyList(org.getMedicalSpecialtyList());
		setMedicalStudyList(org.getMedicalStudyList());
		setMedicalStudyStatusList(org.getMedicalStudyStatusList());
		setMedicalSymptomList(org.getMedicalSymptomList());
		setMedicalTestList(org.getMedicalTestList());
		setMedicalTestPanelList(org.getMedicalTestPanelList());
		setMedicalTherapyList(org.getMedicalTherapyList());
		setMedicalTrialList(org.getMedicalTrialList());
		setMedicalTrialDesignList(org.getMedicalTrialDesignList());
		setMedicalWebPageList(org.getMedicalWebPageList());
		setMedicineSystemList(org.getMedicineSystemList());
		setMeetingRoomList(org.getMeetingRoomList());
		setMensClothingStoreList(org.getMensClothingStoreList());
		setMenuList(org.getMenuList());
		setMenuItemList(org.getMenuItemList());
		setMenuSectionList(org.getMenuSectionList());
		setMessageList(org.getMessageList());
		setMiddleSchoolList(org.getMiddleSchoolList());
		setMidwiferyList(org.getMidwiferyList());
		setMobileApplicationList(org.getMobileApplicationList());
		setMobilePhoneStoreList(org.getMobilePhoneStoreList());
		setMonetaryAmountList(org.getMonetaryAmountList());
		setMonetaryAmountDistributionList(org.getMonetaryAmountDistributionList());
		setMoneyTransferList(org.getMoneyTransferList());
		setMortgageLoanList(org.getMortgageLoanList());
		setMosqueList(org.getMosqueList());
		setMotelList(org.getMotelList());
		setMotorcycleList(org.getMotorcycleList());
		setMotorcycleDealerList(org.getMotorcycleDealerList());
		setMotorcycleRepairList(org.getMotorcycleRepairList());
		setMotorizedBicycleList(org.getMotorizedBicycleList());
		setMountainList(org.getMountainList());
		setMoveActionList(org.getMoveActionList());
		setMovieList(org.getMovieList());
		setMovieClipList(org.getMovieClipList());
		setMovieRentalStoreList(org.getMovieRentalStoreList());
		setMovieSeriesList(org.getMovieSeriesList());
		setMovieTheaterList(org.getMovieTheaterList());
		setMovingCompanyList(org.getMovingCompanyList());
		setMuscleList(org.getMuscleList());
		setMuseumList(org.getMuseumList());
		setMusicAlbumList(org.getMusicAlbumList());
		setMusicAlbumProductionTypeList(org.getMusicAlbumProductionTypeList());
		setMusicAlbumReleaseTypeList(org.getMusicAlbumReleaseTypeList());
		setMusicCompositionList(org.getMusicCompositionList());
		setMusicEventList(org.getMusicEventList());
		setMusicGroupList(org.getMusicGroupList());
		setMusicPlaylistList(org.getMusicPlaylistList());
		setMusicRecordingList(org.getMusicRecordingList());
		setMusicReleaseList(org.getMusicReleaseList());
		setMusicReleaseFormatTypeList(org.getMusicReleaseFormatTypeList());
		setMusicStoreList(org.getMusicStoreList());
		setMusicVenueList(org.getMusicVenueList());
		setMusicVideoObjectList(org.getMusicVideoObjectList());
		setNGOList(org.getNGOList());
		setNailSalonList(org.getNailSalonList());
		setNerveList(org.getNerveList());
		setNewsArticleList(org.getNewsArticleList());
		setNewsMediaOrganizationList(org.getNewsMediaOrganizationList());
		setNewspaperList(org.getNewspaperList());
		setNightClubList(org.getNightClubList());
		setNotaryList(org.getNotaryList());
		setNoteDigitalDocumentList(org.getNoteDigitalDocumentList());
		setNursingList(org.getNursingList());
		setNutritionInformationList(org.getNutritionInformationList());
		setObstetricList(org.getObstetricList());
		setOccupationList(org.getOccupationList());
		setOccupationalTherapyList(org.getOccupationalTherapyList());
		setOceanBodyOfWaterList(org.getOceanBodyOfWaterList());
		setOfferList(org.getOfferList());
		setOfferCatalogList(org.getOfferCatalogList());
		setOfferItemConditionList(org.getOfferItemConditionList());
		setOfficeEquipmentStoreList(org.getOfficeEquipmentStoreList());
		setOnDemandEventList(org.getOnDemandEventList());
		setOncologicList(org.getOncologicList());
		setOpeningHoursSpecificationList(org.getOpeningHoursSpecificationList());
		setOpinionNewsArticleList(org.getOpinionNewsArticleList());
		setOpticianList(org.getOpticianList());
		setOptometricList(org.getOptometricList());
		setOrderList(org.getOrderList());
		setOrderActionList(org.getOrderActionList());
		setOrderItemList(org.getOrderItemList());
		setOrderStatusList(org.getOrderStatusList());
		setOrganizationList(org.getOrganizationList());
		setOrganizationRoleList(org.getOrganizationRoleList());
		setOrganizeActionList(org.getOrganizeActionList());
		setOtolaryngologicList(org.getOtolaryngologicList());
		setOutletStoreList(org.getOutletStoreList());
		setOwnershipInfoList(org.getOwnershipInfoList());
		setPaintActionList(org.getPaintActionList());
		setPaintingList(org.getPaintingList());
		setPalliativeProcedureList(org.getPalliativeProcedureList());
		setParcelDeliveryList(org.getParcelDeliveryList());
		setParcelServiceList(org.getParcelServiceList());
		setParentAudienceList(org.getParentAudienceList());
		setParkList(org.getParkList());
		setParkingFacilityList(org.getParkingFacilityList());
		setPathologyTestList(org.getPathologyTestList());
		setPatientList(org.getPatientList());
		setPawnShopList(org.getPawnShopList());
		setPayActionList(org.getPayActionList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentChargeSpecificationList(org.getPaymentChargeSpecificationList());
		setPaymentMethodList(org.getPaymentMethodList());
		setPaymentServiceList(org.getPaymentServiceList());
		setPaymentStatusTypeList(org.getPaymentStatusTypeList());
		setPediatricList(org.getPediatricList());
		setPeopleAudienceList(org.getPeopleAudienceList());
		setPerformActionList(org.getPerformActionList());
		setPerformanceRoleList(org.getPerformanceRoleList());
		setPerformingArtsTheaterList(org.getPerformingArtsTheaterList());
		setPerformingGroupList(org.getPerformingGroupList());
		setPeriodicalList(org.getPeriodicalList());
		setPermitList(org.getPermitList());
		setPersonList(org.getPersonList());
		setPetStoreList(org.getPetStoreList());
		setPharmacyList(org.getPharmacyList());
		setPhotographList(org.getPhotographList());
		setPhotographActionList(org.getPhotographActionList());
		setPhysicalActivityList(org.getPhysicalActivityList());
		setPhysicalActivityCategoryList(org.getPhysicalActivityCategoryList());
		setPhysicalExamList(org.getPhysicalExamList());
		setPhysicalTherapyList(org.getPhysicalTherapyList());
		setPhysicianList(org.getPhysicianList());
		setPhysiotherapyList(org.getPhysiotherapyList());
		setPlaceList(org.getPlaceList());
		setPlaceOfWorshipList(org.getPlaceOfWorshipList());
		setPlanActionList(org.getPlanActionList());
		setPlasticSurgeryList(org.getPlasticSurgeryList());
		setPlayActionList(org.getPlayActionList());
		setPlaygroundList(org.getPlaygroundList());
		setPlumberList(org.getPlumberList());
		setPodiatricList(org.getPodiatricList());
		setPoliceStationList(org.getPoliceStationList());
		setPondList(org.getPondList());
		setPostOfficeList(org.getPostOfficeList());
		setPostalAddressList(org.getPostalAddressList());
		setPreOrderActionList(org.getPreOrderActionList());
		setPrependActionList(org.getPrependActionList());
		setPreschoolList(org.getPreschoolList());
		setPresentationDigitalDocumentList(org.getPresentationDigitalDocumentList());
		setPreventionIndicationList(org.getPreventionIndicationList());
		setPriceSpecificationList(org.getPriceSpecificationList());
		setPrimaryCareList(org.getPrimaryCareList());
		setProductList(org.getProductList());
		setProductModelList(org.getProductModelList());
		setProfessionalServiceList(org.getProfessionalServiceList());
		setProfilePageList(org.getProfilePageList());
		setProgramMembershipList(org.getProgramMembershipList());
		setPropertyList(org.getPropertyList());
		setPropertyValueList(org.getPropertyValueList());
		setPropertyValueSpecificationList(org.getPropertyValueSpecificationList());
		setPsychiatricList(org.getPsychiatricList());
		setPsychologicalTreatmentList(org.getPsychologicalTreatmentList());
		setPublicHealthList(org.getPublicHealthList());
		setPublicSwimmingPoolList(org.getPublicSwimmingPoolList());
		setPublicToiletList(org.getPublicToiletList());
		setPublicationEventList(org.getPublicationEventList());
		setPublicationIssueList(org.getPublicationIssueList());
		setPublicationVolumeList(org.getPublicationVolumeList());
		setQAPageList(org.getQAPageList());
		setQualitativeValueList(org.getQualitativeValueList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setQuantitativeValueDistributionList(org.getQuantitativeValueDistributionList());
		setQuantityList(org.getQuantityList());
		setQuestionList(org.getQuestionList());
		setQuotationList(org.getQuotationList());
		setQuoteActionList(org.getQuoteActionList());
		setRVParkList(org.getRVParkList());
		setRadiationTherapyList(org.getRadiationTherapyList());
		setRadioChannelList(org.getRadioChannelList());
		setRadioClipList(org.getRadioClipList());
		setRadioEpisodeList(org.getRadioEpisodeList());
		setRadioSeasonList(org.getRadioSeasonList());
		setRadioSeriesList(org.getRadioSeriesList());
		setRadioStationList(org.getRadioStationList());
		setRatingList(org.getRatingList());
		setReactActionList(org.getReactActionList());
		setReadActionList(org.getReadActionList());
		setRealEstateAgentList(org.getRealEstateAgentList());
		setReceiveActionList(org.getReceiveActionList());
		setRecipeList(org.getRecipeList());
		setRecommendedDoseScheduleList(org.getRecommendedDoseScheduleList());
		setRecyclingCenterList(org.getRecyclingCenterList());
		setRegisterActionList(org.getRegisterActionList());
		setRejectActionList(org.getRejectActionList());
		setRentActionList(org.getRentActionList());
		setRentalCarReservationList(org.getRentalCarReservationList());
		setRepaymentSpecificationList(org.getRepaymentSpecificationList());
		setReplaceActionList(org.getReplaceActionList());
		setReplyActionList(org.getReplyActionList());
		setReportList(org.getReportList());
		setReportageNewsArticleList(org.getReportageNewsArticleList());
		setReportedDoseScheduleList(org.getReportedDoseScheduleList());
		setReservationList(org.getReservationList());
		setReservationPackageList(org.getReservationPackageList());
		setReservationStatusTypeList(org.getReservationStatusTypeList());
		setReserveActionList(org.getReserveActionList());
		setReservoirList(org.getReservoirList());
		setResidenceList(org.getResidenceList());
		setResortList(org.getResortList());
		setRespiratoryTherapyList(org.getRespiratoryTherapyList());
		setRestaurantList(org.getRestaurantList());
		setRestrictedDietList(org.getRestrictedDietList());
		setResumeActionList(org.getResumeActionList());
		setReturnActionList(org.getReturnActionList());
		setReviewList(org.getReviewList());
		setReviewActionList(org.getReviewActionList());
		setReviewNewsArticleList(org.getReviewNewsArticleList());
		setRiverBodyOfWaterList(org.getRiverBodyOfWaterList());
		setRoleList(org.getRoleList());
		setRoofingContractorList(org.getRoofingContractorList());
		setRoomList(org.getRoomList());
		setRsvpActionList(org.getRsvpActionList());
		setRsvpResponseTypeList(org.getRsvpResponseTypeList());
		setSaleEventList(org.getSaleEventList());
		setSatiricalArticleList(org.getSatiricalArticleList());
		setScheduleList(org.getScheduleList());
		setScheduleActionList(org.getScheduleActionList());
		setScholarlyArticleList(org.getScholarlyArticleList());
		setSchoolList(org.getSchoolList());
		setScreeningEventList(org.getScreeningEventList());
		setSculptureList(org.getSculptureList());
		setSeaBodyOfWaterList(org.getSeaBodyOfWaterList());
		setSearchActionList(org.getSearchActionList());
		setSearchResultsPageList(org.getSearchResultsPageList());
		setSeatList(org.getSeatList());
		setSelfStorageList(org.getSelfStorageList());
		setSellActionList(org.getSellActionList());
		setSendActionList(org.getSendActionList());
		setSeriesList(org.getSeriesList());
		setServiceList(org.getServiceList());
		setServiceChannelList(org.getServiceChannelList());
		setShareActionList(org.getShareActionList());
		setShoeStoreList(org.getShoeStoreList());
		setShoppingCenterList(org.getShoppingCenterList());
		setSingleFamilyResidenceList(org.getSingleFamilyResidenceList());
		setSiteNavigationElementList(org.getSiteNavigationElementList());
		setSkiResortList(org.getSkiResortList());
		setSocialEventList(org.getSocialEventList());
		setSocialMediaPostingList(org.getSocialMediaPostingList());
		setSoftwareApplicationList(org.getSoftwareApplicationList());
		setSoftwareSourceCodeList(org.getSoftwareSourceCodeList());
		setSomeProductsList(org.getSomeProductsList());
		setSpeakableSpecificationList(org.getSpeakableSpecificationList());
		setSpecialtyList(org.getSpecialtyList());
		setSportingGoodsStoreList(org.getSportingGoodsStoreList());
		setSportsActivityLocationList(org.getSportsActivityLocationList());
		setSportsClubList(org.getSportsClubList());
		setSportsEventList(org.getSportsEventList());
		setSportsOrganizationList(org.getSportsOrganizationList());
		setSportsTeamList(org.getSportsTeamList());
		setSpreadsheetDigitalDocumentList(org.getSpreadsheetDigitalDocumentList());
		setStadiumOrArenaList(org.getStadiumOrArenaList());
		setStateList(org.getStateList());
		setSteeringPositionValueList(org.getSteeringPositionValueList());
		setStoreList(org.getStoreList());
		setStructuredValueList(org.getStructuredValueList());
		setSubscribeActionList(org.getSubscribeActionList());
		setSubstanceList(org.getSubstanceList());
		setSubwayStationList(org.getSubwayStationList());
		setSuiteList(org.getSuiteList());
		setSuperficialAnatomyList(org.getSuperficialAnatomyList());
		setSurgicalProcedureList(org.getSurgicalProcedureList());
		setSuspendActionList(org.getSuspendActionList());
		setSynagogueList(org.getSynagogueList());
		setTVClipList(org.getTVClipList());
		setTVEpisodeList(org.getTVEpisodeList());
		setTVSeasonList(org.getTVSeasonList());
		setTVSeriesList(org.getTVSeriesList());
		setTableList(org.getTableList());
		setTakeActionList(org.getTakeActionList());
		setTattooParlorList(org.getTattooParlorList());
		setTaxiReservationList(org.getTaxiReservationList());
		setTaxiServiceList(org.getTaxiServiceList());
		setTaxiStandList(org.getTaxiStandList());
		setTechArticleList(org.getTechArticleList());
		setTelevisionChannelList(org.getTelevisionChannelList());
		setTelevisionStationList(org.getTelevisionStationList());
		setTennisComplexList(org.getTennisComplexList());
		setTextDigitalDocumentList(org.getTextDigitalDocumentList());
		setTheaterEventList(org.getTheaterEventList());
		setTheaterGroupList(org.getTheaterGroupList());
		setTherapeuticProcedureList(org.getTherapeuticProcedureList());
		setThesisList(org.getThesisList());
		setThingList(org.getThingList());
		setTicketList(org.getTicketList());
		setTieActionList(org.getTieActionList());
		setTipActionList(org.getTipActionList());
		setTireShopList(org.getTireShopList());
		setTouristAttractionList(org.getTouristAttractionList());
		setTouristDestinationList(org.getTouristDestinationList());
		setTouristInformationCenterList(org.getTouristInformationCenterList());
		setTouristTripList(org.getTouristTripList());
		setToyStoreList(org.getToyStoreList());
		setTrackActionList(org.getTrackActionList());
		setTradeActionList(org.getTradeActionList());
		setTrainReservationList(org.getTrainReservationList());
		setTrainStationList(org.getTrainStationList());
		setTrainTripList(org.getTrainTripList());
		setTransferActionList(org.getTransferActionList());
		setTravelActionList(org.getTravelActionList());
		setTravelAgencyList(org.getTravelAgencyList());
		setTreatmentIndicationList(org.getTreatmentIndicationList());
		setTripList(org.getTripList());
		setTypeAndQuantityNodeList(org.getTypeAndQuantityNodeList());
		setUnRegisterActionList(org.getUnRegisterActionList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
		setUpdateActionList(org.getUpdateActionList());
		setUseActionList(org.getUseActionList());
		setUserReviewList(org.getUserReviewList());
		setVehicleList(org.getVehicleList());
		setVeinList(org.getVeinList());
		setVesselList(org.getVesselList());
		setVeterinaryCareList(org.getVeterinaryCareList());
		setVideoGalleryList(org.getVideoGalleryList());
		setVideoGameList(org.getVideoGameList());
		setVideoGameClipList(org.getVideoGameClipList());
		setVideoGameSeriesList(org.getVideoGameSeriesList());
		setVideoObjectList(org.getVideoObjectList());
		setViewActionList(org.getViewActionList());
		setVisualArtsEventList(org.getVisualArtsEventList());
		setVisualArtworkList(org.getVisualArtworkList());
		setVitalSignList(org.getVitalSignList());
		setVolcanoList(org.getVolcanoList());
		setVoteActionList(org.getVoteActionList());
		setWPAdBlockList(org.getWPAdBlockList());
		setWPFooterList(org.getWPFooterList());
		setWPHeaderList(org.getWPHeaderList());
		setWPSideBarList(org.getWPSideBarList());
		setWantActionList(org.getWantActionList());
		setWarrantyPromiseList(org.getWarrantyPromiseList());
		setWarrantyScopeList(org.getWarrantyScopeList());
		setWatchActionList(org.getWatchActionList());
		setWaterfallList(org.getWaterfallList());
		setWearActionList(org.getWearActionList());
		setWebAPIList(org.getWebAPIList());
		setWebApplicationList(org.getWebApplicationList());
		setWebPageList(org.getWebPageList());
		setWebPageElementList(org.getWebPageElementList());
		setWebSiteList(org.getWebSiteList());
		setWholesaleStoreList(org.getWholesaleStoreList());
		setWinActionList(org.getWinActionList());
		setWineryList(org.getWineryList());
		setWorkersUnionList(org.getWorkersUnionList());
		setWriteActionList(org.getWriteActionList());
		setZooList(org.getZooList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
