package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_JURISDICTION;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationJurisdiction;

@ExternalDomain
public class LegislationJurisdictionConverter implements DomainConverter<LegislationJurisdiction, String> {

	@Override
	public String fromDomainToValue(LegislationJurisdiction domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationJurisdiction fromValueToDomain(String value) {
		return new LEGISLATION_JURISDICTION(value);
	}

}
