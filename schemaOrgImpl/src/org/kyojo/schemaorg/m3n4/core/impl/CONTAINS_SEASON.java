package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class CONTAINS_SEASON implements Container.ContainsSeason {

	private static final long serialVersionUID = 1L;

	public List<CreativeWork> creativeWorkList;
	public List<CreativeWorkSeason> creativeWorkSeasonList;
	public List<Trip> tripList;

	public CONTAINS_SEASON() {
	}

	public CONTAINS_SEASON(String string) {
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

	public CONTAINS_SEASON(CreativeWork creativeWork) {
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

	public CONTAINS_SEASON(CreativeWorkSeason creativeWorkSeason) {
		creativeWorkSeasonList = new ArrayList<CreativeWorkSeason>();
		creativeWorkSeasonList.add(creativeWorkSeason);
	}

	@Override
	public CreativeWorkSeason getCreativeWorkSeason() {
		if(creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0) {
			return creativeWorkSeasonList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWorkSeason(CreativeWorkSeason creativeWorkSeason) {
		if(creativeWorkSeasonList == null) {
			creativeWorkSeasonList = new ArrayList<>();
		}
		if(creativeWorkSeasonList.size() == 0) {
			creativeWorkSeasonList.add(creativeWorkSeason);
		} else {
			creativeWorkSeasonList.set(0, creativeWorkSeason);
		}
	}

	@Override
	public List<CreativeWorkSeason> getCreativeWorkSeasonList() {
		return creativeWorkSeasonList;
	}

	@Override
	public void setCreativeWorkSeasonList(List<CreativeWorkSeason> creativeWorkSeasonList) {
		this.creativeWorkSeasonList = creativeWorkSeasonList;
	}

	@Override
	public boolean hasCreativeWorkSeason() {
		return creativeWorkSeasonList != null && creativeWorkSeasonList.size() > 0 && creativeWorkSeasonList.get(0) != null;
	}

	public CONTAINS_SEASON(Trip trip) {
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

	public CONTAINS_SEASON(List<CreativeWork> creativeWorkList,
			List<CreativeWorkSeason> creativeWorkSeasonList,
			List<Trip> tripList) {
		setCreativeWorkList(creativeWorkList);
		setCreativeWorkSeasonList(creativeWorkSeasonList);
		setTripList(tripList);
	}

	public void copy(Container.ContainsSeason org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setCreativeWorkSeasonList(org.getCreativeWorkSeasonList());
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
