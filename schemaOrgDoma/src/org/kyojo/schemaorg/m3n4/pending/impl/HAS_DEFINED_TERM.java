package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.CREATIVE_WORK;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTerm;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class HAS_DEFINED_TERM implements Container.HasDefinedTerm {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<DefinedTerm> definedTermList;
	@Transient
	public List<Trip> tripList;

	public HAS_DEFINED_TERM() {
	}

	public HAS_DEFINED_TERM(String string) {
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

	public HAS_DEFINED_TERM(CreativeWork creativeWork) {
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

	public HAS_DEFINED_TERM(DefinedTerm definedTerm) {
		definedTermList = new ArrayList<DefinedTerm>();
		definedTermList.add(definedTerm);
	}

	@Override
	public DefinedTerm getDefinedTerm() {
		if(definedTermList != null && definedTermList.size() > 0) {
			return definedTermList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTerm(DefinedTerm definedTerm) {
		if(definedTermList == null) {
			definedTermList = new ArrayList<>();
		}
		if(definedTermList.size() == 0) {
			definedTermList.add(definedTerm);
		} else {
			definedTermList.set(0, definedTerm);
		}
	}

	@Override
	public List<DefinedTerm> getDefinedTermList() {
		return definedTermList;
	}

	@Override
	public void setDefinedTermList(List<DefinedTerm> definedTermList) {
		this.definedTermList = definedTermList;
	}

	@Override
	public boolean hasDefinedTerm() {
		return definedTermList != null && definedTermList.size() > 0 && definedTermList.get(0) != null;
	}

	public HAS_DEFINED_TERM(Trip trip) {
		tripList = new ArrayList<Trip>();
		tripList.add(trip);
	}

	@Override
	public Trip getTrip() {
		if(tripList != null && tripList.size() > 0) {
			return tripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrip(Trip trip) {
		if(tripList == null) {
			tripList = new ArrayList<>();
		}
		if(tripList.size() == 0) {
			tripList.add(trip);
		} else {
			tripList.set(0, trip);
		}
	}

	@Override
	public List<Trip> getTripList() {
		return tripList;
	}

	@Override
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	@Override
	public boolean hasTrip() {
		return tripList != null && tripList.size() > 0 && tripList.get(0) != null;
	}

	public HAS_DEFINED_TERM(List<CreativeWork> creativeWorkList,
			List<DefinedTerm> definedTermList,
			List<Trip> tripList) {
		setCreativeWorkList(creativeWorkList);
		setDefinedTermList(definedTermList);
		setTripList(tripList);
	}

	public void copy(Container.HasDefinedTerm org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setDefinedTermList(org.getDefinedTermList());
		setTripList(org.getTripList());
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
