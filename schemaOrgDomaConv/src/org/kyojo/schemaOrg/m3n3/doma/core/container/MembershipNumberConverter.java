package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEMBERSHIP_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.MembershipNumber;

@ExternalDomain
public class MembershipNumberConverter implements DomainConverter<MembershipNumber, String> {

	@Override
	public String fromDomainToValue(MembershipNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public MembershipNumber fromValueToDomain(String value) {
		return new MEMBERSHIP_NUMBER(value);
	}

}
