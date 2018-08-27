package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.DataType.Date;
import org.kyojo.schemaorg.m3n4.core.DataType.DateTime;
import org.kyojo.schemaorg.m3n4.core.impl.DATE;
import org.kyojo.schemaorg.m3n4.core.impl.DATE_TIME;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class LEGISLATION_DATE implements Container.LegislationDate {

	private static final long serialVersionUID = 1L;

	public List<Date> dateList;
	public List<DateTime> dateTimeList;

	public LEGISLATION_DATE() {
	}

	public LEGISLATION_DATE(java.time.LocalDate date) {
		this(new DATE(date));
	}

	public LEGISLATION_DATE(Date date) {
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

	public LEGISLATION_DATE(java.util.Date dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public LEGISLATION_DATE(java.time.OffsetDateTime dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public LEGISLATION_DATE(DateTime dateTime) {
		dateTimeList = new ArrayList<DateTime>();
		dateTimeList.add(dateTime);
	}

	@Override
	public DateTime getDateTime() {
		if(dateTimeList != null && dateTimeList.size() > 0) {
			return dateTimeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDateTime(DateTime dateTime) {
		if(dateTimeList == null) {
			dateTimeList = new ArrayList<>();
		}
		if(dateTimeList.size() == 0) {
			dateTimeList.add(dateTime);
		} else {
			dateTimeList.set(0, dateTime);
		}
	}

	@Override
	public List<DateTime> getDateTimeList() {
		return dateTimeList;
	}

	@Override
	public void setDateTimeList(List<DateTime> dateTimeList) {
		this.dateTimeList = dateTimeList;
	}

	@Override
	public boolean hasDateTime() {
		return dateTimeList != null && dateTimeList.size() > 0 && dateTimeList.get(0) != null;
	}

	public LEGISLATION_DATE(List<Date> dateList,
			List<DateTime> dateTimeList) {
		setDateList(dateList);
		setDateTimeList(dateTimeList);
	}

	public void copy(Container.LegislationDate org) {
		setDateList(org.getDateList());
		setDateTimeList(org.getDateTimeList());
	}

	@Override
	public java.util.Date getNativeValue() {
		if(getDateTime() == null) return null;
		return getDateTime().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
