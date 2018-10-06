package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.VitalSign;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_SIGN;

import org.seasar.doma.Transient;

public class SIGN_DETECTED implements Container.SignDetected {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalSign> medicalSignList;
	@Transient
	public List<VitalSign> vitalSignList;

	public SIGN_DETECTED() {
	}

	public SIGN_DETECTED(String string) {
		this(new MEDICAL_SIGN(string));
	}

	public String getString() {
		if(medicalSignList == null || medicalSignList.size() == 0 || medicalSignList.get(0) == null) {
			return null;
		} else {
			Name name = medicalSignList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalSignList == null) {
			medicalSignList = new ArrayList<MedicalSign>();
		}
		if(medicalSignList.size() == 0) {
			medicalSignList.add(new MEDICAL_SIGN(string));
		} else {
			medicalSignList.set(0, new MEDICAL_SIGN(string));
		}
	}

	public SIGN_DETECTED(MedicalSign medicalSign) {
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

	public SIGN_DETECTED(VitalSign vitalSign) {
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

	public SIGN_DETECTED(List<MedicalSign> medicalSignList,
			List<VitalSign> vitalSignList) {
		setMedicalSignList(medicalSignList);
		setVitalSignList(vitalSignList);
	}

	public void copy(Container.SignDetected org) {
		setMedicalSignList(org.getMedicalSignList());
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
