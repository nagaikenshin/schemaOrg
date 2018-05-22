package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BOARDING_GROUP;
import org.kyojo.schemaOrg.m3n3.core.Container.BoardingGroup;

@ExternalDomain
public class BoardingGroupConverter implements DomainConverter<BoardingGroup, String> {

	@Override
	public String fromDomainToValue(BoardingGroup domain) {
		return domain.getNativeValue();
	}

	@Override
	public BoardingGroup fromValueToDomain(String value) {
		return new BOARDING_GROUP(value);
	}

}
