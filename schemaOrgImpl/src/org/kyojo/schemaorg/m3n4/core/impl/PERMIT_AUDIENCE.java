package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Audience;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationalAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParentAudience;
import org.kyojo.schemaorg.m3n4.core.Clazz.PeopleAudience;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;

public class PERMIT_AUDIENCE implements Container.PermitAudience {

	private static final long serialVersionUID = 1L;

	public List<Audience> audienceList;
	public List<BusinessAudience> businessAudienceList;
	public List<EducationalAudience> educationalAudienceList;
	public List<MedicalAudience> medicalAudienceList;
	public List<ParentAudience> parentAudienceList;
	public List<Patient> patientList;
	public List<PeopleAudience> peopleAudienceList;

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

	public PERMIT_AUDIENCE(BusinessAudience businessAudience) {
		businessAudienceList = new ArrayList<BusinessAudience>();
		businessAudienceList.add(businessAudience);
	}

	@Override
	public BusinessAudience getBusinessAudience() {
		if(businessAudienceList != null && businessAudienceList.size() > 0) {
			return businessAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessAudience(BusinessAudience businessAudience) {
		if(businessAudienceList == null) {
			businessAudienceList = new ArrayList<>();
		}
		if(businessAudienceList.size() == 0) {
			businessAudienceList.add(businessAudience);
		} else {
			businessAudienceList.set(0, businessAudience);
		}
	}

	@Override
	public List<BusinessAudience> getBusinessAudienceList() {
		return businessAudienceList;
	}

	@Override
	public void setBusinessAudienceList(List<BusinessAudience> businessAudienceList) {
		this.businessAudienceList = businessAudienceList;
	}

	@Override
	public boolean hasBusinessAudience() {
		return businessAudienceList != null && businessAudienceList.size() > 0 && businessAudienceList.get(0) != null;
	}

	public PERMIT_AUDIENCE(EducationalAudience educationalAudience) {
		educationalAudienceList = new ArrayList<EducationalAudience>();
		educationalAudienceList.add(educationalAudience);
	}

	@Override
	public EducationalAudience getEducationalAudience() {
		if(educationalAudienceList != null && educationalAudienceList.size() > 0) {
			return educationalAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationalAudience(EducationalAudience educationalAudience) {
		if(educationalAudienceList == null) {
			educationalAudienceList = new ArrayList<>();
		}
		if(educationalAudienceList.size() == 0) {
			educationalAudienceList.add(educationalAudience);
		} else {
			educationalAudienceList.set(0, educationalAudience);
		}
	}

	@Override
	public List<EducationalAudience> getEducationalAudienceList() {
		return educationalAudienceList;
	}

	@Override
	public void setEducationalAudienceList(List<EducationalAudience> educationalAudienceList) {
		this.educationalAudienceList = educationalAudienceList;
	}

	@Override
	public boolean hasEducationalAudience() {
		return educationalAudienceList != null && educationalAudienceList.size() > 0 && educationalAudienceList.get(0) != null;
	}

	public PERMIT_AUDIENCE(MedicalAudience medicalAudience) {
		medicalAudienceList = new ArrayList<MedicalAudience>();
		medicalAudienceList.add(medicalAudience);
	}

	@Override
	public MedicalAudience getMedicalAudience() {
		if(medicalAudienceList != null && medicalAudienceList.size() > 0) {
			return medicalAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalAudience(MedicalAudience medicalAudience) {
		if(medicalAudienceList == null) {
			medicalAudienceList = new ArrayList<>();
		}
		if(medicalAudienceList.size() == 0) {
			medicalAudienceList.add(medicalAudience);
		} else {
			medicalAudienceList.set(0, medicalAudience);
		}
	}

	@Override
	public List<MedicalAudience> getMedicalAudienceList() {
		return medicalAudienceList;
	}

	@Override
	public void setMedicalAudienceList(List<MedicalAudience> medicalAudienceList) {
		this.medicalAudienceList = medicalAudienceList;
	}

	@Override
	public boolean hasMedicalAudience() {
		return medicalAudienceList != null && medicalAudienceList.size() > 0 && medicalAudienceList.get(0) != null;
	}

	public PERMIT_AUDIENCE(ParentAudience parentAudience) {
		parentAudienceList = new ArrayList<ParentAudience>();
		parentAudienceList.add(parentAudience);
	}

	@Override
	public ParentAudience getParentAudience() {
		if(parentAudienceList != null && parentAudienceList.size() > 0) {
			return parentAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setParentAudience(ParentAudience parentAudience) {
		if(parentAudienceList == null) {
			parentAudienceList = new ArrayList<>();
		}
		if(parentAudienceList.size() == 0) {
			parentAudienceList.add(parentAudience);
		} else {
			parentAudienceList.set(0, parentAudience);
		}
	}

	@Override
	public List<ParentAudience> getParentAudienceList() {
		return parentAudienceList;
	}

	@Override
	public void setParentAudienceList(List<ParentAudience> parentAudienceList) {
		this.parentAudienceList = parentAudienceList;
	}

	@Override
	public boolean hasParentAudience() {
		return parentAudienceList != null && parentAudienceList.size() > 0 && parentAudienceList.get(0) != null;
	}

	public PERMIT_AUDIENCE(Patient patient) {
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

	public PERMIT_AUDIENCE(PeopleAudience peopleAudience) {
		peopleAudienceList = new ArrayList<PeopleAudience>();
		peopleAudienceList.add(peopleAudience);
	}

	@Override
	public PeopleAudience getPeopleAudience() {
		if(peopleAudienceList != null && peopleAudienceList.size() > 0) {
			return peopleAudienceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPeopleAudience(PeopleAudience peopleAudience) {
		if(peopleAudienceList == null) {
			peopleAudienceList = new ArrayList<>();
		}
		if(peopleAudienceList.size() == 0) {
			peopleAudienceList.add(peopleAudience);
		} else {
			peopleAudienceList.set(0, peopleAudience);
		}
	}

	@Override
	public List<PeopleAudience> getPeopleAudienceList() {
		return peopleAudienceList;
	}

	@Override
	public void setPeopleAudienceList(List<PeopleAudience> peopleAudienceList) {
		this.peopleAudienceList = peopleAudienceList;
	}

	@Override
	public boolean hasPeopleAudience() {
		return peopleAudienceList != null && peopleAudienceList.size() > 0 && peopleAudienceList.get(0) != null;
	}

	public PERMIT_AUDIENCE(List<Audience> audienceList,
			List<BusinessAudience> businessAudienceList,
			List<EducationalAudience> educationalAudienceList,
			List<MedicalAudience> medicalAudienceList,
			List<ParentAudience> parentAudienceList,
			List<Patient> patientList,
			List<PeopleAudience> peopleAudienceList) {
		setAudienceList(audienceList);
		setBusinessAudienceList(businessAudienceList);
		setEducationalAudienceList(educationalAudienceList);
		setMedicalAudienceList(medicalAudienceList);
		setParentAudienceList(parentAudienceList);
		setPatientList(patientList);
		setPeopleAudienceList(peopleAudienceList);
	}

	public void copy(Container.PermitAudience org) {
		setAudienceList(org.getAudienceList());
		setBusinessAudienceList(org.getBusinessAudienceList());
		setEducationalAudienceList(org.getEducationalAudienceList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setParentAudienceList(org.getParentAudienceList());
		setPatientList(org.getPatientList());
		setPeopleAudienceList(org.getPeopleAudienceList());
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
