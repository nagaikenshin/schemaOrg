package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.KNOWN_VEHICLE_DAMAGES;
import org.kyojo.schemaOrg.m3n3.core.Container.KnownVehicleDamages;

@ExternalDomain
public class KnownVehicleDamagesConverter implements DomainConverter<KnownVehicleDamages, String> {

	@Override
	public String fromDomainToValue(KnownVehicleDamages domain) {
		return domain.getNativeValue();
	}

	@Override
	public KnownVehicleDamages fromValueToDomain(String value) {
		return new KNOWN_VEHICLE_DAMAGES(value);
	}

}
