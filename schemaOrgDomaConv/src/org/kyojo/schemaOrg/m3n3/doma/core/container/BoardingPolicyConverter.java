package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOARDING_POLICY;
import org.kyojo.schemaOrg.m3n3.core.Container.BoardingPolicy;

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
