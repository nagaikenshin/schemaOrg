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
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InfectiousAgent;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.InfectiousAgentClass;
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
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.TransmissionMethod;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.TypicalTest;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class INFECTIOUS_DISEASE implements Clazz.InfectiousDisease {

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
	public Image image;
	public InfectiousAgent infectiousAgent;
	public InfectiousAgentClass infectiousAgentClass;
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
	public TransmissionMethod transmissionMethod;
	public TypicalTest typicalTest;
	public Url url;

	public INFECTIOUS_DISEASE() {
	}

	public INFECTIOUS_DISEASE(Long seq) {
		setSeq(seq);
	}

	public INFECTIOUS_DISEASE(String string) {
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

	public INFECTIOUS_DISEASE(AdditionalType additionalType) {
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

	public INFECTIOUS_DISEASE(AlternateName alternateName) {
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

	public INFECTIOUS_DISEASE(AssociatedAnatomy associatedAnatomy) {
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

	public INFECTIOUS_DISEASE(Cause cause) {
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

	public INFECTIOUS_DISEASE(Code code) {
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

	public INFECTIOUS_DISEASE(Description description) {
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

	public INFECTIOUS_DISEASE(DifferentialDiagnosis differentialDiagnosis) {
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

	public INFECTIOUS_DISEASE(DisambiguatingDescription disambiguatingDescription) {
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

	public INFECTIOUS_DISEASE(Drug drug) {
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

	public INFECTIOUS_DISEASE(Epidemiology epidemiology) {
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

	public INFECTIOUS_DISEASE(ExpectedPrognosis expectedPrognosis) {
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

	public INFECTIOUS_DISEASE(Guideline guideline) {
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

	public INFECTIOUS_DISEASE(Identifier identifier) {
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

	public INFECTIOUS_DISEASE(Image image) {
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

	public INFECTIOUS_DISEASE(InfectiousAgent infectiousAgent) {
		setInfectiousAgent(infectiousAgent);
	}

	@Override
	public InfectiousAgent getInfectiousAgent() {
		return infectiousAgent;
	}

	@Override
	public void setInfectiousAgent(InfectiousAgent infectiousAgent) {
		this.infectiousAgent = infectiousAgent;
	}

	public INFECTIOUS_DISEASE(InfectiousAgentClass infectiousAgentClass) {
		setInfectiousAgentClass(infectiousAgentClass);
	}

	@Override
	public InfectiousAgentClass getInfectiousAgentClass() {
		return infectiousAgentClass;
	}

	@Override
	public void setInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
		this.infectiousAgentClass = infectiousAgentClass;
	}

	public INFECTIOUS_DISEASE(LegalStatus legalStatus) {
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

	public INFECTIOUS_DISEASE(MainEntityOfPage mainEntityOfPage) {
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

	public INFECTIOUS_DISEASE(MedicineSystem medicineSystem) {
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

	public INFECTIOUS_DISEASE(Name name) {
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

	public INFECTIOUS_DISEASE(NameFuzzy nameFuzzy) {
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

	public INFECTIOUS_DISEASE(NameRuby nameRuby) {
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

	public INFECTIOUS_DISEASE(NaturalProgression naturalProgression) {
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

	public INFECTIOUS_DISEASE(Pathophysiology pathophysiology) {
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

	public INFECTIOUS_DISEASE(PossibleComplication possibleComplication) {
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

	public INFECTIOUS_DISEASE(PossibleTreatment possibleTreatment) {
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

	public INFECTIOUS_DISEASE(PotentialAction potentialAction) {
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

	public INFECTIOUS_DISEASE(PrimaryPrevention primaryPrevention) {
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

	public INFECTIOUS_DISEASE(RecognizingAuthority recognizingAuthority) {
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

	public INFECTIOUS_DISEASE(RelevantSpecialty relevantSpecialty) {
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

	public INFECTIOUS_DISEASE(RiskFactor riskFactor) {
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

	public INFECTIOUS_DISEASE(SameAs sameAs) {
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

	public INFECTIOUS_DISEASE(SecondaryPrevention secondaryPrevention) {
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

	public INFECTIOUS_DISEASE(SignOrSymptom signOrSymptom) {
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

	public INFECTIOUS_DISEASE(Stage stage) {
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

	public INFECTIOUS_DISEASE(Status status) {
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

	public INFECTIOUS_DISEASE(Study study) {
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

	public INFECTIOUS_DISEASE(SubjectOf subjectOf) {
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

	public INFECTIOUS_DISEASE(Subtype subtype) {
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

	public INFECTIOUS_DISEASE(TransmissionMethod transmissionMethod) {
		setTransmissionMethod(transmissionMethod);
	}

	@Override
	public TransmissionMethod getTransmissionMethod() {
		return transmissionMethod;
	}

	@Override
	public void setTransmissionMethod(TransmissionMethod transmissionMethod) {
		this.transmissionMethod = transmissionMethod;
	}

	public INFECTIOUS_DISEASE(TypicalTest typicalTest) {
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

	public INFECTIOUS_DISEASE(Url url) {
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

	public INFECTIOUS_DISEASE(Long seq,
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
			AssociatedAnatomy associatedAnatomy,
			Cause cause,
			Code code,
			Description description,
			DifferentialDiagnosis differentialDiagnosis,
			DisambiguatingDescription disambiguatingDescription,
			Drug drug,
			Epidemiology epidemiology,
			ExpectedPrognosis expectedPrognosis,
			Guideline guideline,
			Identifier identifier,
			Image image,
			InfectiousAgent infectiousAgent,
			InfectiousAgentClass infectiousAgentClass,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			MedicineSystem medicineSystem,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NaturalProgression naturalProgression,
			Pathophysiology pathophysiology,
			PossibleComplication possibleComplication,
			PossibleTreatment possibleTreatment,
			PotentialAction potentialAction,
			PrimaryPrevention primaryPrevention,
			RecognizingAuthority recognizingAuthority,
			RelevantSpecialty relevantSpecialty,
			RiskFactor riskFactor,
			SameAs sameAs,
			SecondaryPrevention secondaryPrevention,
			SignOrSymptom signOrSymptom,
			Stage stage,
			Status status,
			Study study,
			SubjectOf subjectOf,
			Subtype subtype,
			TransmissionMethod transmissionMethod,
			TypicalTest typicalTest,
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
		setAssociatedAnatomy(associatedAnatomy);
		setCause(cause);
		setCode(code);
		setDescription(description);
		setDifferentialDiagnosis(differentialDiagnosis);
		setDisambiguatingDescription(disambiguatingDescription);
		setDrug(drug);
		setEpidemiology(epidemiology);
		setExpectedPrognosis(expectedPrognosis);
		setGuideline(guideline);
		setIdentifier(identifier);
		setImage(image);
		setInfectiousAgent(infectiousAgent);
		setInfectiousAgentClass(infectiousAgentClass);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setMedicineSystem(medicineSystem);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNaturalProgression(naturalProgression);
		setPathophysiology(pathophysiology);
		setPossibleComplication(possibleComplication);
		setPossibleTreatment(possibleTreatment);
		setPotentialAction(potentialAction);
		setPrimaryPrevention(primaryPrevention);
		setRecognizingAuthority(recognizingAuthority);
		setRelevantSpecialty(relevantSpecialty);
		setRiskFactor(riskFactor);
		setSameAs(sameAs);
		setSecondaryPrevention(secondaryPrevention);
		setSignOrSymptom(signOrSymptom);
		setStage(stage);
		setStatus(status);
		setStudy(study);
		setSubjectOf(subjectOf);
		setSubtype(subtype);
		setTransmissionMethod(transmissionMethod);
		setTypicalTest(typicalTest);
		setUrl(url);
	}

	public void copy(Clazz.InfectiousDisease org) {
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
		setImage(org.getImage());
		setInfectiousAgent(org.getInfectiousAgent());
		setInfectiousAgentClass(org.getInfectiousAgentClass());
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
		setTransmissionMethod(org.getTransmissionMethod());
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
