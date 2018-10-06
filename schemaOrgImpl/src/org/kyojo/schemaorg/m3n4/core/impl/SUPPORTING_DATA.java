package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.DataFeed;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.CompleteDataFeed;

public class SUPPORTING_DATA implements Container.SupportingData {

	private static final long serialVersionUID = 1L;

	public List<CompleteDataFeed> completeDataFeedList;
	public List<DataFeed> dataFeedList;

	public SUPPORTING_DATA() {
	}

	public SUPPORTING_DATA(String string) {
		this(new DATA_FEED(string));
	}

	public String getString() {
		if(dataFeedList == null || dataFeedList.size() == 0 || dataFeedList.get(0) == null) {
			return null;
		} else {
			Name name = dataFeedList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(dataFeedList == null) {
			dataFeedList = new ArrayList<DataFeed>();
		}
		if(dataFeedList.size() == 0) {
			dataFeedList.add(new DATA_FEED(string));
		} else {
			dataFeedList.set(0, new DATA_FEED(string));
		}
	}

	public SUPPORTING_DATA(CompleteDataFeed completeDataFeed) {
		completeDataFeedList = new ArrayList<CompleteDataFeed>();
		completeDataFeedList.add(completeDataFeed);
	}

	@Override
	public CompleteDataFeed getCompleteDataFeed() {
		if(completeDataFeedList != null && completeDataFeedList.size() > 0) {
			return completeDataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCompleteDataFeed(CompleteDataFeed completeDataFeed) {
		if(completeDataFeedList == null) {
			completeDataFeedList = new ArrayList<>();
		}
		if(completeDataFeedList.size() == 0) {
			completeDataFeedList.add(completeDataFeed);
		} else {
			completeDataFeedList.set(0, completeDataFeed);
		}
	}

	@Override
	public List<CompleteDataFeed> getCompleteDataFeedList() {
		return completeDataFeedList;
	}

	@Override
	public void setCompleteDataFeedList(List<CompleteDataFeed> completeDataFeedList) {
		this.completeDataFeedList = completeDataFeedList;
	}

	@Override
	public boolean hasCompleteDataFeed() {
		return completeDataFeedList != null && completeDataFeedList.size() > 0 && completeDataFeedList.get(0) != null;
	}

	public SUPPORTING_DATA(DataFeed dataFeed) {
		dataFeedList = new ArrayList<DataFeed>();
		dataFeedList.add(dataFeed);
	}

	@Override
	public DataFeed getDataFeed() {
		if(dataFeedList != null && dataFeedList.size() > 0) {
			return dataFeedList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDataFeed(DataFeed dataFeed) {
		if(dataFeedList == null) {
			dataFeedList = new ArrayList<>();
		}
		if(dataFeedList.size() == 0) {
			dataFeedList.add(dataFeed);
		} else {
			dataFeedList.set(0, dataFeed);
		}
	}

	@Override
	public List<DataFeed> getDataFeedList() {
		return dataFeedList;
	}

	@Override
	public void setDataFeedList(List<DataFeed> dataFeedList) {
		this.dataFeedList = dataFeedList;
	}

	@Override
	public boolean hasDataFeed() {
		return dataFeedList != null && dataFeedList.size() > 0 && dataFeedList.get(0) != null;
	}

	public SUPPORTING_DATA(List<CompleteDataFeed> completeDataFeedList,
			List<DataFeed> dataFeedList) {
		setCompleteDataFeedList(completeDataFeedList);
		setDataFeedList(dataFeedList);
	}

	public void copy(Container.SupportingData org) {
		setCompleteDataFeedList(org.getCompleteDataFeedList());
		setDataFeedList(org.getDataFeedList());
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
