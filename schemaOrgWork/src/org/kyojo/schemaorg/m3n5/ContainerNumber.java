package org.kyojo.schemaorg.m3n5;

import java.util.List;

import org.kyojo.schemaorg.m3n5.core.DataType;

public interface ContainerNumber {

	public DataType.Number getNumber();
	public void setNumber(DataType.Number number);
	public List<DataType.Number> getNumberList();
	public void setNumberList(List<DataType.Number> numberList);
	public boolean hasNumber();

}
