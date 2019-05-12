package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Person;
import org.kyojo.schemaorg.m3n5.core.Clazz.URL;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Patient;

import org.seasar.doma.Transient;

public class COLLEAGUE implements Container.Colleague {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Patient> patientList;
	@Transient
	public List<Person> personList;
	@Transient
	public List<URL> urlList;

	public COLLEAGUE() {
	}

	public COLLEAGUE(String string) {
		this(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
	}

	public String getString() {
		if(urlList == null || urlList.size() == 0 || urlList.get(0) == null) {
			return null;
		} else {
			return urlList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(urlList == null) {
			urlList = new ArrayList<URL>();
		}
		if(urlList.size() == 0) {
			urlList.add(new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n5.core.impl.URL(string));
		}
	}

	public COLLEAGUE(Patient patient) {
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

	public COLLEAGUE(Person person) {
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

	public COLLEAGUE(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public COLLEAGUE(List<Patient> patientList,
			List<Person> personList,
			List<URL> urlList) {
		setPatientList(patientList);
		setPersonList(personList);
		setURLList(urlList);
	}

	public void copy(Container.Colleague org) {
		setPatientList(org.getPatientList());
		setPersonList(org.getPersonList());
		setURLList(org.getURLList());
	}

	@Override
	public String getNativeValue() {
		if(getURL() == null) return null;
		return getURL().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
