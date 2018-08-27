package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PAYMENT_CHARGE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaymentChargeSpecification;

@ExternalDomain
public class PaymentChargeSpecificationConverter implements DomainConverter<PaymentChargeSpecification, String> {

	@Override
	public String fromDomainToValue(PaymentChargeSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaymentChargeSpecification fromValueToDomain(String value) {
		return new PAYMENT_CHARGE_SPECIFICATION(value);
	}

}
