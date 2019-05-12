package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.ENGINE_TYPE;
import org.kyojo.schemaorg.m3n5.auto.Container.EngineType;

@ExternalDomain
public class EngineTypeConverter implements DomainConverter<EngineType, String> {

	@Override
	public String fromDomainToValue(EngineType domain) {
		return domain.getNativeValue();
	}

	@Override
	public EngineType fromValueToDomain(String value) {
		return new ENGINE_TYPE(value);
	}

}
