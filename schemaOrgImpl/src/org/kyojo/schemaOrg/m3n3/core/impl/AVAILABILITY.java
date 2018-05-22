package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ItemAvailability;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class AVAILABILITY implements Container.Availability {

	private static final long serialVersionUID = 1L;

	public List<ItemAvailability> itemAvailabilityList;

	public AVAILABILITY() {
	}

	public AVAILABILITY(String string) {
		this(new ITEM_AVAILABILITY(string));
	}

	public String getString() {
		if(itemAvailabilityList == null || itemAvailabilityList.size() == 0 || itemAvailabilityList.get(0) == null) {
			return null;
		} else {
			Name name = itemAvailabilityList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(itemAvailabilityList == null) {
			itemAvailabilityList = new ArrayList<ItemAvailability>();
		}
		if(itemAvailabilityList.size() == 0) {
			itemAvailabilityList.add(new ITEM_AVAILABILITY(string));
		} else {
			itemAvailabilityList.set(0, new ITEM_AVAILABILITY(string));
		}
	}

	public AVAILABILITY(ItemAvailability itemAvailability) {
		itemAvailabilityList = new ArrayList<ItemAvailability>();
		itemAvailabilityList.add(itemAvailability);
	}

	@Override
	public ItemAvailability getItemAvailability() {
		if(itemAvailabilityList != null && itemAvailabilityList.size() > 0) {
			return itemAvailabilityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setItemAvailability(ItemAvailability itemAvailability) {
		if(itemAvailabilityList == null) {
			itemAvailabilityList = new ArrayList<>();
		}
		if(itemAvailabilityList.size() == 0) {
			itemAvailabilityList.add(itemAvailability);
		} else {
			itemAvailabilityList.set(0, itemAvailability);
		}
	}

	@Override
	public List<ItemAvailability> getItemAvailabilityList() {
		return itemAvailabilityList;
	}

	@Override
	public void setItemAvailabilityList(List<ItemAvailability> itemAvailabilityList) {
		this.itemAvailabilityList = itemAvailabilityList;
	}

	@Override
	public boolean hasItemAvailability() {
		return itemAvailabilityList != null && itemAvailabilityList.size() > 0 && itemAvailabilityList.get(0) != null;
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
