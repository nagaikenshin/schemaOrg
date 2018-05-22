package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_OF_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Container.BroadcastOfEvent;

@ExternalDomain
public class BroadcastOfEventConverter implements DomainConverter<BroadcastOfEvent, String> {

	@Override
	public String fromDomainToValue(BroadcastOfEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastOfEvent fromValueToDomain(String value) {
		return new BROADCAST_OF_EVENT(value);
	}

}
