package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REQUIRED_MAX_AGE;
import org.kyojo.schemaOrg.m3n3.core.Container.RequiredMaxAge;

@ExternalDomain
public class RequiredMaxAgeConverter implements DomainConverter<RequiredMaxAge, Long> {

	@Override
	public Long fromDomainToValue(RequiredMaxAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiredMaxAge fromValueToDomain(Long value) {
		return new REQUIRED_MAX_AGE(value);
	}

}
