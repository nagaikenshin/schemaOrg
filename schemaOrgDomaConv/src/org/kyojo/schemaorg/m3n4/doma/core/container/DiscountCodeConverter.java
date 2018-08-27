package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DISCOUNT_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.DiscountCode;

@ExternalDomain
public class DiscountCodeConverter implements DomainConverter<DiscountCode, String> {

	@Override
	public String fromDomainToValue(DiscountCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiscountCode fromValueToDomain(String value) {
		return new DISCOUNT_CODE(value);
	}

}