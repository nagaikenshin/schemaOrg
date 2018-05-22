package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WarrantyPromise;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class WARRANTY implements Container.Warranty {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<WarrantyPromise> warrantyPromiseList;

	public WARRANTY() {
	}

	public WARRANTY(String string) {
		this(new WARRANTY_PROMISE(string));
	}

	public String getString() {
		if(warrantyPromiseList == null || warrantyPromiseList.size() == 0 || warrantyPromiseList.get(0) == null) {
			return null;
		} else {
			Name name = warrantyPromiseList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(warrantyPromiseList == null) {
			warrantyPromiseList = new ArrayList<WarrantyPromise>();
		}
		if(warrantyPromiseList.size() == 0) {
			warrantyPromiseList.add(new WARRANTY_PROMISE(string));
		} else {
			warrantyPromiseList.set(0, new WARRANTY_PROMISE(string));
		}
	}

	public WARRANTY(WarrantyPromise warrantyPromise) {
		warrantyPromiseList = new ArrayList<WarrantyPromise>();
		warrantyPromiseList.add(warrantyPromise);
	}

	@Override
	public WarrantyPromise getWarrantyPromise() {
		if(warrantyPromiseList != null && warrantyPromiseList.size() > 0) {
			return warrantyPromiseList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWarrantyPromise(WarrantyPromise warrantyPromise) {
		if(warrantyPromiseList == null) {
			warrantyPromiseList = new ArrayList<>();
		}
		if(warrantyPromiseList.size() == 0) {
			warrantyPromiseList.add(warrantyPromise);
		} else {
			warrantyPromiseList.set(0, warrantyPromise);
		}
	}

	@Override
	public List<WarrantyPromise> getWarrantyPromiseList() {
		return warrantyPromiseList;
	}

	@Override
	public void setWarrantyPromiseList(List<WarrantyPromise> warrantyPromiseList) {
		this.warrantyPromiseList = warrantyPromiseList;
	}

	@Override
	public boolean hasWarrantyPromise() {
		return warrantyPromiseList != null && warrantyPromiseList.size() > 0 && warrantyPromiseList.get(0) != null;
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
