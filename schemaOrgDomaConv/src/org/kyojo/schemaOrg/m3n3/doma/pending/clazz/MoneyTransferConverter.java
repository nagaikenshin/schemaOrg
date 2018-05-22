package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.MONEY_TRANSFER;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.MoneyTransfer;

@ExternalDomain
public class MoneyTransferConverter implements DomainConverter<MoneyTransfer, String> {

	@Override
	public String fromDomainToValue(MoneyTransfer domain) {
		return domain.getNativeValue();
	}

	@Override
	public MoneyTransfer fromValueToDomain(String value) {
		return new MONEY_TRANSFER(value);
	}

}
