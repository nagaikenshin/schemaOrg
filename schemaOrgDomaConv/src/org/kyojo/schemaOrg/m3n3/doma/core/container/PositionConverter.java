package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POSITION;
import org.kyojo.schemaOrg.m3n3.core.Container.Position;

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
