package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_AIRBAGS;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAirbags;

@ExternalDomain
public class NumberOfAirbagsConverter implements DomainConverter<NumberOfAirbags, String> {

	@Override
	public String fromDomainToValue(NumberOfAirbags domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfAirbags fromValueToDomain(String value) {
		return new NUMBER_OF_AIRBAGS(value);
	}

}
