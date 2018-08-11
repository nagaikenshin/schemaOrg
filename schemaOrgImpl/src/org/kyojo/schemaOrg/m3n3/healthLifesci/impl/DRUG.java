package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Manufacturer;
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
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActiveIngredient;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdministrationRoute;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AlcoholWarning;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AvailableStrength;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.BreastfeedingWarning;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ClinicalPharmacology;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Code;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Cost;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DosageForm;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DoseSchedule;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugClass;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DrugUnit;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.FoodWarning;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.InteractingDrug;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsAvailableGenerically;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.IsProprietary;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LabelDetails;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.LegalStatus;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MaximumIntake;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MechanismOfAction;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.MedicineSystem;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NonProprietaryName;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Overdosage;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyCategory;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PregnancyWarning;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrescribingInfo;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PrescriptionStatus;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ProprietaryName;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedDrug;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelevantSpecialty;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Warning;
import org.kyojo.schemaOrg.m3n3.pending.Container.IncludedInHealthInsurancePlan;
import org.kyojo.schemaOrg.m3n3.pending.Container.Rxcui;

public class DRUG implements Clazz.Drug, Container.Drug {

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
	public AdministrationRoute administrationRoute;
	public AlcoholWarning alcoholWarning;
	public AlternateName alternateName;
	public AvailableStrength availableStrength;
	public BreastfeedingWarning breastfeedingWarning;
	public ClinicalPharmacology clinicalPharmacology;
	public Code code;
	public Cost cost;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DosageForm dosageForm;
	public DoseSchedule doseSchedule;
	public List<Clazz.Drug> drugList;
	public DrugClass drugClass;
	public DrugUnit drugUnit;
	public FoodWarning foodWarning;
	public Guideline guideline;
	public Identifier identifier;
	public Image image;
	public IncludedInHealthInsurancePlan includedInHealthInsurancePlan;
	public InteractingDrug interactingDrug;
	public IsAvailableGenerically isAvailableGenerically;
	public IsProprietary isProprietary;
	public LabelDetails labelDetails;
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
	public Overdosage overdosage;
	public PotentialAction potentialAction;
	public PregnancyCategory pregnancyCategory;
	public PregnancyWarning pregnancyWarning;
	public PrescribingInfo prescribingInfo;
	public PrescriptionStatus prescriptionStatus;
	public ProprietaryName proprietaryName;
	public RecognizingAuthority recognizingAuthority;
	public RelatedDrug relatedDrug;
	public RelevantSpecialty relevantSpecialty;
	public Rxcui rxcui;
	public SameAs sameAs;
	public Study study;
	public Url url;
	public Warning warning;

	public DRUG() {
	}

	public DRUG(Long seq) {
		setSeq(seq);
	}

