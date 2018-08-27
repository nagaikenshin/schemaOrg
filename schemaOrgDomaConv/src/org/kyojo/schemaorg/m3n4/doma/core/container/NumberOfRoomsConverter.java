package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_ROOMS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfRooms;

@ExternalDomain
public class NumberOfRoomsConverter implements DomainConverter<NumberOfRooms, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfRooms domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfRooms fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_ROOMS(value);
	}

}
