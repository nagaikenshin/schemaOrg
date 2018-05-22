package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.MORTGAGE_LOAN;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.MortgageLoan;

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
