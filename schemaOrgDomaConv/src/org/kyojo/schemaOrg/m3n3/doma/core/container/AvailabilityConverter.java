package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABILITY;
import org.kyojo.schemaOrg.m3n3.core.Container.Availability;

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
