package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Vessel;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.VESSEL;

import org.seasar.doma.Transient;

public class RUNS_TO implements Container.RunsTo {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Vessel> vesselList;

	public RUNS_TO() {
	}

	public RUNS_TO(String string) {
		this(new VESSEL(string));
	}

	public String getString() {
		if(vesselList == null || vesselList.size() == 0 || vesselList.get(0) == null) {
			return null;
		} else {
			Name name = vesselList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(vesselList == null) {
			vesselList = new ArrayList<Vessel>();
		}
		if(vesselList.size() == 0) {
			vesselList.add(new VESSEL(string));
		} else {
			vesselList.set(0, new VESSEL(string));
		}
	}

	public RUNS_TO(Vessel vessel) {
		vesselList = new ArrayList<Vessel>();
		vesselList.add(vessel);
	}

	@Override
	public Vessel getVessel() {
		if(vesselList != null && vesselList.size() > 0) {
			return vesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVessel(Vessel vessel) {
		if(vesselList == null) {
			vesselList = new ArrayList<>();
		}
		if(vesselList.size() == 0) {
			vesselList.add(vessel);
		} else {
			vesselList.set(0, vessel);
		}
	}

	@Override
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	@Override
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}

	@Override
	public boolean hasVessel() {
		return vesselList != null && vesselList.size() > 0 && vesselList.get(0) != null;
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