package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastEvent;

@ExternalDomain
public class BroadcastEventConverter implements DomainConverter<BroadcastEvent, String> {

	@Override
	public String fromDomainToValue(BroadcastEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastEvent fromValueToDomain(String value) {
		return new BROADCAST_EVENT(value);
	}

}
