package org.kyojo.schemaorg.m3n5.meta;

import java.util.List;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.NativeValueText;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgProperty;
import org.kyojo.schemaorg.SchemaOrgURI;
import org.kyojo.schemaorg.m3n5.auto.Clazz.CarUsageType;
import org.kyojo.schemaorg.m3n5.core.Clazz.ActionStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.BedType;
import org.kyojo.schemaorg.m3n5.core.Clazz.BoardingPolicyType;
import org.kyojo.schemaorg.m3n5.core.Clazz.BookFormatType;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusinessEntityType;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusinessFunction;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPointOption;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryMethod;
import org.kyojo.schemaorg.m3n5.core.Clazz.DigitalDocumentPermissionType;
import org.kyojo.schemaorg.m3n5.core.Clazz.DriveWheelConfigurationValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n5.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.GamePlayMode;
import org.kyojo.schemaorg.m3n5.core.Clazz.GameServerStatus;
import org.kyojo.schemaorg.m3n5.core.Clazz.GenderType;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemAvailability;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemListOrderType;
import org.kyojo.schemaorg.m3n5.core.Clazz.LockerDelivery;
import org.kyojo.schemaorg.m3n5.core.Clazz.MapCategoryType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumProductionType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumReleaseType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicReleaseFormatType;
import org.kyojo.schemaorg.m3n5.core.Clazz.OfferItemCondition;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrderStatus;
import org.kyojo.schemaorg.m3n5.core.Clazz.ParcelService;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReservationStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.RestrictedDiet;
import org.kyojo.schemaorg.m3n5.core.Clazz.RsvpResponseType;
import org.kyojo.schemaorg.m3n5.core.Clazz.Specialty;
import org.kyojo.schemaorg.m3n5.core.Clazz.SteeringPositionValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.WarrantyScope;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugClass;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCost;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCostCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPregnancyCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.InfectiousAgentClass;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalDevicePurpose;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalEnumeration;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalEvidenceLevel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalObservationalStudyDesign;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalProcedureType;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalSpecialty;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalStudyStatus;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTrialDesign;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicineSystem;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Patient;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalActivityCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n5.meta.Clazz;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalValueLevel;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
@CamelizedName("container")
@ConstantizedName("CONTAINER")
public interface Container extends SchemaOrgProperty {

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/domainIncludes")
	@SchemaOrgLabel("domainIncludes")
	@SchemaOrgComment(""
			+ "Relates a property to a class that is (one of) the type(s) the property is"
			+ " expected to be used on.")
	@CamelizedName("domainIncludes")
	@ConstantizedName("DOMAIN_INCLUDES")
	public interface DomainIncludes extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/inverseOf")
	@SchemaOrgLabel("inverseOf")
	@SchemaOrgComment(""
			+ "Relates a property to a property that is its inverse. Inverse properties relate"
			+ " the same pairs of items to each other, but in reversed direction. For example,"
			+ " the 'alumni' and 'alumniOf' properties are inverseOf each other. Some"
			+ " properties don't have explicit inverses; in these situations RDFa and JSON-LD"
			+ " syntax for reverse properties can be used.")
	@CamelizedName("inverseOf")
	@ConstantizedName("INVERSE_OF")
	public interface InverseOf extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Property">http://schema.org/Property</a>
		 */
		public Clazz.Property getProperty();
		public void setProperty(Clazz.Property property);
		public List<Clazz.Property> getPropertyList();
		public void setPropertyList(List<Clazz.Property> propertyList);
		public boolean hasProperty();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/rangeIncludes")
	@SchemaOrgLabel("rangeIncludes")
	@SchemaOrgComment(""
			+ "Relates a property to a class that constitutes (one of) the expected type(s) for"
			+ " values of the property.")
	@CamelizedName("rangeIncludes")
	@ConstantizedName("RANGE_INCLUDES")
	public interface RangeIncludes extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		public String getNativeValue();

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/supersededBy")
	@SchemaOrgLabel("supersededBy")
	@SchemaOrgComment(""
			+ "Relates a term (i.e. a property, class or enumeration) to one that supersedes"
			+ " it.")
	@CamelizedName("supersededBy")
	@ConstantizedName("SUPERSEDED_BY")
	public interface SupersededBy extends NativeValueText, SchemaOrgProperty {

