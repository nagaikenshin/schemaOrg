package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.DataType.Text;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.DrugPrescriptionStatus;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;

import org.seasar.doma.Transient;

public class PRESCRIPTION_STATUS implements Container.PrescriptionStatus {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<DrugPrescriptionStatus> drugPrescriptionStatusList;
	@Transient
	public List<Text> textList;

	public PRESCRIPTION_STATUS() {
	}

	public PRESCRIPTION_STATUS(DrugPrescriptionStatus drugPrescriptionStatus) {
		drugPrescriptionStatusList = new ArrayList<DrugPrescriptionStatus>();
		drugPrescriptionStatusList.add(drugPrescriptionStatus);
	}

	@Override
	public DrugPrescriptionStatus getDrugPrescriptionStatus() {
		if(drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0) {
			return drugPrescriptionStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrugPrescriptionStatus(DrugPrescriptionStatus drugPrescriptionStatus) {
		if(drugPrescriptionStatusList == null) {
			drugPrescriptionStatusList = new ArrayList<>();
		}
		if(drugPrescriptionStatusList.size() == 0) {
			drugPrescriptionStatusList.add(drugPrescriptionStatus);
		} else {
			drugPrescriptionStatusList.set(0, drugPrescriptionStatus);
		}
	}

	@Override
	public List<DrugPrescriptionStatus> getDrugPrescriptionStatusList() {
		return drugPrescriptionStatusList;
	}

	@Override
	public void setDrugPrescriptionStatusList(List<DrugPrescriptionStatus> drugPrescriptionStatusList) {
		this.drugPrescriptionStatusList = drugPrescriptionStatusList;
	}

	@Override
	public boolean hasDrugPrescriptionStatus() {
		return drugPrescriptionStatusList != null && drugPrescriptionStatusList.size() > 0 && drugPrescriptionStatusList.get(0) != null;
	}

	public PRESCRIPTION_STATUS(String string) {
		this(new TEXT(string));
	}

	public PRESCRIPTION_STATUS(Text text) {
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

	public PRESCRIPTION_STATUS(List<DrugPrescriptionStatus> drugPrescriptionStatusList,
			List<Text> textList) {
		setDrugPrescriptionStatusList(drugPrescriptionStatusList);
		setTextList(textList);
	}

	public void copy(Container.PrescriptionStatus org) {
		setDrugPrescriptionStatusList(org.getDrugPrescriptionStatusList());
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
