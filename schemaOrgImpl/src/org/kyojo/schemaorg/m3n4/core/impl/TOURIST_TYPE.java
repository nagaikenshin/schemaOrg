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
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalAudience;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Patient;

public class TOURIST_TYPE implements Container.TouristType {

	private static final long serialVersionUID = 1L;

	public List<Audience> audienceList;
	public List<BusinessAudience> businessAudienceList;
	public List<EducationalAudience> educationalAudienceList;
	public List<MedicalAudience> medicalAudienceList;
	public List<ParentAudience> parentAudienceList;
	public List<Patient> patientList;
	public List<PeopleAudience> peopleAudienceList;
	public List<Text> textList;

	public TOURIST_TYPE() {
	}

	public TOURIST_TYPE(Audience audience) {
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

	public TOURIST_TYPE(BusinessAudience businessAudience) {
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

	public TOURIST_TYPE(EducationalAudience educationalAudience) {
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

	public TOURIST_TYPE(MedicalAudience medicalAudience) {
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

	public TOURIST_TYPE(ParentAudience parentAudience) {
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

	public TOURIST_TYPE(Patient patient) {
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

	public TOURIST_TYPE(PeopleAudience peopleAudience) {
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

	public TOURIST_TYPE(String string) {
		this(new TEXT(string));
	}

	public TOURIST_TYPE(Text text) {
		textList = new ArrayList<Text>();
		textList.add(text);
	}

	@Override
	public Text getText() {
		if(textList != null && textList.size() > 0) {
			return textList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setText(Text text) {
		if(textList == null) {
			textList = new ArrayList<>();
		}
		if(textList.size() == 0) {
			textList.add(text);
		} else {
			textList.set(0, text);
		}
	}

	@Override
	public List<Text> getTextList() {
		return textList;
	}

	@Override
	public void setTextList(List<Text> textList) {
		this.textList = textList;
	}

	@Override
	public boolean hasText() {
		return textList != null && textList.size() > 0 && textList.get(0) != null;
	}

	public TOURIST_TYPE(List<Audience> audienceList,
			List<BusinessAudience> businessAudienceList,
			List<EducationalAudience> educationalAudienceList,
			List<MedicalAudience> medicalAudienceList,
			List<ParentAudience> parentAudienceList,
			List<Patient> patientList,
			List<PeopleAudience> peopleAudienceList,
			List<Text> textList) {
		setAudienceList(audienceList);
		setBusinessAudienceList(businessAudienceList);
		setEducationalAudienceList(educationalAudienceList);
		setMedicalAudienceList(medicalAudienceList);
		setParentAudienceList(parentAudienceList);
		setPatientList(patientList);
		setPeopleAudienceList(peopleAudienceList);
		setTextList(textList);
	}

	public void copy(Container.TouristType org) {
		setAudienceList(org.getAudienceList());
		setBusinessAudienceList(org.getBusinessAudienceList());
		setEducationalAudienceList(org.getEducationalAudienceList());
		setMedicalAudienceList(org.getMedicalAudienceList());
		setParentAudienceList(org.getParentAudienceList());
		setPatientList(org.getPatientList());
		setPeopleAudienceList(org.getPeopleAudienceList());
		setTextList(org.getTextList());
	}

	@Override
	public String getNativeValue() {
		if(getText() == null) return null;
		return getText().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
