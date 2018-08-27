package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_CHANNEL;
import org.kyojo.schemaorg.m3n4.core.Clazz.ServiceChannel;

@ExternalDomain
public class ServiceChannelConverter implements DomainConverter<ServiceChannel, String> {

	@Override
	public String fromDomainToValue(ServiceChannel domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceChannel fromValueToDomain(String value) {
		return new SERVICE_CHANNEL(value);
	}

}
