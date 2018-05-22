package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GREATER_OR_EQUAL;
import org.kyojo.schemaOrg.m3n3.core.Container.GreaterOrEqual;

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
