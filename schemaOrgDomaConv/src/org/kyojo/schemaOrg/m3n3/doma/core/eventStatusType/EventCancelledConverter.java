package org.kyojo.schemaOrg.m3n3.doma.core.eventStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.eventStatusType.EVENT_CANCELLED;
import org.kyojo.schemaOrg.m3n3.core.EventStatusType.EventCancelled;

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
