package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.BroadcastService;

@ExternalDomain
public class BroadcastServiceConverter implements DomainConverter<BroadcastService, String> {

	@Override
	public String fromDomainToValue(BroadcastService domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastService fromValueToDomain(String value) {
		return new BROADCAST_SERVICE(value);
	}

}
