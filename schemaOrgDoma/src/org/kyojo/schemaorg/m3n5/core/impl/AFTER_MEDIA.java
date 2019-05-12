package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Audiobook;
import org.kyojo.schemaorg.m3n5.core.Clazz.AudioObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n5.core.Clazz.DataDownload;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.MediaObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicVideoObject;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.Clazz.VideoObject;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegislationObject;

import org.seasar.doma.Transient;

public class AFTER_MEDIA implements Container.AfterMedia {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AudioObject> audioObjectList;
	@Transient
	public List<Audiobook> audiobookList;
	@Transient
	public List<Barcode> barcodeList;
	@Transient
	public List<DataDownload> dataDownloadList;
	@Transient
	public List<ImageObject> imageObjectList;
	@Transient
	public List<LegislationObject> legislationObjectList;
	@Transient
	public List<MediaObject> mediaObjectList;
	@Transient
	public List<MusicVideoObject> musicVideoObjectList;
	@Transient
	public List<URL> urlList;
	@Transient
	public List<VideoObject> videoObjectList;

	public AFTER_MEDIA() {
	}

	public AFTER_MEDIA(String string) {
		this(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
	}

	public String getString() {
		if(urlList == null || urlList.size() == 0 || urlList.get(0) == null) {
			return null;
		} else {
			return urlList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(urlList == null) {
			urlList = new ArrayList<URL>();
		}
		if(urlList.size() == 0) {
			urlList.add(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		}
	}

	public AFTER_MEDIA(AudioObject audioObject) {
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

	public AFTER_MEDIA(Audiobook audiobook) {
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

	public AFTER_MEDIA(Barcode barcode) {
		barcodeList = new ArrayList<Barcode>();
		barcodeList.add(barcode);
	}

	@Override
	public Barcode getBarcode() {
		if(barcodeList != null && barcodeList.size() > 0) {
			return barcodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBarcode(Barcode barcode) {
		if(barcodeList == null) {
			barcodeList = new ArrayList<>();
		}
		if(barcodeList.size() == 0) {
			barcodeList.add(barcode);
		} else {
			barcodeList.set(0, barcode);
		}
	}

	@Override
	public List<Barcode> getBarcodeList() {
		return barcodeList;
	}

	@Override
	public void setBarcodeList(List<Barcode> barcodeList) {
		this.barcodeList = barcodeList;
	}

	@Override
	public boolean hasBarcode() {
		return barcodeList != null && barcodeList.size() > 0 && barcodeList.get(0) != null;
	}

	public AFTER_MEDIA(DataDownload dataDownload) {
		dataDownloadList = new ArrayList<DataDownload>();
		dataDownloadList.add(dataDownload);
	}

	@Override
	public DataDownload getDataDownload() {
		if(dataDownloadList != null && dataDownloadList.size() > 0) {
			return dataDownloadList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataDownload(DataDownload dataDownload) {
		if(dataDownloadList == null) {
			dataDownloadList = new ArrayList<>();
		}
		if(dataDownloadList.size() == 0) {
			dataDownloadList.add(dataDownload);
		} else {
			dataDownloadList.set(0, dataDownload);
		}
	}

	@Override
	public List<DataDownload> getDataDownloadList() {
		return dataDownloadList;
	}

	@Override
	public void setDataDownloadList(List<DataDownload> dataDownloadList) {
		this.dataDownloadList = dataDownloadList;
	}

	@Override
	public boolean hasDataDownload() {
		return dataDownloadList != null && dataDownloadList.size() > 0 && dataDownloadList.get(0) != null;
	}

	public AFTER_MEDIA(ImageObject imageObject) {
		imageObjectList = new ArrayList<ImageObject>();
		imageObjectList.add(imageObject);
	}

	@Override
	public ImageObject getImageObject() {
		if(imageObjectList != null && imageObjectList.size() > 0) {
			return imageObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageObject(ImageObject imageObject) {
		if(imageObjectList == null) {
			imageObjectList = new ArrayList<>();
		}
		if(imageObjectList.size() == 0) {
			imageObjectList.add(imageObject);
		} else {
			imageObjectList.set(0, imageObject);
		}
	}

	@Override
	public List<ImageObject> getImageObjectList() {
		return imageObjectList;
	}

	@Override
	public void setImageObjectList(List<ImageObject> imageObjectList) {
		this.imageObjectList = imageObjectList;
	}

	@Override
	public boolean hasImageObject() {
		return imageObjectList != null && imageObjectList.size() > 0 && imageObjectList.get(0) != null;
	}

	public AFTER_MEDIA(LegislationObject legislationObject) {
		legislationObjectList = new ArrayList<LegislationObject>();
		legislationObjectList.add(legislationObject);
	}

	@Override
	public LegislationObject getLegislationObject() {
		if(legislationObjectList != null && legislationObjectList.size() > 0) {
			return legislationObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegislationObject(LegislationObject legislationObject) {
		if(legislationObjectList == null) {
			legislationObjectList = new ArrayList<>();
		}
		if(legislationObjectList.size() == 0) {
			legislationObjectList.add(legislationObject);
		} else {
			legislationObjectList.set(0, legislationObject);
		}
	}

	@Override
	public List<LegislationObject> getLegislationObjectList() {
		return legislationObjectList;
	}

	@Override
	public void setLegislationObjectList(List<LegislationObject> legislationObjectList) {
		this.legislationObjectList = legislationObjectList;
	}

	@Override
	public boolean hasLegislationObject() {
		return legislationObjectList != null && legislationObjectList.size() > 0 && legislationObjectList.get(0) != null;
	}

	public AFTER_MEDIA(MediaObject mediaObject) {
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

	public AFTER_MEDIA(MusicVideoObject musicVideoObject) {
		musicVideoObjectList = new ArrayList<MusicVideoObject>();
		musicVideoObjectList.add(musicVideoObject);
	}

	@Override
	public MusicVideoObject getMusicVideoObject() {
		if(musicVideoObjectList != null && musicVideoObjectList.size() > 0) {
			return musicVideoObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicVideoObject(MusicVideoObject musicVideoObject) {
		if(musicVideoObjectList == null) {
			musicVideoObjectList = new ArrayList<>();
		}
		if(musicVideoObjectList.size() == 0) {
			musicVideoObjectList.add(musicVideoObject);
		} else {
			musicVideoObjectList.set(0, musicVideoObject);
		}
	}

	@Override
	public List<MusicVideoObject> getMusicVideoObjectList() {
		return musicVideoObjectList;
	}

	@Override
	public void setMusicVideoObjectList(List<MusicVideoObject> musicVideoObjectList) {
		this.musicVideoObjectList = musicVideoObjectList;
	}

	@Override
	public boolean hasMusicVideoObject() {
		return musicVideoObjectList != null && musicVideoObjectList.size() > 0 && musicVideoObjectList.get(0) != null;
	}

	public AFTER_MEDIA(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public AFTER_MEDIA(VideoObject videoObject) {
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

	public AFTER_MEDIA(List<AudioObject> audioObjectList,
			List<Audiobook> audiobookList,
			List<Barcode> barcodeList,
			List<DataDownload> dataDownloadList,
			List<ImageObject> imageObjectList,
			List<LegislationObject> legislationObjectList,
			List<MediaObject> mediaObjectList,
			List<MusicVideoObject> musicVideoObjectList,
			List<URL> urlList,
			List<VideoObject> videoObjectList) {
		setAudioObjectList(audioObjectList);
		setAudiobookList(audiobookList);
		setBarcodeList(barcodeList);
		setDataDownloadList(dataDownloadList);
		setImageObjectList(imageObjectList);
		setLegislationObjectList(legislationObjectList);
		setMediaObjectList(mediaObjectList);
		setMusicVideoObjectList(musicVideoObjectList);
		setURLList(urlList);
		setVideoObjectList(videoObjectList);
	}

	public void copy(Container.AfterMedia org) {
		setAudioObjectList(org.getAudioObjectList());
		setAudiobookList(org.getAudiobookList());
		setBarcodeList(org.getBarcodeList());
		setDataDownloadList(org.getDataDownloadList());
		setImageObjectList(org.getImageObjectList());
		setLegislationObjectList(org.getLegislationObjectList());
		setMediaObjectList(org.getMediaObjectList());
		setMusicVideoObjectList(org.getMusicVideoObjectList());
		setURLList(org.getURLList());
		setVideoObjectList(org.getVideoObjectList());
	}

	@Override
	public String getNativeValue() {
		if(getURL() == null) return null;
		return getURL().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
