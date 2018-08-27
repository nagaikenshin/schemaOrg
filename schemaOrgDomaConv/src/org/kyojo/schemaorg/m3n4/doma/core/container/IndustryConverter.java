package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INDUSTRY;
import org.kyojo.schemaorg.m3n4.core.Container.Industry;

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
