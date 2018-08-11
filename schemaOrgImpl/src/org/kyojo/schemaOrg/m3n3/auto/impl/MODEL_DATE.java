package org.kyojo.schemaOrg.m3n3.auto.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.auto.Container;
import org.kyojo.schemaOrg.m3n3.core.DataType.Date;
import org.kyojo.schemaOrg.m3n3.core.impl.DATE;

public class MODEL_DATE implements Container.ModelDate {

	private static final long serialVersionUID = 1L;

	public List<Date> dateList;

	public MODEL_DATE() {
	}

	public MODEL_DATE(java.util.Date date) {
		this(new DATE(date));
	}

	public MODEL_DATE(java.time.LocalDate date) {
		this(new DATE(date));
	}

	public MODEL_DATE(Date date) {
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
