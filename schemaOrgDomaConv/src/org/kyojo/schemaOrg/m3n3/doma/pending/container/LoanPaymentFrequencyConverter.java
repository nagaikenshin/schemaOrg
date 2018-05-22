package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LOAN_PAYMENT_FREQUENCY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LoanPaymentFrequency;

@ExternalDomain
public class LoanPaymentFrequencyConverter implements DomainConverter<LoanPaymentFrequency, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(LoanPaymentFrequency domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanPaymentFrequency fromValueToDomain(BigDecimal value) {
		return new LOAN_PAYMENT_FREQUENCY(value);
	}

}
