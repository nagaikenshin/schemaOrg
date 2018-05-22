package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SERVICE_OUTPUT;
import org.kyojo.schemaOrg.m3n3.core.Container.ServiceOutput;

@ExternalDomain
public class ServiceOutputConverter implements DomainConverter<ServiceOutput, String> {

	@Override
	public String fromDomainToValue(ServiceOutput domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceOutput fromValueToDomain(String value) {
		return new SERVICE_OUTPUT(value);
	}

}
