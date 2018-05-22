package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UNIT_PRICE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.UnitPriceSpecification;

@ExternalDomain
public class UnitPriceSpecificationConverter implements DomainConverter<UnitPriceSpecification, String> {

	@Override
	public String fromDomainToValue(UnitPriceSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnitPriceSpecification fromValueToDomain(String value) {
		return new UNIT_PRICE_SPECIFICATION(value);
	}

}
