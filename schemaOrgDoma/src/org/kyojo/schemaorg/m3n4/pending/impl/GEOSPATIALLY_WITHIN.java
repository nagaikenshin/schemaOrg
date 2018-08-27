package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.GeospatialGeometry;
import org.kyojo.schemaorg.m3n4.pending.Container;
import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIAL_GEOMETRY;

import org.seasar.doma.Transient;

public class GEOSPATIALLY_WITHIN implements Container.GeospatiallyWithin {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<GeospatialGeometry> geospatialGeometryList;
	@Transient
	public List<Place> placeList;

	public GEOSPATIALLY_WITHIN() {
	}

	public GEOSPATIALLY_WITHIN(String string) {
		this(new GEOSPATIAL_GEOMETRY(string));
	}

	public String getString() {
		if(geospatialGeometryList == null || geospatialGeometryList.size() == 0 || geospatialGeometryList.get(0) == null) {
			return null;
		} else {
			Name name = geospatialGeometryList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(geospatialGeometryList == null) {
			geospatialGeometryList = new ArrayList<GeospatialGeometry>();
		}
		if(geospatialGeometryList.size() == 0) {
			geospatialGeometryList.add(new GEOSPATIAL_GEOMETRY(string));
		} else {
			geospatialGeometryList.set(0, new GEOSPATIAL_GEOMETRY(string));
		}
	}

	public GEOSPATIALLY_WITHIN(GeospatialGeometry geospatialGeometry) {
		geospatialGeometryList = new ArrayList<GeospatialGeometry>();
		geospatialGeometryList.add(geospatialGeometry);
	}

	@Override
	public GeospatialGeometry getGeospatialGeometry() {
		if(geospatialGeometryList != null && geospatialGeometryList.size() > 0) {
			return geospatialGeometryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeospatialGeometry(GeospatialGeometry geospatialGeometry) {
		if(geospatialGeometryList == null) {
			geospatialGeometryList = new ArrayList<>();
		}
		if(geospatialGeometryList.size() == 0) {
			geospatialGeometryList.add(geospatialGeometry);
		} else {
			geospatialGeometryList.set(0, geospatialGeometry);
		}
	}

	@Override
	public List<GeospatialGeometry> getGeospatialGeometryList() {
		return geospatialGeometryList;
	}

	@Override
	public void setGeospatialGeometryList(List<GeospatialGeometry> geospatialGeometryList) {
		this.geospatialGeometryList = geospatialGeometryList;
	}

	@Override
	public boolean hasGeospatialGeometry() {
		return geospatialGeometryList != null && geospatialGeometryList.size() > 0 && geospatialGeometryList.get(0) != null;
	}

	public GEOSPATIALLY_WITHIN(Place place) {
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

	public GEOSPATIALLY_WITHIN(List<GeospatialGeometry> geospatialGeometryList,
			List<Place> placeList) {
		setGeospatialGeometryList(geospatialGeometryList);
		setPlaceList(placeList);
	}

	public void copy(Container.GeospatiallyWithin org) {
		setGeospatialGeometryList(org.getGeospatialGeometryList());
		setPlaceList(org.getPlaceList());
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
