package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class DOCUMENTATION implements Container.Documentation {

	private static final long serialVersionUID = 1L;

	public List<CreativeWork> creativeWorkList;
	public List<URL> urlList;

	public DOCUMENTATION() {
	}

	public DOCUMENTATION(String string) {
		this(new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
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
			urlList.add(new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
		}
	}

	public DOCUMENTATION(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public DOCUMENTATION(URL url) {
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

	public DOCUMENTATION(List<CreativeWork> creativeWorkList,
			List<URL> urlList) {
		setCreativeWorkList(creativeWorkList);
		setURLList(urlList);
	}

	public void copy(Container.Documentation org) {
		setCreativeWorkList(org.getCreativeWorkList());
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
