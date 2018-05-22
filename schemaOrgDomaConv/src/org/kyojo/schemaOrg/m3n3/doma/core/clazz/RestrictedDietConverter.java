package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESTRICTED_DIET;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RestrictedDiet;

@ExternalDomain
public class RestrictedDietConverter implements DomainConverter<RestrictedDiet, String> {

	@Override
	public String fromDomainToValue(RestrictedDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public RestrictedDiet fromValueToDomain(String value) {
		return new RESTRICTED_DIET(value);
	}

}
