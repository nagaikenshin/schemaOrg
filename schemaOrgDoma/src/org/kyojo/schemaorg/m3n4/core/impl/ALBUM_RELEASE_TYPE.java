package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbumReleaseType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class ALBUM_RELEASE_TYPE implements Container.AlbumReleaseType {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MusicAlbumReleaseType> musicAlbumReleaseTypeList;

	public ALBUM_RELEASE_TYPE() {
	}

	public ALBUM_RELEASE_TYPE(String string) {
		this(new MUSIC_ALBUM_RELEASE_TYPE(string));
	}

	public String getString() {
		if(musicAlbumReleaseTypeList == null || musicAlbumReleaseTypeList.size() == 0 || musicAlbumReleaseTypeList.get(0) == null) {
			return null;
		} else {
			Name name = musicAlbumReleaseTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicAlbumReleaseTypeList == null) {
			musicAlbumReleaseTypeList = new ArrayList<MusicAlbumReleaseType>();
		}
		if(musicAlbumReleaseTypeList.size() == 0) {
			musicAlbumReleaseTypeList.add(new MUSIC_ALBUM_RELEASE_TYPE(string));
		} else {
			musicAlbumReleaseTypeList.set(0, new MUSIC_ALBUM_RELEASE_TYPE(string));
		}
	}

	public ALBUM_RELEASE_TYPE(MusicAlbumReleaseType musicAlbumReleaseType) {
		musicAlbumReleaseTypeList = new ArrayList<MusicAlbumReleaseType>();
		musicAlbumReleaseTypeList.add(musicAlbumReleaseType);
	}

	@Override
	public MusicAlbumReleaseType getMusicAlbumReleaseType() {
		if(musicAlbumReleaseTypeList != null && musicAlbumReleaseTypeList.size() > 0) {
			return musicAlbumReleaseTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbumReleaseType(MusicAlbumReleaseType musicAlbumReleaseType) {
		if(musicAlbumReleaseTypeList == null) {
			musicAlbumReleaseTypeList = new ArrayList<>();
		}
		if(musicAlbumReleaseTypeList.size() == 0) {
			musicAlbumReleaseTypeList.add(musicAlbumReleaseType);
		} else {
			musicAlbumReleaseTypeList.set(0, musicAlbumReleaseType);
		}
	}

	@Override
	public List<MusicAlbumReleaseType> getMusicAlbumReleaseTypeList() {
		return musicAlbumReleaseTypeList;
	}

	@Override
	public void setMusicAlbumReleaseTypeList(List<MusicAlbumReleaseType> musicAlbumReleaseTypeList) {
		this.musicAlbumReleaseTypeList = musicAlbumReleaseTypeList;
	}

	@Override
	public boolean hasMusicAlbumReleaseType() {
		return musicAlbumReleaseTypeList != null && musicAlbumReleaseTypeList.size() > 0 && musicAlbumReleaseTypeList.get(0) != null;
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
