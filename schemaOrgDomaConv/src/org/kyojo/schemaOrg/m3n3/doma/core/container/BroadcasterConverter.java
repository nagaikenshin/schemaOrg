package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCASTER;
import org.kyojo.schemaOrg.m3n3.core.Container.Broadcaster;

@ExternalDomain
public class BroadcasterConverter implements DomainConverter<Broadcaster, String> {

	@Override
	public String fromDomainToValue(Broadcaster domain) {
		return domain.getNativeValue();
	}

	@Override
	public Broadcaster fromValueToDomain(String value) {
		return new BROADCASTER(value);
	}

}
