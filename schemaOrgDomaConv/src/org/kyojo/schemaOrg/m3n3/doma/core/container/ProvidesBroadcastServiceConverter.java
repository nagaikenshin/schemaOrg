package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROVIDES_BROADCAST_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Container.ProvidesBroadcastService;

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
