package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAX_PRICE;
import org.kyojo.schemaOrg.m3n3.core.Container.MaxPrice;

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
