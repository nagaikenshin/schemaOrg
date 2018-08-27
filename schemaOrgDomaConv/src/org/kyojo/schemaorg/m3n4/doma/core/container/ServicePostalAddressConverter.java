package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_POSTAL_ADDRESS;
import org.kyojo.schemaorg.m3n4.core.Container.ServicePostalAddress;

@ExternalDomain
public class ServicePostalAddressConverter implements DomainConverter<ServicePostalAddress, String> {

	@Override
	public String fromDomainToValue(ServicePostalAddress domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServicePostalAddress fromValueToDomain(String value) {
		return new SERVICE_POSTAL_ADDRESS(value);
	}

}
