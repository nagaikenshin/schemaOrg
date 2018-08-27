package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.MORTGAGE_LOAN;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MortgageLoan;

@ExternalDomain
public class MortgageLoanConverter implements DomainConverter<MortgageLoan, String> {

	@Override
	public String fromDomainToValue(MortgageLoan domain) {
		return domain.getNativeValue();
	}

	@Override
	public MortgageLoan fromValueToDomain(String value) {
		return new MORTGAGE_LOAN(value);
	}

}