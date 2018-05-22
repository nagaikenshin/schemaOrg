package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DriveWheelConfigurationValue;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;

public class DRIVE_WHEEL_CONFIGURATION implements Container.DriveWheelConfiguration {

	private static final long serialVersionUID = 1L;

	public List<DriveWheelConfigurationValue> driveWheelConfigurationValueList;
	public List<Text> textList;

	public DRIVE_WHEEL_CONFIGURATION() {
	}

	public DRIVE_WHEEL_CONFIGURATION(DriveWheelConfigurationValue driveWheelConfigurationValue) {
		driveWheelConfigurationValueList = new ArrayList<DriveWheelConfigurationValue>();
		driveWheelConfigurationValueList.add(driveWheelConfigurationValue);
	}

	@Override
	public DriveWheelConfigurationValue getDriveWheelConfigurationValue() {
		if(driveWheelConfigurationValueList != null && driveWheelConfigurationValueList.size() > 0) {
			return driveWheelConfigurationValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDriveWheelConfigurationValue(DriveWheelConfigurationValue driveWheelConfigurationValue) {
		if(driveWheelConfigurationValueList == null) {
			driveWheelConfigurationValueList = new ArrayList<>();
		}
		if(driveWheelConfigurationValueList.size() == 0) {
			driveWheelConfigurationValueList.add(driveWheelConfigurationValue);
		} else {
			driveWheelConfigurationValueList.set(0, driveWheelConfigurationValue);
		}
	}

	@Override
	public List<DriveWheelConfigurationValue> getDriveWheelConfigurationValueList() {
		return driveWheelConfigurationValueList;
	}

	@Override
	public void setDriveWheelConfigurationValueList(List<DriveWheelConfigurationValue> driveWheelConfigurationValueList) {
		this.driveWheelConfigurationValueList = driveWheelConfigurationValueList;
	}

	@Override
	public boolean hasDriveWheelConfigurationValue() {
		return driveWheelConfigurationValueList != null && driveWheelConfigurationValueList.size() > 0 && driveWheelConfigurationValueList.get(0) != null;
	}

	public DRIVE_WHEEL_CONFIGURATION(String string) {
		this(new TEXT(string));
	}

	public DRIVE_WHEEL_CONFIGURATION(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public DRIVE_WHEEL_CONFIGURATION(List<DriveWheelConfigurationValue> driveWheelConfigurationValueList,
			List<Text> textList) {
		setDriveWheelConfigurationValueList(driveWheelConfigurationValueList);
		setTextList(textList);
	}

	public void copy(Container.DriveWheelConfiguration org) {
		setDriveWheelConfigurationValueList(org.getDriveWheelConfigurationValueList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
