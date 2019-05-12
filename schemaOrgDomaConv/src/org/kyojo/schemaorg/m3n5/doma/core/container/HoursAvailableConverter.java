package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HOURS_AVAILABLE;
import org.kyojo.schemaorg.m3n5.core.Container.HoursAvailable;

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
