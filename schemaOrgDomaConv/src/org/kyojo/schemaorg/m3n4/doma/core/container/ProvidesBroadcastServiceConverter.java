package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROVIDES_BROADCAST_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Container.ProvidesBroadcastService;

@ExternalDomain
public class ProvidesBroadcastServiceConverter implements DomainConverter<ProvidesBroadcastService, String> {

	@Override
	public String fromDomainToValue(ProvidesBroadcastService domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProvidesBroadcastService fromValueToDomain(String value) {
		return new PROVIDES_BROADCAST_SERVICE(value);
	}

}
