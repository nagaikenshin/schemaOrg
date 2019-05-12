package org.kyojo.schemaorg.m3n5.meta.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
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
import org.kyojo.schemaorg.m3n5.core.Container.Name;
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
import org.kyojo.schemaorg.m3n5.meta.Clazz.Class;
import org.kyojo.schemaorg.m3n5.meta.Clazz.Property;
import org.kyojo.schemaorg.m3n5.meta.Container;
import org.kyojo.schemaorg.m3n5.meta.impl.CLASS;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalValueLevel;

public class SUPERSEDED_BY implements Container.SupersededBy {

	private static final long serialVersionUID = 1L;

	public List<ActionStatusType> actionStatusTypeList;
	public List<BedType> bedTypeList;
	public List<BoardingPolicyType> boardingPolicyTypeList;
	public List<BookFormatType> bookFormatTypeList;
	public List<BusinessEntityType> businessEntityTypeList;
	public List<BusinessFunction> businessFunctionList;
	public List<CarUsageType> carUsageTypeList;
	public List<Class> clazzList;
	public List<ContactPointOption> contactPointOptionList;
	public List<CreditCard> creditCardList;
	public List<DayOfWeek> dayOfWeekList;
	public List<DeliveryMethod> deliveryMethodList;
	public List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList;
	public List<DriveWheelConfigurationValue> driveWheelConfigurationValueList;
	public List<DrugClass> drugClassList;
	public List<DrugCost> drugCostList;
	public List<DrugCostCategory> drugCostCategoryList;
	public List<DrugPregnancyCategory> drugPregnancyCategoryList;
	public List<DrugPrescriptionStatus> drugPrescriptionStatusList;
	public List<Enumeration> enumerationList;
	public List<EventStatusType> eventStatusTypeList;
	public List<GamePlayMode> gamePlayModeList;
	public List<GameServerStatus> gameServerStatusList;
	public List<GenderType> genderTypeList;
	public List<InfectiousAgentClass> infectiousAgentClassList;
	public List<ItemAvailability> itemAvailabilityList;
	public List<ItemListOrderType> itemListOrderTypeList;
	public List<LegalForceStatus> legalForceStatusList;
	public List<LegalValueLevel> legalValueLevelList;
	public List<LockerDelivery> lockerDeliveryList;
	public List<MapCategoryType> mapCategoryTypeList;
	public List<MedicalAudience> medicalAudienceList;
	public List<MedicalDevicePurpose> medicalDevicePurposeList;
	public List<MedicalEnumeration> medicalEnumerationList;
	public List<MedicalEvidenceLevel> medicalEvidenceLevelList;
	public List<MedicalImagingTechnique> medicalImagingTechniqueList;
	public List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList;
	public List<MedicalProcedureType> medicalProcedureTypeList;
	public List<MedicalSpecialty> medicalSpecialtyList;
	public List<MedicalStudyStatus> medicalStudyStatusList;
	public List<MedicalTrialDesign> medicalTrialDesignList;
	public List<MedicineSystem> medicineSystemList;
	public List<MusicAlbumProductionType> musicAlbumProductionTypeList;
	public List<MusicAlbumReleaseType> musicAlbumReleaseTypeList;
	public List<MusicReleaseFormatType> musicReleaseFormatTypeList;
	public List<OfferItemCondition> offerItemConditionList;
	public List<OrderStatus> orderStatusList;
	public List<ParcelService> parcelServiceList;
	public List<Patient> patientList;
	public List<PaymentCard> paymentCardList;
	public List<PaymentMethod> paymentMethodList;
	public List<PaymentStatusType> paymentStatusTypeList;
	public List<PhysicalActivityCategory> physicalActivityCategoryList;
	public List<PhysicalExam> physicalExamList;
	public List<Property> propertyList;
	public List<QualitativeValue> qualitativeValueList;
	public List<ReservationStatusType> reservationStatusTypeList;
	public List<RestrictedDiet> restrictedDietList;
	public List<RsvpResponseType> rsvpResponseTypeList;
	public List<Specialty> specialtyList;
	public List<SteeringPositionValue> steeringPositionValueList;
	public List<WarrantyScope> warrantyScopeList;

	public SUPERSEDED_BY() {
	}

	public SUPERSEDED_BY(String string) {
		this(new CLASS(string));
	}

