package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EventStatusType;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class EVENT_STATUS implements Container.EventStatus {

	private static final long serialVersionUID = 1L;

	public List<EventStatusType> eventStatusTypeList;

	public EVENT_STATUS() {
	}

	public EVENT_STATUS(String string) {
		this(new EVENT_STATUS_TYPE(string));
	}

	public String getString() {
		if(eventStatusTypeList == null || eventStatusTypeList.size() == 0 || eventStatusTypeList.get(0) == null) {
			return null;
		} else {
			Name name = eventStatusTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(eventStatusTypeList == null) {
			eventStatusTypeList = new ArrayList<EventStatusType>();
		}
		if(eventStatusTypeList.size() == 0) {
			eventStatusTypeList.add(new EVENT_STATUS_TYPE(string));
		} else {
			eventStatusTypeList.set(0, new EVENT_STATUS_TYPE(string));
		}
	}

	public EVENT_STATUS(EventStatusType eventStatusType) {
		eventStatusTypeList = new ArrayList<EventStatusType>();
		eventStatusTypeList.add(eventStatusType);
	}

	@Override
	public EventStatusType getEventStatusType() {
		if(eventStatusTypeList != null && eventStatusTypeList.size() > 0) {
			return eventStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventStatusType(EventStatusType eventStatusType) {
		if(eventStatusTypeList == null) {
			eventStatusTypeList = new ArrayList<>();
		}
		if(eventStatusTypeList.size() == 0) {
			eventStatusTypeList.add(eventStatusType);
		} else {
			eventStatusTypeList.set(0, eventStatusType);
		}
	}

	@Override
	public List<EventStatusType> getEventStatusTypeList() {
		return eventStatusTypeList;
	}

	@Override
	public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList) {
		this.eventStatusTypeList = eventStatusTypeList;
	}

	@Override
	public boolean hasEventStatusType() {
		return eventStatusTypeList != null && eventStatusTypeList.size() > 0 && eventStatusTypeList.get(0) != null;
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
