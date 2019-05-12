package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BANK_ACCOUNT;
import org.kyojo.schemaorg.m3n5.core.Clazz.BankAccount;

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
