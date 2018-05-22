package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EVENT_STATUS;
import org.kyojo.schemaOrg.m3n3.core.Container.EventStatus;

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
