package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBERED_POSITION;
import org.kyojo.schemaorg.m3n5.core.Container.NumberedPosition;

@ExternalDomain
public class NumberedPositionConverter implements DomainConverter<NumberedPosition, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberedPosition domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberedPosition fromValueToDomain(BigDecimal value) {
		return new NUMBERED_POSITION(value);
	}

}
