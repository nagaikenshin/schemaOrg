package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.ACCELERATION_TIME;
import org.kyojo.schemaorg.m3n5.auto.Container.AccelerationTime;

@ExternalDomain
public class AccelerationTimeConverter implements DomainConverter<AccelerationTime, String> {

	@Override
	public String fromDomainToValue(AccelerationTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccelerationTime fromValueToDomain(String value) {
		return new ACCELERATION_TIME(value);
	}

}
