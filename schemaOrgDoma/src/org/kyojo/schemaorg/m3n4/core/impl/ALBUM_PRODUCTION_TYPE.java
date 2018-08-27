package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbumProductionType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class ALBUM_PRODUCTION_TYPE implements Container.AlbumProductionType {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MusicAlbumProductionType> musicAlbumProductionTypeList;

	public ALBUM_PRODUCTION_TYPE() {
	}

	public ALBUM_PRODUCTION_TYPE(String string) {
		this(new MUSIC_ALBUM_PRODUCTION_TYPE(string));
	}

	public String getString() {
		if(musicAlbumProductionTypeList == null || musicAlbumProductionTypeList.size() == 0 || musicAlbumProductionTypeList.get(0) == null) {
			return null;
		} else {
			Name name = musicAlbumProductionTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicAlbumProductionTypeList == null) {
			musicAlbumProductionTypeList = new ArrayList<MusicAlbumProductionType>();
		}
		if(musicAlbumProductionTypeList.size() == 0) {
			musicAlbumProductionTypeList.add(new MUSIC_ALBUM_PRODUCTION_TYPE(string));
		} else {
			musicAlbumProductionTypeList.set(0, new MUSIC_ALBUM_PRODUCTION_TYPE(string));
		}
	}

	public ALBUM_PRODUCTION_TYPE(MusicAlbumProductionType musicAlbumProductionType) {
		musicAlbumProductionTypeList = new ArrayList<MusicAlbumProductionType>();
		musicAlbumProductionTypeList.add(musicAlbumProductionType);
	}

	@Override
	public MusicAlbumProductionType getMusicAlbumProductionType() {
		if(musicAlbumProductionTypeList != null && musicAlbumProductionTypeList.size() > 0) {
			return musicAlbumProductionTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbumProductionType(MusicAlbumProductionType musicAlbumProductionType) {
		if(musicAlbumProductionTypeList == null) {
			musicAlbumProductionTypeList = new ArrayList<>();
		}
		if(musicAlbumProductionTypeList.size() == 0) {
			musicAlbumProductionTypeList.add(musicAlbumProductionType);
		} else {
			musicAlbumProductionTypeList.set(0, musicAlbumProductionType);
		}
	}

	@Override
	public List<MusicAlbumProductionType> getMusicAlbumProductionTypeList() {
		return musicAlbumProductionTypeList;
	}

	@Override
	public void setMusicAlbumProductionTypeList(List<MusicAlbumProductionType> musicAlbumProductionTypeList) {
		this.musicAlbumProductionTypeList = musicAlbumProductionTypeList;
	}

	@Override
	public boolean hasMusicAlbumProductionType() {
		return musicAlbumProductionTypeList != null && musicAlbumProductionTypeList.size() > 0 && musicAlbumProductionTypeList.get(0) != null;
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
