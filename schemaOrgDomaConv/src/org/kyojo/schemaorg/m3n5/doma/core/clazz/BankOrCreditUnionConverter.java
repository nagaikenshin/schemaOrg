package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BANK_OR_CREDIT_UNION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BankOrCreditUnion;

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
