package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Clip;
import org.kyojo.schemaorg.m3n5.core.Clazz.MovieClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.RadioClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.TVClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoGameClip;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class VIDEO implements Container.Video {

	private static final long serialVersionUID = 1L;

	public List<Clip> clipList;
	public List<MovieClip> movieClipList;
	public List<RadioClip> radioClipList;
	public List<TVClip> tvClipList;
	public List<VideoGameClip> videoGameClipList;
	public List<VideoObject> videoObjectList;

	public VIDEO() {
	}

	public VIDEO(String string) {
		this(new CLIP(string));
	}

	public String getString() {
		if(clipList == null || clipList.size() == 0 || clipList.get(0) == null) {
			return null;
		} else {
			Name name = clipList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(clipList == null) {
			clipList = new ArrayList<Clip>();
		}
		if(clipList.size() == 0) {
			clipList.add(new CLIP(string));
		} else {
			clipList.set(0, new CLIP(string));
		}
	}

	public VIDEO(Clip clip) {
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

	public VIDEO(MovieClip movieClip) {
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

	public VIDEO(RadioClip radioClip) {
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

	public VIDEO(TVClip tvClip) {
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

	public VIDEO(VideoGameClip videoGameClip) {
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

	public VIDEO(VideoObject videoObject) {
		videoObjectList = new ArrayList<VideoObject>();
		videoObjectList.add(videoObject);
	}

	@Override
	public VideoObject getVideoObject() {
		if(videoObjectList != null && videoObjectList.size() > 0) {
			return videoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoObject(VideoObject videoObject) {
		if(videoObjectList == null) {
			videoObjectList = new ArrayList<>();
		}
		if(videoObjectList.size() == 0) {
			videoObjectList.add(videoObject);
		} else {
			videoObjectList.set(0, videoObject);
		}
	}

	@Override
	public List<VideoObject> getVideoObjectList() {
		return videoObjectList;
	}

	@Override
	public void setVideoObjectList(List<VideoObject> videoObjectList) {
		this.videoObjectList = videoObjectList;
	}

	@Override
	public boolean hasVideoObject() {
		return videoObjectList != null && videoObjectList.size() > 0 && videoObjectList.get(0) != null;
	}

	public VIDEO(List<Clip> clipList,
			List<MovieClip> movieClipList,
			List<RadioClip> radioClipList,
			List<TVClip> tvClipList,
			List<VideoGameClip> videoGameClipList,
			List<VideoObject> videoObjectList) {
		setClipList(clipList);
		setMovieClipList(movieClipList);
		setRadioClipList(radioClipList);
		setTVClipList(tvClipList);
		setVideoGameClipList(videoGameClipList);
		setVideoObjectList(videoObjectList);
	}

	public void copy(Container.Video org) {
		setClipList(org.getClipList());
		setMovieClipList(org.getMovieClipList());
		setRadioClipList(org.getRadioClipList());
		setTVClipList(org.getTVClipList());
		setVideoGameClipList(org.getVideoGameClipList());
		setVideoObjectList(org.getVideoObjectList());
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
