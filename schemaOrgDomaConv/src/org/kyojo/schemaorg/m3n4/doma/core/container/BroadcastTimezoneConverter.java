package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BROADCAST_TIMEZONE;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastTimezone;

@ExternalDomain
public class BroadcastTimezoneConverter implements DomainConverter<BroadcastTimezone, String> {

	@Override
	public String fromDomainToValue(BroadcastTimezone domain) {
		return domain.getNativeValue();
	}

	@Override
	public BroadcastTimezone fromValueToDomain(String value) {
		return new BROADCAST_TIMEZONE(value);
	}

}
