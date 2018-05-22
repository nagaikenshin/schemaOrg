package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOAN_OR_CREDIT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LoanOrCredit;

@ExternalDomain
public class LoanOrCreditConverter implements DomainConverter<LoanOrCredit, String> {

	@Override
	public String fromDomainToValue(LoanOrCredit domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanOrCredit fromValueToDomain(String value) {
		return new LOAN_OR_CREDIT(value);
	}

}
