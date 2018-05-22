package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MIN_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Container.MinValue;

@ExternalDomain
public class MinValueConverter implements DomainConverter<MinValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(MinValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public MinValue fromValueToDomain(BigDecimal value) {
		return new MIN_VALUE(value);
	}

}
