package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BUY_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BuyAction;

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
