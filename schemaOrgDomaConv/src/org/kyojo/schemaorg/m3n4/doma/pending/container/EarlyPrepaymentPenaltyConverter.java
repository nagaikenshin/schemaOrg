package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.EARLY_PREPAYMENT_PENALTY;
import org.kyojo.schemaorg.m3n4.pending.Container.EarlyPrepaymentPenalty;

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
