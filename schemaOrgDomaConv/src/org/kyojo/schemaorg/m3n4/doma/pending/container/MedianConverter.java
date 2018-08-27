package org.kyojo.schemaorg.m3n4.doma.pending.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.MEDIAN;
import org.kyojo.schemaorg.m3n4.pending.Container.Median;

@ExternalDomain
public class MedianConverter implements DomainConverter<Median, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(Median domain) {
		return domain.getNativeValue();
	}

	@Override
	public Median fromValueToDomain(BigDecimal value) {
		return new MEDIAN(value);
	}

}
