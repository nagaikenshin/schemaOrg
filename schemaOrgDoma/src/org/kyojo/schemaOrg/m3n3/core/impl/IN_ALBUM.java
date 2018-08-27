package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class IN_ALBUM implements Container.InAlbum {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MusicAlbum> musicAlbumList;

	public IN_ALBUM() {
	}

	public IN_ALBUM(String string) {
		this(new MUSIC_ALBUM(string));
	}

	public String getString() {
		if(musicAlbumList == null || musicAlbumList.size() == 0 || musicAlbumList.get(0) == null) {
			return null;
		} else {
			Name name = musicAlbumList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicAlbumList == null) {
			musicAlbumList = new ArrayList<MusicAlbum>();
		}
		if(musicAlbumList.size() == 0) {
			musicAlbumList.add(new MUSIC_ALBUM(string));
		} else {
			musicAlbumList.set(0, new MUSIC_ALBUM(string));
		}
	}

	public IN_ALBUM(MusicAlbum musicAlbum) {
		musicAlbumList = new ArrayList<MusicAlbum>();
		musicAlbumList.add(musicAlbum);
	}

	@Override
	public MusicAlbum getMusicAlbum() {
		if(musicAlbumList != null && musicAlbumList.size() > 0) {
			return musicAlbumList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicAlbum(MusicAlbum musicAlbum) {
		if(musicAlbumList == null) {
			musicAlbumList = new ArrayList<>();
		}
		if(musicAlbumList.size() == 0) {
			musicAlbumList.add(musicAlbum);
		} else {
			musicAlbumList.set(0, musicAlbum);
		}
	}

	@Override
	public List<MusicAlbum> getMusicAlbumList() {
		return musicAlbumList;
	}

	@Override
	public void setMusicAlbumList(List<MusicAlbum> musicAlbumList) {
		this.musicAlbumList = musicAlbumList;
	}

	@Override
	public boolean hasMusicAlbum() {
		return musicAlbumList != null && musicAlbumList.size() > 0 && musicAlbumList.get(0) != null;
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
