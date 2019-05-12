package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IS_BASED_ON;
import org.kyojo.schemaorg.m3n5.core.Container.IsBasedOn;

@ExternalDomain
public class IsBasedOnConverter implements DomainConverter<IsBasedOn, String> {

	@Override
	public String fromDomainToValue(IsBasedOn domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsBasedOn fromValueToDomain(String value) {
		return new IS_BASED_ON(value);
	}

}