package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusStation;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BusStop;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class DEPARTURE_BUS_STOP implements Container.DepartureBusStop {

	private static final long serialVersionUID = 1L;

	public List<BusStation> busStationList;
	public List<BusStop> busStopList;

	public DEPARTURE_BUS_STOP() {
	}

	public DEPARTURE_BUS_STOP(String string) {
		this(new BUS_STATION(string));
	}

	public String getString() {
		if(busStationList == null || busStationList.size() == 0 || busStationList.get(0) == null) {
			return null;
		} else {
			Name name = busStationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(busStationList == null) {
			busStationList = new ArrayList<BusStation>();
		}
		if(busStationList.size() == 0) {
			busStationList.add(new BUS_STATION(string));
		} else {
			busStationList.set(0, new BUS_STATION(string));
		}
	}

	public DEPARTURE_BUS_STOP(BusStation busStation) {
		busStationList = new ArrayList<BusStation>();
		busStationList.add(busStation);
	}

	@Override
	public BusStation getBusStation() {
		if(busStationList != null && busStationList.size() > 0) {
			return busStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusStation(BusStation busStation) {
		if(busStationList == null) {
			busStationList = new ArrayList<>();
		}
		if(busStationList.size() == 0) {
			busStationList.add(busStation);
		} else {
			busStationList.set(0, busStation);
		}
	}

	@Override
	public List<BusStation> getBusStationList() {
		return busStationList;
	}

	@Override
	public void setBusStationList(List<BusStation> busStationList) {
		this.busStationList = busStationList;
	}

	@Override
	public boolean hasBusStation() {
		return busStationList != null && busStationList.size() > 0 && busStationList.get(0) != null;
	}

	public DEPARTURE_BUS_STOP(BusStop busStop) {
		busStopList = new ArrayList<BusStop>();
		busStopList.add(busStop);
	}

	@Override
	public BusStop getBusStop() {
		if(busStopList != null && busStopList.size() > 0) {
			return busStopList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusStop(BusStop busStop) {
		if(busStopList == null) {
			busStopList = new ArrayList<>();
		}
		if(busStopList.size() == 0) {
			busStopList.add(busStop);
		} else {
			busStopList.set(0, busStop);
		}
	}

	@Override
	public List<BusStop> getBusStopList() {
		return busStopList;
	}

	@Override
	public void setBusStopList(List<BusStop> busStopList) {
		this.busStopList = busStopList;
	}

	@Override
	public boolean hasBusStop() {
		return busStopList != null && busStopList.size() > 0 && busStopList.get(0) != null;
	}

	public DEPARTURE_BUS_STOP(List<BusStation> busStationList,
			List<BusStop> busStopList) {
		setBusStationList(busStationList);
		setBusStopList(busStopList);
	}

	public void copy(Container.DepartureBusStop org) {
		setBusStationList(org.getBusStationList());
		setBusStopList(org.getBusStopList());
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
