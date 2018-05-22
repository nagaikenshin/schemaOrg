package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MIN_PRICE;
import org.kyojo.schemaOrg.m3n3.core.Container.MinPrice;

@ExternalDomain
public class MinPriceConverter implements DomainConverter<MinPrice, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MinPrice domain) {
		return domain.getNativeValue();
	}

	@Override
	public MinPrice fromValueToDomain(BigDecimal value) {
		return new MIN_PRICE(value);
	}

}
