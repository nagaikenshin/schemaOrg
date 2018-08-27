package org.kyojo.schemaorg.m3n4.doma.core.restrictedDiet;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.restrictedDiet.VEGETARIAN_DIET;
import org.kyojo.schemaorg.m3n4.core.RestrictedDiet.VegetarianDiet;

@ExternalDomain
public class VegetarianDietConverter implements DomainConverter<VegetarianDiet, String> {

	@Override
	public String fromDomainToValue(VegetarianDiet domain) {
		return domain.getNativeValue();
	}

	@Override
	public VegetarianDiet fromValueToDomain(String value) {
		return new VEGETARIAN_DIET(value);
	}

}
