package org.kyojo.schemaorg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Container.Name;
import org.kyojo.schemaorg.m3n3.healthLifesci.Clazz.Muscle;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container;
import org.kyojo.schemaorg.m3n3.healthLifesci.impl.MUSCLE;

public class NERVE_MOTOR implements Container.NerveMotor {

	private static final long serialVersionUID = 1L;

	public List<Muscle> muscleList;

	public NERVE_MOTOR() {
	}

	public NERVE_MOTOR(String string) {
		this(new MUSCLE(string));
	}

	public String getString() {
		if(muscleList == null || muscleList.size() == 0 || muscleList.get(0) == null) {
			return null;
		} else {
			Name name = muscleList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(muscleList == null) {
			muscleList = new ArrayList<Muscle>();
		}
		if(muscleList.size() == 0) {
			muscleList.add(new MUSCLE(string));
		} else {
			muscleList.set(0, new MUSCLE(string));
		}
	}

	public NERVE_MOTOR(Muscle muscle) {
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

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
