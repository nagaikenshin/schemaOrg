package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalEntity;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_ENTITY;

public class CAUSE_OF implements Container.CauseOf {

	private static final long serialVersionUID = 1L;

	public List<MedicalEntity> medicalEntityList;

	public CAUSE_OF() {
	}

	public CAUSE_OF(String string) {
		this(new MEDICAL_ENTITY(string));
	}

	public String getString() {
		if(medicalEntityList == null || medicalEntityList.size() == 0 || medicalEntityList.get(0) == null) {
			return null;
		} else {
			Name name = medicalEntityList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalEntityList == null) {
			medicalEntityList = new ArrayList<MedicalEntity>();
		}
		if(medicalEntityList.size() == 0) {
			medicalEntityList.add(new MEDICAL_ENTITY(string));
		} else {
			medicalEntityList.set(0, new MEDICAL_ENTITY(string));
		}
	}

	public CAUSE_OF(MedicalEntity medicalEntity) {
		medicalEntityList = new ArrayList<MedicalEntity>();
		medicalEntityList.add(medicalEntity);
	}

	@Override
	public MedicalEntity getMedicalEntity() {
		if(medicalEntityList != null && medicalEntityList.size() > 0) {
			return medicalEntityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEntity(MedicalEntity medicalEntity) {
		if(medicalEntityList == null) {
			medicalEntityList = new ArrayList<>();
		}
		if(medicalEntityList.size() == 0) {
			medicalEntityList.add(medicalEntity);
		} else {
			medicalEntityList.set(0, medicalEntity);
		}
	}

	@Override
	public List<MedicalEntity> getMedicalEntityList() {
		return medicalEntityList;
	}

	@Override
	public void setMedicalEntityList(List<MedicalEntity> medicalEntityList) {
		this.medicalEntityList = medicalEntityList;
	}

	@Override
	public boolean hasMedicalEntity() {
		return medicalEntityList != null && medicalEntityList.size() > 0 && medicalEntityList.get(0) != null;
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
