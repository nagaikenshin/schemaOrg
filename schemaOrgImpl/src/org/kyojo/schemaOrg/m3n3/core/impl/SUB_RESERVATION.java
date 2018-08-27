package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Reservation;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class SUB_RESERVATION implements Container.SubReservation {

	private static final long serialVersionUID = 1L;

	public List<Reservation> reservationList;

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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
