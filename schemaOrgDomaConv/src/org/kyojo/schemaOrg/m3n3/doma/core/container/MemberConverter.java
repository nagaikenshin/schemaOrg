package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.Member;

@ExternalDomain
public class MemberConverter implements DomainConverter<Member, String> {

	@Override
	public String fromDomainToValue(Member domain) {
		return domain.getNativeValue();
	}

	@Override
	public Member fromValueToDomain(String value) {
		return new MEMBER(value);
	}

}
