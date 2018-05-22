package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEAL_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Container.MealService;

@ExternalDomain
public class MealServiceConverter implements DomainConverter<MealService, String> {

	@Override
	public String fromDomainToValue(MealService domain) {
		return domain.getNativeValue();
	}

	@Override
	public MealService fromValueToDomain(String value) {
		return new MEAL_SERVICE(value);
	}

}
