package org.kyojo.schemaorg.m3n5.core.impl;

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
import org.kyojo.schemaorg.m3n5.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPoint;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPointOption;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryMethod;
import org.kyojo.schemaorg.m3n5.core.Clazz.DigitalDocumentPermissionType;
import org.kyojo.schemaorg.m3n5.core.Clazz.DriveWheelConfigurationValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.EngineSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.Enumeration;
import org.kyojo.schemaorg.m3n5.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.GamePlayMode;
import org.kyojo.schemaorg.m3n5.core.Clazz.GameServerStatus;
import org.kyojo.schemaorg.m3n5.core.Clazz.GenderType;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoCircle;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoCoordinates;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n5.core.Clazz.InteractionCounter;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemAvailability;
import org.kyojo.schemaorg.m3n5.core.Clazz.ItemListOrderType;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.LockerDelivery;
import org.kyojo.schemaorg.m3n5.core.Clazz.MapCategoryType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumProductionType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicAlbumReleaseType;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicReleaseFormatType;
import org.kyojo.schemaorg.m3n5.core.Clazz.NutritionInformation;
import org.kyojo.schemaorg.m3n5.core.Clazz.OfferItemCondition;
import org.kyojo.schemaorg.m3n5.core.Clazz.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.OrderStatus;
import org.kyojo.schemaorg.m3n5.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n5.core.Clazz.ParcelService;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n5.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.QualitativeValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValueDistribution;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReservationStatusType;
import org.kyojo.schemaorg.m3n5.core.Clazz.RestrictedDiet;
import org.kyojo.schemaorg.m3n5.core.Clazz.RsvpResponseType;
import org.kyojo.schemaorg.m3n5.core.Clazz.Specialty;
import org.kyojo.schemaorg.m3n5.core.Clazz.SteeringPositionValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.StructuredValue;
import org.kyojo.schemaorg.m3n5.core.Clazz.TypeAndQuantityNode;
import org.kyojo.schemaorg.m3n5.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.WarrantyPromise;
import org.kyojo.schemaorg.m3n5.core.Clazz.WarrantyScope;
import org.kyojo.schemaorg.m3n5.core.Container;
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
import org.kyojo.schemaorg.m3n5.pending.Clazz.ExchangeRateSpecification;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalValueLevel;
import org.kyojo.schemaorg.m3n5.pending.Clazz.RepaymentSpecification;

import org.seasar.doma.Transient;

