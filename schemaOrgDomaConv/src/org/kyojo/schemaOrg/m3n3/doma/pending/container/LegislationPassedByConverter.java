package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_PASSED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationPassedBy;

@ExternalDomain
public class LegislationPassedByConverter implements DomainConverter<LegislationPassedBy, String> {

	@Override
	public String fromDomainToValue(LegislationPassedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationPassedBy fromValueToDomain(String value) {
		return new LEGISLATION_PASSED_BY(value);
	}

}
