package org.kyojo.schemaorg.m3n4.doma.core.steeringPositionValue;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.steeringPositionValue.LEFT_HAND_DRIVING;
import org.kyojo.schemaorg.m3n4.core.SteeringPositionValue.LeftHandDriving;

@ExternalDomain
public class LeftHandDrivingConverter implements DomainConverter<LeftHandDriving, String> {

	@Override
	public String fromDomainToValue(LeftHandDriving domain) {
		return domain.getNativeValue();
	}

	@Override
	public LeftHandDriving fromValueToDomain(String value) {
		return new LEFT_HAND_DRIVING(value);
	}

}
