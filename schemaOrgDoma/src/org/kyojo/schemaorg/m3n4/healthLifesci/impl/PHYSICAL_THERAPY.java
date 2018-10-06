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
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AdverseOutcome;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.BodyLocation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Code;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Contraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DuplicateTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Followup;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Guideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.HowPerformed;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Indication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Outcome;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Preparation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ProcedureType;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.SeriousAdverseOutcome;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Status;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Study;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class PHYSICAL_THERAPY implements Clazz.PhysicalTherapy {

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
	public AdverseOutcome adverseOutcome;
	public AlternateName alternateName;
	public BodyLocation bodyLocation;
	public Code code;
	public Contraindication contraindication;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DoseSchedule doseSchedule;
	public Drug drug;
	public DuplicateTherapy duplicateTherapy;
	public Followup followup;
	public Guideline guideline;
	public HowPerformed howPerformed;
	public Identifier identifier;
	public Image image;
	public Indication indication;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Outcome outcome;
	public PotentialAction potentialAction;
	public Preparation preparation;
	public ProcedureType procedureType;
	public RecognizingAuthority recognizingAuthority;
	public RelevantSpecialty relevantSpecialty;
	public SameAs sameAs;
	public SeriousAdverseOutcome seriousAdverseOutcome;
	public Status status;
	public Study study;
	public SubjectOf subjectOf;
	public Url url;

	public PHYSICAL_THERAPY() {
	}

	public PHYSICAL_THERAPY(Long seq) {
		setSeq(seq);
	}

	public PHYSICAL_THERAPY(String string) {
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

	public PHYSICAL_THERAPY(AdditionalType additionalType) {
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

	public PHYSICAL_THERAPY(AdverseOutcome adverseOutcome) {
		setAdverseOutcome(adverseOutcome);
	}

	@Override
	public AdverseOutcome getAdverseOutcome() {
		return adverseOutcome;
	}

	@Override
	public void setAdverseOutcome(AdverseOutcome adverseOutcome) {
		this.adverseOutcome = adverseOutcome;
	}

	public PHYSICAL_THERAPY(AlternateName alternateName) {
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

	public PHYSICAL_THERAPY(BodyLocation bodyLocation) {
		setBodyLocation(bodyLocation);
	}

	@Override
	public BodyLocation getBodyLocation() {
		return bodyLocation;
	}

	@Override
	public void setBodyLocation(BodyLocation bodyLocation) {
		this.bodyLocation = bodyLocation;
	}

	public PHYSICAL_THERAPY(Code code) {
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

	public PHYSICAL_THERAPY(Contraindication contraindication) {
		setContraindication(contraindication);
	}

	@Override
	public Contraindication getContraindication() {
		return contraindication;
	}

	@Override
	public void setContraindication(Contraindication contraindication) {
		this.contraindication = contraindication;
	}

	public PHYSICAL_THERAPY(Description description) {
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

	public PHYSICAL_THERAPY(DisambiguatingDescription disambiguatingDescription) {
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

	public PHYSICAL_THERAPY(DoseSchedule doseSchedule) {
		setDoseSchedule(doseSchedule);
	}

	@Override
	public DoseSchedule getDoseSchedule() {
		return doseSchedule;
	}

	@Override
	public void setDoseSchedule(DoseSchedule doseSchedule) {
		this.doseSchedule = doseSchedule;
	}

	public PHYSICAL_THERAPY(Drug drug) {
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

	public PHYSICAL_THERAPY(DuplicateTherapy duplicateTherapy) {
		setDuplicateTherapy(duplicateTherapy);
	}

	@Override
	public DuplicateTherapy getDuplicateTherapy() {
		return duplicateTherapy;
	}

	@Override
	public void setDuplicateTherapy(DuplicateTherapy duplicateTherapy) {
		this.duplicateTherapy = duplicateTherapy;
	}

	public PHYSICAL_THERAPY(Followup followup) {
		setFollowup(followup);
	}

	@Override
	public Followup getFollowup() {
		return followup;
	}

	@Override
	public void setFollowup(Followup followup) {
		this.followup = followup;
	}

	public PHYSICAL_THERAPY(Guideline guideline) {
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

	public PHYSICAL_THERAPY(HowPerformed howPerformed) {
		setHowPerformed(howPerformed);
	}

	@Override
	public HowPerformed getHowPerformed() {
		return howPerformed;
	}

	@Override
	public void setHowPerformed(HowPerformed howPerformed) {
		this.howPerformed = howPerformed;
	}

	public PHYSICAL_THERAPY(Identifier identifier) {
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

	public PHYSICAL_THERAPY(Image image) {
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

	public PHYSICAL_THERAPY(Indication indication) {
		setIndication(indication);
	}

	@Override
	public Indication getIndication() {
		return indication;
	}

	@Override
	public void setIndication(Indication indication) {
		this.indication = indication;
	}

	public PHYSICAL_THERAPY(LegalStatus legalStatus) {
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

	public PHYSICAL_THERAPY(MainEntityOfPage mainEntityOfPage) {
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

	public PHYSICAL_THERAPY(MedicineSystem medicineSystem) {
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

	public PHYSICAL_THERAPY(Name name) {
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

	public PHYSICAL_THERAPY(NameFuzzy nameFuzzy) {
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

	public PHYSICAL_THERAPY(NameRuby nameRuby) {
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

	public PHYSICAL_THERAPY(Outcome outcome) {
		setOutcome(outcome);
	}

	@Override
	public Outcome getOutcome() {
		return outcome;
	}

	@Override
	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}

	public PHYSICAL_THERAPY(PotentialAction potentialAction) {
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

	public PHYSICAL_THERAPY(Preparation preparation) {
		setPreparation(preparation);
	}

	@Override
	public Preparation getPreparation() {
		return preparation;
	}

	@Override
	public void setPreparation(Preparation preparation) {
		this.preparation = preparation;
	}

	public PHYSICAL_THERAPY(ProcedureType procedureType) {
		setProcedureType(procedureType);
	}

	@Override
	public ProcedureType getProcedureType() {
		return procedureType;
	}

	@Override
	public void setProcedureType(ProcedureType procedureType) {
		this.procedureType = procedureType;
	}

	public PHYSICAL_THERAPY(RecognizingAuthority recognizingAuthority) {
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

	public PHYSICAL_THERAPY(RelevantSpecialty relevantSpecialty) {
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

	public PHYSICAL_THERAPY(SameAs sameAs) {
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

	public PHYSICAL_THERAPY(SeriousAdverseOutcome seriousAdverseOutcome) {
		setSeriousAdverseOutcome(seriousAdverseOutcome);
	}

	@Override
	public SeriousAdverseOutcome getSeriousAdverseOutcome() {
		return seriousAdverseOutcome;
	}

	@Override
	public void setSeriousAdverseOutcome(SeriousAdverseOutcome seriousAdverseOutcome) {
		this.seriousAdverseOutcome = seriousAdverseOutcome;
	}

	public PHYSICAL_THERAPY(Status status) {
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

	public PHYSICAL_THERAPY(Study study) {
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

	public PHYSICAL_THERAPY(SubjectOf subjectOf) {
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

	public PHYSICAL_THERAPY(Url url) {
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

	public void copy(Clazz.PhysicalTherapy org) {
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
		setAdverseOutcome(org.getAdverseOutcome());
		setAlternateName(org.getAlternateName());
		setBodyLocation(org.getBodyLocation());
		setCode(org.getCode());
		setContraindication(org.getContraindication());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDoseSchedule(org.getDoseSchedule());
		setDrug(org.getDrug());
		setDuplicateTherapy(org.getDuplicateTherapy());
		setFollowup(org.getFollowup());
		setGuideline(org.getGuideline());
		setHowPerformed(org.getHowPerformed());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIndication(org.getIndication());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOutcome(org.getOutcome());
		setPotentialAction(org.getPotentialAction());
		setPreparation(org.getPreparation());
		setProcedureType(org.getProcedureType());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSameAs(org.getSameAs());
		setSeriousAdverseOutcome(org.getSeriousAdverseOutcome());
		setStatus(org.getStatus());
		setStudy(org.getStudy());
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
