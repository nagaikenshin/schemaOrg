package org.kyojo.schemaorg.m3n5.doma.core.deliveryMethod;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.deliveryMethod.ON_SITE_PICKUP;
import org.kyojo.schemaorg.m3n5.core.DeliveryMethod.OnSitePickup;

@ExternalDomain
public class OnSitePickupConverter implements DomainConverter<OnSitePickup, String> {

	@Override
	public String fromDomainToValue(OnSitePickup domain) {
		return domain.getNativeValue();
	}

	@Override
	public OnSitePickup fromValueToDomain(String value) {
		return new ON_SITE_PICKUP(value);
	}

}
