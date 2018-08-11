package org.kyojo.schemaOrg.m3n3.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.BroadcastFrequencySpecification;
import org.kyojo.schemaOrg.m3n3.pending.Container;

import org.seasar.doma.Transient;

public class BROADCAST_FREQUENCY implements Container.BroadcastFrequency {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList;
	@Transient
	public List<Text> textList;

	public BROADCAST_FREQUENCY() {
	}

	public BROADCAST_FREQUENCY(BroadcastFrequencySpecification broadcastFrequencySpecification) {
		broadcastFrequencySpecificationList = new ArrayList<BroadcastFrequencySpecification>();
		broadcastFrequencySpecificationList.add(broadcastFrequencySpecification);
	}

	@Override
	public BroadcastFrequencySpecification getBroadcastFrequencySpecification() {
		if(broadcastFrequencySpecificationList != null && broadcastFrequencySpecificationList.size() > 0) {
			return broadcastFrequencySpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastFrequencySpecification(BroadcastFrequencySpecification broadcastFrequencySpecification) {
		if(broadcastFrequencySpecificationList == null) {
			broadcastFrequencySpecificationList = new ArrayList<>();
		}
		if(broadcastFrequencySpecificationList.size() == 0) {
			broadcastFrequencySpecificationList.add(broadcastFrequencySpecification);
		} else {
			broadcastFrequencySpecificationList.set(0, broadcastFrequencySpecification);
		}
	}

	@Override
	public List<BroadcastFrequencySpecification> getBroadcastFrequencySpecificationList() {
		return broadcastFrequencySpecificationList;
	}

	@Override
	public void setBroadcastFrequencySpecificationList(List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList) {
		this.broadcastFrequencySpecificationList = broadcastFrequencySpecificationList;
	}

	@Override
	public boolean hasBroadcastFrequencySpecification() {
		return broadcastFrequencySpecificationList != null && broadcastFrequencySpecificationList.size() > 0 && broadcastFrequencySpecificationList.get(0) != null;
	}

	public BROADCAST_FREQUENCY(String string) {
		this(new TEXT(string));
	}

	public BROADCAST_FREQUENCY(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public BROADCAST_FREQUENCY(List<BroadcastFrequencySpecification> broadcastFrequencySpecificationList,
			List<Text> textList) {
		setBroadcastFrequencySpecificationList(broadcastFrequencySpecificationList);
		setTextList(textList);
	}

	public void copy(Container.BroadcastFrequency org) {
		setBroadcastFrequencySpecificationList(org.getBroadcastFrequencySpecificationList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
