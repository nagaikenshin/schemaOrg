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
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AssociatedAnatomy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Cause;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Code;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DifferentialDiagnosis;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Epidemiology;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExpectedPrognosis;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Guideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IdentifyingExam;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.IdentifyingTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.NaturalProgression;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Pathophysiology;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PossibleComplication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PossibleTreatment;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.PrimaryPrevention;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RiskFactor;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SecondaryPrevention;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Stage;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Status;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Study;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Subtype;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.TypicalTest;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class MEDICAL_SIGN implements Clazz.MedicalSign {

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
	public AssociatedAnatomy associatedAnatomy;
	public Cause cause;
	public Code code;
	public Description description;
	public DifferentialDiagnosis differentialDiagnosis;
	public DisambiguatingDescription disambiguatingDescription;
	public Drug drug;
	public Epidemiology epidemiology;
	public ExpectedPrognosis expectedPrognosis;
	public Guideline guideline;
	public Identifier identifier;
	public IdentifyingExam identifyingExam;
	public IdentifyingTest identifyingTest;
	public Image image;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NaturalProgression naturalProgression;
	public Pathophysiology pathophysiology;
	public PossibleComplication possibleComplication;
	public PossibleTreatment possibleTreatment;
	public PotentialAction potentialAction;
	public PrimaryPrevention primaryPrevention;
	public RecognizingAuthority recognizingAuthority;
	public RelevantSpecialty relevantSpecialty;
	public RiskFactor riskFactor;
	public SameAs sameAs;
	public SecondaryPrevention secondaryPrevention;
	public SignOrSymptom signOrSymptom;
	public Stage stage;
	public Status status;
	public Study study;
	public SubjectOf subjectOf;
	public Subtype subtype;
	public TypicalTest typicalTest;
	public Url url;

	public MEDICAL_SIGN() {
	}

	public MEDICAL_SIGN(Long seq) {
		setSeq(seq);
	}

	public MEDICAL_SIGN(String string) {
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

	public MEDICAL_SIGN(AdditionalType additionalType) {
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

	public MEDICAL_SIGN(AlternateName alternateName) {
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

	public MEDICAL_SIGN(AssociatedAnatomy associatedAnatomy) {
		setAssociatedAnatomy(associatedAnatomy);
	}

	@Override
	public AssociatedAnatomy getAssociatedAnatomy() {
		return associatedAnatomy;
	}

	@Override
	public void setAssociatedAnatomy(AssociatedAnatomy associatedAnatomy) {
		this.associatedAnatomy = associatedAnatomy;
	}

	public MEDICAL_SIGN(Cause cause) {
		setCause(cause);
	}

	@Override
	public Cause getCause() {
		return cause;
	}

	@Override
	public void setCause(Cause cause) {
		this.cause = cause;
	}

	public MEDICAL_SIGN(Code code) {
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

	public MEDICAL_SIGN(Description description) {
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

	public MEDICAL_SIGN(DifferentialDiagnosis differentialDiagnosis) {
		setDifferentialDiagnosis(differentialDiagnosis);
	}

	@Override
	public DifferentialDiagnosis getDifferentialDiagnosis() {
		return differentialDiagnosis;
	}

	@Override
	public void setDifferentialDiagnosis(DifferentialDiagnosis differentialDiagnosis) {
		this.differentialDiagnosis = differentialDiagnosis;
	}

	public MEDICAL_SIGN(DisambiguatingDescription disambiguatingDescription) {
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

	public MEDICAL_SIGN(Drug drug) {
		setDrug(drug);
	}

	@Override
	public Drug getDrug() {
		return drug;
	}

	@Override
	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public MEDICAL_SIGN(Epidemiology epidemiology) {
		setEpidemiology(epidemiology);
	}

	@Override
	public Epidemiology getEpidemiology() {
		return epidemiology;
	}

	@Override
	public void setEpidemiology(Epidemiology epidemiology) {
		this.epidemiology = epidemiology;
	}

	public MEDICAL_SIGN(ExpectedPrognosis expectedPrognosis) {
		setExpectedPrognosis(expectedPrognosis);
	}

	@Override
	public ExpectedPrognosis getExpectedPrognosis() {
		return expectedPrognosis;
	}

	@Override
	public void setExpectedPrognosis(ExpectedPrognosis expectedPrognosis) {
		this.expectedPrognosis = expectedPrognosis;
	}

	public MEDICAL_SIGN(Guideline guideline) {
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

	public MEDICAL_SIGN(Identifier identifier) {
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

	public MEDICAL_SIGN(IdentifyingExam identifyingExam) {
		setIdentifyingExam(identifyingExam);
	}

	@Override
	public IdentifyingExam getIdentifyingExam() {
		return identifyingExam;
	}

	@Override
	public void setIdentifyingExam(IdentifyingExam identifyingExam) {
		this.identifyingExam = identifyingExam;
	}

	public MEDICAL_SIGN(IdentifyingTest identifyingTest) {
		setIdentifyingTest(identifyingTest);
	}

	@Override
	public IdentifyingTest getIdentifyingTest() {
		return identifyingTest;
	}

	@Override
	public void setIdentifyingTest(IdentifyingTest identifyingTest) {
		this.identifyingTest = identifyingTest;
	}

	public MEDICAL_SIGN(Image image) {
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

	public MEDICAL_SIGN(LegalStatus legalStatus) {
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

	public MEDICAL_SIGN(MainEntityOfPage mainEntityOfPage) {
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

	public MEDICAL_SIGN(MedicineSystem medicineSystem) {
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

	public MEDICAL_SIGN(Name name) {
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

	public MEDICAL_SIGN(NameFuzzy nameFuzzy) {
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

	public MEDICAL_SIGN(NameRuby nameRuby) {
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

	public MEDICAL_SIGN(NaturalProgression naturalProgression) {
		setNaturalProgression(naturalProgression);
	}

	@Override
	public NaturalProgression getNaturalProgression() {
		return naturalProgression;
	}

	@Override
	public void setNaturalProgression(NaturalProgression naturalProgression) {
		this.naturalProgression = naturalProgression;
	}

	public MEDICAL_SIGN(Pathophysiology pathophysiology) {
		setPathophysiology(pathophysiology);
	}

	@Override
	public Pathophysiology getPathophysiology() {
		return pathophysiology;
	}

	@Override
	public void setPathophysiology(Pathophysiology pathophysiology) {
		this.pathophysiology = pathophysiology;
	}

	public MEDICAL_SIGN(PossibleComplication possibleComplication) {
		setPossibleComplication(possibleComplication);
	}

	@Override
	public PossibleComplication getPossibleComplication() {
		return possibleComplication;
	}

	@Override
	public void setPossibleComplication(PossibleComplication possibleComplication) {
		this.possibleComplication = possibleComplication;
	}

	public MEDICAL_SIGN(PossibleTreatment possibleTreatment) {
		setPossibleTreatment(possibleTreatment);
	}

	@Override
	public PossibleTreatment getPossibleTreatment() {
		return possibleTreatment;
	}

	@Override
	public void setPossibleTreatment(PossibleTreatment possibleTreatment) {
		this.possibleTreatment = possibleTreatment;
	}

	public MEDICAL_SIGN(PotentialAction potentialAction) {
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

	public MEDICAL_SIGN(PrimaryPrevention primaryPrevention) {
		setPrimaryPrevention(primaryPrevention);
	}

	@Override
	public PrimaryPrevention getPrimaryPrevention() {
		return primaryPrevention;
	}

	@Override
	public void setPrimaryPrevention(PrimaryPrevention primaryPrevention) {
		this.primaryPrevention = primaryPrevention;
	}

	public MEDICAL_SIGN(RecognizingAuthority recognizingAuthority) {
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

	public MEDICAL_SIGN(RelevantSpecialty relevantSpecialty) {
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

	public MEDICAL_SIGN(RiskFactor riskFactor) {
		setRiskFactor(riskFactor);
	}

	@Override
	public RiskFactor getRiskFactor() {
		return riskFactor;
	}

	@Override
	public void setRiskFactor(RiskFactor riskFactor) {
		this.riskFactor = riskFactor;
	}

	public MEDICAL_SIGN(SameAs sameAs) {
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

	public MEDICAL_SIGN(SecondaryPrevention secondaryPrevention) {
		setSecondaryPrevention(secondaryPrevention);
	}

	@Override
	public SecondaryPrevention getSecondaryPrevention() {
		return secondaryPrevention;
	}

	@Override
	public void setSecondaryPrevention(SecondaryPrevention secondaryPrevention) {
		this.secondaryPrevention = secondaryPrevention;
	}

	public MEDICAL_SIGN(SignOrSymptom signOrSymptom) {
		setSignOrSymptom(signOrSymptom);
	}

	@Override
	public SignOrSymptom getSignOrSymptom() {
		return signOrSymptom;
	}

	@Override
	public void setSignOrSymptom(SignOrSymptom signOrSymptom) {
		this.signOrSymptom = signOrSymptom;
	}

	public MEDICAL_SIGN(Stage stage) {
		setStage(stage);
	}

	@Override
	public Stage getStage() {
		return stage;
	}

	@Override
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public MEDICAL_SIGN(Status status) {
		setStatus(status);
	}

	@Override
	public Status getStatus() {
		return status;
	}

	@Override
	public void setStatus(Status status) {
		this.status = status;
	}

	public MEDICAL_SIGN(Study study) {
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

	public MEDICAL_SIGN(SubjectOf subjectOf) {
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

	public MEDICAL_SIGN(Subtype subtype) {
		setSubtype(subtype);
	}

	@Override
	public Subtype getSubtype() {
		return subtype;
	}

	@Override
	public void setSubtype(Subtype subtype) {
		this.subtype = subtype;
	}

	public MEDICAL_SIGN(TypicalTest typicalTest) {
		setTypicalTest(typicalTest);
	}

	@Override
	public TypicalTest getTypicalTest() {
		return typicalTest;
	}

	@Override
	public void setTypicalTest(TypicalTest typicalTest) {
		this.typicalTest = typicalTest;
	}

	public MEDICAL_SIGN(Url url) {
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

	public void copy(Clazz.MedicalSign org) {
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
		setAssociatedAnatomy(org.getAssociatedAnatomy());
		setCause(org.getCause());
		setCode(org.getCode());
		setDescription(org.getDescription());
		setDifferentialDiagnosis(org.getDifferentialDiagnosis());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDrug(org.getDrug());
		setEpidemiology(org.getEpidemiology());
		setExpectedPrognosis(org.getExpectedPrognosis());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setIdentifyingExam(org.getIdentifyingExam());
		setIdentifyingTest(org.getIdentifyingTest());
		setImage(org.getImage());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNaturalProgression(org.getNaturalProgression());
		setPathophysiology(org.getPathophysiology());
		setPossibleComplication(org.getPossibleComplication());
		setPossibleTreatment(org.getPossibleTreatment());
		setPotentialAction(org.getPotentialAction());
		setPrimaryPrevention(org.getPrimaryPrevention());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setRiskFactor(org.getRiskFactor());
		setSameAs(org.getSameAs());
		setSecondaryPrevention(org.getSecondaryPrevention());
		setSignOrSymptom(org.getSignOrSymptom());
		setStage(org.getStage());
		setStatus(org.getStatus());
		setStudy(org.getStudy());
		setSubjectOf(org.getSubjectOf());
		setSubtype(org.getSubtype());
		setTypicalTest(org.getTypicalTest());
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
