package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORK_EXAMPLE;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkExample;

@ExternalDomain
public class WorkExampleConverter implements DomainConverter<WorkExample, String> {

	@Override
	public String fromDomainToValue(WorkExample domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkExample fromValueToDomain(String value) {
		return new WORK_EXAMPLE(value);
	}

}
