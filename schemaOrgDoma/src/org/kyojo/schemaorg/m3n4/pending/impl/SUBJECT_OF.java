package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.Event;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.CREATIVE_WORK;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class SUBJECT_OF implements Container.SubjectOf {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<Event> eventList;

	public SUBJECT_OF() {
	}

	public SUBJECT_OF(String string) {
		this(new CREATIVE_WORK(string));
	}

	public String getString() {
		if(creativeWorkList == null || creativeWorkList.size() == 0 || creativeWorkList.get(0) == null) {
			return null;
		} else {
			Name name = creativeWorkList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<CreativeWork>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(new CREATIVE_WORK(string));
		} else {
			creativeWorkList.set(0, new CREATIVE_WORK(string));
		}
	}

	public SUBJECT_OF(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public SUBJECT_OF(Event event) {
		eventList = new ArrayList<Event>();
		eventList.add(event);
	}

	@Override
	public Event getEvent() {
		if(eventList != null && eventList.size() > 0) {
			return eventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEvent(Event event) {
		if(eventList == null) {
			eventList = new ArrayList<>();
		}
		if(eventList.size() == 0) {
			eventList.add(event);
		} else {
			eventList.set(0, event);
		}
	}

	@Override
	public List<Event> getEventList() {
		return eventList;
	}

	@Override
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

	@Override
	public boolean hasEvent() {
		return eventList != null && eventList.size() > 0 && eventList.get(0) != null;
	}

	public SUBJECT_OF(List<CreativeWork> creativeWorkList,
			List<Event> eventList) {
		setCreativeWorkList(creativeWorkList);
		setEventList(eventList);
	}

	public void copy(Container.SubjectOf org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setEventList(org.getEventList());
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
