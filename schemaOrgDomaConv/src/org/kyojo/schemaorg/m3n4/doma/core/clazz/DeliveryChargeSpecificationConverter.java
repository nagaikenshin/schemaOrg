package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DELIVERY_CHARGE_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryChargeSpecification;

@ExternalDomain
public class DeliveryChargeSpecificationConverter implements DomainConverter<DeliveryChargeSpecification, String> {

	@Override
	public String fromDomainToValue(DeliveryChargeSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryChargeSpecification fromValueToDomain(String value) {
		return new DELIVERY_CHARGE_SPECIFICATION(value);
	}

}