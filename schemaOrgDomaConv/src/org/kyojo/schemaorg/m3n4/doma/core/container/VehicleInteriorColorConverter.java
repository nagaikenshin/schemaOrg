package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE_INTERIOR_COLOR;
import org.kyojo.schemaorg.m3n4.core.Container.VehicleInteriorColor;

@ExternalDomain
public class VehicleInteriorColorConverter implements DomainConverter<VehicleInteriorColor, String> {

	@Override
	public String fromDomainToValue(VehicleInteriorColor domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleInteriorColor fromValueToDomain(String value) {
		return new VEHICLE_INTERIOR_COLOR(value);
	}

}
