package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LESSER;
import org.kyojo.schemaOrg.m3n3.core.Container.Lesser;

@ExternalDomain
public class LesserConverter implements DomainConverter<Lesser, String> {

	@Override
	public String fromDomainToValue(Lesser domain) {
		return domain.getNativeValue();
	}

	@Override
	public Lesser fromValueToDomain(String value) {
		return new LESSER(value);
	}

}
