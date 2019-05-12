package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.TouristAttraction;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.impl.TOURIST_ATTRACTION;
import org.kyojo.schemaorg.m3n5.pending.Container;

public class INCLUDES_ATTRACTION implements Container.IncludesAttraction {

	private static final long serialVersionUID = 1L;

	public List<TouristAttraction> touristAttractionList;

	public INCLUDES_ATTRACTION() {
	}

	public INCLUDES_ATTRACTION(String string) {
		this(new TOURIST_ATTRACTION(string));
	}

	public String getString() {
		if(touristAttractionList == null || touristAttractionList.size() == 0 || touristAttractionList.get(0) == null) {
			return null;
		} else {
			Name name = touristAttractionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(touristAttractionList == null) {
			touristAttractionList = new ArrayList<TouristAttraction>();
		}
		if(touristAttractionList.size() == 0) {
			touristAttractionList.add(new TOURIST_ATTRACTION(string));
		} else {
			touristAttractionList.set(0, new TOURIST_ATTRACTION(string));
		}
	}

	public INCLUDES_ATTRACTION(TouristAttraction touristAttraction) {
		touristAttractionList = new ArrayList<TouristAttraction>();
		touristAttractionList.add(touristAttraction);
	}

	@Override
	public TouristAttraction getTouristAttraction() {
		if(touristAttractionList != null && touristAttractionList.size() > 0) {
			return touristAttractionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristAttraction(TouristAttraction touristAttraction) {
		if(touristAttractionList == null) {
			touristAttractionList = new ArrayList<>();
		}
		if(touristAttractionList.size() == 0) {
			touristAttractionList.add(touristAttraction);
		} else {
			touristAttractionList.set(0, touristAttraction);
		}
	}

	@Override
	public List<TouristAttraction> getTouristAttractionList() {
		return touristAttractionList;
	}

	@Override
	public void setTouristAttractionList(List<TouristAttraction> touristAttractionList) {
		this.touristAttractionList = touristAttractionList;
	}

	@Override
	public boolean hasTouristAttraction() {
		return touristAttractionList != null && touristAttractionList.size() > 0 && touristAttractionList.get(0) != null;
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
