package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERCENTILE10;
import org.kyojo.schemaorg.m3n5.core.Container.Percentile10;

@ExternalDomain
public class Percentile10Converter implements DomainConverter<Percentile10, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Percentile10 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Percentile10 fromValueToDomain(BigDecimal value) {
		return new PERCENTILE10(value);
	}

}
