package org.kyojo.schemaorg.m3n4.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.legalForceStatus.PARTIALLY_IN_FORCE;
import org.kyojo.schemaorg.m3n4.pending.LegalForceStatus.PartiallyInForce;

@ExternalDomain
public class PartiallyInForceConverter implements DomainConverter<PartiallyInForce, String> {

	@Override
	public String fromDomainToValue(PartiallyInForce domain) {
		return domain.getNativeValue();
	}

	@Override
	public PartiallyInForce fromValueToDomain(String value) {
		return new PARTIALLY_IN_FORCE(value);
	}

}
