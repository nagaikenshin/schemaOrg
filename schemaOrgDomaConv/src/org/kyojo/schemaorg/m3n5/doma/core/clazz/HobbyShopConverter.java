package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOBBY_SHOP;
import org.kyojo.schemaorg.m3n5.core.Clazz.HobbyShop;

@ExternalDomain
public class HobbyShopConverter implements DomainConverter<HobbyShop, String> {

	@Override
	public String fromDomainToValue(HobbyShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public HobbyShop fromValueToDomain(String value) {
		return new HOBBY_SHOP(value);
	}

}
