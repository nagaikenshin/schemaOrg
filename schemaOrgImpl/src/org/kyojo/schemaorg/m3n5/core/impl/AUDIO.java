package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n5.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n5.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class AUDIO implements Container.Audio {

	private static final long serialVersionUID = 1L;

	public List<AudioObject> audioObjectList;
	public List<Audiobook> audiobookList;
	public List<Clip> clipList;
	public List<MovieClip> movieClipList;
	public List<RadioClip> radioClipList;
	public List<TVClip> tvClipList;
	public List<VideoGameClip> videoGameClipList;

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

	public AUDIO(Clip clip) {
		clipList = new ArrayList<Clip>();
		clipList.add(clip);
	}

	@Override
	public Clip getClip() {
		if(clipList != null && clipList.size() > 0) {
			return clipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setClip(Clip clip) {
		if(clipList == null) {
			clipList = new ArrayList<>();
		}
		if(clipList.size() == 0) {
			clipList.add(clip);
		} else {
			clipList.set(0, clip);
		}
	}

	@Override
	public List<Clip> getClipList() {
		return clipList;
	}

	@Override
	public void setClipList(List<Clip> clipList) {
		this.clipList = clipList;
	}

	@Override
	public boolean hasClip() {
		return clipList != null && clipList.size() > 0 && clipList.get(0) != null;
	}

	public AUDIO(MovieClip movieClip) {
		movieClipList = new ArrayList<MovieClip>();
		movieClipList.add(movieClip);
	}

	@Override
	public MovieClip getMovieClip() {
		if(movieClipList != null && movieClipList.size() > 0) {
			return movieClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovieClip(MovieClip movieClip) {
		if(movieClipList == null) {
			movieClipList = new ArrayList<>();
		}
		if(movieClipList.size() == 0) {
			movieClipList.add(movieClip);
		} else {
			movieClipList.set(0, movieClip);
		}
	}

	@Override
	public List<MovieClip> getMovieClipList() {
		return movieClipList;
	}

	@Override
	public void setMovieClipList(List<MovieClip> movieClipList) {
		this.movieClipList = movieClipList;
	}

	@Override
	public boolean hasMovieClip() {
		return movieClipList != null && movieClipList.size() > 0 && movieClipList.get(0) != null;
	}

	public AUDIO(RadioClip radioClip) {
		radioClipList = new ArrayList<RadioClip>();
		radioClipList.add(radioClip);
	}

	@Override
	public RadioClip getRadioClip() {
		if(radioClipList != null && radioClipList.size() > 0) {
			return radioClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioClip(RadioClip radioClip) {
		if(radioClipList == null) {
			radioClipList = new ArrayList<>();
		}
		if(radioClipList.size() == 0) {
			radioClipList.add(radioClip);
		} else {
			radioClipList.set(0, radioClip);
		}
	}

	@Override
	public List<RadioClip> getRadioClipList() {
		return radioClipList;
	}

	@Override
	public void setRadioClipList(List<RadioClip> radioClipList) {
		this.radioClipList = radioClipList;
	}

	@Override
	public boolean hasRadioClip() {
		return radioClipList != null && radioClipList.size() > 0 && radioClipList.get(0) != null;
	}

	public AUDIO(TVClip tvClip) {
		tvClipList = new ArrayList<TVClip>();
		tvClipList.add(tvClip);
	}

	@Override
	public TVClip getTVClip() {
		if(tvClipList != null && tvClipList.size() > 0) {
			return tvClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTVClip(TVClip tvClip) {
		if(tvClipList == null) {
			tvClipList = new ArrayList<>();
		}
		if(tvClipList.size() == 0) {
			tvClipList.add(tvClip);
		} else {
			tvClipList.set(0, tvClip);
		}
	}

	@Override
	public List<TVClip> getTVClipList() {
		return tvClipList;
	}

	@Override
	public void setTVClipList(List<TVClip> tvClipList) {
		this.tvClipList = tvClipList;
	}

	@Override
	public boolean hasTVClip() {
		return tvClipList != null && tvClipList.size() > 0 && tvClipList.get(0) != null;
	}

	public AUDIO(VideoGameClip videoGameClip) {
		videoGameClipList = new ArrayList<VideoGameClip>();
		videoGameClipList.add(videoGameClip);
	}

	@Override
	public VideoGameClip getVideoGameClip() {
		if(videoGameClipList != null && videoGameClipList.size() > 0) {
			return videoGameClipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGameClip(VideoGameClip videoGameClip) {
		if(videoGameClipList == null) {
			videoGameClipList = new ArrayList<>();
		}
		if(videoGameClipList.size() == 0) {
			videoGameClipList.add(videoGameClip);
		} else {
			videoGameClipList.set(0, videoGameClip);
		}
	}

	@Override
	public List<VideoGameClip> getVideoGameClipList() {
		return videoGameClipList;
	}

	@Override
	public void setVideoGameClipList(List<VideoGameClip> videoGameClipList) {
		this.videoGameClipList = videoGameClipList;
	}

	@Override
	public boolean hasVideoGameClip() {
		return videoGameClipList != null && videoGameClipList.size() > 0 && videoGameClipList.get(0) != null;
	}

	public AUDIO(List<AudioObject> audioObjectList,
			List<Audiobook> audiobookList,
			List<Clip> clipList,
			List<MovieClip> movieClipList,
			List<RadioClip> radioClipList,
			List<TVClip> tvClipList,
			List<VideoGameClip> videoGameClipList) {
		setAudioObjectList(audioObjectList);
		setAudiobookList(audiobookList);
		setClipList(clipList);
		setMovieClipList(movieClipList);
		setRadioClipList(radioClipList);
		setTVClipList(tvClipList);
		setVideoGameClipList(videoGameClipList);
	}

	public void copy(Container.Audio org) {
		setAudioObjectList(org.getAudioObjectList());
		setAudiobookList(org.getAudiobookList());
		setClipList(org.getClipList());
		setMovieClipList(org.getMovieClipList());
		setRadioClipList(org.getRadioClipList());
		setTVClipList(org.getTVClipList());
		setVideoGameClipList(org.getVideoGameClipList());
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
