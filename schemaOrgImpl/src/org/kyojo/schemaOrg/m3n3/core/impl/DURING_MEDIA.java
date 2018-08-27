package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class DURING_MEDIA implements Container.DuringMedia {

	private static final long serialVersionUID = 1L;

	public List<MediaObject> mediaObjectList;

	public DURING_MEDIA() {
	}

	public DURING_MEDIA(String string) {
		this(new MEDIA_OBJECT(string));
	}

	public String getString() {
		if(mediaObjectList == null || mediaObjectList.size() == 0 || mediaObjectList.get(0) == null) {
			return null;
		} else {
			Name name = mediaObjectList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(mediaObjectList == null) {
			mediaObjectList = new ArrayList<MediaObject>();
		}
		if(mediaObjectList.size() == 0) {
			mediaObjectList.add(new MEDIA_OBJECT(string));
		} else {
			mediaObjectList.set(0, new MEDIA_OBJECT(string));
		}
	}

	public DURING_MEDIA(MediaObject mediaObject) {
		mediaObjectList = new ArrayList<MediaObject>();
		mediaObjectList.add(mediaObject);
	}

	@Override
	public MediaObject getMediaObject() {
		if(mediaObjectList != null && mediaObjectList.size() > 0) {
			return mediaObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMediaObject(MediaObject mediaObject) {
		if(mediaObjectList == null) {
			mediaObjectList = new ArrayList<>();
		}
		if(mediaObjectList.size() == 0) {
			mediaObjectList.add(mediaObject);
		} else {
			mediaObjectList.set(0, mediaObject);
		}
	}

	@Override
	public List<MediaObject> getMediaObjectList() {
		return mediaObjectList;
	}

	@Override
	public void setMediaObjectList(List<MediaObject> mediaObjectList) {
		this.mediaObjectList = mediaObjectList;
	}

	@Override
	public boolean hasMediaObject() {
		return mediaObjectList != null && mediaObjectList.size() > 0 && mediaObjectList.get(0) != null;
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