		/**
		 * @see <a href="http://schema.org/ActionStatusType">http://schema.org/ActionStatusType</a>
		 */
		public ActionStatusType getActionStatusType();
		public void setActionStatusType(ActionStatusType actionStatusType);
		public List<ActionStatusType> getActionStatusTypeList();
		public void setActionStatusTypeList(List<ActionStatusType> actionStatusTypeList);
		public boolean hasActionStatusType();

		/**
		 * @see <a href="http://schema.org/BedType">http://schema.org/BedType</a>
		 */
		public BedType getBedType();
		public void setBedType(BedType bedType);
		public List<BedType> getBedTypeList();
		public void setBedTypeList(List<BedType> bedTypeList);
		public boolean hasBedType();

		/**
		 * @see <a href="http://schema.org/BoardingPolicyType">http://schema.org/BoardingPolicyType</a>
		 */
		public BoardingPolicyType getBoardingPolicyType();
		public void setBoardingPolicyType(BoardingPolicyType boardingPolicyType);
		public List<BoardingPolicyType> getBoardingPolicyTypeList();
		public void setBoardingPolicyTypeList(List<BoardingPolicyType> boardingPolicyTypeList);
		public boolean hasBoardingPolicyType();

		/**
		 * @see <a href="http://schema.org/BookFormatType">http://schema.org/BookFormatType</a>
		 */
		public BookFormatType getBookFormatType();
		public void setBookFormatType(BookFormatType bookFormatType);
		public List<BookFormatType> getBookFormatTypeList();
		public void setBookFormatTypeList(List<BookFormatType> bookFormatTypeList);
		public boolean hasBookFormatType();

		/**
		 * @see <a href="http://schema.org/BusinessEntityType">http://schema.org/BusinessEntityType</a>
		 */
		public BusinessEntityType getBusinessEntityType();
		public void setBusinessEntityType(BusinessEntityType businessEntityType);
		public List<BusinessEntityType> getBusinessEntityTypeList();
		public void setBusinessEntityTypeList(List<BusinessEntityType> businessEntityTypeList);
		public boolean hasBusinessEntityType();

		/**
		 * @see <a href="http://schema.org/BusinessFunction">http://schema.org/BusinessFunction</a>
		 */
		public BusinessFunction getBusinessFunction();
		public void setBusinessFunction(BusinessFunction businessFunction);
		public List<BusinessFunction> getBusinessFunctionList();
		public void setBusinessFunctionList(List<BusinessFunction> businessFunctionList);
		public boolean hasBusinessFunction();

		/**
		 * @see <a href="http://schema.org/CarUsageType">http://schema.org/CarUsageType</a>
		 */
		public CarUsageType getCarUsageType();
		public void setCarUsageType(CarUsageType carUsageType);
		public List<CarUsageType> getCarUsageTypeList();
		public void setCarUsageTypeList(List<CarUsageType> carUsageTypeList);
		public boolean hasCarUsageType();

		/**
		 * @see <a href="http://schema.org/Class">http://schema.org/Class</a>
		 */
		public Clazz.Class getClazz();
		public void setClazz(Clazz.Class clazz);
		public List<Clazz.Class> getClazzList();
		public void setClazzList(List<Clazz.Class> clazzList);
		public boolean hasClazz();

		/**
		 * @see <a href="http://schema.org/ContactPointOption">http://schema.org/ContactPointOption</a>
		 */
		public ContactPointOption getContactPointOption();
		public void setContactPointOption(ContactPointOption contactPointOption);
		public List<ContactPointOption> getContactPointOptionList();
		public void setContactPointOptionList(List<ContactPointOption> contactPointOptionList);
		public boolean hasContactPointOption();

		/**
		 * @see <a href="http://schema.org/CreditCard">http://schema.org/CreditCard</a>
		 */
		public CreditCard getCreditCard();
		public void setCreditCard(CreditCard creditCard);
		public List<CreditCard> getCreditCardList();
		public void setCreditCardList(List<CreditCard> creditCardList);
		public boolean hasCreditCard();

		/**
		 * @see <a href="http://schema.org/DayOfWeek">http://schema.org/DayOfWeek</a>
		 */
		public DayOfWeek getDayOfWeek();
		public void setDayOfWeek(DayOfWeek dayOfWeek);
		public List<DayOfWeek> getDayOfWeekList();
		public void setDayOfWeekList(List<DayOfWeek> dayOfWeekList);
		public boolean hasDayOfWeek();

