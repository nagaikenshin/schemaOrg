package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SERVICE_LOCATION;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceLocation;

@ExternalDomain
public class ServiceLocationConverter implements DomainConverter<ServiceLocation, String> {

	@Override
	public String fromDomainToValue(ServiceLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceLocation fromValueToDomain(String value) {
		return new SERVICE_LOCATION(value);
	}

}
