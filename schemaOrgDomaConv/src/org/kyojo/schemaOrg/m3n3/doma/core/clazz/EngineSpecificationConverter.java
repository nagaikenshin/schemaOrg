package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENGINE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EngineSpecification;

@ExternalDomain
public class EngineSpecificationConverter implements DomainConverter<EngineSpecification, String> {

	@Override
	public String fromDomainToValue(EngineSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public EngineSpecification fromValueToDomain(String value) {
		return new ENGINE_SPECIFICATION(value);
	}

}
