package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXAMPLE_OF_WORK;
import org.kyojo.schemaOrg.m3n3.core.Container.ExampleOfWork;

@ExternalDomain
public class ExampleOfWorkConverter implements DomainConverter<ExampleOfWork, String> {

	@Override
	public String fromDomainToValue(ExampleOfWork domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExampleOfWork fromValueToDomain(String value) {
		return new EXAMPLE_OF_WORK(value);
	}

}
