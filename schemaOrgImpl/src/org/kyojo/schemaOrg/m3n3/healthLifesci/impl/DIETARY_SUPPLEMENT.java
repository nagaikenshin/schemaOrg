package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n3.core.Container.Description;
import org.kyojo.schemaorg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n3.core.Container.Identifier;
import org.kyojo.schemaorg.m3n3.core.Container.Image;
import org.kyojo.schemaorg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n3.core.Container.Manufacturer;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n3.core.Container.SameAs;
import org.kyojo.schemaorg.m3n3.core.Container.Url;
import org.kyojo.schemaorg.m3n3.core.DataType;
import org.kyojo.schemaorg.m3n3.core.impl.NAME;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.ActiveIngredient;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Background;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Code;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Guideline;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.IsProprietary;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.MaximumIntake;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.MechanismOfAction;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.NonProprietaryName;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.ProprietaryName;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.RecommendedIntake;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.SafetyConsideration;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.Study;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.TargetPopulation;

public class DIETARY_SUPPLEMENT implements Clazz.DietarySupplement {

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
	public ActiveIngredient activeIngredient;
	public AdditionalType additionalType;
	public AlternateName alternateName;
	public Background background;
	public Code code;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Guideline guideline;
	public Identifier identifier;
	public Image image;
	public IsProprietary isProprietary;
	public LegalStatus legalStatus;
	public MainEntityOfPage mainEntityOfPage;
	public Manufacturer manufacturer;
	public MaximumIntake maximumIntake;
	public MechanismOfAction mechanismOfAction;
	public MedicineSystem medicineSystem;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NonProprietaryName nonProprietaryName;
	public PotentialAction potentialAction;
	public ProprietaryName proprietaryName;
	public RecognizingAuthority recognizingAuthority;
	public RecommendedIntake recommendedIntake;
	public RelevantSpecialty relevantSpecialty;
	public SafetyConsideration safetyConsideration;
	public SameAs sameAs;
	public Study study;
	public TargetPopulation targetPopulation;
	public Url url;

	public DIETARY_SUPPLEMENT() {
	}

	public DIETARY_SUPPLEMENT(Long seq) {
		setSeq(seq);
	}

