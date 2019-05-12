package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.WORKLOAD;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Workload;

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
