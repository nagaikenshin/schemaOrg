package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSignOrSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSymptom;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN_OR_SYMPTOM;

public class SIGN_OR_SYMPTOM implements Container.SignOrSymptom {

	private static final long serialVersionUID = 1L;

	public List<MedicalSign> medicalSignList;
	public List<MedicalSignOrSymptom> medicalSignOrSymptomList;
	public List<MedicalSymptom> medicalSymptomList;
	public List<VitalSign> vitalSignList;

	public SIGN_OR_SYMPTOM() {
	}

	public SIGN_OR_SYMPTOM(String string) {
		this(new MEDICAL_SIGN_OR_SYMPTOM(string));
	}

	public String getString() {
		if(medicalSignOrSymptomList == null || medicalSignOrSymptomList.size() == 0 || medicalSignOrSymptomList.get(0) == null) {
			return null;
		} else {
			Name name = medicalSignOrSymptomList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalSignOrSymptomList == null) {
			medicalSignOrSymptomList = new ArrayList<MedicalSignOrSymptom>();
		}
		if(medicalSignOrSymptomList.size() == 0) {
			medicalSignOrSymptomList.add(new MEDICAL_SIGN_OR_SYMPTOM(string));
		} else {
			medicalSignOrSymptomList.set(0, new MEDICAL_SIGN_OR_SYMPTOM(string));
		}
	}

	public SIGN_OR_SYMPTOM(MedicalSign medicalSign) {
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

	public SIGN_OR_SYMPTOM(MedicalSignOrSymptom medicalSignOrSymptom) {
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

	public SIGN_OR_SYMPTOM(MedicalSymptom medicalSymptom) {
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

	public SIGN_OR_SYMPTOM(VitalSign vitalSign) {
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

	public SIGN_OR_SYMPTOM(List<MedicalSign> medicalSignList,
			List<MedicalSignOrSymptom> medicalSignOrSymptomList,
			List<MedicalSymptom> medicalSymptomList,
			List<VitalSign> vitalSignList) {
		setMedicalSignList(medicalSignList);
		setMedicalSignOrSymptomList(medicalSignOrSymptomList);
		setMedicalSymptomList(medicalSymptomList);
		setVitalSignList(vitalSignList);
	}

	public void copy(Container.SignOrSymptom org) {
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
