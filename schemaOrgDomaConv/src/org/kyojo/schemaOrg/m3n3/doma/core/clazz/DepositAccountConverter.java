package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPOSIT_ACCOUNT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DepositAccount;

@ExternalDomain
public class DepositAccountConverter implements DomainConverter<DepositAccount, String> {

	@Override
	public String fromDomainToValue(DepositAccount domain) {
		return domain.getNativeValue();
	}

	@Override
	public DepositAccount fromValueToDomain(String value) {
		return new DEPOSIT_ACCOUNT(value);
	}

}
