package org.kyojo.schemaorg.m3n5.doma.core.eventStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.eventStatusType.EVENT_CANCELLED;
import org.kyojo.schemaorg.m3n5.core.EventStatusType.EventCancelled;

@ExternalDomain
public class EventCancelledConverter implements DomainConverter<EventCancelled, String> {

	@Override
	public String fromDomainToValue(EventCancelled domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventCancelled fromValueToDomain(String value) {
		return new EVENT_CANCELLED(value);
	}

}
