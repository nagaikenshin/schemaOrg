package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Seat;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class TICKETED_SEAT implements Container.TicketedSeat {

	private static final long serialVersionUID = 1L;

	public List<Seat> seatList;

	public TICKETED_SEAT() {
	}

	public TICKETED_SEAT(String string) {
		this(new SEAT(string));
	}

	public String getString() {
		if(seatList == null || seatList.size() == 0 || seatList.get(0) == null) {
			return null;
		} else {
			Name name = seatList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(seatList == null) {
			seatList = new ArrayList<Seat>();
		}
		if(seatList.size() == 0) {
			seatList.add(new SEAT(string));
		} else {
			seatList.set(0, new SEAT(string));
		}
	}

	public TICKETED_SEAT(Seat seat) {
		seatList = new ArrayList<Seat>();
		seatList.add(seat);
	}

	@Override
	public Seat getSeat() {
		if(seatList != null && seatList.size() > 0) {
			return seatList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSeat(Seat seat) {
		if(seatList == null) {
			seatList = new ArrayList<>();
		}
		if(seatList.size() == 0) {
			seatList.add(seat);
		} else {
			seatList.set(0, seat);
		}
	}

	@Override
	public List<Seat> getSeatList() {
		return seatList;
	}

	@Override
	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	@Override
	public boolean hasSeat() {
		return seatList != null && seatList.size() > 0 && seatList.get(0) != null;
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
