package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AcceptedPaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Container.AddOn;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AdvanceBookingRequirement;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n5.core.Container.Availability;
import org.kyojo.schemaorg.m3n5.core.Container.AvailabilityEnds;
import org.kyojo.schemaorg.m3n5.core.Container.AvailabilityStarts;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableAtOrFrom;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableDeliveryMethod;
import org.kyojo.schemaorg.m3n5.core.Container.BusinessFunction;
import org.kyojo.schemaorg.m3n5.core.Container.Category;
import org.kyojo.schemaorg.m3n5.core.Container.DeliveryLeadTime;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleCustomerType;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleDuration;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleQuantity;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleRegion;
import org.kyojo.schemaorg.m3n5.core.Container.EligibleTransactionVolume;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin12;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin13;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin14;
import org.kyojo.schemaorg.m3n5.core.Container.Gtin8;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.IncludesObject;
import org.kyojo.schemaorg.m3n5.core.Container.IneligibleRegion;
import org.kyojo.schemaorg.m3n5.core.Container.InventoryLevel;
import org.kyojo.schemaorg.m3n5.core.Container.ItemCondition;
import org.kyojo.schemaorg.m3n5.core.Container.ItemOffered;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Mpn;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.OfferedBy;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.Price;
import org.kyojo.schemaorg.m3n5.core.Container.PriceCurrency;
import org.kyojo.schemaorg.m3n5.core.Container.PriceSpecification;
import org.kyojo.schemaorg.m3n5.core.Container.PriceValidUntil;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.Seller;
import org.kyojo.schemaorg.m3n5.core.Container.SerialNumber;
import org.kyojo.schemaorg.m3n5.core.Container.Sku;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.ValidFrom;
import org.kyojo.schemaorg.m3n5.core.Container.ValidThrough;
import org.kyojo.schemaorg.m3n5.core.Container.Warranty;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;


public class OFFER implements Clazz.Offer {

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
	public Identifier identifier;
	public Image image;
	public IncludesObject includesObject;
	public IneligibleRegion ineligibleRegion;
	public InventoryLevel inventoryLevel;
	public ItemCondition itemCondition;
	public ItemOffered itemOffered;
	public MainEntityOfPage mainEntityOfPage;
	public Mpn mpn;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OfferedBy offeredBy;
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
	public SubjectOf subjectOf;
	public Url url;
	public ValidFrom validFrom;
	public ValidThrough validThrough;
	public Warranty warranty;

	public OFFER() {
	}

	public OFFER(Long seq) {
		setSeq(seq);
	}

	public OFFER(String string) {
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

	public OFFER(AcceptedPaymentMethod acceptedPaymentMethod) {
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

	public OFFER(AddOn addOn) {
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

	public OFFER(AdditionalType additionalType) {
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

	public OFFER(AdvanceBookingRequirement advanceBookingRequirement) {
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

	public OFFER(AggregateRating aggregateRating) {
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

	public OFFER(AlternateName alternateName) {
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

	public OFFER(AreaServed areaServed) {
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

	public OFFER(Availability availability) {
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

	public OFFER(AvailabilityEnds availabilityEnds) {
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

	public OFFER(AvailabilityStarts availabilityStarts) {
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

	public OFFER(AvailableAtOrFrom availableAtOrFrom) {
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

	public OFFER(AvailableDeliveryMethod availableDeliveryMethod) {
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

	public OFFER(BusinessFunction businessFunction) {
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

	public OFFER(Category category) {
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

	public OFFER(DeliveryLeadTime deliveryLeadTime) {
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

	public OFFER(Description description) {
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

	public OFFER(DisambiguatingDescription disambiguatingDescription) {
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

	public OFFER(EligibleCustomerType eligibleCustomerType) {
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

	public OFFER(EligibleDuration eligibleDuration) {
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

	public OFFER(EligibleQuantity eligibleQuantity) {
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

	public OFFER(EligibleRegion eligibleRegion) {
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

	public OFFER(EligibleTransactionVolume eligibleTransactionVolume) {
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

	public OFFER(Gtin12 gtin12) {
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

	public OFFER(Gtin13 gtin13) {
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

	public OFFER(Gtin14 gtin14) {
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

	public OFFER(Gtin8 gtin8) {
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

	public OFFER(Identifier identifier) {
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

	public OFFER(Image image) {
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

	public OFFER(IncludesObject includesObject) {
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

	public OFFER(IneligibleRegion ineligibleRegion) {
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

	public OFFER(InventoryLevel inventoryLevel) {
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

	public OFFER(ItemCondition itemCondition) {
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

	public OFFER(ItemOffered itemOffered) {
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

	public OFFER(MainEntityOfPage mainEntityOfPage) {
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

	public OFFER(Mpn mpn) {
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

	public OFFER(Name name) {
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

	public OFFER(NameFuzzy nameFuzzy) {
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

	public OFFER(NameRuby nameRuby) {
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

	public OFFER(OfferedBy offeredBy) {
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

	public OFFER(PotentialAction potentialAction) {
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

	public OFFER(Price price) {
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

	public OFFER(PriceCurrency priceCurrency) {
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

	public OFFER(PriceSpecification priceSpecification) {
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

	public OFFER(PriceValidUntil priceValidUntil) {
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

	public OFFER(Review review) {
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

	public OFFER(SameAs sameAs) {
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

	public OFFER(Seller seller) {
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

	public OFFER(SerialNumber serialNumber) {
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

	public OFFER(Sku sku) {
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

	public OFFER(SubjectOf subjectOf) {
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

	public OFFER(Url url) {
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

	public OFFER(ValidFrom validFrom) {
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

	public OFFER(ValidThrough validThrough) {
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

	public OFFER(Warranty warranty) {
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

	public void copy(Clazz.Offer org) {
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
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIncludesObject(org.getIncludesObject());
		setIneligibleRegion(org.getIneligibleRegion());
		setInventoryLevel(org.getInventoryLevel());
		setItemCondition(org.getItemCondition());
		setItemOffered(org.getItemOffered());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMpn(org.getMpn());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOfferedBy(org.getOfferedBy());
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
		setSubjectOf(org.getSubjectOf());
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
