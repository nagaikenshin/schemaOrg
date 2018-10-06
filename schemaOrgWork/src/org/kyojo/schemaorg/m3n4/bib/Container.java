package org.kyojo.schemaorg.m3n4.bib;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n4.bib.Clazz;
import org.kyojo.schemaorg.m3n4.core.Clazz.APIReference;
import org.kyojo.schemaorg.m3n4.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.AccountingService;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdultEntertainment;
import org.kyojo.schemaorg.m3n4.core.Clazz.Airline;
import org.kyojo.schemaorg.m3n4.core.Clazz.AmusementPark;
import org.kyojo.schemaorg.m3n4.core.Clazz.AnimalShelter;
import org.kyojo.schemaorg.m3n4.core.Clazz.Answer;
import org.kyojo.schemaorg.m3n4.core.Clazz.ArtGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.Attorney;
import org.kyojo.schemaorg.m3n4.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoBodyShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoDealer;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoPartsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoRental;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoRepair;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutoWash;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomatedTeller;
import org.kyojo.schemaorg.m3n4.core.Clazz.AutomotiveBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Bakery;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankOrCreditUnion;
import org.kyojo.schemaorg.m3n4.core.Clazz.BarOrPub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n4.core.Clazz.BeautySalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedAndBreakfast;
import org.kyojo.schemaorg.m3n4.core.Clazz.BikeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Blog;
import org.kyojo.schemaorg.m3n4.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.Book;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.BowlingAlley;
import org.kyojo.schemaorg.m3n4.core.Clazz.Brewery;
import org.kyojo.schemaorg.m3n4.core.Clazz.CafeOrCoffeeShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.Campground;
import org.kyojo.schemaorg.m3n4.core.Clazz.Casino;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckoutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildCare;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClaimReview;
import org.kyojo.schemaorg.m3n4.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollectionPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollegeOrUniversity;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Comment;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConvenienceStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Conversation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Corporation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Course;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.DanceGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataCatalog;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataDownload;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dataset;
import org.kyojo.schemaorg.m3n4.core.Clazz.DaySpa;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dentist;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.DigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscussionForumPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.DryCleaningOrLaundry;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Electrician;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElectronicsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElementarySchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmailMessage;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmergencyService;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmploymentAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.EntertainmentBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Episode;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseGym;
import org.kyojo.schemaorg.m3n4.core.Clazz.FastFoodRestaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.FinancialService;
import org.kyojo.schemaorg.m3n4.core.Clazz.FireStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Florist;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishment;
import org.kyojo.schemaorg.m3n4.core.Clazz.FurnitureStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Game;
import org.kyojo.schemaorg.m3n4.core.Clazz.GardenStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.GasStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeneralContractor;
import org.kyojo.schemaorg.m3n4.core.Clazz.GolfCourse;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentOffice;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.GroceryStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.HVACBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HairSalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.HardwareStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthAndBeautyBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HealthClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.HighSchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.HobbyShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeAndConstructionBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.HomeGoodsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hospital;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hostel;
import org.kyojo.schemaorg.m3n4.core.Clazz.Hotel;
import org.kyojo.schemaorg.m3n4.core.Clazz.HousePainter;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowTo;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToDirection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToTip;
import org.kyojo.schemaorg.m3n4.core.Clazz.IceCreamShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsuranceAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.InternetCafe;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.JewelryStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.Library;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiquorStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocalBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Locksmith;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Map;
import org.kyojo.schemaorg.m3n4.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.MedicalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.MensClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Menu;
import org.kyojo.schemaorg.m3n4.core.Clazz.MenuSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.Message;
import org.kyojo.schemaorg.m3n4.core.Clazz.MiddleSchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobilePhoneStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Motel;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleDealer;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleRepair;
import org.kyojo.schemaorg.m3n4.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieRentalStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieTheater;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovingCompany;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicComposition;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicPlaylist;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRelease;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicVideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.NGO;
import org.kyojo.schemaorg.m3n4.core.Clazz.NailSalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.NightClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Notary;
import org.kyojo.schemaorg.m3n4.core.Clazz.NoteDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfficeEquipmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.OutletStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Painting;
import org.kyojo.schemaorg.m3n4.core.Clazz.PawnShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.Periodical;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.PetStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Pharmacy;
import org.kyojo.schemaorg.m3n4.core.Clazz.Photograph;
import org.kyojo.schemaorg.m3n4.core.Clazz.Physician;
import org.kyojo.schemaorg.m3n4.core.Clazz.Plumber;
import org.kyojo.schemaorg.m3n4.core.Clazz.PoliceStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.PostOffice;
import org.kyojo.schemaorg.m3n4.core.Clazz.Preschool;
import org.kyojo.schemaorg.m3n4.core.Clazz.PresentationDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfessionalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfilePage;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicSwimmingPool;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationVolume;
import org.kyojo.schemaorg.m3n4.core.Clazz.QAPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.Question;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.RealEstateAgent;
import org.kyojo.schemaorg.m3n4.core.Clazz.Recipe;
import org.kyojo.schemaorg.m3n4.core.Clazz.RecyclingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.Report;
import org.kyojo.schemaorg.m3n4.core.Clazz.Resort;
import org.kyojo.schemaorg.m3n4.core.Clazz.Restaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.Review;
import org.kyojo.schemaorg.m3n4.core.Clazz.RoofingContractor;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScholarlyArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.School;
import org.kyojo.schemaorg.m3n4.core.Clazz.Sculpture;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchResultsPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.SelfStorage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoppingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.SiteNavigationElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.SkiResort;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialMediaPosting;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareSourceCode;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportingGoodsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsActivityLocation;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsTeam;
import org.kyojo.schemaorg.m3n4.core.Clazz.SpreadsheetDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.StadiumOrArena;
import org.kyojo.schemaorg.m3n4.core.Clazz.Store;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVEpisode;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.TVSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.Table;
import org.kyojo.schemaorg.m3n4.core.Clazz.TattooParlor;
import org.kyojo.schemaorg.m3n4.core.Clazz.TechArticle;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TennisComplex;
import org.kyojo.schemaorg.m3n4.core.Clazz.TextDigitalDocument;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.TireShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristInformationCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.ToyStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.TravelAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameSeries;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtwork;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPAdBlock;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPFooter;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPHeader;
import org.kyojo.schemaorg.m3n4.core.Clazz.WPSideBar;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebSite;
import org.kyojo.schemaorg.m3n4.core.Clazz.WholesaleStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Winery;
import org.kyojo.schemaorg.m3n4.core.Container.Actor;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticLab;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalClinic;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalScholarlyArticle;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalWebPage;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Optician;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VeterinaryCare;
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
import org.kyojo.schemaorg.m3n4.pending.Clazz.AdvertiserContentArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCodeSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Claim;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CompleteDataFeed;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Consortium;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CorrectionComment;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CriticReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTermSet;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Distillery;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EmployerReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FAQPage;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Legislation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegislationObject;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LibrarySystem;
import org.kyojo.schemaorg.m3n4.pending.Clazz.NewsMediaOrganization;
import org.kyojo.schemaorg.m3n4.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Quotation;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReviewNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.SatiricalArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.UserReview;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WorkersUnion;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/abridged")
	@SchemaOrgLabel("abridged")
	@SchemaOrgComment(""
			+ "Indicates whether the book is an abridged edition.")
	@CamelizedName("abridged")
	@ConstantizedName("ABRIDGED")
	public interface Abridged extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/artist")
	@SchemaOrgLabel("artist")
	@SchemaOrgComment(""
			+ "The primary artist for a work\n    in a medium other than pencils or digital"
			+ " line art--for example, if the\n    primary artwork is done in watercolors or"
			+ " digital paints.")
	@CamelizedName("artist")
	@ConstantizedName("ARTIST")
	public interface Artist extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/colorist")
	@SchemaOrgLabel("colorist")
	@SchemaOrgComment(""
			+ "The individual who adds color to inked drawings.")
	@CamelizedName("colorist")
	@ConstantizedName("COLORIST")
	public interface Colorist extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/inSupportOf")
	@SchemaOrgLabel("inSupportOf")
	@SchemaOrgComment(""
			+ "Qualification, candidature, degree, application that Thesis supports.")
	@CamelizedName("inSupportOf")
	@ConstantizedName("IN_SUPPORT_OF")
	public interface InSupportOf extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/inker")
	@SchemaOrgLabel("inker")
	@SchemaOrgComment(""
			+ "The individual who traces over the pencil drawings in ink after pencils are"
			+ " complete.")
	@CamelizedName("inker")
	@ConstantizedName("INKER")
	public interface Inker extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/letterer")
	@SchemaOrgLabel("letterer")
	@SchemaOrgComment(""
			+ "The individual who adds lettering, including speech balloons and sound effects,"
			+ " to artwork.")
	@CamelizedName("letterer")
	@ConstantizedName("LETTERER")
	public interface Letterer extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/penciler")
	@SchemaOrgLabel("penciler")
	@SchemaOrgComment(""
			+ "The individual who draws the primary narrative artwork.")
	@CamelizedName("penciler")
	@ConstantizedName("PENCILER")
	public interface Penciler extends SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/publishedBy")
	@SchemaOrgLabel("publishedBy")
	@SchemaOrgComment(""
			+ "An agent associated with the publication event.")
	@CamelizedName("publishedBy")
	@ConstantizedName("PUBLISHED_BY")
	public interface PublishedBy extends SchemaOrgProperty {

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
		public DiagnosticLab getDiagnosticLab();
		public void setDiagnosticLab(DiagnosticLab diagnosticLab);
		public List<DiagnosticLab> getDiagnosticLabList();
		public void setDiagnosticLabList(List<DiagnosticLab> diagnosticLabList);
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
		public MedicalBusiness getMedicalBusiness();
		public void setMedicalBusiness(MedicalBusiness medicalBusiness);
		public List<MedicalBusiness> getMedicalBusinessList();
		public void setMedicalBusinessList(List<MedicalBusiness> medicalBusinessList);
		public boolean hasMedicalBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalClinic">http://schema.org/MedicalClinic</a>
		 */
		public MedicalClinic getMedicalClinic();
		public void setMedicalClinic(MedicalClinic medicalClinic);
		public List<MedicalClinic> getMedicalClinicList();
		public void setMedicalClinicList(List<MedicalClinic> medicalClinicList);
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
		public Optician getOptician();
		public void setOptician(Optician optician);
		public List<Optician> getOpticianList();
		public void setOpticianList(List<Optician> opticianList);
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
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
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
		public VeterinaryCare getVeterinaryCare();
		public void setVeterinaryCare(VeterinaryCare veterinaryCare);
		public List<VeterinaryCare> getVeterinaryCareList();
		public void setVeterinaryCareList(List<VeterinaryCare> veterinaryCareList);
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
	@SchemaOrgURI("http://schema.org/publisherImprint")
	@SchemaOrgLabel("publisherImprint")
	@SchemaOrgComment(""
			+ "The publishing division which published the comic.")
	@CamelizedName("publisherImprint")
	@ConstantizedName("PUBLISHER_IMPRINT")
	public interface PublisherImprint extends SchemaOrgProperty {

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
		public DiagnosticLab getDiagnosticLab();
		public void setDiagnosticLab(DiagnosticLab diagnosticLab);
		public List<DiagnosticLab> getDiagnosticLabList();
		public void setDiagnosticLabList(List<DiagnosticLab> diagnosticLabList);
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
		public MedicalBusiness getMedicalBusiness();
		public void setMedicalBusiness(MedicalBusiness medicalBusiness);
		public List<MedicalBusiness> getMedicalBusinessList();
		public void setMedicalBusinessList(List<MedicalBusiness> medicalBusinessList);
		public boolean hasMedicalBusiness();

		/**
		 * @see <a href="http://schema.org/MedicalClinic">http://schema.org/MedicalClinic</a>
		 */
		public MedicalClinic getMedicalClinic();
		public void setMedicalClinic(MedicalClinic medicalClinic);
		public List<MedicalClinic> getMedicalClinicList();
		public void setMedicalClinicList(List<MedicalClinic> medicalClinicList);
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
		public Optician getOptician();
		public void setOptician(Optician optician);
		public List<Optician> getOpticianList();
		public void setOpticianList(List<Optician> opticianList);
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
		public VeterinaryCare getVeterinaryCare();
		public void setVeterinaryCare(VeterinaryCare veterinaryCare);
		public List<VeterinaryCare> getVeterinaryCareList();
		public void setVeterinaryCareList(List<VeterinaryCare> veterinaryCareList);
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
	@SchemaOrgURI("http://schema.org/readBy")
	@SchemaOrgLabel("readBy")
	@SchemaOrgComment(""
			+ "A person who reads (performs) the audiobook.")
	@CamelizedName("readBy")
	@ConstantizedName("READ_BY")
	public interface ReadBy extends Actor, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

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
	@SchemaOrgURI("http://schema.org/translationOfWork")
	@SchemaOrgLabel("translationOfWork")
	@SchemaOrgComment(""
			+ "The work that this work has been translated from. e.g. 物种起源 is a translationOf"
			+ " “On the Origin of Species”")
	@CamelizedName("translationOfWork")
	@ConstantizedName("TRANSLATION_OF_WORK")
	public interface TranslationOfWork extends SchemaOrgProperty {

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
		 * @see <a href="http://schema.org/AdvertiserContentArticle">http://schema.org/AdvertiserContentArticle</a>
		 */
		public AdvertiserContentArticle getAdvertiserContentArticle();
		public void setAdvertiserContentArticle(AdvertiserContentArticle advertiserContentArticle);
		public List<AdvertiserContentArticle> getAdvertiserContentArticleList();
		public void setAdvertiserContentArticleList(List<AdvertiserContentArticle> advertiserContentArticleList);
		public boolean hasAdvertiserContentArticle();

		/**
		 * @see <a href="http://schema.org/AnalysisNewsArticle">http://schema.org/AnalysisNewsArticle</a>
		 */
		public AnalysisNewsArticle getAnalysisNewsArticle();
		public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle);
		public List<AnalysisNewsArticle> getAnalysisNewsArticleList();
		public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList);
		public boolean hasAnalysisNewsArticle();

		/**
		 * @see <a href="http://schema.org/Answer">http://schema.org/Answer</a>
		 */
		public Answer getAnswer();
		public void setAnswer(Answer answer);
		public List<Answer> getAnswerList();
		public void setAnswerList(List<Answer> answerList);
		public boolean hasAnswer();

		/**
		 * @see <a href="http://schema.org/Article">http://schema.org/Article</a>
		 */
		public Article getArticle();
		public void setArticle(Article article);
		public List<Article> getArticleList();
		public void setArticleList(List<Article> articleList);
		public boolean hasArticle();

		/**
		 * @see <a href="http://schema.org/AskPublicNewsArticle">http://schema.org/AskPublicNewsArticle</a>
		 */
		public AskPublicNewsArticle getAskPublicNewsArticle();
		public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle);
		public List<AskPublicNewsArticle> getAskPublicNewsArticleList();
		public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList);
		public boolean hasAskPublicNewsArticle();

		/**
		 * @see <a href="http://schema.org/Atlas">http://schema.org/Atlas</a>
		 */
		public Clazz.Atlas getAtlas();
		public void setAtlas(Clazz.Atlas atlas);
		public List<Clazz.Atlas> getAtlasList();
		public void setAtlasList(List<Clazz.Atlas> atlasList);
		public boolean hasAtlas();

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
		public Clazz.Audiobook getAudiobook();
		public void setAudiobook(Clazz.Audiobook audiobook);
		public List<Clazz.Audiobook> getAudiobookList();
		public void setAudiobookList(List<Clazz.Audiobook> audiobookList);
		public boolean hasAudiobook();

		/**
		 * @see <a href="http://schema.org/BackgroundNewsArticle">http://schema.org/BackgroundNewsArticle</a>
		 */
		public BackgroundNewsArticle getBackgroundNewsArticle();
		public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle);
		public List<BackgroundNewsArticle> getBackgroundNewsArticleList();
		public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList);
		public boolean hasBackgroundNewsArticle();

		/**
		 * @see <a href="http://schema.org/Barcode">http://schema.org/Barcode</a>
		 */
		public Barcode getBarcode();
		public void setBarcode(Barcode barcode);
		public List<Barcode> getBarcodeList();
		public void setBarcodeList(List<Barcode> barcodeList);
		public boolean hasBarcode();

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
		 * @see <a href="http://schema.org/Book">http://schema.org/Book</a>
		 */
		public Book getBook();
		public void setBook(Book book);
		public List<Book> getBookList();
		public void setBookList(List<Book> bookList);
		public boolean hasBook();

		/**
		 * @see <a href="http://schema.org/BookSeries">http://schema.org/BookSeries</a>
		 */
		public BookSeries getBookSeries();
		public void setBookSeries(BookSeries bookSeries);
		public List<BookSeries> getBookSeriesList();
		public void setBookSeriesList(List<BookSeries> bookSeriesList);
		public boolean hasBookSeries();

		/**
		 * @see <a href="http://schema.org/CategoryCodeSet">http://schema.org/CategoryCodeSet</a>
		 */
		public CategoryCodeSet getCategoryCodeSet();
		public void setCategoryCodeSet(CategoryCodeSet categoryCodeSet);
		public List<CategoryCodeSet> getCategoryCodeSetList();
		public void setCategoryCodeSetList(List<CategoryCodeSet> categoryCodeSetList);
		public boolean hasCategoryCodeSet();

		/**
		 * @see <a href="http://schema.org/Chapter">http://schema.org/Chapter</a>
		 */
		public Clazz.Chapter getChapter();
		public void setChapter(Clazz.Chapter chapter);
		public List<Clazz.Chapter> getChapterList();
		public void setChapterList(List<Clazz.Chapter> chapterList);
		public boolean hasChapter();

		/**
		 * @see <a href="http://schema.org/CheckoutPage">http://schema.org/CheckoutPage</a>
		 */
		public CheckoutPage getCheckoutPage();
		public void setCheckoutPage(CheckoutPage checkoutPage);
		public List<CheckoutPage> getCheckoutPageList();
		public void setCheckoutPageList(List<CheckoutPage> checkoutPageList);
		public boolean hasCheckoutPage();

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
		 * @see <a href="http://schema.org/Clip">http://schema.org/Clip</a>
		 */
		public Clip getClip();
		public void setClip(Clip clip);
		public List<Clip> getClipList();
		public void setClipList(List<Clip> clipList);
		public boolean hasClip();

		/**
		 * @see <a href="http://schema.org/Collection">http://schema.org/Collection</a>
		 */
		public Clazz.Collection getCollection();
		public void setCollection(Clazz.Collection collection);
		public List<Clazz.Collection> getCollectionList();
		public void setCollectionList(List<Clazz.Collection> collectionList);
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
		 * @see <a href="http://schema.org/ComicCoverArt">http://schema.org/ComicCoverArt</a>
		 */
		public Clazz.ComicCoverArt getComicCoverArt();
		public void setComicCoverArt(Clazz.ComicCoverArt comicCoverArt);
		public List<Clazz.ComicCoverArt> getComicCoverArtList();
		public void setComicCoverArtList(List<Clazz.ComicCoverArt> comicCoverArtList);
		public boolean hasComicCoverArt();

		/**
		 * @see <a href="http://schema.org/ComicIssue">http://schema.org/ComicIssue</a>
		 */
		public Clazz.ComicIssue getComicIssue();
		public void setComicIssue(Clazz.ComicIssue comicIssue);
		public List<Clazz.ComicIssue> getComicIssueList();
		public void setComicIssueList(List<Clazz.ComicIssue> comicIssueList);
		public boolean hasComicIssue();

		/**
		 * @see <a href="http://schema.org/ComicSeries">http://schema.org/ComicSeries</a>
		 */
		public Clazz.ComicSeries getComicSeries();
		public void setComicSeries(Clazz.ComicSeries comicSeries);
		public List<Clazz.ComicSeries> getComicSeriesList();
		public void setComicSeriesList(List<Clazz.ComicSeries> comicSeriesList);
		public boolean hasComicSeries();

		/**
		 * @see <a href="http://schema.org/ComicStory">http://schema.org/ComicStory</a>
		 */
		public Clazz.ComicStory getComicStory();
		public void setComicStory(Clazz.ComicStory comicStory);
		public List<Clazz.ComicStory> getComicStoryList();
		public void setComicStoryList(List<Clazz.ComicStory> comicStoryList);
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
		 * @see <a href="http://schema.org/CompleteDataFeed">http://schema.org/CompleteDataFeed</a>
		 */
		public CompleteDataFeed getCompleteDataFeed();
		public void setCompleteDataFeed(CompleteDataFeed completeDataFeed);
		public List<CompleteDataFeed> getCompleteDataFeedList();
		public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList);
		public boolean hasCompleteDataFeed();

		/**
		 * @see <a href="http://schema.org/ContactPage">http://schema.org/ContactPage</a>
		 */
		public ContactPage getContactPage();
		public void setContactPage(ContactPage contactPage);
		public List<ContactPage> getContactPageList();
		public void setContactPageList(List<ContactPage> contactPageList);
		public boolean hasContactPage();

		/**
		 * @see <a href="http://schema.org/Conversation">http://schema.org/Conversation</a>
		 */
		public Conversation getConversation();
		public void setConversation(Conversation conversation);
		public List<Conversation> getConversationList();
		public void setConversationList(List<Conversation> conversationList);
		public boolean hasConversation();

		/**
		 * @see <a href="http://schema.org/CorrectionComment">http://schema.org/CorrectionComment</a>
		 */
		public CorrectionComment getCorrectionComment();
		public void setCorrectionComment(CorrectionComment correctionComment);
		public List<CorrectionComment> getCorrectionCommentList();
		public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList);
		public boolean hasCorrectionComment();

		/**
		 * @see <a href="http://schema.org/Course">http://schema.org/Course</a>
		 */
		public Course getCourse();
		public void setCourse(Course course);
		public List<Course> getCourseList();
		public void setCourseList(List<Course> courseList);
		public boolean hasCourse();

		/**
		 * @see <a href="http://schema.org/CoverArt">http://schema.org/CoverArt</a>
		 */
		public Clazz.CoverArt getCoverArt();
		public void setCoverArt(Clazz.CoverArt coverArt);
		public List<Clazz.CoverArt> getCoverArtList();
		public void setCoverArtList(List<Clazz.CoverArt> coverArtList);
		public boolean hasCoverArt();

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
		 * @see <a href="http://schema.org/CriticReview">http://schema.org/CriticReview</a>
		 */
		public CriticReview getCriticReview();
		public void setCriticReview(CriticReview criticReview);
		public List<CriticReview> getCriticReviewList();
		public void setCriticReviewList(List<CriticReview> criticReviewList);
		public boolean hasCriticReview();

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
		 * @see <a href="http://schema.org/Dataset">http://schema.org/Dataset</a>
		 */
		public Dataset getDataset();
		public void setDataset(Dataset dataset);
		public List<Dataset> getDatasetList();
		public void setDatasetList(List<Dataset> datasetList);
		public boolean hasDataset();

		/**
		 * @see <a href="http://schema.org/DefinedTermSet">http://schema.org/DefinedTermSet</a>
		 */
		public DefinedTermSet getDefinedTermSet();
		public void setDefinedTermSet(DefinedTermSet definedTermSet);
		public List<DefinedTermSet> getDefinedTermSetList();
		public void setDefinedTermSetList(List<DefinedTermSet> definedTermSetList);
		public boolean hasDefinedTermSet();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Diet getDiet();
		public void setDiet(Diet diet);
		public List<Diet> getDietList();
		public void setDietList(List<Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DigitalDocument">http://schema.org/DigitalDocument</a>
		 */
		public DigitalDocument getDigitalDocument();
		public void setDigitalDocument(DigitalDocument digitalDocument);
		public List<DigitalDocument> getDigitalDocumentList();
		public void setDigitalDocumentList(List<DigitalDocument> digitalDocumentList);
		public boolean hasDigitalDocument();

		/**
		 * @see <a href="http://schema.org/DiscussionForumPosting">http://schema.org/DiscussionForumPosting</a>
		 */
		public DiscussionForumPosting getDiscussionForumPosting();
		public void setDiscussionForumPosting(DiscussionForumPosting discussionForumPosting);
		public List<DiscussionForumPosting> getDiscussionForumPostingList();
		public void setDiscussionForumPostingList(List<DiscussionForumPosting> discussionForumPostingList);
		public boolean hasDiscussionForumPosting();

		/**
		 * @see <a href="http://schema.org/EmailMessage">http://schema.org/EmailMessage</a>
		 */
		public EmailMessage getEmailMessage();
		public void setEmailMessage(EmailMessage emailMessage);
		public List<EmailMessage> getEmailMessageList();
		public void setEmailMessageList(List<EmailMessage> emailMessageList);
		public boolean hasEmailMessage();

		/**
		 * @see <a href="http://schema.org/EmployerReview">http://schema.org/EmployerReview</a>
		 */
		public EmployerReview getEmployerReview();
		public void setEmployerReview(EmployerReview employerReview);
		public List<EmployerReview> getEmployerReviewList();
		public void setEmployerReviewList(List<EmployerReview> employerReviewList);
		public boolean hasEmployerReview();

		/**
		 * @see <a href="http://schema.org/Episode">http://schema.org/Episode</a>
		 */
		public Episode getEpisode();
		public void setEpisode(Episode episode);
		public List<Episode> getEpisodeList();
		public void setEpisodeList(List<Episode> episodeList);
		public boolean hasEpisode();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public ExercisePlan getExercisePlan();
		public void setExercisePlan(ExercisePlan exercisePlan);
		public List<ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/FAQPage">http://schema.org/FAQPage</a>
		 */
		public FAQPage getFAQPage();
		public void setFAQPage(FAQPage faqPage);
		public List<FAQPage> getFAQPageList();
		public void setFAQPageList(List<FAQPage> faqPageList);
		public boolean hasFAQPage();

		/**
		 * @see <a href="http://schema.org/Game">http://schema.org/Game</a>
		 */
		public Game getGame();
		public void setGame(Game game);
		public List<Game> getGameList();
		public void setGameList(List<Game> gameList);
		public boolean hasGame();

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
		 * @see <a href="http://schema.org/HowToTip">http://schema.org/HowToTip</a>
		 */
		public HowToTip getHowToTip();
		public void setHowToTip(HowToTip howToTip);
		public List<HowToTip> getHowToTipList();
		public void setHowToTipList(List<HowToTip> howToTipList);
		public boolean hasHowToTip();

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
		 * @see <a href="http://schema.org/ItemPage">http://schema.org/ItemPage</a>
		 */
		public ItemPage getItemPage();
		public void setItemPage(ItemPage itemPage);
		public List<ItemPage> getItemPageList();
		public void setItemPageList(List<ItemPage> itemPageList);
		public boolean hasItemPage();

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
		 * @see <a href="http://schema.org/LiveBlogPosting">http://schema.org/LiveBlogPosting</a>
		 */
		public LiveBlogPosting getLiveBlogPosting();
		public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting);
		public List<LiveBlogPosting> getLiveBlogPostingList();
		public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList);
		public boolean hasLiveBlogPosting();

		/**
		 * @see <a href="http://schema.org/Map">http://schema.org/Map</a>
		 */
		public Map getMap();
		public void setMap(Map map);
		public List<Map> getMapList();
		public void setMapList(List<Map> mapList);
		public boolean hasMap();

		/**
		 * @see <a href="http://schema.org/MediaObject">http://schema.org/MediaObject</a>
		 */
		public MediaObject getMediaObject();
		public void setMediaObject(MediaObject mediaObject);
		public List<MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		/**
		 * @see <a href="http://schema.org/MedicalScholarlyArticle">http://schema.org/MedicalScholarlyArticle</a>
		 */
		public MedicalScholarlyArticle getMedicalScholarlyArticle();
		public void setMedicalScholarlyArticle(MedicalScholarlyArticle medicalScholarlyArticle);
		public List<MedicalScholarlyArticle> getMedicalScholarlyArticleList();
		public void setMedicalScholarlyArticleList(List<MedicalScholarlyArticle> medicalScholarlyArticleList);
		public boolean hasMedicalScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/MedicalWebPage">http://schema.org/MedicalWebPage</a>
		 */
		public MedicalWebPage getMedicalWebPage();
		public void setMedicalWebPage(MedicalWebPage medicalWebPage);
		public List<MedicalWebPage> getMedicalWebPageList();
		public void setMedicalWebPageList(List<MedicalWebPage> medicalWebPageList);
		public boolean hasMedicalWebPage();

		/**
		 * @see <a href="http://schema.org/Menu">http://schema.org/Menu</a>
		 */
		public Menu getMenu();
		public void setMenu(Menu menu);
		public List<Menu> getMenuList();
		public void setMenuList(List<Menu> menuList);
		public boolean hasMenu();

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
		 * @see <a href="http://schema.org/MobileApplication">http://schema.org/MobileApplication</a>
		 */
		public MobileApplication getMobileApplication();
		public void setMobileApplication(MobileApplication mobileApplication);
		public List<MobileApplication> getMobileApplicationList();
		public void setMobileApplicationList(List<MobileApplication> mobileApplicationList);
		public boolean hasMobileApplication();

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
		 * @see <a href="http://schema.org/MovieSeries">http://schema.org/MovieSeries</a>
		 */
		public MovieSeries getMovieSeries();
		public void setMovieSeries(MovieSeries movieSeries);
		public List<MovieSeries> getMovieSeriesList();
		public void setMovieSeriesList(List<MovieSeries> movieSeriesList);
		public boolean hasMovieSeries();

		/**
		 * @see <a href="http://schema.org/MusicAlbum">http://schema.org/MusicAlbum</a>
		 */
		public MusicAlbum getMusicAlbum();
		public void setMusicAlbum(MusicAlbum musicAlbum);
		public List<MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		/**
		 * @see <a href="http://schema.org/MusicComposition">http://schema.org/MusicComposition</a>
		 */
		public MusicComposition getMusicComposition();
		public void setMusicComposition(MusicComposition musicComposition);
		public List<MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

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
		 * @see <a href="http://schema.org/MusicVideoObject">http://schema.org/MusicVideoObject</a>
		 */
		public MusicVideoObject getMusicVideoObject();
		public void setMusicVideoObject(MusicVideoObject musicVideoObject);
		public List<MusicVideoObject> getMusicVideoObjectList();
		public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList);
		public boolean hasMusicVideoObject();

		/**
		 * @see <a href="http://schema.org/NewsArticle">http://schema.org/NewsArticle</a>
		 */
		public NewsArticle getNewsArticle();
		public void setNewsArticle(NewsArticle newsArticle);
		public List<NewsArticle> getNewsArticleList();
		public void setNewsArticleList(List<NewsArticle> newsArticleList);
		public boolean hasNewsArticle();

		/**
		 * @see <a href="http://schema.org/Newspaper">http://schema.org/Newspaper</a>
		 */
		public Clazz.Newspaper getNewspaper();
		public void setNewspaper(Clazz.Newspaper newspaper);
		public List<Clazz.Newspaper> getNewspaperList();
		public void setNewspaperList(List<Clazz.Newspaper> newspaperList);
		public boolean hasNewspaper();

		/**
		 * @see <a href="http://schema.org/NoteDigitalDocument">http://schema.org/NoteDigitalDocument</a>
		 */
		public NoteDigitalDocument getNoteDigitalDocument();
		public void setNoteDigitalDocument(NoteDigitalDocument noteDigitalDocument);
		public List<NoteDigitalDocument> getNoteDigitalDocumentList();
		public void setNoteDigitalDocumentList(List<NoteDigitalDocument> noteDigitalDocumentList);
		public boolean hasNoteDigitalDocument();

		/**
		 * @see <a href="http://schema.org/OpinionNewsArticle">http://schema.org/OpinionNewsArticle</a>
		 */
		public OpinionNewsArticle getOpinionNewsArticle();
		public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle);
		public List<OpinionNewsArticle> getOpinionNewsArticleList();
		public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList);
		public boolean hasOpinionNewsArticle();

		/**
		 * @see <a href="http://schema.org/Painting">http://schema.org/Painting</a>
		 */
		public Painting getPainting();
		public void setPainting(Painting painting);
		public List<Painting> getPaintingList();
		public void setPaintingList(List<Painting> paintingList);
		public boolean hasPainting();

		/**
		 * @see <a href="http://schema.org/Periodical">http://schema.org/Periodical</a>
		 */
		public Periodical getPeriodical();
		public void setPeriodical(Periodical periodical);
		public List<Periodical> getPeriodicalList();
		public void setPeriodicalList(List<Periodical> periodicalList);
		public boolean hasPeriodical();

		/**
		 * @see <a href="http://schema.org/Photograph">http://schema.org/Photograph</a>
		 */
		public Photograph getPhotograph();
		public void setPhotograph(Photograph photograph);
		public List<Photograph> getPhotographList();
		public void setPhotographList(List<Photograph> photographList);
		public boolean hasPhotograph();

		/**
		 * @see <a href="http://schema.org/PresentationDigitalDocument">http://schema.org/PresentationDigitalDocument</a>
		 */
		public PresentationDigitalDocument getPresentationDigitalDocument();
		public void setPresentationDigitalDocument(PresentationDigitalDocument presentationDigitalDocument);
		public List<PresentationDigitalDocument> getPresentationDigitalDocumentList();
		public void setPresentationDigitalDocumentList(List<PresentationDigitalDocument> presentationDigitalDocumentList);
		public boolean hasPresentationDigitalDocument();

		/**
		 * @see <a href="http://schema.org/ProfilePage">http://schema.org/ProfilePage</a>
		 */
		public ProfilePage getProfilePage();
		public void setProfilePage(ProfilePage profilePage);
		public List<ProfilePage> getProfilePageList();
		public void setProfilePageList(List<ProfilePage> profilePageList);
		public boolean hasProfilePage();

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
		 * @see <a href="http://schema.org/Recipe">http://schema.org/Recipe</a>
		 */
		public Recipe getRecipe();
		public void setRecipe(Recipe recipe);
		public List<Recipe> getRecipeList();
		public void setRecipeList(List<Recipe> recipeList);
		public boolean hasRecipe();

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
		 * @see <a href="http://schema.org/Review">http://schema.org/Review</a>
		 */
		public Review getReview();
		public void setReview(Review review);
		public List<Review> getReviewList();
		public void setReviewList(List<Review> reviewList);
		public boolean hasReview();

		/**
		 * @see <a href="http://schema.org/ReviewNewsArticle">http://schema.org/ReviewNewsArticle</a>
		 */
		public ReviewNewsArticle getReviewNewsArticle();
		public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle);
		public List<ReviewNewsArticle> getReviewNewsArticleList();
		public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList);
		public boolean hasReviewNewsArticle();

		/**
		 * @see <a href="http://schema.org/SatiricalArticle">http://schema.org/SatiricalArticle</a>
		 */
		public SatiricalArticle getSatiricalArticle();
		public void setSatiricalArticle(SatiricalArticle satiricalArticle);
		public List<SatiricalArticle> getSatiricalArticleList();
		public void setSatiricalArticleList(List<SatiricalArticle> satiricalArticleList);
		public boolean hasSatiricalArticle();

		/**
		 * @see <a href="http://schema.org/ScholarlyArticle">http://schema.org/ScholarlyArticle</a>
		 */
		public ScholarlyArticle getScholarlyArticle();
		public void setScholarlyArticle(ScholarlyArticle scholarlyArticle);
		public List<ScholarlyArticle> getScholarlyArticleList();
		public void setScholarlyArticleList(List<ScholarlyArticle> scholarlyArticleList);
		public boolean hasScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/Sculpture">http://schema.org/Sculpture</a>
		 */
		public Sculpture getSculpture();
		public void setSculpture(Sculpture sculpture);
		public List<Sculpture> getSculptureList();
		public void setSculptureList(List<Sculpture> sculptureList);
		public boolean hasSculpture();

		/**
		 * @see <a href="http://schema.org/SearchResultsPage">http://schema.org/SearchResultsPage</a>
		 */
		public SearchResultsPage getSearchResultsPage();
		public void setSearchResultsPage(SearchResultsPage searchResultsPage);
		public List<SearchResultsPage> getSearchResultsPageList();
		public void setSearchResultsPageList(List<SearchResultsPage> searchResultsPageList);
		public boolean hasSearchResultsPage();

		/**
		 * @see <a href="http://schema.org/SiteNavigationElement">http://schema.org/SiteNavigationElement</a>
		 */
		public SiteNavigationElement getSiteNavigationElement();
		public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement);
		public List<SiteNavigationElement> getSiteNavigationElementList();
		public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList);
		public boolean hasSiteNavigationElement();

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
		 * @see <a href="http://schema.org/SpreadsheetDigitalDocument">http://schema.org/SpreadsheetDigitalDocument</a>
		 */
		public SpreadsheetDigitalDocument getSpreadsheetDigitalDocument();
		public void setSpreadsheetDigitalDocument(SpreadsheetDigitalDocument spreadsheetDigitalDocument);
		public List<SpreadsheetDigitalDocument> getSpreadsheetDigitalDocumentList();
		public void setSpreadsheetDigitalDocumentList(List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList);
		public boolean hasSpreadsheetDigitalDocument();

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
		 * @see <a href="http://schema.org/TechArticle">http://schema.org/TechArticle</a>
		 */
		public TechArticle getTechArticle();
		public void setTechArticle(TechArticle techArticle);
		public List<TechArticle> getTechArticleList();
		public void setTechArticleList(List<TechArticle> techArticleList);
		public boolean hasTechArticle();

		/**
		 * @see <a href="http://schema.org/TextDigitalDocument">http://schema.org/TextDigitalDocument</a>
		 */
		public TextDigitalDocument getTextDigitalDocument();
		public void setTextDigitalDocument(TextDigitalDocument textDigitalDocument);
		public List<TextDigitalDocument> getTextDigitalDocumentList();
		public void setTextDigitalDocumentList(List<TextDigitalDocument> textDigitalDocumentList);
		public boolean hasTextDigitalDocument();

		/**
		 * @see <a href="http://schema.org/Thesis">http://schema.org/Thesis</a>
		 */
		public Clazz.Thesis getThesis();
		public void setThesis(Clazz.Thesis thesis);
		public List<Clazz.Thesis> getThesisList();
		public void setThesisList(List<Clazz.Thesis> thesisList);
		public boolean hasThesis();

		/**
		 * @see <a href="http://schema.org/UserReview">http://schema.org/UserReview</a>
		 */
		public UserReview getUserReview();
		public void setUserReview(UserReview userReview);
		public List<UserReview> getUserReviewList();
		public void setUserReviewList(List<UserReview> userReviewList);
		public boolean hasUserReview();

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
		 * @see <a href="http://schema.org/VisualArtwork">http://schema.org/VisualArtwork</a>
		 */
		public VisualArtwork getVisualArtwork();
		public void setVisualArtwork(VisualArtwork visualArtwork);
		public List<VisualArtwork> getVisualArtworkList();
		public void setVisualArtworkList(List<VisualArtwork> visualArtworkList);
		public boolean hasVisualArtwork();

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

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/variantCover")
	@SchemaOrgLabel("variantCover")
	@SchemaOrgComment(""
			+ "A description of the variant cover\n    for the issue, if the issue is a variant"
			+ " printing. For example, \"Bryan Hitch\n    Variant Cover\" or \"2nd Printing"
			+ " Variant\".")
	@CamelizedName("variantCover")
	@ConstantizedName("VARIANT_COVER")
	public interface VariantCover extends SchemaOrgProperty {

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
	@SchemaOrgURI("http://schema.org/workTranslation")
	@SchemaOrgLabel("workTranslation")
	@SchemaOrgComment(""
			+ "A work that is a translation of the content of this work. e.g. 西遊記 has an"
			+ " English workTranslation “Journey to the West”,a German workTranslation “Monkeys"
			+ " Pilgerfahrt” and a Vietnamese  translation Tây du ký bình khảo.")
	@CamelizedName("workTranslation")
	@ConstantizedName("WORK_TRANSLATION")
	public interface WorkTranslation extends SchemaOrgProperty {

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
		 * @see <a href="http://schema.org/AdvertiserContentArticle">http://schema.org/AdvertiserContentArticle</a>
		 */
		public AdvertiserContentArticle getAdvertiserContentArticle();
		public void setAdvertiserContentArticle(AdvertiserContentArticle advertiserContentArticle);
		public List<AdvertiserContentArticle> getAdvertiserContentArticleList();
		public void setAdvertiserContentArticleList(List<AdvertiserContentArticle> advertiserContentArticleList);
		public boolean hasAdvertiserContentArticle();

		/**
		 * @see <a href="http://schema.org/AnalysisNewsArticle">http://schema.org/AnalysisNewsArticle</a>
		 */
		public AnalysisNewsArticle getAnalysisNewsArticle();
		public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle);
		public List<AnalysisNewsArticle> getAnalysisNewsArticleList();
		public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList);
		public boolean hasAnalysisNewsArticle();

		/**
		 * @see <a href="http://schema.org/Answer">http://schema.org/Answer</a>
		 */
		public Answer getAnswer();
		public void setAnswer(Answer answer);
		public List<Answer> getAnswerList();
		public void setAnswerList(List<Answer> answerList);
		public boolean hasAnswer();

		/**
		 * @see <a href="http://schema.org/Article">http://schema.org/Article</a>
		 */
		public Article getArticle();
		public void setArticle(Article article);
		public List<Article> getArticleList();
		public void setArticleList(List<Article> articleList);
		public boolean hasArticle();

		/**
		 * @see <a href="http://schema.org/AskPublicNewsArticle">http://schema.org/AskPublicNewsArticle</a>
		 */
		public AskPublicNewsArticle getAskPublicNewsArticle();
		public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle);
		public List<AskPublicNewsArticle> getAskPublicNewsArticleList();
		public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList);
		public boolean hasAskPublicNewsArticle();

		/**
		 * @see <a href="http://schema.org/Atlas">http://schema.org/Atlas</a>
		 */
		public Clazz.Atlas getAtlas();
		public void setAtlas(Clazz.Atlas atlas);
		public List<Clazz.Atlas> getAtlasList();
		public void setAtlasList(List<Clazz.Atlas> atlasList);
		public boolean hasAtlas();

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
		public Clazz.Audiobook getAudiobook();
		public void setAudiobook(Clazz.Audiobook audiobook);
		public List<Clazz.Audiobook> getAudiobookList();
		public void setAudiobookList(List<Clazz.Audiobook> audiobookList);
		public boolean hasAudiobook();

		/**
		 * @see <a href="http://schema.org/BackgroundNewsArticle">http://schema.org/BackgroundNewsArticle</a>
		 */
		public BackgroundNewsArticle getBackgroundNewsArticle();
		public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle);
		public List<BackgroundNewsArticle> getBackgroundNewsArticleList();
		public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList);
		public boolean hasBackgroundNewsArticle();

		/**
		 * @see <a href="http://schema.org/Barcode">http://schema.org/Barcode</a>
		 */
		public Barcode getBarcode();
		public void setBarcode(Barcode barcode);
		public List<Barcode> getBarcodeList();
		public void setBarcodeList(List<Barcode> barcodeList);
		public boolean hasBarcode();

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
		 * @see <a href="http://schema.org/Book">http://schema.org/Book</a>
		 */
		public Book getBook();
		public void setBook(Book book);
		public List<Book> getBookList();
		public void setBookList(List<Book> bookList);
		public boolean hasBook();

		/**
		 * @see <a href="http://schema.org/BookSeries">http://schema.org/BookSeries</a>
		 */
		public BookSeries getBookSeries();
		public void setBookSeries(BookSeries bookSeries);
		public List<BookSeries> getBookSeriesList();
		public void setBookSeriesList(List<BookSeries> bookSeriesList);
		public boolean hasBookSeries();

		/**
		 * @see <a href="http://schema.org/CategoryCodeSet">http://schema.org/CategoryCodeSet</a>
		 */
		public CategoryCodeSet getCategoryCodeSet();
		public void setCategoryCodeSet(CategoryCodeSet categoryCodeSet);
		public List<CategoryCodeSet> getCategoryCodeSetList();
		public void setCategoryCodeSetList(List<CategoryCodeSet> categoryCodeSetList);
		public boolean hasCategoryCodeSet();

		/**
		 * @see <a href="http://schema.org/Chapter">http://schema.org/Chapter</a>
		 */
		public Clazz.Chapter getChapter();
		public void setChapter(Clazz.Chapter chapter);
		public List<Clazz.Chapter> getChapterList();
		public void setChapterList(List<Clazz.Chapter> chapterList);
		public boolean hasChapter();

		/**
		 * @see <a href="http://schema.org/CheckoutPage">http://schema.org/CheckoutPage</a>
		 */
		public CheckoutPage getCheckoutPage();
		public void setCheckoutPage(CheckoutPage checkoutPage);
		public List<CheckoutPage> getCheckoutPageList();
		public void setCheckoutPageList(List<CheckoutPage> checkoutPageList);
		public boolean hasCheckoutPage();

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
		 * @see <a href="http://schema.org/Clip">http://schema.org/Clip</a>
		 */
		public Clip getClip();
		public void setClip(Clip clip);
		public List<Clip> getClipList();
		public void setClipList(List<Clip> clipList);
		public boolean hasClip();

		/**
		 * @see <a href="http://schema.org/Collection">http://schema.org/Collection</a>
		 */
		public Clazz.Collection getCollection();
		public void setCollection(Clazz.Collection collection);
		public List<Clazz.Collection> getCollectionList();
		public void setCollectionList(List<Clazz.Collection> collectionList);
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
		 * @see <a href="http://schema.org/ComicCoverArt">http://schema.org/ComicCoverArt</a>
		 */
		public Clazz.ComicCoverArt getComicCoverArt();
		public void setComicCoverArt(Clazz.ComicCoverArt comicCoverArt);
		public List<Clazz.ComicCoverArt> getComicCoverArtList();
		public void setComicCoverArtList(List<Clazz.ComicCoverArt> comicCoverArtList);
		public boolean hasComicCoverArt();

		/**
		 * @see <a href="http://schema.org/ComicIssue">http://schema.org/ComicIssue</a>
		 */
		public Clazz.ComicIssue getComicIssue();
		public void setComicIssue(Clazz.ComicIssue comicIssue);
		public List<Clazz.ComicIssue> getComicIssueList();
		public void setComicIssueList(List<Clazz.ComicIssue> comicIssueList);
		public boolean hasComicIssue();

		/**
		 * @see <a href="http://schema.org/ComicSeries">http://schema.org/ComicSeries</a>
		 */
		public Clazz.ComicSeries getComicSeries();
		public void setComicSeries(Clazz.ComicSeries comicSeries);
		public List<Clazz.ComicSeries> getComicSeriesList();
		public void setComicSeriesList(List<Clazz.ComicSeries> comicSeriesList);
		public boolean hasComicSeries();

		/**
		 * @see <a href="http://schema.org/ComicStory">http://schema.org/ComicStory</a>
		 */
		public Clazz.ComicStory getComicStory();
		public void setComicStory(Clazz.ComicStory comicStory);
		public List<Clazz.ComicStory> getComicStoryList();
		public void setComicStoryList(List<Clazz.ComicStory> comicStoryList);
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
		 * @see <a href="http://schema.org/CompleteDataFeed">http://schema.org/CompleteDataFeed</a>
		 */
		public CompleteDataFeed getCompleteDataFeed();
		public void setCompleteDataFeed(CompleteDataFeed completeDataFeed);
		public List<CompleteDataFeed> getCompleteDataFeedList();
		public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList);
		public boolean hasCompleteDataFeed();

		/**
		 * @see <a href="http://schema.org/ContactPage">http://schema.org/ContactPage</a>
		 */
		public ContactPage getContactPage();
		public void setContactPage(ContactPage contactPage);
		public List<ContactPage> getContactPageList();
		public void setContactPageList(List<ContactPage> contactPageList);
		public boolean hasContactPage();

		/**
		 * @see <a href="http://schema.org/Conversation">http://schema.org/Conversation</a>
		 */
		public Conversation getConversation();
		public void setConversation(Conversation conversation);
		public List<Conversation> getConversationList();
		public void setConversationList(List<Conversation> conversationList);
		public boolean hasConversation();

		/**
		 * @see <a href="http://schema.org/CorrectionComment">http://schema.org/CorrectionComment</a>
		 */
		public CorrectionComment getCorrectionComment();
		public void setCorrectionComment(CorrectionComment correctionComment);
		public List<CorrectionComment> getCorrectionCommentList();
		public void setCorrectionCommentList(List<CorrectionComment> correctionCommentList);
		public boolean hasCorrectionComment();

		/**
		 * @see <a href="http://schema.org/Course">http://schema.org/Course</a>
		 */
		public Course getCourse();
		public void setCourse(Course course);
		public List<Course> getCourseList();
		public void setCourseList(List<Course> courseList);
		public boolean hasCourse();

		/**
		 * @see <a href="http://schema.org/CoverArt">http://schema.org/CoverArt</a>
		 */
		public Clazz.CoverArt getCoverArt();
		public void setCoverArt(Clazz.CoverArt coverArt);
		public List<Clazz.CoverArt> getCoverArtList();
		public void setCoverArtList(List<Clazz.CoverArt> coverArtList);
		public boolean hasCoverArt();

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
		 * @see <a href="http://schema.org/CriticReview">http://schema.org/CriticReview</a>
		 */
		public CriticReview getCriticReview();
		public void setCriticReview(CriticReview criticReview);
		public List<CriticReview> getCriticReviewList();
		public void setCriticReviewList(List<CriticReview> criticReviewList);
		public boolean hasCriticReview();

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
		 * @see <a href="http://schema.org/Dataset">http://schema.org/Dataset</a>
		 */
		public Dataset getDataset();
		public void setDataset(Dataset dataset);
		public List<Dataset> getDatasetList();
		public void setDatasetList(List<Dataset> datasetList);
		public boolean hasDataset();

		/**
		 * @see <a href="http://schema.org/DefinedTermSet">http://schema.org/DefinedTermSet</a>
		 */
		public DefinedTermSet getDefinedTermSet();
		public void setDefinedTermSet(DefinedTermSet definedTermSet);
		public List<DefinedTermSet> getDefinedTermSetList();
		public void setDefinedTermSetList(List<DefinedTermSet> definedTermSetList);
		public boolean hasDefinedTermSet();

		/**
		 * @see <a href="http://schema.org/Diet">http://schema.org/Diet</a>
		 */
		public Diet getDiet();
		public void setDiet(Diet diet);
		public List<Diet> getDietList();
		public void setDietList(List<Diet> dietList);
		public boolean hasDiet();

		/**
		 * @see <a href="http://schema.org/DigitalDocument">http://schema.org/DigitalDocument</a>
		 */
		public DigitalDocument getDigitalDocument();
		public void setDigitalDocument(DigitalDocument digitalDocument);
		public List<DigitalDocument> getDigitalDocumentList();
		public void setDigitalDocumentList(List<DigitalDocument> digitalDocumentList);
		public boolean hasDigitalDocument();

		/**
		 * @see <a href="http://schema.org/DiscussionForumPosting">http://schema.org/DiscussionForumPosting</a>
		 */
		public DiscussionForumPosting getDiscussionForumPosting();
		public void setDiscussionForumPosting(DiscussionForumPosting discussionForumPosting);
		public List<DiscussionForumPosting> getDiscussionForumPostingList();
		public void setDiscussionForumPostingList(List<DiscussionForumPosting> discussionForumPostingList);
		public boolean hasDiscussionForumPosting();

		/**
		 * @see <a href="http://schema.org/EmailMessage">http://schema.org/EmailMessage</a>
		 */
		public EmailMessage getEmailMessage();
		public void setEmailMessage(EmailMessage emailMessage);
		public List<EmailMessage> getEmailMessageList();
		public void setEmailMessageList(List<EmailMessage> emailMessageList);
		public boolean hasEmailMessage();

		/**
		 * @see <a href="http://schema.org/EmployerReview">http://schema.org/EmployerReview</a>
		 */
		public EmployerReview getEmployerReview();
		public void setEmployerReview(EmployerReview employerReview);
		public List<EmployerReview> getEmployerReviewList();
		public void setEmployerReviewList(List<EmployerReview> employerReviewList);
		public boolean hasEmployerReview();

		/**
		 * @see <a href="http://schema.org/Episode">http://schema.org/Episode</a>
		 */
		public Episode getEpisode();
		public void setEpisode(Episode episode);
		public List<Episode> getEpisodeList();
		public void setEpisodeList(List<Episode> episodeList);
		public boolean hasEpisode();

		/**
		 * @see <a href="http://schema.org/ExercisePlan">http://schema.org/ExercisePlan</a>
		 */
		public ExercisePlan getExercisePlan();
		public void setExercisePlan(ExercisePlan exercisePlan);
		public List<ExercisePlan> getExercisePlanList();
		public void setExercisePlanList(List<ExercisePlan> exercisePlanList);
		public boolean hasExercisePlan();

		/**
		 * @see <a href="http://schema.org/FAQPage">http://schema.org/FAQPage</a>
		 */
		public FAQPage getFAQPage();
		public void setFAQPage(FAQPage faqPage);
		public List<FAQPage> getFAQPageList();
		public void setFAQPageList(List<FAQPage> faqPageList);
		public boolean hasFAQPage();

		/**
		 * @see <a href="http://schema.org/Game">http://schema.org/Game</a>
		 */
		public Game getGame();
		public void setGame(Game game);
		public List<Game> getGameList();
		public void setGameList(List<Game> gameList);
		public boolean hasGame();

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
		 * @see <a href="http://schema.org/HowToTip">http://schema.org/HowToTip</a>
		 */
		public HowToTip getHowToTip();
		public void setHowToTip(HowToTip howToTip);
		public List<HowToTip> getHowToTipList();
		public void setHowToTipList(List<HowToTip> howToTipList);
		public boolean hasHowToTip();

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
		 * @see <a href="http://schema.org/ItemPage">http://schema.org/ItemPage</a>
		 */
		public ItemPage getItemPage();
		public void setItemPage(ItemPage itemPage);
		public List<ItemPage> getItemPageList();
		public void setItemPageList(List<ItemPage> itemPageList);
		public boolean hasItemPage();

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
		 * @see <a href="http://schema.org/LiveBlogPosting">http://schema.org/LiveBlogPosting</a>
		 */
		public LiveBlogPosting getLiveBlogPosting();
		public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting);
		public List<LiveBlogPosting> getLiveBlogPostingList();
		public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList);
		public boolean hasLiveBlogPosting();

		/**
		 * @see <a href="http://schema.org/Map">http://schema.org/Map</a>
		 */
		public Map getMap();
		public void setMap(Map map);
		public List<Map> getMapList();
		public void setMapList(List<Map> mapList);
		public boolean hasMap();

		/**
		 * @see <a href="http://schema.org/MediaObject">http://schema.org/MediaObject</a>
		 */
		public MediaObject getMediaObject();
		public void setMediaObject(MediaObject mediaObject);
		public List<MediaObject> getMediaObjectList();
		public void setMediaObjectList(List<MediaObject> mediaObjectList);
		public boolean hasMediaObject();

		/**
		 * @see <a href="http://schema.org/MedicalScholarlyArticle">http://schema.org/MedicalScholarlyArticle</a>
		 */
		public MedicalScholarlyArticle getMedicalScholarlyArticle();
		public void setMedicalScholarlyArticle(MedicalScholarlyArticle medicalScholarlyArticle);
		public List<MedicalScholarlyArticle> getMedicalScholarlyArticleList();
		public void setMedicalScholarlyArticleList(List<MedicalScholarlyArticle> medicalScholarlyArticleList);
		public boolean hasMedicalScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/MedicalWebPage">http://schema.org/MedicalWebPage</a>
		 */
		public MedicalWebPage getMedicalWebPage();
		public void setMedicalWebPage(MedicalWebPage medicalWebPage);
		public List<MedicalWebPage> getMedicalWebPageList();
		public void setMedicalWebPageList(List<MedicalWebPage> medicalWebPageList);
		public boolean hasMedicalWebPage();

		/**
		 * @see <a href="http://schema.org/Menu">http://schema.org/Menu</a>
		 */
		public Menu getMenu();
		public void setMenu(Menu menu);
		public List<Menu> getMenuList();
		public void setMenuList(List<Menu> menuList);
		public boolean hasMenu();

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
		 * @see <a href="http://schema.org/MobileApplication">http://schema.org/MobileApplication</a>
		 */
		public MobileApplication getMobileApplication();
		public void setMobileApplication(MobileApplication mobileApplication);
		public List<MobileApplication> getMobileApplicationList();
		public void setMobileApplicationList(List<MobileApplication> mobileApplicationList);
		public boolean hasMobileApplication();

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
		 * @see <a href="http://schema.org/MovieSeries">http://schema.org/MovieSeries</a>
		 */
		public MovieSeries getMovieSeries();
		public void setMovieSeries(MovieSeries movieSeries);
		public List<MovieSeries> getMovieSeriesList();
		public void setMovieSeriesList(List<MovieSeries> movieSeriesList);
		public boolean hasMovieSeries();

		/**
		 * @see <a href="http://schema.org/MusicAlbum">http://schema.org/MusicAlbum</a>
		 */
		public MusicAlbum getMusicAlbum();
		public void setMusicAlbum(MusicAlbum musicAlbum);
		public List<MusicAlbum> getMusicAlbumList();
		public void setMusicAlbumList(List<MusicAlbum> musicAlbumList);
		public boolean hasMusicAlbum();

		/**
		 * @see <a href="http://schema.org/MusicComposition">http://schema.org/MusicComposition</a>
		 */
		public MusicComposition getMusicComposition();
		public void setMusicComposition(MusicComposition musicComposition);
		public List<MusicComposition> getMusicCompositionList();
		public void setMusicCompositionList(List<MusicComposition> musicCompositionList);
		public boolean hasMusicComposition();

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
		 * @see <a href="http://schema.org/MusicVideoObject">http://schema.org/MusicVideoObject</a>
		 */
		public MusicVideoObject getMusicVideoObject();
		public void setMusicVideoObject(MusicVideoObject musicVideoObject);
		public List<MusicVideoObject> getMusicVideoObjectList();
		public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList);
		public boolean hasMusicVideoObject();

		/**
		 * @see <a href="http://schema.org/NewsArticle">http://schema.org/NewsArticle</a>
		 */
		public NewsArticle getNewsArticle();
		public void setNewsArticle(NewsArticle newsArticle);
		public List<NewsArticle> getNewsArticleList();
		public void setNewsArticleList(List<NewsArticle> newsArticleList);
		public boolean hasNewsArticle();

		/**
		 * @see <a href="http://schema.org/Newspaper">http://schema.org/Newspaper</a>
		 */
		public Clazz.Newspaper getNewspaper();
		public void setNewspaper(Clazz.Newspaper newspaper);
		public List<Clazz.Newspaper> getNewspaperList();
		public void setNewspaperList(List<Clazz.Newspaper> newspaperList);
		public boolean hasNewspaper();

		/**
		 * @see <a href="http://schema.org/NoteDigitalDocument">http://schema.org/NoteDigitalDocument</a>
		 */
		public NoteDigitalDocument getNoteDigitalDocument();
		public void setNoteDigitalDocument(NoteDigitalDocument noteDigitalDocument);
		public List<NoteDigitalDocument> getNoteDigitalDocumentList();
		public void setNoteDigitalDocumentList(List<NoteDigitalDocument> noteDigitalDocumentList);
		public boolean hasNoteDigitalDocument();

		/**
		 * @see <a href="http://schema.org/OpinionNewsArticle">http://schema.org/OpinionNewsArticle</a>
		 */
		public OpinionNewsArticle getOpinionNewsArticle();
		public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle);
		public List<OpinionNewsArticle> getOpinionNewsArticleList();
		public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList);
		public boolean hasOpinionNewsArticle();

		/**
		 * @see <a href="http://schema.org/Painting">http://schema.org/Painting</a>
		 */
		public Painting getPainting();
		public void setPainting(Painting painting);
		public List<Painting> getPaintingList();
		public void setPaintingList(List<Painting> paintingList);
		public boolean hasPainting();

		/**
		 * @see <a href="http://schema.org/Periodical">http://schema.org/Periodical</a>
		 */
		public Periodical getPeriodical();
		public void setPeriodical(Periodical periodical);
		public List<Periodical> getPeriodicalList();
		public void setPeriodicalList(List<Periodical> periodicalList);
		public boolean hasPeriodical();

		/**
		 * @see <a href="http://schema.org/Photograph">http://schema.org/Photograph</a>
		 */
		public Photograph getPhotograph();
		public void setPhotograph(Photograph photograph);
		public List<Photograph> getPhotographList();
		public void setPhotographList(List<Photograph> photographList);
		public boolean hasPhotograph();

		/**
		 * @see <a href="http://schema.org/PresentationDigitalDocument">http://schema.org/PresentationDigitalDocument</a>
		 */
		public PresentationDigitalDocument getPresentationDigitalDocument();
		public void setPresentationDigitalDocument(PresentationDigitalDocument presentationDigitalDocument);
		public List<PresentationDigitalDocument> getPresentationDigitalDocumentList();
		public void setPresentationDigitalDocumentList(List<PresentationDigitalDocument> presentationDigitalDocumentList);
		public boolean hasPresentationDigitalDocument();

		/**
		 * @see <a href="http://schema.org/ProfilePage">http://schema.org/ProfilePage</a>
		 */
		public ProfilePage getProfilePage();
		public void setProfilePage(ProfilePage profilePage);
		public List<ProfilePage> getProfilePageList();
		public void setProfilePageList(List<ProfilePage> profilePageList);
		public boolean hasProfilePage();

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
		 * @see <a href="http://schema.org/Recipe">http://schema.org/Recipe</a>
		 */
		public Recipe getRecipe();
		public void setRecipe(Recipe recipe);
		public List<Recipe> getRecipeList();
		public void setRecipeList(List<Recipe> recipeList);
		public boolean hasRecipe();

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
		 * @see <a href="http://schema.org/Review">http://schema.org/Review</a>
		 */
		public Review getReview();
		public void setReview(Review review);
		public List<Review> getReviewList();
		public void setReviewList(List<Review> reviewList);
		public boolean hasReview();

		/**
		 * @see <a href="http://schema.org/ReviewNewsArticle">http://schema.org/ReviewNewsArticle</a>
		 */
		public ReviewNewsArticle getReviewNewsArticle();
		public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle);
		public List<ReviewNewsArticle> getReviewNewsArticleList();
		public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList);
		public boolean hasReviewNewsArticle();

		/**
		 * @see <a href="http://schema.org/SatiricalArticle">http://schema.org/SatiricalArticle</a>
		 */
		public SatiricalArticle getSatiricalArticle();
		public void setSatiricalArticle(SatiricalArticle satiricalArticle);
		public List<SatiricalArticle> getSatiricalArticleList();
		public void setSatiricalArticleList(List<SatiricalArticle> satiricalArticleList);
		public boolean hasSatiricalArticle();

		/**
		 * @see <a href="http://schema.org/ScholarlyArticle">http://schema.org/ScholarlyArticle</a>
		 */
		public ScholarlyArticle getScholarlyArticle();
		public void setScholarlyArticle(ScholarlyArticle scholarlyArticle);
		public List<ScholarlyArticle> getScholarlyArticleList();
		public void setScholarlyArticleList(List<ScholarlyArticle> scholarlyArticleList);
		public boolean hasScholarlyArticle();

		/**
		 * @see <a href="http://schema.org/Sculpture">http://schema.org/Sculpture</a>
		 */
		public Sculpture getSculpture();
		public void setSculpture(Sculpture sculpture);
		public List<Sculpture> getSculptureList();
		public void setSculptureList(List<Sculpture> sculptureList);
		public boolean hasSculpture();

		/**
		 * @see <a href="http://schema.org/SearchResultsPage">http://schema.org/SearchResultsPage</a>
		 */
		public SearchResultsPage getSearchResultsPage();
		public void setSearchResultsPage(SearchResultsPage searchResultsPage);
		public List<SearchResultsPage> getSearchResultsPageList();
		public void setSearchResultsPageList(List<SearchResultsPage> searchResultsPageList);
		public boolean hasSearchResultsPage();

		/**
		 * @see <a href="http://schema.org/SiteNavigationElement">http://schema.org/SiteNavigationElement</a>
		 */
		public SiteNavigationElement getSiteNavigationElement();
		public void setSiteNavigationElement(SiteNavigationElement siteNavigationElement);
		public List<SiteNavigationElement> getSiteNavigationElementList();
		public void setSiteNavigationElementList(List<SiteNavigationElement> siteNavigationElementList);
		public boolean hasSiteNavigationElement();

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
		 * @see <a href="http://schema.org/SpreadsheetDigitalDocument">http://schema.org/SpreadsheetDigitalDocument</a>
		 */
		public SpreadsheetDigitalDocument getSpreadsheetDigitalDocument();
		public void setSpreadsheetDigitalDocument(SpreadsheetDigitalDocument spreadsheetDigitalDocument);
		public List<SpreadsheetDigitalDocument> getSpreadsheetDigitalDocumentList();
		public void setSpreadsheetDigitalDocumentList(List<SpreadsheetDigitalDocument> spreadsheetDigitalDocumentList);
		public boolean hasSpreadsheetDigitalDocument();

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
		 * @see <a href="http://schema.org/TechArticle">http://schema.org/TechArticle</a>
		 */
		public TechArticle getTechArticle();
		public void setTechArticle(TechArticle techArticle);
		public List<TechArticle> getTechArticleList();
		public void setTechArticleList(List<TechArticle> techArticleList);
		public boolean hasTechArticle();

		/**
		 * @see <a href="http://schema.org/TextDigitalDocument">http://schema.org/TextDigitalDocument</a>
		 */
		public TextDigitalDocument getTextDigitalDocument();
		public void setTextDigitalDocument(TextDigitalDocument textDigitalDocument);
		public List<TextDigitalDocument> getTextDigitalDocumentList();
		public void setTextDigitalDocumentList(List<TextDigitalDocument> textDigitalDocumentList);
		public boolean hasTextDigitalDocument();

		/**
		 * @see <a href="http://schema.org/Thesis">http://schema.org/Thesis</a>
		 */
		public Clazz.Thesis getThesis();
		public void setThesis(Clazz.Thesis thesis);
		public List<Clazz.Thesis> getThesisList();
		public void setThesisList(List<Clazz.Thesis> thesisList);
		public boolean hasThesis();

		/**
		 * @see <a href="http://schema.org/UserReview">http://schema.org/UserReview</a>
		 */
		public UserReview getUserReview();
		public void setUserReview(UserReview userReview);
		public List<UserReview> getUserReviewList();
		public void setUserReviewList(List<UserReview> userReviewList);
		public boolean hasUserReview();

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
		 * @see <a href="http://schema.org/VisualArtwork">http://schema.org/VisualArtwork</a>
		 */
		public VisualArtwork getVisualArtwork();
		public void setVisualArtwork(VisualArtwork visualArtwork);
		public List<VisualArtwork> getVisualArtworkList();
		public void setVisualArtworkList(List<VisualArtwork> visualArtworkList);
		public boolean hasVisualArtwork();

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

		public String getNativeValue();

	}

}
