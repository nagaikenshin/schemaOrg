package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Distance;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;

import org.seasar.doma.Transient;

public class FLIGHT_DISTANCE implements Container.FlightDistance {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Distance> distanceList;
	@Transient
	public List<Text> textList;

	public FLIGHT_DISTANCE() {
	}

	public FLIGHT_DISTANCE(Distance distance) {
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

	public FLIGHT_DISTANCE(String string) {
		this(new TEXT(string));
	}

	public FLIGHT_DISTANCE(Text text) {
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

	public FLIGHT_DISTANCE(List<Distance> distanceList,
			List<Text> textList) {
		setDistanceList(distanceList);
		setTextList(textList);
	}

	public void copy(Container.FlightDistance org) {
		setDistanceList(org.getDistanceList());
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
