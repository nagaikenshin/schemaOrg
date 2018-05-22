package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Time;

public class OPENS implements Container.Opens {

	private static final long serialVersionUID = 1L;

	public List<Time> timeList;

	public OPENS() {
	}

	public OPENS(java.util.Date time) {
		this(new TIME(time));
	}

	public OPENS(java.time.LocalTime time) {
		this(new TIME(time));
	}

	public OPENS(Time time) {
		timeList = new ArrayList<Time>();
		timeList.add(time);
	}

	@Override
	public Time getTime() {
		if(timeList != null && timeList.size() > 0) {
			return timeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTime(Time time) {
		if(timeList == null) {
			timeList = new ArrayList<>();
		}
		if(timeList.size() == 0) {
			timeList.add(time);
		} else {
			timeList.set(0, time);
		}
	}

	@Override
	public List<Time> getTimeList() {
		return timeList;
	}

	@Override
	public void setTimeList(List<Time> timeList) {
		this.timeList = timeList;
	}

	@Override
	public boolean hasTime() {
		return timeList != null && timeList.size() > 0 && timeList.get(0) != null;
	}

	@Override
	public java.sql.Time getNativeValue() {
		if(getTime() == null) return null;
		return getTime().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
