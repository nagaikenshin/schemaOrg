package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HAS_DELIVERY_METHOD;
import org.kyojo.schemaOrg.m3n3.core.Container.HasDeliveryMethod;

@ExternalDomain
public class HasDeliveryMethodConverter implements DomainConverter<HasDeliveryMethod, String> {

	@Override
	public String fromDomainToValue(HasDeliveryMethod domain) {
		return domain.getNativeValue();
	}

	@Override
	public HasDeliveryMethod fromValueToDomain(String value) {
		return new HAS_DELIVERY_METHOD(value);
	}

}
