package org.kyojo.schemaorg.m3n5.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.AnatomicalStructure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.AnatomicalSystem;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Artery;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Bone;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.BrainStructure;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Joint;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Ligament;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.LymphaticVessel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Muscle;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Nerve;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Vein;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Vessel;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container;
import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ANATOMICAL_STRUCTURE;

import org.seasar.doma.Transient;

public class RELATED_ANATOMY implements Container.RelatedAnatomy {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<AnatomicalStructure> anatomicalStructureList;
	@Transient
	public List<AnatomicalSystem> anatomicalSystemList;
	@Transient
	public List<Artery> arteryList;
	@Transient
	public List<Bone> boneList;
	@Transient
	public List<BrainStructure> brainStructureList;
	@Transient
	public List<Joint> jointList;
	@Transient
	public List<Ligament> ligamentList;
	@Transient
	public List<LymphaticVessel> lymphaticVesselList;
	@Transient
	public List<Muscle> muscleList;
	@Transient
	public List<Nerve> nerveList;
	@Transient
	public List<Vein> veinList;
	@Transient
	public List<Vessel> vesselList;

	public RELATED_ANATOMY() {
	}

	public RELATED_ANATOMY(String string) {
		this(new ANATOMICAL_STRUCTURE(string));
	}

	public String getString() {
		if(anatomicalStructureList == null || anatomicalStructureList.size() == 0 || anatomicalStructureList.get(0) == null) {
			return null;
		} else {
			Name name = anatomicalStructureList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(new ANATOMICAL_STRUCTURE(string));
		} else {
			anatomicalStructureList.set(0, new ANATOMICAL_STRUCTURE(string));
		}
	}

	public RELATED_ANATOMY(AnatomicalStructure anatomicalStructure) {
		anatomicalStructureList = new ArrayList<AnatomicalStructure>();
		anatomicalStructureList.add(anatomicalStructure);
	}

