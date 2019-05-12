package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PARKING_FACILITY;
import org.kyojo.schemaorg.m3n5.core.Clazz.ParkingFacility;

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