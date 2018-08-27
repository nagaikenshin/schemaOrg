package org.kyojo.schemaorg.m3n4.doma.pending.legalForceStatus;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.legalForceStatus.NOT_IN_FORCE;
import org.kyojo.schemaorg.m3n4.pending.LegalForceStatus.NotInForce;

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