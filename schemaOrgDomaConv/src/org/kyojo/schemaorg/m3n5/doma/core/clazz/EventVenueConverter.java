package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EVENT_VENUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.EventVenue;

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
