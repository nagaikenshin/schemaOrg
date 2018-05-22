package org.kyojo.schemaOrg.m3n3.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalForceStatus.NOT_IN_FORCE;
import org.kyojo.schemaOrg.m3n3.pending.LegalForceStatus.NotInForce;

@ExternalDomain
public class NotInForceConverter implements DomainConverter<NotInForce, String> {

	@Override
	public String fromDomainToValue(NotInForce domain) {
		return domain.getNativeValue();
	}

	@Override
	public NotInForce fromValueToDomain(String value) {
		return new NOT_IN_FORCE(value);
	}

}
