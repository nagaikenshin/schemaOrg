package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.INDUSTRY;
import org.kyojo.schemaOrg.m3n3.core.Container.Industry;

@ExternalDomain
public class IndustryConverter implements DomainConverter<Industry, String> {

	@Override
	public String fromDomainToValue(Industry domain) {
		return domain.getNativeValue();
	}

	@Override
	public Industry fromValueToDomain(String value) {
		return new INDUSTRY(value);
	}

}
