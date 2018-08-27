package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.ContactPoint;
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
import org.kyojo.schemaorg.m3n3.pending.Container.BenefitsSummaryUrl;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanDrugOption;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanDrugTier;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanId;
import org.kyojo.schemaorg.m3n3.pending.Container.HealthPlanMarketingUrl;
import org.kyojo.schemaorg.m3n3.pending.Container.IncludesHealthPlanFormulary;
import org.kyojo.schemaorg.m3n3.pending.Container.IncludesHealthPlanNetwork;
import org.kyojo.schemaorg.m3n3.pending.Container.UsesHealthPlanIdStandard;

public class HEALTH_INSURANCE_PLAN implements Clazz.HealthInsurancePlan {

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
	public BenefitsSummaryUrl benefitsSummaryUrl;
	public ContactPoint contactPoint;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public HealthPlanDrugOption healthPlanDrugOption;
	public HealthPlanDrugTier healthPlanDrugTier;
	public HealthPlanId healthPlanId;
	public HealthPlanMarketingUrl healthPlanMarketingUrl;
	public Identifier identifier;
	public Image image;
	public IncludesHealthPlanFormulary includesHealthPlanFormulary;
	public IncludesHealthPlanNetwork includesHealthPlanNetwork;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public Url url;
	public UsesHealthPlanIdStandard usesHealthPlanIdStandard;

	public HEALTH_INSURANCE_PLAN() {
	}

	public HEALTH_INSURANCE_PLAN(Long seq) {
		setSeq(seq);
	}

