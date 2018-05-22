package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IN_BROADCAST_LINEUP;
import org.kyojo.schemaOrg.m3n3.core.Container.InBroadcastLineup;

@ExternalDomain
public class InBroadcastLineupConverter implements DomainConverter<InBroadcastLineup, String> {

	@Override
	public String fromDomainToValue(InBroadcastLineup domain) {
		return domain.getNativeValue();
	}

	@Override
	public InBroadcastLineup fromValueToDomain(String value) {
		return new IN_BROADCAST_LINEUP(value);
	}

}
