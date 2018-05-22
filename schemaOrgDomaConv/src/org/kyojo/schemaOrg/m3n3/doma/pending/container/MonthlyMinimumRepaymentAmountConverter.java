package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.MONTHLY_MINIMUM_REPAYMENT_AMOUNT;
import org.kyojo.schemaOrg.m3n3.pending.Container.MonthlyMinimumRepaymentAmount;

@ExternalDomain
public class MonthlyMinimumRepaymentAmountConverter implements DomainConverter<MonthlyMinimumRepaymentAmount, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MonthlyMinimumRepaymentAmount domain) {
		return domain.getNativeValue();
	}

	@Override
	public MonthlyMinimumRepaymentAmount fromValueToDomain(BigDecimal value) {
		return new MONTHLY_MINIMUM_REPAYMENT_AMOUNT(value);
	}

}
