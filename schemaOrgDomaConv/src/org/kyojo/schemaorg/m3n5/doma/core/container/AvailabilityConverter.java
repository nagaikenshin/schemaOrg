package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABILITY;
import org.kyojo.schemaorg.m3n5.core.Container.Availability;

@ExternalDomain
public class AvailabilityConverter implements DomainConverter<Availability, String> {

	@Override
	public String fromDomainToValue(Availability domain) {
		return domain.getNativeValue();
	}

	@Override
	public Availability fromValueToDomain(String value) {
		return new AVAILABILITY(value);
	}

}
