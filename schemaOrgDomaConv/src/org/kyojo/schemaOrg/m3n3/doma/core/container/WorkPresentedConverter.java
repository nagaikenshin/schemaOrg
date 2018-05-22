package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORK_PRESENTED;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkPresented;

@ExternalDomain
public class WorkPresentedConverter implements DomainConverter<WorkPresented, String> {

	@Override
	public String fromDomainToValue(WorkPresented domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkPresented fromValueToDomain(String value) {
		return new WORK_PRESENTED(value);
	}

}
