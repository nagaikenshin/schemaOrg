package org.kyojo.schemaorg.m3n5.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.legalForceStatus.IN_FORCE;
import org.kyojo.schemaorg.m3n5.pending.LegalForceStatus.InForce;

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