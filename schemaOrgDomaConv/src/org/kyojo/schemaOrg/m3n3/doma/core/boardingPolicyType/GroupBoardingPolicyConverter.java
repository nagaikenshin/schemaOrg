package org.kyojo.schemaOrg.m3n3.doma.core.boardingPolicyType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.boardingPolicyType.GROUP_BOARDING_POLICY;
import org.kyojo.schemaOrg.m3n3.core.BoardingPolicyType.GroupBoardingPolicy;

@ExternalDomain
public class GroupBoardingPolicyConverter implements DomainConverter<GroupBoardingPolicy, String> {

	@Override
	public String fromDomainToValue(GroupBoardingPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public GroupBoardingPolicy fromValueToDomain(String value) {
		return new GROUP_BOARDING_POLICY(value);
	}

}
