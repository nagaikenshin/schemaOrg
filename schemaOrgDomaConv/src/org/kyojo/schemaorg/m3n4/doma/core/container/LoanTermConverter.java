package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LOAN_TERM;
import org.kyojo.schemaorg.m3n4.core.Container.LoanTerm;

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
