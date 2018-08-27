package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LESSER;
import org.kyojo.schemaorg.m3n4.core.Container.Lesser;

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
