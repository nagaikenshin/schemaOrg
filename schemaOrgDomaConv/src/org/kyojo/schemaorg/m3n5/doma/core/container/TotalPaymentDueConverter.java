package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TOTAL_PAYMENT_DUE;
import org.kyojo.schemaorg.m3n5.core.Container.TotalPaymentDue;

@ExternalDomain
public class TotalPaymentDueConverter implements DomainConverter<TotalPaymentDue, String> {

	@Override
	public String fromDomainToValue(TotalPaymentDue domain) {
		return domain.getNativeValue();
	}

	@Override
	public TotalPaymentDue fromValueToDomain(String value) {
		return new TOTAL_PAYMENT_DUE(value);
	}

}
