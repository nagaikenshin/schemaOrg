package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_CHANNEL_ID;
import org.kyojo.schemaorg.m3n5.core.Container.BroadcastChannelId;

@ExternalDomain
public class BroadcastChannelIdConverter implements DomainConverter<BroadcastChannelId, String> {

	@Override
	public String fromDomainToValue(BroadcastChannelId domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastChannelId fromValueToDomain(String value) {
		return new BROADCAST_CHANNEL_ID(value);
	}

}
