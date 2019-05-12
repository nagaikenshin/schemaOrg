package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_CONSOLIDATES;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationConsolidates;

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
