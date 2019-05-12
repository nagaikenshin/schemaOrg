package org.kyojo.schemaorg.m3n5;

import java.util.List;

import org.kyojo.schemaorg.m3n5.core.Clazz;

public interface ContainerURL {

	public Clazz.URL getURL();
	public void setURL(Clazz.URL url);
	public List<Clazz.URL> getURLList();
	public void setURLList(List<Clazz.URL> urlList);
	public boolean hasURL();

}
