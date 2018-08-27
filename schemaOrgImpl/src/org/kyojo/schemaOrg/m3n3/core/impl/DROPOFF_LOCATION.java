package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Place;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class DROPOFF_LOCATION implements Container.DropoffLocation {

	private static final long serialVersionUID = 1L;

	public List<Place> placeList;

	public DROPOFF_LOCATION() {
	}

	public DROPOFF_LOCATION(String string) {
		this(new PLACE(string));
	}

	public String getString() {
		if(placeList == null || placeList.size() == 0 || placeList.get(0) == null) {
			return null;
		} else {
			Name name = placeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(placeList == null) {
			placeList = new ArrayList<Place>();
		}
		if(placeList.size() == 0) {
			placeList.add(new PLACE(string));
		} else {
			placeList.set(0, new PLACE(string));
		}
	}

	public DROPOFF_LOCATION(Place place) {
		placeList = new ArrayList<Place>();
		placeList.add(place);
	}

	@Override
	public Place getPlace() {
		if(placeList != null && placeList.size() > 0) {
			return placeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlace(Place place) {
		if(placeList == null) {
			placeList = new ArrayList<>();
		}
		if(placeList.size() == 0) {
			placeList.add(place);
		} else {
			placeList.set(0, place);
		}
	}

	@Override
	public List<Place> getPlaceList() {
		return placeList;
	}

	@Override
	public void setPlaceList(List<Place> placeList) {
		this.placeList = placeList;
	}

	@Override
	public boolean hasPlace() {
		return placeList != null && placeList.size() > 0 && placeList.get(0) != null;
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
