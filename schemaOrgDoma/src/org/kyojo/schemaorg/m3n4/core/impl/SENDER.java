package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.AccountingService;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdultEntertainment;
import org.kyojo.schemaorg.m3n4.core.Clazz.Airline;
import org.kyojo.schemaorg.m3n4.core.Clazz.AmusementPark;
import org.kyojo.schemaorg.m3n4.core.Clazz.AnimalShelter;
import org.kyojo.schemaorg.m3n4.core.Clazz.ArtGallery;
import org.kyojo.schemaorg.m3n4.core.Clazz.Attorney;
import org.kyojo.schemaorg.m3n4.core.Clazz.Audience;
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
import org.kyojo.schemaorg.m3n4.core.Clazz.BeautySalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.BedAndBreakfast;
import org.kyojo.schemaorg.m3n4.core.Clazz.BikeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.BowlingAlley;
import org.kyojo.schemaorg.m3n4.core.Clazz.Brewery;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.CafeOrCoffeeShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.Campground;
import org.kyojo.schemaorg.m3n4.core.Clazz.Casino;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildCare;
import org.kyojo.schemaorg.m3n4.core.Clazz.ClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.CollegeOrUniversity;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComputerStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConvenienceStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Corporation;
import org.kyojo.schemaorg.m3n4.core.Clazz.DanceGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.DaySpa;
import org.kyojo.schemaorg.m3n4.core.Clazz.Dentist;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.DryCleaningOrLaundry;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Electrician;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElectronicsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ElementarySchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmergencyService;
import org.kyojo.schemaorg.m3n4.core.Clazz.EmploymentAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.EntertainmentBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseGym;
import org.kyojo.schemaorg.m3n4.core.Clazz.FastFoodRestaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.FinancialService;
import org.kyojo.schemaorg.m3n4.core.Clazz.FireStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Florist;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishment;
import org.kyojo.schemaorg.m3n4.core.Clazz.FurnitureStore;
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
import org.kyojo.schemaorg.m3n4.core.Clazz.IceCreamShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsuranceAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.InternetCafe;
import org.kyojo.schemaorg.m3n4.core.Clazz.JewelryStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.Library;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiquorStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocalBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.Locksmith;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingBusiness;
import org.kyojo.schemaorg.m3n4.core.Clazz.MedicalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.MensClothingStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MiddleSchool;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobilePhoneStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Motel;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleDealer;
import org.kyojo.schemaorg.m3n4.core.Clazz.MotorcycleRepair;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieRentalStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovieTheater;
import org.kyojo.schemaorg.m3n4.core.Clazz.MovingCompany;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.NGO;
import org.kyojo.schemaorg.m3n4.core.Clazz.NailSalon;
import org.kyojo.schemaorg.m3n4.core.Clazz.NightClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.Notary;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfficeEquipmentStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Clazz.OutletStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParentAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.PawnShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.PeopleAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformingGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.PetStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Pharmacy;
import org.kyojo.schemaorg.m3n4.core.Clazz.Physician;
import org.kyojo.schemaorg.m3n4.core.Clazz.Plumber;
import org.kyojo.schemaorg.m3n4.core.Clazz.PoliceStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.PostOffice;
import org.kyojo.schemaorg.m3n4.core.Clazz.Preschool;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfessionalService;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicSwimmingPool;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.RealEstateAgent;
import org.kyojo.schemaorg.m3n4.core.Clazz.RecyclingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.Resort;
import org.kyojo.schemaorg.m3n4.core.Clazz.Restaurant;
import org.kyojo.schemaorg.m3n4.core.Clazz.RoofingContractor;
import org.kyojo.schemaorg.m3n4.core.Clazz.School;
import org.kyojo.schemaorg.m3n4.core.Clazz.SelfStorage;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoeStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoppingCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.SkiResort;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportingGoodsStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsActivityLocation;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsClub;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsTeam;
import org.kyojo.schemaorg.m3n4.core.Clazz.StadiumOrArena;
import org.kyojo.schemaorg.m3n4.core.Clazz.Store;
import org.kyojo.schemaorg.m3n4.core.Clazz.TattooParlor;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionStation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TennisComplex;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.TireShop;
import org.kyojo.schemaorg.m3n4.core.Clazz.TouristInformationCenter;
import org.kyojo.schemaorg.m3n4.core.Clazz.ToyStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.TravelAgency;
import org.kyojo.schemaorg.m3n4.core.Clazz.WholesaleStore;
import org.kyojo.schemaorg.m3n4.core.Clazz.Winery;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticLab;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalBusiness;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalClinic;
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
import org.kyojo.schemaorg.m3n4.pending.Clazz.Consortium;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Distillery;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LibrarySystem;
import org.kyojo.schemaorg.m3n4.pending.Clazz.NewsMediaOrganization;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WorkersUnion;

