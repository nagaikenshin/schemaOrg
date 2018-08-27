package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationEvent;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class PUBLICATION implements Container.Publication {

	private static final long serialVersionUID = 1L;

	public List<PublicationEvent> publicationEventList;

	public PUBLICATION() {
	}

	public PUBLICATION(String string) {
		this(new PUBLICATION_EVENT(string));
	}

	public String getString() {
		if(publicationEventList == null || publicationEventList.size() == 0 || publicationEventList.get(0) == null) {
			return null;
		} else {
			Name name = publicationEventList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(publicationEventList == null) {
			publicationEventList = new ArrayList<PublicationEvent>();
		}
		if(publicationEventList.size() == 0) {
			publicationEventList.add(new PUBLICATION_EVENT(string));
		} else {
			publicationEventList.set(0, new PUBLICATION_EVENT(string));
		}
	}

	public PUBLICATION(PublicationEvent publicationEvent) {
		publicationEventList = new ArrayList<PublicationEvent>();
		publicationEventList.add(publicationEvent);
	}

	@Override
	public PublicationEvent getPublicationEvent() {
		if(publicationEventList != null && publicationEventList.size() > 0) {
			return publicationEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationEvent(PublicationEvent publicationEvent) {
		if(publicationEventList == null) {
			publicationEventList = new ArrayList<>();
		}
		if(publicationEventList.size() == 0) {
			publicationEventList.add(publicationEvent);
		} else {
			publicationEventList.set(0, publicationEvent);
		}
	}

	@Override
	public List<PublicationEvent> getPublicationEventList() {
		return publicationEventList;
	}

	@Override
	public void setPublicationEventList(List<PublicationEvent> publicationEventList) {
		this.publicationEventList = publicationEventList;
	}

	@Override
	public boolean hasPublicationEvent() {
		return publicationEventList != null && publicationEventList.size() > 0 && publicationEventList.get(0) != null;
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
