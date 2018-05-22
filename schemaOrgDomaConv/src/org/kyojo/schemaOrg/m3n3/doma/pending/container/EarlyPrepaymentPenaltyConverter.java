package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EARLY_PREPAYMENT_PENALTY;
import org.kyojo.schemaOrg.m3n3.pending.Container.EarlyPrepaymentPenalty;

@ExternalDomain
public class EarlyPrepaymentPenaltyConverter implements DomainConverter<EarlyPrepaymentPenalty, String> {

	@Override
	public String fromDomainToValue(EarlyPrepaymentPenalty domain) {
		return domain.getNativeValue();
	}

	@Override
	public EarlyPrepaymentPenalty fromValueToDomain(String value) {
		return new EARLY_PREPAYMENT_PENALTY(value);
	}

}
