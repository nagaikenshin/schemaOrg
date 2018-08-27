package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpResponseType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class RSVP_RESPONSE implements Container.RsvpResponse {

	private static final long serialVersionUID = 1L;

	public List<RsvpResponseType> rsvpResponseTypeList;

	public RSVP_RESPONSE() {
	}

	public RSVP_RESPONSE(String string) {
		this(new RSVP_RESPONSE_TYPE(string));
	}

	public String getString() {
		if(rsvpResponseTypeList == null || rsvpResponseTypeList.size() == 0 || rsvpResponseTypeList.get(0) == null) {
			return null;
		} else {
			Name name = rsvpResponseTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(rsvpResponseTypeList == null) {
			rsvpResponseTypeList = new ArrayList<RsvpResponseType>();
		}
		if(rsvpResponseTypeList.size() == 0) {
			rsvpResponseTypeList.add(new RSVP_RESPONSE_TYPE(string));
		} else {
			rsvpResponseTypeList.set(0, new RSVP_RESPONSE_TYPE(string));
		}
	}

	public RSVP_RESPONSE(RsvpResponseType rsvpResponseType) {
		rsvpResponseTypeList = new ArrayList<RsvpResponseType>();
		rsvpResponseTypeList.add(rsvpResponseType);
	}

	@Override
	public RsvpResponseType getRsvpResponseType() {
		if(rsvpResponseTypeList != null && rsvpResponseTypeList.size() > 0) {
			return rsvpResponseTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRsvpResponseType(RsvpResponseType rsvpResponseType) {
		if(rsvpResponseTypeList == null) {
			rsvpResponseTypeList = new ArrayList<>();
		}
		if(rsvpResponseTypeList.size() == 0) {
			rsvpResponseTypeList.add(rsvpResponseType);
		} else {
			rsvpResponseTypeList.set(0, rsvpResponseType);
		}
	}

	@Override
	public List<RsvpResponseType> getRsvpResponseTypeList() {
		return rsvpResponseTypeList;
	}

	@Override
	public void setRsvpResponseTypeList(List<RsvpResponseType> rsvpResponseTypeList) {
		this.rsvpResponseTypeList = rsvpResponseTypeList;
	}

	@Override
	public boolean hasRsvpResponseType() {
		return rsvpResponseTypeList != null && rsvpResponseTypeList.size() > 0 && rsvpResponseTypeList.get(0) != null;
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
