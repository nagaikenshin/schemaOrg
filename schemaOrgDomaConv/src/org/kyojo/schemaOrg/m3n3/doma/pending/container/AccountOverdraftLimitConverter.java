package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.ACCOUNT_OVERDRAFT_LIMIT;
import org.kyojo.schemaOrg.m3n3.pending.Container.AccountOverdraftLimit;

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
