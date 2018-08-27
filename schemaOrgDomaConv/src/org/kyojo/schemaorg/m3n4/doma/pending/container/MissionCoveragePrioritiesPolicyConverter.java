package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.MISSION_COVERAGE_PRIORITIES_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.MissionCoveragePrioritiesPolicy;

@ExternalDomain
public class MissionCoveragePrioritiesPolicyConverter implements DomainConverter<MissionCoveragePrioritiesPolicy, String> {

	@Override
	public String fromDomainToValue(MissionCoveragePrioritiesPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public MissionCoveragePrioritiesPolicy fromValueToDomain(String value) {
		return new MISSION_COVERAGE_PRIORITIES_POLICY(value);
	}

}
