package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_LEGAL_FORCE;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationLegalForce;

@ExternalDomain
public class LegislationLegalForceConverter implements DomainConverter<LegislationLegalForce, String> {

	@Override
	public String fromDomainToValue(LegislationLegalForce domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationLegalForce fromValueToDomain(String value) {
		return new LEGISLATION_LEGAL_FORCE(value);
	}

}
