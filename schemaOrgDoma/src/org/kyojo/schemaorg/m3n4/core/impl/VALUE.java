package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPoint;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.EngineSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.Float;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoCircle;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoCoordinates;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.InteractionCounter;
import org.kyojo.schemaorg.m3n4.core.Clazz.LocationFeatureSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n4.core.Clazz.NutritionInformation;
import org.kyojo.schemaorg.m3n4.core.Clazz.OpeningHoursSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.OwnershipInfo;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n4.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PropertyValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.StructuredValue;
import org.kyojo.schemaorg.m3n4.core.Clazz.TypeAndQuantityNode;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.WarrantyPromise;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ExchangeRateSpecification;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MonetaryAmountDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.QuantitativeValueDistribution;
import org.kyojo.schemaorg.m3n4.pending.Clazz.RepaymentSpecification;

import org.seasar.doma.Transient;

public class VALUE implements Container.Value {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Boolean> b00leanList;
	@Transient
	public List<CompoundPriceSpecification> compoundPriceSpecificationList;
	@Transient
	public List<ContactPoint> contactPointList;
	@Transient
	public List<DeliveryChargeSpecification> deliveryChargeSpecificationList;
	@Transient
	public List<EngineSpecification> engineSpecificationList;
	@Transient
	public List<ExchangeRateSpecification> exchangeRateSpecificationList;
	@Transient
	public List<Float> fl0atList;
	@Transient
	public List<GeoCircle> geoCircleList;
	@Transient
	public List<GeoCoordinates> geoCoordinatesList;
	@Transient
	public List<GeoShape> geoShapeList;
	@Transient
	public List<Integer> integerList;
	@Transient
	public List<InteractionCounter> interactionCounterList;
	@Transient
	public List<LocationFeatureSpecification> locationFeatureSpecificationList;
	@Transient
	public List<MonetaryAmount> monetaryAmountList;
	@Transient
	public List<MonetaryAmountDistribution> monetaryAmountDistributionList;
	@Transient
	public List<Number> numberList;
	@Transient
	public List<NutritionInformation> nutritionInformationList;
	@Transient
	public List<OpeningHoursSpecification> openingHoursSpecificationList;
	@Transient
	public List<OwnershipInfo> ownershipInfoList;
	@Transient
	public List<PaymentChargeSpecification> paymentChargeSpecificationList;
	@Transient
	public List<PostalAddress> postalAddressList;
	@Transient
	public List<PriceSpecification> priceSpecificationList;
	@Transient
	public List<PropertyValue> propertyValueList;
	@Transient
	public List<QuantitativeValue> quantitativeValueList;
	@Transient
	public List<QuantitativeValueDistribution> quantitativeValueDistributionList;
	@Transient
	public List<RepaymentSpecification> repaymentSpecificationList;
	@Transient
	public List<StructuredValue> structuredValueList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<TypeAndQuantityNode> typeAndQuantityNodeList;
	@Transient
	public List<UnitPriceSpecification> unitPriceSpecificationList;
	@Transient
	public List<WarrantyPromise> warrantyPromiseList;

	public VALUE() {
	}

	public VALUE(java.lang.Boolean b00lean) {
		this(new BOOLEAN(b00lean));
	}

	public VALUE(Boolean b00lean) {
		b00leanList = new ArrayList<Boolean>();
		b00leanList.add(b00lean);
	}

