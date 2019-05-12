package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.ACCOUNT_OVERDRAFT_LIMIT;
import org.kyojo.schemaorg.m3n5.pending.Container.AccountOverdraftLimit;

@ExternalDomain
public class AccountOverdraftLimitConverter implements DomainConverter<AccountOverdraftLimit, String> {

	@Override
	public String fromDomainToValue(AccountOverdraftLimit domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccountOverdraftLimit fromValueToDomain(String value) {
		return new ACCOUNT_OVERDRAFT_LIMIT(value);
	}

}
