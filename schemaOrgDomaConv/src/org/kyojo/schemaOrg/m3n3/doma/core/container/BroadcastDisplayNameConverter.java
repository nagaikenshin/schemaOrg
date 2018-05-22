package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_DISPLAY_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.BroadcastDisplayName;

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
