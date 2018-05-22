package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUITE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Suite;

@ExternalDomain
public class SuiteConverter implements DomainConverter<Suite, String> {

	@Override
	public String fromDomainToValue(Suite domain) {
		return domain.getNativeValue();
	}

	@Override
	public Suite fromValueToDomain(String value) {
		return new SUITE(value);
	}

}
