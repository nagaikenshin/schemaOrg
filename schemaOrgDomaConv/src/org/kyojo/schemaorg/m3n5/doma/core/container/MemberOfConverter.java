package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MEMBER_OF;
import org.kyojo.schemaorg.m3n5.core.Container.MemberOf;

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
