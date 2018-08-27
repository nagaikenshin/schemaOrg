package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.EventStatusType;
import org.kyojo.schemaorg.m3n3.core.DataType.Text;
import org.kyojo.schemaorg.m3n3.core.impl.TEXT;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.MedicalStudyStatus;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;

import org.seasar.doma.Transient;

public class STATUS implements Container.Status {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<EventStatusType> eventStatusTypeList;
	@Transient
	public List<MedicalStudyStatus> medicalStudyStatusList;
	@Transient
	public List<Text> textList;

	public STATUS() {
	}

	public STATUS(EventStatusType eventStatusType) {
		eventStatusTypeList = new ArrayList<EventStatusType>();
		eventStatusTypeList.add(eventStatusType);
	}

	@Override
	public EventStatusType getEventStatusType() {
		if(eventStatusTypeList != null && eventStatusTypeList.size() > 0) {
			return eventStatusTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventStatusType(EventStatusType eventStatusType) {
		if(eventStatusTypeList == null) {
			eventStatusTypeList = new ArrayList<>();
		}
		if(eventStatusTypeList.size() == 0) {
			eventStatusTypeList.add(eventStatusType);
		} else {
			eventStatusTypeList.set(0, eventStatusType);
		}
	}

	@Override
	public List<EventStatusType> getEventStatusTypeList() {
		return eventStatusTypeList;
	}

	@Override
	public void setEventStatusTypeList(List<EventStatusType> eventStatusTypeList) {
		this.eventStatusTypeList = eventStatusTypeList;
	}

	@Override
	public boolean hasEventStatusType() {
		return eventStatusTypeList != null && eventStatusTypeList.size() > 0 && eventStatusTypeList.get(0) != null;
	}

	public STATUS(MedicalStudyStatus medicalStudyStatus) {
		medicalStudyStatusList = new ArrayList<MedicalStudyStatus>();
		medicalStudyStatusList.add(medicalStudyStatus);
	}

	@Override
	public MedicalStudyStatus getMedicalStudyStatus() {
		if(medicalStudyStatusList != null && medicalStudyStatusList.size() > 0) {
			return medicalStudyStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalStudyStatus(MedicalStudyStatus medicalStudyStatus) {
		if(medicalStudyStatusList == null) {
			medicalStudyStatusList = new ArrayList<>();
		}
		if(medicalStudyStatusList.size() == 0) {
			medicalStudyStatusList.add(medicalStudyStatus);
		} else {
			medicalStudyStatusList.set(0, medicalStudyStatus);
		}
	}

	@Override
	public List<MedicalStudyStatus> getMedicalStudyStatusList() {
		return medicalStudyStatusList;
	}

	@Override
	public void setMedicalStudyStatusList(List<MedicalStudyStatus> medicalStudyStatusList) {
		this.medicalStudyStatusList = medicalStudyStatusList;
	}

	@Override
	public boolean hasMedicalStudyStatus() {
		return medicalStudyStatusList != null && medicalStudyStatusList.size() > 0 && medicalStudyStatusList.get(0) != null;
	}

	public STATUS(String string) {
		this(new TEXT(string));
	}

	public STATUS(Text text) {
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

	public STATUS(List<EventStatusType> eventStatusTypeList,
			List<MedicalStudyStatus> medicalStudyStatusList,
			List<Text> textList) {
		setEventStatusTypeList(eventStatusTypeList);
		setMedicalStudyStatusList(medicalStudyStatusList);
		setTextList(textList);
	}

	public void copy(Container.Status org) {
		setEventStatusTypeList(org.getEventStatusTypeList());
		setMedicalStudyStatusList(org.getMedicalStudyStatusList());
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
