package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.BankAccount;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastService;
import org.kyojo.schemaorg.m3n5.core.Clazz.CableOrSatelliteService;
import org.kyojo.schemaorg.m3n5.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.CurrencyConversionService;
import org.kyojo.schemaorg.m3n5.core.Clazz.DepositAccount;
import org.kyojo.schemaorg.m3n5.core.Clazz.FinancialProduct;
import org.kyojo.schemaorg.m3n5.core.Clazz.FoodService;
import org.kyojo.schemaorg.m3n5.core.Clazz.GovernmentService;
import org.kyojo.schemaorg.m3n5.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaorg.m3n5.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaymentService;
import org.kyojo.schemaorg.m3n5.core.Clazz.Service;
import org.kyojo.schemaorg.m3n5.core.Clazz.TaxiService;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.BrokerageAccount;
import org.kyojo.schemaorg.m3n5.pending.Clazz.InvestmentFund;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MortgageLoan;
import org.kyojo.schemaorg.m3n5.pending.Clazz.RadioBroadcastService;
import org.kyojo.schemaorg.m3n5.pending.Clazz.WebAPI;

public class ISSUED_THROUGH implements Container.IssuedThrough {

	private static final long serialVersionUID = 1L;

	public List<BankAccount> bankAccountList;
	public List<BroadcastService> broadcastServiceList;
	public List<BrokerageAccount> brokerageAccountList;
	public List<CableOrSatelliteService> cableOrSatelliteServiceList;
	public List<CreditCard> creditCardList;
	public List<CurrencyConversionService> currencyConversionServiceList;
	public List<DepositAccount> depositAccountList;
	public List<FinancialProduct> financialProductList;
	public List<FoodService> foodServiceList;
	public List<GovernmentService> governmentServiceList;
	public List<InvestmentFund> investmentFundList;
	public List<InvestmentOrDeposit> investmentOrDepositList;
	public List<LoanOrCredit> loanOrCreditList;
	public List<MortgageLoan> mortgageLoanList;
	public List<PaymentCard> paymentCardList;
	public List<PaymentService> paymentServiceList;
	public List<RadioBroadcastService> radioBroadcastServiceList;
	public List<Service> serviceList;
	public List<TaxiService> taxiServiceList;
	public List<WebAPI> webAPIList;

	public ISSUED_THROUGH() {
	}

	public ISSUED_THROUGH(String string) {
		this(new SERVICE(string));
	}

