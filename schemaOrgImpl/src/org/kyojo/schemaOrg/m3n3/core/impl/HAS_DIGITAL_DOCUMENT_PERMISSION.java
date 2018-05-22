package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DigitalDocumentPermission;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class HAS_DIGITAL_DOCUMENT_PERMISSION implements Container.HasDigitalDocumentPermission {

	private static final long serialVersionUID = 1L;

	public List<DigitalDocumentPermission> digitalDocumentPermissionList;

	public HAS_DIGITAL_DOCUMENT_PERMISSION() {
	}

	public HAS_DIGITAL_DOCUMENT_PERMISSION(String string) {
		this(new DIGITAL_DOCUMENT_PERMISSION(string));
	}

	public String getString() {
		if(digitalDocumentPermissionList == null || digitalDocumentPermissionList.size() == 0 || digitalDocumentPermissionList.get(0) == null) {
			return null;
		} else {
			Name name = digitalDocumentPermissionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(digitalDocumentPermissionList == null) {
			digitalDocumentPermissionList = new ArrayList<DigitalDocumentPermission>();
		}
		if(digitalDocumentPermissionList.size() == 0) {
			digitalDocumentPermissionList.add(new DIGITAL_DOCUMENT_PERMISSION(string));
		} else {
			digitalDocumentPermissionList.set(0, new DIGITAL_DOCUMENT_PERMISSION(string));
		}
	}

	public HAS_DIGITAL_DOCUMENT_PERMISSION(DigitalDocumentPermission digitalDocumentPermission) {
		digitalDocumentPermissionList = new ArrayList<DigitalDocumentPermission>();
		digitalDocumentPermissionList.add(digitalDocumentPermission);
	}

	@Override
	public DigitalDocumentPermission getDigitalDocumentPermission() {
		if(digitalDocumentPermissionList != null && digitalDocumentPermissionList.size() > 0) {
			return digitalDocumentPermissionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocumentPermission(DigitalDocumentPermission digitalDocumentPermission) {
		if(digitalDocumentPermissionList == null) {
			digitalDocumentPermissionList = new ArrayList<>();
		}
		if(digitalDocumentPermissionList.size() == 0) {
			digitalDocumentPermissionList.add(digitalDocumentPermission);
		} else {
			digitalDocumentPermissionList.set(0, digitalDocumentPermission);
		}
	}

	@Override
	public List<DigitalDocumentPermission> getDigitalDocumentPermissionList() {
		return digitalDocumentPermissionList;
	}

	@Override
	public void setDigitalDocumentPermissionList(List<DigitalDocumentPermission> digitalDocumentPermissionList) {
		this.digitalDocumentPermissionList = digitalDocumentPermissionList;
	}

	@Override
	public boolean hasDigitalDocumentPermission() {
		return digitalDocumentPermissionList != null && digitalDocumentPermissionList.size() > 0 && digitalDocumentPermissionList.get(0) != null;
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
