package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.ActionAccessSpecification;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

import org.seasar.doma.Transient;

public class ACTION_ACCESSIBILITY_REQUIREMENT implements Container.ActionAccessibilityRequirement {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ActionAccessSpecification> actionAccessSpecificationList;

	public ACTION_ACCESSIBILITY_REQUIREMENT() {
	}

	public ACTION_ACCESSIBILITY_REQUIREMENT(String string) {
		this(new ACTION_ACCESS_SPECIFICATION(string));
	}

	public String getString() {
		if(actionAccessSpecificationList == null || actionAccessSpecificationList.size() == 0 || actionAccessSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = actionAccessSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(actionAccessSpecificationList == null) {
			actionAccessSpecificationList = new ArrayList<ActionAccessSpecification>();
		}
		if(actionAccessSpecificationList.size() == 0) {
			actionAccessSpecificationList.add(new ACTION_ACCESS_SPECIFICATION(string));
		} else {
			actionAccessSpecificationList.set(0, new ACTION_ACCESS_SPECIFICATION(string));
		}
	}

	public ACTION_ACCESSIBILITY_REQUIREMENT(ActionAccessSpecification actionAccessSpecification) {
		actionAccessSpecificationList = new ArrayList<ActionAccessSpecification>();
		actionAccessSpecificationList.add(actionAccessSpecification);
	}

	@Override
	public ActionAccessSpecification getActionAccessSpecification() {
		if(actionAccessSpecificationList != null && actionAccessSpecificationList.size() > 0) {
			return actionAccessSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActionAccessSpecification(ActionAccessSpecification actionAccessSpecification) {
		if(actionAccessSpecificationList == null) {
			actionAccessSpecificationList = new ArrayList<>();
		}
		if(actionAccessSpecificationList.size() == 0) {
			actionAccessSpecificationList.add(actionAccessSpecification);
		} else {
			actionAccessSpecificationList.set(0, actionAccessSpecification);
		}
	}

	@Override
	public List<ActionAccessSpecification> getActionAccessSpecificationList() {
		return actionAccessSpecificationList;
	}

	@Override
	public void setActionAccessSpecificationList(List<ActionAccessSpecification> actionAccessSpecificationList) {
		this.actionAccessSpecificationList = actionAccessSpecificationList;
	}

	@Override
	public boolean hasActionAccessSpecification() {
		return actionAccessSpecificationList != null && actionAccessSpecificationList.size() > 0 && actionAccessSpecificationList.get(0) != null;
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
