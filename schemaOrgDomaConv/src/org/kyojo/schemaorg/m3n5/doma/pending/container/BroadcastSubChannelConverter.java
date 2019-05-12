package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.BROADCAST_SUB_CHANNEL;
import org.kyojo.schemaorg.m3n5.pending.Container.BroadcastSubChannel;

@ExternalDomain
public class BroadcastSubChannelConverter implements DomainConverter<BroadcastSubChannel, String> {

	@Override
	public String fromDomainToValue(BroadcastSubChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastSubChannel fromValueToDomain(String value) {
		return new BROADCAST_SUB_CHANNEL(value);
	}

}
