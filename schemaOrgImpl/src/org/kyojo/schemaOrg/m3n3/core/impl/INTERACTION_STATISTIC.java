package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.InteractionCounter;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class INTERACTION_STATISTIC implements Container.InteractionStatistic {

	private static final long serialVersionUID = 1L;

	public List<InteractionCounter> interactionCounterList;

	public INTERACTION_STATISTIC() {
	}

	public INTERACTION_STATISTIC(String string) {
		this(new INTERACTION_COUNTER(string));
	}

	public String getString() {
		if(interactionCounterList == null || interactionCounterList.size() == 0 || interactionCounterList.get(0) == null) {
			return null;
		} else {
			Name name = interactionCounterList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(interactionCounterList == null) {
			interactionCounterList = new ArrayList<InteractionCounter>();
		}
		if(interactionCounterList.size() == 0) {
			interactionCounterList.add(new INTERACTION_COUNTER(string));
		} else {
			interactionCounterList.set(0, new INTERACTION_COUNTER(string));
		}
	}

	public INTERACTION_STATISTIC(InteractionCounter interactionCounter) {
		interactionCounterList = new ArrayList<InteractionCounter>();
		interactionCounterList.add(interactionCounter);
	}

	@Override
	public InteractionCounter getInteractionCounter() {
		if(interactionCounterList != null && interactionCounterList.size() > 0) {
			return interactionCounterList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteractionCounter(InteractionCounter interactionCounter) {
		if(interactionCounterList == null) {
			interactionCounterList = new ArrayList<>();
		}
		if(interactionCounterList.size() == 0) {
			interactionCounterList.add(interactionCounter);
		} else {
			interactionCounterList.set(0, interactionCounter);
		}
	}

	@Override
	public List<InteractionCounter> getInteractionCounterList() {
		return interactionCounterList;
	}

	@Override
	public void setInteractionCounterList(List<InteractionCounter> interactionCounterList) {
		this.interactionCounterList = interactionCounterList;
	}

	@Override
	public boolean hasInteractionCounter() {
		return interactionCounterList != null && interactionCounterList.size() > 0 && interactionCounterList.get(0) != null;
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
