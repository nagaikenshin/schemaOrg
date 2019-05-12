package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Person;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Patient;

public class SIBLING implements Container.Sibling {

	private static final long serialVersionUID = 1L;

	public List<Patient> patientList;
	public List<Person> personList;

	public SIBLING() {
	}

	public SIBLING(String string) {
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

	public SIBLING(Patient patient) {
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

	public SIBLING(Person person) {
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

	public SIBLING(List<Patient> patientList,
			List<Person> personList) {
		setPatientList(patientList);
		setPersonList(personList);
	}

	public void copy(Container.Sibling org) {
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
