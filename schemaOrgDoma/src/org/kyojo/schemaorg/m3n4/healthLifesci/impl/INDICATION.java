package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_INDICATION;

import org.seasar.doma.Transient;

public class INDICATION implements Container.Indication {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalIndication> medicalIndicationList;

	public INDICATION() {
	}

	public INDICATION(String string) {
		this(new MEDICAL_INDICATION(string));
	}

	public String getString() {
		if(medicalIndicationList == null || medicalIndicationList.size() == 0 || medicalIndicationList.get(0) == null) {
			return null;
		} else {
			Name name = medicalIndicationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<MedicalIndication>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(new MEDICAL_INDICATION(string));
		} else {
			medicalIndicationList.set(0, new MEDICAL_INDICATION(string));
		}
	}

	public INDICATION(MedicalIndication medicalIndication) {
		medicalIndicationList = new ArrayList<MedicalIndication>();
		medicalIndicationList.add(medicalIndication);
	}

	@Override
	public MedicalIndication getMedicalIndication() {
		if(medicalIndicationList != null && medicalIndicationList.size() > 0) {
			return medicalIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIndication(MedicalIndication medicalIndication) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(medicalIndication);
		} else {
			medicalIndicationList.set(0, medicalIndication);
		}
	}

	@Override
	public List<MedicalIndication> getMedicalIndicationList() {
		return medicalIndicationList;
	}

	@Override
	public void setMedicalIndicationList(List<MedicalIndication> medicalIndicationList) {
		this.medicalIndicationList = medicalIndicationList;
	}

	@Override
	public boolean hasMedicalIndication() {
		return medicalIndicationList != null && medicalIndicationList.size() > 0 && medicalIndicationList.get(0) != null;
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
