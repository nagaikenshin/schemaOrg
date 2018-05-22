package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.util.Date;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_FROM;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableFrom;

@ExternalDomain
public class AvailableFromConverter implements DomainConverter<AvailableFrom, Date> {

	@Override
	public Date fromDomainToValue(AvailableFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableFrom fromValueToDomain(Date value) {
		return new AVAILABLE_FROM(value);
	}

}
