package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LegalForceStatus;
import org.kyojo.schemaOrg.m3n3.pending.Container;
import org.kyojo.schemaOrg.m3n3.pending.impl.LEGAL_FORCE_STATUS;

import org.seasar.doma.Transient;

public class LEGISLATION_LEGAL_FORCE implements Container.LegislationLegalForce {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<LegalForceStatus> legalForceStatusList;

	public LEGISLATION_LEGAL_FORCE() {
	}

	public LEGISLATION_LEGAL_FORCE(String string) {
		this(new LEGAL_FORCE_STATUS(string));
	}

	public String getString() {
		if(legalForceStatusList == null || legalForceStatusList.size() == 0 || legalForceStatusList.get(0) == null) {
			return null;
		} else {
			Name name = legalForceStatusList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(legalForceStatusList == null) {
			legalForceStatusList = new ArrayList<LegalForceStatus>();
		}
		if(legalForceStatusList.size() == 0) {
			legalForceStatusList.add(new LEGAL_FORCE_STATUS(string));
		} else {
			legalForceStatusList.set(0, new LEGAL_FORCE_STATUS(string));
		}
	}

	public LEGISLATION_LEGAL_FORCE(LegalForceStatus legalForceStatus) {
		legalForceStatusList = new ArrayList<LegalForceStatus>();
		legalForceStatusList.add(legalForceStatus);
	}

	@Override
	public LegalForceStatus getLegalForceStatus() {
		if(legalForceStatusList != null && legalForceStatusList.size() > 0) {
			return legalForceStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLegalForceStatus(LegalForceStatus legalForceStatus) {
		if(legalForceStatusList == null) {
			legalForceStatusList = new ArrayList<>();
		}
		if(legalForceStatusList.size() == 0) {
			legalForceStatusList.add(legalForceStatus);
		} else {
			legalForceStatusList.set(0, legalForceStatus);
		}
	}

	@Override
	public List<LegalForceStatus> getLegalForceStatusList() {
		return legalForceStatusList;
	}

	@Override
	public void setLegalForceStatusList(List<LegalForceStatus> legalForceStatusList) {
		this.legalForceStatusList = legalForceStatusList;
	}

	@Override
	public boolean hasLegalForceStatus() {
		return legalForceStatusList != null && legalForceStatusList.size() > 0 && legalForceStatusList.get(0) != null;
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
