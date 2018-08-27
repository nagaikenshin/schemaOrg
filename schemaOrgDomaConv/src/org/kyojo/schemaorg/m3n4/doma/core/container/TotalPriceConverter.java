package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TOTAL_PRICE;
import org.kyojo.schemaorg.m3n4.core.Container.TotalPrice;

@ExternalDomain
public class TotalPriceConverter implements DomainConverter<TotalPrice, String> {

	@Override
	public String fromDomainToValue(TotalPrice domain) {
		return domain.getNativeValue();
	}

	@Override
	public TotalPrice fromValueToDomain(String value) {
		return new TOTAL_PRICE(value);
	}

}
