package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SHOPPING_CENTER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ShoppingCenter;

@ExternalDomain
public class ShoppingCenterConverter implements DomainConverter<ShoppingCenter, String> {

	@Override
	public String fromDomainToValue(ShoppingCenter domain) {
		return domain.getNativeValue();
	}

	@Override
	public ShoppingCenter fromValueToDomain(String value) {
		return new SHOPPING_CENTER(value);
	}

}
