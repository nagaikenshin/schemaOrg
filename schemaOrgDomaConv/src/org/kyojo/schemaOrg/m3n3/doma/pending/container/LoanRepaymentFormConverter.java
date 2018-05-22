package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LOAN_REPAYMENT_FORM;
import org.kyojo.schemaOrg.m3n3.pending.Container.LoanRepaymentForm;

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
