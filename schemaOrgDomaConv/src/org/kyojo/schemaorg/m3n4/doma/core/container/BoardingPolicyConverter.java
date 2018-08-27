package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOARDING_POLICY;
import org.kyojo.schemaorg.m3n4.core.Container.BoardingPolicy;

@ExternalDomain
public class BoardingPolicyConverter implements DomainConverter<BoardingPolicy, String> {

	@Override
	public String fromDomainToValue(BoardingPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public BoardingPolicy fromValueToDomain(String value) {
		return new BOARDING_POLICY(value);
	}

}
