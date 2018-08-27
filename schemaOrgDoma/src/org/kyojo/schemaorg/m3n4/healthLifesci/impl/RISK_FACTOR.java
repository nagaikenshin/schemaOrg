package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalRiskFactor;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_RISK_FACTOR;

import org.seasar.doma.Transient;

public class RISK_FACTOR implements Container.RiskFactor {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalRiskFactor> medicalRiskFactorList;

	public RISK_FACTOR() {
	}

	public RISK_FACTOR(String string) {
		this(new MEDICAL_RISK_FACTOR(string));
	}

	public String getString() {
		if(medicalRiskFactorList == null || medicalRiskFactorList.size() == 0 || medicalRiskFactorList.get(0) == null) {
			return null;
		} else {
			Name name = medicalRiskFactorList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalRiskFactorList == null) {
			medicalRiskFactorList = new ArrayList<MedicalRiskFactor>();
		}
		if(medicalRiskFactorList.size() == 0) {
			medicalRiskFactorList.add(new MEDICAL_RISK_FACTOR(string));
		} else {
			medicalRiskFactorList.set(0, new MEDICAL_RISK_FACTOR(string));
		}
	}

	public RISK_FACTOR(MedicalRiskFactor medicalRiskFactor) {
		medicalRiskFactorList = new ArrayList<MedicalRiskFactor>();
		medicalRiskFactorList.add(medicalRiskFactor);
	}

	@Override
	public MedicalRiskFactor getMedicalRiskFactor() {
		if(medicalRiskFactorList != null && medicalRiskFactorList.size() > 0) {
			return medicalRiskFactorList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalRiskFactor(MedicalRiskFactor medicalRiskFactor) {
		if(medicalRiskFactorList == null) {
			medicalRiskFactorList = new ArrayList<>();
		}
		if(medicalRiskFactorList.size() == 0) {
			medicalRiskFactorList.add(medicalRiskFactor);
		} else {
			medicalRiskFactorList.set(0, medicalRiskFactor);
		}
	}

	@Override
	public List<MedicalRiskFactor> getMedicalRiskFactorList() {
		return medicalRiskFactorList;
	}

	@Override
	public void setMedicalRiskFactorList(List<MedicalRiskFactor> medicalRiskFactorList) {
		this.medicalRiskFactorList = medicalRiskFactorList;
	}

	@Override
	public boolean hasMedicalRiskFactor() {
		return medicalRiskFactorList != null && medicalRiskFactorList.size() > 0 && medicalRiskFactorList.get(0) != null;
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
