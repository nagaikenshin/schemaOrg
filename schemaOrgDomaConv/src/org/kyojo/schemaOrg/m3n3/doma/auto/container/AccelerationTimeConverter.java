package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.ACCELERATION_TIME;
import org.kyojo.schemaOrg.m3n3.auto.Container.AccelerationTime;

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
