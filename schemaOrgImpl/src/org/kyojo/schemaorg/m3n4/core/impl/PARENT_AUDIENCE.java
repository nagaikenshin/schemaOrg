package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.AudienceType;
import org.kyojo.schemaorg.m3n4.core.Container.ChildMaxAge;
import org.kyojo.schemaorg.m3n4.core.Container.ChildMinAge;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.GeographicArea;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredGender;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMaxAge;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMinAge;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedGender;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedMaxAge;
import org.kyojo.schemaorg.m3n4.core.Container.SuggestedMinAge;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HealthCondition;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class PARENT_AUDIENCE implements Clazz.ParentAudience {

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
	public ChildMaxAge childMaxAge;
	public ChildMinAge childMinAge;
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
	public Url url;

	public PARENT_AUDIENCE() {
	}

	public PARENT_AUDIENCE(Long seq) {
		setSeq(seq);
	}

	public PARENT_AUDIENCE(String string) {
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

	public PARENT_AUDIENCE(AdditionalType additionalType) {
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

	public PARENT_AUDIENCE(AlternateName alternateName) {
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

	public PARENT_AUDIENCE(AudienceType audienceType) {
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

	public PARENT_AUDIENCE(ChildMaxAge childMaxAge) {
		setChildMaxAge(childMaxAge);
	}

	@Override
	public ChildMaxAge getChildMaxAge() {
		return childMaxAge;
	}

	@Override
	public void setChildMaxAge(ChildMaxAge childMaxAge) {
		this.childMaxAge = childMaxAge;
	}

	public PARENT_AUDIENCE(ChildMinAge childMinAge) {
		setChildMinAge(childMinAge);
	}

	@Override
	public ChildMinAge getChildMinAge() {
		return childMinAge;
	}

	@Override
	public void setChildMinAge(ChildMinAge childMinAge) {
		this.childMinAge = childMinAge;
	}

	public PARENT_AUDIENCE(Description description) {
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

	public PARENT_AUDIENCE(DisambiguatingDescription disambiguatingDescription) {
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

	public PARENT_AUDIENCE(GeographicArea geographicArea) {
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

	public PARENT_AUDIENCE(HealthCondition healthCondition) {
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

	public PARENT_AUDIENCE(Identifier identifier) {
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

	public PARENT_AUDIENCE(Image image) {
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

	public PARENT_AUDIENCE(MainEntityOfPage mainEntityOfPage) {
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

	public PARENT_AUDIENCE(Name name) {
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

	public PARENT_AUDIENCE(NameFuzzy nameFuzzy) {
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

	public PARENT_AUDIENCE(NameRuby nameRuby) {
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

	public PARENT_AUDIENCE(PotentialAction potentialAction) {
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

	public PARENT_AUDIENCE(RequiredGender requiredGender) {
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

	public PARENT_AUDIENCE(RequiredMaxAge requiredMaxAge) {
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

	public PARENT_AUDIENCE(RequiredMinAge requiredMinAge) {
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

	public PARENT_AUDIENCE(SameAs sameAs) {
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

	public PARENT_AUDIENCE(SubjectOf subjectOf) {
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

	public PARENT_AUDIENCE(SuggestedGender suggestedGender) {
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

	public PARENT_AUDIENCE(SuggestedMaxAge suggestedMaxAge) {
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

	public PARENT_AUDIENCE(SuggestedMinAge suggestedMinAge) {
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

	public PARENT_AUDIENCE(Url url) {
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

	public PARENT_AUDIENCE(Long seq,
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
			ChildMaxAge childMaxAge,
			ChildMinAge childMinAge,
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
			SubjectOf subjectOf,
			SuggestedGender suggestedGender,
			SuggestedMaxAge suggestedMaxAge,
			SuggestedMinAge suggestedMinAge,
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
		setChildMaxAge(childMaxAge);
		setChildMinAge(childMinAge);
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
		setSubjectOf(subjectOf);
		setSuggestedGender(suggestedGender);
		setSuggestedMaxAge(suggestedMaxAge);
		setSuggestedMinAge(suggestedMinAge);
		setUrl(url);
	}

	public void copy(Clazz.ParentAudience org) {
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
		setChildMaxAge(org.getChildMaxAge());
		setChildMinAge(org.getChildMinAge());
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
