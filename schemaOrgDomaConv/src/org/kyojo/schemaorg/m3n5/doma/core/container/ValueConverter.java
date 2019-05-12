package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.Value;

@ExternalDomain
public class ValueConverter implements DomainConverter<Value, String> {

	@Override
	public String fromDomainToValue(Value domain) {
		return domain.getNativeValue();
	}

	@Override
	public Value fromValueToDomain(String value) {
		return new VALUE(value);
	}

}
