package org.kyojo.schemaOrg.m3n3.doma.auto.carUsageType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.carUsageType.DRIVING_SCHOOL_VEHICLE_USAGE;
import org.kyojo.schemaOrg.m3n3.auto.CarUsageType.DrivingSchoolVehicleUsage;

@ExternalDomain
public class DrivingSchoolVehicleUsageConverter implements DomainConverter<DrivingSchoolVehicleUsage, String> {

	@Override
	public String fromDomainToValue(DrivingSchoolVehicleUsage domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrivingSchoolVehicleUsage fromValueToDomain(String value) {
		return new DRIVING_SCHOOL_VEHICLE_USAGE(value);
	}

}
