package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOURS_AVAILABLE;
import org.kyojo.schemaOrg.m3n3.core.Container.HoursAvailable;

@ExternalDomain
public class HoursAvailableConverter implements DomainConverter<HoursAvailable, String> {

	@Override
	public String fromDomainToValue(HoursAvailable domain) {
		return domain.getNativeValue();
	}

	@Override
	public HoursAvailable fromValueToDomain(String value) {
		return new HOURS_AVAILABLE(value);
	}

}
