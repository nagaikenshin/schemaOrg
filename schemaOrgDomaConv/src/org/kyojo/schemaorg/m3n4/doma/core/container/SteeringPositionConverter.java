package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STEERING_POSITION;
import org.kyojo.schemaorg.m3n4.core.Container.SteeringPosition;

@ExternalDomain
public class SteeringPositionConverter implements DomainConverter<SteeringPosition, String> {

	@Override
	public String fromDomainToValue(SteeringPosition domain) {
		return domain.getNativeValue();
	}

	@Override
	public SteeringPosition fromValueToDomain(String value) {
		return new STEERING_POSITION(value);
	}

}
