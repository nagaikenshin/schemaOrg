package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.HealthPlanFormulary;
import org.kyojo.schemaOrg.m3n3.pending.Container;
import org.kyojo.schemaOrg.m3n3.pending.impl.HEALTH_PLAN_FORMULARY;

public class INCLUDES_HEALTH_PLAN_FORMULARY implements Container.IncludesHealthPlanFormulary {

	private static final long serialVersionUID = 1L;

	public List<HealthPlanFormulary> healthPlanFormularyList;

	public INCLUDES_HEALTH_PLAN_FORMULARY() {
	}

	public INCLUDES_HEALTH_PLAN_FORMULARY(String string) {
		this(new HEALTH_PLAN_FORMULARY(string));
	}

	public String getString() {
		if(healthPlanFormularyList == null || healthPlanFormularyList.size() == 0 || healthPlanFormularyList.get(0) == null) {
			return null;
		} else {
			Name name = healthPlanFormularyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(healthPlanFormularyList == null) {
			healthPlanFormularyList = new ArrayList<HealthPlanFormulary>();
		}
		if(healthPlanFormularyList.size() == 0) {
			healthPlanFormularyList.add(new HEALTH_PLAN_FORMULARY(string));
		} else {
			healthPlanFormularyList.set(0, new HEALTH_PLAN_FORMULARY(string));
		}
	}

	public INCLUDES_HEALTH_PLAN_FORMULARY(HealthPlanFormulary healthPlanFormulary) {
		healthPlanFormularyList = new ArrayList<HealthPlanFormulary>();
		healthPlanFormularyList.add(healthPlanFormulary);
	}

	@Override
	public HealthPlanFormulary getHealthPlanFormulary() {
		if(healthPlanFormularyList != null && healthPlanFormularyList.size() > 0) {
			return healthPlanFormularyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthPlanFormulary(HealthPlanFormulary healthPlanFormulary) {
		if(healthPlanFormularyList == null) {
			healthPlanFormularyList = new ArrayList<>();
		}
		if(healthPlanFormularyList.size() == 0) {
			healthPlanFormularyList.add(healthPlanFormulary);
		} else {
			healthPlanFormularyList.set(0, healthPlanFormulary);
		}
	}

	@Override
	public List<HealthPlanFormulary> getHealthPlanFormularyList() {
		return healthPlanFormularyList;
	}

	@Override
	public void setHealthPlanFormularyList(List<HealthPlanFormulary> healthPlanFormularyList) {
		this.healthPlanFormularyList = healthPlanFormularyList;
	}

	@Override
	public boolean hasHealthPlanFormulary() {
		return healthPlanFormularyList != null && healthPlanFormularyList.size() > 0 && healthPlanFormularyList.get(0) != null;
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
