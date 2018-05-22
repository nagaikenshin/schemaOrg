package org.kyojo.schemaOrg.m3n3.doma.meta.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.meta.impl.DOMAIN_INCLUDES;
import org.kyojo.schemaOrg.m3n3.meta.Container.DomainIncludes;

@ExternalDomain
public class DomainIncludesConverter implements DomainConverter<DomainIncludes, String> {

	@Override
	public String fromDomainToValue(DomainIncludes domain) {
		return domain.getNativeValue();
	}

	@Override
	public DomainIncludes fromValueToDomain(String value) {
		return new DOMAIN_INCLUDES(value);
	}

}
