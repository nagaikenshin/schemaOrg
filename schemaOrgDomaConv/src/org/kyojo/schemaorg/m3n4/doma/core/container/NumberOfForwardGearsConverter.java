package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.NUMBER_OF_FORWARD_GEARS;
import org.kyojo.schemaorg.m3n4.core.Container.NumberOfForwardGears;

@ExternalDomain
public class NumberOfForwardGearsConverter implements DomainConverter<NumberOfForwardGears, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfForwardGears domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfForwardGears fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_FORWARD_GEARS(value);
	}

}
