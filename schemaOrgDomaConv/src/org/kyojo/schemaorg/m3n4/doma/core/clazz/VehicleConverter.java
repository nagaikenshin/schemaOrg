package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VEHICLE;
import org.kyojo.schemaorg.m3n4.core.Clazz.Vehicle;

@ExternalDomain
public class VehicleConverter implements DomainConverter<Vehicle, String> {

	@Override
	public String fromDomainToValue(Vehicle domain) {
		return domain.getNativeValue();
	}

	@Override
	public Vehicle fromValueToDomain(String value) {
		return new VEHICLE(value);
	}

}
