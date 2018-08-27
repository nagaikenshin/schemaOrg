package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalOrganization;
import org.kyojo.schemaorg.m3n4.core.Clazz.Organization;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class ALUMNI_OF implements Container.AlumniOf {

	private static final long serialVersionUID = 1L;

	public List<EducationalOrganization> educationalOrganizationList;
	public List<Organization> organizationList;

	public ALUMNI_OF() {
	}

	public ALUMNI_OF(String string) {
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

	public ALUMNI_OF(EducationalOrganization educationalOrganization) {
		educationalOrganizationList = new ArrayList<EducationalOrganization>();
		educationalOrganizationList.add(educationalOrganization);
	}

	@Override
	public EducationalOrganization getEducationalOrganization() {
		if(educationalOrganizationList != null && educationalOrganizationList.size() > 0) {
			return educationalOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationalOrganization(EducationalOrganization educationalOrganization) {
		if(educationalOrganizationList == null) {
			educationalOrganizationList = new ArrayList<>();
		}
		if(educationalOrganizationList.size() == 0) {
			educationalOrganizationList.add(educationalOrganization);
		} else {
			educationalOrganizationList.set(0, educationalOrganization);
		}
	}

	@Override
	public List<EducationalOrganization> getEducationalOrganizationList() {
		return educationalOrganizationList;
	}

	@Override
	public void setEducationalOrganizationList(List<EducationalOrganization> educationalOrganizationList) {
		this.educationalOrganizationList = educationalOrganizationList;
	}

	@Override
	public boolean hasEducationalOrganization() {
		return educationalOrganizationList != null && educationalOrganizationList.size() > 0 && educationalOrganizationList.get(0) != null;
	}

	public ALUMNI_OF(Organization organization) {
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

	public ALUMNI_OF(List<EducationalOrganization> educationalOrganizationList,
			List<Organization> organizationList) {
		setEducationalOrganizationList(educationalOrganizationList);
		setOrganizationList(organizationList);
	}

	public void copy(Container.AlumniOf org) {
		setEducationalOrganizationList(org.getEducationalOrganizationList());
		setOrganizationList(org.getOrganizationList());
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