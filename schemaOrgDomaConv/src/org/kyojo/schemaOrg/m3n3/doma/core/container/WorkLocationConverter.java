package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORK_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkLocation;

@ExternalDomain
public class WorkLocationConverter implements DomainConverter<WorkLocation, String> {

	@Override
	public String fromDomainToValue(WorkLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkLocation fromValueToDomain(String value) {
		return new WORK_LOCATION(value);
	}

}
