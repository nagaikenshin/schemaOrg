package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BreadcrumbList;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n4.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicRecording;
import org.kyojo.schemaorg.m3n4.core.Clazz.OfferCatalog;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class TRACK implements Container.Track {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BreadcrumbList> breadcrumbListList;
	@Transient
	public List<HowToSection> howToSectionList;
	@Transient
	public List<HowToStep> howToStepList;
	@Transient
	public List<ItemList> itemListList;
	@Transient
	public List<MusicRecording> musicRecordingList;
	@Transient
	public List<OfferCatalog> offerCatalogList;

	public TRACK() {
	}

	public TRACK(String string) {
		this(new ITEM_LIST(string));
	}

	public String getString() {
		if(itemListList == null || itemListList.size() == 0 || itemListList.get(0) == null) {
			return null;
		} else {
			Name name = itemListList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(itemListList == null) {
			itemListList = new ArrayList<ItemList>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(new ITEM_LIST(string));
		} else {
			itemListList.set(0, new ITEM_LIST(string));
		}
	}

	public TRACK(BreadcrumbList breadcrumbList) {
		breadcrumbListList = new ArrayList<BreadcrumbList>();
		breadcrumbListList.add(breadcrumbList);
	}

	@Override
	public BreadcrumbList getBreadcrumbList() {
		if(breadcrumbListList != null && breadcrumbListList.size() > 0) {
			return breadcrumbListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBreadcrumbList(BreadcrumbList breadcrumbList) {
		if(breadcrumbListList == null) {
			breadcrumbListList = new ArrayList<>();
		}
		if(breadcrumbListList.size() == 0) {
			breadcrumbListList.add(breadcrumbList);
		} else {
			breadcrumbListList.set(0, breadcrumbList);
		}
	}

	@Override
	public List<BreadcrumbList> getBreadcrumbListList() {
		return breadcrumbListList;
	}

	@Override
	public void setBreadcrumbListList(List<BreadcrumbList> breadcrumbListList) {
		this.breadcrumbListList = breadcrumbListList;
	}

	@Override
	public boolean hasBreadcrumbList() {
		return breadcrumbListList != null && breadcrumbListList.size() > 0 && breadcrumbListList.get(0) != null;
	}

	public TRACK(HowToSection howToSection) {
		howToSectionList = new ArrayList<HowToSection>();
		howToSectionList.add(howToSection);
	}

	@Override
	public HowToSection getHowToSection() {
		if(howToSectionList != null && howToSectionList.size() > 0) {
			return howToSectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSection(HowToSection howToSection) {
		if(howToSectionList == null) {
			howToSectionList = new ArrayList<>();
		}
		if(howToSectionList.size() == 0) {
			howToSectionList.add(howToSection);
		} else {
			howToSectionList.set(0, howToSection);
		}
	}

	@Override
	public List<HowToSection> getHowToSectionList() {
		return howToSectionList;
	}

	@Override
	public void setHowToSectionList(List<HowToSection> howToSectionList) {
		this.howToSectionList = howToSectionList;
	}

	@Override
	public boolean hasHowToSection() {
		return howToSectionList != null && howToSectionList.size() > 0 && howToSectionList.get(0) != null;
	}

	public TRACK(HowToStep howToStep) {
		howToStepList = new ArrayList<HowToStep>();
		howToStepList.add(howToStep);
	}

	@Override
	public HowToStep getHowToStep() {
		if(howToStepList != null && howToStepList.size() > 0) {
			return howToStepList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToStep(HowToStep howToStep) {
		if(howToStepList == null) {
			howToStepList = new ArrayList<>();
		}
		if(howToStepList.size() == 0) {
			howToStepList.add(howToStep);
		} else {
			howToStepList.set(0, howToStep);
		}
	}

	@Override
	public List<HowToStep> getHowToStepList() {
		return howToStepList;
	}

	@Override
	public void setHowToStepList(List<HowToStep> howToStepList) {
		this.howToStepList = howToStepList;
	}

	@Override
	public boolean hasHowToStep() {
		return howToStepList != null && howToStepList.size() > 0 && howToStepList.get(0) != null;
	}

	public TRACK(ItemList itemList) {
		itemListList = new ArrayList<ItemList>();
		itemListList.add(itemList);
	}

	@Override
	public ItemList getItemList() {
		if(itemListList != null && itemListList.size() > 0) {
			return itemListList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemList(ItemList itemList) {
		if(itemListList == null) {
			itemListList = new ArrayList<>();
		}
		if(itemListList.size() == 0) {
			itemListList.add(itemList);
		} else {
			itemListList.set(0, itemList);
		}
	}

	@Override
	public List<ItemList> getItemListList() {
		return itemListList;
	}

	@Override
	public void setItemListList(List<ItemList> itemListList) {
		this.itemListList = itemListList;
	}

	@Override
	public boolean hasItemList() {
		return itemListList != null && itemListList.size() > 0 && itemListList.get(0) != null;
	}

	public TRACK(MusicRecording musicRecording) {
		musicRecordingList = new ArrayList<MusicRecording>();
		musicRecordingList.add(musicRecording);
	}

	@Override
	public MusicRecording getMusicRecording() {
		if(musicRecordingList != null && musicRecordingList.size() > 0) {
			return musicRecordingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicRecording(MusicRecording musicRecording) {
		if(musicRecordingList == null) {
			musicRecordingList = new ArrayList<>();
		}
		if(musicRecordingList.size() == 0) {
			musicRecordingList.add(musicRecording);
		} else {
			musicRecordingList.set(0, musicRecording);
		}
	}

	@Override
	public List<MusicRecording> getMusicRecordingList() {
		return musicRecordingList;
	}

	@Override
	public void setMusicRecordingList(List<MusicRecording> musicRecordingList) {
		this.musicRecordingList = musicRecordingList;
	}

	@Override
	public boolean hasMusicRecording() {
		return musicRecordingList != null && musicRecordingList.size() > 0 && musicRecordingList.get(0) != null;
	}

	public TRACK(OfferCatalog offerCatalog) {
		offerCatalogList = new ArrayList<OfferCatalog>();
		offerCatalogList.add(offerCatalog);
	}

	@Override
	public OfferCatalog getOfferCatalog() {
		if(offerCatalogList != null && offerCatalogList.size() > 0) {
			return offerCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOfferCatalog(OfferCatalog offerCatalog) {
		if(offerCatalogList == null) {
			offerCatalogList = new ArrayList<>();
		}
		if(offerCatalogList.size() == 0) {
			offerCatalogList.add(offerCatalog);
		} else {
			offerCatalogList.set(0, offerCatalog);
		}
	}

	@Override
	public List<OfferCatalog> getOfferCatalogList() {
		return offerCatalogList;
	}

	@Override
	public void setOfferCatalogList(List<OfferCatalog> offerCatalogList) {
		this.offerCatalogList = offerCatalogList;
	}

	@Override
	public boolean hasOfferCatalog() {
		return offerCatalogList != null && offerCatalogList.size() > 0 && offerCatalogList.get(0) != null;
	}

	public TRACK(List<BreadcrumbList> breadcrumbListList,
			List<HowToSection> howToSectionList,
			List<HowToStep> howToStepList,
			List<ItemList> itemListList,
			List<MusicRecording> musicRecordingList,
			List<OfferCatalog> offerCatalogList) {
		setBreadcrumbListList(breadcrumbListList);
		setHowToSectionList(howToSectionList);
		setHowToStepList(howToStepList);
		setItemListList(itemListList);
		setMusicRecordingList(musicRecordingList);
		setOfferCatalogList(offerCatalogList);
	}

	public void copy(Container.Track org) {
		setBreadcrumbListList(org.getBreadcrumbListList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
		setItemListList(org.getItemListList());
		setMusicRecordingList(org.getMusicRecordingList());
		setOfferCatalogList(org.getOfferCatalogList());
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
