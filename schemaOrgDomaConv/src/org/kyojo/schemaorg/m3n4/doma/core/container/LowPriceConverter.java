package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOW_PRICE;
import org.kyojo.schemaorg.m3n4.core.Container.LowPrice;

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
