package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveOrganization;
import org.kyojo.schemaorg.m3n5.pending.Container;
import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_ORGANIZATION;

public class HOLDING_ARCHIVE implements Container.HoldingArchive {

	private static final long serialVersionUID = 1L;

	public List<ArchiveOrganization> archiveOrganizationList;

	public HOLDING_ARCHIVE() {
	}

	public HOLDING_ARCHIVE(String string) {
		this(new ARCHIVE_ORGANIZATION(string));
	}

	public String getString() {
		if(archiveOrganizationList == null || archiveOrganizationList.size() == 0 || archiveOrganizationList.get(0) == null) {
			return null;
		} else {
			Name name = archiveOrganizationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(archiveOrganizationList == null) {
			archiveOrganizationList = new ArrayList<ArchiveOrganization>();
		}
		if(archiveOrganizationList.size() == 0) {
			archiveOrganizationList.add(new ARCHIVE_ORGANIZATION(string));
		} else {
			archiveOrganizationList.set(0, new ARCHIVE_ORGANIZATION(string));
		}
	}

	public HOLDING_ARCHIVE(ArchiveOrganization archiveOrganization) {
		archiveOrganizationList = new ArrayList<ArchiveOrganization>();
		archiveOrganizationList.add(archiveOrganization);
	}

	@Override
	public ArchiveOrganization getArchiveOrganization() {
		if(archiveOrganizationList != null && archiveOrganizationList.size() > 0) {
			return archiveOrganizationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArchiveOrganization(ArchiveOrganization archiveOrganization) {
		if(archiveOrganizationList == null) {
			archiveOrganizationList = new ArrayList<>();
		}
		if(archiveOrganizationList.size() == 0) {
			archiveOrganizationList.add(archiveOrganization);
		} else {
			archiveOrganizationList.set(0, archiveOrganization);
		}
	}

	@Override
	public List<ArchiveOrganization> getArchiveOrganizationList() {
		return archiveOrganizationList;
	}

	@Override
	public void setArchiveOrganizationList(List<ArchiveOrganization> archiveOrganizationList) {
		this.archiveOrganizationList = archiveOrganizationList;
	}

	@Override
	public boolean hasArchiveOrganization() {
		return archiveOrganizationList != null && archiveOrganizationList.size() > 0 && archiveOrganizationList.get(0) != null;
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
