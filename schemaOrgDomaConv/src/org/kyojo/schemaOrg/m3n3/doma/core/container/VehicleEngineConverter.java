package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VEHICLE_ENGINE;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleEngine;

@ExternalDomain
public class VehicleEngineConverter implements DomainConverter<VehicleEngine, String> {

	@Override
	public String fromDomainToValue(VehicleEngine domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleEngine fromValueToDomain(String value) {
		return new VEHICLE_ENGINE(value);
	}

}
