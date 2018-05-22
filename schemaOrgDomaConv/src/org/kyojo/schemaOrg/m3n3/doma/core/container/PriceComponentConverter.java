package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRICE_COMPONENT;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceComponent;

@ExternalDomain
public class PriceComponentConverter implements DomainConverter<PriceComponent, String> {

	@Override
	public String fromDomainToValue(PriceComponent domain) {
		return domain.getNativeValue();
	}

	@Override
	public PriceComponent fromValueToDomain(String value) {
		return new PRICE_COMPONENT(value);
	}

}
