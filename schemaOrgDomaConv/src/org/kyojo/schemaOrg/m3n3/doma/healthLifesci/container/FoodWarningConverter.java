package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.FOOD_WARNING;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.FoodWarning;

@ExternalDomain
public class FoodWarningConverter implements DomainConverter<FoodWarning, String> {

	@Override
	public String fromDomainToValue(FoodWarning domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoodWarning fromValueToDomain(String value) {
		return new FOOD_WARNING(value);
	}

}
