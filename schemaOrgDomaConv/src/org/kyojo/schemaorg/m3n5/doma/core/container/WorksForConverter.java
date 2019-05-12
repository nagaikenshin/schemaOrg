package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WORKS_FOR;
import org.kyojo.schemaorg.m3n5.core.Container.WorksFor;

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
