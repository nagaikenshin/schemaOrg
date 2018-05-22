package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TEMPORAL_COVERAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.TemporalCoverage;

@ExternalDomain
public class TemporalCoverageConverter implements DomainConverter<TemporalCoverage, String> {

	@Override
	public String fromDomainToValue(TemporalCoverage domain) {
		return domain.getNativeValue();
	}

	@Override
	public TemporalCoverage fromValueToDomain(String value) {
		return new TEMPORAL_COVERAGE(value);
	}

}
