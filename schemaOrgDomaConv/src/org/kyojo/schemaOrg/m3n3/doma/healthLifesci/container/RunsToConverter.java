package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RUNS_TO;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RunsTo;

@ExternalDomain
public class RunsToConverter implements DomainConverter<RunsTo, String> {

	@Override
	public String fromDomainToValue(RunsTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public RunsTo fromValueToDomain(String value) {
		return new RUNS_TO(value);
	}

}
