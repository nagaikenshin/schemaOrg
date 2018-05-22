package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HIGH_PRICE;
import org.kyojo.schemaOrg.m3n3.core.Container.HighPrice;

@ExternalDomain
public class HighPriceConverter implements DomainConverter<HighPrice, String> {

	@Override
	public String fromDomainToValue(HighPrice domain) {
		return domain.getNativeValue();
	}

	@Override
	public HighPrice fromValueToDomain(String value) {
		return new HIGH_PRICE(value);
	}

}
