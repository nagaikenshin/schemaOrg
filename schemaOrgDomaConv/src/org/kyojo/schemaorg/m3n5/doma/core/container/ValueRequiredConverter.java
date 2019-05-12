package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VALUE_REQUIRED;
import org.kyojo.schemaorg.m3n5.core.Container.ValueRequired;

@ExternalDomain
public class ValueRequiredConverter implements DomainConverter<ValueRequired, Boolean> {

	@Override
	public Boolean fromDomainToValue(ValueRequired domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueRequired fromValueToDomain(Boolean value) {
		return new VALUE_REQUIRED(value);
	}

}