	public DRUG(String string) {
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

	public DRUG(ActiveIngredient activeIngredient) {
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

	public DRUG(AdditionalType additionalType) {
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

	public DRUG(AdministrationRoute administrationRoute) {
		setAdministrationRoute(administrationRoute);
	}

	@Override
	public AdministrationRoute getAdministrationRoute() {
		return administrationRoute;
	}

	@Override
	public void setAdministrationRoute(AdministrationRoute administrationRoute) {
		this.administrationRoute = administrationRoute;
	}

	public DRUG(AlcoholWarning alcoholWarning) {
		setAlcoholWarning(alcoholWarning);
	}

	@Override
	public AlcoholWarning getAlcoholWarning() {
		return alcoholWarning;
	}

	@Override
	public void setAlcoholWarning(AlcoholWarning alcoholWarning) {
		this.alcoholWarning = alcoholWarning;
	}

	public DRUG(AlternateName alternateName) {
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

	public DRUG(AvailableStrength availableStrength) {
		setAvailableStrength(availableStrength);
	}

	@Override
	public AvailableStrength getAvailableStrength() {
		return availableStrength;
	}

	@Override
	public void setAvailableStrength(AvailableStrength availableStrength) {
		this.availableStrength = availableStrength;
	}

	public DRUG(BreastfeedingWarning breastfeedingWarning) {
		setBreastfeedingWarning(breastfeedingWarning);
	}

	@Override
	public BreastfeedingWarning getBreastfeedingWarning() {
		return breastfeedingWarning;
	}

	@Override
	public void setBreastfeedingWarning(BreastfeedingWarning breastfeedingWarning) {
		this.breastfeedingWarning = breastfeedingWarning;
	}

	public DRUG(ClinicalPharmacology clinicalPharmacology) {
		setClinicalPharmacology(clinicalPharmacology);
	}

	@Override
	public ClinicalPharmacology getClinicalPharmacology() {
		return clinicalPharmacology;
	}

	@Override
	public void setClinicalPharmacology(ClinicalPharmacology clinicalPharmacology) {
		this.clinicalPharmacology = clinicalPharmacology;
	}

	public DRUG(Code code) {
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

	public DRUG(Cost cost) {
		setCost(cost);
	}

	@Override
	public Cost getCost() {
		return cost;
	}

	@Override
	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public DRUG(Description description) {
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

	public DRUG(DisambiguatingDescription disambiguatingDescription) {
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

	public DRUG(DosageForm dosageForm) {
		setDosageForm(dosageForm);
	}

	@Override
	public DosageForm getDosageForm() {
		return dosageForm;
	}

	@Override
	public void setDosageForm(DosageForm dosageForm) {
		this.dosageForm = dosageForm;
	}

	public DRUG(DoseSchedule doseSchedule) {
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

	public DRUG(Clazz.Drug drug) {
		drugList = new ArrayList<Clazz.Drug>();
		drugList.add(drug);
	}

	@Override
	public Clazz.Drug getDrug() {
		if(drugList != null && drugList.size() > 0) {
			return drugList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrug(Clazz.Drug drug) {
		if(drugList == null) {
			drugList = new ArrayList<>();
		}
		if(drugList.size() == 0) {
			drugList.add(drug);
		} else {
			drugList.set(0, drug);
		}
	}

	@Override
	public List<Clazz.Drug> getDrugList() {
		return drugList;
	}

	@Override
	public void setDrugList(List<Clazz.Drug> drugList) {
		this.drugList = drugList;
	}

	@Override
	public boolean hasDrug() {
		return drugList != null && drugList.size() > 0 && drugList.get(0) != null;
	}

	public DRUG(DrugClass drugClass) {
		setDrugClass(drugClass);
	}

	@Override
	public DrugClass getDrugClass() {
		return drugClass;
	}

	@Override
	public void setDrugClass(DrugClass drugClass) {
		this.drugClass = drugClass;
	}

	public DRUG(DrugUnit drugUnit) {
		setDrugUnit(drugUnit);
	}

	@Override
	public DrugUnit getDrugUnit() {
		return drugUnit;
	}

	@Override
	public void setDrugUnit(DrugUnit drugUnit) {
		this.drugUnit = drugUnit;
	}

	public DRUG(FoodWarning foodWarning) {
		setFoodWarning(foodWarning);
	}

	@Override
	public FoodWarning getFoodWarning() {
		return foodWarning;
	}

	@Override
	public void setFoodWarning(FoodWarning foodWarning) {
		this.foodWarning = foodWarning;
	}

	public DRUG(Guideline guideline) {
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

	public DRUG(Identifier identifier) {
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

	public DRUG(Image image) {
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

	public DRUG(IncludedInHealthInsurancePlan includedInHealthInsurancePlan) {
		setIncludedInHealthInsurancePlan(includedInHealthInsurancePlan);
	}

	@Override
	public IncludedInHealthInsurancePlan getIncludedInHealthInsurancePlan() {
		return includedInHealthInsurancePlan;
	}

	@Override
	public void setIncludedInHealthInsurancePlan(IncludedInHealthInsurancePlan includedInHealthInsurancePlan) {
		this.includedInHealthInsurancePlan = includedInHealthInsurancePlan;
	}

	public DRUG(InteractingDrug interactingDrug) {
		setInteractingDrug(interactingDrug);
	}

	@Override
	public InteractingDrug getInteractingDrug() {
		return interactingDrug;
	}

	@Override
	public void setInteractingDrug(InteractingDrug interactingDrug) {
		this.interactingDrug = interactingDrug;
	}

	public DRUG(IsAvailableGenerically isAvailableGenerically) {
		setIsAvailableGenerically(isAvailableGenerically);
	}

	@Override
	public IsAvailableGenerically getIsAvailableGenerically() {
		return isAvailableGenerically;
	}

	@Override
	public void setIsAvailableGenerically(IsAvailableGenerically isAvailableGenerically) {
		this.isAvailableGenerically = isAvailableGenerically;
	}

	public DRUG(IsProprietary isProprietary) {
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

	public DRUG(LabelDetails labelDetails) {
		setLabelDetails(labelDetails);
	}

	@Override
	public LabelDetails getLabelDetails() {
		return labelDetails;
	}

	@Override
	public void setLabelDetails(LabelDetails labelDetails) {
		this.labelDetails = labelDetails;
	}

	public DRUG(LegalStatus legalStatus) {
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

	public DRUG(MainEntityOfPage mainEntityOfPage) {
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

	public DRUG(Manufacturer manufacturer) {
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

	public DRUG(MaximumIntake maximumIntake) {
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

	public DRUG(MechanismOfAction mechanismOfAction) {
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

	public DRUG(MedicineSystem medicineSystem) {
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

	public DRUG(Name name) {
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

	public DRUG(NameFuzzy nameFuzzy) {
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

	public DRUG(NameRuby nameRuby) {
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

	public DRUG(NonProprietaryName nonProprietaryName) {
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

	public DRUG(Overdosage overdosage) {
		setOverdosage(overdosage);
	}

	@Override
	public Overdosage getOverdosage() {
		return overdosage;
	}

	@Override
	public void setOverdosage(Overdosage overdosage) {
		this.overdosage = overdosage;
	}

	public DRUG(PotentialAction potentialAction) {
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

	public DRUG(PregnancyCategory pregnancyCategory) {
		setPregnancyCategory(pregnancyCategory);
	}

	@Override
	public PregnancyCategory getPregnancyCategory() {
		return pregnancyCategory;
	}

	@Override
	public void setPregnancyCategory(PregnancyCategory pregnancyCategory) {
		this.pregnancyCategory = pregnancyCategory;
	}

	public DRUG(PregnancyWarning pregnancyWarning) {
		setPregnancyWarning(pregnancyWarning);
	}

	@Override
	public PregnancyWarning getPregnancyWarning() {
		return pregnancyWarning;
	}

	@Override
	public void setPregnancyWarning(PregnancyWarning pregnancyWarning) {
		this.pregnancyWarning = pregnancyWarning;
	}

	public DRUG(PrescribingInfo prescribingInfo) {
		setPrescribingInfo(prescribingInfo);
	}

	@Override
	public PrescribingInfo getPrescribingInfo() {
		return prescribingInfo;
	}

	@Override
	public void setPrescribingInfo(PrescribingInfo prescribingInfo) {
		this.prescribingInfo = prescribingInfo;
	}

	public DRUG(PrescriptionStatus prescriptionStatus) {
		setPrescriptionStatus(prescriptionStatus);
	}

	@Override
	public PrescriptionStatus getPrescriptionStatus() {
		return prescriptionStatus;
	}

	@Override
	public void setPrescriptionStatus(PrescriptionStatus prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

	public DRUG(ProprietaryName proprietaryName) {
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

	public DRUG(RecognizingAuthority recognizingAuthority) {
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

	public DRUG(RelatedDrug relatedDrug) {
		setRelatedDrug(relatedDrug);
	}

	@Override
	public RelatedDrug getRelatedDrug() {
		return relatedDrug;
	}

	@Override
	public void setRelatedDrug(RelatedDrug relatedDrug) {
		this.relatedDrug = relatedDrug;
	}

	public DRUG(RelevantSpecialty relevantSpecialty) {
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

	public DRUG(Rxcui rxcui) {
		setRxcui(rxcui);
	}

	@Override
	public Rxcui getRxcui() {
		return rxcui;
	}

	@Override
	public void setRxcui(Rxcui rxcui) {
		this.rxcui = rxcui;
	}

	public DRUG(SameAs sameAs) {
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

	public DRUG(Study study) {
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

	public DRUG(Url url) {
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

	public DRUG(Warning warning) {
		setWarning(warning);
	}

	@Override
	public Warning getWarning() {
		return warning;
	}

	@Override
	public void setWarning(Warning warning) {
		this.warning = warning;
	}

	public DRUG(Long seq,
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
			AdministrationRoute administrationRoute,
			AlcoholWarning alcoholWarning,
			AlternateName alternateName,
			AvailableStrength availableStrength,
			BreastfeedingWarning breastfeedingWarning,
			ClinicalPharmacology clinicalPharmacology,
			Code code,
			Cost cost,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DosageForm dosageForm,
			DoseSchedule doseSchedule,
			List<Clazz.Drug> drugList,
			DrugClass drugClass,
			DrugUnit drugUnit,
			FoodWarning foodWarning,
			Guideline guideline,
			Identifier identifier,
			Image image,
			IncludedInHealthInsurancePlan includedInHealthInsurancePlan,
			InteractingDrug interactingDrug,
			IsAvailableGenerically isAvailableGenerically,
			IsProprietary isProprietary,
			LabelDetails labelDetails,
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
			Overdosage overdosage,
			PotentialAction potentialAction,
			PregnancyCategory pregnancyCategory,
			PregnancyWarning pregnancyWarning,
			PrescribingInfo prescribingInfo,
			PrescriptionStatus prescriptionStatus,
			ProprietaryName proprietaryName,
			RecognizingAuthority recognizingAuthority,
			RelatedDrug relatedDrug,
			RelevantSpecialty relevantSpecialty,
			Rxcui rxcui,
			SameAs sameAs,
			Study study,
			Url url,
			Warning warning) {
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
		setAdministrationRoute(administrationRoute);
		setAlcoholWarning(alcoholWarning);
		setAlternateName(alternateName);
		setAvailableStrength(availableStrength);
		setBreastfeedingWarning(breastfeedingWarning);
		setClinicalPharmacology(clinicalPharmacology);
		setCode(code);
		setCost(cost);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDosageForm(dosageForm);
		setDoseSchedule(doseSchedule);
		setDrugList(drugList);
		setDrugClass(drugClass);
		setDrugUnit(drugUnit);
		setFoodWarning(foodWarning);
		setGuideline(guideline);
		setIdentifier(identifier);
		setImage(image);
		setIncludedInHealthInsurancePlan(includedInHealthInsurancePlan);
		setInteractingDrug(interactingDrug);
		setIsAvailableGenerically(isAvailableGenerically);
		setIsProprietary(isProprietary);
		setLabelDetails(labelDetails);
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
		setOverdosage(overdosage);
		setPotentialAction(potentialAction);
		setPregnancyCategory(pregnancyCategory);
		setPregnancyWarning(pregnancyWarning);
		setPrescribingInfo(prescribingInfo);
		setPrescriptionStatus(prescriptionStatus);
		setProprietaryName(proprietaryName);
		setRecognizingAuthority(recognizingAuthority);
		setRelatedDrug(relatedDrug);
		setRelevantSpecialty(relevantSpecialty);
		setRxcui(rxcui);
		setSameAs(sameAs);
		setStudy(study);
		setUrl(url);
		setWarning(warning);
	}

	public void copy(Clazz.Drug org) {
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
		setAdministrationRoute(org.getAdministrationRoute());
		setAlcoholWarning(org.getAlcoholWarning());
		setAlternateName(org.getAlternateName());
		setAvailableStrength(org.getAvailableStrength());
		setBreastfeedingWarning(org.getBreastfeedingWarning());
		setClinicalPharmacology(org.getClinicalPharmacology());
		setCode(org.getCode());
		setCost(org.getCost());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDosageForm(org.getDosageForm());
		setDoseSchedule(org.getDoseSchedule());
		setDrugClass(org.getDrugClass());
		setDrugUnit(org.getDrugUnit());
		setFoodWarning(org.getFoodWarning());
		setGuideline(org.getGuideline());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIncludedInHealthInsurancePlan(org.getIncludedInHealthInsurancePlan());
		setInteractingDrug(org.getInteractingDrug());
		setIsAvailableGenerically(org.getIsAvailableGenerically());
		setIsProprietary(org.getIsProprietary());
		setLabelDetails(org.getLabelDetails());
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
		setOverdosage(org.getOverdosage());
		setPotentialAction(org.getPotentialAction());
		setPregnancyCategory(org.getPregnancyCategory());
		setPregnancyWarning(org.getPregnancyWarning());
		setPrescribingInfo(org.getPrescribingInfo());
		setPrescriptionStatus(org.getPrescriptionStatus());
		setProprietaryName(org.getProprietaryName());
		setRecognizingAuthority(org.getRecognizingAuthority());
		setRelatedDrug(org.getRelatedDrug());
		setRelevantSpecialty(org.getRelevantSpecialty());
		setRxcui(org.getRxcui());
		setSameAs(org.getSameAs());
		setStudy(org.getStudy());
		setUrl(org.getUrl());
		setWarning(org.getWarning());
	}

	public void copy(Container.Drug org) {
		setDrugList(org.getDrugList());
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
