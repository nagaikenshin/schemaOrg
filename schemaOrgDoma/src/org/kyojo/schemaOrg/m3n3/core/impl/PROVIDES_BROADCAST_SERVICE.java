package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastService;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class PROVIDES_BROADCAST_SERVICE implements Container.ProvidesBroadcastService {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BroadcastService> broadcastServiceList;

	public PROVIDES_BROADCAST_SERVICE() {
	}

	public PROVIDES_BROADCAST_SERVICE(String string) {
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

	public PROVIDES_BROADCAST_SERVICE(BroadcastService broadcastService) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
