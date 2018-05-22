package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_CONSOLIDATED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationConsolidatedBy;

@ExternalDomain
public class LegislationConsolidatedByConverter implements DomainConverter<LegislationConsolidatedBy, String> {

	@Override
	public String fromDomainToValue(LegislationConsolidatedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationConsolidatedBy fromValueToDomain(String value) {
		return new LEGISLATION_CONSOLIDATED_BY(value);
	}

}
