package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_GUIDELINE;

public class GUIDELINE implements Container.Guideline {

	private static final long serialVersionUID = 1L;

	public List<MedicalGuideline> medicalGuidelineList;

	public GUIDELINE() {
	}

	public GUIDELINE(String string) {
		this(new MEDICAL_GUIDELINE(string));
	}

	public String getString() {
		if(medicalGuidelineList == null || medicalGuidelineList.size() == 0 || medicalGuidelineList.get(0) == null) {
			return null;
		} else {
			Name name = medicalGuidelineList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalGuidelineList == null) {
			medicalGuidelineList = new ArrayList<MedicalGuideline>();
		}
		if(medicalGuidelineList.size() == 0) {
			medicalGuidelineList.add(new MEDICAL_GUIDELINE(string));
		} else {
			medicalGuidelineList.set(0, new MEDICAL_GUIDELINE(string));
		}
	}

	public GUIDELINE(MedicalGuideline medicalGuideline) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
