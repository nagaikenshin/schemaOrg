package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.DataType.Date;

public class PRICE_VALID_UNTIL implements Container.PriceValidUntil {

	private static final long serialVersionUID = 1L;

	public List<Date> dateList;

	public PRICE_VALID_UNTIL() {
	}

	public PRICE_VALID_UNTIL(java.util.Date date) {
		this(new DATE(date));
	}

	public PRICE_VALID_UNTIL(java.time.LocalDate date) {
		this(new DATE(date));
	}

	public PRICE_VALID_UNTIL(Date date) {
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
