package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.TrainStation;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class DEPARTURE_STATION implements Container.DepartureStation {

	private static final long serialVersionUID = 1L;

	public List<TrainStation> trainStationList;

	public DEPARTURE_STATION() {
	}

	public DEPARTURE_STATION(String string) {
		this(new TRAIN_STATION(string));
	}

	public String getString() {
		if(trainStationList == null || trainStationList.size() == 0 || trainStationList.get(0) == null) {
			return null;
		} else {
			Name name = trainStationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(trainStationList == null) {
			trainStationList = new ArrayList<TrainStation>();
		}
		if(trainStationList.size() == 0) {
			trainStationList.add(new TRAIN_STATION(string));
		} else {
			trainStationList.set(0, new TRAIN_STATION(string));
		}
	}

	public DEPARTURE_STATION(TrainStation trainStation) {
		trainStationList = new ArrayList<TrainStation>();
		trainStationList.add(trainStation);
	}

	@Override
	public TrainStation getTrainStation() {
		if(trainStationList != null && trainStationList.size() > 0) {
			return trainStationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainStation(TrainStation trainStation) {
		if(trainStationList == null) {
			trainStationList = new ArrayList<>();
		}
		if(trainStationList.size() == 0) {
			trainStationList.add(trainStation);
		} else {
			trainStationList.set(0, trainStation);
		}
	}

	@Override
	public List<TrainStation> getTrainStationList() {
		return trainStationList;
	}

	@Override
	public void setTrainStationList(List<TrainStation> trainStationList) {
		this.trainStationList = trainStationList;
	}

	@Override
	public boolean hasTrainStation() {
		return trainStationList != null && trainStationList.size() > 0 && trainStationList.get(0) != null;
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
