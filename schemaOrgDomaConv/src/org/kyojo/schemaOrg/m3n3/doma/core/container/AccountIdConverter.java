package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCOUNT_ID;
import org.kyojo.schemaOrg.m3n3.core.Container.AccountId;

@ExternalDomain
public class AccountIdConverter implements DomainConverter<AccountId, String> {

	@Override
	public String fromDomainToValue(AccountId domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccountId fromValueToDomain(String value) {
		return new ACCOUNT_ID(value);
	}

}
