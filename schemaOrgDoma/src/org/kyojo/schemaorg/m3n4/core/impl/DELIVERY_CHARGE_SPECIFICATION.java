package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AppliesToDeliveryMethod;
import org.kyojo.schemaorg.m3n4.core.Container.AreaServed;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleQuantity;
import org.kyojo.schemaorg.m3n4.core.Container.EligibleTransactionVolume;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.IneligibleRegion;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.MaxPrice;
import org.kyojo.schemaorg.m3n4.core.Container.MinPrice;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Price;
import org.kyojo.schemaorg.m3n4.core.Container.PriceCurrency;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.ValidFrom;
import org.kyojo.schemaorg.m3n4.core.Container.ValidThrough;
import org.kyojo.schemaorg.m3n4.core.Container.ValueAddedTaxIncluded;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.EligibleRegion;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class DELIVERY_CHARGE_SPECIFICATION implements Clazz.DeliveryChargeSpecification {

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
	public AlternateName alternateName;
	public AppliesToDeliveryMethod appliesToDeliveryMethod;
	public AreaServed areaServed;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EligibleQuantity eligibleQuantity;
	public EligibleRegion eligibleRegion;
	public EligibleTransactionVolume eligibleTransactionVolume;
	public Identifier identifier;
	public Image image;
	public IneligibleRegion ineligibleRegion;
	public MainEntityOfPage mainEntityOfPage;
	public MaxPrice maxPrice;
	public MinPrice minPrice;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public Price price;
	public PriceCurrency priceCurrency;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public Url url;
	public ValidFrom validFrom;
	public ValidThrough validThrough;
	public ValueAddedTaxIncluded valueAddedTaxIncluded;

	public DELIVERY_CHARGE_SPECIFICATION() {
	}

	public DELIVERY_CHARGE_SPECIFICATION(Long seq) {
		setSeq(seq);
	}

	public DELIVERY_CHARGE_SPECIFICATION(String string) {
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

	public DELIVERY_CHARGE_SPECIFICATION(AdditionalType additionalType) {
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

	public DELIVERY_CHARGE_SPECIFICATION(AlternateName alternateName) {
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

	public DELIVERY_CHARGE_SPECIFICATION(AppliesToDeliveryMethod appliesToDeliveryMethod) {
		setAppliesToDeliveryMethod(appliesToDeliveryMethod);
	}

	@Override
	public AppliesToDeliveryMethod getAppliesToDeliveryMethod() {
		return appliesToDeliveryMethod;
	}

	@Override
	public void setAppliesToDeliveryMethod(AppliesToDeliveryMethod appliesToDeliveryMethod) {
		this.appliesToDeliveryMethod = appliesToDeliveryMethod;
	}

	public DELIVERY_CHARGE_SPECIFICATION(AreaServed areaServed) {
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

	public DELIVERY_CHARGE_SPECIFICATION(Description description) {
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

	public DELIVERY_CHARGE_SPECIFICATION(DisambiguatingDescription disambiguatingDescription) {
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

	public DELIVERY_CHARGE_SPECIFICATION(EligibleQuantity eligibleQuantity) {
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

	public DELIVERY_CHARGE_SPECIFICATION(EligibleRegion eligibleRegion) {
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

	public DELIVERY_CHARGE_SPECIFICATION(EligibleTransactionVolume eligibleTransactionVolume) {
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

	public DELIVERY_CHARGE_SPECIFICATION(Identifier identifier) {
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

	public DELIVERY_CHARGE_SPECIFICATION(Image image) {
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

	public DELIVERY_CHARGE_SPECIFICATION(IneligibleRegion ineligibleRegion) {
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

	public DELIVERY_CHARGE_SPECIFICATION(MainEntityOfPage mainEntityOfPage) {
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

	public DELIVERY_CHARGE_SPECIFICATION(MaxPrice maxPrice) {
		setMaxPrice(maxPrice);
	}

	@Override
	public MaxPrice getMaxPrice() {
		return maxPrice;
	}

	@Override
	public void setMaxPrice(MaxPrice maxPrice) {
		this.maxPrice = maxPrice;
	}

	public DELIVERY_CHARGE_SPECIFICATION(MinPrice minPrice) {
		setMinPrice(minPrice);
	}

	@Override
	public MinPrice getMinPrice() {
		return minPrice;
	}

	@Override
	public void setMinPrice(MinPrice minPrice) {
		this.minPrice = minPrice;
	}

	public DELIVERY_CHARGE_SPECIFICATION(Name name) {
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

	public DELIVERY_CHARGE_SPECIFICATION(NameFuzzy nameFuzzy) {
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

	public DELIVERY_CHARGE_SPECIFICATION(NameRuby nameRuby) {
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

	public DELIVERY_CHARGE_SPECIFICATION(PotentialAction potentialAction) {
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

	public DELIVERY_CHARGE_SPECIFICATION(Price price) {
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

	public DELIVERY_CHARGE_SPECIFICATION(PriceCurrency priceCurrency) {
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

	public DELIVERY_CHARGE_SPECIFICATION(SameAs sameAs) {
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

	public DELIVERY_CHARGE_SPECIFICATION(SubjectOf subjectOf) {
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

	public DELIVERY_CHARGE_SPECIFICATION(Url url) {
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

	public DELIVERY_CHARGE_SPECIFICATION(ValidFrom validFrom) {
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

	public DELIVERY_CHARGE_SPECIFICATION(ValidThrough validThrough) {
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

	public DELIVERY_CHARGE_SPECIFICATION(ValueAddedTaxIncluded valueAddedTaxIncluded) {
		setValueAddedTaxIncluded(valueAddedTaxIncluded);
	}

	@Override
	public ValueAddedTaxIncluded getValueAddedTaxIncluded() {
		return valueAddedTaxIncluded;
	}

	@Override
	public void setValueAddedTaxIncluded(ValueAddedTaxIncluded valueAddedTaxIncluded) {
		this.valueAddedTaxIncluded = valueAddedTaxIncluded;
	}

	public void copy(Clazz.DeliveryChargeSpecification org) {
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
		setAlternateName(org.getAlternateName());
		setAppliesToDeliveryMethod(org.getAppliesToDeliveryMethod());
		setAreaServed(org.getAreaServed());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEligibleQuantity(org.getEligibleQuantity());
		setEligibleRegion(org.getEligibleRegion());
		setEligibleTransactionVolume(org.getEligibleTransactionVolume());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIneligibleRegion(org.getIneligibleRegion());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaxPrice(org.getMaxPrice());
		setMinPrice(org.getMinPrice());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setPrice(org.getPrice());
		setPriceCurrency(org.getPriceCurrency());
		setSameAs(org.getSameAs());
		setSubjectOf(org.getSubjectOf());
		setUrl(org.getUrl());
		setValidFrom(org.getValidFrom());
		setValidThrough(org.getValidThrough());
		setValueAddedTaxIncluded(org.getValueAddedTaxIncluded());
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
