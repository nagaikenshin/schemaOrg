package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.AdministrativeArea;
import org.kyojo.schemaorg.m3n5.core.Clazz.City;
import org.kyojo.schemaorg.m3n5.core.Clazz.Country;
import org.kyojo.schemaorg.m3n5.core.Clazz.State;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class GEOGRAPHIC_AREA implements Container.GeographicArea {

	private static final long serialVersionUID = 1L;

	public List<AdministrativeArea> administrativeAreaList;
	public List<City> cityList;
	public List<Country> countryList;
	public List<State> stateList;

	public GEOGRAPHIC_AREA() {
	}

	public GEOGRAPHIC_AREA(String string) {
		this(new ADMINISTRATIVE_AREA(string));
	}

	public String getString() {
		if(administrativeAreaList == null || administrativeAreaList.size() == 0 || administrativeAreaList.get(0) == null) {
			return null;
		} else {
			Name name = administrativeAreaList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<AdministrativeArea>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(new ADMINISTRATIVE_AREA(string));
		} else {
			administrativeAreaList.set(0, new ADMINISTRATIVE_AREA(string));
		}
	}

	public GEOGRAPHIC_AREA(AdministrativeArea administrativeArea) {
		administrativeAreaList = new ArrayList<AdministrativeArea>();
		administrativeAreaList.add(administrativeArea);
	}

	@Override
	public AdministrativeArea getAdministrativeArea() {
		if(administrativeAreaList != null && administrativeAreaList.size() > 0) {
			return administrativeAreaList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAdministrativeArea(AdministrativeArea administrativeArea) {
		if(administrativeAreaList == null) {
			administrativeAreaList = new ArrayList<>();
		}
		if(administrativeAreaList.size() == 0) {
			administrativeAreaList.add(administrativeArea);
		} else {
			administrativeAreaList.set(0, administrativeArea);
		}
	}

	@Override
	public List<AdministrativeArea> getAdministrativeAreaList() {
		return administrativeAreaList;
	}

	@Override
	public void setAdministrativeAreaList(List<AdministrativeArea> administrativeAreaList) {
		this.administrativeAreaList = administrativeAreaList;
	}

	@Override
	public boolean hasAdministrativeArea() {
		return administrativeAreaList != null && administrativeAreaList.size() > 0 && administrativeAreaList.get(0) != null;
	}

	public GEOGRAPHIC_AREA(City city) {
		cityList = new ArrayList<City>();
		cityList.add(city);
	}

	@Override
	public City getCity() {
		if(cityList != null && cityList.size() > 0) {
			return cityList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCity(City city) {
		if(cityList == null) {
			cityList = new ArrayList<>();
		}
		if(cityList.size() == 0) {
			cityList.add(city);
		} else {
			cityList.set(0, city);
		}
	}

	@Override
	public List<City> getCityList() {
		return cityList;
	}

	@Override
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	@Override
	public boolean hasCity() {
		return cityList != null && cityList.size() > 0 && cityList.get(0) != null;
	}

	public GEOGRAPHIC_AREA(Country country) {
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

	public GEOGRAPHIC_AREA(State state) {
		stateList = new ArrayList<State>();
		stateList.add(state);
	}

	@Override
	public State getState() {
		if(stateList != null && stateList.size() > 0) {
			return stateList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setState(State state) {
		if(stateList == null) {
			stateList = new ArrayList<>();
		}
		if(stateList.size() == 0) {
			stateList.add(state);
		} else {
			stateList.set(0, state);
		}
	}

	@Override
	public List<State> getStateList() {
		return stateList;
	}

	@Override
	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

	@Override
	public boolean hasState() {
		return stateList != null && stateList.size() > 0 && stateList.get(0) != null;
	}

	public GEOGRAPHIC_AREA(List<AdministrativeArea> administrativeAreaList,
			List<City> cityList,
			List<Country> countryList,
			List<State> stateList) {
		setAdministrativeAreaList(administrativeAreaList);
		setCityList(cityList);
		setCountryList(countryList);
		setStateList(stateList);
	}

	public void copy(Container.GeographicArea org) {
		setAdministrativeAreaList(org.getAdministrativeAreaList());
		setCityList(org.getCityList());
		setCountryList(org.getCountryList());
		setStateList(org.getStateList());
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
