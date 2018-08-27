package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LOAN_TYPE;
import org.kyojo.schemaorg.m3n4.pending.Container.LoanType;

@ExternalDomain
public class LoanTypeConverter implements DomainConverter<LoanType, String> {

	@Override
	public String fromDomainToValue(LoanType domain) {
		return domain.getNativeValue();
	}

	@Override
	public LoanType fromValueToDomain(String value) {
		return new LOAN_TYPE(value);
	}

}
