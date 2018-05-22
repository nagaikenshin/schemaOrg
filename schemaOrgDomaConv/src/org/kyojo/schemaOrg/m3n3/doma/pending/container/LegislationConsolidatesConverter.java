package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_CONSOLIDATES;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationConsolidates;

@ExternalDomain
public class LegislationConsolidatesConverter implements DomainConverter<LegislationConsolidates, String> {

	@Override
	public String fromDomainToValue(LegislationConsolidates domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationConsolidates fromValueToDomain(String value) {
		return new LEGISLATION_CONSOLIDATES(value);
	}

}
