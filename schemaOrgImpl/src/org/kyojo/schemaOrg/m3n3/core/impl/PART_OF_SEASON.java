package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreativeWorkSeason;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class PART_OF_SEASON implements Container.PartOfSeason {

	private static final long serialVersionUID = 1L;

	public List<CreativeWork> creativeWorkList;
	public List<CreativeWorkSeason> creativeWorkSeasonList;

	public PART_OF_SEASON() {
	}

	public PART_OF_SEASON(String string) {
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

	public PART_OF_SEASON(CreativeWork creativeWork) {
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

	public PART_OF_SEASON(CreativeWorkSeason creativeWorkSeason) {
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

	public PART_OF_SEASON(List<CreativeWork> creativeWorkList,
			List<CreativeWorkSeason> creativeWorkSeasonList) {
		setCreativeWorkList(creativeWorkList);
		setCreativeWorkSeasonList(creativeWorkSeasonList);
	}

	public void copy(Container.PartOfSeason org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setCreativeWorkSeasonList(org.getCreativeWorkSeasonList());
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
