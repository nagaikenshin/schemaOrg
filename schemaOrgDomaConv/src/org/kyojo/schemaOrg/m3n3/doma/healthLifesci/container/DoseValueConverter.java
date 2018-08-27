package org.kyojo.schemaorg.m3n3.doma.healthLifesci.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n3.healthLifesci.impl.DOSE_VALUE;
import org.kyojo.schemaorg.m3n3.healthLifesci.Container.DoseValue;

@ExternalDomain
public class DoseValueConverter implements DomainConverter<DoseValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(DoseValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public DoseValue fromValueToDomain(BigDecimal value) {
		return new DOSE_VALUE(value);
	}

}
