package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MaximumDoseSchedule;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MAXIMUM_DOSE_SCHEDULE;

import org.seasar.doma.Transient;

public class MAXIMUM_INTAKE implements Container.MaximumIntake {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MaximumDoseSchedule> maximumDoseScheduleList;

	public MAXIMUM_INTAKE() {
	}

	public MAXIMUM_INTAKE(String string) {
		this(new MAXIMUM_DOSE_SCHEDULE(string));
	}

	public String getString() {
		if(maximumDoseScheduleList == null || maximumDoseScheduleList.size() == 0 || maximumDoseScheduleList.get(0) == null) {
			return null;
		} else {
			Name name = maximumDoseScheduleList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(maximumDoseScheduleList == null) {
			maximumDoseScheduleList = new ArrayList<MaximumDoseSchedule>();
		}
		if(maximumDoseScheduleList.size() == 0) {
			maximumDoseScheduleList.add(new MAXIMUM_DOSE_SCHEDULE(string));
		} else {
			maximumDoseScheduleList.set(0, new MAXIMUM_DOSE_SCHEDULE(string));
		}
	}

	public MAXIMUM_INTAKE(MaximumDoseSchedule maximumDoseSchedule) {
		maximumDoseScheduleList = new ArrayList<MaximumDoseSchedule>();
		maximumDoseScheduleList.add(maximumDoseSchedule);
	}

	@Override
	public MaximumDoseSchedule getMaximumDoseSchedule() {
		if(maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0) {
			return maximumDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMaximumDoseSchedule(MaximumDoseSchedule maximumDoseSchedule) {
		if(maximumDoseScheduleList == null) {
			maximumDoseScheduleList = new ArrayList<>();
		}
		if(maximumDoseScheduleList.size() == 0) {
			maximumDoseScheduleList.add(maximumDoseSchedule);
		} else {
			maximumDoseScheduleList.set(0, maximumDoseSchedule);
		}
	}

	@Override
	public List<MaximumDoseSchedule> getMaximumDoseScheduleList() {
		return maximumDoseScheduleList;
	}

	@Override
	public void setMaximumDoseScheduleList(List<MaximumDoseSchedule> maximumDoseScheduleList) {
		this.maximumDoseScheduleList = maximumDoseScheduleList;
	}

	@Override
	public boolean hasMaximumDoseSchedule() {
		return maximumDoseScheduleList != null && maximumDoseScheduleList.size() > 0 && maximumDoseScheduleList.get(0) != null;
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
