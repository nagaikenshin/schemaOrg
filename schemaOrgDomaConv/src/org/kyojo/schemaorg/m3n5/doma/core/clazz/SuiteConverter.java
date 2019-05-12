package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUITE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Suite;

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
