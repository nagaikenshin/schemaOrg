package org.kyojo.schemaorg.m3n4;

import java.util.List;

import org.kyojo.schemaorg.m3n4.core.Clazz;

public interface ContainerInteger {

	public Clazz.Integer getInteger();
	public void setInteger(Clazz.Integer integer);
	public List<Clazz.Integer> getIntegerList();
	public void setIntegerList(List<Clazz.Integer> integerList);
	public boolean hasInteger();

}
