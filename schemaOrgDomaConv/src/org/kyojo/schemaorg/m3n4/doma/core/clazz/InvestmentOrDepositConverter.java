package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INVESTMENT_OR_DEPOSIT;
import org.kyojo.schemaorg.m3n4.core.Clazz.InvestmentOrDeposit;

@ExternalDomain
public class InvestmentOrDepositConverter implements DomainConverter<InvestmentOrDeposit, String> {

	@Override
	public String fromDomainToValue(InvestmentOrDeposit domain) {
		return domain.getNativeValue();
	}

	@Override
	public InvestmentOrDeposit fromValueToDomain(String value) {
		return new INVESTMENT_OR_DEPOSIT(value);
	}

}
