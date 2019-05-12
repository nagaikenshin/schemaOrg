package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VEHICLE_SEATING_CAPACITY;
import org.kyojo.schemaorg.m3n5.core.Container.VehicleSeatingCapacity;

@ExternalDomain
public class VehicleSeatingCapacityConverter implements DomainConverter<VehicleSeatingCapacity, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(VehicleSeatingCapacity domain) {
		return domain.getNativeValue();
	}

	@Override
	public VehicleSeatingCapacity fromValueToDomain(BigDecimal value) {
		return new VEHICLE_SEATING_CAPACITY(value);
	}

}
