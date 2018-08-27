package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GREATER_OR_EQUAL;
import org.kyojo.schemaorg.m3n4.core.Container.GreaterOrEqual;

@ExternalDomain
public class GreaterOrEqualConverter implements DomainConverter<GreaterOrEqual, String> {

	@Override
	public String fromDomainToValue(GreaterOrEqual domain) {
		return domain.getNativeValue();
	}

	@Override
	public GreaterOrEqual fromValueToDomain(String value) {
		return new GREATER_OR_EQUAL(value);
	}

}