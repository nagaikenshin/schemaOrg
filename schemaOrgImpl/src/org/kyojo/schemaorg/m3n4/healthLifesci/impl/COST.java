package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugCost;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG_COST;

public class COST implements Container.Cost {

	private static final long serialVersionUID = 1L;

	public List<DrugCost> drugCostList;

	public COST() {
	}

	public COST(String string) {
		this(new DRUG_COST(string));
	}

	public String getString() {
		if(drugCostList == null || drugCostList.size() == 0 || drugCostList.get(0) == null) {
			return null;
		} else {
			Name name = drugCostList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(drugCostList == null) {
			drugCostList = new ArrayList<DrugCost>();
		}
		if(drugCostList.size() == 0) {
			drugCostList.add(new DRUG_COST(string));
		} else {
			drugCostList.set(0, new DRUG_COST(string));
		}
	}

	public COST(DrugCost drugCost) {
		drugCostList = new ArrayList<DrugCost>();
		drugCostList.add(drugCost);
	}

	@Override
	public DrugCost getDrugCost() {
		if(drugCostList != null && drugCostList.size() > 0) {
			return drugCostList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugCost(DrugCost drugCost) {
		if(drugCostList == null) {
			drugCostList = new ArrayList<>();
		}
		if(drugCostList.size() == 0) {
			drugCostList.add(drugCost);
		} else {
			drugCostList.set(0, drugCost);
		}
	}

	@Override
	public List<DrugCost> getDrugCostList() {
		return drugCostList;
	}

	@Override
	public void setDrugCostList(List<DrugCost> drugCostList) {
		this.drugCostList = drugCostList;
	}

	@Override
	public boolean hasDrugCost() {
		return drugCostList != null && drugCostList.size() > 0 && drugCostList.get(0) != null;
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
