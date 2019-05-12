package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AVAILABLE_DELIVERY_METHOD;
import org.kyojo.schemaorg.m3n5.core.Container.AvailableDeliveryMethod;

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
