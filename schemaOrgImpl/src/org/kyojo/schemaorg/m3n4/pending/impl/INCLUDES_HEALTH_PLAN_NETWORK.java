package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthPlanNetwork;
import org.kyojo.schemaorg.m3n4.pending.Container;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_PLAN_NETWORK;

public class INCLUDES_HEALTH_PLAN_NETWORK implements Container.IncludesHealthPlanNetwork {

	private static final long serialVersionUID = 1L;

	public List<HealthPlanNetwork> healthPlanNetworkList;

	public INCLUDES_HEALTH_PLAN_NETWORK() {
	}

	public INCLUDES_HEALTH_PLAN_NETWORK(String string) {
		this(new HEALTH_PLAN_NETWORK(string));
	}

	public String getString() {
		if(healthPlanNetworkList == null || healthPlanNetworkList.size() == 0 || healthPlanNetworkList.get(0) == null) {
			return null;
		} else {
			Name name = healthPlanNetworkList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(healthPlanNetworkList == null) {
			healthPlanNetworkList = new ArrayList<HealthPlanNetwork>();
		}
		if(healthPlanNetworkList.size() == 0) {
			healthPlanNetworkList.add(new HEALTH_PLAN_NETWORK(string));
		} else {
			healthPlanNetworkList.set(0, new HEALTH_PLAN_NETWORK(string));
		}
	}

	public INCLUDES_HEALTH_PLAN_NETWORK(HealthPlanNetwork healthPlanNetwork) {
		healthPlanNetworkList = new ArrayList<HealthPlanNetwork>();
		healthPlanNetworkList.add(healthPlanNetwork);
	}

	@Override
	public HealthPlanNetwork getHealthPlanNetwork() {
		if(healthPlanNetworkList != null && healthPlanNetworkList.size() > 0) {
			return healthPlanNetworkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthPlanNetwork(HealthPlanNetwork healthPlanNetwork) {
		if(healthPlanNetworkList == null) {
			healthPlanNetworkList = new ArrayList<>();
		}
		if(healthPlanNetworkList.size() == 0) {
			healthPlanNetworkList.add(healthPlanNetwork);
		} else {
			healthPlanNetworkList.set(0, healthPlanNetwork);
		}
	}

	@Override
	public List<HealthPlanNetwork> getHealthPlanNetworkList() {
		return healthPlanNetworkList;
	}

	@Override
	public void setHealthPlanNetworkList(List<HealthPlanNetwork> healthPlanNetworkList) {
		this.healthPlanNetworkList = healthPlanNetworkList;
	}

	@Override
	public boolean hasHealthPlanNetwork() {
		return healthPlanNetworkList != null && healthPlanNetworkList.size() > 0 && healthPlanNetworkList.get(0) != null;
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
