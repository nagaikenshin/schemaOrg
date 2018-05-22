package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GeoCoordinates;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class GEO_MIDPOINT implements Container.GeoMidpoint {

	private static final long serialVersionUID = 1L;

	public List<GeoCoordinates> geoCoordinatesList;

	public GEO_MIDPOINT() {
	}

	public GEO_MIDPOINT(String string) {
		this(new GEO_COORDINATES(string));
	}

	public String getString() {
		if(geoCoordinatesList == null || geoCoordinatesList.size() == 0 || geoCoordinatesList.get(0) == null) {
			return null;
		} else {
			Name name = geoCoordinatesList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(geoCoordinatesList == null) {
			geoCoordinatesList = new ArrayList<GeoCoordinates>();
		}
		if(geoCoordinatesList.size() == 0) {
			geoCoordinatesList.add(new GEO_COORDINATES(string));
		} else {
			geoCoordinatesList.set(0, new GEO_COORDINATES(string));
		}
	}

	public GEO_MIDPOINT(GeoCoordinates geoCoordinates) {
		geoCoordinatesList = new ArrayList<GeoCoordinates>();
		geoCoordinatesList.add(geoCoordinates);
	}

	@Override
	public GeoCoordinates getGeoCoordinates() {
		if(geoCoordinatesList != null && geoCoordinatesList.size() > 0) {
			return geoCoordinatesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
		if(geoCoordinatesList == null) {
			geoCoordinatesList = new ArrayList<>();
		}
		if(geoCoordinatesList.size() == 0) {
			geoCoordinatesList.add(geoCoordinates);
		} else {
			geoCoordinatesList.set(0, geoCoordinates);
		}
	}

	@Override
	public List<GeoCoordinates> getGeoCoordinatesList() {
		return geoCoordinatesList;
	}

	@Override
	public void setGeoCoordinatesList(List<GeoCoordinates> geoCoordinatesList) {
		this.geoCoordinatesList = geoCoordinatesList;
	}

	@Override
	public boolean hasGeoCoordinates() {
		return geoCoordinatesList != null && geoCoordinatesList.size() > 0 && geoCoordinatesList.get(0) != null;
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
