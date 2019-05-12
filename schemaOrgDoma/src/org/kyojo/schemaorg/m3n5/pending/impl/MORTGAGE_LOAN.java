package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Amount;
import org.kyojo.schemaorg.m3n5.core.Container.AnnualPercentageRate;
import org.kyojo.schemaorg.m3n5.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableChannel;
import org.kyojo.schemaorg.m3n5.core.Container.Award;
import org.kyojo.schemaorg.m3n5.core.Container.Brand;
import org.kyojo.schemaorg.m3n5.core.Container.Broker;
import org.kyojo.schemaorg.m3n5.core.Container.Category;
import org.kyojo.schemaorg.m3n5.core.Container.Currency;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.FeesAndCommissionsSpecification;
import org.kyojo.schemaorg.m3n5.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n5.core.Container.HoursAvailable;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.InterestRate;
import org.kyojo.schemaorg.m3n5.core.Container.IsRelatedTo;
import org.kyojo.schemaorg.m3n5.core.Container.IsSimilarTo;
import org.kyojo.schemaorg.m3n5.core.Container.LoanTerm;
import org.kyojo.schemaorg.m3n5.core.Container.Logo;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.Provider;
import org.kyojo.schemaorg.m3n5.core.Container.ProviderMobility;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredCollateral;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceOutput;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceType;
import org.kyojo.schemaorg.m3n5.core.Container.Slogan;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Clazz;
import org.kyojo.schemaorg.m3n5.pending.Container.DomiciledMortgage;
import org.kyojo.schemaorg.m3n5.pending.Container.GracePeriod;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanMortgageMandateAmount;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanRepaymentForm;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanType;
import org.kyojo.schemaorg.m3n5.pending.Container.RecourseLoan;
import org.kyojo.schemaorg.m3n5.pending.Container.RenegotiableLoan;
import org.kyojo.schemaorg.m3n5.pending.Container.TermsOfService;


public class MORTGAGE_LOAN implements Clazz.MortgageLoan {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public AdditionalType additionalType;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public Amount amount;
	public AnnualPercentageRate annualPercentageRate;
	public AreaServed areaServed;
	public Audience audience;
	public AvailableChannel availableChannel;
	public Award award;
	public Brand brand;
	public Broker broker;
	public Category category;
	public Currency currency;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DomiciledMortgage domiciledMortgage;
	public FeesAndCommissionsSpecification feesAndCommissionsSpecification;
	public GracePeriod gracePeriod;
	public HasOfferCatalog hasOfferCatalog;
	public HoursAvailable hoursAvailable;
	public Identifier identifier;
	public Image image;
	public InterestRate interestRate;
	public IsRelatedTo isRelatedTo;
	public IsSimilarTo isSimilarTo;
	public LoanMortgageMandateAmount loanMortgageMandateAmount;
	public LoanRepaymentForm loanRepaymentForm;
	public LoanTerm loanTerm;
	public LoanType loanType;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PotentialAction potentialAction;
	public Provider provider;
	public ProviderMobility providerMobility;
	public RecourseLoan recourseLoan;
	public RenegotiableLoan renegotiableLoan;
	public RequiredCollateral requiredCollateral;
	public Review review;
	public SameAs sameAs;
	public ServiceOutput serviceOutput;
	public ServiceType serviceType;
	public Slogan slogan;
	public SubjectOf subjectOf;
	public TermsOfService termsOfService;
	public Url url;

	public MORTGAGE_LOAN() {
	}

	public MORTGAGE_LOAN(Long seq) {
		setSeq(seq);
	}

