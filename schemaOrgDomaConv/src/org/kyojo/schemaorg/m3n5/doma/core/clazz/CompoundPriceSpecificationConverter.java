package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COMPOUND_PRICE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CompoundPriceSpecification;

@ExternalDomain
public class CompoundPriceSpecificationConverter implements DomainConverter<CompoundPriceSpecification, String> {

	@Override
	public String fromDomainToValue(CompoundPriceSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public CompoundPriceSpecification fromValueToDomain(String value) {
		return new COMPOUND_PRICE_SPECIFICATION(value);
	}

}
