package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.DataType.DateTime;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;

import org.seasar.doma.Transient;

public class TEMPORAL implements Container.Temporal {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DateTime> dateTimeList;
	@Transient
	public List<Text> textList;

	public TEMPORAL() {
	}

	public TEMPORAL(java.util.Date dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public TEMPORAL(java.time.OffsetDateTime dateTime) {
		this(new DATE_TIME(dateTime));
	}

	public TEMPORAL(DateTime dateTime) {
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

	public TEMPORAL(String string) {
		this(new TEXT(string));
	}

	public TEMPORAL(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public TEMPORAL(List<DateTime> dateTimeList,
			List<Text> textList) {
		setDateTimeList(dateTimeList);
		setTextList(textList);
	}

	public void copy(Container.Temporal org) {
		setDateTimeList(org.getDateTimeList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
