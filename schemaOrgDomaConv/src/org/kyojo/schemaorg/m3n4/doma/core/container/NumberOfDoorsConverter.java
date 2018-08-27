package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_DOORS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfDoors;

@ExternalDomain
public class NumberOfDoorsConverter implements DomainConverter<NumberOfDoors, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfDoors domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfDoors fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_DOORS(value);
	}

}