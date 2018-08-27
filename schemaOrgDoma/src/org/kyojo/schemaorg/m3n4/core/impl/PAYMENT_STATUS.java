package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentStatusType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

import org.seasar.doma.Transient;

public class PAYMENT_STATUS implements Container.PaymentStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<PaymentStatusType> paymentStatusTypeList;
	@Transient
	public List<Text> textList;

	public PAYMENT_STATUS() {
	}

	public PAYMENT_STATUS(PaymentStatusType paymentStatusType) {
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

	public PAYMENT_STATUS(String string) {
		this(new TEXT(string));
	}

	public PAYMENT_STATUS(Text text) {
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

	public PAYMENT_STATUS(List<PaymentStatusType> paymentStatusTypeList,
			List<Text> textList) {
		setPaymentStatusTypeList(paymentStatusTypeList);
		setTextList(textList);
	}

	public void copy(Container.PaymentStatus org) {
		setPaymentStatusTypeList(org.getPaymentStatusTypeList());
		setTextList(org.getTextList());
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
