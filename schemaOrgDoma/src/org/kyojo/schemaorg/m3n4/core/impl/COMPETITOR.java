package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsTeam;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class COMPETITOR implements Container.Competitor {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Person> personList;
	@Transient
	public List<SportsTeam> sportsTeamList;

	public COMPETITOR() {
	}

	public COMPETITOR(String string) {
		this(new PERSON(string));
	}

	public String getString() {
		if(personList == null || personList.size() == 0 || personList.get(0) == null) {
			return null;
		} else {
			Name name = personList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(personList == null) {
			personList = new ArrayList<Person>();
		}
		if(personList.size() == 0) {
			personList.add(new PERSON(string));
		} else {
			personList.set(0, new PERSON(string));
		}
	}

	public COMPETITOR(Person person) {
		personList = new ArrayList<Person>();
		personList.add(person);
	}

	@Override
	public Person getPerson() {
		if(personList != null && personList.size() > 0) {
			return personList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerson(Person person) {
		if(personList == null) {
			personList = new ArrayList<>();
		}
		if(personList.size() == 0) {
			personList.add(person);
		} else {
			personList.set(0, person);
		}
	}

	@Override
	public List<Person> getPersonList() {
		return personList;
	}

	@Override
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	@Override
	public boolean hasPerson() {
		return personList != null && personList.size() > 0 && personList.get(0) != null;
	}

	public COMPETITOR(SportsTeam sportsTeam) {
		sportsTeamList = new ArrayList<SportsTeam>();
		sportsTeamList.add(sportsTeam);
	}

	@Override
	public SportsTeam getSportsTeam() {
		if(sportsTeamList != null && sportsTeamList.size() > 0) {
			return sportsTeamList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsTeam(SportsTeam sportsTeam) {
		if(sportsTeamList == null) {
			sportsTeamList = new ArrayList<>();
		}
		if(sportsTeamList.size() == 0) {
			sportsTeamList.add(sportsTeam);
		} else {
			sportsTeamList.set(0, sportsTeam);
		}
	}

	@Override
	public List<SportsTeam> getSportsTeamList() {
		return sportsTeamList;
	}

	@Override
	public void setSportsTeamList(List<SportsTeam> sportsTeamList) {
		this.sportsTeamList = sportsTeamList;
	}

	@Override
	public boolean hasSportsTeam() {
		return sportsTeamList != null && sportsTeamList.size() > 0 && sportsTeamList.get(0) != null;
	}

	public COMPETITOR(List<Person> personList,
			List<SportsTeam> sportsTeamList) {
		setPersonList(personList);
		setSportsTeamList(sportsTeamList);
	}

	public void copy(Container.Competitor org) {
		setPersonList(org.getPersonList());
		setSportsTeamList(org.getSportsTeamList());
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
