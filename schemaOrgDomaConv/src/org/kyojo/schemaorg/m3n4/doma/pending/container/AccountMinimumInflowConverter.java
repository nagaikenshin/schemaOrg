package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ACCOUNT_MINIMUM_INFLOW;
import org.kyojo.schemaorg.m3n4.pending.Container.AccountMinimumInflow;

@ExternalDomain
public class AccountMinimumInflowConverter implements DomainConverter<AccountMinimumInflow, String> {

	@Override
	public String fromDomainToValue(AccountMinimumInflow domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccountMinimumInflow fromValueToDomain(String value) {
		return new ACCOUNT_MINIMUM_INFLOW(value);
	}

}