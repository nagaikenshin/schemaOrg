package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.RadioChannel;
import org.kyojo.schemaorg.m3n4.core.Clazz.TelevisionChannel;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AMRadioChannel;
import org.kyojo.schemaorg.m3n4.pending.Clazz.FMRadioChannel;
import org.kyojo.schemaorg.m3n4.pending.Container;

import org.seasar.doma.Transient;

public class HAS_BROADCAST_CHANNEL implements Container.HasBroadcastChannel {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AMRadioChannel> amRadioChannelList;
	@Transient
	public List<BroadcastChannel> broadcastChannelList;
	@Transient
	public List<FMRadioChannel> fmRadioChannelList;
	@Transient
	public List<RadioChannel> radioChannelList;
	@Transient
	public List<TelevisionChannel> televisionChannelList;

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

	public HAS_BROADCAST_CHANNEL(AMRadioChannel amRadioChannel) {
		amRadioChannelList = new ArrayList<AMRadioChannel>();
		amRadioChannelList.add(amRadioChannel);
	}

	@Override
	public AMRadioChannel getAMRadioChannel() {
		if(amRadioChannelList != null && amRadioChannelList.size() > 0) {
			return amRadioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAMRadioChannel(AMRadioChannel amRadioChannel) {
		if(amRadioChannelList == null) {
			amRadioChannelList = new ArrayList<>();
		}
		if(amRadioChannelList.size() == 0) {
			amRadioChannelList.add(amRadioChannel);
		} else {
			amRadioChannelList.set(0, amRadioChannel);
		}
	}

	@Override
	public List<AMRadioChannel> getAMRadioChannelList() {
		return amRadioChannelList;
	}

	@Override
	public void setAMRadioChannelList(List<AMRadioChannel> amRadioChannelList) {
		this.amRadioChannelList = amRadioChannelList;
	}

	@Override
	public boolean hasAMRadioChannel() {
		return amRadioChannelList != null && amRadioChannelList.size() > 0 && amRadioChannelList.get(0) != null;
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

	public HAS_BROADCAST_CHANNEL(FMRadioChannel fmRadioChannel) {
		fmRadioChannelList = new ArrayList<FMRadioChannel>();
		fmRadioChannelList.add(fmRadioChannel);
	}

	@Override
	public FMRadioChannel getFMRadioChannel() {
		if(fmRadioChannelList != null && fmRadioChannelList.size() > 0) {
			return fmRadioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFMRadioChannel(FMRadioChannel fmRadioChannel) {
		if(fmRadioChannelList == null) {
			fmRadioChannelList = new ArrayList<>();
		}
		if(fmRadioChannelList.size() == 0) {
			fmRadioChannelList.add(fmRadioChannel);
		} else {
			fmRadioChannelList.set(0, fmRadioChannel);
		}
	}

	@Override
	public List<FMRadioChannel> getFMRadioChannelList() {
		return fmRadioChannelList;
	}

	@Override
	public void setFMRadioChannelList(List<FMRadioChannel> fmRadioChannelList) {
		this.fmRadioChannelList = fmRadioChannelList;
	}

	@Override
	public boolean hasFMRadioChannel() {
		return fmRadioChannelList != null && fmRadioChannelList.size() > 0 && fmRadioChannelList.get(0) != null;
	}

	public HAS_BROADCAST_CHANNEL(RadioChannel radioChannel) {
		radioChannelList = new ArrayList<RadioChannel>();
		radioChannelList.add(radioChannel);
	}

	@Override
	public RadioChannel getRadioChannel() {
		if(radioChannelList != null && radioChannelList.size() > 0) {
			return radioChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadioChannel(RadioChannel radioChannel) {
		if(radioChannelList == null) {
			radioChannelList = new ArrayList<>();
		}
		if(radioChannelList.size() == 0) {
			radioChannelList.add(radioChannel);
		} else {
			radioChannelList.set(0, radioChannel);
		}
	}

	@Override
	public List<RadioChannel> getRadioChannelList() {
		return radioChannelList;
	}

	@Override
	public void setRadioChannelList(List<RadioChannel> radioChannelList) {
		this.radioChannelList = radioChannelList;
	}

	@Override
	public boolean hasRadioChannel() {
		return radioChannelList != null && radioChannelList.size() > 0 && radioChannelList.get(0) != null;
	}

	public HAS_BROADCAST_CHANNEL(TelevisionChannel televisionChannel) {
		televisionChannelList = new ArrayList<TelevisionChannel>();
		televisionChannelList.add(televisionChannel);
	}

	@Override
	public TelevisionChannel getTelevisionChannel() {
		if(televisionChannelList != null && televisionChannelList.size() > 0) {
			return televisionChannelList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTelevisionChannel(TelevisionChannel televisionChannel) {
		if(televisionChannelList == null) {
			televisionChannelList = new ArrayList<>();
		}
		if(televisionChannelList.size() == 0) {
			televisionChannelList.add(televisionChannel);
		} else {
			televisionChannelList.set(0, televisionChannel);
		}
	}

	@Override
	public List<TelevisionChannel> getTelevisionChannelList() {
		return televisionChannelList;
	}

	@Override
	public void setTelevisionChannelList(List<TelevisionChannel> televisionChannelList) {
		this.televisionChannelList = televisionChannelList;
	}

	@Override
	public boolean hasTelevisionChannel() {
		return televisionChannelList != null && televisionChannelList.size() > 0 && televisionChannelList.get(0) != null;
	}

	public HAS_BROADCAST_CHANNEL(List<AMRadioChannel> amRadioChannelList,
			List<BroadcastChannel> broadcastChannelList,
			List<FMRadioChannel> fmRadioChannelList,
			List<RadioChannel> radioChannelList,
			List<TelevisionChannel> televisionChannelList) {
		setAMRadioChannelList(amRadioChannelList);
		setBroadcastChannelList(broadcastChannelList);
		setFMRadioChannelList(fmRadioChannelList);
		setRadioChannelList(radioChannelList);
		setTelevisionChannelList(televisionChannelList);
	}

	public void copy(Container.HasBroadcastChannel org) {
		setAMRadioChannelList(org.getAMRadioChannelList());
		setBroadcastChannelList(org.getBroadcastChannelList());
		setFMRadioChannelList(org.getFMRadioChannelList());
		setRadioChannelList(org.getRadioChannelList());
		setTelevisionChannelList(org.getTelevisionChannelList());
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
