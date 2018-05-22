package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VEHICLE_CONFIGURATION;
import org.kyojo.schemaOrg.m3n3.core.Container.VehicleConfiguration;

@ExternalDomain
public class VehicleConfigurationConverter implements DomainConverter<VehicleConfiguration, String> {

	@Override
	public String fromDomainToValue(VehicleConfiguration domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleConfiguration fromValueToDomain(String value) {
		return new VEHICLE_CONFIGURATION(value);
	}

}
