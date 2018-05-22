package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELEASED_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleasedEvent;

@ExternalDomain
public class ReleasedEventConverter implements DomainConverter<ReleasedEvent, String> {

	@Override
	public String fromDomainToValue(ReleasedEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReleasedEvent fromValueToDomain(String value) {
		return new RELEASED_EVENT(value);
	}

}
