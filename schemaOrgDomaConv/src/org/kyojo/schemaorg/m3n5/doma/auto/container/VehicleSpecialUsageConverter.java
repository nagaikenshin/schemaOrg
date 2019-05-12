package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.VEHICLE_SPECIAL_USAGE;
import org.kyojo.schemaorg.m3n5.auto.Container.VehicleSpecialUsage;

@ExternalDomain
public class VehicleSpecialUsageConverter implements DomainConverter<VehicleSpecialUsage, String> {

	@Override
	public String fromDomainToValue(VehicleSpecialUsage domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleSpecialUsage fromValueToDomain(String value) {
		return new VEHICLE_SPECIAL_USAGE(value);
	}

}
