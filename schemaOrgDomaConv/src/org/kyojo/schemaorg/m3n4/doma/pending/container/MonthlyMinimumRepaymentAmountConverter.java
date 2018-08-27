package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.MONTHLY_MINIMUM_REPAYMENT_AMOUNT;
import org.kyojo.schemaorg.m3n4.pending.Container.MonthlyMinimumRepaymentAmount;

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
