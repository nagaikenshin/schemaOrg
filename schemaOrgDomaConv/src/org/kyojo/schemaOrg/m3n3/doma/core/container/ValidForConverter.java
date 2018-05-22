package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALID_FOR;
import org.kyojo.schemaOrg.m3n3.core.Container.ValidFor;

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
