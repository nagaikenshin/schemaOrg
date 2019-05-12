package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Occupation;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class HAS_OCCUPATION implements Container.HasOccupation {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Occupation> occupationList;

	public HAS_OCCUPATION() {
	}

	public HAS_OCCUPATION(String string) {
		this(new OCCUPATION(string));
	}

	public String getString() {
		if(occupationList == null || occupationList.size() == 0 || occupationList.get(0) == null) {
			return null;
		} else {
			Name name = occupationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(occupationList == null) {
			occupationList = new ArrayList<Occupation>();
		}
		if(occupationList.size() == 0) {
			occupationList.add(new OCCUPATION(string));
		} else {
			occupationList.set(0, new OCCUPATION(string));
		}
	}

	public HAS_OCCUPATION(Occupation occupation) {
		occupationList = new ArrayList<Occupation>();
		occupationList.add(occupation);
	}

	@Override
	public Occupation getOccupation() {
		if(occupationList != null && occupationList.size() > 0) {
			return occupationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOccupation(Occupation occupation) {
		if(occupationList == null) {
			occupationList = new ArrayList<>();
		}
		if(occupationList.size() == 0) {
			occupationList.add(occupation);
		} else {
			occupationList.set(0, occupation);
		}
	}

	@Override
	public List<Occupation> getOccupationList() {
		return occupationList;
	}

	@Override
	public void setOccupationList(List<Occupation> occupationList) {
		this.occupationList = occupationList;
	}

	@Override
	public boolean hasOccupation() {
		return occupationList != null && occupationList.size() > 0 && occupationList.get(0) != null;
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
