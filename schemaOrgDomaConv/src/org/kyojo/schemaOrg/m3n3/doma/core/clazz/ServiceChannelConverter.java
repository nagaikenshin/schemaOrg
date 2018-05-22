package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE_CHANNEL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ServiceChannel;

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
