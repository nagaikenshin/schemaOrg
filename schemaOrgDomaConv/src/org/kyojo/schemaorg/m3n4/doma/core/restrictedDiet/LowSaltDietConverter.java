package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.LOW_SALT_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.LowSaltDiet;

@ExternalDomain
public class LowSaltDietConverter implements DomainConverter<LowSaltDiet, String> {

	@Override
	public String fromDomainToValue(LowSaltDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public LowSaltDiet fromValueToDomain(String value) {
		return new LOW_SALT_DIET(value);
	}

}
