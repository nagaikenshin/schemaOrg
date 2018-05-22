package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.ValueName;

@ExternalDomain
public class ValueNameConverter implements DomainConverter<ValueName, String> {

	@Override
	public String fromDomainToValue(ValueName domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValueName fromValueToDomain(String value) {
		return new VALUE_NAME(value);
	}

}
