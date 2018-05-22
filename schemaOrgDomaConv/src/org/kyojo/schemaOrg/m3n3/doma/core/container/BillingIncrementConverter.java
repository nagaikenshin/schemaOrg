package org.kyojo.schemaOrg.m3n3.doma.core.container;

import java.math.BigDecimal;
import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BILLING_INCREMENT;
import org.kyojo.schemaOrg.m3n3.core.Container.BillingIncrement;

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
