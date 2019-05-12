package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BROADCAST_CHANNEL;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastChannel;

@ExternalDomain
public class BroadcastChannelConverter implements DomainConverter<BroadcastChannel, String> {

	@Override
	public String fromDomainToValue(BroadcastChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastChannel fromValueToDomain(String value) {
		return new BROADCAST_CHANNEL(value);
	}

}
