package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MEDIAN;
import org.kyojo.schemaorg.m3n5.core.Container.Median;

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
