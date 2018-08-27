package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_PHONE;
import org.kyojo.schemaorg.m3n4.core.Container.ServicePhone;

@ExternalDomain
public class ServicePhoneConverter implements DomainConverter<ServicePhone, String> {

	@Override
	public String fromDomainToValue(ServicePhone domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServicePhone fromValueToDomain(String value) {
		return new SERVICE_PHONE(value);
	}

}
