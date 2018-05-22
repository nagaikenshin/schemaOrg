package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EVENT_SCHEDULE;
import org.kyojo.schemaOrg.m3n3.pending.Container.EventSchedule;

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
