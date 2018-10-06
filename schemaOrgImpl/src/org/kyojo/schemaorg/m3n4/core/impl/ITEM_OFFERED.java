package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.auto.Clazz.BusOrCoach;
import org.kyojo.schemaorg.m3n4.auto.Clazz.Motorcycle;
import org.kyojo.schemaorg.m3n4.auto.Clazz.MotorizedBicycle;
import org.kyojo.schemaorg.m3n4.core.Clazz.BankAccount;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastService;
import org.kyojo.schemaorg.m3n4.core.Clazz.CableOrSatelliteService;
import org.kyojo.schemaorg.m3n4.core.Clazz.Car;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreditCard;
import org.kyojo.schemaorg.m3n4.core.Clazz.CurrencyConversionService;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepositAccount;
import org.kyojo.schemaorg.m3n4.core.Clazz.FinancialProduct;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodService;
import org.kyojo.schemaorg.m3n4.core.Clazz.GovernmentService;
import org.kyojo.schemaorg.m3n4.core.Clazz.IndividualProduct;
import org.kyojo.schemaorg.m3n4.core.Clazz.InvestmentOrDeposit;
import org.kyojo.schemaorg.m3n4.core.Clazz.LoanOrCredit;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentCard;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentService;
import org.kyojo.schemaorg.m3n4.core.Clazz.Product;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProductModel;
import org.kyojo.schemaorg.m3n4.core.Clazz.Service;
import org.kyojo.schemaorg.m3n4.core.Clazz.SomeProducts;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiService;
import org.kyojo.schemaorg.m3n4.core.Clazz.Vehicle;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BrokerageAccount;
import org.kyojo.schemaorg.m3n4.pending.Clazz.InvestmentFund;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MortgageLoan;
import org.kyojo.schemaorg.m3n4.pending.Clazz.WebAPI;

public class ITEM_OFFERED implements Container.ItemOffered {

	private static final long serialVersionUID = 1L;

	public List<BankAccount> bankAccountList;
	public List<BroadcastService> broadcastServiceList;
	public List<BrokerageAccount> brokerageAccountList;
	public List<BusOrCoach> busOrCoachList;
	public List<CableOrSatelliteService> cableOrSatelliteServiceList;
	public List<Car> carList;
	public List<CreditCard> creditCardList;
	public List<CurrencyConversionService> currencyConversionServiceList;
	public List<DepositAccount> depositAccountList;
	public List<FinancialProduct> financialProductList;
	public List<FoodService> foodServiceList;
	public List<GovernmentService> governmentServiceList;
	public List<IndividualProduct> individualProductList;
	public List<InvestmentFund> investmentFundList;
	public List<InvestmentOrDeposit> investmentOrDepositList;
	public List<LoanOrCredit> loanOrCreditList;
	public List<MortgageLoan> mortgageLoanList;
	public List<Motorcycle> motorcycleList;
	public List<MotorizedBicycle> motorizedBicycleList;
	public List<PaymentCard> paymentCardList;
	public List<PaymentService> paymentServiceList;
	public List<Product> productList;
	public List<ProductModel> productModelList;
	public List<Service> serviceList;
	public List<SomeProducts> someProductsList;
	public List<TaxiService> taxiServiceList;
	public List<Vehicle> vehicleList;
	public List<WebAPI> webAPIList;

	public ITEM_OFFERED() {
	}

	public ITEM_OFFERED(String string) {
		this(new PRODUCT(string));
	}

