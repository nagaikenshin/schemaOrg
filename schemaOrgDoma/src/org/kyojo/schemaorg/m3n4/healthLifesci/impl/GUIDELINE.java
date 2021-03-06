package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuideline;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineContraindication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalGuidelineRecommendation;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_GUIDELINE;

import org.seasar.doma.Transient;

public class GUIDELINE implements Container.Guideline {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalGuideline> medicalGuidelineList;
	@Transient
	public List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList;
	@Transient
	public List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList;

	public GUIDELINE() {
	}

	public GUIDELINE(String string) {
		this(new MEDICAL_GUIDELINE(string));
	}

	public String getString() {
		if(medicalGuidelineList == null || medicalGuidelineList.size() == 0 || medicalGuidelineList.get(0) == null) {
			return null;
		} else {
			Name name = medicalGuidelineList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalGuidelineList == null) {
			medicalGuidelineList = new ArrayList<MedicalGuideline>();
		}
		if(medicalGuidelineList.size() == 0) {
			medicalGuidelineList.add(new MEDICAL_GUIDELINE(string));
		} else {
			medicalGuidelineList.set(0, new MEDICAL_GUIDELINE(string));
		}
	}

	public GUIDELINE(MedicalGuideline medicalGuideline) {
		medicalGuidelineList = new ArrayList<MedicalGuideline>();
		medicalGuidelineList.add(medicalGuideline);
	}

	@Override
	public MedicalGuideline getMedicalGuideline() {
		if(medicalGuidelineList != null && medicalGuidelineList.size() > 0) {
			return medicalGuidelineList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuideline(MedicalGuideline medicalGuideline) {
		if(medicalGuidelineList == null) {
			medicalGuidelineList = new ArrayList<>();
		}
		if(medicalGuidelineList.size() == 0) {
			medicalGuidelineList.add(medicalGuideline);
		} else {
			medicalGuidelineList.set(0, medicalGuideline);
		}
	}

	@Override
	public List<MedicalGuideline> getMedicalGuidelineList() {
		return medicalGuidelineList;
	}

	@Override
	public void setMedicalGuidelineList(List<MedicalGuideline> medicalGuidelineList) {
		this.medicalGuidelineList = medicalGuidelineList;
	}

	@Override
	public boolean hasMedicalGuideline() {
		return medicalGuidelineList != null && medicalGuidelineList.size() > 0 && medicalGuidelineList.get(0) != null;
	}

	public GUIDELINE(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		medicalGuidelineContraindicationList = new ArrayList<MedicalGuidelineContraindication>();
		medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
	}

	@Override
	public MedicalGuidelineContraindication getMedicalGuidelineContraindication() {
		if(medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0) {
			return medicalGuidelineContraindicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineContraindication(MedicalGuidelineContraindication medicalGuidelineContraindication) {
		if(medicalGuidelineContraindicationList == null) {
			medicalGuidelineContraindicationList = new ArrayList<>();
		}
		if(medicalGuidelineContraindicationList.size() == 0) {
			medicalGuidelineContraindicationList.add(medicalGuidelineContraindication);
		} else {
			medicalGuidelineContraindicationList.set(0, medicalGuidelineContraindication);
		}
	}

	@Override
	public List<MedicalGuidelineContraindication> getMedicalGuidelineContraindicationList() {
		return medicalGuidelineContraindicationList;
	}

	@Override
	public void setMedicalGuidelineContraindicationList(List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList) {
		this.medicalGuidelineContraindicationList = medicalGuidelineContraindicationList;
	}

	@Override
	public boolean hasMedicalGuidelineContraindication() {
		return medicalGuidelineContraindicationList != null && medicalGuidelineContraindicationList.size() > 0 && medicalGuidelineContraindicationList.get(0) != null;
	}

	public GUIDELINE(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		medicalGuidelineRecommendationList = new ArrayList<MedicalGuidelineRecommendation>();
		medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
	}

	@Override
	public MedicalGuidelineRecommendation getMedicalGuidelineRecommendation() {
		if(medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0) {
			return medicalGuidelineRecommendationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalGuidelineRecommendation(MedicalGuidelineRecommendation medicalGuidelineRecommendation) {
		if(medicalGuidelineRecommendationList == null) {
			medicalGuidelineRecommendationList = new ArrayList<>();
		}
		if(medicalGuidelineRecommendationList.size() == 0) {
			medicalGuidelineRecommendationList.add(medicalGuidelineRecommendation);
		} else {
			medicalGuidelineRecommendationList.set(0, medicalGuidelineRecommendation);
		}
	}

	@Override
	public List<MedicalGuidelineRecommendation> getMedicalGuidelineRecommendationList() {
		return medicalGuidelineRecommendationList;
	}

	@Override
	public void setMedicalGuidelineRecommendationList(List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList) {
		this.medicalGuidelineRecommendationList = medicalGuidelineRecommendationList;
	}

	@Override
	public boolean hasMedicalGuidelineRecommendation() {
		return medicalGuidelineRecommendationList != null && medicalGuidelineRecommendationList.size() > 0 && medicalGuidelineRecommendationList.get(0) != null;
	}

	public GUIDELINE(List<MedicalGuideline> medicalGuidelineList,
			List<MedicalGuidelineContraindication> medicalGuidelineContraindicationList,
			List<MedicalGuidelineRecommendation> medicalGuidelineRecommendationList) {
		setMedicalGuidelineList(medicalGuidelineList);
		setMedicalGuidelineContraindicationList(medicalGuidelineContraindicationList);
		setMedicalGuidelineRecommendationList(medicalGuidelineRecommendationList);
	}

	public void copy(Container.Guideline org) {
		setMedicalGuidelineList(org.getMedicalGuidelineList());
		setMedicalGuidelineContraindicationList(org.getMedicalGuidelineContraindicationList());
		setMedicalGuidelineRecommendationList(org.getMedicalGuidelineRecommendationList());
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
