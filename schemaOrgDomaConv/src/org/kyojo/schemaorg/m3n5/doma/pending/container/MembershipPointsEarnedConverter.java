package org.kyojo.schemaorg.m3n5.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.MEMBERSHIP_POINTS_EARNED;
import org.kyojo.schemaorg.m3n5.pending.Container.MembershipPointsEarned;

@ExternalDomain
public class MembershipPointsEarnedConverter implements DomainConverter<MembershipPointsEarned, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MembershipPointsEarned domain) {
		return domain.getNativeValue();
	}

	@Override
	public MembershipPointsEarned fromValueToDomain(BigDecimal value) {
		return new MEMBERSHIP_POINTS_EARNED(value);
	}

}
