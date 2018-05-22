package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BROADCAST_TIMEZONE;
import org.kyojo.schemaOrg.m3n3.core.Container.BroadcastTimezone;

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
