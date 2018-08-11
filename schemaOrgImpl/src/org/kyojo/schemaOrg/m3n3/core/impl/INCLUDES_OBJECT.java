package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TypeAndQuantityNode;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class INCLUDES_OBJECT implements Container.IncludesObject {

	private static final long serialVersionUID = 1L;

	public List<TypeAndQuantityNode> typeAndQuantityNodeList;

	public INCLUDES_OBJECT() {
	}

	public INCLUDES_OBJECT(String string) {
		this(new TYPE_AND_QUANTITY_NODE(string));
	}

	public String getString() {
		if(typeAndQuantityNodeList == null || typeAndQuantityNodeList.size() == 0 || typeAndQuantityNodeList.get(0) == null) {
			return null;
		} else {
			Name name = typeAndQuantityNodeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(typeAndQuantityNodeList == null) {
			typeAndQuantityNodeList = new ArrayList<TypeAndQuantityNode>();
		}
		if(typeAndQuantityNodeList.size() == 0) {
			typeAndQuantityNodeList.add(new TYPE_AND_QUANTITY_NODE(string));
		} else {
			typeAndQuantityNodeList.set(0, new TYPE_AND_QUANTITY_NODE(string));
		}
	}

	public INCLUDES_OBJECT(TypeAndQuantityNode typeAndQuantityNode) {
		typeAndQuantityNodeList = new ArrayList<TypeAndQuantityNode>();
		typeAndQuantityNodeList.add(typeAndQuantityNode);
	}

	@Override
	public TypeAndQuantityNode getTypeAndQuantityNode() {
		if(typeAndQuantityNodeList != null && typeAndQuantityNodeList.size() > 0) {
			return typeAndQuantityNodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTypeAndQuantityNode(TypeAndQuantityNode typeAndQuantityNode) {
		if(typeAndQuantityNodeList == null) {
			typeAndQuantityNodeList = new ArrayList<>();
		}
		if(typeAndQuantityNodeList.size() == 0) {
			typeAndQuantityNodeList.add(typeAndQuantityNode);
		} else {
			typeAndQuantityNodeList.set(0, typeAndQuantityNode);
		}
	}

	@Override
	public List<TypeAndQuantityNode> getTypeAndQuantityNodeList() {
		return typeAndQuantityNodeList;
	}

	@Override
	public void setTypeAndQuantityNodeList(List<TypeAndQuantityNode> typeAndQuantityNodeList) {
		this.typeAndQuantityNodeList = typeAndQuantityNodeList;
	}

	@Override
	public boolean hasTypeAndQuantityNode() {
		return typeAndQuantityNodeList != null && typeAndQuantityNodeList.size() > 0 && typeAndQuantityNodeList.get(0) != null;
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
