package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRADE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TradeAction;

@ExternalDomain
public class TradeActionConverter implements DomainConverter<TradeAction, String> {

	@Override
	public String fromDomainToValue(TradeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TradeAction fromValueToDomain(String value) {
		return new TRADE_ACTION(value);
	}

}
