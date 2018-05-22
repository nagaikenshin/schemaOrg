package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VEHICLE_IDENTIFICATION_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleIdentificationNumber;

@ExternalDomain
public class VehicleIdentificationNumberConverter implements DomainConverter<VehicleIdentificationNumber, String> {

	@Override
	public String fromDomainToValue(VehicleIdentificationNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleIdentificationNumber fromValueToDomain(String value) {
		return new VEHICLE_IDENTIFICATION_NUMBER(value);
	}

}
