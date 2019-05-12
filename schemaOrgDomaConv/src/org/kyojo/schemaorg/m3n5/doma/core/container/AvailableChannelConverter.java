package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_CHANNEL;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableChannel;

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
