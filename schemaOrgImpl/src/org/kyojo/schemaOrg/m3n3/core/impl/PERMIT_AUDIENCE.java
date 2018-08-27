package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Audience;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class PERMIT_AUDIENCE implements Container.PermitAudience {

	private static final long serialVersionUID = 1L;

	public List<Audience> audienceList;

	public PERMIT_AUDIENCE() {
	}

	public PERMIT_AUDIENCE(String string) {
		this(new AUDIENCE(string));
	}

	public String getString() {
		if(audienceList == null || audienceList.size() == 0 || audienceList.get(0) == null) {
			return null;
		} else {
			Name name = audienceList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(audienceList == null) {
			audienceList = new ArrayList<Audience>();
		}
		if(audienceList.size() == 0) {
			audienceList.add(new AUDIENCE(string));
		} else {
			audienceList.set(0, new AUDIENCE(string));
		}
	}

	public PERMIT_AUDIENCE(Audience audience) {
		audienceList = new ArrayList<Audience>();
		audienceList.add(audience);
	}

	@Override
	public Audience getAudience() {
		if(audienceList != null && audienceList.size() > 0) {
			return audienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAudience(Audience audience) {
		if(audienceList == null) {
			audienceList = new ArrayList<>();
		}
		if(audienceList.size() == 0) {
			audienceList.add(audience);
		} else {
			audienceList.set(0, audience);
		}
	}

	@Override
	public List<Audience> getAudienceList() {
		return audienceList;
	}

	@Override
	public void setAudienceList(List<Audience> audienceList) {
		this.audienceList = audienceList;
	}

	@Override
	public boolean hasAudience() {
		return audienceList != null && audienceList.size() > 0 && audienceList.get(0) != null;
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
