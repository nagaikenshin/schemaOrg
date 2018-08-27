package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.LOW_CALORIE_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.LowCalorieDiet;

@ExternalDomain
public class LowCalorieDietConverter implements DomainConverter<LowCalorieDiet, String> {

	@Override
	public String fromDomainToValue(LowCalorieDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public LowCalorieDiet fromValueToDomain(String value) {
		return new LOW_CALORIE_DIET(value);
	}

}
