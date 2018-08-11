package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LegalValueLevel;
import org.kyojo.schemaOrg.m3n3.pending.Container;
import org.kyojo.schemaOrg.m3n3.pending.impl.LEGAL_VALUE_LEVEL;

import org.seasar.doma.Transient;

public class LEGISLATION_LEGAL_VALUE implements Container.LegislationLegalValue {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<LegalValueLevel> legalValueLevelList;

	public LEGISLATION_LEGAL_VALUE() {
	}

	public LEGISLATION_LEGAL_VALUE(String string) {
		this(new LEGAL_VALUE_LEVEL(string));
	}

	public String getString() {
		if(legalValueLevelList == null || legalValueLevelList.size() == 0 || legalValueLevelList.get(0) == null) {
			return null;
		} else {
			Name name = legalValueLevelList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(legalValueLevelList == null) {
			legalValueLevelList = new ArrayList<LegalValueLevel>();
		}
		if(legalValueLevelList.size() == 0) {
			legalValueLevelList.add(new LEGAL_VALUE_LEVEL(string));
		} else {
			legalValueLevelList.set(0, new LEGAL_VALUE_LEVEL(string));
		}
	}

	public LEGISLATION_LEGAL_VALUE(LegalValueLevel legalValueLevel) {
		legalValueLevelList = new ArrayList<LegalValueLevel>();
		legalValueLevelList.add(legalValueLevel);
	}

	@Override
	public LegalValueLevel getLegalValueLevel() {
		if(legalValueLevelList != null && legalValueLevelList.size() > 0) {
			return legalValueLevelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegalValueLevel(LegalValueLevel legalValueLevel) {
		if(legalValueLevelList == null) {
			legalValueLevelList = new ArrayList<>();
		}
		if(legalValueLevelList.size() == 0) {
			legalValueLevelList.add(legalValueLevel);
		} else {
			legalValueLevelList.set(0, legalValueLevel);
		}
	}

	@Override
	public List<LegalValueLevel> getLegalValueLevelList() {
		return legalValueLevelList;
	}

	@Override
	public void setLegalValueLevelList(List<LegalValueLevel> legalValueLevelList) {
		this.legalValueLevelList = legalValueLevelList;
	}

	@Override
	public boolean hasLegalValueLevel() {
		return legalValueLevelList != null && legalValueLevelList.size() > 0 && legalValueLevelList.get(0) != null;
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
