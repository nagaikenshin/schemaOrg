package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACCOUNTING_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Clazz.AccountingService;

@ExternalDomain
public class AccountingServiceConverter implements DomainConverter<AccountingService, String> {

	@Override
	public String fromDomainToValue(AccountingService domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccountingService fromValueToDomain(String value) {
		return new ACCOUNTING_SERVICE(value);
	}

}
