package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COMPOUND_PRICE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CompoundPriceSpecification;

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
