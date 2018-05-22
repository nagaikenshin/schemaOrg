package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Event;

@ExternalDomain
public class EventConverter implements DomainConverter<Event, String> {

	@Override
	public String fromDomainToValue(Event domain) {
		return domain.getNativeValue();
	}

	@Override
	public Event fromValueToDomain(String value) {
		return new EVENT(value);
	}

}
