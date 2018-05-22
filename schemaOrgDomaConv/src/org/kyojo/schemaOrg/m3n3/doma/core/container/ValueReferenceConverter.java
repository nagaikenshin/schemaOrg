package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_REFERENCE;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueReference;

@ExternalDomain
public class ValueReferenceConverter implements DomainConverter<ValueReference, String> {

	@Override
	public String fromDomainToValue(ValueReference domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueReference fromValueToDomain(String value) {
		return new VALUE_REFERENCE(value);
	}

}
