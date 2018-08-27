package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.AboutPage;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class OWNERSHIP_FUNDING_INFO implements Container.OwnershipFundingInfo {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AboutPage> aboutPageList;
	@Transient
	public List<CreativeWork> creativeWorkList;
	@Transient
	public List<Text> textList;
	@Transient
	public List<URL> urlList;

	public OWNERSHIP_FUNDING_INFO() {
	}

	public OWNERSHIP_FUNDING_INFO(AboutPage aboutPage) {
		aboutPageList = new ArrayList<AboutPage>();
		aboutPageList.add(aboutPage);
	}

	@Override
	public AboutPage getAboutPage() {
		if(aboutPageList != null && aboutPageList.size() > 0) {
			return aboutPageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAboutPage(AboutPage aboutPage) {
		if(aboutPageList == null) {
			aboutPageList = new ArrayList<>();
		}
		if(aboutPageList.size() == 0) {
			aboutPageList.add(aboutPage);
		} else {
			aboutPageList.set(0, aboutPage);
		}
	}

	@Override
	public List<AboutPage> getAboutPageList() {
		return aboutPageList;
	}

	@Override
	public void setAboutPageList(List<AboutPage> aboutPageList) {
		this.aboutPageList = aboutPageList;
	}

	@Override
	public boolean hasAboutPage() {
		return aboutPageList != null && aboutPageList.size() > 0 && aboutPageList.get(0) != null;
	}

	public OWNERSHIP_FUNDING_INFO(CreativeWork creativeWork) {
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

	public OWNERSHIP_FUNDING_INFO(String string) {
		this(new TEXT(string));
	}

	public OWNERSHIP_FUNDING_INFO(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public OWNERSHIP_FUNDING_INFO(URL url) {
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

	public OWNERSHIP_FUNDING_INFO(List<AboutPage> aboutPageList,
			List<CreativeWork> creativeWorkList,
			List<Text> textList,
			List<URL> urlList) {
		setAboutPageList(aboutPageList);
		setCreativeWorkList(creativeWorkList);
		setTextList(textList);
		setURLList(urlList);
	}

	public void copy(Container.OwnershipFundingInfo org) {
		setAboutPageList(org.getAboutPageList());
		setCreativeWorkList(org.getCreativeWorkList());
		setTextList(org.getTextList());
		setURLList(org.getURLList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
