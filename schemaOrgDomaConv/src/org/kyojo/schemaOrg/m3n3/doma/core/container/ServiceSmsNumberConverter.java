package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE_SMS_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.ServiceSmsNumber;

@ExternalDomain
public class ServiceSmsNumberConverter implements DomainConverter<ServiceSmsNumber, String> {

	@Override
	public String fromDomainToValue(ServiceSmsNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceSmsNumber fromValueToDomain(String value) {
		return new SERVICE_SMS_NUMBER(value);
	}

}
