package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.DataType.Date;
import org.kyojo.schemaOrg.m3n3.core.impl.DATE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;

import org.seasar.doma.Transient;

public class GUIDELINE_DATE implements Container.GuidelineDate {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Date> dateList;

	public GUIDELINE_DATE() {
	}

	public GUIDELINE_DATE(java.util.Date date) {
		this(new DATE(date));
	}

	public GUIDELINE_DATE(java.time.LocalDate date) {
		this(new DATE(date));
	}

	public GUIDELINE_DATE(Date date) {
		dateList = new ArrayList<Date>();
		dateList.add(date);
	}

	@Override
	public Date getDate() {
		if(dateList != null && dateList.size() > 0) {
			return dateList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDate(Date date) {
		if(dateList == null) {
			dateList = new ArrayList<>();
		}
		if(dateList.size() == 0) {
			dateList.add(date);
		} else {
			dateList.set(0, date);
		}
	}

	@Override
	public List<Date> getDateList() {
		return dateList;
	}

	@Override
	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

	@Override
	public boolean hasDate() {
		return dateList != null && dateList.size() > 0 && dateList.get(0) != null;
	}

	@Override
	public java.sql.Date getNativeValue() {
		if(getDate() == null) return null;
		return getDate().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
