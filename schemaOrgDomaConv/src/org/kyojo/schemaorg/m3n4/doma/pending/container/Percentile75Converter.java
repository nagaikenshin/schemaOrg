package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.PERCENTILE75;
import org.kyojo.schemaorg.m3n4.pending.Container.Percentile75;

@ExternalDomain
public class Percentile75Converter implements DomainConverter<Percentile75, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Percentile75 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Percentile75 fromValueToDomain(BigDecimal value) {
		return new PERCENTILE75(value);
	}

}