import org.seasar.doma.Transient;

public class SENDER implements Container.Sender {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AccountingService> accountingServiceList;
	@Transient
	public List<AdultEntertainment> adultEntertainmentList;
	@Transient
	public List<Airline> airlineList;
	@Transient
	public List<AmusementPark> amusementParkList;
	@Transient
	public List<AnimalShelter> animalShelterList;
	@Transient
	public List<ArtGallery> artGalleryList;
	@Transient
	public List<Attorney> attorneyList;
	@Transient
	public List<Audience> audienceList;
	@Transient
	public List<AutoBodyShop> autoBodyShopList;
	@Transient
	public List<AutoDealer> autoDealerList;
	@Transient
	public List<AutoPartsStore> autoPartsStoreList;
	@Transient
	public List<AutoRental> autoRentalList;
	@Transient
	public List<AutoRepair> autoRepairList;
	@Transient
	public List<AutoWash> autoWashList;
	@Transient
	public List<AutomatedTeller> automatedTellerList;
	@Transient
	public List<AutomotiveBusiness> automotiveBusinessList;
	@Transient
	public List<Bakery> bakeryList;
	@Transient
	public List<BankOrCreditUnion> bankOrCreditUnionList;
	@Transient
	public List<BarOrPub> barOrPubList;
	@Transient
	public List<BeautySalon> beautySalonList;
	@Transient
	public List<BedAndBreakfast> bedAndBreakfastList;
	@Transient
	public List<BikeStore> bikeStoreList;
	@Transient
	public List<BookStore> bookStoreList;
	@Transient
	public List<BowlingAlley> bowlingAlleyList;
	@Transient
	public List<Brewery> breweryList;
	@Transient
	public List<BusinessAudience> businessAudienceList;
	@Transient
	public List<CafeOrCoffeeShop> cafeOrCoffeeShopList;
	@Transient
	public List<Campground> campgroundList;
	@Transient
	public List<Casino> casinoList;
	@Transient
	public List<ChildCare> childCareList;
	@Transient
	public List<ClothingStore> clothingStoreList;
	@Transient
	public List<CollegeOrUniversity> collegeOrUniversityList;
	@Transient
	public List<ComedyClub> comedyClubList;
	@Transient
	public List<CommunityHealth> communityHealthList;
	@Transient
	public List<ComputerStore> computerStoreList;
	@Transient
	public List<Consortium> consortiumList;
	@Transient
	public List<ConvenienceStore> convenienceStoreList;
	@Transient
	public List<Corporation> corporationList;
	@Transient
	public List<DanceGroup> danceGroupList;
	@Transient
	public List<DaySpa> daySpaList;
	@Transient
	public List<Dentist> dentistList;
	@Transient
	public List<DepartmentStore> departmentStoreList;
	@Transient
	public List<Dermatology> dermatologyList;
	@Transient
	public List<DiagnosticLab> diagnosticLabList;
	@Transient
	public List<DietNutrition> dietNutritionList;
	@Transient
	public List<Distillery> distilleryList;
	@Transient
	public List<DryCleaningOrLaundry> dryCleaningOrLaundryList;
	@Transient
	public List<EducationalAudience> educationalAudienceList;
	@Transient
	public List<EducationalOrganization> educationalOrganizationList;
	@Transient
	public List<Electrician> electricianList;
	@Transient
	public List<ElectronicsStore> electronicsStoreList;
	@Transient
	public List<ElementarySchool> elementarySchoolList;
	@Transient
	public List<Emergency> emergencyList;
	@Transient
	public List<EmergencyService> emergencyServiceList;
	@Transient
	public List<EmploymentAgency> employmentAgencyList;
	@Transient
	public List<EntertainmentBusiness> entertainmentBusinessList;
	@Transient
	public List<ExerciseGym> exerciseGymList;
	@Transient
	public List<FastFoodRestaurant> fastFoodRestaurantList;
	@Transient
	public List<FinancialService> financialServiceList;
	@Transient
	public List<FireStation> fireStationList;
	@Transient
	public List<Florist> floristList;
	@Transient
	public List<FoodEstablishment> foodEstablishmentList;
	@Transient
	public List<FurnitureStore> furnitureStoreList;
	@Transient
	public List<GardenStore> gardenStoreList;
	@Transient
	public List<GasStation> gasStationList;
	@Transient
	public List<GeneralContractor> generalContractorList;
	@Transient
	public List<Geriatric> geriatricList;
	@Transient
	public List<GolfCourse> golfCourseList;
	@Transient
	public List<GovernmentOffice> governmentOfficeList;
	@Transient
	public List<GovernmentOrganization> governmentOrganizationList;
	@Transient
	public List<GroceryStore> groceryStoreList;
	@Transient
	public List<Gynecologic> gynecologicList;
	@Transient
	public List<HVACBusiness> hvacBusinessList;
	@Transient
	public List<HairSalon> hairSalonList;
	@Transient
	public List<HardwareStore> hardwareStoreList;
	@Transient
	public List<HealthAndBeautyBusiness> healthAndBeautyBusinessList;
	@Transient
	public List<HealthClub> healthClubList;
	@Transient
	public List<HighSchool> highSchoolList;
	@Transient
	public List<HobbyShop> hobbyShopList;
	@Transient
	public List<HomeAndConstructionBusiness> homeAndConstructionBusinessList;
	@Transient
	public List<HomeGoodsStore> homeGoodsStoreList;
	@Transient
	public List<Hospital> hospitalList;
	@Transient
	public List<Hostel> hostelList;
	@Transient
	public List<Hotel> hotelList;
	@Transient
	public List<HousePainter> housePainterList;
	@Transient
	public List<IceCreamShop> iceCreamShopList;
	@Transient
	public List<InsuranceAgency> insuranceAgencyList;
	@Transient
	public List<InternetCafe> internetCafeList;
	@Transient
	public List<JewelryStore> jewelryStoreList;
	@Transient
	public List<LegalService> legalServiceList;
	@Transient
	public List<Library> libraryList;
	@Transient
	public List<LibrarySystem> librarySystemList;
	@Transient
	public List<LiquorStore> liquorStoreList;
	@Transient
	public List<LocalBusiness> localBusinessList;
	@Transient
	public List<Locksmith> locksmithList;
	@Transient
	public List<LodgingBusiness> lodgingBusinessList;
	@Transient
	public List<MedicalAudience> medicalAudienceList;
	@Transient
	public List<MedicalBusiness> medicalBusinessList;
	@Transient
	public List<MedicalClinic> medicalClinicList;
	@Transient
	public List<MedicalOrganization> medicalOrganizationList;
	@Transient
	public List<MensClothingStore> mensClothingStoreList;
	@Transient
	public List<MiddleSchool> middleSchoolList;
	@Transient
	public List<Midwifery> midwiferyList;
	@Transient
	public List<MobilePhoneStore> mobilePhoneStoreList;
	@Transient
	public List<Motel> motelList;
	@Transient
	public List<MotorcycleDealer> motorcycleDealerList;
	@Transient
	public List<MotorcycleRepair> motorcycleRepairList;
	@Transient
	public List<MovieRentalStore> movieRentalStoreList;
	@Transient
	public List<MovieTheater> movieTheaterList;
	@Transient
	public List<MovingCompany> movingCompanyList;
	@Transient
	public List<MusicGroup> musicGroupList;
	@Transient
	public List<MusicStore> musicStoreList;
	@Transient
	public List<NGO> ngoList;
	@Transient
	public List<NailSalon> nailSalonList;
	@Transient
	public List<NewsMediaOrganization> newsMediaOrganizationList;
	@Transient
	public List<NightClub> nightClubList;
	@Transient
	public List<Notary> notaryList;
	@Transient
	public List<Nursing> nursingList;
	@Transient
	public List<Obstetric> obstetricList;
	@Transient
	public List<OfficeEquipmentStore> officeEquipmentStoreList;
	@Transient
	public List<Oncologic> oncologicList;
	@Transient
	public List<Optician> opticianList;
	@Transient
	public List<Optometric> optometricList;
	@Transient
	public List<Organization> organizationList;
	@Transient
	public List<Otolaryngologic> otolaryngologicList;
	@Transient
	public List<OutletStore> outletStoreList;
	@Transient
	public List<ParentAudience> parentAudienceList;
	@Transient
	public List<Patient> patientList;
	@Transient
	public List<PawnShop> pawnShopList;
	@Transient
	public List<Pediatric> pediatricList;
	@Transient
	public List<PeopleAudience> peopleAudienceList;
	@Transient
	public List<PerformingGroup> performingGroupList;
	@Transient
	public List<Person> personList;
	@Transient
	public List<PetStore> petStoreList;
	@Transient
	public List<Pharmacy> pharmacyList;
	@Transient
	public List<Physician> physicianList;
	@Transient
	public List<Physiotherapy> physiotherapyList;
	@Transient
	public List<PlasticSurgery> plasticSurgeryList;
	@Transient
	public List<Plumber> plumberList;
	@Transient
	public List<Podiatric> podiatricList;
	@Transient
	public List<PoliceStation> policeStationList;
	@Transient
	public List<PostOffice> postOfficeList;
	@Transient
	public List<Preschool> preschoolList;
	@Transient
	public List<PrimaryCare> primaryCareList;
	@Transient
	public List<ProfessionalService> professionalServiceList;
	@Transient
	public List<Psychiatric> psychiatricList;
	@Transient
	public List<PublicHealth> publicHealthList;
	@Transient
	public List<PublicSwimmingPool> publicSwimmingPoolList;
	@Transient
	public List<RadioStation> radioStationList;
	@Transient
	public List<RealEstateAgent> realEstateAgentList;
	@Transient
	public List<RecyclingCenter> recyclingCenterList;
	@Transient
	public List<Resort> resortList;
	@Transient
	public List<Restaurant> restaurantList;
	@Transient
	public List<RoofingContractor> roofingContractorList;
	@Transient
	public List<School> schoolList;
	@Transient
	public List<SelfStorage> selfStorageList;
	@Transient
	public List<ShoeStore> shoeStoreList;
	@Transient
	public List<ShoppingCenter> shoppingCenterList;
	@Transient
	public List<SkiResort> skiResortList;
	@Transient
	public List<SportingGoodsStore> sportingGoodsStoreList;
	@Transient
	public List<SportsActivityLocation> sportsActivityLocationList;
	@Transient
	public List<SportsClub> sportsClubList;
	@Transient
	public List<SportsOrganization> sportsOrganizationList;
	@Transient
	public List<SportsTeam> sportsTeamList;
	@Transient
	public List<StadiumOrArena> stadiumOrArenaList;
	@Transient
	public List<Store> storeList;
	@Transient
	public List<TattooParlor> tattooParlorList;
	@Transient
	public List<TelevisionStation> televisionStationList;
	@Transient
	public List<TennisComplex> tennisComplexList;
	@Transient
	public List<TheaterGroup> theaterGroupList;
	@Transient
	public List<TireShop> tireShopList;
	@Transient
	public List<TouristInformationCenter> touristInformationCenterList;
	@Transient
	public List<ToyStore> toyStoreList;
	@Transient
	public List<TravelAgency> travelAgencyList;
	@Transient
	public List<VeterinaryCare> veterinaryCareList;
	@Transient
	public List<WholesaleStore> wholesaleStoreList;
	@Transient
	public List<Winery> wineryList;
	@Transient
	public List<WorkersUnion> workersUnionList;

