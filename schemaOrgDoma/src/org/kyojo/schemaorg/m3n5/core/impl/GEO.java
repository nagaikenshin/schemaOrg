package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoCircle;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoCoordinates;
import org.kyojo.schemaorg.m3n5.core.Clazz.GeoShape;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class GEO implements Container.Geo {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<GeoCircle> geoCircleList;
	@Transient
	public List<GeoCoordinates> geoCoordinatesList;
	@Transient
	public List<GeoShape> geoShapeList;

	public GEO() {
	}

	public GEO(String string) {
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

	public GEO(GeoCircle geoCircle) {
		geoCircleList = new ArrayList<GeoCircle>();
		geoCircleList.add(geoCircle);
	}

	@Override
	public GeoCircle getGeoCircle() {
		if(geoCircleList != null && geoCircleList.size() > 0) {
			return geoCircleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoCircle(GeoCircle geoCircle) {
		if(geoCircleList == null) {
			geoCircleList = new ArrayList<>();
		}
		if(geoCircleList.size() == 0) {
			geoCircleList.add(geoCircle);
		} else {
			geoCircleList.set(0, geoCircle);
		}
	}

	@Override
	public List<GeoCircle> getGeoCircleList() {
		return geoCircleList;
	}

	@Override
	public void setGeoCircleList(List<GeoCircle> geoCircleList) {
		this.geoCircleList = geoCircleList;
	}

	@Override
	public boolean hasGeoCircle() {
		return geoCircleList != null && geoCircleList.size() > 0 && geoCircleList.get(0) != null;
	}

	public GEO(GeoCoordinates geoCoordinates) {
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

	public GEO(GeoShape geoShape) {
		geoShapeList = new ArrayList<GeoShape>();
		geoShapeList.add(geoShape);
	}

	@Override
	public GeoShape getGeoShape() {
		if(geoShapeList != null && geoShapeList.size() > 0) {
			return geoShapeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGeoShape(GeoShape geoShape) {
		if(geoShapeList == null) {
			geoShapeList = new ArrayList<>();
		}
		if(geoShapeList.size() == 0) {
			geoShapeList.add(geoShape);
		} else {
			geoShapeList.set(0, geoShape);
		}
	}

	@Override
	public List<GeoShape> getGeoShapeList() {
		return geoShapeList;
	}

	@Override
	public void setGeoShapeList(List<GeoShape> geoShapeList) {
		this.geoShapeList = geoShapeList;
	}

	@Override
	public boolean hasGeoShape() {
		return geoShapeList != null && geoShapeList.size() > 0 && geoShapeList.get(0) != null;
	}

	public GEO(List<GeoCircle> geoCircleList,
			List<GeoCoordinates> geoCoordinatesList,
			List<GeoShape> geoShapeList) {
		setGeoCircleList(geoCircleList);
		setGeoCoordinatesList(geoCoordinatesList);
		setGeoShapeList(geoShapeList);
	}

	public void copy(Container.Geo org) {
		setGeoCircleList(org.getGeoCircleList());
		setGeoCoordinatesList(org.getGeoCoordinatesList());
		setGeoShapeList(org.getGeoShapeList());
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
