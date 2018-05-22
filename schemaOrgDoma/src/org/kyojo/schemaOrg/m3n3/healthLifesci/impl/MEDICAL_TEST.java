package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AffectedBy;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NormalRange;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.SignDetected;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.UsedToDiagnose;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.UsesDevice;


public class MEDICAL_TEST implements Clazz.MedicalTest {

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
	public AffectedBy affectedBy;
	public AlternateName alternateName;
	public Code code;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Guideline guideline;
	public Identifier identifier;
	public Image image;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NormalRange normalRange;
	public PotentialAction potentialAction;
	public RecognizingAuthority recognizingAuthority;
	public RelevantSpecialty relevantSpecialty;
	public SameAs sameAs;
	public SignDetected signDetected;
	public Study study;
	public Url url;
	public UsedToDiagnose usedToDiagnose;
	public UsesDevice usesDevice;

	public MEDICAL_TEST() {
	}

	public MEDICAL_TEST(Long seq) {
		setSeq(seq);
	}

	public MEDICAL_TEST(String string) {
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

	public MEDICAL_TEST(AdditionalType additionalType) {
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

	public MEDICAL_TEST(AffectedBy affectedBy) {
		setAffectedBy(affectedBy);
	}

	@Override
	public AffectedBy getAffectedBy() {
		return affectedBy;
	}

	@Override
	public void setAffectedBy(AffectedBy affectedBy) {
		this.affectedBy = affectedBy;
	}

	public MEDICAL_TEST(AlternateName alternateName) {
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

	public MEDICAL_TEST(Code code) {
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

	public MEDICAL_TEST(Description description) {
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

	public MEDICAL_TEST(DisambiguatingDescription disambiguatingDescription) {
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

	public MEDICAL_TEST(Guideline guideline) {
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

	public MEDICAL_TEST(Identifier identifier) {
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

	public MEDICAL_TEST(Image image) {
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

	public MEDICAL_TEST(LegalStatus legalStatus) {
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

	public MEDICAL_TEST(MainEntityOfPage mainEntityOfPage) {
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

	public MEDICAL_TEST(MedicineSystem medicineSystem) {
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

	public MEDICAL_TEST(Name name) {
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

	public MEDICAL_TEST(NameFuzzy nameFuzzy) {
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

	public MEDICAL_TEST(NameRuby nameRuby) {
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

	public MEDICAL_TEST(NormalRange normalRange) {
		setNormalRange(normalRange);
	}

	@Override
	public NormalRange getNormalRange() {
		return normalRange;
	}

	@Override
	public void setNormalRange(NormalRange normalRange) {
		this.normalRange = normalRange;
	}

	public MEDICAL_TEST(PotentialAction potentialAction) {
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

	public MEDICAL_TEST(RecognizingAuthority recognizingAuthority) {
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

	public MEDICAL_TEST(RelevantSpecialty relevantSpecialty) {
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

	public MEDICAL_TEST(SameAs sameAs) {
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

	public MEDICAL_TEST(SignDetected signDetected) {
		setSignDetected(signDetected);
	}

	@Override
	public SignDetected getSignDetected() {
		return signDetected;
	}

	@Override
	public void setSignDetected(SignDetected signDetected) {
		this.signDetected = signDetected;
	}

	public MEDICAL_TEST(Study study) {
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

	public MEDICAL_TEST(Url url) {
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

	public MEDICAL_TEST(UsedToDiagnose usedToDiagnose) {
		setUsedToDiagnose(usedToDiagnose);
	}

	@Override
	public UsedToDiagnose getUsedToDiagnose() {
		return usedToDiagnose;
	}

	@Override
	public void setUsedToDiagnose(UsedToDiagnose usedToDiagnose) {
		this.usedToDiagnose = usedToDiagnose;
	}

	public MEDICAL_TEST(UsesDevice usesDevice) {
		setUsesDevice(usesDevice);
	}

	@Override
	public UsesDevice getUsesDevice() {
		return usesDevice;
	}

	@Override
	public void setUsesDevice(UsesDevice usesDevice) {
		this.usesDevice = usesDevice;
	}

	public MEDICAL_TEST(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AffectedBy affectedBy,
			AlternateName alternateName,
			Code code,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Guideline guideline,
			Identifier identifier,
			Image image,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			MedicineSystem medicineSystem,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NormalRange normalRange,
			PotentialAction potentialAction,
			RecognizingAuthority recognizingAuthority,
			RelevantSpecialty relevantSpecialty,
			SameAs sameAs,
			SignDetected signDetected,
			Study study,
			Url url,
			UsedToDiagnose usedToDiagnose,
			UsesDevice usesDevice) {
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
		setAffectedBy(affectedBy);
		setAlternateName(alternateName);
		setCode(code);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setGuideline(guideline);
		setIdentifier(identifier);
		setImage(image);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setMedicineSystem(medicineSystem);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNormalRange(normalRange);
		setPotentialAction(potentialAction);
		setRecognizingAuthority(recognizingAuthority);
		setRelevantSpecialty(relevantSpecialty);
		setSameAs(sameAs);
		setSignDetected(signDetected);
		setStudy(study);
		setUrl(url);
		setUsedToDiagnose(usedToDiagnose);
		setUsesDevice(usesDevice);
	}

	public void copy(Clazz.MedicalTest org) {
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
		setAffectedBy(org.getAffectedBy());
		setAlternateName(org.getAlternateName());
		setCode(org.getCode());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNormalRange(org.getNormalRange());
		setPotentialAction(org.getPotentialAction());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSameAs(org.getSameAs());
		setSignDetected(org.getSignDetected());
		setStudy(org.getStudy());
		setUrl(org.getUrl());
		setUsedToDiagnose(org.getUsedToDiagnose());
		setUsesDevice(org.getUsesDevice());
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
