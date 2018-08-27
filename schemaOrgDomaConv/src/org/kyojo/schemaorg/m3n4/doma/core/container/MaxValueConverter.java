package org.kyojo.schemaorg.m3n4.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MAX_VALUE;
import org.kyojo.schemaorg.m3n4.core.Container.MaxValue;

@ExternalDomain
public class MaxValueConverter implements DomainConverter<MaxValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MaxValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaxValue fromValueToDomain(BigDecimal value) {
		return new MAX_VALUE(value);
	}

}
