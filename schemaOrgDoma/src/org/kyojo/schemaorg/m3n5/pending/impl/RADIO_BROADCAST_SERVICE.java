package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableChannel;
import org.kyojo.schemaorg.m3n5.core.Container.Award;
import org.kyojo.schemaorg.m3n5.core.Container.Brand;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastAffiliateOf;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastDisplayName;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastFrequency;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastTimezone;
import org.kyojo.schemaorg.m3n5.core.Container.Broadcaster;
import org.kyojo.schemaorg.m3n5.core.Container.Broker;
import org.kyojo.schemaorg.m3n5.core.Container.Category;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.HasBroadcastChannel;
import org.kyojo.schemaorg.m3n5.core.Container.HasOfferCatalog;
import org.kyojo.schemaorg.m3n5.core.Container.HoursAvailable;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.IsRelatedTo;
import org.kyojo.schemaorg.m3n5.core.Container.IsSimilarTo;
import org.kyojo.schemaorg.m3n5.core.Container.Logo;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.ParentService;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.Provider;
import org.kyojo.schemaorg.m3n5.core.Container.ProviderMobility;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceOutput;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceType;
import org.kyojo.schemaorg.m3n5.core.Container.Slogan;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.VideoFormat;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Clazz;
import org.kyojo.schemaorg.m3n5.pending.Container.CallSign;
import org.kyojo.schemaorg.m3n5.pending.Container.TermsOfService;


public class RADIO_BROADCAST_SERVICE implements Clazz.RadioBroadcastService {

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
	public BroadcastAffiliateOf broadcastAffiliateOf;
	public BroadcastDisplayName broadcastDisplayName;
	public BroadcastFrequency broadcastFrequency;
	public BroadcastTimezone broadcastTimezone;
	public Broadcaster broadcaster;
	public Broker broker;
	public CallSign callSign;
	public Category category;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HasBroadcastChannel hasBroadcastChannel;
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
	public ParentService parentService;
	public PotentialAction potentialAction;
	public Provider provider;
	public ProviderMobility providerMobility;
	public Review review;
	public SameAs sameAs;
	public ServiceOutput serviceOutput;
	public ServiceType serviceType;
	public Slogan slogan;
	public SubjectOf subjectOf;
	public TermsOfService termsOfService;
	public Url url;
	public VideoFormat videoFormat;

	public RADIO_BROADCAST_SERVICE() {
	}

	public RADIO_BROADCAST_SERVICE(Long seq) {
		setSeq(seq);
	}

