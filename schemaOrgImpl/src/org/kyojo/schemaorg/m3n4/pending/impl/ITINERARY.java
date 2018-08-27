package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.ItemList;
import org.kyojo.schemaorg.m3n4.core.Clazz.Place;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.ITEM_LIST;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class ITINERARY implements Container.Itinerary {

	private static final long serialVersionUID = 1L;

	public List<ItemList> itemListList;
	public List<Place> placeList;

	public ITINERARY() {
	}

	public ITINERARY(String string) {
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

	public ITINERARY(ItemList itemList) {
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

	public ITINERARY(Place place) {
		placeList = new ArrayList<Place>();
		placeList.add(place);
	}

	@Override
	public Place getPlace() {
		if(placeList != null && placeList.size() > 0) {
			return placeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlace(Place place) {
		if(placeList == null) {
			placeList = new ArrayList<>();
		}
		if(placeList.size() == 0) {
			placeList.add(place);
		} else {
			placeList.set(0, place);
		}
	}

	@Override
	public List<Place> getPlaceList() {
		return placeList;
	}

	@Override
	public void setPlaceList(List<Place> placeList) {
		this.placeList = placeList;
	}

	@Override
	public boolean hasPlace() {
		return placeList != null && placeList.size() > 0 && placeList.get(0) != null;
	}

	public ITINERARY(List<ItemList> itemListList,
			List<Place> placeList) {
		setItemListList(itemListList);
		setPlaceList(placeList);
	}

	public void copy(Container.Itinerary org) {
		setItemListList(org.getItemListList());
		setPlaceList(org.getPlaceList());
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
