package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_AT_OR_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableAtOrFrom;

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
