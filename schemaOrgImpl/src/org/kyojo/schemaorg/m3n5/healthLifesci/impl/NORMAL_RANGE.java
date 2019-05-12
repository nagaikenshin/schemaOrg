package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugClass;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCost;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCostCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPregnancyCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.InfectiousAgentClass;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalDevicePurpose;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalEnumeration;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalEvidenceLevel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalObservationalStudyDesign;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalProcedureType;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalSpecialty;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalStudyStatus;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTrialDesign;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicineSystem;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Patient;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;

public class NORMAL_RANGE implements Container.NormalRange {

	private static final long serialVersionUID = 1L;

	public List<DrugClass> drugClassList;
	public List<DrugCost> drugCostList;
	public List<DrugCostCategory> drugCostCategoryList;
	public List<DrugPregnancyCategory> drugPregnancyCategoryList;
	public List<DrugPrescriptionStatus> drugPrescriptionStatusList;
	public List<InfectiousAgentClass> infectiousAgentClassList;
	public List<MedicalAudience> medicalAudienceList;
	public List<MedicalDevicePurpose> medicalDevicePurposeList;
	public List<MedicalEnumeration> medicalEnumerationList;
	public List<MedicalEvidenceLevel> medicalEvidenceLevelList;
	public List<MedicalImagingTechnique> medicalImagingTechniqueList;
	public List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList;
	public List<MedicalProcedureType> medicalProcedureTypeList;
	public List<MedicalSpecialty> medicalSpecialtyList;
	public List<MedicalStudyStatus> medicalStudyStatusList;
	public List<MedicalTrialDesign> medicalTrialDesignList;
	public List<MedicineSystem> medicineSystemList;
	public List<Patient> patientList;
	public List<PhysicalExam> physicalExamList;
	public List<Text> textList;

	public NORMAL_RANGE() {
	}

	public NORMAL_RANGE(DrugClass drugClass) {
		drugClassList = new ArrayList<DrugClass>();
		drugClassList.add(drugClass);
	}

