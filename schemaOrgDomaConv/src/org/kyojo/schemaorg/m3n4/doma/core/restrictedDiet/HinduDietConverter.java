package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.HINDU_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.HinduDiet;

@ExternalDomain
public class HinduDietConverter implements DomainConverter<HinduDiet, String> {

	@Override
	public String fromDomainToValue(HinduDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public HinduDiet fromValueToDomain(String value) {
		return new HINDU_DIET(value);
	}

}
