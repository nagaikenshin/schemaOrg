package org.kyojo.schemaorg.m3n4;

import java.util.List;

import org.kyojo.schemaorg.m3n4.core.DataType;

public interface ContainerDateTime {

	public DataType.DateTime getDateTime();
	public void setDateTime(DataType.DateTime dateTime);
	public List<DataType.DateTime> getDateTimeList();
	public void setDateTimeList(List<DataType.DateTime> dateTimeList);
	public boolean hasDateTime();

}
