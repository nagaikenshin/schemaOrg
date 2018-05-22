package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NON_EQUAL;
import org.kyojo.schemaOrg.m3n3.core.Container.NonEqual;

@ExternalDomain
public class NonEqualConverter implements DomainConverter<NonEqual, String> {

	@Override
	public String fromDomainToValue(NonEqual domain) {
		return domain.getNativeValue();
	}

	@Override
	public NonEqual fromValueToDomain(String value) {
		return new NON_EQUAL(value);
	}

}
