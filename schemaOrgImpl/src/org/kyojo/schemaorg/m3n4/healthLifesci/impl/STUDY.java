package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalObservationalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalStudy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTrial;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_STUDY;

public class STUDY implements Container.Study {

	private static final long serialVersionUID = 1L;

	public List<MedicalObservationalStudy> medicalObservationalStudyList;
	public List<MedicalStudy> medicalStudyList;
	public List<MedicalTrial> medicalTrialList;

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

	public STUDY(MedicalObservationalStudy medicalObservationalStudy) {
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

	public STUDY(MedicalTrial medicalTrial) {
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

	public STUDY(List<MedicalObservationalStudy> medicalObservationalStudyList,
			List<MedicalStudy> medicalStudyList,
			List<MedicalTrial> medicalTrialList) {
		setMedicalObservationalStudyList(medicalObservationalStudyList);
		setMedicalStudyList(medicalStudyList);
		setMedicalTrialList(medicalTrialList);
	}

	public void copy(Container.Study org) {
		setMedicalObservationalStudyList(org.getMedicalObservationalStudyList());
		setMedicalStudyList(org.getMedicalStudyList());
		setMedicalTrialList(org.getMedicalTrialList());
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
