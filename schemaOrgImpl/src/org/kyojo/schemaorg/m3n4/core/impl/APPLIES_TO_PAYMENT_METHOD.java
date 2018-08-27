package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class APPLIES_TO_PAYMENT_METHOD implements Container.AppliesToPaymentMethod {

	private static final long serialVersionUID = 1L;

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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
