package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MobileApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.SoftwareApplication;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGame;
import org.kyojo.schemaorg.m3n4.core.Clazz.WebApplication;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class SOFTWARE_ADD_ON implements Container.SoftwareAddOn {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MobileApplication> mobileApplicationList;
	@Transient
	public List<SoftwareApplication> softwareApplicationList;
	@Transient
	public List<VideoGame> videoGameList;
	@Transient
	public List<WebApplication> webApplicationList;

	public SOFTWARE_ADD_ON() {
	}

	public SOFTWARE_ADD_ON(String string) {
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

	public SOFTWARE_ADD_ON(MobileApplication mobileApplication) {
		mobileApplicationList = new ArrayList<MobileApplication>();
		mobileApplicationList.add(mobileApplication);
	}

	@Override
	public MobileApplication getMobileApplication() {
		if(mobileApplicationList != null && mobileApplicationList.size() > 0) {
			return mobileApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMobileApplication(MobileApplication mobileApplication) {
		if(mobileApplicationList == null) {
			mobileApplicationList = new ArrayList<>();
		}
		if(mobileApplicationList.size() == 0) {
			mobileApplicationList.add(mobileApplication);
		} else {
			mobileApplicationList.set(0, mobileApplication);
		}
	}

	@Override
	public List<MobileApplication> getMobileApplicationList() {
		return mobileApplicationList;
	}

	@Override
	public void setMobileApplicationList(List<MobileApplication> mobileApplicationList) {
		this.mobileApplicationList = mobileApplicationList;
	}

	@Override
	public boolean hasMobileApplication() {
		return mobileApplicationList != null && mobileApplicationList.size() > 0 && mobileApplicationList.get(0) != null;
	}

	public SOFTWARE_ADD_ON(SoftwareApplication softwareApplication) {
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

	public SOFTWARE_ADD_ON(VideoGame videoGame) {
		videoGameList = new ArrayList<VideoGame>();
		videoGameList.add(videoGame);
	}

	@Override
	public VideoGame getVideoGame() {
		if(videoGameList != null && videoGameList.size() > 0) {
			return videoGameList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVideoGame(VideoGame videoGame) {
		if(videoGameList == null) {
			videoGameList = new ArrayList<>();
		}
		if(videoGameList.size() == 0) {
			videoGameList.add(videoGame);
		} else {
			videoGameList.set(0, videoGame);
		}
	}

	@Override
	public List<VideoGame> getVideoGameList() {
		return videoGameList;
	}

	@Override
	public void setVideoGameList(List<VideoGame> videoGameList) {
		this.videoGameList = videoGameList;
	}

	@Override
	public boolean hasVideoGame() {
		return videoGameList != null && videoGameList.size() > 0 && videoGameList.get(0) != null;
	}

	public SOFTWARE_ADD_ON(WebApplication webApplication) {
		webApplicationList = new ArrayList<WebApplication>();
		webApplicationList.add(webApplication);
	}

	@Override
	public WebApplication getWebApplication() {
		if(webApplicationList != null && webApplicationList.size() > 0) {
			return webApplicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWebApplication(WebApplication webApplication) {
		if(webApplicationList == null) {
			webApplicationList = new ArrayList<>();
		}
		if(webApplicationList.size() == 0) {
			webApplicationList.add(webApplication);
		} else {
			webApplicationList.set(0, webApplication);
		}
	}

	@Override
	public List<WebApplication> getWebApplicationList() {
		return webApplicationList;
	}

	@Override
	public void setWebApplicationList(List<WebApplication> webApplicationList) {
		this.webApplicationList = webApplicationList;
	}

	@Override
	public boolean hasWebApplication() {
		return webApplicationList != null && webApplicationList.size() > 0 && webApplicationList.get(0) != null;
	}

	public SOFTWARE_ADD_ON(List<MobileApplication> mobileApplicationList,
			List<SoftwareApplication> softwareApplicationList,
			List<VideoGame> videoGameList,
			List<WebApplication> webApplicationList) {
		setMobileApplicationList(mobileApplicationList);
		setSoftwareApplicationList(softwareApplicationList);
		setVideoGameList(videoGameList);
		setWebApplicationList(webApplicationList);
	}

	public void copy(Container.SoftwareAddOn org) {
		setMobileApplicationList(org.getMobileApplicationList());
		setSoftwareApplicationList(org.getSoftwareApplicationList());
		setVideoGameList(org.getVideoGameList());
		setWebApplicationList(org.getWebApplicationList());
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
