package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RUNS_TO;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RunsTo;

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
