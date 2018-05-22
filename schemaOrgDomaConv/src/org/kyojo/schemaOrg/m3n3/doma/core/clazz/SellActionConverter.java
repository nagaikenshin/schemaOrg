package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SELL_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SellAction;

@ExternalDomain
public class SellActionConverter implements DomainConverter<SellAction, String> {

	@Override
	public String fromDomainToValue(SellAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public SellAction fromValueToDomain(String value) {
		return new SELL_ACTION(value);
	}

}
