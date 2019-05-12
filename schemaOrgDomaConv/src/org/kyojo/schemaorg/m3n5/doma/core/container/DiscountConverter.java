package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DISCOUNT;
import org.kyojo.schemaorg.m3n5.core.Container.Discount;

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
