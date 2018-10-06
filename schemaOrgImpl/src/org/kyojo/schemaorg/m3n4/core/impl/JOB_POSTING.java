package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.BaseSalary;
import org.kyojo.schemaorg.m3n4.core.Container.DatePosted;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.EmploymentType;
import org.kyojo.schemaorg.m3n4.core.Container.HiringOrganization;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.IncentiveCompensation;
import org.kyojo.schemaorg.m3n4.core.Container.Industry;
import org.kyojo.schemaorg.m3n4.core.Container.JobBenefits;
import org.kyojo.schemaorg.m3n4.core.Container.JobLocation;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.SalaryCurrency;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SpecialCommitments;
import org.kyojo.schemaorg.m3n4.core.Container.Title;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.Container.ValidThrough;
import org.kyojo.schemaorg.m3n4.core.Container.WorkHours;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container.EducationRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.EstimatedSalary;
import org.kyojo.schemaorg.m3n4.pending.Container.ExperienceRequirements;
import org.kyojo.schemaorg.m3n4.pending.Container.OccupationalCategory;
import org.kyojo.schemaorg.m3n4.pending.Container.Qualifications;
import org.kyojo.schemaorg.m3n4.pending.Container.RelevantOccupation;
import org.kyojo.schemaorg.m3n4.pending.Container.Responsibilities;
import org.kyojo.schemaorg.m3n4.pending.Container.Skills;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class JOB_POSTING implements Clazz.JobPosting {

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
	public BaseSalary baseSalary;
	public DatePosted datePosted;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EducationRequirements educationRequirements;
	public EmploymentType employmentType;
	public EstimatedSalary estimatedSalary;
	public ExperienceRequirements experienceRequirements;
	public HiringOrganization hiringOrganization;
	public Identifier identifier;
	public Image image;
	public IncentiveCompensation incentiveCompensation;
	public Industry industry;
	public JobBenefits jobBenefits;
	public JobLocation jobLocation;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OccupationalCategory occupationalCategory;
	public PotentialAction potentialAction;
	public Qualifications qualifications;
	public RelevantOccupation relevantOccupation;
	public Responsibilities responsibilities;
	public SalaryCurrency salaryCurrency;
	public SameAs sameAs;
	public Skills skills;
	public SpecialCommitments specialCommitments;
	public SubjectOf subjectOf;
	public Title title;
	public Url url;
	public ValidThrough validThrough;
	public WorkHours workHours;

	public JOB_POSTING() {
	}

	public JOB_POSTING(Long seq) {
		setSeq(seq);
	}

	public JOB_POSTING(String string) {
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

	public JOB_POSTING(AdditionalType additionalType) {
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

	public JOB_POSTING(AlternateName alternateName) {
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

	public JOB_POSTING(BaseSalary baseSalary) {
		setBaseSalary(baseSalary);
	}

	@Override
	public BaseSalary getBaseSalary() {
		return baseSalary;
	}

	@Override
	public void setBaseSalary(BaseSalary baseSalary) {
		this.baseSalary = baseSalary;
	}

	public JOB_POSTING(DatePosted datePosted) {
		setDatePosted(datePosted);
	}

	@Override
	public DatePosted getDatePosted() {
		return datePosted;
	}

	@Override
	public void setDatePosted(DatePosted datePosted) {
		this.datePosted = datePosted;
	}

	public JOB_POSTING(Description description) {
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

	public JOB_POSTING(DisambiguatingDescription disambiguatingDescription) {
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

	public JOB_POSTING(EducationRequirements educationRequirements) {
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

	public JOB_POSTING(EmploymentType employmentType) {
		setEmploymentType(employmentType);
	}

	@Override
	public EmploymentType getEmploymentType() {
		return employmentType;
	}

	@Override
	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}

	public JOB_POSTING(EstimatedSalary estimatedSalary) {
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

	public JOB_POSTING(ExperienceRequirements experienceRequirements) {
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

	public JOB_POSTING(HiringOrganization hiringOrganization) {
		setHiringOrganization(hiringOrganization);
	}

	@Override
	public HiringOrganization getHiringOrganization() {
		return hiringOrganization;
	}

	@Override
	public void setHiringOrganization(HiringOrganization hiringOrganization) {
		this.hiringOrganization = hiringOrganization;
	}

	public JOB_POSTING(Identifier identifier) {
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

	public JOB_POSTING(Image image) {
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

	public JOB_POSTING(IncentiveCompensation incentiveCompensation) {
		setIncentiveCompensation(incentiveCompensation);
	}

	@Override
	public IncentiveCompensation getIncentiveCompensation() {
		return incentiveCompensation;
	}

	@Override
	public void setIncentiveCompensation(IncentiveCompensation incentiveCompensation) {
		this.incentiveCompensation = incentiveCompensation;
	}

	public JOB_POSTING(Industry industry) {
		setIndustry(industry);
	}

	@Override
	public Industry getIndustry() {
		return industry;
	}

	@Override
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public JOB_POSTING(JobBenefits jobBenefits) {
		setJobBenefits(jobBenefits);
	}

	@Override
	public JobBenefits getJobBenefits() {
		return jobBenefits;
	}

	@Override
	public void setJobBenefits(JobBenefits jobBenefits) {
		this.jobBenefits = jobBenefits;
	}

	public JOB_POSTING(JobLocation jobLocation) {
		setJobLocation(jobLocation);
	}

	@Override
	public JobLocation getJobLocation() {
		return jobLocation;
	}

	@Override
	public void setJobLocation(JobLocation jobLocation) {
		this.jobLocation = jobLocation;
	}

	public JOB_POSTING(MainEntityOfPage mainEntityOfPage) {
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

	public JOB_POSTING(Name name) {
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

	public JOB_POSTING(NameFuzzy nameFuzzy) {
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

	public JOB_POSTING(NameRuby nameRuby) {
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

	public JOB_POSTING(OccupationalCategory occupationalCategory) {
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

	public JOB_POSTING(PotentialAction potentialAction) {
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

	public JOB_POSTING(Qualifications qualifications) {
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

	public JOB_POSTING(RelevantOccupation relevantOccupation) {
		setRelevantOccupation(relevantOccupation);
	}

	@Override
	public RelevantOccupation getRelevantOccupation() {
		return relevantOccupation;
	}

	@Override
	public void setRelevantOccupation(RelevantOccupation relevantOccupation) {
		this.relevantOccupation = relevantOccupation;
	}

	public JOB_POSTING(Responsibilities responsibilities) {
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

	public JOB_POSTING(SalaryCurrency salaryCurrency) {
		setSalaryCurrency(salaryCurrency);
	}

	@Override
	public SalaryCurrency getSalaryCurrency() {
		return salaryCurrency;
	}

	@Override
	public void setSalaryCurrency(SalaryCurrency salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}

	public JOB_POSTING(SameAs sameAs) {
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

	public JOB_POSTING(Skills skills) {
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

	public JOB_POSTING(SpecialCommitments specialCommitments) {
		setSpecialCommitments(specialCommitments);
	}

	@Override
	public SpecialCommitments getSpecialCommitments() {
		return specialCommitments;
	}

	@Override
	public void setSpecialCommitments(SpecialCommitments specialCommitments) {
		this.specialCommitments = specialCommitments;
	}

	public JOB_POSTING(SubjectOf subjectOf) {
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

	public JOB_POSTING(Title title) {
		setTitle(title);
	}

	@Override
	public Title getTitle() {
		return title;
	}

	@Override
	public void setTitle(Title title) {
		this.title = title;
	}

	public JOB_POSTING(Url url) {
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

	public JOB_POSTING(ValidThrough validThrough) {
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

	public JOB_POSTING(WorkHours workHours) {
		setWorkHours(workHours);
	}

	@Override
	public WorkHours getWorkHours() {
		return workHours;
	}

	@Override
	public void setWorkHours(WorkHours workHours) {
		this.workHours = workHours;
	}

	public void copy(Clazz.JobPosting org) {
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
		setBaseSalary(org.getBaseSalary());
		setDatePosted(org.getDatePosted());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEducationRequirements(org.getEducationRequirements());
		setEmploymentType(org.getEmploymentType());
		setEstimatedSalary(org.getEstimatedSalary());
		setExperienceRequirements(org.getExperienceRequirements());
		setHiringOrganization(org.getHiringOrganization());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIncentiveCompensation(org.getIncentiveCompensation());
		setIndustry(org.getIndustry());
		setJobBenefits(org.getJobBenefits());
		setJobLocation(org.getJobLocation());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOccupationalCategory(org.getOccupationalCategory());
		setPotentialAction(org.getPotentialAction());
		setQualifications(org.getQualifications());
		setRelevantOccupation(org.getRelevantOccupation());
		setResponsibilities(org.getResponsibilities());
		setSalaryCurrency(org.getSalaryCurrency());
		setSameAs(org.getSameAs());
		setSkills(org.getSkills());
		setSpecialCommitments(org.getSpecialCommitments());
		setSubjectOf(org.getSubjectOf());
		setTitle(org.getTitle());
		setUrl(org.getUrl());
		setValidThrough(org.getValidThrough());
		setWorkHours(org.getWorkHours());
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
