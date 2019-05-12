package org.kyojo.schemaorg.m3n5.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusTrip;
import org.kyojo.schemaorg.m3n5.core.Clazz.Flight;
import org.kyojo.schemaorg.m3n5.core.Clazz.TrainTrip;
import org.kyojo.schemaorg.m3n5.core.Clazz.Trip;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.impl.TRIP;
import org.kyojo.schemaorg.m3n5.pending.Clazz.TouristTrip;
import org.kyojo.schemaorg.m3n5.pending.Container;

public class PART_OF_TRIP implements Container.PartOfTrip {

	private static final long serialVersionUID = 1L;

	public List<BusTrip> busTripList;
	public List<Flight> flightList;
	public List<TouristTrip> touristTripList;
	public List<TrainTrip> trainTripList;
	public List<Trip> tripList;

	public PART_OF_TRIP() {
	}

	public PART_OF_TRIP(String string) {
		this(new TRIP(string));
	}

	public String getString() {
		if(tripList == null || tripList.size() == 0 || tripList.get(0) == null) {
			return null;
		} else {
			Name name = tripList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(tripList == null) {
			tripList = new ArrayList<Trip>();
		}
		if(tripList.size() == 0) {
			tripList.add(new TRIP(string));
		} else {
			tripList.set(0, new TRIP(string));
		}
	}

	public PART_OF_TRIP(BusTrip busTrip) {
		busTripList = new ArrayList<BusTrip>();
		busTripList.add(busTrip);
	}

	@Override
	public BusTrip getBusTrip() {
		if(busTripList != null && busTripList.size() > 0) {
			return busTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusTrip(BusTrip busTrip) {
		if(busTripList == null) {
			busTripList = new ArrayList<>();
		}
		if(busTripList.size() == 0) {
			busTripList.add(busTrip);
		} else {
			busTripList.set(0, busTrip);
		}
	}

	@Override
	public List<BusTrip> getBusTripList() {
		return busTripList;
	}

	@Override
	public void setBusTripList(List<BusTrip> busTripList) {
		this.busTripList = busTripList;
	}

	@Override
	public boolean hasBusTrip() {
		return busTripList != null && busTripList.size() > 0 && busTripList.get(0) != null;
	}

	public PART_OF_TRIP(Flight flight) {
		flightList = new ArrayList<Flight>();
		flightList.add(flight);
	}

	@Override
	public Flight getFlight() {
		if(flightList != null && flightList.size() > 0) {
			return flightList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlight(Flight flight) {
		if(flightList == null) {
			flightList = new ArrayList<>();
		}
		if(flightList.size() == 0) {
			flightList.add(flight);
		} else {
			flightList.set(0, flight);
		}
	}

	@Override
	public List<Flight> getFlightList() {
		return flightList;
	}

	@Override
	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}

	@Override
	public boolean hasFlight() {
		return flightList != null && flightList.size() > 0 && flightList.get(0) != null;
	}

	public PART_OF_TRIP(TouristTrip touristTrip) {
		touristTripList = new ArrayList<TouristTrip>();
		touristTripList.add(touristTrip);
	}

	@Override
	public TouristTrip getTouristTrip() {
		if(touristTripList != null && touristTripList.size() > 0) {
			return touristTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTouristTrip(TouristTrip touristTrip) {
		if(touristTripList == null) {
			touristTripList = new ArrayList<>();
		}
		if(touristTripList.size() == 0) {
			touristTripList.add(touristTrip);
		} else {
			touristTripList.set(0, touristTrip);
		}
	}

	@Override
	public List<TouristTrip> getTouristTripList() {
		return touristTripList;
	}

	@Override
	public void setTouristTripList(List<TouristTrip> touristTripList) {
		this.touristTripList = touristTripList;
	}

	@Override
	public boolean hasTouristTrip() {
		return touristTripList != null && touristTripList.size() > 0 && touristTripList.get(0) != null;
	}

	public PART_OF_TRIP(TrainTrip trainTrip) {
		trainTripList = new ArrayList<TrainTrip>();
		trainTripList.add(trainTrip);
	}

	@Override
	public TrainTrip getTrainTrip() {
		if(trainTripList != null && trainTripList.size() > 0) {
			return trainTripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainTrip(TrainTrip trainTrip) {
		if(trainTripList == null) {
			trainTripList = new ArrayList<>();
		}
		if(trainTripList.size() == 0) {
			trainTripList.add(trainTrip);
		} else {
			trainTripList.set(0, trainTrip);
		}
	}

	@Override
	public List<TrainTrip> getTrainTripList() {
		return trainTripList;
	}

	@Override
	public void setTrainTripList(List<TrainTrip> trainTripList) {
		this.trainTripList = trainTripList;
	}

	@Override
	public boolean hasTrainTrip() {
		return trainTripList != null && trainTripList.size() > 0 && trainTripList.get(0) != null;
	}

	public PART_OF_TRIP(Trip trip) {
		tripList = new ArrayList<Trip>();
		tripList.add(trip);
	}

	@Override
	public Trip getTrip() {
		if(tripList != null && tripList.size() > 0) {
			return tripList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrip(Trip trip) {
		if(tripList == null) {
			tripList = new ArrayList<>();
		}
		if(tripList.size() == 0) {
			tripList.add(trip);
		} else {
			tripList.set(0, trip);
		}
	}

	@Override
	public List<Trip> getTripList() {
		return tripList;
	}

	@Override
	public void setTripList(List<Trip> tripList) {
		this.tripList = tripList;
	}

	@Override
	public boolean hasTrip() {
		return tripList != null && tripList.size() > 0 && tripList.get(0) != null;
	}

	public PART_OF_TRIP(List<BusTrip> busTripList,
			List<Flight> flightList,
			List<TouristTrip> touristTripList,
			List<TrainTrip> trainTripList,
			List<Trip> tripList) {
		setBusTripList(busTripList);
		setFlightList(flightList);
		setTouristTripList(touristTripList);
		setTrainTripList(trainTripList);
		setTripList(tripList);
	}

	public void copy(Container.PartOfTrip org) {
		setBusTripList(org.getBusTripList());
		setFlightList(org.getFlightList());
		setTouristTripList(org.getTouristTripList());
		setTrainTripList(org.getTrainTripList());
		setTripList(org.getTripList());
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
