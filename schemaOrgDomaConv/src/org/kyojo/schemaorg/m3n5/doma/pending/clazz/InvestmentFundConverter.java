package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.INVESTMENT_FUND;
import org.kyojo.schemaorg.m3n5.pending.Clazz.InvestmentFund;

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
