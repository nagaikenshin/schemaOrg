package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveComponent;
import org.kyojo.schemaorg.m3n5.pending.Container;
import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_COMPONENT;

public class ARCHIVE_HELD implements Container.ArchiveHeld {

	private static final long serialVersionUID = 1L;

	public List<ArchiveComponent> archiveComponentList;

	public ARCHIVE_HELD() {
	}

	public ARCHIVE_HELD(String string) {
		this(new ARCHIVE_COMPONENT(string));
	}

	public String getString() {
		if(archiveComponentList == null || archiveComponentList.size() == 0 || archiveComponentList.get(0) == null) {
			return null;
		} else {
			Name name = archiveComponentList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(archiveComponentList == null) {
			archiveComponentList = new ArrayList<ArchiveComponent>();
		}
		if(archiveComponentList.size() == 0) {
			archiveComponentList.add(new ARCHIVE_COMPONENT(string));
		} else {
			archiveComponentList.set(0, new ARCHIVE_COMPONENT(string));
		}
	}

	public ARCHIVE_HELD(ArchiveComponent archiveComponent) {
		archiveComponentList = new ArrayList<ArchiveComponent>();
		archiveComponentList.add(archiveComponent);
	}

	@Override
	public ArchiveComponent getArchiveComponent() {
		if(archiveComponentList != null && archiveComponentList.size() > 0) {
			return archiveComponentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArchiveComponent(ArchiveComponent archiveComponent) {
		if(archiveComponentList == null) {
			archiveComponentList = new ArrayList<>();
		}
		if(archiveComponentList.size() == 0) {
			archiveComponentList.add(archiveComponent);
		} else {
			archiveComponentList.set(0, archiveComponent);
		}
	}

	@Override
	public List<ArchiveComponent> getArchiveComponentList() {
		return archiveComponentList;
	}

	@Override
	public void setArchiveComponentList(List<ArchiveComponent> archiveComponentList) {
		this.archiveComponentList = archiveComponentList;
	}

	@Override
	public boolean hasArchiveComponent() {
		return archiveComponentList != null && archiveComponentList.size() > 0 && archiveComponentList.get(0) != null;
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
