package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_BASED_ON;
import org.kyojo.schemaOrg.m3n3.core.Container.IsBasedOn;

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
