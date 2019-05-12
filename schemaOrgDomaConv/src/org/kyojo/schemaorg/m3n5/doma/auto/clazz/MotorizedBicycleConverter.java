package org.kyojo.schemaorg.m3n5.doma.auto.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.MOTORIZED_BICYCLE;
import org.kyojo.schemaorg.m3n5.auto.Clazz.MotorizedBicycle;

@ExternalDomain
public class MotorizedBicycleConverter implements DomainConverter<MotorizedBicycle, String> {

	@Override
	public String fromDomainToValue(MotorizedBicycle domain) {
		return domain.getNativeValue();
	}

	@Override
	public MotorizedBicycle fromValueToDomain(String value) {
		return new MOTORIZED_BICYCLE(value);
	}

}
