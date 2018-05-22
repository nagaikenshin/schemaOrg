package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUY_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BuyAction;

@ExternalDomain
public class BuyActionConverter implements DomainConverter<BuyAction, String> {

	@Override
	public String fromDomainToValue(BuyAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BuyAction fromValueToDomain(String value) {
		return new BUY_ACTION(value);
	}

}
