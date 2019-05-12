package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.BloodTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DiagnosticProcedure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ImagingTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalProcedure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTestPanel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalTherapy;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.OccupationalTherapy;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PalliativeProcedure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PathologyTest;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PhysicalTherapy;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PsychologicalTreatment;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.RadiationTherapy;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.SurgicalProcedure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.TherapeuticProcedure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.MedicalSpecialty.RespiratoryTherapy;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_PROCEDURE;

import org.seasar.doma.Transient;

public class AVAILABLE_SERVICE implements Container.AvailableService {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BloodTest> bloodTestList;
	@Transient
	public List<DiagnosticProcedure> diagnosticProcedureList;
	@Transient
	public List<ImagingTest> imagingTestList;
	@Transient
	public List<MedicalProcedure> medicalProcedureList;
	@Transient
	public List<MedicalTest> medicalTestList;
	@Transient
	public List<MedicalTestPanel> medicalTestPanelList;
	@Transient
	public List<MedicalTherapy> medicalTherapyList;
	@Transient
	public List<OccupationalTherapy> occupationalTherapyList;
	@Transient
	public List<PalliativeProcedure> palliativeProcedureList;
	@Transient
	public List<PathologyTest> pathologyTestList;
	@Transient
	public List<PhysicalExam> physicalExamList;
	@Transient
	public List<PhysicalTherapy> physicalTherapyList;
	@Transient
	public List<PsychologicalTreatment> psychologicalTreatmentList;
	@Transient
	public List<RadiationTherapy> radiationTherapyList;
	@Transient
	public List<RespiratoryTherapy> respiratoryTherapyList;
	@Transient
	public List<SurgicalProcedure> surgicalProcedureList;
	@Transient
	public List<TherapeuticProcedure> therapeuticProcedureList;

	public AVAILABLE_SERVICE() {
	}

	public AVAILABLE_SERVICE(String string) {
		this(new MEDICAL_PROCEDURE(string));
	}

	public String getString() {
		if(medicalProcedureList == null || medicalProcedureList.size() == 0 || medicalProcedureList.get(0) == null) {
			return null;
		} else {
			Name name = medicalProcedureList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalProcedureList == null) {
			medicalProcedureList = new ArrayList<MedicalProcedure>();
		}
		if(medicalProcedureList.size() == 0) {
			medicalProcedureList.add(new MEDICAL_PROCEDURE(string));
		} else {
			medicalProcedureList.set(0, new MEDICAL_PROCEDURE(string));
		}
	}

	public AVAILABLE_SERVICE(BloodTest bloodTest) {
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

	public AVAILABLE_SERVICE(DiagnosticProcedure diagnosticProcedure) {
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

	public AVAILABLE_SERVICE(ImagingTest imagingTest) {
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

	public AVAILABLE_SERVICE(MedicalProcedure medicalProcedure) {
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

	public AVAILABLE_SERVICE(MedicalTest medicalTest) {
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

	public AVAILABLE_SERVICE(MedicalTestPanel medicalTestPanel) {
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

	public AVAILABLE_SERVICE(MedicalTherapy medicalTherapy) {
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

	public AVAILABLE_SERVICE(OccupationalTherapy occupationalTherapy) {
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

	public AVAILABLE_SERVICE(PalliativeProcedure palliativeProcedure) {
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

	public AVAILABLE_SERVICE(PathologyTest pathologyTest) {
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

	public AVAILABLE_SERVICE(PhysicalExam physicalExam) {
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

	public AVAILABLE_SERVICE(PhysicalTherapy physicalTherapy) {
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

	public AVAILABLE_SERVICE(PsychologicalTreatment psychologicalTreatment) {
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

	public AVAILABLE_SERVICE(RadiationTherapy radiationTherapy) {
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

	public AVAILABLE_SERVICE(RespiratoryTherapy respiratoryTherapy) {
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

	public AVAILABLE_SERVICE(SurgicalProcedure surgicalProcedure) {
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

	public AVAILABLE_SERVICE(TherapeuticProcedure therapeuticProcedure) {
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

	public AVAILABLE_SERVICE(List<BloodTest> bloodTestList,
			List<DiagnosticProcedure> diagnosticProcedureList,
			List<ImagingTest> imagingTestList,
			List<MedicalProcedure> medicalProcedureList,
			List<MedicalTest> medicalTestList,
			List<MedicalTestPanel> medicalTestPanelList,
			List<MedicalTherapy> medicalTherapyList,
			List<OccupationalTherapy> occupationalTherapyList,
			List<PalliativeProcedure> palliativeProcedureList,
			List<PathologyTest> pathologyTestList,
			List<PhysicalExam> physicalExamList,
			List<PhysicalTherapy> physicalTherapyList,
			List<PsychologicalTreatment> psychologicalTreatmentList,
			List<RadiationTherapy> radiationTherapyList,
			List<RespiratoryTherapy> respiratoryTherapyList,
			List<SurgicalProcedure> surgicalProcedureList,
			List<TherapeuticProcedure> therapeuticProcedureList) {
		setBloodTestList(bloodTestList);
		setDiagnosticProcedureList(diagnosticProcedureList);
		setImagingTestList(imagingTestList);
		setMedicalProcedureList(medicalProcedureList);
		setMedicalTestList(medicalTestList);
		setMedicalTestPanelList(medicalTestPanelList);
		setMedicalTherapyList(medicalTherapyList);
		setOccupationalTherapyList(occupationalTherapyList);
		setPalliativeProcedureList(palliativeProcedureList);
		setPathologyTestList(pathologyTestList);
		setPhysicalExamList(physicalExamList);
		setPhysicalTherapyList(physicalTherapyList);
		setPsychologicalTreatmentList(psychologicalTreatmentList);
		setRadiationTherapyList(radiationTherapyList);
		setRespiratoryTherapyList(respiratoryTherapyList);
		setSurgicalProcedureList(surgicalProcedureList);
		setTherapeuticProcedureList(therapeuticProcedureList);
	}

	public void copy(Container.AvailableService org) {
		setBloodTestList(org.getBloodTestList());
		setDiagnosticProcedureList(org.getDiagnosticProcedureList());
		setImagingTestList(org.getImagingTestList());
		setMedicalProcedureList(org.getMedicalProcedureList());
		setMedicalTestList(org.getMedicalTestList());
		setMedicalTestPanelList(org.getMedicalTestPanelList());
		setMedicalTherapyList(org.getMedicalTherapyList());
		setOccupationalTherapyList(org.getOccupationalTherapyList());
		setPalliativeProcedureList(org.getPalliativeProcedureList());
		setPathologyTestList(org.getPathologyTestList());
		setPhysicalExamList(org.getPhysicalExamList());
		setPhysicalTherapyList(org.getPhysicalTherapyList());
		setPsychologicalTreatmentList(org.getPsychologicalTreatmentList());
		setRadiationTherapyList(org.getRadiationTherapyList());
		setRespiratoryTherapyList(org.getRespiratoryTherapyList());
		setSurgicalProcedureList(org.getSurgicalProcedureList());
		setTherapeuticProcedureList(org.getTherapeuticProcedureList());
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
