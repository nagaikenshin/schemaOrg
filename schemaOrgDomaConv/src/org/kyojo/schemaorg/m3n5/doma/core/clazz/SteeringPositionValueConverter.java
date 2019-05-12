package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.STEERING_POSITION_VALUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.SteeringPositionValue;

@ExternalDomain
public class SteeringPositionValueConverter implements DomainConverter<SteeringPositionValue, String> {

	@Override
	public String fromDomainToValue(SteeringPositionValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public SteeringPositionValue fromValueToDomain(String value) {
		return new STEERING_POSITION_VALUE(value);
	}

}