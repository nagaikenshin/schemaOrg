package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RESTAURANT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Restaurant;

@ExternalDomain
public class RestaurantConverter implements DomainConverter<Restaurant, String> {

	@Override
	public String fromDomainToValue(Restaurant domain) {
		return domain.getNativeValue();
	}

	@Override
	public Restaurant fromValueToDomain(String value) {
		return new RESTAURANT(value);
	}

}
