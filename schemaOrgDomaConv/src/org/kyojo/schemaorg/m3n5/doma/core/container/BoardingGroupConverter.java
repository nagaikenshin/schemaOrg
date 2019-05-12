package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BOARDING_GROUP;
import org.kyojo.schemaorg.m3n5.core.Container.BoardingGroup;

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