public class VALUE_REFERENCE implements Container.ValueReference {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ActionStatusType> actionStatusTypeList;
	@Transient
	public List<BedType> bedTypeList;
	@Transient
	public List<BoardingPolicyType> boardingPolicyTypeList;
	@Transient
	public List<BookFormatType> bookFormatTypeList;
	@Transient
	public List<BusinessEntityType> businessEntityTypeList;
	@Transient
	public List<BusinessFunction> businessFunctionList;
	@Transient
	public List<CarUsageType> carUsageTypeList;
	@Transient
	public List<CompoundPriceSpecification> compoundPriceSpecificationList;
	@Transient
	public List<ContactPoint> contactPointList;
	@Transient
	public List<ContactPointOption> contactPointOptionList;
	@Transient
	public List<CreditCard> creditCardList;
	@Transient
	public List<DayOfWeek> dayOfWeekList;
	@Transient
	public List<DeliveryChargeSpecification> deliveryChargeSpecificationList;
	@Transient
	public List<DeliveryMethod> deliveryMethodList;
	@Transient
	public List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList;
	@Transient
	public List<DriveWheelConfigurationValue> driveWheelConfigurationValueList;
	@Transient
	public List<DrugClass> drugClassList;
	@Transient
	public List<DrugCost> drugCostList;
	@Transient
	public List<DrugCostCategory> drugCostCategoryList;
	@Transient
	public List<DrugPregnancyCategory> drugPregnancyCategoryList;
	@Transient
	public List<DrugPrescriptionStatus> drugPrescriptionStatusList;
	@Transient
	public List<EngineSpecification> engineSpecificationList;
	@Transient
	public List<Enumeration> enumerationList;
	@Transient
	public List<EventStatusType> eventStatusTypeList;
	@Transient
	public List<ExchangeRateSpecification> exchangeRateSpecificationList;
	@Transient
	public List<GamePlayMode> gamePlayModeList;
	@Transient
	public List<GameServerStatus> gameServerStatusList;
	@Transient
	public List<GenderType> genderTypeList;
	@Transient
	public List<GeoCircle> geoCircleList;
	@Transient
	public List<GeoCoordinates> geoCoordinatesList;
	@Transient
	public List<GeoShape> geoShapeList;
	@Transient
	public List<InfectiousAgentClass> infectiousAgentClassList;
	@Transient
	public List<InteractionCounter> interactionCounterList;
	@Transient
	public List<ItemAvailability> itemAvailabilityList;
	@Transient
	public List<ItemListOrderType> itemListOrderTypeList;
	@Transient
	public List<LegalForceStatus> legalForceStatusList;
	@Transient
	public List<LegalValueLevel> legalValueLevelList;
	@Transient
	public List<LocationFeatureSpecification> locationFeatureSpecificationList;
	@Transient
	public List<LockerDelivery> lockerDeliveryList;
	@Transient
	public List<MapCategoryType> mapCategoryTypeList;
	@Transient
	public List<MedicalAudience> medicalAudienceList;
	@Transient
	public List<MedicalDevicePurpose> medicalDevicePurposeList;
	@Transient
	public List<MedicalEnumeration> medicalEnumerationList;
	@Transient
	public List<MedicalEvidenceLevel> medicalEvidenceLevelList;
	@Transient
	public List<MedicalImagingTechnique> medicalImagingTechniqueList;
	@Transient
	public List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList;
	@Transient
	public List<MedicalProcedureType> medicalProcedureTypeList;
	@Transient
	public List<MedicalSpecialty> medicalSpecialtyList;
	@Transient
	public List<MedicalStudyStatus> medicalStudyStatusList;
	@Transient
	public List<MedicalTrialDesign> medicalTrialDesignList;
	@Transient
	public List<MedicineSystem> medicineSystemList;
	@Transient
	public List<MonetaryAmount> monetaryAmountList;
	@Transient
	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;
	@Transient
	public List<MusicAlbumProductionType> musicAlbumProductionTypeList;
	@Transient
	public List<MusicAlbumReleaseType> musicAlbumReleaseTypeList;
	@Transient
	public List<MusicReleaseFormatType> musicReleaseFormatTypeList;
	@Transient
	public List<NutritionInformation> nutritionInformationList;
	@Transient
	public List<OfferItemCondition> offerItemConditionList;
	@Transient
	public List<OpeningHoursSpecification> openingHoursSpecificationList;
	@Transient
	public List<OrderStatus> orderStatusList;
	@Transient
	public List<OwnershipInfo> ownershipInfoList;
	@Transient
	public List<ParcelService> parcelServiceList;
	@Transient
	public List<Patient> patientList;
	@Transient
	public List<PaymentCard> paymentCardList;
	@Transient
	public List<PaymentChargeSpecification> paymentChargeSpecificationList;
	@Transient
	public List<PaymentMethod> paymentMethodList;
	@Transient
	public List<PaymentStatusType> paymentStatusTypeList;
	@Transient
	public List<PhysicalActivityCategory> physicalActivityCategoryList;
	@Transient
	public List<PhysicalExam> physicalExamList;
	@Transient
	public List<PostalAddress> postalAddressList;
	@Transient
	public List<PriceSpecification> priceSpecificationList;
	@Transient
	public List<PropertyValue> propertyValueList;
	@Transient
	public List<QualitativeValue> qualitativeValueList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;
	@Transient
	public List<QuantitativeValueDistribution> quantitativeValueDistributionList;
	@Transient
	public List<RepaymentSpecification> repaymentSpecificationList;
	@Transient
	public List<ReservationStatusType> reservationStatusTypeList;
	@Transient
	public List<RestrictedDiet> restrictedDietList;
	@Transient
	public List<RsvpResponseType> rsvpResponseTypeList;
	@Transient
	public List<Specialty> specialtyList;
	@Transient
	public List<SteeringPositionValue> steeringPositionValueList;
	@Transient
	public List<StructuredValue> structuredValueList;
	@Transient
	public List<TypeAndQuantityNode> typeAndQuantityNodeList;
	@Transient
	public List<UnitPriceSpecification> unitPriceSpecificationList;
	@Transient
	public List<WarrantyPromise> warrantyPromiseList;
	@Transient
	public List<WarrantyScope> warrantyScopeList;

