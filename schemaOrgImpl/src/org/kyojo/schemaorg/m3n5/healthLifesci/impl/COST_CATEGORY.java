package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugCostCategory;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DRUG_COST_CATEGORY;

public class COST_CATEGORY implements Container.CostCategory {

	private static final long serialVersionUID = 1L;

	public List<DrugCostCategory> drugCostCategoryList;

	public COST_CATEGORY() {
	}

	public COST_CATEGORY(String string) {
		this(new DRUG_COST_CATEGORY(string));
	}

	public String getString() {
		if(drugCostCategoryList == null || drugCostCategoryList.size() == 0 || drugCostCategoryList.get(0) == null) {
			return null;
		} else {
			Name name = drugCostCategoryList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(drugCostCategoryList == null) {
			drugCostCategoryList = new ArrayList<DrugCostCategory>();
		}
		if(drugCostCategoryList.size() == 0) {
			drugCostCategoryList.add(new DRUG_COST_CATEGORY(string));
		} else {
			drugCostCategoryList.set(0, new DRUG_COST_CATEGORY(string));
		}
	}

	public COST_CATEGORY(DrugCostCategory drugCostCategory) {
		drugCostCategoryList = new ArrayList<DrugCostCategory>();
		drugCostCategoryList.add(drugCostCategory);
	}

	@Override
	public DrugCostCategory getDrugCostCategory() {
		if(drugCostCategoryList != null && drugCostCategoryList.size() > 0) {
			return drugCostCategoryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCostCategory(DrugCostCategory drugCostCategory) {
		if(drugCostCategoryList == null) {
			drugCostCategoryList = new ArrayList<>();
		}
		if(drugCostCategoryList.size() == 0) {
			drugCostCategoryList.add(drugCostCategory);
		} else {
			drugCostCategoryList.set(0, drugCostCategory);
		}
	}

	@Override
	public List<DrugCostCategory> getDrugCostCategoryList() {
		return drugCostCategoryList;
	}

	@Override
	public void setDrugCostCategoryList(List<DrugCostCategory> drugCostCategoryList) {
		this.drugCostCategoryList = drugCostCategoryList;
	}

	@Override
	public boolean hasDrugCostCategory() {
		return drugCostCategoryList != null && drugCostCategoryList.size() > 0 && drugCostCategoryList.get(0) != null;
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
