package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRICE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification;

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
