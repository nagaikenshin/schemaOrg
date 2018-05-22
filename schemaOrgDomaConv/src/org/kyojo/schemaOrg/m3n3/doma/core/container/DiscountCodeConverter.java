package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCOUNT_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.DiscountCode;

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
