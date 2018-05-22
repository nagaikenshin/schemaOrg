package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_BEDS;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfBeds;

@ExternalDomain
public class NumberOfBedsConverter implements DomainConverter<NumberOfBeds, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfBeds domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfBeds fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_BEDS(value);
	}

}
