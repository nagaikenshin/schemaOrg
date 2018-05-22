package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AVAILABLE_DELIVERY_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.AvailableDeliveryMethod;

@ExternalDomain
public class AvailableDeliveryMethodConverter implements DomainConverter<AvailableDeliveryMethod, String> {

	@Override
	public String fromDomainToValue(AvailableDeliveryMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public AvailableDeliveryMethod fromValueToDomain(String value) {
		return new AVAILABLE_DELIVERY_METHOD(value);
	}

}
