package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class TRACK implements Container.Track {

	private static final long serialVersionUID = 1L;

	public List<ItemList> itemListList;
	public List<MusicRecording> musicRecordingList;

	public TRACK() {
	}

	public TRACK(String string) {
		this(new ITEM_LIST(string));
	}

	public String getString() {
		if(itemListList == null || itemListList.size() == 0 || itemListList.get(0) == null) {
			return null;
		} else {
			Name name = itemListList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(itemListList == null) {
			itemListList = new ArrayList<ItemList>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(new ITEM_LIST(string));
		} else {
			itemListList.set(0, new ITEM_LIST(string));
		}
	}

	public TRACK(ItemList itemList) {
		itemListList = new ArrayList<ItemList>();
		itemListList.add(itemList);
	}

	@Override
	public ItemList getItemList() {
		if(itemListList != null && itemListList.size() > 0) {
			return itemListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemList(ItemList itemList) {
		if(itemListList == null) {
			itemListList = new ArrayList<>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(itemList);
		} else {
			itemListList.set(0, itemList);
		}
	}

	@Override
	public List<ItemList> getItemListList() {
		return itemListList;
	}

	@Override
	public void setItemListList(List<ItemList> itemListList) {
		this.itemListList = itemListList;
	}

	@Override
	public boolean hasItemList() {
		return itemListList != null && itemListList.size() > 0 && itemListList.get(0) != null;
	}

	public TRACK(MusicRecording musicRecording) {
		musicRecordingList = new ArrayList<MusicRecording>();
		musicRecordingList.add(musicRecording);
	}

	@Override
	public MusicRecording getMusicRecording() {
		if(musicRecordingList != null && musicRecordingList.size() > 0) {
			return musicRecordingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRecording(MusicRecording musicRecording) {
		if(musicRecordingList == null) {
			musicRecordingList = new ArrayList<>();
		}
		if(musicRecordingList.size() == 0) {
			musicRecordingList.add(musicRecording);
		} else {
			musicRecordingList.set(0, musicRecording);
		}
	}

	@Override
	public List<MusicRecording> getMusicRecordingList() {
		return musicRecordingList;
	}

	@Override
	public void setMusicRecordingList(List<MusicRecording> musicRecordingList) {
		this.musicRecordingList = musicRecordingList;
	}

	@Override
	public boolean hasMusicRecording() {
		return musicRecordingList != null && musicRecordingList.size() > 0 && musicRecordingList.get(0) != null;
	}

	public TRACK(List<ItemList> itemListList,
			List<MusicRecording> musicRecordingList) {
		setItemListList(itemListList);
		setMusicRecordingList(musicRecordingList);
	}

	public void copy(Container.Track org) {
		setItemListList(org.getItemListList());
		setMusicRecordingList(org.getMusicRecordingList());
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
