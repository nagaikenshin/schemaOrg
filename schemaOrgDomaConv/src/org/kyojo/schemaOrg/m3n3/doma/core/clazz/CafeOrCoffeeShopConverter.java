package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CAFE_OR_COFFEE_SHOP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CafeOrCoffeeShop;

@ExternalDomain
public class CafeOrCoffeeShopConverter implements DomainConverter<CafeOrCoffeeShop, String> {

	@Override
	public String fromDomainToValue(CafeOrCoffeeShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public CafeOrCoffeeShop fromValueToDomain(String value) {
		return new CAFE_OR_COFFEE_SHOP(value);
	}

}
