package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TIRE_SHOP;
import org.kyojo.schemaorg.m3n4.core.Clazz.TireShop;

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
