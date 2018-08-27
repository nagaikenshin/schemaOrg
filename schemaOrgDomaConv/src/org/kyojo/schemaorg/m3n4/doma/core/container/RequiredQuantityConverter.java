package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REQUIRED_QUANTITY;
import org.kyojo.schemaorg.m3n4.core.Container.RequiredQuantity;

@ExternalDomain
public class RequiredQuantityConverter implements DomainConverter<RequiredQuantity, String> {

	@Override
	public String fromDomainToValue(RequiredQuantity domain) {
		return domain.getNativeValue();
	}

	@Override
	public RequiredQuantity fromValueToDomain(String value) {
		return new REQUIRED_QUANTITY(value);
	}

}
