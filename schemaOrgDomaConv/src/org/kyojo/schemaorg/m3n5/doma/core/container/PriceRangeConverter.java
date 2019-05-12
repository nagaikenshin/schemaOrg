package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRICE_RANGE;
import org.kyojo.schemaorg.m3n5.core.Container.PriceRange;

@ExternalDomain
public class PriceRangeConverter implements DomainConverter<PriceRange, String> {

	@Override
	public String fromDomainToValue(PriceRange domain) {
		return domain.getNativeValue();
	}

	@Override
	public PriceRange fromValueToDomain(String value) {
		return new PRICE_RANGE(value);
	}

}
