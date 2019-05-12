package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.CompoundPriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryChargeSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.MonetaryAmount;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentChargeSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.PriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Clazz.UnitPriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class MINIMUM_PAYMENT_DUE implements Container.MinimumPaymentDue {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CompoundPriceSpecification> compoundPriceSpecificationList;
	@Transient
	public List<DeliveryChargeSpecification> deliveryChargeSpecificationList;
	@Transient
	public List<MonetaryAmount> monetaryAmountList;
	@Transient
	public List<PaymentChargeSpecification> paymentChargeSpecificationList;
	@Transient
	public List<PriceSpecification> priceSpecificationList;
	@Transient
	public List<UnitPriceSpecification> unitPriceSpecificationList;

	public MINIMUM_PAYMENT_DUE() {
	}

	public MINIMUM_PAYMENT_DUE(String string) {
		this(new MONETARY_AMOUNT(string));
	}

	public String getString() {
		if(monetaryAmountList == null || monetaryAmountList.size() == 0 || monetaryAmountList.get(0) == null) {
			return null;
		} else {
			Name name = monetaryAmountList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(monetaryAmountList == null) {
			monetaryAmountList = new ArrayList<MonetaryAmount>();
		}
		if(monetaryAmountList.size() == 0) {
			monetaryAmountList.add(new MONETARY_AMOUNT(string));
		} else {
			monetaryAmountList.set(0, new MONETARY_AMOUNT(string));
		}
	}

	public MINIMUM_PAYMENT_DUE(CompoundPriceSpecification compoundPriceSpecification) {
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

	public MINIMUM_PAYMENT_DUE(DeliveryChargeSpecification deliveryChargeSpecification) {
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

	public MINIMUM_PAYMENT_DUE(MonetaryAmount monetaryAmount) {
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

	public MINIMUM_PAYMENT_DUE(PaymentChargeSpecification paymentChargeSpecification) {
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

	public MINIMUM_PAYMENT_DUE(PriceSpecification priceSpecification) {
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

	public MINIMUM_PAYMENT_DUE(UnitPriceSpecification unitPriceSpecification) {
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

	public MINIMUM_PAYMENT_DUE(List<CompoundPriceSpecification> compoundPriceSpecificationList,
			List<DeliveryChargeSpecification> deliveryChargeSpecificationList,
			List<MonetaryAmount> monetaryAmountList,
			List<PaymentChargeSpecification> paymentChargeSpecificationList,
			List<PriceSpecification> priceSpecificationList,
			List<UnitPriceSpecification> unitPriceSpecificationList) {
		setCompoundPriceSpecificationList(compoundPriceSpecificationList);
		setDeliveryChargeSpecificationList(deliveryChargeSpecificationList);
		setMonetaryAmountList(monetaryAmountList);
		setPaymentChargeSpecificationList(paymentChargeSpecificationList);
		setPriceSpecificationList(priceSpecificationList);
		setUnitPriceSpecificationList(unitPriceSpecificationList);
	}

	public void copy(Container.MinimumPaymentDue org) {
		setCompoundPriceSpecificationList(org.getCompoundPriceSpecificationList());
		setDeliveryChargeSpecificationList(org.getDeliveryChargeSpecificationList());
		setMonetaryAmountList(org.getMonetaryAmountList());
		setPaymentChargeSpecificationList(org.getPaymentChargeSpecificationList());
		setPriceSpecificationList(org.getPriceSpecificationList());
		setUnitPriceSpecificationList(org.getUnitPriceSpecificationList());
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
