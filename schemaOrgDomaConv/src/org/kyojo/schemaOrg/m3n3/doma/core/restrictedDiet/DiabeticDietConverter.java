package org.kyojo.schemaOrg.m3n3.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.restrictedDiet.DIABETIC_DIET;
import org.kyojo.schemaOrg.m3n3.core.RestrictedDiet.DiabeticDiet;

@ExternalDomain
public class DiabeticDietConverter implements DomainConverter<DiabeticDiet, String> {

	@Override
	public String fromDomainToValue(DiabeticDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiabeticDiet fromValueToDomain(String value) {
		return new DIABETIC_DIET(value);
	}

}
