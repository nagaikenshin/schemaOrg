package org.kyojo.schemaOrg.m3n3.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.restrictedDiet.LOW_LACTOSE_DIET;
import org.kyojo.schemaOrg.m3n3.core.RestrictedDiet.LowLactoseDiet;

@ExternalDomain
public class LowLactoseDietConverter implements DomainConverter<LowLactoseDiet, String> {

	@Override
	public String fromDomainToValue(LowLactoseDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public LowLactoseDiet fromValueToDomain(String value) {
		return new LOW_LACTOSE_DIET(value);
	}

}
