package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.DateTime;

public class PAYMENT_DUE_DATE implements Container.PaymentDueDate {

	private static final long serialVersionUID = 1L;

	public List<DateTime> dateTimeList;

	public PAYMENT_DUE_DATE() {
	}

	public PAYMENT_DUE_DATE(java.util.Date dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public PAYMENT_DUE_DATE(java.time.OffsetDateTime dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public PAYMENT_DUE_DATE(DateTime dateTime) {
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
