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


public class PALLIATIVE_PROCEDURE implements Clazz.PalliativeProcedure {

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

	public PALLIATIVE_PROCEDURE() {
	}

	public PALLIATIVE_PROCEDURE(Long seq) {
		setSeq(seq);
	}

	public PALLIATIVE_PROCEDURE(String string) {
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

	public PALLIATIVE_PROCEDURE(AdditionalType additionalType) {
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

	public PALLIATIVE_PROCEDURE(AdverseOutcome adverseOutcome) {
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

	public PALLIATIVE_PROCEDURE(AlternateName alternateName) {
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

	public PALLIATIVE_PROCEDURE(BodyLocation bodyLocation) {
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

	public PALLIATIVE_PROCEDURE(Code code) {
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

	public PALLIATIVE_PROCEDURE(Contraindication contraindication) {
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

	public PALLIATIVE_PROCEDURE(Description description) {
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

	public PALLIATIVE_PROCEDURE(DisambiguatingDescription disambiguatingDescription) {
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

	public PALLIATIVE_PROCEDURE(DoseSchedule doseSchedule) {
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

	public PALLIATIVE_PROCEDURE(Drug drug) {
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

	public PALLIATIVE_PROCEDURE(DuplicateTherapy duplicateTherapy) {
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

	public PALLIATIVE_PROCEDURE(Followup followup) {
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

	public PALLIATIVE_PROCEDURE(Guideline guideline) {
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

	public PALLIATIVE_PROCEDURE(HowPerformed howPerformed) {
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

	public PALLIATIVE_PROCEDURE(Identifier identifier) {
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

	public PALLIATIVE_PROCEDURE(Image image) {
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

	public PALLIATIVE_PROCEDURE(Indication indication) {
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

	public PALLIATIVE_PROCEDURE(LegalStatus legalStatus) {
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

	public PALLIATIVE_PROCEDURE(MainEntityOfPage mainEntityOfPage) {
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

	public PALLIATIVE_PROCEDURE(MedicineSystem medicineSystem) {
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

	public PALLIATIVE_PROCEDURE(Name name) {
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

	public PALLIATIVE_PROCEDURE(NameFuzzy nameFuzzy) {
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

	public PALLIATIVE_PROCEDURE(NameRuby nameRuby) {
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

	public PALLIATIVE_PROCEDURE(Outcome outcome) {
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

	public PALLIATIVE_PROCEDURE(PotentialAction potentialAction) {
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

	public PALLIATIVE_PROCEDURE(Preparation preparation) {
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

	public PALLIATIVE_PROCEDURE(ProcedureType procedureType) {
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

	public PALLIATIVE_PROCEDURE(RecognizingAuthority recognizingAuthority) {
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

	public PALLIATIVE_PROCEDURE(RelevantSpecialty relevantSpecialty) {
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

	public PALLIATIVE_PROCEDURE(SameAs sameAs) {
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

	public PALLIATIVE_PROCEDURE(SeriousAdverseOutcome seriousAdverseOutcome) {
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

	public PALLIATIVE_PROCEDURE(Status status) {
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

	public PALLIATIVE_PROCEDURE(Study study) {
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

	public PALLIATIVE_PROCEDURE(SubjectOf subjectOf) {
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

	public PALLIATIVE_PROCEDURE(Url url) {
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

	public PALLIATIVE_PROCEDURE(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AdverseOutcome adverseOutcome,
			AlternateName alternateName,
			BodyLocation bodyLocation,
			Code code,
			Contraindication contraindication,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DoseSchedule doseSchedule,
			Drug drug,
			DuplicateTherapy duplicateTherapy,
			Followup followup,
			Guideline guideline,
			HowPerformed howPerformed,
			Identifier identifier,
			Image image,
			Indication indication,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			MedicineSystem medicineSystem,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Outcome outcome,
			PotentialAction potentialAction,
			Preparation preparation,
			ProcedureType procedureType,
			RecognizingAuthority recognizingAuthority,
			RelevantSpecialty relevantSpecialty,
			SameAs sameAs,
			SeriousAdverseOutcome seriousAdverseOutcome,
			Status status,
			Study study,
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
		setAdverseOutcome(adverseOutcome);
		setAlternateName(alternateName);
		setBodyLocation(bodyLocation);
		setCode(code);
		setContraindication(contraindication);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDoseSchedule(doseSchedule);
		setDrug(drug);
		setDuplicateTherapy(duplicateTherapy);
		setFollowup(followup);
		setGuideline(guideline);
		setHowPerformed(howPerformed);
		setIdentifier(identifier);
		setImage(image);
		setIndication(indication);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setMedicineSystem(medicineSystem);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOutcome(outcome);
		setPotentialAction(potentialAction);
		setPreparation(preparation);
		setProcedureType(procedureType);
		setRecognizingAuthority(recognizingAuthority);
		setRelevantSpecialty(relevantSpecialty);
		setSameAs(sameAs);
		setSeriousAdverseOutcome(seriousAdverseOutcome);
		setStatus(status);
		setStudy(study);
		setSubjectOf(subjectOf);
		setUrl(url);
	}

	public void copy(Clazz.PalliativeProcedure org) {
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
