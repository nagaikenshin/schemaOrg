package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class APPLIES_TO_PAYMENT_METHOD implements Container.AppliesToPaymentMethod {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CreditCard> creditCardList;
	@Transient
	public List<PaymentCard> paymentCardList;
	@Transient
	public List<PaymentMethod> paymentMethodList;

	public APPLIES_TO_PAYMENT_METHOD() {
	}

	public APPLIES_TO_PAYMENT_METHOD(String string) {
		this(new PAYMENT_METHOD(string));
	}

	public String getString() {
		if(paymentMethodList == null || paymentMethodList.size() == 0 || paymentMethodList.get(0) == null) {
			return null;
		} else {
			Name name = paymentMethodList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(paymentMethodList == null) {
			paymentMethodList = new ArrayList<PaymentMethod>();
		}
		if(paymentMethodList.size() == 0) {
			paymentMethodList.add(new PAYMENT_METHOD(string));
		} else {
			paymentMethodList.set(0, new PAYMENT_METHOD(string));
		}
	}

	public APPLIES_TO_PAYMENT_METHOD(CreditCard creditCard) {
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

	public APPLIES_TO_PAYMENT_METHOD(PaymentCard paymentCard) {
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

	public APPLIES_TO_PAYMENT_METHOD(PaymentMethod paymentMethod) {
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

	public APPLIES_TO_PAYMENT_METHOD(List<CreditCard> creditCardList,
			List<PaymentCard> paymentCardList,
			List<PaymentMethod> paymentMethodList) {
		setCreditCardList(creditCardList);
		setPaymentCardList(paymentCardList);
		setPaymentMethodList(paymentMethodList);
	}

	public void copy(Container.AppliesToPaymentMethod org) {
		setCreditCardList(org.getCreditCardList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentMethodList(org.getPaymentMethodList());
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
