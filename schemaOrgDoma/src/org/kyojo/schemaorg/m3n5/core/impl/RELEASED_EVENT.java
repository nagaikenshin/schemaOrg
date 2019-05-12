package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.OnDemandEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicationEvent;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class RELEASED_EVENT implements Container.ReleasedEvent {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BroadcastEvent> broadcastEventList;
	@Transient
	public List<OnDemandEvent> onDemandEventList;
	@Transient
	public List<PublicationEvent> publicationEventList;

	public RELEASED_EVENT() {
	}

	public RELEASED_EVENT(String string) {
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

	public RELEASED_EVENT(BroadcastEvent broadcastEvent) {
		broadcastEventList = new ArrayList<BroadcastEvent>();
		broadcastEventList.add(broadcastEvent);
	}

	@Override
	public BroadcastEvent getBroadcastEvent() {
		if(broadcastEventList != null && broadcastEventList.size() > 0) {
			return broadcastEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastEvent(BroadcastEvent broadcastEvent) {
		if(broadcastEventList == null) {
			broadcastEventList = new ArrayList<>();
		}
		if(broadcastEventList.size() == 0) {
			broadcastEventList.add(broadcastEvent);
		} else {
			broadcastEventList.set(0, broadcastEvent);
		}
	}

	@Override
	public List<BroadcastEvent> getBroadcastEventList() {
		return broadcastEventList;
	}

	@Override
	public void setBroadcastEventList(List<BroadcastEvent> broadcastEventList) {
		this.broadcastEventList = broadcastEventList;
	}

	@Override
	public boolean hasBroadcastEvent() {
		return broadcastEventList != null && broadcastEventList.size() > 0 && broadcastEventList.get(0) != null;
	}

	public RELEASED_EVENT(OnDemandEvent onDemandEvent) {
		onDemandEventList = new ArrayList<OnDemandEvent>();
		onDemandEventList.add(onDemandEvent);
	}

	@Override
	public OnDemandEvent getOnDemandEvent() {
		if(onDemandEventList != null && onDemandEventList.size() > 0) {
			return onDemandEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOnDemandEvent(OnDemandEvent onDemandEvent) {
		if(onDemandEventList == null) {
			onDemandEventList = new ArrayList<>();
		}
		if(onDemandEventList.size() == 0) {
			onDemandEventList.add(onDemandEvent);
		} else {
			onDemandEventList.set(0, onDemandEvent);
		}
	}

	@Override
	public List<OnDemandEvent> getOnDemandEventList() {
		return onDemandEventList;
	}

	@Override
	public void setOnDemandEventList(List<OnDemandEvent> onDemandEventList) {
		this.onDemandEventList = onDemandEventList;
	}

	@Override
	public boolean hasOnDemandEvent() {
		return onDemandEventList != null && onDemandEventList.size() > 0 && onDemandEventList.get(0) != null;
	}

	public RELEASED_EVENT(PublicationEvent publicationEvent) {
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

	public RELEASED_EVENT(List<BroadcastEvent> broadcastEventList,
			List<OnDemandEvent> onDemandEventList,
			List<PublicationEvent> publicationEventList) {
		setBroadcastEventList(broadcastEventList);
		setOnDemandEventList(onDemandEventList);
		setPublicationEventList(publicationEventList);
	}

	public void copy(Container.ReleasedEvent org) {
		setBroadcastEventList(org.getBroadcastEventList());
		setOnDemandEventList(org.getOnDemandEventList());
		setPublicationEventList(org.getPublicationEventList());
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
