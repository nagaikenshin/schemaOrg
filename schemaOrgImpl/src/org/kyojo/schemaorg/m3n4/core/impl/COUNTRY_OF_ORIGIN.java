package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Country;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

public class COUNTRY_OF_ORIGIN implements Container.CountryOfOrigin {

	private static final long serialVersionUID = 1L;

	public List<Country> countryList;

	public COUNTRY_OF_ORIGIN() {
	}

	public COUNTRY_OF_ORIGIN(String string) {
		this(new COUNTRY(string));
	}

	public String getString() {
		if(countryList == null || countryList.size() == 0 || countryList.get(0) == null) {
			return null;
		} else {
			Name name = countryList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(countryList == null) {
			countryList = new ArrayList<Country>();
		}
		if(countryList.size() == 0) {
			countryList.add(new COUNTRY(string));
		} else {
			countryList.set(0, new COUNTRY(string));
		}
	}

	public COUNTRY_OF_ORIGIN(Country country) {
		countryList = new ArrayList<Country>();
		countryList.add(country);
	}

	@Override
	public Country getCountry() {
		if(countryList != null && countryList.size() > 0) {
			return countryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCountry(Country country) {
		if(countryList == null) {
			countryList = new ArrayList<>();
		}
		if(countryList.size() == 0) {
			countryList.add(country);
		} else {
			countryList.set(0, country);
		}
	}

	@Override
	public List<Country> getCountryList() {
		return countryList;
	}

	@Override
	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	@Override
	public boolean hasCountry() {
		return countryList != null && countryList.size() > 0 && countryList.get(0) != null;
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
