package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_TRANSMISSION;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleTransmission;

@ExternalDomain
public class VehicleTransmissionConverter implements DomainConverter<VehicleTransmission, String> {

	@Override
	public String fromDomainToValue(VehicleTransmission domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleTransmission fromValueToDomain(String value) {
		return new VEHICLE_TRANSMISSION(value);
	}

}
