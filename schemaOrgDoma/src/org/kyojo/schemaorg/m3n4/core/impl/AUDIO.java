package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n4.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class AUDIO implements Container.Audio {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AudioObject> audioObjectList;
	@Transient
	public List<Audiobook> audiobookList;

	public AUDIO() {
	}

	public AUDIO(String string) {
		this(new AUDIO_OBJECT(string));
	}

	public String getString() {
		if(audioObjectList == null || audioObjectList.size() == 0 || audioObjectList.get(0) == null) {
			return null;
		} else {
			Name name = audioObjectList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(audioObjectList == null) {
			audioObjectList = new ArrayList<AudioObject>();
		}
		if(audioObjectList.size() == 0) {
			audioObjectList.add(new AUDIO_OBJECT(string));
		} else {
			audioObjectList.set(0, new AUDIO_OBJECT(string));
		}
	}

	public AUDIO(AudioObject audioObject) {
		audioObjectList = new ArrayList<AudioObject>();
		audioObjectList.add(audioObject);
	}

	@Override
	public AudioObject getAudioObject() {
		if(audioObjectList != null && audioObjectList.size() > 0) {
			return audioObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudioObject(AudioObject audioObject) {
		if(audioObjectList == null) {
			audioObjectList = new ArrayList<>();
		}
		if(audioObjectList.size() == 0) {
			audioObjectList.add(audioObject);
		} else {
			audioObjectList.set(0, audioObject);
		}
	}

	@Override
	public List<AudioObject> getAudioObjectList() {
		return audioObjectList;
	}

	@Override
	public void setAudioObjectList(List<AudioObject> audioObjectList) {
		this.audioObjectList = audioObjectList;
	}

	@Override
	public boolean hasAudioObject() {
		return audioObjectList != null && audioObjectList.size() > 0 && audioObjectList.get(0) != null;
	}

	public AUDIO(Audiobook audiobook) {
		audiobookList = new ArrayList<Audiobook>();
		audiobookList.add(audiobook);
	}

	@Override
	public Audiobook getAudiobook() {
		if(audiobookList != null && audiobookList.size() > 0) {
			return audiobookList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudiobook(Audiobook audiobook) {
		if(audiobookList == null) {
			audiobookList = new ArrayList<>();
		}
		if(audiobookList.size() == 0) {
			audiobookList.add(audiobook);
		} else {
			audiobookList.set(0, audiobook);
		}
	}

	@Override
	public List<Audiobook> getAudiobookList() {
		return audiobookList;
	}

	@Override
	public void setAudiobookList(List<Audiobook> audiobookList) {
		this.audiobookList = audiobookList;
	}

	@Override
	public boolean hasAudiobook() {
		return audiobookList != null && audiobookList.size() > 0 && audiobookList.get(0) != null;
	}

	public AUDIO(List<AudioObject> audioObjectList,
			List<Audiobook> audiobookList) {
		setAudioObjectList(audioObjectList);
		setAudiobookList(audiobookList);
	}

	public void copy(Container.Audio org) {
		setAudioObjectList(org.getAudioObjectList());
		setAudiobookList(org.getAudiobookList());
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