		/**
		 * @see <a href="http://schema.org/DeliveryMethod">http://schema.org/DeliveryMethod</a>
		 */
		public DeliveryMethod getDeliveryMethod();
		public void setDeliveryMethod(DeliveryMethod deliveryMethod);
		public List<DeliveryMethod> getDeliveryMethodList();
		public void setDeliveryMethodList(List<DeliveryMethod> deliveryMethodList);
		public boolean hasDeliveryMethod();

		/**
		 * @see <a href="http://schema.org/DigitalDocumentPermissionType">http://schema.org/DigitalDocumentPermissionType</a>
		 */
		public DigitalDocumentPermissionType getDigitalDocumentPermissionType();
		public void setDigitalDocumentPermissionType(DigitalDocumentPermissionType digitalDocumentPermissionType);
		public List<DigitalDocumentPermissionType> getDigitalDocumentPermissionTypeList();
		public void setDigitalDocumentPermissionTypeList(List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList);
		public boolean hasDigitalDocumentPermissionType();

		/**
		 * @see <a href="http://schema.org/DriveWheelConfigurationValue">http://schema.org/DriveWheelConfigurationValue</a>
		 */
		public DriveWheelConfigurationValue getDriveWheelConfigurationValue();
		public void setDriveWheelConfigurationValue(DriveWheelConfigurationValue driveWheelConfigurationValue);
		public List<DriveWheelConfigurationValue> getDriveWheelConfigurationValueList();
		public void setDriveWheelConfigurationValueList(List<DriveWheelConfigurationValue> driveWheelConfigurationValueList);
		public boolean hasDriveWheelConfigurationValue();

		/**
		 * @see <a href="http://schema.org/DrugClass">http://schema.org/DrugClass</a>
		 */
		public DrugClass getDrugClass();
		public void setDrugClass(DrugClass drugClass);
		public List<DrugClass> getDrugClassList();
		public void setDrugClassList(List<DrugClass> drugClassList);
		public boolean hasDrugClass();

		/**
		 * @see <a href="http://schema.org/DrugCost">http://schema.org/DrugCost</a>
		 */
		public DrugCost getDrugCost();
		public void setDrugCost(DrugCost drugCost);
		public List<DrugCost> getDrugCostList();
		public void setDrugCostList(List<DrugCost> drugCostList);
		public boolean hasDrugCost();

		/**
		 * @see <a href="http://schema.org/DrugCostCategory">http://schema.org/DrugCostCategory</a>
		 */
		public DrugCostCategory getDrugCostCategory();
		public void setDrugCostCategory(DrugCostCategory drugCostCategory);
		public List<DrugCostCategory> getDrugCostCategoryList();
		public void setDrugCostCategoryList(List<DrugCostCategory> drugCostCategoryList);
		public boolean hasDrugCostCategory();

		/**
		 * @see <a href="http://schema.org/DrugPregnancyCategory">http://schema.org/DrugPregnancyCategory</a>
		 */
		public DrugPregnancyCategory getDrugPregnancyCategory();
		public void setDrugPregnancyCategory(DrugPregnancyCategory drugPregnancyCategory);
		public List<DrugPregnancyCategory> getDrugPregnancyCategoryList();
		public void setDrugPregnancyCategoryList(List<DrugPregnancyCategory> drugPregnancyCategoryList);
		public boolean hasDrugPregnancyCategory();

		/**
		 * @see <a href="http://schema.org/DrugPrescriptionStatus">http://schema.org/DrugPrescriptionStatus</a>
		 */
		public DrugPrescriptionStatus getDrugPrescriptionStatus();
		public void setDrugPrescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus);
		public List<DrugPrescriptionStatus> getDrugPrescriptionStatusList();
		public void setDrugPrescriptionStatusList(List<DrugPrescriptionStatus> drugPrescriptionStatusList);
		public boolean hasDrugPrescriptionStatus();

		/**
		 * @see <a href="http://schema.org/Enumeration">http://schema.org/Enumeration</a>
		 */
		public Enumeration getEnumeration();
		public void setEnumeration(Enumeration enumeration);
		public List<Enumeration> getEnumerationList();
		public void setEnumerationList(List<Enumeration> enumerationList);
		public boolean hasEnumeration();

