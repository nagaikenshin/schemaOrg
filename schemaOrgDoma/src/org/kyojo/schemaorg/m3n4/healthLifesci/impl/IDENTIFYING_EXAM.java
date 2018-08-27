package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalExam;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PHYSICAL_EXAM;

import org.seasar.doma.Transient;

public class IDENTIFYING_EXAM implements Container.IdentifyingExam {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<PhysicalExam> physicalExamList;

	public IDENTIFYING_EXAM() {
	}

	public IDENTIFYING_EXAM(String string) {
		this(new PHYSICAL_EXAM(string));
	}

	public String getString() {
		if(physicalExamList == null || physicalExamList.size() == 0 || physicalExamList.get(0) == null) {
			return null;
		} else {
			Name name = physicalExamList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(physicalExamList == null) {
			physicalExamList = new ArrayList<PhysicalExam>();
		}
		if(physicalExamList.size() == 0) {
			physicalExamList.add(new PHYSICAL_EXAM(string));
		} else {
			physicalExamList.set(0, new PHYSICAL_EXAM(string));
		}
	}

	public IDENTIFYING_EXAM(PhysicalExam physicalExam) {
		physicalExamList = new ArrayList<PhysicalExam>();
		physicalExamList.add(physicalExam);
	}

	@Override
	public PhysicalExam getPhysicalExam() {
		if(physicalExamList != null && physicalExamList.size() > 0) {
			return physicalExamList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalExam(PhysicalExam physicalExam) {
		if(physicalExamList == null) {
			physicalExamList = new ArrayList<>();
		}
		if(physicalExamList.size() == 0) {
			physicalExamList.add(physicalExam);
		} else {
			physicalExamList.set(0, physicalExam);
		}
	}

	@Override
	public List<PhysicalExam> getPhysicalExamList() {
		return physicalExamList;
	}

	@Override
	public void setPhysicalExamList(List<PhysicalExam> physicalExamList) {
		this.physicalExamList = physicalExamList;
	}

	@Override
	public boolean hasPhysicalExam() {
		return physicalExamList != null && physicalExamList.size() > 0 && physicalExamList.get(0) != null;
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
