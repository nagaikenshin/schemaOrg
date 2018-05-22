package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BANK_ACCOUNT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BankAccount;

@ExternalDomain
public class BankAccountConverter implements DomainConverter<BankAccount, String> {

	@Override
	public String fromDomainToValue(BankAccount domain) {
		return domain.getNativeValue();
	}

	@Override
	public BankAccount fromValueToDomain(String value) {
		return new BANK_ACCOUNT(value);
	}

}
