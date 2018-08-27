package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_INTERIOR_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleInteriorType;

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
