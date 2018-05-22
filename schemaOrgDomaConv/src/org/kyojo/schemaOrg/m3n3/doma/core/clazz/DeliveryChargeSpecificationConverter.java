package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DELIVERY_CHARGE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeliveryChargeSpecification;

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
