package org.kyojo.schemaorg.m3n5.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CASH_BACK;
import org.kyojo.schemaorg.m3n5.pending.Container.CashBack;

@ExternalDomain
public class CashBackConverter implements DomainConverter<CashBack, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(CashBack domain) {
		return domain.getNativeValue();
	}

	@Override
	public CashBack fromValueToDomain(BigDecimal value) {
		return new CASH_BACK(value);
	}

}
