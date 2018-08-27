package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SHOPPING_CENTER;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShoppingCenter;

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
