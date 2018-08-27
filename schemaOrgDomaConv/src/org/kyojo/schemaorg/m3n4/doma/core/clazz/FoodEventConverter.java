package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FOOD_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEvent;

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
