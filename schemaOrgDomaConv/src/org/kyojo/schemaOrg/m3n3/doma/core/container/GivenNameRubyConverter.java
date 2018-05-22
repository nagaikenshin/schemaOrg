package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GIVEN_NAME_RUBY;
import org.kyojo.schemaOrg.m3n3.core.Container.GivenNameRuby;

@ExternalDomain
public class GivenNameRubyConverter implements DomainConverter<GivenNameRuby, String> {

	@Override
	public String fromDomainToValue(GivenNameRuby domain) {
		return domain.getNativeValue();
	}

	@Override
	public GivenNameRuby fromValueToDomain(String value) {
		return new GIVEN_NAME_RUBY(value);
	}

}
