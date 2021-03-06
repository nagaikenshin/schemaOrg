package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.Mass;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class SODIUM_CONTENT implements Container.SodiumContent {

	private static final long serialVersionUID = 1L;

	public List<Mass> massList;

	public SODIUM_CONTENT() {
	}

	public SODIUM_CONTENT(String string) {
		this(new MASS(string));
	}

	public String getString() {
		if(massList == null || massList.size() == 0 || massList.get(0) == null) {
			return null;
		} else {
			Name name = massList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(massList == null) {
			massList = new ArrayList<Mass>();
		}
		if(massList.size() == 0) {
			massList.add(new MASS(string));
		} else {
			massList.set(0, new MASS(string));
		}
	}

	public SODIUM_CONTENT(Mass mass) {
		massList = new ArrayList<Mass>();
		massList.add(mass);
	}

	@Override
	public Mass getMass() {
		if(massList != null && massList.size() > 0) {
			return massList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMass(Mass mass) {
		if(massList == null) {
			massList = new ArrayList<>();
		}
		if(massList.size() == 0) {
			massList.add(mass);
		} else {
			massList.set(0, mass);
		}
	}

	@Override
	public List<Mass> getMassList() {
		return massList;
	}

	@Override
	public void setMassList(List<Mass> massList) {
		this.massList = massList;
	}

	@Override
	public boolean hasMass() {
		return massList != null && massList.size() > 0 && massList.get(0) != null;
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
