package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.ORGANIZATION;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class AUTHENTICATOR implements Container.Authenticator {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Organization> organizationList;

	public AUTHENTICATOR() {
	}

	public AUTHENTICATOR(String string) {
		this(new ORGANIZATION(string));
	}

	public String getString() {
		if(organizationList == null || organizationList.size() == 0 || organizationList.get(0) == null) {
			return null;
		} else {
			Name name = organizationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(organizationList == null) {
			organizationList = new ArrayList<Organization>();
		}
		if(organizationList.size() == 0) {
			organizationList.add(new ORGANIZATION(string));
		} else {
			organizationList.set(0, new ORGANIZATION(string));
		}
	}

	public AUTHENTICATOR(Organization organization) {
		organizationList = new ArrayList<Organization>();
		organizationList.add(organization);
	}

	@Override
	public Organization getOrganization() {
		if(organizationList != null && organizationList.size() > 0) {
			return organizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganization(Organization organization) {
		if(organizationList == null) {
			organizationList = new ArrayList<>();
		}
		if(organizationList.size() == 0) {
			organizationList.add(organization);
		} else {
			organizationList.set(0, organization);
		}
	}

	@Override
	public List<Organization> getOrganizationList() {
		return organizationList;
	}

	@Override
	public void setOrganizationList(List<Organization> organizationList) {
		this.organizationList = organizationList;
	}

	@Override
	public boolean hasOrganization() {
		return organizationList != null && organizationList.size() > 0 && organizationList.get(0) != null;
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
