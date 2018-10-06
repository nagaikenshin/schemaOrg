package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.Float;
import org.kyojo.schemaorg.m3n4.core.Clazz.Integer;
import org.kyojo.schemaorg.m3n4.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Number;

public class BASE_SALARY implements Container.BaseSalary {

	private static final long serialVersionUID = 1L;

	public List<CompoundPriceSpecification> compoundPriceSpecificationList;
	public List<DeliveryChargeSpecification> deliveryChargeSpecificationList;
	public List<Float> fl0atList;
	public List<Integer> integerList;
	public List<MonetaryAmount> monetaryAmountList;
	public List<Number> numberList;
	public List<PaymentChargeSpecification> paymentChargeSpecificationList;
	public List<PriceSpecification> priceSpecificationList;
	public List<UnitPriceSpecification> unitPriceSpecificationList;

	public BASE_SALARY() {
	}

	public BASE_SALARY(CompoundPriceSpecification compoundPriceSpecification) {
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

	public BASE_SALARY(DeliveryChargeSpecification deliveryChargeSpecification) {
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

	public BASE_SALARY(Double d0uble) {
		this(new FLOAT(d0uble));
	}

	public BASE_SALARY(Float fl0at) {
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

	public BASE_SALARY(Long l0ng) {
		this(new INTEGER(l0ng));
	}

	public BASE_SALARY(Integer integer) {
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

	public BASE_SALARY(MonetaryAmount monetaryAmount) {
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

	public BASE_SALARY(java.math.BigDecimal number) {
		this(new NUMBER(number));
	}

	public BASE_SALARY(Number number) {
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

	public BASE_SALARY(PaymentChargeSpecification paymentChargeSpecification) {
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

	public BASE_SALARY(PriceSpecification priceSpecification) {
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

	public BASE_SALARY(UnitPriceSpecification unitPriceSpecification) {
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

	public BASE_SALARY(List<CompoundPriceSpecification> compoundPriceSpecificationList,
			List<DeliveryChargeSpecification> deliveryChargeSpecificationList,
			List<Float> fl0atList,
			List<Integer> integerList,
			List<MonetaryAmount> monetaryAmountList,
			List<Number> numberList,
			List<PaymentChargeSpecification> paymentChargeSpecificationList,
			List<PriceSpecification> priceSpecificationList,
			List<UnitPriceSpecification> unitPriceSpecificationList) {
		setCompoundPriceSpecificationList(compoundPriceSpecificationList);
		setDeliveryChargeSpecificationList(deliveryChargeSpecificationList);
		setFl0atList(fl0atList);
		setIntegerList(integerList);
		setMonetaryAmountList(monetaryAmountList);
		setNumberList(numberList);
		setPaymentChargeSpecificationList(paymentChargeSpecificationList);
		setPriceSpecificationList(priceSpecificationList);
		setUnitPriceSpecificationList(unitPriceSpecificationList);
	}

	public void copy(Container.BaseSalary org) {
		setCompoundPriceSpecificationList(org.getCompoundPriceSpecificationList());
		setDeliveryChargeSpecificationList(org.getDeliveryChargeSpecificationList());
		setFl0atList(org.getFl0atList());
		setIntegerList(org.getIntegerList());
		setMonetaryAmountList(org.getMonetaryAmountList());
		setNumberList(org.getNumberList());
		setPaymentChargeSpecificationList(org.getPaymentChargeSpecificationList());
		setPriceSpecificationList(org.getPriceSpecificationList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
	}

	@Override
	public java.math.BigDecimal getNativeValue() {
		if(getNumber() == null) return null;
		return getNumber().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
