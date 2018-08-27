package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalStudy;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_STUDY;

import org.seasar.doma.Transient;

public class STUDY implements Container.Study {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalStudy> medicalStudyList;

	public STUDY() {
	}

	public STUDY(String string) {
		this(new MEDICAL_STUDY(string));
	}

	public String getString() {
		if(medicalStudyList == null || medicalStudyList.size() == 0 || medicalStudyList.get(0) == null) {
			return null;
		} else {
			Name name = medicalStudyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalStudyList == null) {
			medicalStudyList = new ArrayList<MedicalStudy>();
		}
		if(medicalStudyList.size() == 0) {
			medicalStudyList.add(new MEDICAL_STUDY(string));
		} else {
			medicalStudyList.set(0, new MEDICAL_STUDY(string));
		}
	}

	public STUDY(MedicalStudy medicalStudy) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
