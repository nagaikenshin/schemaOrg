package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EVENT_STATUS;
import org.kyojo.schemaorg.m3n4.core.Container.EventStatus;

@ExternalDomain
public class EventStatusConverter implements DomainConverter<EventStatus, String> {

	@Override
	public String fromDomainToValue(EventStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventStatus fromValueToDomain(String value) {
		return new EVENT_STATUS(value);
	}

}
