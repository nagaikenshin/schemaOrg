package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.NUMBER_OF_LOAN_PAYMENTS;
import org.kyojo.schemaOrg.m3n3.pending.Container.NumberOfLoanPayments;

@ExternalDomain
public class NumberOfLoanPaymentsConverter implements DomainConverter<NumberOfLoanPayments, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfLoanPayments domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfLoanPayments fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_LOAN_PAYMENTS(value);
	}

}
