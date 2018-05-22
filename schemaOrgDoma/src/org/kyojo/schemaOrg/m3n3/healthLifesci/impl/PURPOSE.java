package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalDevicePurpose;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.MEDICAL_DEVICE_PURPOSE;

import org.seasar.doma.Transient;

public class PURPOSE implements Container.Purpose {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalDevicePurpose> medicalDevicePurposeList;
	@Transient
	public List<Thing> thingList;

	public PURPOSE() {
	}

	public PURPOSE(String string) {
		this(new MEDICAL_DEVICE_PURPOSE(string));
	}

	public String getString() {
		if(medicalDevicePurposeList == null || medicalDevicePurposeList.size() == 0 || medicalDevicePurposeList.get(0) == null) {
			return null;
		} else {
			Name name = medicalDevicePurposeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalDevicePurposeList == null) {
			medicalDevicePurposeList = new ArrayList<MedicalDevicePurpose>();
		}
		if(medicalDevicePurposeList.size() == 0) {
			medicalDevicePurposeList.add(new MEDICAL_DEVICE_PURPOSE(string));
		} else {
			medicalDevicePurposeList.set(0, new MEDICAL_DEVICE_PURPOSE(string));
		}
	}

	public PURPOSE(MedicalDevicePurpose medicalDevicePurpose) {
		medicalDevicePurposeList = new ArrayList<MedicalDevicePurpose>();
		medicalDevicePurposeList.add(medicalDevicePurpose);
	}

	@Override
	public MedicalDevicePurpose getMedicalDevicePurpose() {
		if(medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0) {
			return medicalDevicePurposeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevicePurpose(MedicalDevicePurpose medicalDevicePurpose) {
		if(medicalDevicePurposeList == null) {
			medicalDevicePurposeList = new ArrayList<>();
		}
		if(medicalDevicePurposeList.size() == 0) {
			medicalDevicePurposeList.add(medicalDevicePurpose);
		} else {
			medicalDevicePurposeList.set(0, medicalDevicePurpose);
		}
	}

	@Override
	public List<MedicalDevicePurpose> getMedicalDevicePurposeList() {
		return medicalDevicePurposeList;
	}

	@Override
	public void setMedicalDevicePurposeList(List<MedicalDevicePurpose> medicalDevicePurposeList) {
		this.medicalDevicePurposeList = medicalDevicePurposeList;
	}

	@Override
	public boolean hasMedicalDevicePurpose() {
		return medicalDevicePurposeList != null && medicalDevicePurposeList.size() > 0 && medicalDevicePurposeList.get(0) != null;
	}

	public PURPOSE(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public PURPOSE(List<MedicalDevicePurpose> medicalDevicePurposeList,
			List<Thing> thingList) {
		setMedicalDevicePurposeList(medicalDevicePurposeList);
		setThingList(thingList);
	}

	public void copy(Container.Purpose org) {
		setMedicalDevicePurposeList(org.getMedicalDevicePurposeList());
		setThingList(org.getThingList());
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
