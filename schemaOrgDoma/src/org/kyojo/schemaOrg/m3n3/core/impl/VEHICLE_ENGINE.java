package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EngineSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class VEHICLE_ENGINE implements Container.VehicleEngine {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<EngineSpecification> engineSpecificationList;

	public VEHICLE_ENGINE() {
	}

	public VEHICLE_ENGINE(String string) {
		this(new ENGINE_SPECIFICATION(string));
	}

	public String getString() {
		if(engineSpecificationList == null || engineSpecificationList.size() == 0 || engineSpecificationList.get(0) == null) {
			return null;
		} else {
			Name name = engineSpecificationList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(engineSpecificationList == null) {
			engineSpecificationList = new ArrayList<EngineSpecification>();
		}
		if(engineSpecificationList.size() == 0) {
			engineSpecificationList.add(new ENGINE_SPECIFICATION(string));
		} else {
			engineSpecificationList.set(0, new ENGINE_SPECIFICATION(string));
		}
	}

	public VEHICLE_ENGINE(EngineSpecification engineSpecification) {
		engineSpecificationList = new ArrayList<EngineSpecification>();
		engineSpecificationList.add(engineSpecification);
	}

	@Override
	public EngineSpecification getEngineSpecification() {
		if(engineSpecificationList != null && engineSpecificationList.size() > 0) {
			return engineSpecificationList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEngineSpecification(EngineSpecification engineSpecification) {
		if(engineSpecificationList == null) {
			engineSpecificationList = new ArrayList<>();
		}
		if(engineSpecificationList.size() == 0) {
			engineSpecificationList.add(engineSpecification);
		} else {
			engineSpecificationList.set(0, engineSpecification);
		}
	}

	@Override
	public List<EngineSpecification> getEngineSpecificationList() {
		return engineSpecificationList;
	}

	@Override
	public void setEngineSpecificationList(List<EngineSpecification> engineSpecificationList) {
		this.engineSpecificationList = engineSpecificationList;
	}

	@Override
	public boolean hasEngineSpecification() {
		return engineSpecificationList != null && engineSpecificationList.size() > 0 && engineSpecificationList.get(0) != null;
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
