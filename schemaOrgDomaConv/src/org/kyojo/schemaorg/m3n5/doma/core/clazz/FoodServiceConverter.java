package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FOOD_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.FoodService;

@ExternalDomain
public class FoodServiceConverter implements DomainConverter<FoodService, String> {

	@Override
	public String fromDomainToValue(FoodService domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoodService fromValueToDomain(String value) {
		return new FOOD_SERVICE(value);
	}

}