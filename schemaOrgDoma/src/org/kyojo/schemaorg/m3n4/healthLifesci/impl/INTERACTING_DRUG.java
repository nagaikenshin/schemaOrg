package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Drug;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DRUG;

import org.seasar.doma.Transient;

public class INTERACTING_DRUG implements Container.InteractingDrug {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Drug> drugList;

	public INTERACTING_DRUG() {
	}

	public INTERACTING_DRUG(String string) {
		this(new DRUG(string));
	}

	public String getString() {
		if(drugList == null || drugList.size() == 0 || drugList.get(0) == null) {
			return null;
		} else {
			Name name = drugList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(drugList == null) {
			drugList = new ArrayList<Drug>();
		}
		if(drugList.size() == 0) {
			drugList.add(new DRUG(string));
		} else {
			drugList.set(0, new DRUG(string));
		}
	}

	public INTERACTING_DRUG(Drug drug) {
		drugList = new ArrayList<Drug>();
		drugList.add(drug);
	}

	@Override
	public Drug getDrug() {
		if(drugList != null && drugList.size() > 0) {
			return drugList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrug(Drug drug) {
		if(drugList == null) {
			drugList = new ArrayList<>();
		}
		if(drugList.size() == 0) {
			drugList.add(drug);
		} else {
			drugList.set(0, drug);
		}
	}

	@Override
	public List<Drug> getDrugList() {
		return drugList;
	}

	@Override
	public void setDrugList(List<Drug> drugList) {
		this.drugList = drugList;
	}

	@Override
	public boolean hasDrug() {
		return drugList != null && drugList.size() > 0 && drugList.get(0) != null;
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
