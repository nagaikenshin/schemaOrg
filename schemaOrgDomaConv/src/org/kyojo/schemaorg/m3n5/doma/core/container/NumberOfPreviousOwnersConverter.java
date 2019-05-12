package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUMBER_OF_PREVIOUS_OWNERS;
import org.kyojo.schemaorg.m3n5.core.Container.NumberOfPreviousOwners;

@ExternalDomain
public class NumberOfPreviousOwnersConverter implements DomainConverter<NumberOfPreviousOwners, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfPreviousOwners domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfPreviousOwners fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_PREVIOUS_OWNERS(value);
	}

}
