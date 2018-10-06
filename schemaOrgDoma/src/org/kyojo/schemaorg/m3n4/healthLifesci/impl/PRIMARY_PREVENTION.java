package org.kyojo.schemaorg.m3n4.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.MedicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.OccupationalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PalliativeProcedure;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PhysicalTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.RadiationTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container;
import org.kyojo.schemaorg.m3n4.healthLifesci.MedicalSpecialty.RespiratoryTherapy;
import org.kyojo.schemaorg.m3n4.healthLifesci.impl.MEDICAL_THERAPY;

import org.seasar.doma.Transient;

public class PRIMARY_PREVENTION implements Container.PrimaryPrevention {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<MedicalTherapy> medicalTherapyList;
	@Transient
	public List<OccupationalTherapy> occupationalTherapyList;
	@Transient
	public List<PalliativeProcedure> palliativeProcedureList;
	@Transient
	public List<PhysicalTherapy> physicalTherapyList;
	@Transient
	public List<RadiationTherapy> radiationTherapyList;
	@Transient
	public List<RespiratoryTherapy> respiratoryTherapyList;

	public PRIMARY_PREVENTION() {
	}

	public PRIMARY_PREVENTION(String string) {
		this(new MEDICAL_THERAPY(string));
	}

	public String getString() {
		if(medicalTherapyList == null || medicalTherapyList.size() == 0 || medicalTherapyList.get(0) == null) {
			return null;
		} else {
			Name name = medicalTherapyList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(medicalTherapyList == null) {
			medicalTherapyList = new ArrayList<MedicalTherapy>();
		}
		if(medicalTherapyList.size() == 0) {
			medicalTherapyList.add(new MEDICAL_THERAPY(string));
		} else {
			medicalTherapyList.set(0, new MEDICAL_THERAPY(string));
		}
	}

	public PRIMARY_PREVENTION(MedicalTherapy medicalTherapy) {
		medicalTherapyList = new ArrayList<MedicalTherapy>();
		medicalTherapyList.add(medicalTherapy);
	}

	@Override
	public MedicalTherapy getMedicalTherapy() {
		if(medicalTherapyList != null && medicalTherapyList.size() > 0) {
			return medicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMedicalTherapy(MedicalTherapy medicalTherapy) {
		if(medicalTherapyList == null) {
			medicalTherapyList = new ArrayList<>();
		}
		if(medicalTherapyList.size() == 0) {
			medicalTherapyList.add(medicalTherapy);
		} else {
			medicalTherapyList.set(0, medicalTherapy);
		}
	}

	@Override
	public List<MedicalTherapy> getMedicalTherapyList() {
		return medicalTherapyList;
	}

	@Override
	public void setMedicalTherapyList(List<MedicalTherapy> medicalTherapyList) {
		this.medicalTherapyList = medicalTherapyList;
	}

	@Override
	public boolean hasMedicalTherapy() {
		return medicalTherapyList != null && medicalTherapyList.size() > 0 && medicalTherapyList.get(0) != null;
	}

	public PRIMARY_PREVENTION(OccupationalTherapy occupationalTherapy) {
		occupationalTherapyList = new ArrayList<OccupationalTherapy>();
		occupationalTherapyList.add(occupationalTherapy);
	}

	@Override
	public OccupationalTherapy getOccupationalTherapy() {
		if(occupationalTherapyList != null && occupationalTherapyList.size() > 0) {
			return occupationalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOccupationalTherapy(OccupationalTherapy occupationalTherapy) {
		if(occupationalTherapyList == null) {
			occupationalTherapyList = new ArrayList<>();
		}
		if(occupationalTherapyList.size() == 0) {
			occupationalTherapyList.add(occupationalTherapy);
		} else {
			occupationalTherapyList.set(0, occupationalTherapy);
		}
	}

	@Override
	public List<OccupationalTherapy> getOccupationalTherapyList() {
		return occupationalTherapyList;
	}

	@Override
	public void setOccupationalTherapyList(List<OccupationalTherapy> occupationalTherapyList) {
		this.occupationalTherapyList = occupationalTherapyList;
	}

	@Override
	public boolean hasOccupationalTherapy() {
		return occupationalTherapyList != null && occupationalTherapyList.size() > 0 && occupationalTherapyList.get(0) != null;
	}

	public PRIMARY_PREVENTION(PalliativeProcedure palliativeProcedure) {
		palliativeProcedureList = new ArrayList<PalliativeProcedure>();
		palliativeProcedureList.add(palliativeProcedure);
	}

	@Override
	public PalliativeProcedure getPalliativeProcedure() {
		if(palliativeProcedureList != null && palliativeProcedureList.size() > 0) {
			return palliativeProcedureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPalliativeProcedure(PalliativeProcedure palliativeProcedure) {
		if(palliativeProcedureList == null) {
			palliativeProcedureList = new ArrayList<>();
		}
		if(palliativeProcedureList.size() == 0) {
			palliativeProcedureList.add(palliativeProcedure);
		} else {
			palliativeProcedureList.set(0, palliativeProcedure);
		}
	}

	@Override
	public List<PalliativeProcedure> getPalliativeProcedureList() {
		return palliativeProcedureList;
	}

	@Override
	public void setPalliativeProcedureList(List<PalliativeProcedure> palliativeProcedureList) {
		this.palliativeProcedureList = palliativeProcedureList;
	}

	@Override
	public boolean hasPalliativeProcedure() {
		return palliativeProcedureList != null && palliativeProcedureList.size() > 0 && palliativeProcedureList.get(0) != null;
	}

	public PRIMARY_PREVENTION(PhysicalTherapy physicalTherapy) {
		physicalTherapyList = new ArrayList<PhysicalTherapy>();
		physicalTherapyList.add(physicalTherapy);
	}

	@Override
	public PhysicalTherapy getPhysicalTherapy() {
		if(physicalTherapyList != null && physicalTherapyList.size() > 0) {
			return physicalTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhysicalTherapy(PhysicalTherapy physicalTherapy) {
		if(physicalTherapyList == null) {
			physicalTherapyList = new ArrayList<>();
		}
		if(physicalTherapyList.size() == 0) {
			physicalTherapyList.add(physicalTherapy);
		} else {
			physicalTherapyList.set(0, physicalTherapy);
		}
	}

	@Override
	public List<PhysicalTherapy> getPhysicalTherapyList() {
		return physicalTherapyList;
	}

	@Override
	public void setPhysicalTherapyList(List<PhysicalTherapy> physicalTherapyList) {
		this.physicalTherapyList = physicalTherapyList;
	}

	@Override
	public boolean hasPhysicalTherapy() {
		return physicalTherapyList != null && physicalTherapyList.size() > 0 && physicalTherapyList.get(0) != null;
	}

	public PRIMARY_PREVENTION(RadiationTherapy radiationTherapy) {
		radiationTherapyList = new ArrayList<RadiationTherapy>();
		radiationTherapyList.add(radiationTherapy);
	}

	@Override
	public RadiationTherapy getRadiationTherapy() {
		if(radiationTherapyList != null && radiationTherapyList.size() > 0) {
			return radiationTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRadiationTherapy(RadiationTherapy radiationTherapy) {
		if(radiationTherapyList == null) {
			radiationTherapyList = new ArrayList<>();
		}
		if(radiationTherapyList.size() == 0) {
			radiationTherapyList.add(radiationTherapy);
		} else {
			radiationTherapyList.set(0, radiationTherapy);
		}
	}

	@Override
	public List<RadiationTherapy> getRadiationTherapyList() {
		return radiationTherapyList;
	}

	@Override
	public void setRadiationTherapyList(List<RadiationTherapy> radiationTherapyList) {
		this.radiationTherapyList = radiationTherapyList;
	}

	@Override
	public boolean hasRadiationTherapy() {
		return radiationTherapyList != null && radiationTherapyList.size() > 0 && radiationTherapyList.get(0) != null;
	}

	public PRIMARY_PREVENTION(RespiratoryTherapy respiratoryTherapy) {
		respiratoryTherapyList = new ArrayList<RespiratoryTherapy>();
		respiratoryTherapyList.add(respiratoryTherapy);
	}

	@Override
	public RespiratoryTherapy getRespiratoryTherapy() {
		if(respiratoryTherapyList != null && respiratoryTherapyList.size() > 0) {
			return respiratoryTherapyList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRespiratoryTherapy(RespiratoryTherapy respiratoryTherapy) {
		if(respiratoryTherapyList == null) {
			respiratoryTherapyList = new ArrayList<>();
		}
		if(respiratoryTherapyList.size() == 0) {
			respiratoryTherapyList.add(respiratoryTherapy);
		} else {
			respiratoryTherapyList.set(0, respiratoryTherapy);
		}
	}

	@Override
	public List<RespiratoryTherapy> getRespiratoryTherapyList() {
		return respiratoryTherapyList;
	}

	@Override
	public void setRespiratoryTherapyList(List<RespiratoryTherapy> respiratoryTherapyList) {
		this.respiratoryTherapyList = respiratoryTherapyList;
	}

	@Override
	public boolean hasRespiratoryTherapy() {
		return respiratoryTherapyList != null && respiratoryTherapyList.size() > 0 && respiratoryTherapyList.get(0) != null;
	}

	public PRIMARY_PREVENTION(List<MedicalTherapy> medicalTherapyList,
			List<OccupationalTherapy> occupationalTherapyList,
			List<PalliativeProcedure> palliativeProcedureList,
			List<PhysicalTherapy> physicalTherapyList,
			List<RadiationTherapy> radiationTherapyList,
			List<RespiratoryTherapy> respiratoryTherapyList) {
		setMedicalTherapyList(medicalTherapyList);
		setOccupationalTherapyList(occupationalTherapyList);
		setPalliativeProcedureList(palliativeProcedureList);
		setPhysicalTherapyList(physicalTherapyList);
		setRadiationTherapyList(radiationTherapyList);
		setRespiratoryTherapyList(respiratoryTherapyList);
	}

	public void copy(Container.PrimaryPrevention org) {
		setMedicalTherapyList(org.getMedicalTherapyList());
		setOccupationalTherapyList(org.getOccupationalTherapyList());
		setPalliativeProcedureList(org.getPalliativeProcedureList());
		setPhysicalTherapyList(org.getPhysicalTherapyList());
		setRadiationTherapyList(org.getRadiationTherapyList());
		setRespiratoryTherapyList(org.getRespiratoryTherapyList());
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
