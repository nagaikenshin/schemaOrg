package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceType;

@ExternalDomain
public class ServiceTypeConverter implements DomainConverter<ServiceType, String> {

	@Override
	public String fromDomainToValue(ServiceType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceType fromValueToDomain(String value) {
		return new SERVICE_TYPE(value);
	}

}
