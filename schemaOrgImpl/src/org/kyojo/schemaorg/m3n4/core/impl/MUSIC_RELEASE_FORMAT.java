package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicReleaseFormatType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class MUSIC_RELEASE_FORMAT implements Container.MusicReleaseFormat {

	private static final long serialVersionUID = 1L;

	public List<MusicReleaseFormatType> musicReleaseFormatTypeList;

	public MUSIC_RELEASE_FORMAT() {
	}

	public MUSIC_RELEASE_FORMAT(String string) {
		this(new MUSIC_RELEASE_FORMAT_TYPE(string));
	}

	public String getString() {
		if(musicReleaseFormatTypeList == null || musicReleaseFormatTypeList.size() == 0 || musicReleaseFormatTypeList.get(0) == null) {
			return null;
		} else {
			Name name = musicReleaseFormatTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicReleaseFormatTypeList == null) {
			musicReleaseFormatTypeList = new ArrayList<MusicReleaseFormatType>();
		}
		if(musicReleaseFormatTypeList.size() == 0) {
			musicReleaseFormatTypeList.add(new MUSIC_RELEASE_FORMAT_TYPE(string));
		} else {
			musicReleaseFormatTypeList.set(0, new MUSIC_RELEASE_FORMAT_TYPE(string));
		}
	}

	public MUSIC_RELEASE_FORMAT(MusicReleaseFormatType musicReleaseFormatType) {
		musicReleaseFormatTypeList = new ArrayList<MusicReleaseFormatType>();
		musicReleaseFormatTypeList.add(musicReleaseFormatType);
	}

	@Override
	public MusicReleaseFormatType getMusicReleaseFormatType() {
		if(musicReleaseFormatTypeList != null && musicReleaseFormatTypeList.size() > 0) {
			return musicReleaseFormatTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicReleaseFormatType(MusicReleaseFormatType musicReleaseFormatType) {
		if(musicReleaseFormatTypeList == null) {
			musicReleaseFormatTypeList = new ArrayList<>();
		}
		if(musicReleaseFormatTypeList.size() == 0) {
			musicReleaseFormatTypeList.add(musicReleaseFormatType);
		} else {
			musicReleaseFormatTypeList.set(0, musicReleaseFormatType);
		}
	}

	@Override
	public List<MusicReleaseFormatType> getMusicReleaseFormatTypeList() {
		return musicReleaseFormatTypeList;
	}

	@Override
	public void setMusicReleaseFormatTypeList(List<MusicReleaseFormatType> musicReleaseFormatTypeList) {
		this.musicReleaseFormatTypeList = musicReleaseFormatTypeList;
	}

	@Override
	public boolean hasMusicReleaseFormatType() {
		return musicReleaseFormatTypeList != null && musicReleaseFormatTypeList.size() > 0 && musicReleaseFormatTypeList.get(0) != null;
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
