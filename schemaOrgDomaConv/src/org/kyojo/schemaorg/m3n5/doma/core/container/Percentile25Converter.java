package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERCENTILE25;
import org.kyojo.schemaorg.m3n5.core.Container.Percentile25;

@ExternalDomain
public class Percentile25Converter implements DomainConverter<Percentile25, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Percentile25 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Percentile25 fromValueToDomain(BigDecimal value) {
		return new PERCENTILE25(value);
	}

}
