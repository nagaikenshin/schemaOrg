package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.PostalAddress;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class ORIGIN_ADDRESS implements Container.OriginAddress {

	private static final long serialVersionUID = 1L;

	public List<PostalAddress> postalAddressList;

	public ORIGIN_ADDRESS() {
	}

	public ORIGIN_ADDRESS(String string) {
		this(new POSTAL_ADDRESS(string));
	}

	public String getString() {
		if(postalAddressList == null || postalAddressList.size() == 0 || postalAddressList.get(0) == null) {
			return null;
		} else {
			Name name = postalAddressList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(postalAddressList == null) {
			postalAddressList = new ArrayList<PostalAddress>();
		}
		if(postalAddressList.size() == 0) {
			postalAddressList.add(new POSTAL_ADDRESS(string));
		} else {
			postalAddressList.set(0, new POSTAL_ADDRESS(string));
		}
	}

	public ORIGIN_ADDRESS(PostalAddress postalAddress) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
