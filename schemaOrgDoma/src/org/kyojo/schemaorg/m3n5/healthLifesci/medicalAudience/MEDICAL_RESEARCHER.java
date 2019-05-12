package org.kyojo.schemaorg.m3n5.healthLifesci.medicalAudience;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.AudienceType;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.GeographicArea;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredGender;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredMaxAge;
import org.kyojo.schemaorg.m3n5.core.Container.RequiredMinAge;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.SuggestedGender;
import org.kyojo.schemaorg.m3n5.core.Container.SuggestedMaxAge;
import org.kyojo.schemaorg.m3n5.core.Container.SuggestedMinAge;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalAudience;
import org.kyojo.schemaorg.m3n5.meta.Container.SupersededBy;


public class MEDICAL_RESEARCHER implements MedicalAudience.MedicalResearcher {

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
	public SubjectOf subjectOf;
	public SuggestedGender suggestedGender;
	public SuggestedMaxAge suggestedMaxAge;
	public SuggestedMinAge suggestedMinAge;
	public SupersededBy supersededBy;
	public Url url;

	public MEDICAL_RESEARCHER() {
	}

	public MEDICAL_RESEARCHER(Long seq) {
		setSeq(seq);
	}

	public MEDICAL_RESEARCHER(String string) {
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

	public MEDICAL_RESEARCHER(AdditionalType additionalType) {
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

	public MEDICAL_RESEARCHER(AlternateName alternateName) {
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

	public MEDICAL_RESEARCHER(AudienceType audienceType) {
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

	public MEDICAL_RESEARCHER(Description description) {
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

	public MEDICAL_RESEARCHER(DisambiguatingDescription disambiguatingDescription) {
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

	public MEDICAL_RESEARCHER(GeographicArea geographicArea) {
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

	public MEDICAL_RESEARCHER(HealthCondition healthCondition) {
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

	public MEDICAL_RESEARCHER(Identifier identifier) {
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

	public MEDICAL_RESEARCHER(Image image) {
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

	public MEDICAL_RESEARCHER(MainEntityOfPage mainEntityOfPage) {
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

	public MEDICAL_RESEARCHER(Name name) {
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

	public MEDICAL_RESEARCHER(NameFuzzy nameFuzzy) {
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

	public MEDICAL_RESEARCHER(NameRuby nameRuby) {
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

	public MEDICAL_RESEARCHER(PotentialAction potentialAction) {
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

	public MEDICAL_RESEARCHER(RequiredGender requiredGender) {
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

	public MEDICAL_RESEARCHER(RequiredMaxAge requiredMaxAge) {
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

	public MEDICAL_RESEARCHER(RequiredMinAge requiredMinAge) {
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

	public MEDICAL_RESEARCHER(SameAs sameAs) {
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

	public MEDICAL_RESEARCHER(SubjectOf subjectOf) {
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

	public MEDICAL_RESEARCHER(SuggestedGender suggestedGender) {
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

	public MEDICAL_RESEARCHER(SuggestedMaxAge suggestedMaxAge) {
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

	public MEDICAL_RESEARCHER(SuggestedMinAge suggestedMinAge) {
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

	public MEDICAL_RESEARCHER(SupersededBy supersededBy) {
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

	public MEDICAL_RESEARCHER(Url url) {
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

	public void copy(MedicalAudience.MedicalResearcher org) {
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
		setSubjectOf(org.getSubjectOf());
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
		return MedicalAudience.MedicalResearcher.class.getAnnotation(SampleValue.class).value();
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
