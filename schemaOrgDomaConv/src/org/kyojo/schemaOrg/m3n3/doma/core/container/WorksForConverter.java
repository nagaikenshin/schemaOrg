package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WORKS_FOR;
import org.kyojo.schemaOrg.m3n3.core.Container.WorksFor;

@ExternalDomain
public class WorksForConverter implements DomainConverter<WorksFor, String> {

	@Override
	public String fromDomainToValue(WorksFor domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorksFor fromValueToDomain(String value) {
		return new WORKS_FOR(value);
	}

}
