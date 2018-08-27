package org.kyojo.schemaorg.m3n4.doma.core.steeringPositionValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.steeringPositionValue.RIGHT_HAND_DRIVING;
import org.kyojo.schemaorg.m3n4.core.SteeringPositionValue.RightHandDriving;

@ExternalDomain
public class RightHandDrivingConverter implements DomainConverter<RightHandDriving, String> {

	@Override
	public String fromDomainToValue(RightHandDriving domain) {
		return domain.getNativeValue();
	}

	@Override
	public RightHandDriving fromValueToDomain(String value) {
		return new RIGHT_HAND_DRIVING(value);
	}

}
