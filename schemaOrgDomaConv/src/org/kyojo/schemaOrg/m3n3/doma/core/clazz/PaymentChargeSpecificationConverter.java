package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAYMENT_CHARGE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PaymentChargeSpecification;

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