	public DIETARY_SUPPLEMENT(String string) {
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

	public DIETARY_SUPPLEMENT(ActiveIngredient activeIngredient) {
		setActiveIngredient(activeIngredient);
	}

	@Override
	public ActiveIngredient getActiveIngredient() {
		return activeIngredient;
	}

	@Override
	public void setActiveIngredient(ActiveIngredient activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	public DIETARY_SUPPLEMENT(AdditionalType additionalType) {
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

	public DIETARY_SUPPLEMENT(AlternateName alternateName) {
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

	public DIETARY_SUPPLEMENT(Background background) {
		setBackground(background);
	}

	@Override
	public Background getBackground() {
		return background;
	}

	@Override
	public void setBackground(Background background) {
		this.background = background;
	}

	public DIETARY_SUPPLEMENT(Code code) {
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

	public DIETARY_SUPPLEMENT(Description description) {
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

	public DIETARY_SUPPLEMENT(DisambiguatingDescription disambiguatingDescription) {
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

	public DIETARY_SUPPLEMENT(Guideline guideline) {
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

	public DIETARY_SUPPLEMENT(Identifier identifier) {
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

	public DIETARY_SUPPLEMENT(Image image) {
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

	public DIETARY_SUPPLEMENT(IsProprietary isProprietary) {
		setIsProprietary(isProprietary);
	}

	@Override
	public IsProprietary getIsProprietary() {
		return isProprietary;
	}

	@Override
	public void setIsProprietary(IsProprietary isProprietary) {
		this.isProprietary = isProprietary;
	}

	public DIETARY_SUPPLEMENT(LegalStatus legalStatus) {
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

	public DIETARY_SUPPLEMENT(MainEntityOfPage mainEntityOfPage) {
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

	public DIETARY_SUPPLEMENT(Manufacturer manufacturer) {
		setManufacturer(manufacturer);
	}

	@Override
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	@Override
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public DIETARY_SUPPLEMENT(MaximumIntake maximumIntake) {
		setMaximumIntake(maximumIntake);
	}

	@Override
	public MaximumIntake getMaximumIntake() {
		return maximumIntake;
	}

	@Override
	public void setMaximumIntake(MaximumIntake maximumIntake) {
		this.maximumIntake = maximumIntake;
	}

	public DIETARY_SUPPLEMENT(MechanismOfAction mechanismOfAction) {
		setMechanismOfAction(mechanismOfAction);
	}

	@Override
	public MechanismOfAction getMechanismOfAction() {
		return mechanismOfAction;
	}

	@Override
	public void setMechanismOfAction(MechanismOfAction mechanismOfAction) {
		this.mechanismOfAction = mechanismOfAction;
	}

	public DIETARY_SUPPLEMENT(MedicineSystem medicineSystem) {
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

	public DIETARY_SUPPLEMENT(Name name) {
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

	public DIETARY_SUPPLEMENT(NameFuzzy nameFuzzy) {
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

	public DIETARY_SUPPLEMENT(NameRuby nameRuby) {
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

	public DIETARY_SUPPLEMENT(NonProprietaryName nonProprietaryName) {
		setNonProprietaryName(nonProprietaryName);
	}

	@Override
	public NonProprietaryName getNonProprietaryName() {
		return nonProprietaryName;
	}

	@Override
	public void setNonProprietaryName(NonProprietaryName nonProprietaryName) {
		this.nonProprietaryName = nonProprietaryName;
	}

	public DIETARY_SUPPLEMENT(PotentialAction potentialAction) {
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

	public DIETARY_SUPPLEMENT(ProprietaryName proprietaryName) {
		setProprietaryName(proprietaryName);
	}

	@Override
	public ProprietaryName getProprietaryName() {
		return proprietaryName;
	}

	@Override
	public void setProprietaryName(ProprietaryName proprietaryName) {
		this.proprietaryName = proprietaryName;
	}

	public DIETARY_SUPPLEMENT(RecognizingAuthority recognizingAuthority) {
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

	public DIETARY_SUPPLEMENT(RecommendedIntake recommendedIntake) {
		setRecommendedIntake(recommendedIntake);
	}

	@Override
	public RecommendedIntake getRecommendedIntake() {
		return recommendedIntake;
	}

	@Override
	public void setRecommendedIntake(RecommendedIntake recommendedIntake) {
		this.recommendedIntake = recommendedIntake;
	}

	public DIETARY_SUPPLEMENT(RelevantSpecialty relevantSpecialty) {
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

	public DIETARY_SUPPLEMENT(SafetyConsideration safetyConsideration) {
		setSafetyConsideration(safetyConsideration);
	}

	@Override
	public SafetyConsideration getSafetyConsideration() {
		return safetyConsideration;
	}

	@Override
	public void setSafetyConsideration(SafetyConsideration safetyConsideration) {
		this.safetyConsideration = safetyConsideration;
	}

	public DIETARY_SUPPLEMENT(SameAs sameAs) {
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

	public DIETARY_SUPPLEMENT(Study study) {
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

	public DIETARY_SUPPLEMENT(TargetPopulation targetPopulation) {
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

	public DIETARY_SUPPLEMENT(Url url) {
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

	public DIETARY_SUPPLEMENT(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			ActiveIngredient activeIngredient,
			AdditionalType additionalType,
			AlternateName alternateName,
			Background background,
			Code code,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Guideline guideline,
			Identifier identifier,
			Image image,
			IsProprietary isProprietary,
			LegalStatus legalStatus,
			MainEntityOfPage mainEntityOfPage,
			Manufacturer manufacturer,
			MaximumIntake maximumIntake,
			MechanismOfAction mechanismOfAction,
			MedicineSystem medicineSystem,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NonProprietaryName nonProprietaryName,
			PotentialAction potentialAction,
			ProprietaryName proprietaryName,
			RecognizingAuthority recognizingAuthority,
			RecommendedIntake recommendedIntake,
			RelevantSpecialty relevantSpecialty,
			SafetyConsideration safetyConsideration,
			SameAs sameAs,
			Study study,
			TargetPopulation targetPopulation,
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
		setActiveIngredient(activeIngredient);
		setAdditionalType(additionalType);
		setAlternateName(alternateName);
		setBackground(background);
		setCode(code);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setGuideline(guideline);
		setIdentifier(identifier);
		setImage(image);
		setIsProprietary(isProprietary);
		setLegalStatus(legalStatus);
		setMainEntityOfPage(mainEntityOfPage);
		setManufacturer(manufacturer);
		setMaximumIntake(maximumIntake);
		setMechanismOfAction(mechanismOfAction);
		setMedicineSystem(medicineSystem);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNonProprietaryName(nonProprietaryName);
		setPotentialAction(potentialAction);
		setProprietaryName(proprietaryName);
		setRecognizingAuthority(recognizingAuthority);
		setRecommendedIntake(recommendedIntake);
		setRelevantSpecialty(relevantSpecialty);
		setSafetyConsideration(safetyConsideration);
		setSameAs(sameAs);
		setStudy(study);
		setTargetPopulation(targetPopulation);
		setUrl(url);
	}

	public void copy(Clazz.DietarySupplement org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setActiveIngredient(org.getActiveIngredient());
		setAdditionalType(org.getAdditionalType());
		setAlternateName(org.getAlternateName());
		setBackground(org.getBackground());
		setCode(org.getCode());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsProprietary(org.getIsProprietary());
		setLegalStatus(org.getLegalStatus());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setManufacturer(org.getManufacturer());
		setMaximumIntake(org.getMaximumIntake());
		setMechanismOfAction(org.getMechanismOfAction());
		setMedicineSystem(org.getMedicineSystem());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNonProprietaryName(org.getNonProprietaryName());
		setPotentialAction(org.getPotentialAction());
		setProprietaryName(org.getProprietaryName());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRecommendedIntake(org.getRecommendedIntake());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setSafetyConsideration(org.getSafetyConsideration());
		setSameAs(org.getSameAs());
		setStudy(org.getStudy());
		setTargetPopulation(org.getTargetPopulation());
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
