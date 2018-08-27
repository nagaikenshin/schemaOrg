package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.HAS_BROADCAST_CHANNEL;
import org.kyojo.schemaorg.m3n4.pending.Container.HasBroadcastChannel;

@ExternalDomain
public class HasBroadcastChannelConverter implements DomainConverter<HasBroadcastChannel, String> {

	@Override
	public String fromDomainToValue(HasBroadcastChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasBroadcastChannel fromValueToDomain(String value) {
		return new HAS_BROADCAST_CHANNEL(value);
	}

}