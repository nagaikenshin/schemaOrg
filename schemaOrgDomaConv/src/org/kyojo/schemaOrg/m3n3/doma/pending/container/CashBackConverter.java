package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CASH_BACK;
import org.kyojo.schemaOrg.m3n3.pending.Container.CashBack;

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
