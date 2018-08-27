package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n3.core.Clazz.Photograph;
import org.kyojo.schemaorg.m3n3.core.Clazz.URL;
import org.kyojo.schemaorg.m3n3.core.Container;

import org.seasar.doma.Transient;

public class PHOTO implements Container.Photo {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ImageObject> imageObjectList;
	@Transient
	public List<Photograph> photographList;
	@Transient
	public List<URL> urlList;

	public PHOTO() {
	}

	public PHOTO(String string) {
		this(new org.kyojo.schemaorg.m3n3.core.impl.URL(string));
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
			urlList.add(new org.kyojo.schemaorg.m3n3.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n3.core.impl.URL(string));
		}
	}

	public PHOTO(ImageObject imageObject) {
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

	public PHOTO(Photograph photograph) {
		photographList = new ArrayList<Photograph>();
		photographList.add(photograph);
	}

	@Override
	public Photograph getPhotograph() {
		if(photographList != null && photographList.size() > 0) {
			return photographList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhotograph(Photograph photograph) {
		if(photographList == null) {
			photographList = new ArrayList<>();
		}
		if(photographList.size() == 0) {
			photographList.add(photograph);
		} else {
			photographList.set(0, photograph);
		}
	}

	@Override
	public List<Photograph> getPhotographList() {
		return photographList;
	}

	@Override
	public void setPhotographList(List<Photograph> photographList) {
		this.photographList = photographList;
	}

	@Override
	public boolean hasPhotograph() {
		return photographList != null && photographList.size() > 0 && photographList.get(0) != null;
	}

	public PHOTO(URL url) {
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

	public PHOTO(List<ImageObject> imageObjectList,
			List<Photograph> photographList,
			List<URL> urlList) {
		setImageObjectList(imageObjectList);
		setPhotographList(photographList);
		setURLList(urlList);
	}

	public void copy(Container.Photo org) {
		setImageObjectList(org.getImageObjectList());
		setPhotographList(org.getPhotographList());
		setURLList(org.getURLList());
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
