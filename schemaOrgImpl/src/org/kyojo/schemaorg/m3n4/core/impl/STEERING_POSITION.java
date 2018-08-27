package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.SteeringPositionValue;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class STEERING_POSITION implements Container.SteeringPosition {

	private static final long serialVersionUID = 1L;

	public List<SteeringPositionValue> steeringPositionValueList;

	public STEERING_POSITION() {
	}

	public STEERING_POSITION(String string) {
		this(new STEERING_POSITION_VALUE(string));
	}

	public String getString() {
		if(steeringPositionValueList == null || steeringPositionValueList.size() == 0 || steeringPositionValueList.get(0) == null) {
			return null;
		} else {
			Name name = steeringPositionValueList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(steeringPositionValueList == null) {
			steeringPositionValueList = new ArrayList<SteeringPositionValue>();
		}
		if(steeringPositionValueList.size() == 0) {
			steeringPositionValueList.add(new STEERING_POSITION_VALUE(string));
		} else {
			steeringPositionValueList.set(0, new STEERING_POSITION_VALUE(string));
		}
	}

	public STEERING_POSITION(SteeringPositionValue steeringPositionValue) {
		steeringPositionValueList = new ArrayList<SteeringPositionValue>();
		steeringPositionValueList.add(steeringPositionValue);
	}

	@Override
	public SteeringPositionValue getSteeringPositionValue() {
		if(steeringPositionValueList != null && steeringPositionValueList.size() > 0) {
			return steeringPositionValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSteeringPositionValue(SteeringPositionValue steeringPositionValue) {
		if(steeringPositionValueList == null) {
			steeringPositionValueList = new ArrayList<>();
		}
		if(steeringPositionValueList.size() == 0) {
			steeringPositionValueList.add(steeringPositionValue);
		} else {
			steeringPositionValueList.set(0, steeringPositionValue);
		}
	}

	@Override
	public List<SteeringPositionValue> getSteeringPositionValueList() {
		return steeringPositionValueList;
	}

	@Override
	public void setSteeringPositionValueList(List<SteeringPositionValue> steeringPositionValueList) {
		this.steeringPositionValueList = steeringPositionValueList;
	}

	@Override
	public boolean hasSteeringPositionValue() {
		return steeringPositionValueList != null && steeringPositionValueList.size() > 0 && steeringPositionValueList.get(0) != null;
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
