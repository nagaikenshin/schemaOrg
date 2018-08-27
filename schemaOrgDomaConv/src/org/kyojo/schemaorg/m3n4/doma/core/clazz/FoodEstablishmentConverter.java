package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FOOD_ESTABLISHMENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEstablishment;

@ExternalDomain
public class FoodEstablishmentConverter implements DomainConverter<FoodEstablishment, String> {

	@Override
	public String fromDomainToValue(FoodEstablishment domain) {
		return domain.getNativeValue();
	}

	@Override
	public FoodEstablishment fromValueToDomain(String value) {
		return new FOOD_ESTABLISHMENT(value);
	}

}