package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.AreaServed;
import org.kyojo.schemaOrg.m3n3.core.Container.Audience;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableChannel;
import org.kyojo.schemaOrg.m3n3.core.Container.Award;
import org.kyojo.schemaOrg.m3n3.core.Container.Brand;
import org.kyojo.schemaOrg.m3n3.core.Container.Broker;
import org.kyojo.schemaOrg.m3n3.core.Container.Category;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.HasOfferCatalog;
import org.kyojo.schemaOrg.m3n3.core.Container.HoursAvailable;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.IsRelatedTo;
import org.kyojo.schemaOrg.m3n3.core.Container.IsSimilarTo;
import org.kyojo.schemaOrg.m3n3.core.Container.Logo;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.Provider;
import org.kyojo.schemaOrg.m3n3.core.Container.ProviderMobility;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.ServiceOutput;
import org.kyojo.schemaOrg.m3n3.core.Container.ServiceType;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Container.TermsOfService;


public class CABLE_OR_SATELLITE_SERVICE implements Clazz.CableOrSatelliteService {

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
	public AreaServed areaServed;
	public Audience audience;
	public AvailableChannel availableChannel;
	public Award award;
	public Brand brand;
	public Broker broker;
	public Category category;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HasOfferCatalog hasOfferCatalog;
	public HoursAvailable hoursAvailable;
	public Identifier identifier;
	public Image image;
	public IsRelatedTo isRelatedTo;
	public IsSimilarTo isSimilarTo;
	public Logo logo;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public PotentialAction potentialAction;
	public Provider provider;
	public ProviderMobility providerMobility;
	public Review review;
	public SameAs sameAs;
	public ServiceOutput serviceOutput;
	public ServiceType serviceType;
	public TermsOfService termsOfService;
	public Url url;

	public CABLE_OR_SATELLITE_SERVICE() {
	}

	public CABLE_OR_SATELLITE_SERVICE(Long seq) {
		setSeq(seq);
	}

	public CABLE_OR_SATELLITE_SERVICE(String string) {
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

	public CABLE_OR_SATELLITE_SERVICE(AdditionalType additionalType) {
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

	public CABLE_OR_SATELLITE_SERVICE(AggregateRating aggregateRating) {
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

	public CABLE_OR_SATELLITE_SERVICE(AlternateName alternateName) {
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

	public CABLE_OR_SATELLITE_SERVICE(AreaServed areaServed) {
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

	public CABLE_OR_SATELLITE_SERVICE(Audience audience) {
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

	public CABLE_OR_SATELLITE_SERVICE(AvailableChannel availableChannel) {
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

	public CABLE_OR_SATELLITE_SERVICE(Award award) {
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

	public CABLE_OR_SATELLITE_SERVICE(Brand brand) {
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

	public CABLE_OR_SATELLITE_SERVICE(Broker broker) {
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

	public CABLE_OR_SATELLITE_SERVICE(Category category) {
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

	public CABLE_OR_SATELLITE_SERVICE(Description description) {
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

	public CABLE_OR_SATELLITE_SERVICE(DisambiguatingDescription disambiguatingDescription) {
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

	public CABLE_OR_SATELLITE_SERVICE(HasOfferCatalog hasOfferCatalog) {
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

	public CABLE_OR_SATELLITE_SERVICE(HoursAvailable hoursAvailable) {
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

	public CABLE_OR_SATELLITE_SERVICE(Identifier identifier) {
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

	public CABLE_OR_SATELLITE_SERVICE(Image image) {
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

	public CABLE_OR_SATELLITE_SERVICE(IsRelatedTo isRelatedTo) {
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

	public CABLE_OR_SATELLITE_SERVICE(IsSimilarTo isSimilarTo) {
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

	public CABLE_OR_SATELLITE_SERVICE(Logo logo) {
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

	public CABLE_OR_SATELLITE_SERVICE(MainEntityOfPage mainEntityOfPage) {
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

	public CABLE_OR_SATELLITE_SERVICE(Name name) {
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

	public CABLE_OR_SATELLITE_SERVICE(NameFuzzy nameFuzzy) {
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

	public CABLE_OR_SATELLITE_SERVICE(NameRuby nameRuby) {
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

	public CABLE_OR_SATELLITE_SERVICE(Offers offers) {
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

	public CABLE_OR_SATELLITE_SERVICE(PotentialAction potentialAction) {
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

	public CABLE_OR_SATELLITE_SERVICE(Provider provider) {
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

	public CABLE_OR_SATELLITE_SERVICE(ProviderMobility providerMobility) {
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

	public CABLE_OR_SATELLITE_SERVICE(Review review) {
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

	public CABLE_OR_SATELLITE_SERVICE(SameAs sameAs) {
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

	public CABLE_OR_SATELLITE_SERVICE(ServiceOutput serviceOutput) {
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

	public CABLE_OR_SATELLITE_SERVICE(ServiceType serviceType) {
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

	public CABLE_OR_SATELLITE_SERVICE(TermsOfService termsOfService) {
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

	public CABLE_OR_SATELLITE_SERVICE(Url url) {
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

	public CABLE_OR_SATELLITE_SERVICE(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			AreaServed areaServed,
			Audience audience,
			AvailableChannel availableChannel,
			Award award,
			Brand brand,
			Broker broker,
			Category category,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			HasOfferCatalog hasOfferCatalog,
			HoursAvailable hoursAvailable,
			Identifier identifier,
			Image image,
			IsRelatedTo isRelatedTo,
			IsSimilarTo isSimilarTo,
			Logo logo,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Offers offers,
			PotentialAction potentialAction,
			Provider provider,
			ProviderMobility providerMobility,
			Review review,
			SameAs sameAs,
			ServiceOutput serviceOutput,
			ServiceType serviceType,
			TermsOfService termsOfService,
			Url url) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAreaServed(areaServed);
		setAudience(audience);
		setAvailableChannel(availableChannel);
		setAward(award);
		setBrand(brand);
		setBroker(broker);
		setCategory(category);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setHasOfferCatalog(hasOfferCatalog);
		setHoursAvailable(hoursAvailable);
		setIdentifier(identifier);
		setImage(image);
		setIsRelatedTo(isRelatedTo);
		setIsSimilarTo(isSimilarTo);
		setLogo(logo);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOffers(offers);
		setPotentialAction(potentialAction);
		setProvider(provider);
		setProviderMobility(providerMobility);
		setReview(review);
		setSameAs(sameAs);
		setServiceOutput(serviceOutput);
		setServiceType(serviceType);
		setTermsOfService(termsOfService);
		setUrl(url);
	}

	public void copy(Clazz.CableOrSatelliteService org) {
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
		setAreaServed(org.getAreaServed());
		setAudience(org.getAudience());
		setAvailableChannel(org.getAvailableChannel());
		setAward(org.getAward());
		setBrand(org.getBrand());
		setBroker(org.getBroker());
		setCategory(org.getCategory());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHasOfferCatalog(org.getHasOfferCatalog());
		setHoursAvailable(org.getHoursAvailable());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsRelatedTo(org.getIsRelatedTo());
		setIsSimilarTo(org.getIsSimilarTo());
		setLogo(org.getLogo());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setProviderMobility(org.getProviderMobility());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setServiceOutput(org.getServiceOutput());
		setServiceType(org.getServiceType());
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
