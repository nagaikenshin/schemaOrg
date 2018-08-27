package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Clazz;
import org.kyojo.schemaorg.m3n4.pending.Container.EducationRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.EstimatedSalary;
import org.kyojo.schemaorg.m3n4.pending.Container.ExperienceRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationLocation;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationalCategory;
import org.kyojo.schemaorg.m3n4.pending.Container.Qualifications;
import org.kyojo.schemaorg.m3n4.pending.Container.Responsibilities;
import org.kyojo.schemaorg.m3n4.pending.Container.Skills;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class OCCUPATION implements Clazz.Occupation {

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
	public EducationRequirements educationRequirements;
	public EstimatedSalary estimatedSalary;
	public ExperienceRequirements experienceRequirements;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OccupationLocation occupationLocation;
	public OccupationalCategory occupationalCategory;
	public PotentialAction potentialAction;
	public Qualifications qualifications;
	public Responsibilities responsibilities;
	public SameAs sameAs;
	public Skills skills;
	public SubjectOf subjectOf;
	public Url url;

	public OCCUPATION() {
	}

	public OCCUPATION(Long seq) {
		setSeq(seq);
	}

	public OCCUPATION(String string) {
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

	public OCCUPATION(AdditionalType additionalType) {
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

	public OCCUPATION(AlternateName alternateName) {
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

	public OCCUPATION(Description description) {
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

	public OCCUPATION(DisambiguatingDescription disambiguatingDescription) {
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

	public OCCUPATION(EducationRequirements educationRequirements) {
		setEducationRequirements(educationRequirements);
	}

	@Override
	public EducationRequirements getEducationRequirements() {
		return educationRequirements;
	}

	@Override
	public void setEducationRequirements(EducationRequirements educationRequirements) {
		this.educationRequirements = educationRequirements;
	}

	public OCCUPATION(EstimatedSalary estimatedSalary) {
		setEstimatedSalary(estimatedSalary);
	}

	@Override
	public EstimatedSalary getEstimatedSalary() {
		return estimatedSalary;
	}

	@Override
	public void setEstimatedSalary(EstimatedSalary estimatedSalary) {
		this.estimatedSalary = estimatedSalary;
	}

	public OCCUPATION(ExperienceRequirements experienceRequirements) {
		setExperienceRequirements(experienceRequirements);
	}

	@Override
	public ExperienceRequirements getExperienceRequirements() {
		return experienceRequirements;
	}

	@Override
	public void setExperienceRequirements(ExperienceRequirements experienceRequirements) {
		this.experienceRequirements = experienceRequirements;
	}

	public OCCUPATION(Identifier identifier) {
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

	public OCCUPATION(Image image) {
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

	public OCCUPATION(MainEntityOfPage mainEntityOfPage) {
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

	public OCCUPATION(Name name) {
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

	public OCCUPATION(NameFuzzy nameFuzzy) {
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

	public OCCUPATION(NameRuby nameRuby) {
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

	public OCCUPATION(OccupationLocation occupationLocation) {
		setOccupationLocation(occupationLocation);
	}

	@Override
	public OccupationLocation getOccupationLocation() {
		return occupationLocation;
	}

	@Override
	public void setOccupationLocation(OccupationLocation occupationLocation) {
		this.occupationLocation = occupationLocation;
	}

	public OCCUPATION(OccupationalCategory occupationalCategory) {
		setOccupationalCategory(occupationalCategory);
	}

	@Override
	public OccupationalCategory getOccupationalCategory() {
		return occupationalCategory;
	}

	@Override
	public void setOccupationalCategory(OccupationalCategory occupationalCategory) {
		this.occupationalCategory = occupationalCategory;
	}

	public OCCUPATION(PotentialAction potentialAction) {
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

	public OCCUPATION(Qualifications qualifications) {
		setQualifications(qualifications);
	}

	@Override
	public Qualifications getQualifications() {
		return qualifications;
	}

	@Override
	public void setQualifications(Qualifications qualifications) {
		this.qualifications = qualifications;
	}

	public OCCUPATION(Responsibilities responsibilities) {
		setResponsibilities(responsibilities);
	}

	@Override
	public Responsibilities getResponsibilities() {
		return responsibilities;
	}

	@Override
	public void setResponsibilities(Responsibilities responsibilities) {
		this.responsibilities = responsibilities;
	}

	public OCCUPATION(SameAs sameAs) {
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

	public OCCUPATION(Skills skills) {
		setSkills(skills);
	}

	@Override
	public Skills getSkills() {
		return skills;
	}

	@Override
	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public OCCUPATION(SubjectOf subjectOf) {
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

	public OCCUPATION(Url url) {
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

	public OCCUPATION(Long seq,
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
			EducationRequirements educationRequirements,
			EstimatedSalary estimatedSalary,
			ExperienceRequirements experienceRequirements,
			Identifier identifier,
			Image image,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			OccupationLocation occupationLocation,
			OccupationalCategory occupationalCategory,
			PotentialAction potentialAction,
			Qualifications qualifications,
			Responsibilities responsibilities,
			SameAs sameAs,
			Skills skills,
			SubjectOf subjectOf,
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
		setEducationRequirements(educationRequirements);
		setEstimatedSalary(estimatedSalary);
		setExperienceRequirements(experienceRequirements);
		setIdentifier(identifier);
		setImage(image);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOccupationLocation(occupationLocation);
		setOccupationalCategory(occupationalCategory);
		setPotentialAction(potentialAction);
		setQualifications(qualifications);
		setResponsibilities(responsibilities);
		setSameAs(sameAs);
		setSkills(skills);
		setSubjectOf(subjectOf);
		setUrl(url);
	}

	public void copy(Clazz.Occupation org) {
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
		setEducationRequirements(org.getEducationRequirements());
		setEstimatedSalary(org.getEstimatedSalary());
		setExperienceRequirements(org.getExperienceRequirements());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOccupationLocation(org.getOccupationLocation());
		setOccupationalCategory(org.getOccupationalCategory());
		setPotentialAction(org.getPotentialAction());
		setQualifications(org.getQualifications());
		setResponsibilities(org.getResponsibilities());
		setSameAs(org.getSameAs());
		setSkills(org.getSkills());
		setSubjectOf(org.getSubjectOf());
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
