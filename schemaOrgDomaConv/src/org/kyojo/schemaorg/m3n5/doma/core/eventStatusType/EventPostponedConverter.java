package org.kyojo.schemaorg.m3n5.doma.core.eventStatusType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.eventStatusType.EVENT_POSTPONED;
import org.kyojo.schemaorg.m3n5.core.EventStatusType.EventPostponed;

@ExternalDomain
public class EventPostponedConverter implements DomainConverter<EventPostponed, String> {

	@Override
	public String fromDomainToValue(EventPostponed domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventPostponed fromValueToDomain(String value) {
		return new EVENT_POSTPONED(value);
	}

}
