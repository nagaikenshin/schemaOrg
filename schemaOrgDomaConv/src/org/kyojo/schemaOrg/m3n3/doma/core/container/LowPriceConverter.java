package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOW_PRICE;
import org.kyojo.schemaOrg.m3n3.core.Container.LowPrice;

@ExternalDomain
public class LowPriceConverter implements DomainConverter<LowPrice, String> {

	@Override
	public String fromDomainToValue(LowPrice domain) {
		return domain.getNativeValue();
	}

	@Override
	public LowPrice fromValueToDomain(String value) {
		return new LOW_PRICE(value);
	}

}
