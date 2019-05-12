package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MedicalImagingTechnique;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MEDICAL_IMAGING_TECHNIQUE;

public class IMAGING_TECHNIQUE implements Container.ImagingTechnique {

	private static final long serialVersionUID = 1L;

	public List<MedicalImagingTechnique> medicalImagingTechniqueList;

	public IMAGING_TECHNIQUE() {
	}

	public IMAGING_TECHNIQUE(String string) {
		this(new MEDICAL_IMAGING_TECHNIQUE(string));
	}

	public String getString() {
		if(medicalImagingTechniqueList == null || medicalImagingTechniqueList.size() == 0 || medicalImagingTechniqueList.get(0) == null) {
			return null;
		} else {
			Name name = medicalImagingTechniqueList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalImagingTechniqueList == null) {
			medicalImagingTechniqueList = new ArrayList<MedicalImagingTechnique>();
		}
		if(medicalImagingTechniqueList.size() == 0) {
			medicalImagingTechniqueList.add(new MEDICAL_IMAGING_TECHNIQUE(string));
		} else {
			medicalImagingTechniqueList.set(0, new MEDICAL_IMAGING_TECHNIQUE(string));
		}
	}

	public IMAGING_TECHNIQUE(MedicalImagingTechnique medicalImagingTechnique) {
		medicalImagingTechniqueList = new ArrayList<MedicalImagingTechnique>();
		medicalImagingTechniqueList.add(medicalImagingTechnique);
	}

	@Override
	public MedicalImagingTechnique getMedicalImagingTechnique() {
		if(medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0) {
			return medicalImagingTechniqueList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalImagingTechnique(MedicalImagingTechnique medicalImagingTechnique) {
		if(medicalImagingTechniqueList == null) {
			medicalImagingTechniqueList = new ArrayList<>();
		}
		if(medicalImagingTechniqueList.size() == 0) {
			medicalImagingTechniqueList.add(medicalImagingTechnique);
		} else {
			medicalImagingTechniqueList.set(0, medicalImagingTechnique);
		}
	}

	@Override
	public List<MedicalImagingTechnique> getMedicalImagingTechniqueList() {
		return medicalImagingTechniqueList;
	}

	@Override
	public void setMedicalImagingTechniqueList(List<MedicalImagingTechnique> medicalImagingTechniqueList) {
		this.medicalImagingTechniqueList = medicalImagingTechniqueList;
	}

	@Override
	public boolean hasMedicalImagingTechnique() {
		return medicalImagingTechniqueList != null && medicalImagingTechniqueList.size() > 0 && medicalImagingTechniqueList.get(0) != null;
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
