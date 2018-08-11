package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CableOrSatelliteService;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class IN_BROADCAST_LINEUP implements Container.InBroadcastLineup {

	private static final long serialVersionUID = 1L;

	public List<CableOrSatelliteService> cableOrSatelliteServiceList;

	public IN_BROADCAST_LINEUP() {
	}

	public IN_BROADCAST_LINEUP(String string) {
		this(new CABLE_OR_SATELLITE_SERVICE(string));
	}

	public String getString() {
		if(cableOrSatelliteServiceList == null || cableOrSatelliteServiceList.size() == 0 || cableOrSatelliteServiceList.get(0) == null) {
			return null;
		} else {
			Name name = cableOrSatelliteServiceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(cableOrSatelliteServiceList == null) {
			cableOrSatelliteServiceList = new ArrayList<CableOrSatelliteService>();
		}
		if(cableOrSatelliteServiceList.size() == 0) {
			cableOrSatelliteServiceList.add(new CABLE_OR_SATELLITE_SERVICE(string));
		} else {
			cableOrSatelliteServiceList.set(0, new CABLE_OR_SATELLITE_SERVICE(string));
		}
	}

	public IN_BROADCAST_LINEUP(CableOrSatelliteService cableOrSatelliteService) {
		cableOrSatelliteServiceList = new ArrayList<CableOrSatelliteService>();
		cableOrSatelliteServiceList.add(cableOrSatelliteService);
	}

	@Override
	public CableOrSatelliteService getCableOrSatelliteService() {
		if(cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0) {
			return cableOrSatelliteServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCableOrSatelliteService(CableOrSatelliteService cableOrSatelliteService) {
		if(cableOrSatelliteServiceList == null) {
			cableOrSatelliteServiceList = new ArrayList<>();
		}
		if(cableOrSatelliteServiceList.size() == 0) {
			cableOrSatelliteServiceList.add(cableOrSatelliteService);
		} else {
			cableOrSatelliteServiceList.set(0, cableOrSatelliteService);
		}
	}

	@Override
	public List<CableOrSatelliteService> getCableOrSatelliteServiceList() {
		return cableOrSatelliteServiceList;
	}

	@Override
	public void setCableOrSatelliteServiceList(List<CableOrSatelliteService> cableOrSatelliteServiceList) {
		this.cableOrSatelliteServiceList = cableOrSatelliteServiceList;
	}

	@Override
	public boolean hasCableOrSatelliteService() {
		return cableOrSatelliteServiceList != null && cableOrSatelliteServiceList.size() > 0 && cableOrSatelliteServiceList.get(0) != null;
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
