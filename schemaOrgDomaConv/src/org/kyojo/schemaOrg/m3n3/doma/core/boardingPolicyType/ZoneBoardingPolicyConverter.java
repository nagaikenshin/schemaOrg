package org.kyojo.schemaOrg.m3n3.doma.core.boardingPolicyType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.boardingPolicyType.ZONE_BOARDING_POLICY;
import org.kyojo.schemaOrg.m3n3.core.BoardingPolicyType.ZoneBoardingPolicy;

@ExternalDomain
public class ZoneBoardingPolicyConverter implements DomainConverter<ZoneBoardingPolicy, String> {

	@Override
	public String fromDomainToValue(ZoneBoardingPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public ZoneBoardingPolicy fromValueToDomain(String value) {
		return new ZONE_BOARDING_POLICY(value);
	}

}