	public String getString() {
		if(clazzList == null || clazzList.size() == 0 || clazzList.get(0) == null) {
			return null;
		} else {
			Name name = clazzList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(clazzList == null) {
			clazzList = new ArrayList<Class>();
		}
		if(clazzList.size() == 0) {
			clazzList.add(new CLASS(string));
		} else {
			clazzList.set(0, new CLASS(string));
		}
	}

	public SUPERSEDED_BY(ActionStatusType actionStatusType) {
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

	public SUPERSEDED_BY(BedType bedType) {
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

	public SUPERSEDED_BY(BoardingPolicyType boardingPolicyType) {
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

	public SUPERSEDED_BY(BookFormatType bookFormatType) {
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

	public SUPERSEDED_BY(BusinessEntityType businessEntityType) {
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

	public SUPERSEDED_BY(BusinessFunction businessFunction) {
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

	public SUPERSEDED_BY(CarUsageType carUsageType) {
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

	public SUPERSEDED_BY(Class clazz) {
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

	public SUPERSEDED_BY(ContactPointOption contactPointOption) {
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

	public SUPERSEDED_BY(CreditCard creditCard) {
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

	public SUPERSEDED_BY(DayOfWeek dayOfWeek) {
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

	public SUPERSEDED_BY(DeliveryMethod deliveryMethod) {
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

	public SUPERSEDED_BY(DigitalDocumentPermissionType digitalDocumentPermissionType) {
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

	public SUPERSEDED_BY(DriveWheelConfigurationValue driveWheelConfigurationValue) {
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

	public SUPERSEDED_BY(DrugClass drugClass) {
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

	public SUPERSEDED_BY(DrugCost drugCost) {
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

	public SUPERSEDED_BY(DrugCostCategory drugCostCategory) {
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

	public SUPERSEDED_BY(DrugPregnancyCategory drugPregnancyCategory) {
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

	public SUPERSEDED_BY(DrugPrescriptionStatus drugPrescriptionStatus) {
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

	public SUPERSEDED_BY(Enumeration enumeration) {
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

	public SUPERSEDED_BY(EventStatusType eventStatusType) {
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

	public SUPERSEDED_BY(GamePlayMode gamePlayMode) {
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

	public SUPERSEDED_BY(GameServerStatus gameServerStatus) {
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

	public SUPERSEDED_BY(GenderType genderType) {
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

	public SUPERSEDED_BY(InfectiousAgentClass infectiousAgentClass) {
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

	public SUPERSEDED_BY(ItemAvailability itemAvailability) {
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

	public SUPERSEDED_BY(ItemListOrderType itemListOrderType) {
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

	public SUPERSEDED_BY(LegalForceStatus legalForceStatus) {
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

	public SUPERSEDED_BY(LegalValueLevel legalValueLevel) {
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

	public SUPERSEDED_BY(LockerDelivery lockerDelivery) {
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

	public SUPERSEDED_BY(MapCategoryType mapCategoryType) {
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

	public SUPERSEDED_BY(MedicalAudience medicalAudience) {
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

	public SUPERSEDED_BY(MedicalDevicePurpose medicalDevicePurpose) {
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

	public SUPERSEDED_BY(MedicalEnumeration medicalEnumeration) {
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

	public SUPERSEDED_BY(MedicalEvidenceLevel medicalEvidenceLevel) {
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

	public SUPERSEDED_BY(MedicalImagingTechnique medicalImagingTechnique) {
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

	public SUPERSEDED_BY(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
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

	public SUPERSEDED_BY(MedicalProcedureType medicalProcedureType) {
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

	public SUPERSEDED_BY(MedicalSpecialty medicalSpecialty) {
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

	public SUPERSEDED_BY(MedicalStudyStatus medicalStudyStatus) {
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

	public SUPERSEDED_BY(MedicalTrialDesign medicalTrialDesign) {
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

	public SUPERSEDED_BY(MedicineSystem medicineSystem) {
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

	public SUPERSEDED_BY(MusicAlbumProductionType musicAlbumProductionType) {
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

	public SUPERSEDED_BY(MusicAlbumReleaseType musicAlbumReleaseType) {
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

	public SUPERSEDED_BY(MusicReleaseFormatType musicReleaseFormatType) {
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

	public SUPERSEDED_BY(OfferItemCondition offerItemCondition) {
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

	public SUPERSEDED_BY(OrderStatus orderStatus) {
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

	public SUPERSEDED_BY(ParcelService parcelService) {
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

	public SUPERSEDED_BY(Patient patient) {
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

	public SUPERSEDED_BY(PaymentCard paymentCard) {
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

	public SUPERSEDED_BY(PaymentMethod paymentMethod) {
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

	public SUPERSEDED_BY(PaymentStatusType paymentStatusType) {
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

	public SUPERSEDED_BY(PhysicalActivityCategory physicalActivityCategory) {
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

	public SUPERSEDED_BY(PhysicalExam physicalExam) {
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

	public SUPERSEDED_BY(Property property) {
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

	public SUPERSEDED_BY(QualitativeValue qualitativeValue) {
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

	public SUPERSEDED_BY(ReservationStatusType reservationStatusType) {
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

	public SUPERSEDED_BY(RestrictedDiet restrictedDiet) {
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

	public SUPERSEDED_BY(RsvpResponseType rsvpResponseType) {
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

	public SUPERSEDED_BY(Specialty specialty) {
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

	public SUPERSEDED_BY(SteeringPositionValue steeringPositionValue) {
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

	public SUPERSEDED_BY(WarrantyScope warrantyScope) {
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

	public void copy(Container.SupersededBy org) {
		setActionStatusTypeList(org.getActionStatusTypeList());
		setBedTypeList(org.getBedTypeList());
		setBoardingPolicyTypeList(org.getBoardingPolicyTypeList());
		setBookFormatTypeList(org.getBookFormatTypeList());
		setBusinessEntityTypeList(org.getBusinessEntityTypeList());
		setBusinessFunctionList(org.getBusinessFunctionList());
		setCarUsageTypeList(org.getCarUsageTypeList());
		setClazzList(org.getClazzList());
		setContactPointOptionList(org.getContactPointOptionList());
		setCreditCardList(org.getCreditCardList());
		setDayOfWeekList(org.getDayOfWeekList());
		setDeliveryMethodList(org.getDeliveryMethodList());
		setDigitalDocumentPermissionTypeList(org.getDigitalDocumentPermissionTypeList());
		setDriveWheelConfigurationValueList(org.getDriveWheelConfigurationValueList());
		setDrugClassList(org.getDrugClassList());
		setDrugCostList(org.getDrugCostList());
		setDrugCostCategoryList(org.getDrugCostCategoryList());
		setDrugPregnancyCategoryList(org.getDrugPregnancyCategoryList());
		setDrugPrescriptionStatusList(org.getDrugPrescriptionStatusList());
		setEnumerationList(org.getEnumerationList());
		setEventStatusTypeList(org.getEventStatusTypeList());
		setGamePlayModeList(org.getGamePlayModeList());
		setGameServerStatusList(org.getGameServerStatusList());
		setGenderTypeList(org.getGenderTypeList());
		setInfectiousAgentClassList(org.getInfectiousAgentClassList());
		setItemAvailabilityList(org.getItemAvailabilityList());
		setItemListOrderTypeList(org.getItemListOrderTypeList());
		setLegalForceStatusList(org.getLegalForceStatusList());
		setLegalValueLevelList(org.getLegalValueLevelList());
		setLockerDeliveryList(org.getLockerDeliveryList());
		setMapCategoryTypeList(org.getMapCategoryTypeList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setMedicalDevicePurposeList(org.getMedicalDevicePurposeList());
		setMedicalEnumerationList(org.getMedicalEnumerationList());
		setMedicalEvidenceLevelList(org.getMedicalEvidenceLevelList());
		setMedicalImagingTechniqueList(org.getMedicalImagingTechniqueList());
		setMedicalObservationalStudyDesignList(org.getMedicalObservationalStudyDesignList());
		setMedicalProcedureTypeList(org.getMedicalProcedureTypeList());
		setMedicalSpecialtyList(org.getMedicalSpecialtyList());
		setMedicalStudyStatusList(org.getMedicalStudyStatusList());
		setMedicalTrialDesignList(org.getMedicalTrialDesignList());
		setMedicineSystemList(org.getMedicineSystemList());
		setMusicAlbumProductionTypeList(org.getMusicAlbumProductionTypeList());
		setMusicAlbumReleaseTypeList(org.getMusicAlbumReleaseTypeList());
		setMusicReleaseFormatTypeList(org.getMusicReleaseFormatTypeList());
		setOfferItemConditionList(org.getOfferItemConditionList());
		setOrderStatusList(org.getOrderStatusList());
		setParcelServiceList(org.getParcelServiceList());
		setPatientList(org.getPatientList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentMethodList(org.getPaymentMethodList());
		setPaymentStatusTypeList(org.getPaymentStatusTypeList());
		setPhysicalActivityCategoryList(org.getPhysicalActivityCategoryList());
		setPhysicalExamList(org.getPhysicalExamList());
		setPropertyList(org.getPropertyList());
		setQualitativeValueList(org.getQualitativeValueList());
		setReservationStatusTypeList(org.getReservationStatusTypeList());
		setRestrictedDietList(org.getRestrictedDietList());
		setRsvpResponseTypeList(org.getRsvpResponseTypeList());
		setSpecialtyList(org.getSpecialtyList());
		setSteeringPositionValueList(org.getSteeringPositionValueList());
		setWarrantyScopeList(org.getWarrantyScopeList());
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
