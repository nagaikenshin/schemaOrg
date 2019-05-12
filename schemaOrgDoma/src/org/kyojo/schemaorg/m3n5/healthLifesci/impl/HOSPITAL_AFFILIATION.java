package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Hospital;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.impl.HOSPITAL;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;

import org.seasar.doma.Transient;

public class HOSPITAL_AFFILIATION implements Container.HospitalAffiliation {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Hospital> hospitalList;

	public HOSPITAL_AFFILIATION() {
	}

	public HOSPITAL_AFFILIATION(String string) {
		this(new HOSPITAL(string));
	}

	public String getString() {
		if(hospitalList == null || hospitalList.size() == 0 || hospitalList.get(0) == null) {
			return null;
		} else {
			Name name = hospitalList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(hospitalList == null) {
			hospitalList = new ArrayList<Hospital>();
		}
		if(hospitalList.size() == 0) {
			hospitalList.add(new HOSPITAL(string));
		} else {
			hospitalList.set(0, new HOSPITAL(string));
		}
	}

	public HOSPITAL_AFFILIATION(Hospital hospital) {
		hospitalList = new ArrayList<Hospital>();
		hospitalList.add(hospital);
	}

	@Override
	public Hospital getHospital() {
		if(hospitalList != null && hospitalList.size() > 0) {
			return hospitalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHospital(Hospital hospital) {
		if(hospitalList == null) {
			hospitalList = new ArrayList<>();
		}
		if(hospitalList.size() == 0) {
			hospitalList.add(hospital);
		} else {
			hospitalList.set(0, hospital);
		}
	}

	@Override
	public List<Hospital> getHospitalList() {
		return hospitalList;
	}

	@Override
	public void setHospitalList(List<Hospital> hospitalList) {
		this.hospitalList = hospitalList;
	}

	@Override
	public boolean hasHospital() {
		return hospitalList != null && hospitalList.size() > 0 && hospitalList.get(0) != null;
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
