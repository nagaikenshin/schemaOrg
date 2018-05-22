package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VEHICLE_INTERIOR_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleInteriorType;

@ExternalDomain
public class VehicleInteriorTypeConverter implements DomainConverter<VehicleInteriorType, String> {

	@Override
	public String fromDomainToValue(VehicleInteriorType domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleInteriorType fromValueToDomain(String value) {
		return new VEHICLE_INTERIOR_TYPE(value);
	}

}
