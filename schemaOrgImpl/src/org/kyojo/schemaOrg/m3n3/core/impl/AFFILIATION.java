package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Organization;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ProgramMembership;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class AFFILIATION implements Container.Affiliation {

	private static final long serialVersionUID = 1L;

	public List<Organization> organizationList;
	public List<ProgramMembership> programMembershipList;

	public AFFILIATION() {
	}

	public AFFILIATION(String string) {
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

	public AFFILIATION(Organization organization) {
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

	public AFFILIATION(ProgramMembership programMembership) {
		programMembershipList = new ArrayList<ProgramMembership>();
		programMembershipList.add(programMembership);
	}

	@Override
	public ProgramMembership getProgramMembership() {
		if(programMembershipList != null && programMembershipList.size() > 0) {
			return programMembershipList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setProgramMembership(ProgramMembership programMembership) {
		if(programMembershipList == null) {
			programMembershipList = new ArrayList<>();
		}
		if(programMembershipList.size() == 0) {
			programMembershipList.add(programMembership);
		} else {
			programMembershipList.set(0, programMembership);
		}
	}

	@Override
	public List<ProgramMembership> getProgramMembershipList() {
		return programMembershipList;
	}

	@Override
	public void setProgramMembershipList(List<ProgramMembership> programMembershipList) {
		this.programMembershipList = programMembershipList;
	}

	@Override
	public boolean hasProgramMembership() {
		return programMembershipList != null && programMembershipList.size() > 0 && programMembershipList.get(0) != null;
	}

	public AFFILIATION(List<Organization> organizationList,
			List<ProgramMembership> programMembershipList) {
		setOrganizationList(organizationList);
		setProgramMembershipList(programMembershipList);
	}

	public void copy(Container.Affiliation org) {
		setOrganizationList(org.getOrganizationList());
		setProgramMembershipList(org.getProgramMembershipList());
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
