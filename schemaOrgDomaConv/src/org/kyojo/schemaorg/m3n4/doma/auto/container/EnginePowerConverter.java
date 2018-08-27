package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.ENGINE_POWER;
import org.kyojo.schemaorg.m3n4.auto.Container.EnginePower;

@ExternalDomain
public class EnginePowerConverter implements DomainConverter<EnginePower, String> {

	@Override
	public String fromDomainToValue(EnginePower domain) {
		return domain.getNativeValue();
	}

	@Override
	public EnginePower fromValueToDomain(String value) {
		return new ENGINE_POWER(value);
	}

}
