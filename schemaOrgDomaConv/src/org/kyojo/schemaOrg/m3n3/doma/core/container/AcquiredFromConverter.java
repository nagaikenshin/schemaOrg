package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACQUIRED_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.AcquiredFrom;

@ExternalDomain
public class AcquiredFromConverter implements DomainConverter<AcquiredFrom, String> {

	@Override
	public String fromDomainToValue(AcquiredFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcquiredFrom fromValueToDomain(String value) {
		return new ACQUIRED_FROM(value);
	}

}
