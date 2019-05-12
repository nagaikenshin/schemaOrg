package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastService;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.RadioBroadcastService;

import org.seasar.doma.Transient;

public class PUBLISHED_ON implements Container.PublishedOn {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BroadcastService> broadcastServiceList;
	@Transient
	public List<RadioBroadcastService> radioBroadcastServiceList;

	public PUBLISHED_ON() {
	}

	public PUBLISHED_ON(String string) {
		this(new BROADCAST_SERVICE(string));
	}

	public String getString() {
		if(broadcastServiceList == null || broadcastServiceList.size() == 0 || broadcastServiceList.get(0) == null) {
			return null;
		} else {
			Name name = broadcastServiceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(broadcastServiceList == null) {
			broadcastServiceList = new ArrayList<BroadcastService>();
		}
		if(broadcastServiceList.size() == 0) {
			broadcastServiceList.add(new BROADCAST_SERVICE(string));
		} else {
			broadcastServiceList.set(0, new BROADCAST_SERVICE(string));
		}
	}

	public PUBLISHED_ON(BroadcastService broadcastService) {
		broadcastServiceList = new ArrayList<BroadcastService>();
		broadcastServiceList.add(broadcastService);
	}

	@Override
	public BroadcastService getBroadcastService() {
		if(broadcastServiceList != null && broadcastServiceList.size() > 0) {
			return broadcastServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastService(BroadcastService broadcastService) {
		if(broadcastServiceList == null) {
			broadcastServiceList = new ArrayList<>();
		}
		if(broadcastServiceList.size() == 0) {
			broadcastServiceList.add(broadcastService);
		} else {
			broadcastServiceList.set(0, broadcastService);
		}
	}

	@Override
	public List<BroadcastService> getBroadcastServiceList() {
		return broadcastServiceList;
	}

	@Override
	public void setBroadcastServiceList(List<BroadcastService> broadcastServiceList) {
		this.broadcastServiceList = broadcastServiceList;
	}

	@Override
	public boolean hasBroadcastService() {
		return broadcastServiceList != null && broadcastServiceList.size() > 0 && broadcastServiceList.get(0) != null;
	}

	public PUBLISHED_ON(RadioBroadcastService radioBroadcastService) {
		radioBroadcastServiceList = new ArrayList<RadioBroadcastService>();
		radioBroadcastServiceList.add(radioBroadcastService);
	}

	@Override
	public RadioBroadcastService getRadioBroadcastService() {
		if(radioBroadcastServiceList != null && radioBroadcastServiceList.size() > 0) {
			return radioBroadcastServiceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioBroadcastService(RadioBroadcastService radioBroadcastService) {
		if(radioBroadcastServiceList == null) {
			radioBroadcastServiceList = new ArrayList<>();
		}
		if(radioBroadcastServiceList.size() == 0) {
			radioBroadcastServiceList.add(radioBroadcastService);
		} else {
			radioBroadcastServiceList.set(0, radioBroadcastService);
		}
	}

	@Override
	public List<RadioBroadcastService> getRadioBroadcastServiceList() {
		return radioBroadcastServiceList;
	}

	@Override
	public void setRadioBroadcastServiceList(List<RadioBroadcastService> radioBroadcastServiceList) {
		this.radioBroadcastServiceList = radioBroadcastServiceList;
	}

	@Override
	public boolean hasRadioBroadcastService() {
		return radioBroadcastServiceList != null && radioBroadcastServiceList.size() > 0 && radioBroadcastServiceList.get(0) != null;
	}

	public PUBLISHED_ON(List<BroadcastService> broadcastServiceList,
			List<RadioBroadcastService> radioBroadcastServiceList) {
		setBroadcastServiceList(broadcastServiceList);
		setRadioBroadcastServiceList(radioBroadcastServiceList);
	}

	public void copy(Container.PublishedOn org) {
		setBroadcastServiceList(org.getBroadcastServiceList());
		setRadioBroadcastServiceList(org.getRadioBroadcastServiceList());
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