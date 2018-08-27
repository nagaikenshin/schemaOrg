package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WORK_PERFORMED;
import org.kyojo.schemaorg.m3n4.core.Container.WorkPerformed;

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