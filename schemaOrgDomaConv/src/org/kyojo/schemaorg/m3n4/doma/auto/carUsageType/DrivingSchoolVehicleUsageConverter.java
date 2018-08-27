package org.kyojo.schemaorg.m3n4.doma.auto.carUsageType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.carUsageType.DRIVING_SCHOOL_VEHICLE_USAGE;
import org.kyojo.schemaorg.m3n4.auto.CarUsageType.DrivingSchoolVehicleUsage;

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
