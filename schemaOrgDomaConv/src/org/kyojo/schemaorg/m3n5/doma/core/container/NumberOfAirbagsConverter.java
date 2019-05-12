package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_AIRBAGS;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfAirbags;

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
