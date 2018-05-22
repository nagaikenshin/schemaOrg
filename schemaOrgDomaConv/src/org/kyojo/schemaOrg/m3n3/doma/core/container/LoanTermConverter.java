package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOAN_TERM;
import org.kyojo.schemaOrg.m3n3.core.Container.LoanTerm;

@ExternalDomain
public class LoanTermConverter implements DomainConverter<LoanTerm, String> {

	@Override
	public String fromDomainToValue(LoanTerm domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanTerm fromValueToDomain(String value) {
		return new LOAN_TERM(value);
	}

}
