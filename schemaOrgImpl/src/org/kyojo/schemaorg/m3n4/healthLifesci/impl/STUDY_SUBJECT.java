package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ApprovedIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Artery;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BloodTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Bone;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.BrainStructure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DDxElement;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DiagnosticProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DietarySupplement;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugLegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugStrength;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ImagingTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.InfectiousDisease;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Joint;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LifestyleModification;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Ligament;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.LymphaticVessel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MaximumDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCause;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCode;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCondition;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalConditionStage;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalContraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalDevice;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEntity;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineContraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineRecommendation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIntangible;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalObservationalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskCalculator;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskEstimator;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskFactor;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskScore;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTestPanel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTrial;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Muscle;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Nerve;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.OccupationalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PalliativeProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PathologyTest;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalActivity;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PreventionIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PsychologicalTreatment;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RadiationTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RecommendedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ReportedDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Substance;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.SuperficialAnatomy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TherapeuticProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TreatmentIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vein;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vessel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalProcedureType.SurgicalProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.RespiratoryTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_ENTITY;

public class STUDY_SUBJECT implements Container.StudySubject {

	private static final long serialVersionUID = 1L;

	public List<AnatomicalStructure> anatomicalStructureList;
	public List<AnatomicalSystem> anatomicalSystemList;
	public List<ApprovedIndication> approvedIndicationList;
	public List<Artery> arteryList;
	public List<BloodTest> bloodTestList;
	public List<Bone> boneList;
	public List<BrainStructure> brainStructureList;
	public List<DDxElement> ddxElementList;
	public List<DiagnosticProcedure> diagnosticProcedureList;
	public List<Diet> dietList;
	public List<DietarySupplement> dietarySupplementList;
	public List<DoseSchedule> doseScheduleList;
	public List<Drug> drugList;
	public List<DrugLegalStatus> drugLegalStatusList;
	public List<DrugStrength> drugStrengthList;
	public List<ExercisePlan> exercisePlanList;
	public List<ImagingTest> imagingTestList;
	public List<InfectiousDisease> infectiousDiseaseList;
	public List<Joint> jointList;
	public List<LifestyleModification> lifestyleModificationList;
	public List<Ligament> ligamentList;
	public List<LymphaticVessel> lymphaticVesselList;
	public List<MaximumDoseSchedule> maximumDoseScheduleList;
	public List<MedicalCause> medicalCauseList;
	public List<MedicalCode> medicalCodeList;
	public List<MedicalCondition> medicalConditionList;
	public List<MedicalConditionStage> medicalConditionStageList;
	public List<MedicalContraindication> medicalContraindicationList;
	public List<MedicalDevice> medicalDeviceList;
	public List<MedicalEntity> medicalEntityList;
	public List<MedicalGuideline> medicalGuidelineList;
	public List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList;
	public List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList;
	public List<MedicalIndication> medicalIndicationList;
	public List<MedicalIntangible> medicalIntangibleList;
	public List<MedicalObservationalStudy> medicalObservationalStudyList;
	public List<MedicalProcedure> medicalProcedureList;
	public List<MedicalRiskCalculator> medicalRiskCalculatorList;
	public List<MedicalRiskEstimator> medicalRiskEstimatorList;
	public List<MedicalRiskFactor> medicalRiskFactorList;
	public List<MedicalRiskScore> medicalRiskScoreList;
	public List<MedicalSign> medicalSignList;
	public List<MedicalSignOrSymptom> medicalSignOrSymptomList;
	public List<MedicalStudy> medicalStudyList;
	public List<MedicalSymptom> medicalSymptomList;
	public List<MedicalTest> medicalTestList;
	public List<MedicalTestPanel> medicalTestPanelList;
	public List<MedicalTherapy> medicalTherapyList;
	public List<MedicalTrial> medicalTrialList;
	public List<Muscle> muscleList;
	public List<Nerve> nerveList;
	public List<OccupationalTherapy> occupationalTherapyList;
	public List<PalliativeProcedure> palliativeProcedureList;
	public List<PathologyTest> pathologyTestList;
	public List<PhysicalActivity> physicalActivityList;
	public List<PhysicalExam> physicalExamList;
	public List<PhysicalTherapy> physicalTherapyList;
	public List<PreventionIndication> preventionIndicationList;
	public List<PsychologicalTreatment> psychologicalTreatmentList;
	public List<RadiationTherapy> radiationTherapyList;
	public List<RecommendedDoseSchedule> recommendedDoseScheduleList;
	public List<ReportedDoseSchedule> reportedDoseScheduleList;
	public List<RespiratoryTherapy> respiratoryTherapyList;
	public List<Substance> substanceList;
	public List<SuperficialAnatomy> superficialAnatomyList;
	public List<SurgicalProcedure> surgicalProcedureList;
	public List<TherapeuticProcedure> therapeuticProcedureList;
	public List<TreatmentIndication> treatmentIndicationList;
	public List<Vein> veinList;
	public List<Vessel> vesselList;
	public List<VitalSign> vitalSignList;

	public STUDY_SUBJECT() {
	}

	public STUDY_SUBJECT(String string) {
		this(new MEDICAL_ENTITY(string));
	}

	public String getString() {
		if(medicalEntityList == null || medicalEntityList.size() == 0 || medicalEntityList.get(0) == null) {
			return null;
		} else {
			Name name = medicalEntityList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalEntityList == null) {
			medicalEntityList = new ArrayList<MedicalEntity>();
		}
		if(medicalEntityList.size() == 0) {
			medicalEntityList.add(new MEDICAL_ENTITY(string));
		} else {
			medicalEntityList.set(0, new MEDICAL_ENTITY(string));
		}
	}

	public STUDY_SUBJECT(AnatomicalStructure anatomicalStructure) {
		anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		anatomicalStructureList.add(anatomicalStructure);
	}

	@Override
	public AnatomicalStructure getAnatomicalStructure() {
		if(anatomicalStructureList != null && anatomicalStructureList.size() > 0) {
			return anatomicalStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(anatomicalStructure);
		} else {
			anatomicalStructureList.set(0, anatomicalStructure);
		}
	}

	@Override
	public List<AnatomicalStructure> getAnatomicalStructureList() {
		return anatomicalStructureList;
	}

	@Override
	public void setAnatomicalStructureList(List<AnatomicalStructure> anatomicalStructureList) {
		this.anatomicalStructureList = anatomicalStructureList;
	}

	@Override
	public boolean hasAnatomicalStructure() {
		return anatomicalStructureList != null && anatomicalStructureList.size() > 0 && anatomicalStructureList.get(0) != null;
	}

	public STUDY_SUBJECT(AnatomicalSystem anatomicalSystem) {
		anatomicalSystemList = new ArrayList<AnatomicalSystem>();
		anatomicalSystemList.add(anatomicalSystem);
	}

