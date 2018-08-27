package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalCause;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_CAUSE;

import org.seasar.doma.Transient;

public class CAUSE implements Container.Cause {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalCause> medicalCauseList;

	public CAUSE() {
	}

	public CAUSE(String string) {
		this(new MEDICAL_CAUSE(string));
	}

	public String getString() {
		if(medicalCauseList == null || medicalCauseList.size() == 0 || medicalCauseList.get(0) == null) {
			return null;
		} else {
			Name name = medicalCauseList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalCauseList == null) {
			medicalCauseList = new ArrayList<MedicalCause>();
		}
		if(medicalCauseList.size() == 0) {
			medicalCauseList.add(new MEDICAL_CAUSE(string));
		} else {
			medicalCauseList.set(0, new MEDICAL_CAUSE(string));
		}
	}

	public CAUSE(MedicalCause medicalCause) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
