package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.ENGINE_DISPLACEMENT;
import org.kyojo.schemaorg.m3n5.auto.Container.EngineDisplacement;

@ExternalDomain
public class EngineDisplacementConverter implements DomainConverter<EngineDisplacement, String> {

	@Override
	public String fromDomainToValue(EngineDisplacement domain) {
		return domain.getNativeValue();
	}

	@Override
	public EngineDisplacement fromValueToDomain(String value) {
		return new ENGINE_DISPLACEMENT(value);
	}

}
