package org.kyojo.schemaOrg.m3n3.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.restrictedDiet.KOSHER_DIET;
import org.kyojo.schemaOrg.m3n3.core.RestrictedDiet.KosherDiet;

@ExternalDomain
public class KosherDietConverter implements DomainConverter<KosherDiet, String> {

	@Override
	public String fromDomainToValue(KosherDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public KosherDiet fromValueToDomain(String value) {
		return new KOSHER_DIET(value);
	}

}
