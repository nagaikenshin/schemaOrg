package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TIRE_SHOP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TireShop;

@ExternalDomain
public class TireShopConverter implements DomainConverter<TireShop, String> {

	@Override
	public String fromDomainToValue(TireShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public TireShop fromValueToDomain(String value) {
		return new TIRE_SHOP(value);
	}

}
