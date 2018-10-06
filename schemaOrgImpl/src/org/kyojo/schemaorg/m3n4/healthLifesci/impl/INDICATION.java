package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ApprovedIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PreventionIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TreatmentIndication;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_INDICATION;

public class INDICATION implements Container.Indication {

	private static final long serialVersionUID = 1L;

	public List<ApprovedIndication> approvedIndicationList;
	public List<MedicalIndication> medicalIndicationList;
	public List<PreventionIndication> preventionIndicationList;
	public List<TreatmentIndication> treatmentIndicationList;

	public INDICATION() {
	}

	public INDICATION(String string) {
		this(new MEDICAL_INDICATION(string));
	}

	public String getString() {
		if(medicalIndicationList == null || medicalIndicationList.size() == 0 || medicalIndicationList.get(0) == null) {
			return null;
		} else {
			Name name = medicalIndicationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<MedicalIndication>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(new MEDICAL_INDICATION(string));
		} else {
			medicalIndicationList.set(0, new MEDICAL_INDICATION(string));
		}
	}

	public INDICATION(ApprovedIndication approvedIndication) {
		approvedIndicationList = new ArrayList<ApprovedIndication>();
		approvedIndicationList.add(approvedIndication);
	}

	@Override
	public ApprovedIndication getApprovedIndication() {
		if(approvedIndicationList != null && approvedIndicationList.size() > 0) {
			return approvedIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApprovedIndication(ApprovedIndication approvedIndication) {
		if(approvedIndicationList == null) {
			approvedIndicationList = new ArrayList<>();
		}
		if(approvedIndicationList.size() == 0) {
			approvedIndicationList.add(approvedIndication);
		} else {
			approvedIndicationList.set(0, approvedIndication);
		}
	}

	@Override
	public List<ApprovedIndication> getApprovedIndicationList() {
		return approvedIndicationList;
	}

	@Override
	public void setApprovedIndicationList(List<ApprovedIndication> approvedIndicationList) {
		this.approvedIndicationList = approvedIndicationList;
	}

	@Override
	public boolean hasApprovedIndication() {
		return approvedIndicationList != null && approvedIndicationList.size() > 0 && approvedIndicationList.get(0) != null;
	}

	public INDICATION(MedicalIndication medicalIndication) {
		medicalIndicationList = new ArrayList<MedicalIndication>();
		medicalIndicationList.add(medicalIndication);
	}

	@Override
	public MedicalIndication getMedicalIndication() {
		if(medicalIndicationList != null && medicalIndicationList.size() > 0) {
			return medicalIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalIndication(MedicalIndication medicalIndication) {
		if(medicalIndicationList == null) {
			medicalIndicationList = new ArrayList<>();
		}
		if(medicalIndicationList.size() == 0) {
			medicalIndicationList.add(medicalIndication);
		} else {
			medicalIndicationList.set(0, medicalIndication);
		}
	}

	@Override
	public List<MedicalIndication> getMedicalIndicationList() {
		return medicalIndicationList;
	}

	@Override
	public void setMedicalIndicationList(List<MedicalIndication> medicalIndicationList) {
		this.medicalIndicationList = medicalIndicationList;
	}

	@Override
	public boolean hasMedicalIndication() {
		return medicalIndicationList != null && medicalIndicationList.size() > 0 && medicalIndicationList.get(0) != null;
	}

	public INDICATION(PreventionIndication preventionIndication) {
		preventionIndicationList = new ArrayList<PreventionIndication>();
		preventionIndicationList.add(preventionIndication);
	}

	@Override
	public PreventionIndication getPreventionIndication() {
		if(preventionIndicationList != null && preventionIndicationList.size() > 0) {
			return preventionIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreventionIndication(PreventionIndication preventionIndication) {
		if(preventionIndicationList == null) {
			preventionIndicationList = new ArrayList<>();
		}
		if(preventionIndicationList.size() == 0) {
			preventionIndicationList.add(preventionIndication);
		} else {
			preventionIndicationList.set(0, preventionIndication);
		}
	}

	@Override
	public List<PreventionIndication> getPreventionIndicationList() {
		return preventionIndicationList;
	}

	@Override
	public void setPreventionIndicationList(List<PreventionIndication> preventionIndicationList) {
		this.preventionIndicationList = preventionIndicationList;
	}

	@Override
	public boolean hasPreventionIndication() {
		return preventionIndicationList != null && preventionIndicationList.size() > 0 && preventionIndicationList.get(0) != null;
	}

	public INDICATION(TreatmentIndication treatmentIndication) {
		treatmentIndicationList = new ArrayList<TreatmentIndication>();
		treatmentIndicationList.add(treatmentIndication);
	}

	@Override
	public TreatmentIndication getTreatmentIndication() {
		if(treatmentIndicationList != null && treatmentIndicationList.size() > 0) {
			return treatmentIndicationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTreatmentIndication(TreatmentIndication treatmentIndication) {
		if(treatmentIndicationList == null) {
			treatmentIndicationList = new ArrayList<>();
		}
		if(treatmentIndicationList.size() == 0) {
			treatmentIndicationList.add(treatmentIndication);
		} else {
			treatmentIndicationList.set(0, treatmentIndication);
		}
	}

	@Override
	public List<TreatmentIndication> getTreatmentIndicationList() {
		return treatmentIndicationList;
	}

	@Override
	public void setTreatmentIndicationList(List<TreatmentIndication> treatmentIndicationList) {
		this.treatmentIndicationList = treatmentIndicationList;
	}

	@Override
	public boolean hasTreatmentIndication() {
		return treatmentIndicationList != null && treatmentIndicationList.size() > 0 && treatmentIndicationList.get(0) != null;
	}

	public INDICATION(List<ApprovedIndication> approvedIndicationList,
			List<MedicalIndication> medicalIndicationList,
			List<PreventionIndication> preventionIndicationList,
			List<TreatmentIndication> treatmentIndicationList) {
		setApprovedIndicationList(approvedIndicationList);
		setMedicalIndicationList(medicalIndicationList);
		setPreventionIndicationList(preventionIndicationList);
		setTreatmentIndicationList(treatmentIndicationList);
	}

	public void copy(Container.Indication org) {
		setApprovedIndicationList(org.getApprovedIndicationList());
		setMedicalIndicationList(org.getMedicalIndicationList());
		setPreventionIndicationList(org.getPreventionIndicationList());
		setTreatmentIndicationList(org.getTreatmentIndicationList());
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
