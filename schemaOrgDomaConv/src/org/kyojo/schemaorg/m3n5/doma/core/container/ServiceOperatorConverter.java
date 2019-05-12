package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SERVICE_OPERATOR;
import org.kyojo.schemaorg.m3n5.core.Container.ServiceOperator;

@ExternalDomain
public class ServiceOperatorConverter implements DomainConverter<ServiceOperator, String> {

	@Override
	public String fromDomainToValue(ServiceOperator domain) {
		return domain.getNativeValue();
	}

	@Override
	public ServiceOperator fromValueToDomain(String value) {
		return new SERVICE_OPERATOR(value);
	}

}
