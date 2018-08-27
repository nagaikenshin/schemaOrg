package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_MIN_AGE;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredMinAge;

@ExternalDomain
public class RequiredMinAgeConverter implements DomainConverter<RequiredMinAge, Long> {

	@Override
	public Long fromDomainToValue(RequiredMinAge domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiredMinAge fromValueToDomain(Long value) {
		return new REQUIRED_MIN_AGE(value);
	}

}
