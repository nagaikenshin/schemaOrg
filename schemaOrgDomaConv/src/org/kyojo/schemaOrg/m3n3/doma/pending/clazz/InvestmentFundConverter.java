package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.INVESTMENT_FUND;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.InvestmentFund;

@ExternalDomain
public class InvestmentFundConverter implements DomainConverter<InvestmentFund, String> {

	@Override
	public String fromDomainToValue(InvestmentFund domain) {
		return domain.getNativeValue();
	}

	@Override
	public InvestmentFund fromValueToDomain(String value) {
		return new INVESTMENT_FUND(value);
	}

}
