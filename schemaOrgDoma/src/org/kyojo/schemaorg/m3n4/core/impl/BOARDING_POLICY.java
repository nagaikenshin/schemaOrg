package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BoardingPolicyType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class BOARDING_POLICY implements Container.BoardingPolicy {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BoardingPolicyType> boardingPolicyTypeList;

	public BOARDING_POLICY() {
	}

	public BOARDING_POLICY(String string) {
		this(new BOARDING_POLICY_TYPE(string));
	}

	public String getString() {
		if(boardingPolicyTypeList == null || boardingPolicyTypeList.size() == 0 || boardingPolicyTypeList.get(0) == null) {
			return null;
		} else {
			Name name = boardingPolicyTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(boardingPolicyTypeList == null) {
			boardingPolicyTypeList = new ArrayList<BoardingPolicyType>();
		}
		if(boardingPolicyTypeList.size() == 0) {
			boardingPolicyTypeList.add(new BOARDING_POLICY_TYPE(string));
		} else {
			boardingPolicyTypeList.set(0, new BOARDING_POLICY_TYPE(string));
		}
	}

	public BOARDING_POLICY(BoardingPolicyType boardingPolicyType) {
		boardingPolicyTypeList = new ArrayList<BoardingPolicyType>();
		boardingPolicyTypeList.add(boardingPolicyType);
	}

	@Override
	public BoardingPolicyType getBoardingPolicyType() {
		if(boardingPolicyTypeList != null && boardingPolicyTypeList.size() > 0) {
			return boardingPolicyTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBoardingPolicyType(BoardingPolicyType boardingPolicyType) {
		if(boardingPolicyTypeList == null) {
			boardingPolicyTypeList = new ArrayList<>();
		}
		if(boardingPolicyTypeList.size() == 0) {
			boardingPolicyTypeList.add(boardingPolicyType);
		} else {
			boardingPolicyTypeList.set(0, boardingPolicyType);
		}
	}

	@Override
	public List<BoardingPolicyType> getBoardingPolicyTypeList() {
		return boardingPolicyTypeList;
	}

	@Override
	public void setBoardingPolicyTypeList(List<BoardingPolicyType> boardingPolicyTypeList) {
		this.boardingPolicyTypeList = boardingPolicyTypeList;
	}

	@Override
	public boolean hasBoardingPolicyType() {
		return boardingPolicyTypeList != null && boardingPolicyTypeList.size() > 0 && boardingPolicyTypeList.get(0) != null;
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
