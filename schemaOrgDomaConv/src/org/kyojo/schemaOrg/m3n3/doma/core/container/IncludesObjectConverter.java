package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INCLUDES_OBJECT;
import org.kyojo.schemaOrg.m3n3.core.Container.IncludesObject;

@ExternalDomain
public class IncludesObjectConverter implements DomainConverter<IncludesObject, String> {

	@Override
	public String fromDomainToValue(IncludesObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public IncludesObject fromValueToDomain(String value) {
		return new INCLUDES_OBJECT(value);
	}

}
