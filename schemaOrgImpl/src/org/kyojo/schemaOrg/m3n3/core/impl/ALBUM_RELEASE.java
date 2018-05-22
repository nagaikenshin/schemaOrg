package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicRelease;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class ALBUM_RELEASE implements Container.AlbumRelease {

	private static final long serialVersionUID = 1L;

	public List<MusicRelease> musicReleaseList;

	public ALBUM_RELEASE() {
	}

	public ALBUM_RELEASE(String string) {
		this(new MUSIC_RELEASE(string));
	}

	public String getString() {
		if(musicReleaseList == null || musicReleaseList.size() == 0 || musicReleaseList.get(0) == null) {
			return null;
		} else {
			Name name = musicReleaseList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicReleaseList == null) {
			musicReleaseList = new ArrayList<MusicRelease>();
		}
		if(musicReleaseList.size() == 0) {
			musicReleaseList.add(new MUSIC_RELEASE(string));
		} else {
			musicReleaseList.set(0, new MUSIC_RELEASE(string));
		}
	}

	public ALBUM_RELEASE(MusicRelease musicRelease) {
		musicReleaseList = new ArrayList<MusicRelease>();
		musicReleaseList.add(musicRelease);
	}

	@Override
	public MusicRelease getMusicRelease() {
		if(musicReleaseList != null && musicReleaseList.size() > 0) {
			return musicReleaseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRelease(MusicRelease musicRelease) {
		if(musicReleaseList == null) {
			musicReleaseList = new ArrayList<>();
		}
		if(musicReleaseList.size() == 0) {
			musicReleaseList.add(musicRelease);
		} else {
			musicReleaseList.set(0, musicRelease);
		}
	}

	@Override
	public List<MusicRelease> getMusicReleaseList() {
		return musicReleaseList;
	}

	@Override
	public void setMusicReleaseList(List<MusicRelease> musicReleaseList) {
		this.musicReleaseList = musicReleaseList;
	}

	@Override
	public boolean hasMusicRelease() {
		return musicReleaseList != null && musicReleaseList.size() > 0 && musicReleaseList.get(0) != null;
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