	@Override
	public AnatomicalStructure getAnatomicalStructure() {
		if(anatomicalStructureList != null && anatomicalStructureList.size() > 0) {
			return anatomicalStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalStructure(AnatomicalStructure anatomicalStructure) {
		if(anatomicalStructureList == null) {
			anatomicalStructureList = new ArrayList<>();
		}
		if(anatomicalStructureList.size() == 0) {
			anatomicalStructureList.add(anatomicalStructure);
		} else {
			anatomicalStructureList.set(0, anatomicalStructure);
		}
	}

	@Override
	public List<AnatomicalStructure> getAnatomicalStructureList() {
		return anatomicalStructureList;
	}

	@Override
	public void setAnatomicalStructureList(List<AnatomicalStructure> anatomicalStructureList) {
		this.anatomicalStructureList = anatomicalStructureList;
	}

	@Override
	public boolean hasAnatomicalStructure() {
		return anatomicalStructureList != null && anatomicalStructureList.size() > 0 && anatomicalStructureList.get(0) != null;
	}

	public RELATED_ANATOMY(AnatomicalSystem anatomicalSystem) {
		anatomicalSystemList = new ArrayList<AnatomicalSystem>();
		anatomicalSystemList.add(anatomicalSystem);
	}

	@Override
	public AnatomicalSystem getAnatomicalSystem() {
		if(anatomicalSystemList != null && anatomicalSystemList.size() > 0) {
			return anatomicalSystemList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnatomicalSystem(AnatomicalSystem anatomicalSystem) {
		if(anatomicalSystemList == null) {
			anatomicalSystemList = new ArrayList<>();
		}
		if(anatomicalSystemList.size() == 0) {
			anatomicalSystemList.add(anatomicalSystem);
		} else {
			anatomicalSystemList.set(0, anatomicalSystem);
		}
	}

	@Override
	public List<AnatomicalSystem> getAnatomicalSystemList() {
		return anatomicalSystemList;
	}

	@Override
	public void setAnatomicalSystemList(List<AnatomicalSystem> anatomicalSystemList) {
		this.anatomicalSystemList = anatomicalSystemList;
	}

	@Override
	public boolean hasAnatomicalSystem() {
		return anatomicalSystemList != null && anatomicalSystemList.size() > 0 && anatomicalSystemList.get(0) != null;
	}

	public RELATED_ANATOMY(Artery artery) {
		arteryList = new ArrayList<Artery>();
		arteryList.add(artery);
	}

	@Override
	public Artery getArtery() {
		if(arteryList != null && arteryList.size() > 0) {
			return arteryList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArtery(Artery artery) {
		if(arteryList == null) {
			arteryList = new ArrayList<>();
		}
		if(arteryList.size() == 0) {
			arteryList.add(artery);
		} else {
			arteryList.set(0, artery);
		}
	}

	@Override
	public List<Artery> getArteryList() {
		return arteryList;
	}

	@Override
	public void setArteryList(List<Artery> arteryList) {
		this.arteryList = arteryList;
	}

	@Override
	public boolean hasArtery() {
		return arteryList != null && arteryList.size() > 0 && arteryList.get(0) != null;
	}

	public RELATED_ANATOMY(Bone bone) {
		boneList = new ArrayList<Bone>();
		boneList.add(bone);
	}

	@Override
	public Bone getBone() {
		if(boneList != null && boneList.size() > 0) {
			return boneList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBone(Bone bone) {
		if(boneList == null) {
			boneList = new ArrayList<>();
		}
		if(boneList.size() == 0) {
			boneList.add(bone);
		} else {
			boneList.set(0, bone);
		}
	}

	@Override
	public List<Bone> getBoneList() {
		return boneList;
	}

	@Override
	public void setBoneList(List<Bone> boneList) {
		this.boneList = boneList;
	}

	@Override
	public boolean hasBone() {
		return boneList != null && boneList.size() > 0 && boneList.get(0) != null;
	}

	public RELATED_ANATOMY(BrainStructure brainStructure) {
		brainStructureList = new ArrayList<BrainStructure>();
		brainStructureList.add(brainStructure);
	}

	@Override
	public BrainStructure getBrainStructure() {
		if(brainStructureList != null && brainStructureList.size() > 0) {
			return brainStructureList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBrainStructure(BrainStructure brainStructure) {
		if(brainStructureList == null) {
			brainStructureList = new ArrayList<>();
		}
		if(brainStructureList.size() == 0) {
			brainStructureList.add(brainStructure);
		} else {
			brainStructureList.set(0, brainStructure);
		}
	}

	@Override
	public List<BrainStructure> getBrainStructureList() {
		return brainStructureList;
	}

	@Override
	public void setBrainStructureList(List<BrainStructure> brainStructureList) {
		this.brainStructureList = brainStructureList;
	}

	@Override
	public boolean hasBrainStructure() {
		return brainStructureList != null && brainStructureList.size() > 0 && brainStructureList.get(0) != null;
	}

	public RELATED_ANATOMY(Joint joint) {
		jointList = new ArrayList<Joint>();
		jointList.add(joint);
	}

	@Override
	public Joint getJoint() {
		if(jointList != null && jointList.size() > 0) {
			return jointList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJoint(Joint joint) {
		if(jointList == null) {
			jointList = new ArrayList<>();
		}
		if(jointList.size() == 0) {
			jointList.add(joint);
		} else {
			jointList.set(0, joint);
		}
	}

	@Override
	public List<Joint> getJointList() {
		return jointList;
	}

	@Override
	public void setJointList(List<Joint> jointList) {
		this.jointList = jointList;
	}

	@Override
	public boolean hasJoint() {
		return jointList != null && jointList.size() > 0 && jointList.get(0) != null;
	}

	public RELATED_ANATOMY(Ligament ligament) {
		ligamentList = new ArrayList<Ligament>();
		ligamentList.add(ligament);
	}

	@Override
	public Ligament getLigament() {
		if(ligamentList != null && ligamentList.size() > 0) {
			return ligamentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLigament(Ligament ligament) {
		if(ligamentList == null) {
			ligamentList = new ArrayList<>();
		}
		if(ligamentList.size() == 0) {
			ligamentList.add(ligament);
		} else {
			ligamentList.set(0, ligament);
		}
	}

	@Override
	public List<Ligament> getLigamentList() {
		return ligamentList;
	}

	@Override
	public void setLigamentList(List<Ligament> ligamentList) {
		this.ligamentList = ligamentList;
	}

	@Override
	public boolean hasLigament() {
		return ligamentList != null && ligamentList.size() > 0 && ligamentList.get(0) != null;
	}

	public RELATED_ANATOMY(LymphaticVessel lymphaticVessel) {
		lymphaticVesselList = new ArrayList<LymphaticVessel>();
		lymphaticVesselList.add(lymphaticVessel);
	}

	@Override
	public LymphaticVessel getLymphaticVessel() {
		if(lymphaticVesselList != null && lymphaticVesselList.size() > 0) {
			return lymphaticVesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLymphaticVessel(LymphaticVessel lymphaticVessel) {
		if(lymphaticVesselList == null) {
			lymphaticVesselList = new ArrayList<>();
		}
		if(lymphaticVesselList.size() == 0) {
			lymphaticVesselList.add(lymphaticVessel);
		} else {
			lymphaticVesselList.set(0, lymphaticVessel);
		}
	}

	@Override
	public List<LymphaticVessel> getLymphaticVesselList() {
		return lymphaticVesselList;
	}

	@Override
	public void setLymphaticVesselList(List<LymphaticVessel> lymphaticVesselList) {
		this.lymphaticVesselList = lymphaticVesselList;
	}

	@Override
	public boolean hasLymphaticVessel() {
		return lymphaticVesselList != null && lymphaticVesselList.size() > 0 && lymphaticVesselList.get(0) != null;
	}

	public RELATED_ANATOMY(Muscle muscle) {
		muscleList = new ArrayList<Muscle>();
		muscleList.add(muscle);
	}

	@Override
	public Muscle getMuscle() {
		if(muscleList != null && muscleList.size() > 0) {
			return muscleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMuscle(Muscle muscle) {
		if(muscleList == null) {
			muscleList = new ArrayList<>();
		}
		if(muscleList.size() == 0) {
			muscleList.add(muscle);
		} else {
			muscleList.set(0, muscle);
		}
	}

	@Override
	public List<Muscle> getMuscleList() {
		return muscleList;
	}

	@Override
	public void setMuscleList(List<Muscle> muscleList) {
		this.muscleList = muscleList;
	}

	@Override
	public boolean hasMuscle() {
		return muscleList != null && muscleList.size() > 0 && muscleList.get(0) != null;
	}

	public RELATED_ANATOMY(Nerve nerve) {
		nerveList = new ArrayList<Nerve>();
		nerveList.add(nerve);
	}

	@Override
	public Nerve getNerve() {
		if(nerveList != null && nerveList.size() > 0) {
			return nerveList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNerve(Nerve nerve) {
		if(nerveList == null) {
			nerveList = new ArrayList<>();
		}
		if(nerveList.size() == 0) {
			nerveList.add(nerve);
		} else {
			nerveList.set(0, nerve);
		}
	}

	@Override
	public List<Nerve> getNerveList() {
		return nerveList;
	}

	@Override
	public void setNerveList(List<Nerve> nerveList) {
		this.nerveList = nerveList;
	}

	@Override
	public boolean hasNerve() {
		return nerveList != null && nerveList.size() > 0 && nerveList.get(0) != null;
	}

	public RELATED_ANATOMY(Vein vein) {
		veinList = new ArrayList<Vein>();
		veinList.add(vein);
	}

	@Override
	public Vein getVein() {
		if(veinList != null && veinList.size() > 0) {
			return veinList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVein(Vein vein) {
		if(veinList == null) {
			veinList = new ArrayList<>();
		}
		if(veinList.size() == 0) {
			veinList.add(vein);
		} else {
			veinList.set(0, vein);
		}
	}

	@Override
	public List<Vein> getVeinList() {
		return veinList;
	}

	@Override
	public void setVeinList(List<Vein> veinList) {
		this.veinList = veinList;
	}

	@Override
	public boolean hasVein() {
		return veinList != null && veinList.size() > 0 && veinList.get(0) != null;
	}

	public RELATED_ANATOMY(Vessel vessel) {
		vesselList = new ArrayList<Vessel>();
		vesselList.add(vessel);
	}

	@Override
	public Vessel getVessel() {
		if(vesselList != null && vesselList.size() > 0) {
			return vesselList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVessel(Vessel vessel) {
		if(vesselList == null) {
			vesselList = new ArrayList<>();
		}
		if(vesselList.size() == 0) {
			vesselList.add(vessel);
		} else {
			vesselList.set(0, vessel);
		}
	}

	@Override
	public List<Vessel> getVesselList() {
		return vesselList;
	}

	@Override
	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}

	@Override
	public boolean hasVessel() {
		return vesselList != null && vesselList.size() > 0 && vesselList.get(0) != null;
	}

	public RELATED_ANATOMY(List<AnatomicalStructure> anatomicalStructureList,
			List<AnatomicalSystem> anatomicalSystemList,
			List<Artery> arteryList,
			List<Bone> boneList,
			List<BrainStructure> brainStructureList,
			List<Joint> jointList,
			List<Ligament> ligamentList,
			List<LymphaticVessel> lymphaticVesselList,
			List<Muscle> muscleList,
			List<Nerve> nerveList,
			List<Vein> veinList,
			List<Vessel> vesselList) {
		setAnatomicalStructureList(anatomicalStructureList);
		setAnatomicalSystemList(anatomicalSystemList);
		setArteryList(arteryList);
		setBoneList(boneList);
		setBrainStructureList(brainStructureList);
		setJointList(jointList);
		setLigamentList(ligamentList);
		setLymphaticVesselList(lymphaticVesselList);
		setMuscleList(muscleList);
		setNerveList(nerveList);
		setVeinList(veinList);
		setVesselList(vesselList);
	}

	public void copy(Container.RelatedAnatomy org) {
		setAnatomicalStructureList(org.getAnatomicalStructureList());
		setAnatomicalSystemList(org.getAnatomicalSystemList());
		setArteryList(org.getArteryList());
		setBoneList(org.getBoneList());
		setBrainStructureList(org.getBrainStructureList());
		setJointList(org.getJointList());
		setLigamentList(org.getLigamentList());
		setLymphaticVesselList(org.getLymphaticVesselList());
		setMuscleList(org.getMuscleList());
		setNerveList(org.getNerveList());
		setVeinList(org.getVeinList());
		setVesselList(org.getVesselList());
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
