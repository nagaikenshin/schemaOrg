package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LOAN_REPAYMENT_FORM;
import org.kyojo.schemaorg.m3n4.pending.Container.LoanRepaymentForm;

@ExternalDomain
public class LoanRepaymentFormConverter implements DomainConverter<LoanRepaymentForm, String> {

	@Override
	public String fromDomainToValue(LoanRepaymentForm domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanRepaymentForm fromValueToDomain(String value) {
		return new LOAN_REPAYMENT_FORM(value);
	}

}
