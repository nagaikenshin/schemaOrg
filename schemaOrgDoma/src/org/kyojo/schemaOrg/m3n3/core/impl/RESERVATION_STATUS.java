package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReservationStatusType;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class RESERVATION_STATUS implements Container.ReservationStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ReservationStatusType> reservationStatusTypeList;

	public RESERVATION_STATUS() {
	}

	public RESERVATION_STATUS(String string) {
		this(new RESERVATION_STATUS_TYPE(string));
	}

	public String getString() {
		if(reservationStatusTypeList == null || reservationStatusTypeList.size() == 0 || reservationStatusTypeList.get(0) == null) {
			return null;
		} else {
			Name name = reservationStatusTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(reservationStatusTypeList == null) {
			reservationStatusTypeList = new ArrayList<ReservationStatusType>();
		}
		if(reservationStatusTypeList.size() == 0) {
			reservationStatusTypeList.add(new RESERVATION_STATUS_TYPE(string));
		} else {
			reservationStatusTypeList.set(0, new RESERVATION_STATUS_TYPE(string));
		}
	}

	public RESERVATION_STATUS(ReservationStatusType reservationStatusType) {
		reservationStatusTypeList = new ArrayList<ReservationStatusType>();
		reservationStatusTypeList.add(reservationStatusType);
	}

	@Override
	public ReservationStatusType getReservationStatusType() {
		if(reservationStatusTypeList != null && reservationStatusTypeList.size() > 0) {
			return reservationStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReservationStatusType(ReservationStatusType reservationStatusType) {
		if(reservationStatusTypeList == null) {
			reservationStatusTypeList = new ArrayList<>();
		}
		if(reservationStatusTypeList.size() == 0) {
			reservationStatusTypeList.add(reservationStatusType);
		} else {
			reservationStatusTypeList.set(0, reservationStatusType);
		}
	}

	@Override
	public List<ReservationStatusType> getReservationStatusTypeList() {
		return reservationStatusTypeList;
	}

	@Override
	public void setReservationStatusTypeList(List<ReservationStatusType> reservationStatusTypeList) {
		this.reservationStatusTypeList = reservationStatusTypeList;
	}

	@Override
	public boolean hasReservationStatusType() {
		return reservationStatusTypeList != null && reservationStatusTypeList.size() > 0 && reservationStatusTypeList.get(0) != null;
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
