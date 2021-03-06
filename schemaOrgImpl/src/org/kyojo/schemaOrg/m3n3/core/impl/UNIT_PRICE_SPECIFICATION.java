package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.BillingIncrement;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.EligibleQuantity;
import org.kyojo.schemaorg.m3n3.core.Container.EligibleTransactionVolume;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.MaxPrice;
import org.kyojo.schemaorg.m3n3.core.Container.MinPrice;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.Price;
import org.kyojo.schemaorg.m3n3.core.Container.PriceCurrency;
import org.kyojo.schemaorg.m3n3.core.Container.PriceType;
import org.kyojo.schemaorg.m3n3.core.Container.ReferenceQuantity;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.UnitCode;
import org.kyojo.schemaorg.m3n3.core.Container.UnitText;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.Container.ValidFrom;
import org.kyojo.schemaorg.m3n3.core.Container.ValidThrough;
import org.kyojo.schemaorg.m3n3.core.Container.ValueAddedTaxIncluded;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;

public class UNIT_PRICE_SPECIFICATION implements Clazz.UnitPriceSpecification {

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
	public BillingIncrement billingIncrement;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EligibleQuantity eligibleQuantity;
	public EligibleTransactionVolume eligibleTransactionVolume;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MaxPrice maxPrice;
	public MinPrice minPrice;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public Price price;
	public PriceCurrency priceCurrency;
	public PriceType priceType;
	public ReferenceQuantity referenceQuantity;
	public SameAs sameAs;
	public UnitCode unitCode;
	public UnitText unitText;
	public Url url;
	public ValidFrom validFrom;
	public ValidThrough validThrough;
	public ValueAddedTaxIncluded valueAddedTaxIncluded;

	public UNIT_PRICE_SPECIFICATION() {
	}

	public UNIT_PRICE_SPECIFICATION(Long seq) {
		setSeq(seq);
	}

	public UNIT_PRICE_SPECIFICATION(String string) {
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

	public UNIT_PRICE_SPECIFICATION(AdditionalType additionalType) {
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

	public UNIT_PRICE_SPECIFICATION(AlternateName alternateName) {
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

	public UNIT_PRICE_SPECIFICATION(BillingIncrement billingIncrement) {
		setBillingIncrement(billingIncrement);
	}

	@Override
	public BillingIncrement getBillingIncrement() {
		return billingIncrement;
	}

	@Override
	public void setBillingIncrement(BillingIncrement billingIncrement) {
		this.billingIncrement = billingIncrement;
	}

	public UNIT_PRICE_SPECIFICATION(Description description) {
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

	public UNIT_PRICE_SPECIFICATION(DisambiguatingDescription disambiguatingDescription) {
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

	public UNIT_PRICE_SPECIFICATION(EligibleQuantity eligibleQuantity) {
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

	public UNIT_PRICE_SPECIFICATION(EligibleTransactionVolume eligibleTransactionVolume) {
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

	public UNIT_PRICE_SPECIFICATION(Identifier identifier) {
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

	public UNIT_PRICE_SPECIFICATION(Image image) {
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

	public UNIT_PRICE_SPECIFICATION(MainEntityOfPage mainEntityOfPage) {
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

	public UNIT_PRICE_SPECIFICATION(MaxPrice maxPrice) {
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

	public UNIT_PRICE_SPECIFICATION(MinPrice minPrice) {
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

	public UNIT_PRICE_SPECIFICATION(Name name) {
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

	public UNIT_PRICE_SPECIFICATION(NameFuzzy nameFuzzy) {
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

	public UNIT_PRICE_SPECIFICATION(NameRuby nameRuby) {
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

	public UNIT_PRICE_SPECIFICATION(PotentialAction potentialAction) {
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

	public UNIT_PRICE_SPECIFICATION(Price price) {
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

	public UNIT_PRICE_SPECIFICATION(PriceCurrency priceCurrency) {
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

	public UNIT_PRICE_SPECIFICATION(PriceType priceType) {
		setPriceType(priceType);
	}

	@Override
	public PriceType getPriceType() {
		return priceType;
	}

	@Override
	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}

	public UNIT_PRICE_SPECIFICATION(ReferenceQuantity referenceQuantity) {
		setReferenceQuantity(referenceQuantity);
	}

	@Override
	public ReferenceQuantity getReferenceQuantity() {
		return referenceQuantity;
	}

	@Override
	public void setReferenceQuantity(ReferenceQuantity referenceQuantity) {
		this.referenceQuantity = referenceQuantity;
	}

	public UNIT_PRICE_SPECIFICATION(SameAs sameAs) {
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

	public UNIT_PRICE_SPECIFICATION(UnitCode unitCode) {
		setUnitCode(unitCode);
	}

	@Override
	public UnitCode getUnitCode() {
		return unitCode;
	}

	@Override
	public void setUnitCode(UnitCode unitCode) {
		this.unitCode = unitCode;
	}

	public UNIT_PRICE_SPECIFICATION(UnitText unitText) {
		setUnitText(unitText);
	}

	@Override
	public UnitText getUnitText() {
		return unitText;
	}

	@Override
	public void setUnitText(UnitText unitText) {
		this.unitText = unitText;
	}

	public UNIT_PRICE_SPECIFICATION(Url url) {
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

	public UNIT_PRICE_SPECIFICATION(ValidFrom validFrom) {
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

	public UNIT_PRICE_SPECIFICATION(ValidThrough validThrough) {
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

	public UNIT_PRICE_SPECIFICATION(ValueAddedTaxIncluded valueAddedTaxIncluded) {
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

	public UNIT_PRICE_SPECIFICATION(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AlternateName alternateName,
			BillingIncrement billingIncrement,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			EligibleQuantity eligibleQuantity,
			EligibleTransactionVolume eligibleTransactionVolume,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			MaxPrice maxPrice,
			MinPrice minPrice,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			Price price,
			PriceCurrency priceCurrency,
			PriceType priceType,
			ReferenceQuantity referenceQuantity,
			SameAs sameAs,
			UnitCode unitCode,
			UnitText unitText,
			Url url,
			ValidFrom validFrom,
			ValidThrough validThrough,
			ValueAddedTaxIncluded valueAddedTaxIncluded) {
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
		setAlternateName(alternateName);
		setBillingIncrement(billingIncrement);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setEligibleQuantity(eligibleQuantity);
		setEligibleTransactionVolume(eligibleTransactionVolume);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setMaxPrice(maxPrice);
		setMinPrice(minPrice);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setPrice(price);
		setPriceCurrency(priceCurrency);
		setPriceType(priceType);
		setReferenceQuantity(referenceQuantity);
		setSameAs(sameAs);
		setUnitCode(unitCode);
		setUnitText(unitText);
		setUrl(url);
		setValidFrom(validFrom);
		setValidThrough(validThrough);
		setValueAddedTaxIncluded(valueAddedTaxIncluded);
	}

	public void copy(Clazz.UnitPriceSpecification org) {
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
		setBillingIncrement(org.getBillingIncrement());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEligibleQuantity(org.getEligibleQuantity());
		setEligibleTransactionVolume(org.getEligibleTransactionVolume());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaxPrice(org.getMaxPrice());
		setMinPrice(org.getMinPrice());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setPrice(org.getPrice());
		setPriceCurrency(org.getPriceCurrency());
		setPriceType(org.getPriceType());
		setReferenceQuantity(org.getReferenceQuantity());
		setSameAs(org.getSameAs());
		setUnitCode(org.getUnitCode());
		setUnitText(org.getUnitText());
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
