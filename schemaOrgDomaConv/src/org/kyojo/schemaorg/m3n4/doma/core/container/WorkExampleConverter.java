package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WORK_EXAMPLE;
import org.kyojo.schemaorg.m3n4.core.Container.WorkExample;

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