	public String getString() {
		if(serviceList == null || serviceList.size() == 0 || serviceList.get(0) == null) {
			return null;
		} else {
			Name name = serviceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(serviceList == null) {
			serviceList = new ArrayList<Service>();
		}
		if(serviceList.size() == 0) {
			serviceList.add(new SERVICE(string));
		} else {
			serviceList.set(0, new SERVICE(string));
		}
	}

	public ISSUED_THROUGH(BankAccount bankAccount) {
		bankAccountList = new ArrayList<BankAccount>();
		bankAccountList.add(bankAccount);
	}

	@Override
	public BankAccount getBankAccount() {
		if(bankAccountList != null && bankAccountList.size() > 0) {
			return bankAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBankAccount(BankAccount bankAccount) {
		if(bankAccountList == null) {
			bankAccountList = new ArrayList<>();
		}
		if(bankAccountList.size() == 0) {
			bankAccountList.add(bankAccount);
		} else {
			bankAccountList.set(0, bankAccount);
		}
	}

	@Override
	public List<BankAccount> getBankAccountList() {
		return bankAccountList;
	}

	@Override
	public void setBankAccountList(List<BankAccount> bankAccountList) {
		this.bankAccountList = bankAccountList;
	}

	@Override
	public boolean hasBankAccount() {
		return bankAccountList != null && bankAccountList.size() > 0 && bankAccountList.get(0) != null;
	}

	public ISSUED_THROUGH(BroadcastService broadcastService) {
		broadcastServiceList = new ArrayList<BroadcastService>();
		broadcastServiceList.add(broadcastService);
	}

	@Override
	public BroadcastService getBroadcastService() {
		if(broadcastServiceList != null && broadcastServiceList.size() > 0) {
			return broadcastServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastService(BroadcastService broadcastService) {
		if(broadcastServiceList == null) {
			broadcastServiceList = new ArrayList<>();
		}
		if(broadcastServiceList.size() == 0) {
			broadcastServiceList.add(broadcastService);
		} else {
			broadcastServiceList.set(0, broadcastService);
		}
	}

	@Override
	public List<BroadcastService> getBroadcastServiceList() {
		return broadcastServiceList;
	}

	@Override
	public void setBroadcastServiceList(List<BroadcastService> broadcastServiceList) {
		this.broadcastServiceList = broadcastServiceList;
	}

	@Override
	public boolean hasBroadcastService() {
		return broadcastServiceList != null && broadcastServiceList.size() > 0 && broadcastServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(BrokerageAccount brokerageAccount) {
		brokerageAccountList = new ArrayList<BrokerageAccount>();
		brokerageAccountList.add(brokerageAccount);
	}

	@Override
	public BrokerageAccount getBrokerageAccount() {
		if(brokerageAccountList != null && brokerageAccountList.size() > 0) {
			return brokerageAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrokerageAccount(BrokerageAccount brokerageAccount) {
		if(brokerageAccountList == null) {
			brokerageAccountList = new ArrayList<>();
		}
		if(brokerageAccountList.size() == 0) {
			brokerageAccountList.add(brokerageAccount);
		} else {
			brokerageAccountList.set(0, brokerageAccount);
		}
	}

	@Override
	public List<BrokerageAccount> getBrokerageAccountList() {
		return brokerageAccountList;
	}

	@Override
	public void setBrokerageAccountList(List<BrokerageAccount> brokerageAccountList) {
		this.brokerageAccountList = brokerageAccountList;
	}

	@Override
	public boolean hasBrokerageAccount() {
		return brokerageAccountList != null && brokerageAccountList.size() > 0 && brokerageAccountList.get(0) != null;
	}

	public ISSUED_THROUGH(CableOrSatelliteService cableOrSatelliteService) {
		cableOrSatelliteServiceList = new ArrayList<CableOrSatelliteService>();
		cableOrSatelliteServiceList.add(cableOrSatelliteService);
	}

	@Override
	public CableOrSatelliteService getCableOrSatelliteService() {
		if(cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0) {
			return cableOrSatelliteServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCableOrSatelliteService(CableOrSatelliteService cableOrSatelliteService) {
		if(cableOrSatelliteServiceList == null) {
			cableOrSatelliteServiceList = new ArrayList<>();
		}
		if(cableOrSatelliteServiceList.size() == 0) {
			cableOrSatelliteServiceList.add(cableOrSatelliteService);
		} else {
			cableOrSatelliteServiceList.set(0, cableOrSatelliteService);
		}
	}

	@Override
	public List<CableOrSatelliteService> getCableOrSatelliteServiceList() {
		return cableOrSatelliteServiceList;
	}

	@Override
	public void setCableOrSatelliteServiceList(List<CableOrSatelliteService> cableOrSatelliteServiceList) {
		this.cableOrSatelliteServiceList = cableOrSatelliteServiceList;
	}

	@Override
	public boolean hasCableOrSatelliteService() {
		return cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0 && cableOrSatelliteServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(CreditCard creditCard) {
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

	public ISSUED_THROUGH(CurrencyConversionService currencyConversionService) {
		currencyConversionServiceList = new ArrayList<CurrencyConversionService>();
		currencyConversionServiceList.add(currencyConversionService);
	}

	@Override
	public CurrencyConversionService getCurrencyConversionService() {
		if(currencyConversionServiceList != null && currencyConversionServiceList.size() > 0) {
			return currencyConversionServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCurrencyConversionService(CurrencyConversionService currencyConversionService) {
		if(currencyConversionServiceList == null) {
			currencyConversionServiceList = new ArrayList<>();
		}
		if(currencyConversionServiceList.size() == 0) {
			currencyConversionServiceList.add(currencyConversionService);
		} else {
			currencyConversionServiceList.set(0, currencyConversionService);
		}
	}

	@Override
	public List<CurrencyConversionService> getCurrencyConversionServiceList() {
		return currencyConversionServiceList;
	}

	@Override
	public void setCurrencyConversionServiceList(List<CurrencyConversionService> currencyConversionServiceList) {
		this.currencyConversionServiceList = currencyConversionServiceList;
	}

	@Override
	public boolean hasCurrencyConversionService() {
		return currencyConversionServiceList != null && currencyConversionServiceList.size() > 0 && currencyConversionServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(DepositAccount depositAccount) {
		depositAccountList = new ArrayList<DepositAccount>();
		depositAccountList.add(depositAccount);
	}

	@Override
	public DepositAccount getDepositAccount() {
		if(depositAccountList != null && depositAccountList.size() > 0) {
			return depositAccountList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDepositAccount(DepositAccount depositAccount) {
		if(depositAccountList == null) {
			depositAccountList = new ArrayList<>();
		}
		if(depositAccountList.size() == 0) {
			depositAccountList.add(depositAccount);
		} else {
			depositAccountList.set(0, depositAccount);
		}
	}

	@Override
	public List<DepositAccount> getDepositAccountList() {
		return depositAccountList;
	}

	@Override
	public void setDepositAccountList(List<DepositAccount> depositAccountList) {
		this.depositAccountList = depositAccountList;
	}

	@Override
	public boolean hasDepositAccount() {
		return depositAccountList != null && depositAccountList.size() > 0 && depositAccountList.get(0) != null;
	}

	public ISSUED_THROUGH(FinancialProduct financialProduct) {
		financialProductList = new ArrayList<FinancialProduct>();
		financialProductList.add(financialProduct);
	}

	@Override
	public FinancialProduct getFinancialProduct() {
		if(financialProductList != null && financialProductList.size() > 0) {
			return financialProductList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFinancialProduct(FinancialProduct financialProduct) {
		if(financialProductList == null) {
			financialProductList = new ArrayList<>();
		}
		if(financialProductList.size() == 0) {
			financialProductList.add(financialProduct);
		} else {
			financialProductList.set(0, financialProduct);
		}
	}

	@Override
	public List<FinancialProduct> getFinancialProductList() {
		return financialProductList;
	}

	@Override
	public void setFinancialProductList(List<FinancialProduct> financialProductList) {
		this.financialProductList = financialProductList;
	}

	@Override
	public boolean hasFinancialProduct() {
		return financialProductList != null && financialProductList.size() > 0 && financialProductList.get(0) != null;
	}

	public ISSUED_THROUGH(FoodService foodService) {
		foodServiceList = new ArrayList<FoodService>();
		foodServiceList.add(foodService);
	}

	@Override
	public FoodService getFoodService() {
		if(foodServiceList != null && foodServiceList.size() > 0) {
			return foodServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodService(FoodService foodService) {
		if(foodServiceList == null) {
			foodServiceList = new ArrayList<>();
		}
		if(foodServiceList.size() == 0) {
			foodServiceList.add(foodService);
		} else {
			foodServiceList.set(0, foodService);
		}
	}

	@Override
	public List<FoodService> getFoodServiceList() {
		return foodServiceList;
	}

	@Override
	public void setFoodServiceList(List<FoodService> foodServiceList) {
		this.foodServiceList = foodServiceList;
	}

	@Override
	public boolean hasFoodService() {
		return foodServiceList != null && foodServiceList.size() > 0 && foodServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(GovernmentService governmentService) {
		governmentServiceList = new ArrayList<GovernmentService>();
		governmentServiceList.add(governmentService);
	}

	@Override
	public GovernmentService getGovernmentService() {
		if(governmentServiceList != null && governmentServiceList.size() > 0) {
			return governmentServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGovernmentService(GovernmentService governmentService) {
		if(governmentServiceList == null) {
			governmentServiceList = new ArrayList<>();
		}
		if(governmentServiceList.size() == 0) {
			governmentServiceList.add(governmentService);
		} else {
			governmentServiceList.set(0, governmentService);
		}
	}

	@Override
	public List<GovernmentService> getGovernmentServiceList() {
		return governmentServiceList;
	}

	@Override
	public void setGovernmentServiceList(List<GovernmentService> governmentServiceList) {
		this.governmentServiceList = governmentServiceList;
	}

	@Override
	public boolean hasGovernmentService() {
		return governmentServiceList != null && governmentServiceList.size() > 0 && governmentServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(InvestmentFund investmentFund) {
		investmentFundList = new ArrayList<InvestmentFund>();
		investmentFundList.add(investmentFund);
	}

	@Override
	public InvestmentFund getInvestmentFund() {
		if(investmentFundList != null && investmentFundList.size() > 0) {
			return investmentFundList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvestmentFund(InvestmentFund investmentFund) {
		if(investmentFundList == null) {
			investmentFundList = new ArrayList<>();
		}
		if(investmentFundList.size() == 0) {
			investmentFundList.add(investmentFund);
		} else {
			investmentFundList.set(0, investmentFund);
		}
	}

	@Override
	public List<InvestmentFund> getInvestmentFundList() {
		return investmentFundList;
	}

	@Override
	public void setInvestmentFundList(List<InvestmentFund> investmentFundList) {
		this.investmentFundList = investmentFundList;
	}

	@Override
	public boolean hasInvestmentFund() {
		return investmentFundList != null && investmentFundList.size() > 0 && investmentFundList.get(0) != null;
	}

	public ISSUED_THROUGH(InvestmentOrDeposit investmentOrDeposit) {
		investmentOrDepositList = new ArrayList<InvestmentOrDeposit>();
		investmentOrDepositList.add(investmentOrDeposit);
	}

	@Override
	public InvestmentOrDeposit getInvestmentOrDeposit() {
		if(investmentOrDepositList != null && investmentOrDepositList.size() > 0) {
			return investmentOrDepositList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInvestmentOrDeposit(InvestmentOrDeposit investmentOrDeposit) {
		if(investmentOrDepositList == null) {
			investmentOrDepositList = new ArrayList<>();
		}
		if(investmentOrDepositList.size() == 0) {
			investmentOrDepositList.add(investmentOrDeposit);
		} else {
			investmentOrDepositList.set(0, investmentOrDeposit);
		}
	}

	@Override
	public List<InvestmentOrDeposit> getInvestmentOrDepositList() {
		return investmentOrDepositList;
	}

	@Override
	public void setInvestmentOrDepositList(List<InvestmentOrDeposit> investmentOrDepositList) {
		this.investmentOrDepositList = investmentOrDepositList;
	}

	@Override
	public boolean hasInvestmentOrDeposit() {
		return investmentOrDepositList != null && investmentOrDepositList.size() > 0 && investmentOrDepositList.get(0) != null;
	}

	public ISSUED_THROUGH(LoanOrCredit loanOrCredit) {
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

	public ISSUED_THROUGH(MortgageLoan mortgageLoan) {
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

	public ISSUED_THROUGH(PaymentCard paymentCard) {
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

	public ISSUED_THROUGH(PaymentService paymentService) {
		paymentServiceList = new ArrayList<PaymentService>();
		paymentServiceList.add(paymentService);
	}

	@Override
	public PaymentService getPaymentService() {
		if(paymentServiceList != null && paymentServiceList.size() > 0) {
			return paymentServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaymentService(PaymentService paymentService) {
		if(paymentServiceList == null) {
			paymentServiceList = new ArrayList<>();
		}
		if(paymentServiceList.size() == 0) {
			paymentServiceList.add(paymentService);
		} else {
			paymentServiceList.set(0, paymentService);
		}
	}

	@Override
	public List<PaymentService> getPaymentServiceList() {
		return paymentServiceList;
	}

	@Override
	public void setPaymentServiceList(List<PaymentService> paymentServiceList) {
		this.paymentServiceList = paymentServiceList;
	}

	@Override
	public boolean hasPaymentService() {
		return paymentServiceList != null && paymentServiceList.size() > 0 && paymentServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(RadioBroadcastService radioBroadcastService) {
		radioBroadcastServiceList = new ArrayList<RadioBroadcastService>();
		radioBroadcastServiceList.add(radioBroadcastService);
	}

	@Override
	public RadioBroadcastService getRadioBroadcastService() {
		if(radioBroadcastServiceList != null && radioBroadcastServiceList.size() > 0) {
			return radioBroadcastServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioBroadcastService(RadioBroadcastService radioBroadcastService) {
		if(radioBroadcastServiceList == null) {
			radioBroadcastServiceList = new ArrayList<>();
		}
		if(radioBroadcastServiceList.size() == 0) {
			radioBroadcastServiceList.add(radioBroadcastService);
		} else {
			radioBroadcastServiceList.set(0, radioBroadcastService);
		}
	}

	@Override
	public List<RadioBroadcastService> getRadioBroadcastServiceList() {
		return radioBroadcastServiceList;
	}

	@Override
	public void setRadioBroadcastServiceList(List<RadioBroadcastService> radioBroadcastServiceList) {
		this.radioBroadcastServiceList = radioBroadcastServiceList;
	}

	@Override
	public boolean hasRadioBroadcastService() {
		return radioBroadcastServiceList != null && radioBroadcastServiceList.size() > 0 && radioBroadcastServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(Service service) {
		serviceList = new ArrayList<Service>();
		serviceList.add(service);
	}

	@Override
	public Service getService() {
		if(serviceList != null && serviceList.size() > 0) {
			return serviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setService(Service service) {
		if(serviceList == null) {
			serviceList = new ArrayList<>();
		}
		if(serviceList.size() == 0) {
			serviceList.add(service);
		} else {
			serviceList.set(0, service);
		}
	}

	@Override
	public List<Service> getServiceList() {
		return serviceList;
	}

	@Override
	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	@Override
	public boolean hasService() {
		return serviceList != null && serviceList.size() > 0 && serviceList.get(0) != null;
	}

	public ISSUED_THROUGH(TaxiService taxiService) {
		taxiServiceList = new ArrayList<TaxiService>();
		taxiServiceList.add(taxiService);
	}

	@Override
	public TaxiService getTaxiService() {
		if(taxiServiceList != null && taxiServiceList.size() > 0) {
			return taxiServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTaxiService(TaxiService taxiService) {
		if(taxiServiceList == null) {
			taxiServiceList = new ArrayList<>();
		}
		if(taxiServiceList.size() == 0) {
			taxiServiceList.add(taxiService);
		} else {
			taxiServiceList.set(0, taxiService);
		}
	}

	@Override
	public List<TaxiService> getTaxiServiceList() {
		return taxiServiceList;
	}

	@Override
	public void setTaxiServiceList(List<TaxiService> taxiServiceList) {
		this.taxiServiceList = taxiServiceList;
	}

	@Override
	public boolean hasTaxiService() {
		return taxiServiceList != null && taxiServiceList.size() > 0 && taxiServiceList.get(0) != null;
	}

	public ISSUED_THROUGH(WebAPI webAPI) {
		webAPIList = new ArrayList<WebAPI>();
		webAPIList.add(webAPI);
	}

	@Override
	public WebAPI getWebAPI() {
		if(webAPIList != null && webAPIList.size() > 0) {
			return webAPIList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebAPI(WebAPI webAPI) {
		if(webAPIList == null) {
			webAPIList = new ArrayList<>();
		}
		if(webAPIList.size() == 0) {
			webAPIList.add(webAPI);
		} else {
			webAPIList.set(0, webAPI);
		}
	}

	@Override
	public List<WebAPI> getWebAPIList() {
		return webAPIList;
	}

	@Override
	public void setWebAPIList(List<WebAPI> webAPIList) {
		this.webAPIList = webAPIList;
	}

	@Override
	public boolean hasWebAPI() {
		return webAPIList != null && webAPIList.size() > 0 && webAPIList.get(0) != null;
	}

	public ISSUED_THROUGH(List<BankAccount> bankAccountList,
			List<BroadcastService> broadcastServiceList,
			List<BrokerageAccount> brokerageAccountList,
			List<CableOrSatelliteService> cableOrSatelliteServiceList,
			List<CreditCard> creditCardList,
			List<CurrencyConversionService> currencyConversionServiceList,
			List<DepositAccount> depositAccountList,
			List<FinancialProduct> financialProductList,
			List<FoodService> foodServiceList,
			List<GovernmentService> governmentServiceList,
			List<InvestmentFund> investmentFundList,
			List<InvestmentOrDeposit> investmentOrDepositList,
			List<LoanOrCredit> loanOrCreditList,
			List<MortgageLoan> mortgageLoanList,
			List<PaymentCard> paymentCardList,
			List<PaymentService> paymentServiceList,
			List<RadioBroadcastService> radioBroadcastServiceList,
			List<Service> serviceList,
			List<TaxiService> taxiServiceList,
			List<WebAPI> webAPIList) {
		setBankAccountList(bankAccountList);
		setBroadcastServiceList(broadcastServiceList);
		setBrokerageAccountList(brokerageAccountList);
		setCableOrSatelliteServiceList(cableOrSatelliteServiceList);
		setCreditCardList(creditCardList);
		setCurrencyConversionServiceList(currencyConversionServiceList);
		setDepositAccountList(depositAccountList);
		setFinancialProductList(financialProductList);
		setFoodServiceList(foodServiceList);
		setGovernmentServiceList(governmentServiceList);
		setInvestmentFundList(investmentFundList);
		setInvestmentOrDepositList(investmentOrDepositList);
		setLoanOrCreditList(loanOrCreditList);
		setMortgageLoanList(mortgageLoanList);
		setPaymentCardList(paymentCardList);
		setPaymentServiceList(paymentServiceList);
		setRadioBroadcastServiceList(radioBroadcastServiceList);
		setServiceList(serviceList);
		setTaxiServiceList(taxiServiceList);
		setWebAPIList(webAPIList);
	}

	public void copy(Container.IssuedThrough org) {
		setBankAccountList(org.getBankAccountList());
		setBroadcastServiceList(org.getBroadcastServiceList());
		setBrokerageAccountList(org.getBrokerageAccountList());
		setCableOrSatelliteServiceList(org.getCableOrSatelliteServiceList());
		setCreditCardList(org.getCreditCardList());
		setCurrencyConversionServiceList(org.getCurrencyConversionServiceList());
		setDepositAccountList(org.getDepositAccountList());
		setFinancialProductList(org.getFinancialProductList());
		setFoodServiceList(org.getFoodServiceList());
		setGovernmentServiceList(org.getGovernmentServiceList());
		setInvestmentFundList(org.getInvestmentFundList());
		setInvestmentOrDepositList(org.getInvestmentOrDepositList());
		setLoanOrCreditList(org.getLoanOrCreditList());
		setMortgageLoanList(org.getMortgageLoanList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentServiceList(org.getPaymentServiceList());
		setRadioBroadcastServiceList(org.getRadioBroadcastServiceList());
		setServiceList(org.getServiceList());
		setTaxiServiceList(org.getTaxiServiceList());
		setWebAPIList(org.getWebAPIList());
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
