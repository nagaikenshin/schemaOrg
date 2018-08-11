package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPointOption;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class CONTACT_OPTION implements Container.ContactOption {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ContactPointOption> contactPointOptionList;

	public CONTACT_OPTION() {
	}

	public CONTACT_OPTION(String string) {
		this(new CONTACT_POINT_OPTION(string));
	}

	public String getString() {
		if(contactPointOptionList == null || contactPointOptionList.size() == 0 || contactPointOptionList.get(0) == null) {
			return null;
		} else {
			Name name = contactPointOptionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(contactPointOptionList == null) {
			contactPointOptionList = new ArrayList<ContactPointOption>();
		}
		if(contactPointOptionList.size() == 0) {
			contactPointOptionList.add(new CONTACT_POINT_OPTION(string));
		} else {
			contactPointOptionList.set(0, new CONTACT_POINT_OPTION(string));
		}
	}

	public CONTACT_OPTION(ContactPointOption contactPointOption) {
		contactPointOptionList = new ArrayList<ContactPointOption>();
		contactPointOptionList.add(contactPointOption);
	}

	@Override
	public ContactPointOption getContactPointOption() {
		if(contactPointOptionList != null && contactPointOptionList.size() > 0) {
			return contactPointOptionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPointOption(ContactPointOption contactPointOption) {
		if(contactPointOptionList == null) {
			contactPointOptionList = new ArrayList<>();
		}
		if(contactPointOptionList.size() == 0) {
			contactPointOptionList.add(contactPointOption);
		} else {
			contactPointOptionList.set(0, contactPointOption);
		}
	}

	@Override
	public List<ContactPointOption> getContactPointOptionList() {
		return contactPointOptionList;
	}

	@Override
	public void setContactPointOptionList(List<ContactPointOption> contactPointOptionList) {
		this.contactPointOptionList = contactPointOptionList;
	}

	@Override
	public boolean hasContactPointOption() {
		return contactPointOptionList != null && contactPointOptionList.size() > 0 && contactPointOptionList.get(0) != null;
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
