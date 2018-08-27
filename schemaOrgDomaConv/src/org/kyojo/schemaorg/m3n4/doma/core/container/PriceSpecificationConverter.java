package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Container.PriceSpecification;

@ExternalDomain
public class PriceSpecificationConverter implements DomainConverter<PriceSpecification, String> {

	@Override
	public String fromDomainToValue(PriceSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public PriceSpecification fromValueToDomain(String value) {
		return new PRICE_SPECIFICATION(value);
	}

}
