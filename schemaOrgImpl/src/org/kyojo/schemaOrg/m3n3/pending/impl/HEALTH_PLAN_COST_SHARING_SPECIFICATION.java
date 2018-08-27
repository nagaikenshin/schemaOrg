package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;
import org.kyojo.schemaorg.m3n3.pending.Clazz;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanCoinsuranceOption;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanCoinsuranceRate;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanCopay;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanCopayOption;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanPharmacyCategory;

public class HEALTH_PLAN_COST_SHARING_SPECIFICATION implements Clazz.HealthPlanCostSharingSpecification {

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
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HealthPlanCoinsuranceOption healthPlanCoinsuranceOption;
	public HealthPlanCoinsuranceRate healthPlanCoinsuranceRate;
	public HealthPlanCopay healthPlanCopay;
	public HealthPlanCopayOption healthPlanCopayOption;
	public HealthPlanPharmacyCategory healthPlanPharmacyCategory;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public Url url;

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION() {
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Long seq) {
		setSeq(seq);
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(String string) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(AdditionalType additionalType) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(AlternateName alternateName) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Description description) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(DisambiguatingDescription disambiguatingDescription) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(HealthPlanCoinsuranceOption healthPlanCoinsuranceOption) {
		setHealthPlanCoinsuranceOption(healthPlanCoinsuranceOption);
	}

	@Override
	public HealthPlanCoinsuranceOption getHealthPlanCoinsuranceOption() {
		return healthPlanCoinsuranceOption;
	}

	@Override
	public void setHealthPlanCoinsuranceOption(HealthPlanCoinsuranceOption healthPlanCoinsuranceOption) {
		this.healthPlanCoinsuranceOption = healthPlanCoinsuranceOption;
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(HealthPlanCoinsuranceRate healthPlanCoinsuranceRate) {
		setHealthPlanCoinsuranceRate(healthPlanCoinsuranceRate);
	}

	@Override
	public HealthPlanCoinsuranceRate getHealthPlanCoinsuranceRate() {
		return healthPlanCoinsuranceRate;
	}

	@Override
	public void setHealthPlanCoinsuranceRate(HealthPlanCoinsuranceRate healthPlanCoinsuranceRate) {
		this.healthPlanCoinsuranceRate = healthPlanCoinsuranceRate;
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(HealthPlanCopay healthPlanCopay) {
		setHealthPlanCopay(healthPlanCopay);
	}

	@Override
	public HealthPlanCopay getHealthPlanCopay() {
		return healthPlanCopay;
	}

	@Override
	public void setHealthPlanCopay(HealthPlanCopay healthPlanCopay) {
		this.healthPlanCopay = healthPlanCopay;
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(HealthPlanCopayOption healthPlanCopayOption) {
		setHealthPlanCopayOption(healthPlanCopayOption);
	}

	@Override
	public HealthPlanCopayOption getHealthPlanCopayOption() {
		return healthPlanCopayOption;
	}

	@Override
	public void setHealthPlanCopayOption(HealthPlanCopayOption healthPlanCopayOption) {
		this.healthPlanCopayOption = healthPlanCopayOption;
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(HealthPlanPharmacyCategory healthPlanPharmacyCategory) {
		setHealthPlanPharmacyCategory(healthPlanPharmacyCategory);
	}

	@Override
	public HealthPlanPharmacyCategory getHealthPlanPharmacyCategory() {
		return healthPlanPharmacyCategory;
	}

	@Override
	public void setHealthPlanPharmacyCategory(HealthPlanPharmacyCategory healthPlanPharmacyCategory) {
		this.healthPlanPharmacyCategory = healthPlanPharmacyCategory;
	}

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Identifier identifier) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Image image) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(MainEntityOfPage mainEntityOfPage) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Name name) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(NameFuzzy nameFuzzy) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(NameRuby nameRuby) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(PotentialAction potentialAction) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(SameAs sameAs) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Url url) {
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

	public HEALTH_PLAN_COST_SHARING_SPECIFICATION(Long seq,
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
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			HealthPlanCoinsuranceOption healthPlanCoinsuranceOption,
			HealthPlanCoinsuranceRate healthPlanCoinsuranceRate,
			HealthPlanCopay healthPlanCopay,
			HealthPlanCopayOption healthPlanCopayOption,
			HealthPlanPharmacyCategory healthPlanPharmacyCategory,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			SameAs sameAs,
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
		setAlternateName(alternateName);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setHealthPlanCoinsuranceOption(healthPlanCoinsuranceOption);
		setHealthPlanCoinsuranceRate(healthPlanCoinsuranceRate);
		setHealthPlanCopay(healthPlanCopay);
		setHealthPlanCopayOption(healthPlanCopayOption);
		setHealthPlanPharmacyCategory(healthPlanPharmacyCategory);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setSameAs(sameAs);
		setUrl(url);
	}

	public void copy(Clazz.HealthPlanCostSharingSpecification org) {
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
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHealthPlanCoinsuranceOption(org.getHealthPlanCoinsuranceOption());
		setHealthPlanCoinsuranceRate(org.getHealthPlanCoinsuranceRate());
		setHealthPlanCopay(org.getHealthPlanCopay());
		setHealthPlanCopayOption(org.getHealthPlanCopayOption());
		setHealthPlanPharmacyCategory(org.getHealthPlanPharmacyCategory());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
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
