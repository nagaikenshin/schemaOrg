package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERCENTILE90;
import org.kyojo.schemaorg.m3n5.core.Container.Percentile90;

@ExternalDomain
public class Percentile90Converter implements DomainConverter<Percentile90, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Percentile90 domain) {
		return domain.getNativeValue();
	}

	@Override
	public Percentile90 fromValueToDomain(BigDecimal value) {
		return new PERCENTILE90(value);
	}

}
