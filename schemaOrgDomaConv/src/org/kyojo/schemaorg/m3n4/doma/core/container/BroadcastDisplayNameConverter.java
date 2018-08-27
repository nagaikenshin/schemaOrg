package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_DISPLAY_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastDisplayName;

@ExternalDomain
public class BroadcastDisplayNameConverter implements DomainConverter<BroadcastDisplayName, String> {

	@Override
	public String fromDomainToValue(BroadcastDisplayName domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastDisplayName fromValueToDomain(String value) {
		return new BROADCAST_DISPLAY_NAME(value);
	}

}
