package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HAS_BROADCAST_CHANNEL;
import org.kyojo.schemaorg.m3n5.core.Container.HasBroadcastChannel;

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
