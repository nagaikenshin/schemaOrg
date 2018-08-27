package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Ticket;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class RESERVED_TICKET implements Container.ReservedTicket {

	private static final long serialVersionUID = 1L;

	public List<Ticket> ticketList;

	public RESERVED_TICKET() {
	}

	public RESERVED_TICKET(String string) {
		this(new TICKET(string));
	}

	public String getString() {
		if(ticketList == null || ticketList.size() == 0 || ticketList.get(0) == null) {
			return null;
		} else {
			Name name = ticketList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(ticketList == null) {
			ticketList = new ArrayList<Ticket>();
		}
		if(ticketList.size() == 0) {
			ticketList.add(new TICKET(string));
		} else {
			ticketList.set(0, new TICKET(string));
		}
	}

	public RESERVED_TICKET(Ticket ticket) {
		ticketList = new ArrayList<Ticket>();
		ticketList.add(ticket);
	}

	@Override
	public Ticket getTicket() {
		if(ticketList != null && ticketList.size() > 0) {
			return ticketList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTicket(Ticket ticket) {
		if(ticketList == null) {
			ticketList = new ArrayList<>();
		}
		if(ticketList.size() == 0) {
			ticketList.add(ticket);
		} else {
			ticketList.set(0, ticket);
		}
	}

	@Override
	public List<Ticket> getTicketList() {
		return ticketList;
	}

	@Override
	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	@Override
	public boolean hasTicket() {
		return ticketList != null && ticketList.size() > 0 && ticketList.get(0) != null;
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
