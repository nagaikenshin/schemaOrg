package org.kyojo.schemaOrg.m3n3.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.restrictedDiet.VEGAN_DIET;
import org.kyojo.schemaOrg.m3n3.core.RestrictedDiet.VeganDiet;

@ExternalDomain
public class VeganDietConverter implements DomainConverter<VeganDiet, String> {

	@Override
	public String fromDomainToValue(VeganDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public VeganDiet fromValueToDomain(String value) {
		return new VEGAN_DIET(value);
	}

}
