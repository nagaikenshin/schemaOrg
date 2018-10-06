package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.FlightReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishmentReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.LodgingReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.RentalCarReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.Reservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReservationPackage;
import org.kyojo.schemaorg.m3n4.core.Clazz.TaxiReservation;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrainReservation;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class SUB_RESERVATION implements Container.SubReservation {

	private static final long serialVersionUID = 1L;

	public List<BusReservation> busReservationList;
	public List<EventReservation> eventReservationList;
	public List<FlightReservation> flightReservationList;
	public List<FoodEstablishmentReservation> foodEstablishmentReservationList;
	public List<LodgingReservation> lodgingReservationList;
	public List<RentalCarReservation> rentalCarReservationList;
	public List<Reservation> reservationList;
	public List<ReservationPackage> reservationPackageList;
	public List<TaxiReservation> taxiReservationList;
	public List<TrainReservation> trainReservationList;

	public SUB_RESERVATION() {
	}

	public SUB_RESERVATION(String string) {
		this(new RESERVATION(string));
	}

	public String getString() {
		if(reservationList == null || reservationList.size() == 0 || reservationList.get(0) == null) {
			return null;
		} else {
			Name name = reservationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(reservationList == null) {
			reservationList = new ArrayList<Reservation>();
		}
		if(reservationList.size() == 0) {
			reservationList.add(new RESERVATION(string));
		} else {
			reservationList.set(0, new RESERVATION(string));
		}
	}

	public SUB_RESERVATION(BusReservation busReservation) {
		busReservationList = new ArrayList<BusReservation>();
		busReservationList.add(busReservation);
	}

	@Override
	public BusReservation getBusReservation() {
		if(busReservationList != null && busReservationList.size() > 0) {
			return busReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusReservation(BusReservation busReservation) {
		if(busReservationList == null) {
			busReservationList = new ArrayList<>();
		}
		if(busReservationList.size() == 0) {
			busReservationList.add(busReservation);
		} else {
			busReservationList.set(0, busReservation);
		}
	}

	@Override
	public List<BusReservation> getBusReservationList() {
		return busReservationList;
	}

	@Override
	public void setBusReservationList(List<BusReservation> busReservationList) {
		this.busReservationList = busReservationList;
	}

	@Override
	public boolean hasBusReservation() {
		return busReservationList != null && busReservationList.size() > 0 && busReservationList.get(0) != null;
	}

	public SUB_RESERVATION(EventReservation eventReservation) {
		eventReservationList = new ArrayList<EventReservation>();
		eventReservationList.add(eventReservation);
	}

	@Override
	public EventReservation getEventReservation() {
		if(eventReservationList != null && eventReservationList.size() > 0) {
			return eventReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventReservation(EventReservation eventReservation) {
		if(eventReservationList == null) {
			eventReservationList = new ArrayList<>();
		}
		if(eventReservationList.size() == 0) {
			eventReservationList.add(eventReservation);
		} else {
			eventReservationList.set(0, eventReservation);
		}
	}

	@Override
	public List<EventReservation> getEventReservationList() {
		return eventReservationList;
	}

	@Override
	public void setEventReservationList(List<EventReservation> eventReservationList) {
		this.eventReservationList = eventReservationList;
	}

	@Override
	public boolean hasEventReservation() {
		return eventReservationList != null && eventReservationList.size() > 0 && eventReservationList.get(0) != null;
	}

	public SUB_RESERVATION(FlightReservation flightReservation) {
		flightReservationList = new ArrayList<FlightReservation>();
		flightReservationList.add(flightReservation);
	}

	@Override
	public FlightReservation getFlightReservation() {
		if(flightReservationList != null && flightReservationList.size() > 0) {
			return flightReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFlightReservation(FlightReservation flightReservation) {
		if(flightReservationList == null) {
			flightReservationList = new ArrayList<>();
		}
		if(flightReservationList.size() == 0) {
			flightReservationList.add(flightReservation);
		} else {
			flightReservationList.set(0, flightReservation);
		}
	}

	@Override
	public List<FlightReservation> getFlightReservationList() {
		return flightReservationList;
	}

	@Override
	public void setFlightReservationList(List<FlightReservation> flightReservationList) {
		this.flightReservationList = flightReservationList;
	}

	@Override
	public boolean hasFlightReservation() {
		return flightReservationList != null && flightReservationList.size() > 0 && flightReservationList.get(0) != null;
	}

	public SUB_RESERVATION(FoodEstablishmentReservation foodEstablishmentReservation) {
		foodEstablishmentReservationList = new ArrayList<FoodEstablishmentReservation>();
		foodEstablishmentReservationList.add(foodEstablishmentReservation);
	}

	@Override
	public FoodEstablishmentReservation getFoodEstablishmentReservation() {
		if(foodEstablishmentReservationList != null && foodEstablishmentReservationList.size() > 0) {
			return foodEstablishmentReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodEstablishmentReservation(FoodEstablishmentReservation foodEstablishmentReservation) {
		if(foodEstablishmentReservationList == null) {
			foodEstablishmentReservationList = new ArrayList<>();
		}
		if(foodEstablishmentReservationList.size() == 0) {
			foodEstablishmentReservationList.add(foodEstablishmentReservation);
		} else {
			foodEstablishmentReservationList.set(0, foodEstablishmentReservation);
		}
	}

	@Override
	public List<FoodEstablishmentReservation> getFoodEstablishmentReservationList() {
		return foodEstablishmentReservationList;
	}

	@Override
	public void setFoodEstablishmentReservationList(List<FoodEstablishmentReservation> foodEstablishmentReservationList) {
		this.foodEstablishmentReservationList = foodEstablishmentReservationList;
	}

	@Override
	public boolean hasFoodEstablishmentReservation() {
		return foodEstablishmentReservationList != null && foodEstablishmentReservationList.size() > 0 && foodEstablishmentReservationList.get(0) != null;
	}

	public SUB_RESERVATION(LodgingReservation lodgingReservation) {
		lodgingReservationList = new ArrayList<LodgingReservation>();
		lodgingReservationList.add(lodgingReservation);
	}

	@Override
	public LodgingReservation getLodgingReservation() {
		if(lodgingReservationList != null && lodgingReservationList.size() > 0) {
			return lodgingReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLodgingReservation(LodgingReservation lodgingReservation) {
		if(lodgingReservationList == null) {
			lodgingReservationList = new ArrayList<>();
		}
		if(lodgingReservationList.size() == 0) {
			lodgingReservationList.add(lodgingReservation);
		} else {
			lodgingReservationList.set(0, lodgingReservation);
		}
	}

	@Override
	public List<LodgingReservation> getLodgingReservationList() {
		return lodgingReservationList;
	}

	@Override
	public void setLodgingReservationList(List<LodgingReservation> lodgingReservationList) {
		this.lodgingReservationList = lodgingReservationList;
	}

	@Override
	public boolean hasLodgingReservation() {
		return lodgingReservationList != null && lodgingReservationList.size() > 0 && lodgingReservationList.get(0) != null;
	}

	public SUB_RESERVATION(RentalCarReservation rentalCarReservation) {
		rentalCarReservationList = new ArrayList<RentalCarReservation>();
		rentalCarReservationList.add(rentalCarReservation);
	}

	@Override
	public RentalCarReservation getRentalCarReservation() {
		if(rentalCarReservationList != null && rentalCarReservationList.size() > 0) {
			return rentalCarReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRentalCarReservation(RentalCarReservation rentalCarReservation) {
		if(rentalCarReservationList == null) {
			rentalCarReservationList = new ArrayList<>();
		}
		if(rentalCarReservationList.size() == 0) {
			rentalCarReservationList.add(rentalCarReservation);
		} else {
			rentalCarReservationList.set(0, rentalCarReservation);
		}
	}

	@Override
	public List<RentalCarReservation> getRentalCarReservationList() {
		return rentalCarReservationList;
	}

	@Override
	public void setRentalCarReservationList(List<RentalCarReservation> rentalCarReservationList) {
		this.rentalCarReservationList = rentalCarReservationList;
	}

	@Override
	public boolean hasRentalCarReservation() {
		return rentalCarReservationList != null && rentalCarReservationList.size() > 0 && rentalCarReservationList.get(0) != null;
	}

	public SUB_RESERVATION(Reservation reservation) {
		reservationList = new ArrayList<Reservation>();
		reservationList.add(reservation);
	}

	@Override
	public Reservation getReservation() {
		if(reservationList != null && reservationList.size() > 0) {
			return reservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservation(Reservation reservation) {
		if(reservationList == null) {
			reservationList = new ArrayList<>();
		}
		if(reservationList.size() == 0) {
			reservationList.add(reservation);
		} else {
			reservationList.set(0, reservation);
		}
	}

	@Override
	public List<Reservation> getReservationList() {
		return reservationList;
	}

	@Override
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	@Override
	public boolean hasReservation() {
		return reservationList != null && reservationList.size() > 0 && reservationList.get(0) != null;
	}

	public SUB_RESERVATION(ReservationPackage reservationPackage) {
		reservationPackageList = new ArrayList<ReservationPackage>();
		reservationPackageList.add(reservationPackage);
	}

	@Override
	public ReservationPackage getReservationPackage() {
		if(reservationPackageList != null && reservationPackageList.size() > 0) {
			return reservationPackageList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservationPackage(ReservationPackage reservationPackage) {
		if(reservationPackageList == null) {
			reservationPackageList = new ArrayList<>();
		}
		if(reservationPackageList.size() == 0) {
			reservationPackageList.add(reservationPackage);
		} else {
			reservationPackageList.set(0, reservationPackage);
		}
	}

	@Override
	public List<ReservationPackage> getReservationPackageList() {
		return reservationPackageList;
	}

	@Override
	public void setReservationPackageList(List<ReservationPackage> reservationPackageList) {
		this.reservationPackageList = reservationPackageList;
	}

	@Override
	public boolean hasReservationPackage() {
		return reservationPackageList != null && reservationPackageList.size() > 0 && reservationPackageList.get(0) != null;
	}

	public SUB_RESERVATION(TaxiReservation taxiReservation) {
		taxiReservationList = new ArrayList<TaxiReservation>();
		taxiReservationList.add(taxiReservation);
	}

	@Override
	public TaxiReservation getTaxiReservation() {
		if(taxiReservationList != null && taxiReservationList.size() > 0) {
			return taxiReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTaxiReservation(TaxiReservation taxiReservation) {
		if(taxiReservationList == null) {
			taxiReservationList = new ArrayList<>();
		}
		if(taxiReservationList.size() == 0) {
			taxiReservationList.add(taxiReservation);
		} else {
			taxiReservationList.set(0, taxiReservation);
		}
	}

	@Override
	public List<TaxiReservation> getTaxiReservationList() {
		return taxiReservationList;
	}

	@Override
	public void setTaxiReservationList(List<TaxiReservation> taxiReservationList) {
		this.taxiReservationList = taxiReservationList;
	}

	@Override
	public boolean hasTaxiReservation() {
		return taxiReservationList != null && taxiReservationList.size() > 0 && taxiReservationList.get(0) != null;
	}

	public SUB_RESERVATION(TrainReservation trainReservation) {
		trainReservationList = new ArrayList<TrainReservation>();
		trainReservationList.add(trainReservation);
	}

	@Override
	public TrainReservation getTrainReservation() {
		if(trainReservationList != null && trainReservationList.size() > 0) {
			return trainReservationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrainReservation(TrainReservation trainReservation) {
		if(trainReservationList == null) {
			trainReservationList = new ArrayList<>();
		}
		if(trainReservationList.size() == 0) {
			trainReservationList.add(trainReservation);
		} else {
			trainReservationList.set(0, trainReservation);
		}
	}

	@Override
	public List<TrainReservation> getTrainReservationList() {
		return trainReservationList;
	}

	@Override
	public void setTrainReservationList(List<TrainReservation> trainReservationList) {
		this.trainReservationList = trainReservationList;
	}

	@Override
	public boolean hasTrainReservation() {
		return trainReservationList != null && trainReservationList.size() > 0 && trainReservationList.get(0) != null;
	}

	public SUB_RESERVATION(List<BusReservation> busReservationList,
			List<EventReservation> eventReservationList,
			List<FlightReservation> flightReservationList,
			List<FoodEstablishmentReservation> foodEstablishmentReservationList,
			List<LodgingReservation> lodgingReservationList,
			List<RentalCarReservation> rentalCarReservationList,
			List<Reservation> reservationList,
			List<ReservationPackage> reservationPackageList,
			List<TaxiReservation> taxiReservationList,
			List<TrainReservation> trainReservationList) {
		setBusReservationList(busReservationList);
		setEventReservationList(eventReservationList);
		setFlightReservationList(flightReservationList);
		setFoodEstablishmentReservationList(foodEstablishmentReservationList);
		setLodgingReservationList(lodgingReservationList);
		setRentalCarReservationList(rentalCarReservationList);
		setReservationList(reservationList);
		setReservationPackageList(reservationPackageList);
		setTaxiReservationList(taxiReservationList);
		setTrainReservationList(trainReservationList);
	}

	public void copy(Container.SubReservation org) {
		setBusReservationList(org.getBusReservationList());
		setEventReservationList(org.getEventReservationList());
		setFlightReservationList(org.getFlightReservationList());
		setFoodEstablishmentReservationList(org.getFoodEstablishmentReservationList());
		setLodgingReservationList(org.getLodgingReservationList());
		setRentalCarReservationList(org.getRentalCarReservationList());
		setReservationList(org.getReservationList());
		setReservationPackageList(org.getReservationPackageList());
		setTaxiReservationList(org.getTaxiReservationList());
		setTrainReservationList(org.getTrainReservationList());
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
