package org.kyojo.schemaorg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Duration;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.core.impl.DURATION;
import org.kyojo.schemaorg.m3n3.pending.Container;

public class GRACE_PERIOD implements Container.GracePeriod {

	private static final long serialVersionUID = 1L;

	public List<Duration> durationList;

	public GRACE_PERIOD() {
	}

	public GRACE_PERIOD(String string) {
		this(new DURATION(string));
	}

	public String getString() {
		if(durationList == null || durationList.size() == 0 || durationList.get(0) == null) {
			return null;
		} else {
			Name name = durationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(durationList == null) {
			durationList = new ArrayList<Duration>();
		}
		if(durationList.size() == 0) {
			durationList.add(new DURATION(string));
		} else {
			durationList.set(0, new DURATION(string));
		}
	}

	public GRACE_PERIOD(Duration duration) {
		durationList = new ArrayList<Duration>();
		durationList.add(duration);
	}

	@Override
	public Duration getDuration() {
		if(durationList != null && durationList.size() > 0) {
			return durationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDuration(Duration duration) {
		if(durationList == null) {
			durationList = new ArrayList<>();
		}
		if(durationList.size() == 0) {
			durationList.add(duration);
		} else {
			durationList.set(0, duration);
		}
	}

	@Override
	public List<Duration> getDurationList() {
		return durationList;
	}

	@Override
	public void setDurationList(List<Duration> durationList) {
		this.durationList = durationList;
	}

	@Override
	public boolean hasDuration() {
		return durationList != null && durationList.size() > 0 && durationList.get(0) != null;
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
