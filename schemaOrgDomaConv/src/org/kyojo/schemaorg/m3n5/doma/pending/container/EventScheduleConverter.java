package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.EVENT_SCHEDULE;
import org.kyojo.schemaorg.m3n5.pending.Container.EventSchedule;

@ExternalDomain
public class EventScheduleConverter implements DomainConverter<EventSchedule, String> {

	@Override
	public String fromDomainToValue(EventSchedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventSchedule fromValueToDomain(String value) {
		return new EVENT_SCHEDULE(value);
	}

}
