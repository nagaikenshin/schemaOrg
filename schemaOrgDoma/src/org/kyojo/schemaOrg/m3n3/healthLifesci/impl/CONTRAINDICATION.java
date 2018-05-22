package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.DataType.Text;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.MedicalContraindication;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;

import org.seasar.doma.Transient;

public class CONTRAINDICATION implements Container.Contraindication {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalContraindication> medicalContraindicationList;
	@Transient
	public List<Text> textList;

	public CONTRAINDICATION() {
	}

	public CONTRAINDICATION(MedicalContraindication medicalContraindication) {
		medicalContraindicationList = new ArrayList<MedicalContraindication>();
		medicalContraindicationList.add(medicalContraindication);
	}

	@Override
	public MedicalContraindication getMedicalContraindication() {
		if(medicalContraindicationList != null && medicalContraindicationList.size() > 0) {
			return medicalContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalContraindication(MedicalContraindication medicalContraindication) {
		if(medicalContraindicationList == null) {
			medicalContraindicationList = new ArrayList<>();
		}
		if(medicalContraindicationList.size() == 0) {
			medicalContraindicationList.add(medicalContraindication);
		} else {
			medicalContraindicationList.set(0, medicalContraindication);
		}
	}

	@Override
	public List<MedicalContraindication> getMedicalContraindicationList() {
		return medicalContraindicationList;
	}

	@Override
	public void setMedicalContraindicationList(List<MedicalContraindication> medicalContraindicationList) {
		this.medicalContraindicationList = medicalContraindicationList;
	}

	@Override
	public boolean hasMedicalContraindication() {
		return medicalContraindicationList != null && medicalContraindicationList.size() > 0 && medicalContraindicationList.get(0) != null;
	}

	public CONTRAINDICATION(String string) {
		this(new TEXT(string));
	}

	public CONTRAINDICATION(Text text) {
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

	public CONTRAINDICATION(List<MedicalContraindication> medicalContraindicationList,
			List<Text> textList) {
		setMedicalContraindicationList(medicalContraindicationList);
		setTextList(textList);
	}

	public void copy(Container.Contraindication org) {
		setMedicalContraindicationList(org.getMedicalContraindicationList());
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
