package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AcceptedPaymentMethod;
import org.kyojo.schemaOrg.m3n3.core.Container.AddOn;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AdvanceBookingRequirement;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.AreaServed;
import org.kyojo.schemaOrg.m3n3.core.Container.Availability;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityEnds;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailabilityStarts;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableAtOrFrom;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableDeliveryMethod;
import org.kyojo.schemaOrg.m3n3.core.Container.BusinessFunction;
import org.kyojo.schemaOrg.m3n3.core.Container.Category;
import org.kyojo.schemaOrg.m3n3.core.Container.DeliveryLeadTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleCustomerType;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleDuration;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleQuantity;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleRegion;
import org.kyojo.schemaOrg.m3n3.core.Container.EligibleTransactionVolume;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin12;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin13;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin14;
import org.kyojo.schemaOrg.m3n3.core.Container.Gtin8;
import org.kyojo.schemaOrg.m3n3.core.Container.HighPrice;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.IncludesObject;
import org.kyojo.schemaOrg.m3n3.core.Container.IneligibleRegion;
import org.kyojo.schemaOrg.m3n3.core.Container.InventoryLevel;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemCondition;
import org.kyojo.schemaOrg.m3n3.core.Container.ItemOffered;
import org.kyojo.schemaOrg.m3n3.core.Container.LowPrice;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Mpn;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.OfferCount;
import org.kyojo.schemaOrg.m3n3.core.Container.OfferedBy;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.Price;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceCurrency;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceValidUntil;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Seller;
import org.kyojo.schemaOrg.m3n3.core.Container.SerialNumber;
import org.kyojo.schemaOrg.m3n3.core.Container.Sku;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.ValidFrom;
import org.kyojo.schemaOrg.m3n3.core.Container.ValidThrough;
import org.kyojo.schemaOrg.m3n3.core.Container.Warranty;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class AGGREGATE_OFFER implements Clazz.AggregateOffer {

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
	public AcceptedPaymentMethod acceptedPaymentMethod;
	public AddOn addOn;
	public AdditionalType additionalType;
	public AdvanceBookingRequirement advanceBookingRequirement;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public AreaServed areaServed;
	public Availability availability;
	public AvailabilityEnds availabilityEnds;
	public AvailabilityStarts availabilityStarts;
	public AvailableAtOrFrom availableAtOrFrom;
	public AvailableDeliveryMethod availableDeliveryMethod;
	public BusinessFunction businessFunction;
	public Category category;
	public DeliveryLeadTime deliveryLeadTime;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EligibleCustomerType eligibleCustomerType;
	public EligibleDuration eligibleDuration;
	public EligibleQuantity eligibleQuantity;
	public EligibleRegion eligibleRegion;
	public EligibleTransactionVolume eligibleTransactionVolume;
	public Gtin12 gtin12;
	public Gtin13 gtin13;
	public Gtin14 gtin14;
	public Gtin8 gtin8;
	public HighPrice highPrice;
	public Identifier identifier;
	public Image image;
	public IncludesObject includesObject;
	public IneligibleRegion ineligibleRegion;
	public InventoryLevel inventoryLevel;
	public ItemCondition itemCondition;
	public ItemOffered itemOffered;
	public LowPrice lowPrice;
	public MainEntityOfPage mainEntityOfPage;
	public Mpn mpn;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OfferCount offerCount;
	public OfferedBy offeredBy;
	public Offers offers;
	public PotentialAction potentialAction;
	public Price price;
	public PriceCurrency priceCurrency;
	public PriceSpecification priceSpecification;
	public PriceValidUntil priceValidUntil;
	public Review review;
	public SameAs sameAs;
	public Seller seller;
	public SerialNumber serialNumber;
	public Sku sku;
	public Url url;
	public ValidFrom validFrom;
	public ValidThrough validThrough;
	public Warranty warranty;

	public AGGREGATE_OFFER() {
	}

	public AGGREGATE_OFFER(Long seq) {
		setSeq(seq);
	}

	public AGGREGATE_OFFER(String string) {
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

	public AGGREGATE_OFFER(AcceptedPaymentMethod acceptedPaymentMethod) {
		setAcceptedPaymentMethod(acceptedPaymentMethod);
	}

	@Override
	public AcceptedPaymentMethod getAcceptedPaymentMethod() {
		return acceptedPaymentMethod;
	}

	@Override
	public void setAcceptedPaymentMethod(AcceptedPaymentMethod acceptedPaymentMethod) {
		this.acceptedPaymentMethod = acceptedPaymentMethod;
	}

	public AGGREGATE_OFFER(AddOn addOn) {
		setAddOn(addOn);
	}

	@Override
	public AddOn getAddOn() {
		return addOn;
	}

	@Override
	public void setAddOn(AddOn addOn) {
		this.addOn = addOn;
	}

	public AGGREGATE_OFFER(AdditionalType additionalType) {
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

	public AGGREGATE_OFFER(AdvanceBookingRequirement advanceBookingRequirement) {
		setAdvanceBookingRequirement(advanceBookingRequirement);
	}

	@Override
	public AdvanceBookingRequirement getAdvanceBookingRequirement() {
		return advanceBookingRequirement;
	}

	@Override
	public void setAdvanceBookingRequirement(AdvanceBookingRequirement advanceBookingRequirement) {
		this.advanceBookingRequirement = advanceBookingRequirement;
	}

	public AGGREGATE_OFFER(AggregateRating aggregateRating) {
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

	public AGGREGATE_OFFER(AlternateName alternateName) {
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

	public AGGREGATE_OFFER(AreaServed areaServed) {
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

	public AGGREGATE_OFFER(Availability availability) {
		setAvailability(availability);
	}

	@Override
	public Availability getAvailability() {
		return availability;
	}

	@Override
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public AGGREGATE_OFFER(AvailabilityEnds availabilityEnds) {
		setAvailabilityEnds(availabilityEnds);
	}

	@Override
	public AvailabilityEnds getAvailabilityEnds() {
		return availabilityEnds;
	}

	@Override
	public void setAvailabilityEnds(AvailabilityEnds availabilityEnds) {
		this.availabilityEnds = availabilityEnds;
	}

	public AGGREGATE_OFFER(AvailabilityStarts availabilityStarts) {
		setAvailabilityStarts(availabilityStarts);
	}

	@Override
	public AvailabilityStarts getAvailabilityStarts() {
		return availabilityStarts;
	}

	@Override
	public void setAvailabilityStarts(AvailabilityStarts availabilityStarts) {
		this.availabilityStarts = availabilityStarts;
	}

	public AGGREGATE_OFFER(AvailableAtOrFrom availableAtOrFrom) {
		setAvailableAtOrFrom(availableAtOrFrom);
	}

	@Override
	public AvailableAtOrFrom getAvailableAtOrFrom() {
		return availableAtOrFrom;
	}

	@Override
	public void setAvailableAtOrFrom(AvailableAtOrFrom availableAtOrFrom) {
		this.availableAtOrFrom = availableAtOrFrom;
	}

	public AGGREGATE_OFFER(AvailableDeliveryMethod availableDeliveryMethod) {
		setAvailableDeliveryMethod(availableDeliveryMethod);
	}

	@Override
	public AvailableDeliveryMethod getAvailableDeliveryMethod() {
		return availableDeliveryMethod;
	}

	@Override
	public void setAvailableDeliveryMethod(AvailableDeliveryMethod availableDeliveryMethod) {
		this.availableDeliveryMethod = availableDeliveryMethod;
	}

	public AGGREGATE_OFFER(BusinessFunction businessFunction) {
		setBusinessFunction(businessFunction);
	}

	@Override
	public BusinessFunction getBusinessFunction() {
		return businessFunction;
	}

	@Override
	public void setBusinessFunction(BusinessFunction businessFunction) {
		this.businessFunction = businessFunction;
	}

	public AGGREGATE_OFFER(Category category) {
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

	public AGGREGATE_OFFER(DeliveryLeadTime deliveryLeadTime) {
		setDeliveryLeadTime(deliveryLeadTime);
	}

	@Override
	public DeliveryLeadTime getDeliveryLeadTime() {
		return deliveryLeadTime;
	}

	@Override
	public void setDeliveryLeadTime(DeliveryLeadTime deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}

	public AGGREGATE_OFFER(Description description) {
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

	public AGGREGATE_OFFER(DisambiguatingDescription disambiguatingDescription) {
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

	public AGGREGATE_OFFER(EligibleCustomerType eligibleCustomerType) {
		setEligibleCustomerType(eligibleCustomerType);
	}

	@Override
	public EligibleCustomerType getEligibleCustomerType() {
		return eligibleCustomerType;
	}

	@Override
	public void setEligibleCustomerType(EligibleCustomerType eligibleCustomerType) {
		this.eligibleCustomerType = eligibleCustomerType;
	}

	public AGGREGATE_OFFER(EligibleDuration eligibleDuration) {
		setEligibleDuration(eligibleDuration);
	}

	@Override
	public EligibleDuration getEligibleDuration() {
		return eligibleDuration;
	}

	@Override
	public void setEligibleDuration(EligibleDuration eligibleDuration) {
		this.eligibleDuration = eligibleDuration;
	}

	public AGGREGATE_OFFER(EligibleQuantity eligibleQuantity) {
		setEligibleQuantity(eligibleQuantity);
	}

	@Override
	public EligibleQuantity getEligibleQuantity() {
		return eligibleQuantity;
	}

	@Override
	public void setEligibleQuantity(EligibleQuantity eligibleQuantity) {
		this.eligibleQuantity = eligibleQuantity;
	}

	public AGGREGATE_OFFER(EligibleRegion eligibleRegion) {
		setEligibleRegion(eligibleRegion);
	}

	@Override
	public EligibleRegion getEligibleRegion() {
		return eligibleRegion;
	}

	@Override
	public void setEligibleRegion(EligibleRegion eligibleRegion) {
		this.eligibleRegion = eligibleRegion;
	}

	public AGGREGATE_OFFER(EligibleTransactionVolume eligibleTransactionVolume) {
		setEligibleTransactionVolume(eligibleTransactionVolume);
	}

	@Override
	public EligibleTransactionVolume getEligibleTransactionVolume() {
		return eligibleTransactionVolume;
	}

	@Override
	public void setEligibleTransactionVolume(EligibleTransactionVolume eligibleTransactionVolume) {
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}

	public AGGREGATE_OFFER(Gtin12 gtin12) {
		setGtin12(gtin12);
	}

	@Override
	public Gtin12 getGtin12() {
		return gtin12;
	}

	@Override
	public void setGtin12(Gtin12 gtin12) {
		this.gtin12 = gtin12;
	}

	public AGGREGATE_OFFER(Gtin13 gtin13) {
		setGtin13(gtin13);
	}

	@Override
	public Gtin13 getGtin13() {
		return gtin13;
	}

	@Override
	public void setGtin13(Gtin13 gtin13) {
		this.gtin13 = gtin13;
	}

	public AGGREGATE_OFFER(Gtin14 gtin14) {
		setGtin14(gtin14);
	}

	@Override
	public Gtin14 getGtin14() {
		return gtin14;
	}

	@Override
	public void setGtin14(Gtin14 gtin14) {
		this.gtin14 = gtin14;
	}

	public AGGREGATE_OFFER(Gtin8 gtin8) {
		setGtin8(gtin8);
	}

	@Override
	public Gtin8 getGtin8() {
		return gtin8;
	}

	@Override
	public void setGtin8(Gtin8 gtin8) {
		this.gtin8 = gtin8;
	}

	public AGGREGATE_OFFER(HighPrice highPrice) {
		setHighPrice(highPrice);
	}

	@Override
	public HighPrice getHighPrice() {
		return highPrice;
	}

	@Override
	public void setHighPrice(HighPrice highPrice) {
		this.highPrice = highPrice;
	}

	public AGGREGATE_OFFER(Identifier identifier) {
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

	public AGGREGATE_OFFER(Image image) {
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

	public AGGREGATE_OFFER(IncludesObject includesObject) {
		setIncludesObject(includesObject);
	}

	@Override
	public IncludesObject getIncludesObject() {
		return includesObject;
	}

	@Override
	public void setIncludesObject(IncludesObject includesObject) {
		this.includesObject = includesObject;
	}

	public AGGREGATE_OFFER(IneligibleRegion ineligibleRegion) {
		setIneligibleRegion(ineligibleRegion);
	}

	@Override
	public IneligibleRegion getIneligibleRegion() {
		return ineligibleRegion;
	}

	@Override
	public void setIneligibleRegion(IneligibleRegion ineligibleRegion) {
		this.ineligibleRegion = ineligibleRegion;
	}

	public AGGREGATE_OFFER(InventoryLevel inventoryLevel) {
		setInventoryLevel(inventoryLevel);
	}

	@Override
	public InventoryLevel getInventoryLevel() {
		return inventoryLevel;
	}

	@Override
	public void setInventoryLevel(InventoryLevel inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}

	public AGGREGATE_OFFER(ItemCondition itemCondition) {
		setItemCondition(itemCondition);
	}

	@Override
	public ItemCondition getItemCondition() {
		return itemCondition;
	}

	@Override
	public void setItemCondition(ItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

	public AGGREGATE_OFFER(ItemOffered itemOffered) {
		setItemOffered(itemOffered);
	}

	@Override
	public ItemOffered getItemOffered() {
		return itemOffered;
	}

	@Override
	public void setItemOffered(ItemOffered itemOffered) {
		this.itemOffered = itemOffered;
	}

	public AGGREGATE_OFFER(LowPrice lowPrice) {
		setLowPrice(lowPrice);
	}

	@Override
	public LowPrice getLowPrice() {
		return lowPrice;
	}

	@Override
	public void setLowPrice(LowPrice lowPrice) {
		this.lowPrice = lowPrice;
	}

	public AGGREGATE_OFFER(MainEntityOfPage mainEntityOfPage) {
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

	public AGGREGATE_OFFER(Mpn mpn) {
		setMpn(mpn);
	}

	@Override
	public Mpn getMpn() {
		return mpn;
	}

	@Override
	public void setMpn(Mpn mpn) {
		this.mpn = mpn;
	}

	public AGGREGATE_OFFER(Name name) {
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

	public AGGREGATE_OFFER(NameFuzzy nameFuzzy) {
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

	public AGGREGATE_OFFER(NameRuby nameRuby) {
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

	public AGGREGATE_OFFER(OfferCount offerCount) {
		setOfferCount(offerCount);
	}

	@Override
	public OfferCount getOfferCount() {
		return offerCount;
	}

	@Override
	public void setOfferCount(OfferCount offerCount) {
		this.offerCount = offerCount;
	}

	public AGGREGATE_OFFER(OfferedBy offeredBy) {
		setOfferedBy(offeredBy);
	}

	@Override
	public OfferedBy getOfferedBy() {
		return offeredBy;
	}

	@Override
	public void setOfferedBy(OfferedBy offeredBy) {
		this.offeredBy = offeredBy;
	}

	public AGGREGATE_OFFER(Offers offers) {
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

	public AGGREGATE_OFFER(PotentialAction potentialAction) {
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

	public AGGREGATE_OFFER(Price price) {
		setPrice(price);
	}

	@Override
	public Price getPrice() {
		return price;
	}

	@Override
	public void setPrice(Price price) {
		this.price = price;
	}

	public AGGREGATE_OFFER(PriceCurrency priceCurrency) {
		setPriceCurrency(priceCurrency);
	}

	@Override
	public PriceCurrency getPriceCurrency() {
		return priceCurrency;
	}

	@Override
	public void setPriceCurrency(PriceCurrency priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public AGGREGATE_OFFER(PriceSpecification priceSpecification) {
		setPriceSpecification(priceSpecification);
	}

	@Override
	public PriceSpecification getPriceSpecification() {
		return priceSpecification;
	}

	@Override
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		this.priceSpecification = priceSpecification;
	}

	public AGGREGATE_OFFER(PriceValidUntil priceValidUntil) {
		setPriceValidUntil(priceValidUntil);
	}

	@Override
	public PriceValidUntil getPriceValidUntil() {
		return priceValidUntil;
	}

	@Override
	public void setPriceValidUntil(PriceValidUntil priceValidUntil) {
		this.priceValidUntil = priceValidUntil;
	}

	public AGGREGATE_OFFER(Review review) {
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

	public AGGREGATE_OFFER(SameAs sameAs) {
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

	public AGGREGATE_OFFER(Seller seller) {
		setSeller(seller);
	}

	@Override
	public Seller getSeller() {
		return seller;
	}

	@Override
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public AGGREGATE_OFFER(SerialNumber serialNumber) {
		setSerialNumber(serialNumber);
	}

	@Override
	public SerialNumber getSerialNumber() {
		return serialNumber;
	}

	@Override
	public void setSerialNumber(SerialNumber serialNumber) {
		this.serialNumber = serialNumber;
	}

	public AGGREGATE_OFFER(Sku sku) {
		setSku(sku);
	}

	@Override
	public Sku getSku() {
		return sku;
	}

	@Override
	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public AGGREGATE_OFFER(Url url) {
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

	public AGGREGATE_OFFER(ValidFrom validFrom) {
		setValidFrom(validFrom);
	}

	@Override
	public ValidFrom getValidFrom() {
		return validFrom;
	}

	@Override
	public void setValidFrom(ValidFrom validFrom) {
		this.validFrom = validFrom;
	}

	public AGGREGATE_OFFER(ValidThrough validThrough) {
		setValidThrough(validThrough);
	}

	@Override
	public ValidThrough getValidThrough() {
		return validThrough;
	}

	@Override
	public void setValidThrough(ValidThrough validThrough) {
		this.validThrough = validThrough;
	}

	public AGGREGATE_OFFER(Warranty warranty) {
		setWarranty(warranty);
	}

	@Override
	public Warranty getWarranty() {
		return warranty;
	}

	@Override
	public void setWarranty(Warranty warranty) {
		this.warranty = warranty;
	}

	public AGGREGATE_OFFER(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AcceptedPaymentMethod acceptedPaymentMethod,
			AddOn addOn,
			AdditionalType additionalType,
			AdvanceBookingRequirement advanceBookingRequirement,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			AreaServed areaServed,
			Availability availability,
			AvailabilityEnds availabilityEnds,
			AvailabilityStarts availabilityStarts,
			AvailableAtOrFrom availableAtOrFrom,
			AvailableDeliveryMethod availableDeliveryMethod,
			BusinessFunction businessFunction,
			Category category,
			DeliveryLeadTime deliveryLeadTime,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			EligibleCustomerType eligibleCustomerType,
			EligibleDuration eligibleDuration,
			EligibleQuantity eligibleQuantity,
			EligibleRegion eligibleRegion,
			EligibleTransactionVolume eligibleTransactionVolume,
			Gtin12 gtin12,
			Gtin13 gtin13,
			Gtin14 gtin14,
			Gtin8 gtin8,
			HighPrice highPrice,
			Identifier identifier,
			Image image,
			IncludesObject includesObject,
			IneligibleRegion ineligibleRegion,
			InventoryLevel inventoryLevel,
			ItemCondition itemCondition,
			ItemOffered itemOffered,
			LowPrice lowPrice,
			MainEntityOfPage mainEntityOfPage,
			Mpn mpn,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			OfferCount offerCount,
			OfferedBy offeredBy,
			Offers offers,
			PotentialAction potentialAction,
			Price price,
			PriceCurrency priceCurrency,
			PriceSpecification priceSpecification,
			PriceValidUntil priceValidUntil,
			Review review,
			SameAs sameAs,
			Seller seller,
			SerialNumber serialNumber,
			Sku sku,
			Url url,
			ValidFrom validFrom,
			ValidThrough validThrough,
			Warranty warranty) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAcceptedPaymentMethod(acceptedPaymentMethod);
		setAddOn(addOn);
		setAdditionalType(additionalType);
		setAdvanceBookingRequirement(advanceBookingRequirement);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAreaServed(areaServed);
		setAvailability(availability);
		setAvailabilityEnds(availabilityEnds);
		setAvailabilityStarts(availabilityStarts);
		setAvailableAtOrFrom(availableAtOrFrom);
		setAvailableDeliveryMethod(availableDeliveryMethod);
		setBusinessFunction(businessFunction);
		setCategory(category);
		setDeliveryLeadTime(deliveryLeadTime);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setEligibleCustomerType(eligibleCustomerType);
		setEligibleDuration(eligibleDuration);
		setEligibleQuantity(eligibleQuantity);
		setEligibleRegion(eligibleRegion);
		setEligibleTransactionVolume(eligibleTransactionVolume);
		setGtin12(gtin12);
		setGtin13(gtin13);
		setGtin14(gtin14);
		setGtin8(gtin8);
		setHighPrice(highPrice);
		setIdentifier(identifier);
		setImage(image);
		setIncludesObject(includesObject);
		setIneligibleRegion(ineligibleRegion);
		setInventoryLevel(inventoryLevel);
		setItemCondition(itemCondition);
		setItemOffered(itemOffered);
		setLowPrice(lowPrice);
		setMainEntityOfPage(mainEntityOfPage);
		setMpn(mpn);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOfferCount(offerCount);
		setOfferedBy(offeredBy);
		setOffers(offers);
		setPotentialAction(potentialAction);
		setPrice(price);
		setPriceCurrency(priceCurrency);
		setPriceSpecification(priceSpecification);
		setPriceValidUntil(priceValidUntil);
		setReview(review);
		setSameAs(sameAs);
		setSeller(seller);
		setSerialNumber(serialNumber);
		setSku(sku);
		setUrl(url);
		setValidFrom(validFrom);
		setValidThrough(validThrough);
		setWarranty(warranty);
	}

	public void copy(Clazz.AggregateOffer org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAcceptedPaymentMethod(org.getAcceptedPaymentMethod());
		setAddOn(org.getAddOn());
		setAdditionalType(org.getAdditionalType());
		setAdvanceBookingRequirement(org.getAdvanceBookingRequirement());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAreaServed(org.getAreaServed());
		setAvailability(org.getAvailability());
		setAvailabilityEnds(org.getAvailabilityEnds());
		setAvailabilityStarts(org.getAvailabilityStarts());
		setAvailableAtOrFrom(org.getAvailableAtOrFrom());
		setAvailableDeliveryMethod(org.getAvailableDeliveryMethod());
		setBusinessFunction(org.getBusinessFunction());
		setCategory(org.getCategory());
		setDeliveryLeadTime(org.getDeliveryLeadTime());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEligibleCustomerType(org.getEligibleCustomerType());
		setEligibleDuration(org.getEligibleDuration());
		setEligibleQuantity(org.getEligibleQuantity());
		setEligibleRegion(org.getEligibleRegion());
		setEligibleTransactionVolume(org.getEligibleTransactionVolume());
		setGtin12(org.getGtin12());
		setGtin13(org.getGtin13());
		setGtin14(org.getGtin14());
		setGtin8(org.getGtin8());
		setHighPrice(org.getHighPrice());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIncludesObject(org.getIncludesObject());
		setIneligibleRegion(org.getIneligibleRegion());
		setInventoryLevel(org.getInventoryLevel());
		setItemCondition(org.getItemCondition());
		setItemOffered(org.getItemOffered());
		setLowPrice(org.getLowPrice());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMpn(org.getMpn());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOfferCount(org.getOfferCount());
		setOfferedBy(org.getOfferedBy());
		setOffers(org.getOffers());
		setPotentialAction(org.getPotentialAction());
		setPrice(org.getPrice());
		setPriceCurrency(org.getPriceCurrency());
		setPriceSpecification(org.getPriceSpecification());
		setPriceValidUntil(org.getPriceValidUntil());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSeller(org.getSeller());
		setSerialNumber(org.getSerialNumber());
		setSku(org.getSku());
		setUrl(org.getUrl());
		setValidFrom(org.getValidFrom());
		setValidThrough(org.getValidThrough());
		setWarranty(org.getWarranty());
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
