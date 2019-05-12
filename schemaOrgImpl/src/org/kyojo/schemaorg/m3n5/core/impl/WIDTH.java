package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Distance;
import org.kyojo.schemaorg.m3n5.core.Clazz.QuantitativeValue;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class WIDTH implements Container.Width {

	private static final long serialVersionUID = 1L;

	public List<Distance> distanceList;
	public List<QuantitativeValue> quantitativeValueList;

	public WIDTH() {
	}

	public WIDTH(String string) {
		this(new DISTANCE(string));
	}

	public String getString() {
		if(distanceList == null || distanceList.size() == 0 || distanceList.get(0) == null) {
			return null;
		} else {
			Name name = distanceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(distanceList == null) {
			distanceList = new ArrayList<Distance>();
		}
		if(distanceList.size() == 0) {
			distanceList.add(new DISTANCE(string));
		} else {
			distanceList.set(0, new DISTANCE(string));
		}
	}

	public WIDTH(Distance distance) {
		distanceList = new ArrayList<Distance>();
		distanceList.add(distance);
	}

	@Override
	public Distance getDistance() {
		if(distanceList != null && distanceList.size() > 0) {
			return distanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDistance(Distance distance) {
		if(distanceList == null) {
			distanceList = new ArrayList<>();
		}
		if(distanceList.size() == 0) {
			distanceList.add(distance);
		} else {
			distanceList.set(0, distance);
		}
	}

	@Override
	public List<Distance> getDistanceList() {
		return distanceList;
	}

	@Override
	public void setDistanceList(List<Distance> distanceList) {
		this.distanceList = distanceList;
	}

	@Override
	public boolean hasDistance() {
		return distanceList != null && distanceList.size() > 0 && distanceList.get(0) != null;
	}

	public WIDTH(QuantitativeValue quantitativeValue) {
		quantitativeValueList = new ArrayList<QuantitativeValue>();
		quantitativeValueList.add(quantitativeValue);
	}

	@Override
	public QuantitativeValue getQuantitativeValue() {
		if(quantitativeValueList != null && quantitativeValueList.size() > 0) {
			return quantitativeValueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuantitativeValue(QuantitativeValue quantitativeValue) {
		if(quantitativeValueList == null) {
			quantitativeValueList = new ArrayList<>();
		}
		if(quantitativeValueList.size() == 0) {
			quantitativeValueList.add(quantitativeValue);
		} else {
			quantitativeValueList.set(0, quantitativeValue);
		}
	}

	@Override
	public List<QuantitativeValue> getQuantitativeValueList() {
		return quantitativeValueList;
	}

	@Override
	public void setQuantitativeValueList(List<QuantitativeValue> quantitativeValueList) {
		this.quantitativeValueList = quantitativeValueList;
	}

	@Override
	public boolean hasQuantitativeValue() {
		return quantitativeValueList != null && quantitativeValueList.size() > 0 && quantitativeValueList.get(0) != null;
	}

	public WIDTH(List<Distance> distanceList,
			List<QuantitativeValue> quantitativeValueList) {
		setDistanceList(distanceList);
		setQuantitativeValueList(quantitativeValueList);
	}

	public void copy(Container.Width org) {
		setDistanceList(org.getDistanceList());
		setQuantitativeValueList(org.getQuantitativeValueList());
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
