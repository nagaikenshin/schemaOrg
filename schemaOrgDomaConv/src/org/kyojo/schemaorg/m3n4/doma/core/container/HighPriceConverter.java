package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HIGH_PRICE;
import org.kyojo.schemaorg.m3n4.core.Container.HighPrice;

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
