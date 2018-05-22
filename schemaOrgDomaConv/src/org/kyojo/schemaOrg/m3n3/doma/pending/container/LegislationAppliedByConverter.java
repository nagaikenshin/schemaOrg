package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_APPLIED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationAppliedBy;

@ExternalDomain
public class LegislationAppliedByConverter implements DomainConverter<LegislationAppliedBy, String> {

	@Override
	public String fromDomainToValue(LegislationAppliedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationAppliedBy fromValueToDomain(String value) {
		return new LEGISLATION_APPLIED_BY(value);
	}

}
