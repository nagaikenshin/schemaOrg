package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.POSITION;
import org.kyojo.schemaorg.m3n4.core.Container.Position;

@ExternalDomain
public class PositionConverter implements DomainConverter<Position, String> {

	@Override
	public String fromDomainToValue(Position domain) {
		return domain.getNativeValue();
	}

	@Override
	public Position fromValueToDomain(String value) {
		return new POSITION(value);
	}

}
