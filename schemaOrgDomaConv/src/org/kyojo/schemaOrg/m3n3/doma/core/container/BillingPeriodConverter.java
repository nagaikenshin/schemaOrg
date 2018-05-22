package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BILLING_PERIOD;
import org.kyojo.schemaOrg.m3n3.core.Container.BillingPeriod;

@ExternalDomain
public class BillingPeriodConverter implements DomainConverter<BillingPeriod, String> {

	@Override
	public String fromDomainToValue(BillingPeriod domain) {
		return domain.getNativeValue();
	}

	@Override
	public BillingPeriod fromValueToDomain(String value) {
		return new BILLING_PERIOD(value);
	}

}
