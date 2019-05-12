package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.STEP_VALUE;
import org.kyojo.schemaorg.m3n5.core.Container.StepValue;

@ExternalDomain
public class StepValueConverter implements DomainConverter<StepValue, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(StepValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public StepValue fromValueToDomain(BigDecimal value) {
		return new STEP_VALUE(value);
	}

}
