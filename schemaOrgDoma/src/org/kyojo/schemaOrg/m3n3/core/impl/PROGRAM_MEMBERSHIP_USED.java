package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ProgramMembership;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class PROGRAM_MEMBERSHIP_USED implements Container.ProgramMembershipUsed {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ProgramMembership> programMembershipList;

	public PROGRAM_MEMBERSHIP_USED() {
	}

	public PROGRAM_MEMBERSHIP_USED(String string) {
		this(new PROGRAM_MEMBERSHIP(string));
	}

	public String getString() {
		if(programMembershipList == null || programMembershipList.size() == 0 || programMembershipList.get(0) == null) {
			return null;
		} else {
			Name name = programMembershipList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(programMembershipList == null) {
			programMembershipList = new ArrayList<ProgramMembership>();
		}
		if(programMembershipList.size() == 0) {
			programMembershipList.add(new PROGRAM_MEMBERSHIP(string));
		} else {
			programMembershipList.set(0, new PROGRAM_MEMBERSHIP(string));
		}
	}

	public PROGRAM_MEMBERSHIP_USED(ProgramMembership programMembership) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
