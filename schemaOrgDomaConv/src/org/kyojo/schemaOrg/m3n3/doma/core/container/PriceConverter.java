package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRICE;
import org.kyojo.schemaOrg.m3n3.core.Container.Price;

@ExternalDomain
public class PriceConverter implements DomainConverter<Price, String> {

	@Override
	public String fromDomainToValue(Price domain) {
		return domain.getNativeValue();
	}

	@Override
	public Price fromValueToDomain(String value) {
		return new PRICE(value);
	}

}
