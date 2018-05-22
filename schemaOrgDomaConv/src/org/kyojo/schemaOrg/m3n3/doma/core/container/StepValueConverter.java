package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.STEP_VALUE;
import org.kyojo.schemaOrg.m3n3.core.Container.StepValue;

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
