package org.kyojo.schemaOrg.m3n3.healthLifesci.medicalAudience;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.AudienceType;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.GeographicArea;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiredGender;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiredMaxAge;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiredMinAge;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedGender;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedMaxAge;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedMinAge;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaOrg.m3n3.healthLifesci.MedicalAudience;
import org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy;


public class CLINICIAN implements MedicalAudience.Clinician {

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
	public AudienceType audienceType;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public GeographicArea geographicArea;
	public HealthCondition healthCondition;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public RequiredGender requiredGender;
	public RequiredMaxAge requiredMaxAge;
	public RequiredMinAge requiredMinAge;
	public SameAs sameAs;
	public SuggestedGender suggestedGender;
	public SuggestedMaxAge suggestedMaxAge;
	public SuggestedMinAge suggestedMinAge;
	public SupersededBy supersededBy;
	public Url url;

	public CLINICIAN() {
	}

	public CLINICIAN(Long seq) {
		setSeq(seq);
	}

	public CLINICIAN(String string) {
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

	public CLINICIAN(AdditionalType additionalType) {
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

	public CLINICIAN(AlternateName alternateName) {
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

	public CLINICIAN(AudienceType audienceType) {
		setAudienceType(audienceType);
	}

	@Override
	public AudienceType getAudienceType() {
		return audienceType;
	}

	@Override
	public void setAudienceType(AudienceType audienceType) {
		this.audienceType = audienceType;
	}

	public CLINICIAN(Description description) {
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

	public CLINICIAN(DisambiguatingDescription disambiguatingDescription) {
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

	public CLINICIAN(GeographicArea geographicArea) {
		setGeographicArea(geographicArea);
	}

	@Override
	public GeographicArea getGeographicArea() {
		return geographicArea;
	}

	@Override
	public void setGeographicArea(GeographicArea geographicArea) {
		this.geographicArea = geographicArea;
	}

	public CLINICIAN(HealthCondition healthCondition) {
		setHealthCondition(healthCondition);
	}

	@Override
	public HealthCondition getHealthCondition() {
		return healthCondition;
	}

	@Override
	public void setHealthCondition(HealthCondition healthCondition) {
		this.healthCondition = healthCondition;
	}

	public CLINICIAN(Identifier identifier) {
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

	public CLINICIAN(Image image) {
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

	public CLINICIAN(MainEntityOfPage mainEntityOfPage) {
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

	public CLINICIAN(Name name) {
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

	public CLINICIAN(NameFuzzy nameFuzzy) {
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

	public CLINICIAN(NameRuby nameRuby) {
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

	public CLINICIAN(PotentialAction potentialAction) {
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

	public CLINICIAN(RequiredGender requiredGender) {
		setRequiredGender(requiredGender);
	}

	@Override
	public RequiredGender getRequiredGender() {
		return requiredGender;
	}

	@Override
	public void setRequiredGender(RequiredGender requiredGender) {
		this.requiredGender = requiredGender;
	}

	public CLINICIAN(RequiredMaxAge requiredMaxAge) {
		setRequiredMaxAge(requiredMaxAge);
	}

	@Override
	public RequiredMaxAge getRequiredMaxAge() {
		return requiredMaxAge;
	}

	@Override
	public void setRequiredMaxAge(RequiredMaxAge requiredMaxAge) {
		this.requiredMaxAge = requiredMaxAge;
	}

	public CLINICIAN(RequiredMinAge requiredMinAge) {
		setRequiredMinAge(requiredMinAge);
	}

	@Override
	public RequiredMinAge getRequiredMinAge() {
		return requiredMinAge;
	}

	@Override
	public void setRequiredMinAge(RequiredMinAge requiredMinAge) {
		this.requiredMinAge = requiredMinAge;
	}

	public CLINICIAN(SameAs sameAs) {
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

	public CLINICIAN(SuggestedGender suggestedGender) {
		setSuggestedGender(suggestedGender);
	}

	@Override
	public SuggestedGender getSuggestedGender() {
		return suggestedGender;
	}

	@Override
	public void setSuggestedGender(SuggestedGender suggestedGender) {
		this.suggestedGender = suggestedGender;
	}

	public CLINICIAN(SuggestedMaxAge suggestedMaxAge) {
		setSuggestedMaxAge(suggestedMaxAge);
	}

	@Override
	public SuggestedMaxAge getSuggestedMaxAge() {
		return suggestedMaxAge;
	}

	@Override
	public void setSuggestedMaxAge(SuggestedMaxAge suggestedMaxAge) {
		this.suggestedMaxAge = suggestedMaxAge;
	}

	public CLINICIAN(SuggestedMinAge suggestedMinAge) {
		setSuggestedMinAge(suggestedMinAge);
	}

	@Override
	public SuggestedMinAge getSuggestedMinAge() {
		return suggestedMinAge;
	}

	@Override
	public void setSuggestedMinAge(SuggestedMinAge suggestedMinAge) {
		this.suggestedMinAge = suggestedMinAge;
	}

	public CLINICIAN(SupersededBy supersededBy) {
		setSupersededBy(supersededBy);
	}

	@Override
	public SupersededBy getSupersededBy() {
		return supersededBy;
	}

	@Override
	public void setSupersededBy(SupersededBy supersededBy) {
		this.supersededBy = supersededBy;
	}

	public CLINICIAN(Url url) {
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

	public CLINICIAN(Long seq,
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
			AudienceType audienceType,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			GeographicArea geographicArea,
			HealthCondition healthCondition,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			RequiredGender requiredGender,
			RequiredMaxAge requiredMaxAge,
			RequiredMinAge requiredMinAge,
			SameAs sameAs,
			SuggestedGender suggestedGender,
			SuggestedMaxAge suggestedMaxAge,
			SuggestedMinAge suggestedMinAge,
			SupersededBy supersededBy,
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
		setAudienceType(audienceType);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setGeographicArea(geographicArea);
		setHealthCondition(healthCondition);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setRequiredGender(requiredGender);
		setRequiredMaxAge(requiredMaxAge);
		setRequiredMinAge(requiredMinAge);
		setSameAs(sameAs);
		setSuggestedGender(suggestedGender);
		setSuggestedMaxAge(suggestedMaxAge);
		setSuggestedMinAge(suggestedMinAge);
		setSupersededBy(supersededBy);
		setUrl(url);
	}

	public void copy(MedicalAudience.Clinician org) {
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
		setAudienceType(org.getAudienceType());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setGeographicArea(org.getGeographicArea());
		setHealthCondition(org.getHealthCondition());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setRequiredGender(org.getRequiredGender());
		setRequiredMaxAge(org.getRequiredMaxAge());
		setRequiredMinAge(org.getRequiredMinAge());
		setSameAs(org.getSameAs());
		setSuggestedGender(org.getSuggestedGender());
		setSuggestedMaxAge(org.getSuggestedMaxAge());
		setSuggestedMinAge(org.getSuggestedMinAge());
		setSupersededBy(org.getSupersededBy());
		setUrl(org.getUrl());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return MedicalAudience.Clinician.class.getAnnotation(SampleValue.class).value();
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
