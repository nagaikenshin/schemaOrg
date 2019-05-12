package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DELIVERY_METHOD;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryMethod;

@ExternalDomain
public class DeliveryMethodConverter implements DomainConverter<DeliveryMethod, String> {

	@Override
	public String fromDomainToValue(DeliveryMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeliveryMethod fromValueToDomain(String value) {
		return new DELIVERY_METHOD(value);
	}

}
