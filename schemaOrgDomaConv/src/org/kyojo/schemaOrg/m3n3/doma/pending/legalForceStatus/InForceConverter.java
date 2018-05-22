package org.kyojo.schemaOrg.m3n3.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalForceStatus.IN_FORCE;
import org.kyojo.schemaOrg.m3n3.pending.LegalForceStatus.InForce;

@ExternalDomain
public class InForceConverter implements DomainConverter<InForce, String> {

	@Override
	public String fromDomainToValue(InForce domain) {
		return domain.getNativeValue();
	}

	@Override
	public InForce fromValueToDomain(String value) {
		return new IN_FORCE(value);
	}

}
