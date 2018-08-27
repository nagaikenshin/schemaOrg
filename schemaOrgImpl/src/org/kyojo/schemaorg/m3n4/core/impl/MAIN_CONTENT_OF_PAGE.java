package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebPageElement;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class MAIN_CONTENT_OF_PAGE implements Container.MainContentOfPage {

	private static final long serialVersionUID = 1L;

	public List<WebPageElement> webPageElementList;

	public MAIN_CONTENT_OF_PAGE() {
	}

	public MAIN_CONTENT_OF_PAGE(String string) {
		this(new WEB_PAGE_ELEMENT(string));
	}

	public String getString() {
		if(webPageElementList == null || webPageElementList.size() == 0 || webPageElementList.get(0) == null) {
			return null;
		} else {
			Name name = webPageElementList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<WebPageElement>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(new WEB_PAGE_ELEMENT(string));
		} else {
			webPageElementList.set(0, new WEB_PAGE_ELEMENT(string));
		}
	}

	public MAIN_CONTENT_OF_PAGE(WebPageElement webPageElement) {
		webPageElementList = new ArrayList<WebPageElement>();
		webPageElementList.add(webPageElement);
	}

	@Override
	public WebPageElement getWebPageElement() {
		if(webPageElementList != null && webPageElementList.size() > 0) {
			return webPageElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebPageElement(WebPageElement webPageElement) {
		if(webPageElementList == null) {
			webPageElementList = new ArrayList<>();
		}
		if(webPageElementList.size() == 0) {
			webPageElementList.add(webPageElement);
		} else {
			webPageElementList.set(0, webPageElement);
		}
	}

	@Override
	public List<WebPageElement> getWebPageElementList() {
		return webPageElementList;
	}

	@Override
	public void setWebPageElementList(List<WebPageElement> webPageElementList) {
		this.webPageElementList = webPageElementList;
	}

	@Override
	public boolean hasWebPageElement() {
		return webPageElementList != null && webPageElementList.size() > 0 && webPageElementList.get(0) != null;
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
