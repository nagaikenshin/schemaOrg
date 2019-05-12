package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VALID_FOR;
import org.kyojo.schemaorg.m3n5.core.Container.ValidFor;

@ExternalDomain
public class ValidForConverter implements DomainConverter<ValidFor, String> {

	@Override
	public String fromDomainToValue(ValidFor domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValidFor fromValueToDomain(String value) {
		return new VALID_FOR(value);
	}

}
