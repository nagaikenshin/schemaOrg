package org.kyojo.schemaorg.m3n3.doma.core.eventStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.core.eventStatusType.EVENT_RESCHEDULED;
import org.kyojo.schemaorg.m3n3.core.EventStatusType.EventRescheduled;

@ExternalDomain
public class EventRescheduledConverter implements DomainConverter<EventRescheduled, String> {

	@Override
	public String fromDomainToValue(EventRescheduled domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventRescheduled fromValueToDomain(String value) {
		return new EVENT_RESCHEDULED(value);
	}

}
