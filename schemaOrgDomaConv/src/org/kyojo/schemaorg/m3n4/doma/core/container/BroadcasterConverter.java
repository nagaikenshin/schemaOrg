package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCASTER;
import org.kyojo.schemaorg.m3n4.core.Container.Broadcaster;

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