	@Override
	public Boolean getB00lean() {
		if(b00leanList != null && b00leanList.size() > 0) {
			return b00leanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setB00lean(Boolean b00lean) {
		if(b00leanList == null) {
			b00leanList = new ArrayList<>();
		}
		if(b00leanList.size() == 0) {
			b00leanList.add(b00lean);
		} else {
			b00leanList.set(0, b00lean);
		}
	}

	@Override
	public List<Boolean> getB00leanList() {
		return b00leanList;
	}

	@Override
	public void setB00leanList(List<Boolean> b00leanList) {
		this.b00leanList = b00leanList;
	}

	@Override
	public boolean hasB00lean() {
		return b00leanList != null && b00leanList.size() > 0 && b00leanList.get(0) != null;
	}

	public VALUE(CompoundPriceSpecification compoundPriceSpecification) {
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

	public VALUE(ContactPoint contactPoint) {
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

	public VALUE(DeliveryChargeSpecification deliveryChargeSpecification) {
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

	public VALUE(EngineSpecification engineSpecification) {
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

	public VALUE(ExchangeRateSpecification exchangeRateSpecification) {
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

	public VALUE(Double d0uble) {
		this(new FLOAT(d0uble));
	}

	public VALUE(Float fl0at) {
		fl0atList = new ArrayList<Float>();
		fl0atList.add(fl0at);
	}

	@Override
	public Float getFl0at() {
		if(fl0atList != null && fl0atList.size() > 0) {
			return fl0atList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFl0at(Float fl0at) {
		if(fl0atList == null) {
			fl0atList = new ArrayList<>();
		}
		if(fl0atList.size() == 0) {
			fl0atList.add(fl0at);
		} else {
			fl0atList.set(0, fl0at);
		}
	}

	@Override
	public List<Float> getFl0atList() {
		return fl0atList;
	}

	@Override
	public void setFl0atList(List<Float> fl0atList) {
		this.fl0atList = fl0atList;
	}

	@Override
	public boolean hasFl0at() {
		return fl0atList != null && fl0atList.size() > 0 && fl0atList.get(0) != null;
	}

	public VALUE(GeoCircle geoCircle) {
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

	public VALUE(GeoCoordinates geoCoordinates) {
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

	public VALUE(GeoShape geoShape) {
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

	public VALUE(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public VALUE(Integer integer) {
		integerList = new ArrayList<Integer>();
		integerList.add(integer);
	}

	@Override
	public Integer getInteger() {
		if(integerList != null && integerList.size() > 0) {
			return integerList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteger(Integer integer) {
		if(integerList == null) {
			integerList = new ArrayList<>();
		}
		if(integerList.size() == 0) {
			integerList.add(integer);
		} else {
			integerList.set(0, integer);
		}
	}

	@Override
	public List<Integer> getIntegerList() {
		return integerList;
	}

	@Override
	public void setIntegerList(List<Integer> integerList) {
		this.integerList = integerList;
	}

	@Override
	public boolean hasInteger() {
		return integerList != null && integerList.size() > 0 && integerList.get(0) != null;
	}

	public VALUE(InteractionCounter interactionCounter) {
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

	public VALUE(LocationFeatureSpecification locationFeatureSpecification) {
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

	public VALUE(MonetaryAmount monetaryAmount) {
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

	public VALUE(MonetaryAmountDistribution monetaryAmountDistribution) {
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

	public VALUE(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public VALUE(Number number) {
		numberList = new ArrayList<Number>();
		numberList.add(number);
	}

	@Override
	public Number getNumber() {
		if(numberList != null && numberList.size() > 0) {
			return numberList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNumber(Number number) {
		if(numberList == null) {
			numberList = new ArrayList<>();
		}
		if(numberList.size() == 0) {
			numberList.add(number);
		} else {
			numberList.set(0, number);
		}
	}

	@Override
	public List<Number> getNumberList() {
		return numberList;
	}

	@Override
	public void setNumberList(List<Number> numberList) {
		this.numberList = numberList;
	}

	@Override
	public boolean hasNumber() {
		return numberList != null && numberList.size() > 0 && numberList.get(0) != null;
	}

	public VALUE(NutritionInformation nutritionInformation) {
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

	public VALUE(OpeningHoursSpecification openingHoursSpecification) {
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

	public VALUE(OwnershipInfo ownershipInfo) {
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

	public VALUE(PaymentChargeSpecification paymentChargeSpecification) {
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

	public VALUE(PostalAddress postalAddress) {
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

	public VALUE(PriceSpecification priceSpecification) {
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

	public VALUE(PropertyValue propertyValue) {
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

	public VALUE(QuantitativeValue quantitativeValue) {
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

	public VALUE(QuantitativeValueDistribution quantitativeValueDistribution) {
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

	public VALUE(RepaymentSpecification repaymentSpecification) {
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

	public VALUE(StructuredValue structuredValue) {
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

	public VALUE(String string) {
		this(new TEXT(string));
	}

	public VALUE(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public VALUE(TypeAndQuantityNode typeAndQuantityNode) {
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

	public VALUE(UnitPriceSpecification unitPriceSpecification) {
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

	public VALUE(WarrantyPromise warrantyPromise) {
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

	public void copy(Container.Value org) {
		setB00leanList(org.getB00leanList());
		setCompoundPriceSpecificationList(org.getCompoundPriceSpecificationList());
		setContactPointList(org.getContactPointList());
		setDeliveryChargeSpecificationList(org.getDeliveryChargeSpecificationList());
		setEngineSpecificationList(org.getEngineSpecificationList());
		setExchangeRateSpecificationList(org.getExchangeRateSpecificationList());
		setFl0atList(org.getFl0atList());
		setGeoCircleList(org.getGeoCircleList());
		setGeoCoordinatesList(org.getGeoCoordinatesList());
		setGeoShapeList(org.getGeoShapeList());
		setIntegerList(org.getIntegerList());
		setInteractionCounterList(org.getInteractionCounterList());
		setLocationFeatureSpecificationList(org.getLocationFeatureSpecificationList());
		setMonetaryAmountList(org.getMonetaryAmountList());
		setMonetaryAmountDistributionList(org.getMonetaryAmountDistributionList());
		setNumberList(org.getNumberList());
		setNutritionInformationList(org.getNutritionInformationList());
		setOpeningHoursSpecificationList(org.getOpeningHoursSpecificationList());
		setOwnershipInfoList(org.getOwnershipInfoList());
		setPaymentChargeSpecificationList(org.getPaymentChargeSpecificationList());
		setPostalAddressList(org.getPostalAddressList());
		setPriceSpecificationList(org.getPriceSpecificationList());
		setPropertyValueList(org.getPropertyValueList());
		setQuantitativeValueList(org.getQuantitativeValueList());
		setQuantitativeValueDistributionList(org.getQuantitativeValueDistributionList());
		setRepaymentSpecificationList(org.getRepaymentSpecificationList());
		setStructuredValueList(org.getStructuredValueList());
		setTextList(org.getTextList());
		setTypeAndQuantityNodeList(org.getTypeAndQuantityNodeList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
		setWarrantyPromiseList(org.getWarrantyPromiseList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
