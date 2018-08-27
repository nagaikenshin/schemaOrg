package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SERVICE_OUTPUT;
import org.kyojo.schemaorg.m3n4.core.Container.ServiceOutput;

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
