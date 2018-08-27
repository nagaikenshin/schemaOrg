package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.DataType.Text;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.DrugLegalStatus;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalEnumeration;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;

import org.seasar.doma.Transient;

public class LEGAL_STATUS implements Container.LegalStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DrugLegalStatus> drugLegalStatusList;
	@Transient
	public List<MedicalEnumeration> medicalEnumerationList;
	@Transient
	public List<Text> textList;

	public LEGAL_STATUS() {
	}

	public LEGAL_STATUS(DrugLegalStatus drugLegalStatus) {
		drugLegalStatusList = new ArrayList<DrugLegalStatus>();
		drugLegalStatusList.add(drugLegalStatus);
	}

	@Override
	public DrugLegalStatus getDrugLegalStatus() {
		if(drugLegalStatusList != null && drugLegalStatusList.size() > 0) {
			return drugLegalStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugLegalStatus(DrugLegalStatus drugLegalStatus) {
		if(drugLegalStatusList == null) {
			drugLegalStatusList = new ArrayList<>();
		}
		if(drugLegalStatusList.size() == 0) {
			drugLegalStatusList.add(drugLegalStatus);
		} else {
			drugLegalStatusList.set(0, drugLegalStatus);
		}
	}

	@Override
	public List<DrugLegalStatus> getDrugLegalStatusList() {
		return drugLegalStatusList;
	}

	@Override
	public void setDrugLegalStatusList(List<DrugLegalStatus> drugLegalStatusList) {
		this.drugLegalStatusList = drugLegalStatusList;
	}

	@Override
	public boolean hasDrugLegalStatus() {
		return drugLegalStatusList != null && drugLegalStatusList.size() > 0 && drugLegalStatusList.get(0) != null;
	}

	public LEGAL_STATUS(MedicalEnumeration medicalEnumeration) {
		medicalEnumerationList = new ArrayList<MedicalEnumeration>();
		medicalEnumerationList.add(medicalEnumeration);
	}

	@Override
	public MedicalEnumeration getMedicalEnumeration() {
		if(medicalEnumerationList != null && medicalEnumerationList.size() > 0) {
			return medicalEnumerationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalEnumeration(MedicalEnumeration medicalEnumeration) {
		if(medicalEnumerationList == null) {
			medicalEnumerationList = new ArrayList<>();
		}
		if(medicalEnumerationList.size() == 0) {
			medicalEnumerationList.add(medicalEnumeration);
		} else {
			medicalEnumerationList.set(0, medicalEnumeration);
		}
	}

	@Override
	public List<MedicalEnumeration> getMedicalEnumerationList() {
		return medicalEnumerationList;
	}

	@Override
	public void setMedicalEnumerationList(List<MedicalEnumeration> medicalEnumerationList) {
		this.medicalEnumerationList = medicalEnumerationList;
	}

	@Override
	public boolean hasMedicalEnumeration() {
		return medicalEnumerationList != null && medicalEnumerationList.size() > 0 && medicalEnumerationList.get(0) != null;
	}

	public LEGAL_STATUS(String string) {
		this(new TEXT(string));
	}

	public LEGAL_STATUS(Text text) {
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

	public LEGAL_STATUS(List<DrugLegalStatus> drugLegalStatusList,
			List<MedicalEnumeration> medicalEnumerationList,
			List<Text> textList) {
		setDrugLegalStatusList(drugLegalStatusList);
		setMedicalEnumerationList(medicalEnumerationList);
		setTextList(textList);
	}

	public void copy(Container.LegalStatus org) {
		setDrugLegalStatusList(org.getDrugLegalStatusList());
		setMedicalEnumerationList(org.getMedicalEnumerationList());
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