	public SENDER() {
	}

	public SENDER(String string) {
		this(new AUDIENCE(string));
	}

	public String getString() {
		if(audienceList == null || audienceList.size() == 0 || audienceList.get(0) == null) {
			return null;
		} else {
			Name name = audienceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(audienceList == null) {
			audienceList = new ArrayList<Audience>();
		}
		if(audienceList.size() == 0) {
			audienceList.add(new AUDIENCE(string));
		} else {
			audienceList.set(0, new AUDIENCE(string));
		}
	}

	public SENDER(AccountingService accountingService) {
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

	public SENDER(AdultEntertainment adultEntertainment) {
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

	public SENDER(Airline airline) {
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

	public SENDER(AmusementPark amusementPark) {
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

	public SENDER(AnimalShelter animalShelter) {
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

	public SENDER(ArtGallery artGallery) {
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

	public SENDER(Attorney attorney) {
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

	public SENDER(Audience audience) {
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

	public SENDER(AutoBodyShop autoBodyShop) {
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

	public SENDER(AutoDealer autoDealer) {
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

	public SENDER(AutoPartsStore autoPartsStore) {
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

	public SENDER(AutoRental autoRental) {
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

	public SENDER(AutoRepair autoRepair) {
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

	public SENDER(AutoWash autoWash) {
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

	public SENDER(AutomatedTeller automatedTeller) {
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

	public SENDER(AutomotiveBusiness automotiveBusiness) {
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

	public SENDER(Bakery bakery) {
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

	public SENDER(BankOrCreditUnion bankOrCreditUnion) {
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

	public SENDER(BarOrPub barOrPub) {
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

	public SENDER(BeautySalon beautySalon) {
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

	public SENDER(BedAndBreakfast bedAndBreakfast) {
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

	public SENDER(BikeStore bikeStore) {
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

	public SENDER(BookStore bookStore) {
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

	public SENDER(BowlingAlley bowlingAlley) {
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

	public SENDER(Brewery brewery) {
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

	public SENDER(BusinessAudience businessAudience) {
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

	public SENDER(CafeOrCoffeeShop cafeOrCoffeeShop) {
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

	public SENDER(Campground campground) {
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

	public SENDER(Casino casino) {
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

	public SENDER(ChildCare childCare) {
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

	public SENDER(ClothingStore clothingStore) {
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

	public SENDER(CollegeOrUniversity collegeOrUniversity) {
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

	public SENDER(ComedyClub comedyClub) {
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

	public SENDER(CommunityHealth communityHealth) {
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

	public SENDER(ComputerStore computerStore) {
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

	public SENDER(Consortium consortium) {
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

	public SENDER(ConvenienceStore convenienceStore) {
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

	public SENDER(Corporation corporation) {
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

	public SENDER(DanceGroup danceGroup) {
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

	public SENDER(DaySpa daySpa) {
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

	public SENDER(Dentist dentist) {
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

	public SENDER(DepartmentStore departmentStore) {
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

	public SENDER(Dermatology dermatology) {
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

	public SENDER(DiagnosticLab diagnosticLab) {
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

	public SENDER(DietNutrition dietNutrition) {
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

	public SENDER(Distillery distillery) {
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

	public SENDER(DryCleaningOrLaundry dryCleaningOrLaundry) {
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

	public SENDER(EducationalAudience educationalAudience) {
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

	public SENDER(EducationalOrganization educationalOrganization) {
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

	public SENDER(Electrician electrician) {
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

	public SENDER(ElectronicsStore electronicsStore) {
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

	public SENDER(ElementarySchool elementarySchool) {
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

	public SENDER(Emergency emergency) {
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

	public SENDER(EmergencyService emergencyService) {
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

	public SENDER(EmploymentAgency employmentAgency) {
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

	public SENDER(EntertainmentBusiness entertainmentBusiness) {
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

	public SENDER(ExerciseGym exerciseGym) {
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

	public SENDER(FastFoodRestaurant fastFoodRestaurant) {
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

	public SENDER(FinancialService financialService) {
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

	public SENDER(FireStation fireStation) {
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

	public SENDER(Florist florist) {
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

	public SENDER(FoodEstablishment foodEstablishment) {
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

	public SENDER(FurnitureStore furnitureStore) {
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

	public SENDER(GardenStore gardenStore) {
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

	public SENDER(GasStation gasStation) {
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

	public SENDER(GeneralContractor generalContractor) {
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

	public SENDER(Geriatric geriatric) {
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

	public SENDER(GolfCourse golfCourse) {
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

	public SENDER(GovernmentOffice governmentOffice) {
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

	public SENDER(GovernmentOrganization governmentOrganization) {
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

	public SENDER(GroceryStore groceryStore) {
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

	public SENDER(Gynecologic gynecologic) {
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

	public SENDER(HVACBusiness hvacBusiness) {
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

	public SENDER(HairSalon hairSalon) {
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

	public SENDER(HardwareStore hardwareStore) {
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

	public SENDER(HealthAndBeautyBusiness healthAndBeautyBusiness) {
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

	public SENDER(HealthClub healthClub) {
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

	public SENDER(HighSchool highSchool) {
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

	public SENDER(HobbyShop hobbyShop) {
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

	public SENDER(HomeAndConstructionBusiness homeAndConstructionBusiness) {
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

	public SENDER(HomeGoodsStore homeGoodsStore) {
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

	public SENDER(Hospital hospital) {
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

	public SENDER(Hostel hostel) {
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

	public SENDER(Hotel hotel) {
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

	public SENDER(HousePainter housePainter) {
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

	public SENDER(IceCreamShop iceCreamShop) {
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

	public SENDER(InsuranceAgency insuranceAgency) {
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

	public SENDER(InternetCafe internetCafe) {
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

	public SENDER(JewelryStore jewelryStore) {
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

	public SENDER(LegalService legalService) {
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

	public SENDER(Library library) {
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

	public SENDER(LibrarySystem librarySystem) {
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

	public SENDER(LiquorStore liquorStore) {
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

	public SENDER(LocalBusiness localBusiness) {
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

	public SENDER(Locksmith locksmith) {
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

	public SENDER(LodgingBusiness lodgingBusiness) {
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

	public SENDER(MedicalAudience medicalAudience) {
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

	public SENDER(MedicalBusiness medicalBusiness) {
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

	public SENDER(MedicalClinic medicalClinic) {
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

	public SENDER(MedicalOrganization medicalOrganization) {
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

	public SENDER(MensClothingStore mensClothingStore) {
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

	public SENDER(MiddleSchool middleSchool) {
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

	public SENDER(Midwifery midwifery) {
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

	public SENDER(MobilePhoneStore mobilePhoneStore) {
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

	public SENDER(Motel motel) {
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

	public SENDER(MotorcycleDealer motorcycleDealer) {
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

	public SENDER(MotorcycleRepair motorcycleRepair) {
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

	public SENDER(MovieRentalStore movieRentalStore) {
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

	public SENDER(MovieTheater movieTheater) {
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

	public SENDER(MovingCompany movingCompany) {
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

	public SENDER(MusicGroup musicGroup) {
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

	public SENDER(MusicStore musicStore) {
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

	public SENDER(NGO ngo) {
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

	public SENDER(NailSalon nailSalon) {
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

	public SENDER(NewsMediaOrganization newsMediaOrganization) {
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

	public SENDER(NightClub nightClub) {
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

	public SENDER(Notary notary) {
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

	public SENDER(Nursing nursing) {
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

	public SENDER(Obstetric obstetric) {
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

	public SENDER(OfficeEquipmentStore officeEquipmentStore) {
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

	public SENDER(Oncologic oncologic) {
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

	public SENDER(Optician optician) {
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

	public SENDER(Optometric optometric) {
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

	public SENDER(Organization organization) {
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

	public SENDER(Otolaryngologic otolaryngologic) {
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

	public SENDER(OutletStore outletStore) {
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

	public SENDER(ParentAudience parentAudience) {
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

	public SENDER(Patient patient) {
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

	public SENDER(PawnShop pawnShop) {
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

	public SENDER(Pediatric pediatric) {
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

	public SENDER(PeopleAudience peopleAudience) {
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

	public SENDER(PerformingGroup performingGroup) {
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

	public SENDER(Person person) {
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

	public SENDER(PetStore petStore) {
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

	public SENDER(Pharmacy pharmacy) {
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

	public SENDER(Physician physician) {
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

	public SENDER(Physiotherapy physiotherapy) {
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

	public SENDER(PlasticSurgery plasticSurgery) {
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

	public SENDER(Plumber plumber) {
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

	public SENDER(Podiatric podiatric) {
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

	public SENDER(PoliceStation policeStation) {
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

	public SENDER(PostOffice postOffice) {
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

	public SENDER(Preschool preschool) {
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

	public SENDER(PrimaryCare primaryCare) {
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

	public SENDER(ProfessionalService professionalService) {
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

	public SENDER(Psychiatric psychiatric) {
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

	public SENDER(PublicHealth publicHealth) {
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

	public SENDER(PublicSwimmingPool publicSwimmingPool) {
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

	public SENDER(RadioStation radioStation) {
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

	public SENDER(RealEstateAgent realEstateAgent) {
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

	public SENDER(RecyclingCenter recyclingCenter) {
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

	public SENDER(Resort resort) {
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

	public SENDER(Restaurant restaurant) {
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

	public SENDER(RoofingContractor roofingContractor) {
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

	public SENDER(School school) {
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

	public SENDER(SelfStorage selfStorage) {
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

	public SENDER(ShoeStore shoeStore) {
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

	public SENDER(ShoppingCenter shoppingCenter) {
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

	public SENDER(SkiResort skiResort) {
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

	public SENDER(SportingGoodsStore sportingGoodsStore) {
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

	public SENDER(SportsActivityLocation sportsActivityLocation) {
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

	public SENDER(SportsClub sportsClub) {
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

	public SENDER(SportsOrganization sportsOrganization) {
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

	public SENDER(SportsTeam sportsTeam) {
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

	public SENDER(StadiumOrArena stadiumOrArena) {
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

	public SENDER(Store store) {
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

	public SENDER(TattooParlor tattooParlor) {
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

	public SENDER(TelevisionStation televisionStation) {
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

	public SENDER(TennisComplex tennisComplex) {
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

	public SENDER(TheaterGroup theaterGroup) {
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

	public SENDER(TireShop tireShop) {
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

	public SENDER(TouristInformationCenter touristInformationCenter) {
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

	public SENDER(ToyStore toyStore) {
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

	public SENDER(TravelAgency travelAgency) {
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

	public SENDER(VeterinaryCare veterinaryCare) {
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

	public SENDER(WholesaleStore wholesaleStore) {
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

	public SENDER(Winery winery) {
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

	public SENDER(WorkersUnion workersUnion) {
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

	public void copy(Container.Sender org) {
		setAccountingServiceList(org.getAccountingServiceList());
		setAdultEntertainmentList(org.getAdultEntertainmentList());
		setAirlineList(org.getAirlineList());
		setAmusementParkList(org.getAmusementParkList());
		setAnimalShelterList(org.getAnimalShelterList());
		setArtGalleryList(org.getArtGalleryList());
		setAttorneyList(org.getAttorneyList());
		setAudienceList(org.getAudienceList());
		setAutoBodyShopList(org.getAutoBodyShopList());
		setAutoDealerList(org.getAutoDealerList());
		setAutoPartsStoreList(org.getAutoPartsStoreList());
		setAutoRentalList(org.getAutoRentalList());
		setAutoRepairList(org.getAutoRepairList());
		setAutoWashList(org.getAutoWashList());
		setAutomatedTellerList(org.getAutomatedTellerList());
		setAutomotiveBusinessList(org.getAutomotiveBusinessList());
		setBakeryList(org.getBakeryList());
		setBankOrCreditUnionList(org.getBankOrCreditUnionList());
		setBarOrPubList(org.getBarOrPubList());
		setBeautySalonList(org.getBeautySalonList());
		setBedAndBreakfastList(org.getBedAndBreakfastList());
		setBikeStoreList(org.getBikeStoreList());
		setBookStoreList(org.getBookStoreList());
		setBowlingAlleyList(org.getBowlingAlleyList());
		setBreweryList(org.getBreweryList());
		setBusinessAudienceList(org.getBusinessAudienceList());
		setCafeOrCoffeeShopList(org.getCafeOrCoffeeShopList());
		setCampgroundList(org.getCampgroundList());
		setCasinoList(org.getCasinoList());
		setChildCareList(org.getChildCareList());
		setClothingStoreList(org.getClothingStoreList());
		setCollegeOrUniversityList(org.getCollegeOrUniversityList());
		setComedyClubList(org.getComedyClubList());
		setCommunityHealthList(org.getCommunityHealthList());
		setComputerStoreList(org.getComputerStoreList());
		setConsortiumList(org.getConsortiumList());
		setConvenienceStoreList(org.getConvenienceStoreList());
		setCorporationList(org.getCorporationList());
		setDanceGroupList(org.getDanceGroupList());
		setDaySpaList(org.getDaySpaList());
		setDentistList(org.getDentistList());
		setDepartmentStoreList(org.getDepartmentStoreList());
		setDermatologyList(org.getDermatologyList());
		setDiagnosticLabList(org.getDiagnosticLabList());
		setDietNutritionList(org.getDietNutritionList());
		setDistilleryList(org.getDistilleryList());
		setDryCleaningOrLaundryList(org.getDryCleaningOrLaundryList());
		setEducationalAudienceList(org.getEducationalAudienceList());
		setEducationalOrganizationList(org.getEducationalOrganizationList());
		setElectricianList(org.getElectricianList());
		setElectronicsStoreList(org.getElectronicsStoreList());
		setElementarySchoolList(org.getElementarySchoolList());
		setEmergencyList(org.getEmergencyList());
		setEmergencyServiceList(org.getEmergencyServiceList());
		setEmploymentAgencyList(org.getEmploymentAgencyList());
		setEntertainmentBusinessList(org.getEntertainmentBusinessList());
		setExerciseGymList(org.getExerciseGymList());
		setFastFoodRestaurantList(org.getFastFoodRestaurantList());
		setFinancialServiceList(org.getFinancialServiceList());
		setFireStationList(org.getFireStationList());
		setFloristList(org.getFloristList());
		setFoodEstablishmentList(org.getFoodEstablishmentList());
		setFurnitureStoreList(org.getFurnitureStoreList());
		setGardenStoreList(org.getGardenStoreList());
		setGasStationList(org.getGasStationList());
		setGeneralContractorList(org.getGeneralContractorList());
		setGeriatricList(org.getGeriatricList());
		setGolfCourseList(org.getGolfCourseList());
		setGovernmentOfficeList(org.getGovernmentOfficeList());
		setGovernmentOrganizationList(org.getGovernmentOrganizationList());
		setGroceryStoreList(org.getGroceryStoreList());
		setGynecologicList(org.getGynecologicList());
		setHVACBusinessList(org.getHVACBusinessList());
		setHairSalonList(org.getHairSalonList());
		setHardwareStoreList(org.getHardwareStoreList());
		setHealthAndBeautyBusinessList(org.getHealthAndBeautyBusinessList());
		setHealthClubList(org.getHealthClubList());
		setHighSchoolList(org.getHighSchoolList());
		setHobbyShopList(org.getHobbyShopList());
		setHomeAndConstructionBusinessList(org.getHomeAndConstructionBusinessList());
		setHomeGoodsStoreList(org.getHomeGoodsStoreList());
		setHospitalList(org.getHospitalList());
		setHostelList(org.getHostelList());
		setHotelList(org.getHotelList());
		setHousePainterList(org.getHousePainterList());
		setIceCreamShopList(org.getIceCreamShopList());
		setInsuranceAgencyList(org.getInsuranceAgencyList());
		setInternetCafeList(org.getInternetCafeList());
		setJewelryStoreList(org.getJewelryStoreList());
		setLegalServiceList(org.getLegalServiceList());
		setLibraryList(org.getLibraryList());
		setLibrarySystemList(org.getLibrarySystemList());
		setLiquorStoreList(org.getLiquorStoreList());
		setLocalBusinessList(org.getLocalBusinessList());
		setLocksmithList(org.getLocksmithList());
		setLodgingBusinessList(org.getLodgingBusinessList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setMedicalBusinessList(org.getMedicalBusinessList());
		setMedicalClinicList(org.getMedicalClinicList());
		setMedicalOrganizationList(org.getMedicalOrganizationList());
		setMensClothingStoreList(org.getMensClothingStoreList());
		setMiddleSchoolList(org.getMiddleSchoolList());
		setMidwiferyList(org.getMidwiferyList());
		setMobilePhoneStoreList(org.getMobilePhoneStoreList());
		setMotelList(org.getMotelList());
		setMotorcycleDealerList(org.getMotorcycleDealerList());
		setMotorcycleRepairList(org.getMotorcycleRepairList());
		setMovieRentalStoreList(org.getMovieRentalStoreList());
		setMovieTheaterList(org.getMovieTheaterList());
		setMovingCompanyList(org.getMovingCompanyList());
		setMusicGroupList(org.getMusicGroupList());
		setMusicStoreList(org.getMusicStoreList());
		setNGOList(org.getNGOList());
		setNailSalonList(org.getNailSalonList());
		setNewsMediaOrganizationList(org.getNewsMediaOrganizationList());
		setNightClubList(org.getNightClubList());
		setNotaryList(org.getNotaryList());
		setNursingList(org.getNursingList());
		setObstetricList(org.getObstetricList());
		setOfficeEquipmentStoreList(org.getOfficeEquipmentStoreList());
		setOncologicList(org.getOncologicList());
		setOpticianList(org.getOpticianList());
		setOptometricList(org.getOptometricList());
		setOrganizationList(org.getOrganizationList());
		setOtolaryngologicList(org.getOtolaryngologicList());
		setOutletStoreList(org.getOutletStoreList());
		setParentAudienceList(org.getParentAudienceList());
		setPatientList(org.getPatientList());
		setPawnShopList(org.getPawnShopList());
		setPediatricList(org.getPediatricList());
		setPeopleAudienceList(org.getPeopleAudienceList());
		setPerformingGroupList(org.getPerformingGroupList());
		setPersonList(org.getPersonList());
		setPetStoreList(org.getPetStoreList());
		setPharmacyList(org.getPharmacyList());
		setPhysicianList(org.getPhysicianList());
		setPhysiotherapyList(org.getPhysiotherapyList());
		setPlasticSurgeryList(org.getPlasticSurgeryList());
		setPlumberList(org.getPlumberList());
		setPodiatricList(org.getPodiatricList());
		setPoliceStationList(org.getPoliceStationList());
		setPostOfficeList(org.getPostOfficeList());
		setPreschoolList(org.getPreschoolList());
		setPrimaryCareList(org.getPrimaryCareList());
		setProfessionalServiceList(org.getProfessionalServiceList());
		setPsychiatricList(org.getPsychiatricList());
		setPublicHealthList(org.getPublicHealthList());
		setPublicSwimmingPoolList(org.getPublicSwimmingPoolList());
		setRadioStationList(org.getRadioStationList());
		setRealEstateAgentList(org.getRealEstateAgentList());
		setRecyclingCenterList(org.getRecyclingCenterList());
		setResortList(org.getResortList());
		setRestaurantList(org.getRestaurantList());
		setRoofingContractorList(org.getRoofingContractorList());
		setSchoolList(org.getSchoolList());
		setSelfStorageList(org.getSelfStorageList());
		setShoeStoreList(org.getShoeStoreList());
		setShoppingCenterList(org.getShoppingCenterList());
		setSkiResortList(org.getSkiResortList());
		setSportingGoodsStoreList(org.getSportingGoodsStoreList());
		setSportsActivityLocationList(org.getSportsActivityLocationList());
		setSportsClubList(org.getSportsClubList());
		setSportsOrganizationList(org.getSportsOrganizationList());
		setSportsTeamList(org.getSportsTeamList());
		setStadiumOrArenaList(org.getStadiumOrArenaList());
		setStoreList(org.getStoreList());
		setTattooParlorList(org.getTattooParlorList());
		setTelevisionStationList(org.getTelevisionStationList());
		setTennisComplexList(org.getTennisComplexList());
		setTheaterGroupList(org.getTheaterGroupList());
		setTireShopList(org.getTireShopList());
		setTouristInformationCenterList(org.getTouristInformationCenterList());
		setToyStoreList(org.getToyStoreList());
		setTravelAgencyList(org.getTravelAgencyList());
		setVeterinaryCareList(org.getVeterinaryCareList());
		setWholesaleStoreList(org.getWholesaleStoreList());
		setWineryList(org.getWineryList());
		setWorkersUnionList(org.getWorkersUnionList());
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
