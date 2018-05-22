package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MINIMUM_PAYMENT_DUE;
import org.kyojo.schemaOrg.m3n3.core.Container.MinimumPaymentDue;

@ExternalDomain
public class MinimumPaymentDueConverter implements DomainConverter<MinimumPaymentDue, String> {

	@Override
	public String fromDomainToValue(MinimumPaymentDue domain) {
		return domain.getNativeValue();
	}

	@Override
	public MinimumPaymentDue fromValueToDomain(String value) {
		return new MINIMUM_PAYMENT_DUE(value);
	}

}
