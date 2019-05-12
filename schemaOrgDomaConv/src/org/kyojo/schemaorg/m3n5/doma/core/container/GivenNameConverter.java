package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GIVEN_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.GivenName;

@ExternalDomain
public class GivenNameConverter implements DomainConverter<GivenName, String> {

	@Override
	public String fromDomainToValue(GivenName domain) {
		return domain.getNativeValue();
	}

	@Override
	public GivenName fromValueToDomain(String value) {
		return new GIVEN_NAME(value);
	}

}
