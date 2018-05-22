package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalTest;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_TEST;

public class IDENTIFYING_TEST implements Container.IdentifyingTest {

	private static final long serialVersionUID = 1L;

	public List<MedicalTest> medicalTestList;

	public IDENTIFYING_TEST() {
	}

	public IDENTIFYING_TEST(String string) {
		this(new MEDICAL_TEST(string));
	}

	public String getString() {
		if(medicalTestList == null || medicalTestList.size() == 0 || medicalTestList.get(0) == null) {
			return null;
		} else {
			Name name = medicalTestList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalTestList == null) {
			medicalTestList = new ArrayList<MedicalTest>();
		}
		if(medicalTestList.size() == 0) {
			medicalTestList.add(new MEDICAL_TEST(string));
		} else {
			medicalTestList.set(0, new MEDICAL_TEST(string));
		}
	}

	public IDENTIFYING_TEST(MedicalTest medicalTest) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
