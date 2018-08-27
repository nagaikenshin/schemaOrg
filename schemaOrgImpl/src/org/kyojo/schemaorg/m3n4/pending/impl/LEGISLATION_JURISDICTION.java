package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class LEGISLATION_JURISDICTION implements Container.LegislationJurisdiction {

	private static final long serialVersionUID = 1L;

	public List<AdministrativeArea> administrativeAreaList;
	public List<Place> placeList;
	public List<Text> textList;

	public LEGISLATION_JURISDICTION() {
	}

	public LEGISLATION_JURISDICTION(AdministrativeArea administrativeArea) {
		administrativeAreaList = new ArrayList<AdministrativeArea>();
		administrativeAreaList.add(administrativeArea);
	}

	@Override
	public AdministrativeArea getAdministrativeArea() {
		if(administrativeAreaList != null && administrativeAreaList.size() > 0) {
			return administrativeAreaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdministrativeArea(AdministrativeArea administrativeArea) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(administrativeArea);
		} else {
			administrativeAreaList.set(0, administrativeArea);
		}
	}

	@Override
	public List<AdministrativeArea> getAdministrativeAreaList() {
		return administrativeAreaList;
	}

	@Override
	public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList) {
		this.administrativeAreaList = administrativeAreaList;
	}

	@Override
	public boolean hasAdministrativeArea() {
		return administrativeAreaList != null && administrativeAreaList.size() > 0 && administrativeAreaList.get(0) != null;
	}

	public LEGISLATION_JURISDICTION(Place place) {
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

	public LEGISLATION_JURISDICTION(String string) {
		this(new TEXT(string));
	}

	public LEGISLATION_JURISDICTION(Text text) {
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

	public LEGISLATION_JURISDICTION(List<AdministrativeArea> administrativeAreaList,
			List<Place> placeList,
			List<Text> textList) {
		setAdministrativeAreaList(administrativeAreaList);
		setPlaceList(placeList);
		setTextList(textList);
	}

	public void copy(Container.LegislationJurisdiction org) {
		setAdministrativeAreaList(org.getAdministrativeAreaList());
		setPlaceList(org.getPlaceList());
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
