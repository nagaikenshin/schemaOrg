package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToDirection;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToItem;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToSection;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToStep;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToSupply;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTip;
import org.kyojo.schemaorg.m3n5.core.Clazz.HowToTool;
import org.kyojo.schemaorg.m3n5.core.Clazz.ListItem;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class PREVIOUS_ITEM implements Container.PreviousItem {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<HowToDirection> howToDirectionList;
	@Transient
	public List<HowToItem> howToItemList;
	@Transient
	public List<HowToSection> howToSectionList;
	@Transient
	public List<HowToStep> howToStepList;
	@Transient
	public List<HowToSupply> howToSupplyList;
	@Transient
	public List<HowToTip> howToTipList;
	@Transient
	public List<HowToTool> howToToolList;
	@Transient
	public List<ListItem> listItemList;

	public PREVIOUS_ITEM() {
	}

	public PREVIOUS_ITEM(String string) {
		this(new LIST_ITEM(string));
	}

	public String getString() {
		if(listItemList == null || listItemList.size() == 0 || listItemList.get(0) == null) {
			return null;
		} else {
			Name name = listItemList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(listItemList == null) {
			listItemList = new ArrayList<ListItem>();
		}
		if(listItemList.size() == 0) {
			listItemList.add(new LIST_ITEM(string));
		} else {
			listItemList.set(0, new LIST_ITEM(string));
		}
	}

	public PREVIOUS_ITEM(HowToDirection howToDirection) {
		howToDirectionList = new ArrayList<HowToDirection>();
		howToDirectionList.add(howToDirection);
	}

	@Override
	public HowToDirection getHowToDirection() {
		if(howToDirectionList != null && howToDirectionList.size() > 0) {
			return howToDirectionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToDirection(HowToDirection howToDirection) {
		if(howToDirectionList == null) {
			howToDirectionList = new ArrayList<>();
		}
		if(howToDirectionList.size() == 0) {
			howToDirectionList.add(howToDirection);
		} else {
			howToDirectionList.set(0, howToDirection);
		}
	}

	@Override
	public List<HowToDirection> getHowToDirectionList() {
		return howToDirectionList;
	}

	@Override
	public void setHowToDirectionList(List<HowToDirection> howToDirectionList) {
		this.howToDirectionList = howToDirectionList;
	}

	@Override
	public boolean hasHowToDirection() {
		return howToDirectionList != null && howToDirectionList.size() > 0 && howToDirectionList.get(0) != null;
	}

	public PREVIOUS_ITEM(HowToItem howToItem) {
		howToItemList = new ArrayList<HowToItem>();
		howToItemList.add(howToItem);
	}

	@Override
	public HowToItem getHowToItem() {
		if(howToItemList != null && howToItemList.size() > 0) {
			return howToItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToItem(HowToItem howToItem) {
		if(howToItemList == null) {
			howToItemList = new ArrayList<>();
		}
		if(howToItemList.size() == 0) {
			howToItemList.add(howToItem);
		} else {
			howToItemList.set(0, howToItem);
		}
	}

	@Override
	public List<HowToItem> getHowToItemList() {
		return howToItemList;
	}

	@Override
	public void setHowToItemList(List<HowToItem> howToItemList) {
		this.howToItemList = howToItemList;
	}

	@Override
	public boolean hasHowToItem() {
		return howToItemList != null && howToItemList.size() > 0 && howToItemList.get(0) != null;
	}

	public PREVIOUS_ITEM(HowToSection howToSection) {
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

	public PREVIOUS_ITEM(HowToStep howToStep) {
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

	public PREVIOUS_ITEM(HowToSupply howToSupply) {
		howToSupplyList = new ArrayList<HowToSupply>();
		howToSupplyList.add(howToSupply);
	}

	@Override
	public HowToSupply getHowToSupply() {
		if(howToSupplyList != null && howToSupplyList.size() > 0) {
			return howToSupplyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToSupply(HowToSupply howToSupply) {
		if(howToSupplyList == null) {
			howToSupplyList = new ArrayList<>();
		}
		if(howToSupplyList.size() == 0) {
			howToSupplyList.add(howToSupply);
		} else {
			howToSupplyList.set(0, howToSupply);
		}
	}

	@Override
	public List<HowToSupply> getHowToSupplyList() {
		return howToSupplyList;
	}

	@Override
	public void setHowToSupplyList(List<HowToSupply> howToSupplyList) {
		this.howToSupplyList = howToSupplyList;
	}

	@Override
	public boolean hasHowToSupply() {
		return howToSupplyList != null && howToSupplyList.size() > 0 && howToSupplyList.get(0) != null;
	}

	public PREVIOUS_ITEM(HowToTip howToTip) {
		howToTipList = new ArrayList<HowToTip>();
		howToTipList.add(howToTip);
	}

	@Override
	public HowToTip getHowToTip() {
		if(howToTipList != null && howToTipList.size() > 0) {
			return howToTipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTip(HowToTip howToTip) {
		if(howToTipList == null) {
			howToTipList = new ArrayList<>();
		}
		if(howToTipList.size() == 0) {
			howToTipList.add(howToTip);
		} else {
			howToTipList.set(0, howToTip);
		}
	}

	@Override
	public List<HowToTip> getHowToTipList() {
		return howToTipList;
	}

	@Override
	public void setHowToTipList(List<HowToTip> howToTipList) {
		this.howToTipList = howToTipList;
	}

	@Override
	public boolean hasHowToTip() {
		return howToTipList != null && howToTipList.size() > 0 && howToTipList.get(0) != null;
	}

	public PREVIOUS_ITEM(HowToTool howToTool) {
		howToToolList = new ArrayList<HowToTool>();
		howToToolList.add(howToTool);
	}

	@Override
	public HowToTool getHowToTool() {
		if(howToToolList != null && howToToolList.size() > 0) {
			return howToToolList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setHowToTool(HowToTool howToTool) {
		if(howToToolList == null) {
			howToToolList = new ArrayList<>();
		}
		if(howToToolList.size() == 0) {
			howToToolList.add(howToTool);
		} else {
			howToToolList.set(0, howToTool);
		}
	}

	@Override
	public List<HowToTool> getHowToToolList() {
		return howToToolList;
	}

	@Override
	public void setHowToToolList(List<HowToTool> howToToolList) {
		this.howToToolList = howToToolList;
	}

	@Override
	public boolean hasHowToTool() {
		return howToToolList != null && howToToolList.size() > 0 && howToToolList.get(0) != null;
	}

	public PREVIOUS_ITEM(ListItem listItem) {
		listItemList = new ArrayList<ListItem>();
		listItemList.add(listItem);
	}

	@Override
	public ListItem getListItem() {
		if(listItemList != null && listItemList.size() > 0) {
			return listItemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setListItem(ListItem listItem) {
		if(listItemList == null) {
			listItemList = new ArrayList<>();
		}
		if(listItemList.size() == 0) {
			listItemList.add(listItem);
		} else {
			listItemList.set(0, listItem);
		}
	}

	@Override
	public List<ListItem> getListItemList() {
		return listItemList;
	}

	@Override
	public void setListItemList(List<ListItem> listItemList) {
		this.listItemList = listItemList;
	}

	@Override
	public boolean hasListItem() {
		return listItemList != null && listItemList.size() > 0 && listItemList.get(0) != null;
	}

	public PREVIOUS_ITEM(List<HowToDirection> howToDirectionList,
			List<HowToItem> howToItemList,
			List<HowToSection> howToSectionList,
			List<HowToStep> howToStepList,
			List<HowToSupply> howToSupplyList,
			List<HowToTip> howToTipList,
			List<HowToTool> howToToolList,
			List<ListItem> listItemList) {
		setHowToDirectionList(howToDirectionList);
		setHowToItemList(howToItemList);
		setHowToSectionList(howToSectionList);
		setHowToStepList(howToStepList);
		setHowToSupplyList(howToSupplyList);
		setHowToTipList(howToTipList);
		setHowToToolList(howToToolList);
		setListItemList(listItemList);
	}

	public void copy(Container.PreviousItem org) {
		setHowToDirectionList(org.getHowToDirectionList());
		setHowToItemList(org.getHowToItemList());
		setHowToSectionList(org.getHowToSectionList());
		setHowToStepList(org.getHowToStepList());
		setHowToSupplyList(org.getHowToSupplyList());
		setHowToTipList(org.getHowToTipList());
		setHowToToolList(org.getHowToToolList());
		setListItemList(org.getListItemList());
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
