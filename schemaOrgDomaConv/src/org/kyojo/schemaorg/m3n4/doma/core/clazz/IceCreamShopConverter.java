package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ICE_CREAM_SHOP;
import org.kyojo.schemaorg.m3n4.core.Clazz.IceCreamShop;

@ExternalDomain
public class IceCreamShopConverter implements DomainConverter<IceCreamShop, String> {

	@Override
	public String fromDomainToValue(IceCreamShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public IceCreamShop fromValueToDomain(String value) {
		return new ICE_CREAM_SHOP(value);
	}

}
