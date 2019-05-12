package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MortgageLoan;

public class ACCEPTED_PAYMENT_METHOD implements Container.AcceptedPaymentMethod {

	private static final long serialVersionUID = 1L;

	public List<CreditCard> creditCardList;
	public List<LoanOrCredit> loanOrCreditList;
	public List<MortgageLoan> mortgageLoanList;
	public List<PaymentCard> paymentCardList;
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

	public ACCEPTED_PAYMENT_METHOD(CreditCard creditCard) {
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

	public ACCEPTED_PAYMENT_METHOD(MortgageLoan mortgageLoan) {
		mortgageLoanList = new ArrayList<MortgageLoan>();
		mortgageLoanList.add(mortgageLoan);
	}

	@Override
	public MortgageLoan getMortgageLoan() {
		if(mortgageLoanList != null && mortgageLoanList.size() > 0) {
			return mortgageLoanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMortgageLoan(MortgageLoan mortgageLoan) {
		if(mortgageLoanList == null) {
			mortgageLoanList = new ArrayList<>();
		}
		if(mortgageLoanList.size() == 0) {
			mortgageLoanList.add(mortgageLoan);
		} else {
			mortgageLoanList.set(0, mortgageLoan);
		}
	}

	@Override
	public List<MortgageLoan> getMortgageLoanList() {
		return mortgageLoanList;
	}

	@Override
	public void setMortgageLoanList(List<MortgageLoan> mortgageLoanList) {
		this.mortgageLoanList = mortgageLoanList;
	}

	@Override
	public boolean hasMortgageLoan() {
		return mortgageLoanList != null && mortgageLoanList.size() > 0 && mortgageLoanList.get(0) != null;
	}

	public ACCEPTED_PAYMENT_METHOD(PaymentCard paymentCard) {
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

	public ACCEPTED_PAYMENT_METHOD(List<CreditCard> creditCardList,
			List<LoanOrCredit> loanOrCreditList,
			List<MortgageLoan> mortgageLoanList,
			List<PaymentCard> paymentCardList,
			List<PaymentMethod> paymentMethodList) {
		setCreditCardList(creditCardList);
		setLoanOrCreditList(loanOrCreditList);
		setMortgageLoanList(mortgageLoanList);
		setPaymentCardList(paymentCardList);
		setPaymentMethodList(paymentMethodList);
	}

	public void copy(Container.AcceptedPaymentMethod org) {
		setCreditCardList(org.getCreditCardList());
		setLoanOrCreditList(org.getLoanOrCreditList());
		setMortgageLoanList(org.getMortgageLoanList());
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
