package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.Diet;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIET;

import org.seasar.doma.Transient;

public class EXERCISE_RELATED_DIET implements Container.ExerciseRelatedDiet {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Diet> dietList;
	@Transient
	public List<Thing> thingList;

	public EXERCISE_RELATED_DIET() {
	}

	public EXERCISE_RELATED_DIET(String string) {
		this(new DIET(string));
	}

	public String getString() {
		if(dietList == null || dietList.size() == 0 || dietList.get(0) == null) {
			return null;
		} else {
			Name name = dietList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(dietList == null) {
			dietList = new ArrayList<Diet>();
		}
		if(dietList.size() == 0) {
			dietList.add(new DIET(string));
		} else {
			dietList.set(0, new DIET(string));
		}
	}

	public EXERCISE_RELATED_DIET(Diet diet) {
		dietList = new ArrayList<Diet>();
		dietList.add(diet);
	}

	@Override
	public Diet getDiet() {
		if(dietList != null && dietList.size() > 0) {
			return dietList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiet(Diet diet) {
		if(dietList == null) {
			dietList = new ArrayList<>();
		}
		if(dietList.size() == 0) {
			dietList.add(diet);
		} else {
			dietList.set(0, diet);
		}
	}

	@Override
	public List<Diet> getDietList() {
		return dietList;
	}

	@Override
	public void setDietList(List<Diet> dietList) {
		this.dietList = dietList;
	}

	@Override
	public boolean hasDiet() {
		return dietList != null && dietList.size() > 0 && dietList.get(0) != null;
	}

	public EXERCISE_RELATED_DIET(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public EXERCISE_RELATED_DIET(List<Diet> dietList,
			List<Thing> thingList) {
		setDietList(dietList);
		setThingList(thingList);
	}

	public void copy(Container.ExerciseRelatedDiet org) {
		setDietList(org.getDietList());
		setThingList(org.getThingList());
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
