package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MusicPlaylist;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class IN_PLAYLIST implements Container.InPlaylist {

	private static final long serialVersionUID = 1L;

	public List<MusicPlaylist> musicPlaylistList;

	public IN_PLAYLIST() {
	}

	public IN_PLAYLIST(String string) {
		this(new MUSIC_PLAYLIST(string));
	}

	public String getString() {
		if(musicPlaylistList == null || musicPlaylistList.size() == 0 || musicPlaylistList.get(0) == null) {
			return null;
		} else {
			Name name = musicPlaylistList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicPlaylistList == null) {
			musicPlaylistList = new ArrayList<MusicPlaylist>();
		}
		if(musicPlaylistList.size() == 0) {
			musicPlaylistList.add(new MUSIC_PLAYLIST(string));
		} else {
			musicPlaylistList.set(0, new MUSIC_PLAYLIST(string));
		}
	}

	public IN_PLAYLIST(MusicPlaylist musicPlaylist) {
		musicPlaylistList = new ArrayList<MusicPlaylist>();
		musicPlaylistList.add(musicPlaylist);
	}

	@Override
	public MusicPlaylist getMusicPlaylist() {
		if(musicPlaylistList != null && musicPlaylistList.size() > 0) {
			return musicPlaylistList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicPlaylist(MusicPlaylist musicPlaylist) {
		if(musicPlaylistList == null) {
			musicPlaylistList = new ArrayList<>();
		}
		if(musicPlaylistList.size() == 0) {
			musicPlaylistList.add(musicPlaylist);
		} else {
			musicPlaylistList.set(0, musicPlaylist);
		}
	}

	@Override
	public List<MusicPlaylist> getMusicPlaylistList() {
		return musicPlaylistList;
	}

	@Override
	public void setMusicPlaylistList(List<MusicPlaylist> musicPlaylistList) {
		this.musicPlaylistList = musicPlaylistList;
	}

	@Override
	public boolean hasMusicPlaylist() {
		return musicPlaylistList != null && musicPlaylistList.size() > 0 && musicPlaylistList.get(0) != null;
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
