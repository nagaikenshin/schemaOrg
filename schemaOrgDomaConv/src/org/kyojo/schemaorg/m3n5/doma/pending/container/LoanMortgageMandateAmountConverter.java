package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LOAN_MORTGAGE_MANDATE_AMOUNT;
import org.kyojo.schemaorg.m3n5.pending.Container.LoanMortgageMandateAmount;

@ExternalDomain
public class LoanMortgageMandateAmountConverter implements DomainConverter<LoanMortgageMandateAmount, String> {

	@Override
	public String fromDomainToValue(LoanMortgageMandateAmount domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanMortgageMandateAmount fromValueToDomain(String value) {
		return new LOAN_MORTGAGE_MANDATE_AMOUNT(value);
	}

}
