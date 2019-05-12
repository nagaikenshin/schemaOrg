package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Artery;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.LymphaticVessel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Vein;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Vessel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.VESSEL;

import org.seasar.doma.Transient;

public class RUNS_TO implements Container.RunsTo {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Artery> arteryList;
	@Transient
	public List<LymphaticVessel> lymphaticVesselList;
	@Transient
	public List<Vein> veinList;
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

	public RUNS_TO(Artery artery) {
		arteryList = new ArrayList<Artery>();
		arteryList.add(artery);
	}

	@Override
	public Artery getArtery() {
		if(arteryList != null && arteryList.size() > 0) {
			return arteryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArtery(Artery artery) {
		if(arteryList == null) {
			arteryList = new ArrayList<>();
		}
		if(arteryList.size() == 0) {
			arteryList.add(artery);
		} else {
			arteryList.set(0, artery);
		}
	}

	@Override
	public List<Artery> getArteryList() {
		return arteryList;
	}

	@Override
	public void setArteryList(List<Artery> arteryList) {
		this.arteryList = arteryList;
	}

	@Override
	public boolean hasArtery() {
		return arteryList != null && arteryList.size() > 0 && arteryList.get(0) != null;
	}

	public RUNS_TO(LymphaticVessel lymphaticVessel) {
		lymphaticVesselList = new ArrayList<LymphaticVessel>();
		lymphaticVesselList.add(lymphaticVessel);
	}

	@Override
	public LymphaticVessel getLymphaticVessel() {
		if(lymphaticVesselList != null && lymphaticVesselList.size() > 0) {
			return lymphaticVesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLymphaticVessel(LymphaticVessel lymphaticVessel) {
		if(lymphaticVesselList == null) {
			lymphaticVesselList = new ArrayList<>();
		}
		if(lymphaticVesselList.size() == 0) {
			lymphaticVesselList.add(lymphaticVessel);
		} else {
			lymphaticVesselList.set(0, lymphaticVessel);
		}
	}

	@Override
	public List<LymphaticVessel> getLymphaticVesselList() {
		return lymphaticVesselList;
	}

	@Override
	public void setLymphaticVesselList(List<LymphaticVessel> lymphaticVesselList) {
		this.lymphaticVesselList = lymphaticVesselList;
	}

	@Override
	public boolean hasLymphaticVessel() {
		return lymphaticVesselList != null && lymphaticVesselList.size() > 0 && lymphaticVesselList.get(0) != null;
	}

	public RUNS_TO(Vein vein) {
		veinList = new ArrayList<Vein>();
		veinList.add(vein);
	}

	@Override
	public Vein getVein() {
		if(veinList != null && veinList.size() > 0) {
			return veinList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVein(Vein vein) {
		if(veinList == null) {
			veinList = new ArrayList<>();
		}
		if(veinList.size() == 0) {
			veinList.add(vein);
		} else {
			veinList.set(0, vein);
		}
	}

	@Override
	public List<Vein> getVeinList() {
		return veinList;
	}

	@Override
	public void setVeinList(List<Vein> veinList) {
		this.veinList = veinList;
	}

	@Override
	public boolean hasVein() {
		return veinList != null && veinList.size() > 0 && veinList.get(0) != null;
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

	public RUNS_TO(List<Artery> arteryList,
			List<LymphaticVessel> lymphaticVesselList,
			List<Vein> veinList,
			List<Vessel> vesselList) {
		setArteryList(arteryList);
		setLymphaticVesselList(lymphaticVesselList);
		setVeinList(veinList);
		setVesselList(vesselList);
	}

	public void copy(Container.RunsTo org) {
		setArteryList(org.getArteryList());
		setLymphaticVesselList(org.getLymphaticVesselList());
		setVeinList(org.getVeinList());
		setVesselList(org.getVesselList());
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
