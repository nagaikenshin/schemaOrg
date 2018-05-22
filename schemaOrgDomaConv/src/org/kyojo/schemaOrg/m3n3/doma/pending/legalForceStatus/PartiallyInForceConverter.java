package org.kyojo.schemaOrg.m3n3.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalForceStatus.PARTIALLY_IN_FORCE;
import org.kyojo.schemaOrg.m3n3.pending.LegalForceStatus.PartiallyInForce;

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
