package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LEGISLATION_JURISDICTION;
import org.kyojo.schemaorg.m3n5.pending.Container.LegislationJurisdiction;

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
