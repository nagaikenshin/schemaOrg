package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EVENT_VENUE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EventVenue;

@ExternalDomain
public class EventVenueConverter implements DomainConverter<EventVenue, String> {

	@Override
	public String fromDomainToValue(EventVenue domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventVenue fromValueToDomain(String value) {
		return new EVENT_VENUE(value);
	}

}
