package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.APPLIES_TO_DELIVERY_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.AppliesToDeliveryMethod;

@ExternalDomain
public class AppliesToDeliveryMethodConverter implements DomainConverter<AppliesToDeliveryMethod, String> {

	@Override
	public String fromDomainToValue(AppliesToDeliveryMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public AppliesToDeliveryMethod fromValueToDomain(String value) {
		return new APPLIES_TO_DELIVERY_METHOD(value);
	}

}
