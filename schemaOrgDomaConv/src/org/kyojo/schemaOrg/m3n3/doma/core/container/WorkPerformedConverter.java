package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORK_PERFORMED;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkPerformed;

@ExternalDomain
public class WorkPerformedConverter implements DomainConverter<WorkPerformed, String> {

	@Override
	public String fromDomainToValue(WorkPerformed domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkPerformed fromValueToDomain(String value) {
		return new WORK_PERFORMED(value);
	}

}
