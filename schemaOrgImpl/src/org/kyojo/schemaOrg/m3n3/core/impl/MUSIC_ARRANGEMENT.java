package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicComposition;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class MUSIC_ARRANGEMENT implements Container.MusicArrangement {

	private static final long serialVersionUID = 1L;

	public List<MusicComposition> musicCompositionList;

	public MUSIC_ARRANGEMENT() {
	}

	public MUSIC_ARRANGEMENT(String string) {
		this(new MUSIC_COMPOSITION(string));
	}

	public String getString() {
		if(musicCompositionList == null || musicCompositionList.size() == 0 || musicCompositionList.get(0) == null) {
			return null;
		} else {
			Name name = musicCompositionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicCompositionList == null) {
			musicCompositionList = new ArrayList<MusicComposition>();
		}
		if(musicCompositionList.size() == 0) {
			musicCompositionList.add(new MUSIC_COMPOSITION(string));
		} else {
			musicCompositionList.set(0, new MUSIC_COMPOSITION(string));
		}
	}

	public MUSIC_ARRANGEMENT(MusicComposition musicComposition) {
		musicCompositionList = new ArrayList<MusicComposition>();
		musicCompositionList.add(musicComposition);
	}

	@Override
	public MusicComposition getMusicComposition() {
		if(musicCompositionList != null && musicCompositionList.size() > 0) {
			return musicCompositionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicComposition(MusicComposition musicComposition) {
		if(musicCompositionList == null) {
			musicCompositionList = new ArrayList<>();
		}
		if(musicCompositionList.size() == 0) {
			musicCompositionList.add(musicComposition);
		} else {
			musicCompositionList.set(0, musicComposition);
		}
	}

	@Override
	public List<MusicComposition> getMusicCompositionList() {
		return musicCompositionList;
	}

	@Override
	public void setMusicCompositionList(List<MusicComposition> musicCompositionList) {
		this.musicCompositionList = musicCompositionList;
	}

	@Override
	public boolean hasMusicComposition() {
		return musicCompositionList != null && musicCompositionList.size() > 0 && musicCompositionList.get(0) != null;
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
