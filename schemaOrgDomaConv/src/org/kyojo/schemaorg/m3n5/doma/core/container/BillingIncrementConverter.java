package org.kyojo.schemaorg.m3n5.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BILLING_INCREMENT;
import org.kyojo.schemaorg.m3n5.core.Container.BillingIncrement;

@ExternalDomain
public class BillingIncrementConverter implements DomainConverter<BillingIncrement, BigDecimal> {

	@Override
	public BigDecimal fromDomainToValue(BillingIncrement domain) {
		return domain.getNativeValue();
	}

	@Override
	public BillingIncrement fromValueToDomain(BigDecimal value) {
		return new BILLING_INCREMENT(value);
	}

}
