package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DataDownload;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

public class DISTRIBUTION implements Container.Distribution {

	private static final long serialVersionUID = 1L;

	public List<DataDownload> dataDownloadList;

	public DISTRIBUTION() {
	}

	public DISTRIBUTION(String string) {
		this(new DATA_DOWNLOAD(string));
	}

	public String getString() {
		if(dataDownloadList == null || dataDownloadList.size() == 0 || dataDownloadList.get(0) == null) {
			return null;
		} else {
			Name name = dataDownloadList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(dataDownloadList == null) {
			dataDownloadList = new ArrayList<DataDownload>();
		}
		if(dataDownloadList.size() == 0) {
			dataDownloadList.add(new DATA_DOWNLOAD(string));
		} else {
			dataDownloadList.set(0, new DATA_DOWNLOAD(string));
		}
	}

	public DISTRIBUTION(DataDownload dataDownload) {
		dataDownloadList = new ArrayList<DataDownload>();
		dataDownloadList.add(dataDownload);
	}

	@Override
	public DataDownload getDataDownload() {
		if(dataDownloadList != null && dataDownloadList.size() > 0) {
			return dataDownloadList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataDownload(DataDownload dataDownload) {
		if(dataDownloadList == null) {
			dataDownloadList = new ArrayList<>();
		}
		if(dataDownloadList.size() == 0) {
			dataDownloadList.add(dataDownload);
		} else {
			dataDownloadList.set(0, dataDownload);
		}
	}

	@Override
	public List<DataDownload> getDataDownloadList() {
		return dataDownloadList;
	}

	@Override
	public void setDataDownloadList(List<DataDownload> dataDownloadList) {
		this.dataDownloadList = dataDownloadList;
	}

	@Override
	public boolean hasDataDownload() {
		return dataDownloadList != null && dataDownloadList.size() > 0 && dataDownloadList.get(0) != null;
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