	public HEALTH_INSURANCE_PLAN(String string) {
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

	public HEALTH_INSURANCE_PLAN(AdditionalType additionalType) {
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

	public HEALTH_INSURANCE_PLAN(AlternateName alternateName) {
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

	public HEALTH_INSURANCE_PLAN(BenefitsSummaryUrl benefitsSummaryUrl) {
		setBenefitsSummaryUrl(benefitsSummaryUrl);
	}

	@Override
	public BenefitsSummaryUrl getBenefitsSummaryUrl() {
		return benefitsSummaryUrl;
	}

	@Override
	public void setBenefitsSummaryUrl(BenefitsSummaryUrl benefitsSummaryUrl) {
		this.benefitsSummaryUrl = benefitsSummaryUrl;
	}

	public HEALTH_INSURANCE_PLAN(ContactPoint contactPoint) {
		setContactPoint(contactPoint);
	}

	@Override
	public ContactPoint getContactPoint() {
		return contactPoint;
	}

	@Override
	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	public HEALTH_INSURANCE_PLAN(Description description) {
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

	public HEALTH_INSURANCE_PLAN(DisambiguatingDescription disambiguatingDescription) {
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

	public HEALTH_INSURANCE_PLAN(HealthPlanDrugOption healthPlanDrugOption) {
		setHealthPlanDrugOption(healthPlanDrugOption);
	}

	@Override
	public HealthPlanDrugOption getHealthPlanDrugOption() {
		return healthPlanDrugOption;
	}

	@Override
	public void setHealthPlanDrugOption(HealthPlanDrugOption healthPlanDrugOption) {
		this.healthPlanDrugOption = healthPlanDrugOption;
	}

	public HEALTH_INSURANCE_PLAN(HealthPlanDrugTier healthPlanDrugTier) {
		setHealthPlanDrugTier(healthPlanDrugTier);
	}

	@Override
	public HealthPlanDrugTier getHealthPlanDrugTier() {
		return healthPlanDrugTier;
	}

	@Override
	public void setHealthPlanDrugTier(HealthPlanDrugTier healthPlanDrugTier) {
		this.healthPlanDrugTier = healthPlanDrugTier;
	}

	public HEALTH_INSURANCE_PLAN(HealthPlanId healthPlanId) {
		setHealthPlanId(healthPlanId);
	}

	@Override
	public HealthPlanId getHealthPlanId() {
		return healthPlanId;
	}

	@Override
	public void setHealthPlanId(HealthPlanId healthPlanId) {
		this.healthPlanId = healthPlanId;
	}

	public HEALTH_INSURANCE_PLAN(HealthPlanMarketingUrl healthPlanMarketingUrl) {
		setHealthPlanMarketingUrl(healthPlanMarketingUrl);
	}

	@Override
	public HealthPlanMarketingUrl getHealthPlanMarketingUrl() {
		return healthPlanMarketingUrl;
	}

	@Override
	public void setHealthPlanMarketingUrl(HealthPlanMarketingUrl healthPlanMarketingUrl) {
		this.healthPlanMarketingUrl = healthPlanMarketingUrl;
	}

	public HEALTH_INSURANCE_PLAN(Identifier identifier) {
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

	public HEALTH_INSURANCE_PLAN(Image image) {
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

	public HEALTH_INSURANCE_PLAN(IncludesHealthPlanFormulary includesHealthPlanFormulary) {
		setIncludesHealthPlanFormulary(includesHealthPlanFormulary);
	}

	@Override
	public IncludesHealthPlanFormulary getIncludesHealthPlanFormulary() {
		return includesHealthPlanFormulary;
	}

	@Override
	public void setIncludesHealthPlanFormulary(IncludesHealthPlanFormulary includesHealthPlanFormulary) {
		this.includesHealthPlanFormulary = includesHealthPlanFormulary;
	}

	public HEALTH_INSURANCE_PLAN(IncludesHealthPlanNetwork includesHealthPlanNetwork) {
		setIncludesHealthPlanNetwork(includesHealthPlanNetwork);
	}

	@Override
	public IncludesHealthPlanNetwork getIncludesHealthPlanNetwork() {
		return includesHealthPlanNetwork;
	}

	@Override
	public void setIncludesHealthPlanNetwork(IncludesHealthPlanNetwork includesHealthPlanNetwork) {
		this.includesHealthPlanNetwork = includesHealthPlanNetwork;
	}

	public HEALTH_INSURANCE_PLAN(MainEntityOfPage mainEntityOfPage) {
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

	public HEALTH_INSURANCE_PLAN(Name name) {
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

	public HEALTH_INSURANCE_PLAN(NameFuzzy nameFuzzy) {
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

	public HEALTH_INSURANCE_PLAN(NameRuby nameRuby) {
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

	public HEALTH_INSURANCE_PLAN(PotentialAction potentialAction) {
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

	public HEALTH_INSURANCE_PLAN(SameAs sameAs) {
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

	public HEALTH_INSURANCE_PLAN(Url url) {
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

	public HEALTH_INSURANCE_PLAN(UsesHealthPlanIdStandard usesHealthPlanIdStandard) {
		setUsesHealthPlanIdStandard(usesHealthPlanIdStandard);
	}

	@Override
	public UsesHealthPlanIdStandard getUsesHealthPlanIdStandard() {
		return usesHealthPlanIdStandard;
	}

	@Override
	public void setUsesHealthPlanIdStandard(UsesHealthPlanIdStandard usesHealthPlanIdStandard) {
		this.usesHealthPlanIdStandard = usesHealthPlanIdStandard;
	}

	public HEALTH_INSURANCE_PLAN(Long seq,
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
			BenefitsSummaryUrl benefitsSummaryUrl,
			ContactPoint contactPoint,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			HealthPlanDrugOption healthPlanDrugOption,
			HealthPlanDrugTier healthPlanDrugTier,
			HealthPlanId healthPlanId,
			HealthPlanMarketingUrl healthPlanMarketingUrl,
			Identifier identifier,
			Image image,
			IncludesHealthPlanFormulary includesHealthPlanFormulary,
			IncludesHealthPlanNetwork includesHealthPlanNetwork,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			SameAs sameAs,
			Url url,
			UsesHealthPlanIdStandard usesHealthPlanIdStandard) {
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
		setBenefitsSummaryUrl(benefitsSummaryUrl);
		setContactPoint(contactPoint);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setHealthPlanDrugOption(healthPlanDrugOption);
		setHealthPlanDrugTier(healthPlanDrugTier);
		setHealthPlanId(healthPlanId);
		setHealthPlanMarketingUrl(healthPlanMarketingUrl);
		setIdentifier(identifier);
		setImage(image);
		setIncludesHealthPlanFormulary(includesHealthPlanFormulary);
		setIncludesHealthPlanNetwork(includesHealthPlanNetwork);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setSameAs(sameAs);
		setUrl(url);
		setUsesHealthPlanIdStandard(usesHealthPlanIdStandard);
	}

	public void copy(Clazz.HealthInsurancePlan org) {
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
		setBenefitsSummaryUrl(org.getBenefitsSummaryUrl());
		setContactPoint(org.getContactPoint());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setHealthPlanDrugOption(org.getHealthPlanDrugOption());
		setHealthPlanDrugTier(org.getHealthPlanDrugTier());
		setHealthPlanId(org.getHealthPlanId());
		setHealthPlanMarketingUrl(org.getHealthPlanMarketingUrl());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIncludesHealthPlanFormulary(org.getIncludesHealthPlanFormulary());
		setIncludesHealthPlanNetwork(org.getIncludesHealthPlanNetwork());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
		setUrl(org.getUrl());
		setUsesHealthPlanIdStandard(org.getUsesHealthPlanIdStandard());
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
