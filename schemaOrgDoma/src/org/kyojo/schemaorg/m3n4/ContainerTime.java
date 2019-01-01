package org.kyojo.schemaorg.m3n4;

import java.util.List;

import org.kyojo.schemaorg.m3n4.core.DataType;

public interface ContainerTime {

	public DataType.Time getTime();
	public void setTime(DataType.Time time);
	public List<DataType.Time> getTimeList();
	public void setTimeList(List<DataType.Time> timeList);
	public boolean hasTime();

}
