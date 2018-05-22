package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAS_MAP;
import org.kyojo.schemaOrg.m3n3.core.Container.HasMap;

@ExternalDomain
public class HasMapConverter implements DomainConverter<HasMap, String> {

	@Override
	public String fromDomainToValue(HasMap domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasMap fromValueToDomain(String value) {
		return new HAS_MAP(value);
	}

}
