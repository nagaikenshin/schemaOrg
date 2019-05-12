package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESTAURANT;
import org.kyojo.schemaorg.m3n5.core.Clazz.Restaurant;

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
