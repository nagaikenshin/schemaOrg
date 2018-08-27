package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EVENT_STATUS_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.EventStatusType;

@ExternalDomain
public class EventStatusTypeConverter implements DomainConverter<EventStatusType, String> {

	@Override
	public String fromDomainToValue(EventStatusType domain) {
		return domain.getNativeValue();
	}

	@Override
	public EventStatusType fromValueToDomain(String value) {
		return new EVENT_STATUS_TYPE(value);
	}

}