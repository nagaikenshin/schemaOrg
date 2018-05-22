package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.WORKLOAD;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Workload;

@ExternalDomain
public class WorkloadConverter implements DomainConverter<Workload, String> {

	@Override
	public String fromDomainToValue(Workload domain) {
		return domain.getNativeValue();
	}

	@Override
	public Workload fromValueToDomain(String value) {
		return new WORKLOAD(value);
	}

}
