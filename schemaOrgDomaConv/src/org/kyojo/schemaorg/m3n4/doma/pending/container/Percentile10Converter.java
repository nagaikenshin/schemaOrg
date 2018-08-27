package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.PERCENTILE10;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile10;

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
