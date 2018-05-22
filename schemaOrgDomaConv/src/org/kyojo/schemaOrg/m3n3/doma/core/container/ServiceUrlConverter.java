package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.ServiceUrl;

@ExternalDomain
public class ServiceUrlConverter implements DomainConverter<ServiceUrl, String> {

	@Override
	public String fromDomainToValue(ServiceUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceUrl fromValueToDomain(String value) {
		return new SERVICE_URL(value);
	}

}
