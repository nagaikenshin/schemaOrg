package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE_PHONE;
import org.kyojo.schemaOrg.m3n3.core.Container.ServicePhone;

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
