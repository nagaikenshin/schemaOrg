package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.DayOfWeek;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.impl.DAY_OF_WEEK;
import org.kyojo.schemaorg.m3n5.pending.Container;

public class BY_DAY implements Container.ByDay {

	private static final long serialVersionUID = 1L;

	public List<DayOfWeek> dayOfWeekList;

	public BY_DAY() {
	}

	public BY_DAY(String string) {
		this(new DAY_OF_WEEK(string));
	}

	public String getString() {
		if(dayOfWeekList == null || dayOfWeekList.size() == 0 || dayOfWeekList.get(0) == null) {
			return null;
		} else {
			Name name = dayOfWeekList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(dayOfWeekList == null) {
			dayOfWeekList = new ArrayList<DayOfWeek>();
		}
		if(dayOfWeekList.size() == 0) {
			dayOfWeekList.add(new DAY_OF_WEEK(string));
		} else {
			dayOfWeekList.set(0, new DAY_OF_WEEK(string));
		}
	}

	public BY_DAY(DayOfWeek dayOfWeek) {
		dayOfWeekList = new ArrayList<DayOfWeek>();
		dayOfWeekList.add(dayOfWeek);
	}

	@Override
	public DayOfWeek getDayOfWeek() {
		if(dayOfWeekList != null && dayOfWeekList.size() > 0) {
			return dayOfWeekList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		if(dayOfWeekList == null) {
			dayOfWeekList = new ArrayList<>();
		}
		if(dayOfWeekList.size() == 0) {
			dayOfWeekList.add(dayOfWeek);
		} else {
			dayOfWeekList.set(0, dayOfWeek);
		}
	}

	@Override
	public List<DayOfWeek> getDayOfWeekList() {
		return dayOfWeekList;
	}

	@Override
	public void setDayOfWeekList(List<DayOfWeek> dayOfWeekList) {
		this.dayOfWeekList = dayOfWeekList;
	}

	@Override
	public boolean hasDayOfWeek() {
		return dayOfWeekList != null && dayOfWeekList.size() > 0 && dayOfWeekList.get(0) != null;
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
