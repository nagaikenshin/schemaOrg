package org.kyojo.schemaorg.m3n5;

import java.util.List;

import org.kyojo.schemaorg.m3n5.core.DataType;

public interface ContainerText {

	public DataType.Text getText();
	public void setText(DataType.Text text);
	public List<DataType.Text> getTextList();
	public void setTextList(List<DataType.Text> textList);
	public boolean hasText();

}
