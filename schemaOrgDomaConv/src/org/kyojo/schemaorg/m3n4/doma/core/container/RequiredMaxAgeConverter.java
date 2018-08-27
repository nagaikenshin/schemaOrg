package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_MAX_AGE;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMaxAge;

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
