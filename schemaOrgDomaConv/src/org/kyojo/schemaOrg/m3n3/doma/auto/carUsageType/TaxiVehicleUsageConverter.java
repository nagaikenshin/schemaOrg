package org.kyojo.schemaOrg.m3n3.doma.auto.carUsageType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.carUsageType.TAXI_VEHICLE_USAGE;
import org.kyojo.schemaOrg.m3n3.auto.CarUsageType.TaxiVehicleUsage;

@ExternalDomain
public class TaxiVehicleUsageConverter implements DomainConverter<TaxiVehicleUsage, String> {

	@Override
	public String fromDomainToValue(TaxiVehicleUsage domain) {
		return domain.getNativeValue();
	}

	@Override
	public TaxiVehicleUsage fromValueToDomain(String value) {
		return new TAXI_VEHICLE_USAGE(value);
	}

}
