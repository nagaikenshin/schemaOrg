package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Event;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class RECORDED_AT implements Container.RecordedAt {

	private static final long serialVersionUID = 1L;

	public List<Event> eventList;

	public RECORDED_AT() {
	}

	public RECORDED_AT(String string) {
		this(new EVENT(string));
	}

	public String getString() {
		if(eventList == null || eventList.size() == 0 || eventList.get(0) == null) {
			return null;
		} else {
			Name name = eventList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(eventList == null) {
			eventList = new ArrayList<Event>();
		}
		if(eventList.size() == 0) {
			eventList.add(new EVENT(string));
		} else {
			eventList.set(0, new EVENT(string));
		}
	}

	public RECORDED_AT(Event event) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
