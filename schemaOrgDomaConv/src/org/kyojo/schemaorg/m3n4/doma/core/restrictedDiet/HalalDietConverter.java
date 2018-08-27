package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.HALAL_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.HalalDiet;

@ExternalDomain
public class HalalDietConverter implements DomainConverter<HalalDiet, String> {

	@Override
	public String fromDomainToValue(HalalDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public HalalDiet fromValueToDomain(String value) {
		return new HALAL_DIET(value);
	}

}