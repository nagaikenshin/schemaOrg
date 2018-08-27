package org.kyojo.schemaorg.m3n4.doma.auto.carUsageType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.carUsageType.RENTAL_VEHICLE_USAGE;
import org.kyojo.schemaorg.m3n4.auto.CarUsageType.RentalVehicleUsage;

@ExternalDomain
public class RentalVehicleUsageConverter implements DomainConverter<RentalVehicleUsage, String> {

	@Override
	public String fromDomainToValue(RentalVehicleUsage domain) {
		return domain.getNativeValue();
	}

	@Override
	public RentalVehicleUsage fromValueToDomain(String value) {
		return new RENTAL_VEHICLE_USAGE(value);
	}

}
