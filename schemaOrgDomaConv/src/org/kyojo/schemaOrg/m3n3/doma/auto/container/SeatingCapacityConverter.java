package org.kyojo.schemaorg.m3n3.doma.auto.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.auto.impl.SEATING_CAPACITY;
import org.kyojo.schemaorg.m3n3.auto.Container.SeatingCapacity;

@ExternalDomain
public class SeatingCapacityConverter implements DomainConverter<SeatingCapacity, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(SeatingCapacity domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatingCapacity fromValueToDomain(BigDecimal value) {
		return new SEATING_CAPACITY(value);
	}

}
