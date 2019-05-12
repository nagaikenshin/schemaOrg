package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LOAN_PAYMENT_AMOUNT;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanPaymentAmount;

@ExternalDomain
public class LoanPaymentAmountConverter implements DomainConverter<LoanPaymentAmount, String> {

	@Override
	public String fromDomainToValue(LoanPaymentAmount domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanPaymentAmount fromValueToDomain(String value) {
		return new LOAN_PAYMENT_AMOUNT(value);
	}

}
