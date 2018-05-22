package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Service;

@ExternalDomain
public class ServiceConverter implements DomainConverter<Service, String> {

	@Override
	public String fromDomainToValue(Service domain) {
		return domain.getNativeValue();
	}

	@Override
	public Service fromValueToDomain(String value) {
		return new SERVICE(value);
	}

}
