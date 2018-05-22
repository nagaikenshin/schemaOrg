package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_CHANNEL;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableChannel;

@ExternalDomain
public class AvailableChannelConverter implements DomainConverter<AvailableChannel, String> {

	@Override
	public String fromDomainToValue(AvailableChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableChannel fromValueToDomain(String value) {
		return new AVAILABLE_CHANNEL(value);
	}

}
