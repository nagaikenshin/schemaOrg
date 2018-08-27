package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BOARDING_POLICY_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.BoardingPolicyType;

@ExternalDomain
public class BoardingPolicyTypeConverter implements DomainConverter<BoardingPolicyType, String> {

	@Override
	public String fromDomainToValue(BoardingPolicyType domain) {
		return domain.getNativeValue();
	}

	@Override
	public BoardingPolicyType fromValueToDomain(String value) {
		return new BOARDING_POLICY_TYPE(value);
	}

}