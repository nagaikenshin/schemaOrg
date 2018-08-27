package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Thing;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class RESERVATION_FOR implements Container.ReservationFor {

	private static final long serialVersionUID = 1L;

	public List<Thing> thingList;

	public RESERVATION_FOR() {
	}

	public RESERVATION_FOR(String string) {
		this(new THING(string));
	}

	public String getString() {
		if(thingList == null || thingList.size() == 0 || thingList.get(0) == null) {
			return null;
		} else {
			Name name = thingList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(thingList == null) {
			thingList = new ArrayList<Thing>();
		}
		if(thingList.size() == 0) {
			thingList.add(new THING(string));
		} else {
			thingList.set(0, new THING(string));
		}
	}

	public RESERVATION_FOR(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
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
