package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Action;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class INTERACTION_TYPE implements Container.InteractionType {

	private static final long serialVersionUID = 1L;

	public List<Action> actionList;

	public INTERACTION_TYPE() {
	}

	public INTERACTION_TYPE(String string) {
		this(new ACTION(string));
	}

	public String getString() {
		if(actionList == null || actionList.size() == 0 || actionList.get(0) == null) {
			return null;
		} else {
			Name name = actionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(actionList == null) {
			actionList = new ArrayList<Action>();
		}
		if(actionList.size() == 0) {
			actionList.add(new ACTION(string));
		} else {
			actionList.set(0, new ACTION(string));
		}
	}

	public INTERACTION_TYPE(Action action) {
		actionList = new ArrayList<Action>();
		actionList.add(action);
	}

	@Override
	public Action getAction() {
		if(actionList != null && actionList.size() > 0) {
			return actionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAction(Action action) {
		if(actionList == null) {
			actionList = new ArrayList<>();
		}
		if(actionList.size() == 0) {
			actionList.add(action);
		} else {
			actionList.set(0, action);
		}
	}

	@Override
	public List<Action> getActionList() {
		return actionList;
	}

	@Override
	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}

	@Override
	public boolean hasAction() {
		return actionList != null && actionList.size() > 0 && actionList.get(0) != null;
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
