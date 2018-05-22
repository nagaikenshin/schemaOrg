package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOOD_ESTABLISHMENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.FoodEstablishment;

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