		/**
		 * @see <a href="http://schema.org/EventStatusType">http://schema.org/EventStatusType</a>
		 */
		public EventStatusType getEventStatusType();
		public void setEventStatusType(EventStatusType eventStatusType);
		public List<EventStatusType> getEventStatusTypeList();
		public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList);
		public boolean hasEventStatusType();

		/**
		 * @see <a href="http://schema.org/GamePlayMode">http://schema.org/GamePlayMode</a>
		 */
		public GamePlayMode getGamePlayMode();
		public void setGamePlayMode(GamePlayMode gamePlayMode);
		public List<GamePlayMode> getGamePlayModeList();
		public void setGamePlayModeList(List<GamePlayMode> gamePlayModeList);
		public boolean hasGamePlayMode();

		/**
		 * @see <a href="http://schema.org/GameServerStatus">http://schema.org/GameServerStatus</a>
		 */
		public GameServerStatus getGameServerStatus();
		public void setGameServerStatus(GameServerStatus gameServerStatus);
		public List<GameServerStatus> getGameServerStatusList();
		public void setGameServerStatusList(List<GameServerStatus> gameServerStatusList);
		public boolean hasGameServerStatus();

		/**
		 * @see <a href="http://schema.org/GenderType">http://schema.org/GenderType</a>
		 */
		public GenderType getGenderType();
		public void setGenderType(GenderType genderType);
		public List<GenderType> getGenderTypeList();
		public void setGenderTypeList(List<GenderType> genderTypeList);
		public boolean hasGenderType();

		/**
		 * @see <a href="http://schema.org/InfectiousAgentClass">http://schema.org/InfectiousAgentClass</a>
		 */
		public InfectiousAgentClass getInfectiousAgentClass();
		public void setInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass);
		public List<InfectiousAgentClass> getInfectiousAgentClassList();
		public void setInfectiousAgentClassList(List<InfectiousAgentClass> infectiousAgentClassList);
		public boolean hasInfectiousAgentClass();

		/**
		 * @see <a href="http://schema.org/ItemAvailability">http://schema.org/ItemAvailability</a>
		 */
		public ItemAvailability getItemAvailability();
		public void setItemAvailability(ItemAvailability itemAvailability);
		public List<ItemAvailability> getItemAvailabilityList();
		public void setItemAvailabilityList(List<ItemAvailability> itemAvailabilityList);
		public boolean hasItemAvailability();

		/**
		 * @see <a href="http://schema.org/ItemListOrderType">http://schema.org/ItemListOrderType</a>
		 */
		public ItemListOrderType getItemListOrderType();
		public void setItemListOrderType(ItemListOrderType itemListOrderType);
		public List<ItemListOrderType> getItemListOrderTypeList();
		public void setItemListOrderTypeList(List<ItemListOrderType> itemListOrderTypeList);
		public boolean hasItemListOrderType();

		/**
		 * @see <a href="http://schema.org/LegalForceStatus">http://schema.org/LegalForceStatus</a>
		 */
		public LegalForceStatus getLegalForceStatus();
		public void setLegalForceStatus(LegalForceStatus legalForceStatus);
		public List<LegalForceStatus> getLegalForceStatusList();
		public void setLegalForceStatusList(List<LegalForceStatus> legalForceStatusList);
		public boolean hasLegalForceStatus();

		/**
		 * @see <a href="http://schema.org/LegalValueLevel">http://schema.org/LegalValueLevel</a>
		 */
		public LegalValueLevel getLegalValueLevel();
		public void setLegalValueLevel(LegalValueLevel legalValueLevel);
		public List<LegalValueLevel> getLegalValueLevelList();
		public void setLegalValueLevelList(List<LegalValueLevel> legalValueLevelList);
		public boolean hasLegalValueLevel();

		/**
		 * @see <a href="http://schema.org/LockerDelivery">http://schema.org/LockerDelivery</a>
		 */
		public LockerDelivery getLockerDelivery();
		public void setLockerDelivery(LockerDelivery lockerDelivery);
		public List<LockerDelivery> getLockerDeliveryList();
		public void setLockerDeliveryList(List<LockerDelivery> lockerDeliveryList);
		public boolean hasLockerDelivery();

		/**
		 * @see <a href="http://schema.org/MapCategoryType">http://schema.org/MapCategoryType</a>
		 */
		public MapCategoryType getMapCategoryType();
		public void setMapCategoryType(MapCategoryType mapCategoryType);
		public List<MapCategoryType> getMapCategoryTypeList();
		public void setMapCategoryTypeList(List<MapCategoryType> mapCategoryTypeList);
		public boolean hasMapCategoryType();

		/**
		 * @see <a href="http://schema.org/MedicalAudience">http://schema.org/MedicalAudience</a>
		 */
		public MedicalAudience getMedicalAudience();
		public void setMedicalAudience(MedicalAudience medicalAudience);
		public List<MedicalAudience> getMedicalAudienceList();
		public void setMedicalAudienceList(List<MedicalAudience> medicalAudienceList);
		public boolean hasMedicalAudience();

		/**
		 * @see <a href="http://schema.org/MedicalDevicePurpose">http://schema.org/MedicalDevicePurpose</a>
		 */
		public MedicalDevicePurpose getMedicalDevicePurpose();
		public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose);
		public List<MedicalDevicePurpose> getMedicalDevicePurposeList();
		public void setMedicalDevicePurposeList(List<MedicalDevicePurpose> medicalDevicePurposeList);
		public boolean hasMedicalDevicePurpose();

		/**
		 * @see <a href="http://schema.org/MedicalEnumeration">http://schema.org/MedicalEnumeration</a>
		 */
		public MedicalEnumeration getMedicalEnumeration();
		public void setMedicalEnumeration(MedicalEnumeration medicalEnumeration);
		public List<MedicalEnumeration> getMedicalEnumerationList();
		public void setMedicalEnumerationList(List<MedicalEnumeration> medicalEnumerationList);
		public boolean hasMedicalEnumeration();

		/**
		 * @see <a href="http://schema.org/MedicalEvidenceLevel">http://schema.org/MedicalEvidenceLevel</a>
		 */
		public MedicalEvidenceLevel getMedicalEvidenceLevel();
		public void setMedicalEvidenceLevel(MedicalEvidenceLevel medicalEvidenceLevel);
		public List<MedicalEvidenceLevel> getMedicalEvidenceLevelList();
		public void setMedicalEvidenceLevelList(List<MedicalEvidenceLevel> medicalEvidenceLevelList);
		public boolean hasMedicalEvidenceLevel();

		/**
		 * @see <a href="http://schema.org/MedicalImagingTechnique">http://schema.org/MedicalImagingTechnique</a>
		 */
		public MedicalImagingTechnique getMedicalImagingTechnique();
		public void setMedicalImagingTechnique(MedicalImagingTechnique medicalImagingTechnique);
		public List<MedicalImagingTechnique> getMedicalImagingTechniqueList();
		public void setMedicalImagingTechniqueList(List<MedicalImagingTechnique> medicalImagingTechniqueList);
		public boolean hasMedicalImagingTechnique();

		/**
		 * @see <a href="http://schema.org/MedicalObservationalStudyDesign">http://schema.org/MedicalObservationalStudyDesign</a>
		 */
		public MedicalObservationalStudyDesign getMedicalObservationalStudyDesign();
		public void setMedicalObservationalStudyDesign(MedicalObservationalStudyDesign medicalObservationalStudyDesign);
		public List<MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList();
		public void setMedicalObservationalStudyDesignList(List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList);
		public boolean hasMedicalObservationalStudyDesign();

		/**
		 * @see <a href="http://schema.org/MedicalProcedureType">http://schema.org/MedicalProcedureType</a>
		 */
		public MedicalProcedureType getMedicalProcedureType();
		public void setMedicalProcedureType(MedicalProcedureType medicalProcedureType);
		public List<MedicalProcedureType> getMedicalProcedureTypeList();
		public void setMedicalProcedureTypeList(List<MedicalProcedureType> medicalProcedureTypeList);
		public boolean hasMedicalProcedureType();

		/**
		 * @see <a href="http://schema.org/MedicalSpecialty">http://schema.org/MedicalSpecialty</a>
		 */
		public MedicalSpecialty getMedicalSpecialty();
		public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty);
		public List<MedicalSpecialty> getMedicalSpecialtyList();
		public void setMedicalSpecialtyList(List<MedicalSpecialty> medicalSpecialtyList);
		public boolean hasMedicalSpecialty();

		/**
		 * @see <a href="http://schema.org/MedicalStudyStatus">http://schema.org/MedicalStudyStatus</a>
		 */
		public MedicalStudyStatus getMedicalStudyStatus();
		public void setMedicalStudyStatus(MedicalStudyStatus medicalStudyStatus);
		public List<MedicalStudyStatus> getMedicalStudyStatusList();
		public void setMedicalStudyStatusList(List<MedicalStudyStatus> medicalStudyStatusList);
		public boolean hasMedicalStudyStatus();

		/**
		 * @see <a href="http://schema.org/MedicalTrialDesign">http://schema.org/MedicalTrialDesign</a>
		 */
		public MedicalTrialDesign getMedicalTrialDesign();
		public void setMedicalTrialDesign(MedicalTrialDesign medicalTrialDesign);
		public List<MedicalTrialDesign> getMedicalTrialDesignList();
		public void setMedicalTrialDesignList(List<MedicalTrialDesign> medicalTrialDesignList);
		public boolean hasMedicalTrialDesign();

		/**
		 * @see <a href="http://schema.org/MedicineSystem">http://schema.org/MedicineSystem</a>
		 */
		public MedicineSystem getMedicineSystem();
		public void setMedicineSystem(MedicineSystem medicineSystem);
		public List<MedicineSystem> getMedicineSystemList();
		public void setMedicineSystemList(List<MedicineSystem> medicineSystemList);
		public boolean hasMedicineSystem();

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
		 * @see <a href="http://schema.org/MusicReleaseFormatType">http://schema.org/MusicReleaseFormatType</a>
		 */
		public MusicReleaseFormatType getMusicReleaseFormatType();
		public void setMusicReleaseFormatType(MusicReleaseFormatType musicReleaseFormatType);
		public List<MusicReleaseFormatType> getMusicReleaseFormatTypeList();
		public void setMusicReleaseFormatTypeList(List<MusicReleaseFormatType> musicReleaseFormatTypeList);
		public boolean hasMusicReleaseFormatType();

		/**
		 * @see <a href="http://schema.org/OfferItemCondition">http://schema.org/OfferItemCondition</a>
		 */
		public OfferItemCondition getOfferItemCondition();
		public void setOfferItemCondition(OfferItemCondition offerItemCondition);
		public List<OfferItemCondition> getOfferItemConditionList();
		public void setOfferItemConditionList(List<OfferItemCondition> offerItemConditionList);
		public boolean hasOfferItemCondition();

		/**
		 * @see <a href="http://schema.org/OrderStatus">http://schema.org/OrderStatus</a>
		 */
		public OrderStatus getOrderStatus();
		public void setOrderStatus(OrderStatus orderStatus);
		public List<OrderStatus> getOrderStatusList();
		public void setOrderStatusList(List<OrderStatus> orderStatusList);
		public boolean hasOrderStatus();

		/**
		 * @see <a href="http://schema.org/ParcelService">http://schema.org/ParcelService</a>
		 */
		public ParcelService getParcelService();
		public void setParcelService(ParcelService parcelService);
		public List<ParcelService> getParcelServiceList();
		public void setParcelServiceList(List<ParcelService> parcelServiceList);
		public boolean hasParcelService();

		/**
		 * @see <a href="http://schema.org/Patient">http://schema.org/Patient</a>
		 */
		public Patient getPatient();
		public void setPatient(Patient patient);
		public List<Patient> getPatientList();
		public void setPatientList(List<Patient> patientList);
		public boolean hasPatient();

		/**
		 * @see <a href="http://schema.org/PaymentCard">http://schema.org/PaymentCard</a>
		 */
		public PaymentCard getPaymentCard();
		public void setPaymentCard(PaymentCard paymentCard);
		public List<PaymentCard> getPaymentCardList();
		public void setPaymentCardList(List<PaymentCard> paymentCardList);
		public boolean hasPaymentCard();

		/**
		 * @see <a href="http://schema.org/PaymentMethod">http://schema.org/PaymentMethod</a>
		 */
		public PaymentMethod getPaymentMethod();
		public void setPaymentMethod(PaymentMethod paymentMethod);
		public List<PaymentMethod> getPaymentMethodList();
		public void setPaymentMethodList(List<PaymentMethod> paymentMethodList);
		public boolean hasPaymentMethod();

		/**
		 * @see <a href="http://schema.org/PaymentStatusType">http://schema.org/PaymentStatusType</a>
		 */
		public PaymentStatusType getPaymentStatusType();
		public void setPaymentStatusType(PaymentStatusType paymentStatusType);
		public List<PaymentStatusType> getPaymentStatusTypeList();
		public void setPaymentStatusTypeList(List<PaymentStatusType> paymentStatusTypeList);
		public boolean hasPaymentStatusType();

		/**
		 * @see <a href="http://schema.org/PhysicalActivityCategory">http://schema.org/PhysicalActivityCategory</a>
		 */
		public PhysicalActivityCategory getPhysicalActivityCategory();
		public void setPhysicalActivityCategory(PhysicalActivityCategory physicalActivityCategory);
		public List<PhysicalActivityCategory> getPhysicalActivityCategoryList();
		public void setPhysicalActivityCategoryList(List<PhysicalActivityCategory> physicalActivityCategoryList);
		public boolean hasPhysicalActivityCategory();

		/**
		 * @see <a href="http://schema.org/PhysicalExam">http://schema.org/PhysicalExam</a>
		 */
		public PhysicalExam getPhysicalExam();
		public void setPhysicalExam(PhysicalExam physicalExam);
		public List<PhysicalExam> getPhysicalExamList();
		public void setPhysicalExamList(List<PhysicalExam> physicalExamList);
		public boolean hasPhysicalExam();

		/**
		 * @see <a href="http://schema.org/Property">http://schema.org/Property</a>
		 */
		public Clazz.Property getProperty();
		public void setProperty(Clazz.Property property);
		public List<Clazz.Property> getPropertyList();
		public void setPropertyList(List<Clazz.Property> propertyList);
		public boolean hasProperty();

		/**
		 * @see <a href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>
		 */
		public QualitativeValue getQualitativeValue();
		public void setQualitativeValue(QualitativeValue qualitativeValue);
		public List<QualitativeValue> getQualitativeValueList();
		public void setQualitativeValueList(List<QualitativeValue> qualitativeValueList);
		public boolean hasQualitativeValue();

		/**
		 * @see <a href="http://schema.org/ReservationStatusType">http://schema.org/ReservationStatusType</a>
		 */
		public ReservationStatusType getReservationStatusType();
		public void setReservationStatusType(ReservationStatusType reservationStatusType);
		public List<ReservationStatusType> getReservationStatusTypeList();
		public void setReservationStatusTypeList(List<ReservationStatusType> reservationStatusTypeList);
		public boolean hasReservationStatusType();

		/**
		 * @see <a href="http://schema.org/RestrictedDiet">http://schema.org/RestrictedDiet</a>
		 */
		public RestrictedDiet getRestrictedDiet();
		public void setRestrictedDiet(RestrictedDiet restrictedDiet);
		public List<RestrictedDiet> getRestrictedDietList();
		public void setRestrictedDietList(List<RestrictedDiet> restrictedDietList);
		public boolean hasRestrictedDiet();

		/**
		 * @see <a href="http://schema.org/RsvpResponseType">http://schema.org/RsvpResponseType</a>
		 */
		public RsvpResponseType getRsvpResponseType();
		public void setRsvpResponseType(RsvpResponseType rsvpResponseType);
		public List<RsvpResponseType> getRsvpResponseTypeList();
		public void setRsvpResponseTypeList(List<RsvpResponseType> rsvpResponseTypeList);
		public boolean hasRsvpResponseType();

		/**
		 * @see <a href="http://schema.org/Specialty">http://schema.org/Specialty</a>
		 */
		public Specialty getSpecialty();
		public void setSpecialty(Specialty specialty);
		public List<Specialty> getSpecialtyList();
		public void setSpecialtyList(List<Specialty> specialtyList);
		public boolean hasSpecialty();

		/**
		 * @see <a href="http://schema.org/SteeringPositionValue">http://schema.org/SteeringPositionValue</a>
		 */
		public SteeringPositionValue getSteeringPositionValue();
		public void setSteeringPositionValue(SteeringPositionValue steeringPositionValue);
		public List<SteeringPositionValue> getSteeringPositionValueList();
		public void setSteeringPositionValueList(List<SteeringPositionValue> steeringPositionValueList);
		public boolean hasSteeringPositionValue();

		/**
		 * @see <a href="http://schema.org/WarrantyScope">http://schema.org/WarrantyScope</a>
		 */
		public WarrantyScope getWarrantyScope();
		public void setWarrantyScope(WarrantyScope warrantyScope);
		public List<WarrantyScope> getWarrantyScopeList();
		public void setWarrantyScopeList(List<WarrantyScope> warrantyScopeList);
		public boolean hasWarrantyScope();

		public String getNativeValue();

	}

}