	@Override
	public DrugClass getDrugClass() {
		if(drugClassList != null && drugClassList.size() > 0) {
			return drugClassList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugClass(DrugClass drugClass) {
		if(drugClassList == null) {
			drugClassList = new ArrayList<>();
		}
		if(drugClassList.size() == 0) {
			drugClassList.add(drugClass);
		} else {
			drugClassList.set(0, drugClass);
		}
	}

	@Override
	public List<DrugClass> getDrugClassList() {
		return drugClassList;
	}

	@Override
	public void setDrugClassList(List<DrugClass> drugClassList) {
		this.drugClassList = drugClassList;
	}

	@Override
	public boolean hasDrugClass() {
		return drugClassList != null && drugClassList.size() > 0 && drugClassList.get(0) != null;
	}

	public NORMAL_RANGE(DrugCost drugCost) {
		drugCostList = new ArrayList<DrugCost>();
		drugCostList.add(drugCost);
	}

	@Override
	public DrugCost getDrugCost() {
		if(drugCostList != null && drugCostList.size() > 0) {
			return drugCostList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCost(DrugCost drugCost) {
		if(drugCostList == null) {
			drugCostList = new ArrayList<>();
		}
		if(drugCostList.size() == 0) {
			drugCostList.add(drugCost);
		} else {
			drugCostList.set(0, drugCost);
		}
	}

	@Override
	public List<DrugCost> getDrugCostList() {
		return drugCostList;
	}

	@Override
	public void setDrugCostList(List<DrugCost> drugCostList) {
		this.drugCostList = drugCostList;
	}

	@Override
	public boolean hasDrugCost() {
		return drugCostList != null && drugCostList.size() > 0 && drugCostList.get(0) != null;
	}

	public NORMAL_RANGE(DrugCostCategory drugCostCategory) {
		drugCostCategoryList = new ArrayList<DrugCostCategory>();
		drugCostCategoryList.add(drugCostCategory);
	}

	@Override
	public DrugCostCategory getDrugCostCategory() {
		if(drugCostCategoryList != null && drugCostCategoryList.size() > 0) {
			return drugCostCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCostCategory(DrugCostCategory drugCostCategory) {
		if(drugCostCategoryList == null) {
			drugCostCategoryList = new ArrayList<>();
		}
		if(drugCostCategoryList.size() == 0) {
			drugCostCategoryList.add(drugCostCategory);
		} else {
			drugCostCategoryList.set(0, drugCostCategory);
		}
	}

	@Override
	public List<DrugCostCategory> getDrugCostCategoryList() {
		return drugCostCategoryList;
	}

	@Override
	public void setDrugCostCategoryList(List<DrugCostCategory> drugCostCategoryList) {
		this.drugCostCategoryList = drugCostCategoryList;
	}

	@Override
	public boolean hasDrugCostCategory() {
		return drugCostCategoryList != null && drugCostCategoryList.size() > 0 && drugCostCategoryList.get(0) != null;
	}

	public NORMAL_RANGE(DrugPregnancyCategory drugPregnancyCategory) {
		drugPregnancyCategoryList = new ArrayList<DrugPregnancyCategory>();
		drugPregnancyCategoryList.add(drugPregnancyCategory);
	}

	@Override
	public DrugPregnancyCategory getDrugPregnancyCategory() {
		if(drugPregnancyCategoryList != null && drugPregnancyCategoryList.size() > 0) {
			return drugPregnancyCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugPregnancyCategory(DrugPregnancyCategory drugPregnancyCategory) {
		if(drugPregnancyCategoryList == null) {
			drugPregnancyCategoryList = new ArrayList<>();
		}
		if(drugPregnancyCategoryList.size() == 0) {
			drugPregnancyCategoryList.add(drugPregnancyCategory);
		} else {
			drugPregnancyCategoryList.set(0, drugPregnancyCategory);
		}
	}

	@Override
	public List<DrugPregnancyCategory> getDrugPregnancyCategoryList() {
		return drugPregnancyCategoryList;
	}

	@Override
	public void setDrugPregnancyCategoryList(List<DrugPregnancyCategory> drugPregnancyCategoryList) {
		this.drugPregnancyCategoryList = drugPregnancyCategoryList;
	}

	@Override
	public boolean hasDrugPregnancyCategory() {
		return drugPregnancyCategoryList != null && drugPregnancyCategoryList.size() > 0 && drugPregnancyCategoryList.get(0) != null;
	}

	public NORMAL_RANGE(DrugPrescriptionStatus drugPrescriptionStatus) {
		drugPrescriptionStatusList = new ArrayList<DrugPrescriptionStatus>();
		drugPrescriptionStatusList.add(drugPrescriptionStatus);
	}

	@Override
	public DrugPrescriptionStatus getDrugPrescriptionStatus() {
		if(drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0) {
			return drugPrescriptionStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugPrescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus) {
		if(drugPrescriptionStatusList == null) {
			drugPrescriptionStatusList = new ArrayList<>();
		}
		if(drugPrescriptionStatusList.size() == 0) {
			drugPrescriptionStatusList.add(drugPrescriptionStatus);
		} else {
			drugPrescriptionStatusList.set(0, drugPrescriptionStatus);
		}
	}

	@Override
	public List<DrugPrescriptionStatus> getDrugPrescriptionStatusList() {
		return drugPrescriptionStatusList;
	}

	@Override
	public void setDrugPrescriptionStatusList(List<DrugPrescriptionStatus> drugPrescriptionStatusList) {
		this.drugPrescriptionStatusList = drugPrescriptionStatusList;
	}

	@Override
	public boolean hasDrugPrescriptionStatus() {
		return drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0 && drugPrescriptionStatusList.get(0) != null;
	}

	public NORMAL_RANGE(InfectiousAgentClass infectiousAgentClass) {
		infectiousAgentClassList = new ArrayList<InfectiousAgentClass>();
		infectiousAgentClassList.add(infectiousAgentClass);
	}

	@Override
	public InfectiousAgentClass getInfectiousAgentClass() {
		if(infectiousAgentClassList != null && infectiousAgentClassList.size() > 0) {
			return infectiousAgentClassList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
		if(infectiousAgentClassList == null) {
			infectiousAgentClassList = new ArrayList<>();
		}
		if(infectiousAgentClassList.size() == 0) {
			infectiousAgentClassList.add(infectiousAgentClass);
		} else {
			infectiousAgentClassList.set(0, infectiousAgentClass);
		}
	}

	@Override
	public List<InfectiousAgentClass> getInfectiousAgentClassList() {
		return infectiousAgentClassList;
	}

	@Override
	public void setInfectiousAgentClassList(List<InfectiousAgentClass> infectiousAgentClassList) {
		this.infectiousAgentClassList = infectiousAgentClassList;
	}

	@Override
	public boolean hasInfectiousAgentClass() {
		return infectiousAgentClassList != null && infectiousAgentClassList.size() > 0 && infectiousAgentClassList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalAudience medicalAudience) {
		medicalAudienceList = new ArrayList<MedicalAudience>();
		medicalAudienceList.add(medicalAudience);
	}

	@Override
	public MedicalAudience getMedicalAudience() {
		if(medicalAudienceList != null && medicalAudienceList.size() > 0) {
			return medicalAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalAudience(MedicalAudience medicalAudience) {
		if(medicalAudienceList == null) {
			medicalAudienceList = new ArrayList<>();
		}
		if(medicalAudienceList.size() == 0) {
			medicalAudienceList.add(medicalAudience);
		} else {
			medicalAudienceList.set(0, medicalAudience);
		}
	}

	@Override
	public List<MedicalAudience> getMedicalAudienceList() {
		return medicalAudienceList;
	}

	@Override
	public void setMedicalAudienceList(List<MedicalAudience> medicalAudienceList) {
		this.medicalAudienceList = medicalAudienceList;
	}

	@Override
	public boolean hasMedicalAudience() {
		return medicalAudienceList != null && medicalAudienceList.size() > 0 && medicalAudienceList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalDevicePurpose medicalDevicePurpose) {
		medicalDevicePurposeList = new ArrayList<MedicalDevicePurpose>();
		medicalDevicePurposeList.add(medicalDevicePurpose);
	}

	@Override
	public MedicalDevicePurpose getMedicalDevicePurpose() {
		if(medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0) {
			return medicalDevicePurposeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose) {
		if(medicalDevicePurposeList == null) {
			medicalDevicePurposeList = new ArrayList<>();
		}
		if(medicalDevicePurposeList.size() == 0) {
			medicalDevicePurposeList.add(medicalDevicePurpose);
		} else {
			medicalDevicePurposeList.set(0, medicalDevicePurpose);
		}
	}

	@Override
	public List<MedicalDevicePurpose> getMedicalDevicePurposeList() {
		return medicalDevicePurposeList;
	}

	@Override
	public void setMedicalDevicePurposeList(List<MedicalDevicePurpose> medicalDevicePurposeList) {
		this.medicalDevicePurposeList = medicalDevicePurposeList;
	}

	@Override
	public boolean hasMedicalDevicePurpose() {
		return medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0 && medicalDevicePurposeList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalEnumeration medicalEnumeration) {
		medicalEnumerationList = new ArrayList<MedicalEnumeration>();
		medicalEnumerationList.add(medicalEnumeration);
	}

	@Override
	public MedicalEnumeration getMedicalEnumeration() {
		if(medicalEnumerationList != null && medicalEnumerationList.size() > 0) {
			return medicalEnumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEnumeration(MedicalEnumeration medicalEnumeration) {
		if(medicalEnumerationList == null) {
			medicalEnumerationList = new ArrayList<>();
		}
		if(medicalEnumerationList.size() == 0) {
			medicalEnumerationList.add(medicalEnumeration);
		} else {
			medicalEnumerationList.set(0, medicalEnumeration);
		}
	}

	@Override
	public List<MedicalEnumeration> getMedicalEnumerationList() {
		return medicalEnumerationList;
	}

	@Override
	public void setMedicalEnumerationList(List<MedicalEnumeration> medicalEnumerationList) {
		this.medicalEnumerationList = medicalEnumerationList;
	}

	@Override
	public boolean hasMedicalEnumeration() {
		return medicalEnumerationList != null && medicalEnumerationList.size() > 0 && medicalEnumerationList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalEvidenceLevel medicalEvidenceLevel) {
		medicalEvidenceLevelList = new ArrayList<MedicalEvidenceLevel>();
		medicalEvidenceLevelList.add(medicalEvidenceLevel);
	}

	@Override
	public MedicalEvidenceLevel getMedicalEvidenceLevel() {
		if(medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0) {
			return medicalEvidenceLevelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEvidenceLevel(MedicalEvidenceLevel medicalEvidenceLevel) {
		if(medicalEvidenceLevelList == null) {
			medicalEvidenceLevelList = new ArrayList<>();
		}
		if(medicalEvidenceLevelList.size() == 0) {
			medicalEvidenceLevelList.add(medicalEvidenceLevel);
		} else {
			medicalEvidenceLevelList.set(0, medicalEvidenceLevel);
		}
	}

	@Override
	public List<MedicalEvidenceLevel> getMedicalEvidenceLevelList() {
		return medicalEvidenceLevelList;
	}

	@Override
	public void setMedicalEvidenceLevelList(List<MedicalEvidenceLevel> medicalEvidenceLevelList) {
		this.medicalEvidenceLevelList = medicalEvidenceLevelList;
	}

	@Override
	public boolean hasMedicalEvidenceLevel() {
		return medicalEvidenceLevelList != null && medicalEvidenceLevelList.size() > 0 && medicalEvidenceLevelList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalImagingTechnique medicalImagingTechnique) {
		medicalImagingTechniqueList = new ArrayList<MedicalImagingTechnique>();
		medicalImagingTechniqueList.add(medicalImagingTechnique);
	}

	@Override
	public MedicalImagingTechnique getMedicalImagingTechnique() {
		if(medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0) {
			return medicalImagingTechniqueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalImagingTechnique(MedicalImagingTechnique medicalImagingTechnique) {
		if(medicalImagingTechniqueList == null) {
			medicalImagingTechniqueList = new ArrayList<>();
		}
		if(medicalImagingTechniqueList.size() == 0) {
			medicalImagingTechniqueList.add(medicalImagingTechnique);
		} else {
			medicalImagingTechniqueList.set(0, medicalImagingTechnique);
		}
	}

	@Override
	public List<MedicalImagingTechnique> getMedicalImagingTechniqueList() {
		return medicalImagingTechniqueList;
	}

	@Override
	public void setMedicalImagingTechniqueList(List<MedicalImagingTechnique> medicalImagingTechniqueList) {
		this.medicalImagingTechniqueList = medicalImagingTechniqueList;
	}

	@Override
	public boolean hasMedicalImagingTechnique() {
		return medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0 && medicalImagingTechniqueList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		medicalObservationalStudyDesignList = new ArrayList<MedicalObservationalStudyDesign>();
		medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
	}

	@Override
	public MedicalObservationalStudyDesign getMedicalObservationalStudyDesign() {
		if(medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0) {
			return medicalObservationalStudyDesignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalObservationalStudyDesign(MedicalObservationalStudyDesign medicalObservationalStudyDesign) {
		if(medicalObservationalStudyDesignList == null) {
			medicalObservationalStudyDesignList = new ArrayList<>();
		}
		if(medicalObservationalStudyDesignList.size() == 0) {
			medicalObservationalStudyDesignList.add(medicalObservationalStudyDesign);
		} else {
			medicalObservationalStudyDesignList.set(0, medicalObservationalStudyDesign);
		}
	}

	@Override
	public List<MedicalObservationalStudyDesign> getMedicalObservationalStudyDesignList() {
		return medicalObservationalStudyDesignList;
	}

	@Override
	public void setMedicalObservationalStudyDesignList(List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList) {
		this.medicalObservationalStudyDesignList = medicalObservationalStudyDesignList;
	}

	@Override
	public boolean hasMedicalObservationalStudyDesign() {
		return medicalObservationalStudyDesignList != null && medicalObservationalStudyDesignList.size() > 0 && medicalObservationalStudyDesignList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalProcedureType medicalProcedureType) {
		medicalProcedureTypeList = new ArrayList<MedicalProcedureType>();
		medicalProcedureTypeList.add(medicalProcedureType);
	}

	@Override
	public MedicalProcedureType getMedicalProcedureType() {
		if(medicalProcedureTypeList != null && medicalProcedureTypeList.size() > 0) {
			return medicalProcedureTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalProcedureType(MedicalProcedureType medicalProcedureType) {
		if(medicalProcedureTypeList == null) {
			medicalProcedureTypeList = new ArrayList<>();
		}
		if(medicalProcedureTypeList.size() == 0) {
			medicalProcedureTypeList.add(medicalProcedureType);
		} else {
			medicalProcedureTypeList.set(0, medicalProcedureType);
		}
	}

	@Override
	public List<MedicalProcedureType> getMedicalProcedureTypeList() {
		return medicalProcedureTypeList;
	}

	@Override
	public void setMedicalProcedureTypeList(List<MedicalProcedureType> medicalProcedureTypeList) {
		this.medicalProcedureTypeList = medicalProcedureTypeList;
	}

	@Override
	public boolean hasMedicalProcedureType() {
		return medicalProcedureTypeList != null && medicalProcedureTypeList.size() > 0 && medicalProcedureTypeList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalSpecialty medicalSpecialty) {
		medicalSpecialtyList = new ArrayList<MedicalSpecialty>();
		medicalSpecialtyList.add(medicalSpecialty);
	}

	@Override
	public MedicalSpecialty getMedicalSpecialty() {
		if(medicalSpecialtyList != null && medicalSpecialtyList.size() > 0) {
			return medicalSpecialtyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		if(medicalSpecialtyList == null) {
			medicalSpecialtyList = new ArrayList<>();
		}
		if(medicalSpecialtyList.size() == 0) {
			medicalSpecialtyList.add(medicalSpecialty);
		} else {
			medicalSpecialtyList.set(0, medicalSpecialty);
		}
	}

	@Override
	public List<MedicalSpecialty> getMedicalSpecialtyList() {
		return medicalSpecialtyList;
	}

	@Override
	public void setMedicalSpecialtyList(List<MedicalSpecialty> medicalSpecialtyList) {
		this.medicalSpecialtyList = medicalSpecialtyList;
	}

	@Override
	public boolean hasMedicalSpecialty() {
		return medicalSpecialtyList != null && medicalSpecialtyList.size() > 0 && medicalSpecialtyList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalStudyStatus medicalStudyStatus) {
		medicalStudyStatusList = new ArrayList<MedicalStudyStatus>();
		medicalStudyStatusList.add(medicalStudyStatus);
	}

	@Override
	public MedicalStudyStatus getMedicalStudyStatus() {
		if(medicalStudyStatusList != null && medicalStudyStatusList.size() > 0) {
			return medicalStudyStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalStudyStatus(MedicalStudyStatus medicalStudyStatus) {
		if(medicalStudyStatusList == null) {
			medicalStudyStatusList = new ArrayList<>();
		}
		if(medicalStudyStatusList.size() == 0) {
			medicalStudyStatusList.add(medicalStudyStatus);
		} else {
			medicalStudyStatusList.set(0, medicalStudyStatus);
		}
	}

	@Override
	public List<MedicalStudyStatus> getMedicalStudyStatusList() {
		return medicalStudyStatusList;
	}

	@Override
	public void setMedicalStudyStatusList(List<MedicalStudyStatus> medicalStudyStatusList) {
		this.medicalStudyStatusList = medicalStudyStatusList;
	}

	@Override
	public boolean hasMedicalStudyStatus() {
		return medicalStudyStatusList != null && medicalStudyStatusList.size() > 0 && medicalStudyStatusList.get(0) != null;
	}

	public NORMAL_RANGE(MedicalTrialDesign medicalTrialDesign) {
		medicalTrialDesignList = new ArrayList<MedicalTrialDesign>();
		medicalTrialDesignList.add(medicalTrialDesign);
	}

	@Override
	public MedicalTrialDesign getMedicalTrialDesign() {
		if(medicalTrialDesignList != null && medicalTrialDesignList.size() > 0) {
			return medicalTrialDesignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTrialDesign(MedicalTrialDesign medicalTrialDesign) {
		if(medicalTrialDesignList == null) {
			medicalTrialDesignList = new ArrayList<>();
		}
		if(medicalTrialDesignList.size() == 0) {
			medicalTrialDesignList.add(medicalTrialDesign);
		} else {
			medicalTrialDesignList.set(0, medicalTrialDesign);
		}
	}

	@Override
	public List<MedicalTrialDesign> getMedicalTrialDesignList() {
		return medicalTrialDesignList;
	}

	@Override
	public void setMedicalTrialDesignList(List<MedicalTrialDesign> medicalTrialDesignList) {
		this.medicalTrialDesignList = medicalTrialDesignList;
	}

	@Override
	public boolean hasMedicalTrialDesign() {
		return medicalTrialDesignList != null && medicalTrialDesignList.size() > 0 && medicalTrialDesignList.get(0) != null;
	}

	public NORMAL_RANGE(MedicineSystem medicineSystem) {
		medicineSystemList = new ArrayList<MedicineSystem>();
		medicineSystemList.add(medicineSystem);
	}

	@Override
	public MedicineSystem getMedicineSystem() {
		if(medicineSystemList != null && medicineSystemList.size() > 0) {
			return medicineSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicineSystem(MedicineSystem medicineSystem) {
		if(medicineSystemList == null) {
			medicineSystemList = new ArrayList<>();
		}
		if(medicineSystemList.size() == 0) {
			medicineSystemList.add(medicineSystem);
		} else {
			medicineSystemList.set(0, medicineSystem);
		}
	}

	@Override
	public List<MedicineSystem> getMedicineSystemList() {
		return medicineSystemList;
	}

	@Override
	public void setMedicineSystemList(List<MedicineSystem> medicineSystemList) {
		this.medicineSystemList = medicineSystemList;
	}

	@Override
	public boolean hasMedicineSystem() {
		return medicineSystemList != null && medicineSystemList.size() > 0 && medicineSystemList.get(0) != null;
	}

	public NORMAL_RANGE(Patient patient) {
		patientList = new ArrayList<Patient>();
		patientList.add(patient);
	}

	@Override
	public Patient getPatient() {
		if(patientList != null && patientList.size() > 0) {
			return patientList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPatient(Patient patient) {
		if(patientList == null) {
			patientList = new ArrayList<>();
		}
		if(patientList.size() == 0) {
			patientList.add(patient);
		} else {
			patientList.set(0, patient);
		}
	}

	@Override
	public List<Patient> getPatientList() {
		return patientList;
	}

	@Override
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	@Override
	public boolean hasPatient() {
		return patientList != null && patientList.size() > 0 && patientList.get(0) != null;
	}

	public NORMAL_RANGE(PhysicalExam physicalExam) {
		physicalExamList = new ArrayList<PhysicalExam>();
		physicalExamList.add(physicalExam);
	}

	@Override
	public PhysicalExam getPhysicalExam() {
		if(physicalExamList != null && physicalExamList.size() > 0) {
			return physicalExamList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalExam(PhysicalExam physicalExam) {
		if(physicalExamList == null) {
			physicalExamList = new ArrayList<>();
		}
		if(physicalExamList.size() == 0) {
			physicalExamList.add(physicalExam);
		} else {
			physicalExamList.set(0, physicalExam);
		}
	}

	@Override
	public List<PhysicalExam> getPhysicalExamList() {
		return physicalExamList;
	}

	@Override
	public void setPhysicalExamList(List<PhysicalExam> physicalExamList) {
		this.physicalExamList = physicalExamList;
	}

	@Override
	public boolean hasPhysicalExam() {
		return physicalExamList != null && physicalExamList.size() > 0 && physicalExamList.get(0) != null;
	}

	public NORMAL_RANGE(String string) {
		this(new TEXT(string));
	}

	public NORMAL_RANGE(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public NORMAL_RANGE(List<DrugClass> drugClassList,
			List<DrugCost> drugCostList,
			List<DrugCostCategory> drugCostCategoryList,
			List<DrugPregnancyCategory> drugPregnancyCategoryList,
			List<DrugPrescriptionStatus> drugPrescriptionStatusList,
			List<InfectiousAgentClass> infectiousAgentClassList,
			List<MedicalAudience> medicalAudienceList,
			List<MedicalDevicePurpose> medicalDevicePurposeList,
			List<MedicalEnumeration> medicalEnumerationList,
			List<MedicalEvidenceLevel> medicalEvidenceLevelList,
			List<MedicalImagingTechnique> medicalImagingTechniqueList,
			List<MedicalObservationalStudyDesign> medicalObservationalStudyDesignList,
			List<MedicalProcedureType> medicalProcedureTypeList,
			List<MedicalSpecialty> medicalSpecialtyList,
			List<MedicalStudyStatus> medicalStudyStatusList,
			List<MedicalTrialDesign> medicalTrialDesignList,
			List<MedicineSystem> medicineSystemList,
			List<Patient> patientList,
			List<PhysicalExam> physicalExamList,
			List<Text> textList) {
		setDrugClassList(drugClassList);
		setDrugCostList(drugCostList);
		setDrugCostCategoryList(drugCostCategoryList);
		setDrugPregnancyCategoryList(drugPregnancyCategoryList);
		setDrugPrescriptionStatusList(drugPrescriptionStatusList);
		setInfectiousAgentClassList(infectiousAgentClassList);
		setMedicalAudienceList(medicalAudienceList);
		setMedicalDevicePurposeList(medicalDevicePurposeList);
		setMedicalEnumerationList(medicalEnumerationList);
		setMedicalEvidenceLevelList(medicalEvidenceLevelList);
		setMedicalImagingTechniqueList(medicalImagingTechniqueList);
		setMedicalObservationalStudyDesignList(medicalObservationalStudyDesignList);
		setMedicalProcedureTypeList(medicalProcedureTypeList);
		setMedicalSpecialtyList(medicalSpecialtyList);
		setMedicalStudyStatusList(medicalStudyStatusList);
		setMedicalTrialDesignList(medicalTrialDesignList);
		setMedicineSystemList(medicineSystemList);
		setPatientList(patientList);
		setPhysicalExamList(physicalExamList);
		setTextList(textList);
	}

	public void copy(Container.NormalRange org) {
		setDrugClassList(org.getDrugClassList());
		setDrugCostList(org.getDrugCostList());
		setDrugCostCategoryList(org.getDrugCostCategoryList());
		setDrugPregnancyCategoryList(org.getDrugPregnancyCategoryList());
		setDrugPrescriptionStatusList(org.getDrugPrescriptionStatusList());
		setInfectiousAgentClassList(org.getInfectiousAgentClassList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setMedicalDevicePurposeList(org.getMedicalDevicePurposeList());
		setMedicalEnumerationList(org.getMedicalEnumerationList());
		setMedicalEvidenceLevelList(org.getMedicalEvidenceLevelList());
		setMedicalImagingTechniqueList(org.getMedicalImagingTechniqueList());
		setMedicalObservationalStudyDesignList(org.getMedicalObservationalStudyDesignList());
		setMedicalProcedureTypeList(org.getMedicalProcedureTypeList());
		setMedicalSpecialtyList(org.getMedicalSpecialtyList());
		setMedicalStudyStatusList(org.getMedicalStudyStatusList());
		setMedicalTrialDesignList(org.getMedicalTrialDesignList());
		setMedicineSystemList(org.getMedicineSystemList());
		setPatientList(org.getPatientList());
		setPhysicalExamList(org.getPhysicalExamList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
