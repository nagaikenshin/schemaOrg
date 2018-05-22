package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FAST_FOOD_RESTAURANT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FastFoodRestaurant;

@ExternalDomain
public class FastFoodRestaurantConverter implements DomainConverter<FastFoodRestaurant, String> {

	@Override
	public String fromDomainToValue(FastFoodRestaurant domain) {
		return domain.getNativeValue();
	}

	@Override
	public FastFoodRestaurant fromValueToDomain(String value) {
		return new FAST_FOOD_RESTAURANT(value);
	}

}
