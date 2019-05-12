package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VALUE_PATTERN;
import org.kyojo.schemaorg.m3n5.core.Container.ValuePattern;

@ExternalDomain
public class ValuePatternConverter implements DomainConverter<ValuePattern, String> {

	@Override
	public String fromDomainToValue(ValuePattern domain) {
		return domain.getNativeValue();
	}

	@Override
	public ValuePattern fromValueToDomain(String value) {
		return new VALUE_PATTERN(value);
	}

}
