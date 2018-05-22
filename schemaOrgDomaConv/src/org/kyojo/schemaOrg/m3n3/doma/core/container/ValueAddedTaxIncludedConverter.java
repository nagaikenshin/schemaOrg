package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_ADDED_TAX_INCLUDED;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueAddedTaxIncluded;

@ExternalDomain
public class ValueAddedTaxIncludedConverter implements DomainConverter<ValueAddedTaxIncluded, Boolean> {

	@Override
	public Boolean fromDomainToValue(ValueAddedTaxIncluded domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueAddedTaxIncluded fromValueToDomain(Boolean value) {
		return new VALUE_ADDED_TAX_INCLUDED(value);
	}

}
