package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AMOUNT;
import org.kyojo.schemaorg.m3n4.core.Container.Amount;

@ExternalDomain
public class AmountConverter implements DomainConverter<Amount, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Amount domain) {
		return domain.getNativeValue();
	}

	@Override
	public Amount fromValueToDomain(BigDecimal value) {
		return new AMOUNT(value);
	}

}