	public String getString() {
		if(productList == null || productList.size() == 0 || productList.get(0) == null) {
			return null;
		} else {
			Name name = productList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(productList == null) {
			productList = new ArrayList<Product>();
		}
		if(productList.size() == 0) {
			productList.add(new PRODUCT(string));
		} else {
			productList.set(0, new PRODUCT(string));
		}
	}

	public ITEM_OFFERED(BankAccount bankAccount) {
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

	public ITEM_OFFERED(BroadcastService broadcastService) {
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

	public ITEM_OFFERED(BrokerageAccount brokerageAccount) {
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

	public ITEM_OFFERED(BusOrCoach busOrCoach) {
		busOrCoachList = new ArrayList<BusOrCoach>();
		busOrCoachList.add(busOrCoach);
	}

	@Override
	public BusOrCoach getBusOrCoach() {
		if(busOrCoachList != null && busOrCoachList.size() > 0) {
			return busOrCoachList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusOrCoach(BusOrCoach busOrCoach) {
		if(busOrCoachList == null) {
			busOrCoachList = new ArrayList<>();
		}
		if(busOrCoachList.size() == 0) {
			busOrCoachList.add(busOrCoach);
		} else {
			busOrCoachList.set(0, busOrCoach);
		}
	}

	@Override
	public List<BusOrCoach> getBusOrCoachList() {
		return busOrCoachList;
	}

	@Override
	public void setBusOrCoachList(List<BusOrCoach> busOrCoachList) {
		this.busOrCoachList = busOrCoachList;
	}

	@Override
	public boolean hasBusOrCoach() {
		return busOrCoachList != null && busOrCoachList.size() > 0 && busOrCoachList.get(0) != null;
	}

	public ITEM_OFFERED(CableOrSatelliteService cableOrSatelliteService) {
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

	public ITEM_OFFERED(Car car) {
		carList = new ArrayList<Car>();
		carList.add(car);
	}

	@Override
	public Car getCar() {
		if(carList != null && carList.size() > 0) {
			return carList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCar(Car car) {
		if(carList == null) {
			carList = new ArrayList<>();
		}
		if(carList.size() == 0) {
			carList.add(car);
		} else {
			carList.set(0, car);
		}
	}

	@Override
	public List<Car> getCarList() {
		return carList;
	}

	@Override
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	@Override
	public boolean hasCar() {
		return carList != null && carList.size() > 0 && carList.get(0) != null;
	}

	public ITEM_OFFERED(CreditCard creditCard) {
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

	public ITEM_OFFERED(CurrencyConversionService currencyConversionService) {
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

	public ITEM_OFFERED(DepositAccount depositAccount) {
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

	public ITEM_OFFERED(FinancialProduct financialProduct) {
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

	public ITEM_OFFERED(FoodService foodService) {
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

	public ITEM_OFFERED(GovernmentService governmentService) {
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

	public ITEM_OFFERED(IndividualProduct individualProduct) {
		individualProductList = new ArrayList<IndividualProduct>();
		individualProductList.add(individualProduct);
	}

	@Override
	public IndividualProduct getIndividualProduct() {
		if(individualProductList != null && individualProductList.size() > 0) {
			return individualProductList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIndividualProduct(IndividualProduct individualProduct) {
		if(individualProductList == null) {
			individualProductList = new ArrayList<>();
		}
		if(individualProductList.size() == 0) {
			individualProductList.add(individualProduct);
		} else {
			individualProductList.set(0, individualProduct);
		}
	}

	@Override
	public List<IndividualProduct> getIndividualProductList() {
		return individualProductList;
	}

	@Override
	public void setIndividualProductList(List<IndividualProduct> individualProductList) {
		this.individualProductList = individualProductList;
	}

	@Override
	public boolean hasIndividualProduct() {
		return individualProductList != null && individualProductList.size() > 0 && individualProductList.get(0) != null;
	}

	public ITEM_OFFERED(InvestmentFund investmentFund) {
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

	public ITEM_OFFERED(InvestmentOrDeposit investmentOrDeposit) {
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

	public ITEM_OFFERED(LoanOrCredit loanOrCredit) {
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

	public ITEM_OFFERED(MortgageLoan mortgageLoan) {
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

	public ITEM_OFFERED(Motorcycle motorcycle) {
		motorcycleList = new ArrayList<Motorcycle>();
		motorcycleList.add(motorcycle);
	}

	@Override
	public Motorcycle getMotorcycle() {
		if(motorcycleList != null && motorcycleList.size() > 0) {
			return motorcycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorcycle(Motorcycle motorcycle) {
		if(motorcycleList == null) {
			motorcycleList = new ArrayList<>();
		}
		if(motorcycleList.size() == 0) {
			motorcycleList.add(motorcycle);
		} else {
			motorcycleList.set(0, motorcycle);
		}
	}

	@Override
	public List<Motorcycle> getMotorcycleList() {
		return motorcycleList;
	}

	@Override
	public void setMotorcycleList(List<Motorcycle> motorcycleList) {
		this.motorcycleList = motorcycleList;
	}

	@Override
	public boolean hasMotorcycle() {
		return motorcycleList != null && motorcycleList.size() > 0 && motorcycleList.get(0) != null;
	}

	public ITEM_OFFERED(MotorizedBicycle motorizedBicycle) {
		motorizedBicycleList = new ArrayList<MotorizedBicycle>();
		motorizedBicycleList.add(motorizedBicycle);
	}

	@Override
	public MotorizedBicycle getMotorizedBicycle() {
		if(motorizedBicycleList != null && motorizedBicycleList.size() > 0) {
			return motorizedBicycleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMotorizedBicycle(MotorizedBicycle motorizedBicycle) {
		if(motorizedBicycleList == null) {
			motorizedBicycleList = new ArrayList<>();
		}
		if(motorizedBicycleList.size() == 0) {
			motorizedBicycleList.add(motorizedBicycle);
		} else {
			motorizedBicycleList.set(0, motorizedBicycle);
		}
	}

	@Override
	public List<MotorizedBicycle> getMotorizedBicycleList() {
		return motorizedBicycleList;
	}

	@Override
	public void setMotorizedBicycleList(List<MotorizedBicycle> motorizedBicycleList) {
		this.motorizedBicycleList = motorizedBicycleList;
	}

	@Override
	public boolean hasMotorizedBicycle() {
		return motorizedBicycleList != null && motorizedBicycleList.size() > 0 && motorizedBicycleList.get(0) != null;
	}

	public ITEM_OFFERED(PaymentCard paymentCard) {
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

	public ITEM_OFFERED(PaymentService paymentService) {
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

	public ITEM_OFFERED(Product product) {
		productList = new ArrayList<Product>();
		productList.add(product);
	}

	@Override
	public Product getProduct() {
		if(productList != null && productList.size() > 0) {
			return productList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProduct(Product product) {
		if(productList == null) {
			productList = new ArrayList<>();
		}
		if(productList.size() == 0) {
			productList.add(product);
		} else {
			productList.set(0, product);
		}
	}

	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public boolean hasProduct() {
		return productList != null && productList.size() > 0 && productList.get(0) != null;
	}

	public ITEM_OFFERED(ProductModel productModel) {
		productModelList = new ArrayList<ProductModel>();
		productModelList.add(productModel);
	}

	@Override
	public ProductModel getProductModel() {
		if(productModelList != null && productModelList.size() > 0) {
			return productModelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProductModel(ProductModel productModel) {
		if(productModelList == null) {
			productModelList = new ArrayList<>();
		}
		if(productModelList.size() == 0) {
			productModelList.add(productModel);
		} else {
			productModelList.set(0, productModel);
		}
	}

	@Override
	public List<ProductModel> getProductModelList() {
		return productModelList;
	}

	@Override
	public void setProductModelList(List<ProductModel> productModelList) {
		this.productModelList = productModelList;
	}

	@Override
	public boolean hasProductModel() {
		return productModelList != null && productModelList.size() > 0 && productModelList.get(0) != null;
	}

	public ITEM_OFFERED(Service service) {
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

	public ITEM_OFFERED(SomeProducts someProducts) {
		someProductsList = new ArrayList<SomeProducts>();
		someProductsList.add(someProducts);
	}

	@Override
	public SomeProducts getSomeProducts() {
		if(someProductsList != null && someProductsList.size() > 0) {
			return someProductsList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSomeProducts(SomeProducts someProducts) {
		if(someProductsList == null) {
			someProductsList = new ArrayList<>();
		}
		if(someProductsList.size() == 0) {
			someProductsList.add(someProducts);
		} else {
			someProductsList.set(0, someProducts);
		}
	}

	@Override
	public List<SomeProducts> getSomeProductsList() {
		return someProductsList;
	}

	@Override
	public void setSomeProductsList(List<SomeProducts> someProductsList) {
		this.someProductsList = someProductsList;
	}

	@Override
	public boolean hasSomeProducts() {
		return someProductsList != null && someProductsList.size() > 0 && someProductsList.get(0) != null;
	}

	public ITEM_OFFERED(TaxiService taxiService) {
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

	public ITEM_OFFERED(Vehicle vehicle) {
		vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(vehicle);
	}

	@Override
	public Vehicle getVehicle() {
		if(vehicleList != null && vehicleList.size() > 0) {
			return vehicleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVehicle(Vehicle vehicle) {
		if(vehicleList == null) {
			vehicleList = new ArrayList<>();
		}
		if(vehicleList.size() == 0) {
			vehicleList.add(vehicle);
		} else {
			vehicleList.set(0, vehicle);
		}
	}

	@Override
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	@Override
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	@Override
	public boolean hasVehicle() {
		return vehicleList != null && vehicleList.size() > 0 && vehicleList.get(0) != null;
	}

	public ITEM_OFFERED(WebAPI webAPI) {
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

	public void copy(Container.ItemOffered org) {
		setBankAccountList(org.getBankAccountList());
		setBroadcastServiceList(org.getBroadcastServiceList());
		setBrokerageAccountList(org.getBrokerageAccountList());
		setBusOrCoachList(org.getBusOrCoachList());
		setCableOrSatelliteServiceList(org.getCableOrSatelliteServiceList());
		setCarList(org.getCarList());
		setCreditCardList(org.getCreditCardList());
		setCurrencyConversionServiceList(org.getCurrencyConversionServiceList());
		setDepositAccountList(org.getDepositAccountList());
		setFinancialProductList(org.getFinancialProductList());
		setFoodServiceList(org.getFoodServiceList());
		setGovernmentServiceList(org.getGovernmentServiceList());
		setIndividualProductList(org.getIndividualProductList());
		setInvestmentFundList(org.getInvestmentFundList());
		setInvestmentOrDepositList(org.getInvestmentOrDepositList());
		setLoanOrCreditList(org.getLoanOrCreditList());
		setMortgageLoanList(org.getMortgageLoanList());
		setMotorcycleList(org.getMotorcycleList());
		setMotorizedBicycleList(org.getMotorizedBicycleList());
		setPaymentCardList(org.getPaymentCardList());
		setPaymentServiceList(org.getPaymentServiceList());
		setProductList(org.getProductList());
		setProductModelList(org.getProductModelList());
		setServiceList(org.getServiceList());
		setSomeProductsList(org.getSomeProductsList());
		setTaxiServiceList(org.getTaxiServiceList());
		setVehicleList(org.getVehicleList());
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
