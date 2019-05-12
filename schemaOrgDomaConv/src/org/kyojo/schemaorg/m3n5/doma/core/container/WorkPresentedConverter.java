package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WORK_PRESENTED;
import org.kyojo.schemaorg.m3n5.core.Container.WorkPresented;

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
