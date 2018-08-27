package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataCatalog;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class INCLUDED_IN_DATA_CATALOG implements Container.IncludedInDataCatalog {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DataCatalog> dataCatalogList;

	public INCLUDED_IN_DATA_CATALOG() {
	}

	public INCLUDED_IN_DATA_CATALOG(String string) {
		this(new DATA_CATALOG(string));
	}

	public String getString() {
		if(dataCatalogList == null || dataCatalogList.size() == 0 || dataCatalogList.get(0) == null) {
			return null;
		} else {
			Name name = dataCatalogList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(dataCatalogList == null) {
			dataCatalogList = new ArrayList<DataCatalog>();
		}
		if(dataCatalogList.size() == 0) {
			dataCatalogList.add(new DATA_CATALOG(string));
		} else {
			dataCatalogList.set(0, new DATA_CATALOG(string));
		}
	}

	public INCLUDED_IN_DATA_CATALOG(DataCatalog dataCatalog) {
		dataCatalogList = new ArrayList<DataCatalog>();
		dataCatalogList.add(dataCatalog);
	}

	@Override
	public DataCatalog getDataCatalog() {
		if(dataCatalogList != null && dataCatalogList.size() > 0) {
			return dataCatalogList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataCatalog(DataCatalog dataCatalog) {
		if(dataCatalogList == null) {
			dataCatalogList = new ArrayList<>();
		}
		if(dataCatalogList.size() == 0) {
			dataCatalogList.add(dataCatalog);
		} else {
			dataCatalogList.set(0, dataCatalog);
		}
	}

	@Override
	public List<DataCatalog> getDataCatalogList() {
		return dataCatalogList;
	}

	@Override
	public void setDataCatalogList(List<DataCatalog> dataCatalogList) {
		this.dataCatalogList = dataCatalogList;
	}

	@Override
	public boolean hasDataCatalog() {
		return dataCatalogList != null && dataCatalogList.size() > 0 && dataCatalogList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
