package org.kyojo.schemaorg.m3n5;

import java.util.List;

import org.kyojo.schemaorg.m3n5.core.DataType;

public interface ContainerDate {

	public DataType.Date getDate();
	public void setDate(DataType.Date date);
	public List<DataType.Date> getDateList();
	public void setDateList(List<DataType.Date> dateList);
	public boolean hasDate();

}
