package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MEMBERSHIP_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.MembershipNumber;

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
