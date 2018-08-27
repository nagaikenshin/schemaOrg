package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MEMBER_OF;
import org.kyojo.schemaorg.m3n4.core.Container.MemberOf;

@ExternalDomain
public class MemberOfConverter implements DomainConverter<MemberOf, String> {

	@Override
	public String fromDomainToValue(MemberOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public MemberOf fromValueToDomain(String value) {
		return new MEMBER_OF(value);
	}

}
