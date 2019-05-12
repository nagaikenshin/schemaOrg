package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPoint;
import org.kyojo.schemaorg.m3n5.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class SERVICE_SMS_NUMBER implements Container.ServiceSmsNumber {

	private static final long serialVersionUID = 1L;

	public List<ContactPoint> contactPointList;
	public List<PostalAddress> postalAddressList;

	public SERVICE_SMS_NUMBER() {
	}

	public SERVICE_SMS_NUMBER(String string) {
		this(new CONTACT_POINT(string));
	}

	public String getString() {
		if(contactPointList == null || contactPointList.size() == 0 || contactPointList.get(0) == null) {
			return null;
		} else {
			Name name = contactPointList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(contactPointList == null) {
			contactPointList = new ArrayList<ContactPoint>();
		}
		if(contactPointList.size() == 0) {
			contactPointList.add(new CONTACT_POINT(string));
		} else {
			contactPointList.set(0, new CONTACT_POINT(string));
		}
	}

	public SERVICE_SMS_NUMBER(ContactPoint contactPoint) {
		contactPointList = new ArrayList<ContactPoint>();
		contactPointList.add(contactPoint);
	}

	@Override
	public ContactPoint getContactPoint() {
		if(contactPointList != null && contactPointList.size() > 0) {
			return contactPointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setContactPoint(ContactPoint contactPoint) {
		if(contactPointList == null) {
			contactPointList = new ArrayList<>();
		}
		if(contactPointList.size() == 0) {
			contactPointList.add(contactPoint);
		} else {
			contactPointList.set(0, contactPoint);
		}
	}

	@Override
	public List<ContactPoint> getContactPointList() {
		return contactPointList;
	}

	@Override
	public void setContactPointList(List<ContactPoint> contactPointList) {
		this.contactPointList = contactPointList;
	}

	@Override
	public boolean hasContactPoint() {
		return contactPointList != null && contactPointList.size() > 0 && contactPointList.get(0) != null;
	}

	public SERVICE_SMS_NUMBER(PostalAddress postalAddress) {
		postalAddressList = new ArrayList<PostalAddress>();
		postalAddressList.add(postalAddress);
	}

	@Override
	public PostalAddress getPostalAddress() {
		if(postalAddressList != null && postalAddressList.size() > 0) {
			return postalAddressList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPostalAddress(PostalAddress postalAddress) {
		if(postalAddressList == null) {
			postalAddressList = new ArrayList<>();
		}
		if(postalAddressList.size() == 0) {
			postalAddressList.add(postalAddress);
		} else {
			postalAddressList.set(0, postalAddress);
		}
	}

	@Override
	public List<PostalAddress> getPostalAddressList() {
		return postalAddressList;
	}

	@Override
	public void setPostalAddressList(List<PostalAddress> postalAddressList) {
		this.postalAddressList = postalAddressList;
	}

	@Override
	public boolean hasPostalAddress() {
		return postalAddressList != null && postalAddressList.size() > 0 && postalAddressList.get(0) != null;
	}

	public SERVICE_SMS_NUMBER(List<ContactPoint> contactPointList,
			List<PostalAddress> postalAddressList) {
		setContactPointList(contactPointList);
		setPostalAddressList(postalAddressList);
	}

	public void copy(Container.ServiceSmsNumber org) {
		setContactPointList(org.getContactPointList());
		setPostalAddressList(org.getPostalAddressList());
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
