package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COOKING_METHOD;
import org.kyojo.schemaorg.m3n4.core.Container.CookingMethod;

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
