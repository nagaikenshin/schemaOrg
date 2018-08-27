package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.DataType.Boolean;
import org.kyojo.schemaorg.m3n4.core.impl.BOOLEAN;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class RENEGOTIABLE_LOAN implements Container.RenegotiableLoan {

	private static final long serialVersionUID = 1L;

	public List<Boolean> b00leanList;

	public RENEGOTIABLE_LOAN() {
	}

	public RENEGOTIABLE_LOAN(java.lang.Boolean b00lean) {
		this(new BOOLEAN(b00lean));
	}

	public RENEGOTIABLE_LOAN(Boolean b00lean) {
		b00leanList = new ArrayList<Boolean>();
		b00leanList.add(b00lean);
	}

	@Override
	public Boolean getB00lean() {
		if(b00leanList != null && b00leanList.size() > 0) {
			return b00leanList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setB00lean(Boolean b00lean) {
		if(b00leanList == null) {
			b00leanList = new ArrayList<>();
		}
		if(b00leanList.size() == 0) {
			b00leanList.add(b00lean);
		} else {
			b00leanList.set(0, b00lean);
		}
	}

	@Override
	public List<Boolean> getB00leanList() {
		return b00leanList;
	}

	@Override
	public void setB00leanList(List<Boolean> b00leanList) {
		this.b00leanList = b00leanList;
	}

	@Override
	public boolean hasB00lean() {
		return b00leanList != null && b00leanList.size() > 0 && b00leanList.get(0) != null;
	}

	@Override
	public java.lang.Boolean getNativeValue() {
		if(getB00lean() == null) return null;
		return getB00lean().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
