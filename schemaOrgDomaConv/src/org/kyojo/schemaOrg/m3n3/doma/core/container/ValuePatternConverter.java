package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VALUE_PATTERN;
import org.kyojo.schemaOrg.m3n3.core.Container.ValuePattern;

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