	public RADIO_BROADCAST_SERVICE(String string) {
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

	public RADIO_BROADCAST_SERVICE(AdditionalType additionalType) {
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

	public RADIO_BROADCAST_SERVICE(AggregateRating aggregateRating) {
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

	public RADIO_BROADCAST_SERVICE(AlternateName alternateName) {
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

	public RADIO_BROADCAST_SERVICE(AreaServed areaServed) {
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

	public RADIO_BROADCAST_SERVICE(Audience audience) {
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

	public RADIO_BROADCAST_SERVICE(AvailableChannel availableChannel) {
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

	public RADIO_BROADCAST_SERVICE(Award award) {
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

	public RADIO_BROADCAST_SERVICE(Brand brand) {
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

	public RADIO_BROADCAST_SERVICE(BroadcastAffiliateOf broadcastAffiliateOf) {
		setBroadcastAffiliateOf(broadcastAffiliateOf);
	}

	@Override
	public BroadcastAffiliateOf getBroadcastAffiliateOf() {
		return broadcastAffiliateOf;
	}

	@Override
	public void setBroadcastAffiliateOf(BroadcastAffiliateOf broadcastAffiliateOf) {
		this.broadcastAffiliateOf = broadcastAffiliateOf;
	}

	public RADIO_BROADCAST_SERVICE(BroadcastDisplayName broadcastDisplayName) {
		setBroadcastDisplayName(broadcastDisplayName);
	}

	@Override
	public BroadcastDisplayName getBroadcastDisplayName() {
		return broadcastDisplayName;
	}

	@Override
	public void setBroadcastDisplayName(BroadcastDisplayName broadcastDisplayName) {
		this.broadcastDisplayName = broadcastDisplayName;
	}

	public RADIO_BROADCAST_SERVICE(BroadcastFrequency broadcastFrequency) {
		setBroadcastFrequency(broadcastFrequency);
	}

	@Override
	public BroadcastFrequency getBroadcastFrequency() {
		return broadcastFrequency;
	}

	@Override
	public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency) {
		this.broadcastFrequency = broadcastFrequency;
	}

	public RADIO_BROADCAST_SERVICE(BroadcastTimezone broadcastTimezone) {
		setBroadcastTimezone(broadcastTimezone);
	}

	@Override
	public BroadcastTimezone getBroadcastTimezone() {
		return broadcastTimezone;
	}

	@Override
	public void setBroadcastTimezone(BroadcastTimezone broadcastTimezone) {
		this.broadcastTimezone = broadcastTimezone;
	}

	public RADIO_BROADCAST_SERVICE(Broadcaster broadcaster) {
		setBroadcaster(broadcaster);
	}

	@Override
	public Broadcaster getBroadcaster() {
		return broadcaster;
	}

	@Override
	public void setBroadcaster(Broadcaster broadcaster) {
		this.broadcaster = broadcaster;
	}

	public RADIO_BROADCAST_SERVICE(Broker broker) {
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

	public RADIO_BROADCAST_SERVICE(CallSign callSign) {
		setCallSign(callSign);
	}

	@Override
	public CallSign getCallSign() {
		return callSign;
	}

	@Override
	public void setCallSign(CallSign callSign) {
		this.callSign = callSign;
	}

	public RADIO_BROADCAST_SERVICE(Category category) {
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

	public RADIO_BROADCAST_SERVICE(Description description) {
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

	public RADIO_BROADCAST_SERVICE(DisambiguatingDescription disambiguatingDescription) {
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

	public RADIO_BROADCAST_SERVICE(HasBroadcastChannel hasBroadcastChannel) {
		setHasBroadcastChannel(hasBroadcastChannel);
	}

	@Override
	public HasBroadcastChannel getHasBroadcastChannel() {
		return hasBroadcastChannel;
	}

	@Override
	public void setHasBroadcastChannel(HasBroadcastChannel hasBroadcastChannel) {
		this.hasBroadcastChannel = hasBroadcastChannel;
	}

	public RADIO_BROADCAST_SERVICE(HasOfferCatalog hasOfferCatalog) {
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

	public RADIO_BROADCAST_SERVICE(HoursAvailable hoursAvailable) {
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

	public RADIO_BROADCAST_SERVICE(Identifier identifier) {
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

	public RADIO_BROADCAST_SERVICE(Image image) {
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

	public RADIO_BROADCAST_SERVICE(IsRelatedTo isRelatedTo) {
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

	public RADIO_BROADCAST_SERVICE(IsSimilarTo isSimilarTo) {
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

	public RADIO_BROADCAST_SERVICE(Logo logo) {
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

	public RADIO_BROADCAST_SERVICE(MainEntityOfPage mainEntityOfPage) {
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

	public RADIO_BROADCAST_SERVICE(Name name) {
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

	public RADIO_BROADCAST_SERVICE(NameFuzzy nameFuzzy) {
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

	public RADIO_BROADCAST_SERVICE(NameRuby nameRuby) {
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

	public RADIO_BROADCAST_SERVICE(Offers offers) {
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

	public RADIO_BROADCAST_SERVICE(ParentService parentService) {
		setParentService(parentService);
	}

	@Override
	public ParentService getParentService() {
		return parentService;
	}

	@Override
	public void setParentService(ParentService parentService) {
		this.parentService = parentService;
	}

	public RADIO_BROADCAST_SERVICE(PotentialAction potentialAction) {
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

	public RADIO_BROADCAST_SERVICE(Provider provider) {
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

	public RADIO_BROADCAST_SERVICE(ProviderMobility providerMobility) {
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

	public RADIO_BROADCAST_SERVICE(Review review) {
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

	public RADIO_BROADCAST_SERVICE(SameAs sameAs) {
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

	public RADIO_BROADCAST_SERVICE(ServiceOutput serviceOutput) {
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

	public RADIO_BROADCAST_SERVICE(ServiceType serviceType) {
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

	public RADIO_BROADCAST_SERVICE(Slogan slogan) {
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

	public RADIO_BROADCAST_SERVICE(SubjectOf subjectOf) {
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

	public RADIO_BROADCAST_SERVICE(TermsOfService termsOfService) {
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

	public RADIO_BROADCAST_SERVICE(Url url) {
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

	public RADIO_BROADCAST_SERVICE(VideoFormat videoFormat) {
		setVideoFormat(videoFormat);
	}

	@Override
	public VideoFormat getVideoFormat() {
		return videoFormat;
	}

	@Override
	public void setVideoFormat(VideoFormat videoFormat) {
		this.videoFormat = videoFormat;
	}

	public void copy(Clazz.RadioBroadcastService org) {
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
		setBroadcastAffiliateOf(org.getBroadcastAffiliateOf());
		setBroadcastDisplayName(org.getBroadcastDisplayName());
		setBroadcastFrequency(org.getBroadcastFrequency());
		setBroadcastTimezone(org.getBroadcastTimezone());
		setBroadcaster(org.getBroadcaster());
		setBroker(org.getBroker());
		setCallSign(org.getCallSign());
		setCategory(org.getCategory());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHasBroadcastChannel(org.getHasBroadcastChannel());
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
		setParentService(org.getParentService());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setProviderMobility(org.getProviderMobility());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setServiceOutput(org.getServiceOutput());
		setServiceType(org.getServiceType());
		setSlogan(org.getSlogan());
		setSubjectOf(org.getSubjectOf());
		setTermsOfService(org.getTermsOfService());
		setUrl(org.getUrl());
		setVideoFormat(org.getVideoFormat());
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
