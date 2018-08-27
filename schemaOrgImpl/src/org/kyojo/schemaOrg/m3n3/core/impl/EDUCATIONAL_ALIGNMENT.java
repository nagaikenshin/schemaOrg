package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.AlignmentObject;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class EDUCATIONAL_ALIGNMENT implements Container.EducationalAlignment {

	private static final long serialVersionUID = 1L;

	public List<AlignmentObject> alignmentObjectList;

	public EDUCATIONAL_ALIGNMENT() {
	}

	public EDUCATIONAL_ALIGNMENT(String string) {
		this(new ALIGNMENT_OBJECT(string));
	}

	public String getString() {
		if(alignmentObjectList == null || alignmentObjectList.size() == 0 || alignmentObjectList.get(0) == null) {
			return null;
		} else {
			Name name = alignmentObjectList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(alignmentObjectList == null) {
			alignmentObjectList = new ArrayList<AlignmentObject>();
		}
		if(alignmentObjectList.size() == 0) {
			alignmentObjectList.add(new ALIGNMENT_OBJECT(string));
		} else {
			alignmentObjectList.set(0, new ALIGNMENT_OBJECT(string));
		}
	}

	public EDUCATIONAL_ALIGNMENT(AlignmentObject alignmentObject) {
		alignmentObjectList = new ArrayList<AlignmentObject>();
		alignmentObjectList.add(alignmentObject);
	}

	@Override
	public AlignmentObject getAlignmentObject() {
		if(alignmentObjectList != null && alignmentObjectList.size() > 0) {
			return alignmentObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAlignmentObject(AlignmentObject alignmentObject) {
		if(alignmentObjectList == null) {
			alignmentObjectList = new ArrayList<>();
		}
		if(alignmentObjectList.size() == 0) {
			alignmentObjectList.add(alignmentObject);
		} else {
			alignmentObjectList.set(0, alignmentObject);
		}
	}

	@Override
	public List<AlignmentObject> getAlignmentObjectList() {
		return alignmentObjectList;
	}

	@Override
	public void setAlignmentObjectList(List<AlignmentObject> alignmentObjectList) {
		this.alignmentObjectList = alignmentObjectList;
	}

	@Override
	public boolean hasAlignmentObject() {
		return alignmentObjectList != null && alignmentObjectList.size() > 0 && alignmentObjectList.get(0) != null;
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
