package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CategoryCode;
import org.kyojo.schemaorg.m3n4.pending.Clazz.DefinedTerm;
import org.kyojo.schemaorg.m3n4.pending.Container;
import org.kyojo.schemaorg.m3n4.pending.impl.CATEGORY_CODE;

public class HAS_CATEGORY_CODE implements Container.HasCategoryCode {

	private static final long serialVersionUID = 1L;

	public List<CategoryCode> categoryCodeList;
	public List<CreativeWork> creativeWorkList;
	public List<DefinedTerm> definedTermList;
	public List<Trip> tripList;

	public HAS_CATEGORY_CODE() {
	}

	public HAS_CATEGORY_CODE(String string) {
		this(new CATEGORY_CODE(string));
	}

	public String getString() {
		if(categoryCodeList == null || categoryCodeList.size() == 0 || categoryCodeList.get(0) == null) {
			return null;
		} else {
			Name name = categoryCodeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(categoryCodeList == null) {
			categoryCodeList = new ArrayList<CategoryCode>();
		}
		if(categoryCodeList.size() == 0) {
			categoryCodeList.add(new CATEGORY_CODE(string));
		} else {
			categoryCodeList.set(0, new CATEGORY_CODE(string));
		}
	}

	public HAS_CATEGORY_CODE(CategoryCode categoryCode) {
		categoryCodeList = new ArrayList<CategoryCode>();
		categoryCodeList.add(categoryCode);
	}

	@Override
	public CategoryCode getCategoryCode() {
		if(categoryCodeList != null && categoryCodeList.size() > 0) {
			return categoryCodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCategoryCode(CategoryCode categoryCode) {
		if(categoryCodeList == null) {
			categoryCodeList = new ArrayList<>();
		}
		if(categoryCodeList.size() == 0) {
			categoryCodeList.add(categoryCode);
		} else {
			categoryCodeList.set(0, categoryCode);
		}
	}

	@Override
	public List<CategoryCode> getCategoryCodeList() {
		return categoryCodeList;
	}

	@Override
	public void setCategoryCodeList(List<CategoryCode> categoryCodeList) {
		this.categoryCodeList = categoryCodeList;
	}

	@Override
	public boolean hasCategoryCode() {
		return categoryCodeList != null && categoryCodeList.size() > 0 && categoryCodeList.get(0) != null;
	}

	public HAS_CATEGORY_CODE(CreativeWork creativeWork) {
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

	public HAS_CATEGORY_CODE(DefinedTerm definedTerm) {
		definedTermList = new ArrayList<DefinedTerm>();
		definedTermList.add(definedTerm);
	}

	@Override
	public DefinedTerm getDefinedTerm() {
		if(definedTermList != null && definedTermList.size() > 0) {
			return definedTermList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDefinedTerm(DefinedTerm definedTerm) {
		if(definedTermList == null) {
			definedTermList = new ArrayList<>();
		}
		if(definedTermList.size() == 0) {
			definedTermList.add(definedTerm);
		} else {
			definedTermList.set(0, definedTerm);
		}
	}

	@Override
	public List<DefinedTerm> getDefinedTermList() {
		return definedTermList;
	}

	@Override
	public void setDefinedTermList(List<DefinedTerm> definedTermList) {
		this.definedTermList = definedTermList;
	}

	@Override
	public boolean hasDefinedTerm() {
		return definedTermList != null && definedTermList.size() > 0 && definedTermList.get(0) != null;
	}

	public HAS_CATEGORY_CODE(Trip trip) {
		tripList = new ArrayList<Trip>();
		tripList.add(trip);
	}

	@Override
	public Trip getTrip() {
		if(tripList != null && tripList.size() > 0) {
			return tripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrip(Trip trip) {
		if(tripList == null) {
			tripList = new ArrayList<>();
		}
		if(tripList.size() == 0) {
			tripList.add(trip);
		} else {
			tripList.set(0, trip);
		}
	}

	@Override
	public List<Trip> getTripList() {
		return tripList;
	}

	@Override
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	@Override
	public boolean hasTrip() {
		return tripList != null && tripList.size() > 0 && tripList.get(0) != null;
	}

	public HAS_CATEGORY_CODE(List<CategoryCode> categoryCodeList,
			List<CreativeWork> creativeWorkList,
			List<DefinedTerm> definedTermList,
			List<Trip> tripList) {
		setCategoryCodeList(categoryCodeList);
		setCreativeWorkList(creativeWorkList);
		setDefinedTermList(definedTermList);
		setTripList(tripList);
	}

	public void copy(Container.HasCategoryCode org) {
		setCategoryCodeList(org.getCategoryCodeList());
		setCreativeWorkList(org.getCreativeWorkList());
		setDefinedTermList(org.getDefinedTermList());
		setTripList(org.getTripList());
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
