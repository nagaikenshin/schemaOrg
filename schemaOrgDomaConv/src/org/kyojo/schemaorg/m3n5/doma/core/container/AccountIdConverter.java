package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACCOUNT_ID;
import org.kyojo.schemaorg.m3n5.core.Container.AccountId;

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
