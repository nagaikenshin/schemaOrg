package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.NutritionInformation;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class NUTRITION implements Container.Nutrition {

	private static final long serialVersionUID = 1L;

	public List<NutritionInformation> nutritionInformationList;

	public NUTRITION() {
	}

	public NUTRITION(String string) {
		this(new NUTRITION_INFORMATION(string));
	}

	public String getString() {
		if(nutritionInformationList == null || nutritionInformationList.size() == 0 || nutritionInformationList.get(0) == null) {
			return null;
		} else {
			Name name = nutritionInformationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(nutritionInformationList == null) {
			nutritionInformationList = new ArrayList<NutritionInformation>();
		}
		if(nutritionInformationList.size() == 0) {
			nutritionInformationList.add(new NUTRITION_INFORMATION(string));
		} else {
			nutritionInformationList.set(0, new NUTRITION_INFORMATION(string));
		}
	}

	public NUTRITION(NutritionInformation nutritionInformation) {
		nutritionInformationList = new ArrayList<NutritionInformation>();
		nutritionInformationList.add(nutritionInformation);
	}

	@Override
	public NutritionInformation getNutritionInformation() {
		if(nutritionInformationList != null && nutritionInformationList.size() > 0) {
			return nutritionInformationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNutritionInformation(NutritionInformation nutritionInformation) {
		if(nutritionInformationList == null) {
			nutritionInformationList = new ArrayList<>();
		}
		if(nutritionInformationList.size() == 0) {
			nutritionInformationList.add(nutritionInformation);
		} else {
			nutritionInformationList.set(0, nutritionInformation);
		}
	}

	@Override
	public List<NutritionInformation> getNutritionInformationList() {
		return nutritionInformationList;
	}

	@Override
	public void setNutritionInformationList(List<NutritionInformation> nutritionInformationList) {
		this.nutritionInformationList = nutritionInformationList;
	}

	@Override
	public boolean hasNutritionInformation() {
		return nutritionInformationList != null && nutritionInformationList.size() > 0 && nutritionInformationList.get(0) != null;
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
