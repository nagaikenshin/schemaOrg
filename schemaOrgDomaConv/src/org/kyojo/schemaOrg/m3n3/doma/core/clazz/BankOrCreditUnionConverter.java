package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BANK_OR_CREDIT_UNION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BankOrCreditUnion;

@ExternalDomain
public class BankOrCreditUnionConverter implements DomainConverter<BankOrCreditUnion, String> {

	@Override
	public String fromDomainToValue(BankOrCreditUnion domain) {
		return domain.getNativeValue();
	}

	@Override
	public BankOrCreditUnion fromValueToDomain(String value) {
		return new BANK_OR_CREDIT_UNION(value);
	}

}
