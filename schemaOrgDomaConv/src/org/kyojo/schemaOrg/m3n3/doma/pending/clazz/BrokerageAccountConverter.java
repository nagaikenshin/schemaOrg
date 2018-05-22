package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.BROKERAGE_ACCOUNT;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.BrokerageAccount;

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
