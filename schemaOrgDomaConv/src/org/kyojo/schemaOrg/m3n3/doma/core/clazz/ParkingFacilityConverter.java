package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARKING_FACILITY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ParkingFacility;

@ExternalDomain
public class ParkingFacilityConverter implements DomainConverter<ParkingFacility, String> {

	@Override
	public String fromDomainToValue(ParkingFacility domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParkingFacility fromValueToDomain(String value) {
		return new PARKING_FACILITY(value);
	}

}
