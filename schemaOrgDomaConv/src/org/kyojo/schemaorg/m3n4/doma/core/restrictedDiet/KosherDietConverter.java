package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.KOSHER_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.KosherDiet;

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
