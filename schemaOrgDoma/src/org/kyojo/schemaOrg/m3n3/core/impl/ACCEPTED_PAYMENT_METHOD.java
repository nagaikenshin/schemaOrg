package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n3.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class ACCEPTED_PAYMENT_METHOD implements Container.AcceptedPaymentMethod {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<LoanOrCredit> loanOrCreditList;
	@Transient
	public List<PaymentMethod> paymentMethodList;

	public ACCEPTED_PAYMENT_METHOD() {
	}

	public ACCEPTED_PAYMENT_METHOD(String string) {
		this(new LOAN_OR_CREDIT(string));
	}

	public String getString() {
		if(loanOrCreditList == null || loanOrCreditList.size() == 0 || loanOrCreditList.get(0) == null) {
			return null;
		} else {
			Name name = loanOrCreditList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(loanOrCreditList == null) {
			loanOrCreditList = new ArrayList<LoanOrCredit>();
		}
		if(loanOrCreditList.size() == 0) {
			loanOrCreditList.add(new LOAN_OR_CREDIT(string));
		} else {
			loanOrCreditList.set(0, new LOAN_OR_CREDIT(string));
		}
	}

	public ACCEPTED_PAYMENT_METHOD(LoanOrCredit loanOrCredit) {
		loanOrCreditList = new ArrayList<LoanOrCredit>();
		loanOrCreditList.add(loanOrCredit);
	}

	@Override
	public LoanOrCredit getLoanOrCredit() {
		if(loanOrCreditList != null && loanOrCreditList.size() > 0) {
			return loanOrCreditList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLoanOrCredit(LoanOrCredit loanOrCredit) {
		if(loanOrCreditList == null) {
			loanOrCreditList = new ArrayList<>();
		}
		if(loanOrCreditList.size() == 0) {
			loanOrCreditList.add(loanOrCredit);
		} else {
			loanOrCreditList.set(0, loanOrCredit);
		}
	}

	@Override
	public List<LoanOrCredit> getLoanOrCreditList() {
		return loanOrCreditList;
	}

	@Override
	public void setLoanOrCreditList(List<LoanOrCredit> loanOrCreditList) {
		this.loanOrCreditList = loanOrCreditList;
	}

	@Override
	public boolean hasLoanOrCredit() {
		return loanOrCreditList != null && loanOrCreditList.size() > 0 && loanOrCreditList.get(0) != null;
	}

	public ACCEPTED_PAYMENT_METHOD(PaymentMethod paymentMethod) {
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

	public ACCEPTED_PAYMENT_METHOD(List<LoanOrCredit> loanOrCreditList,
			List<PaymentMethod> paymentMethodList) {
		setLoanOrCreditList(loanOrCreditList);
		setPaymentMethodList(paymentMethodList);
	}

	public void copy(Container.AcceptedPaymentMethod org) {
		setLoanOrCreditList(org.getLoanOrCreditList());
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
