package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOOD_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.FoodEvent;

@ExternalDomain
public class FoodEventConverter implements DomainConverter<FoodEvent, String> {

	@Override
	public String fromDomainToValue(FoodEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoodEvent fromValueToDomain(String value) {
		return new FOOD_EVENT(value);
	}

}