	public VALUE_REFERENCE() {
	}

	public VALUE_REFERENCE(String string) {
		this(new ENUMERATION(string));
	}

	public String getString() {
		if(enumerationList == null || enumerationList.size() == 0 || enumerationList.get(0) == null) {
			return null;
		} else {
			Name name = enumerationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(enumerationList == null) {
			enumerationList = new ArrayList<Enumeration>();
		}
		if(enumerationList.size() == 0) {
			enumerationList.add(new ENUMERATION(string));
		} else {
			enumerationList.set(0, new ENUMERATION(string));
		}
	}

	public VALUE_REFERENCE(ActionStatusType actionStatusType) {
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

	public VALUE_REFERENCE(BedType bedType) {
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

	public VALUE_REFERENCE(BoardingPolicyType boardingPolicyType) {
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

	public VALUE_REFERENCE(BookFormatType bookFormatType) {
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

	public VALUE_REFERENCE(BusinessEntityType businessEntityType) {
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

	public VALUE_REFERENCE(BusinessFunction businessFunction) {
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

	public VALUE_REFERENCE(CarUsageType carUsageType) {
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

	public VALUE_REFERENCE(CompoundPriceSpecification compoundPriceSpecification) {
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

	public VALUE_REFERENCE(ContactPoint contactPoint) {
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

	public VALUE_REFERENCE(ContactPointOption contactPointOption) {
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

	public VALUE_REFERENCE(CreditCard creditCard) {
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

	public VALUE_REFERENCE(DayOfWeek dayOfWeek) {
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

	public VALUE_REFERENCE(DeliveryChargeSpecification deliveryChargeSpecification) {
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

	public VALUE_REFERENCE(DeliveryMethod deliveryMethod) {
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

	public VALUE_REFERENCE(DigitalDocumentPermissionType digitalDocumentPermissionType) {
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

	public VALUE_REFERENCE(DriveWheelConfigurationValue driveWheelConfigurationValue) {
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

	public VALUE_REFERENCE(DrugClass drugClass) {
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

	public VALUE_REFERENCE(DrugCost drugCost) {
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

	public VALUE_REFERENCE(DrugCostCategory drugCostCategory) {
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

	public VALUE_REFERENCE(DrugPregnancyCategory drugPregnancyCategory) {
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

	public VALUE_REFERENCE(DrugPrescriptionStatus drugPrescriptionStatus) {
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

	public VALUE_REFERENCE(EngineSpecification engineSpecification) {
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

	public VALUE_REFERENCE(Enumeration enumeration) {
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

	public VALUE_REFERENCE(EventStatusType eventStatusType) {
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

	public VALUE_REFERENCE(ExchangeRateSpecification exchangeRateSpecification) {
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

	public VALUE_REFERENCE(GamePlayMode gamePlayMode) {
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

	public VALUE_REFERENCE(GameServerStatus gameServerStatus) {
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

	public VALUE_REFERENCE(GenderType genderType) {
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

	public VALUE_REFERENCE(GeoCircle geoCircle) {
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

	public VALUE_REFERENCE(GeoCoordinates geoCoordinates) {
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

	public VALUE_REFERENCE(GeoShape geoShape) {
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

	public VALUE_REFERENCE(InfectiousAgentClass infectiousAgentClass) {
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

	public VALUE_REFERENCE(InteractionCounter interactionCounter) {
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

	public VALUE_REFERENCE(ItemAvailability itemAvailability) {
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

	public VALUE_REFERENCE(ItemListOrderType itemListOrderType) {
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

	public VALUE_REFERENCE(LegalForceStatus legalForceStatus) {
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

	public VALUE_REFERENCE(LegalValueLevel legalValueLevel) {
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

	public VALUE_REFERENCE(LocationFeatureSpecification locationFeatureSpecification) {
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

	public VALUE_REFERENCE(LockerDelivery lockerDelivery) {
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

	public VALUE_REFERENCE(MapCategoryType mapCategoryType) {
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

	public VALUE_REFERENCE(MedicalAudience medicalAudience) {
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

	public VALUE_REFERENCE(MedicalDevicePurpose medicalDevicePurpose) {
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

	public VALUE_REFERENCE(MedicalEnumeration medicalEnumeration) {
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

	public VALUE_REFERENCE(MedicalEvidenceLevel medicalEvidenceLevel) {
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

	public VALUE_REFERENCE(MedicalImagingTechnique medicalImagingTechnique) {
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

	public VALUE_REFERENCE(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
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

	public VALUE_REFERENCE(MedicalProcedureType medicalProcedureType) {
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

	public VALUE_REFERENCE(MedicalSpecialty medicalSpecialty) {
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

	public VALUE_REFERENCE(MedicalStudyStatus medicalStudyStatus) {
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

	public VALUE_REFERENCE(MedicalTrialDesign medicalTrialDesign) {
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

	public VALUE_REFERENCE(MedicineSystem medicineSystem) {
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

	public VALUE_REFERENCE(MonetaryAmount monetaryAmount) {
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

	public VALUE_REFERENCE(MonetaryAmountDistribution monetaryAmountDistribution) {
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

	public VALUE_REFERENCE(MusicAlbumProductionType musicAlbumProductionType) {
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

	public VALUE_REFERENCE(MusicAlbumReleaseType musicAlbumReleaseType) {
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

	public VALUE_REFERENCE(MusicReleaseFormatType musicReleaseFormatType) {
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

	public VALUE_REFERENCE(NutritionInformation nutritionInformation) {
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

	public VALUE_REFERENCE(OfferItemCondition offerItemCondition) {
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

	public VALUE_REFERENCE(OpeningHoursSpecification openingHoursSpecification) {
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

	public VALUE_REFERENCE(OrderStatus orderStatus) {
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

	public VALUE_REFERENCE(OwnershipInfo ownershipInfo) {
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

	public VALUE_REFERENCE(ParcelService parcelService) {
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

	public VALUE_REFERENCE(Patient patient) {
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

	public VALUE_REFERENCE(PaymentCard paymentCard) {
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

	public VALUE_REFERENCE(PaymentChargeSpecification paymentChargeSpecification) {
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

	public VALUE_REFERENCE(PaymentMethod paymentMethod) {
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

	public VALUE_REFERENCE(PaymentStatusType paymentStatusType) {
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

	public VALUE_REFERENCE(PhysicalActivityCategory physicalActivityCategory) {
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

	public VALUE_REFERENCE(PhysicalExam physicalExam) {
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

	public VALUE_REFERENCE(PostalAddress postalAddress) {
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

	public VALUE_REFERENCE(PriceSpecification priceSpecification) {
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

	public VALUE_REFERENCE(PropertyValue propertyValue) {
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

	public VALUE_REFERENCE(QualitativeValue qualitativeValue) {
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

	public VALUE_REFERENCE(QuantitativeValue quantitativeValue) {
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

	public VALUE_REFERENCE(QuantitativeValueDistribution quantitativeValueDistribution) {
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

	public VALUE_REFERENCE(RepaymentSpecification repaymentSpecification) {
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

	public VALUE_REFERENCE(ReservationStatusType reservationStatusType) {
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

	public VALUE_REFERENCE(RestrictedDiet restrictedDiet) {
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

	public VALUE_REFERENCE(RsvpResponseType rsvpResponseType) {
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

	public VALUE_REFERENCE(Specialty specialty) {
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

	public VALUE_REFERENCE(SteeringPositionValue steeringPositionValue) {
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

	public VALUE_REFERENCE(StructuredValue structuredValue) {
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

	public VALUE_REFERENCE(TypeAndQuantityNode typeAndQuantityNode) {
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

	public VALUE_REFERENCE(UnitPriceSpecification unitPriceSpecification) {
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

	public VALUE_REFERENCE(WarrantyPromise warrantyPromise) {
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

	public VALUE_REFERENCE(WarrantyScope warrantyScope) {
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

	public void copy(Container.ValueReference org) {
		setActionStatusTypeList(org.getActionStatusTypeList());
		setBedTypeList(org.getBedTypeList());
		setBoardingPolicyTypeList(org.getBoardingPolicyTypeList());
		setBookFormatTypeList(org.getBookFormatTypeList());
		setBusinessEntityTypeList(org.getBusinessEntityTypeList());
		setBusinessFunctionList(org.getBusinessFunctionList());
		setCarUsageTypeList(org.getCarUsageTypeList());
		setCompoundPriceSpecificationList(org.getCompoundPriceSpecificationList());
		setContactPointList(org.getContactPointList());
		setContactPointOptionList(org.getContactPointOptionList());
		setCreditCardList(org.getCreditCardList());
		setDayOfWeekList(org.getDayOfWeekList());
		setDeliveryChargeSpecificationList(org.getDeliveryChargeSpecificationList());
		setDeliveryMethodList(org.getDeliveryMethodList());
		setDigitalDocumentPermissionTypeList(org.getDigitalDocumentPermissionTypeList());
		setDriveWheelConfigurationValueList(org.getDriveWheelConfigurationValueList());
		setDrugClassList(org.getDrugClassList());
		setDrugCostList(org.getDrugCostList());
		setDrugCostCategoryList(org.getDrugCostCategoryList());
		setDrugPregnancyCategoryList(org.getDrugPregnancyCategoryList());
		setDrugPrescriptionStatusList(org.getDrugPrescriptionStatusList());
		setEngineSpecificationList(org.getEngineSpecificationList());
		setEnumerationList(org.getEnumerationList());
		setEventStatusTypeList(org.getEventStatusTypeList());
		setExchangeRateSpecificationList(org.getExchangeRateSpecificationList());
		setGamePlayModeList(org.getGamePlayModeList());
		setGameServerStatusList(org.getGameServerStatusList());
		setGenderTypeList(org.getGenderTypeList());
		setGeoCircleList(org.getGeoCircleList());
		setGeoCoordinatesList(org.getGeoCoordinatesList());
		setGeoShapeList(org.getGeoShapeList());
		setInfectiousAgentClassList(org.getInfectiousAgentClassList());
		setInteractionCounterList(org.getInteractionCounterList());
		setItemAvailabilityList(org.getItemAvailabilityList());
		setItemListOrderTypeList(org.getItemListOrderTypeList());
		setLegalForceStatusList(org.getLegalForceStatusList());
		setLegalValueLevelList(org.getLegalValueLevelList());
		setLocationFeatureSpecificationList(org.getLocationFeatureSpecificationList());
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
		setMonetaryAmountList(org.getMonetaryAmountList());
		setMonetaryAmountDistributionList(org.getMonetaryAmountDistributionList());
		setMusicAlbumProductionTypeList(org.getMusicAlbumProductionTypeList());
		setMusicAlbumReleaseTypeList(org.getMusicAlbumReleaseTypeList());
		setMusicReleaseFormatTypeList(org.getMusicReleaseFormatTypeList());
		setNutritionInformationList(org.getNutritionInformationList());
		setOfferItemConditionList(org.getOfferItemConditionList());
		setOpeningHoursSpecificationList(org.getOpeningHoursSpecificationList());
		setOrderStatusList(org.getOrderStatusList());
		setOwnershipInfoList(org.getOwnershipInfoList());
		setParcelServiceList(org.getParcelServiceList());
		setPatientList(org.getPatientList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentChargeSpecificationList(org.getPaymentChargeSpecificationList());
		setPaymentMethodList(org.getPaymentMethodList());
		setPaymentStatusTypeList(org.getPaymentStatusTypeList());
		setPhysicalActivityCategoryList(org.getPhysicalActivityCategoryList());
		setPhysicalExamList(org.getPhysicalExamList());
		setPostalAddressList(org.getPostalAddressList());
		setPriceSpecificationList(org.getPriceSpecificationList());
		setPropertyValueList(org.getPropertyValueList());
		setQualitativeValueList(org.getQualitativeValueList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setQuantitativeValueDistributionList(org.getQuantitativeValueDistributionList());
		setRepaymentSpecificationList(org.getRepaymentSpecificationList());
		setReservationStatusTypeList(org.getReservationStatusTypeList());
		setRestrictedDietList(org.getRestrictedDietList());
		setRsvpResponseTypeList(org.getRsvpResponseTypeList());
		setSpecialtyList(org.getSpecialtyList());
		setSteeringPositionValueList(org.getSteeringPositionValueList());
		setStructuredValueList(org.getStructuredValueList());
		setTypeAndQuantityNodeList(org.getTypeAndQuantityNodeList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
		setWarrantyPromiseList(org.getWarrantyPromiseList());
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
