package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

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
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MaximumDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RecommendedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ReportedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Code;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DoseUnit;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DoseValue;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Frequency;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Guideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Study;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.TargetPopulation;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class DOSE_SCHEDULE implements Clazz.DoseSchedule, Container.DoseSchedule {

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
	public Code code;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public List<Clazz.DoseSchedule> doseScheduleList;
	public DoseUnit doseUnit;
	public DoseValue doseValue;
	public Frequency frequency;
	public Guideline guideline;
	public Identifier identifier;
	public Image image;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public List<MaximumDoseSchedule> maximumDoseScheduleList;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public RecognizingAuthority recognizingAuthority;
	public List<RecommendedDoseSchedule> recommendedDoseScheduleList;
	public RelevantSpecialty relevantSpecialty;
	public List<ReportedDoseSchedule> reportedDoseScheduleList;
	public SameAs sameAs;
	public Study study;
	public SubjectOf subjectOf;
	public TargetPopulation targetPopulation;
	public Url url;

	public DOSE_SCHEDULE() {
	}

	public DOSE_SCHEDULE(Long seq) {
		setSeq(seq);
	}

	public DOSE_SCHEDULE(String string) {
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

	public DOSE_SCHEDULE(AdditionalType additionalType) {
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

	public DOSE_SCHEDULE(AlternateName alternateName) {
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

	public DOSE_SCHEDULE(Code code) {
		setCode(code);
	}

	@Override
	public Code getCode() {
		return code;
	}

	@Override
	public void setCode(Code code) {
		this.code = code;
	}

	public DOSE_SCHEDULE(Description description) {
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

	public DOSE_SCHEDULE(DisambiguatingDescription disambiguatingDescription) {
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

	public DOSE_SCHEDULE(Clazz.DoseSchedule doseSchedule) {
		doseScheduleList = new ArrayList<Clazz.DoseSchedule>();
		doseScheduleList.add(doseSchedule);
	}

	@Override
	public Clazz.DoseSchedule getDoseSchedule() {
		if(doseScheduleList != null && doseScheduleList.size() > 0) {
			return doseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDoseSchedule(Clazz.DoseSchedule doseSchedule) {
		if(doseScheduleList == null) {
			doseScheduleList = new ArrayList<>();
		}
		if(doseScheduleList.size() == 0) {
			doseScheduleList.add(doseSchedule);
		} else {
			doseScheduleList.set(0, doseSchedule);
		}
	}

	@Override
	public List<Clazz.DoseSchedule> getDoseScheduleList() {
		return doseScheduleList;
	}

	@Override
	public void setDoseScheduleList(List<Clazz.DoseSchedule> doseScheduleList) {
		this.doseScheduleList = doseScheduleList;
	}

	@Override
	public boolean hasDoseSchedule() {
		return doseScheduleList != null && doseScheduleList.size() > 0 && doseScheduleList.get(0) != null;
	}

	public DOSE_SCHEDULE(DoseUnit doseUnit) {
		setDoseUnit(doseUnit);
	}

	@Override
	public DoseUnit getDoseUnit() {
		return doseUnit;
	}

	@Override
	public void setDoseUnit(DoseUnit doseUnit) {
		this.doseUnit = doseUnit;
	}

	public DOSE_SCHEDULE(DoseValue doseValue) {
		setDoseValue(doseValue);
	}

	@Override
	public DoseValue getDoseValue() {
		return doseValue;
	}

	@Override
	public void setDoseValue(DoseValue doseValue) {
		this.doseValue = doseValue;
	}

	public DOSE_SCHEDULE(Frequency frequency) {
		setFrequency(frequency);
	}

	@Override
	public Frequency getFrequency() {
		return frequency;
	}

	@Override
	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public DOSE_SCHEDULE(Guideline guideline) {
		setGuideline(guideline);
	}

	@Override
	public Guideline getGuideline() {
		return guideline;
	}

	@Override
	public void setGuideline(Guideline guideline) {
		this.guideline = guideline;
	}

	public DOSE_SCHEDULE(Identifier identifier) {
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

	public DOSE_SCHEDULE(Image image) {
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

	public DOSE_SCHEDULE(LegalStatus legalStatus) {
		setLegalStatus(legalStatus);
	}

	@Override
	public LegalStatus getLegalStatus() {
		return legalStatus;
	}

	@Override
	public void setLegalStatus(LegalStatus legalStatus) {
		this.legalStatus = legalStatus;
	}

	public DOSE_SCHEDULE(MainEntityOfPage mainEntityOfPage) {
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

	public DOSE_SCHEDULE(MaximumDoseSchedule maximumDoseSchedule) {
		maximumDoseScheduleList = new ArrayList<MaximumDoseSchedule>();
		maximumDoseScheduleList.add(maximumDoseSchedule);
	}

	@Override
	public MaximumDoseSchedule getMaximumDoseSchedule() {
		if(maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0) {
			return maximumDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMaximumDoseSchedule(MaximumDoseSchedule maximumDoseSchedule) {
		if(maximumDoseScheduleList == null) {
			maximumDoseScheduleList = new ArrayList<>();
		}
		if(maximumDoseScheduleList.size() == 0) {
			maximumDoseScheduleList.add(maximumDoseSchedule);
		} else {
			maximumDoseScheduleList.set(0, maximumDoseSchedule);
		}
	}

	@Override
	public List<MaximumDoseSchedule> getMaximumDoseScheduleList() {
		return maximumDoseScheduleList;
	}

	@Override
	public void setMaximumDoseScheduleList(List<MaximumDoseSchedule> maximumDoseScheduleList) {
		this.maximumDoseScheduleList = maximumDoseScheduleList;
	}

	@Override
	public boolean hasMaximumDoseSchedule() {
		return maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0 && maximumDoseScheduleList.get(0) != null;
	}

	public DOSE_SCHEDULE(MedicineSystem medicineSystem) {
		setMedicineSystem(medicineSystem);
	}

	@Override
	public MedicineSystem getMedicineSystem() {
		return medicineSystem;
	}

	@Override
	public void setMedicineSystem(MedicineSystem medicineSystem) {
		this.medicineSystem = medicineSystem;
	}

	public DOSE_SCHEDULE(Name name) {
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

	public DOSE_SCHEDULE(NameFuzzy nameFuzzy) {
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

	public DOSE_SCHEDULE(NameRuby nameRuby) {
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

	public DOSE_SCHEDULE(PotentialAction potentialAction) {
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

	public DOSE_SCHEDULE(RecognizingAuthority recognizingAuthority) {
		setRecognizingAuthority(recognizingAuthority);
	}

	@Override
	public RecognizingAuthority getRecognizingAuthority() {
		return recognizingAuthority;
	}

	@Override
	public void setRecognizingAuthority(RecognizingAuthority recognizingAuthority) {
		this.recognizingAuthority = recognizingAuthority;
	}

	public DOSE_SCHEDULE(RecommendedDoseSchedule recommendedDoseSchedule) {
		recommendedDoseScheduleList = new ArrayList<RecommendedDoseSchedule>();
		recommendedDoseScheduleList.add(recommendedDoseSchedule);
	}

	@Override
	public RecommendedDoseSchedule getRecommendedDoseSchedule() {
		if(recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0) {
			return recommendedDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecommendedDoseSchedule(RecommendedDoseSchedule recommendedDoseSchedule) {
		if(recommendedDoseScheduleList == null) {
			recommendedDoseScheduleList = new ArrayList<>();
		}
		if(recommendedDoseScheduleList.size() == 0) {
			recommendedDoseScheduleList.add(recommendedDoseSchedule);
		} else {
			recommendedDoseScheduleList.set(0, recommendedDoseSchedule);
		}
	}

	@Override
	public List<RecommendedDoseSchedule> getRecommendedDoseScheduleList() {
		return recommendedDoseScheduleList;
	}

	@Override
	public void setRecommendedDoseScheduleList(List<RecommendedDoseSchedule> recommendedDoseScheduleList) {
		this.recommendedDoseScheduleList = recommendedDoseScheduleList;
	}

	@Override
	public boolean hasRecommendedDoseSchedule() {
		return recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0 && recommendedDoseScheduleList.get(0) != null;
	}

	public DOSE_SCHEDULE(RelevantSpecialty relevantSpecialty) {
		setRelevantSpecialty(relevantSpecialty);
	}

	@Override
	public RelevantSpecialty getRelevantSpecialty() {
		return relevantSpecialty;
	}

	@Override
	public void setRelevantSpecialty(RelevantSpecialty relevantSpecialty) {
		this.relevantSpecialty = relevantSpecialty;
	}

	public DOSE_SCHEDULE(ReportedDoseSchedule reportedDoseSchedule) {
		reportedDoseScheduleList = new ArrayList<ReportedDoseSchedule>();
		reportedDoseScheduleList.add(reportedDoseSchedule);
	}

	@Override
	public ReportedDoseSchedule getReportedDoseSchedule() {
		if(reportedDoseScheduleList != null && reportedDoseScheduleList.size() > 0) {
			return reportedDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReportedDoseSchedule(ReportedDoseSchedule reportedDoseSchedule) {
		if(reportedDoseScheduleList == null) {
			reportedDoseScheduleList = new ArrayList<>();
		}
		if(reportedDoseScheduleList.size() == 0) {
			reportedDoseScheduleList.add(reportedDoseSchedule);
		} else {
			reportedDoseScheduleList.set(0, reportedDoseSchedule);
		}
	}

	@Override
	public List<ReportedDoseSchedule> getReportedDoseScheduleList() {
		return reportedDoseScheduleList;
	}

	@Override
	public void setReportedDoseScheduleList(List<ReportedDoseSchedule> reportedDoseScheduleList) {
		this.reportedDoseScheduleList = reportedDoseScheduleList;
	}

	@Override
	public boolean hasReportedDoseSchedule() {
		return reportedDoseScheduleList != null && reportedDoseScheduleList.size() > 0 && reportedDoseScheduleList.get(0) != null;
	}

	public DOSE_SCHEDULE(SameAs sameAs) {
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

	public DOSE_SCHEDULE(Study study) {
		setStudy(study);
	}

	@Override
	public Study getStudy() {
		return study;
	}

	@Override
	public void setStudy(Study study) {
		this.study = study;
	}

	public DOSE_SCHEDULE(SubjectOf subjectOf) {
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

	public DOSE_SCHEDULE(TargetPopulation targetPopulation) {
		setTargetPopulation(targetPopulation);
	}

	@Override
	public TargetPopulation getTargetPopulation() {
		return targetPopulation;
	}

	@Override
	public void setTargetPopulation(TargetPopulation targetPopulation) {
		this.targetPopulation = targetPopulation;
	}

	public DOSE_SCHEDULE(Url url) {
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

	public void copy(Clazz.DoseSchedule org) {
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
		setCode(org.getCode());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDoseUnit(org.getDoseUnit());
		setDoseValue(org.getDoseValue());
		setFrequency(org.getFrequency());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSameAs(org.getSameAs());
		setStudy(org.getStudy());
		setSubjectOf(org.getSubjectOf());
		setTargetPopulation(org.getTargetPopulation());
		setUrl(org.getUrl());
	}

	public void copy(Container.DoseSchedule org) {
		setDoseScheduleList(org.getDoseScheduleList());
		setMaximumDoseScheduleList(org.getMaximumDoseScheduleList());
		setRecommendedDoseScheduleList(org.getRecommendedDoseScheduleList());
		setReportedDoseScheduleList(org.getReportedDoseScheduleList());
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
