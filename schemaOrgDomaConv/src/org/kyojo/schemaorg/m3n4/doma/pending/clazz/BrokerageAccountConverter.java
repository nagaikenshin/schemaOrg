package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.BROKERAGE_ACCOUNT;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BrokerageAccount;

@ExternalDomain
public class BrokerageAccountConverter implements DomainConverter<BrokerageAccount, String> {

	@Override
	public String fromDomainToValue(BrokerageAccount domain) {
		return domain.getNativeValue();
	}

	@Override
	public BrokerageAccount fromValueToDomain(String value) {
		return new BROKERAGE_ACCOUNT(value);
	}

}