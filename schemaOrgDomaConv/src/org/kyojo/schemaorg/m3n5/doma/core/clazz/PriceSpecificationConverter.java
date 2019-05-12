package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PriceSpecification;

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
