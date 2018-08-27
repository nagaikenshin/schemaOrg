package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRICE_COMPONENT;
import org.kyojo.schemaorg.m3n4.core.Container.PriceComponent;

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
