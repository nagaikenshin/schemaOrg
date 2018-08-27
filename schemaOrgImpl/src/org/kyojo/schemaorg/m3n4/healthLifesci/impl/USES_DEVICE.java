package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalDevice;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_DEVICE;

public class USES_DEVICE implements Container.UsesDevice {

	private static final long serialVersionUID = 1L;

	public List<MedicalDevice> medicalDeviceList;

	public USES_DEVICE() {
	}

	public USES_DEVICE(String string) {
		this(new MEDICAL_DEVICE(string));
	}

	public String getString() {
		if(medicalDeviceList == null || medicalDeviceList.size() == 0 || medicalDeviceList.get(0) == null) {
			return null;
		} else {
			Name name = medicalDeviceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalDeviceList == null) {
			medicalDeviceList = new ArrayList<MedicalDevice>();
		}
		if(medicalDeviceList.size() == 0) {
			medicalDeviceList.add(new MEDICAL_DEVICE(string));
		} else {
			medicalDeviceList.set(0, new MEDICAL_DEVICE(string));
		}
	}

	public USES_DEVICE(MedicalDevice medicalDevice) {
		medicalDeviceList = new ArrayList<MedicalDevice>();
		medicalDeviceList.add(medicalDevice);
	}

	@Override
	public MedicalDevice getMedicalDevice() {
		if(medicalDeviceList != null && medicalDeviceList.size() > 0) {
			return medicalDeviceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalDevice(MedicalDevice medicalDevice) {
		if(medicalDeviceList == null) {
			medicalDeviceList = new ArrayList<>();
		}
		if(medicalDeviceList.size() == 0) {
			medicalDeviceList.add(medicalDevice);
		} else {
			medicalDeviceList.set(0, medicalDevice);
		}
	}

	@Override
	public List<MedicalDevice> getMedicalDeviceList() {
		return medicalDeviceList;
	}

	@Override
	public void setMedicalDeviceList(List<MedicalDevice> medicalDeviceList) {
		this.medicalDeviceList = medicalDeviceList;
	}

	@Override
	public boolean hasMedicalDevice() {
		return medicalDeviceList != null && medicalDeviceList.size() > 0 && medicalDeviceList.get(0) != null;
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
