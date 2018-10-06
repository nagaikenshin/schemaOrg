package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.InfectiousDisease;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalCondition;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_CONDITION;

import org.seasar.doma.Transient;

public class DIAGNOSIS implements Container.Diagnosis {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<InfectiousDisease> infectiousDiseaseList;
	@Transient
	public List<MedicalCondition> medicalConditionList;
	@Transient
	public List<MedicalSign> medicalSignList;
	@Transient
	public List<MedicalSignOrSymptom> medicalSignOrSymptomList;
	@Transient
	public List<MedicalSymptom> medicalSymptomList;
	@Transient
	public List<VitalSign> vitalSignList;

	public DIAGNOSIS() {
	}

	public DIAGNOSIS(String string) {
		this(new MEDICAL_CONDITION(string));
	}

	public String getString() {
		if(medicalConditionList == null || medicalConditionList.size() == 0 || medicalConditionList.get(0) == null) {
			return null;
		} else {
			Name name = medicalConditionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalConditionList == null) {
			medicalConditionList = new ArrayList<MedicalCondition>();
		}
		if(medicalConditionList.size() == 0) {
			medicalConditionList.add(new MEDICAL_CONDITION(string));
		} else {
			medicalConditionList.set(0, new MEDICAL_CONDITION(string));
		}
	}

	public DIAGNOSIS(InfectiousDisease infectiousDisease) {
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

	public DIAGNOSIS(MedicalCondition medicalCondition) {
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

	public DIAGNOSIS(MedicalSign medicalSign) {
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

	public DIAGNOSIS(MedicalSignOrSymptom medicalSignOrSymptom) {
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

	public DIAGNOSIS(MedicalSymptom medicalSymptom) {
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

	public DIAGNOSIS(VitalSign vitalSign) {
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

	public DIAGNOSIS(List<InfectiousDisease> infectiousDiseaseList,
			List<MedicalCondition> medicalConditionList,
			List<MedicalSign> medicalSignList,
			List<MedicalSignOrSymptom> medicalSignOrSymptomList,
			List<MedicalSymptom> medicalSymptomList,
			List<VitalSign> vitalSignList) {
		setInfectiousDiseaseList(infectiousDiseaseList);
		setMedicalConditionList(medicalConditionList);
		setMedicalSignList(medicalSignList);
		setMedicalSignOrSymptomList(medicalSignOrSymptomList);
		setMedicalSymptomList(medicalSymptomList);
		setVitalSignList(vitalSignList);
	}

	public void copy(Container.Diagnosis org) {
		setInfectiousDiseaseList(org.getInfectiousDiseaseList());
		setMedicalConditionList(org.getMedicalConditionList());
		setMedicalSignList(org.getMedicalSignList());
		setMedicalSignOrSymptomList(org.getMedicalSignOrSymptomList());
		setMedicalSymptomList(org.getMedicalSymptomList());
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
