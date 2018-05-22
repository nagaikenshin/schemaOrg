package org.kyojo.schemaOrg.m3n3.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.restrictedDiet.LOW_FAT_DIET;
import org.kyojo.schemaOrg.m3n3.core.RestrictedDiet.LowFatDiet;

@ExternalDomain
public class LowFatDietConverter implements DomainConverter<LowFatDiet, String> {

	@Override
	public String fromDomainToValue(LowFatDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public LowFatDiet fromValueToDomain(String value) {
		return new LOW_FAT_DIET(value);
	}

}
