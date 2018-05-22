package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_CHANNEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastChannel;

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
