package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRICE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.PriceType;

@ExternalDomain
public class PriceTypeConverter implements DomainConverter<PriceType, String> {

	@Override
	public String fromDomainToValue(PriceType domain) {
		return domain.getNativeValue();
	}

	@Override
	public PriceType fromValueToDomain(String value) {
		return new PRICE_TYPE(value);
	}

}
