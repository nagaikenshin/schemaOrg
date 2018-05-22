package org.kyojo.schemaOrg.m3n3.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.auto.impl.SPEED;
import org.kyojo.schemaOrg.m3n3.auto.Container.Speed;

@ExternalDomain
public class SpeedConverter implements DomainConverter<Speed, String> {

	@Override
	public String fromDomainToValue(Speed domain) {
		return domain.getNativeValue();
	}

	@Override
	public Speed fromValueToDomain(String value) {
		return new SPEED(value);
	}

}
