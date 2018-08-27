package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n3.core.Clazz.WebSite;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class INTERACTION_SERVICE implements Container.InteractionService {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<SoftwareApplication> softwareApplicationList;
	@Transient
	public List<WebSite> webSiteList;

	public INTERACTION_SERVICE() {
	}

	public INTERACTION_SERVICE(String string) {
		this(new SOFTWARE_APPLICATION(string));
	}

	public String getString() {
		if(softwareApplicationList == null || softwareApplicationList.size() == 0 || softwareApplicationList.get(0) == null) {
			return null;
		} else {
			Name name = softwareApplicationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(softwareApplicationList == null) {
			softwareApplicationList = new ArrayList<SoftwareApplication>();
		}
		if(softwareApplicationList.size() == 0) {
			softwareApplicationList.add(new SOFTWARE_APPLICATION(string));
		} else {
			softwareApplicationList.set(0, new SOFTWARE_APPLICATION(string));
		}
	}

	public INTERACTION_SERVICE(SoftwareApplication softwareApplication) {
		softwareApplicationList = new ArrayList<SoftwareApplication>();
		softwareApplicationList.add(softwareApplication);
	}

	@Override
	public SoftwareApplication getSoftwareApplication() {
		if(softwareApplicationList != null && softwareApplicationList.size() > 0) {
			return softwareApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSoftwareApplication(SoftwareApplication softwareApplication) {
		if(softwareApplicationList == null) {
			softwareApplicationList = new ArrayList<>();
		}
		if(softwareApplicationList.size() == 0) {
			softwareApplicationList.add(softwareApplication);
		} else {
			softwareApplicationList.set(0, softwareApplication);
		}
	}

	@Override
	public List<SoftwareApplication> getSoftwareApplicationList() {
		return softwareApplicationList;
	}

	@Override
	public void setSoftwareApplicationList(List<SoftwareApplication> softwareApplicationList) {
		this.softwareApplicationList = softwareApplicationList;
	}

	@Override
	public boolean hasSoftwareApplication() {
		return softwareApplicationList != null && softwareApplicationList.size() > 0 && softwareApplicationList.get(0) != null;
	}

	public INTERACTION_SERVICE(WebSite webSite) {
		webSiteList = new ArrayList<WebSite>();
		webSiteList.add(webSite);
	}

	@Override
	public WebSite getWebSite() {
		if(webSiteList != null && webSiteList.size() > 0) {
			return webSiteList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebSite(WebSite webSite) {
		if(webSiteList == null) {
			webSiteList = new ArrayList<>();
		}
		if(webSiteList.size() == 0) {
			webSiteList.add(webSite);
		} else {
			webSiteList.set(0, webSite);
		}
	}

	@Override
	public List<WebSite> getWebSiteList() {
		return webSiteList;
	}

	@Override
	public void setWebSiteList(List<WebSite> webSiteList) {
		this.webSiteList = webSiteList;
	}

	@Override
	public boolean hasWebSite() {
		return webSiteList != null && webSiteList.size() > 0 && webSiteList.get(0) != null;
	}

	public INTERACTION_SERVICE(List<SoftwareApplication> softwareApplicationList,
			List<WebSite> webSiteList) {
		setSoftwareApplicationList(softwareApplicationList);
		setWebSiteList(webSiteList);
	}

	public void copy(Container.InteractionService org) {
		setSoftwareApplicationList(org.getSoftwareApplicationList());
		setWebSiteList(org.getWebSiteList());
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
