package org.kyojo.schemaOrg.m3n3.doma.core.eventStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.eventStatusType.EVENT_SCHEDULED;
import org.kyojo.schemaOrg.m3n3.core.EventStatusType.EventScheduled;

@ExternalDomain
public class EventScheduledConverter implements DomainConverter<EventScheduled, String> {

	@Override
	public String fromDomainToValue(EventScheduled domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventScheduled fromValueToDomain(String value) {
		return new EVENT_SCHEDULED(value);
	}

}
