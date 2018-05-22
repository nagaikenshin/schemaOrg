package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUMBER_OF_AXLES;
import org.kyojo.schemaOrg.m3n3.core.Container.NumberOfAxles;

@ExternalDomain
public class NumberOfAxlesConverter implements DomainConverter<NumberOfAxles, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(NumberOfAxles domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumberOfAxles fromValueToDomain(BigDecimal value) {
		return new NUMBER_OF_AXLES(value);
	}

}