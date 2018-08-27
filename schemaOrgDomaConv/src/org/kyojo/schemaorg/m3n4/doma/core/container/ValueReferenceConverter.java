package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VALUE_REFERENCE;
import org.kyojo.schemaorg.m3n4.core.Container.ValueReference;

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
