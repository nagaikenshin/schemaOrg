package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Demand;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class SEEKS implements Container.Seeks {

	private static final long serialVersionUID = 1L;

	public List<Demand> demandList;

	public SEEKS() {
	}

	public SEEKS(String string) {
		this(new DEMAND(string));
	}

	public String getString() {
		if(demandList == null || demandList.size() == 0 || demandList.get(0) == null) {
			return null;
		} else {
			Name name = demandList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(demandList == null) {
			demandList = new ArrayList<Demand>();
		}
		if(demandList.size() == 0) {
			demandList.add(new DEMAND(string));
		} else {
			demandList.set(0, new DEMAND(string));
		}
	}

	public SEEKS(Demand demand) {
		demandList = new ArrayList<Demand>();
		demandList.add(demand);
	}

	@Override
	public Demand getDemand() {
		if(demandList != null && demandList.size() > 0) {
			return demandList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDemand(Demand demand) {
		if(demandList == null) {
			demandList = new ArrayList<>();
		}
		if(demandList.size() == 0) {
			demandList.add(demand);
		} else {
			demandList.set(0, demand);
		}
	}

	@Override
	public List<Demand> getDemandList() {
		return demandList;
	}

	@Override
	public void setDemandList(List<Demand> demandList) {
		this.demandList = demandList;
	}

	@Override
	public boolean hasDemand() {
		return demandList != null && demandList.size() > 0 && demandList.get(0) != null;
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
