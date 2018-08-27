package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n3.core.Clazz.Episode;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class PART_OF_EPISODE implements Container.PartOfEpisode {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<Episode> episodeList;

	public PART_OF_EPISODE() {
	}

	public PART_OF_EPISODE(String string) {
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

	public PART_OF_EPISODE(CreativeWork creativeWork) {
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

	public PART_OF_EPISODE(Episode episode) {
		episodeList = new ArrayList<Episode>();
		episodeList.add(episode);
	}

	@Override
	public Episode getEpisode() {
		if(episodeList != null && episodeList.size() > 0) {
			return episodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEpisode(Episode episode) {
		if(episodeList == null) {
			episodeList = new ArrayList<>();
		}
		if(episodeList.size() == 0) {
			episodeList.add(episode);
		} else {
			episodeList.set(0, episode);
		}
	}

	@Override
	public List<Episode> getEpisodeList() {
		return episodeList;
	}

	@Override
	public void setEpisodeList(List<Episode> episodeList) {
		this.episodeList = episodeList;
	}

	@Override
	public boolean hasEpisode() {
		return episodeList != null && episodeList.size() > 0 && episodeList.get(0) != null;
	}

	public PART_OF_EPISODE(List<CreativeWork> creativeWorkList,
			List<Episode> episodeList) {
		setCreativeWorkList(creativeWorkList);
		setEpisodeList(episodeList);
	}

	public void copy(Container.PartOfEpisode org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setEpisodeList(org.getEpisodeList());
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
