package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ActionStatusType;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class ACTION_STATUS implements Container.ActionStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ActionStatusType> actionStatusTypeList;

	public ACTION_STATUS() {
	}

	public ACTION_STATUS(String string) {
		this(new ACTION_STATUS_TYPE(string));
	}

	public String getString() {
		if(actionStatusTypeList == null || actionStatusTypeList.size() == 0 || actionStatusTypeList.get(0) == null) {
			return null;
		} else {
			Name name = actionStatusTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(actionStatusTypeList == null) {
			actionStatusTypeList = new ArrayList<ActionStatusType>();
		}
		if(actionStatusTypeList.size() == 0) {
			actionStatusTypeList.add(new ACTION_STATUS_TYPE(string));
		} else {
			actionStatusTypeList.set(0, new ACTION_STATUS_TYPE(string));
		}
	}

	public ACTION_STATUS(ActionStatusType actionStatusType) {
		actionStatusTypeList = new ArrayList<ActionStatusType>();
		actionStatusTypeList.add(actionStatusType);
	}

	@Override
	public ActionStatusType getActionStatusType() {
		if(actionStatusTypeList != null && actionStatusTypeList.size() > 0) {
			return actionStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActionStatusType(ActionStatusType actionStatusType) {
		if(actionStatusTypeList == null) {
			actionStatusTypeList = new ArrayList<>();
		}
		if(actionStatusTypeList.size() == 0) {
			actionStatusTypeList.add(actionStatusType);
		} else {
			actionStatusTypeList.set(0, actionStatusType);
		}
	}

	@Override
	public List<ActionStatusType> getActionStatusTypeList() {
		return actionStatusTypeList;
	}

	@Override
	public void setActionStatusTypeList(List<ActionStatusType> actionStatusTypeList) {
		this.actionStatusTypeList = actionStatusTypeList;
	}

	@Override
	public boolean hasActionStatusType() {
		return actionStatusTypeList != null && actionStatusTypeList.size() > 0 && actionStatusTypeList.get(0) != null;
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
