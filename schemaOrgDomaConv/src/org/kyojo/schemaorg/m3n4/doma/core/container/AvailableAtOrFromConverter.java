package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AVAILABLE_AT_OR_FROM;
import org.kyojo.schemaorg.m3n4.core.Container.AvailableAtOrFrom;

@ExternalDomain
public class AvailableAtOrFromConverter implements DomainConverter<AvailableAtOrFrom, String> {

	@Override
	public String fromDomainToValue(AvailableAtOrFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableAtOrFrom fromValueToDomain(String value) {
		return new AVAILABLE_AT_OR_FROM(value);
	}

}
