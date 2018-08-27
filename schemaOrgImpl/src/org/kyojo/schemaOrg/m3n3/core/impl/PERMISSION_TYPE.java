package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.DigitalDocumentPermissionType;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class PERMISSION_TYPE implements Container.PermissionType {

	private static final long serialVersionUID = 1L;

	public List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList;

	public PERMISSION_TYPE() {
	}

	public PERMISSION_TYPE(String string) {
		this(new DIGITAL_DOCUMENT_PERMISSION_TYPE(string));
	}

	public String getString() {
		if(digitalDocumentPermissionTypeList == null || digitalDocumentPermissionTypeList.size() == 0 || digitalDocumentPermissionTypeList.get(0) == null) {
			return null;
		} else {
			Name name = digitalDocumentPermissionTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(digitalDocumentPermissionTypeList == null) {
			digitalDocumentPermissionTypeList = new ArrayList<DigitalDocumentPermissionType>();
		}
		if(digitalDocumentPermissionTypeList.size() == 0) {
			digitalDocumentPermissionTypeList.add(new DIGITAL_DOCUMENT_PERMISSION_TYPE(string));
		} else {
			digitalDocumentPermissionTypeList.set(0, new DIGITAL_DOCUMENT_PERMISSION_TYPE(string));
		}
	}

	public PERMISSION_TYPE(DigitalDocumentPermissionType digitalDocumentPermissionType) {
		digitalDocumentPermissionTypeList = new ArrayList<DigitalDocumentPermissionType>();
		digitalDocumentPermissionTypeList.add(digitalDocumentPermissionType);
	}

	@Override
	public DigitalDocumentPermissionType getDigitalDocumentPermissionType() {
		if(digitalDocumentPermissionTypeList != null && digitalDocumentPermissionTypeList.size() > 0) {
			return digitalDocumentPermissionTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDigitalDocumentPermissionType(DigitalDocumentPermissionType digitalDocumentPermissionType) {
		if(digitalDocumentPermissionTypeList == null) {
			digitalDocumentPermissionTypeList = new ArrayList<>();
		}
		if(digitalDocumentPermissionTypeList.size() == 0) {
			digitalDocumentPermissionTypeList.add(digitalDocumentPermissionType);
		} else {
			digitalDocumentPermissionTypeList.set(0, digitalDocumentPermissionType);
		}
	}

	@Override
	public List<DigitalDocumentPermissionType> getDigitalDocumentPermissionTypeList() {
		return digitalDocumentPermissionTypeList;
	}

	@Override
	public void setDigitalDocumentPermissionTypeList(List<DigitalDocumentPermissionType> digitalDocumentPermissionTypeList) {
		this.digitalDocumentPermissionTypeList = digitalDocumentPermissionTypeList;
	}

	@Override
	public boolean hasDigitalDocumentPermissionType() {
		return digitalDocumentPermissionTypeList != null && digitalDocumentPermissionTypeList.size() > 0 && digitalDocumentPermissionTypeList.get(0) != null;
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