	@Override
	public AnatomicalSystem getAnatomicalSystem() {
		if(anatomicalSystemList != null && anatomicalSystemList.size() > 0) {
			return anatomicalSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) {
		if(anatomicalSystemList == null) {
			anatomicalSystemList = new ArrayList<>();
		}
		if(anatomicalSystemList.size() == 0) {
			anatomicalSystemList.add(anatomicalSystem);
		} else {
			anatomicalSystemList.set(0, anatomicalSystem);
		}
	}

	@Override
	public List<AnatomicalSystem> getAnatomicalSystemList() {
		return anatomicalSystemList;
	}

	@Override
	public void setAnatomicalSystemList(List<AnatomicalSystem> anatomicalSystemList) {
		this.anatomicalSystemList = anatomicalSystemList;
	}

	@Override
	public boolean hasAnatomicalSystem() {
		return anatomicalSystemList != null && anatomicalSystemList.size() > 0 && anatomicalSystemList.get(0) != null;
	}

	public STUDY_SUBJECT(ApprovedIndication approvedIndication) {
		approvedIndicationList = new ArrayList<ApprovedIndication>();
		approvedIndicationList.add(approvedIndication);
	}

	@Override
	public ApprovedIndication getApprovedIndication() {
		if(approvedIndicationList != null && approvedIndicationList.size() > 0) {
			return approvedIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApprovedIndication(ApprovedIndication approvedIndication) {
		if(approvedIndicationList == null) {
			approvedIndicationList = new ArrayList<>();
		}
		if(approvedIndicationList.size() == 0) {
			approvedIndicationList.add(approvedIndication);
		} else {
			approvedIndicationList.set(0, approvedIndication);
		}
	}

	@Override
	public List<ApprovedIndication> getApprovedIndicationList() {
		return approvedIndicationList;
	}

	@Override
	public void setApprovedIndicationList(List<ApprovedIndication> approvedIndicationList) {
		this.approvedIndicationList = approvedIndicationList;
	}

	@Override
	public boolean hasApprovedIndication() {
		return approvedIndicationList != null && approvedIndicationList.size() > 0 && approvedIndicationList.get(0) != null;
	}

	public STUDY_SUBJECT(Artery artery) {
		arteryList = new ArrayList<Artery>();
		arteryList.add(artery);
	}

	@Override
	public Artery getArtery() {
		if(arteryList != null && arteryList.size() > 0) {
			return arteryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArtery(Artery artery) {
		if(arteryList == null) {
			arteryList = new ArrayList<>();
		}
		if(arteryList.size() == 0) {
			arteryList.add(artery);
		} else {
			arteryList.set(0, artery);
		}
	}

	@Override
	public List<Artery> getArteryList() {
		return arteryList;
	}

	@Override
	public void setArteryList(List<Artery> arteryList) {
		this.arteryList = arteryList;
	}

	@Override
	public boolean hasArtery() {
		return arteryList != null && arteryList.size() > 0 && arteryList.get(0) != null;
	}

	public STUDY_SUBJECT(BloodTest bloodTest) {
		bloodTestList = new ArrayList<BloodTest>();
		bloodTestList.add(bloodTest);
	}

	@Override
	public BloodTest getBloodTest() {
		if(bloodTestList != null && bloodTestList.size() > 0) {
			return bloodTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBloodTest(BloodTest bloodTest) {
		if(bloodTestList == null) {
			bloodTestList = new ArrayList<>();
		}
		if(bloodTestList.size() == 0) {
			bloodTestList.add(bloodTest);
		} else {
			bloodTestList.set(0, bloodTest);
		}
	}

	@Override
	public List<BloodTest> getBloodTestList() {
		return bloodTestList;
	}

	@Override
	public void setBloodTestList(List<BloodTest> bloodTestList) {
		this.bloodTestList = bloodTestList;
	}

	@Override
	public boolean hasBloodTest() {
		return bloodTestList != null && bloodTestList.size() > 0 && bloodTestList.get(0) != null;
	}

	public STUDY_SUBJECT(Bone bone) {
		boneList = new ArrayList<Bone>();
		boneList.add(bone);
	}

	@Override
	public Bone getBone() {
		if(boneList != null && boneList.size() > 0) {
			return boneList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBone(Bone bone) {
		if(boneList == null) {
			boneList = new ArrayList<>();
		}
		if(boneList.size() == 0) {
			boneList.add(bone);
		} else {
			boneList.set(0, bone);
		}
	}

	@Override
	public List<Bone> getBoneList() {
		return boneList;
	}

	@Override
	public void setBoneList(List<Bone> boneList) {
		this.boneList = boneList;
	}

	@Override
	public boolean hasBone() {
		return boneList != null && boneList.size() > 0 && boneList.get(0) != null;
	}

	public STUDY_SUBJECT(BrainStructure brainStructure) {
		brainStructureList = new ArrayList<BrainStructure>();
		brainStructureList.add(brainStructure);
	}

	@Override
	public BrainStructure getBrainStructure() {
		if(brainStructureList != null && brainStructureList.size() > 0) {
			return brainStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrainStructure(BrainStructure brainStructure) {
		if(brainStructureList == null) {
			brainStructureList = new ArrayList<>();
		}
		if(brainStructureList.size() == 0) {
			brainStructureList.add(brainStructure);
		} else {
			brainStructureList.set(0, brainStructure);
		}
	}

	@Override
	public List<BrainStructure> getBrainStructureList() {
		return brainStructureList;
	}

	@Override
	public void setBrainStructureList(List<BrainStructure> brainStructureList) {
		this.brainStructureList = brainStructureList;
	}

	@Override
	public boolean hasBrainStructure() {
		return brainStructureList != null && brainStructureList.size() > 0 && brainStructureList.get(0) != null;
	}

	public STUDY_SUBJECT(DDxElement ddxElement) {
		ddxElementList = new ArrayList<DDxElement>();
		ddxElementList.add(ddxElement);
	}

	@Override
	public DDxElement getDDxElement() {
		if(ddxElementList != null && ddxElementList.size() > 0) {
			return ddxElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDDxElement(DDxElement ddxElement) {
		if(ddxElementList == null) {
			ddxElementList = new ArrayList<>();
		}
		if(ddxElementList.size() == 0) {
			ddxElementList.add(ddxElement);
		} else {
			ddxElementList.set(0, ddxElement);
		}
	}

	@Override
	public List<DDxElement> getDDxElementList() {
		return ddxElementList;
	}

	@Override
	public void setDDxElementList(List<DDxElement> ddxElementList) {
		this.ddxElementList = ddxElementList;
	}

	@Override
	public boolean hasDDxElement() {
		return ddxElementList != null && ddxElementList.size() > 0 && ddxElementList.get(0) != null;
	}

	public STUDY_SUBJECT(DiagnosticProcedure diagnosticProcedure) {
		diagnosticProcedureList = new ArrayList<DiagnosticProcedure>();
		diagnosticProcedureList.add(diagnosticProcedure);
	}

	@Override
	public DiagnosticProcedure getDiagnosticProcedure() {
		if(diagnosticProcedureList != null && diagnosticProcedureList.size() > 0) {
			return diagnosticProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiagnosticProcedure(DiagnosticProcedure diagnosticProcedure) {
		if(diagnosticProcedureList == null) {
			diagnosticProcedureList = new ArrayList<>();
		}
		if(diagnosticProcedureList.size() == 0) {
			diagnosticProcedureList.add(diagnosticProcedure);
		} else {
			diagnosticProcedureList.set(0, diagnosticProcedure);
		}
	}

	@Override
	public List<DiagnosticProcedure> getDiagnosticProcedureList() {
		return diagnosticProcedureList;
	}

	@Override
	public void setDiagnosticProcedureList(List<DiagnosticProcedure> diagnosticProcedureList) {
		this.diagnosticProcedureList = diagnosticProcedureList;
	}

	@Override
	public boolean hasDiagnosticProcedure() {
		return diagnosticProcedureList != null && diagnosticProcedureList.size() > 0 && diagnosticProcedureList.get(0) != null;
	}

	public STUDY_SUBJECT(Diet diet) {
		dietList = new ArrayList<Diet>();
		dietList.add(diet);
	}

	@Override
	public Diet getDiet() {
		if(dietList != null && dietList.size() > 0) {
			return dietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiet(Diet diet) {
		if(dietList == null) {
			dietList = new ArrayList<>();
		}
		if(dietList.size() == 0) {
			dietList.add(diet);
		} else {
			dietList.set(0, diet);
		}
	}

	@Override
	public List<Diet> getDietList() {
		return dietList;
	}

	@Override
	public void setDietList(List<Diet> dietList) {
		this.dietList = dietList;
	}

	@Override
	public boolean hasDiet() {
		return dietList != null && dietList.size() > 0 && dietList.get(0) != null;
	}

	public STUDY_SUBJECT(DietarySupplement dietarySupplement) {
		dietarySupplementList = new ArrayList<DietarySupplement>();
		dietarySupplementList.add(dietarySupplement);
	}

	@Override
	public DietarySupplement getDietarySupplement() {
		if(dietarySupplementList != null && dietarySupplementList.size() > 0) {
			return dietarySupplementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDietarySupplement(DietarySupplement dietarySupplement) {
		if(dietarySupplementList == null) {
			dietarySupplementList = new ArrayList<>();
		}
		if(dietarySupplementList.size() == 0) {
			dietarySupplementList.add(dietarySupplement);
		} else {
			dietarySupplementList.set(0, dietarySupplement);
		}
	}

	@Override
	public List<DietarySupplement> getDietarySupplementList() {
		return dietarySupplementList;
	}

	@Override
	public void setDietarySupplementList(List<DietarySupplement> dietarySupplementList) {
		this.dietarySupplementList = dietarySupplementList;
	}

	@Override
	public boolean hasDietarySupplement() {
		return dietarySupplementList != null && dietarySupplementList.size() > 0 && dietarySupplementList.get(0) != null;
	}

	public STUDY_SUBJECT(DoseSchedule doseSchedule) {
		doseScheduleList = new ArrayList<DoseSchedule>();
		doseScheduleList.add(doseSchedule);
	}

	@Override
	public DoseSchedule getDoseSchedule() {
		if(doseScheduleList != null && doseScheduleList.size() > 0) {
			return doseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDoseSchedule(DoseSchedule doseSchedule) {
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
	public List<DoseSchedule> getDoseScheduleList() {
		return doseScheduleList;
	}

	@Override
	public void setDoseScheduleList(List<DoseSchedule> doseScheduleList) {
		this.doseScheduleList = doseScheduleList;
	}

	@Override
	public boolean hasDoseSchedule() {
		return doseScheduleList != null && doseScheduleList.size() > 0 && doseScheduleList.get(0) != null;
	}

	public STUDY_SUBJECT(Drug drug) {
		drugList = new ArrayList<Drug>();
		drugList.add(drug);
	}

	@Override
	public Drug getDrug() {
		if(drugList != null && drugList.size() > 0) {
			return drugList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrug(Drug drug) {
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
	public List<Drug> getDrugList() {
		return drugList;
	}

	@Override
	public void setDrugList(List<Drug> drugList) {
		this.drugList = drugList;
	}

	@Override
	public boolean hasDrug() {
		return drugList != null && drugList.size() > 0 && drugList.get(0) != null;
	}

	public STUDY_SUBJECT(DrugLegalStatus drugLegalStatus) {
		drugLegalStatusList = new ArrayList<DrugLegalStatus>();
		drugLegalStatusList.add(drugLegalStatus);
	}

	@Override
	public DrugLegalStatus getDrugLegalStatus() {
		if(drugLegalStatusList != null && drugLegalStatusList.size() > 0) {
			return drugLegalStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugLegalStatus(DrugLegalStatus drugLegalStatus) {
		if(drugLegalStatusList == null) {
			drugLegalStatusList = new ArrayList<>();
		}
		if(drugLegalStatusList.size() == 0) {
			drugLegalStatusList.add(drugLegalStatus);
		} else {
			drugLegalStatusList.set(0, drugLegalStatus);
		}
	}

	@Override
	public List<DrugLegalStatus> getDrugLegalStatusList() {
		return drugLegalStatusList;
	}

	@Override
	public void setDrugLegalStatusList(List<DrugLegalStatus> drugLegalStatusList) {
		this.drugLegalStatusList = drugLegalStatusList;
	}

	@Override
	public boolean hasDrugLegalStatus() {
		return drugLegalStatusList != null && drugLegalStatusList.size() > 0 && drugLegalStatusList.get(0) != null;
	}

	public STUDY_SUBJECT(DrugStrength drugStrength) {
		drugStrengthList = new ArrayList<DrugStrength>();
		drugStrengthList.add(drugStrength);
	}

	@Override
	public DrugStrength getDrugStrength() {
		if(drugStrengthList != null && drugStrengthList.size() > 0) {
			return drugStrengthList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugStrength(DrugStrength drugStrength) {
		if(drugStrengthList == null) {
			drugStrengthList = new ArrayList<>();
		}
		if(drugStrengthList.size() == 0) {
			drugStrengthList.add(drugStrength);
		} else {
			drugStrengthList.set(0, drugStrength);
		}
	}

	@Override
	public List<DrugStrength> getDrugStrengthList() {
		return drugStrengthList;
	}

	@Override
	public void setDrugStrengthList(List<DrugStrength> drugStrengthList) {
		this.drugStrengthList = drugStrengthList;
	}

	@Override
	public boolean hasDrugStrength() {
		return drugStrengthList != null && drugStrengthList.size() > 0 && drugStrengthList.get(0) != null;
	}

	public STUDY_SUBJECT(ExercisePlan exercisePlan) {
		exercisePlanList = new ArrayList<ExercisePlan>();
		exercisePlanList.add(exercisePlan);
	}

	@Override
	public ExercisePlan getExercisePlan() {
		if(exercisePlanList != null && exercisePlanList.size() > 0) {
			return exercisePlanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExercisePlan(ExercisePlan exercisePlan) {
		if(exercisePlanList == null) {
			exercisePlanList = new ArrayList<>();
		}
		if(exercisePlanList.size() == 0) {
			exercisePlanList.add(exercisePlan);
		} else {
			exercisePlanList.set(0, exercisePlan);
		}
	}

	@Override
	public List<ExercisePlan> getExercisePlanList() {
		return exercisePlanList;
	}

	@Override
	public void setExercisePlanList(List<ExercisePlan> exercisePlanList) {
		this.exercisePlanList = exercisePlanList;
	}

	@Override
	public boolean hasExercisePlan() {
		return exercisePlanList != null && exercisePlanList.size() > 0 && exercisePlanList.get(0) != null;
	}

	public STUDY_SUBJECT(ImagingTest imagingTest) {
		imagingTestList = new ArrayList<ImagingTest>();
		imagingTestList.add(imagingTest);
	}

	@Override
	public ImagingTest getImagingTest() {
		if(imagingTestList != null && imagingTestList.size() > 0) {
			return imagingTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImagingTest(ImagingTest imagingTest) {
		if(imagingTestList == null) {
			imagingTestList = new ArrayList<>();
		}
		if(imagingTestList.size() == 0) {
			imagingTestList.add(imagingTest);
		} else {
			imagingTestList.set(0, imagingTest);
		}
	}

	@Override
	public List<ImagingTest> getImagingTestList() {
		return imagingTestList;
	}

	@Override
	public void setImagingTestList(List<ImagingTest> imagingTestList) {
		this.imagingTestList = imagingTestList;
	}

	@Override
	public boolean hasImagingTest() {
		return imagingTestList != null && imagingTestList.size() > 0 && imagingTestList.get(0) != null;
	}

	public STUDY_SUBJECT(InfectiousDisease infectiousDisease) {
		infectiousDiseaseList = new ArrayList<InfectiousDisease>();
		infectiousDiseaseList.add(infectiousDisease);
	}

	@Override
	public InfectiousDisease getInfectiousDisease() {
		if(infectiousDiseaseList != null && infectiousDiseaseList.size() > 0) {
			return infectiousDiseaseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInfectiousDisease(InfectiousDisease infectiousDisease) {
		if(infectiousDiseaseList == null) {
			infectiousDiseaseList = new ArrayList<>();
		}
		if(infectiousDiseaseList.size() == 0) {
			infectiousDiseaseList.add(infectiousDisease);
		} else {
			infectiousDiseaseList.set(0, infectiousDisease);
		}
	}

	@Override
	public List<InfectiousDisease> getInfectiousDiseaseList() {
		return infectiousDiseaseList;
	}

	@Override
	public void setInfectiousDiseaseList(List<InfectiousDisease> infectiousDiseaseList) {
		this.infectiousDiseaseList = infectiousDiseaseList;
	}

	@Override
	public boolean hasInfectiousDisease() {
		return infectiousDiseaseList != null && infectiousDiseaseList.size() > 0 && infectiousDiseaseList.get(0) != null;
	}

	public STUDY_SUBJECT(Joint joint) {
		jointList = new ArrayList<Joint>();
		jointList.add(joint);
	}

	@Override
	public Joint getJoint() {
		if(jointList != null && jointList.size() > 0) {
			return jointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJoint(Joint joint) {
		if(jointList == null) {
			jointList = new ArrayList<>();
		}
		if(jointList.size() == 0) {
			jointList.add(joint);
		} else {
			jointList.set(0, joint);
		}
	}

	@Override
	public List<Joint> getJointList() {
		return jointList;
	}

	@Override
	public void setJointList(List<Joint> jointList) {
		this.jointList = jointList;
	}

	@Override
	public boolean hasJoint() {
		return jointList != null && jointList.size() > 0 && jointList.get(0) != null;
	}

	public STUDY_SUBJECT(LifestyleModification lifestyleModification) {
		lifestyleModificationList = new ArrayList<LifestyleModification>();
		lifestyleModificationList.add(lifestyleModification);
	}

	@Override
	public LifestyleModification getLifestyleModification() {
		if(lifestyleModificationList != null && lifestyleModificationList.size() > 0) {
			return lifestyleModificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLifestyleModification(LifestyleModification lifestyleModification) {
		if(lifestyleModificationList == null) {
			lifestyleModificationList = new ArrayList<>();
		}
		if(lifestyleModificationList.size() == 0) {
			lifestyleModificationList.add(lifestyleModification);
		} else {
			lifestyleModificationList.set(0, lifestyleModification);
		}
	}

	@Override
	public List<LifestyleModification> getLifestyleModificationList() {
		return lifestyleModificationList;
	}

	@Override
	public void setLifestyleModificationList(List<LifestyleModification> lifestyleModificationList) {
		this.lifestyleModificationList = lifestyleModificationList;
	}

	@Override
	public boolean hasLifestyleModification() {
		return lifestyleModificationList != null && lifestyleModificationList.size() > 0 && lifestyleModificationList.get(0) != null;
	}

	public STUDY_SUBJECT(Ligament ligament) {
		ligamentList = new ArrayList<Ligament>();
		ligamentList.add(ligament);
	}

	@Override
	public Ligament getLigament() {
		if(ligamentList != null && ligamentList.size() > 0) {
			return ligamentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLigament(Ligament ligament) {
		if(ligamentList == null) {
			ligamentList = new ArrayList<>();
		}
		if(ligamentList.size() == 0) {
			ligamentList.add(ligament);
		} else {
			ligamentList.set(0, ligament);
		}
	}

	@Override
	public List<Ligament> getLigamentList() {
		return ligamentList;
	}

	@Override
	public void setLigamentList(List<Ligament> ligamentList) {
		this.ligamentList = ligamentList;
	}

	@Override
	public boolean hasLigament() {
		return ligamentList != null && ligamentList.size() > 0 && ligamentList.get(0) != null;
	}

	public STUDY_SUBJECT(LymphaticVessel lymphaticVessel) {
		lymphaticVesselList = new ArrayList<LymphaticVessel>();
		lymphaticVesselList.add(lymphaticVessel);
	}

	@Override
	public LymphaticVessel getLymphaticVessel() {
		if(lymphaticVesselList != null && lymphaticVesselList.size() > 0) {
			return lymphaticVesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLymphaticVessel(LymphaticVessel lymphaticVessel) {
		if(lymphaticVesselList == null) {
			lymphaticVesselList = new ArrayList<>();
		}
		if(lymphaticVesselList.size() == 0) {
			lymphaticVesselList.add(lymphaticVessel);
		} else {
			lymphaticVesselList.set(0, lymphaticVessel);
		}
	}

	@Override
	public List<LymphaticVessel> getLymphaticVesselList() {
		return lymphaticVesselList;
	}

	@Override
	public void setLymphaticVesselList(List<LymphaticVessel> lymphaticVesselList) {
		this.lymphaticVesselList = lymphaticVesselList;
	}

	@Override
	public boolean hasLymphaticVessel() {
		return lymphaticVesselList != null && lymphaticVesselList.size() > 0 && lymphaticVesselList.get(0) != null;
	}

	public STUDY_SUBJECT(MaximumDoseSchedule maximumDoseSchedule) {
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

	public STUDY_SUBJECT(MedicalCause medicalCause) {
		medicalCauseList = new ArrayList<MedicalCause>();
		medicalCauseList.add(medicalCause);
	}

	@Override
	public MedicalCause getMedicalCause() {
		if(medicalCauseList != null && medicalCauseList.size() > 0) {
			return medicalCauseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCause(MedicalCause medicalCause) {
		if(medicalCauseList == null) {
			medicalCauseList = new ArrayList<>();
		}
		if(medicalCauseList.size() == 0) {
			medicalCauseList.add(medicalCause);
		} else {
			medicalCauseList.set(0, medicalCause);
		}
	}

	@Override
	public List<MedicalCause> getMedicalCauseList() {
		return medicalCauseList;
	}

	@Override
	public void setMedicalCauseList(List<MedicalCause> medicalCauseList) {
		this.medicalCauseList = medicalCauseList;
	}

	@Override
	public boolean hasMedicalCause() {
		return medicalCauseList != null && medicalCauseList.size() > 0 && medicalCauseList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalCode medicalCode) {
		medicalCodeList = new ArrayList<MedicalCode>();
		medicalCodeList.add(medicalCode);
	}

	@Override
	public MedicalCode getMedicalCode() {
		if(medicalCodeList != null && medicalCodeList.size() > 0) {
			return medicalCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCode(MedicalCode medicalCode) {
		if(medicalCodeList == null) {
			medicalCodeList = new ArrayList<>();
		}
		if(medicalCodeList.size() == 0) {
			medicalCodeList.add(medicalCode);
		} else {
			medicalCodeList.set(0, medicalCode);
		}
	}

	@Override
	public List<MedicalCode> getMedicalCodeList() {
		return medicalCodeList;
	}

	@Override
	public void setMedicalCodeList(List<MedicalCode> medicalCodeList) {
		this.medicalCodeList = medicalCodeList;
	}

	@Override
	public boolean hasMedicalCode() {
		return medicalCodeList != null && medicalCodeList.size() > 0 && medicalCodeList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalCondition medicalCondition) {
		medicalConditionList = new ArrayList<MedicalCondition>();
		medicalConditionList.add(medicalCondition);
	}

	@Override
	public MedicalCondition getMedicalCondition() {
		if(medicalConditionList != null && medicalConditionList.size() > 0) {
			return medicalConditionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalCondition(MedicalCondition medicalCondition) {
		if(medicalConditionList == null) {
			medicalConditionList = new ArrayList<>();
		}
		if(medicalConditionList.size() == 0) {
			medicalConditionList.add(medicalCondition);
		} else {
			medicalConditionList.set(0, medicalCondition);
		}
	}

	@Override
	public List<MedicalCondition> getMedicalConditionList() {
		return medicalConditionList;
	}

	@Override
	public void setMedicalConditionList(List<MedicalCondition> medicalConditionList) {
		this.medicalConditionList = medicalConditionList;
	}

	@Override
	public boolean hasMedicalCondition() {
		return medicalConditionList != null && medicalConditionList.size() > 0 && medicalConditionList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalConditionStage medicalConditionStage) {
		medicalConditionStageList = new ArrayList<MedicalConditionStage>();
		medicalConditionStageList.add(medicalConditionStage);
	}

	@Override
	public MedicalConditionStage getMedicalConditionStage() {
		if(medicalConditionStageList != null && medicalConditionStageList.size() > 0) {
			return medicalConditionStageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalConditionStage(MedicalConditionStage medicalConditionStage) {
		if(medicalConditionStageList == null) {
			medicalConditionStageList = new ArrayList<>();
		}
		if(medicalConditionStageList.size() == 0) {
			medicalConditionStageList.add(medicalConditionStage);
		} else {
			medicalConditionStageList.set(0, medicalConditionStage);
		}
	}

	@Override
	public List<MedicalConditionStage> getMedicalConditionStageList() {
		return medicalConditionStageList;
	}

	@Override
	public void setMedicalConditionStageList(List<MedicalConditionStage> medicalConditionStageList) {
		this.medicalConditionStageList = medicalConditionStageList;
	}

	@Override
	public boolean hasMedicalConditionStage() {
		return medicalConditionStageList != null && medicalConditionStageList.size() > 0 && medicalConditionStageList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalContraindication medicalContraindication) {
		medicalContraindicationList = new ArrayList<MedicalContraindication>();
		medicalContraindicationList.add(medicalContraindication);
	}

	@Override
	public MedicalContraindication getMedicalContraindication() {
		if(medicalContraindicationList != null && medicalContraindicationList.size() > 0) {
			return medicalContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalContraindication(MedicalContraindication medicalContraindication) {
		if(medicalContraindicationList == null) {
			medicalContraindicationList = new ArrayList<>();
		}
		if(medicalContraindicationList.size() == 0) {
			medicalContraindicationList.add(medicalContraindication);
		} else {
			medicalContraindicationList.set(0, medicalContraindication);
		}
	}

	@Override
	public List<MedicalContraindication> getMedicalContraindicationList() {
		return medicalContraindicationList;
	}

	@Override
	public void setMedicalContraindicationList(List<MedicalContraindication> medicalContraindicationList) {
		this.medicalContraindicationList = medicalContraindicationList;
	}

	@Override
	public boolean hasMedicalContraindication() {
		return medicalContraindicationList != null && medicalContraindicationList.size() > 0 && medicalContraindicationList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalDevice medicalDevice) {
		medicalDeviceList = new ArrayList<MedicalDevice>();
		medicalDeviceList.add(medicalDevice);
	}

	@Override
	public MedicalDevice getMedicalDevice() {
		if(medicalDeviceList != null && medicalDeviceList.size() > 0) {
			return medicalDeviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevice(MedicalDevice medicalDevice) {
		if(medicalDeviceList == null) {
			medicalDeviceList = new ArrayList<>();
		}
		if(medicalDeviceList.size() == 0) {
			medicalDeviceList.add(medicalDevice);
		} else {
			medicalDeviceList.set(0, medicalDevice);
		}
	}

	@Override
	public List<MedicalDevice> getMedicalDeviceList() {
		return medicalDeviceList;
	}

	@Override
	public void setMedicalDeviceList(List<MedicalDevice> medicalDeviceList) {
		this.medicalDeviceList = medicalDeviceList;
	}

	@Override
	public boolean hasMedicalDevice() {
		return medicalDeviceList != null && medicalDeviceList.size() > 0 && medicalDeviceList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalEntity medicalEntity) {
		medicalEntityList = new ArrayList<MedicalEntity>();
		medicalEntityList.add(medicalEntity);
	}

	@Override
	public MedicalEntity getMedicalEntity() {
		if(medicalEntityList != null && medicalEntityList.size() > 0) {
			return medicalEntityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEntity(MedicalEntity medicalEntity) {
		if(medicalEntityList == null) {
			medicalEntityList = new ArrayList<>();
		}
		if(medicalEntityList.size() == 0) {
			medicalEntityList.add(medicalEntity);
		} else {
			medicalEntityList.set(0, medicalEntity);
		}
	}

	@Override
	public List<MedicalEntity> getMedicalEntityList() {
		return medicalEntityList;
	}

	@Override
	public void setMedicalEntityList(List<MedicalEntity> medicalEntityList) {
		this.medicalEntityList = medicalEntityList;
	}

	@Override
	public boolean hasMedicalEntity() {
		return medicalEntityList != null && medicalEntityList.size() > 0 && medicalEntityList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalGuideline medicalGuideline) {
		medicalGuidelineList = new ArrayList<MedicalGuideline>();
		medicalGuidelineList.add(medicalGuideline);
	}

	@Override
	public MedicalGuideline getMedicalGuideline() {
		if(medicalGuidelineList != null && medicalGuidelineList.size() > 0) {
			return medicalGuidelineList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuideline(MedicalGuideline medicalGuideline) {
		if(medicalGuidelineList == null) {
			medicalGuidelineList = new ArrayList<>();
		}
		if(medicalGuidelineList.size() == 0) {
			medicalGuidelineList.add(medicalGuideline);
		} else {
			medicalGuidelineList.set(0, medicalGuideline);
		}
	}

	@Override
	public List<MedicalGuideline> getMedicalGuidelineList() {
		return medicalGuidelineList;
	}

	@Override
	public void setMedicalGuidelineList(List<MedicalGuideline> medicalGuidelineList) {
		this.medicalGuidelineList = medicalGuidelineList;
	}

	@Override
	public boolean hasMedicalGuideline() {
		return medicalGuidelineList != null && medicalGuidelineList.size() > 0 && medicalGuidelineList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		medicalGuidelineContraindicationList = new ArrayList<MedicalGuidelineContraindication>();
		medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
	}

	@Override
	public MedicalGuidelineContraindication getMedicalGuidelineContraindication() {
		if(medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0) {
			return medicalGuidelineContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineContraindication(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		if(medicalGuidelineContraindicationList == null) {
			medicalGuidelineContraindicationList = new ArrayList<>();
		}
		if(medicalGuidelineContraindicationList.size() == 0) {
			medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
		} else {
			medicalGuidelineContraindicationList.set(0, medicalGuidelineContraindication);
		}
	}

	@Override
	public List<MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList() {
		return medicalGuidelineContraindicationList;
	}

	@Override
	public void setMedicalGuidelineContraindicationList(List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList) {
		this.medicalGuidelineContraindicationList = medicalGuidelineContraindicationList;
	}

	@Override
	public boolean hasMedicalGuidelineContraindication() {
		return medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0 && medicalGuidelineContraindicationList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		medicalGuidelineRecommendationList = new ArrayList<MedicalGuidelineRecommendation>();
		medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
	}

	@Override
	public MedicalGuidelineRecommendation getMedicalGuidelineRecommendation() {
		if(medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0) {
			return medicalGuidelineRecommendationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineRecommendation(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		if(medicalGuidelineRecommendationList == null) {
			medicalGuidelineRecommendationList = new ArrayList<>();
		}
		if(medicalGuidelineRecommendationList.size() == 0) {
			medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
		} else {
			medicalGuidelineRecommendationList.set(0, medicalGuidelineRecommendation);
		}
	}

	@Override
	public List<MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList() {
		return medicalGuidelineRecommendationList;
	}

	@Override
	public void setMedicalGuidelineRecommendationList(List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList) {
		this.medicalGuidelineRecommendationList = medicalGuidelineRecommendationList;
	}

	@Override
	public boolean hasMedicalGuidelineRecommendation() {
		return medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0 && medicalGuidelineRecommendationList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalIndication medicalIndication) {
		medicalIndicationList = new ArrayList<MedicalIndication>();
		medicalIndicationList.add(medicalIndication);
	}

	@Override
	public MedicalIndication getMedicalIndication() {
		if(medicalIndicationList != null && medicalIndicationList.size() > 0) {
			return medicalIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIndication(MedicalIndication medicalIndication) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(medicalIndication);
		} else {
			medicalIndicationList.set(0, medicalIndication);
		}
	}

	@Override
	public List<MedicalIndication> getMedicalIndicationList() {
		return medicalIndicationList;
	}

	@Override
	public void setMedicalIndicationList(List<MedicalIndication> medicalIndicationList) {
		this.medicalIndicationList = medicalIndicationList;
	}

	@Override
	public boolean hasMedicalIndication() {
		return medicalIndicationList != null && medicalIndicationList.size() > 0 && medicalIndicationList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalIntangible medicalIntangible) {
		medicalIntangibleList = new ArrayList<MedicalIntangible>();
		medicalIntangibleList.add(medicalIntangible);
	}

	@Override
	public MedicalIntangible getMedicalIntangible() {
		if(medicalIntangibleList != null && medicalIntangibleList.size() > 0) {
			return medicalIntangibleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIntangible(MedicalIntangible medicalIntangible) {
		if(medicalIntangibleList == null) {
			medicalIntangibleList = new ArrayList<>();
		}
		if(medicalIntangibleList.size() == 0) {
			medicalIntangibleList.add(medicalIntangible);
		} else {
			medicalIntangibleList.set(0, medicalIntangible);
		}
	}

	@Override
	public List<MedicalIntangible> getMedicalIntangibleList() {
		return medicalIntangibleList;
	}

	@Override
	public void setMedicalIntangibleList(List<MedicalIntangible> medicalIntangibleList) {
		this.medicalIntangibleList = medicalIntangibleList;
	}

	@Override
	public boolean hasMedicalIntangible() {
		return medicalIntangibleList != null && medicalIntangibleList.size() > 0 && medicalIntangibleList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalObservationalStudy medicalObservationalStudy) {
		medicalObservationalStudyList = new ArrayList<MedicalObservationalStudy>();
		medicalObservationalStudyList.add(medicalObservationalStudy);
	}

	@Override
	public MedicalObservationalStudy getMedicalObservationalStudy() {
		if(medicalObservationalStudyList != null && medicalObservationalStudyList.size() > 0) {
			return medicalObservationalStudyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalObservationalStudy(MedicalObservationalStudy medicalObservationalStudy) {
		if(medicalObservationalStudyList == null) {
			medicalObservationalStudyList = new ArrayList<>();
		}
		if(medicalObservationalStudyList.size() == 0) {
			medicalObservationalStudyList.add(medicalObservationalStudy);
		} else {
			medicalObservationalStudyList.set(0, medicalObservationalStudy);
		}
	}

	@Override
	public List<MedicalObservationalStudy> getMedicalObservationalStudyList() {
		return medicalObservationalStudyList;
	}

	@Override
	public void setMedicalObservationalStudyList(List<MedicalObservationalStudy> medicalObservationalStudyList) {
		this.medicalObservationalStudyList = medicalObservationalStudyList;
	}

	@Override
	public boolean hasMedicalObservationalStudy() {
		return medicalObservationalStudyList != null && medicalObservationalStudyList.size() > 0 && medicalObservationalStudyList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalProcedure medicalProcedure) {
		medicalProcedureList = new ArrayList<MedicalProcedure>();
		medicalProcedureList.add(medicalProcedure);
	}

	@Override
	public MedicalProcedure getMedicalProcedure() {
		if(medicalProcedureList != null && medicalProcedureList.size() > 0) {
			return medicalProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalProcedure(MedicalProcedure medicalProcedure) {
		if(medicalProcedureList == null) {
			medicalProcedureList = new ArrayList<>();
		}
		if(medicalProcedureList.size() == 0) {
			medicalProcedureList.add(medicalProcedure);
		} else {
			medicalProcedureList.set(0, medicalProcedure);
		}
	}

	@Override
	public List<MedicalProcedure> getMedicalProcedureList() {
		return medicalProcedureList;
	}

	@Override
	public void setMedicalProcedureList(List<MedicalProcedure> medicalProcedureList) {
		this.medicalProcedureList = medicalProcedureList;
	}

	@Override
	public boolean hasMedicalProcedure() {
		return medicalProcedureList != null && medicalProcedureList.size() > 0 && medicalProcedureList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalRiskCalculator medicalRiskCalculator) {
		medicalRiskCalculatorList = new ArrayList<MedicalRiskCalculator>();
		medicalRiskCalculatorList.add(medicalRiskCalculator);
	}

	@Override
	public MedicalRiskCalculator getMedicalRiskCalculator() {
		if(medicalRiskCalculatorList != null && medicalRiskCalculatorList.size() > 0) {
			return medicalRiskCalculatorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskCalculator(MedicalRiskCalculator medicalRiskCalculator) {
		if(medicalRiskCalculatorList == null) {
			medicalRiskCalculatorList = new ArrayList<>();
		}
		if(medicalRiskCalculatorList.size() == 0) {
			medicalRiskCalculatorList.add(medicalRiskCalculator);
		} else {
			medicalRiskCalculatorList.set(0, medicalRiskCalculator);
		}
	}

	@Override
	public List<MedicalRiskCalculator> getMedicalRiskCalculatorList() {
		return medicalRiskCalculatorList;
	}

	@Override
	public void setMedicalRiskCalculatorList(List<MedicalRiskCalculator> medicalRiskCalculatorList) {
		this.medicalRiskCalculatorList = medicalRiskCalculatorList;
	}

	@Override
	public boolean hasMedicalRiskCalculator() {
		return medicalRiskCalculatorList != null && medicalRiskCalculatorList.size() > 0 && medicalRiskCalculatorList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalRiskEstimator medicalRiskEstimator) {
		medicalRiskEstimatorList = new ArrayList<MedicalRiskEstimator>();
		medicalRiskEstimatorList.add(medicalRiskEstimator);
	}

	@Override
	public MedicalRiskEstimator getMedicalRiskEstimator() {
		if(medicalRiskEstimatorList != null && medicalRiskEstimatorList.size() > 0) {
			return medicalRiskEstimatorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskEstimator(MedicalRiskEstimator medicalRiskEstimator) {
		if(medicalRiskEstimatorList == null) {
			medicalRiskEstimatorList = new ArrayList<>();
		}
		if(medicalRiskEstimatorList.size() == 0) {
			medicalRiskEstimatorList.add(medicalRiskEstimator);
		} else {
			medicalRiskEstimatorList.set(0, medicalRiskEstimator);
		}
	}

	@Override
	public List<MedicalRiskEstimator> getMedicalRiskEstimatorList() {
		return medicalRiskEstimatorList;
	}

	@Override
	public void setMedicalRiskEstimatorList(List<MedicalRiskEstimator> medicalRiskEstimatorList) {
		this.medicalRiskEstimatorList = medicalRiskEstimatorList;
	}

	@Override
	public boolean hasMedicalRiskEstimator() {
		return medicalRiskEstimatorList != null && medicalRiskEstimatorList.size() > 0 && medicalRiskEstimatorList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalRiskFactor medicalRiskFactor) {
		medicalRiskFactorList = new ArrayList<MedicalRiskFactor>();
		medicalRiskFactorList.add(medicalRiskFactor);
	}

	@Override
	public MedicalRiskFactor getMedicalRiskFactor() {
		if(medicalRiskFactorList != null && medicalRiskFactorList.size() > 0) {
			return medicalRiskFactorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskFactor(MedicalRiskFactor medicalRiskFactor) {
		if(medicalRiskFactorList == null) {
			medicalRiskFactorList = new ArrayList<>();
		}
		if(medicalRiskFactorList.size() == 0) {
			medicalRiskFactorList.add(medicalRiskFactor);
		} else {
			medicalRiskFactorList.set(0, medicalRiskFactor);
		}
	}

	@Override
	public List<MedicalRiskFactor> getMedicalRiskFactorList() {
		return medicalRiskFactorList;
	}

	@Override
	public void setMedicalRiskFactorList(List<MedicalRiskFactor> medicalRiskFactorList) {
		this.medicalRiskFactorList = medicalRiskFactorList;
	}

	@Override
	public boolean hasMedicalRiskFactor() {
		return medicalRiskFactorList != null && medicalRiskFactorList.size() > 0 && medicalRiskFactorList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalRiskScore medicalRiskScore) {
		medicalRiskScoreList = new ArrayList<MedicalRiskScore>();
		medicalRiskScoreList.add(medicalRiskScore);
	}

	@Override
	public MedicalRiskScore getMedicalRiskScore() {
		if(medicalRiskScoreList != null && medicalRiskScoreList.size() > 0) {
			return medicalRiskScoreList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskScore(MedicalRiskScore medicalRiskScore) {
		if(medicalRiskScoreList == null) {
			medicalRiskScoreList = new ArrayList<>();
		}
		if(medicalRiskScoreList.size() == 0) {
			medicalRiskScoreList.add(medicalRiskScore);
		} else {
			medicalRiskScoreList.set(0, medicalRiskScore);
		}
	}

	@Override
	public List<MedicalRiskScore> getMedicalRiskScoreList() {
		return medicalRiskScoreList;
	}

	@Override
	public void setMedicalRiskScoreList(List<MedicalRiskScore> medicalRiskScoreList) {
		this.medicalRiskScoreList = medicalRiskScoreList;
	}

	@Override
	public boolean hasMedicalRiskScore() {
		return medicalRiskScoreList != null && medicalRiskScoreList.size() > 0 && medicalRiskScoreList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalSign medicalSign) {
		medicalSignList = new ArrayList<MedicalSign>();
		medicalSignList.add(medicalSign);
	}

	@Override
	public MedicalSign getMedicalSign() {
		if(medicalSignList != null && medicalSignList.size() > 0) {
			return medicalSignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSign(MedicalSign medicalSign) {
		if(medicalSignList == null) {
			medicalSignList = new ArrayList<>();
		}
		if(medicalSignList.size() == 0) {
			medicalSignList.add(medicalSign);
		} else {
			medicalSignList.set(0, medicalSign);
		}
	}

	@Override
	public List<MedicalSign> getMedicalSignList() {
		return medicalSignList;
	}

	@Override
	public void setMedicalSignList(List<MedicalSign> medicalSignList) {
		this.medicalSignList = medicalSignList;
	}

	@Override
	public boolean hasMedicalSign() {
		return medicalSignList != null && medicalSignList.size() > 0 && medicalSignList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalSignOrSymptom medicalSignOrSymptom) {
		medicalSignOrSymptomList = new ArrayList<MedicalSignOrSymptom>();
		medicalSignOrSymptomList.add(medicalSignOrSymptom);
	}

	@Override
	public MedicalSignOrSymptom getMedicalSignOrSymptom() {
		if(medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0) {
			return medicalSignOrSymptomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSignOrSymptom(MedicalSignOrSymptom medicalSignOrSymptom) {
		if(medicalSignOrSymptomList == null) {
			medicalSignOrSymptomList = new ArrayList<>();
		}
		if(medicalSignOrSymptomList.size() == 0) {
			medicalSignOrSymptomList.add(medicalSignOrSymptom);
		} else {
			medicalSignOrSymptomList.set(0, medicalSignOrSymptom);
		}
	}

	@Override
	public List<MedicalSignOrSymptom> getMedicalSignOrSymptomList() {
		return medicalSignOrSymptomList;
	}

	@Override
	public void setMedicalSignOrSymptomList(List<MedicalSignOrSymptom> medicalSignOrSymptomList) {
		this.medicalSignOrSymptomList = medicalSignOrSymptomList;
	}

	@Override
	public boolean hasMedicalSignOrSymptom() {
		return medicalSignOrSymptomList != null && medicalSignOrSymptomList.size() > 0 && medicalSignOrSymptomList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalStudy medicalStudy) {
		medicalStudyList = new ArrayList<MedicalStudy>();
		medicalStudyList.add(medicalStudy);
	}

	@Override
	public MedicalStudy getMedicalStudy() {
		if(medicalStudyList != null && medicalStudyList.size() > 0) {
			return medicalStudyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalStudy(MedicalStudy medicalStudy) {
		if(medicalStudyList == null) {
			medicalStudyList = new ArrayList<>();
		}
		if(medicalStudyList.size() == 0) {
			medicalStudyList.add(medicalStudy);
		} else {
			medicalStudyList.set(0, medicalStudy);
		}
	}

	@Override
	public List<MedicalStudy> getMedicalStudyList() {
		return medicalStudyList;
	}

	@Override
	public void setMedicalStudyList(List<MedicalStudy> medicalStudyList) {
		this.medicalStudyList = medicalStudyList;
	}

	@Override
	public boolean hasMedicalStudy() {
		return medicalStudyList != null && medicalStudyList.size() > 0 && medicalStudyList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalSymptom medicalSymptom) {
		medicalSymptomList = new ArrayList<MedicalSymptom>();
		medicalSymptomList.add(medicalSymptom);
	}

	@Override
	public MedicalSymptom getMedicalSymptom() {
		if(medicalSymptomList != null && medicalSymptomList.size() > 0) {
			return medicalSymptomList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalSymptom(MedicalSymptom medicalSymptom) {
		if(medicalSymptomList == null) {
			medicalSymptomList = new ArrayList<>();
		}
		if(medicalSymptomList.size() == 0) {
			medicalSymptomList.add(medicalSymptom);
		} else {
			medicalSymptomList.set(0, medicalSymptom);
		}
	}

	@Override
	public List<MedicalSymptom> getMedicalSymptomList() {
		return medicalSymptomList;
	}

	@Override
	public void setMedicalSymptomList(List<MedicalSymptom> medicalSymptomList) {
		this.medicalSymptomList = medicalSymptomList;
	}

	@Override
	public boolean hasMedicalSymptom() {
		return medicalSymptomList != null && medicalSymptomList.size() > 0 && medicalSymptomList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalTest medicalTest) {
		medicalTestList = new ArrayList<MedicalTest>();
		medicalTestList.add(medicalTest);
	}

	@Override
	public MedicalTest getMedicalTest() {
		if(medicalTestList != null && medicalTestList.size() > 0) {
			return medicalTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTest(MedicalTest medicalTest) {
		if(medicalTestList == null) {
			medicalTestList = new ArrayList<>();
		}
		if(medicalTestList.size() == 0) {
			medicalTestList.add(medicalTest);
		} else {
			medicalTestList.set(0, medicalTest);
		}
	}

	@Override
	public List<MedicalTest> getMedicalTestList() {
		return medicalTestList;
	}

	@Override
	public void setMedicalTestList(List<MedicalTest> medicalTestList) {
		this.medicalTestList = medicalTestList;
	}

	@Override
	public boolean hasMedicalTest() {
		return medicalTestList != null && medicalTestList.size() > 0 && medicalTestList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalTestPanel medicalTestPanel) {
		medicalTestPanelList = new ArrayList<MedicalTestPanel>();
		medicalTestPanelList.add(medicalTestPanel);
	}

	@Override
	public MedicalTestPanel getMedicalTestPanel() {
		if(medicalTestPanelList != null && medicalTestPanelList.size() > 0) {
			return medicalTestPanelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTestPanel(MedicalTestPanel medicalTestPanel) {
		if(medicalTestPanelList == null) {
			medicalTestPanelList = new ArrayList<>();
		}
		if(medicalTestPanelList.size() == 0) {
			medicalTestPanelList.add(medicalTestPanel);
		} else {
			medicalTestPanelList.set(0, medicalTestPanel);
		}
	}

	@Override
	public List<MedicalTestPanel> getMedicalTestPanelList() {
		return medicalTestPanelList;
	}

	@Override
	public void setMedicalTestPanelList(List<MedicalTestPanel> medicalTestPanelList) {
		this.medicalTestPanelList = medicalTestPanelList;
	}

	@Override
	public boolean hasMedicalTestPanel() {
		return medicalTestPanelList != null && medicalTestPanelList.size() > 0 && medicalTestPanelList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalTherapy medicalTherapy) {
		medicalTherapyList = new ArrayList<MedicalTherapy>();
		medicalTherapyList.add(medicalTherapy);
	}

	@Override
	public MedicalTherapy getMedicalTherapy() {
		if(medicalTherapyList != null && medicalTherapyList.size() > 0) {
			return medicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTherapy(MedicalTherapy medicalTherapy) {
		if(medicalTherapyList == null) {
			medicalTherapyList = new ArrayList<>();
		}
		if(medicalTherapyList.size() == 0) {
			medicalTherapyList.add(medicalTherapy);
		} else {
			medicalTherapyList.set(0, medicalTherapy);
		}
	}

	@Override
	public List<MedicalTherapy> getMedicalTherapyList() {
		return medicalTherapyList;
	}

	@Override
	public void setMedicalTherapyList(List<MedicalTherapy> medicalTherapyList) {
		this.medicalTherapyList = medicalTherapyList;
	}

	@Override
	public boolean hasMedicalTherapy() {
		return medicalTherapyList != null && medicalTherapyList.size() > 0 && medicalTherapyList.get(0) != null;
	}

	public STUDY_SUBJECT(MedicalTrial medicalTrial) {
		medicalTrialList = new ArrayList<MedicalTrial>();
		medicalTrialList.add(medicalTrial);
	}

	@Override
	public MedicalTrial getMedicalTrial() {
		if(medicalTrialList != null && medicalTrialList.size() > 0) {
			return medicalTrialList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTrial(MedicalTrial medicalTrial) {
		if(medicalTrialList == null) {
			medicalTrialList = new ArrayList<>();
		}
		if(medicalTrialList.size() == 0) {
			medicalTrialList.add(medicalTrial);
		} else {
			medicalTrialList.set(0, medicalTrial);
		}
	}

	@Override
	public List<MedicalTrial> getMedicalTrialList() {
		return medicalTrialList;
	}

	@Override
	public void setMedicalTrialList(List<MedicalTrial> medicalTrialList) {
		this.medicalTrialList = medicalTrialList;
	}

	@Override
	public boolean hasMedicalTrial() {
		return medicalTrialList != null && medicalTrialList.size() > 0 && medicalTrialList.get(0) != null;
	}

	public STUDY_SUBJECT(Muscle muscle) {
		muscleList = new ArrayList<Muscle>();
		muscleList.add(muscle);
	}

	@Override
	public Muscle getMuscle() {
		if(muscleList != null && muscleList.size() > 0) {
			return muscleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMuscle(Muscle muscle) {
		if(muscleList == null) {
			muscleList = new ArrayList<>();
		}
		if(muscleList.size() == 0) {
			muscleList.add(muscle);
		} else {
			muscleList.set(0, muscle);
		}
	}

	@Override
	public List<Muscle> getMuscleList() {
		return muscleList;
	}

	@Override
	public void setMuscleList(List<Muscle> muscleList) {
		this.muscleList = muscleList;
	}

	@Override
	public boolean hasMuscle() {
		return muscleList != null && muscleList.size() > 0 && muscleList.get(0) != null;
	}

	public STUDY_SUBJECT(Nerve nerve) {
		nerveList = new ArrayList<Nerve>();
		nerveList.add(nerve);
	}

	@Override
	public Nerve getNerve() {
		if(nerveList != null && nerveList.size() > 0) {
			return nerveList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNerve(Nerve nerve) {
		if(nerveList == null) {
			nerveList = new ArrayList<>();
		}
		if(nerveList.size() == 0) {
			nerveList.add(nerve);
		} else {
			nerveList.set(0, nerve);
		}
	}

	@Override
	public List<Nerve> getNerveList() {
		return nerveList;
	}

	@Override
	public void setNerveList(List<Nerve> nerveList) {
		this.nerveList = nerveList;
	}

	@Override
	public boolean hasNerve() {
		return nerveList != null && nerveList.size() > 0 && nerveList.get(0) != null;
	}

	public STUDY_SUBJECT(OccupationalTherapy occupationalTherapy) {
		occupationalTherapyList = new ArrayList<OccupationalTherapy>();
		occupationalTherapyList.add(occupationalTherapy);
	}

	@Override
	public OccupationalTherapy getOccupationalTherapy() {
		if(occupationalTherapyList != null && occupationalTherapyList.size() > 0) {
			return occupationalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOccupationalTherapy(OccupationalTherapy occupationalTherapy) {
		if(occupationalTherapyList == null) {
			occupationalTherapyList = new ArrayList<>();
		}
		if(occupationalTherapyList.size() == 0) {
			occupationalTherapyList.add(occupationalTherapy);
		} else {
			occupationalTherapyList.set(0, occupationalTherapy);
		}
	}

	@Override
	public List<OccupationalTherapy> getOccupationalTherapyList() {
		return occupationalTherapyList;
	}

	@Override
	public void setOccupationalTherapyList(List<OccupationalTherapy> occupationalTherapyList) {
		this.occupationalTherapyList = occupationalTherapyList;
	}

	@Override
	public boolean hasOccupationalTherapy() {
		return occupationalTherapyList != null && occupationalTherapyList.size() > 0 && occupationalTherapyList.get(0) != null;
	}

	public STUDY_SUBJECT(PalliativeProcedure palliativeProcedure) {
		palliativeProcedureList = new ArrayList<PalliativeProcedure>();
		palliativeProcedureList.add(palliativeProcedure);
	}

	@Override
	public PalliativeProcedure getPalliativeProcedure() {
		if(palliativeProcedureList != null && palliativeProcedureList.size() > 0) {
			return palliativeProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPalliativeProcedure(PalliativeProcedure palliativeProcedure) {
		if(palliativeProcedureList == null) {
			palliativeProcedureList = new ArrayList<>();
		}
		if(palliativeProcedureList.size() == 0) {
			palliativeProcedureList.add(palliativeProcedure);
		} else {
			palliativeProcedureList.set(0, palliativeProcedure);
		}
	}

	@Override
	public List<PalliativeProcedure> getPalliativeProcedureList() {
		return palliativeProcedureList;
	}

	@Override
	public void setPalliativeProcedureList(List<PalliativeProcedure> palliativeProcedureList) {
		this.palliativeProcedureList = palliativeProcedureList;
	}

	@Override
	public boolean hasPalliativeProcedure() {
		return palliativeProcedureList != null && palliativeProcedureList.size() > 0 && palliativeProcedureList.get(0) != null;
	}

	public STUDY_SUBJECT(PathologyTest pathologyTest) {
		pathologyTestList = new ArrayList<PathologyTest>();
		pathologyTestList.add(pathologyTest);
	}

	@Override
	public PathologyTest getPathologyTest() {
		if(pathologyTestList != null && pathologyTestList.size() > 0) {
			return pathologyTestList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPathologyTest(PathologyTest pathologyTest) {
		if(pathologyTestList == null) {
			pathologyTestList = new ArrayList<>();
		}
		if(pathologyTestList.size() == 0) {
			pathologyTestList.add(pathologyTest);
		} else {
			pathologyTestList.set(0, pathologyTest);
		}
	}

	@Override
	public List<PathologyTest> getPathologyTestList() {
		return pathologyTestList;
	}

	@Override
	public void setPathologyTestList(List<PathologyTest> pathologyTestList) {
		this.pathologyTestList = pathologyTestList;
	}

	@Override
	public boolean hasPathologyTest() {
		return pathologyTestList != null && pathologyTestList.size() > 0 && pathologyTestList.get(0) != null;
	}

	public STUDY_SUBJECT(PhysicalActivity physicalActivity) {
		physicalActivityList = new ArrayList<PhysicalActivity>();
		physicalActivityList.add(physicalActivity);
	}

	@Override
	public PhysicalActivity getPhysicalActivity() {
		if(physicalActivityList != null && physicalActivityList.size() > 0) {
			return physicalActivityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalActivity(PhysicalActivity physicalActivity) {
		if(physicalActivityList == null) {
			physicalActivityList = new ArrayList<>();
		}
		if(physicalActivityList.size() == 0) {
			physicalActivityList.add(physicalActivity);
		} else {
			physicalActivityList.set(0, physicalActivity);
		}
	}

	@Override
	public List<PhysicalActivity> getPhysicalActivityList() {
		return physicalActivityList;
	}

	@Override
	public void setPhysicalActivityList(List<PhysicalActivity> physicalActivityList) {
		this.physicalActivityList = physicalActivityList;
	}

	@Override
	public boolean hasPhysicalActivity() {
		return physicalActivityList != null && physicalActivityList.size() > 0 && physicalActivityList.get(0) != null;
	}

	public STUDY_SUBJECT(PhysicalExam physicalExam) {
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

	public STUDY_SUBJECT(PhysicalTherapy physicalTherapy) {
		physicalTherapyList = new ArrayList<PhysicalTherapy>();
		physicalTherapyList.add(physicalTherapy);
	}

	@Override
	public PhysicalTherapy getPhysicalTherapy() {
		if(physicalTherapyList != null && physicalTherapyList.size() > 0) {
			return physicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalTherapy(PhysicalTherapy physicalTherapy) {
		if(physicalTherapyList == null) {
			physicalTherapyList = new ArrayList<>();
		}
		if(physicalTherapyList.size() == 0) {
			physicalTherapyList.add(physicalTherapy);
		} else {
			physicalTherapyList.set(0, physicalTherapy);
		}
	}

	@Override
	public List<PhysicalTherapy> getPhysicalTherapyList() {
		return physicalTherapyList;
	}

	@Override
	public void setPhysicalTherapyList(List<PhysicalTherapy> physicalTherapyList) {
		this.physicalTherapyList = physicalTherapyList;
	}

	@Override
	public boolean hasPhysicalTherapy() {
		return physicalTherapyList != null && physicalTherapyList.size() > 0 && physicalTherapyList.get(0) != null;
	}

	public STUDY_SUBJECT(PreventionIndication preventionIndication) {
		preventionIndicationList = new ArrayList<PreventionIndication>();
		preventionIndicationList.add(preventionIndication);
	}

	@Override
	public PreventionIndication getPreventionIndication() {
		if(preventionIndicationList != null && preventionIndicationList.size() > 0) {
			return preventionIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreventionIndication(PreventionIndication preventionIndication) {
		if(preventionIndicationList == null) {
			preventionIndicationList = new ArrayList<>();
		}
		if(preventionIndicationList.size() == 0) {
			preventionIndicationList.add(preventionIndication);
		} else {
			preventionIndicationList.set(0, preventionIndication);
		}
	}

	@Override
	public List<PreventionIndication> getPreventionIndicationList() {
		return preventionIndicationList;
	}

	@Override
	public void setPreventionIndicationList(List<PreventionIndication> preventionIndicationList) {
		this.preventionIndicationList = preventionIndicationList;
	}

	@Override
	public boolean hasPreventionIndication() {
		return preventionIndicationList != null && preventionIndicationList.size() > 0 && preventionIndicationList.get(0) != null;
	}

	public STUDY_SUBJECT(PsychologicalTreatment psychologicalTreatment) {
		psychologicalTreatmentList = new ArrayList<PsychologicalTreatment>();
		psychologicalTreatmentList.add(psychologicalTreatment);
	}

	@Override
	public PsychologicalTreatment getPsychologicalTreatment() {
		if(psychologicalTreatmentList != null && psychologicalTreatmentList.size() > 0) {
			return psychologicalTreatmentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPsychologicalTreatment(PsychologicalTreatment psychologicalTreatment) {
		if(psychologicalTreatmentList == null) {
			psychologicalTreatmentList = new ArrayList<>();
		}
		if(psychologicalTreatmentList.size() == 0) {
			psychologicalTreatmentList.add(psychologicalTreatment);
		} else {
			psychologicalTreatmentList.set(0, psychologicalTreatment);
		}
	}

	@Override
	public List<PsychologicalTreatment> getPsychologicalTreatmentList() {
		return psychologicalTreatmentList;
	}

	@Override
	public void setPsychologicalTreatmentList(List<PsychologicalTreatment> psychologicalTreatmentList) {
		this.psychologicalTreatmentList = psychologicalTreatmentList;
	}

	@Override
	public boolean hasPsychologicalTreatment() {
		return psychologicalTreatmentList != null && psychologicalTreatmentList.size() > 0 && psychologicalTreatmentList.get(0) != null;
	}

	public STUDY_SUBJECT(RadiationTherapy radiationTherapy) {
		radiationTherapyList = new ArrayList<RadiationTherapy>();
		radiationTherapyList.add(radiationTherapy);
	}

	@Override
	public RadiationTherapy getRadiationTherapy() {
		if(radiationTherapyList != null && radiationTherapyList.size() > 0) {
			return radiationTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadiationTherapy(RadiationTherapy radiationTherapy) {
		if(radiationTherapyList == null) {
			radiationTherapyList = new ArrayList<>();
		}
		if(radiationTherapyList.size() == 0) {
			radiationTherapyList.add(radiationTherapy);
		} else {
			radiationTherapyList.set(0, radiationTherapy);
		}
	}

	@Override
	public List<RadiationTherapy> getRadiationTherapyList() {
		return radiationTherapyList;
	}

	@Override
	public void setRadiationTherapyList(List<RadiationTherapy> radiationTherapyList) {
		this.radiationTherapyList = radiationTherapyList;
	}

	@Override
	public boolean hasRadiationTherapy() {
		return radiationTherapyList != null && radiationTherapyList.size() > 0 && radiationTherapyList.get(0) != null;
	}

	public STUDY_SUBJECT(RecommendedDoseSchedule recommendedDoseSchedule) {
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

	public STUDY_SUBJECT(ReportedDoseSchedule reportedDoseSchedule) {
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

	public STUDY_SUBJECT(RespiratoryTherapy respiratoryTherapy) {
		respiratoryTherapyList = new ArrayList<RespiratoryTherapy>();
		respiratoryTherapyList.add(respiratoryTherapy);
	}

	@Override
	public RespiratoryTherapy getRespiratoryTherapy() {
		if(respiratoryTherapyList != null && respiratoryTherapyList.size() > 0) {
			return respiratoryTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy) {
		if(respiratoryTherapyList == null) {
			respiratoryTherapyList = new ArrayList<>();
		}
		if(respiratoryTherapyList.size() == 0) {
			respiratoryTherapyList.add(respiratoryTherapy);
		} else {
			respiratoryTherapyList.set(0, respiratoryTherapy);
		}
	}

	@Override
	public List<RespiratoryTherapy> getRespiratoryTherapyList() {
		return respiratoryTherapyList;
	}

	@Override
	public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList) {
		this.respiratoryTherapyList = respiratoryTherapyList;
	}

	@Override
	public boolean hasRespiratoryTherapy() {
		return respiratoryTherapyList != null && respiratoryTherapyList.size() > 0 && respiratoryTherapyList.get(0) != null;
	}

	public STUDY_SUBJECT(Substance substance) {
		substanceList = new ArrayList<Substance>();
		substanceList.add(substance);
	}

	@Override
	public Substance getSubstance() {
		if(substanceList != null && substanceList.size() > 0) {
			return substanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSubstance(Substance substance) {
		if(substanceList == null) {
			substanceList = new ArrayList<>();
		}
		if(substanceList.size() == 0) {
			substanceList.add(substance);
		} else {
			substanceList.set(0, substance);
		}
	}

	@Override
	public List<Substance> getSubstanceList() {
		return substanceList;
	}

	@Override
	public void setSubstanceList(List<Substance> substanceList) {
		this.substanceList = substanceList;
	}

	@Override
	public boolean hasSubstance() {
		return substanceList != null && substanceList.size() > 0 && substanceList.get(0) != null;
	}

	public STUDY_SUBJECT(SuperficialAnatomy superficialAnatomy) {
		superficialAnatomyList = new ArrayList<SuperficialAnatomy>();
		superficialAnatomyList.add(superficialAnatomy);
	}

	@Override
	public SuperficialAnatomy getSuperficialAnatomy() {
		if(superficialAnatomyList != null && superficialAnatomyList.size() > 0) {
			return superficialAnatomyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuperficialAnatomy(SuperficialAnatomy superficialAnatomy) {
		if(superficialAnatomyList == null) {
			superficialAnatomyList = new ArrayList<>();
		}
		if(superficialAnatomyList.size() == 0) {
			superficialAnatomyList.add(superficialAnatomy);
		} else {
			superficialAnatomyList.set(0, superficialAnatomy);
		}
	}

	@Override
	public List<SuperficialAnatomy> getSuperficialAnatomyList() {
		return superficialAnatomyList;
	}

	@Override
	public void setSuperficialAnatomyList(List<SuperficialAnatomy> superficialAnatomyList) {
		this.superficialAnatomyList = superficialAnatomyList;
	}

	@Override
	public boolean hasSuperficialAnatomy() {
		return superficialAnatomyList != null && superficialAnatomyList.size() > 0 && superficialAnatomyList.get(0) != null;
	}

	public STUDY_SUBJECT(SurgicalProcedure surgicalProcedure) {
		surgicalProcedureList = new ArrayList<SurgicalProcedure>();
		surgicalProcedureList.add(surgicalProcedure);
	}

	@Override
	public SurgicalProcedure getSurgicalProcedure() {
		if(surgicalProcedureList != null && surgicalProcedureList.size() > 0) {
			return surgicalProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSurgicalProcedure(SurgicalProcedure surgicalProcedure) {
		if(surgicalProcedureList == null) {
			surgicalProcedureList = new ArrayList<>();
		}
		if(surgicalProcedureList.size() == 0) {
			surgicalProcedureList.add(surgicalProcedure);
		} else {
			surgicalProcedureList.set(0, surgicalProcedure);
		}
	}

	@Override
	public List<SurgicalProcedure> getSurgicalProcedureList() {
		return surgicalProcedureList;
	}

	@Override
	public void setSurgicalProcedureList(List<SurgicalProcedure> surgicalProcedureList) {
		this.surgicalProcedureList = surgicalProcedureList;
	}

	@Override
	public boolean hasSurgicalProcedure() {
		return surgicalProcedureList != null && surgicalProcedureList.size() > 0 && surgicalProcedureList.get(0) != null;
	}

	public STUDY_SUBJECT(TherapeuticProcedure therapeuticProcedure) {
		therapeuticProcedureList = new ArrayList<TherapeuticProcedure>();
		therapeuticProcedureList.add(therapeuticProcedure);
	}

	@Override
	public TherapeuticProcedure getTherapeuticProcedure() {
		if(therapeuticProcedureList != null && therapeuticProcedureList.size() > 0) {
			return therapeuticProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTherapeuticProcedure(TherapeuticProcedure therapeuticProcedure) {
		if(therapeuticProcedureList == null) {
			therapeuticProcedureList = new ArrayList<>();
		}
		if(therapeuticProcedureList.size() == 0) {
			therapeuticProcedureList.add(therapeuticProcedure);
		} else {
			therapeuticProcedureList.set(0, therapeuticProcedure);
		}
	}

	@Override
	public List<TherapeuticProcedure> getTherapeuticProcedureList() {
		return therapeuticProcedureList;
	}

	@Override
	public void setTherapeuticProcedureList(List<TherapeuticProcedure> therapeuticProcedureList) {
		this.therapeuticProcedureList = therapeuticProcedureList;
	}

	@Override
	public boolean hasTherapeuticProcedure() {
		return therapeuticProcedureList != null && therapeuticProcedureList.size() > 0 && therapeuticProcedureList.get(0) != null;
	}

	public STUDY_SUBJECT(TreatmentIndication treatmentIndication) {
		treatmentIndicationList = new ArrayList<TreatmentIndication>();
		treatmentIndicationList.add(treatmentIndication);
	}

	@Override
	public TreatmentIndication getTreatmentIndication() {
		if(treatmentIndicationList != null && treatmentIndicationList.size() > 0) {
			return treatmentIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTreatmentIndication(TreatmentIndication treatmentIndication) {
		if(treatmentIndicationList == null) {
			treatmentIndicationList = new ArrayList<>();
		}
		if(treatmentIndicationList.size() == 0) {
			treatmentIndicationList.add(treatmentIndication);
		} else {
			treatmentIndicationList.set(0, treatmentIndication);
		}
	}

	@Override
	public List<TreatmentIndication> getTreatmentIndicationList() {
		return treatmentIndicationList;
	}

	@Override
	public void setTreatmentIndicationList(List<TreatmentIndication> treatmentIndicationList) {
		this.treatmentIndicationList = treatmentIndicationList;
	}

	@Override
	public boolean hasTreatmentIndication() {
		return treatmentIndicationList != null && treatmentIndicationList.size() > 0 && treatmentIndicationList.get(0) != null;
	}

	public STUDY_SUBJECT(Vein vein) {
		veinList = new ArrayList<Vein>();
		veinList.add(vein);
	}

	@Override
	public Vein getVein() {
		if(veinList != null && veinList.size() > 0) {
			return veinList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVein(Vein vein) {
		if(veinList == null) {
			veinList = new ArrayList<>();
		}
		if(veinList.size() == 0) {
			veinList.add(vein);
		} else {
			veinList.set(0, vein);
		}
	}

	@Override
	public List<Vein> getVeinList() {
		return veinList;
	}

	@Override
	public void setVeinList(List<Vein> veinList) {
		this.veinList = veinList;
	}

	@Override
	public boolean hasVein() {
		return veinList != null && veinList.size() > 0 && veinList.get(0) != null;
	}

	public STUDY_SUBJECT(Vessel vessel) {
		vesselList = new ArrayList<Vessel>();
		vesselList.add(vessel);
	}

	@Override
	public Vessel getVessel() {
		if(vesselList != null && vesselList.size() > 0) {
			return vesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVessel(Vessel vessel) {
		if(vesselList == null) {
			vesselList = new ArrayList<>();
		}
		if(vesselList.size() == 0) {
			vesselList.add(vessel);
		} else {
			vesselList.set(0, vessel);
		}
	}

	@Override
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	@Override
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}

	@Override
	public boolean hasVessel() {
		return vesselList != null && vesselList.size() > 0 && vesselList.get(0) != null;
	}

	public STUDY_SUBJECT(VitalSign vitalSign) {
		vitalSignList = new ArrayList<VitalSign>();
		vitalSignList.add(vitalSign);
	}

	@Override
	public VitalSign getVitalSign() {
		if(vitalSignList != null && vitalSignList.size() > 0) {
			return vitalSignList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVitalSign(VitalSign vitalSign) {
		if(vitalSignList == null) {
			vitalSignList = new ArrayList<>();
		}
		if(vitalSignList.size() == 0) {
			vitalSignList.add(vitalSign);
		} else {
			vitalSignList.set(0, vitalSign);
		}
	}

	@Override
	public List<VitalSign> getVitalSignList() {
		return vitalSignList;
	}

	@Override
	public void setVitalSignList(List<VitalSign> vitalSignList) {
		this.vitalSignList = vitalSignList;
	}

	@Override
	public boolean hasVitalSign() {
		return vitalSignList != null && vitalSignList.size() > 0 && vitalSignList.get(0) != null;
	}

	public void copy(Container.StudySubject org) {
		setAnatomicalStructureList(org.getAnatomicalStructureList());
		setAnatomicalSystemList(org.getAnatomicalSystemList());
		setApprovedIndicationList(org.getApprovedIndicationList());
		setArteryList(org.getArteryList());
		setBloodTestList(org.getBloodTestList());
		setBoneList(org.getBoneList());
		setBrainStructureList(org.getBrainStructureList());
		setDDxElementList(org.getDDxElementList());
		setDiagnosticProcedureList(org.getDiagnosticProcedureList());
		setDietList(org.getDietList());
		setDietarySupplementList(org.getDietarySupplementList());
		setDoseScheduleList(org.getDoseScheduleList());
		setDrugList(org.getDrugList());
		setDrugLegalStatusList(org.getDrugLegalStatusList());
		setDrugStrengthList(org.getDrugStrengthList());
		setExercisePlanList(org.getExercisePlanList());
		setImagingTestList(org.getImagingTestList());
		setInfectiousDiseaseList(org.getInfectiousDiseaseList());
		setJointList(org.getJointList());
		setLifestyleModificationList(org.getLifestyleModificationList());
		setLigamentList(org.getLigamentList());
		setLymphaticVesselList(org.getLymphaticVesselList());
		setMaximumDoseScheduleList(org.getMaximumDoseScheduleList());
		setMedicalCauseList(org.getMedicalCauseList());
		setMedicalCodeList(org.getMedicalCodeList());
		setMedicalConditionList(org.getMedicalConditionList());
		setMedicalConditionStageList(org.getMedicalConditionStageList());
		setMedicalContraindicationList(org.getMedicalContraindicationList());
		setMedicalDeviceList(org.getMedicalDeviceList());
		setMedicalEntityList(org.getMedicalEntityList());
		setMedicalGuidelineList(org.getMedicalGuidelineList());
		setMedicalGuidelineContraindicationList(org.getMedicalGuidelineContraindicationList());
		setMedicalGuidelineRecommendationList(org.getMedicalGuidelineRecommendationList());
		setMedicalIndicationList(org.getMedicalIndicationList());
		setMedicalIntangibleList(org.getMedicalIntangibleList());
		setMedicalObservationalStudyList(org.getMedicalObservationalStudyList());
		setMedicalProcedureList(org.getMedicalProcedureList());
		setMedicalRiskCalculatorList(org.getMedicalRiskCalculatorList());
		setMedicalRiskEstimatorList(org.getMedicalRiskEstimatorList());
		setMedicalRiskFactorList(org.getMedicalRiskFactorList());
		setMedicalRiskScoreList(org.getMedicalRiskScoreList());
		setMedicalSignList(org.getMedicalSignList());
		setMedicalSignOrSymptomList(org.getMedicalSignOrSymptomList());
		setMedicalStudyList(org.getMedicalStudyList());
		setMedicalSymptomList(org.getMedicalSymptomList());
		setMedicalTestList(org.getMedicalTestList());
		setMedicalTestPanelList(org.getMedicalTestPanelList());
		setMedicalTherapyList(org.getMedicalTherapyList());
		setMedicalTrialList(org.getMedicalTrialList());
		setMuscleList(org.getMuscleList());
		setNerveList(org.getNerveList());
		setOccupationalTherapyList(org.getOccupationalTherapyList());
		setPalliativeProcedureList(org.getPalliativeProcedureList());
		setPathologyTestList(org.getPathologyTestList());
		setPhysicalActivityList(org.getPhysicalActivityList());
		setPhysicalExamList(org.getPhysicalExamList());
		setPhysicalTherapyList(org.getPhysicalTherapyList());
		setPreventionIndicationList(org.getPreventionIndicationList());
		setPsychologicalTreatmentList(org.getPsychologicalTreatmentList());
		setRadiationTherapyList(org.getRadiationTherapyList());
		setRecommendedDoseScheduleList(org.getRecommendedDoseScheduleList());
		setReportedDoseScheduleList(org.getReportedDoseScheduleList());
		setRespiratoryTherapyList(org.getRespiratoryTherapyList());
		setSubstanceList(org.getSubstanceList());
		setSuperficialAnatomyList(org.getSuperficialAnatomyList());
		setSurgicalProcedureList(org.getSurgicalProcedureList());
		setTherapeuticProcedureList(org.getTherapeuticProcedureList());
		setTreatmentIndicationList(org.getTreatmentIndicationList());
		setVeinList(org.getVeinList());
		setVesselList(org.getVesselList());
		setVitalSignList(org.getVitalSignList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
