package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EVENT_STATUS_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.EventStatusType;

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
