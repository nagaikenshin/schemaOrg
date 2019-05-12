package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MAX_PRICE;
import org.kyojo.schemaorg.m3n5.core.Container.MaxPrice;

@ExternalDomain
public class MaxPriceConverter implements DomainConverter<MaxPrice, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MaxPrice domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaxPrice fromValueToDomain(BigDecimal value) {
		return new MAX_PRICE(value);
	}

}
