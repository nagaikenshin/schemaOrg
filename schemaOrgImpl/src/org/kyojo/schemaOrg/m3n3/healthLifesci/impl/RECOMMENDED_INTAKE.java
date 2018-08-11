package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.RecommendedDoseSchedule;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RECOMMENDED_DOSE_SCHEDULE;

public class RECOMMENDED_INTAKE implements Container.RecommendedIntake {

	private static final long serialVersionUID = 1L;

	public List<RecommendedDoseSchedule> recommendedDoseScheduleList;

	public RECOMMENDED_INTAKE() {
	}

	public RECOMMENDED_INTAKE(String string) {
		this(new RECOMMENDED_DOSE_SCHEDULE(string));
	}

	public String getString() {
		if(recommendedDoseScheduleList == null || recommendedDoseScheduleList.size() == 0 || recommendedDoseScheduleList.get(0) == null) {
			return null;
		} else {
			Name name = recommendedDoseScheduleList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(recommendedDoseScheduleList == null) {
			recommendedDoseScheduleList = new ArrayList<RecommendedDoseSchedule>();
		}
		if(recommendedDoseScheduleList.size() == 0) {
			recommendedDoseScheduleList.add(new RECOMMENDED_DOSE_SCHEDULE(string));
		} else {
			recommendedDoseScheduleList.set(0, new RECOMMENDED_DOSE_SCHEDULE(string));
		}
	}

	public RECOMMENDED_INTAKE(RecommendedDoseSchedule recommendedDoseSchedule) {
		recommendedDoseScheduleList = new ArrayList<RecommendedDoseSchedule>();
		recommendedDoseScheduleList.add(recommendedDoseSchedule);
	}

	@Override
	public RecommendedDoseSchedule getRecommendedDoseSchedule() {
		if(recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0) {
			return recommendedDoseScheduleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRecommendedDoseSchedule(RecommendedDoseSchedule recommendedDoseSchedule) {
		if(recommendedDoseScheduleList == null) {
			recommendedDoseScheduleList = new ArrayList<>();
		}
		if(recommendedDoseScheduleList.size() == 0) {
			recommendedDoseScheduleList.add(recommendedDoseSchedule);
		} else {
			recommendedDoseScheduleList.set(0, recommendedDoseSchedule);
		}
	}

	@Override
	public List<RecommendedDoseSchedule> getRecommendedDoseScheduleList() {
		return recommendedDoseScheduleList;
	}

	@Override
	public void setRecommendedDoseScheduleList(List<RecommendedDoseSchedule> recommendedDoseScheduleList) {
		this.recommendedDoseScheduleList = recommendedDoseScheduleList;
	}

	@Override
	public boolean hasRecommendedDoseSchedule() {
		return recommendedDoseScheduleList != null && recommendedDoseScheduleList.size() > 0 && recommendedDoseScheduleList.get(0) != null;
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
