package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DDxElement;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;
import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DDX_ELEMENT;

public class DIFFERENTIAL_DIAGNOSIS implements Container.DifferentialDiagnosis {

	private static final long serialVersionUID = 1L;

	public List<DDxElement> ddxElementList;

	public DIFFERENTIAL_DIAGNOSIS() {
	}

	public DIFFERENTIAL_DIAGNOSIS(String string) {
		this(new DDX_ELEMENT(string));
	}

	public String getString() {
		if(ddxElementList == null || ddxElementList.size() == 0 || ddxElementList.get(0) == null) {
			return null;
		} else {
			Name name = ddxElementList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(ddxElementList == null) {
			ddxElementList = new ArrayList<DDxElement>();
		}
		if(ddxElementList.size() == 0) {
			ddxElementList.add(new DDX_ELEMENT(string));
		} else {
			ddxElementList.set(0, new DDX_ELEMENT(string));
		}
	}

	public DIFFERENTIAL_DIAGNOSIS(DDxElement ddxElement) {
		ddxElementList = new ArrayList<DDxElement>();
		ddxElementList.add(ddxElement);
	}

	@Override
	public DDxElement getDDxElement() {
		if(ddxElementList != null && ddxElementList.size() > 0) {
			return ddxElementList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDDxElement(DDxElement ddxElement) {
		if(ddxElementList == null) {
			ddxElementList = new ArrayList<>();
		}
		if(ddxElementList.size() == 0) {
			ddxElementList.add(ddxElement);
		} else {
			ddxElementList.set(0, ddxElement);
		}
	}

	@Override
	public List<DDxElement> getDDxElementList() {
		return ddxElementList;
	}

	@Override
	public void setDDxElementList(List<DDxElement> ddxElementList) {
		this.ddxElementList = ddxElementList;
	}

	@Override
	public boolean hasDDxElement() {
		return ddxElementList != null && ddxElementList.size() > 0 && ddxElementList.get(0) != null;
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
