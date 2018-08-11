package org.kyojo.schemaOrg.m3n3.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.auto.Clazz.CarUsageType;
import org.kyojo.schemaOrg.m3n3.auto.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

import org.seasar.doma.Transient;

public class VEHICLE_SPECIAL_USAGE implements Container.VehicleSpecialUsage {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CarUsageType> carUsageTypeList;
	@Transient
	public List<Text> textList;

	public VEHICLE_SPECIAL_USAGE() {
	}

	public VEHICLE_SPECIAL_USAGE(CarUsageType carUsageType) {
		carUsageTypeList = new ArrayList<CarUsageType>();
		carUsageTypeList.add(carUsageType);
	}

	@Override
	public CarUsageType getCarUsageType() {
		if(carUsageTypeList != null && carUsageTypeList.size() > 0) {
			return carUsageTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCarUsageType(CarUsageType carUsageType) {
		if(carUsageTypeList == null) {
			carUsageTypeList = new ArrayList<>();
		}
		if(carUsageTypeList.size() == 0) {
			carUsageTypeList.add(carUsageType);
		} else {
			carUsageTypeList.set(0, carUsageType);
		}
	}

	@Override
	public List<CarUsageType> getCarUsageTypeList() {
		return carUsageTypeList;
	}

	@Override
	public void setCarUsageTypeList(List<CarUsageType> carUsageTypeList) {
		this.carUsageTypeList = carUsageTypeList;
	}

	@Override
	public boolean hasCarUsageType() {
		return carUsageTypeList != null && carUsageTypeList.size() > 0 && carUsageTypeList.get(0) != null;
	}

	public VEHICLE_SPECIAL_USAGE(String string) {
		this(new TEXT(string));
	}

	public VEHICLE_SPECIAL_USAGE(Text text) {
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

	public VEHICLE_SPECIAL_USAGE(List<CarUsageType> carUsageTypeList,
			List<Text> textList) {
		setCarUsageTypeList(carUsageTypeList);
		setTextList(textList);
	}

	public void copy(Container.VehicleSpecialUsage org) {
		setCarUsageTypeList(org.getCarUsageTypeList());
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
