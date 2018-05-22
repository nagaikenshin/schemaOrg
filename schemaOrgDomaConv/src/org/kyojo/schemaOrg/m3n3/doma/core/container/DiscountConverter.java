package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCOUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.Discount;

@ExternalDomain
public class DiscountConverter implements DomainConverter<Discount, String> {

	@Override
	public String fromDomainToValue(Discount domain) {
		return domain.getNativeValue();
	}

	@Override
	public Discount fromValueToDomain(String value) {
		return new DISCOUNT(value);
	}

}
