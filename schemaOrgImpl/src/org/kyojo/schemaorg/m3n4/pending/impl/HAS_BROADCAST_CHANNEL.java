package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastChannel;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class HAS_BROADCAST_CHANNEL implements Container.HasBroadcastChannel {

	private static final long serialVersionUID = 1L;

	public List<BroadcastChannel> broadcastChannelList;

	public HAS_BROADCAST_CHANNEL() {
	}

	public HAS_BROADCAST_CHANNEL(String string) {
		this(new BROADCAST_CHANNEL(string));
	}

	public String getString() {
		if(broadcastChannelList == null || broadcastChannelList.size() == 0 || broadcastChannelList.get(0) == null) {
			return null;
		} else {
			Name name = broadcastChannelList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(broadcastChannelList == null) {
			broadcastChannelList = new ArrayList<BroadcastChannel>();
		}
		if(broadcastChannelList.size() == 0) {
			broadcastChannelList.add(new BROADCAST_CHANNEL(string));
		} else {
			broadcastChannelList.set(0, new BROADCAST_CHANNEL(string));
		}
	}

	public HAS_BROADCAST_CHANNEL(BroadcastChannel broadcastChannel) {
		broadcastChannelList = new ArrayList<BroadcastChannel>();
		broadcastChannelList.add(broadcastChannel);
	}

	@Override
	public BroadcastChannel getBroadcastChannel() {
		if(broadcastChannelList != null && broadcastChannelList.size() > 0) {
			return broadcastChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastChannel(BroadcastChannel broadcastChannel) {
		if(broadcastChannelList == null) {
			broadcastChannelList = new ArrayList<>();
		}
		if(broadcastChannelList.size() == 0) {
			broadcastChannelList.add(broadcastChannel);
		} else {
			broadcastChannelList.set(0, broadcastChannel);
		}
	}

	@Override
	public List<BroadcastChannel> getBroadcastChannelList() {
		return broadcastChannelList;
	}

	@Override
	public void setBroadcastChannelList(List<BroadcastChannel> broadcastChannelList) {
		this.broadcastChannelList = broadcastChannelList;
	}

	@Override
	public boolean hasBroadcastChannel() {
		return broadcastChannelList != null && broadcastChannelList.size() > 0 && broadcastChannelList.get(0) != null;
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
