package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CABLE_OR_SATELLITE_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CableOrSatelliteService;

@ExternalDomain
public class CableOrSatelliteServiceConverter implements DomainConverter<CableOrSatelliteService, String> {

	@Override
	public String fromDomainToValue(CableOrSatelliteService domain) {
		return domain.getNativeValue();
	}

	@Override
	public CableOrSatelliteService fromValueToDomain(String value) {
		return new CABLE_OR_SATELLITE_SERVICE(value);
	}

}
