package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.HealthInsurancePlan;
import org.kyojo.schemaorg.m3n4.pending.Container;
import org.kyojo.schemaorg.m3n4.pending.impl.HEALTH_INSURANCE_PLAN;

public class INCLUDED_IN_HEALTH_INSURANCE_PLAN implements Container.IncludedInHealthInsurancePlan {

	private static final long serialVersionUID = 1L;

	public List<HealthInsurancePlan> healthInsurancePlanList;

	public INCLUDED_IN_HEALTH_INSURANCE_PLAN() {
	}

	public INCLUDED_IN_HEALTH_INSURANCE_PLAN(String string) {
		this(new HEALTH_INSURANCE_PLAN(string));
	}

	public String getString() {
		if(healthInsurancePlanList == null || healthInsurancePlanList.size() == 0 || healthInsurancePlanList.get(0) == null) {
			return null;
		} else {
			Name name = healthInsurancePlanList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(healthInsurancePlanList == null) {
			healthInsurancePlanList = new ArrayList<HealthInsurancePlan>();
		}
		if(healthInsurancePlanList.size() == 0) {
			healthInsurancePlanList.add(new HEALTH_INSURANCE_PLAN(string));
		} else {
			healthInsurancePlanList.set(0, new HEALTH_INSURANCE_PLAN(string));
		}
	}

	public INCLUDED_IN_HEALTH_INSURANCE_PLAN(HealthInsurancePlan healthInsurancePlan) {
		healthInsurancePlanList = new ArrayList<HealthInsurancePlan>();
		healthInsurancePlanList.add(healthInsurancePlan);
	}

	@Override
	public HealthInsurancePlan getHealthInsurancePlan() {
		if(healthInsurancePlanList != null && healthInsurancePlanList.size() > 0) {
			return healthInsurancePlanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHealthInsurancePlan(HealthInsurancePlan healthInsurancePlan) {
		if(healthInsurancePlanList == null) {
			healthInsurancePlanList = new ArrayList<>();
		}
		if(healthInsurancePlanList.size() == 0) {
			healthInsurancePlanList.add(healthInsurancePlan);
		} else {
			healthInsurancePlanList.set(0, healthInsurancePlan);
		}
	}

	@Override
	public List<HealthInsurancePlan> getHealthInsurancePlanList() {
		return healthInsurancePlanList;
	}

	@Override
	public void setHealthInsurancePlanList(List<HealthInsurancePlan> healthInsurancePlanList) {
		this.healthInsurancePlanList = healthInsurancePlanList;
	}

	@Override
	public boolean hasHealthInsurancePlan() {
		return healthInsurancePlanList != null && healthInsurancePlanList.size() > 0 && healthInsurancePlanList.get(0) != null;
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