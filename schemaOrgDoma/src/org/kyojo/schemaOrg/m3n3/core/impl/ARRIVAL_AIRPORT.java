package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Airport;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class ARRIVAL_AIRPORT implements Container.ArrivalAirport {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Airport> airportList;

	public ARRIVAL_AIRPORT() {
	}

	public ARRIVAL_AIRPORT(String string) {
		this(new AIRPORT(string));
	}

	public String getString() {
		if(airportList == null || airportList.size() == 0 || airportList.get(0) == null) {
			return null;
		} else {
			Name name = airportList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(airportList == null) {
			airportList = new ArrayList<Airport>();
		}
		if(airportList.size() == 0) {
			airportList.add(new AIRPORT(string));
		} else {
			airportList.set(0, new AIRPORT(string));
		}
	}

	public ARRIVAL_AIRPORT(Airport airport) {
		airportList = new ArrayList<Airport>();
		airportList.add(airport);
	}

	@Override
	public Airport getAirport() {
		if(airportList != null && airportList.size() > 0) {
			return airportList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAirport(Airport airport) {
		if(airportList == null) {
			airportList = new ArrayList<>();
		}
		if(airportList.size() == 0) {
			airportList.add(airport);
		} else {
			airportList.set(0, airport);
		}
	}

	@Override
	public List<Airport> getAirportList() {
		return airportList;
	}

	@Override
	public void setAirportList(List<Airport> airportList) {
		this.airportList = airportList;
	}

	@Override
	public boolean hasAirport() {
		return airportList != null && airportList.size() > 0 && airportList.get(0) != null;
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
