package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalProcedure;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalTherapy;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_PROCEDURE;

import org.seasar.doma.Transient;

public class AVAILABLE_SERVICE implements Container.AvailableService {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalProcedure> medicalProcedureList;
	@Transient
	public List<MedicalTest> medicalTestList;
	@Transient
	public List<MedicalTherapy> medicalTherapyList;

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

	public AVAILABLE_SERVICE(List<MedicalProcedure> medicalProcedureList,
			List<MedicalTest> medicalTestList,
			List<MedicalTherapy> medicalTherapyList) {
		setMedicalProcedureList(medicalProcedureList);
		setMedicalTestList(medicalTestList);
		setMedicalTherapyList(medicalTherapyList);
	}

	public void copy(Container.AvailableService org) {
		setMedicalProcedureList(org.getMedicalProcedureList());
		setMedicalTestList(org.getMedicalTestList());
		setMedicalTherapyList(org.getMedicalTherapyList());
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
