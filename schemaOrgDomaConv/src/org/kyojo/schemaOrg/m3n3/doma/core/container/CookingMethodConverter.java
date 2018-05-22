package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COOKING_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.CookingMethod;

@ExternalDomain
public class CookingMethodConverter implements DomainConverter<CookingMethod, String> {

	@Override
	public String fromDomainToValue(CookingMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public CookingMethod fromValueToDomain(String value) {
		return new COOKING_METHOD(value);
	}

}
