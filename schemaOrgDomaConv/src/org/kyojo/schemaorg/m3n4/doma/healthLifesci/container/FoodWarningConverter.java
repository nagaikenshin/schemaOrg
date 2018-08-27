package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.FOOD_WARNING;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.FoodWarning;

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