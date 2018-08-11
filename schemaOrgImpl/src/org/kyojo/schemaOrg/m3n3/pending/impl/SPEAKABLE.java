package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.URL;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.SpeakableSpecification;
import org.kyojo.schemaOrg.m3n3.pending.Container;

public class SPEAKABLE implements Container.Speakable {

	private static final long serialVersionUID = 1L;

	public List<SpeakableSpecification> speakableSpecificationList;
	public List<URL> urlList;

	public SPEAKABLE() {
	}

	public SPEAKABLE(String string) {
		this(new org.kyojo.schemaOrg.m3n3.core.impl.URL(string));
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
			urlList.add(new org.kyojo.schemaOrg.m3n3.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaOrg.m3n3.core.impl.URL(string));
		}
	}

	public SPEAKABLE(SpeakableSpecification speakableSpecification) {
		speakableSpecificationList = new ArrayList<SpeakableSpecification>();
		speakableSpecificationList.add(speakableSpecification);
	}

	@Override
	public SpeakableSpecification getSpeakableSpecification() {
		if(speakableSpecificationList != null && speakableSpecificationList.size() > 0) {
			return speakableSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSpeakableSpecification(SpeakableSpecification speakableSpecification) {
		if(speakableSpecificationList == null) {
			speakableSpecificationList = new ArrayList<>();
		}
		if(speakableSpecificationList.size() == 0) {
			speakableSpecificationList.add(speakableSpecification);
		} else {
			speakableSpecificationList.set(0, speakableSpecification);
		}
	}

	@Override
	public List<SpeakableSpecification> getSpeakableSpecificationList() {
		return speakableSpecificationList;
	}

	@Override
	public void setSpeakableSpecificationList(List<SpeakableSpecification> speakableSpecificationList) {
		this.speakableSpecificationList = speakableSpecificationList;
	}

	@Override
	public boolean hasSpeakableSpecification() {
		return speakableSpecificationList != null && speakableSpecificationList.size() > 0 && speakableSpecificationList.get(0) != null;
	}

	public SPEAKABLE(URL url) {
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

	public SPEAKABLE(List<SpeakableSpecification> speakableSpecificationList,
			List<URL> urlList) {
		setSpeakableSpecificationList(speakableSpecificationList);
		setURLList(urlList);
	}

	public void copy(Container.Speakable org) {
		setSpeakableSpecificationList(org.getSpeakableSpecificationList());
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
