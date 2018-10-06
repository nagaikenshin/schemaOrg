package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicAlbum;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicPlaylist;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRelease;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class IN_PLAYLIST implements Container.InPlaylist {

	private static final long serialVersionUID = 1L;

	public List<MusicAlbum> musicAlbumList;
	public List<MusicPlaylist> musicPlaylistList;
	public List<MusicRelease> musicReleaseList;

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

	public IN_PLAYLIST(MusicAlbum musicAlbum) {
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

	public IN_PLAYLIST(MusicRelease musicRelease) {
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

	public IN_PLAYLIST(List<MusicAlbum> musicAlbumList,
			List<MusicPlaylist> musicPlaylistList,
			List<MusicRelease> musicReleaseList) {
		setMusicAlbumList(musicAlbumList);
		setMusicPlaylistList(musicPlaylistList);
		setMusicReleaseList(musicReleaseList);
	}

	public void copy(Container.InPlaylist org) {
		setMusicAlbumList(org.getMusicAlbumList());
		setMusicPlaylistList(org.getMusicPlaylistList());
		setMusicReleaseList(org.getMusicReleaseList());
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
