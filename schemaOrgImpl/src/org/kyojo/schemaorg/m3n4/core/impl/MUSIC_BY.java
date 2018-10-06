package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicGroup;
import org.kyojo.schemaorg.m3n4.core.Clazz.Person;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;

public class MUSIC_BY implements Container.MusicBy {

	private static final long serialVersionUID = 1L;

	public List<MusicGroup> musicGroupList;
	public List<Patient> patientList;
	public List<Person> personList;

	public MUSIC_BY() {
	}

	public MUSIC_BY(String string) {
		this(new MUSIC_GROUP(string));
	}

	public String getString() {
		if(musicGroupList == null || musicGroupList.size() == 0 || musicGroupList.get(0) == null) {
			return null;
		} else {
			Name name = musicGroupList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(musicGroupList == null) {
			musicGroupList = new ArrayList<MusicGroup>();
		}
		if(musicGroupList.size() == 0) {
			musicGroupList.add(new MUSIC_GROUP(string));
		} else {
			musicGroupList.set(0, new MUSIC_GROUP(string));
		}
	}

	public MUSIC_BY(MusicGroup musicGroup) {
		musicGroupList = new ArrayList<MusicGroup>();
		musicGroupList.add(musicGroup);
	}

	@Override
	public MusicGroup getMusicGroup() {
		if(musicGroupList != null && musicGroupList.size() > 0) {
			return musicGroupList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicGroup(MusicGroup musicGroup) {
		if(musicGroupList == null) {
			musicGroupList = new ArrayList<>();
		}
		if(musicGroupList.size() == 0) {
			musicGroupList.add(musicGroup);
		} else {
			musicGroupList.set(0, musicGroup);
		}
	}

	@Override
	public List<MusicGroup> getMusicGroupList() {
		return musicGroupList;
	}

	@Override
	public void setMusicGroupList(List<MusicGroup> musicGroupList) {
		this.musicGroupList = musicGroupList;
	}

	@Override
	public boolean hasMusicGroup() {
		return musicGroupList != null && musicGroupList.size() > 0 && musicGroupList.get(0) != null;
	}

	public MUSIC_BY(Patient patient) {
		patientList = new ArrayList<Patient>();
		patientList.add(patient);
	}

	@Override
	public Patient getPatient() {
		if(patientList != null && patientList.size() > 0) {
			return patientList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPatient(Patient patient) {
		if(patientList == null) {
			patientList = new ArrayList<>();
		}
		if(patientList.size() == 0) {
			patientList.add(patient);
		} else {
			patientList.set(0, patient);
		}
	}

	@Override
	public List<Patient> getPatientList() {
		return patientList;
	}

	@Override
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	@Override
	public boolean hasPatient() {
		return patientList != null && patientList.size() > 0 && patientList.get(0) != null;
	}

	public MUSIC_BY(Person person) {
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

	public MUSIC_BY(List<MusicGroup> musicGroupList,
			List<Patient> patientList,
			List<Person> personList) {
		setMusicGroupList(musicGroupList);
		setPatientList(patientList);
		setPersonList(personList);
	}

	public void copy(Container.MusicBy org) {
		setMusicGroupList(org.getMusicGroupList());
		setPatientList(org.getPatientList());
		setPersonList(org.getPersonList());
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
