package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTO_BODY_SHOP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutoBodyShop;

@ExternalDomain
public class AutoBodyShopConverter implements DomainConverter<AutoBodyShop, String> {

	@Override
	public String fromDomainToValue(AutoBodyShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoBodyShop fromValueToDomain(String value) {
		return new AUTO_BODY_SHOP(value);
	}

}
