package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalTrialDesign;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MEDICAL_TRIAL_DESIGN;

public class TRIAL_DESIGN implements Container.TrialDesign {

	private static final long serialVersionUID = 1L;

	public List<MedicalTrialDesign> medicalTrialDesignList;

	public TRIAL_DESIGN() {
	}

	public TRIAL_DESIGN(String string) {
		this(new MEDICAL_TRIAL_DESIGN(string));
	}

	public String getString() {
		if(medicalTrialDesignList == null || medicalTrialDesignList.size() == 0 || medicalTrialDesignList.get(0) == null) {
			return null;
		} else {
			Name name = medicalTrialDesignList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalTrialDesignList == null) {
			medicalTrialDesignList = new ArrayList<MedicalTrialDesign>();
		}
		if(medicalTrialDesignList.size() == 0) {
			medicalTrialDesignList.add(new MEDICAL_TRIAL_DESIGN(string));
		} else {
			medicalTrialDesignList.set(0, new MEDICAL_TRIAL_DESIGN(string));
		}
	}

	public TRIAL_DESIGN(MedicalTrialDesign medicalTrialDesign) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
