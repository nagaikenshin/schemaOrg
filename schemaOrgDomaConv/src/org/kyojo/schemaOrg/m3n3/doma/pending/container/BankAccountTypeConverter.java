package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BANK_ACCOUNT_TYPE;
import org.kyojo.schemaOrg.m3n3.pending.Container.BankAccountType;

@ExternalDomain
public class BankAccountTypeConverter implements DomainConverter<BankAccountType, String> {

	@Override
	public String fromDomainToValue(BankAccountType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BankAccountType fromValueToDomain(String value) {
		return new BANK_ACCOUNT_TYPE(value);
	}

}
