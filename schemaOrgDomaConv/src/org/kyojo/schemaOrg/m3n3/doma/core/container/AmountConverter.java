package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AMOUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.Amount;

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