	public MORTGAGE_LOAN(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public MORTGAGE_LOAN(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public MORTGAGE_LOAN(AggregateRating aggregateRating) {
		setAggregateRating(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public MORTGAGE_LOAN(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public MORTGAGE_LOAN(Amount amount) {
		setAmount(amount);
	}

	@Override
	public Amount getAmount() {
		return amount;
	}

	@Override
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	public MORTGAGE_LOAN(AnnualPercentageRate annualPercentageRate) {
		setAnnualPercentageRate(annualPercentageRate);
	}

	@Override
	public AnnualPercentageRate getAnnualPercentageRate() {
		return annualPercentageRate;
	}

	@Override
	public void setAnnualPercentageRate(AnnualPercentageRate annualPercentageRate) {
		this.annualPercentageRate = annualPercentageRate;
	}

	public MORTGAGE_LOAN(AreaServed areaServed) {
		setAreaServed(areaServed);
	}

	@Override
	public AreaServed getAreaServed() {
		return areaServed;
	}

	@Override
	public void setAreaServed(AreaServed areaServed) {
		this.areaServed = areaServed;
	}

	public MORTGAGE_LOAN(Audience audience) {
		setAudience(audience);
	}

	@Override
	public Audience getAudience() {
		return audience;
	}

	@Override
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public MORTGAGE_LOAN(AvailableChannel availableChannel) {
		setAvailableChannel(availableChannel);
	}

	@Override
	public AvailableChannel getAvailableChannel() {
		return availableChannel;
	}

	@Override
	public void setAvailableChannel(AvailableChannel availableChannel) {
		this.availableChannel = availableChannel;
	}

	public MORTGAGE_LOAN(Award award) {
		setAward(award);
	}

	@Override
	public Award getAward() {
		return award;
	}

	@Override
	public void setAward(Award award) {
		this.award = award;
	}

	public MORTGAGE_LOAN(Brand brand) {
		setBrand(brand);
	}

	@Override
	public Brand getBrand() {
		return brand;
	}

	@Override
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public MORTGAGE_LOAN(Broker broker) {
		setBroker(broker);
	}

	@Override
	public Broker getBroker() {
		return broker;
	}

	@Override
	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public MORTGAGE_LOAN(Category category) {
		setCategory(category);
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public void setCategory(Category category) {
		this.category = category;
	}

	public MORTGAGE_LOAN(Currency currency) {
		setCurrency(currency);
	}

	@Override
	public Currency getCurrency() {
		return currency;
	}

	@Override
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public MORTGAGE_LOAN(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public MORTGAGE_LOAN(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public MORTGAGE_LOAN(DomiciledMortgage domiciledMortgage) {
		setDomiciledMortgage(domiciledMortgage);
	}

	@Override
	public DomiciledMortgage getDomiciledMortgage() {
		return domiciledMortgage;
	}

	@Override
	public void setDomiciledMortgage(DomiciledMortgage domiciledMortgage) {
		this.domiciledMortgage = domiciledMortgage;
	}

	public MORTGAGE_LOAN(FeesAndCommissionsSpecification feesAndCommissionsSpecification) {
		setFeesAndCommissionsSpecification(feesAndCommissionsSpecification);
	}

	@Override
	public FeesAndCommissionsSpecification getFeesAndCommissionsSpecification() {
		return feesAndCommissionsSpecification;
	}

	@Override
	public void setFeesAndCommissionsSpecification(FeesAndCommissionsSpecification feesAndCommissionsSpecification) {
		this.feesAndCommissionsSpecification = feesAndCommissionsSpecification;
	}

	public MORTGAGE_LOAN(GracePeriod gracePeriod) {
		setGracePeriod(gracePeriod);
	}

	@Override
	public GracePeriod getGracePeriod() {
		return gracePeriod;
	}

	@Override
	public void setGracePeriod(GracePeriod gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	public MORTGAGE_LOAN(HasOfferCatalog hasOfferCatalog) {
		setHasOfferCatalog(hasOfferCatalog);
	}

	@Override
	public HasOfferCatalog getHasOfferCatalog() {
		return hasOfferCatalog;
	}

	@Override
	public void setHasOfferCatalog(HasOfferCatalog hasOfferCatalog) {
		this.hasOfferCatalog = hasOfferCatalog;
	}

	public MORTGAGE_LOAN(HoursAvailable hoursAvailable) {
		setHoursAvailable(hoursAvailable);
	}

	@Override
	public HoursAvailable getHoursAvailable() {
		return hoursAvailable;
	}

	@Override
	public void setHoursAvailable(HoursAvailable hoursAvailable) {
		this.hoursAvailable = hoursAvailable;
	}

	public MORTGAGE_LOAN(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public MORTGAGE_LOAN(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public MORTGAGE_LOAN(InterestRate interestRate) {
		setInterestRate(interestRate);
	}

	@Override
	public InterestRate getInterestRate() {
		return interestRate;
	}

	@Override
	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}

	public MORTGAGE_LOAN(IsRelatedTo isRelatedTo) {
		setIsRelatedTo(isRelatedTo);
	}

	@Override
	public IsRelatedTo getIsRelatedTo() {
		return isRelatedTo;
	}

	@Override
	public void setIsRelatedTo(IsRelatedTo isRelatedTo) {
		this.isRelatedTo = isRelatedTo;
	}

	public MORTGAGE_LOAN(IsSimilarTo isSimilarTo) {
		setIsSimilarTo(isSimilarTo);
	}

	@Override
	public IsSimilarTo getIsSimilarTo() {
		return isSimilarTo;
	}

	@Override
	public void setIsSimilarTo(IsSimilarTo isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
	}

	public MORTGAGE_LOAN(LoanMortgageMandateAmount loanMortgageMandateAmount) {
		setLoanMortgageMandateAmount(loanMortgageMandateAmount);
	}

	@Override
	public LoanMortgageMandateAmount getLoanMortgageMandateAmount() {
		return loanMortgageMandateAmount;
	}

	@Override
	public void setLoanMortgageMandateAmount(LoanMortgageMandateAmount loanMortgageMandateAmount) {
		this.loanMortgageMandateAmount = loanMortgageMandateAmount;
	}

	public MORTGAGE_LOAN(LoanRepaymentForm loanRepaymentForm) {
		setLoanRepaymentForm(loanRepaymentForm);
	}

	@Override
	public LoanRepaymentForm getLoanRepaymentForm() {
		return loanRepaymentForm;
	}

	@Override
	public void setLoanRepaymentForm(LoanRepaymentForm loanRepaymentForm) {
		this.loanRepaymentForm = loanRepaymentForm;
	}

	public MORTGAGE_LOAN(LoanTerm loanTerm) {
		setLoanTerm(loanTerm);
	}

	@Override
	public LoanTerm getLoanTerm() {
		return loanTerm;
	}

	@Override
	public void setLoanTerm(LoanTerm loanTerm) {
		this.loanTerm = loanTerm;
	}

	public MORTGAGE_LOAN(LoanType loanType) {
		setLoanType(loanType);
	}

	@Override
	public LoanType getLoanType() {
		return loanType;
	}

	@Override
	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public MORTGAGE_LOAN(Logo logo) {
		setLogo(logo);
	}

	@Override
	public Logo getLogo() {
		return logo;
	}

	@Override
	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public MORTGAGE_LOAN(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public MORTGAGE_LOAN(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public MORTGAGE_LOAN(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public MORTGAGE_LOAN(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public MORTGAGE_LOAN(Offers offers) {
		setOffers(offers);
	}

	@Override
	public Offers getOffers() {
		return offers;
	}

	@Override
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public MORTGAGE_LOAN(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public MORTGAGE_LOAN(Provider provider) {
		setProvider(provider);
	}

	@Override
	public Provider getProvider() {
		return provider;
	}

	@Override
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public MORTGAGE_LOAN(ProviderMobility providerMobility) {
		setProviderMobility(providerMobility);
	}

	@Override
	public ProviderMobility getProviderMobility() {
		return providerMobility;
	}

	@Override
	public void setProviderMobility(ProviderMobility providerMobility) {
		this.providerMobility = providerMobility;
	}

	public MORTGAGE_LOAN(RecourseLoan recourseLoan) {
		setRecourseLoan(recourseLoan);
	}

	@Override
	public RecourseLoan getRecourseLoan() {
		return recourseLoan;
	}

	@Override
	public void setRecourseLoan(RecourseLoan recourseLoan) {
		this.recourseLoan = recourseLoan;
	}

	public MORTGAGE_LOAN(RenegotiableLoan renegotiableLoan) {
		setRenegotiableLoan(renegotiableLoan);
	}

	@Override
	public RenegotiableLoan getRenegotiableLoan() {
		return renegotiableLoan;
	}

	@Override
	public void setRenegotiableLoan(RenegotiableLoan renegotiableLoan) {
		this.renegotiableLoan = renegotiableLoan;
	}

	public MORTGAGE_LOAN(RequiredCollateral requiredCollateral) {
		setRequiredCollateral(requiredCollateral);
	}

	@Override
	public RequiredCollateral getRequiredCollateral() {
		return requiredCollateral;
	}

	@Override
	public void setRequiredCollateral(RequiredCollateral requiredCollateral) {
		this.requiredCollateral = requiredCollateral;
	}

	public MORTGAGE_LOAN(Review review) {
		setReview(review);
	}

	@Override
	public Review getReview() {
		return review;
	}

	@Override
	public void setReview(Review review) {
		this.review = review;
	}

	public MORTGAGE_LOAN(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public MORTGAGE_LOAN(ServiceOutput serviceOutput) {
		setServiceOutput(serviceOutput);
	}

	@Override
	public ServiceOutput getServiceOutput() {
		return serviceOutput;
	}

	@Override
	public void setServiceOutput(ServiceOutput serviceOutput) {
		this.serviceOutput = serviceOutput;
	}

	public MORTGAGE_LOAN(ServiceType serviceType) {
		setServiceType(serviceType);
	}

	@Override
	public ServiceType getServiceType() {
		return serviceType;
	}

	@Override
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public MORTGAGE_LOAN(Slogan slogan) {
		setSlogan(slogan);
	}

	@Override
	public Slogan getSlogan() {
		return slogan;
	}

	@Override
	public void setSlogan(Slogan slogan) {
		this.slogan = slogan;
	}

	public MORTGAGE_LOAN(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public MORTGAGE_LOAN(TermsOfService termsOfService) {
		setTermsOfService(termsOfService);
	}

	@Override
	public TermsOfService getTermsOfService() {
		return termsOfService;
	}

	@Override
	public void setTermsOfService(TermsOfService termsOfService) {
		this.termsOfService = termsOfService;
	}

	public MORTGAGE_LOAN(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public void copy(Clazz.MortgageLoan org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAmount(org.getAmount());
		setAnnualPercentageRate(org.getAnnualPercentageRate());
		setAreaServed(org.getAreaServed());
		setAudience(org.getAudience());
		setAvailableChannel(org.getAvailableChannel());
		setAward(org.getAward());
		setBrand(org.getBrand());
		setBroker(org.getBroker());
		setCategory(org.getCategory());
		setCurrency(org.getCurrency());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDomiciledMortgage(org.getDomiciledMortgage());
		setFeesAndCommissionsSpecification(org.getFeesAndCommissionsSpecification());
		setGracePeriod(org.getGracePeriod());
		setHasOfferCatalog(org.getHasOfferCatalog());
		setHoursAvailable(org.getHoursAvailable());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInterestRate(org.getInterestRate());
		setIsRelatedTo(org.getIsRelatedTo());
		setIsSimilarTo(org.getIsSimilarTo());
		setLoanMortgageMandateAmount(org.getLoanMortgageMandateAmount());
		setLoanRepaymentForm(org.getLoanRepaymentForm());
		setLoanTerm(org.getLoanTerm());
		setLoanType(org.getLoanType());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setProviderMobility(org.getProviderMobility());
		setRecourseLoan(org.getRecourseLoan());
		setRenegotiableLoan(org.getRenegotiableLoan());
		setRequiredCollateral(org.getRequiredCollateral());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setServiceOutput(org.getServiceOutput());
		setServiceType(org.getServiceType());
		setSlogan(org.getSlogan());
		setSubjectOf(org.getSubjectOf());
		setTermsOfService(org.getTermsOfService());
		setUrl(org.getUrl());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
